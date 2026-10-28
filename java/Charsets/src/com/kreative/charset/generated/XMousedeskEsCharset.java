package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMousedeskEsCharset extends Charset {
	public XMousedeskEsCharset() {
		super("x-mousedesk-es", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMousedeskEsCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMousedeskEsCharsetEncoder(this);
	}

	private static final class XMousedeskEsCharsetDecoder extends TableCharsetDecoder {
		private XMousedeskEsCharsetDecoder(Charset cs) {
			super(cs, 1.10156f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_0 = getOutput0_0();
		private static final long[] getOutput0_0() {
			return new long[] {
				0xFFFEL, 0xDFB9D83EL, 0xDFBAD83EL, 0xDC3CDBBFL, 0xDC3DDBBFL, 0xDC3EDBBFL, 0xDC3FDBBFL, 0xFE0EDD12D83DL, 0x2190L, 0xDC3ADBBFL, 0x2193L, 0x2191L, 0xDC3BDBBFL, 0x21B2L, 0xA9L, 0xAEL,
				0xE1L, 0xE9L, 0xEDL, 0xF3L, 0xFAL, 0x2192L, 0xB0L, 0x25C7L, 0xDFBBD83EL, 0x2592L, 0xDF90D83EL, 0x25C6L, 0xDFB1D83EL, 0x2713L, 0xF813L, 0xF812L,
				0x20L, 0x21L, 0x22L, 0xA3L,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x24 && input <= 0x3F) return input - 0x24 + 0x24;
			if (input >= 0x0 && input <= 0x23) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0x5E;
			switch (input) {
			case 0x40: return 0xA7L;
			case 0x5B: return 0xA1L;
			case 0x5C: return 0xD1L;
			case 0x5D: return 0xBFL;
			case 0x7B: return 0xB0L;
			case 0x7C: return 0xF1L;
			case 0x7D: return 0xE7L;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x7FL;
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

	private static final class XMousedeskEsCharsetEncoder extends TableCharsetEncoder {
		private XMousedeskEsCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83D: return 0x2;
			case 0xD83E: return 0x4;
			case 0xDBBF: return 0x5;
			case 0xF8FF: return 0x1;
			}
			return 0;
		}
		private int getNextState2(int input) {
			switch (input) {
			case 0xDD12: return 0x3;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 2: return getNextState2(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x24 && input <= 0x3F) return input - 0x24 + 0x24;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0x5E;
			switch (input) {
			case 0x0: return 0x1L;
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x7FL;
			case 0xA1: return 0x5BL;
			case 0xA3: return 0x23L;
			case 0xA7: return 0x40L;
			case 0xA9: return 0xEL;
			case 0xAE: return 0xFL;
			case 0xB0: return 0x7BL;
			case 0xBF: return 0x5DL;
			case 0xD1: return 0x5CL;
			case 0xE1: return 0x10L;
			case 0xE7: return 0x7DL;
			case 0xE9: return 0x11L;
			case 0xED: return 0x12L;
			case 0xF1: return 0x7CL;
			case 0xF3: return 0x13L;
			case 0xFA: return 0x14L;
			case 0x2190: return 0x8L;
			case 0x2191: return 0xBL;
			case 0x2192: return 0x15L;
			case 0x2193: return 0xAL;
			case 0x21B2: return 0xDL;
			case 0x2592: return 0x19L;
			case 0x25C6: return 0x1BL;
			case 0x25C7: return 0x17L;
			case 0x2713: return 0x1DL;
			case 0xF812: return 0x1FL;
			case 0xF813: return 0x1EL;
			case 0xF8FF: return 0x1EL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xF87F: return 0x1FL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDD12: return 0x701L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xFE0E: return 0x701L;
			case 0xFE0F: return 0x701L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xDF90: return 0x1AL;
			case 0xDFB1: return 0x1CL;
			case 0xDFB9: return 0x101L;
			case 0xDFBA: return 0x201L;
			case 0xDFBB: return 0x18L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xDC3A: return 0x9L;
			case 0xDC3B: return 0xCL;
			case 0xDC3C: return 0x301L;
			case 0xDC3D: return 0x401L;
			case 0xDC3E: return 0x501L;
			case 0xDC3F: return 0x601L;
			case 0xDC82: return 0x19L;
			case 0xDC83: return 0x1AL;
			case 0xDCE2: return 0x1FL;
			case 0xDCE3: return 0x1EL;
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
			default: return 0;
			}
		}
	}
}
