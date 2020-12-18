package com.kreative.charset;

import java.nio.charset.Charset;

public class SuperLatinEncoder extends AbstractCharsetEncoder {
	private final boolean overrideC0;
	
	protected SuperLatinEncoder(Charset cs, boolean overrideC0) {
		super(cs, 1);
		this.overrideC0 = overrideC0;
	}
	
	@Override
	protected int encode(int ch) {
		if (ch < 0x80) return ch;
		if (ch < 0xA0) return UNMAPPABLE;
		if (ch < 0x100) return ch;
		switch (ch) {
		case 0x0131: return 0x8F;
		case 0x0141: return 0x8D;
		case 0x0142: return 0x9D;
		case 0x0152: return 0x8C;
		case 0x0153: return 0x9C;
		case 0x0160: return 0x8A;
		case 0x0161: return 0x9A;
		case 0x0178: return 0x9F;
		case 0x017D: return 0x8E;
		case 0x017E: return 0x9E;
		case 0x0192: return 0x83;
		case 0x02C6: return 0x88;
		case 0x02C7: return overrideC0 ? 0x05 : UNMAPPABLE;
		case 0x02CB: return overrideC0 ? 0x01 : UNMAPPABLE;
		case 0x02D8: return overrideC0 ? 0x06 : UNMAPPABLE;
		case 0x02D9: return overrideC0 ? 0x03 : UNMAPPABLE;
		case 0x02DA: return overrideC0 ? 0x04 : UNMAPPABLE;
		case 0x02DB: return overrideC0 ? 0x07 : UNMAPPABLE;
		case 0x02DC: return 0x98;
		case 0x02DD: return overrideC0 ? 0x02 : UNMAPPABLE;
		case 0x03A9: return overrideC0 ? 0x17 : UNMAPPABLE;
		case 0x03C0: return overrideC0 ? 0x18 : UNMAPPABLE;
		case 0x2013: return 0x96;
		case 0x2014: return 0x97;
		case 0x2018: return 0x91;
		case 0x2019: return 0x92;
		case 0x201A: return 0x82;
		case 0x201C: return 0x93;
		case 0x201D: return 0x94;
		case 0x201E: return 0x84;
		case 0x2020: return 0x86;
		case 0x2021: return 0x87;
		case 0x2022: return 0x95;
		case 0x2026: return 0x85;
		case 0x2030: return 0x89;
		case 0x2039: return 0x8B;
		case 0x203A: return 0x9B;
		case 0x2044: return overrideC0 ? 0x11 : UNMAPPABLE;
		case 0x20AC: return 0x80;
		case 0x2122: return 0x99;
		case 0x2202: return overrideC0 ? 0x19 : UNMAPPABLE;
		case 0x2206: return overrideC0 ? 0x16 : UNMAPPABLE;
		case 0x220F: return overrideC0 ? 0x14 : UNMAPPABLE;
		case 0x2211: return overrideC0 ? 0x13 : UNMAPPABLE;
		case 0x221A: return overrideC0 ? 0x12 : UNMAPPABLE;
		case 0x221E: return overrideC0 ? 0x1A : UNMAPPABLE;
		case 0x222B: return overrideC0 ? 0x15 : UNMAPPABLE;
		case 0x2248: return overrideC0 ? 0x1F : UNMAPPABLE;
		case 0x2260: return overrideC0 ? 0x1D : UNMAPPABLE;
		case 0x2264: return overrideC0 ? 0x1C : UNMAPPABLE;
		case 0x2265: return overrideC0 ? 0x1E : UNMAPPABLE;
		case 0x2318: return 0x90;
		case 0x25CA: return 0x81;
		case 0xF8FF: return overrideC0 ? 0x10 : UNMAPPABLE;
		case 0xFB01: return overrideC0 ? 0x0E : UNMAPPABLE;
		case 0xFB02: return overrideC0 ? 0x0F : UNMAPPABLE;
		default: return UNMAPPABLE;
		}
	}
}
