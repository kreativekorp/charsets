package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKkSupermultinationalFullCharset extends Charset {
	public XKkSupermultinationalFullCharset() {
		super("x-kk-supermultinational-full", new String[]{"x-kk-supermultinational"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKkSupermultinationalFullCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKkSupermultinationalFullCharsetEncoder(this);
	}

	private static final class XKkSupermultinationalFullCharsetDecoder extends TableCharsetDecoder {
		private XKkSupermultinationalFullCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u0160\u017D\u0178\u0161\u017E\u25CA\u2318\b\t\n\u000B\f\r\u2018\u00AD\uF8FF\u2122\u221A\u2211\u220F\u222B\u2206\u03A9\u03C0\u2202\u221E\u001B\u2264\u2260\u2265\u2248".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x87 && input <= 0x96) return input - 0x87 + 0xC7;
			if (input >= 0x80 && input <= 0xFF) return CommonSubtables.COMMON1568[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKkSupermultinationalFullCharsetEncoder extends TableCharsetEncoder {
		private XKkSupermultinationalFullCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u0080\u00A1\u00A2\u00A3\u00A8\u00A5\u00B5\u00A7\u00C8\u00A0\u00E3\u00AB\u00BE\u000F\u00B0\u00C5\u00FE\u00D1\u00C9\u00CC\u00C2\u009D\u00B6\u00B4\u00CB\u00C0\u00EB\u00BB\u00D2\u00D3\u00D4\u00BF\u0081\u0082\u0083\u0084\u0085\u0086\u00E1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009E\u00E9\u0097\u0098\u0099\u009A\u009B\u009C\u00FB\u00D5\u00D6\u00D7\u00D8\u00D9\u00DA\u00F1\u00DB\u00DC\u00DD\u00DE\u00DF\u00E0\u00E2\u00E4\u00E5\u00E6\u00E7\u00EC\u00ED\u00EE\u00EF\u00F0\u009F\u00F9\u00F2\u00F3\u00F4\u00F6\u00F7\u00FC\u00FD".toCharArray();
		}
		private static final char[] GETOUTPUT0_2013 = getOutput0_2013();
		private static final char[] getOutput0_2013() {
			return "\u00B1\u00D0\u0000\u0000\u0000\u000E\u00A9\u00B8\u0000\u00AA\u00BA\u00B9\u0000\u00B2\u00B3\u00B7\u0000\u0000\u0000\u00BC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00BD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00AC\u00AD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A4".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xC7 && input <= 0xD6) return input - 0xC7 + 0x87;
			if (input >= 0xA0 && input <= 0xFF) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x2013 && input <= 0x2044) return GETOUTPUT0_2013[input - 0x2013];
			switch (input) {
			case 0x0: return 0x1L;
			case 0x8: return 0x8L;
			case 0x9: return 0x9L;
			case 0xA: return 0xAL;
			case 0xB: return 0xBL;
			case 0xC: return 0xCL;
			case 0xD: return 0xDL;
			case 0x1B: return 0x1BL;
			case 0x131: return 0xF5L;
			case 0x141: return 0xE8L;
			case 0x142: return 0xF8L;
			case 0x152: return 0xEAL;
			case 0x153: return 0xFAL;
			case 0x160: return 0x101L;
			case 0x161: return 0x401L;
			case 0x178: return 0x301L;
			case 0x17D: return 0x201L;
			case 0x17E: return 0x501L;
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
			case 0x3A9: return 0x17L;
			case 0x3C0: return 0x18L;
			case 0x20AC: return 0xFF01L;
			case 0x2122: return 0x11L;
			case 0x2202: return 0x19L;
			case 0x2206: return 0x16L;
			case 0x220F: return 0x14L;
			case 0x2211: return 0x13L;
			case 0x221A: return 0x12L;
			case 0x221E: return 0x1AL;
			case 0x222B: return 0x15L;
			case 0x2248: return 0x1FL;
			case 0x2260: return 0x1DL;
			case 0x2264: return 0x1CL;
			case 0x2265: return 0x1EL;
			case 0x2318: return 0x701L;
			case 0x25CA: return 0x601L;
			case 0xF8FF: return 0x10L;
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
