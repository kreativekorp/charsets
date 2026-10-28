package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XOricsciiCharset extends Charset {
	public XOricsciiCharset() {
		super("x-oricscii", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XOricsciiCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XOricsciiCharsetEncoder(this);
	}

	private static final class XOricsciiCharsetDecoder extends TableCharsetDecoder {
		private XOricsciiCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7D) return input - 0x61 + 0x61;
			if (input >= 0x80 && input <= 0x9F) return input - 0x80 + 0x80;
			if (input >= 0xA0 && input <= 0xDD) return input - 0xA0 + 0x20;
			if (input >= 0xE1 && input <= 0xFD) return input - 0xE1 + 0x61;
			switch (input) {
			case 0x5E: return 0x2191L;
			case 0x5F: return 0xA3L;
			case 0x60: return 0xA9L;
			case 0x7E: return 0x2592L;
			case 0x7F: return 0x2588L;
			case 0xDE: return 0x2191L;
			case 0xDF: return 0xA3L;
			case 0xE0: return 0xA9L;
			case 0xFE: return 0x2592L;
			case 0xFF: return 0x2588L;
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

	private static final class XOricsciiCharsetEncoder extends TableCharsetEncoder {
		private XOricsciiCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7D) return input - 0x61 + 0x61;
			if (input >= 0x80 && input <= 0x9F) return input - 0x80 + 0x80;
			switch (input) {
			case 0xA3: return 0x5FL;
			case 0xA9: return 0x60L;
			case 0x2191: return 0x5EL;
			case 0x2588: return 0x7FL;
			case 0x2592: return 0x7EL;
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
