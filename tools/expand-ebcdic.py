#!/usr/bin/env python3

import datetime
import os
import re
import sys
import tablint

VARIANTS = {
	'generic': (
		# as Big Blue intended
		'0x15	U+0085	# NEW LINE',
		'0x25	U+000A	# LINE FEED',
		'U+000A	0x25	# LINE FEED',
		'U+0085	0x15	# NEW LINE',
	),
	'unix': (
		# 0x15 changed to U+000A, U+000A changed to 0x15
		'0x15	U+000A	# LINE FEED',
		'0x25	U+000A	# LINE FEED',
		'U+000A	0x15	# LINE FEED',
		'U+0085	0x15	# NEW LINE',
	),
	'swaplfnl': (
		# 0x15 and 0x25 fully swapped
		'0x15	U+000A	# LINE FEED',
		'0x25	U+0085	# NEW LINE',
		'U+000A	0x15	# LINE FEED',
		'U+0085	0x25	# NEW LINE',
	)
}

INVARIANTS = (
	(
		'0x00	U+0000	# NULL',
		'0x01	U+0001	# START OF HEADING',
		'0x02	U+0002	# START OF TEXT',
		'0x03	U+0003	# END OF TEXT',
		'0x04	U+009C	# SELECT',
		'0x05	U+0009	# HORIZONTAL TABULATION',
		'0x06	U+0086	# REQUIRED NEW LINE',
		'0x07	U+007F	# DELETE',
		'0x08	U+0097	# GRAPHIC ESCAPE',
		'0x09	U+008D	# SUPERSCRIPT',
		'0x0A	U+008E	# REPEAT',
		'0x0B	U+000B	# VERTICAL TABULATION',
		'0x0C	U+000C	# FORM FEED',
		'0x0D	U+000D	# CARRIAGE RETURN',
		'0x0E	U+000E	# SHIFT OUT',
		'0x0F	U+000F	# SHIFT IN',
		'0x10	U+0010	# DATA LINK ESCAPE',
		'0x11	U+0011	# DEVICE CONTROL ONE',
		'0x12	U+0012	# DEVICE CONTROL TWO',
		'0x13	U+0013	# DEVICE CONTROL THREE',
		'0x14	U+009D	# RESTORE/ENABLE PRESENTATION',
	),
	(
		'0x16	U+0008	# BACKSPACE',
		'0x17	U+0087	# PROGRAM OPERATOR COMMUNICATION',
		'0x18	U+0018	# CANCEL',
		'0x19	U+0019	# END OF MEDIUM',
		'0x1A	U+0092	# UNIT BACKSPACE',
		'0x1B	U+008F	# CUSTOMER USE ONE',
		'0x1C	U+001C	# INTERCHANGE FILE SEPARATOR',
		'0x1D	U+001D	# INTERCHANGE GROUP SEPARATOR',
		'0x1E	U+001E	# INTERCHANGE RECORD SEPARATOR',
		'0x1F	U+001F	# INTERCHANGE UNIT SEPARATOR',
		'0x20	U+0080	# DIGIT SELECT',
		'0x21	U+0081	# START OF SIGNIFICANCE',
		'0x22	U+0082	# FIELD SEPARATOR',
		'0x23	U+0083	# WORD UNDERSCORE',
		'0x24	U+0084	# BYPASS/INHIBIT PRESENTATION',
	),
	(
		'0x26	U+0017	# END OF TRANSMISSION BLOCK',
		'0x27	U+001B	# ESCAPE',
		'0x28	U+0088	# SET ATTRIBUTE',
		'0x29	U+0089	# START FIELD EXTENDED',
		'0x2A	U+008A	# SET MODE/SWITCH',
		'0x2B	U+008B	# CONTROL SEQUENCE PREFIX',
		'0x2C	U+008C	# MODIFY FIELD ATTRIBUTE',
		'0x2D	U+0005	# ENQUIRY',
		'0x2E	U+0006	# ACKNOWLEDGE',
		'0x2F	U+0007	# BELL',
		'0x30	U+0090	# <reserved>',
		'0x31	U+0091	# <reserved>',
		'0x32	U+0016	# SYNCHRONOUS IDLE',
		'0x33	U+0093	# INDEX RETURN',
		'0x34	U+0094	# PRESENTATION POSITION',
		'0x35	U+0095	# TRANSPARENT',
		'0x36	U+0096	# NUMERIC BACKSPACE',
		'0x37	U+0004	# END OF TRANSMISSION',
		'0x38	U+0098	# SUBSCRIPT',
		'0x39	U+0099	# INDENT TABULATION',
		'0x3A	U+009A	# REQUIRED FORM FEED',
		'0x3B	U+009B	# CUSTOMER USE THREE',
		'0x3C	U+0014	# DEVICE CONTROL FOUR',
		'0x3D	U+0015	# NEGATIVE ACKNOWLEDGE',
		'0x3E	U+009E	# <reserved>',
		'0x3F	U+001A	# SUBSTITUTE',
	),
	(
		'0xFF	U+009F	# EIGHT ONES',
	),
	(
		'U+0000	0x00	# NULL',
		'U+0001	0x01	# START OF HEADING',
		'U+0002	0x02	# START OF TEXT',
		'U+0003	0x03	# END OF TEXT',
		'U+0004	0x37	# END OF TRANSMISSION',
		'U+0005	0x2D	# ENQUIRY',
		'U+0006	0x2E	# ACKNOWLEDGE',
		'U+0007	0x2F	# BELL',
		'U+0008	0x16	# BACKSPACE',
		'U+0009	0x05	# HORIZONTAL TABULATION',
	),
	(
		'U+000B	0x0B	# VERTICAL TABULATION',
		'U+000C	0x0C	# FORM FEED',
		'U+000D	0x0D	# CARRIAGE RETURN',
		'U+000E	0x0E	# SHIFT OUT',
		'U+000F	0x0F	# SHIFT IN',
		'U+0010	0x10	# DATA LINK ESCAPE',
		'U+0011	0x11	# DEVICE CONTROL ONE',
		'U+0012	0x12	# DEVICE CONTROL TWO',
		'U+0013	0x13	# DEVICE CONTROL THREE',
		'U+0014	0x3C	# DEVICE CONTROL FOUR',
		'U+0015	0x3D	# NEGATIVE ACKNOWLEDGE',
		'U+0016	0x32	# SYNCHRONOUS IDLE',
		'U+0017	0x26	# END OF TRANSMISSION BLOCK',
		'U+0018	0x18	# CANCEL',
		'U+0019	0x19	# END OF MEDIUM',
		'U+001A	0x3F	# SUBSTITUTE',
		'U+001B	0x27	# ESCAPE',
		'U+001C	0x1C	# INTERCHANGE FILE SEPARATOR',
		'U+001D	0x1D	# INTERCHANGE GROUP SEPARATOR',
		'U+001E	0x1E	# INTERCHANGE RECORD SEPARATOR',
		'U+001F	0x1F	# INTERCHANGE UNIT SEPARATOR',
	),
	(
		'U+007F	0x07	# DELETE',
		'U+0080	0x20	# DIGIT SELECT',
		'U+0081	0x21	# START OF SIGNIFICANCE',
		'U+0082	0x22	# FIELD SEPARATOR',
		'U+0083	0x23	# WORD UNDERSCORE',
		'U+0084	0x24	# BYPASS/INHIBIT PRESENTATION',
	),
	(
		'U+0086	0x06	# REQUIRED NEW LINE',
		'U+0087	0x17	# PROGRAM OPERATOR COMMUNICATION',
		'U+0088	0x28	# SET ATTRIBUTE',
		'U+0089	0x29	# START FIELD EXTENDED',
		'U+008A	0x2A	# SET MODE/SWITCH',
		'U+008B	0x2B	# CONTROL SEQUENCE PREFIX',
		'U+008C	0x2C	# MODIFY FIELD ATTRIBUTE',
		'U+008D	0x09	# SUPERSCRIPT',
		'U+008E	0x0A	# REPEAT',
		'U+008F	0x1B	# CUSTOMER USE ONE',
		'U+0090	0x30	# <reserved>',
		'U+0091	0x31	# <reserved>',
		'U+0092	0x1A	# UNIT BACKSPACE',
		'U+0093	0x33	# INDEX RETURN',
		'U+0094	0x34	# PRESENTATION POSITION',
		'U+0095	0x35	# TRANSPARENT',
		'U+0096	0x36	# NUMERIC BACKSPACE',
		'U+0097	0x08	# GRAPHIC ESCAPE',
		'U+0098	0x38	# SUBSCRIPT',
		'U+0099	0x39	# INDENT TABULATION',
		'U+009A	0x3A	# REQUIRED FORM FEED',
		'U+009B	0x3B	# CUSTOMER USE THREE',
		'U+009C	0x04	# SELECT',
		'U+009D	0x14	# RESTORE/ENABLE PRESENTATION',
		'U+009E	0x3E	# <reserved>',
		'U+009F	0xFF	# EIGHT ONES',
	),
)

