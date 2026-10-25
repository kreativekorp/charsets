#!/usr/bin/env python3

import os
import re
import sys
import tablint

def byte_output(bs):
	need_count = (0 < (bs[0] & 0xFF) < 8)
	output = 0
	for b in reversed(bs):
		b &= 0xFF
		output <<= 8
		output |= b
		if b == 0x00 or b == 0xFF:
			need_count = True
	if need_count:
		output <<= 8
		output |= len(bs)
	return output

def char_output(cs, long_output):
	cs = char_input(cs)
	if len(cs) > 4:
		key = len(long_output)
		long_output[key] = cs
		return 0xDC00 | key
	output = 0
	for c in reversed(cs):
		output <<= 16
		if c == 0x0000:
			output |= 0xFFFE
		elif c <= 0xFFFD:
			output |= c
		else:
			raise ValueError(c)
	return output

def char_input(cs):
	input = []
	for c in cs:
		if c < 0:
			raise ValueError(c)
		elif c <= 0xFFFF:
			input.append(c)
		elif c <= 0x10FFFF:
			input.append(0xD800 | (((c >> 10) - 64) & 0x3FF))
			input.append(0xDC00 | (c & 0x3FF))
		else:
			raise ValueError(c)
	return tuple(input)

def write_table_array(f, name, min_key, max_key, table, values_per_line=16):
	max_value = max(table[k] for k in table if min_key <= k <= max_key)
	array_type = 'char' if max_value <= 0xFFFF else 'int' if max_value <= 0xFFFFFFFF else 'long'
	f.write('\t\tprivate static final %s[] %s = %s();\n' % (array_type, name.upper(), name))
	f.write('\t\tprivate static final %s[] %s() {\n' % (array_type, name))
	f.write('\t\t\treturn new %s[] {\n' % array_type)
	for i in range(0, max_key - min_key + 1, values_per_line):
		f.write('\t\t\t\t%s,\n' % ', '.join(
			('0' if k not in table else '0x%XL' % table[k] if array_type == 'long' else '0x%X' % table[k])
			for k in range(min_key + i, min(min_key + i + values_per_line, max_key + 1))
		))
	f.write('\t\t\t};\n')
	f.write('\t\t}\n')

def write_table_method(f, name, key_type, value_type, table, smallest_array=16, largest_gap=16, largest_array=4096):
	array_cases = []
	switch_cases = []
	keys = sorted(table)
	while keys:
		min_key = max_key = keys.pop(0)
		subtable = {max_key: table[max_key]}
		while keys and keys[0] <= (max_key + 1 + largest_gap) and len(subtable) < largest_array:
			max_key = keys.pop(0)
			subtable[max_key] = table[max_key]
		if len(subtable) < smallest_array:
			for key in sorted(subtable):
				value = '0x%XL' % table[key] if value_type == 'long' else '0x%X' % table[key]
				switch_cases.append('case 0x%X: return %s;' % (key, value))
		else:
			array_name = '%s_%X' % (name, min_key)
			write_table_array(f, array_name, min_key, max_key, subtable)
			array_cases.append(
				'if (input >= 0x%X && input <= 0x%X) return %s[input - 0x%X];' %
				(min_key, max_key, array_name.upper(), min_key)
			)
	f.write('\t\tprivate %s %s(%s input) {\n' % (value_type, name, key_type))
	for array_case in array_cases:
		f.write('\t\t\t%s\n' % array_case)
	if switch_cases:
		f.write('\t\t\tswitch (input) {\n')
		for switch_case in switch_cases:
			f.write('\t\t\t%s\n' % switch_case)
		f.write('\t\t\t}\n')
	f.write('\t\t\treturn 0;\n')
	f.write('\t\t}\n')

