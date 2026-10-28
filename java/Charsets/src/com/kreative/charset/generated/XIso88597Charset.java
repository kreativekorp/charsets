package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso88597Charset extends Charset {
	public XIso88597Charset() {
		super("x-iso-8859-7", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso88597CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso88597CharsetEncoder(this);
	}

	private static final class XIso88597CharsetDecoder extends TableCharsetDecoder {
		private XIso88597CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u2018\u2019\u00A3\u20AC\u20AF\u00A6\u00A7\u00A8\u00A9\u037A\u00AB\u00AC\u00AD\u0000\u2015\u00B0\u00B1\u00B2\u00B3\u0384\u0385\u0386\u00B7\u0388\u0389\u038A\u00BB\u038C\u00BD".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xBE && input <= 0xD1) return input - 0xBE + 0x38E;
			if (input >= 0xA1 && input <= 0xBD) return GETOUTPUT0_A1[input - 0xA1];
			if (input >= 0xD3 && input <= 0xFE) return input - 0xD3 + 0x3A3;
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIso88597CharsetEncoder extends TableCharsetEncoder {
		private XIso88597CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0x38E && input <= 0x3A1) return input - 0x38E + 0xBE;
			if (input >= 0x3A3 && input <= 0x3CE) return input - 0x3A3 + 0xD3;
			switch (input) {
			case 0xA3: return 0xA3L;
			case 0xA6: return 0xA6L;
			case 0xA7: return 0xA7L;
			case 0xA8: return 0xA8L;
			case 0xA9: return 0xA9L;
			case 0xAB: return 0xABL;
			case 0xAC: return 0xACL;
			case 0xAD: return 0xADL;
			case 0xB0: return 0xB0L;
			case 0xB1: return 0xB1L;
			case 0xB2: return 0xB2L;
			case 0xB3: return 0xB3L;
			case 0xB7: return 0xB7L;
			case 0xBB: return 0xBBL;
			case 0xBD: return 0xBDL;
			case 0x37A: return 0xAAL;
			case 0x384: return 0xB4L;
			case 0x385: return 0xB5L;
			case 0x386: return 0xB6L;
			case 0x388: return 0xB8L;
			case 0x389: return 0xB9L;
			case 0x38A: return 0xBAL;
			case 0x38C: return 0xBCL;
			case 0x2015: return 0xAFL;
			case 0x2018: return 0xA1L;
			case 0x2019: return 0xA2L;
			case 0x20AC: return 0xA4L;
			case 0x20AF: return 0xA5L;
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
