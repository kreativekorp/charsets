package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMsxRuCharset extends Charset {
	public XMsxRuCharset() {
		super("x-msx-ru", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMsxRuCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMsxRuCharsetEncoder(this);
	}

	private static final class XMsxRuCharsetDecoder extends TableCharsetDecoder {
		private XMsxRuCharsetDecoder(Charset cs) {
			super(cs, 1.05098f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_80 = getOutput0_80();
		private static final int[] getOutput0_80() {
			return new int[] {
				0x2582, 0x259A, 0x2586, 0xDF82D83E, 0x25AC, 0xDF85D83E, 0x258E, 0x259E, 0x258A, 0xDF87D83E, 0xDF8AD83E, 0xDF99D83E, 0xDF98D83E, 0xDF6DD83E, 0xDF6FD83E, 0xDF6CD83E,
				0xDF6ED83E, 0xDF9AD83E, 0xDF9BD83E, 0x2598, 0x2597, 0x259D, 0x2596, 0xDF96D83E, 0x394, 0x2021, 0x3C9, 0x2588, 0x2584, 0x258C, 0x2590, 0x2580,
				0x3B1, 0xDF, 0x393, 0x3C0, 0x3A3, 0x3C3, 0xB5, 0x3C4, 0x3A6, 0x398, 0x3A9, 0x3B4, 0x221E, 0x2205, 0x2208, 0x2229,
				0x2261, 0xB1, 0x2265, 0x2264, 0x2320, 0x2321, 0xF7, 0x2248, 0xB0, 0x2219, 0xB7, 0x221A, 0x207F, 0xB2, 0x25A0, 0xA4,
				0x44E, 0x430, 0x431, 0x446, 0x434, 0x435, 0x444, 0x433, 0x445, 0x438, 0x439, 0x43A, 0x43B, 0x43C, 0x43D, 0x43E,
				0x43F, 0x44F, 0x440, 0x441, 0x442, 0x443, 0x436, 0x432, 0x44C, 0x44B, 0x437, 0x448, 0x44D, 0x449, 0x447, 0x44A,
				0x42E, 0x410, 0x411, 0x426, 0x414, 0x415, 0x424, 0x413, 0x425, 0x418, 0x419, 0x41A, 0x41B, 0x41C, 0x41D, 0x41E,
				0x41F, 0x42F, 0x420, 0x421, 0x422, 0x423, 0x416, 0x412, 0x42C, 0x42B, 0x417, 0x428, 0x42D, 0x429, 0x427,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFE) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMsxRuCharsetEncoder extends TableCharsetEncoder {
		private XMsxRuCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83E: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_2580 = getOutput0_2580();
		private static final char[] getOutput0_2580() {
			return "\u009F\u0000\u0080\u0000\u009C\u0000\u0082\u0000\u009B\u0000\u0088\u0000\u009D\u0000\u0086\u0000\u009E\u0000\u0000\u0000\u0000\u0000\u0096\u0094\u0093\u0000\u0081\u0000\u0000\u0095\u0087\u0000\u00BE\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0084".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x410 && input <= 0x44F) return CommonSubtables.COMMON1699[input - 0x410];
			if (input >= 0x2580 && input <= 0x25AC) return GETOUTPUT0_2580[input - 0x2580];
			switch (input) {
			case 0xA4: return 0xBFL;
			case 0xB0: return 0xB8L;
			case 0xB1: return 0xB1L;
			case 0xB2: return 0xBDL;
			case 0xB5: return 0xA6L;
			case 0xB7: return 0xBAL;
			case 0xDF: return 0xA1L;
			case 0xF7: return 0xB6L;
			case 0x393: return 0xA2L;
			case 0x394: return 0x98L;
			case 0x398: return 0xA9L;
			case 0x3A3: return 0xA4L;
			case 0x3A6: return 0xA8L;
			case 0x3A9: return 0xAAL;
			case 0x3B1: return 0xA0L;
			case 0x3B4: return 0xABL;
			case 0x3C0: return 0xA3L;
			case 0x3C3: return 0xA5L;
			case 0x3C4: return 0xA7L;
			case 0x3C9: return 0x9AL;
			case 0x2021: return 0x99L;
			case 0x207F: return 0xBCL;
			case 0x2205: return 0xADL;
			case 0x2208: return 0xAEL;
			case 0x2219: return 0xB9L;
			case 0x221A: return 0xBBL;
			case 0x221E: return 0xACL;
			case 0x2229: return 0xAFL;
			case 0x2248: return 0xB7L;
			case 0x2261: return 0xB0L;
			case 0x2264: return 0xB3L;
			case 0x2265: return 0xB2L;
			case 0x2320: return 0xB4L;
			case 0x2321: return 0xB5L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDF6C: return 0x8FL;
			case 0xDF6D: return 0x8DL;
			case 0xDF6E: return 0x90L;
			case 0xDF6F: return 0x8EL;
			case 0xDF82: return 0x83L;
			case 0xDF85: return 0x85L;
			case 0xDF87: return 0x89L;
			case 0xDF8A: return 0x8AL;
			case 0xDF96: return 0x97L;
			case 0xDF98: return 0x8CL;
			case 0xDF99: return 0x8BL;
			case 0xDF9A: return 0x91L;
			case 0xDF9B: return 0x92L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			default: return 0;
			}
		}
	}
}
