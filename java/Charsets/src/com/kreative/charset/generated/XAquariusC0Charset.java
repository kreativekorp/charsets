package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAquariusC0Charset extends Charset {
	public XAquariusC0Charset() {
		super("x-aquarius-c0", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAquariusC0CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAquariusC0CharsetEncoder(this);
	}

	private static final class XAquariusC0CharsetDecoder extends TableCharsetDecoder {
		private XAquariusC0CharsetDecoder(Charset cs) {
			super(cs, 1.33203f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_80 = getOutput0_80();
		private static final int[] getOutput0_80() {
			return new int[] {
				0x2587, 0x258F, 0xDDECD833, 0xDDEDD833, 0xDF8FD83E, 0xDF8CD83E, 0x2592, 0x25CF, 0x2582, 0x2586, 0x2660, 0xDDF8D833, 0xDDEED833, 0xDDEFD833, 0x25B6, 0x25B2,
				0x2581, 0x2589, 0xDDF6D833, 0xDDF7D833, 0xDF8ED83E, 0xDF8DD83E, 0x2B24, 0x258E, 0x258D, 0x258B, 0x2708, 0xDDF9D833, 0xDDFCD833, 0xDDFBD833, 0x25C0, 0x25BC,
				0xA0, 0xDF00D83E, 0xDF01D83E, 0xDF02D83E, 0xDF03D83E, 0xDF04D83E, 0xDF05D83E, 0xDF06D83E, 0xDF07D83E, 0xDF08D83E, 0xDF09D83E, 0xDF0AD83E, 0xDF0BD83E, 0xDF0CD83E, 0xDF0DD83E, 0xDF0ED83E,
				0xDF0FD83E, 0xDF10D83E, 0xDF11D83E, 0xDF12D83E, 0xDF13D83E, 0x258C, 0xDF14D83E, 0xDF15D83E, 0xDF16D83E, 0xDF17D83E, 0xDF18D83E, 0xDF19D83E, 0xDF1AD83E, 0xDF1BD83E, 0xDF1CD83E, 0xDF1DD83E,
				0x25E2, 0x25E3, 0xDFE8D83E, 0x258A, 0x25A0, 0x2666, 0x25AA, 0xDFECD83E, 0x253C, 0xDFEDD83E, 0x2571, 0xDFE9D83E, 0x2534, 0x251C, 0x2510, 0x2514,
				0xDDFFD833, 0xDDFED833, 0xDFEAD83E, 0xDDFDD833, 0x2665, 0x2663, 0x2502, 0xDFEED83E, 0x2573, 0xDFEFD83E, 0x2572, 0xDFEBD83E, 0x252C, 0x2524, 0x250C, 0x2518,
				0xDF1ED83E, 0xDF1FD83E, 0xDF20D83E, 0xDF21D83E, 0xDF22D83E, 0xDF23D83E, 0xDF24D83E, 0xDF25D83E, 0xDF26D83E, 0xDF27D83E, 0x2590, 0xDF28D83E, 0xDF29D83E, 0xDF2AD83E, 0xDF2BD83E, 0xDF2CD83E,
				0xDF2DD83E, 0xDF2ED83E, 0xDF2FD83E, 0xDF30D83E, 0xDF31D83E, 0xDF32D83E, 0xDF33D83E, 0xDF34D83E, 0xDF35D83E, 0xDF36D83E, 0xDF37D83E, 0xDF38D83E, 0xDF39D83E, 0xDF3AD83E, 0xDF3BD83E, 0x2588,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFF) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XAquariusC0CharsetEncoder extends TableCharsetEncoder {
		private XAquariusC0CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
			case 0xD83D: return 0x2;
			case 0xD83E: return 0x3;
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
			return "\u00CA\u00DA\u00D8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0090\u0088\u00F0\u0000\u00FC\u0089\u0080\uFF01\u0091\u00C3\u0099\u00B5\u0098\u0097\u0081\u00EA\u0000\u0086\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008F\u0000\u0000\u0000\u008E\u0000\u0000\u0000\u0000\u0000\u009F\u0000\u0000\u0000\u009E\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0087".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x2571 && input <= 0x25CF) return GETOUTPUT0_2571[input - 0x2571];
			switch (input) {
			case 0xA0: return 0xA0L;
			case 0x2500: return 0xACL;
			case 0x2502: return 0xD6L;
			case 0x250C: return 0xDEL;
			case 0x2510: return 0xCEL;
			case 0x2514: return 0xCFL;
			case 0x2518: return 0xDFL;
			case 0x251C: return 0xCDL;
			case 0x2524: return 0xDDL;
			case 0x252C: return 0xDCL;
			case 0x2534: return 0xCCL;
			case 0x253C: return 0xC8L;
			case 0x25E2: return 0xC0L;
			case 0x25E3: return 0xC1L;
			case 0x2660: return 0x8AL;
			case 0x2663: return 0xD5L;
			case 0x2665: return 0xD4L;
			case 0x2666: return 0xC5L;
			case 0x2708: return 0x9AL;
			case 0x2B24: return 0x96L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDDEC: return 0x82L;
			case 0xDDED: return 0x83L;
			case 0xDDEE: return 0x8CL;
			case 0xDDEF: return 0x8DL;
			case 0xDDF6: return 0x92L;
			case 0xDDF7: return 0x93L;
			case 0xDDF8: return 0x8BL;
			case 0xDDF9: return 0x9BL;
			case 0xDDFB: return 0x9DL;
			case 0xDDFC: return 0x9CL;
			case 0xDDFD: return 0xD3L;
			case 0xDDFE: return 0xD1L;
			case 0xDDFF: return 0xD0L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDEE7: return 0x8AL;
			}
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0xDF00 && input <= 0xDF13) return input - 0xDF00 + 0xA1;
			if (input >= 0xDF28 && input <= 0xDF3B) return input - 0xDF28 + 0xEB;
			if (input >= 0xDF14 && input <= 0xDF27) return CommonSubtables.COMMON1212[input - 0xDF14];
			switch (input) {
			case 0xDF8C: return 0x85L;
			case 0xDF8D: return 0x95L;
			case 0xDF8E: return 0x94L;
			case 0xDF8F: return 0x84L;
			case 0xDFE8: return 0xC2L;
			case 0xDFE9: return 0xCBL;
			case 0xDFEA: return 0xD2L;
			case 0xDFEB: return 0xDBL;
			case 0xDFEC: return 0xC7L;
			case 0xDFED: return 0xC9L;
			case 0xDFEE: return 0xD7L;
			case 0xDFEF: return 0xD9L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 3: return getOutput3(input);
			default: return 0;
			}
		}
	}
}
