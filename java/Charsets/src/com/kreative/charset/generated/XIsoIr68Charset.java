package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIsoIr68Charset extends Charset {
	public XIsoIr68Charset() {
		super("x-iso-ir-68", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIsoIr68CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIsoIr68CharsetEncoder(this);
	}

	private static final class XIsoIr68CharsetDecoder extends TableCharsetDecoder {
		private XIsoIr68CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 3);
		}
		private static final char[] GETNEXTSTATE0_21 = getNextState0_21();
		private static final char[] getNextState0_21() {
			return new char[] {
				0x1, 0, 0x3, 0, 0x5, 0x7, 0x9, 0xB, 0xD, 0xF, 0x11, 0x13, 0, 0x15, 0x17, 0x19,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x1B, 0x1D, 0, 0x1F, 0x21, 0x23,
				0x25, 0x27, 0x29, 0, 0x2B, 0x2D, 0x2F, 0x31, 0x33, 0x35, 0x37, 0x39, 0x3B, 0x3D, 0x3F, 0x41,
				0x43, 0, 0, 0x45, 0x47, 0x49, 0x4B, 0x4D, 0x4F, 0x51, 0x53, 0, 0x55, 0, 0x57, 0x59,
			};
		}
		private int getNextState0(int input) {
			if (input >= 0x21 && input <= 0x60) return GETNEXTSTATE0_21[input - 0x21];
			return 0;
		}
		private int getNextState1(int input) {
			switch (input) {
			case 0x8: return 0x2;
			}
			return 0;
		}
		private int getNextState3(int input) {
			switch (input) {
			case 0x8: return 0x4;
			}
			return 0;
		}
		private int getNextState5(int input) {
			switch (input) {
			case 0x8: return 0x6;
			}
			return 0;
		}
		private int getNextState7(int input) {
			switch (input) {
			case 0x8: return 0x8;
			}
			return 0;
		}
		private int getNextState9(int input) {
			switch (input) {
			case 0x8: return 0xA;
			}
			return 0;
		}
		private int getNextState11(int input) {
			switch (input) {
			case 0x8: return 0xC;
			}
			return 0;
		}
		private int getNextState13(int input) {
			switch (input) {
			case 0x8: return 0xE;
			}
			return 0;
		}
		private int getNextState15(int input) {
			switch (input) {
			case 0x8: return 0x10;
			}
			return 0;
		}
		private int getNextState17(int input) {
			switch (input) {
			case 0x8: return 0x12;
			}
			return 0;
		}
		private int getNextState19(int input) {
			switch (input) {
			case 0x8: return 0x14;
			}
			return 0;
		}
		private int getNextState21(int input) {
			switch (input) {
			case 0x8: return 0x16;
			}
			return 0;
		}
		private int getNextState23(int input) {
			switch (input) {
			case 0x8: return 0x18;
			}
			return 0;
		}
		private int getNextState25(int input) {
			switch (input) {
			case 0x8: return 0x1A;
			}
			return 0;
		}
		private int getNextState27(int input) {
			switch (input) {
			case 0x8: return 0x1C;
			}
			return 0;
		}
		private int getNextState29(int input) {
			switch (input) {
			case 0x8: return 0x1E;
			}
			return 0;
		}
		private int getNextState31(int input) {
			switch (input) {
			case 0x8: return 0x20;
			}
			return 0;
		}
		private int getNextState33(int input) {
			switch (input) {
			case 0x8: return 0x22;
			}
			return 0;
		}
		private int getNextState35(int input) {
			switch (input) {
			case 0x8: return 0x24;
			}
			return 0;
		}
		private int getNextState37(int input) {
			switch (input) {
			case 0x8: return 0x26;
			}
			return 0;
		}
		private int getNextState39(int input) {
			switch (input) {
			case 0x8: return 0x28;
			}
			return 0;
		}
		private int getNextState41(int input) {
			switch (input) {
			case 0x8: return 0x2A;
			}
			return 0;
		}
		private int getNextState43(int input) {
			switch (input) {
			case 0x8: return 0x2C;
			}
			return 0;
		}
		private int getNextState45(int input) {
			switch (input) {
			case 0x8: return 0x2E;
			}
			return 0;
		}
		private int getNextState47(int input) {
			switch (input) {
			case 0x8: return 0x30;
			}
			return 0;
		}
		private int getNextState49(int input) {
			switch (input) {
			case 0x8: return 0x32;
			}
			return 0;
		}
		private int getNextState51(int input) {
			switch (input) {
			case 0x8: return 0x34;
			}
			return 0;
		}
		private int getNextState53(int input) {
			switch (input) {
			case 0x8: return 0x36;
			}
			return 0;
		}
		private int getNextState55(int input) {
			switch (input) {
			case 0x8: return 0x38;
			}
			return 0;
		}
		private int getNextState57(int input) {
			switch (input) {
			case 0x8: return 0x3A;
			}
			return 0;
		}
		private int getNextState59(int input) {
			switch (input) {
			case 0x8: return 0x3C;
			}
			return 0;
		}
		private int getNextState61(int input) {
			switch (input) {
			case 0x8: return 0x3E;
			}
			return 0;
		}
		private int getNextState63(int input) {
			switch (input) {
			case 0x8: return 0x40;
			}
			return 0;
		}
		private int getNextState65(int input) {
			switch (input) {
			case 0x8: return 0x42;
			}
			return 0;
		}
		private int getNextState67(int input) {
			switch (input) {
			case 0x8: return 0x44;
			}
			return 0;
		}
		private int getNextState69(int input) {
			switch (input) {
			case 0x8: return 0x46;
			}
			return 0;
		}
		private int getNextState71(int input) {
			switch (input) {
			case 0x8: return 0x48;
			}
			return 0;
		}
		private int getNextState73(int input) {
			switch (input) {
			case 0x8: return 0x4A;
			}
			return 0;
		}
		private int getNextState75(int input) {
			switch (input) {
			case 0x8: return 0x4C;
			}
			return 0;
		}
		private int getNextState77(int input) {
			switch (input) {
			case 0x8: return 0x4E;
			}
			return 0;
		}
		private int getNextState79(int input) {
			switch (input) {
			case 0x8: return 0x50;
			}
			return 0;
		}
		private int getNextState81(int input) {
			switch (input) {
			case 0x8: return 0x52;
			}
			return 0;
		}
		private int getNextState83(int input) {
			switch (input) {
			case 0x8: return 0x54;
			}
			return 0;
		}
		private int getNextState85(int input) {
			switch (input) {
			case 0x8: return 0x56;
			}
			return 0;
		}
		private int getNextState87(int input) {
			switch (input) {
			case 0x8: return 0x58;
			}
			return 0;
		}
		private int getNextState89(int input) {
			switch (input) {
			case 0x8: return 0x5A;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 1: return getNextState1(input);
			case 3: return getNextState3(input);
			case 5: return getNextState5(input);
			case 7: return getNextState7(input);
			case 9: return getNextState9(input);
			case 11: return getNextState11(input);
			case 13: return getNextState13(input);
			case 15: return getNextState15(input);
			case 17: return getNextState17(input);
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
			case 45: return getNextState45(input);
			case 47: return getNextState47(input);
			case 49: return getNextState49(input);
			case 51: return getNextState51(input);
			case 53: return getNextState53(input);
			case 55: return getNextState55(input);
			case 57: return getNextState57(input);
			case 59: return getNextState59(input);
			case 61: return getNextState61(input);
			case 63: return getNextState63(input);
			case 65: return getNextState65(input);
			case 67: return getNextState67(input);
			case 69: return getNextState69(input);
			case 71: return getNextState71(input);
			case 73: return getNextState73(input);
			case 75: return getNextState75(input);
			case 77: return getNextState77(input);
			case 79: return getNextState79(input);
			case 81: return getNextState81(input);
			case 83: return getNextState83(input);
			case 85: return getNextState85(input);
			case 87: return getNextState87(input);
			case 89: return getNextState89(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return new char[] {
				0xFFFE, 0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x7, 0x8, 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF,
				0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E, 0x1F,
				0x20, 0xA8, 0x29, 0x3C, 0x2264, 0x3D, 0x3E, 0x5D, 0x2227, 0x2228, 0x2260, 0xF7, 0x2C, 0x2B, 0x2E, 0x2F,
				0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x28, 0x5B, 0x3B, 0xD7, 0x3A, 0x5C,
				0xAF, 0x237A, 0x22A5, 0x2229, 0x230A, 0x220A, 0x5F, 0x2207, 0x2206, 0x2373, 0x2218, 0x27, 0x2395, 0x2223, 0x22A4, 0x25CB,
				0x22C6, 0x3F, 0x2374, 0x2308, 0x223C, 0x2193, 0x222A, 0x2375, 0x2283, 0x2191, 0x2282, 0x2190, 0x22A2, 0x2192, 0x2265, 0x2D,
				0x22C4, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49, 0x4A, 0x4B, 0x4C, 0x4D, 0x4E, 0x4F,
				0x50, 0x51, 0x52, 0x53, 0x54, 0x55, 0x56, 0x57, 0x58, 0x59, 0x5A, 0x7B, 0x22A3, 0x7D, 0x24, 0x7F,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x7F) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x26: return 0x2369L;
			case 0x2E: return 0x2235L;
			case 0x47: return 0x2362L;
			case 0x4A: return 0x2364L;
			case 0x4E: return 0x2361L;
			case 0x4F: return 0x2365L;
			case 0x50: return 0x2363L;
			case 0x54: return 0x2368L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x4C: return 0x2343L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0x4C: return 0x2338L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0x21: return 0x2369L;
			case 0x4C: return 0x2344L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0x3B: return 0x2337L;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0x4C: return 0x234CL;
			case 0x54: return 0x2371L;
			}
			return 0;
		}
		private long getOutput14(int input) {
			switch (input) {
			case 0x4C: return 0x2353L;
			case 0x54: return 0x2372L;
			}
			return 0;
		}
		private long getOutput16(int input) {
			switch (input) {
			case 0x4C: return 0x236FL;
			}
			return 0;
		}
		private long getOutput18(int input) {
			switch (input) {
			case 0x4C: return 0x2339L;
			}
			return 0;
		}
		private long getOutput20(int input) {
			switch (input) {
			case 0x5F: return 0x236AL;
			}
			return 0;
		}
		private long getOutput22(int input) {
			switch (input) {
			case 0x21: return 0x2235L;
			case 0x4B: return 0x21L;
			}
			return 0;
		}
		private long getOutput24(int input) {
			switch (input) {
			case 0x4C: return 0x2341L;
			case 0x4F: return 0x2205L;
			case 0x5F: return 0x233FL;
			}
			return 0;
		}
		private long getOutput26(int input) {
			switch (input) {
			case 0x54: return 0x236CL;
			}
			return 0;
		}
		private long getOutput28(int input) {
			switch (input) {
			case 0x27: return 0x2337L;
			}
			return 0;
		}
		private long getOutput30(int input) {
			switch (input) {
			case 0x46: return 0x236EL;
			}
			return 0;
		}
		private long getOutput32(int input) {
			switch (input) {
			case 0x4C: return 0x2360L;
			}
			return 0;
		}
		private long getOutput34(int input) {
			switch (input) {
			case 0x4C: return 0x2342L;
			case 0x4F: return 0x2349L;
			case 0x5F: return 0x2340L;
			}
			return 0;
		}
		private long getOutput36(int input) {
			switch (input) {
			case 0x4E: return 0x2351L;
			}
			return 0;
		}
		private long getOutput38(int input) {
			switch (input) {
			case 0x46: return 0x2376L;
			}
			return 0;
		}
		private long getOutput40(int input) {
			switch (input) {
			case 0x46: return 0x234AL;
			case 0x4A: return 0x234EL;
			case 0x4E: return 0x2336L;
			}
			return 0;
		}
		private long getOutput42(int input) {
			switch (input) {
			case 0x4A: return 0x235DL;
			}
			return 0;
		}
		private long getOutput44(int input) {
			switch (input) {
			case 0x46: return 0x2377L;
			}
			return 0;
		}
		private long getOutput46(int input) {
			switch (input) {
			case 0x3C: return 0x236EL;
			case 0x41: return 0x2376L;
			case 0x42: return 0x234AL;
			case 0x45: return 0x2377L;
			case 0x48: return 0x2359L;
			case 0x49: return 0x2378L;
			case 0x4A: return 0x235BL;
			case 0x4B: return 0x2358L;
			case 0x4F: return 0x235CL;
			case 0x57: return 0x2379L;
			case 0x58: return 0x2287L;
			case 0x60: return 0x235AL;
			}
			return 0;
		}
		private long getOutput48(int input) {
			switch (input) {
			case 0x21: return 0x2362L;
			case 0x4C: return 0x2354L;
			case 0x4D: return 0x2352L;
			case 0x54: return 0x236BL;
			}
			return 0;
		}
		private long getOutput50(int input) {
			switch (input) {
			case 0x46: return 0x2359L;
			case 0x4C: return 0x234DL;
			case 0x4D: return 0x234BL;
			}
			return 0;
		}
		private long getOutput52(int input) {
			switch (input) {
			case 0x46: return 0x2378L;
			}
			return 0;
		}
		private long getOutput54(int input) {
			switch (input) {
			case 0x21: return 0x2364L;
			case 0x42: return 0x234EL;
			case 0x43: return 0x235DL;
			case 0x46: return 0x235BL;
			case 0x4C: return 0x233BL;
			case 0x4E: return 0x2355L;
			}
			return 0;
		}
		private long getOutput56(int input) {
			switch (input) {
			case 0x2E: return 0x21L;
			case 0x46: return 0x2358L;
			case 0x4C: return 0x235EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT58_23 = getOutput58_23();
		private static final char[] getOutput58_23() {
			return new char[] {
				0x2343, 0, 0x2338, 0x2344, 0, 0x234C, 0x2353, 0x236F, 0x2339, 0, 0, 0, 0x2341, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x2360, 0x2342, 0, 0, 0,
				0, 0, 0, 0, 0x2354, 0x234D, 0, 0x233B, 0x235E, 0, 0, 0, 0x233C, 0, 0x2370, 0,
				0, 0, 0x2357, 0, 0, 0, 0x2350, 0, 0x2347, 0, 0x2348, 0, 0, 0x233A,
			};
		}
		private long getOutput58(int input) {
			if (input >= 0x23 && input <= 0x60) return GETOUTPUT58_23[input - 0x23];
			return 0;
		}
		private long getOutput60(int input) {
			switch (input) {
			case 0x47: return 0x2352L;
			case 0x48: return 0x234BL;
			case 0x4F: return 0x233DL;
			case 0x54: return 0x236DL;
			case 0x56: return 0x2366L;
			case 0x5A: return 0x2367L;
			case 0x5B: return 0x2345L;
			case 0x5D: return 0x2346L;
			}
			return 0;
		}
		private long getOutput62(int input) {
			switch (input) {
			case 0x21: return 0x2361L;
			case 0x40: return 0x2351L;
			case 0x42: return 0x2336L;
			case 0x4A: return 0x2355L;
			}
			return 0;
		}
		private long getOutput64(int input) {
			switch (input) {
			case 0x21: return 0x2365L;
			case 0x2F: return 0x2205L;
			case 0x3F: return 0x2349L;
			case 0x46: return 0x235CL;
			case 0x4C: return 0x233CL;
			case 0x4D: return 0x233DL;
			case 0x50: return 0x235FL;
			case 0x5F: return 0x2296L;
			}
			return 0;
		}
		private long getOutput66(int input) {
			switch (input) {
			case 0x21: return 0x2363L;
			case 0x4F: return 0x235FL;
			}
			return 0;
		}
		private long getOutput68(int input) {
			switch (input) {
			case 0x4C: return 0x2370L;
			}
			return 0;
		}
		private long getOutput70(int input) {
			switch (input) {
			case 0x21: return 0x2368L;
			case 0x28: return 0x2371L;
			case 0x29: return 0x2372L;
			case 0x30: return 0x236CL;
			case 0x47: return 0x236BL;
			case 0x4D: return 0x236DL;
			}
			return 0;
		}
		private long getOutput72(int input) {
			switch (input) {
			case 0x4C: return 0x2357L;
			case 0x5F: return 0x2356L;
			}
			return 0;
		}
		private long getOutput74(int input) {
			switch (input) {
			case 0x4D: return 0x2366L;
			}
			return 0;
		}
		private long getOutput76(int input) {
			switch (input) {
			case 0x46: return 0x2379L;
			}
			return 0;
		}
		private long getOutput78(int input) {
			switch (input) {
			case 0x46: return 0x2287L;
			}
			return 0;
		}
		private long getOutput80(int input) {
			switch (input) {
			case 0x4C: return 0x2350L;
			case 0x5F: return 0x234FL;
			}
			return 0;
		}
		private long getOutput82(int input) {
			switch (input) {
			case 0x46: return 0x2286L;
			case 0x4D: return 0x2367L;
			case 0x5F: return 0x233EL;
			}
			return 0;
		}
		private long getOutput84(int input) {
			switch (input) {
			case 0x4C: return 0x2347L;
			case 0x4D: return 0x2345L;
			}
			return 0;
		}
		private long getOutput86(int input) {
			switch (input) {
			case 0x4C: return 0x2348L;
			case 0x4D: return 0x2346L;
			}
			return 0;
		}
		private long getOutput88(int input) {
			switch (input) {
			case 0x2C: return 0x236AL;
			case 0x2F: return 0x233FL;
			case 0x3F: return 0x2340L;
			case 0x4F: return 0x2296L;
			case 0x55: return 0x2356L;
			case 0x59: return 0x234FL;
			case 0x5A: return 0x233EL;
			}
			return 0;
		}
		private long getOutput90(int input) {
			switch (input) {
			case 0x46: return 0x235AL;
			case 0x4C: return 0x233AL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 2: return getOutput2(input);
			case 4: return getOutput4(input);
			case 6: return getOutput6(input);
			case 8: return getOutput8(input);
			case 10: return getOutput10(input);
			case 12: return getOutput12(input);
			case 14: return getOutput14(input);
			case 16: return getOutput16(input);
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
			case 46: return getOutput46(input);
			case 48: return getOutput48(input);
			case 50: return getOutput50(input);
			case 52: return getOutput52(input);
			case 54: return getOutput54(input);
			case 56: return getOutput56(input);
			case 58: return getOutput58(input);
			case 60: return getOutput60(input);
			case 62: return getOutput62(input);
			case 64: return getOutput64(input);
			case 66: return getOutput66(input);
			case 68: return getOutput68(input);
			case 70: return getOutput70(input);
			case 72: return getOutput72(input);
			case 74: return getOutput74(input);
			case 76: return getOutput76(input);
			case 78: return getOutput78(input);
			case 80: return getOutput80(input);
			case 82: return getOutput82(input);
			case 84: return getOutput84(input);
			case 86: return getOutput86(input);
			case 88: return getOutput88(input);
			case 90: return getOutput90(input);
			default: return 0;
			}
		}
	}

	private static final class XIsoIr68CharsetEncoder extends TableCharsetEncoder {
		private XIsoIr68CharsetEncoder(Charset cs) {
			super(cs, 1.63111f, 3f, new byte[]{81}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0x1, 0x101, 0x201, 0x301, 0x401, 0x501, 0x601, 0x701, 0x8, 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF,
				0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E, 0x1F,
				0x20, 0x4B082E, 0, 0, 0x7E, 0, 0, 0x4B, 0x3A, 0x22, 0, 0x2D, 0x2C, 0x5F, 0x2E, 0x2F,
				0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3E, 0x3C, 0x23, 0x25, 0x26, 0x51,
				0, 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
				0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A, 0x3B, 0x3F, 0x27, 0, 0x46,
				0, 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
				0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A, 0x7B, 0, 0x7D, 0, 0x7F,
			};
		}
		private static final int[] GETOUTPUT0_2336 = getOutput0_2336();
		private static final int[] getOutput0_2336() {
			return new int[] {
				0x4E0842, 0x3B0827, 0x4C0825, 0x4C082B, 0x60084C, 0x4C084A, 0x4F084C, 0x4F084D, 0x5F085A, 0x5F082F, 0x5F083F, 0x4C082F, 0x4C083F, 0x4C0823, 0x4C0826, 0x5B084D,
				0x5D084D, 0x5B084C, 0x5D084C, 0x4F083F, 0x460842, 0x4D0848, 0x4C0828, 0x4C0848, 0x4A0842, 0x5F0859, 0x59084C, 0x4E0840, 0x4D0847, 0x4C0829, 0x4C0847, 0x4E084A,
				0x5F0855, 0x55084C, 0x4B0846, 0x480846, 0x600846, 0x4A0846, 0x4F0846, 0x4A0843, 0x4C084B, 0x50084F, 0x4C083E, 0x4E0821, 0x470821, 0x500821, 0x4A0821, 0x4F0821,
				0x56084D, 0x5A084D, 0x540821, 0x260821, 0x5F082C, 0x540847, 0x540830, 0x54084D, 0x46083C, 0x4C082A, 0x51084C, 0x540828, 0x540829, 0x49, 0x52, 0x57,
				0x460841, 0x460845, 0x490846, 0x570846, 0x41,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x7F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x2336 && input <= 0x237A) return GETOUTPUT0_2336[input - 0x2336];
			switch (input) {
			case 0xA8: return 0x21L;
			case 0xAF: return 0x40L;
			case 0xD7: return 0x3DL;
			case 0xF7: return 0x2BL;
			case 0x2190: return 0x5BL;
			case 0x2191: return 0x59L;
			case 0x2192: return 0x5DL;
			case 0x2193: return 0x55L;
			case 0x2205: return 0x4F082FL;
			case 0x2206: return 0x48L;
			case 0x2207: return 0x47L;
			case 0x220A: return 0x45L;
			case 0x2218: return 0x4AL;
			case 0x2223: return 0x4DL;
			case 0x2227: return 0x28L;
			case 0x2228: return 0x29L;
			case 0x2229: return 0x43L;
			case 0x222A: return 0x56L;
			case 0x2235: return 0x2E0821L;
			case 0x223C: return 0x54L;
			case 0x2260: return 0x2AL;
			case 0x2264: return 0x24L;
			case 0x2265: return 0x5EL;
			case 0x2282: return 0x5AL;
			case 0x2283: return 0x58L;
			case 0x2286: return 0x46085AL;
			case 0x2287: return 0x580846L;
			case 0x2296: return 0x5F084FL;
			case 0x22A2: return 0x5CL;
			case 0x22A3: return 0x7CL;
			case 0x22A4: return 0x4EL;
			case 0x22A5: return 0x42L;
			case 0x22C4: return 0x60L;
			case 0x22C6: return 0x50L;
			case 0x2308: return 0x53L;
			case 0x230A: return 0x44L;
			case 0x2395: return 0x4CL;
			case 0x25CB: return 0x4FL;
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
