package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacRomanian1997Charset extends Charset {
	public XMacRomanian1997Charset() {
		super("x-MacRomanian-1997", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacRomanian1997CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacRomanian1997CharsetEncoder(this);
	}

	private static final class XMacRomanian1997CharsetDecoder extends TableCharsetDecoder {
		private XMacRomanian1997CharsetDecoder(Charset cs) {
			super(cs, 1.01562f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_80 = getOutput0_80();
		private static final int[] getOutput0_80() {
			return new int[] {
				0xC4, 0xC5, 0xC7, 0xC9, 0xD1, 0xD6, 0xDC, 0xE1, 0xE0, 0xE2, 0xE4, 0xE3, 0xE5, 0xE7, 0xE9, 0xE8,
				0xEA, 0xEB, 0xED, 0xEC, 0xEE, 0xEF, 0xF1, 0xF3, 0xF2, 0xF4, 0xF6, 0xF5, 0xFA, 0xF9, 0xFB, 0xFC,
				0x2020, 0xB0, 0xA2, 0xA3, 0xA7, 0x2022, 0xB6, 0xDF, 0xAE, 0xA9, 0x2122, 0xB4, 0xA8, 0x2260, 0x102, 0x3260053,
				0x221E, 0xB1, 0x2264, 0x2265, 0xA5, 0xB5, 0x2202, 0x2211, 0x220F, 0x3C0, 0x222B, 0xAA, 0xBA, 0x3A9, 0x103, 0x3260073,
				0xBF, 0xA1, 0xAC, 0x221A, 0x192, 0x2248, 0x2206, 0xAB, 0xBB, 0x2026, 0xA0, 0xC0, 0xC3, 0xD5, 0x152, 0x153,
				0x2013, 0x2014, 0x201C, 0x201D, 0x2018, 0x2019, 0xF7, 0x25CA, 0xFF, 0x178, 0x2044, 0xA4, 0x2039, 0x203A, 0x3260054, 0x3260074,
				0x2021, 0xB7, 0x201A, 0x201E, 0x2030, 0xC2, 0xCA, 0xC1, 0xCB, 0xC8, 0xCD, 0xCE, 0xCF, 0xCC, 0xD3, 0xD4,
				0xF8FF, 0xD2, 0xDA, 0xDB, 0xD9, 0x131, 0x2C6, 0x2DC, 0xAF, 0x2D8, 0x2D9, 0x2DA, 0xB8, 0x2DD, 0x2DB, 0x2C7,
			};
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

	private static final class XMacRomanian1997CharsetEncoder extends TableCharsetEncoder {
		private XMacRomanian1997CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x53: return 0x1;
			case 0x54: return 0x2;
			case 0x73: return 0x3;
			case 0x74: return 0x4;
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
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0x103) return CommonSubtables.COMMON1186[input - 0xA0];
			if (input >= 0x2013 && input <= 0x2044) return CommonSubtables.COMMON1183[input - 0x2013];
			switch (input) {
			case 0x131: return 0xF5L;
			case 0x152: return 0xCEL;
			case 0x153: return 0xCFL;
			case 0x15E: return 0xAFL;
			case 0x15F: return 0xBFL;
			case 0x162: return 0xDEL;
			case 0x163: return 0xDFL;
			case 0x178: return 0xD9L;
			case 0x192: return 0xC4L;
			case 0x218: return 0xAFL;
			case 0x219: return 0xBFL;
			case 0x21A: return 0xDEL;
			case 0x21B: return 0xDFL;
			case 0x2C6: return 0xF6L;
			case 0x2C7: return 0xFF01L;
			case 0x2D8: return 0xF9L;
			case 0x2D9: return 0xFAL;
			case 0x2DA: return 0xFBL;
			case 0x2DB: return 0xFEL;
			case 0x2DC: return 0xF7L;
			case 0x2DD: return 0xFDL;
			case 0x3A9: return 0xBDL;
			case 0x3C0: return 0xB9L;
			case 0x2122: return 0xAAL;
			case 0x2126: return 0xBDL;
			case 0x2202: return 0xB6L;
			case 0x2206: return 0xC6L;
			case 0x220F: return 0xB8L;
			case 0x2211: return 0xB7L;
			case 0x221A: return 0xC3L;
			case 0x221E: return 0xB0L;
			case 0x222B: return 0xBAL;
			case 0x2248: return 0xC5L;
			case 0x2260: return 0xADL;
			case 0x2264: return 0xB2L;
			case 0x2265: return 0xB3L;
			case 0x25CA: return 0xD7L;
			case 0xF8FF: return 0xF0L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x326: return 0xAFL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x326: return 0xDEL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0x326: return 0xBFL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x326: return 0xDFL;
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
			default: return 0;
			}
		}
	}
}
