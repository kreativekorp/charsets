package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XOsborne1Charset extends Charset {
	public XOsborne1Charset() {
		super("x-osborne1", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XOsborne1CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XOsborne1CharsetEncoder(this);
	}

	private static final class XOsborne1CharsetDecoder extends TableCharsetDecoder {
		private XOsborne1CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFE) return input - 0xA0 + 0x20;
			if (input >= 0x7F && input <= 0x9F) return CommonSubtables.COMMON1712[input - 0x7F];
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

	private static final class XOsborne1CharsetEncoder extends TableCharsetEncoder {
		private XOsborne1CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			switch (input) {
			case 0xBC: return 0x93L;
			case 0xBD: return 0x9DL;
			case 0x2022: return 0x8DL;
			case 0x2395: return 0x80L;
			case 0x2428: return 0x7FL;
			case 0x2501: return 0x9BL;
			case 0x2503: return 0x8BL;
			case 0x250F: return 0x89L;
			case 0x2513: return 0x90L;
			case 0x2517: return 0x9CL;
			case 0x251B: return 0x9FL;
			case 0x2533: return 0x8FL;
			case 0x253B: return 0x9EL;
			case 0x254B: return 0x8CL;
			case 0x2580: return 0x97L;
			case 0x2584: return 0x98L;
			case 0x2588: return 0x96L;
			case 0x258C: return 0x81L;
			case 0x2590: return 0x84L;
			case 0x2596: return 0x86L;
			case 0x2597: return 0x87L;
			case 0x2598: return 0x92L;
			case 0x2599: return 0x9AL;
			case 0x259A: return 0x8EL;
			case 0x259B: return 0x91L;
			case 0x259C: return 0x85L;
			case 0x259D: return 0x94L;
			case 0x259E: return 0x82L;
			case 0x259F: return 0x83L;
			case 0x25CF: return 0x8DL;
			case 0x25E2: return 0x8AL;
			case 0x25E3: return 0x88L;
			case 0x25E4: return 0x99L;
			case 0x25E5: return 0x95L;
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
