package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM1047JavaCharset extends Charset {
	public XIBM1047JavaCharset() {
		super("x-IBM1047-java", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM1047JavaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM1047JavaCharsetEncoder(this);
	}

	private static final class XIBM1047JavaCharsetDecoder extends TableCharsetDecoder {
		private XIBM1047JavaCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_0 = getOutput0_0();
		private static final char[] getOutput0_0() {
			return "\uFFFE\u0001\u0002\u0003\u009C\t\u0086\u007F\u0097\u008D\u008E\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u009D\n\b\u0087\u0018\u0019\u0092\u008F\u001C\u001D\u001E\u001F\u0080\u0081\u0082\u0083\u0084\u0085\u0017\u001B\u0088\u0089\u008A\u008B\u008C\u0005\u0006\u0007\u0090\u0091\u0016\u0093\u0094\u0095\u0096\u0004\u0098\u0099\u009A\u009B\u0014\u0015\u009E\u001A \u00A0\u00E2\u00E4\u00E0\u00E1\u00E3\u00E5\u00E7\u00F1\u00A2.<(+|&\u00E9\u00EA\u00EB\u00E8\u00ED\u00EE\u00EF\u00EC\u00DF!$*);^-/\u00C2\u00C4\u00C0\u00C1\u00C3\u00C5\u00C7\u00D1\u00A6,%_>?\u00F8\u00C9\u00CA\u00CB\u00C8\u00CD\u00CE\u00CF\u00CC`:#@\'=\"\u00D8abcdefghi\u00AB\u00BB\u00F0\u00FD\u00FE\u00B1\u00B0jklmnopqr\u00AA\u00BA\u00E6\u00B8\u00C6\u00A4\u00B5~stuvwxyz\u00A1\u00BF\u00D0[\u00DE\u00AE\u00AC\u00A3\u00A5\u00B7\u00A9\u00A7\u00B6\u00BC\u00BD\u00BE\u00DD\u00A8\u00AF]\u00B4\u00D7{ABCDEFGHI\u00AD\u00F4\u00F6\u00F2\u00F3\u00F5}JKLMNOPQR\u00B9\u00FB\u00FC\u00F9\u00FA\u00FF\\\u00F7STUVWXYZ\u00B2\u00D4\u00D6\u00D2\u00D3\u00D50123456789\u00B3\u00DB\u00DC\u00D9\u00DA\u009F".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0xFF) return GETOUTPUT0_0[input - 0x0];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XIBM1047JavaCharsetEncoder extends TableCharsetEncoder {
		private XIBM1047JavaCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{111}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_20 = getOutput0_20();
		private static final char[] getOutput0_20() {
			return "@Z\u007F{[lP}M]\\Nk`Ka\u00F0\u00F1\u00F2\u00F3\u00F4\u00F5\u00F6\u00F7\u00F8\u00F9z^L~no|\u00C1\u00C2\u00C3\u00C4\u00C5\u00C6\u00C7\u00C8\u00C9\u00D1\u00D2\u00D3\u00D4\u00D5\u00D6\u00D7\u00D8\u00D9\u00E2\u00E3\u00E4\u00E5\u00E6\u00E7\u00E8\u00E9\u00AD\u00E0\u00BD_my\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\u0091\u0092\u0093\u0094\u0095\u0096\u0097\u0098\u0099\u00A2\u00A3\u00A4\u00A5\u00A6\u00A7\u00A8\u00A9\u00C0O\u00D0\u00A1\u0701 !\"#$%\u0601\u0017()*+,\t\n\u001B01\u001A3456\b89:;\u0401\u0014>\uFF01A\u00AAJ\u00B1\u009F\u00B2j\u00B5\u00BB\u00B4\u009A\u008A\u00B0\u00CA\u00AF\u00BC\u0090\u008F\u00EA\u00FA\u00BE\u00A0\u00B6\u00B3\u009D\u00DA\u009B\u008B\u00B7\u00B8\u00B9\u00ABdebfcg\u009Ehtqrsxuvw\u00ACi\u00ED\u00EE\u00EB\u00EF\u00EC\u00BF\u0080\u00FD\u00FE\u00FB\u00FC\u00BA\u00AEYDEBFCG\u009CHTQRSXUVW\u008CI\u00CD\u00CE\u00CB\u00CF\u00CC\u00E1p\u00DD\u00DE\u00DB\u00DC\u008D\u008E\u00DF".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_EBCDIC_C0_UNIX[input - 0x0];
			if (input >= 0x20 && input <= 0xFF) return GETOUTPUT0_20[input - 0x20];
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
