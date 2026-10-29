package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XVscii1Charset extends Charset {
	public XVscii1Charset() {
		super("x-vscii1", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XVscii1CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XVscii1CharsetEncoder(this);
	}

	private static final class XVscii1CharsetDecoder extends TableCharsetDecoder {
		private XVscii1CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u00DA\u1EE4\u0003\u1EEA\u1EEC\u1EEE\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u1EE8\u1EF0\u1EF2\u1EF6\u1EF8\u00DD\u1EF4".toCharArray();
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C0\u1EA2\u00C3\u00C1\u1EA0\u1EB6\u1EAC\u00C8\u1EBA\u1EBC\u00C9\u1EB8\u1EC6\u00CC\u1EC8\u0128\u00CD\u1ECA\u00D2\u1ECE\u00D5\u00D3\u1ECC\u1ED8\u1EDC\u1EDE\u1EE0\u1EDA\u1EE2\u00D9\u1EE6\u0168\u00A0\u0102\u00C2\u00CA\u00D4\u01A0\u01AF\u0110\u0103\u00E2\u00EA\u00F4\u01A1\u01B0\u0111\u1EB0\u0300\u0309\u0303\u0301\u0323\u00E0\u1EA3\u00E3\u00E1\u1EA1\u1EB2\u1EB1\u1EB3\u1EB5\u1EAF\u1EB4\u1EAE\u1EA6\u1EA8\u1EAA\u1EA4\u1EC0\u1EB7\u1EA7\u1EA9\u1EAB\u1EA5\u1EAD\u00E8\u1EC2\u1EBB\u1EBD\u00E9\u1EB9\u1EC1\u1EC3\u1EC5\u1EBF\u1EC7\u00EC\u1EC9\u1EC4\u1EBE\u1ED2\u0129\u00ED\u1ECB\u00F2\u1ED4\u1ECF\u00F5\u00F3\u1ECD\u1ED3\u1ED5\u1ED7\u1ED1\u1ED9\u1EDD\u1EDF\u1EE1\u1EDB\u1EE3\u00F9\u1ED6\u1EE7\u0169\u00FA\u1EE5\u1EEB\u1EED\u1EEF\u1EE9\u1EF1\u1EF3\u1EF7\u1EF9\u00FD\u1EF5\u1ED0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x18 && input <= 0x7F) return input - 0x18 + 0x18;
			if (input >= 0x0 && input <= 0x17) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x80 && input <= 0xFF) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XVscii1CharsetEncoder extends TableCharsetEncoder {
		private XVscii1CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_C0 = getOutput0_C0();
		private static final char[] getOutput0_C0() {
			return "\u0080\u0083\u00A2\u0082\u0000\u0000\u0000\u0000\u0087\u008A\u00A3\u0000\u008D\u0090\u0000\u0000\u0000\u0000\u0092\u0095\u00A4\u0094\u0000\u0000\u0000\u009D\u0101\u0000\u0000\u0016\u0000\u0000\u00B5\u00B8\u00A9\u00B7\u0000\u0000\u0000\u0000\u00CC\u00D0\u00AA\u0000\u00D7\u00DD\u0000\u0000\u0000\u0000\u00DF\u00E3\u00AB\u00E2\u0000\u0000\u0000\u00EF\u00F3\u0000\u0000\u00FD\u0000\u0000\u0000\u0000\u00A1\u00A8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A7\u00AE".toCharArray();
		}
		private static final char[] GETOUTPUT0_1EA0 = getOutput0_1EA0();
		private static final char[] getOutput0_1EA0() {
			return "\u0084\u00B9\u0081\u00B6\u00C4\u00CA\u00C1\u00C7\u00C2\u00C8\u00C3\u00C9\u0086\u00CB\u00C0\u00BE\u00AF\u00BB\u00BA\u00BC\u00BF\u00BD\u0085\u00C6\u008B\u00D1\u0088\u00CE\u0089\u00CF\u00DA\u00D5\u00C5\u00D2\u00CD\u00D3\u00D9\u00D4\u008C\u00D6\u008E\u00D8\u0091\u00DE\u0096\u00E4\u0093\u00E1\uFF01\u00E8\u00DB\u00E5\u00E0\u00E6\u00F0\u00E7\u0097\u00E9\u009B\u00ED\u0098\u00EA\u0099\u00EB\u009A\u00EC\u009C\u00EE\u0201\u00F4\u009E\u00F1\u0011\u00F8\u0401\u00F5\u0501\u00F6\u0601\u00F7\u0012\u00F9\u0013\u00FA\u0017\u00FE\u0014\u00FB\u0015\u00FC".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x18 && input <= 0x7F) return input - 0x18 + 0x18;
			if (input >= 0xC0 && input <= 0x111) return GETOUTPUT0_C0[input - 0xC0];
			if (input >= 0x1EA0 && input <= 0x1EF9) return GETOUTPUT0_1EA0[input - 0x1EA0];
			switch (input) {
			case 0x0: return 0x1L;
			case 0x3: return 0x301L;
			case 0x7: return 0x701L;
			case 0x8: return 0x8L;
			case 0x9: return 0x9L;
			case 0xA: return 0xAL;
			case 0xB: return 0xBL;
			case 0xC: return 0xCL;
			case 0xD: return 0xDL;
			case 0xE: return 0xEL;
			case 0xF: return 0xFL;
			case 0x10: return 0x10L;
			case 0xA0: return 0xA0L;
			case 0x128: return 0x8FL;
			case 0x129: return 0xDCL;
			case 0x168: return 0x9FL;
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
