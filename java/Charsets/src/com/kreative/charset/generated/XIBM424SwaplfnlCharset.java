package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM424SwaplfnlCharset extends Charset {
	public XIBM424SwaplfnlCharset() {
		super("x-IBM424-swaplfnl", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM424SwaplfnlCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM424SwaplfnlCharsetEncoder(this);
	}

	private static final class XIBM424SwaplfnlCharsetDecoder extends TableCharsetDecoder {
		private XIBM424SwaplfnlCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DES[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.C1334129[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM424SwaplfnlCharsetEncoder extends TableCharsetEncoder {
		private XIBM424SwaplfnlCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EEC0S[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.EEC1S[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.C5364326[input - 0x20];
			if (input >= 0xA0 && input <= 0xBE) return CommonSubtables.C1162916[input - 0xA0];
			if (input >= 0x5D0 && input <= 0x5EA) return CommonSubtables.C1415099[input - 0x5D0];
			switch (input) {
			case 0xD7: return 0xBFL;
			case 0xF7: return 0xE1L;
			case 0x2017: return 0x78L;
			case 0x2022: return 0xB3L;
			case 0x203E: return 0xBCL;
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
