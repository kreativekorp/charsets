package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XPetscii82VideoCharset extends Charset {
	public XPetscii82VideoCharset() {
		super("x-petscii82-video", new String[]{"x-petscii-video"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XPetscii82VideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XPetscii82VideoCharsetEncoder(this);
	}

	private static final class XPetscii82VideoCharsetDecoder extends TableCharsetDecoder {
		private XPetscii82VideoCharsetDecoder(Charset cs) {
			super(cs, 1.15625f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1B) return input - 0x0 + 0x40;
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0x9B) return input - 0x80 + 0x40;
			if (input >= 0x40 && input <= 0x7F) return CommonSubtables.COMMON1719[input - 0x40];
			if (input >= 0xA0 && input <= 0xBF) return input - 0xA0 + 0x20;
			if (input >= 0xC0 && input <= 0xFF) return CommonSubtables.COMMON1719[input - 0xC0];
			switch (input) {
			case 0x1C: return 0xA3L;
			case 0x1D: return 0x5DL;
			case 0x1E: return 0x2191L;
			case 0x1F: return 0x2190L;
			case 0x9C: return 0xA3L;
			case 0x9D: return 0x5DL;
			case 0x9E: return 0x2191L;
			case 0x9F: return 0x2190L;
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

	private static final class XPetscii82VideoCharsetEncoder extends TableCharsetEncoder {
		private XPetscii82VideoCharsetEncoder(Charset cs) {
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
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x48 && input <= 0x5D) return input - 0x48 + 0x8;
			if (input >= 0x68 && input <= 0x7A) return input - 0x68 + 0x8;
			if (input >= 0x256D && input <= 0x259D) return CommonSubtables.COMMON1720[input - 0x256D];
			switch (input) {
			case 0x40: return 0x1L;
			case 0x41: return 0x101L;
			case 0x42: return 0x201L;
			case 0x43: return 0x301L;
			case 0x44: return 0x401L;
			case 0x45: return 0x501L;
			case 0x46: return 0x601L;
			case 0x47: return 0x701L;
			case 0x61: return 0x101L;
			case 0x62: return 0x201L;
			case 0x63: return 0x301L;
			case 0x64: return 0x401L;
			case 0x65: return 0x501L;
			case 0x66: return 0x601L;
			case 0x67: return 0x701L;
			case 0xA0: return 0x60L;
			case 0xA3: return 0x1CL;
			case 0x3C0: return 0x5EL;
			case 0x2022: return 0x51L;
			case 0x2190: return 0x1FL;
			case 0x2191: return 0x1EL;
			case 0x2500: return 0x40L;
			case 0x2502: return 0x5DL;
			case 0x250C: return 0x70L;
			case 0x2510: return 0x6EL;
			case 0x2514: return 0x6DL;
			case 0x2518: return 0x7DL;
			case 0x251C: return 0x6BL;
			case 0x2524: return 0x73L;
			case 0x252C: return 0x72L;
			case 0x2534: return 0x71L;
			case 0x253C: return 0x5BL;
			case 0x25CB: return 0x57L;
			case 0x25CF: return 0x51L;
			case 0x25E4: return 0x69L;
			case 0x25E5: return 0x5FL;
			case 0x25E6: return 0x57L;
			case 0x2660: return 0x41L;
			case 0x2663: return 0x58L;
			case 0x2665: return 0x53L;
			case 0x2666: return 0x5AL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDF70 && input <= 0xDF8F) return CommonSubtables.COMMON1721[input - 0xDF70];
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
