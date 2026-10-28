package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM857Charset extends Charset {
	public XIBM857Charset() {
		super("x-IBM857", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM857CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM857CharsetEncoder(this);
	}

	private static final class XIBM857CharsetDecoder extends TableCharsetDecoder {
		private XIBM857CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C7\u00FC\u00E9\u00E2\u00E4\u00E0\u00E5\u00E7\u00EA\u00EB\u00E8\u00EF\u00EE\u0131\u00C4\u00C5\u00C9\u00E6\u00C6\u00F4\u00F6\u00F2\u00FB\u00F9\u0130\u00D6\u00DC\u00F8\u00A3\u00D8\u015E\u015F\u00E1\u00ED\u00F3\u00FA\u00F1\u00D1\u011E\u011F\u00BF\u00AE\u00AC\u00BD\u00BC\u00A1\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\u00C1\u00C2\u00C0\u00A9\u2563\u2551\u2557\u255D\u00A2\u00A5\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u00E3\u00C3\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u00A4\u00BA\u00AA\u00CA\u00CB\u00C8\u0000\u00CD\u00CE\u00CF\u2518\u250C\u2588\u2584\u00A6\u00CC\u2580\u00D3\u00DF\u00D4\u00D2\u00F5\u00D5\u00B5\u0000\u00D7\u00DA\u00DB\u00D9\u00EC\u00FF\u00AF\u00B4\u00AD\u00B1\u0000\u00BE\u00B6\u00A7\u00F7\u00B8\u00B0\u00A8\u00B7\u00B9\u00B3\u00B2\u25A0\u00A0".toCharArray();
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

	private static final class XIBM857CharsetEncoder extends TableCharsetEncoder {
		private XIBM857CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\uFF01\u00AD\u00BD\u009C\u00CF\u00BE\u00DD\u00F5\u00F9\u00B8\u00D1\u00AE\u00AA\u00F0\u00A9\u00EE\u00F8\u00F1\u00FD\u00FC\u00EF\u00E6\u00F4\u00FA\u00F7\u00FB\u00D0\u00AF\u00AC\u00AB\u00F3\u00A8\u00B7\u00B5\u00B6\u00C7\u008E\u008F\u0092\u0080\u00D4\u0090\u00D2\u00D3\u00DE\u00D6\u00D7\u00D8\u0000\u00A5\u00E3\u00E0\u00E2\u00E5\u0099\u00E8\u009D\u00EB\u00E9\u00EA\u009A\u0000\u0000\u00E1\u0085\u00A0\u0083\u00C6\u0084\u0086\u0091\u0087\u008A\u0082\u0088\u0089\u00EC\u00A1\u008C\u008B\u0000\u00A4\u0095\u00A2\u0093\u00E4\u0094\u00F6\u009B\u0097\u00A3\u0096\u0081\u0000\u0000\u00ED".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x11E: return 0xA6L;
			case 0x11F: return 0xA7L;
			case 0x130: return 0x98L;
			case 0x131: return 0x8DL;
			case 0x15E: return 0x9EL;
			case 0x15F: return 0x9FL;
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
