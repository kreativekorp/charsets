package com.kreative.charset.sinclair;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class SinclairQLCharset extends Charset {
	private final boolean video;
	
	public SinclairQLCharset(boolean video) {
		super((video ? "x-sinclairql-video" : "x-sinclairql"), new String[]{});
		this.video = video;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return false;
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new SinclairQLDecoder(this, video);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new SinclairQLEncoder(this, video);
	}
}
