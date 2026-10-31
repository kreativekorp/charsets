package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMsxArNondirCharset extends Charset {
	public XMsxArNondirCharset() {
		super("x-msx-ar-nondir", new String[]{"x-msx-ar-eu-nondir"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMsxArNondirCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMsxArNondirCharsetEncoder(this);
	}

	private static final class XMsxArNondirCharsetDecoder extends TableCharsetDecoder {
		private XMsxArNondirCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFE) return CommonSubtables.COMMON1699[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMsxArNondirCharsetEncoder extends TableCharsetEncoder {
		private XMsxArNondirCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xFE70 && input <= 0xFEFB) return CommonSubtables.COMMON1698[input - 0xFE70];
			switch (input) {
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
