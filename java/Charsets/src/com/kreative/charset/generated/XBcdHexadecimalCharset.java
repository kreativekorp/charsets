package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XBcdHexadecimalCharset extends Charset {
	public XBcdHexadecimalCharset() {
		super("x-bcd-hexadecimal", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XBcdHexadecimalCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XBcdHexadecimalCharsetEncoder(this);
	}

	private static final class XBcdHexadecimalCharsetDecoder extends TableCharsetDecoder {
		private XBcdHexadecimalCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return new char[] {
				0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x41, 0x42, 0x43, 0x44, 0x45, 0x46,
			};
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

	private static final class XBcdHexadecimalCharsetEncoder extends TableCharsetEncoder {
		private XBcdHexadecimalCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{15}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_30 = getOutput0_30();
		private static final char[] getOutput0_30() {
			return new char[] {
				0x1, 0x101, 0x201, 0x301, 0x401, 0x501, 0x601, 0x701, 0x8, 0x9, 0, 0, 0, 0, 0, 0,
				0, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x30 && input <= 0x46) return GETOUTPUT0_30[input - 0x30];
			switch (input) {
			case 0x61: return 0xAL;
			case 0x62: return 0xBL;
			case 0x63: return 0xCL;
			case 0x64: return 0xDL;
			case 0x65: return 0xEL;
			case 0x66: return 0xFL;
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
