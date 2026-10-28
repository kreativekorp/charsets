package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XLatin9pVideoCharset extends Charset {
	public XLatin9pVideoCharset() {
		super("x-latin9p-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XLatin9pVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XLatin9pVideoCharsetEncoder(this);
	}

	private static final class XLatin9pVideoCharsetDecoder extends TableCharsetDecoder {
		private XLatin9pVideoCharsetDecoder(Charset cs) {
			super(cs, 1.08984f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0xDF99D83E, 0x258C, 0x2584, 0x2191, 0x2190, 0x258F, 0x2592, 0x2595, 0xDF8FD83E, 0x25E4, 0xDF87D83E, 0x251C, 0x2597, 0x2514, 0x2510, 0x2582,
				0x250C, 0x2534, 0x252C, 0x2524, 0x258E, 0x258D, 0xDF88D83E, 0xDF82D83E, 0xDF83D83E, 0x2583, 0xDF7FD83E, 0x2596, 0x259D, 0x2518, 0x2598, 0x259A,
			};
		}
		private static final int[] GETOUTPUT0_7F = getOutput0_7F();
		private static final int[] getOutput0_7F() {
			return new int[] {
				0xDF96D83E, 0x2500, 0x2660, 0xDF72D83E, 0xDF78D83E, 0xDF77D83E, 0xDF76D83E, 0xDF7AD83E, 0xDF71D83E, 0xDF74D83E, 0x256E, 0x2570, 0x256F, 0xDF7CD83E, 0x2572, 0x2571,
				0xDF7DD83E, 0xDF7ED83E, 0x25CF, 0xDF7BD83E, 0x2665, 0xDF70D83E, 0x256D, 0x2573, 0x25CB, 0x2663, 0xDF75D83E, 0x2666, 0x253C, 0xDF8CD83E, 0x2502, 0x3C0,
				0x25E5, 0xDF98D83E, 0xA1, 0xA2, 0xA3, 0x20AC, 0xA5, 0x160, 0xA7, 0x161, 0xA9, 0xAA, 0xAB, 0xAC, 0x2713, 0xAE,
				0xAF, 0xB0, 0xB1, 0xB2, 0xB3, 0x17D, 0xB5, 0xB6, 0xB7, 0x17E, 0xB9, 0xBA, 0xBB, 0x152, 0x153, 0x178,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0xBF && input <= 0xFF) return input - 0xBF + 0xBF;
			if (input >= 0x7F && input <= 0xBE) return GETOUTPUT0_7F[input - 0x7F];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XLatin9pVideoCharsetEncoder extends TableCharsetEncoder {
		private XLatin9pVideoCharsetEncoder(Charset cs) {
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
			return " \u00A1\u00A2\u00A3\u0000\u00A5\u0000\u00A7\u0000\u00A9\u00AA\u00AB\u00AC-\u00AE\u00AF\u00B0\u00B1\u00B2\u00B3\u0000\u00B5\u00B6\u00B7\u0000\u00B9\u00BA\u00BB".toCharArray();
		}
		private static final char[] GETOUTPUT0_256D = getOutput0_256D();
		private static final char[] getOutput0_256D() {
			return "\u0095\u0089\u008B\u008A\u008E\u008D\u0096\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000_\u000F\u0019\u0201\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0101\u0015\u0014\u0501\u0000\u0000\u0601\u0000\u00AF\u0701\u001B\f\u001E\u0000\u001F\u0000\u0000\u001C".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xBF && input <= 0xFE) return input - 0xBF + 0xBF;
			if (input >= 0xA0 && input <= 0xBB) return GETOUTPUT0_A0[input - 0xA0];
			if (input >= 0x256D && input <= 0x259D) return GETOUTPUT0_256D[input - 0x256D];
			switch (input) {
			case 0xFF: return 0xFF01L;
			case 0x152: return 0xBCL;
			case 0x153: return 0xBDL;
			case 0x160: return 0xA6L;
			case 0x161: return 0xA8L;
			case 0x178: return 0xBEL;
			case 0x17D: return 0xB4L;
			case 0x17E: return 0xB8L;
			case 0x3C0: return 0x9EL;
			case 0x2022: return 0x91L;
			case 0x20AC: return 0xA4L;
			case 0x2190: return 0x401L;
			case 0x2191: return 0x301L;
			case 0x2500: return 0x80L;
			case 0x2502: return 0x9DL;
			case 0x250C: return 0x10L;
			case 0x2510: return 0xEL;
			case 0x2514: return 0xDL;
			case 0x2518: return 0x1DL;
			case 0x251C: return 0xBL;
			case 0x2524: return 0x13L;
			case 0x252C: return 0x12L;
			case 0x2534: return 0x11L;
			case 0x253C: return 0x9BL;
			case 0x25CB: return 0x97L;
			case 0x25CF: return 0x91L;
			case 0x25E4: return 0x9L;
			case 0x25E5: return 0x9FL;
			case 0x25E6: return 0x97L;
			case 0x2660: return 0x81L;
			case 0x2663: return 0x98L;
			case 0x2665: return 0x93L;
			case 0x2666: return 0x9AL;
			case 0x2713: return 0xADL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DF70 = getOutput1_DF70();
		private static final char[] getOutput1_DF70() {
			return "\u0094\u0087\u0082\u009D\u0088\u0099\u0085\u0084\u0083\u0080\u0086\u0092\u008C\u008F\u0090\u001A\u0000\u0000\u0017\u0018\u0000\u0000\u0000\n\u0016\u0000\u0000\u0000\u009C\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u007F\u007F\u0000\u00A0\u0001".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xDF70 && input <= 0xDF99) return GETOUTPUT1_DF70[input - 0xDF70];
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
