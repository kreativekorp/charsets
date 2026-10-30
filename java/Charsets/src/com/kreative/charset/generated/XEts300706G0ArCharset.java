package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEts300706G0ArCharset extends Charset {
	public XEts300706G0ArCharset() {
		super("x-ets-300-706-g0-ar", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEts300706G0ArCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEts300706G0ArCharsetEncoder(this);
	}

	private static final class XEts300706G0ArCharsetDecoder extends TableCharsetDecoder {
		private XEts300706G0ArCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_3B = getOutput0_3B();
		private static final char[] getOutput0_3B() {
			return "\u061B>=<\u061F\uFE94\uFE80\uFE92\uFE8F\uFE98\uFE95\uFE8E\uFE8D\uFE91\uFE93\uFE97\uFE9B\uFE9F\uFEA3\uFEA7\uFEA9\uFEAB\uFEAD\uFEAF\uFEB3\uFEB7\uFEBB\uFEBF\uFEC1\uFEC5\uFECB\uFECF\uFE9C\uFEA0\uFEA4\uFEA8#\u0640\uFED3\uFED7\uFEDB\uFEDF\uFEE3\uFEE7\uFEEB\uFEED\uFEF0\uFEF3\uFE99\uFE9D\uFEA1\uFEA5\uFEF4\uFEEF\uFECC\uFED0\uFED4\uFED1\uFED8\uFED5\uFED9\uFEE0\uFEDD\uFEE4\uFEE1\uFEE8\uFEE5\uFEFB\u25A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x80;
			if (input >= 0x2A && input <= 0x3A) return input - 0x2A + 0x2A;
			if (input >= 0x3B && input <= 0x7F) return GETOUTPUT0_3B[input - 0x3B];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0xA3L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0xFB9EL;
			case 0x27: return 0xFEF2L;
			case 0x28: return 0x29L;
			case 0x29: return 0x28L;
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

	private static final class XEts300706G0ArCharsetEncoder extends TableCharsetEncoder {
		private XEts300706G0ArCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_FE80 = getOutput0_FE80();
		private static final char[] getOutput0_FE80() {
			return "A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000GFCCHBI@EEJDkkK[llL\\mmM]nnN^OOPPQQRR\u0000\u0000SS\u0000\u0000TT\u0000\u0000UU\u0000\u0000VVWWWWXXXX\u0000\u0000Yq\u0000\u0000Zrttasvvbuwwccyydx{{ez}}f|\u0000\u0000g\u0000hhpi\u0000\'jo\u0000\u0000\u0000\u0000\u0000\u0000~".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x2A && input <= 0x3A) return input - 0x2A + 0x2A;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x80];
			if (input >= 0xFE80 && input <= 0xFEFB) return GETOUTPUT0_FE80[input - 0xFE80];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x5FL;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x28: return 0x29L;
			case 0x29: return 0x28L;
			case 0x3C: return 0x3EL;
			case 0x3D: return 0x3DL;
			case 0x3E: return 0x3CL;
			case 0xA3: return 0x23L;
			case 0x61B: return 0x3BL;
			case 0x61F: return 0x3FL;
			case 0x640: return 0x60L;
			case 0x25A0: return 0x7FL;
			case 0xFB9E: return 0x26L;
			case 0xFB9F: return 0x26L;
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
