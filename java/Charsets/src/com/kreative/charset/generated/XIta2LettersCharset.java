package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIta2LettersCharset extends Charset {
	public XIta2LettersCharset() {
		super("x-ita2-letters", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIta2LettersCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIta2LettersCharsetEncoder(this);
	}

	private static final class XIta2LettersCharsetDecoder extends TableCharsetDecoder {
		private XIta2LettersCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFEE\nA SIU\rDRJNFCKTZLWHYPQOBG\u000EMXV\u000F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIta2LettersCharsetEncoder extends TableCharsetEncoder {
		private XIta2LettersCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{29}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_41 = getOutput0_41();
		private static final char[] getOutput0_41() {
			return "\u0301\u0019\u000E\t\u0101\r\u001A\u0014\u0601\u000B\u000F\u0012\u001C\f\u0018\u0016\u0017\n\u0501\u0010\u0701\u001E\u0013\u001D\u0015\u0011\u0000\u0000\u0000\u0000\u0000\u0000\u0301\u0019\u000E\t\u0101\r\u001A\u0014\u0601\u000B\u000F\u0012\u001C\f\u0018\u0016\u0017\n\u0501\u0010\u0701\u001E\u0013\u001D\u0015\u0011".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x41 && input <= 0x7A) return GETOUTPUT0_41[input - 0x41];
			switch (input) {
			case 0x0: return 0x1L;
			case 0xA: return 0x201L;
			case 0xD: return 0x8L;
			case 0xE: return 0x1BL;
			case 0xF: return 0x1FL;
			case 0x20: return 0x401L;
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
