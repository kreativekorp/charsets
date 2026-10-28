package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646YuCharset extends Charset {
	public XIso646YuCharset() {
		super("x-iso-646-yu", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646YuCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646YuCharsetEncoder(this);
	}

	private static final class XIso646YuCharsetDecoder extends TableCharsetDecoder {
		private XIso646YuCharsetDecoder(Charset cs) {
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
			case 0x40: return 0x17DL;
			case 0x5B: return 0x160L;
			case 0x5C: return 0x110L;
			case 0x5D: return 0x106L;
			case 0x5E: return 0x10CL;
			case 0x5F: return 0x5FL;
			case 0x60: return 0x17EL;
			case 0x7B: return 0x161L;
			case 0x7C: return 0x111L;
			case 0x7D: return 0x107L;
			case 0x7E: return 0x10DL;
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

	private static final class XIso646YuCharsetEncoder extends TableCharsetEncoder {
		private XIso646YuCharsetEncoder(Charset cs) {
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
			case 0x106: return 0x5DL;
			case 0x107: return 0x7DL;
			case 0x10C: return 0x5EL;
			case 0x10D: return 0x7EL;
			case 0x110: return 0x5CL;
			case 0x111: return 0x7CL;
			case 0x160: return 0x5BL;
			case 0x161: return 0x7BL;
			case 0x17D: return 0x40L;
			case 0x17E: return 0x60L;
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
