package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacDevanagariCharset extends Charset {
	public XMacDevanagariCharset() {
		super("x-MacDevanagari", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacDevanagariCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacDevanagariCharsetEncoder(this);
	}

	private static final class XMacDevanagariCharsetDecoder extends TableCharsetDecoder {
		private XMacDevanagariCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xA1: return 0x1;
			case 0xA6: return 0x2;
			case 0xA7: return 0x3;
			case 0xAA: return 0x4;
			case 0xB3: return 0x5;
			case 0xB4: return 0x6;
			case 0xB5: return 0x7;
			case 0xBA: return 0x8;
			case 0xBF: return 0x9;
			case 0xC0: return 0xA;
			case 0xC9: return 0xB;
			case 0xDB: return 0xC;
			case 0xDC: return 0xD;
			case 0xDF: return 0xE;
			case 0xE8: return 0xF;
			case 0xEA: return 0x10;
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
			return "\u00D7\u2212\u2013\u2014\u2018\u2019\u2026\u2022\u00A9\u00AE\u2122\u0000\u0000\u0000\u0000\u0000\u0965\u0970\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0901\u0902\u0903\u0905\u0906\u0907\u0908\u0909\u090A\u090B\u090E\u090F\u0910\u090D\u0912\u0913\u0914\u0911".toCharArray();
		}
		private static final char[] GETOUTPUT0_CE = getOutput0_CE();
		private static final char[] getOutput0_CE() {
			return "\u095F\u0930\u0931\u0932\u0933\u0934\u0935\u0936\u0937\u0938\u0939\u200E\u093E\u093F\u0940\u0941\u0942\u0943\u0946\u0947\u0948\u0945\u094A\u094B\u094C\u0949\u094D\u093C\u0964\u0000\u0000\u0000\u0000\u0000\u0000\u0966\u0967\u0968\u0969\u096A\u096B\u096C\u096D\u096E\u096F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xB3 && input <= 0xCD) return input - 0xB3 + 0x915;
			if (input >= 0x80 && input <= 0xB2) return GETOUTPUT0_80[input - 0x80];
			if (input >= 0xCE && input <= 0xFA) return GETOUTPUT0_CE[input - 0xCE];
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xE9: return 0x950L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xE9: return 0x90CL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xE9: return 0x961L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xE9: return 0x960L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xE9: return 0x958L;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0xE9: return 0x959L;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0xE9: return 0x95AL;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0xE9: return 0x95BL;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0xE9: return 0x95CL;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0xE9: return 0x95DL;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0xE9: return 0x95EL;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0xE9: return 0x962L;
			}
			return 0;
		}
		private long getOutput13(int input) {
			switch (input) {
			case 0xE9: return 0x963L;
			}
			return 0;
		}
		private long getOutput14(int input) {
			switch (input) {
			case 0xE9: return 0x944L;
			}
			return 0;
		}
		private long getOutput15(int input) {
			switch (input) {
			case 0xE8: return 0x200C094DL;
			case 0xE9: return 0x200D094DL;
			}
			return 0;
		}
		private long getOutput16(int input) {
			switch (input) {
			case 0xE9: return 0x93DL;
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
			case 5: return getOutput5(input);
			case 6: return getOutput6(input);
			case 7: return getOutput7(input);
			case 8: return getOutput8(input);
			case 9: return getOutput9(input);
			case 10: return getOutput10(input);
			case 11: return getOutput11(input);
			case 12: return getOutput12(input);
			case 13: return getOutput13(input);
			case 14: return getOutput14(input);
			case 15: return getOutput15(input);
			case 16: return getOutput16(input);
			default: return 0;
			}
		}
	}

	private static final class XMacDevanagariCharsetEncoder extends TableCharsetEncoder {
		private XMacDevanagariCharsetEncoder(Charset cs) {
			super(cs, 1.06198f, 2f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x94D: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_901 = getOutput0_901();
		private static final char[] getOutput0_901() {
			return "\u00A1\u00A2\u00A3\u0000\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u00AA\uE9A6\u00AE\u00AB\u00AC\u00AD\u00B2\u00AF\u00B0\u00B1".toCharArray();
		}
		private static final char[] GETOUTPUT0_930 = getOutput0_930();
		private static final char[] getOutput0_930() {
			return "\u00CF\u00D0\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u00D7\u00D8\u0000\u0000\u00E9\uE9EA\u00DA\u00DB\u00DC\u00DD\u00DE\u00DF\uE9DF\u00E3\u00E0\u00E1\u00E2\u00E7\u00E4\u00E5\u00E6\u00E8\u0000\u0000\uE9A1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uE9B3\uE9B4\uE9B5\uE9BA\uE9BF\uE9C0\uE9C9\u00CE\uE9AA\uE9A7\uE9DB\uE9DC\u00EA\u0090\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA\u0091".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x915 && input <= 0x92F) return input - 0x915 + 0xB3;
			if (input >= 0x901 && input <= 0x914) return GETOUTPUT0_901[input - 0x901];
			if (input >= 0x930 && input <= 0x970) return GETOUTPUT0_930[input - 0x930];
			switch (input) {
			case 0xA9: return 0x88L;
			case 0xAE: return 0x89L;
			case 0xD7: return 0x80L;
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
