package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XOsborne1VideoCharset extends Charset {
	public XOsborne1VideoCharset() {
		super("x-osborne1-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XOsborne1VideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XOsborne1VideoCharsetEncoder(this);
	}

	private static final class XOsborne1VideoCharsetDecoder extends TableCharsetDecoder {
		private XOsborne1VideoCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\u2395\u258C\u259E\u259F\u2590\u259C\u2596\u2597\u25E3\u250F\u25E2\u2503\u254B\u2022\u259A\u2533\u2513\u259B\u2598\u00BC\u259D\u25E5\u2588\u2580\u2584\u25E4\u2599\u2501\u2517\u00BD\u253B\u251B".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0xA0 && input <= 0xFE) return input - 0xA0 + 0x20;
			if (input >= 0x7F && input <= 0x9F) return CommonSubtables.COMMON1694[input - 0x7F];
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

	private static final class XOsborne1VideoCharsetEncoder extends TableCharsetEncoder {
		private XOsborne1VideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			switch (input) {
			case 0xBC: return 0x13L;
			case 0xBD: return 0x1DL;
			case 0x2022: return 0xDL;
			case 0x2395: return 0x1L;
			case 0x2428: return 0x7FL;
			case 0x2501: return 0x1BL;
			case 0x2503: return 0xBL;
			case 0x250F: return 0x9L;
			case 0x2513: return 0x10L;
			case 0x2517: return 0x1CL;
			case 0x251B: return 0x1FL;
			case 0x2533: return 0xFL;
			case 0x253B: return 0x1EL;
			case 0x254B: return 0xCL;
			case 0x2580: return 0x17L;
			case 0x2584: return 0x18L;
			case 0x2588: return 0x16L;
			case 0x258C: return 0x101L;
			case 0x2590: return 0x401L;
			case 0x2596: return 0x601L;
			case 0x2597: return 0x701L;
			case 0x2598: return 0x12L;
			case 0x2599: return 0x1AL;
			case 0x259A: return 0xEL;
			case 0x259B: return 0x11L;
			case 0x259C: return 0x501L;
			case 0x259D: return 0x14L;
			case 0x259E: return 0x201L;
			case 0x259F: return 0x301L;
			case 0x25CF: return 0xDL;
			case 0x25E2: return 0xAL;
			case 0x25E3: return 0x8L;
			case 0x25E4: return 0x19L;
			case 0x25E5: return 0x15L;
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
