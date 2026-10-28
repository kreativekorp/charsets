package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM424JavaCharset extends Charset {
	public XIBM424JavaCharset() {
		super("x-IBM424-java", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM424JavaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM424JavaCharsetEncoder(this);
	}

	private static final class XIBM424JavaCharsetDecoder extends TableCharsetDecoder {
		private XIBM424JavaCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_40 = getOutput0_40();
		private static final char[] getOutput0_40() {
			return " \u05D0\u05D1\u05D2\u05D3\u05D4\u05D5\u05D6\u05D7\u05D8\u00A2.<(+|&\u05D9\u05DA\u05DB\u05DC\u05DD\u05DE\u05DF\u05E0\u05E1!$*);\u00AC-/\u05E2\u05E3\u05E4\u05E5\u05E6\u05E7\u05E8\u05E9\u00A6,%_>?\u0000\u05EA\u0000\u0000\u00A0\u0000\u0000\u0000\u2017`:#@\'=\"\u0000abcdefghi\u00AB\u00BB\u0000\u0000\u0000\u00B1\u00B0jklmnopqr\u0000\u0000\u0000\u00B8\u0000\u00A4\u00B5~stuvwxyz\u0000\u0000\u0000\u0000\u0000\u00AE^\u00A3\u00A5\u2022\u00A9\u00A7\u00B6\u00BC\u00BD\u00BE[]\u203E\u00A8\u00B4\u00D7{ABCDEFGHI\u00AD\u0000\u0000\u0000\u0000\u0000}JKLMNOPQR\u00B9\u0000\u0000\u0000\u0000\u0000\\\u00F7STUVWXYZ\u00B2\u0000\u0000\u0000\u0000\u00000123456789\u00B3\u0000\u0000\u0000\u0000\u009F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_UNIX[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return GETOUTPUT0_40[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM424JavaCharsetEncoder extends TableCharsetEncoder {
		private XIBM424JavaCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_UNIX[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON1[input - 0x20];
			if (input >= 0xA0 && input <= 0xBE) return CommonSubtables.COMMON261[input - 0xA0];
			if (input >= 0x5D0 && input <= 0x5EA) return CommonSubtables.COMMON262[input - 0x5D0];
			switch (input) {
			case 0xD7: return 0xBFL;
			case 0xF7: return 0xE1L;
			case 0x2017: return 0x78L;
			case 0x2022: return 0xB3L;
			case 0x203E: return 0xBCL;
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
