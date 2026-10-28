package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646JpCharset extends Charset {
	public XIso646JpCharset() {
		super("x-iso-646-jp", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646JpCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646JpCharsetEncoder(this);
	}

	private static final class XIso646JpCharsetDecoder extends TableCharsetDecoder {
		private XIso646JpCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7D) return input - 0x5D + 0x5D;
			switch (input) {
			case 0x5C: return 0xA5L;
			case 0x7E: return 0xAFL;
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

	private static final class XIso646JpCharsetEncoder extends TableCharsetEncoder {
		private XIso646JpCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7D) return input - 0x5D + 0x5D;
			switch (input) {
			case 0x7F: return 0x7FL;
			case 0xA5: return 0x5CL;
			case 0xAF: return 0x7EL;
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
