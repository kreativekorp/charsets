package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1155GenericCharset extends Charset {
	public XIBM1155GenericCharset() {
		super("x-IBM1155-generic", new String[]{"x-IBM1155"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1155GenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1155GenericCharsetEncoder(this);
	}

	private static final class XIBM1155GenericCharsetDecoder extends TableCharsetDecoder {
		private XIBM1155GenericCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_GENERIC[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON52[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM1155GenericCharsetEncoder extends TableCharsetEncoder {
		private XIBM1155GenericCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_GENERIC[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON9[input - 0x20];
			if (input >= 0xA0 && input <= 0xFF) return CommonSubtables.COMMON53[input - 0xA0];
			switch (input) {
			case 0x11E: return 0x5AL;
			case 0x11F: return 0xD0L;
			case 0x130: return 0x5BL;
			case 0x131: return 0x79L;
			case 0x15E: return 0x7CL;
			case 0x15F: return 0x6AL;
			case 0x20AC: return 0x9FL;
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
