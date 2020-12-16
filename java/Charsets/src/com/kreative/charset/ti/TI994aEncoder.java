package com.kreative.charset.ti;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class TI994aEncoder extends CharsetEncoder {
	protected TI994aEncoder(Charset cs) {
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
			if (ch == 0x2588) out.put((byte)0x1E);
			else if (ch == 0xA0) out.put((byte)0x1F);
			else if (ch < 0x80) out.put((byte)ch);
			else if (ch < 0xF07F) return unmappable(in, ch);
			else if (ch < 0xF0A0) out.put((byte)ch);
			else return unmappable(in, ch);
		}
		return CoderResult.UNDERFLOW;
	}
	
	private CoderResult unmappable(CharBuffer in, int ch) {
		int i = Character.charCount(ch);
		in.position(in.position() - i);
		return CoderResult.unmappableForLength(i);
	}
}
