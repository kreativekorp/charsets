package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XPetscii77Charset extends Charset {
	public XPetscii77Charset() {
		super("x-petscii77", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XPetscii77CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XPetscii77CharsetEncoder(this);
	}

	private static final class XPetscii77CharsetDecoder extends TableCharsetDecoder {
		private XPetscii77CharsetDecoder(Charset cs) {
			super(cs, 1.10156f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7F) return input - 0x60 + 0x20;
			if (input >= 0x80 && input <= 0xA0) return input - 0x80 + 0x80;
			if (input >= 0xA1 && input <= 0xFF) return CommonSubtables.COMMON1723[input - 0xA1];
			switch (input) {
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x2190L;
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

	private static final class XPetscii77CharsetEncoder extends TableCharsetEncoder {
		private XPetscii77CharsetEncoder(Charset cs) {
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
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x41;
			if (input >= 0x80 && input <= 0xA0) return input - 0x80 + 0x80;
			if (input >= 0x256D && input <= 0x259D) return CommonSubtables.COMMON1724[input - 0x256D];
			switch (input) {
			case 0xA3: return 0x5CL;
			case 0x3C0: return 0xDEL;
			case 0x2022: return 0xD1L;
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
			case 0x25CB: return 0xD7L;
			case 0x25CF: return 0xD1L;
			case 0x25E4: return 0xA9L;
			case 0x25E5: return 0xDFL;
			case 0x25E6: return 0xD7L;
			case 0x2660: return 0xC1L;
			case 0x2663: return 0xD8L;
			case 0x2665: return 0xD3L;
			case 0x2666: return 0xDAL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDF70 && input <= 0xDF8F) return CommonSubtables.COMMON1725[input - 0xDF70];
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
