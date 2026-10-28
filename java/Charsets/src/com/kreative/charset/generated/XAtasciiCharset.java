package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAtasciiCharset extends Charset {
	public XAtasciiCharset() {
		super("x-atascii", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAtasciiCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAtasciiCharsetEncoder(this);
	}

	private static final class XAtasciiCharsetDecoder extends TableCharsetDecoder {
		private XAtasciiCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\u2665\u251C\u23B9\u2518\u2524\u2510\u2571\u2572\u25E2\u2597\u25E3\u259D\u2598\u23BA\u23BD\u2596\u2663\u250C\u2500\u253C\u25CF\u2584\u23B8\u252C\u2534\u258C\u2514".toCharArray();
		}
		private static final char[] GETOUTPUT0_7B = getOutput0_7B();
		private static final char[] getOutput0_7B() {
			return "\u2660\u2502\f\b\t\u2665\u251C\u23B9\u2518\u2524\u2510\u2571\u2572\u25E2\u2597\u25E3\u259D\u2598\u23BA\u23BD\u2596\u2663\u250C\u2500\u253C\u25CF\u2584\u23B8\u252C\u2534\u258C\u2514\n\u009C\u009D\u009E\u009F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x1B && input <= 0x5F) return input - 0x1B + 0x1B;
			if (input >= 0x0 && input <= 0x1A) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0xA0 && input <= 0xDF) return input - 0xA0 + 0x20;
			if (input >= 0x7B && input <= 0x9F) return GETOUTPUT0_7B[input - 0x7B];
			if (input >= 0xE1 && input <= 0xFA) return input - 0xE1 + 0x61;
			switch (input) {
			case 0x60: return 0x2666L;
			case 0xE0: return 0x2666L;
			case 0xFB: return 0x2660L;
			case 0xFC: return 0x2502L;
			case 0xFD: return 0x7L;
			case 0xFE: return 0x88L;
			case 0xFF: return 0x89L;
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

	private static final class XAtasciiCharsetEncoder extends TableCharsetEncoder {
		private XAtasciiCharsetEncoder(Charset cs) {
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
		private long getOutput0(int input) {
			if (input >= 0x1B && input <= 0x5F) return input - 0x1B + 0x1B;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x7: return 0xFDL;
			case 0x8: return 0x7EL;
			case 0x9: return 0x7FL;
			case 0xA: return 0x9BL;
			case 0xB: return 0x7DL;
			case 0xC: return 0x7DL;
			case 0xD: return 0x9BL;
			case 0x7C: return 0x7CL;
			case 0x85: return 0x9BL;
			case 0x87: return 0xFDL;
			case 0x88: return 0xFEL;
			case 0x89: return 0xFF01L;
			case 0x9B: return 0x9BL;
			case 0x9C: return 0x9CL;
			case 0x9D: return 0x9DL;
			case 0x9E: return 0x9EL;
			case 0x9F: return 0x9FL;
			case 0x2022: return 0x14L;
			case 0x2190: return 0x1EL;
			case 0x2191: return 0x1CL;
			case 0x2192: return 0x1FL;
			case 0x2193: return 0x1DL;
			case 0x23B8: return 0x16L;
			case 0x23B9: return 0x201L;
			case 0x23BA: return 0xDL;
			case 0x23BD: return 0xEL;
			case 0x241B: return 0x1BL;
			case 0x2500: return 0x12L;
			case 0x2502: return 0x7CL;
			case 0x250C: return 0x11L;
			case 0x2510: return 0x501L;
			case 0x2514: return 0x1AL;
			case 0x2518: return 0x301L;
			case 0x251C: return 0x101L;
			case 0x2524: return 0x401L;
			case 0x252C: return 0x17L;
			case 0x2534: return 0x18L;
			case 0x253C: return 0x13L;
			case 0x2571: return 0x601L;
			case 0x2572: return 0x701L;
			case 0x2581: return 0xEL;
			case 0x2582: return 0xEL;
			case 0x2584: return 0x15L;
			case 0x258C: return 0x19L;
			case 0x258E: return 0x16L;
			case 0x258F: return 0x16L;
			case 0x2594: return 0xDL;
			case 0x2595: return 0x201L;
			case 0x2596: return 0xFL;
			case 0x2597: return 0x9L;
			case 0x2598: return 0xCL;
			case 0x259D: return 0xBL;
			case 0x25B6: return 0x7FL;
			case 0x25C0: return 0x7EL;
			case 0x25CF: return 0x14L;
			case 0x25E2: return 0x8L;
			case 0x25E3: return 0xAL;
			case 0x2660: return 0x7BL;
			case 0x2663: return 0x10L;
			case 0x2665: return 0x1L;
			case 0x2666: return 0x60L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDCB0: return 0x7DL;
			case 0xDF82: return 0xDL;
			case 0xDF87: return 0x201L;
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
