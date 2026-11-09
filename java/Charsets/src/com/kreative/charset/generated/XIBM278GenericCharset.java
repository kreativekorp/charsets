package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM278GenericCharset extends Charset {
	public XIBM278GenericCharset() {
		super("x-IBM278-generic", new String[]{"x-IBM278"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM278GenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM278GenericCharsetEncoder(this);
	}

	private static final class XIBM278GenericCharsetDecoder extends TableCharsetDecoder {
		private XIBM278GenericCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DEG[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.C4557885[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM278GenericCharsetEncoder extends TableCharsetEncoder {
		private XIBM278GenericCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EEC0G[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.EEC1G[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.C5121426[input - 0x20];
			if (input >= 0xA0 && input <= 0xFF) return CommonSubtables.C7660561[input - 0xA0];
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
