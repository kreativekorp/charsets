package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XHp18161425Charset extends Charset {
	public XHp18161425Charset() {
		super("x-hp-1816-1425", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XHp18161425CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XHp18161425CharsetEncoder(this);
	}

	private static final class XHp18161425CharsetDecoder extends TableCharsetDecoder {
		private XHp18161425CharsetDecoder(Charset cs) {
			super(cs, 1.58763f, 2f, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x38: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final int[] GETOUTPUT0_0 = {
			0xFFFE, 0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x7, 0x8, 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF,
			0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E, 0x1F,
			0xA0, 0xDE1AD833, 0xDE1BD833, 0xDE1CD833, 0xDE1DD833, 0xDE1ED833, 0xDE1FD833, 0xDE20D833, 0xDE21D833, 0xDE22D833, 0xDE23D833, 0xDE24D833, 0xDE25D833, 0xDE26D833, 0xDE27D833, 0xDE28D833,
			0xDE29D833, 0xDE2AD833, 0xDE2BD833, 0xDE2CD833, 0xDE2DD833, 0xDE2ED833, 0xDE2FD833, 0xDE30D833, 0xDE2BD833, 0xDE31D833, 0xDE32D833, 0xDE33D833, 0xDE34D833, 0x259A, 0xDE35D833, 0xDE36D833,
			0xDE37D833, 0xDE38D833, 0xDE39D833, 0xDE3AD833, 0xDE3BD833, 0xDE3CD833, 0xDE3DD833, 0xDE3ED833, 0xDE3FD833, 0xDE40D833, 0xDE41D833, 0xDE42D833, 0xDE43D833, 0xDE44D833, 0xDE45D833, 0xDE46D833,
			0xDE47D833, 0xDE48D833, 0xDE49D833, 0xDE4AD833, 0xDE4BD833, 0xDE4CD833, 0xDE4DD833, 0xDE4ED833, 0xDE4FD833, 0xDE50D833, 0x2598, 0x259D, 0x2596, 0x2597, 0x2580, 0x258C,
		};
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x5F) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x42: return 0xDE39D833DE2BD833L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			default: return 0;
			}
		}
	}

	private static final class XHp18161425CharsetEncoder extends TableCharsetEncoder {
		private XHp18161425CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{32}, 4);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			}
			return 0;
		}
		private int getNextState1(int input) {
			switch (input) {
			case 0xDE2B: return 0x2;
			}
			return 0;
		}
		private int getNextState2(int input) {
			switch (input) {
			case 0xD833: return 0x3;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 1: return getNextState1(input);
			case 2: return getNextState2(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_0 = {
			0x1, 0x101, 0x201, 0x301, 0x401, 0x501, 0x601, 0x701, 0x8, 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF,
			0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E, 0x1F,
			0x20,
		};
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x20) return GETOUTPUT0_0[input - 0x0];
			switch (input) {
			case 0xA0: return 0x20L;
			case 0x2580: return 0x5EL;
			case 0x258C: return 0x5FL;
			case 0x2596: return 0x5CL;
			case 0x2597: return 0x5DL;
			case 0x2598: return 0x5AL;
			case 0x259A: return 0x3DL;
			case 0x259D: return 0x5BL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DE1A = {
			0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, 0x2E, 0x2F, 0x30,
			0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x39, 0x3A, 0x3B, 0x3C, 0x3E, 0x3F, 0x40, 0x41, 0x42,
			0x43, 0x44, 0x45, 0x46, 0x47, 0x48, 0x49, 0x4A, 0x4B, 0x4C, 0x4D, 0x4E, 0x4F, 0x50, 0x51, 0x52,
			0x53, 0x54, 0x55, 0x56, 0x57, 0x58, 0x59,
		};
		private long getOutput1(int input) {
			if (input >= 0xDE1A && input <= 0xDE50) return GETOUTPUT1_DE1A[input - 0xDE1A];
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xDE39: return 0x4238L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 3: return getOutput3(input);
			default: return 0;
			}
		}
	}
}
