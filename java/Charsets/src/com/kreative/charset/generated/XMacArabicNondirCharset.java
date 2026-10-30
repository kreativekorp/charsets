package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacArabicNondirCharset extends Charset {
	public XMacArabicNondirCharset() {
		super("x-MacArabic-nondir", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacArabicNondirCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacArabicNondirCharsetEncoder(this);
	}

	private static final class XMacArabicNondirCharsetDecoder extends TableCharsetDecoder {
		private XMacArabicNondirCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C4\u00A0\u00C7\u00C9\u00D1\u00D6\u00DC\u00E1\u00E0\u00E2\u00E4\u06BA\u00AB\u00E7\u00E9\u00E8\u00EA\u00EB\u00ED\u2026\u00EE\u00EF\u00F1\u00F3\u00BB\u00F4\u00F6\u00F7\u00FA\u00F9\u00FB\u00FC !\"#$\u066A&\'()*+\u060C-./\u0660\u0661\u0662\u0663\u0664\u0665\u0666\u0667\u0668\u0669:\u061B<=>\u061F\u274A".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xC1 && input <= 0xDA) return input - 0xC1 + 0x621;
			if (input >= 0x80 && input <= 0xC0) return GETOUTPUT0_80[input - 0x80];
			if (input >= 0xE0 && input <= 0xF2) return input - 0xE0 + 0x640;
			switch (input) {
			case 0xDB: return 0x5BL;
			case 0xDC: return 0x5CL;
			case 0xDD: return 0x5DL;
			case 0xDE: return 0x5EL;
			case 0xDF: return 0x5FL;
			case 0xF3: return 0x67EL;
			case 0xF4: return 0x679L;
			case 0xF5: return 0x686L;
			case 0xF6: return 0x6D5L;
			case 0xF7: return 0x6A4L;
			case 0xF8: return 0x6AFL;
			case 0xF9: return 0x688L;
			case 0xFA: return 0x691L;
			case 0xFB: return 0x7BL;
			case 0xFC: return 0x7CL;
			case 0xFD: return 0x7DL;
			case 0xFE: return 0x698L;
			case 0xFF: return 0x6D2L;
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

	private static final class XMacArabicNondirCharsetEncoder extends TableCharsetEncoder {
		private XMacArabicNondirCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFC) return CommonSubtables.COMMON1104[input - 0xA0];
			if (input >= 0x621 && input <= 0x63A) return input - 0x621 + 0xC1;
			if (input >= 0x640 && input <= 0x652) return input - 0x640 + 0xE0;
			if (input >= 0x660 && input <= 0x6BA) return CommonSubtables.COMMON1105[input - 0x660];
			switch (input) {
			case 0x60C: return 0xACL;
			case 0x61B: return 0xBBL;
			case 0x61F: return 0xBFL;
			case 0x6D2: return 0xFF01L;
			case 0x6D5: return 0xF6L;
			case 0x2026: return 0x93L;
			case 0x274A: return 0xC0L;
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
