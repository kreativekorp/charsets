package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646IsCharset extends Charset {
	public XIso646IsCharset() {
		super("x-iso-646-is", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646IsCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646IsCharsetEncoder(this);
	}

	private static final class XIso646IsCharsetDecoder extends TableCharsetDecoder {
		private XIso646IsCharsetDecoder(Charset cs) {
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
			case 0x40: return 0xD0L;
			case 0x5B: return 0xDEL;
			case 0x5C: return 0xB4L;
			case 0x5D: return 0xC6L;
			case 0x5E: return 0xD6L;
			case 0x5F: return 0x5FL;
			case 0x60: return 0xF0L;
			case 0x7B: return 0xFEL;
			case 0x7C: return 0xB4L;
			case 0x7D: return 0xE6L;
			case 0x7E: return 0xF6L;
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

	private static final class XIso646IsCharsetEncoder extends TableCharsetEncoder {
		private XIso646IsCharsetEncoder(Charset cs) {
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
			case 0xB4: return 0x7CL;
			case 0xC6: return 0x5DL;
			case 0xD0: return 0x40L;
			case 0xD6: return 0x5EL;
			case 0xDE: return 0x5BL;
			case 0xE6: return 0x7DL;
			case 0xF0: return 0x60L;
			case 0xF6: return 0x7EL;
			case 0xFE: return 0x7BL;
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
