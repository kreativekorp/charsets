package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XZxspectrumPuaCharset extends Charset {
	public XZxspectrumPuaCharset() {
		super("x-zxspectrum-pua", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XZxspectrumPuaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XZxspectrumPuaCharsetEncoder(this);
	}

	private static final class XZxspectrumPuaCharsetDecoder extends TableCharsetDecoder {
		private XZxspectrumPuaCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0x80 && input <= 0xFF) return input - 0x80 + 0xF080;
			switch (input) {
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x5FL;
			case 0x60: return 0xA3L;
			case 0x7F: return 0xA9L;
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

	private static final class XZxspectrumPuaCharsetEncoder extends TableCharsetEncoder {
		private XZxspectrumPuaCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0xF080 && input <= 0xF0FE) return input - 0xF080 + 0x80;
			switch (input) {
			case 0x5F: return 0x5FL;
			case 0xA3: return 0x60L;
			case 0xA9: return 0x7FL;
			case 0x2191: return 0x5EL;
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
