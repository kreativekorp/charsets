#!/usr/bin/env python3

import re
import sys

index = 0
for line in sys.stdin:
	line = line.rstrip('\r\n')
	if re.search('[0][Xx]([0-9A-Fa-f]+)', line):
		line = re.sub('[0][Xx]([0-9A-Fa-f]+)', '0x%02X' % index, line)
		index += 1
	print(line)
