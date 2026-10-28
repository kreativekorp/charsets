package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XBcdTelephonyCharset extends Charset {
	public XBcdTelephonyCharset() {
		super("x-bcd-telephony", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XBcdTelephonyCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XBcdTelephonyCharsetEncoder(this);
	}

	private static final class XBcdTelephonyCharsetDecoder extends TableCharsetDecoder {
		private XBcdTelephonyCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "0123456789*#ABC ".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0xF) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XBcdTelephonyCharsetEncoder extends TableCharsetEncoder {
		private XBcdTelephonyCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{15}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x43) return CommonSubtables.COMMON1226[input - 0x20];
			switch (input) {
			case 0x61: return 0xCL;
			case 0x62: return 0xDL;
			case 0x63: return 0xEL;
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
