package com.kreative.charset.atari;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class AtariSTCharset extends Charset {
	private final boolean video;
	
	public AtariSTCharset(boolean video) {
		super((video ? "x-atarist-video" : "x-atarist"), new String[]{});
		this.video = video;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return !video && cs.name().equalsIgnoreCase("us-ascii");
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new AtariSTDecoder(this, video);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new AtariSTEncoder(this, video);
	}
}
