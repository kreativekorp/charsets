package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646PlZu0Charset extends Charset {
	public XIso646PlZu0Charset() {
		super("x-iso-646-pl-zu0", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646PlZu0CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646PlZu0CharsetEncoder(this);
	}

	private static final class XIso646PlZu0CharsetDecoder extends TableCharsetDecoder {
		private XIso646PlZu0CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x25 && input <= 0x3F) return input - 0x25 + 0x25;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0xA4L;
			case 0x40: return 0x119L;
			case 0x5B: return 0x17AL;
			case 0x5C: return 0x141L;
			case 0x5D: return 0x144L;
			case 0x5E: return 0x15BL;
			case 0x5F: return 0x5FL;
			case 0x60: return 0x105L;
			case 0x7B: return 0xF3L;
			case 0x7C: return 0x142L;
			case 0x7D: return 0x17CL;
			case 0x7E: return 0x107L;
			case 0x7F: return 0x7FL;
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

	private static final class XIso646PlZu0CharsetEncoder extends TableCharsetEncoder {
		private XIso646PlZu0CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x25 && input <= 0x3F) return input - 0x25 + 0x25;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x5F: return 0x5FL;
			case 0x7F: return 0x7FL;
			case 0xA4: return 0x24L;
			case 0xF3: return 0x7BL;
			case 0x105: return 0x60L;
			case 0x107: return 0x7EL;
			case 0x119: return 0x40L;
			case 0x141: return 0x5CL;
			case 0x142: return 0x7CL;
			case 0x144: return 0x5DL;
			case 0x15B: return 0x5EL;
			case 0x17A: return 0x5BL;
			case 0x17C: return 0x7DL;
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
