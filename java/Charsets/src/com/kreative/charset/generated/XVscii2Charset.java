package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XVscii2Charset extends Charset {
	public XVscii2Charset() {
		super("x-vscii2", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XVscii2CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XVscii2CharsetEncoder(this);
	}

	private static final class XVscii2CharsetDecoder extends TableCharsetDecoder {
		private XVscii2CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u0102\u00C2\u00CA\u00D4\u01A0\u01AF\u0110\u0103\u00E2\u00EA\u00F4\u01A1\u01B0\u0111\u1EB0\u0300\u0309\u0303\u0301\u0323\u00E0\u1EA3\u00E3\u00E1\u1EA1\u1EB2\u1EB1\u1EB3\u1EB5\u1EAF\u1EB4\u1EAE\u1EA6\u1EA8\u1EAA\u1EA4\u1EC0\u1EB7\u1EA7\u1EA9\u1EAB\u1EA5\u1EAD\u00E8\u1EC2\u1EBB\u1EBD\u00E9\u1EB9\u1EC1\u1EC3\u1EC5\u1EBF\u1EC7\u00EC\u1EC9\u1EC4\u1EBE\u1ED2\u0129\u00ED\u1ECB\u00F2\u1ED4\u1ECF\u00F5\u00F3\u1ECD\u1ED3\u1ED5\u1ED7\u1ED1\u1ED9\u1EDD\u1EDF\u1EE1\u1EDB\u1EE3\u00F9\u1ED6\u1EE7\u0169\u00FA\u1EE5\u1EEB\u1EED\u1EEF\u1EE9\u1EF1\u1EF3\u1EF7\u1EF9\u00FD\u1EF5\u1ED0".toCharArray();
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

	private static final class XVscii2CharsetEncoder extends TableCharsetEncoder {
		private XVscii2CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_1EA1 = getOutput0_1EA1();
		private static final char[] getOutput0_1EA1() {
			return "\u00B9\u0000\u00B6\u00C4\u00CA\u00C1\u00C7\u00C2\u00C8\u00C3\u00C9\u0000\u00CB\u00C0\u00BE\u00AF\u00BB\u00BA\u00BC\u00BF\u00BD\u0000\u00C6\u0000\u00D1\u0000\u00CE\u0000\u00CF\u00DA\u00D5\u00C5\u00D2\u00CD\u00D3\u00D9\u00D4\u0000\u00D6\u0000\u00D8\u0000\u00DE\u0000\u00E4\u0000\u00E1\uFF01\u00E8\u00DB\u00E5\u00E0\u00E6\u00F0\u00E7\u0000\u00E9\u0000\u00ED\u0000\u00EA\u0000\u00EB\u0000\u00EC\u0000\u00EE\u0000\u00F4\u0000\u00F1\u0000\u00F8\u0000\u00F5\u0000\u00F6\u0000\u00F7\u0000\u00F9\u0000\u00FA\u0000\u00FE\u0000\u00FB\u0000\u00FC".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xC2 && input <= 0x111) return CommonSubtables.COMMON1760[input - 0xC2];
			if (input >= 0x1EA1 && input <= 0x1EF9) return GETOUTPUT0_1EA1[input - 0x1EA1];
			switch (input) {
			case 0x129: return 0xDCL;
			case 0x169: return 0xF2L;
			case 0x1A0: return 0xA5L;
			case 0x1A1: return 0xACL;
			case 0x1AF: return 0xA6L;
			case 0x1B0: return 0xADL;
			case 0x300: return 0xB0L;
			case 0x301: return 0xB3L;
			case 0x303: return 0xB2L;
			case 0x309: return 0xB1L;
			case 0x323: return 0xB4L;
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
