package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XRiscosEffCharset extends Charset {
	public XRiscosEffCharset() {
		super("x-riscos-eff", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XRiscosEffCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XRiscosEffCharsetEncoder(this);
	}

	private static final class XRiscosEffCharsetDecoder extends TableCharsetDecoder {
		private XRiscosEffCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u0174\u0176\u1E82\u0130\u0175\u0177\u1E83\u2026\u20AC\u2074\u2122\u0131\u2044\u0192\u2030\u2022\u2018\u2019\u2039\u203A\u201C\u201D\u201E\u2013\u2014\u2212\u0152\u0153\u2020\u2021\uFB01\uFB02".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return input - 0xA0 + 0xA0;
			if (input >= 0x80 && input <= 0x9F) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XRiscosEffCharsetEncoder extends TableCharsetEncoder {
		private XRiscosEffCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFE) return input - 0xA0 + 0xA0;
			switch (input) {
			case 0xFF: return 0xFF01L;
			case 0x130: return 0x83L;
			case 0x131: return 0x8BL;
			case 0x152: return 0x9AL;
			case 0x153: return 0x9BL;
			case 0x174: return 0x80L;
			case 0x175: return 0x84L;
			case 0x176: return 0x81L;
			case 0x177: return 0x85L;
			case 0x192: return 0x8DL;
			case 0x1E82: return 0x82L;
			case 0x1E83: return 0x86L;
			case 0x2013: return 0x97L;
			case 0x2014: return 0x98L;
			case 0x2018: return 0x90L;
			case 0x2019: return 0x91L;
			case 0x201C: return 0x94L;
			case 0x201D: return 0x95L;
			case 0x201E: return 0x96L;
			case 0x2020: return 0x9CL;
			case 0x2021: return 0x9DL;
			case 0x2022: return 0x8FL;
			case 0x2026: return 0x87L;
			case 0x2030: return 0x8EL;
			case 0x2039: return 0x92L;
			case 0x203A: return 0x93L;
			case 0x2044: return 0x8CL;
			case 0x2074: return 0x89L;
			case 0x20AC: return 0x88L;
			case 0x2122: return 0x8AL;
			case 0x2212: return 0x99L;
			case 0xFB01: return 0x9EL;
			case 0xFB02: return 0x9FL;
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
