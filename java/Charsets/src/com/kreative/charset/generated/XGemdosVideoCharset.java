package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XGemdosVideoCharset extends Charset {
	public XGemdosVideoCharset() {
		super("x-gemdos-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XGemdosVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XGemdosVideoCharsetEncoder(this);
	}

	private static final class XGemdosVideoCharsetDecoder extends TableCharsetDecoder {
		private XGemdosVideoCharsetDecoder(Charset cs) {
			super(cs, 1.028f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_0 = getOutput0_0();
		private static final long[] getOutput0_0() {
			return new long[] {
				0xFFFEL, 0x21E7L, 0x21E9L, 0x21E8L, 0x21E6L, 0xDFBDD83EL, 0xDFBED83EL, 0xDFBFD83EL, 0x2713L, 0xFE0EDD52D83DL, 0xDFFAD83EL, 0x266AL, 0x25B4L, 0x25BEL, 0x25B8L, 0x25C2L,
				0x25B6L, 0x25C0L, 0xDF9BD83EL, 0x2582L, 0xB6L, 0xA7L, 0x2195L, 0x21A8L, 0x2191L, 0x2193L, 0x2192L, 0x2190L, 0x221FL, 0x2194L, 0x25B2L, 0x25BCL,
			};
		}
		private static final char[] GETOUTPUT0_7F = getOutput0_7F();
		private static final char[] getOutput0_7F() {
			return "\u2302\u00C7\u00FC\u00E9\u00E2\u00E4\u00E0\u00E5\u00E7\u00EA\u00EB\u00E8\u00EF\u00EE\u00EC\u00C4\u00C5\u00C9\u00E6\u00C6\u00F4\u00F6\u00F2\u00FB\u00F9\u00FF\u00D6\u00DC\u00F8\u00A3\u00D8\u00A4\u0192\u00E1\u00ED\u00F3\u00FA\u00F1\u00D1\u00AA\u00BA\u00BF\u201C\u201D\u2039\u203A\u00A1\u00AB\u00BB\u00E3\u00F5\u00A5\u00A2\u0153\u0152\u00C0\u00C3\u00D5\u00A7\u2021\u2020\u00B6\u00A9\u00AE\u2122\u201E\u2026\u2030\u2022\u2013\u2014\u00B0\u00C1\u00C2\u00C8\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u00D2\u00D3\u00D4\u0160\u0161\u00D9\u00DA\u00DB\u0178\u00DF\u0000\u0000\u0000\u0000\u0000\u0000\u03B1\u03B2\u0393\u03C0\u03A3\u03C3\u00B5\u03C4\u03A6\u0398\u03A9\u03B4\u222E\u03D5\u2208\u2229\u2261\u00B1\u2265\u2264\u2320\u2321\u00F7\u2248\u00B0\u2219\u00B7\u221A\u207F\u00B2\u25A0\u2205".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x7F && input <= 0xFF) return GETOUTPUT0_7F[input - 0x7F];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XGemdosVideoCharsetEncoder extends TableCharsetEncoder {
		private XGemdosVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83D: return 0x1;
			case 0xD83E: return 0x3;
			}
			return 0;
		}
		private int getNextState1(int input) {
			switch (input) {
			case 0xDD52: return 0x2;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 1: return getNextState1(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFF) return CommonSubtables.COMMON1233[input - 0xA1];
			switch (input) {
			case 0x0: return 0x1L;
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
			case 0x2190: return 0x1BL;
			case 0x2191: return 0x18L;
			case 0x2192: return 0x1AL;
			case 0x2193: return 0x19L;
			case 0x2194: return 0x1DL;
			case 0x2195: return 0x16L;
			case 0x21A8: return 0x17L;
			case 0x21E6: return 0x401L;
			case 0x21E7: return 0x101L;
			case 0x21E8: return 0x301L;
			case 0x21E9: return 0x201L;
			case 0x2205: return 0xFF01L;
			case 0x2208: return 0xEEL;
			case 0x2219: return 0xF9L;
			case 0x221A: return 0xFBL;
			case 0x221F: return 0x1CL;
			case 0x2229: return 0xEFL;
			case 0x222E: return 0xECL;
			case 0x2248: return 0xF7L;
			case 0x2261: return 0xF0L;
			case 0x2264: return 0xF3L;
			case 0x2265: return 0xF2L;
			case 0x2302: return 0x7FL;
			case 0x2320: return 0xF4L;
			case 0x2321: return 0xF5L;
			case 0x2582: return 0x13L;
			case 0x25A0: return 0xFEL;
			case 0x25B2: return 0x1EL;
			case 0x25B4: return 0xCL;
			case 0x25B6: return 0x10L;
			case 0x25B8: return 0xEL;
			case 0x25BC: return 0x1FL;
			case 0x25BE: return 0xDL;
			case 0x25C0: return 0x11L;
			case 0x25C2: return 0xFL;
			case 0x266A: return 0xBL;
			case 0x2713: return 0x8L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDD14: return 0xAL;
			case 0xDD52: return 0x9L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xFE0E: return 0x9L;
			case 0xFE0F: return 0x9L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xDF9B: return 0x12L;
			case 0xDFBD: return 0x501L;
			case 0xDFBE: return 0x601L;
			case 0xDFBF: return 0x701L;
			case 0xDFFA: return 0xAL;
			}
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
