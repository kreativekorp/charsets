package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XColecoAdamSwVideoCharset extends Charset {
	public XColecoAdamSwVideoCharset() {
		super("x-coleco-adam-sw-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XColecoAdamSwVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XColecoAdamSwVideoCharsetEncoder(this);
	}

	private static final class XColecoAdamSwVideoCharsetDecoder extends TableCharsetDecoder {
		private XColecoAdamSwVideoCharsetDecoder(Charset cs) {
			super(cs, 1.08594f, 3f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final long[] GETOUTPUT0_0 = getOutput0_0();
		private static final long[] getOutput0_0() {
			return new long[] {
				0xFFFEL, 0xB7L, 0xFE0EDE10D83DL, 0x2302L, 0x2665L, 0x2666L, 0x2663L, 0x2660L, 0xFE0E26F3L, 0x2619L, 0x3C0L, 0x2211L, 0xDD74D83CL, 0x25C0L, 0x221AL, 0x221EL,
				0xF7L, 0x2265L, 0x2264L, 0xB1L, 0xDD60D834L, 0xDD5FD834L, 0xDD5ED834L, 0xDD5DD834L, 0xDD5ED834L, 0xDD5FD834L, 0xDD60D834L, 0x25B6L, 0x230AL, 0x230BL, 0x2308L, 0x2309L,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7B) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return GETOUTPUT0_0[input - 0x0];
			switch (input) {
			case 0x7C: return 0xA6L;
			case 0x7D: return 0x7DL;
			case 0x7E: return 0x7EL;
			case 0x7F: return 0x2428L;
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

	private static final class XColecoAdamSwVideoCharsetEncoder extends TableCharsetEncoder {
		private XColecoAdamSwVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0x26F3: return 0x1;
			case 0xD834: return 0x2;
			case 0xD83C: return 0x3;
			case 0xD83D: return 0x4;
			}
			return 0;
		}
		private int getNextState4(int input) {
			switch (input) {
			case 0xDE10: return 0x5;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 4: return getNextState4(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7B) return input - 0x20 + 0x20;
			switch (input) {
			case 0x0: return 0x1L;
			case 0x7D: return 0x7DL;
			case 0x7E: return 0x7EL;
			case 0xA6: return 0x7CL;
			case 0xB1: return 0x13L;
			case 0xB7: return 0x101L;
			case 0xF7: return 0x10L;
			case 0x3C0: return 0xAL;
			case 0x2211: return 0xBL;
			case 0x221A: return 0xEL;
			case 0x221E: return 0xFL;
			case 0x2264: return 0x12L;
			case 0x2265: return 0x11L;
			case 0x2302: return 0x301L;
			case 0x2308: return 0x1EL;
			case 0x2309: return 0x1FL;
			case 0x230A: return 0x1CL;
			case 0x230B: return 0x1DL;
			case 0x2428: return 0x7FL;
			case 0x25B6: return 0x1BL;
			case 0x25C0: return 0xDL;
			case 0x2619: return 0x9L;
			case 0x2660: return 0x701L;
			case 0x2663: return 0x601L;
			case 0x2665: return 0x401L;
			case 0x2666: return 0x501L;
			case 0x26F3: return 0x8L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xFE0E: return 0x8L;
			case 0xFE0F: return 0x8L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xDD5D: return 0x17L;
			case 0xDD5E: return 0x16L;
			case 0xDD5F: return 0x15L;
			case 0xDD60: return 0x14L;
			}
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0xDD74: return 0xCL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			switch (input) {
			case 0xDE10: return 0x201L;
			}
			return 0;
		}
		private long getOutput5(int input) {
			switch (input) {
			case 0xFE0E: return 0x201L;
			case 0xFE0F: return 0x201L;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 3: return getOutput3(input);
			case 4: return getOutput4(input);
			case 5: return getOutput5(input);
			default: return 0;
			}
		}
	}
}
