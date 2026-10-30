package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMsxKrVideoCharset extends Charset {
	public XMsxKrVideoCharset() {
		super("x-msx-kr-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMsxKrVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMsxKrVideoCharsetEncoder(this);
	}

	private static final class XMsxKrVideoCharsetDecoder extends TableCharsetDecoder {
		private XMsxKrVideoCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u3000\uD3EC\uD45C\uD478\uD4E8\uD504\uD638\uD6A8\uD6C4\uD734\uD750\u2018\u2019\u201C\u201D\u03C0\u2534\u252C\u2524\u251C\u253C\u2502\u2500\u250C\u2510\u2514\u2518\u2573".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1C) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x5D && input <= 0x7E) return input - 0x5D + 0x5D;
			if (input >= 0x8F && input <= 0xA1) return input - 0x8F + 0x3145;
			if (input >= 0xA2 && input <= 0xFB) return CommonSubtables.COMMON1703[input - 0xA2];
			switch (input) {
			case 0x5C: return 0x20A9L;
			case 0x80: return 0x2660L;
			case 0x81: return 0x2665L;
			case 0x82: return 0x2663L;
			case 0x83: return 0x2666L;
			case 0x84: return 0x25CBL;
			case 0x85: return 0x25CFL;
			case 0x86: return 0x3131L;
			case 0x87: return 0x3132L;
			case 0x88: return 0x3134L;
			case 0x89: return 0x3137L;
			case 0x8A: return 0x3138L;
			case 0x8B: return 0x3139L;
			case 0x8C: return 0x3141L;
			case 0x8D: return 0x3142L;
			case 0x8E: return 0x3143L;
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

	private static final class XMsxKrVideoCharsetEncoder extends TableCharsetEncoder {
		private XMsxKrVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_FFA1 = getOutput0_FFA1();
		private static final char[] getOutput0_FFA1() {
			return "\u0086\u0087\u0000\u0088\u0000\u0000\u0089\u008A\u008B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008C\u008D\u008E\u0000\u008F\u0090\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0000\u0000\u0000\u0099\u009A\u009B\u009C\u009D\u009E\u0000\u0000\u009F\u00A0\u00A1\u0000\u0000\u0000\u0000\u0000\u00A2\u00A3\u0000\u0000\u0000\u00A4\u0000\u0000\u00A5\u0000\u00A6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\\\u0000\u0016\u0000\u0000\u0000\u0000\u0000\u0084".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7E) return input - 0x5D + 0x5D;
			if (input >= 0x3145 && input <= 0x3157) return input - 0x3145 + 0x8F;
			if (input >= 0xFF01 && input <= 0xFF3B) return input - 0xFF01 + 0x21;
			if (input >= 0xFF3D && input <= 0xFF5E) return input - 0xFF3D + 0x5D;
			if (input >= 0xFFA1 && input <= 0xFFEE) return GETOUTPUT0_FFA1[input - 0xFFA1];
			switch (input) {
			case 0x0: return 0x1L;
			case 0x3C0: return 0x10L;
			case 0x2018: return 0xCL;
			case 0x2019: return 0xDL;
			case 0x201C: return 0xEL;
			case 0x201D: return 0xFL;
			case 0x20A9: return 0x5CL;
			case 0x2500: return 0x17L;
			case 0x2502: return 0x16L;
			case 0x250C: return 0x18L;
			case 0x2510: return 0x19L;
			case 0x2514: return 0x1AL;
			case 0x2518: return 0x1BL;
			case 0x251C: return 0x14L;
			case 0x2524: return 0x13L;
			case 0x252C: return 0x12L;
			case 0x2534: return 0x11L;
			case 0x253C: return 0x15L;
			case 0x2573: return 0x1CL;
			case 0x25CB: return 0x84L;
			case 0x25CF: return 0x85L;
			case 0x2660: return 0x80L;
			case 0x2663: return 0x82L;
			case 0x2665: return 0x81L;
			case 0x2666: return 0x83L;
			case 0x3000: return 0x101L;
			case 0x3131: return 0x86L;
			case 0x3132: return 0x87L;
			case 0x3134: return 0x88L;
			case 0x3137: return 0x89L;
			case 0x3138: return 0x8AL;
			case 0x3139: return 0x8BL;
			case 0x3141: return 0x8CL;
			case 0x3142: return 0x8DL;
			case 0x3143: return 0x8EL;
			case 0x315B: return 0xA2L;
			case 0x315C: return 0xA3L;
			case 0x3160: return 0xA4L;
			case 0x3161: return 0xA5L;
			case 0x3163: return 0xA6L;
			case 0xACE0: return 0xA7L;
			case 0xAD50: return 0xA8L;
			case 0xAD6C: return 0xA9L;
			case 0xADDC: return 0xAAL;
			case 0xADF8: return 0xABL;
			case 0xAF2C: return 0xACL;
			case 0xAF9C: return 0xADL;
			case 0xAFB8: return 0xAEL;
			case 0xB028: return 0xAFL;
			case 0xB044: return 0xB0L;
			case 0xB178: return 0xB1L;
			case 0xB1E8: return 0xB2L;
			case 0xB204: return 0xB3L;
			case 0xB274: return 0xB4L;
			case 0xB290: return 0xB5L;
			case 0xB3C4: return 0xB6L;
			case 0xB434: return 0xB7L;
			case 0xB450: return 0xB8L;
			case 0xB4C0: return 0xB9L;
			case 0xB4DC: return 0xBAL;
			case 0xB610: return 0xBBL;
			case 0xB680: return 0xBCL;
			case 0xB69C: return 0xBDL;
			case 0xB70C: return 0xBEL;
			case 0xB728: return 0xBFL;
			case 0xB85C: return 0xC0L;
			case 0xB8CC: return 0xC1L;
			case 0xB8E8: return 0xC2L;
			case 0xB958: return 0xC3L;
			case 0xB974: return 0xC4L;
			case 0xBAA8: return 0xC5L;
			case 0xBB18: return 0xC6L;
			case 0xBB34: return 0xC7L;
			case 0xBBA4: return 0xC8L;
			case 0xBBC0: return 0xC9L;
			case 0xBCF4: return 0xCAL;
			case 0xBD64: return 0xCBL;
			case 0xBD80: return 0xCCL;
			case 0xBDF0: return 0xCDL;
			case 0xBE0C: return 0xCEL;
			case 0xBF40: return 0xCFL;
			case 0xBFB0: return 0xD0L;
			case 0xBFCC: return 0xD1L;
			case 0xC03C: return 0xD2L;
			case 0xC058: return 0xD3L;
			case 0xC18C: return 0xD4L;
			case 0xC1FC: return 0xD5L;
			case 0xC218: return 0xD6L;
			case 0xC288: return 0xD7L;
			case 0xC2A4: return 0xD8L;
			case 0xC3D8: return 0xD9L;
			case 0xC448: return 0xDAL;
			case 0xC464: return 0xDBL;
			case 0xC4D4: return 0xDCL;
			case 0xC4F0: return 0xDDL;
			case 0xC624: return 0xDEL;
			case 0xC694: return 0xDFL;
			case 0xC6B0: return 0xE0L;
			case 0xC720: return 0xE1L;
			case 0xC73C: return 0xE2L;
			case 0xC870: return 0xE3L;
			case 0xC8E0: return 0xE4L;
			case 0xC8FC: return 0xE5L;
			case 0xC96C: return 0xE6L;
			case 0xC988: return 0xE7L;
			case 0xCABC: return 0xE8L;
			case 0xCB2C: return 0xE9L;
			case 0xCB48: return 0xEAL;
			case 0xCBB8: return 0xEBL;
			case 0xCBD4: return 0xECL;
			case 0xCD08: return 0xEDL;
			case 0xCD78: return 0xEEL;
			case 0xCD94: return 0xEFL;
			case 0xCE04: return 0xF0L;
			case 0xCE20: return 0xF1L;
			case 0xCF54: return 0xF2L;
			case 0xCFC4: return 0xF3L;
			case 0xCFE0: return 0xF4L;
			case 0xD050: return 0xF5L;
			case 0xD06C: return 0xF6L;
			case 0xD1A0: return 0xF7L;
			case 0xD210: return 0xF8L;
			case 0xD22C: return 0xF9L;
			case 0xD29C: return 0xFAL;
			case 0xD2B8: return 0xFBL;
			case 0xD3EC: return 0x201L;
			case 0xD45C: return 0x301L;
			case 0xD478: return 0x401L;
			case 0xD4E8: return 0x501L;
			case 0xD504: return 0x601L;
			case 0xD638: return 0x701L;
			case 0xD6A8: return 0x8L;
			case 0xD6C4: return 0x9L;
			case 0xD734: return 0xAL;
			case 0xD750: return 0xBL;
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
