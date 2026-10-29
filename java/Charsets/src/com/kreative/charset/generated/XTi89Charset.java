package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTi89Charset extends Charset {
	public XTi89Charset() {
		super("x-ti89", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTi89CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTi89CharsetEncoder(this);
	}

	private static final class XTi89CharsetDecoder extends TableCharsetDecoder {
		private XTi89CharsetDecoder(Charset cs) {
			super(cs, 1.02344f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_0 = getOutput0_0();
		private static final long[] getOutput0_0() {
			return new long[] {
				0xFFFEL, 0x1L, 0x2L, 0x3L, 0x4L, 0x5L, 0x6L, 0x7L, 0x8L, 0x9L, 0xAL, 0xBL, 0xCL, 0xDL, 0xFE0EDD12D83DL, 0x2713L,
				0x25A0L, 0x25C2L, 0x25B8L, 0x25B4L, 0x25BEL, 0x2190L, 0x2192L, 0x2191L, 0x2193L, 0x25C0L, 0x25B6L, 0x21E7L, 0x222AL, 0x2229L, 0x2282L, 0x2208L,
			};
		}
		private static final long[] GETOUTPUT0_7F = getOutput0_7F();
		private static final long[] getOutput0_7F() {
			return new long[] {
				0x25C6L, 0x3B1L, 0x3B2L, 0x393L, 0x3B3L, 0x394L, 0x3B4L, 0x3B5L, 0x3B6L, 0x3B8L, 0x3BBL, 0x3BEL, 0x3A0L, 0x3C0L, 0x3C1L, 0x3A3L,
				0x3C3L, 0x3C4L, 0x3C6L, 0x3C8L, 0x3A9L, 0x3C9L, 0x1D07L, 0x212FL, 0xDC22D835L, 0x2B3L, 0x22BAL, 0x3040078L, 0x233L, 0x2264L, 0x2260L, 0x2265L,
				0x2220L, 0x2026L, 0xA1L, 0xA2L, 0xA3L, 0xA4L, 0xA5L, 0xA6L, 0xA7L, 0x221AL, 0xA9L, 0xAAL, 0xABL, 0xACL, 0x207BL, 0xAEL,
				0xAFL, 0xB0L, 0xB1L, 0xB2L, 0xB3L, 0xB9200D207BL, 0xB5L, 0xB6L, 0xB7L, 0x207AL, 0xB9L, 0xBAL, 0xBBL, 0x2202L, 0x222BL, 0x221EL,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0xBF && input <= 0xFF) return input - 0xBF + 0xBF;
			if (input >= 0x7F && input <= 0xBE) return GETOUTPUT0_7F[input - 0x7F];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XTi89CharsetEncoder extends TableCharsetEncoder {
		private XTi89CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x78: return 0x1;
			case 0x79: return 0x2;
			case 0x207B: return 0x6;
			case 0xD835: return 0x3;
			case 0xD83D: return 0x4;
			case 0xDBBC: return 0x8;
			}
			return 0;
		}
		private int getNextState4(int input) {
			switch (input) {
			case 0xDD12: return 0x5;
			}
			return 0;
		}
		private int getNextState6(int input) {
			switch (input) {
			case 0x200D: return 0x7;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 4: return getNextState4(input);
			case 6: return getNextState6(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00A1\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u0000\u00A9\u00AA\u00AB\u00AC\u0000\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u0000\u00B5\u00B6\u00B7\u0000\u00B9\u00BA\u00BB".toCharArray();
		}
		private static final char[] GETOUTPUT0_393 = getOutput0_393();
		private static final char[] getOutput0_393() {
			return "\u0082\u0084\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008B\u0000\u0000\u008E\u0000\u0000\u0000\u0000\u0000\u0093\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0080\u0081\u0083\u0085\u0086\u0087\u0000\u0088\u0000\u0000\u0089\u00B5\u0000\u008A\u0000\u008C\u008D\u0000\u008F\u0090\u0000\u0091\u0000\u0092\u0094".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xBF && input <= 0xFE) return input - 0xBF + 0xBF;
			if (input >= 0xA1 && input <= 0xBB) return GETOUTPUT0_A1[input - 0xA1];
			if (input >= 0x393 && input <= 0x3C9) return GETOUTPUT0_393[input - 0x393];
			switch (input) {
			case 0x0: return 0x1L;
			case 0x1: return 0x101L;
			case 0x2: return 0x201L;
			case 0x3: return 0x301L;
			case 0x4: return 0x401L;
			case 0x5: return 0x501L;
			case 0x6: return 0x601L;
			case 0x7: return 0x701L;
			case 0x8: return 0x8L;
			case 0x9: return 0x9L;
			case 0xA: return 0xAL;
			case 0xB: return 0xBL;
			case 0xC: return 0xCL;
			case 0xD: return 0xDL;
			case 0xFF: return 0xFF01L;
			case 0x233: return 0x9BL;
			case 0x2B3: return 0x98L;
			case 0x1D07: return 0x95L;
			case 0x1D40: return 0x99L;
			case 0x2026: return 0xA0L;
			case 0x207A: return 0xB8L;
			case 0x207B: return 0xADL;
			case 0x212F: return 0x96L;
			case 0x2139: return 0x97L;
			case 0x2190: return 0x15L;
			case 0x2191: return 0x17L;
			case 0x2192: return 0x16L;
			case 0x2193: return 0x18L;
			case 0x21E7: return 0x1BL;
			case 0x2202: return 0xBCL;
			case 0x2208: return 0x1FL;
			case 0x220E: return 0x10L;
			case 0x220F: return 0x8BL;
			case 0x2211: return 0x8EL;
			case 0x221A: return 0xA8L;
			case 0x221E: return 0xBEL;
			case 0x2220: return 0x9FL;
			case 0x2229: return 0x1DL;
			case 0x222A: return 0x1CL;
			case 0x222B: return 0xBDL;
			case 0x2260: return 0x9DL;
			case 0x2264: return 0x9CL;
			case 0x2265: return 0x9EL;
			case 0x2282: return 0x1EL;
			case 0x22BA: return 0x99L;
			case 0x25A0: return 0x10L;
			case 0x25B4: return 0x13L;
			case 0x25B6: return 0x1AL;
			case 0x25B8: return 0x12L;
			case 0x25BE: return 0x14L;
			case 0x25C0: return 0x19L;
			case 0x25C2: return 0x11L;
			case 0x25C6: return 0x7FL;
			case 0x2713: return 0xFL;
			case 0x2B06: return 0x1BL;
			case 0xE0F6: return 0xEL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x304: return 0x9AL;
			case 0x305: return 0x9AL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x304: return 0x9BL;
			case 0x305: return 0x9BL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xDC22: return 0x97L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xDD12: return 0xEL;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xFE0E: return 0xEL;
			case 0xFE0F: return 0xEL;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0xB9: return 0xB4L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0xDD17: return 0xB4L;
			case 0xDD25: return 0x9AL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 3: return getOutput3(input);
			case 4: return getOutput4(input);
			case 5: return getOutput5(input);
			case 7: return getOutput7(input);
			case 8: return getOutput8(input);
			default: return 0;
			}
		}
	}
}
