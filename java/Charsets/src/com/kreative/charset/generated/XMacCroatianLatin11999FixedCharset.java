package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacCroatianLatin11999FixedCharset extends Charset {
	public XMacCroatianLatin11999FixedCharset() {
		super("x-MacCroatianLatin1-1999-fixed", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacCroatianLatin11999FixedCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacCroatianLatin11999FixedCharsetEncoder(this);
	}

	private static final class XMacCroatianLatin11999FixedCharsetDecoder extends TableCharsetDecoder {
		private XMacCroatianLatin11999FixedCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u2022\u2122\u2260\u221E\u2265\u2211\u222B\u03A9\u221A\u2248\u2026\u2014\u2018\u00A9\u2044\u2202\u0106\u0152\u201A\u201E\u2030\u0111\u02C6\u02DC\u03C0\u00CB\u02DA\u00CA\u00E6\u02C7\u0131\u0192\u00A0\u00A1\u00A2\u00A3\u20AC\u2206\u0153\u00A7\u00A8\u0160\u00AA\u00AB\u00AC\u0110\u00AE\u00AF\u00B0\u00B1\u201D\u201C\u00B4\u00B5\u00B6\u00B7\u00B8\u2019\u00BA\u010C\u0161\u220F\u2264\u00BF\u00C0\u00C1\u00C2\u00C3\u00C4\u00C5\u017D\u00C7\u00C8\u00C9\u0107\u010D\u00CC\u00CD\u00CE\u00CF\u2039\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u25CA\u00D8\u00D9\u00DA\u00DB\u00DC\u2020\u00C6\u00DF\u00E0\u00E1\u00E2\u00E3\u00E4\u00E5\u017E\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u203A\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC\u2013\u00BB\uF8FF".toCharArray();
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

	private static final class XMacCroatianLatin11999FixedCharsetEncoder extends TableCharsetEncoder {
		private XMacCroatianLatin11999FixedCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u00A0\u00A1\u00A2\u00A3\u0000\u0000\u0000\u00A7\u00A8\u008D\u00AA\u00AB\u00AC\u0000\u00AE\u00AF\u00B0\u00B1\u0000\u0000\u00B4\u00B5\u00B6\u00B7\u00B8\u0000\u00BA\u00FE\u0000\u0000\u0000\u00BF\u00C0\u00C1\u00C2\u00C3\u00C4\u00C5\u00DE\u00C7\u00C8\u00C9\u009B\u0099\u00CC\u00CD\u00CE\u00CF\u0000\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u0000\u00D8\u00D9\u00DA\u00DB\u00DC\u0000\u0000\u00DF\u00E0\u00E1\u00E2\u00E3\u00E4\u00E5\u009C\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u0000\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0090\u00CA\u0000\u0000\u0000\u0000\u00BB\u00CB\u0000\u0000\u00AD\u0095".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0x111) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x131: return 0x9EL;
			case 0x152: return 0x91L;
			case 0x153: return 0xA6L;
			case 0x160: return 0xA9L;
			case 0x161: return 0xBCL;
			case 0x17D: return 0xC6L;
			case 0x17E: return 0xE6L;
			case 0x192: return 0x9FL;
			case 0x2C6: return 0x96L;
			case 0x2C7: return 0x9DL;
			case 0x2DA: return 0x9AL;
			case 0x2DC: return 0x97L;
			case 0x3A9: return 0x87L;
			case 0x3C0: return 0x98L;
			case 0x2013: return 0xFDL;
			case 0x2014: return 0x8BL;
			case 0x2018: return 0x8CL;
			case 0x2019: return 0xB9L;
			case 0x201A: return 0x92L;
			case 0x201C: return 0xB3L;
			case 0x201D: return 0xB2L;
			case 0x201E: return 0x93L;
			case 0x2020: return 0xDDL;
			case 0x2022: return 0x80L;
			case 0x2026: return 0x8AL;
			case 0x2030: return 0x94L;
			case 0x2039: return 0xD0L;
			case 0x203A: return 0xF0L;
			case 0x2044: return 0x8EL;
			case 0x20AC: return 0xA4L;
			case 0x2122: return 0x81L;
			case 0x2126: return 0x87L;
			case 0x2202: return 0x8FL;
			case 0x2206: return 0xA5L;
			case 0x220F: return 0xBDL;
			case 0x2211: return 0x85L;
			case 0x221A: return 0x88L;
			case 0x221E: return 0x83L;
			case 0x222B: return 0x86L;
			case 0x2248: return 0x89L;
			case 0x2260: return 0x82L;
			case 0x2264: return 0xBEL;
			case 0x2265: return 0x84L;
			case 0x25CA: return 0xD7L;
			case 0xF8FF: return 0xFF01L;
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
