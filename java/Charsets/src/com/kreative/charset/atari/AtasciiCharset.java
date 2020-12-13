package com.kreative.charset.atari;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class AtasciiCharset extends Charset {
	private final boolean video;
	
	public AtasciiCharset(boolean video) {
		super((video ? "x-atascii-video" : "x-atascii"), new String[]{});
		this.video = video;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return false;
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new AtasciiDecoder(this, video);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new AtasciiEncoder(this);
	}
}
