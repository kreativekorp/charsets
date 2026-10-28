package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAcornMode7Charset extends Charset {
	public XAcornMode7Charset() {
		super("x-acorn-mode7", new String[]{"x-bbc-mode7"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAcornMode7CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAcornMode7CharsetEncoder(this);
	}

	private static final class XAcornMode7CharsetDecoder extends TableCharsetDecoder {
		private XAcornMode7CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5A) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0x7F && input <= 0x9F) return input - 0x7F + 0x7F;
			if (input >= 0xA4 && input <= 0xDA) return input - 0xA4 + 0x24;
			if (input >= 0xE1 && input <= 0xFA) return input - 0xE1 + 0x61;
			switch (input) {
			case 0x5B: return 0x2190L;
			case 0x5C: return 0xBDL;
			case 0x5D: return 0x2192L;
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x2014L;
			case 0x60: return 0xA3L;
			case 0x7B: return 0xBCL;
			case 0x7C: return 0x2016L;
			case 0x7D: return 0xBEL;
			case 0x7E: return 0xF7L;
			case 0xA0: return 0x20L;
			case 0xA1: return 0x21L;
			case 0xA2: return 0x22L;
			case 0xA3: return 0xA3L;
			case 0xDB: return 0x2190L;
			case 0xDC: return 0xBDL;
			case 0xDD: return 0x2192L;
			case 0xDE: return 0x2191L;
			case 0xDF: return 0x23L;
			case 0xE0: return 0x2014L;
			case 0xFB: return 0xBCL;
			case 0xFC: return 0x2016L;
			case 0xFD: return 0xBEL;
			case 0xFE: return 0xF7L;
			case 0xFF: return 0x25A0L;
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

	private static final class XAcornMode7CharsetEncoder extends TableCharsetEncoder {
		private XAcornMode7CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5A) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0x7F && input <= 0x9F) return input - 0x7F + 0x7F;
			switch (input) {
			case 0xA3: return 0x60L;
			case 0xBC: return 0x7BL;
			case 0xBD: return 0x5CL;
			case 0xBE: return 0x7DL;
			case 0xF7: return 0x7EL;
			case 0x2014: return 0x5FL;
			case 0x2015: return 0x5FL;
			case 0x2016: return 0x7CL;
			case 0x2190: return 0x5BL;
			case 0x2191: return 0x5EL;
			case 0x2192: return 0x5DL;
			case 0x2500: return 0x5FL;
			case 0x25A0: return 0xFF01L;
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
