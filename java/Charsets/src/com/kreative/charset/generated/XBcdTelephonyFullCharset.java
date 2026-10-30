package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XBcdTelephonyFullCharset extends Charset {
	public XBcdTelephonyFullCharset() {
		super("x-bcd-telephony-full", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XBcdTelephonyFullCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XBcdTelephonyFullCharsetEncoder(this);
	}

	private static final class XBcdTelephonyFullCharsetDecoder extends TableCharsetDecoder {
		private XBcdTelephonyFullCharsetDecoder(Charset cs) {
			super(cs, 2f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0x300030, 0x310030, 0x320030, 0x330030, 0x340030, 0x350030, 0x360030, 0x370030, 0x380030, 0x390030, 0x2A0030, 0x230030, 0x410030, 0x420030, 0x430030, 0x200030,
				0x300031, 0x310031, 0x320031, 0x330031, 0x340031, 0x350031, 0x360031, 0x370031, 0x380031, 0x390031, 0x2A0031, 0x230031, 0x410031, 0x420031, 0x430031, 0x200031,
				0x300032, 0x310032, 0x320032, 0x330032, 0x340032, 0x350032, 0x360032, 0x370032, 0x380032, 0x390032, 0x2A0032, 0x230032, 0x410032, 0x420032, 0x430032, 0x200032,
				0x300033, 0x310033, 0x320033, 0x330033, 0x340033, 0x350033, 0x360033, 0x370033, 0x380033, 0x390033, 0x2A0033, 0x230033, 0x410033, 0x420033, 0x430033, 0x200033,
				0x300034, 0x310034, 0x320034, 0x330034, 0x340034, 0x350034, 0x360034, 0x370034, 0x380034, 0x390034, 0x2A0034, 0x230034, 0x410034, 0x420034, 0x430034, 0x200034,
				0x300035, 0x310035, 0x320035, 0x330035, 0x340035, 0x350035, 0x360035, 0x370035, 0x380035, 0x390035, 0x2A0035, 0x230035, 0x410035, 0x420035, 0x430035, 0x200035,
				0x300036, 0x310036, 0x320036, 0x330036, 0x340036, 0x350036, 0x360036, 0x370036, 0x380036, 0x390036, 0x2A0036, 0x230036, 0x410036, 0x420036, 0x430036, 0x200036,
				0x300037, 0x310037, 0x320037, 0x330037, 0x340037, 0x350037, 0x360037, 0x370037, 0x380037, 0x390037, 0x2A0037, 0x230037, 0x410037, 0x420037, 0x430037, 0x200037,
				0x300038, 0x310038, 0x320038, 0x330038, 0x340038, 0x350038, 0x360038, 0x370038, 0x380038, 0x390038, 0x2A0038, 0x230038, 0x410038, 0x420038, 0x430038, 0x200038,
				0x300039, 0x310039, 0x320039, 0x330039, 0x340039, 0x350039, 0x360039, 0x370039, 0x380039, 0x390039, 0x2A0039, 0x230039, 0x410039, 0x420039, 0x430039, 0x200039,
				0x30002A, 0x31002A, 0x32002A, 0x33002A, 0x34002A, 0x35002A, 0x36002A, 0x37002A, 0x38002A, 0x39002A, 0x2A002A, 0x23002A, 0x41002A, 0x42002A, 0x43002A, 0x20002A,
				0x300023, 0x310023, 0x320023, 0x330023, 0x340023, 0x350023, 0x360023, 0x370023, 0x380023, 0x390023, 0x2A0023, 0x230023, 0x410023, 0x420023, 0x430023, 0x200023,
				0x300041, 0x310041, 0x320041, 0x330041, 0x340041, 0x350041, 0x360041, 0x370041, 0x380041, 0x390041, 0x2A0041, 0x230041, 0x410041, 0x420041, 0x430041, 0x200041,
				0x300042, 0x310042, 0x320042, 0x330042, 0x340042, 0x350042, 0x360042, 0x370042, 0x380042, 0x390042, 0x2A0042, 0x230042, 0x410042, 0x420042, 0x430042, 0x200042,
				0x300043, 0x310043, 0x320043, 0x330043, 0x340043, 0x350043, 0x360043, 0x370043, 0x380043, 0x390043, 0x2A0043, 0x230043, 0x410043, 0x420043, 0x430043, 0x200043,
				0x300020, 0x310020, 0x320020, 0x330020, 0x340020, 0x350020, 0x360020, 0x370020, 0x380020, 0x390020, 0x2A0020, 0x230020, 0x410020, 0x420020, 0x430020, 0x200020,
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

	private static final class XBcdTelephonyFullCharsetEncoder extends TableCharsetEncoder {
		private XBcdTelephonyFullCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{-86}, 2);
		}
		private static final char[] GETNEXTSTATE0_20 = getNextState0_20();
		private static final char[] getNextState0_20() {
			return "\u0001\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000E\u000F\u0010".toCharArray();
		}
		private int getNextState0(int input) {
			if (input >= 0x20 && input <= 0x43) return GETNEXTSTATE0_20[input - 0x20];
			switch (input) {
			case 0x61: return 0x11;
			case 0x62: return 0x12;
			case 0x63: return 0x13;
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
			return "\uFF01\u0000\u0000\u00FB\u0000\u0000\u0000\u0000\u0000\u0000\u00FA\u0000\u0000\u0000\u0000\u0000\u00F0\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00FC\u00FD\u00FE".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT1_20[input - 0x20];
			switch (input) {
			case 0x61: return 0xFCL;
			case 0x62: return 0xFDL;
			case 0x63: return 0xFEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT2_20 = getOutput2_20();
		private static final char[] getOutput2_20() {
			return "\u00BF\u0000\u0000\u00BB\u0000\u0000\u0000\u0000\u0000\u0000\u00BA\u0000\u0000\u0000\u0000\u0000\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00BC\u00BD\u00BE".toCharArray();
		}
		private long getOutput2(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT2_20[input - 0x20];
			switch (input) {
			case 0x61: return 0xBCL;
			case 0x62: return 0xBDL;
			case 0x63: return 0xBEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT3_20 = getOutput3_20();
		private static final char[] getOutput3_20() {
			return "\u00AF\u0000\u0000\u00AB\u0000\u0000\u0000\u0000\u0000\u0000\u00AA\u0000\u0000\u0000\u0000\u0000\u00A0\u00A1\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00AC\u00AD\u00AE".toCharArray();
		}
		private long getOutput3(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT3_20[input - 0x20];
			switch (input) {
			case 0x61: return 0xACL;
			case 0x62: return 0xADL;
			case 0x63: return 0xAEL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0x20 && input <= 0x43) return CommonSubtables.COMMON1237[input - 0x20];
			switch (input) {
			case 0x61: return 0xCL;
			case 0x62: return 0xDL;
			case 0x63: return 0xEL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT5_20 = getOutput5_20();
		private static final char[] getOutput5_20() {
			return "\u001F\u0000\u0000\u001B\u0000\u0000\u0000\u0000\u0000\u0000\u001A\u0000\u0000\u0000\u0000\u0000\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001C\u001D\u001E".toCharArray();
		}
		private long getOutput5(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT5_20[input - 0x20];
			switch (input) {
			case 0x61: return 0x1CL;
			case 0x62: return 0x1DL;
			case 0x63: return 0x1EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT6_20 = getOutput6_20();
		private static final char[] getOutput6_20() {
			return "/\u0000\u0000+\u0000\u0000\u0000\u0000\u0000\u0000*\u0000\u0000\u0000\u0000\u0000 !\"#$%&\'()\u0000\u0000\u0000\u0000\u0000\u0000\u0000,-.".toCharArray();
		}
		private long getOutput6(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT6_20[input - 0x20];
			switch (input) {
			case 0x61: return 0x2CL;
			case 0x62: return 0x2DL;
			case 0x63: return 0x2EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT7_20 = getOutput7_20();
		private static final char[] getOutput7_20() {
			return "?\u0000\u0000;\u0000\u0000\u0000\u0000\u0000\u0000:\u0000\u0000\u0000\u0000\u00000123456789\u0000\u0000\u0000\u0000\u0000\u0000\u0000<=>".toCharArray();
		}
		private long getOutput7(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT7_20[input - 0x20];
			switch (input) {
			case 0x61: return 0x3CL;
			case 0x62: return 0x3DL;
			case 0x63: return 0x3EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT8_20 = getOutput8_20();
		private static final char[] getOutput8_20() {
			return "O\u0000\u0000K\u0000\u0000\u0000\u0000\u0000\u0000J\u0000\u0000\u0000\u0000\u0000@ABCDEFGHI\u0000\u0000\u0000\u0000\u0000\u0000\u0000LMN".toCharArray();
		}
		private long getOutput8(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT8_20[input - 0x20];
			switch (input) {
			case 0x61: return 0x4CL;
			case 0x62: return 0x4DL;
			case 0x63: return 0x4EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT9_20 = getOutput9_20();
		private static final char[] getOutput9_20() {
			return "_\u0000\u0000[\u0000\u0000\u0000\u0000\u0000\u0000Z\u0000\u0000\u0000\u0000\u0000PQRSTUVWXY\u0000\u0000\u0000\u0000\u0000\u0000\u0000\\]^".toCharArray();
		}
		private long getOutput9(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT9_20[input - 0x20];
			switch (input) {
			case 0x61: return 0x5CL;
			case 0x62: return 0x5DL;
			case 0x63: return 0x5EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT10_20 = getOutput10_20();
		private static final char[] getOutput10_20() {
			return "o\u0000\u0000k\u0000\u0000\u0000\u0000\u0000\u0000j\u0000\u0000\u0000\u0000\u0000`abcdefghi\u0000\u0000\u0000\u0000\u0000\u0000\u0000lmn".toCharArray();
		}
		private long getOutput10(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT10_20[input - 0x20];
			switch (input) {
			case 0x61: return 0x6CL;
			case 0x62: return 0x6DL;
			case 0x63: return 0x6EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT11_20 = getOutput11_20();
		private static final char[] getOutput11_20() {
			return "\u007F\u0000\u0000{\u0000\u0000\u0000\u0000\u0000\u0000z\u0000\u0000\u0000\u0000\u0000pqrstuvwxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000|}~".toCharArray();
		}
		private long getOutput11(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT11_20[input - 0x20];
			switch (input) {
			case 0x61: return 0x7CL;
			case 0x62: return 0x7DL;
			case 0x63: return 0x7EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT12_20 = getOutput12_20();
		private static final char[] getOutput12_20() {
			return "\u008F\u0000\u0000\u008B\u0000\u0000\u0000\u0000\u0000\u0000\u008A\u0000\u0000\u0000\u0000\u0000\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008C\u008D\u008E".toCharArray();
		}
		private long getOutput12(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT12_20[input - 0x20];
			switch (input) {
			case 0x61: return 0x8CL;
			case 0x62: return 0x8DL;
			case 0x63: return 0x8EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT13_20 = getOutput13_20();
		private static final char[] getOutput13_20() {
			return "\u009F\u0000\u0000\u009B\u0000\u0000\u0000\u0000\u0000\u0000\u009A\u0000\u0000\u0000\u0000\u0000\u0090\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009C\u009D\u009E".toCharArray();
		}
		private long getOutput13(int input) {
			if (input >= 0x20 && input <= 0x43) return GETOUTPUT13_20[input - 0x20];
			switch (input) {
			case 0x61: return 0x9CL;
			case 0x62: return 0x9DL;
			case 0x63: return 0x9EL;
			}
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0x20 && input <= 0x43) return CommonSubtables.COMMON1238[input - 0x20];
			switch (input) {
			case 0x61: return 0xCCL;
			case 0x62: return 0xCDL;
			case 0x63: return 0xCEL;
			}
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0x20 && input <= 0x43) return CommonSubtables.COMMON1239[input - 0x20];
			switch (input) {
			case 0x61: return 0xDCL;
			case 0x62: return 0xDDL;
			case 0x63: return 0xDEL;
			}
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0x20 && input <= 0x43) return CommonSubtables.COMMON1240[input - 0x20];
			switch (input) {
			case 0x61: return 0xECL;
			case 0x62: return 0xEDL;
			case 0x63: return 0xEEL;
			}
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0x20 && input <= 0x43) return CommonSubtables.COMMON1238[input - 0x20];
			switch (input) {
			case 0x61: return 0xCCL;
			case 0x62: return 0xCDL;
			case 0x63: return 0xCEL;
			}
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0x20 && input <= 0x43) return CommonSubtables.COMMON1239[input - 0x20];
			switch (input) {
			case 0x61: return 0xDCL;
			case 0x62: return 0xDDL;
			case 0x63: return 0xDEL;
			}
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0x20 && input <= 0x43) return CommonSubtables.COMMON1240[input - 0x20];
			switch (input) {
			case 0x61: return 0xECL;
			case 0x62: return 0xEDL;
			case 0x63: return 0xEEL;
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
			default: return 0;
			}
		}
	}
}
