#!/usr/bin/env python3

import re
import sys
import unicodedata

CONTROL_NAMES = {
	0x00: 'NULL', 0x01: 'START OF HEADING', 0x02: 'START OF TEXT',
	0x03: 'END OF TEXT', 0x04: 'END OF TRANSMISSION', 0x05: 'ENQUIRY',
	0x06: 'ACKNOWLEDGE', 0x07: 'BELL', 0x08: 'BACKSPACE',
	0x09: 'HORIZONTAL TABULATION', 0x0A: 'LINE FEED',
	0x0B: 'VERTICAL TABULATION', 0x0C: 'FORM FEED',
	0x0D: 'CARRIAGE RETURN', 0x0E: 'SHIFT OUT', 0x0F: 'SHIFT IN',
	0x10: 'DATA LINK ESCAPE', 0x11: 'DEVICE CONTROL ONE',
	0x12: 'DEVICE CONTROL TWO', 0x13: 'DEVICE CONTROL THREE',
	0x14: 'DEVICE CONTROL FOUR', 0x15: 'NEGATIVE ACKNOWLEDGE',
	0x16: 'SYNCHRONOUS IDLE', 0x17: 'END OF TRANSMISSION BLOCK',
	0x18: 'CANCEL', 0x19: 'END OF MEDIUM', 0x1A: 'SUBSTITUTE',
	0x1B: 'ESCAPE', 0x1C: 'FILE SEPARATOR', 0x1D: 'GROUP SEPARATOR',
	0x1E: 'RECORD SEPARATOR', 0x1F: 'UNIT SEPARATOR', 0x7F: 'DELETE',
	0x80: '<CONTROL>', 0x81: '<CONTROL>', 0x82: '<CONTROL>', 0x83: '<CONTROL>',
	0x84: '<CONTROL>', 0x85: '<CONTROL>', 0x86: '<CONTROL>', 0x87: '<CONTROL>',
	0x88: '<CONTROL>', 0x89: '<CONTROL>', 0x8A: '<CONTROL>', 0x8B: '<CONTROL>',
	0x8C: '<CONTROL>', 0x8D: '<CONTROL>', 0x8E: '<CONTROL>', 0x8F: '<CONTROL>',
	0x90: '<CONTROL>', 0x91: '<CONTROL>', 0x92: '<CONTROL>', 0x93: '<CONTROL>',
	0x94: '<CONTROL>', 0x95: '<CONTROL>', 0x96: '<CONTROL>', 0x97: '<CONTROL>',
	0x98: '<CONTROL>', 0x99: '<CONTROL>', 0x9A: '<CONTROL>', 0x9B: '<CONTROL>',
	0x9C: '<CONTROL>', 0x9D: '<CONTROL>', 0x9E: '<CONTROL>', 0x9F: '<CONTROL>',
}

for line in sys.stdin:
	line = line.rstrip('\r\n')
	m = re.search('[Uu][+]([0-9A-Fa-f]+)', line)
	if m:
		cp = int(m.group(1), 16)
		name = CONTROL_NAMES[cp] if cp in CONTROL_NAMES else unicodedata.name(chr(cp), '')
		if name:
			line = line.split('#')[0].rstrip()
			line += '\t# %s' % name
	print(line)
