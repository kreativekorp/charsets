package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646CaCharset extends Charset {
	public XIso646CaCharset() {
		super("x-iso-646-ca", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646CaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646CaCharsetEncoder(this);
	}

	private static final class XIso646CaCharsetDecoder extends TableCharsetDecoder {
		private XIso646CaCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x40: return 0xE0L;
			case 0x5B: return 0xE2L;
			case 0x5C: return 0xE7L;
			case 0x5D: return 0xEAL;
			case 0x5E: return 0xEEL;
			case 0x5F: return 0x5FL;
			case 0x60: return 0xF4L;
			case 0x7B: return 0xE9L;
			case 0x7C: return 0xF9L;
			case 0x7D: return 0xE8L;
			case 0x7E: return 0xFBL;
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

	private static final class XIso646CaCharsetEncoder extends TableCharsetEncoder {
		private XIso646CaCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x5F: return 0x5FL;
			case 0x7F: return 0x7FL;
			case 0xE0: return 0x40L;
			case 0xE2: return 0x5BL;
			case 0xE7: return 0x5CL;
			case 0xE8: return 0x7DL;
			case 0xE9: return 0x7BL;
			case 0xEA: return 0x5DL;
			case 0xEE: return 0x5EL;
			case 0xF4: return 0x60L;
			case 0xF9: return 0x7CL;
			case 0xFB: return 0x7EL;
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
