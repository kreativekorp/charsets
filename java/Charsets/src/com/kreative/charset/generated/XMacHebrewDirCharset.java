package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacHebrewDirCharset extends Charset {
	public XMacHebrewDirCharset() {
		super("x-MacHebrew-dir", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacHebrewDirCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacHebrewDirCharsetEncoder(this);
	}

	private static final class XMacHebrewDirCharsetDecoder extends TableCharsetDecoder {
		private XMacHebrewDirCharsetDecoder(Charset cs) {
			super(cs, 1.57031f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_20 = getOutput0_20();
		private static final long[] getOutput0_20() {
			return new long[] {
				0x202C0020202DL, 0x202C0021202DL, 0x202C0022202DL, 0x202C0023202DL, 0x202C0024202DL, 0x202C0025202DL, 0x26L, 0x202C0027202DL, 0x202C0028202DL, 0x202C0029202DL, 0x202C002A202DL, 0x202C002B202DL, 0x202C002C202DL, 0x202C002D202DL, 0x202C002E202DL, 0x202C002F202DL,
				0x30L, 0x31L, 0x32L, 0x33L, 0x34L, 0x35L, 0x36L, 0x37L, 0x38L, 0x39L, 0x202C003A202DL, 0x202C003B202DL, 0x202C003C202DL, 0x202C003D202DL, 0x202C003E202DL, 0x202C003F202DL,
			};
		}
		private static final long[] GETOUTPUT0_7B = getOutput0_7B();
		private static final long[] getOutput0_7B() {
			return new long[] {
				0x202C007B202DL, 0x202C007C202DL, 0x202C007D202DL, 0x7EL, 0x7FL, 0xC4L, 0x5B705F2L, 0xC7L, 0xC9L, 0xD1L, 0xD6L, 0xDCL, 0xE1L, 0xE0L, 0xE2L, 0xE4L,
				0xE3L, 0xE5L, 0xE7L, 0xE9L, 0xE8L, 0xEAL, 0xEBL, 0xEDL, 0xECL, 0xEEL, 0xEFL, 0xF1L, 0xF3L, 0xF2L, 0xF4L, 0xF6L,
				0xF5L, 0xFAL, 0xF9L, 0xFBL, 0xFCL, 0x202C0020202EL, 0x202C0021202EL, 0x202C0022202EL, 0x202C0023202EL, 0x202C0024202EL, 0x202C0025202EL, 0x20AAL, 0x202C0027202EL, 0x202C0029202EL, 0x202C0028202EL, 0x202C002A202EL,
				0x202C002B202EL, 0x202C002C202EL, 0x202C002D202EL, 0x202C002E202EL, 0x202C002F202EL, 0x202C0030202EL, 0x202C0031202EL, 0x202C0032202EL, 0x202C0033202EL, 0x202C0034202EL, 0x202C0035202EL, 0x202C0036202EL, 0x202C0037202EL, 0x202C0038202EL, 0x202C0039202EL, 0x202C003A202EL,
				0x202C003B202EL, 0x202C003C202EL, 0x202C003D202EL, 0x202C003E202EL, 0x202C003F202EL, 0x5B905DCF86AL, 0x202C201E202EL, 0xF89BL, 0xF89CL, 0xF89DL, 0xF89EL, 0x5BCL, 0xFB4BL, 0xFB35L, 0x202C2026202EL, 0x202C00A0202EL,
				0x5B8L, 0x5B7L, 0x5B5L, 0x5B6L, 0x5B4L, 0x202C2013202EL, 0x202C2014202EL, 0x202C201C202EL, 0x202C201D202EL, 0x202C2018202EL, 0x202C2019202EL, 0xFB2AL, 0xFB2BL, 0x5BFL, 0x5B0L, 0x5B2L,
				0x5B1L, 0x5BBL, 0x5B9L, 0xF87F05B8L, 0x5B3L,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x40 && input <= 0x5A) return input - 0x40 + 0x40;
			if (input >= 0x20 && input <= 0x3F) return GETOUTPUT0_20[input - 0x20];
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0x5E;
			if (input >= 0xE0 && input <= 0xFA) return input - 0xE0 + 0x5D0;
			if (input >= 0x7B && input <= 0xDF) return GETOUTPUT0_7B[input - 0x7B];
			switch (input) {
			case 0x5B: return 0x202C005B202DL;
			case 0x5C: return 0x5CL;
			case 0x5D: return 0x202C005D202DL;
			case 0xFB: return 0x202C007D202EL;
			case 0xFC: return 0x202C005D202EL;
			case 0xFD: return 0x202C007B202EL;
			case 0xFE: return 0x202C005B202EL;
			case 0xFF: return 0x202C007C202EL;
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

	private static final class XMacHebrewDirCharsetEncoder extends TableCharsetEncoder {
		private XMacHebrewDirCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x5B8: return 0x1;
			case 0x5F2: return 0x2;
			case 0x202D: return 0x3;
			case 0x202E: return 0x1E;
			case 0xF86A: return 0x4C;
			}
			return 0;
		}
		private static final char[] GETNEXTSTATE3_20 = getNextState3_20();
		private static final char[] getNextState3_20() {
			return "\u0004\u0005\u0006\u0007\b\t\u0000\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0013\u0014\u0015\u0016\u0017\u0018".toCharArray();
		}
		private int getNextState3(int input) {
			if (input >= 0x20 && input <= 0x3F) return GETNEXTSTATE3_20[input - 0x20];
			switch (input) {
			case 0x5B: return 0x19;
			case 0x5D: return 0x1A;
			case 0x7B: return 0x1B;
			case 0x7C: return 0x1C;
			case 0x7D: return 0x1D;
			}
			return 0;
		}
		private int getNextState30(int input) {
			if (input >= 0x27 && input <= 0x3F) return input - 0x27 + 0x25;
			switch (input) {
			case 0x20: return 0x1F;
			case 0x21: return 0x20;
			case 0x22: return 0x21;
			case 0x23: return 0x22;
			case 0x24: return 0x23;
			case 0x25: return 0x24;
			case 0x5B: return 0x3E;
			case 0x5D: return 0x3F;
			case 0x7B: return 0x40;
			case 0x7C: return 0x41;
			case 0x7D: return 0x42;
			case 0xA0: return 0x43;
			case 0x2013: return 0x44;
			case 0x2014: return 0x45;
			case 0x2018: return 0x46;
			case 0x2019: return 0x47;
			case 0x201C: return 0x48;
			case 0x201D: return 0x49;
			case 0x201E: return 0x4A;
			case 0x2026: return 0x4B;
			}
			return 0;
		}
		private int getNextState76(int input) {
			switch (input) {
			case 0x5DC: return 0x4D;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 3: return getNextState3(input);
			case 30: return getNextState30(input);
			case 76: return getNextState76(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xC4 && input <= 0xFC) return CommonSubtables.COMMON1143[input - 0xC4];
			if (input >= 0x5D0 && input <= 0x5EA) return input - 0x5D0 + 0xE0;
			switch (input) {
			case 0xA0: return 0xCAL;
			case 0x5B0: return 0xD9L;
			case 0x5B1: return 0xDBL;
			case 0x5B2: return 0xDAL;
			case 0x5B3: return 0xDFL;
			case 0x5B4: return 0xCFL;
			case 0x5B5: return 0xCDL;
			case 0x5B6: return 0xCEL;
			case 0x5B7: return 0xCCL;
			case 0x5B8: return 0xCBL;
			case 0x5B9: return 0xDDL;
			case 0x5BB: return 0xDCL;
			case 0x5BC: return 0xC6L;
			case 0x5BF: return 0xD8L;
			case 0x2013: return 0xD0L;
			case 0x2014: return 0xD1L;
			case 0x2018: return 0xD4L;
			case 0x2019: return 0xD5L;
			case 0x201C: return 0xD2L;
			case 0x201D: return 0xD3L;
			case 0x201E: return 0xC1L;
			case 0x2026: return 0xC9L;
			case 0x20AA: return 0xA6L;
			case 0xF89B: return 0xC2L;
			case 0xF89C: return 0xC3L;
			case 0xF89D: return 0xC4L;
			case 0xF89E: return 0xC5L;
			case 0xFB2A: return 0xD6L;
			case 0xFB2B: return 0xD7L;
			case 0xFB35: return 0xC8L;
			case 0xFB4B: return 0xC7L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xF87F: return 0xDEL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x5B7: return 0x81L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x202C: return 0x20L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0x202C: return 0x21L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0x202C: return 0x22L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0x202C: return 0x23L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0x202C: return 0x24L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0x202C: return 0x25L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0x202C: return 0x27L;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0x202C: return 0x28L;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0x202C: return 0x29L;
			}
			return 0;
		}
		private long getOutput13(int input) {
			switch (input) {
			case 0x202C: return 0x2AL;
			}
			return 0;
		}
		private long getOutput14(int input) {
			switch (input) {
			case 0x202C: return 0x2BL;
			}
			return 0;
		}
		private long getOutput15(int input) {
			switch (input) {
			case 0x202C: return 0x2CL;
			}
			return 0;
		}
		private long getOutput16(int input) {
			switch (input) {
			case 0x202C: return 0x2DL;
			}
			return 0;
		}
		private long getOutput17(int input) {
			switch (input) {
			case 0x202C: return 0x2EL;
			}
			return 0;
		}
		private long getOutput18(int input) {
			switch (input) {
			case 0x202C: return 0x2FL;
			}
			return 0;
		}
		private long getOutput19(int input) {
			switch (input) {
			case 0x202C: return 0x3AL;
			}
			return 0;
		}
		private long getOutput20(int input) {
			switch (input) {
			case 0x202C: return 0x3BL;
			}
			return 0;
		}
		private long getOutput21(int input) {
			switch (input) {
			case 0x202C: return 0x3CL;
			}
			return 0;
		}
		private long getOutput22(int input) {
			switch (input) {
			case 0x202C: return 0x3DL;
			}
			return 0;
		}
		private long getOutput23(int input) {
			switch (input) {
			case 0x202C: return 0x3EL;
			}
			return 0;
		}
		private long getOutput24(int input) {
			switch (input) {
			case 0x202C: return 0x3FL;
			}
			return 0;
		}
		private long getOutput25(int input) {
			switch (input) {
			case 0x202C: return 0x5BL;
			}
			return 0;
		}
		private long getOutput26(int input) {
			switch (input) {
			case 0x202C: return 0x5DL;
			}
			return 0;
		}
		private long getOutput27(int input) {
			switch (input) {
			case 0x202C: return 0x7BL;
			}
			return 0;
		}
		private long getOutput28(int input) {
			switch (input) {
			case 0x202C: return 0x7CL;
			}
			return 0;
		}
		private long getOutput29(int input) {
			switch (input) {
			case 0x202C: return 0x7DL;
			}
			return 0;
		}
		private long getOutput31(int input) {
			switch (input) {
			case 0x202C: return 0xA0L;
			}
			return 0;
		}
		private long getOutput32(int input) {
			switch (input) {
			case 0x202C: return 0xA1L;
			}
			return 0;
		}
		private long getOutput33(int input) {
			switch (input) {
			case 0x202C: return 0xA2L;
			}
			return 0;
		}
		private long getOutput34(int input) {
			switch (input) {
			case 0x202C: return 0xA3L;
			}
			return 0;
		}
		private long getOutput35(int input) {
			switch (input) {
			case 0x202C: return 0xA4L;
			}
			return 0;
		}
		private long getOutput36(int input) {
			switch (input) {
			case 0x202C: return 0xA5L;
			}
			return 0;
		}
		private long getOutput37(int input) {
			switch (input) {
			case 0x202C: return 0xA7L;
			}
			return 0;
		}
		private long getOutput38(int input) {
			switch (input) {
			case 0x202C: return 0xA9L;
			}
			return 0;
		}
		private long getOutput39(int input) {
			switch (input) {
			case 0x202C: return 0xA8L;
			}
			return 0;
		}
		private long getOutput40(int input) {
			switch (input) {
			case 0x202C: return 0xAAL;
			}
			return 0;
		}
		private long getOutput41(int input) {
			switch (input) {
			case 0x202C: return 0xABL;
			}
			return 0;
		}
		private long getOutput42(int input) {
			switch (input) {
			case 0x202C: return 0xACL;
			}
			return 0;
		}
		private long getOutput43(int input) {
			switch (input) {
			case 0x202C: return 0xADL;
			}
			return 0;
		}
		private long getOutput44(int input) {
			switch (input) {
			case 0x202C: return 0xAEL;
			}
			return 0;
		}
		private long getOutput45(int input) {
			switch (input) {
			case 0x202C: return 0xAFL;
			}
			return 0;
		}
		private long getOutput46(int input) {
			switch (input) {
			case 0x202C: return 0xB0L;
			}
			return 0;
		}
		private long getOutput47(int input) {
			switch (input) {
			case 0x202C: return 0xB1L;
			}
			return 0;
		}
		private long getOutput48(int input) {
			switch (input) {
			case 0x202C: return 0xB2L;
			}
			return 0;
		}
		private long getOutput49(int input) {
			switch (input) {
			case 0x202C: return 0xB3L;
			}
			return 0;
		}
		private long getOutput50(int input) {
			switch (input) {
			case 0x202C: return 0xB4L;
			}
			return 0;
		}
		private long getOutput51(int input) {
			switch (input) {
			case 0x202C: return 0xB5L;
			}
			return 0;
		}
		private long getOutput52(int input) {
			switch (input) {
			case 0x202C: return 0xB6L;
			}
			return 0;
		}
		private long getOutput53(int input) {
			switch (input) {
			case 0x202C: return 0xB7L;
			}
			return 0;
		}
		private long getOutput54(int input) {
			switch (input) {
			case 0x202C: return 0xB8L;
			}
			return 0;
		}
		private long getOutput55(int input) {
			switch (input) {
			case 0x202C: return 0xB9L;
			}
			return 0;
		}
		private long getOutput56(int input) {
			switch (input) {
			case 0x202C: return 0xBAL;
			}
			return 0;
		}
		private long getOutput57(int input) {
			switch (input) {
			case 0x202C: return 0xBBL;
			}
			return 0;
		}
		private long getOutput58(int input) {
			switch (input) {
			case 0x202C: return 0xBCL;
			}
			return 0;
		}
		private long getOutput59(int input) {
			switch (input) {
			case 0x202C: return 0xBDL;
			}
			return 0;
		}
		private long getOutput60(int input) {
			switch (input) {
			case 0x202C: return 0xBEL;
			}
			return 0;
		}
		private long getOutput61(int input) {
			switch (input) {
			case 0x202C: return 0xBFL;
			}
			return 0;
		}
		private long getOutput62(int input) {
			switch (input) {
			case 0x202C: return 0xFEL;
			}
			return 0;
		}
		private long getOutput63(int input) {
			switch (input) {
			case 0x202C: return 0xFCL;
			}
			return 0;
		}
		private long getOutput64(int input) {
			switch (input) {
			case 0x202C: return 0xFDL;
			}
			return 0;
		}
		private long getOutput65(int input) {
			switch (input) {
			case 0x202C: return 0xFF01L;
			}
			return 0;
		}
		private long getOutput66(int input) {
			switch (input) {
			case 0x202C: return 0xFBL;
			}
			return 0;
		}
		private long getOutput67(int input) {
			switch (input) {
			case 0x202C: return 0xCAL;
			}
			return 0;
		}
		private long getOutput68(int input) {
			switch (input) {
			case 0x202C: return 0xD0L;
			}
			return 0;
		}
		private long getOutput69(int input) {
			switch (input) {
			case 0x202C: return 0xD1L;
			}
			return 0;
		}
		private long getOutput70(int input) {
			switch (input) {
			case 0x202C: return 0xD4L;
			}
			return 0;
		}
		private long getOutput71(int input) {
			switch (input) {
			case 0x202C: return 0xD5L;
			}
			return 0;
		}
		private long getOutput72(int input) {
			switch (input) {
			case 0x202C: return 0xD2L;
			}
			return 0;
		}
		private long getOutput73(int input) {
			switch (input) {
			case 0x202C: return 0xD3L;
			}
			return 0;
		}
		private long getOutput74(int input) {
			switch (input) {
			case 0x202C: return 0xC1L;
			}
			return 0;
		}
		private long getOutput75(int input) {
			switch (input) {
			case 0x202C: return 0xC9L;
			}
			return 0;
		}
		private long getOutput77(int input) {
			switch (input) {
			case 0x5B9: return 0xC0L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
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
			case 77: return getOutput77(input);
			default: return 0;
			}
		}
	}
}
