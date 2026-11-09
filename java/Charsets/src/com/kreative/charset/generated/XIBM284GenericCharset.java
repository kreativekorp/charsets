package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM284GenericCharset extends Charset {
	public XIBM284GenericCharset() {
		super("x-IBM284-generic", new String[]{"x-IBM284"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM284GenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM284GenericCharsetEncoder(this);
	}

	private static final class XIBM284GenericCharsetDecoder extends TableCharsetDecoder {
		private XIBM284GenericCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DEG[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.C1178352[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM284GenericCharsetEncoder extends TableCharsetEncoder {
		private XIBM284GenericCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EEC0G[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.EEC1G[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.C242488[input - 0x20];
			if (input >= 0xA0 && input <= 0xFF) return CommonSubtables.C4006303[input - 0xA0];
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
