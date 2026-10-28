package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM852Charset extends Charset {
	public XIBM852Charset() {
		super("x-IBM852", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM852CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM852CharsetEncoder(this);
	}

	private static final class XIBM852CharsetDecoder extends TableCharsetDecoder {
		private XIBM852CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C7\u00FC\u00E9\u00E2\u00E4\u016F\u0107\u00E7\u0142\u00EB\u0150\u0151\u00EE\u0179\u00C4\u0106\u00C9\u0139\u013A\u00F4\u00F6\u013D\u013E\u015A\u015B\u00D6\u00DC\u0164\u0165\u0141\u00D7\u010D\u00E1\u00ED\u00F3\u00FA\u0104\u0105\u017D\u017E\u0118\u0119\u00AC\u017A\u010C\u015F\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\u00C1\u00C2\u011A\u015E\u2563\u2551\u2557\u255D\u017B\u017C\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u0102\u0103\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u00A4\u0111\u0110\u010E\u00CB\u010F\u0147\u00CD\u00CE\u011B\u2518\u250C\u2588\u2584\u0162\u016E\u2580\u00D3\u00DF\u00D4\u0143\u0144\u0148\u0160\u0161\u0154\u00DA\u0155\u0170\u00FD\u00DD\u0163\u00B4\u00AD\u02DD\u02DB\u02C7\u02D8\u00A7\u00F7\u00B8\u00B0\u00A8\u02D9\u0171\u0158\u0159\u25A0\u00A0".toCharArray();
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

	private static final class XIBM852CharsetEncoder extends TableCharsetEncoder {
		private XIBM852CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\uFF01\u0000\u0000\u0000\u00CF\u0000\u0000\u00F5\u00F9\u0000\u0000\u00AE\u00AA\u00F0\u0000\u0000\u00F8\u0000\u0000\u0000\u00EF\u0000\u0000\u0000\u00F7\u0000\u0000\u00AF\u0000\u0000\u0000\u0000\u0000\u00B5\u00B6\u0000\u008E\u0000\u0000\u0080\u0000\u0090\u0000\u00D3\u0000\u00D6\u00D7\u0000\u0000\u0000\u0000\u00E0\u00E2\u0000\u0099\u009E\u0000\u0000\u00E9\u0000\u009A\u00ED\u0000\u00E1\u0000\u00A0\u0083\u0000\u0084\u0000\u0000\u0087\u0000\u0082\u0000\u0089\u0000\u00A1\u008C\u0000\u0000\u0000\u0000\u00A2\u0093\u0000\u0094\u00F6\u0000\u0000\u00A3\u0000\u0081\u00EC\u0000\u0000\u0000\u0000\u00C6\u00C7\u00A4\u00A5\u008F\u0086\u0000\u0000\u0000\u0000\u00AC\u009F\u00D2\u00D4\u00D1\u00D0\u0000\u0000\u0000\u0000\u0000\u0000\u00A8\u00A9\u00B7\u00D8".toCharArray();
		}
		private static final char[] GETOUTPUT0_139 = getOutput0_139();
		private static final char[] getOutput0_139() {
			return "\u0091\u0092\u0000\u0000\u0095\u0096\u0000\u0000\u009D\u0088\u00E3\u00E4\u0000\u0000\u00D5\u00E5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008A\u008B\u0000\u0000\u00E8\u00EA\u0000\u0000\u00FC\u00FD\u0097\u0098\u0000\u0000\u00B8\u00AD\u00E6\u00E7\u00DD\u00EE\u009B\u009C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00DE\u0085\u00EB\u00FB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008D\u00AB\u00BD\u00BE\u00A6\u00A7".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0x11B) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x139 && input <= 0x17E) return GETOUTPUT0_139[input - 0x139];
			switch (input) {
			case 0x2C7: return 0xF3L;
			case 0x2D8: return 0xF4L;
			case 0x2D9: return 0xFAL;
			case 0x2DB: return 0xF2L;
			case 0x2DD: return 0xF1L;
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
