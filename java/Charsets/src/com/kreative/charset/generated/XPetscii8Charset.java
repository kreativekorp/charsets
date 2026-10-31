package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XPetscii8Charset extends Charset {
	public XPetscii8Charset() {
		super("x-petscii8", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XPetscii8CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XPetscii8CharsetEncoder(this);
	}

	private static final class XPetscii8CharsetDecoder extends TableCharsetDecoder {
		private XPetscii8CharsetDecoder(Charset cs) {
			super(cs, 1.10156f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final int[] getOutput0_A1() {
			return new int[] {
				0x258C, 0x2584, 0x2594, 0x2581, 0x258F, 0x2592, 0x2595, 0xDF8FD83E, 0x25E4, 0xDF87D83E, 0x251C, 0x2597, 0x2514, 0x2510, 0x2582, 0x250C,
				0x2534, 0x252C, 0x2524, 0x258E, 0x258D, 0xDF88D83E, 0xDF82D83E, 0xDF83D83E, 0x2583, 0xDF7FD83E, 0x2596, 0x259D, 0x2518, 0x2598, 0x259A, 0x2500,
				0x2660, 0xDF72D83E, 0xDF78D83E, 0xDF77D83E, 0xDF76D83E, 0xDF7AD83E, 0xDF71D83E, 0xDF74D83E, 0x256E, 0x2570, 0x256F, 0xDF7CD83E, 0x2572, 0x2571, 0xDF7DD83E, 0xDF7ED83E,
				0x25CF, 0xDF7BD83E, 0x2665, 0xDF70D83E, 0x256D, 0x2573, 0x25CB, 0x2663, 0xDF75D83E, 0x2666, 0x253C, 0xDF8CD83E, 0x2502, 0x3C0, 0x25E5, 0xDF79D83E,
				0xA1, 0xA2, 0xA3, 0x20AC, 0xA5, 0x2022, 0xA7, 0xDF95D83E, 0xDF99D83E, 0x25E6, 0xAB, 0x2190, 0x2191, 0x2192, 0x2193, 0xB0,
				0xB1, 0xAE, 0xA9, 0xD7, 0xB5, 0xB6, 0xB7, 0xF7, 0xBF, 0x2713, 0xBB, 0xAC, 0xDF73D83E, 0xDF96D83E, 0xDF98D83E,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFF) return GETOUTPUT0_A1[input - 0xA1];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XPetscii8CharsetEncoder extends TableCharsetEncoder {
		private XPetscii8CharsetEncoder(Charset cs) {
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
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00E1\u00E2\u00E3\u0000\u00E5\u0000\u00E7\u0000\u00F3\u0000\u00EB\u00FC\u0000\u00F2\u0000\u00F0\u00F1\u0000\u0000\u0000\u00F5\u00F6\u00F7\u0000\u0000\u0000\u00FB\u0000\u0000\u0000\u00F9".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xBF) return GETOUTPUT0_A1[input - 0xA1];
			if (input >= 0x256D && input <= 0x259D) return CommonSubtables.COMMON1724[input - 0x256D];
			switch (input) {
			case 0xD7: return 0xF4L;
			case 0xF7: return 0xF8L;
			case 0x3C0: return 0xDEL;
			case 0x2022: return 0xE6L;
			case 0x20AC: return 0xE4L;
			case 0x2190: return 0xECL;
			case 0x2191: return 0xEDL;
			case 0x2192: return 0xEEL;
			case 0x2193: return 0xEFL;
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
			case 0x25E6: return 0xEAL;
			case 0x2660: return 0xC1L;
			case 0x2663: return 0xD8L;
			case 0x2665: return 0xD3L;
			case 0x2666: return 0xDAL;
			case 0x2713: return 0xFAL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DF70 = getOutput1_DF70();
		private static final char[] getOutput1_DF70() {
			return "\u00D4\u00C7\u00C2\u00FD\u00C8\u00D9\u00C5\u00C4\u00C3\u00E0\u00C6\u00D2\u00CC\u00CF\u00D0\u00BA\u0000\u0000\u00B7\u00B8\u0000\u0000\u0000\u00AA\u00B6\u0000\u0000\u0000\u00DC\u0000\u0000\u00A8\u0000\u0000\u0000\u0000\u0000\u00E8\u00FE\u0000\uFF01\u00E9".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xDF70 && input <= 0xDF99) return GETOUTPUT1_DF70[input - 0xDF70];
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
