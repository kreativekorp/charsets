package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646No2Charset extends Charset {
	public XIso646No2Charset() {
		super("x-iso-646-no2", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646No2CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646No2CharsetEncoder(this);
	}

	private static final class XIso646No2CharsetDecoder extends TableCharsetDecoder {
		private XIso646No2CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x24 && input <= 0x5A) return input - 0x24 + 0x24;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0x5E;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0xA7L;
			case 0x5B: return 0xC6L;
			case 0x5C: return 0xD8L;
			case 0x5D: return 0xC5L;
			case 0x7B: return 0xE6L;
			case 0x7C: return 0xF8L;
			case 0x7D: return 0xE5L;
			case 0x7E: return 0x7CL;
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

	private static final class XIso646No2CharsetEncoder extends TableCharsetEncoder {
		private XIso646No2CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x24 && input <= 0x5A) return input - 0x24 + 0x24;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0x5E;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x7C: return 0x7EL;
			case 0x7F: return 0x7FL;
			case 0xA7: return 0x23L;
			case 0xC5: return 0x5DL;
			case 0xC6: return 0x5BL;
			case 0xD8: return 0x5CL;
			case 0xE5: return 0x7DL;
			case 0xE6: return 0x7BL;
			case 0xF8: return 0x7CL;
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
