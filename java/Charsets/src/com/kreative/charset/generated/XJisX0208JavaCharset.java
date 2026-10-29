package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XJisX0208JavaCharset extends Charset {
	public XJisX0208JavaCharset() {
		super("x-jis-x-0208-java", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XJisX0208JavaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XJisX0208JavaCharsetEncoder(this);
	}

	private static final class XJisX0208JavaCharsetDecoder extends TableCharsetDecoder {
		private XJisX0208JavaCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0x30 && input <= 0x74) return input - 0x30 + 0x9;
			switch (input) {
			case 0x21: return 0x1;
			case 0x22: return 0x2;
			case 0x23: return 0x3;
			case 0x24: return 0x4;
			case 0x25: return 0x5;
			case 0x26: return 0x6;
			case 0x27: return 0x7;
			case 0x28: return 0x8;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT1_21 = getOutput1_21();
		private static final char[] getOutput1_21() {
			return "\u3000\u3001\u3002\uFF0C\uFF0E\u30FB\uFF1A\uFF1B\uFF1F\uFF01\u309B\u309C\u00B4\uFF40\u00A8\uFF3E\uFFE3\uFF3F\u30FD\u30FE\u309D\u309E\u3003\u4EDD\u3005\u3006\u3007\u30FC\u2014\u2010\uFF0F\uFF3C\u301C\u2016\uFF5C\u2026\u2025\u2018\u2019\u201C\u201D\uFF08\uFF09\u3014\u3015\uFF3B\uFF3D\uFF5B\uFF5D\u3008\u3009\u300A\u300B\u300C\u300D\u300E\u300F\u3010\u3011\uFF0B\u2212\u00B1\u00D7\u00F7\uFF1D\u2260\uFF1C\uFF1E\u2266\u2267\u221E\u2234\u2642\u2640\u00B0\u2032\u2033\u2103\uFFE5\uFF04\u00A2\u00A3\uFF05\uFF03\uFF06\uFF0A\uFF20\u00A7\u2606\u2605\u25CB\u25CF\u25CE\u25C7".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0x21 && input <= 0x7E) return GETOUTPUT1_21[input - 0x21];
			return 0;
		}
		private long getOutput2(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1243[input - 0x21];
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0xFF21;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0xFF41;
			switch (input) {
			case 0x30: return 0xFF10L;
			case 0x31: return 0xFF11L;
			case 0x32: return 0xFF12L;
			case 0x33: return 0xFF13L;
			case 0x34: return 0xFF14L;
			case 0x35: return 0xFF15L;
			case 0x36: return 0xFF16L;
			case 0x37: return 0xFF17L;
			case 0x38: return 0xFF18L;
			case 0x39: return 0xFF19L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0x21 && input <= 0x73) return input - 0x21 + 0x3041;
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0x21 && input <= 0x76) return input - 0x21 + 0x30A1;
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0x21 && input <= 0x31) return input - 0x21 + 0x391;
			if (input >= 0x41 && input <= 0x51) return input - 0x41 + 0x3B1;
			switch (input) {
			case 0x32: return 0x3A3L;
			case 0x33: return 0x3A4L;
			case 0x34: return 0x3A5L;
			case 0x35: return 0x3A6L;
			case 0x36: return 0x3A7L;
			case 0x37: return 0x3A8L;
			case 0x38: return 0x3A9L;
			case 0x52: return 0x3C3L;
			case 0x53: return 0x3C4L;
			case 0x54: return 0x3C5L;
			case 0x55: return 0x3C6L;
			case 0x56: return 0x3C7L;
			case 0x57: return 0x3C8L;
			case 0x58: return 0x3C9L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0x28 && input <= 0x41) return input - 0x28 + 0x416;
			if (input >= 0x58 && input <= 0x71) return input - 0x58 + 0x436;
			switch (input) {
			case 0x21: return 0x410L;
			case 0x22: return 0x411L;
			case 0x23: return 0x412L;
			case 0x24: return 0x413L;
			case 0x25: return 0x414L;
			case 0x26: return 0x415L;
			case 0x27: return 0x401L;
			case 0x51: return 0x430L;
			case 0x52: return 0x431L;
			case 0x53: return 0x432L;
			case 0x54: return 0x433L;
			case 0x55: return 0x434L;
			case 0x56: return 0x435L;
			case 0x57: return 0x451L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0x21 && input <= 0x40) return CommonSubtables.COMMON192[input - 0x21];
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON193[input - 0x21];
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON194[input - 0x21];
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON195[input - 0x21];
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON196[input - 0x21];
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON197[input - 0x21];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON198[input - 0x21];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON199[input - 0x21];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON200[input - 0x21];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON201[input - 0x21];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON202[input - 0x21];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON203[input - 0x21];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON204[input - 0x21];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON205[input - 0x21];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON206[input - 0x21];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON207[input - 0x21];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON208[input - 0x21];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON209[input - 0x21];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON210[input - 0x21];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON211[input - 0x21];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON212[input - 0x21];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON213[input - 0x21];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON214[input - 0x21];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON215[input - 0x21];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON216[input - 0x21];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON217[input - 0x21];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON218[input - 0x21];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON219[input - 0x21];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON220[input - 0x21];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON221[input - 0x21];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON222[input - 0x21];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON223[input - 0x21];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0x21 && input <= 0x53) return CommonSubtables.COMMON224[input - 0x21];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON225[input - 0x21];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON226[input - 0x21];
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON227[input - 0x21];
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON228[input - 0x21];
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON229[input - 0x21];
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON230[input - 0x21];
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON231[input - 0x21];
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON232[input - 0x21];
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON233[input - 0x21];
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON234[input - 0x21];
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON235[input - 0x21];
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON236[input - 0x21];
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON237[input - 0x21];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON238[input - 0x21];
			return 0;
		}
		private long getOutput55(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON239[input - 0x21];
			return 0;
		}
		private long getOutput56(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON240[input - 0x21];
			return 0;
		}
		private long getOutput57(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON241[input - 0x21];
			return 0;
		}
		private long getOutput58(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON242[input - 0x21];
			return 0;
		}
		private long getOutput59(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON243[input - 0x21];
			return 0;
		}
		private long getOutput60(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON244[input - 0x21];
			return 0;
		}
		private long getOutput61(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON245[input - 0x21];
			return 0;
		}
		private long getOutput62(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON246[input - 0x21];
			return 0;
		}
		private long getOutput63(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON247[input - 0x21];
			return 0;
		}
		private long getOutput64(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON248[input - 0x21];
			return 0;
		}
		private long getOutput65(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON249[input - 0x21];
			return 0;
		}
		private long getOutput66(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON250[input - 0x21];
			return 0;
		}
		private long getOutput67(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON251[input - 0x21];
			return 0;
		}
		private long getOutput68(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON252[input - 0x21];
			return 0;
		}
		private long getOutput69(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON253[input - 0x21];
			return 0;
		}
		private long getOutput70(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON254[input - 0x21];
			return 0;
		}
		private long getOutput71(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON255[input - 0x21];
			return 0;
		}
		private long getOutput72(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON256[input - 0x21];
			return 0;
		}
		private long getOutput73(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON257[input - 0x21];
			return 0;
		}
		private long getOutput74(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON258[input - 0x21];
			return 0;
		}
		private long getOutput75(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON259[input - 0x21];
			return 0;
		}
		private long getOutput76(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON260[input - 0x21];
			return 0;
		}
		private long getOutput77(int input) {
			switch (input) {
			case 0x21: return 0x582FL;
			case 0x22: return 0x69C7L;
			case 0x23: return 0x9059L;
			case 0x24: return 0x7464L;
			case 0x25: return 0x51DCL;
			case 0x26: return 0x7199L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
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
			default: return 0;
			}
		}
	}

	private static final class XJisX0208JavaCharsetEncoder extends TableCharsetEncoder {
		private XJisX0208JavaCharsetEncoder(Charset cs) {
			super(cs, 2f, 2f, new byte[]{33,41}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_FF01 = getOutput0_FF01();
		private static final char[] getOutput0_FF01() {
			return "\u2A21\u0000\u7421\u7021\u7321\u7521\u0000\u4A21\u4B21\u7621\u5C21\u2421\u0000\u2521\u3F21\u3023\u3123\u3223\u3323\u3423\u3523\u3623\u3723\u3823\u3923\u2721\u2821\u6321\u6121\u6421\u2921\u7721\u4123\u4223\u4323\u4423\u4523\u4623\u4723\u4823\u4923\u4A23\u4B23\u4C23\u4D23\u4E23\u4F23\u5023\u5123\u5223\u5323\u5423\u5523\u5623\u5723\u5823\u5923\u5A23\u4E21\u4021\u4F21\u3021\u3221\u2E21\u6123\u6223\u6323\u6423\u6523\u6623\u6723\u6823\u6923\u6A23\u6B23\u6C23\u6D23\u6E23\u6F23\u7023\u7123\u7223\u7323\u7423\u7523\u7623\u7723\u7823\u7923\u7A23\u5021\u4321\u5121".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON1244[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON1245[input - 0x401];
			if (input >= 0x2200 && input <= 0x223D) return CommonSubtables.COMMON1246[input - 0x2200];
			if (input >= 0x2500 && input <= 0x254B) return CommonSubtables.COMMON1247[input - 0x2500];
			if (input >= 0x3000 && input <= 0x301C) return CommonSubtables.COMMON1248[input - 0x3000];
			if (input >= 0x3041 && input <= 0x30FE) return CommonSubtables.COMMON1249[input - 0x3041];
			if (input >= 0x4E00 && input <= 0x4F1D) return CommonSubtables.COMMON1250[input - 0x4E00];
			if (input >= 0x4F2F && input <= 0x509A) return CommonSubtables.COMMON1251[input - 0x4F2F];
			if (input >= 0x50AC && input <= 0x5384) return CommonSubtables.COMMON1252[input - 0x50AC];
			if (input >= 0x5396 && input <= 0x5516) return CommonSubtables.COMMON1253[input - 0x5396];
			if (input >= 0x552E && input <= 0x5563) return CommonSubtables.COMMON1254[input - 0x552E];
			if (input >= 0x557B && input <= 0x55E4) return CommonSubtables.COMMON1255[input - 0x557B];
			if (input >= 0x55F7 && input <= 0x576A) return CommonSubtables.COMMON1256[input - 0x55F7];
			if (input >= 0x577F && input <= 0x5A6C) return CommonSubtables.COMMON1257[input - 0x577F];
			if (input >= 0x5ABC && input <= 0x5C79) return CommonSubtables.COMMON1258[input - 0x5ABC];
			if (input >= 0x5C8C && input <= 0x5CC7) return CommonSubtables.COMMON1259[input - 0x5C8C];
			if (input >= 0x5CD9 && input <= 0x5D29) return CommonSubtables.COMMON1260[input - 0x5CD9];
			if (input >= 0x5D4B && input <= 0x61D0) return CommonSubtables.COMMON1261[input - 0x5D4B];
			if (input >= 0x61E3 && input <= 0x6505) return CommonSubtables.COMMON1262[input - 0x61E3];
			if (input >= 0x6518 && input <= 0x6BF3) return CommonSubtables.COMMON1263[input - 0x6518];
			if (input >= 0x6C08 && input <= 0x6CF3) return CommonSubtables.COMMON1264[input - 0x6C08];
			if (input >= 0x6D0B && input <= 0x6D45) return CommonSubtables.COMMON1265[input - 0x6D0B];
			if (input >= 0x6D59 && input <= 0x6D9C) return CommonSubtables.COMMON1266[input - 0x6D59];
			if (input >= 0x6DAF && input <= 0x7099) return CommonSubtables.COMMON1267[input - 0x6DAF];
			if (input >= 0x70F1 && input <= 0x7396) return CommonSubtables.COMMON1268[input - 0x70F1];
			if (input >= 0x73A9 && input <= 0x7409) return CommonSubtables.COMMON1269[input - 0x73A9];
			if (input >= 0x7455 && input <= 0x748B) return CommonSubtables.COMMON1270[input - 0x7455];
			if (input >= 0x749E && input <= 0x760D) return CommonSubtables.COMMON1271[input - 0x749E];
			if (input >= 0x761F && input <= 0x769A) return CommonSubtables.COMMON1272[input - 0x761F];
			if (input >= 0x76AE && input <= 0x7747) return CommonSubtables.COMMON1273[input - 0x76AE];
			if (input >= 0x775A && input <= 0x7845) return CommonSubtables.COMMON1274[input - 0x775A];
			if (input >= 0x785D && input <= 0x7E9C) return CommonSubtables.COMMON1275[input - 0x785D];
			if (input >= 0x7F36 && input <= 0x8358) return CommonSubtables.COMMON1276[input - 0x7F36];
			if (input >= 0x8373 && input <= 0x84DA) return CommonSubtables.COMMON1277[input - 0x8373];
			if (input >= 0x84EC && input <= 0x878D) return CommonSubtables.COMMON1278[input - 0x84EC];
			if (input >= 0x879F && input <= 0x89C0) return CommonSubtables.COMMON1279[input - 0x879F];
			if (input >= 0x89D2 && input <= 0x8B9A) return CommonSubtables.COMMON1280[input - 0x89D2];
			if (input >= 0x8C37 && input <= 0x8D16) return CommonSubtables.COMMON1281[input - 0x8C37];
			if (input >= 0x8D64 && input <= 0x8F64) return CommonSubtables.COMMON1282[input - 0x8D64];
			if (input >= 0x8F9B && input <= 0x9091) return CommonSubtables.COMMON1283[input - 0x8F9B];
			if (input >= 0x90A3 && input <= 0x9119) return CommonSubtables.COMMON1284[input - 0x90A3];
			if (input >= 0x9149 && input <= 0x92B9) return CommonSubtables.COMMON1285[input - 0x9149];
			if (input >= 0x92E4 && input <= 0x93E8) return CommonSubtables.COMMON1286[input - 0x92E4];
			if (input >= 0x9403 && input <= 0x9481) return CommonSubtables.COMMON1287[input - 0x9403];
			if (input >= 0x9577 && input <= 0x95E5) return CommonSubtables.COMMON1288[input - 0x9577];
			if (input >= 0x961C && input <= 0x9874) return CommonSubtables.COMMON1289[input - 0x961C];
			if (input >= 0x98DB && input <= 0x9957) return CommonSubtables.COMMON1290[input - 0x98DB];
			if (input >= 0x9996 && input <= 0x9A6B) return CommonSubtables.COMMON1291[input - 0x9996];
			if (input >= 0x9AA8 && input <= 0x9B06) return CommonSubtables.COMMON1292[input - 0x9AA8];
			if (input >= 0x9B18 && input <= 0x9B5A) return CommonSubtables.COMMON1293[input - 0x9B18];
			if (input >= 0x9B6F && input <= 0x9C78) return CommonSubtables.COMMON1294[input - 0x9B6F];
			if (input >= 0x9CE5 && input <= 0x9DFD) return CommonSubtables.COMMON1295[input - 0x9CE5];
			if (input >= 0x9E75 && input <= 0x9F77) return CommonSubtables.COMMON1296[input - 0x9E75];
			if (input >= 0xFF01 && input <= 0xFF5D) return GETOUTPUT0_FF01[input - 0xFF01];
			switch (input) {
			case 0xA2: return 0x7121L;
			case 0xA3: return 0x7221L;
			case 0xA7: return 0x7821L;
			case 0xA8: return 0x2F21L;
			case 0xAC: return 0x4C22L;
			case 0xB0: return 0x6B21L;
			case 0xB1: return 0x5E21L;
			case 0xB4: return 0x2D21L;
			case 0xB6: return 0x7922L;
			case 0xD7: return 0x5F21L;
			case 0xF7: return 0x6021L;
			case 0x2010: return 0x3E21L;
			case 0x2014: return 0x3D21L;
			case 0x2016: return 0x4221L;
			case 0x2018: return 0x4621L;
			case 0x2019: return 0x4721L;
			case 0x201C: return 0x4821L;
			case 0x201D: return 0x4921L;
			case 0x2020: return 0x7722L;
			case 0x2021: return 0x7822L;
			case 0x2025: return 0x4521L;
			case 0x2026: return 0x4421L;
			case 0x2030: return 0x7322L;
			case 0x2032: return 0x6C21L;
			case 0x2033: return 0x6D21L;
			case 0x203B: return 0x2822L;
			case 0x2103: return 0x6E21L;
			case 0x212B: return 0x7222L;
			case 0x2190: return 0x2B22L;
			case 0x2191: return 0x2C22L;
			case 0x2192: return 0x2A22L;
			case 0x2193: return 0x2D22L;
			case 0x21D2: return 0x4D22L;
			case 0x21D4: return 0x4E22L;
			case 0x2252: return 0x6222L;
			case 0x2260: return 0x6221L;
			case 0x2261: return 0x6122L;
			case 0x2266: return 0x6521L;
			case 0x2267: return 0x6621L;
			case 0x226A: return 0x6322L;
			case 0x226B: return 0x6422L;
			case 0x2282: return 0x3E22L;
			case 0x2283: return 0x3F22L;
			case 0x2286: return 0x3C22L;
			case 0x2287: return 0x3D22L;
			case 0x22A5: return 0x5D22L;
			case 0x2312: return 0x5E22L;
			case 0x25A0: return 0x2322L;
			case 0x25A1: return 0x2222L;
			case 0x25B2: return 0x2522L;
			case 0x25B3: return 0x2422L;
			case 0x25BC: return 0x2722L;
			case 0x25BD: return 0x2622L;
			case 0x25C6: return 0x2122L;
			case 0x25C7: return 0x7E21L;
			case 0x25CB: return 0x7B21L;
			case 0x25CE: return 0x7D21L;
			case 0x25CF: return 0x7C21L;
			case 0x25EF: return 0x7E22L;
			case 0x2605: return 0x7A21L;
			case 0x2606: return 0x7921L;
			case 0x2640: return 0x6A21L;
			case 0x2642: return 0x6921L;
			case 0x266A: return 0x7622L;
			case 0x266D: return 0x7522L;
			case 0x266F: return 0x7422L;
			case 0x5A7F: return 0x3B4CL;
			case 0x5A92: return 0x5E47L;
			case 0x5A9A: return 0x3B55L;
			case 0x5A9B: return 0x3249L;
			case 0x70AC: return 0x595FL;
			case 0x70AD: return 0x3A43L;
			case 0x70AE: return 0x5C5FL;
			case 0x70AF: return 0x575FL;
			case 0x70B3: return 0x5B5FL;
			case 0x70B8: return 0x5A5FL;
			case 0x70B9: return 0x4045L;
			case 0x70BA: return 0x5930L;
			case 0x70C8: return 0x754EL;
			case 0x70CB: return 0x5E5FL;
			case 0x70CF: return 0x2831L;
			case 0x70D9: return 0x605FL;
			case 0x70DD: return 0x5F5FL;
			case 0x70DF: return 0x5D5FL;
			case 0x7422: return 0x7642L;
			case 0x7425: return 0x6860L;
			case 0x7432: return 0x6A60L;
			case 0x7433: return 0x564EL;
			case 0x7434: return 0x5736L;
			case 0x7435: return 0x7C48L;
			case 0x7436: return 0x4A47L;
			case 0x743A: return 0x6B60L;
			case 0x743F: return 0x6D60L;
			case 0x7441: return 0x7060L;
			case 0x912D: return 0x2245L;
			case 0x9130: return 0x436EL;
			case 0x9132: return 0x426EL;
			case 0x92CF: return 0x776EL;
			case 0x92D2: return 0x2F4BL;
			case 0x98A8: return 0x7749L;
			case 0x98AA: return 0x2471L;
			case 0x98AF: return 0x2571L;
			case 0x98B1: return 0x2671L;
			case 0x98B6: return 0x2771L;
			case 0x98C3: return 0x2971L;
			case 0x98C4: return 0x2871L;
			case 0x98C6: return 0x2A71L;
			case 0x9E1A: return 0x4073L;
			case 0x9E1B: return 0x4173L;
			case 0x9E1E: return 0x4273L;
			case 0x9F8D: return 0x364EL;
			case 0x9F95: return 0x7C73L;
			case 0x9F9C: return 0x7D73L;
			case 0x9F9D: return 0x5463L;
			case 0x9FA0: return 0x7E73L;
			case 0xFFE3: return 0x3121L;
			case 0xFFE5: return 0x6F21L;
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
