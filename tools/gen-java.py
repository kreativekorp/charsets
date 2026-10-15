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

def char_output(cs):
	output = 0
	for c in reversed(cs):
		output <<= 16
		if c < 0:
			raise ValueError(c)
		elif c == 0x0000:
			output |= 0xFFFE
		elif c <= 0xFFFD:
			output |= c
		elif c <= 0xFFFF:
			raise ValueError(c)
		elif c <= 0x10FFFF:
			output |= 0xDC00
			output |= c & 0x3FF
			c >>= 10
			c -= 64
			output <<= 16
			output |= 0xD800
			output |= c & 0x3FF
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

class JavaTableCharset:
	def __init__(self, bytes_to_chars, chars_to_bytes, name, *aliases):
		# Decoder Data
		self.avg_chars_per_byte = 0
		self.max_chars_per_byte = 0
		self.decoder_state_table = {}
		self.decoder_output_table = {}
		self.decoder_max_bytes = 0
		for bs in bytes_to_chars:
			cs = char_input(bytes_to_chars[bs])
			output = char_output(bytes_to_chars[bs])
			state = 0
			for b in bs[0:-1]:
				key = (state << 8) | (b & 0xFF)
				if key in self.decoder_state_table:
					state = self.decoder_state_table[key]
				else:
					state = len(self.decoder_state_table) + 1
					self.decoder_state_table[key] = state
			key = (state << 8) | (bs[-1] & 0xFF)
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
			(0x3F,))
		self.encoder_state_table = {}
		self.encoder_output_table = {}
		self.encoder_max_chars = 0
		for cs in chars_to_bytes:
			bs = chars_to_bytes[cs]
			cs = char_input(cs)
			output = byte_output(bs)
			state = 0
			for c in cs[0:-1]:
				key = (state << 16) | (c & 0xFFFF)
				if key in self.encoder_state_table:
					state = self.encoder_state_table[key]
				else:
					state = len(self.encoder_state_table) + 1
					self.encoder_state_table[key] = state
			key = (state << 16) | (cs[-1] & 0xFFFF)
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
			f.write('import com.kreative.charset.TableCharset;\n\n')
			# Open
			f.write('public class %s extends TableCharset {\n' % self.classname)
			f.write('\tpublic %s() {\n' % self.classname)
			f.write('\t\tsuper(\n')
			# Decoder Data
			f.write('\t\t\t%gf,\n' % self.avg_chars_per_byte)
			f.write('\t\t\t%gf,\n' % self.max_chars_per_byte)
			f.write('\t\t\t%d,\n' % len(self.decoder_state_table))
			f.write('\t\t\tnew int[]{%s},\n' % ','.join('0x%X' % i for i in sorted(self.decoder_state_table)))
			f.write('\t\t\tnew int[]{%s},\n' % ','.join('0x%X' % self.decoder_state_table[i] for i in sorted(self.decoder_state_table)))
			f.write('\t\t\t%d,\n' % len(self.decoder_output_table))
			f.write('\t\t\tnew int[]{%s},\n' % ','.join('0x%X' % i for i in sorted(self.decoder_output_table)))
			f.write('\t\t\tnew long[]{%s},\n' % ','.join('0x%XL' % self.decoder_output_table[i] for i in sorted(self.decoder_output_table)))
			f.write('\t\t\t%d,\n' % self.decoder_max_bytes)
			# Encoder Data
			f.write('\t\t\t%gf,\n' % self.avg_bytes_per_char)
			f.write('\t\t\t%gf,\n' % self.max_bytes_per_char)
			f.write('\t\t\tnew byte[]{%s},\n' % ','.join(str(b if b < 128 else b - 256) for b in self.encoder_replacement))
			f.write('\t\t\t%d,\n' % len(self.encoder_state_table))
			f.write('\t\t\tnew int[]{%s},\n' % ','.join('0x%X' % i for i in sorted(self.encoder_state_table)))
			f.write('\t\t\tnew int[]{%s},\n' % ','.join('0x%X' % self.encoder_state_table[i] for i in sorted(self.encoder_state_table)))
			f.write('\t\t\t%d,\n' % len(self.encoder_output_table))
			f.write('\t\t\tnew int[]{%s},\n' % ','.join('0x%X' % i for i in sorted(self.encoder_output_table)))
			f.write('\t\t\tnew long[]{%s},\n' % ','.join('0x%XL' % self.encoder_output_table[i] for i in sorted(self.encoder_output_table)))
			f.write('\t\t\t%d,\n' % self.encoder_max_chars)
			# Names
			f.write('\t\t\t"%s"' % self.name)
			for alias in self.aliases:
				f.write(',\n\t\t\t"%s"' % alias)
			f.write('\n')
			# Close
			f.write('\t\t);\n')
			f.write('\t}\n')
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
