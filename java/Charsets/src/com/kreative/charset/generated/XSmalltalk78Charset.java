package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSmalltalk78Charset extends Charset {
	public XSmalltalk78Charset() {
		super("x-smalltalk78", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSmalltalk78CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSmalltalk78CharsetEncoder(this);
	}

	private static final class XSmalltalk78CharsetDecoder extends TableCharsetDecoder {
		private XSmalltalk78CharsetDecoder(Charset cs) {
			super(cs, 1.05512f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_0 = getOutput0_0();
		private static final long[] getOutput0_0() {
			return new long[] {
				0xFFFEL, 0x2264L, 0x2L, 0x2982L, 0x4L, 0x2301L, 0x2261L, 0x2218L, 0x8L, 0x9L, 0xAL, 0xBL, 0xCL, 0xDL, 0x2260L, 0xDCB2D83EL,
				0x10L, 0x21D1L, 0x2265L, 0x73200D2019L, 0xDF7CD83EL, 0x207BL, 0x23FFL, 0x2299L, 0xDEB0D833L, 0xDCB6D83EL, 0x1AL, 0x21D2L, 0x1CL, 0x25A1L, 0xDF7FD83EL,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x1F && input <= 0x5D) return input - 0x1F + 0x1F;
			if (input >= 0x0 && input <= 0x1E) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x61 && input <= 0x7F) return input - 0x61 + 0x61;
			switch (input) {
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x2190L;
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

	private static final class XSmalltalk78CharsetEncoder extends TableCharsetEncoder {
		private XSmalltalk78CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x2019: return 0x1;
			case 0xD833: return 0x3;
			case 0xD83E: return 0x4;
			case 0xDBBF: return 0x5;
			}
			return 0;
		}
		private int getNextState1(int input) {
			switch (input) {
			case 0x200D: return 0x2;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 1: return getNextState1(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x1F && input <= 0x5D) return input - 0x1F + 0x1F;
			if (input >= 0x61 && input <= 0x7F) return input - 0x61 + 0x61;
			switch (input) {
			case 0x0: return 0x1L;
			case 0x2: return 0x201L;
			case 0x4: return 0x401L;
			case 0x8: return 0x8L;
			case 0x9: return 0x9L;
			case 0xA: return 0xAL;
			case 0xB: return 0xBL;
			case 0xC: return 0xCL;
			case 0xD: return 0xDL;
			case 0x10: return 0x10L;
			case 0x1A: return 0x1AL;
			case 0x1C: return 0x1CL;
			case 0x207B: return 0x15L;
			case 0x2190: return 0x5FL;
			case 0x2191: return 0x5EL;
			case 0x21D1: return 0x11L;
			case 0x21D2: return 0x1BL;
			case 0x2218: return 0x701L;
			case 0x2260: return 0xEL;
			case 0x2261: return 0x601L;
			case 0x2264: return 0x101L;
			case 0x2265: return 0x12L;
			case 0x2299: return 0x17L;
			case 0x2301: return 0x501L;
			case 0x23FF: return 0x16L;
			case 0x25A1: return 0x1DL;
			case 0x2982: return 0x301L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x73: return 0x13L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xDEB0: return 0x18L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xDCB2: return 0xFL;
			case 0xDCB6: return 0x19L;
			case 0xDF7C: return 0x14L;
			case 0xDF7F: return 0x1EL;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xDC13: return 0x13L;
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
			default: return 0;
			}
		}
	}
}
