package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XZxspectrumKoi8Charset extends Charset {
	public XZxspectrumKoi8Charset() {
		super("x-zxspectrum-koi8", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XZxspectrumKoi8CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XZxspectrumKoi8CharsetEncoder(this);
	}

	private static final class XZxspectrumKoi8CharsetDecoder extends TableCharsetDecoder {
		private XZxspectrumKoi8CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_7F = getOutput0_7F();
		private static final char[] getOutput0_7F() {
			return "\u00A9\u2500\u2502\u250C\u2510\u2514\u2518\u251C\u2524\u252C\u2534\u253C\u2580\u2584\u2588\u258C\u2590\u2591\u2592\u2593\u2320\u25A0\u2219\u221A\u2248\u2264\u2265\u00A0\u2321\u00B0\u00B2\u00B7\u00F7\u2550\u2551\u2552\u0451\u0454\u2554\u0456\u0457\u2557\u2558\u2559\u255A\u255B\u0491\u255D\u255E\u255F\u2560\u2561\u0401\u0404\u2563\u0406\u0407\u2566\u2567\u2568\u2569\u256A\u0490\u256C\u00A9\u044E\u0430\u0431\u0446\u0434\u0435\u0444\u0433\u0445\u0438\u0439\u043A\u043B\u043C\u043D\u043E\u043F\u044F\u0440\u0441\u0442\u0443\u0436\u0432\u044C\u044B\u0437\u0448\u044D\u0449\u0447\u044A\u042E\u0410\u0411\u0426\u0414\u0415\u0424\u0413\u0425\u0418\u0419\u041A\u041B\u041C\u041D\u041E\u041F\u042F\u0420\u0421\u0422\u0423\u0416\u0412\u042C\u042B\u0417\u0428\u042D\u0429\u0427\u042A".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0x7F && input <= 0xFF) return GETOUTPUT0_7F[input - 0x7F];
			switch (input) {
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x5FL;
			case 0x60: return 0xA3L;
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

	private static final class XZxspectrumKoi8CharsetEncoder extends TableCharsetEncoder {
		private XZxspectrumKoi8CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7E) return input - 0x61 + 0x61;
			if (input >= 0x401 && input <= 0x457) return CommonSubtables.COMMON1570[input - 0x401];
			if (input >= 0x2550 && input <= 0x256C) return CommonSubtables.COMMON1571[input - 0x2550];
			switch (input) {
			case 0x5F: return 0x5FL;
			case 0xA0: return 0x9AL;
			case 0xA3: return 0x60L;
			case 0xA9: return 0x7FL;
			case 0xB0: return 0x9CL;
			case 0xB2: return 0x9DL;
			case 0xB7: return 0x9EL;
			case 0xF7: return 0x9FL;
			case 0x490: return 0xBDL;
			case 0x491: return 0xADL;
			case 0x2191: return 0x5EL;
			case 0x2219: return 0x95L;
			case 0x221A: return 0x96L;
			case 0x2248: return 0x97L;
			case 0x2264: return 0x98L;
			case 0x2265: return 0x99L;
			case 0x2320: return 0x93L;
			case 0x2321: return 0x9BL;
			case 0x2500: return 0x80L;
			case 0x2502: return 0x81L;
			case 0x250C: return 0x82L;
			case 0x2510: return 0x83L;
			case 0x2514: return 0x84L;
			case 0x2518: return 0x85L;
			case 0x251C: return 0x86L;
			case 0x2524: return 0x87L;
			case 0x252C: return 0x88L;
			case 0x2534: return 0x89L;
			case 0x253C: return 0x8AL;
			case 0x2580: return 0x8BL;
			case 0x2584: return 0x8CL;
			case 0x2588: return 0x8DL;
			case 0x258C: return 0x8EL;
			case 0x2590: return 0x8FL;
			case 0x2591: return 0x90L;
			case 0x2592: return 0x91L;
			case 0x2593: return 0x92L;
			case 0x25A0: return 0x94L;
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
