package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1133Charset extends Charset {
	public XIBM1133Charset() {
		super("x-IBM1133", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1133CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1133CharsetEncoder(this);
	}

	private static final class XIBM1133CharsetDecoder extends TableCharsetDecoder {
		private XIBM1133CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u0E81\u0E82\u0E84\u0E87\u0E88\u0EAA\u0E8A\u0E8D\u0E94\u0E95\u0E96\u0E97\u0E99\u0E9A\u0E9B\u0E9C\u0E9D\u0E9E\u0E9F\u0EA1\u0EA2\u0EA3\u0EA5\u0EA7\u0EAB\u0EAD\u0EAE\u0000\u0000\u0000\u0EAF\u0EB0\u0EB2\u0EB3\u0EB4\u0EB5\u0EB6\u0EB7\u0EB8\u0EB9\u0EBC\u0EB1\u0EBB\u0EBD\u0000\u0000\u0000\u0EC0\u0EC1\u0EC2\u0EC3\u0EC4\u0EC8\u0EC9\u0ECA\u0ECB\u0ECC\u0ECD\u0EC6\u0000\u0EDC\u0EDD\u20AD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0ED0\u0ED1\u0ED2\u0ED3\u0ED4\u0ED5\u0ED6\u0ED7\u0ED8\u0ED9\u0000\u0000\u00A2\u00AC\u00A6\u00A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFF) return GETOUTPUT0_A1[input - 0xA1];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM1133CharsetEncoder extends TableCharsetEncoder {
		private XIBM1133CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_E81 = getOutput0_E81();
		private static final char[] getOutput0_E81() {
			return "\u00A1\u00A2\u0000\u00A3\u0000\u0000\u00A4\u00A5\u0000\u00A7\u0000\u0000\u00A8\u0000\u0000\u0000\u0000\u0000\u0000\u00A9\u00AA\u00AB\u00AC\u0000\u00AD\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u0000\u00B4\u00B5\u00B6\u0000\u00B7\u0000\u00B8\u0000\u0000\u00A6\u00B9\u0000\u00BA\u00BB\u00BF\u00C0\u00CA\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u00C7\u00C8\u0000\u00CB\u00C9\u00CC\u0000\u0000\u00D0\u00D1\u00D2\u00D3\u00D4\u0000\u00DB\u0000\u00D5\u00D6\u00D7\u00D8\u00D9\u00DA\u0000\u0000\u00F0\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u0000\u0000\u00DD\u00DE".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xE81 && input <= 0xEDD) return GETOUTPUT0_E81[input - 0xE81];
			switch (input) {
			case 0xA0: return 0xFF01L;
			case 0xA2: return 0xFCL;
			case 0xA6: return 0xFEL;
			case 0xAC: return 0xFDL;
			case 0x20AD: return 0xDFL;
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
