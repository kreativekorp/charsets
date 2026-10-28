package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XWindows1254Charset extends Charset {
	public XWindows1254Charset() {
		super("x-windows-1254", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XWindows1254CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XWindows1254CharsetEncoder(this);
	}

	private static final class XWindows1254CharsetDecoder extends TableCharsetDecoder {
		private XWindows1254CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u20AC\u0000\u201A\u0192\u201E\u2026\u2020\u2021\u02C6\u2030\u0160\u2039\u0152\u0000\u0000\u0000\u0000\u2018\u2019\u201C\u201D\u2022\u2013\u2014\u02DC\u2122\u0161\u203A\u0153\u0000\u0000\u0178".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xCF) return input - 0xA0 + 0xA0;
			if (input >= 0x80 && input <= 0x9F) return GETOUTPUT0_80[input - 0x80];
			if (input >= 0xDF && input <= 0xEF) return input - 0xDF + 0xDF;
			if (input >= 0xF0 && input <= 0xFF) return CommonSubtables.COMMON1235[input - 0xF0];
			switch (input) {
			case 0xD0: return 0x11EL;
			case 0xD1: return 0xD1L;
			case 0xD2: return 0xD2L;
			case 0xD3: return 0xD3L;
			case 0xD4: return 0xD4L;
			case 0xD5: return 0xD5L;
			case 0xD6: return 0xD6L;
			case 0xD7: return 0xD7L;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xDD: return 0x130L;
			case 0xDE: return 0x15EL;
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

	private static final class XWindows1254CharsetEncoder extends TableCharsetEncoder {
		private XWindows1254CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xCF) return input - 0xA0 + 0xA0;
			if (input >= 0xDF && input <= 0xEF) return input - 0xDF + 0xDF;
			switch (input) {
			case 0xD1: return 0xD1L;
			case 0xD2: return 0xD2L;
			case 0xD3: return 0xD3L;
			case 0xD4: return 0xD4L;
			case 0xD5: return 0xD5L;
			case 0xD6: return 0xD6L;
			case 0xD7: return 0xD7L;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xF1: return 0xF1L;
			case 0xF2: return 0xF2L;
			case 0xF3: return 0xF3L;
			case 0xF4: return 0xF4L;
			case 0xF5: return 0xF5L;
			case 0xF6: return 0xF6L;
			case 0xF7: return 0xF7L;
			case 0xF8: return 0xF8L;
			case 0xF9: return 0xF9L;
			case 0xFA: return 0xFAL;
			case 0xFB: return 0xFBL;
			case 0xFC: return 0xFCL;
			case 0xFF: return 0xFF01L;
			case 0x11E: return 0xD0L;
			case 0x11F: return 0xF0L;
			case 0x130: return 0xDDL;
			case 0x131: return 0xFDL;
			case 0x152: return 0x8CL;
			case 0x153: return 0x9CL;
			case 0x15E: return 0xDEL;
			case 0x15F: return 0xFEL;
			case 0x160: return 0x8AL;
			case 0x161: return 0x9AL;
			case 0x178: return 0x9FL;
			case 0x192: return 0x83L;
			case 0x2C6: return 0x88L;
			case 0x2DC: return 0x98L;
			case 0x2013: return 0x96L;
			case 0x2014: return 0x97L;
			case 0x2018: return 0x91L;
			case 0x2019: return 0x92L;
			case 0x201A: return 0x82L;
			case 0x201C: return 0x93L;
			case 0x201D: return 0x94L;
			case 0x201E: return 0x84L;
			case 0x2020: return 0x86L;
			case 0x2021: return 0x87L;
			case 0x2022: return 0x95L;
			case 0x2026: return 0x85L;
			case 0x2030: return 0x89L;
			case 0x2039: return 0x8BL;
			case 0x203A: return 0x9BL;
			case 0x20AC: return 0x80L;
			case 0x2122: return 0x99L;
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
