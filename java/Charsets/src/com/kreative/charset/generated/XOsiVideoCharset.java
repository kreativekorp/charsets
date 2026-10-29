package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XOsiVideoCharset extends Charset {
	public XOsiVideoCharset() {
		super("x-osi-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XOsiVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XOsiVideoCharsetEncoder(this);
	}

	private static final class XOsiVideoCharsetDecoder extends TableCharsetDecoder {
		private XOsiVideoCharsetDecoder(Charset cs) {
			super(cs, 1.28906f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_0 = getOutput0_0();
		private static final long[] getOutput0_0() {
			return new long[] {
				0xDC9CD833L, 0xDC9DD833L, 0xDE00D833L, 0xDE01D833L, 0xDE02D833L, 0xDE03D833L, 0xDF91D83DL, 0xDE04D833L, 0xDE05D833L, 0x29CBL, 0xAL, 0x5EL, 0x2261L, 0xDEBCD833L, 0xFE0EDFE0D83CL, 0xDFD8D83CL,
				0x21A5L, 0xDCB9D83EL, 0x21A6L, 0xDCBAD83EL, 0x21A7L, 0xDCBBD83EL, 0x21A4L, 0xDCB8D83EL, 0xA3L, 0x223CL, 0xDE06D833L, 0x25AFL, 0xDE07D833L, 0xDE09D833L, 0xDE08D833L, 0xDE0AD833L,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x61 && input <= 0x7B) return input - 0x61 + 0x61;
			if (input >= 0x7C && input <= 0xFF) return CommonSubtables.COMMON1703[input - 0x7C];
			switch (input) {
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x5FL;
			case 0x60: return 0xA0L;
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

	private static final class XOsiVideoCharsetEncoder extends TableCharsetEncoder {
		private XOsiVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			case 0xD83C: return 0x2;
			case 0xD83D: return 0x4;
			case 0xD83E: return 0x5;
			}
			return 0;
		}
		private int getNextState2(int input) {
			switch (input) {
			case 0xDFE0: return 0x3;
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
		private static final char[] GETOUTPUT0_256D = getOutput0_256D();
		private static final char[] getOutput0_256D() {
			return "\u00DD\u00DE\u00DF\u00DC\u00BD\u00BE\u00BC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009B\u0080\u0090\u0096\u009A\u009E\u009F\u00A0\u00A1\u0000\u0000\u0000\u009C\u0098\u0092\u0088\u009D\u0000\u00BB\u0000\u0087\u008F\u00A7\u00A5\u00A8\u0000\u00A9\u0000\u0000\u00A6\u00AA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u001B\u0000\u0000\u0000\u0000\u0000\u0000\u00EB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00EA".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7B) return input - 0x61 + 0x61;
			if (input >= 0x256D && input <= 0x25C0) return GETOUTPUT0_256D[input - 0x256D];
			switch (input) {
			case 0xA: return 0xAL;
			case 0x5E: return 0xBL;
			case 0x5F: return 0x5FL;
			case 0x7C: return 0x7DL;
			case 0x7D: return 0x7CL;
			case 0x7E: return 0x7FL;
			case 0xA0: return 0x60L;
			case 0xA3: return 0x18L;
			case 0xB7: return 0xD5L;
			case 0xF7: return 0x7EL;
			case 0x3A3: return 0xF9L;
			case 0x3A9: return 0xF6L;
			case 0x3B1: return 0xF1L;
			case 0x3B2: return 0xF2L;
			case 0x3B3: return 0xFF01L;
			case 0x3B4: return 0xF4L;
			case 0x3B5: return 0xFDL;
			case 0x3B8: return 0xFCL;
			case 0x3BB: return 0xFAL;
			case 0x3BC: return 0xF7L;
			case 0x3BD: return 0xFEL;
			case 0x3C0: return 0xF8L;
			case 0x3C6: return 0xFBL;
			case 0x3C8: return 0xF5L;
			case 0x3C9: return 0xF3L;
			case 0x2191: return 0x5EL;
			case 0x21A4: return 0x16L;
			case 0x21A5: return 0x10L;
			case 0x21A6: return 0x12L;
			case 0x21A7: return 0x14L;
			case 0x21D0: return 0xB4L;
			case 0x21D2: return 0xB3L;
			case 0x21D4: return 0xB5L;
			case 0x2206: return 0xB6L;
			case 0x221A: return 0xD3L;
			case 0x222B: return 0xD4L;
			case 0x223C: return 0x19L;
			case 0x2248: return 0xD6L;
			case 0x2261: return 0xCL;
			case 0x2501: return 0x94L;
			case 0x2503: return 0x95L;
			case 0x250C: return 0xCCL;
			case 0x2510: return 0xCDL;
			case 0x2514: return 0xCBL;
			case 0x2518: return 0xCEL;
			case 0x2523: return 0xD8L;
			case 0x252B: return 0xDAL;
			case 0x2533: return 0xD9L;
			case 0x253B: return 0xD7L;
			case 0x254B: return 0xDBL;
			case 0x25E2: return 0xB0L;
			case 0x25E3: return 0xB2L;
			case 0x25E4: return 0xAFL;
			case 0x25E5: return 0xB1L;
			case 0x25EF: return 0xE2L;
			case 0x2660: return 0xE7L;
			case 0x2663: return 0xE6L;
			case 0x2665: return 0xE5L;
			case 0x2666: return 0xE8L;
			case 0x2708: return 0xEDL;
			case 0x29CB: return 0x9L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DDF8 = getOutput1_DDF8();
		private static final char[] getOutput1_DDF8() {
			return "\u00EE\u00EF\u00F0\u0000\u0000\u0000\u0000\u0000\u0201\u0301\u0401\u0501\u0701\b\u001A\u001C\u001E\u001D\u001F\u00E3\u00E4".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xDDF8 && input <= 0xDE0C) return GETOUTPUT1_DDF8[input - 0xDDF8];
			switch (input) {
			case 0xDC8B: return 0xE9L;
			case 0xDC9C: return 0x1L;
			case 0xDC9D: return 0x101L;
			case 0xDEBC: return 0xDL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDF33: return 0xDL;
			case 0xDFD8: return 0xFL;
			case 0xDFE0: return 0xEL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xFE0E: return 0xEL;
			case 0xFE0F: return 0xEL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xDEE7: return 0xECL;
			case 0xDF91: return 0x601L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0xDF70 && input <= 0xDF8F) return CommonSubtables.COMMON1704[input - 0xDF70];
			if (input >= 0xDFD0 && input <= 0xDFE7) return CommonSubtables.COMMON1705[input - 0xDFD0];
			switch (input) {
			case 0xDCB8: return 0x17L;
			case 0xDCB9: return 0x11L;
			case 0xDCBA: return 0x13L;
			case 0xDCBB: return 0x15L;
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
