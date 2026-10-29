package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1381Charset extends Charset {
	public XIBM1381Charset() {
		super("x-IBM1381", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1381CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1381CharsetEncoder(this);
	}

	private static final class XIBM1381CharsetDecoder extends TableCharsetDecoder {
		private XIBM1381CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0x8C && input <= 0xA9) return input - 0x8C + 0x1;
			if (input >= 0xB0 && input <= 0xF7) return input - 0xB0 + 0x1F;
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
			switch (input) {
			case 0x80: return 0xA3L;
			case 0x81: return 0xACL;
			case 0x82: return 0xA5L;
			case 0x83: return 0x203EL;
			case 0x84: return 0xA6L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_E0 = getOutput1_E0();
		private static final char[] getOutput1_E0() {
			return "\u2170\u2171\u2172\u2173\u2174\u2175\u2176\u2177\u2178\u2179\uFFE2\uFFE4\uFF07\u30FC\uF83D\u309B\u309C\u30FD\u30FE\u2010\uF83E\u3006\u3007\u3012\u3231\u2121\u2025\u309D\u309E\u25BD\u25BC".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xE0 && input <= 0xFE) return GETOUTPUT1_E0[input - 0xE0];
			return 0;
		}
		private long getOutput2(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE000;
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE05E;
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE0BC;
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE11A;
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE178;
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE1D6;
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE234;
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE292;
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE2F0;
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE34E;
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE3AC;
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE40A;
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE468;
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE4C6;
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE524;
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE582;
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE5E0;
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE63E;
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE69C;
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE6FA;
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON59[input - 0xA1];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0xB1 && input <= 0xC4) return input - 0xB1 + 0x2488;
			if (input >= 0xC5 && input <= 0xD8) return input - 0xC5 + 0x2474;
			if (input >= 0xD9 && input <= 0xFC) return CommonSubtables.COMMON60[input - 0xD9];
			return 0;
		}
		private long getOutput24(int input) {
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
		private long getOutput25(int input) {
			if (input >= 0xA1 && input <= 0xF3) return input - 0xA1 + 0x3041;
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0xA1 && input <= 0xF6) return input - 0xA1 + 0x30A1;
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0xA1 && input <= 0xB1) return input - 0xA1 + 0x391;
			if (input >= 0xC1 && input <= 0xD1) return input - 0xC1 + 0x3B1;
			switch (input) {
			case 0xB2: return 0x3A3L;
			case 0xB3: return 0x3A4L;
			case 0xB4: return 0x3A5L;
			case 0xB5: return 0x3A6L;
			case 0xB6: return 0x3A7L;
			case 0xB7: return 0x3A8L;
			case 0xB8: return 0x3A9L;
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
		private long getOutput28(int input) {
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
		private static final char[] GETOUTPUT29_A1 = getOutput29_A1();
		private static final char[] getOutput29_A1() {
			return "\u0101\u00E1\u01CE\u00E0\u0113\u00E9\u011B\u00E8\u012B\u00ED\u01D0\u00EC\u014D\u00F3\u01D2\u00F2\u016B\u00FA\u01D4\u00F9\u01D6\u01D8\u01DA\u01DC\u00FC\u00EA".toCharArray();
		}
		private long getOutput29(int input) {
			if (input >= 0xC5 && input <= 0xE9) return input - 0xC5 + 0x3105;
			if (input >= 0xA1 && input <= 0xBA) return GETOUTPUT29_A1[input - 0xA1];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0xA4 && input <= 0xEF) return input - 0xA4 + 0x2500;
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON61[input - 0xA1];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON62[input - 0xA1];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON63[input - 0xA1];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON64[input - 0xA1];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON65[input - 0xA1];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON66[input - 0xA1];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON67[input - 0xA1];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON68[input - 0xA1];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON69[input - 0xA1];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON70[input - 0xA1];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON71[input - 0xA1];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON72[input - 0xA1];
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON73[input - 0xA1];
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON74[input - 0xA1];
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON75[input - 0xA1];
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON76[input - 0xA1];
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON77[input - 0xA1];
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON78[input - 0xA1];
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON79[input - 0xA1];
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON80[input - 0xA1];
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON81[input - 0xA1];
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON82[input - 0xA1];
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON83[input - 0xA1];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON84[input - 0xA1];
			return 0;
		}
		private long getOutput55(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON85[input - 0xA1];
			return 0;
		}
		private long getOutput56(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON86[input - 0xA1];
			return 0;
		}
		private long getOutput57(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON87[input - 0xA1];
			return 0;
		}
		private long getOutput58(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON88[input - 0xA1];
			return 0;
		}
		private long getOutput59(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON89[input - 0xA1];
			return 0;
		}
		private long getOutput60(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON90[input - 0xA1];
			return 0;
		}
		private long getOutput61(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON91[input - 0xA1];
			return 0;
		}
		private long getOutput62(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON92[input - 0xA1];
			return 0;
		}
		private long getOutput63(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON93[input - 0xA1];
			return 0;
		}
		private long getOutput64(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON94[input - 0xA1];
			return 0;
		}
		private long getOutput65(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON95[input - 0xA1];
			return 0;
		}
		private long getOutput66(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON96[input - 0xA1];
			return 0;
		}
		private long getOutput67(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON97[input - 0xA1];
			return 0;
		}
		private long getOutput68(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON98[input - 0xA1];
			return 0;
		}
		private long getOutput69(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON99[input - 0xA1];
			return 0;
		}
		private long getOutput70(int input) {
			if (input >= 0xA1 && input <= 0xF9) return CommonSubtables.COMMON100[input - 0xA1];
			return 0;
		}
		private long getOutput71(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON101[input - 0xA1];
			return 0;
		}
		private long getOutput72(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON102[input - 0xA1];
			return 0;
		}
		private long getOutput73(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON103[input - 0xA1];
			return 0;
		}
		private long getOutput74(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON104[input - 0xA1];
			return 0;
		}
		private long getOutput75(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON105[input - 0xA1];
			return 0;
		}
		private long getOutput76(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON106[input - 0xA1];
			return 0;
		}
		private long getOutput77(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON107[input - 0xA1];
			return 0;
		}
		private long getOutput78(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON108[input - 0xA1];
			return 0;
		}
		private long getOutput79(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON109[input - 0xA1];
			return 0;
		}
		private long getOutput80(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON110[input - 0xA1];
			return 0;
		}
		private long getOutput81(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON111[input - 0xA1];
			return 0;
		}
		private long getOutput82(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON112[input - 0xA1];
			return 0;
		}
		private long getOutput83(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON113[input - 0xA1];
			return 0;
		}
		private long getOutput84(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON114[input - 0xA1];
			return 0;
		}
		private long getOutput85(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON115[input - 0xA1];
			return 0;
		}
		private long getOutput86(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON116[input - 0xA1];
			return 0;
		}
		private long getOutput87(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON117[input - 0xA1];
			return 0;
		}
		private long getOutput88(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON118[input - 0xA1];
			return 0;
		}
		private long getOutput89(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON119[input - 0xA1];
			return 0;
		}
		private long getOutput90(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON120[input - 0xA1];
			return 0;
		}
		private long getOutput91(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON121[input - 0xA1];
			return 0;
		}
		private long getOutput92(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON122[input - 0xA1];
			return 0;
		}
		private long getOutput93(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON123[input - 0xA1];
			return 0;
		}
		private long getOutput94(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON124[input - 0xA1];
			return 0;
		}
		private long getOutput95(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON125[input - 0xA1];
			return 0;
		}
		private long getOutput96(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON126[input - 0xA1];
			return 0;
		}
		private long getOutput97(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON127[input - 0xA1];
			return 0;
		}
		private long getOutput98(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON128[input - 0xA1];
			return 0;
		}
		private long getOutput99(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON129[input - 0xA1];
			return 0;
		}
		private long getOutput100(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON130[input - 0xA1];
			return 0;
		}
		private long getOutput101(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON131[input - 0xA1];
			return 0;
		}
		private long getOutput102(int input) {
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
			default: return 0;
			}
		}
	}

	private static final class XIBM1381CharsetEncoder extends TableCharsetEncoder {
		private XIBM1381CharsetEncoder(Charset cs) {
			super(cs, 1.98599f, 2f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_2160 = getOutput0_2160();
		private static final char[] getOutput0_2160() {
			return "\uF1A2\uF2A2\uF3A2\uF4A2\uF5A2\uF6A2\uF7A2\uF8A2\uF9A2\uFAA2\uFBA2\uFCA2\u0000\u0000\u0000\u0000\uE08C\uE18C\uE28C\uE38C\uE48C\uE58C\uE68C\uE78C\uE88C\uE98C".toCharArray();
		}
		private static final char[] GETOUTPUT0_3000 = getOutput0_3000();
		private static final char[] getOutput0_3000() {
			return "\uA1A1\uA2A1\uA3A1\uA8A1\u0000\uA9A1\uF58C\uF68C\uB4A1\uB5A1\uB6A1\uB7A1\uB8A1\uB9A1\uBAA1\uBBA1\uBEA1\uBFA1\uF78C\uFEA1\uB2A1\uB3A1\uBCA1\uBDA1".toCharArray();
		}
		private static final char[] GETOUTPUT0_3041 = getOutput0_3041();
		private static final char[] getOutput0_3041() {
			return "\uA1A4\uA2A4\uA3A4\uA4A4\uA5A4\uA6A4\uA7A4\uA8A4\uA9A4\uAAA4\uABA4\uACA4\uADA4\uAEA4\uAFA4\uB0A4\uB1A4\uB2A4\uB3A4\uB4A4\uB5A4\uB6A4\uB7A4\uB8A4\uB9A4\uBAA4\uBBA4\uBCA4\uBDA4\uBEA4\uBFA4\uC0A4\uC1A4\uC2A4\uC3A4\uC4A4\uC5A4\uC6A4\uC7A4\uC8A4\uC9A4\uCAA4\uCBA4\uCCA4\uCDA4\uCEA4\uCFA4\uD0A4\uD1A4\uD2A4\uD3A4\uD4A4\uD5A4\uD6A4\uD7A4\uD8A4\uD9A4\uDAA4\uDBA4\uDCA4\uDDA4\uDEA4\uDFA4\uE0A4\uE1A4\uE2A4\uE3A4\uE4A4\uE5A4\uE6A4\uE7A4\uE8A4\uE9A4\uEAA4\uEBA4\uECA4\uEDA4\uEEA4\uEFA4\uF0A4\uF1A4\uF2A4\uF3A4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uEF8C\uF08C\uFB8C\uFC8C\u0000\u0000\uA1A5\uA2A5\uA3A5\uA4A5\uA5A5\uA6A5\uA7A5\uA8A5\uA9A5\uAAA5\uABA5\uACA5\uADA5\uAEA5\uAFA5\uB0A5\uB1A5\uB2A5\uB3A5\uB4A5\uB5A5\uB6A5\uB7A5\uB8A5\uB9A5\uBAA5\uBBA5\uBCA5\uBDA5\uBEA5\uBFA5\uC0A5\uC1A5\uC2A5\uC3A5\uC4A5\uC5A5\uC6A5\uC7A5\uC8A5\uC9A5\uCAA5\uCBA5\uCCA5\uCDA5\uCEA5\uCFA5\uD0A5\uD1A5\uD2A5\uD3A5\uD4A5\uD5A5\uD6A5\uD7A5\uD8A5\uD9A5\uDAA5\uDBA5\uDCA5\uDDA5\uDEA5\uDFA5\uE0A5\uE1A5\uE2A5\uE3A5\uE4A5\uE5A5\uE6A5\uE7A5\uE8A5\uE9A5\uEAA5\uEBA5\uECA5\uEDA5\uEEA5\uEFA5\uF0A5\uF1A5\uF2A5\uF3A5\uF4A5\uF5A5\uF6A5\u0000\u0000\u0000\u0000\uA4A1\uED8C\uF18C\uF28C\u0000\u0000\u0000\u0000\u0000\u0000\uC5A8\uC6A8\uC7A8\uC8A8\uC9A8\uCAA8\uCBA8\uCCA8\uCDA8\uCEA8\uCFA8\uD0A8\uD1A8\uD2A8\uD3A8\uD4A8\uD5A8\uD6A8\uD7A8\uD8A8\uD9A8\uDAA8\uDBA8\uDCA8\uDDA8\uDEA8\uDFA8\uE0A8\uE1A8\uE2A8\uE3A8\uE4A8\uE5A8\uE6A8\uE7A8\uE8A8\uE9A8".toCharArray();
		}
		private static final char[] GETOUTPUT0_7A70 = getOutput0_7A70();
		private static final char[] getOutput0_7A70() {
			return "\uA6F0\u0000\u0000\u0000\uA8D1\u0000\uBFBE\uEEC7\uB6F1\uB7F1\uD5BF\u0000\u0000\u0000\u0000\uA9B4\uB8F1\uBBCD\u0000\uD4C7\uADD5\u0000\uB9F1\u0000\uBAF1\u0000\u0000\u0000\u0000\uCFC7\u0000\u0000\u0000\uA4D2\uCFD6\u0000\u0000\uBBF1\uD1BD\uB0B4\uBDBE\u0000\u0000\u0000\uDCB4\uD1CE\u0000\uDFBF\uBDF1\u0000\u0000\u0000\u0000\uFABF\uBCF1\u0000\uBFF1\u0000\u0000\u0000\uBEF1\uC0F1\u0000\u0000\u0000\u0000\u0000\uC1F1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uFEC1\u0000\u0000\uA4A1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA2C1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uFACA\u0000\u0000\uBED5\u0000\u0000\u0000\u0000\uBABE\uB9BE\uC2D5\u0000\u0000\uA2BF\u0000\uAFCD\uB5F1\u0000\u0000\u0000\u0000\u0000\u0000\uDFBD\u0000\uCBB6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uF1D6\uC3F3\u0000\u0000\uC4F3\u0000\uCDB8\u0000\u0000\u0000\uC6F3\uC7F3\u0000\uCAB0\u0000\uC5F3\u0000\uC9F3\uF1CB\u0000\u0000\u0000\uCBF3\u0000\uA6D0\u0000\u0000\uCAB1\uC8F3\u0000\u0000\u0000\uCFF3\u0000\uD1B5\u0000\u0000\uD7F3\u0000\uD2F3\u0000\u0000\u0000\uD4F3\uD3F3\uFBB7\u0000\uBFB1\u0000\uCEF3\uCAF3\uDAB5\u0000\uD0F3\u0000\u0000\uD1F3\u0000\uD5F3\u0000\u0000\u0000\u0000\uCDF3\u0000\uE3BC\u0000\uFDC1\u0000\uD6F3\u0000\u0000\u0000\u0000\u0000\u0000\uDAF3\u0000\uCCF3\u0000\uC8B5\u0000\uEEBD\uDCF3\u0000\u0000\uA4B7\uF0BF\uFED6\uB2CD\u0000\uF0B4\u0000\uDFB2\u0000\uD8F3\u0000\uD9F3\uB8C9\u0000\uDDF3\u0000\u0000\uDEF3\u0000\uE1F3\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uDFF3\u0000\u0000\uE3F3\uE2F3\u0000\u0000\uDBF3\u0000\uEABF\u0000\uEFB3\u0000\uE0F3\u0000\u0000\uA9C7\u0000\uF2BC\u0000\u0000\u0000\u0000\uEBF3\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uBFB9\u0000\u0000\uE4F3\u0000\u0000\u0000\uADB2\uFEBB\u0000\uE3CB\u0000\u0000\u0000\u0000\uEDF3\uE9F3\u0000\u0000\u0000\uDCB9\uEEF3\u0000\u0000\u0000\uE5F3\uE6F3\uEAF3\uE1C2\uECF3\uEFF3\uE8F3\uFDBC\u0000\u0000\u0000\uE4CF\u0000\u0000\uF0F3\u0000\u0000\u0000\uE7F3\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uF2F3\u0000\u0000\u0000\u0000\uADD7\uAAC6\u0000\u0000\u0000\u0000\uF3F3\u0000\u0000\u0000\u0000\uF1F3\u0000\uA8C2\u0000\u0000\u0000\u0000\u0000\uDDB8\uF5F3\u0000\u0000\uF4F3\u0000\u0000\u0000\uDBB4\u0000\u0000\u0000\uF6F3\uF7F3\u0000\u0000\u0000\uF8F3\u0000\u0000\u0000\uBAC0\u0000\u0000\uE9C0\u0000\u0000\u0000\u0000\u0000\uF1C5\u0000\u0000\u0000\u0000\uFBF3\u0000\uFAF3\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uD8B4\u0000\u0000\u0000\uFEF3\uF9F3\u0000\u0000\uFCF3\u0000\u0000\u0000\u0000\u0000\u0000\uFDF3\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA1F4\u0000\u0000\u0000\u0000\u0000\u0000\uA3F4\uC9BB\u0000\u0000\uA2F4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA4F4\u0000\u0000\u0000\u0000\u0000\u0000\uBEB2\uA6F4\uA5F4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uAEBC".toCharArray();
		}
		private static final char[] GETOUTPUT0_E000 = getOutput0_E000();
		private static final char[] getOutput0_E000() {
			return "\uA18D\uA28D\uA38D\uA48D\uA58D\uA68D\uA78D\uA88D\uA98D\uAA8D\uAB8D\uAC8D\uAD8D\uAE8D\uAF8D\uB08D\uB18D\uB28D\uB38D\uB48D\uB58D\uB68D\uB78D\uB88D\uB98D\uBA8D\uBB8D\uBC8D\uBD8D\uBE8D\uBF8D\uC08D\uC18D\uC28D\uC38D\uC48D\uC58D\uC68D\uC78D\uC88D\uC98D\uCA8D\uCB8D\uCC8D\uCD8D\uCE8D\uCF8D\uD08D\uD18D\uD28D\uD38D\uD48D\uD58D\uD68D\uD78D\uD88D\uD98D\uDA8D\uDB8D\uDC8D\uDD8D\uDE8D\uDF8D\uE08D\uE18D\uE28D\uE38D\uE48D\uE58D\uE68D\uE78D\uE88D\uE98D\uEA8D\uEB8D\uEC8D\uED8D\uEE8D\uEF8D\uF08D\uF18D\uF28D\uF38D\uF48D\uF58D\uF68D\uF78D\uF88D\uF98D\uFA8D\uFB8D\uFC8D\uFD8D\uFE8D\uA18E\uA28E\uA38E\uA48E\uA58E\uA68E\uA78E\uA88E\uA98E\uAA8E\uAB8E\uAC8E\uAD8E\uAE8E\uAF8E\uB08E\uB18E\uB28E\uB38E\uB48E\uB58E\uB68E\uB78E\uB88E\uB98E\uBA8E\uBB8E\uBC8E\uBD8E\uBE8E\uBF8E\uC08E\uC18E\uC28E\uC38E\uC48E\uC58E\uC68E\uC78E\uC88E\uC98E\uCA8E\uCB8E\uCC8E\uCD8E\uCE8E\uCF8E\uD08E\uD18E\uD28E\uD38E\uD48E\uD58E\uD68E\uD78E\uD88E\uD98E\uDA8E\uDB8E\uDC8E\uDD8E\uDE8E\uDF8E\uE08E\uE18E\uE28E\uE38E\uE48E\uE58E\uE68E\uE78E\uE88E\uE98E\uEA8E\uEB8E\uEC8E\uED8E\uEE8E\uEF8E\uF08E\uF18E\uF28E\uF38E\uF48E\uF58E\uF68E\uF78E\uF88E\uF98E\uFA8E\uFB8E\uFC8E\uFD8E\uFE8E\uA18F\uA28F\uA38F\uA48F\uA58F\uA68F\uA78F\uA88F\uA98F\uAA8F\uAB8F\uAC8F\uAD8F\uAE8F\uAF8F\uB08F\uB18F\uB28F\uB38F\uB48F\uB58F\uB68F\uB78F\uB88F\uB98F\uBA8F\uBB8F\uBC8F\uBD8F\uBE8F\uBF8F\uC08F\uC18F\uC28F\uC38F\uC48F\uC58F\uC68F\uC78F\uC88F\uC98F\uCA8F\uCB8F\uCC8F\uCD8F\uCE8F\uCF8F\uD08F\uD18F\uD28F\uD38F\uD48F\uD58F\uD68F\uD78F\uD88F\uD98F\uDA8F\uDB8F\uDC8F\uDD8F\uDE8F\uDF8F\uE08F\uE18F\uE28F\uE38F\uE48F\uE58F\uE68F\uE78F\uE88F\uE98F\uEA8F\uEB8F\uEC8F\uED8F\uEE8F\uEF8F\uF08F\uF18F\uF28F\uF38F\uF48F\uF58F\uF68F\uF78F\uF88F\uF98F\uFA8F\uFB8F\uFC8F\uFD8F\uFE8F\uA190\uA290\uA390\uA490\uA590\uA690\uA790\uA890\uA990\uAA90\uAB90\uAC90\uAD90\uAE90\uAF90\uB090\uB190\uB290\uB390\uB490\uB590\uB690\uB790\uB890\uB990\uBA90\uBB90\uBC90\uBD90\uBE90\uBF90\uC090\uC190\uC290\uC390\uC490\uC590\uC690\uC790\uC890\uC990\uCA90\uCB90\uCC90\uCD90\uCE90\uCF90\uD090\uD190\uD290\uD390\uD490\uD590\uD690\uD790\uD890\uD990\uDA90\uDB90\uDC90\uDD90\uDE90\uDF90\uE090\uE190\uE290\uE390\uE490\uE590\uE690\uE790\uE890\uE990\uEA90\uEB90\uEC90\uED90\uEE90\uEF90\uF090\uF190\uF290\uF390\uF490\uF590\uF690\uF790\uF890\uF990\uFA90\uFB90\uFC90\uFD90\uFE90\uA191\uA291\uA391\uA491\uA591\uA691\uA791\uA891\uA991\uAA91\uAB91\uAC91\uAD91\uAE91\uAF91\uB091\uB191\uB291\uB391\uB491\uB591\uB691\uB791\uB891\uB991\uBA91\uBB91\uBC91\uBD91\uBE91\uBF91\uC091\uC191\uC291\uC391\uC491\uC591\uC691\uC791\uC891\uC991\uCA91\uCB91\uCC91\uCD91\uCE91\uCF91\uD091\uD191\uD291\uD391\uD491\uD591\uD691\uD791\uD891\uD991\uDA91\uDB91\uDC91\uDD91\uDE91\uDF91\uE091\uE191\uE291\uE391\uE491\uE591\uE691\uE791\uE891\uE991\uEA91\uEB91\uEC91\uED91\uEE91\uEF91\uF091\uF191\uF291\uF391\uF491\uF591\uF691\uF791\uF891\uF991\uFA91\uFB91\uFC91\uFD91\uFE91\uA192\uA292\uA392\uA492\uA592\uA692\uA792\uA892\uA992\uAA92\uAB92\uAC92\uAD92\uAE92\uAF92\uB092\uB192\uB292\uB392\uB492\uB592\uB692\uB792\uB892\uB992\uBA92\uBB92\uBC92\uBD92\uBE92\uBF92\uC092\uC192\uC292\uC392\uC492\uC592\uC692\uC792\uC892\uC992\uCA92\uCB92\uCC92\uCD92\uCE92\uCF92\uD092\uD192\uD292\uD392\uD492\uD592\uD692\uD792\uD892\uD992\uDA92\uDB92\uDC92\uDD92\uDE92\uDF92\uE092\uE192\uE292\uE392\uE492\uE592\uE692\uE792\uE892\uE992\uEA92\uEB92\uEC92\uED92\uEE92\uEF92\uF092\uF192\uF292\uF392\uF492\uF592\uF692\uF792\uF892\uF992\uFA92\uFB92\uFC92\uFD92\uFE92\uA193\uA293\uA393\uA493\uA593\uA693\uA793\uA893\uA993\uAA93\uAB93\uAC93\uAD93\uAE93\uAF93\uB093\uB193\uB293\uB393\uB493\uB593\uB693\uB793\uB893\uB993\uBA93\uBB93\uBC93\uBD93\uBE93\uBF93\uC093\uC193\uC293\uC393\uC493\uC593\uC693\uC793\uC893\uC993\uCA93\uCB93\uCC93\uCD93\uCE93\uCF93\uD093\uD193\uD293\uD393\uD493\uD593\uD693\uD793\uD893\uD993\uDA93\uDB93\uDC93\uDD93\uDE93\uDF93\uE093\uE193\uE293\uE393\uE493\uE593\uE693\uE793\uE893\uE993\uEA93\uEB93\uEC93\uED93\uEE93\uEF93\uF093\uF193\uF293\uF393\uF493\uF593\uF693\uF793\uF893\uF993\uFA93\uFB93\uFC93\uFD93\uFE93\uA194\uA294\uA394\uA494\uA594\uA694\uA794\uA894\uA994\uAA94\uAB94\uAC94\uAD94\uAE94\uAF94\uB094\uB194\uB294\uB394\uB494\uB594\uB694\uB794\uB894\uB994\uBA94\uBB94\uBC94\uBD94\uBE94\uBF94\uC094\uC194\uC294\uC394\uC494\uC594\uC694\uC794\uC894\uC994\uCA94\uCB94\uCC94\uCD94\uCE94\uCF94\uD094\uD194\uD294\uD394\uD494\uD594\uD694\uD794\uD894\uD994\uDA94\uDB94\uDC94\uDD94\uDE94\uDF94\uE094\uE194\uE294\uE394\uE494\uE594\uE694\uE794\uE894\uE994\uEA94\uEB94\uEC94\uED94\uEE94\uEF94\uF094\uF194\uF294\uF394\uF494\uF594\uF694\uF794\uF894\uF994\uFA94\uFB94\uFC94\uFD94\uFE94\uA195\uA295\uA395\uA495\uA595\uA695\uA795\uA895\uA995\uAA95\uAB95\uAC95\uAD95\uAE95\uAF95\uB095\uB195\uB295\uB395\uB495\uB595\uB695\uB795\uB895\uB995\uBA95\uBB95\uBC95\uBD95\uBE95\uBF95\uC095\uC195\uC295\uC395\uC495\uC595\uC695\uC795\uC895\uC995\uCA95\uCB95\uCC95\uCD95\uCE95\uCF95\uD095\uD195\uD295\uD395\uD495\uD595\uD695\uD795\uD895\uD995\uDA95\uDB95\uDC95\uDD95\uDE95\uDF95\uE095\uE195\uE295\uE395\uE495\uE595\uE695\uE795\uE895\uE995\uEA95\uEB95\uEC95\uED95\uEE95\uEF95\uF095\uF195\uF295\uF395\uF495\uF595\uF695\uF795\uF895\uF995\uFA95\uFB95\uFC95\uFD95\uFE95\uA196\uA296\uA396\uA496\uA596\uA696\uA796\uA896\uA996\uAA96\uAB96\uAC96\uAD96\uAE96\uAF96\uB096\uB196\uB296\uB396\uB496\uB596\uB696\uB796\uB896\uB996\uBA96\uBB96\uBC96\uBD96\uBE96\uBF96\uC096\uC196\uC296\uC396\uC496\uC596\uC696\uC796\uC896\uC996\uCA96\uCB96\uCC96\uCD96\uCE96\uCF96\uD096\uD196\uD296\uD396\uD496\uD596\uD696\uD796\uD896\uD996\uDA96\uDB96\uDC96\uDD96\uDE96\uDF96\uE096\uE196\uE296\uE396\uE496\uE596\uE696\uE796\uE896\uE996\uEA96\uEB96\uEC96\uED96\uEE96\uEF96\uF096\uF196\uF296\uF396\uF496\uF596\uF696\uF796\uF896\uF996\uFA96\uFB96\uFC96\uFD96\uFE96\uA197\uA297\uA397\uA497\uA597\uA697\uA797\uA897\uA997\uAA97\uAB97\uAC97\uAD97\uAE97\uAF97\uB097\uB197\uB297\uB397\uB497\uB597\uB697\uB797\uB897\uB997\uBA97\uBB97\uBC97\uBD97\uBE97\uBF97\uC097\uC197\uC297\uC397\uC497\uC597\uC697\uC797\uC897\uC997\uCA97\uCB97\uCC97\uCD97\uCE97\uCF97\uD097\uD197\uD297\uD397\uD497\uD597\uD697\uD797\uD897\uD997\uDA97\uDB97\uDC97\uDD97\uDE97\uDF97\uE097\uE197\uE297\uE397\uE497\uE597\uE697\uE797\uE897\uE997\uEA97\uEB97\uEC97\uED97\uEE97\uEF97\uF097\uF197\uF297\uF397\uF497\uF597\uF697\uF797\uF897\uF997\uFA97\uFB97\uFC97\uFD97\uFE97\uA198\uA298\uA398\uA498\uA598\uA698\uA798\uA898\uA998\uAA98\uAB98\uAC98\uAD98\uAE98\uAF98\uB098\uB198\uB298\uB398\uB498\uB598\uB698\uB798\uB898\uB998\uBA98\uBB98\uBC98\uBD98\uBE98\uBF98\uC098\uC198\uC298\uC398\uC498\uC598\uC698\uC798\uC898\uC998\uCA98\uCB98\uCC98\uCD98\uCE98\uCF98\uD098\uD198\uD298\uD398\uD498\uD598\uD698\uD798\uD898\uD998\uDA98\uDB98\uDC98\uDD98\uDE98\uDF98\uE098\uE198\uE298\uE398\uE498\uE598\uE698\uE798\uE898\uE998\uEA98\uEB98\uEC98\uED98\uEE98\uEF98\uF098\uF198\uF298\uF398\uF498\uF598\uF698\uF798\uF898\uF998\uFA98\uFB98\uFC98\uFD98\uFE98\uA199\uA299\uA399\uA499\uA599\uA699\uA799\uA899\uA999\uAA99\uAB99\uAC99\uAD99\uAE99\uAF99\uB099\uB199\uB299\uB399\uB499\uB599\uB699\uB799\uB899\uB999\uBA99\uBB99\uBC99\uBD99\uBE99\uBF99\uC099\uC199\uC299\uC399\uC499\uC599\uC699\uC799\uC899\uC999\uCA99\uCB99\uCC99\uCD99\uCE99\uCF99\uD099\uD199\uD299\uD399\uD499\uD599\uD699\uD799\uD899\uD999\uDA99\uDB99\uDC99\uDD99\uDE99\uDF99\uE099\uE199\uE299\uE399\uE499\uE599\uE699\uE799\uE899\uE999\uEA99\uEB99\uEC99\uED99\uEE99\uEF99\uF099\uF199\uF299\uF399\uF499\uF599\uF699\uF799\uF899\uF999\uFA99\uFB99\uFC99\uFD99\uFE99\uA19A\uA29A\uA39A\uA49A\uA59A\uA69A\uA79A\uA89A\uA99A\uAA9A\uAB9A\uAC9A\uAD9A\uAE9A\uAF9A\uB09A\uB19A\uB29A\uB39A\uB49A\uB59A\uB69A\uB79A\uB89A\uB99A\uBA9A\uBB9A\uBC9A\uBD9A\uBE9A\uBF9A\uC09A\uC19A\uC29A\uC39A\uC49A\uC59A\uC69A\uC79A\uC89A\uC99A\uCA9A\uCB9A\uCC9A\uCD9A\uCE9A\uCF9A\uD09A\uD19A\uD29A\uD39A\uD49A\uD59A\uD69A\uD79A\uD89A\uD99A\uDA9A\uDB9A\uDC9A\uDD9A\uDE9A\uDF9A\uE09A\uE19A\uE29A\uE39A\uE49A\uE59A\uE69A\uE79A\uE89A\uE99A\uEA9A\uEB9A\uEC9A\uED9A\uEE9A\uEF9A\uF09A\uF19A\uF29A\uF39A\uF49A\uF59A\uF69A\uF79A\uF89A\uF99A\uFA9A\uFB9A\uFC9A\uFD9A\uFE9A\uA19B\uA29B\uA39B\uA49B\uA59B\uA69B\uA79B\uA89B\uA99B\uAA9B\uAB9B\uAC9B\uAD9B\uAE9B\uAF9B\uB09B\uB19B\uB29B\uB39B\uB49B\uB59B\uB69B\uB79B\uB89B\uB99B\uBA9B\uBB9B\uBC9B\uBD9B\uBE9B\uBF9B\uC09B\uC19B\uC29B\uC39B\uC49B\uC59B\uC69B\uC79B\uC89B\uC99B\uCA9B\uCB9B\uCC9B\uCD9B\uCE9B\uCF9B\uD09B\uD19B\uD29B\uD39B\uD49B\uD59B\uD69B\uD79B\uD89B\uD99B\uDA9B\uDB9B\uDC9B\uDD9B\uDE9B\uDF9B\uE09B\uE19B\uE29B\uE39B\uE49B\uE59B\uE69B\uE79B\uE89B\uE99B\uEA9B\uEB9B\uEC9B\uED9B\uEE9B\uEF9B\uF09B\uF19B\uF29B\uF39B\uF49B\uF59B\uF69B\uF79B\uF89B\uF99B\uFA9B\uFB9B\uFC9B\uFD9B\uFE9B\uA19C\uA29C\uA39C\uA49C\uA59C\uA69C\uA79C\uA89C\uA99C\uAA9C\uAB9C\uAC9C\uAD9C\uAE9C\uAF9C\uB09C\uB19C\uB29C\uB39C\uB49C\uB59C\uB69C\uB79C\uB89C\uB99C\uBA9C\uBB9C\uBC9C\uBD9C\uBE9C\uBF9C\uC09C\uC19C\uC29C\uC39C\uC49C\uC59C\uC69C\uC79C\uC89C\uC99C\uCA9C\uCB9C\uCC9C\uCD9C\uCE9C\uCF9C\uD09C\uD19C\uD29C\uD39C\uD49C\uD59C\uD69C\uD79C\uD89C\uD99C\uDA9C\uDB9C\uDC9C\uDD9C\uDE9C\uDF9C\uE09C\uE19C\uE29C\uE39C\uE49C\uE59C\uE69C\uE79C\uE89C\uE99C\uEA9C\uEB9C\uEC9C\uED9C\uEE9C\uEF9C\uF09C\uF19C\uF29C\uF39C\uF49C\uF59C\uF69C\uF79C\uF89C\uF99C\uFA9C\uFB9C\uFC9C\uFD9C\uFE9C\uA19D\uA29D\uA39D\uA49D\uA59D\uA69D\uA79D\uA89D\uA99D\uAA9D\uAB9D\uAC9D\uAD9D\uAE9D\uAF9D\uB09D\uB19D\uB29D\uB39D\uB49D\uB59D\uB69D\uB79D\uB89D\uB99D\uBA9D\uBB9D\uBC9D\uBD9D\uBE9D\uBF9D\uC09D\uC19D\uC29D\uC39D\uC49D\uC59D\uC69D\uC79D\uC89D\uC99D\uCA9D\uCB9D\uCC9D\uCD9D\uCE9D\uCF9D\uD09D\uD19D\uD29D\uD39D\uD49D\uD59D\uD69D\uD79D\uD89D\uD99D\uDA9D\uDB9D\uDC9D\uDD9D\uDE9D\uDF9D\uE09D\uE19D\uE29D\uE39D\uE49D\uE59D\uE69D\uE79D\uE89D\uE99D\uEA9D\uEB9D\uEC9D\uED9D\uEE9D\uEF9D\uF09D\uF19D\uF29D\uF39D\uF49D\uF59D\uF69D\uF79D\uF89D\uF99D\uFA9D\uFB9D\uFC9D\uFD9D\uFE9D\uA19E\uA29E\uA39E\uA49E\uA59E\uA69E\uA79E\uA89E\uA99E\uAA9E\uAB9E\uAC9E\uAD9E\uAE9E\uAF9E\uB09E\uB19E\uB29E\uB39E\uB49E\uB59E\uB69E\uB79E\uB89E\uB99E\uBA9E\uBB9E\uBC9E\uBD9E\uBE9E\uBF9E\uC09E\uC19E\uC29E\uC39E\uC49E\uC59E\uC69E\uC79E\uC89E\uC99E\uCA9E\uCB9E\uCC9E\uCD9E\uCE9E\uCF9E\uD09E\uD19E\uD29E\uD39E\uD49E\uD59E\uD69E\uD79E\uD89E\uD99E\uDA9E\uDB9E\uDC9E\uDD9E\uDE9E\uDF9E\uE09E\uE19E\uE29E\uE39E\uE49E\uE59E\uE69E\uE79E\uE89E\uE99E\uEA9E\uEB9E\uEC9E\uED9E\uEE9E\uEF9E\uF09E\uF19E\uF29E\uF39E\uF49E\uF59E\uF69E\uF79E\uF89E\uF99E\uFA9E\uFB9E\uFC9E\uFD9E\uFE9E\uA19F\uA29F\uA39F\uA49F\uA59F\uA69F\uA79F\uA89F\uA99F\uAA9F\uAB9F\uAC9F\uAD9F\uAE9F\uAF9F\uB09F\uB19F\uB29F\uB39F\uB49F\uB59F\uB69F\uB79F\uB89F\uB99F\uBA9F\uBB9F\uBC9F\uBD9F\uBE9F\uBF9F\uC09F\uC19F\uC29F\uC39F\uC49F\uC59F\uC69F\uC79F\uC89F\uC99F\uCA9F\uCB9F\uCC9F\uCD9F\uCE9F\uCF9F\uD09F\uD19F\uD29F\uD39F\uD49F\uD59F\uD69F\uD79F\uD89F\uD99F\uDA9F\uDB9F\uDC9F\uDD9F\uDE9F\uDF9F\uE09F\uE19F\uE29F\uE39F\uE49F\uE59F\uE69F\uE79F\uE89F\uE99F\uEA9F\uEB9F\uEC9F\uED9F\uEE9F\uEF9F\uF09F\uF19F\uF29F\uF39F\uF49F\uF59F\uF69F\uF79F\uF89F\uF99F\uFA9F\uFB9F\uFC9F\uFD9F\uFE9F\uA1A0\uA2A0\uA3A0\uA4A0\uA5A0\uA6A0\uA7A0\uA8A0\uA9A0\uAAA0\uABA0\uACA0\uADA0\uAEA0\uAFA0\uB0A0\uB1A0\uB2A0\uB3A0\uB4A0\uB5A0\uB6A0\uB7A0\uB8A0\uB9A0\uBAA0\uBBA0\uBCA0\uBDA0\uBEA0\uBFA0\uC0A0\uC1A0\uC2A0\uC3A0\uC4A0\uC5A0\uC6A0\uC7A0\uC8A0\uC9A0\uCAA0\uCBA0\uCCA0\uCDA0\uCEA0\uCFA0\uD0A0\uD1A0\uD2A0\uD3A0\uD4A0\uD5A0\uD6A0\uD7A0\uD8A0\uD9A0\uDAA0\uDBA0\uDCA0\uDDA0\uDEA0\uDFA0\uE0A0\uE1A0\uE2A0\uE3A0\uE4A0\uE5A0\uE6A0\uE7A0\uE8A0\uE9A0\uEAA0\uEBA0\uECA0\uEDA0\uEEA0\uEFA0\uF0A0\uF1A0\uF2A0\uF3A0\uF4A0\uF5A0\uF6A0\uF7A0\uF8A0\uF9A0\uFAA0\uFBA0\uFCA0\uFDA0\uFEA0".toCharArray();
		}
		private static final char[] GETOUTPUT0_FF01 = getOutput0_FF01();
		private static final char[] getOutput0_FF01() {
			return "\uA1A3\uA2A3\uA3A3\uE7A1\uA5A3\uA6A3\uEC8C\uA8A3\uA9A3\uAAA3\uABA3\uACA3\uADA3\uAEA3\uAFA3\uB0A3\uB1A3\uB2A3\uB3A3\uB4A3\uB5A3\uB6A3\uB7A3\uB8A3\uB9A3\uBAA3\uBBA3\uBCA3\uBDA3\uBEA3\uBFA3\uC0A3\uC1A3\uC2A3\uC3A3\uC4A3\uC5A3\uC6A3\uC7A3\uC8A3\uC9A3\uCAA3\uCBA3\uCCA3\uCDA3\uCEA3\uCFA3\uD0A3\uD1A3\uD2A3\uD3A3\uD4A3\uD5A3\uD6A3\uD7A3\uD8A3\uD9A3\uDAA3\uDBA3\uDCA3\uDDA3\uDEA3\uDFA3\uE0A3\uE1A3\uE2A3\uE3A3\uE4A3\uE5A3\uE6A3\uE7A3\uE8A3\uE9A3\uEAA3\uEBA3\uECA3\uEDA3\uEEA3\uEFA3\uF0A3\uF1A3\uF2A3\uF3A3\uF4A3\uF5A3\uF6A3\uF7A3\uF8A3\uF9A3\uFAA3\uFBA3\uFCA3\uFDA3\uABA1".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON133[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON134[input - 0x401];
			if (input >= 0x2160 && input <= 0x2179) return GETOUTPUT0_2160[input - 0x2160];
			if (input >= 0x2208 && input <= 0x224C) return CommonSubtables.COMMON135[input - 0x2208];
			if (input >= 0x2460 && input <= 0x249B) return CommonSubtables.COMMON136[input - 0x2460];
			if (input >= 0x2500 && input <= 0x254B) return CommonSubtables.COMMON137[input - 0x2500];
			if (input >= 0x3000 && input <= 0x3017) return GETOUTPUT0_3000[input - 0x3000];
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
			if (input >= 0x7A70 && input <= 0x7C4D) return GETOUTPUT0_7A70[input - 0x7A70];
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
			if (input >= 0xE000 && input <= 0xE757) return GETOUTPUT0_E000[input - 0xE000];
			if (input >= 0xFF01 && input <= 0xFF5E) return GETOUTPUT0_FF01[input - 0xFF01];
			switch (input) {
			case 0xA3: return 0x80L;
			case 0xA4: return 0xE8A1L;
			case 0xA5: return 0x82L;
			case 0xA6: return 0x84L;
			case 0xA7: return 0xECA1L;
			case 0xA8: return 0xA7A1L;
			case 0xAC: return 0x81L;
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
			case 0x2010: return 0xF38CL;
			case 0x2014: return 0xAAA1L;
			case 0x2015: return 0xAAA1L;
			case 0x2016: return 0xACA1L;
			case 0x2018: return 0xAEA1L;
			case 0x2019: return 0xAFA1L;
			case 0x201C: return 0xB0A1L;
			case 0x201D: return 0xB1A1L;
			case 0x2025: return 0xFA8CL;
			case 0x2026: return 0xADA1L;
			case 0x2030: return 0xEBA1L;
			case 0x2032: return 0xE4A1L;
			case 0x2033: return 0xE5A1L;
			case 0x203B: return 0xF9A1L;
			case 0x203E: return 0x83L;
			case 0x2103: return 0xE6A1L;
			case 0x2116: return 0xEDA1L;
			case 0x2121: return 0xF98CL;
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
			case 0x25BC: return 0xFE8CL;
			case 0x25BD: return 0xFD8CL;
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
			case 0x3231: return 0xF88CL;
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
			case 0xF83D: return 0xEE8CL;
			case 0xF83E: return 0xF48CL;
			case 0xFFE0: return 0xE9A1L;
			case 0xFFE1: return 0xEAA1L;
			case 0xFFE2: return 0xEA8CL;
			case 0xFFE3: return 0xFEA3L;
			case 0xFFE4: return 0xEB8CL;
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
