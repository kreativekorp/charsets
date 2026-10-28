package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM866Charset extends Charset {
	public XIBM866Charset() {
		super("x-IBM866", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM866CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM866CharsetEncoder(this);
	}

	private static final class XIBM866CharsetDecoder extends TableCharsetDecoder {
		private XIBM866CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_B0 = getOutput0_B0();
		private static final char[] getOutput0_B0() {
			return "\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255D\u255C\u255B\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u255E\u255F\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256B\u256A\u2518\u250C\u2588\u2584\u258C\u2590\u2580\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0401\u0451\u0404\u0454\u0407\u0457\u040E\u045E\u00B0\u2219\u00B7\u221A\u2116\u00A4\u25A0\u00A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xAF) return input - 0x80 + 0x410;
			if (input >= 0xE0 && input <= 0xEF) return input - 0xE0 + 0x440;
			if (input >= 0xB0 && input <= 0xFF) return GETOUTPUT0_B0[input - 0xB0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM866CharsetEncoder extends TableCharsetEncoder {
		private XIBM866CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x410 && input <= 0x43F) return input - 0x410 + 0x80;
			if (input >= 0x440 && input <= 0x44F) return input - 0x440 + 0xE0;
			if (input >= 0x2550 && input <= 0x256C) return CommonSubtables.COMMON263[input - 0x2550];
			switch (input) {
			case 0xA0: return 0xFF01L;
			case 0xA4: return 0xFDL;
			case 0xB0: return 0xF8L;
			case 0xB7: return 0xFAL;
			case 0x401: return 0xF0L;
			case 0x404: return 0xF2L;
			case 0x407: return 0xF4L;
			case 0x40E: return 0xF6L;
			case 0x451: return 0xF1L;
			case 0x454: return 0xF3L;
			case 0x457: return 0xF5L;
			case 0x45E: return 0xF7L;
			case 0x2116: return 0xFCL;
			case 0x2219: return 0xF9L;
			case 0x221A: return 0xFBL;
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
