package com.kreative.charset.atari;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class AtasciiCharset extends Charset {
	private static final String name(boolean intl, boolean video) {
		StringBuffer sb = new StringBuffer("x-atascii");
		if (intl) sb.append("-int");
		if (video) sb.append("-video");
		return sb.toString();
	}
	
	private final boolean intl;
	private final boolean video;
	
	public AtasciiCharset(boolean intl, boolean video) {
		super(name(intl, video), new String[]{});
		this.intl = intl;
		this.video = video;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return false;
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new AtasciiDecoder(this, intl, video);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new AtasciiEncoder(this, intl, video);
	}
}
