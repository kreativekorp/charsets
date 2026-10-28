package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XShiftJisGenericCharset extends Charset {
	public XShiftJisGenericCharset() {
		super("x-shift-jis-generic", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XShiftJisGenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XShiftJisGenericCharsetEncoder(this);
	}

	private static final class XShiftJisGenericCharsetDecoder extends TableCharsetDecoder {
		private XShiftJisGenericCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0x88 && input <= 0x9F) return input - 0x88 + 0x5;
			switch (input) {
			case 0x81: return 0x1;
			case 0x82: return 0x2;
			case 0x83: return 0x3;
			case 0x84: return 0x4;
			case 0xE0: return 0x1D;
			case 0xE1: return 0x1E;
			case 0xE2: return 0x1F;
			case 0xE3: return 0x20;
			case 0xE4: return 0x21;
			case 0xE5: return 0x22;
			case 0xE6: return 0x23;
			case 0xE7: return 0x24;
			case 0xE8: return 0x25;
			case 0xE9: return 0x26;
			case 0xEA: return 0x27;
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
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7D) return input - 0x5D + 0x5D;
			if (input >= 0xA1 && input <= 0xDF) return input - 0xA1 + 0xFF61;
			switch (input) {
			case 0x5C: return 0xA5L;
			case 0x7E: return 0x203EL;
			case 0x7F: return 0x7FL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_40 = getOutput1_40();
		private static final char[] getOutput1_40() {
			return "\u3000\u3001\u3002\uFF0C\uFF0E\u30FB\uFF1A\uFF1B\uFF1F\uFF01\u309B\u309C\u00B4\uFF40\u00A8\uFF3E\uFFE3\uFF3F\u30FD\u30FE\u309D\u309E\u3003\u4EDD\u3005\u3006\u3007\u30FC\u2015\u2010\uFF0F\\\u301C\u2016\uFF5C\u2026\u2025\u2018\u2019\u201C\u201D\uFF08\uFF09\u3014\u3015\uFF3B\uFF3D\uFF5B\uFF5D\u3008\u3009\u300A\u300B\u300C\u300D\u300E\u300F\u3010\u3011\uFF0B\u2212\u00B1\u00D7\u0000\u00F7\uFF1D\u2260\uFF1C\uFF1E\u2266\u2267\u221E\u2234\u2642\u2640\u00B0\u2032\u2033\u2103\uFFE5\uFF04\u00A2\u00A3\uFF05\uFF03\uFF06\uFF0A\uFF20\u00A7\u2606\u2605\u25CB\u25CF\u25CE\u25C7\u25C6\u25A1\u25A0\u25B3\u25B2\u25BD\u25BC\u203B\u3012\u2192\u2190\u2191\u2193\u3013\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u2208\u220B\u2286\u2287\u2282\u2283\u222A\u2229\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u2227\u2228\u00AC\u21D2\u21D4\u2200\u2203\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u2220\u22A5\u2312\u2202\u2207\u2261\u2252\u226A\u226B\u221A\u223D\u221D\u2235\u222B\u222C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u212B\u2030\u266F\u266D\u266A\u2020\u2021\u00B6\u0000\u0000\u0000\u0000\u25EF".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0x40 && input <= 0xFC) return GETOUTPUT1_40[input - 0x40];
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
			if (input >= 0x9F && input <= 0xFC) return CommonSubtables.COMMON188[input - 0x9F];
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON380[input - 0x40];
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON381[input - 0x40];
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON382[input - 0x40];
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON383[input - 0x40];
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON384[input - 0x40];
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON385[input - 0x40];
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON297[input - 0x40];
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON386[input - 0x40];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON387[input - 0x40];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON388[input - 0x40];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON389[input - 0x40];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON390[input - 0x40];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON391[input - 0x40];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON392[input - 0x40];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON393[input - 0x40];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0x40 && input <= 0x72) return CommonSubtables.COMMON219[input - 0x40];
			if (input >= 0x9F && input <= 0xFC) return CommonSubtables.COMMON220[input - 0x9F];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON308[input - 0x40];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON394[input - 0x40];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON310[input - 0x40];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON311[input - 0x40];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON395[input - 0x40];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON396[input - 0x40];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON397[input - 0x40];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON398[input - 0x40];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON399[input - 0x40];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON400[input - 0x40];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON318[input - 0x40];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON319[input - 0x40];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON401[input - 0x40];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON402[input - 0x40];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON403[input - 0x40];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON404[input - 0x40];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0x40 && input <= 0xFC) return CommonSubtables.COMMON405[input - 0x40];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0x40 && input <= 0xA4) return CommonSubtables.COMMON406[input - 0x40];
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
			default: return 0;
			}
		}
	}

	private static final class XShiftJisGenericCharsetEncoder extends TableCharsetEncoder {
		private XShiftJisGenericCharsetEncoder(Charset cs) {
			super(cs, 1.97298f, 2f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_2010 = getOutput0_2010();
		private static final char[] getOutput0_2010() {
			return "\u5D81\u0000\u0000\u0000\u0000\u5C81\u6181\u0000\u6581\u6681\u0000\u0000\u6781\u6881\u0000\u0000\uF581\uF681\u0000\u0000\u0000\u6481\u6381\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uF181\u0000\u8C81\u8D81\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA681\u0000\u0000~".toCharArray();
		}
		private static final char[] GETOUTPUT0_FF01 = getOutput0_FF01();
		private static final char[] getOutput0_FF01() {
			return "\u4981\u0000\u9481\u9081\u9381\u9581\u0000\u6981\u6A81\u9681\u7B81\u4381\u0000\u4481\u5E81\u4F82\u5082\u5182\u5282\u5382\u5482\u5582\u5682\u5782\u5882\u4681\u4781\u8381\u8181\u8481\u4881\u9781\u6082\u6182\u6282\u6382\u6482\u6582\u6682\u6782\u6882\u6982\u6A82\u6B82\u6C82\u6D82\u6E82\u6F82\u7082\u7182\u7282\u7382\u7482\u7582\u7682\u7782\u7882\u7982\u6D81\u0000\u6E81\u4F81\u5181\u4D81\u8182\u8282\u8382\u8482\u8582\u8682\u8782\u8882\u8982\u8A82\u8B82\u8C82\u8D82\u8E82\u8F82\u9082\u9182\u9282\u9382\u9482\u9582\u9682\u9782\u9882\u9982\u9A82\u6F81\u6281\u7081".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7D) return input - 0x5D + 0x5D;
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON328[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON329[input - 0x401];
			if (input >= 0x2010 && input <= 0x203E) return GETOUTPUT0_2010[input - 0x2010];
			if (input >= 0x2200 && input <= 0x223D) return CommonSubtables.COMMON1729[input - 0x2200];
			if (input >= 0x2500 && input <= 0x254B) return CommonSubtables.COMMON333[input - 0x2500];
			if (input >= 0x3000 && input <= 0x301C) return CommonSubtables.COMMON334[input - 0x3000];
			if (input >= 0x3041 && input <= 0x30FE) return CommonSubtables.COMMON335[input - 0x3041];
			if (input >= 0x4E00 && input <= 0x4F1D) return CommonSubtables.COMMON1135[input - 0x4E00];
			if (input >= 0x4F2F && input <= 0x509A) return CommonSubtables.COMMON1136[input - 0x4F2F];
			if (input >= 0x50AC && input <= 0x5384) return CommonSubtables.COMMON1137[input - 0x50AC];
			if (input >= 0x5396 && input <= 0x5516) return CommonSubtables.COMMON1138[input - 0x5396];
			if (input >= 0x552E && input <= 0x5563) return CommonSubtables.COMMON1139[input - 0x552E];
			if (input >= 0x557B && input <= 0x55E4) return CommonSubtables.COMMON1140[input - 0x557B];
			if (input >= 0x55F7 && input <= 0x576A) return CommonSubtables.COMMON1141[input - 0x55F7];
			if (input >= 0x577F && input <= 0x5A6C) return CommonSubtables.COMMON1142[input - 0x577F];
			if (input >= 0x5ABC && input <= 0x5C79) return CommonSubtables.COMMON1143[input - 0x5ABC];
			if (input >= 0x5C8C && input <= 0x5CC7) return CommonSubtables.COMMON1144[input - 0x5C8C];
			if (input >= 0x5CD9 && input <= 0x5D29) return CommonSubtables.COMMON1145[input - 0x5CD9];
			if (input >= 0x5D4B && input <= 0x61D0) return CommonSubtables.COMMON1146[input - 0x5D4B];
			if (input >= 0x61E3 && input <= 0x6505) return CommonSubtables.COMMON1147[input - 0x61E3];
			if (input >= 0x6518 && input <= 0x6BF3) return CommonSubtables.COMMON1148[input - 0x6518];
			if (input >= 0x6C08 && input <= 0x6CF3) return CommonSubtables.COMMON1149[input - 0x6C08];
			if (input >= 0x6D0B && input <= 0x6D45) return CommonSubtables.COMMON1150[input - 0x6D0B];
			if (input >= 0x6D59 && input <= 0x6D9C) return CommonSubtables.COMMON1151[input - 0x6D59];
			if (input >= 0x6DAF && input <= 0x7099) return CommonSubtables.COMMON1152[input - 0x6DAF];
			if (input >= 0x70F1 && input <= 0x7396) return CommonSubtables.COMMON1153[input - 0x70F1];
			if (input >= 0x73A9 && input <= 0x7409) return CommonSubtables.COMMON1154[input - 0x73A9];
			if (input >= 0x7455 && input <= 0x748B) return CommonSubtables.COMMON1155[input - 0x7455];
			if (input >= 0x749E && input <= 0x760D) return CommonSubtables.COMMON1156[input - 0x749E];
			if (input >= 0x761F && input <= 0x769A) return CommonSubtables.COMMON1157[input - 0x761F];
			if (input >= 0x76AE && input <= 0x7747) return CommonSubtables.COMMON1158[input - 0x76AE];
			if (input >= 0x775A && input <= 0x7845) return CommonSubtables.COMMON1159[input - 0x775A];
			if (input >= 0x785D && input <= 0x7E9C) return CommonSubtables.COMMON1160[input - 0x785D];
			if (input >= 0x7F36 && input <= 0x8358) return CommonSubtables.COMMON1161[input - 0x7F36];
			if (input >= 0x8373 && input <= 0x84DA) return CommonSubtables.COMMON1162[input - 0x8373];
			if (input >= 0x84EC && input <= 0x878D) return CommonSubtables.COMMON1163[input - 0x84EC];
			if (input >= 0x879F && input <= 0x89C0) return CommonSubtables.COMMON1164[input - 0x879F];
			if (input >= 0x89D2 && input <= 0x8B9A) return CommonSubtables.COMMON1165[input - 0x89D2];
			if (input >= 0x8C37 && input <= 0x8D16) return CommonSubtables.COMMON1166[input - 0x8C37];
			if (input >= 0x8D64 && input <= 0x8F64) return CommonSubtables.COMMON1167[input - 0x8D64];
			if (input >= 0x8F9B && input <= 0x9091) return CommonSubtables.COMMON1168[input - 0x8F9B];
			if (input >= 0x90A3 && input <= 0x9119) return CommonSubtables.COMMON1169[input - 0x90A3];
			if (input >= 0x9149 && input <= 0x92B9) return CommonSubtables.COMMON1170[input - 0x9149];
			if (input >= 0x92E4 && input <= 0x93E8) return CommonSubtables.COMMON1171[input - 0x92E4];
			if (input >= 0x9403 && input <= 0x9481) return CommonSubtables.COMMON1172[input - 0x9403];
			if (input >= 0x9577 && input <= 0x95E5) return CommonSubtables.COMMON1173[input - 0x9577];
			if (input >= 0x961C && input <= 0x9874) return CommonSubtables.COMMON1174[input - 0x961C];
			if (input >= 0x98DB && input <= 0x9957) return CommonSubtables.COMMON1175[input - 0x98DB];
			if (input >= 0x9996 && input <= 0x9A6B) return CommonSubtables.COMMON1176[input - 0x9996];
			if (input >= 0x9AA8 && input <= 0x9B06) return CommonSubtables.COMMON1177[input - 0x9AA8];
			if (input >= 0x9B18 && input <= 0x9B5A) return CommonSubtables.COMMON370[input - 0x9B18];
			if (input >= 0x9B6F && input <= 0x9C78) return CommonSubtables.COMMON1178[input - 0x9B6F];
			if (input >= 0x9CE5 && input <= 0x9DFD) return CommonSubtables.COMMON1179[input - 0x9CE5];
			if (input >= 0x9E75 && input <= 0x9F77) return CommonSubtables.COMMON1180[input - 0x9E75];
			if (input >= 0xFF61 && input <= 0xFF9F) return input - 0xFF61 + 0xA1;
			if (input >= 0xFF01 && input <= 0xFF5D) return GETOUTPUT0_FF01[input - 0xFF01];
			switch (input) {
			case 0x5C: return 0x5F81L;
			case 0x7F: return 0x7FL;
			case 0xA2: return 0x9181L;
			case 0xA3: return 0x9281L;
			case 0xA5: return 0x5CL;
			case 0xA7: return 0x9881L;
			case 0xA8: return 0x4E81L;
			case 0xAC: return 0xCA81L;
			case 0xB0: return 0x8B81L;
			case 0xB1: return 0x7D81L;
			case 0xB4: return 0x4C81L;
			case 0xB6: return 0xF781L;
			case 0xD7: return 0x7E81L;
			case 0xF7: return 0x8081L;
			case 0x2103: return 0x8E81L;
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
			case 0x5A7F: return 0xB996L;
			case 0x5A92: return 0x7D94L;
			case 0x5A9A: return 0x5A9BL;
			case 0x5A9B: return 0x5195L;
			case 0x70AC: return 0x78E0L;
			case 0x70AD: return 0x5992L;
			case 0x70AE: return 0x7BE0L;
			case 0x70AF: return 0x76E0L;
			case 0x70B3: return 0x7AE0L;
			case 0x70B8: return 0x79E0L;
			case 0x70B9: return 0x5F93L;
			case 0x70BA: return 0xD788L;
			case 0x70C8: return 0xF397L;
			case 0x70CB: return 0x7DE0L;
			case 0x70CF: return 0x4789L;
			case 0x70D9: return 0x80E0L;
			case 0x70DD: return 0x7EE0L;
			case 0x70DF: return 0x7CE0L;
			case 0x7422: return 0xF491L;
			case 0x7425: return 0xE6E0L;
			case 0x7432: return 0xE8E0L;
			case 0x7433: return 0xD497L;
			case 0x7434: return 0xD58BL;
			case 0x7435: return 0xFA94L;
			case 0x7436: return 0x6994L;
			case 0x743A: return 0xE9E0L;
			case 0x743F: return 0xEBE0L;
			case 0x7441: return 0xEEE0L;
			case 0x912D: return 0x4193L;
			case 0x9130: return 0xC1E7L;
			case 0x9132: return 0xC0E7L;
			case 0x92CF: return 0xF5E7L;
			case 0x92D2: return 0x4E96L;
			case 0x98A8: return 0x9795L;
			case 0x98AA: return 0x43E9L;
			case 0x98AF: return 0x44E9L;
			case 0x98B1: return 0x45E9L;
			case 0x98B6: return 0x46E9L;
			case 0x98C3: return 0x48E9L;
			case 0x98C4: return 0x47E9L;
			case 0x98C6: return 0x49E9L;
			case 0x9E1A: return 0x5FEAL;
			case 0x9E1B: return 0x60EAL;
			case 0x9E1E: return 0x61EAL;
			case 0x9F8D: return 0xB497L;
			case 0x9F95: return 0x9CEAL;
			case 0x9F9C: return 0x9DEAL;
			case 0x9F9D: return 0x73E2L;
			case 0x9FA0: return 0x9EEAL;
			case 0xFFE3: return 0x5081L;
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
