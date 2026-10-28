package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1046Charset extends Charset {
	public XIBM1046Charset() {
		super("x-IBM1046", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1046CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1046CharsetEncoder(this);
	}

	private static final class XIBM1046CharsetDecoder extends TableCharsetDecoder {
		private XIBM1046CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\uFE88\u00D7\u00F7\uF8F6\uF8F5\uF8F4\uF8F7\uFE71\u0088\u25A0\u2502\u2500\u2510\u250C\u2514\u2518\uFE79\uFE7B\uFE7D\uFE7F\uFE77\uFE8A\uFEF0\uFEF3\uFEF2\uFECE\uFECF\uFED0\uFEF6\uFEF8\uFEFA\uFEFC\u00A0\uF8FA\uF8F9\uF8F8\u00A4\uF8FB\uFE8B\uFE91\uFE97\uFE9B\uFE9F\uFEA3\u060C\u00AD\uFEA7\uFEB3\u0660\u0661\u0662\u0663\u0664\u0665\u0666\u0667\u0668\u0669\uFEB7\u061B\uFEBB\uFEBF\uFECA\u061F\uFECB\uFE80\uFE81\uFE83\uFE85\uFE87\uFE89\uFE8D\uFE8F\uFE93\uFE95\uFE99\uFE9D\uFEA1\uFEA5\uFEA9\uFEAB\uFEAD\uFEAF\uFEB1\uFEB5\uFEB9\uFEBD\uFEC3\uFEC7\uFEC9\uFECD\uFECC\uFE82\uFE84\uFE8E\uFED3\u0640\uFED1\uFED5\uFED9\uFEDD\uFEE1\uFEE5\uFEEB\uFEED\uFEEF\uFEF1\uFE70\uFE72\uFE74\uFE76\uFE78\uFE7A\uFE7C\uFE7E\uFED7\uFEDB\uFEDF\uF8FC\uFEF5\uFEF7\uFEF9\uFEFB\uFEE3\uFEE7\uFEEC\uFEE9".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFE) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM1046CharsetEncoder extends TableCharsetEncoder {
		private XIBM1046CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_FE70 = getOutput0_FE70();
		private static final char[] getOutput0_FE70() {
			return "\u00EB\u0087\u00EC\u0000\u00ED\u0000\u00EE\u0094\u00EF\u0090\u00F0\u0091\u00F1\u0092\u00F2\u0093\u00C1\u00C2\u00DC\u00C3\u00DD\u00C4\u0000\u00C5\u0080\u00C6\u0095\u00A6\u0000\u00C7\u00DE\u00C8\u0000\u00A7\u0000\u00C9\u0000\u00CA\u0000\u00A8\u0000\u00CB\u0000\u00A9\u0000\u00CC\u0000\u00AA\u0000\u00CD\u0000\u00AB\u0000\u00CE\u0000\u00AE\u0000\u00CF\u0000\u00D0\u0000\u00D1\u0000\u00D2\u0000\u00D3\u0000\u00AF\u0000\u00D4\u0000\u00BA\u0000\u00D5\u0000\u00BC\u0000\u00D6\u0000\u00BD\u0000\u0000\u0000\u00D7\u0000\u0000\u0000\u00D8\u0000\u00D9\u00BE\u00C0\u00DB\u00DA\u0099\u009A\u009B\u00E1\u0000\u00DF\u0000\u00E2\u0000\u00F3\u0000\u00E3\u0000\u00F4\u0000\u00E4\u0000\u00F5\u0000\u00E5\u0000\u00FB\u0000\u00E6\u0000\u00FC\u0000\u00FE\u0000\u00E7\u00FD\u00E8\u0000\u00E9\u0096\u00EA\u0098\u0097\u0000\u00F7\u009C\u00F8\u009D\u00F9\u009E\u00FA\u009F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xFE70 && input <= 0xFEFC) return GETOUTPUT0_FE70[input - 0xFE70];
			switch (input) {
			case 0x88: return 0x88L;
			case 0xA0: return 0xA0L;
			case 0xA4: return 0xA4L;
			case 0xAD: return 0xADL;
			case 0xD7: return 0x81L;
			case 0xF7: return 0x82L;
			case 0x60C: return 0xACL;
			case 0x61B: return 0xBBL;
			case 0x61F: return 0xBFL;
			case 0x640: return 0xE0L;
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
			case 0x2500: return 0x8BL;
			case 0x2502: return 0x8AL;
			case 0x250C: return 0x8DL;
			case 0x2510: return 0x8CL;
			case 0x2514: return 0x8EL;
			case 0x2518: return 0x8FL;
			case 0x25A0: return 0x89L;
			case 0xF8F4: return 0x85L;
			case 0xF8F5: return 0x84L;
			case 0xF8F6: return 0x83L;
			case 0xF8F7: return 0x86L;
			case 0xF8F8: return 0xA3L;
			case 0xF8F9: return 0xA2L;
			case 0xF8FA: return 0xA1L;
			case 0xF8FB: return 0xA5L;
			case 0xF8FC: return 0xF6L;
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
