package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacKeyboardCharset extends Charset {
	public XMacKeyboardCharset() {
		super("x-MacKeyboard", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacKeyboardCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacKeyboardCharsetEncoder(this);
	}

	private static final class XMacKeyboardCharsetDecoder extends TableCharsetDecoder {
		private XMacKeyboardCharsetDecoder(Charset cs) {
			super(cs, 1.61111f, 4f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u0000\u21E5\u21E4\u2324\u21E7\u2303\u2325\b\u2423\u2326\u21A9\u21AA\r\u0000\uF802\u21E3\u2318\u2713\u25C6\uF8FF\u0000\u0000\u232B\u21E0\u21E1\u21E2\u238B\u2327\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000123456789\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000F".toCharArray();
		}
		private static final long[] GETOUTPUT0_61 = getOutput0_61();
		private static final long[] getOutput0_61() {
			return new long[] {
				0x2423L, 0x21DEL, 0x21EAL, 0x2190L, 0x2192L, 0x2196L, 0x20DD003FL, 0x2191L, 0x2198L, 0x2193L, 0x21DFL, 0xF87FF8FFL, 0xF803L, 0x20DD2758L, 0x310046F860L, 0x320046F860L,
				0x330046F860L, 0x340046F860L, 0x350046F860L, 0x360046F860L, 0x370046F860L, 0x380046F860L, 0x390046F860L, 0x3000310046F861L, 0x3100310046F861L, 0x3200310046F861L, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0x3300310046F861L, 0x3400310046F861L, 0x3500310046F861L, 0x2388L, 0x2387L, 0x23CFL, 0x657082F1L, 0x306A304BL, 0x3600310046F861L,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x46) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x61 && input <= 0x8F) return GETOUTPUT0_61[input - 0x61];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMacKeyboardCharsetEncoder extends TableCharsetEncoder {
		private XMacKeyboardCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{32}, 4);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x3F: return 0x1;
			case 0x2758: return 0x2;
			case 0x304B: return 0x3;
			case 0x82F1: return 0x4;
			case 0xF860: return 0x5;
			case 0xF861: return 0x7;
			case 0xF8FF: return 0xA;
			}
			return 0;
		}
		private int getNextState5(int input) {
			switch (input) {
			case 0x46: return 0x6;
			}
			return 0;
		}
		private int getNextState7(int input) {
			switch (input) {
			case 0x46: return 0x8;
			}
			return 0;
		}
		private int getNextState8(int input) {
			switch (input) {
			case 0x31: return 0x9;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 5: return getNextState5(input);
			case 7: return getNextState7(input);
			case 8: return getNextState8(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			switch (input) {
			case 0x0: return 0x1L;
			case 0x8: return 0x8L;
			case 0xD: return 0xDL;
			case 0x20: return 0x20L;
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
			case 0x46: return 0x46L;
			case 0x2190: return 0x64L;
			case 0x2191: return 0x68L;
			case 0x2192: return 0x65L;
			case 0x2193: return 0x6AL;
			case 0x2196: return 0x66L;
			case 0x2198: return 0x69L;
			case 0x21A9: return 0xBL;
			case 0x21AA: return 0xCL;
			case 0x21DE: return 0x62L;
			case 0x21DF: return 0x6BL;
			case 0x21E0: return 0x18L;
			case 0x21E1: return 0x19L;
			case 0x21E2: return 0x1AL;
			case 0x21E3: return 0x10L;
			case 0x21E4: return 0x301L;
			case 0x21E5: return 0x201L;
			case 0x21E7: return 0x501L;
			case 0x21EA: return 0x63L;
			case 0x2303: return 0x601L;
			case 0x2318: return 0x11L;
			case 0x2324: return 0x401L;
			case 0x2325: return 0x701L;
			case 0x2326: return 0xAL;
			case 0x2327: return 0x1CL;
			case 0x232B: return 0x17L;
			case 0x2387: return 0x8BL;
			case 0x2388: return 0x8AL;
			case 0x238B: return 0x1BL;
			case 0x23CF: return 0x8CL;
			case 0x2423: return 0x61L;
			case 0x25C6: return 0x13L;
			case 0x2713: return 0x12L;
			case 0xF802: return 0xFL;
			case 0xF803: return 0x6DL;
			case 0xF8FF: return 0x14L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x20DD: return 0x67L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x20DD: return 0x6EL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0x306A: return 0x8EL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x6570: return 0x8DL;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0x31: return 0x6FL;
			case 0x32: return 0x70L;
			case 0x33: return 0x71L;
			case 0x34: return 0x72L;
			case 0x35: return 0x73L;
			case 0x36: return 0x74L;
			case 0x37: return 0x75L;
			case 0x38: return 0x76L;
			case 0x39: return 0x77L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0x30: return 0x78L;
			case 0x31: return 0x79L;
			case 0x32: return 0x7AL;
			case 0x33: return 0x87L;
			case 0x34: return 0x88L;
			case 0x35: return 0x89L;
			case 0x36: return 0x8FL;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0xF87F: return 0x6CL;
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
			case 6: return getOutput6(input);
			case 9: return getOutput9(input);
			case 10: return getOutput10(input);
			default: return 0;
			}
		}
	}
}
