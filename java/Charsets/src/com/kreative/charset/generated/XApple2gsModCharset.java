package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XApple2gsModCharset extends Charset {
	public XApple2gsModCharset() {
		super("x-apple2gs-mod", new String[]{"x-apple2c-mod"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XApple2gsModCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XApple2gsModCharsetEncoder(this);
	}

	private static final class XApple2gsModCharsetDecoder extends TableCharsetDecoder {
		private XApple2gsModCharsetDecoder(Charset cs) {
			super(cs, 1.0625f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_40 = getOutput0_40();
		private static final int[] getOutput0_40() {
			return new int[] {
				0x2325, 0x2318, 0xDFB0D83E, 0xFE0E231B, 0x2713, 0xDFB1D83E, 0xDFB4D83E, 0xDF81D83E, 0x2190, 0x2026, 0x2193, 0x2191, 0x2594, 0x21B2, 0x2589, 0xDFB5D83E,
				0xDFB6D83E, 0xDFB7D83E, 0xDFB8D83E, 0x2500, 0xDF7CD83E, 0x2192, 0x2592, 0xDF90D83E, 0xDFB9D83E, 0xDFBAD83E, 0x2595, 0x25C6, 0xDF80D83E, 0xDFBBD83E, 0xDFBCD83E, 0x258F,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x40;
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7E) return input - 0x60 + 0x60;
			if (input >= 0x40 && input <= 0x5F) return GETOUTPUT0_40[input - 0x40];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.DECODE_ASCII_C0[input - 0x80];
			if (input >= 0xA0 && input <= 0xFE) return input - 0xA0 + 0x20;
			switch (input) {
			case 0x7F: return 0x2427L;
			case 0xFF: return 0x2427L;
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

	private static final class XApple2gsModCharsetEncoder extends TableCharsetEncoder {
		private XApple2gsModCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{-65}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x231B: return 0x1;
			case 0xD83C: return 0x3;
			case 0xD83E: return 0x4;
			case 0xDBBF: return 0x5;
			case 0xF8FF: return 0x2;
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
			if (input >= 0x0 && input <= 0x7E) return input - 0x0 + 0x80;
			switch (input) {
			case 0x7F: return 0xFF01L;
			case 0xA0: return 0xA0L;
			case 0xAF: return 0x4CL;
			case 0x2015: return 0x53L;
			case 0x2026: return 0x49L;
			case 0x2190: return 0x48L;
			case 0x2191: return 0x4BL;
			case 0x2192: return 0x55L;
			case 0x2193: return 0x4AL;
			case 0x21B2: return 0x4DL;
			case 0x21B5: return 0x4DL;
			case 0x2318: return 0x41L;
			case 0x231B: return 0x43L;
			case 0x2325: return 0x40L;
			case 0x23B8: return 0x5FL;
			case 0x23B9: return 0x5AL;
			case 0x23BA: return 0x4CL;
			case 0x23BD: return 0xDFL;
			case 0x2427: return 0xFF01L;
			case 0x2500: return 0x53L;
			case 0x2502: return 0xFCL;
			case 0x2581: return 0xDFL;
			case 0x2589: return 0x4EL;
			case 0x258F: return 0x5FL;
			case 0x2592: return 0x56L;
			case 0x2594: return 0x4CL;
			case 0x2595: return 0x5AL;
			case 0x25C6: return 0x5BL;
			case 0x2666: return 0x5BL;
			case 0x2713: return 0x44L;
			case 0xF812: return 0x41L;
			case 0xF813: return 0x40L;
			case 0xF8FF: return 0x40L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xFE0E: return 0x43L;
			case 0xFE0F: return 0x43L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xF87F: return 0x41L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xDF4E: return 0x40L;
			case 0xDF4F: return 0x41L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xDF7C: return 0x54L;
			case 0xDF80: return 0x5CL;
			case 0xDF81: return 0x47L;
			case 0xDF90: return 0x57L;
			case 0xDFB0: return 0x42L;
			case 0xDFB1: return 0x45L;
			case 0xDFB2: return 0x46L;
			case 0xDFB3: return 0x47L;
			case 0xDFB4: return 0x46L;
			case 0xDFB5: return 0x4FL;
			case 0xDFB6: return 0x50L;
			case 0xDFB7: return 0x51L;
			case 0xDFB8: return 0x52L;
			case 0xDFB9: return 0x58L;
			case 0xDFBA: return 0x59L;
			case 0xDFBB: return 0x5DL;
			case 0xDFBC: return 0x5EL;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xDC82: return 0x56L;
			case 0xDC83: return 0x57L;
			case 0xDCE2: return 0x41L;
			case 0xDCE3: return 0x40L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 3: return getOutput3(input);
			case 4: return getOutput4(input);
			case 5: return getOutput5(input);
			default: return 0;
			}
		}
	}
}
