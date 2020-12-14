package com.kreative.charset.sinclair;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class ZXSpectrumDecoder extends CharsetDecoder {
	private final ZXSpectrumVariant variant;
	
	public ZXSpectrumDecoder(Charset cs, ZXSpectrumVariant variant) {
		super(cs, 1, 2);
		this.variant = variant;
	}
	
	@Override
	public CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
		while (in.hasRemaining()) {
			if (!out.hasRemaining()) return CoderResult.OVERFLOW;
			int b = in.get() & 0xFF;
			if (b < 0x5E) out.put((char)b);
			else if (b == 0x5E) out.put((char)0x2191); // UPWARDS ARROW
			else if (b == 0x5F) out.put((char)0x005F); // LOW LINE
			else if (b == 0x60) out.put((char)0x00A3); // POUND SIGN
			else if (b < 0x7F) out.put((char)b);
			else if (b == 0x7F) out.put((char)0x00A9); // COPYRIGHT SIGN
			else {
				int ch = variant.decode(b);
				if (ch < 0) return unmappable(in);
				else out.put(Character.toChars(ch));
			}
		}
		return CoderResult.UNDERFLOW;
	}
	
	private CoderResult unmappable(ByteBuffer in) {
		in.position(in.position() - 1);
		return CoderResult.unmappableForLength(1);
	}
}
