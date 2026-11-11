package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMsxArEuDigitsDirCharset extends Charset {
	public XMsxArEuDigitsDirCharset() {
		super("x-msx-ar-eu-digits-dir", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMsxArEuDigitsDirCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMsxArEuDigitsDirCharsetEncoder(this);
	}

	private static final class XMsxArEuDigitsDirCharsetDecoder extends TableCharsetDecoder {
		private XMsxArEuDigitsDirCharsetDecoder(Charset cs) {
			super(cs, 1.59608f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_20 = getOutput0_20();
		private static final long[] getOutput0_20() {
			return new long[] {
				0x202C0020202DL, 0x202C0021202DL, 0x202C0022202DL, 0x202C0023202DL, 0x202C0024202DL, 0x25L, 0x202C0026202DL, 0x202C0027202DL, 0x202C0028202DL, 0x202C0029202DL, 0x202C002A202DL, 0x202C002B202DL, 0x2CL, 0x202C002D202DL, 0x202C002E202DL, 0x202C002F202DL,
				0x202C0030202DL, 0x202C0031202DL, 0x202C0032202DL, 0x202C0033202DL, 0x202C0034202DL, 0x202C0035202DL, 0x202C0036202DL, 0x202C0037202DL, 0x202C0038202DL, 0x202C0039202DL, 0x202C003A202DL, 0x3BL, 0x202C003C202DL, 0x202C003D202DL, 0x202C003E202DL, 0x3FL,
				0x202C0040202DL,
			};
		}
		private static final long[] GETOUTPUT0_7B = getOutput0_7B();
		private static final long[] getOutput0_7B() {
			return new long[] {
				0x202C007B202DL, 0x202C007C202DL, 0x202C007D202DL, 0x202C007E202DL, 0x7FL, 0x202C0020202EL, 0x202C0021202EL, 0x202C0022202EL, 0x202C0023202EL, 0x202C0024202EL, 0x66AL, 0x202C0026202EL, 0x202C0027202EL, 0x202C0029202EL, 0x202C0028202EL, 0x202C002A202EL,
				0x202C002B202EL, 0x60CL, 0x202C002D202EL, 0x202C002E202EL, 0x202C002F202EL, 0x202C0030202EL, 0x202C0031202EL, 0x202C0032202EL, 0x202C0033202EL, 0x202C0034202EL, 0x202C0035202EL, 0x202C0036202EL, 0x202C0037202EL, 0x202C0038202EL, 0x202C0039202EL, 0x202C003A202EL,
				0x61BL, 0x202C003E202EL, 0x202C003D202EL, 0x202C003C202EL, 0x61FL, 0x202C0040202EL, 0xFE8BL, 0xFE89L, 0xFE91L, 0xFE8FL, 0xFE97L, 0xFE95L, 0xFE9BL, 0xFE99L, 0xFE9FL, 0xFE9DL,
				0xFEA3L, 0xFEA1L, 0xFEA7L, 0xFEA5L, 0xFEB3L, 0xFEB1L, 0xFEB7L, 0xFEB5L, 0xFEBBL, 0xFEB9L, 0xFEBFL, 0xFEBDL, 0xFEC1L, 0xFEC5L, 0xFECBL, 0xFEC9L,
				0x202C005D202EL, 0x202C005C202EL, 0x202C005B202EL, 0x202C005E202EL, 0x202C005F202EL, 0xFECCL, 0xFECAL, 0xFECFL, 0xFECDL, 0xFED0L, 0xFECEL, 0xFED3L, 0xFED1L, 0xFED7L, 0xFED5L, 0xFEDBL,
				0xFED9L, 0xFEDFL, 0xFEDDL, 0xFEE3L, 0xFEE1L, 0xFEE7L, 0xFEE5L, 0xFEEBL, 0xFEE9L, 0xFEF3L, 0xFEF1L, 0xFEF2L, 0xFE81L, 0xFE82L, 0xFE83L, 0xFE84L,
				0x202C007D202EL, 0x202C007C202EL, 0x202C007B202EL, 0x202C007E202EL, 0xFE85L, 0xFE87L, 0xFE88L, 0xFE8DL, 0xFE8EL, 0xFE93L, 0xFEA9L, 0xFEABL, 0xFEADL, 0xFEAFL, 0xFEEDL, 0xFEEFL,
				0xFEF0L, 0xFEFBL, 0xFEF7L, 0xFEF5L, 0xFEF9L, 0xFE80L, 0x640L, 0xFE70L, 0xFE72L, 0xFE74L, 0xFE76L, 0xFE77L, 0xFE78L, 0xFE79L, 0xFE7AL, 0xFE7BL,
				0xFE7CL, 0xFE7DL, 0xFE7EL, 0xFE7FL,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DAC0[input - 0x0];
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x20 && input <= 0x40) return GETOUTPUT0_20[input - 0x20];
			if (input >= 0x60 && input <= 0x7A) return input - 0x60 + 0x60;
			if (input >= 0x7B && input <= 0xFE) return GETOUTPUT0_7B[input - 0x7B];
			switch (input) {
			case 0x5B: return 0x202C005B202DL;
			case 0x5C: return 0x202C005C202DL;
			case 0x5D: return 0x202C005D202DL;
			case 0x5E: return 0x202C005E202DL;
			case 0x5F: return 0x202C005F202DL;
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

	private static final class XMsxArEuDigitsDirCharsetEncoder extends TableCharsetEncoder {
		private XMsxArEuDigitsDirCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x202D: return 0x1;
			case 0x202E: return 0x28;
			}
			return 0;
		}
		private int getNextState1(int input) {
			if (input >= 0x20 && input <= 0x40) return CommonSubtables.C4837583[input - 0x20];
			switch (input) {
			case 0x5B: return 0x1F;
			case 0x5C: return 0x20;
			case 0x5D: return 0x21;
			case 0x5E: return 0x22;
			case 0x5F: return 0x23;
			case 0x7B: return 0x24;
			case 0x7C: return 0x25;
			case 0x7D: return 0x26;
			case 0x7E: return 0x27;
			}
			return 0;
		}
		private int getNextState40(int input) {
			if (input >= 0x20 && input <= 0x40) return CommonSubtables.C709292[input - 0x20];
			switch (input) {
			case 0x5B: return 0x46;
			case 0x5C: return 0x47;
			case 0x5D: return 0x48;
			case 0x5E: return 0x49;
			case 0x5F: return 0x4A;
			case 0x7B: return 0x4B;
			case 0x7C: return 0x4C;
			case 0x7D: return 0x4D;
			case 0x7E: return 0x4E;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 1: return getNextState1(input);
			case 40: return getNextState40(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EAC0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xFE70 && input <= 0xFEFB) return CommonSubtables.C7483052[input - 0xFE70];
			switch (input) {
			case 0x60C: return 0x8CL;
			case 0x61B: return 0x9BL;
			case 0x61F: return 0x9FL;
			case 0x640: return 0xF1L;
			case 0x66A: return 0x85L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x202C: return 0x20L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0x202C: return 0x21L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x202C: return 0x22L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0x202C: return 0x23L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0x202C: return 0x24L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0x202C: return 0x26L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0x202C: return 0x27L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0x202C: return 0x28L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0x202C: return 0x29L;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0x202C: return 0x2AL;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0x202C: return 0x2BL;
			}
			return 0;
		}
		private long getOutput13(int input) {
			switch (input) {
			case 0x202C: return 0x2DL;
			}
			return 0;
		}
		private long getOutput14(int input) {
			switch (input) {
			case 0x202C: return 0x2EL;
			}
			return 0;
		}
		private long getOutput15(int input) {
			switch (input) {
			case 0x202C: return 0x2FL;
			}
			return 0;
		}
		private long getOutput16(int input) {
			switch (input) {
			case 0x202C: return 0x30L;
			}
			return 0;
		}
		private long getOutput17(int input) {
			switch (input) {
			case 0x202C: return 0x31L;
			}
			return 0;
		}
		private long getOutput18(int input) {
			switch (input) {
			case 0x202C: return 0x32L;
			}
			return 0;
		}
		private long getOutput19(int input) {
			switch (input) {
			case 0x202C: return 0x33L;
			}
			return 0;
		}
		private long getOutput20(int input) {
			switch (input) {
			case 0x202C: return 0x34L;
			}
			return 0;
		}
		private long getOutput21(int input) {
			switch (input) {
			case 0x202C: return 0x35L;
			}
			return 0;
		}
		private long getOutput22(int input) {
			switch (input) {
			case 0x202C: return 0x36L;
			}
			return 0;
		}
		private long getOutput23(int input) {
			switch (input) {
			case 0x202C: return 0x37L;
			}
			return 0;
		}
		private long getOutput24(int input) {
			switch (input) {
			case 0x202C: return 0x38L;
			}
			return 0;
		}
		private long getOutput25(int input) {
			switch (input) {
			case 0x202C: return 0x39L;
			}
			return 0;
		}
		private long getOutput26(int input) {
			switch (input) {
			case 0x202C: return 0x3AL;
			}
			return 0;
		}
		private long getOutput27(int input) {
			switch (input) {
			case 0x202C: return 0x3CL;
			}
			return 0;
		}
		private long getOutput28(int input) {
			switch (input) {
			case 0x202C: return 0x3DL;
			}
			return 0;
		}
		private long getOutput29(int input) {
			switch (input) {
			case 0x202C: return 0x3EL;
			}
			return 0;
		}
		private long getOutput30(int input) {
			switch (input) {
			case 0x202C: return 0x40L;
			}
			return 0;
		}
		private long getOutput31(int input) {
			switch (input) {
			case 0x202C: return 0x5BL;
			}
			return 0;
		}
		private long getOutput32(int input) {
			switch (input) {
			case 0x202C: return 0x5CL;
			}
			return 0;
		}
		private long getOutput33(int input) {
			switch (input) {
			case 0x202C: return 0x5DL;
			}
			return 0;
		}
		private long getOutput34(int input) {
			switch (input) {
			case 0x202C: return 0x5EL;
			}
			return 0;
		}
		private long getOutput35(int input) {
			switch (input) {
			case 0x202C: return 0x5FL;
			}
			return 0;
		}
		private long getOutput36(int input) {
			switch (input) {
			case 0x202C: return 0x7BL;
			}
			return 0;
		}
		private long getOutput37(int input) {
			switch (input) {
			case 0x202C: return 0x7CL;
			}
			return 0;
		}
		private long getOutput38(int input) {
			switch (input) {
			case 0x202C: return 0x7DL;
			}
			return 0;
		}
		private long getOutput39(int input) {
			switch (input) {
			case 0x202C: return 0x7EL;
			}
			return 0;
		}
		private long getOutput41(int input) {
			switch (input) {
			case 0x202C: return 0x80L;
			}
			return 0;
		}
		private long getOutput42(int input) {
			switch (input) {
			case 0x202C: return 0x81L;
			}
			return 0;
		}
		private long getOutput43(int input) {
			switch (input) {
			case 0x202C: return 0x82L;
			}
			return 0;
		}
		private long getOutput44(int input) {
			switch (input) {
			case 0x202C: return 0x83L;
			}
			return 0;
		}
		private long getOutput45(int input) {
			switch (input) {
			case 0x202C: return 0x84L;
			}
			return 0;
		}
		private long getOutput46(int input) {
			switch (input) {
			case 0x202C: return 0x86L;
			}
			return 0;
		}
		private long getOutput47(int input) {
			switch (input) {
			case 0x202C: return 0x87L;
			}
			return 0;
		}
		private long getOutput48(int input) {
			switch (input) {
			case 0x202C: return 0x89L;
			}
			return 0;
		}
		private long getOutput49(int input) {
			switch (input) {
			case 0x202C: return 0x88L;
			}
			return 0;
		}
		private long getOutput50(int input) {
			switch (input) {
			case 0x202C: return 0x8AL;
			}
			return 0;
		}
		private long getOutput51(int input) {
			switch (input) {
			case 0x202C: return 0x8BL;
			}
			return 0;
		}
		private long getOutput52(int input) {
			switch (input) {
			case 0x202C: return 0x8DL;
			}
			return 0;
		}
		private long getOutput53(int input) {
			switch (input) {
			case 0x202C: return 0x8EL;
			}
			return 0;
		}
		private long getOutput54(int input) {
			switch (input) {
			case 0x202C: return 0x8FL;
			}
			return 0;
		}
		private long getOutput55(int input) {
			switch (input) {
			case 0x202C: return 0x90L;
			}
			return 0;
		}
		private long getOutput56(int input) {
			switch (input) {
			case 0x202C: return 0x91L;
			}
			return 0;
		}
		private long getOutput57(int input) {
			switch (input) {
			case 0x202C: return 0x92L;
			}
			return 0;
		}
		private long getOutput58(int input) {
			switch (input) {
			case 0x202C: return 0x93L;
			}
			return 0;
		}
		private long getOutput59(int input) {
			switch (input) {
			case 0x202C: return 0x94L;
			}
			return 0;
		}
		private long getOutput60(int input) {
			switch (input) {
			case 0x202C: return 0x95L;
			}
			return 0;
		}
		private long getOutput61(int input) {
			switch (input) {
			case 0x202C: return 0x96L;
			}
			return 0;
		}
		private long getOutput62(int input) {
			switch (input) {
			case 0x202C: return 0x97L;
			}
			return 0;
		}
		private long getOutput63(int input) {
			switch (input) {
			case 0x202C: return 0x98L;
			}
			return 0;
		}
		private long getOutput64(int input) {
			switch (input) {
			case 0x202C: return 0x99L;
			}
			return 0;
		}
		private long getOutput65(int input) {
			switch (input) {
			case 0x202C: return 0x9AL;
			}
			return 0;
		}
		private long getOutput66(int input) {
			switch (input) {
			case 0x202C: return 0x9EL;
			}
			return 0;
		}
		private long getOutput67(int input) {
			switch (input) {
			case 0x202C: return 0x9DL;
			}
			return 0;
		}
		private long getOutput68(int input) {
			switch (input) {
			case 0x202C: return 0x9CL;
			}
			return 0;
		}
		private long getOutput69(int input) {
			switch (input) {
			case 0x202C: return 0xA0L;
			}
			return 0;
		}
		private long getOutput70(int input) {
			switch (input) {
			case 0x202C: return 0xBDL;
			}
			return 0;
		}
		private long getOutput71(int input) {
			switch (input) {
			case 0x202C: return 0xBCL;
			}
			return 0;
		}
		private long getOutput72(int input) {
			switch (input) {
			case 0x202C: return 0xBBL;
			}
			return 0;
		}
		private long getOutput73(int input) {
			switch (input) {
			case 0x202C: return 0xBEL;
			}
			return 0;
		}
		private long getOutput74(int input) {
			switch (input) {
			case 0x202C: return 0xBFL;
			}
			return 0;
		}
		private long getOutput75(int input) {
			switch (input) {
			case 0x202C: return 0xDDL;
			}
			return 0;
		}
		private long getOutput76(int input) {
			switch (input) {
			case 0x202C: return 0xDCL;
			}
			return 0;
		}
		private long getOutput77(int input) {
			switch (input) {
			case 0x202C: return 0xDBL;
			}
			return 0;
		}
		private long getOutput78(int input) {
			switch (input) {
			case 0x202C: return 0xDEL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
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
			default: return 0;
			}
		}
	}
}
