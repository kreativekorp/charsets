#!/usr/bin/env python3

import os
import sys

def link(old, new):
	old = os.path.basename(old)
	if not old.endswith('.txt'):
		old += '.txt'
	old = './' + old

	new = os.path.basename(new)
	if not new.endswith('.txt'):
		new += '.txt'
	tools = os.path.dirname(os.path.realpath(__file__))
	new = os.path.join(tools, '..', 'tables', new)

	with open(new, 'w') as f:
		f.write(old)

def main():
	args = sys.argv[1:]
	if len(args) == 2:
		link(*args)
	else:
		print('ERROR: ln.py takes 2 arguments')

if __name__ == '__main__':
	main()
