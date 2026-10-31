package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTrs80m4aAltVideoCharset extends Charset {
	public XTrs80m4aAltVideoCharset() {
		super("x-trs80m4a-alt-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTrs80m4aAltVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTrs80m4aAltVideoCharsetEncoder(this);
	}

	private static final class XTrs80m4aAltVideoCharsetDecoder extends TableCharsetDecoder {
		private XTrs80m4aAltVideoCharsetDecoder(Charset cs) {
			super(cs, 1.24609f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_7F = getOutput0_7F();
		private static final int[] getOutput0_7F() {
			return new int[] {
				0xB1, 0xA0, 0xDF00D83E, 0xDF01D83E, 0xDF02D83E, 0xDF03D83E, 0xDF04D83E, 0xDF05D83E, 0xDF06D83E, 0xDF07D83E, 0xDF08D83E, 0xDF09D83E, 0xDF0AD83E, 0xDF0BD83E, 0xDF0CD83E, 0xDF0DD83E,
				0xDF0ED83E, 0xDF0FD83E, 0xDF10D83E, 0xDF11D83E, 0xDF12D83E, 0xDF13D83E, 0x258C, 0xDF14D83E, 0xDF15D83E, 0xDF16D83E, 0xDF17D83E, 0xDF18D83E, 0xDF19D83E, 0xDF1AD83E, 0xDF1BD83E, 0xDF1CD83E,
				0xDF1DD83E, 0xDF1ED83E, 0xDF1FD83E, 0xDF20D83E, 0xDF21D83E, 0xDF22D83E, 0xDF23D83E, 0xDF24D83E, 0xDF25D83E, 0xDF26D83E, 0xDF27D83E, 0x2590, 0xDF28D83E, 0xDF29D83E, 0xDF2AD83E, 0xDF2BD83E,
				0xDF2CD83E, 0xDF2DD83E, 0xDF2ED83E, 0xDF2FD83E, 0xDF30D83E, 0xDF31D83E, 0xDF32D83E, 0xDF33D83E, 0xDF34D83E, 0xDF35D83E, 0xDF36D83E, 0xDF37D83E, 0xDF38D83E, 0xDF39D83E, 0xDF3AD83E, 0xDF3BD83E,
				0x2588, 0x2CA, 0xE0, 0xE7, 0xA3, 0x2CB, 0xB5, 0xB0, 0x2DA, 0x2020, 0xA7, 0xAE, 0xA9, 0xBC, 0xBE, 0xBD,
				0xB6, 0xA5, 0xC4, 0xD6, 0xDC, 0xA2, 0x2DC, 0xE4, 0xF6, 0xFC, 0xDF, 0x2122, 0xE9, 0xF9, 0xE8, 0xA8,
				0x192, 0xE2, 0xEA, 0xEE, 0xF4, 0xFB, 0x2C6, 0xEB, 0xEF, 0xE1, 0xED, 0xF3, 0xFA, 0xA1, 0xF1, 0xE3,
				0xF5, 0xC6, 0xE6, 0xC5, 0xE5, 0xD8, 0xF8, 0xD1, 0xC9, 0xC1, 0xCD, 0xD3, 0xDA, 0xBF, 0xD9, 0xC8,
				0xC0,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.COMMON1759[input - 0x0];
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

	private static final class XTrs80m4aAltVideoCharsetEncoder extends TableCharsetEncoder {
		private XTrs80m4aAltVideoCharsetEncoder(Charset cs) {
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
			return "\u0080\u00EC\u00D4\u00C3\u0019\u00D0\u0000\u00C9\u00DE\u00CB\u0000\u0000\u0000\u0000\u00CA\u0000\u00C6\u007F\u0000\u0000\u0000\u00C5\u00CF\u0000\u0000\u0000\u0000\u0000\u00CC\u00CE\u00CD\u00FC\uFF01\u00F8\u0000\u0000\u00D1\u00F2\u00F0\u0000\u00FE\u00F7\u0000\u0000\u0000\u00F9\u0000\u0000\u0000\u00F6\u0000\u00FA\u0000\u0000\u00D2\u0000\u00F4\u00FD\u00FB\u0000\u00D3\u0000\u0000\u00D9\u00C1\u00E8\u00E0\u00EE\u00D6\u00F3\u00F1\u00C2\u00DD\u00DB\u00E1\u00E6\u0000\u00E9\u00E2\u00E7\u0000\u00ED\u0000\u00EA\u00E3\u00EF\u00D7\u0000\u00F5\u00DC\u00EB\u00E4\u00D8".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFC) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x192: return 0xDFL;
			case 0x2C6: return 0xE5L;
			case 0x2CA: return 0xC0L;
			case 0x2CB: return 0xC4L;
			case 0x2DA: return 0xC7L;
			case 0x2DC: return 0xD5L;
			case 0x2020: return 0xC8L;
			case 0x2122: return 0xDAL;
			case 0x2588: return 0xBFL;
			case 0x258C: return 0x95L;
			case 0x258E: return 0x1AL;
			case 0x2590: return 0xAAL;
			case 0x25AD: return 0x17L;
			case 0x25E3: return 0x1BL;
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
