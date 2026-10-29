package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XGsm0338Charset extends Charset {
	public XGsm0338Charset() {
		super("x-gsm0338", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XGsm0338CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XGsm0338CharsetEncoder(this);
	}

	private static final class XGsm0338CharsetDecoder extends TableCharsetDecoder {
		private XGsm0338CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x1B: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "@\u00A3$\u00A5\u00E8\u00E9\u00F9\u00EC\u00F2\u00E7\n\u00D8\u00F8\r\u00C5\u00E5\u0394_\u03A6\u0393\u039B\u03A9\u03A0\u03A8\u03A3\u0398\u039E\u00A0\u00C6\u00E6\u00DF\u00C9 !\"#\u00A4".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x25 && input <= 0x3F) return input - 0x25 + 0x25;
			if (input >= 0x0 && input <= 0x24) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x40: return 0xA1L;
			case 0x5B: return 0xC4L;
			case 0x5C: return 0xD6L;
			case 0x5D: return 0xD1L;
			case 0x5E: return 0xDCL;
			case 0x5F: return 0xA7L;
			case 0x60: return 0xBFL;
			case 0x7B: return 0xE4L;
			case 0x7C: return 0xF6L;
			case 0x7D: return 0xF1L;
			case 0x7E: return 0xFCL;
			case 0x7F: return 0xE0L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xA: return 0xCL;
			case 0x14: return 0x5EL;
			case 0x28: return 0x7BL;
			case 0x29: return 0x7DL;
			case 0x2F: return 0x5CL;
			case 0x3C: return 0x5BL;
			case 0x3D: return 0x7EL;
			case 0x3E: return 0x5DL;
			case 0x40: return 0x7CL;
			case 0x65: return 0x20ACL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			default: return 0;
			}
		}
	}

	private static final class XGsm0338CharsetEncoder extends TableCharsetEncoder {
		private XGsm0338CharsetEncoder(Charset cs) {
			super(cs, 1.06494f, 2f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_BF = getOutput0_BF();
		private static final char[] getOutput0_BF() {
			return "`\u0000\u0000\u0000\u0000[\u000E\u001C\t\u0000\u001F\u0000\u0000\u0000\u0000\u0000\u0000\u0000]\u0000\u0000\u0000\u0000\\\u0000\u000B\u0000\u0000\u0000^\u0000\u0000\u001E\u007F\u0000\u0000\u0000{\u000F\u001D\t\u0401\u0501\u0000\u0000\u0701\u0000\u0000\u0000\u0000}\b\u0000\u0000\u0000|\u0000\f\u0601\u0000\u0000~".toCharArray();
		}
		private static final char[] GETOUTPUT0_391 = getOutput0_391();
		private static final char[] getOutput0_391() {
			return "AB\u0013\u0010EZH\u0019IK\u0014MN\u001AO\u0016P\u0000\u0018TY\u0012X\u0017\u0015".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x25 && input <= 0x3F) return input - 0x25 + 0x25;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0xBF && input <= 0xFC) return GETOUTPUT0_BF[input - 0xBF];
			if (input >= 0x391 && input <= 0x3A9) return GETOUTPUT0_391[input - 0x391];
			switch (input) {
			case 0x0: return 0x1L;
			case 0xA: return 0xAL;
			case 0xC: return 0xA1BL;
			case 0xD: return 0xDL;
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x201L;
			case 0x40: return 0x1L;
			case 0x5B: return 0x3C1BL;
			case 0x5C: return 0x2F1BL;
			case 0x5D: return 0x3E1BL;
			case 0x5E: return 0x141BL;
			case 0x5F: return 0x11L;
			case 0x7B: return 0x281BL;
			case 0x7C: return 0x401BL;
			case 0x7D: return 0x291BL;
			case 0x7E: return 0x3D1BL;
			case 0xA0: return 0x1BL;
			case 0xA1: return 0x40L;
			case 0xA3: return 0x101L;
			case 0xA4: return 0x24L;
			case 0xA5: return 0x301L;
			case 0xA7: return 0x5FL;
			case 0x20AC: return 0x651BL;
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
