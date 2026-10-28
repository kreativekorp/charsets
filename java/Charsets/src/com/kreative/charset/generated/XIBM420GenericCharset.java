package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM420GenericCharset extends Charset {
	public XIBM420GenericCharset() {
		super("x-IBM420-generic", new String[]{"x-IBM420"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM420GenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM420GenericCharsetEncoder(this);
	}

	private static final class XIBM420GenericCharsetDecoder extends TableCharsetDecoder {
		private XIBM420GenericCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_GENERIC[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON256[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM420GenericCharsetEncoder extends TableCharsetEncoder {
		private XIBM420GenericCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_GENERIC[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON257[input - 0x20];
			if (input >= 0x60C && input <= 0x66D) return CommonSubtables.COMMON258[input - 0x60C];
			if (input >= 0xFE7C && input <= 0xFF5C) return CommonSubtables.COMMON259[input - 0xFE7C];
			switch (input) {
			case 0xA0: return 0x41L;
			case 0xA2: return 0x4AL;
			case 0xA6: return 0x6AL;
			case 0xAC: return 0x5FL;
			case 0xAD: return 0xCAL;
			case 0xD7: return 0xE0L;
			case 0xF7: return 0xA1L;
			case 0x200B: return 0x45L;
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
