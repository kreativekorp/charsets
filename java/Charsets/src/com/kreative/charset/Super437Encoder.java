package com.kreative.charset;

import java.nio.charset.Charset;

public class Super437Encoder extends AbstractCharsetEncoder {
	private final boolean overrideC0;
	
	protected Super437Encoder(Charset cs, boolean overrideC0) {
		super(cs, 1);
		this.overrideC0 = overrideC0;
	}
	
	@Override
	protected int encode(int ch) {
		if (ch < 0x80) return ch;
		if (ch < 0xA0) return UNMAPPABLE;
		switch (ch) {
		case 0x00A0: return 0xFF;
		case 0x00A1: return 0xAD;
		case 0x00A2: return 0x9B;
		case 0x00A3: return 0x9C;
		case 0x00A4: return 0x9E;
		case 0x00A5: return 0x9D;
		case 0x00A6: return 0xDD;
		case 0x00A7: return 0xE5;
		case 0x00A8: return overrideC0 ? 0x15 : UNMAPPABLE;
		case 0x00A9: return 0xD6;
		case 0x00AA: return 0xA6;
		case 0x00AB: return 0xAE;
		case 0x00AC: return 0xAA;
		case 0x00AD: return 0xA9;
		case 0x00AE: return 0xD7;
		case 0x00AF: return 0xEF;
		case 0x00B0: return 0xF8;
		case 0x00B1: return 0xF1;
		case 0x00B2: return 0xFD;
		case 0x00B3: return 0xFE;
		case 0x00B4: return overrideC0 ? 0x16 : UNMAPPABLE;
		case 0x00B5: return 0xE6;
		case 0x00B6: return 0xED;
		case 0x00B7: return 0xFA;
		case 0x00B8: return overrideC0 ? 0x17 : UNMAPPABLE;
		case 0x00B9: return 0xFC;
		case 0x00BA: return 0xA7;
		case 0x00BB: return 0xAF;
		case 0x00BC: return 0xAC;
		case 0x00BD: return 0xAB;
		case 0x00BE: return 0xDC;
		case 0x00BF: return 0xA8;
		case 0x00C0: return 0xB5;
		case 0x00C1: return 0xD0;
		case 0x00C2: return 0xB3;
		case 0x00C3: return 0xB4;
		case 0x00C4: return 0x8E;
		case 0x00C5: return 0x8F;
		case 0x00C6: return 0x92;
		case 0x00C7: return 0x80;
		case 0x00C8: return 0xBA;
		case 0x00C9: return 0x90;
		case 0x00CA: return 0xB8;
		case 0x00CB: return 0xB9;
		case 0x00CC: return 0xBD;
		case 0x00CD: return 0xD1;
		case 0x00CE: return 0xBC;
		case 0x00CF: return 0xBB;
		case 0x00D0: return 0xCC;
		case 0x00D1: return 0xA5;
		case 0x00D2: return 0xC5;
		case 0x00D3: return 0xD2;
		case 0x00D4: return 0xC3;
		case 0x00D5: return 0xC4;
		case 0x00D6: return 0x99;
		case 0x00D7: return 0xE7;
		case 0x00D8: return 0xB6;
		case 0x00D9: return 0xC7;
		case 0x00DA: return 0xD3;
		case 0x00DB: return 0xC6;
		case 0x00DC: return 0x9A;
		case 0x00DD: return 0xB1;
		case 0x00DE: return 0xCD;
		case 0x00DF: return 0xE1;
		case 0x00E0: return 0x85;
		case 0x00E1: return 0xA0;
		case 0x00E2: return 0x83;
		case 0x00E3: return 0xBE;
		case 0x00E4: return 0x84;
		case 0x00E5: return 0x86;
		case 0x00E6: return 0x91;
		case 0x00E7: return 0x87;
		case 0x00E8: return 0x8A;
		case 0x00E9: return 0x82;
		case 0x00EA: return 0x88;
		case 0x00EB: return 0x89;
		case 0x00EC: return 0x8D;
		case 0x00ED: return 0xA1;
		case 0x00EE: return 0x8C;
		case 0x00EF: return 0x8B;
		case 0x00F0: return 0xCB;
		case 0x00F1: return 0xA4;
		case 0x00F2: return 0x95;
		case 0x00F3: return 0xA2;
		case 0x00F4: return 0x93;
		case 0x00F5: return 0xC9;
		case 0x00F6: return 0x94;
		case 0x00F7: return 0xF6;
		case 0x00F8: return 0xBF;
		case 0x00F9: return 0x97;
		case 0x00FA: return 0xA3;
		case 0x00FB: return 0x96;
		case 0x00FC: return 0x81;
		case 0x00FD: return 0xCA;
		case 0x00FE: return 0xCE;
		case 0x00FF: return 0x98;
		case 0x0131: return 0xCF;
		case 0x0141: return 0xB2;
		case 0x0142: return 0xC0;
		case 0x0152: return 0xC1;
		case 0x0153: return 0xC2;
		case 0x0160: return 0xB7;
		case 0x0161: return 0xB0;
		case 0x0178: return 0xC8;
		case 0x017D: return 0xD4;
		case 0x017E: return 0xD5;
		case 0x0192: return 0x9F;
		case 0x02C6: return overrideC0 ? 0x13 : UNMAPPABLE;
		case 0x02C7: return overrideC0 ? 0x05 : UNMAPPABLE;
		case 0x02CB: return overrideC0 ? 0x01 : UNMAPPABLE;
		case 0x02D8: return overrideC0 ? 0x06 : UNMAPPABLE;
		case 0x02D9: return overrideC0 ? 0x03 : UNMAPPABLE;
		case 0x02DA: return overrideC0 ? 0x04 : UNMAPPABLE;
		case 0x02DB: return overrideC0 ? 0x07 : UNMAPPABLE;
		case 0x02DC: return overrideC0 ? 0x14 : UNMAPPABLE;
		case 0x02DD: return overrideC0 ? 0x02 : UNMAPPABLE;
		case 0x03A9: return 0xEA;
		case 0x03C0: return 0xE3;
		case 0x2013: return 0xD9;
		case 0x2014: return 0xDA;
		case 0x2018: return overrideC0 ? 0x1C : UNMAPPABLE;
		case 0x2019: return overrideC0 ? 0x1D : UNMAPPABLE;
		case 0x201A: return overrideC0 ? 0x18 : UNMAPPABLE;
		case 0x201C: return overrideC0 ? 0x1E : UNMAPPABLE;
		case 0x201D: return overrideC0 ? 0x1F : UNMAPPABLE;
		case 0x201E: return overrideC0 ? 0x19 : UNMAPPABLE;
		case 0x2020: return overrideC0 ? 0x11 : UNMAPPABLE;
		case 0x2021: return overrideC0 ? 0x12 : UNMAPPABLE;
		case 0x2022: return 0xF9;
		case 0x2026: return overrideC0 ? 0x1A : UNMAPPABLE;
		case 0x2030: return 0xDB;
		case 0x2039: return 0xDE;
		case 0x203A: return 0xDF;
		case 0x2044: return 0xF5;
		case 0x20AC: return 0xEE;
		case 0x2122: return 0xD8;
		case 0x2202: return 0xEB;
		case 0x2206: return 0xE9;
		case 0x220F: return 0xE2;
		case 0x2211: return 0xE4;
		case 0x221A: return 0xFB;
		case 0x221E: return 0xEC;
		case 0x222B: return 0xF4;
		case 0x2248: return 0xF7;
		case 0x2260: return 0xF0;
		case 0x2264: return 0xF3;
		case 0x2265: return 0xF2;
		case 0x2318: return 0xE0;
		case 0x25CA: return 0xE8;
		case 0xF8FF: return overrideC0 ? 0x10 : UNMAPPABLE;
		case 0xFB01: return overrideC0 ? 0x0E : UNMAPPABLE;
		case 0xFB02: return overrideC0 ? 0x0F : UNMAPPABLE;
		default: return UNMAPPABLE;
		}
	}
}
