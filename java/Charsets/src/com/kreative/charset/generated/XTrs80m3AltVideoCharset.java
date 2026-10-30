package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTrs80m3AltVideoCharset extends Charset {
	public XTrs80m3AltVideoCharset() {
		super("x-trs80m3-alt-video", new String[]{"x-trs80m4-alt-video"});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTrs80m3AltVideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTrs80m3AltVideoCharsetEncoder(this);
	}

	private static final class XTrs80m3AltVideoCharsetDecoder extends TableCharsetDecoder {
		private XTrs80m3AltVideoCharsetDecoder(Charset cs) {
			super(cs, 1.23438f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_7F = getOutput0_7F();
		private static final int[] getOutput0_7F() {
			return new int[] {
				0xB1, 0xA0, 0xDF00D83E, 0xDF01D83E, 0xDF02D83E, 0xDF03D83E, 0xDF04D83E, 0xDF05D83E, 0xDF06D83E, 0xDF07D83E, 0xDF08D83E, 0xDF09D83E, 0xDF0AD83E, 0xDF0BD83E, 0xDF0CD83E, 0xDF0DD83E,
				0xDF0ED83E, 0xDF0FD83E, 0xDF10D83E, 0xDF11D83E, 0xDF12D83E, 0xDF13D83E, 0x258C, 0xDF14D83E, 0xDF15D83E, 0xDF16D83E, 0xDF17D83E, 0xDF18D83E, 0xDF19D83E, 0xDF1AD83E, 0xDF1BD83E, 0xDF1CD83E,
				0xDF1DD83E, 0xDF1ED83E, 0xDF1FD83E, 0xDF20D83E, 0xDF21D83E, 0xDF22D83E, 0xDF23D83E, 0xDF24D83E, 0xDF25D83E, 0xDF26D83E, 0xDF27D83E, 0x2590, 0xDF28D83E, 0xDF29D83E, 0xDF2AD83E, 0xDF2BD83E,
				0xDF2CD83E, 0xDF2DD83E, 0xDF2ED83E, 0xDF2FD83E, 0xDF30D83E, 0xDF31D83E, 0xDF32D83E, 0xDF33D83E, 0xDF34D83E, 0xDF35D83E, 0xDF36D83E, 0xDF37D83E, 0xDF38D83E, 0xDF39D83E, 0xDF3AD83E, 0xDF3BD83E,
				0x2588, 0xA5, 0x3002, 0x300C, 0x300D, 0x3001, 0x30FB, 0x30F2, 0x30A1, 0x30A3, 0x30A5, 0x30A7, 0x30A9, 0x30E3, 0x30E5, 0x30E7,
				0x30C3, 0x30FC, 0x30A2, 0x30A4, 0x30A6, 0x30A8, 0x30AA, 0x30AB, 0x30AD, 0x30AF, 0x30B1, 0x30B3, 0x30B5, 0x30B7, 0x30B9, 0x30BB,
				0x30BD, 0x30BF, 0x30C1, 0x30C4, 0x30C6, 0x30C8, 0x30CA, 0x30CB, 0x30CC, 0x30CD, 0x30CE, 0x30CF, 0x30D2, 0x30D5, 0x30D8, 0x30DB,
				0x30DE, 0x30DF, 0x30E0, 0x30E1, 0x30E2, 0x30E4, 0x30E6, 0x30E8, 0x30E9, 0x30EA, 0x30EB, 0x30EC, 0x30ED, 0x30EF, 0x30F3, 0x309B,
				0x309C,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.COMMON1751[input - 0x0];
			if (input >= 0x7F && input <= 0xFF) return GETOUTPUT0_7F[input - 0x7F];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XTrs80m3AltVideoCharsetEncoder extends TableCharsetEncoder {
		private XTrs80m3AltVideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 2);
		}
		private int getNextState0(int input) {
			switch (input) {
			case 0xD83E: return 0x1;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private static final char[] GETOUTPUT0_C3 = getOutput0_C3();
		private static final char[] getOutput0_C3() {
			return "\u000F\u000E\u0501\u001D\u0000\u0000\u001C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0013\u0011\u0000\u0012\u0000\u0000\u0000\u0401\u0000\u0000\u0014\u0019\u0000\u0000\f\u0018\u001A\u0017\u001E\u0000\u0301\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\u0000\u0000\u0000\u0016\u0701\u0000\b\t\u0000\u0000\u0015".toCharArray();
		}
		private static final char[] GETOUTPUT0_309B = getOutput0_309B();
		private static final char[] getOutput0_309B() {
			return "\u00FE\uFF01\u0000\u0000\u0000\u0000\u00C7\u00D1\u00C8\u00D2\u00C9\u00D3\u00CA\u00D4\u00CB\u00D5\u00D6\u0000\u00D7\u0000\u00D8\u0000\u00D9\u0000\u00DA\u0000\u00DB\u0000\u00DC\u0000\u00DD\u0000\u00DE\u0000\u00DF\u0000\u00E0\u0000\u00E1\u0000\u00CF\u00E2\u0000\u00E3\u0000\u00E4\u0000\u00E5\u00E6\u00E7\u00E8\u00E9\u00EA\u0000\u0000\u00EB\u0000\u0000\u00EC\u0000\u0000\u00ED\u0000\u0000\u00EE\u0000\u0000\u00EF\u00F0\u00F1\u00F2\u00F3\u00CC\u00F4\u00CD\u00F5\u00CE\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u0000\u00FC\u0000\u0000\u00C6\u00FD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C5\u00D0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x7E) return input - 0x20 + 0x20;
			if (input >= 0xC3 && input <= 0xFC) return GETOUTPUT0_C3[input - 0xC3];
			if (input >= 0x309B && input <= 0x30FC) return GETOUTPUT0_309B[input - 0x309B];
			if (input >= 0xFF01 && input <= 0xFF5E) return input - 0xFF01 + 0x21;
			if (input >= 0xFF61 && input <= 0xFF9E) return input - 0xFF61 + 0xC1;
			switch (input) {
			case 0x0: return 0x1L;
			case 0xA0: return 0x80L;
			case 0xA3: return 0x101L;
			case 0xA5: return 0xC0L;
			case 0xA7: return 0x1BL;
			case 0xAC: return 0x601L;
			case 0xB1: return 0x7FL;
			case 0x2DC: return 0x1FL;
			case 0x240D: return 0xDL;
			case 0x2588: return 0xBFL;
			case 0x258C: return 0x95L;
			case 0x2590: return 0xAAL;
			case 0x3001: return 0xC4L;
			case 0x3002: return 0xC1L;
			case 0x300C: return 0xC2L;
			case 0x300D: return 0xC3L;
			case 0xFF9F: return 0xFF01L;
			case 0xFFE1: return 0x101L;
			case 0xFFE2: return 0x601L;
			case 0xFFE5: return 0xC0L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xDF00 && input <= 0xDF13) return input - 0xDF00 + 0x81;
			if (input >= 0xDF14 && input <= 0xDF27) return input - 0xDF14 + 0x96;
			if (input >= 0xDF28 && input <= 0xDF3B) return input - 0xDF28 + 0xAB;
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
