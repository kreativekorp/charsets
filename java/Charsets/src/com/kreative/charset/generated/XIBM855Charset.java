package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM855Charset extends Charset {
	public XIBM855Charset() {
		super("x-IBM855", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM855CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM855CharsetEncoder(this);
	}

	private static final class XIBM855CharsetDecoder extends TableCharsetDecoder {
		private XIBM855CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u0452\u0402\u0453\u0403\u0451\u0401\u0454\u0404\u0455\u0405\u0456\u0406\u0457\u0407\u0458\u0408\u0459\u0409\u045A\u040A\u045B\u040B\u045C\u040C\u045E\u040E\u045F\u040F\u044E\u042E\u044A\u042A\u0430\u0410\u0431\u0411\u0446\u0426\u0434\u0414\u0435\u0415\u0444\u0424\u0433\u0413\u00AB\u00BB\u2591\u2592\u2593\u2502\u2524\u0445\u0425\u0438\u0418\u2563\u2551\u2557\u255D\u0439\u0419\u2510\u2514\u2534\u252C\u251C\u2500\u253C\u043A\u041A\u255A\u2554\u2569\u2566\u2560\u2550\u256C\u00A4\u043B\u041B\u043C\u041C\u043D\u041D\u043E\u041E\u043F\u2518\u250C\u2588\u2584\u041F\u044F\u2580\u042F\u0440\u0420\u0441\u0421\u0442\u0422\u0443\u0423\u0436\u0416\u0432\u0412\u044C\u042C\u2116\u00AD\u044B\u042B\u0437\u0417\u0448\u0428\u044D\u042D\u0449\u0429\u0447\u0427\u00A7\u25A0\u00A0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFF) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM855CharsetEncoder extends TableCharsetEncoder {
		private XIBM855CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_401 = getOutput0_401();
		private static final char[] getOutput0_401() {
			return "\u0085\u0081\u0083\u0087\u0089\u008B\u008D\u008F\u0091\u0093\u0095\u0097\u0000\u0099\u009B\u00A1\u00A3\u00EC\u00AD\u00A7\u00A9\u00EA\u00F4\u00B8\u00BE\u00C7\u00D1\u00D3\u00D5\u00D7\u00DD\u00E2\u00E4\u00E6\u00E8\u00AB\u00B6\u00A5\u00FC\u00F6\u00FA\u009F\u00F2\u00EE\u00F8\u009D\u00E0\u00A0\u00A2\u00EB\u00AC\u00A6\u00A8\u00E9\u00F3\u00B7\u00BD\u00C6\u00D0\u00D2\u00D4\u00D6\u00D8\u00E1\u00E3\u00E5\u00E7\u00AA\u00B5\u00A4\u00FB\u00F5\u00F9\u009E\u00F1\u00ED\u00F7\u009C\u00DE\u0000\u0084\u0080\u0082\u0086\u0088\u008A\u008C\u008E\u0090\u0092\u0094\u0096\u0000\u0098\u009A".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x401 && input <= 0x45F) return GETOUTPUT0_401[input - 0x401];
			switch (input) {
			case 0xA0: return 0xFF01L;
			case 0xA4: return 0xCFL;
			case 0xA7: return 0xFDL;
			case 0xAB: return 0xAEL;
			case 0xAD: return 0xF0L;
			case 0xBB: return 0xAFL;
			case 0x2116: return 0xEFL;
			case 0x2500: return 0xC4L;
			case 0x2502: return 0xB3L;
			case 0x250C: return 0xDAL;
			case 0x2510: return 0xBFL;
			case 0x2514: return 0xC0L;
			case 0x2518: return 0xD9L;
			case 0x251C: return 0xC3L;
			case 0x2524: return 0xB4L;
			case 0x252C: return 0xC2L;
			case 0x2534: return 0xC1L;
			case 0x253C: return 0xC5L;
			case 0x2550: return 0xCDL;
			case 0x2551: return 0xBAL;
			case 0x2554: return 0xC9L;
			case 0x2557: return 0xBBL;
			case 0x255A: return 0xC8L;
			case 0x255D: return 0xBCL;
			case 0x2560: return 0xCCL;
			case 0x2563: return 0xB9L;
			case 0x2566: return 0xCBL;
			case 0x2569: return 0xCAL;
			case 0x256C: return 0xCEL;
			case 0x2580: return 0xDFL;
			case 0x2584: return 0xDCL;
			case 0x2588: return 0xDBL;
			case 0x2591: return 0xB0L;
			case 0x2592: return 0xB1L;
			case 0x2593: return 0xB2L;
			case 0x25A0: return 0xFEL;
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
