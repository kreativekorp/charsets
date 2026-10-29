package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIta2FiguresUsTtyCharset extends Charset {
	public XIta2FiguresUsTtyCharset() {
		super("x-ita2-figures-us-tty", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIta2FiguresUsTtyCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIta2FiguresUsTtyCharsetEncoder(this);
	}

	private static final class XIta2FiguresUsTtyCharsetDecoder extends TableCharsetDecoder {
		private XIta2FiguresUsTtyCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE3\n- \u000787\r$4\',!:(5\")2#6019?&\u000E./;\u000F".toCharArray();
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

	private static final class XIta2FiguresUsTtyCharsetEncoder extends TableCharsetEncoder {
		private XIta2FiguresUsTtyCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{25}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0501\u0000\u0000\u0201\u0000\u0000\b\u001B\u001F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0401\r\u0011\u0014\t\u0000\u001A\u000B\u000F\u0012\u0000\u0000\f\u0301\u001C\u001D\u0016\u0017\u0013\u0101\n\u0010\u0015\u0701\u0601\u0018\u000E\u001E\u0000\u0000\u0000\u0019".toCharArray();
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
}
