package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XZxspectrumDesktopCharset extends Charset {
	public XZxspectrumDesktopCharset() {
		super("x-zxspectrum-desktop", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XZxspectrumDesktopCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XZxspectrumDesktopCharsetEncoder(this);
	}

	private static final class XZxspectrumDesktopCharsetDecoder extends TableCharsetDecoder {
		private XZxspectrumDesktopCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_7F = getOutput0_7F();
		private static final char[] getOutput0_7F() {
			return "\u00A9\u00E9\u00C9\u011B\u011A\u0161\u0160\u010D\u010C\u0159\u0158\u017E\u017D\u00FD\u00DD\u00E1\u00C1\u00ED\u00CD\u010F\u010E\u0148\u0147\u00F3\u00D3\u0165\u0164\u016F\u016E\u00FA\u00DA".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0x7F && input <= 0x9D) return GETOUTPUT0_7F[input - 0x7F];
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

	private static final class XZxspectrumDesktopCharsetEncoder extends TableCharsetEncoder {
		private XZxspectrumDesktopCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_C1 = getOutput0_C1();
		private static final char[] getOutput0_C1() {
			return "\u008F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0081\u0000\u0000\u0000\u0091\u0000\u0000\u0000\u0000\u0000\u0097\u0000\u0000\u0000\u0000\u0000\u0000\u009D\u0000\u0000\u008D\u0000\u0000\u0000\u008E\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0080\u0000\u0000\u0000\u0090\u0000\u0000\u0000\u0000\u0000\u0096\u0000\u0000\u0000\u0000\u0000\u0000\u009C\u0000\u0000\u008C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0087\u0086\u0093\u0092\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0083\u0082".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0xC1 && input <= 0x11B) return GETOUTPUT0_C1[input - 0xC1];
			switch (input) {
			case 0x5F: return 0x5FL;
			case 0xA3: return 0x60L;
			case 0xA9: return 0x7FL;
			case 0x147: return 0x95L;
			case 0x148: return 0x94L;
			case 0x158: return 0x89L;
			case 0x159: return 0x88L;
			case 0x160: return 0x85L;
			case 0x161: return 0x84L;
			case 0x164: return 0x99L;
			case 0x165: return 0x98L;
			case 0x16E: return 0x9BL;
			case 0x16F: return 0x9AL;
			case 0x17D: return 0x8BL;
			case 0x17E: return 0x8AL;
			case 0x2191: return 0x5EL;
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
