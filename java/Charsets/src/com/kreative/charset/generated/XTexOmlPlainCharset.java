package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTexOmlPlainCharset extends Charset {
	public XTexOmlPlainCharset() {
		super("x-tex-oml-plain", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTexOmlPlainCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTexOmlPlainCharsetEncoder(this);
	}

	private static final class XTexOmlPlainCharsetDecoder extends TableCharsetDecoder {
		private XTexOmlPlainCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\u0393\u0394\u0398\u039B\u039E\u03A0\u03A3\u03A5\u03A6\u03A8\u03A9\u03B1\u03B2\u03B3\u03B4\u03B5\u03B6\u03B7\u03B8\u03B9\u03BA\u03BB\u03BC\u03BD\u03BE\u03C0\u03C1\u03C3\u03C4\u03C5\u03C6\u03C7\u03C8\u03C9\u03F5\u03D1\u03D6\u03F1\u03C2\u03D5\u21BC\u21BD\u21C0\u21C1\uF8FC\uF8FD\u25B7\u25C10123456789.,</>\u22C6\u2202".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x0 && input <= 0x40) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x5B: return 0x266DL;
			case 0x5C: return 0x266EL;
			case 0x5D: return 0x266FL;
			case 0x5E: return 0x25E1L;
			case 0x5F: return 0x25E0L;
			case 0x60: return 0x2113L;
			case 0x7B: return 0x131L;
			case 0x7C: return 0x237L;
			case 0x7D: return 0x2118L;
			case 0x7E: return 0x20D7L;
			case 0x7F: return 0x361L;
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

	private static final class XTexOmlPlainCharsetEncoder extends TableCharsetEncoder {
		private XTexOmlPlainCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{88}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD835: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0x391 && input <= 0x3D6) return CommonSubtables.COMMON1750[input - 0x391];
			switch (input) {
			case 0x2C: return 0x3BL;
			case 0x2E: return 0x3AL;
			case 0x2F: return 0x3DL;
			case 0x30: return 0x30L;
			case 0x31: return 0x31L;
			case 0x32: return 0x32L;
			case 0x33: return 0x33L;
			case 0x34: return 0x34L;
			case 0x35: return 0x35L;
			case 0x36: return 0x36L;
			case 0x37: return 0x37L;
			case 0x38: return 0x38L;
			case 0x39: return 0x39L;
			case 0x3C: return 0x3CL;
			case 0x3E: return 0x3EL;
			case 0x131: return 0x7BL;
			case 0x237: return 0x7CL;
			case 0x361: return 0x7FL;
			case 0x3F1: return 0x25L;
			case 0x3F5: return 0x22L;
			case 0x20D7: return 0x7EL;
			case 0x210E: return 0x68L;
			case 0x2113: return 0x60L;
			case 0x2118: return 0x7DL;
			case 0x21BC: return 0x28L;
			case 0x21BD: return 0x29L;
			case 0x21C0: return 0x2AL;
			case 0x21C1: return 0x2BL;
			case 0x2202: return 0x40L;
			case 0x22C6: return 0x3FL;
			case 0x25B7: return 0x2EL;
			case 0x25C1: return 0x2FL;
			case 0x25E0: return 0x5FL;
			case 0x25E1: return 0x5EL;
			case 0x266D: return 0x5BL;
			case 0x266E: return 0x5CL;
			case 0x266F: return 0x5DL;
			case 0xF8FC: return 0x2CL;
			case 0xF8FD: return 0x2DL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDC34 && input <= 0xDC4D) return input - 0xDC34 + 0x41;
			if (input >= 0xDC56 && input <= 0xDC67) return input - 0xDC56 + 0x69;
			if (input >= 0xDEE2 && input <= 0xDF1B) return CommonSubtables.COMMON1751[input - 0xDEE2];
			switch (input) {
			case 0xDC4E: return 0x61L;
			case 0xDC4F: return 0x62L;
			case 0xDC50: return 0x63L;
			case 0xDC51: return 0x64L;
			case 0xDC52: return 0x65L;
			case 0xDC53: return 0x66L;
			case 0xDC54: return 0x67L;
			case 0xDEA4: return 0x7BL;
			case 0xDEA5: return 0x7CL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			default: return 0;
			}
		}
	}
}
