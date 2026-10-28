package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacCentralEuropeanCharset extends Charset {
	public XMacCentralEuropeanCharset() {
		super("x-MacCentralEuropean", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacCentralEuropeanCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacCentralEuropeanCharsetEncoder(this);
	}

	private static final class XMacCentralEuropeanCharsetDecoder extends TableCharsetDecoder {
		private XMacCentralEuropeanCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C4\u0100\u0101\u00C9\u0104\u00D6\u00DC\u00E1\u0105\u010C\u00E4\u010D\u0106\u0107\u00E9\u0179\u017A\u010E\u00ED\u010F\u0112\u0113\u0116\u00F3\u0117\u00F4\u00F6\u00F5\u00FA\u011A\u011B\u00FC\u2020\u00B0\u0118\u00A3\u00A7\u2022\u00B6\u00DF\u00AE\u00A9\u2122\u0119\u00A8\u2260\u0123\u012E\u012F\u012A\u2264\u2265\u012B\u0136\u2202\u2211\u0142\u013B\u013C\u013D\u013E\u0139\u013A\u0145\u0146\u0143\u00AC\u221A\u0144\u0147\u2206\u00AB\u00BB\u2026\u00A0\u0148\u0150\u00D5\u0151\u014C\u2013\u2014\u201C\u201D\u2018\u2019\u00F7\u25CA\u014D\u0154\u0155\u0158\u2039\u203A\u0159\u0156\u0157\u0160\u201A\u201E\u0161\u015A\u015B\u00C1\u0164\u0165\u00CD\u017D\u017E\u016A\u00D3\u00D4\u016B\u016E\u00DA\u016F\u0170\u0171\u0172\u0173\u00DD\u00FD\u0137\u017B\u0141\u017C\u0122\u02C7".toCharArray();
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

	private static final class XMacCentralEuropeanCharsetEncoder extends TableCharsetEncoder {
		private XMacCentralEuropeanCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u00CA\u0000\u0000\u00A3\u0000\u0000\u0000\u00A4\u00AC\u00A9\u0000\u00C7\u00C2\u0000\u00A8\u0000\u00A1\u0000\u0000\u0000\u0000\u0000\u00A6\u0000\u0000\u0000\u0000\u00C8\u0000\u0000\u0000\u0000\u0000\u00E7\u0000\u0000\u0080\u0000\u0000\u0000\u0000\u0083\u0000\u0000\u0000\u00EA\u0000\u0000\u0000\u0000\u0000\u00EE\u00EF\u00CD\u0085\u0000\u0000\u0000\u00F2\u0000\u0086\u00F8\u0000\u00A7\u0000\u0087\u0000\u0000\u008A\u0000\u0000\u0000\u0000\u008E\u0000\u0000\u0000\u0092\u0000\u0000\u0000\u0000\u0000\u0097\u0099\u009B\u009A\u00D6\u0000\u0000\u009C\u0000\u009F\u00F9\u0000\u0000\u0081\u0082\u0000\u0000\u0084\u0088\u008C\u008D\u0000\u0000\u0000\u0000\u0089\u008B\u0091\u0093\u0000\u0000\u0094\u0095\u0000\u0000\u0096\u0098\u00A2\u00AB\u009D\u009E\u0000\u0000\u0000\u0000\u0000\u0000\u00FE\u00AE\u0000\u0000\u0000\u0000\u0000\u0000\u00B1\u00B4\u0000\u0000\u00AF\u00B0\u0000\u0000\u0000\u0000\u0000\u0000\u00B5\u00FA\u0000\u00BD\u00BE\u00B9\u00BA\u00BB\u00BC\u0000\u0000\u00FC\u00B8\u00C1\u00C4\u00BF\u00C0\u00C5\u00CB\u0000\u0000\u0000\u00CF\u00D8\u0000\u0000\u00CC\u00CE\u0000\u0000\u00D9\u00DA\u00DF\u00E0\u00DB\u00DE\u00E5\u00E6\u0000\u0000\u0000\u0000\u00E1\u00E4\u0000\u0000\u00E8\u00E9\u0000\u0000\u0000\u0000\u00ED\u00F0\u0000\u0000\u00F1\u00F3\u00F4\u00F5\u00F6\u00F7\u0000\u0000\u0000\u0000\u0000\u008F\u0090\u00FB\u00FD\u00EB\u00EC".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0x17E) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x2C7: return 0xFF01L;
			case 0x2013: return 0xD0L;
			case 0x2014: return 0xD1L;
			case 0x2018: return 0xD4L;
			case 0x2019: return 0xD5L;
			case 0x201A: return 0xE2L;
			case 0x201C: return 0xD2L;
			case 0x201D: return 0xD3L;
			case 0x201E: return 0xE3L;
			case 0x2020: return 0xA0L;
			case 0x2022: return 0xA5L;
			case 0x2026: return 0xC9L;
			case 0x2039: return 0xDCL;
			case 0x203A: return 0xDDL;
			case 0x2122: return 0xAAL;
			case 0x2202: return 0xB6L;
			case 0x2206: return 0xC6L;
			case 0x2211: return 0xB7L;
			case 0x221A: return 0xC3L;
			case 0x2260: return 0xADL;
			case 0x2264: return 0xB2L;
			case 0x2265: return 0xB3L;
			case 0x25CA: return 0xD7L;
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
