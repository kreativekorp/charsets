package com.kreative.charset.apple2;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class AppleIIEncoder extends CharsetEncoder {
	private final boolean enhanced;
	
	protected AppleIIEncoder(Charset cs, boolean enhanced) {
		super(cs, 1, 1);
		this.enhanced = enhanced;
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
			// This whole block is just for handling Apple's PUA encoding of its logo.
			if (ch == 0xF8FF) {
				if (in.hasRemaining()) {
					int cl = in.get() & 0xFFFF;
					if (cl == 0xF87F) {
						if (enhanced) {
							out.put((byte)0x41);
							continue;
						} else {
							in.position(in.position() - 2);
							return CoderResult.unmappableForLength(2);
						}
					}
					in.position(in.position() - 1);
				}
				if (enhanced) {
					out.put((byte)0x40);
					continue;
				} else {
					in.position(in.position() - 1);
					return CoderResult.unmappableForLength(1);
				}
			}
			if (ch < 0x80) out.put((byte)(ch | 0x80));
			else if (!enhanced) return unmappable(in, ch);
			else switch (ch) {
			case 0x00A0:  out.put((byte)0xA0); break; // NO-BREAK SPACE
			case 0x00AF:  out.put((byte)0x4C); break; // MACRON
			case 0x2015:  out.put((byte)0x53); break; // HORIZONTAL BAR
			case 0x2026:  out.put((byte)0x49); break; // HORIZONTAL ELLIPSIS
			case 0x2190:  out.put((byte)0x48); break; // LEFTWARDS ARROW
			case 0x2191:  out.put((byte)0x4B); break; // UPWARDS ARROW
			case 0x2192:  out.put((byte)0x55); break; // RIGHTWARDS ARROW
			case 0x2193:  out.put((byte)0x4A); break; // DOWNWARDS ARROW
			case 0x21B2:  out.put((byte)0x4D); break; // DOWNWARDS ARROW WITH TIP LEFTWARDS
			case 0x21B5:  out.put((byte)0x4D); break; // DOWNWARDS ARROW WITH CORNER LEFTWARDS
			case 0x2318:  out.put((byte)0x41); break; // PLACE OF INTEREST SIGN
			case 0x231B:  out.put((byte)0x43); break; // HOURGLASS
			case 0x2325:  out.put((byte)0x40); break; // OPTION KEY
			case 0x23B8:  out.put((byte)0x5F); break; // LEFT VERTICAL BOX LINE
			case 0x23B9:  out.put((byte)0x5A); break; // RIGHT VERTICAL BOX LINE
			case 0x23BA:  out.put((byte)0x4C); break; // HORIZONTAL SCAN LINE-1
			case 0x23BD:  out.put((byte)0xDF); break; // HORIZONTAL SCAN LINE-9
			case 0x2425:  out.put((byte)0xFF); break; // SYMBOL FOR DELETE FORM TWO
			case 0x2500:  out.put((byte)0x53); break; // BOX DRAWINGS LIGHT HORIZONTAL
			case 0x2502:  out.put((byte)0xFC); break; // BOX DRAWINGS LIGHT VERTICAL
			case 0x2581:  out.put((byte)0xDF); break; // LOWER ONE EIGHTH BLOCK
			case 0x2589:  out.put((byte)0x4E); break; // LEFT SEVEN EIGHTHS BLOCK
			case 0x258F:  out.put((byte)0x5F); break; // LEFT ONE EIGHTH BLOCK
			case 0x2592:  out.put((byte)0x56); break; // MEDIUM SHADE
			case 0x2594:  out.put((byte)0x4C); break; // UPPER ONE EIGHTH BLOCK
			case 0x2595:  out.put((byte)0x5A); break; // RIGHT ONE EIGHTH BLOCK
			case 0x25C6:  out.put((byte)0x5B); break; // BLACK DIAMOND
			case 0x2666:  out.put((byte)0x5B); break; // BLACK DIAMOND SUIT
			case 0x2713:  out.put((byte)0x44); break; // CHECK MARK
			case 0xF812:  out.put((byte)0x41); break; // Open Apple (Linux Private Use Area)
			case 0xF813:  out.put((byte)0x40); break; // Solid Apple (Linux Private Use Area)
			case 0x1F34E: out.put((byte)0x40); break; // RED APPLE
			case 0x1F34F: out.put((byte)0x41); break; // GREEN APPLE
			case 0x1FB7C: out.put((byte)0x54); break; // LEFT AND LOWER ONE EIGHTH BLOCK
			case 0x1FB80: out.put((byte)0x5C); break; // UPPER AND LOWER ONE EIGHTH BLOCK
			case 0x1FB81: out.put((byte)0x47); break; // HORIZONTAL ONE EIGHTH BLOCK-1358
			case 0x1FB90: out.put((byte)0x57); break; // INVERSE MEDIUM SHADE
			case 0x1FBB0: out.put((byte)0x42); break; // ARROWHEAD-SHAPED POINTER
			case 0x1FBB1: out.put((byte)0x45); break; // INVERSE CHECK MARK
			case 0x1FBB2: out.put((byte)0x46); break; // LEFT HALF RUNNING MAN
			case 0x1FBB3: out.put((byte)0x47); break; // RIGHT HALF RUNNING MAN
			case 0x1FBB4: out.put((byte)0x46); break; // INVERSE DOWNWARDS ARROW WITH TIP LEFTWARDS
			case 0x1FBB5: out.put((byte)0x4F); break; // LEFTWARDS ARROW AND UPPER AND LOWER ONE EIGHTH BLOCK
			case 0x1FBB6: out.put((byte)0x50); break; // RIGHTWARDS ARROW AND UPPER AND LOWER ONE EIGHTH BLOCK
			case 0x1FBB7: out.put((byte)0x51); break; // DOWNWARDS ARROW AND RIGHT ONE EIGHTH BLOCK
			case 0x1FBB8: out.put((byte)0x52); break; // UPWARDS ARROW AND RIGHT ONE EIGHTH BLOCK
			case 0x1FBB9: out.put((byte)0x58); break; // LEFT HALF FOLDER
			case 0x1FBBA: out.put((byte)0x59); break; // RIGHT HALF FOLDER
			case 0x1FBBB: out.put((byte)0x5D); break; // VOIDED GREEK CROSS
			case 0x1FBBC: out.put((byte)0x5E); break; // RIGHT OPEN SQUARED DOT
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
