package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSharpsciiMz80kEuCharset extends Charset {
	public XSharpsciiMz80kEuCharset() {
		super("x-sharpscii-mz80k-eu", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSharpsciiMz80kEuCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSharpsciiMz80kEuCharsetEncoder(this);
	}

	private static final class XSharpsciiMz80kEuCharsetDecoder extends TableCharsetDecoder {
		private XSharpsciiMz80kEuCharsetDecoder(Charset cs) {
			super(cs, 1.30078f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_5E = getOutput0_5E();
		private static final long[] getOutput0_5E() {
			return new long[] {
				0x2191L, 0x2190L, 0xDCFBD833L, 0xDC01D833L, 0xDC00D833L, 0xDFC5D83EL, 0xDC02D833L, 0xDC03D833L, 0xDC04D833L, 0xDC6FD833L, 0xFE0EDE10D83DL, 0xDCFAD833L, 0xDC0FD833L, 0xDC0ED833L, 0xDC10D833L, 0xDC11D833L,
				0xDC13D833L, 0xDC14D833L, 0x2592L, 0xDF8DD83EL, 0xDF8CD83EL, 0xDF8ED83EL, 0xDF8FD83EL, 0xDF9CD83EL, 0xDF9DD83EL, 0xDF9FD83EL, 0xDF9ED83EL, 0xDFD4D83EL, 0xDFD5D83EL, 0xB0L, 0x2428L, 0xDFD6D83EL,
				0xDFD7D83EL, 0xDCB3D83EL, 0x20L, 0x253CL, 0xDC31D833L, 0xDC35D833L, 0xDC39D833L, 0xDC3DD833L, 0xDC38D833L, 0xDC32D833L, 0xDC36D833L, 0xDC3AD833L, 0xDC3ED833L, 0xDCFCD833L, 0xDC33D833L, 0xDC37D833L,
				0xDC3BD833L, 0xDC3FD833L, 0xDC41D83DL, 0xDC42D833L, 0x65L, 0xDF99D83EL, 0xDF98D83EL, 0xDC43D833L, 0x74L, 0x67L, 0x68L, 0xDC30D833L, 0x62L, 0x78L, 0x64L, 0x72L,
				0x70L, 0x63L, 0x71L, 0x61L, 0x7AL, 0x77L, 0x73L, 0x75L, 0x69L, 0xDC40D833L, 0xD6L, 0x6BL, 0x66L, 0x76L, 0xDC41D833L, 0xFCL,
				0xDFL, 0x6AL, 0x6EL, 0xDC34D833L, 0xDCL, 0x6DL, 0xDFD0D83EL, 0xDFD1D83EL, 0xDFD2D83EL, 0x6FL, 0x6CL, 0xC4L, 0xF6L, 0xE4L, 0xDFD3D83EL, 0x79L,
				0xA5L, 0xDC3CD833L, 0x20L, 0x2590L, 0x2584L, 0x2594L, 0x2581L, 0x258FL, 0x2192L, 0x2595L, 0x2588L, 0x25E4L, 0xDF87D83EL, 0x251CL, 0x25D8L, 0x2514L,
				0x2510L, 0x2582L, 0x250CL, 0x2534L, 0x252CL, 0x2524L, 0x258EL, 0x258CL, 0xDF88D83EL, 0xDF82D83EL, 0x2580L, 0x2583L, 0xDF7FD83EL, 0x256DL, 0x256EL, 0x2518L,
				0x259EL, 0x259AL, 0xDF79D83EL, 0x2660L, 0xDF72D83EL, 0xDF78D83EL, 0xDF77D83EL, 0xDF76D83EL, 0xDF7AD83EL, 0xDF71D83EL, 0xDF74D83EL, 0x25E3L, 0x2570L, 0x256FL, 0xDF7CD83EL, 0x2572L,
				0x2571L, 0xDF7DD83EL, 0xDF7ED83EL, 0x25CFL, 0xDF7BD83EL, 0x2665L, 0xDF70D83EL, 0x25E2L, 0x2573L, 0x25CBL, 0x2663L, 0xDF75D83EL, 0x2666L, 0xA3L, 0x2193L, 0xDF73D83EL,
				0x25E5L, 0x3C0L,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x5E && input <= 0xFF) return GETOUTPUT0_5E[input - 0x5E];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XSharpsciiMz80kEuCharsetEncoder extends TableCharsetEncoder {
		private XSharpsciiMz80kEuCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			case 0xD83D: return 0x2;
			case 0xD83E: return 0x4;
			}
			return 0;
		}
		private int getNextState2(int input) {
			switch (input) {
			case 0xDE10: return 0x3;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 2: return getNextState2(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x21 && input <= 0x5D) return input - 0x21 + 0x21;
			if (input >= 0x61 && input <= 0x7A) return CommonSubtables.COMMON1725[input - 0x61];
			if (input >= 0x256D && input <= 0x259E) return CommonSubtables.COMMON1716[input - 0x256D];
			if (input >= 0xFF01 && input <= 0xFF3D) return input - 0xFF01 + 0x21;
			if (input >= 0xFF41 && input <= 0xFF5A) return CommonSubtables.COMMON1725[input - 0xFF41];
			switch (input) {
			case 0x20: return 0xC0L;
			case 0xA3: return 0xFBL;
			case 0xA5: return 0xBEL;
			case 0xB0: return 0x7BL;
			case 0xC4: return 0xB9L;
			case 0xD6: return 0xA8L;
			case 0xDC: return 0xB2L;
			case 0xDF: return 0xAEL;
			case 0xE4: return 0xBBL;
			case 0xF6: return 0xBAL;
			case 0xFC: return 0xADL;
			case 0x3C0: return 0xFF01L;
			case 0x2022: return 0xF1L;
			case 0x2190: return 0x5FL;
			case 0x2191: return 0x5EL;
			case 0x2192: return 0xC6L;
			case 0x2193: return 0xFCL;
			case 0x2428: return 0x7CL;
			case 0x2500: return 0xE0L;
			case 0x2502: return 0xFDL;
			case 0x250C: return 0xD0L;
			case 0x2510: return 0xCEL;
			case 0x2514: return 0xCDL;
			case 0x2518: return 0xDDL;
			case 0x251C: return 0xCBL;
			case 0x2524: return 0xD3L;
			case 0x252C: return 0xD2L;
			case 0x2534: return 0xD1L;
			case 0x253C: return 0x81L;
			case 0x25CB: return 0xF7L;
			case 0x25CF: return 0xF1L;
			case 0x25D8: return 0xCCL;
			case 0x25E2: return 0xF5L;
			case 0x25E3: return 0xE9L;
			case 0x25E4: return 0xC9L;
			case 0x25E5: return 0xFEL;
			case 0x25E6: return 0xF7L;
			case 0x2660: return 0xE1L;
			case 0x2663: return 0xF8L;
			case 0x2665: return 0xF3L;
			case 0x2666: return 0xFAL;
			case 0xFFE1: return 0xFBL;
			case 0xFFE5: return 0xBEL;
			case 0xFFE8: return 0xFDL;
			case 0xFFE9: return 0x5FL;
			case 0xFFEA: return 0x5EL;
			case 0xFFEB: return 0xC6L;
			case 0xFFEC: return 0xFCL;
			case 0xFFEE: return 0xF7L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDC30 && input <= 0xDC43) return CommonSubtables.COMMON1717[input - 0xDC30];
			switch (input) {
			case 0xDC00: return 0x62L;
			case 0xDC01: return 0x61L;
			case 0xDC02: return 0x64L;
			case 0xDC03: return 0x65L;
			case 0xDC04: return 0x66L;
			case 0xDC0E: return 0x6BL;
			case 0xDC0F: return 0x6AL;
			case 0xDC10: return 0x6CL;
			case 0xDC11: return 0x6DL;
			case 0xDC13: return 0x6EL;
			case 0xDC14: return 0x6FL;
			case 0xDC6F: return 0x67L;
			case 0xDCFA: return 0x69L;
			case 0xDCFB: return 0x60L;
			case 0xDCFC: return 0x8BL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDC0D: return 0x69L;
			case 0xDC41: return 0x90L;
			case 0xDC43: return 0x8BL;
			case 0xDE10: return 0x68L;
			case 0xDEF8: return 0x60L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xFE0E: return 0x68L;
			case 0xFE0F: return 0x68L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT4_DF70 = getOutput4_DF70();
		private static final char[] getOutput4_DF70() {
			return "\u00F4\u00E7\u00E2\u00FD\u00E8\u00F9\u00E5\u00E4\u00E3\u00E0\u00E6\u00F2\u00EC\u00EF\u00F0\u00DA\u0000\u0000\u00D7\u0000\u0000\u0000\u0000\u00CA\u00D6\u0000\u0000\u0000rqst\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0094\u0093\u0000\u0000uvxw".toCharArray();
		}
		private long getOutput4(int input) {
			if (input >= 0xDF70 && input <= 0xDF9F) return GETOUTPUT4_DF70[input - 0xDF70];
			switch (input) {
			case 0xDCB3: return 0x7FL;
			case 0xDFC5: return 0x63L;
			case 0xDFD0: return 0xB4L;
			case 0xDFD1: return 0xB5L;
			case 0xDFD2: return 0xB6L;
			case 0xDFD3: return 0xBCL;
			case 0xDFD4: return 0x79L;
			case 0xDFD5: return 0x7AL;
			case 0xDFD6: return 0x7DL;
			case 0xDFD7: return 0x7EL;
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
			default: return 0;
			}
		}
	}
}
