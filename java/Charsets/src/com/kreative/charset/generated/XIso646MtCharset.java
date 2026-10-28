package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646MtCharset extends Charset {
	public XIso646MtCharset() {
		super("x-iso-646-mt", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646MtCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646MtCharsetEncoder(this);
	}

	private static final class XIso646MtCharsetDecoder extends TableCharsetDecoder {
		private XIso646MtCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5A) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x5B: return 0x121L;
			case 0x5C: return 0x17CL;
			case 0x5D: return 0x127L;
			case 0x5E: return 0x5EL;
			case 0x5F: return 0x5FL;
			case 0x60: return 0x10BL;
			case 0x7B: return 0x120L;
			case 0x7C: return 0x17BL;
			case 0x7D: return 0x126L;
			case 0x7E: return 0x10AL;
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

	private static final class XIso646MtCharsetEncoder extends TableCharsetEncoder {
		private XIso646MtCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5A) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x5E: return 0x5EL;
			case 0x5F: return 0x5FL;
			case 0x7F: return 0x7FL;
			case 0x10A: return 0x7EL;
			case 0x10B: return 0x60L;
			case 0x120: return 0x7BL;
			case 0x121: return 0x5BL;
			case 0x126: return 0x7DL;
			case 0x127: return 0x5DL;
			case 0x17B: return 0x7CL;
			case 0x17C: return 0x5CL;
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
