package com.kreative.charset.sinclair;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class SinclairQLEncoder extends CharsetEncoder {
	private final boolean video;
	
	protected SinclairQLEncoder(Charset cs, boolean video) {
		super(cs, 1, 1);
		this.video = video;
	}
	
	protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
		while (in.hasRemaining()) {
			if (!out.hasRemaining()) return CoderResult.OVERFLOW;
			int ch = in.get() & 0xFFFF;
			if (Character.isHighSurrogate((char)ch)) {
				if (in.hasRemaining()) {
					int cl = in.get() & 0xFFFF;
					if (Character.isLowSurrogate((char)cl)) {
						ch = Character.toCodePoint((char)ch, (char)cl);
					} else {
						in.position(in.position() - 2);
						return CoderResult.unmappableForLength(1);
					}
				} else {
					in.position(in.position() - 1);
					return CoderResult.UNDERFLOW;
				}
			}
			if (ch == 0x00 || ch == 0x0A) out.put((byte)ch);
			else if (video && ch < 0x20) return unmappable(in, ch);
			else if (ch != 0x60 && ch < 0x7F) out.put((byte)ch);
			else switch (ch) {
			case 0x0060:  out.put((byte)0x9F); break; // GRAVE ACCENT
			case 0x00A1:  out.put((byte)0xB3); break; // INVERTED EXCLAMATION MARK
			case 0x00A2:  out.put((byte)0x9D); break; // CENT SIGN
			case 0x00A3:  out.put((byte)0x60); break; // POUND SIGN
			case 0x00A4:  out.put((byte)0xB7); break; // CURRENCY SIGN
			case 0x00A5:  out.put((byte)0x9E); break; // YEN SIGN
			case 0x00A6:  out.put((byte)0xEA); break; // BROKEN BAR
			case 0x00A7:  out.put((byte)0xB6); break; // SECTION SIGN
			case 0x00A9:  out.put((byte)0x7F); break; // COPYRIGHT SIGN
			case 0x00AB:  out.put((byte)0xB8); break; // LEFT-POINTING DOUBLE ANGLE QUOTATION MARK
			case 0x00AE:  out.put((byte)0xD2); break; // REGISTERED SIGN
			case 0x00B0:  out.put((byte)0xBA); break; // DEGREE SIGN
			case 0x00B1:  out.put((byte)0xD9); break; // PLUS-MINUS SIGN
			case 0x00B2:  if (video) out.put((byte)0x12); else return unmappable(in, ch); break; // SUPERSCRIPT TWO
			case 0x00B3:  if (video) out.put((byte)0x13); else return unmappable(in, ch); break; // SUPERSCRIPT THREE
			case 0x00B9:  if (video) out.put((byte)0x11); else return unmappable(in, ch); break; // SUPERSCRIPT ONE
			case 0x00BB:  out.put((byte)0xB9); break; // RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK
			case 0x00BC:  out.put((byte)0xEC); break; // VULGAR FRACTION ONE QUARTER
			case 0x00BD:  out.put((byte)0xED); break; // VULGAR FRACTION ONE HALF
			case 0x00BE:  out.put((byte)0xEE); break; // VULGAR FRACTION THREE QUARTERS
			case 0x00BF:  out.put((byte)0xB4); break; // INVERTED QUESTION MARK
			case 0x00C3:  out.put((byte)0xA1); break; // LATIN CAPITAL LETTER A WITH TILDE
			case 0x00C4:  out.put((byte)0xA0); break; // LATIN CAPITAL LETTER A WITH DIAERESIS
			case 0x00C5:  out.put((byte)0xA2); break; // LATIN CAPITAL LETTER A WITH RING ABOVE
			case 0x00C6:  out.put((byte)0xAA); break; // LATIN CAPITAL LETTER AE
			case 0x00C7:  out.put((byte)0xA8); break; // LATIN CAPITAL LETTER C WITH CEDILLA
			case 0x00C9:  out.put((byte)0xA3); break; // LATIN CAPITAL LETTER E WITH ACUTE
			case 0x00D1:  out.put((byte)0xA9); break; // LATIN CAPITAL LETTER N WITH TILDE
			case 0x00D5:  out.put((byte)0xA5); break; // LATIN CAPITAL LETTER O WITH TILDE
			case 0x00D6:  out.put((byte)0xA4); break; // LATIN CAPITAL LETTER O WITH DIAERESIS
			case 0x00D8:  out.put((byte)0xA6); break; // LATIN CAPITAL LETTER O WITH STROKE
			case 0x00DC:  out.put((byte)0xA7); break; // LATIN CAPITAL LETTER U WITH DIAERESIS
			case 0x00DF:  out.put((byte)0x9C); break; // LATIN SMALL LETTER SHARP S
			case 0x00E0:  out.put((byte)0x8D); break; // LATIN SMALL LETTER A WITH GRAVE
			case 0x00E1:  out.put((byte)0x8C); break; // LATIN SMALL LETTER A WITH ACUTE
			case 0x00E2:  out.put((byte)0x8E); break; // LATIN SMALL LETTER A WITH CIRCUMFLEX
			case 0x00E3:  out.put((byte)0x81); break; // LATIN SMALL LETTER A WITH TILDE
			case 0x00E4:  out.put((byte)0x80); break; // LATIN SMALL LETTER A WITH DIAERESIS
			case 0x00E5:  out.put((byte)0x82); break; // LATIN SMALL LETTER A WITH RING ABOVE
			case 0x00E6:  out.put((byte)0x8A); break; // LATIN SMALL LETTER AE
			case 0x00E7:  out.put((byte)0x88); break; // LATIN SMALL LETTER C WITH CEDILLA
			case 0x00E8:  out.put((byte)0x90); break; // LATIN SMALL LETTER E WITH GRAVE
			case 0x00E9:  out.put((byte)0x83); break; // LATIN SMALL LETTER E WITH ACUTE
			case 0x00EA:  out.put((byte)0x91); break; // LATIN SMALL LETTER E WITH CIRCUMFLEX
			case 0x00EB:  out.put((byte)0x8F); break; // LATIN SMALL LETTER E WITH DIAERESIS
			case 0x00EC:  out.put((byte)0x94); break; // LATIN SMALL LETTER I WITH GRAVE
			case 0x00ED:  out.put((byte)0x93); break; // LATIN SMALL LETTER I WITH ACUTE
			case 0x00EE:  out.put((byte)0x95); break; // LATIN SMALL LETTER I WITH CIRCUMFLEX
			case 0x00EF:  out.put((byte)0x92); break; // LATIN SMALL LETTER I WITH DIAERESIS
			case 0x00F1:  out.put((byte)0x89); break; // LATIN SMALL LETTER N WITH TILDE
			case 0x00F2:  out.put((byte)0x97); break; // LATIN SMALL LETTER O WITH GRAVE
			case 0x00F3:  out.put((byte)0x96); break; // LATIN SMALL LETTER O WITH ACUTE
			case 0x00F4:  out.put((byte)0x98); break; // LATIN SMALL LETTER O WITH CIRCUMFLEX
			case 0x00F5:  out.put((byte)0x85); break; // LATIN SMALL LETTER O WITH TILDE
			case 0x00F6:  out.put((byte)0x84); break; // LATIN SMALL LETTER O WITH DIAERESIS
			case 0x00F7:  out.put((byte)0xBB); break; // DIVISION SIGN
			case 0x00F8:  out.put((byte)0x86); break; // LATIN SMALL LETTER O WITH STROKE
			case 0x00F9:  out.put((byte)0x9A); break; // LATIN SMALL LETTER U WITH GRAVE
			case 0x00FA:  out.put((byte)0x99); break; // LATIN SMALL LETTER U WITH ACUTE
			case 0x00FB:  out.put((byte)0x9B); break; // LATIN SMALL LETTER U WITH CIRCUMFLEX
			case 0x00FC:  out.put((byte)0x87); break; // LATIN SMALL LETTER U WITH DIAERESIS
			case 0x0127:  out.put((byte)0xE8); break; // LATIN SMALL LETTER H WITH STROKE
			case 0x0152:  out.put((byte)0xAB); break; // LATIN CAPITAL LIGATURE OE
			case 0x0153:  out.put((byte)0x8B); break; // LATIN SMALL LIGATURE OE
			case 0x0393:  out.put((byte)0xC7); break; // GREEK CAPITAL LETTER GAMMA
			case 0x0394:  out.put((byte)0xC4); break; // GREEK CAPITAL LETTER DELTA
			case 0x0398:  out.put((byte)0xD4); break; // GREEK CAPITAL LETTER THETA
			case 0x039B:  out.put((byte)0xCC); break; // GREEK CAPITAL LETTER LAMDA
			case 0x039E:  out.put((byte)0xD8); break; // GREEK CAPITAL LETTER XI
			case 0x03A0:  out.put((byte)0xD0); break; // GREEK CAPITAL LETTER PI
			case 0x03A3:  out.put((byte)0xD3); break; // GREEK CAPITAL LETTER SIGMA
			case 0x03A5:  out.put((byte)0xD5); break; // GREEK CAPITAL LETTER UPSILON
			case 0x03A6:  out.put((byte)0xC6); break; // GREEK CAPITAL LETTER PHI
			case 0x03A8:  out.put((byte)0xD1); break; // GREEK CAPITAL LETTER PSI
			case 0x03A9:  out.put((byte)0xCF); break; // GREEK CAPITAL LETTER OMEGA
			case 0x03B1:  out.put((byte)0xAC); break; // GREEK SMALL LETTER ALPHA
			case 0x03B3:  out.put((byte)0xE7); break; // GREEK SMALL LETTER GAMMA
			case 0x03B4:  out.put((byte)0xAD); break; // GREEK SMALL LETTER DELTA
			case 0x03B5:  out.put((byte)0xE5); break; // GREEK SMALL LETTER EPSILON
			case 0x03B6:  out.put((byte)0xFA); break; // GREEK SMALL LETTER ZETA
			case 0x03B7:  out.put((byte)0xC5); break; // GREEK SMALL LETTER ETA
			case 0x03B8:  out.put((byte)0xAE); break; // GREEK SMALL LETTER THETA
			case 0x03B9:  out.put((byte)0xE9); break; // GREEK SMALL LETTER IOTA
			case 0x03BA:  out.put((byte)0xEB); break; // GREEK SMALL LETTER KAPPA
			case 0x03BB:  out.put((byte)0xAF); break; // GREEK SMALL LETTER LAMDA
			case 0x03BC:  out.put((byte)0xB0); break; // GREEK SMALL LETTER MU
			case 0x03BE:  out.put((byte)0xF8); break; // GREEK SMALL LETTER XI
			case 0x03C0:  out.put((byte)0xB1); break; // GREEK SMALL LETTER PI
			case 0x03C1:  out.put((byte)0xF2); break; // GREEK SMALL LETTER RHO
			case 0x03C2:  out.put((byte)0xDA); break; // GREEK SMALL LETTER FINAL SIGMA
			case 0x03C3:  out.put((byte)0xF3); break; // GREEK SMALL LETTER SIGMA
			case 0x03C4:  out.put((byte)0xF4); break; // GREEK SMALL LETTER TAU
			case 0x03C5:  out.put((byte)0xF5); break; // GREEK SMALL LETTER UPSILON
			case 0x03C7:  out.put((byte)0xE3); break; // GREEK SMALL LETTER CHI
			case 0x03C8:  out.put((byte)0xF0); break; // GREEK SMALL LETTER PSI
			case 0x03C9:  out.put((byte)0xEF); break; // GREEK SMALL LETTER OMEGA
			case 0x03D5:  out.put((byte)0xB2); break; // GREEK PHI SYMBOL
			case 0x1D43:  if (video) out.put((byte)0x1A); else return unmappable(in, ch); break; // MODIFIER LETTER SMALL A
			case 0x1D47:  if (video) out.put((byte)0x1B); else return unmappable(in, ch); break; // MODIFIER LETTER SMALL B
			case 0x1D48:  if (video) out.put((byte)0x1D); else return unmappable(in, ch); break; // MODIFIER LETTER SMALL D
			case 0x1D49:  if (video) out.put((byte)0x1E); else return unmappable(in, ch); break; // MODIFIER LETTER SMALL E
			case 0x1D9C:  if (video) out.put((byte)0x1C); else return unmappable(in, ch); break; // MODIFIER LETTER SMALL C
			case 0x1DA0:  if (video) out.put((byte)0x1F); else return unmappable(in, ch); break; // MODIFIER LETTER SMALL F
			case 0x2020:  out.put((byte)0xD6); break; // DAGGER
			case 0x2021:  out.put((byte)0xD7); break; // DOUBLE DAGGER
			case 0x2022:  out.put((byte)0xE2); break; // BULLET
			case 0x2026:  out.put((byte)0xF9); break; // HORIZONTAL ELLIPSIS
			case 0x2070:  if (video) out.put((byte)0x10); else return unmappable(in, ch); break; // SUPERSCRIPT ZERO
			case 0x2074:  if (video) out.put((byte)0x14); else return unmappable(in, ch); break; // SUPERSCRIPT FOUR
			case 0x2075:  if (video) out.put((byte)0x15); else return unmappable(in, ch); break; // SUPERSCRIPT FIVE
			case 0x2076:  if (video) out.put((byte)0x16); else return unmappable(in, ch); break; // SUPERSCRIPT SIX
			case 0x2077:  if (video) out.put((byte)0x17); else return unmappable(in, ch); break; // SUPERSCRIPT SEVEN
			case 0x2078:  if (video) out.put((byte)0x18); else return unmappable(in, ch); break; // SUPERSCRIPT EIGHT
			case 0x2079:  if (video) out.put((byte)0x19); else return unmappable(in, ch); break; // SUPERSCRIPT NINE
			case 0x20A3:  out.put((byte)0xE6); break; // FRENCH FRANC SIGN
			case 0x2190:  out.put((byte)0xBC); break; // LEFTWARDS ARROW
			case 0x2191:  out.put((byte)0xBE); break; // UPWARDS ARROW
			case 0x2192:  out.put((byte)0xBD); break; // RIGHTWARDS ARROW
			case 0x2193:  out.put((byte)0xBF); break; // DOWNWARDS ARROW
			case 0x2196:  out.put((byte)0xC0); break; // NORTH WEST ARROW
			case 0x2197:  out.put((byte)0xC1); break; // NORTH EAST ARROW
			case 0x2198:  out.put((byte)0xC3); break; // SOUTH EAST ARROW
			case 0x2199:  out.put((byte)0xC2); break; // SOUTH WEST ARROW
			case 0x21D2:  out.put((byte)0xF1); break; // RIGHTWARDS DOUBLE ARROW
			case 0x2202:  out.put((byte)0xE4); break; // PARTIAL DIFFERENTIAL
			case 0x2206:  out.put((byte)0xC4); break; // INCREMENT
			case 0x2207:  out.put((byte)0xCD); break; // NABLA
			case 0x221A:  out.put((byte)0xF6); break; // SQUARE ROOT
			case 0x221B:  out.put((byte)0xF7); break; // CUBE ROOT
			case 0x221E:  out.put((byte)0xCE); break; // INFINITY
			case 0x2248:  out.put((byte)0xDF); break; // ALMOST EQUAL TO
			case 0x2260:  out.put((byte)0xDD); break; // NOT EQUAL TO
			case 0x2261:  out.put((byte)0xDB); break; // IDENTICAL TO
			case 0x2264:  out.put((byte)0xDC); break; // LESS-THAN OR EQUAL TO
			case 0x2265:  out.put((byte)0xDE); break; // GREATER-THAN OR EQUAL TO
			case 0x2320:  out.put((byte)0xFB); break; // TOP HALF INTEGRAL
			case 0x2321:  out.put((byte)0xFD); break; // BOTTOM HALF INTEGRAL
			case 0x23AE:  out.put((byte)0xFC); break; // INTEGRAL EXTENSION
			case 0x2406:  if (video) out.put((byte)0x06); else return unmappable(in, ch); break; // SYMBOL FOR ACKNOWLEDGE
			case 0x2408:  if (video) out.put((byte)0x08); else return unmappable(in, ch); break; // SYMBOL FOR BACKSPACE
			case 0x2409:  if (video) out.put((byte)0x09); else return unmappable(in, ch); break; // SYMBOL FOR HORIZONTAL TABULATION
			case 0x240B:  if (video) out.put((byte)0x0B); else return unmappable(in, ch); break; // SYMBOL FOR VERTICAL TABULATION
			case 0x240C:  if (video) out.put((byte)0x0C); else return unmappable(in, ch); break; // SYMBOL FOR FORM FEED
			case 0x240D:  if (video) out.put((byte)0x0D); else return unmappable(in, ch); break; // SYMBOL FOR CARRIAGE RETURN
			case 0x240E:  if (video) out.put((byte)0x0E); else return unmappable(in, ch); break; // SYMBOL FOR SHIFT OUT
			case 0x240F:  if (video) out.put((byte)0x0F); else return unmappable(in, ch); break; // SYMBOL FOR SHIFT IN
			case 0x2591:  out.put((byte)0xFE); break; // LIGHT SHADE
			case 0x2592:  out.put((byte)0xFF); break; // MEDIUM SHADE
			case 0x25A0:  out.put((byte)0xE1); break; // BLACK SQUARE
			case 0x25A1:  out.put((byte)0xE0); break; // WHITE SQUARE
			case 0x25CF:  out.put((byte)0xE2); break; // BLACK CIRCLE
			case 0x2660:  out.put((byte)0xC8); break; // BLACK SPADE SUIT
			case 0x2663:  out.put((byte)0xCB); break; // BLACK CLUB SUIT
			case 0x2665:  out.put((byte)0xC9); break; // BLACK HEART SUIT
			case 0x2666:  out.put((byte)0xCA); break; // BLACK DIAMOND SUIT
			case 0x266A:  if (video) out.put((byte)0x07); else return unmappable(in, ch); break; // EIGHTH NOTE
			case 0xF7F1:  if (video) out.put((byte)0x01); else return unmappable(in, ch); break; // F1
			case 0xF7F2:  if (video) out.put((byte)0x02); else return unmappable(in, ch); break; // F2
			case 0xF7F3:  if (video) out.put((byte)0x03); else return unmappable(in, ch); break; // F3
			case 0xF7F4:  if (video) out.put((byte)0x04); else return unmappable(in, ch); break; // F4
			case 0xF7F5:  if (video) out.put((byte)0x05); else return unmappable(in, ch); break; // F5
			case 0xFF142: out.put((byte)0xB5); break; // QL
			default: return unmappable(in, ch);
			}
		}
		return CoderResult.UNDERFLOW;
	}
	
	private CoderResult unmappable(CharBuffer in, int ch) {
		int i = Character.charCount(ch);
		in.position(in.position() - i);
		return CoderResult.unmappableForLength(i);
	}
}
