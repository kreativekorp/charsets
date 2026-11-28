package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XApple2DkCharset extends Charset {
	public XApple2DkCharset() {
		super("x-apple2-dk", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XApple2DkCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XApple2DkCharsetEncoder(this);
	}

	private static final class XApple2DkCharsetDecoder extends TableCharsetDecoder {
		private XApple2DkCharsetDecoder(Charset cs) {
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
			case 0x1B: return 0xC6L;
			case 0x1C: return 0xD8L;
			case 0x1D: return 0xC5L;
			case 0x1E: return 0x5EL;
			case 0x1F: return 0x5FL;
			case 0x5B: return 0xC6L;
			case 0x5C: return 0xD8L;
			case 0x5D: return 0xC5L;
			case 0x5E: return 0x5EL;
			case 0x5F: return 0x5FL;
			case 0xDB: return 0xC6L;
			case 0xDC: return 0xD8L;
			case 0xDD: return 0xC5L;
			case 0xFB: return 0xE6L;
			case 0xFC: return 0xF8L;
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

	private static final class XApple2DkCharsetEncoder extends TableCharsetEncoder {
		private XApple2DkCharsetEncoder(Charset cs) {
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
			case 0xC5: return 0xDDL;
			case 0xC6: return 0xDBL;
			case 0xD8: return 0xDCL;
			case 0xE5: return 0xFDL;
			case 0xE6: return 0xFBL;
			case 0xF8: return 0xFCL;
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
