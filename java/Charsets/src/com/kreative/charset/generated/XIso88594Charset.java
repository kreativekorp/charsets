package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso88594Charset extends Charset {
	public XIso88594Charset() {
		super("x-iso-8859-4", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso88594CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso88594CharsetEncoder(this);
	}

	private static final class XIso88594CharsetDecoder extends TableCharsetDecoder {
		private XIso88594CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u0104\u0138\u0156\u00A4\u0128\u013B\u00A7\u00A8\u0160\u0112\u0122\u0166\u00AD\u017D\u00AF\u00B0\u0105\u02DB\u0157\u00B4\u0129\u013C\u02C7\u00B8\u0161\u0113\u0123\u0167\u014A\u017E\u014B\u0100\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u012E\u010C\u00C9\u0118\u00CB\u0116\u00CD\u00CE\u012A\u0110\u0145\u014C\u0136\u00D4\u00D5\u00D6\u00D7\u00D8\u0172\u00DA\u00DB\u00DC\u0168\u016A\u00DF\u0101\u00E1\u00E2\u00E3\u00E4\u00E5\u00E6\u012F\u010D\u00E9\u0119\u00EB\u0117\u00ED\u00EE\u012B\u0111\u0146\u014D\u0137\u00F4\u00F5\u00F6\u00F7\u00F8\u0173\u00FA\u00FB\u00FC\u0169\u016B\u02D9".toCharArray();
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

	private static final class XIso88594CharsetEncoder extends TableCharsetEncoder {
		private XIso88594CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A4 = getOutput0_A4();
		private static final char[] getOutput0_A4() {
			return "\u00A4\u0000\u0000\u00A7\u00A8\u0000\u0000\u0000\u0000\u00AD\u0000\u00AF\u00B0\u0000\u0000\u0000\u00B4\u0000\u0000\u0000\u00B8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u0000\u0000\u00C9\u0000\u00CB\u0000\u00CD\u00CE\u0000\u0000\u0000\u0000\u0000\u00D4\u00D5\u00D6\u00D7\u00D8\u0000\u00DA\u00DB\u00DC\u0000\u0000\u00DF\u0000\u00E1\u00E2\u00E3\u00E4\u00E5\u00E6\u0000\u0000\u00E9\u0000\u00EB\u0000\u00ED\u00EE\u0000\u0000\u0000\u0000\u0000\u00F4\u00F5\u00F6\u00F7\u00F8\u0000\u00FA\u00FB\u00FC\u0000\u0000\u0000\u00C0\u00E0\u0000\u0000\u00A1\u00B1\u0000\u0000\u0000\u0000\u0000\u0000\u00C8\u00E8\u0000\u0000\u00D0\u00F0\u00AA\u00BA\u0000\u0000\u00CC\u00EC\u00CA\u00EA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00AB\u00BB\u0000\u0000\u0000\u0000\u00A5\u00B5\u00CF\u00EF\u0000\u0000\u00C7\u00E7\u0000\u0000\u0000\u0000\u0000\u0000\u00D3\u00F3\u00A2\u0000\u0000\u00A6\u00B6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D1\u00F1\u0000\u0000\u0000\u00BD\u00BF\u00D2\u00F2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A3\u00B3\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A9\u00B9\u0000\u0000\u0000\u0000\u00AC\u00BC\u00DD\u00FD\u00DE\u00FE\u0000\u0000\u0000\u0000\u0000\u0000\u00D9\u00F9\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00AE\u00BE".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA4 && input <= 0x17E) return GETOUTPUT0_A4[input - 0xA4];
			switch (input) {
			case 0x2C7: return 0xB7L;
			case 0x2D9: return 0xFF01L;
			case 0x2DB: return 0xB2L;
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
