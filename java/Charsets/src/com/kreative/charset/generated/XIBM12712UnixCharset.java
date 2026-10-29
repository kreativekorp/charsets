package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM12712UnixCharset extends Charset {
	public XIBM12712UnixCharset() {
		super("x-IBM12712-unix", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM12712UnixCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM12712UnixCharsetEncoder(this);
	}

	private static final class XIBM12712UnixCharsetDecoder extends TableCharsetDecoder {
		private XIBM12712UnixCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_UNIX[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON56[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM12712UnixCharsetEncoder extends TableCharsetEncoder {
		private XIBM12712UnixCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_UNIX[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON1[input - 0x20];
			if (input >= 0xA0 && input <= 0xBE) return CommonSubtables.COMMON57[input - 0xA0];
			if (input >= 0x5D0 && input <= 0x5EA) return CommonSubtables.COMMON58[input - 0x5D0];
			switch (input) {
			case 0xD7: return 0xBFL;
			case 0xF7: return 0xE1L;
			case 0x200E: return 0xFDL;
			case 0x200F: return 0xFEL;
			case 0x2017: return 0x78L;
			case 0x202A: return 0xFBL;
			case 0x202B: return 0xFCL;
			case 0x202C: return 0xDDL;
			case 0x202D: return 0xDBL;
			case 0x202E: return 0xDCL;
			case 0x20AA: return 0x9EL;
			case 0x20AC: return 0x9CL;
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
