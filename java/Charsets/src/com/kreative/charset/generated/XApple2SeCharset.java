package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XApple2SeCharset extends Charset {
	public XApple2SeCharset() {
		super("x-apple2-se", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XApple2SeCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XApple2SeCharsetEncoder(this);
	}

	private static final class XApple2SeCharsetDecoder extends TableCharsetDecoder {
		private XApple2SeCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1A) return input - 0x0 + 0x40;
			if (input >= 0x20 && input <= 0x5A) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7F) return input - 0x60 + 0x20;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.DAC0[input - 0x80];
			if (input >= 0xA0 && input <= 0xDA) return input - 0xA0 + 0x20;
			if (input >= 0xDE && input <= 0xFA) return input - 0xDE + 0x5E;
			switch (input) {
			case 0x1B: return 0xC4L;
			case 0x1C: return 0xD6L;
			case 0x1D: return 0xC5L;
			case 0x1E: return 0x5EL;
			case 0x1F: return 0x5FL;
			case 0x5B: return 0xC4L;
			case 0x5C: return 0xD6L;
			case 0x5D: return 0xC5L;
			case 0x5E: return 0x5EL;
			case 0x5F: return 0x5FL;
			case 0xDB: return 0xC4L;
			case 0xDC: return 0xD6L;
			case 0xDD: return 0xC5L;
			case 0xFB: return 0xE4L;
			case 0xFC: return 0xF6L;
			case 0xFD: return 0xE5L;
			case 0xFE: return 0x7EL;
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

	private static final class XApple2SeCharsetEncoder extends TableCharsetEncoder {
		private XApple2SeCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{-65}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x5A) return input - 0x0 + 0x80;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0xDE;
			switch (input) {
			case 0x7E: return 0xFEL;
			case 0x7F: return 0xFF01L;
			case 0xC4: return 0xDBL;
			case 0xC5: return 0xDDL;
			case 0xD6: return 0xDCL;
			case 0xE4: return 0xFBL;
			case 0xE5: return 0xFDL;
			case 0xF6: return 0xFCL;
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
