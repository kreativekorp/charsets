package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacHebrewJavaCharset extends Charset {
	public XMacHebrewJavaCharset() {
		super("x-MacHebrew-java", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacHebrewJavaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacHebrewJavaCharsetEncoder(this);
	}

	private static final class XMacHebrewJavaCharsetDecoder extends TableCharsetDecoder {
		private XMacHebrewJavaCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C4\uFB1F\u00C7\u00C9\u00D1\u00D6\u00DC\u00E1\u00E0\u00E2\u00E4\u00E3\u00E5\u00E7\u00E9\u00E8\u00EA\u00EB\u00ED\u00EC\u00EE\u00EF\u00F1\u00F3\u00F2\u00F4\u00F6\u00F5\u00FA\u00F9\u00FB\u00FC\u0000\u0000\u0000\u0000\u0000\u0000\u20AA".toCharArray();
		}
		private static final char[] GETOUTPUT0_C1 = getOutput0_C1();
		private static final char[] getOutput0_C1() {
			return "\u201E\u0000\u0000\u0000\u0000\u05BC\uFB4B\uFB35\u2026\u00A0\u05B8\u05B7\u05B5\u05B6\u05B4\u2013\u2014\u201C\u201D\u2018\u2019\uFB2A\uFB2B\u05BF\u05B0\u05B2\u05B1\u05BB\u05B9\u0000\u05B3".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xA6) return GETOUTPUT0_80[input - 0x80];
			if (input >= 0xE0 && input <= 0xFA) return input - 0xE0 + 0x5D0;
			if (input >= 0xC1 && input <= 0xDF) return GETOUTPUT0_C1[input - 0xC1];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMacHebrewJavaCharsetEncoder extends TableCharsetEncoder {
		private XMacHebrewJavaCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xC4 && input <= 0xFC) return CommonSubtables.COMMON1143[input - 0xC4];
			if (input >= 0x5D0 && input <= 0x5EA) return input - 0x5D0 + 0xE0;
			switch (input) {
			case 0xA0: return 0xCAL;
			case 0x5B0: return 0xD9L;
			case 0x5B1: return 0xDBL;
			case 0x5B2: return 0xDAL;
			case 0x5B3: return 0xDFL;
			case 0x5B4: return 0xCFL;
			case 0x5B5: return 0xCDL;
			case 0x5B6: return 0xCEL;
			case 0x5B7: return 0xCCL;
			case 0x5B8: return 0xCBL;
			case 0x5B9: return 0xDDL;
			case 0x5BB: return 0xDCL;
			case 0x5BC: return 0xC6L;
			case 0x5BF: return 0xD8L;
			case 0x2013: return 0xD0L;
			case 0x2014: return 0xD1L;
			case 0x2018: return 0xD4L;
			case 0x2019: return 0xD5L;
			case 0x201C: return 0xD2L;
			case 0x201D: return 0xD3L;
			case 0x201E: return 0xC1L;
			case 0x2026: return 0xC9L;
			case 0x20AA: return 0xA6L;
			case 0xFB1F: return 0x81L;
			case 0xFB2A: return 0xD6L;
			case 0xFB2B: return 0xD7L;
			case 0xFB35: return 0xC8L;
			case 0xFB4B: return 0xC7L;
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
