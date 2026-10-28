package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM864Charset extends Charset {
	public XIBM864Charset() {
		super("x-IBM864", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM864CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM864CharsetEncoder(this);
	}

	private static final class XIBM864CharsetDecoder extends TableCharsetDecoder {
		private XIBM864CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00B0\u00B7\u2219\u221A\u2592\u2500\u2502\u253C\u2524\u252C\u251C\u2534\u2510\u250C\u2514\u2518\u03B2\u221E\u03C6\u00B1\u00BD\u00BC\u2248\u00AB\u00BB\uFEF7\uFEF8\u0000\u0000\uFEFB\uFEFC\u0000\u00A0\u00AD\uFE82\u00A3\u00A4\uFE84\u0000\u0000\uFE8E\uFE8F\uFE95\uFE99\u060C\uFE9D\uFEA1\uFEA5\u0660\u0661\u0662\u0663\u0664\u0665\u0666\u0667\u0668\u0669\uFED1\u061B\uFEB1\uFEB5\uFEB9\u061F\u00A2\uFE80\uFE81\uFE83\uFE85\uFECA\uFE8B\uFE8D\uFE91\uFE93\uFE97\uFE9B\uFE9F\uFEA3\uFEA7\uFEA9\uFEAB\uFEAD\uFEAF\uFEB3\uFEB7\uFEBB\uFEBF\uFEC1\uFEC5\uFECB\uFECF\u00A6\u00AC\u00F7\u00D7\uFEC9\u0640\uFED3\uFED7\uFEDB\uFEDF\uFEE3\uFEE7\uFEEB\uFEED\uFEEF\uFEF3\uFEBD\uFECC\uFECE\uFECD\uFEE1\uFE7D\u0651\uFEE5\uFEE9\uFEEC\uFEF0\uFEF2\uFED0\uFED5\uFEF5\uFEF6\uFEDD\uFED9\uFEF1\u25A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x26 && input <= 0x7F) return input - 0x26 + 0x26;
			if (input >= 0x80 && input <= 0xFE) return GETOUTPUT0_80[input - 0x80];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x66AL;
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

	private static final class XIBM864CharsetEncoder extends TableCharsetEncoder {
		private XIBM864CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_FE7D = getOutput0_FE7D();
		private static final char[] getOutput0_FE7D() {
			return "\u00F0\u0000\u0000\u00C1\u00C2\u00A2\u00C3\u00A5\u00C4\u0000\u0000\u0000\u0000\u0000\u00C6\u0000\u00C7\u00A8\u00A9\u0000\u00C8\u0000\u00C9\u0000\u00AA\u0000\u00CA\u0000\u00AB\u0000\u00CB\u0000\u00AD\u0000\u00CC\u0000\u00AE\u0000\u00CD\u0000\u00AF\u0000\u00CE\u0000\u00CF\u0000\u00D0\u0000\u00D1\u0000\u00D2\u0000\u00BC\u0000\u00D3\u0000\u00BD\u0000\u00D4\u0000\u00BE\u0000\u00D5\u0000\u00EB\u0000\u00D6\u0000\u00D7\u0000\u0000\u0000\u00D8\u0000\u0000\u0000\u00DF\u00C5\u00D9\u00EC\u00EE\u00ED\u00DA\u00F7\u00BA\u0000\u00E1\u0000\u00F8\u0000\u00E2\u0000\u00FC\u0000\u00E3\u0000\u00FB\u0000\u00E4\u0000\u00EF\u0000\u00E5\u0000\u00F2\u0000\u00E6\u0000\u00F3\u0000\u00E7\u00F4\u00E8\u0000\u00E9\u00F5\u00FD\u00F6\u00EA\u0000\u00F9\u00FA\u0099\u009A\u0000\u0000\u009D\u009E".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x26 && input <= 0x7F) return input - 0x26 + 0x26;
			if (input >= 0xFE7D && input <= 0xFEFC) return GETOUTPUT0_FE7D[input - 0xFE7D];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0xA0: return 0xA0L;
			case 0xA2: return 0xC0L;
			case 0xA3: return 0xA3L;
			case 0xA4: return 0xA4L;
			case 0xA6: return 0xDBL;
			case 0xAB: return 0x97L;
			case 0xAC: return 0xDCL;
			case 0xAD: return 0xA1L;
			case 0xB0: return 0x80L;
			case 0xB1: return 0x93L;
			case 0xB7: return 0x81L;
			case 0xBB: return 0x98L;
			case 0xBC: return 0x95L;
			case 0xBD: return 0x94L;
			case 0xD7: return 0xDEL;
			case 0xF7: return 0xDDL;
			case 0x3B2: return 0x90L;
			case 0x3C6: return 0x92L;
			case 0x60C: return 0xACL;
			case 0x61B: return 0xBBL;
			case 0x61F: return 0xBFL;
			case 0x640: return 0xE0L;
			case 0x651: return 0xF1L;
			case 0x660: return 0xB0L;
			case 0x661: return 0xB1L;
			case 0x662: return 0xB2L;
			case 0x663: return 0xB3L;
			case 0x664: return 0xB4L;
			case 0x665: return 0xB5L;
			case 0x666: return 0xB6L;
			case 0x667: return 0xB7L;
			case 0x668: return 0xB8L;
			case 0x669: return 0xB9L;
			case 0x66A: return 0x25L;
			case 0x2219: return 0x82L;
			case 0x221A: return 0x83L;
			case 0x221E: return 0x91L;
			case 0x2248: return 0x96L;
			case 0x2500: return 0x85L;
			case 0x2502: return 0x86L;
			case 0x250C: return 0x8DL;
			case 0x2510: return 0x8CL;
			case 0x2514: return 0x8EL;
			case 0x2518: return 0x8FL;
			case 0x251C: return 0x8AL;
			case 0x2524: return 0x88L;
			case 0x252C: return 0x89L;
			case 0x2534: return 0x8BL;
			case 0x253C: return 0x87L;
			case 0x2592: return 0x84L;
			case 0x25A0: return 0xFEL;
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
