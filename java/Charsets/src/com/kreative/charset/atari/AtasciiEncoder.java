package com.kreative.charset.atari;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class AtasciiEncoder extends CharsetEncoder {
	protected AtasciiEncoder(Charset cs) {
		super(cs, 1, 1);
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
			if (ch >= 0x20 && ch != 0x60 && ch <= 0x7A) out.put((byte)ch);
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
			case 0x007C:  out.put((byte)0x7C); break; // VERTICAL LINE
			case 0x0085:  out.put((byte)0x9B); break; // End of Line
			case 0x0087:  out.put((byte)0xFD); break; // Bell
			case 0x0088:  out.put((byte)0xFE); break; // Delete Character
			case 0x0089:  out.put((byte)0xFF); break; // Insert Character
			case 0x009B:  out.put((byte)0x9B); break; // End of Line
			case 0x009C:  out.put((byte)0x9C); break; // Delete Line
			case 0x009D:  out.put((byte)0x9D); break; // Insert Line
			case 0x009E:  out.put((byte)0x9E); break; // Clear Tab Stop
			case 0x009F:  out.put((byte)0x9F); break; // Set Tab Stop
			case 0x2022:  out.put((byte)0x14); break; // BULLET
			case 0x2190:  out.put((byte)0x1E); break; // LEFTWARDS ARROW
			case 0x2191:  out.put((byte)0x1C); break; // UPWARDS ARROW
			case 0x2192:  out.put((byte)0x1F); break; // RIGHTWARDS ARROW
			case 0x2193:  out.put((byte)0x1D); break; // DOWNWARDS ARROW
			case 0x23B8:  out.put((byte)0x16); break; // LEFT VERTICAL BOX LINE
			case 0x23B9:  out.put((byte)0x02); break; // RIGHT VERTICAL BOX LINE
			case 0x23BA:  out.put((byte)0x0D); break; // HORIZONTAL SCAN LINE-1
			case 0x23BD:  out.put((byte)0x0E); break; // HORIZONTAL SCAN LINE-9
			case 0x241B:  out.put((byte)0x1B); break; // SYMBOL FOR ESCAPE
			case 0x2500:  out.put((byte)0x12); break; // BOX DRAWINGS LIGHT HORIZONTAL
			case 0x2502:  out.put((byte)0x7C); break; // BOX DRAWINGS LIGHT VERTICAL
			case 0x250C:  out.put((byte)0x11); break; // BOX DRAWINGS LIGHT DOWN AND RIGHT
			case 0x2510:  out.put((byte)0x05); break; // BOX DRAWINGS LIGHT DOWN AND LEFT
			case 0x2514:  out.put((byte)0x1A); break; // BOX DRAWINGS LIGHT UP AND RIGHT
			case 0x2518:  out.put((byte)0x03); break; // BOX DRAWINGS LIGHT UP AND LEFT
			case 0x251C:  out.put((byte)0x01); break; // BOX DRAWINGS LIGHT VERTICAL AND RIGHT
			case 0x2524:  out.put((byte)0x04); break; // BOX DRAWINGS LIGHT VERTICAL AND LEFT
			case 0x252C:  out.put((byte)0x17); break; // BOX DRAWINGS LIGHT DOWN AND HORIZONTAL
			case 0x2534:  out.put((byte)0x18); break; // BOX DRAWINGS LIGHT UP AND HORIZONTAL
			case 0x253C:  out.put((byte)0x13); break; // BOX DRAWINGS LIGHT VERTICAL AND HORIZONTAL
			case 0x2571:  out.put((byte)0x06); break; // BOX DRAWINGS LIGHT DIAGONAL UPPER RIGHT TO LOWER LEFT
			case 0x2572:  out.put((byte)0x07); break; // BOX DRAWINGS LIGHT DIAGONAL UPPER LEFT TO LOWER RIGHT
			case 0x2581:  out.put((byte)0x0E); break; // LOWER ONE EIGHTH BLOCK
			case 0x2582:  out.put((byte)0x0E); break; // LOWER ONE QUARTER BLOCK
			case 0x2584:  out.put((byte)0x15); break; // LOWER HALF BLOCK
			case 0x258C:  out.put((byte)0x19); break; // LEFT HALF BLOCK
			case 0x258E:  out.put((byte)0x16); break; // LEFT ONE QUARTER BLOCK
			case 0x258F:  out.put((byte)0x16); break; // LEFT ONE EIGHTH BLOCK
			case 0x2594:  out.put((byte)0x0D); break; // UPPER ONE EIGHTH BLOCK
			case 0x2595:  out.put((byte)0x02); break; // RIGHT ONE EIGHTH BLOCK
			case 0x2596:  out.put((byte)0x0F); break; // QUADRANT LOWER LEFT
			case 0x2597:  out.put((byte)0x09); break; // QUADRANT LOWER RIGHT
			case 0x2598:  out.put((byte)0x0C); break; // QUADRANT UPPER LEFT
			case 0x259D:  out.put((byte)0x0B); break; // QUADRANT UPPER RIGHT
			case 0x25B6:  out.put((byte)0x7F); break; // BLACK RIGHT-POINTING TRIANGLE
			case 0x25C0:  out.put((byte)0x7E); break; // BLACK LEFT-POINTING TRIANGLE
			case 0x25CF:  out.put((byte)0x14); break; // BLACK CIRCLE
			case 0x25E2:  out.put((byte)0x08); break; // BLACK LOWER RIGHT TRIANGLE
			case 0x25E3:  out.put((byte)0x0A); break; // BLACK LOWER LEFT TRIANGLE
			case 0x2660:  out.put((byte)0x7B); break; // BLACK SPADE SUIT
			case 0x2663:  out.put((byte)0x10); break; // BLACK CLUB SUIT
			case 0x2665:  out.put((byte)0x00); break; // BLACK HEART SUIT
			case 0x2666:  out.put((byte)0x60); break; // BLACK DIAMOND SUIT
			case 0x1F8B0: out.put((byte)0x7D); break; // ARROW POINTING UPWARDS THEN NORTH WEST
			case 0x1FB82: out.put((byte)0x0D); break; // UPPER ONE QUARTER BLOCK
			case 0x1FB87: out.put((byte)0x02); break; // RIGHT ONE QUARTER BLOCK
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
