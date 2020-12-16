package com.kreative.charset.ti;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class TI994aDecoder extends CharsetDecoder {
	public TI994aDecoder(Charset cs) {
		super(cs, 1, 2);
	}
	
	@Override
	public CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
		while (in.hasRemaining()) {
			if (!out.hasRemaining()) return CoderResult.OVERFLOW;
			int b = in.get() & 0xFF;
			if (b == 0x1E) out.put((char)0x2588);
			else if (b == 0x1F) out.put((char)0xA0);
			else if (b < 0x7F) out.put((char)b);
			else if (b < 0xA0) out.put((char)(b | 0xF000));
			else {
				in.position(in.position() - 1);
				return CoderResult.unmappableForLength(1);
			}
		}
		return CoderResult.UNDERFLOW;
	}
}
