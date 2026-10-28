package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XRobotronCharset extends Charset {
	public XRobotronCharset() {
		super("x-robotron", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XRobotronCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XRobotronCharsetEncoder(this);
	}

	private static final class XRobotronCharsetDecoder extends TableCharsetDecoder {
		private XRobotronCharsetDecoder(Charset cs) {
			super(cs, 1.27344f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_7F = getOutput0_7F();
		private static final int[] getOutput0_7F() {
			return new int[] {
				0x2588, 0xDFE3D83E, 0xDFE1D83E, 0xDFE0D83E, 0xDFE2D83E, 0x256F, 0x2570, 0x256D, 0x256E, 0xDF7CD83E, 0xDF7ED83E, 0x25C7, 0xDC8DD833, 0x25CB, 0x25D8, 0x25E4,
				0x25E3, 0x2571, 0x2572, 0xDFD0D83E, 0xDFD1D83E, 0xDFDDD83E, 0xDFD3D83E, 0xDFD2D83E, 0xDFDFD83E, 0xDFD7D83E, 0xDFD6D83E, 0xDFDCD83E, 0xDFD4D83E, 0xDFD5D83E, 0xDFDED83E, 0x2594,
				0x258F, 0x2500, 0x2502, 0x2534, 0x251C, 0x252C, 0x2524, 0x253C, 0x2514, 0x250C, 0x2510, 0x2518, 0xDC39D833, 0xDC3AD833, 0xDC36D833, 0xDC35D833,
				0x2573, 0x2598, 0x259D, 0x2597, 0x2596, 0x258C, 0x2590, 0x2580, 0x2584, 0x259A, 0x259E, 0x259F, 0x2599, 0x259B, 0x259C, 0x25E2,
				0x25E5, 0x2595, 0xDF7DD83E, 0xDC8ED833, 0xDC8FD833, 0x265F, 0xDC45D833, 0xDC44D833, 0xDF90D83E, 0xDF7FD83E, 0x2666, 0x2663, 0x2665, 0x2660, 0xDC9BD833, 0xDC9CD833,
				0x2022, 0xDE90D833, 0xDE91D833, 0xDE92D833, 0xDE93D833, 0xDE94D833, 0xDE95D833, 0xDE96D833, 0xDE97D833, 0xDE98D833, 0xDE99D833, 0xDE9AD833, 0xDE9BD833, 0xDE9CD833, 0xDE9DD833, 0xDE9ED833,
				0xDE9FD833, 0xDEA0D833, 0xDEA1D833, 0x2582, 0xDEA2D833, 0xDEA3D833, 0xDE9CD833, 0xDEA4D833, 0xDEA5D833, 0x258E, 0xDEA6D833, 0xDEA7D833, 0xDE90D833, 0xDEA8D833, 0xDEA9D833, 0xDF82D83E,
				0xDEAAD833, 0xDEABD833, 0xDE93D833, 0xDEACD833, 0xDEADD833, 0xDF87D83E, 0xDEAED833, 0xDEAFD833, 0xDE9FD833, 0x2581, 0x2582, 0x2583, 0x2584, 0x2585, 0x2586, 0x2587,
				0x2588,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x7F && input <= 0xFF) return GETOUTPUT0_7F[input - 0x7F];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XRobotronCharsetEncoder extends TableCharsetEncoder {
		private XRobotronCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			case 0xD83E: return 0x2;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_256D = getOutput0_256D();
		private static final char[] getOutput0_256D() {
			return "\u0086\u0087\u0084\u0085\u0090\u0091\u00AF\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00B6\u00F8\u00F9\u00FA\u00B7\u00FC\u00FD\u00FE\uFF01\u0000\u0000\u0000\u00B4\u0000\u00E8\u009F\u00B5\u0000\u0000\u0000\u009E\u00C0\u00B3\u00B2\u00B0\u00BB\u00B8\u00BC\u00BD\u00B1\u00B9\u00BA".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x256D && input <= 0x259F) return GETOUTPUT0_256D[input - 0x256D];
			switch (input) {
			case 0x2022: return 0xCFL;
			case 0x2500: return 0xA0L;
			case 0x2502: return 0xA1L;
			case 0x250C: return 0xA8L;
			case 0x2510: return 0xA9L;
			case 0x2514: return 0xA7L;
			case 0x2518: return 0xAAL;
			case 0x251C: return 0xA3L;
			case 0x2524: return 0xA5L;
			case 0x252C: return 0xA4L;
			case 0x2534: return 0xA2L;
			case 0x253C: return 0xA6L;
			case 0x25C7: return 0x8AL;
			case 0x25CB: return 0x8CL;
			case 0x25CF: return 0xCFL;
			case 0x25D8: return 0x8DL;
			case 0x25E2: return 0xBEL;
			case 0x25E3: return 0x8FL;
			case 0x25E4: return 0x8EL;
			case 0x25E5: return 0xBFL;
			case 0x25E6: return 0x8CL;
			case 0x265F: return 0xC4L;
			case 0x2660: return 0xCCL;
			case 0x2663: return 0xCAL;
			case 0x2665: return 0xCBL;
			case 0x2666: return 0xC9L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDE90 && input <= 0xDEA1) return input - 0xDE90 + 0xD0;
			switch (input) {
			case 0xDC35: return 0xAEL;
			case 0xDC36: return 0xADL;
			case 0xDC39: return 0xABL;
			case 0xDC3A: return 0xACL;
			case 0xDC44: return 0xC6L;
			case 0xDC45: return 0xC5L;
			case 0xDC8D: return 0x8BL;
			case 0xDC8E: return 0xC2L;
			case 0xDC8F: return 0xC3L;
			case 0xDC9B: return 0xCDL;
			case 0xDC9C: return 0xCEL;
			case 0xDEA2: return 0xE3L;
			case 0xDEA3: return 0xE4L;
			case 0xDEA4: return 0xE6L;
			case 0xDEA5: return 0xE7L;
			case 0xDEA6: return 0xE9L;
			case 0xDEA7: return 0xEAL;
			case 0xDEA8: return 0xECL;
			case 0xDEA9: return 0xEDL;
			case 0xDEAA: return 0xEFL;
			case 0xDEAB: return 0xF0L;
			case 0xDEAC: return 0xF2L;
			case 0xDEAD: return 0xF3L;
			case 0xDEAE: return 0xF5L;
			case 0xDEAF: return 0xF6L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT2_DFD0 = getOutput2_DFD0();
		private static final char[] getOutput2_DFD0() {
			return "\u0092\u0093\u0096\u0095\u009B\u009C\u0099\u0098\u0000\u0000\u0000\u0000\u009A\u0094\u009D\u0097\u0082\u0081\u0083\u0080".toCharArray();
		}
		private long getOutput2(int input) {
			if (input >= 0xDFD0 && input <= 0xDFE3) return GETOUTPUT2_DFD0[input - 0xDFD0];
			switch (input) {
			case 0xDF7C: return 0x88L;
			case 0xDF7D: return 0xC1L;
			case 0xDF7E: return 0x89L;
			case 0xDF7F: return 0xC8L;
			case 0xDF82: return 0xEEL;
			case 0xDF87: return 0xF4L;
			case 0xDF90: return 0xC7L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			default: return 0;
			}
		}
	}
}
