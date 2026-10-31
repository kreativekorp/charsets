package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XVscii3Charset extends Charset {
	public XVscii3Charset() {
		super("x-vscii3", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XVscii3CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XVscii3CharsetEncoder(this);
	}

	private static final class XVscii3CharsetDecoder extends TableCharsetDecoder {
		private XVscii3CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u0102\u00C2\u00CA\u00D4\u01A0\u01AF\u0110\u0103\u00E2\u00EA\u00F4\u01A1\u01B0\u0111\u0000\u0000\u0000\u0000\u0000\u0000\u00E0\u1EA3\u00E3\u00E1\u1EA1\u0000\u1EB1\u1EB3\u1EB5\u1EAF\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u1EB7\u1EA7\u1EA9\u1EAB\u1EA5\u1EAD\u00E8\u0000\u1EBB\u1EBD\u00E9\u1EB9\u1EC1\u1EC3\u1EC5\u1EBF\u1EC7\u00EC\u1EC9\u0000\u0000\u0000\u0129\u00ED\u1ECB\u00F2\u0000\u1ECF\u00F5\u00F3\u1ECD\u1ED3\u1ED5\u1ED7\u1ED1\u1ED9\u1EDD\u1EDF\u1EE1\u1EDB\u1EE3\u00F9\u0000\u1EE7\u0169\u00FA\u1EE5\u1EEB\u1EED\u1EEF\u1EE9\u1EF1\u1EF3\u1EF7\u1EF9\u00FD\u1EF5".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFE) return GETOUTPUT0_A1[input - 0xA1];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XVscii3CharsetEncoder extends TableCharsetEncoder {
		private XVscii3CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_1EA1 = getOutput0_1EA1();
		private static final char[] getOutput0_1EA1() {
			return "\u00B9\u0000\u00B6\u0000\u00CA\u0000\u00C7\u0000\u00C8\u0000\u00C9\u0000\u00CB\u0000\u00BE\u0000\u00BB\u0000\u00BC\u0000\u00BD\u0000\u00C6\u0000\u00D1\u0000\u00CE\u0000\u00CF\u0000\u00D5\u0000\u00D2\u0000\u00D3\u0000\u00D4\u0000\u00D6\u0000\u00D8\u0000\u00DE\u0000\u00E4\u0000\u00E1\u0000\u00E8\u0000\u00E5\u0000\u00E6\u0000\u00E7\u0000\u00E9\u0000\u00ED\u0000\u00EA\u0000\u00EB\u0000\u00EC\u0000\u00EE\u0000\u00F4\u0000\u00F1\u0000\u00F8\u0000\u00F5\u0000\u00F6\u0000\u00F7\u0000\u00F9\u0000\u00FA\u0000\u00FE\u0000\u00FB\u0000\u00FC".toCharArray();
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
