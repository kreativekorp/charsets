package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XHp48Charset extends Charset {
	public XHp48Charset() {
		super("x-hp-48", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XHp48CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XHp48CharsetEncoder(this);
	}

	private static final class XHp48CharsetDecoder extends TableCharsetDecoder {
		private XHp48CharsetDecoder(Charset cs) {
			super(cs, 1.00391f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_7F = getOutput0_7F();
		private static final int[] getOutput0_7F() {
			return new int[] {
				0x2428, 0x2220, 0x3040078, 0x2207, 0x221A, 0x222B, 0x2211, 0x25B6, 0x3C0, 0x2202, 0x2264, 0x2265, 0x2260, 0x3B1, 0x2192, 0x2190,
				0x2193, 0x2191, 0x3B3, 0x3B4, 0x3B5, 0x3B7, 0x3B8, 0x3BB, 0x3C1, 0x3C3, 0x3C4, 0x3C9, 0x394, 0x3A0, 0x3A9, 0x25A0,
				0x221E,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x1 && input <= 0x1E) return input - 0x1 + 0x1;
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return input - 0xA0 + 0xA0;
			if (input >= 0x7F && input <= 0x9F) return GETOUTPUT0_7F[input - 0x7F];
			switch (input) {
			case 0x0: return 0xFFFEL;
			case 0x1F: return 0x2026L;
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

	private static final class XHp48CharsetEncoder extends TableCharsetEncoder {
		private XHp48CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x78: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_394 = getOutput0_394();
		private static final char[] getOutput0_394() {
			return "\u009B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009C\u0000\u0000\u0085\u0000\u0000\u0000\u0000\u0000\u009D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008C\u0000\u0091\u0092\u0093\u0000\u0094\u0095\u0000\u0000\u0096\u00B5\u0000\u0000\u0000\u0087\u0097\u0000\u0098\u0099\u0000\u0000\u0000\u0000\u009A".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x8 && input <= 0x1E) return input - 0x8 + 0x8;
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFE) return input - 0xA0 + 0xA0;
			if (input >= 0x394 && input <= 0x3C9) return GETOUTPUT0_394[input - 0x394];
			switch (input) {
			case 0x0: return 0x1L;
			case 0x1: return 0x101L;
			case 0x2: return 0x201L;
			case 0x3: return 0x301L;
			case 0x4: return 0x401L;
			case 0x5: return 0x501L;
			case 0x6: return 0x601L;
			case 0x7: return 0x701L;
			case 0xFF: return 0xFF01L;
			case 0x101: return 0x81L;
			case 0x2026: return 0x1FL;
			case 0x2126: return 0x9DL;
			case 0x2190: return 0x8EL;
			case 0x2191: return 0x90L;
			case 0x2192: return 0x8DL;
			case 0x2193: return 0x8FL;
			case 0x2202: return 0x88L;
			case 0x2206: return 0x9BL;
			case 0x2207: return 0x82L;
			case 0x220F: return 0x9CL;
			case 0x2211: return 0x85L;
			case 0x221A: return 0x83L;
			case 0x221D: return 0x8CL;
			case 0x221E: return 0x9FL;
			case 0x221F: return 0x80L;
			case 0x2220: return 0x80L;
			case 0x2221: return 0x80L;
			case 0x222B: return 0x84L;
			case 0x2260: return 0x8BL;
			case 0x2264: return 0x89L;
			case 0x2265: return 0x8AL;
			case 0x2428: return 0x7FL;
			case 0x2429: return 0x7FL;
			case 0x2592: return 0x7FL;
			case 0x25A0: return 0x9EL;
			case 0x25AC: return 0x9EL;
			case 0x25B6: return 0x86L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x304: return 0x81L;
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
