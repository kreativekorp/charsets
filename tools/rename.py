#!/usr/bin/env python3

import re
import sys
import unicodedata

for line in sys.stdin:
	line = line.rstrip('\r\n')
	m = re.search('[Uu][+]([0-9A-Fa-f]+)', line)
	if m:
		cp = int(m.group(1), 16)
		name = unicodedata.name(chr(cp), '')
		if name:
			line = line.split('#')[0].rstrip()
			line += '\t# %s' % name
	print(line)
