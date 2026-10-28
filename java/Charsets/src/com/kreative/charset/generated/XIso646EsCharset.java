package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646EsCharset extends Charset {
	public XIso646EsCharset() {
		super("x-iso-646-es", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646EsCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646EsCharsetEncoder(this);
	}

	private static final class XIso646EsCharsetDecoder extends TableCharsetDecoder {
		private XIso646EsCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x24 && input <= 0x3F) return input - 0x24 + 0x24;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0x5E;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0xA3L;
			case 0x40: return 0xA7L;
			case 0x5B: return 0xA1L;
			case 0x5C: return 0xD1L;
			case 0x5D: return 0xBFL;
			case 0x7B: return 0xB0L;
			case 0x7C: return 0xF1L;
			case 0x7D: return 0xE7L;
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

	private static final class XIso646EsCharsetEncoder extends TableCharsetEncoder {
		private XIso646EsCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x24 && input <= 0x3F) return input - 0x24 + 0x24;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0x5E;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x7FL;
			case 0xA1: return 0x5BL;
			case 0xA3: return 0x23L;
			case 0xA7: return 0x40L;
			case 0xB0: return 0x7BL;
			case 0xBF: return 0x5DL;
			case 0xD1: return 0x5CL;
			case 0xE7: return 0x7DL;
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
