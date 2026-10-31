package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSpectravideoVideoCharset extends Charset {
	public XSpectravideoVideoCharset() {
		super("x-spectravideo-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSpectravideoVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSpectravideoVideoCharsetEncoder(this);
	}

	private static final class XSpectravideoVideoCharsetDecoder extends TableCharsetDecoder {
		private XSpectravideoVideoCharsetDecoder(Charset cs) {
			super(cs, 1.02353f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_BC = getOutput0_BC();
		private static final int[] getOutput0_BC() {
			return new int[] {
				0xA6, 0x7D, 0x7E, 0, 0x251C, 0x2580, 0x2518, 0x2524, 0x2510, 0x2590, 0x259A, 0x258C, 0xDF7ED83E, 0xDF7CD83E, 0xDF7FD83E, 0x2581,
				0x2550, 0x2598, 0x2594, 0x25A1, 0x250C, 0x2597, 0x253C, 0x2584, 0xDF7DD83E, 0x259D, 0x252C, 0x2534, 0x2596, 0x2514, 0x25E3, 0x2665,
				0x2571, 0x2573, 0x2572, 0x25CB, 0x259E, 0x25CF, 0x256E, 0x2570, 0x256F, 0x258F, 0x2663, 0x2666, 0x2595, 0x2588, 0x25E4, 0xDF8FD83E,
				0x25E2, 0xDF8CD83E, 0x256D, 0x2660, 0x25E5, 0x2500, 0x2592, 0x2502, 0x2192, 0x2190, 0x2191, 0x2193, 0x4A, 0x2E, 0x53, 0x75,
				0x7A, 0x75, 0x6B, 0x69,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x5B) return input - 0x0 + 0x20;
			if (input >= 0x60 && input <= 0xBB) return input - 0x60 + 0x20;
			if (input >= 0xBC && input <= 0xFF) return GETOUTPUT0_BC[input - 0xBC];
			switch (input) {
			case 0x5C: return 0xA6L;
			case 0x5D: return 0x7DL;
			case 0x5E: return 0x7EL;
			case 0x5F: return 0xA0L;
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

	private static final class XSpectravideoVideoCharsetEncoder extends TableCharsetEncoder {
		private XSpectravideoVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{31}, 2);
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
		private static final char[] GETOUTPUT0_256D = getOutput0_256D();
		private static final char[] getOutput0_256D() {
			return "\u00EE\u00E2\u00E4\u00E3\u00DC\u00DE\u00DD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C1\u00CB\u0000\u0000\u00D3\u0000\u0000\u0000\u00E9\u0000\u0000\u0000\u00C7\u0000\u0000\u00E5\u00C5\u0000\u00F2\u0000\u00CE\u00E8\u00D8\u00D1\u00CD\u0000\u00C6\u0000\u0000\u00D5\u00E0\u0000\u0000\u00CF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x3F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x20];
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0x20;
			if (input >= 0x256D && input <= 0x25A1) return GETOUTPUT0_256D[input - 0x256D];
			switch (input) {
			case 0xA0: return 0x5FL;
			case 0xA6: return 0x5CL;
			case 0x2190: return 0xF5L;
			case 0x2191: return 0xF6L;
			case 0x2192: return 0xF4L;
			case 0x2193: return 0xF7L;
			case 0x23B8: return 0xE5L;
			case 0x23B9: return 0xE8L;
			case 0x23BA: return 0xCEL;
			case 0x23BD: return 0xCBL;
			case 0x2500: return 0xF1L;
			case 0x2502: return 0xF3L;
			case 0x250C: return 0xD0L;
			case 0x2510: return 0xC4L;
			case 0x2514: return 0xD9L;
			case 0x2518: return 0xC2L;
			case 0x251C: return 0xC0L;
			case 0x2524: return 0xC3L;
			case 0x252C: return 0xD6L;
			case 0x2534: return 0xD7L;
			case 0x253C: return 0xD2L;
			case 0x2550: return 0xCCL;
			case 0x25CB: return 0xDFL;
			case 0x25CF: return 0xE1L;
			case 0x25E2: return 0xECL;
			case 0x25E3: return 0xDAL;
			case 0x25E4: return 0xEAL;
			case 0x25E5: return 0xF0L;
			case 0x2660: return 0xEFL;
			case 0x2663: return 0xE6L;
			case 0x2665: return 0xDBL;
			case 0x2666: return 0xE7L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDF7C: return 0xC9L;
			case 0xDF7D: return 0xD4L;
			case 0xDF7E: return 0xC8L;
			case 0xDF7F: return 0xCAL;
			case 0xDF8C: return 0xEDL;
			case 0xDF8F: return 0xEBL;
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
