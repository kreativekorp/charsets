#!/usr/bin/env python3

import re
import sys

lines = []
for line in sys.stdin:
	lines.append(re.split(r'\s+', line.strip()))

lines = [[lines[r][c] for r in range(len(lines))] for c in range(len(lines[0]))]
print('+'.join('+'.join(line) for line in lines))
