package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XWindows1253Charset extends Charset {
	public XWindows1253Charset() {
		super("x-windows-1253", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XWindows1253CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XWindows1253CharsetEncoder(this);
	}

	private static final class XWindows1253CharsetDecoder extends TableCharsetDecoder {
		private XWindows1253CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u20AC\u0000\u201A\u0192\u201E\u2026\u2020\u2021\u0000\u2030\u0000\u2039\u0000\u0000\u0000\u0000\u0000\u2018\u2019\u201C\u201D\u2022\u2013\u2014\u0000\u2122\u0000\u203A\u0000\u0000\u0000\u0000\u00A0\u0385\u0386\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u0000\u00AB\u00AC\u00AD\u00AE\u2015\u00B0\u00B1\u00B2\u00B3\u0384\u00B5\u00B6\u00B7\u0388\u0389\u038A\u00BB\u038C\u00BD".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xBE && input <= 0xD1) return input - 0xBE + 0x38E;
			if (input >= 0x80 && input <= 0xBD) return GETOUTPUT0_80[input - 0x80];
			if (input >= 0xD3 && input <= 0xFE) return input - 0xD3 + 0x3A3;
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XWindows1253CharsetEncoder extends TableCharsetEncoder {
		private XWindows1253CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u00A0\u0000\u0000\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u0000\u00AB\u00AC\u00AD\u00AE\u0000\u00B0\u00B1\u00B2\u00B3\u0000\u00B5\u00B6\u00B7\u0000\u0000\u0000\u00BB\u0000\u00BD".toCharArray();
		}
		private static final char[] GETOUTPUT0_2013 = getOutput0_2013();
		private static final char[] getOutput0_2013() {
			return "\u0096\u0097\u00AF\u0000\u0000\u0091\u0092\u0082\u0000\u0093\u0094\u0084\u0000\u0086\u0087\u0095\u0000\u0000\u0000\u0085\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0089\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008B\u009B".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xBD) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x38E && input <= 0x3A1) return input - 0x38E + 0xBE;
			if (input >= 0x3A3 && input <= 0x3CE) return input - 0x3A3 + 0xD3;
			if (input >= 0x2013 && input <= 0x203A) return GETOUTPUT0_2013[input - 0x2013];
			switch (input) {
			case 0x192: return 0x83L;
			case 0x384: return 0xB4L;
			case 0x385: return 0xA1L;
			case 0x386: return 0xA2L;
			case 0x388: return 0xB8L;
			case 0x389: return 0xB9L;
			case 0x38A: return 0xBAL;
			case 0x38C: return 0xBCL;
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
