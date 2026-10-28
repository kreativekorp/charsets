package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646CnCharset extends Charset {
	public XIso646CnCharset() {
		super("x-iso-646-cn", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646CnCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646CnCharsetEncoder(this);
	}

	private static final class XIso646CnCharsetDecoder extends TableCharsetDecoder {
		private XIso646CnCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x25 && input <= 0x7D) return input - 0x25 + 0x25;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0xA5L;
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

	private static final class XIso646CnCharsetEncoder extends TableCharsetEncoder {
		private XIso646CnCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x25 && input <= 0x7D) return input - 0x25 + 0x25;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x7F: return 0x7FL;
			case 0xA5: return 0x24L;
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
