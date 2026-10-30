package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAmstradCpmCharset extends Charset {
	public XAmstradCpmCharset() {
		super("x-amstrad-cpm", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAmstradCpmCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAmstradCpmCharsetEncoder(this);
	}

	private static final class XAmstradCpmCharsetDecoder extends TableCharsetDecoder {
		private XAmstradCpmCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u25A0\u2567\u255F\u255A\u2564\u2551\u2554\u2560\u2562\u255D\u2550\u2569\u2557\u2563\u2566\u256C\u00B7\u2575\u2576\u2514\u2577\u2502\u250C\u251C\u2574\u2518\u2500\u2534\u2510\u2524\u252C\u253C\u00AA\u00BA\u00B0\u00A3\u00A9\u00B6\u00A7\u2020\u00BC\u00BD\u00BE\u00AB\u00BB\u20A7\u00BF\u00A1\u0192\u00A2\u00A8\u00B4\u02C6\u2030\u215B\u215C\u215D\u215E\u00DF\u25E6\u2022\u00A5\u00AE\u2122\u00C1\u00C9\u00CD\u00D3\u00DA\u00C2\u00CA\u00CE\u00D4\u00DB\u00C0\u00C8\u00CC\u00D2\u00D9\u0178\u00C4\u00CB\u00CF\u00D6\u00DC\u00C7\u00C6\u00C5\u00D8\u00D1\u00C3\u00D5\u2265\u2264\u2260\u2243\u00E1\u00E9\u00ED\u00F3\u00FA\u00E2\u00EA\u00EE\u00F4\u00FB\u00E0\u00E8\u00EC\u00F2\u00F9\u00FF\u00E4\u00EB\u00EF\u00F6\u00FC\u00E7\u00E6\u00E5\u00F8\u00F1\u00E3\u00F5\u21D2\u21D0\u21D4\u2261".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x5F && input <= 0x7F) return input - 0x5F + 0x5F;
			if (input >= 0x80 && input <= 0xFF) return GETOUTPUT0_80[input - 0x80];
			switch (input) {
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

	private static final class XAmstradCpmCharsetEncoder extends TableCharsetEncoder {
		private XAmstradCpmCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00AF\u00B1\u00A3\u0000\u00BD\u0000\u00A6\u00B2\u00A4\u00A0\u00AB\u0000\u0000\u00BE\u0000\u00A2\u0000\u0000\u0000\u00B3\u0000\u00A5\u0090\u0000\u0000\u00A1\u00AC\u00A8\u00A9\u00AA\u00AE\u00CA\u00C0\u00C5\u00DA\u00D0\u00D7\u00D6\u00D5\u00CB\u00C1\u00C6\u00D1\u00CC\u00C2\u00C7\u00D2\u0000\u00D9\u00CD\u00C3\u00C8\u00DB\u00D3\u0000\u00D8\u00CE\u00C4\u00C9\u00D4\u0000\u0000\u00BA\u00EA\u00E0\u00E5\u00FA\u00F0\u00F7\u00F6\u00F5\u00EB\u00E1\u00E6\u00F1\u00EC\u00E2\u00E7\u00F2\u0000\u00F9\u00ED\u00E3\u00E8\u00FB\u00F3\u0000\u00F8\u00EE\u00E4\u00E9\u00F4\u0000\u0000\u00EF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x5F && input <= 0x7F) return input - 0x5F + 0x5F;
			if (input >= 0xA1 && input <= 0xFF) return GETOUTPUT0_A1[input - 0xA1];
			if (input >= 0x2550 && input <= 0x2577) return CommonSubtables.COMMON1211[input - 0x2550];
			switch (input) {
			case 0x5E: return 0xB4L;
			case 0x178: return 0xCFL;
			case 0x192: return 0xB0L;
			case 0x2C6: return 0xB4L;
			case 0x2020: return 0xA7L;
			case 0x2022: return 0xBCL;
			case 0x2030: return 0xB5L;
			case 0x20A7: return 0xADL;
			case 0x2122: return 0xBFL;
			case 0x215B: return 0xB6L;
			case 0x215C: return 0xB7L;
			case 0x215D: return 0xB8L;
			case 0x215E: return 0xB9L;
			case 0x2191: return 0x5EL;
			case 0x21D0: return 0xFDL;
			case 0x21D2: return 0xFCL;
			case 0x21D4: return 0xFEL;
			case 0x2243: return 0xDFL;
			case 0x2260: return 0xDEL;
			case 0x2261: return 0xFF01L;
			case 0x2264: return 0xDDL;
			case 0x2265: return 0xDCL;
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
			case 0x25A0: return 0x80L;
			case 0x25CB: return 0xBBL;
			case 0x25CF: return 0xBCL;
			case 0x25E6: return 0xBBL;
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
