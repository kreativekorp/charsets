package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XApple2FrCharset extends Charset {
	public XApple2FrCharset() {
		super("x-apple2-fr", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XApple2FrCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XApple2FrCharsetEncoder(this);
	}

	private static final class XApple2FrCharsetDecoder extends TableCharsetDecoder {
		private XApple2FrCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x1 && input <= 0x1A) return input - 0x1 + 0x41;
			if (input >= 0x24 && input <= 0x3F) return input - 0x24 + 0x24;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x64 && input <= 0x7F) return input - 0x64 + 0x24;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.DAC0[input - 0x80];
			if (input >= 0xA4 && input <= 0xBF) return input - 0xA4 + 0x24;
			if (input >= 0xC1 && input <= 0xDA) return input - 0xC1 + 0x41;
			if (input >= 0xDE && input <= 0xFA) return input - 0xDE + 0x5E;
			switch (input) {
			case 0x0: return 0xE0L;
			case 0x1B: return 0xB0L;
			case 0x1C: return 0xE7L;
			case 0x1D: return 0xA7L;
			case 0x1E: return 0x5EL;
			case 0x1F: return 0x5FL;
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0xA3L;
			case 0x40: return 0xE0L;
			case 0x5B: return 0xB0L;
			case 0x5C: return 0xE7L;
			case 0x5D: return 0xA7L;
			case 0x5E: return 0x5EL;
			case 0x5F: return 0x5FL;
			case 0x60: return 0x20L;
			case 0x61: return 0x21L;
			case 0x62: return 0x22L;
			case 0x63: return 0xA3L;
			case 0xA0: return 0x20L;
			case 0xA1: return 0x21L;
			case 0xA2: return 0x22L;
			case 0xA3: return 0xA3L;
			case 0xC0: return 0xE0L;
			case 0xDB: return 0xB0L;
			case 0xDC: return 0xE7L;
			case 0xDD: return 0xA7L;
			case 0xFB: return 0xE9L;
			case 0xFC: return 0xF9L;
			case 0xFD: return 0xE8L;
			case 0xFE: return 0xA8L;
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

	private static final class XApple2FrCharsetEncoder extends TableCharsetEncoder {
		private XApple2FrCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{-65}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x22) return input - 0x0 + 0x80;
			if (input >= 0x24 && input <= 0x3F) return input - 0x24 + 0xA4;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0xC1;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0xDE;
			switch (input) {
			case 0x7F: return 0xFF01L;
			case 0xA3: return 0xA3L;
			case 0xA7: return 0xDDL;
			case 0xA8: return 0xFEL;
			case 0xB0: return 0xDBL;
			case 0xE0: return 0xC0L;
			case 0xE7: return 0xDCL;
			case 0xE8: return 0xFDL;
			case 0xE9: return 0xFBL;
			case 0xF9: return 0xFCL;
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
