package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKkSuperromanC0Charset extends Charset {
	public XKkSuperromanC0Charset() {
		super("x-kk-superroman-c0", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKkSuperromanC0CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKkSuperromanC0CharsetEncoder(this);
	}

	private static final class XKkSuperromanC0CharsetDecoder extends TableCharsetDecoder {
		private XKkSuperromanC0CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFF) return CommonSubtables.COMMON1184[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKkSuperromanC0CharsetEncoder extends TableCharsetEncoder {
		private XKkSuperromanC0CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return CommonSubtables.COMMON1185[input - 0xA0];
			if (input >= 0x2013 && input <= 0x2044) return CommonSubtables.COMMON1183[input - 0x2013];
			switch (input) {
			case 0x131: return 0xF5L;
			case 0x152: return 0xCEL;
			case 0x153: return 0xCFL;
			case 0x178: return 0xD9L;
			case 0x192: return 0xC4L;
			case 0x2C6: return 0xF6L;
			case 0x2C7: return 0xFF01L;
			case 0x2D8: return 0xF9L;
			case 0x2D9: return 0xFAL;
			case 0x2DA: return 0xFBL;
			case 0x2DB: return 0xFEL;
			case 0x2DC: return 0xF7L;
			case 0x2DD: return 0xFDL;
			case 0x3A9: return 0xBDL;
			case 0x3C0: return 0xB9L;
			case 0x20AC: return 0xDBL;
			case 0x2122: return 0xAAL;
			case 0x2202: return 0xB6L;
			case 0x2206: return 0xC6L;
			case 0x220F: return 0xB8L;
			case 0x2211: return 0xB7L;
			case 0x221A: return 0xC3L;
			case 0x221E: return 0xB0L;
			case 0x222B: return 0xBAL;
			case 0x2248: return 0xC5L;
			case 0x2260: return 0xADL;
			case 0x2264: return 0xB2L;
			case 0x2265: return 0xB3L;
			case 0x25CA: return 0xD7L;
			case 0xF8FF: return 0xF0L;
			case 0xFB01: return 0xDEL;
			case 0xFB02: return 0xDFL;
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
