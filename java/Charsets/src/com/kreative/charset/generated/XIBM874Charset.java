package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM874Charset extends Charset {
	public XIBM874Charset() {
		super("x-IBM874", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM874CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM874CharsetEncoder(this);
	}

	private static final class XIBM874CharsetDecoder extends TableCharsetDecoder {
		private XIBM874CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xDA) return input - 0xA1 + 0xE01;
			if (input >= 0xDF && input <= 0xFB) return input - 0xDF + 0xE3F;
			switch (input) {
			case 0x80: return 0x20ACL;
			case 0xA0: return 0xE48L;
			case 0xDB: return 0xE49L;
			case 0xDC: return 0xE4AL;
			case 0xDD: return 0xE4BL;
			case 0xDE: return 0xE4CL;
			case 0xFC: return 0xA2L;
			case 0xFD: return 0xACL;
			case 0xFE: return 0xA6L;
			case 0xFF: return 0xA0L;
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

	private static final class XIBM874CharsetEncoder extends TableCharsetEncoder {
		private XIBM874CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xE01 && input <= 0xE3A) return input - 0xE01 + 0xA1;
			if (input >= 0xE3F && input <= 0xE5B) return input - 0xE3F + 0xDF;
			switch (input) {
			case 0xA0: return 0xFF01L;
			case 0xA2: return 0xFCL;
			case 0xA6: return 0xFEL;
			case 0xAC: return 0xFDL;
			case 0x20AC: return 0x80L;
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
