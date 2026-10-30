package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKkSupermultinationalC0Charset extends Charset {
	public XKkSupermultinationalC0Charset() {
		super("x-kk-supermultinational-c0", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKkSupermultinationalC0CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKkSupermultinationalC0CharsetEncoder(this);
	}

	private static final class XKkSupermultinationalC0CharsetDecoder extends TableCharsetDecoder {
		private XKkSupermultinationalC0CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x87 && input <= 0x96) return input - 0x87 + 0xC7;
			if (input >= 0x80 && input <= 0xFF) return CommonSubtables.COMMON1573[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKkSupermultinationalC0CharsetEncoder extends TableCharsetEncoder {
		private XKkSupermultinationalC0CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u0080\u00A1\u00A2\u00A3\u00A8\u00A5\u00B5\u00A7\u00C8\u00A0\u00E3\u00AB\u00BE\u0000\u00B0\u00C5\u00FE\u00D1\u00C9\u00CC\u00C2\u009D\u00B6\u00B4\u00CB\u00C0\u00EB\u00BB\u00D2\u00D3\u00D4\u00BF\u0081\u0082\u0083\u0084\u0085\u0086\u00E1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009E\u00E9\u0097\u0098\u0099\u009A\u009B\u009C\u00FB\u00D5\u00D6\u00D7\u00D8\u00D9\u00DA\u00F1\u00DB\u00DC\u00DD\u00DE\u00DF\u00E0\u00E2\u00E4\u00E5\u00E6\u00E7\u00EC\u00ED\u00EE\u00EF\u00F0\u009F\u00F9\u00F2\u00F3\u00F4\u00F6\u00F7\u00FC\u00FD".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xC7 && input <= 0xD6) return input - 0xC7 + 0x87;
			if (input >= 0xA0 && input <= 0xFF) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x131: return 0xF5L;
			case 0x141: return 0xE8L;
			case 0x142: return 0xF8L;
			case 0x152: return 0xEAL;
			case 0x153: return 0xFAL;
			case 0x192: return 0xA6L;
			case 0x2C6: return 0xC3L;
			case 0x2C7: return 0xCFL;
			case 0x2CB: return 0xC1L;
			case 0x2D8: return 0xC6L;
			case 0x2D9: return 0xC7L;
			case 0x2DA: return 0xCAL;
			case 0x2DB: return 0xCEL;
			case 0x2DC: return 0xC4L;
			case 0x2DD: return 0xCDL;
			case 0x2013: return 0xB1L;
			case 0x2014: return 0xD0L;
			case 0x2019: return 0xA9L;
			case 0x201A: return 0xB8L;
			case 0x201C: return 0xAAL;
			case 0x201D: return 0xBAL;
			case 0x201E: return 0xB9L;
			case 0x2020: return 0xB2L;
			case 0x2021: return 0xB3L;
			case 0x2022: return 0xB7L;
			case 0x2026: return 0xBCL;
			case 0x2030: return 0xBDL;
			case 0x2039: return 0xACL;
			case 0x203A: return 0xADL;
			case 0x2044: return 0xA4L;
			case 0x20AC: return 0xFF01L;
			case 0xFB01: return 0xAEL;
			case 0xFB02: return 0xAFL;
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
