package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XOsiCharset extends Charset {
	public XOsiCharset() {
		super("x-osi", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XOsiCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XOsiCharsetEncoder(this);
	}

	private static final class XOsiCharsetDecoder extends TableCharsetDecoder {
		private XOsiCharsetDecoder(Charset cs) {
			super(cs, 1.20312f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7B) return input - 0x61 + 0x61;
			if (input >= 0x7C && input <= 0xFF) return CommonSubtables.COMMON1695[input - 0x7C];
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

	private static final class XOsiCharsetEncoder extends TableCharsetEncoder {
		private XOsiCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			case 0xD83D: return 0x2;
			case 0xD83E: return 0x3;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_256D = getOutput0_256D();
		private static final char[] getOutput0_256D() {
			return "\u00DD\u00DE\u00DF\u00DC\u00BD\u00BE\u00BC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009B\u0080\u0090\u0096\u009A\u009E\u009F\u00A0\u00A1\u0000\u0000\u0000\u009C\u0098\u0092\u0088\u009D\u0000\u00BB\u0000\u0087\u008F\u00A7\u00A5\u00A8\u0000\u00A9\u0000\u0000\u00A6\u00AA".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7B) return input - 0x61 + 0x61;
			if (input >= 0x256D && input <= 0x259E) return GETOUTPUT0_256D[input - 0x256D];
			switch (input) {
			case 0x5F: return 0x5FL;
			case 0x7C: return 0x7DL;
			case 0x7D: return 0x7CL;
			case 0x7E: return 0x7FL;
			case 0xA0: return 0x60L;
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
			case 0x21D0: return 0xB4L;
			case 0x21D2: return 0xB3L;
			case 0x21D4: return 0xB5L;
			case 0x2206: return 0xB6L;
			case 0x221A: return 0xD3L;
			case 0x222B: return 0xD4L;
			case 0x2248: return 0xD6L;
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
			case 0x25B6: return 0xEBL;
			case 0x25C0: return 0xEAL;
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
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDC8B: return 0xE9L;
			case 0xDDF8: return 0xEEL;
			case 0xDDF9: return 0xEFL;
			case 0xDDFA: return 0xF0L;
			case 0xDE0B: return 0xE3L;
			case 0xDE0C: return 0xE4L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDEE7: return 0xECL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0xDF70 && input <= 0xDF8F) return CommonSubtables.COMMON1696[input - 0xDF70];
			if (input >= 0xDFD0 && input <= 0xDFE7) return CommonSubtables.COMMON1697[input - 0xDFD0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 3: return getOutput3(input);
			default: return 0;
			}
		}
	}
}
