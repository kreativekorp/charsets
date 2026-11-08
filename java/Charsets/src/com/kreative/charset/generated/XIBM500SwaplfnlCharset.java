package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM500SwaplfnlCharset extends Charset {
	public XIBM500SwaplfnlCharset() {
		super("x-IBM500-swaplfnl", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM500SwaplfnlCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM500SwaplfnlCharsetEncoder(this);
	}

	private static final class XIBM500SwaplfnlCharsetDecoder extends TableCharsetDecoder {
		private XIBM500SwaplfnlCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_SWAPLFNL[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON270[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM500SwaplfnlCharsetEncoder extends TableCharsetEncoder {
		private XIBM500SwaplfnlCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_SWAPLFNL[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1_SWAPLFNL[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON47[input - 0x20];
			if (input >= 0xA0 && input <= 0xFF) return CommonSubtables.COMMON271[input - 0xA0];
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
