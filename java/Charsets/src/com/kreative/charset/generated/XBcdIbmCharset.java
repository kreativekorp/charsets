package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XBcdIbmCharset extends Charset {
	public XBcdIbmCharset() {
		super("x-bcd-ibm", new String[]{"x-bcd"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XBcdIbmCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XBcdIbmCharsetEncoder(this);
	}

	private static final class XBcdIbmCharsetDecoder extends TableCharsetDecoder {
		private XBcdIbmCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return new char[] {
				0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x2B, 0x2D, 0x2B, 0x2D, 0x2B, 0x20,
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

	private static final class XBcdIbmCharsetEncoder extends TableCharsetEncoder {
		private XBcdIbmCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{15}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			switch (input) {
			case 0x20: return 0xFL;
			case 0x2B: return 0xCL;
			case 0x2D: return 0xDL;
			case 0x30: return 0x1L;
			case 0x31: return 0x101L;
			case 0x32: return 0x201L;
			case 0x33: return 0x301L;
			case 0x34: return 0x401L;
			case 0x35: return 0x501L;
			case 0x36: return 0x601L;
			case 0x37: return 0x701L;
			case 0x38: return 0x8L;
			case 0x39: return 0x9L;
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
