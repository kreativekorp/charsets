package com.kreative.charset.apple2;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class AppleIICharset extends Charset {
	private static final String name(boolean enhanced, boolean iigs, LogoSubstitute logo) {
		StringBuffer sb = new StringBuffer("x-apple2");
		if (enhanced) sb.append(iigs ? "gs" : "e");
		sb.append(logo.suffix);
		return sb.toString();
	}
	
	private static final String[] aliases(boolean enhanced, boolean iigs, LogoSubstitute logo) {
		if (enhanced && iigs) {
			StringBuffer sb = new StringBuffer("x-apple2c");
			sb.append(logo.suffix);
			return new String[]{sb.toString()};
		} else {
			return new String[]{};
		}
	}
	
	private final boolean enhanced;
	private final boolean iigs;
	private final LogoSubstitute logo;
	
	public AppleIICharset(boolean enhanced, boolean iigs, LogoSubstitute logo) {
		super(name(enhanced, iigs, logo), aliases(enhanced, iigs, logo));
		this.enhanced = enhanced;
		this.iigs = iigs;
		this.logo = logo;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return cs.name().equalsIgnoreCase("us-ascii");
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new AppleIIDecoder(this, enhanced, iigs, logo);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new AppleIIEncoder(this, enhanced);
	}
}
