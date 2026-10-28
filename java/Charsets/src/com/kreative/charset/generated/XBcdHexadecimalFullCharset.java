package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XBcdHexadecimalFullCharset extends Charset {
	public XBcdHexadecimalFullCharset() {
		super("x-bcd-hexadecimal-full", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XBcdHexadecimalFullCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XBcdHexadecimalFullCharsetEncoder(this);
	}

	private static final class XBcdHexadecimalFullCharsetDecoder extends TableCharsetDecoder {
		private XBcdHexadecimalFullCharsetDecoder(Charset cs) {
			super(cs, 2f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0x300030, 0x310030, 0x320030, 0x330030, 0x340030, 0x350030, 0x360030, 0x370030, 0x380030, 0x390030, 0x410030, 0x420030, 0x430030, 0x440030, 0x450030, 0x460030,
				0x300031, 0x310031, 0x320031, 0x330031, 0x340031, 0x350031, 0x360031, 0x370031, 0x380031, 0x390031, 0x410031, 0x420031, 0x430031, 0x440031, 0x450031, 0x460031,
				0x300032, 0x310032, 0x320032, 0x330032, 0x340032, 0x350032, 0x360032, 0x370032, 0x380032, 0x390032, 0x410032, 0x420032, 0x430032, 0x440032, 0x450032, 0x460032,
				0x300033, 0x310033, 0x320033, 0x330033, 0x340033, 0x350033, 0x360033, 0x370033, 0x380033, 0x390033, 0x410033, 0x420033, 0x430033, 0x440033, 0x450033, 0x460033,
				0x300034, 0x310034, 0x320034, 0x330034, 0x340034, 0x350034, 0x360034, 0x370034, 0x380034, 0x390034, 0x410034, 0x420034, 0x430034, 0x440034, 0x450034, 0x460034,
				0x300035, 0x310035, 0x320035, 0x330035, 0x340035, 0x350035, 0x360035, 0x370035, 0x380035, 0x390035, 0x410035, 0x420035, 0x430035, 0x440035, 0x450035, 0x460035,
				0x300036, 0x310036, 0x320036, 0x330036, 0x340036, 0x350036, 0x360036, 0x370036, 0x380036, 0x390036, 0x410036, 0x420036, 0x430036, 0x440036, 0x450036, 0x460036,
				0x300037, 0x310037, 0x320037, 0x330037, 0x340037, 0x350037, 0x360037, 0x370037, 0x380037, 0x390037, 0x410037, 0x420037, 0x430037, 0x440037, 0x450037, 0x460037,
				0x300038, 0x310038, 0x320038, 0x330038, 0x340038, 0x350038, 0x360038, 0x370038, 0x380038, 0x390038, 0x410038, 0x420038, 0x430038, 0x440038, 0x450038, 0x460038,
				0x300039, 0x310039, 0x320039, 0x330039, 0x340039, 0x350039, 0x360039, 0x370039, 0x380039, 0x390039, 0x410039, 0x420039, 0x430039, 0x440039, 0x450039, 0x460039,
				0x300041, 0x310041, 0x320041, 0x330041, 0x340041, 0x350041, 0x360041, 0x370041, 0x380041, 0x390041, 0x410041, 0x420041, 0x430041, 0x440041, 0x450041, 0x460041,
				0x300042, 0x310042, 0x320042, 0x330042, 0x340042, 0x350042, 0x360042, 0x370042, 0x380042, 0x390042, 0x410042, 0x420042, 0x430042, 0x440042, 0x450042, 0x460042,
				0x300043, 0x310043, 0x320043, 0x330043, 0x340043, 0x350043, 0x360043, 0x370043, 0x380043, 0x390043, 0x410043, 0x420043, 0x430043, 0x440043, 0x450043, 0x460043,
				0x300044, 0x310044, 0x320044, 0x330044, 0x340044, 0x350044, 0x360044, 0x370044, 0x380044, 0x390044, 0x410044, 0x420044, 0x430044, 0x440044, 0x450044, 0x460044,
				0x300045, 0x310045, 0x320045, 0x330045, 0x340045, 0x350045, 0x360045, 0x370045, 0x380045, 0x390045, 0x410045, 0x420045, 0x430045, 0x440045, 0x450045, 0x460045,
				0x300046, 0x310046, 0x320046, 0x330046, 0x340046, 0x350046, 0x360046, 0x370046, 0x380046, 0x390046, 0x410046, 0x420046, 0x430046, 0x440046, 0x450046, 0x460046,
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

	private static final class XBcdHexadecimalFullCharsetEncoder extends TableCharsetEncoder {
		private XBcdHexadecimalFullCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{-1}, 2);
		}
		private static final char[] GETNEXTSTATE0_30 = getNextState0_30();
		private static final char[] getNextState0_30() {
			return "\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000B\f\r\u000E\u000F\u0010".toCharArray();
		}
		private int getNextState0(int input) {
			if (input >= 0x30 && input <= 0x46) return GETNEXTSTATE0_30[input - 0x30];
			switch (input) {
			case 0x61: return 0x11;
			case 0x62: return 0x12;
			case 0x63: return 0x13;
			case 0x64: return 0x14;
			case 0x65: return 0x15;
			case 0x66: return 0x16;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput1(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1219[input - 0x30];
			switch (input) {
			case 0x61: return 0xAL;
			case 0x62: return 0xBL;
			case 0x63: return 0xCL;
			case 0x64: return 0xDL;
			case 0x65: return 0xEL;
			case 0x66: return 0xFL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT2_30 = getOutput2_30();
		private static final char[] getOutput2_30() {
			return "\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001A\u001B\u001C\u001D\u001E\u001F".toCharArray();
		}
		private long getOutput2(int input) {
			if (input >= 0x30 && input <= 0x46) return GETOUTPUT2_30[input - 0x30];
			switch (input) {
			case 0x61: return 0x1AL;
			case 0x62: return 0x1BL;
			case 0x63: return 0x1CL;
			case 0x64: return 0x1DL;
			case 0x65: return 0x1EL;
			case 0x66: return 0x1FL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT3_30 = getOutput3_30();
		private static final char[] getOutput3_30() {
			return " !\"#$%&\'()\u0000\u0000\u0000\u0000\u0000\u0000\u0000*+,-./".toCharArray();
		}
		private long getOutput3(int input) {
			if (input >= 0x30 && input <= 0x46) return GETOUTPUT3_30[input - 0x30];
			switch (input) {
			case 0x61: return 0x2AL;
			case 0x62: return 0x2BL;
			case 0x63: return 0x2CL;
			case 0x64: return 0x2DL;
			case 0x65: return 0x2EL;
			case 0x66: return 0x2FL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT4_30 = getOutput4_30();
		private static final char[] getOutput4_30() {
			return "0123456789\u0000\u0000\u0000\u0000\u0000\u0000\u0000:;<=>?".toCharArray();
		}
		private long getOutput4(int input) {
			if (input >= 0x30 && input <= 0x46) return GETOUTPUT4_30[input - 0x30];
			switch (input) {
			case 0x61: return 0x3AL;
			case 0x62: return 0x3BL;
			case 0x63: return 0x3CL;
			case 0x64: return 0x3DL;
			case 0x65: return 0x3EL;
			case 0x66: return 0x3FL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT5_30 = getOutput5_30();
		private static final char[] getOutput5_30() {
			return "@ABCDEFGHI\u0000\u0000\u0000\u0000\u0000\u0000\u0000JKLMNO".toCharArray();
		}
		private long getOutput5(int input) {
			if (input >= 0x30 && input <= 0x46) return GETOUTPUT5_30[input - 0x30];
			switch (input) {
			case 0x61: return 0x4AL;
			case 0x62: return 0x4BL;
			case 0x63: return 0x4CL;
			case 0x64: return 0x4DL;
			case 0x65: return 0x4EL;
			case 0x66: return 0x4FL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT6_30 = getOutput6_30();
		private static final char[] getOutput6_30() {
			return "PQRSTUVWXY\u0000\u0000\u0000\u0000\u0000\u0000\u0000Z[\\]^_".toCharArray();
		}
		private long getOutput6(int input) {
			if (input >= 0x30 && input <= 0x46) return GETOUTPUT6_30[input - 0x30];
			switch (input) {
			case 0x61: return 0x5AL;
			case 0x62: return 0x5BL;
			case 0x63: return 0x5CL;
			case 0x64: return 0x5DL;
			case 0x65: return 0x5EL;
			case 0x66: return 0x5FL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT7_30 = getOutput7_30();
		private static final char[] getOutput7_30() {
			return "`abcdefghi\u0000\u0000\u0000\u0000\u0000\u0000\u0000jklmno".toCharArray();
		}
		private long getOutput7(int input) {
			if (input >= 0x30 && input <= 0x46) return GETOUTPUT7_30[input - 0x30];
			switch (input) {
			case 0x61: return 0x6AL;
			case 0x62: return 0x6BL;
			case 0x63: return 0x6CL;
			case 0x64: return 0x6DL;
			case 0x65: return 0x6EL;
			case 0x66: return 0x6FL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT8_30 = getOutput8_30();
		private static final char[] getOutput8_30() {
			return "pqrstuvwxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000z{|}~\u007F".toCharArray();
		}
		private long getOutput8(int input) {
			if (input >= 0x30 && input <= 0x46) return GETOUTPUT8_30[input - 0x30];
			switch (input) {
			case 0x61: return 0x7AL;
			case 0x62: return 0x7BL;
			case 0x63: return 0x7CL;
			case 0x64: return 0x7DL;
			case 0x65: return 0x7EL;
			case 0x66: return 0x7FL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT9_30 = getOutput9_30();
		private static final char[] getOutput9_30() {
			return "\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008A\u008B\u008C\u008D\u008E\u008F".toCharArray();
		}
		private long getOutput9(int input) {
			if (input >= 0x30 && input <= 0x46) return GETOUTPUT9_30[input - 0x30];
			switch (input) {
			case 0x61: return 0x8AL;
			case 0x62: return 0x8BL;
			case 0x63: return 0x8CL;
			case 0x64: return 0x8DL;
			case 0x65: return 0x8EL;
			case 0x66: return 0x8FL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT10_30 = getOutput10_30();
		private static final char[] getOutput10_30() {
			return "\u0090\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009A\u009B\u009C\u009D\u009E\u009F".toCharArray();
		}
		private long getOutput10(int input) {
			if (input >= 0x30 && input <= 0x46) return GETOUTPUT10_30[input - 0x30];
			switch (input) {
			case 0x61: return 0x9AL;
			case 0x62: return 0x9BL;
			case 0x63: return 0x9CL;
			case 0x64: return 0x9DL;
			case 0x65: return 0x9EL;
			case 0x66: return 0x9FL;
			}
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1220[input - 0x30];
			switch (input) {
			case 0x61: return 0xAAL;
			case 0x62: return 0xABL;
			case 0x63: return 0xACL;
			case 0x64: return 0xADL;
			case 0x65: return 0xAEL;
			case 0x66: return 0xAFL;
			}
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1221[input - 0x30];
			switch (input) {
			case 0x61: return 0xBAL;
			case 0x62: return 0xBBL;
			case 0x63: return 0xBCL;
			case 0x64: return 0xBDL;
			case 0x65: return 0xBEL;
			case 0x66: return 0xBFL;
			}
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1222[input - 0x30];
			switch (input) {
			case 0x61: return 0xCAL;
			case 0x62: return 0xCBL;
			case 0x63: return 0xCCL;
			case 0x64: return 0xCDL;
			case 0x65: return 0xCEL;
			case 0x66: return 0xCFL;
			}
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1223[input - 0x30];
			switch (input) {
			case 0x61: return 0xDAL;
			case 0x62: return 0xDBL;
			case 0x63: return 0xDCL;
			case 0x64: return 0xDDL;
			case 0x65: return 0xDEL;
			case 0x66: return 0xDFL;
			}
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1224[input - 0x30];
			switch (input) {
			case 0x61: return 0xEAL;
			case 0x62: return 0xEBL;
			case 0x63: return 0xECL;
			case 0x64: return 0xEDL;
			case 0x65: return 0xEEL;
			case 0x66: return 0xEFL;
			}
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1225[input - 0x30];
			switch (input) {
			case 0x61: return 0xFAL;
			case 0x62: return 0xFBL;
			case 0x63: return 0xFCL;
			case 0x64: return 0xFDL;
			case 0x65: return 0xFEL;
			case 0x66: return 0xFF01L;
			}
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1220[input - 0x30];
			switch (input) {
			case 0x61: return 0xAAL;
			case 0x62: return 0xABL;
			case 0x63: return 0xACL;
			case 0x64: return 0xADL;
			case 0x65: return 0xAEL;
			case 0x66: return 0xAFL;
			}
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1221[input - 0x30];
			switch (input) {
			case 0x61: return 0xBAL;
			case 0x62: return 0xBBL;
			case 0x63: return 0xBCL;
			case 0x64: return 0xBDL;
			case 0x65: return 0xBEL;
			case 0x66: return 0xBFL;
			}
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1222[input - 0x30];
			switch (input) {
			case 0x61: return 0xCAL;
			case 0x62: return 0xCBL;
			case 0x63: return 0xCCL;
			case 0x64: return 0xCDL;
			case 0x65: return 0xCEL;
			case 0x66: return 0xCFL;
			}
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1223[input - 0x30];
			switch (input) {
			case 0x61: return 0xDAL;
			case 0x62: return 0xDBL;
			case 0x63: return 0xDCL;
			case 0x64: return 0xDDL;
			case 0x65: return 0xDEL;
			case 0x66: return 0xDFL;
			}
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1224[input - 0x30];
			switch (input) {
			case 0x61: return 0xEAL;
			case 0x62: return 0xEBL;
			case 0x63: return 0xECL;
			case 0x64: return 0xEDL;
			case 0x65: return 0xEEL;
			case 0x66: return 0xEFL;
			}
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0x30 && input <= 0x46) return CommonSubtables.COMMON1225[input - 0x30];
			switch (input) {
			case 0x61: return 0xFAL;
			case 0x62: return 0xFBL;
			case 0x63: return 0xFCL;
			case 0x64: return 0xFDL;
			case 0x65: return 0xFEL;
			case 0x66: return 0xFF01L;
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
			default: return 0;
			}
		}
	}
}
