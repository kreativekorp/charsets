package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAcornElectronCharset extends Charset {
	public XAcornElectronCharset() {
		super("x-acorn-electron", new String[]{"x-bbc-micro"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAcornElectronCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAcornElectronCharsetEncoder(this);
	}

	private static final class XAcornElectronCharsetDecoder extends TableCharsetDecoder {
		private XAcornElectronCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7F) return input - 0x61 + 0x61;
			if (input >= 0x80 && input <= 0x9F) return input - 0x80 + 0xF0E0;
			if (input >= 0xA0 && input <= 0xBF) return input - 0xA0 + 0xF0E0;
			if (input >= 0xC0 && input <= 0xDF) return input - 0xC0 + 0xF0E0;
			if (input >= 0xE0 && input <= 0xFF) return input - 0xE0 + 0xF0E0;
			switch (input) {
			case 0x60: return 0xA3L;
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

	private static final class XAcornElectronCharsetEncoder extends TableCharsetEncoder {
		private XAcornElectronCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5F) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7F) return input - 0x61 + 0x61;
			if (input >= 0xF0E0 && input <= 0xF0FE) return input - 0xF0E0 + 0xE0;
			switch (input) {
			case 0xA3: return 0x60L;
			case 0xF0FF: return 0xFF01L;
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
