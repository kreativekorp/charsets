package com.kreative.charset.apple2;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import com.kreative.charset.AbstractCharsetEncoder;

public class AppleIIEncoder extends CharsetEncoder {
	private final boolean enhanced;
	
	protected AppleIIEncoder(Charset cs, boolean enhanced) {
		super(cs, 1, 1);
		this.enhanced = enhanced;
	}
	
	@Override
	protected final CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
		while (in.hasRemaining()) {
			if (!out.hasRemaining()) return CoderResult.OVERFLOW;
			int p = in.position();
			int ch = AbstractCharsetEncoder.getCodePoint(in);
			if (ch < 0) return CoderResult.UNDERFLOW;
			
			// This whole block is just for handling Apple's PUA encoding of its logo.
			if (ch == 0xF8FF) {
				if (in.hasRemaining()) {
					int q = in.position();
					int cl = AbstractCharsetEncoder.getCodePoint(in);
					if (cl == 0xF87F) {
						if (enhanced) {
							out.put((byte)0x41);
							continue;
						} else {
							int n = in.position() - p; in.position(p);
							return CoderResult.unmappableForLength(n);
						}
					}
					in.position(q);
				}
				if (enhanced) {
					out.put((byte)0x40);
					continue;
				} else {
					int n = in.position() - p; in.position(p);
					return CoderResult.unmappableForLength(n);
				}
			}
			
			int b = encode(ch);
			if (b >= 0) {
				out.put((byte)b);
				continue;
			} else {
				int n = in.position() - p; in.position(p);
				return CoderResult.unmappableForLength(n);
			}
		}
		return CoderResult.UNDERFLOW;
	}
	
	protected int encode(int ch) {
		if (ch < 0x80) return ch | 0x80;
		if (!enhanced) return -1;
		switch (ch) {
		case 0x00A0:  return 0xA0; // NO-BREAK SPACE
		case 0x00AF:  return 0x4C; // MACRON
		case 0x2015:  return 0x53; // HORIZONTAL BAR
		case 0x2026:  return 0x49; // HORIZONTAL ELLIPSIS
		case 0x2190:  return 0x48; // LEFTWARDS ARROW
		case 0x2191:  return 0x4B; // UPWARDS ARROW
		case 0x2192:  return 0x55; // RIGHTWARDS ARROW
		case 0x2193:  return 0x4A; // DOWNWARDS ARROW
		case 0x21B2:  return 0x4D; // DOWNWARDS ARROW WITH TIP LEFTWARDS
		case 0x21B5:  return 0x4D; // DOWNWARDS ARROW WITH CORNER LEFTWARDS
		case 0x2318:  return 0x41; // PLACE OF INTEREST SIGN
		case 0x231B:  return 0x43; // HOURGLASS
		case 0x2325:  return 0x40; // OPTION KEY
		case 0x23B8:  return 0x5F; // LEFT VERTICAL BOX LINE
		case 0x23B9:  return 0x5A; // RIGHT VERTICAL BOX LINE
		case 0x23BA:  return 0x4C; // HORIZONTAL SCAN LINE-1
		case 0x23BD:  return 0xDF; // HORIZONTAL SCAN LINE-9
		case 0x2425:  return 0xFF; // SYMBOL FOR DELETE FORM TWO
		case 0x2500:  return 0x53; // BOX DRAWINGS LIGHT HORIZONTAL
		case 0x2502:  return 0xFC; // BOX DRAWINGS LIGHT VERTICAL
		case 0x2581:  return 0xDF; // LOWER ONE EIGHTH BLOCK
		case 0x2589:  return 0x4E; // LEFT SEVEN EIGHTHS BLOCK
		case 0x258F:  return 0x5F; // LEFT ONE EIGHTH BLOCK
		case 0x2592:  return 0x56; // MEDIUM SHADE
		case 0x2594:  return 0x4C; // UPPER ONE EIGHTH BLOCK
		case 0x2595:  return 0x5A; // RIGHT ONE EIGHTH BLOCK
		case 0x25C6:  return 0x5B; // BLACK DIAMOND
		case 0x2666:  return 0x5B; // BLACK DIAMOND SUIT
		case 0x2713:  return 0x44; // CHECK MARK
		case 0xF812:  return 0x41; // Open Apple (Linux Private Use Area)
		case 0xF813:  return 0x40; // Solid Apple (Linux Private Use Area)
		case 0x1F34E: return 0x40; // RED APPLE
		case 0x1F34F: return 0x41; // GREEN APPLE
		case 0x1FB7C: return 0x54; // LEFT AND LOWER ONE EIGHTH BLOCK
		case 0x1FB80: return 0x5C; // UPPER AND LOWER ONE EIGHTH BLOCK
		case 0x1FB81: return 0x47; // HORIZONTAL ONE EIGHTH BLOCK-1358
		case 0x1FB90: return 0x57; // INVERSE MEDIUM SHADE
		case 0x1FBB0: return 0x42; // ARROWHEAD-SHAPED POINTER
		case 0x1FBB1: return 0x45; // INVERSE CHECK MARK
		case 0x1FBB2: return 0x46; // LEFT HALF RUNNING MAN
		case 0x1FBB3: return 0x47; // RIGHT HALF RUNNING MAN
		case 0x1FBB4: return 0x46; // INVERSE DOWNWARDS ARROW WITH TIP LEFTWARDS
		case 0x1FBB5: return 0x4F; // LEFTWARDS ARROW AND UPPER AND LOWER ONE EIGHTH BLOCK
		case 0x1FBB6: return 0x50; // RIGHTWARDS ARROW AND UPPER AND LOWER ONE EIGHTH BLOCK
		case 0x1FBB7: return 0x51; // DOWNWARDS ARROW AND RIGHT ONE EIGHTH BLOCK
		case 0x1FBB8: return 0x52; // UPWARDS ARROW AND RIGHT ONE EIGHTH BLOCK
		case 0x1FBB9: return 0x58; // LEFT HALF FOLDER
		case 0x1FBBA: return 0x59; // RIGHT HALF FOLDER
		case 0x1FBBB: return 0x5D; // VOIDED GREEK CROSS
		case 0x1FBBC: return 0x5E; // RIGHT OPEN SQUARED DOT
		default: return -1;
		}
	}
}
