#!/usr/bin/env python3

import datetime
import os
import re
import unicodedata

AUTHOR = 'Rebecca Bettencourt'

CONTROL_INVARIANTS = {
	0x00: (0x0000, 'NULL'),
	0x01: (0x0001, 'START OF HEADING'),
	0x02: (0x0002, 'START OF TEXT'),
	0x03: (0x0003, 'END OF TEXT'),
	0x04: (0x0004, 'END OF TRANSMISSION'),
	0x05: (0x0005, 'ENQUIRY'),
	0x06: (0x0006, 'ACKNOWLEDGE'),
	0x07: (0x0007, 'BELL'),
	0x08: (0x0008, 'BACKSPACE'),
	0x09: (0x0009, 'HORIZONTAL TABULATION'),
	0x0A: (0x000A, 'LINE FEED'),
	0x0B: (0x000B, 'VERTICAL TABULATION'),
	0x0C: (0x000C, 'FORM FEED'),
	0x0D: (0x000D, 'CARRIAGE RETURN'),
	0x0E: (0x000E, 'SHIFT OUT'),
	0x0F: (0x000F, 'SHIFT IN'),
	0x10: (0x0010, 'DATA LINK ESCAPE'),
	0x11: (0x0011, 'DEVICE CONTROL ONE'),
	0x12: (0x0012, 'DEVICE CONTROL TWO'),
	0x13: (0x0013, 'DEVICE CONTROL THREE'),
	0x14: (0x0014, 'DEVICE CONTROL FOUR'),
	0x15: (0x0015, 'NEGATIVE ACKNOWLEDGE'),
	0x16: (0x0016, 'SYNCHRONOUS IDLE'),
	0x17: (0x0017, 'END OF TRANSMISSION BLOCK'),
	0x18: (0x0018, 'CANCEL'),
	0x19: (0x0019, 'END OF MEDIUM'),
	0x1A: (0x001A, 'SUBSTITUTE'),
	0x1B: (0x001B, 'ESCAPE'),
	0x1C: (0x001C, 'FILE SEPARATOR'),
	0x1D: (0x001D, 'GROUP SEPARATOR'),
	0x1E: (0x001E, 'RECORD SEPARATOR'),
	0x1F: (0x001F, 'UNIT SEPARATOR'),
	0x7F: (0x2427, 'SYMBOL FOR DELETE SQUARE CHECKER BOARD FORM')
}

