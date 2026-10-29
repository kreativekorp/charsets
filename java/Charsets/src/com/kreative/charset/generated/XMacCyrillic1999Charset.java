package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacCyrillic1999Charset extends Charset {
	public XMacCyrillic1999Charset() {
		super("x-MacCyrillic-1999", new String[]{"x-MacCyrillic", "x-MacUkrainian-1999", "x-MacUkrainian"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacCyrillic1999CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacCyrillic1999CharsetEncoder(this);
	}

	private static final class XMacCyrillic1999CharsetDecoder extends TableCharsetDecoder {
		private XMacCyrillic1999CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0x9F) return input - 0x80 + 0x410;
			if (input >= 0xE0 && input <= 0xFE) return input - 0xE0 + 0x430;
			if (input >= 0xA0 && input <= 0xDF) return CommonSubtables.COMMON1129[input - 0xA0];
			switch (input) {
			case 0xFF: return 0x20ACL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMacCyrillic1999CharsetEncoder extends TableCharsetEncoder {
		private XMacCyrillic1999CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x410 && input <= 0x42F) return input - 0x410 + 0x80;
			if (input >= 0x430 && input <= 0x44E) return input - 0x430 + 0xE0;
			switch (input) {
			case 0xA0: return 0xCAL;
			case 0xA3: return 0xA3L;
			case 0xA7: return 0xA4L;
			case 0xA9: return 0xA9L;
			case 0xAB: return 0xC7L;
			case 0xAC: return 0xC2L;
			case 0xAE: return 0xA8L;
			case 0xB0: return 0xA1L;
			case 0xB1: return 0xB1L;
			case 0xB5: return 0xB5L;
			case 0xB6: return 0xA6L;
			case 0xBB: return 0xC8L;
			case 0xF7: return 0xD6L;
			case 0x192: return 0xC4L;
			case 0x401: return 0xDDL;
			case 0x402: return 0xABL;
			case 0x403: return 0xAEL;
			case 0x404: return 0xB8L;
			case 0x405: return 0xC1L;
			case 0x406: return 0xA7L;
			case 0x407: return 0xBAL;
			case 0x408: return 0xB7L;
			case 0x409: return 0xBCL;
			case 0x40A: return 0xBEL;
			case 0x40B: return 0xCBL;
			case 0x40C: return 0xCDL;
			case 0x40E: return 0xD8L;
			case 0x40F: return 0xDAL;
			case 0x44F: return 0xDFL;
			case 0x451: return 0xDEL;
			case 0x452: return 0xACL;
			case 0x453: return 0xAFL;
			case 0x454: return 0xB9L;
			case 0x455: return 0xCFL;
			case 0x456: return 0xB4L;
			case 0x457: return 0xBBL;
			case 0x458: return 0xC0L;
			case 0x459: return 0xBDL;
			case 0x45A: return 0xBFL;
			case 0x45B: return 0xCCL;
			case 0x45C: return 0xCEL;
			case 0x45E: return 0xD9L;
			case 0x45F: return 0xDBL;
			case 0x490: return 0xA2L;
			case 0x491: return 0xB6L;
			case 0x2013: return 0xD0L;
			case 0x2014: return 0xD1L;
			case 0x2018: return 0xD4L;
			case 0x2019: return 0xD5L;
			case 0x201C: return 0xD2L;
			case 0x201D: return 0xD3L;
			case 0x201E: return 0xD7L;
			case 0x2020: return 0xA0L;
			case 0x2022: return 0xA5L;
			case 0x2026: return 0xC9L;
			case 0x20AC: return 0xFF01L;
			case 0x2116: return 0xDCL;
			case 0x2122: return 0xAAL;
			case 0x2206: return 0xC6L;
			case 0x221A: return 0xC3L;
			case 0x221E: return 0xB0L;
			case 0x2248: return 0xC5L;
			case 0x2260: return 0xADL;
			case 0x2264: return 0xB2L;
			case 0x2265: return 0xB3L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}
}
