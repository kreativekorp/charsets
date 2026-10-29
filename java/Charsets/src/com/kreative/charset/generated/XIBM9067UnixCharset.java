package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM9067UnixCharset extends Charset {
	public XIBM9067UnixCharset() {
		super("x-IBM9067-unix", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM9067UnixCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM9067UnixCharsetEncoder(this);
	}

	private static final class XIBM9067UnixCharsetDecoder extends TableCharsetDecoder {
		private XIBM9067UnixCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_UNIX[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON287[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM9067UnixCharsetEncoder extends TableCharsetEncoder {
		private XIBM9067UnixCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_UNIX[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON6[input - 0x20];
			if (input >= 0xA0 && input <= 0xBD) return CommonSubtables.COMMON268[input - 0xA0];
			if (input >= 0x37A && input <= 0x3CE) return CommonSubtables.COMMON288[input - 0x37A];
			switch (input) {
			case 0x2015: return 0xCFL;
			case 0x2018: return 0xCEL;
			case 0x2019: return 0xDEL;
			case 0x20AC: return 0xFCL;
			case 0x20AF: return 0xE1L;
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
