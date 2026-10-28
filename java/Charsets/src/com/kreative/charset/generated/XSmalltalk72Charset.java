package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSmalltalk72Charset extends Charset {
	public XSmalltalk72Charset() {
		super("x-smalltalk72", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSmalltalk72CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSmalltalk72CharsetEncoder(this);
	}

	private static final class XSmalltalk72CharsetDecoder extends TableCharsetDecoder {
		private XSmalltalk72CharsetDecoder(Charset cs) {
			super(cs, 1.05185f, 3f, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x26: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final long[] GETOUTPUT0_0 = getOutput0_0();
		private static final long[] getOutput0_0() {
			return new long[] {
				0xFFFEL, 0x2264L, 0xDEB3D833L, 0x2982L, 0x4L, 0x22A1L, 0x40L, 0x2219L, 0x8L, 0x9L, 0xAL, 0xDEB1D833L, 0xCL, 0xDL, 0x2260L, 0x22L,
				0x28200D2192L, 0x21L, 0x2218L, 0x73200D2019L, 0xDEB2D833L, 0x207BL, 0x25L, 0x2228L, 0x2227L, 0x27BDL, 0x2265L, 0x24L, 0x26L, 0xA7L, 0xFE0E2757L, 0x25A0L,
				0x20L, 0x21D1L, 0x261EL, 0x23L, 0x29200D0028L, 0x23FFL, 0xDC16DBBFL,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x27 && input <= 0x3E) return input - 0x27 + 0x27;
			if (input >= 0x0 && input <= 0x26) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x41 && input <= 0x5D) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7B) return input - 0x61 + 0x61;
			switch (input) {
			case 0x3F: return 0x21D2L;
			case 0x40: return 0x263AL;
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x2190L;
			case 0x7C: return 0x2019L;
			case 0x7D: return 0x7DL;
			case 0x7E: return 0x3FL;
			case 0x7F: return 0x2301L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x7: return 0x2299L;
			case 0x12: return 0x229AL;
			case 0x2A: return 0x229BL;
			case 0x2B: return 0x2295L;
			case 0x2D: return 0x2296L;
			case 0x2F: return 0x2298L;
			case 0x3D: return 0x229CL;
			case 0x63: return 0xA9L;
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

	private static final class XSmalltalk72CharsetEncoder extends TableCharsetEncoder {
		private XSmalltalk72CharsetEncoder(Charset cs) {
			super(cs, 1.00993f, 2f, new byte[]{126}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x28: return 0x1;
			case 0x2A: return 0x3;
			case 0x2B: return 0x4;
			case 0x2D: return 0x5;
			case 0x2F: return 0x6;
			case 0x3D: return 0x7;
			case 0x63: return 0x8;
			case 0x2019: return 0x9;
			case 0x2192: return 0xB;
			case 0x2218: return 0xD;
			case 0x2219: return 0xE;
			case 0x22C5: return 0xF;
			case 0x2757: return 0x10;
			case 0xD833: return 0x11;
			case 0xDBBF: return 0x12;
			}
			return 0;
		}
		private int getNextState1(int input) {
			switch (input) {
			case 0x200D: return 0x2;
			}
			return 0;
		}
		private int getNextState9(int input) {
			switch (input) {
			case 0x200D: return 0xA;
			}
			return 0;
		}
		private int getNextState11(int input) {
			switch (input) {
			case 0x200D: return 0xC;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 1: return getNextState1(input);
			case 9: return getNextState9(input);
			case 11: return getNextState11(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x27 && input <= 0x3E) return input - 0x27 + 0x27;
			if (input >= 0x41 && input <= 0x5D) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7B) return input - 0x61 + 0x61;
			switch (input) {
			case 0x0: return 0x1L;
			case 0x4: return 0x401L;
			case 0x8: return 0x8L;
			case 0x9: return 0x9L;
			case 0xA: return 0xAL;
			case 0xC: return 0xCL;
			case 0xD: return 0xDL;
			case 0x20: return 0x20L;
			case 0x21: return 0x11L;
			case 0x22: return 0xFL;
			case 0x23: return 0x23L;
			case 0x24: return 0x1BL;
			case 0x25: return 0x16L;
			case 0x26: return 0x1CL;
			case 0x3F: return 0x7EL;
			case 0x40: return 0x601L;
			case 0x7D: return 0x7DL;
			case 0xA7: return 0x1DL;
			case 0xA9: return 0x6326L;
			case 0x2019: return 0x7CL;
			case 0x207B: return 0x15L;
			case 0x2190: return 0x5FL;
			case 0x2191: return 0x5EL;
			case 0x21D1: return 0x21L;
			case 0x21D2: return 0x3FL;
			case 0x2218: return 0x12L;
			case 0x2219: return 0x701L;
			case 0x2227: return 0x18L;
			case 0x2228: return 0x17L;
			case 0x2260: return 0xEL;
			case 0x2264: return 0x101L;
			case 0x2265: return 0x1AL;
			case 0x2295: return 0x2B26L;
			case 0x2296: return 0x2D26L;
			case 0x2298: return 0x2F26L;
			case 0x2299: return 0x726L;
			case 0x229A: return 0x1226L;
			case 0x229B: return 0x2A26L;
			case 0x229C: return 0x3D26L;
			case 0x22A1: return 0x501L;
			case 0x22C5: return 0x701L;
			case 0x2301: return 0x7FL;
			case 0x23FF: return 0x25L;
			case 0x25A0: return 0x1FL;
			case 0x25EF: return 0x26L;
			case 0x261E: return 0x22L;
			case 0x263A: return 0x40L;
			case 0x2757: return 0x1EL;
			case 0x27BD: return 0x19L;
			case 0x2982: return 0x301L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x29: return 0x24L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0x20DD: return 0x2A26L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x20DD: return 0x2B26L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0x20DD: return 0x2D26L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0x20DD: return 0x2F26L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0x20DD: return 0x3D26L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0x20DD: return 0x6326L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0x73: return 0x13L;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0x28: return 0x10L;
			}
			return 0;
		}
		private long getOutput13(int input) {
			switch (input) {
			case 0x20DD: return 0x1226L;
			}
			return 0;
		}
		private long getOutput14(int input) {
			switch (input) {
			case 0x20DD: return 0x726L;
			}
			return 0;
		}
		private long getOutput15(int input) {
			switch (input) {
			case 0x20DD: return 0x726L;
			}
			return 0;
		}
		private long getOutput16(int input) {
			switch (input) {
			case 0xFE0E: return 0x1EL;
			case 0xFE0F: return 0x1EL;
			}
			return 0;
		}
		private long getOutput17(int input) {
			switch (input) {
			case 0xDEB1: return 0xBL;
			case 0xDEB2: return 0x14L;
			case 0xDEB3: return 0x201L;
			}
			return 0;
		}
		private long getOutput18(int input) {
			switch (input) {
			case 0xDC10: return 0x10L;
			case 0xDC13: return 0x13L;
			case 0xDC14: return 0x24L;
			case 0xDC16: return 0x26L;
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
			case 10: return getOutput10(input);
			case 12: return getOutput12(input);
			case 13: return getOutput13(input);
			case 14: return getOutput14(input);
			case 15: return getOutput15(input);
			case 16: return getOutput16(input);
			case 17: return getOutput17(input);
			case 18: return getOutput18(input);
			default: return 0;
			}
		}
	}
}
