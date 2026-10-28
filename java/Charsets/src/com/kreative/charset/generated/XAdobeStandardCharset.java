package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAdobeStandardCharset extends Charset {
	public XAdobeStandardCharset() {
		super("x-adobe-standard", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAdobeStandardCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAdobeStandardCharsetEncoder(this);
	}

	private static final class XAdobeStandardCharsetDecoder extends TableCharsetDecoder {
		private XAdobeStandardCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00A1\u00A2\u00A3\u2044\u00A5\u0192\u00A7\u00A4\'\u201C\u00AB\u2039\u203A\uFB01\uFB02\u0000\u2013\u2020\u2021\u00B7\u0000\u00B6\u2022\u201A\u201E\u201D\u00BB\u2026\u2030\u0000\u00BF\u0000`\u00B4\u02C6\u02DC\u00AF\u02D8\u02D9\u00A8\u0000\u02DA\u00B8\u0000\u02DD\u02DB\u02C7\u2014\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C6\u0000\u00AA\u0000\u0000\u0000\u0000\u0141\u00D8\u0152\u00BA\u0000\u0000\u0000\u0000\u0000\u00E6\u0000\u0000\u0000\u0131\u0000\u0000\u0142\u00F8\u0153\u00DF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x28 && input <= 0x5F) return input - 0x28 + 0x28;
			if (input >= 0x61 && input <= 0x9F) return input - 0x61 + 0x61;
			if (input >= 0xA1 && input <= 0xFB) return GETOUTPUT0_A1[input - 0xA1];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x27: return 0x2019L;
			case 0x60: return 0x2018L;
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

	private static final class XAdobeStandardCharsetEncoder extends TableCharsetEncoder {
		private XAdobeStandardCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return " \u00A1\u00A2\u00A3\u00A8\u00A5\u0000\u00A7\u00C8\u0000\u00E3\u00AB\u0000\u0000\u0000\u00C5\u0000\u0000\u0000\u0000\u00C2\u0000\u00B6\u00B4\u00CB\u0000\u00EB\u00BB\u0000\u0000\u0000\u00BF\u0000\u0000\u0000\u0000\u0000\u0000\u00E1".toCharArray();
		}
		private static final char[] GETOUTPUT0_2013 = getOutput0_2013();
		private static final char[] getOutput0_2013() {
			return "\u00B1\u00D0\u0000\u0000\u0000`\'\u00B8\u0000\u00AA\u00BA\u00B9\u0000\u00B2\u00B3\u00B7\u0000\u0000\u0000\u00BC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00BD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00AC\u00AD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A4".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x28 && input <= 0x5F) return input - 0x28 + 0x28;
			if (input >= 0x61 && input <= 0x9F) return input - 0x61 + 0x61;
			if (input >= 0xA0 && input <= 0xC6) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x2013 && input <= 0x2044) return GETOUTPUT0_2013[input - 0x2013];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x27: return 0xA9L;
			case 0x60: return 0xC1L;
			case 0xD8: return 0xE9L;
			case 0xDF: return 0xFBL;
			case 0xE6: return 0xF1L;
			case 0xF8: return 0xF9L;
			case 0x131: return 0xF5L;
			case 0x141: return 0xE8L;
			case 0x142: return 0xF8L;
			case 0x152: return 0xEAL;
			case 0x153: return 0xFAL;
			case 0x192: return 0xA6L;
			case 0x2C6: return 0xC3L;
			case 0x2C7: return 0xCFL;
			case 0x2C9: return 0xC5L;
			case 0x2CA: return 0xC2L;
			case 0x2CB: return 0xC1L;
			case 0x2D8: return 0xC6L;
			case 0x2D9: return 0xC7L;
			case 0x2DA: return 0xCAL;
			case 0x2DB: return 0xCEL;
			case 0x2DC: return 0xC4L;
			case 0x2DD: return 0xCDL;
			case 0xFB01: return 0xAEL;
			case 0xFB02: return 0xAFL;
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
