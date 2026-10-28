package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XWindows1250Charset extends Charset {
	public XWindows1250Charset() {
		super("x-windows-1250", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XWindows1250CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XWindows1250CharsetEncoder(this);
	}

	private static final class XWindows1250CharsetDecoder extends TableCharsetDecoder {
		private XWindows1250CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u20AC\u0000\u201A\u0000\u201E\u2026\u2020\u2021\u0000\u2030\u0160\u2039\u015A\u0164\u017D\u0179\u0000\u2018\u2019\u201C\u201D\u2022\u2013\u2014\u0000\u2122\u0161\u203A\u015B\u0165\u017E\u017A\u00A0\u02C7\u02D8\u0141\u00A4\u0104\u00A6\u00A7\u00A8\u00A9\u015E\u00AB\u00AC\u00AD\u00AE\u017B\u00B0\u00B1\u02DB\u0142\u00B4\u00B5\u00B6\u00B7\u00B8\u0105\u015F\u00BB\u013D\u02DD\u013E\u017C\u0154\u00C1\u00C2\u0102\u00C4\u0139\u0106\u00C7\u010C\u00C9\u0118\u00CB\u011A\u00CD\u00CE\u010E\u0110\u0143\u0147\u00D3\u00D4\u0150\u00D6\u00D7\u0158\u016E\u00DA\u0170\u00DC\u00DD\u0162\u00DF\u0155\u00E1\u00E2\u0103\u00E4\u013A\u0107\u00E7\u010D\u00E9\u0119\u00EB\u011B\u00ED\u00EE\u010F\u0111\u0144\u0148\u00F3\u00F4\u0151\u00F6\u00F7\u0159\u016F\u00FA\u0171\u00FC\u00FD\u0163\u02D9".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
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

	private static final class XWindows1250CharsetEncoder extends TableCharsetEncoder {
		private XWindows1250CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u00A0\u0000\u0000\u0000\u00A4\u0000\u00A6\u00A7\u00A8\u00A9\u0000\u00AB\u00AC\u00AD\u00AE\u0000\u00B0\u00B1\u0000\u0000\u00B4\u00B5\u00B6\u00B7\u00B8\u0000\u0000\u00BB\u0000\u0000\u0000\u0000\u0000\u00C1\u00C2\u0000\u00C4\u0000\u0000\u00C7\u0000\u00C9\u0000\u00CB\u0000\u00CD\u00CE\u0000\u0000\u0000\u0000\u00D3\u00D4\u0000\u00D6\u00D7\u0000\u0000\u00DA\u0000\u00DC\u00DD\u0000\u00DF\u0000\u00E1\u00E2\u0000\u00E4\u0000\u0000\u00E7\u0000\u00E9\u0000\u00EB\u0000\u00ED\u00EE\u0000\u0000\u0000\u0000\u00F3\u00F4\u0000\u00F6\u00F7\u0000\u0000\u00FA\u0000\u00FC\u00FD\u0000\u0000\u0000\u0000\u00C3\u00E3\u00A5\u00B9\u00C6\u00E6\u0000\u0000\u0000\u0000\u00C8\u00E8\u00CF\u00EF\u00D0\u00F0\u0000\u0000\u0000\u0000\u0000\u0000\u00CA\u00EA\u00CC\u00EC".toCharArray();
		}
		private static final char[] GETOUTPUT0_139 = getOutput0_139();
		private static final char[] getOutput0_139() {
			return "\u00C5\u00E5\u0000\u0000\u00BC\u00BE\u0000\u0000\u00A3\u00B3\u00D1\u00F1\u0000\u0000\u00D2\u00F2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D5\u00F5\u0000\u0000\u00C0\u00E0\u0000\u0000\u00D8\u00F8\u008C\u009C\u0000\u0000\u00AA\u00BA\u008A\u009A\u00DE\u00FE\u008D\u009D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D9\u00F9\u00DB\u00FB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008F\u009F\u00AF\u00BF\u008E\u009E".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0x11B) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x139 && input <= 0x17E) return GETOUTPUT0_139[input - 0x139];
			switch (input) {
			case 0x2C7: return 0xA1L;
			case 0x2D8: return 0xA2L;
			case 0x2D9: return 0xFF01L;
			case 0x2DB: return 0xB2L;
			case 0x2DD: return 0xBDL;
			case 0x2013: return 0x96L;
			case 0x2014: return 0x97L;
			case 0x2018: return 0x91L;
			case 0x2019: return 0x92L;
			case 0x201A: return 0x82L;
			case 0x201C: return 0x93L;
			case 0x201D: return 0x94L;
			case 0x201E: return 0x84L;
			case 0x2020: return 0x86L;
			case 0x2021: return 0x87L;
			case 0x2022: return 0x95L;
			case 0x2026: return 0x85L;
			case 0x2030: return 0x89L;
			case 0x2039: return 0x8BL;
			case 0x203A: return 0x9BL;
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
