package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XWindows1258Charset extends Charset {
	public XWindows1258Charset() {
		super("x-windows-1258", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XWindows1258CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XWindows1258CharsetEncoder(this);
	}

	private static final class XWindows1258CharsetDecoder extends TableCharsetDecoder {
		private XWindows1258CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u20AC\u0000\u201A\u0192\u201E\u2026\u2020\u2021\u02C6\u2030\u0000\u2039\u0152\u0000\u0000\u0000\u0000\u2018\u2019\u201C\u201D\u2022\u2013\u2014\u02DC\u2122\u0000\u203A\u0153\u0000\u0000\u0178".toCharArray();
		}
		private static final char[] GETOUTPUT0_C3 = getOutput0_C3();
		private static final char[] getOutput0_C3() {
			return "\u0102\u00C4\u00C5\u00C6\u00C7\u00C8\u00C9\u00CA\u00CB\u0300\u00CD\u00CE\u00CF\u0110\u00D1\u0309\u00D3\u00D4\u01A0\u00D6\u00D7\u00D8\u00D9\u00DA\u00DB\u00DC\u01AF\u0303\u00DF\u00E0\u00E1\u00E2\u0103\u00E4\u00E5\u00E6\u00E7\u00E8\u00E9\u00EA\u00EB\u0301\u00ED\u00EE\u00EF\u0111\u00F1\u0323\u00F3\u00F4\u01A1\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC\u01B0\u20AB\u00FF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xC2) return input - 0xA0 + 0xA0;
			if (input >= 0x80 && input <= 0x9F) return GETOUTPUT0_80[input - 0x80];
			if (input >= 0xC3 && input <= 0xFF) return GETOUTPUT0_C3[input - 0xC3];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XWindows1258CharsetEncoder extends TableCharsetEncoder {
		private XWindows1258CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_C4 = getOutput0_C4();
		private static final char[] getOutput0_C4() {
			return "\u00C4\u00C5\u00C6\u00C7\u00C8\u00C9\u00CA\u00CB\u0000\u00CD\u00CE\u00CF\u0000\u00D1\u0000\u00D3\u00D4\u0000\u00D6\u00D7\u00D8\u00D9\u00DA\u00DB\u00DC\u0000\u0000\u00DF\u00E0\u00E1\u00E2\u0000\u00E4\u00E5\u00E6\u00E7\u00E8\u00E9\u00EA\u00EB\u0000\u00ED\u00EE\u00EF\u0000\u00F1\u0000\u00F3\u00F4\u0000\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC\u0000\u0000\uFF01\u0000\u0000\u00C3\u00E3\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D0\u00F0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xC2) return input - 0xA0 + 0xA0;
			if (input >= 0xC4 && input <= 0x111) return GETOUTPUT0_C4[input - 0xC4];
			switch (input) {
			case 0x152: return 0x8CL;
			case 0x153: return 0x9CL;
			case 0x178: return 0x9FL;
			case 0x192: return 0x83L;
			case 0x1A0: return 0xD5L;
			case 0x1A1: return 0xF5L;
			case 0x1AF: return 0xDDL;
			case 0x1B0: return 0xFDL;
			case 0x2C6: return 0x88L;
			case 0x2DC: return 0x98L;
			case 0x300: return 0xCCL;
			case 0x301: return 0xECL;
			case 0x303: return 0xDEL;
			case 0x309: return 0xD2L;
			case 0x323: return 0xF2L;
			case 0x2013: return 0x96L;
			case 0x2014: return 0x97L;
			case 0x2018: return 0x91L;
			case 0x2019: return 0x92L;
			case 0x201A: return 0x82L;
			case 0x201C: return 0x93L;
			case 0x201D: return 0x94L;
			case 0x201E: return 0x84L;
			case 0x2020: return 0x86L;
			case 0x2021: return 0x87L;
			case 0x2022: return 0x95L;
			case 0x2026: return 0x85L;
			case 0x2030: return 0x89L;
			case 0x2039: return 0x8BL;
			case 0x203A: return 0x9BL;
			case 0x20AB: return 0xFEL;
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
