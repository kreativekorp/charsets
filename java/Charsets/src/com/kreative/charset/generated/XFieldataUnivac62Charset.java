package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XFieldataUnivac62Charset extends Charset {
	public XFieldataUnivac62Charset() {
		super("x-fieldata-univac-62", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XFieldataUnivac62CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XFieldataUnivac62CharsetEncoder(this);
	}

	private static final class XFieldataUnivac62CharsetDecoder extends TableCharsetDecoder {
		private XFieldataUnivac62CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_20 = getOutput0_20();
		private static final char[] getOutput0_20() {
			return ")-+<=>&$*(%:?!,\u2BC30123456789\';/.\u2311\u2260".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x6 && input <= 0x1F) return input - 0x6 + 0x41;
			if (input >= 0x20 && input <= 0x3F) return GETOUTPUT0_20[input - 0x20];
			switch (input) {
			case 0x0: return 0x40L;
			case 0x1: return 0x5BL;
			case 0x2: return 0x5DL;
			case 0x3: return 0xAL;
			case 0x4: return 0xDL;
			case 0x5: return 0x20L;
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

	private static final class XFieldataUnivac62CharsetEncoder extends TableCharsetEncoder {
		private XFieldataUnivac62CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{44}, 3);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83D: return 0x1;
			}
			return 0;
		}
		private int getNextState1(int input) {
			switch (input) {
			case 0xDED1: return 0x2;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			case 1: return getNextState1(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x43 && input <= 0x5A) return input - 0x43 + 0x8;
			if (input >= 0x20 && input <= 0x42) return CommonSubtables.COMMON1239[input - 0x20];
			if (input >= 0x63 && input <= 0x7A) return input - 0x63 + 0x8;
			switch (input) {
			case 0x0: return 0x3FL;
			case 0xA: return 0x301L;
			case 0xD: return 0x401L;
			case 0x5B: return 0x101L;
			case 0x5C: return 0x2FL;
			case 0x5D: return 0x201L;
			case 0x5E: return 0x401L;
			case 0x5F: return 0x3FL;
			case 0x61: return 0x601L;
			case 0x62: return 0x701L;
			case 0x394: return 0x401L;
			case 0x2206: return 0x401L;
			case 0x2260: return 0x3FL;
			case 0x2311: return 0x3EL;
			case 0x25A1: return 0x3EL;
			case 0x2BC3: return 0x2FL;
			}
			return 0;
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0xDED1: return 0x2FL;
			}
			return 0;
		}
		private long getOutput2(int input) {
			switch (input) {
			case 0xFE0E: return 0x2FL;
			case 0xFE0F: return 0x2FL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			default: return 0;
			}
		}
	}
}
