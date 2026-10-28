package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM437VideoCharset extends Charset {
	public XIBM437VideoCharset() {
		super("x-IBM437-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM437VideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM437VideoCharsetEncoder(this);
	}

	private static final class XIBM437VideoCharsetDecoder extends TableCharsetDecoder {
		private XIBM437VideoCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u263A\u263B\u2665\u2666\u2663\u2660\u2022\u25D8\u25CB\u25D9\u2642\u2640\u266A\u266B\u263C\u25BA\u25C4\u2195\u203C\u00B6\u00A7\u25AC\u21A8\u2191\u2193\u2192\u2190\u221F\u2194\u25B2\u25BC".toCharArray();
		}
		private static final char[] GETOUTPUT0_7F = getOutput0_7F();
		private static final char[] getOutput0_7F() {
			return "\u2302\u00C7\u00FC\u00E9\u00E2\u00E4\u00E0\u00E5\u00E7\u00EA\u00EB\u00E8\u00EF\u00EE\u00EC\u00C4\u00C5\u00C9\u00E6\u00C6\u00F4\u00F6\u00F2\u00FB\u00F9\u00FF\u00D6\u00DC\u00A2\u00A3\u00A5\u20A7\u0192\u00E1\u00ED\u00F3\u00FA\u00F1\u00D1\u00AA\u00BA\u00BF\u2310\u00AC\u00BD\u00BC\u00A1\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255D\u255C\u255B\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u255E\u255F\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256B\u256A\u2518\u250C\u2588\u2584\u258C\u2590\u2580\u03B1\u00DF\u0393\u03C0\u03A3\u03C3\u00B5\u03C4\u03A6\u0398\u03A9\u03B4\u221E\u03C6\u03B5\u2229\u2261\u00B1\u2265\u2264\u2320\u2321\u00F7\u2248\u00B0\u2219\u00B7\u221A\u207F\u00B2\u25A0\u00A0".toCharArray();
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

	private static final class XIBM437VideoCharsetEncoder extends TableCharsetEncoder {
		private XIBM437VideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\uFF01\u00AD\u009B\u009C\u0000\u009D\u0000\u0015\u0000\u0000\u00A6\u00AE\u00AA\u0000\u0000\u0000\u00F8\u00F1\u00FD\u0000\u0000\u00E6\u0014\u00FA\u0000\u0000\u00A7\u00AF\u00AC\u00AB\u0000\u00A8\u0000\u0000\u0000\u0000\u008E\u008F\u0092\u0080\u0000\u0090\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A5\u0000\u0000\u0000\u0000\u0099\u0000\u0000\u0000\u0000\u0000\u009A\u0000\u0000\u00E1\u0085\u00A0\u0083\u0000\u0084\u0086\u0091\u0087\u008A\u0082\u0088\u0089\u008D\u00A1\u008C\u008B\u0000\u00A4\u0095\u00A2\u0093\u0000\u0094\u00F6\u0000\u0097\u00A3\u0096\u0081\u0000\u0000\u0098".toCharArray();
		}
		private static final char[] GETOUTPUT0_2580 = getOutput0_2580();
		private static final char[] getOutput0_2580() {
			return "\u00DF\u0000\u0000\u0000\u00DC\u0000\u0000\u0000\u00DB\u0000\u0000\u0000\u00DD\u0000\u0000\u0000\u00DE\u00B0\u00B1\u00B2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00FE\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u0000\u0000\u001E\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u001F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u0000\u0000\u0000\t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\n".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x2550 && input <= 0x256C) return CommonSubtables.COMMON263[input - 0x2550];
			if (input >= 0x2580 && input <= 0x25D9) return GETOUTPUT0_2580[input - 0x2580];
			switch (input) {
			case 0x0: return 0x1L;
			case 0x192: return 0x9FL;
			case 0x393: return 0xE2L;
			case 0x398: return 0xE9L;
			case 0x3A3: return 0xE4L;
			case 0x3A6: return 0xE8L;
			case 0x3A9: return 0xEAL;
			case 0x3B1: return 0xE0L;
			case 0x3B4: return 0xEBL;
			case 0x3B5: return 0xEEL;
			case 0x3C0: return 0xE3L;
			case 0x3C3: return 0xE5L;
			case 0x3C4: return 0xE7L;
			case 0x3C6: return 0xEDL;
			case 0x2022: return 0x701L;
			case 0x203C: return 0x13L;
			case 0x207F: return 0xFCL;
			case 0x20A7: return 0x9EL;
			case 0x2190: return 0x1BL;
			case 0x2191: return 0x18L;
			case 0x2192: return 0x1AL;
			case 0x2193: return 0x19L;
			case 0x2194: return 0x1DL;
			case 0x2195: return 0x12L;
			case 0x21A8: return 0x17L;
			case 0x2219: return 0xF9L;
			case 0x221A: return 0xFBL;
			case 0x221E: return 0xECL;
			case 0x221F: return 0x1CL;
			case 0x2229: return 0xEFL;
			case 0x2248: return 0xF7L;
			case 0x2261: return 0xF0L;
			case 0x2264: return 0xF3L;
			case 0x2265: return 0xF2L;
			case 0x2302: return 0x7FL;
			case 0x2310: return 0xA9L;
			case 0x2320: return 0xF4L;
			case 0x2321: return 0xF5L;
			case 0x2500: return 0xC4L;
			case 0x2502: return 0xB3L;
			case 0x250C: return 0xDAL;
			case 0x2510: return 0xBFL;
			case 0x2514: return 0xC0L;
			case 0x2518: return 0xD9L;
			case 0x251C: return 0xC3L;
			case 0x2524: return 0xB4L;
			case 0x252C: return 0xC2L;
			case 0x2534: return 0xC1L;
			case 0x253C: return 0xC5L;
			case 0x263A: return 0x101L;
			case 0x263B: return 0x201L;
			case 0x263C: return 0xFL;
			case 0x2640: return 0xCL;
			case 0x2642: return 0xBL;
			case 0x2660: return 0x601L;
			case 0x2663: return 0x501L;
			case 0x2665: return 0x301L;
			case 0x2666: return 0x401L;
			case 0x266A: return 0xDL;
			case 0x266B: return 0xEL;
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