LANGUAGE_VARIANTS = {
	'us': {
		0x23: (0x0023, 'NUMBER SIGN'),
		0x40: (0x0040, 'COMMERCIAL AT'),
		0x5B: (0x005B, 'LEFT SQUARE BRACKET'),
		0x5C: (0x005C, 'REVERSE SOLIDUS'),
		0x5D: (0x005D, 'RIGHT SQUARE BRACKET'),
		0x60: (0x0060, 'GRAVE ACCENT'),
		0x7B: (0x007B, 'LEFT CURLY BRACKET'),
		0x7C: (0x007C, 'VERTICAL LINE'),
		0x7D: (0x007D, 'RIGHT CURLY BRACKET'),
		0x7E: (0x007E, 'TILDE'),
		'lang-desc': 'U.S.A. display language option'
	},
	'uk': {
		0x23: (0x00A3, 'POUND SIGN'),
		0x40: (0x0040, 'COMMERCIAL AT'),
		0x5B: (0x005B, 'LEFT SQUARE BRACKET'),
		0x5C: (0x005C, 'REVERSE SOLIDUS'),
		0x5D: (0x005D, 'RIGHT SQUARE BRACKET'),
		0x60: (0x0060, 'GRAVE ACCENT'),
		0x7B: (0x007B, 'LEFT CURLY BRACKET'),
		0x7C: (0x007C, 'VERTICAL LINE'),
		0x7D: (0x007D, 'RIGHT CURLY BRACKET'),
		0x7E: (0x007E, 'TILDE'),
		'lang-desc': 'U.K. display language option'
	},
	'fr': {
		0x23: (0x00A3, 'POUND SIGN'),
		0x40: (0x00E0, 'LATIN SMALL LETTER A WITH GRAVE'),
		0x5B: (0x00B0, 'DEGREE SIGN'),
		0x5C: (0x00E7, 'LATIN SMALL LETTER C WITH CEDILLA'),
		0x5D: (0x00A7, 'SECTION SIGN'),
		0x60: (0x0060, 'GRAVE ACCENT'),
		0x7B: (0x00E9, 'LATIN SMALL LETTER E WITH ACUTE'),
		0x7C: (0x00F9, 'LATIN SMALL LETTER U WITH GRAVE'),
		0x7D: (0x00E8, 'LATIN SMALL LETTER E WITH GRAVE'),
		0x7E: (0x00A8, 'DIAERESIS'),
		'lang-desc': 'French display language option'
	},
	'dk': {
		0x23: (0x0023, 'NUMBER SIGN'),
		0x40: (0x0040, 'COMMERCIAL AT'),
		0x5B: (0x00C6, 'LATIN CAPITAL LETTER AE'),
		0x5C: (0x00D8, 'LATIN CAPITAL LETTER O WITH STROKE'),
		0x5D: (0x00C5, 'LATIN CAPITAL LETTER A WITH RING ABOVE'),
		0x60: (0x0060, 'GRAVE ACCENT'),
		0x7B: (0x00E6, 'LATIN SMALL LETTER AE'),
		0x7C: (0x00F8, 'LATIN SMALL LETTER O WITH STROKE'),
		0x7D: (0x00E5, 'LATIN SMALL LETTER A WITH RING ABOVE'),
		0x7E: (0x007E, 'TILDE'),
		'lang-desc': 'Danish display language option'
	},
	'es': {
		0x23: (0x00A3, 'POUND SIGN'),
		0x40: (0x00A7, 'SECTION SIGN'),
		0x5B: (0x00A1, 'INVERTED EXCLAMATION MARK'),
		0x5C: (0x00D1, 'LATIN CAPITAL LETTER N WITH TILDE'),
		0x5D: (0x00BF, 'INVERTED QUESTION MARK'),
		0x60: (0x0060, 'GRAVE ACCENT'),
		0x7B: (0x00B0, 'DEGREE SIGN'),
		0x7C: (0x00F1, 'LATIN SMALL LETTER N WITH TILDE'),
		0x7D: (0x00E7, 'LATIN SMALL LETTER C WITH CEDILLA'),
		0x7E: (0x007E, 'TILDE'),
		'lang-desc': 'Spanish display language option'
	},
	'it': {
		0x23: (0x00A3, 'POUND SIGN'),
		0x40: (0x00A7, 'SECTION SIGN'),
		0x5B: (0x00B0, 'DEGREE SIGN'),
		0x5C: (0x00E7, 'LATIN SMALL LETTER C WITH CEDILLA'),
		0x5D: (0x00E9, 'LATIN SMALL LETTER E WITH ACUTE'),
		0x60: (0x00F9, 'LATIN SMALL LETTER U WITH GRAVE'),
		0x7B: (0x00E0, 'LATIN SMALL LETTER A WITH GRAVE'),
		0x7C: (0x00F2, 'LATIN SMALL LETTER O WITH GRAVE'),
		0x7D: (0x00E8, 'LATIN SMALL LETTER E WITH GRAVE'),
		0x7E: (0x00EC, 'LATIN SMALL LETTER I WITH GRAVE'),
		'lang-desc': 'Italian display language option'
	},
	'de': {
		0x23: (0x0023, 'NUMBER SIGN'),
		0x40: (0x00A7, 'SECTION SIGN'),
		0x5B: (0x00C4, 'LATIN CAPITAL LETTER A WITH DIAERESIS'),
		0x5C: (0x00D6, 'LATIN CAPITAL LETTER O WITH DIAERESIS'),
		0x5D: (0x00DC, 'LATIN CAPITAL LETTER U WITH DIAERESIS'),
		0x60: (0x0060, 'GRAVE ACCENT'),
		0x7B: (0x00E4, 'LATIN SMALL LETTER A WITH DIAERESIS'),
		0x7C: (0x00F6, 'LATIN SMALL LETTER O WITH DIAERESIS'),
		0x7D: (0x00FC, 'LATIN SMALL LETTER U WITH DIAERESIS'),
		0x7E: (0x00DF, 'LATIN SMALL LETTER SHARP S'),
		'lang-desc': 'German display language option'
	},
	'se': {
		0x23: (0x0023, 'NUMBER SIGN'),
		0x40: (0x0040, 'COMMERCIAL AT'),
		0x5B: (0x00C4, 'LATIN CAPITAL LETTER A WITH DIAERESIS'),
		0x5C: (0x00D6, 'LATIN CAPITAL LETTER O WITH DIAERESIS'),
		0x5D: (0x00C5, 'LATIN CAPITAL LETTER A WITH RING ABOVE'),
		0x60: (0x0060, 'GRAVE ACCENT'),
		0x7B: (0x00E4, 'LATIN SMALL LETTER A WITH DIAERESIS'),
		0x7C: (0x00F6, 'LATIN SMALL LETTER O WITH DIAERESIS'),
		0x7D: (0x00E5, 'LATIN SMALL LETTER A WITH RING ABOVE'),
		0x7E: (0x007E, 'TILDE'),
		'lang-desc': 'Swedish display language option'
	},
}

