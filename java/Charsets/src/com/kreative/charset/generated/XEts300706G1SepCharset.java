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
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0x80, 0x81, 0x82, 0x83, 0x84, 0x85, 0x86, 0x87, 0x88, 0x89, 0x8A, 0x8B, 0x8C, 0x8D, 0x8E, 0x8F,
				0x90, 0x91, 0x92, 0x93, 0x94, 0x95, 0x96, 0x97, 0x98, 0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0x9F,
				0xA0, 0xDE51D833, 0xDE52D833, 0xDE53D833, 0xDE54D833, 0xDE55D833, 0xDE56D833, 0xDE57D833, 0xDE58D833, 0xDE59D833, 0xDE5AD833, 0xDE5BD833, 0xDE5CD833, 0xDE5DD833, 0xDE5ED833, 0xDE5FD833,
				0xDE60D833, 0xDE61D833, 0xDE62D833, 0xDE63D833, 0xDE64D833, 0xDE65D833, 0xDE66D833, 0xDE67D833, 0xDE68D833, 0xDE69D833, 0xDE6AD833, 0xDE6BD833, 0xDE6CD833, 0xDE6DD833, 0xDE6ED833, 0xDE6FD833,
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
			if (input >= 0x0 && input <= 0x3F) return GETOUTPUT0_0[input - 0x0];
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
			super(cs, 1f, 1f, new byte[]{127}, 2);
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
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return new char[] {
				0x1, 0x101, 0x201, 0x301, 0x401, 0x501, 0x601, 0x701, 0x8, 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF,
				0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x1C, 0x1D, 0x1E, 0x1F,
				0x20,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x80 && input <= 0xA0) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		private static final char[] GETOUTPUT1_DE51 = getOutput1_DE51();
		private static final char[] getOutput1_DE51() {
			return new char[] {
				0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29, 0x2A, 0x2B, 0x2C, 0x2D, 0x2E, 0x2F, 0x30,
				0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3A, 0x3B, 0x3C, 0x3D, 0x3E, 0x3F, 0x60,
				0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F, 0x70,
				0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A, 0x7B, 0x7C, 0x7D, 0x7E, 0x7F,
			};
		}
		private long getOutput1(int input) {
			if (input >= 0xDE51 && input <= 0xDE8F) return GETOUTPUT1_DE51[input - 0xDE51];
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
