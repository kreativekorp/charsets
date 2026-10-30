package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEts300706G2ArCharset extends Charset {
	public XEts300706G2ArCharset() {
		super("x-ets-300-706-g2-ar", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEts300706G2ArCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEts300706G2ArCharsetEncoder(this);
	}

	private static final class XEts300706G2ArCharsetDecoder extends TableCharsetDecoder {
		private XEts300706G2ArCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_20 = getOutput0_20();
		private static final char[] getOutput0_20() {
			return " \uFEC9\uFE81\uFE83\uFE85\uFE87\uFE8B\uFE8A\uFB7C\uFB7D\uFB7A\uFB58\uFB59\uFB56\uFB8A\uFB92\u0660\u0661\u0662\u0663\u0664\u0665\u0666\u0667\u0668\u0669\uFECE\uFECD\uFEFC\uFEEC\uFEEA\uFEE9\u00E0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x80;
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x20 && input <= 0x40) return GETOUTPUT0_20[input - 0x20];
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x5B: return 0xEBL;
			case 0x5C: return 0xEAL;
			case 0x5D: return 0xF9L;
			case 0x5E: return 0xEEL;
			case 0x5F: return 0xFECAL;
			case 0x60: return 0xE9L;
			case 0x7B: return 0xE2L;
			case 0x7C: return 0xF4L;
			case 0x7D: return 0xFBL;
			case 0x7E: return 0xE7L;
			case 0x7F: return 0x25A0L;
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

	private static final class XEts300706G2ArCharsetEncoder extends TableCharsetEncoder {
		private XEts300706G2ArCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{88}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x41;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x80];
			switch (input) {
			case 0x20: return 0x20L;
			case 0xE0: return 0x40L;
			case 0xE2: return 0x7BL;
			case 0xE7: return 0x7EL;
			case 0xE9: return 0x60L;
			case 0xEA: return 0x5CL;
			case 0xEB: return 0x5BL;
			case 0xEE: return 0x5EL;
			case 0xF4: return 0x7CL;
			case 0xF9: return 0x5DL;
			case 0xFB: return 0x7DL;
			case 0x660: return 0x30L;
			case 0x661: return 0x31L;
			case 0x662: return 0x32L;
			case 0x663: return 0x33L;
			case 0x664: return 0x34L;
			case 0x665: return 0x35L;
			case 0x666: return 0x36L;
			case 0x667: return 0x37L;
			case 0x668: return 0x38L;
			case 0x669: return 0x39L;
			case 0x25A0: return 0x7FL;
			case 0xFB56: return 0x2DL;
			case 0xFB57: return 0x2DL;
			case 0xFB58: return 0x2BL;
			case 0xFB59: return 0x2CL;
			case 0xFB7A: return 0x2AL;
			case 0xFB7B: return 0x2AL;
			case 0xFB7C: return 0x28L;
			case 0xFB7D: return 0x29L;
			case 0xFB8A: return 0x2EL;
			case 0xFB8B: return 0x2EL;
			case 0xFB92: return 0x2FL;
			case 0xFB93: return 0x2FL;
			case 0xFB94: return 0x2FL;
			case 0xFB95: return 0x2FL;
			case 0xFE81: return 0x22L;
			case 0xFE83: return 0x23L;
			case 0xFE85: return 0x24L;
			case 0xFE86: return 0x24L;
			case 0xFE87: return 0x25L;
			case 0xFE8A: return 0x27L;
			case 0xFE8B: return 0x26L;
			case 0xFEC9: return 0x21L;
			case 0xFECA: return 0x5FL;
			case 0xFECD: return 0x3BL;
			case 0xFECE: return 0x3AL;
			case 0xFEE9: return 0x3FL;
			case 0xFEEA: return 0x3EL;
			case 0xFEEC: return 0x3DL;
			case 0xFEFC: return 0x3CL;
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
