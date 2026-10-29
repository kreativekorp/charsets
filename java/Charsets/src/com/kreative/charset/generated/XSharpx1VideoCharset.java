package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSharpx1VideoCharset extends Charset {
	public XSharpx1VideoCharset() {
		super("x-sharpx1-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSharpx1VideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSharpx1VideoCharsetEncoder(this);
	}

	private static final class XSharpx1VideoCharsetDecoder extends TableCharsetDecoder {
		private XSharpx1VideoCharsetDecoder(Charset cs) {
			super(cs, 1.00391f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1B) return input - 0x0 + 0x2400;
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7D) return input - 0x5D + 0x5D;
			if (input >= 0x7E && input <= 0xFF) return CommonSubtables.COMMON1734[input - 0x7E];
			switch (input) {
			case 0x1C: return 0x2192L;
			case 0x1D: return 0x2190L;
			case 0x1E: return 0x2191L;
			case 0x1F: return 0x2193L;
			case 0x5C: return 0xA5L;
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

	private static final class XSharpx1VideoCharsetEncoder extends TableCharsetEncoder {
		private XSharpx1VideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83D: return 0x1;
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
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7D) return input - 0x5D + 0x5D;
			if (input >= 0x2408 && input <= 0x241B) return input - 0x2408 + 0x8;
			if (input >= 0x256D && input <= 0x259E) return CommonSubtables.COMMON1735[input - 0x256D];
			if (input >= 0x309B && input <= 0x30FC) return CommonSubtables.COMMON1736[input - 0x309B];
			if (input >= 0xFF01 && input <= 0xFF3B) return input - 0xFF01 + 0x21;
			if (input >= 0xFF3D && input <= 0xFF5D) return input - 0xFF3D + 0x5D;
			if (input >= 0xFF61 && input <= 0xFF9D) return input - 0xFF61 + 0xA1;
			switch (input) {
			case 0xA0: return 0xA0L;
			case 0xA5: return 0x5CL;
			case 0xAF: return 0x7EL;
			case 0x3C0: return 0x7FL;
			case 0x2190: return 0x1DL;
			case 0x2191: return 0x1EL;
			case 0x2192: return 0x1CL;
			case 0x2193: return 0x1FL;
			case 0x2400: return 0x1L;
			case 0x2401: return 0x101L;
			case 0x2402: return 0x201L;
			case 0x2403: return 0x301L;
			case 0x2404: return 0x401L;
			case 0x2405: return 0x501L;
			case 0x2406: return 0x601L;
			case 0x2407: return 0x701L;
			case 0x2500: return 0x90L;
			case 0x2502: return 0x91L;
			case 0x250C: return 0x9AL;
			case 0x2510: return 0x97L;
			case 0x2514: return 0x99L;
			case 0x2518: return 0x98L;
			case 0x251C: return 0x95L;
			case 0x2524: return 0x94L;
			case 0x252C: return 0x93L;
			case 0x2534: return 0x92L;
			case 0x253C: return 0x96L;
			case 0x25CB: return 0xE1L;
			case 0x25CF: return 0xE0L;
			case 0x25E2: return 0xE6L;
			case 0x25E3: return 0xE7L;
			case 0x2660: return 0xE2L;
			case 0x2663: return 0xE5L;
			case 0x2665: return 0xE3L;
			case 0x2666: return 0xE4L;
			case 0x3000: return 0xA0L;
			case 0x3001: return 0xA4L;
			case 0x3002: return 0xA1L;
			case 0x300C: return 0xA2L;
			case 0x300D: return 0xA3L;
			case 0x3012: return 0xFF01L;
			case 0x4EBA: return 0xFDL;
			case 0x5186: return 0xFCL;
			case 0x5206: return 0xF9L;
			case 0x571F: return 0xF1L;
			case 0x5E74: return 0xFBL;
			case 0x65E5: return 0xF7L;
			case 0x6642: return 0xF8L;
			case 0x6708: return 0xF6L;
			case 0x6728: return 0xF3L;
			case 0x6C34: return 0xF4L;
			case 0x706B: return 0xF5L;
			case 0x751F: return 0xFEL;
			case 0x79D2: return 0xFAL;
			case 0x91D1: return 0xF2L;
			case 0xFFE3: return 0x7EL;
			case 0xFFE5: return 0x5CL;
			case 0xFFE8: return 0x91L;
			case 0xFFE9: return 0x1DL;
			case 0xFFEA: return 0x1EL;
			case 0xFFEB: return 0x1CL;
			case 0xFFEC: return 0x1FL;
			case 0xFFEE: return 0xE1L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDF8F: return 0xEFL;
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
