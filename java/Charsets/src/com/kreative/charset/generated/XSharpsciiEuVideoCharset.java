package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSharpsciiEuVideoCharset extends Charset {
	public XSharpsciiEuVideoCharset() {
		super("x-sharpscii-eu-video", new String[]{"x-sharpscii-mz700-eu-video", "x-sharpscii-mz800-eu-video"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSharpsciiEuVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSharpsciiEuVideoCharsetEncoder(this);
	}

	private static final class XSharpsciiEuVideoCharsetDecoder extends TableCharsetDecoder {
		private XSharpsciiEuVideoCharsetDecoder(Charset cs) {
			super(cs, 1.40625f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_9B = getOutput0_9B();
		private static final long[] getOutput0_9B() {
			return new long[] {
				0xE4L, 0xDC30D833L, 0xDC31D833L, 0xDC32D833L, 0xDC33D833L, 0xDFD3D83EL, 0xDC40D833L, 0xDC41D833L, 0xDC42D833L, 0x60L, 0x7EL, 0xDC43D833L, 0xDFD0D83EL, 0xDFD1D83EL, 0xDFD2D83EL, 0xDFL,
				0xFCL, 0xF6L, 0xDCL, 0xC4L, 0xD6L, 0xDC34D833L, 0xDC35D833L, 0xDC36D833L, 0xDC37D833L, 0xDC38D833L, 0xDC39D833L, 0xDC3AD833L, 0xDC3BD833L, 0xDC3CD833L, 0xDC3DD833L, 0xDC3ED833L,
				0xDC3FD833L, 0x7BL, 0x253CL, 0x5EL, 0x5FL, 0xDCB3D83EL, 0xDCB7D83EL, 0xDCB5D83EL, 0xDCB6D83EL, 0xDCB4D83EL, 0xDD77D83CL, 0xDD72D83CL, 0xDCFBD833L, 0xDC01D833L, 0xDC00D833L, 0xDFC5D83EL,
				0xDC02D833L, 0xDC03D833L, 0xDC04D833L, 0xDC6FD833L, 0xFE0EDE10D83DL, 0x2592L, 0xDF8DD83EL, 0xDF8CD83EL, 0xDF8ED83EL, 0xDF8FD83EL, 0xDF9CD83EL, 0xDF9DD83EL, 0xDF9FD83EL, 0xDF9ED83EL, 0xDFD4D83EL, 0xDFD5D83EL,
				0xB0L, 0x2428L, 0xDFD6D83EL, 0xDFD7D83EL, 0xDCFAD833L, 0xDC05D833L, 0xDC06D833L, 0xDC07D833L, 0xDC09D833L, 0xDC0BD833L, 0xDF99D83EL, 0xDC0DD833L, 0xDC0FD833L, 0xDC0ED833L, 0xDC10D833L, 0xDC11D833L,
				0xDC12D833L, 0xDC13D833L, 0xDC14D833L, 0xDC0AD833L, 0xDF90D83EL, 0xA0L, 0xDC21D833L, 0xDC22D833L, 0xDC23D833L, 0xDC24D833L, 0xDC25D833L, 0xDC26D833L, 0xDC27D833L, 0xDC28D833L, 0xDC29D833L, 0xDC2AD833L,
				0xDC2BD833L, 0xDC2CD833L, 0xDC2DD833L, 0xDC2ED833L, 0xDC2FD833L,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x1 && input <= 0x1A) return input - 0x1 + 0x41;
			if (input >= 0x81 && input <= 0x9A) return input - 0x81 + 0x61;
			if (input >= 0x1B && input <= 0x80) return CommonSubtables.COMMON1723[input - 0x1B];
			if (input >= 0x9B && input <= 0xFF) return GETOUTPUT0_9B[input - 0x9B];
			switch (input) {
			case 0x0: return 0x20L;
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

	private static final class XSharpsciiEuVideoCharsetEncoder extends TableCharsetEncoder {
		private XSharpsciiEuVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{73}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			case 0xD83C: return 0x2;
			case 0xD83D: return 0x3;
			case 0xD83E: return 0x5;
			}
			return 0;
		}
		private int getNextState3(int input) {
			switch (input) {
			case 0xDE10: return 0x4;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 3: return getNextState3(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x48 && input <= 0x5A) return input - 0x48 + 0x8;
			if (input >= 0x20 && input <= 0x47) return CommonSubtables.COMMON1724[input - 0x20];
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x81;
			if (input >= 0x256D && input <= 0x259E) return CommonSubtables.COMMON1725[input - 0x256D];
			if (input >= 0xFF28 && input <= 0xFF3A) return input - 0xFF28 + 0x8;
			if (input >= 0xFF01 && input <= 0xFF27) return CommonSubtables.COMMON1726[input - 0xFF01];
			if (input >= 0xFF41 && input <= 0xFF5A) return input - 0xFF41 + 0x81;
			switch (input) {
			case 0x5B: return 0x52L;
			case 0x5C: return 0x59L;
			case 0x5D: return 0x54L;
			case 0x5E: return 0xBEL;
			case 0x5F: return 0xBFL;
			case 0x60: return 0xA4L;
			case 0x7B: return 0xBCL;
			case 0x7C: return 0x80L;
			case 0x7D: return 0x40L;
			case 0x7E: return 0xA5L;
			case 0xA0: return 0xF0L;
			case 0xA3: return 0x1BL;
			case 0xB0: return 0xDBL;
			case 0xC4: return 0xAEL;
			case 0xD6: return 0xAFL;
			case 0xDC: return 0xADL;
			case 0xDF: return 0xAAL;
			case 0xE4: return 0x9BL;
			case 0xF6: return 0xACL;
			case 0xFC: return 0xABL;
			case 0x3C0: return 0x60L;
			case 0x2022: return 0x47L;
			case 0x2190: return 0x45L;
			case 0x2191: return 0x50L;
			case 0x2192: return 0x5AL;
			case 0x2193: return 0x58L;
			case 0x2428: return 0xDCL;
			case 0x2500: return 0x78L;
			case 0x2502: return 0x79L;
			case 0x250C: return 0x5CL;
			case 0x2510: return 0x5DL;
			case 0x2514: return 0x1CL;
			case 0x2518: return 0x1DL;
			case 0x251C: return 0x1EL;
			case 0x2524: return 0x5EL;
			case 0x252C: return 0x5FL;
			case 0x2534: return 0x1FL;
			case 0x253C: return 0xBDL;
			case 0x25CB: return 0x48L;
			case 0x25CF: return 0x47L;
			case 0x25D8: return 0x4AL;
			case 0x25E2: return 0x4EL;
			case 0x25E3: return 0x4DL;
			case 0x25E4: return 0x56L;
			case 0x25E5: return 0x42L;
			case 0x25E6: return 0x48L;
			case 0x2660: return 0x41L;
			case 0x2663: return 0x46L;
			case 0x2665: return 0x53L;
			case 0x2666: return 0x44L;
			case 0xFF3B: return 0x52L;
			case 0xFF3C: return 0x59L;
			case 0xFF3D: return 0x54L;
			case 0xFF3E: return 0xBEL;
			case 0xFF3F: return 0xBFL;
			case 0xFF40: return 0xA4L;
			case 0xFF5B: return 0xBCL;
			case 0xFF5C: return 0x80L;
			case 0xFF5D: return 0x40L;
			case 0xFF5E: return 0xA5L;
			case 0xFFE1: return 0x1BL;
			case 0xFFE8: return 0x79L;
			case 0xFFE9: return 0x45L;
			case 0xFFEA: return 0x50L;
			case 0xFFEB: return 0x5AL;
			case 0xFFEC: return 0x58L;
			case 0xFFEE: return 0x48L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDC00 && input <= 0xDC43) return CommonSubtables.COMMON1727[input - 0xDC00];
			switch (input) {
			case 0xDC6F: return 0xCEL;
			case 0xDCFA: return 0xDFL;
			case 0xDCFB: return 0xC7L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDD72: return 0xC6L;
			case 0xDD77: return 0xC5L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xDC0D: return 0xDFL;
			case 0xDE10: return 0xCFL;
			case 0xDEF8: return 0xC7L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xFE0E: return 0xCFL;
			case 0xFE0F: return 0xCFL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT5_DF70 = getOutput5_DF70();
		private static final char[] getOutput5_DF70() {
			return "1u5y9}0t4x8|2rs3\u0000\u00006\u0000\u0000\u0000\u0000?\u007F\u0000\u0000\u0000\u00D2\u00D1\u00D3\u00D4\u00EF\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00E5\u0000\u0000\u00D5\u00D6\u00D8\u00D7".toCharArray();
		}
		private long getOutput5(int input) {
			if (input >= 0xDF70 && input <= 0xDF9F) return GETOUTPUT5_DF70[input - 0xDF70];
			switch (input) {
			case 0xDCB3: return 0xC0L;
			case 0xDCB4: return 0xC4L;
			case 0xDCB5: return 0xC2L;
			case 0xDCB6: return 0xC3L;
			case 0xDCB7: return 0xC1L;
			case 0xDFC5: return 0xCAL;
			case 0xDFD0: return 0xA7L;
			case 0xDFD1: return 0xA8L;
			case 0xDFD2: return 0xA9L;
			case 0xDFD3: return 0xA0L;
			case 0xDFD4: return 0xD9L;
			case 0xDFD5: return 0xDAL;
			case 0xDFD6: return 0xDDL;
			case 0xDFD7: return 0xDEL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 3: return getOutput3(input);
			case 4: return getOutput4(input);
			case 5: return getOutput5(input);
			default: return 0;
			}
		}
	}
}
