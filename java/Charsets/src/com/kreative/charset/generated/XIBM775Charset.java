package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM775Charset extends Charset {
	public XIBM775Charset() {
		super("x-IBM775", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM775CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM775CharsetEncoder(this);
	}

	private static final class XIBM775CharsetDecoder extends TableCharsetDecoder {
		private XIBM775CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u0106\u00FC\u00E9\u0101\u00E4\u0123\u00E5\u0107\u0142\u0113\u0156\u0157\u012B\u0179\u00C4\u00C5\u00C9\u00E6\u00C6\u014D\u00F6\u0122\u00A2\u015A\u015B\u00D6\u00DC\u00F8\u00A3\u00D8\u00D7\u00A4\u0100\u012A\u00F3\u017B\u017C\u017A\u201D\u00A6\u00A9\u00AE\u00AC\u00BD\u00BC\u0141\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\u0104\u010C\u0118\u0116\u2563\u2551\u2557\u255D\u012E\u0160\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u0172\u016A\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u017D\u0105\u010D\u0119\u0117\u012F\u0161\u0173\u016B\u017E\u2518\u250C\u2588\u2584\u258C\u2590\u2580\u00D3\u00DF\u014C\u0143\u00F5\u00D5\u00B5\u0144\u0136\u0137\u013B\u013C\u0146\u0112\u0145\u2019\u00AD\u00B1\u201C\u00BE\u00B6\u00A7\u00F7\u201E\u00B0\u2219\u00B7\u00B9\u00B3\u00B2\u25A0\u00A0".toCharArray();
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

	private static final class XIBM775CharsetEncoder extends TableCharsetEncoder {
		private XIBM775CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\uFF01\u0000\u0096\u009C\u009F\u0000\u00A7\u00F5\u0000\u00A8\u0000\u00AE\u00AA\u00F0\u00A9\u0000\u00F8\u00F1\u00FD\u00FC\u0000\u00E6\u00F4\u00FA\u0000\u00FB\u0000\u00AF\u00AC\u00AB\u00F3\u0000\u0000\u0000\u0000\u0000\u008E\u008F\u0092\u0000\u0000\u0090\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00E0\u0000\u00E5\u0099\u009E\u009D\u0000\u0000\u0000\u009A\u0000\u0000\u00E1\u0000\u0000\u0000\u0000\u0084\u0086\u0091\u0000\u0000\u0082\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A2\u0000\u00E4\u0094\u00F6\u009B\u0000\u0000\u0000\u0081\u0000\u0000\u0000\u00A0\u0083\u0000\u0000\u00B5\u00D0\u0080\u0087\u0000\u0000\u0000\u0000\u00B6\u00D1\u0000\u0000\u0000\u0000\u00ED\u0089\u0000\u0000\u00B8\u00D3\u00B7\u00D2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0095\u0085\u0000\u0000\u0000\u0000\u0000\u0000\u00A1\u008C\u0000\u0000\u00BD\u00D4\u0000\u0000\u0000\u0000\u0000\u0000\u00E8\u00E9\u0000\u0000\u0000\u00EA\u00EB\u0000\u0000\u0000\u0000\u00AD\u0088\u00E3\u00E7\u00EE\u00EC\u0000\u0000\u0000\u0000\u0000\u00E2\u0093\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008A\u008B\u0000\u0000\u0097\u0098\u0000\u0000\u0000\u0000\u00BE\u00D5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C7\u00D7\u0000\u0000\u0000\u0000\u0000\u0000\u00C6\u00D6\u0000\u0000\u0000\u0000\u0000\u008D\u00A5\u00A3\u00A4\u00CF\u00D8".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0x17E) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x2019: return 0xEFL;
			case 0x201C: return 0xF2L;
			case 0x201D: return 0xA6L;
			case 0x201E: return 0xF7L;
			case 0x2219: return 0xF9L;
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
