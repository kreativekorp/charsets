package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1143UnixCharset extends Charset {
	public XIBM1143UnixCharset() {
		super("x-IBM1143-unix", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1143UnixCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1143UnixCharsetEncoder(this);
	}

	private static final class XIBM1143UnixCharsetDecoder extends TableCharsetDecoder {
		private XIBM1143UnixCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DEU[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.C8308860[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM1143UnixCharsetEncoder extends TableCharsetEncoder {
		private XIBM1143UnixCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EEC0S[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.EEC1G[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.C5121426[input - 0x20];
			if (input >= 0xA0 && input <= 0xFF) return CommonSubtables.C3871636[input - 0xA0];
			switch (input) {
			case 0x20AC: return 0x5AL;
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
