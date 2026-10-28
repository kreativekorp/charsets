package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso885916Charset extends Charset {
	public XIso885916Charset() {
		super("x-iso-8859-16", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso885916CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso885916CharsetEncoder(this);
	}

	private static final class XIso885916CharsetDecoder extends TableCharsetDecoder {
		private XIso885916CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u0104\u0105\u0141\u20AC\u201E\u0160\u00A7\u0161\u00A9\u0218\u00AB\u0179\u00AD\u017A\u017B\u00B0\u00B1\u010C\u0142\u017D\u201D\u00B6\u00B7\u017E\u010D\u0219\u00BB\u0152\u0153\u0178\u017C\u00C0\u00C1\u00C2\u0102\u00C4\u0106\u00C6\u00C7\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u0110\u0143\u00D2\u00D3\u00D4\u0150\u00D6\u015A\u0170\u00D9\u00DA\u00DB\u00DC\u0118\u021A\u00DF\u00E0\u00E1\u00E2\u0103\u00E4\u0107\u00E6\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u0111\u0144\u00F2\u00F3\u00F4\u0151\u00F6\u015B\u0171\u00F9\u00FA\u00FB\u00FC\u0119\u021B\u00FF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFF) return GETOUTPUT0_A1[input - 0xA1];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIso885916CharsetEncoder extends TableCharsetEncoder {
		private XIso885916CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A7 = getOutput0_A7();
		private static final char[] getOutput0_A7() {
			return "\u00A7\u0000\u00A9\u0000\u00AB\u0000\u00AD\u0000\u0000\u00B0\u00B1\u0000\u0000\u0000\u0000\u00B6\u00B7\u0000\u0000\u0000\u00BB\u0000\u0000\u0000\u0000\u00C0\u00C1\u00C2\u0000\u00C4\u0000\u00C6\u00C7\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u0000\u0000\u00D2\u00D3\u00D4\u0000\u00D6\u0000\u0000\u00D9\u00DA\u00DB\u00DC\u0000\u0000\u00DF\u00E0\u00E1\u00E2\u0000\u00E4\u0000\u00E6\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u0000\u0000\u00F2\u00F3\u00F4\u0000\u00F6\u0000\u0000\u00F9\u00FA\u00FB\u00FC\u0000\u0000\uFF01\u0000\u0000\u00C3\u00E3\u00A1\u00A2\u00C5\u00E5\u0000\u0000\u0000\u0000\u00B2\u00B9\u0000\u0000\u00D0\u00F0\u0000\u0000\u0000\u0000\u0000\u0000\u00DD\u00FD".toCharArray();
		}
		private static final char[] GETOUTPUT0_141 = getOutput0_141();
		private static final char[] getOutput0_141() {
			return "\u00A3\u00B3\u00D1\u00F1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D5\u00F5\u00BC\u00BD\u0000\u0000\u0000\u0000\u0000\u0000\u00D7\u00F7\u0000\u0000\u0000\u0000\u00A6\u00A8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D8\u00F8\u0000\u0000\u0000\u0000\u0000\u0000\u00BE\u00AC\u00AE\u00AF\u00BF\u00B4\u00B8".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA7 && input <= 0x119) return GETOUTPUT0_A7[input - 0xA7];
			if (input >= 0x141 && input <= 0x17E) return GETOUTPUT0_141[input - 0x141];
			switch (input) {
			case 0x218: return 0xAAL;
			case 0x219: return 0xBAL;
			case 0x21A: return 0xDEL;
			case 0x21B: return 0xFEL;
			case 0x201D: return 0xB5L;
			case 0x201E: return 0xA5L;
			case 0x20AC: return 0xA4L;
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
