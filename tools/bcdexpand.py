#!/usr/bin/env python3

import re
import sys
import tablint
import unicodedata

def bcd_expand(file):
	bytes_to_chars = {}
	chars_to_bytes = {}
	with open(file, 'r') as f:
		for line in f:
			line, _, _ = [p.strip() for p in line.partition('#')]
			m = re.match(tablint.BYTES_TO_CHARS, line)
			if m:
				bs = tuple(int(m[1][i:i+2],16) for i in range(0,len(m[1]),2))
				cps = tuple(int(cp,16) for cp in m[3][1:].split('+'))
				bytes_to_chars[bs] = cps
			m = re.match(tablint.CHARS_TO_BYTES, line)
			if m:
				cps = tuple(int(cp,16) for cp in m[1][1:].split('+'))
				bs = tuple(int(m[4][i:i+2],16) for i in range(0,len(m[4]),2))
				chars_to_bytes[cps] = bs
	print()
	for major in sorted(bytes_to_chars):
		for minor in sorted(bytes_to_chars):
			print('0x%X%X\tU+%04X+%04X\t# %s, %s' % (
				major[0],
				minor[0],
				bytes_to_chars[major][0],
				bytes_to_chars[minor][0],
				unicodedata.name(chr(bytes_to_chars[major][0])),
				unicodedata.name(chr(bytes_to_chars[minor][0]))
			))
	print()
	for major in sorted(chars_to_bytes):
		for minor in sorted(chars_to_bytes):
			print('U+%04X+%04X\t0x%X%X\t# %s, %s' % (
				major[0],
				minor[0],
				chars_to_bytes[major][0],
				chars_to_bytes[minor][0],
				unicodedata.name(chr(major[0])),
				unicodedata.name(chr(minor[0]))
			))

def main():
	args = sys.argv[1:]
	for arg in args:
		bcd_expand(arg)

if __name__ == '__main__':
	main()
