package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646DeCharset extends Charset {
	public XIso646DeCharset() {
		super("x-iso-646-de", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646DeCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646DeCharsetEncoder(this);
	}

	private static final class XIso646DeCharsetDecoder extends TableCharsetDecoder {
		private XIso646DeCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0x5E;
			switch (input) {
			case 0x40: return 0xA7L;
			case 0x5B: return 0xC4L;
			case 0x5C: return 0xD6L;
			case 0x5D: return 0xDCL;
			case 0x7B: return 0xE4L;
			case 0x7C: return 0xF6L;
			case 0x7D: return 0xFCL;
			case 0x7E: return 0xDFL;
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

	private static final class XIso646DeCharsetEncoder extends TableCharsetEncoder {
		private XIso646DeCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0x5E;
			switch (input) {
			case 0x7F: return 0x7FL;
			case 0xA7: return 0x40L;
			case 0xC4: return 0x5BL;
			case 0xD6: return 0x5CL;
			case 0xDC: return 0x5DL;
			case 0xDF: return 0x7EL;
			case 0xE4: return 0x7BL;
			case 0xF6: return 0x7CL;
			case 0xFC: return 0x7DL;
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
