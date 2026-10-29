package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAtasciiIntVideoCharset extends Charset {
	public XAtasciiIntVideoCharset() {
		super("x-atascii-int-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAtasciiIntVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAtasciiIntVideoCharsetEncoder(this);
	}

	private static final class XAtasciiIntVideoCharsetDecoder extends TableCharsetDecoder {
		private XAtasciiIntVideoCharsetDecoder(Charset cs) {
			super(cs, 1.00781f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return input - 0x0 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0x40 && input <= 0x60) return CommonSubtables.COMMON1213[input - 0x40];
			if (input >= 0x80 && input <= 0xBF) return input - 0x80 + 0x20;
			if (input >= 0xE1 && input <= 0xFA) return input - 0xE1 + 0x61;
			if (input >= 0xC0 && input <= 0xE0) return CommonSubtables.COMMON1213[input - 0xC0];
			switch (input) {
			case 0x7B: return 0xC4L;
			case 0x7C: return 0x7CL;
			case 0x7D: return 0xDCB0D83EL;
			case 0x7E: return 0x25C0L;
			case 0x7F: return 0x25B6L;
			case 0xFB: return 0xC4L;
			case 0xFC: return 0x7CL;
			case 0xFD: return 0xDCB0D83EL;
			case 0xFE: return 0x25C0L;
			case 0xFF: return 0x25B6L;
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

	private static final class XAtasciiIntVideoCharsetEncoder extends TableCharsetEncoder {
		private XAtasciiIntVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{31}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83E: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_C4 = getOutput0_C4();
		private static final char[] getOutput0_C4() {
			return "{Z\u0000\u0000\u0000C\u0000\u0000\u0000\u0000\u0000\u0000\u0000B\u0000\u0000\u0000\u0000L\u0000\u0000\u0000\u0000\u0000P\u0000\u0000\u0000Y@Q\u0000KX\u0000DUTW\u0000G\u0000SI\u0000VFNE\u0000O\u0000\u0000AMRJ".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x3F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x20];
			if (input >= 0x40 && input <= 0x5F) return input - 0x40 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0xC4 && input <= 0xFC) return GETOUTPUT0_C4[input - 0xC4];
			switch (input) {
			case 0x7C: return 0x7CL;
			case 0xA1: return 0x60L;
			case 0xA3: return 0x48L;
			case 0x2190: return 0x5EL;
			case 0x2191: return 0x5CL;
			case 0x2192: return 0x5FL;
			case 0x2193: return 0x5DL;
			case 0x241B: return 0x5BL;
			case 0x25B6: return 0x7FL;
			case 0x25C0: return 0x7EL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDCB0: return 0x7DL;
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
}
