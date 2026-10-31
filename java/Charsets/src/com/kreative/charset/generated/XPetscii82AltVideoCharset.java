package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XPetscii82AltVideoCharset extends Charset {
	public XPetscii82AltVideoCharset() {
		super("x-petscii82-alt-video", new String[]{"x-petscii-alt-video"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XPetscii82AltVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XPetscii82AltVideoCharsetEncoder(this);
	}

	private static final class XPetscii82AltVideoCharsetDecoder extends TableCharsetDecoder {
		private XPetscii82AltVideoCharsetDecoder(Charset cs) {
			super(cs, 1.07031f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_5B = getOutput0_5B();
		private static final int[] getOutput0_5B() {
			return new int[] {
				0x253C, 0xDF8CD83E, 0x2502, 0xDF96D83E, 0xDF98D83E, 0xA0, 0x258C, 0x2584, 0x2594, 0x2581, 0x258F, 0x2592, 0x2595, 0xDF8FD83E, 0xDF99D83E, 0xDF87D83E,
				0x251C, 0x2597, 0x2514, 0x2510, 0x2582, 0x250C, 0x2534, 0x252C, 0x2524, 0x258E, 0x258D, 0xDF88D83E, 0xDF82D83E, 0xDF83D83E, 0x2583, 0x2713,
				0x2596, 0x259D, 0x2518, 0x2598, 0x259A, 0x40,
			};
		}
		private static final int[] GETOUTPUT0_DB = getOutput0_DB();
		private static final int[] getOutput0_DB() {
			return new int[] {
				0x253C, 0xDF8CD83E, 0x2502, 0xDF96D83E, 0xDF98D83E, 0xA0, 0x258C, 0x2584, 0x2594, 0x2581, 0x258F, 0x2592, 0x2595, 0xDF8FD83E, 0xDF99D83E, 0xDF87D83E,
				0x251C, 0x2597, 0x2514, 0x2510, 0x2582, 0x250C, 0x2534, 0x252C, 0x2524, 0x258E, 0x258D, 0xDF88D83E, 0xDF82D83E, 0xDF83D83E, 0x2583, 0x2713,
				0x2596, 0x259D, 0x2518, 0x2598, 0x259A,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x1 && input <= 0x1A) return input - 0x1 + 0x61;
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x81 && input <= 0x9A) return input - 0x81 + 0x61;
			if (input >= 0x5B && input <= 0x80) return GETOUTPUT0_5B[input - 0x5B];
			if (input >= 0xA0 && input <= 0xBF) return input - 0xA0 + 0x20;
			if (input >= 0xC1 && input <= 0xDA) return input - 0xC1 + 0x41;
			if (input >= 0xDB && input <= 0xFF) return GETOUTPUT0_DB[input - 0xDB];
			switch (input) {
			case 0x0: return 0x40L;
			case 0x1B: return 0x5BL;
			case 0x1C: return 0xA3L;
			case 0x1D: return 0x5DL;
			case 0x1E: return 0x2191L;
			case 0x1F: return 0x2190L;
			case 0x40: return 0x2500L;
			case 0x9B: return 0x5BL;
			case 0x9C: return 0xA3L;
			case 0x9D: return 0x5DL;
			case 0x9E: return 0x2191L;
			case 0x9F: return 0x2190L;
			case 0xC0: return 0x2500L;
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

	private static final class XPetscii82AltVideoCharsetEncoder extends TableCharsetEncoder {
		private XPetscii82AltVideoCharsetEncoder(Charset cs) {
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
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x68 && input <= 0x7A) return input - 0x68 + 0x8;
			if (input >= 0x2581 && input <= 0x259D) return CommonSubtables.COMMON1716[input - 0x2581];
			switch (input) {
			case 0x40: return 0x1L;
			case 0x5B: return 0x1BL;
			case 0x5C: return 0x1CL;
			case 0x5D: return 0x1DL;
			case 0x61: return 0x101L;
			case 0x62: return 0x201L;
			case 0x63: return 0x301L;
			case 0x64: return 0x401L;
			case 0x65: return 0x501L;
			case 0x66: return 0x601L;
			case 0x67: return 0x701L;
			case 0xA0: return 0x60L;
			case 0xA3: return 0x1CL;
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
			case 0x2713: return 0x7AL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDF73: return 0x5DL;
			case 0xDF79: return 0x40L;
			case 0xDF82: return 0x77L;
			case 0xDF83: return 0x78L;
			case 0xDF87: return 0x6AL;
			case 0xDF88: return 0x76L;
			case 0xDF8C: return 0x5CL;
			case 0xDF8F: return 0x68L;
			case 0xDF95: return 0x5EL;
			case 0xDF96: return 0x5EL;
			case 0xDF98: return 0x5FL;
			case 0xDF99: return 0x69L;
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