LOGO_VARIANTS = {
	'mod': {
		0x40: ('U+2325', 'Solid Apple -> OPTION KEY', 'OPTION KEY'),
		0x41: ('U+2318', 'Open Apple -> PLACE OF INTEREST SIGN', 'PLACE OF INTEREST SIGN'),
		'logo-desc': 'logos replaced with modern modifier key symbols'
	},
	'laser': {
		0x40: ('U+25B2', 'Solid Apple -> BLACK UP-POINTING TRIANGLE', 'BLACK UP-POINTING TRIANGLE'),
		0x41: ('U+25B3', 'Open Apple -> WHITE UP-POINTING TRIANGLE', 'WHITE UP-POINTING TRIANGLE'),
		'logo-desc': 'logos replaced with triangles as on VTech Laser 128'
	},
	'linux': {
		0x40: ('U+F813', 'Solid Apple', 'Solid Apple (Linux Private Use Area)'),
		0x41: ('U+F812', 'Open Apple', 'Open Apple (Linux Private Use Area)'),
		'logo-desc': 'logos in Linux Private Use Area'
	},
	'apple': {
		0x40: ('U+F8FF', 'Solid Apple', 'Solid Apple (Apple Private Use Area)'),
		0x41: ('U+F8FF+F87F', 'Open Apple', 'Open Apple (Apple Private Use Area)'),
		'logo-desc': 'logos in Apple Private Use Area'
	},
	'emoji': {
		0x40: ('U+1F34E', 'Solid Apple -> RED APPLE', 'RED APPLE'),
		0x41: ('U+1F34F', 'Open Apple -> GREEN APPLE', 'GREEN APPLE'),
		'logo-desc': 'logos replaced with emoji'
	},
	'kspua': {
		0x40: ('U+FFCE3', 'Solid Apple', 'Solid Apple (Kreative Private Use Area)'),
		0x41: ('U+FFCE2', 'Open Apple', 'Open Apple (Kreative Private Use Area)'),
		'logo-desc': 'logos in Kreative Software Private Use Area'
	},
}

MODEL_VARIANTS = {
	'apple2e': {
		0x46: ('U+1FBB2', 'LEFT HALF RUNNING MAN'),
		0x47: ('U+1FBB3', 'RIGHT HALF RUNNING MAN'),
		'model-desc': 'Apple IIe',
		'model-alias': []
	},
	'apple2gs': {
		0x46: ('U+1FBB4', 'INVERSE DOWNWARDS ARROW WITH TIP LEFTWARDS'),
		0x47: ('U+1FB81', 'HORIZONTAL ONE EIGHTH BLOCK-1358'),
		'model-desc': 'Apple IIc/IIgs',
		'model-alias': ['apple2c']
	},
}

