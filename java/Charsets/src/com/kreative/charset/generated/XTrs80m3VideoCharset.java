package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTrs80m3VideoCharset extends Charset {
	public XTrs80m3VideoCharset() {
		super("x-trs80m3-video", new String[]{"x-trs80m4-video"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTrs80m3VideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTrs80m3VideoCharsetEncoder(this);
	}

	private static final class XTrs80m3VideoCharsetDecoder extends TableCharsetDecoder {
		private XTrs80m3VideoCharsetDecoder(Charset cs) {
			super(cs, 1.26953f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.COMMON1746[input - 0x0];
			if (input >= 0xC8 && input <= 0xD8) return input - 0xC8 + 0x3B1;
			if (input >= 0x7F && input <= 0xC7) return CommonSubtables.COMMON1747[input - 0x7F];
			if (input >= 0xD9 && input <= 0xFF) return CommonSubtables.COMMON1748[input - 0xD9];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XTrs80m3VideoCharsetEncoder extends TableCharsetEncoder {
		private XTrs80m3VideoCharsetEncoder(Charset cs) {
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
		private static final char[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final char[] getOutput0_A0() {
			return "\u0080\u0000\u00F2\u0101\u00F0\u0000\u0000\u00ED\u0000\u00EF\u0000\u0000\u0601\u0000\u00F3\u0000\u0000\u007F\u0000\u0000\u0000\u0000\u00F1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000F\u000E\u0501\u001D\u0000\u0000\u001C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0013\u0011\u0000\u0012\u0000\u0000\u0000\u0401\u0000\u0000\u0014\u0019\u0000\u0000\f\u0018\u001A\u0017\u001E\u0000\u0301\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\u0000\u0000\u0000\u0016\u0701\u00E2\b\t\u0000\u0000\u0015".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFC) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x3B1 && input <= 0x3C1) return input - 0x3B1 + 0xC8;
			switch (input) {
			case 0x0: return 0x1L;
			case 0x2DC: return 0x1FL;
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
			case 0x240D: return 0xDL;
			case 0x2588: return 0xBFL;
			case 0x258C: return 0x95L;
			case 0x2590: return 0xAAL;
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
			case 0xDFC1: return 0xF4L;
			case 0xDFC2: return 0xF5L;
			case 0xDFC3: return 0xF6L;
			case 0xDFC4: return 0xFCL;
			case 0xDFC5: return 0xFDL;
			case 0xDFC9: return 0xFEL;
			case 0xDFCA: return 0xFF01L;
			case 0xDFCB: return 0xEEL;
			case 0xDFCC: return 0xFBL;
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