INVARIANT_MAPPINGS = {
	(0x00, 0x00), (0x01, 0x01), (0x02, 0x02), (0x03, 0x03), (0x04, 0x9C), (0x05, 0x09),
	(0x06, 0x86), (0x07, 0x7F), (0x08, 0x97), (0x09, 0x8D), (0x0A, 0x8E), (0x0B, 0x0B),
	(0x0C, 0x0C), (0x0D, 0x0D), (0x0E, 0x0E), (0x0F, 0x0F), (0x10, 0x10), (0x11, 0x11),
	(0x12, 0x12), (0x13, 0x13), (0x14, 0x9D), (0x16, 0x08), (0x17, 0x87), (0x18, 0x18),
	(0x19, 0x19), (0x1A, 0x92), (0x1B, 0x8F), (0x1C, 0x1C), (0x1D, 0x1D), (0x1E, 0x1E),
	(0x1F, 0x1F), (0x20, 0x80), (0x21, 0x81), (0x22, 0x82), (0x23, 0x83), (0x24, 0x84),
	(0x26, 0x17), (0x27, 0x1B), (0x28, 0x88), (0x29, 0x89), (0x2A, 0x8A), (0x2B, 0x8B),
	(0x2C, 0x8C), (0x2D, 0x05), (0x2E, 0x06), (0x2F, 0x07), (0x32, 0x16), (0x33, 0x93),
	(0x34, 0x94), (0x35, 0x95), (0x36, 0x96), (0x37, 0x04), (0x38, 0x98), (0x39, 0x99),
	(0x3A, 0x9A), (0x3B, 0x9B), (0x3C, 0x14), (0x3D, 0x15), (0x3F, 0x1A), (0xFF, 0x9F),
}

