package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMsxArEuVideoNondirCharset extends Charset {
	public XMsxArEuVideoNondirCharset() {
		super("x-msx-ar-eu-video-nondir", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMsxArEuVideoNondirCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMsxArEuVideoNondirCharsetEncoder(this);
	}

	private static final class XMsxArEuVideoNondirCharsetDecoder extends TableCharsetDecoder {
		private XMsxArEuVideoNondirCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFE) return CommonSubtables.COMMON1699[input - 0x80];
			switch (input) {
			case 0x10: return 0xE9L;
			case 0x11: return 0xE2L;
			case 0x12: return 0xE0L;
			case 0x13: return 0xE7L;
			case 0x14: return 0xEAL;
			case 0x15: return 0xEBL;
			case 0x16: return 0xE8L;
			case 0x17: return 0xEFL;
			case 0x18: return 0xEEL;
			case 0x19: return 0xF4L;
			case 0x1A: return 0xFBL;
			case 0x1B: return 0xF9L;
			case 0x1C: return 0xA7L;
			case 0x1D: return 0xB0L;
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

	private static final class XMsxArEuVideoNondirCharsetEncoder extends TableCharsetEncoder {
		private XMsxArEuVideoNondirCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xFE70 && input <= 0xFEFB) return CommonSubtables.COMMON1698[input - 0xFE70];
			switch (input) {
			case 0xA7: return 0x1CL;
			case 0xB0: return 0x1DL;
			case 0xE0: return 0x12L;
			case 0xE2: return 0x11L;
			case 0xE7: return 0x13L;
			case 0xE8: return 0x16L;
			case 0xE9: return 0x10L;
			case 0xEA: return 0x14L;
			case 0xEB: return 0x15L;
			case 0xEE: return 0x18L;
			case 0xEF: return 0x17L;
			case 0xF4: return 0x19L;
			case 0xF9: return 0x1BL;
			case 0xFB: return 0x1AL;
			case 0x60C: return 0x8CL;
			case 0x61B: return 0x9BL;
			case 0x61F: return 0x9FL;
			case 0x640: return 0xF1L;
			case 0x660: return 0x90L;
			case 0x661: return 0x91L;
			case 0x662: return 0x92L;
			case 0x663: return 0x93L;
			case 0x664: return 0x94L;
			case 0x665: return 0x95L;
			case 0x666: return 0x96L;
			case 0x667: return 0x97L;
			case 0x668: return 0x98L;
			case 0x669: return 0x99L;
			case 0x66A: return 0x85L;
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
