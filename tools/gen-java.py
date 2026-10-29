#!/usr/bin/env python3

import itertools
import os
import re
import sys
import tablint

COMMON_SUBTABLES = (
	('DECODE_EBCDIC_GENERIC', (
		0xFFFE, 0x1, 0x2, 0x3, 0x9C, 0x9, 0x86, 0x7F,
		0x97, 0x8D, 0x8E, 0xB, 0xC, 0xD, 0xE, 0xF,
		0x10, 0x11, 0x12, 0x13, 0x9D, 0x85, 0x8, 0x87,
		0x18, 0x19, 0x92, 0x8F, 0x1C, 0x1D, 0x1E, 0x1F,
		0x80, 0x81, 0x82, 0x83, 0x84, 0xA, 0x17, 0x1B,
		0x88, 0x89, 0x8A, 0x8B, 0x8C, 0x5, 0x6, 0x7,
		0x90, 0x91, 0x16, 0x93, 0x94, 0x95, 0x96, 0x4,
		0x98, 0x99, 0x9A, 0x9B, 0x14, 0x15, 0x9E, 0x1A
	)),
	('DECODE_EBCDIC_UNIX', (
		0xFFFE, 0x1, 0x2, 0x3, 0x9C, 0x9, 0x86, 0x7F,
		0x97, 0x8D, 0x8E, 0xB, 0xC, 0xD, 0xE, 0xF,
		0x10, 0x11, 0x12, 0x13, 0x9D, 0xA, 0x8, 0x87,
		0x18, 0x19, 0x92, 0x8F, 0x1C, 0x1D, 0x1E, 0x1F,
		0x80, 0x81, 0x82, 0x83, 0x84, 0xA, 0x17, 0x1B,
		0x88, 0x89, 0x8A, 0x8B, 0x8C, 0x5, 0x6, 0x7,
		0x90, 0x91, 0x16, 0x93, 0x94, 0x95, 0x96, 0x4,
		0x98, 0x99, 0x9A, 0x9B, 0x14, 0x15, 0x9E, 0x1A
	)),
	('DECODE_ASCII_C0', (
		0xFFFE, 0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x7,
		0x8, 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF,
		0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17,
		0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E, 0x1F
	)),
	('ENCODE_ASCII_C0', (
		0x1, 0x101, 0x201, 0x301, 0x401, 0x501, 0x601, 0x701,
		0x8, 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF,
		0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17,
		0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E, 0x1F
	)),
	('ENCODE_EBCDIC_C0_GENERIC', (
		0x1, 0x101, 0x201, 0x301, 0x37, 0x2D, 0x2E, 0x2F,
		0x16, 0x501, 0x25, 0xB, 0xC, 0xD, 0xE, 0xF,
		0x10, 0x11, 0x12, 0x13, 0x3C, 0x3D, 0x32, 0x26,
		0x18, 0x19, 0x3F, 0x27, 0x1C, 0x1D, 0x1E, 0x1F
	)),
	('ENCODE_EBCDIC_C0_UNIX', (
		0x1, 0x101, 0x201, 0x301, 0x37, 0x2D, 0x2E, 0x2F,
		0x16, 0x501, 0x15, 0xB, 0xC, 0xD, 0xE, 0xF,
		0x10, 0x11, 0x12, 0x13, 0x3C, 0x3D, 0x32, 0x26,
		0x18, 0x19, 0x3F, 0x27, 0x1C, 0x1D, 0x1E, 0x1F
	)),
	('ENCODE_EBCDIC_C1', (
		0x20, 0x21, 0x22, 0x23, 0x24, 0x15, 0x601, 0x17,
		0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x9, 0xA, 0x1B,
		0x30, 0x31, 0x1A, 0x33, 0x34, 0x35, 0x36, 0x8,
		0x38, 0x39, 0x3A, 0x3B, 0x401, 0x14, 0x3E, 0xFF01
	))
)

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

def char_string(cs):
	s = '"'
	for c in cs:
		if c == 8:
			s += '\\b'
		elif c == 9:
			s += '\\t'
		elif c == 10:
			s += '\\n'
		elif c == 12:
			s += '\\f'
		elif c == 13:
			s += '\\r'
		elif c == 34:
			s += '\\"'
		elif c == 39:
			s += '\\\''
		elif c == 92:
			s += '\\\\'
		elif 32 <= c <= 126:
			s += chr(c)
		else:
			s += '\\u%04X' % c
	return s + '"'

