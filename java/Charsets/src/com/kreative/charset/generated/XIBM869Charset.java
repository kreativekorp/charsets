package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM869Charset extends Charset {
	public XIBM869Charset() {
		super("x-IBM869", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM869CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM869CharsetEncoder(this);
	}

	private static final class XIBM869CharsetDecoder extends TableCharsetDecoder {
		private XIBM869CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_86 = getOutput0_86();
		private static final char[] getOutput0_86() {
			return "\u0386\u0000\u00B7\u00AC\u00A6\u2018\u2019\u0388\u2015\u0389\u038A\u03AA\u038C\u0000\u0000\u038E\u03AB\u00A9\u038F\u00B2\u00B3\u03AC\u00A3\u03AD\u03AE\u03AF\u03CA\u0390\u03CC\u03CD\u0391\u0392\u0393\u0394\u0395\u0396\u0397\u00BD\u0398\u0399\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\u039A\u039B\u039C\u039D\u2563\u2551\u2557\u255D\u039E\u039F\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u03A0\u03A1\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u03A3\u03A4\u03A5\u03A6\u03A7\u03A8\u03A9\u03B1\u03B2\u03B3\u2518\u250C\u2588\u2584\u03B4\u03B5\u2580\u03B6\u03B7\u03B8\u03B9\u03BA\u03BB\u03BC\u03BD\u03BE\u03BF\u03C0\u03C1\u03C3\u03C2\u03C4\u0384\u00AD\u00B1\u03C5\u03C6\u03C7\u00A7\u03C8\u0385\u00B0\u00A8\u03C9\u03CB\u03B0\u03CE\u25A0\u00A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x86 && input <= 0xFF) return GETOUTPUT0_86[input - 0x86];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM869CharsetEncoder extends TableCharsetEncoder {
		private XIBM869CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\uFF01\u0000\u0000\u009C\u0000\u0000\u008A\u00F5\u00F9\u0097\u0000\u00AE\u0089\u00F0\u0000\u0000\u00F8\u00F1\u0099\u009A\u0000\u0000\u0000\u0088\u0000\u0000\u0000\u00AF\u0000\u00AB".toCharArray();
		}
		private static final char[] GETOUTPUT0_384 = getOutput0_384();
		private static final char[] getOutput0_384() {
			return "\u00EF\u00F7\u0086\u0000\u008D\u008F\u0090\u0000\u0092\u0000\u0095\u0098\u00A1\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u00AA\u00AC\u00AD\u00B5\u00B6\u00B7\u00B8\u00BD\u00BE\u00C6\u00C7\u0000\u00CF\u00D0\u00D1\u00D2\u00D3\u00D4\u00D5\u0091\u0096\u009B\u009D\u009E\u009F\u00FC\u00D6\u00D7\u00D8\u00DD\u00DE\u00E0\u00E1\u00E2\u00E3\u00E4\u00E5\u00E6\u00E7\u00E8\u00E9\u00EA\u00EB\u00ED\u00EC\u00EE\u00F2\u00F3\u00F4\u00F6\u00FA\u00A0\u00FB\u00A2\u00A3\u00FD".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xBD) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x384 && input <= 0x3CE) return GETOUTPUT0_384[input - 0x384];
			switch (input) {
			case 0x2015: return 0x8EL;
			case 0x2018: return 0x8BL;
			case 0x2019: return 0x8CL;
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
