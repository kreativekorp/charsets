package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XBcdCodeBCharset extends Charset {
	public XBcdCodeBCharset() {
		super("x-bcd-code-b", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XBcdCodeBCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XBcdCodeBCharsetEncoder(this);
	}

	private static final class XBcdCodeBCharsetDecoder extends TableCharsetDecoder {
		private XBcdCodeBCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "0123456789-EHLP ".toCharArray();
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

	private static final class XBcdCodeBCharsetEncoder extends TableCharsetEncoder {
		private XBcdCodeBCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{15}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x50) return CommonSubtables.COMMON1220[input - 0x20];
			switch (input) {
			case 0x65: return 0xBL;
			case 0x68: return 0xCL;
			case 0x6C: return 0xDL;
			case 0x70: return 0xEL;
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
