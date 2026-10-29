package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIta2Charset extends Charset {
	public XIta2Charset() {
		super("x-ita2", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIta2CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIta2CharsetEncoder(this);
	}

	private static final class XIta2CharsetDecoder extends TableCharsetDecoder {
		private XIta2CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFEE\nA SIU\rDRJNFCKTZLWHYPQOBG\u000EMXV\u000F\uFFFE3\n- \'87\r\u00054\u0007,!:(5+)2\u00A36019?&\u000E./=\u000F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIta2CharsetEncoder extends TableCharsetEncoder {
		private XIta2CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{57}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\u0001\u0000\u0000\u0000\u0000)\u0000+\u0000\u0000\u0201\u0000\u0000\b\u001B\u001F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0401-\u0000\u0000\u0000\u0000:%/2\u00001,#<=673!*05\'&8.\u0000\u0000>\u00009\u0000\u0301\u0019\u000E\t\u0101\r\u001A\u0014\u0601\u000B\u000F\u0012\u001C\f\u0018\u0016\u0017\n\u0501\u0010\u0701\u001E\u0013\u001D\u0015\u0011\u0000\u0000\u0000\u0000\u0000\u0000\u0301\u0019\u000E\t\u0101\r\u001A\u0014\u0601\u000B\u000F\u0012\u001C\f\u0018\u0016\u0017\n\u0501\u0010\u0701\u001E\u0013\u001D\u0015\u0011".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x7A) return GETOUTPUT0_0[input - 0x0];
			switch (input) {
			case 0xA3: return 0x34L;
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
