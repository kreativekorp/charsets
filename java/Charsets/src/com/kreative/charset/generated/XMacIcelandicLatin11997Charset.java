package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacIcelandicLatin11997Charset extends Charset {
	public XMacIcelandicLatin11997Charset() {
		super("x-MacIcelandicLatin1-1997", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacIcelandicLatin11997CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacIcelandicLatin11997CharsetEncoder(this);
	}

	private static final class XMacIcelandicLatin11997CharsetDecoder extends TableCharsetDecoder {
		private XMacIcelandicLatin11997CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xBF && input <= 0xD6) return input - 0xBF + 0xBF;
			if (input >= 0x80 && input <= 0xBE) return CommonSubtables.COMMON1147[input - 0x80];
			if (input >= 0xD8 && input <= 0xFF) return input - 0xD8 + 0xD8;
			switch (input) {
			case 0xD7: return 0x25CAL;
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

	private static final class XMacIcelandicLatin11997CharsetEncoder extends TableCharsetEncoder {
		private XMacIcelandicLatin11997CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xBF && input <= 0xD6) return input - 0xBF + 0xBF;
			if (input >= 0xA0 && input <= 0xBB) return CommonSubtables.COMMON1146[input - 0xA0];
			if (input >= 0xD8 && input <= 0xFE) return input - 0xD8 + 0xD8;
			switch (input) {
			case 0xFF: return 0xFF01L;
			case 0x131: return 0x9EL;
			case 0x152: return 0x91L;
			case 0x153: return 0xA6L;
			case 0x178: return 0x8DL;
			case 0x192: return 0x9FL;
			case 0x2C6: return 0x96L;
			case 0x2C7: return 0x9DL;
			case 0x2D8: return 0x98L;
			case 0x2D9: return 0x99L;
			case 0x2DA: return 0x9AL;
			case 0x2DB: return 0x9CL;
			case 0x2DC: return 0x97L;
			case 0x2DD: return 0x9BL;
			case 0x3A9: return 0x87L;
			case 0x3C0: return 0xBCL;
			case 0x2013: return 0xADL;
			case 0x2014: return 0x8BL;
			case 0x2018: return 0x8CL;
			case 0x2019: return 0xB9L;
			case 0x201A: return 0x92L;
			case 0x201C: return 0xB3L;
			case 0x201D: return 0xB2L;
			case 0x201E: return 0x93L;
			case 0x2022: return 0x80L;
			case 0x2026: return 0x8AL;
			case 0x2030: return 0x94L;
			case 0x2044: return 0x8EL;
			case 0x2122: return 0x81L;
			case 0x2126: return 0x87L;
			case 0x2202: return 0x8FL;
			case 0x2206: return 0x90L;
			case 0x220F: return 0xBDL;
			case 0x2211: return 0x85L;
			case 0x221A: return 0x88L;
			case 0x221E: return 0x83L;
			case 0x222B: return 0x86L;
			case 0x2248: return 0x89L;
			case 0x2260: return 0x82L;
			case 0x2264: return 0xBEL;
			case 0x2265: return 0x84L;
			case 0x25CA: return 0xD7L;
			case 0xF8FF: return 0x95L;
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
