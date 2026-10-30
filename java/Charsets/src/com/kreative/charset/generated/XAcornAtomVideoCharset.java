package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAcornAtomVideoCharset extends Charset {
	public XAcornAtomVideoCharset() {
		super("x-acorn-atom-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAcornAtomVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAcornAtomVideoCharsetEncoder(this);
	}

	private static final class XAcornAtomVideoCharsetDecoder extends TableCharsetDecoder {
		private XAcornAtomVideoCharsetDecoder(Charset cs) {
			super(cs, 1.46875f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1D) return input - 0x0 + 0x40;
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0x9D) return input - 0x80 + 0x40;
			if (input >= 0x40 && input <= 0x7F) return CommonSubtables.COMMON1208[input - 0x40];
			if (input >= 0xA0 && input <= 0xBF) return input - 0xA0 + 0x20;
			if (input >= 0xC0 && input <= 0xFF) return CommonSubtables.COMMON1208[input - 0xC0];
			switch (input) {
			case 0x1E: return 0x2191L;
			case 0x1F: return 0x2190L;
			case 0x9E: return 0x2191L;
			case 0x9F: return 0x2190L;
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

	private static final class XAcornAtomVideoCharsetEncoder extends TableCharsetEncoder {
		private XAcornAtomVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83E: return 0x1;
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
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x48 && input <= 0x5D) return input - 0x48 + 0x8;
			if (input >= 0x68 && input <= 0x7A) return input - 0x68 + 0x8;
			switch (input) {
			case 0x40: return 0x1L;
			case 0x41: return 0x101L;
			case 0x42: return 0x201L;
			case 0x43: return 0x301L;
			case 0x44: return 0x401L;
			case 0x45: return 0x501L;
			case 0x46: return 0x601L;
			case 0x47: return 0x701L;
			case 0x61: return 0x101L;
			case 0x62: return 0x201L;
			case 0x63: return 0x301L;
			case 0x64: return 0x401L;
			case 0x65: return 0x501L;
			case 0x66: return 0x601L;
			case 0x67: return 0x701L;
			case 0xA0: return 0x40L;
			case 0x2190: return 0x1FL;
			case 0x2191: return 0x1EL;
			case 0x2588: return 0x7FL;
			case 0x258C: return 0x6AL;
			case 0x2590: return 0x55L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DF00 = getOutput1_DF00();
		private static final char[] getOutput1_DF00() {
			return "`PpHhXxDdTtLl\\|BbRrJZzFfVvNn^~AaQqIiYyEeuMm]}CcSsKk[{GgWwOo_".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xDF00 && input <= 0xDF3B) return GETOUTPUT1_DF00[input - 0xDF00];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			default: return 0;
			}
		}
	}
}
