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
		private static final int[] GETOUTPUT0_20 = getOutput0_20();
		private static final int[] getOutput0_20() {
			return new int[] {
				0xA0, 0xDE1AD833, 0xDE1BD833, 0xDE1CD833, 0xDE1DD833, 0xDE1ED833, 0xDE1FD833, 0xDE20D833, 0xDE21D833, 0xDE22D833, 0xDE23D833, 0xDE24D833, 0xDE25D833, 0xDE26D833, 0xDE27D833, 0xDE28D833,
				0xDE29D833, 0xDE2AD833, 0xDE2BD833, 0xDE2CD833, 0xDE2DD833, 0xDE2ED833, 0xDE2FD833, 0xDE30D833, 0xDE2BD833, 0xDE31D833, 0xDE32D833, 0xDE33D833, 0xDE34D833, 0x259A, 0xDE35D833, 0xDE36D833,
				0xDE37D833, 0xDE38D833, 0xDE39D833, 0xDE3AD833, 0xDE3BD833, 0xDE3CD833, 0xDE3DD833, 0xDE3ED833, 0xDE3FD833, 0xDE40D833, 0xDE41D833, 0xDE42D833, 0xDE43D833, 0xDE44D833, 0xDE45D833, 0xDE46D833,
				0xDE47D833, 0xDE48D833, 0xDE49D833, 0xDE4AD833, 0xDE4BD833, 0xDE4CD833, 0xDE4DD833, 0xDE4ED833, 0xDE4FD833, 0xDE50D833, 0x2598, 0x259D, 0x2596, 0x2597, 0x2580, 0x258C,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return GETOUTPUT0_20[input - 0x20];
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
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			switch (input) {
			case 0x20: return 0x20L;
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
		private long getOutput1(int input) {
			if (input >= 0xDE1A && input <= 0xDE30) return input - 0xDE1A + 0x21;
			if (input >= 0xDE35 && input <= 0xDE50) return input - 0xDE35 + 0x3E;
			switch (input) {
			case 0xDE31: return 0x39L;
			case 0xDE32: return 0x3AL;
			case 0xDE33: return 0x3BL;
			case 0xDE34: return 0x3CL;
			}
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
