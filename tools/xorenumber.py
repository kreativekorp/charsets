#!/usr/bin/env python3

import itertools
import re
import sys

xortable = [int(a, 16) for a in sys.argv[1:]]
if xortable:
	while len(xortable) < 256:
		xortable = list(itertools.chain(*[[x, x] for x in xortable]))

for line in sys.stdin:
	line = line.rstrip('\r\n')
	m = re.search('[0][Xx]([0-9A-Fa-f]+)', line)
	if m:
		index = int(m.group(1), 16)
		if xortable:
			index ^= xortable[index]
		line = re.sub('[0][Xx]([0-9A-Fa-f]+)', '0x%02X' % index, line)
	print(line)
