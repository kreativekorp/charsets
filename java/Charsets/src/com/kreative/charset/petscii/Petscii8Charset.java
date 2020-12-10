package com.kreative.charset.petscii;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class Petscii8Charset extends Charset {
	public Petscii8Charset() {
		super("x-petscii8", new String[]{});
	}
	
	@Override
	public boolean contains(Charset cs) {
		return cs.name().equalsIgnoreCase("us-ascii");
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new Petscii8Decoder(this);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new Petscii8Encoder(this);
	}
}
