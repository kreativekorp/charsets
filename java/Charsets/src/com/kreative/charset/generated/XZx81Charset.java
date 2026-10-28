package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XZx81Charset extends Charset {
	public XZx81Charset() {
		super("x-zx81", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XZx81CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XZx81CharsetEncoder(this);
	}

	private static final class XZx81CharsetDecoder extends TableCharsetDecoder {
		private XZx81CharsetDecoder(Charset cs) {
			super(cs, 1.03906f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0x20, 0x2598, 0x259D, 0x2580, 0x2596, 0x258C, 0x259E, 0x259B, 0x2592, 0xDF8FD83E, 0xDF8ED83E, 0x22, 0xA3, 0x24, 0x3A, 0x3F,
				0x28, 0x29, 0x3E, 0x3C, 0x3D, 0x2B, 0x2D, 0x2A, 0x2F, 0x3B, 0x2C, 0x2E, 0x30, 0x31, 0x32, 0x33,
				0x34, 0x35, 0x36, 0x37, 0x38, 0x39,
			};
		}
		private static final int[] GETOUTPUT0_80 = getOutput0_80();
		private static final int[] getOutput0_80() {
			return new int[] {
				0x2588, 0x259F, 0x2599, 0x2584, 0x259C, 0x2590, 0x259A, 0x2597, 0xDF90D83E, 0xDF91D83E, 0xDF92D83E, 0x22, 0xA3, 0x24, 0x3A, 0x3F,
				0x28, 0x29, 0x3E, 0x3C, 0x3D, 0x2B, 0x2D, 0x2A, 0x2F, 0x3B, 0x2C, 0x2E, 0x30, 0x31, 0x32, 0x33,
				0x34, 0x35, 0x36, 0x37, 0x38, 0x39,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x26 && input <= 0x3F) return input - 0x26 + 0x41;
			if (input >= 0x0 && input <= 0x25) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0xA6 && input <= 0xBF) return input - 0xA6 + 0x41;
			if (input >= 0x80 && input <= 0xA5) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XZx81CharsetEncoder extends TableCharsetEncoder {
		private XZx81CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{15}, 2);
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
		private static final char[] GETOUTPUT0_20 = getOutput0_20();
		private static final char[] getOutput0_20() {
			return "\u0001\u0000\u000B\u0000\r\u0000\u0000\u0000\u0010\u0011\u0017\u0015\u001A\u0016\u001B\u0018\u001C\u001D\u001E\u001F !\"#$%\u000E\u0019\u0013\u0014\u0012\u000F".toCharArray();
		}
		private static final char[] GETOUTPUT0_2580 = getOutput0_2580();
		private static final char[] getOutput0_2580() {
			return "\u0301\u0000\u0000\u0000\u0083\u0000\u0000\u0000\u0080\u0000\u0000\u0000\u0501\u0000\u0000\u0000\u0085\u0000\b\u0000\u0000\u0000\u0401\u0087\u0101\u0082\u0086\u0701\u0084\u0201\u0601\u0081".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x26;
			if (input >= 0x20 && input <= 0x3F) return GETOUTPUT0_20[input - 0x20];
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x26;
			if (input >= 0x2580 && input <= 0x259F) return GETOUTPUT0_2580[input - 0x2580];
			switch (input) {
			case 0xA0: return 0x1L;
			case 0xA3: return 0xCL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDF8E: return 0xAL;
			case 0xDF8F: return 0x9L;
			case 0xDF90: return 0x88L;
			case 0xDF91: return 0x89L;
			case 0xDF92: return 0x8AL;
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
