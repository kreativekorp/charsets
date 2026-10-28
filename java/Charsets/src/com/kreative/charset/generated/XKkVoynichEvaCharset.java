package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKkVoynichEvaCharset extends Charset {
	public XKkVoynichEvaCharset() {
		super("x-kk-voynich-eva", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKkVoynichEvaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKkVoynichEvaCharsetEncoder(this);
	}

	private static final class XKkVoynichEvaCharsetDecoder extends TableCharsetDecoder {
		private XKkVoynichEvaCharsetDecoder(Charset cs) {
			super(cs, 1.65816f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_41 = getOutput0_41();
		private static final int[] getOutput0_41() {
			return new int[] {
				0xDC12DBBD, 0, 0, 0, 0xDC07DBBD, 0xDC28DBBD, 0, 0xDC0EDBBD, 0xDC05DBBD, 0, 0xDC2ADBBD, 0, 0, 0, 0xDC15DBBD, 0xDC29DBBD,
				0, 0, 0xDC0DDBBD, 0xDC2BDBBD, 0, 0, 0, 0, 0xDC18DBBD, 0, 0x5B, 0x5C, 0x5D, 0, 0, 0,
				0xDC10DBBD, 0xDC08DBBD, 0xDC0CDBBD, 0xDC09DBBD, 0xDC06DBBD, 0xDC20DBBD, 0xDC0BDBBD, 0xDC0FDBBD, 0xDC00DBBD, 0xDC02DBBD, 0xDC22DBBD, 0xDC1ADBBD, 0xDC04DBBD, 0xDC01DBBD, 0xDC14DBBD, 0xDC21DBBD,
				0xDC1DDBBD, 0xDC03DBBD, 0xDC0ADBBD, 0xDC23DBBD, 0xDC11DBBD, 0xDC1BDBBD, 0, 0xDC1CDBBD, 0xDC17DBBD, 0xDC1EDBBD, 0x7B, 0x7C, 0x7D, 0, 0, 0,
				0, 0xDC42DBBD, 0xDC43DBBD, 0xDC44DBBD, 0xDC45DBBD, 0xDC46DBBD, 0xDC47DBBD, 0xDC48DBBD, 0xDC49DBBD, 0xDC4ADBBD, 0xDC4BDBBD, 0xDC4CDBBD, 0xDC4DDBBD, 0xDC4EDBBD, 0xDC4FDBBD, 0xDC50DBBD,
				0xDC51DBBD, 0xDC52DBBD, 0xDC53DBBD, 0xDC54DBBD, 0xDC55DBBD, 0xDC56DBBD, 0xDC57DBBD, 0xDC58DBBD, 0xDC59DBBD, 0xDC5ADBBD, 0xDC5BDBBD, 0xDC5CDBBD, 0xDC5DDBBD, 0xDC5EDBBD, 0xDC5FDBBD, 0xA0,
				0xDC61DBBD, 0xDC62DBBD, 0xDC63DBBD, 0xDC64DBBD, 0xDC65DBBD, 0xDC66DBBD, 0xDC67DBBD, 0xDC68DBBD, 0xDC69DBBD, 0xDC6ADBBD, 0xDC6BDBBD, 0xDC6CDBBD, 0xDC6DDBBD, 0xDC6EDBBD, 0xDC6FDBBD, 0xDC70DBBD,
				0xDC71DBBD, 0xDC72DBBD, 0xDC73DBBD, 0xDC74DBBD, 0xDC75DBBD, 0xDC76DBBD, 0xDC77DBBD, 0xDC78DBBD, 0xDC79DBBD, 0xDC7ADBBD, 0xDC7BDBBD, 0xDC7CDBBD, 0xDC7DDBBD, 0xDC7EDBBD, 0xDC7FDBBD, 0xDC80DBBD,
				0xDC81DBBD, 0xDC82DBBD, 0xDC83DBBD, 0xDC84DBBD, 0xDC85DBBD, 0xDC86DBBD, 0xDC87DBBD, 0xDC88DBBD, 0xDC89DBBD, 0xDC8ADBBD, 0xDC8BDBBD, 0xDC8CDBBD, 0, 0xDC8EDBBD, 0xDC8FDBBD, 0xDC90DBBD,
				0xDC91DBBD, 0xDC92DBBD, 0xDC93DBBD, 0xDC94DBBD, 0xDC95DBBD, 0xDC96DBBD, 0xDC97DBBD, 0xDC98DBBD,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x2C && input <= 0x3F) return input - 0x2C + 0x2C;
			if (input >= 0x41 && input <= 0xD8) return GETOUTPUT0_41[input - 0x41];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0xDC31DBBDL;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x27: return 0xDC30DBBDL;
			case 0x28: return 0x28L;
			case 0x29: return 0x29L;
			case 0x2A: return 0xDC3FDBBDL;
			case 0x2B: return 0xDC32DBBDL;
			case 0xFC: return 0xDC9CDBBDL;
			case 0xFD: return 0xDC9DDBBDL;
			case 0xFE: return 0xDC9EDBBDL;
			case 0xFF: return 0xDC9FDBBDL;
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

	private static final class XKkVoynichEvaCharsetEncoder extends TableCharsetEncoder {
		private XKkVoynichEvaCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xDBBD: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x2C && input <= 0x3F) return input - 0x2C + 0x2C;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0x26L;
			case 0x28: return 0x28L;
			case 0x29: return 0x29L;
			case 0x5B: return 0x5BL;
			case 0x5C: return 0x5CL;
			case 0x5D: return 0x5DL;
			case 0x7B: return 0x7BL;
			case 0x7C: return 0x7CL;
			case 0x7D: return 0x7DL;
			case 0xA0: return 0xA0L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DC00 = getOutput1_DC00();
		private static final char[] getOutput1_DC00() {
			return "injrmIeEbdsgcSHhauA\u0000oO\u0000yY\u0000lvxqz\u0000fpkt\u0000\u0000\u0000\u0000FPKT\u0000\u0000\u0000\u0000\'\"+\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000*".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xDC42 && input <= 0xDC5F) return input - 0xDC42 + 0x82;
			if (input >= 0xDC00 && input <= 0xDC3F) return GETOUTPUT1_DC00[input - 0xDC00];
			if (input >= 0xDC61 && input <= 0xDC8C) return input - 0xDC61 + 0xA1;
			switch (input) {
			case 0xDC8E: return 0xCEL;
			case 0xDC8F: return 0xCFL;
			case 0xDC90: return 0xD0L;
			case 0xDC91: return 0xD1L;
			case 0xDC92: return 0xD2L;
			case 0xDC93: return 0xD3L;
			case 0xDC94: return 0xD4L;
			case 0xDC95: return 0xD5L;
			case 0xDC96: return 0xD6L;
			case 0xDC97: return 0xD7L;
			case 0xDC98: return 0xD8L;
			case 0xDC9C: return 0xFCL;
			case 0xDC9D: return 0xFDL;
			case 0xDC9E: return 0xFEL;
			case 0xDC9F: return 0xFF01L;
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
