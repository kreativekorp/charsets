package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso88592Charset extends Charset {
	public XIso88592Charset() {
		super("x-iso-8859-2", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso88592CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso88592CharsetEncoder(this);
	}

	private static final class XIso88592CharsetDecoder extends TableCharsetDecoder {
		private XIso88592CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u0104\u02D8\u0141\u00A4\u013D\u015A\u00A7\u00A8\u0160\u015E\u0164\u0179\u00AD\u017D\u017B\u00B0\u0105\u02DB\u0142\u00B4\u013E\u015B\u02C7\u00B8\u0161\u015F\u0165\u017A\u02DD\u017E\u017C\u0154\u00C1\u00C2\u0102\u00C4\u0139\u0106\u00C7\u010C\u00C9\u0118\u00CB\u011A\u00CD\u00CE\u010E\u0110\u0143\u0147\u00D3\u00D4\u0150\u00D6\u00D7\u0158\u016E\u00DA\u0170\u00DC\u00DD\u0162\u00DF\u0155\u00E1\u00E2\u0103\u00E4\u013A\u0107\u00E7\u010D\u00E9\u0119\u00EB\u011B\u00ED\u00EE\u010F\u0111\u0144\u0148\u00F3\u00F4\u0151\u00F6\u00F7\u0159\u016F\u00FA\u0171\u00FC\u00FD\u0163\u02D9".toCharArray();
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

	private static final class XIso88592CharsetEncoder extends TableCharsetEncoder {
		private XIso88592CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A4 = getOutput0_A4();
		private static final char[] getOutput0_A4() {
			return "\u00A4\u0000\u0000\u00A7\u00A8\u0000\u0000\u0000\u0000\u00AD\u0000\u0000\u00B0\u0000\u0000\u0000\u00B4\u0000\u0000\u0000\u00B8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C1\u00C2\u0000\u00C4\u0000\u0000\u00C7\u0000\u00C9\u0000\u00CB\u0000\u00CD\u00CE\u0000\u0000\u0000\u0000\u00D3\u00D4\u0000\u00D6\u00D7\u0000\u0000\u00DA\u0000\u00DC\u00DD\u0000\u00DF\u0000\u00E1\u00E2\u0000\u00E4\u0000\u0000\u00E7\u0000\u00E9\u0000\u00EB\u0000\u00ED\u00EE\u0000\u0000\u0000\u0000\u00F3\u00F4\u0000\u00F6\u00F7\u0000\u0000\u00FA\u0000\u00FC\u00FD\u0000\u0000\u0000\u0000\u00C3\u00E3\u00A1\u00B1\u00C6\u00E6\u0000\u0000\u0000\u0000\u00C8\u00E8\u00CF\u00EF\u00D0\u00F0\u0000\u0000\u0000\u0000\u0000\u0000\u00CA\u00EA\u00CC\u00EC".toCharArray();
		}
		private static final char[] GETOUTPUT0_139 = getOutput0_139();
		private static final char[] getOutput0_139() {
			return "\u00C5\u00E5\u0000\u0000\u00A5\u00B5\u0000\u0000\u00A3\u00B3\u00D1\u00F1\u0000\u0000\u00D2\u00F2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D5\u00F5\u0000\u0000\u00C0\u00E0\u0000\u0000\u00D8\u00F8\u00A6\u00B6\u0000\u0000\u00AA\u00BA\u00A9\u00B9\u00DE\u00FE\u00AB\u00BB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D9\u00F9\u00DB\u00FB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00AC\u00BC\u00AF\u00BF\u00AE\u00BE".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA4 && input <= 0x11B) return GETOUTPUT0_A4[input - 0xA4];
			if (input >= 0x139 && input <= 0x17E) return GETOUTPUT0_139[input - 0x139];
			switch (input) {
			case 0x2C7: return 0xB7L;
			case 0x2D8: return 0xA2L;
			case 0x2D9: return 0xFF01L;
			case 0x2DB: return 0xB2L;
			case 0x2DD: return 0xBDL;
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
