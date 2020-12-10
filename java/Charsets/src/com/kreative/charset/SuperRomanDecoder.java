package com.kreative.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class SuperRomanDecoder extends CharsetDecoder {
	private static final char[] SUPERROMAN_LOW = {
		'\u0000', '\u00B9', '\u00B2', '\u00B3', '\u00BC', '\u00BD', '\u00BE', '\u00D7',
		'\b'    , '\t'    , '\n',     '\u000B', '\f'    , '\r'    , '\u02CB', '\u00AD',
		'\u2318', '\u0141', '\u0160', '\u00DD', '\u017D', '\u0142', '\u0161', '\u00FD',
		'\u017E', '\u00A4', '\u00A6', '\u001B', '\u00D0', '\u00F0', '\u00DE', '\u00FE',
	};
	private static final char[] SUPERROMAN_HIGH = {
		'\u00C4', '\u00C5', '\u00C7', '\u00C9', '\u00D1', '\u00D6', '\u00DC', '\u00E1',
		'\u00E0', '\u00E2', '\u00E4', '\u00E3', '\u00E5', '\u00E7', '\u00E9', '\u00E8',
		'\u00EA', '\u00EB', '\u00ED', '\u00EC', '\u00EE', '\u00EF', '\u00F1', '\u00F3',
		'\u00F2', '\u00F4', '\u00F6', '\u00F5', '\u00FA', '\u00F9', '\u00FB', '\u00FC',
		'\u2020', '\u00B0', '\u00A2', '\u00A3', '\u00A7', '\u2022', '\u00B6', '\u00DF',
		'\u00AE', '\u00A9', '\u2122', '\u00B4', '\u00A8', '\u2260', '\u00C6', '\u00D8',
		'\u221E', '\u00B1', '\u2264', '\u2265', '\u00A5', '\u00B5', '\u2202', '\u2211',
		'\u220F', '\u03C0', '\u222B', '\u00AA', '\u00BA', '\u03A9', '\u00E6', '\u00F8',
		'\u00BF', '\u00A1', '\u00AC', '\u221A', '\u0192', '\u2248', '\u2206', '\u00AB',
		'\u00BB', '\u2026', '\u00A0', '\u00C0', '\u00C3', '\u00D5', '\u0152', '\u0153',
		'\u2013', '\u2014', '\u201C', '\u201D', '\u2018', '\u2019', '\u00F7', '\u25CA',
		'\u00FF', '\u0178', '\u2044', '\u20AC', '\u2039', '\u203A', '\uFB01', '\uFB02',
		'\u2021', '\u00B7', '\u201A', '\u201E', '\u2030', '\u00C2', '\u00CA', '\u00C1',
		'\u00CB', '\u00C8', '\u00CD', '\u00CE', '\u00CF', '\u00CC', '\u00D3', '\u00D4',
		'\uF8FF', '\u00D2', '\u00DA', '\u00DB', '\u00D9', '\u0131', '\u02C6', '\u02DC',
		'\u00AF', '\u02D8', '\u02D9', '\u02DA', '\u00B8', '\u02DD', '\u02DB', '\u02C7',
	};
	
	private final boolean overrideC0;
	
	public SuperRomanDecoder(Charset cs, boolean overrideC0) {
		super(cs, 1, 1);
		this.overrideC0 = overrideC0;
	}
	
	@Override
	public CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
		while (in.hasRemaining()) {
			if (!out.hasRemaining()) return CoderResult.OVERFLOW;
			int b = in.get() & 0xFF;
			if (b < 0x20) out.put(overrideC0 ? SUPERROMAN_LOW[b] : (char)b);
			else if (b < 0x80) out.put((char)b);
			else out.put(SUPERROMAN_HIGH[b & 0x7F]);
		}
		return CoderResult.UNDERFLOW;
	}
}
