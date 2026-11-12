package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSegaSc3000EuCharset extends Charset {
	public XSegaSc3000EuCharset() {
		super("x-sega-sc3000-eu", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSegaSc3000EuCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSegaSc3000EuCharsetEncoder(this);
	}

	private static final class XSegaSc3000EuCharsetDecoder extends TableCharsetDecoder {
		private XSegaSc3000EuCharsetDecoder(Charset cs) {
			super(cs, 1.03664f, 2f, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xCE: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final int[] GETOUTPUT0_80 = getOutput0_80();
		private static final int[] getOutput0_80() {
			return new int[] {
				0x2502, 0x2500, 0x2534, 0x252C, 0x2524, 0x251C, 0x250C, 0x2514, 0x2510, 0x2518, 0x256D, 0x2570, 0x256E, 0x256F, 0x2191, 0x2190,
				0x2592, 0x2573, 0x253C, 0x2571, 0x2572, 0x25E2, 0x25E3, 0x25E5, 0x25E4, 0x2581, 0x2582, 0x2584, 0x2580, 0xDF82D83E, 0x2594, 0x258F,
				0xC2, 0x102, 0xC1, 0xC0, 0xC4, 0xC5, 0xC3, 0x100, 0xCA, 0x114, 0xCB, 0x112, 0xC9, 0xC8, 0xD1, 0x302004E,
				0x12C, 0xCC, 0xCD, 0xCF, 0xCE, 0x12A, 0xD4, 0x14E, 0x327004F, 0xD3, 0xD2, 0xD6, 0xD5, 0xDB, 0x16C, 0xDA,
				0xD9, 0xDC, 0x16A, 0x3B1, 0xDF, 0x3B8, 0x39B, 0xB5, 0x3A3, 0xD8, 0x3A9, 0xC7, 0xBF, 0xA1, 0, 0xA3,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0x258E, 0x258C, 0x2590, 0xDF87D83E, 0x2595, 0x2588, 0x2503, 0x2501, 0x2507, 0x2505, 0x259E, 0x25CB, 0x25CF, 0, 0, 0,
				0, 0, 0, 0, 0, 0x2660, 0x2665, 0x2666, 0x2663, 0xDC6FD833, 0xDCFBD833, 0xDC00D833, 0xDC01D833, 0xDFC5D83E, 0xF7, 0xA0,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DAC0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7F) return input - 0x60 + 0x60;
			if (input >= 0x80 && input <= 0xFF) return GETOUTPUT0_80[input - 0x80];
			switch (input) {
			case 0x5C: return 0xA5L;
			case 0x5D: return 0x5DL;
			case 0x5E: return 0x5EL;
			case 0x5F: return 0x3C0L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x45: return 0xC6L;
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

	private static final class XSegaSc3000EuCharsetEncoder extends TableCharsetEncoder {
		private XSegaSc3000EuCharsetEncoder(Charset cs) {
			super(cs, 1f, 2f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x4E: return 0x1;
			case 0x4F: return 0x2;
			case 0xD833: return 0x3;
			case 0xD83D: return 0x4;
			case 0xD83E: return 0x5;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\uFF01\u00CD\u0000\u00CF\u0000\\\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00CC\u00A3\u00A2\u00A0\u00A6\u00A4\u00A5\u45CE\u00CB\u00AD\u00AC\u00A8\u00AA\u00B1\u00B2\u00B4\u00B3\u0000\u00AE\u00BA\u00B9\u00B6\u00BC\u00BB\u0000\u00C9\u00C0\u00BF\u00BD\u00C1\u0000\u0000\u00C4".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EAC0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7F) return input - 0x60 + 0x60;
			if (input >= 0xA0 && input <= 0xDF) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x256D && input <= 0x259E) return CommonSubtables.C8135707[input - 0x256D];
			switch (input) {
			case 0x5D: return 0x5DL;
			case 0x5E: return 0x5EL;
			case 0xF7: return 0xFEL;
			case 0x100: return 0xA7L;
			case 0x102: return 0xA1L;
			case 0x112: return 0xABL;
			case 0x114: return 0xA9L;
			case 0x12A: return 0xB5L;
			case 0x12C: return 0xB0L;
			case 0x14E: return 0xB7L;
			case 0x16A: return 0xC2L;
			case 0x16C: return 0xBEL;
			case 0x39B: return 0xC6L;
			case 0x3A3: return 0xC8L;
			case 0x3A9: return 0xCAL;
			case 0x3B1: return 0xC3L;
			case 0x3B2: return 0xC4L;
			case 0x3B8: return 0xC5L;
			case 0x3BC: return 0xC7L;
			case 0x3C0: return 0x5FL;
			case 0x2190: return 0x8FL;
			case 0x2191: return 0x8EL;
			case 0x2500: return 0x81L;
			case 0x2501: return 0xE7L;
			case 0x2502: return 0x80L;
			case 0x2503: return 0xE6L;
			case 0x2505: return 0xE9L;
			case 0x2507: return 0xE8L;
			case 0x250C: return 0x86L;
			case 0x2510: return 0x88L;
			case 0x2514: return 0x87L;
			case 0x2518: return 0x89L;
			case 0x251C: return 0x85L;
			case 0x2524: return 0x84L;
			case 0x252C: return 0x83L;
			case 0x2534: return 0x82L;
			case 0x253C: return 0x92L;
			case 0x2550: return 0xE9L;
			case 0x2551: return 0xE8L;
			case 0x25CB: return 0xEBL;
			case 0x25CF: return 0xECL;
			case 0x25E2: return 0x95L;
			case 0x25E3: return 0x96L;
			case 0x25E4: return 0x98L;
			case 0x25E5: return 0x97L;
			case 0x2660: return 0xF5L;
			case 0x2663: return 0xF8L;
			case 0x2665: return 0xF6L;
			case 0x2666: return 0xF7L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x302: return 0xAFL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x327: return 0xB8L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xDC00: return 0xFBL;
			case 0xDC01: return 0xFCL;
			case 0xDC6F: return 0xF9L;
			case 0xDCFB: return 0xFAL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xDEF8: return 0xFAL;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xDF82: return 0x9DL;
			case 0xDF87: return 0xE3L;
			case 0xDFC5: return 0xFDL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 3: return getOutput3(input);
			case 4: return getOutput4(input);
			case 5: return getOutput5(input);
			default: return 0;
			}
		}
	}
}
