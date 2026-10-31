package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMsxJpVideoCharset extends Charset {
	public XMsxJpVideoCharset() {
		super("x-msx-jp-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMsxJpVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMsxJpVideoCharsetEncoder(this);
	}

	private static final class XMsxJpVideoCharsetDecoder extends TableCharsetDecoder {
		private XMsxJpVideoCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u6708\u706B\u6C34\u6728\u91D1\u571F\u65E5\u5E74\u5186\u6642\u5206\u79D2\u767E\u5343\u4E07\u03C0\u2534\u252C\u2524\u251C\u253C\u2502\u2500\u250C\u2510\u2514\u2518\u2573\u5927\u4E2D\u5C0F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x5D && input <= 0x7E) return input - 0x5D + 0x5D;
			if (input >= 0x80 && input <= 0xFD) return CommonSubtables.COMMON1706[input - 0x80];
			switch (input) {
			case 0x5C: return 0xA5L;
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

	private static final class XMsxJpVideoCharsetEncoder extends TableCharsetEncoder {
		private XMsxJpVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7E) return input - 0x5D + 0x5D;
			if (input >= 0x3041 && input <= 0x30FC) return CommonSubtables.COMMON1707[input - 0x3041];
			if (input >= 0xFF01 && input <= 0xFF3B) return input - 0xFF01 + 0x21;
			if (input >= 0xFF3D && input <= 0xFF5E) return input - 0xFF3D + 0x5D;
			if (input >= 0xFF61 && input <= 0xFF9F) return input - 0xFF61 + 0xA1;
			switch (input) {
			case 0x0: return 0x1L;
			case 0xA5: return 0x5CL;
			case 0x3C0: return 0x10L;
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
			case 0x3000: return 0xA0L;
			case 0x3001: return 0xA4L;
			case 0x3002: return 0xA1L;
			case 0x300C: return 0xA2L;
			case 0x300D: return 0xA3L;
			case 0x4E07: return 0xFL;
			case 0x4E2D: return 0x1EL;
			case 0x5186: return 0x9L;
			case 0x5206: return 0xBL;
			case 0x5343: return 0xEL;
			case 0x571F: return 0x601L;
			case 0x5927: return 0x1DL;
			case 0x5C0F: return 0x1FL;
			case 0x5E74: return 0x8L;
			case 0x65E5: return 0x701L;
			case 0x6642: return 0xAL;
			case 0x6708: return 0x101L;
			case 0x6728: return 0x401L;
			case 0x6C34: return 0x301L;
			case 0x706B: return 0x201L;
			case 0x767E: return 0xDL;
			case 0x79D2: return 0xCL;
			case 0x91D1: return 0x501L;
			case 0xFFE5: return 0x5CL;
			case 0xFFE8: return 0x16L;
			case 0xFFEE: return 0x84L;
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