MOUSETEXT_DECODER_INVARIANTS = {
	0x42: ('U+1FBB0', 'ARROWHEAD-SHAPED POINTER'),
	0x43: ('U+231B+FE0E', 'HOURGLASS'),
	0x44: ('U+2713', 'CHECK MARK'),
	0x45: ('U+1FBB1', 'INVERSE CHECK MARK'),
	0x48: ('U+2190', 'LEFTWARDS ARROW'),
	0x49: ('U+2026', 'HORIZONTAL ELLIPSIS'),
	0x4A: ('U+2193', 'DOWNWARDS ARROW'),
	0x4B: ('U+2191', 'UPWARDS ARROW'),
	0x4C: ('U+2594', 'UPPER ONE EIGHTH BLOCK'),
	0x4D: ('U+21B2', 'DOWNWARDS ARROW WITH TIP LEFTWARDS'),
	0x4E: ('U+2589', 'LEFT SEVEN EIGHTHS BLOCK'),
	0x4F: ('U+1FBB5', 'LEFTWARDS ARROW AND UPPER AND LOWER ONE EIGHTH BLOCK'),
	0x50: ('U+1FBB6', 'RIGHTWARDS ARROW AND UPPER AND LOWER ONE EIGHTH BLOCK'),
	0x51: ('U+1FBB7', 'DOWNWARDS ARROW AND RIGHT ONE EIGHTH BLOCK'),
	0x52: ('U+1FBB8', 'UPWARDS ARROW AND RIGHT ONE EIGHTH BLOCK'),
	0x53: ('U+2500', 'BOX DRAWINGS LIGHT HORIZONTAL'),
	0x54: ('U+1FB7C', 'LEFT AND LOWER ONE EIGHTH BLOCK'),
	0x55: ('U+2192', 'RIGHTWARDS ARROW'),
	0x56: ('U+2592', 'MEDIUM SHADE'),
	0x57: ('U+1FB90', 'INVERSE MEDIUM SHADE'),
	0x58: ('U+1FBB9', 'LEFT HALF FOLDER'),
	0x59: ('U+1FBBA', 'RIGHT HALF FOLDER'),
	0x5A: ('U+2595', 'RIGHT ONE EIGHTH BLOCK'),
	0x5B: ('U+25C6', 'BLACK DIAMOND'),
	0x5C: ('U+1FB80', 'UPPER AND LOWER ONE EIGHTH BLOCK'),
	0x5D: ('U+1FBBB', 'VOIDED GREEK CROSS'),
	0x5E: ('U+1FBBC', 'RIGHT OPEN SQUARED DOT'),
	0x5F: ('U+258F', 'LEFT ONE EIGHTH BLOCK'),
}

MOUSETEXT_ENCODER_INVARIANTS = [
	'U+00A0\t0xA0\t# NO-BREAK SPACE\n',
	'U+00AF\t0x4C\t# MACRON\n',
	'U+2015\t0x53\t# HORIZONTAL BAR\n',
	'U+2026\t0x49\t# HORIZONTAL ELLIPSIS\n',
	'U+2190\t0x48\t# LEFTWARDS ARROW\n',
	'U+2191\t0x4B\t# UPWARDS ARROW\n',
	'U+2192\t0x55\t# RIGHTWARDS ARROW\n',
	'U+2193\t0x4A\t# DOWNWARDS ARROW\n',
	'U+21B2\t0x4D\t# DOWNWARDS ARROW WITH TIP LEFTWARDS\n',
	'U+21B5\t0x4D\t# DOWNWARDS ARROW WITH CORNER LEFTWARDS\n',
	'U+231B\t0x43\t# HOURGLASS\n',
	'U+231B+FE0E\t0x43\t# HOURGLASS\n',
	'U+231B+FE0F\t0x43\t# HOURGLASS\n',
	'U+23B8\t0x5F\t# LEFT VERTICAL BOX LINE\n',
	'U+23B9\t0x5A\t# RIGHT VERTICAL BOX LINE\n',
	'U+23BA\t0x4C\t# HORIZONTAL SCAN LINE-1\n',
	'U+23BD\t0xDF\t# HORIZONTAL SCAN LINE-9\n',
	'U+2500\t0x53\t# BOX DRAWINGS LIGHT HORIZONTAL\n',
	'U+2502\t0xFC\t# BOX DRAWINGS LIGHT VERTICAL\n',
	'U+2581\t0xDF\t# LOWER ONE EIGHTH BLOCK\n',
	'U+2589\t0x4E\t# LEFT SEVEN EIGHTHS BLOCK\n',
	'U+258F\t0x5F\t# LEFT ONE EIGHTH BLOCK\n',
	'U+2592\t0x56\t# MEDIUM SHADE\n',
	'U+2594\t0x4C\t# UPPER ONE EIGHTH BLOCK\n',
	'U+2595\t0x5A\t# RIGHT ONE EIGHTH BLOCK\n',
	'U+25C6\t0x5B\t# BLACK DIAMOND\n',
	'U+2666\t0x5B\t# BLACK DIAMOND SUIT\n',
	'U+2713\t0x44\t# CHECK MARK\n',
	'U+1FB7C\t0x54\t# LEFT AND LOWER ONE EIGHTH BLOCK\n',
	'U+1FB80\t0x5C\t# UPPER AND LOWER ONE EIGHTH BLOCK\n',
	'U+1FB90\t0x57\t# INVERSE MEDIUM SHADE\n',
	'U+1FBB0\t0x42\t# ARROWHEAD-SHAPED POINTER\n',
	'U+1FBB1\t0x45\t# INVERSE CHECK MARK\n',
	'U+1FBB5\t0x4F\t# LEFTWARDS ARROW AND UPPER AND LOWER ONE EIGHTH BLOCK\n',
	'U+1FBB6\t0x50\t# RIGHTWARDS ARROW AND UPPER AND LOWER ONE EIGHTH BLOCK\n',
	'U+1FBB7\t0x51\t# DOWNWARDS ARROW AND RIGHT ONE EIGHTH BLOCK\n',
	'U+1FBB8\t0x52\t# UPWARDS ARROW AND RIGHT ONE EIGHTH BLOCK\n',
	'U+1FBB9\t0x58\t# LEFT HALF FOLDER\n',
	'U+1FBBA\t0x59\t# RIGHT HALF FOLDER\n',
	'U+1FBBB\t0x5D\t# VOIDED GREEK CROSS\n',
	'U+1FBBC\t0x5E\t# RIGHT OPEN SQUARED DOT\n',
	'U+FFC82\t0x56\t# 7x8 Medium Shade\n',
	'U+FFC83\t0x57\t# 7x8 Medium Shade\n',
]

