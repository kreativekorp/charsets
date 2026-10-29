package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM853Charset extends Charset {
	public XIBM853Charset() {
		super("x-IBM853", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM853CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM853CharsetEncoder(this);
	}

	private static final class XIBM853CharsetDecoder extends TableCharsetDecoder {
		private XIBM853CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C7\u00FC\u00E9\u00E2\u00E4\u00E0\u0109\u00E7\u00EA\u00EB\u00E8\u00EF\u00EE\u00EC\u00C4\u0108\u00C9\u010B\u010A\u00F4\u00F6\u00F2\u00FB\u00F9\u0130\u00D6\u00DC\u011D\u00A3\u011C\u00D7\u0135\u00E1\u00ED\u00F3\u00FA\u00F1\u00D1\u011E\u011F\u0124\u0125\u00AC\u00BD\u0134\u015F\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\u00C1\u00C2\u00C0\u015E\u2563\u2551\u2557\u255D\u017B\u017C\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u015C\u015D\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u00A4\u0000\u0000\u00CA\u00CB\u00C8\u0131\u00CD\u00CE\u00CF\u2518\u250C\u2588\u2584\u0000\u00CC\u2580\u00D3\u00DF\u00D4\u00D2\u0120\u0121\u00B5\u0126\u0127\u00DA\u00DB\u00D9\u016C\u016D\u00AF\u00B4\u00AD\u0000\u2113\u0149\u02D8\u00A7\u00F7\u00B8\u00B0\u00A8\u02D9\u0000\u00B3\u00B2\u25A0\u00A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFF) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM853CharsetEncoder extends TableCharsetEncoder {
		private XIBM853CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\uFF01\u0000\u0000\u009C\u00CF\u0000\u0000\u00F5\u00F9\u0000\u0000\u00AE\u00AA\u00F0\u0000\u00EE\u00F8\u0000\u00FD\u00FC\u00EF\u00E6\u0000\u0000\u00F7\u0000\u0000\u00AF\u0000\u00AB\u0000\u0000\u00B7\u00B5\u00B6\u0000\u008E\u0000\u0000\u0080\u00D4\u0090\u00D2\u00D3\u00DE\u00D6\u00D7\u00D8\u0000\u00A5\u00E3\u00E0\u00E2\u0000\u0099\u009E\u0000\u00EB\u00E9\u00EA\u009A\u0000\u0000\u00E1\u0085\u00A0\u0083\u0000\u0084\u0000\u0000\u0087\u008A\u0082\u0088\u0089\u008D\u00A1\u008C\u008B\u0000\u00A4\u0095\u00A2\u0093\u0000\u0094\u00F6\u0000\u0097\u00A3\u0096\u0081\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008F\u0086\u0092\u0091\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009D\u009B\u00A6\u00A7\u00E4\u00E5\u0000\u0000\u00A8\u00A9\u00E7\u00E8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0098\u00D5\u0000\u0000\u00AC\u009F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0x135) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x149: return 0xF3L;
			case 0x15C: return 0xC6L;
			case 0x15D: return 0xC7L;
			case 0x15E: return 0xB8L;
			case 0x15F: return 0xADL;
			case 0x16C: return 0xECL;
			case 0x16D: return 0xEDL;
			case 0x17B: return 0xBDL;
			case 0x17C: return 0xBEL;
			case 0x2D8: return 0xF4L;
			case 0x2D9: return 0xFAL;
			case 0x2113: return 0xF2L;
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
