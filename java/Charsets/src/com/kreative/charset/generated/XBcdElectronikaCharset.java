package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XBcdElectronikaCharset extends Charset {
	public XBcdElectronikaCharset() {
		super("x-bcd-electronika", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XBcdElectronikaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XBcdElectronikaCharsetEncoder(this);
	}

	private static final class XBcdElectronikaCharsetDecoder extends TableCharsetDecoder {
		private XBcdElectronikaCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return new char[] {
				0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x2D, 0x4C, 0x43, 0x52, 0x45, 0x20,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0xF) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XBcdElectronikaCharsetEncoder extends TableCharsetEncoder {
		private XBcdElectronikaCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{15}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_20 = getOutput0_20();
		private static final char[] getOutput0_20() {
			return new char[] {
				0xF, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0xA, 0, 0,
				0x1, 0x101, 0x201, 0x301, 0x401, 0x501, 0x601, 0x701, 0x8, 0x9, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0xC, 0, 0xE, 0, 0, 0, 0, 0, 0, 0xB, 0, 0, 0,
				0, 0, 0xD, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0xC, 0, 0xE, 0, 0, 0, 0, 0, 0, 0xB, 0, 0, 0,
				0, 0, 0xD,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x72) return GETOUTPUT0_20[input - 0x20];
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
