package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XVisciiCharset extends Charset {
	public XVisciiCharset() {
		super("x-viscii", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XVisciiCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XVisciiCharsetEncoder(this);
	}

	private static final class XVisciiCharsetDecoder extends TableCharsetDecoder {
		private XVisciiCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u0001\u1EB2\u0003\u0004\u1EB4\u1EAA\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u1EF6\u0015\u0016\u0017\u0018\u1EF8\u001A\u001B\u001C\u001D\u1EF4".toCharArray();
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u1EA0\u1EAE\u1EB0\u1EB6\u1EA4\u1EA6\u1EA8\u1EAC\u1EBC\u1EB8\u1EBE\u1EC0\u1EC2\u1EC4\u1EC6\u1ED0\u1ED2\u1ED4\u1ED6\u1ED8\u1EE2\u1EDA\u1EDC\u1EDE\u1ECA\u1ECE\u1ECC\u1EC8\u1EE6\u0168\u1EE4\u1EF2\u00D5\u1EAF\u1EB1\u1EB7\u1EA5\u1EA7\u1EA9\u1EAD\u1EBD\u1EB9\u1EBF\u1EC1\u1EC3\u1EC5\u1EC7\u1ED1\u1ED3\u1ED5\u1ED7\u1EE0\u01A0\u1ED9\u1EDD\u1EDF\u1ECB\u1EF0\u1EE8\u1EEA\u1EEC\u01A1\u1EDB\u01AF\u00C0\u00C1\u00C2\u00C3\u1EA2\u0102\u1EB3\u1EB5\u00C8\u00C9\u00CA\u1EBA\u00CC\u00CD\u0128\u1EF3\u0110\u1EE9\u00D2\u00D3\u00D4\u1EA1\u1EF7\u1EEB\u1EED\u00D9\u00DA\u1EF9\u1EF5\u00DD\u1EE1\u01B0\u00E0\u00E1\u00E2\u00E3\u1EA3\u0103\u1EEF\u1EAB\u00E8\u00E9\u00EA\u1EBB\u00EC\u00ED\u0129\u1EC9\u0111\u1EF1\u00F2\u00F3\u00F4\u00F5\u1ECF\u1ECD\u1EE5\u00F9\u00FA\u0169\u1EE7\u00FD\u1EE3\u1EEE".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x1F && input <= 0x7F) return input - 0x1F + 0x1F;
			if (input >= 0x0 && input <= 0x1E) return GETOUTPUT0_0[input - 0x0];
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

	private static final class XVisciiCharsetEncoder extends TableCharsetEncoder {
		private XVisciiCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\u0001\u0101\u0000\u0301\u0401\u0000\u0000\u0701\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0000\u0015\u0016\u0017\u0018\u0000\u001A\u001B\u001C\u001D".toCharArray();
		}
		private static final char[] GETOUTPUT0_C0 = getOutput0_C0();
		private static final char[] getOutput0_C0() {
			return "\u00C0\u00C1\u00C2\u00C3\u0000\u0000\u0000\u0000\u00C8\u00C9\u00CA\u0000\u00CC\u00CD\u0000\u0000\u0000\u0000\u00D2\u00D3\u00D4\u00A0\u0000\u0000\u0000\u00D9\u00DA\u0000\u0000\u00DD\u0000\u0000\u00E0\u00E1\u00E2\u00E3\u0000\u0000\u0000\u0000\u00E8\u00E9\u00EA\u0000\u00EC\u00ED\u0000\u0000\u0000\u0000\u00F2\u00F3\u00F4\u00F5\u0000\u0000\u0000\u00F9\u00FA\u0000\u0000\u00FD\u0000\u0000\u0000\u0000\u00C5\u00E5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D0\u00F0".toCharArray();
		}
		private static final char[] GETOUTPUT0_1EA0 = getOutput0_1EA0();
		private static final char[] getOutput0_1EA0() {
			return "\u0080\u00D5\u00C4\u00E4\u0084\u00A4\u0085\u00A5\u0086\u00A6\u0601\u00E7\u0087\u00A7\u0081\u00A1\u0082\u00A2\u0201\u00C6\u0501\u00C7\u0083\u00A3\u0089\u00A9\u00CB\u00EB\u0088\u00A8\u008A\u00AA\u008B\u00AB\u008C\u00AC\u008D\u00AD\u008E\u00AE\u009B\u00EF\u0098\u00B8\u009A\u00F7\u0099\u00F6\u008F\u00AF\u0090\u00B0\u0091\u00B1\u0092\u00B2\u0093\u00B5\u0095\u00BE\u0096\u00B6\u0097\u00B7\u00B3\u00DE\u0094\u00FE\u009E\u00F8\u009C\u00FC\u00BA\u00D1\u00BB\u00D7\u00BC\u00D8\uFF01\u00E6\u00B9\u00F1\u009F\u00CF\u001E\u00DC\u0014\u00D6\u0019\u00DB".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x1F && input <= 0x7F) return input - 0x1F + 0x1F;
			if (input >= 0x0 && input <= 0x1D) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0xC0 && input <= 0x111) return GETOUTPUT0_C0[input - 0xC0];
			if (input >= 0x1EA0 && input <= 0x1EF9) return GETOUTPUT0_1EA0[input - 0x1EA0];
			switch (input) {
			case 0x128: return 0xCEL;
			case 0x129: return 0xEEL;
			case 0x168: return 0x9DL;
			case 0x169: return 0xFBL;
			case 0x1A0: return 0xB4L;
			case 0x1A1: return 0xBDL;
			case 0x1AF: return 0xBFL;
			case 0x1B0: return 0xDFL;
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
