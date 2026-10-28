package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1383Charset extends Charset {
	public XIBM1383Charset() {
		super("x-IBM1383", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1383CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1383CharsetEncoder(this);
	}

	private static final class XIBM1383CharsetDecoder extends TableCharsetDecoder {
		private XIBM1383CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0x1;
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
			if (input >= 0x20 && input <= 0x8D) return input - 0x20 + 0x20;
			if (input >= 0x90 && input <= 0x9F) return input - 0x90 + 0x90;
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON54[input - 0xA1];
			return 0;
		}
		private static final char[] GETOUTPUT2_D9 = getOutput2_D9();
		private static final char[] getOutput2_D9() {
			return "\u2460\u2461\u2462\u2463\u2464\u2465\u2466\u2467\u2468\u2469\uE010\uE011\u3220\u3221\u3222\u3223\u3224\u3225\u3226\u3227\u3228\u3229\uE012\uE013\u2160\u2161\u2162\u2163\u2164\u2165\u2166\u2167\u2168\u2169\u216A\u216B\uE014\uE015".toCharArray();
		}
		private long getOutput2(int input) {
			if (input >= 0xA1 && input <= 0xB0) return input - 0xA1 + 0xE000;
			if (input >= 0xB1 && input <= 0xC4) return input - 0xB1 + 0x2488;
			if (input >= 0xC5 && input <= 0xD8) return input - 0xC5 + 0x2474;
			if (input >= 0xD9 && input <= 0xFE) return GETOUTPUT2_D9[input - 0xD9];
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0xA8 && input <= 0xFD) return input - 0xA8 + 0xFF08;
			switch (input) {
			case 0xA1: return 0xFF01L;
			case 0xA2: return 0xFF02L;
			case 0xA3: return 0xFF03L;
			case 0xA4: return 0xFFE5L;
			case 0xA5: return 0xFF05L;
			case 0xA6: return 0xFF06L;
			case 0xA7: return 0xB4L;
			case 0xFE: return 0xFFE3L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0xA1 && input <= 0xF3) return input - 0xA1 + 0x3041;
			switch (input) {
			case 0xF4: return 0xE016L;
			case 0xF5: return 0xE017L;
			case 0xF6: return 0xE018L;
			case 0xF7: return 0xE019L;
			case 0xF8: return 0xE01AL;
			case 0xF9: return 0xE01BL;
			case 0xFA: return 0xE01CL;
			case 0xFB: return 0xE01DL;
			case 0xFC: return 0xE01EL;
			case 0xFD: return 0xE01FL;
			case 0xFE: return 0xE020L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0xA1 && input <= 0xF6) return input - 0xA1 + 0x30A1;
			switch (input) {
			case 0xF7: return 0xE021L;
			case 0xF8: return 0xE022L;
			case 0xF9: return 0xE023L;
			case 0xFA: return 0xE024L;
			case 0xFB: return 0xE025L;
			case 0xFC: return 0xE026L;
			case 0xFD: return 0xE027L;
			case 0xFE: return 0xE028L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0xA1 && input <= 0xB1) return input - 0xA1 + 0x391;
			if (input >= 0xC1 && input <= 0xD1) return input - 0xC1 + 0x3B1;
			if (input >= 0xD9 && input <= 0xFE) return input - 0xD9 + 0xE031;
			switch (input) {
			case 0xB2: return 0x3A3L;
			case 0xB3: return 0x3A4L;
			case 0xB4: return 0x3A5L;
			case 0xB5: return 0x3A6L;
			case 0xB6: return 0x3A7L;
			case 0xB7: return 0x3A8L;
			case 0xB8: return 0x3A9L;
			case 0xB9: return 0xE029L;
			case 0xBA: return 0xE02AL;
			case 0xBB: return 0xE02BL;
			case 0xBC: return 0xE02CL;
			case 0xBD: return 0xE02DL;
			case 0xBE: return 0xE02EL;
			case 0xBF: return 0xE02FL;
			case 0xC0: return 0xE030L;
			case 0xD2: return 0x3C3L;
			case 0xD3: return 0x3C4L;
			case 0xD4: return 0x3C5L;
			case 0xD5: return 0x3C6L;
			case 0xD6: return 0x3C7L;
			case 0xD7: return 0x3C8L;
			case 0xD8: return 0x3C9L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT7_C2 = getOutput7_C2();
		private static final char[] getOutput7_C2() {
			return "\uE057\uE058\uE059\uE05A\uE05B\uE05C\uE05D\uE05E\uE05F\uE060\uE061\uE062\uE063\uE064\uE065\u0430\u0431\u0432\u0433\u0434\u0435\u0451".toCharArray();
		}
		private long getOutput7(int input) {
			if (input >= 0xA8 && input <= 0xC1) return input - 0xA8 + 0x416;
			if (input >= 0xD8 && input <= 0xF1) return input - 0xD8 + 0x436;
			if (input >= 0xC2 && input <= 0xD7) return GETOUTPUT7_C2[input - 0xC2];
			switch (input) {
			case 0xA1: return 0x410L;
			case 0xA2: return 0x411L;
			case 0xA3: return 0x412L;
			case 0xA4: return 0x413L;
			case 0xA5: return 0x414L;
			case 0xA6: return 0x415L;
			case 0xA7: return 0x401L;
			case 0xF2: return 0xE066L;
			case 0xF3: return 0xE067L;
			case 0xF4: return 0xE068L;
			case 0xF5: return 0xE069L;
			case 0xF6: return 0xE06AL;
			case 0xF7: return 0xE06BL;
			case 0xF8: return 0xE06CL;
			case 0xF9: return 0xE06DL;
			case 0xFA: return 0xE06EL;
			case 0xFB: return 0xE06FL;
			case 0xFC: return 0xE070L;
			case 0xFD: return 0xE071L;
			case 0xFE: return 0xE072L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT8_A1 = getOutput8_A1();
		private static final char[] getOutput8_A1() {
			return "\u0101\u00E1\u01CE\u00E0\u0113\u00E9\u011B\u00E8\u012B\u00ED\u01D0\u00EC\u014D\u00F3\u01D2\u00F2\u016B\u00FA\u01D4\u00F9\u01D6\u01D8\u01DA\u01DC\u00FC\u00EA\uE073\uE074\uE075\uE076\uE077\uE078\uE079\uE07A\uE07B\uE07C".toCharArray();
		}
		private long getOutput8(int input) {
			if (input >= 0xC5 && input <= 0xE9) return input - 0xC5 + 0x3105;
			if (input >= 0xA1 && input <= 0xC4) return GETOUTPUT8_A1[input - 0xA1];
			if (input >= 0xEA && input <= 0xFE) return input - 0xEA + 0xE07D;
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0xA4 && input <= 0xEF) return input - 0xA4 + 0x2500;
			switch (input) {
			case 0xA1: return 0xE092L;
			case 0xA2: return 0xE093L;
			case 0xA3: return 0xE094L;
			case 0xF0: return 0xE095L;
			case 0xF1: return 0xE096L;
			case 0xF2: return 0xE097L;
			case 0xF3: return 0xE098L;
			case 0xF4: return 0xE099L;
			case 0xF5: return 0xE09AL;
			case 0xF6: return 0xE09BL;
			case 0xF7: return 0xE09CL;
			case 0xF8: return 0xE09DL;
			case 0xF9: return 0xE09EL;
			case 0xFA: return 0xE09FL;
			case 0xFB: return 0xE0A0L;
			case 0xFC: return 0xE0A1L;
			case 0xFD: return 0xE0A2L;
			case 0xFE: return 0xE0A3L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE0A4;
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE102;
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE160;
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE1BE;
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE21C;
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE27A;
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON56[input - 0xA1];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON57[input - 0xA1];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON58[input - 0xA1];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON59[input - 0xA1];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON60[input - 0xA1];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON61[input - 0xA1];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON62[input - 0xA1];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON63[input - 0xA1];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON64[input - 0xA1];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON65[input - 0xA1];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON66[input - 0xA1];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON67[input - 0xA1];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON68[input - 0xA1];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON69[input - 0xA1];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON70[input - 0xA1];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON71[input - 0xA1];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON72[input - 0xA1];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON73[input - 0xA1];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON74[input - 0xA1];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON75[input - 0xA1];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON76[input - 0xA1];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON77[input - 0xA1];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON78[input - 0xA1];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON79[input - 0xA1];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON80[input - 0xA1];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON81[input - 0xA1];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON82[input - 0xA1];
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON83[input - 0xA1];
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON84[input - 0xA1];
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON85[input - 0xA1];
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON86[input - 0xA1];
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON87[input - 0xA1];
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON88[input - 0xA1];
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON89[input - 0xA1];
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON90[input - 0xA1];
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON91[input - 0xA1];
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON92[input - 0xA1];
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON93[input - 0xA1];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON94[input - 0xA1];
			return 0;
		}
		private static final char[] GETOUTPUT55_A1 = getOutput55_A1();
		private static final char[] getOutput55_A1() {
			return "\u4F4F\u6CE8\u795D\u9A7B\u6293\u722A\u62FD\u4E13\u7816\u8F6C\u64B0\u8D5A\u7BC6\u6869\u5E84\u88C5\u5986\u649E\u58EE\u72B6\u690E\u9525\u8FFD\u8D58\u5760\u7F00\u8C06\u51C6\u6349\u62D9\u5353\u684C\u7422\u8301\u914C\u5544\u7740\u707C\u6D4A\u5179\u54A8\u8D44\u59FF\u6ECB\u6DC4\u5B5C\u7D2B\u4ED4\u7C7D\u6ED3\u5B50\u81EA\u6E0D\u5B57\u9B03\u68D5\u8E2A\u5B97\u7EFC\u603B\u7EB5\u90B9\u8D70\u594F\u63CD\u79DF\u8DB3\u5352\u65CF\u7956\u8BC5\u963B\u7EC4\u94BB\u7E82\u5634\u9189\u6700\u7F6A\u5C0A\u9075\u6628\u5DE6\u4F50\u67DE\u505A\u4F5C\u5750\u5EA7\uE2D8\uE2D9\uE2DA\uE2DB\uE2DC".toCharArray();
		}
		private long getOutput55(int input) {
			if (input >= 0xA1 && input <= 0xFE) return GETOUTPUT55_A1[input - 0xA1];
			return 0;
		}
		private long getOutput56(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON96[input - 0xA1];
			return 0;
		}
		private long getOutput57(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON97[input - 0xA1];
			return 0;
		}
		private long getOutput58(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON98[input - 0xA1];
			return 0;
		}
		private long getOutput59(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON99[input - 0xA1];
			return 0;
		}
		private long getOutput60(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON100[input - 0xA1];
			return 0;
		}
		private long getOutput61(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON101[input - 0xA1];
			return 0;
		}
		private long getOutput62(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON102[input - 0xA1];
			return 0;
		}
		private long getOutput63(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON103[input - 0xA1];
			return 0;
		}
		private long getOutput64(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON104[input - 0xA1];
			return 0;
		}
		private long getOutput65(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON105[input - 0xA1];
			return 0;
		}
		private long getOutput66(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON106[input - 0xA1];
			return 0;
		}
		private long getOutput67(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON107[input - 0xA1];
			return 0;
		}
		private long getOutput68(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON108[input - 0xA1];
			return 0;
		}
		private long getOutput69(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON109[input - 0xA1];
			return 0;
		}
		private long getOutput70(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON110[input - 0xA1];
			return 0;
		}
		private long getOutput71(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON111[input - 0xA1];
			return 0;
		}
		private long getOutput72(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON112[input - 0xA1];
			return 0;
		}
		private long getOutput73(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON113[input - 0xA1];
			return 0;
		}
		private long getOutput74(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON114[input - 0xA1];
			return 0;
		}
		private long getOutput75(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON115[input - 0xA1];
			return 0;
		}
		private long getOutput76(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON116[input - 0xA1];
			return 0;
		}
		private long getOutput77(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON117[input - 0xA1];
			return 0;
		}
		private long getOutput78(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON118[input - 0xA1];
			return 0;
		}
		private long getOutput79(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON119[input - 0xA1];
			return 0;
		}
		private long getOutput80(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON120[input - 0xA1];
			return 0;
		}
		private long getOutput81(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON121[input - 0xA1];
			return 0;
		}
		private long getOutput82(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON122[input - 0xA1];
			return 0;
		}
		private long getOutput83(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON123[input - 0xA1];
			return 0;
		}
		private long getOutput84(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON124[input - 0xA1];
			return 0;
		}
		private long getOutput85(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON125[input - 0xA1];
			return 0;
		}
		private long getOutput86(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON126[input - 0xA1];
			return 0;
		}
		private long getOutput87(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON127[input - 0xA1];
			return 0;
		}
		private long getOutput88(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE2DD;
			return 0;
		}
		private long getOutput89(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE33B;
			return 0;
		}
		private long getOutput90(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE399;
			return 0;
		}
		private long getOutput91(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE3F7;
			return 0;
		}
		private long getOutput92(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE455;
			return 0;
		}
		private long getOutput93(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE4B3;
			return 0;
		}
		private static final char[] GETOUTPUT94_E0 = getOutput94_E0();
		private static final char[] getOutput94_E0() {
			return "\u2170\u2171\u2172\u2173\u2174\u2175\u2176\u2177\u2178\u2179\uFFE2\uFFE4\uFF07\u30FC\uFFE5\u309B\u309C\u30FD\u30FE\u2010\u4EDD\u3006\u3007\u3012\u3231\u2121\u2025\u309D\u309E\u25BD\u25BC".toCharArray();
		}
		private long getOutput94(int input) {
			if (input >= 0xA1 && input <= 0xDF) return input - 0xA1 + 0xE511;
			if (input >= 0xE0 && input <= 0xFE) return GETOUTPUT94_E0[input - 0xE0];
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
			default: return 0;
			}
		}
	}

	private static final class XIBM1383CharsetEncoder extends TableCharsetEncoder {
		private XIBM1383CharsetEncoder(Charset cs) {
			super(cs, 1.98244f, 2f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_2160 = getOutput0_2160();
		private static final char[] getOutput0_2160() {
			return "\uF1A2\uF2A2\uF3A2\uF4A2\uF5A2\uF6A2\uF7A2\uF8A2\uF9A2\uFAA2\uFBA2\uFCA2\u0000\u0000\u0000\u0000\uE0FE\uE1FE\uE2FE\uE3FE\uE4FE\uE5FE\uE6FE\uE7FE\uE8FE\uE9FE".toCharArray();
		}
		private static final char[] GETOUTPUT0_3000 = getOutput0_3000();
		private static final char[] getOutput0_3000() {
			return "\uA1A1\uA2A1\uA3A1\uA8A1\u0000\uA9A1\uF5FE\uF6FE\uB4A1\uB5A1\uB6A1\uB7A1\uB8A1\uB9A1\uBAA1\uBBA1\uBEA1\uBFA1\uF7FE\uFEA1\uB2A1\uB3A1\uBCA1\uBDA1".toCharArray();
		}
		private static final char[] GETOUTPUT0_3041 = getOutput0_3041();
		private static final char[] getOutput0_3041() {
			return "\uA1A4\uA2A4\uA3A4\uA4A4\uA5A4\uA6A4\uA7A4\uA8A4\uA9A4\uAAA4\uABA4\uACA4\uADA4\uAEA4\uAFA4\uB0A4\uB1A4\uB2A4\uB3A4\uB4A4\uB5A4\uB6A4\uB7A4\uB8A4\uB9A4\uBAA4\uBBA4\uBCA4\uBDA4\uBEA4\uBFA4\uC0A4\uC1A4\uC2A4\uC3A4\uC4A4\uC5A4\uC6A4\uC7A4\uC8A4\uC9A4\uCAA4\uCBA4\uCCA4\uCDA4\uCEA4\uCFA4\uD0A4\uD1A4\uD2A4\uD3A4\uD4A4\uD5A4\uD6A4\uD7A4\uD8A4\uD9A4\uDAA4\uDBA4\uDCA4\uDDA4\uDEA4\uDFA4\uE0A4\uE1A4\uE2A4\uE3A4\uE4A4\uE5A4\uE6A4\uE7A4\uE8A4\uE9A4\uEAA4\uEBA4\uECA4\uEDA4\uEEA4\uEFA4\uF0A4\uF1A4\uF2A4\uF3A4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uEFFE\uF0FE\uFBFE\uFCFE\u0000\u0000\uA1A5\uA2A5\uA3A5\uA4A5\uA5A5\uA6A5\uA7A5\uA8A5\uA9A5\uAAA5\uABA5\uACA5\uADA5\uAEA5\uAFA5\uB0A5\uB1A5\uB2A5\uB3A5\uB4A5\uB5A5\uB6A5\uB7A5\uB8A5\uB9A5\uBAA5\uBBA5\uBCA5\uBDA5\uBEA5\uBFA5\uC0A5\uC1A5\uC2A5\uC3A5\uC4A5\uC5A5\uC6A5\uC7A5\uC8A5\uC9A5\uCAA5\uCBA5\uCCA5\uCDA5\uCEA5\uCFA5\uD0A5\uD1A5\uD2A5\uD3A5\uD4A5\uD5A5\uD6A5\uD7A5\uD8A5\uD9A5\uDAA5\uDBA5\uDCA5\uDDA5\uDEA5\uDFA5\uE0A5\uE1A5\uE2A5\uE3A5\uE4A5\uE5A5\uE6A5\uE7A5\uE8A5\uE9A5\uEAA5\uEBA5\uECA5\uEDA5\uEEA5\uEFA5\uF0A5\uF1A5\uF2A5\uF3A5\uF4A5\uF5A5\uF6A5\u0000\u0000\u0000\u0000\uA4A1\uEDFE\uF1FE\uF2FE\u0000\u0000\u0000\u0000\u0000\u0000\uC5A8\uC6A8\uC7A8\uC8A8\uC9A8\uCAA8\uCBA8\uCCA8\uCDA8\uCEA8\uCFA8\uD0A8\uD1A8\uD2A8\uD3A8\uD4A8\uD5A8\uD6A8\uD7A8\uD8A8\uD9A8\uDAA8\uDBA8\uDCA8\uDDA8\uDEA8\uDFA8\uE0A8\uE1A8\uE2A8\uE3A8\uE4A8\uE5A8\uE6A8\uE7A8\uE8A8\uE9A8".toCharArray();
		}
		private static final char[] GETOUTPUT0_8D1D = getOutput0_8D1D();
		private static final char[] getOutput0_8D1D() {
			return "\uB4B1\uEAD5\uBAB8\u0000\uB1B9\uC6B2\uF0D4\uCDCF\uDCB0\uCBD5\uF5BB\uCAD6\uB7B7\uB0CC\uB6C6\uE1B1\uBAB9\uFCD6\uE1B9\uA1B7\uFABC\uDAEA\uDBEA\uF9CC\uF3B9\uDCEA\uFBB4\uB3C3\uD1B7\uD8BA\uDDEA\uF4D4\uDEEA\uD6BC\uDFBB\uDFEA\uDEC1\uB8C2\uDFD4\uCAD7\uE0EA\uE1EA\uE4EA\uE2EA\uE3EA\uDEC9\uB3B8\uC4B6\uE5EA\uEACA\uCDC9\uCDB4\u0000\u0000\uD9E2\uE2C5\uE6EA\uB5C0\u0000\uB8D7\uE7EA\uACD7\uFCC8\uD3D8\uCDD8\uDED4\u0000\uF9D4\uC4C9\uAED3\uD3B8\uE0B3\u0000\uE2C9\uF6F4\u0000\u0000\u0000\uD5BA\u0000\uF7F4\u0000\u0000\uDFD7\u0000\u0000\uF1F4\uB0B8\uD4D5\uCFB8\uF0C6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uC3B3\u0000\u0000\uF2F4\uACB3\u0000\u0000\u0000\u0000\uBDD4\uF7C7\u0000\u0000\u0000\u0000\u0000\uF4F4\u0000\u0000\uF3F4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uCBCC\u0000\u0000\u0000\uA4C8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uF5F4\u0000\uE3D7\uBFC5\uC0F5\u0000\u0000\uBBF5\u0000\uC3F5\u0000\uC2F5\u0000\uBAD6\uC1F5\u0000\u0000\u0000\uBED4\uC4F5\u0000\uCCF5\u0000\u0000\u0000\u0000\uCFB0\uF8B5\u0000\uC9F5\uCAF5\u0000\uDCC5\u0000\u0000\u0000\u0000\uC5F5\uC6F5\u0000\u0000\uC7F5\uCBF5\u0000\uE0BE\uC8F5\uFAB8\u0000\u0000\u0000\uD0F5\uD3F5\u0000\u0000\u0000\uE7BF\u0000\uF2B9\uBCF5\uCDF5\u0000\u0000\uB7C2\u0000\u0000\u0000\uF8CC\u0000\uF9BC\u0000\uCEF5\uCFF5\uD1F5\uE5B6\uD2F5\u0000\uD5F5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uBDF5\u0000\u0000\u0000\uD4F5\uBBD3\u0000\uECB3\u0000\u0000\uA4CC\u0000\u0000\u0000\u0000\uD6F5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uD7F5\uE1BE\uD8F5\u0000\u0000\uDFCC\uDBF5\u0000\u0000\u0000\u0000\u0000\uC8B2\uD9D7\u0000\uD9F5\u0000\uDAF5\uDCF5\u0000\uE2F5\u0000\u0000\u0000\uE0F5\u0000\u0000\u0000\uDFF5\uDDF5\u0000\u0000\uE1F5\u0000\u0000\uDEF5\uE4F5\uE5F5\u0000\uE3CC\u0000\u0000\uBFE5\uB8B5\uE3F5\uE8F5\uA3CC\u0000\u0000\u0000\u0000\u0000\uE6F5\uE7F5\u0000\u0000\u0000\u0000\u0000\u0000\uBEF5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uC4B1\u0000\u0000\uBFF5\u0000\u0000\uC5B5\uE4B2\u0000\uECF5\uE9F5\u0000\uD7B6\u0000\uEDF5\u0000\uEAF5\u0000\u0000\u0000\u0000\u0000\uEBF5\u0000\u0000\uDAB4\u0000\uEAD4\u0000\u0000\u0000\uEEF5\u0000\uF9B3\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uEFF5\uF1F5\u0000\u0000\u0000\uF0F5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uF2F5\u0000\uF3F5\u0000\u0000\u0000\uA4A1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uEDC9\uAAB9\u0000\u0000\uFBC7\u0000\u0000\uE3B6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uC9CC".toCharArray();
		}
		private static final char[] GETOUTPUT0_E000 = getOutput0_E000();
		private static final char[] getOutput0_E000() {
			return "\uA1A2\uA2A2\uA3A2\uA4A2\uA5A2\uA6A2\uA7A2\uA8A2\uA9A2\uAAA2\uABA2\uACA2\uADA2\uAEA2\uAFA2\uB0A2\uE3A2\uE4A2\uEFA2\uF0A2\uFDA2\uFEA2\uF4A4\uF5A4\uF6A4\uF7A4\uF8A4\uF9A4\uFAA4\uFBA4\uFCA4\uFDA4\uFEA4\uF7A5\uF8A5\uF9A5\uFAA5\uFBA5\uFCA5\uFDA5\uFEA5\uB9A6\uBAA6\uBBA6\uBCA6\uBDA6\uBEA6\uBFA6\uC0A6\uD9A6\uDAA6\uDBA6\uDCA6\uDDA6\uDEA6\uDFA6\uE0A6\uE1A6\uE2A6\uE3A6\uE4A6\uE5A6\uE6A6\uE7A6\uE8A6\uE9A6\uEAA6\uEBA6\uECA6\uEDA6\uEEA6\uEFA6\uF0A6\uF1A6\uF2A6\uF3A6\uF4A6\uF5A6\uF6A6\uF7A6\uF8A6\uF9A6\uFAA6\uFBA6\uFCA6\uFDA6\uFEA6\uC2A7\uC3A7\uC4A7\uC5A7\uC6A7\uC7A7\uC8A7\uC9A7\uCAA7\uCBA7\uCCA7\uCDA7\uCEA7\uCFA7\uD0A7\uF2A7\uF3A7\uF4A7\uF5A7\uF6A7\uF7A7\uF8A7\uF9A7\uFAA7\uFBA7\uFCA7\uFDA7\uFEA7\uBBA8\uBCA8\uBDA8\uBEA8\uBFA8\uC0A8\uC1A8\uC2A8\uC3A8\uC4A8\uEAA8\uEBA8\uECA8\uEDA8\uEEA8\uEFA8\uF0A8\uF1A8\uF2A8\uF3A8\uF4A8\uF5A8\uF6A8\uF7A8\uF8A8\uF9A8\uFAA8\uFBA8\uFCA8\uFDA8\uFEA8\uA1A9\uA2A9\uA3A9\uF0A9\uF1A9\uF2A9\uF3A9\uF4A9\uF5A9\uF6A9\uF7A9\uF8A9\uF9A9\uFAA9\uFBA9\uFCA9\uFDA9\uFEA9\uA1AA\uA2AA\uA3AA\uA4AA\uA5AA\uA6AA\uA7AA\uA8AA\uA9AA\uAAAA\uABAA\uACAA\uADAA\uAEAA\uAFAA\uB0AA\uB1AA\uB2AA\uB3AA\uB4AA\uB5AA\uB6AA\uB7AA\uB8AA\uB9AA\uBAAA\uBBAA\uBCAA\uBDAA\uBEAA\uBFAA\uC0AA\uC1AA\uC2AA\uC3AA\uC4AA\uC5AA\uC6AA\uC7AA\uC8AA\uC9AA\uCAAA\uCBAA\uCCAA\uCDAA\uCEAA\uCFAA\uD0AA\uD1AA\uD2AA\uD3AA\uD4AA\uD5AA\uD6AA\uD7AA\uD8AA\uD9AA\uDAAA\uDBAA\uDCAA\uDDAA\uDEAA\uDFAA\uE0AA\uE1AA\uE2AA\uE3AA\uE4AA\uE5AA\uE6AA\uE7AA\uE8AA\uE9AA\uEAAA\uEBAA\uECAA\uEDAA\uEEAA\uEFAA\uF0AA\uF1AA\uF2AA\uF3AA\uF4AA\uF5AA\uF6AA\uF7AA\uF8AA\uF9AA\uFAAA\uFBAA\uFCAA\uFDAA\uFEAA\uA1AB\uA2AB\uA3AB\uA4AB\uA5AB\uA6AB\uA7AB\uA8AB\uA9AB\uAAAB\uABAB\uACAB\uADAB\uAEAB\uAFAB\uB0AB\uB1AB\uB2AB\uB3AB\uB4AB\uB5AB\uB6AB\uB7AB\uB8AB\uB9AB\uBAAB\uBBAB\uBCAB\uBDAB\uBEAB\uBFAB\uC0AB\uC1AB\uC2AB\uC3AB\uC4AB\uC5AB\uC6AB\uC7AB\uC8AB\uC9AB\uCAAB\uCBAB\uCCAB\uCDAB\uCEAB\uCFAB\uD0AB\uD1AB\uD2AB\uD3AB\uD4AB\uD5AB\uD6AB\uD7AB\uD8AB\uD9AB\uDAAB\uDBAB\uDCAB\uDDAB\uDEAB\uDFAB\uE0AB\uE1AB\uE2AB\uE3AB\uE4AB\uE5AB\uE6AB\uE7AB\uE8AB\uE9AB\uEAAB\uEBAB\uECAB\uEDAB\uEEAB\uEFAB\uF0AB\uF1AB\uF2AB\uF3AB\uF4AB\uF5AB\uF6AB\uF7AB\uF8AB\uF9AB\uFAAB\uFBAB\uFCAB\uFDAB\uFEAB\uA1AC\uA2AC\uA3AC\uA4AC\uA5AC\uA6AC\uA7AC\uA8AC\uA9AC\uAAAC\uABAC\uACAC\uADAC\uAEAC\uAFAC\uB0AC\uB1AC\uB2AC\uB3AC\uB4AC\uB5AC\uB6AC\uB7AC\uB8AC\uB9AC\uBAAC\uBBAC\uBCAC\uBDAC\uBEAC\uBFAC\uC0AC\uC1AC\uC2AC\uC3AC\uC4AC\uC5AC\uC6AC\uC7AC\uC8AC\uC9AC\uCAAC\uCBAC\uCCAC\uCDAC\uCEAC\uCFAC\uD0AC\uD1AC\uD2AC\uD3AC\uD4AC\uD5AC\uD6AC\uD7AC\uD8AC\uD9AC\uDAAC\uDBAC\uDCAC\uDDAC\uDEAC\uDFAC\uE0AC\uE1AC\uE2AC\uE3AC\uE4AC\uE5AC\uE6AC\uE7AC\uE8AC\uE9AC\uEAAC\uEBAC\uECAC\uEDAC\uEEAC\uEFAC\uF0AC\uF1AC\uF2AC\uF3AC\uF4AC\uF5AC\uF6AC\uF7AC\uF8AC\uF9AC\uFAAC\uFBAC\uFCAC\uFDAC\uFEAC\uA1AD\uA2AD\uA3AD\uA4AD\uA5AD\uA6AD\uA7AD\uA8AD\uA9AD\uAAAD\uABAD\uACAD\uADAD\uAEAD\uAFAD\uB0AD\uB1AD\uB2AD\uB3AD\uB4AD\uB5AD\uB6AD\uB7AD\uB8AD\uB9AD\uBAAD\uBBAD\uBCAD\uBDAD\uBEAD\uBFAD\uC0AD\uC1AD\uC2AD\uC3AD\uC4AD\uC5AD\uC6AD\uC7AD\uC8AD\uC9AD\uCAAD\uCBAD\uCCAD\uCDAD\uCEAD\uCFAD\uD0AD\uD1AD\uD2AD\uD3AD\uD4AD\uD5AD\uD6AD\uD7AD\uD8AD\uD9AD\uDAAD\uDBAD\uDCAD\uDDAD\uDEAD\uDFAD\uE0AD\uE1AD\uE2AD\uE3AD\uE4AD\uE5AD\uE6AD\uE7AD\uE8AD\uE9AD\uEAAD\uEBAD\uECAD\uEDAD\uEEAD\uEFAD\uF0AD\uF1AD\uF2AD\uF3AD\uF4AD\uF5AD\uF6AD\uF7AD\uF8AD\uF9AD\uFAAD\uFBAD\uFCAD\uFDAD\uFEAD\uA1AE\uA2AE\uA3AE\uA4AE\uA5AE\uA6AE\uA7AE\uA8AE\uA9AE\uAAAE\uABAE\uACAE\uADAE\uAEAE\uAFAE\uB0AE\uB1AE\uB2AE\uB3AE\uB4AE\uB5AE\uB6AE\uB7AE\uB8AE\uB9AE\uBAAE\uBBAE\uBCAE\uBDAE\uBEAE\uBFAE\uC0AE\uC1AE\uC2AE\uC3AE\uC4AE\uC5AE\uC6AE\uC7AE\uC8AE\uC9AE\uCAAE\uCBAE\uCCAE\uCDAE\uCEAE\uCFAE\uD0AE\uD1AE\uD2AE\uD3AE\uD4AE\uD5AE\uD6AE\uD7AE\uD8AE\uD9AE\uDAAE\uDBAE\uDCAE\uDDAE\uDEAE\uDFAE\uE0AE\uE1AE\uE2AE\uE3AE\uE4AE\uE5AE\uE6AE\uE7AE\uE8AE\uE9AE\uEAAE\uEBAE\uECAE\uEDAE\uEEAE\uEFAE\uF0AE\uF1AE\uF2AE\uF3AE\uF4AE\uF5AE\uF6AE\uF7AE\uF8AE\uF9AE\uFAAE\uFBAE\uFCAE\uFDAE\uFEAE\uA1AF\uA2AF\uA3AF\uA4AF\uA5AF\uA6AF\uA7AF\uA8AF\uA9AF\uAAAF\uABAF\uACAF\uADAF\uAEAF\uAFAF\uB0AF\uB1AF\uB2AF\uB3AF\uB4AF\uB5AF\uB6AF\uB7AF\uB8AF\uB9AF\uBAAF\uBBAF\uBCAF\uBDAF\uBEAF\uBFAF\uC0AF\uC1AF\uC2AF\uC3AF\uC4AF\uC5AF\uC6AF\uC7AF\uC8AF\uC9AF\uCAAF\uCBAF\uCCAF\uCDAF\uCEAF\uCFAF\uD0AF\uD1AF\uD2AF\uD3AF\uD4AF\uD5AF\uD6AF\uD7AF\uD8AF\uD9AF\uDAAF\uDBAF\uDCAF\uDDAF\uDEAF\uDFAF\uE0AF\uE1AF\uE2AF\uE3AF\uE4AF\uE5AF\uE6AF\uE7AF\uE8AF\uE9AF\uEAAF\uEBAF\uECAF\uEDAF\uEEAF\uEFAF\uF0AF\uF1AF\uF2AF\uF3AF\uF4AF\uF5AF\uF6AF\uF7AF\uF8AF\uF9AF\uFAAF\uFBAF\uFCAF\uFDAF\uFEAF\uFAD7\uFBD7\uFCD7\uFDD7\uFED7\uA1F8\uA2F8\uA3F8\uA4F8\uA5F8\uA6F8\uA7F8\uA8F8\uA9F8\uAAF8\uABF8\uACF8\uADF8\uAEF8\uAFF8\uB0F8\uB1F8\uB2F8\uB3F8\uB4F8\uB5F8\uB6F8\uB7F8\uB8F8\uB9F8\uBAF8\uBBF8\uBCF8\uBDF8\uBEF8\uBFF8\uC0F8\uC1F8\uC2F8\uC3F8\uC4F8\uC5F8\uC6F8\uC7F8\uC8F8\uC9F8\uCAF8\uCBF8\uCCF8\uCDF8\uCEF8\uCFF8\uD0F8\uD1F8\uD2F8\uD3F8\uD4F8\uD5F8\uD6F8\uD7F8\uD8F8\uD9F8\uDAF8\uDBF8\uDCF8\uDDF8\uDEF8\uDFF8\uE0F8\uE1F8\uE2F8\uE3F8\uE4F8\uE5F8\uE6F8\uE7F8\uE8F8\uE9F8\uEAF8\uEBF8\uECF8\uEDF8\uEEF8\uEFF8\uF0F8\uF1F8\uF2F8\uF3F8\uF4F8\uF5F8\uF6F8\uF7F8\uF8F8\uF9F8\uFAF8\uFBF8\uFCF8\uFDF8\uFEF8\uA1F9\uA2F9\uA3F9\uA4F9\uA5F9\uA6F9\uA7F9\uA8F9\uA9F9\uAAF9\uABF9\uACF9\uADF9\uAEF9\uAFF9\uB0F9\uB1F9\uB2F9\uB3F9\uB4F9\uB5F9\uB6F9\uB7F9\uB8F9\uB9F9\uBAF9\uBBF9\uBCF9\uBDF9\uBEF9\uBFF9\uC0F9\uC1F9\uC2F9\uC3F9\uC4F9\uC5F9\uC6F9\uC7F9\uC8F9\uC9F9\uCAF9\uCBF9\uCCF9\uCDF9\uCEF9\uCFF9\uD0F9\uD1F9\uD2F9\uD3F9\uD4F9\uD5F9\uD6F9\uD7F9\uD8F9\uD9F9\uDAF9\uDBF9\uDCF9\uDDF9\uDEF9\uDFF9\uE0F9\uE1F9\uE2F9\uE3F9\uE4F9\uE5F9\uE6F9\uE7F9\uE8F9\uE9F9\uEAF9\uEBF9\uECF9\uEDF9\uEEF9\uEFF9\uF0F9\uF1F9\uF2F9\uF3F9\uF4F9\uF5F9\uF6F9\uF7F9\uF8F9\uF9F9\uFAF9\uFBF9\uFCF9\uFDF9\uFEF9\uA1FA\uA2FA\uA3FA\uA4FA\uA5FA\uA6FA\uA7FA\uA8FA\uA9FA\uAAFA\uABFA\uACFA\uADFA\uAEFA\uAFFA\uB0FA\uB1FA\uB2FA\uB3FA\uB4FA\uB5FA\uB6FA\uB7FA\uB8FA\uB9FA\uBAFA\uBBFA\uBCFA\uBDFA\uBEFA\uBFFA\uC0FA\uC1FA\uC2FA\uC3FA\uC4FA\uC5FA\uC6FA\uC7FA\uC8FA\uC9FA\uCAFA\uCBFA\uCCFA\uCDFA\uCEFA\uCFFA\uD0FA\uD1FA\uD2FA\uD3FA\uD4FA\uD5FA\uD6FA\uD7FA\uD8FA\uD9FA\uDAFA\uDBFA\uDCFA\uDDFA\uDEFA\uDFFA\uE0FA\uE1FA\uE2FA\uE3FA\uE4FA\uE5FA\uE6FA\uE7FA\uE8FA\uE9FA\uEAFA\uEBFA\uECFA\uEDFA\uEEFA\uEFFA\uF0FA\uF1FA\uF2FA\uF3FA\uF4FA\uF5FA\uF6FA\uF7FA\uF8FA\uF9FA\uFAFA\uFBFA\uFCFA\uFDFA\uFEFA\uA1FB\uA2FB\uA3FB\uA4FB\uA5FB\uA6FB\uA7FB\uA8FB\uA9FB\uAAFB\uABFB\uACFB\uADFB\uAEFB\uAFFB\uB0FB\uB1FB\uB2FB\uB3FB\uB4FB\uB5FB\uB6FB\uB7FB\uB8FB\uB9FB\uBAFB\uBBFB\uBCFB\uBDFB\uBEFB\uBFFB\uC0FB\uC1FB\uC2FB\uC3FB\uC4FB\uC5FB\uC6FB\uC7FB\uC8FB\uC9FB\uCAFB\uCBFB\uCCFB\uCDFB\uCEFB\uCFFB\uD0FB\uD1FB\uD2FB\uD3FB\uD4FB\uD5FB\uD6FB\uD7FB\uD8FB\uD9FB\uDAFB\uDBFB\uDCFB\uDDFB\uDEFB\uDFFB\uE0FB\uE1FB\uE2FB\uE3FB\uE4FB\uE5FB\uE6FB\uE7FB\uE8FB\uE9FB\uEAFB\uEBFB\uECFB\uEDFB\uEEFB\uEFFB\uF0FB\uF1FB\uF2FB\uF3FB\uF4FB\uF5FB\uF6FB\uF7FB\uF8FB\uF9FB\uFAFB\uFBFB\uFCFB\uFDFB\uFEFB\uA1FC\uA2FC\uA3FC\uA4FC\uA5FC\uA6FC\uA7FC\uA8FC\uA9FC\uAAFC\uABFC\uACFC\uADFC\uAEFC\uAFFC\uB0FC\uB1FC\uB2FC\uB3FC\uB4FC\uB5FC\uB6FC\uB7FC\uB8FC\uB9FC\uBAFC\uBBFC\uBCFC\uBDFC\uBEFC\uBFFC\uC0FC\uC1FC\uC2FC\uC3FC\uC4FC\uC5FC\uC6FC\uC7FC\uC8FC\uC9FC\uCAFC\uCBFC\uCCFC\uCDFC\uCEFC\uCFFC\uD0FC\uD1FC\uD2FC\uD3FC\uD4FC\uD5FC\uD6FC\uD7FC\uD8FC\uD9FC\uDAFC\uDBFC\uDCFC\uDDFC\uDEFC\uDFFC\uE0FC\uE1FC\uE2FC\uE3FC\uE4FC\uE5FC\uE6FC\uE7FC\uE8FC\uE9FC\uEAFC\uEBFC\uECFC\uEDFC\uEEFC\uEFFC\uF0FC\uF1FC\uF2FC\uF3FC\uF4FC\uF5FC\uF6FC\uF7FC\uF8FC\uF9FC\uFAFC\uFBFC\uFCFC\uFDFC\uFEFC\uA1FD\uA2FD\uA3FD\uA4FD\uA5FD\uA6FD\uA7FD\uA8FD\uA9FD\uAAFD\uABFD\uACFD\uADFD\uAEFD\uAFFD\uB0FD\uB1FD\uB2FD\uB3FD\uB4FD\uB5FD\uB6FD\uB7FD\uB8FD\uB9FD\uBAFD\uBBFD\uBCFD\uBDFD\uBEFD\uBFFD\uC0FD\uC1FD\uC2FD\uC3FD\uC4FD\uC5FD\uC6FD\uC7FD\uC8FD\uC9FD\uCAFD\uCBFD\uCCFD\uCDFD\uCEFD\uCFFD\uD0FD\uD1FD\uD2FD\uD3FD\uD4FD\uD5FD\uD6FD\uD7FD\uD8FD\uD9FD\uDAFD\uDBFD\uDCFD\uDDFD\uDEFD\uDFFD\uE0FD\uE1FD\uE2FD\uE3FD\uE4FD\uE5FD\uE6FD\uE7FD\uE8FD\uE9FD\uEAFD\uEBFD\uECFD\uEDFD\uEEFD\uEFFD\uF0FD\uF1FD\uF2FD\uF3FD\uF4FD\uF5FD\uF6FD\uF7FD\uF8FD\uF9FD\uFAFD\uFBFD\uFCFD\uFDFD\uFEFD\uA1FE\uA2FE\uA3FE\uA4FE\uA5FE\uA6FE\uA7FE\uA8FE\uA9FE\uAAFE\uABFE\uACFE\uADFE\uAEFE\uAFFE\uB0FE\uB1FE\uB2FE\uB3FE\uB4FE\uB5FE\uB6FE\uB7FE\uB8FE\uB9FE\uBAFE\uBBFE\uBCFE\uBDFE\uBEFE\uBFFE\uC0FE\uC1FE\uC2FE\uC3FE\uC4FE\uC5FE\uC6FE\uC7FE\uC8FE\uC9FE\uCAFE\uCBFE\uCCFE\uCDFE\uCEFE\uCFFE\uD0FE\uD1FE\uD2FE\uD3FE\uD4FE\uD5FE\uD6FE\uD7FE\uD8FE\uD9FE\uDAFE\uDBFE\uDCFE\uDDFE\uDEFE\uDFFE".toCharArray();
		}
		private static final char[] GETOUTPUT0_FF01 = getOutput0_FF01();
		private static final char[] getOutput0_FF01() {
			return "\uA1A3\uA2A3\uA3A3\uE7A1\uA5A3\uA6A3\uECFE\uA8A3\uA9A3\uAAA3\uABA3\uACA3\uADA3\uAEA3\uAFA3\uB0A3\uB1A3\uB2A3\uB3A3\uB4A3\uB5A3\uB6A3\uB7A3\uB8A3\uB9A3\uBAA3\uBBA3\uBCA3\uBDA3\uBEA3\uBFA3\uC0A3\uC1A3\uC2A3\uC3A3\uC4A3\uC5A3\uC6A3\uC7A3\uC8A3\uC9A3\uCAA3\uCBA3\uCCA3\uCDA3\uCEA3\uCFA3\uD0A3\uD1A3\uD2A3\uD3A3\uD4A3\uD5A3\uD6A3\uD7A3\uD8A3\uD9A3\uDAA3\uDBA3\uDCA3\uDDA3\uDEA3\uDFA3\uE0A3\uE1A3\uE2A3\uE3A3\uE4A3\uE5A3\uE6A3\uE7A3\uE8A3\uE9A3\uEAA3\uEBA3\uECA3\uEDA3\uEEA3\uEFA3\uF0A3\uF1A3\uF2A3\uF3A3\uF4A3\uF5A3\uF6A3\uF7A3\uF8A3\uF9A3\uFAA3\uFBA3\uFCA3\uFDA3\uABA1".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x8D) return input - 0x20 + 0x20;
			if (input >= 0x90 && input <= 0x9F) return input - 0x90 + 0x90;
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON128[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON129[input - 0x401];
			if (input >= 0x2160 && input <= 0x2179) return GETOUTPUT0_2160[input - 0x2160];
			if (input >= 0x2208 && input <= 0x224C) return CommonSubtables.COMMON130[input - 0x2208];
			if (input >= 0x2460 && input <= 0x249B) return CommonSubtables.COMMON131[input - 0x2460];
			if (input >= 0x2500 && input <= 0x254B) return CommonSubtables.COMMON132[input - 0x2500];
			if (input >= 0x3000 && input <= 0x3017) return GETOUTPUT0_3000[input - 0x3000];
			if (input >= 0x3041 && input <= 0x3129) return GETOUTPUT0_3041[input - 0x3041];
			if (input >= 0x4E00 && input <= 0x508D) return CommonSubtables.COMMON133[input - 0x4E00];
			if (input >= 0x50CF && input <= 0x5121) return CommonSubtables.COMMON134[input - 0x50CF];
			if (input >= 0x513F && input <= 0x570A) return CommonSubtables.COMMON135[input - 0x513F];
			if (input >= 0x571C && input <= 0x586C) return CommonSubtables.COMMON136[input - 0x571C];
			if (input >= 0x58BC && input <= 0x5A7F) return CommonSubtables.COMMON137[input - 0x58BC];
			if (input >= 0x5A92 && input <= 0x5AF1) return CommonSubtables.COMMON138[input - 0x5A92];
			if (input >= 0x5B32 && input <= 0x5D82) return CommonSubtables.COMMON139[input - 0x5B32];
			if (input >= 0x5DB7 && input <= 0x612B) return CommonSubtables.COMMON140[input - 0x5DB7];
			if (input >= 0x618B && input <= 0x61D4) return CommonSubtables.COMMON141[input - 0x618B];
			if (input >= 0x61E6 && input <= 0x64E6) return CommonSubtables.COMMON142[input - 0x61E6];
			if (input >= 0x6500 && input <= 0x66BE) return CommonSubtables.COMMON143[input - 0x6500];
			if (input >= 0x66D9 && input <= 0x6942) return CommonSubtables.COMMON144[input - 0x66D9];
			if (input >= 0x6954 && input <= 0x6AAC) return CommonSubtables.COMMON145[input - 0x6954];
			if (input >= 0x6B20 && input <= 0x6FEF) return CommonSubtables.COMMON146[input - 0x6B20];
			if (input >= 0x704C && input <= 0x7206) return CommonSubtables.COMMON147[input - 0x704C];
			if (input >= 0x721D && input <= 0x7441) return CommonSubtables.COMMON148[input - 0x721D];
			if (input >= 0x7455 && input <= 0x74BA) return CommonSubtables.COMMON149[input - 0x7455];
			if (input >= 0x74D2 && input <= 0x7A57) return CommonSubtables.COMMON150[input - 0x74D2];
			if (input >= 0x7A70 && input <= 0x7C4D) return CommonSubtables.COMMON169[input - 0x7A70];
			if (input >= 0x7C73 && input <= 0x7D0A) return CommonSubtables.COMMON151[input - 0x7C73];
			if (input >= 0x7E9B && input <= 0x81CC) return CommonSubtables.COMMON152[input - 0x7E9B];
			if (input >= 0x81E3 && input <= 0x85E9) return CommonSubtables.COMMON153[input - 0x81E3];
			if (input >= 0x85FB && input <= 0x8944) return CommonSubtables.COMMON154[input - 0x85FB];
			if (input >= 0x89C1 && input <= 0x8A07) return CommonSubtables.COMMON155[input - 0x89C1];
			if (input >= 0x8BA0 && input <= 0x8C98) return CommonSubtables.COMMON156[input - 0x8BA0];
			if (input >= 0x8D1D && input <= 0x8EBA) return GETOUTPUT0_8D1D[input - 0x8D1D];
			if (input >= 0x8F66 && input <= 0x9104) return CommonSubtables.COMMON158[input - 0x8F66];
			if (input >= 0x9119 && input <= 0x91DC) return CommonSubtables.COMMON159[input - 0x9119];
			if (input >= 0x9485 && input <= 0x957F) return CommonSubtables.COMMON160[input - 0x9485];
			if (input >= 0x95E8 && input <= 0x973E) return CommonSubtables.COMMON161[input - 0x95E8];
			if (input >= 0x9752 && input <= 0x97B4) return CommonSubtables.COMMON162[input - 0x9752];
			if (input >= 0x9875 && input <= 0x98A7) return CommonSubtables.COMMON163[input - 0x9875];
			if (input >= 0x9954 && input <= 0x99A8) return CommonSubtables.COMMON164[input - 0x9954];
			if (input >= 0x9A6C && input <= 0x9B54) return CommonSubtables.COMMON165[input - 0x9A6C];
			if (input >= 0x9C7C && input <= 0x9CE2) return CommonSubtables.COMMON166[input - 0x9C7C];
			if (input >= 0x9E1F && input <= 0x9F51) return CommonSubtables.COMMON167[input - 0x9E1F];
			if (input >= 0x9F7F && input <= 0x9FA0) return CommonSubtables.COMMON168[input - 0x9F7F];
			if (input >= 0xE000 && input <= 0xE54F) return GETOUTPUT0_E000[input - 0xE000];
			if (input >= 0xFF01 && input <= 0xFF5E) return GETOUTPUT0_FF01[input - 0xFF01];
			switch (input) {
			case 0xA4: return 0xE8A1L;
			case 0xA7: return 0xECA1L;
			case 0xA8: return 0xA7A1L;
			case 0xB0: return 0xE3A1L;
			case 0xB1: return 0xC0A1L;
			case 0xB4: return 0xA7A3L;
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
			case 0x2C7: return 0xA6A1L;
			case 0x2C9: return 0xA5A1L;
			case 0x2010: return 0xF3FEL;
			case 0x2014: return 0xAAA1L;
			case 0x2015: return 0xAAA1L;
			case 0x2016: return 0xACA1L;
			case 0x2018: return 0xAEA1L;
			case 0x2019: return 0xAFA1L;
			case 0x201C: return 0xB0A1L;
			case 0x201D: return 0xB1A1L;
			case 0x2025: return 0xFAFEL;
			case 0x2026: return 0xADA1L;
			case 0x2030: return 0xEBA1L;
			case 0x2032: return 0xE4A1L;
			case 0x2033: return 0xE5A1L;
			case 0x203B: return 0xF9A1L;
			case 0x2103: return 0xE6A1L;
			case 0x2116: return 0xEDA1L;
			case 0x2121: return 0xF9FEL;
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
			case 0x2312: return 0xD0A1L;
			case 0x25A0: return 0xF6A1L;
			case 0x25A1: return 0xF5A1L;
			case 0x25B2: return 0xF8A1L;
			case 0x25B3: return 0xF7A1L;
			case 0x25BC: return 0xFEFEL;
			case 0x25BD: return 0xFDFEL;
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
			case 0x3231: return 0xF8FEL;
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
			case 0xF83D: return 0xA4A3L;
			case 0xF83E: return 0xDAD9L;
			case 0xFFE0: return 0xE9A1L;
			case 0xFFE1: return 0xEAA1L;
			case 0xFFE2: return 0xEAFEL;
			case 0xFFE3: return 0xFEA3L;
			case 0xFFE4: return 0xEBFEL;
			case 0xFFE5: return 0xA4A3L;
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
