package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XWindows1256Charset extends Charset {
	public XWindows1256Charset() {
		super("x-windows-1256", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XWindows1256CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XWindows1256CharsetEncoder(this);
	}

	private static final class XWindows1256CharsetDecoder extends TableCharsetDecoder {
		private XWindows1256CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u20AC\u067E\u201A\u0192\u201E\u2026\u2020\u2021\u02C6\u2030\u0679\u2039\u0152\u0686\u0698\u0688\u06AF\u2018\u2019\u201C\u201D\u2022\u2013\u2014\u06A9\u2122\u0691\u203A\u0153\u200C\u200D\u06BA\u00A0\u060C\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u06BE\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u061B\u00BB\u00BC\u00BD\u00BE\u061F\u06C1".toCharArray();
		}
		private static final char[] GETOUTPUT0_D7 = getOutput0_D7();
		private static final char[] getOutput0_D7() {
			return "\u00D7\u0637\u0638\u0639\u063A\u0640\u0641\u0642\u0643\u00E0\u0644\u00E2\u0645\u0646\u0647\u0648\u00E7\u00E8\u00E9\u00EA\u00EB\u0649\u064A\u00EE\u00EF\u064B\u064C\u064D\u064E\u00F4\u064F\u0650\u00F7\u0651\u00F9\u0652\u00FB\u00FC\u200E\u200F\u06D2".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xC1 && input <= 0xD6) return input - 0xC1 + 0x621;
			if (input >= 0x80 && input <= 0xC0) return GETOUTPUT0_80[input - 0x80];
			if (input >= 0xD7 && input <= 0xFF) return GETOUTPUT0_D7[input - 0xD7];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XWindows1256CharsetEncoder extends TableCharsetEncoder {
		private XWindows1256CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u00A0\u0000\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u0000\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u0000\u00BB\u00BC\u00BD\u00BE".toCharArray();
		}
		private static final char[] GETOUTPUT0_637 = getOutput0_637();
		private static final char[] getOutput0_637() {
			return "\u00D8\u00D9\u00DA\u00DB\u0000\u0000\u0000\u0000\u0000\u00DC\u00DD\u00DE\u00DF\u00E1\u00E3\u00E4\u00E5\u00E6\u00EC\u00ED\u00F0\u00F1\u00F2\u00F3\u00F5\u00F6\u00F8\u00FA".toCharArray();
		}
		private static final char[] GETOUTPUT0_200C = getOutput0_200C();
		private static final char[] getOutput0_200C() {
			return "\u009D\u009E\u00FD\u00FE\u0000\u0000\u0000\u0096\u0097\u0000\u0000\u0000\u0091\u0092\u0082\u0000\u0093\u0094\u0084\u0000\u0086\u0087\u0095\u0000\u0000\u0000\u0085\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0089\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008B\u009B".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xBE) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x621 && input <= 0x636) return input - 0x621 + 0xC1;
			if (input >= 0x637 && input <= 0x652) return GETOUTPUT0_637[input - 0x637];
			if (input >= 0x200C && input <= 0x203A) return GETOUTPUT0_200C[input - 0x200C];
			switch (input) {
			case 0xD7: return 0xD7L;
			case 0xE0: return 0xE0L;
			case 0xE2: return 0xE2L;
			case 0xE7: return 0xE7L;
			case 0xE8: return 0xE8L;
			case 0xE9: return 0xE9L;
			case 0xEA: return 0xEAL;
			case 0xEB: return 0xEBL;
			case 0xEE: return 0xEEL;
			case 0xEF: return 0xEFL;
			case 0xF4: return 0xF4L;
			case 0xF7: return 0xF7L;
			case 0xF9: return 0xF9L;
			case 0xFB: return 0xFBL;
			case 0xFC: return 0xFCL;
			case 0x152: return 0x8CL;
			case 0x153: return 0x9CL;
			case 0x192: return 0x83L;
			case 0x2C6: return 0x88L;
			case 0x60C: return 0xA1L;
			case 0x61B: return 0xBAL;
			case 0x61F: return 0xBFL;
			case 0x679: return 0x8AL;
			case 0x67E: return 0x81L;
			case 0x686: return 0x8DL;
			case 0x688: return 0x8FL;
			case 0x691: return 0x9AL;
			case 0x698: return 0x8EL;
			case 0x6A9: return 0x98L;
			case 0x6AF: return 0x90L;
			case 0x6BA: return 0x9FL;
			case 0x6BE: return 0xAAL;
			case 0x6C1: return 0xC0L;
			case 0x6D2: return 0xFF01L;
			case 0x20AC: return 0x80L;
			case 0x2122: return 0x99L;
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
