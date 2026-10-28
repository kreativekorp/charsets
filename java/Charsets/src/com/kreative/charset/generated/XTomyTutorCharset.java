package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTomyTutorCharset extends Charset {
	public XTomyTutorCharset() {
		super("x-tomy-tutor", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTomyTutorCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTomyTutorCharsetEncoder(this);
	}

	private static final class XTomyTutorCharsetDecoder extends TableCharsetDecoder {
		private XTomyTutorCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x1 && input <= 0x1D) return input - 0x1 + 0x1;
			if (input >= 0x28 && input <= 0x5B) return input - 0x28 + 0x28;
			if (input >= 0x61 && input <= 0x7B) return input - 0x61 + 0x61;
			if (input >= 0x80 && input <= 0x9F) return input - 0x80 + 0xF080;
			switch (input) {
			case 0x0: return 0xFFFEL;
			case 0x1E: return 0x2588L;
			case 0x1F: return 0xA0L;
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x27: return 0x2019L;
			case 0x5C: return 0xB0L;
			case 0x5D: return 0x5DL;
			case 0x5E: return 0x5EL;
			case 0x5F: return 0x5FL;
			case 0x60: return 0x2018L;
			case 0x7C: return 0x266DL;
			case 0x7D: return 0x7DL;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x7FL;
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

	private static final class XTomyTutorCharsetEncoder extends TableCharsetEncoder {
		private XTomyTutorCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7B) return input - 0x5D + 0x5D;
			if (input >= 0xF07F && input <= 0xF09F) return input - 0xF07F + 0x7F;
			switch (input) {
			case 0x7D: return 0x7DL;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x7FL;
			case 0xA0: return 0x1FL;
			case 0xB0: return 0x5CL;
			case 0x2018: return 0x60L;
			case 0x2019: return 0x27L;
			case 0x2588: return 0x1EL;
			case 0x25A0: return 0x1EL;
			case 0x266D: return 0x7CL;
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
