package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XColecoAdamOs7Charset extends Charset {
	public XColecoAdamOs7Charset() {
		super("x-coleco-adam-os7", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XColecoAdamOs7CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XColecoAdamOs7CharsetEncoder(this);
	}

	private static final class XColecoAdamOs7CharsetDecoder extends TableCharsetDecoder {
		private XColecoAdamOs7CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7B) return input - 0x20 + 0x20;
			switch (input) {
			case 0x7C: return 0x3EL;
			case 0x7D: return 0x7DL;
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

	private static final class XColecoAdamOs7CharsetEncoder extends TableCharsetEncoder {
		private XColecoAdamOs7CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7B) return input - 0x20 + 0x20;
			switch (input) {
			case 0x7D: return 0x7DL;
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
