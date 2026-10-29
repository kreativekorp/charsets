package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKayproVideoCharset extends Charset {
	public XKayproVideoCharset() {
		super("x-kaypro-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKayproVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKayproVideoCharsetEncoder(this);
	}

	private static final class XKayproVideoCharsetDecoder extends TableCharsetDecoder {
		private XKayproVideoCharsetDecoder(Charset cs) {
			super(cs, 1.47266f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0x2502, 0x253C, 0x253C, 0x2510, 0x2518, 0x2514, 0x250C, 0xB1, 0x2192, 0x2588, 0xF7, 0x2193, 0x2597, 0x2596, 0x2598, 0x259D,
				0x2580, 0xDF75D83E, 0x25E4, 0x252C, 0x2524, 0x2534, 0x251C, 0x2573, 0x2571, 0x2572, 0x23BA, 0x23BD, 0x23B8, 0x23B9, 0xB6, 0x25E5,
			};
		}
		private static final int[] GETOUTPUT0_7F = getOutput0_7F();
		private static final int[] getOutput0_7F() {
			return new int[] {
				0x25E5, 0xA0, 0xDEABD833, 0xDEA8D833, 0xDF82D83E, 0xDD03D833, 0x259D, 0xDD04D833, 0xDD05D833, 0xDD00D833, 0xDD01D833, 0x2598, 0xDD02D833, 0xDD06D833, 0xDD08D833, 0xDD07D833,
				0x2580, 0xDD18D833, 0xDD1AD833, 0xDD19D833, 0xDD1BD833, 0xDFE7D83E, 0xDD21D833, 0xDD20D833, 0xDD22D833, 0xDD1CD833, 0xDD1ED833, 0xDD1DD833, 0xDD1FD833, 0xDD23D833, 0xDD25D833, 0xDD24D833,
				0xDD26D833, 0xDD09D833, 0xDD0BD833, 0xDD0AD833, 0xDD0CD833, 0xDD10D833, 0xDD12D833, 0xDD11D833, 0xDD13D833, 0xDFE6D83E, 0xDD0ED833, 0xDD0DD833, 0xDD0FD833, 0xDD14D833, 0xDD16D833, 0xDD15D833,
				0xDD17D833, 0xDD27D833, 0xDD29D833, 0xDD28D833, 0xDD2AD833, 0xDD2FD833, 0xDD31D833, 0xDD30D833, 0xDD32D833, 0xDD2BD833, 0xDD2DD833, 0xDD2CD833, 0xDD2ED833, 0xDD33D833, 0xDD35D833, 0xDD34D833,
				0xDF85D83E, 0xDEA0D833, 0xDD72D833, 0xDD71D833, 0xDD73D833, 0xDD78D833, 0xDD7AD833, 0xDD79D833, 0xDD7BD833, 0xDD74D833, 0xDD76D833, 0xDD75D833, 0xDD77D833, 0xDD7CD833, 0xDD7ED833, 0xDD7DD833,
				0xDD7FD833, 0x2597, 0xDD91D833, 0xDD90D833, 0xDD92D833, 0xDD96D833, 0x2590, 0xDD97D833, 0xDD98D833, 0xDD93D833, 0xDD94D833, 0x259A, 0xDD95D833, 0xDD99D833, 0xDD9BD833, 0xDD9AD833,
				0x259C, 0xDD80D833, 0xDD82D833, 0xDD81D833, 0xDD83D833, 0xDD88D833, 0xDD8AD833, 0xDD89D833, 0xDD8BD833, 0xDD84D833, 0xDD86D833, 0xDD85D833, 0xDD87D833, 0xDD8CD833, 0xDD8ED833, 0xDD8DD833,
				0xDD8FD833, 0xDD9CD833, 0xDD9ED833, 0xDD9DD833, 0xDD9FD833, 0xDDA4D833, 0xDDA6D833, 0xDDA5D833, 0xDDA7D833, 0xDDA0D833, 0xDDA2D833, 0xDDA1D833, 0xDDA3D833, 0xDDA8D833, 0xDDAAD833, 0xDDA9D833,
				0xDDABD833,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x7F && input <= 0xFF) return GETOUTPUT0_7F[input - 0x7F];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKayproVideoCharsetEncoder extends TableCharsetEncoder {
		private XKayproVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			case 0xD83E: return 0x2;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_2571 = getOutput0_2571();
		private static final char[] getOutput0_2571() {
			return "\u0018\u0019\u0017\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008F\u001B\u0000\u0000\u0000\u0000\u0000\u0000\t\u0000\u0000\u0000\u0000\u0000\u0000\u001C\u00D5\u0000\u0000\u0000\u001A\u001D\r\u00D0\u008A\u0000\u00DA\u0000\u00DF\u0085".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x2571 && input <= 0x259D) return GETOUTPUT0_2571[input - 0x2571];
			switch (input) {
			case 0xA0: return 0x80L;
			case 0xB1: return 0x701L;
			case 0xB6: return 0x1EL;
			case 0xF7: return 0xAL;
			case 0x2192: return 0x8L;
			case 0x2193: return 0xBL;
			case 0x23B8: return 0x1CL;
			case 0x23B9: return 0x1DL;
			case 0x23BA: return 0x1AL;
			case 0x23BD: return 0x1BL;
			case 0x2502: return 0x1L;
			case 0x250C: return 0x601L;
			case 0x2510: return 0x301L;
			case 0x2514: return 0x501L;
			case 0x2518: return 0x401L;
			case 0x251C: return 0x16L;
			case 0x2524: return 0x14L;
			case 0x252C: return 0x13L;
			case 0x2534: return 0x15L;
			case 0x253C: return 0x201L;
			case 0x25E4: return 0x12L;
			case 0x25E5: return 0x1FL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDD00 && input <= 0xDD35) return CommonSubtables.COMMON1564[input - 0xDD00];
			if (input >= 0xDD71 && input <= 0xDDAB) return CommonSubtables.COMMON1565[input - 0xDD71];
			switch (input) {
			case 0xDEA0: return 0xC0L;
			case 0xDEA8: return 0x82L;
			case 0xDEAB: return 0x81L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDF75: return 0x11L;
			case 0xDF82: return 0x83L;
			case 0xDF85: return 0xBFL;
			case 0xDFE6: return 0xA8L;
			case 0xDFE7: return 0x94L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			default: return 0;
			}
		}
	}
}
