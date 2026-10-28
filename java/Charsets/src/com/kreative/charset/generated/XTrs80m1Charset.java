package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTrs80m1Charset extends Charset {
	public XTrs80m1Charset() {
		super("x-trs80m1", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTrs80m1CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTrs80m1CharsetEncoder(this);
	}

	private static final class XTrs80m1CharsetDecoder extends TableCharsetDecoder {
		private XTrs80m1CharsetDecoder(Charset cs) {
			super(cs, 1.3125f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_7B = getOutput0_7B();
		private static final int[] getOutput0_7B() {
			return new int[] {
				0x2191, 0x2193, 0x2190, 0x2192, 0x5F, 0xA0, 0xDF00D83E, 0xDF01D83E, 0xDF02D83E, 0xDF03D83E, 0xDF04D83E, 0xDF05D83E, 0xDF06D83E, 0xDF07D83E, 0xDF08D83E, 0xDF09D83E,
				0xDF0AD83E, 0xDF0BD83E, 0xDF0CD83E, 0xDF0DD83E, 0xDF0ED83E, 0xDF0FD83E, 0xDF10D83E, 0xDF11D83E, 0xDF12D83E, 0xDF13D83E, 0x258C, 0xDF14D83E, 0xDF15D83E, 0xDF16D83E, 0xDF17D83E, 0xDF18D83E,
				0xDF19D83E, 0xDF1AD83E, 0xDF1BD83E, 0xDF1CD83E, 0xDF1DD83E, 0xDF1ED83E, 0xDF1FD83E, 0xDF20D83E, 0xDF21D83E, 0xDF22D83E, 0xDF23D83E, 0xDF24D83E, 0xDF25D83E, 0xDF26D83E, 0xDF27D83E, 0x2590,
				0xDF28D83E, 0xDF29D83E, 0xDF2AD83E, 0xDF2BD83E, 0xDF2CD83E, 0xDF2DD83E, 0xDF2ED83E, 0xDF2FD83E, 0xDF30D83E, 0xDF31D83E, 0xDF32D83E, 0xDF33D83E, 0xDF34D83E, 0xDF35D83E, 0xDF36D83E, 0xDF37D83E,
				0xDF38D83E, 0xDF39D83E, 0xDF3AD83E, 0xDF3BD83E, 0x2588,
			};
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5A) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7A) return input - 0x60 + 0x40;
			if (input >= 0x7B && input <= 0xBF) return GETOUTPUT0_7B[input - 0x7B];
			switch (input) {
			case 0x5B: return 0x2191L;
			case 0x5C: return 0x2193L;
			case 0x5D: return 0x2190L;
			case 0x5E: return 0x2192L;
			case 0x5F: return 0x5FL;
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

	private static final class XTrs80m1CharsetEncoder extends TableCharsetEncoder {
		private XTrs80m1CharsetEncoder(Charset cs) {
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
			if (input >= 0x20 && input <= 0x5A) return input - 0x20 + 0x20;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x41;
			switch (input) {
			case 0x5F: return 0x5FL;
			case 0xA0: return 0x80L;
			case 0x2190: return 0x5DL;
			case 0x2191: return 0x5BL;
			case 0x2192: return 0x5EL;
			case 0x2193: return 0x5CL;
			case 0x2588: return 0xBFL;
			case 0x258C: return 0x95L;
			case 0x2590: return 0xAAL;
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