def hex_sort_key(s, __re=re.compile('([Uu][+][0-9A-Fa-f]+)')):
	return [int(t[2:],16) if __re.fullmatch(t) else t.lower() for t in __re.split(s)]

def decoder_ascii_block(lv, bo, co):
	for i in range(32):
		if co + i in lv:
			yield '0x%02X\tU+%04X\t# %s\n' % (bo + i, lv[co + i][0], lv[co + i][1])
		else:
			yield '0x%02X\tU+%04X\t# %s\n' % (bo + i, co + i, unicodedata.name(chr(co + i)))

def encoder_ascii_block(lv, co, bo):
	for i in range(32):
		if co + i == 0x7F:
			yield 'U+007F\t0x%02X\t# DELETE\n' % (bo + i)
			yield 'U+2427\t0x%02X\t# SYMBOL FOR DELETE SQUARE CHECKER BOARD FORM\n' % (bo + i)
		elif co + i in lv:
			yield 'U+%04X\t0x%02X\t# %s\n' % (lv[co + i][0], bo + i, lv[co + i][1])
		else:
			yield 'U+%04X\t0x%02X\t# %s\n' % (co + i, bo + i, unicodedata.name(chr(co + i)))

def write1(file, content):
	print('Writing %s...' % file)
	with open(file, 'w') as f:
		f.write(content)

def write_primary(file, lang):
	lv = {}
	lv.update(CONTROL_INVARIANTS)
	lv.update(LANGUAGE_VARIANTS[lang])
	decoder_lines = []
	decoder_lines.extend(decoder_ascii_block(lv, 0x00, 0x40))
	decoder_lines.extend(decoder_ascii_block(lv, 0x20, 0x20))
	decoder_lines.extend(decoder_ascii_block(lv, 0x40, 0x40))
	decoder_lines.extend(decoder_ascii_block(lv, 0x60, 0x20))
	decoder_lines.extend(decoder_ascii_block(lv, 0x80, 0x00))
	decoder_lines.extend(decoder_ascii_block(lv, 0xA0, 0x20))
	decoder_lines.extend(decoder_ascii_block(lv, 0xC0, 0x40))
	decoder_lines.extend(decoder_ascii_block(lv, 0xE0, 0x60))
	encoder_lines = []
	encoder_lines.extend(encoder_ascii_block(lv, 0x00, 0x80))
	encoder_lines.extend(encoder_ascii_block(lv, 0x20, 0xA0))
	encoder_lines.extend(encoder_ascii_block(lv, 0x40, 0xC0))
	encoder_lines.extend(encoder_ascii_block(lv, 0x60, 0xE0))
	print('Writing %s...' % file)
	with open(file, 'w') as f:
		f.write('# Name: Apple II primary video character set, %s\n' % lv['lang-desc'])
		f.write(datetime.datetime.now().strftime('# Date: %Y-%m-%d\n'))
		f.write('# Auth: %s\n' % AUTHOR)
		f.write('\n' + ''.join(sorted(decoder_lines, key=hex_sort_key)))
		f.write('\n' + ''.join(sorted(encoder_lines, key=hex_sort_key)))

def write_primaries(dir):
	for lang in LANGUAGE_VARIANTS:
		write_primary(os.path.join(dir, 'x-apple2-%s.txt' % lang), lang)
	write1(os.path.join(dir, 'x-apple2.txt'), './x-apple2-us.txt')

