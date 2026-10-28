package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacGujaratiCharset extends Charset {
	public XMacGujaratiCharset() {
		super("x-MacGujarati", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacGujaratiCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacGujaratiCharsetEncoder(this);
	}

	private static final class XMacGujaratiCharsetDecoder extends TableCharsetDecoder {
		private XMacGujaratiCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xA1: return 0x1;
			case 0xAA: return 0x2;
			case 0xDF: return 0x3;
			case 0xE8: return 0x4;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00D7\u2212\u2013\u2014\u2018\u2019\u2026\u2022\u00A9\u00AE\u2122\u0000\u0000\u0000\u0000\u0000\u0965\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0A81\u0A82\u0A83\u0A85\u0A86\u0A87\u0A88\u0A89\u0A8A\u0A8B\u0000\u0A8F\u0A90\u0A8D\u0000\u0A93\u0A94\u0A91".toCharArray();
		}
		private static final char[] GETOUTPUT0_C8 = getOutput0_C8();
		private static final char[] getOutput0_C8() {
			return "\u0AAA\u0AAB\u0AAC\u0AAD\u0AAE\u0AAF\u0000\u0AB0\u0000\u0AB2\u0AB3\u0000\u0AB5\u0AB6\u0AB7\u0AB8\u0AB9\u200E\u0ABE\u0ABF\u0AC0\u0AC1\u0AC2\u0AC3\u0000\u0AC7\u0AC8\u0AC5\u0000\u0ACB\u0ACC\u0AC9\u0ACD\u0ABC\u0964\u0000\u0000\u0000\u0000\u0000\u0000\u0AE6\u0AE7\u0AE8\u0AE9\u0AEA\u0AEB\u0AEC\u0AED\u0AEE\u0AEF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xB3 && input <= 0xC6) return input - 0xB3 + 0xA95;
			if (input >= 0x80 && input <= 0xB2) return GETOUTPUT0_80[input - 0x80];
			if (input >= 0xC8 && input <= 0xFA) return GETOUTPUT0_C8[input - 0xC8];
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xE9: return 0xAD0L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xE9: return 0xAE0L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xE9: return 0xAC4L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xE8: return 0x200C0ACDL;
			case 0xE9: return 0x200D0ACDL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 3: return getOutput3(input);
			case 4: return getOutput4(input);
			default: return 0;
			}
		}
	}

	private static final class XMacGujaratiCharsetEncoder extends TableCharsetEncoder {
		private XMacGujaratiCharsetEncoder(Charset cs) {
			super(cs, 1.01357f, 2f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xACD: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_A81 = getOutput0_A81();
		private static final char[] getOutput0_A81() {
			return "\u00A1\u00A2\u00A3\u0000\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u00AA\u0000\u00AE\u0000\u00AC\u00AD\u00B2\u0000\u00B0\u00B1".toCharArray();
		}
		private static final char[] GETOUTPUT0_AAA = getOutput0_AAA();
		private static final char[] getOutput0_AAA() {
			return "\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CF\u0000\u00D1\u00D2\u0000\u00D4\u00D5\u00D6\u00D7\u00D8\u0000\u0000\u00E9\u0000\u00DA\u00DB\u00DC\u00DD\u00DE\u00DF\uE9DF\u00E3\u0000\u00E1\u00E2\u00E7\u0000\u00E5\u00E6\u00E8\u0000\u0000\uE9A1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uE9AA\u0000\u0000\u0000\u0000\u0000\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA95 && input <= 0xAA8) return input - 0xA95 + 0xB3;
			if (input >= 0xA81 && input <= 0xA94) return GETOUTPUT0_A81[input - 0xA81];
			if (input >= 0xAAA && input <= 0xAEF) return GETOUTPUT0_AAA[input - 0xAAA];
			switch (input) {
			case 0xA9: return 0x88L;
			case 0xAE: return 0x89L;
			case 0xD7: return 0x80L;
			case 0x964: return 0xEAL;
			case 0x965: return 0x90L;
			case 0x200E: return 0xD9L;
			case 0x2013: return 0x82L;
			case 0x2014: return 0x83L;
			case 0x2018: return 0x84L;
			case 0x2019: return 0x85L;
			case 0x2022: return 0x87L;
			case 0x2026: return 0x86L;
			case 0x2122: return 0x8AL;
			case 0x2212: return 0x81L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x200C: return 0xE8E8L;
			case 0x200D: return 0xE9E8L;
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
