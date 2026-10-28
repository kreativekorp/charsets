package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1006GenericCharset extends Charset {
	public XIBM1006GenericCharset() {
		super("x-IBM1006-generic", new String[]{"x-IBM1006"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1006GenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1006GenericCharsetEncoder(this);
	}

	private static final class XIBM1006GenericCharsetDecoder extends TableCharsetDecoder {
		private XIBM1006GenericCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u06F0\u06F1\u06F2\u06F3\u06F4\u06F5\u06F6\u06F7\u06F8\u06F9\u060C\u061B\u00AD\u061F\uFE81\uFE8D\uFE8E\uF8FB\uFE8F\uFE91\uFB56\uFB58\uFE93\uFE95\uFE97\uFB66\uFB68\uFE99\uFE9B\uFE9D\uFE9F\uFB7A\uFB7C\uFEA1\uFEA3\uFEA5\uFEA7\uFEA9\uFB84\uFEAB\uFEAD\uFB8C\uFEAF\uFB8A\uFEB1\uFEB3\uFEB5\uFEB7\uFEB9\uFEBB\uFEBD\uFEBF\uFEC1\uFEC5\uFEC9\uFECA\uFECB\uFECC\uFECD\uFECE\uFECF\uFED0\uFED1\uFED3\uFED5\uFED7\uFED9\uFEDB\uFB92\uFB94\uFEDD\uFEDF\uFEE0\uFEE1\uFEE3\uFB9E\uFEE5\uFEE7\uFE85\uFEED\uFBA6\uFBA8\uFBA9\uFBAA\uFE80\uFE89\uFE8A\uFE8B\uFEF1\uFEF2\uFEF3\uFBB0\uFBAE\uFE7C\uFE7D".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFF) return GETOUTPUT0_A1[input - 0xA1];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM1006GenericCharsetEncoder extends TableCharsetEncoder {
		private XIBM1006GenericCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA0) return input - 0x20 + 0x20;
			if (input >= 0xFB7A && input <= 0xFBB0) return CommonSubtables.COMMON3[input - 0xFB7A];
			if (input >= 0xFE7C && input <= 0xFEF3) return CommonSubtables.COMMON4[input - 0xFE7C];
			switch (input) {
			case 0xAD: return 0xADL;
			case 0x60C: return 0xABL;
			case 0x61B: return 0xACL;
			case 0x61F: return 0xAEL;
			case 0x6F0: return 0xA1L;
			case 0x6F1: return 0xA2L;
			case 0x6F2: return 0xA3L;
			case 0x6F3: return 0xA4L;
			case 0x6F4: return 0xA5L;
			case 0x6F5: return 0xA6L;
			case 0x6F6: return 0xA7L;
			case 0x6F7: return 0xA8L;
			case 0x6F8: return 0xA9L;
			case 0x6F9: return 0xAAL;
			case 0xF8FB: return 0xB2L;
			case 0xFB56: return 0xB5L;
			case 0xFB58: return 0xB6L;
			case 0xFB66: return 0xBAL;
			case 0xFB68: return 0xBBL;
			case 0xFBFC: return 0xF9L;
			case 0xFBFD: return 0xFAL;
			case 0xFBFE: return 0xFBL;
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
