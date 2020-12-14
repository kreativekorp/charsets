package com.kreative.charset.sinclair;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class ZXSpectrumCharset extends Charset {
	private final ZXSpectrumVariant variant;
	
	public ZXSpectrumCharset(ZXSpectrumVariant variant) {
		super(variant.toString(), new String[]{});
		this.variant = variant;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return false;
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new ZXSpectrumDecoder(this, variant);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new ZXSpectrumEncoder(this, variant);
	}
}
