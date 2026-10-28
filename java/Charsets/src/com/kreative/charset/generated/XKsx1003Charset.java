package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKsx1003Charset extends Charset {
	public XKsx1003Charset() {
		super("x-ksx-1003", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKsx1003CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKsx1003CharsetEncoder(this);
	}

	private static final class XKsx1003CharsetDecoder extends TableCharsetDecoder {
		private XKsx1003CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7F) return input - 0x5D + 0x5D;
			switch (input) {
			case 0x5C: return 0x20A9L;
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

	private static final class XKsx1003CharsetEncoder extends TableCharsetEncoder {
		private XKsx1003CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7F) return input - 0x5D + 0x5D;
			switch (input) {
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
