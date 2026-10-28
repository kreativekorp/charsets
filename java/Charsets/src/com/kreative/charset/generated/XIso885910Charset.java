package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso885910Charset extends Charset {
	public XIso885910Charset() {
		super("x-iso-8859-10", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso885910CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso885910CharsetEncoder(this);
	}

	private static final class XIso885910CharsetDecoder extends TableCharsetDecoder {
		private XIso885910CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u0104\u0112\u0122\u012A\u0128\u0136\u00A7\u013B\u0110\u0160\u0166\u017D\u00AD\u016A\u014A\u00B0\u0105\u0113\u0123\u012B\u0129\u0137\u00B7\u013C\u0111\u0161\u0167\u017E\u2015\u016B\u014B\u0100\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u012E\u010C\u00C9\u0118\u00CB\u0116\u00CD\u00CE\u00CF\u00D0\u0145\u014C\u00D3\u00D4\u00D5\u00D6\u0168\u00D8\u0172\u00DA\u00DB\u00DC\u00DD\u00DE\u00DF\u0101\u00E1\u00E2\u00E3\u00E4\u00E5\u00E6\u012F\u010D\u00E9\u0119\u00EB\u0117\u00ED\u00EE\u00EF\u00F0\u0146\u014D\u00F3\u00F4\u00F5\u00F6\u0169\u00F8\u0173\u00FA\u00FB\u00FC\u00FD\u00FE\u0138".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFF) return GETOUTPUT0_A1[input - 0xA1];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIso885910CharsetEncoder extends TableCharsetEncoder {
		private XIso885910CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A7 = getOutput0_A7();
		private static final char[] getOutput0_A7() {
			return "\u00A7\u0000\u0000\u0000\u0000\u0000\u00AD\u0000\u0000\u00B0\u0000\u0000\u0000\u0000\u0000\u0000\u00B7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u0000\u0000\u00C9\u0000\u00CB\u0000\u00CD\u00CE\u00CF\u00D0\u0000\u0000\u00D3\u00D4\u00D5\u00D6\u0000\u00D8\u0000\u00DA\u00DB\u00DC\u00DD\u00DE\u00DF\u0000\u00E1\u00E2\u00E3\u00E4\u00E5\u00E6\u0000\u0000\u00E9\u0000\u00EB\u0000\u00ED\u00EE\u00EF\u00F0\u0000\u0000\u00F3\u00F4\u00F5\u00F6\u0000\u00F8\u0000\u00FA\u00FB\u00FC\u00FD\u00FE\u0000\u00C0\u00E0\u0000\u0000\u00A1\u00B1\u0000\u0000\u0000\u0000\u0000\u0000\u00C8\u00E8\u0000\u0000\u00A9\u00B9\u00A2\u00B2\u0000\u0000\u00CC\u00EC\u00CA\u00EA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A3\u00B3\u0000\u0000\u0000\u0000\u00A5\u00B5\u00A4\u00B4\u0000\u0000\u00C7\u00E7\u0000\u0000\u0000\u0000\u0000\u0000\u00A6\u00B6\uFF01\u0000\u0000\u00A8\u00B8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D1\u00F1\u0000\u0000\u0000\u00AF\u00BF\u00D2\u00F2".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA7 && input <= 0x14D) return GETOUTPUT0_A7[input - 0xA7];
			switch (input) {
			case 0x160: return 0xAAL;
			case 0x161: return 0xBAL;
			case 0x166: return 0xABL;
			case 0x167: return 0xBBL;
			case 0x168: return 0xD7L;
			case 0x169: return 0xF7L;
			case 0x16A: return 0xAEL;
			case 0x16B: return 0xBEL;
			case 0x172: return 0xD9L;
			case 0x173: return 0xF9L;
			case 0x17D: return 0xACL;
			case 0x17E: return 0xBCL;
			case 0x2015: return 0xBDL;
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
