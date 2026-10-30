package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTexOmsPlainCharset extends Charset {
	public XTexOmsPlainCharset() {
		super("x-tex-oms-plain", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTexOmsPlainCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTexOmsPlainCharsetEncoder(this);
	}

	private static final class XTexOmsPlainCharsetDecoder extends TableCharsetDecoder {
		private XTexOmsPlainCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\u2212\u22C5\u00D7\u2217\u00F7\u22C4\u00B1\u2213\u2295\u2296\u2297\u2298\u2299\u25CB\u2218\u2219\u224D\u2261\u2286\u2287\u2264\u2265\u227C\u227D\u223C\u2248\u2282\u2283\u226A\u226B\u227A\u227B\u2190\u2192\u2191\u2193\u2194\u2197\u2198\u2243\u21D0\u21D2\u21D1\u21D3\u21D4\u2196\u2199\u221D\u2032\u221E\u2208\u220B\u25B3\u25BD\u0338\u030D\u2200\u2203\u00AC\u2205\u211C\u2111\u22A4\u22A5\u2135".toCharArray();
		}
		private static final char[] GETOUTPUT0_5B = getOutput0_5B();
		private static final char[] getOutput0_5B() {
			return "\u222A\u2229\u228E\u2227\u2228\u22A2\u22A3\u230A\u230B\u2308\u2309{}\u27E8\u27E9\u2223\u2225\u2195\u21D5\u2216\u2240\u221A\u2A3F\u2207\u222B\u2294\u2293\u2291\u2292\u00A7\u2020\u2021\u00B6\u2663\u2662\u2661\u2660".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x0 && input <= 0x40) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x5B && input <= 0x7F) return GETOUTPUT0_5B[input - 0x5B];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XTexOmsPlainCharsetEncoder extends TableCharsetEncoder {
		private XTexOmsPlainCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{3}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD835: return 0x1;
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
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x41;
			if (input >= 0x2200 && input <= 0x224D) return CommonSubtables.COMMON1747[input - 0x2200];
			if (input >= 0x2261 && input <= 0x22A5) return CommonSubtables.COMMON1748[input - 0x2261];
			switch (input) {
			case 0x7B: return 0x66L;
			case 0x7D: return 0x67L;
			case 0xA7: return 0x78L;
			case 0xAC: return 0x3AL;
			case 0xB1: return 0x601L;
			case 0xB6: return 0x7BL;
			case 0xD7: return 0x201L;
			case 0xF7: return 0x401L;
			case 0x30D: return 0x37L;
			case 0x338: return 0x36L;
			case 0x2020: return 0x79L;
			case 0x2021: return 0x7AL;
			case 0x2032: return 0x30L;
			case 0x210B: return 0x48L;
			case 0x2110: return 0x49L;
			case 0x2111: return 0x3DL;
			case 0x2112: return 0x4CL;
			case 0x211B: return 0x52L;
			case 0x211C: return 0x3CL;
			case 0x212C: return 0x42L;
			case 0x2130: return 0x45L;
			case 0x2131: return 0x46L;
			case 0x2133: return 0x4DL;
			case 0x2135: return 0x40L;
			case 0x2190: return 0x20L;
			case 0x2191: return 0x22L;
			case 0x2192: return 0x21L;
			case 0x2193: return 0x23L;
			case 0x2194: return 0x24L;
			case 0x2195: return 0x6CL;
			case 0x2196: return 0x2DL;
			case 0x2197: return 0x25L;
			case 0x2198: return 0x26L;
			case 0x2199: return 0x2EL;
			case 0x21D0: return 0x28L;
			case 0x21D1: return 0x2AL;
			case 0x21D2: return 0x29L;
			case 0x21D3: return 0x2BL;
			case 0x21D4: return 0x2CL;
			case 0x21D5: return 0x6DL;
			case 0x22C4: return 0x501L;
			case 0x22C5: return 0x101L;
			case 0x2308: return 0x64L;
			case 0x2309: return 0x65L;
			case 0x230A: return 0x62L;
			case 0x230B: return 0x63L;
			case 0x25B3: return 0x34L;
			case 0x25BD: return 0x35L;
			case 0x25CB: return 0xDL;
			case 0x2660: return 0x7FL;
			case 0x2661: return 0x7EL;
			case 0x2662: return 0x7DL;
			case 0x2663: return 0x7CL;
			case 0x27E8: return 0x68L;
			case 0x27E9: return 0x69L;
			case 0x2A3F: return 0x71L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDC9C && input <= 0xDCB5) return CommonSubtables.COMMON1749[input - 0xDC9C];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			default: return 0;
			}
		}
	}
}
