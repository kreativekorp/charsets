package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEts300706G0ElCharset extends Charset {
	public XEts300706G0ElCharset() {
		super("x-ets-300-706-g0-el", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEts300706G0ElCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEts300706G0ElCharsetEncoder(this);
	}

	private static final class XEts300706G0ElCharsetDecoder extends TableCharsetDecoder {
		private XEts300706G0ElCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x80;
			if (input >= 0x20 && input <= 0x3B) return input - 0x20 + 0x20;
			if (input >= 0x40 && input <= 0x51) return input - 0x40 + 0x390;
			if (input >= 0x53 && input <= 0x7E) return input - 0x53 + 0x3A3;
			switch (input) {
			case 0x3C: return 0xABL;
			case 0x3D: return 0x3DL;
			case 0x3E: return 0xBBL;
			case 0x3F: return 0x3FL;
			case 0x52: return 0x384L;
			case 0x7F: return 0x25A0L;
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

	private static final class XEts300706G0ElCharsetEncoder extends TableCharsetEncoder {
		private XEts300706G0ElCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x3B) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x80];
			if (input >= 0x390 && input <= 0x3A1) return input - 0x390 + 0x40;
			if (input >= 0x3A3 && input <= 0x3CE) return input - 0x3A3 + 0x53;
			switch (input) {
			case 0x3D: return 0x3DL;
			case 0x3F: return 0x3FL;
			case 0xAB: return 0x3CL;
			case 0xBB: return 0x3EL;
			case 0x384: return 0x52L;
			case 0x25A0: return 0x7FL;
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
