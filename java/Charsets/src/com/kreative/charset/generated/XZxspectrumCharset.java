package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XZxspectrumCharset extends Charset {
	public XZxspectrumCharset() {
		super("x-zxspectrum", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XZxspectrumCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XZxspectrumCharsetEncoder(this);
	}

	private static final class XZxspectrumCharsetDecoder extends TableCharsetDecoder {
		private XZxspectrumCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_7F = getOutput0_7F();
		private static final char[] getOutput0_7F() {
			return "\u00A9\u00A0\u259D\u2598\u2580\u2597\u2590\u259A\u259C\u2596\u259E\u258C\u259B\u2584\u259F\u2599\u2588".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0x90 && input <= 0xA4) return input - 0x90 + 0xF041;
			if (input >= 0x7F && input <= 0x8F) return GETOUTPUT0_7F[input - 0x7F];
			switch (input) {
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x5FL;
			case 0x60: return 0xA3L;
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

	private static final class XZxspectrumCharsetEncoder extends TableCharsetEncoder {
		private XZxspectrumCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0xF041 && input <= 0xF055) return input - 0xF041 + 0x90;
			switch (input) {
			case 0x5F: return 0x5FL;
			case 0xA0: return 0x80L;
			case 0xA3: return 0x60L;
			case 0xA9: return 0x7FL;
			case 0x2191: return 0x5EL;
			case 0x2580: return 0x83L;
			case 0x2584: return 0x8CL;
			case 0x2588: return 0x8FL;
			case 0x258C: return 0x8AL;
			case 0x2590: return 0x85L;
			case 0x2596: return 0x88L;
			case 0x2597: return 0x84L;
			case 0x2598: return 0x82L;
			case 0x2599: return 0x8EL;
			case 0x259A: return 0x86L;
			case 0x259B: return 0x8BL;
			case 0x259C: return 0x87L;
			case 0x259D: return 0x81L;
			case 0x259E: return 0x89L;
			case 0x259F: return 0x8DL;
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
