package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM943CCharset extends Charset {
	public XIBM943CCharset() {
		super("x-IBM943C", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM943CCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM943CCharsetEncoder(this);
	}

	private static final class XIBM943CCharsetDecoder extends TableCharsetDecoder {
		private XIBM943CCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0x87 && input <= 0x9F) return input - 0x87 + 0x5;
			if (input >= 0xE0 && input <= 0xFC) return CommonSubtables.COMMON377[input - 0xE0];
			switch (input) {
			case 0x81: return 0x1;
			case 0x82: return 0x2;
			case 0x83: return 0x3;
			case 0x84: return 0x4;
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
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xDF) return input - 0xA1 + 0xFF61;
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON378[input - 0x40];
			return 0;
		}
		private long getOutput2(int input) {
			if (input >= 0x60 && input <= 0x79) return input - 0x60 + 0xFF21;
			if (input >= 0x81 && input <= 0x9A) return input - 0x81 + 0xFF41;
			if (input >= 0x9F && input <= 0xF1) return input - 0x9F + 0x3041;
			switch (input) {
			case 0x4F: return 0xFF10L;
			case 0x50: return 0xFF11L;
			case 0x51: return 0xFF12L;
			case 0x52: return 0xFF13L;
			case 0x53: return 0xFF14L;
			case 0x54: return 0xFF15L;
			case 0x55: return 0xFF16L;
			case 0x56: return 0xFF17L;
			case 0x57: return 0xFF18L;
			case 0x58: return 0xFF19L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0x30A1;
			if (input >= 0x80 && input <= 0x96) return input - 0x80 + 0x30E0;
			if (input >= 0x9F && input <= 0xAF) return input - 0x9F + 0x391;
			if (input >= 0xBF && input <= 0xCF) return input - 0xBF + 0x3B1;
			switch (input) {
			case 0xB0: return 0x3A3L;
			case 0xB1: return 0x3A4L;
			case 0xB2: return 0x3A5L;
			case 0xB3: return 0x3A6L;
			case 0xB4: return 0x3A7L;
			case 0xB5: return 0x3A8L;
			case 0xB6: return 0x3A9L;
			case 0xD0: return 0x3C3L;
			case 0xD1: return 0x3C4L;
			case 0xD2: return 0x3C5L;
			case 0xD3: return 0x3C6L;
			case 0xD4: return 0x3C7L;
			case 0xD5: return 0x3C8L;
			case 0xD6: return 0x3C9L;
			}
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0x47 && input <= 0x60) return input - 0x47 + 0x416;
			if (input >= 0x80 && input <= 0x91) return input - 0x80 + 0x43E;
			if (input >= 0x9F && input <= 0xBE) return CommonSubtables.COMMON187[input - 0x9F];
			switch (input) {
			case 0x40: return 0x410L;
			case 0x41: return 0x411L;
			case 0x42: return 0x412L;
			case 0x43: return 0x413L;
			case 0x44: return 0x414L;
			case 0x45: return 0x415L;
			case 0x46: return 0x401L;
			case 0x70: return 0x430L;
			case 0x71: return 0x431L;
			case 0x72: return 0x432L;
			case 0x73: return 0x433L;
			case 0x74: return 0x434L;
			case 0x75: return 0x435L;
			case 0x76: return 0x451L;
			case 0x77: return 0x436L;
			case 0x78: return 0x437L;
			case 0x79: return 0x438L;
			case 0x7A: return 0x439L;
			case 0x7B: return 0x43AL;
			case 0x7C: return 0x43BL;
			case 0x7D: return 0x43CL;
			case 0x7E: return 0x43DL;
			}
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0x40 && input <= 0x53) return input - 0x40 + 0x2460;
			if (input >= 0x54 && input <= 0x9C) return CommonSubtables.COMMON379[input - 0x54];
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0x9F && input <= 0xFC) return CommonSubtables.COMMON188[input - 0x9F];
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON380[input - 0x40];
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON381[input - 0x40];
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON382[input - 0x40];
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON383[input - 0x40];
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON384[input - 0x40];
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON385[input - 0x40];
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON297[input - 0x40];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON386[input - 0x40];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON387[input - 0x40];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON388[input - 0x40];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON389[input - 0x40];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON390[input - 0x40];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON391[input - 0x40];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON392[input - 0x40];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON393[input - 0x40];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0x40 && input <= 0x72) return CommonSubtables.COMMON219[input - 0x40];
			if (input >= 0x9F && input <= 0xFC) return CommonSubtables.COMMON220[input - 0x9F];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON308[input - 0x40];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON394[input - 0x40];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON310[input - 0x40];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON311[input - 0x40];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON395[input - 0x40];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON396[input - 0x40];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON397[input - 0x40];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON398[input - 0x40];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON399[input - 0x40];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON400[input - 0x40];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON318[input - 0x40];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON319[input - 0x40];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON401[input - 0x40];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON402[input - 0x40];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON403[input - 0x40];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON404[input - 0x40];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON405[input - 0x40];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0x40 && input <= 0xA4) return CommonSubtables.COMMON406[input - 0x40];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON407[input - 0x40];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON408[input - 0x40];
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0xE000;
			if (input >= 0x80 && input <= 0xFC) return input - 0x80 + 0xE03F;
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0xE0BC;
			if (input >= 0x80 && input <= 0xFC) return input - 0x80 + 0xE0FB;
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0xE178;
			if (input >= 0x80 && input <= 0xFC) return input - 0x80 + 0xE1B7;
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0xE234;
			if (input >= 0x80 && input <= 0xFC) return input - 0x80 + 0xE273;
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0xE2F0;
			if (input >= 0x80 && input <= 0xFC) return input - 0x80 + 0xE32F;
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0xE3AC;
			if (input >= 0x80 && input <= 0xFC) return input - 0x80 + 0xE3EB;
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0xE468;
			if (input >= 0x80 && input <= 0xFC) return input - 0x80 + 0xE4A7;
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0xE524;
			if (input >= 0x80 && input <= 0xFC) return input - 0x80 + 0xE563;
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0xE5E0;
			if (input >= 0x80 && input <= 0xFC) return input - 0x80 + 0xE61F;
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0x40 && input <= 0x7E) return input - 0x40 + 0xE69C;
			if (input >= 0x80 && input <= 0xFC) return input - 0x80 + 0xE6DB;
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON409[input - 0x40];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON327[input - 0x40];
			return 0;
		}
		private long getOutput55(int input) {
			switch (input) {
			case 0x40: return 0x9ADCL;
			case 0x41: return 0x9B75L;
			case 0x42: return 0x9B72L;
			case 0x43: return 0x9B8FL;
			case 0x44: return 0x9BB1L;
			case 0x45: return 0x9BBBL;
			case 0x46: return 0x9C00L;
			case 0x47: return 0x9D70L;
			case 0x48: return 0x9D6BL;
			case 0x49: return 0xFA2DL;
			case 0x4A: return 0x9E19L;
			case 0x4B: return 0x9ED1L;
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
			case 6: return getOutput6(input);
			case 7: return getOutput7(input);
			case 8: return getOutput8(input);
			case 9: return getOutput9(input);
			case 10: return getOutput10(input);
			case 11: return getOutput11(input);
			case 12: return getOutput12(input);
			case 13: return getOutput13(input);
			case 14: return getOutput14(input);
			case 15: return getOutput15(input);
			case 16: return getOutput16(input);
			case 17: return getOutput17(input);
			case 18: return getOutput18(input);
			case 19: return getOutput19(input);
			case 20: return getOutput20(input);
			case 21: return getOutput21(input);
			case 22: return getOutput22(input);
			case 23: return getOutput23(input);
			case 24: return getOutput24(input);
			case 25: return getOutput25(input);
			case 26: return getOutput26(input);
			case 27: return getOutput27(input);
			case 28: return getOutput28(input);
			case 29: return getOutput29(input);
			case 30: return getOutput30(input);
			case 31: return getOutput31(input);
			case 32: return getOutput32(input);
			case 33: return getOutput33(input);
			case 34: return getOutput34(input);
			case 35: return getOutput35(input);
			case 36: return getOutput36(input);
			case 37: return getOutput37(input);
			case 38: return getOutput38(input);
			case 39: return getOutput39(input);
			case 40: return getOutput40(input);
			case 41: return getOutput41(input);
			case 42: return getOutput42(input);
			case 43: return getOutput43(input);
			case 44: return getOutput44(input);
			case 45: return getOutput45(input);
			case 46: return getOutput46(input);
			case 47: return getOutput47(input);
			case 48: return getOutput48(input);
			case 49: return getOutput49(input);
			case 50: return getOutput50(input);
			case 51: return getOutput51(input);
			case 52: return getOutput52(input);
			case 53: return getOutput53(input);
			case 54: return getOutput54(input);
			case 55: return getOutput55(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM943CCharsetEncoder extends TableCharsetEncoder {
		private XIBM943CCharsetEncoder(Charset cs) {
			super(cs, 1.97956f, 2f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON328[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON329[input - 0x401];
			if (input >= 0x2010 && input <= 0x203E) return CommonSubtables.COMMON330[input - 0x2010];
			if (input >= 0x2160 && input <= 0x2179) return CommonSubtables.COMMON331[input - 0x2160];
			if (input >= 0x2200 && input <= 0x223D) return CommonSubtables.COMMON410[input - 0x2200];
			if (input >= 0x2460 && input <= 0x2473) return CommonSubtables.COMMON411[input - 0x2460];
			if (input >= 0x2500 && input <= 0x254B) return CommonSubtables.COMMON333[input - 0x2500];
			if (input >= 0x3000 && input <= 0x301F) return CommonSubtables.COMMON412[input - 0x3000];
			if (input >= 0x3041 && input <= 0x30FE) return CommonSubtables.COMMON335[input - 0x3041];
			if (input >= 0x3303 && input <= 0x3357) return CommonSubtables.COMMON413[input - 0x3303];
			if (input >= 0x4E00 && input <= 0x4F1D) return CommonSubtables.COMMON336[input - 0x4E00];
			if (input >= 0x4F2F && input <= 0x509A) return CommonSubtables.COMMON414[input - 0x4F2F];
			if (input >= 0x50AC && input <= 0x5516) return CommonSubtables.COMMON415[input - 0x50AC];
			if (input >= 0x552E && input <= 0x5563) return CommonSubtables.COMMON416[input - 0x552E];
			if (input >= 0x557B && input <= 0x55E4) return CommonSubtables.COMMON339[input - 0x557B];
			if (input >= 0x55F7 && input <= 0x576A) return CommonSubtables.COMMON340[input - 0x55F7];
			if (input >= 0x577F && input <= 0x5A6C) return CommonSubtables.COMMON417[input - 0x577F];
			if (input >= 0x5ABC && input <= 0x5C79) return CommonSubtables.COMMON418[input - 0x5ABC];
			if (input >= 0x5C8C && input <= 0x5CC7) return CommonSubtables.COMMON343[input - 0x5C8C];
			if (input >= 0x5CD9 && input <= 0x5D29) return CommonSubtables.COMMON344[input - 0x5CD9];
			if (input >= 0x5D42 && input <= 0x61D0) return CommonSubtables.COMMON345[input - 0x5D42];
			if (input >= 0x61E3 && input <= 0x6505) return CommonSubtables.COMMON419[input - 0x61E3];
			if (input >= 0x6518 && input <= 0x6BF3) return CommonSubtables.COMMON420[input - 0x6518];
			if (input >= 0x6C08 && input <= 0x6D45) return CommonSubtables.COMMON421[input - 0x6C08];
			if (input >= 0x6D59 && input <= 0x7099) return CommonSubtables.COMMON422[input - 0x6D59];
			if (input >= 0x70AB && input <= 0x70DF) return CommonSubtables.COMMON350[input - 0x70AB];
			if (input >= 0x70F1 && input <= 0x7396) return CommonSubtables.COMMON423[input - 0x70F1];
			if (input >= 0x73A9 && input <= 0x7409) return CommonSubtables.COMMON352[input - 0x73A9];
			if (input >= 0x7455 && input <= 0x748B) return CommonSubtables.COMMON424[input - 0x7455];
			if (input >= 0x749E && input <= 0x760D) return CommonSubtables.COMMON354[input - 0x749E];
			if (input >= 0x761F && input <= 0x7747) return CommonSubtables.COMMON355[input - 0x761F];
			if (input >= 0x775A && input <= 0x7E9C) return CommonSubtables.COMMON425[input - 0x775A];
			if (input >= 0x7F36 && input <= 0x878D) return CommonSubtables.COMMON426[input - 0x7F36];
			if (input >= 0x879F && input <= 0x89C0) return CommonSubtables.COMMON427[input - 0x879F];
			if (input >= 0x89D2 && input <= 0x8B9A) return CommonSubtables.COMMON428[input - 0x89D2];
			if (input >= 0x8C37 && input <= 0x8D16) return CommonSubtables.COMMON429[input - 0x8C37];
			if (input >= 0x8D64 && input <= 0x8F64) return CommonSubtables.COMMON361[input - 0x8D64];
			if (input >= 0x8F9B && input <= 0x9091) return CommonSubtables.COMMON430[input - 0x8F9B];
			if (input >= 0x90A3 && input <= 0x9132) return CommonSubtables.COMMON363[input - 0x90A3];
			if (input >= 0x9149 && input <= 0x92B9) return CommonSubtables.COMMON431[input - 0x9149];
			if (input >= 0x92CF && input <= 0x9481) return CommonSubtables.COMMON432[input - 0x92CF];
			if (input >= 0x9577 && input <= 0x95E5) return CommonSubtables.COMMON365[input - 0x9577];
			if (input >= 0x961C && input <= 0x9874) return CommonSubtables.COMMON433[input - 0x961C];
			if (input >= 0x98DB && input <= 0x9957) return CommonSubtables.COMMON367[input - 0x98DB];
			if (input >= 0x9996 && input <= 0x9A6B) return CommonSubtables.COMMON368[input - 0x9996];
			if (input >= 0x9AA8 && input <= 0x9B06) return CommonSubtables.COMMON369[input - 0x9AA8];
			if (input >= 0x9B18 && input <= 0x9B5A) return CommonSubtables.COMMON370[input - 0x9B18];
			if (input >= 0x9B6F && input <= 0x9C78) return CommonSubtables.COMMON434[input - 0x9B6F];
			if (input >= 0x9CE5 && input <= 0x9DFD) return CommonSubtables.COMMON435[input - 0x9CE5];
			if (input >= 0x9E75 && input <= 0x9F77) return CommonSubtables.COMMON373[input - 0x9E75];
			if (input >= 0xE000 && input <= 0xE757) return CommonSubtables.COMMON374[input - 0xE000];
			if (input >= 0xFA0E && input <= 0xFA2D) return CommonSubtables.COMMON375[input - 0xFA0E];
			if (input >= 0xFF61 && input <= 0xFF9F) return input - 0xFF61 + 0xA1;
			if (input >= 0xFF01 && input <= 0xFF5E) return CommonSubtables.COMMON376[input - 0xFF01];
			switch (input) {
			case 0xA5: return 0x5CL;
			case 0xA6: return 0x55FAL;
			case 0xA7: return 0x9881L;
			case 0xA8: return 0x4E81L;
			case 0xB0: return 0x8B81L;
			case 0xB1: return 0x7D81L;
			case 0xB4: return 0x4C81L;
			case 0xB6: return 0xF781L;
			case 0xD7: return 0x7E81L;
			case 0xF7: return 0x8081L;
			case 0x2103: return 0x8E81L;
			case 0x2116: return 0x59FAL;
			case 0x2121: return 0x5AFAL;
			case 0x212B: return 0xF081L;
			case 0x2190: return 0xA981L;
			case 0x2191: return 0xAA81L;
			case 0x2192: return 0xA881L;
			case 0x2193: return 0xAB81L;
			case 0x21D2: return 0xCB81L;
			case 0x21D4: return 0xCC81L;
			case 0x2252: return 0xE081L;
			case 0x2260: return 0x8281L;
			case 0x2261: return 0xDF81L;
			case 0x2266: return 0x8581L;
			case 0x2267: return 0x8681L;
			case 0x226A: return 0xE181L;
			case 0x226B: return 0xE281L;
			case 0x2282: return 0xBC81L;
			case 0x2283: return 0xBD81L;
			case 0x2286: return 0xBA81L;
			case 0x2287: return 0xBB81L;
			case 0x22A5: return 0xDB81L;
			case 0x22BF: return 0x9987L;
			case 0x2312: return 0xDC81L;
			case 0x25A0: return 0xA181L;
			case 0x25A1: return 0xA081L;
			case 0x25B2: return 0xA381L;
			case 0x25B3: return 0xA281L;
			case 0x25BC: return 0xA581L;
			case 0x25BD: return 0xA481L;
			case 0x25C6: return 0x9F81L;
			case 0x25C7: return 0x9E81L;
			case 0x25CB: return 0x9B81L;
			case 0x25CE: return 0x9D81L;
			case 0x25CF: return 0x9C81L;
			case 0x25EF: return 0xFC81L;
			case 0x2605: return 0x9A81L;
			case 0x2606: return 0x9981L;
			case 0x2640: return 0x8A81L;
			case 0x2642: return 0x8981L;
			case 0x266A: return 0xF481L;
			case 0x266D: return 0xF381L;
			case 0x266F: return 0xF281L;
			case 0x3231: return 0x58FAL;
			case 0x3232: return 0x8B87L;
			case 0x3239: return 0x8C87L;
			case 0x32A4: return 0x8587L;
			case 0x32A5: return 0x8687L;
			case 0x32A6: return 0x8787L;
			case 0x32A7: return 0x8887L;
			case 0x32A8: return 0x8987L;
			case 0x337B: return 0x7E87L;
			case 0x337C: return 0x8F87L;
			case 0x337D: return 0x8E87L;
			case 0x337E: return 0x8D87L;
			case 0x338E: return 0x7287L;
			case 0x338F: return 0x7387L;
			case 0x339C: return 0x6F87L;
			case 0x339D: return 0x7087L;
			case 0x339E: return 0x7187L;
			case 0x33A1: return 0x7587L;
			case 0x33C4: return 0x7487L;
			case 0x33CD: return 0x8387L;
			case 0x5A7F: return 0xB996L;
			case 0x5A92: return 0x7D94L;
			case 0x5A9A: return 0x5A9BL;
			case 0x5A9B: return 0x5195L;
			case 0x7422: return 0xF491L;
			case 0x7425: return 0xE6E0L;
			case 0x7426: return 0x67FBL;
			case 0x7429: return 0x69FBL;
			case 0x742A: return 0x68FBL;
			case 0x742E: return 0x6AFBL;
			case 0x7432: return 0xE8E0L;
			case 0x7433: return 0xD497L;
			case 0x7434: return 0xD58BL;
			case 0x7435: return 0xFA94L;
			case 0x7436: return 0x6994L;
			case 0x743A: return 0xE9E0L;
			case 0x743F: return 0xEBE0L;
			case 0x7441: return 0xEEE0L;
			case 0x98A8: return 0x9795L;
			case 0x98AA: return 0x43E9L;
			case 0x98AF: return 0x44E9L;
			case 0x98B1: return 0x45E9L;
			case 0x98B6: return 0x46E9L;
			case 0x98C3: return 0x48E9L;
			case 0x98C4: return 0x47E9L;
			case 0x98C6: return 0x49E9L;
			case 0x9E19: return 0x4AFCL;
			case 0x9E1A: return 0x5FEAL;
			case 0x9E1B: return 0x60EAL;
			case 0x9E1E: return 0x61EAL;
			case 0x9F8D: return 0xB497L;
			case 0x9F95: return 0x9CEAL;
			case 0x9F9C: return 0x9DEAL;
			case 0x9F9D: return 0x73E2L;
			case 0x9FA0: return 0x9EEAL;
			case 0xF86F: return 0x59FAL;
			case 0xF929: return 0xE0FAL;
			case 0xF9DC: return 0xE9FBL;
			case 0xFFE0: return 0x9181L;
			case 0xFFE1: return 0x9281L;
			case 0xFFE2: return 0xCA81L;
			case 0xFFE3: return 0x5081L;
			case 0xFFE4: return 0x55FAL;
			case 0xFFE5: return 0x8F81L;
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
