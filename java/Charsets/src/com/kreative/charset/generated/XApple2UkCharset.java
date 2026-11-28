package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XApple2UkCharset extends Charset {
	public XApple2UkCharset() {
		super("x-apple2-uk", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XApple2UkCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XApple2UkCharsetEncoder(this);
	}

	private static final class XApple2UkCharsetDecoder extends TableCharsetDecoder {
		private XApple2UkCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x40;
			if (input >= 0x24 && input <= 0x5F) return input - 0x24 + 0x24;
			if (input >= 0x64 && input <= 0x7F) return input - 0x64 + 0x24;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.DAC0[input - 0x80];
			if (input >= 0xA4 && input <= 0xFE) return input - 0xA4 + 0x24;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0xA3L;
			case 0x60: return 0x20L;
			case 0x61: return 0x21L;
			case 0x62: return 0x22L;
			case 0x63: return 0xA3L;
			case 0xA0: return 0x20L;
			case 0xA1: return 0x21L;
			case 0xA2: return 0x22L;
			case 0xA3: return 0xA3L;
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

	private static final class XApple2UkCharsetEncoder extends TableCharsetEncoder {
		private XApple2UkCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{-65}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x22) return input - 0x0 + 0x80;
			if (input >= 0x24 && input <= 0x7E) return input - 0x24 + 0xA4;
			switch (input) {
			case 0x7F: return 0xFF01L;
			case 0xA3: return 0xA3L;
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
