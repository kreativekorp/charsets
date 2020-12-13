package com.kreative.charset.atari;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class AtariSTEncoder extends CharsetEncoder {
	private final boolean video;
	
	protected AtariSTEncoder(Charset cs, boolean video) {
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
			if (ch == 0x00) out.put((byte)ch);
			else if (ch < 0x20) { if (video) return unmappable(in, ch); else out.put((byte)ch); }
			else if (ch < 0x7F) out.put((byte)ch);
			else if (ch < 0x80) { if (video) return unmappable(in, ch); else out.put((byte)ch); }
			else if (ch < 0xA0) return unmappable(in, ch);
			else switch (ch) {
			case 0x00A1:  out.put((byte)0xAD); break; // INVERTED EXCLAMATION MARK
			case 0x00A2:  out.put((byte)0x9B); break; // CENT SIGN
			case 0x00A3:  out.put((byte)0x9C); break; // POUND SIGN
			case 0x00A5:  out.put((byte)0x9D); break; // YEN SIGN
			case 0x00A7:  out.put((byte)0xDD); break; // SECTION SIGN
			case 0x00A8:  out.put((byte)0xB9); break; // DIAERESIS
			case 0x00A9:  out.put((byte)0xBD); break; // COPYRIGHT SIGN
			case 0x00AA:  out.put((byte)0xA6); break; // FEMININE ORDINAL INDICATOR
			case 0x00AB:  out.put((byte)0xAE); break; // LEFT-POINTING DOUBLE ANGLE QUOTATION MARK
			case 0x00AC:  out.put((byte)0xAA); break; // NOT SIGN
			case 0x00AE:  out.put((byte)0xBE); break; // REGISTERED SIGN
			case 0x00AF:  out.put((byte)0xFF); break; // MACRON
			case 0x00B0:  out.put((byte)0xF8); break; // DEGREE SIGN
			case 0x00B1:  out.put((byte)0xF1); break; // PLUS-MINUS SIGN
			case 0x00B2:  out.put((byte)0xFD); break; // SUPERSCRIPT TWO
			case 0x00B3:  out.put((byte)0xFE); break; // SUPERSCRIPT THREE
			case 0x00B4:  out.put((byte)0xBA); break; // ACUTE ACCENT
			case 0x00B5:  out.put((byte)0xE6); break; // MICRO SIGN
			case 0x00B6:  out.put((byte)0xBC); break; // PILCROW SIGN
			case 0x00B7:  out.put((byte)0xFA); break; // MIDDLE DOT
			case 0x00BA:  out.put((byte)0xA7); break; // MASCULINE ORDINAL INDICATOR
			case 0x00BB:  out.put((byte)0xAF); break; // RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK
			case 0x00BC:  out.put((byte)0xAC); break; // VULGAR FRACTION ONE QUARTER
			case 0x00BD:  out.put((byte)0xAB); break; // VULGAR FRACTION ONE HALF
			case 0x00BF:  out.put((byte)0xA8); break; // INVERTED QUESTION MARK
			case 0x00C0:  out.put((byte)0xB6); break; // LATIN CAPITAL LETTER A WITH GRAVE
			case 0x00C3:  out.put((byte)0xB7); break; // LATIN CAPITAL LETTER A WITH TILDE
			case 0x00C4:  out.put((byte)0x8E); break; // LATIN CAPITAL LETTER A WITH DIAERESIS
			case 0x00C5:  out.put((byte)0x8F); break; // LATIN CAPITAL LETTER A WITH RING ABOVE
			case 0x00C6:  out.put((byte)0x92); break; // LATIN CAPITAL LIGATURE AE
			case 0x00C7:  out.put((byte)0x80); break; // LATIN CAPITAL LETTER C WITH CEDILLA
			case 0x00C9:  out.put((byte)0x90); break; // LATIN CAPITAL LETTER E WITH ACUTE
			case 0x00D1:  out.put((byte)0xA5); break; // LATIN CAPITAL LETTER N WITH TILDE
			case 0x00D5:  out.put((byte)0xB8); break; // LATIN CAPITAL LETTER O WITH TILDE
			case 0x00D6:  out.put((byte)0x99); break; // LATIN CAPITAL LETTER O WITH DIAERESIS
			case 0x00D8:  out.put((byte)0xB2); break; // LATIN CAPITAL LETTER O WITH STROKE
			case 0x00DC:  out.put((byte)0x9A); break; // LATIN CAPITAL LETTER U WITH DIAERESIS
			case 0x00DF:  out.put((byte)0x9E); break; // LATIN SMALL LETTER SHARP S
			case 0x00E0:  out.put((byte)0x85); break; // LATIN SMALL LETTER A WITH GRAVE
			case 0x00E1:  out.put((byte)0xA0); break; // LATIN SMALL LETTER A WITH ACUTE
			case 0x00E2:  out.put((byte)0x83); break; // LATIN SMALL LETTER A WITH CIRCUMFLEX
			case 0x00E3:  out.put((byte)0xB0); break; // LATIN SMALL LETTER A WITH TILDE
			case 0x00E4:  out.put((byte)0x84); break; // LATIN SMALL LETTER A WITH DIAERESIS
			case 0x00E5:  out.put((byte)0x86); break; // LATIN SMALL LETTER A WITH RING ABOVE
			case 0x00E6:  out.put((byte)0x91); break; // LATIN SMALL LIGATURE AE
			case 0x00E7:  out.put((byte)0x87); break; // LATIN SMALL LETTER C WITH CEDILLA
			case 0x00E8:  out.put((byte)0x8A); break; // LATIN SMALL LETTER E WITH GRAVE
			case 0x00E9:  out.put((byte)0x82); break; // LATIN SMALL LETTER E WITH ACUTE
			case 0x00EA:  out.put((byte)0x88); break; // LATIN SMALL LETTER E WITH CIRCUMFLEX
			case 0x00EB:  out.put((byte)0x89); break; // LATIN SMALL LETTER E WITH DIAERESIS
			case 0x00EC:  out.put((byte)0x8D); break; // LATIN SMALL LETTER I WITH GRAVE
			case 0x00ED:  out.put((byte)0xA1); break; // LATIN SMALL LETTER I WITH ACUTE
			case 0x00EE:  out.put((byte)0x8C); break; // LATIN SMALL LETTER I WITH CIRCUMFLEX
			case 0x00EF:  out.put((byte)0x8B); break; // LATIN SMALL LETTER I WITH DIAERESIS
			case 0x00F1:  out.put((byte)0xA4); break; // LATIN SMALL LETTER N WITH TILDE
			case 0x00F2:  out.put((byte)0x95); break; // LATIN SMALL LETTER O WITH GRAVE
			case 0x00F3:  out.put((byte)0xA2); break; // LATIN SMALL LETTER O WITH ACUTE
			case 0x00F4:  out.put((byte)0x93); break; // LATIN SMALL LETTER O WITH CIRCUMFLEX
			case 0x00F5:  out.put((byte)0xB1); break; // LATIN SMALL LETTER O WITH TILDE
			case 0x00F6:  out.put((byte)0x94); break; // LATIN SMALL LETTER O WITH DIAERESIS
			case 0x00F7:  out.put((byte)0xF6); break; // DIVISION SIGN
			case 0x00F8:  out.put((byte)0xB3); break; // LATIN SMALL LETTER O WITH STROKE
			case 0x00F9:  out.put((byte)0x97); break; // LATIN SMALL LETTER U WITH GRAVE
			case 0x00FA:  out.put((byte)0xA3); break; // LATIN SMALL LETTER U WITH ACUTE
			case 0x00FB:  out.put((byte)0x96); break; // LATIN SMALL LETTER U WITH CIRCUMFLEX
			case 0x00FC:  out.put((byte)0x81); break; // LATIN SMALL LETTER U WITH DIAERESIS
			case 0x00FF:  out.put((byte)0x98); break; // LATIN SMALL LETTER Y WITH DIAERESIS
			case 0x0132:  out.put((byte)0xC1); break; // LATIN CAPITAL LIGATURE IJ
			case 0x0133:  out.put((byte)0xC0); break; // LATIN SMALL LIGATURE IJ
			case 0x0152:  out.put((byte)0xB5); break; // LATIN CAPITAL LIGATURE OE
			case 0x0153:  out.put((byte)0xB4); break; // LATIN SMALL LIGATURE OE
			case 0x0192:  out.put((byte)0x9F); break; // LATIN SMALL LETTER F WITH HOOK
			case 0x0259:  if (video) out.put((byte)0x1A); else return unmappable(in, ch); break; // LATIN SMALL LETTER SCHWA
			case 0x0393:  out.put((byte)0xE2); break; // GREEK CAPITAL LETTER GAMMA
			case 0x0398:  out.put((byte)0xE9); break; // GREEK CAPITAL LETTER THETA
			case 0x03A3:  out.put((byte)0xE4); break; // GREEK CAPITAL LETTER SIGMA
			case 0x03A6:  out.put((byte)0xE8); break; // GREEK CAPITAL LETTER PHI
			case 0x03A9:  out.put((byte)0xEA); break; // GREEK CAPITAL LETTER OMEGA
			case 0x03B1:  out.put((byte)0xE0); break; // GREEK SMALL LETTER ALPHA
			case 0x03B2:  out.put((byte)0xE1); break; // GREEK SMALL LETTER BETA
			case 0x03B4:  out.put((byte)0xEB); break; // GREEK SMALL LETTER DELTA
			case 0x03C0:  out.put((byte)0xE3); break; // GREEK SMALL LETTER PI
			case 0x03C3:  out.put((byte)0xE5); break; // GREEK SMALL LETTER SIGMA
			case 0x03C4:  out.put((byte)0xE7); break; // GREEK SMALL LETTER TAU
			case 0x03D5:  out.put((byte)0xED); break; // GREEK PHI SYMBOL
			case 0x05D0:  out.put((byte)0xC2); break; // HEBREW LETTER ALEF
			case 0x05D1:  out.put((byte)0xC3); break; // HEBREW LETTER BET
			case 0x05D2:  out.put((byte)0xC4); break; // HEBREW LETTER GIMEL
			case 0x05D3:  out.put((byte)0xC5); break; // HEBREW LETTER DALET
			case 0x05D4:  out.put((byte)0xC6); break; // HEBREW LETTER HE
			case 0x05D5:  out.put((byte)0xC7); break; // HEBREW LETTER VAV
			case 0x05D6:  out.put((byte)0xC8); break; // HEBREW LETTER ZAYIN
			case 0x05D7:  out.put((byte)0xC9); break; // HEBREW LETTER HET
			case 0x05D8:  out.put((byte)0xCA); break; // HEBREW LETTER TET
			case 0x05D9:  out.put((byte)0xCB); break; // HEBREW LETTER YOD
			case 0x05DA:  out.put((byte)0xD9); break; // HEBREW LETTER FINAL KAF
			case 0x05DB:  out.put((byte)0xCC); break; // HEBREW LETTER KAF
			case 0x05DC:  out.put((byte)0xCD); break; // HEBREW LETTER LAMED
			case 0x05DD:  out.put((byte)0xDA); break; // HEBREW LETTER FINAL MEM
			case 0x05DE:  out.put((byte)0xCE); break; // HEBREW LETTER MEM
			case 0x05DF:  out.put((byte)0xD8); break; // HEBREW LETTER FINAL NUN
			case 0x05E0:  out.put((byte)0xCF); break; // HEBREW LETTER NUN
			case 0x05E1:  out.put((byte)0xD0); break; // HEBREW LETTER SAMEKH
			case 0x05E2:  out.put((byte)0xD1); break; // HEBREW LETTER AYIN
			case 0x05E3:  out.put((byte)0xDB); break; // HEBREW LETTER FINAL PE
			case 0x05E4:  out.put((byte)0xD2); break; // HEBREW LETTER PE
			case 0x05E5:  out.put((byte)0xDC); break; // HEBREW LETTER FINAL TSADI
			case 0x05E6:  out.put((byte)0xD3); break; // HEBREW LETTER TSADI
			case 0x05E7:  out.put((byte)0xD4); break; // HEBREW LETTER QOF
			case 0x05E8:  out.put((byte)0xD5); break; // HEBREW LETTER RESH
			case 0x05E9:  out.put((byte)0xD6); break; // HEBREW LETTER SHIN
			case 0x05EA:  out.put((byte)0xD7); break; // HEBREW LETTER TAV
			case 0x2020:  out.put((byte)0xBB); break; // DAGGER
			case 0x207F:  out.put((byte)0xFC); break; // SUPERSCRIPT LATIN SMALL LETTER N
			case 0x2122:  out.put((byte)0xBF); break; // TRADE MARK SIGN
			case 0x21E6:  if (video) out.put((byte)0x04); else return unmappable(in, ch); break; // LEFTWARDS WHITE ARROW
			case 0x21E7:  if (video) out.put((byte)0x01); else return unmappable(in, ch); break; // UPWARDS WHITE ARROW
			case 0x21E8:  if (video) out.put((byte)0x03); else return unmappable(in, ch); break; // RIGHTWARDS WHITE ARROW
			case 0x21E9:  if (video) out.put((byte)0x02); else return unmappable(in, ch); break; // DOWNWARDS WHITE ARROW
			case 0x2208:  out.put((byte)0xEE); break; // ELEMENT OF
			case 0x2219:  out.put((byte)0xF9); break; // BULLET OPERATOR
			case 0x221A:  out.put((byte)0xFB); break; // SQUARE ROOT
			case 0x221E:  out.put((byte)0xDF); break; // INFINITY
			case 0x2227:  out.put((byte)0xDE); break; // LOGICAL AND
			case 0x2229:  out.put((byte)0xEF); break; // INTERSECTION
			case 0x222E:  out.put((byte)0xEC); break; // CONTOUR INTEGRAL
			case 0x2248:  out.put((byte)0xF7); break; // ALMOST EQUAL TO
			case 0x2261:  out.put((byte)0xF0); break; // IDENTICAL TO
			case 0x2264:  out.put((byte)0xF3); break; // LESS-THAN OR EQUAL TO
			case 0x2265:  out.put((byte)0xF2); break; // GREATER-THAN OR EQUAL TO
			case 0x2302:  if (video) out.put((byte)0x7F); else return unmappable(in, ch); break; // HOUSE
			case 0x2310:  out.put((byte)0xA9); break; // REVERSED NOT SIGN
			case 0x2320:  out.put((byte)0xF4); break; // TOP HALF INTEGRAL
			case 0x2321:  out.put((byte)0xF5); break; // BOTTOM HALF INTEGRAL
			case 0x240C:  if (video) out.put((byte)0x0C); else return unmappable(in, ch); break; // SYMBOL FOR FORM FEED
			case 0x240D:  if (video) out.put((byte)0x0D); else return unmappable(in, ch); break; // SYMBOL FOR CARRIAGE RETURN
			case 0x241B:  if (video) out.put((byte)0x1B); else return unmappable(in, ch); break; // SYMBOL FOR ESCAPE
			case 0x266A:  if (video) out.put((byte)0x0B); else return unmappable(in, ch); break; // EIGHTH NOTE
			case 0x2713:  if (video) out.put((byte)0x08); else return unmappable(in, ch); break; // CHECK MARK
			case 0xF82A:  if (video) out.put((byte)0x0E); else return unmappable(in, ch); break; // Atari logo, left half
			case 0xF82B:  if (video) out.put((byte)0x0F); else return unmappable(in, ch); break; // Atari logo, right half
			case 0xF82C:  if (video) out.put((byte)0x1C); else return unmappable(in, ch); break; // Image of J.R. "Bob" Dobbs, upper left quarter
			case 0xF82D:  if (video) out.put((byte)0x1D); else return unmappable(in, ch); break; // Image of J.R. "Bob" Dobbs, upper right quarter
			case 0xF82E:  if (video) out.put((byte)0x1E); else return unmappable(in, ch); break; // Image of J.R. "Bob" Dobbs, lower left quarter
			case 0xF82F:  if (video) out.put((byte)0x1F); else return unmappable(in, ch); break; // Image of J.R. "Bob" Dobbs, lower right quarter
			case 0x1F514: if (video) out.put((byte)0x0A); else return unmappable(in, ch); break; // BELL
			case 0x1F552: if (video) out.put((byte)0x09); else return unmappable(in, ch); break; // CLOCK FACE THREE OCLOCK
			case 0x1FBBD: if (video) out.put((byte)0x05); else return unmappable(in, ch); break; // NEGATIVE DIAGONAL CROSS
			case 0x1FBBE: if (video) out.put((byte)0x06); else return unmappable(in, ch); break; // NEGATIVE DIAGONAL MIDDLE RIGHT TO LOWER CENTRE
			case 0x1FBBF: if (video) out.put((byte)0x07); else return unmappable(in, ch); break; // NEGATIVE DIAGONAL DIAMOND
			case 0x1FBF0: if (video) out.put((byte)0x10); else return unmappable(in, ch); break; // SEGMENTED DIGIT ZERO
			case 0x1FBF1: if (video) out.put((byte)0x11); else return unmappable(in, ch); break; // SEGMENTED DIGIT ONE
			case 0x1FBF2: if (video) out.put((byte)0x12); else return unmappable(in, ch); break; // SEGMENTED DIGIT TWO
			case 0x1FBF3: if (video) out.put((byte)0x13); else return unmappable(in, ch); break; // SEGMENTED DIGIT THREE
			case 0x1FBF4: if (video) out.put((byte)0x14); else return unmappable(in, ch); break; // SEGMENTED DIGIT FOUR
			case 0x1FBF5: if (video) out.put((byte)0x15); else return unmappable(in, ch); break; // SEGMENTED DIGIT FIVE
			case 0x1FBF6: if (video) out.put((byte)0x16); else return unmappable(in, ch); break; // SEGMENTED DIGIT SIX
			case 0x1FBF7: if (video) out.put((byte)0x17); else return unmappable(in, ch); break; // SEGMENTED DIGIT SEVEN
			case 0x1FBF8: if (video) out.put((byte)0x18); else return unmappable(in, ch); break; // SEGMENTED DIGIT EIGHT
			case 0x1FBF9: if (video) out.put((byte)0x19); else return unmappable(in, ch); break; // SEGMENTED DIGIT NINE
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
