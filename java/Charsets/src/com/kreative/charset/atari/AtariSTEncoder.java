package com.kreative.charset.atari;

import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetEncoder;

public class AtariSTEncoder extends AbstractCharsetEncoder {
	private final boolean video;
	
	protected AtariSTEncoder(Charset cs, boolean video) {
		super(cs, 1);
		this.video = video;
	}
	
	@Override
	protected int encode(int ch) {
		if (ch == 0) return 0;
		if (video && ch < 0x20) return UNMAPPABLE;
		if (video && ch == 0x7F) return UNMAPPABLE;
		if (ch < 0x80) return ch;
		if (ch < 0xA0) return UNMAPPABLE;
		switch (ch) {
		case 0x00A1:  return 0xAD; // INVERTED EXCLAMATION MARK
		case 0x00A2:  return 0x9B; // CENT SIGN
		case 0x00A3:  return 0x9C; // POUND SIGN
		case 0x00A5:  return 0x9D; // YEN SIGN
		case 0x00A7:  return 0xDD; // SECTION SIGN
		case 0x00A8:  return 0xB9; // DIAERESIS
		case 0x00A9:  return 0xBD; // COPYRIGHT SIGN
		case 0x00AA:  return 0xA6; // FEMININE ORDINAL INDICATOR
		case 0x00AB:  return 0xAE; // LEFT-POINTING DOUBLE ANGLE QUOTATION MARK
		case 0x00AC:  return 0xAA; // NOT SIGN
		case 0x00AE:  return 0xBE; // REGISTERED SIGN
		case 0x00AF:  return 0xFF; // MACRON
		case 0x00B0:  return 0xF8; // DEGREE SIGN
		case 0x00B1:  return 0xF1; // PLUS-MINUS SIGN
		case 0x00B2:  return 0xFD; // SUPERSCRIPT TWO
		case 0x00B3:  return 0xFE; // SUPERSCRIPT THREE
		case 0x00B4:  return 0xBA; // ACUTE ACCENT
		case 0x00B5:  return 0xE6; // MICRO SIGN
		case 0x00B6:  return 0xBC; // PILCROW SIGN
		case 0x00B7:  return 0xFA; // MIDDLE DOT
		case 0x00BA:  return 0xA7; // MASCULINE ORDINAL INDICATOR
		case 0x00BB:  return 0xAF; // RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK
		case 0x00BC:  return 0xAC; // VULGAR FRACTION ONE QUARTER
		case 0x00BD:  return 0xAB; // VULGAR FRACTION ONE HALF
		case 0x00BF:  return 0xA8; // INVERTED QUESTION MARK
		case 0x00C0:  return 0xB6; // LATIN CAPITAL LETTER A WITH GRAVE
		case 0x00C3:  return 0xB7; // LATIN CAPITAL LETTER A WITH TILDE
		case 0x00C4:  return 0x8E; // LATIN CAPITAL LETTER A WITH DIAERESIS
		case 0x00C5:  return 0x8F; // LATIN CAPITAL LETTER A WITH RING ABOVE
		case 0x00C6:  return 0x92; // LATIN CAPITAL LIGATURE AE
		case 0x00C7:  return 0x80; // LATIN CAPITAL LETTER C WITH CEDILLA
		case 0x00C9:  return 0x90; // LATIN CAPITAL LETTER E WITH ACUTE
		case 0x00D1:  return 0xA5; // LATIN CAPITAL LETTER N WITH TILDE
		case 0x00D5:  return 0xB8; // LATIN CAPITAL LETTER O WITH TILDE
		case 0x00D6:  return 0x99; // LATIN CAPITAL LETTER O WITH DIAERESIS
		case 0x00D8:  return 0xB2; // LATIN CAPITAL LETTER O WITH STROKE
		case 0x00DC:  return 0x9A; // LATIN CAPITAL LETTER U WITH DIAERESIS
		case 0x00DF:  return 0x9E; // LATIN SMALL LETTER SHARP S
		case 0x00E0:  return 0x85; // LATIN SMALL LETTER A WITH GRAVE
		case 0x00E1:  return 0xA0; // LATIN SMALL LETTER A WITH ACUTE
		case 0x00E2:  return 0x83; // LATIN SMALL LETTER A WITH CIRCUMFLEX
		case 0x00E3:  return 0xB0; // LATIN SMALL LETTER A WITH TILDE
		case 0x00E4:  return 0x84; // LATIN SMALL LETTER A WITH DIAERESIS
		case 0x00E5:  return 0x86; // LATIN SMALL LETTER A WITH RING ABOVE
		case 0x00E6:  return 0x91; // LATIN SMALL LIGATURE AE
		case 0x00E7:  return 0x87; // LATIN SMALL LETTER C WITH CEDILLA
		case 0x00E8:  return 0x8A; // LATIN SMALL LETTER E WITH GRAVE
		case 0x00E9:  return 0x82; // LATIN SMALL LETTER E WITH ACUTE
		case 0x00EA:  return 0x88; // LATIN SMALL LETTER E WITH CIRCUMFLEX
		case 0x00EB:  return 0x89; // LATIN SMALL LETTER E WITH DIAERESIS
		case 0x00EC:  return 0x8D; // LATIN SMALL LETTER I WITH GRAVE
		case 0x00ED:  return 0xA1; // LATIN SMALL LETTER I WITH ACUTE
		case 0x00EE:  return 0x8C; // LATIN SMALL LETTER I WITH CIRCUMFLEX
		case 0x00EF:  return 0x8B; // LATIN SMALL LETTER I WITH DIAERESIS
		case 0x00F1:  return 0xA4; // LATIN SMALL LETTER N WITH TILDE
		case 0x00F2:  return 0x95; // LATIN SMALL LETTER O WITH GRAVE
		case 0x00F3:  return 0xA2; // LATIN SMALL LETTER O WITH ACUTE
		case 0x00F4:  return 0x93; // LATIN SMALL LETTER O WITH CIRCUMFLEX
		case 0x00F5:  return 0xB1; // LATIN SMALL LETTER O WITH TILDE
		case 0x00F6:  return 0x94; // LATIN SMALL LETTER O WITH DIAERESIS
		case 0x00F7:  return 0xF6; // DIVISION SIGN
		case 0x00F8:  return 0xB3; // LATIN SMALL LETTER O WITH STROKE
		case 0x00F9:  return 0x97; // LATIN SMALL LETTER U WITH GRAVE
		case 0x00FA:  return 0xA3; // LATIN SMALL LETTER U WITH ACUTE
		case 0x00FB:  return 0x96; // LATIN SMALL LETTER U WITH CIRCUMFLEX
		case 0x00FC:  return 0x81; // LATIN SMALL LETTER U WITH DIAERESIS
		case 0x00FF:  return 0x98; // LATIN SMALL LETTER Y WITH DIAERESIS
		case 0x0132:  return 0xC1; // LATIN CAPITAL LIGATURE IJ
		case 0x0133:  return 0xC0; // LATIN SMALL LIGATURE IJ
		case 0x0152:  return 0xB5; // LATIN CAPITAL LIGATURE OE
		case 0x0153:  return 0xB4; // LATIN SMALL LIGATURE OE
		case 0x0192:  return 0x9F; // LATIN SMALL LETTER F WITH HOOK
		case 0x0259:  return video ? 0x1A : UNMAPPABLE; // LATIN SMALL LETTER SCHWA
		case 0x0393:  return 0xE2; // GREEK CAPITAL LETTER GAMMA
		case 0x0398:  return 0xE9; // GREEK CAPITAL LETTER THETA
		case 0x03A3:  return 0xE4; // GREEK CAPITAL LETTER SIGMA
		case 0x03A6:  return 0xE8; // GREEK CAPITAL LETTER PHI
		case 0x03A9:  return 0xEA; // GREEK CAPITAL LETTER OMEGA
		case 0x03B1:  return 0xE0; // GREEK SMALL LETTER ALPHA
		case 0x03B2:  return 0xE1; // GREEK SMALL LETTER BETA
		case 0x03B4:  return 0xEB; // GREEK SMALL LETTER DELTA
		case 0x03C0:  return 0xE3; // GREEK SMALL LETTER PI
		case 0x03C3:  return 0xE5; // GREEK SMALL LETTER SIGMA
		case 0x03C4:  return 0xE7; // GREEK SMALL LETTER TAU
		case 0x03D5:  return 0xED; // GREEK PHI SYMBOL
		case 0x05D0:  return 0xC2; // HEBREW LETTER ALEF
		case 0x05D1:  return 0xC3; // HEBREW LETTER BET
		case 0x05D2:  return 0xC4; // HEBREW LETTER GIMEL
		case 0x05D3:  return 0xC5; // HEBREW LETTER DALET
		case 0x05D4:  return 0xC6; // HEBREW LETTER HE
		case 0x05D5:  return 0xC7; // HEBREW LETTER VAV
		case 0x05D6:  return 0xC8; // HEBREW LETTER ZAYIN
		case 0x05D7:  return 0xC9; // HEBREW LETTER HET
		case 0x05D8:  return 0xCA; // HEBREW LETTER TET
		case 0x05D9:  return 0xCB; // HEBREW LETTER YOD
		case 0x05DA:  return 0xD9; // HEBREW LETTER FINAL KAF
		case 0x05DB:  return 0xCC; // HEBREW LETTER KAF
		case 0x05DC:  return 0xCD; // HEBREW LETTER LAMED
		case 0x05DD:  return 0xDA; // HEBREW LETTER FINAL MEM
		case 0x05DE:  return 0xCE; // HEBREW LETTER MEM
		case 0x05DF:  return 0xD8; // HEBREW LETTER FINAL NUN
		case 0x05E0:  return 0xCF; // HEBREW LETTER NUN
		case 0x05E1:  return 0xD0; // HEBREW LETTER SAMEKH
		case 0x05E2:  return 0xD1; // HEBREW LETTER AYIN
		case 0x05E3:  return 0xDB; // HEBREW LETTER FINAL PE
		case 0x05E4:  return 0xD2; // HEBREW LETTER PE
		case 0x05E5:  return 0xDC; // HEBREW LETTER FINAL TSADI
		case 0x05E6:  return 0xD3; // HEBREW LETTER TSADI
		case 0x05E7:  return 0xD4; // HEBREW LETTER QOF
		case 0x05E8:  return 0xD5; // HEBREW LETTER RESH
		case 0x05E9:  return 0xD6; // HEBREW LETTER SHIN
		case 0x05EA:  return 0xD7; // HEBREW LETTER TAV
		case 0x2020:  return 0xBB; // DAGGER
		case 0x207F:  return 0xFC; // SUPERSCRIPT LATIN SMALL LETTER N
		case 0x2122:  return 0xBF; // TRADE MARK SIGN
		case 0x21E6:  return video ? 0x04 : UNMAPPABLE; // LEFTWARDS WHITE ARROW
		case 0x21E7:  return video ? 0x01 : UNMAPPABLE; // UPWARDS WHITE ARROW
		case 0x21E8:  return video ? 0x03 : UNMAPPABLE; // RIGHTWARDS WHITE ARROW
		case 0x21E9:  return video ? 0x02 : UNMAPPABLE; // DOWNWARDS WHITE ARROW
		case 0x2208:  return 0xEE; // ELEMENT OF
		case 0x2219:  return 0xF9; // BULLET OPERATOR
		case 0x221A:  return 0xFB; // SQUARE ROOT
		case 0x221E:  return 0xDF; // INFINITY
		case 0x2227:  return 0xDE; // LOGICAL AND
		case 0x2229:  return 0xEF; // INTERSECTION
		case 0x222E:  return 0xEC; // CONTOUR INTEGRAL
		case 0x2248:  return 0xF7; // ALMOST EQUAL TO
		case 0x2261:  return 0xF0; // IDENTICAL TO
		case 0x2264:  return 0xF3; // LESS-THAN OR EQUAL TO
		case 0x2265:  return 0xF2; // GREATER-THAN OR EQUAL TO
		case 0x2302:  return video ? 0x7F : UNMAPPABLE; // HOUSE
		case 0x2310:  return 0xA9; // REVERSED NOT SIGN
		case 0x2320:  return 0xF4; // TOP HALF INTEGRAL
		case 0x2321:  return 0xF5; // BOTTOM HALF INTEGRAL
		case 0x240C:  return video ? 0x0C : UNMAPPABLE; // SYMBOL FOR FORM FEED
		case 0x240D:  return video ? 0x0D : UNMAPPABLE; // SYMBOL FOR CARRIAGE RETURN
		case 0x241B:  return video ? 0x1B : UNMAPPABLE; // SYMBOL FOR ESCAPE
		case 0x266A:  return video ? 0x0B : UNMAPPABLE; // EIGHTH NOTE
		case 0x2713:  return video ? 0x08 : UNMAPPABLE; // CHECK MARK
		case 0xF82A:  return video ? 0x0E : UNMAPPABLE; // Atari logo, left half
		case 0xF82B:  return video ? 0x0F : UNMAPPABLE; // Atari logo, right half
		case 0xF82C:  return video ? 0x1C : UNMAPPABLE; // Image of J.R. "Bob" Dobbs, upper left quarter
		case 0xF82D:  return video ? 0x1D : UNMAPPABLE; // Image of J.R. "Bob" Dobbs, upper right quarter
		case 0xF82E:  return video ? 0x1E : UNMAPPABLE; // Image of J.R. "Bob" Dobbs, lower left quarter
		case 0xF82F:  return video ? 0x1F : UNMAPPABLE; // Image of J.R. "Bob" Dobbs, lower right quarter
		case 0x1F514: return video ? 0x0A : UNMAPPABLE; // BELL
		case 0x1F552: return video ? 0x09 : UNMAPPABLE; // CLOCK FACE THREE OCLOCK
		case 0x1FBBD: return video ? 0x05 : UNMAPPABLE; // NEGATIVE DIAGONAL CROSS
		case 0x1FBBE: return video ? 0x06 : UNMAPPABLE; // NEGATIVE DIAGONAL MIDDLE RIGHT TO LOWER CENTRE
		case 0x1FBBF: return video ? 0x07 : UNMAPPABLE; // NEGATIVE DIAGONAL DIAMOND
		case 0x1FBF0: return video ? 0x10 : UNMAPPABLE; // SEGMENTED DIGIT ZERO
		case 0x1FBF1: return video ? 0x11 : UNMAPPABLE; // SEGMENTED DIGIT ONE
		case 0x1FBF2: return video ? 0x12 : UNMAPPABLE; // SEGMENTED DIGIT TWO
		case 0x1FBF3: return video ? 0x13 : UNMAPPABLE; // SEGMENTED DIGIT THREE
		case 0x1FBF4: return video ? 0x14 : UNMAPPABLE; // SEGMENTED DIGIT FOUR
		case 0x1FBF5: return video ? 0x15 : UNMAPPABLE; // SEGMENTED DIGIT FIVE
		case 0x1FBF6: return video ? 0x16 : UNMAPPABLE; // SEGMENTED DIGIT SIX
		case 0x1FBF7: return video ? 0x17 : UNMAPPABLE; // SEGMENTED DIGIT SEVEN
		case 0x1FBF8: return video ? 0x18 : UNMAPPABLE; // SEGMENTED DIGIT EIGHT
		case 0x1FBF9: return video ? 0x19 : UNMAPPABLE; // SEGMENTED DIGIT NINE
		default: return UNMAPPABLE;
		}
	}
}
