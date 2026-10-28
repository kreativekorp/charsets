package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM737Charset extends Charset {
	public XIBM737Charset() {
		super("x-IBM737", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM737CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM737CharsetEncoder(this);
	}

	private static final class XIBM737CharsetDecoder extends TableCharsetDecoder {
		private XIBM737CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A9 = getOutput0_A9();
		private static final char[] getOutput0_A9() {
			return "\u03C3\u03C2\u03C4\u03C5\u03C6\u03C7\u03C8\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255D\u255C\u255B\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u255E\u255F\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256B\u256A\u2518\u250C\u2588\u2584\u258C\u2590\u2580\u03C9\u03AC\u03AD\u03AE\u03CA\u03AF\u03CC\u03CD\u03CB\u03CE\u0386\u0388\u0389\u038A\u038C\u038E\u038F\u00B1\u2265\u2264\u03AA\u03AB\u00F7\u2248\u00B0\u2219\u00B7\u221A\u207F\u00B2\u25A0\u00A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0x90) return input - 0x80 + 0x391;
			if (input >= 0x98 && input <= 0xA8) return input - 0x98 + 0x3B1;
			if (input >= 0xA9 && input <= 0xFF) return GETOUTPUT0_A9[input - 0xA9];
			switch (input) {
			case 0x91: return 0x3A3L;
			case 0x92: return 0x3A4L;
			case 0x93: return 0x3A5L;
			case 0x94: return 0x3A6L;
			case 0x95: return 0x3A7L;
			case 0x96: return 0x3A8L;
			case 0x97: return 0x3A9L;
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

	private static final class XIBM737CharsetEncoder extends TableCharsetEncoder {
		private XIBM737CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x391 && input <= 0x3A1) return input - 0x391 + 0x80;
			if (input >= 0x3B1 && input <= 0x3C1) return input - 0x3B1 + 0x98;
			if (input >= 0x2550 && input <= 0x256C) return CommonSubtables.COMMON263[input - 0x2550];
			switch (input) {
			case 0xA0: return 0xFF01L;
			case 0xB0: return 0xF8L;
			case 0xB1: return 0xF1L;
			case 0xB2: return 0xFDL;
			case 0xB7: return 0xFAL;
			case 0xF7: return 0xF6L;
			case 0x386: return 0xEAL;
			case 0x388: return 0xEBL;
			case 0x389: return 0xECL;
			case 0x38A: return 0xEDL;
			case 0x38C: return 0xEEL;
			case 0x38E: return 0xEFL;
			case 0x38F: return 0xF0L;
			case 0x3A3: return 0x91L;
			case 0x3A4: return 0x92L;
			case 0x3A5: return 0x93L;
			case 0x3A6: return 0x94L;
			case 0x3A7: return 0x95L;
			case 0x3A8: return 0x96L;
			case 0x3A9: return 0x97L;
			case 0x3AA: return 0xF4L;
			case 0x3AB: return 0xF5L;
			case 0x3AC: return 0xE1L;
			case 0x3AD: return 0xE2L;
			case 0x3AE: return 0xE3L;
			case 0x3AF: return 0xE5L;
			case 0x3C2: return 0xAAL;
			case 0x3C3: return 0xA9L;
			case 0x3C4: return 0xABL;
			case 0x3C5: return 0xACL;
			case 0x3C6: return 0xADL;
			case 0x3C7: return 0xAEL;
			case 0x3C8: return 0xAFL;
			case 0x3C9: return 0xE0L;
			case 0x3CA: return 0xE4L;
			case 0x3CB: return 0xE8L;
			case 0x3CC: return 0xE6L;
			case 0x3CD: return 0xE7L;
			case 0x3CE: return 0xE9L;
			case 0x207F: return 0xFCL;
			case 0x2219: return 0xF9L;
			case 0x221A: return 0xFBL;
			case 0x2248: return 0xF7L;
			case 0x2264: return 0xF3L;
			case 0x2265: return 0xF2L;
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
