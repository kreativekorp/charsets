package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacChineseSimplifiedCharset extends Charset {
	public XMacChineseSimplifiedCharset() {
		super("x-MacChineseSimplified", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacChineseSimplifiedCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacChineseSimplifiedCharsetEncoder(this);
	}

	private static final class XMacChineseSimplifiedCharsetDecoder extends TableCharsetDecoder {
		private XMacChineseSimplifiedCharsetDecoder(Charset cs) {
			super(cs, 1f, 2f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0xB0 && input <= 0xF7) return input - 0xB0 + 0xA;
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
			if (input >= 0x83 && input <= 0xA0) return input - 0x83 + 0x83;
			switch (input) {
			case 0x80: return 0xF87F00FCL;
			case 0x81: return 0xF880L;
			case 0x82: return 0xF881L;
			case 0xFD: return 0xA9L;
			case 0xFE: return 0x2122L;
			case 0xFF: return 0x2026L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_A1 = getOutput1_A1();
		private static final char[] getOutput1_A1() {
			return "\u3000\u3001\u3002\u00B7\u02C9\u02C7\u00A8\u3003\u3005\u2014\u301C\u2016\u22EF\u2018\u2019\u201C\u201D\u3014\u3015\u3008\u3009\u300A\u300B\u300C\u300D\u300E\u300F\u3016\u3017\u3010\u3011\u00B1\u00D7\u00F7\u2236\u2227\u2228\u2211\u220F\u222A\u2229\u2208\u2237\u221A\u22A5\u2225\u2220\u2312\u2299\u222B\u222E\u2261\u224C\u2248\u223D\u221D\u2260\u226E\u226F\u2264\u2265\u221E\u2235\u2234\u2642\u2640\u00B0\u2032\u2033\u2103\uFF04\u00A4\u00A2\u00A3\u2030\u00A7\u2116\u2606\u2605\u25CB\u25CF\u25CE\u25C7\u25C6\u25A1\u25A0\u25B3\u25B2\u203B\u2192\u2190\u2191\u2193\u3013".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xA1 && input <= 0xFE) return GETOUTPUT1_A1[input - 0xA1];
			return 0;
		}
		private long getOutput2(int input) {
			if (input >= 0xB1 && input <= 0xC4) return input - 0xB1 + 0x2488;
			if (input >= 0xC5 && input <= 0xD8) return input - 0xC5 + 0x2474;
			if (input >= 0xD9 && input <= 0xFC) return CommonSubtables.COMMON60[input - 0xD9];
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0xA5 && input <= 0xFD) return input - 0xA5 + 0xFF05;
			switch (input) {
			case 0xA1: return 0xFF01L;
			case 0xA2: return 0xFF02L;
			case 0xA3: return 0xFF03L;
			case 0xA4: return 0xA5L;
			case 0xFE: return 0x203EL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0xA1 && input <= 0xF3) return input - 0xA1 + 0x3041;
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0xA1 && input <= 0xF6) return input - 0xA1 + 0x30A1;
			return 0;
		}
		private static final int[] GETOUTPUT6_D2 = getOutput6_D2();
		private static final int[] getOutput6_D2() {
			return new int[] {
				0x3C3, 0x3C4, 0x3C5, 0x3C6, 0x3C7, 0x3C8, 0x3C9, 0xF87EFF0C, 0xF87E3002, 0xF87E3001, 0xF87EFF1A, 0xF87EFF1B, 0xF87EFF01, 0xF87EFF1F, 0xFE35, 0xFE36,
				0xFE39, 0xFE3A, 0xFE3F, 0xFE40, 0xFE3D, 0xFE3E, 0xFE41, 0xFE42, 0xFE43, 0xFE44, 0xF87E3016, 0xF87E3017, 0xFE3B, 0xFE3C, 0xFE37, 0xFE38,
				0xFE31, 0xF87E22EF, 0xFE33, 0xFE34,
			};
		}
		private long getOutput6(int input) {
			if (input >= 0xA1 && input <= 0xB1) return input - 0xA1 + 0x391;
			if (input >= 0xC1 && input <= 0xD1) return input - 0xC1 + 0x3B1;
			if (input >= 0xD2 && input <= 0xF5) return GETOUTPUT6_D2[input - 0xD2];
			switch (input) {
			case 0xB2: return 0x3A3L;
			case 0xB3: return 0x3A4L;
			case 0xB4: return 0x3A5L;
			case 0xB5: return 0x3A6L;
			case 0xB6: return 0x3A7L;
			case 0xB7: return 0x3A8L;
			case 0xB8: return 0x3A9L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0xA8 && input <= 0xC1) return input - 0xA8 + 0x416;
			if (input >= 0xD8 && input <= 0xF1) return input - 0xD8 + 0x436;
			switch (input) {
			case 0xA1: return 0x410L;
			case 0xA2: return 0x411L;
			case 0xA3: return 0x412L;
			case 0xA4: return 0x413L;
			case 0xA5: return 0x414L;
			case 0xA6: return 0x415L;
			case 0xA7: return 0x401L;
			case 0xD1: return 0x430L;
			case 0xD2: return 0x431L;
			case 0xD3: return 0x432L;
			case 0xD4: return 0x433L;
			case 0xD5: return 0x434L;
			case 0xD6: return 0x435L;
			case 0xD7: return 0x451L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT8_A1 = getOutput8_A1();
		private static final char[] getOutput8_A1() {
			return "\u0101\u00E1\u01CE\u00E0\u0113\u00E9\u011B\u00E8\u012B\u00ED\u01D0\u00EC\u014D\u00F3\u01D2\u00F2\u016B\u00FA\u01D4\u00F9\u01D6\u01D8\u01DA\u01DC\u00FC\u00EA\u0251\u1E3F\u0144\u0148\u01F9\u0261".toCharArray();
		}
		private long getOutput8(int input) {
			if (input >= 0xC5 && input <= 0xE9) return input - 0xC5 + 0x3105;
			if (input >= 0xA1 && input <= 0xC0) return GETOUTPUT8_A1[input - 0xA1];
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0xA4 && input <= 0xEF) return input - 0xA4 + 0x2500;
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON61[input - 0xA1];
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON62[input - 0xA1];
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON63[input - 0xA1];
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON64[input - 0xA1];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON65[input - 0xA1];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON66[input - 0xA1];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON67[input - 0xA1];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON68[input - 0xA1];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON69[input - 0xA1];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON70[input - 0xA1];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON71[input - 0xA1];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON72[input - 0xA1];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON73[input - 0xA1];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON74[input - 0xA1];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON75[input - 0xA1];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON76[input - 0xA1];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON77[input - 0xA1];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON78[input - 0xA1];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON79[input - 0xA1];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON80[input - 0xA1];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON81[input - 0xA1];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON82[input - 0xA1];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON83[input - 0xA1];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON84[input - 0xA1];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON85[input - 0xA1];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON86[input - 0xA1];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON87[input - 0xA1];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON88[input - 0xA1];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON89[input - 0xA1];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON90[input - 0xA1];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON91[input - 0xA1];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON92[input - 0xA1];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON93[input - 0xA1];
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON94[input - 0xA1];
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON95[input - 0xA1];
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON96[input - 0xA1];
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON97[input - 0xA1];
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON98[input - 0xA1];
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON99[input - 0xA1];
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0xA1 && input <= 0xF9) return CommonSubtables.COMMON100[input - 0xA1];
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON101[input - 0xA1];
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON102[input - 0xA1];
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON103[input - 0xA1];
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON104[input - 0xA1];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON105[input - 0xA1];
			return 0;
		}
		private long getOutput55(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON106[input - 0xA1];
			return 0;
		}
		private long getOutput56(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON107[input - 0xA1];
			return 0;
		}
		private long getOutput57(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON108[input - 0xA1];
			return 0;
		}
		private long getOutput58(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON109[input - 0xA1];
			return 0;
		}
		private long getOutput59(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON110[input - 0xA1];
			return 0;
		}
		private long getOutput60(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON111[input - 0xA1];
			return 0;
		}
		private long getOutput61(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON112[input - 0xA1];
			return 0;
		}
		private long getOutput62(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON113[input - 0xA1];
			return 0;
		}
		private long getOutput63(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON114[input - 0xA1];
			return 0;
		}
		private long getOutput64(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON115[input - 0xA1];
			return 0;
		}
		private long getOutput65(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON116[input - 0xA1];
			return 0;
		}
		private long getOutput66(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON117[input - 0xA1];
			return 0;
		}
		private long getOutput67(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON118[input - 0xA1];
			return 0;
		}
		private long getOutput68(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON119[input - 0xA1];
			return 0;
		}
		private long getOutput69(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON120[input - 0xA1];
			return 0;
		}
		private long getOutput70(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON121[input - 0xA1];
			return 0;
		}
		private long getOutput71(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON122[input - 0xA1];
			return 0;
		}
		private long getOutput72(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON123[input - 0xA1];
			return 0;
		}
		private long getOutput73(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON124[input - 0xA1];
			return 0;
		}
		private long getOutput74(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON125[input - 0xA1];
			return 0;
		}
		private long getOutput75(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON126[input - 0xA1];
			return 0;
		}
		private long getOutput76(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON127[input - 0xA1];
			return 0;
		}
		private long getOutput77(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON128[input - 0xA1];
			return 0;
		}
		private long getOutput78(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON129[input - 0xA1];
			return 0;
		}
		private long getOutput79(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON130[input - 0xA1];
			return 0;
		}
		private long getOutput80(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON131[input - 0xA1];
			return 0;
		}
		private long getOutput81(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON132[input - 0xA1];
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
			default: return 0;
			}
		}
	}

	private static final class XMacChineseSimplifiedCharsetEncoder extends TableCharsetEncoder {
		private XMacChineseSimplifiedCharsetEncoder(Charset cs) {
			super(cs, 1.97717f, 2f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xFC: return 0x1;
			case 0x22EF: return 0x2;
			case 0x3001: return 0x3;
			case 0x3002: return 0x4;
			case 0x3016: return 0x5;
			case 0x3017: return 0x6;
			case 0xFF01: return 0x7;
			case 0xFF0C: return 0x8;
			case 0xFF1A: return 0x9;
			case 0xFF1B: return 0xA;
			case 0xFF1F: return 0xB;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_3000 = getOutput0_3000();
		private static final char[] getOutput0_3000() {
			return "\uA1A1\uA2A1\uA3A1\uA8A1\u0000\uA9A1\u0000\u0000\uB4A1\uB5A1\uB6A1\uB7A1\uB8A1\uB9A1\uBAA1\uBBA1\uBEA1\uBFA1\u0000\uFEA1\uB2A1\uB3A1\uBCA1\uBDA1\u0000\u0000\u0000\u0000\uABA1".toCharArray();
		}
		private static final char[] GETOUTPUT0_3041 = getOutput0_3041();
		private static final char[] getOutput0_3041() {
			return "\uA1A4\uA2A4\uA3A4\uA4A4\uA5A4\uA6A4\uA7A4\uA8A4\uA9A4\uAAA4\uABA4\uACA4\uADA4\uAEA4\uAFA4\uB0A4\uB1A4\uB2A4\uB3A4\uB4A4\uB5A4\uB6A4\uB7A4\uB8A4\uB9A4\uBAA4\uBBA4\uBCA4\uBDA4\uBEA4\uBFA4\uC0A4\uC1A4\uC2A4\uC3A4\uC4A4\uC5A4\uC6A4\uC7A4\uC8A4\uC9A4\uCAA4\uCBA4\uCCA4\uCDA4\uCEA4\uCFA4\uD0A4\uD1A4\uD2A4\uD3A4\uD4A4\uD5A4\uD6A4\uD7A4\uD8A4\uD9A4\uDAA4\uDBA4\uDCA4\uDDA4\uDEA4\uDFA4\uE0A4\uE1A4\uE2A4\uE3A4\uE4A4\uE5A4\uE6A4\uE7A4\uE8A4\uE9A4\uEAA4\uEBA4\uECA4\uEDA4\uEEA4\uEFA4\uF0A4\uF1A4\uF2A4\uF3A4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA1A5\uA2A5\uA3A5\uA4A5\uA5A5\uA6A5\uA7A5\uA8A5\uA9A5\uAAA5\uABA5\uACA5\uADA5\uAEA5\uAFA5\uB0A5\uB1A5\uB2A5\uB3A5\uB4A5\uB5A5\uB6A5\uB7A5\uB8A5\uB9A5\uBAA5\uBBA5\uBCA5\uBDA5\uBEA5\uBFA5\uC0A5\uC1A5\uC2A5\uC3A5\uC4A5\uC5A5\uC6A5\uC7A5\uC8A5\uC9A5\uCAA5\uCBA5\uCCA5\uCDA5\uCEA5\uCFA5\uD0A5\uD1A5\uD2A5\uD3A5\uD4A5\uD5A5\uD6A5\uD7A5\uD8A5\uD9A5\uDAA5\uDBA5\uDCA5\uDDA5\uDEA5\uDFA5\uE0A5\uE1A5\uE2A5\uE3A5\uE4A5\uE5A5\uE6A5\uE7A5\uE8A5\uE9A5\uEAA5\uEBA5\uECA5\uEDA5\uEEA5\uEFA5\uF0A5\uF1A5\uF2A5\uF3A5\uF4A5\uF5A5\uF6A5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uC5A8\uC6A8\uC7A8\uC8A8\uC9A8\uCAA8\uCBA8\uCCA8\uCDA8\uCEA8\uCFA8\uD0A8\uD1A8\uD2A8\uD3A8\uD4A8\uD5A8\uD6A8\uD7A8\uD8A8\uD9A8\uDAA8\uDBA8\uDCA8\uDDA8\uDEA8\uDFA8\uE0A8\uE1A8\uE2A8\uE3A8\uE4A8\uE5A8\uE6A8\uE7A8\uE8A8\uE9A8".toCharArray();
		}
		private static final char[] GETOUTPUT0_FE31 = getOutput0_FE31();
		private static final char[] getOutput0_FE31() {
			return "\uF2A6\u0000\uF4A6\uF5A6\uE0A6\uE1A6\uF0A6\uF1A6\uE2A6\uE3A6\uEEA6\uEFA6\uE6A6\uE7A6\uE4A6\uE5A6\uE8A6\uE9A6\uEAA6\uEBA6".toCharArray();
		}
		private static final char[] GETOUTPUT0_FF01 = getOutput0_FF01();
		private static final char[] getOutput0_FF01() {
			return "\uA1A3\uA2A3\uA3A3\uE7A1\uA5A3\uA6A3\uA7A3\uA8A3\uA9A3\uAAA3\uABA3\uACA3\uADA3\uAEA3\uAFA3\uB0A3\uB1A3\uB2A3\uB3A3\uB4A3\uB5A3\uB6A3\uB7A3\uB8A3\uB9A3\uBAA3\uBBA3\uBCA3\uBDA3\uBEA3\uBFA3\uC0A3\uC1A3\uC2A3\uC3A3\uC4A3\uC5A3\uC6A3\uC7A3\uC8A3\uC9A3\uCAA3\uCBA3\uCCA3\uCDA3\uCEA3\uCFA3\uD0A3\uD1A3\uD2A3\uD3A3\uD4A3\uD5A3\uD6A3\uD7A3\uD8A3\uD9A3\uDAA3\uDBA3\uDCA3\uDDA3\uDEA3\uDFA3\uE0A3\uE1A3\uE2A3\uE3A3\uE4A3\uE5A3\uE6A3\uE7A3\uE8A3\uE9A3\uEAA3\uEBA3\uECA3\uEDA3\uEEA3\uEFA3\uF0A3\uF1A3\uF2A3\uF3A3\uF4A3\uF5A3\uF6A3\uF7A3\uF8A3\uF9A3\uFAA3\uFBA3\uFCA3\uFDA3".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x83 && input <= 0xA0) return input - 0x83 + 0x83;
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON133[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON134[input - 0x401];
			if (input >= 0x2208 && input <= 0x224C) return CommonSubtables.COMMON135[input - 0x2208];
			if (input >= 0x2460 && input <= 0x249B) return CommonSubtables.COMMON136[input - 0x2460];
			if (input >= 0x2500 && input <= 0x254B) return CommonSubtables.COMMON137[input - 0x2500];
			if (input >= 0x3000 && input <= 0x301C) return GETOUTPUT0_3000[input - 0x3000];
			if (input >= 0x3041 && input <= 0x3129) return GETOUTPUT0_3041[input - 0x3041];
			if (input >= 0x4E00 && input <= 0x508D) return CommonSubtables.COMMON138[input - 0x4E00];
			if (input >= 0x50CF && input <= 0x5121) return CommonSubtables.COMMON139[input - 0x50CF];
			if (input >= 0x513F && input <= 0x570A) return CommonSubtables.COMMON140[input - 0x513F];
			if (input >= 0x571C && input <= 0x586C) return CommonSubtables.COMMON141[input - 0x571C];
			if (input >= 0x58BC && input <= 0x5A7F) return CommonSubtables.COMMON142[input - 0x58BC];
			if (input >= 0x5A92 && input <= 0x5AF1) return CommonSubtables.COMMON143[input - 0x5A92];
			if (input >= 0x5B32 && input <= 0x5D82) return CommonSubtables.COMMON144[input - 0x5B32];
			if (input >= 0x5DB7 && input <= 0x612B) return CommonSubtables.COMMON145[input - 0x5DB7];
			if (input >= 0x618B && input <= 0x61D4) return CommonSubtables.COMMON146[input - 0x618B];
			if (input >= 0x61E6 && input <= 0x64E6) return CommonSubtables.COMMON147[input - 0x61E6];
			if (input >= 0x6500 && input <= 0x66BE) return CommonSubtables.COMMON148[input - 0x6500];
			if (input >= 0x66D9 && input <= 0x6942) return CommonSubtables.COMMON149[input - 0x66D9];
			if (input >= 0x6954 && input <= 0x6AAC) return CommonSubtables.COMMON150[input - 0x6954];
			if (input >= 0x6B20 && input <= 0x6FEF) return CommonSubtables.COMMON151[input - 0x6B20];
			if (input >= 0x704C && input <= 0x7206) return CommonSubtables.COMMON152[input - 0x704C];
			if (input >= 0x721D && input <= 0x7441) return CommonSubtables.COMMON153[input - 0x721D];
			if (input >= 0x7455 && input <= 0x74BA) return CommonSubtables.COMMON154[input - 0x7455];
			if (input >= 0x74D2 && input <= 0x7A57) return CommonSubtables.COMMON155[input - 0x74D2];
			if (input >= 0x7A70 && input <= 0x7C4D) return CommonSubtables.COMMON174[input - 0x7A70];
			if (input >= 0x7C73 && input <= 0x7D0A) return CommonSubtables.COMMON156[input - 0x7C73];
			if (input >= 0x7E9B && input <= 0x81CC) return CommonSubtables.COMMON157[input - 0x7E9B];
			if (input >= 0x81E3 && input <= 0x85E9) return CommonSubtables.COMMON158[input - 0x81E3];
			if (input >= 0x85FB && input <= 0x8944) return CommonSubtables.COMMON159[input - 0x85FB];
			if (input >= 0x89C1 && input <= 0x8A07) return CommonSubtables.COMMON160[input - 0x89C1];
			if (input >= 0x8BA0 && input <= 0x8C98) return CommonSubtables.COMMON161[input - 0x8BA0];
			if (input >= 0x8D1D && input <= 0x8EBA) return CommonSubtables.COMMON162[input - 0x8D1D];
			if (input >= 0x8F66 && input <= 0x9104) return CommonSubtables.COMMON163[input - 0x8F66];
			if (input >= 0x9119 && input <= 0x91DC) return CommonSubtables.COMMON164[input - 0x9119];
			if (input >= 0x9485 && input <= 0x957F) return CommonSubtables.COMMON165[input - 0x9485];
			if (input >= 0x95E8 && input <= 0x973E) return CommonSubtables.COMMON166[input - 0x95E8];
			if (input >= 0x9752 && input <= 0x97B4) return CommonSubtables.COMMON167[input - 0x9752];
			if (input >= 0x9875 && input <= 0x98A7) return CommonSubtables.COMMON168[input - 0x9875];
			if (input >= 0x9954 && input <= 0x99A8) return CommonSubtables.COMMON169[input - 0x9954];
			if (input >= 0x9A6C && input <= 0x9B54) return CommonSubtables.COMMON170[input - 0x9A6C];
			if (input >= 0x9C7C && input <= 0x9CE2) return CommonSubtables.COMMON171[input - 0x9C7C];
			if (input >= 0x9E1F && input <= 0x9F51) return CommonSubtables.COMMON172[input - 0x9E1F];
			if (input >= 0x9F7F && input <= 0x9FA0) return CommonSubtables.COMMON173[input - 0x9F7F];
			if (input >= 0xFE31 && input <= 0xFE44) return GETOUTPUT0_FE31[input - 0xFE31];
			if (input >= 0xFF01 && input <= 0xFF5D) return GETOUTPUT0_FF01[input - 0xFF01];
			switch (input) {
			case 0xA2: return 0xE9A1L;
			case 0xA3: return 0xEAA1L;
			case 0xA4: return 0xE8A1L;
			case 0xA5: return 0xA4A3L;
			case 0xA7: return 0xECA1L;
			case 0xA8: return 0xA7A1L;
			case 0xA9: return 0xFDL;
			case 0xB0: return 0xE3A1L;
			case 0xB1: return 0xC0A1L;
			case 0xB7: return 0xA4A1L;
			case 0xD7: return 0xC1A1L;
			case 0xE0: return 0xA4A8L;
			case 0xE1: return 0xA2A8L;
			case 0xE8: return 0xA8A8L;
			case 0xE9: return 0xA6A8L;
			case 0xEA: return 0xBAA8L;
			case 0xEC: return 0xACA8L;
			case 0xED: return 0xAAA8L;
			case 0xF2: return 0xB0A8L;
			case 0xF3: return 0xAEA8L;
			case 0xF7: return 0xC2A1L;
			case 0xF9: return 0xB4A8L;
			case 0xFA: return 0xB2A8L;
			case 0xFC: return 0xB9A8L;
			case 0x101: return 0xA1A8L;
			case 0x113: return 0xA5A8L;
			case 0x11B: return 0xA7A8L;
			case 0x12B: return 0xA9A8L;
			case 0x144: return 0xBDA8L;
			case 0x148: return 0xBEA8L;
			case 0x14D: return 0xADA8L;
			case 0x16B: return 0xB1A8L;
			case 0x1CE: return 0xA3A8L;
			case 0x1D0: return 0xABA8L;
			case 0x1D2: return 0xAFA8L;
			case 0x1D4: return 0xB3A8L;
			case 0x1D6: return 0xB5A8L;
			case 0x1D8: return 0xB6A8L;
			case 0x1DA: return 0xB7A8L;
			case 0x1DC: return 0xB8A8L;
			case 0x1F9: return 0xBFA8L;
			case 0x251: return 0xBBA8L;
			case 0x261: return 0xC0A8L;
			case 0x2C7: return 0xA6A1L;
			case 0x2C9: return 0xA5A1L;
			case 0x1E3F: return 0xBCA8L;
			case 0x2014: return 0xAAA1L;
			case 0x2016: return 0xACA1L;
			case 0x2018: return 0xAEA1L;
			case 0x2019: return 0xAFA1L;
			case 0x201C: return 0xB0A1L;
			case 0x201D: return 0xB1A1L;
			case 0x2026: return 0xFF01L;
			case 0x2030: return 0xEBA1L;
			case 0x2032: return 0xE4A1L;
			case 0x2033: return 0xE5A1L;
			case 0x203B: return 0xF9A1L;
			case 0x203E: return 0xFEA3L;
			case 0x2103: return 0xE6A1L;
			case 0x2116: return 0xEDA1L;
			case 0x2122: return 0xFEL;
			case 0x2160: return 0xF1A2L;
			case 0x2161: return 0xF2A2L;
			case 0x2162: return 0xF3A2L;
			case 0x2163: return 0xF4A2L;
			case 0x2164: return 0xF5A2L;
			case 0x2165: return 0xF6A2L;
			case 0x2166: return 0xF7A2L;
			case 0x2167: return 0xF8A2L;
			case 0x2168: return 0xF9A2L;
			case 0x2169: return 0xFAA2L;
			case 0x216A: return 0xFBA2L;
			case 0x216B: return 0xFCA2L;
			case 0x2190: return 0xFBA1L;
			case 0x2191: return 0xFCA1L;
			case 0x2192: return 0xFAA1L;
			case 0x2193: return 0xFDA1L;
			case 0x2260: return 0xD9A1L;
			case 0x2261: return 0xD4A1L;
			case 0x2264: return 0xDCA1L;
			case 0x2265: return 0xDDA1L;
			case 0x226E: return 0xDAA1L;
			case 0x226F: return 0xDBA1L;
			case 0x2299: return 0xD1A1L;
			case 0x22A5: return 0xCDA1L;
			case 0x22EF: return 0xADA1L;
			case 0x2312: return 0xD0A1L;
			case 0x25A0: return 0xF6A1L;
			case 0x25A1: return 0xF5A1L;
			case 0x25B2: return 0xF8A1L;
			case 0x25B3: return 0xF7A1L;
			case 0x25C6: return 0xF4A1L;
			case 0x25C7: return 0xF3A1L;
			case 0x25CB: return 0xF0A1L;
			case 0x25CE: return 0xF2A1L;
			case 0x25CF: return 0xF1A1L;
			case 0x2605: return 0xEFA1L;
			case 0x2606: return 0xEEA1L;
			case 0x2640: return 0xE2A1L;
			case 0x2642: return 0xE1A1L;
			case 0x3220: return 0xE5A2L;
			case 0x3221: return 0xE6A2L;
			case 0x3222: return 0xE7A2L;
			case 0x3223: return 0xE8A2L;
			case 0x3224: return 0xE9A2L;
			case 0x3225: return 0xEAA2L;
			case 0x3226: return 0xEBA2L;
			case 0x3227: return 0xECA2L;
			case 0x3228: return 0xEDA2L;
			case 0x3229: return 0xEEA2L;
			case 0x50A3: return 0xF6B4L;
			case 0x50A5: return 0xCED9L;
			case 0x50A7: return 0xCFD9L;
			case 0x50A8: return 0xA2B4L;
			case 0x50A9: return 0xD0D9L;
			case 0x50AC: return 0xDFB4L;
			case 0x50B2: return 0xC1B0L;
			case 0x50BA: return 0xD1D9L;
			case 0x50BB: return 0xB5C9L;
			case 0x587E: return 0xD3DBL;
			case 0x5880: return 0xAFDCL;
			case 0x5881: return 0xACDCL;
			case 0x5883: return 0xB3BEL;
			case 0x5885: return 0xFBCAL;
			case 0x5889: return 0xADDCL;
			case 0x5892: return 0xCAC9L;
			case 0x5893: return 0xB9C4L;
			case 0x5899: return 0xBDC7L;
			case 0x589A: return 0xAEDCL;
			case 0x589E: return 0xF6D4L;
			case 0x589F: return 0xE6D0L;
			case 0x58A8: return 0xABC4L;
			case 0x58A9: return 0xD5B6L;
			case 0x5B09: return 0xD2E6L;
			case 0x5B16: return 0xD4E6L;
			case 0x5B17: return 0xD3E6L;
			case 0x5D99: return 0xD7E1L;
			case 0x5D9D: return 0xD8E1L;
			case 0x613F: return 0xB8D4L;
			case 0x6148: return 0xC8B4L;
			case 0x614A: return 0xBBE3L;
			case 0x614C: return 0xC5BBL;
			case 0x614E: return 0xF7C9L;
			case 0x6151: return 0xE5C9L;
			case 0x6155: return 0xBDC4L;
			case 0x615D: return 0xABEDL;
			case 0x6162: return 0xFDC2L;
			case 0x6167: return 0xDBBBL;
			case 0x6168: return 0xAEBFL;
			case 0x6170: return 0xBFCEL;
			case 0x6175: return 0xBCE3L;
			case 0x6177: return 0xB6BFL;
			case 0x7011: return 0xD9C6L;
			case 0x701A: return 0xABE5L;
			case 0x701B: return 0xADE5L;
			case 0x7023: return 0xACE5L;
			case 0x7035: return 0xAFE5L;
			case 0x7039: return 0xAEE5L;
			case 0x7D20: return 0xD8CBL;
			case 0x7D22: return 0xF7CBL;
			case 0x7D27: return 0xF4BDL;
			case 0x7D2B: return 0xCFD7L;
			case 0x7D2F: return 0xDBC0L;
			case 0x7D6E: return 0xF5D0L;
			case 0x7D77: return 0xEAF4L;
			case 0x7DA6: return 0xEBF4L;
			case 0x7DAE: return 0xECF4L;
			case 0x7E3B: return 0xE3F7L;
			case 0x7E41: return 0xB1B7L;
			case 0x7E47: return 0xEDF4L;
			case 0x7E82: return 0xEBD7L;
			case 0x895E: return 0xC5F4L;
			case 0x895F: return 0xF3BDL;
			case 0x8966: return 0xE0F1L;
			case 0x897B: return 0xE1F1L;
			case 0x897F: return 0xF7CEL;
			case 0x8981: return 0xAAD2L;
			case 0x8983: return 0xFBF1L;
			case 0x8986: return 0xB2B8L;
			case 0x8A3E: return 0xA4F6L;
			case 0x8A48: return 0xBAEEL;
			case 0x8A79: return 0xB2D5L;
			case 0x8A89: return 0xFED3L;
			case 0x8A8A: return 0xDCCCL;
			case 0x8A93: return 0xC4CAL;
			case 0x8B07: return 0xC0E5L;
			case 0x8B26: return 0xA5F6L;
			case 0x8B66: return 0xAFBEL;
			case 0x8B6C: return 0xA9C6L;
			case 0x8ECE: return 0xA6EAL;
			case 0x9274: return 0xF8BCL;
			case 0x928E: return 0xC6F6L;
			case 0x92AE: return 0xC7F6L;
			case 0x92C8: return 0xC8F6L;
			case 0x933E: return 0xC9F6L;
			case 0x936A: return 0xCAF6L;
			case 0x938F: return 0xCCF6L;
			case 0x93CA: return 0xCBF6L;
			case 0x93D6: return 0xE9F7L;
			case 0x943E: return 0xCDF6L;
			case 0x946B: return 0xCEF6L;
			case 0x97E6: return 0xA4CEL;
			case 0x97E7: return 0xCDC8L;
			case 0x97E9: return 0xABBAL;
			case 0x97EA: return 0xB8E8L;
			case 0x97EB: return 0xB9E8L;
			case 0x97EC: return 0xBAE8L;
			case 0x97ED: return 0xC2BEL;
			case 0x97F3: return 0xF4D2L;
			case 0x97F5: return 0xCFD4L;
			case 0x97F6: return 0xD8C9L;
			case 0x98CE: return 0xE7B7L;
			case 0x98D1: return 0xA9ECL;
			case 0x98D2: return 0xAAECL;
			case 0x98D3: return 0xABECL;
			case 0x98D5: return 0xACECL;
			case 0x98D8: return 0xAEC6L;
			case 0x98D9: return 0xADECL;
			case 0x98DA: return 0xAEECL;
			case 0x98DE: return 0xC9B7L;
			case 0x98DF: return 0xB3CAL;
			case 0x98E7: return 0xB8E2L;
			case 0x98E8: return 0xCFF7L;
			case 0x990D: return 0xD0F7L;
			case 0x9910: return 0xCDB2L;
			case 0x992E: return 0xD1F7L;
			case 0xF880: return 0x81L;
			case 0xF881: return 0x82L;
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
			case 0xF87E: return 0xF3A6L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xF87E: return 0xDBA6L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xF87E: return 0xDAA6L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xF87E: return 0xECA6L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0xF87E: return 0xEDA6L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0xF87E: return 0xDEA6L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0xF87E: return 0xD9A6L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0xF87E: return 0xDCA6L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0xF87E: return 0xDDA6L;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0xF87E: return 0xDFA6L;
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
			default: return 0;
			}
		}
	}
}
