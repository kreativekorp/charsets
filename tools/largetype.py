#!/usr/bin/env python3

import os
import re
import sys

def readlargetype():
	db = {}
	tools = os.path.dirname(os.path.realpath(__file__))
	file = os.path.join(tools, '..', 'traits', 'LargeType.txt')
	with open(file, 'r') as f:
		for line in f:
			m = re.match(r'^U\+([0-9A-Fa-f]+)\s+kLargeType\s+U\+([0-9A-Fa-f+]+)$', line.strip())
			if m:
				db[int(m[1],16)] = [int(c,16) for c in m[2].split('+')]
	return db

def largetype(lines):
	db = readlargetype()
	for line in lines:
		rows = [[],[],[]]
		for ch in line:
			cp = ord(ch)
			if cp in db:
				lt = db[cp]
				for i in range(len(lt)):
					rows[i % 3].append(lt[i])
		for row in rows:
			print(''.join(chr(c) for c in row))

def main():
	args = sys.argv[1:]
	if args:
		largetype(args)
	else:
		largetype(sys.stdin)

if __name__ == '__main__':
	main()
