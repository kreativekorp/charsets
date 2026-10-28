package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XBig5Charset extends Charset {
	public XBig5Charset() {
		super("x-big5", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XBig5CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XBig5CharsetEncoder(this);
	}

	private static final class XBig5CharsetDecoder extends TableCharsetDecoder {
		private XBig5CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0xA1 && input <= 0xC7) return input - 0xA1 + 0x1;
			if (input >= 0xC9 && input <= 0xF9) return input - 0xC9 + 0x28;
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
			return 0;
		}
		private static final char[] GETOUTPUT1_40 = getOutput1_40();
		private static final char[] getOutput1_40() {
			return "\u3000\uFF0C\u3001\u3002\uFF0E\u2022\uFF1B\uFF1A\uFF1F\uFF01\uFE30\u2026\u2025\uFE50\uFF64\uFE52\u00B7\uFE54\uFE55\uFE56\uFE57\uFF5C\u2013\uFE31\u2014\uFE33\uFF3F\uFE34\uFE4F\uFF08\uFF09\uFE35\uFE36\uFF5B\uFF5D\uFE37\uFE38\u3014\u3015\uFE39\uFE3A\u3010\u3011\uFE3B\uFE3C\u300A\u300B\uFE3D\uFE3E\u3008\u3009\uFE3F\uFE40\u300C\u300D\uFE41\uFE42\u300E\u300F\uFE43\uFE44\uFE59\uFE5A".toCharArray();
		}
		private static final char[] GETOUTPUT1_A1 = getOutput1_A1();
		private static final char[] getOutput1_A1() {
			return "\uFE5B\uFE5C\uFE5D\uFE5E\u2018\u2019\u201C\u201D\u301D\u301E\u2035\u2032\uFF03\uFF06\uFF0A\u203B\u00A7\u3003\u25CB\u25CF\u25B3\u25B2\u25CE\u2606\u2605\u25C7\u25C6\u25A1\u25A0\u25BD\u25BC\u32A3\u2105\u203E\u0000\uFF3F\u0000\uFE49\uFE4A\uFE4D\uFE4E\uFE4B\uFE4C\uFE5F\uFE60\uFE61\uFF0B\uFF0D\u00D7\u00F7\u00B1\u221A\uFF1C\uFF1E\uFF1D\u2266\u2267\u2260\u221E\u2252\u2261\uFE62\uFE63\uFE64\uFE65\uFE66\u223C\u2229\u222A\u22A5\u2220\u221F\u22BF\u33D2\u33D1\u222B\u222E\u2235\u2234\u2640\u2642\u2641\u2609\u2191\u2193\u2190\u2192\u2196\u2197\u2199\u2198\u2225\u2223\u2571".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0x40 && input <= 0x7E) return GETOUTPUT1_40[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return GETOUTPUT1_A1[input - 0xA1];
			return 0;
		}
		private static final char[] GETOUTPUT2_40 = getOutput2_40();
		private static final char[] getOutput2_40() {
			return "\u2572\uFF0F\uFF3C\uFF04\u00A5\u3012\u00A2\u00A3\uFF05\uFF20\u2103\u2109\uFE69\uFE6A\uFE6B\u33D5\u339C\u339D\u339E\u33CE\u33A1\u338E\u338F\u33C4\u00B0\u5159\u515B\u515E\u515D\u5161\u5163\u55E7\u74E9\u7CCE\u2581\u2582\u2583\u2584\u2585\u2586\u2587\u2588\u258F\u258E\u258D\u258C\u258B\u258A\u2589\u253C\u2534\u252C\u2524\u251C\u2594\u2500\u2502\u2595\u250C\u2510\u2514\u2518\u256D".toCharArray();
		}
		private long getOutput2(int input) {
			if (input >= 0x40 && input <= 0x7E) return GETOUTPUT2_40[input - 0x40];
			if (input >= 0xCF && input <= 0xE8) return input - 0xCF + 0xFF21;
			if (input >= 0xA1 && input <= 0xCE) return CommonSubtables.COMMON673[input - 0xA1];
			if (input >= 0xE9 && input <= 0xFE) return input - 0xE9 + 0xFF41;
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0x44 && input <= 0x54) return input - 0x44 + 0x391;
			if (input >= 0x5C && input <= 0x6C) return input - 0x5C + 0x3B1;
			if (input >= 0x6D && input <= 0x7E) return CommonSubtables.COMMON674[input - 0x6D];
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
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON675[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON676[input - 0xA1];
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON677[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON678[input - 0xA1];
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON679[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON680[input - 0xA1];
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON681[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON682[input - 0xA1];
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON683[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON684[input - 0xA1];
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON685[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON686[input - 0xA1];
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON687[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON688[input - 0xA1];
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON689[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON690[input - 0xA1];
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON691[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON692[input - 0xA1];
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON693[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON694[input - 0xA1];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON695[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON696[input - 0xA1];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON697[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON698[input - 0xA1];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON699[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON700[input - 0xA1];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON701[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON702[input - 0xA1];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON703[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON704[input - 0xA1];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON705[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON706[input - 0xA1];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON707[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON708[input - 0xA1];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON709[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON710[input - 0xA1];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON711[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON712[input - 0xA1];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON713[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON714[input - 0xA1];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON715[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON716[input - 0xA1];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON717[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON718[input - 0xA1];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON719[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON720[input - 0xA1];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON721[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON722[input - 0xA1];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON723[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON724[input - 0xA1];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON725[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON726[input - 0xA1];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON727[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON728[input - 0xA1];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON729[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON730[input - 0xA1];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON731[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON732[input - 0xA1];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON733[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON734[input - 0xA1];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1097[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON735[input - 0xA1];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON736[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON737[input - 0xA1];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON738[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON739[input - 0xA1];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON740[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON741[input - 0xA1];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON742[input - 0x40];
			if (input >= 0xA5 && input <= 0xF7) return input - 0xA5 + 0x3041;
			switch (input) {
			case 0xA1: return 0x30FEL;
			case 0xA2: return 0x309DL;
			case 0xA3: return 0x309EL;
			case 0xA4: return 0x3005L;
			case 0xF8: return 0x30A1L;
			case 0xF9: return 0x30A2L;
			case 0xFA: return 0x30A3L;
			case 0xFB: return 0x30A4L;
			case 0xFC: return 0x30A5L;
			case 0xFD: return 0x30A6L;
			case 0xFE: return 0x30A7L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT39_E9 = getOutput39_E9();
		private static final char[] getOutput39_E9() {
			return "\u2460\u2461\u2462\u2463\u2464\u2465\u2466\u2467\u2468\u2469\u2474\u2475\u2476\u2477\u2478\u2479\u247A\u247B\u247C\u247D".toCharArray();
		}
		private long getOutput39(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0x30A8;
			if (input >= 0xA1 && input <= 0xB0) return input - 0xA1 + 0x30E7;
			if (input >= 0xBB && input <= 0xCD) return input - 0xBB + 0x423;
			if (input >= 0xCF && input <= 0xE8) return input - 0xCF + 0x436;
			if (input >= 0xE9 && input <= 0xFC) return GETOUTPUT39_E9[input - 0xE9];
			switch (input) {
			case 0xB1: return 0x414L;
			case 0xB2: return 0x415L;
			case 0xB3: return 0x401L;
			case 0xB4: return 0x416L;
			case 0xB5: return 0x417L;
			case 0xB6: return 0x418L;
			case 0xB7: return 0x419L;
			case 0xB8: return 0x41AL;
			case 0xB9: return 0x41BL;
			case 0xBA: return 0x41CL;
			case 0xCE: return 0x451L;
			}
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON743[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON744[input - 0xA1];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON745[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON746[input - 0xA1];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON747[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON748[input - 0xA1];
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON749[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON750[input - 0xA1];
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON751[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON752[input - 0xA1];
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON753[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON754[input - 0xA1];
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON755[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON756[input - 0xA1];
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON757[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON758[input - 0xA1];
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON759[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON760[input - 0xA1];
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON761[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON762[input - 0xA1];
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON763[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON764[input - 0xA1];
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON765[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON766[input - 0xA1];
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON767[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON768[input - 0xA1];
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON769[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON770[input - 0xA1];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON771[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON772[input - 0xA1];
			return 0;
		}
		private long getOutput55(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON773[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON774[input - 0xA1];
			return 0;
		}
		private long getOutput56(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON775[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON776[input - 0xA1];
			return 0;
		}
		private long getOutput57(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON777[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON778[input - 0xA1];
			return 0;
		}
		private long getOutput58(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON779[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON780[input - 0xA1];
			return 0;
		}
		private long getOutput59(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON781[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON782[input - 0xA1];
			return 0;
		}
		private long getOutput60(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON783[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON784[input - 0xA1];
			return 0;
		}
		private long getOutput61(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON785[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON786[input - 0xA1];
			return 0;
		}
		private long getOutput62(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON787[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON788[input - 0xA1];
			return 0;
		}
		private long getOutput63(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON789[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON790[input - 0xA1];
			return 0;
		}
		private long getOutput64(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON791[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON792[input - 0xA1];
			return 0;
		}
		private long getOutput65(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON793[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON794[input - 0xA1];
			return 0;
		}
		private long getOutput66(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON795[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON796[input - 0xA1];
			return 0;
		}
		private long getOutput67(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON797[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON798[input - 0xA1];
			return 0;
		}
		private long getOutput68(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON799[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON800[input - 0xA1];
			return 0;
		}
		private long getOutput69(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON801[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON802[input - 0xA1];
			return 0;
		}
		private long getOutput70(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON803[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON804[input - 0xA1];
			return 0;
		}
		private long getOutput71(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON805[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON806[input - 0xA1];
			return 0;
		}
		private long getOutput72(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON807[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON808[input - 0xA1];
			return 0;
		}
		private long getOutput73(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON809[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON810[input - 0xA1];
			return 0;
		}
		private long getOutput74(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON811[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON812[input - 0xA1];
			return 0;
		}
		private long getOutput75(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON813[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON814[input - 0xA1];
			return 0;
		}
		private long getOutput76(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON815[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON816[input - 0xA1];
			return 0;
		}
		private long getOutput77(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON817[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON818[input - 0xA1];
			return 0;
		}
		private long getOutput78(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON819[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON820[input - 0xA1];
			return 0;
		}
		private long getOutput79(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON821[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON822[input - 0xA1];
			return 0;
		}
		private long getOutput80(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON823[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON824[input - 0xA1];
			return 0;
		}
		private long getOutput81(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1098[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1099[input - 0xA1];
			return 0;
		}
		private long getOutput82(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1100[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1101[input - 0xA1];
			return 0;
		}
		private long getOutput83(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1102[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1103[input - 0xA1];
			return 0;
		}
		private long getOutput84(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1104[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1105[input - 0xA1];
			return 0;
		}
		private long getOutput85(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1106[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1107[input - 0xA1];
			return 0;
		}
		private long getOutput86(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1108[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1109[input - 0xA1];
			return 0;
		}
		private long getOutput87(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1110[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON1111[input - 0xA1];
			return 0;
		}
		private long getOutput88(int input) {
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1112[input - 0x40];
			if (input >= 0xA1 && input <= 0xD5) return CommonSubtables.COMMON1113[input - 0xA1];
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
			default: return 0;
			}
		}
	}

	private static final class XBig5CharsetEncoder extends TableCharsetEncoder {
		private XBig5CharsetEncoder(Charset cs) {
			super(cs, 1.99075f, 2f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_414 = getOutput0_414();
		private static final char[] getOutput0_414() {
			return "\uB1C7\uB2C7\uB4C7\uB5C7\uB6C7\uB7C7\uB8C7\uB9C7\uBAC7\u0000\u0000\u0000\u0000\u0000\u0000\uBBC7\uBCC7\uBDC7\uBEC7\uBFC7\uC0C7\uC1C7\uC2C7\uC3C7\uC4C7\uC5C7\uC6C7\uC7C7\uC8C7\uC9C7\uCAC7\uCBC7\uCCC7\uCDC7\uCFC7\uD0C7\uD1C7\uD2C7\uD3C7\uD4C7\uD5C7\uD6C7\uD7C7\uD8C7\uD9C7\uDAC7\uDBC7\uDCC7\uDDC7\uDEC7\uDFC7\uE0C7\uE1C7\uE2C7\uE3C7\uE4C7\uE5C7\uE6C7\uE7C7\uE8C7\u0000\uCEC7".toCharArray();
		}
		private static final char[] GETOUTPUT0_2460 = getOutput0_2460();
		private static final char[] getOutput0_2460() {
			return "\uE9C7\uEAC7\uEBC7\uECC7\uEDC7\uEEC7\uEFC7\uF0C7\uF1C7\uF2C7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uF3C7\uF4C7\uF5C7\uF6C7\uF7C7\uF8C7\uF9C7\uFAC7\uFBC7\uFCC7".toCharArray();
		}
		private static final char[] GETOUTPUT0_2550 = getOutput0_2550();
		private static final char[] getOutput0_2550() {
			return "\uA4A2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA5A2\u0000\u0000\uA7A2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA6A2\u0000\u0000\u7EA2\uA1A2\uA3A2\uA2A2\uACA2\uADA2\uAEA2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u62A2\u63A2\u64A2\u65A2\u66A2\u67A2\u68A2\u69A2\u70A2\u6FA2\u6EA2\u6DA2\u6CA2\u6BA2\u6AA2\u0000\u0000\u0000\u0000\u76A2\u79A2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uBDA1\uBCA1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uB6A1\uB5A1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uBFA1\uBEA1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uBBA1\uBAA1\u0000\u0000\u0000\uB3A1\u0000\u0000\uB7A1\uB4A1".toCharArray();
		}
		private static final char[] GETOUTPUT0_3000 = getOutput0_3000();
		private static final char[] getOutput0_3000() {
			return "\u40A1\u42A1\u43A1\uB2A1\u0000\uA4C6\u0000\u0000\u71A1\u72A1\u6DA1\u6EA1\u75A1\u76A1\u79A1\u7AA1\u69A1\u6AA1\u45A2\u0000\u65A1\u66A1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA9A1\uAAA1\u0000\u0000\uC3A2\uC4A2\uC5A2\uC6A2\uC7A2\uC8A2\uC9A2\uCAA2\uCBA2".toCharArray();
		}
		private static final char[] GETOUTPUT0_3041 = getOutput0_3041();
		private static final char[] getOutput0_3041() {
			return "\uA5C6\uA6C6\uA7C6\uA8C6\uA9C6\uAAC6\uABC6\uACC6\uADC6\uAEC6\uAFC6\uB0C6\uB1C6\uB2C6\uB3C6\uB4C6\uB5C6\uB6C6\uB7C6\uB8C6\uB9C6\uBAC6\uBBC6\uBCC6\uBDC6\uBEC6\uBFC6\uC0C6\uC1C6\uC2C6\uC3C6\uC4C6\uC5C6\uC6C6\uC7C6\uC8C6\uC9C6\uCAC6\uCBC6\uCCC6\uCDC6\uCEC6\uCFC6\uD0C6\uD1C6\uD2C6\uD3C6\uD4C6\uD5C6\uD6C6\uD7C6\uD8C6\uD9C6\uDAC6\uDBC6\uDCC6\uDDC6\uDEC6\uDFC6\uE0C6\uE1C6\uE2C6\uE3C6\uE4C6\uE5C6\uE6C6\uE7C6\uE8C6\uE9C6\uEAC6\uEBC6\uECC6\uEDC6\uEEC6\uEFC6\uF0C6\uF1C6\uF2C6\uF3C6\uF4C6\uF5C6\uF6C6\uF7C6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA2C6\uA3C6\u0000\u0000\uF8C6\uF9C6\uFAC6\uFBC6\uFCC6\uFDC6\uFEC6\u40C7\u41C7\u42C7\u43C7\u44C7\u45C7\u46C7\u47C7\u48C7\u49C7\u4AC7\u4BC7\u4CC7\u4DC7\u4EC7\u4FC7\u50C7\u51C7\u52C7\u53C7\u54C7\u55C7\u56C7\u57C7\u58C7\u59C7\u5AC7\u5BC7\u5CC7\u5DC7\u5EC7\u5FC7\u60C7\u61C7\u62C7\u63C7\u64C7\u65C7\u66C7\u67C7\u68C7\u69C7\u6AC7\u6BC7\u6CC7\u6DC7\u6EC7\u6FC7\u70C7\u71C7\u72C7\u73C7\u74C7\u75C7\u76C7\u77C7\u78C7\u79C7\u7AC7\u7BC7\u7CC7\u7DC7\u7EC7\uA1C7\uA2C7\uA3C7\uA4C7\uA5C7\uA6C7\uA7C7\uA8C7\uA9C7\uAAC7\uABC7\uACC7\uADC7\uAEC7\uAFC7\uB0C7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA1C6\u0000\u0000\u0000\u0000\u0000\u0000\u74A3\u75A3\u76A3\u77A3\u78A3\u79A3\u7AA3\u7BA3\u7CA3\u7DA3\u7EA3\uA1A3\uA2A3\uA3A3\uA4A3\uA5A3\uA6A3\uA7A3\uA8A3\uA9A3\uAAA3\uABA3\uACA3\uADA3\uAEA3\uAFA3\uB0A3\uB1A3\uB2A3\uB3A3\uB4A3\uB5A3\uB6A3\uB7A3\uB8A3\uB9A3\uBAA3".toCharArray();
		}
		private static final char[] GETOUTPUT0_FE30 = getOutput0_FE30();
		private static final char[] getOutput0_FE30() {
			return "\u4AA1\u57A1\u0000\u59A1\u5BA1\u5FA1\u60A1\u63A1\u64A1\u67A1\u68A1\u6BA1\u6CA1\u6FA1\u70A1\u73A1\u74A1\u77A1\u78A1\u7BA1\u7CA1\u0000\u0000\u0000\u0000\uC6A1\uC7A1\uCAA1\uCBA1\uC8A1\uC9A1\u5CA1\u4DA1\u0000\u4FA1\u0000\u51A1\u52A1\u53A1\u54A1\u0000\u7DA1\u7EA1\uA1A1\uA2A1\uA3A1\uA4A1\uCCA1\uCDA1\uCEA1\uDEA1\uDFA1\uE0A1\uE1A1\uE2A1\u0000\u0000\u4CA2\u4DA2\u4EA2".toCharArray();
		}
		private static final char[] GETOUTPUT0_FF01 = getOutput0_FF01();
		private static final char[] getOutput0_FF01() {
			return "\u49A1\u0000\uADA1\u43A2\u48A2\uAEA1\u0000\u5DA1\u5EA1\uAFA1\uCFA1\u41A1\uD0A1\u44A1\u41A2\uAFA2\uB0A2\uB1A2\uB2A2\uB3A2\uB4A2\uB5A2\uB6A2\uB7A2\uB8A2\u47A1\u46A1\uD5A1\uD7A1\uD6A1\u48A1\u49A2\uCFA2\uD0A2\uD1A2\uD2A2\uD3A2\uD4A2\uD5A2\uD6A2\uD7A2\uD8A2\uD9A2\uDAA2\uDBA2\uDCA2\uDDA2\uDEA2\uDFA2\uE0A2\uE1A2\uE2A2\uE3A2\uE4A2\uE5A2\uE6A2\uE7A2\uE8A2\u0000\u42A2\u0000\u0000\uC4A1\u0000\uE9A2\uEAA2\uEBA2\uECA2\uEDA2\uEEA2\uEFA2\uF0A2\uF1A2\uF2A2\uF3A2\uF4A2\uF5A2\uF6A2\uF7A2\uF8A2\uF9A2\uFAA2\uFBA2\uFCA2\uFDA2\uFEA2\u40A3\u41A3\u42A3\u43A3\u61A1\u55A1\u62A1\u0000\u0000\u0000\u0000\u0000\u0000\u4EA1".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON825[input - 0x391];
			if (input >= 0x414 && input <= 0x451) return GETOUTPUT0_414[input - 0x414];
			if (input >= 0x2460 && input <= 0x247D) return GETOUTPUT0_2460[input - 0x2460];
			if (input >= 0x2550 && input <= 0x25CF) return GETOUTPUT0_2550[input - 0x2550];
			if (input >= 0x3000 && input <= 0x3029) return GETOUTPUT0_3000[input - 0x3000];
			if (input >= 0x3041 && input <= 0x3129) return GETOUTPUT0_3041[input - 0x3041];
			if (input >= 0x4E00 && input <= 0x6316) return CommonSubtables.COMMON1116[input - 0x4E00];
			if (input >= 0x6328 && input <= 0x67FF) return CommonSubtables.COMMON1117[input - 0x6328];
			if (input >= 0x6812 && input <= 0x6854) return CommonSubtables.COMMON826[input - 0x6812];
			if (input >= 0x686B && input <= 0x6D42) return CommonSubtables.COMMON1118[input - 0x686B];
			if (input >= 0x6D58 && input <= 0x6D98) return CommonSubtables.COMMON827[input - 0x6D58];
			if (input >= 0x6DAA && input <= 0x6E05) return CommonSubtables.COMMON828[input - 0x6DAA];
			if (input >= 0x6E19 && input <= 0x7E9C) return CommonSubtables.COMMON1119[input - 0x6E19];
			if (input >= 0x7F36 && input <= 0x8356) return CommonSubtables.COMMON829[input - 0x7F36];
			if (input >= 0x8373 && input <= 0x89C0) return CommonSubtables.COMMON830[input - 0x8373];
			if (input >= 0x89D2 && input <= 0x8B9F) return CommonSubtables.COMMON831[input - 0x89D2];
			if (input >= 0x8C37 && input <= 0x8D1B) return CommonSubtables.COMMON832[input - 0x8C37];
			if (input >= 0x8D64 && input <= 0x8F64) return CommonSubtables.COMMON833[input - 0x8D64];
			if (input >= 0x8F9B && input <= 0x9483) return CommonSubtables.COMMON1120[input - 0x8F9B];
			if (input >= 0x9577 && input <= 0x95E5) return CommonSubtables.COMMON834[input - 0x9577];
			if (input >= 0x961C && input <= 0x9874) return CommonSubtables.COMMON1121[input - 0x961C];
			if (input >= 0x98A8 && input <= 0x9961) return CommonSubtables.COMMON835[input - 0x98A8];
			if (input >= 0x9996 && input <= 0x9A6B) return CommonSubtables.COMMON836[input - 0x9996];
			if (input >= 0x9AA8 && input <= 0x9C7A) return CommonSubtables.COMMON837[input - 0x9AA8];
			if (input >= 0x9CE5 && input <= 0x9E1E) return CommonSubtables.COMMON838[input - 0x9CE5];
			if (input >= 0x9E75 && input <= 0x9FA4) return CommonSubtables.COMMON839[input - 0x9E75];
			if (input >= 0xFE30 && input <= 0xFE6B) return GETOUTPUT0_FE30[input - 0xFE30];
			if (input >= 0xFF01 && input <= 0xFF64) return GETOUTPUT0_FF01[input - 0xFF01];
			switch (input) {
			case 0xA2: return 0x46A2L;
			case 0xA3: return 0x47A2L;
			case 0xA5: return 0x44A2L;
			case 0xA7: return 0xB1A1L;
			case 0xB0: return 0x58A2L;
			case 0xB1: return 0xD3A1L;
			case 0xB7: return 0x50A1L;
			case 0xD7: return 0xD1A1L;
			case 0xF7: return 0xD2A1L;
			case 0x2C7: return 0xBEA3L;
			case 0x2C9: return 0xBCA3L;
			case 0x2CA: return 0xBDA3L;
			case 0x2CB: return 0xBFA3L;
			case 0x2D9: return 0xBBA3L;
			case 0x401: return 0xB3C7L;
			case 0x2013: return 0x56A1L;
			case 0x2014: return 0x58A1L;
			case 0x2018: return 0xA5A1L;
			case 0x2019: return 0xA6A1L;
			case 0x201C: return 0xA7A1L;
			case 0x201D: return 0xA8A1L;
			case 0x2022: return 0x45A1L;
			case 0x2025: return 0x4CA1L;
			case 0x2026: return 0x4BA1L;
			case 0x2032: return 0xACA1L;
			case 0x2035: return 0xABA1L;
			case 0x203B: return 0xB0A1L;
			case 0x203E: return 0xC2A1L;
			case 0x2103: return 0x4AA2L;
			case 0x2105: return 0xC1A1L;
			case 0x2109: return 0x4BA2L;
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
			case 0x22A5: return 0xE6A1L;
			case 0x22BF: return 0xE9A1L;
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
			case 0x2641: return 0xF2A1L;
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
			case 0xFA0C: return 0x4AC9L;
			case 0xFA0D: return 0xFCDDL;
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
}
