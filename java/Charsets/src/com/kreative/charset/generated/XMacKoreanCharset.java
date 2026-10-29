package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacKoreanCharset extends Charset {
	public XMacKoreanCharset() {
		super("x-MacKorean", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacKoreanCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacKoreanCharsetEncoder(this);
	}

	private static final class XMacKoreanCharsetDecoder extends TableCharsetDecoder {
		private XMacKoreanCharsetDecoder(Charset cs) {
			super(cs, 1f, 2.5f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0xB0 && input <= 0xC8) return input - 0xB0 + 0xE;
			if (input >= 0xCA && input <= 0xFD) return input - 0xCA + 0x27;
			switch (input) {
			case 0xA1: return 0x1;
			case 0xA2: return 0x2;
			case 0xA3: return 0x3;
			case 0xA4: return 0x4;
			case 0xA5: return 0x5;
			case 0xA6: return 0x6;
			case 0xA7: return 0x7;
			case 0xA8: return 0x8;
			case 0xA9: return 0x9;
			case 0xAA: return 0xA;
			case 0xAB: return 0xB;
			case 0xAC: return 0xC;
			case 0xAD: return 0xD;
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
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x85 && input <= 0x9F) return input - 0x85 + 0x85;
			switch (input) {
			case 0x80: return 0xA0L;
			case 0x81: return 0x20A9L;
			case 0x82: return 0xF87F2013L;
			case 0x83: return 0xA9L;
			case 0x84: return 0xF87FFF3FL;
			case 0xFF: return 0xF87F2026L;
			}
			return 0;
		}
		private static final int[] GETOUTPUT1_41 = getOutput1_41();
		private static final int[] getOutput1_41() {
			return new int[] {
				0xF87F300C, 0xF87F300D, 0xF87B300C, 0xF87B300D, 0xF87C300C, 0xF87C300D, 0xF87C300E, 0xF87C300F, 0xF878300A, 0xF878300B, 0xF8783008, 0xF8783009, 0xFE59, 0xFE5A, 0xF87FFE59, 0xF87FFE5A,
				0xF87F2985, 0xF87F2986, 0xF8792985, 0xF8792986, 0xF87C2985, 0xF87C2986, 0xF87C0028, 0xF87C0029, 0x2985, 0x2986, 0xF87F3010, 0xF87F3011, 0x3016, 0x3017, 0x3018, 0x3019,
				0xF87B005B, 0xF87B005D, 0xF87C005B, 0xF87C005D, 0xF87B2985, 0xF87B2986, 0xF87F2020, 0xF87F2021, 0xF87B2020, 0xF87C2021, 0xF8772020, 0xF877002A, 0x2051, 0xF840, 0x201F, 0x201B,
				0x207A, 0x207B, 0xF87700D7, 0xF877221E, 0xF877223D, 0xF87700B1, 0xF8772213, 0xF877003E, 0xF877003C, 0x207C, 0xF8772260, 0x207D, 0x207E, 0, 0, 0,
				0xF877007B, 0xF877007D, 0xF877005B, 0xF877005D, 0xF8772229, 0xF877222A, 0xF8772282, 0xF8772208, 0xF8772211, 0xF8770021, 0xF8763007, 0xF8764E00, 0xF8764E8C, 0xF8764E09, 0xF87656DB, 0xF8764E94,
				0xF876516D, 0xF8764E03, 0xF876516B, 0xF8764E5D, 0xF8765341, 0x204C, 0x204D, 0x2BC, 0x2997, 0x2998, 0, 0xF874FF0A, 0xF87C2051, 0xF875FF0A, 0xF871FF0A, 0xF8792051,
				0x3000, 0x3001, 0x3002, 0xB7, 0x2025, 0x2026, 0xA8, 0x3003, 0x2013, 0x2014, 0x2016, 0xFF3C, 0x301C, 0x2018, 0x2019, 0x201C,
				0x201D, 0x3014, 0x3015, 0x3008, 0x3009, 0x300A, 0x300B, 0x300C, 0x300D, 0x300E, 0x300F, 0x3010, 0x3011, 0xB1, 0xD7, 0xF7,
				0x2260, 0x2264, 0x2265, 0x221E, 0x2234, 0xB0, 0x2032, 0x2033, 0x2103, 0x212B, 0xA2, 0xA3, 0xA5, 0x2642, 0x2640, 0x2220,
				0x22A5, 0x2312, 0x2202, 0x2207, 0x2261, 0x2252, 0xA7, 0x203B, 0x2606, 0x2605, 0x25CB, 0x25CF, 0x25CE, 0x25C7, 0x25C6, 0x25A1,
				0x25A0, 0x25B3, 0x25B2, 0x25BD, 0x25BC, 0x2192, 0x2190, 0x2191, 0x2193, 0x2194, 0x3013, 0x226A, 0x226B, 0x221A, 0x223D, 0x221D,
				0x2235, 0x222B, 0x222C, 0x2208, 0x220B, 0x2286, 0x2287, 0x2282, 0x2283, 0x222A, 0x2229, 0x2227, 0x2228, 0xAC,
			};
		}
		private long getOutput1(int input) {
			if (input >= 0x41 && input <= 0xFE) return GETOUTPUT1_41[input - 0x41];
			return 0;
		}
		private static final long[] GETOUTPUT2_A1 = getOutput2_A1();
		private static final long[] getOutput2_A1() {
			return new long[] {
				0x21D2L, 0x21D4L, 0x2200L, 0x2203L, 0xB4L, 0x2DCL, 0x2C7L, 0x2D8L, 0x2DDL, 0x2DAL, 0x2D9L, 0xB8L, 0x2DBL, 0xA1L, 0xBFL, 0x2D0L,
				0x222EL, 0x2211L, 0x220FL, 0xA4L, 0x2109L, 0x2030L, 0x25C1L, 0x25C0L, 0x25B7L, 0x25B6L, 0x2664L, 0x2660L, 0x2661L, 0x2665L, 0x2667L, 0x2663L,
				0x25C9L, 0x25C8L, 0x25A3L, 0x25D0L, 0x25D1L, 0x2592L, 0x25A4L, 0x25A5L, 0x25A8L, 0x25A7L, 0x25A6L, 0x25A9L, 0x2668L, 0x260FL, 0x260EL, 0x261CL,
				0x261EL, 0xB6L, 0x2020L, 0x2021L, 0x2195L, 0x2197L, 0x2199L, 0x2196L, 0x2198L, 0x266DL, 0x2669L, 0x266AL, 0x266CL, 0x327FL, 0x321CL, 0x2116L,
				0x33C7L, 0x2122L, 0x33C2L, 0x33D8L, 0x2121L, 0xF87C20DE0031L, 0xF87C20DE0032L, 0xF87C20DE0033L, 0xF87C20DE0034L, 0xF87C20DE0035L, 0xF87C20DE0036L, 0xF87C20DE0037L, 0xF87C20DE0038L, 0xF87C20DE0039L, 0xDC00L, 0xDC01L,
				0xDC02L, 0xDC03L, 0xDC04L, 0xDC05L, 0xDC06L, 0xDC07L, 0xDC08L, 0xDC09L, 0xDC0AL, 0xF87F00B6L, 0xF87B2016L, 0xF87C2016L, 0x22EEL, 0x2237L,
			};
		}
		private long getOutput2(int input) {
			if (input >= 0xA1 && input <= 0xFE) return GETOUTPUT2_A1[input - 0xA1];
			switch (input) {
			case 0x41: return 0xF8782985L;
			case 0x42: return 0xF8782986L;
			case 0x43: return 0xF8732985L;
			case 0x44: return 0xF8732986L;
			case 0x45: return 0xF87CFE59L;
			case 0x46: return 0xF87CFE5AL;
			case 0x47: return 0xF8783016L;
			case 0x48: return 0xF8783017L;
			case 0x49: return 0xF8783010L;
			case 0x4A: return 0xF8783011L;
			case 0x4B: return 0xF87F0028L;
			case 0x4C: return 0xF87F0029L;
			}
			return 0;
		}
		private static final long[] GETOUTPUT3_41 = getOutput3_41();
		private static final long[] getOutput3_41() {
			return new long[] {
				0xF87B20DE0031L, 0xF87B20DE0032L, 0xF87B20DE0033L, 0xF87B20DE0034L, 0xF87B20DE0035L, 0xF87B20DE0036L, 0xF87B20DE0037L, 0xF87B20DE0038L, 0xF87B20DE0039L, 0xDC0BL, 0xDC0CL, 0xDC0DL, 0xDC0EL, 0xDC0FL, 0xDC10L, 0xDC11L,
				0xDC12L, 0xDC13L, 0xDC14L, 0xDC15L, 0x278AL, 0x278BL, 0x278CL, 0x278DL, 0x278EL, 0x278FL, 0x2790L, 0x2791L, 0x2792L, 0x2793L, 0xF87F24EBL, 0xF87F24ECL,
				0xF87F24EDL, 0xF87F24EEL, 0xF87F24EFL, 0xF87F24F0L, 0xF87F24F1L, 0xF87F24F2L, 0xF87F24F3L, 0xF87F24F4L, 0x2900410028F861L, 0x2900420028F861L, 0x2900430028F861L, 0x2900440028F861L, 0x2900450028F861L, 0x2900460028F861L, 0x2900470028F861L, 0x2900480028F861L,
				0x2900490028F861L, 0x29004A0028F861L, 0x29004B0028F861L, 0x29004C0028F861L, 0x29004D0028F861L, 0x29004E0028F861L, 0x29004F0028F861L, 0x2900500028F861L, 0x2900510028F861L, 0x2900520028F861L, 0x2900530028F861L, 0x2900540028F861L, 0x2900550028F861L, 0, 0, 0,
				0x2900560028F861L, 0x2900570028F861L, 0x2900580028F861L, 0x2900590028F861L, 0x29005A0028F861L,
			};
		}
		private long getOutput3(int input) {
			if (input >= 0x86 && input <= 0x9F) return input - 0x86 + 0x24B6;
			if (input >= 0x41 && input <= 0x85) return GETOUTPUT3_41[input - 0x41];
			if (input >= 0xA1 && input <= 0xDB) return input - 0xA1 + 0xFF01;
			if (input >= 0xDD && input <= 0xFD) return input - 0xDD + 0xFF3D;
			switch (input) {
			case 0xDC: return 0xFFE6L;
			case 0xFE: return 0x203EL;
			}
			return 0;
		}
		private static final long[] GETOUTPUT4_41 = getOutput4_41();
		private static final long[] getOutput4_41() {
			return new long[] {
				0xF87F20DE0031L, 0xF87F20DE0032L, 0xF87F20DE0033L, 0xF87F20DE0034L, 0xF87F20DE0035L, 0xF87F20DE0036L, 0xF87F20DE0037L, 0xF87F20DE0038L, 0xF87F20DE0039L, 0xDC16L, 0xDC17L, 0xDC18L, 0xDC19L, 0xDC1AL, 0xDC1BL, 0xDC1CL,
				0xDC1DL, 0xDC1EL, 0xDC1FL, 0xDC20L, 0xF87A20DE0031L, 0xF87A20DE0032L, 0xF87A20DE0033L, 0xF87A20DE0034L, 0xF87A20DE0035L, 0xF87A20DE0036L, 0xF87A20DE0037L, 0xF87A20DE0038L, 0xF87A20DE0039L, 0xDC21L, 0xDC22L, 0xDC23L,
				0xDC24L, 0xDC25L, 0xDC26L, 0xDC27L, 0xDC28L, 0xDC29L, 0xDC2AL, 0xDC2BL, 0xF87F278AL, 0xF87F278BL, 0xF87F278CL, 0xF87F278DL, 0xF87F278EL, 0xF87F278FL, 0xF87F2790L, 0xF87F2791L,
				0xF87F2792L, 0xF87F2793L, 0xF87824EBL, 0xF87824ECL, 0xF87824EDL, 0xF87824EEL, 0xF87824EFL, 0xF87824F0L, 0xF87824F1L, 0xF87824F2L, 0xF87824F3L, 0xF87824F4L, 0x2A26L, 0, 0, 0,
				0x227AL, 0x227BL, 0x22CEL, 0x22CFL, 0x2280L, 0x2281L, 0x2270L, 0x2271L, 0x2272L, 0x2273L, 0x2AC5L, 0x2ACBL, 0x2AC6L, 0x2ACCL, 0x2276L, 0x2277L,
				0x2279L, 0x22DAL, 0x22DBL, 0x2A8BL, 0x2A8CL, 0x2A91L, 0x2A92L, 0xF87F2222L, 0x2245L, 0x2243L, 0x2248L, 0x29A3L, 0x22A4L, 0x3472225L, 0x3472AFDL,
			};
		}
		private long getOutput4(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0x3131;
			if (input >= 0x41 && input <= 0x9F) return GETOUTPUT4_41[input - 0x41];
			return 0;
		}
		private static final long[] GETOUTPUT5_41 = getOutput5_41();
		private static final long[] getOutput5_41() {
			return new long[] {
				0x20DE0030L, 0x20DE0031L, 0x20DE0032L, 0x20DE0033L, 0x20DE0034L, 0x20DE0035L, 0x20DE0036L, 0x20DE0037L, 0x20DE0038L, 0x20DE0039L, 0xF87F24EAL, 0xF87F2460L, 0xF87F2461L, 0xF87F2462L, 0xF87F2463L, 0xF87F2464L,
				0xF87F2465L, 0xF87F2466L, 0xF87F2467L, 0xF87F2468L, 0x290041F860L, 0x290042F860L, 0x290043F860L, 0x290044F860L, 0x290045F860L, 0x290046F860L, 0x290047F860L, 0x290048F860L, 0x290049F860L, 0x29004AF860L, 0x29004BF860L, 0x29004CF860L,
				0x29004DF860L, 0x29004EF860L, 0x29004FF860L, 0x290050F860L, 0x290051F860L, 0x290052F860L, 0x290053F860L, 0x290054F860L, 0x290055F860L, 0x290056F860L, 0x290057F860L, 0x290058F860L, 0x290059F860L, 0x29005AF860L, 0x290061F860L, 0x290062F860L,
				0x290063F860L, 0x290064F860L, 0x290065F860L, 0x290066F860L, 0x290067F860L, 0x290068F860L, 0x290069F860L, 0x29006AF860L, 0x29006BF860L, 0x29006CF860L, 0x29006DF860L, 0x29006EF860L, 0x29006FF860L, 0, 0, 0,
				0x290070F860L, 0x290071F860L, 0x290072F860L, 0x290073F860L, 0x290074F860L, 0x290075F860L, 0x290076F860L, 0x290077F860L, 0x290078F860L, 0x290079F860L, 0x29007AF860L,
			};
		}
		private long getOutput5(int input) {
			if (input >= 0x41 && input <= 0x8B) return GETOUTPUT5_41[input - 0x41];
			if (input >= 0xC1 && input <= 0xD1) return input - 0xC1 + 0x391;
			if (input >= 0xA1 && input <= 0xB9) return CommonSubtables.COMMON276[input - 0xA1];
			if (input >= 0xE1 && input <= 0xF1) return input - 0xE1 + 0x3B1;
			switch (input) {
			case 0xD2: return 0x3A3L;
			case 0xD3: return 0x3A4L;
			case 0xD4: return 0x3A5L;
			case 0xD5: return 0x3A6L;
			case 0xD6: return 0x3A7L;
			case 0xD7: return 0x3A8L;
			case 0xD8: return 0x3A9L;
			case 0xDA: return 0xF874FF01L;
			case 0xDB: return 0xF87D3002L;
			case 0xDC: return 0xF87F2032L;
			case 0xDD: return 0xF87F2033L;
			case 0xDE: return 0x2034L;
			case 0xF2: return 0x3C3L;
			case 0xF3: return 0x3C4L;
			case 0xF4: return 0x3C5L;
			case 0xF5: return 0x3C6L;
			case 0xF6: return 0x3C7L;
			case 0xF7: return 0x3C8L;
			case 0xF8: return 0x3C9L;
			case 0xF9: return 0xF87A3257L;
			case 0xFA: return 0xF87A3258L;
			case 0xFB: return 0xF87A3259L;
			case 0xFC: return 0xF87A325AL;
			}
			return 0;
		}
		private static final long[] GETOUTPUT6_41 = getOutput6_41();
		private static final long[] getOutput6_41() {
			return new long[] {
				0xF87FF83DL, 0xF83DL, 0xF87C2020L, 0x20202020F860L, 0x20212021F860L, 0x202020202020F861L, 0xF87C00A7L, 0x266FL, 0xF87FFF0AL, 0xF873FF0AL, 0xF8742051L, 0x2A002AF860L, 0x2042L, 0x204EL, 0xF8712051L, 0x2A002AF867L,
				0xF8792042L, 0x273DL, 0x2731L, 0x2747L, 0x2022L, 0x20DF25A0L, 0x20DF25C7L, 0xF805L, 0x20DF25A1L, 0x2039L, 0x203AL, 0xABL, 0xBBL, 0xF87F261CL, 0xF87F261EL, 0x20DFF806L,
				0x20DF20DF25C7L, 0x20DE25C7L, 0xF806L, 0x29C8L, 0x20DE25C6L, 0x20DEF805L, 0x20DE29C8L, 0x29BEL, 0x20DD25CEL, 0x20DD25B3L, 0x20DD25B2L, 0x271AL, 0x2716L, 0x29BFL, 0x25EFL, 0xF87C25EFL,
				0xF87C2610L, 0x2723L, 0x2756L, 0xF80AL, 0x25CCL, 0xF87F2610L, 0x2610L, 0x25A2L, 0xF87A2723L, 0xF87A2756L, 0xF87A273FL, 0x273FL, 0xF87C3013L, 0, 0, 0,
				0xF809L, 0x20DD25C9L, 0x274DL, 0x25CDL, 0x20DD27E1L, 0xF87FF80BL, 0xF87A2720L, 0x2720L, 0xF87F25C8L, 0xF87F25A8L, 0, 0, 0x2741L, 0xF87F2756L, 0xF808L, 0xF87F20A9L,
				0xF87AF809L, 0xF87F534DL, 0x262FL, 0, 0, 0xF80BL, 0xF87A262FL, 0xF876262FL, 0x2740L, 0xF80CL, 0x20D82748L, 0, 0, 0x3020L, 0xF807L, 0,
				0x2500L, 0x2502L, 0x250CL, 0x2510L, 0x2518L, 0x2514L, 0x251CL, 0x252CL, 0x2524L, 0x2534L, 0x253CL, 0x2501L, 0x2503L, 0x250FL, 0x2513L, 0x251BL,
				0x2517L, 0x2523L, 0x2533L, 0x252BL, 0x253BL, 0x254BL, 0x2520L, 0x252FL, 0x2528L, 0x2537L, 0x253FL, 0x251DL, 0x2530L, 0x2525L, 0x2538L, 0x2542L,
				0x2512L, 0x2511L, 0x251AL, 0x2519L, 0x2516L, 0x2515L, 0x250EL, 0x250DL, 0x251EL, 0x251FL, 0x2521L, 0x2522L, 0x2526L, 0x2527L, 0x2529L, 0x252AL,
				0x252DL, 0x252EL, 0x2531L, 0x2532L, 0x2535L, 0x2536L, 0x2539L, 0x253AL, 0x253DL, 0x253EL, 0x2540L, 0x2541L, 0x2543L, 0x2544L, 0x2545L, 0x2546L,
				0x2547L, 0x2548L, 0x2549L, 0x254AL, 0x2776L, 0x2777L, 0x2778L, 0x2779L, 0x277AL, 0x277BL, 0x277CL, 0x277DL, 0x277EL, 0x277FL, 0x24EBL, 0x24ECL,
				0x24EDL, 0x24EEL, 0x24EFL, 0x24F0L, 0x24F1L, 0x24F2L, 0x24F3L, 0x24F4L, 0xF87A3251L, 0xF87A3252L, 0xF87A3253L, 0xF87A3254L, 0xF87A3255L, 0xF87A3256L,
			};
		}
		private long getOutput6(int input) {
			if (input >= 0x41 && input <= 0xFE) return GETOUTPUT6_41[input - 0x41];
			return 0;
		}
		private static final int[] GETOUTPUT7_41 = getOutput7_41();
		private static final int[] getOutput7_41() {
			return new int[] {
				0xF87F2642, 0x3012, 0x3036, 0xF87F25CB, 0xF87F25B3, 0x25FB, 0xF84C, 0xF8762394, 0xF87825AD, 0x25AD, 0xF84D, 0xF84E, 0xF84F, 0xF87F25C7, 0xF87F51F9, 0xF87F51F8,
				0x2206, 0xF87F2206, 0x221F, 0xF87F222A, 0x2225, 0x2226, 0xF87F2229, 0x2253, 0x2251, 0x2266, 0x2267, 0x2213, 0x2295, 0x2296, 0x2297, 0x2A38,
				0x2314, 0x20E5003D, 0x20E52261, 0x2262, 0x20D2003D, 0x25B1, 0x308002D, 0x2222, 0x2250, 0x3D5, 0x2AE8, 0x22A3, 0x33822A5, 0x20D22261, 0x226E, 0x226F,
				0x2285, 0x2284, 0x2209, 0x220C, 0x22BB, 0x22BC, 0x225A, 0x2306, 0x336223D, 0xF87F2314, 0x2A72, 0x20E488DC, 0xDC2C, 0, 0, 0,
				0xDC2D, 0x329E, 0xF87F329E, 0x203C, 0x2049, 0xF87F203C, 0x2047, 0xF87C25C7, 0xF87925C7, 0xF87B25C7, 0xF87925C6, 0xF87C25A1, 0xF87925A1, 0xF87B25A1, 0x2588, 0x25E6,
				0xF87925CB, 0xF87B25CB, 0xF87925CF, 0x25BF, 0x25B5, 0x25B9, 0x25C3, 0x2666, 0x2981, 0x25FC, 0x20E425B4, 0x25CA, 0x3231, 0x3239, 0x33CB, 0,
				0x3395, 0x3396, 0x3397, 0x2113, 0x3398, 0x33C4, 0x33A3, 0x33A4, 0x33A5, 0x33A6, 0x3399, 0x339A, 0x339B, 0x339C, 0x339D, 0x339E,
				0x339F, 0x33A0, 0x33A1, 0x33A2, 0x33CA, 0x338D, 0x338E, 0x338F, 0x33CF, 0x3388, 0x3389, 0x33C8, 0x33A7, 0x33A8, 0x33B0, 0x33B1,
				0x33B2, 0x33B3, 0x33B4, 0x33B5, 0x33B6, 0x33B7, 0x33B8, 0x33B9, 0x3380, 0x3381, 0x3382, 0x3383, 0x3384, 0x33BA, 0x33BB, 0x33BC,
				0x33BD, 0x33BE, 0x33BF, 0x3390, 0x3391, 0x3392, 0x3393, 0x3394, 0x2126, 0x33C0, 0x33C1, 0x338A, 0x338B, 0x338C, 0x33D6, 0x33C5,
				0x33AD, 0x33AE, 0x33AF, 0x33DB, 0x33A9, 0x33AA, 0x33AB, 0x33AC, 0x33DD, 0x33D0, 0x33D3, 0x33C3, 0x33C9, 0x33DC, 0x33C6, 0x246F,
				0x2470, 0x2471, 0x2472, 0x2473, 0x3251, 0x3252, 0x3253, 0x3254, 0x3255, 0x3256, 0x3257, 0x3258, 0x3259, 0x325A,
			};
		}
		private long getOutput7(int input) {
			if (input >= 0x41 && input <= 0xFE) return GETOUTPUT7_41[input - 0x41];
			return 0;
		}
		private static final int[] GETOUTPUT8_41 = getOutput8_41();
		private static final int[] getOutput8_41() {
			return new int[] {
				0xF87B2192, 0xF87B2190, 0xF87B2191, 0xF87B2193, 0xF87B2196, 0xF87B2197, 0xF87B2198, 0xF87B2199, 0x21D0, 0x21CF, 0x21CD, 0xF87F21D4, 0xF87C2192, 0xF87C2190, 0xF87C2191, 0xF87C2193,
				0xF87C2194, 0xF87C2195, 0xF8792190, 0xF8792192, 0xF8792191, 0xF8792193, 0x20DE21E6, 0x20DE21E8, 0x20DE21E7, 0x20DE21E9, 0x20DD21E6, 0x27B2, 0x20DD21E7, 0x20DD21E9, 0xF87F2190, 0x279C,
				0xF87F2191, 0xF87F2193, 0xF8752190, 0xF8752192, 0xF8752191, 0xF8752193, 0xF846, 0xF847, 0xF8712190, 0x279B, 0xF8722190, 0xF8722192, 0xF8722191, 0xF8722193, 0x2962, 0x2964,
				0x2963, 0x2965, 0xF87A21E6, 0x27A1, 0xF87A21E7, 0xF87A21E9, 0xF87B21E6, 0x279E, 0xF87B21E7, 0xF87B21E9, 0x21B2, 0x21B1, 0xF87B21BB, 0, 0, 0,
				0x21B4, 0x21B0, 0x21B3, 0xF87F2939, 0xF87F2934, 0x2936, 0xF87F21B1, 0xF87F21BB, 0x2935, 0xF87F21B0, 0x2937, 0x2939, 0x2934, 0xF87921E6, 0xF87921E8, 0xF87921E7,
				0xF87921E9, 0x21BC, 0x21C0, 0xF841, 0xF87921D4, 0xF87421E8, 0xF87421E6, 0xF87921C0, 0xF87921BC, 0xF87C21D2, 0xF87C21D0, 0xF849, 0xF848, 0x21C4, 0x21C5, 0,
				0xC6, 0xD0, 0xAA, 0x126, 0, 0x132, 0, 0x13F, 0x141, 0xD8, 0x152, 0xBA, 0xDE, 0x166, 0x14A,
			};
		}
		private long getOutput8(int input) {
			if (input >= 0xB1 && input <= 0xCC) return input - 0xB1 + 0x3260;
			if (input >= 0x41 && input <= 0xAF) return GETOUTPUT8_41[input - 0x41];
			if (input >= 0xCD && input <= 0xE6) return input - 0xCD + 0x24D0;
			if (input >= 0xE7 && input <= 0xFE) return CommonSubtables.COMMON453[input - 0xE7];
			return 0;
		}
		private static final long[] GETOUTPUT9_41 = getOutput9_41();
		private static final long[] getOutput9_41() {
			return new long[] {
				0x2E0041F860L, 0x2E0042F860L, 0x2E0043F860L, 0x2E0044F860L, 0x2E0045F860L, 0x2E0046F860L, 0x2E0047F860L, 0x2E0048F860L, 0x2E0049F860L, 0x2E004AF860L, 0x2E004BF860L, 0x2E004CF860L, 0x2E004DF860L, 0x2E004EF860L, 0x2E004FF860L, 0x2E0050F860L,
				0x2E0051F860L, 0x2E0052F860L, 0x2E0053F860L, 0x2E0054F860L, 0x2E0055F860L, 0x2E0056F860L, 0x2E0057F860L, 0x2E0058F860L, 0x2E0059F860L, 0x2E005AF860L, 0x2E0061F860L, 0x2E0062F860L, 0x2E0063F860L, 0x2E0064F860L, 0x2E0065F860L, 0x2E0066F860L,
				0x2E0067F860L, 0x2E0068F860L, 0x2E0069F860L, 0x2E006AF860L, 0x2E006BF860L, 0x2E006CF860L, 0x2E006DF860L, 0x2E006EF860L, 0x2E006FF860L, 0x2E0070F860L, 0x2E0071F860L, 0x2E0072F860L, 0x2E0073F860L, 0x2E0074F860L, 0x2E0075F860L, 0x2E0076F860L,
				0x2E0077F860L, 0x2E0078F860L, 0x2E0079F860L, 0x2E007AF860L,
			};
		}
		private long getOutput9(int input) {
			if (input >= 0x41 && input <= 0x74) return GETOUTPUT9_41[input - 0x41];
			if (input >= 0xB1 && input <= 0xCC) return input - 0xB1 + 0x3200;
			if (input >= 0xA1 && input <= 0xB0) return CommonSubtables.COMMON454[input - 0xA1];
			if (input >= 0xCD && input <= 0xE6) return input - 0xCD + 0x249C;
			if (input >= 0xE7 && input <= 0xFE) return CommonSubtables.COMMON278[input - 0xE7];
			return 0;
		}
		private static final long[] GETOUTPUT10_41 = getOutput10_41();
		private static final long[] getOutput10_41() {
			return new long[] {
				0x20DEC6B4L, 0x20DEB2F5L, 0x20DEC8FCL, 0x20DEBA85L, 0x20DEB300L, 0x20DED615L, 0x20DEBD80L, 0x20DEC804L, 0x20DEC811L, 0x20DEC218L, 0x20DEB3D9L, 0x20DEBE44L, 0x20DEBC18L, 0x20DEC790L, 0x20DED0C0L, 0x20DEAC10L,
				0x20DEC57DL, 0x20DEC778L, 0x20DEB73BL, 0x20DE5370L, 0x20DE8A3BL, 0x20DEC608L, 0x20DE611FL, 0x20DE51A0L, 0x20DE7B54L, 0x20DE4EE3L, 0x20DE982DL, 0x20DE52D5L, 0x20DE540DL, 0x20DE76EEL, 0x20DE53CDL, 0x20DE88DCL,
				0x20DE672CL, 0x20DE526FL, 0x20DE5E8FL, 0x20DE9023L, 0x20DE5F71L, 0x20DE4F8BL, 0x20DE6E90L, 0x20DE5B50L, 0x20DE524DL, 0x20DE7BC0L, 0x20DE63A5L, 0x20DE52A9L, 0x20DE6307L, 0x20DE4ED6L, 0x20DE6D3EL, 0x20DE5F62L,
				0x20DEC870L, 0xF87A20DEBB38L, 0xF87A20DEB2F5L, 0xF87A20DEC8FCL, 0xF87A20DEB73BL, 0xF87A20DE8A3BL, 0xF87A20DEAD50L, 0xF87A20DEC5EDL, 0xF87A20DEC74CL, 0xF87A20DEC815L, 0xF87A20DED574L, 0xF87A20DEC608L, 0x20DDC874L, 0, 0, 0,
				0x20DDB77CL, 0x20DDB9C8L, 0x20DDBC14L, 0x20DDC0ACL, 0x20DDC544L, 0x20DDC790L, 0x20DDCC28L, 0x20DDCE74L, 0x20DDD0C0L, 0x20DDD30CL, 0x20DDB192L, 0x20DDB0AEL, 0x20DDBA85L, 0x20DDB300L, 0x20DDD615L, 0x20DDBD80L,
				0x20DDC804L, 0x20DDC811L, 0x20DDC218L, 0x20DDB3D9L, 0x20DDBE44L, 0x20DDAC8CL, 0x20DDBC18L, 0x20DDC18DL, 0x20DDC778L, 0x20DDBCF8L, 0x20DDC57DL, 0x20DDC219L, 0x20DDC720L, 0x20DDAD00L, 0x20DD51A0L,
			};
		}
		private long getOutput10(int input) {
			if (input >= 0xA1 && input <= 0xF3) return input - 0xA1 + 0x3041;
			if (input >= 0x41 && input <= 0x9F) return GETOUTPUT10_41[input - 0x41];
			switch (input) {
			case 0xF4: return 0x2483L;
			case 0xF5: return 0x2484L;
			case 0xF6: return 0x2485L;
			case 0xF7: return 0x2486L;
			case 0xF8: return 0x2487L;
			case 0xF9: return 0xDC2EL;
			case 0xFA: return 0xDC2FL;
			case 0xFB: return 0xDC30L;
			case 0xFC: return 0xDC31L;
			case 0xFD: return 0xDC32L;
			case 0xFE: return 0xDC33L;
			}
			return 0;
		}
		private static final long[] GETOUTPUT11_41 = getOutput11_41();
		private static final long[] getOutput11_41() {
			return new long[] {
				0x20DDC870L, 0x20DDAD6DL, 0x20DDAC10L, 0x20DD5370L, 0x20DD8863L, 0x20DD672BL, 0x20DDAC70L, 0x20DDB2F5L, 0x20DDBCC0L, 0x20DDC0C1L, 0x20DDC13CL, 0x20DDC2E0L, 0x20DDC5ECL, 0x20DDC608L, 0x20DDC6D0L, 0x20DDC791L,
				0x20DDC900L, 0x20DDD0B9L, 0x20DDC678L, 0x20DDD65CL, 0x20DDAC04L, 0x20DDAC19L, 0x20DDC2E4L, 0x20DD611FL, 0x20DD6163L, 0x20DD4EE3L, 0x20DD52D5L, 0x3294L, 0x20DD53CDL, 0x20DD526FL, 0x20DD81EAL, 0x20DD524DL,
				0x20DD96FBL, 0x20DD63A5L, 0x20DD52A9L, 0x20DD6CE8L, 0x20DD53C3L, 0x20DD672CL, 0x20DD65B0L, 0x20DD73FEL, 0x20DD5F62L, 0x20DD9593L, 0x20DD570BL, 0x32A5L, 0x20DD4ED6L, 0x20DDBE60L, 0x20DDC2DCL, 0x20DDC785L,
				0x20DDC73CL, 0x20DDC74CL, 0x20DDC9C1L, 0x20DDD45CL, 0x20DDAC00L, 0x20DDB098L, 0x20DDB2E4L, 0x20DDD558L, 0xF87A20DDB9C8L, 0xF87A20DDBC14L, 0xF87A20DDC0ACL, 0xF87A20DDC544L, 0xF87A20DDC790L, 0, 0, 0,
				0xF87A20DDCC28L, 0xF87A20DDCE74L, 0xF87A20DDD0C0L, 0xF87A20DDD30CL, 0xF87A20DDD558L, 0xF87A20DDBE44L, 0xF87A20DDB2F5L, 0xF87A20DDBE60L, 0xF87A20DDBCF8L, 0xF87A20DDB2E8L, 0xF87A20DDC13CL, 0xF87A20DDC2DCL, 0xF87A20DDC5ECL, 0xF87A20DDC608L, 0xF87A20DDC73CL, 0xF87A20DDC74CL,
				0xF87A20DDC785L, 0xF87A20DDC81CL, 0xF87A20DDC874L, 0xF87A20DDC900L, 0xF87A20DDD45CL, 0xF87A20DDD574L, 0xF87A20DDB290L, 0xF87A20DDB192L, 0xF87A20DDB0AEL, 0xF87A20DDBC18L, 0xF87A20DDAC00L, 0xF87A20DDB098L, 0xF87A20DDB2E4L, 0xF87A20DDB77CL, 0xF87A20DDC678L,
			};
		}
		private long getOutput11(int input) {
			if (input >= 0xA1 && input <= 0xF6) return input - 0xA1 + 0x30A1;
			if (input >= 0x41 && input <= 0x9F) return GETOUTPUT11_41[input - 0x41];
			switch (input) {
			case 0xF7: return 0xDC34L;
			case 0xF8: return 0xDC35L;
			case 0xF9: return 0xDC36L;
			case 0xFA: return 0xDC37L;
			}
			return 0;
		}
		private static final int[] GETOUTPUT12_41 = getOutput12_41();
		private static final int[] getOutput12_41() {
			return new int[] {
				0x21F0, 0xF843, 0x27B5, 0xF87F2964, 0xF87F2962, 0xF87021E8, 0xF87021E6, 0x27A4, 0xF844, 0xF84B, 0xF84A, 0xF87F21C0, 0xF87F21BC, 0xF87F21E8, 0xF87F21E6, 0x21B6,
				0x21B7, 0x219D, 0x219C, 0xF842, 0xF87A2190, 0xF87A2192, 0xF87A2191, 0xF87A2193, 0xF87C21E6, 0xF87C21E8, 0xF87C21E7, 0xF87C21E9, 0xF8732190, 0x2794, 0xF845, 0xF8732191,
				0xF8732193, 0xF8782190, 0xF8782192, 0xF8782191, 0xF8782193, 0xF8742190, 0xF8742192, 0xF8742191, 0xF8742193, 0x21E0, 0x21E2, 0x21E1, 0x21E3, 0xF87521E6, 0xF87521E8, 0xF87521E7,
				0xF87521E9, 0x21E6, 0x21E8, 0x21E7, 0x21E9, 0xF87A2936, 0xF87A21B1, 0xF87A21BB, 0xF87A2935, 0xF87A21B0, 0xF87A2937, 0xF87A2939, 0xF87A2934, 0, 0, 0,
				0xF87C2936, 0xF87C21B1, 0xF87C21BB, 0xF87C2935, 0xF87C21B0, 0xF87C2937, 0xF87C2939, 0xF87C2934, 0xF8702190, 0xF8702192, 0xF8702191, 0xF8702193, 0x261D, 0x261F, 0xF87F261D, 0xF87F261F,
				0x20DDB2E8, 0x20DDCC38, 0x20DDC18C, 0x20DDC911, 0x20DDC77C, 0x20DDC774, 0x20DDD734, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0x410, 0x411, 0x412, 0x413, 0x414, 0x415, 0x401,
			};
		}
		private static final long[] GETOUTPUT12_C2 = getOutput12_C2();
		private static final long[] getOutput12_C2() {
			return new long[] {
				0xF87520DE0031L, 0xF87520DE0032L, 0xF87520DE0033L, 0xF87520DE0034L, 0xF87520DE0035L, 0xF87520DE0036L, 0xF87520DE0037L, 0xF87520DE0038L, 0xF87520DE0039L, 0xDC38L, 0xDC39L, 0xDC3AL, 0xDC3BL, 0xDC3CL, 0xDC3DL, 0x430L,
				0x431L, 0x432L, 0x433L, 0x434L, 0x435L, 0x451L,
			};
		}
		private long getOutput12(int input) {
			if (input >= 0xA8 && input <= 0xC1) return input - 0xA8 + 0x416;
			if (input >= 0x41 && input <= 0xA7) return GETOUTPUT12_41[input - 0x41];
			if (input >= 0xD8 && input <= 0xF1) return input - 0xD8 + 0x436;
			if (input >= 0xC2 && input <= 0xD7) return GETOUTPUT12_C2[input - 0xC2];
			switch (input) {
			case 0xF2: return 0xDC3EL;
			case 0xF3: return 0xDC3FL;
			case 0xF4: return 0xDC40L;
			case 0xF5: return 0xDC41L;
			case 0xF6: return 0xDC42L;
			}
			return 0;
		}
		private static final long[] GETOUTPUT13_41 = getOutput13_41();
		private static final long[] getOutput13_41() {
			return new long[] {
				0xF87A20DE4E00L, 0xF87A20DE4E8CL, 0xF87A20DE4E09L, 0xF87A20DE56DBL, 0xF87A20DE4E94L, 0xF87A20DE516DL, 0xF87A20DE4E03L, 0xF87A20DE516BL, 0xF87A20DE4E5DL, 0xF87A20DE5341L, 0xDC43L, 0xDC44L, 0xDC45L, 0xDC46L, 0xDC47L, 0xDC48L,
				0xDC49L, 0xDC4AL, 0xDC4BL, 0xDC4CL, 0x20DE4E00L, 0x20DE4E8CL, 0x20DE4E09L, 0x20DE56DBL, 0x20DE4E94L, 0x20DE516DL, 0x20DE4E03L, 0x20DE516BL, 0x20DE4E5DL, 0x20DE5341L, 0xDC4DL, 0xDC4EL,
				0xDC4FL, 0xDC50L, 0xDC51L, 0xDC52L, 0xDC53L, 0xDC54L, 0xDC55L, 0xDC56L, 0x20DE65E5L, 0x20DE6708L, 0x20DE706BL, 0x20DE6C34L, 0x20DE6728L, 0x20DE91D1L, 0x20DE571FL, 0x3290L,
				0x328AL, 0x328BL, 0x328CL, 0x328DL, 0x328EL, 0x328FL, 0xF87C20DE65E5L, 0xF87C20DE6708L, 0xF87C20DE706BL, 0xF87C20DE6C34L, 0xF87C20DE6728L, 0xF87C20DE91D1L, 0xF87C20DE571FL,
			};
		}
		private static final int[] GETOUTPUT13_A1 = getOutput13_A1();
		private static final int[] getOutput13_A1() {
			return new int[] {
				0xF879300C, 0xF879300D, 0xF879300E, 0xF879300F, 0xF87821E8, 0xF87821E6, 0xF87821E7, 0xF87821E9, 0x301E, 0x301F, 0x2036, 0xF8732033, 0x2035, 0xF8732032, 0xF87F21E7, 0xF87F0021,
			};
		}
		private long getOutput13(int input) {
			if (input >= 0x41 && input <= 0x7D) return GETOUTPUT13_41[input - 0x41];
			if (input >= 0xA1 && input <= 0xB0) return GETOUTPUT13_A1[input - 0xA1];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON455[input - 0xA1];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON456[input - 0xA1];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON457[input - 0xA1];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON458[input - 0xA1];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON459[input - 0xA1];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON460[input - 0xA1];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON461[input - 0xA1];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON462[input - 0xA1];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON463[input - 0xA1];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON464[input - 0xA1];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON465[input - 0xA1];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON466[input - 0xA1];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON467[input - 0xA1];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON468[input - 0xA1];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON469[input - 0xA1];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON470[input - 0xA1];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON471[input - 0xA1];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON472[input - 0xA1];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON473[input - 0xA1];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON474[input - 0xA1];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON475[input - 0xA1];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON476[input - 0xA1];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON477[input - 0xA1];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON478[input - 0xA1];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON479[input - 0xA1];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON480[input - 0xA1];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON481[input - 0xA1];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON482[input - 0xA1];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON483[input - 0xA1];
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON484[input - 0xA1];
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON485[input - 0xA1];
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON486[input - 0xA1];
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON487[input - 0xA1];
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON488[input - 0xA1];
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON489[input - 0xA1];
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON490[input - 0xA1];
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON491[input - 0xA1];
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON492[input - 0xA1];
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON493[input - 0xA1];
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON494[input - 0xA1];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON495[input - 0xA1];
			return 0;
		}
		private long getOutput55(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON496[input - 0xA1];
			return 0;
		}
		private long getOutput56(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON497[input - 0xA1];
			return 0;
		}
		private long getOutput57(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON498[input - 0xA1];
			return 0;
		}
		private long getOutput58(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON499[input - 0xA1];
			return 0;
		}
		private long getOutput59(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON500[input - 0xA1];
			return 0;
		}
		private long getOutput60(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON501[input - 0xA1];
			return 0;
		}
		private long getOutput61(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON502[input - 0xA1];
			return 0;
		}
		private long getOutput62(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON503[input - 0xA1];
			return 0;
		}
		private long getOutput63(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON504[input - 0xA1];
			return 0;
		}
		private long getOutput64(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON505[input - 0xA1];
			return 0;
		}
		private long getOutput65(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON506[input - 0xA1];
			return 0;
		}
		private long getOutput66(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON507[input - 0xA1];
			return 0;
		}
		private long getOutput67(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON508[input - 0xA1];
			return 0;
		}
		private long getOutput68(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON509[input - 0xA1];
			return 0;
		}
		private long getOutput69(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON510[input - 0xA1];
			return 0;
		}
		private long getOutput70(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON511[input - 0xA1];
			return 0;
		}
		private long getOutput71(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON512[input - 0xA1];
			return 0;
		}
		private long getOutput72(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON513[input - 0xA1];
			return 0;
		}
		private long getOutput73(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON514[input - 0xA1];
			return 0;
		}
		private long getOutput74(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON515[input - 0xA1];
			return 0;
		}
		private long getOutput75(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON516[input - 0xA1];
			return 0;
		}
		private long getOutput76(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON517[input - 0xA1];
			return 0;
		}
		private long getOutput77(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON518[input - 0xA1];
			return 0;
		}
		private long getOutput78(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON519[input - 0xA1];
			return 0;
		}
		private long getOutput79(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON520[input - 0xA1];
			return 0;
		}
		private long getOutput80(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON521[input - 0xA1];
			return 0;
		}
		private long getOutput81(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON522[input - 0xA1];
			return 0;
		}
		private long getOutput82(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON523[input - 0xA1];
			return 0;
		}
		private long getOutput83(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON524[input - 0xA1];
			return 0;
		}
		private long getOutput84(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON525[input - 0xA1];
			return 0;
		}
		private long getOutput85(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON526[input - 0xA1];
			return 0;
		}
		private long getOutput86(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON527[input - 0xA1];
			return 0;
		}
		private long getOutput87(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON528[input - 0xA1];
			return 0;
		}
		private long getOutput88(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON529[input - 0xA1];
			return 0;
		}
		private long getOutput89(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON530[input - 0xA1];
			return 0;
		}
		private long getOutput90(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON531[input - 0xA1];
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
			case 46: return getOutput46(input);
			case 47: return getOutput47(input);
			case 48: return getOutput48(input);
			case 49: return getOutput49(input);
			case 50: return getOutput50(input);
			case 51: return getOutput51(input);
			case 52: return getOutput52(input);
			case 53: return getOutput53(input);
			case 54: return getOutput54(input);
			case 55: return getOutput55(input);
			case 56: return getOutput56(input);
			case 57: return getOutput57(input);
			case 58: return getOutput58(input);
			case 59: return getOutput59(input);
			case 60: return getOutput60(input);
			case 61: return getOutput61(input);
			case 62: return getOutput62(input);
			case 63: return getOutput63(input);
			case 64: return getOutput64(input);
			case 65: return getOutput65(input);
			case 66: return getOutput66(input);
			case 67: return getOutput67(input);
			case 68: return getOutput68(input);
			case 69: return getOutput69(input);
			case 70: return getOutput70(input);
			case 71: return getOutput71(input);
			case 72: return getOutput72(input);
			case 73: return getOutput73(input);
			case 74: return getOutput74(input);
			case 75: return getOutput75(input);
			case 76: return getOutput76(input);
			case 77: return getOutput77(input);
			case 78: return getOutput78(input);
			case 79: return getOutput79(input);
			case 80: return getOutput80(input);
			case 81: return getOutput81(input);
			case 82: return getOutput82(input);
			case 83: return getOutput83(input);
			case 84: return getOutput84(input);
			case 85: return getOutput85(input);
			case 86: return getOutput86(input);
			case 87: return getOutput87(input);
			case 88: return getOutput88(input);
			case 89: return getOutput89(input);
			case 90: return getOutput90(input);
			default: return 0;
			}
		}
		private static final char[][] GETLONGOUTPUT = getLongOutput();
		private static final char[][] getLongOutput() {
			return new char[][] {
				"\uF863[10]".toCharArray(),
				"\uF863[11]".toCharArray(),
				"\uF863[12]".toCharArray(),
				"\uF863[13]".toCharArray(),
				"\uF863[14]".toCharArray(),
				"\uF863[15]".toCharArray(),
				"\uF863[16]".toCharArray(),
				"\uF863[17]".toCharArray(),
				"\uF863[18]".toCharArray(),
				"\uF863[19]".toCharArray(),
				"\uF863[20]".toCharArray(),
				"\uF864[10]".toCharArray(),
				"\uF864[11]".toCharArray(),
				"\uF864[12]".toCharArray(),
				"\uF864[13]".toCharArray(),
				"\uF864[14]".toCharArray(),
				"\uF864[15]".toCharArray(),
				"\uF864[16]".toCharArray(),
				"\uF864[17]".toCharArray(),
				"\uF864[18]".toCharArray(),
				"\uF864[19]".toCharArray(),
				"\uF864[20]".toCharArray(),
				"\uF862[10]".toCharArray(),
				"\uF862[11]".toCharArray(),
				"\uF862[12]".toCharArray(),
				"\uF862[13]".toCharArray(),
				"\uF862[14]".toCharArray(),
				"\uF862[15]".toCharArray(),
				"\uF862[16]".toCharArray(),
				"\uF862[17]".toCharArray(),
				"\uF862[18]".toCharArray(),
				"\uF862[19]".toCharArray(),
				"\uF862[20]".toCharArray(),
				"\uF865[10]".toCharArray(),
				"\uF865[11]".toCharArray(),
				"\uF865[12]".toCharArray(),
				"\uF865[13]".toCharArray(),
				"\uF865[14]".toCharArray(),
				"\uF865[15]".toCharArray(),
				"\uF865[16]".toCharArray(),
				"\uF865[17]".toCharArray(),
				"\uF865[18]".toCharArray(),
				"\uF865[19]".toCharArray(),
				"\uF865[20]".toCharArray(),
				"\uF862\uC8FC\uC2DD\uD68C\uC0AC".toCharArray(),
				"\uF863\uC8FC\uC2DD\uD68C\uC0AC".toCharArray(),
				"\uF862(21)".toCharArray(),
				"\uF862(22)".toCharArray(),
				"\uF862(23)".toCharArray(),
				"\uF862(24)".toCharArray(),
				"\uF862(25)".toCharArray(),
				"\uF862(26)".toCharArray(),
				"\uF862(27)".toCharArray(),
				"\uF862(28)".toCharArray(),
				"\uF862(29)".toCharArray(),
				"\uF862(30)".toCharArray(),
				"\uF866[10]".toCharArray(),
				"\uF866[11]".toCharArray(),
				"\uF866[12]".toCharArray(),
				"\uF866[13]".toCharArray(),
				"\uF866[14]".toCharArray(),
				"\uF866[15]".toCharArray(),
				"\uF866[16]".toCharArray(),
				"\uF866[17]".toCharArray(),
				"\uF866[18]".toCharArray(),
				"\uF866[19]".toCharArray(),
				"\uF866[20]".toCharArray(),
				"\uF863[\u5341\u4E00]".toCharArray(),
				"\uF863[\u5341\u4E8C]".toCharArray(),
				"\uF863[\u5341\u4E09]".toCharArray(),
				"\uF863[\u5341\u56DB]".toCharArray(),
				"\uF863[\u5341\u4E94]".toCharArray(),
				"\uF863[\u5341\u516D]".toCharArray(),
				"\uF863[\u5341\u4E03]".toCharArray(),
				"\uF863[\u5341\u516B]".toCharArray(),
				"\uF863[\u5341\u4E5D]".toCharArray(),
				"\uF863[\u4E8C\u5341]".toCharArray(),
				"\uF862[\u5341\u4E00]".toCharArray(),
				"\uF862[\u5341\u4E8C]".toCharArray(),
				"\uF862[\u5341\u4E09]".toCharArray(),
				"\uF862[\u5341\u56DB]".toCharArray(),
				"\uF862[\u5341\u4E94]".toCharArray(),
				"\uF862[\u5341\u516D]".toCharArray(),
				"\uF862[\u5341\u4E03]".toCharArray(),
				"\uF862[\u5341\u516B]".toCharArray(),
				"\uF862[\u5341\u4E5D]".toCharArray(),
				"\uF862[\u4E8C\u5341]".toCharArray(),
			};
		}
		protected char[] getLongOutput(int output) {
			return GETLONGOUTPUT[output];
		}
	}

	private static final class XMacKoreanCharsetEncoder extends TableCharsetEncoder {
		private XMacKoreanCharsetEncoder(Charset cs) {
			super(cs, 1.87987f, 2f, new byte[]{63}, 5);
		}
		private static final char[] GETNEXTSTATE0_21 = getNextState0_21();
		private static final char[] getNextState0_21() {
			return "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0002\u0003\u0004\u0000\u0000\u0005\u0000\u0000\u0006\u0007\t\u000B\r\u000F\u0011\u0013\u0015\u0017\u0000\u0000\u0019\u001A\u001B".toCharArray();
		}
		private int getNextState0(int input) {
			if (input >= 0x21 && input <= 0x3E) return GETNEXTSTATE0_21[input - 0x21];
			switch (input) {
			case 0x5B: return 0x1C;
			case 0x5D: return 0x1D;
			case 0x7B: return 0x1E;
			case 0x7D: return 0x1F;
			case 0xA7: return 0x20;
			case 0xB1: return 0x21;
			case 0xB6: return 0x22;
			case 0xD7: return 0x23;
			case 0x2013: return 0x24;
			case 0x2016: return 0x25;
			case 0x2020: return 0x26;
			case 0x2021: return 0x27;
			case 0x2026: return 0x28;
			case 0x2032: return 0x29;
			case 0x2033: return 0x2A;
			case 0x203C: return 0x2B;
			case 0x2042: return 0x2C;
			case 0x2051: return 0x2D;
			case 0x20A9: return 0x2E;
			case 0x2190: return 0x2F;
			case 0x2191: return 0x30;
			case 0x2192: return 0x31;
			case 0x2193: return 0x32;
			case 0x2194: return 0x33;
			case 0x2195: return 0x34;
			case 0x2196: return 0x35;
			case 0x2197: return 0x36;
			case 0x2198: return 0x37;
			case 0x2199: return 0x38;
			case 0x21B0: return 0x39;
			case 0x21B1: return 0x3A;
			case 0x21BB: return 0x3B;
			case 0x21BC: return 0x3C;
			case 0x21C0: return 0x3D;
			case 0x21D0: return 0x3E;
			case 0x21D2: return 0x3F;
			case 0x21D4: return 0x40;
			case 0x21E6: return 0x41;
			case 0x21E7: return 0x42;
			case 0x21E8: return 0x43;
			case 0x21E9: return 0x44;
			case 0x2206: return 0x45;
			case 0x2208: return 0x46;
			case 0x2211: return 0x47;
			case 0x2213: return 0x48;
			case 0x221E: return 0x49;
			case 0x2222: return 0x4A;
			case 0x2225: return 0x4B;
			case 0x2229: return 0x4C;
			case 0x222A: return 0x4D;
			case 0x223D: return 0x4E;
			case 0x2260: return 0x4F;
			case 0x2261: return 0x50;
			case 0x2282: return 0x51;
			case 0x22A5: return 0x52;
			case 0x2314: return 0x53;
			case 0x2394: return 0x54;
			case 0x2460: return 0x55;
			case 0x2461: return 0x56;
			case 0x2462: return 0x57;
			case 0x2463: return 0x58;
			case 0x2464: return 0x59;
			case 0x2465: return 0x5A;
			case 0x2466: return 0x5B;
			case 0x2467: return 0x5C;
			case 0x2468: return 0x5D;
			case 0x24EA: return 0x5E;
			case 0x24EB: return 0x5F;
			case 0x24EC: return 0x60;
			case 0x24ED: return 0x61;
			case 0x24EE: return 0x62;
			case 0x24EF: return 0x63;
			case 0x24F0: return 0x64;
			case 0x24F1: return 0x65;
			case 0x24F2: return 0x66;
			case 0x24F3: return 0x67;
			case 0x24F4: return 0x68;
			case 0x25A0: return 0x69;
			case 0x25A1: return 0x6A;
			case 0x25A8: return 0x6B;
			case 0x25AD: return 0x6C;
			case 0x25B2: return 0x6D;
			case 0x25B3: return 0x6E;
			case 0x25B4: return 0x6F;
			case 0x25C6: return 0x70;
			case 0x25C7: return 0x71;
			case 0x25C8: return 0x73;
			case 0x25C9: return 0x74;
			case 0x25CB: return 0x75;
			case 0x25CE: return 0x76;
			case 0x25CF: return 0x77;
			case 0x25EF: return 0x78;
			case 0x2610: return 0x79;
			case 0x261C: return 0x7A;
			case 0x261D: return 0x7B;
			case 0x261E: return 0x7C;
			case 0x261F: return 0x7D;
			case 0x262F: return 0x7E;
			case 0x2642: return 0x7F;
			case 0x2720: return 0x80;
			case 0x2723: return 0x81;
			case 0x273F: return 0x82;
			case 0x2748: return 0x83;
			case 0x2756: return 0x84;
			case 0x278A: return 0x85;
			case 0x278B: return 0x86;
			case 0x278C: return 0x87;
			case 0x278D: return 0x88;
			case 0x278E: return 0x89;
			case 0x278F: return 0x8A;
			case 0x2790: return 0x8B;
			case 0x2791: return 0x8C;
			case 0x2792: return 0x8D;
			case 0x2793: return 0x8E;
			case 0x27E1: return 0x8F;
			case 0x2934: return 0x90;
			case 0x2935: return 0x91;
			case 0x2936: return 0x92;
			case 0x2937: return 0x93;
			case 0x2939: return 0x94;
			case 0x2962: return 0x95;
			case 0x2964: return 0x96;
			case 0x2985: return 0x97;
			case 0x2986: return 0x98;
			case 0x29C8: return 0x99;
			case 0x2AFD: return 0x9A;
			case 0x3002: return 0x9B;
			case 0x3007: return 0x9C;
			case 0x3008: return 0x9D;
			case 0x3009: return 0x9E;
			case 0x300A: return 0x9F;
			case 0x300B: return 0xA0;
			case 0x300C: return 0xA1;
			case 0x300D: return 0xA2;
			case 0x300E: return 0xA3;
			case 0x300F: return 0xA4;
			case 0x3010: return 0xA5;
			case 0x3011: return 0xA6;
			case 0x3013: return 0xA7;
			case 0x3016: return 0xA8;
			case 0x3017: return 0xA9;
			case 0x3251: return 0xAA;
			case 0x3252: return 0xAB;
			case 0x3253: return 0xAC;
			case 0x3254: return 0xAD;
			case 0x3255: return 0xAE;
			case 0x3256: return 0xAF;
			case 0x3257: return 0xB0;
			case 0x3258: return 0xB1;
			case 0x3259: return 0xB2;
			case 0x325A: return 0xB3;
			case 0x329E: return 0xB4;
			case 0x4E00: return 0xB5;
			case 0x4E03: return 0xB7;
			case 0x4E09: return 0xB9;
			case 0x4E5D: return 0xBB;
			case 0x4E8C: return 0xBD;
			case 0x4E94: return 0xBF;
			case 0x4ED6: return 0xC1;
			case 0x4EE3: return 0xC2;
			case 0x4F8B: return 0xC3;
			case 0x516B: return 0xC4;
			case 0x516D: return 0xC6;
			case 0x51A0: return 0xC8;
			case 0x51F8: return 0xC9;
			case 0x51F9: return 0xCA;
			case 0x524D: return 0xCB;
			case 0x526F: return 0xCC;
			case 0x52A9: return 0xCD;
			case 0x52D5: return 0xCE;
			case 0x5341: return 0xCF;
			case 0x534D: return 0xD1;
			case 0x5370: return 0xD2;
			case 0x53C3: return 0xD3;
			case 0x53CD: return 0xD4;
			case 0x540D: return 0xD5;
			case 0x56DB: return 0xD6;
			case 0x570B: return 0xD8;
			case 0x571F: return 0xD9;
			case 0x5B50: return 0xDB;
			case 0x5E8F: return 0xDC;
			case 0x5F62: return 0xDD;
			case 0x5F71: return 0xDE;
			case 0x611F: return 0xDF;
			case 0x6163: return 0xE0;
			case 0x6307: return 0xE1;
			case 0x63A5: return 0xE2;
			case 0x65B0: return 0xE3;
			case 0x65E5: return 0xE4;
			case 0x6708: return 0xE6;
			case 0x6728: return 0xE8;
			case 0x672B: return 0xEA;
			case 0x672C: return 0xEB;
			case 0x6C34: return 0xEC;
			case 0x6CE8: return 0xEE;
			case 0x6D3E: return 0xEF;
			case 0x6E90: return 0xF0;
			case 0x706B: return 0xF1;
			case 0x73FE: return 0xF3;
			case 0x76EE: return 0xF4;
			case 0x7B54: return 0xF5;
			case 0x7BC0: return 0xF6;
			case 0x81EA: return 0xF7;
			case 0x8863: return 0xF8;
			case 0x88DC: return 0xF9;
			case 0x8A3B: return 0xFA;
			case 0x9023: return 0xFC;
			case 0x91D1: return 0xFD;
			case 0x9593: return 0xFF;
			case 0x96FB: return 0x100;
			case 0x982D: return 0x101;
			case 0xAC00: return 0x102;
			case 0xAC04: return 0x104;
			case 0xAC10: return 0x105;
			case 0xAC19: return 0x106;
			case 0xAC70: return 0x107;
			case 0xAC8C: return 0x108;
			case 0xAD00: return 0x109;
			case 0xAD50: return 0x10A;
			case 0xAD6D: return 0x10C;
			case 0xB098: return 0x10D;
			case 0xB0AE: return 0x10F;
			case 0xB192: return 0x111;
			case 0xB290: return 0x113;
			case 0xB2E4: return 0x115;
			case 0xB2E8: return 0x117;
			case 0xB2F5: return 0x119;
			case 0xB300: return 0x11C;
			case 0xB3D9: return 0x11D;
			case 0xB73B: return 0x11E;
			case 0xB77C: return 0x120;
			case 0xB9C8: return 0x122;
			case 0xBA85: return 0x124;
			case 0xBB38: return 0x125;
			case 0xBC14: return 0x127;
			case 0xBC18: return 0x129;
			case 0xBCC0: return 0x12B;
			case 0xBCF8: return 0x12C;
			case 0xBD80: return 0x12E;
			case 0xBE44: return 0x12F;
			case 0xBE60: return 0x131;
			case 0xC0AC: return 0x133;
			case 0xC0C1: return 0x135;
			case 0xC13C: return 0x136;
			case 0xC18C: return 0x138;
			case 0xC18D: return 0x139;
			case 0xC218: return 0x13A;
			case 0xC219: return 0x13B;
			case 0xC2DC: return 0x13C;
			case 0xC2E0: return 0x13E;
			case 0xC2E4: return 0x13F;
			case 0xC544: return 0x140;
			case 0xC57D: return 0x142;
			case 0xC5EC: return 0x143;
			case 0xC5ED: return 0x145;
			case 0xC608: return 0x147;
			case 0xC678: return 0x14A;
			case 0xC6B4: return 0x14C;
			case 0xC6D0: return 0x14D;
			case 0xC720: return 0x14E;
			case 0xC73C: return 0x14F;
			case 0xC74C: return 0x151;
			case 0xC774: return 0x154;
			case 0xC778: return 0x155;
			case 0xC77C: return 0x156;
			case 0xC785: return 0x157;
			case 0xC790: return 0x159;
			case 0xC791: return 0x15B;
			case 0xC804: return 0x15C;
			case 0xC811: return 0x15D;
			case 0xC815: return 0x15E;
			case 0xC81C: return 0x160;
			case 0xC870: return 0x162;
			case 0xC874: return 0x163;
			case 0xC8FC: return 0x165;
			case 0xC900: return 0x167;
			case 0xC911: return 0x169;
			case 0xC9C1: return 0x16A;
			case 0xCC28: return 0x16B;
			case 0xCC38: return 0x16D;
			case 0xCE74: return 0x16E;
			case 0xD0B9: return 0x170;
			case 0xD0C0: return 0x171;
			case 0xD30C: return 0x173;
			case 0xD45C: return 0x175;
			case 0xD558: return 0x177;
			case 0xD574: return 0x179;
			case 0xD615: return 0x17C;
			case 0xD65C: return 0x17D;
			case 0xD734: return 0x17E;
			case 0xF805: return 0x17F;
			case 0xF806: return 0x180;
			case 0xF809: return 0x181;
			case 0xF80B: return 0x182;
			case 0xF83D: return 0x183;
			case 0xF860: return 0x184;
			case 0xF861: return 0x1BC;
			case 0xF862: return 0x1DA;
			case 0xF863: return 0x205;
			case 0xF864: return 0x223;
			case 0xF865: return 0x232;
			case 0xF866: return 0x241;
			case 0xF867: return 0x250;
			case 0xFE59: return 0x252;
			case 0xFE5A: return 0x253;
			case 0xFF01: return 0x254;
			case 0xFF0A: return 0x255;
			case 0xFF3F: return 0x256;
			}
			return 0;
		}
		private int getNextState7(int input) {
			switch (input) {
			case 0x20DE: return 0x8;
			}
			return 0;
		}
		private int getNextState9(int input) {
			switch (input) {
			case 0x20DE: return 0xA;
			}
			return 0;
		}
		private int getNextState11(int input) {
			switch (input) {
			case 0x20DE: return 0xC;
			}
			return 0;
		}
		private int getNextState13(int input) {
			switch (input) {
			case 0x20DE: return 0xE;
			}
			return 0;
		}
		private int getNextState15(int input) {
			switch (input) {
			case 0x20DE: return 0x10;
			}
			return 0;
		}
		private int getNextState17(int input) {
			switch (input) {
			case 0x20DE: return 0x12;
			}
			return 0;
		}
		private int getNextState19(int input) {
			switch (input) {
			case 0x20DE: return 0x14;
			}
			return 0;
		}
		private int getNextState21(int input) {
			switch (input) {
			case 0x20DE: return 0x16;
			}
			return 0;
		}
		private int getNextState23(int input) {
			switch (input) {
			case 0x20DE: return 0x18;
			}
			return 0;
		}
		private int getNextState113(int input) {
			switch (input) {
			case 0x20DF: return 0x72;
			}
			return 0;
		}
		private int getNextState181(int input) {
			switch (input) {
			case 0x20DE: return 0xB6;
			}
			return 0;
		}
		private int getNextState183(int input) {
			switch (input) {
			case 0x20DE: return 0xB8;
			}
			return 0;
		}
		private int getNextState185(int input) {
			switch (input) {
			case 0x20DE: return 0xBA;
			}
			return 0;
		}
		private int getNextState187(int input) {
			switch (input) {
			case 0x20DE: return 0xBC;
			}
			return 0;
		}
		private int getNextState189(int input) {
			switch (input) {
			case 0x20DE: return 0xBE;
			}
			return 0;
		}
		private int getNextState191(int input) {
			switch (input) {
			case 0x20DE: return 0xC0;
			}
			return 0;
		}
		private int getNextState196(int input) {
			switch (input) {
			case 0x20DE: return 0xC5;
			}
			return 0;
		}
		private int getNextState198(int input) {
			switch (input) {
			case 0x20DE: return 0xC7;
			}
			return 0;
		}
		private int getNextState207(int input) {
			switch (input) {
			case 0x20DE: return 0xD0;
			}
			return 0;
		}
		private int getNextState214(int input) {
			switch (input) {
			case 0x20DE: return 0xD7;
			}
			return 0;
		}
		private int getNextState217(int input) {
			switch (input) {
			case 0x20DE: return 0xDA;
			}
			return 0;
		}
		private int getNextState228(int input) {
			switch (input) {
			case 0x20DE: return 0xE5;
			}
			return 0;
		}
		private int getNextState230(int input) {
			switch (input) {
			case 0x20DE: return 0xE7;
			}
			return 0;
		}
		private int getNextState232(int input) {
			switch (input) {
			case 0x20DE: return 0xE9;
			}
			return 0;
		}
		private int getNextState236(int input) {
			switch (input) {
			case 0x20DE: return 0xED;
			}
			return 0;
		}
		private int getNextState241(int input) {
			switch (input) {
			case 0x20DE: return 0xF2;
			}
			return 0;
		}
		private int getNextState250(int input) {
			switch (input) {
			case 0x20DE: return 0xFB;
			}
			return 0;
		}
		private int getNextState253(int input) {
			switch (input) {
			case 0x20DE: return 0xFE;
			}
			return 0;
		}
		private int getNextState258(int input) {
			switch (input) {
			case 0x20DD: return 0x103;
			}
			return 0;
		}
		private int getNextState266(int input) {
			switch (input) {
			case 0x20DE: return 0x10B;
			}
			return 0;
		}
		private int getNextState269(int input) {
			switch (input) {
			case 0x20DD: return 0x10E;
			}
			return 0;
		}
		private int getNextState271(int input) {
			switch (input) {
			case 0x20DD: return 0x110;
			}
			return 0;
		}
		private int getNextState273(int input) {
			switch (input) {
			case 0x20DD: return 0x112;
			}
			return 0;
		}
		private int getNextState275(int input) {
			switch (input) {
			case 0x20DD: return 0x114;
			}
			return 0;
		}
		private int getNextState277(int input) {
			switch (input) {
			case 0x20DD: return 0x116;
			}
			return 0;
		}
		private int getNextState279(int input) {
			switch (input) {
			case 0x20DD: return 0x118;
			}
			return 0;
		}
		private int getNextState281(int input) {
			switch (input) {
			case 0x20DD: return 0x11A;
			case 0x20DE: return 0x11B;
			}
			return 0;
		}
		private int getNextState286(int input) {
			switch (input) {
			case 0x20DE: return 0x11F;
			}
			return 0;
		}
		private int getNextState288(int input) {
			switch (input) {
			case 0x20DD: return 0x121;
			}
			return 0;
		}
		private int getNextState290(int input) {
			switch (input) {
			case 0x20DD: return 0x123;
			}
			return 0;
		}
		private int getNextState293(int input) {
			switch (input) {
			case 0x20DE: return 0x126;
			}
			return 0;
		}
		private int getNextState295(int input) {
			switch (input) {
			case 0x20DD: return 0x128;
			}
			return 0;
		}
		private int getNextState297(int input) {
			switch (input) {
			case 0x20DD: return 0x12A;
			}
			return 0;
		}
		private int getNextState300(int input) {
			switch (input) {
			case 0x20DD: return 0x12D;
			}
			return 0;
		}
		private int getNextState303(int input) {
			switch (input) {
			case 0x20DD: return 0x130;
			}
			return 0;
		}
		private int getNextState305(int input) {
			switch (input) {
			case 0x20DD: return 0x132;
			}
			return 0;
		}
		private int getNextState307(int input) {
			switch (input) {
			case 0x20DD: return 0x134;
			}
			return 0;
		}
		private int getNextState310(int input) {
			switch (input) {
			case 0x20DD: return 0x137;
			}
			return 0;
		}
		private int getNextState316(int input) {
			switch (input) {
			case 0x20DD: return 0x13D;
			}
			return 0;
		}
		private int getNextState320(int input) {
			switch (input) {
			case 0x20DD: return 0x141;
			}
			return 0;
		}
		private int getNextState323(int input) {
			switch (input) {
			case 0x20DD: return 0x144;
			}
			return 0;
		}
		private int getNextState325(int input) {
			switch (input) {
			case 0x20DE: return 0x146;
			}
			return 0;
		}
		private int getNextState327(int input) {
			switch (input) {
			case 0x20DD: return 0x148;
			case 0x20DE: return 0x149;
			}
			return 0;
		}
		private int getNextState330(int input) {
			switch (input) {
			case 0x20DD: return 0x14B;
			}
			return 0;
		}
		private int getNextState335(int input) {
			switch (input) {
			case 0x20DD: return 0x150;
			}
			return 0;
		}
		private int getNextState337(int input) {
			switch (input) {
			case 0x20DD: return 0x152;
			case 0x20DE: return 0x153;
			}
			return 0;
		}
		private int getNextState343(int input) {
			switch (input) {
			case 0x20DD: return 0x158;
			}
			return 0;
		}
		private int getNextState345(int input) {
			switch (input) {
			case 0x20DD: return 0x15A;
			}
			return 0;
		}
		private int getNextState350(int input) {
			switch (input) {
			case 0x20DE: return 0x15F;
			}
			return 0;
		}
		private int getNextState352(int input) {
			switch (input) {
			case 0x20DD: return 0x161;
			}
			return 0;
		}
		private int getNextState355(int input) {
			switch (input) {
			case 0x20DD: return 0x164;
			}
			return 0;
		}
		private int getNextState357(int input) {
			switch (input) {
			case 0x20DE: return 0x166;
			}
			return 0;
		}
		private int getNextState359(int input) {
			switch (input) {
			case 0x20DD: return 0x168;
			}
			return 0;
		}
		private int getNextState363(int input) {
			switch (input) {
			case 0x20DD: return 0x16C;
			}
			return 0;
		}
		private int getNextState366(int input) {
			switch (input) {
			case 0x20DD: return 0x16F;
			}
			return 0;
		}
		private int getNextState369(int input) {
			switch (input) {
			case 0x20DD: return 0x172;
			}
			return 0;
		}
		private int getNextState371(int input) {
			switch (input) {
			case 0x20DD: return 0x174;
			}
			return 0;
		}
		private int getNextState373(int input) {
			switch (input) {
			case 0x20DD: return 0x176;
			}
			return 0;
		}
		private int getNextState375(int input) {
			switch (input) {
			case 0x20DD: return 0x178;
			}
			return 0;
		}
		private int getNextState377(int input) {
			switch (input) {
			case 0x20DD: return 0x17A;
			case 0x20DE: return 0x17B;
			}
			return 0;
		}
		private int getNextState388(int input) {
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x186;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x1A0;
			switch (input) {
			case 0x2A: return 0x185;
			case 0x2020: return 0x1BA;
			case 0x2021: return 0x1BB;
			}
			return 0;
		}
		private int getNextState444(int input) {
			switch (input) {
			case 0x28: return 0x1BD;
			case 0x2020: return 0x1D8;
			}
			return 0;
		}
		private int getNextState445(int input) {
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x1BE;
			return 0;
		}
		private int getNextState472(int input) {
			switch (input) {
			case 0x2020: return 0x1D9;
			}
			return 0;
		}
		private int getNextState474(int input) {
			switch (input) {
			case 0x28: return 0x1DB;
			case 0x5B: return 0x1E8;
			case 0xC8FC: return 0x202;
			}
			return 0;
		}
		private int getNextState475(int input) {
			switch (input) {
			case 0x32: return 0x1DC;
			case 0x33: return 0x1E6;
			}
			return 0;
		}
		private int getNextState476(int input) {
			switch (input) {
			case 0x31: return 0x1DD;
			case 0x32: return 0x1DE;
			case 0x33: return 0x1DF;
			case 0x34: return 0x1E0;
			case 0x35: return 0x1E1;
			case 0x36: return 0x1E2;
			case 0x37: return 0x1E3;
			case 0x38: return 0x1E4;
			case 0x39: return 0x1E5;
			}
			return 0;
		}
		private int getNextState486(int input) {
			switch (input) {
			case 0x30: return 0x1E7;
			}
			return 0;
		}
		private int getNextState488(int input) {
			switch (input) {
			case 0x31: return 0x1E9;
			case 0x32: return 0x1F4;
			case 0x4E8C: return 0x1F6;
			case 0x5341: return 0x1F8;
			}
			return 0;
		}
		private int getNextState489(int input) {
			switch (input) {
			case 0x30: return 0x1EA;
			case 0x31: return 0x1EB;
			case 0x32: return 0x1EC;
			case 0x33: return 0x1ED;
			case 0x34: return 0x1EE;
			case 0x35: return 0x1EF;
			case 0x36: return 0x1F0;
			case 0x37: return 0x1F1;
			case 0x38: return 0x1F2;
			case 0x39: return 0x1F3;
			}
			return 0;
		}
		private int getNextState500(int input) {
			switch (input) {
			case 0x30: return 0x1F5;
			}
			return 0;
		}
		private int getNextState502(int input) {
			switch (input) {
			case 0x5341: return 0x1F7;
			}
			return 0;
		}
		private int getNextState504(int input) {
			switch (input) {
			case 0x4E00: return 0x1F9;
			case 0x4E03: return 0x1FA;
			case 0x4E09: return 0x1FB;
			case 0x4E5D: return 0x1FC;
			case 0x4E8C: return 0x1FD;
			case 0x4E94: return 0x1FE;
			case 0x516B: return 0x1FF;
			case 0x516D: return 0x200;
			case 0x56DB: return 0x201;
			}
			return 0;
		}
		private int getNextState514(int input) {
			switch (input) {
			case 0xC2DD: return 0x203;
			}
			return 0;
		}
		private int getNextState515(int input) {
			switch (input) {
			case 0xD68C: return 0x204;
			}
			return 0;
		}
		private int getNextState517(int input) {
			switch (input) {
			case 0x5B: return 0x206;
			case 0xC8FC: return 0x220;
			}
			return 0;
		}
		private int getNextState518(int input) {
			switch (input) {
			case 0x31: return 0x207;
			case 0x32: return 0x212;
			case 0x4E8C: return 0x214;
			case 0x5341: return 0x216;
			}
			return 0;
		}
		private int getNextState519(int input) {
			switch (input) {
			case 0x30: return 0x208;
			case 0x31: return 0x209;
			case 0x32: return 0x20A;
			case 0x33: return 0x20B;
			case 0x34: return 0x20C;
			case 0x35: return 0x20D;
			case 0x36: return 0x20E;
			case 0x37: return 0x20F;
			case 0x38: return 0x210;
			case 0x39: return 0x211;
			}
			return 0;
		}
		private int getNextState530(int input) {
			switch (input) {
			case 0x30: return 0x213;
			}
			return 0;
		}
		private int getNextState532(int input) {
			switch (input) {
			case 0x5341: return 0x215;
			}
			return 0;
		}
		private int getNextState534(int input) {
			switch (input) {
			case 0x4E00: return 0x217;
			case 0x4E03: return 0x218;
			case 0x4E09: return 0x219;
			case 0x4E5D: return 0x21A;
			case 0x4E8C: return 0x21B;
			case 0x4E94: return 0x21C;
			case 0x516B: return 0x21D;
			case 0x516D: return 0x21E;
			case 0x56DB: return 0x21F;
			}
			return 0;
		}
		private int getNextState544(int input) {
			switch (input) {
			case 0xC2DD: return 0x221;
			}
			return 0;
		}
		private int getNextState545(int input) {
			switch (input) {
			case 0xD68C: return 0x222;
			}
			return 0;
		}
		private int getNextState547(int input) {
			switch (input) {
			case 0x5B: return 0x224;
			}
			return 0;
		}
		private int getNextState548(int input) {
			switch (input) {
			case 0x31: return 0x225;
			case 0x32: return 0x230;
			}
			return 0;
		}
		private int getNextState549(int input) {
			switch (input) {
			case 0x30: return 0x226;
			case 0x31: return 0x227;
			case 0x32: return 0x228;
			case 0x33: return 0x229;
			case 0x34: return 0x22A;
			case 0x35: return 0x22B;
			case 0x36: return 0x22C;
			case 0x37: return 0x22D;
			case 0x38: return 0x22E;
			case 0x39: return 0x22F;
			}
			return 0;
		}
		private int getNextState560(int input) {
			switch (input) {
			case 0x30: return 0x231;
			}
			return 0;
		}
		private int getNextState562(int input) {
			switch (input) {
			case 0x5B: return 0x233;
			}
			return 0;
		}
		private int getNextState563(int input) {
			switch (input) {
			case 0x31: return 0x234;
			case 0x32: return 0x23F;
			}
			return 0;
		}
		private int getNextState564(int input) {
			switch (input) {
			case 0x30: return 0x235;
			case 0x31: return 0x236;
			case 0x32: return 0x237;
			case 0x33: return 0x238;
			case 0x34: return 0x239;
			case 0x35: return 0x23A;
			case 0x36: return 0x23B;
			case 0x37: return 0x23C;
			case 0x38: return 0x23D;
			case 0x39: return 0x23E;
			}
			return 0;
		}
		private int getNextState575(int input) {
			switch (input) {
			case 0x30: return 0x240;
			}
			return 0;
		}
		private int getNextState577(int input) {
			switch (input) {
			case 0x5B: return 0x242;
			}
			return 0;
		}
		private int getNextState578(int input) {
			switch (input) {
			case 0x31: return 0x243;
			case 0x32: return 0x24E;
			}
			return 0;
		}
		private int getNextState579(int input) {
			switch (input) {
			case 0x30: return 0x244;
			case 0x31: return 0x245;
			case 0x32: return 0x246;
			case 0x33: return 0x247;
			case 0x34: return 0x248;
			case 0x35: return 0x249;
			case 0x36: return 0x24A;
			case 0x37: return 0x24B;
			case 0x38: return 0x24C;
			case 0x39: return 0x24D;
			}
			return 0;
		}
		private int getNextState590(int input) {
			switch (input) {
			case 0x30: return 0x24F;
			}
			return 0;
		}
		private int getNextState592(int input) {
			switch (input) {
			case 0x2A: return 0x251;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 7: return getNextState7(input);
			case 9: return getNextState9(input);
			case 11: return getNextState11(input);
			case 13: return getNextState13(input);
			case 15: return getNextState15(input);
			case 17: return getNextState17(input);
			case 19: return getNextState19(input);
			case 21: return getNextState21(input);
			case 23: return getNextState23(input);
			case 113: return getNextState113(input);
			case 181: return getNextState181(input);
			case 183: return getNextState183(input);
			case 185: return getNextState185(input);
			case 187: return getNextState187(input);
			case 189: return getNextState189(input);
			case 191: return getNextState191(input);
			case 196: return getNextState196(input);
			case 198: return getNextState198(input);
			case 207: return getNextState207(input);
			case 214: return getNextState214(input);
			case 217: return getNextState217(input);
			case 228: return getNextState228(input);
			case 230: return getNextState230(input);
			case 232: return getNextState232(input);
			case 236: return getNextState236(input);
			case 241: return getNextState241(input);
			case 250: return getNextState250(input);
			case 253: return getNextState253(input);
			case 258: return getNextState258(input);
			case 266: return getNextState266(input);
			case 269: return getNextState269(input);
			case 271: return getNextState271(input);
			case 273: return getNextState273(input);
			case 275: return getNextState275(input);
			case 277: return getNextState277(input);
			case 279: return getNextState279(input);
			case 281: return getNextState281(input);
			case 286: return getNextState286(input);
			case 288: return getNextState288(input);
			case 290: return getNextState290(input);
			case 293: return getNextState293(input);
			case 295: return getNextState295(input);
			case 297: return getNextState297(input);
			case 300: return getNextState300(input);
			case 303: return getNextState303(input);
			case 305: return getNextState305(input);
			case 307: return getNextState307(input);
			case 310: return getNextState310(input);
			case 316: return getNextState316(input);
			case 320: return getNextState320(input);
			case 323: return getNextState323(input);
			case 325: return getNextState325(input);
			case 327: return getNextState327(input);
			case 330: return getNextState330(input);
			case 335: return getNextState335(input);
			case 337: return getNextState337(input);
			case 343: return getNextState343(input);
			case 345: return getNextState345(input);
			case 350: return getNextState350(input);
			case 352: return getNextState352(input);
			case 355: return getNextState355(input);
			case 357: return getNextState357(input);
			case 359: return getNextState359(input);
			case 363: return getNextState363(input);
			case 366: return getNextState366(input);
			case 369: return getNextState369(input);
			case 371: return getNextState371(input);
			case 373: return getNextState373(input);
			case 375: return getNextState375(input);
			case 377: return getNextState377(input);
			case 388: return getNextState388(input);
			case 444: return getNextState444(input);
			case 445: return getNextState445(input);
			case 472: return getNextState472(input);
			case 474: return getNextState474(input);
			case 475: return getNextState475(input);
			case 476: return getNextState476(input);
			case 486: return getNextState486(input);
			case 488: return getNextState488(input);
			case 489: return getNextState489(input);
			case 500: return getNextState500(input);
			case 502: return getNextState502(input);
			case 504: return getNextState504(input);
			case 514: return getNextState514(input);
			case 515: return getNextState515(input);
			case 517: return getNextState517(input);
			case 518: return getNextState518(input);
			case 519: return getNextState519(input);
			case 530: return getNextState530(input);
			case 532: return getNextState532(input);
			case 534: return getNextState534(input);
			case 544: return getNextState544(input);
			case 545: return getNextState545(input);
			case 547: return getNextState547(input);
			case 548: return getNextState548(input);
			case 549: return getNextState549(input);
			case 560: return getNextState560(input);
			case 562: return getNextState562(input);
			case 563: return getNextState563(input);
			case 564: return getNextState564(input);
			case 575: return getNextState575(input);
			case 577: return getNextState577(input);
			case 578: return getNextState578(input);
			case 579: return getNextState579(input);
			case 590: return getNextState590(input);
			case 592: return getNextState592(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u0080\uAEA2\uCBA1\uCCA1\uB4A2\uCDA1\u0000\uD7A1\uA7A1\u0083\uA3A8\u5CA6\uFEA1\u0000\u0000\u0000\uC6A1\uBEA1\uF7A9\uF8A9\uA5A2\u0000\uD2A2\uA4A1\uACA2\uF6A9\uACA8\u5DA6\uF9A8\uF6A8\uFAA8\uAFA2\u0000\u0000\u0000\u0000\u0000\u0000\uA1A8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA2A8\u0000\u0000\u0000\u0000\u0000\u0000\uBFA1\uAAA8\u0000\u0000\u0000\u0000\u0000\uADA8\uACA9\u0000\u0000\u0000\u0000\u0000\u0000\uA1A9\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA3A9\u0000\u0000\u0000\u0000\u0000\u0000\uC0A1\uAAA9\u0000\u0000\u0000\u0000\u0000\uADA9".toCharArray();
		}
		private static final char[] GETOUTPUT0_391 = getOutput0_391();
		private static final char[] getOutput0_391() {
			return "\uC1A5\uC2A5\uC3A5\uC4A5\uC5A5\uC6A5\uC7A5\uC8A5\uC9A5\uCAA5\uCBA5\uCCA5\uCDA5\uCEA5\uCFA5\uD0A5\uD1A5\u0000\uD2A5\uD3A5\uD4A5\uD5A5\uD6A5\uD7A5\uD8A5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uE1A5\uE2A5\uE3A5\uE4A5\uE5A5\uE6A5\uE7A5\uE8A5\uE9A5\uEAA5\uEBA5\uECA5\uEDA5\uEEA5\uEFA5\uF0A5\uF1A5\u0000\uF2A5\uF3A5\uF4A5\uF5A5\uF6A5\uF7A5\uF8A5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u6AA7".toCharArray();
		}
		private static final char[] GETOUTPUT0_2013 = getOutput0_2013();
		private static final char[] getOutput0_2013() {
			return "\uA9A1\uAAA1\u0000\uABA1\u0000\uAEA1\uAFA1\u0000\u70A1\uB0A1\uB1A1\u0000\u6FA1\uD3A2\uD4A2\u55A6\u0000\u0000\uA5A1\uA6A1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uB6A2\u0000\uC7A1\uC8A1\uDEA5\uADAD\uABAD\u0000\u0000\u5AA6\u5BA6\uD8A1\u84A7\u0000\uFEA3\u0000\u0000\u0000\u4DA6\u0000\u0000\u0000\u0000\u87A7\u0000\u85A7\u0000\u0000\u96A1\u97A1\u4EA6\u0000\u0000\u6DA1".toCharArray();
		}
		private static final char[] GETOUTPUT0_21B0 = getOutput0_21B0();
		private static final char[] getOutput0_21B0() {
			return "\u82A8\u7CA8\u7BA8\u83A8\u81A8\u0000\u50AC\u51AC\u0000\u0000\u0000\u0000\u92A8\u0000\u0000\u0000\u93A8\u0000\u0000\u0000\u9EA8\u9FA8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u4BA8\u0000\u4AA8\u49A8\u0000\uA1A2\u0000\uA2A2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u6AAC\u6CAC\u6BAC\u6DAC\u0000\u0000\u72AC\u74AC\u73AC\u75AC\u0000\u0000\u0000\u0000\u0000\u0000\u41AC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA3A2\u0000\uD3A1\uA4A2\u0000\u0000\u51A7\uD4A1\uF4A1\u73A7\u0000\uF5A1\u74A7\u0000\u0000\uB3A2\u0000\uB2A2\u0000\u5CA7\u0000\u0000\u0000\u0000\u0000\u0000\uEEA1\u0000\u0000\uF0A1\uC4A1\u53A7\uD0A1\u0000\u68A7\u0000\u0000\u55A7\u56A7\uFCA1\uFDA1\uFBA1\uFAA1\uF2A1\uF3A1\u0000\uB1A2\u0000\u0000\u0000\u0000\u0000\uC5A1\uF1A1\u0000\uFEA2\u0000\u0000\u0000\u0000\u0000\uEFA1\u0000\u0000\u0000\u0000\u0000\u9AA4\u0000\u99A4\u0000\u0000\u9BA4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u69A7\u59A7\uD6A1\u58A7\u0000\u0000\u0000\u0000\u0000\u0000\u77A7\u0000\u0000\u0000\u0000\u0000\uC1A1\uD5A1\u64A7\u0000\uC2A1\uC3A1\u5AA7\u5BA7\u0000\u0000\uECA1\uEDA1\u0000\u0000\u6FA7\u70A7\u87A4\u88A4\u89A4\u8AA4\u0000\u0000\u8FA4\u90A4\u0000\u91A4\u81A4\u82A4\u0000\u0000\u0000\u0000\u85A4\u86A4\uF8A1\uF9A1\u72A7\u71A7\uF6A1\uF7A1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u5DA7\u5EA7\u5FA7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u6CA7\u9DA4\uD1A1".toCharArray();
		}
		private static final char[] GETOUTPUT0_2460 = getOutput0_2460();
		private static final char[] getOutput0_2460() {
			return "\uE7A8\uE8A8\uE9A8\uEAA8\uEBA8\uECA8\uEDA8\uEEA8\uEFA8\uF0A8\uF1A8\uF2A8\uF3A8\uF4A8\uF5A8\uF0A7\uF1A7\uF2A7\uF3A7\uF4A7\uE7A9\uE8A9\uE9A9\uEAA9\uEBA9\uECA9\uEDA9\uEEA9\uEFA9\uF0A9\uF1A9\uF2A9\uF3A9\uF4A9\uF5A9\uF4AA\uF5AA\uF6AA\uF7AA\uF8AA".toCharArray();
		}
		private static final char[] GETOUTPUT0_249C = getOutput0_249C();
		private static final char[] getOutput0_249C() {
			return "\uCDA9\uCEA9\uCFA9\uD0A9\uD1A9\uD2A9\uD3A9\uD4A9\uD5A9\uD6A9\uD7A9\uD8A9\uD9A9\uDAA9\uDBA9\uDCA9\uDDA9\uDEA9\uDFA9\uE0A9\uE1A9\uE2A9\uE3A9\uE4A9\uE5A9\uE6A9\u86A3\u87A3\u88A3\u89A3\u8AA3\u8BA3\u8CA3\u8DA3\u8EA3\u8FA3\u90A3\u91A3\u92A3\u93A3\u94A3\u95A3\u96A3\u97A3\u98A3\u99A3\u9AA3\u9BA3\u9CA3\u9DA3\u9EA3\u9FA3\uCDA8\uCEA8\uCFA8\uD0A8\uD1A8\uD2A8\uD3A8\uD4A8\uD5A8\uD6A8\uD7A8\uD8A8\uD9A8\uDAA8\uDBA8\uDCA8\uDDA8\uDEA8\uDFA8\uE0A8\uE1A8\uE2A8\uE3A8\uE4A8\uE5A8\uE6A8\u0000\uEFA6\uF0A6\uF1A6\uF2A6\uF3A6\uF4A6\uF5A6\uF6A6\uF7A6\uF8A6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA1A6\uACA6\uA2A6\uADA6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA3A6\uC8A6\uC7A6\uAEA6\uA4A6\uC2A6\uC1A6\uAFA6\uA6A6\uC6A6\uC5A6\uB1A6\uA5A6\uC4A6\uC3A6\uB0A6\uA7A6\uBCA6\uC9A6\uCAA6\uB7A6\uCBA6\uCCA6\uB2A6\uA9A6\uBEA6\uCDA6\uCEA6\uB9A6\uCFA6\uD0A6\uB4A6\uA8A6\uD1A6\uD2A6\uB8A6\uBDA6\uD3A6\uD4A6\uB3A6\uAAA6\uD5A6\uD6A6\uBAA6\uBFA6\uD7A6\uD8A6\uB5A6\uABA6\uD9A6\uDAA6\uBBA6\uDBA6\uDCA6\uC0A6\uDDA6\uDEA6\uDFA6\uE0A6\uE1A6\uE2A6\uE3A6\uE4A6\uB6A6".toCharArray();
		}
		private static final char[] GETOUTPUT0_2588 = getOutput0_2588();
		private static final char[] getOutput0_2588() {
			return "\u8FA7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uC6A2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uE1A1\uE0A1\u78A6\uC3A2\uC7A2\uC8A2\uCBA2\uCAA2\uC9A2\uCCA2\u0000\u0000\u0000\u4AA7\u0000\u0000\u0000\u66A7\uE3A1\uE2A1\u0000\u95A7\uBAA2\uB9A2\u0000\u96A7\u0000\u0000\uE5A1\uE4A1\u0000\u94A7\uB8A2\uB7A2\u0000\u97A7\u0000\u0000\uDFA1\uDEA1\uC2A2\uC1A2\u9CA7\uDBA1\u75A6\u84A6\uDDA1\uDCA1\uC4A2\uC5A2".toCharArray();
		}
		private static final char[] GETOUTPUT0_25E6 = getOutput0_25E6();
		private static final char[] getOutput0_25E6() {
			return "\u90A7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u6FA6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u46A7\u9AA7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uDAA1\uD9A1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uCFA2\uCEA2\u77A6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uD0A2\u8DAC\uD1A2\u8EAC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u93A6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uCFA1\u0000\uCEA1".toCharArray();
		}
		private static final char[] GETOUTPUT0_2776 = getOutput0_2776();
		private static final char[] getOutput0_2776() {
			return "\uE5A6\uE6A6\uE7A6\uE8A6\uE9A6\uEAA6\uEBA6\uECA6\uEDA6\uEEA6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u55A3\u56A3\u57A3\u58A3\u59A3\u5AA3\u5BA3\u5CA3\u5DA3\u5EA3\u5EAC\u0000\u0000\u0000\u0000\u0000\u0000\u6AA8\u60A8\u0000\u78A8\u0000\u0000\u74A8\u0000\u0000\u48AC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u5CA8\u0000\u0000\u43AC".toCharArray();
		}
		private static final char[] GETOUTPUT0_3000 = getOutput0_3000();
		private static final char[] getOutput0_3000() {
			return "\uA1A1\uA2A1\uA3A1\uA8A1\u0000\u0000\u0000\u0000\uB4A1\uB5A1\uB6A1\uB7A1\uB8A1\uB9A1\uBAA1\uBBA1\uBCA1\uBDA1\u42A7\uEBA1\uB2A1\uB3A1\u5DA1\u5EA1\u5FA1\u60A1\u0000\u0000\uADA1\u0000\uA9AD\uAAAD\u9EA6".toCharArray();
		}
		private static final char[] GETOUTPUT0_3036 = getOutput0_3036();
		private static final char[] getOutput0_3036() {
			return "\u43A7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA1AA\uA2AA\uA3AA\uA4AA\uA5AA\uA6AA\uA7AA\uA8AA\uA9AA\uAAAA\uABAA\uACAA\uADAA\uAEAA\uAFAA\uB0AA\uB1AA\uB2AA\uB3AA\uB4AA\uB5AA\uB6AA\uB7AA\uB8AA\uB9AA\uBAAA\uBBAA\uBCAA\uBDAA\uBEAA\uBFAA\uC0AA\uC1AA\uC2AA\uC3AA\uC4AA\uC5AA\uC6AA\uC7AA\uC8AA\uC9AA\uCAAA\uCBAA\uCCAA\uCDAA\uCEAA\uCFAA\uD0AA\uD1AA\uD2AA\uD3AA\uD4AA\uD5AA\uD6AA\uD7AA\uD8AA\uD9AA\uDAAA\uDBAA\uDCAA\uDDAA\uDEAA\uDFAA\uE0AA\uE1AA\uE2AA\uE3AA\uE4AA\uE5AA\uE6AA\uE7AA\uE8AA\uE9AA\uEAAA\uEBAA\uECAA\uEDAA\uEEAA\uEFAA\uF0AA\uF1AA\uF2AA\uF3AA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA1AB\uA2AB\uA3AB\uA4AB\uA5AB\uA6AB\uA7AB\uA8AB\uA9AB\uAAAB\uABAB\uACAB\uADAB\uAEAB\uAFAB\uB0AB\uB1AB\uB2AB\uB3AB\uB4AB\uB5AB\uB6AB\uB7AB\uB8AB\uB9AB\uBAAB\uBBAB\uBCAB\uBDAB\uBEAB\uBFAB\uC0AB\uC1AB\uC2AB\uC3AB\uC4AB\uC5AB\uC6AB\uC7AB\uC8AB\uC9AB\uCAAB\uCBAB\uCCAB\uCDAB\uCEAB\uCFAB\uD0AB\uD1AB\uD2AB\uD3AB\uD4AB\uD5AB\uD6AB\uD7AB\uD8AB\uD9AB\uDAAB\uDBAB\uDCAB\uDDAB\uDEAB\uDFAB\uE0AB\uE1AB\uE2AB\uE3AB\uE4AB\uE5AB\uE6AB\uE7AB\uE8AB\uE9AB\uEAAB\uEBAB\uECAB\uEDAB\uEEAB\uEFAB\uF0AB\uF1AB\uF2AB\uF3AB\uF4AB\uF5AB\uF6AB".toCharArray();
		}
		private static final char[] GETOUTPUT0_3251 = getOutput0_3251();
		private static final char[] getOutput0_3251() {
			return "\uF5A7\uF6A7\uF7A7\uF8A7\uF9A7\uFAA7\uFBA7\uFCA7\uFDA7\uFEA7\u0000\u0000\u0000\u0000\u0000\uB1A8\uB2A8\uB3A8\uB4A8\uB5A8\uB6A8\uB7A8\uB8A8\uB9A8\uBAA8\uBBA8\uBCA8\uBDA8\uBEA8\uBFA8\uC0A8\uC1A8\uC2A8\uC3A8\uC4A8\uC5A8\uC6A8\uC7A8\uC8A8\uC9A8\uCAA8\uCBA8\uCCA8\u0000\u0000\u0000\uDEA2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u71AD\u72AD\u73AD\u74AD\u75AD\u76AD\u70AD\u0000\u0000\u0000\u5CAB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u82A7\u0000\u0000\u0000\u0000\u0000\u0000\u6CAB".toCharArray();
		}
		private static final char[] GETOUTPUT0_3380 = getOutput0_3380();
		private static final char[] getOutput0_3380() {
			return "\uC9A7\uCAA7\uCBA7\uCCA7\uCDA7\u0000\u0000\u0000\uBAA7\uBBA7\uDCA7\uDDA7\uDEA7\uB6A7\uB7A7\uB8A7\uD4A7\uD5A7\uD6A7\uD7A7\uD8A7\uA1A7\uA2A7\uA3A7\uA5A7\uABA7\uACA7\uADA7\uAEA7\uAFA7\uB0A7\uB1A7\uB2A7\uB3A7\uB4A7\uA7A7\uA8A7\uA9A7\uAAA7\uBDA7\uBEA7\uE5A7\uE6A7\uE7A7\uE8A7\uE1A7\uE2A7\uE3A7\uBFA7\uC0A7\uC1A7\uC2A7\uC3A7\uC4A7\uC5A7\uC6A7\uC7A7\uC8A7\uCEA7\uCFA7\uD0A7\uD1A7\uD2A7\uD3A7\uDAA7\uDBA7\uE3A2\uECA7\uA6A7\uE0A7\uEFA7\uE1A2\uBCA7\uEDA7\uB5A7\u9FA7\u0000\u0000\u0000\uB9A7\uEAA7\u0000\u0000\uEBA7\u0000\u0000\uDFA7\u0000\uE4A2\u0000\u0000\uE4A7\uEEA7\uE9A7".toCharArray();
		}
		private static final char[] GETOUTPUT0_F83D = getOutput0_F83D();
		private static final char[] getOutput0_F83D() {
			return "\u42A6\u0000\u0000\u6EA1\u94A8\u54AC\u42AC\u49AC\u5FAC\u67A8\u68A8\u9DA8\u9CA8\u4BAC\u4AAC\u47A7\u4BA7\u4CA7\u4DA7".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x85 && input <= 0x9F) return input - 0x85 + 0x85;
			if (input >= 0xA0 && input <= 0xFE) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x391 && input <= 0x3D5) return GETOUTPUT0_391[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON534[input - 0x401];
			if (input >= 0x2013 && input <= 0x2051) return GETOUTPUT0_2013[input - 0x2013];
			if (input >= 0x2153 && input <= 0x2179) return CommonSubtables.COMMON535[input - 0x2153];
			if (input >= 0x21B0 && input <= 0x22A5) return GETOUTPUT0_21B0[input - 0x21B0];
			if (input >= 0x2460 && input <= 0x2487) return GETOUTPUT0_2460[input - 0x2460];
			if (input >= 0x249C && input <= 0x254B) return GETOUTPUT0_249C[input - 0x249C];
			if (input >= 0x2588 && input <= 0x25D1) return GETOUTPUT0_2588[input - 0x2588];
			if (input >= 0x25E6 && input <= 0x2642) return GETOUTPUT0_25E6[input - 0x25E6];
			if (input >= 0x2776 && input <= 0x27B5) return GETOUTPUT0_2776[input - 0x2776];
			if (input >= 0x3000 && input <= 0x3020) return GETOUTPUT0_3000[input - 0x3000];
			if (input >= 0x3036 && input <= 0x30F6) return GETOUTPUT0_3036[input - 0x3036];
			if (input >= 0x3131 && input <= 0x318E) return CommonSubtables.COMMON544[input - 0x3131];
			if (input >= 0x3200 && input <= 0x321C) return CommonSubtables.COMMON545[input - 0x3200];
			if (input >= 0x3251 && input <= 0x32A5) return GETOUTPUT0_3251[input - 0x3251];
			if (input >= 0x3380 && input <= 0x33DD) return GETOUTPUT0_3380[input - 0x3380];
			if (input >= 0x4E00 && input <= 0x4F11) return CommonSubtables.COMMON990[input - 0x4E00];
			if (input >= 0x4F2F && input <= 0x5099) return CommonSubtables.COMMON991[input - 0x4F2F];
			if (input >= 0x50AC && input <= 0x52AB) return CommonSubtables.COMMON992[input - 0x50AC];
			if (input >= 0x52BE && input <= 0x5451) return CommonSubtables.COMMON993[input - 0x52BE];
			if (input >= 0x557C && input <= 0x55AE) return CommonSubtables.COMMON994[input - 0x557C];
			if (input >= 0x56A5 && input <= 0x57A3) return CommonSubtables.COMMON995[input - 0x56A5];
			if (input >= 0x57C3 && input <= 0x580A) return CommonSubtables.COMMON996[input - 0x57C3];
			if (input >= 0x581E && input <= 0x58FD) return CommonSubtables.COMMON997[input - 0x581E];
			if (input >= 0x590F && input <= 0x5A66) return CommonSubtables.COMMON998[input - 0x590F];
			if (input >= 0x5B40 && input <= 0x5C79) return CommonSubtables.COMMON999[input - 0x5B40];
			if (input >= 0x5CD9 && input <= 0x5D29) return CommonSubtables.COMMON1000[input - 0x5CD9];
			if (input >= 0x5D9D && input <= 0x602F) return CommonSubtables.COMMON1001[input - 0x5D9D];
			if (input >= 0x6041 && input <= 0x6070) return CommonSubtables.COMMON1002[input - 0x6041];
			if (input >= 0x6085 && input <= 0x61CB) return CommonSubtables.COMMON1003[input - 0x6085];
			if (input >= 0x61E6 && input <= 0x6258) return CommonSubtables.COMMON1004[input - 0x61E6];
			if (input >= 0x626E && input <= 0x6311) return CommonSubtables.COMMON1005[input - 0x626E];
			if (input >= 0x6367 && input <= 0x63AA) return CommonSubtables.COMMON1006[input - 0x6367];
			if (input >= 0x6458 && input <= 0x6504) return CommonSubtables.COMMON1007[input - 0x6458];
			if (input >= 0x6518 && input <= 0x679D) return CommonSubtables.COMMON1008[input - 0x6518];
			if (input >= 0x67AF && input <= 0x67FE) return CommonSubtables.COMMON1009[input - 0x67AF];
			if (input >= 0x6812 && input <= 0x6854) return CommonSubtables.COMMON1010[input - 0x6812];
			if (input >= 0x686D && input <= 0x6912) return CommonSubtables.COMMON1011[input - 0x686D];
			if (input >= 0x6927 && input <= 0x6979) return CommonSubtables.COMMON1188[input - 0x6927];
			if (input >= 0x6A80 && input <= 0x6ADB) return CommonSubtables.COMMON1012[input - 0x6A80];
			if (input >= 0x6AF6 && input <= 0x6BEC) return CommonSubtables.COMMON1013[input - 0x6AF6];
			if (input >= 0x6C08 && input <= 0x6CF3) return CommonSubtables.COMMON1014[input - 0x6C08];
			if (input >= 0x6D0B && input <= 0x6D41) return CommonSubtables.COMMON577[input - 0x6D0B];
			if (input >= 0x6D59 && input <= 0x6D95) return CommonSubtables.COMMON578[input - 0x6D59];
			if (input >= 0x6DAF && input <= 0x6DFB) return CommonSubtables.COMMON1015[input - 0x6DAF];
			if (input >= 0x6E17 && input <= 0x6E7A) return CommonSubtables.COMMON580[input - 0x6E17];
			if (input >= 0x6E90 && input <= 0x6ED4) return CommonSubtables.COMMON1016[input - 0x6E90];
			if (input >= 0x6EEF && input <= 0x70DF) return CommonSubtables.COMMON1017[input - 0x6EEF];
			if (input >= 0x70F1 && input <= 0x7281) return CommonSubtables.COMMON1018[input - 0x70F1];
			if (input >= 0x72A2 && input <= 0x7626) return CommonSubtables.COMMON1019[input - 0x72A2];
			if (input >= 0x763B && input <= 0x7693) return CommonSubtables.COMMON1020[input - 0x763B];
			if (input >= 0x76AE && input <= 0x770B) return CommonSubtables.COMMON1021[input - 0x76AE];
			if (input >= 0x771E && input <= 0x77BF) return CommonSubtables.COMMON1022[input - 0x771E];
			if (input >= 0x7825 && input <= 0x78D0) return CommonSubtables.COMMON1023[input - 0x7825];
			if (input >= 0x792A && input <= 0x7991) return CommonSubtables.COMMON1024[input - 0x792A];
			if (input >= 0x79A6 && input <= 0x79E9) return CommonSubtables.COMMON1025[input - 0x79A6];
			if (input >= 0x79FB && input <= 0x7BE9) return CommonSubtables.COMMON1026[input - 0x79FB];
			if (input >= 0x7C60 && input <= 0x7CE7) return CommonSubtables.COMMON1027[input - 0x7C60];
			if (input >= 0x7CFB && input <= 0x7E9C) return CommonSubtables.COMMON1028[input - 0x7CFB];
			if (input >= 0x7F6A && input <= 0x8018) return CommonSubtables.COMMON1029[input - 0x7F6A];
			if (input >= 0x802D && input <= 0x8247) return CommonSubtables.COMMON1030[input - 0x802D];
			if (input >= 0x8259 && input <= 0x82BF) return CommonSubtables.COMMON1031[input - 0x8259];
			if (input >= 0x82D1 && input <= 0x8352) return CommonSubtables.COMMON1032[input - 0x82D1];
			if (input >= 0x83BD && input <= 0x840E) return CommonSubtables.COMMON1033[input - 0x83BD];
			if (input >= 0x8429 && input <= 0x847A) return CommonSubtables.COMMON1034[input - 0x8429];
			if (input >= 0x8490 && input <= 0x84DA) return CommonSubtables.COMMON1035[input - 0x8490];
			if (input >= 0x8511 && input <= 0x856D) return CommonSubtables.COMMON1036[input - 0x8511];
			if (input >= 0x8584 && input <= 0x861A) return CommonSubtables.COMMON1037[input - 0x8584];
			if (input >= 0x86C7 && input <= 0x871C) return CommonSubtables.COMMON1038[input - 0x86C7];
			if (input >= 0x881F && input <= 0x8944) return CommonSubtables.COMMON1039[input - 0x881F];
			if (input >= 0x895F && input <= 0x89C0) return CommonSubtables.COMMON1040[input - 0x895F];
			if (input >= 0x89D2 && input <= 0x8A3B) return CommonSubtables.COMMON1041[input - 0x89D2];
			if (input >= 0x8A50 && input <= 0x8B9A) return CommonSubtables.COMMON1042[input - 0x8A50];
			if (input >= 0x8C37 && input <= 0x8D16) return CommonSubtables.COMMON1043[input - 0x8C37];
			if (input >= 0x8D64 && input <= 0x8DF3) return CommonSubtables.COMMON1044[input - 0x8D64];
			if (input >= 0x8E0A && input <= 0x8E60) return CommonSubtables.COMMON1045[input - 0x8E0A];
			if (input >= 0x8EC0 && input <= 0x8F62) return CommonSubtables.COMMON1046[input - 0x8EC0];
			if (input >= 0x8FE6 && input <= 0x90CA) return CommonSubtables.COMMON1047[input - 0x8FE6];
			if (input >= 0x9149 && input <= 0x91F5) return CommonSubtables.COMMON1048[input - 0x9149];
			if (input >= 0x92E4 && input <= 0x932F) return CommonSubtables.COMMON609[input - 0x92E4];
			if (input >= 0x9577 && input <= 0x95E2) return CommonSubtables.COMMON1049[input - 0x9577];
			if (input >= 0x961C && input <= 0x97AD) return CommonSubtables.COMMON1050[input - 0x961C];
			if (input >= 0x97F3 && input <= 0x9818) return CommonSubtables.COMMON1051[input - 0x97F3];
			if (input >= 0x982D && input <= 0x986F) return CommonSubtables.COMMON1052[input - 0x982D];
			if (input >= 0x98DB && input <= 0x9928) return CommonSubtables.COMMON614[input - 0x98DB];
			if (input >= 0x9996 && input <= 0x9A19) return CommonSubtables.COMMON1053[input - 0x9996];
			if (input >= 0x9A2B && input <= 0x9A6A) return CommonSubtables.COMMON616[input - 0x9A2B];
			if (input >= 0x9E92 && input <= 0x9EF4) return CommonSubtables.COMMON1054[input - 0x9E92];
			if (input >= 0xAC00 && input <= 0xAC5C) return CommonSubtables.COMMON1055[input - 0xAC00];
			if (input >= 0xAC70 && input <= 0xADA4) return CommonSubtables.COMMON1056[input - 0xAC70];
			if (input >= 0xAE30 && input <= 0xAE8C) return CommonSubtables.COMMON1057[input - 0xAE30];
			if (input >= 0xAEBC && input <= 0xAF10) return CommonSubtables.COMMON1058[input - 0xAEBC];
			if (input >= 0xAF2C && input <= 0xAF65) return CommonSubtables.COMMON1059[input - 0xAF2C];
			if (input >= 0xAFB8 && input <= 0xB028) return CommonSubtables.COMMON1060[input - 0xAFB8];
			if (input >= 0xB07C && input <= 0xB0E5) return CommonSubtables.COMMON1061[input - 0xB07C];
			if (input >= 0xB108 && input <= 0xB160) return CommonSubtables.COMMON1062[input - 0xB108];
			if (input >= 0xB1CC && input <= 0xB220) return CommonSubtables.COMMON628[input - 0xB1CC];
			if (input >= 0xB258 && input <= 0xB2B4) return CommonSubtables.COMMON1063[input - 0xB258];
			if (input >= 0xB2C8 && input <= 0xB31C) return CommonSubtables.COMMON1064[input - 0xB2C8];
			if (input >= 0xB354 && input <= 0xB3AC) return CommonSubtables.COMMON1065[input - 0xB354];
			if (input >= 0xB3C4 && input <= 0xB3E8) return CommonSubtables.COMMON1066[input - 0xB3C4];
			if (input >= 0xB49D && input <= 0xB4F8) return CommonSubtables.COMMON1067[input - 0xB49D];
			if (input >= 0xB514 && input <= 0xB561) return CommonSubtables.COMMON1068[input - 0xB514];
			if (input >= 0xB5A0 && input <= 0xB5D8) return CommonSubtables.COMMON634[input - 0xB5A0];
			if (input >= 0xB728 && input <= 0xB7C9) return CommonSubtables.COMMON1069[input - 0xB728];
			if (input >= 0xB7EC && input <= 0xB88D) return CommonSubtables.COMMON1070[input - 0xB7EC];
			if (input >= 0xB8A8 && input <= 0xB904) return CommonSubtables.COMMON1071[input - 0xB8A8];
			if (input >= 0xB93C && input <= 0xB98E) return CommonSubtables.COMMON1072[input - 0xB93C];
			if (input >= 0xB9AC && input <= 0xBA15) return CommonSubtables.COMMON1073[input - 0xB9AC];
			if (input >= 0xBA38 && input <= 0xBA8C) return CommonSubtables.COMMON1074[input - 0xBA38];
			if (input >= 0xBAFC && input <= 0xBB6C) return CommonSubtables.COMMON642[input - 0xBAFC];
			if (input >= 0xBBF8 && input <= 0xBC5D) return CommonSubtables.COMMON1075[input - 0xBBF8];
			if (input >= 0xBC84 && input <= 0xBCDC) return CommonSubtables.COMMON1076[input - 0xBC84];
			if (input >= 0xBD80 && input <= 0xBDB8) return CommonSubtables.COMMON1077[input - 0xBD80];
			if (input >= 0xBDD4 && input <= 0xBE1F) return CommonSubtables.COMMON1078[input - 0xBDD4];
			if (input >= 0xBE44 && input <= 0xBEA8) return CommonSubtables.COMMON1079[input - 0xBE44];
			if (input >= 0xC090 && input <= 0xC234) return CommonSubtables.COMMON1080[input - 0xC090];
			if (input >= 0xC248 && input <= 0xC2B9) return CommonSubtables.COMMON1081[input - 0xC248];
			if (input >= 0xC2DC && input <= 0xC329) return CommonSubtables.COMMON1082[input - 0xC2DC];
			if (input >= 0xC4E9 && input <= 0xC7EC) return CommonSubtables.COMMON1083[input - 0xC4E9];
			if (input >= 0xC800 && input <= 0xC854) return CommonSubtables.COMMON1084[input - 0xC800];
			if (input >= 0xC870 && input <= 0xC8A8) return CommonSubtables.COMMON1085[input - 0xC870];
			if (input >= 0xC8BC && input <= 0xC918) return CommonSubtables.COMMON1086[input - 0xC8BC];
			if (input >= 0xC950 && input <= 0xC99D) return CommonSubtables.COMMON1087[input - 0xC950];
			if (input >= 0xC9C0 && input <= 0xCA29) return CommonSubtables.COMMON1088[input - 0xC9C0];
			if (input >= 0xCC0C && input <= 0xCC75) return CommonSubtables.COMMON1089[input - 0xCC0C];
			if (input >= 0xCC98 && input <= 0xCD39) return CommonSubtables.COMMON1090[input - 0xCC98];
			if (input >= 0xCD5C && input <= 0xCDB0) return CommonSubtables.COMMON660[input - 0xCD5C];
			if (input >= 0xCDE8 && input <= 0xCE35) return CommonSubtables.COMMON1091[input - 0xCDE8];
			if (input >= 0xCE58 && input <= 0xCEAD) return CommonSubtables.COMMON1092[input - 0xCE58];
			if (input >= 0xCEE4 && input <= 0xCF38) return CommonSubtables.COMMON1093[input - 0xCEE4];
			if (input >= 0xD02D && input <= 0xD081) return CommonSubtables.COMMON1094[input - 0xD02D];
			if (input >= 0xD0A4 && input <= 0xD0F8) return CommonSubtables.COMMON666[input - 0xD0A4];
			if (input >= 0xD130 && input <= 0xD188) return CommonSubtables.COMMON1095[input - 0xD130];
			if (input >= 0xD280 && input <= 0xD345) return CommonSubtables.COMMON1096[input - 0xD280];
			if (input >= 0xD37C && input <= 0xD408) return CommonSubtables.COMMON1097[input - 0xD37C];
			if (input >= 0xD45C && input <= 0xD494) return CommonSubtables.COMMON670[input - 0xD45C];
			if (input >= 0xD4CC && input <= 0xD517) return CommonSubtables.COMMON1098[input - 0xD4CC];
			if (input >= 0xD53C && input <= 0xD590) return CommonSubtables.COMMON1099[input - 0xD53C];
			if (input >= 0xD5C8 && input <= 0xD79D) return CommonSubtables.COMMON1100[input - 0xD5C8];
			if (input >= 0xF83D && input <= 0xF84F) return GETOUTPUT0_F83D[input - 0xF83D];
			if (input >= 0xF900 && input <= 0xFA0B) return CommonSubtables.COMMON676[input - 0xF900];
			if (input >= 0xFF01 && input <= 0xFF5D) return CommonSubtables.COMMON677[input - 0xFF01];
			switch (input) {
			case 0x111: return 0xA2A9L;
			case 0x126: return 0xA4A8L;
			case 0x127: return 0xA4A9L;
			case 0x131: return 0xA5A9L;
			case 0x132: return 0xA6A8L;
			case 0x133: return 0xA6A9L;
			case 0x138: return 0xA7A9L;
			case 0x13F: return 0xA8A8L;
			case 0x140: return 0xA8A9L;
			case 0x141: return 0xA9A8L;
			case 0x142: return 0xA9A9L;
			case 0x149: return 0xB0A9L;
			case 0x14A: return 0xAFA8L;
			case 0x14B: return 0xAFA9L;
			case 0x152: return 0xABA8L;
			case 0x153: return 0xABA9L;
			case 0x166: return 0xAEA8L;
			case 0x167: return 0xAEA9L;
			case 0x2BC: return 0x98A1L;
			case 0x2C7: return 0xA7A2L;
			case 0x2D0: return 0xB0A2L;
			case 0x2D8: return 0xA8A2L;
			case 0x2D9: return 0xABA2L;
			case 0x2DA: return 0xAAA2L;
			case 0x2DB: return 0xADA2L;
			case 0x2DC: return 0xA6A2L;
			case 0x2DD: return 0xA9A2L;
			case 0x2074: return 0xF9A9L;
			case 0x207A: return 0x71A1L;
			case 0x207B: return 0x72A1L;
			case 0x207C: return 0x7AA1L;
			case 0x207D: return 0x7CA1L;
			case 0x207E: return 0x7DA1L;
			case 0x207F: return 0xFAA9L;
			case 0x2081: return 0xFBA9L;
			case 0x2082: return 0xFCA9L;
			case 0x2083: return 0xFDA9L;
			case 0x2084: return 0xFEA9L;
			case 0x20A9: return 0x81L;
			case 0x2103: return 0xC9A1L;
			case 0x2109: return 0xB5A2L;
			case 0x2113: return 0xA4A7L;
			case 0x2116: return 0xE0A2L;
			case 0x2121: return 0xE5A2L;
			case 0x2122: return 0xE2A2L;
			case 0x2126: return 0xD9A7L;
			case 0x212B: return 0xCAA1L;
			case 0x2190: return 0xE7A1L;
			case 0x2191: return 0xE8A1L;
			case 0x2192: return 0xE6A1L;
			case 0x2193: return 0xE9A1L;
			case 0x2194: return 0xEAA1L;
			case 0x2195: return 0xD5A2L;
			case 0x2196: return 0xD8A2L;
			case 0x2197: return 0xD6A2L;
			case 0x2198: return 0xD9A2L;
			case 0x2199: return 0xD7A2L;
			case 0x219C: return 0x53ACL;
			case 0x219D: return 0x52ACL;
			case 0x22BB: return 0x75A7L;
			case 0x22BC: return 0x76A7L;
			case 0x22CE: return 0x83A4L;
			case 0x22CF: return 0x84A4L;
			case 0x22DA: return 0x92A4L;
			case 0x22DB: return 0x93A4L;
			case 0x22EE: return 0xFDA2L;
			case 0x2306: return 0x78A7L;
			case 0x2312: return 0xD2A1L;
			case 0x2314: return 0x61A7L;
			case 0x2660: return 0xBCA2L;
			case 0x2661: return 0xBDA2L;
			case 0x2663: return 0xC0A2L;
			case 0x2664: return 0xBBA2L;
			case 0x2665: return 0xBEA2L;
			case 0x2666: return 0x98A7L;
			case 0x2667: return 0xBFA2L;
			case 0x2668: return 0xCDA2L;
			case 0x2669: return 0xDBA2L;
			case 0x266A: return 0xDCA2L;
			case 0x266C: return 0xDDA2L;
			case 0x266D: return 0xDAA2L;
			case 0x266F: return 0x48A6L;
			case 0x2716: return 0x6DA6L;
			case 0x271A: return 0x6CA6L;
			case 0x2720: return 0x88A6L;
			case 0x2723: return 0x72A6L;
			case 0x2731: return 0x53A6L;
			case 0x273D: return 0x52A6L;
			case 0x273F: return 0x7CA6L;
			case 0x2740: return 0x99A6L;
			case 0x2741: return 0x8DA6L;
			case 0x2747: return 0x54A6L;
			case 0x274D: return 0x83A6L;
			case 0x2756: return 0x73A6L;
			case 0x2934: return 0x8DA8L;
			case 0x2935: return 0x89A8L;
			case 0x2936: return 0x86A8L;
			case 0x2937: return 0x8BA8L;
			case 0x2939: return 0x8CA8L;
			case 0x2962: return 0x6FA8L;
			case 0x2963: return 0x71A8L;
			case 0x2964: return 0x70A8L;
			case 0x2965: return 0x72A8L;
			case 0x2981: return 0x99A7L;
			case 0x2985: return 0x59A1L;
			case 0x2986: return 0x5AA1L;
			case 0x2997: return 0x99A1L;
			case 0x2998: return 0x9AA1L;
			case 0x29A3: return 0x9CA4L;
			case 0x29BE: return 0x68A6L;
			case 0x29BF: return 0x6EA6L;
			case 0x29C8: return 0x64A6L;
			case 0x2A26: return 0x7DA4L;
			case 0x2A38: return 0x60A7L;
			case 0x2A72: return 0x7BA7L;
			case 0x2A8B: return 0x94A4L;
			case 0x2A8C: return 0x95A4L;
			case 0x2A91: return 0x96A4L;
			case 0x2A92: return 0x97A4L;
			case 0x2AC5: return 0x8BA4L;
			case 0x2AC6: return 0x8DA4L;
			case 0x2ACB: return 0x8CA4L;
			case 0x2ACC: return 0x8EA4L;
			case 0x2AE8: return 0x6BA7L;
			case 0x3231: return 0x9DA7L;
			case 0x3239: return 0x9EA7L;
			case 0x5468: return 0xB2F1L;
			case 0x546A: return 0xB1F1L;
			case 0x5471: return 0xB2CDL;
			case 0x5473: return 0xABDAL;
			case 0x5475: return 0xA7CAL;
			case 0x547B: return 0xE2E3L;
			case 0x547C: return 0xBCFBL;
			case 0x547D: return 0xA4D9L;
			case 0x5480: return 0xBAEEL;
			case 0x5486: return 0xD3F8L;
			case 0x548C: return 0xFAFBL;
			case 0x548E: return 0xA4CFL;
			case 0x5490: return 0xFBDCL;
			case 0x54A4: return 0xE3F6L;
			case 0x54A8: return 0xAAEDL;
			case 0x54AB: return 0xA1F2L;
			case 0x54AC: return 0xE1CEL;
			case 0x54B3: return 0xA6FAL;
			case 0x54B8: return 0xE0F9L;
			case 0x54BD: return 0xD6ECL;
			case 0x54C0: return 0xEEE4L;
			case 0x54C1: return 0xA1F9L;
			case 0x54C4: return 0xEFFBL;
			case 0x54C8: return 0xEBF9L;
			case 0x54C9: return 0xA3EEL;
			case 0x54E1: return 0xACEAL;
			case 0x54E5: return 0xA8CAL;
			case 0x54E8: return 0xFAF4L;
			case 0x54ED: return 0xD6CDL;
			case 0x54EE: return 0xF6FCL;
			case 0x54F2: return 0xC9F4L;
			case 0x54FA: return 0xD4F8L;
			case 0x5504: return 0xA6F8L;
			case 0x5506: return 0xCADEL;
			case 0x5507: return 0xC6F2L;
			case 0x550E: return 0xDAD7L;
			case 0x5510: return 0xD0D3L;
			case 0x551C: return 0xC5D8L;
			case 0x552F: return 0xE6EAL;
			case 0x5531: return 0xDDF3L;
			case 0x5535: return 0xDAE4L;
			case 0x553E: return 0xE4F6L;
			case 0x5544: return 0xF2F6L;
			case 0x5546: return 0xC2DFL;
			case 0x554F: return 0xFDD9L;
			case 0x5553: return 0xF6CCL;
			case 0x5556: return 0xBAD3L;
			case 0x555E: return 0xAFE4L;
			case 0x5563: return 0xE1F9L;
			case 0x55C5: return 0xABFDL;
			case 0x55C7: return 0xE0DFL;
			case 0x55D4: return 0xC7F2L;
			case 0x55DA: return 0xF0E7L;
			case 0x55DC: return 0xEED0L;
			case 0x55DF: return 0xAAF3L;
			case 0x55E3: return 0xCBDEL;
			case 0x55E4: return 0xB8F6L;
			case 0x55FD: return 0xF5E1L;
			case 0x55FE: return 0xB3F1L;
			case 0x5606: return 0xA3F7L;
			case 0x5609: return 0xA9CAL;
			case 0x5614: return 0xA5CFL;
			case 0x5617: return 0xC4DFL;
			case 0x562F: return 0xB0E1L;
			case 0x5632: return 0xBFF0L;
			case 0x5634: return 0xA4F6L;
			case 0x5636: return 0xB6E3L;
			case 0x5653: return 0xC6FAL;
			case 0x5668: return 0xEFD0L;
			case 0x566B: return 0xEDFDL;
			case 0x5674: return 0xC4DDL;
			case 0x5686: return 0xF7FCL;
			case 0x5A92: return 0xDAD8L;
			case 0x5A9A: return 0xACDAL;
			case 0x5A9B: return 0xB0EAL;
			case 0x5AA4: return 0xB8E3L;
			case 0x5AC1: return 0xAACAL;
			case 0x5AC2: return 0xF9E1L;
			case 0x5AC4: return 0xB1EAL;
			case 0x5AC9: return 0xECF2L;
			case 0x5ACC: return 0xEEFAL;
			case 0x5AE1: return 0xD5EEL;
			case 0x5AE6: return 0xF4F9L;
			case 0x5AE9: return 0xECD2L;
			case 0x5B05: return 0xFBFBL;
			case 0x5B09: return 0xF0FDL;
			case 0x5B0B: return 0xBDE0L;
			case 0x5B0C: return 0xE3CEL;
			case 0x5B16: return 0xC6F8L;
			case 0x5B2A: return 0xAEDEL;
			case 0x5C90: return 0xF7D0L;
			case 0x5C91: return 0xD4EDL;
			case 0x5CA1: return 0xAACBL;
			case 0x5CA9: return 0xDBE4L;
			case 0x5CAB: return 0xFBE1L;
			case 0x5CAC: return 0xA2CBL;
			case 0x5CB1: return 0xE0D3L;
			case 0x5CB3: return 0xBFE4L;
			case 0x5CB5: return 0xC0FBL;
			case 0x5CB7: return 0xBEDAL;
			case 0x5CB8: return 0xCDE4L;
			case 0x5CBA: return 0xB9D6L;
			case 0x5CBE: return 0xC0EFL;
			case 0x5CC0: return 0xFCE1L;
			case 0x5D4B: return 0xAEDAL;
			case 0x5D4C: return 0xEECAL;
			case 0x5D50: return 0xB9D5L;
			case 0x5D69: return 0xA1E3L;
			case 0x5D6C: return 0xE3E8L;
			case 0x5D6F: return 0xABF3L;
			case 0x5D87: return 0xA9CFL;
			case 0x5D8B: return 0xF7D3L;
			case 0x632B: return 0xA9F1L;
			case 0x632F: return 0xC9F2L;
			case 0x633A: return 0xD8EFL;
			case 0x633B: return 0xC9E6L;
			case 0x633D: return 0xB8D8L;
			case 0x633E: return 0xF3FAL;
			case 0x6349: return 0xB5F3L;
			case 0x634C: return 0xA4F8L;
			case 0x634F: return 0xF3D1L;
			case 0x6350: return 0xC8E6L;
			case 0x6355: return 0xDAF8L;
			case 0x63C0: return 0xD1CAL;
			case 0x63C4: return 0xF1EAL;
			case 0x63C6: return 0xA6D0L;
			case 0x63CF: return 0xDAD9L;
			case 0x63D0: return 0xABF0L;
			case 0x63D6: return 0xE7EBL;
			case 0x63DA: return 0xC0E5L;
			case 0x63DB: return 0xB5FCL;
			case 0x63E1: return 0xC4E4L;
			case 0x63ED: return 0xA9CCL;
			case 0x63EE: return 0xC6FDL;
			case 0x63F4: return 0xB5EAL;
			case 0x63F6: return 0xAAE5L;
			case 0x63F7: return 0xBADFL;
			case 0x640D: return 0xDFE1L;
			case 0x640F: return 0xD1DAL;
			case 0x6414: return 0xB8E1L;
			case 0x6416: return 0xF4E8L;
			case 0x6417: return 0xFDD3L;
			case 0x641C: return 0xA4E2L;
			case 0x6422: return 0xCAF2L;
			case 0x642C: return 0xE6DAL;
			case 0x642D: return 0xB3F7L;
			case 0x643A: return 0xCDFDL;
			case 0x643E: return 0xB6F3L;
			case 0x6995: return 0xBEE9L;
			case 0x699B: return 0xCEF2L;
			case 0x699C: return 0xB4DBL;
			case 0x69A5: return 0xCEFCL;
			case 0x69A7: return 0xEEDDL;
			case 0x69AE: return 0xB4E7L;
			case 0x69B4: return 0xB4D7L;
			case 0x69BB: return 0xB4F7L;
			case 0x69C1: return 0xBECDL;
			case 0x69C3: return 0xE9DAL;
			case 0x69CB: return 0xB0CFL;
			case 0x69CC: return 0xD9F7L;
			case 0x69CD: return 0xE6F3L;
			case 0x69D0: return 0xD9CEL;
			case 0x69E8: return 0xAACEL;
			case 0x69EA: return 0xC8CBL;
			case 0x69FB: return 0xA7D0L;
			case 0x69FD: return 0xCBF0L;
			case 0x69FF: return 0xC7D0L;
			case 0x6A02: return 0xC5E4L;
			case 0x6A0A: return 0xE0DBL;
			case 0x6A11: return 0xDAD5L;
			case 0x6A13: return 0xA7D7L;
			case 0x6A17: return 0xC0EEL;
			case 0x6A19: return 0xF6F8L;
			case 0x6A1E: return 0xD2F5L;
			case 0x6A1F: return 0xE9EDL;
			case 0x6A21: return 0xBCD9L;
			case 0x6A23: return 0xC6E5L;
			case 0x6A35: return 0xA3F5L;
			case 0x6A38: return 0xD4DAL;
			case 0x6A39: return 0xA7E2L;
			case 0x6A3A: return 0xFCFBL;
			case 0x6A3D: return 0xDCF1L;
			case 0x6A44: return 0xF4CAL;
			case 0x6A48: return 0xFAE8L;
			case 0x6A4B: return 0xE9CEL;
			case 0x6A52: return 0xF8E9L;
			case 0x6A53: return 0xE5E2L;
			case 0x6A58: return 0xB9D0L;
			case 0x6A59: return 0xF2D4L;
			case 0x6A5F: return 0xA6D1L;
			case 0x6A61: return 0xCEDFL;
			case 0x6A6B: return 0xF4FCL;
			case 0x77D7: return 0xB8F5L;
			case 0x77DB: return 0xC3D9L;
			case 0x77DC: return 0xE8D0L;
			case 0x77E2: return 0xC5E3L;
			case 0x77E3: return 0xF8EBL;
			case 0x77E5: return 0xB1F2L;
			case 0x77E9: return 0xBBCFL;
			case 0x77ED: return 0xADD3L;
			case 0x77EE: return 0xE1E8L;
			case 0x77EF: return 0xECCEL;
			case 0x77F3: return 0xB4E0L;
			case 0x7802: return 0xE3DEL;
			case 0x7812: return 0xF7DDL;
			case 0x78E8: return 0xA8D8L;
			case 0x78EC: return 0xE4CCL;
			case 0x78EF: return 0xB4D1L;
			case 0x78F5: return 0xD8CAL;
			case 0x78FB: return 0xF2DAL;
			case 0x7901: return 0xA7F5L;
			case 0x790E: return 0xA8F5L;
			case 0x7916: return 0xA6E6L;
			case 0x7C07: return 0xEAF0L;
			case 0x7C12: return 0xC2F3L;
			case 0x7C1E: return 0xAFD3L;
			case 0x7C21: return 0xDBCAL;
			case 0x7C27: return 0xD7FCL;
			case 0x7C2A: return 0xD8EDL;
			case 0x7C2B: return 0xC7E1L;
			case 0x7C3D: return 0xD8F4L;
			case 0x7C3E: return 0xB3D6L;
			case 0x7C3F: return 0xADDDL;
			case 0x7C43: return 0xBED5L;
			case 0x7C4C: return 0xC3F1L;
			case 0x7C4D: return 0xDFEEL;
			case 0x7F36: return 0xAEDDL;
			case 0x7F38: return 0xFCF9L;
			case 0x7F3A: return 0xC0CCL;
			case 0x7F4C: return 0xA2E5L;
			case 0x7F50: return 0xB8CEL;
			case 0x7F54: return 0xD2D8L;
			case 0x7F55: return 0xD6F9L;
			case 0x8373: return 0xE5D4L;
			case 0x8377: return 0xC3F9L;
			case 0x837B: return 0xE2EEL;
			case 0x8389: return 0xE9D7L;
			case 0x838A: return 0xF6EDL;
			case 0x838E: return 0xEDDEL;
			case 0x8396: return 0xECCCL;
			case 0x8398: return 0xEEE3L;
			case 0x839E: return 0xD4E8L;
			case 0x83A2: return 0xF8FAL;
			case 0x83A9: return 0xB4DDL;
			case 0x83AA: return 0xB5E4L;
			case 0x83AB: return 0xB0D8L;
			case 0x84EC: return 0xEFDCL;
			case 0x84EE: return 0xA5D6L;
			case 0x84F4: return 0xF1E2L;
			case 0x84FC: return 0xFED6L;
			case 0x862D: return 0xB5D5L;
			case 0x863F: return 0xA1D5L;
			case 0x864E: return 0xDBFBL;
			case 0x8650: return 0xCBF9L;
			case 0x8654: return 0xF3CBL;
			case 0x8655: return 0xA5F4L;
			case 0x865B: return 0xC8FAL;
			case 0x865C: return 0xD7D6L;
			case 0x865E: return 0xE5E9L;
			case 0x865F: return 0xDCFBL;
			case 0x8667: return 0xD0FDL;
			case 0x8679: return 0xF6FBL;
			case 0x868A: return 0xA5DAL;
			case 0x868C: return 0xBDDBL;
			case 0x8693: return 0xE2ECL;
			case 0x86A3: return 0xF7CDL;
			case 0x86A4: return 0xDEF0L;
			case 0x86A9: return 0xC9F6L;
			case 0x874E: return 0xE9CAL;
			case 0x8755: return 0xDAE3L;
			case 0x8757: return 0xD9FCL;
			case 0x875F: return 0xDAEAL;
			case 0x8766: return 0xC4F9L;
			case 0x8768: return 0xA4E3L;
			case 0x8774: return 0xDDFBL;
			case 0x8776: return 0xCAEFL;
			case 0x8778: return 0xC4E8L;
			case 0x8782: return 0xCCD5L;
			case 0x878D: return 0xD7EBL;
			case 0x879F: return 0xADD9L;
			case 0x87A2: return 0xABFBL;
			case 0x87B3: return 0xD9D3L;
			case 0x87BA: return 0xA2D5L;
			case 0x87C4: return 0xDEF6L;
			case 0x87E0: return 0xF6DAL;
			case 0x87EC: return 0xD1E0L;
			case 0x87EF: return 0xA8E9L;
			case 0x87F2: return 0xF9F5L;
			case 0x87F9: return 0xAFFAL;
			case 0x87FB: return 0xFCEBL;
			case 0x87FE: return 0xEAE0L;
			case 0x8805: return 0xB2E3L;
			case 0x8E74: return 0xEDF5L;
			case 0x8E76: return 0xF3CFL;
			case 0x8E81: return 0xE2F0L;
			case 0x8E87: return 0xCEEEL;
			case 0x8E8A: return 0xCCF1L;
			case 0x8E8D: return 0xB8E5L;
			case 0x8EAA: return 0xF5D7L;
			case 0x8EAB: return 0xF3E3L;
			case 0x8EAC: return 0xE5CFL;
			case 0x8F9B: return 0xF4E3L;
			case 0x8F9C: return 0xD0CDL;
			case 0x8FA3: return 0xB8D5L;
			case 0x8FA6: return 0xFDF7L;
			case 0x8FA8: return 0xA9DCL;
			case 0x8FAD: return 0xF6DEL;
			case 0x8FAF: return 0xAADCL;
			case 0x8FB0: return 0xE3F2L;
			case 0x8FB1: return 0xB4E9L;
			case 0x8FB2: return 0xDCD2L;
			case 0x8FC2: return 0xE6E9L;
			case 0x8FC5: return 0xF6E3L;
			case 0x8FCE: return 0xCAE7L;
			case 0x8FD1: return 0xCED0L;
			case 0x8FD4: return 0xF7DAL;
			case 0x90DE: return 0xCDD5L;
			case 0x90E1: return 0xDBCFL;
			case 0x90E8: return 0xBBDDL;
			case 0x90ED: return 0xACCEL;
			case 0x90F5: return 0xE8E9L;
			case 0x90FD: return 0xB4D4L;
			case 0x9102: return 0xC7E4L;
			case 0x9112: return 0xDBF5L;
			case 0x9115: return 0xC1FAL;
			case 0x9119: return 0xA9DEL;
			case 0x9127: return 0xF8D4L;
			case 0x912D: return 0xF7EFL;
			case 0x9132: return 0xB3D3L;
			case 0x920D: return 0xEFD4L;
			case 0x9210: return 0xA2CCL;
			case 0x9211: return 0xFEF7L;
			case 0x9212: return 0xBCDFL;
			case 0x9217: return 0xCDEBL;
			case 0x921E: return 0xB7D0L;
			case 0x9234: return 0xC2D6L;
			case 0x923A: return 0xADE8L;
			case 0x923F: return 0xAFEFL;
			case 0x9240: return 0xA5CBL;
			case 0x9245: return 0xE9CBL;
			case 0x9249: return 0xE8FAL;
			case 0x9257: return 0xC6CCL;
			case 0x925B: return 0xE7E6L;
			case 0x925E: return 0xC7EAL;
			case 0x9262: return 0xA4DBL;
			case 0x9264: return 0xC9CFL;
			case 0x9265: return 0xFCE2L;
			case 0x9266: return 0xFAEFL;
			case 0x9280: return 0xDEEBL;
			case 0x9283: return 0xC8F5L;
			case 0x9285: return 0xDED4L;
			case 0x9291: return 0xD5E0L;
			case 0x9293: return 0xB0EFL;
			case 0x9296: return 0xC7E2L;
			case 0x9298: return 0xAFD9L;
			case 0x929C: return 0xE7F9L;
			case 0x92B3: return 0xE5E7L;
			case 0x92B6: return 0xCACFL;
			case 0x92B7: return 0xD1E1L;
			case 0x92B9: return 0xC8E2L;
			case 0x92CC: return 0xFBEFL;
			case 0x92CF: return 0xF9FAL;
			case 0x92D2: return 0xF2DCL;
			case 0x9348: return 0xCCE7L;
			case 0x934A: return 0xA8D6L;
			case 0x934B: return 0xA7CEL;
			case 0x934D: return 0xB5D4L;
			case 0x9354: return 0xC8E4L;
			case 0x935B: return 0xB4D3L;
			case 0x936E: return 0xB9EBL;
			case 0x9375: return 0xF5CBL;
			case 0x937C: return 0xDDF6L;
			case 0x937E: return 0xA3F1L;
			case 0x938C: return 0xC7CCL;
			case 0x9394: return 0xCAE9L;
			case 0x9396: return 0xF0E1L;
			case 0x939A: return 0xE0F5L;
			case 0x93A3: return 0xAFFBL;
			case 0x93A7: return 0xD1CBL;
			case 0x93AC: return 0xE0FBL;
			case 0x93AD: return 0xE5F2L;
			case 0x93B0: return 0xF0ECL;
			case 0x93C3: return 0xECF0L;
			case 0x93D1: return 0xEBEEL;
			case 0x93DE: return 0xCBE9L;
			case 0x93E1: return 0xF0CCL;
			case 0x93E4: return 0xAFD7L;
			case 0x93F6: return 0xA1F3L;
			case 0x9404: return 0xF5FCL;
			case 0x9418: return 0xA4F1L;
			case 0x9425: return 0xD6E0L;
			case 0x942B: return 0xB2EFL;
			case 0x9435: return 0xD1F4L;
			case 0x9438: return 0xA1F7L;
			case 0x9444: return 0xD1F1L;
			case 0x9451: return 0xFCCAL;
			case 0x9452: return 0xFDCAL;
			case 0x945B: return 0xCECEL;
			case 0x947D: return 0xC8F3L;
			case 0x947F: return 0xBAF3L;
			case 0x97C6: return 0xC7F4L;
			case 0x97CB: return 0xDFEAL;
			case 0x97D3: return 0xDBF9L;
			case 0x97DC: return 0xB7D4L;
			case 0x98A8: return 0xA6F9L;
			case 0x98AF: return 0xBDDFL;
			case 0x98B1: return 0xC7F7L;
			case 0x98C4: return 0xFDF8L;
			case 0x98C7: return 0xFCF8L;
			case 0x9945: return 0xC3D8L;
			case 0x9949: return 0xCFD0L;
			case 0x994B: return 0xFACFL;
			case 0x994C: return 0xCAF3L;
			case 0x994D: return 0xD7E0L;
			case 0x9951: return 0xC7D1L;
			case 0x9952: return 0xAEE9L;
			case 0x9954: return 0xBDE8L;
			case 0x9957: return 0xC4FAL;
			case 0x9AA8: return 0xE9CDL;
			case 0x9AB8: return 0xB5FAL;
			case 0x9AD3: return 0xD0E2L;
			case 0x9AD4: return 0xF7F4L;
			case 0x9AD8: return 0xD4CDL;
			case 0x9AE5: return 0xA3E7L;
			case 0x9AEE: return 0xA5DBL;
			case 0x9B1A: return 0xD1E2L;
			case 0x9B27: return 0xA2D7L;
			case 0x9B2A: return 0xE3F7L;
			case 0x9B31: return 0xA6EAL;
			case 0x9B3C: return 0xA1D0L;
			case 0x9B41: return 0xDACEL;
			case 0x9B42: return 0xEBFBL;
			case 0x9B43: return 0xA6DBL;
			case 0x9B44: return 0xDEDBL;
			case 0x9B45: return 0xE5D8L;
			case 0x9B4F: return 0xE0EAL;
			case 0x9B54: return 0xAAD8L;
			case 0x9B5A: return 0xE0E5L;
			case 0x9B6F: return 0xDBD6L;
			case 0x9B8E: return 0xC6EFL;
			case 0x9B91: return 0xEAF8L;
			case 0x9B9F: return 0xD5E4L;
			case 0x9BAB: return 0xF7CEL;
			case 0x9BAE: return 0xD8E0L;
			case 0x9BC9: return 0xEFD7L;
			case 0x9BD6: return 0xEDF4L;
			case 0x9BE4: return 0xE6CDL;
			case 0x9BE8: return 0xF4CCL;
			case 0x9C0D: return 0xE3F5L;
			case 0x9C10: return 0xCAE4L;
			case 0x9C12: return 0xE1DCL;
			case 0x9C15: return 0xC8F9L;
			case 0x9C25: return 0xBFFCL;
			case 0x9C32: return 0xA7E8L;
			case 0x9C3B: return 0xC4D8L;
			case 0x9C47: return 0xBECBL;
			case 0x9C49: return 0xAEDCL;
			case 0x9C57: return 0xF7D7L;
			case 0x9CE5: return 0xE8F0L;
			case 0x9CE7: return 0xC0DDL;
			case 0x9CE9: return 0xCDCFL;
			case 0x9CF3: return 0xF3DCL;
			case 0x9CF4: return 0xB0D9L;
			case 0x9CF6: return 0xE9E6L;
			case 0x9D09: return 0xBCE4L;
			case 0x9D1B: return 0xC4EAL;
			case 0x9D26: return 0xECE4L;
			case 0x9D28: return 0xE5E4L;
			case 0x9D3B: return 0xF8FBL;
			case 0x9D51: return 0xBBCCL;
			case 0x9D5D: return 0xBDE4L;
			case 0x9D60: return 0xDCCDL;
			case 0x9D61: return 0xF7D9L;
			case 0x9D6C: return 0xDFDDL;
			case 0x9D72: return 0xCEEDL;
			case 0x9DA9: return 0xD0D9L;
			case 0x9DAF: return 0xA3E5L;
			case 0x9DB4: return 0xCDF9L;
			case 0x9DC4: return 0xAECDL;
			case 0x9DD7: return 0xCECFL;
			case 0x9DF2: return 0xAFF6L;
			case 0x9DF8: return 0xD3FDL;
			case 0x9DF9: return 0xEDEBL;
			case 0x9DFA: return 0xDCD6L;
			case 0x9E1A: return 0xA4E5L;
			case 0x9E1E: return 0xB6D5L;
			case 0x9E75: return 0xDDD6L;
			case 0x9E79: return 0xE9F9L;
			case 0x9E7D: return 0xA4E7L;
			case 0x9E7F: return 0xE3D6L;
			case 0x9F07: return 0xA8E8L;
			case 0x9F08: return 0xAFDCL;
			case 0x9F0E: return 0xA3F0L;
			case 0x9F13: return 0xD5CDL;
			case 0x9F20: return 0xA9E0L;
			case 0x9F3B: return 0xACDEL;
			case 0x9F4A: return 0xBAF0L;
			case 0x9F4B: return 0xB1EEL;
			case 0x9F4E: return 0xB2EEL;
			case 0x9F52: return 0xCDF6L;
			case 0x9F5F: return 0xD2EEL;
			case 0x9F61: return 0xC6D6L;
			case 0x9F67: return 0xE5E0L;
			case 0x9F6A: return 0xBBF3L;
			case 0x9F6C: return 0xE1E5L;
			case 0x9F77: return 0xCBE4L;
			case 0x9F8D: return 0xA3D7L;
			case 0x9F90: return 0xC2DBL;
			case 0x9F95: return 0xFECAL;
			case 0x9F9C: return 0xCFCFL;
			case 0xADB7: return 0xCCB1L;
			case 0xADC0: return 0xCDB1L;
			case 0xADC1: return 0xCEB1L;
			case 0xADC4: return 0xCFB1L;
			case 0xADC8: return 0xD0B1L;
			case 0xADD0: return 0xD1B1L;
			case 0xADD1: return 0xD2B1L;
			case 0xADD3: return 0xD3B1L;
			case 0xADDC: return 0xD4B1L;
			case 0xADE0: return 0xD5B1L;
			case 0xADE4: return 0xD6B1L;
			case 0xADF8: return 0xD7B1L;
			case 0xADF9: return 0xD8B1L;
			case 0xADFC: return 0xD9B1L;
			case 0xADFF: return 0xDAB1L;
			case 0xAE00: return 0xDBB1L;
			case 0xAE01: return 0xDCB1L;
			case 0xAE08: return 0xDDB1L;
			case 0xAE09: return 0xDEB1L;
			case 0xAE0B: return 0xDFB1L;
			case 0xAE0D: return 0xE0B1L;
			case 0xAE14: return 0xE1B1L;
			case 0xAF79: return 0xD1B2L;
			case 0xAF80: return 0xD2B2L;
			case 0xAF84: return 0xD3B2L;
			case 0xAF88: return 0xD4B2L;
			case 0xAF90: return 0xD5B2L;
			case 0xAF91: return 0xD6B2L;
			case 0xAF95: return 0xD7B2L;
			case 0xAF9C: return 0xD8B2L;
			case 0xB044: return 0xF4B2L;
			case 0xB045: return 0xF5B2L;
			case 0xB048: return 0xF6B2L;
			case 0xB04A: return 0xF7B2L;
			case 0xB04C: return 0xF8B2L;
			case 0xB04E: return 0xF9B2L;
			case 0xB053: return 0xFAB2L;
			case 0xB054: return 0xFBB2L;
			case 0xB055: return 0xFCB2L;
			case 0xB057: return 0xFDB2L;
			case 0xB059: return 0xFEB2L;
			case 0xB05D: return 0xA1B3L;
			case 0xB178: return 0xEBB3L;
			case 0xB179: return 0xECB3L;
			case 0xB17C: return 0xEDB3L;
			case 0xB180: return 0xEEB3L;
			case 0xB182: return 0xEFB3L;
			case 0xB188: return 0xF0B3L;
			case 0xB189: return 0xF1B3L;
			case 0xB18B: return 0xF2B3L;
			case 0xB18D: return 0xF3B3L;
			case 0xB192: return 0xF4B3L;
			case 0xB193: return 0xF5B3L;
			case 0xB194: return 0xF6B3L;
			case 0xB198: return 0xF7B3L;
			case 0xB19C: return 0xF8B3L;
			case 0xB1A8: return 0xF9B3L;
			case 0xB234: return 0xB3B4L;
			case 0xB23C: return 0xB4B4L;
			case 0xB3FC: return 0xC5B5L;
			case 0xB410: return 0xC6B5L;
			case 0xB418: return 0xC7B5L;
			case 0xB41C: return 0xC8B5L;
			case 0xB420: return 0xC9B5L;
			case 0xB428: return 0xCAB5L;
			case 0xB429: return 0xCBB5L;
			case 0xB42B: return 0xCCB5L;
			case 0xB434: return 0xCDB5L;
			case 0xB450: return 0xCEB5L;
			case 0xB451: return 0xCFB5L;
			case 0xB454: return 0xD0B5L;
			case 0xB458: return 0xD1B5L;
			case 0xB460: return 0xD2B5L;
			case 0xB461: return 0xD3B5L;
			case 0xB463: return 0xD4B5L;
			case 0xB465: return 0xD5B5L;
			case 0xB46C: return 0xD6B5L;
			case 0xB480: return 0xD7B5L;
			case 0xB488: return 0xD8B5L;
			case 0xB5EC: return 0xC6B6L;
			case 0xB610: return 0xC7B6L;
			case 0xB611: return 0xC8B6L;
			case 0xB614: return 0xC9B6L;
			case 0xB618: return 0xCAB6L;
			case 0xB625: return 0xCBB6L;
			case 0xB62C: return 0xCCB6L;
			case 0xB634: return 0xCDB6L;
			case 0xB648: return 0xCEB6L;
			case 0xB664: return 0xCFB6L;
			case 0xB668: return 0xD0B6L;
			case 0xB69C: return 0xD1B6L;
			case 0xB69D: return 0xD2B6L;
			case 0xB6A0: return 0xD3B6L;
			case 0xB6A4: return 0xD4B6L;
			case 0xB6AB: return 0xD5B6L;
			case 0xB6AC: return 0xD6B6L;
			case 0xB6B1: return 0xD7B6L;
			case 0xB6D4: return 0xD8B6L;
			case 0xB6F0: return 0xD9B6L;
			case 0xB6F4: return 0xDAB6L;
			case 0xB6F8: return 0xDBB6L;
			case 0xB700: return 0xDCB6L;
			case 0xB701: return 0xDDB6L;
			case 0xB705: return 0xDEB6L;
			case 0xB918: return 0xF0B7L;
			case 0xB920: return 0xF1B7L;
			case 0xBAA8: return 0xF0B8L;
			case 0xBAA9: return 0xF1B8L;
			case 0xBAAB: return 0xF2B8L;
			case 0xBAAC: return 0xF3B8L;
			case 0xBAB0: return 0xF4B8L;
			case 0xBAB2: return 0xF5B8L;
			case 0xBAB8: return 0xF6B8L;
			case 0xBAB9: return 0xF7B8L;
			case 0xBABB: return 0xF8B8L;
			case 0xBABD: return 0xF9B8L;
			case 0xBAC4: return 0xFAB8L;
			case 0xBAC8: return 0xFBB8L;
			case 0xBAD8: return 0xFCB8L;
			case 0xBAD9: return 0xFDB8L;
			case 0xBB88: return 0xBFB9L;
			case 0xBB8C: return 0xC0B9L;
			case 0xBB90: return 0xC1B9L;
			case 0xBBA4: return 0xC2B9L;
			case 0xBBA8: return 0xC3B9L;
			case 0xBBAC: return 0xC4B9L;
			case 0xBBB4: return 0xC5B9L;
			case 0xBBB7: return 0xC6B9L;
			case 0xBBC0: return 0xC7B9L;
			case 0xBBC4: return 0xC8B9L;
			case 0xBBC8: return 0xC9B9L;
			case 0xBBD0: return 0xCAB9L;
			case 0xBBD3: return 0xCBB9L;
			case 0xBCF4: return 0xB8BAL;
			case 0xBCF5: return 0xB9BAL;
			case 0xBCF6: return 0xBABAL;
			case 0xBCF8: return 0xBBBAL;
			case 0xBCFC: return 0xBCBAL;
			case 0xBD04: return 0xBDBAL;
			case 0xBD05: return 0xBEBAL;
			case 0xBD07: return 0xBFBAL;
			case 0xBD09: return 0xC0BAL;
			case 0xBD10: return 0xC1BAL;
			case 0xBD14: return 0xC2BAL;
			case 0xBD24: return 0xC3BAL;
			case 0xBD2C: return 0xC4BAL;
			case 0xBD40: return 0xC5BAL;
			case 0xBD48: return 0xC6BAL;
			case 0xBD49: return 0xC7BAL;
			case 0xBD4C: return 0xC8BAL;
			case 0xBD50: return 0xC9BAL;
			case 0xBD58: return 0xCABAL;
			case 0xBD59: return 0xCBBAL;
			case 0xBD64: return 0xCCBAL;
			case 0xBD68: return 0xCDBAL;
			case 0xBED0: return 0xB5BBL;
			case 0xBED1: return 0xB6BBL;
			case 0xBED4: return 0xB7BBL;
			case 0xBED7: return 0xB8BBL;
			case 0xBED8: return 0xB9BBL;
			case 0xBEE0: return 0xBABBL;
			case 0xBEE3: return 0xBBBBL;
			case 0xBEE4: return 0xBCBBL;
			case 0xBEE5: return 0xBDBBL;
			case 0xBEEC: return 0xBEBBL;
			case 0xBF01: return 0xBFBBL;
			case 0xBF08: return 0xC0BBL;
			case 0xBF09: return 0xC1BBL;
			case 0xBF18: return 0xC2BBL;
			case 0xBF19: return 0xC3BBL;
			case 0xBF1B: return 0xC4BBL;
			case 0xBF1C: return 0xC5BBL;
			case 0xBF1D: return 0xC6BBL;
			case 0xBF40: return 0xC7BBL;
			case 0xBF41: return 0xC8BBL;
			case 0xBF44: return 0xC9BBL;
			case 0xBF48: return 0xCABBL;
			case 0xBF50: return 0xCBBBL;
			case 0xBF51: return 0xCCBBL;
			case 0xBF55: return 0xCDBBL;
			case 0xBF94: return 0xCEBBL;
			case 0xBFB0: return 0xCFBBL;
			case 0xBFC5: return 0xD0BBL;
			case 0xBFCC: return 0xD1BBL;
			case 0xBFCD: return 0xD2BBL;
			case 0xBFD0: return 0xD3BBL;
			case 0xBFD4: return 0xD4BBL;
			case 0xBFDC: return 0xD5BBL;
			case 0xBFDF: return 0xD6BBL;
			case 0xBFE1: return 0xD7BBL;
			case 0xC03C: return 0xD8BBL;
			case 0xC051: return 0xD9BBL;
			case 0xC058: return 0xDABBL;
			case 0xC05C: return 0xDBBBL;
			case 0xC060: return 0xDCBBL;
			case 0xC068: return 0xDDBBL;
			case 0xC069: return 0xDEBBL;
			case 0xC345: return 0xE0BDL;
			case 0xC368: return 0xE1BDL;
			case 0xC369: return 0xE2BDL;
			case 0xC36C: return 0xE3BDL;
			case 0xC370: return 0xE4BDL;
			case 0xC372: return 0xE5BDL;
			case 0xC378: return 0xE6BDL;
			case 0xC379: return 0xE7BDL;
			case 0xC37C: return 0xE8BDL;
			case 0xC37D: return 0xE9BDL;
			case 0xC384: return 0xEABDL;
			case 0xC388: return 0xEBBDL;
			case 0xC38C: return 0xECBDL;
			case 0xC3C0: return 0xEDBDL;
			case 0xC3D8: return 0xEEBDL;
			case 0xC3D9: return 0xEFBDL;
			case 0xC3DC: return 0xF0BDL;
			case 0xC3DF: return 0xF1BDL;
			case 0xC3E0: return 0xF2BDL;
			case 0xC3E2: return 0xF3BDL;
			case 0xC3E8: return 0xF4BDL;
			case 0xC3E9: return 0xF5BDL;
			case 0xC3ED: return 0xF6BDL;
			case 0xC3F4: return 0xF7BDL;
			case 0xC3F5: return 0xF8BDL;
			case 0xC3F8: return 0xF9BDL;
			case 0xC408: return 0xFABDL;
			case 0xC410: return 0xFBBDL;
			case 0xC424: return 0xFCBDL;
			case 0xC42C: return 0xFDBDL;
			case 0xC430: return 0xFEBDL;
			case 0xC434: return 0xA1BEL;
			case 0xC43C: return 0xA2BEL;
			case 0xC43D: return 0xA3BEL;
			case 0xC448: return 0xA4BEL;
			case 0xC464: return 0xA5BEL;
			case 0xC465: return 0xA6BEL;
			case 0xC468: return 0xA7BEL;
			case 0xC46C: return 0xA8BEL;
			case 0xC474: return 0xA9BEL;
			case 0xC475: return 0xAABEL;
			case 0xC479: return 0xABBEL;
			case 0xC480: return 0xACBEL;
			case 0xC494: return 0xADBEL;
			case 0xC49C: return 0xAEBEL;
			case 0xC4B8: return 0xAFBEL;
			case 0xC4BC: return 0xB0BEL;
			case 0xC92C: return 0xE1C1L;
			case 0xC934: return 0xE2C1L;
			case 0xCA4C: return 0xBCC2L;
			case 0xCA4D: return 0xBDC2L;
			case 0xCA50: return 0xBEC2L;
			case 0xCA54: return 0xBFC2L;
			case 0xCA5C: return 0xC0C2L;
			case 0xCA5D: return 0xC1C2L;
			case 0xCA5F: return 0xC2C2L;
			case 0xCA60: return 0xC3C2L;
			case 0xCA61: return 0xC4C2L;
			case 0xCA68: return 0xC5C2L;
			case 0xCA7D: return 0xC6C2L;
			case 0xCA84: return 0xC7C2L;
			case 0xCA98: return 0xC8C2L;
			case 0xCABC: return 0xC9C2L;
			case 0xCABD: return 0xCAC2L;
			case 0xCAC0: return 0xCBC2L;
			case 0xCAC4: return 0xCCC2L;
			case 0xCACC: return 0xCDC2L;
			case 0xCACD: return 0xCEC2L;
			case 0xCACF: return 0xCFC2L;
			case 0xCAD1: return 0xD0C2L;
			case 0xCAD3: return 0xD1C2L;
			case 0xCAD8: return 0xD2C2L;
			case 0xCAD9: return 0xD3C2L;
			case 0xCAE0: return 0xD4C2L;
			case 0xCAEC: return 0xD5C2L;
			case 0xCAF4: return 0xD6C2L;
			case 0xCB08: return 0xD7C2L;
			case 0xCB10: return 0xD8C2L;
			case 0xCB14: return 0xD9C2L;
			case 0xCB18: return 0xDAC2L;
			case 0xCB20: return 0xDBC2L;
			case 0xCB21: return 0xDCC2L;
			case 0xCB41: return 0xDDC2L;
			case 0xCB48: return 0xDEC2L;
			case 0xCB49: return 0xDFC2L;
			case 0xCB4C: return 0xE0C2L;
			case 0xCB50: return 0xE1C2L;
			case 0xCB58: return 0xE2C2L;
			case 0xCB59: return 0xE3C2L;
			case 0xCB5D: return 0xE4C2L;
			case 0xCB64: return 0xE5C2L;
			case 0xCB78: return 0xE6C2L;
			case 0xCB79: return 0xE7C2L;
			case 0xCB9C: return 0xE8C2L;
			case 0xCBB8: return 0xE9C2L;
			case 0xCBD4: return 0xEAC2L;
			case 0xCBE4: return 0xEBC2L;
			case 0xCBE7: return 0xECC2L;
			case 0xCBE9: return 0xEDC2L;
			case 0xCDC4: return 0xE8C3L;
			case 0xCDCC: return 0xE9C3L;
			case 0xCDD0: return 0xEAC3L;
			case 0xCEC1: return 0xBEC4L;
			case 0xCF54: return 0xDAC4L;
			case 0xCF55: return 0xDBC4L;
			case 0xCF58: return 0xDCC4L;
			case 0xCF5C: return 0xDDC4L;
			case 0xCF64: return 0xDEC4L;
			case 0xCF65: return 0xDFC4L;
			case 0xCF67: return 0xE0C4L;
			case 0xCF69: return 0xE1C4L;
			case 0xCF70: return 0xE2C4L;
			case 0xCF71: return 0xE3C4L;
			case 0xCF74: return 0xE4C4L;
			case 0xCF78: return 0xE5C4L;
			case 0xCF80: return 0xE6C4L;
			case 0xCF85: return 0xE7C4L;
			case 0xCF8C: return 0xE8C4L;
			case 0xCFA1: return 0xE9C4L;
			case 0xCFA8: return 0xEAC4L;
			case 0xCFB0: return 0xEBC4L;
			case 0xCFC4: return 0xECC4L;
			case 0xCFE0: return 0xEDC4L;
			case 0xCFE1: return 0xEEC4L;
			case 0xCFE4: return 0xEFC4L;
			case 0xCFE8: return 0xF0C4L;
			case 0xCFF0: return 0xF1C4L;
			case 0xCFF1: return 0xF2C4L;
			case 0xCFF3: return 0xF3C4L;
			case 0xCFF5: return 0xF4C4L;
			case 0xCFFC: return 0xF5C4L;
			case 0xD000: return 0xF6C4L;
			case 0xD004: return 0xF7C4L;
			case 0xD011: return 0xF8C4L;
			case 0xD018: return 0xF9C4L;
			case 0xD10D: return 0xCCC5L;
			case 0xD1A0: return 0xE4C5L;
			case 0xD1A1: return 0xE5C5L;
			case 0xD1A4: return 0xE6C5L;
			case 0xD1A8: return 0xE7C5L;
			case 0xD1B0: return 0xE8C5L;
			case 0xD1B1: return 0xE9C5L;
			case 0xD1B3: return 0xEAC5L;
			case 0xD1B5: return 0xEBC5L;
			case 0xD1BA: return 0xECC5L;
			case 0xD1BC: return 0xEDC5L;
			case 0xD1C0: return 0xEEC5L;
			case 0xD1D8: return 0xEFC5L;
			case 0xD1F4: return 0xF0C5L;
			case 0xD1F8: return 0xF1C5L;
			case 0xD207: return 0xF2C5L;
			case 0xD209: return 0xF3C5L;
			case 0xD210: return 0xF4C5L;
			case 0xD22C: return 0xF5C5L;
			case 0xD22D: return 0xF6C5L;
			case 0xD230: return 0xF7C5L;
			case 0xD234: return 0xF8C5L;
			case 0xD23C: return 0xF9C5L;
			case 0xD23D: return 0xFAC5L;
			case 0xD23F: return 0xFBC5L;
			case 0xD241: return 0xFCC5L;
			case 0xD248: return 0xFDC5L;
			case 0xD25C: return 0xFEC5L;
			case 0xD264: return 0xA1C6L;
			case 0xD41D: return 0xA2C7L;
			case 0xD440: return 0xA3C7L;
			case 0xD444: return 0xA4C7L;
			case 0xD4A9: return 0xB5C7L;
			case 0xD5A5: return 0xE2C7L;
			case 0xF805: return 0x58A6L;
			case 0xF806: return 0x63A6L;
			case 0xF807: return 0x9FA6L;
			case 0xF808: return 0x8FA6L;
			case 0xF809: return 0x81A6L;
			case 0xF80A: return 0x74A6L;
			case 0xF80B: return 0x96A6L;
			case 0xF80C: return 0x9AA6L;
			case 0xFE59: return 0x4DA1L;
			case 0xFE5A: return 0x4EA1L;
			case 0xFFE6: return 0xDCA3L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xF877: return 0x8AA1L;
			case 0xF87F: return 0xB0ADL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xF87C: return 0x57A1L;
			case 0xF87F: return 0x4BA2L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xF87C: return 0x58A1L;
			case 0xF87F: return 0x4CA2L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xF877: return 0x6CA1L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0x308: return 0x67A7L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0x20DE: return 0x41A5L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0x20DE: return 0x42A5L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0xF875: return 0xC2ACL;
			case 0xF87A: return 0x55A4L;
			case 0xF87B: return 0x41A3L;
			case 0xF87C: return 0xE6A2L;
			case 0xF87F: return 0x41A4L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0x20DE: return 0x43A5L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0xF875: return 0xC3ACL;
			case 0xF87A: return 0x56A4L;
			case 0xF87B: return 0x42A3L;
			case 0xF87C: return 0xE7A2L;
			case 0xF87F: return 0x42A4L;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0x20DE: return 0x44A5L;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0xF875: return 0xC4ACL;
			case 0xF87A: return 0x57A4L;
			case 0xF87B: return 0x43A3L;
			case 0xF87C: return 0xE8A2L;
			case 0xF87F: return 0x43A4L;
			}
			return 0;
		}
		private long getOutput13(int input) {
			switch (input) {
			case 0x20DE: return 0x45A5L;
			}
			return 0;
		}
		private long getOutput14(int input) {
			switch (input) {
			case 0xF875: return 0xC5ACL;
			case 0xF87A: return 0x58A4L;
			case 0xF87B: return 0x44A3L;
			case 0xF87C: return 0xE9A2L;
			case 0xF87F: return 0x44A4L;
			}
			return 0;
		}
		private long getOutput15(int input) {
			switch (input) {
			case 0x20DE: return 0x46A5L;
			}
			return 0;
		}
		private long getOutput16(int input) {
			switch (input) {
			case 0xF875: return 0xC6ACL;
			case 0xF87A: return 0x59A4L;
			case 0xF87B: return 0x45A3L;
			case 0xF87C: return 0xEAA2L;
			case 0xF87F: return 0x45A4L;
			}
			return 0;
		}
		private long getOutput17(int input) {
			switch (input) {
			case 0x20DE: return 0x47A5L;
			}
			return 0;
		}
		private long getOutput18(int input) {
			switch (input) {
			case 0xF875: return 0xC7ACL;
			case 0xF87A: return 0x5AA4L;
			case 0xF87B: return 0x46A3L;
			case 0xF87C: return 0xEBA2L;
			case 0xF87F: return 0x46A4L;
			}
			return 0;
		}
		private long getOutput19(int input) {
			switch (input) {
			case 0x20DE: return 0x48A5L;
			}
			return 0;
		}
		private long getOutput20(int input) {
			switch (input) {
			case 0xF875: return 0xC8ACL;
			case 0xF87A: return 0x5BA4L;
			case 0xF87B: return 0x47A3L;
			case 0xF87C: return 0xECA2L;
			case 0xF87F: return 0x47A4L;
			}
			return 0;
		}
		private long getOutput21(int input) {
			switch (input) {
			case 0x20DE: return 0x49A5L;
			}
			return 0;
		}
		private long getOutput22(int input) {
			switch (input) {
			case 0xF875: return 0xC9ACL;
			case 0xF87A: return 0x5CA4L;
			case 0xF87B: return 0x48A3L;
			case 0xF87C: return 0xEDA2L;
			case 0xF87F: return 0x48A4L;
			}
			return 0;
		}
		private long getOutput23(int input) {
			switch (input) {
			case 0x20DE: return 0x4AA5L;
			}
			return 0;
		}
		private long getOutput24(int input) {
			switch (input) {
			case 0xF875: return 0xCAACL;
			case 0xF87A: return 0x5DA4L;
			case 0xF87B: return 0x49A3L;
			case 0xF87C: return 0xEEA2L;
			case 0xF87F: return 0x49A4L;
			}
			return 0;
		}
		private long getOutput25(int input) {
			switch (input) {
			case 0xF877: return 0x79A1L;
			}
			return 0;
		}
		private long getOutput26(int input) {
			switch (input) {
			case 0x20D2: return 0x65A7L;
			case 0x20E5: return 0x62A7L;
			}
			return 0;
		}
		private long getOutput27(int input) {
			switch (input) {
			case 0xF877: return 0x78A1L;
			}
			return 0;
		}
		private long getOutput28(int input) {
			switch (input) {
			case 0xF877: return 0x83A1L;
			case 0xF87B: return 0x61A1L;
			case 0xF87C: return 0x63A1L;
			}
			return 0;
		}
		private long getOutput29(int input) {
			switch (input) {
			case 0xF877: return 0x84A1L;
			case 0xF87B: return 0x62A1L;
			case 0xF87C: return 0x64A1L;
			}
			return 0;
		}
		private long getOutput30(int input) {
			switch (input) {
			case 0xF877: return 0x81A1L;
			}
			return 0;
		}
		private long getOutput31(int input) {
			switch (input) {
			case 0xF877: return 0x82A1L;
			}
			return 0;
		}
		private long getOutput32(int input) {
			switch (input) {
			case 0xF87C: return 0x47A6L;
			}
			return 0;
		}
		private long getOutput33(int input) {
			switch (input) {
			case 0xF877: return 0x76A1L;
			}
			return 0;
		}
		private long getOutput34(int input) {
			switch (input) {
			case 0xF87F: return 0xFAA2L;
			}
			return 0;
		}
		private long getOutput35(int input) {
			switch (input) {
			case 0xF877: return 0x73A1L;
			}
			return 0;
		}
		private long getOutput36(int input) {
			switch (input) {
			case 0xF87F: return 0x82L;
			}
			return 0;
		}
		private long getOutput37(int input) {
			switch (input) {
			case 0xF87B: return 0xFBA2L;
			case 0xF87C: return 0xFCA2L;
			}
			return 0;
		}
		private long getOutput38(int input) {
			switch (input) {
			case 0xF877: return 0x6BA1L;
			case 0xF87B: return 0x69A1L;
			case 0xF87C: return 0x43A6L;
			case 0xF87F: return 0x67A1L;
			}
			return 0;
		}
		private long getOutput39(int input) {
			switch (input) {
			case 0xF87C: return 0x6AA1L;
			case 0xF87F: return 0x68A1L;
			}
			return 0;
		}
		private long getOutput40(int input) {
			switch (input) {
			case 0xF87F: return 0xFF01L;
			}
			return 0;
		}
		private long getOutput41(int input) {
			switch (input) {
			case 0xF873: return 0xAEADL;
			case 0xF87F: return 0xDCA5L;
			}
			return 0;
		}
		private long getOutput42(int input) {
			switch (input) {
			case 0xF873: return 0xACADL;
			case 0xF87F: return 0xDDA5L;
			}
			return 0;
		}
		private long getOutput43(int input) {
			switch (input) {
			case 0xF87F: return 0x86A7L;
			}
			return 0;
		}
		private long getOutput44(int input) {
			switch (input) {
			case 0xF879: return 0x51A6L;
			}
			return 0;
		}
		private long getOutput45(int input) {
			switch (input) {
			case 0xF871: return 0x4FA6L;
			case 0xF874: return 0x4BA6L;
			case 0xF879: return 0xA0A1L;
			case 0xF87C: return 0x9DA1L;
			}
			return 0;
		}
		private long getOutput46(int input) {
			switch (input) {
			case 0xF87F: return 0x90A6L;
			}
			return 0;
		}
		private long getOutput47(int input) {
			switch (input) {
			case 0xF870: return 0x89ACL;
			case 0xF871: return 0x69A8L;
			case 0xF872: return 0x6BA8L;
			case 0xF873: return 0x5DACL;
			case 0xF874: return 0x66ACL;
			case 0xF875: return 0x63A8L;
			case 0xF878: return 0x62ACL;
			case 0xF879: return 0x53A8L;
			case 0xF87A: return 0x55ACL;
			case 0xF87B: return 0x42A8L;
			case 0xF87C: return 0x4EA8L;
			case 0xF87F: return 0x5FA8L;
			}
			return 0;
		}
		private long getOutput48(int input) {
			switch (input) {
			case 0xF870: return 0x8BACL;
			case 0xF872: return 0x6DA8L;
			case 0xF873: return 0x60ACL;
			case 0xF874: return 0x68ACL;
			case 0xF875: return 0x65A8L;
			case 0xF878: return 0x64ACL;
			case 0xF879: return 0x55A8L;
			case 0xF87A: return 0x57ACL;
			case 0xF87B: return 0x43A8L;
			case 0xF87C: return 0x4FA8L;
			case 0xF87F: return 0x61A8L;
			}
			return 0;
		}
		private long getOutput49(int input) {
			switch (input) {
			case 0xF870: return 0x8AACL;
			case 0xF872: return 0x6CA8L;
			case 0xF874: return 0x67ACL;
			case 0xF875: return 0x64A8L;
			case 0xF878: return 0x63ACL;
			case 0xF879: return 0x54A8L;
			case 0xF87A: return 0x56ACL;
			case 0xF87B: return 0x41A8L;
			case 0xF87C: return 0x4DA8L;
			}
			return 0;
		}
		private long getOutput50(int input) {
			switch (input) {
			case 0xF870: return 0x8CACL;
			case 0xF872: return 0x6EA8L;
			case 0xF873: return 0x61ACL;
			case 0xF874: return 0x69ACL;
			case 0xF875: return 0x66A8L;
			case 0xF878: return 0x65ACL;
			case 0xF879: return 0x56A8L;
			case 0xF87A: return 0x58ACL;
			case 0xF87B: return 0x44A8L;
			case 0xF87C: return 0x50A8L;
			case 0xF87F: return 0x62A8L;
			}
			return 0;
		}
		private long getOutput51(int input) {
			switch (input) {
			case 0xF87C: return 0x51A8L;
			}
			return 0;
		}
		private long getOutput52(int input) {
			switch (input) {
			case 0xF87C: return 0x52A8L;
			}
			return 0;
		}
		private long getOutput53(int input) {
			switch (input) {
			case 0xF87B: return 0x45A8L;
			}
			return 0;
		}
		private long getOutput54(int input) {
			switch (input) {
			case 0xF87B: return 0x46A8L;
			}
			return 0;
		}
		private long getOutput55(int input) {
			switch (input) {
			case 0xF87B: return 0x47A8L;
			}
			return 0;
		}
		private long getOutput56(int input) {
			switch (input) {
			case 0xF87B: return 0x48A8L;
			}
			return 0;
		}
		private long getOutput57(int input) {
			switch (input) {
			case 0xF87A: return 0x7AACL;
			case 0xF87C: return 0x85ACL;
			case 0xF87F: return 0x8AA8L;
			}
			return 0;
		}
		private long getOutput58(int input) {
			switch (input) {
			case 0xF87A: return 0x77ACL;
			case 0xF87C: return 0x82ACL;
			case 0xF87F: return 0x87A8L;
			}
			return 0;
		}
		private long getOutput59(int input) {
			switch (input) {
			case 0xF87A: return 0x78ACL;
			case 0xF87B: return 0x7DA8L;
			case 0xF87C: return 0x83ACL;
			case 0xF87F: return 0x88A8L;
			}
			return 0;
		}
		private long getOutput60(int input) {
			switch (input) {
			case 0xF879: return 0x99A8L;
			case 0xF87F: return 0x4DACL;
			}
			return 0;
		}
		private long getOutput61(int input) {
			switch (input) {
			case 0xF879: return 0x98A8L;
			case 0xF87F: return 0x4CACL;
			}
			return 0;
		}
		private long getOutput62(int input) {
			switch (input) {
			case 0xF87C: return 0x9BA8L;
			}
			return 0;
		}
		private long getOutput63(int input) {
			switch (input) {
			case 0xF87C: return 0x9AA8L;
			}
			return 0;
		}
		private long getOutput64(int input) {
			switch (input) {
			case 0xF879: return 0x95A8L;
			case 0xF87F: return 0x4CA8L;
			}
			return 0;
		}
		private long getOutput65(int input) {
			switch (input) {
			case 0x20DD: return 0x5BA8L;
			case 0x20DE: return 0x57A8L;
			case 0xF870: return 0x47ACL;
			case 0xF874: return 0x97A8L;
			case 0xF875: return 0x6EACL;
			case 0xF878: return 0xA6ADL;
			case 0xF879: return 0x8EA8L;
			case 0xF87A: return 0x73A8L;
			case 0xF87B: return 0x77A8L;
			case 0xF87C: return 0x59ACL;
			case 0xF87F: return 0x4FACL;
			}
			return 0;
		}
		private long getOutput66(int input) {
			switch (input) {
			case 0x20DD: return 0x5DA8L;
			case 0x20DE: return 0x59A8L;
			case 0xF875: return 0x70ACL;
			case 0xF878: return 0xA7ADL;
			case 0xF879: return 0x90A8L;
			case 0xF87A: return 0x75A8L;
			case 0xF87B: return 0x79A8L;
			case 0xF87C: return 0x5BACL;
			case 0xF87F: return 0xAFADL;
			}
			return 0;
		}
		private long getOutput67(int input) {
			switch (input) {
			case 0x20DE: return 0x58A8L;
			case 0xF870: return 0x46ACL;
			case 0xF874: return 0x96A8L;
			case 0xF875: return 0x6FACL;
			case 0xF878: return 0xA5ADL;
			case 0xF879: return 0x8FA8L;
			case 0xF87C: return 0x5AACL;
			case 0xF87F: return 0x4EACL;
			}
			return 0;
		}
		private long getOutput68(int input) {
			switch (input) {
			case 0x20DD: return 0x5EA8L;
			case 0x20DE: return 0x5AA8L;
			case 0xF875: return 0x71ACL;
			case 0xF878: return 0xA8ADL;
			case 0xF879: return 0x91A8L;
			case 0xF87A: return 0x76A8L;
			case 0xF87B: return 0x7AA8L;
			case 0xF87C: return 0x5CACL;
			}
			return 0;
		}
		private long getOutput69(int input) {
			switch (input) {
			case 0xF87F: return 0x52A7L;
			}
			return 0;
		}
		private long getOutput70(int input) {
			switch (input) {
			case 0xF877: return 0x88A1L;
			}
			return 0;
		}
		private long getOutput71(int input) {
			switch (input) {
			case 0xF877: return 0x89A1L;
			}
			return 0;
		}
		private long getOutput72(int input) {
			switch (input) {
			case 0xF877: return 0x77A1L;
			}
			return 0;
		}
		private long getOutput73(int input) {
			switch (input) {
			case 0xF877: return 0x74A1L;
			}
			return 0;
		}
		private long getOutput74(int input) {
			switch (input) {
			case 0xF87F: return 0x98A4L;
			}
			return 0;
		}
		private long getOutput75(int input) {
			switch (input) {
			case 0x347: return 0x9EA4L;
			}
			return 0;
		}
		private long getOutput76(int input) {
			switch (input) {
			case 0xF877: return 0x85A1L;
			case 0xF87F: return 0x57A7L;
			}
			return 0;
		}
		private long getOutput77(int input) {
			switch (input) {
			case 0xF877: return 0x86A1L;
			case 0xF87F: return 0x54A7L;
			}
			return 0;
		}
		private long getOutput78(int input) {
			switch (input) {
			case 0x336: return 0x79A7L;
			case 0xF877: return 0x75A1L;
			}
			return 0;
		}
		private long getOutput79(int input) {
			switch (input) {
			case 0xF877: return 0x7BA1L;
			}
			return 0;
		}
		private long getOutput80(int input) {
			switch (input) {
			case 0x20D2: return 0x6EA7L;
			case 0x20E5: return 0x63A7L;
			}
			return 0;
		}
		private long getOutput81(int input) {
			switch (input) {
			case 0xF877: return 0x87A1L;
			}
			return 0;
		}
		private long getOutput82(int input) {
			switch (input) {
			case 0x338: return 0x6DA7L;
			}
			return 0;
		}
		private long getOutput83(int input) {
			switch (input) {
			case 0xF87F: return 0x7AA7L;
			}
			return 0;
		}
		private long getOutput84(int input) {
			switch (input) {
			case 0xF876: return 0x48A7L;
			}
			return 0;
		}
		private long getOutput85(int input) {
			switch (input) {
			case 0xF87F: return 0x4CA5L;
			}
			return 0;
		}
		private long getOutput86(int input) {
			switch (input) {
			case 0xF87F: return 0x4DA5L;
			}
			return 0;
		}
		private long getOutput87(int input) {
			switch (input) {
			case 0xF87F: return 0x4EA5L;
			}
			return 0;
		}
		private long getOutput88(int input) {
			switch (input) {
			case 0xF87F: return 0x4FA5L;
			}
			return 0;
		}
		private long getOutput89(int input) {
			switch (input) {
			case 0xF87F: return 0x50A5L;
			}
			return 0;
		}
		private long getOutput90(int input) {
			switch (input) {
			case 0xF87F: return 0x51A5L;
			}
			return 0;
		}
		private long getOutput91(int input) {
			switch (input) {
			case 0xF87F: return 0x52A5L;
			}
			return 0;
		}
		private long getOutput92(int input) {
			switch (input) {
			case 0xF87F: return 0x53A5L;
			}
			return 0;
		}
		private long getOutput93(int input) {
			switch (input) {
			case 0xF87F: return 0x54A5L;
			}
			return 0;
		}
		private long getOutput94(int input) {
			switch (input) {
			case 0xF87F: return 0x4BA5L;
			}
			return 0;
		}
		private long getOutput95(int input) {
			switch (input) {
			case 0xF878: return 0x73A4L;
			case 0xF87F: return 0x5FA3L;
			}
			return 0;
		}
		private long getOutput96(int input) {
			switch (input) {
			case 0xF878: return 0x74A4L;
			case 0xF87F: return 0x60A3L;
			}
			return 0;
		}
		private long getOutput97(int input) {
			switch (input) {
			case 0xF878: return 0x75A4L;
			case 0xF87F: return 0x61A3L;
			}
			return 0;
		}
		private long getOutput98(int input) {
			switch (input) {
			case 0xF878: return 0x76A4L;
			case 0xF87F: return 0x62A3L;
			}
			return 0;
		}
		private long getOutput99(int input) {
			switch (input) {
			case 0xF878: return 0x77A4L;
			case 0xF87F: return 0x63A3L;
			}
			return 0;
		}
		private long getOutput100(int input) {
			switch (input) {
			case 0xF878: return 0x78A4L;
			case 0xF87F: return 0x64A3L;
			}
			return 0;
		}
		private long getOutput101(int input) {
			switch (input) {
			case 0xF878: return 0x79A4L;
			case 0xF87F: return 0x65A3L;
			}
			return 0;
		}
		private long getOutput102(int input) {
			switch (input) {
			case 0xF878: return 0x7AA4L;
			case 0xF87F: return 0x66A3L;
			}
			return 0;
		}
		private long getOutput103(int input) {
			switch (input) {
			case 0xF878: return 0x7BA4L;
			case 0xF87F: return 0x67A3L;
			}
			return 0;
		}
		private long getOutput104(int input) {
			switch (input) {
			case 0xF878: return 0x7CA4L;
			case 0xF87F: return 0x68A3L;
			}
			return 0;
		}
		private long getOutput105(int input) {
			switch (input) {
			case 0x20DF: return 0x56A6L;
			}
			return 0;
		}
		private long getOutput106(int input) {
			switch (input) {
			case 0x20DF: return 0x59A6L;
			case 0xF879: return 0x8DA7L;
			case 0xF87B: return 0x8EA7L;
			case 0xF87C: return 0x8CA7L;
			}
			return 0;
		}
		private long getOutput107(int input) {
			switch (input) {
			case 0xF87F: return 0x8AA6L;
			}
			return 0;
		}
		private long getOutput108(int input) {
			switch (input) {
			case 0xF878: return 0x49A7L;
			}
			return 0;
		}
		private long getOutput109(int input) {
			switch (input) {
			case 0x20DD: return 0x6BA6L;
			}
			return 0;
		}
		private long getOutput110(int input) {
			switch (input) {
			case 0x20DD: return 0x6AA6L;
			case 0xF87F: return 0x45A7L;
			}
			return 0;
		}
		private long getOutput111(int input) {
			switch (input) {
			case 0x20E4: return 0x9BA7L;
			}
			return 0;
		}
		private long getOutput112(int input) {
			switch (input) {
			case 0x20DE: return 0x65A6L;
			case 0xF879: return 0x8BA7L;
			}
			return 0;
		}
		private long getOutput113(int input) {
			switch (input) {
			case 0x20DE: return 0x62A6L;
			case 0x20DF: return 0x57A6L;
			case 0xF879: return 0x89A7L;
			case 0xF87B: return 0x8AA7L;
			case 0xF87C: return 0x88A7L;
			case 0xF87F: return 0x4EA7L;
			}
			return 0;
		}
		private long getOutput114(int input) {
			switch (input) {
			case 0x20DF: return 0x61A6L;
			}
			return 0;
		}
		private long getOutput115(int input) {
			switch (input) {
			case 0xF87F: return 0x89A6L;
			}
			return 0;
		}
		private long getOutput116(int input) {
			switch (input) {
			case 0x20DD: return 0x82A6L;
			}
			return 0;
		}
		private long getOutput117(int input) {
			switch (input) {
			case 0xF879: return 0x91A7L;
			case 0xF87B: return 0x92A7L;
			case 0xF87F: return 0x44A7L;
			}
			return 0;
		}
		private long getOutput118(int input) {
			switch (input) {
			case 0x20DD: return 0x69A6L;
			}
			return 0;
		}
		private long getOutput119(int input) {
			switch (input) {
			case 0xF879: return 0x93A7L;
			}
			return 0;
		}
		private long getOutput120(int input) {
			switch (input) {
			case 0xF87C: return 0x70A6L;
			}
			return 0;
		}
		private long getOutput121(int input) {
			switch (input) {
			case 0xF87C: return 0x71A6L;
			case 0xF87F: return 0x76A6L;
			}
			return 0;
		}
		private long getOutput122(int input) {
			switch (input) {
			case 0xF87F: return 0x5EA6L;
			}
			return 0;
		}
		private long getOutput123(int input) {
			switch (input) {
			case 0xF87F: return 0x8FACL;
			}
			return 0;
		}
		private long getOutput124(int input) {
			switch (input) {
			case 0xF87F: return 0x5FA6L;
			}
			return 0;
		}
		private long getOutput125(int input) {
			switch (input) {
			case 0xF87F: return 0x90ACL;
			}
			return 0;
		}
		private long getOutput126(int input) {
			switch (input) {
			case 0xF876: return 0x98A6L;
			case 0xF87A: return 0x97A6L;
			}
			return 0;
		}
		private long getOutput127(int input) {
			switch (input) {
			case 0xF87F: return 0x41A7L;
			}
			return 0;
		}
		private long getOutput128(int input) {
			switch (input) {
			case 0xF87A: return 0x87A6L;
			}
			return 0;
		}
		private long getOutput129(int input) {
			switch (input) {
			case 0xF87A: return 0x79A6L;
			}
			return 0;
		}
		private long getOutput130(int input) {
			switch (input) {
			case 0xF87A: return 0x7BA6L;
			}
			return 0;
		}
		private long getOutput131(int input) {
			switch (input) {
			case 0x20D8: return 0x9BA6L;
			}
			return 0;
		}
		private long getOutput132(int input) {
			switch (input) {
			case 0xF87A: return 0x7AA6L;
			case 0xF87F: return 0x8EA6L;
			}
			return 0;
		}
		private long getOutput133(int input) {
			switch (input) {
			case 0xF87F: return 0x69A4L;
			}
			return 0;
		}
		private long getOutput134(int input) {
			switch (input) {
			case 0xF87F: return 0x6AA4L;
			}
			return 0;
		}
		private long getOutput135(int input) {
			switch (input) {
			case 0xF87F: return 0x6BA4L;
			}
			return 0;
		}
		private long getOutput136(int input) {
			switch (input) {
			case 0xF87F: return 0x6CA4L;
			}
			return 0;
		}
		private long getOutput137(int input) {
			switch (input) {
			case 0xF87F: return 0x6DA4L;
			}
			return 0;
		}
		private long getOutput138(int input) {
			switch (input) {
			case 0xF87F: return 0x6EA4L;
			}
			return 0;
		}
		private long getOutput139(int input) {
			switch (input) {
			case 0xF87F: return 0x6FA4L;
			}
			return 0;
		}
		private long getOutput140(int input) {
			switch (input) {
			case 0xF87F: return 0x70A4L;
			}
			return 0;
		}
		private long getOutput141(int input) {
			switch (input) {
			case 0xF87F: return 0x71A4L;
			}
			return 0;
		}
		private long getOutput142(int input) {
			switch (input) {
			case 0xF87F: return 0x72A4L;
			}
			return 0;
		}
		private long getOutput143(int input) {
			switch (input) {
			case 0x20DD: return 0x85A6L;
			}
			return 0;
		}
		private long getOutput144(int input) {
			switch (input) {
			case 0xF87A: return 0x7DACL;
			case 0xF87C: return 0x88ACL;
			case 0xF87F: return 0x85A8L;
			}
			return 0;
		}
		private long getOutput145(int input) {
			switch (input) {
			case 0xF87A: return 0x79ACL;
			case 0xF87C: return 0x84ACL;
			}
			return 0;
		}
		private long getOutput146(int input) {
			switch (input) {
			case 0xF87A: return 0x76ACL;
			case 0xF87C: return 0x81ACL;
			}
			return 0;
		}
		private long getOutput147(int input) {
			switch (input) {
			case 0xF87A: return 0x7BACL;
			case 0xF87C: return 0x86ACL;
			}
			return 0;
		}
		private long getOutput148(int input) {
			switch (input) {
			case 0xF87A: return 0x7CACL;
			case 0xF87C: return 0x87ACL;
			case 0xF87F: return 0x84A8L;
			}
			return 0;
		}
		private long getOutput149(int input) {
			switch (input) {
			case 0xF87F: return 0x45ACL;
			}
			return 0;
		}
		private long getOutput150(int input) {
			switch (input) {
			case 0xF87F: return 0x44ACL;
			}
			return 0;
		}
		private long getOutput151(int input) {
			switch (input) {
			case 0xF873: return 0x43A2L;
			case 0xF878: return 0x41A2L;
			case 0xF879: return 0x53A1L;
			case 0xF87B: return 0x65A1L;
			case 0xF87C: return 0x55A1L;
			case 0xF87F: return 0x51A1L;
			}
			return 0;
		}
		private long getOutput152(int input) {
			switch (input) {
			case 0xF873: return 0x44A2L;
			case 0xF878: return 0x42A2L;
			case 0xF879: return 0x54A1L;
			case 0xF87B: return 0x66A1L;
			case 0xF87C: return 0x56A1L;
			case 0xF87F: return 0x52A1L;
			}
			return 0;
		}
		private long getOutput153(int input) {
			switch (input) {
			case 0x20DE: return 0x67A6L;
			}
			return 0;
		}
		private long getOutput154(int input) {
			switch (input) {
			case 0x347: return 0x9FA4L;
			}
			return 0;
		}
		private long getOutput155(int input) {
			switch (input) {
			case 0xF87D: return 0xDBA5L;
			}
			return 0;
		}
		private long getOutput156(int input) {
			switch (input) {
			case 0xF876: return 0x8BA1L;
			}
			return 0;
		}
		private long getOutput157(int input) {
			switch (input) {
			case 0xF878: return 0x4BA1L;
			}
			return 0;
		}
		private long getOutput158(int input) {
			switch (input) {
			case 0xF878: return 0x4CA1L;
			}
			return 0;
		}
		private long getOutput159(int input) {
			switch (input) {
			case 0xF878: return 0x49A1L;
			}
			return 0;
		}
		private long getOutput160(int input) {
			switch (input) {
			case 0xF878: return 0x4AA1L;
			}
			return 0;
		}
		private long getOutput161(int input) {
			switch (input) {
			case 0xF879: return 0xA1ADL;
			case 0xF87B: return 0x43A1L;
			case 0xF87C: return 0x45A1L;
			case 0xF87F: return 0x41A1L;
			}
			return 0;
		}
		private long getOutput162(int input) {
			switch (input) {
			case 0xF879: return 0xA2ADL;
			case 0xF87B: return 0x44A1L;
			case 0xF87C: return 0x46A1L;
			case 0xF87F: return 0x42A1L;
			}
			return 0;
		}
		private long getOutput163(int input) {
			switch (input) {
			case 0xF879: return 0xA3ADL;
			case 0xF87C: return 0x47A1L;
			}
			return 0;
		}
		private long getOutput164(int input) {
			switch (input) {
			case 0xF879: return 0xA4ADL;
			case 0xF87C: return 0x48A1L;
			}
			return 0;
		}
		private long getOutput165(int input) {
			switch (input) {
			case 0xF878: return 0x49A2L;
			case 0xF87F: return 0x5BA1L;
			}
			return 0;
		}
		private long getOutput166(int input) {
			switch (input) {
			case 0xF878: return 0x4AA2L;
			case 0xF87F: return 0x5CA1L;
			}
			return 0;
		}
		private long getOutput167(int input) {
			switch (input) {
			case 0xF87C: return 0x7DA6L;
			}
			return 0;
		}
		private long getOutput168(int input) {
			switch (input) {
			case 0xF878: return 0x47A2L;
			}
			return 0;
		}
		private long getOutput169(int input) {
			switch (input) {
			case 0xF878: return 0x48A2L;
			}
			return 0;
		}
		private long getOutput170(int input) {
			switch (input) {
			case 0xF87A: return 0xF9A6L;
			}
			return 0;
		}
		private long getOutput171(int input) {
			switch (input) {
			case 0xF87A: return 0xFAA6L;
			}
			return 0;
		}
		private long getOutput172(int input) {
			switch (input) {
			case 0xF87A: return 0xFBA6L;
			}
			return 0;
		}
		private long getOutput173(int input) {
			switch (input) {
			case 0xF87A: return 0xFCA6L;
			}
			return 0;
		}
		private long getOutput174(int input) {
			switch (input) {
			case 0xF87A: return 0xFDA6L;
			}
			return 0;
		}
		private long getOutput175(int input) {
			switch (input) {
			case 0xF87A: return 0xFEA6L;
			}
			return 0;
		}
		private long getOutput176(int input) {
			switch (input) {
			case 0xF87A: return 0xF9A5L;
			}
			return 0;
		}
		private long getOutput177(int input) {
			switch (input) {
			case 0xF87A: return 0xFAA5L;
			}
			return 0;
		}
		private long getOutput178(int input) {
			switch (input) {
			case 0xF87A: return 0xFBA5L;
			}
			return 0;
		}
		private long getOutput179(int input) {
			switch (input) {
			case 0xF87A: return 0xFCA5L;
			}
			return 0;
		}
		private long getOutput180(int input) {
			switch (input) {
			case 0xF87F: return 0x83A7L;
			}
			return 0;
		}
		private long getOutput181(int input) {
			switch (input) {
			case 0x20DE: return 0x55ADL;
			case 0xF876: return 0x8CA1L;
			}
			return 0;
		}
		private long getOutput182(int input) {
			switch (input) {
			case 0xF87A: return 0x41ADL;
			}
			return 0;
		}
		private long getOutput183(int input) {
			switch (input) {
			case 0x20DE: return 0x5BADL;
			case 0xF876: return 0x92A1L;
			}
			return 0;
		}
		private long getOutput184(int input) {
			switch (input) {
			case 0xF87A: return 0x47ADL;
			}
			return 0;
		}
		private long getOutput185(int input) {
			switch (input) {
			case 0x20DE: return 0x57ADL;
			case 0xF876: return 0x8EA1L;
			}
			return 0;
		}
		private long getOutput186(int input) {
			switch (input) {
			case 0xF87A: return 0x43ADL;
			}
			return 0;
		}
		private long getOutput187(int input) {
			switch (input) {
			case 0x20DE: return 0x5DADL;
			case 0xF876: return 0x94A1L;
			}
			return 0;
		}
		private long getOutput188(int input) {
			switch (input) {
			case 0xF87A: return 0x49ADL;
			}
			return 0;
		}
		private long getOutput189(int input) {
			switch (input) {
			case 0x20DE: return 0x56ADL;
			case 0xF876: return 0x8DA1L;
			}
			return 0;
		}
		private long getOutput190(int input) {
			switch (input) {
			case 0xF87A: return 0x42ADL;
			}
			return 0;
		}
		private long getOutput191(int input) {
			switch (input) {
			case 0x20DE: return 0x59ADL;
			case 0xF876: return 0x90A1L;
			}
			return 0;
		}
		private long getOutput192(int input) {
			switch (input) {
			case 0xF87A: return 0x45ADL;
			}
			return 0;
		}
		private long getOutput193(int input) {
			switch (input) {
			case 0x20DD: return 0x6DABL;
			case 0x20DE: return 0x6EAAL;
			}
			return 0;
		}
		private long getOutput194(int input) {
			switch (input) {
			case 0x20DD: return 0x5AABL;
			case 0x20DE: return 0x5AAAL;
			}
			return 0;
		}
		private long getOutput195(int input) {
			switch (input) {
			case 0x20DE: return 0x66AAL;
			}
			return 0;
		}
		private long getOutput196(int input) {
			switch (input) {
			case 0x20DE: return 0x5CADL;
			case 0xF876: return 0x93A1L;
			}
			return 0;
		}
		private long getOutput197(int input) {
			switch (input) {
			case 0xF87A: return 0x48ADL;
			}
			return 0;
		}
		private long getOutput198(int input) {
			switch (input) {
			case 0x20DE: return 0x5AADL;
			case 0xF876: return 0x91A1L;
			}
			return 0;
		}
		private long getOutput199(int input) {
			switch (input) {
			case 0xF87A: return 0x46ADL;
			}
			return 0;
		}
		private long getOutput200(int input) {
			switch (input) {
			case 0x20DD: return 0x9FAAL;
			case 0x20DE: return 0x58AAL;
			}
			return 0;
		}
		private long getOutput201(int input) {
			switch (input) {
			case 0xF87F: return 0x50A7L;
			}
			return 0;
		}
		private long getOutput202(int input) {
			switch (input) {
			case 0xF87F: return 0x4FA7L;
			}
			return 0;
		}
		private long getOutput203(int input) {
			switch (input) {
			case 0x20DD: return 0x60ABL;
			case 0x20DE: return 0x69AAL;
			}
			return 0;
		}
		private long getOutput204(int input) {
			switch (input) {
			case 0x20DD: return 0x5EABL;
			case 0x20DE: return 0x62AAL;
			}
			return 0;
		}
		private long getOutput205(int input) {
			switch (input) {
			case 0x20DD: return 0x63ABL;
			case 0x20DE: return 0x6CAAL;
			}
			return 0;
		}
		private long getOutput206(int input) {
			switch (input) {
			case 0x20DD: return 0x5BABL;
			case 0x20DE: return 0x5CAAL;
			}
			return 0;
		}
		private long getOutput207(int input) {
			switch (input) {
			case 0x20DE: return 0x5EADL;
			case 0xF876: return 0x95A1L;
			}
			return 0;
		}
		private long getOutput208(int input) {
			switch (input) {
			case 0xF87A: return 0x4AADL;
			}
			return 0;
		}
		private long getOutput209(int input) {
			switch (input) {
			case 0xF87F: return 0x92A6L;
			}
			return 0;
		}
		private long getOutput210(int input) {
			switch (input) {
			case 0x20DD: return 0x44ABL;
			case 0x20DE: return 0x54AAL;
			}
			return 0;
		}
		private long getOutput211(int input) {
			switch (input) {
			case 0x20DD: return 0x65ABL;
			}
			return 0;
		}
		private long getOutput212(int input) {
			switch (input) {
			case 0x20DD: return 0x5DABL;
			case 0x20DE: return 0x5FAAL;
			}
			return 0;
		}
		private long getOutput213(int input) {
			switch (input) {
			case 0x20DE: return 0x5DAAL;
			}
			return 0;
		}
		private long getOutput214(int input) {
			switch (input) {
			case 0x20DE: return 0x58ADL;
			case 0xF876: return 0x8FA1L;
			}
			return 0;
		}
		private long getOutput215(int input) {
			switch (input) {
			case 0xF87A: return 0x44ADL;
			}
			return 0;
		}
		private long getOutput216(int input) {
			switch (input) {
			case 0x20DD: return 0x6BABL;
			}
			return 0;
		}
		private long getOutput217(int input) {
			switch (input) {
			case 0x20DE: return 0x6FADL;
			}
			return 0;
		}
		private long getOutput218(int input) {
			switch (input) {
			case 0xF87C: return 0x7DADL;
			}
			return 0;
		}
		private long getOutput219(int input) {
			switch (input) {
			case 0x20DE: return 0x68AAL;
			}
			return 0;
		}
		private long getOutput220(int input) {
			switch (input) {
			case 0x20DE: return 0x63AAL;
			}
			return 0;
		}
		private long getOutput221(int input) {
			switch (input) {
			case 0x20DD: return 0x69ABL;
			case 0x20DE: return 0x70AAL;
			}
			return 0;
		}
		private long getOutput222(int input) {
			switch (input) {
			case 0x20DE: return 0x65AAL;
			}
			return 0;
		}
		private long getOutput223(int input) {
			switch (input) {
			case 0x20DD: return 0x58ABL;
			case 0x20DE: return 0x57AAL;
			}
			return 0;
		}
		private long getOutput224(int input) {
			switch (input) {
			case 0x20DD: return 0x59ABL;
			}
			return 0;
		}
		private long getOutput225(int input) {
			switch (input) {
			case 0x20DE: return 0x6DAAL;
			}
			return 0;
		}
		private long getOutput226(int input) {
			switch (input) {
			case 0x20DD: return 0x62ABL;
			case 0x20DE: return 0x6BAAL;
			}
			return 0;
		}
		private long getOutput227(int input) {
			switch (input) {
			case 0x20DD: return 0x67ABL;
			}
			return 0;
		}
		private long getOutput228(int input) {
			switch (input) {
			case 0x20DE: return 0x69ADL;
			}
			return 0;
		}
		private long getOutput229(int input) {
			switch (input) {
			case 0xF87C: return 0x77ADL;
			}
			return 0;
		}
		private long getOutput230(int input) {
			switch (input) {
			case 0x20DE: return 0x6AADL;
			}
			return 0;
		}
		private long getOutput231(int input) {
			switch (input) {
			case 0xF87C: return 0x78ADL;
			}
			return 0;
		}
		private long getOutput232(int input) {
			switch (input) {
			case 0x20DE: return 0x6DADL;
			}
			return 0;
		}
		private long getOutput233(int input) {
			switch (input) {
			case 0xF87C: return 0x7BADL;
			}
			return 0;
		}
		private long getOutput234(int input) {
			switch (input) {
			case 0x20DD: return 0x46ABL;
			}
			return 0;
		}
		private long getOutput235(int input) {
			switch (input) {
			case 0x20DD: return 0x66ABL;
			case 0x20DE: return 0x61AAL;
			}
			return 0;
		}
		private long getOutput236(int input) {
			switch (input) {
			case 0x20DE: return 0x6CADL;
			}
			return 0;
		}
		private long getOutput237(int input) {
			switch (input) {
			case 0xF87C: return 0x7AADL;
			}
			return 0;
		}
		private long getOutput238(int input) {
			switch (input) {
			case 0x20DD: return 0x64ABL;
			}
			return 0;
		}
		private long getOutput239(int input) {
			switch (input) {
			case 0x20DE: return 0x6FAAL;
			}
			return 0;
		}
		private long getOutput240(int input) {
			switch (input) {
			case 0x20DE: return 0x67AAL;
			}
			return 0;
		}
		private long getOutput241(int input) {
			switch (input) {
			case 0x20DE: return 0x6BADL;
			}
			return 0;
		}
		private long getOutput242(int input) {
			switch (input) {
			case 0xF87C: return 0x79ADL;
			}
			return 0;
		}
		private long getOutput243(int input) {
			switch (input) {
			case 0x20DD: return 0x68ABL;
			}
			return 0;
		}
		private long getOutput244(int input) {
			switch (input) {
			case 0x20DE: return 0x5EAAL;
			}
			return 0;
		}
		private long getOutput245(int input) {
			switch (input) {
			case 0x20DE: return 0x59AAL;
			}
			return 0;
		}
		private long getOutput246(int input) {
			switch (input) {
			case 0x20DE: return 0x6AAAL;
			}
			return 0;
		}
		private long getOutput247(int input) {
			switch (input) {
			case 0x20DD: return 0x5FABL;
			}
			return 0;
		}
		private long getOutput248(int input) {
			switch (input) {
			case 0x20DD: return 0x45ABL;
			}
			return 0;
		}
		private long getOutput249(int input) {
			switch (input) {
			case 0x20DE: return 0x60AAL;
			case 0x20E4: return 0x7CA7L;
			}
			return 0;
		}
		private long getOutput250(int input) {
			switch (input) {
			case 0x20DE: return 0x55AAL;
			}
			return 0;
		}
		private long getOutput251(int input) {
			switch (input) {
			case 0xF87A: return 0x76AAL;
			}
			return 0;
		}
		private long getOutput252(int input) {
			switch (input) {
			case 0x20DE: return 0x64AAL;
			}
			return 0;
		}
		private long getOutput253(int input) {
			switch (input) {
			case 0x20DE: return 0x6EADL;
			}
			return 0;
		}
		private long getOutput254(int input) {
			switch (input) {
			case 0xF87C: return 0x7CADL;
			}
			return 0;
		}
		private long getOutput255(int input) {
			switch (input) {
			case 0x20DD: return 0x6AABL;
			}
			return 0;
		}
		private long getOutput256(int input) {
			switch (input) {
			case 0x20DD: return 0x61ABL;
			}
			return 0;
		}
		private long getOutput257(int input) {
			switch (input) {
			case 0x20DE: return 0x5BAAL;
			}
			return 0;
		}
		private long getOutput258(int input) {
			switch (input) {
			case 0x20DD: return 0x75ABL;
			}
			return 0;
		}
		private long getOutput259(int input) {
			switch (input) {
			case 0xF87A: return 0x9BABL;
			}
			return 0;
		}
		private long getOutput260(int input) {
			switch (input) {
			case 0x20DD: return 0x55ABL;
			}
			return 0;
		}
		private long getOutput261(int input) {
			switch (input) {
			case 0x20DD: return 0x43ABL;
			case 0x20DE: return 0x50AAL;
			}
			return 0;
		}
		private long getOutput262(int input) {
			switch (input) {
			case 0x20DD: return 0x56ABL;
			}
			return 0;
		}
		private long getOutput263(int input) {
			switch (input) {
			case 0x20DD: return 0x47ABL;
			}
			return 0;
		}
		private long getOutput264(int input) {
			switch (input) {
			case 0x20DD: return 0x96AAL;
			}
			return 0;
		}
		private long getOutput265(int input) {
			switch (input) {
			case 0x20DD: return 0x9EAAL;
			}
			return 0;
		}
		private long getOutput267(int input) {
			switch (input) {
			case 0xF87A: return 0x77AAL;
			}
			return 0;
		}
		private long getOutput268(int input) {
			switch (input) {
			case 0x20DD: return 0x42ABL;
			}
			return 0;
		}
		private long getOutput269(int input) {
			switch (input) {
			case 0x20DD: return 0x76ABL;
			}
			return 0;
		}
		private long getOutput270(int input) {
			switch (input) {
			case 0xF87A: return 0x9CABL;
			}
			return 0;
		}
		private long getOutput271(int input) {
			switch (input) {
			case 0x20DD: return 0x8CAAL;
			}
			return 0;
		}
		private long getOutput272(int input) {
			switch (input) {
			case 0xF87A: return 0x99ABL;
			}
			return 0;
		}
		private long getOutput273(int input) {
			switch (input) {
			case 0x20DD: return 0x8BAAL;
			}
			return 0;
		}
		private long getOutput274(int input) {
			switch (input) {
			case 0xF87A: return 0x98ABL;
			}
			return 0;
		}
		private long getOutput276(int input) {
			switch (input) {
			case 0xF87A: return 0x97ABL;
			}
			return 0;
		}
		private long getOutput277(int input) {
			switch (input) {
			case 0x20DD: return 0x77ABL;
			}
			return 0;
		}
		private long getOutput278(int input) {
			switch (input) {
			case 0xF87A: return 0x9DABL;
			}
			return 0;
		}
		private long getOutput279(int input) {
			switch (input) {
			case 0x20DD: return 0x91ACL;
			}
			return 0;
		}
		private long getOutput280(int input) {
			switch (input) {
			case 0xF87A: return 0x8AABL;
			}
			return 0;
		}
		private long getOutput281(int input) {
			switch (input) {
			case 0x20DD: return 0x48ABL;
			case 0x20DE: return 0x42AAL;
			}
			return 0;
		}
		private long getOutput282(int input) {
			switch (input) {
			case 0xF87A: return 0x87ABL;
			}
			return 0;
		}
		private long getOutput283(int input) {
			switch (input) {
			case 0xF87A: return 0x73AAL;
			}
			return 0;
		}
		private long getOutput284(int input) {
			switch (input) {
			case 0x20DD: return 0x8EAAL;
			case 0x20DE: return 0x45AAL;
			}
			return 0;
		}
		private long getOutput285(int input) {
			switch (input) {
			case 0x20DD: return 0x94AAL;
			case 0x20DE: return 0x4BAAL;
			}
			return 0;
		}
		private long getOutput286(int input) {
			switch (input) {
			case 0x20DE: return 0x53AAL;
			}
			return 0;
		}
		private long getOutput287(int input) {
			switch (input) {
			case 0xF87A: return 0x75AAL;
			}
			return 0;
		}
		private long getOutput288(int input) {
			switch (input) {
			case 0x20DD: return 0x81AAL;
			}
			return 0;
		}
		private long getOutput289(int input) {
			switch (input) {
			case 0xF87A: return 0x9EABL;
			}
			return 0;
		}
		private long getOutput290(int input) {
			switch (input) {
			case 0x20DD: return 0x82AAL;
			}
			return 0;
		}
		private long getOutput291(int input) {
			switch (input) {
			case 0xF87A: return 0x79ABL;
			}
			return 0;
		}
		private long getOutput292(int input) {
			switch (input) {
			case 0x20DD: return 0x8DAAL;
			case 0x20DE: return 0x44AAL;
			}
			return 0;
		}
		private long getOutput294(int input) {
			switch (input) {
			case 0xF87A: return 0x72AAL;
			}
			return 0;
		}
		private long getOutput295(int input) {
			switch (input) {
			case 0x20DD: return 0x83AAL;
			}
			return 0;
		}
		private long getOutput296(int input) {
			switch (input) {
			case 0xF87A: return 0x7AABL;
			}
			return 0;
		}
		private long getOutput297(int input) {
			switch (input) {
			case 0x20DD: return 0x97AAL;
			case 0x20DE: return 0x4DAAL;
			}
			return 0;
		}
		private long getOutput298(int input) {
			switch (input) {
			case 0xF87A: return 0x9AABL;
			}
			return 0;
		}
		private long getOutput299(int input) {
			switch (input) {
			case 0x20DD: return 0x49ABL;
			}
			return 0;
		}
		private long getOutput300(int input) {
			switch (input) {
			case 0x20DD: return 0x9AAAL;
			}
			return 0;
		}
		private long getOutput301(int input) {
			switch (input) {
			case 0xF87A: return 0x89ABL;
			}
			return 0;
		}
		private long getOutput302(int input) {
			switch (input) {
			case 0x20DD: return 0x90AAL;
			case 0x20DE: return 0x47AAL;
			}
			return 0;
		}
		private long getOutput303(int input) {
			switch (input) {
			case 0x20DD: return 0x95AAL;
			case 0x20DE: return 0x4CAAL;
			}
			return 0;
		}
		private long getOutput304(int input) {
			switch (input) {
			case 0xF87A: return 0x86ABL;
			}
			return 0;
		}
		private long getOutput305(int input) {
			switch (input) {
			case 0x20DD: return 0x6EABL;
			}
			return 0;
		}
		private long getOutput306(int input) {
			switch (input) {
			case 0xF87A: return 0x88ABL;
			}
			return 0;
		}
		private long getOutput307(int input) {
			switch (input) {
			case 0x20DD: return 0x84AAL;
			}
			return 0;
		}
		private long getOutput308(int input) {
			switch (input) {
			case 0xF87A: return 0x7BABL;
			}
			return 0;
		}
		private long getOutput309(int input) {
			switch (input) {
			case 0x20DD: return 0x4AABL;
			}
			return 0;
		}
		private long getOutput310(int input) {
			switch (input) {
			case 0x20DD: return 0x4BABL;
			}
			return 0;
		}
		private long getOutput311(int input) {
			switch (input) {
			case 0xF87A: return 0x8BABL;
			}
			return 0;
		}
		private long getOutput312(int input) {
			switch (input) {
			case 0x20DD: return 0x93ACL;
			}
			return 0;
		}
		private long getOutput313(int input) {
			switch (input) {
			case 0x20DD: return 0x98AAL;
			}
			return 0;
		}
		private long getOutput314(int input) {
			switch (input) {
			case 0x20DD: return 0x93AAL;
			case 0x20DE: return 0x4AAAL;
			}
			return 0;
		}
		private long getOutput315(int input) {
			switch (input) {
			case 0x20DD: return 0x9CAAL;
			}
			return 0;
		}
		private long getOutput316(int input) {
			switch (input) {
			case 0x20DD: return 0x6FABL;
			}
			return 0;
		}
		private long getOutput317(int input) {
			switch (input) {
			case 0xF87A: return 0x8CABL;
			}
			return 0;
		}
		private long getOutput318(int input) {
			switch (input) {
			case 0x20DD: return 0x4CABL;
			}
			return 0;
		}
		private long getOutput319(int input) {
			switch (input) {
			case 0x20DD: return 0x57ABL;
			}
			return 0;
		}
		private long getOutput320(int input) {
			switch (input) {
			case 0x20DD: return 0x85AAL;
			}
			return 0;
		}
		private long getOutput321(int input) {
			switch (input) {
			case 0xF87A: return 0x7CABL;
			}
			return 0;
		}
		private long getOutput322(int input) {
			switch (input) {
			case 0x20DD: return 0x9BAAL;
			case 0x20DE: return 0x51AAL;
			}
			return 0;
		}
		private long getOutput323(int input) {
			switch (input) {
			case 0x20DD: return 0x4DABL;
			}
			return 0;
		}
		private long getOutput324(int input) {
			switch (input) {
			case 0xF87A: return 0x8DABL;
			}
			return 0;
		}
		private long getOutput326(int input) {
			switch (input) {
			case 0xF87A: return 0x78AAL;
			}
			return 0;
		}
		private long getOutput327(int input) {
			switch (input) {
			case 0x20DD: return 0x4EABL;
			case 0x20DE: return 0x56AAL;
			}
			return 0;
		}
		private long getOutput328(int input) {
			switch (input) {
			case 0xF87A: return 0x8EABL;
			}
			return 0;
		}
		private long getOutput329(int input) {
			switch (input) {
			case 0xF87A: return 0x7CAAL;
			}
			return 0;
		}
		private long getOutput330(int input) {
			switch (input) {
			case 0x20DD: return 0x53ABL;
			}
			return 0;
		}
		private long getOutput331(int input) {
			switch (input) {
			case 0xF87A: return 0x9FABL;
			}
			return 0;
		}
		private long getOutput332(int input) {
			switch (input) {
			case 0x20DE: return 0x41AAL;
			}
			return 0;
		}
		private long getOutput333(int input) {
			switch (input) {
			case 0x20DD: return 0x4FABL;
			}
			return 0;
		}
		private long getOutput334(int input) {
			switch (input) {
			case 0x20DD: return 0x9DAAL;
			}
			return 0;
		}
		private long getOutput335(int input) {
			switch (input) {
			case 0x20DD: return 0x71ABL;
			}
			return 0;
		}
		private long getOutput336(int input) {
			switch (input) {
			case 0xF87A: return 0x8FABL;
			}
			return 0;
		}
		private long getOutput337(int input) {
			switch (input) {
			case 0x20DD: return 0x72ABL;
			}
			return 0;
		}
		private long getOutput338(int input) {
			switch (input) {
			case 0xF87A: return 0x90ABL;
			}
			return 0;
		}
		private long getOutput339(int input) {
			switch (input) {
			case 0xF87A: return 0x79AAL;
			}
			return 0;
		}
		private long getOutput340(int input) {
			switch (input) {
			case 0x20DD: return 0x96ACL;
			}
			return 0;
		}
		private long getOutput341(int input) {
			switch (input) {
			case 0x20DD: return 0x99AAL;
			case 0x20DE: return 0x52AAL;
			}
			return 0;
		}
		private long getOutput342(int input) {
			switch (input) {
			case 0x20DD: return 0x95ACL;
			}
			return 0;
		}
		private long getOutput343(int input) {
			switch (input) {
			case 0x20DD: return 0x70ABL;
			}
			return 0;
		}
		private long getOutput344(int input) {
			switch (input) {
			case 0xF87A: return 0x91ABL;
			}
			return 0;
		}
		private long getOutput345(int input) {
			switch (input) {
			case 0x20DD: return 0x86AAL;
			case 0x20DE: return 0x4EAAL;
			}
			return 0;
		}
		private long getOutput346(int input) {
			switch (input) {
			case 0xF87A: return 0x7DABL;
			}
			return 0;
		}
		private long getOutput347(int input) {
			switch (input) {
			case 0x20DD: return 0x50ABL;
			}
			return 0;
		}
		private long getOutput348(int input) {
			switch (input) {
			case 0x20DD: return 0x91AAL;
			case 0x20DE: return 0x48AAL;
			}
			return 0;
		}
		private long getOutput349(int input) {
			switch (input) {
			case 0x20DD: return 0x92AAL;
			case 0x20DE: return 0x49AAL;
			}
			return 0;
		}
		private long getOutput351(int input) {
			switch (input) {
			case 0xF87A: return 0x7AAAL;
			}
			return 0;
		}
		private long getOutput353(int input) {
			switch (input) {
			case 0xF87A: return 0x92ABL;
			}
			return 0;
		}
		private long getOutput354(int input) {
			switch (input) {
			case 0x20DD: return 0x41ABL;
			case 0x20DE: return 0x71AAL;
			}
			return 0;
		}
		private long getOutput355(int input) {
			switch (input) {
			case 0x20DD: return 0x7DAAL;
			}
			return 0;
		}
		private long getOutput356(int input) {
			switch (input) {
			case 0xF87A: return 0x93ABL;
			}
			return 0;
		}
		private long getOutput357(int input) {
			switch (input) {
			case 0x20DE: return 0x43AAL;
			}
			return 0;
		}
		private long getOutput358(int input) {
			switch (input) {
			case 0xF87A: return 0x74AAL;
			}
			return 0;
		}
		private long getOutput359(int input) {
			switch (input) {
			case 0x20DD: return 0x51ABL;
			}
			return 0;
		}
		private long getOutput360(int input) {
			switch (input) {
			case 0xF87A: return 0x94ABL;
			}
			return 0;
		}
		private long getOutput361(int input) {
			switch (input) {
			case 0x20DD: return 0x94ACL;
			}
			return 0;
		}
		private long getOutput362(int input) {
			switch (input) {
			case 0x20DD: return 0x73ABL;
			}
			return 0;
		}
		private long getOutput363(int input) {
			switch (input) {
			case 0x20DD: return 0x87AAL;
			}
			return 0;
		}
		private long getOutput364(int input) {
			switch (input) {
			case 0xF87A: return 0x81ABL;
			}
			return 0;
		}
		private long getOutput365(int input) {
			switch (input) {
			case 0x20DD: return 0x92ACL;
			}
			return 0;
		}
		private long getOutput366(int input) {
			switch (input) {
			case 0x20DD: return 0x88AAL;
			}
			return 0;
		}
		private long getOutput367(int input) {
			switch (input) {
			case 0xF87A: return 0x82ABL;
			}
			return 0;
		}
		private long getOutput368(int input) {
			switch (input) {
			case 0x20DD: return 0x52ABL;
			}
			return 0;
		}
		private long getOutput369(int input) {
			switch (input) {
			case 0x20DD: return 0x89AAL;
			case 0x20DE: return 0x4FAAL;
			}
			return 0;
		}
		private long getOutput370(int input) {
			switch (input) {
			case 0xF87A: return 0x83ABL;
			}
			return 0;
		}
		private long getOutput371(int input) {
			switch (input) {
			case 0x20DD: return 0x8AAAL;
			}
			return 0;
		}
		private long getOutput372(int input) {
			switch (input) {
			case 0xF87A: return 0x84ABL;
			}
			return 0;
		}
		private long getOutput373(int input) {
			switch (input) {
			case 0x20DD: return 0x74ABL;
			}
			return 0;
		}
		private long getOutput374(int input) {
			switch (input) {
			case 0xF87A: return 0x95ABL;
			}
			return 0;
		}
		private long getOutput375(int input) {
			switch (input) {
			case 0x20DD: return 0x78ABL;
			}
			return 0;
		}
		private long getOutput376(int input) {
			switch (input) {
			case 0xF87A: return 0x85ABL;
			}
			return 0;
		}
		private long getOutput378(int input) {
			switch (input) {
			case 0xF87A: return 0x96ABL;
			}
			return 0;
		}
		private long getOutput379(int input) {
			switch (input) {
			case 0xF87A: return 0x7BAAL;
			}
			return 0;
		}
		private long getOutput380(int input) {
			switch (input) {
			case 0x20DD: return 0x8FAAL;
			case 0x20DE: return 0x46AAL;
			}
			return 0;
		}
		private long getOutput381(int input) {
			switch (input) {
			case 0x20DD: return 0x54ABL;
			}
			return 0;
		}
		private long getOutput382(int input) {
			switch (input) {
			case 0x20DD: return 0x97ACL;
			}
			return 0;
		}
		private long getOutput383(int input) {
			switch (input) {
			case 0x20DE: return 0x66A6L;
			}
			return 0;
		}
		private long getOutput384(int input) {
			switch (input) {
			case 0x20DF: return 0x60A6L;
			}
			return 0;
		}
		private long getOutput385(int input) {
			switch (input) {
			case 0xF87A: return 0x91A6L;
			}
			return 0;
		}
		private long getOutput386(int input) {
			switch (input) {
			case 0xF87F: return 0x86A6L;
			}
			return 0;
		}
		private long getOutput387(int input) {
			switch (input) {
			case 0xF87F: return 0x41A6L;
			}
			return 0;
		}
		private long getOutput389(int input) {
			switch (input) {
			case 0x2A: return 0x4CA6L;
			}
			return 0;
		}
		private long getOutput390(int input) {
			switch (input) {
			case 0x29: return 0x55A5L;
			case 0x2E: return 0x41A9L;
			}
			return 0;
		}
		private long getOutput391(int input) {
			switch (input) {
			case 0x29: return 0x56A5L;
			case 0x2E: return 0x42A9L;
			}
			return 0;
		}
		private long getOutput392(int input) {
			switch (input) {
			case 0x29: return 0x57A5L;
			case 0x2E: return 0x43A9L;
			}
			return 0;
		}
		private long getOutput393(int input) {
			switch (input) {
			case 0x29: return 0x58A5L;
			case 0x2E: return 0x44A9L;
			}
			return 0;
		}
		private long getOutput394(int input) {
			switch (input) {
			case 0x29: return 0x59A5L;
			case 0x2E: return 0x45A9L;
			}
			return 0;
		}
		private long getOutput395(int input) {
			switch (input) {
			case 0x29: return 0x5AA5L;
			case 0x2E: return 0x46A9L;
			}
			return 0;
		}
		private long getOutput396(int input) {
			switch (input) {
			case 0x29: return 0x5BA5L;
			case 0x2E: return 0x47A9L;
			}
			return 0;
		}
		private long getOutput397(int input) {
			switch (input) {
			case 0x29: return 0x5CA5L;
			case 0x2E: return 0x48A9L;
			}
			return 0;
		}
		private long getOutput398(int input) {
			switch (input) {
			case 0x29: return 0x5DA5L;
			case 0x2E: return 0x49A9L;
			}
			return 0;
		}
		private long getOutput399(int input) {
			switch (input) {
			case 0x29: return 0x5EA5L;
			case 0x2E: return 0x4AA9L;
			}
			return 0;
		}
		private long getOutput400(int input) {
			switch (input) {
			case 0x29: return 0x5FA5L;
			case 0x2E: return 0x4BA9L;
			}
			return 0;
		}
		private long getOutput401(int input) {
			switch (input) {
			case 0x29: return 0x60A5L;
			case 0x2E: return 0x4CA9L;
			}
			return 0;
		}
		private long getOutput402(int input) {
			switch (input) {
			case 0x29: return 0x61A5L;
			case 0x2E: return 0x4DA9L;
			}
			return 0;
		}
		private long getOutput403(int input) {
			switch (input) {
			case 0x29: return 0x62A5L;
			case 0x2E: return 0x4EA9L;
			}
			return 0;
		}
		private long getOutput404(int input) {
			switch (input) {
			case 0x29: return 0x63A5L;
			case 0x2E: return 0x4FA9L;
			}
			return 0;
		}
		private long getOutput405(int input) {
			switch (input) {
			case 0x29: return 0x64A5L;
			case 0x2E: return 0x50A9L;
			}
			return 0;
		}
		private long getOutput406(int input) {
			switch (input) {
			case 0x29: return 0x65A5L;
			case 0x2E: return 0x51A9L;
			}
			return 0;
		}
		private long getOutput407(int input) {
			switch (input) {
			case 0x29: return 0x66A5L;
			case 0x2E: return 0x52A9L;
			}
			return 0;
		}
		private long getOutput408(int input) {
			switch (input) {
			case 0x29: return 0x67A5L;
			case 0x2E: return 0x53A9L;
			}
			return 0;
		}
		private long getOutput409(int input) {
			switch (input) {
			case 0x29: return 0x68A5L;
			case 0x2E: return 0x54A9L;
			}
			return 0;
		}
		private long getOutput410(int input) {
			switch (input) {
			case 0x29: return 0x69A5L;
			case 0x2E: return 0x55A9L;
			}
			return 0;
		}
		private long getOutput411(int input) {
			switch (input) {
			case 0x29: return 0x6AA5L;
			case 0x2E: return 0x56A9L;
			}
			return 0;
		}
		private long getOutput412(int input) {
			switch (input) {
			case 0x29: return 0x6BA5L;
			case 0x2E: return 0x57A9L;
			}
			return 0;
		}
		private long getOutput413(int input) {
			switch (input) {
			case 0x29: return 0x6CA5L;
			case 0x2E: return 0x58A9L;
			}
			return 0;
		}
		private long getOutput414(int input) {
			switch (input) {
			case 0x29: return 0x6DA5L;
			case 0x2E: return 0x59A9L;
			}
			return 0;
		}
		private long getOutput415(int input) {
			switch (input) {
			case 0x29: return 0x6EA5L;
			case 0x2E: return 0x5AA9L;
			}
			return 0;
		}
		private long getOutput416(int input) {
			switch (input) {
			case 0x29: return 0x6FA5L;
			case 0x2E: return 0x5BA9L;
			}
			return 0;
		}
		private long getOutput417(int input) {
			switch (input) {
			case 0x29: return 0x70A5L;
			case 0x2E: return 0x5CA9L;
			}
			return 0;
		}
		private long getOutput418(int input) {
			switch (input) {
			case 0x29: return 0x71A5L;
			case 0x2E: return 0x5DA9L;
			}
			return 0;
		}
		private long getOutput419(int input) {
			switch (input) {
			case 0x29: return 0x72A5L;
			case 0x2E: return 0x5EA9L;
			}
			return 0;
		}
		private long getOutput420(int input) {
			switch (input) {
			case 0x29: return 0x73A5L;
			case 0x2E: return 0x5FA9L;
			}
			return 0;
		}
		private long getOutput421(int input) {
			switch (input) {
			case 0x29: return 0x74A5L;
			case 0x2E: return 0x60A9L;
			}
			return 0;
		}
		private long getOutput422(int input) {
			switch (input) {
			case 0x29: return 0x75A5L;
			case 0x2E: return 0x61A9L;
			}
			return 0;
		}
		private long getOutput423(int input) {
			switch (input) {
			case 0x29: return 0x76A5L;
			case 0x2E: return 0x62A9L;
			}
			return 0;
		}
		private long getOutput424(int input) {
			switch (input) {
			case 0x29: return 0x77A5L;
			case 0x2E: return 0x63A9L;
			}
			return 0;
		}
		private long getOutput425(int input) {
			switch (input) {
			case 0x29: return 0x78A5L;
			case 0x2E: return 0x64A9L;
			}
			return 0;
		}
		private long getOutput426(int input) {
			switch (input) {
			case 0x29: return 0x79A5L;
			case 0x2E: return 0x65A9L;
			}
			return 0;
		}
		private long getOutput427(int input) {
			switch (input) {
			case 0x29: return 0x7AA5L;
			case 0x2E: return 0x66A9L;
			}
			return 0;
		}
		private long getOutput428(int input) {
			switch (input) {
			case 0x29: return 0x7BA5L;
			case 0x2E: return 0x67A9L;
			}
			return 0;
		}
		private long getOutput429(int input) {
			switch (input) {
			case 0x29: return 0x7CA5L;
			case 0x2E: return 0x68A9L;
			}
			return 0;
		}
		private long getOutput430(int input) {
			switch (input) {
			case 0x29: return 0x7DA5L;
			case 0x2E: return 0x69A9L;
			}
			return 0;
		}
		private long getOutput431(int input) {
			switch (input) {
			case 0x29: return 0x81A5L;
			case 0x2E: return 0x6AA9L;
			}
			return 0;
		}
		private long getOutput432(int input) {
			switch (input) {
			case 0x29: return 0x82A5L;
			case 0x2E: return 0x6BA9L;
			}
			return 0;
		}
		private long getOutput433(int input) {
			switch (input) {
			case 0x29: return 0x83A5L;
			case 0x2E: return 0x6CA9L;
			}
			return 0;
		}
		private long getOutput434(int input) {
			switch (input) {
			case 0x29: return 0x84A5L;
			case 0x2E: return 0x6DA9L;
			}
			return 0;
		}
		private long getOutput435(int input) {
			switch (input) {
			case 0x29: return 0x85A5L;
			case 0x2E: return 0x6EA9L;
			}
			return 0;
		}
		private long getOutput436(int input) {
			switch (input) {
			case 0x29: return 0x86A5L;
			case 0x2E: return 0x6FA9L;
			}
			return 0;
		}
		private long getOutput437(int input) {
			switch (input) {
			case 0x29: return 0x87A5L;
			case 0x2E: return 0x70A9L;
			}
			return 0;
		}
		private long getOutput438(int input) {
			switch (input) {
			case 0x29: return 0x88A5L;
			case 0x2E: return 0x71A9L;
			}
			return 0;
		}
		private long getOutput439(int input) {
			switch (input) {
			case 0x29: return 0x89A5L;
			case 0x2E: return 0x72A9L;
			}
			return 0;
		}
		private long getOutput440(int input) {
			switch (input) {
			case 0x29: return 0x8AA5L;
			case 0x2E: return 0x73A9L;
			}
			return 0;
		}
		private long getOutput441(int input) {
			switch (input) {
			case 0x29: return 0x8BA5L;
			case 0x2E: return 0x74A9L;
			}
			return 0;
		}
		private long getOutput442(int input) {
			switch (input) {
			case 0x2020: return 0x44A6L;
			}
			return 0;
		}
		private long getOutput443(int input) {
			switch (input) {
			case 0x2021: return 0x45A6L;
			}
			return 0;
		}
		private long getOutput446(int input) {
			switch (input) {
			case 0x29: return 0x69A3L;
			}
			return 0;
		}
		private long getOutput447(int input) {
			switch (input) {
			case 0x29: return 0x6AA3L;
			}
			return 0;
		}
		private long getOutput448(int input) {
			switch (input) {
			case 0x29: return 0x6BA3L;
			}
			return 0;
		}
		private long getOutput449(int input) {
			switch (input) {
			case 0x29: return 0x6CA3L;
			}
			return 0;
		}
		private long getOutput450(int input) {
			switch (input) {
			case 0x29: return 0x6DA3L;
			}
			return 0;
		}
		private long getOutput451(int input) {
			switch (input) {
			case 0x29: return 0x6EA3L;
			}
			return 0;
		}
		private long getOutput452(int input) {
			switch (input) {
			case 0x29: return 0x6FA3L;
			}
			return 0;
		}
		private long getOutput453(int input) {
			switch (input) {
			case 0x29: return 0x70A3L;
			}
			return 0;
		}
		private long getOutput454(int input) {
			switch (input) {
			case 0x29: return 0x71A3L;
			}
			return 0;
		}
		private long getOutput455(int input) {
			switch (input) {
			case 0x29: return 0x72A3L;
			}
			return 0;
		}
		private long getOutput456(int input) {
			switch (input) {
			case 0x29: return 0x73A3L;
			}
			return 0;
		}
		private long getOutput457(int input) {
			switch (input) {
			case 0x29: return 0x74A3L;
			}
			return 0;
		}
		private long getOutput458(int input) {
			switch (input) {
			case 0x29: return 0x75A3L;
			}
			return 0;
		}
		private long getOutput459(int input) {
			switch (input) {
			case 0x29: return 0x76A3L;
			}
			return 0;
		}
		private long getOutput460(int input) {
			switch (input) {
			case 0x29: return 0x77A3L;
			}
			return 0;
		}
		private long getOutput461(int input) {
			switch (input) {
			case 0x29: return 0x78A3L;
			}
			return 0;
		}
		private long getOutput462(int input) {
			switch (input) {
			case 0x29: return 0x79A3L;
			}
			return 0;
		}
		private long getOutput463(int input) {
			switch (input) {
			case 0x29: return 0x7AA3L;
			}
			return 0;
		}
		private long getOutput464(int input) {
			switch (input) {
			case 0x29: return 0x7BA3L;
			}
			return 0;
		}
		private long getOutput465(int input) {
			switch (input) {
			case 0x29: return 0x7CA3L;
			}
			return 0;
		}
		private long getOutput466(int input) {
			switch (input) {
			case 0x29: return 0x7DA3L;
			}
			return 0;
		}
		private long getOutput467(int input) {
			switch (input) {
			case 0x29: return 0x81A3L;
			}
			return 0;
		}
		private long getOutput468(int input) {
			switch (input) {
			case 0x29: return 0x82A3L;
			}
			return 0;
		}
		private long getOutput469(int input) {
			switch (input) {
			case 0x29: return 0x83A3L;
			}
			return 0;
		}
		private long getOutput470(int input) {
			switch (input) {
			case 0x29: return 0x84A3L;
			}
			return 0;
		}
		private long getOutput471(int input) {
			switch (input) {
			case 0x29: return 0x85A3L;
			}
			return 0;
		}
		private long getOutput473(int input) {
			switch (input) {
			case 0x2020: return 0x46A6L;
			}
			return 0;
		}
		private long getOutput477(int input) {
			switch (input) {
			case 0x29: return 0xF9AAL;
			}
			return 0;
		}
		private long getOutput478(int input) {
			switch (input) {
			case 0x29: return 0xFAAAL;
			}
			return 0;
		}
		private long getOutput479(int input) {
			switch (input) {
			case 0x29: return 0xFBAAL;
			}
			return 0;
		}
		private long getOutput480(int input) {
			switch (input) {
			case 0x29: return 0xFCAAL;
			}
			return 0;
		}
		private long getOutput481(int input) {
			switch (input) {
			case 0x29: return 0xFDAAL;
			}
			return 0;
		}
		private long getOutput482(int input) {
			switch (input) {
			case 0x29: return 0xFEAAL;
			}
			return 0;
		}
		private long getOutput483(int input) {
			switch (input) {
			case 0x29: return 0xF7ABL;
			}
			return 0;
		}
		private long getOutput484(int input) {
			switch (input) {
			case 0x29: return 0xF8ABL;
			}
			return 0;
		}
		private long getOutput485(int input) {
			switch (input) {
			case 0x29: return 0xF9ABL;
			}
			return 0;
		}
		private long getOutput487(int input) {
			switch (input) {
			case 0x29: return 0xFAABL;
			}
			return 0;
		}
		private long getOutput490(int input) {
			switch (input) {
			case 0x5D: return 0x4AA4L;
			}
			return 0;
		}
		private long getOutput491(int input) {
			switch (input) {
			case 0x5D: return 0x4BA4L;
			}
			return 0;
		}
		private long getOutput492(int input) {
			switch (input) {
			case 0x5D: return 0x4CA4L;
			}
			return 0;
		}
		private long getOutput493(int input) {
			switch (input) {
			case 0x5D: return 0x4DA4L;
			}
			return 0;
		}
		private long getOutput494(int input) {
			switch (input) {
			case 0x5D: return 0x4EA4L;
			}
			return 0;
		}
		private long getOutput495(int input) {
			switch (input) {
			case 0x5D: return 0x4FA4L;
			}
			return 0;
		}
		private long getOutput496(int input) {
			switch (input) {
			case 0x5D: return 0x50A4L;
			}
			return 0;
		}
		private long getOutput497(int input) {
			switch (input) {
			case 0x5D: return 0x51A4L;
			}
			return 0;
		}
		private long getOutput498(int input) {
			switch (input) {
			case 0x5D: return 0x52A4L;
			}
			return 0;
		}
		private long getOutput499(int input) {
			switch (input) {
			case 0x5D: return 0x53A4L;
			}
			return 0;
		}
		private long getOutput501(int input) {
			switch (input) {
			case 0x5D: return 0x54A4L;
			}
			return 0;
		}
		private long getOutput503(int input) {
			switch (input) {
			case 0x5D: return 0x68ADL;
			}
			return 0;
		}
		private long getOutput505(int input) {
			switch (input) {
			case 0x5D: return 0x5FADL;
			}
			return 0;
		}
		private long getOutput506(int input) {
			switch (input) {
			case 0x5D: return 0x65ADL;
			}
			return 0;
		}
		private long getOutput507(int input) {
			switch (input) {
			case 0x5D: return 0x61ADL;
			}
			return 0;
		}
		private long getOutput508(int input) {
			switch (input) {
			case 0x5D: return 0x67ADL;
			}
			return 0;
		}
		private long getOutput509(int input) {
			switch (input) {
			case 0x5D: return 0x60ADL;
			}
			return 0;
		}
		private long getOutput510(int input) {
			switch (input) {
			case 0x5D: return 0x63ADL;
			}
			return 0;
		}
		private long getOutput511(int input) {
			switch (input) {
			case 0x5D: return 0x66ADL;
			}
			return 0;
		}
		private long getOutput512(int input) {
			switch (input) {
			case 0x5D: return 0x64ADL;
			}
			return 0;
		}
		private long getOutput513(int input) {
			switch (input) {
			case 0x5D: return 0x62ADL;
			}
			return 0;
		}
		private long getOutput516(int input) {
			switch (input) {
			case 0xC0AC: return 0x7DA7L;
			}
			return 0;
		}
		private long getOutput520(int input) {
			switch (input) {
			case 0x5D: return 0xEFA2L;
			}
			return 0;
		}
		private long getOutput521(int input) {
			switch (input) {
			case 0x5D: return 0xF0A2L;
			}
			return 0;
		}
		private long getOutput522(int input) {
			switch (input) {
			case 0x5D: return 0xF1A2L;
			}
			return 0;
		}
		private long getOutput523(int input) {
			switch (input) {
			case 0x5D: return 0xF2A2L;
			}
			return 0;
		}
		private long getOutput524(int input) {
			switch (input) {
			case 0x5D: return 0xF3A2L;
			}
			return 0;
		}
		private long getOutput525(int input) {
			switch (input) {
			case 0x5D: return 0xF4A2L;
			}
			return 0;
		}
		private long getOutput526(int input) {
			switch (input) {
			case 0x5D: return 0xF5A2L;
			}
			return 0;
		}
		private long getOutput527(int input) {
			switch (input) {
			case 0x5D: return 0xF6A2L;
			}
			return 0;
		}
		private long getOutput528(int input) {
			switch (input) {
			case 0x5D: return 0xF7A2L;
			}
			return 0;
		}
		private long getOutput529(int input) {
			switch (input) {
			case 0x5D: return 0xF8A2L;
			}
			return 0;
		}
		private long getOutput531(int input) {
			switch (input) {
			case 0x5D: return 0xF9A2L;
			}
			return 0;
		}
		private long getOutput533(int input) {
			switch (input) {
			case 0x5D: return 0x54ADL;
			}
			return 0;
		}
		private long getOutput535(int input) {
			switch (input) {
			case 0x5D: return 0x4BADL;
			}
			return 0;
		}
		private long getOutput536(int input) {
			switch (input) {
			case 0x5D: return 0x51ADL;
			}
			return 0;
		}
		private long getOutput537(int input) {
			switch (input) {
			case 0x5D: return 0x4DADL;
			}
			return 0;
		}
		private long getOutput538(int input) {
			switch (input) {
			case 0x5D: return 0x53ADL;
			}
			return 0;
		}
		private long getOutput539(int input) {
			switch (input) {
			case 0x5D: return 0x4CADL;
			}
			return 0;
		}
		private long getOutput540(int input) {
			switch (input) {
			case 0x5D: return 0x4FADL;
			}
			return 0;
		}
		private long getOutput541(int input) {
			switch (input) {
			case 0x5D: return 0x52ADL;
			}
			return 0;
		}
		private long getOutput542(int input) {
			switch (input) {
			case 0x5D: return 0x50ADL;
			}
			return 0;
		}
		private long getOutput543(int input) {
			switch (input) {
			case 0x5D: return 0x4EADL;
			}
			return 0;
		}
		private long getOutput546(int input) {
			switch (input) {
			case 0xC0AC: return 0x81A7L;
			}
			return 0;
		}
		private long getOutput550(int input) {
			switch (input) {
			case 0x5D: return 0x4AA3L;
			}
			return 0;
		}
		private long getOutput551(int input) {
			switch (input) {
			case 0x5D: return 0x4BA3L;
			}
			return 0;
		}
		private long getOutput552(int input) {
			switch (input) {
			case 0x5D: return 0x4CA3L;
			}
			return 0;
		}
		private long getOutput553(int input) {
			switch (input) {
			case 0x5D: return 0x4DA3L;
			}
			return 0;
		}
		private long getOutput554(int input) {
			switch (input) {
			case 0x5D: return 0x4EA3L;
			}
			return 0;
		}
		private long getOutput555(int input) {
			switch (input) {
			case 0x5D: return 0x4FA3L;
			}
			return 0;
		}
		private long getOutput556(int input) {
			switch (input) {
			case 0x5D: return 0x50A3L;
			}
			return 0;
		}
		private long getOutput557(int input) {
			switch (input) {
			case 0x5D: return 0x51A3L;
			}
			return 0;
		}
		private long getOutput558(int input) {
			switch (input) {
			case 0x5D: return 0x52A3L;
			}
			return 0;
		}
		private long getOutput559(int input) {
			switch (input) {
			case 0x5D: return 0x53A3L;
			}
			return 0;
		}
		private long getOutput561(int input) {
			switch (input) {
			case 0x5D: return 0x54A3L;
			}
			return 0;
		}
		private long getOutput565(int input) {
			switch (input) {
			case 0x5D: return 0x5EA4L;
			}
			return 0;
		}
		private long getOutput566(int input) {
			switch (input) {
			case 0x5D: return 0x5FA4L;
			}
			return 0;
		}
		private long getOutput567(int input) {
			switch (input) {
			case 0x5D: return 0x60A4L;
			}
			return 0;
		}
		private long getOutput568(int input) {
			switch (input) {
			case 0x5D: return 0x61A4L;
			}
			return 0;
		}
		private long getOutput569(int input) {
			switch (input) {
			case 0x5D: return 0x62A4L;
			}
			return 0;
		}
		private long getOutput570(int input) {
			switch (input) {
			case 0x5D: return 0x63A4L;
			}
			return 0;
		}
		private long getOutput571(int input) {
			switch (input) {
			case 0x5D: return 0x64A4L;
			}
			return 0;
		}
		private long getOutput572(int input) {
			switch (input) {
			case 0x5D: return 0x65A4L;
			}
			return 0;
		}
		private long getOutput573(int input) {
			switch (input) {
			case 0x5D: return 0x66A4L;
			}
			return 0;
		}
		private long getOutput574(int input) {
			switch (input) {
			case 0x5D: return 0x67A4L;
			}
			return 0;
		}
		private long getOutput576(int input) {
			switch (input) {
			case 0x5D: return 0x68A4L;
			}
			return 0;
		}
		private long getOutput580(int input) {
			switch (input) {
			case 0x5D: return 0xCBACL;
			}
			return 0;
		}
		private long getOutput581(int input) {
			switch (input) {
			case 0x5D: return 0xCCACL;
			}
			return 0;
		}
		private long getOutput582(int input) {
			switch (input) {
			case 0x5D: return 0xCDACL;
			}
			return 0;
		}
		private long getOutput583(int input) {
			switch (input) {
			case 0x5D: return 0xCEACL;
			}
			return 0;
		}
		private long getOutput584(int input) {
			switch (input) {
			case 0x5D: return 0xCFACL;
			}
			return 0;
		}
		private long getOutput585(int input) {
			switch (input) {
			case 0x5D: return 0xD0ACL;
			}
			return 0;
		}
		private long getOutput586(int input) {
			switch (input) {
			case 0x5D: return 0xF2ACL;
			}
			return 0;
		}
		private long getOutput587(int input) {
			switch (input) {
			case 0x5D: return 0xF3ACL;
			}
			return 0;
		}
		private long getOutput588(int input) {
			switch (input) {
			case 0x5D: return 0xF4ACL;
			}
			return 0;
		}
		private long getOutput589(int input) {
			switch (input) {
			case 0x5D: return 0xF5ACL;
			}
			return 0;
		}
		private long getOutput591(int input) {
			switch (input) {
			case 0x5D: return 0xF6ACL;
			}
			return 0;
		}
		private long getOutput593(int input) {
			switch (input) {
			case 0x2A: return 0x50A6L;
			}
			return 0;
		}
		private long getOutput594(int input) {
			switch (input) {
			case 0xF87C: return 0x45A2L;
			case 0xF87F: return 0x4FA1L;
			}
			return 0;
		}
		private long getOutput595(int input) {
			switch (input) {
			case 0xF87C: return 0x46A2L;
			case 0xF87F: return 0x50A1L;
			}
			return 0;
		}
		private long getOutput596(int input) {
			switch (input) {
			case 0xF874: return 0xDAA5L;
			}
			return 0;
		}
		private long getOutput597(int input) {
			switch (input) {
			case 0xF871: return 0x9FA1L;
			case 0xF873: return 0x4AA6L;
			case 0xF874: return 0x9CA1L;
			case 0xF875: return 0x9EA1L;
			case 0xF87F: return 0x49A6L;
			}
			return 0;
		}
		private long getOutput598(int input) {
			switch (input) {
			case 0xF87F: return 0x84L;
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
			case 46: return getOutput46(input);
			case 47: return getOutput47(input);
			case 48: return getOutput48(input);
			case 49: return getOutput49(input);
			case 50: return getOutput50(input);
			case 51: return getOutput51(input);
			case 52: return getOutput52(input);
			case 53: return getOutput53(input);
			case 54: return getOutput54(input);
			case 55: return getOutput55(input);
			case 56: return getOutput56(input);
			case 57: return getOutput57(input);
			case 58: return getOutput58(input);
			case 59: return getOutput59(input);
			case 60: return getOutput60(input);
			case 61: return getOutput61(input);
			case 62: return getOutput62(input);
			case 63: return getOutput63(input);
			case 64: return getOutput64(input);
			case 65: return getOutput65(input);
			case 66: return getOutput66(input);
			case 67: return getOutput67(input);
			case 68: return getOutput68(input);
			case 69: return getOutput69(input);
			case 70: return getOutput70(input);
			case 71: return getOutput71(input);
			case 72: return getOutput72(input);
			case 73: return getOutput73(input);
			case 74: return getOutput74(input);
			case 75: return getOutput75(input);
			case 76: return getOutput76(input);
			case 77: return getOutput77(input);
			case 78: return getOutput78(input);
			case 79: return getOutput79(input);
			case 80: return getOutput80(input);
			case 81: return getOutput81(input);
			case 82: return getOutput82(input);
			case 83: return getOutput83(input);
			case 84: return getOutput84(input);
			case 85: return getOutput85(input);
			case 86: return getOutput86(input);
			case 87: return getOutput87(input);
			case 88: return getOutput88(input);
			case 89: return getOutput89(input);
			case 90: return getOutput90(input);
			case 91: return getOutput91(input);
			case 92: return getOutput92(input);
			case 93: return getOutput93(input);
			case 94: return getOutput94(input);
			case 95: return getOutput95(input);
			case 96: return getOutput96(input);
			case 97: return getOutput97(input);
			case 98: return getOutput98(input);
			case 99: return getOutput99(input);
			case 100: return getOutput100(input);
			case 101: return getOutput101(input);
			case 102: return getOutput102(input);
			case 103: return getOutput103(input);
			case 104: return getOutput104(input);
			case 105: return getOutput105(input);
			case 106: return getOutput106(input);
			case 107: return getOutput107(input);
			case 108: return getOutput108(input);
			case 109: return getOutput109(input);
			case 110: return getOutput110(input);
			case 111: return getOutput111(input);
			case 112: return getOutput112(input);
			case 113: return getOutput113(input);
			case 114: return getOutput114(input);
			case 115: return getOutput115(input);
			case 116: return getOutput116(input);
			case 117: return getOutput117(input);
			case 118: return getOutput118(input);
			case 119: return getOutput119(input);
			case 120: return getOutput120(input);
			case 121: return getOutput121(input);
			case 122: return getOutput122(input);
			case 123: return getOutput123(input);
			case 124: return getOutput124(input);
			case 125: return getOutput125(input);
			case 126: return getOutput126(input);
			case 127: return getOutput127(input);
			case 128: return getOutput128(input);
			case 129: return getOutput129(input);
			case 130: return getOutput130(input);
			case 131: return getOutput131(input);
			case 132: return getOutput132(input);
			case 133: return getOutput133(input);
			case 134: return getOutput134(input);
			case 135: return getOutput135(input);
			case 136: return getOutput136(input);
			case 137: return getOutput137(input);
			case 138: return getOutput138(input);
			case 139: return getOutput139(input);
			case 140: return getOutput140(input);
			case 141: return getOutput141(input);
			case 142: return getOutput142(input);
			case 143: return getOutput143(input);
			case 144: return getOutput144(input);
			case 145: return getOutput145(input);
			case 146: return getOutput146(input);
			case 147: return getOutput147(input);
			case 148: return getOutput148(input);
			case 149: return getOutput149(input);
			case 150: return getOutput150(input);
			case 151: return getOutput151(input);
			case 152: return getOutput152(input);
			case 153: return getOutput153(input);
			case 154: return getOutput154(input);
			case 155: return getOutput155(input);
			case 156: return getOutput156(input);
			case 157: return getOutput157(input);
			case 158: return getOutput158(input);
			case 159: return getOutput159(input);
			case 160: return getOutput160(input);
			case 161: return getOutput161(input);
			case 162: return getOutput162(input);
			case 163: return getOutput163(input);
			case 164: return getOutput164(input);
			case 165: return getOutput165(input);
			case 166: return getOutput166(input);
			case 167: return getOutput167(input);
			case 168: return getOutput168(input);
			case 169: return getOutput169(input);
			case 170: return getOutput170(input);
			case 171: return getOutput171(input);
			case 172: return getOutput172(input);
			case 173: return getOutput173(input);
			case 174: return getOutput174(input);
			case 175: return getOutput175(input);
			case 176: return getOutput176(input);
			case 177: return getOutput177(input);
			case 178: return getOutput178(input);
			case 179: return getOutput179(input);
			case 180: return getOutput180(input);
			case 181: return getOutput181(input);
			case 182: return getOutput182(input);
			case 183: return getOutput183(input);
			case 184: return getOutput184(input);
			case 185: return getOutput185(input);
			case 186: return getOutput186(input);
			case 187: return getOutput187(input);
			case 188: return getOutput188(input);
			case 189: return getOutput189(input);
			case 190: return getOutput190(input);
			case 191: return getOutput191(input);
			case 192: return getOutput192(input);
			case 193: return getOutput193(input);
			case 194: return getOutput194(input);
			case 195: return getOutput195(input);
			case 196: return getOutput196(input);
			case 197: return getOutput197(input);
			case 198: return getOutput198(input);
			case 199: return getOutput199(input);
			case 200: return getOutput200(input);
			case 201: return getOutput201(input);
			case 202: return getOutput202(input);
			case 203: return getOutput203(input);
			case 204: return getOutput204(input);
			case 205: return getOutput205(input);
			case 206: return getOutput206(input);
			case 207: return getOutput207(input);
			case 208: return getOutput208(input);
			case 209: return getOutput209(input);
			case 210: return getOutput210(input);
			case 211: return getOutput211(input);
			case 212: return getOutput212(input);
			case 213: return getOutput213(input);
			case 214: return getOutput214(input);
			case 215: return getOutput215(input);
			case 216: return getOutput216(input);
			case 217: return getOutput217(input);
			case 218: return getOutput218(input);
			case 219: return getOutput219(input);
			case 220: return getOutput220(input);
			case 221: return getOutput221(input);
			case 222: return getOutput222(input);
			case 223: return getOutput223(input);
			case 224: return getOutput224(input);
			case 225: return getOutput225(input);
			case 226: return getOutput226(input);
			case 227: return getOutput227(input);
			case 228: return getOutput228(input);
			case 229: return getOutput229(input);
			case 230: return getOutput230(input);
			case 231: return getOutput231(input);
			case 232: return getOutput232(input);
			case 233: return getOutput233(input);
			case 234: return getOutput234(input);
			case 235: return getOutput235(input);
			case 236: return getOutput236(input);
			case 237: return getOutput237(input);
			case 238: return getOutput238(input);
			case 239: return getOutput239(input);
			case 240: return getOutput240(input);
			case 241: return getOutput241(input);
			case 242: return getOutput242(input);
			case 243: return getOutput243(input);
			case 244: return getOutput244(input);
			case 245: return getOutput245(input);
			case 246: return getOutput246(input);
			case 247: return getOutput247(input);
			case 248: return getOutput248(input);
			case 249: return getOutput249(input);
			case 250: return getOutput250(input);
			case 251: return getOutput251(input);
			case 252: return getOutput252(input);
			case 253: return getOutput253(input);
			case 254: return getOutput254(input);
			case 255: return getOutput255(input);
			case 256: return getOutput256(input);
			case 257: return getOutput257(input);
			case 258: return getOutput258(input);
			case 259: return getOutput259(input);
			case 260: return getOutput260(input);
			case 261: return getOutput261(input);
			case 262: return getOutput262(input);
			case 263: return getOutput263(input);
			case 264: return getOutput264(input);
			case 265: return getOutput265(input);
			case 267: return getOutput267(input);
			case 268: return getOutput268(input);
			case 269: return getOutput269(input);
			case 270: return getOutput270(input);
			case 271: return getOutput271(input);
			case 272: return getOutput272(input);
			case 273: return getOutput273(input);
			case 274: return getOutput274(input);
			case 276: return getOutput276(input);
			case 277: return getOutput277(input);
			case 278: return getOutput278(input);
			case 279: return getOutput279(input);
			case 280: return getOutput280(input);
			case 281: return getOutput281(input);
			case 282: return getOutput282(input);
			case 283: return getOutput283(input);
			case 284: return getOutput284(input);
			case 285: return getOutput285(input);
			case 286: return getOutput286(input);
			case 287: return getOutput287(input);
			case 288: return getOutput288(input);
			case 289: return getOutput289(input);
			case 290: return getOutput290(input);
			case 291: return getOutput291(input);
			case 292: return getOutput292(input);
			case 294: return getOutput294(input);
			case 295: return getOutput295(input);
			case 296: return getOutput296(input);
			case 297: return getOutput297(input);
			case 298: return getOutput298(input);
			case 299: return getOutput299(input);
			case 300: return getOutput300(input);
			case 301: return getOutput301(input);
			case 302: return getOutput302(input);
			case 303: return getOutput303(input);
			case 304: return getOutput304(input);
			case 305: return getOutput305(input);
			case 306: return getOutput306(input);
			case 307: return getOutput307(input);
			case 308: return getOutput308(input);
			case 309: return getOutput309(input);
			case 310: return getOutput310(input);
			case 311: return getOutput311(input);
			case 312: return getOutput312(input);
			case 313: return getOutput313(input);
			case 314: return getOutput314(input);
			case 315: return getOutput315(input);
			case 316: return getOutput316(input);
			case 317: return getOutput317(input);
			case 318: return getOutput318(input);
			case 319: return getOutput319(input);
			case 320: return getOutput320(input);
			case 321: return getOutput321(input);
			case 322: return getOutput322(input);
			case 323: return getOutput323(input);
			case 324: return getOutput324(input);
			case 326: return getOutput326(input);
			case 327: return getOutput327(input);
			case 328: return getOutput328(input);
			case 329: return getOutput329(input);
			case 330: return getOutput330(input);
			case 331: return getOutput331(input);
			case 332: return getOutput332(input);
			case 333: return getOutput333(input);
			case 334: return getOutput334(input);
			case 335: return getOutput335(input);
			case 336: return getOutput336(input);
			case 337: return getOutput337(input);
			case 338: return getOutput338(input);
			case 339: return getOutput339(input);
			case 340: return getOutput340(input);
			case 341: return getOutput341(input);
			case 342: return getOutput342(input);
			case 343: return getOutput343(input);
			case 344: return getOutput344(input);
			case 345: return getOutput345(input);
			case 346: return getOutput346(input);
			case 347: return getOutput347(input);
			case 348: return getOutput348(input);
			case 349: return getOutput349(input);
			case 351: return getOutput351(input);
			case 353: return getOutput353(input);
			case 354: return getOutput354(input);
			case 355: return getOutput355(input);
			case 356: return getOutput356(input);
			case 357: return getOutput357(input);
			case 358: return getOutput358(input);
			case 359: return getOutput359(input);
			case 360: return getOutput360(input);
			case 361: return getOutput361(input);
			case 362: return getOutput362(input);
			case 363: return getOutput363(input);
			case 364: return getOutput364(input);
			case 365: return getOutput365(input);
			case 366: return getOutput366(input);
			case 367: return getOutput367(input);
			case 368: return getOutput368(input);
			case 369: return getOutput369(input);
			case 370: return getOutput370(input);
			case 371: return getOutput371(input);
			case 372: return getOutput372(input);
			case 373: return getOutput373(input);
			case 374: return getOutput374(input);
			case 375: return getOutput375(input);
			case 376: return getOutput376(input);
			case 378: return getOutput378(input);
			case 379: return getOutput379(input);
			case 380: return getOutput380(input);
			case 381: return getOutput381(input);
			case 382: return getOutput382(input);
			case 383: return getOutput383(input);
			case 384: return getOutput384(input);
			case 385: return getOutput385(input);
			case 386: return getOutput386(input);
			case 387: return getOutput387(input);
			case 389: return getOutput389(input);
			case 390: return getOutput390(input);
			case 391: return getOutput391(input);
			case 392: return getOutput392(input);
			case 393: return getOutput393(input);
			case 394: return getOutput394(input);
			case 395: return getOutput395(input);
			case 396: return getOutput396(input);
			case 397: return getOutput397(input);
			case 398: return getOutput398(input);
			case 399: return getOutput399(input);
			case 400: return getOutput400(input);
			case 401: return getOutput401(input);
			case 402: return getOutput402(input);
			case 403: return getOutput403(input);
			case 404: return getOutput404(input);
			case 405: return getOutput405(input);
			case 406: return getOutput406(input);
			case 407: return getOutput407(input);
			case 408: return getOutput408(input);
			case 409: return getOutput409(input);
			case 410: return getOutput410(input);
			case 411: return getOutput411(input);
			case 412: return getOutput412(input);
			case 413: return getOutput413(input);
			case 414: return getOutput414(input);
			case 415: return getOutput415(input);
			case 416: return getOutput416(input);
			case 417: return getOutput417(input);
			case 418: return getOutput418(input);
			case 419: return getOutput419(input);
			case 420: return getOutput420(input);
			case 421: return getOutput421(input);
			case 422: return getOutput422(input);
			case 423: return getOutput423(input);
			case 424: return getOutput424(input);
			case 425: return getOutput425(input);
			case 426: return getOutput426(input);
			case 427: return getOutput427(input);
			case 428: return getOutput428(input);
			case 429: return getOutput429(input);
			case 430: return getOutput430(input);
			case 431: return getOutput431(input);
			case 432: return getOutput432(input);
			case 433: return getOutput433(input);
			case 434: return getOutput434(input);
			case 435: return getOutput435(input);
			case 436: return getOutput436(input);
			case 437: return getOutput437(input);
			case 438: return getOutput438(input);
			case 439: return getOutput439(input);
			case 440: return getOutput440(input);
			case 441: return getOutput441(input);
			case 442: return getOutput442(input);
			case 443: return getOutput443(input);
			case 446: return getOutput446(input);
			case 447: return getOutput447(input);
			case 448: return getOutput448(input);
			case 449: return getOutput449(input);
			case 450: return getOutput450(input);
			case 451: return getOutput451(input);
			case 452: return getOutput452(input);
			case 453: return getOutput453(input);
			case 454: return getOutput454(input);
			case 455: return getOutput455(input);
			case 456: return getOutput456(input);
			case 457: return getOutput457(input);
			case 458: return getOutput458(input);
			case 459: return getOutput459(input);
			case 460: return getOutput460(input);
			case 461: return getOutput461(input);
			case 462: return getOutput462(input);
			case 463: return getOutput463(input);
			case 464: return getOutput464(input);
			case 465: return getOutput465(input);
			case 466: return getOutput466(input);
			case 467: return getOutput467(input);
			case 468: return getOutput468(input);
			case 469: return getOutput469(input);
			case 470: return getOutput470(input);
			case 471: return getOutput471(input);
			case 473: return getOutput473(input);
			case 477: return getOutput477(input);
			case 478: return getOutput478(input);
			case 479: return getOutput479(input);
			case 480: return getOutput480(input);
			case 481: return getOutput481(input);
			case 482: return getOutput482(input);
			case 483: return getOutput483(input);
			case 484: return getOutput484(input);
			case 485: return getOutput485(input);
			case 487: return getOutput487(input);
			case 490: return getOutput490(input);
			case 491: return getOutput491(input);
			case 492: return getOutput492(input);
			case 493: return getOutput493(input);
			case 494: return getOutput494(input);
			case 495: return getOutput495(input);
			case 496: return getOutput496(input);
			case 497: return getOutput497(input);
			case 498: return getOutput498(input);
			case 499: return getOutput499(input);
			case 501: return getOutput501(input);
			case 503: return getOutput503(input);
			case 505: return getOutput505(input);
			case 506: return getOutput506(input);
			case 507: return getOutput507(input);
			case 508: return getOutput508(input);
			case 509: return getOutput509(input);
			case 510: return getOutput510(input);
			case 511: return getOutput511(input);
			case 512: return getOutput512(input);
			case 513: return getOutput513(input);
			case 516: return getOutput516(input);
			case 520: return getOutput520(input);
			case 521: return getOutput521(input);
			case 522: return getOutput522(input);
			case 523: return getOutput523(input);
			case 524: return getOutput524(input);
			case 525: return getOutput525(input);
			case 526: return getOutput526(input);
			case 527: return getOutput527(input);
			case 528: return getOutput528(input);
			case 529: return getOutput529(input);
			case 531: return getOutput531(input);
			case 533: return getOutput533(input);
			case 535: return getOutput535(input);
			case 536: return getOutput536(input);
			case 537: return getOutput537(input);
			case 538: return getOutput538(input);
			case 539: return getOutput539(input);
			case 540: return getOutput540(input);
			case 541: return getOutput541(input);
			case 542: return getOutput542(input);
			case 543: return getOutput543(input);
			case 546: return getOutput546(input);
			case 550: return getOutput550(input);
			case 551: return getOutput551(input);
			case 552: return getOutput552(input);
			case 553: return getOutput553(input);
			case 554: return getOutput554(input);
			case 555: return getOutput555(input);
			case 556: return getOutput556(input);
			case 557: return getOutput557(input);
			case 558: return getOutput558(input);
			case 559: return getOutput559(input);
			case 561: return getOutput561(input);
			case 565: return getOutput565(input);
			case 566: return getOutput566(input);
			case 567: return getOutput567(input);
			case 568: return getOutput568(input);
			case 569: return getOutput569(input);
			case 570: return getOutput570(input);
			case 571: return getOutput571(input);
			case 572: return getOutput572(input);
			case 573: return getOutput573(input);
			case 574: return getOutput574(input);
			case 576: return getOutput576(input);
			case 580: return getOutput580(input);
			case 581: return getOutput581(input);
			case 582: return getOutput582(input);
			case 583: return getOutput583(input);
			case 584: return getOutput584(input);
			case 585: return getOutput585(input);
			case 586: return getOutput586(input);
			case 587: return getOutput587(input);
			case 588: return getOutput588(input);
			case 589: return getOutput589(input);
			case 591: return getOutput591(input);
			case 593: return getOutput593(input);
			case 594: return getOutput594(input);
			case 595: return getOutput595(input);
			case 596: return getOutput596(input);
			case 597: return getOutput597(input);
			case 598: return getOutput598(input);
			default: return 0;
			}
		}
	}
}
