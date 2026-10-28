package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacVT100Charset extends Charset {
	public XMacVT100Charset() {
		super("x-MacVT100", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacVT100CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacVT100CharsetEncoder(this);
	}

	private static final class XMacVT100CharsetDecoder extends TableCharsetDecoder {
		private XMacVT100CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C4\u00C5\u00C7\u00C9\u00D1\u00D6\u00DC\u00E1\u00E0\u00E2\u00E4\u00E3\u00E5\u00E7\u00E9\u00E8\u00EA\u00EB\u00ED\u00EC\u00EE\u00EF\u00F1\u00F3\u00F2\u00F4\u00F6\u00F5\u00FA\u00F9\u00FB\u00FC\u00DD\u00B0\u00A2\u00A3\u00A7\u00B8\u00B6\u00DF\u00AE\u00A9\u2122\u00B4\u00A8\u2260\u00C6\u00D8\u00D7\u00B1\u2264\u2265\u00A5\u00B5\u00B9\u00B2\u00B3\u03C0\u00A6\u00AA\u00BA\u2592\u00E6\u00F8\u00BF\u00A1\u00AC\u00BD\u0192\u00BC\u00BE\u00AB\u00BB\u2026\u2426\u00C0\u00C3\u00D5\u0152\u0153\u2013\u2014\u2518\u2510\u250C\u2514\u00F7\u2022\u00FF\u0178\u253C\u20AC\u00D0\u00F0\u00FE\u00DE\u00FD\u00B7\u23BA\u23BB\u2500\u00C2\u00CA\u00C1\u00CB\u00C8\u00CD\u00CE\u00CF\u00CC\u00D3\u00D4\u0000\u00D2\u00DA\u00DB\u00D9\u23BC\u23BD\u251C\u2524\u2534\u252C\u2502".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFB) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMacVT100CharsetEncoder extends TableCharsetEncoder {
		private XMacVT100CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00C1\u00A2\u00A3\u0000\u00B4\u00BA\u00A4\u00AC\u00A9\u00BB\u00C7\u00C2\u0000\u00A8\u0000\u00A1\u00B1\u00B7\u00B8\u00AB\u00B5\u00A6\u00E1\u00A5\u00B6\u00BC\u00C8\u00C5\u00C3\u00C6\u00C0\u00CB\u00E7\u00E5\u00CC\u0080\u0081\u00AE\u0082\u00E9\u0083\u00E6\u00E8\u00ED\u00EA\u00EB\u00EC\u00DC\u0084\u00F1\u00EE\u00EF\u00CD\u0085\u00B0\u00AF\u00F4\u00F2\u00F3\u0086\u00A0\u00DF\u00A7\u0088\u0087\u0089\u008B\u008A\u008C\u00BE\u008D\u008F\u008E\u0090\u0091\u0093\u0092\u0094\u0095\u00DD\u0096\u0098\u0097\u0099\u009B\u009A\u00D6\u00BF\u009D\u009C\u009E\u009F\u00E0\u00DE\u00D8".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFF) return GETOUTPUT0_A1[input - 0xA1];
			switch (input) {
			case 0x152: return 0xCEL;
			case 0x153: return 0xCFL;
			case 0x178: return 0xD9L;
			case 0x192: return 0xC4L;
			case 0x3C0: return 0xB9L;
			case 0x2013: return 0xD0L;
			case 0x2014: return 0xD1L;
			case 0x2022: return 0xD7L;
			case 0x2026: return 0xC9L;
			case 0x20AC: return 0xDBL;
			case 0x2122: return 0xAAL;
			case 0x2260: return 0xADL;
			case 0x2264: return 0xB2L;
			case 0x2265: return 0xB3L;
			case 0x23BA: return 0xE2L;
			case 0x23BB: return 0xE3L;
			case 0x23BC: return 0xF5L;
			case 0x23BD: return 0xF6L;
			case 0x2426: return 0xCAL;
			case 0x2500: return 0xE4L;
			case 0x2502: return 0xFBL;
			case 0x250C: return 0xD4L;
			case 0x2510: return 0xD3L;
			case 0x2514: return 0xD5L;
			case 0x2518: return 0xD2L;
			case 0x251C: return 0xF7L;
			case 0x2524: return 0xF8L;
			case 0x252C: return 0xFAL;
			case 0x2534: return 0xF9L;
			case 0x253C: return 0xDAL;
			case 0x2592: return 0xBDL;
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
