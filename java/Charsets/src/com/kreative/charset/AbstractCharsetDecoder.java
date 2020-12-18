package com.kreative.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public abstract class AbstractCharsetDecoder extends CharsetDecoder {
	protected static final int UNMAPPABLE = -1;
	protected static final int MALFORMED  = -2;
	protected static final int UNDERFLOW  = -3;
	
	protected AbstractCharsetDecoder(Charset cs) {
		super(cs, 1, 2);
	}
	
	@Override
	protected final CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
		while (in.hasRemaining()) {
			if (!out.hasRemaining()) return CoderResult.OVERFLOW;
			int p = in.position();
			int b = in.get() & 0xFF;
			int ch = decode(b);
			for (;;) {
				if (ch >= 0 && ch < 0x110000) {
					out.put(Character.toChars(ch));
					break;
				} else if (ch == UNMAPPABLE) {
					int n = in.position() - p; in.position(p);
					return CoderResult.unmappableForLength(n);
				} else if (ch == MALFORMED) {
					int n = in.position() - p; in.position(p);
					return CoderResult.malformedForLength(n);
				} else if (ch == UNDERFLOW) {
					if (in.hasRemaining()) {
						b = (b << 8) | (in.get() & 0xFF);
						ch = decode(b);
						continue;
					}
					in.position(p);
					return CoderResult.UNDERFLOW;
				} else {
					out.put((char)(ch >> 16));
					out.put((char)ch);
					break;
				}
			}
		}
		return CoderResult.UNDERFLOW;
	}
	
	protected abstract int decode(int b);
}
