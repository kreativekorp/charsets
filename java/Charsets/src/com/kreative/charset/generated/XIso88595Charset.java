package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso88595Charset extends Charset {
	public XIso88595Charset() {
		super("x-iso-8859-5", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso88595CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso88595CharsetEncoder(this);
	}

	private static final class XIso88595CharsetDecoder extends TableCharsetDecoder {
		private XIso88595CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_F0 = getOutput0_F0();
		private static final char[] getOutput0_F0() {
			return "\u2116\u0451\u0452\u0453\u0454\u0455\u0456\u0457\u0458\u0459\u045A\u045B\u045C\u00A7\u045E\u045F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xAE && input <= 0xEF) return input - 0xAE + 0x40E;
			if (input >= 0xF0 && input <= 0xFF) return GETOUTPUT0_F0[input - 0xF0];
			switch (input) {
			case 0xA1: return 0x401L;
			case 0xA2: return 0x402L;
			case 0xA3: return 0x403L;
			case 0xA4: return 0x404L;
			case 0xA5: return 0x405L;
			case 0xA6: return 0x406L;
			case 0xA7: return 0x407L;
			case 0xA8: return 0x408L;
			case 0xA9: return 0x409L;
			case 0xAA: return 0x40AL;
			case 0xAB: return 0x40BL;
			case 0xAC: return 0x40CL;
			case 0xAD: return 0xADL;
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

	private static final class XIso88595CharsetEncoder extends TableCharsetEncoder {
		private XIso88595CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0x40E && input <= 0x44F) return input - 0x40E + 0xAE;
			switch (input) {
			case 0xA7: return 0xFDL;
			case 0xAD: return 0xADL;
			case 0x401: return 0xA1L;
			case 0x402: return 0xA2L;
			case 0x403: return 0xA3L;
			case 0x404: return 0xA4L;
			case 0x405: return 0xA5L;
			case 0x406: return 0xA6L;
			case 0x407: return 0xA7L;
			case 0x408: return 0xA8L;
			case 0x409: return 0xA9L;
			case 0x40A: return 0xAAL;
			case 0x40B: return 0xABL;
			case 0x40C: return 0xACL;
			case 0x451: return 0xF1L;
			case 0x452: return 0xF2L;
			case 0x453: return 0xF3L;
			case 0x454: return 0xF4L;
			case 0x455: return 0xF5L;
			case 0x456: return 0xF6L;
			case 0x457: return 0xF7L;
			case 0x458: return 0xF8L;
			case 0x459: return 0xF9L;
			case 0x45A: return 0xFAL;
			case 0x45B: return 0xFBL;
			case 0x45C: return 0xFCL;
			case 0x45E: return 0xFEL;
			case 0x45F: return 0xFF01L;
			case 0x2116: return 0xF0L;
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
