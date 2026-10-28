package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso88598Charset extends Charset {
	public XIso88598Charset() {
		super("x-iso-8859-8", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso88598CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso88598CharsetEncoder(this);
	}

	private static final class XIso88598CharsetDecoder extends TableCharsetDecoder {
		private XIso88598CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A2 = getOutput0_A2();
		private static final char[] getOutput0_A2() {
			return "\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u00D7\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u00F7\u00BB\u00BC\u00BD\u00BE".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA2 && input <= 0xBE) return GETOUTPUT0_A2[input - 0xA2];
			if (input >= 0xE0 && input <= 0xFA) return input - 0xE0 + 0x5D0;
			switch (input) {
			case 0xDF: return 0x2017L;
			case 0xFD: return 0x200EL;
			case 0xFE: return 0x200FL;
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

	private static final class XIso88598CharsetEncoder extends TableCharsetEncoder {
		private XIso88598CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A2 = getOutput0_A2();
		private static final char[] getOutput0_A2() {
			return "\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u0000\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u0000\u00BB\u00BC\u00BD\u00BE".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA2 && input <= 0xBE) return GETOUTPUT0_A2[input - 0xA2];
			if (input >= 0x5D0 && input <= 0x5EA) return input - 0x5D0 + 0xE0;
			switch (input) {
			case 0xD7: return 0xAAL;
			case 0xF7: return 0xBAL;
			case 0x200E: return 0xFDL;
			case 0x200F: return 0xFEL;
			case 0x2017: return 0xDFL;
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
