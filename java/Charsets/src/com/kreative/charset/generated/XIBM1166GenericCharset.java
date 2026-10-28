package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1166GenericCharset extends Charset {
	public XIBM1166GenericCharset() {
		super("x-IBM1166-generic", new String[]{"x-IBM1166"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1166GenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1166GenericCharsetEncoder(this);
	}

	private static final class XIBM1166GenericCharsetDecoder extends TableCharsetDecoder {
		private XIBM1166GenericCharsetDecoder(Charset cs) {
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

	private static final class XIBM1166GenericCharsetEncoder extends TableCharsetEncoder {
		private XIBM1166GenericCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_GENERIC[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON6[input - 0x20];
			if (input >= 0x401 && input <= 0x45E) return CommonSubtables.COMMON53[input - 0x401];
			switch (input) {
			case 0xA0: return 0x41L;
			case 0xAD: return 0x73L;
			case 0x492: return 0x62L;
			case 0x493: return 0x43L;
			case 0x49A: return 0x67L;
			case 0x49B: return 0x48L;
			case 0x4A2: return 0x69L;
			case 0x4A3: return 0x51L;
			case 0x4AE: return 0x72L;
			case 0x4AF: return 0x54L;
			case 0x4B0: return 0x71L;
			case 0x4B1: return 0x53L;
			case 0x4BA: return 0x75L;
			case 0x4BB: return 0x56L;
			case 0x4D8: return 0x59L;
			case 0x4D9: return 0x42L;
			case 0x4E8: return 0x70L;
			case 0x4E9: return 0x52L;
			case 0x20AC: return 0xE1L;
			case 0x2116: return 0x58L;
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
