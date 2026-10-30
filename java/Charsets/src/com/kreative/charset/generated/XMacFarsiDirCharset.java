package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacFarsiDirCharset extends Charset {
	public XMacFarsiDirCharset() {
		super("x-MacFarsi-dir", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacFarsiDirCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacFarsiDirCharsetEncoder(this);
	}

	private static final class XMacFarsiDirCharsetDecoder extends TableCharsetDecoder {
		private XMacFarsiDirCharsetDecoder(Charset cs) {
			super(cs, 1.5625f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_7B = getOutput0_7B();
		private static final long[] getOutput0_7B() {
			return new long[] {
				0x202C007B202DL, 0x202C007C202DL, 0x202C007D202DL, 0x7EL, 0x7FL, 0xC4L, 0x202C00A0202EL, 0xC7L, 0xC9L, 0xD1L, 0xD6L, 0xDCL, 0xE1L, 0xE0L, 0xE2L, 0xE4L,
				0x6BAL, 0x202C00AB202EL, 0xE7L, 0xE9L, 0xE8L, 0xEAL, 0xEBL, 0xEDL, 0x202C2026202EL, 0xEEL, 0xEFL, 0xF1L, 0xF3L, 0x202C00BB202EL, 0xF4L, 0xF6L,
				0x202C00F7202EL, 0xFAL, 0xF9L, 0xFBL, 0xFCL, 0x202C0020202EL, 0x202C0021202EL, 0x202C0022202EL, 0x202C0023202EL, 0x202C0024202EL, 0x66AL, 0x202C0026202EL, 0x202C0027202EL, 0x202C0028202EL, 0x202C0029202EL, 0x202C002A202EL,
				0x202C002B202EL, 0x60CL, 0x202C002D202EL, 0x202C002E202EL, 0x202C002F202EL, 0x202C06F0202EL, 0x202C06F1202EL, 0x202C06F2202EL, 0x202C06F3202EL, 0x202C06F4202EL, 0x202C06F5202EL, 0x202C06F6202EL, 0x202C06F7202EL, 0x202C06F8202EL, 0x202C06F9202EL, 0x202C003A202EL,
				0x61BL, 0x202C003C202EL, 0x202C003D202EL, 0x202C003E202EL, 0x61FL, 0x202C274A202EL,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x40 && input <= 0x5A) return input - 0x40 + 0x40;
			if (input >= 0x20 && input <= 0x3F) return CommonSubtables.COMMON1102[input - 0x20];
			if (input >= 0x60 && input <= 0x7A) return input - 0x60 + 0x60;
			if (input >= 0xC1 && input <= 0xDA) return input - 0xC1 + 0x621;
			if (input >= 0x7B && input <= 0xC0) return GETOUTPUT0_7B[input - 0x7B];
			if (input >= 0xE0 && input <= 0xF2) return input - 0xE0 + 0x640;
			switch (input) {
			case 0x5B: return 0x202C005B202DL;
			case 0x5C: return 0x202C005C202DL;
			case 0x5D: return 0x202C005D202DL;
			case 0x5E: return 0x202C005E202DL;
			case 0x5F: return 0x202C005F202DL;
			case 0xDB: return 0x202C005B202EL;
			case 0xDC: return 0x202C005C202EL;
			case 0xDD: return 0x202C005D202EL;
			case 0xDE: return 0x202C005E202EL;
			case 0xDF: return 0x202C005F202EL;
			case 0xF3: return 0x67EL;
			case 0xF4: return 0x679L;
			case 0xF5: return 0x686L;
			case 0xF6: return 0x6D5L;
			case 0xF7: return 0x6A4L;
			case 0xF8: return 0x6AFL;
			case 0xF9: return 0x688L;
			case 0xFA: return 0x691L;
			case 0xFB: return 0x202C007B202EL;
			case 0xFC: return 0x202C007C202EL;
			case 0xFD: return 0x202C007D202EL;
			case 0xFE: return 0x698L;
			case 0xFF: return 0x6D2L;
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

	private static final class XMacFarsiDirCharsetEncoder extends TableCharsetEncoder {
		private XMacFarsiDirCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x202D: return 0x1;
			case 0x202E: return 0x20;
			}
			return 0;
		}
		private int getNextState1(int input) {
			if (input >= 0x20 && input <= 0x2F) return input - 0x20 + 0x2;
			switch (input) {
			case 0x3A: return 0x12;
			case 0x3B: return 0x13;
			case 0x3C: return 0x14;
			case 0x3D: return 0x15;
			case 0x3E: return 0x16;
			case 0x3F: return 0x17;
			case 0x5B: return 0x18;
			case 0x5C: return 0x19;
			case 0x5D: return 0x1A;
			case 0x5E: return 0x1B;
			case 0x5F: return 0x1C;
			case 0x7B: return 0x1D;
			case 0x7C: return 0x1E;
			case 0x7D: return 0x1F;
			}
			return 0;
		}
		private int getNextState32(int input) {
			if (input >= 0x20 && input <= 0x3E) return CommonSubtables.COMMON1103[input - 0x20];
			switch (input) {
			case 0x5B: return 0x33;
			case 0x5C: return 0x34;
			case 0x5D: return 0x35;
			case 0x5E: return 0x36;
			case 0x5F: return 0x37;
			case 0x7B: return 0x38;
			case 0x7C: return 0x39;
			case 0x7D: return 0x3A;
			case 0xA0: return 0x3B;
			case 0xAB: return 0x3C;
			case 0xBB: return 0x3D;
			case 0xF7: return 0x3E;
			case 0x66D: return 0x3F;
			case 0x6F0: return 0x40;
			case 0x6F1: return 0x41;
			case 0x6F2: return 0x42;
			case 0x6F3: return 0x43;
			case 0x6F4: return 0x44;
			case 0x6F5: return 0x45;
			case 0x6F6: return 0x46;
			case 0x6F7: return 0x47;
			case 0x6F8: return 0x48;
			case 0x6F9: return 0x49;
			case 0x2026: return 0x4A;
			case 0x274A: return 0x4B;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 1: return getNextState1(input);
			case 32: return getNextState32(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFC) return CommonSubtables.COMMON1104[input - 0xA0];
			if (input >= 0x621 && input <= 0x63A) return input - 0x621 + 0xC1;
			if (input >= 0x640 && input <= 0x652) return input - 0x640 + 0xE0;
			switch (input) {
			case 0x60C: return 0xACL;
			case 0x61B: return 0xBBL;
			case 0x61F: return 0xBFL;
			case 0x66A: return 0xA5L;
			case 0x66D: return 0xC0L;
			case 0x679: return 0xF4L;
			case 0x67E: return 0xF3L;
			case 0x686: return 0xF5L;
			case 0x688: return 0xF9L;
			case 0x691: return 0xFAL;
			case 0x698: return 0xFEL;
			case 0x6A4: return 0xF7L;
			case 0x6AF: return 0xF8L;
			case 0x6BA: return 0x8BL;
			case 0x6D2: return 0xFF01L;
			case 0x6D5: return 0xF6L;
			case 0x6F0: return 0xB0L;
			case 0x6F1: return 0xB1L;
			case 0x6F2: return 0xB2L;
			case 0x6F3: return 0xB3L;
			case 0x6F4: return 0xB4L;
			case 0x6F5: return 0xB5L;
			case 0x6F6: return 0xB6L;
			case 0x6F7: return 0xB7L;
			case 0x6F8: return 0xB8L;
			case 0x6F9: return 0xB9L;
			case 0x2026: return 0x93L;
			case 0x274A: return 0xC0L;
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
			case 0x202C: return 0x25L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0x202C: return 0x26L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0x202C: return 0x27L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0x202C: return 0x28L;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0x202C: return 0x29L;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0x202C: return 0x2AL;
			}
			return 0;
		}
		private long getOutput13(int input) {
			switch (input) {
			case 0x202C: return 0x2BL;
			}
			return 0;
		}
		private long getOutput14(int input) {
			switch (input) {
			case 0x202C: return 0x2CL;
			}
			return 0;
		}
		private long getOutput15(int input) {
			switch (input) {
			case 0x202C: return 0x2DL;
			}
			return 0;
		}
		private long getOutput16(int input) {
			switch (input) {
			case 0x202C: return 0x2EL;
			}
			return 0;
		}
		private long getOutput17(int input) {
			switch (input) {
			case 0x202C: return 0x2FL;
			}
			return 0;
		}
		private long getOutput18(int input) {
			switch (input) {
			case 0x202C: return 0x3AL;
			}
			return 0;
		}
		private long getOutput19(int input) {
			switch (input) {
			case 0x202C: return 0x3BL;
			}
			return 0;
		}
		private long getOutput20(int input) {
			switch (input) {
			case 0x202C: return 0x3CL;
			}
			return 0;
		}
		private long getOutput21(int input) {
			switch (input) {
			case 0x202C: return 0x3DL;
			}
			return 0;
		}
		private long getOutput22(int input) {
			switch (input) {
			case 0x202C: return 0x3EL;
			}
			return 0;
		}
		private long getOutput23(int input) {
			switch (input) {
			case 0x202C: return 0x3FL;
			}
			return 0;
		}
		private long getOutput24(int input) {
			switch (input) {
			case 0x202C: return 0x5BL;
			}
			return 0;
		}
		private long getOutput25(int input) {
			switch (input) {
			case 0x202C: return 0x5CL;
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
			case 0x202C: return 0x5EL;
			}
			return 0;
		}
		private long getOutput28(int input) {
			switch (input) {
			case 0x202C: return 0x5FL;
			}
			return 0;
		}
		private long getOutput29(int input) {
			switch (input) {
			case 0x202C: return 0x7BL;
			}
			return 0;
		}
		private long getOutput30(int input) {
			switch (input) {
			case 0x202C: return 0x7CL;
			}
			return 0;
		}
		private long getOutput31(int input) {
			switch (input) {
			case 0x202C: return 0x7DL;
			}
			return 0;
		}
		private long getOutput33(int input) {
			switch (input) {
			case 0x202C: return 0xA0L;
			}
			return 0;
		}
		private long getOutput34(int input) {
			switch (input) {
			case 0x202C: return 0xA1L;
			}
			return 0;
		}
		private long getOutput35(int input) {
			switch (input) {
			case 0x202C: return 0xA2L;
			}
			return 0;
		}
		private long getOutput36(int input) {
			switch (input) {
			case 0x202C: return 0xA3L;
			}
			return 0;
		}
		private long getOutput37(int input) {
			switch (input) {
			case 0x202C: return 0xA4L;
			}
			return 0;
		}
		private long getOutput38(int input) {
			switch (input) {
			case 0x202C: return 0xA6L;
			}
			return 0;
		}
		private long getOutput39(int input) {
			switch (input) {
			case 0x202C: return 0xA7L;
			}
			return 0;
		}
		private long getOutput40(int input) {
			switch (input) {
			case 0x202C: return 0xA8L;
			}
			return 0;
		}
		private long getOutput41(int input) {
			switch (input) {
			case 0x202C: return 0xA9L;
			}
			return 0;
		}
		private long getOutput42(int input) {
			switch (input) {
			case 0x202C: return 0xAAL;
			}
			return 0;
		}
		private long getOutput43(int input) {
			switch (input) {
			case 0x202C: return 0xABL;
			}
			return 0;
		}
		private long getOutput44(int input) {
			switch (input) {
			case 0x202C: return 0xADL;
			}
			return 0;
		}
		private long getOutput45(int input) {
			switch (input) {
			case 0x202C: return 0xAEL;
			}
			return 0;
		}
		private long getOutput46(int input) {
			switch (input) {
			case 0x202C: return 0xAFL;
			}
			return 0;
		}
		private long getOutput47(int input) {
			switch (input) {
			case 0x202C: return 0xBAL;
			}
			return 0;
		}
		private long getOutput48(int input) {
			switch (input) {
			case 0x202C: return 0xBCL;
			}
			return 0;
		}
		private long getOutput49(int input) {
			switch (input) {
			case 0x202C: return 0xBDL;
			}
			return 0;
		}
		private long getOutput50(int input) {
			switch (input) {
			case 0x202C: return 0xBEL;
			}
			return 0;
		}
		private long getOutput51(int input) {
			switch (input) {
			case 0x202C: return 0xDBL;
			}
			return 0;
		}
		private long getOutput52(int input) {
			switch (input) {
			case 0x202C: return 0xDCL;
			}
			return 0;
		}
		private long getOutput53(int input) {
			switch (input) {
			case 0x202C: return 0xDDL;
			}
			return 0;
		}
		private long getOutput54(int input) {
			switch (input) {
			case 0x202C: return 0xDEL;
			}
			return 0;
		}
		private long getOutput55(int input) {
			switch (input) {
			case 0x202C: return 0xDFL;
			}
			return 0;
		}
		private long getOutput56(int input) {
			switch (input) {
			case 0x202C: return 0xFBL;
			}
			return 0;
		}
		private long getOutput57(int input) {
			switch (input) {
			case 0x202C: return 0xFCL;
			}
			return 0;
		}
		private long getOutput58(int input) {
			switch (input) {
			case 0x202C: return 0xFDL;
			}
			return 0;
		}
		private long getOutput59(int input) {
			switch (input) {
			case 0x202C: return 0x81L;
			}
			return 0;
		}
		private long getOutput60(int input) {
			switch (input) {
			case 0x202C: return 0x8CL;
			}
			return 0;
		}
		private long getOutput61(int input) {
			switch (input) {
			case 0x202C: return 0x98L;
			}
			return 0;
		}
		private long getOutput62(int input) {
			switch (input) {
			case 0x202C: return 0x9BL;
			}
			return 0;
		}
		private long getOutput63(int input) {
			switch (input) {
			case 0x202C: return 0xC0L;
			}
			return 0;
		}
		private long getOutput64(int input) {
			switch (input) {
			case 0x202C: return 0xB0L;
			}
			return 0;
		}
		private long getOutput65(int input) {
			switch (input) {
			case 0x202C: return 0xB1L;
			}
			return 0;
		}
		private long getOutput66(int input) {
			switch (input) {
			case 0x202C: return 0xB2L;
			}
			return 0;
		}
		private long getOutput67(int input) {
			switch (input) {
			case 0x202C: return 0xB3L;
			}
			return 0;
		}
		private long getOutput68(int input) {
			switch (input) {
			case 0x202C: return 0xB4L;
			}
			return 0;
		}
		private long getOutput69(int input) {
			switch (input) {
			case 0x202C: return 0xB5L;
			}
			return 0;
		}
		private long getOutput70(int input) {
			switch (input) {
			case 0x202C: return 0xB6L;
			}
			return 0;
		}
		private long getOutput71(int input) {
			switch (input) {
			case 0x202C: return 0xB7L;
			}
			return 0;
		}
		private long getOutput72(int input) {
			switch (input) {
			case 0x202C: return 0xB8L;
			}
			return 0;
		}
		private long getOutput73(int input) {
			switch (input) {
			case 0x202C: return 0xB9L;
			}
			return 0;
		}
		private long getOutput74(int input) {
			switch (input) {
			case 0x202C: return 0x93L;
			}
			return 0;
		}
		private long getOutput75(int input) {
			switch (input) {
			case 0x202C: return 0xC0L;
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
			default: return 0;
			}
		}
	}
}
