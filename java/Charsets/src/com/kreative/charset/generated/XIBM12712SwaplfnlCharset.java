package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM12712SwaplfnlCharset extends Charset {
	public XIBM12712SwaplfnlCharset() {
		super("x-IBM12712-swaplfnl", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM12712SwaplfnlCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM12712SwaplfnlCharsetEncoder(this);
	}

	private static final class XIBM12712SwaplfnlCharsetDecoder extends TableCharsetDecoder {
		private XIBM12712SwaplfnlCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DES[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.C6334600[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM12712SwaplfnlCharsetEncoder extends TableCharsetEncoder {
		private XIBM12712SwaplfnlCharsetEncoder(Charset cs) {
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
			case 0x200E: return 0xFDL;
			case 0x200F: return 0xFEL;
			case 0x2017: return 0x78L;
			case 0x202A: return 0xFBL;
			case 0x202B: return 0xFCL;
			case 0x202C: return 0xDDL;
			case 0x202D: return 0xDBL;
			case 0x202E: return 0xDCL;
			case 0x20AA: return 0x9EL;
			case 0x20AC: return 0x9CL;
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
