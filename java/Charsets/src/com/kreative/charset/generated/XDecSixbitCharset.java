package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XDecSixbitCharset extends Charset {
	public XDecSixbitCharset() {
		super("x-dec-sixbit", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XDecSixbitCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XDecSixbitCharsetEncoder(this);
	}

	private static final class XDecSixbitCharsetDecoder extends TableCharsetDecoder {
		private XDecSixbitCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return input - 0x0 + 0x20;
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XDecSixbitCharsetEncoder extends TableCharsetEncoder {
		private XDecSixbitCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{31}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x3F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x20];
			if (input >= 0x40 && input <= 0x5F) return input - 0x40 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x21;
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
