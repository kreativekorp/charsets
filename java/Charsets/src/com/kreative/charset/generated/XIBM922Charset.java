package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM922Charset extends Charset {
	public XIBM922Charset() {
		super("x-IBM922", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM922CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM922CharsetEncoder(this);
	}

	private static final class XIBM922CharsetDecoder extends TableCharsetDecoder {
		private XIBM922CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_F0 = getOutput0_F0();
		private static final char[] getOutput0_F0() {
			return "\u0161\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC\u00FD\u017E\u00FF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xAE) return input - 0x20 + 0x20;
			if (input >= 0xB0 && input <= 0xCF) return input - 0xB0 + 0xB0;
			if (input >= 0xDF && input <= 0xEF) return input - 0xDF + 0xDF;
			if (input >= 0xF0 && input <= 0xFF) return GETOUTPUT0_F0[input - 0xF0];
			switch (input) {
			case 0xAF: return 0x203EL;
			case 0xD0: return 0x160L;
			case 0xD1: return 0xD1L;
			case 0xD2: return 0xD2L;
			case 0xD3: return 0xD3L;
			case 0xD4: return 0xD4L;
			case 0xD5: return 0xD5L;
			case 0xD6: return 0xD6L;
			case 0xD7: return 0xD7L;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xDD: return 0xDDL;
			case 0xDE: return 0x17DL;
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

	private static final class XIBM922CharsetEncoder extends TableCharsetEncoder {
		private XIBM922CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xAE) return input - 0x20 + 0x20;
			if (input >= 0xB0 && input <= 0xCF) return input - 0xB0 + 0xB0;
			if (input >= 0xDF && input <= 0xEF) return input - 0xDF + 0xDF;
			switch (input) {
			case 0xD1: return 0xD1L;
			case 0xD2: return 0xD2L;
			case 0xD3: return 0xD3L;
			case 0xD4: return 0xD4L;
			case 0xD5: return 0xD5L;
			case 0xD6: return 0xD6L;
			case 0xD7: return 0xD7L;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xDD: return 0xDDL;
			case 0xF1: return 0xF1L;
			case 0xF2: return 0xF2L;
			case 0xF3: return 0xF3L;
			case 0xF4: return 0xF4L;
			case 0xF5: return 0xF5L;
			case 0xF6: return 0xF6L;
			case 0xF7: return 0xF7L;
			case 0xF8: return 0xF8L;
			case 0xF9: return 0xF9L;
			case 0xFA: return 0xFAL;
			case 0xFB: return 0xFBL;
			case 0xFC: return 0xFCL;
			case 0xFD: return 0xFDL;
			case 0xFF: return 0xFF01L;
			case 0x160: return 0xD0L;
			case 0x161: return 0xF0L;
			case 0x17D: return 0xDEL;
			case 0x17E: return 0xFEL;
			case 0x203E: return 0xAFL;
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
