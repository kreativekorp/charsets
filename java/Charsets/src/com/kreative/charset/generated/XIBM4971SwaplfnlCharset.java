package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM4971SwaplfnlCharset extends Charset {
	public XIBM4971SwaplfnlCharset() {
		super("x-IBM4971-swaplfnl", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM4971SwaplfnlCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM4971SwaplfnlCharsetEncoder(this);
	}

	private static final class XIBM4971SwaplfnlCharsetDecoder extends TableCharsetDecoder {
		private XIBM4971SwaplfnlCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DES[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.C716530[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM4971SwaplfnlCharsetEncoder extends TableCharsetEncoder {
		private XIBM4971SwaplfnlCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EEC0S[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.EEC1S[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.C2688161[input - 0x20];
			if (input >= 0xA0 && input <= 0xBD) return CommonSubtables.C8084133[input - 0xA0];
			if (input >= 0x385 && input <= 0x3CE) return CommonSubtables.C1200216[input - 0x385];
			switch (input) {
			case 0x2015: return 0xCFL;
			case 0x2018: return 0xCEL;
			case 0x2019: return 0xDEL;
			case 0x20AC: return 0xFCL;
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
