package com.kreative.charset.petscii;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class PetsciiCharset extends Charset {
	private static final String name(boolean alt, boolean video) {
		StringBuffer sb = new StringBuffer("x-petscii");
		if (alt) sb.append("-alt");
		if (video) sb.append("-video");
		return sb.toString();
	}
	
	private final boolean alt;
	private final boolean video;
	
	public PetsciiCharset(boolean alt, boolean video) {
		super(name(alt, video), new String[]{});
		this.alt = alt;
		this.video = video;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return false;
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new PetsciiDecoder(this, alt, video);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new PetsciiEncoder(this, alt, video);
	}
}
