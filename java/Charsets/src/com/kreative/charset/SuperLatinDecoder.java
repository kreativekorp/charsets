package com.kreative.charset;

import java.nio.charset.Charset;

public class SuperLatinDecoder extends AbstractCharsetDecoder {
	private static final char[] SUPERLATIN_LOW = {
		'\u0000', '\u02CB', '\u02DD', '\u02D9', '\u02DA', '\u02C7', '\u02D8', '\u02DB',
		'\b'    , '\t'    , '\n',     '\u000B', '\f'    , '\r'    , '\uFB01', '\uFB02',
		'\uF8FF', '\u2044', '\u221A', '\u2211', '\u220F', '\u222B', '\u2206', '\u03A9',
		'\u03C0', '\u2202', '\u221E', '\u001B', '\u2264', '\u2260', '\u2265', '\u2248',
	};
	private static final char[] SUPERLATIN_HIGH = {
		'\u20AC', '\u25CA', '\u201A', '\u0192', '\u201E', '\u2026', '\u2020', '\u2021',
		'\u02C6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0141', '\u017D', '\u0131',
		'\u2318', '\u2018', '\u2019', '\u201C', '\u201D', '\u2022', '\u2013', '\u2014',
		'\u02DC', '\u2122', '\u0161', '\u203A', '\u0153', '\u0142', '\u017E', '\u0178',
	};
	
	private final boolean overrideC0;
	
	public SuperLatinDecoder(Charset cs, boolean overrideC0) {
		super(cs);
		this.overrideC0 = overrideC0;
	}
	
	@Override
	protected int decode(int b) {
		if (overrideC0 && b < 0x20) return SUPERLATIN_LOW[b];
		return (b < 0x80) ? b : (b < 0xA0) ? SUPERLATIN_HIGH[b & 0x1F] : b;
	}
}
