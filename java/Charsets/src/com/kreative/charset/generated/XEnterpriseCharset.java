package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEnterpriseCharset extends Charset {
	public XEnterpriseCharset() {
		super("x-enterprise", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEnterpriseCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEnterpriseCharsetEncoder(this);
	}

	private static final class XEnterpriseCharsetDecoder extends TableCharsetDecoder {
		private XEnterpriseCharsetDecoder(Charset cs) {
			super(cs, 1.00625f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_7C = getOutput0_7C();
		private static final int[] getOutput0_7C() {
			return new int[] {
				0xA6, 0x7D, 0x7E, 0x7F, 0xA9, 0x23, 0xC4, 0xD6, 0xDC, 0xC5, 0xD8, 0xC6, 0xE9, 0xC7, 0xE0, 0x2191,
				0x2192, 0x3A9, 0x25A0, 0x192, 0x220F, 0x2211, 0xE4, 0xF6, 0xFC, 0xE5, 0xF8, 0xE6, 0xE8, 0xA7, 0xDFC5D83E, 0x2193,
				0x2190, 0xB5, 0x2190, 0x2588,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x24 && input <= 0x5F) return input - 0x24 + 0x24;
			if (input >= 0x61 && input <= 0x7B) return input - 0x61 + 0x61;
			if (input >= 0x7C && input <= 0x9F) return GETOUTPUT0_7C[input - 0x7C];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0xA3L;
			case 0x60: return 0x2019L;
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

	private static final class XEnterpriseCharsetEncoder extends TableCharsetEncoder {
		private XEnterpriseCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83E: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_A3 = getOutput0_A3();
		private static final char[] getOutput0_A3() {
			return "#\u0000\u0000|\u0099\u0000\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0082\u0085\u0087\u0089\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0083\u0000\u0086\u0000\u0000\u0000\u0084\u0000\u0000\u0000\u008A\u0000\u0000\u0000\u0092\u0095\u0097\u0000\u0098\u0088\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0093\u0000\u0096\u0000\u0000\u0000\u0094".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x24 && input <= 0x7F) return input - 0x24 + 0x24;
			if (input >= 0xA3 && input <= 0xFC) return GETOUTPUT0_A3[input - 0xA3];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x81L;
			case 0x192: return 0x8FL;
			case 0x3A9: return 0x8DL;
			case 0x2019: return 0x60L;
			case 0x2190: return 0x9CL;
			case 0x2191: return 0x8BL;
			case 0x2192: return 0x8CL;
			case 0x2193: return 0x9BL;
			case 0x220F: return 0x90L;
			case 0x2211: return 0x91L;
			case 0x2588: return 0x9FL;
			case 0x25A0: return 0x8EL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDFC5: return 0x9AL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			default: return 0;
			}
		}
	}
}
