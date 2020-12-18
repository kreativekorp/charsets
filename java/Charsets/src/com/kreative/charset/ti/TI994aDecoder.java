package com.kreative.charset.ti;

import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetDecoder;

public class TI994aDecoder extends AbstractCharsetDecoder {
	public TI994aDecoder(Charset cs) {
		super(cs);
	}
	
	@Override
	protected int decode(int b) {
		if (b == 0x1E) return 0x2588; // FULL BLOCK
		if (b == 0x1F) return 0x00A0; // NO-BREAK SPACE
		if (b < 0x7F) return b;
		if (b < 0xA0) return b | 0xF000;
		return UNMAPPABLE;
	}
}
