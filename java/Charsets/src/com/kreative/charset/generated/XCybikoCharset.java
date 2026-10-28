package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XCybikoCharset extends Charset {
	public XCybikoCharset() {
		super("x-cybiko", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XCybikoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XCybikoCharsetEncoder(this);
	}

	private static final class XCybikoCharsetDecoder extends TableCharsetDecoder {
		private XCybikoCharsetDecoder(Charset cs) {
			super(cs, 1.00781f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_7F = getOutput0_7F();
		private static final int[] getOutput0_7F() {
			return new int[] {
				0x2026, 0x2665, 0x25CF, 0x25B6, 0x25B7, 0xDC22DBBF, 0xDC23DBBF, 0x2020, 0x2021, 0x2C6, 0x2030, 0x160, 0x2039, 0x152, 0x141, 0x17D,
				0x131, 0x20AC, 0x2018, 0x2019, 0x201C, 0x201D, 0x2022, 0x2013, 0x2014, 0x2DC, 0x2122, 0x161, 0x203A, 0x153, 0x142, 0x17E,
				0x178,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return input - 0xA0 + 0xA0;
			if (input >= 0x7F && input <= 0x9F) return GETOUTPUT0_7F[input - 0x7F];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XCybikoCharsetEncoder extends TableCharsetEncoder {
		private XCybikoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xDBBF: return 0x1;
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
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFE) return input - 0xA0 + 0xA0;
			switch (input) {
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
			case 0x2C6: return 0x88L;
			case 0x2DC: return 0x98L;
			case 0x2013: return 0x96L;
			case 0x2014: return 0x97L;
			case 0x2018: return 0x91L;
			case 0x2019: return 0x92L;
			case 0x201C: return 0x93L;
			case 0x201D: return 0x94L;
			case 0x2020: return 0x86L;
			case 0x2021: return 0x87L;
			case 0x2022: return 0x95L;
			case 0x2026: return 0x7FL;
			case 0x2030: return 0x89L;
			case 0x2039: return 0x8BL;
			case 0x203A: return 0x9BL;
			case 0x20AC: return 0x90L;
			case 0x2122: return 0x99L;
			case 0x25B6: return 0x82L;
			case 0x25B7: return 0x83L;
			case 0x25CF: return 0x81L;
			case 0x2665: return 0x80L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDC22: return 0x84L;
			case 0xDC23: return 0x85L;
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
