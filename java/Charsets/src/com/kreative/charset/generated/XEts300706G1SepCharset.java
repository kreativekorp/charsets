package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEts300706G1SepCharset extends Charset {
	public XEts300706G1SepCharset() {
		super("x-ets-300-706-g1-sep", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEts300706G1SepCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEts300706G1SepCharsetEncoder(this);
	}

	private static final class XEts300706G1SepCharsetDecoder extends TableCharsetDecoder {
		private XEts300706G1SepCharsetDecoder(Charset cs) {
			super(cs, 1.65625f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_21 = getOutput0_21();
		private static final int[] getOutput0_21() {
			return new int[] {
				0xDE51D833, 0xDE52D833, 0xDE53D833, 0xDE54D833, 0xDE55D833, 0xDE56D833, 0xDE57D833, 0xDE58D833, 0xDE59D833, 0xDE5AD833, 0xDE5BD833, 0xDE5CD833, 0xDE5DD833, 0xDE5ED833, 0xDE5FD833, 0xDE60D833,
				0xDE61D833, 0xDE62D833, 0xDE63D833, 0xDE64D833, 0xDE65D833, 0xDE66D833, 0xDE67D833, 0xDE68D833, 0xDE69D833, 0xDE6AD833, 0xDE6BD833, 0xDE6CD833, 0xDE6DD833, 0xDE6ED833, 0xDE6FD833,
			};
		}
		private static final int[] GETOUTPUT0_60 = getOutput0_60();
		private static final int[] getOutput0_60() {
			return new int[] {
				0xDE70D833, 0xDE71D833, 0xDE72D833, 0xDE73D833, 0xDE74D833, 0xDE75D833, 0xDE76D833, 0xDE77D833, 0xDE78D833, 0xDE79D833, 0xDE7AD833, 0xDE7BD833, 0xDE7CD833, 0xDE7DD833, 0xDE7ED833, 0xDE7FD833,
				0xDE80D833, 0xDE81D833, 0xDE82D833, 0xDE83D833, 0xDE84D833, 0xDE85D833, 0xDE86D833, 0xDE87D833, 0xDE88D833, 0xDE89D833, 0xDE8AD833, 0xDE8BD833, 0xDE8CD833, 0xDE8DD833, 0xDE8ED833, 0xDE8FD833,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x20) return input - 0x0 + 0x80;
			if (input >= 0x21 && input <= 0x3F) return GETOUTPUT0_21[input - 0x21];
			if (input >= 0x60 && input <= 0x7F) return GETOUTPUT0_60[input - 0x60];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XEts300706G1SepCharsetEncoder extends TableCharsetEncoder {
		private XEts300706G1SepCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{32}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD833: return 0x1;
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
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x80];
			switch (input) {
			case 0xA0: return 0x20L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDE51 && input <= 0xDE6F) return input - 0xDE51 + 0x21;
			if (input >= 0xDE70 && input <= 0xDE8F) return input - 0xDE70 + 0x60;
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
