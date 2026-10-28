package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEts300706G0UkCharset extends Charset {
	public XEts300706G0UkCharset() {
		super("x-ets-300-706-g0-uk", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEts300706G0UkCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEts300706G0UkCharsetEncoder(this);
	}

	private static final class XEts300706G0UkCharsetDecoder extends TableCharsetDecoder {
		private XEts300706G0UkCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_40 = getOutput0_40();
		private static final char[] getOutput0_40() {
			return "\u042E\u0410\u0411\u0426\u0414\u0415\u0424\u0413\u0425\u0418\u0419\u041A\u041B\u041C\u041D\u041E\u041F\u042F\u0420\u0421\u0422\u0423\u0416\u0412\u042C\u0406\u0417\u0428\u0404\u0429\u0427\u0407\u044E\u0430\u0431\u0446\u0434\u0435\u0444\u0433\u0445\u0438\u0439\u043A\u043B\u043C\u043D\u043E\u043F\u044F\u0440\u0441\u0442\u0443\u0436\u0432\u044C\u0456\u0437\u0448\u0454\u0449\u0447\u25A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return input - 0x0 + 0x80;
			if (input >= 0x27 && input <= 0x3F) return input - 0x27 + 0x27;
			if (input >= 0x40 && input <= 0x7F) return GETOUTPUT0_40[input - 0x40];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
			case 0x26: return 0x457L;
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

	private static final class XEts300706G0UkCharsetEncoder extends TableCharsetEncoder {
		private XEts300706G0UkCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_404 = getOutput0_404();
		private static final char[] getOutput0_404() {
			return "\\\u0000Y_\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ABWGDEVZIJKLMNOPRSTUFHC^[]\u0000\u0000X\u0000@Qabwgdevzijklmnoprstufhc~{}\u0000\u0000x\u0000`q\u0000\u0000\u0000\u0000|\u0000y&".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x27 && input <= 0x3F) return input - 0x27 + 0x27;
			if (input >= 0x80 && input <= 0x9F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x80];
			if (input >= 0x404 && input <= 0x457) return GETOUTPUT0_404[input - 0x404];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x21L;
			case 0x22: return 0x22L;
			case 0x23: return 0x23L;
			case 0x24: return 0x24L;
			case 0x25: return 0x25L;
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
