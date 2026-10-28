package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XKkVoynichV101Charset extends Charset {
	public XKkVoynichV101Charset() {
		super("x-kk-voynich-v101", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XKkVoynichV101CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XKkVoynichV101CharsetEncoder(this);
	}

	private static final class XKkVoynichV101CharsetDecoder extends TableCharsetDecoder {
		private XKkVoynichV101CharsetDecoder(Charset cs) {
			super(cs, 1.80093f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_20 = getOutput0_20();
		private static final int[] getOutput0_20() {
			return new int[] {
				0x20, 0xDCC4DBBD, 0, 0xDCC5DBBD, 0xDCA5DBBD, 0xDCC6DBBD, 0xDC02DBBD, 0, 0xDCADDBBD, 0, 0xDC0BDBBD, 0xDCC7DBBD, 0x2C, 0x2D, 0x2E, 0x2F,
				0, 0xDCC0DBBD, 0xDCC1DBBD, 0xDCC2DBBD, 0xDC1DDBBD, 0xDCC3DBBD, 0xDCA7DBBD, 0xDCA8DBBD, 0xDC09DBBD, 0xDC17DBBD, 0, 0, 0x3C, 0x3D, 0x3E, 0x3F,
				0, 0xDC9ADBBD, 0xDD0FDBBD, 0xDD09DBBD, 0xDD0DDBBD, 0xDC0CDBBD, 0xDCE2DBBD, 0xDCE3DBBD, 0xDD10DBBD, 0xDD00DBBD, 0xDCE4DBBD, 0xDD11DBBD, 0xDD12DBBD, 0xDD08DBBD, 0xDC01DBBD, 0,
				0xDD03DBBD, 0xDC1FDBBD, 0xDCE5DBBD, 0xDD0ADBBD, 0xDCA2DBBD, 0xDCE6DBBD, 0xDCE7DBBD, 0xDCFFDBBD, 0xDC4FDBBD, 0xDCA0DBBD, 0xDD06DBBD, 0, 0xDC3CDBBD, 0, 0xDC1BDBBD, 0,
				0, 0xDC10DBBD, 0xDC8EDBBD, 0xDC06DBBD, 0xDD0BDBBD, 0xDC1ADBBD, 0xDC20DBBD, 0xDC21DBBD, 0xDC22DBBD, 0xDC00DBBD, 0xDCD9DBBD, 0xDC23DBBD, 0xDD13DBBD, 0xDD05DBBD, 0xDD01DBBD, 0xDC14DBBD,
				0xDC04DBBD, 0xDD07DBBD, 0xDCE8DBBD, 0xDC0ADBBD, 0xDCA1DBBD, 0xDCD8DBBD, 0xDCE9DBBD, 0xDCDADBBD, 0xDC60DBBD, 0xDC03DBBD, 0xDD02DBBD, 0, 0xDC3DDBBD, 0, 0x5F,
			};
		}
		private static final int[] GETOUTPUT0_95 = getOutput0_95();
		private static final int[] getOutput0_95() {
			return new int[] {
				0xDCEADBBD, 0xDCEBDBBD, 0xDCECDBBD, 0, 0xDCEDDBBD, 0xDC9DDBBD, 0xDC9CDBBD, 0xDC7EDBBD, 0, 0xDCB0DBBD, 0, 0xA0, 0xDCB1DBBD, 0xDCB2DBBD, 0xDCB3DBBD, 0xDCB4DBBD,
				0xDCB5DBBD, 0xDC63DBBD, 0xDC7DDBBD, 0xDCB6DBBD, 0xDC9BDBBD, 0xDC43DBBD, 0xDC8DDBBD, 0xDCB7DBBD, 0xDC37DBBD, 0xDCB8DBBD, 0xDCB9DBBD, 0xDCBADBBD, 0xDC47DBBD, 0xDC4ADBBD, 0xDCBBDBBD, 0xDCBCDBBD,
				0xDD04DBBD, 0xDCE0DBBD, 0xDCE1DBBD, 0xDC99DBBD, 0xDCBEDBBD, 0xDCBFDBBD, 0xDC6DDBBD, 0xDC51DBBD, 0xDCBDDBBD, 0xDCAEDBBD, 0xDCAFDBBD, 0xDCA9DBBD, 0xDC11DBBD, 0xDCAADBBD, 0xDCABDBBD, 0xDCACDBBD,
				0xDCA4DBBD, 0xDC0FDBBD, 0xDC3EDBBD, 0xDC34DBBD, 0xDC6ADBBD, 0xDC40DBBD, 0xDC41DBBD, 0xDC69DBBD, 0, 0xDCA6DBBD, 0xDC08DBBD, 0xDCA3DBBD, 0xDD0CDBBD, 0xDD0EDBBD, 0xDCEEDBBD, 0xDCC8DBBD,
				0xDCC9DBBD, 0xDCCADBBD, 0xDCCBDBBD, 0xDCCCDBBD, 0xDCCDDBBD, 0xDCCEDBBD, 0xDCCFDBBD, 0xDCD0DBBD, 0xDCD1DBBD, 0xDCD2DBBD, 0xDCD3DBBD, 0xDCD4DBBD, 0xDCD5DBBD, 0xDCD6DBBD, 0xDCD7DBBD, 0xDCEFDBBD,
				0xDD14DBBD, 0xDD15DBBD, 0xDD16DBBD, 0xDD17DBBD, 0xDCDBDBBD, 0xDCF0DBBD, 0xDCF1DBBD, 0xDC6BDBBD, 0xDC82DBBD, 0xDCF2DBBD, 0xDCF3DBBD, 0xDCF4DBBD, 0xDCF5DBBD, 0xDCDCDBBD, 0xDCF6DBBD, 0xDCDDDBBD,
				0xDD18DBBD, 0xDD19DBBD, 0xDD1ADBBD, 0xDCF7DBBD, 0xDD1BDBBD, 0xDC42DBBD, 0xDCDEDBBD, 0xDCDFDBBD, 0xDD1CDBBD, 0xDD1DDBBD, 0xDD1EDBBD,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7E) return GETOUTPUT0_20[input - 0x20];
			if (input >= 0x95 && input <= 0xFF) return GETOUTPUT0_95[input - 0x95];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XKkVoynichV101CharsetEncoder extends TableCharsetEncoder {
		private XKkVoynichV101CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xDBBD: return 0x1;
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
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			switch (input) {
			case 0x20: return 0x20L;
			case 0x2C: return 0x2CL;
			case 0x2D: return 0x2DL;
			case 0x2E: return 0x2EL;
			case 0x2F: return 0x2FL;
			case 0x3C: return 0x3CL;
			case 0x3D: return 0x3DL;
			case 0x3E: return 0x3EL;
			case 0x3F: return 0x3FL;
			case 0x5F: return 0x7EL;
			case 0xA0: return 0xA0L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DC00 = getOutput1_DC00();
		private static final char[] getOutput1_DC00() {
			return "iN&yp\u0000c\u0000\u00CF8s*E\u0000\u0000\u00C6a\u00C1\u0000\u0000o\u0000\u00009\u0000\u0000e^\u00004\u0000Qfghk\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C8\u0000\u0000\u00AD\u0000\u0000\u0000\u0000\\|\u00C7\u0000\u00CA\u00CB\u00FA\u00AA\u0000\u0000\u0000\u00B1\u0000\u0000\u00B2\u0000\u0000\u0000\u0000X\u0000\u00BC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000x\u0000\u0000\u00A6\u0000\u0000\u0000\u0000\u0000\u00CC\u00C9\u00EC\u0000\u00BB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A7\u009C\u0000\u0000\u0000\u00ED\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00ABb\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00B8A\u00A9\u009B\u009A\u0000\u0000YtT\u00D0\u00C5$\u00CE67\u00C0\u00C2\u00C3\u00C4(\u00BE\u00BF\u009E\u00A1\u00A2\u00A3\u00A4\u00A5\u00A8\u00AC\u00AE\u00AF\u00B0\u00B3\u00B4\u00BD\u00B9\u00BA1235!#%+\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ujw\u00E9\u00F2\u00F4\u00FB\u00FC\u00B6\u00B7FGJRUVrv\u0095\u0096\u0097\u0099\u00D3\u00E4\u00EA\u00EB\u00EE\u00EF\u00F0\u00F1\u00F3\u00F8\u0000\u0000\u0000\u0000\u0000\u0000\u0000WInzP\u00B5mZqMCSd\u00D1D\u00D2BHKLl\u00E5\u00E6\u00E7\u00E8\u00F5\u00F6\u00F7\u00F9\u00FD\u00FE\uFF01".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xDCC8 && input <= 0xDCD7) return input - 0xDCC8 + 0xD4;
			if (input >= 0xDC00 && input <= 0xDD1E) return GETOUTPUT1_DC00[input - 0xDC00];
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
