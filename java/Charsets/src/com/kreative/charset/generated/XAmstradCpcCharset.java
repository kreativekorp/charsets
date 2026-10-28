package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAmstradCpcCharset extends Charset {
	public XAmstradCpcCharset() {
		super("x-amstrad-cpc", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAmstradCpcCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAmstradCpcCharsetEncoder(this);
	}

	private static final class XAmstradCpcCharsetDecoder extends TableCharsetDecoder {
		private XAmstradCpcCharsetDecoder(Charset cs) {
			super(cs, 1.10547f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_7F = getOutput0_7F();
		private static final int[] getOutput0_7F() {
			return new int[] {
				0x2429, 0xA0, 0x2598, 0x259D, 0x2580, 0x2596, 0x258C, 0x259E, 0x259B, 0x2597, 0x259A, 0x2590, 0x259C, 0x2584, 0x2599, 0x259F,
				0x2588, 0xB7, 0x2575, 0x2576, 0x2514, 0x2577, 0x2502, 0x250C, 0x251C, 0x2574, 0x2518, 0x2500, 0x2534, 0x2510, 0x2524, 0x252C,
				0x253C, 0x5E, 0xB4, 0xA8, 0xA3, 0xA9, 0xB6, 0xA7, 0x2018, 0xBC, 0xBD, 0xBE, 0xB1, 0xF7, 0xAC, 0xBF,
				0xA1, 0x3B1, 0x3B2, 0x3B3, 0x3B4, 0x3B5, 0x3B8, 0x3BB, 0x3BC, 0x3C0, 0x3C3, 0x3C6, 0x3C8, 0x3C7, 0x3C9, 0x3A3,
				0x3A9, 0xDFA0D83E, 0xDFA1D83E, 0xDFA3D83E, 0xDFA2D83E, 0xDFA7D83E, 0xDFA5D83E, 0xDFA6D83E, 0xDFA4D83E, 0xDFA8D83E, 0xDFA9D83E, 0xDFAED83E, 0x2573, 0x2571, 0x2572, 0xDF95D83E,
				0x2592, 0x23BA, 0x23B9, 0x23BD, 0x23B8, 0x25E4, 0x25E5, 0x25E2, 0x25E3, 0xDF8ED83E, 0xDF8DD83E, 0xDF8FD83E, 0xDF8CD83E, 0xDF9CD83E, 0xDF9DD83E, 0xDF9ED83E,
				0xDF9FD83E, 0x263A, 0x2639, 0x2663, 0x2666, 0x2665, 0x2660, 0x25CB, 0x25CF, 0x25A1, 0x25A0, 0x2642, 0x2640, 0x2669, 0x266A, 0x263C,
				0xDC57D833, 0x2B61, 0x2B63, 0x2B60, 0x2B62, 0x25B2, 0x25BC, 0x25B6, 0x25C0, 0xDFC6D83E, 0xDFC5D83E, 0xDFC7D83E, 0xDFC8D83E, 0xDC63D833, 0xDC64D833, 0x2B65,
				0x2B64,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x28 && input <= 0x5D) return input - 0x28 + 0x28;
			if (input >= 0x5F && input <= 0x7E) return input - 0x5F + 0x5F;
			if (input >= 0x7F && input <= 0xFF) return GETOUTPUT0_7F[input - 0x7F];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x27: return 0x2019L;
			case 0x5E: return 0x2191L;
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

	private static final class XAmstradCpcCharsetEncoder extends TableCharsetEncoder {
		private XAmstradCpcCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			case 0xD83E: return 0x2;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_3A3 = getOutput0_3A3();
		private static final char[] getOutput0_3A3() {
			return "\u00BE\u0000\u0000\u0000\u0000\u0000\u00BF\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00B0\u00B1\u00B2\u00B3\u00B4\u0000\u0000\u00B5\u0000\u0000\u00B6\u00B7\u0000\u0000\u0000\u00B8\u0000\u0000\u00B9\u0000\u0000\u00BA\u00BC\u00BB\u00BD".toCharArray();
		}
		private static final char[] GETOUTPUT0_2571 = getOutput0_2571();
		private static final char[] getOutput0_2571() {
			return "\u00CC\u00CD\u00CB\u0098\u0091\u0092\u0094\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0083\u00D2\u0000\u0000\u008C\u0000\u0000\u0000\u008F\u0000\u0000\u0000\u0085\u0000\u0000\u00D3\u008A\u0000\u00CF\u0000\u00D0\u00D1\u0084\u0088\u0081\u008D\u0089\u0087\u008B\u0082\u0086\u008E\u00E9\u00E8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00F4\u0000\u0000\u0000\u00F6\u0000\u0000\u0000\u0000\u0000\u00F5\u0000\u0000\u0000\u00F7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00E6\u0000\u0000\u0000\u00E7".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x5F && input <= 0x7F) return input - 0x5F + 0x5F;
			if (input >= 0x3A3 && input <= 0x3C9) return GETOUTPUT0_3A3[input - 0x3A3];
			if (input >= 0x2571 && input <= 0x25CF) return GETOUTPUT0_2571[input - 0x2571];
			switch (input) {
			case 0x5E: return 0xA0L;
			case 0xA0: return 0x80L;
			case 0xA1: return 0xAFL;
			case 0xA3: return 0xA3L;
			case 0xA7: return 0xA6L;
			case 0xA8: return 0xA2L;
			case 0xA9: return 0xA4L;
			case 0xAC: return 0xADL;
			case 0xB1: return 0xABL;
			case 0xB4: return 0xA1L;
			case 0xB6: return 0xA5L;
			case 0xB7: return 0x90L;
			case 0xBC: return 0xA8L;
			case 0xBD: return 0xA9L;
			case 0xBE: return 0xAAL;
			case 0xBF: return 0xAEL;
			case 0xF7: return 0xACL;
			case 0x2018: return 0xA7L;
			case 0x2019: return 0x27L;
			case 0x2191: return 0x5EL;
			case 0x23B8: return 0xD3L;
			case 0x23B9: return 0xD1L;
			case 0x23BA: return 0xD0L;
			case 0x23BD: return 0xD2L;
			case 0x2429: return 0x7FL;
			case 0x2500: return 0x9AL;
			case 0x2502: return 0x95L;
			case 0x250C: return 0x96L;
			case 0x2510: return 0x9CL;
			case 0x2514: return 0x93L;
			case 0x2518: return 0x99L;
			case 0x251C: return 0x97L;
			case 0x2524: return 0x9DL;
			case 0x252C: return 0x9EL;
			case 0x2534: return 0x9BL;
			case 0x253C: return 0x9FL;
			case 0x25E2: return 0xD6L;
			case 0x25E3: return 0xD7L;
			case 0x25E4: return 0xD4L;
			case 0x25E5: return 0xD5L;
			case 0x2639: return 0xE1L;
			case 0x263A: return 0xE0L;
			case 0x263C: return 0xEEL;
			case 0x2640: return 0xEBL;
			case 0x2642: return 0xEAL;
			case 0x2660: return 0xE5L;
			case 0x2663: return 0xE2L;
			case 0x2665: return 0xE4L;
			case 0x2666: return 0xE3L;
			case 0x2669: return 0xECL;
			case 0x266A: return 0xEDL;
			case 0x2B60: return 0xF2L;
			case 0x2B61: return 0xF0L;
			case 0x2B62: return 0xF3L;
			case 0x2B63: return 0xF1L;
			case 0x2B64: return 0xFF01L;
			case 0x2B65: return 0xFEL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDC57: return 0xEFL;
			case 0xDC63: return 0xFCL;
			case 0xDC64: return 0xFDL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT2_DF8C = getOutput2_DF8C();
		private static final char[] getOutput2_DF8C() {
			return "\u00DB\u00D9\u00D8\u00DA\u0000\u0000\u0000\u0000\u0000\u00CE\u0000\u0000\u0000\u0000\u0000\u0000\u00DC\u00DD\u00DE\u00DF\u00C0\u00C1\u00C3\u00C2\u00C7\u00C5\u00C6\u00C4\u00C8\u00C9\u0000\u0000\u0000\u0000\u00CA".toCharArray();
		}
		private long getOutput2(int input) {
			if (input >= 0xDF8C && input <= 0xDFAE) return GETOUTPUT2_DF8C[input - 0xDF8C];
			switch (input) {
			case 0xDFC5: return 0xF9L;
			case 0xDFC6: return 0xF8L;
			case 0xDFC7: return 0xFAL;
			case 0xDFC8: return 0xFBL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			default: return 0;
			}
		}
	}
}
