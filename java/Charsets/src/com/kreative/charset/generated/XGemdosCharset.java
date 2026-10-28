package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XGemdosCharset extends Charset {
	public XGemdosCharset() {
		super("x-gemdos", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XGemdosCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XGemdosCharsetEncoder(this);
	}

	private static final class XGemdosCharsetDecoder extends TableCharsetDecoder {
		private XGemdosCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C7\u00FC\u00E9\u00E2\u00E4\u00E0\u00E5\u00E7\u00EA\u00EB\u00E8\u00EF\u00EE\u00EC\u00C4\u00C5\u00C9\u00E6\u00C6\u00F4\u00F6\u00F2\u00FB\u00F9\u00FF\u00D6\u00DC\u00F8\u00A3\u00D8\u00A4\u0192\u00E1\u00ED\u00F3\u00FA\u00F1\u00D1\u00AA\u00BA\u00BF\u201C\u201D\u2039\u203A\u00A1\u00AB\u00BB\u00E3\u00F5\u00A5\u00A2\u0153\u0152\u00C0\u00C3\u00D5\u00A7\u2021\u2020\u00B6\u00A9\u00AE\u2122\u201E\u2026\u2030\u2022\u2013\u2014\u00B0\u00C1\u00C2\u00C8\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u00D2\u00D3\u00D4\u0160\u0161\u00D9\u00DA\u00DB\u0178\u00DF\u0000\u0000\u0000\u0000\u0000\u0000\u03B1\u03B2\u0393\u03C0\u03A3\u03C3\u00B5\u03C4\u03A6\u0398\u03A9\u03B4\u222E\u03D5\u2208\u2229\u2261\u00B1\u2265\u2264\u2320\u2321\u00F7\u2248\u00B0\u2219\u00B7\u221A\u207F\u00B2\u25A0\u2205".toCharArray();
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

	private static final class XGemdosCharsetEncoder extends TableCharsetEncoder {
		private XGemdosCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFF) return CommonSubtables.COMMON1233[input - 0xA1];
			switch (input) {
			case 0x152: return 0xB5L;
			case 0x153: return 0xB4L;
			case 0x160: return 0xD3L;
			case 0x161: return 0xD4L;
			case 0x178: return 0xD8L;
			case 0x192: return 0x9FL;
			case 0x393: return 0xE2L;
			case 0x398: return 0xE9L;
			case 0x3A3: return 0xE4L;
			case 0x3A6: return 0xE8L;
			case 0x3A9: return 0xEAL;
			case 0x3B1: return 0xE0L;
			case 0x3B2: return 0xE1L;
			case 0x3B4: return 0xEBL;
			case 0x3C0: return 0xE3L;
			case 0x3C3: return 0xE5L;
			case 0x3C4: return 0xE7L;
			case 0x3D5: return 0xEDL;
			case 0x2013: return 0xC4L;
			case 0x2014: return 0xC5L;
			case 0x201C: return 0xA9L;
			case 0x201D: return 0xAAL;
			case 0x201E: return 0xC0L;
			case 0x2020: return 0xBBL;
			case 0x2021: return 0xBAL;
			case 0x2022: return 0xC3L;
			case 0x2026: return 0xC1L;
			case 0x2030: return 0xC2L;
			case 0x2039: return 0xABL;
			case 0x203A: return 0xACL;
			case 0x207F: return 0xFCL;
			case 0x2122: return 0xBFL;
			case 0x2205: return 0xFF01L;
			case 0x2208: return 0xEEL;
			case 0x2219: return 0xF9L;
			case 0x221A: return 0xFBL;
			case 0x2229: return 0xEFL;
			case 0x222E: return 0xECL;
			case 0x2248: return 0xF7L;
			case 0x2261: return 0xF0L;
			case 0x2264: return 0xF3L;
			case 0x2265: return 0xF2L;
			case 0x2320: return 0xF4L;
			case 0x2321: return 0xF5L;
			case 0x25A0: return 0xFEL;
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
