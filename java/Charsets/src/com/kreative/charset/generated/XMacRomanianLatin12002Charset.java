package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacRomanianLatin12002Charset extends Charset {
	public XMacRomanianLatin12002Charset() {
		super("x-MacRomanianLatin1-2002", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacRomanianLatin12002CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacRomanianLatin12002CharsetEncoder(this);
	}

	private static final class XMacRomanianLatin12002CharsetDecoder extends TableCharsetDecoder {
		private XMacRomanianLatin12002CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u2022\u2122\u2260\u221E\u2265\u2211\u222B\u03A9\u221A\u2248\u2026\u2014\u2018\u0178\u2044\u2202\u2206\u0152\u201A\u201E\u2030\uF8FF\u02C6\u02DC\u02D8\u02D9\u02DA\u02DD\u02DB\u02C7\u0131\u0192\u00A0\u00A1\u00A2\u00A3\u20AC\u00A5\u0153\u00A7\u00A8\u00A9\u00AA\u00AB\u00AC\u2013\u00AE\u00AF\u00B0\u00B1\u201D\u201C\u00B4\u00B5\u00B6\u00B7\u00B8\u2019\u00BA\u00BB\u03C0\u220F\u2264\u00BF\u00C0\u00C1\u00C2\u00C3\u00C4\u00C5\u0102\u00C7\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u2039\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u25CA\u0218\u00D9\u00DA\u00DB\u00DC\u2020\u021A\u00DF\u00E0\u00E1\u00E2\u00E3\u00E4\u00E5\u0103\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u203A\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u0219\u00F9\u00FA\u00FB\u00FC\u2021\u021B\u00FF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DAC0[input - 0x0];
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

	private static final class XMacRomanianLatin12002CharsetEncoder extends TableCharsetEncoder {
		private XMacRomanianLatin12002CharsetEncoder(Charset cs) {
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
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EAC0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0x103) return CommonSubtables.C6036990[input - 0xA0];
			if (input >= 0x2013 && input <= 0x2044) return CommonSubtables.C5480636[input - 0x2013];
			switch (input) {
			case 0x131: return 0x9EL;
			case 0x152: return 0x91L;
			case 0x153: return 0xA6L;
			case 0x15E: return 0xD8L;
			case 0x15F: return 0xF8L;
			case 0x162: return 0xDEL;
			case 0x163: return 0xFEL;
			case 0x178: return 0x8DL;
			case 0x192: return 0x9FL;
			case 0x218: return 0xD8L;
			case 0x219: return 0xF8L;
			case 0x21A: return 0xDEL;
			case 0x21B: return 0xFEL;
			case 0x2C6: return 0x96L;
			case 0x2C7: return 0x9DL;
			case 0x2D8: return 0x98L;
			case 0x2D9: return 0x99L;
			case 0x2DA: return 0x9AL;
			case 0x2DB: return 0x9CL;
			case 0x2DC: return 0x97L;
			case 0x2DD: return 0x9BL;
			case 0x3A9: return 0x87L;
			case 0x3C0: return 0xBCL;
			case 0x20AC: return 0xA4L;
			case 0x2122: return 0x81L;
			case 0x2126: return 0x87L;
			case 0x2202: return 0x8FL;
			case 0x2206: return 0x90L;
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
			case 0xF8FF: return 0x95L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x326: return 0xD8L;
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
			case 0x326: return 0xF8L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x326: return 0xFEL;
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
