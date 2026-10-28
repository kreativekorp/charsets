package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XOricsciiAltVideoCharset extends Charset {
	public XOricsciiAltVideoCharset() {
		super("x-oricscii-alt-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XOricsciiAltVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XOricsciiAltVideoCharsetEncoder(this);
	}

	private static final class XOricsciiAltVideoCharsetDecoder extends TableCharsetDecoder {
		private XOricsciiAltVideoCharsetDecoder(Charset cs) {
			super(cs, 1.46875f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x20) return input - 0x0 + 0x80;
			if (input >= 0x60 && input <= 0x7F) return input - 0x60 + 0xF060;
			if (input >= 0x21 && input <= 0x5F) return CommonSubtables.COMMON1693[input - 0x21];
			if (input >= 0x80 && input <= 0xA0) return input - 0x80 + 0x80;
			if (input >= 0xE0 && input <= 0xFF) return input - 0xE0 + 0xF060;
			if (input >= 0xA1 && input <= 0xDF) return CommonSubtables.COMMON1693[input - 0xA1];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XOricsciiAltVideoCharsetEncoder extends TableCharsetEncoder {
		private XOricsciiAltVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{-1}, 2);
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
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x80];
			if (input >= 0xF060 && input <= 0xF07F) return input - 0xF060 + 0x60;
			switch (input) {
			case 0xA0: return 0x20L;
			case 0x2588: return 0x5FL;
			case 0x258C: return 0x35L;
			case 0x2590: return 0x4AL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDF00 && input <= 0xDF13) return input - 0xDF00 + 0x21;
			if (input >= 0xDF14 && input <= 0xDF27) return input - 0xDF14 + 0x36;
			if (input >= 0xDF28 && input <= 0xDF3B) return input - 0xDF28 + 0x4B;
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
