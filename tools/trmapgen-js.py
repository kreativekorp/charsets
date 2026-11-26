#!/usr/bin/env python3

import json
import os
import re
import sys
import trmaplint

class JsGenerator:
	def __init__(self):
		self.maps = {}
		self.add_map_fn = lambda n, d, c2i, i2c: self.add_map(n, d, c2i, i2c)

	def add_map(self, name, description, chars_to_id, id_to_chars):
		self.maps[name] = {
			'name': name,
			'description': description,
			'maxChars': max(sum(2 if c > 0xFFFF else 1 for c in cs) for cs in chars_to_id),
			'charsToId': {''.join(chr(c) for c in cs): chars_to_id[cs] for cs in chars_to_id},
			'idToChars': {id: ''.join(chr(c) for c in id_to_chars[id]) for id in id_to_chars}
		}

	def write_directory(self, out_dir, module_path='../trmaps'):
		os.makedirs(out_dir, exist_ok=True)
		for name in sorted(self.maps):
			filename = re.sub('[^A-Za-z0-9]+', '-', name)
			filename = re.sub('^-|-$', '', filename).lower()
			out_file = os.path.join(out_dir, filename + '.js')
			print('Writing %s...' % os.path.basename(out_file))
			with open(out_file, 'w') as f:
				f.write('(function(require,window){\n')
				f.write("const r = (window || require('%s')).CharacterTranslator.register;\n" % module_path)
				f.write('r(%s);\n' % json.dumps(self.maps[name]))
				f.write("})(((typeof require === 'function') ? require : null), ((typeof window === 'object') ? window : null));")

	def write_js_file(self, out_file, module_path='../trmaps'):
		print('Writing %s...' % os.path.basename(out_file))
		with open(out_file, 'w') as f:
			f.write('(function(require,window){\n')
			f.write("const r = (window || require('%s')).CharacterTranslator.register;\n" % module_path)
			for name in sorted(self.maps):
				f.write('r(%s);\n' % json.dumps(self.maps[name]))
			f.write("})(((typeof require === 'function') ? require : null), ((typeof window === 'object') ? window : null));")

def main():
	gen = JsGenerator()
	out_dir = None
	out_file = None
	module_path = '../trmaps'
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
					print('%s Unknown option: %s' % (trmaplint.ERROR, arg))
					ok = False
			elif not trmaplint.lint(arg, then_call=gen.add_map_fn):
				ok = False
	else:
		tools = os.path.dirname(os.path.realpath(__file__))
		trmaps = os.path.join(tools, '..', 'trmaps')
		ok = trmaplint.lint(trmaps, then_call=gen.add_map_fn)
	if ok:
		print(trmaplint.ALL_OK)
		if out_dir is None and out_file is None:
			tools = os.path.dirname(os.path.realpath(__file__))
			out_dir = os.path.join(tools, '..', 'js', 'trmaps')
			out_file = os.path.join(tools, '..', 'js', 'trmaps', 'all.js')
		if out_dir is not None:
			gen.write_directory(out_dir, module_path)
		if out_file is not None:
			gen.write_js_file(out_file, module_path)
	return ok

if __name__ == '__main__':
	if not main():
		sys.exit(1)
