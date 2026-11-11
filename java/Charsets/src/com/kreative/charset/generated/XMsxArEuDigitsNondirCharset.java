package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMsxArEuDigitsNondirCharset extends Charset {
	public XMsxArEuDigitsNondirCharset() {
		super("x-msx-ar-eu-digits-nondir", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMsxArEuDigitsNondirCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMsxArEuDigitsNondirCharsetEncoder(this);
	}

	private static final class XMsxArEuDigitsNondirCharsetDecoder extends TableCharsetDecoder {
		private XMsxArEuDigitsNondirCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DAC0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFE) return CommonSubtables.C5669122[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMsxArEuDigitsNondirCharsetEncoder extends TableCharsetEncoder {
		private XMsxArEuDigitsNondirCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EAC0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xFE70 && input <= 0xFEFB) return CommonSubtables.C7483052[input - 0xFE70];
			switch (input) {
			case 0x60C: return 0x8CL;
			case 0x61B: return 0x9BL;
			case 0x61F: return 0x9FL;
			case 0x640: return 0xF1L;
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
