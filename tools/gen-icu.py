#!/usr/bin/env python3

import math
import os
import sys
import tablint

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

def find_subchar(bytes_to_chars, chars_to_bytes):
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

def get_multi(dictionary, default, *keys):
	for key in keys:
		if key in dictionary:
			return dictionary[key]
	return default

def family_fingerprint(chars_to_bytes):
	fp  = (get_multi(chars_to_bytes, (-1,), (0x30,), (0xFF10,), (0x660,), (0x6F0,))[-1] & 15) << 28
	fp |= (get_multi(chars_to_bytes, (-1,), (0x39,), (0xFF19,), (0x669,), (0x6F9,))[-1] & 15) << 24
	fp |= (get_multi(chars_to_bytes, (-1,), (0x41,), (0xFF21,), (0x391,), (0x410,))[-1] & 15) << 20
	fp |= (get_multi(chars_to_bytes, (-1,), (0x49,), (0xFF29,), (0x399,), (0x418,))[-1] & 15) << 16
	fp |= (get_multi(chars_to_bytes, (-1,), (0x4A,), (0xFF2A,), (0x3D1,), (0x419,))[-1] & 15) << 12
	fp |= (get_multi(chars_to_bytes, (-1,), (0x52,), (0xFF32,), (0x3A1,), (0x420,))[-1] & 15) <<  8
	fp |= (get_multi(chars_to_bytes, (-1,), (0x53,), (0xFF33,), (0x3A3,), (0x421,))[-1] & 15) <<  4
	fp |= (get_multi(chars_to_bytes, (-1,), (0x5A,), (0xFF3A,), (0x396,), (0x417,))[-1] & 15) <<  0
	return fp

def get_action(state_table, output_table, state, input):
	if (state,input) in state_table:
		return ':%x' % state_table[(state,input)]
	if (state,input) in output_table:
		return '.p' if any(cp > 0xFFFF for cp in output_table[(state,input)]) else ''
	return '.u' if any((state,i) in output_table for i in range(256)) else '.i'

