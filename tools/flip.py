#!/usr/bin/env python3

import re
import sys

for line in sys.stdin:
	line = line.rstrip('\r\n')
	line = re.sub(r'([Uu][+]|[0][Xx])([0-9A-Fa-f+]+)(\s+)([Uu][+]|[0][Xx])([0-9A-Fa-f+]+)', r'\4\5\3\1\2', line)
	print(line)
