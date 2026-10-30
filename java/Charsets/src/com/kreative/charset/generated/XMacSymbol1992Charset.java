package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacSymbol1992Charset extends Charset {
	public XMacSymbol1992Charset() {
		super("x-MacSymbol-1992", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacSymbol1992CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacSymbol1992CharsetEncoder(this);
	}

	private static final class XMacSymbol1992CharsetDecoder extends TableCharsetDecoder {
		private XMacSymbol1992CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u03D2\u2032\u2264\u2044\u221E\u0192\u2663\u2666\u2665\u2660\u2194\u2190\u2191\u2192\u2193\u00B0\u00B1\u2033\u2265\u00D7\u221D\u2202\u2022\u00F7\u2260\u2261\u2248\u2026\uF8E6\uF8E7\u21B5\u2135\u2111\u211C\u2118\u2297\u2295\u2205\u2229\u222A\u2283\u2287\u2284\u2282\u2286\u2208\u2209\u2220\u2207\u00AE\u00A9\u2122\u220F\u221A\u22C5\u00AC\u2227\u2228\u21D4\u21D0\u21D1\u21D2\u21D3\u22C4\u2329\uF8E8\uF8E9\uF8EA\u2211\uF8EB\uF8EC\uF8ED\uF8EE\uF8EF\uF8F0\uF8F1\uF8F2\uF8F3\uF8F4\uF8FF\u232A\u222B\u2320\uF8F5\u2321\uF8F6\uF8F7\uF8F8\uF8F9\uF8FA\uF8FB\uF8FC\uF8FD\uF8FE".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x2E && input <= 0x3F) return input - 0x2E + 0x2E;
			if (input >= 0x40 && input <= 0x7F) return CommonSubtables.COMMON1199[input - 0x40];
			if (input >= 0xA1 && input <= 0xFE) return GETOUTPUT0_A1[input - 0xA1];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x2200L;
			case 0x23: return 0x23L;
			case 0x24: return 0x2203L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x27: return 0x220DL;
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

	private static final class XMacSymbol1992CharsetEncoder extends TableCharsetEncoder {
		private XMacSymbol1992CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x28: return 0x1;
			case 0x29: return 0x2;
			case 0x5B: return 0x3;
			case 0x5D: return 0x4;
			case 0x7B: return 0x5;
			case 0x7D: return 0x6;
			case 0xA9: return 0x7;
			case 0xAE: return 0x8;
			case 0x2122: return 0x9;
			case 0x222B: return 0xA;
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
			if (input >= 0x2E && input <= 0x3F) return input - 0x2E + 0x2E;
			if (input >= 0x391 && input <= 0x3D6) return CommonSubtables.COMMON1200[input - 0x391];
			if (input >= 0x2200 && input <= 0x2248) return CommonSubtables.COMMON1201[input - 0x2200];
			if (input >= 0x239B && input <= 0x23AF) return CommonSubtables.COMMON1202[input - 0x239B];
			if (input >= 0xF8E5 && input <= 0xF8FF) return CommonSubtables.COMMON1203[input - 0xF8E5];
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
			case 0x7F: return 0x7FL;
			case 0xA9: return 0xD3L;
			case 0xAC: return 0xD8L;
			case 0xAE: return 0xD2L;
			case 0xB0: return 0xB0L;
			case 0xB1: return 0xB1L;
			case 0xD7: return 0xB4L;
			case 0xF7: return 0xB8L;
			case 0x192: return 0xA6L;
			case 0x2022: return 0xB7L;
			case 0x2026: return 0xBCL;
			case 0x2032: return 0xA2L;
			case 0x2033: return 0xB2L;
			case 0x2044: return 0xA4L;
			case 0x2111: return 0xC1L;
			case 0x2118: return 0xC3L;
			case 0x211C: return 0xC2L;
			case 0x2122: return 0xD4L;
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
			case 0x22C4: return 0xE0L;
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
			case 0x3008: return 0xE1L;
			case 0x3009: return 0xF1L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xF870: return 0xE6L;
			case 0xF871: return 0xE7L;
			case 0xF872: return 0xE8L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xF870: return 0xF6L;
			case 0xF871: return 0xF7L;
			case 0xF872: return 0xF8L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xF870: return 0xE9L;
			case 0xF871: return 0xEAL;
			case 0xF872: return 0xEBL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xF870: return 0xF9L;
			case 0xF871: return 0xFAL;
			case 0xF872: return 0xFBL;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xF870: return 0xECL;
			case 0xF871: return 0xEDL;
			case 0xF872: return 0xEEL;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0xF870: return 0xFCL;
			case 0xF871: return 0xFDL;
			case 0xF872: return 0xFEL;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0xF87F: return 0xE3L;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0xF87F: return 0xE2L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0xF87F: return 0xE4L;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0xF871: return 0xF4L;
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
			case 5: return getOutput5(input);
			case 6: return getOutput6(input);
			case 7: return getOutput7(input);
			case 8: return getOutput8(input);
			case 9: return getOutput9(input);
			case 10: return getOutput10(input);
			default: return 0;
			}
		}
	}
}
