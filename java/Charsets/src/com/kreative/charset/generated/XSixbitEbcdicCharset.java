package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XSixbitEbcdicCharset extends Charset {
	public XSixbitEbcdicCharset() {
		super("x-sixbit-ebcdic", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XSixbitEbcdicCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XSixbitEbcdicCharsetEncoder(this);
	}

	private static final class XSixbitEbcdicCharsetDecoder extends TableCharsetDecoder {
		private XSixbitEbcdicCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return " ABCDEFGHI\u00A2.<(+|&JKLMNOPQR!$*);\u00AC-/STUVWXYZ\u00A6,%_>?0123456789:#@\'=\"".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x3F) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XSixbitEbcdicCharsetEncoder extends TableCharsetEncoder {
		private XSixbitEbcdicCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{47}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_20 = getOutput0_20();
		private static final char[] getOutput0_20() {
			return "\u0001\u001A?;\u001B,\u0010=\r\u001D\u001C\u000E+ \u000B!0123456789:\u001E\f>./<\u0101\u0201\u0301\u0401\u0501\u0601\u0701\b\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\"#$%&\'()\u0000\u0000\u0000\u0000-\u0000\u0101\u0201\u0301\u0401\u0501\u0601\u0701\b\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\"#$%&\'()\u0000\u000F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7C) return GETOUTPUT0_20[input - 0x20];
			switch (input) {
			case 0xA2: return 0xAL;
			case 0xA6: return 0x2AL;
			case 0xAC: return 0x1FL;
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
