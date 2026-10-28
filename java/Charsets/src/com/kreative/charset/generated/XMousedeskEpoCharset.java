package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMousedeskEpoCharset extends Charset {
	public XMousedeskEpoCharset() {
		super("x-mousedesk-epo", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMousedeskEpoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMousedeskEpoCharsetEncoder(this);
	}

	private static final class XMousedeskEpoCharsetDecoder extends TableCharsetDecoder {
		private XMousedeskEpoCharsetDecoder(Charset cs) {
			super(cs, 1.11719f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_40 = getOutput0_40();
		private static final char[] getOutput0_40() {
			return "\u011C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0108RSTUV\u016C\u015C\u0134Z[\u0124]^_\u011D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0109rstuv\u016D\u015D\u0135z{\u0125}~\u007F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.COMMON1681[input - 0x0];
			if (input >= 0x41 && input <= 0x50) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x70) return input - 0x61 + 0x61;
			if (input >= 0x40 && input <= 0x7F) return GETOUTPUT0_40[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMousedeskEpoCharsetEncoder extends TableCharsetEncoder {
		private XMousedeskEpoCharsetEncoder(Charset cs) {
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
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x50) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x70) return input - 0x61 + 0x61;
			switch (input) {
			case 0x0: return 0x1L;
			case 0x52: return 0x52L;
			case 0x53: return 0x53L;
			case 0x54: return 0x54L;
			case 0x55: return 0x55L;
			case 0x56: return 0x56L;
			case 0x5A: return 0x5AL;
			case 0x5B: return 0x5BL;
			case 0x5D: return 0x5DL;
			case 0x5E: return 0x5EL;
			case 0x5F: return 0x5FL;
			case 0x72: return 0x72L;
			case 0x73: return 0x73L;
			case 0x74: return 0x74L;
			case 0x75: return 0x75L;
			case 0x76: return 0x76L;
			case 0x7A: return 0x7AL;
			case 0x7B: return 0x7BL;
			case 0x7D: return 0x7DL;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x7FL;
			case 0xA3: return 0x12L;
			case 0xA9: return 0xEL;
			case 0xAE: return 0xFL;
			case 0xB0: return 0x16L;
			case 0xF7: return 0x14L;
			case 0x108: return 0x51L;
			case 0x109: return 0x71L;
			case 0x11C: return 0x40L;
			case 0x11D: return 0x60L;
			case 0x124: return 0x5CL;
			case 0x125: return 0x7CL;
			case 0x134: return 0x59L;
			case 0x135: return 0x79L;
			case 0x15C: return 0x58L;
			case 0x15D: return 0x78L;
			case 0x16C: return 0x57L;
			case 0x16D: return 0x77L;
			case 0x3C0: return 0x13L;
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
			case 0xDC28: return 0x10L;
			case 0xDC29: return 0x11L;
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
