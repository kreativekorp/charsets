package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMsxArVideoNondirCharset extends Charset {
	public XMsxArVideoNondirCharset() {
		super("x-msx-ar-video-nondir", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMsxArVideoNondirCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMsxArVideoNondirCharsetEncoder(this);
	}

	private static final class XMsxArVideoNondirCharsetDecoder extends TableCharsetDecoder {
		private XMsxArVideoNondirCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFE) return CommonSubtables.COMMON1699[input - 0x80];
			switch (input) {
			case 0x10: return 0x3C0L;
			case 0x11: return 0x2534L;
			case 0x12: return 0x252CL;
			case 0x13: return 0x2524L;
			case 0x14: return 0x251CL;
			case 0x15: return 0x253CL;
			case 0x16: return 0x2502L;
			case 0x17: return 0x2500L;
			case 0x18: return 0x250CL;
			case 0x19: return 0x2510L;
			case 0x1A: return 0x2514L;
			case 0x1B: return 0x2518L;
			case 0x1C: return 0x2573L;
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

	private static final class XMsxArVideoNondirCharsetEncoder extends TableCharsetEncoder {
		private XMsxArVideoNondirCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xFE70 && input <= 0xFEFB) return CommonSubtables.COMMON1698[input - 0xFE70];
			switch (input) {
			case 0x3C0: return 0x10L;
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
			case 0x2500: return 0x17L;
			case 0x2502: return 0x16L;
			case 0x250C: return 0x18L;
			case 0x2510: return 0x19L;
			case 0x2514: return 0x1AL;
			case 0x2518: return 0x1BL;
			case 0x251C: return 0x14L;
			case 0x2524: return 0x13L;
			case 0x252C: return 0x12L;
			case 0x2534: return 0x11L;
			case 0x253C: return 0x15L;
			case 0x2573: return 0x1CL;
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
