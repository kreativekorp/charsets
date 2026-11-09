package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM9067GenericCharset extends Charset {
	public XIBM9067GenericCharset() {
		super("x-IBM9067-generic", new String[]{"x-IBM9067"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM9067GenericCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM9067GenericCharsetEncoder(this);
	}

	private static final class XIBM9067GenericCharsetDecoder extends TableCharsetDecoder {
		private XIBM9067GenericCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return CommonSubtables.DEG[input - 0x0];
			if (input >= 0x40 && input <= 0xFF) return CommonSubtables.C1890088[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM9067GenericCharsetEncoder extends TableCharsetEncoder {
		private XIBM9067GenericCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.EEC0G[input - 0x0];
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.EEC1G[input - 0x80];
			if (input >= 0x20 && input <= 0x7F) return CommonSubtables.C2688161[input - 0x20];
			if (input >= 0xA0 && input <= 0xBD) return CommonSubtables.C8084133[input - 0xA0];
			if (input >= 0x37A && input <= 0x3CE) return CommonSubtables.C4508443[input - 0x37A];
			switch (input) {
			case 0x2015: return 0xCFL;
			case 0x2018: return 0xCEL;
			case 0x2019: return 0xDEL;
			case 0x20AC: return 0xFCL;
			case 0x20AF: return 0xE1L;
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
