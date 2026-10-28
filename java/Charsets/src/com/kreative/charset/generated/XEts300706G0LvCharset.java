package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEts300706G0LvCharset extends Charset {
	public XEts300706G0LvCharset() {
		super("x-ets-300-706-g0-lv", new String[]{"x-ets-300-706-g0-lt"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEts300706G0LvCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEts300706G0LvCharsetEncoder(this);
	}

	private static final class XEts300706G0LvCharsetDecoder extends TableCharsetDecoder {
		private XEts300706G0LvCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x80;
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x40: return 0x160L;
			case 0x5B: return 0x117L;
			case 0x5C: return 0x229L;
			case 0x5D: return 0x17DL;
			case 0x5E: return 0x10DL;
			case 0x5F: return 0x16BL;
			case 0x60: return 0x161L;
			case 0x7B: return 0x105L;
			case 0x7C: return 0x173L;
			case 0x7D: return 0x17EL;
			case 0x7E: return 0x12FL;
			case 0x7F: return 0x25A0L;
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

	private static final class XEts300706G0LvCharsetEncoder extends TableCharsetEncoder {
		private XEts300706G0LvCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x80];
			switch (input) {
			case 0x105: return 0x7BL;
			case 0x10D: return 0x5EL;
			case 0x117: return 0x5BL;
			case 0x12F: return 0x7EL;
			case 0x160: return 0x40L;
			case 0x161: return 0x60L;
			case 0x16B: return 0x5FL;
			case 0x173: return 0x7CL;
			case 0x17D: return 0x5DL;
			case 0x17E: return 0x7DL;
			case 0x229: return 0x5CL;
			case 0x25A0: return 0x7FL;
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
