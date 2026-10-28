package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSharpsciiEuAltVideoCharset extends Charset {
	public XSharpsciiEuAltVideoCharset() {
		super("x-sharpscii-eu-alt-video", new String[]{"x-sharpscii-mz700-eu-alt-video", "x-sharpscii-mz800-eu-alt-video"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSharpsciiEuAltVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSharpsciiEuAltVideoCharsetEncoder(this);
	}

	private static final class XSharpsciiEuAltVideoCharsetDecoder extends TableCharsetDecoder {
		private XSharpsciiEuAltVideoCharsetDecoder(Charset cs) {
			super(cs, 1.8125f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0x20, 0xDCD6D833, 0xDCD7D833, 0xDCD8D833, 0xDCD9D833, 0xDCDAD833, 0xDCDBD833, 0xDCDCD833, 0xDCDDD833, 0xDCDED833, 0xDCDFD833, 0xDCE0D833, 0xDCE1D833, 0xDCE2D833, 0xDCE3D833, 0xDCE4D833,
				0xDCE5D833, 0xDCE6D833, 0xDCE7D833, 0xDCE8D833, 0xDCE9D833, 0xDCEAD833, 0xDCEBD833, 0xDCECD833, 0xDCEDD833, 0xDCEED833, 0xDCEFD833, 0xDC48D833, 0xDC49D833, 0xDC4AD833, 0x2600, 0xDC4BD833,
				0xDCF0D833, 0xDCF1D833, 0xDCF2D833, 0xDCF3D833, 0xDCF4D833, 0xDCF5D833, 0xDCF6D833, 0xDCF7D833, 0xDCF8D833, 0xDCF9D833, 0x29C9, 0x2BBA, 0xDC4CD833, 0xDC4DD833, 0xDC4ED833, 0xDC4FD833,
				0xDC50D833, 0xDC51D833, 0xDC52D833, 0xDC53D833, 0xDC54D833, 0xDC55D833, 0xDCD4DBBF, 0xDCD5DBBF, 0xDCD6DBBF, 0xDCD7DBBF, 0xDC6CD833, 0xDC6BD833, 0xDC6ED833, 0xDC6DD833, 0x2B24, 0xDC57D833,
				0xDC56D833, 0xDC59D833, 0xDC58D833, 0xDC5AD833, 0xDC5BD833, 0xDC5CD833, 0xDC5DD833, 0xDC5ED833, 0xDC5FD833, 0xDC71D833, 0xDC70D833, 0xDC73D833, 0xDC72D833, 0xDC75D833, 0xDC77D833, 0xDC76D833,
				0xDC74D833, 0xDC61D833, 0xDC60D833, 0xDC63D833, 0xDC62D833, 0xDC66D833, 0xDC65D833, 0xDC68D833, 0xDC67D833, 0xDEE7D83D, 0xDDF9D833, 0xDDF8D833, 0x2708, 0x2196, 0x2199, 0x2198,
				0x2197, 0xDC79D833, 0xDC78D833, 0xDC7BD833, 0xDC7AD833, 0xDC7CD833, 0xDC7FD833, 0xDC7ED833, 0xDC7DD833, 0xDC81D833, 0xDC80D833, 0xDC83D833, 0xDC82D833, 0xFE0E23EB, 0xFE0E23EA, 0xFE0E23EC,
				0xFE0E23E9, 0xDC88D833, 0x2195, 0x2194, 0xDEBAD833, 0xDC44D833, 0xDC45D833, 0xDC89D833, 0xDC8AD833, 0xDCB2D833, 0xDCB3D833, 0xDCB6D833, 0xDCB7D833, 0xDCB4D833, 0xDCB5D833, 0xDCB8D833,
				0xDCB9D833, 0x2602, 0x26AC, 0x25CB, 0x25EF, 0x25AA, 0x25FC, 0x25A0, 0xA9, 0xDF93D83D, 0xDF91D83D, 0xDF8FD83D, 0xFE0E26F5, 0x2296, 0x29B6, 0x2295,
				0xDEBFD833, 0xDCA6D833, 0xDCA7D833, 0xDCA8D833, 0xDCA9D833, 0xDCAAD833, 0xDCABD833, 0xDCACD833, 0xDCADD833, 0xDCAED833, 0xDCAFD833, 0xDCB0D833, 0xDCB1D833, 0xDEBDD833, 0xDEBED833, 0xDC69D833,
				0xDC6AD833, 0xDCA1D833, 0xDCA2D833, 0xDCA3D833, 0xDCA5D833, 0xDCA0D833, 0x3B3, 0x3A3, 0xDCA4D833, 0x3BB, 0x3A9, 0x3C9, 0x221E, 0x221D, 0x221A, 0xF7,
				0x2122, 0xDC8CD833, 0x22A0, 0x263C, 0x229E, 0xDC08D833, 0xDC90D833, 0xDC91D833, 0xB1, 0xDC84D833, 0xDC85D833, 0xDC86D833, 0xDC87D833, 0xDFEAD83E, 0xDFE8D83E, 0xDFEBD83E,
				0xDFE9D83E, 0xDCCAD833, 0xDCCBD833, 0xDCCCD833, 0xDCCDD833, 0xDCBED833, 0xDCBFD833, 0xDCC0D833, 0xDCC1D833, 0xDCC6D833, 0xDCC7D833, 0xDCC8D833, 0xDCC9D833, 0xDCBAD833, 0xDCBBD833, 0xDCBCD833,
				0xDCBDD833, 0xDCCED833, 0xDCCFD833, 0xDCD0D833, 0xDCD1D833, 0xDCC2D833, 0xDCC3D833, 0xDCC4D833, 0xDCC5D833, 0xDC15D833, 0xDC17D833, 0xDC16D833, 0xDC18D833, 0xDC1CD833, 0xDC1BD833, 0xDC1DD833,
				0xDC1ED833, 0xDC19D833, 0xDC1AD833, 0xC6, 0xBD, 0xBC, 0x2153, 0x2154, 0x2265, 0x2264, 0xDCD2D833, 0xDCD3D833, 0xDCD4D833, 0xDCD5D833, 0xDC46D833, 0xDC47D833,
				0xDC92D833, 0xDC93D833, 0xDC94D833, 0xDC95D833, 0xDC96D833, 0xDC98D833, 0xDC9AD833, 0xDC97D833, 0xDC99D833, 0xDC9ED833, 0xDC9FD833, 0xDEBBD833, 0x26F6, 0x2260, 0x2320, 0x2321,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0xFF) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XSharpsciiEuAltVideoCharsetEncoder extends TableCharsetEncoder {
		private XSharpsciiEuAltVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{0}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x23E9: return 0x1;
			case 0x23EA: return 0x2;
			case 0x23EB: return 0x3;
			case 0x23EC: return 0x4;
			case 0x26F5: return 0x5;
			case 0xD833: return 0x6;
			case 0xD83C: return 0x7;
			case 0xD83D: return 0x8;
			case 0xD83E: return 0x9;
			case 0xDBBF: return 0xA;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			switch (input) {
			case 0x20: return 0x1L;
			case 0xA9: return 0x88L;
			case 0xB1: return 0xB8L;
			case 0xBC: return 0xE5L;
			case 0xBD: return 0xE4L;
			case 0xC6: return 0xE3L;
			case 0xF7: return 0xAFL;
			case 0x3A3: return 0xA7L;
			case 0x3A9: return 0xAAL;
			case 0x3B3: return 0xA6L;
			case 0x3BB: return 0xA9L;
			case 0x3C9: return 0xABL;
			case 0x2122: return 0xB0L;
			case 0x2153: return 0xE6L;
			case 0x2154: return 0xE7L;
			case 0x2194: return 0x73L;
			case 0x2195: return 0x72L;
			case 0x2196: return 0x5DL;
			case 0x2197: return 0x60L;
			case 0x2198: return 0x5FL;
			case 0x2199: return 0x5EL;
			case 0x221A: return 0xAEL;
			case 0x221D: return 0xADL;
			case 0x221E: return 0xACL;
			case 0x2260: return 0xFDL;
			case 0x2264: return 0xE9L;
			case 0x2265: return 0xE8L;
			case 0x2295: return 0x8FL;
			case 0x2296: return 0x8DL;
			case 0x229E: return 0xB4L;
			case 0x22A0: return 0xB2L;
			case 0x2320: return 0xFEL;
			case 0x2321: return 0xFF01L;
			case 0x23E9: return 0x70L;
			case 0x23EA: return 0x6EL;
			case 0x23EB: return 0x6DL;
			case 0x23EC: return 0x6FL;
			case 0x25A0: return 0x87L;
			case 0x25AA: return 0x85L;
			case 0x25CB: return 0x83L;
			case 0x25E6: return 0x83L;
			case 0x25EF: return 0x84L;
			case 0x25FC: return 0x86L;
			case 0x2600: return 0x1EL;
			case 0x2602: return 0x81L;
			case 0x263C: return 0xB3L;
			case 0x26AC: return 0x82L;
			case 0x26F5: return 0x8CL;
			case 0x26F6: return 0xFCL;
			case 0x2708: return 0x5CL;
			case 0x29B6: return 0x8EL;
			case 0x29C9: return 0x2AL;
			case 0x2B24: return 0x3EL;
			case 0x2BBA: return 0x2BL;
			case 0xFFED: return 0x87L;
			case 0xFFEE: return 0x83L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xFE0E: return 0x70L;
			case 0xFE0F: return 0x70L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xFE0E: return 0x6EL;
			case 0xFE0F: return 0x6EL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xFE0E: return 0x6DL;
			case 0xFE0F: return 0x6DL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xFE0E: return 0x6FL;
			case 0xFE0F: return 0x6FL;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xFE0E: return 0x8CL;
			case 0xFE0F: return 0x8CL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT6_DC44 = getOutput6_DC44();
		private static final char[] getOutput6_DC44() {
			return "uv\u00EE\u00EF\u001B\u001C\u001D\u001F,-./012345@?BACDEFGHRQTS\u0000VUXW\u009F\u00A0;:=<\u0000JILKPMONbadcehgfjilk\u00B9\u00BA\u00BB\u00BCqwx\u0000\u00B1\u0000\u0000\u0000\u00B6\u00B7\u00F0\u00F1\u00F2\u00F3\u00F4\u00F7\u00F5\u00F8\u00F6\u0000\u0000\u0000\u00F9\u00FA\u00A5\u00A1\u00A2\u00A3\u00A8\u00A4\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u009A\u009B\u009Cyz}~{|\u007F\u0080\u00CD\u00CE\u00CF\u00D0\u00C5\u00C6\u00C7\u00C8\u00D5\u00D6\u00D7\u00D8\u00C9\u00CA\u00CB\u00CC\u00C1\u00C2\u00C3\u00C4\u00D1\u00D2\u00D3\u00D4\u00EA\u00EB\u00EC\u00ED\u0101\u0201\u0301\u0401\u0501\u0601\u0701".toCharArray();
		}
		private long getOutput6(int input) {
			if (input >= 0xDCDD && input <= 0xDCEF) return input - 0xDCDD + 0x8;
			if (input >= 0xDC44 && input <= 0xDCDC) return GETOUTPUT6_DC44[input - 0xDC44];
			switch (input) {
			case 0xDC08: return 0xB5L;
			case 0xDC15: return 0xD9L;
			case 0xDC16: return 0xDBL;
			case 0xDC17: return 0xDAL;
			case 0xDC18: return 0xDCL;
			case 0xDC19: return 0xE1L;
			case 0xDC1A: return 0xE2L;
			case 0xDC1B: return 0xDEL;
			case 0xDC1C: return 0xDDL;
			case 0xDC1D: return 0xDFL;
			case 0xDC1E: return 0xE0L;
			case 0xDCF0: return 0x20L;
			case 0xDCF1: return 0x21L;
			case 0xDCF2: return 0x22L;
			case 0xDCF3: return 0x23L;
			case 0xDCF4: return 0x24L;
			case 0xDCF5: return 0x25L;
			case 0xDCF6: return 0x26L;
			case 0xDCF7: return 0x27L;
			case 0xDCF8: return 0x28L;
			case 0xDCF9: return 0x29L;
			case 0xDDF8: return 0x5BL;
			case 0xDDF9: return 0x5AL;
			case 0xDEBA: return 0x74L;
			case 0xDEBB: return 0xFBL;
			case 0xDEBD: return 0x9DL;
			case 0xDEBE: return 0x9EL;
			case 0xDEBF: return 0x90L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0xDF4E: return 0x9DL;
			case 0xDF52: return 0x9EL;
			case 0xDF53: return 0x90L;
			case 0xDF77: return 0x74L;
			case 0xDFE2: return 0xFBL;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0xDEE7: return 0x59L;
			case 0xDF8F: return 0x8BL;
			case 0xDF91: return 0x8AL;
			case 0xDF93: return 0x89L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0xDFE8: return 0xBEL;
			case 0xDFE9: return 0xC0L;
			case 0xDFEA: return 0xBDL;
			case 0xDFEB: return 0xBFL;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0xDCD4: return 0x36L;
			case 0xDCD5: return 0x37L;
			case 0xDCD6: return 0x38L;
			case 0xDCD7: return 0x39L;
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
			case 6: return getOutput6(input);
			case 7: return getOutput7(input);
			case 8: return getOutput8(input);
			case 9: return getOutput9(input);
			case 10: return getOutput10(input);
			default: return 0;
			}
		}
	}
}
