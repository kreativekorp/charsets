package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XZxspectrumCp1252Charset extends Charset {
	public XZxspectrumCp1252Charset() {
		super("x-zxspectrum-cp1252", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XZxspectrumCp1252CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XZxspectrumCp1252CharsetEncoder(this);
	}

	private static final class XZxspectrumCp1252CharsetDecoder extends TableCharsetDecoder {
		private XZxspectrumCp1252CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_7F = getOutput0_7F();
		private static final char[] getOutput0_7F() {
			return "\u00A9\u20AC\u25CA\u201A\u0192\u201E\u2026\u2020\u2021\u02C6\u2030\u0160\u2039\u0152\u0141\u017D\u0131\u2318\u2018\u2019\u201C\u201D\u2022\u2013\u2014\u02DC\u2122\u0161\u203A\u0153\u0142\u017E\u0178".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0xA0 && input <= 0xFF) return input - 0xA0 + 0xA0;
			if (input >= 0x7F && input <= 0x9F) return GETOUTPUT0_7F[input - 0x7F];
			switch (input) {
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x5FL;
			case 0x60: return 0xA3L;
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

	private static final class XZxspectrumCp1252CharsetEncoder extends TableCharsetEncoder {
		private XZxspectrumCp1252CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0xAA && input <= 0xFE) return input - 0xAA + 0xAA;
			switch (input) {
			case 0x5F: return 0x5FL;
			case 0xA0: return 0xA0L;
			case 0xA1: return 0xA1L;
			case 0xA2: return 0xA2L;
			case 0xA3: return 0x60L;
			case 0xA4: return 0xA4L;
			case 0xA5: return 0xA5L;
			case 0xA6: return 0xA6L;
			case 0xA7: return 0xA7L;
			case 0xA8: return 0xA8L;
			case 0xA9: return 0x7FL;
			case 0xFF: return 0xFF01L;
			case 0x131: return 0x8FL;
			case 0x141: return 0x8DL;
			case 0x142: return 0x9DL;
			case 0x152: return 0x8CL;
			case 0x153: return 0x9CL;
			case 0x160: return 0x8AL;
			case 0x161: return 0x9AL;
			case 0x178: return 0x9FL;
			case 0x17D: return 0x8EL;
			case 0x17E: return 0x9EL;
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
			case 0x2191: return 0x5EL;
			case 0x2318: return 0x90L;
			case 0x25CA: return 0x81L;
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
