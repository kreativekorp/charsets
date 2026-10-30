package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacThai1998Charset extends Charset {
	public XMacThai1998Charset() {
		super("x-MacThai-1998", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacThai1998CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacThai1998CharsetEncoder(this);
	}

	private static final class XMacThai1998CharsetDecoder extends TableCharsetDecoder {
		private XMacThai1998CharsetDecoder(Charset cs) {
			super(cs, 1.088f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xDA) return input - 0xA1 + 0xE01;
			if (input >= 0x80 && input <= 0xA0) return CommonSubtables.COMMON1207[input - 0x80];
			if (input >= 0xDB && input <= 0xFB) return CommonSubtables.COMMON1204[input - 0xDB];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMacThai1998CharsetEncoder extends TableCharsetEncoder {
		private XMacThai1998CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xE31: return 0x1;
			case 0xE34: return 0x2;
			case 0xE35: return 0x3;
			case 0xE36: return 0x4;
			case 0xE37: return 0x5;
			case 0xE47: return 0x6;
			case 0xE48: return 0x7;
			case 0xE49: return 0x8;
			case 0xE4A: return 0x9;
			case 0xE4B: return 0xA;
			case 0xE4C: return 0xB;
			case 0xE4D: return 0xC;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xE01 && input <= 0xE3A) return input - 0xE01 + 0xA1;
			if (input >= 0xE3F && input <= 0xE59) return CommonSubtables.COMMON1205[input - 0xE3F];
			if (input >= 0xF884 && input <= 0xF899) return CommonSubtables.COMMON1206[input - 0xF884];
			switch (input) {
			case 0xA0: return 0xA0L;
			case 0xA9: return 0xFBL;
			case 0xAB: return 0x80L;
			case 0xAE: return 0xFAL;
			case 0xBB: return 0x81L;
			case 0x200B: return 0xDCL;
			case 0x2013: return 0xDDL;
			case 0x2014: return 0xDEL;
			case 0x2018: return 0x9DL;
			case 0x2019: return 0x9EL;
			case 0x201C: return 0x8DL;
			case 0x201D: return 0x8EL;
			case 0x2022: return 0x91L;
			case 0x2026: return 0x82L;
			case 0x2060: return 0xDBL;
			case 0x2122: return 0xEEL;
			case 0xFEFF: return 0xDBL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xF874: return 0x92L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xF874: return 0x94L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xF874: return 0x95L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xF874: return 0x96L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xF874: return 0x97L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0xF874: return 0x93L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0xF873: return 0x88L;
			case 0xF874: return 0x98L;
			case 0xF875: return 0x83L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0xF873: return 0x89L;
			case 0xF874: return 0x99L;
			case 0xF875: return 0x84L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0xF873: return 0x8AL;
			case 0xF874: return 0x9AL;
			case 0xF875: return 0x85L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0xF873: return 0x8BL;
			case 0xF874: return 0x9BL;
			case 0xF875: return 0x86L;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0xF873: return 0x8CL;
			case 0xF874: return 0x9CL;
			case 0xF875: return 0x87L;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0xF874: return 0x8FL;
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
			case 6: return getOutput6(input);
			case 7: return getOutput7(input);
			case 8: return getOutput8(input);
			case 9: return getOutput9(input);
			case 10: return getOutput10(input);
			case 11: return getOutput11(input);
			case 12: return getOutput12(input);
			default: return 0;
			}
		}
	}
}
