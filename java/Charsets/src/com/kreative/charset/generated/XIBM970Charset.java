package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM970Charset extends Charset {
	public XIBM970Charset() {
		super("x-IBM970", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM970CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM970CharsetEncoder(this);
	}

	private static final class XIBM970CharsetDecoder extends TableCharsetDecoder {
		private XIBM970CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0xB0 && input <= 0xFE) return input - 0xB0 + 0xD;
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
			if (input >= 0x20 && input <= 0x8D) return input - 0x20 + 0x20;
			if (input >= 0x90 && input <= 0x9F) return input - 0x90 + 0x90;
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON450[input - 0xA1];
			return 0;
		}
		private static final char[] GETOUTPUT2_A1 = getOutput2_A1();
		private static final char[] getOutput2_A1() {
			return "\u21D2\u21D4\u2200\u2203\u00B4\u02DC\u02C7\u02D8\u02DD\u02DA\u02D9\u00B8\u02DB\u00A1\u00BF\u02D0\u222E\u2211\u220F\u00A4\u2109\u2030\u25C1\u25C0\u25B7\u25B6\u2664\u2660\u2661\u2665\u2667\u2663\u2299\u25C8\u25A3\u25D0\u25D1\u2592\u25A4\u25A5\u25A8\u25A7\u25A6\u25A9\u2668\u260F\u260E\u261C\u261E\u00B6\u2020\u2021\u2195\u2197\u2199\u2196\u2198\u266D\u2669\u266A\u266C\u327F\u321C\u2116\u33C7\u2122\u33C2\u33D8\u2121".toCharArray();
		}
		private long getOutput2(int input) {
			if (input >= 0xA1 && input <= 0xE5) return GETOUTPUT2_A1[input - 0xA1];
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0xA1 && input <= 0xDB) return input - 0xA1 + 0xFF01;
			if (input >= 0xDD && input <= 0xFD) return input - 0xDD + 0xFF3D;
			switch (input) {
			case 0xDC: return 0xFFE6L;
			case 0xFE: return 0xFFE3L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0x3131;
			return 0;
		}
		private long getOutput5(int input) {
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
			case 0xF2: return 0x3C3L;
			case 0xF3: return 0x3C4L;
			case 0xF4: return 0x3C5L;
			case 0xF5: return 0x3C6L;
			case 0xF6: return 0x3C7L;
			case 0xF7: return 0x3C8L;
			case 0xF8: return 0x3C9L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0xA1 && input <= 0xE4) return CommonSubtables.COMMON277[input - 0xA1];
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0xA1 && input <= 0xEF) return CommonSubtables.COMMON452[input - 0xA1];
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0xB1 && input <= 0xCC) return input - 0xB1 + 0x3260;
			if (input >= 0xCD && input <= 0xE6) return input - 0xCD + 0x24D0;
			if (input >= 0xE7 && input <= 0xFE) return CommonSubtables.COMMON453[input - 0xE7];
			switch (input) {
			case 0xA1: return 0xC6L;
			case 0xA2: return 0xD0L;
			case 0xA3: return 0xAAL;
			case 0xA4: return 0x126L;
			case 0xA6: return 0x132L;
			case 0xA8: return 0x13FL;
			case 0xA9: return 0x141L;
			case 0xAA: return 0xD8L;
			case 0xAB: return 0x152L;
			case 0xAC: return 0xBAL;
			case 0xAD: return 0xDEL;
			case 0xAE: return 0x166L;
			case 0xAF: return 0x14AL;
			}
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0xB1 && input <= 0xCC) return input - 0xB1 + 0x3200;
			if (input >= 0xA1 && input <= 0xB0) return CommonSubtables.COMMON454[input - 0xA1];
			if (input >= 0xCD && input <= 0xE6) return input - 0xCD + 0x249C;
			if (input >= 0xE7 && input <= 0xFE) return CommonSubtables.COMMON278[input - 0xE7];
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0xA1 && input <= 0xF3) return input - 0xA1 + 0x3041;
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0xA1 && input <= 0xF6) return input - 0xA1 + 0x30A1;
			return 0;
		}
		private long getOutput12(int input) {
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
		private long getOutput13(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON455[input - 0xA1];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON456[input - 0xA1];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON457[input - 0xA1];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON458[input - 0xA1];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON459[input - 0xA1];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON460[input - 0xA1];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON461[input - 0xA1];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON462[input - 0xA1];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON463[input - 0xA1];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON464[input - 0xA1];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON465[input - 0xA1];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON466[input - 0xA1];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON467[input - 0xA1];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON468[input - 0xA1];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON469[input - 0xA1];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON470[input - 0xA1];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON471[input - 0xA1];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON472[input - 0xA1];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON473[input - 0xA1];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON474[input - 0xA1];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON475[input - 0xA1];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON476[input - 0xA1];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON477[input - 0xA1];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON478[input - 0xA1];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON479[input - 0xA1];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE000;
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
		private long getOutput91(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE05E;
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
			default: return 0;
			}
		}
	}

	private static final class XIBM970CharsetEncoder extends TableCharsetEncoder {
		private XIBM970CharsetEncoder(Charset cs) {
			super(cs, 1.98158f, 2f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_6927 = getOutput0_6927();
		private static final char[] getOutput0_6927() {
			return "\uA7D9\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uABE5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uCBE6\u0000\uF1F5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uC5E5\u0000\u0000\u0000\u0000\u0000\uAAA1\u0000\u0000\uA3F9\uDBE0\uEBF6\u0000\uF1CB\u0000\uEAD9\uA2F5\u0000\u0000\u0000\uD1D7\u0000\uF8D1\uF8EA\uF9EA\uB3DA\u0000\u0000\u0000\u0000\uDFEF\u0000\u0000\uEFF1\u0000\uF6E5\uBFEE\uE4E2\u0000\u0000\u0000\u0000\u0000\uBFD0\u0000\uACFA\uD1F5\uB3E7".toCharArray();
		}
		private static final char[] GETOUTPUT0_CF54 = getOutput0_CF54();
		private static final char[] getOutput0_CF54() {
			return "\uDAC4\uDBC4\u0000\u0000\uDCC4\u0000\u0000\u0000\uDDC4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uDEC4\uDFC4\u0000\uE0C4\u0000\uE1C4\u0000\u0000\u0000\u0000\u0000\u0000\uE2C4\uE3C4\u0000\u0000\uE4C4\u0000\u0000\u0000\uE5C4\u0000\u0000\u0000\u0000\u0000\u0000\uADA1\uE6C4\u0000\u0000\u0000\u0000\uE7C4\u0000\u0000\u0000\u0000\u0000\u0000\uE8C4".toCharArray();
		}
		private static final char[] GETOUTPUT0_E000 = getOutput0_E000();
		private static final char[] getOutput0_E000() {
			return "\uA1C9\uA2C9\uA3C9\uA4C9\uA5C9\uA6C9\uA7C9\uA8C9\uA9C9\uAAC9\uABC9\uACC9\uADC9\uAEC9\uAFC9\uB0C9\uB1C9\uB2C9\uB3C9\uB4C9\uB5C9\uB6C9\uB7C9\uB8C9\uB9C9\uBAC9\uBBC9\uBCC9\uBDC9\uBEC9\uBFC9\uC0C9\uC1C9\uC2C9\uC3C9\uC4C9\uC5C9\uC6C9\uC7C9\uC8C9\uC9C9\uCAC9\uCBC9\uCCC9\uCDC9\uCEC9\uCFC9\uD0C9\uD1C9\uD2C9\uD3C9\uD4C9\uD5C9\uD6C9\uD7C9\uD8C9\uD9C9\uDAC9\uDBC9\uDCC9\uDDC9\uDEC9\uDFC9\uE0C9\uE1C9\uE2C9\uE3C9\uE4C9\uE5C9\uE6C9\uE7C9\uE8C9\uE9C9\uEAC9\uEBC9\uECC9\uEDC9\uEEC9\uEFC9\uF0C9\uF1C9\uF2C9\uF3C9\uF4C9\uF5C9\uF6C9\uF7C9\uF8C9\uF9C9\uFAC9\uFBC9\uFCC9\uFDC9\uFEC9\uA1FE\uA2FE\uA3FE\uA4FE\uA5FE\uA6FE\uA7FE\uA8FE\uA9FE\uAAFE\uABFE\uACFE\uADFE\uAEFE\uAFFE\uB0FE\uB1FE\uB2FE\uB3FE\uB4FE\uB5FE\uB6FE\uB7FE\uB8FE\uB9FE\uBAFE\uBBFE\uBCFE\uBDFE\uBEFE\uBFFE\uC0FE\uC1FE\uC2FE\uC3FE\uC4FE\uC5FE\uC6FE\uC7FE\uC8FE\uC9FE\uCAFE\uCBFE\uCCFE\uCDFE\uCEFE\uCFFE\uD0FE\uD1FE\uD2FE\uD3FE\uD4FE\uD5FE\uD6FE\uD7FE\uD8FE\uD9FE\uDAFE\uDBFE\uDCFE\uDDFE\uDEFE\uDFFE\uE0FE\uE1FE\uE2FE\uE3FE\uE4FE\uE5FE\uE6FE\uE7FE\uE8FE\uE9FE\uEAFE\uEBFE\uECFE\uEDFE\uEEFE\uEFFE\uF0FE\uF1FE\uF2FE\uF3FE\uF4FE\uF5FE\uF6FE\uF7FE\uF8FE\uF9FE\uFAFE\uFBFE\uFCFE\uFDFE\uFEFE".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x8D) return input - 0x20 + 0x20;
			if (input >= 0x90 && input <= 0x9F) return input - 0x90 + 0x90;
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON987[input - 0xA1];
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON533[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON534[input - 0x401];
			if (input >= 0x2153 && input <= 0x2179) return CommonSubtables.COMMON535[input - 0x2153];
			if (input >= 0x2200 && input <= 0x223D) return CommonSubtables.COMMON988[input - 0x2200];
			if (input >= 0x2460 && input <= 0x2482) return CommonSubtables.COMMON537[input - 0x2460];
			if (input >= 0x249C && input <= 0x24B5) return CommonSubtables.COMMON538[input - 0x249C];
			if (input >= 0x24D0 && input <= 0x24E9) return CommonSubtables.COMMON539[input - 0x24D0];
			if (input >= 0x2500 && input <= 0x254B) return CommonSubtables.COMMON540[input - 0x2500];
			if (input >= 0x2592 && input <= 0x25D1) return CommonSubtables.COMMON989[input - 0x2592];
			if (input >= 0x3000 && input <= 0x301C) return CommonSubtables.COMMON542[input - 0x3000];
			if (input >= 0x3041 && input <= 0x30FB) return CommonSubtables.COMMON543[input - 0x3041];
			if (input >= 0x3131 && input <= 0x318E) return CommonSubtables.COMMON544[input - 0x3131];
			if (input >= 0x3200 && input <= 0x321C) return CommonSubtables.COMMON545[input - 0x3200];
			if (input >= 0x3260 && input <= 0x327F) return CommonSubtables.COMMON546[input - 0x3260];
			if (input >= 0x3380 && input <= 0x33DD) return CommonSubtables.COMMON547[input - 0x3380];
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
			if (input >= 0x6927 && input <= 0x6979) return GETOUTPUT0_6927[input - 0x6927];
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
			if (input >= 0xCF54 && input <= 0xCF8C) return GETOUTPUT0_CF54[input - 0xCF54];
			if (input >= 0xD02D && input <= 0xD081) return CommonSubtables.COMMON1094[input - 0xD02D];
			if (input >= 0xD0A4 && input <= 0xD0F8) return CommonSubtables.COMMON666[input - 0xD0A4];
			if (input >= 0xD130 && input <= 0xD188) return CommonSubtables.COMMON1095[input - 0xD130];
			if (input >= 0xD280 && input <= 0xD345) return CommonSubtables.COMMON1096[input - 0xD280];
			if (input >= 0xD37C && input <= 0xD408) return CommonSubtables.COMMON1097[input - 0xD37C];
			if (input >= 0xD45C && input <= 0xD494) return CommonSubtables.COMMON670[input - 0xD45C];
			if (input >= 0xD4CC && input <= 0xD517) return CommonSubtables.COMMON1098[input - 0xD4CC];
			if (input >= 0xD53C && input <= 0xD590) return CommonSubtables.COMMON1099[input - 0xD53C];
			if (input >= 0xD5C8 && input <= 0xD79D) return CommonSubtables.COMMON1100[input - 0xD5C8];
			if (input >= 0xE000 && input <= 0xE0BB) return GETOUTPUT0_E000[input - 0xE000];
			if (input >= 0xF900 && input <= 0xFA0B) return CommonSubtables.COMMON676[input - 0xF900];
			if (input >= 0xFF01 && input <= 0xFF5E) return CommonSubtables.COMMON1101[input - 0xFF01];
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
			case 0x2C7: return 0xA7A2L;
			case 0x2D0: return 0xB0A2L;
			case 0x2D8: return 0xA8A2L;
			case 0x2D9: return 0xABA2L;
			case 0x2DA: return 0xAAA2L;
			case 0x2DB: return 0xADA2L;
			case 0x2DC: return 0xA6A2L;
			case 0x2DD: return 0xA9A2L;
			case 0x2010: return 0xA9A1L;
			case 0x2014: return 0xAAA1L;
			case 0x2015: return 0xAAA1L;
			case 0x2018: return 0xAEA1L;
			case 0x2019: return 0xAFA1L;
			case 0x201C: return 0xB0A1L;
			case 0x201D: return 0xB1A1L;
			case 0x2020: return 0xD3A2L;
			case 0x2021: return 0xD4A2L;
			case 0x2025: return 0xA5A1L;
			case 0x2026: return 0xA6A1L;
			case 0x2030: return 0xB6A2L;
			case 0x2032: return 0xC7A1L;
			case 0x2033: return 0xC8A1L;
			case 0x203B: return 0xD8A1L;
			case 0x2074: return 0xF9A9L;
			case 0x207F: return 0xFAA9L;
			case 0x2081: return 0xFBA9L;
			case 0x2082: return 0xFCA9L;
			case 0x2083: return 0xFDA9L;
			case 0x2084: return 0xFEA9L;
			case 0x20A9: return 0xDCA3L;
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
			case 0x21D2: return 0xA1A2L;
			case 0x21D4: return 0xA2A2L;
			case 0x2252: return 0xD6A1L;
			case 0x2260: return 0xC1A1L;
			case 0x2261: return 0xD5A1L;
			case 0x2264: return 0xC2A1L;
			case 0x2265: return 0xC3A1L;
			case 0x226A: return 0xECA1L;
			case 0x226B: return 0xEDA1L;
			case 0x2282: return 0xF8A1L;
			case 0x2283: return 0xF9A1L;
			case 0x2286: return 0xF6A1L;
			case 0x2287: return 0xF7A1L;
			case 0x2299: return 0xC1A2L;
			case 0x22A5: return 0xD1A1L;
			case 0x2312: return 0xD2A1L;
			case 0x2605: return 0xDAA1L;
			case 0x2606: return 0xD9A1L;
			case 0x260E: return 0xCFA2L;
			case 0x260F: return 0xCEA2L;
			case 0x261C: return 0xD0A2L;
			case 0x261E: return 0xD1A2L;
			case 0x2640: return 0xCFA1L;
			case 0x2642: return 0xCEA1L;
			case 0x2660: return 0xBCA2L;
			case 0x2661: return 0xBDA2L;
			case 0x2663: return 0xC0A2L;
			case 0x2664: return 0xBBA2L;
			case 0x2665: return 0xBEA2L;
			case 0x2667: return 0xBFA2L;
			case 0x2668: return 0xCDA2L;
			case 0x2669: return 0xDBA2L;
			case 0x266A: return 0xDCA2L;
			case 0x266C: return 0xDDA2L;
			case 0x266D: return 0xDAA2L;
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
			case 0x84F1: return 0xA9A1L;
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
			case 0xFFE0: return 0xCBA1L;
			case 0xFFE1: return 0xCCA1L;
			case 0xFFE2: return 0xFEA1L;
			case 0xFFE3: return 0xFEA3L;
			case 0xFFE5: return 0xCDA1L;
			case 0xFFE6: return 0xDCA3L;
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
