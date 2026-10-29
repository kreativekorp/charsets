package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XFieldataCharset extends Charset {
	public XFieldataCharset() {
		super("x-fieldata", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XFieldataCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XFieldataCharsetEncoder(this);
	}

	private static final class XFieldataCharsetDecoder extends TableCharsetDecoder {
		private XFieldataCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_20 = getOutput0_20();
		private static final char[] getOutput0_20() {
			return "\u0090\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u0081\u0001\u009C\u009D\u009E\u009F\u0011\u0012\u0013\u0002\u0003\u0004\u0083\u0006\u0015\u0019\u008A\u008B\u008C\u001D\u001B\u007F\u0080\u000F\u000E\t\r ".toCharArray();
		}
		private static final char[] GETOUTPUT0_60 = getOutput0_60();
		private static final char[] getOutput0_60() {
			return ")-+<=>_$*(\":?!,\u00140123456789\';/.\u009B\b".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x6 && input <= 0x1F) return input - 0x6 + 0x61;
			if (input >= 0x46 && input <= 0x5F) return input - 0x46 + 0x41;
			if (input >= 0x20 && input <= 0x45) return GETOUTPUT0_20[input - 0x20];
			if (input >= 0x60 && input <= 0x7F) return GETOUTPUT0_60[input - 0x60];
			switch (input) {
			case 0x0: return 0xFFFEL;
			case 0x1: return 0x8FL;
			case 0x2: return 0x8EL;
			case 0x3: return 0x89L;
			case 0x4: return 0x8DL;
			case 0x5: return 0xA0L;
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

	private static final class XFieldataCharsetEncoder extends TableCharsetEncoder {
		private XFieldataCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{108}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\u0001+345\u00007\u0000\u007FC\u0000\u0000\u0000DBA\u0000012o8\u0000\u0000\u00009\u0000>\u0000=\u0000\u0000Emj\u0000g\u0000\u0000zi`hbna}|pqrstuvwxyk{cdel".toCharArray();
		}
		private static final char[] GETOUTPUT0_7F = getOutput0_7F();
		private static final char[] getOutput0_7F() {
			return "?@*\u00006\u0000\u0000\u0000\u0000\u0000\u0301:;<\u0401\u0201\u0101 !\"#$%&\'()\u0000~,-./\u0501".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x41 && input <= 0x5A) return input - 0x41 + 0x46;
			if (input >= 0x0 && input <= 0x3F) return GETOUTPUT0_0[input - 0x0];
			if (input >= 0x63 && input <= 0x7A) return input - 0x63 + 0x8;
			if (input >= 0x7F && input <= 0xA0) return GETOUTPUT0_7F[input - 0x7F];
			switch (input) {
			case 0x5F: return 0x66L;
			case 0x61: return 0x601L;
			case 0x62: return 0x701L;
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
