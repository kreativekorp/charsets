package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso88596Charset extends Charset {
	public XIso88596Charset() {
		super("x-iso-8859-6", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso88596CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso88596CharsetEncoder(this);
	}

	private static final class XIso88596CharsetDecoder extends TableCharsetDecoder {
		private XIso88596CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xC1 && input <= 0xDA) return input - 0xC1 + 0x621;
			if (input >= 0xE0 && input <= 0xF2) return input - 0xE0 + 0x640;
			switch (input) {
			case 0xA4: return 0xA4L;
			case 0xAC: return 0x60CL;
			case 0xAD: return 0xADL;
			case 0xBB: return 0x61BL;
			case 0xBF: return 0x61FL;
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

	private static final class XIso88596CharsetEncoder extends TableCharsetEncoder {
		private XIso88596CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0x621 && input <= 0x63A) return input - 0x621 + 0xC1;
			if (input >= 0x640 && input <= 0x652) return input - 0x640 + 0xE0;
			switch (input) {
			case 0xA4: return 0xA4L;
			case 0xAD: return 0xADL;
			case 0x60C: return 0xACL;
			case 0x61B: return 0xBBL;
			case 0x61F: return 0xBFL;
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
