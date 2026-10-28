package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XColecoAdamSwCharset extends Charset {
	public XColecoAdamSwCharset() {
		super("x-coleco-adam-sw", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XColecoAdamSwCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XColecoAdamSwCharsetEncoder(this);
	}

	private static final class XColecoAdamSwCharsetDecoder extends TableCharsetDecoder {
		private XColecoAdamSwCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7B) return input - 0x20 + 0x20;
			switch (input) {
			case 0x7C: return 0xA6L;
			case 0x7D: return 0x7DL;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x2428L;
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

	private static final class XColecoAdamSwCharsetEncoder extends TableCharsetEncoder {
		private XColecoAdamSwCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7B) return input - 0x20 + 0x20;
			switch (input) {
			case 0x7D: return 0x7DL;
			case 0x7E: return 0x7EL;
			case 0xA6: return 0x7CL;
			case 0x2428: return 0x7FL;
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
