package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XWindows1251Charset extends Charset {
	public XWindows1251Charset() {
		super("x-windows-1251", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XWindows1251CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XWindows1251CharsetEncoder(this);
	}

	private static final class XWindows1251CharsetDecoder extends TableCharsetDecoder {
		private XWindows1251CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u0402\u0403\u201A\u0453\u201E\u2026\u2020\u2021\u20AC\u2030\u0409\u2039\u040A\u040C\u040B\u040F\u0452\u2018\u2019\u201C\u201D\u2022\u2013\u2014\u0000\u2122\u0459\u203A\u045A\u045C\u045B\u045F\u00A0\u040E\u045E\u0408\u00A4\u0490\u00A6\u00A7\u0401\u00A9\u0404\u00AB\u00AC\u00AD\u00AE\u0407\u00B0\u00B1\u0406\u0456\u0491\u00B5\u00B6\u00B7\u0451\u2116\u0454\u00BB\u0458\u0405\u0455\u0457".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xC0 && input <= 0xFF) return input - 0xC0 + 0x410;
			if (input >= 0x80 && input <= 0xBF) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XWindows1251CharsetEncoder extends TableCharsetEncoder {
		private XWindows1251CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x410 && input <= 0x44E) return input - 0x410 + 0xC0;
			switch (input) {
			case 0xA0: return 0xA0L;
			case 0xA4: return 0xA4L;
			case 0xA6: return 0xA6L;
			case 0xA7: return 0xA7L;
			case 0xA9: return 0xA9L;
			case 0xAB: return 0xABL;
			case 0xAC: return 0xACL;
			case 0xAD: return 0xADL;
			case 0xAE: return 0xAEL;
			case 0xB0: return 0xB0L;
			case 0xB1: return 0xB1L;
			case 0xB5: return 0xB5L;
			case 0xB6: return 0xB6L;
			case 0xB7: return 0xB7L;
			case 0xBB: return 0xBBL;
			case 0x401: return 0xA8L;
			case 0x402: return 0x80L;
			case 0x403: return 0x81L;
			case 0x404: return 0xAAL;
			case 0x405: return 0xBDL;
			case 0x406: return 0xB2L;
			case 0x407: return 0xAFL;
			case 0x408: return 0xA3L;
			case 0x409: return 0x8AL;
			case 0x40A: return 0x8CL;
			case 0x40B: return 0x8EL;
			case 0x40C: return 0x8DL;
			case 0x40E: return 0xA1L;
			case 0x40F: return 0x8FL;
			case 0x44F: return 0xFF01L;
			case 0x451: return 0xB8L;
			case 0x452: return 0x90L;
			case 0x453: return 0x83L;
			case 0x454: return 0xBAL;
			case 0x455: return 0xBEL;
			case 0x456: return 0xB3L;
			case 0x457: return 0xBFL;
			case 0x458: return 0xBCL;
			case 0x459: return 0x9AL;
			case 0x45A: return 0x9CL;
			case 0x45B: return 0x9EL;
			case 0x45C: return 0x9DL;
			case 0x45E: return 0xA2L;
			case 0x45F: return 0x9FL;
			case 0x490: return 0xA5L;
			case 0x491: return 0xB4L;
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
			case 0x20AC: return 0x88L;
			case 0x2116: return 0xB9L;
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
