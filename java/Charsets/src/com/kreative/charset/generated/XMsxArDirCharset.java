package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMsxArDirCharset extends Charset {
	public XMsxArDirCharset() {
		super("x-msx-ar-dir", new String[]{"x-msx-ar-eu-dir"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMsxArDirCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMsxArDirCharsetEncoder(this);
	}

	private static final class XMsxArDirCharsetDecoder extends TableCharsetDecoder {
		private XMsxArDirCharsetDecoder(Charset cs) {
			super(cs, 1.43922f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_20 = getOutput0_20();
		private static final long[] getOutput0_20() {
			return new long[] {
				0x202C0020202DL, 0x202C0021202DL, 0x202C0022202DL, 0x202C0023202DL, 0x202C0024202DL, 0x25L, 0x202C0026202DL, 0x202C0027202DL, 0x202C0028202DL, 0x202C0029202DL, 0x202C002A202DL, 0x202C002B202DL, 0x2CL, 0x202C002D202DL, 0x202C002E202DL, 0x202C002F202DL,
				0x30L, 0x31L, 0x32L, 0x33L, 0x34L, 0x35L, 0x36L, 0x37L, 0x38L, 0x39L, 0x202C003A202DL, 0x3BL, 0x202C003C202DL, 0x202C003D202DL, 0x202C003E202DL, 0x3FL,
				0x202C0040202DL,
			};
		}
		private static final long[] GETOUTPUT0_7B = getOutput0_7B();
		private static final long[] getOutput0_7B() {
			return new long[] {
				0x202C007B202DL, 0x202C007C202DL, 0x202C007D202DL, 0x202C007E202DL, 0x7FL, 0x202C0020202EL, 0x202C0021202EL, 0x202C0022202EL, 0x202C0023202EL, 0x202C0024202EL, 0x66AL, 0x202C0026202EL, 0x202C0027202EL, 0x202C0029202EL, 0x202C0028202EL, 0x202C002A202EL,
				0x202C002B202EL, 0x60CL, 0x202C002D202EL, 0x202C002E202EL, 0x202C002F202EL, 0x660L, 0x661L, 0x662L, 0x663L, 0x664L, 0x665L, 0x666L, 0x667L, 0x668L, 0x669L, 0x202C003A202EL,
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
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
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

	private static final class XMsxArDirCharsetEncoder extends TableCharsetEncoder {
		private XMsxArDirCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x202D: return 0x1;
			case 0x202E: return 0x1E;
			}
			return 0;
		}
		private int getNextState1(int input) {
			if (input >= 0x20 && input <= 0x40) return CommonSubtables.COMMON1696[input - 0x20];
			switch (input) {
			case 0x5B: return 0x15;
			case 0x5C: return 0x16;
			case 0x5D: return 0x17;
			case 0x5E: return 0x18;
			case 0x5F: return 0x19;
			case 0x7B: return 0x1A;
			case 0x7C: return 0x1B;
			case 0x7D: return 0x1C;
			case 0x7E: return 0x1D;
			}
			return 0;
		}
		private int getNextState30(int input) {
			if (input >= 0x20 && input <= 0x40) return CommonSubtables.COMMON1697[input - 0x20];
			switch (input) {
			case 0x5B: return 0x32;
			case 0x5C: return 0x33;
			case 0x5D: return 0x34;
			case 0x5E: return 0x35;
			case 0x5F: return 0x36;
			case 0x7B: return 0x37;
			case 0x7C: return 0x38;
			case 0x7D: return 0x39;
			case 0x7E: return 0x3A;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 1: return getNextState1(input);
			case 30: return getNextState30(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xFE70 && input <= 0xFEFB) return CommonSubtables.COMMON1698[input - 0xFE70];
			switch (input) {
			case 0x60C: return 0x8CL;
			case 0x61B: return 0x9BL;
			case 0x61F: return 0x9FL;
			case 0x640: return 0xF1L;
			case 0x660: return 0x90L;
			case 0x661: return 0x91L;
			case 0x662: return 0x92L;
			case 0x663: return 0x93L;
			case 0x664: return 0x94L;
			case 0x665: return 0x95L;
			case 0x666: return 0x96L;
			case 0x667: return 0x97L;
			case 0x668: return 0x98L;
			case 0x669: return 0x99L;
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
			case 0x202C: return 0x3AL;
			}
			return 0;
		}
		private long getOutput17(int input) {
			switch (input) {
			case 0x202C: return 0x3CL;
			}
			return 0;
		}
		private long getOutput18(int input) {
			switch (input) {
			case 0x202C: return 0x3DL;
			}
			return 0;
		}
		private long getOutput19(int input) {
			switch (input) {
			case 0x202C: return 0x3EL;
			}
			return 0;
		}
		private long getOutput20(int input) {
			switch (input) {
			case 0x202C: return 0x40L;
			}
			return 0;
		}
		private long getOutput21(int input) {
			switch (input) {
			case 0x202C: return 0x5BL;
			}
			return 0;
		}
		private long getOutput22(int input) {
			switch (input) {
			case 0x202C: return 0x5CL;
			}
			return 0;
		}
		private long getOutput23(int input) {
			switch (input) {
			case 0x202C: return 0x5DL;
			}
			return 0;
		}
		private long getOutput24(int input) {
			switch (input) {
			case 0x202C: return 0x5EL;
			}
			return 0;
		}
		private long getOutput25(int input) {
			switch (input) {
			case 0x202C: return 0x5FL;
			}
			return 0;
		}
		private long getOutput26(int input) {
			switch (input) {
			case 0x202C: return 0x7BL;
			}
			return 0;
		}
		private long getOutput27(int input) {
			switch (input) {
			case 0x202C: return 0x7CL;
			}
			return 0;
		}
		private long getOutput28(int input) {
			switch (input) {
			case 0x202C: return 0x7DL;
			}
			return 0;
		}
		private long getOutput29(int input) {
			switch (input) {
			case 0x202C: return 0x7EL;
			}
			return 0;
		}
		private long getOutput31(int input) {
			switch (input) {
			case 0x202C: return 0x80L;
			}
			return 0;
		}
		private long getOutput32(int input) {
			switch (input) {
			case 0x202C: return 0x81L;
			}
			return 0;
		}
		private long getOutput33(int input) {
			switch (input) {
			case 0x202C: return 0x82L;
			}
			return 0;
		}
		private long getOutput34(int input) {
			switch (input) {
			case 0x202C: return 0x83L;
			}
			return 0;
		}
		private long getOutput35(int input) {
			switch (input) {
			case 0x202C: return 0x84L;
			}
			return 0;
		}
		private long getOutput36(int input) {
			switch (input) {
			case 0x202C: return 0x86L;
			}
			return 0;
		}
		private long getOutput37(int input) {
			switch (input) {
			case 0x202C: return 0x87L;
			}
			return 0;
		}
		private long getOutput38(int input) {
			switch (input) {
			case 0x202C: return 0x89L;
			}
			return 0;
		}
		private long getOutput39(int input) {
			switch (input) {
			case 0x202C: return 0x88L;
			}
			return 0;
		}
		private long getOutput40(int input) {
			switch (input) {
			case 0x202C: return 0x8AL;
			}
			return 0;
		}
		private long getOutput41(int input) {
			switch (input) {
			case 0x202C: return 0x8BL;
			}
			return 0;
		}
		private long getOutput42(int input) {
			switch (input) {
			case 0x202C: return 0x8DL;
			}
			return 0;
		}
		private long getOutput43(int input) {
			switch (input) {
			case 0x202C: return 0x8EL;
			}
			return 0;
		}
		private long getOutput44(int input) {
			switch (input) {
			case 0x202C: return 0x8FL;
			}
			return 0;
		}
		private long getOutput45(int input) {
			switch (input) {
			case 0x202C: return 0x9AL;
			}
			return 0;
		}
		private long getOutput46(int input) {
			switch (input) {
			case 0x202C: return 0x9EL;
			}
			return 0;
		}
		private long getOutput47(int input) {
			switch (input) {
			case 0x202C: return 0x9DL;
			}
			return 0;
		}
		private long getOutput48(int input) {
			switch (input) {
			case 0x202C: return 0x9CL;
			}
			return 0;
		}
		private long getOutput49(int input) {
			switch (input) {
			case 0x202C: return 0xA0L;
			}
			return 0;
		}
		private long getOutput50(int input) {
			switch (input) {
			case 0x202C: return 0xBDL;
			}
			return 0;
		}
		private long getOutput51(int input) {
			switch (input) {
			case 0x202C: return 0xBCL;
			}
			return 0;
		}
		private long getOutput52(int input) {
			switch (input) {
			case 0x202C: return 0xBBL;
			}
			return 0;
		}
		private long getOutput53(int input) {
			switch (input) {
			case 0x202C: return 0xBEL;
			}
			return 0;
		}
		private long getOutput54(int input) {
			switch (input) {
			case 0x202C: return 0xBFL;
			}
			return 0;
		}
		private long getOutput55(int input) {
			switch (input) {
			case 0x202C: return 0xDDL;
			}
			return 0;
		}
		private long getOutput56(int input) {
			switch (input) {
			case 0x202C: return 0xDCL;
			}
			return 0;
		}
		private long getOutput57(int input) {
			switch (input) {
			case 0x202C: return 0xDBL;
			}
			return 0;
		}
		private long getOutput58(int input) {
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
			default: return 0;
			}
		}
	}
}
