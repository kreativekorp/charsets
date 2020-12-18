package com.kreative.charset.sinclair;

import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetDecoder;

public class ZXSpectrumDecoder extends AbstractCharsetDecoder {
	private final ZXSpectrumVariant variant;
	
	public ZXSpectrumDecoder(Charset cs, ZXSpectrumVariant variant) {
		super(cs);
		this.variant = variant;
	}
	
	@Override
	protected int decode(int b) {
		if (b == 0x5E) return 0x2191; // UPWARDS ARROW
		if (b == 0x60) return 0x00A3; // POUND SIGN
		if (b == 0x7F) return 0x00A9; // COPYRIGHT SIGN
		if (b < 0x80) return b;
		int ch = variant.decode(b);
		return (ch < 0) ? UNMAPPABLE : ch;
	}
}
