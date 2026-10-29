package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacJapaneseCharset extends Charset {
	public XMacJapaneseCharset() {
		super("x-MacJapanese", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacJapaneseCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacJapaneseCharsetEncoder(this);
	}

	private static final class XMacJapaneseCharsetDecoder extends TableCharsetDecoder {
		private XMacJapaneseCharsetDecoder(Charset cs) {
			super(cs, 1f, 2.5f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0x81 && input <= 0x9F) return input - 0x81 + 0x1;
			switch (input) {
			case 0xE0: return 0x20;
			case 0xE1: return 0x21;
			case 0xE2: return 0x22;
			case 0xE3: return 0x23;
			case 0xE4: return 0x24;
			case 0xE5: return 0x25;
			case 0xE6: return 0x26;
			case 0xE7: return 0x27;
			case 0xE8: return 0x28;
			case 0xE9: return 0x29;
			case 0xEA: return 0x2A;
			case 0xEB: return 0x2B;
			case 0xEC: return 0x2C;
			case 0xED: return 0x2D;
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
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7F) return input - 0x5D + 0x5D;
			if (input >= 0xA1 && input <= 0xDF) return input - 0xA1 + 0xFF61;
			switch (input) {
			case 0x5C: return 0xA5L;
			case 0x80: return 0x5CL;
			case 0xA0: return 0xA0L;
			case 0xFD: return 0xA9L;
			case 0xFE: return 0x2122L;
			case 0xFF: return 0xF87F2026L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON1140[input - 0x40];
			return 0;
		}
		private long getOutput2(int input) {
			if (input >= 0x60 && input <= 0x79) return input - 0x60 + 0xFF21;
			if (input >= 0x81 && input <= 0x9A) return input - 0x81 + 0xFF41;
			if (input >= 0x9F && input <= 0xF1) return input - 0x9F + 0x3041;
			switch (input) {
			case 0x4F: return 0xFF10L;
			case 0x50: return 0xFF11L;
			case 0x51: return 0xFF12L;
			case 0x52: return 0xFF13L;
			case 0x53: return 0xFF14L;
			case 0x54: return 0xFF15L;
			case 0x55: return 0xFF16L;
			case 0x56: return 0xFF17L;
			case 0x57: return 0xFF18L;
			case 0x58: return 0xFF19L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0x30A1;
			if (input >= 0x80 && input <= 0x96) return input - 0x80 + 0x30E0;
			if (input >= 0x9F && input <= 0xAF) return input - 0x9F + 0x391;
			if (input >= 0xBF && input <= 0xCF) return input - 0xBF + 0x3B1;
			switch (input) {
			case 0xB0: return 0x3A3L;
			case 0xB1: return 0x3A4L;
			case 0xB2: return 0x3A5L;
			case 0xB3: return 0x3A6L;
			case 0xB4: return 0x3A7L;
			case 0xB5: return 0x3A8L;
			case 0xB6: return 0x3A9L;
			case 0xD0: return 0x3C3L;
			case 0xD1: return 0x3C4L;
			case 0xD2: return 0x3C5L;
			case 0xD3: return 0x3C6L;
			case 0xD4: return 0x3C7L;
			case 0xD5: return 0x3C8L;
			case 0xD6: return 0x3C9L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0x47 && input <= 0x60) return input - 0x47 + 0x416;
			if (input >= 0x80 && input <= 0x91) return input - 0x80 + 0x43E;
			if (input >= 0x9F && input <= 0xBE) return CommonSubtables.COMMON192[input - 0x9F];
			switch (input) {
			case 0x40: return 0x410L;
			case 0x41: return 0x411L;
			case 0x42: return 0x412L;
			case 0x43: return 0x413L;
			case 0x44: return 0x414L;
			case 0x45: return 0x415L;
			case 0x46: return 0x401L;
			case 0x70: return 0x430L;
			case 0x71: return 0x431L;
			case 0x72: return 0x432L;
			case 0x73: return 0x433L;
			case 0x74: return 0x434L;
			case 0x75: return 0x435L;
			case 0x76: return 0x451L;
			case 0x77: return 0x436L;
			case 0x78: return 0x437L;
			case 0x79: return 0x438L;
			case 0x7A: return 0x439L;
			case 0x7B: return 0x43AL;
			case 0x7C: return 0x43BL;
			case 0x7D: return 0x43CL;
			case 0x7E: return 0x43DL;
			}
			return 0;
		}
		private static final long[] GETOUTPUT5_7C = getOutput5_7C();
		private static final long[] getOutput5_7C() {
			return new long[] {
				0x2776L, 0x2777L, 0x2778L, 0, 0x2779L, 0x277AL, 0x277BL, 0x277CL, 0x277DL, 0x277EL, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x2E0030F860L, 0x2488L, 0x2489L, 0x248AL, 0x248BL, 0x248CL, 0x248DL, 0x248EL, 0x248FL, 0x2490L, 0,
				0, 0, 0, 0x2160L, 0x2161L, 0x2162L, 0x2163L, 0x2164L, 0x2165L, 0x2166L, 0x2167L, 0x2168L, 0x2169L, 0x216AL, 0x216BL, 0xDC00L,
				0x5600490058F861L, 0x560058F860L, 0, 0, 0, 0, 0, 0x2170L, 0x2171L, 0x2172L, 0x2173L, 0x2174L, 0x2175L, 0x2176L, 0x2177L, 0x2178L,
				0x2179L, 0x217AL, 0x217BL, 0xDC01L, 0x7600690078F861L, 0x760078F860L,
			};
		}
		private long getOutput5(int input) {
			if (input >= 0x40 && input <= 0x53) return input - 0x40 + 0x2460;
			if (input >= 0x5E && input <= 0x71) return input - 0x5E + 0x2474;
			if (input >= 0x7C && input <= 0xC1) return GETOUTPUT5_7C[input - 0x7C];
			if (input >= 0xDB && input <= 0xF4) return input - 0xDB + 0x249C;
			return 0;
		}
		private static final long[] GETOUTPUT6_40 = getOutput6_40();
		private static final long[] getOutput6_40() {
			return new long[] {
				0x339CL, 0x339FL, 0x339DL, 0x33A0L, 0x33A4L, 0xF87FFF4DL, 0x33A1L, 0x33A5L, 0x339EL, 0x33A2L, 0x338EL, 0xF87FFF47L, 0x338FL, 0x33C4L, 0x3396L, 0x3397L,
				0x2113L, 0x3398L, 0x33B3L, 0x33B2L, 0x33B1L, 0x33B0L, 0x2109L, 0x33D4L, 0x33CBL, 0x3390L, 0x3385L, 0x3386L, 0x3387L, 0x420054F860L,
			};
		}
		private static final long[] GETOUTPUT6_C7 = getOutput6_C7();
		private static final long[] getOutput6_C7() {
			return new long[] {
				0x261EL, 0x261CL, 0x261DL, 0x261FL, 0x21C6L, 0x21C4L, 0x21C5L, 0x21912193F860L, 0x21E8L, 0x21E6L, 0x21E7L, 0x21E9L, 0xF87A21E8L, 0xF87A21E6L, 0xF87A21E7L, 0xF87A21E9L,
			};
		}
		private long getOutput6(int input) {
			if (input >= 0x40 && input <= 0x5D) return GETOUTPUT6_40[input - 0x40];
			if (input >= 0xC7 && input <= 0xD6) return GETOUTPUT6_C7[input - 0xC7];
			switch (input) {
			case 0x9B: return 0x2116L;
			case 0x9C: return 0x33CDL;
			case 0x9D: return 0x2121L;
			case 0x9E: return 0x5800410046F861L;
			case 0x9F: return 0x2664L;
			case 0xA0: return 0x2667L;
			case 0xA1: return 0x2661L;
			case 0xA2: return 0x2662L;
			case 0xA3: return 0x2660L;
			case 0xA4: return 0x2663L;
			case 0xA5: return 0x2665L;
			case 0xA6: return 0x2666L;
			case 0xB3: return 0x3020L;
			case 0xB4: return 0x260EL;
			case 0xB5: return 0x3004L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT7_40 = getOutput7_40();
		private static final char[] getOutput7_40() {
			return "\u3230\u322A\u322B\u322C\u322D\u322E\u322F\u3240\u3237\u3242\u3243\u3239\u323A\u3231\u323E\u3234\u3232\u323B\u3236\u3233\u3235\u323C\u323D\u323F\u3238".toCharArray();
		}
		private static final int[] GETOUTPUT7_91 = getOutput7_91();
		private static final int[] getOutput7_91() {
			return new int[] {
				0x20DD5927, 0x20DD5C0F, 0x32A4, 0x32A5, 0x32A6, 0x32A7, 0x32A8, 0x32A9, 0x3296, 0x329D, 0x3298, 0x329E, 0x20DD63A7, 0x3299, 0x3349, 0x3322,
				0x334D, 0x3314, 0x3316, 0x3305, 0x3333, 0x334E, 0x3303, 0x3336, 0x3318, 0x3315, 0x3327, 0x3351, 0x334A, 0x3339, 0x3357, 0x330D,
				0x3342, 0x3323, 0x3326, 0x333B, 0x332B, 0, 0, 0, 0, 0, 0, 0, 0x3300, 0x331E, 0x332A, 0x3331,
				0x3347,
			};
		}
		private long getOutput7(int input) {
			if (input >= 0x40 && input <= 0x58) return GETOUTPUT7_40[input - 0x40];
			if (input >= 0x91 && input <= 0xC1) return GETOUTPUT7_91[input - 0x91];
			switch (input) {
			case 0xE5: return 0x337EL;
			case 0xE6: return 0x337DL;
			case 0xE7: return 0x337CL;
			case 0xE8: return 0x337BL;
			case 0xFA: return 0x337FL;
			case 0xFB: return 0xDC02L;
			case 0xFC: return 0xDC03L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0x9F && input <= 0xFC) return CommonSubtables.COMMON193[input - 0x9F];
			switch (input) {
			case 0x40: return 0x222EL;
			case 0x41: return 0x221FL;
			case 0x42: return 0x22BFL;
			case 0x54: return 0x301DL;
			case 0x55: return 0x301FL;
			case 0x68: return 0x3094L;
			case 0x6A: return 0x30F7L;
			case 0x6B: return 0x30F8L;
			case 0x6C: return 0x30F9L;
			case 0x6D: return 0x30FAL;
			}
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON386[input - 0x40];
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON387[input - 0x40];
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON388[input - 0x40];
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON389[input - 0x40];
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON390[input - 0x40];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON391[input - 0x40];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON303[input - 0x40];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON392[input - 0x40];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON393[input - 0x40];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON394[input - 0x40];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON395[input - 0x40];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON396[input - 0x40];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON397[input - 0x40];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON398[input - 0x40];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON399[input - 0x40];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0x40 && input <= 0x72) return CommonSubtables.COMMON224[input - 0x40];
			if (input >= 0x9F && input <= 0xFC) return CommonSubtables.COMMON225[input - 0x9F];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON314[input - 0x40];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON400[input - 0x40];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON316[input - 0x40];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON317[input - 0x40];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON401[input - 0x40];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON402[input - 0x40];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON403[input - 0x40];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON404[input - 0x40];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON405[input - 0x40];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON406[input - 0x40];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON324[input - 0x40];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON325[input - 0x40];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON407[input - 0x40];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON408[input - 0x40];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON409[input - 0x40];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON410[input - 0x40];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON411[input - 0x40];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0x40 && input <= 0xA4) return CommonSubtables.COMMON412[input - 0x40];
			return 0;
		}
		private static final int[] GETOUTPUT43_41 = getOutput43_41();
		private static final int[] getOutput43_41() {
			return new int[] {
				0xF87E3001, 0xF87E3002, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xF87EFFE3,
				0xFE33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xF87E30FC, 0xFE31, 0xF87E2010, 0, 0, 0xF87E301C,
				0xF87E2016, 0xF87EFF5C, 0xF87E2026, 0xFE30, 0, 0, 0, 0, 0xFE35, 0xFE36, 0xFE39, 0xFE3A, 0xF87EFF3B, 0xF87EFF3D, 0xFE37, 0xFE38,
				0xFE3F, 0xFE40, 0xFE3D, 0xFE3E, 0xFE41, 0xFE42, 0xFE43, 0xFE44, 0xFE3B, 0xFE3C, 0, 0, 0, 0, 0, 0,
				0xF87EFF1D,
			};
		}
		private long getOutput43(int input) {
			if (input >= 0x41 && input <= 0x81) return GETOUTPUT43_41[input - 0x41];
			return 0;
		}
		private long getOutput44(int input) {
			switch (input) {
			case 0x9F: return 0xF87E3041L;
			case 0xA1: return 0xF87E3043L;
			case 0xA3: return 0xF87E3045L;
			case 0xA5: return 0xF87E3047L;
			case 0xA7: return 0xF87E3049L;
			case 0xC1: return 0xF87E3063L;
			case 0xE1: return 0xF87E3083L;
			case 0xE3: return 0xF87E3085L;
			case 0xE5: return 0xF87E3087L;
			case 0xEC: return 0xF87E308EL;
			}
			return 0;
		}
		private long getOutput45(int input) {
			switch (input) {
			case 0x40: return 0xF87E30A1L;
			case 0x42: return 0xF87E30A3L;
			case 0x44: return 0xF87E30A5L;
			case 0x46: return 0xF87E30A7L;
			case 0x48: return 0xF87E30A9L;
			case 0x62: return 0xF87E30C3L;
			case 0x83: return 0xF87E30E3L;
			case 0x85: return 0xF87E30E5L;
			case 0x87: return 0xF87E30E7L;
			case 0x8E: return 0xF87E30EEL;
			case 0x95: return 0xF87E30F5L;
			case 0x96: return 0xF87E30F6L;
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
			case 6: return getOutput6(input);
			case 7: return getOutput7(input);
			case 8: return getOutput8(input);
			case 9: return getOutput9(input);
			case 10: return getOutput10(input);
			case 11: return getOutput11(input);
			case 12: return getOutput12(input);
			case 13: return getOutput13(input);
			case 14: return getOutput14(input);
			case 15: return getOutput15(input);
			case 16: return getOutput16(input);
			case 17: return getOutput17(input);
			case 18: return getOutput18(input);
			case 19: return getOutput19(input);
			case 20: return getOutput20(input);
			case 21: return getOutput21(input);
			case 22: return getOutput22(input);
			case 23: return getOutput23(input);
			case 24: return getOutput24(input);
			case 25: return getOutput25(input);
			case 26: return getOutput26(input);
			case 27: return getOutput27(input);
			case 28: return getOutput28(input);
			case 29: return getOutput29(input);
			case 30: return getOutput30(input);
			case 31: return getOutput31(input);
			case 32: return getOutput32(input);
			case 33: return getOutput33(input);
			case 34: return getOutput34(input);
			case 35: return getOutput35(input);
			case 36: return getOutput36(input);
			case 37: return getOutput37(input);
			case 38: return getOutput38(input);
			case 39: return getOutput39(input);
			case 40: return getOutput40(input);
			case 41: return getOutput41(input);
			case 42: return getOutput42(input);
			case 43: return getOutput43(input);
			case 44: return getOutput44(input);
			case 45: return getOutput45(input);
			default: return 0;
			}
		}
		private static final char[][] GETLONGOUTPUT = getLongOutput();
		private static final char[][] getLongOutput() {
			return new char[][] {
				"\uF862XIII".toCharArray(),
				"\uF862xiii".toCharArray(),
				"\uF862\u6709\u9650\u4F1A\u793E".toCharArray(),
				"\uF862\u8CA1\u56E3\u6CD5\u4EBA".toCharArray(),
			};
		}
		protected char[] getLongOutput(int output) {
			return GETLONGOUTPUT[output];
		}
	}

	private static final class XMacJapaneseCharsetEncoder extends TableCharsetEncoder {
		private XMacJapaneseCharsetEncoder(Charset cs) {
			super(cs, 1.9652f, 2f, new byte[]{63}, 5);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x2010: return 0x1;
			case 0x2016: return 0x2;
			case 0x2026: return 0x3;
			case 0x21E6: return 0x4;
			case 0x21E7: return 0x5;
			case 0x21E8: return 0x6;
			case 0x21E9: return 0x7;
			case 0x3001: return 0x8;
			case 0x3002: return 0x9;
			case 0x301C: return 0xA;
			case 0x3041: return 0xB;
			case 0x3043: return 0xC;
			case 0x3045: return 0xD;
			case 0x3047: return 0xE;
			case 0x3049: return 0xF;
			case 0x3063: return 0x10;
			case 0x3083: return 0x11;
			case 0x3085: return 0x12;
			case 0x3087: return 0x13;
			case 0x308E: return 0x14;
			case 0x30A1: return 0x15;
			case 0x30A3: return 0x16;
			case 0x30A5: return 0x17;
			case 0x30A7: return 0x18;
			case 0x30A9: return 0x19;
			case 0x30C3: return 0x1A;
			case 0x30E3: return 0x1B;
			case 0x30E5: return 0x1C;
			case 0x30E7: return 0x1D;
			case 0x30EE: return 0x1E;
			case 0x30F5: return 0x1F;
			case 0x30F6: return 0x20;
			case 0x30FC: return 0x21;
			case 0x5927: return 0x22;
			case 0x5C0F: return 0x23;
			case 0x63A7: return 0x24;
			case 0xF860: return 0x25;
			case 0xF861: return 0x2B;
			case 0xF862: return 0x32;
			case 0xFF1D: return 0x3F;
			case 0xFF3B: return 0x40;
			case 0xFF3D: return 0x41;
			case 0xFF47: return 0x42;
			case 0xFF4D: return 0x43;
			case 0xFF5C: return 0x44;
			case 0xFFE3: return 0x45;
			}
			return 0;
		}
		private int getNextState37(int input) {
			switch (input) {
			case 0x30: return 0x26;
			case 0x54: return 0x27;
			case 0x58: return 0x28;
			case 0x78: return 0x29;
			case 0x2193: return 0x2A;
			}
			return 0;
		}
		private int getNextState43(int input) {
			switch (input) {
			case 0x46: return 0x2C;
			case 0x58: return 0x2E;
			case 0x78: return 0x30;
			}
			return 0;
		}
		private int getNextState44(int input) {
			switch (input) {
			case 0x41: return 0x2D;
			}
			return 0;
		}
		private int getNextState46(int input) {
			switch (input) {
			case 0x49: return 0x2F;
			}
			return 0;
		}
		private int getNextState48(int input) {
			switch (input) {
			case 0x69: return 0x31;
			}
			return 0;
		}
		private int getNextState50(int input) {
			switch (input) {
			case 0x58: return 0x33;
			case 0x78: return 0x36;
			case 0x6709: return 0x39;
			case 0x8CA1: return 0x3C;
			}
			return 0;
		}
		private int getNextState51(int input) {
			switch (input) {
			case 0x49: return 0x34;
			}
			return 0;
		}
		private int getNextState52(int input) {
			switch (input) {
			case 0x49: return 0x35;
			}
			return 0;
		}
		private int getNextState54(int input) {
			switch (input) {
			case 0x69: return 0x37;
			}
			return 0;
		}
		private int getNextState55(int input) {
			switch (input) {
			case 0x69: return 0x38;
			}
			return 0;
		}
		private int getNextState57(int input) {
			switch (input) {
			case 0x9650: return 0x3A;
			}
			return 0;
		}
		private int getNextState58(int input) {
			switch (input) {
			case 0x4F1A: return 0x3B;
			}
			return 0;
		}
		private int getNextState60(int input) {
			switch (input) {
			case 0x56E3: return 0x3D;
			}
			return 0;
		}
		private int getNextState61(int input) {
			switch (input) {
			case 0x6CD5: return 0x3E;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 37: return getNextState37(input);
			case 43: return getNextState43(input);
			case 44: return getNextState44(input);
			case 46: return getNextState46(input);
			case 48: return getNextState48(input);
			case 50: return getNextState50(input);
			case 51: return getNextState51(input);
			case 52: return getNextState52(input);
			case 54: return getNextState54(input);
			case 55: return getNextState55(input);
			case 57: return getNextState57(input);
			case 58: return getNextState58(input);
			case 60: return getNextState60(input);
			case 61: return getNextState61(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_2160 = getOutput0_2160();
		private static final char[] getOutput0_2160() {
			return "\u9F85\uA085\uA185\uA285\uA385\uA485\uA585\uA685\uA785\uA885\uA985\uAA85\u0000\u0000\u0000\u0000\uB385\uB485\uB585\uB685\uB785\uB885\uB985\uBA85\uBB85\uBC85\uBD85\uBE85".toCharArray();
		}
		private static final char[] GETOUTPUT0_2200 = getOutput0_2200();
		private static final char[] getOutput0_2200() {
			return "\uCD81\u0000\uDD81\uCE81\u0000\u0000\u0000\uDE81\uB881\u0000\u0000\uB981\u0000\u0000\u0000\u0000\u0000\u0000\u7C81\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uE381\u0000\u0000\uE581\u8781\u4188\uDA81\u0000\u0000\u0000\u0000\u0000\u0000\uC881\uC981\uBF81\uBE81\uE781\uE881\u0000\u4088\u0000\u0000\u0000\u0000\u0000\u8881\uE681\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uE481".toCharArray();
		}
		private static final char[] GETOUTPUT0_2460 = getOutput0_2460();
		private static final char[] getOutput0_2460() {
			return "\u4085\u4185\u4285\u4385\u4485\u4585\u4685\u4785\u4885\u4985\u4A85\u4B85\u4C85\u4D85\u4E85\u4F85\u5085\u5185\u5285\u5385\u5E85\u5F85\u6085\u6185\u6285\u6385\u6485\u6585\u6685\u6785\u6885\u6985\u6A85\u6B85\u6C85\u6D85\u6E85\u6F85\u7085\u7185\u9285\u9385\u9485\u9585\u9685\u9785\u9885\u9985\u9A85\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uDB85\uDC85\uDD85\uDE85\uDF85\uE085\uE185\uE285\uE385\uE485\uE585\uE685\uE785\uE885\uE985\uEA85\uEB85\uEC85\uED85\uEE85\uEF85\uF085\uF185\uF285\uF385\uF485".toCharArray();
		}
		private static final char[] GETOUTPUT0_3000 = getOutput0_3000();
		private static final char[] getOutput0_3000() {
			return "\u4081\u4181\u4281\u5681\uB586\u5881\u5981\u5A81\u7181\u7281\u7381\u7481\u7581\u7681\u7781\u7881\u7981\u7A81\uA781\uAC81\u6B81\u6C81\u0000\u0000\u0000\u0000\u0000\u0000\u6081\u5488\u0000\u5588\uB386".toCharArray();
		}
		private static final char[] GETOUTPUT0_3041 = getOutput0_3041();
		private static final char[] getOutput0_3041() {
			return "\u9F82\uA082\uA182\uA282\uA382\uA482\uA582\uA682\uA782\uA882\uA982\uAA82\uAB82\uAC82\uAD82\uAE82\uAF82\uB082\uB182\uB282\uB382\uB482\uB582\uB682\uB782\uB882\uB982\uBA82\uBB82\uBC82\uBD82\uBE82\uBF82\uC082\uC182\uC282\uC382\uC482\uC582\uC682\uC782\uC882\uC982\uCA82\uCB82\uCC82\uCD82\uCE82\uCF82\uD082\uD182\uD282\uD382\uD482\uD582\uD682\uD782\uD882\uD982\uDA82\uDB82\uDC82\uDD82\uDE82\uDF82\uE082\uE182\uE282\uE382\uE482\uE582\uE682\uE782\uE882\uE982\uEA82\uEB82\uEC82\uED82\uEE82\uEF82\uF082\uF182\u6888\u0000\u0000\u0000\u0000\u0000\u0000\u4A81\u4B81\u5481\u5581\u0000\u0000\u4083\u4183\u4283\u4383\u4483\u4583\u4683\u4783\u4883\u4983\u4A83\u4B83\u4C83\u4D83\u4E83\u4F83\u5083\u5183\u5283\u5383\u5483\u5583\u5683\u5783\u5883\u5983\u5A83\u5B83\u5C83\u5D83\u5E83\u5F83\u6083\u6183\u6283\u6383\u6483\u6583\u6683\u6783\u6883\u6983\u6A83\u6B83\u6C83\u6D83\u6E83\u6F83\u7083\u7183\u7283\u7383\u7483\u7583\u7683\u7783\u7883\u7983\u7A83\u7B83\u7C83\u7D83\u7E83\u8083\u8183\u8283\u8383\u8483\u8583\u8683\u8783\u8883\u8983\u8A83\u8B83\u8C83\u8D83\u8E83\u8F83\u9083\u9183\u9283\u9383\u9483\u9583\u9683\u6A88\u6B88\u6C88\u6D88\u4581\u5B81\u5281\u5381".toCharArray();
		}
		private static final char[] GETOUTPUT0_322A = getOutput0_322A();
		private static final char[] getOutput0_322A() {
			return "\u4187\u4287\u4387\u4487\u4587\u4687\u4087\u4D87\u5087\u5387\u4F87\u5487\u5287\u4887\u5887\u4B87\u4C87\u5187\u5587\u5687\u4E87\u5787\u4787\u0000\u4987\u4A87".toCharArray();
		}
		private static final char[] GETOUTPUT0_3300 = getOutput0_3300();
		private static final char[] getOutput0_3300() {
			return "\uBD87\u0000\u0000\uA787\u0000\uA487\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uB087\u0000\u0000\u0000\u0000\u0000\u0000\uA287\uAA87\uA387\u0000\uA987\u0000\u0000\u0000\u0000\u0000\uBE87\u0000\u0000\u0000\uA087\uB287\u0000\u0000\uB387\uAB87\u0000\u0000\uBF87\uB587\u0000\u0000\u0000\u0000\u0000\uC087\u0000\uA587\u0000\u0000\uA887\u0000\u0000\uAE87\u0000\uB487\u0000\u0000\u0000\u0000\u0000\u0000\uB187\u0000\u0000\u0000\u0000\uC187\u0000\u9F87\uAD87\u0000\u0000\uA187\uA687\u0000\u0000\uAC87\u0000\u0000\u0000\u0000\u0000\uAF87".toCharArray();
		}
		private static final char[] GETOUTPUT0_337B = getOutput0_337B();
		private static final char[] getOutput0_337B() {
			return "\uE887\uE787\uE687\uE587\uFA87\u0000\u0000\u0000\u0000\u0000\u5A86\u5B86\u5C86\u0000\u0000\u0000\u0000\u0000\u0000\u4A86\u4C86\u5986\u0000\u0000\u0000\u0000\u0000\u4E86\u4F86\u5186\u0000\u0000\u0000\u4086\u4286\u4886\u4186\u4386\u4686\u4986\u0000\u4486\u4786\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u5586\u5486\u5386\u5286\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u4D86\u0000\u0000\u0000\u0000\u0000\u0000\u5886\u0000\u9C86\u0000\u0000\u0000\u0000\u0000\u0000\u5786".toCharArray();
		}
		private static final char[] GETOUTPUT0_FE30 = getOutput0_FE30();
		private static final char[] getOutput0_FE30() {
			return "\u64EB\u5CEB\u0000\u51EB\u0000\u69EB\u6AEB\u6FEB\u70EB\u6BEB\u6CEB\u79EB\u7AEB\u73EB\u74EB\u71EB\u72EB\u75EB\u76EB\u77EB\u78EB".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7F) return input - 0x5D + 0x5D;
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON334[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON335[input - 0x401];
			if (input >= 0x2160 && input <= 0x217B) return GETOUTPUT0_2160[input - 0x2160];
			if (input >= 0x2200 && input <= 0x223D) return GETOUTPUT0_2200[input - 0x2200];
			if (input >= 0x2460 && input <= 0x24B5) return GETOUTPUT0_2460[input - 0x2460];
			if (input >= 0x2500 && input <= 0x254B) return CommonSubtables.COMMON339[input - 0x2500];
			if (input >= 0x3000 && input <= 0x3020) return GETOUTPUT0_3000[input - 0x3000];
			if (input >= 0x3041 && input <= 0x30FE) return GETOUTPUT0_3041[input - 0x3041];
			if (input >= 0x322A && input <= 0x3243) return GETOUTPUT0_322A[input - 0x322A];
			if (input >= 0x3300 && input <= 0x3357) return GETOUTPUT0_3300[input - 0x3300];
			if (input >= 0x337B && input <= 0x33D4) return GETOUTPUT0_337B[input - 0x337B];
			if (input >= 0x4E00 && input <= 0x4F1D) return CommonSubtables.COMMON1141[input - 0x4E00];
			if (input >= 0x4F2F && input <= 0x509A) return CommonSubtables.COMMON1142[input - 0x4F2F];
			if (input >= 0x50AC && input <= 0x5384) return CommonSubtables.COMMON1143[input - 0x50AC];
			if (input >= 0x5396 && input <= 0x5516) return CommonSubtables.COMMON1144[input - 0x5396];
			if (input >= 0x552E && input <= 0x5563) return CommonSubtables.COMMON1145[input - 0x552E];
			if (input >= 0x557B && input <= 0x55E4) return CommonSubtables.COMMON1146[input - 0x557B];
			if (input >= 0x55F7 && input <= 0x576A) return CommonSubtables.COMMON1147[input - 0x55F7];
			if (input >= 0x577F && input <= 0x5A6C) return CommonSubtables.COMMON1148[input - 0x577F];
			if (input >= 0x5ABC && input <= 0x5C79) return CommonSubtables.COMMON1149[input - 0x5ABC];
			if (input >= 0x5C8C && input <= 0x5CC7) return CommonSubtables.COMMON1150[input - 0x5C8C];
			if (input >= 0x5CD9 && input <= 0x5D29) return CommonSubtables.COMMON1151[input - 0x5CD9];
			if (input >= 0x5D4B && input <= 0x61D0) return CommonSubtables.COMMON1152[input - 0x5D4B];
			if (input >= 0x61E3 && input <= 0x6505) return CommonSubtables.COMMON1153[input - 0x61E3];
			if (input >= 0x6518 && input <= 0x6BF3) return CommonSubtables.COMMON1154[input - 0x6518];
			if (input >= 0x6C08 && input <= 0x6CF3) return CommonSubtables.COMMON1155[input - 0x6C08];
			if (input >= 0x6D0B && input <= 0x6D45) return CommonSubtables.COMMON1156[input - 0x6D0B];
			if (input >= 0x6D59 && input <= 0x6D9C) return CommonSubtables.COMMON1157[input - 0x6D59];
			if (input >= 0x6DAF && input <= 0x7099) return CommonSubtables.COMMON1158[input - 0x6DAF];
			if (input >= 0x70F1 && input <= 0x7396) return CommonSubtables.COMMON1159[input - 0x70F1];
			if (input >= 0x73A9 && input <= 0x7409) return CommonSubtables.COMMON1160[input - 0x73A9];
			if (input >= 0x7455 && input <= 0x748B) return CommonSubtables.COMMON1161[input - 0x7455];
			if (input >= 0x749E && input <= 0x760D) return CommonSubtables.COMMON1162[input - 0x749E];
			if (input >= 0x761F && input <= 0x769A) return CommonSubtables.COMMON1163[input - 0x761F];
			if (input >= 0x76AE && input <= 0x7747) return CommonSubtables.COMMON1164[input - 0x76AE];
			if (input >= 0x775A && input <= 0x7845) return CommonSubtables.COMMON1165[input - 0x775A];
			if (input >= 0x785D && input <= 0x7E9C) return CommonSubtables.COMMON1166[input - 0x785D];
			if (input >= 0x7F36 && input <= 0x8358) return CommonSubtables.COMMON1167[input - 0x7F36];
			if (input >= 0x8373 && input <= 0x84DA) return CommonSubtables.COMMON1168[input - 0x8373];
			if (input >= 0x84EC && input <= 0x878D) return CommonSubtables.COMMON1169[input - 0x84EC];
			if (input >= 0x879F && input <= 0x89C0) return CommonSubtables.COMMON1170[input - 0x879F];
			if (input >= 0x89D2 && input <= 0x8B9A) return CommonSubtables.COMMON1171[input - 0x89D2];
			if (input >= 0x8C37 && input <= 0x8D16) return CommonSubtables.COMMON1172[input - 0x8C37];
			if (input >= 0x8D64 && input <= 0x8F64) return CommonSubtables.COMMON1173[input - 0x8D64];
			if (input >= 0x8F9B && input <= 0x9091) return CommonSubtables.COMMON1174[input - 0x8F9B];
			if (input >= 0x90A3 && input <= 0x9119) return CommonSubtables.COMMON1175[input - 0x90A3];
			if (input >= 0x9149 && input <= 0x92B9) return CommonSubtables.COMMON1176[input - 0x9149];
			if (input >= 0x92E4 && input <= 0x93E8) return CommonSubtables.COMMON1177[input - 0x92E4];
			if (input >= 0x9403 && input <= 0x9481) return CommonSubtables.COMMON1178[input - 0x9403];
			if (input >= 0x9577 && input <= 0x95E5) return CommonSubtables.COMMON1179[input - 0x9577];
			if (input >= 0x961C && input <= 0x9874) return CommonSubtables.COMMON1180[input - 0x961C];
			if (input >= 0x98DB && input <= 0x9957) return CommonSubtables.COMMON1181[input - 0x98DB];
			if (input >= 0x9996 && input <= 0x9A6B) return CommonSubtables.COMMON1182[input - 0x9996];
			if (input >= 0x9AA8 && input <= 0x9B06) return CommonSubtables.COMMON1183[input - 0x9AA8];
			if (input >= 0x9B18 && input <= 0x9B5A) return CommonSubtables.COMMON376[input - 0x9B18];
			if (input >= 0x9B6F && input <= 0x9C78) return CommonSubtables.COMMON1184[input - 0x9B6F];
			if (input >= 0x9CE5 && input <= 0x9DFD) return CommonSubtables.COMMON1185[input - 0x9CE5];
			if (input >= 0x9E75 && input <= 0x9F77) return CommonSubtables.COMMON1186[input - 0x9E75];
			if (input >= 0xFE30 && input <= 0xFE44) return GETOUTPUT0_FE30[input - 0xFE30];
			if (input >= 0xFF61 && input <= 0xFF9F) return input - 0xFF61 + 0xA1;
			if (input >= 0xFF01 && input <= 0xFF5D) return CommonSubtables.COMMON1187[input - 0xFF01];
			switch (input) {
			case 0x5C: return 0x80L;
			case 0xA0: return 0xA0L;
			case 0xA2: return 0x9181L;
			case 0xA3: return 0x9281L;
			case 0xA5: return 0x5CL;
			case 0xA7: return 0x9881L;
			case 0xA8: return 0x4E81L;
			case 0xA9: return 0xFDL;
			case 0xAC: return 0xCA81L;
			case 0xB0: return 0x8B81L;
			case 0xB1: return 0x7D81L;
			case 0xB4: return 0x4C81L;
			case 0xB6: return 0xF781L;
			case 0xD7: return 0x7E81L;
			case 0xF7: return 0x8081L;
			case 0x2010: return 0x5D81L;
			case 0x2014: return 0x5C81L;
			case 0x2016: return 0x6181L;
			case 0x2018: return 0x6581L;
			case 0x2019: return 0x6681L;
			case 0x201C: return 0x6781L;
			case 0x201D: return 0x6881L;
			case 0x2020: return 0xF581L;
			case 0x2021: return 0xF681L;
			case 0x2025: return 0x6481L;
			case 0x2026: return 0x6381L;
			case 0x2030: return 0xF181L;
			case 0x2032: return 0x8C81L;
			case 0x2033: return 0x8D81L;
			case 0x203B: return 0xA681L;
			case 0x2103: return 0x8E81L;
			case 0x2109: return 0x5686L;
			case 0x2113: return 0x5086L;
			case 0x2116: return 0x9B86L;
			case 0x2121: return 0x9D86L;
			case 0x2122: return 0xFEL;
			case 0x212B: return 0xF081L;
			case 0x2190: return 0xA981L;
			case 0x2191: return 0xAA81L;
			case 0x2192: return 0xA881L;
			case 0x2193: return 0xAB81L;
			case 0x21C4: return 0xCC86L;
			case 0x21C5: return 0xCD86L;
			case 0x21C6: return 0xCB86L;
			case 0x21D2: return 0xCB81L;
			case 0x21D4: return 0xCC81L;
			case 0x21E6: return 0xD086L;
			case 0x21E7: return 0xD186L;
			case 0x21E8: return 0xCF86L;
			case 0x21E9: return 0xD286L;
			case 0x2252: return 0xE081L;
			case 0x2260: return 0x8281L;
			case 0x2261: return 0xDF81L;
			case 0x2266: return 0x8581L;
			case 0x2267: return 0x8681L;
			case 0x226A: return 0xE181L;
			case 0x226B: return 0xE281L;
			case 0x2282: return 0xBC81L;
			case 0x2283: return 0xBD81L;
			case 0x2286: return 0xBA81L;
			case 0x2287: return 0xBB81L;
			case 0x22A5: return 0xDB81L;
			case 0x22BF: return 0x4288L;
			case 0x2312: return 0xDC81L;
			case 0x25A0: return 0xA181L;
			case 0x25A1: return 0xA081L;
			case 0x25B2: return 0xA381L;
			case 0x25B3: return 0xA281L;
			case 0x25BC: return 0xA581L;
			case 0x25BD: return 0xA481L;
			case 0x25C6: return 0x9F81L;
			case 0x25C7: return 0x9E81L;
			case 0x25CB: return 0x9B81L;
			case 0x25CE: return 0x9D81L;
			case 0x25CF: return 0x9C81L;
			case 0x25EF: return 0xFC81L;
			case 0x2605: return 0x9A81L;
			case 0x2606: return 0x9981L;
			case 0x260E: return 0xB486L;
			case 0x261C: return 0xC886L;
			case 0x261D: return 0xC986L;
			case 0x261E: return 0xC786L;
			case 0x261F: return 0xCA86L;
			case 0x2640: return 0x8A81L;
			case 0x2642: return 0x8981L;
			case 0x2660: return 0xA386L;
			case 0x2661: return 0xA186L;
			case 0x2662: return 0xA286L;
			case 0x2663: return 0xA486L;
			case 0x2664: return 0x9F86L;
			case 0x2665: return 0xA586L;
			case 0x2666: return 0xA686L;
			case 0x2667: return 0xA086L;
			case 0x266A: return 0xF481L;
			case 0x266D: return 0xF381L;
			case 0x266F: return 0xF281L;
			case 0x2776: return 0x7C85L;
			case 0x2777: return 0x7D85L;
			case 0x2778: return 0x7E85L;
			case 0x2779: return 0x8085L;
			case 0x277A: return 0x8185L;
			case 0x277B: return 0x8285L;
			case 0x277C: return 0x8385L;
			case 0x277D: return 0x8485L;
			case 0x277E: return 0x8585L;
			case 0x3296: return 0x9987L;
			case 0x3298: return 0x9B87L;
			case 0x3299: return 0x9E87L;
			case 0x329D: return 0x9A87L;
			case 0x329E: return 0x9C87L;
			case 0x32A4: return 0x9387L;
			case 0x32A5: return 0x9487L;
			case 0x32A6: return 0x9587L;
			case 0x32A7: return 0x9687L;
			case 0x32A8: return 0x9787L;
			case 0x32A9: return 0x9887L;
			case 0x5A7F: return 0xB996L;
			case 0x5A92: return 0x7D94L;
			case 0x5A9A: return 0x5A9BL;
			case 0x5A9B: return 0x5195L;
			case 0x70AC: return 0x78E0L;
			case 0x70AD: return 0x5992L;
			case 0x70AE: return 0x7BE0L;
			case 0x70AF: return 0x76E0L;
			case 0x70B3: return 0x7AE0L;
			case 0x70B8: return 0x79E0L;
			case 0x70B9: return 0x5F93L;
			case 0x70BA: return 0xD788L;
			case 0x70C8: return 0xF397L;
			case 0x70CB: return 0x7DE0L;
			case 0x70CF: return 0x4789L;
			case 0x70D9: return 0x80E0L;
			case 0x70DD: return 0x7EE0L;
			case 0x70DF: return 0x7CE0L;
			case 0x7422: return 0xF491L;
			case 0x7425: return 0xE6E0L;
			case 0x7432: return 0xE8E0L;
			case 0x7433: return 0xD497L;
			case 0x7434: return 0xD58BL;
			case 0x7435: return 0xFA94L;
			case 0x7436: return 0x6994L;
			case 0x743A: return 0xE9E0L;
			case 0x743F: return 0xEBE0L;
			case 0x7441: return 0xEEE0L;
			case 0x912D: return 0x4193L;
			case 0x9130: return 0xC1E7L;
			case 0x9132: return 0xC0E7L;
			case 0x92CF: return 0xF5E7L;
			case 0x92D2: return 0x4E96L;
			case 0x98A8: return 0x9795L;
			case 0x98AA: return 0x43E9L;
			case 0x98AF: return 0x44E9L;
			case 0x98B1: return 0x45E9L;
			case 0x98B6: return 0x46E9L;
			case 0x98C3: return 0x48E9L;
			case 0x98C4: return 0x47E9L;
			case 0x98C6: return 0x49E9L;
			case 0x9E1A: return 0x5FEAL;
			case 0x9E1B: return 0x60EAL;
			case 0x9E1E: return 0x61EAL;
			case 0x9F8D: return 0xB497L;
			case 0x9F95: return 0x9CEAL;
			case 0x9F9C: return 0x9DEAL;
			case 0x9F9D: return 0x73E2L;
			case 0x9FA0: return 0x9EEAL;
			case 0xFFE3: return 0x5081L;
			case 0xFFE5: return 0x8F81L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xF87E: return 0x5DEBL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xF87E: return 0x61EBL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xF87E: return 0x63EBL;
			case 0xF87F: return 0xFF01L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xF87A: return 0xD486L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xF87A: return 0xD586L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0xF87A: return 0xD386L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0xF87A: return 0xD686L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0xF87E: return 0x41EBL;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0xF87E: return 0x42EBL;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0xF87E: return 0x60EBL;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0xF87E: return 0x9FECL;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0xF87E: return 0xA1ECL;
			}
			return 0;
		}
		private long getOutput13(int input) {
			switch (input) {
			case 0xF87E: return 0xA3ECL;
			}
			return 0;
		}
		private long getOutput14(int input) {
			switch (input) {
			case 0xF87E: return 0xA5ECL;
			}
			return 0;
		}
		private long getOutput15(int input) {
			switch (input) {
			case 0xF87E: return 0xA7ECL;
			}
			return 0;
		}
		private long getOutput16(int input) {
			switch (input) {
			case 0xF87E: return 0xC1ECL;
			}
			return 0;
		}
		private long getOutput17(int input) {
			switch (input) {
			case 0xF87E: return 0xE1ECL;
			}
			return 0;
		}
		private long getOutput18(int input) {
			switch (input) {
			case 0xF87E: return 0xE3ECL;
			}
			return 0;
		}
		private long getOutput19(int input) {
			switch (input) {
			case 0xF87E: return 0xE5ECL;
			}
			return 0;
		}
		private long getOutput20(int input) {
			switch (input) {
			case 0xF87E: return 0xECECL;
			}
			return 0;
		}
		private long getOutput21(int input) {
			switch (input) {
			case 0xF87E: return 0x40EDL;
			}
			return 0;
		}
		private long getOutput22(int input) {
			switch (input) {
			case 0xF87E: return 0x42EDL;
			}
			return 0;
		}
		private long getOutput23(int input) {
			switch (input) {
			case 0xF87E: return 0x44EDL;
			}
			return 0;
		}
		private long getOutput24(int input) {
			switch (input) {
			case 0xF87E: return 0x46EDL;
			}
			return 0;
		}
		private long getOutput25(int input) {
			switch (input) {
			case 0xF87E: return 0x48EDL;
			}
			return 0;
		}
		private long getOutput26(int input) {
			switch (input) {
			case 0xF87E: return 0x62EDL;
			}
			return 0;
		}
		private long getOutput27(int input) {
			switch (input) {
			case 0xF87E: return 0x83EDL;
			}
			return 0;
		}
		private long getOutput28(int input) {
			switch (input) {
			case 0xF87E: return 0x85EDL;
			}
			return 0;
		}
		private long getOutput29(int input) {
			switch (input) {
			case 0xF87E: return 0x87EDL;
			}
			return 0;
		}
		private long getOutput30(int input) {
			switch (input) {
			case 0xF87E: return 0x8EEDL;
			}
			return 0;
		}
		private long getOutput31(int input) {
			switch (input) {
			case 0xF87E: return 0x95EDL;
			}
			return 0;
		}
		private long getOutput32(int input) {
			switch (input) {
			case 0xF87E: return 0x96EDL;
			}
			return 0;
		}
		private long getOutput33(int input) {
			switch (input) {
			case 0xF87E: return 0x5BEBL;
			}
			return 0;
		}
		private long getOutput34(int input) {
			switch (input) {
			case 0x20DD: return 0x9187L;
			}
			return 0;
		}
		private long getOutput35(int input) {
			switch (input) {
			case 0x20DD: return 0x9287L;
			}
			return 0;
		}
		private long getOutput36(int input) {
			switch (input) {
			case 0x20DD: return 0x9D87L;
			}
			return 0;
		}
		private long getOutput38(int input) {
			switch (input) {
			case 0x2E: return 0x9185L;
			}
			return 0;
		}
		private long getOutput39(int input) {
			switch (input) {
			case 0x42: return 0x5D86L;
			}
			return 0;
		}
		private long getOutput40(int input) {
			switch (input) {
			case 0x56: return 0xAD85L;
			}
			return 0;
		}
		private long getOutput41(int input) {
			switch (input) {
			case 0x76: return 0xC185L;
			}
			return 0;
		}
		private long getOutput42(int input) {
			switch (input) {
			case 0x2191: return 0xCE86L;
			}
			return 0;
		}
		private long getOutput45(int input) {
			switch (input) {
			case 0x58: return 0x9E86L;
			}
			return 0;
		}
		private long getOutput47(int input) {
			switch (input) {
			case 0x56: return 0xAC85L;
			}
			return 0;
		}
		private long getOutput49(int input) {
			switch (input) {
			case 0x76: return 0xC085L;
			}
			return 0;
		}
		private long getOutput53(int input) {
			switch (input) {
			case 0x49: return 0xAB85L;
			}
			return 0;
		}
		private long getOutput56(int input) {
			switch (input) {
			case 0x69: return 0xBF85L;
			}
			return 0;
		}
		private long getOutput59(int input) {
			switch (input) {
			case 0x793E: return 0xFB87L;
			}
			return 0;
		}
		private long getOutput62(int input) {
			switch (input) {
			case 0x4EBA: return 0xFC87L;
			}
			return 0;
		}
		private long getOutput63(int input) {
			switch (input) {
			case 0xF87E: return 0x81EBL;
			}
			return 0;
		}
		private long getOutput64(int input) {
			switch (input) {
			case 0xF87E: return 0x6DEBL;
			}
			return 0;
		}
		private long getOutput65(int input) {
			switch (input) {
			case 0xF87E: return 0x6EEBL;
			}
			return 0;
		}
		private long getOutput66(int input) {
			switch (input) {
			case 0xF87F: return 0x4B86L;
			}
			return 0;
		}
		private long getOutput67(int input) {
			switch (input) {
			case 0xF87F: return 0x4586L;
			}
			return 0;
		}
		private long getOutput68(int input) {
			switch (input) {
			case 0xF87E: return 0x62EBL;
			}
			return 0;
		}
		private long getOutput69(int input) {
			switch (input) {
			case 0xF87E: return 0x50EBL;
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
			case 6: return getOutput6(input);
			case 7: return getOutput7(input);
			case 8: return getOutput8(input);
			case 9: return getOutput9(input);
			case 10: return getOutput10(input);
			case 11: return getOutput11(input);
			case 12: return getOutput12(input);
			case 13: return getOutput13(input);
			case 14: return getOutput14(input);
			case 15: return getOutput15(input);
			case 16: return getOutput16(input);
			case 17: return getOutput17(input);
			case 18: return getOutput18(input);
			case 19: return getOutput19(input);
			case 20: return getOutput20(input);
			case 21: return getOutput21(input);
			case 22: return getOutput22(input);
			case 23: return getOutput23(input);
			case 24: return getOutput24(input);
			case 25: return getOutput25(input);
			case 26: return getOutput26(input);
			case 27: return getOutput27(input);
			case 28: return getOutput28(input);
			case 29: return getOutput29(input);
			case 30: return getOutput30(input);
			case 31: return getOutput31(input);
			case 32: return getOutput32(input);
			case 33: return getOutput33(input);
			case 34: return getOutput34(input);
			case 35: return getOutput35(input);
			case 36: return getOutput36(input);
			case 38: return getOutput38(input);
			case 39: return getOutput39(input);
			case 40: return getOutput40(input);
			case 41: return getOutput41(input);
			case 42: return getOutput42(input);
			case 45: return getOutput45(input);
			case 47: return getOutput47(input);
			case 49: return getOutput49(input);
			case 53: return getOutput53(input);
			case 56: return getOutput56(input);
			case 59: return getOutput59(input);
			case 62: return getOutput62(input);
			case 63: return getOutput63(input);
			case 64: return getOutput64(input);
			case 65: return getOutput65(input);
			case 66: return getOutput66(input);
			case 67: return getOutput67(input);
			case 68: return getOutput68(input);
			case 69: return getOutput69(input);
			default: return 0;
			}
		}
	}
}
