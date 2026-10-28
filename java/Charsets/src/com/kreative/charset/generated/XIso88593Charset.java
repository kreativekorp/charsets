package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso88593Charset extends Charset {
	public XIso88593Charset() {
		super("x-iso-8859-3", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso88593CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso88593CharsetEncoder(this);
	}

	private static final class XIso88593CharsetDecoder extends TableCharsetDecoder {
		private XIso88593CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u0126\u02D8\u00A3\u00A4\u0000\u0124\u00A7\u00A8\u0130\u015E\u011E\u0134\u00AD\u0000\u017B\u00B0\u0127\u00B2\u00B3\u00B4\u00B5\u0125\u00B7\u00B8\u0131\u015F\u011F\u0135\u00BD\u0000\u017C\u00C0\u00C1\u00C2\u0000\u00C4\u010A\u0108\u00C7\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u0000\u00D1\u00D2\u00D3\u00D4\u0120\u00D6\u00D7\u011C\u00D9\u00DA\u00DB\u00DC\u016C\u015C\u00DF\u00E0\u00E1\u00E2\u0000\u00E4\u010B\u0109\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u0000\u00F1\u00F2\u00F3\u00F4\u0121\u00F6\u00F7\u011D\u00F9\u00FA\u00FB\u00FC\u016D\u015D\u02D9".toCharArray();
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

	private static final class XIso88593CharsetEncoder extends TableCharsetEncoder {
		private XIso88593CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A3 = getOutput0_A3();
		private static final char[] getOutput0_A3() {
			return "\u00A3\u00A4\u0000\u0000\u00A7\u00A8\u0000\u0000\u0000\u0000\u00AD\u0000\u0000\u00B0\u0000\u00B2\u00B3\u00B4\u00B5\u0000\u00B7\u00B8\u0000\u0000\u0000\u0000\u00BD\u0000\u0000\u00C0\u00C1\u00C2\u0000\u00C4\u0000\u0000\u00C7\u00C8\u00C9\u00CA\u00CB\u00CC\u00CD\u00CE\u00CF\u0000\u00D1\u00D2\u00D3\u00D4\u0000\u00D6\u00D7\u0000\u00D9\u00DA\u00DB\u00DC\u0000\u0000\u00DF\u00E0\u00E1\u00E2\u0000\u00E4\u0000\u0000\u00E7\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00EF\u0000\u00F1\u00F2\u00F3\u00F4\u0000\u00F6\u00F7\u0000\u00F9\u00FA\u00FB\u00FC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C6\u00E6\u00C5\u00E5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00D8\u00F8\u00AB\u00BB\u00D5\u00F5\u0000\u0000\u00A6\u00B6\u00A1\u00B1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A9\u00B9\u0000\u0000\u00AC\u00BC".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA3 && input <= 0x135) return GETOUTPUT0_A3[input - 0xA3];
			switch (input) {
			case 0x15C: return 0xDEL;
			case 0x15D: return 0xFEL;
			case 0x15E: return 0xAAL;
			case 0x15F: return 0xBAL;
			case 0x16C: return 0xDDL;
			case 0x16D: return 0xFDL;
			case 0x17B: return 0xAFL;
			case 0x17C: return 0xBFL;
			case 0x2D8: return 0xA2L;
			case 0x2D9: return 0xFF01L;
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