class IcuTableCharset:
	def __init__(self, bytes_to_chars, chars_to_bytes, name, *aliases):
		# Character Map
		self.charmap = {}
		self.decoder_state_table = {}
		self.decoder_output_table = {}
		self.decoder_max_state = 0
		self.min_bytes_per_char = None
		self.max_bytes_per_char = None
		self.uconv_class = 'SBCS'
		for bs in bytes_to_chars:
			cs = bytes_to_chars[bs]
			self.charmap[(cs,bs)] = 0 if (cs,bs) in self.charmap else 3
			state = 0
			for b in bs[0:-1]:
				key = (state, b & 0xFF)
				if key in self.decoder_state_table:
					state = self.decoder_state_table[key]
				else:
					state = self.decoder_max_state + 1
					self.decoder_max_state = state
					self.decoder_state_table[key] = state
			key = (state, bs[-1] & 0xFF)
			self.decoder_output_table[key] = cs
			bytes_per_char = len(bs) / len(cs)
			if self.min_bytes_per_char is None or bytes_per_char < self.min_bytes_per_char:
				self.min_bytes_per_char = bytes_per_char
			if self.max_bytes_per_char is None or bytes_per_char > self.max_bytes_per_char:
				self.max_bytes_per_char = bytes_per_char
			if len(bs) != 1:
				self.uconv_class = 'MBCS'
		for cs in chars_to_bytes:
			bs = chars_to_bytes[cs]
			self.charmap[(cs,bs)] = 0 if (cs,bs) in self.charmap else 4
			bytes_per_char = len(bs) / len(cs)
			if self.min_bytes_per_char is None or bytes_per_char < self.min_bytes_per_char:
				self.min_bytes_per_char = bytes_per_char
			if self.max_bytes_per_char is None or bytes_per_char > self.max_bytes_per_char:
				self.max_bytes_per_char = bytes_per_char
			if len(bs) != 1:
				self.uconv_class = 'MBCS'
		# Names
		self.name = name
		self.aliases = []
		for alias in aliases:
			self.add_name(alias)
		# Header Data
		self.subchar = find_subchar(bytes_to_chars, chars_to_bytes)
		self.family_fingerprint = family_fingerprint(chars_to_bytes)
		self.family = self.get_family()

	def add_name(self, name):
		if name != self.name and name not in self.aliases:
			self.aliases.append(name)

	def get_family(self):
		if self.family_fingerprint in (0x0919A23A, 0xFF19A23A):
			return 'ASCII'
		if self.family_fingerprint in (0x09191929, 0xFF191929):
			return 'EBCDIC'
		if self.family_fingerprint == 0x096EF78F:
			return 'FIELDATA'
		if self.family_fingerprint in (0x6836BA51, 0x68FFFFFF, 0xFF36BA51):
			return 'ITA2'
		if self.family_fingerprint == 0xC56EF78F:
			return 'ZX8X'
		if self.name.startswith('x-Mac'):
			return 'ASCII'
		if self.name.startswith('x-adobe-'):
			return 'ASCII'
		if self.name.startswith('x-bcd-'):
			return 'BCD'
		if self.name.startswith('x-ets-300-706-'):
			return 'ASCII'
		if self.name.startswith('x-hp-1816-'):
			return 'ASCII'
		if self.name.startswith('x-jis-x-'):
			return 'ASCII'
		if self.name.startswith('x-kk-voynich-'):
			return 'ASCII'
		return 'UNKNOWN'

	def write_ucm(self, out_file):
		print('Writing %s to %s...' % (self.name, os.path.basename(out_file)))
		with open(out_file, 'w') as f:
			f.write('<code_set_name>\t"%s"\n' % self.name)
			f.write('<char_name_mask>\t"AXXXX"\n')
			f.write('<mb_cur_min>\t%d\n' % max(1, math.floor(self.min_bytes_per_char)))
			f.write('<mb_cur_max>\t%d\n' % max(1, math.ceil(self.max_bytes_per_char)))
			f.write('<uconv_class>\t"%s"\n' % self.uconv_class)
			f.write('<subchar>\t%s\n' % ''.join('\\x%02X' % b for b in self.subchar))
			for state in range(self.decoder_max_state + 1):
				entries = []
				columns = [
					get_action(self.decoder_state_table, self.decoder_output_table, state, i)
					for i in range(256)
				]
				column_index = 0
				while columns:
					range_min = column_index
					range_max = column_index
					column = columns.pop(0)
					column_index += 1
					while columns and columns[0] == column:
						range_max = column_index
						columns.pop(0)
						column_index += 1
					if range_min == range_max:
						entries.append('%x%s' % (range_min, column))
					else:
						entries.append('%x-%x%s' % (range_min, range_max, column))
				f.write('<icu:state>\t%s\n' % ', '.join(entries))
			f.write('<icu:charsetFamily>\t"%s"\n' % self.family)
			for alias in self.aliases:
				f.write('<icu:alias>\t"%s"\n' % alias)
			f.write('\nCHARMAP\n')
			for cs, bs in sorted(self.charmap):
				f.write('%s\t%s\t|%d\n' % (
					''.join('<U%04X>' % c for c in cs),
					''.join('\\x%02X' % b for b in bs),
					self.charmap[(cs,bs)]
				))
			f.write('END CHARMAP\n')

class IcuGenerator:
	def __init__(self):
		self.charsets = {}
		self.add_charset_fn = lambda n, cn, b2c, c2b: self.add_charset(n, cn, b2c, c2b)

	def add_charset(self, name, canonical_name, bytes_to_chars, chars_to_bytes):
		if canonical_name in self.charsets:
			self.charsets[canonical_name].add_name(name)
		else:
			cs = IcuTableCharset(bytes_to_chars, chars_to_bytes, canonical_name, name)
			self.charsets[canonical_name] = cs

	def write_ucms(self, out_dir):
		os.makedirs(out_dir, exist_ok=True)
		for cs in self.charsets:
			cs = self.charsets[cs]
			if cs.decoder_max_state >= 128:
				print('%s Cannot create character map for %s because ICU cannot handle more than 128 states and %s contains %d states.' % (tablint.WARN, cs.name, cs.name, cs.decoder_max_state + 1))
				continue
			if set.intersection(set(cs.decoder_state_table), set(cs.decoder_output_table)):
				print('%s Cannot create character map for %s because ICU cannot handle valid byte sequences starting with other valid byte sequences.' % (tablint.WARN, cs.name))
				continue
			extension_table_entries = [(c,b) for c,b in cs.charmap if len(c) > 1]
			if len(extension_table_entries) > 255:
				print('%s Cannot create character map for %s because ICU cannot handle more than 255 extension table entries and %s contains %d extension table entries.' % (tablint.WARN, cs.name, cs.name, len(extension_table_entries)))
				#continue
			out_file = os.path.join(out_dir, '%s.ucm' % cs.name)
			cs.write_ucm(out_file)

def main():
	gen = IcuGenerator()
	tools = os.path.dirname(os.path.realpath(__file__))
	out_dir = os.path.join(tools, '..', 'icu', 'ucm')
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
		gen.write_ucms(out_dir)
	return ok

if __name__ == '__main__':
	if not main():
		sys.exit(1)
