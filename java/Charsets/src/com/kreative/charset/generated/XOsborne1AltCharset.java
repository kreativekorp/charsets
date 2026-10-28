package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XOsborne1AltCharset extends Charset {
	public XOsborne1AltCharset() {
		super("x-osborne1-alt", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XOsborne1AltCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XOsborne1AltCharsetEncoder(this);
	}

	private static final class XOsborne1AltCharsetDecoder extends TableCharsetDecoder {
		private XOsborne1AltCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_60 = getOutput0_60();
		private static final char[] getOutput0_60() {
			return "\u2395\u258C\u259E\u259F\u2590\u259C\u2596\u2597\u25E3\u250F\u25E2\u2503\u254B\u2022\u259A\u2533\u2513\u259B\u2598\u00BC\u259D\u25E5\u2588\u2580\u2584\u25E4\u2599\u2501\u2517\u00BD\u253B\u251B\u2395\u258C\u259E\u259F\u2590\u259C\u2596\u2597\u25E3\u250F\u25E2\u2503\u254B\u2022\u259A\u2533\u2513\u259B\u2598\u00BC\u259D\u25E5\u2588\u2580\u2584\u25E4\u2599\u2501\u2517\u00BD\u253B\u251B".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFE) return input - 0xA0 + 0x20;
			if (input >= 0x60 && input <= 0x9F) return GETOUTPUT0_60[input - 0x60];
			switch (input) {
			case 0xFF: return 0x2428L;
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

	private static final class XOsborne1AltCharsetEncoder extends TableCharsetEncoder {
		private XOsborne1AltCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7E) return input - 0x60 + 0xE0;
			switch (input) {
			case 0xBC: return 0x73L;
			case 0xBD: return 0x7DL;
			case 0x2022: return 0x6DL;
			case 0x2395: return 0x60L;
			case 0x2428: return 0xFF01L;
			case 0x2501: return 0x7BL;
			case 0x2503: return 0x6BL;
			case 0x250F: return 0x69L;
			case 0x2513: return 0x70L;
			case 0x2517: return 0x7CL;
			case 0x251B: return 0x7FL;
			case 0x2533: return 0x6FL;
			case 0x253B: return 0x7EL;
			case 0x254B: return 0x6CL;
			case 0x2580: return 0x77L;
			case 0x2584: return 0x78L;
			case 0x2588: return 0x76L;
			case 0x258C: return 0x61L;
			case 0x2590: return 0x64L;
			case 0x2596: return 0x66L;
			case 0x2597: return 0x67L;
			case 0x2598: return 0x72L;
			case 0x2599: return 0x7AL;
			case 0x259A: return 0x6EL;
			case 0x259B: return 0x71L;
			case 0x259C: return 0x65L;
			case 0x259D: return 0x74L;
			case 0x259E: return 0x62L;
			case 0x259F: return 0x63L;
			case 0x25CF: return 0x6DL;
			case 0x25E2: return 0x6AL;
			case 0x25E3: return 0x68L;
			case 0x25E4: return 0x79L;
			case 0x25E5: return 0x75L;
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
