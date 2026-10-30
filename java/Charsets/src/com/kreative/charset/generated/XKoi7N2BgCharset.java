package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKoi7N2BgCharset extends Charset {
	public XKoi7N2BgCharset() {
		super("x-koi7-n2-bg", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKoi7N2BgCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKoi7N2BgCharsetEncoder(this);
	}

	private static final class XKoi7N2BgCharsetDecoder extends TableCharsetDecoder {
		private XKoi7N2BgCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7F) return CommonSubtables.COMMON1574[input - 0x60];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKoi7N2BgCharsetEncoder extends TableCharsetEncoder {
		private XKoi7N2BgCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_410 = getOutput0_410();
		private static final char[] getOutput0_410() {
			return "abwgdevzijklmnoprstufhc~{}y\u0000x|`qabwgdevzijklmnoprstufhc~{}y\u0000x|`q".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x41;
			if (input >= 0x410 && input <= 0x44F) return GETOUTPUT0_410[input - 0x410];
			switch (input) {
			case 0x7F: return 0x7FL;
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
