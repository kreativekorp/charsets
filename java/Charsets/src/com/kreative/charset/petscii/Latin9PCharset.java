package com.kreative.charset.petscii;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class Latin9PCharset extends Charset {
	public Latin9PCharset() {
		super("x-latin9p-video", new String[]{});
	}
	
	@Override
	public boolean contains(Charset cs) {
		return false;
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new Latin9PDecoder(this);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new Latin9PEncoder(this);
	}
}