class Lookup:
	def write_static_members(self, f):
		pass
	def gen_if_branch(self):
		return None
	def gen_switch_case(self):
		return None

class CommonSubtableLookup(Lookup):
	def __init__(self, min_key, array_size, array_name):
		self.min_key = min_key
		self.max_key = min_key + array_size - 1
		self.array_name = array_name
	def gen_if_branch(self):
		return (
			'if (input >= 0x%X && input <= 0x%X) return CommonSubtables.%s[input - 0x%X];' %
			(self.min_key, self.max_key, self.array_name, self.min_key))

class OffsetLookup(Lookup):
	def __init__(self, min_key, run_length, first_value):
		self.min_key = min_key
		self.max_key = min_key + run_length - 1
		self.first_value = first_value
	def gen_if_branch(self):
		return (
			'if (input >= 0x%X && input <= 0x%X) return input - 0x%X + 0x%X;' %
			(self.min_key, self.max_key, self.min_key, self.first_value))

class SubtableLookup(Lookup):
	def __init__(self, name, min_key, max_key, table):
		self.method_name = '%s_%X' % (name, min_key)
		self.array_name = self.method_name.upper()
		self.min_key = min_key
		self.max_key = max_key
		self.values = tuple(table[k] if k in table else 0 for k in range(min_key, max_key + 1))
		self.max_value = max(self.values)
		self.array_type = 'char' if self.max_value <= 0xFFFF else 'int' if self.max_value <= 0xFFFFFFFF else 'long'
		self.values_per_line = 16
	def write_static_members(self, f):
		f.write('\t\tprivate static final %s[] %s = %s();\n' % (self.array_type, self.array_name, self.method_name))
		f.write('\t\tprivate static final %s[] %s() {\n' % (self.array_type, self.method_name))
		if self.array_type == 'char':
			f.write('\t\t\treturn %s.toCharArray();\n' % char_string(self.values))
		else:
			f.write('\t\t\treturn new %s[] {\n' % self.array_type)
			for i in range(0, len(self.values), self.values_per_line):
				f.write('\t\t\t\t%s,\n' % ', '.join(
					('0' if not v else '0x%XL' % v if self.array_type == 'long' else '0x%X' % v)
					for v in self.values[i : min(i + self.values_per_line, len(self.values))]
				))
			f.write('\t\t\t};\n')
		f.write('\t\t}\n')
	def gen_if_branch(self):
		return (
			'if (input >= 0x%X && input <= 0x%X) return %s[input - 0x%X];' %
			(self.min_key, self.max_key, self.array_name, self.min_key))

class SingleLookup(Lookup):
	def __init__(self, key, value, value_type):
		self.key = key
		self.value = value
		self.value_type = value_type
	def gen_switch_case(self):
		vs = '0x%XL' % self.value if self.value_type == 'long' else '0x%X' % self.value
		return 'case 0x%X: return %s;' % (self.key, vs)

def create_common_subtable_lookup(keys, table):
	for name, values in COMMON_SUBTABLES:
		if all((table[keys[0]+i] if keys[0]+i in table else 0) == values[i] for i in range(0, len(values))):
			return CommonSubtableLookup(keys[0], len(values), name)
	return None

def create_offset_lookup(keys, table, shortest_length=16):
	n = 1
	last_key = keys[0]
	last_value = table[keys[0]]
	while n < len(keys) and keys[n] == last_key + 1 and table[keys[n]] == last_value + 1:
		n += 1
		last_key += 1
		last_value += 1
	return None if n < shortest_length else OffsetLookup(keys[0], n, table[keys[0]])

def create_lookups(name, key_type, value_type, table, smallest_array=16, largest_gap=16, largest_array=4096):
	if_branches = []
	switch_cases = []
	keys = sorted(table)
	def chomp_lookup():
		for lookup_fn in (create_common_subtable_lookup, create_offset_lookup):
			lookup = lookup_fn(keys, table)
			if lookup:
				if_branches.append(lookup)
				while keys and keys[0] <= lookup.max_key:
					keys.pop(0)
				return True
		return False
	while keys:
		if chomp_lookup():
			continue
		min_key = max_key = keys.pop(0)
		subtable = {max_key: table[max_key]}
		while keys and keys[0] <= (max_key + 1 + largest_gap) and len(subtable) < largest_array:
			if chomp_lookup():
				continue
			max_key = keys.pop(0)
			subtable[max_key] = table[max_key]
		if len(subtable) < smallest_array:
			for key in sorted(subtable):
				switch_cases.append(SingleLookup(key, subtable[key], value_type))
		else:
			if_branches.append(SubtableLookup(name, min_key, max_key, subtable))
	return (if_branches, switch_cases)

