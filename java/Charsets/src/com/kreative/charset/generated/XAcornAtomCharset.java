package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAcornAtomCharset extends Charset {
	public XAcornAtomCharset() {
		super("x-acorn-atom", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAcornAtomCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAcornAtomCharsetEncoder(this);
	}

	private static final class XAcornAtomCharsetDecoder extends TableCharsetDecoder {
		private XAcornAtomCharsetDecoder(Charset cs) {
			super(cs, 1.35156f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_A0 = getOutput0_A0();
		private static final int[] getOutput0_A0() {
			return new int[] {
				0xA0, 0xDF1ED83E, 0xDF0FD83E, 0xDF2DD83E, 0xDF07D83E, 0xDF26D83E, 0xDF16D83E, 0xDF35D83E, 0xDF03D83E, 0xDF22D83E, 0xDF13D83E, 0xDF31D83E, 0xDF0BD83E, 0xDF29D83E, 0xDF1AD83E, 0xDF39D83E,
				0xDF01D83E, 0xDF20D83E, 0xDF11D83E, 0xDF2FD83E, 0xDF09D83E, 0x2590, 0xDF18D83E, 0xDF37D83E, 0xDF05D83E, 0xDF24D83E, 0xDF14D83E, 0xDF33D83E, 0xDF0DD83E, 0xDF2BD83E, 0xDF1CD83E, 0xDF3BD83E,
				0xDF00D83E, 0xDF1FD83E, 0xDF10D83E, 0xDF2ED83E, 0xDF08D83E, 0xDF27D83E, 0xDF17D83E, 0xDF36D83E, 0xDF04D83E, 0xDF23D83E, 0x258C, 0xDF32D83E, 0xDF0CD83E, 0xDF2AD83E, 0xDF1BD83E, 0xDF3AD83E,
				0xDF02D83E, 0xDF21D83E, 0xDF12D83E, 0xDF30D83E, 0xDF0AD83E, 0xDF28D83E, 0xDF19D83E, 0xDF38D83E, 0xDF06D83E, 0xDF25D83E, 0xDF15D83E, 0xDF34D83E, 0xDF0ED83E, 0xDF2CD83E, 0xDF1DD83E, 0x2588,
				0xDF00D83E, 0xDF1FD83E, 0xDF10D83E, 0xDF2ED83E, 0xDF08D83E, 0xDF27D83E, 0xDF17D83E, 0xDF36D83E, 0xDF04D83E, 0xDF23D83E, 0x258C, 0xDF32D83E, 0xDF0CD83E, 0xDF2AD83E, 0xDF1BD83E, 0xDF3AD83E,
				0xDF02D83E, 0xDF21D83E, 0xDF12D83E, 0xDF30D83E, 0xDF0AD83E, 0xDF28D83E, 0xDF19D83E, 0xDF38D83E, 0xDF06D83E, 0xDF25D83E, 0xDF15D83E, 0xDF34D83E, 0xDF0ED83E, 0xDF2CD83E, 0xDF1DD83E, 0x2588,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7D) return input - 0x60 + 0x40;
			if (input >= 0x80 && input <= 0x9F) return input - 0x80 + 0x20;
			if (input >= 0xA0 && input <= 0xFF) return GETOUTPUT0_A0[input - 0xA0];
			switch (input) {
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x2190L;
			case 0x7E: return 0x2191L;
			case 0x7F: return 0x7FL;
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

	private static final class XAcornAtomCharsetEncoder extends TableCharsetEncoder {
		private XAcornAtomCharsetEncoder(Charset cs) {
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
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x41;
			switch (input) {
			case 0x7F: return 0x7FL;
			case 0xA0: return 0xA0L;
			case 0x2190: return 0x5FL;
			case 0x2191: return 0x5EL;
			case 0x2588: return 0xDFL;
			case 0x258C: return 0xCAL;
			case 0x2590: return 0xB5L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DF00 = getOutput1_DF00();
		private static final char[] getOutput1_DF00() {
			return "\u00C0\u00B0\u00D0\u00A8\u00C8\u00B8\u00D8\u00A4\u00C4\u00B4\u00D4\u00AC\u00CC\u00BC\u00DC\u00A2\u00C2\u00B2\u00D2\u00AA\u00BA\u00DA\u00A6\u00C6\u00B6\u00D6\u00AE\u00CE\u00BE\u00DE\u00A1\u00C1\u00B1\u00D1\u00A9\u00C9\u00B9\u00D9\u00A5\u00C5\u00D5\u00AD\u00CD\u00BD\u00DD\u00A3\u00C3\u00B3\u00D3\u00AB\u00CB\u00BB\u00DB\u00A7\u00C7\u00B7\u00D7\u00AF\u00CF\u00BF".toCharArray();
		}
		private long getOutput1(int input) {
			if (input >= 0xDF00 && input <= 0xDF3B) return GETOUTPUT1_DF00[input - 0xDF00];
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
