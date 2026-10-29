package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSharpsciiJpVideoCharset extends Charset {
	public XSharpsciiJpVideoCharset() {
		super("x-sharpscii-jp-video", new String[]{"x-sharpscii-mz1500-jp-video", "x-sharpscii-mz700-jp-video", "x-sharpscii-mz800-jp-video", "x-sharpscii-mz80a-jp-video", "x-sharpscii-mz80k-jp-video"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSharpsciiJpVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSharpsciiJpVideoCharsetEncoder(this);
	}

	private static final class XSharpsciiJpVideoCharsetDecoder extends TableCharsetDecoder {
		private XSharpsciiJpVideoCharsetDecoder(Charset cs) {
			super(cs, 1.26953f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_1B = getOutput0_1B();
		private static final long[] getOutput0_1B() {
			return new long[] {
				0x253CL, 0x2514L, 0x2518L, 0x251CL, 0x2534L, 0x30L, 0x31L, 0x32L, 0x33L, 0x34L, 0x35L, 0x36L, 0x37L, 0x38L, 0x39L, 0x2DL,
				0x3DL, 0x3BL, 0x2FL, 0x2EL, 0x2CL, 0xDF76D83EL, 0xDF70D83EL, 0xDF7CD83EL, 0xDF7FD83EL, 0xDF78D83EL, 0xDF72D83EL, 0xDF82D83EL, 0x258EL, 0xDF7AD83EL, 0xDF74D83EL, 0x2584L,
				0x2590L, 0x2581L, 0x2595L, 0x2582L, 0xDF87D83EL, 0x2192L, 0x2660L, 0x25E5L, 0x2588L, 0x2666L, 0x2190L, 0x2663L, 0x25CFL, 0x25CBL, 0x3FL, 0x25D8L,
				0x256DL, 0x256EL, 0x25E3L, 0x25E2L, 0x3AL, 0x2191L, 0x3CL, 0x5BL, 0x2665L, 0x5DL, 0x40L, 0x25E4L, 0x3EL, 0xDF8CD83EL, 0x5CL, 0x2592L,
				0x259AL, 0x250CL, 0x2510L, 0x2524L, 0x252CL, 0x3C0L, 0x21L, 0x22L, 0x23L, 0x24L, 0x25L, 0x26L, 0x27L, 0x28L, 0x29L, 0x2BL,
				0x2AL, 0x259EL, 0x2573L, 0x256FL, 0x2570L, 0x2594L, 0x258FL, 0xDF7DD83EL, 0xDF7ED83EL, 0xDF77D83EL, 0xDF71D83EL, 0x2571L, 0x2572L, 0xDF79D83EL, 0xDF73D83EL, 0x2580L,
				0x258CL, 0xDF7BD83EL, 0xDF75D83EL, 0x2583L, 0xDF88D83EL, 0x2193L, 0x30C1L, 0x30B3L, 0x30BDL, 0x30B7L, 0x30A4L, 0x30CFL, 0x30ADL, 0x30AFL, 0x30CBL, 0x30DEL,
				0x30CEL, 0x30EAL, 0x30E2L, 0x30DFL, 0x30E9L, 0x30BBL, 0x30BFL, 0x30B9L, 0x30C8L, 0x30ABL, 0x30CAL, 0x30D2L, 0x30C6L, 0x30B5L, 0x30F3L, 0x30C4L,
				0x30EDL, 0x30B1L, 0x300CL, 0x30A1L, 0x30E3L, 0x30EFL, 0x30CCL, 0x30D5L, 0x30A2L, 0x30A6L, 0x30A8L, 0x30AAL, 0x30E4L, 0x30E6L, 0x30E8L, 0x30DBL,
				0x30D8L, 0x30ECL, 0x30E1L, 0x30EBL, 0x30CDL, 0x30E0L, 0x300DL, 0x30A3L, 0x30E5L, 0x30F2L, 0x3001L, 0x30A5L, 0x30E7L, 0x309CL, 0x30FBL, 0x30A7L,
				0x30C3L, 0x309BL, 0x3002L, 0x30A9L, 0x30FCL, 0xDCB3D83EL, 0xDCB7D83EL, 0xDCB5D83EL, 0xDCB6D83EL, 0xDCB4D83EL, 0xDD77D83CL, 0xDD72D83CL, 0xDCFBD833L, 0xDC01D833L, 0xDC00D833L, 0xDFC5D83EL,
				0xDC02D833L, 0xDC03D833L, 0xDC04D833L, 0xDC6FD833L, 0xFE0EDE10D83DL, 0x65E5L, 0x6708L, 0x706BL, 0x6C34L, 0x6728L, 0x91D1L, 0x571FL, 0x751FL, 0x5E74L, 0x6642L, 0x5206L,
				0x79D2L, 0x5186L, 0xA5L, 0xA3L, 0xDCFAD833L, 0xDC05D833L, 0xDC06D833L, 0xDC07D833L, 0xDC09D833L, 0xDC0BD833L, 0xDC0CD833L, 0xDC0DD833L, 0xDC0FD833L, 0xDC0ED833L, 0xDC10D833L, 0xDC11D833L,
				0xDC12D833L, 0xDC13D833L, 0xDC14D833L, 0xDC0AD833L, 0xDF90D83EL, 0xA0L, 0xDC21D833L, 0xDC22D833L, 0xDC23D833L, 0xDC24D833L, 0xDC25D833L, 0xDC26D833L, 0xDC27D833L, 0xDC28D833L, 0xDC29D833L, 0xDC2AD833L,
				0xDC2BD833L, 0xDC2CD833L, 0xDC2DD833L, 0xDC2ED833L, 0xDC2FD833L,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x1 && input <= 0x1A) return input - 0x1 + 0x41;
			if (input >= 0x1B && input <= 0xFF) return GETOUTPUT0_1B[input - 0x1B];
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

	private static final class XSharpsciiJpVideoCharsetEncoder extends TableCharsetEncoder {
		private XSharpsciiJpVideoCharsetEncoder(Charset cs) {
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
		private static final char[] GETOUTPUT0_256D = getOutput0_256D();
		private static final char[] getOutput0_256D() {
			return "KLnovwm\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000z<>~:\u0000\u0000\u0000C\u0000\u0000\u0000{\u00007q;\u0000Z\u0000p=\u0000\u0000\u0000\u0000[\u0000\u0000\u0000l".toCharArray();
		}
		private static final char[] GETOUTPUT0_309B = getOutput0_309B();
		private static final char[] getOutput0_309B() {
			return "\u00BC\u00B8\u0000\u0000\u0000\u0000\u009E\u00A3\u00B2\u0085\u00B6\u00A4\u00BA\u00A5\u00BE\u00A6\u0094\u0000\u0087\u0000\u0088\u0000\u009C\u0000\u0082\u0000\u0098\u0000\u0084\u0000\u0092\u0000\u0090\u0000\u0083\u0000\u0091\u0000\u0081\u0000\u00BB\u009A\u0000\u0097\u0000\u0093\u0000\u0095\u0089\u00A1\u00AF\u008B\u0086\u0000\u0000\u0096\u0000\u0000\u00A2\u0000\u0000\u00AB\u0000\u0000\u00AA\u0000\u0000\u008A\u008E\u00B0\u00AD\u008D\u009F\u00A7\u00B3\u00A8\u00B7\u00A9\u008F\u008C\u00AE\u00AC\u009B\u0000\u00A0\u0000\u0000\u00B4\u0099\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00B9\u00BF".toCharArray();
		}
		private static final char[] GETOUTPUT0_FF61 = getOutput0_FF61();
		private static final char[] getOutput0_FF61() {
			return "\u00BD\u009D\u00B1\u00B5\u00B9\u00B4\u009E\u00B2\u00B6\u00BA\u00BE\u009F\u00B3\u00B7\u00BB\u00BF\u00A3\u0085\u00A4\u00A5\u00A6\u0094\u0087\u0088\u009C\u0082\u0098\u0084\u0092\u0090\u0083\u0091\u0081\u009A\u0097\u0093\u0095\u0089\u00A1\u00AF\u008B\u0086\u0096\u00A2\u00AB\u00AA\u008A\u008E\u00B0\u00AD\u008D\u00A7\u00A8\u00A9\u008F\u008C\u00AE\u00AC\u009B\u00A0\u0099".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x48 && input <= 0x5A) return input - 0x48 + 0x8;
			if (input >= 0x20 && input <= 0x47) return CommonSubtables.COMMON1719[input - 0x20];
			if (input >= 0x68 && input <= 0x7A) return input - 0x68 + 0x8;
			if (input >= 0x256D && input <= 0x259E) return GETOUTPUT0_256D[input - 0x256D];
			if (input >= 0x309B && input <= 0x30FC) return GETOUTPUT0_309B[input - 0x309B];
			if (input >= 0xFF28 && input <= 0xFF3A) return input - 0xFF28 + 0x8;
			if (input >= 0xFF01 && input <= 0xFF27) return CommonSubtables.COMMON1721[input - 0xFF01];
			if (input >= 0xFF48 && input <= 0xFF5A) return input - 0xFF48 + 0x8;
			if (input >= 0xFF61 && input <= 0xFF9D) return GETOUTPUT0_FF61[input - 0xFF61];
			switch (input) {
			case 0x5B: return 0x52L;
			case 0x5C: return 0x59L;
			case 0x5D: return 0x54L;
			case 0x61: return 0x101L;
			case 0x62: return 0x201L;
			case 0x63: return 0x301L;
			case 0x64: return 0x401L;
			case 0x65: return 0x501L;
			case 0x66: return 0x601L;
			case 0x67: return 0x701L;
			case 0xA0: return 0xF0L;
			case 0xA3: return 0xDEL;
			case 0xA5: return 0xDDL;
			case 0x3C0: return 0x60L;
			case 0x2022: return 0x47L;
			case 0x2190: return 0x45L;
			case 0x2191: return 0x50L;
			case 0x2192: return 0x40L;
			case 0x2193: return 0x80L;
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
			case 0x253C: return 0x1BL;
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
			case 0x3001: return 0xB5L;
			case 0x3002: return 0xBDL;
			case 0x300C: return 0x9DL;
			case 0x300D: return 0xB1L;
			case 0x5186: return 0xDCL;
			case 0x5206: return 0xDAL;
			case 0x571F: return 0xD6L;
			case 0x5E74: return 0xD8L;
			case 0x65E5: return 0xD0L;
			case 0x6642: return 0xD9L;
			case 0x6708: return 0xD1L;
			case 0x6728: return 0xD4L;
			case 0x6C34: return 0xD3L;
			case 0x706B: return 0xD2L;
			case 0x751F: return 0xD7L;
			case 0x79D2: return 0xDBL;
			case 0x91D1: return 0xD5L;
			case 0xFF3B: return 0x52L;
			case 0xFF3C: return 0x59L;
			case 0xFF3D: return 0x54L;
			case 0xFF41: return 0x101L;
			case 0xFF42: return 0x201L;
			case 0xFF43: return 0x301L;
			case 0xFF44: return 0x401L;
			case 0xFF45: return 0x501L;
			case 0xFF46: return 0x601L;
			case 0xFF47: return 0x701L;
			case 0xFFE1: return 0xDEL;
			case 0xFFE5: return 0xDDL;
			case 0xFFE8: return 0x79L;
			case 0xFFE9: return 0x45L;
			case 0xFFEA: return 0x50L;
			case 0xFFEB: return 0x40L;
			case 0xFFEC: return 0x80L;
			case 0xFFEE: return 0x48L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DC00 = getOutput1_DC00();
		private static final char[] getOutput1_DC00() {
			return "\u00C9\u00C8\u00CB\u00CC\u00CD\u00E0\u00E1\u00E2\u0000\u00E3\u00EE\u00E4\u00E5\u00E6\u00E8\u00E7\u00E9\u00EA\u00EB\u00EC\u00ED\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC\u00FD\u00FE\uFF01".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xDC00 && input <= 0xDC2F) return GETOUTPUT1_DC00[input - 0xDC00];
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
		private long getOutput5(int input) {
			if (input >= 0xDF70 && input <= 0xDF90) return CommonSubtables.COMMON1726[input - 0xDF70];
			switch (input) {
			case 0xDCB3: return 0xC0L;
			case 0xDCB4: return 0xC4L;
			case 0xDCB5: return 0xC2L;
			case 0xDCB6: return 0xC3L;
			case 0xDCB7: return 0xC1L;
			case 0xDFC5: return 0xCAL;
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
