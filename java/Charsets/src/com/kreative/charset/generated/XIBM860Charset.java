package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM860Charset extends Charset {
	public XIBM860Charset() {
		super("x-IBM860", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM860CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM860CharsetEncoder(this);
	}

	private static final class XIBM860CharsetDecoder extends TableCharsetDecoder {
		private XIBM860CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C7\u00FC\u00E9\u00E2\u00E3\u00E0\u00C1\u00E7\u00EA\u00CA\u00E8\u00CD\u00D4\u00EC\u00C3\u00C2\u00C9\u00C0\u00C8\u00F4\u00F5\u00F2\u00DA\u00F9\u00CC\u00D5\u00DC\u00A2\u00A3\u00D9\u20A7\u00D3\u00E1\u00ED\u00F3\u00FA\u00F1\u00D1\u00AA\u00BA\u00BF\u00D2\u00AC\u00BD\u00BC\u00A1\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255D\u255C\u255B\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u255E\u255F\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256B\u256A\u2518\u250C\u2588\u2584\u258C\u2590\u2580\u03B1\u00DF\u0393\u03C0\u03A3\u03C3\u00B5\u03C4\u03A6\u0398\u03A9\u03B4\u221E\u03C6\u03B5\u2229\u2261\u00B1\u2265\u2264\u2320\u2321\u00F7\u2248\u00B0\u2219\u00B7\u221A\u207F\u00B2\u25A0\u00A0".toCharArray();
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

	private static final class XIBM860CharsetEncoder extends TableCharsetEncoder {
		private XIBM860CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\uFF01\u00AD\u009B\u009C\u0000\u0000\u0000\u0000\u0000\u0000\u00A6\u00AE\u00AA\u0000\u0000\u0000\u00F8\u00F1\u00FD\u0000\u0000\u00E6\u0000\u00FA\u0000\u0000\u00A7\u00AF\u00AC\u00AB\u0000\u00A8\u0091\u0086\u008F\u008E\u0000\u0000\u0000\u0080\u0092\u0090\u0089\u0000\u0098\u008B\u0000\u0000\u0000\u00A5\u00A9\u009F\u008C\u0099\u0000\u0000\u0000\u009D\u0096\u0000\u009A\u0000\u0000\u00E1\u0085\u00A0\u0083\u0084\u0000\u0000\u0000\u0087\u008A\u0082\u0088\u0000\u008D\u00A1\u0000\u0000\u0000\u00A4\u0095\u00A2\u0093\u0094\u0000\u00F6\u0000\u0097\u00A3\u0000\u0081".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFC) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x2550 && input <= 0x256C) return CommonSubtables.COMMON263[input - 0x2550];
			switch (input) {
			case 0x393: return 0xE2L;
			case 0x398: return 0xE9L;
			case 0x3A3: return 0xE4L;
			case 0x3A6: return 0xE8L;
			case 0x3A9: return 0xEAL;
			case 0x3B1: return 0xE0L;
			case 0x3B4: return 0xEBL;
			case 0x3B5: return 0xEEL;
			case 0x3C0: return 0xE3L;
			case 0x3C3: return 0xE5L;
			case 0x3C4: return 0xE7L;
			case 0x3C6: return 0xEDL;
			case 0x207F: return 0xFCL;
			case 0x20A7: return 0x9EL;
			case 0x2219: return 0xF9L;
			case 0x221A: return 0xFBL;
			case 0x221E: return 0xECL;
			case 0x2229: return 0xEFL;
			case 0x2248: return 0xF7L;
			case 0x2261: return 0xF0L;
			case 0x2264: return 0xF3L;
			case 0x2265: return 0xF2L;
			case 0x2320: return 0xF4L;
			case 0x2321: return 0xF5L;
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
