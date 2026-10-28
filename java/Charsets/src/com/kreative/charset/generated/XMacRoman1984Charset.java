package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacRoman1984Charset extends Charset {
	public XMacRoman1984Charset() {
		super("x-MacRoman-1984", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacRoman1984CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacRoman1984CharsetEncoder(this);
	}

	private static final class XMacRoman1984CharsetDecoder extends TableCharsetDecoder {
		private XMacRoman1984CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C4\u00C5\u00C7\u00C9\u00D1\u00D6\u00DC\u00E1\u00E0\u00E2\u00E4\u00E3\u00E5\u00E7\u00E9\u00E8\u00EA\u00EB\u00ED\u00EC\u00EE\u00EF\u00F1\u00F3\u00F2\u00F4\u00F6\u00F5\u00FA\u00F9\u00FB\u00FC\u2020\u00B0\u00A2\u00A3\u00A7\u2022\u00B6\u00DF\u00AE\u00A9\u2122\u00B4\u00A8\u2260\u00C6\u00D8\u221E\u00B1\u2264\u2265\u00A5\u00B5\u2202\u2211\u220F\u03C0\u222B\u00AA\u00BA\u03A9\u00E6\u00F8\u00BF\u00A1\u00AC\u221A\u0192\u2248\u2206\u00AB\u00BB\u2026\u00A0\u00C0\u00C3\u00D5\u0152\u0153\u2013\u2014\u201C\u201D\u2018\u2019\u00F7\u25CA\u00FF\uE000".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xD9) return GETOUTPUT0_80[input - 0x80];
			switch (input) {
			case 0xF0: return 0xF8FFL;
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

	private static final class XMacRoman1984CharsetEncoder extends TableCharsetEncoder {
		private XMacRoman1984CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u00CA\u00C1\u00A2\u00A3\u0000\u00B4\u0000\u00A4\u00AC\u00A9\u00BB\u00C7\u00C2\u0000\u00A8\u0000\u00A1\u00B1\u0000\u0000\u00AB\u00B5\u00A6\u0000\u0000\u0000\u00BC\u00C8\u0000\u0000\u0000\u00C0\u00CB\u0000\u0000\u00CC\u0080\u0081\u00AE\u0082\u0000\u0083\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0084\u0000\u0000\u0000\u00CD\u0085\u0000\u00AF\u0000\u0000\u0000\u0086\u0000\u0000\u00A7\u0088\u0087\u0089\u008B\u008A\u008C\u00BE\u008D\u008F\u008E\u0090\u0091\u0093\u0092\u0094\u0095\u0000\u0096\u0098\u0097\u0099\u009B\u009A\u00D6\u00BF\u009D\u009C\u009E\u009F\u0000\u0000\u00D8".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x152: return 0xCEL;
			case 0x153: return 0xCFL;
			case 0x192: return 0xC4L;
			case 0x3A9: return 0xBDL;
			case 0x3C0: return 0xB9L;
			case 0x2013: return 0xD0L;
			case 0x2014: return 0xD1L;
			case 0x2018: return 0xD4L;
			case 0x2019: return 0xD5L;
			case 0x201C: return 0xD2L;
			case 0x201D: return 0xD3L;
			case 0x2020: return 0xA0L;
			case 0x2022: return 0xA5L;
			case 0x2026: return 0xC9L;
			case 0x2122: return 0xAAL;
			case 0x2202: return 0xB6L;
			case 0x2206: return 0xC6L;
			case 0x220F: return 0xB8L;
			case 0x2211: return 0xB7L;
			case 0x221A: return 0xC3L;
			case 0x221E: return 0xB0L;
			case 0x222B: return 0xBAL;
			case 0x2248: return 0xC5L;
			case 0x2260: return 0xADL;
			case 0x2264: return 0xB2L;
			case 0x2265: return 0xB3L;
			case 0x25CA: return 0xD7L;
			case 0xE000: return 0xD9L;
			case 0xF8FF: return 0xF0L;
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
}
