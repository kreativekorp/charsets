package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XColecoAdamOs7VideoCharset extends Charset {
	public XColecoAdamOs7VideoCharset() {
		super("x-coleco-adam-os7-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XColecoAdamOs7VideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XColecoAdamOs7VideoCharsetEncoder(this);
	}

	private static final class XColecoAdamOs7VideoCharsetDecoder extends TableCharsetDecoder {
		private XColecoAdamOs7VideoCharsetDecoder(Charset cs) {
			super(cs, 1.19835f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_5 = getOutput0_5();
		private static final int[] getOutput0_5() {
			return new int[] {
				0xDC67DBBF, 0xDC68DBBF, 0xDC69DBBF, 0xDC6ADBBF, 0xDC6BDBBF, 0xDC6CDBBF, 0xDC6DDBBF, 0xDC6EDBBF, 0xDC6FDBBF, 0xDC70DBBF, 0xDC71DBBF, 0xDC72DBBF, 0xDC73DBBF, 0xDC74DBBF, 0xDC75DBBF, 0xDC76DBBF,
				0xDC77DBBF, 0xDC78DBBF, 0xDC79DBBF, 0xDC7ADBBF, 0xDC7BDBBF, 0xDC7CDBBF, 0xDC7DDBBF, 0xDC7EDBBF, 0xA9, 0x1D40, 0x1D39,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7B) return input - 0x20 + 0x20;
			if (input >= 0x5 && input <= 0x1F) return GETOUTPUT0_5[input - 0x5];
			switch (input) {
			case 0x7C: return 0x3EL;
			case 0x7D: return 0x7DL;
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

	private static final class XColecoAdamOs7VideoCharsetEncoder extends TableCharsetEncoder {
		private XColecoAdamOs7VideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xDBBF: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7B) return input - 0x20 + 0x20;
			switch (input) {
			case 0x7D: return 0x7DL;
			case 0xA9: return 0x1DL;
			case 0x1D39: return 0x1FL;
			case 0x1D40: return 0x1EL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDC6A && input <= 0xDC7E) return input - 0xDC6A + 0x8;
			switch (input) {
			case 0xDC67: return 0x501L;
			case 0xDC68: return 0x601L;
			case 0xDC69: return 0x701L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			default: return 0;
			}
		}
	}
}
