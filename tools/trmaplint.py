#!/usr/bin/env python3

import os
import re
import sys

CHARS_TO_ID = r'^U((\+([1-9A-F]|10)?[0-9A-F]{4})+)\s+(\?|\w+)$'
ID_TO_CHARS = r'^(\w+)\s+U((\+([1-9A-F]|10)?[0-9A-F]{4})+)$'
ERROR = '\x1B[1;31mERROR:\x1B[0m'
WARN = '\x1B[1;33mWARN:\x1B[0m'
OK = '\x1B[1;32mOK\x1B[0m'
ALL_OK = '\x1B[1;32mALL OK\x1B[0m'

def lint_lines(lines, round_trip=True, auto_reverse=False, then_call=None, with_name=None):
	chars_to_id = {}
	id_to_chars = {}
	pua_chars = {}
	ok = True
	for line in lines:
		line = line.partition('#')[0].strip()
		if not line:
			continue
		m = re.match(CHARS_TO_ID, line)
		if m:
			cps = tuple(int(cp,16) for cp in m[1][1:].split('+'))
			id = m[4]
			if cps in chars_to_id:
				print('  %s Duplicate mapping for character sequence U%s' % (ERROR, '+'.join('%04X' % cp for cp in cps)))
				ok = False
			else:
				chars_to_id[cps] = id
			continue
		m = re.match(ID_TO_CHARS, line)
		if m:
			id = m[1]
			cps = tuple(int(cp,16) for cp in m[2][1:].split('+'))
			if id in id_to_chars:
				print('  %s Duplicate mapping for identifier %s' % (ERROR, id))
				ok = False
			else:
				id_to_chars[id] = cps
			continue
		print('  %s Syntax error in line: %s' % (ERROR, line))
		ok = False
	if auto_reverse:
		if not id_to_chars:
			for cps in chars_to_id:
				id = chars_to_id[cps]
				if id == '?':
					continue
				elif id in id_to_chars:
					print('  %s Duplicate mapping for identifier %s' % (ERROR, id))
					ok = False
				else:
					id_to_chars[id] = cps
		if not chars_to_id:
			for id in id_to_chars:
				cps = id_to_chars[id]
				if cps in chars_to_id:
					print('  %s Duplicate mapping for character sequence U+%s' % (ERROR, '+'.join('%04X' % cp for cp in cps)))
					ok = False
				else:
					chars_to_id[cps] = id
	if round_trip:
		if not chars_to_id:
			print('  %s No character sequences mapped to any identifiers' % ERROR)
			ok = False
		if not id_to_chars:
			print('  %s No identifiers mapped to any character sequences' % ERROR)
			ok = False
		for id in sorted(id_to_chars):
			ccs = id_to_chars[id] if id in id_to_chars else None
			cid = chars_to_id[ccs] if ccs in chars_to_id else None
			rcs = id_to_chars[cid] if cid in id_to_chars else None
			if ccs != rcs:
				ccs = 'unmapped' if ccs is None else ('U+%s' % '+'.join('%04X' % c for c in ccs))
				rcs = 'unmapped' if rcs is None else ('U+%s' % '+'.join('%04X' % c for c in rcs))
				print('  %s Failed to roundtrip %s; returned as %s' % (ERROR, ccs, rcs))
				ok = False
		for cs in sorted(chars_to_id):
			cid = chars_to_id[cs] if cs in chars_to_id else None
			ccs = id_to_chars[cid] if cid in id_to_chars else None
			rid = chars_to_id[ccs] if ccs in chars_to_id else None
			if cid != '?' and cid != rid:
				cid = 'unmapped' if cid is None else cid
				rid = 'unmapped' if rid is None else rid
				print('  %s Failed to roundtrip %s; returned as %s' % (ERROR, cid, rid))
				ok = False
	if pua_chars:
		print('  PUA %s' % ' '.join('%04X' % cp for cp in sorted(pua_chars)))
	if ok and then_call:
		if then_call(with_name, chars_to_id, id_to_chars) is False:
			ok = False
	if ok:
		print('  %s %d %d' % (OK, len(chars_to_id), len(id_to_chars)))
	return ok

def lint_file(file, round_trip=True, auto_reverse=False, then_call=None, with_name=None):
	if not os.path.isfile(file):
		print('  %s File does not exist: %s' % (ERROR, os.path.basename(file)))
		return False
	with open(file, 'r') as f:
		lines = [line for line in f]
		return lint_lines(lines, round_trip, auto_reverse, then_call, with_name)

def lint(file, round_trip=True, auto_reverse=False, then_call=None):
	if os.path.isdir(file):
		ok = True
		for child in sorted(os.listdir(file)):
			if child.startswith('.') or child.endswith('\r'):
				continue
			child = os.path.join(file, child)
			if os.path.isdir(child) or child.endswith('.txt'):
				if not lint(child, round_trip, auto_reverse, then_call):
					ok = False
		return ok
	else:
		print(os.path.basename(file))
		return lint_file(file, round_trip, auto_reverse, then_call, os.path.splitext(os.path.basename(file))[0])

def main():
	args = sys.argv[1:]
	if args:
		ok = True
		for arg in args:
			if not lint(arg):
				ok = False
	else:
		tools = os.path.dirname(os.path.realpath(__file__))
		ok = lint(os.path.join(tools, '..', 'trmaps'))
	if ok:
		print(ALL_OK)
	return ok

if __name__ == '__main__':
	if not main():
		sys.exit(1)
