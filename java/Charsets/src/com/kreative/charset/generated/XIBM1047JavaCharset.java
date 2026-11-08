package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1047JavaCharset extends Charset {
	public XIBM1047JavaCharset() {
		super("x-IBM1047-java", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1047JavaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1047JavaCharsetEncoder(this);
	}

	private static final class XIBM1047JavaCharsetDecoder extends TableCharsetDecoder {
		private XIBM1047JavaCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_SWAPLFNL[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON11[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM1047JavaCharsetEncoder extends TableCharsetEncoder {
		private XIBM1047JavaCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_SWAPLFNL[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1_SWAPLFNL[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON12[input - 0x20];
			if (input >= 0xA0 && input <= 0xFF) return CommonSubtables.COMMON13[input - 0xA0];
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
