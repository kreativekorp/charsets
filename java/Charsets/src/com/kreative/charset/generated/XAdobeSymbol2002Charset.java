package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAdobeSymbol2002Charset extends Charset {
	public XAdobeSymbol2002Charset() {
		super("x-adobe-symbol-2002", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAdobeSymbol2002CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAdobeSymbol2002CharsetEncoder(this);
	}

	private static final class XAdobeSymbol2002CharsetDecoder extends TableCharsetDecoder {
		private XAdobeSymbol2002CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u20AC\u03D2\u2032\u2264\u2044\u221E\u0192\u2663\u2666\u2665\u2660\u2194\u2190\u2191\u2192\u2193\u00B0\u00B1\u2033\u2265\u00D7\u221D\u2202\u2022\u00F7\u2260\u2261\u2248\u2026\u23D0\u23AF\u21B5\u2135\u2111\u211C\u2118\u2297\u2295\u2205\u2229\u222A\u2283\u2287\u2284\u2282\u2286\u2208\u2209\u2220\u2207\uF6DA\uF6D9\uF6DB\u220F\u221A\u22C5\u00AC\u2227\u2228\u21D4\u21D0\u21D1\u21D2\u21D3\u25CA\u2329\uF8E8\uF8E9\uF8EA\u2211\u239B\u239C\u239D\u23A1\u23A2\u23A3\u23A7\u23A8\u23A9\u23AA\u0000\u232A\u222B\u2320\u23AE\u2321\u239E\u239F\u23A0\u23A4\u23A5\u23A6\u23AB\u23AC\u23AD".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x2E && input <= 0x3F) return input - 0x2E + 0x2E;
			if (input >= 0x7F && input <= 0x9F) return input - 0x7F + 0x7F;
			if (input >= 0x40 && input <= 0x7E) return CommonSubtables.COMMON1209[input - 0x40];
			if (input >= 0xA0 && input <= 0xFE) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x2200L;
			case 0x23: return 0x23L;
			case 0x24: return 0x2203L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x27: return 0x220BL;
			case 0x28: return 0x28L;
			case 0x29: return 0x29L;
			case 0x2A: return 0x2217L;
			case 0x2B: return 0x2BL;
			case 0x2C: return 0x2CL;
			case 0x2D: return 0x2212L;
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

	private static final class XAdobeSymbol2002CharsetEncoder extends TableCharsetEncoder {
		private XAdobeSymbol2002CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x2E && input <= 0x3F) return input - 0x2E + 0x2E;
			if (input >= 0x7F && input <= 0x9F) return input - 0x7F + 0x7F;
			if (input >= 0x391 && input <= 0x3D6) return CommonSubtables.COMMON1200[input - 0x391];
			if (input >= 0x2200 && input <= 0x2248) return CommonSubtables.COMMON1210[input - 0x2200];
			if (input >= 0x239B && input <= 0x23AF) return CommonSubtables.COMMON1202[input - 0x239B];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x23: return 0x23L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x28: return 0x28L;
			case 0x29: return 0x29L;
			case 0x2B: return 0x2BL;
			case 0x2C: return 0x2CL;
			case 0x5B: return 0x5BL;
			case 0x5D: return 0x5DL;
			case 0x5F: return 0x5FL;
			case 0x7B: return 0x7BL;
			case 0x7C: return 0x7CL;
			case 0x7D: return 0x7DL;
			case 0xAC: return 0xD8L;
			case 0xB0: return 0xB0L;
			case 0xB1: return 0xB1L;
			case 0xB5: return 0x6DL;
			case 0xD7: return 0xB4L;
			case 0xF7: return 0xB8L;
			case 0x192: return 0xA6L;
			case 0x2022: return 0xB7L;
			case 0x2026: return 0xBCL;
			case 0x2032: return 0xA2L;
			case 0x2033: return 0xB2L;
			case 0x2044: return 0xA4L;
			case 0x20AC: return 0xA0L;
			case 0x2111: return 0xC1L;
			case 0x2118: return 0xC3L;
			case 0x211C: return 0xC2L;
			case 0x2126: return 0x57L;
			case 0x2135: return 0xC0L;
			case 0x2190: return 0xACL;
			case 0x2191: return 0xADL;
			case 0x2192: return 0xAEL;
			case 0x2193: return 0xAFL;
			case 0x2194: return 0xABL;
			case 0x21B5: return 0xBFL;
			case 0x21D0: return 0xDCL;
			case 0x21D1: return 0xDDL;
			case 0x21D2: return 0xDEL;
			case 0x21D3: return 0xDFL;
			case 0x21D4: return 0xDBL;
			case 0x2260: return 0xB9L;
			case 0x2261: return 0xBAL;
			case 0x2264: return 0xA3L;
			case 0x2265: return 0xB3L;
			case 0x2282: return 0xCCL;
			case 0x2283: return 0xC9L;
			case 0x2284: return 0xCBL;
			case 0x2286: return 0xCDL;
			case 0x2287: return 0xCAL;
			case 0x2295: return 0xC5L;
			case 0x2297: return 0xC4L;
			case 0x22A5: return 0x5EL;
			case 0x22C5: return 0xD7L;
			case 0x2320: return 0xF3L;
			case 0x2321: return 0xF5L;
			case 0x2329: return 0xE1L;
			case 0x232A: return 0xF1L;
			case 0x23D0: return 0xBDL;
			case 0x25CA: return 0xE0L;
			case 0x2660: return 0xAAL;
			case 0x2663: return 0xA7L;
			case 0x2665: return 0xA9L;
			case 0x2666: return 0xA8L;
			case 0xF6D9: return 0xD3L;
			case 0xF6DA: return 0xD2L;
			case 0xF6DB: return 0xD4L;
			case 0xF8E5: return 0x60L;
			case 0xF8E8: return 0xE2L;
			case 0xF8E9: return 0xE3L;
			case 0xF8EA: return 0xE4L;
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
