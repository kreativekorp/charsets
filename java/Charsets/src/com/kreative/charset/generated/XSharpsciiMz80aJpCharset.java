package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSharpsciiMz80aJpCharset extends Charset {
	public XSharpsciiMz80aJpCharset() {
		super("x-sharpscii-mz80a-jp", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSharpsciiMz80aJpCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSharpsciiMz80aJpCharsetEncoder(this);
	}

	private static final class XSharpsciiMz80aJpCharsetDecoder extends TableCharsetDecoder {
		private XSharpsciiMz80aJpCharsetDecoder(Charset cs) {
			super(cs, 1.14844f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_5E = getOutput0_5E();
		private static final long[] getOutput0_5E() {
			return new long[] {
				0x2191L, 0x2190L, 0xDCFBD833L, 0xDC01D833L, 0xDC00D833L, 0xDFC5D83EL, 0xDC02D833L, 0xDC03D833L, 0xDC04D833L, 0xDC6FD833L, 0xFE0EDE10D83DL, 0xDCFAD833L, 0xDC0FD833L, 0xDC0ED833L, 0xDC10D833L, 0xDC11D833L,
				0xDC13D833L, 0xDC14D833L, 0x65E5L, 0x6708L, 0x706BL, 0x6C34L, 0x6728L, 0x91D1L, 0x571FL, 0x751FL, 0x5E74L, 0x6642L, 0x5206L, 0x79D2L, 0x5186L, 0xA5L,
				0xA3L, 0xDCB3D83EL, 0x2192L, 0x3002L, 0x300CL, 0x300DL, 0x3001L, 0x30FBL, 0x30F2L, 0x30A1L, 0x30A3L, 0x30A5L, 0x30A7L, 0x30A9L, 0x30E3L, 0x30E5L,
				0x30E7L, 0x30C3L, 0x30FCL, 0x30A2L, 0x30A4L, 0x30A6L, 0x30A8L, 0x30AAL, 0x30ABL, 0x30ADL, 0x30AFL, 0x30B1L, 0x30B3L, 0x30B5L, 0x30B7L, 0x30B9L,
				0x30BBL, 0x30BDL, 0x30BFL, 0x30C1L, 0x30C4L, 0x30C6L, 0x30C8L, 0x30CAL, 0x30CBL, 0x30CCL, 0x30CDL, 0x30CEL, 0x30CFL, 0x30D2L, 0x30D5L, 0x30D8L,
				0x30DBL, 0x30DEL, 0x30DFL, 0x30E0L, 0x30E1L, 0x30E2L, 0x30E4L, 0x30E6L, 0x30E8L, 0x30E9L, 0x30EAL, 0x30EBL, 0x30ECL, 0x30EDL, 0x30EFL, 0x30F3L,
				0x309BL, 0x309CL, 0x2193L, 0x2590L, 0x2584L, 0x2594L, 0x2581L, 0x258FL, 0x2592L, 0x2595L, 0x2588L, 0x25E4L, 0xDF87D83EL, 0x251CL, 0x25D8L, 0x2514L,
				0x2510L, 0x2582L, 0x250CL, 0x2534L, 0x252CL, 0x2524L, 0x258EL, 0x258CL, 0xDF88D83EL, 0xDF82D83EL, 0x2580L, 0x2583L, 0xDF7FD83EL, 0x256DL, 0x256EL, 0x2518L,
				0x259EL, 0x259AL, 0xDF79D83EL, 0x2660L, 0xDF72D83EL, 0xDF78D83EL, 0xDF77D83EL, 0xDF76D83EL, 0xDF7AD83EL, 0xDF71D83EL, 0xDF74D83EL, 0x25E3L, 0x2570L, 0x256FL, 0xDF7CD83EL, 0x2572L,
				0x2571L, 0xDF7DD83EL, 0xDF7ED83EL, 0x25CFL, 0xDF7BD83EL, 0x2665L, 0xDF70D83EL, 0x25E2L, 0x2573L, 0x25CBL, 0x2663L, 0xDF75D83EL, 0x2666L, 0x253CL, 0xDF8CD83EL, 0xDF73D83EL,
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

	private static final class XSharpsciiMz80aJpCharsetEncoder extends TableCharsetEncoder {
		private XSharpsciiMz80aJpCharsetEncoder(Charset cs) {
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
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x41;
			if (input >= 0x256D && input <= 0x259E) return CommonSubtables.COMMON1722[input - 0x256D];
			if (input >= 0x309B && input <= 0x30FC) return CommonSubtables.COMMON1723[input - 0x309B];
			if (input >= 0xFF01 && input <= 0xFF3D) return input - 0xFF01 + 0x21;
			if (input >= 0xFF41 && input <= 0xFF5A) return input - 0xFF41 + 0x41;
			if (input >= 0xFF61 && input <= 0xFF9D) return input - 0xFF61 + 0x81;
			switch (input) {
			case 0xA3: return 0x7EL;
			case 0xA5: return 0x7DL;
			case 0x3C0: return 0xFF01L;
			case 0x2022: return 0xF1L;
			case 0x2190: return 0x5FL;
			case 0x2191: return 0x5EL;
			case 0x2192: return 0x80L;
			case 0x2193: return 0xC0L;
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
			case 0x253C: return 0xFBL;
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
			case 0x3001: return 0x84L;
			case 0x3002: return 0x81L;
			case 0x300C: return 0x82L;
			case 0x300D: return 0x83L;
			case 0x5186: return 0x7CL;
			case 0x5206: return 0x7AL;
			case 0x571F: return 0x76L;
			case 0x5E74: return 0x78L;
			case 0x65E5: return 0x70L;
			case 0x6642: return 0x79L;
			case 0x6708: return 0x71L;
			case 0x6728: return 0x74L;
			case 0x6C34: return 0x73L;
			case 0x706B: return 0x72L;
			case 0x751F: return 0x77L;
			case 0x79D2: return 0x7BL;
			case 0x91D1: return 0x75L;
			case 0xFFE1: return 0x7EL;
			case 0xFFE5: return 0x7DL;
			case 0xFFE8: return 0xFDL;
			case 0xFFE9: return 0x5FL;
			case 0xFFEA: return 0x5EL;
			case 0xFFEB: return 0x80L;
			case 0xFFEC: return 0xC0L;
			case 0xFFEE: return 0xF7L;
			}
			return 0;
		}
		private long getOutput1(int input) {
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
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDC0D: return 0x69L;
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
		private long getOutput4(int input) {
			if (input >= 0xDF70 && input <= 0xDF8C) return CommonSubtables.COMMON1721[input - 0xDF70];
			switch (input) {
			case 0xDCB3: return 0x7FL;
			case 0xDFC5: return 0x63L;
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
