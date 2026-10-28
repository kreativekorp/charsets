package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacRomanian1992Charset extends Charset {
	public XMacRomanian1992Charset() {
		super("x-MacRomanian-1992", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacRomanian1992CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacRomanian1992CharsetEncoder(this);
	}

	private static final class XMacRomanian1992CharsetDecoder extends TableCharsetDecoder {
		private XMacRomanian1992CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C4\u00C5\u00C7\u00C9\u00D1\u00D6\u00DC\u00E1\u00E0\u00E2\u00E4\u00E3\u00E5\u00E7\u00E9\u00E8\u00EA\u00EB\u00ED\u00EC\u00EE\u00EF\u00F1\u00F3\u00F2\u00F4\u00F6\u00F5\u00FA\u00F9\u00FB\u00FC\u2020\u00B0\u00A2\u00A3\u00A7\u2022\u00B6\u00DF\u00AE\u00A9\u2122\u00B4\u00A8\u2260\u0102\u015E\u221E\u00B1\u2264\u2265\u00A5\u00B5\u2202\u2211\u220F\u03C0\u222B\u00AA\u00BA\u2126\u0103\u015F\u00BF\u00A1\u00AC\u221A\u0192\u2248\u2206\u00AB\u00BB\u2026\u00A0\u00C0\u00C3\u00D5\u0152\u0153\u2013\u2014\u201C\u201D\u2018\u2019\u00F7\u25CA\u00FF\u0178\u2044\u00A4\u2039\u203A\u0162\u0163\u2021\u00B7\u201A\u201E\u2030\u00C2\u00CA\u00C1\u00CB\u00C8\u00CD\u00CE\u00CF\u00CC\u00D3\u00D4\uF8FF\u00D2\u00DA\u00DB\u00D9\u0131\u02C6\u02DC\u00AF\u02D8\u02D9\u02DA\u00B8\u02DD\u02DB\u02C7".toCharArray();
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

	private static final class XMacRomanian1992CharsetEncoder extends TableCharsetEncoder {
		private XMacRomanian1992CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x53: return 0x1;
			case 0x54: return 0x2;
			case 0x73: return 0x3;
			case 0x74: return 0x4;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0x103) return CommonSubtables.COMMON1186[input - 0xA0];
			if (input >= 0x2013 && input <= 0x2044) return CommonSubtables.COMMON1183[input - 0x2013];
			switch (input) {
			case 0x131: return 0xF5L;
			case 0x152: return 0xCEL;
			case 0x153: return 0xCFL;
			case 0x15E: return 0xAFL;
			case 0x15F: return 0xBFL;
			case 0x162: return 0xDEL;
			case 0x163: return 0xDFL;
			case 0x178: return 0xD9L;
			case 0x192: return 0xC4L;
			case 0x218: return 0xAFL;
			case 0x219: return 0xBFL;
			case 0x21A: return 0xDEL;
			case 0x21B: return 0xDFL;
			case 0x2C6: return 0xF6L;
			case 0x2C7: return 0xFF01L;
			case 0x2D8: return 0xF9L;
			case 0x2D9: return 0xFAL;
			case 0x2DA: return 0xFBL;
			case 0x2DB: return 0xFEL;
			case 0x2DC: return 0xF7L;
			case 0x2DD: return 0xFDL;
			case 0x3A9: return 0xBDL;
			case 0x3C0: return 0xB9L;
			case 0x2122: return 0xAAL;
			case 0x2126: return 0xBDL;
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
			case 0xF8FF: return 0xF0L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x326: return 0xAFL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0x326: return 0xDEL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0x326: return 0xBFL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x326: return 0xDFL;
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
			default: return 0;
			}
		}
	}
}
