package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XHp18160642Charset extends Charset {
	public XHp18160642Charset() {
		super("x-hp-1816-0642", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XHp18160642CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XHp18160642CharsetEncoder(this);
	}

	private static final class XHp18160642CharsetDecoder extends TableCharsetDecoder {
		private XHp18160642CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_20 = getOutput0_20();
		private static final char[] getOutput0_20() {
			return " \u221A\u23AE\u00A7\u2207\u00B1\u221D\u2320\u00F7\u2243\u03A0\u0393\u03A8\u2261\u03A6\u039E\u2070\u00B9\u00B2\u00B3\u2074\u2075\u2076\u2077\u2078\u2079\u03A9\u039B\u221E\u2321\u2020\u03A3\u00B6\u03B1\u03B2\u03C8\u03C6\u03B5\u2202\u03BB\u03B7\u03B9\u0398\u03BA\u03C9\u03BC\u03BD\u03C1\u03C0\u03B3\u03B8\u03C3\u03C4\u03BE\u0394\u03B4\u03C7\u03C5\u03B6\u2191\u2192\u03D2\u2190\u2193".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return GETOUTPUT0_20[input - 0x20];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XHp18160642CharsetEncoder extends TableCharsetEncoder {
		private XHp18160642CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{32}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_393 = getOutput0_393();
		private static final char[] getOutput0_393() {
			return "+V\u0000\u0000\u0000J\u0000\u0000;\u0000\u0000/\u0000*\u0000\u0000?\u0000\u0000.\u0000,:\u0000\u0000\u0000\u0000\u0000\u0000\u0000ABQWEZHRIKGMNU\u0000PO\u0000STYDXCL\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000]".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x393 && input <= 0x3D2) return GETOUTPUT0_393[input - 0x393];
			switch (input) {
			case 0x20: return 0x20L;
			case 0xA0: return 0x20L;
			case 0xA7: return 0x23L;
			case 0xB1: return 0x25L;
			case 0xB2: return 0x32L;
			case 0xB3: return 0x33L;
			case 0xB5: return 0x4DL;
			case 0xB6: return 0x40L;
			case 0xB9: return 0x31L;
			case 0xF7: return 0x28L;
			case 0x2020: return 0x3EL;
			case 0x2070: return 0x30L;
			case 0x2074: return 0x34L;
			case 0x2075: return 0x35L;
			case 0x2076: return 0x36L;
			case 0x2077: return 0x37L;
			case 0x2078: return 0x38L;
			case 0x2079: return 0x39L;
			case 0x2190: return 0x5EL;
			case 0x2191: return 0x5BL;
			case 0x2192: return 0x5CL;
			case 0x2193: return 0x5FL;
			case 0x2202: return 0x46L;
			case 0x2206: return 0x56L;
			case 0x2207: return 0x24L;
			case 0x221A: return 0x21L;
			case 0x221D: return 0x26L;
			case 0x221E: return 0x3CL;
			case 0x2243: return 0x29L;
			case 0x2261: return 0x2DL;
			case 0x2320: return 0x27L;
			case 0x2321: return 0x3DL;
			case 0x23AE: return 0x22L;
			case 0x2713: return 0x21L;
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
