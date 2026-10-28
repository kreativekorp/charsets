package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XRiscosBfontCharset extends Charset {
	public XRiscosBfontCharset() {
		super("x-riscos-bfont", new String[]{"x-bbc-master"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XRiscosBfontCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XRiscosBfontCharsetEncoder(this);
	}

	private static final class XRiscosBfontCharsetDecoder extends TableCharsetDecoder {
		private XRiscosBfontCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_7C = getOutput0_7C();
		private static final char[] getOutput0_7C() {
			return "\u00A6}~\u007F\u00C4\u00C5\u00C6\u00C7\u00C9\u00D6\u00DC\u00A9\u2190\u2192\u2193\u2191\u00E0\u00E8\u00EB\u00EA\u00E4\u00E5\u00E6\u00E7\u00E9\u00F6\u00FC\u00EC\u00EE\u00F2\u00F4\u00F9\u00FB\u00FF\u00A4\u00A7\u00B0\u2577\u2576\u250C\u2574\u2510\u2500\u252C\u2575\u2502\u2514\u251C\u2518\u2524\u2534\u253C\u256D\u256E\u2570\u256F\u00BF\u00A1\u00D1\u00F1\u2020\u2021\u02D9`\u00B6\u00B7\u221A\u2592\u00D8".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7B) return input - 0x61 + 0x61;
			if (input >= 0xC1 && input <= 0xD1) return input - 0xC1 + 0x391;
			if (input >= 0x7C && input <= 0xC0) return GETOUTPUT0_7C[input - 0x7C];
			if (input >= 0xE1 && input <= 0xF1) return input - 0xE1 + 0x3B1;
			switch (input) {
			case 0x60: return 0xA3L;
			case 0xD2: return 0x3A3L;
			case 0xD3: return 0x3A4L;
			case 0xD4: return 0x3A5L;
			case 0xD5: return 0x3A6L;
			case 0xD6: return 0x3A7L;
			case 0xD7: return 0x3A8L;
			case 0xD8: return 0x3A9L;
			case 0xD9: return 0x2207L;
			case 0xDA: return 0xB1L;
			case 0xDB: return 0x2213L;
			case 0xDC: return 0x7CL;
			case 0xDD: return 0x2016L;
			case 0xDE: return 0x222AL;
			case 0xDF: return 0x2229L;
			case 0xE0: return 0xF8L;
			case 0xF2: return 0x3C3L;
			case 0xF3: return 0x3C4L;
			case 0xF4: return 0x3C5L;
			case 0xF5: return 0x3C6L;
			case 0xF6: return 0x3C7L;
			case 0xF7: return 0x3C8L;
			case 0xF8: return 0x3C9L;
			case 0xF9: return 0x2202L;
			case 0xFA: return 0x2243L;
			case 0xFB: return 0x2261L;
			case 0xFC: return 0x2264L;
			case 0xFD: return 0x2260L;
			case 0xFE: return 0x2265L;
			case 0xFF: return 0x2588L;
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

	private static final class XRiscosBfontCharsetEncoder extends TableCharsetEncoder {
		private XRiscosBfontCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00B5\u0000`\u009E\u0000|\u009F\u0000\u0087\u0000\u0000\u0000\u0000\u0000\u0000\u00A0\u00DA\u0000\u0000\u0000\u0000\u00BC\u00BD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00B4\u0000\u0000\u0000\u0000\u0080\u0081\u0082\u0083\u0000\u0084\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00B6\u0000\u0000\u0000\u0000\u0085\u0000\u00C0\u0000\u0000\u0000\u0086\u0000\u0000\u0000\u008C\u0000\u0000\u0000\u0090\u0091\u0092\u0093\u008D\u0094\u008F\u008E\u0097\u0000\u0098\u0000\u0000\u00B7\u0099\u0000\u009A\u0000\u0095\u0000\u00E0\u009B\u0000\u009C\u0096\u0000\u0000\u009D".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7B) return input - 0x61 + 0x61;
			if (input >= 0xA1 && input <= 0xFF) return GETOUTPUT0_A1[input - 0xA1];
			if (input >= 0x391 && input <= 0x3A1) return input - 0x391 + 0xC1;
			if (input >= 0x3B1 && input <= 0x3C1) return input - 0x3B1 + 0xE1;
			switch (input) {
			case 0x60: return 0xBBL;
			case 0x7C: return 0xDCL;
			case 0x7D: return 0x7DL;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x7FL;
			case 0x2D9: return 0xBAL;
			case 0x3A3: return 0xD2L;
			case 0x3A4: return 0xD3L;
			case 0x3A5: return 0xD4L;
			case 0x3A6: return 0xD5L;
			case 0x3A7: return 0xD6L;
			case 0x3A8: return 0xD7L;
			case 0x3A9: return 0xD8L;
			case 0x3C3: return 0xF2L;
			case 0x3C4: return 0xF3L;
			case 0x3C5: return 0xF4L;
			case 0x3C6: return 0xF5L;
			case 0x3C7: return 0xF6L;
			case 0x3C8: return 0xF7L;
			case 0x3C9: return 0xF8L;
			case 0x2016: return 0xDDL;
			case 0x2020: return 0xB8L;
			case 0x2021: return 0xB9L;
			case 0x2190: return 0x88L;
			case 0x2191: return 0x8BL;
			case 0x2192: return 0x89L;
			case 0x2193: return 0x8AL;
			case 0x2202: return 0xF9L;
			case 0x2207: return 0xD9L;
			case 0x2213: return 0xDBL;
			case 0x221A: return 0xBEL;
			case 0x2229: return 0xDFL;
			case 0x222A: return 0xDEL;
			case 0x2243: return 0xFAL;
			case 0x2260: return 0xFDL;
			case 0x2261: return 0xFBL;
			case 0x2264: return 0xFCL;
			case 0x2265: return 0xFEL;
			case 0x2500: return 0xA6L;
			case 0x2502: return 0xA9L;
			case 0x250C: return 0xA3L;
			case 0x2510: return 0xA5L;
			case 0x2514: return 0xAAL;
			case 0x2518: return 0xACL;
			case 0x251C: return 0xABL;
			case 0x2524: return 0xADL;
			case 0x252C: return 0xA7L;
			case 0x2534: return 0xAEL;
			case 0x253C: return 0xAFL;
			case 0x256D: return 0xB0L;
			case 0x256E: return 0xB1L;
			case 0x256F: return 0xB3L;
			case 0x2570: return 0xB2L;
			case 0x2574: return 0xA4L;
			case 0x2575: return 0xA8L;
			case 0x2576: return 0xA2L;
			case 0x2577: return 0xA1L;
			case 0x2588: return 0xFF01L;
			case 0x2592: return 0xBFL;
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
