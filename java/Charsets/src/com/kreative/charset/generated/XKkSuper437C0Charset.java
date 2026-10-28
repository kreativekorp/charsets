package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKkSuper437C0Charset extends Charset {
	public XKkSuper437C0Charset() {
		super("x-kk-super437-c0", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKkSuper437C0CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKkSuper437C0CharsetEncoder(this);
	}

	private static final class XKkSuper437C0CharsetDecoder extends TableCharsetDecoder {
		private XKkSuper437C0CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFF) return CommonSubtables.COMMON1559[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKkSuper437C0CharsetEncoder extends TableCharsetEncoder {
		private XKkSuper437C0CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\uFF01\u00AD\u009B\u009C\u009E\u009D\u00DD\u00E5\u0000\u00D6\u00A6\u00AE\u00AA\u00A9\u00D7\u00EF\u00F8\u00F1\u00FD\u00FE\u0000\u00E6\u00ED\u00FA\u0000\u00FC\u00A7\u00AF\u00AC\u00AB\u00DC\u00A8\u00B5\u00D0\u00B3\u00B4\u008E\u008F\u0092\u0080\u00BA\u0090\u00B8\u00B9\u00BD\u00D1\u00BC\u00BB\u00CC\u00A5\u00C5\u00D2\u00C3\u00C4\u0099\u00E7\u00B6\u00C7\u00D3\u00C6\u009A\u00B1\u00CD\u00E1\u0085\u00A0\u0083\u00BE\u0084\u0086\u0091\u0087\u008A\u0082\u0088\u0089\u008D\u00A1\u008C\u008B\u00CB\u00A4\u0095\u00A2\u0093\u00C9\u0094\u00F6\u00BF\u0097\u00A3\u0096\u0081\u00CA\u00CE\u0098".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x131: return 0xCFL;
			case 0x141: return 0xB2L;
			case 0x142: return 0xC0L;
			case 0x152: return 0xC1L;
			case 0x153: return 0xC2L;
			case 0x160: return 0xB7L;
			case 0x161: return 0xB0L;
			case 0x178: return 0xC8L;
			case 0x17D: return 0xD4L;
			case 0x17E: return 0xD5L;
			case 0x192: return 0x9FL;
			case 0x3A9: return 0xEAL;
			case 0x3C0: return 0xE3L;
			case 0x2013: return 0xD9L;
			case 0x2014: return 0xDAL;
			case 0x2022: return 0xF9L;
			case 0x2030: return 0xDBL;
			case 0x2039: return 0xDEL;
			case 0x203A: return 0xDFL;
			case 0x2044: return 0xF5L;
			case 0x20AC: return 0xEEL;
			case 0x2122: return 0xD8L;
			case 0x2202: return 0xEBL;
			case 0x2206: return 0xE9L;
			case 0x220F: return 0xE2L;
			case 0x2211: return 0xE4L;
			case 0x221A: return 0xFBL;
			case 0x221E: return 0xECL;
			case 0x222B: return 0xF4L;
			case 0x2248: return 0xF7L;
			case 0x2260: return 0xF0L;
			case 0x2264: return 0xF3L;
			case 0x2265: return 0xF2L;
			case 0x2318: return 0xE0L;
			case 0x25CA: return 0xE8L;
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
