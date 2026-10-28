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
			return "\u0006\u0001\u0002\n\f\u000E\u0010\u0003\u0013\u0015\u0017\u0019\u001B\u001D\u001F!#%\')\u0000+\u0004.024\u00006\u00008\u0000\u0000:<\u0000>@\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0005".toCharArray();
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
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00D7\u2212\u2013\u2014\u2018\u2019\u2026\u2022\u00A9\u00AE\u2122\u0000\u0000\u0000\u0000\u0000\u0A71\u0A5C\u0A73\u0A72\u0A74\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0A02\u0000\u0A05\u0A06\u0A07\u0A08\u0A09\u0A0A\u0000\u0000\u0A0F\u0A10\u0000\u0000\u0A13\u0A14".toCharArray();
		}
		private static final long[] GETOUTPUT0_C8 = getOutput0_C8();
		private static final long[] getOutput0_C8() {
			return new long[] {
				0xA2AL, 0xA2BL, 0xA2CL, 0xA2DL, 0xA2EL, 0xA2FL, 0, 0xA30L, 0, 0xA32L, 0, 0, 0xA35L, 0xA3C0A38F860L, 0, 0xA38L,
				0xA39L, 0x200EL, 0xA3EL, 0xA3FL, 0xA40L, 0xA41L, 0xA42L, 0, 0, 0xA47L, 0xA48L, 0, 0, 0xA4BL, 0xA4CL, 0,
				0xA4DL, 0xA3CL, 0x964L, 0, 0, 0, 0, 0, 0, 0xA66L, 0xA67L, 0xA68L, 0xA69L, 0xA6AL, 0xA6BL, 0xA6CL,
				0xA6DL, 0xA6EL, 0xA6FL,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xB3 && input <= 0xC6) return input - 0xB3 + 0xA15;
			if (input >= 0x80 && input <= 0xB1) return GETOUTPUT0_80[input - 0x80];
			if (input >= 0xC8 && input <= 0xFA) return GETOUTPUT0_C8[input - 0xC8];
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
		private static final char[] GETOUTPUT0_A2A = getOutput0_A2A();
		private static final char[] getOutput0_A2A() {
			return "\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CF\u0000\u00D1\u0000\u0000\u00D4\u0000\u0000\u00D7\u00D8\u0000\u0000\u00E9\u0000\u00DA\u00DB\u00DC\u00DD\u00DE\u0000\u0000\u0000\u0000\u00E1\u00E2\u0000\u0000\u00E5\u00E6\u00E8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uE9B4\uE9B5\uE9BA\u0091\u0000\uE9C9\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA\u00A2\u0090\u0093\u0092\u0094".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA15 && input <= 0xA28) return input - 0xA15 + 0xB3;
			if (input >= 0xA2A && input <= 0xA74) return GETOUTPUT0_A2A[input - 0xA2A];
			switch (input) {
			case 0xA9: return 0x88L;
			case 0xAE: return 0x89L;
			case 0xD7: return 0x80L;
			case 0x964: return 0xEAL;
			case 0xA02: return 0xA2L;
			case 0xA05: return 0xA4L;
			case 0xA06: return 0xA5L;
			case 0xA07: return 0xA6L;
			case 0xA08: return 0xA7L;
			case 0xA09: return 0xA8L;
			case 0xA0A: return 0xA9L;
			case 0xA0F: return 0xACL;
			case 0xA10: return 0xADL;
			case 0xA13: return 0xB0L;
			case 0xA14: return 0xB1L;
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
