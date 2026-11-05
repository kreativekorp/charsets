#!/usr/bin/env python3

import json
import os
import sys
import tablint

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

def stringify_state_table(state_table):
	state_entries = []
	for state in sorted(set(k[0] for k in state_table)):
		input_entries = []
		for input in sorted(set(k[1] for k in state_table if k[0] == state)):
			next_state = state_table[(state,input)]
			input_entries.append('%d:%d' % (input, next_state))
		state_entries.append('%d:{%s}' % (state, ','.join(input_entries)))
	return '{%s}' % ','.join(state_entries)

def stringify_output_table(output_table):
	state_entries = []
	for state in sorted(set(k[0] for k in output_table)):
		input_entries = []
		for input in sorted(set(k[1] for k in output_table if k[0] == state)):
			output = ','.join(str(x) for x in output_table[(state,input)])
			input_entries.append('%d:[%s]' % (input, output))
		state_entries.append('%d:{%s}' % (state, ','.join(input_entries)))
	return '{%s}' % ','.join(state_entries)

class JsTableCharset:
	def __init__(self, bytes_to_chars, chars_to_bytes, name, *aliases):
		# Decoder Data
		self.max_chars_per_byte = 1
		self.decoder_state_table = {}
		self.decoder_output_table = {}
		self.decoder_max_state = 0
		for bs in bytes_to_chars:
			cs = char_input(bytes_to_chars[bs])
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
			chars_per_byte = len(cs) / len(bs)
			self.max_chars_per_byte = max(chars_per_byte, self.max_chars_per_byte)
		# Encoder Data
		self.max_bytes_per_char = 1
		self.encoder_replacement = tablint.find_encoder_replacement(bytes_to_chars, chars_to_bytes)
		self.encoder_state_table = {}
		self.encoder_output_table = {}
		self.encoder_max_state = 0
		for cs in chars_to_bytes:
			bs = chars_to_bytes[cs]
			cs = char_input(cs)
			state = 0
			for c in cs[0:-1]:
				key = (state, c & 0xFFFF)
				if key in self.encoder_state_table:
					state = self.encoder_state_table[key]
				else:
					state = self.encoder_max_state + 1
					self.encoder_max_state = state
					self.encoder_state_table[key] = state
			key = (state, cs[-1] & 0xFFFF)
			self.encoder_output_table[key] = bs
			bytes_per_char = len(bs) / len(cs)
			self.max_bytes_per_char = max(bytes_per_char, self.max_bytes_per_char)
		# Names
		self.name = name
		self.aliases = []
		for alias in aliases:
			self.add_name(alias)
		self.filename = name + '.js'

	def add_name(self, name):
		if name != self.name and name not in self.aliases:
			self.aliases.append(name)

	def write_registration(self, f, charset_decoder_register, charset_encoder_register):
		f.write('%s(%s,%s,%g,{nextState:%s,output:%s});\n' % (
			charset_decoder_register,
			json.dumps(self.name),
			json.dumps(self.aliases),
			self.max_chars_per_byte,
			stringify_state_table(self.decoder_state_table),
			stringify_output_table(self.decoder_output_table)
		))
		f.write('%s(%s,%s,%g,{replacement:%s,nextState:%s,output:%s});\n' % (
			charset_encoder_register,
			json.dumps(self.name),
			json.dumps(self.aliases),
			self.max_bytes_per_char,
			json.dumps(self.encoder_replacement),
			stringify_state_table(self.encoder_state_table),
			stringify_output_table(self.encoder_output_table)
		))

	def write_js_file(self, out_file, module_path='../charsets'):
		print('Writing %s to %s...' % (self.name, os.path.basename(out_file)))
		with open(out_file, 'w') as f:
			f.write('(function(require,window){\n')
			f.write("const c = window || require('%s');\n" % module_path)
			f.write('const d = c.CharsetDecoder.register;\n')
			f.write('const e = c.CharsetEncoder.register;\n')
			self.write_registration(f, 'd', 'e')
			f.write("})(((typeof require === 'function') ? require : null), ((typeof window === 'object') ? window : null));")

class JsGenerator:
	def __init__(self):
		self.charsets = {}
		self.add_charset_fn = lambda n, cn, b2c, c2b: self.add_charset(n, cn, b2c, c2b)

	def add_charset(self, name, canonical_name, bytes_to_chars, chars_to_bytes):
		if canonical_name in self.charsets:
			self.charsets[canonical_name].add_name(name)
		else:
			cs = JsTableCharset(bytes_to_chars, chars_to_bytes, canonical_name, name)
			self.charsets[canonical_name] = cs

	def write_directory(self, out_dir, module_path='../charsets'):
		os.makedirs(out_dir, exist_ok=True)
		for cs in self.charsets:
			out_file = os.path.join(out_dir, self.charsets[cs].filename)
			self.charsets[cs].write_js_file(out_file, module_path)

	def write_js_file(self, out_file, module_path='../charsets'):
		print('Writing charsets to %s...' % os.path.basename(out_file))
		with open(out_file, 'w') as f:
			f.write('(function(require,window){\n')
			f.write("const c = window || require('%s');\n" % module_path)
			f.write('const d = c.CharsetDecoder.register;\n')
			f.write('const e = c.CharsetEncoder.register;\n')
			for cs in self.charsets:
				self.charsets[cs].write_registration(f, 'd', 'e')
			f.write("})(((typeof require === 'function') ? require : null), ((typeof window === 'object') ? window : null));")

def main():
	gen = JsGenerator()
	out_dir = None
	out_file = None
	module_path = '../charsets'
	args = sys.argv[1:]
	if args:
		parse_opts = True
		ok = True
		while args:
			arg = args.pop(0)
			if parse_opts and arg.startswith('-'):
				if arg == '--':
					parse_opts = False
				elif arg == '-d' and args:
					out_dir = args.pop(0)
				elif arg == '-o' and args:
					out_file = args.pop(0)
				elif arg == '-m' and args:
					module_path = args.pop(0)
				else:
					print('%s Unknown option: %s' % (tablint.ERROR, arg))
					ok = False
			elif not tablint.lint(arg, True, then_call=gen.add_charset_fn):
				ok = False
	else:
		tools = os.path.dirname(os.path.realpath(__file__))
		tables = os.path.join(tools, '..', 'tables')
		ok = tablint.lint(tables, True, then_call=gen.add_charset_fn)
	if ok:
		print(tablint.ALL_OK)
		if out_dir is None and out_file is None:
			tools = os.path.dirname(os.path.realpath(__file__))
			out_dir = os.path.join(tools, '..', 'js', 'charsets')
			out_file = os.path.join(tools, '..', 'js', 'charsets', 'all.js')
		if out_dir is not None:
			gen.write_directory(out_dir, module_path)
		if out_file is not None:
			gen.write_js_file(out_file, module_path)
	return ok

if __name__ == '__main__':
	if not main():
		sys.exit(1)
