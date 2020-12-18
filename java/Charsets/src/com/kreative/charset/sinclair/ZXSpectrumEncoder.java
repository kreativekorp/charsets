package com.kreative.charset.sinclair;

import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetEncoder;

public class ZXSpectrumEncoder extends AbstractCharsetEncoder {
	private final ZXSpectrumVariant variant;
	
	protected ZXSpectrumEncoder(Charset cs, ZXSpectrumVariant variant) {
		super(cs, 1);
		this.variant = variant;
	}
	
	@Override
	protected int encode(int ch) {
		if (ch < 0x5E || ch == 0x5F) return ch;
		if (ch > 0x60 && ch < 0x7F) return ch;
		if (ch == 0x00A3) return 0x60; // POUND SIGN
		if (ch == 0x00A9) return 0x7F; // COPYRIGHT SIGN
		if (ch == 0x2191) return 0x5E; // UPWARDS ARROW
		int b = variant.encode(ch);
		return (b < 0) ? UNMAPPABLE : b;
	}
}
