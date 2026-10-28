package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XUsAsciiQuotesCharset extends Charset {
	public XUsAsciiQuotesCharset() {
		super("x-us-ascii-quotes", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XUsAsciiQuotesCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XUsAsciiQuotesCharsetEncoder(this);
	}

	private static final class XUsAsciiQuotesCharsetDecoder extends TableCharsetDecoder {
		private XUsAsciiQuotesCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x28 && input <= 0x5F) return input - 0x28 + 0x28;
			if (input >= 0x61 && input <= 0x7F) return input - 0x61 + 0x61;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x27: return 0x2019L;
			case 0x60: return 0x2018L;
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

	private static final class XUsAsciiQuotesCharsetEncoder extends TableCharsetEncoder {
		private XUsAsciiQuotesCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			switch (input) {
			case 0x2018: return 0x60L;
			case 0x2019: return 0x27L;
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
