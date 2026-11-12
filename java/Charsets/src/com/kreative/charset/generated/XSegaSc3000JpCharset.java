package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSegaSc3000JpCharset extends Charset {
	public XSegaSc3000JpCharset() {
		super("x-sega-sc3000-jp", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSegaSc3000JpCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSegaSc3000JpCharsetEncoder(this);
	}

	private static final class XSegaSc3000JpCharsetDecoder extends TableCharsetDecoder {
		private XSegaSc3000JpCharsetDecoder(Charset cs) {
			super(cs, 1.02734f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_80 = getOutput0_80();
		private static final int[] getOutput0_80() {
			return new int[] {
				0x2502, 0x2500, 0x2534, 0x252C, 0x2524, 0x251C, 0x250C, 0x2514, 0x2510, 0x2518, 0x256D, 0x2570, 0x256E, 0x256F, 0x2191, 0x2190,
				0x2592, 0x2573, 0x253C, 0x2571, 0x2572, 0x25E2, 0x25E3, 0x25E5, 0x25E4, 0x2581, 0x2582, 0x2584, 0x2580, 0xDF82D83E, 0x2594, 0x258F,
				0x3000, 0x3002, 0x300C, 0x300D, 0x3001, 0x30FB, 0x30F2, 0x30A1, 0x30A3, 0x30A5, 0x30A7, 0x30A9, 0x30E3, 0x30E5, 0x30E7, 0x30C3,
				0x30FC, 0x30A2, 0x30A4, 0x30A6, 0x30A8, 0x30AA, 0x30AB, 0x30AD, 0x30AF, 0x30B1, 0x30B3, 0x30B5, 0x30B7, 0x30B9, 0x30BB, 0x30BD,
				0x30BF, 0x30C1, 0x30C4, 0x30C6, 0x30C8, 0x30CA, 0x30CB, 0x30CC, 0x30CD, 0x30CE, 0x30CF, 0x30D2, 0x30D5, 0x30D8, 0x30DB, 0x30DE,
				0x30DF, 0x30E0, 0x30E1, 0x30E2, 0x30E4, 0x30E6, 0x30E8, 0x30E9, 0x30EA, 0x30EB, 0x30EC, 0x30ED, 0x30EF, 0x30F3, 0x309B, 0x309C,
				0x258E, 0x258C, 0x2590, 0xDF87D83E, 0x2595, 0x2588, 0x2503, 0x2501, 0x2507, 0x2505, 0x259E, 0x25CB, 0x25CF, 0x5E74, 0x6708, 0x65E5,
				0x706B, 0x6C34, 0x6728, 0x91D1, 0x571F, 0x2660, 0x2665, 0x2666, 0x2663, 0xDC6FD833, 0xDCFBD833, 0xDC00D833, 0xDC01D833, 0xDFC5D83E, 0xF7, 0xA0,
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
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XSegaSc3000JpCharsetEncoder extends TableCharsetEncoder {
		private XSegaSc3000JpCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			case 0xD83D: return 0x2;
			case 0xD83E: return 0x3;
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
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EAC0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7F) return input - 0x60 + 0x60;
			if (input >= 0x256D && input <= 0x259E) return CommonSubtables.C8135707[input - 0x256D];
			if (input >= 0x309B && input <= 0x30FC) return CommonSubtables.C6725438[input - 0x309B];
			if (input >= 0xFF01 && input <= 0xFF3B) return input - 0xFF01 + 0x21;
			if (input >= 0xFF40 && input <= 0xFF5E) return input - 0xFF40 + 0x60;
			if (input >= 0xFF61 && input <= 0xFF9F) return input - 0xFF61 + 0xA1;
			switch (input) {
			case 0x5D: return 0x5DL;
			case 0x5E: return 0x5EL;
			case 0xA0: return 0xFF01L;
			case 0xA5: return 0x5CL;
			case 0xF7: return 0xFEL;
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
			case 0x3000: return 0xA0L;
			case 0x3001: return 0xA4L;
			case 0x3002: return 0xA1L;
			case 0x300C: return 0xA2L;
			case 0x300D: return 0xA3L;
			case 0x571F: return 0xF4L;
			case 0x5E74: return 0xEDL;
			case 0x65E5: return 0xEFL;
			case 0x6708: return 0xEEL;
			case 0x6728: return 0xF2L;
			case 0x6C34: return 0xF1L;
			case 0x706B: return 0xF0L;
			case 0x91D1: return 0xF3L;
			case 0xFF3D: return 0x5DL;
			case 0xFF3E: return 0x5EL;
			case 0xFFE5: return 0x5CL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDC00: return 0xFBL;
			case 0xDC01: return 0xFCL;
			case 0xDC6F: return 0xF9L;
			case 0xDCFB: return 0xFAL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDEF8: return 0xFAL;
			}
			return 0;
		}
		private long getOutput3(int input) {
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
			default: return 0;
			}
		}
	}
}
