package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646Se2Charset extends Charset {
	public XIso646Se2Charset() {
		super("x-iso-646-se2", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646Se2CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646Se2CharsetEncoder(this);
	}

	private static final class XIso646Se2CharsetDecoder extends TableCharsetDecoder {
		private XIso646Se2CharsetDecoder(Charset cs) {
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
			case 0x40: return 0xC9L;
			case 0x5B: return 0xC4L;
			case 0x5C: return 0xD6L;
			case 0x5D: return 0xC5L;
			case 0x5E: return 0xDCL;
			case 0x5F: return 0x5FL;
			case 0x60: return 0xE9L;
			case 0x7B: return 0xE4L;
			case 0x7C: return 0xF6L;
			case 0x7D: return 0xE5L;
			case 0x7E: return 0xFCL;
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

	private static final class XIso646Se2CharsetEncoder extends TableCharsetEncoder {
		private XIso646Se2CharsetEncoder(Charset cs) {
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
			case 0xC4: return 0x5BL;
			case 0xC5: return 0x5DL;
			case 0xC9: return 0x40L;
			case 0xD6: return 0x5CL;
			case 0xDC: return 0x5EL;
			case 0xE4: return 0x7BL;
			case 0xE5: return 0x7DL;
			case 0xE9: return 0x60L;
			case 0xF6: return 0x7CL;
			case 0xFC: return 0x7EL;
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
