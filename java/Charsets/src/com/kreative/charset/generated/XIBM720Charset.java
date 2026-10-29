package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM720Charset extends Charset {
	public XIBM720Charset() {
		super("x-IBM720", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM720CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM720CharsetEncoder(this);
	}

	private static final class XIBM720CharsetDecoder extends TableCharsetDecoder {
		private XIBM720CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_82 = getOutput0_82();
		private static final char[] getOutput0_82() {
			return "\u00E9\u00E2\u0000\u00E0\u0000\u00E7\u00EA\u00EB\u00E8\u00EF\u00EE\u0000\u0000\u0000\u0000\u0651\u0652\u00F4\u00A4\u0640\u00FB\u00F9\u0621\u0622\u0623\u0624\u00A3".toCharArray();
		}
		private static final char[] GETOUTPUT0_AE = getOutput0_AE();
		private static final char[] getOutput0_AE() {
			return "\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255D\u255C\u255B\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u255E\u255F\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256B\u256A\u2518\u250C\u2588\u2584\u258C\u2590\u2580\u0636\u0637\u0638\u0639\u063A\u0641\u00B5\u0642\u0643\u0644\u0645\u0646\u0647\u0648\u0649\u064A\u2261\u064B\u064C\u064D\u064E\u064F\u0650\u2248\u00B0\u2219\u00B7\u221A\u207F\u00B2\u25A0\u00A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x9D && input <= 0xAD) return input - 0x9D + 0x625;
			if (input >= 0x82 && input <= 0x9C) return GETOUTPUT0_82[input - 0x82];
			if (input >= 0xAE && input <= 0xFF) return GETOUTPUT0_AE[input - 0xAE];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM720CharsetEncoder extends TableCharsetEncoder {
		private XIBM720CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_636 = getOutput0_636();
		private static final char[] getOutput0_636() {
			return "\u00E0\u00E1\u00E2\u00E3\u00E4\u0000\u0000\u0000\u0000\u0000\u0095\u00E5\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u0091\u0092".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x625 && input <= 0x635) return input - 0x625 + 0x9D;
			if (input >= 0x636 && input <= 0x652) return GETOUTPUT0_636[input - 0x636];
			if (input >= 0x2550 && input <= 0x256C) return CommonSubtables.COMMON266[input - 0x2550];
			switch (input) {
			case 0xA0: return 0xFF01L;
			case 0xA3: return 0x9CL;
			case 0xA4: return 0x94L;
			case 0xAB: return 0xAEL;
			case 0xB0: return 0xF8L;
			case 0xB2: return 0xFDL;
			case 0xB5: return 0xE6L;
			case 0xB7: return 0xFAL;
			case 0xBB: return 0xAFL;
			case 0xE0: return 0x85L;
			case 0xE2: return 0x83L;
			case 0xE7: return 0x87L;
			case 0xE8: return 0x8AL;
			case 0xE9: return 0x82L;
			case 0xEA: return 0x88L;
			case 0xEB: return 0x89L;
			case 0xEE: return 0x8CL;
			case 0xEF: return 0x8BL;
			case 0xF4: return 0x93L;
			case 0xF9: return 0x97L;
			case 0xFB: return 0x96L;
			case 0x621: return 0x98L;
			case 0x622: return 0x99L;
			case 0x623: return 0x9AL;
			case 0x624: return 0x9BL;
			case 0x207F: return 0xFCL;
			case 0x2219: return 0xF9L;
			case 0x221A: return 0xFBL;
			case 0x2248: return 0xF7L;
			case 0x2261: return 0xF0L;
			case 0x2500: return 0xC4L;
			case 0x2502: return 0xB3L;
			case 0x250C: return 0xDAL;
			case 0x2510: return 0xBFL;
			case 0x2514: return 0xC0L;
			case 0x2518: return 0xD9L;
			case 0x251C: return 0xC3L;
			case 0x2524: return 0xB4L;
			case 0x252C: return 0xC2L;
			case 0x2534: return 0xC1L;
			case 0x253C: return 0xC5L;
			case 0x2580: return 0xDFL;
			case 0x2584: return 0xDCL;
			case 0x2588: return 0xDBL;
			case 0x258C: return 0xDDL;
			case 0x2590: return 0xDEL;
			case 0x2591: return 0xB0L;
			case 0x2592: return 0xB1L;
			case 0x2593: return 0xB2L;
			case 0x25A0: return 0xFEL;
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
