package com.kreative.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public abstract class AbstractCharsetEncoder extends CharsetEncoder {
	protected static final int UNMAPPABLE = -1;
	protected static final int MALFORMED  = -2;
	protected static final int UNDERFLOW  = -3;
	
	protected AbstractCharsetEncoder(Charset cs, int maxBytes) {
		super(cs, 1, maxBytes);
	}
	
	@Override
	protected final CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
		while (in.hasRemaining()) {
			if (!out.hasRemaining()) return CoderResult.OVERFLOW;
			int p = in.position();
			int ch = getCodePoint(in);
			if (ch < 0) return CoderResult.UNDERFLOW;
			int b = encode(ch);
			for (;;) {
				if (b >= 0 && b < 0x100) {
					out.put((byte)b);
					break;
				} else if (b == UNMAPPABLE) {
					int n = in.position() - p; in.position(p);
					return CoderResult.unmappableForLength(n);
				} else if (b == MALFORMED) {
					int n = in.position() - p; in.position(p);
					return CoderResult.malformedForLength(n);
				} else if (b == UNDERFLOW) {
					if (in.hasRemaining()) {
						int cl = getCodePoint(in);
						if (cl >= 0) {
							ch = (ch << 16) | (cl & 0xFFFF);
							b = encode(ch);
							continue;
						}
					}
					in.position(p);
					return CoderResult.UNDERFLOW;
				} else {
					while ((b >> 24) == 0) { b <<= 8; }
					while (b != 0) { out.put((byte)(b >> 24)); b <<= 8; }
					break;
				}
			}
		}
		return CoderResult.UNDERFLOW;
	}
	
	protected abstract int encode(int ch);
	
	// Utility function to handle surrogate pairs.
	
	public static int getCodePoint(CharBuffer in) {
		char ch = in.get();
		if (Character.isHighSurrogate(ch)) {
			if (in.hasRemaining()) {
				char cl = in.get();
				if (Character.isLowSurrogate(cl)) {
					// High surrogate followed by low surrogate.
					// Return the code point represented by the surrogate pair.
					return Character.toCodePoint(ch, cl);
				} else {
					// Unpaired high surrogate followed by something else.
					// Backtrack over the something else and return the unpaired surrogate.
					in.position(in.position() - 1);
					return ch & 0xFFFF;
				}
			} else {
				// High surrogate but we don't know what it's followed by.
				// Backtrack over the surrogate and wait for more data.
				in.position(in.position() - 1);
				return -1;
			}
		} else {
			// BMP character or unpaired low surrogate.
			return ch & 0xFFFF;
		}
	}
}
