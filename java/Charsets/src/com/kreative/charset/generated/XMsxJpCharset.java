package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMsxJpCharset extends Charset {
	public XMsxJpCharset() {
		super("x-msx-jp", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMsxJpCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMsxJpCharsetEncoder(this);
	}

	private static final class XMsxJpCharsetDecoder extends TableCharsetDecoder {
		private XMsxJpCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7F) return input - 0x5D + 0x5D;
			if (input >= 0x80 && input <= 0xFD) return CommonSubtables.COMMON1706[input - 0x80];
			switch (input) {
			case 0x5C: return 0xA5L;
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

	private static final class XMsxJpCharsetEncoder extends TableCharsetEncoder {
		private XMsxJpCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7F) return input - 0x5D + 0x5D;
			if (input >= 0x3041 && input <= 0x30FC) return CommonSubtables.COMMON1707[input - 0x3041];
			if (input >= 0xFF01 && input <= 0xFF3B) return input - 0xFF01 + 0x21;
			if (input >= 0xFF3D && input <= 0xFF5E) return input - 0xFF3D + 0x5D;
			if (input >= 0xFF61 && input <= 0xFF9F) return input - 0xFF61 + 0xA1;
			switch (input) {
			case 0xA5: return 0x5CL;
			case 0x25CB: return 0x84L;
			case 0x25CF: return 0x85L;
			case 0x2660: return 0x80L;
			case 0x2663: return 0x82L;
			case 0x2665: return 0x81L;
			case 0x2666: return 0x83L;
			case 0x3000: return 0xA0L;
			case 0x3001: return 0xA4L;
			case 0x3002: return 0xA1L;
			case 0x300C: return 0xA2L;
			case 0x300D: return 0xA3L;
			case 0xFFE5: return 0x5CL;
			case 0xFFEE: return 0x84L;
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
