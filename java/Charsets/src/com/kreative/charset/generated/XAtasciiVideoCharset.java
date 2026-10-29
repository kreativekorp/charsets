package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAtasciiVideoCharset extends Charset {
	public XAtasciiVideoCharset() {
		super("x-atascii-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAtasciiVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAtasciiVideoCharsetEncoder(this);
	}

	private static final class XAtasciiVideoCharsetDecoder extends TableCharsetDecoder {
		private XAtasciiVideoCharsetDecoder(Charset cs) {
			super(cs, 1.00781f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return input - 0x0 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			if (input >= 0x40 && input <= 0x60) return CommonSubtables.COMMON1214[input - 0x40];
			if (input >= 0x80 && input <= 0xBF) return input - 0x80 + 0x20;
			if (input >= 0xE1 && input <= 0xFA) return input - 0xE1 + 0x61;
			if (input >= 0xC0 && input <= 0xE0) return CommonSubtables.COMMON1214[input - 0xC0];
			switch (input) {
			case 0x7B: return 0x2660L;
			case 0x7C: return 0x2502L;
			case 0x7D: return 0xDCB0D83EL;
			case 0x7E: return 0x25C0L;
			case 0x7F: return 0x25B6L;
			case 0xFB: return 0x2660L;
			case 0xFC: return 0x2502L;
			case 0xFD: return 0xDCB0D83EL;
			case 0xFE: return 0x25C0L;
			case 0xFF: return 0x25B6L;
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

	private static final class XAtasciiVideoCharsetEncoder extends TableCharsetEncoder {
		private XAtasciiVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{31}, 2);
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
			if (input >= 0x20 && input <= 0x3F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x20];
			if (input >= 0x40 && input <= 0x5F) return input - 0x40 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x61;
			switch (input) {
			case 0x7C: return 0x7CL;
			case 0x2022: return 0x54L;
			case 0x2190: return 0x5EL;
			case 0x2191: return 0x5CL;
			case 0x2192: return 0x5FL;
			case 0x2193: return 0x5DL;
			case 0x23B8: return 0x56L;
			case 0x23B9: return 0x42L;
			case 0x23BA: return 0x4DL;
			case 0x23BD: return 0x4EL;
			case 0x241B: return 0x5BL;
			case 0x2500: return 0x52L;
			case 0x2502: return 0x7CL;
			case 0x250C: return 0x51L;
			case 0x2510: return 0x45L;
			case 0x2514: return 0x5AL;
			case 0x2518: return 0x43L;
			case 0x251C: return 0x41L;
			case 0x2524: return 0x44L;
			case 0x252C: return 0x57L;
			case 0x2534: return 0x58L;
			case 0x253C: return 0x53L;
			case 0x2571: return 0x46L;
			case 0x2572: return 0x47L;
			case 0x2581: return 0x4EL;
			case 0x2582: return 0x4EL;
			case 0x2584: return 0x55L;
			case 0x258C: return 0x59L;
			case 0x258E: return 0x56L;
			case 0x258F: return 0x56L;
			case 0x2594: return 0x4DL;
			case 0x2595: return 0x42L;
			case 0x2596: return 0x4FL;
			case 0x2597: return 0x49L;
			case 0x2598: return 0x4CL;
			case 0x259D: return 0x4BL;
			case 0x25B6: return 0x7FL;
			case 0x25C0: return 0x7EL;
			case 0x25CF: return 0x54L;
			case 0x25E2: return 0x48L;
			case 0x25E3: return 0x4AL;
			case 0x2660: return 0x7BL;
			case 0x2663: return 0x50L;
			case 0x2665: return 0x40L;
			case 0x2666: return 0x60L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDCB0: return 0x7DL;
			case 0xDF82: return 0x4DL;
			case 0xDF87: return 0x42L;
			}
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
