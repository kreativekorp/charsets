#!/usr/bin/env python3

import re
import sys
import unicodedata

index = 0
for line in sys.stdin:
	for cps in re.findall('[0-9A-Fa-f]{4,}', line):
		cp = int(cps, 16)
		name = unicodedata.name(chr(cp), '')
		print('0x%02X\tU+%04X\t# %s' % (index, cp, name))
		index += 1