def is_EBCDIC(b2c, c2b):
	return all((b,) in b2c and b2c[(b,)] == (c,)
	       and (c,) in c2b and c2b[(c,)] == (b,)
	       for b, c in INVARIANT_MAPPINGS)

def expand_EBCDIC(file):
	date_line = datetime.datetime.now().strftime('# Date: %Y-%m-%d')
	bytes_to_chars = {}
	chars_to_bytes = {}
	header_lines = []
	decoder_lines = []
	ascii_encoder_lines = []
	unicode_encoder_lines = []
	with open(file, 'r') as f:
		for line in f:
			line = line.rstrip('\r\n')
			mapping = line.partition('#')[0].strip()
			m = re.match(tablint.BYTES_TO_CHARS, mapping)
			if m:
				bs = tuple(int(m[1][i:i+2],16) for i in range(0,len(m[1]),2))
				cps = tuple(int(cp,16) for cp in m[3][1:].split('+'))
				bytes_to_chars[bs] = cps
				if 0x40 <= bs[0] < 0xFF:
					decoder_lines.append(line)
				continue
			m = re.match(tablint.CHARS_TO_BYTES, mapping)
			if m:
				cps = tuple(int(cp,16) for cp in m[1][1:].split('+'))
				bs = tuple(int(m[4][i:i+2],16) for i in range(0,len(m[4]),2))
				chars_to_bytes[cps] = bs
				if 0x20 <= cps[0] < 0x7F:
					ascii_encoder_lines.append(line)
				if 0xA0 <= cps[0]:
					unicode_encoder_lines.append(line)
				continue
			if line.strip():
				header_lines.append(re.sub(r'# Date: \d+-\d+-\d+', date_line, line))
	if not is_EBCDIC(bytes_to_chars, chars_to_bytes):
		print('  Not an EBCDIC encoding.')
		return False
	basefile = re.sub('(-(%s))?\\.txt$' % '|'.join(VARIANTS), '', file)
	for variant in VARIANTS:
		varfile = '%s-%s.txt' % (basefile, variant)
		with open(varfile, 'w') as f:
			f.write('\n'.join(header_lines))
			f.write('\n\n')
			f.write('\n'.join(INVARIANTS[0]))
			f.write('\n%s\n' % VARIANTS[variant][0])
			f.write('\n'.join(INVARIANTS[1]))
			f.write('\n%s\n' % VARIANTS[variant][1])
			f.write('\n'.join(INVARIANTS[2]))
			f.write('\n%s\n' % '\n'.join(decoder_lines))
			f.write('\n'.join(INVARIANTS[3]))
			f.write('\n\n')
			f.write('\n'.join(INVARIANTS[4]))
			f.write('\n%s\n' % VARIANTS[variant][2])
			f.write('\n'.join(INVARIANTS[5]))
			f.write('\n%s\n' % '\n'.join(ascii_encoder_lines))
			f.write('\n'.join(INVARIANTS[6]))
			f.write('\n%s\n' % VARIANTS[variant][3])
			f.write('\n'.join(INVARIANTS[7]))
			f.write('\n%s\n' % '\n'.join(unicode_encoder_lines))
		print('  Wrote %s' % varfile)
	srcfile = './%s' % os.path.basename('%s-generic.txt' % basefile)
	dstfile = '%s.txt' % basefile
	with open(dstfile, 'w') as f:
		f.write(srcfile)
	print('  Wrote %s' % dstfile)
	return True

def main():
	args = sys.argv[1:]
	for arg in args:
		print(arg)
		expand_EBCDIC(arg)

if __name__ == '__main__':
	main()
