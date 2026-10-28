package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM868Charset extends Charset {
	public XIBM868Charset() {
		super("x-IBM868", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM868CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM868CharsetEncoder(this);
	}

	private static final class XIBM868CharsetDecoder extends TableCharsetDecoder {
		private XIBM868CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u06F0\u06F1\u06F2\u06F3\u06F4\u06F5\u06F6\u06F7\u06F8\u06F9\u060C\u061B\u061F\uFE81\uFE8D\uFE8E\uF8FB\uFE8F\uFE91\uFB56\uFB58\uFE93\uFE95\uFE97\uFB66\uFB68\uFE99\uFE9B\uFE9D\uFE9F\uFB7A\uFB7C\uFEA1\uFEA3\uFEA5\uFEA7\uFEA9\uFB88\uFEAB\uFEAD\uFB8C\uFEAF\uFB8A\uFEB1\uFEB3\uFEB5\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\uFEB7\uFEB9\uFEBB\uFEBD\u2563\u2551\u2557\u255D\uFEBF\uFEC3\u2510\u2514\u2534\u252C\u251C\u2500\u253C\uFEC7\uFEC9\u255A\u2554\u2569\u2566\u2560\u2550\u256C\uFECA\uFECB\uFECC\uFECD\uFECE\uFECF\uFED0\uFED1\uFED3\uFED5\u2518\u250C\u2588\u2584\uFED7\uFB8E\u2580\uFEDB\uFB92\uFB94\uFEDD\uFEDF\uFEE0\uFEE1\uFEE3\uFB9E\uFEE5\uFEE7\uFE85\uFEED\uFBA6\uFBA8\uFBA9\u00AD\uFBAA\uFE80\uFE89\uFE8A\uFE8B\uFBFC\uFBFD\uFBFE\uFBB0\uFBAE\uFE7C\uFE7D\u0000\u25A0\u00A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFF) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM868CharsetEncoder extends TableCharsetEncoder {
		private XIBM868CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_FE7C = getOutput0_FE7C();
		private static final char[] getOutput0_FE7C() {
			return "\u00FB\u00FC\u0000\u0000\u00F2\u008D\u0000\u0000\u0000\u00EB\u0000\u0000\u0000\u00F3\u00F4\u00F5\u0000\u008E\u008F\u0091\u0000\u0092\u0000\u0095\u0000\u0096\u0000\u0097\u0000\u009A\u0000\u009B\u0000\u009C\u0000\u009D\u0000\u00A0\u0000\u00A1\u0000\u00A2\u0000\u00A3\u0000\u00A4\u0000\u00A6\u0000\u00A7\u0000\u00A9\u0000\u00AB\u0000\u00AC\u0000\u00AD\u0000\u00B5\u0000\u00B6\u0000\u00B7\u0000\u00B8\u0000\u00BD\u0000\u0000\u0000\u00BE\u0000\u0000\u0000\u00C6\u0000\u00C7\u00CF\u00D0\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u0000\u00D7\u0000\u00D8\u0000\u00DD\u0000\u0000\u0000\u00E0\u0000\u00E3\u0000\u00E4\u00E5\u00E6\u0000\u00E7\u0000\u00E9\u0000\u00EA\u0000\u0000\u0000\u0000\u0000\u00EC".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xFE7C && input <= 0xFEED) return GETOUTPUT0_FE7C[input - 0xFE7C];
			switch (input) {
			case 0xA0: return 0xFF01L;
			case 0xAB: return 0xAEL;
			case 0xAD: return 0xF0L;
			case 0xBB: return 0xAFL;
			case 0x60C: return 0x8AL;
			case 0x61B: return 0x8BL;
			case 0x61F: return 0x8CL;
			case 0x6F0: return 0x80L;
			case 0x6F1: return 0x81L;
			case 0x6F2: return 0x82L;
			case 0x6F3: return 0x83L;
			case 0x6F4: return 0x84L;
			case 0x6F5: return 0x85L;
			case 0x6F6: return 0x86L;
			case 0x6F7: return 0x87L;
			case 0x6F8: return 0x88L;
			case 0x6F9: return 0x89L;
			case 0x2500: return 0xC4L;
			case 0x2502: return 0xB3L;
			case 0x250C: return 0xDAL;
			case 0x2510: return 0xBFL;
			case 0x2514: return 0xC0L;
			case 0x2518: return 0xD9L;
			case 0x251C: return 0xC3L;
			case 0x2524: return 0xB4L;
			case 0x252C: return 0xC2L;
			case 0x2534: return 0xC1L;
			case 0x253C: return 0xC5L;
			case 0x2550: return 0xCDL;
			case 0x2551: return 0xBAL;
			case 0x2554: return 0xC9L;
			case 0x2557: return 0xBBL;
			case 0x255A: return 0xC8L;
			case 0x255D: return 0xBCL;
			case 0x2560: return 0xCCL;
			case 0x2563: return 0xB9L;
			case 0x2566: return 0xCBL;
			case 0x2569: return 0xCAL;
			case 0x256C: return 0xCEL;
			case 0x2580: return 0xDFL;
			case 0x2584: return 0xDCL;
			case 0x2588: return 0xDBL;
			case 0x2591: return 0xB0L;
			case 0x2592: return 0xB1L;
			case 0x2593: return 0xB2L;
			case 0x25A0: return 0xFEL;
			case 0xF8FB: return 0x90L;
			case 0xFB56: return 0x93L;
			case 0xFB58: return 0x94L;
			case 0xFB66: return 0x98L;
			case 0xFB68: return 0x99L;
			case 0xFB7A: return 0x9EL;
			case 0xFB7C: return 0x9FL;
			case 0xFB88: return 0xA5L;
			case 0xFB8A: return 0xAAL;
			case 0xFB8C: return 0xA8L;
			case 0xFB8E: return 0xDEL;
			case 0xFB92: return 0xE1L;
			case 0xFB94: return 0xE2L;
			case 0xFB9E: return 0xE8L;
			case 0xFBA6: return 0xEDL;
			case 0xFBA8: return 0xEEL;
			case 0xFBA9: return 0xEFL;
			case 0xFBAA: return 0xF1L;
			case 0xFBAE: return 0xFAL;
			case 0xFBB0: return 0xF9L;
			case 0xFBFC: return 0xF6L;
			case 0xFBFD: return 0xF7L;
			case 0xFBFE: return 0xF8L;
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
