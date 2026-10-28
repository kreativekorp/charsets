package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XWindows1255Charset extends Charset {
	public XWindows1255Charset() {
		super("x-windows-1255", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XWindows1255CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XWindows1255CharsetEncoder(this);
	}

	private static final class XWindows1255CharsetDecoder extends TableCharsetDecoder {
		private XWindows1255CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u20AC\u0000\u201A\u0192\u201E\u2026\u2020\u2021\u02C6\u2030\u0000\u2039\u0000\u0000\u0000\u0000\u0000\u2018\u2019\u201C\u201D\u2022\u2013\u2014\u02DC\u2122\u0000\u203A\u0000\u0000\u0000\u0000\u00A0\u00A1\u00A2\u00A3\u20AA\u00A5\u00A6\u00A7\u00A8\u00A9\u00D7\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u00F7\u00BB\u00BC\u00BD\u00BE\u00BF\u05B0\u05B1\u05B2\u05B3\u05B4\u05B5\u05B6\u05B7\u05B8\u05B9\u0000\u05BB\u05BC\u05BD\u05BE\u05BF\u05C0\u05C1\u05C2\u05C3\u05F0\u05F1\u05F2\u05F3\u05F4".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xE0 && input <= 0xFA) return input - 0xE0 + 0x5D0;
			if (input >= 0x80 && input <= 0xD8) return GETOUTPUT0_80[input - 0x80];
			switch (input) {
			case 0xFD: return 0x200EL;
			case 0xFE: return 0x200FL;
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

	private static final class XWindows1255CharsetEncoder extends TableCharsetEncoder {
		private XWindows1255CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u00A0\u00A1\u00A2\u00A3\u0000\u00A5\u00A6\u00A7\u00A8\u00A9\u0000\u00AB\u00AC\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u00B4\u00B5\u00B6\u00B7\u00B8\u00B9\u0000\u00BB\u00BC\u00BD\u00BE\u00BF".toCharArray();
		}
		private static final char[] GETOUTPUT0_5B0 = getOutput0_5B0();
		private static final char[] getOutput0_5B0() {
			return "\u00C0\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u00C7\u00C8\u00C9\u0000\u00CB\u00CC\u00CD\u00CE\u00CF\u00D0\u00D1\u00D2\u00D3".toCharArray();
		}
		private static final char[] GETOUTPUT0_200E = getOutput0_200E();
		private static final char[] getOutput0_200E() {
			return "\u00FD\u00FE\u0000\u0000\u0000\u0096\u0097\u0000\u0000\u0000\u0091\u0092\u0082\u0000\u0093\u0094\u0084\u0000\u0086\u0087\u0095\u0000\u0000\u0000\u0085\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0089\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008B\u009B".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xBF) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x5D0 && input <= 0x5EA) return input - 0x5D0 + 0xE0;
			if (input >= 0x5B0 && input <= 0x5C3) return GETOUTPUT0_5B0[input - 0x5B0];
			if (input >= 0x200E && input <= 0x203A) return GETOUTPUT0_200E[input - 0x200E];
			switch (input) {
			case 0xD7: return 0xAAL;
			case 0xF7: return 0xBAL;
			case 0x192: return 0x83L;
			case 0x2C6: return 0x88L;
			case 0x2DC: return 0x98L;
			case 0x5F0: return 0xD4L;
			case 0x5F1: return 0xD5L;
			case 0x5F2: return 0xD6L;
			case 0x5F3: return 0xD7L;
			case 0x5F4: return 0xD8L;
			case 0x20AA: return 0xA4L;
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
