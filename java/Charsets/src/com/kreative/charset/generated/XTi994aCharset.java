package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTi994aCharset extends Charset {
	public XTi994aCharset() {
		super("x-ti994a", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTi994aCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTi994aCharsetEncoder(this);
	}

	private static final class XTi994aCharsetDecoder extends TableCharsetDecoder {
		private XTi994aCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x1 && input <= 0x1D) return input - 0x1 + 0x1;
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x7F && input <= 0x9F) return input - 0x7F + 0xF07F;
			switch (input) {
			case 0x0: return 0xFFFEL;
			case 0x1E: return 0x25A0L;
			case 0x1F: return 0xA0L;
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

	private static final class XTi994aCharsetEncoder extends TableCharsetEncoder {
		private XTi994aCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xF07F && input <= 0xF09F) return input - 0xF07F + 0x7F;
			switch (input) {
			case 0xA0: return 0x1FL;
			case 0x2018: return 0x60L;
			case 0x2019: return 0x27L;
			case 0x2588: return 0x1EL;
			case 0x25A0: return 0x1EL;
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
