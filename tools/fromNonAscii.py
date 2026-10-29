#!/usr/bin/env python3

import re
import sys
import unicodedata

index = 0
for line in sys.stdin:
	for ch in line:
		cp = ord(ch)
		if cp >= 0xA0:
			name = unicodedata.name(ch, '')
			print('0x%02X\tU+%04X\t# %s' % (index, cp, name))
			index += 1
