package com.kreative.charset.sinclair;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class ZXSpectrumEncoder extends CharsetEncoder {
	private final ZXSpectrumVariant variant;
	
	protected ZXSpectrumEncoder(Charset cs, ZXSpectrumVariant variant) {
		super(cs, 1, 1);
		this.variant = variant;
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
			if (ch < 0x5E) out.put((byte)ch);
			else if (ch == 0x005F) out.put((byte)0x5F); // LOW LINE
			else if (ch > 0x60 && ch < 0x7F) out.put((byte)ch);
			else if (ch == 0x00A3) out.put((byte)0x60); // POUND SIGN
			else if (ch == 0x00A9) out.put((byte)0x7F); // COPYRIGHT SIGN
			else if (ch == 0x2191) out.put((byte)0x5E); // UPWARDS ARROW
			else {
				int b = variant.encode(ch);
				if (b < 0) return unmappable(in, ch);
				else out.put((byte)b);
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
