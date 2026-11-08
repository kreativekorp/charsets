package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM875SwaplfnlCharset extends Charset {
	public XIBM875SwaplfnlCharset() {
		super("x-IBM875-swaplfnl", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM875SwaplfnlCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM875SwaplfnlCharsetEncoder(this);
	}

	private static final class XIBM875SwaplfnlCharsetDecoder extends TableCharsetDecoder {
		private XIBM875SwaplfnlCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_SWAPLFNL[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON286[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM875SwaplfnlCharsetEncoder extends TableCharsetEncoder {
		private XIBM875SwaplfnlCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_SWAPLFNL[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1_SWAPLFNL[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON6[input - 0x20];
			if (input >= 0xA0 && input <= 0xBD) return CommonSubtables.COMMON268[input - 0xA0];
			if (input >= 0x385 && input <= 0x3CE) return CommonSubtables.COMMON269[input - 0x385];
			switch (input) {
			case 0x2015: return 0xCFL;
			case 0x2018: return 0xCEL;
			case 0x2019: return 0xDEL;
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
