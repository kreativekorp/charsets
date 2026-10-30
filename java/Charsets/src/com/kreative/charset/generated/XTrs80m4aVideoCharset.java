package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTrs80m4aVideoCharset extends Charset {
	public XTrs80m4aVideoCharset() {
		super("x-trs80m4a-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTrs80m4aVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTrs80m4aVideoCharsetEncoder(this);
	}

	private static final class XTrs80m4aVideoCharsetDecoder extends TableCharsetDecoder {
		private XTrs80m4aVideoCharsetDecoder(Charset cs) {
			super(cs, 1.28125f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.COMMON1754[input - 0x0];
			if (input >= 0xC8 && input <= 0xD8) return input - 0xC8 + 0x3B1;
			if (input >= 0x7F && input <= 0xC7) return CommonSubtables.COMMON1752[input - 0x7F];
			if (input >= 0xD9 && input <= 0xFF) return CommonSubtables.COMMON1753[input - 0xD9];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XTrs80m4aVideoCharsetEncoder extends TableCharsetEncoder {
		private XTrs80m4aVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
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
		private static final char[] GETOUTPUT0_D6 = getOutput0_D6();
		private static final char[] getOutput0_D6() {
			return "\u0101\u0000\u0000\u0000\u0000\u0000\u0201\u0000\u0000\u0401\u000B\u0000\u0011\u0000\b\u0000\u0000\u0016\f\u0301\u0012\u000F\u0000\u0000\u0013\u0010\u0000\u0000\u0000\u0501\u0014\u0000\t\u00E2\u0000\r\u0000\u0015\n".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xD6 && input <= 0xFC) return GETOUTPUT0_D6[input - 0xD6];
			if (input >= 0x3B1 && input <= 0x3C1) return input - 0x3B1 + 0xC8;
			switch (input) {
			case 0xA0: return 0x80L;
			case 0xA2: return 0xF2L;
			case 0xA3: return 0x601L;
			case 0xA4: return 0xF0L;
			case 0xA7: return 0xEDL;
			case 0xA8: return 0x1FL;
			case 0xA9: return 0xEFL;
			case 0xAE: return 0xF3L;
			case 0xB0: return 0xEL;
			case 0xB1: return 0x7FL;
			case 0xB6: return 0xF1L;
			case 0xC4: return 0x1L;
			case 0x192: return 0x1EL;
			case 0x3A9: return 0xE0L;
			case 0x3C3: return 0xD9L;
			case 0x3C4: return 0xDAL;
			case 0x3C5: return 0xDBL;
			case 0x3C6: return 0xDCL;
			case 0x3C7: return 0xDDL;
			case 0x3C8: return 0xDEL;
			case 0x3C9: return 0xDFL;
			case 0x2105: return 0xF8L;
			case 0x211E: return 0xF7L;
			case 0x2206: return 0xE5L;
			case 0x2211: return 0xE3L;
			case 0x221A: return 0xE1L;
			case 0x221E: return 0xEBL;
			case 0x2248: return 0xE4L;
			case 0x2260: return 0xE7L;
			case 0x2264: return 0xC6L;
			case 0x2265: return 0xC7L;
			case 0x2301: return 0xE8L;
			case 0x2307: return 0xE6L;
			case 0x237E: return 0xEAL;
			case 0x2588: return 0xBFL;
			case 0x258C: return 0x95L;
			case 0x258E: return 0x1AL;
			case 0x2590: return 0xAAL;
			case 0x25AD: return 0x17L;
			case 0x25E3: return 0x1BL;
			case 0x2639: return 0xC5L;
			case 0x263A: return 0xC4L;
			case 0x2640: return 0xFAL;
			case 0x2642: return 0xF9L;
			case 0x2660: return 0xC0L;
			case 0x2663: return 0xC3L;
			case 0x2665: return 0xC1L;
			case 0x2666: return 0xC2L;
			case 0x2713: return 0xECL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDF00 && input <= 0xDF13) return input - 0xDF00 + 0x81;
			if (input >= 0xDF14 && input <= 0xDF27) return input - 0xDF14 + 0x96;
			if (input >= 0xDF28 && input <= 0xDF3B) return input - 0xDF28 + 0xAB;
			switch (input) {
			case 0xDCB1: return 0x18L;
			case 0xDF97: return 0x1CL;
			case 0xDFC1: return 0xF4L;
			case 0xDFC2: return 0xF5L;
			case 0xDFC3: return 0xF6L;
			case 0xDFC4: return 0xFCL;
			case 0xDFC5: return 0xFDL;
			case 0xDFC9: return 0xFEL;
			case 0xDFCA: return 0xFF01L;
			case 0xDFCB: return 0xEEL;
			case 0xDFCC: return 0xFBL;
			case 0xDFCD: return 0x1DL;
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
