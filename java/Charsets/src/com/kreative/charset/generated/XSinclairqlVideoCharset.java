package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSinclairqlVideoCharset extends Charset {
	public XSinclairqlVideoCharset() {
		super("x-sinclairql-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSinclairqlVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSinclairqlVideoCharsetEncoder(this);
	}

	private static final class XSinclairqlVideoCharsetDecoder extends TableCharsetDecoder {
		private XSinclairqlVideoCharsetDecoder(Charset cs) {
			super(cs, 1.02344f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0xFFFE, 0xDC31DBBF, 0xDC32DBBF, 0xDC33DBBF, 0xDC34DBBF, 0xDC35DBBF, 0x2406, 0x266A, 0x2408, 0x2409, 0xA, 0x240B, 0x240C, 0x240D, 0x240E, 0x240F,
				0x2070, 0xB9, 0xB2, 0xB3, 0x2074, 0x2075, 0x2076, 0x2077, 0x2078, 0x2079, 0x1D2C, 0x1D2E, 0xA7F2, 0x1D30, 0x1D31, 0xA7F3,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0x7F && input <= 0xFF) return CommonSubtables.COMMON1730[input - 0x7F];
			switch (input) {
			case 0x60: return 0xA3L;
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

	private static final class XSinclairqlVideoCharsetEncoder extends TableCharsetEncoder {
		private XSinclairqlVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xDBBC: return 0x1;
			case 0xDBBF: return 0x2;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00B3\u009D`\u00B7\u009E\u00EA\u00B6\u0000\u007F\u0000\u00B8\u0000\u0000\u00D2\u0000\u00BA\u00D9\u0012\u0013\u0000\u0000\u0000\u0000\u0000\u0011\u0000\u00B9\u00EC\u00ED\u00EE\u00B4\u0000\u0000\u0000\u00A1\u00A0\u00A2\u00AA\u00A8\u0000\u00A3\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A9\u0000\u0000\u0000\u00A5\u00A4\u0000\u00A6\u0000\u0000\u0000\u00A7\u0000\u0000\u009C\u008D\u008C\u008E\u0081\u0080\u0082\u008A\u0088\u0090\u0083\u0091\u008F\u0094\u0093\u0095\u0092\u0000\u0089\u0097\u0096\u0098\u0085\u0084\u00BB\u0086\u009A\u0099\u009B\u0087".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0xA1 && input <= 0xFC) return GETOUTPUT0_A1[input - 0xA1];
			if (input >= 0x393 && input <= 0x3D5) return CommonSubtables.COMMON1731[input - 0x393];
			switch (input) {
			case 0x0: return 0x1L;
			case 0xA: return 0xAL;
			case 0x60: return 0x9FL;
			case 0x127: return 0xE8L;
			case 0x152: return 0xABL;
			case 0x153: return 0x8BL;
			case 0x1D2C: return 0x1AL;
			case 0x1D2E: return 0x1BL;
			case 0x1D30: return 0x1DL;
			case 0x1D31: return 0x1EL;
			case 0x1D43: return 0x1AL;
			case 0x1D47: return 0x1BL;
			case 0x1D48: return 0x1DL;
			case 0x1D49: return 0x1EL;
			case 0x1D9C: return 0x1CL;
			case 0x1DA0: return 0x1FL;
			case 0x2020: return 0xD6L;
			case 0x2021: return 0xD7L;
			case 0x2022: return 0xE2L;
			case 0x2026: return 0xF9L;
			case 0x2070: return 0x10L;
			case 0x2074: return 0x14L;
			case 0x2075: return 0x15L;
			case 0x2076: return 0x16L;
			case 0x2077: return 0x17L;
			case 0x2078: return 0x18L;
			case 0x2079: return 0x19L;
			case 0x20A3: return 0xE6L;
			case 0x2190: return 0xBCL;
			case 0x2191: return 0xBEL;
			case 0x2192: return 0xBDL;
			case 0x2193: return 0xBFL;
			case 0x2196: return 0xC0L;
			case 0x2197: return 0xC1L;
			case 0x2198: return 0xC3L;
			case 0x2199: return 0xC2L;
			case 0x21D2: return 0xF1L;
			case 0x2202: return 0xE4L;
			case 0x2206: return 0xC4L;
			case 0x2207: return 0xCDL;
			case 0x221A: return 0xF6L;
			case 0x221B: return 0xF7L;
			case 0x221E: return 0xCEL;
			case 0x2248: return 0xDFL;
			case 0x2260: return 0xDDL;
			case 0x2261: return 0xDBL;
			case 0x2264: return 0xDCL;
			case 0x2265: return 0xDEL;
			case 0x2320: return 0xFBL;
			case 0x2321: return 0xFDL;
			case 0x23AE: return 0xFCL;
			case 0x2406: return 0x601L;
			case 0x2408: return 0x8L;
			case 0x2409: return 0x9L;
			case 0x240B: return 0xBL;
			case 0x240C: return 0xCL;
			case 0x240D: return 0xDL;
			case 0x240E: return 0xEL;
			case 0x240F: return 0xFL;
			case 0x2591: return 0xFEL;
			case 0x2592: return 0xFF01L;
			case 0x25A0: return 0xE1L;
			case 0x25A1: return 0xE0L;
			case 0x25CF: return 0xE2L;
			case 0x2660: return 0xC8L;
			case 0x2663: return 0xCBL;
			case 0x2665: return 0xC9L;
			case 0x2666: return 0xCAL;
			case 0x266A: return 0x701L;
			case 0xA7F2: return 0x1CL;
			case 0xA7F3: return 0x1FL;
			case 0xF7F1: return 0x101L;
			case 0xF7F2: return 0x201L;
			case 0xF7F3: return 0x301L;
			case 0xF7F4: return 0x401L;
			case 0xF7F5: return 0x501L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDD42: return 0xB5L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDC21: return 0xB5L;
			case 0xDC2F: return 0xB5L;
			case 0xDC31: return 0x101L;
			case 0xDC32: return 0x201L;
			case 0xDC33: return 0x301L;
			case 0xDC34: return 0x401L;
			case 0xDC35: return 0x501L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			default: return 0;
			}
		}
	}
}
