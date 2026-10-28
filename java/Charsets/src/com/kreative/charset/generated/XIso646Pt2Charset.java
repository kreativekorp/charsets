package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646Pt2Charset extends Charset {
	public XIso646Pt2Charset() {
		super("x-iso-646-pt2", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646Pt2CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646Pt2CharsetEncoder(this);
	}

	private static final class XIso646Pt2CharsetDecoder extends TableCharsetDecoder {
		private XIso646Pt2CharsetDecoder(Charset cs) {
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
			case 0x40: return 0xB4L;
			case 0x5B: return 0xC3L;
			case 0x5C: return 0xC7L;
			case 0x5D: return 0xD5L;
			case 0x7B: return 0xE3L;
			case 0x7C: return 0xE7L;
			case 0x7D: return 0xF5L;
			case 0x7E: return 0x7EL;
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

	private static final class XIso646Pt2CharsetEncoder extends TableCharsetEncoder {
		private XIso646Pt2CharsetEncoder(Charset cs) {
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
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x7FL;
			case 0xB4: return 0x40L;
			case 0xC3: return 0x5BL;
			case 0xC7: return 0x5CL;
			case 0xD5: return 0x5DL;
			case 0xE3: return 0x7BL;
			case 0xE7: return 0x7CL;
			case 0xF5: return 0x7DL;
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
