package com.kreative.charset.ti;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class TI994aCharset extends Charset {
	public TI994aCharset() {
		super("x-ti994a", new String[]{});
	}
	
	@Override
	public boolean contains(Charset cs) {
		return cs.name().equalsIgnoreCase("us-ascii");
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new TI994aDecoder(this);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new TI994aEncoder(this);
	}
}
