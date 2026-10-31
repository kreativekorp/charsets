package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XPetscii80AltCharset extends Charset {
	public XPetscii80AltCharset() {
		super("x-petscii80-alt", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XPetscii80AltCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XPetscii80AltCharsetEncoder(this);
	}

	private static final class XPetscii80AltCharsetDecoder extends TableCharsetDecoder {
		private XPetscii80AltCharsetDecoder(Charset cs) {
			super(cs, 1.07422f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x40) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x61;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x41;
			if (input >= 0x80 && input <= 0xA0) return input - 0x80 + 0x80;
			if (input >= 0xC1 && input <= 0xDA) return input - 0xC1 + 0x41;
			if (input >= 0xA1 && input <= 0xC0) return CommonSubtables.COMMON1717[input - 0xA1];
			if (input >= 0xDB && input <= 0xFF) return CommonSubtables.COMMON1727[input - 0xDB];
			switch (input) {
			case 0x5B: return 0x5BL;
			case 0x5C: return 0xA3L;
			case 0x5D: return 0x5DL;
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x2190L;
			case 0x60: return 0x2500L;
			case 0x7B: return 0x253CL;
			case 0x7C: return 0xDF8CD83EL;
			case 0x7D: return 0x2502L;
			case 0x7E: return 0xDF95D83EL;
			case 0x7F: return 0xDF98D83EL;
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

	private static final class XPetscii80AltCharsetEncoder extends TableCharsetEncoder {
		private XPetscii80AltCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83E: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x40) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0xC1;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x41;
			if (input >= 0x80 && input <= 0xA0) return input - 0x80 + 0x80;
			if (input >= 0x2581 && input <= 0x259D) return CommonSubtables.COMMON1718[input - 0x2581];
			switch (input) {
			case 0x5B: return 0x5BL;
			case 0x5C: return 0x5CL;
			case 0x5D: return 0x5DL;
			case 0xA3: return 0x5CL;
			case 0x2190: return 0x5FL;
			case 0x2191: return 0x5EL;
			case 0x2500: return 0xC0L;
			case 0x2502: return 0xDDL;
			case 0x250C: return 0xB0L;
			case 0x2510: return 0xAEL;
			case 0x2514: return 0xADL;
			case 0x2518: return 0xBDL;
			case 0x251C: return 0xABL;
			case 0x2524: return 0xB3L;
			case 0x252C: return 0xB2L;
			case 0x2534: return 0xB1L;
			case 0x253C: return 0xDBL;
			case 0x2713: return 0xBAL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDF73: return 0xDDL;
			case 0xDF79: return 0xC0L;
			case 0xDF82: return 0xB7L;
			case 0xDF83: return 0xB8L;
			case 0xDF87: return 0xAAL;
			case 0xDF88: return 0xB6L;
			case 0xDF8C: return 0xDCL;
			case 0xDF8F: return 0xA8L;
			case 0xDF95: return 0xDEL;
			case 0xDF96: return 0xDEL;
			case 0xDF98: return 0xDFL;
			case 0xDF99: return 0xA9L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			default: return 0;
			}
		}
	}
}
