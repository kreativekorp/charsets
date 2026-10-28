package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM875GenericCharset extends Charset {
	public XIBM875GenericCharset() {
		super("x-IBM875-generic", new String[]{"x-IBM875"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM875GenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM875GenericCharsetEncoder(this);
	}

	private static final class XIBM875GenericCharsetDecoder extends TableCharsetDecoder {
		private XIBM875GenericCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_GENERIC[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON280[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM875GenericCharsetEncoder extends TableCharsetEncoder {
		private XIBM875GenericCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_GENERIC[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON6[input - 0x20];
			if (input >= 0xA0 && input <= 0xBD) return CommonSubtables.COMMON281[input - 0xA0];
			if (input >= 0x385 && input <= 0x3CE) return CommonSubtables.COMMON282[input - 0x385];
			switch (input) {
			case 0x2015: return 0xCFL;
			case 0x2018: return 0xCEL;
			case 0x2019: return 0xDEL;
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
