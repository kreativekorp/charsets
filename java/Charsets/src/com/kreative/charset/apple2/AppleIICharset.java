package com.kreative.charset.apple2;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class AppleIICharset extends Charset {
	private static final String name(boolean enhanced, boolean iigs, LogoSubstitute logo) {
		StringBuffer sb = new StringBuffer("x-apple2");
		if (enhanced) sb.append(iigs ? "gs" : "e");
		switch (logo) {
		case TECHNICAL: sb.append("-mod"); break;
		case LINUX_PUA: sb.append("-linux"); break;
		case EMOJI: sb.append("-emoji"); break;
		default: break;
		}
		return sb.toString();
	}
	
	private final boolean enhanced;
	private final boolean iigs;
	private final LogoSubstitute logo;
	
	public AppleIICharset(boolean enhanced, boolean iigs, LogoSubstitute logo) {
		super(name(enhanced, iigs, logo), new String[]{});
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
