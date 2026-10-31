package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSpectravideoCharset extends Charset {
	public XSpectravideoCharset() {
		super("x-spectravideo", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSpectravideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSpectravideoCharsetEncoder(this);
	}

	private static final class XSpectravideoCharsetDecoder extends TableCharsetDecoder {
		private XSpectravideoCharsetDecoder(Charset cs) {
			super(cs, 1.03261f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final int[] getOutput0_A0() {
			return new int[] {
				0x251C, 0x2580, 0x2518, 0x2524, 0x2510, 0x2590, 0x259A, 0x258C, 0xDF7ED83E, 0xDF7CD83E, 0xDF7FD83E, 0x2581, 0x2550, 0x2598, 0x2594, 0x25A1,
				0x250C, 0x2597, 0x253C, 0x2584, 0xDF7DD83E, 0x259D, 0x252C, 0x2534, 0x2596, 0x2514, 0x25E3, 0x2665, 0x2571, 0x2573, 0x2572, 0x25CB,
				0x259E, 0x25CF, 0x256E, 0x2570, 0x256F, 0x258F, 0x2663, 0x2666, 0x2595, 0x2588, 0x25E4, 0xDF8FD83E, 0x25E2, 0xDF8CD83E, 0x256D, 0x2660,
				0x25E5, 0x2500, 0x2592, 0x2502, 0x2192, 0x2190, 0x2191, 0x2193,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7B) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xD7) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x7C: return 0xA6L;
			case 0x7D: return 0x7DL;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x7FL;
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

	private static final class XSpectravideoCharsetEncoder extends TableCharsetEncoder {
		private XSpectravideoCharsetEncoder(Charset cs) {
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
		private static final char[] GETOUTPUT0_256D = getOutput0_256D();
		private static final char[] getOutput0_256D() {
			return "\u00CE\u00C2\u00C4\u00C3\u00BC\u00BE\u00BD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A1\u00AB\u0000\u0000\u00B3\u0000\u0000\u0000\u00C9\u0000\u0000\u0000\u00A7\u0000\u0000\u00C5\u00A5\u0000\u00D2\u0000\u00AE\u00C8\u00B8\u00B1\u00AD\u0000\u00A6\u0000\u0000\u00B5\u00C0\u0000\u0000\u00AF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x256D && input <= 0x25A1) return GETOUTPUT0_256D[input - 0x256D];
			switch (input) {
			case 0xA6: return 0x7CL;
			case 0x2190: return 0xD5L;
			case 0x2191: return 0xD6L;
			case 0x2192: return 0xD4L;
			case 0x2193: return 0xD7L;
			case 0x23B8: return 0xC5L;
			case 0x23B9: return 0xC8L;
			case 0x23BA: return 0xAEL;
			case 0x23BD: return 0xABL;
			case 0x2500: return 0xD1L;
			case 0x2502: return 0xD3L;
			case 0x250C: return 0xB0L;
			case 0x2510: return 0xA4L;
			case 0x2514: return 0xB9L;
			case 0x2518: return 0xA2L;
			case 0x251C: return 0xA0L;
			case 0x2524: return 0xA3L;
			case 0x252C: return 0xB6L;
			case 0x2534: return 0xB7L;
			case 0x253C: return 0xB2L;
			case 0x2550: return 0xACL;
			case 0x25CB: return 0xBFL;
			case 0x25CF: return 0xC1L;
			case 0x25E2: return 0xCCL;
			case 0x25E3: return 0xBAL;
			case 0x25E4: return 0xCAL;
			case 0x25E5: return 0xD0L;
			case 0x2660: return 0xCFL;
			case 0x2663: return 0xC6L;
			case 0x2665: return 0xBBL;
			case 0x2666: return 0xC7L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDF7C: return 0xA9L;
			case 0xDF7D: return 0xB4L;
			case 0xDF7E: return 0xA8L;
			case 0xDF7F: return 0xAAL;
			case 0xDF8C: return 0xCDL;
			case 0xDF8F: return 0xCBL;
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
