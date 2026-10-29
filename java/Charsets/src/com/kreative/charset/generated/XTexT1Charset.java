package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTexT1Charset extends Charset {
	public XTexT1Charset() {
		super("x-tex-t1", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTexT1CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTexT1CharsetEncoder(this);
	}

	private static final class XTexT1CharsetDecoder extends TableCharsetDecoder {
		private XTexT1CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "`\u00B4\u02C6\u02DC\u00A8\u02DD\u02DA\u02C7\u02D8\u00AF\u02D9\u00B8\u02DB\u201A\u2039\u203A\u201C\u201D\u201E\u00AB\u00BB\u2013\u2014\u200B\u2080\u0131\u0237\uFB00\uFB01\uFB02\uFB03\uFB04\u2423!\"#$%&\u2019".toCharArray();
		}
		private static final char[] GETOUTPUT0_7F = getOutput0_7F();
		private static final char[] getOutput0_7F() {
			return "\u00AD\u0102\u0104\u0106\u010C\u010E\u011A\u0118\u011E\u0139\u013D\u0141\u0143\u0147\u014A\u0150\u0154\u0158\u015A\u0160\u015E\u0164\u0162\u0170\u016E\u0178\u0179\u017D\u017B\u0132\u0130\u0111\u00A7\u0103\u0105\u0107\u010D\u010F\u011B\u0119\u011F\u013A\u013E\u0142\u0144\u0148\u014B\u0151\u0155\u0159\u015B\u0161\u015F\u0165\u0163\u0171\u016F\u00FF\u017A\u017E\u017C\u0133\u00A1\u00BF\u00A3".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x28 && input <= 0x5F) return input - 0x28 + 0x28;
			if (input >= 0x0 && input <= 0x27) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0xC0 && input <= 0xD6) return input - 0xC0 + 0xC0;
			if (input >= 0x7F && input <= 0xBF) return GETOUTPUT0_7F[input - 0x7F];
			if (input >= 0xE0 && input <= 0xF6) return input - 0xE0 + 0xE0;
			switch (input) {
			case 0x60: return 0x2018L;
			case 0xD7: return 0x152L;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xDD: return 0xDDL;
			case 0xDE: return 0xDEL;
			case 0xDF: return 0x1E9EL;
			case 0xF7: return 0x153L;
			case 0xF8: return 0xF8L;
			case 0xF9: return 0xF9L;
			case 0xFA: return 0xFAL;
			case 0xFB: return 0xFBL;
			case 0xFC: return 0xFCL;
			case 0xFD: return 0xFDL;
			case 0xFE: return 0xFEL;
			case 0xFF: return 0xDFL;
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

	private static final class XTexT1CharsetEncoder extends TableCharsetEncoder {
		private XTexT1CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_F8 = getOutput0_F8();
		private static final char[] getOutput0_F8() {
			return "\u00F8\u00F9\u00FA\u00FB\u00FC\u00FD\u00FE\u00B8\u0000\u0000\u0080\u00A0\u0081\u00A1\u0082\u00A2\u0000\u0000\u0000\u0000\u0083\u00A3\u0084\u00A4\u0000\u009E\u0000\u0000\u0000\u0000\u0000\u0000\u0086\u00A6\u0085\u00A5\u0000\u0000\u0087\u00A7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009D\u0019\u009C\u00BC\u0000\u0000\u0000\u0000\u0000\u0088\u00A8\u0000\u0000\u0089\u00A9\u0000\u0000\u008A\u00AA\u008B\u00AB\u0000\u0000\u008C\u00AC\u0000\u008D\u00AD\u0000\u0000\u0000\u0000\u008E\u00AE\u00D7\u00F7\u008F\u00AF\u0000\u0000\u0090\u00B0\u0091\u00B1\u0000\u0000\u0093\u00B3\u0092\u00B2\u0095\u00B5\u0094\u00B4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0097\u00B7\u0096\u00B6\u0000\u0000\u0000\u0000\u0000\u0000\u0098\u0099\u00B9\u009B\u00BB\u009A\u00BA".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x28 && input <= 0x5F) return input - 0x28 + 0x28;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0xC0 && input <= 0xD6) return input - 0xC0 + 0xC0;
			if (input >= 0xE0 && input <= 0xF6) return input - 0xE0 + 0xE0;
			if (input >= 0xF8 && input <= 0x17E) return GETOUTPUT0_F8[input - 0xF8];
			switch (input) {
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x60: return 0x1L;
			case 0xA1: return 0xBDL;
			case 0xA3: return 0xBFL;
			case 0xA7: return 0x9FL;
			case 0xA8: return 0x401L;
			case 0xAB: return 0x13L;
			case 0xAD: return 0x7FL;
			case 0xAF: return 0x9L;
			case 0xB4: return 0x101L;
			case 0xB8: return 0xBL;
			case 0xBB: return 0x14L;
			case 0xBF: return 0xBEL;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xDD: return 0xDDL;
			case 0xDE: return 0xDEL;
			case 0xDF: return 0xFF01L;
			case 0x237: return 0x1AL;
			case 0x2C6: return 0x201L;
			case 0x2C7: return 0x701L;
			case 0x2D8: return 0x8L;
			case 0x2D9: return 0xAL;
			case 0x2DA: return 0x601L;
			case 0x2DB: return 0xCL;
			case 0x2DC: return 0x301L;
			case 0x2DD: return 0x501L;
			case 0x1E9E: return 0xDFL;
			case 0x200B: return 0x17L;
			case 0x2013: return 0x15L;
			case 0x2014: return 0x16L;
			case 0x2018: return 0x60L;
			case 0x2019: return 0x27L;
			case 0x201A: return 0xDL;
			case 0x201C: return 0x10L;
			case 0x201D: return 0x11L;
			case 0x201E: return 0x12L;
			case 0x2039: return 0xEL;
			case 0x203A: return 0xFL;
			case 0x2080: return 0x18L;
			case 0x2423: return 0x20L;
			case 0xFB00: return 0x1BL;
			case 0xFB01: return 0x1CL;
			case 0xFB02: return 0x1DL;
			case 0xFB03: return 0x1EL;
			case 0xFB04: return 0x1FL;
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
