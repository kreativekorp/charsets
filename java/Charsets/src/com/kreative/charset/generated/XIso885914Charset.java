package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso885914Charset extends Charset {
	public XIso885914Charset() {
		super("x-iso-8859-14", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso885914CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso885914CharsetEncoder(this);
	}

	private static final class XIso885914CharsetDecoder extends TableCharsetDecoder {
		private XIso885914CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u1E02\u1E03\u00A3\u010A\u010B\u1E0A\u00A7\u1E80\u00A9\u1E82\u1E0B\u1EF2\u00AD\u00AE\u0178\u1E1E\u1E1F\u0120\u0121\u1E40\u1E41\u00B6\u1E56\u1E81\u1E57\u1E83\u1E60\u1EF3\u1E84\u1E85\u1E61\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0174\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u1E6A\u00D8\u00D9\u00DA\u00DB\u00DC\u00DD\u0176".toCharArray();
		}
		private static final char[] GETOUTPUT0_F0 = getOutput0_F0();
		private static final char[] getOutput0_F0() {
			return "\u0175\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u1E6B\u00F8\u00F9\u00FA\u00FB\u00FC\u00FD\u0177\u00FF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xC0 && input <= 0xCF) return input - 0xC0 + 0xC0;
			if (input >= 0xDF && input <= 0xEF) return input - 0xDF + 0xDF;
			if (input >= 0xA1 && input <= 0xDE) return GETOUTPUT0_A1[input - 0xA1];
			if (input >= 0xF0 && input <= 0xFF) return GETOUTPUT0_F0[input - 0xF0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIso885914CharsetEncoder extends TableCharsetEncoder {
		private XIso885914CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xC0 && input <= 0xCF) return input - 0xC0 + 0xC0;
			if (input >= 0xDF && input <= 0xEF) return input - 0xDF + 0xDF;
			switch (input) {
			case 0xA3: return 0xA3L;
			case 0xA7: return 0xA7L;
			case 0xA9: return 0xA9L;
			case 0xAD: return 0xADL;
			case 0xAE: return 0xAEL;
			case 0xB6: return 0xB6L;
			case 0xD1: return 0xD1L;
			case 0xD2: return 0xD2L;
			case 0xD3: return 0xD3L;
			case 0xD4: return 0xD4L;
			case 0xD5: return 0xD5L;
			case 0xD6: return 0xD6L;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xDD: return 0xDDL;
			case 0xF1: return 0xF1L;
			case 0xF2: return 0xF2L;
			case 0xF3: return 0xF3L;
			case 0xF4: return 0xF4L;
			case 0xF5: return 0xF5L;
			case 0xF6: return 0xF6L;
			case 0xF8: return 0xF8L;
			case 0xF9: return 0xF9L;
			case 0xFA: return 0xFAL;
			case 0xFB: return 0xFBL;
			case 0xFC: return 0xFCL;
			case 0xFD: return 0xFDL;
			case 0xFF: return 0xFF01L;
			case 0x10A: return 0xA4L;
			case 0x10B: return 0xA5L;
			case 0x120: return 0xB2L;
			case 0x121: return 0xB3L;
			case 0x174: return 0xD0L;
			case 0x175: return 0xF0L;
			case 0x176: return 0xDEL;
			case 0x177: return 0xFEL;
			case 0x178: return 0xAFL;
			case 0x1E02: return 0xA1L;
			case 0x1E03: return 0xA2L;
			case 0x1E0A: return 0xA6L;
			case 0x1E0B: return 0xABL;
			case 0x1E1E: return 0xB0L;
			case 0x1E1F: return 0xB1L;
			case 0x1E40: return 0xB4L;
			case 0x1E41: return 0xB5L;
			case 0x1E56: return 0xB7L;
			case 0x1E57: return 0xB9L;
			case 0x1E60: return 0xBBL;
			case 0x1E61: return 0xBFL;
			case 0x1E6A: return 0xD7L;
			case 0x1E6B: return 0xF7L;
			case 0x1E80: return 0xA8L;
			case 0x1E81: return 0xB8L;
			case 0x1E82: return 0xAAL;
			case 0x1E83: return 0xBAL;
			case 0x1E84: return 0xBDL;
			case 0x1E85: return 0xBEL;
			case 0x1EF2: return 0xACL;
			case 0x1EF3: return 0xBCL;
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
