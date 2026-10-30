package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKkSuperromanFullCharset extends Charset {
	public XKkSuperromanFullCharset() {
		super("x-kk-superroman-full", new String[]{"x-kk-superroman"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKkSuperromanFullCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKkSuperromanFullCharsetEncoder(this);
	}

	private static final class XKkSuperromanFullCharsetDecoder extends TableCharsetDecoder {
		private XKkSuperromanFullCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u00B9\u00B2\u00B3\u00BC\u00BD\u00BE\u00D7\b\t\n\u000B\f\r\u02CB\u00AD\u2318\u0141\u0160\u00DD\u017D\u0142\u0161\u00FD\u017E\u00A4\u00A6\u001B\u00D0\u00F0\u00DE\u00FE".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x80 && input <= 0xFF) return CommonSubtables.COMMON1195[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKkSuperromanFullCharsetEncoder extends TableCharsetEncoder {
		private XKkSuperromanFullCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u00CA\u00C1\u00A2\u00A3\u0019\u00B4\u001A\u00A4\u00AC\u00A9\u00BB\u00C7\u00C2\u000F\u00A8\u00F8\u00A1\u00B1\u0201\u0301\u00AB\u00B5\u00A6\u00E1\u00FC\u0101\u00BC\u00C8\u0401\u0501\u0601\u00C0\u00CB\u00E7\u00E5\u00CC\u0080\u0081\u00AE\u0082\u00E9\u0083\u00E6\u00E8\u00ED\u00EA\u00EB\u00EC\u001C\u0084\u00F1\u00EE\u00EF\u00CD\u0085\u0701\u00AF\u00F4\u00F2\u00F3\u0086\u0013\u001E\u00A7\u0088\u0087\u0089\u008B\u008A\u008C\u00BE\u008D\u008F\u008E\u0090\u0091\u0093\u0092\u0094\u0095\u001D\u0096\u0098\u0097\u0099\u009B\u009A\u00D6\u00BF\u009D\u009C\u009E\u009F\u0017\u001F\u00D8".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x2013 && input <= 0x2044) return CommonSubtables.COMMON1194[input - 0x2013];
			switch (input) {
			case 0x0: return 0x1L;
			case 0x8: return 0x8L;
			case 0x9: return 0x9L;
			case 0xA: return 0xAL;
			case 0xB: return 0xBL;
			case 0xC: return 0xCL;
			case 0xD: return 0xDL;
			case 0x1B: return 0x1BL;
			case 0x131: return 0xF5L;
			case 0x141: return 0x11L;
			case 0x142: return 0x15L;
			case 0x152: return 0xCEL;
			case 0x153: return 0xCFL;
			case 0x160: return 0x12L;
			case 0x161: return 0x16L;
			case 0x178: return 0xD9L;
			case 0x17D: return 0x14L;
			case 0x17E: return 0x18L;
			case 0x192: return 0xC4L;
			case 0x2C6: return 0xF6L;
			case 0x2C7: return 0xFF01L;
			case 0x2CB: return 0xEL;
			case 0x2D8: return 0xF9L;
			case 0x2D9: return 0xFAL;
			case 0x2DA: return 0xFBL;
			case 0x2DB: return 0xFEL;
			case 0x2DC: return 0xF7L;
			case 0x2DD: return 0xFDL;
			case 0x3A9: return 0xBDL;
			case 0x3C0: return 0xB9L;
			case 0x20AC: return 0xDBL;
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
			case 0x2318: return 0x10L;
			case 0x25CA: return 0xD7L;
			case 0xF8FF: return 0xF0L;
			case 0xFB01: return 0xDEL;
			case 0xFB02: return 0xDFL;
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
