package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEts300706G0SrCyrlCharset extends Charset {
	public XEts300706G0SrCyrlCharset() {
		super("x-ets-300-706-g0-sr-cyrl", new String[]{"x-ets-300-706-g0-hr-cyrl"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEts300706G0SrCyrlCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEts300706G0SrCyrlCharsetEncoder(this);
	}

	private static final class XEts300706G0SrCyrlCharsetDecoder extends TableCharsetDecoder {
		private XEts300706G0SrCyrlCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_40 = getOutput0_40();
		private static final char[] getOutput0_40() {
			return "\u0427\u0410\u0411\u0426\u0414\u0415\u0424\u0413\u0425\u0418\u0408\u041A\u041B\u041C\u041D\u041E\u041F\u040C\u0420\u0421\u0422\u0423\u0412\u0403\u0409\u040A\u0417\u040B\u0416\u0402\u0428\u040F\u0447\u0430\u0431\u0446\u0434\u0435\u0444\u0433\u0445\u0438\u0458\u043A\u043B\u043C\u043D\u043E\u043F\u045C\u0440\u0441\u0442\u0443\u0432\u0453\u0459\u045A\u0437\u045B\u0436\u0452\u0448\u25A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x80;
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x40 && input <= 0x7F) return GETOUTPUT0_40[input - 0x40];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XEts300706G0SrCyrlCharsetEncoder extends TableCharsetEncoder {
		private XEts300706G0SrCyrlCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_402 = getOutput0_402();
		private static final char[] getOutput0_402() {
			return "]W\u0000\u0000\u0000\u0000JXY[Q\u0000\u0000_ABVGDE\\ZI\u0000KLMNOPRSTUFHC@^\u0000\u0000\u0000\u0000\u0000\u0000\u0000abvgde|zi\u0000klmnoprstufhc`~\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000}w\u0000\u0000\u0000\u0000jxy{q".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x80];
			if (input >= 0x402 && input <= 0x45C) return GETOUTPUT0_402[input - 0x402];
			switch (input) {
			case 0x25A0: return 0x7FL;
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
