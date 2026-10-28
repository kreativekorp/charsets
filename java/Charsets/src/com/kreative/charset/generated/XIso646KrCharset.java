package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso646KrCharset extends Charset {
	public XIso646KrCharset() {
		super("x-iso-646-kr", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso646KrCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso646KrCharsetEncoder(this);
	}

	private static final class XIso646KrCharsetDecoder extends TableCharsetDecoder {
		private XIso646KrCharsetDecoder(Charset cs) {
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
			case 0x5C: return 0x20A9L;
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

	private static final class XIso646KrCharsetEncoder extends TableCharsetEncoder {
		private XIso646KrCharsetEncoder(Charset cs) {
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
			case 0xAF: return 0x7EL;
			case 0x20A9: return 0x5CL;
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
