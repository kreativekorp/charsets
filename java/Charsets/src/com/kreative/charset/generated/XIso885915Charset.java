package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso885915Charset extends Charset {
	public XIso885915Charset() {
		super("x-iso-8859-15", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso885915CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso885915CharsetEncoder(this);
	}

	private static final class XIso885915CharsetDecoder extends TableCharsetDecoder {
		private XIso885915CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA3) return input - 0x20 + 0x20;
			if (input >= 0xBF && input <= 0xFF) return input - 0xBF + 0xBF;
			if (input >= 0xA4 && input <= 0xBE) return CommonSubtables.COMMON1234[input - 0xA4];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIso885915CharsetEncoder extends TableCharsetEncoder {
		private XIso885915CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A5 = getOutput0_A5();
		private static final char[] getOutput0_A5() {
			return "\u00A5\u0000\u00A7\u0000\u00A9\u00AA\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u0000\u00B5\u00B6\u00B7\u0000\u00B9\u00BA\u00BB".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA3) return input - 0x20 + 0x20;
			if (input >= 0xBF && input <= 0xFE) return input - 0xBF + 0xBF;
			if (input >= 0xA5 && input <= 0xBB) return GETOUTPUT0_A5[input - 0xA5];
			switch (input) {
			case 0xFF: return 0xFF01L;
			case 0x152: return 0xBCL;
			case 0x153: return 0xBDL;
			case 0x160: return 0xA6L;
			case 0x161: return 0xA8L;
			case 0x178: return 0xBEL;
			case 0x17D: return 0xB4L;
			case 0x17E: return 0xB8L;
			case 0x20AC: return 0xA4L;
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