def write_alternate(file, lang, model, logo):
	lv = {}
	lv.update(CONTROL_INVARIANTS)
	lv.update(LANGUAGE_VARIANTS[lang])
	mv = {}
	mv.update(MOUSETEXT_DECODER_INVARIANTS)
	mv.update(MODEL_VARIANTS[model])
	mv.update(LOGO_VARIANTS[logo])
	decoder_lines = []
	decoder_lines.extend(decoder_ascii_block(lv, 0x00, 0x40))
	decoder_lines.extend(decoder_ascii_block(lv, 0x20, 0x20))
	for i in range(32):
		decoder_lines.append('0x%02X\t%s\t# %s\n' % (i + 0x40, mv[i + 0x40][0], mv[i + 0x40][1]))
	decoder_lines.extend(decoder_ascii_block(lv, 0x60, 0x60))
	decoder_lines.extend(decoder_ascii_block(lv, 0x80, 0x00))
	decoder_lines.extend(decoder_ascii_block(lv, 0xA0, 0x20))
	decoder_lines.extend(decoder_ascii_block(lv, 0xC0, 0x40))
	decoder_lines.extend(decoder_ascii_block(lv, 0xE0, 0x60))
	encoder_lines = []
	encoder_lines.extend(encoder_ascii_block(lv, 0x00, 0x80))
	encoder_lines.extend(encoder_ascii_block(lv, 0x20, 0xA0))
	encoder_lines.extend(encoder_ascii_block(lv, 0x40, 0xC0))
	encoder_lines.extend(encoder_ascii_block(lv, 0x60, 0xE0))
	encoder_lines.extend(MOUSETEXT_ENCODER_INVARIANTS)
	for m in MODEL_VARIANTS:
		for k in MODEL_VARIANTS[m]:
			if isinstance(k, int):
				encoder_lines.append('%s\t0x%02X\t# %s\n' % (MODEL_VARIANTS[m][k][0], k, MODEL_VARIANTS[m][k][1]))
	for l in LOGO_VARIANTS:
		for k in LOGO_VARIANTS[l]:
			if isinstance(k, int):
				encoder_lines.append('%s\t0x%02X\t# %s\n' % (LOGO_VARIANTS[l][k][0], k, LOGO_VARIANTS[l][k][2]))
	print('Writing %s...' % file)
	with open(file, 'w') as f:
		f.write('# Name: %s alternate video character set, %s, %s\n' % (mv['model-desc'], lv['lang-desc'], mv['logo-desc']))
		f.write(datetime.datetime.now().strftime('# Date: %Y-%m-%d\n'))
		f.write('# Auth: %s\n' % AUTHOR)
		if logo == 'emoji':
			f.write('# Allow-Emoji: U+1F34E, U+1F34F\n')
		f.write('\n' + ''.join(sorted(decoder_lines, key=hex_sort_key)))
		f.write('\n' + ''.join(sorted(encoder_lines, key=hex_sort_key)))

def write_alternates(dir):
	for model in MODEL_VARIANTS:
		for lang in LANGUAGE_VARIANTS:
			for logo in LOGO_VARIANTS:
				write_alternate(os.path.join(dir, 'x-%s-%s-%s.txt' % (model, lang, logo)), lang, model, logo)
			write1(os.path.join(dir, 'x-%s-%s.txt' % (model, lang)), './x-%s-%s-apple.txt' % (model, lang))
		for logo in LOGO_VARIANTS:
			write1(os.path.join(dir, 'x-%s-%s.txt' % (model, logo)), './x-%s-us-%s.txt' % (model, logo))
		write1(os.path.join(dir, 'x-%s.txt' % model), './x-%s-us-apple.txt' % model)
		for alias in MODEL_VARIANTS[model]['model-alias']:
			for lang in LANGUAGE_VARIANTS:
				for logo in LOGO_VARIANTS:
					write1(os.path.join(dir, 'x-%s-%s-%s.txt' % (alias, lang, logo)), './x-%s-%s-%s.txt' % (model, lang, logo))
				write1(os.path.join(dir, 'x-%s-%s.txt' % (alias, lang)), './x-%s-%s.txt' % (model, lang))
			for logo in LOGO_VARIANTS:
				write1(os.path.join(dir, 'x-%s-%s.txt' % (alias, logo)), './x-%s-%s.txt' % (model, logo))
			write1(os.path.join(dir, 'x-%s.txt' % alias), './x-%s.txt' % model)

def main():
	tools = os.path.dirname(os.path.realpath(__file__))
	dir = os.path.join(tools, '..', 'tables')
	write_primaries(dir)
	write_alternates(dir)

if __name__ == '__main__':
	main()