def write_state_method(f, name, state_type, key_type, value_type, states):
	if not states:
		f.write('\t\tprotected %s %s(%s state, %s input) {\n' % (value_type, name, state_type, key_type))
		f.write('\t\t\treturn 0;\n')
		f.write('\t\t}\n')
	else:
		f.write('\t\tprotected %s %s(%s state, %s input) {\n' % (value_type, name, state_type, key_type))
		f.write('\t\t\tswitch (state) {\n')
		for state in states:
			f.write('\t\t\tcase %d: return %s%d(input);\n' % (state, name, state))
		f.write('\t\t\tdefault: return 0;\n')
		f.write('\t\t\t}\n')
		f.write('\t\t}\n')

class JavaTableCharset:
	def __init__(self, bytes_to_chars, chars_to_bytes, name, *aliases):
		# Decoder Data
		self.avg_chars_per_byte = 0
		self.max_chars_per_byte = 0
		self.decoder_state_table = {}
		self.decoder_output_table = {}
		self.decoder_long_output_table = {}
		self.decoder_max_bytes = 0
		for bs in bytes_to_chars:
			cs = char_input(bytes_to_chars[bs])
			output = char_output(bytes_to_chars[bs], self.decoder_long_output_table)
			state = 0
			for b in bs[0:-1]:
				key = (state, b & 0xFF)
				if key in self.decoder_state_table:
					state = self.decoder_state_table[key]
				else:
					state = len(self.decoder_state_table) + 1
					self.decoder_state_table[key] = state
			key = (state, bs[-1] & 0xFF)
			self.decoder_output_table[key] = output
			chars_per_byte = len(cs) / len(bs)
			self.avg_chars_per_byte += chars_per_byte
			self.max_chars_per_byte = max(chars_per_byte, self.max_chars_per_byte)
			self.decoder_max_bytes = max(len(bs), self.decoder_max_bytes)
		self.avg_chars_per_byte /= len(bytes_to_chars)
		# Encoder Data
		self.avg_bytes_per_char = 0
		self.max_bytes_per_char = 0
		self.encoder_replacement = (
			chars_to_bytes[(0xFFFD,)] if (0xFFFD,) in chars_to_bytes else
			chars_to_bytes[(0x003F,)] if (0x003F,) in chars_to_bytes else
			chars_to_bytes[(0xFF1F,)] if (0xFF1F,) in chars_to_bytes else
			chars_to_bytes[(0x00BF,)] if (0x00BF,) in chars_to_bytes else
			chars_to_bytes[(0x0020,)] if (0x0020,) in chars_to_bytes else
			(0xFF,) if (0xFF,) in bytes_to_chars else
			(0x7F,) if (0x7F,) in bytes_to_chars else
			(0x3F,) if (0x3F,) in bytes_to_chars else
			(0x1F,) if (0x1F,) in bytes_to_chars else
			(0x0F,) if (0x0F,) in bytes_to_chars else
			(0x07,) if (0x07,) in bytes_to_chars else
			(0x03,) if (0x03,) in bytes_to_chars else
			(0x01,) if (0x01,) in bytes_to_chars else
			(0x00,))
		self.encoder_state_table = {}
		self.encoder_output_table = {}
		self.encoder_max_chars = 0
		for cs in chars_to_bytes:
			bs = chars_to_bytes[cs]
			cs = char_input(cs)
			output = byte_output(bs)
			state = 0
			for c in cs[0:-1]:
				key = (state, c & 0xFFFF)
				if key in self.encoder_state_table:
					state = self.encoder_state_table[key]
				else:
					state = len(self.encoder_state_table) + 1
					self.encoder_state_table[key] = state
			key = (state, cs[-1] & 0xFFFF)
			self.encoder_output_table[key] = output
			bytes_per_char = len(bs) / len(cs)
			self.avg_bytes_per_char += bytes_per_char
			self.max_bytes_per_char = max(bytes_per_char, self.max_bytes_per_char)
			self.encoder_max_chars = max(len(cs), self.encoder_max_chars)
		self.avg_bytes_per_char /= len(chars_to_bytes)
		# Names
		self.name = name
		self.aliases = []
		for alias in aliases:
			self.add_name(alias)
		jid = ''.join((s[0].upper() + s[1:]) for s in re.split('[^A-Za-z0-9]+', name))
		self.filename = jid + 'Charset.java'
		self.classname = jid + 'Charset'

	def add_name(self, name):
		if name != self.name and name not in self.aliases:
			self.aliases.append(name)

	def write_class(self, out_file):
		print('Writing %s to %s...' % (self.name, os.path.basename(out_file)))
		with open(out_file, 'w') as f:
			# Imports
			f.write('package com.kreative.charset.generated;\n\n')
			f.write('import com.kreative.charset.TableCharsetDecoder;\n')
			f.write('import com.kreative.charset.TableCharsetEncoder;\n')
			f.write('import java.nio.charset.Charset;\n\n')
			# Open
			f.write('public class %s extends Charset {\n' % self.classname)
			# Names
			f.write('\tpublic %s() {\n' % self.classname)
			f.write('\t\tsuper("%s", new String[]{%s});\n' % (self.name, ', '.join('"%s"' % a for a in self.aliases)))
			f.write('\t}\n\n')
			# Contains
			f.write('\tpublic boolean contains(Charset cs) {\n')
			f.write('\t\treturn false;\n')
			f.write('\t}\n\n')
			f.write('\tpublic TableCharsetDecoder newDecoder() {\n')
			f.write('\t\treturn new %sDecoder(this);\n' % self.classname)
			f.write('\t}\n\n')
			f.write('\tpublic TableCharsetEncoder newEncoder() {\n')
			f.write('\t\treturn new %sEncoder(this);\n' % self.classname)
			f.write('\t}\n\n')
			# Decoder
			f.write('\tprivate static final class %sDecoder extends TableCharsetDecoder {\n' % self.classname)
			f.write('\t\tprivate %sDecoder(Charset cs) {\n' % self.classname)
			f.write('\t\t\tsuper(cs, %gf, %gf, %d);\n' % (
				max(self.avg_chars_per_byte, 1),
				max(self.max_chars_per_byte, 1),
				self.decoder_max_bytes
			))
			f.write('\t\t}\n')
			states = sorted(set(k[0] for k in self.decoder_state_table))
			for state in states:
				table = {k[1]: self.decoder_state_table[k] for k in self.decoder_state_table if k[0] == state}
				write_table_method(f, 'getNextState%d' % state, 'int', 'int', table)
			write_state_method(f, 'getNextState', 'int', 'int', 'int', states)
			states = sorted(set(k[0] for k in self.decoder_output_table))
			for state in states:
				table = {k[1]: self.decoder_output_table[k] for k in self.decoder_output_table if k[0] == state}
				write_table_method(f, 'getOutput%d' % state, 'int', 'long', table)
			write_state_method(f, 'getOutput', 'int', 'int', 'long', states)
			if self.decoder_long_output_table:
				f.write('\t\tprivate static final char[][] GETLONGOUTPUT = getLongOutput();\n')
				f.write('\t\tprivate static final char[][] getLongOutput() {\n')
				f.write('\t\t\treturn new char[][] {\n')
				for key in sorted(self.decoder_long_output_table):
					value = ','.join('0x%X' % c for c in self.decoder_long_output_table[key])
					f.write('\t\t\t\t{%s},\n' % value)
				f.write('\t\t\t};\n')
				f.write('\t\t}\n')
				f.write('\t\tprotected char[] getLongOutput(int output) {\n')
				f.write('\t\t\treturn GETLONGOUTPUT[output];\n')
				f.write('\t\t}\n')
			f.write('\t}\n\n')
			# Encoder
			f.write('\tprivate static final class %sEncoder extends TableCharsetEncoder {\n' % self.classname)
			f.write('\t\tprivate %sEncoder(Charset cs) {\n' % self.classname)
			f.write('\t\t\tsuper(cs, %gf, %gf, new byte[]{%s}, %d);\n' % (
				max(self.avg_bytes_per_char, 1),
				max(self.max_bytes_per_char, 1),
				','.join(str(b if b < 128 else b - 256) for b in self.encoder_replacement),
				self.encoder_max_chars
			))
			f.write('\t\t}\n')
			states = sorted(set(k[0] for k in self.encoder_state_table))
			for state in states:
				table = {k[1]: self.encoder_state_table[k] for k in self.encoder_state_table if k[0] == state}
				write_table_method(f, 'getNextState%d' % state, 'int', 'int', table)
			write_state_method(f, 'getNextState', 'int', 'int', 'int', states)
			states = sorted(set(k[0] for k in self.encoder_output_table))
			for state in states:
				table = {k[1]: self.encoder_output_table[k] for k in self.encoder_output_table if k[0] == state}
				write_table_method(f, 'getOutput%d' % state, 'int', 'long', table)
			write_state_method(f, 'getOutput', 'int', 'int', 'long', states)
			f.write('\t}\n')
			# Close
			f.write('}\n')

