package com.kreative.charset.sinclair;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class ZX8xEncoder extends CharsetEncoder {
	private final boolean zx81;
	
	protected ZX8xEncoder(Charset cs, boolean zx81) {
		super(cs, 1, 1);
		this.zx81 = zx81;
		this.replaceWith(new byte[]{0x0F});
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
			switch (ch) {
            case 0x0020:  out.put((byte)0x00); break; // SPACE
            case 0x0022:  out.put((byte)(zx81 ? 0x0B : 0x01)); break; // QUOTATION MARK
            case 0x0024:  out.put((byte)0x0D); break; // DOLLAR SIGN
            case 0x0028:  out.put((byte)0x10); break; // LEFT PARENTHESIS
            case 0x0029:  out.put((byte)0x11); break; // RIGHT PARENTHESIS
            case 0x002A:  out.put((byte)(zx81 ? 0x17 : 0x14)); break; // ASTERISK
            case 0x002B:  out.put((byte)(zx81 ? 0x15 : 0x13)); break; // PLUS SIGN
            case 0x002C:  out.put((byte)0x1A); break; // COMMA
            case 0x002D:  out.put((byte)(zx81 ? 0x16 : 0x12)); break; // HYPHEN-MINUS
            case 0x002E:  out.put((byte)0x1B); break; // FULL STOP
            case 0x002F:  out.put((byte)(zx81 ? 0x18 : 0x15)); break; // SOLIDUS
            case 0x0030:  out.put((byte)0x1C); break; // DIGIT ZERO
            case 0x0031:  out.put((byte)0x1D); break; // DIGIT ONE
            case 0x0032:  out.put((byte)0x1E); break; // DIGIT TWO
            case 0x0033:  out.put((byte)0x1F); break; // DIGIT THREE
            case 0x0034:  out.put((byte)0x20); break; // DIGIT FOUR
            case 0x0035:  out.put((byte)0x21); break; // DIGIT FIVE
            case 0x0036:  out.put((byte)0x22); break; // DIGIT SIX
            case 0x0037:  out.put((byte)0x23); break; // DIGIT SEVEN
            case 0x0038:  out.put((byte)0x24); break; // DIGIT EIGHT
            case 0x0039:  out.put((byte)0x25); break; // DIGIT NINE
            case 0x003A:  out.put((byte)0x0E); break; // COLON
            case 0x003B:  out.put((byte)0x19); break; // SEMICOLON
            case 0x003C:  out.put((byte)(zx81 ? 0x13 : 0x18)); break; // LESS-THAN SIGN
            case 0x003D:  out.put((byte)(zx81 ? 0x14 : 0x16)); break; // EQUALS SIGN
            case 0x003E:  out.put((byte)(zx81 ? 0x12 : 0x17)); break; // GREATER-THAN SIGN
            case 0x003F:  out.put((byte)0x0F); break; // QUESTION MARK
            case 0x0041:  out.put((byte)0x26); break; // LATIN CAPITAL LETTER A
            case 0x0042:  out.put((byte)0x27); break; // LATIN CAPITAL LETTER B
            case 0x0043:  out.put((byte)0x28); break; // LATIN CAPITAL LETTER C
            case 0x0044:  out.put((byte)0x29); break; // LATIN CAPITAL LETTER D
            case 0x0045:  out.put((byte)0x2A); break; // LATIN CAPITAL LETTER E
            case 0x0046:  out.put((byte)0x2B); break; // LATIN CAPITAL LETTER F
            case 0x0047:  out.put((byte)0x2C); break; // LATIN CAPITAL LETTER G
            case 0x0048:  out.put((byte)0x2D); break; // LATIN CAPITAL LETTER H
            case 0x0049:  out.put((byte)0x2E); break; // LATIN CAPITAL LETTER I
            case 0x004A:  out.put((byte)0x2F); break; // LATIN CAPITAL LETTER J
            case 0x004B:  out.put((byte)0x30); break; // LATIN CAPITAL LETTER K
            case 0x004C:  out.put((byte)0x31); break; // LATIN CAPITAL LETTER L
            case 0x004D:  out.put((byte)0x32); break; // LATIN CAPITAL LETTER M
            case 0x004E:  out.put((byte)0x33); break; // LATIN CAPITAL LETTER N
            case 0x004F:  out.put((byte)0x34); break; // LATIN CAPITAL LETTER O
            case 0x0050:  out.put((byte)0x35); break; // LATIN CAPITAL LETTER P
            case 0x0051:  out.put((byte)0x36); break; // LATIN CAPITAL LETTER Q
            case 0x0052:  out.put((byte)0x37); break; // LATIN CAPITAL LETTER R
            case 0x0053:  out.put((byte)0x38); break; // LATIN CAPITAL LETTER S
            case 0x0054:  out.put((byte)0x39); break; // LATIN CAPITAL LETTER T
            case 0x0055:  out.put((byte)0x3A); break; // LATIN CAPITAL LETTER U
            case 0x0056:  out.put((byte)0x3B); break; // LATIN CAPITAL LETTER V
            case 0x0057:  out.put((byte)0x3C); break; // LATIN CAPITAL LETTER W
            case 0x0058:  out.put((byte)0x3D); break; // LATIN CAPITAL LETTER X
            case 0x0059:  out.put((byte)0x3E); break; // LATIN CAPITAL LETTER Y
            case 0x005A:  out.put((byte)0x3F); break; // LATIN CAPITAL LETTER Z
            case 0x0061:  out.put((byte)0x26); break; // LATIN SMALL LETTER A
            case 0x0062:  out.put((byte)0x27); break; // LATIN SMALL LETTER B
            case 0x0063:  out.put((byte)0x28); break; // LATIN SMALL LETTER C
            case 0x0064:  out.put((byte)0x29); break; // LATIN SMALL LETTER D
            case 0x0065:  out.put((byte)0x2A); break; // LATIN SMALL LETTER E
            case 0x0066:  out.put((byte)0x2B); break; // LATIN SMALL LETTER F
            case 0x0067:  out.put((byte)0x2C); break; // LATIN SMALL LETTER G
            case 0x0068:  out.put((byte)0x2D); break; // LATIN SMALL LETTER H
            case 0x0069:  out.put((byte)0x2E); break; // LATIN SMALL LETTER I
            case 0x006A:  out.put((byte)0x2F); break; // LATIN SMALL LETTER J
            case 0x006B:  out.put((byte)0x30); break; // LATIN SMALL LETTER K
            case 0x006C:  out.put((byte)0x31); break; // LATIN SMALL LETTER L
            case 0x006D:  out.put((byte)0x32); break; // LATIN SMALL LETTER M
            case 0x006E:  out.put((byte)0x33); break; // LATIN SMALL LETTER N
            case 0x006F:  out.put((byte)0x34); break; // LATIN SMALL LETTER O
            case 0x0070:  out.put((byte)0x35); break; // LATIN SMALL LETTER P
            case 0x0071:  out.put((byte)0x36); break; // LATIN SMALL LETTER Q
            case 0x0072:  out.put((byte)0x37); break; // LATIN SMALL LETTER R
            case 0x0073:  out.put((byte)0x38); break; // LATIN SMALL LETTER S
            case 0x0074:  out.put((byte)0x39); break; // LATIN SMALL LETTER T
            case 0x0075:  out.put((byte)0x3A); break; // LATIN SMALL LETTER U
            case 0x0076:  out.put((byte)0x3B); break; // LATIN SMALL LETTER V
            case 0x0077:  out.put((byte)0x3C); break; // LATIN SMALL LETTER W
            case 0x0078:  out.put((byte)0x3D); break; // LATIN SMALL LETTER X
            case 0x0079:  out.put((byte)0x3E); break; // LATIN SMALL LETTER Y
            case 0x007A:  out.put((byte)0x3F); break; // LATIN SMALL LETTER Z
            case 0x00A0:  out.put((byte)0x00); break; // NO-BREAK SPACE
            case 0x00A3:  out.put((byte)0x0C); break; // POUND SIGN
            case 0x2580:  out.put((byte)(zx81 ? 0x03 : 0x83)); break; // UPPER HALF BLOCK
            case 0x2584:  out.put((byte)(zx81 ? 0x83 : 0x03)); break; // LOWER HALF BLOCK
            case 0x2588:  out.put((byte)0x80); break; // FULL BLOCK
            case 0x258C:  out.put((byte)(zx81 ? 0x05 : 0x02)); break; // LEFT HALF BLOCK
            case 0x2590:  out.put((byte)(zx81 ? 0x85 : 0x82)); break; // RIGHT HALF BLOCK
            case 0x2592:  out.put((byte)(zx81 ? 0x08 : 0x09)); break; // MEDIUM SHADE
            case 0x2596:  out.put((byte)(zx81 ? 0x04 : 0x06)); break; // QUADRANT LOWER LEFT
            case 0x2597:  out.put((byte)(zx81 ? 0x87 : 0x07)); break; // QUADRANT LOWER RIGHT
            case 0x2598:  out.put((byte)(zx81 ? 0x01 : 0x04)); break; // QUADRANT UPPER LEFT
            case 0x2599:  out.put((byte)(zx81 ? 0x82 : 0x85)); break; // QUADRANT UPPER LEFT AND LOWER LEFT AND LOWER RIGHT
            case 0x259A:  out.put((byte)(zx81 ? 0x86 : 0x88)); break; // QUADRANT UPPER LEFT AND LOWER RIGHT
            case 0x259B:  out.put((byte)(zx81 ? 0x07 : 0x87)); break; // QUADRANT UPPER LEFT AND UPPER RIGHT AND LOWER LEFT
            case 0x259C:  out.put((byte)(zx81 ? 0x84 : 0x86)); break; // QUADRANT UPPER LEFT AND UPPER RIGHT AND LOWER RIGHT
            case 0x259D:  out.put((byte)(zx81 ? 0x02 : 0x05)); break; // QUADRANT UPPER RIGHT
            case 0x259E:  out.put((byte)(zx81 ? 0x06 : 0x08)); break; // QUADRANT UPPER RIGHT AND LOWER LEFT
            case 0x259F:  out.put((byte)(zx81 ? 0x81 : 0x84)); break; // QUADRANT UPPER RIGHT AND LOWER LEFT AND LOWER RIGHT
            case 0x1FB8E: out.put((byte)(zx81 ? 0x0A : 0x0B)); break; // UPPER HALF MEDIUM SHADE
            case 0x1FB8F: out.put((byte)(zx81 ? 0x09 : 0x0A)); break; // LOWER HALF MEDIUM SHADE
            case 0x1FB90: out.put((byte)(zx81 ? 0x88 : 0x89)); break; // INVERSE MEDIUM SHADE
            case 0x1FB91: out.put((byte)(zx81 ? 0x89 : 0x8A)); break; // UPPER HALF BLOCK AND LOWER HALF INVERSE MEDIUM SHADE
            case 0x1FB92: out.put((byte)(zx81 ? 0x8A : 0x8B)); break; // UPPER HALF INVERSE MEDIUM SHADE AND LOWER HALF BLOCK
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