def write_table_method(f, name, key_type, value_type, if_branches, switch_cases):
	for if_branch in if_branches:
		if_branch.write_static_members(f)
	f.write('\t\tprivate %s %s(%s input) {\n' % (value_type, name, key_type))
	for if_branch in if_branches:
		f.write('\t\t\t%s\n' % if_branch.gen_if_branch())
	if switch_cases:
		f.write('\t\t\tswitch (input) {\n')
		for switch_case in switch_cases:
			f.write('\t\t\t%s\n' % switch_case.gen_switch_case())
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

REPLACEMENT_CHAR_CANDIDATES = [
	0xFFFD, # REPLACEMENT CHARACTER
	0x003F, # QUESTION MARK
	0xFF1F, # FULLWIDTH QUESTION MARK
	0x00BF, # INVERTED QUESTION MARK
	0x061F, # ARABIC QUESTION MARK
	0x2E2E, # REVERSED QUESTION MARK
	0x2753, # BLACK QUESTION MARK ORNAMENT
	0x2754, # WHITE QUESTION MARK ORNAMENT
	0x002A, # ASTERISK
	0xFF0A, # FULLWIDTH ASTERISK
	0x2217, # ASTERISK OPERATOR
	0x2731, # HEAVY ASTERISK
	0x0058, # LATIN CAPITAL LETTER X
	0xFF38, # FULLWIDTH LATIN CAPITAL LETTER X
	0x00A0, # NO-BREAK SPACE
	0x0020, # SPACE
]

REPLACEMENT_BYTE_CANDIDATES = [
	0xFF, 0x7F, 0x3F, 0xBF, 0x00, 0x80, 0x40, 0xC0,
	0x1F, 0x5F, 0x9F, 0xDF, 0x20, 0x60, 0xA0, 0xE0,
	0x0F, 0x2F, 0x4F, 0x6F, 0x8F, 0xAF, 0xCF, 0xEF,
	0x10, 0x30, 0x50, 0x70, 0x90, 0xB0, 0xD0, 0xF0,
]

