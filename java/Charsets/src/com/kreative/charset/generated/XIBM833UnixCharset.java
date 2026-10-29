package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM833UnixCharset extends Charset {
	public XIBM833UnixCharset() {
		super("x-IBM833-unix", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM833UnixCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM833UnixCharsetEncoder(this);
	}

	private static final class XIBM833UnixCharsetDecoder extends TableCharsetDecoder {
		private XIBM833UnixCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DECODE_EBCDIC_UNIX[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.COMMON272[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM833UnixCharsetEncoder extends TableCharsetEncoder {
		private XIBM833UnixCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_UNIX[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_EBCDIC_C1[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.COMMON273[input - 0x20];
			if (input >= 0xFF01 && input <= 0xFF5E) return CommonSubtables.COMMON274[input - 0xFF01];
			if (input >= 0xFFA0 && input <= 0xFFDC) return CommonSubtables.COMMON275[input - 0xFFA0];
			switch (input) {
			case 0xA2: return 0x4AL;
			case 0xA6: return 0x6AL;
			case 0xAC: return 0x5FL;
			case 0x203E: return 0xA0L;
			case 0x20A9: return 0xE0L;
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
