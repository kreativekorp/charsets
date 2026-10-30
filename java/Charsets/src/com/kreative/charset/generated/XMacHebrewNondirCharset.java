package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacHebrewNondirCharset extends Charset {
	public XMacHebrewNondirCharset() {
		super("x-MacHebrew-nondir", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacHebrewNondirCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacHebrewNondirCharsetEncoder(this);
	}

	private static final class XMacHebrewNondirCharsetDecoder extends TableCharsetDecoder {
		private XMacHebrewNondirCharsetDecoder(Charset cs) {
			super(cs, 1.01562f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_80 = getOutput0_80();
		private static final int[] getOutput0_80() {
			return new int[] {
				0xC4, 0x5B705F2, 0xC7, 0xC9, 0xD1, 0xD6, 0xDC, 0xE1, 0xE0, 0xE2, 0xE4, 0xE3, 0xE5, 0xE7, 0xE9, 0xE8,
				0xEA, 0xEB, 0xED, 0xEC, 0xEE, 0xEF, 0xF1, 0xF3, 0xF2, 0xF4, 0xF6, 0xF5, 0xFA, 0xF9, 0xFB, 0xFC,
				0x20, 0x21, 0x22, 0x23, 0x24, 0x25, 0x20AA, 0x27, 0x29, 0x28,
			};
		}
		private static final long[] GETOUTPUT0_C0 = getOutput0_C0();
		private static final long[] getOutput0_C0() {
			return new long[] {
				0x5B905DCF86AL, 0x201EL, 0xF89BL, 0xF89CL, 0xF89DL, 0xF89EL, 0x5BCL, 0xFB4BL, 0xFB35L, 0x2026L, 0xA0L, 0x5B8L, 0x5B7L, 0x5B5L, 0x5B6L, 0x5B4L,
				0x2013L, 0x2014L, 0x201CL, 0x201DL, 0x2018L, 0x2019L, 0xFB2AL, 0xFB2BL, 0x5BFL, 0x5B0L, 0x5B2L, 0x5B1L, 0x5BBL, 0x5B9L, 0xF87F05B8L, 0x5B3L,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xAA && input <= 0xBF) return input - 0xAA + 0x2A;
			if (input >= 0x80 && input <= 0xA9) return GETOUTPUT0_80[input - 0x80];
			if (input >= 0xE0 && input <= 0xFA) return input - 0xE0 + 0x5D0;
			if (input >= 0xC0 && input <= 0xDF) return GETOUTPUT0_C0[input - 0xC0];
			switch (input) {
			case 0xFB: return 0x7DL;
			case 0xFC: return 0x5DL;
			case 0xFD: return 0x7BL;
			case 0xFE: return 0x5BL;
			case 0xFF: return 0x7CL;
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

	private static final class XMacHebrewNondirCharsetEncoder extends TableCharsetEncoder {
		private XMacHebrewNondirCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x5B8: return 0x1;
			case 0x5F2: return 0x2;
			case 0xF86A: return 0x3;
			}
			return 0;
		}
		private int getNextState3(int input) {
			switch (input) {
			case 0x5DC: return 0x4;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 3: return getNextState3(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xC4 && input <= 0xFC) return CommonSubtables.COMMON1143[input - 0xC4];
			if (input >= 0x5D0 && input <= 0x5EA) return input - 0x5D0 + 0xE0;
			switch (input) {
			case 0xA0: return 0xCAL;
			case 0x5B0: return 0xD9L;
			case 0x5B1: return 0xDBL;
			case 0x5B2: return 0xDAL;
			case 0x5B3: return 0xDFL;
			case 0x5B4: return 0xCFL;
			case 0x5B5: return 0xCDL;
			case 0x5B6: return 0xCEL;
			case 0x5B7: return 0xCCL;
			case 0x5B8: return 0xCBL;
			case 0x5B9: return 0xDDL;
			case 0x5BB: return 0xDCL;
			case 0x5BC: return 0xC6L;
			case 0x5BF: return 0xD8L;
			case 0x2013: return 0xD0L;
			case 0x2014: return 0xD1L;
			case 0x2018: return 0xD4L;
			case 0x2019: return 0xD5L;
			case 0x201C: return 0xD2L;
			case 0x201D: return 0xD3L;
			case 0x201E: return 0xC1L;
			case 0x2026: return 0xC9L;
			case 0x20AA: return 0xA6L;
			case 0xF89B: return 0xC2L;
			case 0xF89C: return 0xC3L;
			case 0xF89D: return 0xC4L;
			case 0xF89E: return 0xC5L;
			case 0xFB2A: return 0xD6L;
			case 0xFB2B: return 0xD7L;
			case 0xFB35: return 0xC8L;
			case 0xFB4B: return 0xC7L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xF87F: return 0xDEL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x5B7: return 0x81L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x5B9: return 0xC0L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 4: return getOutput4(input);
			default: return 0;
			}
		}
	}
}
