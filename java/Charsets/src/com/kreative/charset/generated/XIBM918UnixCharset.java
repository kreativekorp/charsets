package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM918UnixCharset extends Charset {
	public XIBM918UnixCharset() {
		super("x-IBM918-unix", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM918UnixCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM918UnixCharsetEncoder(this);
	}

	private static final class XIBM918UnixCharsetDecoder extends TableCharsetDecoder {
		private XIBM918UnixCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_UNIX[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON289[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM918UnixCharsetEncoder extends TableCharsetEncoder {
		private XIBM918UnixCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_UNIX[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON290[input - 0x20];
			if (input >= 0xFE7C && input <= 0xFEED) return CommonSubtables.COMMON291[input - 0xFE7C];
			switch (input) {
			case 0xA0: return 0x41L;
			case 0xAD: return 0xCAL;
			case 0x60C: return 0x42L;
			case 0x61B: return 0x43L;
			case 0x61F: return 0x44L;
			case 0x6F0: return 0x70L;
			case 0x6F1: return 0x71L;
			case 0x6F2: return 0x72L;
			case 0x6F3: return 0x73L;
			case 0x6F4: return 0x74L;
			case 0x6F5: return 0x75L;
			case 0x6F6: return 0x76L;
			case 0x6F7: return 0x77L;
			case 0x6F8: return 0x78L;
			case 0x6F9: return 0x79L;
			case 0xF8FB: return 0x48L;
			case 0xFB56: return 0x52L;
			case 0xFB58: return 0x53L;
			case 0xFB66: return 0x57L;
			case 0xFB68: return 0x58L;
			case 0xFB7A: return 0x65L;
			case 0xFB7C: return 0x66L;
			case 0xFB88: return 0x8BL;
			case 0xFB8A: return 0x90L;
			case 0xFB8C: return 0x8EL;
			case 0xFB8E: return 0xB9L;
			case 0xFB92: return 0xBCL;
			case 0xFB94: return 0xBDL;
			case 0xFB9E: return 0xCEL;
			case 0xFBA6: return 0xDDL;
			case 0xFBA8: return 0xDEL;
			case 0xFBA9: return 0xDFL;
			case 0xFBAA: return 0xE1L;
			case 0xFBAE: return 0xFCL;
			case 0xFBB0: return 0xFBL;
			case 0xFBFC: return 0xEEL;
			case 0xFBFD: return 0xEFL;
			case 0xFBFE: return 0xFAL;
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
