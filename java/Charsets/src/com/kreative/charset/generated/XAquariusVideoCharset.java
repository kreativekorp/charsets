package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAquariusVideoCharset extends Charset {
	public XAquariusVideoCharset() {
		super("x-aquarius-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAquariusVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAquariusVideoCharsetEncoder(this);
	}

	private static final class XAquariusVideoCharsetDecoder extends TableCharsetDecoder {
		private XAquariusVideoCharsetDecoder(Charset cs) {
			super(cs, 1.37891f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0xA3, 0xBD, 0xBC, 0xBE, 0xF7, 0xA9, 0x2192, 0x2190, 0x2191, 0x2193, 0x2197, 0x2199, 0x2198, 0x2196, 0xDDF0D833, 0xDDF1D833,
				0xDDF2D833, 0xDDF3D833, 0xDDF4D833, 0xDDE6D833, 0xDDE7D833, 0xDDE8D833, 0xDDE9D833, 0xDDEAD833, 0xDDEBD833, 0xDDF5D833, 0x2597, 0x259D, 0x2596, 0x2598, 0x259A, 0x2584,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x7F && input <= 0xFF) return CommonSubtables.COMMON1202[input - 0x7F];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XAquariusVideoCharsetEncoder extends TableCharsetEncoder {
		private XAquariusVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			case 0xD83D: return 0x2;
			case 0xD83E: return 0x3;
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
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x2571 && input <= 0x25CF) return CommonSubtables.COMMON1203[input - 0x2571];
			switch (input) {
			case 0xA0: return 0xA0L;
			case 0xA3: return 0x1L;
			case 0xA9: return 0x501L;
			case 0xBC: return 0x201L;
			case 0xBD: return 0x101L;
			case 0xBE: return 0x301L;
			case 0xF7: return 0x401L;
			case 0x2190: return 0x701L;
			case 0x2191: return 0x8L;
			case 0x2192: return 0x601L;
			case 0x2193: return 0x9L;
			case 0x2196: return 0xDL;
			case 0x2197: return 0xAL;
			case 0x2198: return 0xCL;
			case 0x2199: return 0xBL;
			case 0x2500: return 0xACL;
			case 0x2502: return 0xD6L;
			case 0x250C: return 0xDEL;
			case 0x2510: return 0xCEL;
			case 0x2514: return 0xCFL;
			case 0x2518: return 0xDFL;
			case 0x251C: return 0xCDL;
			case 0x2524: return 0xDDL;
			case 0x252C: return 0xDCL;
			case 0x2534: return 0xCCL;
			case 0x253C: return 0xC8L;
			case 0x25E2: return 0xC0L;
			case 0x25E3: return 0xC1L;
			case 0x2660: return 0x8AL;
			case 0x2663: return 0xD5L;
			case 0x2665: return 0xD4L;
			case 0x2666: return 0xC5L;
			case 0x2708: return 0x9AL;
			case 0x2B24: return 0x96L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDDE6 && input <= 0xDDFF) return CommonSubtables.COMMON1204[input - 0xDDE6];
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDEE7: return 0x8AL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0xDF00 && input <= 0xDF13) return input - 0xDF00 + 0xA1;
			if (input >= 0xDF28 && input <= 0xDF3B) return input - 0xDF28 + 0xEB;
			if (input >= 0xDF14 && input <= 0xDF27) return CommonSubtables.COMMON1201[input - 0xDF14];
			switch (input) {
			case 0xDF8C: return 0x85L;
			case 0xDF8D: return 0x95L;
			case 0xDF8E: return 0x94L;
			case 0xDF8F: return 0x84L;
			case 0xDFE8: return 0xC2L;
			case 0xDFE9: return 0xCBL;
			case 0xDFEA: return 0xD2L;
			case 0xDFEB: return 0xDBL;
			case 0xDFEC: return 0xC7L;
			case 0xDFED: return 0xC9L;
			case 0xDFEE: return 0xD7L;
			case 0xDFEF: return 0xD9L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 3: return getOutput3(input);
			default: return 0;
			}
		}
	}
}
