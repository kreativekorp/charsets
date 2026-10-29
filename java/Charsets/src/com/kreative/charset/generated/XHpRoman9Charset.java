package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XHpRoman9Charset extends Charset {
	public XHpRoman9Charset() {
		super("x-hp-roman-9", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XHpRoman9CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XHpRoman9CharsetEncoder(this);
	}

	private static final class XHpRoman9CharsetDecoder extends TableCharsetDecoder {
		private XHpRoman9CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00C0\u00C2\u00C8\u00CA\u00CB\u00CE\u00CF\u00B4\u02CB\u02C6\u00A8\u02DC\u00D9\u00DB\u20A4\u00AF\u00DD\u00FD\u00B0\u00C7\u00E7\u00D1\u00F1\u00A1\u00BF\u20AC\u00A3\u00A5\u00A7\u0192\u00A2\u00E2\u00EA\u00F4\u00FB\u00E1\u00E9\u00F3\u00FA\u00E0\u00E8\u00F2\u00F9\u00E4\u00EB\u00F6\u00FC\u00C5\u00EE\u00D8\u00C6\u00E5\u00ED\u00F8\u00E6\u00C4\u00EC\u00D6\u00DC\u00C9\u00EF\u00DF\u00D4\u00C1\u00C3\u00E3\u00D0\u00F0\u00CD\u00CC\u00D3\u00D2\u00D5\u00F5\u0160\u0161\u00DA\u0178\u00FF\u00DE\u00FE\u00B7\u00B5\u00B6\u00BE\u00AD\u00BC\u00BD\u00AA\u00BA\u00AB\u25A0\u00BB\u00B1".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFE) return GETOUTPUT0_A1[input - 0xA1];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XHpRoman9CharsetEncoder extends TableCharsetEncoder {
		private XHpRoman9CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00B8\u00BF\u00BB\u0000\u00BC\u0000\u00BD\u00AB\u0000\u00F9\u00FB\u0000\u00F6\u0000\u00B0\u00B3\u00FE\u0000\u0000\u00A8\u00F3\u00F4\u00F2\u0000\u0000\u00FA\u00FD\u00F7\u00F8\u00F5\u00B9\u00A1\u00E0\u00A2\u00E1\u00D8\u00D0\u00D3\u00B4\u00A3\u00DC\u00A4\u00A5\u00E6\u00E5\u00A6\u00A7\u00E3\u00B6\u00E8\u00E7\u00DF\u00E9\u00DA\u0000\u00D2\u00AD\u00ED\u00AE\u00DB\u00B1\u00F0\u00DE\u00C8\u00C4\u00C0\u00E2\u00CC\u00D4\u00D7\u00B5\u00C9\u00C5\u00C1\u00CD\u00D9\u00D5\u00D1\u00DD\u00E4\u00B7\u00CA\u00C6\u00C2\u00EA\u00CE\u0000\u00D6\u00CB\u00C7\u00C3\u00CF\u00B2\u00F1\u00EF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFF) return GETOUTPUT0_A1[input - 0xA1];
			switch (input) {
			case 0x160: return 0xEBL;
			case 0x161: return 0xECL;
			case 0x178: return 0xEEL;
			case 0x192: return 0xBEL;
			case 0x2C6: return 0xAAL;
			case 0x2CA: return 0xA8L;
			case 0x2CB: return 0xA9L;
			case 0x2DA: return 0xB3L;
			case 0x2DC: return 0xACL;
			case 0x203E: return 0xB0L;
			case 0x20A4: return 0xAFL;
			case 0x20AC: return 0xBAL;
			case 0x25A0: return 0xFCL;
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
