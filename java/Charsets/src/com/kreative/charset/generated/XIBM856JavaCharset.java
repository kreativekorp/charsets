package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM856JavaCharset extends Charset {
	public XIBM856JavaCharset() {
		super("x-IBM856-java", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM856JavaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM856JavaCharsetEncoder(this);
	}

	private static final class XIBM856JavaCharsetDecoder extends TableCharsetDecoder {
		private XIBM856JavaCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_9C = getOutput0_9C();
		private static final char[] getOutput0_9C() {
			return "\u00A3\u0000\u00D7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00AE\u00AC\u00BD\u00BC\u0000\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\u0000\u0000\u0000\u00A9\u2563\u2551\u2557\u255D\u00A2\u00A5\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u0000\u0000\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u00A4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u2518\u250C\u2588\u2584\u00A6\u0000\u2580\u0000\u0000\u0000\u0000\u0000\u0000\u00B5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u203E\u00B4\u00AD\u00B1\u2017\u00BE\u00B6\u00A7\u00F7\u00B8\u00B0\u00A8\u2022\u00B9\u00B3\u00B2\u25A0\u00A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0x9A) return input - 0x80 + 0x5D0;
			if (input >= 0x9C && input <= 0xFF) return GETOUTPUT0_9C[input - 0x9C];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM856JavaCharsetEncoder extends TableCharsetEncoder {
		private XIBM856JavaCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xBE) return CommonSubtables.COMMON280[input - 0xA0];
			if (input >= 0x5D0 && input <= 0x5EA) return input - 0x5D0 + 0x80;
			switch (input) {
			case 0xD7: return 0x9EL;
			case 0xF7: return 0xF6L;
			case 0x2017: return 0xF2L;
			case 0x2022: return 0xFAL;
			case 0x203E: return 0xEEL;
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
			case 0x2550: return 0xCDL;
			case 0x2551: return 0xBAL;
			case 0x2554: return 0xC9L;
			case 0x2557: return 0xBBL;
			case 0x255A: return 0xC8L;
			case 0x255D: return 0xBCL;
			case 0x2560: return 0xCCL;
			case 0x2563: return 0xB9L;
			case 0x2566: return 0xCBL;
			case 0x2569: return 0xCAL;
			case 0x256C: return 0xCEL;
			case 0x2580: return 0xDFL;
			case 0x2584: return 0xDCL;
			case 0x2588: return 0xDBL;
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
