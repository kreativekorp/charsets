package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1097UnixCharset extends Charset {
	public XIBM1097UnixCharset() {
		super("x-IBM1097-unix", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1097UnixCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1097UnixCharsetEncoder(this);
	}

	private static final class XIBM1097UnixCharsetDecoder extends TableCharsetDecoder {
		private XIBM1097UnixCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_UNIX[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON14[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM1097UnixCharsetEncoder extends TableCharsetEncoder {
		private XIBM1097UnixCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_UNIX[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON15[input - 0x20];
			if (input >= 0xFE80 && input <= 0xFEED) return CommonSubtables.COMMON16[input - 0xFE80];
			switch (input) {
			case 0xA0: return 0x41L;
			case 0xA4: return 0x4AL;
			case 0xAB: return 0x8AL;
			case 0xAC: return 0x5FL;
			case 0xAD: return 0xCAL;
			case 0xBB: return 0x8BL;
			case 0xD7: return 0xBFL;
			case 0x60C: return 0x42L;
			case 0x61B: return 0x6AL;
			case 0x61F: return 0xE1L;
			case 0x640: return 0xEAL;
			case 0x64B: return 0x43L;
			case 0x6F0: return 0xEBL;
			case 0x6F1: return 0xECL;
			case 0x6F2: return 0xEDL;
			case 0x6F3: return 0xEEL;
			case 0x6F4: return 0xEFL;
			case 0x6F5: return 0xFAL;
			case 0x6F6: return 0xFBL;
			case 0x6F7: return 0xFCL;
			case 0x6F8: return 0xFDL;
			case 0x6F9: return 0xFEL;
			case 0xF8F9: return 0x54L;
			case 0xF8FA: return 0x46L;
			case 0xF8FB: return 0x49L;
			case 0xFB56: return 0x59L;
			case 0xFB58: return 0x62L;
			case 0xFB7A: return 0x69L;
			case 0xFB7C: return 0x70L;
			case 0xFB8A: return 0x80L;
			case 0xFB8E: return 0xB6L;
			case 0xFB92: return 0xB8L;
			case 0xFB94: return 0xB9L;
			case 0xFBA4: return 0xDCL;
			case 0xFBFC: return 0xDDL;
			case 0xFBFD: return 0xDEL;
			case 0xFBFE: return 0xDFL;
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
