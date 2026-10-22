package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacGurmukhiCharset extends Charset {
	public XMacGurmukhiCharset() {
		super("x-MacGurmukhi", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacGurmukhiCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacGurmukhiCharsetEncoder(this);
	}

	private static final class XMacGurmukhiCharsetDecoder extends TableCharsetDecoder {
		private XMacGurmukhiCharsetDecoder(Charset cs) {
			super(cs, 1f, 3f, 5);
		}
		private static final char[] GETNEXTSTATE0_B3 = getNextState0_B3();
		private static final char[] getNextState0_B3() {
			return new char[] {
				0x6, 0x1, 0x2, 0xA, 0xC, 0xE, 0x10, 0x3, 0x13, 0x15, 0x17, 0x19, 0x1B, 0x1D, 0x1F, 0x21,
				0x23, 0x25, 0x27, 0x29, 0, 0x2B, 0x4, 0x2E, 0x30, 0x32, 0x34, 0, 0x36, 0, 0x38, 0,
				0, 0x3A, 0x3C, 0, 0x3E, 0x40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x5,
			};
		}
		private int getNextState0(int input) {
			if (input >= 0xB3 && input <= 0xE8) return GETNEXTSTATE0_B3[input - 0xB3];
			return 0;
		}
		private int getNextState1(int input) {
			switch (input) {
			case 0xE8: return 0x8;
			case 0xE9: return 0x42;
			}
			return 0;
		}
		private int getNextState2(int input) {
			switch (input) {
			case 0xE8: return 0x9;
			case 0xE9: return 0x45;
			}
			return 0;
		}
		private int getNextState3(int input) {
			switch (input) {
			case 0xE8: return 0x12;
			case 0xE9: return 0x48;
			}
			return 0;
		}
		private int getNextState4(int input) {
			switch (input) {
			case 0xE8: return 0x2D;
			case 0xE9: return 0x4B;
			}
			return 0;
		}
		private int getNextState6(int input) {
			switch (input) {
			case 0xE8: return 0x7;
			}
			return 0;
		}
		private int getNextState10(int input) {
			switch (input) {
			case 0xE8: return 0xB;
			}
			return 0;
		}
		private int getNextState12(int input) {
			switch (input) {
			case 0xE8: return 0xD;
			}
			return 0;
		}
		private int getNextState14(int input) {
			switch (input) {
			case 0xE8: return 0xF;
			}
			return 0;
		}
		private int getNextState16(int input) {
			switch (input) {
			case 0xE8: return 0x11;
			}
			return 0;
		}
		private int getNextState19(int input) {
			switch (input) {
			case 0xE8: return 0x14;
			}
			return 0;
		}
		private int getNextState21(int input) {
			switch (input) {
			case 0xE8: return 0x16;
			}
			return 0;
		}
		private int getNextState23(int input) {
			switch (input) {
			case 0xE8: return 0x18;
			}
			return 0;
		}
		private int getNextState25(int input) {
			switch (input) {
			case 0xE8: return 0x1A;
			}
			return 0;
		}
		private int getNextState27(int input) {
			switch (input) {
			case 0xE8: return 0x1C;
			}
			return 0;
		}
		private int getNextState29(int input) {
			switch (input) {
			case 0xE8: return 0x1E;
			}
			return 0;
		}
		private int getNextState31(int input) {
			switch (input) {
			case 0xE8: return 0x20;
			}
			return 0;
		}
		private int getNextState33(int input) {
			switch (input) {
			case 0xE8: return 0x22;
			}
			return 0;
		}
		private int getNextState35(int input) {
			switch (input) {
			case 0xE8: return 0x24;
			}
			return 0;
		}
		private int getNextState37(int input) {
			switch (input) {
			case 0xE8: return 0x26;
			}
			return 0;
		}
		private int getNextState39(int input) {
			switch (input) {
			case 0xE8: return 0x28;
			}
			return 0;
		}
		private int getNextState41(int input) {
			switch (input) {
			case 0xE8: return 0x2A;
			}
			return 0;
		}
		private int getNextState43(int input) {
			switch (input) {
			case 0xE8: return 0x2C;
			}
			return 0;
		}
		private int getNextState46(int input) {
			switch (input) {
			case 0xE8: return 0x2F;
			}
			return 0;
		}
		private int getNextState48(int input) {
			switch (input) {
			case 0xE8: return 0x31;
			}
			return 0;
		}
		private int getNextState50(int input) {
			switch (input) {
			case 0xE8: return 0x33;
			}
			return 0;
		}
		private int getNextState52(int input) {
			switch (input) {
			case 0xE8: return 0x35;
			}
			return 0;
		}
		private int getNextState54(int input) {
			switch (input) {
			case 0xE8: return 0x37;
			}
			return 0;
		}
		private int getNextState56(int input) {
			switch (input) {
			case 0xE8: return 0x39;
			}
			return 0;
		}
		private int getNextState58(int input) {
			switch (input) {
			case 0xE8: return 0x3B;
			}
			return 0;
		}
		private int getNextState60(int input) {
			switch (input) {
			case 0xE8: return 0x3D;
			}
			return 0;
		}
		private int getNextState62(int input) {
			switch (input) {
			case 0xE8: return 0x3F;
			}
			return 0;
		}
		private int getNextState64(int input) {
			switch (input) {
			case 0xE8: return 0x41;
			}
			return 0;
		}
		private int getNextState66(int input) {
			switch (input) {
			case 0xE8: return 0x43;
			}
			return 0;
		}
		private int getNextState67(int input) {
			switch (input) {
			case 0xB4: return 0x44;
			}
			return 0;
		}
		private int getNextState69(int input) {
			switch (input) {
			case 0xE8: return 0x46;
			}
			return 0;
		}
		private int getNextState70(int input) {
			switch (input) {
			case 0xB5: return 0x47;
			}
			return 0;
		}
		private int getNextState72(int input) {
			switch (input) {
			case 0xE8: return 0x49;
			}
			return 0;
		}
		private int getNextState73(int input) {
			switch (input) {
			case 0xBA: return 0x4A;
			}
			return 0;
		}
		private int getNextState75(int input) {
			switch (input) {
			case 0xE8: return 0x4C;
			}
			return 0;
		}
		private int getNextState76(int input) {
			switch (input) {
			case 0xC9: return 0x4D;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 1: return getNextState1(input);
			case 2: return getNextState2(input);
			case 3: return getNextState3(input);
			case 4: return getNextState4(input);
			case 6: return getNextState6(input);
			case 10: return getNextState10(input);
			case 12: return getNextState12(input);
			case 14: return getNextState14(input);
			case 16: return getNextState16(input);
			case 19: return getNextState19(input);
			case 21: return getNextState21(input);
			case 23: return getNextState23(input);
			case 25: return getNextState25(input);
			case 27: return getNextState27(input);
			case 29: return getNextState29(input);
			case 31: return getNextState31(input);
			case 33: return getNextState33(input);
			case 35: return getNextState35(input);
			case 37: return getNextState37(input);
			case 39: return getNextState39(input);
			case 41: return getNextState41(input);
			case 43: return getNextState43(input);
			case 46: return getNextState46(input);
			case 48: return getNextState48(input);
			case 50: return getNextState50(input);
			case 52: return getNextState52(input);
			case 54: return getNextState54(input);
			case 56: return getNextState56(input);
			case 58: return getNextState58(input);
			case 60: return getNextState60(input);
			case 62: return getNextState62(input);
			case 64: return getNextState64(input);
			case 66: return getNextState66(input);
			case 67: return getNextState67(input);
			case 69: return getNextState69(input);
			case 70: return getNextState70(input);
			case 72: return getNextState72(input);
			case 73: return getNextState73(input);
			case 75: return getNextState75(input);
			case 76: return getNextState76(input);
			default: return 0;
			}
		}
		private static final long[] GETOUTPUT0_0 = getOutput0_0();
		private static final long[] getOutput0_0() {
			return new long[] {
				0xFFFEL, 0x1L, 0x2L, 0x3L, 0x4L, 0x5L, 0x6L, 0x7L, 0x8L, 0x9L, 0xAL, 0xBL, 0xCL, 0xDL, 0xEL, 0xFL,
				0x10L, 0x11L, 0x12L, 0x13L, 0x14L, 0x15L, 0x16L, 0x17L, 0x18L, 0x19L, 0x1AL, 0x1BL, 0x1CL, 0x1DL, 0x1EL, 0x1FL,
				0x20L, 0x21L, 0x22L, 0x23L, 0x24L, 0x25L, 0x26L, 0x27L, 0x28L, 0x29L, 0x2AL, 0x2BL, 0x2CL, 0x2DL, 0x2EL, 0x2FL,
				0x30L, 0x31L, 0x32L, 0x33L, 0x34L, 0x35L, 0x36L, 0x37L, 0x38L, 0x39L, 0x3AL, 0x3BL, 0x3CL, 0x3DL, 0x3EL, 0x3FL,
				0x40L, 0x41L, 0x42L, 0x43L, 0x44L, 0x45L, 0x46L, 0x47L, 0x48L, 0x49L, 0x4AL, 0x4BL, 0x4CL, 0x4DL, 0x4EL, 0x4FL,
				0x50L, 0x51L, 0x52L, 0x53L, 0x54L, 0x55L, 0x56L, 0x57L, 0x58L, 0x59L, 0x5AL, 0x5BL, 0x5CL, 0x5DL, 0x5EL, 0x5FL,
				0x60L, 0x61L, 0x62L, 0x63L, 0x64L, 0x65L, 0x66L, 0x67L, 0x68L, 0x69L, 0x6AL, 0x6BL, 0x6CL, 0x6DL, 0x6EL, 0x6FL,
				0x70L, 0x71L, 0x72L, 0x73L, 0x74L, 0x75L, 0x76L, 0x77L, 0x78L, 0x79L, 0x7AL, 0x7BL, 0x7CL, 0x7DL, 0x7EL, 0x7FL,
				0xD7L, 0x2212L, 0x2013L, 0x2014L, 0x2018L, 0x2019L, 0x2026L, 0x2022L, 0xA9L, 0xAEL, 0x2122L, 0, 0, 0, 0, 0,
				0xA71L, 0xA5CL, 0xA73L, 0xA72L, 0xA74L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0xA02L, 0, 0xA05L, 0xA06L, 0xA07L, 0xA08L, 0xA09L, 0xA0AL, 0, 0, 0xA0FL, 0xA10L, 0, 0,
				0xA13L, 0xA14L, 0, 0xA15L, 0xA16L, 0xA17L, 0xA18L, 0xA19L, 0xA1AL, 0xA1BL, 0xA1CL, 0xA1DL, 0xA1EL, 0xA1FL, 0xA20L, 0xA21L,
				0xA22L, 0xA23L, 0xA24L, 0xA25L, 0xA26L, 0xA27L, 0xA28L, 0, 0xA2AL, 0xA2BL, 0xA2CL, 0xA2DL, 0xA2EL, 0xA2FL, 0, 0xA30L,
				0, 0xA32L, 0, 0, 0xA35L, 0xA3C0A38F860L, 0, 0xA38L, 0xA39L, 0x200EL, 0xA3EL, 0xA3FL, 0xA40L, 0xA41L, 0xA42L, 0,
				0, 0xA47L, 0xA48L, 0, 0, 0xA4BL, 0xA4CL, 0, 0xA4DL, 0xA3CL, 0x964L, 0, 0, 0, 0, 0,
				0, 0xA66L, 0xA67L, 0xA68L, 0xA69L, 0xA6AL, 0xA6BL, 0xA6CL, 0xA6DL, 0xA6EL, 0xA6FL,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0xFA) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xE9: return 0xA59L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xE9: return 0xA5AL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xE9: return 0xA5BL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xE9: return 0xA5EL;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xE8: return 0x200C0A4DL;
			case 0xE9: return 0x200D0A4DL;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0xB3: return 0xA150A71L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0xB4: return 0xA160A71L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0xB5: return 0xA170A71L;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0xB6: return 0xA180A71L;
			}
			return 0;
		}
		private long getOutput13(int input) {
			switch (input) {
			case 0xB7: return 0xA190A71L;
			}
			return 0;
		}
		private long getOutput15(int input) {
			switch (input) {
			case 0xB8: return 0xA1A0A71L;
			}
			return 0;
		}
		private long getOutput17(int input) {
			switch (input) {
			case 0xB9: return 0xA1B0A71L;
			}
			return 0;
		}
		private long getOutput18(int input) {
			switch (input) {
			case 0xBA: return 0xA1C0A71L;
			}
			return 0;
		}
		private long getOutput20(int input) {
			switch (input) {
			case 0xBB: return 0xA1D0A71L;
			}
			return 0;
		}
		private long getOutput22(int input) {
			switch (input) {
			case 0xBC: return 0xA1E0A71L;
			}
			return 0;
		}
		private long getOutput24(int input) {
			switch (input) {
			case 0xBD: return 0xA1F0A71L;
			}
			return 0;
		}
		private long getOutput26(int input) {
			switch (input) {
			case 0xBE: return 0xA200A71L;
			}
			return 0;
		}
		private long getOutput28(int input) {
			switch (input) {
			case 0xBF: return 0xA210A71L;
			}
			return 0;
		}
		private long getOutput30(int input) {
			switch (input) {
			case 0xC0: return 0xA220A71L;
			}
			return 0;
		}
		private long getOutput32(int input) {
			switch (input) {
			case 0xC1: return 0xA230A71L;
			}
			return 0;
		}
		private long getOutput34(int input) {
			switch (input) {
			case 0xC2: return 0xA240A71L;
			}
			return 0;
		}
		private long getOutput36(int input) {
			switch (input) {
			case 0xC3: return 0xA250A71L;
			}
			return 0;
		}
		private long getOutput38(int input) {
			switch (input) {
			case 0xC4: return 0xA260A71L;
			}
			return 0;
		}
		private long getOutput40(int input) {
			switch (input) {
			case 0xC5: return 0xA270A71L;
			}
			return 0;
		}
		private long getOutput42(int input) {
			switch (input) {
			case 0xC6: return 0xA280A71L;
			}
			return 0;
		}
		private long getOutput44(int input) {
			switch (input) {
			case 0xC8: return 0xA2A0A71L;
			}
			return 0;
		}
		private long getOutput45(int input) {
			switch (input) {
			case 0xC9: return 0xA2B0A71L;
			}
			return 0;
		}
		private long getOutput47(int input) {
			switch (input) {
			case 0xCA: return 0xA2C0A71L;
			}
			return 0;
		}
		private long getOutput49(int input) {
			switch (input) {
			case 0xCB: return 0xA2D0A71L;
			}
			return 0;
		}
		private long getOutput51(int input) {
			switch (input) {
			case 0xCC: return 0xA2E0A71L;
			}
			return 0;
		}
		private long getOutput53(int input) {
			switch (input) {
			case 0xCD: return 0xA2F0A71L;
			}
			return 0;
		}
		private long getOutput55(int input) {
			switch (input) {
			case 0xCF: return 0xA300A71L;
			}
			return 0;
		}
		private long getOutput57(int input) {
			switch (input) {
			case 0xD1: return 0xA320A71L;
			}
			return 0;
		}
		private long getOutput59(int input) {
			switch (input) {
			case 0xD4: return 0xA350A71L;
			}
			return 0;
		}
		private long getOutput61(int input) {
			switch (input) {
			case 0xD5: return 0xA3C0A38F8600A71L;
			}
			return 0;
		}
		private long getOutput63(int input) {
			switch (input) {
			case 0xD7: return 0xA380A71L;
			}
			return 0;
		}
		private long getOutput65(int input) {
			switch (input) {
			case 0xD8: return 0xA390A71L;
			}
			return 0;
		}
		private long getOutput68(int input) {
			switch (input) {
			case 0xE9: return 0xA590A71L;
			}
			return 0;
		}
		private long getOutput71(int input) {
			switch (input) {
			case 0xE9: return 0xA5A0A71L;
			}
			return 0;
		}
		private long getOutput74(int input) {
			switch (input) {
			case 0xE9: return 0xA5B0A71L;
			}
			return 0;
		}
		private long getOutput77(int input) {
			switch (input) {
			case 0xE9: return 0xA5E0A71L;
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
			case 7: return getOutput7(input);
			case 8: return getOutput8(input);
			case 9: return getOutput9(input);
			case 11: return getOutput11(input);
			case 13: return getOutput13(input);
			case 15: return getOutput15(input);
			case 17: return getOutput17(input);
			case 18: return getOutput18(input);
			case 20: return getOutput20(input);
			case 22: return getOutput22(input);
			case 24: return getOutput24(input);
			case 26: return getOutput26(input);
			case 28: return getOutput28(input);
			case 30: return getOutput30(input);
			case 32: return getOutput32(input);
			case 34: return getOutput34(input);
			case 36: return getOutput36(input);
			case 38: return getOutput38(input);
			case 40: return getOutput40(input);
			case 42: return getOutput42(input);
			case 44: return getOutput44(input);
			case 45: return getOutput45(input);
			case 47: return getOutput47(input);
			case 49: return getOutput49(input);
			case 51: return getOutput51(input);
			case 53: return getOutput53(input);
			case 55: return getOutput55(input);
			case 57: return getOutput57(input);
			case 59: return getOutput59(input);
			case 61: return getOutput61(input);
			case 63: return getOutput63(input);
			case 65: return getOutput65(input);
			case 68: return getOutput68(input);
			case 71: return getOutput71(input);
			case 74: return getOutput74(input);
			case 77: return getOutput77(input);
			default: return 0;
			}
		}
	}

	private static final class XMacGurmukhiCharsetEncoder extends TableCharsetEncoder {
		private XMacGurmukhiCharsetEncoder(Charset cs) {
			super(cs, 1.09717f, 2.5f, new byte[]{63}, 4);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xA4D: return 0x1;
			case 0xA71: return 0x2;
			case 0xF860: return 0x5;
			}
			return 0;
		}
		private int getNextState2(int input) {
			switch (input) {
			case 0xF860: return 0x3;
			}
			return 0;
		}
		private int getNextState3(int input) {
			switch (input) {
			case 0xA38: return 0x4;
			}
			return 0;
		}
		private int getNextState5(int input) {
			switch (input) {
			case 0xA38: return 0x6;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 2: return getNextState2(input);
			case 3: return getNextState3(input);
			case 5: return getNextState5(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return new char[] {
				0x1, 0x101, 0x201, 0x301, 0x401, 0x501, 0x601, 0x701, 0x8, 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF,
				0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E, 0x1F,
				0x20, 0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, 0x2E, 0x2F,
				0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, 0x3E, 0x3F,
				0x40, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49, 0x4A, 0x4B, 0x4C, 0x4D, 0x4E, 0x4F,
				0x50, 0x51, 0x52, 0x53, 0x54, 0x55, 0x56, 0x57, 0x58, 0x59, 0x5A, 0x5B, 0x5C, 0x5D, 0x5E, 0x5F,
				0x60, 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
				0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A, 0x7B, 0x7C, 0x7D, 0x7E, 0x7F,
			};
		}
		private static final char[] GETOUTPUT0_A02 = getOutput0_A02();
		private static final char[] getOutput0_A02() {
			return new char[] {
				0xA2, 0, 0, 0xA4, 0xA5, 0xA6, 0xA7, 0xA8, 0xA9, 0, 0, 0, 0, 0xAC, 0xAD, 0,
				0, 0xB0, 0xB1, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9, 0xBA, 0xBB, 0xBC, 0xBD, 0xBE, 0xBF,
				0xC0, 0xC1, 0xC2, 0xC3, 0xC4, 0xC5, 0xC6, 0, 0xC8, 0xC9, 0xCA, 0xCB, 0xCC, 0xCD, 0xCF, 0,
				0xD1, 0, 0, 0xD4, 0, 0, 0xD7, 0xD8, 0, 0, 0xE9, 0, 0xDA, 0xDB, 0xDC, 0xDD,
				0xDE, 0, 0, 0, 0, 0xE1, 0xE2, 0, 0, 0xE5, 0xE6, 0xE8, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0xE9B4, 0xE9B5, 0xE9BA, 0x91, 0, 0xE9C9, 0, 0, 0,
				0, 0, 0, 0, 0xF1, 0xF2, 0xF3, 0xF4, 0xF5, 0xF6, 0xF7, 0xF8, 0xF9, 0xFA, 0xA2, 0x90,
				0x93, 0x92, 0x94,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x7F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0xA02 && input <= 0xA74) return GETOUTPUT0_A02[input - 0xA02];
			switch (input) {
			case 0xA9: return 0x88L;
			case 0xAE: return 0x89L;
			case 0xD7: return 0x80L;
			case 0x964: return 0xEAL;
			case 0x200E: return 0xD9L;
			case 0x2013: return 0x82L;
			case 0x2014: return 0x83L;
			case 0x2018: return 0x84L;
			case 0x2019: return 0x85L;
			case 0x2022: return 0x87L;
			case 0x2026: return 0x86L;
			case 0x2122: return 0x8AL;
			case 0x2212: return 0x81L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x200C: return 0xE8E8L;
			case 0x200D: return 0xE9E8L;
			}
			return 0;
		}
		private static final int[] GETOUTPUT2_A15 = getOutput2_A15();
		private static final int[] getOutput2_A15() {
			return new int[] {
				0xB3E8B3, 0xB4E8B4, 0xB5E8B5, 0xB6E8B6, 0xB7E8B7, 0xB8E8B8, 0xB9E8B9, 0xBAE8BA, 0xBBE8BB, 0xBCE8BC, 0xBDE8BD, 0xBEE8BE, 0xBFE8BF, 0xC0E8C0, 0xC1E8C1, 0xC2E8C2,
				0xC3E8C3, 0xC4E8C4, 0xC5E8C5, 0xC6E8C6, 0, 0xC8E8C8, 0xC9E8C9, 0xCAE8CA, 0xCBE8CB, 0xCCE8CC, 0xCDE8CD, 0xCFE8CF, 0, 0xD1E8D1, 0, 0,
				0xD4E8D4, 0, 0, 0xD7E8D7, 0xD8E8D8,
			};
		}
		private long getOutput2(int input) {
			if (input >= 0xA15 && input <= 0xA39) return GETOUTPUT2_A15[input - 0xA15];
			switch (input) {
			case 0xA59: return 0xE9B4E8E9B4L;
			case 0xA5A: return 0xE9B5E8E9B5L;
			case 0xA5B: return 0xE9BAE8E9BAL;
			case 0xA5E: return 0xE9C9E8E9C9L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xA3C: return 0xD5E8D5L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0xA3C: return 0xD5L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 4: return getOutput4(input);
			case 6: return getOutput6(input);
			default: return 0;
			}
		}
	}
}
