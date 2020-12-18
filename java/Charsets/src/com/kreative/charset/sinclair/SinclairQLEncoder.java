package com.kreative.charset.sinclair;

import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetEncoder;

public class SinclairQLEncoder extends AbstractCharsetEncoder {
	private final boolean video;
	
	protected SinclairQLEncoder(Charset cs, boolean video) {
		super(cs, 1);
		this.video = video;
	}
	
	@Override
	protected int encode(int ch) {
		if (ch == 0x00 || ch == 0x0A) return ch;
		if (video && ch < 0x20) return UNMAPPABLE;
		if (ch != 0x60 && ch < 0x7F) return ch;
		switch (ch) {
		case 0x0060:  return 0x9F; // GRAVE ACCENT
		case 0x00A1:  return 0xB3; // INVERTED EXCLAMATION MARK
		case 0x00A2:  return 0x9D; // CENT SIGN
		case 0x00A3:  return 0x60; // POUND SIGN
		case 0x00A4:  return 0xB7; // CURRENCY SIGN
		case 0x00A5:  return 0x9E; // YEN SIGN
		case 0x00A6:  return 0xEA; // BROKEN BAR
		case 0x00A7:  return 0xB6; // SECTION SIGN
		case 0x00A9:  return 0x7F; // COPYRIGHT SIGN
		case 0x00AB:  return 0xB8; // LEFT-POINTING DOUBLE ANGLE QUOTATION MARK
		case 0x00AE:  return 0xD2; // REGISTERED SIGN
		case 0x00B0:  return 0xBA; // DEGREE SIGN
		case 0x00B1:  return 0xD9; // PLUS-MINUS SIGN
		case 0x00B2:  return video ? 0x12 : UNMAPPABLE; // SUPERSCRIPT TWO
		case 0x00B3:  return video ? 0x13 : UNMAPPABLE; // SUPERSCRIPT THREE
		case 0x00B9:  return video ? 0x11 : UNMAPPABLE; // SUPERSCRIPT ONE
		case 0x00BB:  return 0xB9; // RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK
		case 0x00BC:  return 0xEC; // VULGAR FRACTION ONE QUARTER
		case 0x00BD:  return 0xED; // VULGAR FRACTION ONE HALF
		case 0x00BE:  return 0xEE; // VULGAR FRACTION THREE QUARTERS
		case 0x00BF:  return 0xB4; // INVERTED QUESTION MARK
		case 0x00C3:  return 0xA1; // LATIN CAPITAL LETTER A WITH TILDE
		case 0x00C4:  return 0xA0; // LATIN CAPITAL LETTER A WITH DIAERESIS
		case 0x00C5:  return 0xA2; // LATIN CAPITAL LETTER A WITH RING ABOVE
		case 0x00C6:  return 0xAA; // LATIN CAPITAL LETTER AE
		case 0x00C7:  return 0xA8; // LATIN CAPITAL LETTER C WITH CEDILLA
		case 0x00C9:  return 0xA3; // LATIN CAPITAL LETTER E WITH ACUTE
		case 0x00D1:  return 0xA9; // LATIN CAPITAL LETTER N WITH TILDE
		case 0x00D5:  return 0xA5; // LATIN CAPITAL LETTER O WITH TILDE
		case 0x00D6:  return 0xA4; // LATIN CAPITAL LETTER O WITH DIAERESIS
		case 0x00D8:  return 0xA6; // LATIN CAPITAL LETTER O WITH STROKE
		case 0x00DC:  return 0xA7; // LATIN CAPITAL LETTER U WITH DIAERESIS
		case 0x00DF:  return 0x9C; // LATIN SMALL LETTER SHARP S
		case 0x00E0:  return 0x8D; // LATIN SMALL LETTER A WITH GRAVE
		case 0x00E1:  return 0x8C; // LATIN SMALL LETTER A WITH ACUTE
		case 0x00E2:  return 0x8E; // LATIN SMALL LETTER A WITH CIRCUMFLEX
		case 0x00E3:  return 0x81; // LATIN SMALL LETTER A WITH TILDE
		case 0x00E4:  return 0x80; // LATIN SMALL LETTER A WITH DIAERESIS
		case 0x00E5:  return 0x82; // LATIN SMALL LETTER A WITH RING ABOVE
		case 0x00E6:  return 0x8A; // LATIN SMALL LETTER AE
		case 0x00E7:  return 0x88; // LATIN SMALL LETTER C WITH CEDILLA
		case 0x00E8:  return 0x90; // LATIN SMALL LETTER E WITH GRAVE
		case 0x00E9:  return 0x83; // LATIN SMALL LETTER E WITH ACUTE
		case 0x00EA:  return 0x91; // LATIN SMALL LETTER E WITH CIRCUMFLEX
		case 0x00EB:  return 0x8F; // LATIN SMALL LETTER E WITH DIAERESIS
		case 0x00EC:  return 0x94; // LATIN SMALL LETTER I WITH GRAVE
		case 0x00ED:  return 0x93; // LATIN SMALL LETTER I WITH ACUTE
		case 0x00EE:  return 0x95; // LATIN SMALL LETTER I WITH CIRCUMFLEX
		case 0x00EF:  return 0x92; // LATIN SMALL LETTER I WITH DIAERESIS
		case 0x00F1:  return 0x89; // LATIN SMALL LETTER N WITH TILDE
		case 0x00F2:  return 0x97; // LATIN SMALL LETTER O WITH GRAVE
		case 0x00F3:  return 0x96; // LATIN SMALL LETTER O WITH ACUTE
		case 0x00F4:  return 0x98; // LATIN SMALL LETTER O WITH CIRCUMFLEX
		case 0x00F5:  return 0x85; // LATIN SMALL LETTER O WITH TILDE
		case 0x00F6:  return 0x84; // LATIN SMALL LETTER O WITH DIAERESIS
		case 0x00F7:  return 0xBB; // DIVISION SIGN
		case 0x00F8:  return 0x86; // LATIN SMALL LETTER O WITH STROKE
		case 0x00F9:  return 0x9A; // LATIN SMALL LETTER U WITH GRAVE
		case 0x00FA:  return 0x99; // LATIN SMALL LETTER U WITH ACUTE
		case 0x00FB:  return 0x9B; // LATIN SMALL LETTER U WITH CIRCUMFLEX
		case 0x00FC:  return 0x87; // LATIN SMALL LETTER U WITH DIAERESIS
		case 0x0127:  return 0xE8; // LATIN SMALL LETTER H WITH STROKE
		case 0x0152:  return 0xAB; // LATIN CAPITAL LIGATURE OE
		case 0x0153:  return 0x8B; // LATIN SMALL LIGATURE OE
		case 0x0393:  return 0xC7; // GREEK CAPITAL LETTER GAMMA
		case 0x0394:  return 0xC4; // GREEK CAPITAL LETTER DELTA
		case 0x0398:  return 0xD4; // GREEK CAPITAL LETTER THETA
		case 0x039B:  return 0xCC; // GREEK CAPITAL LETTER LAMDA
		case 0x039E:  return 0xD8; // GREEK CAPITAL LETTER XI
		case 0x03A0:  return 0xD0; // GREEK CAPITAL LETTER PI
		case 0x03A3:  return 0xD3; // GREEK CAPITAL LETTER SIGMA
		case 0x03A5:  return 0xD5; // GREEK CAPITAL LETTER UPSILON
		case 0x03A6:  return 0xC6; // GREEK CAPITAL LETTER PHI
		case 0x03A8:  return 0xD1; // GREEK CAPITAL LETTER PSI
		case 0x03A9:  return 0xCF; // GREEK CAPITAL LETTER OMEGA
		case 0x03B1:  return 0xAC; // GREEK SMALL LETTER ALPHA
		case 0x03B3:  return 0xE7; // GREEK SMALL LETTER GAMMA
		case 0x03B4:  return 0xAD; // GREEK SMALL LETTER DELTA
		case 0x03B5:  return 0xE5; // GREEK SMALL LETTER EPSILON
		case 0x03B6:  return 0xFA; // GREEK SMALL LETTER ZETA
		case 0x03B7:  return 0xC5; // GREEK SMALL LETTER ETA
		case 0x03B8:  return 0xAE; // GREEK SMALL LETTER THETA
		case 0x03B9:  return 0xE9; // GREEK SMALL LETTER IOTA
		case 0x03BA:  return 0xEB; // GREEK SMALL LETTER KAPPA
		case 0x03BB:  return 0xAF; // GREEK SMALL LETTER LAMDA
		case 0x03BC:  return 0xB0; // GREEK SMALL LETTER MU
		case 0x03BE:  return 0xF8; // GREEK SMALL LETTER XI
		case 0x03C0:  return 0xB1; // GREEK SMALL LETTER PI
		case 0x03C1:  return 0xF2; // GREEK SMALL LETTER RHO
		case 0x03C2:  return 0xDA; // GREEK SMALL LETTER FINAL SIGMA
		case 0x03C3:  return 0xF3; // GREEK SMALL LETTER SIGMA
		case 0x03C4:  return 0xF4; // GREEK SMALL LETTER TAU
		case 0x03C5:  return 0xF5; // GREEK SMALL LETTER UPSILON
		case 0x03C7:  return 0xE3; // GREEK SMALL LETTER CHI
		case 0x03C8:  return 0xF0; // GREEK SMALL LETTER PSI
		case 0x03C9:  return 0xEF; // GREEK SMALL LETTER OMEGA
		case 0x03D5:  return 0xB2; // GREEK PHI SYMBOL
		case 0x1D43:  return video ? 0x1A : UNMAPPABLE; // MODIFIER LETTER SMALL A
		case 0x1D47:  return video ? 0x1B : UNMAPPABLE; // MODIFIER LETTER SMALL B
		case 0x1D48:  return video ? 0x1D : UNMAPPABLE; // MODIFIER LETTER SMALL D
		case 0x1D49:  return video ? 0x1E : UNMAPPABLE; // MODIFIER LETTER SMALL E
		case 0x1D9C:  return video ? 0x1C : UNMAPPABLE; // MODIFIER LETTER SMALL C
		case 0x1DA0:  return video ? 0x1F : UNMAPPABLE; // MODIFIER LETTER SMALL F
		case 0x2020:  return 0xD6; // DAGGER
		case 0x2021:  return 0xD7; // DOUBLE DAGGER
		case 0x2022:  return 0xE2; // BULLET
		case 0x2026:  return 0xF9; // HORIZONTAL ELLIPSIS
		case 0x2070:  return video ? 0x10 : UNMAPPABLE; // SUPERSCRIPT ZERO
		case 0x2074:  return video ? 0x14 : UNMAPPABLE; // SUPERSCRIPT FOUR
		case 0x2075:  return video ? 0x15 : UNMAPPABLE; // SUPERSCRIPT FIVE
		case 0x2076:  return video ? 0x16 : UNMAPPABLE; // SUPERSCRIPT SIX
		case 0x2077:  return video ? 0x17 : UNMAPPABLE; // SUPERSCRIPT SEVEN
		case 0x2078:  return video ? 0x18 : UNMAPPABLE; // SUPERSCRIPT EIGHT
		case 0x2079:  return video ? 0x19 : UNMAPPABLE; // SUPERSCRIPT NINE
		case 0x20A3:  return 0xE6; // FRENCH FRANC SIGN
		case 0x2190:  return 0xBC; // LEFTWARDS ARROW
		case 0x2191:  return 0xBE; // UPWARDS ARROW
		case 0x2192:  return 0xBD; // RIGHTWARDS ARROW
		case 0x2193:  return 0xBF; // DOWNWARDS ARROW
		case 0x2196:  return 0xC0; // NORTH WEST ARROW
		case 0x2197:  return 0xC1; // NORTH EAST ARROW
		case 0x2198:  return 0xC3; // SOUTH EAST ARROW
		case 0x2199:  return 0xC2; // SOUTH WEST ARROW
		case 0x21D2:  return 0xF1; // RIGHTWARDS DOUBLE ARROW
		case 0x2202:  return 0xE4; // PARTIAL DIFFERENTIAL
		case 0x2206:  return 0xC4; // INCREMENT
		case 0x2207:  return 0xCD; // NABLA
		case 0x221A:  return 0xF6; // SQUARE ROOT
		case 0x221B:  return 0xF7; // CUBE ROOT
		case 0x221E:  return 0xCE; // INFINITY
		case 0x2248:  return 0xDF; // ALMOST EQUAL TO
		case 0x2260:  return 0xDD; // NOT EQUAL TO
		case 0x2261:  return 0xDB; // IDENTICAL TO
		case 0x2264:  return 0xDC; // LESS-THAN OR EQUAL TO
		case 0x2265:  return 0xDE; // GREATER-THAN OR EQUAL TO
		case 0x2320:  return 0xFB; // TOP HALF INTEGRAL
		case 0x2321:  return 0xFD; // BOTTOM HALF INTEGRAL
		case 0x23AE:  return 0xFC; // INTEGRAL EXTENSION
		case 0x2406:  return video ? 0x06 : UNMAPPABLE; // SYMBOL FOR ACKNOWLEDGE
		case 0x2408:  return video ? 0x08 : UNMAPPABLE; // SYMBOL FOR BACKSPACE
		case 0x2409:  return video ? 0x09 : UNMAPPABLE; // SYMBOL FOR HORIZONTAL TABULATION
		case 0x240B:  return video ? 0x0B : UNMAPPABLE; // SYMBOL FOR VERTICAL TABULATION
		case 0x240C:  return video ? 0x0C : UNMAPPABLE; // SYMBOL FOR FORM FEED
		case 0x240D:  return video ? 0x0D : UNMAPPABLE; // SYMBOL FOR CARRIAGE RETURN
		case 0x240E:  return video ? 0x0E : UNMAPPABLE; // SYMBOL FOR SHIFT OUT
		case 0x240F:  return video ? 0x0F : UNMAPPABLE; // SYMBOL FOR SHIFT IN
		case 0x2591:  return 0xFE; // LIGHT SHADE
		case 0x2592:  return 0xFF; // MEDIUM SHADE
		case 0x25A0:  return 0xE1; // BLACK SQUARE
		case 0x25A1:  return 0xE0; // WHITE SQUARE
		case 0x25CF:  return 0xE2; // BLACK CIRCLE
		case 0x2660:  return 0xC8; // BLACK SPADE SUIT
		case 0x2663:  return 0xCB; // BLACK CLUB SUIT
		case 0x2665:  return 0xC9; // BLACK HEART SUIT
		case 0x2666:  return 0xCA; // BLACK DIAMOND SUIT
		case 0x266A:  return video ? 0x07 : UNMAPPABLE; // EIGHTH NOTE
		case 0xF7F1:  return video ? 0x01 : UNMAPPABLE; // F1
		case 0xF7F2:  return video ? 0x02 : UNMAPPABLE; // F2
		case 0xF7F3:  return video ? 0x03 : UNMAPPABLE; // F3
		case 0xF7F4:  return video ? 0x04 : UNMAPPABLE; // F4
		case 0xF7F5:  return video ? 0x05 : UNMAPPABLE; // F5
		case 0xFF142: return 0xB5; // QL
		default:      return UNMAPPABLE;
		}
	}
}
