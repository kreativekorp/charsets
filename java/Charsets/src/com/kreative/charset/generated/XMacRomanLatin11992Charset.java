package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacRomanLatin11992Charset extends Charset {
	public XMacRomanLatin11992Charset() {
		super("x-MacRomanLatin1-1992", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacRomanLatin11992CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacRomanLatin11992CharsetEncoder(this);
	}

	private static final class XMacRomanLatin11992CharsetDecoder extends TableCharsetDecoder {
		private XMacRomanLatin11992CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xBF && input <= 0xCF) return input - 0xBF + 0xBF;
			if (input >= 0x80 && input <= 0xBE) return CommonSubtables.COMMON1147[input - 0x80];
			if (input >= 0xDF && input <= 0xEF) return input - 0xDF + 0xDF;
			if (input >= 0xF0 && input <= 0xFF) return CommonSubtables.COMMON1202[input - 0xF0];
			switch (input) {
			case 0xD0: return 0x2039L;
			case 0xD1: return 0xD1L;
			case 0xD2: return 0xD2L;
			case 0xD3: return 0xD3L;
			case 0xD4: return 0xD4L;
			case 0xD5: return 0xD5L;
			case 0xD6: return 0xD6L;
			case 0xD7: return 0x25CAL;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xDD: return 0x2020L;
			case 0xDE: return 0xFB01L;
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

	private static final class XMacRomanLatin11992CharsetEncoder extends TableCharsetEncoder {
		private XMacRomanLatin11992CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xBF && input <= 0xCF) return input - 0xBF + 0xBF;
			if (input >= 0xA0 && input <= 0xBB) return CommonSubtables.COMMON1146[input - 0xA0];
			if (input >= 0xDF && input <= 0xEF) return input - 0xDF + 0xDF;
			if (input >= 0x2013 && input <= 0x2044) return CommonSubtables.COMMON1203[input - 0x2013];
			switch (input) {
			case 0xD1: return 0xD1L;
			case 0xD2: return 0xD2L;
			case 0xD3: return 0xD3L;
			case 0xD4: return 0xD4L;
			case 0xD5: return 0xD5L;
			case 0xD6: return 0xD6L;
			case 0xD8: return 0xD8L;
			case 0xD9: return 0xD9L;
			case 0xDA: return 0xDAL;
			case 0xDB: return 0xDBL;
			case 0xDC: return 0xDCL;
			case 0xF1: return 0xF1L;
			case 0xF2: return 0xF2L;
			case 0xF3: return 0xF3L;
			case 0xF4: return 0xF4L;
			case 0xF5: return 0xF5L;
			case 0xF6: return 0xF6L;
			case 0xF7: return 0xF7L;
			case 0xF8: return 0xF8L;
			case 0xF9: return 0xF9L;
			case 0xFA: return 0xFAL;
			case 0xFB: return 0xFBL;
			case 0xFC: return 0xFCL;
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
			case 0x2122: return 0x81L;
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
			case 0xFB01: return 0xDEL;
			case 0xFB02: return 0xFEL;
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
