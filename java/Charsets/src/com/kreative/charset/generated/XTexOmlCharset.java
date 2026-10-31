package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTexOmlCharset extends Charset {
	public XTexOmlCharset() {
		super("x-tex-oml", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTexOmlCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTexOmlCharsetEncoder(this);
	}

	private static final class XTexOmlCharsetDecoder extends TableCharsetDecoder {
		private XTexOmlCharsetDecoder(Charset cs) {
			super(cs, 1.73438f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0xDEE4D835, 0xDEE5D835, 0xDEE9D835, 0xDEECD835, 0xDEEFD835, 0xDEF1D835, 0xDEF4D835, 0xDEF6D835, 0xDEF7D835, 0xDEF9D835, 0xDEFAD835, 0xDEFCD835, 0xDEFDD835, 0xDEFED835, 0xDEFFD835, 0xDF00D835,
				0xDF01D835, 0xDF02D835, 0xDF03D835, 0xDF04D835, 0xDF05D835, 0xDF06D835, 0xDF07D835, 0xDF08D835, 0xDF09D835, 0xDF0BD835, 0xDF0CD835, 0xDF0ED835, 0xDF0FD835, 0xDF10D835, 0xDF11D835, 0xDF12D835,
				0xDF13D835, 0xDF14D835, 0xDF16D835, 0xDF17D835, 0xDF1BD835, 0xDF1AD835, 0xDF0DD835, 0xDF19D835, 0x21BC, 0x21BD, 0x21C0, 0x21C1, 0xF8FC, 0xF8FD, 0x25B7, 0x25C1,
				0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x2E, 0x2C, 0x3C, 0x2F, 0x3E, 0x22C6,
				0xDF15D835, 0xDC34D835, 0xDC35D835, 0xDC36D835, 0xDC37D835, 0xDC38D835, 0xDC39D835, 0xDC3AD835, 0xDC3BD835, 0xDC3CD835, 0xDC3DD835, 0xDC3ED835, 0xDC3FD835, 0xDC40D835, 0xDC41D835, 0xDC42D835,
				0xDC43D835, 0xDC44D835, 0xDC45D835, 0xDC46D835, 0xDC47D835, 0xDC48D835, 0xDC49D835, 0xDC4AD835, 0xDC4BD835, 0xDC4CD835, 0xDC4DD835, 0x266D, 0x266E, 0x266F, 0x25E1, 0x25E0,
				0x2113, 0xDC4ED835, 0xDC4FD835, 0xDC50D835, 0xDC51D835, 0xDC52D835, 0xDC53D835, 0xDC54D835, 0x210E, 0xDC56D835, 0xDC57D835, 0xDC58D835, 0xDC59D835, 0xDC5AD835, 0xDC5BD835, 0xDC5CD835,
				0xDC5DD835, 0xDC5ED835, 0xDC5FD835, 0xDC60D835, 0xDC61D835, 0xDC62D835, 0xDC63D835, 0xDC64D835, 0xDC65D835, 0xDC66D835, 0xDC67D835, 0xDEA4D835, 0xDEA5D835, 0x2118, 0x20D7, 0x361,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x7F) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XTexOmlCharsetEncoder extends TableCharsetEncoder {
		private XTexOmlCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{88}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD835: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0x391 && input <= 0x3D6) return CommonSubtables.COMMON1750[input - 0x391];
			switch (input) {
			case 0x2C: return 0x3BL;
			case 0x2E: return 0x3AL;
			case 0x2F: return 0x3DL;
			case 0x30: return 0x30L;
			case 0x31: return 0x31L;
			case 0x32: return 0x32L;
			case 0x33: return 0x33L;
			case 0x34: return 0x34L;
			case 0x35: return 0x35L;
			case 0x36: return 0x36L;
			case 0x37: return 0x37L;
			case 0x38: return 0x38L;
			case 0x39: return 0x39L;
			case 0x3C: return 0x3CL;
			case 0x3E: return 0x3EL;
			case 0x131: return 0x7BL;
			case 0x237: return 0x7CL;
			case 0x361: return 0x7FL;
			case 0x3F1: return 0x25L;
			case 0x3F5: return 0x22L;
			case 0x20D7: return 0x7EL;
			case 0x210E: return 0x68L;
			case 0x2113: return 0x60L;
			case 0x2118: return 0x7DL;
			case 0x21BC: return 0x28L;
			case 0x21BD: return 0x29L;
			case 0x21C0: return 0x2AL;
			case 0x21C1: return 0x2BL;
			case 0x2202: return 0x40L;
			case 0x22C6: return 0x3FL;
			case 0x25B7: return 0x2EL;
			case 0x25C1: return 0x2FL;
			case 0x25E0: return 0x5FL;
			case 0x25E1: return 0x5EL;
			case 0x266D: return 0x5BL;
			case 0x266E: return 0x5CL;
			case 0x266F: return 0x5DL;
			case 0xF8FC: return 0x2CL;
			case 0xF8FD: return 0x2DL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDC34 && input <= 0xDC4D) return input - 0xDC34 + 0x41;
			if (input >= 0xDC56 && input <= 0xDC67) return input - 0xDC56 + 0x69;
			if (input >= 0xDEE2 && input <= 0xDF1B) return CommonSubtables.COMMON1751[input - 0xDEE2];
			switch (input) {
			case 0xDC4E: return 0x61L;
			case 0xDC4F: return 0x62L;
			case 0xDC50: return 0x63L;
			case 0xDC51: return 0x64L;
			case 0xDC52: return 0x65L;
			case 0xDC53: return 0x66L;
			case 0xDC54: return 0x67L;
			case 0xDEA4: return 0x7BL;
			case 0xDEA5: return 0x7CL;
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
