package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XZxspectrumLatin1Charset extends Charset {
	public XZxspectrumLatin1Charset() {
		super("x-zxspectrum-latin1", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XZxspectrumLatin1CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XZxspectrumLatin1CharsetEncoder(this);
	}

	private static final class XZxspectrumLatin1CharsetDecoder extends TableCharsetDecoder {
		private XZxspectrumLatin1CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0x80 && input <= 0xFF) return input - 0x80 + 0x80;
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

	private static final class XZxspectrumLatin1CharsetEncoder extends TableCharsetEncoder {
		private XZxspectrumLatin1CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0x80 && input <= 0xA2) return input - 0x80 + 0x80;
			if (input >= 0xAA && input <= 0xFE) return input - 0xAA + 0xAA;
			switch (input) {
			case 0x5F: return 0x5FL;
			case 0xA3: return 0x60L;
			case 0xA4: return 0xA4L;
			case 0xA5: return 0xA5L;
			case 0xA6: return 0xA6L;
			case 0xA7: return 0xA7L;
			case 0xA8: return 0xA8L;
			case 0xA9: return 0x7FL;
			case 0xFF: return 0xFF01L;
			case 0x2191: return 0x5EL;
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
