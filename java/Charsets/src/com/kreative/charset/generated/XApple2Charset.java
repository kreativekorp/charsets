package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XApple2Charset extends Charset {
	public XApple2Charset() {
		super("x-apple2", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XApple2CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XApple2CharsetEncoder(this);
	}

	private static final class XApple2CharsetDecoder extends TableCharsetDecoder {
		private XApple2CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x40;
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7F) return input - 0x60 + 0x20;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.DECODE_ASCII_C0[input - 0x80];
			if (input >= 0xA0 && input <= 0xFE) return input - 0xA0 + 0x20;
			switch (input) {
			case 0xFF: return 0x2427L;
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

	private static final class XApple2CharsetEncoder extends TableCharsetEncoder {
		private XApple2CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{-65}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x7E) return input - 0x0 + 0x80;
			switch (input) {
			case 0x7F: return 0xFF01L;
			case 0x2427: return 0xFF01L;
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
