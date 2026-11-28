package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XApple2gsSeLinuxCharset extends Charset {
	public XApple2gsSeLinuxCharset() {
		super("x-apple2gs-se-linux", new String[]{"x-apple2c-se-linux"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XApple2gsSeLinuxCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XApple2gsSeLinuxCharsetEncoder(this);
	}

	private static final class XApple2gsSeLinuxCharsetDecoder extends TableCharsetDecoder {
		private XApple2gsSeLinuxCharsetDecoder(Charset cs) {
			super(cs, 1.0625f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1A) return input - 0x0 + 0x40;
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7A) return input - 0x60 + 0x60;
			if (input >= 0x40 && input <= 0x5F) return CommonSubtables.C3549132[input - 0x40];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.DAC0[input - 0x80];
			if (input >= 0xA0 && input <= 0xDA) return input - 0xA0 + 0x20;
			if (input >= 0xDE && input <= 0xFA) return input - 0xDE + 0x5E;
			switch (input) {
			case 0x1B: return 0xC4L;
			case 0x1C: return 0xD6L;
			case 0x1D: return 0xC5L;
			case 0x1E: return 0x5EL;
			case 0x1F: return 0x5FL;
			case 0x7B: return 0xE4L;
			case 0x7C: return 0xF6L;
			case 0x7D: return 0xE5L;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x2427L;
			case 0xDB: return 0xC4L;
			case 0xDC: return 0xD6L;
			case 0xDD: return 0xC5L;
			case 0xFB: return 0xE4L;
			case 0xFC: return 0xF6L;
			case 0xFD: return 0xE5L;
			case 0xFE: return 0x7EL;
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

	private static final class XApple2gsSeLinuxCharsetEncoder extends TableCharsetEncoder {
		private XApple2gsSeLinuxCharsetEncoder(Charset cs) {
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
			if (input >= 0x0 && input <= 0x5A) return input - 0x0 + 0x80;
			if (input >= 0x5E && input <= 0x7A) return input - 0x5E + 0xDE;
			switch (input) {
			case 0x7E: return 0xFEL;
			case 0x7F: return 0xFF01L;
			case 0xA0: return 0xA0L;
			case 0xAF: return 0x4CL;
			case 0xC4: return 0xDBL;
			case 0xC5: return 0xDDL;
			case 0xD6: return 0xDCL;
			case 0xE4: return 0xFBL;
			case 0xE5: return 0xFDL;
			case 0xF6: return 0xFCL;
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
			case 0x25B2: return 0x40L;
			case 0x25B3: return 0x41L;
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
