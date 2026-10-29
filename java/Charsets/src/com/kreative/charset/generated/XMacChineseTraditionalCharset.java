package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacChineseTraditionalCharset extends Charset {
	public XMacChineseTraditionalCharset() {
		super("x-MacChineseTraditional", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacChineseTraditionalCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacChineseTraditionalCharsetEncoder(this);
	}

	private static final class XMacChineseTraditionalCharsetDecoder extends TableCharsetDecoder {
		private XMacChineseTraditionalCharsetDecoder(Charset cs) {
			super(cs, 1f, 2f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0xA1 && input <= 0xC6) return input - 0xA1 + 0x1;
			if (input >= 0xC9 && input <= 0xF9) return input - 0xC9 + 0x27;
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
			if (input >= 0x83 && input <= 0xA0) return input - 0x83 + 0x83;
			switch (input) {
			case 0x80: return 0xF87F005CL;
			case 0x81: return 0xF880L;
			case 0x82: return 0xF881L;
			case 0xFD: return 0xA9L;
			case 0xFE: return 0x2122L;
			case 0xFF: return 0x2026L;
			}
			return 0;
		}
		private static final int[] GETOUTPUT1_40 = getOutput1_40();
		private static final int[] getOutput1_40() {
			return new int[] {
				0x3000, 0xFF0C, 0x3001, 0x3002, 0xFF0E, 0xB7, 0xFF1B, 0xFF1A, 0xFF1F, 0xFF01, 0xFE30, 0x22EF, 0x2025, 0xF87DFF0C, 0xF87D3001, 0xF87DFF0E,
				0xF87EFF0E, 0xF87DFF1B, 0xF87DFF1A, 0xF87DFF1F, 0xF87DFF01, 0xFF5C, 0x2013, 0xFE31, 0x2014, 0xFE33, 0xF87FFF3F, 0xFE34, 0xFE4F, 0xFF08, 0xFF09, 0xFE35,
				0xFE36, 0xFF5B, 0xFF5D, 0xFE37, 0xFE38, 0x3014, 0x3015, 0xFE39, 0xFE3A, 0x3010, 0x3011, 0xFE3B, 0xFE3C, 0x300A, 0x300B, 0xFE3D,
				0xFE3E, 0x3008, 0x3009, 0xFE3F, 0xFE40, 0x300C, 0x300D, 0xFE41, 0xFE42, 0x300E, 0x300F, 0xFE43, 0xFE44, 0xF87FFF08, 0xF87FFF09,
			};
		}
		private static final int[] GETOUTPUT1_A1 = getOutput1_A1();
		private static final int[] getOutput1_A1() {
			return new int[] {
				0xF87FFF5B, 0xF87FFF5D, 0xF87F3014, 0xF87F3015, 0x2018, 0x2019, 0x201C, 0x201D, 0x301D, 0x301E, 0x2035, 0x2032, 0xFF03, 0xFF06, 0xFF0A, 0x203B,
				0xA7, 0x3003, 0x25CB, 0x25CF, 0x25B3, 0x25B2, 0x25CE, 0x2606, 0x2605, 0x25C7, 0x25C6, 0x25A1, 0x25A0, 0x25BD, 0x25BC, 0x32A3,
				0x2105, 0x203E, 0xF87C203E, 0xFF3F, 0xF87CFF3F, 0xFE49, 0xFE4A, 0xFE4D, 0xFE4E, 0xFE4B, 0xF87CFE4B, 0xFE5F, 0xFE60, 0xFE61, 0xFF0B, 0xFF0D,
				0xD7, 0xF7, 0xB1, 0x221A, 0xFF1C, 0xFF1E, 0xFF1D, 0x2266, 0x2267, 0x2260, 0x221E, 0x2252, 0x2261, 0xFE62, 0xFE63, 0xFE64,
				0xFE65, 0xFE66, 0x223C, 0x2229, 0x222A, 0x22A5, 0x2220, 0x221F, 0x22BF, 0x33D2, 0x33D1, 0x222B, 0x222E, 0x2235, 0x2234, 0x2640,
				0x2642, 0x2295, 0x2609, 0x2191, 0x2193, 0x2190, 0x2192, 0x2196, 0x2197, 0x2199, 0x2198, 0x2225, 0x2223, 0xF87FFF0F,
			};
		}
		private long getOutput1(int input) {
			if (input >= 0x40 && input <= 0x7E) return GETOUTPUT1_40[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return GETOUTPUT1_A1[input - 0xA1];
			return 0;
		}
		private static final int[] GETOUTPUT2_40 = getOutput2_40();
		private static final int[] getOutput2_40() {
			return new int[] {
				0xF87FFF3C, 0xFF0F, 0xFF3C, 0xFF04, 0xA5, 0x3012, 0xA2, 0xA3, 0xFF05, 0xFF20, 0x2103, 0x2109, 0xFE69, 0xFE6A, 0xFE6B, 0x33D5,
				0x339C, 0x339D, 0x339E, 0x33CE, 0x33A1, 0x338E, 0x338F, 0x33C4, 0xB0, 0x5159, 0x515B, 0x515E, 0x515D, 0x5161, 0x5163, 0x55E7,
				0x74E9, 0x7CCE, 0x2581, 0x2582, 0x2583, 0x2584, 0x2585, 0x2586, 0x2587, 0x2588, 0x258F, 0x258E, 0x258D, 0x258C, 0x258B, 0x258A,
				0x2589, 0x253C, 0x2534, 0x252C, 0x2524, 0x251C, 0x2594, 0x2500, 0x2502, 0xF87F2502, 0x250C, 0x2510, 0x2514, 0x2518, 0x256D,
			};
		}
		private static final int[] GETOUTPUT2_A1 = getOutput2_A1();
		private static final int[] getOutput2_A1() {
			return new int[] {
				0x256E, 0x2570, 0x256F, 0x2550, 0x255E, 0x256A, 0x2561, 0x25E2, 0x25E3, 0x25E5, 0x25E4, 0x2571, 0x2572, 0x2573, 0xFF10, 0xFF11,
				0xFF12, 0xFF13, 0xFF14, 0xFF15, 0xFF16, 0xFF17, 0xFF18, 0xFF19, 0x2160, 0x2161, 0x2162, 0x2163, 0x2164, 0x2165, 0x2166, 0x2167,
				0x2168, 0x2169, 0x3021, 0x3022, 0x3023, 0x3024, 0x3025, 0x3026, 0x3027, 0x3028, 0x3029, 0xF87F5341, 0x5344, 0xF87F5345,
			};
		}
		private long getOutput2(int input) {
			if (input >= 0x40 && input <= 0x7E) return GETOUTPUT2_40[input - 0x40];
			if (input >= 0xCF && input <= 0xE8) return input - 0xCF + 0xFF21;
			if (input >= 0xA1 && input <= 0xCE) return GETOUTPUT2_A1[input - 0xA1];
			if (input >= 0xE9 && input <= 0xFE) return input - 0xE9 + 0xFF41;
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0x44 && input <= 0x54) return input - 0x44 + 0x391;
			if (input >= 0x5C && input <= 0x6C) return input - 0x5C + 0x3B1;
			if (input >= 0x6D && input <= 0x7E) return CommonSubtables.COMMON680[input - 0x6D];
			if (input >= 0xA1 && input <= 0xBA) return input - 0xA1 + 0x3110;
			switch (input) {
			case 0x40: return 0xFF57L;
			case 0x41: return 0xFF58L;
			case 0x42: return 0xFF59L;
			case 0x43: return 0xFF5AL;
			case 0x55: return 0x3A3L;
			case 0x56: return 0x3A4L;
			case 0x57: return 0x3A5L;
			case 0x58: return 0x3A6L;
			case 0x59: return 0x3A7L;
			case 0x5A: return 0x3A8L;
			case 0x5B: return 0x3A9L;
			case 0xBB: return 0x2D9L;
			case 0xBC: return 0x2C9L;
			case 0xBD: return 0x2CAL;
			case 0xBE: return 0x2C7L;
			case 0xBF: return 0x2CBL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON681[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON682[input - 0xA1];
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON683[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON684[input - 0xA1];
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON685[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON686[input - 0xA1];
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON687[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON688[input - 0xA1];
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON689[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON690[input - 0xA1];
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON691[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON692[input - 0xA1];
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON693[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON694[input - 0xA1];
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON695[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON696[input - 0xA1];
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON697[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON698[input - 0xA1];
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON699[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON700[input - 0xA1];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON701[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON702[input - 0xA1];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON703[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON704[input - 0xA1];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON705[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON706[input - 0xA1];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON707[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON708[input - 0xA1];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON709[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON710[input - 0xA1];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON711[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON712[input - 0xA1];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON713[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON714[input - 0xA1];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON715[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON716[input - 0xA1];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON717[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON718[input - 0xA1];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON719[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON720[input - 0xA1];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON721[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON722[input - 0xA1];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON723[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON724[input - 0xA1];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON725[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON726[input - 0xA1];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON727[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON728[input - 0xA1];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON729[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON730[input - 0xA1];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON731[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON732[input - 0xA1];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON733[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON734[input - 0xA1];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON735[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON736[input - 0xA1];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON737[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON738[input - 0xA1];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON739[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON740[input - 0xA1];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1103[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON741[input - 0xA1];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON742[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON743[input - 0xA1];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON744[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON745[input - 0xA1];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON746[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON747[input - 0xA1];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON748[input - 0x40];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON749[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON750[input - 0xA1];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON751[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON752[input - 0xA1];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON753[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON754[input - 0xA1];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON755[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON756[input - 0xA1];
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON757[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON758[input - 0xA1];
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON759[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON760[input - 0xA1];
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON761[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON762[input - 0xA1];
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON763[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON764[input - 0xA1];
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON765[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON766[input - 0xA1];
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON767[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON768[input - 0xA1];
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON769[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON770[input - 0xA1];
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON771[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON772[input - 0xA1];
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON773[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON774[input - 0xA1];
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON775[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON776[input - 0xA1];
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON777[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON778[input - 0xA1];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON779[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON780[input - 0xA1];
			return 0;
		}
		private long getOutput55(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON781[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON782[input - 0xA1];
			return 0;
		}
		private long getOutput56(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON783[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON784[input - 0xA1];
			return 0;
		}
		private long getOutput57(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON785[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON786[input - 0xA1];
			return 0;
		}
		private long getOutput58(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON787[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON788[input - 0xA1];
			return 0;
		}
		private long getOutput59(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON789[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON790[input - 0xA1];
			return 0;
		}
		private long getOutput60(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON791[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON792[input - 0xA1];
			return 0;
		}
		private long getOutput61(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON793[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON794[input - 0xA1];
			return 0;
		}
		private long getOutput62(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON795[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON796[input - 0xA1];
			return 0;
		}
		private long getOutput63(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON797[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON798[input - 0xA1];
			return 0;
		}
		private long getOutput64(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON799[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON800[input - 0xA1];
			return 0;
		}
		private long getOutput65(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON801[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON802[input - 0xA1];
			return 0;
		}
		private long getOutput66(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON803[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON804[input - 0xA1];
			return 0;
		}
		private long getOutput67(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON805[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON806[input - 0xA1];
			return 0;
		}
		private long getOutput68(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON807[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON808[input - 0xA1];
			return 0;
		}
		private long getOutput69(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON809[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON810[input - 0xA1];
			return 0;
		}
		private long getOutput70(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON811[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON812[input - 0xA1];
			return 0;
		}
		private long getOutput71(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON813[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON814[input - 0xA1];
			return 0;
		}
		private long getOutput72(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON815[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON816[input - 0xA1];
			return 0;
		}
		private long getOutput73(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON817[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON818[input - 0xA1];
			return 0;
		}
		private long getOutput74(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON819[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON820[input - 0xA1];
			return 0;
		}
		private long getOutput75(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON821[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON822[input - 0xA1];
			return 0;
		}
		private long getOutput76(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON823[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON824[input - 0xA1];
			return 0;
		}
		private long getOutput77(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON825[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON826[input - 0xA1];
			return 0;
		}
		private long getOutput78(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON827[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON828[input - 0xA1];
			return 0;
		}
		private long getOutput79(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON829[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON830[input - 0xA1];
			return 0;
		}
		private long getOutput80(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1104[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1105[input - 0xA1];
			return 0;
		}
		private long getOutput81(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1106[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1107[input - 0xA1];
			return 0;
		}
		private long getOutput82(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1108[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1109[input - 0xA1];
			return 0;
		}
		private long getOutput83(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1110[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1111[input - 0xA1];
			return 0;
		}
		private long getOutput84(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1112[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1113[input - 0xA1];
			return 0;
		}
		private long getOutput85(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1114[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1115[input - 0xA1];
			return 0;
		}
		private long getOutput86(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1116[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1117[input - 0xA1];
			return 0;
		}
		private long getOutput87(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1118[input - 0x40];
			if (input >= 0xA1 && input <= 0xD5) return CommonSubtables.COMMON1119[input - 0xA1];
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
			default: return 0;
			}
		}
	}

	private static final class XMacChineseTraditionalCharsetEncoder extends TableCharsetEncoder {
		private XMacChineseTraditionalCharsetEncoder(Charset cs) {
			super(cs, 1.98624f, 2f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x5C: return 0x1;
			case 0x203E: return 0x2;
			case 0x2502: return 0x3;
			case 0x3001: return 0x4;
			case 0x3014: return 0x5;
			case 0x3015: return 0x6;
			case 0x5341: return 0x7;
			case 0x5345: return 0x8;
			case 0xFE4B: return 0x9;
			case 0xFF01: return 0xA;
			case 0xFF08: return 0xB;
			case 0xFF09: return 0xC;
			case 0xFF0C: return 0xD;
			case 0xFF0E: return 0xE;
			case 0xFF0F: return 0xF;
			case 0xFF1A: return 0x10;
			case 0xFF1B: return 0x11;
			case 0xFF1F: return 0x12;
			case 0xFF3C: return 0x13;
			case 0xFF3F: return 0x14;
			case 0xFF5B: return 0x15;
			case 0xFF5D: return 0x16;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_2550 = getOutput0_2550();
		private static final char[] getOutput0_2550() {
			return "\uA4A2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA5A2\u0000\u0000\uA7A2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA6A2\u0000\u0000\u7EA2\uA1A2\uA3A2\uA2A2\uACA2\uADA2\uAEA2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u62A2\u63A2\u64A2\u65A2\u66A2\u67A2\u68A2\u69A2\u70A2\u6FA2\u6EA2\u6DA2\u6CA2\u6BA2\u6AA2\u0000\u0000\u0000\u0000\u76A2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uBDA1\uBCA1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uB6A1\uB5A1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uBFA1\uBEA1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uBBA1\uBAA1\u0000\u0000\u0000\uB3A1\u0000\u0000\uB7A1\uB4A1".toCharArray();
		}
		private static final char[] GETOUTPUT0_FE30 = getOutput0_FE30();
		private static final char[] getOutput0_FE30() {
			return "\u4AA1\u57A1\u0000\u59A1\u5BA1\u5FA1\u60A1\u63A1\u64A1\u67A1\u68A1\u6BA1\u6CA1\u6FA1\u70A1\u73A1\u74A1\u77A1\u78A1\u7BA1\u7CA1\u0000\u0000\u0000\u0000\uC6A1\uC7A1\uCAA1\u0000\uC8A1\uC9A1\u5CA1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uCCA1\uCDA1\uCEA1\uDEA1\uDFA1\uE0A1\uE1A1\uE2A1\u0000\u0000\u4CA2\u4DA2\u4EA2".toCharArray();
		}
		private static final char[] GETOUTPUT0_FF01 = getOutput0_FF01();
		private static final char[] getOutput0_FF01() {
			return "\u49A1\u0000\uADA1\u43A2\u48A2\uAEA1\u0000\u5DA1\u5EA1\uAFA1\uCFA1\u41A1\uD0A1\u44A1\u41A2\uAFA2\uB0A2\uB1A2\uB2A2\uB3A2\uB4A2\uB5A2\uB6A2\uB7A2\uB8A2\u47A1\u46A1\uD5A1\uD7A1\uD6A1\u48A1\u49A2\uCFA2\uD0A2\uD1A2\uD2A2\uD3A2\uD4A2\uD5A2\uD6A2\uD7A2\uD8A2\uD9A2\uDAA2\uDBA2\uDCA2\uDDA2\uDEA2\uDFA2\uE0A2\uE1A2\uE2A2\uE3A2\uE4A2\uE5A2\uE6A2\uE7A2\uE8A2\u0000\u42A2\u0000\u0000\uC4A1\u0000\uE9A2\uEAA2\uEBA2\uECA2\uEDA2\uEEA2\uEFA2\uF0A2\uF1A2\uF2A2\uF3A2\uF4A2\uF5A2\uF6A2\uF7A2\uF8A2\uF9A2\uFAA2\uFBA2\uFCA2\uFDA2\uFEA2\u40A3\u41A3\u42A3\u43A3\u61A1\u55A1\u62A1".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x83 && input <= 0xA0) return input - 0x83 + 0x83;
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON831[input - 0x391];
			if (input >= 0x2550 && input <= 0x25CF) return GETOUTPUT0_2550[input - 0x2550];
			if (input >= 0x3000 && input <= 0x3029) return CommonSubtables.COMMON1120[input - 0x3000];
			if (input >= 0x3105 && input <= 0x3129) return CommonSubtables.COMMON1121[input - 0x3105];
			if (input >= 0x4E00 && input <= 0x6316) return CommonSubtables.COMMON1122[input - 0x4E00];
			if (input >= 0x6328 && input <= 0x67FF) return CommonSubtables.COMMON1123[input - 0x6328];
			if (input >= 0x6812 && input <= 0x6854) return CommonSubtables.COMMON832[input - 0x6812];
			if (input >= 0x686B && input <= 0x6D42) return CommonSubtables.COMMON1124[input - 0x686B];
			if (input >= 0x6D58 && input <= 0x6D98) return CommonSubtables.COMMON833[input - 0x6D58];
			if (input >= 0x6DAA && input <= 0x6E05) return CommonSubtables.COMMON834[input - 0x6DAA];
			if (input >= 0x6E19 && input <= 0x7E9C) return CommonSubtables.COMMON1125[input - 0x6E19];
			if (input >= 0x7F36 && input <= 0x8356) return CommonSubtables.COMMON835[input - 0x7F36];
			if (input >= 0x8373 && input <= 0x89C0) return CommonSubtables.COMMON836[input - 0x8373];
			if (input >= 0x89D2 && input <= 0x8B9F) return CommonSubtables.COMMON837[input - 0x89D2];
			if (input >= 0x8C37 && input <= 0x8D1B) return CommonSubtables.COMMON838[input - 0x8C37];
			if (input >= 0x8D64 && input <= 0x8F64) return CommonSubtables.COMMON839[input - 0x8D64];
			if (input >= 0x8F9B && input <= 0x9483) return CommonSubtables.COMMON1126[input - 0x8F9B];
			if (input >= 0x9577 && input <= 0x95E5) return CommonSubtables.COMMON840[input - 0x9577];
			if (input >= 0x961C && input <= 0x9874) return CommonSubtables.COMMON1127[input - 0x961C];
			if (input >= 0x98A8 && input <= 0x9961) return CommonSubtables.COMMON841[input - 0x98A8];
			if (input >= 0x9996 && input <= 0x9A6B) return CommonSubtables.COMMON842[input - 0x9996];
			if (input >= 0x9AA8 && input <= 0x9C7A) return CommonSubtables.COMMON843[input - 0x9AA8];
			if (input >= 0x9CE5 && input <= 0x9E1E) return CommonSubtables.COMMON844[input - 0x9CE5];
			if (input >= 0x9E75 && input <= 0x9FA4) return CommonSubtables.COMMON845[input - 0x9E75];
			if (input >= 0xFE30 && input <= 0xFE6B) return GETOUTPUT0_FE30[input - 0xFE30];
			if (input >= 0xFF01 && input <= 0xFF5D) return GETOUTPUT0_FF01[input - 0xFF01];
			switch (input) {
			case 0xA2: return 0x46A2L;
			case 0xA3: return 0x47A2L;
			case 0xA5: return 0x44A2L;
			case 0xA7: return 0xB1A1L;
			case 0xA9: return 0xFDL;
			case 0xB0: return 0x58A2L;
			case 0xB1: return 0xD3A1L;
			case 0xB7: return 0x45A1L;
			case 0xD7: return 0xD1A1L;
			case 0xF7: return 0xD2A1L;
			case 0x2C7: return 0xBEA3L;
			case 0x2C9: return 0xBCA3L;
			case 0x2CA: return 0xBDA3L;
			case 0x2CB: return 0xBFA3L;
			case 0x2D9: return 0xBBA3L;
			case 0x2013: return 0x56A1L;
			case 0x2014: return 0x58A1L;
			case 0x2018: return 0xA5A1L;
			case 0x2019: return 0xA6A1L;
			case 0x201C: return 0xA7A1L;
			case 0x201D: return 0xA8A1L;
			case 0x2025: return 0x4CA1L;
			case 0x2026: return 0xFF01L;
			case 0x2032: return 0xACA1L;
			case 0x2035: return 0xABA1L;
			case 0x203B: return 0xB0A1L;
			case 0x203E: return 0xC2A1L;
			case 0x2103: return 0x4AA2L;
			case 0x2105: return 0xC1A1L;
			case 0x2109: return 0x4BA2L;
			case 0x2122: return 0xFEL;
			case 0x2160: return 0xB9A2L;
			case 0x2161: return 0xBAA2L;
			case 0x2162: return 0xBBA2L;
			case 0x2163: return 0xBCA2L;
			case 0x2164: return 0xBDA2L;
			case 0x2165: return 0xBEA2L;
			case 0x2166: return 0xBFA2L;
			case 0x2167: return 0xC0A2L;
			case 0x2168: return 0xC1A2L;
			case 0x2169: return 0xC2A2L;
			case 0x2190: return 0xF6A1L;
			case 0x2191: return 0xF4A1L;
			case 0x2192: return 0xF7A1L;
			case 0x2193: return 0xF5A1L;
			case 0x2196: return 0xF8A1L;
			case 0x2197: return 0xF9A1L;
			case 0x2198: return 0xFBA1L;
			case 0x2199: return 0xFAA1L;
			case 0x221A: return 0xD4A1L;
			case 0x221E: return 0xDBA1L;
			case 0x221F: return 0xE8A1L;
			case 0x2220: return 0xE7A1L;
			case 0x2223: return 0xFDA1L;
			case 0x2225: return 0xFCA1L;
			case 0x2229: return 0xE4A1L;
			case 0x222A: return 0xE5A1L;
			case 0x222B: return 0xECA1L;
			case 0x222E: return 0xEDA1L;
			case 0x2234: return 0xEFA1L;
			case 0x2235: return 0xEEA1L;
			case 0x223C: return 0xE3A1L;
			case 0x2252: return 0xDCA1L;
			case 0x2260: return 0xDAA1L;
			case 0x2261: return 0xDDA1L;
			case 0x2266: return 0xD8A1L;
			case 0x2267: return 0xD9A1L;
			case 0x2295: return 0xF2A1L;
			case 0x22A5: return 0xE6A1L;
			case 0x22BF: return 0xE9A1L;
			case 0x22EF: return 0x4BA1L;
			case 0x2500: return 0x77A2L;
			case 0x2502: return 0x78A2L;
			case 0x250C: return 0x7AA2L;
			case 0x2510: return 0x7BA2L;
			case 0x2514: return 0x7CA2L;
			case 0x2518: return 0x7DA2L;
			case 0x251C: return 0x75A2L;
			case 0x2524: return 0x74A2L;
			case 0x252C: return 0x73A2L;
			case 0x2534: return 0x72A2L;
			case 0x253C: return 0x71A2L;
			case 0x25E2: return 0xA8A2L;
			case 0x25E3: return 0xA9A2L;
			case 0x25E4: return 0xABA2L;
			case 0x25E5: return 0xAAA2L;
			case 0x2605: return 0xB9A1L;
			case 0x2606: return 0xB8A1L;
			case 0x2609: return 0xF3A1L;
			case 0x2640: return 0xF0A1L;
			case 0x2642: return 0xF1A1L;
			case 0x32A3: return 0xC0A1L;
			case 0x338E: return 0x55A2L;
			case 0x338F: return 0x56A2L;
			case 0x339C: return 0x50A2L;
			case 0x339D: return 0x51A2L;
			case 0x339E: return 0x52A2L;
			case 0x33A1: return 0x54A2L;
			case 0x33C4: return 0x57A2L;
			case 0x33CE: return 0x53A2L;
			case 0x33D1: return 0xEBA1L;
			case 0x33D2: return 0xEAA1L;
			case 0x33D5: return 0x4FA2L;
			case 0xF880: return 0x81L;
			case 0xF881: return 0x82L;
			case 0xFA0C: return 0x4AC9L;
			case 0xFA0D: return 0xFCDDL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xF87F: return 0x80L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xF87C: return 0xC3A1L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xF87F: return 0x79A2L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xF87D: return 0x4EA1L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xF87F: return 0xA3A1L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0xF87F: return 0xA4A1L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0xF87F: return 0xCCA2L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0xF87F: return 0xCEA2L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0xF87C: return 0xCBA1L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0xF87D: return 0x54A1L;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0xF87F: return 0x7DA1L;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0xF87F: return 0x7EA1L;
			}
			return 0;
		}
		private long getOutput13(int input) {
			switch (input) {
			case 0xF87D: return 0x4DA1L;
			}
			return 0;
		}
		private long getOutput14(int input) {
			switch (input) {
			case 0xF87D: return 0x4FA1L;
			case 0xF87E: return 0x50A1L;
			}
			return 0;
		}
		private long getOutput15(int input) {
			switch (input) {
			case 0xF87F: return 0xFEA1L;
			}
			return 0;
		}
		private long getOutput16(int input) {
			switch (input) {
			case 0xF87D: return 0x52A1L;
			}
			return 0;
		}
		private long getOutput17(int input) {
			switch (input) {
			case 0xF87D: return 0x51A1L;
			}
			return 0;
		}
		private long getOutput18(int input) {
			switch (input) {
			case 0xF87D: return 0x53A1L;
			}
			return 0;
		}
		private long getOutput19(int input) {
			switch (input) {
			case 0xF87F: return 0x40A2L;
			}
			return 0;
		}
		private long getOutput20(int input) {
			switch (input) {
			case 0xF87C: return 0xC5A1L;
			case 0xF87F: return 0x5AA1L;
			}
			return 0;
		}
		private long getOutput21(int input) {
			switch (input) {
			case 0xF87F: return 0xA1A1L;
			}
			return 0;
		}
		private long getOutput22(int input) {
			switch (input) {
			case 0xF87F: return 0xA2A1L;
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
			default: return 0;
			}
		}
	}
}
