package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646FrCharset extends Charset {
	public XIso646FrCharset() {
		super("x-iso-646-fr", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646FrCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646FrCharsetEncoder(this);
	}

	private static final class XIso646FrCharsetDecoder extends TableCharsetDecoder {
		private XIso646FrCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x24 && input <= 0x3F) return input - 0x24 + 0x24;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0xA3L;
			case 0x40: return 0xE0L;
			case 0x5B: return 0xB0L;
			case 0x5C: return 0xE7L;
			case 0x5D: return 0xA7L;
			case 0x5E: return 0x5EL;
			case 0x5F: return 0x5FL;
			case 0x60: return 0xB5L;
			case 0x7B: return 0xE9L;
			case 0x7C: return 0xF9L;
			case 0x7D: return 0xE8L;
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

	private static final class XIso646FrCharsetEncoder extends TableCharsetEncoder {
		private XIso646FrCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x24 && input <= 0x3F) return input - 0x24 + 0x24;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x5E: return 0x5EL;
			case 0x5F: return 0x5FL;
			case 0x7F: return 0x7FL;
			case 0xA3: return 0x23L;
			case 0xA7: return 0x5DL;
			case 0xA8: return 0x7EL;
			case 0xB0: return 0x5BL;
			case 0xB5: return 0x60L;
			case 0xE0: return 0x40L;
			case 0xE7: return 0x5CL;
			case 0xE8: return 0x7DL;
			case 0xE9: return 0x7BL;
			case 0xF9: return 0x7CL;
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