def find_encoder_replacement(bytes_to_chars, chars_to_bytes):
	for rcc in REPLACEMENT_CHAR_CANDIDATES:
		if (rcc,) in chars_to_bytes:
			return chars_to_bytes[(rcc,)]
		if (rcc,rcc) in chars_to_bytes:
			return chars_to_bytes[(rcc,rcc)]
	for rbc in REPLACEMENT_BYTE_CANDIDATES:
		if (rbc,) in bytes_to_chars:
			return (rbc,)
		if (rbc,rbc) in bytes_to_chars:
			return (rbc,rbc)
	for i in reversed(sorted(bytes_to_chars)):
		return i

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
		self.encoder_replacement = find_encoder_replacement(bytes_to_chars, chars_to_bytes)
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

	def create_lookups(self):
		self.decoder_state_lookups = {}
		for state in sorted(set(k[0] for k in self.decoder_state_table)):
			table = {k[1]: self.decoder_state_table[k] for k in self.decoder_state_table if k[0] == state}
			self.decoder_state_lookups[state] = create_lookups('getNextState%d' % state, 'int', 'int', table)
		self.decoder_output_lookups = {}
		for state in sorted(set(k[0] for k in self.decoder_output_table)):
			table = {k[1]: self.decoder_output_table[k] for k in self.decoder_output_table if k[0] == state}
			self.decoder_output_lookups[state] = create_lookups('getOutput%d' % state, 'int', 'long', table)
		self.encoder_state_lookups = {}
		for state in sorted(set(k[0] for k in self.encoder_state_table)):
			table = {k[1]: self.encoder_state_table[k] for k in self.encoder_state_table if k[0] == state}
			self.encoder_state_lookups[state] = create_lookups('getNextState%d' % state, 'int', 'int', table)
		self.encoder_output_lookups = {}
		for state in sorted(set(k[0] for k in self.encoder_output_table)):
			table = {k[1]: self.encoder_output_table[k] for k in self.encoder_output_table if k[0] == state}
			self.encoder_output_lookups[state] = create_lookups('getOutput%d' % state, 'int', 'long', table)

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
			states = sorted(self.decoder_state_lookups)
			for state in states:
				write_table_method(f, 'getNextState%d' % state, 'int', 'int', *self.decoder_state_lookups[state])
			write_state_method(f, 'getNextState', 'int', 'int', 'int', states)
			states = sorted(self.decoder_output_lookups)
			for state in states:
				write_table_method(f, 'getOutput%d' % state, 'int', 'long', *self.decoder_output_lookups[state])
			write_state_method(f, 'getOutput', 'int', 'int', 'long', states)
			if self.decoder_long_output_table:
				f.write('\t\tprivate static final char[][] GETLONGOUTPUT = getLongOutput();\n')
				f.write('\t\tprivate static final char[][] getLongOutput() {\n')
				f.write('\t\t\treturn new char[][] {\n')
				for key in sorted(self.decoder_long_output_table):
					f.write('\t\t\t\t%s.toCharArray(),\n' % char_string(self.decoder_long_output_table[key]))
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
			states = sorted(self.encoder_state_lookups)
			for state in states:
				write_table_method(f, 'getNextState%d' % state, 'int', 'int', *self.encoder_state_lookups[state])
			write_state_method(f, 'getNextState', 'int', 'int', 'int', states)
			states = sorted(self.encoder_output_lookups)
			for state in states:
				write_table_method(f, 'getOutput%d' % state, 'int', 'long', *self.encoder_output_lookups[state])
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

	def create_lookups(self, min_uses=2):
		print('Generating lookups...')
		for cs in self.charsets:
			self.charsets[cs].create_lookups()
		print('Generating common subtables...')
		histogram = {}
		for cs in self.charsets:
			for lookup in (
				self.charsets[cs].decoder_state_lookups, self.charsets[cs].decoder_output_lookups,
				self.charsets[cs].encoder_state_lookups, self.charsets[cs].encoder_output_lookups):
				for state in lookup:
					if_branches, switch_cases = lookup[state]
					for if_branch in if_branches:
						if isinstance(if_branch, SubtableLookup):
							if if_branch.values in histogram:
								histogram[if_branch.values] += 1
							else:
								histogram[if_branch.values] = 1
		self.common_subtables = []
		common_subtable_keys = {}
		for values in histogram:
			if histogram[values] >= min_uses:
				name = 'common%d' % len(self.common_subtables)
				self.common_subtables.append((name, values))
				common_subtable_keys[values] = name
		print('Optimizing lookups...')
		for cs in self.charsets:
			for lookup in (
				self.charsets[cs].decoder_state_lookups, self.charsets[cs].decoder_output_lookups,
				self.charsets[cs].encoder_state_lookups, self.charsets[cs].encoder_output_lookups):
				for state in lookup:
					if_branches, switch_cases = lookup[state]
					for i in range(0, len(if_branches)):
						if isinstance(if_branches[i], SubtableLookup):
							if if_branches[i].values in common_subtable_keys:
								min_key = if_branches[i].min_key
								size = len(if_branches[i].values)
								name = common_subtable_keys[if_branches[i].values].upper()
								if_branches[i] = CommonSubtableLookup(min_key, size, name)

	def write_common_subtables_class(self, out_file, values_per_line=16):
		print('Writing common subtables to %s...' % os.path.basename(out_file))
		with open(out_file, 'w') as f:
			f.write('package com.kreative.charset.generated;\n\n')
			f.write('class CommonSubtables {\n')
			for name, arr in itertools.chain(COMMON_SUBTABLES, self.common_subtables):
				max_value = max(arr)
				array_type = 'char' if max_value <= 0xFFFF else 'int' if max_value <= 0xFFFFFFFF else 'long'
				f.write('\tstatic final %s[] %s = %s();\n' % (array_type, name.upper(), name.lower()))
				f.write('\tprivate static final %s[] %s() {\n' % (array_type, name.lower()))
				if array_type == 'char':
					f.write('\t\treturn %s.toCharArray();\n' % char_string(arr))
				else:
					f.write('\t\treturn new %s[] {\n' % array_type)
					for i in range(0, len(arr), values_per_line):
						f.write('\t\t\t%s,\n' % ', '.join(
							('0' if not arr[k] else '0x%XL' % arr[k] if array_type == 'long' else '0x%X' % arr[k])
							for k in range(i, min(i + values_per_line, len(arr)))
						))
					f.write('\t\t};\n')
				f.write('\t}\n')
			f.write('}\n')

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
		out_file = os.path.join(out_dir, 'CommonSubtables.java')
		self.write_common_subtables_class(out_file)
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
		gen.create_lookups()
		gen.write_classes(out_dir)
	return ok

if __name__ == '__main__':
	if not main():
		sys.exit(1)
