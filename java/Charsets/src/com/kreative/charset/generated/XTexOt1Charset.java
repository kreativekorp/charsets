package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTexOt1Charset extends Charset {
	public XTexOt1Charset() {
		super("x-tex-ot1", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTexOt1CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTexOt1CharsetEncoder(this);
	}

	private static final class XTexOt1CharsetDecoder extends TableCharsetDecoder {
		private XTexOt1CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\u0393\u0394\u0398\u039B\u039E\u03A0\u03A3\u03A5\u03A6\u03A8\u03A9\uFB00\uFB01\uFB02\uFB03\uFB04\u0131\u0237`\u00B4\u02C7\u02D8\u00AF\u02DA\u00B8\u00DF\u00E6\u0153\u00F8\u00C6\u0152\u00D8\u2044!\u201D#$%&\u2019".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x28 && input <= 0x3B) return input - 0x28 + 0x28;
			if (input >= 0x0 && input <= 0x27) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x3F && input <= 0x5B) return input - 0x3F + 0x3F;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x3C: return 0xA1L;
			case 0x3D: return 0x3DL;
			case 0x3E: return 0xBFL;
			case 0x5C: return 0x201CL;
			case 0x5D: return 0x5DL;
			case 0x5E: return 0x2C6L;
			case 0x5F: return 0x2D9L;
			case 0x60: return 0x2018L;
			case 0x7B: return 0x2013L;
			case 0x7C: return 0x2014L;
			case 0x7D: return 0x2DDL;
			case 0x7E: return 0x2DCL;
			case 0x7F: return 0xA8L;
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

	private static final class XTexOt1CharsetEncoder extends TableCharsetEncoder {
		private XTexOt1CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_391 = getOutput0_391();
		private static final char[] getOutput0_391() {
			return "AB\u0001\u0101EZH\u0201IK\u0301MN\u0401O\u0501P\u0000\u0601T\u0701\bX\t\n".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x28 && input <= 0x3B) return input - 0x28 + 0x28;
			if (input >= 0x3F && input <= 0x5B) return input - 0x3F + 0x3F;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0x391 && input <= 0x3A9) return GETOUTPUT0_391[input - 0x391];
			switch (input) {
			case 0x21: return 0x21L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x3D: return 0x3DL;
			case 0x5D: return 0x5DL;
			case 0x60: return 0x12L;
			case 0xA1: return 0x3CL;
			case 0xA8: return 0x7FL;
			case 0xAF: return 0x16L;
			case 0xB4: return 0x13L;
			case 0xB8: return 0x18L;
			case 0xBF: return 0x3EL;
			case 0xC6: return 0x1DL;
			case 0xD8: return 0x1FL;
			case 0xDF: return 0x19L;
			case 0xE6: return 0x1AL;
			case 0xF8: return 0x1CL;
			case 0x131: return 0x10L;
			case 0x152: return 0x1EL;
			case 0x153: return 0x1BL;
			case 0x237: return 0x11L;
			case 0x2C6: return 0x5EL;
			case 0x2C7: return 0x14L;
			case 0x2D8: return 0x15L;
			case 0x2D9: return 0x5FL;
			case 0x2DA: return 0x17L;
			case 0x2DC: return 0x7EL;
			case 0x2DD: return 0x7DL;
			case 0x2013: return 0x7BL;
			case 0x2014: return 0x7CL;
			case 0x2018: return 0x60L;
			case 0x2019: return 0x27L;
			case 0x201C: return 0x5CL;
			case 0x201D: return 0x22L;
			case 0x2044: return 0x20L;
			case 0xFB00: return 0xBL;
			case 0xFB01: return 0xCL;
			case 0xFB02: return 0xDL;
			case 0xFB03: return 0xEL;
			case 0xFB04: return 0xFL;
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
