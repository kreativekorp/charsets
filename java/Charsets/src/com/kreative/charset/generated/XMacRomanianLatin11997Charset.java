package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacRomanianLatin11997Charset extends Charset {
	public XMacRomanianLatin11997Charset() {
		super("x-MacRomanianLatin1-1997", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacRomanianLatin11997CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacRomanianLatin11997CharsetEncoder(this);
	}

	private static final class XMacRomanianLatin11997CharsetDecoder extends TableCharsetDecoder {
		private XMacRomanianLatin11997CharsetDecoder(Charset cs) {
			super(cs, 1.01562f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_80 = getOutput0_80();
		private static final int[] getOutput0_80() {
			return new int[] {
				0x2022, 0x2122, 0x2260, 0x221E, 0x2265, 0x2211, 0x222B, 0x3A9, 0x221A, 0x2248, 0x2026, 0x2014, 0x2018, 0x178, 0x2044, 0x2202,
				0x2206, 0x152, 0x201A, 0x201E, 0x2030, 0xF8FF, 0x2C6, 0x2DC, 0x2D8, 0x2D9, 0x2DA, 0x2DD, 0x2DB, 0x2C7, 0x131, 0x192,
				0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0x153, 0xA7, 0xA8, 0xA9, 0xAA, 0xAB, 0xAC, 0x2013, 0xAE, 0xAF,
				0xB0, 0xB1, 0x201D, 0x201C, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0x2019, 0xBA, 0xBB, 0x3C0, 0x220F, 0x2264, 0xBF,
				0xC0, 0xC1, 0xC2, 0xC3, 0xC4, 0xC5, 0x102, 0xC7, 0xC8, 0xC9, 0xCA, 0xCB, 0xCC, 0xCD, 0xCE, 0xCF,
				0x2039, 0xD1, 0xD2, 0xD3, 0xD4, 0xD5, 0xD6, 0x25CA, 0x3260053, 0xD9, 0xDA, 0xDB, 0xDC, 0x2020, 0x3260054, 0xDF,
				0xE0, 0xE1, 0xE2, 0xE3, 0xE4, 0xE5, 0x103, 0xE7, 0xE8, 0xE9, 0xEA, 0xEB, 0xEC, 0xED, 0xEE, 0xEF,
				0x203A, 0xF1, 0xF2, 0xF3, 0xF4, 0xF5, 0xF6, 0xF7, 0x3260073, 0xF9, 0xFA, 0xFB, 0xFC, 0x2021, 0x3260074, 0xFF,
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

	private static final class XMacRomanianLatin11997CharsetEncoder extends TableCharsetEncoder {
		private XMacRomanianLatin11997CharsetEncoder(Charset cs) {
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
			if (input >= 0xA0 && input <= 0x103) return CommonSubtables.COMMON1206[input - 0xA0];
			if (input >= 0x2013 && input <= 0x2044) return CommonSubtables.COMMON1203[input - 0x2013];
			switch (input) {
			case 0x131: return 0x9EL;
			case 0x152: return 0x91L;
			case 0x153: return 0xA6L;
			case 0x15E: return 0xD8L;
			case 0x15F: return 0xF8L;
			case 0x162: return 0xDEL;
			case 0x163: return 0xFEL;
			case 0x178: return 0x8DL;
			case 0x192: return 0x9FL;
			case 0x218: return 0xD8L;
			case 0x219: return 0xF8L;
			case 0x21A: return 0xDEL;
			case 0x21B: return 0xFEL;
			case 0x2C6: return 0x96L;
			case 0x2C7: return 0x9DL;
			case 0x2D8: return 0x98L;
			case 0x2D9: return 0x99L;
			case 0x2DA: return 0x9AL;
			case 0x2DB: return 0x9CL;
			case 0x2DC: return 0x97L;
			case 0x2DD: return 0x9BL;
			case 0x3A9: return 0x87L;
			case 0x3C0: return 0xBCL;
			case 0x2122: return 0x81L;
			case 0x2126: return 0x87L;
			case 0x2202: return 0x8FL;
			case 0x2206: return 0x90L;
			case 0x220F: return 0xBDL;
			case 0x2211: return 0x85L;
			case 0x221A: return 0x88L;
			case 0x221E: return 0x83L;
			case 0x222B: return 0x86L;
			case 0x2248: return 0x89L;
			case 0x2260: return 0x82L;
			case 0x2264: return 0xBEL;
			case 0x2265: return 0x84L;
			case 0x25CA: return 0xD7L;
			case 0xF8FF: return 0x95L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x326: return 0xD8L;
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
			case 0x326: return 0xF8L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x326: return 0xFEL;
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
