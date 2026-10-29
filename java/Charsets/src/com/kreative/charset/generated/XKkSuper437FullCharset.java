package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKkSuper437FullCharset extends Charset {
	public XKkSuper437FullCharset() {
		super("x-kk-super437-full", new String[]{"x-kk-super437"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKkSuper437FullCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKkSuper437FullCharsetEncoder(this);
	}

	private static final class XKkSuper437FullCharsetDecoder extends TableCharsetDecoder {
		private XKkSuper437FullCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u02CB\u02DD\u02D9\u02DA\u02C7\u02D8\u02DB\b\t\n\u000B\f\r\uFB01\uFB02\uF8FF\u2020\u2021\u02C6\u02DC\u00A8\u00B4\u00B8\u201A\u201E\u2026\u001B\u2018\u2019\u201C\u201D".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x80 && input <= 0xFF) return CommonSubtables.COMMON1566[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKkSuper437FullCharsetEncoder extends TableCharsetEncoder {
		private XKkSuper437FullCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\uFF01\u00AD\u009B\u009C\u009E\u009D\u00DD\u00E5\u0015\u00D6\u00A6\u00AE\u00AA\u00A9\u00D7\u00EF\u00F8\u00F1\u00FD\u00FE\u0016\u00E6\u00ED\u00FA\u0017\u00FC\u00A7\u00AF\u00AC\u00AB\u00DC\u00A8\u00B5\u00D0\u00B3\u00B4\u008E\u008F\u0092\u0080\u00BA\u0090\u00B8\u00B9\u00BD\u00D1\u00BC\u00BB\u00CC\u00A5\u00C5\u00D2\u00C3\u00C4\u0099\u00E7\u00B6\u00C7\u00D3\u00C6\u009A\u00B1\u00CD\u00E1\u0085\u00A0\u0083\u00BE\u0084\u0086\u0091\u0087\u008A\u0082\u0088\u0089\u008D\u00A1\u008C\u008B\u00CB\u00A4\u0095\u00A2\u0093\u00C9\u0094\u00F6\u00BF\u0097\u00A3\u0096\u0081\u00CA\u00CE\u0098".toCharArray();
		}
		private static final char[] GETOUTPUT0_2013 = getOutput0_2013();
		private static final char[] getOutput0_2013() {
			return "\u00D9\u00DA\u0000\u0000\u0000\u001C\u001D\u0018\u0000\u001E\u001F\u0019\u0000\u0011\u0012\u00F9\u0000\u0000\u0000\u001A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00DB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00DE\u00DF\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00F5".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
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
			case 0x2C6: return 0x13L;
			case 0x2C7: return 0x501L;
			case 0x2CB: return 0x101L;
			case 0x2D8: return 0x601L;
			case 0x2D9: return 0x301L;
			case 0x2DA: return 0x401L;
			case 0x2DB: return 0x701L;
			case 0x2DC: return 0x14L;
			case 0x2DD: return 0x201L;
			case 0x3A9: return 0xEAL;
			case 0x3C0: return 0xE3L;
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
			case 0xF8FF: return 0x10L;
			case 0xFB01: return 0xEL;
			case 0xFB02: return 0xFL;
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
