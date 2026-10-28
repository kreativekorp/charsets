package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSixbitAsciiCharset extends Charset {
	public XSixbitAsciiCharset() {
		super("x-sixbit-ascii", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSixbitAsciiCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSixbitAsciiCharsetEncoder(this);
	}

	private static final class XSixbitAsciiCharsetDecoder extends TableCharsetDecoder {
		private XSixbitAsciiCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x40;
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XSixbitAsciiCharsetEncoder extends TableCharsetEncoder {
		private XSixbitAsciiCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x40 && input <= 0x5F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x40];
			if (input >= 0x68 && input <= 0x7A) return input - 0x68 + 0x8;
			switch (input) {
			case 0x61: return 0x101L;
			case 0x62: return 0x201L;
			case 0x63: return 0x301L;
			case 0x64: return 0x401L;
			case 0x65: return 0x501L;
			case 0x66: return 0x601L;
			case 0x67: return 0x701L;
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
