package com.kreative.charset.sinclair;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class ZX8xCharset extends Charset {
	private final boolean zx81;
	
	public ZX8xCharset(boolean zx81) {
		super((zx81 ? "x-zx81" : "x-zx80"), new String[]{});
		this.zx81 = zx81;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return cs.name().equalsIgnoreCase("x-zx80") || cs.name().equalsIgnoreCase("x-zx81");
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new ZX8xDecoder(this, zx81);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new ZX8xEncoder(this, zx81);
	}
}
