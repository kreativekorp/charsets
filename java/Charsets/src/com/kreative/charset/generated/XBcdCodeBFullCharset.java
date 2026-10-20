package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XBcdCodeBFullCharset extends Charset {
	public XBcdCodeBFullCharset() {
		super("x-bcd-code-b-full", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XBcdCodeBFullCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XBcdCodeBFullCharsetEncoder(this);
	}

	private static final class XBcdCodeBFullCharsetDecoder extends TableCharsetDecoder {
		private XBcdCodeBFullCharsetDecoder(Charset cs) {
			super(cs, 2f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0x300030, 0x310030, 0x320030, 0x330030, 0x340030, 0x350030, 0x360030, 0x370030, 0x380030, 0x390030, 0x2D0030, 0x450030, 0x480030, 0x4C0030, 0x500030, 0x200030,
				0x300031, 0x310031, 0x320031, 0x330031, 0x340031, 0x350031, 0x360031, 0x370031, 0x380031, 0x390031, 0x2D0031, 0x450031, 0x480031, 0x4C0031, 0x500031, 0x200031,
				0x300032, 0x310032, 0x320032, 0x330032, 0x340032, 0x350032, 0x360032, 0x370032, 0x380032, 0x390032, 0x2D0032, 0x450032, 0x480032, 0x4C0032, 0x500032, 0x200032,
				0x300033, 0x310033, 0x320033, 0x330033, 0x340033, 0x350033, 0x360033, 0x370033, 0x380033, 0x390033, 0x2D0033, 0x450033, 0x480033, 0x4C0033, 0x500033, 0x200033,
				0x300034, 0x310034, 0x320034, 0x330034, 0x340034, 0x350034, 0x360034, 0x370034, 0x380034, 0x390034, 0x2D0034, 0x450034, 0x480034, 0x4C0034, 0x500034, 0x200034,
				0x300035, 0x310035, 0x320035, 0x330035, 0x340035, 0x350035, 0x360035, 0x370035, 0x380035, 0x390035, 0x2D0035, 0x450035, 0x480035, 0x4C0035, 0x500035, 0x200035,
				0x300036, 0x310036, 0x320036, 0x330036, 0x340036, 0x350036, 0x360036, 0x370036, 0x380036, 0x390036, 0x2D0036, 0x450036, 0x480036, 0x4C0036, 0x500036, 0x200036,
				0x300037, 0x310037, 0x320037, 0x330037, 0x340037, 0x350037, 0x360037, 0x370037, 0x380037, 0x390037, 0x2D0037, 0x450037, 0x480037, 0x4C0037, 0x500037, 0x200037,
				0x300038, 0x310038, 0x320038, 0x330038, 0x340038, 0x350038, 0x360038, 0x370038, 0x380038, 0x390038, 0x2D0038, 0x450038, 0x480038, 0x4C0038, 0x500038, 0x200038,
				0x300039, 0x310039, 0x320039, 0x330039, 0x340039, 0x350039, 0x360039, 0x370039, 0x380039, 0x390039, 0x2D0039, 0x450039, 0x480039, 0x4C0039, 0x500039, 0x200039,
				0x30002D, 0x31002D, 0x32002D, 0x33002D, 0x34002D, 0x35002D, 0x36002D, 0x37002D, 0x38002D, 0x39002D, 0x2D002D, 0x45002D, 0x48002D, 0x4C002D, 0x50002D, 0x20002D,
				0x300045, 0x310045, 0x320045, 0x330045, 0x340045, 0x350045, 0x360045, 0x370045, 0x380045, 0x390045, 0x2D0045, 0x450045, 0x480045, 0x4C0045, 0x500045, 0x200045,
				0x300048, 0x310048, 0x320048, 0x330048, 0x340048, 0x350048, 0x360048, 0x370048, 0x380048, 0x390048, 0x2D0048, 0x450048, 0x480048, 0x4C0048, 0x500048, 0x200048,
				0x30004C, 0x31004C, 0x32004C, 0x33004C, 0x34004C, 0x35004C, 0x36004C, 0x37004C, 0x38004C, 0x39004C, 0x2D004C, 0x45004C, 0x48004C, 0x4C004C, 0x50004C, 0x20004C,
				0x300050, 0x310050, 0x320050, 0x330050, 0x340050, 0x350050, 0x360050, 0x370050, 0x380050, 0x390050, 0x2D0050, 0x450050, 0x480050, 0x4C0050, 0x500050, 0x200050,
				0x300020, 0x310020, 0x320020, 0x330020, 0x340020, 0x350020, 0x360020, 0x370020, 0x380020, 0x390020, 0x2D0020, 0x450020, 0x480020, 0x4C0020, 0x500020, 0x200020,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0xFF) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XBcdCodeBFullCharsetEncoder extends TableCharsetEncoder {
		private XBcdCodeBFullCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{-1}, 2);
		}
		private static final char[] GETNEXTSTATE0_20 = getNextState0_20();
		private static final char[] getNextState0_20() {
			return new char[] {
				0x1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x2, 0, 0,
				0x3, 0x4, 0x5, 0x6, 0x7, 0x8, 0x9, 0xA, 0xB, 0xC, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xD, 0, 0, 0xE, 0, 0, 0, 0xF, 0, 0, 0,
				0x10,
			};
		}
		private int getNextState0(int input) {
			if (input >= 0x20 && input <= 0x50) return GETNEXTSTATE0_20[input - 0x20];
			switch (input) {
			case 0x65: return 0x11;
			case 0x68: return 0x12;
			case 0x6C: return 0x13;
			case 0x70: return 0x14;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT1_20 = getOutput1_20();
		private static final char[] getOutput1_20() {
			return new char[] {
				0xFF01, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xFA, 0, 0,
				0xF0, 0xF1, 0xF2, 0xF3, 0xF4, 0xF5, 0xF6, 0xF7, 0xF8, 0xF9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xFB, 0, 0, 0xFC, 0, 0, 0, 0xFD, 0, 0, 0,
				0xFE,
			};
		}
		private long getOutput1(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT1_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xFBL;
			case 0x68: return 0xFCL;
			case 0x6C: return 0xFDL;
			case 0x70: return 0xFEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT2_20 = getOutput2_20();
		private static final char[] getOutput2_20() {
			return new char[] {
				0xAF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xAA, 0, 0,
				0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xA7, 0xA8, 0xA9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xAB, 0, 0, 0xAC, 0, 0, 0, 0xAD, 0, 0, 0,
				0xAE,
			};
		}
		private long getOutput2(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT2_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xABL;
			case 0x68: return 0xACL;
			case 0x6C: return 0xADL;
			case 0x70: return 0xAEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT3_20 = getOutput3_20();
		private static final char[] getOutput3_20() {
			return new char[] {
				0xF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xA, 0, 0,
				0x1, 0x101, 0x201, 0x301, 0x401, 0x501, 0x601, 0x701, 0x8, 0x9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xB, 0, 0, 0xC, 0, 0, 0, 0xD, 0, 0, 0,
				0xE,
			};
		}
		private long getOutput3(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT3_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xBL;
			case 0x68: return 0xCL;
			case 0x6C: return 0xDL;
			case 0x70: return 0xEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT4_20 = getOutput4_20();
		private static final char[] getOutput4_20() {
			return new char[] {
				0x1F, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x1A, 0, 0,
				0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x1B, 0, 0, 0x1C, 0, 0, 0, 0x1D, 0, 0, 0,
				0x1E,
			};
		}
		private long getOutput4(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT4_20[input - 0x20];
			switch (input) {
			case 0x65: return 0x1BL;
			case 0x68: return 0x1CL;
			case 0x6C: return 0x1DL;
			case 0x70: return 0x1EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT5_20 = getOutput5_20();
		private static final char[] getOutput5_20() {
			return new char[] {
				0x2F, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x2A, 0, 0,
				0x20, 0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x2B, 0, 0, 0x2C, 0, 0, 0, 0x2D, 0, 0, 0,
				0x2E,
			};
		}
		private long getOutput5(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT5_20[input - 0x20];
			switch (input) {
			case 0x65: return 0x2BL;
			case 0x68: return 0x2CL;
			case 0x6C: return 0x2DL;
			case 0x70: return 0x2EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT6_20 = getOutput6_20();
		private static final char[] getOutput6_20() {
			return new char[] {
				0x3F, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x3A, 0, 0,
				0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x3B, 0, 0, 0x3C, 0, 0, 0, 0x3D, 0, 0, 0,
				0x3E,
			};
		}
		private long getOutput6(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT6_20[input - 0x20];
			switch (input) {
			case 0x65: return 0x3BL;
			case 0x68: return 0x3CL;
			case 0x6C: return 0x3DL;
			case 0x70: return 0x3EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT7_20 = getOutput7_20();
		private static final char[] getOutput7_20() {
			return new char[] {
				0x4F, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x4A, 0, 0,
				0x40, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x4B, 0, 0, 0x4C, 0, 0, 0, 0x4D, 0, 0, 0,
				0x4E,
			};
		}
		private long getOutput7(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT7_20[input - 0x20];
			switch (input) {
			case 0x65: return 0x4BL;
			case 0x68: return 0x4CL;
			case 0x6C: return 0x4DL;
			case 0x70: return 0x4EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT8_20 = getOutput8_20();
		private static final char[] getOutput8_20() {
			return new char[] {
				0x5F, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x5A, 0, 0,
				0x50, 0x51, 0x52, 0x53, 0x54, 0x55, 0x56, 0x57, 0x58, 0x59, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x5B, 0, 0, 0x5C, 0, 0, 0, 0x5D, 0, 0, 0,
				0x5E,
			};
		}
		private long getOutput8(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT8_20[input - 0x20];
			switch (input) {
			case 0x65: return 0x5BL;
			case 0x68: return 0x5CL;
			case 0x6C: return 0x5DL;
			case 0x70: return 0x5EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT9_20 = getOutput9_20();
		private static final char[] getOutput9_20() {
			return new char[] {
				0x6F, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x6A, 0, 0,
				0x60, 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x6B, 0, 0, 0x6C, 0, 0, 0, 0x6D, 0, 0, 0,
				0x6E,
			};
		}
		private long getOutput9(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT9_20[input - 0x20];
			switch (input) {
			case 0x65: return 0x6BL;
			case 0x68: return 0x6CL;
			case 0x6C: return 0x6DL;
			case 0x70: return 0x6EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT10_20 = getOutput10_20();
		private static final char[] getOutput10_20() {
			return new char[] {
				0x7F, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x7A, 0, 0,
				0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x7B, 0, 0, 0x7C, 0, 0, 0, 0x7D, 0, 0, 0,
				0x7E,
			};
		}
		private long getOutput10(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT10_20[input - 0x20];
			switch (input) {
			case 0x65: return 0x7BL;
			case 0x68: return 0x7CL;
			case 0x6C: return 0x7DL;
			case 0x70: return 0x7EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT11_20 = getOutput11_20();
		private static final char[] getOutput11_20() {
			return new char[] {
				0x8F, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x8A, 0, 0,
				0x80, 0x81, 0x82, 0x83, 0x84, 0x85, 0x86, 0x87, 0x88, 0x89, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x8B, 0, 0, 0x8C, 0, 0, 0, 0x8D, 0, 0, 0,
				0x8E,
			};
		}
		private long getOutput11(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT11_20[input - 0x20];
			switch (input) {
			case 0x65: return 0x8BL;
			case 0x68: return 0x8CL;
			case 0x6C: return 0x8DL;
			case 0x70: return 0x8EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT12_20 = getOutput12_20();
		private static final char[] getOutput12_20() {
			return new char[] {
				0x9F, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0x9A, 0, 0,
				0x90, 0x91, 0x92, 0x93, 0x94, 0x95, 0x96, 0x97, 0x98, 0x99, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0x9B, 0, 0, 0x9C, 0, 0, 0, 0x9D, 0, 0, 0,
				0x9E,
			};
		}
		private long getOutput12(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT12_20[input - 0x20];
			switch (input) {
			case 0x65: return 0x9BL;
			case 0x68: return 0x9CL;
			case 0x6C: return 0x9DL;
			case 0x70: return 0x9EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT13_20 = getOutput13_20();
		private static final char[] getOutput13_20() {
			return new char[] {
				0xBF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xBA, 0, 0,
				0xB0, 0xB1, 0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xBB, 0, 0, 0xBC, 0, 0, 0, 0xBD, 0, 0, 0,
				0xBE,
			};
		}
		private long getOutput13(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT13_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xBBL;
			case 0x68: return 0xBCL;
			case 0x6C: return 0xBDL;
			case 0x70: return 0xBEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT14_20 = getOutput14_20();
		private static final char[] getOutput14_20() {
			return new char[] {
				0xCF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xCA, 0, 0,
				0xC0, 0xC1, 0xC2, 0xC3, 0xC4, 0xC5, 0xC6, 0xC7, 0xC8, 0xC9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xCB, 0, 0, 0xCC, 0, 0, 0, 0xCD, 0, 0, 0,
				0xCE,
			};
		}
		private long getOutput14(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT14_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xCBL;
			case 0x68: return 0xCCL;
			case 0x6C: return 0xCDL;
			case 0x70: return 0xCEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT15_20 = getOutput15_20();
		private static final char[] getOutput15_20() {
			return new char[] {
				0xDF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xDA, 0, 0,
				0xD0, 0xD1, 0xD2, 0xD3, 0xD4, 0xD5, 0xD6, 0xD7, 0xD8, 0xD9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xDB, 0, 0, 0xDC, 0, 0, 0, 0xDD, 0, 0, 0,
				0xDE,
			};
		}
		private long getOutput15(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT15_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xDBL;
			case 0x68: return 0xDCL;
			case 0x6C: return 0xDDL;
			case 0x70: return 0xDEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT16_20 = getOutput16_20();
		private static final char[] getOutput16_20() {
			return new char[] {
				0xEF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xEA, 0, 0,
				0xE0, 0xE1, 0xE2, 0xE3, 0xE4, 0xE5, 0xE6, 0xE7, 0xE8, 0xE9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xEB, 0, 0, 0xEC, 0, 0, 0, 0xED, 0, 0, 0,
				0xEE,
			};
		}
		private long getOutput16(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT16_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xEBL;
			case 0x68: return 0xECL;
			case 0x6C: return 0xEDL;
			case 0x70: return 0xEEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT17_20 = getOutput17_20();
		private static final char[] getOutput17_20() {
			return new char[] {
				0xBF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xBA, 0, 0,
				0xB0, 0xB1, 0xB2, 0xB3, 0xB4, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xBB, 0, 0, 0xBC, 0, 0, 0, 0xBD, 0, 0, 0,
				0xBE,
			};
		}
		private long getOutput17(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT17_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xBBL;
			case 0x68: return 0xBCL;
			case 0x6C: return 0xBDL;
			case 0x70: return 0xBEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT18_20 = getOutput18_20();
		private static final char[] getOutput18_20() {
			return new char[] {
				0xCF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xCA, 0, 0,
				0xC0, 0xC1, 0xC2, 0xC3, 0xC4, 0xC5, 0xC6, 0xC7, 0xC8, 0xC9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xCB, 0, 0, 0xCC, 0, 0, 0, 0xCD, 0, 0, 0,
				0xCE,
			};
		}
		private long getOutput18(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT18_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xCBL;
			case 0x68: return 0xCCL;
			case 0x6C: return 0xCDL;
			case 0x70: return 0xCEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT19_20 = getOutput19_20();
		private static final char[] getOutput19_20() {
			return new char[] {
				0xDF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xDA, 0, 0,
				0xD0, 0xD1, 0xD2, 0xD3, 0xD4, 0xD5, 0xD6, 0xD7, 0xD8, 0xD9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xDB, 0, 0, 0xDC, 0, 0, 0, 0xDD, 0, 0, 0,
				0xDE,
			};
		}
		private long getOutput19(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT19_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xDBL;
			case 0x68: return 0xDCL;
			case 0x6C: return 0xDDL;
			case 0x70: return 0xDEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT20_20 = getOutput20_20();
		private static final char[] getOutput20_20() {
			return new char[] {
				0xEF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xEA, 0, 0,
				0xE0, 0xE1, 0xE2, 0xE3, 0xE4, 0xE5, 0xE6, 0xE7, 0xE8, 0xE9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0xEB, 0, 0, 0xEC, 0, 0, 0, 0xED, 0, 0, 0,
				0xEE,
			};
		}
		private long getOutput20(int input) {
			if (input >= 0x20 && input <= 0x50) return GETOUTPUT20_20[input - 0x20];
			switch (input) {
			case 0x65: return 0xEBL;
			case 0x68: return 0xECL;
			case 0x6C: return 0xEDL;
			case 0x70: return 0xEEL;
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
			default: return 0;
			}
		}
	}
}
