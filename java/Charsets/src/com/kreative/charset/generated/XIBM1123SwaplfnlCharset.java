package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1123SwaplfnlCharset extends Charset {
	public XIBM1123SwaplfnlCharset() {
		super("x-IBM1123-swaplfnl", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1123SwaplfnlCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1123SwaplfnlCharsetEncoder(this);
	}

	private static final class XIBM1123SwaplfnlCharsetDecoder extends TableCharsetDecoder {
		private XIBM1123SwaplfnlCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DES[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.C2369497[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM1123SwaplfnlCharsetEncoder extends TableCharsetEncoder {
		private XIBM1123SwaplfnlCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EEC0S[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.EEC1S[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.C2688161[input - 0x20];
			if (input >= 0x401 && input <= 0x45F) return CommonSubtables.C4859877[input - 0x401];
			switch (input) {
			case 0xA0: return 0x41L;
			case 0xA7: return 0xE1L;
			case 0xAD: return 0x73L;
			case 0x490: return 0x62L;
			case 0x491: return 0x43L;
			case 0x2116: return 0x58L;
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
