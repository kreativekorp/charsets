package com.kreative.charset.atari;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class AtasciiEncoder extends CharsetEncoder {
	private final boolean intl;
	private final boolean video;
	
	protected AtasciiEncoder(Charset cs, boolean intl, boolean video) {
		super(cs, 1, 1);
		this.intl = intl;
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
			if (ch >= 0x20 && ch <= 0x5F) out.put((byte)(video ? (ch - 0x20) : ch));
			else if (ch >= 0x61 && ch <= 0x7A) out.put((byte)ch);
			else switch (ch) {
			case 0x0007:  out.put((byte)0xFD); break; // Bell
			case 0x0008:  out.put((byte)0x7E); break; // Backspace
			case 0x0009:  out.put((byte)0x7F); break; // Tab
			case 0x000A:  out.put((byte)0x9B); break; // End of Line
			case 0x000B:  out.put((byte)0x7D); break; // Clear Screen
			case 0x000C:  out.put((byte)0x7D); break; // Clear Screen
			case 0x000D:  out.put((byte)0x9B); break; // End of Line
			case 0x001B:  out.put((byte)0x1B); break; // Escape
			case 0x001C:  out.put((byte)0x1C); break; // Cursor Up
			case 0x001D:  out.put((byte)0x1D); break; // Cursor Down
			case 0x001E:  out.put((byte)0x1E); break; // Cursor Left
			case 0x001F:  out.put((byte)0x1F); break; // Cursor Right
			case 0x0085:  out.put((byte)0x9B); break; // End of Line
			case 0x0087:  out.put((byte)0xFD); break; // Bell
			case 0x0088:  out.put((byte)0xFE); break; // Delete Character
			case 0x0089:  out.put((byte)0xFF); break; // Insert Character
			case 0x009B:  out.put((byte)0x9B); break; // End of Line
			case 0x009C:  out.put((byte)0x9C); break; // Delete Line
			case 0x009D:  out.put((byte)0x9D); break; // Insert Line
			case 0x009E:  out.put((byte)0x9E); break; // Clear Tab Stop
			case 0x009F:  out.put((byte)0x9F); break; // Set Tab Stop
			default:
				int b = intl ? encodeCharIntl(ch) : encodeCharGr(ch);
				if (b < 0) return unmappable(in, ch);
				else out.put((byte)(video ? (b | 0x40) : b));
				break;
			}
		}
		return CoderResult.UNDERFLOW;
	}
	
	private int encodeCharGr(int ch) {
		switch (ch) {
		case 0x007C:  return 0x7C; // VERTICAL LINE
		case 0x2022:  return 0x14; // BULLET
		case 0x2190:  return 0x1E; // LEFTWARDS ARROW
		case 0x2191:  return 0x1C; // UPWARDS ARROW
		case 0x2192:  return 0x1F; // RIGHTWARDS ARROW
		case 0x2193:  return 0x1D; // DOWNWARDS ARROW
		case 0x23B8:  return 0x16; // LEFT VERTICAL BOX LINE
		case 0x23B9:  return 0x02; // RIGHT VERTICAL BOX LINE
		case 0x23BA:  return 0x0D; // HORIZONTAL SCAN LINE-1
		case 0x23BD:  return 0x0E; // HORIZONTAL SCAN LINE-9
		case 0x241B:  return 0x1B; // SYMBOL FOR ESCAPE
		case 0x2500:  return 0x12; // BOX DRAWINGS LIGHT HORIZONTAL
		case 0x2502:  return 0x7C; // BOX DRAWINGS LIGHT VERTICAL
		case 0x250C:  return 0x11; // BOX DRAWINGS LIGHT DOWN AND RIGHT
		case 0x2510:  return 0x05; // BOX DRAWINGS LIGHT DOWN AND LEFT
		case 0x2514:  return 0x1A; // BOX DRAWINGS LIGHT UP AND RIGHT
		case 0x2518:  return 0x03; // BOX DRAWINGS LIGHT UP AND LEFT
		case 0x251C:  return 0x01; // BOX DRAWINGS LIGHT VERTICAL AND RIGHT
		case 0x2524:  return 0x04; // BOX DRAWINGS LIGHT VERTICAL AND LEFT
		case 0x252C:  return 0x17; // BOX DRAWINGS LIGHT DOWN AND HORIZONTAL
		case 0x2534:  return 0x18; // BOX DRAWINGS LIGHT UP AND HORIZONTAL
		case 0x253C:  return 0x13; // BOX DRAWINGS LIGHT VERTICAL AND HORIZONTAL
		case 0x2571:  return 0x06; // BOX DRAWINGS LIGHT DIAGONAL UPPER RIGHT TO LOWER LEFT
		case 0x2572:  return 0x07; // BOX DRAWINGS LIGHT DIAGONAL UPPER LEFT TO LOWER RIGHT
		case 0x2581:  return 0x0E; // LOWER ONE EIGHTH BLOCK
		case 0x2582:  return 0x0E; // LOWER ONE QUARTER BLOCK
		case 0x2584:  return 0x15; // LOWER HALF BLOCK
		case 0x258C:  return 0x19; // LEFT HALF BLOCK
		case 0x258E:  return 0x16; // LEFT ONE QUARTER BLOCK
		case 0x258F:  return 0x16; // LEFT ONE EIGHTH BLOCK
		case 0x2594:  return 0x0D; // UPPER ONE EIGHTH BLOCK
		case 0x2595:  return 0x02; // RIGHT ONE EIGHTH BLOCK
		case 0x2596:  return 0x0F; // QUADRANT LOWER LEFT
		case 0x2597:  return 0x09; // QUADRANT LOWER RIGHT
		case 0x2598:  return 0x0C; // QUADRANT UPPER LEFT
		case 0x259D:  return 0x0B; // QUADRANT UPPER RIGHT
		case 0x25B6:  return 0x7F; // BLACK RIGHT-POINTING TRIANGLE
		case 0x25C0:  return 0x7E; // BLACK LEFT-POINTING TRIANGLE
		case 0x25CF:  return 0x14; // BLACK CIRCLE
		case 0x25E2:  return 0x08; // BLACK LOWER RIGHT TRIANGLE
		case 0x25E3:  return 0x0A; // BLACK LOWER LEFT TRIANGLE
		case 0x2660:  return 0x7B; // BLACK SPADE SUIT
		case 0x2663:  return 0x10; // BLACK CLUB SUIT
		case 0x2665:  return 0x00; // BLACK HEART SUIT
		case 0x2666:  return 0x60; // BLACK DIAMOND SUIT
		case 0x1F8B0: return 0x7D; // ARROW POINTING UPWARDS THEN NORTH WEST
		case 0x1FB82: return 0x0D; // UPPER ONE QUARTER BLOCK
		case 0x1FB87: return 0x02; // RIGHT ONE QUARTER BLOCK
		default: return -1;
		}
	}
	
	private int encodeCharIntl(int ch) {
		switch (ch) {
		case 0x007C:  return 0x7C; // VERTICAL LINE
		case 0x00A1:  return 0x60; // INVERTED EXCLAMATION MARK
		case 0x00A3:  return 0x08; // POUND SIGN
		case 0x00C4:  return 0x7B; // LATIN CAPITAL LETTER A WITH DIAERESIS
		case 0x00C5:  return 0x1A; // LATIN CAPITAL LETTER A WITH RING ABOVE
		case 0x00C9:  return 0x03; // LATIN CAPITAL LETTER E WITH ACUTE
		case 0x00D1:  return 0x02; // LATIN CAPITAL LETTER N WITH TILDE
		case 0x00D6:  return 0x0C; // LATIN CAPITAL LETTER O WITH DIAERESIS
		case 0x00DC:  return 0x10; // LATIN CAPITAL LETTER U WITH DIAERESIS
		case 0x00E0:  return 0x19; // LATIN SMALL LETTER A WITH GRAVE
		case 0x00E1:  return 0x00; // LATIN SMALL LETTER A WITH ACUTE
		case 0x00E2:  return 0x11; // LATIN SMALL LETTER A WITH CIRCUMFLEX
		case 0x00E4:  return 0x0B; // LATIN SMALL LETTER A WITH DIAERESIS
		case 0x00E5:  return 0x18; // LATIN SMALL LETTER A WITH RING ABOVE
		case 0x00E7:  return 0x04; // LATIN SMALL LETTER C WITH CEDILLA
		case 0x00E8:  return 0x15; // LATIN SMALL LETTER E WITH GRAVE
		case 0x00E9:  return 0x14; // LATIN SMALL LETTER E WITH ACUTE
		case 0x00EA:  return 0x17; // LATIN SMALL LETTER E WITH CIRCUMFLEX
		case 0x00EC:  return 0x07; // LATIN SMALL LETTER I WITH GRAVE
		case 0x00EE:  return 0x13; // LATIN SMALL LETTER I WITH CIRCUMFLEX
		case 0x00EF:  return 0x09; // LATIN SMALL LETTER I WITH DIAERESIS
		case 0x00F1:  return 0x16; // LATIN SMALL LETTER N WITH TILDE
		case 0x00F2:  return 0x06; // LATIN SMALL LETTER O WITH GRAVE
		case 0x00F3:  return 0x0E; // LATIN SMALL LETTER O WITH ACUTE
		case 0x00F4:  return 0x05; // LATIN SMALL LETTER O WITH CIRCUMFLEX
		case 0x00F6:  return 0x0F; // LATIN SMALL LETTER O WITH DIAERESIS
		case 0x00F9:  return 0x01; // LATIN SMALL LETTER U WITH GRAVE
		case 0x00FA:  return 0x0D; // LATIN SMALL LETTER U WITH ACUTE
		case 0x00FB:  return 0x12; // LATIN SMALL LETTER U WITH CIRCUMFLEX
		case 0x00FC:  return 0x0A; // LATIN SMALL LETTER U WITH DIAERESIS
		case 0x2190:  return 0x1E; // LEFTWARDS ARROW
		case 0x2191:  return 0x1C; // UPWARDS ARROW
		case 0x2192:  return 0x1F; // RIGHTWARDS ARROW
		case 0x2193:  return 0x1D; // DOWNWARDS ARROW
		case 0x241B:  return 0x1B; // SYMBOL FOR ESCAPE
		case 0x25B6:  return 0x7F; // BLACK RIGHT-POINTING TRIANGLE
		case 0x25C0:  return 0x7E; // BLACK LEFT-POINTING TRIANGLE
		case 0x1F8B0: return 0x7D; // ARROW POINTING UPWARDS THEN NORTH WEST
		default: return -1;
		}
	}
	
	private CoderResult unmappable(CharBuffer in, int ch) {
		int i = Character.charCount(ch);
		in.position(in.position() - i);
		return CoderResult.unmappableForLength(i);
	}
}
