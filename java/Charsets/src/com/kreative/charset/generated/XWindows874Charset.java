package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XWindows874Charset extends Charset {
	public XWindows874Charset() {
		super("x-windows-874", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XWindows874CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XWindows874CharsetEncoder(this);
	}

	private static final class XWindows874CharsetDecoder extends TableCharsetDecoder {
		private XWindows874CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xDA) return input - 0xA1 + 0xE01;
			if (input >= 0xDF && input <= 0xFB) return input - 0xDF + 0xE3F;
			switch (input) {
			case 0x80: return 0x20ACL;
			case 0x85: return 0x2026L;
			case 0x91: return 0x2018L;
			case 0x92: return 0x2019L;
			case 0x93: return 0x201CL;
			case 0x94: return 0x201DL;
			case 0x95: return 0x2022L;
			case 0x96: return 0x2013L;
			case 0x97: return 0x2014L;
			case 0xA0: return 0xA0L;
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

	private static final class XWindows874CharsetEncoder extends TableCharsetEncoder {
		private XWindows874CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xE01 && input <= 0xE3A) return input - 0xE01 + 0xA1;
			if (input >= 0xE3F && input <= 0xE5B) return input - 0xE3F + 0xDF;
			switch (input) {
			case 0xA0: return 0xA0L;
			case 0x2013: return 0x96L;
			case 0x2014: return 0x97L;
			case 0x2018: return 0x91L;
			case 0x2019: return 0x92L;
			case 0x201C: return 0x93L;
			case 0x201D: return 0x94L;
			case 0x2022: return 0x95L;
			case 0x2026: return 0x85L;
			case 0x20AC: return 0x80L;
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
