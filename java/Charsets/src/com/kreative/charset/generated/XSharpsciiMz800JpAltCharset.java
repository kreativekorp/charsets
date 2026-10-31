package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSharpsciiMz800JpAltCharset extends Charset {
	public XSharpsciiMz800JpAltCharset() {
		super("x-sharpscii-mz800-jp-alt", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSharpsciiMz800JpAltCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSharpsciiMz800JpAltCharsetEncoder(this);
	}

	private static final class XSharpsciiMz800JpAltCharsetDecoder extends TableCharsetDecoder {
		private XSharpsciiMz800JpAltCharsetDecoder(Charset cs) {
			super(cs, 1.15625f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_5B = getOutput0_5B();
		private static final long[] getOutput0_5B() {
			return new long[] {
				0x5BL, 0x5CL, 0x5DL, 0x2191L, 0x2190L, 0xDCFBD833L, 0xDC01D833L, 0xDC00D833L, 0xDFC5D83EL, 0xDC02D833L, 0xDC03D833L, 0xDC04D833L, 0xDC6FD833L, 0xFE0EDE10D83DL, 0xDCFAD833L, 0xDC0FD833L,
				0xDC0ED833L, 0xDC0CD833L, 0xDC10D833L, 0xDC13D833L, 0xDC14D833L, 0x65E5L, 0x6708L, 0x706BL, 0x6C34L, 0x6728L, 0x91D1L, 0x571FL, 0x751FL, 0x5E74L, 0x6642L, 0x5206L,
				0x79D2L, 0x5186L, 0xA5L, 0xA3L, 0xDCB3D83EL, 0x2193L, 0x3002L, 0x300CL, 0x300DL, 0x3001L, 0x30FBL, 0x3092L, 0x3041L, 0x3043L, 0x3045L, 0x3047L,
				0x3049L, 0x3083L, 0x3085L, 0x3087L, 0x3063L, 0x30FCL, 0x3042L, 0x3044L, 0x3046L, 0x3048L, 0x304AL, 0x304BL, 0x304DL, 0x304FL, 0x3051L, 0x3053L,
				0x3055L, 0x3057L, 0x3059L, 0x305BL, 0x305DL, 0x305FL, 0x3061L, 0x3064L, 0x3066L, 0x3068L, 0x306AL, 0x306BL, 0x306CL, 0x306DL, 0x306EL, 0x306FL,
				0x3072L, 0x3075L, 0x3078L, 0x307BL, 0x307EL, 0x307FL, 0x3080L, 0x3081L, 0x3082L, 0x3084L, 0x3086L, 0x3088L, 0x3089L, 0x308AL, 0x308BL, 0x308CL,
				0x308DL, 0x308FL, 0x3093L, 0x309BL, 0x309CL, 0x2192L, 0x2590L, 0x2584L, 0x2594L, 0x2581L, 0x258FL, 0x2592L, 0x2595L, 0x2588L, 0x25E4L, 0xDF87D83EL,
				0x251CL, 0x25D8L, 0x2514L, 0x2510L, 0x2582L, 0x250CL, 0x2534L, 0x252CL, 0x2524L, 0x258EL, 0x258CL, 0xDF88D83EL, 0xDF82D83EL, 0x2580L, 0x2583L, 0xDF7FD83EL,
				0x256DL, 0x256EL, 0x2518L, 0x259EL, 0x259AL, 0xDF79D83EL, 0x2660L, 0xDF72D83EL, 0xDF78D83EL, 0xDF77D83EL, 0xDF76D83EL, 0xDF7AD83EL, 0xDF71D83EL, 0xDF74D83EL, 0x25E3L, 0x2570L,
				0x256FL, 0xDF7CD83EL, 0xDC20D833L, 0xDC1FD833L, 0xDF7DD83EL, 0xDF7ED83EL, 0x25CFL, 0xDF7BD83EL, 0x2665L, 0xDF70D83EL, 0x25E2L, 0x2573L, 0x25CBL, 0x2663L, 0xDF75D83EL, 0x2666L,
				0x253CL, 0xDF8CD83EL, 0xDF73D83EL, 0x25E5L, 0x3C0L,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x40) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x61;
			if (input >= 0x5B && input <= 0xFF) return GETOUTPUT0_5B[input - 0x5B];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XSharpsciiMz800JpAltCharsetEncoder extends TableCharsetEncoder {
		private XSharpsciiMz800JpAltCharsetEncoder(Charset cs) {
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
			if (input >= 0x256D && input <= 0x259E) return CommonSubtables.COMMON1737[input - 0x256D];
			if (input >= 0x3041 && input <= 0x309C) return CommonSubtables.COMMON1738[input - 0x3041];
			if (input >= 0xFF01 && input <= 0xFF3D) return input - 0xFF01 + 0x21;
			if (input >= 0xFF41 && input <= 0xFF5A) return input - 0xFF41 + 0x41;
			switch (input) {
			case 0xA3: return 0x7EL;
			case 0xA5: return 0x7DL;
			case 0x3C0: return 0xFF01L;
			case 0x2022: return 0xF1L;
			case 0x2190: return 0x5FL;
			case 0x2191: return 0x5EL;
			case 0x2192: return 0xC0L;
			case 0x2193: return 0x80L;
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
			case 0x30FB: return 0x85L;
			case 0x30FC: return 0x90L;
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
			case 0xFF61: return 0x81L;
			case 0xFF62: return 0x82L;
			case 0xFF63: return 0x83L;
			case 0xFF64: return 0x84L;
			case 0xFF65: return 0x85L;
			case 0xFF70: return 0x90L;
			case 0xFFE1: return 0x7EL;
			case 0xFFE5: return 0x7DL;
			case 0xFFE8: return 0xFDL;
			case 0xFFE9: return 0x5FL;
			case 0xFFEA: return 0x5EL;
			case 0xFFEB: return 0xC0L;
			case 0xFFEC: return 0x80L;
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
			case 0xDC0C: return 0x6CL;
			case 0xDC0E: return 0x6BL;
			case 0xDC0F: return 0x6AL;
			case 0xDC10: return 0x6DL;
			case 0xDC13: return 0x6EL;
			case 0xDC14: return 0x6FL;
			case 0xDC1F: return 0xEEL;
			case 0xDC20: return 0xEDL;
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
			if (input >= 0xDF70 && input <= 0xDF8C) return CommonSubtables.COMMON1739[input - 0xDF70];
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