class JavaGenerator:
	def __init__(self):
		self.charsets = {}
		self.add_charset_fn = lambda n, cn, b2c, c2b: self.add_charset(n, cn, b2c, c2b)

	def add_charset(self, name, canonical_name, bytes_to_chars, chars_to_bytes):
		if canonical_name in self.charsets:
			self.charsets[canonical_name].add_name(name)
		else:
			cs = JavaTableCharset(bytes_to_chars, chars_to_bytes, canonical_name, name)
			self.charsets[canonical_name] = cs

	def write_provider_class(self, out_file):
		print('Writing table of contents to %s...' % os.path.basename(out_file))
		with open(out_file, 'w') as f:
			f.write('package com.kreative.charset.generated;\n\n')
			f.write('import com.kreative.charset.AbstractCharsetProvider;\n\n')
			f.write('public class GeneratedCharsetProvider extends AbstractCharsetProvider {\n')
			f.write('\tpublic GeneratedCharsetProvider() {\n')
			f.write('\t\tsuper(')
			first = True
			for cs in sorted(self.charsets):
				f.write('\n\t\t\t' if first else ',\n\t\t\t')
				f.write('new %s()' % self.charsets[cs].classname)
				first = False
			f.write('\n\t\t);\n')
			f.write('\t}\n')
			f.write('}\n')

	def write_classes(self, out_dir):
		out_dir = os.path.join(out_dir, 'com', 'kreative', 'charset', 'generated')
		os.makedirs(out_dir, exist_ok=True)
		for cs in self.charsets:
			out_file = os.path.join(out_dir, self.charsets[cs].filename)
			self.charsets[cs].write_class(out_file)
		out_file = os.path.join(out_dir, 'GeneratedCharsetProvider.java')
		self.write_provider_class(out_file)

def main():
	gen = JavaGenerator()
	tools = os.path.dirname(os.path.realpath(__file__))
	out_dir = os.path.join(tools, '..', 'java', 'Charsets', 'src')
	args = sys.argv[1:]
	if args:
		parse_opts = True
		ok = True
		while args:
			arg = args.pop(0)
			if parse_opts and arg.startswith('-'):
				if arg == '--':
					parse_opts = False
				elif arg == '-o' and args:
					out_dir = args.pop(0)
				else:
					print('%s Unknown option: %s' % (tablint.ERROR, arg))
					ok = False
			elif not tablint.lint(arg, True, then_call=gen.add_charset_fn):
				ok = False
	else:
		tables = os.path.join(tools, '..', 'tables')
		ok = tablint.lint(tables, True, then_call=gen.add_charset_fn)
	if ok:
		print(tablint.ALL_OK)
		gen.write_classes(out_dir)
	return ok

if __name__ == '__main__':
	if not main():
		sys.exit(1)
