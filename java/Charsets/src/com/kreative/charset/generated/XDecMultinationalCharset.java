package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XDecMultinationalCharset extends Charset {
	public XDecMultinationalCharset() {
		super("x-dec-multinational", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XDecMultinationalCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XDecMultinationalCharsetEncoder(this);
	}

	private static final class XDecMultinationalCharsetDecoder extends TableCharsetDecoder {
		private XDecMultinationalCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00A1\u00A2\u00A3\u0000\u00A5\u0000\u00A7\u00A4\u00A9\u00AA\u00AB\u0000\u0000\u0000\u0000\u00B0\u00B1\u00B2\u00B3\u0000\u00B5\u00B6\u00B7\u0000\u00B9\u00BA\u00BB\u00BC\u00BD".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x9F) return input - 0x20 + 0x20;
			if (input >= 0xBF && input <= 0xCF) return input - 0xBF + 0xBF;
			if (input >= 0xA1 && input <= 0xBD) return GETOUTPUT0_A1[input - 0xA1];
			if (input >= 0xDF && input <= 0xEF) return input - 0xDF + 0xDF;
			switch (input) {
			case 0xD1: return 0xD1L;
			case 0xD2: return 0xD2L;
			case 0xD3: return 0xD3L;
			case 0xD4: return 0xD4L;
			case 0xD5: return 0xD5L;
			case 0xD6: return 0xD6L;
			case 0xD7: return 0x152L;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xDD: return 0x178L;
			case 0xF1: return 0xF1L;
			case 0xF2: return 0xF2L;
			case 0xF3: return 0xF3L;
			case 0xF4: return 0xF4L;
			case 0xF5: return 0xF5L;
			case 0xF6: return 0xF6L;
			case 0xF7: return 0x153L;
			case 0xF8: return 0xF8L;
			case 0xF9: return 0xF9L;
			case 0xFA: return 0xFAL;
			case 0xFB: return 0xFBL;
			case 0xFC: return 0xFCL;
			case 0xFD: return 0xFFL;
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

	private static final class XDecMultinationalCharsetEncoder extends TableCharsetEncoder {
		private XDecMultinationalCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\u00A1\u00A2\u00A3\u00A8\u00A5\u0000\u00A7\u0000\u00A9\u00AA\u00AB\u0000\u0000\u0000\u0000\u00B0\u00B1\u00B2\u00B3\u0000\u00B5\u00B6\u00B7\u0000\u00B9\u00BA\u00BB\u00BC\u00BD".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x9F) return input - 0x20 + 0x20;
			if (input >= 0xBF && input <= 0xCF) return input - 0xBF + 0xBF;
			if (input >= 0xA1 && input <= 0xBD) return GETOUTPUT0_A1[input - 0xA1];
			if (input >= 0xDF && input <= 0xEF) return input - 0xDF + 0xDF;
			switch (input) {
			case 0xD1: return 0xD1L;
			case 0xD2: return 0xD2L;
			case 0xD3: return 0xD3L;
			case 0xD4: return 0xD4L;
			case 0xD5: return 0xD5L;
			case 0xD6: return 0xD6L;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xF1: return 0xF1L;
			case 0xF2: return 0xF2L;
			case 0xF3: return 0xF3L;
			case 0xF4: return 0xF4L;
			case 0xF5: return 0xF5L;
			case 0xF6: return 0xF6L;
			case 0xF8: return 0xF8L;
			case 0xF9: return 0xF9L;
			case 0xFA: return 0xFAL;
			case 0xFB: return 0xFBL;
			case 0xFC: return 0xFCL;
			case 0xFF: return 0xFDL;
			case 0x152: return 0xD7L;
			case 0x153: return 0xF7L;
			case 0x178: return 0xDDL;
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
