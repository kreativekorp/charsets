package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1098Charset extends Charset {
	public XIBM1098Charset() {
		super("x-IBM1098", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1098CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1098CharsetEncoder(this);
	}

	private static final class XIBM1098CharsetDecoder extends TableCharsetDecoder {
		private XIBM1098CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_82 = getOutput0_82();
		private static final char[] getOutput0_82() {
			return "\u060C\u061B\u061F\u064B\uFE81\uFE82\uF8FA\uFE8D\uFE8E\uF8FB\uFE80\uFE83\uFE84\uF8F9\uFE85\uFE8B\uFE8F\uFE91\uFB56\uFB58\uFE95\uFE97\uFE99\uFE9B\uFE9D\uFE9F\uFB7A\uFB7C\u00D7\uFEA1\uFEA3\uFEA5\uFEA7\uFEA9\uFEAB\uFEAD\uFEAF\uFB8A\uFEB1\uFEB3\uFEB5\uFEB7\uFEB9\uFEBB\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\uFEBD\uFEBF\uFEC1\uFEC3\u2563\u2551\u2557\u255D\u00A4\uFEC5\u2510\u2514\u2534\u252C\u251C\u2500\u253C\uFEC7\uFEC9\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u0000\uFECA\uFECB\uFECC\uFECD\uFECE\uFECF\uFED0\uFED1\uFED3\u2518\u250C\u2588\u2584\uFED5\uFED7\u2580\uFB8E\uFEDB\uFB92\uFB94\uFEDD\uFEDF\uFEE1\uFEE3\uFEE5\uFEE7\uFEED\uFEE9\uFEEB\uFEEC\uFBA4\uFBFC\u00AD\uFBFD\uFBFE\u0640\u06F0\u06F1\u06F2\u06F3\u06F4\u06F5\u06F6\u06F7\u06F8\u06F9\u25A0\u00A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x82 && input <= 0xFF) return GETOUTPUT0_82[input - 0x82];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM1098CharsetEncoder extends TableCharsetEncoder {
		private XIBM1098CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_FE80 = getOutput0_FE80();
		private static final char[] getOutput0_FE80() {
			return "\u008C\u0086\u0087\u008D\u008E\u0090\u0000\u0000\u0000\u0000\u0000\u0091\u0000\u0089\u008A\u0092\u0000\u0093\u0000\u0000\u0000\u0096\u0000\u0097\u0000\u0098\u0000\u0099\u0000\u009A\u0000\u009B\u0000\u009F\u0000\u00A0\u0000\u00A1\u0000\u00A2\u0000\u00A3\u0000\u00A4\u0000\u00A5\u0000\u00A6\u0000\u00A8\u0000\u00A9\u0000\u00AA\u0000\u00AB\u0000\u00AC\u0000\u00AD\u0000\u00B5\u0000\u00B6\u0000\u00B7\u0000\u00B8\u0000\u00BE\u0000\u00C6\u0000\u00C7\u00D0\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u00D7\u0000\u00D8\u0000\u00DD\u0000\u00DE\u0000\u0000\u0000\u00E1\u0000\u00E4\u0000\u00E5\u0000\u00E6\u0000\u00E7\u0000\u00E8\u0000\u00E9\u0000\u00EB\u0000\u00EC\u00ED\u00EA".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xFE80 && input <= 0xFEED) return GETOUTPUT0_FE80[input - 0xFE80];
			switch (input) {
			case 0xA0: return 0xFF01L;
			case 0xA4: return 0xBDL;
			case 0xAB: return 0xAEL;
			case 0xAD: return 0xF0L;
			case 0xBB: return 0xAFL;
			case 0xD7: return 0x9EL;
			case 0x60C: return 0x82L;
			case 0x61B: return 0x83L;
			case 0x61F: return 0x84L;
			case 0x640: return 0xF3L;
			case 0x64B: return 0x85L;
			case 0x6F0: return 0xF4L;
			case 0x6F1: return 0xF5L;
			case 0x6F2: return 0xF6L;
			case 0x6F3: return 0xF7L;
			case 0x6F4: return 0xF8L;
			case 0x6F5: return 0xF9L;
			case 0x6F6: return 0xFAL;
			case 0x6F7: return 0xFBL;
			case 0x6F8: return 0xFCL;
			case 0x6F9: return 0xFDL;
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
			case 0xF8F9: return 0x8FL;
			case 0xF8FA: return 0x88L;
			case 0xF8FB: return 0x8BL;
			case 0xFB56: return 0x94L;
			case 0xFB58: return 0x95L;
			case 0xFB7A: return 0x9CL;
			case 0xFB7C: return 0x9DL;
			case 0xFB8A: return 0xA7L;
			case 0xFB8E: return 0xE0L;
			case 0xFB92: return 0xE2L;
			case 0xFB94: return 0xE3L;
			case 0xFBA4: return 0xEEL;
			case 0xFBFC: return 0xEFL;
			case 0xFBFD: return 0xF1L;
			case 0xFBFE: return 0xF2L;
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
