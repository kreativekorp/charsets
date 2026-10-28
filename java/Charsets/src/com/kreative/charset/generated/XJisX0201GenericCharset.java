package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XJisX0201GenericCharset extends Charset {
	public XJisX0201GenericCharset() {
		super("x-jis-x-0201-generic", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XJisX0201GenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XJisX0201GenericCharsetEncoder(this);
	}

	private static final class XJisX0201GenericCharsetDecoder extends TableCharsetDecoder {
		private XJisX0201GenericCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7D) return input - 0x5D + 0x5D;
			if (input >= 0xA1 && input <= 0xDF) return input - 0xA1 + 0xFF61;
			switch (input) {
			case 0x5C: return 0xA5L;
			case 0x7E: return 0x203EL;
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

	private static final class XJisX0201GenericCharsetEncoder extends TableCharsetEncoder {
		private XJisX0201GenericCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xFF61 && input <= 0xFF9F) return input - 0xFF61 + 0xA1;
			switch (input) {
			case 0xA5: return 0x5CL;
			case 0x203E: return 0x7EL;
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
