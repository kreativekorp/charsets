package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKkSuperlatinFullCharset extends Charset {
	public XKkSuperlatinFullCharset() {
		super("x-kk-superlatin-full", new String[]{"x-kk-superlatin"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKkSuperlatinFullCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKkSuperlatinFullCharsetEncoder(this);
	}

	private static final class XKkSuperlatinFullCharsetDecoder extends TableCharsetDecoder {
		private XKkSuperlatinFullCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u02CB\u02DD\u02D9\u02DA\u02C7\u02D8\u02DB\b\t\n\u000B\f\r\uFB01\uFB02\uF8FF\u2044\u221A\u2211\u220F\u222B\u2206\u03A9\u03C0\u2202\u221E\u001B\u2264\u2260\u2265\u2248".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0xA0 && input <= 0xFF) return input - 0xA0 + 0xA0;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.COMMON1567[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKkSuperlatinFullCharsetEncoder extends TableCharsetEncoder {
		private XKkSuperlatinFullCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_2013 = getOutput0_2013();
		private static final char[] getOutput0_2013() {
			return "\u0096\u0097\u0000\u0000\u0000\u0091\u0092\u0082\u0000\u0093\u0094\u0084\u0000\u0086\u0087\u0095\u0000\u0000\u0000\u0085\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0089\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008B\u009B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0011".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFE) return input - 0xA0 + 0xA0;
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
			case 0xFF: return 0xFF01L;
			case 0x131: return 0x8FL;
			case 0x141: return 0x8DL;
			case 0x142: return 0x9DL;
			case 0x152: return 0x8CL;
			case 0x153: return 0x9CL;
			case 0x160: return 0x8AL;
			case 0x161: return 0x9AL;
			case 0x178: return 0x9FL;
			case 0x17D: return 0x8EL;
			case 0x17E: return 0x9EL;
			case 0x192: return 0x83L;
			case 0x2C6: return 0x88L;
			case 0x2C7: return 0x501L;
			case 0x2CB: return 0x101L;
			case 0x2D8: return 0x601L;
			case 0x2D9: return 0x301L;
			case 0x2DA: return 0x401L;
			case 0x2DB: return 0x701L;
			case 0x2DC: return 0x98L;
			case 0x2DD: return 0x201L;
			case 0x3A9: return 0x17L;
			case 0x3C0: return 0x18L;
			case 0x20AC: return 0x80L;
			case 0x2122: return 0x99L;
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
			case 0x2318: return 0x90L;
			case 0x25CA: return 0x81L;
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
