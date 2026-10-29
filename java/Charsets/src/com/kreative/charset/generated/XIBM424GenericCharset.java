package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM424GenericCharset extends Charset {
	public XIBM424GenericCharset() {
		super("x-IBM424-generic", new String[]{"x-IBM424"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM424GenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM424GenericCharsetEncoder(this);
	}

	private static final class XIBM424GenericCharsetDecoder extends TableCharsetDecoder {
		private XIBM424GenericCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_GENERIC[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON265[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM424GenericCharsetEncoder extends TableCharsetEncoder {
		private XIBM424GenericCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_GENERIC[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON1[input - 0x20];
			if (input >= 0xA0 && input <= 0xBE) return CommonSubtables.COMMON57[input - 0xA0];
			if (input >= 0x5D0 && input <= 0x5EA) return CommonSubtables.COMMON58[input - 0x5D0];
			switch (input) {
			case 0xD7: return 0xBFL;
			case 0xF7: return 0xE1L;
			case 0x2017: return 0x78L;
			case 0x2022: return 0xB3L;
			case 0x203E: return 0xBCL;
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
