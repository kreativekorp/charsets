package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEts300706G0HeCharset extends Charset {
	public XEts300706G0HeCharset() {
		super("x-ets-300-706-g0-he", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEts300706G0HeCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEts300706G0HeCharsetEncoder(this);
	}

	private static final class XEts300706G0HeCharsetDecoder extends TableCharsetDecoder {
		private XEts300706G0HeCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x80;
			if (input >= 0x24 && input <= 0x5A) return input - 0x24 + 0x24;
			if (input >= 0x60 && input <= 0x7A) return input - 0x60 + 0x5D0;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0xA3L;
			case 0x5B: return 0x2190L;
			case 0x5C: return 0xBDL;
			case 0x5D: return 0x2192L;
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x23L;
			case 0x7B: return 0x20AAL;
			case 0x7C: return 0x2016L;
			case 0x7D: return 0xBEL;
			case 0x7E: return 0xF7L;
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

	private static final class XEts300706G0HeCharsetEncoder extends TableCharsetEncoder {
		private XEts300706G0HeCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x24 && input <= 0x5A) return input - 0x24 + 0x24;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x80];
			if (input >= 0x5D0 && input <= 0x5EA) return input - 0x5D0 + 0x60;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x5FL;
			case 0xA3: return 0x23L;
			case 0xBD: return 0x5CL;
			case 0xBE: return 0x7DL;
			case 0xF7: return 0x7EL;
			case 0x2016: return 0x7CL;
			case 0x20AA: return 0x7BL;
			case 0x2190: return 0x5BL;
			case 0x2191: return 0x5EL;
			case 0x2192: return 0x5DL;
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
