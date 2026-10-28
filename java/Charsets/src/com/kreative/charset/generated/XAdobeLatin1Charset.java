package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAdobeLatin1Charset extends Charset {
	public XAdobeLatin1Charset() {
		super("x-adobe-latin1", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAdobeLatin1CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAdobeLatin1CharsetEncoder(this);
	}

	private static final class XAdobeLatin1CharsetDecoder extends TableCharsetDecoder {
		private XAdobeLatin1CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_90 = getOutput0_90();
		private static final char[] getOutput0_90() {
			return "\u0131\u0300\u0301\u0302\u0303\u0304\u0306\u0307\u0308\u0099\u030A\u0327\u009C\u030B\u0328\u030C".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x8F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return input - 0xA0 + 0xA0;
			if (input >= 0x90 && input <= 0x9F) return GETOUTPUT0_90[input - 0x90];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XAdobeLatin1CharsetEncoder extends TableCharsetEncoder {
		private XAdobeLatin1CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x8F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFE) return input - 0xA0 + 0xA0;
			switch (input) {
			case 0x99: return 0x99L;
			case 0x9C: return 0x9CL;
			case 0xFF: return 0xFF01L;
			case 0x131: return 0x90L;
			case 0x300: return 0x91L;
			case 0x301: return 0x92L;
			case 0x302: return 0x93L;
			case 0x303: return 0x94L;
			case 0x304: return 0x95L;
			case 0x306: return 0x96L;
			case 0x307: return 0x97L;
			case 0x308: return 0x98L;
			case 0x30A: return 0x9AL;
			case 0x30B: return 0x9DL;
			case 0x30C: return 0x9FL;
			case 0x327: return 0x9BL;
			case 0x328: return 0x9EL;
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
