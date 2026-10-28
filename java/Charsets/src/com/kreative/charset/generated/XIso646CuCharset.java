package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646CuCharset extends Charset {
	public XIso646CuCharset() {
		super("x-iso-646-cu", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646CuCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646CuCharsetEncoder(this);
	}

	private static final class XIso646CuCharsetDecoder extends TableCharsetDecoder {
		private XIso646CuCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x25 && input <= 0x5A) return input - 0x25 + 0x25;
			if (input >= 0x5F && input <= 0x7A) return input - 0x5F + 0x5F;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0xA4L;
			case 0x5B: return 0xA1L;
			case 0x5C: return 0xD1L;
			case 0x5D: return 0x5DL;
			case 0x5E: return 0xBFL;
			case 0x7B: return 0xB4L;
			case 0x7C: return 0xF1L;
			case 0x7D: return 0x5BL;
			case 0x7E: return 0xA8L;
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

	private static final class XIso646CuCharsetEncoder extends TableCharsetEncoder {
		private XIso646CuCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x25 && input <= 0x5A) return input - 0x25 + 0x25;
			if (input >= 0x5F && input <= 0x7A) return input - 0x5F + 0x5F;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x5B: return 0x7DL;
			case 0x5D: return 0x5DL;
			case 0x7F: return 0x7FL;
			case 0xA1: return 0x5BL;
			case 0xA4: return 0x24L;
			case 0xA8: return 0x7EL;
			case 0xB4: return 0x7BL;
			case 0xBF: return 0x5EL;
			case 0xD1: return 0x5CL;
			case 0xF1: return 0x7CL;
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
