package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIso6937Charset extends Charset {
	public XIso6937Charset() {
		super("x-iso-6937", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIso6937CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIso6937CharsetEncoder(this);
	}

	private static final class XIso6937CharsetDecoder extends TableCharsetDecoder {
		private XIso6937CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xC1: return 0x1;
			case 0xC2: return 0x2;
			case 0xC3: return 0x3;
			case 0xC4: return 0x4;
			case 0xC5: return 0x5;
			case 0xC6: return 0x6;
			case 0xC7: return 0x7;
			case 0xC8: return 0x8;
			case 0xCA: return 0x9;
			case 0xCB: return 0xA;
			case 0xCD: return 0xB;
			case 0xCE: return 0xC;
			case 0xCF: return 0xD;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_A4 = getOutput0_A4();
		private static final char[] getOutput0_A4() {
			return "$\u00A5#\u00A7\u00A4\u2018\u201C\u00AB\u2190\u2191\u2192\u2193\u00B0\u00B1\u00B2\u00B3\u00D7\u00B5\u00B6\u00B7\u00F7\u2019\u201D\u00BB\u00BC\u00BD\u00BE\u00BF\u0000\u02CB\u00B4\u02C6\u02DC\u00AF\u02D8\u02D9\u00A8\u0000\u02DA\u00B8\u0000\u02DD\u02DB\u02C7\u2015\u00B9\u00AE\u00A9\u2122\u266A\u00AC\u00A6\u0000\u0000\u0000\u0000\u215B\u215C\u215D\u215E\u03A9\u00C6\u00D0\u00AA\u0126\u0000\u0132\u013F\u0141\u00D8\u0152\u00BA\u00DE\u0166\u014A\u0149\u0138\u00E6\u0111\u00F0\u0127\u0131\u0133\u0140\u0142\u00F8\u0153\u00DF\u00FE\u0167\u014B\u00AD".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA3) return input - 0x20 + 0x20;
			if (input >= 0xA4 && input <= 0xFF) return GETOUTPUT0_A4[input - 0xA4];
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x41: return 0xC0L;
			case 0x45: return 0xC8L;
			case 0x49: return 0xCCL;
			case 0x4F: return 0xD2L;
			case 0x55: return 0xD9L;
			case 0x61: return 0xE0L;
			case 0x65: return 0xE8L;
			case 0x69: return 0xECL;
			case 0x6F: return 0xF2L;
			case 0x75: return 0xF9L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT2_41 = getOutput2_41();
		private static final char[] getOutput2_41() {
			return "\u00C1\u0000\u0106\u0000\u00C9\u0000\u0000\u0000\u00CD\u0000\u0000\u0139\u0000\u0143\u00D3\u0000\u0000\u0154\u015A\u0000\u00DA\u0000\u0000\u0000\u00DD\u0179\u0000\u0000\u0000\u0000\u0000\u0000\u00E1\u0000\u0107\u0000\u00E9\u0000\u0123\u0000\u00ED\u0000\u0000\u013A\u0000\u0144\u00F3\u0000\u0000\u0155\u015B\u0000\u00FA\u0000\u0000\u0000\u00FD\u017A".toCharArray();
		}
		private long getOutput2(int input) {
			if (input >= 0x41 && input <= 0x7A) return GETOUTPUT2_41[input - 0x41];
			return 0;
		}
		private static final char[] GETOUTPUT3_41 = getOutput3_41();
		private static final char[] getOutput3_41() {
			return "\u00C2\u0000\u0108\u0000\u00CA\u0000\u011C\u0124\u00CE\u0134\u0000\u0000\u0000\u0000\u00D4\u0000\u0000\u0000\u015C\u0000\u00DB\u0000\u0174\u0000\u0176\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00E2\u0000\u0109\u0000\u00EA\u0000\u011D\u0125\u00EE\u0135\u0000\u0000\u0000\u0000\u00F4\u0000\u0000\u0000\u015D\u0000\u00FB\u0000\u0175\u0000\u0177".toCharArray();
		}
		private long getOutput3(int input) {
			if (input >= 0x41 && input <= 0x79) return GETOUTPUT3_41[input - 0x41];
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0x41: return 0xC3L;
			case 0x49: return 0x128L;
			case 0x4E: return 0xD1L;
			case 0x4F: return 0xD5L;
			case 0x55: return 0x168L;
			case 0x61: return 0xE3L;
			case 0x69: return 0x129L;
			case 0x6E: return 0xF1L;
			case 0x6F: return 0xF5L;
			case 0x75: return 0x169L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0x41: return 0x100L;
			case 0x45: return 0x112L;
			case 0x49: return 0x12AL;
			case 0x4F: return 0x14CL;
			case 0x55: return 0x16AL;
			case 0x61: return 0x101L;
			case 0x65: return 0x113L;
			case 0x69: return 0x12BL;
			case 0x6F: return 0x14DL;
			case 0x75: return 0x16BL;
			}
			return 0;
		}
		private long getOutput6(int input) {
			switch (input) {
			case 0x41: return 0x102L;
			case 0x47: return 0x11EL;
			case 0x55: return 0x16CL;
			case 0x61: return 0x103L;
			case 0x67: return 0x11FL;
			case 0x75: return 0x16DL;
			}
			return 0;
		}
		private long getOutput7(int input) {
			switch (input) {
			case 0x43: return 0x10AL;
			case 0x45: return 0x116L;
			case 0x47: return 0x120L;
			case 0x49: return 0x130L;
			case 0x5A: return 0x17BL;
			case 0x63: return 0x10BL;
			case 0x65: return 0x117L;
			case 0x67: return 0x121L;
			case 0x7A: return 0x17CL;
			}
			return 0;
		}
		private long getOutput8(int input) {
			switch (input) {
			case 0x41: return 0xC4L;
			case 0x45: return 0xCBL;
			case 0x49: return 0xCFL;
			case 0x4F: return 0xD6L;
			case 0x55: return 0xDCL;
			case 0x59: return 0x178L;
			case 0x61: return 0xE4L;
			case 0x65: return 0xEBL;
			case 0x69: return 0xEFL;
			case 0x6F: return 0xF6L;
			case 0x75: return 0xFCL;
			case 0x79: return 0xFFL;
			}
			return 0;
		}
		private long getOutput9(int input) {
			switch (input) {
			case 0x41: return 0xC5L;
			case 0x55: return 0x16EL;
			case 0x61: return 0xE5L;
			case 0x75: return 0x16FL;
			}
			return 0;
		}
		private long getOutput10(int input) {
			switch (input) {
			case 0x43: return 0xC7L;
			case 0x47: return 0x122L;
			case 0x4B: return 0x136L;
			case 0x4C: return 0x13BL;
			case 0x4E: return 0x145L;
			case 0x52: return 0x156L;
			case 0x53: return 0x15EL;
			case 0x54: return 0x162L;
			case 0x63: return 0xE7L;
			case 0x6B: return 0x137L;
			case 0x6C: return 0x13CL;
			case 0x6E: return 0x146L;
			case 0x72: return 0x157L;
			case 0x73: return 0x15FL;
			case 0x74: return 0x163L;
			}
			return 0;
		}
		private long getOutput11(int input) {
			switch (input) {
			case 0x4F: return 0x150L;
			case 0x55: return 0x170L;
			case 0x6F: return 0x151L;
			case 0x75: return 0x171L;
			}
			return 0;
		}
		private long getOutput12(int input) {
			switch (input) {
			case 0x41: return 0x104L;
			case 0x45: return 0x118L;
			case 0x49: return 0x12EL;
			case 0x55: return 0x172L;
			case 0x61: return 0x105L;
			case 0x65: return 0x119L;
			case 0x69: return 0x12FL;
			case 0x75: return 0x173L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT13_43 = getOutput13_43();
		private static final char[] getOutput13_43() {
			return "\u010C\u010E\u011A\u0000\u0000\u0000\u0000\u0000\u0000\u013D\u0000\u0147\u0000\u0000\u0000\u0158\u0160\u0164\u0000\u0000\u0000\u0000\u0000\u017D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u010D\u010F\u011B\u0000\u0000\u0000\u0000\u0000\u0000\u013E\u0000\u0148\u0000\u0000\u0000\u0159\u0161\u0165\u0000\u0000\u0000\u0000\u0000\u017E".toCharArray();
		}
		private long getOutput13(int input) {
			if (input >= 0x43 && input <= 0x7A) return GETOUTPUT13_43[input - 0x43];
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
			default: return 0;
			}
		}
	}

	private static final class XIso6937CharsetEncoder extends TableCharsetEncoder {
		private XIso6937CharsetEncoder(Charset cs) {
			super(cs, 1.38084f, 2f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A4 = getOutput0_A4();
		private static final char[] getOutput0_A4() {
			return "\u00A8\u00A5\u00D7\u00A7\u00C8\u00D3\u00E3\u00AB\u00D6\uFF01\u00D2\u00C5\u00B0\u00B1\u00B2\u00B3\u00C2\u00B5\u00B6\u00B7\u00CB\u00D1\u00EB\u00BB\u00BC\u00BD\u00BE\u00BF\u41C1\u41C2\u41C3\u41C4\u41C8\u41CA\u00E1\u43CB\u45C1\u45C2\u45C3\u45C8\u49C1\u49C2\u49C3\u49C8\u00E2\u4EC4\u4FC1\u4FC2\u4FC3\u4FC4\u4FC8\u00B4\u00E9\u55C1\u55C2\u55C3\u55C8\u59C2\u00EC\u00FB\u61C1\u61C2\u61C3\u61C4\u61C8\u61CA\u00F1\u63CB\u65C1\u65C2\u65C3\u65C8\u69C1\u69C2\u69C3\u69C8\u00F3\u6EC4\u6FC1\u6FC2\u6FC3\u6FC4\u6FC8\u00B8\u00F9\u75C1\u75C2\u75C3\u75C8\u79C2\u00FC\u79C8\u41C5\u61C5\u41C6\u61C6\u41CE\u61CE\u43C2\u63C2\u43C3\u63C3\u43C7\u63C7\u43CF\u63CF\u44CF\u64CF\u00E2\u00F2\u45C5\u65C5\u0000\u0000\u45C7\u65C7\u45CE\u65CE\u45CF\u65CF\u47C3\u67C3\u47C6\u67C6\u47C7\u67C7\u47CB\u67C2\u48C3\u68C3\u00E4\u00F4\u49C4\u69C4\u49C5\u69C5\u0000\u0000\u49CE\u69CE\u49C7\u00F5\u00E6\u00F6\u4AC3\u6AC3\u4BCB\u6BCB\u00F0\u4CC2\u6CC2\u4CCB\u6CCB\u4CCF\u6CCF\u00E7\u00F7\u00E8\u00F8\u4EC2\u6EC2\u4ECB\u6ECB\u4ECF\u6ECF\u00EF\u00EE\u00FE\u4FC5\u6FC5\u0000\u0000\u4FCD\u6FCD\u00EA\u00FA\u52C2\u72C2\u52CB\u72CB\u52CF\u72CF\u53C2\u73C2\u53C3\u73C3\u53CB\u73CB\u53CF\u73CF\u54CB\u74CB\u54CF\u74CF\u00ED\u00FD\u55C4\u75C4\u55C5\u75C5\u55C6\u75C6\u55CA\u75CA\u55CD\u75CD\u55CE\u75CE\u57C3\u77C3\u59C3\u79C3\u59C8\u5AC2\u7AC2\u5AC7\u7AC7\u5ACF\u7ACF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0xA3) return input - 0x20 + 0x20;
			if (input >= 0xA4 && input <= 0x17E) return GETOUTPUT0_A4[input - 0xA4];
			switch (input) {
			case 0x2C6: return 0xC3L;
			case 0x2C7: return 0xCFL;
			case 0x2C9: return 0xC5L;
			case 0x2CA: return 0xC2L;
			case 0x2CB: return 0xC1L;
			case 0x2D8: return 0xC6L;
			case 0x2D9: return 0xC7L;
			case 0x2DA: return 0xCAL;
			case 0x2DB: return 0xCEL;
			case 0x2DC: return 0xC4L;
			case 0x2DD: return 0xCDL;
			case 0x3A9: return 0xE0L;
			case 0x2014: return 0xD0L;
			case 0x2015: return 0xD0L;
			case 0x2018: return 0xA9L;
			case 0x2019: return 0xB9L;
			case 0x201C: return 0xAAL;
			case 0x201D: return 0xBAL;
			case 0x2122: return 0xD4L;
			case 0x2126: return 0xE0L;
			case 0x215B: return 0xDCL;
			case 0x215C: return 0xDDL;
			case 0x215D: return 0xDEL;
			case 0x215E: return 0xDFL;
			case 0x2190: return 0xACL;
			case 0x2191: return 0xADL;
			case 0x2192: return 0xAEL;
			case 0x2193: return 0xAFL;
			case 0x2500: return 0xD0L;
			case 0x266A: return 0xD5L;
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
