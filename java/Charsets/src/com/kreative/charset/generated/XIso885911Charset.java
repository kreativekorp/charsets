package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso885911Charset extends Charset {
	public XIso885911Charset() {
		super("x-iso-8859-11", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso885911CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso885911CharsetEncoder(this);
	}

	private static final class XIso885911CharsetDecoder extends TableCharsetDecoder {
		private XIso885911CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xDA) return input - 0xA1 + 0xE01;
			if (input >= 0xDF && input <= 0xFB) return input - 0xDF + 0xE3F;
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIso885911CharsetEncoder extends TableCharsetEncoder {
		private XIso885911CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xE01 && input <= 0xE3A) return input - 0xE01 + 0xA1;
			if (input >= 0xE3F && input <= 0xE5B) return input - 0xE3F + 0xDF;
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
