package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEts300706G3Charset extends Charset {
	public XEts300706G3Charset() {
		super("x-ets-300-706-g3", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEts300706G3CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEts300706G3CharsetEncoder(this);
	}

	private static final class XEts300706G3CharsetDecoder extends TableCharsetDecoder {
		private XEts300706G3CharsetDecoder(Charset cs) {
			super(cs, 1.5f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_20 = getOutput0_20();
		private static final int[] getOutput0_20() {
			return new int[] {
				0xDF3CD83E, 0xDF3DD83E, 0xDF3ED83E, 0xDF3FD83E, 0xDF40D83E, 0x25E3, 0xDF41D83E, 0xDF42D83E, 0xDF43D83E, 0xDF44D83E, 0xDF45D83E, 0xDF46D83E, 0xDF68D83E, 0xDF69D83E, 0xDF70D83E, 0x2592,
				0xDF47D83E, 0xDF48D83E, 0xDF49D83E, 0xDF4AD83E, 0xDF4BD83E, 0x25E2, 0xDF4CD83E, 0xDF4DD83E, 0xDF4ED83E, 0xDF4FD83E, 0xDF50D83E, 0xDF51D83E, 0xDF6AD83E, 0xDF6BD83E, 0xDF75D83E, 0x2588,
				0x2537, 0x252F, 0x251D, 0x2525, 0xDFA4D83E, 0xDFA5D83E, 0xDFA6D83E, 0xDFA7D83E, 0xDFA0D83E, 0xDFA1D83E, 0xDFA2D83E, 0xDFA3D83E, 0x253F, 0x2022, 0x25CF, 0x25CB,
				0x2502, 0x2500, 0x250C, 0x2510, 0x2514, 0x2518, 0x251C, 0x2524, 0x252C, 0x2534, 0x253C, 0x2B62, 0x2B60, 0x2B61, 0x2B63, 0xA0,
				0xDF52D83E, 0xDF53D83E, 0xDF54D83E, 0xDF55D83E, 0xDF56D83E, 0x25E5, 0xDF57D83E, 0xDF58D83E, 0xDF59D83E, 0xDF5AD83E, 0xDF5BD83E, 0xDF5CD83E, 0xDF6CD83E, 0xDF6DD83E, 0, 0,
				0xDF5DD83E, 0xDF5ED83E, 0xDF5FD83E, 0xDF60D83E, 0xDF61D83E, 0x25E4, 0xDF62D83E, 0xDF63D83E, 0xDF64D83E, 0xDF65D83E, 0xDF66D83E, 0xDF67D83E, 0xDF6ED83E, 0xDF6FD83E,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x80;
			if (input >= 0x20 && input <= 0x7D) return GETOUTPUT0_20[input - 0x20];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XEts300706G3CharsetEncoder extends TableCharsetEncoder {
		private XEts300706G3CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83E: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_2500 = getOutput0_2500();
		private static final char[] getOutput0_2500() {
			return "Q\u0000P\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000R\u0000\u0000\u0000S\u0000\u0000\u0000T\u0000\u0000\u0000U\u0000\u0000\u0000VB\u0000\u0000\u0000\u0000\u0000\u0000WC\u0000\u0000\u0000\u0000\u0000\u0000X\u0000\u0000A\u0000\u0000\u0000\u0000Y\u0000\u0000@\u0000\u0000\u0000\u0000Z\u0000\u0000L".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x80];
			if (input >= 0x2500 && input <= 0x253F) return GETOUTPUT0_2500[input - 0x2500];
			switch (input) {
			case 0xA0: return 0x5FL;
			case 0x2022: return 0x4DL;
			case 0x2588: return 0x3FL;
			case 0x2592: return 0x2FL;
			case 0x25CB: return 0x4FL;
			case 0x25CF: return 0x4EL;
			case 0x25E2: return 0x35L;
			case 0x25E3: return 0x25L;
			case 0x25E4: return 0x75L;
			case 0x25E5: return 0x65L;
			case 0x2B60: return 0x5CL;
			case 0x2B61: return 0x5DL;
			case 0x2B62: return 0x5BL;
			case 0x2B63: return 0x5EL;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DF3C = getOutput1_DF3C();
		private static final char[] getOutput1_DF3C() {
			return " !\"#$&\'()*+012346789:;`abcdfghijkpqrstvwxyz{,-<=lm|}.\u0000\u0000\u0000\u0000>".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xDF3C && input <= 0xDF75) return GETOUTPUT1_DF3C[input - 0xDF3C];
			switch (input) {
			case 0xDFA0: return 0x48L;
			case 0xDFA1: return 0x49L;
			case 0xDFA2: return 0x4AL;
			case 0xDFA3: return 0x4BL;
			case 0xDFA4: return 0x44L;
			case 0xDFA5: return 0x45L;
			case 0xDFA6: return 0x46L;
			case 0xDFA7: return 0x47L;
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
