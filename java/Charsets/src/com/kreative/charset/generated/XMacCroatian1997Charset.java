package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacCroatian1997Charset extends Charset {
	public XMacCroatian1997Charset() {
		super("x-MacCroatian-1997", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacCroatian1997CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacCroatian1997CharsetEncoder(this);
	}

	private static final class XMacCroatian1997CharsetDecoder extends TableCharsetDecoder {
		private XMacCroatian1997CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C4\u00C5\u00C7\u00C9\u00D1\u00D6\u00DC\u00E1\u00E0\u00E2\u00E4\u00E3\u00E5\u00E7\u00E9\u00E8\u00EA\u00EB\u00ED\u00EC\u00EE\u00EF\u00F1\u00F3\u00F2\u00F4\u00F6\u00F5\u00FA\u00F9\u00FB\u00FC\u2020\u00B0\u00A2\u00A3\u00A7\u2022\u00B6\u00DF\u00AE\u0160\u2122\u00B4\u00A8\u2260\u017D\u00D8\u221E\u00B1\u2264\u2265\u2206\u00B5\u2202\u2211\u220F\u0161\u222B\u00AA\u00BA\u03A9\u017E\u00F8\u00BF\u00A1\u00AC\u221A\u0192\u2248\u0106\u00AB\u010C\u2026\u00A0\u00C0\u00C3\u00D5\u0152\u0153\u0110\u2014\u201C\u201D\u2018\u2019\u00F7\u25CA\uF8FF\u00A9\u2044\u00A4\u2039\u203A\u00C6\u00BB\u2013\u00B7\u201A\u201E\u2030\u00C2\u0107\u00C1\u010D\u00C8\u00CD\u00CE\u00CF\u00CC\u00D3\u00D4\u0111\u00D2\u00DA\u00DB\u00D9\u0131\u02C6\u02DC\u00AF\u03C0\u00CB\u02DA\u00B8\u00CA\u00E6\u02C7".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFF) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMacCroatian1997CharsetEncoder extends TableCharsetEncoder {
		private XMacCroatian1997CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0x111) return CommonSubtables.COMMON1122[input - 0xA0];
			switch (input) {
			case 0x131: return 0xF5L;
			case 0x152: return 0xCEL;
			case 0x153: return 0xCFL;
			case 0x160: return 0xA9L;
			case 0x161: return 0xB9L;
			case 0x17D: return 0xAEL;
			case 0x17E: return 0xBEL;
			case 0x192: return 0xC4L;
			case 0x2C6: return 0xF6L;
			case 0x2C7: return 0xFF01L;
			case 0x2DA: return 0xFBL;
			case 0x2DC: return 0xF7L;
			case 0x3A9: return 0xBDL;
			case 0x3C0: return 0xF9L;
			case 0x2013: return 0xE0L;
			case 0x2014: return 0xD1L;
			case 0x2018: return 0xD4L;
			case 0x2019: return 0xD5L;
			case 0x201A: return 0xE2L;
			case 0x201C: return 0xD2L;
			case 0x201D: return 0xD3L;
			case 0x201E: return 0xE3L;
			case 0x2020: return 0xA0L;
			case 0x2022: return 0xA5L;
			case 0x2026: return 0xC9L;
			case 0x2030: return 0xE4L;
			case 0x2039: return 0xDCL;
			case 0x203A: return 0xDDL;
			case 0x2044: return 0xDAL;
			case 0x2122: return 0xAAL;
			case 0x2126: return 0xBDL;
			case 0x2202: return 0xB6L;
			case 0x2206: return 0xB4L;
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
			case 0xF8FF: return 0xD8L;
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
