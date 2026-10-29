package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKoi7N2Charset extends Charset {
	public XKoi7N2Charset() {
		super("x-koi7-n2", new String[]{"x-koi7"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKoi7N2CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKoi7N2CharsetEncoder(this);
	}

	private static final class XKoi7N2CharsetDecoder extends TableCharsetDecoder {
		private XKoi7N2CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_60 = getOutput0_60();
		private static final char[] getOutput0_60() {
			return "\u042E\u0410\u0411\u0426\u0414\u0415\u0424\u0413\u0425\u0418\u0419\u041A\u041B\u041C\u041D\u041E\u041F\u042F\u0420\u0421\u0422\u0423\u0416\u0412\u042C\u042B\u0417\u0428\u042D\u0429\u0427\u007F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7F) return GETOUTPUT0_60[input - 0x60];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKoi7N2CharsetEncoder extends TableCharsetEncoder {
		private XKoi7N2CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_410 = getOutput0_410();
		private static final char[] getOutput0_410() {
			return "abwgdevzijklmnoprstufhc~{}\u0000yx|`qabwgdevzijklmnoprstufhc~{}\u0000yx|`q".toCharArray();
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
