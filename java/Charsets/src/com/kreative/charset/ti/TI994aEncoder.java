package com.kreative.charset.ti;

import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetEncoder;

public class TI994aEncoder extends AbstractCharsetEncoder {
	protected TI994aEncoder(Charset cs) {
		super(cs, 1);
	}
	
	@Override
	protected int encode(int ch) {
		if (ch == 0x2588) return 0x1E;
		if (ch == 0x00A0) return 0x1F;
		if (ch < 0x0080) return ch;
		if (ch < 0xF07F) return UNMAPPABLE;
		if (ch < 0xF0A0) return ch & 0xFF;
		return UNMAPPABLE;
	}
}
