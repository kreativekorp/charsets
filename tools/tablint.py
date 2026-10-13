#!/usr/bin/env python3

import os
import re
import sys

ERROR = '\x1B[1;31mERROR:\x1B[0m'
OK = '\x1B[1;32mOK\x1B[0m'
ALL_OK = '\x1B[1;32mALL OK\x1B[0m'

def lint_lines(lines, round_trip):
	bytes_to_chars = {}
	chars_to_bytes = {}
	pua_chars = {}
	ok = True
	for line in lines:
		line = line.split('#')[0].strip()
		if not line:
			continue
		m = re.match(r'^0x(([0-9A-F]{2})+)\s+U((\+[0-9A-F]+)+)$', line)
		if m:
			for cps in m[3][1:].split('+'):
				cp = int(cps, 16)
				if 0xD800 <= cp <= 0xDFFF:
					print('  %s Use of UTF-16 surrogate in character sequence U%s' % (ERROR, m[3]))
					ok = False
				if 0xE000 <= cp <= 0xF8FF or cp >= 0xF0000:
					pua_chars[cp] = cp
			if m[1] in bytes_to_chars:
				print('  %s Duplicate mapping for byte sequence 0x%s' % (ERROR, m[1]))
				ok = False
			else:
				bytes_to_chars[m[1]] = m[3]
			continue
		m = re.match(r'^U((\+[0-9A-F]+)+)\s+0x(([0-9A-F]{2})+)$', line)
		if m:
			for cps in m[1][1:].split('+'):
				cp = int(cps, 16)
				if round_trip and 0xD800 <= cp <= 0xDFFF:
					print('  %s Use of UTF-16 surrogate in character sequence U%s' % (ERROR, m[1]))
					ok = False
				if 0xE000 <= cp <= 0xF8FF or cp >= 0xF0000:
					pua_chars[cp] = cp
			if m[1] in chars_to_bytes:
				print('  %s Duplicate mapping for character sequence U%s' % (ERROR, m[1]))
				ok = False
			else:
				chars_to_bytes[m[1]] = m[3]
			continue
		print('  %s Syntax error in line: %s' % (ERROR, line))
		ok = False
	if round_trip:
		if not bytes_to_chars:
			print('  %s No byte sequences mapped to any character sequences' % ERROR)
			ok = False
		if not chars_to_bytes:
			print('  %s No character sequences mapped to any byte sequences' % ERROR)
			ok = False
		for cs in sorted(chars_to_bytes):
			cbs = chars_to_bytes[cs] if cs in chars_to_bytes else '<null>'
			ccs = bytes_to_chars[cbs] if cbs in bytes_to_chars else '<null>'
			rbs = chars_to_bytes[ccs] if ccs in chars_to_bytes else '<null>'
			if cbs != rbs:
				print('  %s Failed to roundtrip 0x%s; returned as 0x%s' % (ERROR, cbs, rbs))
				ok = False
		for bs in sorted(bytes_to_chars):
			ccs = bytes_to_chars[bs] if bs in bytes_to_chars else '+<null>'
			cbs = chars_to_bytes[ccs] if ccs in chars_to_bytes else '+<null>'
			rcs = bytes_to_chars[cbs] if cbs in bytes_to_chars else '+<null>'
			if ccs != rcs:
				print('  %s Failed to roundtrip U%s; returned as U%s' % (ERROR, ccs, rcs))
				ok = False
	if pua_chars:
		print('  PUA %s' % ' '.join('%04X' % cp for cp in sorted(pua_chars)))
	if ok:
		print('  %s %d %d' % (OK, len(bytes_to_chars), len(chars_to_bytes)))
	return ok

def lint_file(file, round_trip):
	if not os.path.isfile(file):
		print('  %s File does not exist: %s' % (ERROR, os.path.basename(file)))
		return False
	with open(file, 'r') as f:
		lines = [line for line in f]
		if len(lines) == 1 and lines[0].startswith('./') and lines[0].endswith('.txt'):
			print('  -> %s' % lines[0])
			return lint_file(os.path.join(os.path.dirname(file), lines[0][2:]), round_trip)
		else:
			return lint_lines(lines, round_trip)

def lint(file, round_trip):
	if os.path.isdir(file):
		ok = True
		for child in sorted(os.listdir(file)):
			if child.startswith('.') or child.endswith('\r'):
				continue
			child = os.path.join(file, child)
			if os.path.isdir(child) or child.endswith('.txt'):
				if not lint(child, round_trip):
					ok = False
		return ok
	else:
		print(os.path.basename(file))
		return lint_file(file, round_trip)

def main():
	args = sys.argv[1:]
	if args:
		parse_opts = True
		round_trip = True
		ok = True
		for arg in args:
			if parse_opts and arg.startswith('-'):
				if arg == '--':
					parse_opts = False
				elif arg == '-t':
					round_trip = False
				elif arg == '-T':
					round_trip = True
				else:
					print('%s Unknown option: %s' % (ERROR, arg))
					ok = False
			elif not lint(arg, round_trip):
				ok = False
	else:
		tools = os.path.dirname(os.path.realpath(__file__))
		ok1 = lint(os.path.join(tools, '..', 'tables'), True)
		ok2 = lint(os.path.join(tools, '..', 'tests'), False)
		ok = ok1 and ok2
	if ok:
		print(ALL_OK)

if __name__ == '__main__':
	main()
