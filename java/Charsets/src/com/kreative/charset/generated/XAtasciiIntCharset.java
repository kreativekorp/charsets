package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAtasciiIntCharset extends Charset {
	public XAtasciiIntCharset() {
		super("x-atascii-int", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAtasciiIntCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAtasciiIntCharsetEncoder(this);
	}

	private static final class XAtasciiIntCharsetDecoder extends TableCharsetDecoder {
		private XAtasciiIntCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\u00E1\u00F9\u00D1\u00C9\u00E7\u00F4\u00F2\u00EC\u00A3\u00EF\u00FC\u00E4\u00D6\u00FA\u00F3\u00F6\u00DC\u00E2\u00FB\u00EE\u00E9\u00E8\u00F1\u00EA\u00E5\u00E0\u00C5".toCharArray();
		}
		private static final char[] GETOUTPUT0_7B = getOutput0_7B();
		private static final char[] getOutput0_7B() {
			return "\u00C4|\f\b\t\u00E1\u00F9\u00D1\u00C9\u00E7\u00F4\u00F2\u00EC\u00A3\u00EF\u00FC\u00E4\u00D6\u00FA\u00F3\u00F6\u00DC\u00E2\u00FB\u00EE\u00E9\u00E8\u00F1\u00EA\u00E5\u00E0\u00C5\n\u009C\u009D\u009E\u009F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x1B && input <= 0x5F) return input - 0x1B + 0x1B;
			if (input >= 0x0 && input <= 0x1A) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0xA0 && input <= 0xDF) return input - 0xA0 + 0x20;
			if (input >= 0x7B && input <= 0x9F) return GETOUTPUT0_7B[input - 0x7B];
			if (input >= 0xE1 && input <= 0xFA) return input - 0xE1 + 0x61;
			switch (input) {
			case 0x60: return 0xA1L;
			case 0xE0: return 0xA1L;
			case 0xFB: return 0xC4L;
			case 0xFC: return 0x7CL;
			case 0xFD: return 0x7L;
			case 0xFE: return 0x88L;
			case 0xFF: return 0x89L;
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

	private static final class XAtasciiIntCharsetEncoder extends TableCharsetEncoder {
		private XAtasciiIntCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83E: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_C4 = getOutput0_C4();
		private static final char[] getOutput0_C4() {
			return "{\u001A\u0000\u0000\u0000\u0301\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0201\u0000\u0000\u0000\u0000\f\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0019\u0001\u0011\u0000\u000B\u0018\u0000\u0401\u0015\u0014\u0017\u0000\u0701\u0000\u0013\t\u0000\u0016\u0601\u000E\u0501\u0000\u000F\u0000\u0000\u0101\r\u0012\n".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x1B && input <= 0x5F) return input - 0x1B + 0x1B;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0xC4 && input <= 0xFC) return GETOUTPUT0_C4[input - 0xC4];
			switch (input) {
			case 0x7: return 0xFDL;
			case 0x8: return 0x7EL;
			case 0x9: return 0x7FL;
			case 0xA: return 0x9BL;
			case 0xB: return 0x7DL;
			case 0xC: return 0x7DL;
			case 0xD: return 0x9BL;
			case 0x7C: return 0x7CL;
			case 0x85: return 0x9BL;
			case 0x87: return 0xFDL;
			case 0x88: return 0xFEL;
			case 0x89: return 0xFF01L;
			case 0x9B: return 0x9BL;
			case 0x9C: return 0x9CL;
			case 0x9D: return 0x9DL;
			case 0x9E: return 0x9EL;
			case 0x9F: return 0x9FL;
			case 0xA1: return 0x60L;
			case 0xA3: return 0x8L;
			case 0x2190: return 0x1EL;
			case 0x2191: return 0x1CL;
			case 0x2192: return 0x1FL;
			case 0x2193: return 0x1DL;
			case 0x241B: return 0x1BL;
			case 0x25B6: return 0x7FL;
			case 0x25C0: return 0x7EL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDCB0: return 0x7DL;
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
