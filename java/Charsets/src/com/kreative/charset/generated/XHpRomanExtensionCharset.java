package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XHpRomanExtensionCharset extends Charset {
	public XHpRomanExtensionCharset() {
		super("x-hp-roman-extension", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XHpRomanExtensionCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XHpRomanExtensionCharsetEncoder(this);
	}

	private static final class XHpRomanExtensionCharsetDecoder extends TableCharsetDecoder {
		private XHpRomanExtensionCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A8 = getOutput0_A8();
		private static final char[] getOutput0_A8() {
			return "\u00B4\u02CB\u0000\u00A8\u02DC\u0000\u0000\u20A4\u00AF\u0000\u0000\u00B0\u0000\u00E7\u00D1\u00F1\u00A1\u00BF\u00A4\u00A3\u0000\u00A7\u0000\u0000\u00E2\u00EA\u00F4\u00FB\u00E1\u00E9\u00F3\u00FA\u00E0\u00E8\u00F2\u00F9\u00E4\u00EB\u00F6\u00FC\u00C5\u00EE\u00D8\u00C6\u00E5\u00ED\u00F8\u00E6\u00C4\u00EC\u00D6\u00DC\u00C9\u00EF\u00DF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x9F) return input - 0x20 + 0x20;
			if (input >= 0xA8 && input <= 0xDE) return GETOUTPUT0_A8[input - 0xA8];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XHpRomanExtensionCharsetEncoder extends TableCharsetEncoder {
		private XHpRomanExtensionCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00B8\u0000\u00BB\u00BA\u0000\u0000\u00BD\u00AB\u0000\u0000\u0000\u0000\u0000\u0000\u00B0\u00B3\u0000\u0000\u0000\u00A8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00B9\u0000\u0000\u0000\u0000\u00D8\u00D0\u00D3\u0000\u0000\u00DC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00B6\u0000\u0000\u0000\u0000\u00DA\u0000\u00D2\u0000\u0000\u0000\u00DB\u0000\u0000\u00DE\u00C8\u00C4\u00C0\u0000\u00CC\u00D4\u00D7\u00B5\u00C9\u00C5\u00C1\u00CD\u00D9\u00D5\u00D1\u00DD\u0000\u00B7\u00CA\u00C6\u00C2\u0000\u00CE\u0000\u00D6\u00CB\u00C7\u00C3\u00CF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x9F) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFC) return GETOUTPUT0_A1[input - 0xA1];
			switch (input) {
			case 0x2CA: return 0xA8L;
			case 0x2CB: return 0xA9L;
			case 0x2DA: return 0xB3L;
			case 0x2DC: return 0xACL;
			case 0x203E: return 0xB0L;
			case 0x20A4: return 0xAFL;
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
