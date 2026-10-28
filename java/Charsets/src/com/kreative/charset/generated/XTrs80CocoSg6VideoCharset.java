package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTrs80CocoSg6VideoCharset extends Charset {
	public XTrs80CocoSg6VideoCharset() {
		super("x-trs80-coco-sg6-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTrs80CocoSg6VideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTrs80CocoSg6VideoCharsetEncoder(this);
	}

	private static final class XTrs80CocoSg6VideoCharsetDecoder extends TableCharsetDecoder {
		private XTrs80CocoSg6VideoCharsetDecoder(Charset cs) {
			super(cs, 1.9375f, 2f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final int[] GETOUTPUT0_0 = getOutput0_0();
		private static final int[] getOutput0_0() {
			return new int[] {
				0xA0, 0xDF1ED83E, 0xDF0FD83E, 0xDF2DD83E, 0xDF07D83E, 0xDF26D83E, 0xDF16D83E, 0xDF35D83E, 0xDF03D83E, 0xDF22D83E, 0xDF13D83E, 0xDF31D83E, 0xDF0BD83E, 0xDF29D83E, 0xDF1AD83E, 0xDF39D83E,
				0xDF01D83E, 0xDF20D83E, 0xDF11D83E, 0xDF2FD83E, 0xDF09D83E, 0x2590, 0xDF18D83E, 0xDF37D83E, 0xDF05D83E, 0xDF24D83E, 0xDF14D83E, 0xDF33D83E, 0xDF0DD83E, 0xDF2BD83E, 0xDF1CD83E, 0xDF3BD83E,
				0xDF00D83E, 0xDF1FD83E, 0xDF10D83E, 0xDF2ED83E, 0xDF08D83E, 0xDF27D83E, 0xDF17D83E, 0xDF36D83E, 0xDF04D83E, 0xDF23D83E, 0x258C, 0xDF32D83E, 0xDF0CD83E, 0xDF2AD83E, 0xDF1BD83E, 0xDF3AD83E,
				0xDF02D83E, 0xDF21D83E, 0xDF12D83E, 0xDF30D83E, 0xDF0AD83E, 0xDF28D83E, 0xDF19D83E, 0xDF38D83E, 0xDF06D83E, 0xDF25D83E, 0xDF15D83E, 0xDF34D83E, 0xDF0ED83E, 0xDF2CD83E, 0xDF1DD83E, 0x2588,
				0xA0, 0xDF1ED83E, 0xDF0FD83E, 0xDF2DD83E, 0xDF07D83E, 0xDF26D83E, 0xDF16D83E, 0xDF35D83E, 0xDF03D83E, 0xDF22D83E, 0xDF13D83E, 0xDF31D83E, 0xDF0BD83E, 0xDF29D83E, 0xDF1AD83E, 0xDF39D83E,
				0xDF01D83E, 0xDF20D83E, 0xDF11D83E, 0xDF2FD83E, 0xDF09D83E, 0x2590, 0xDF18D83E, 0xDF37D83E, 0xDF05D83E, 0xDF24D83E, 0xDF14D83E, 0xDF33D83E, 0xDF0DD83E, 0xDF2BD83E, 0xDF1CD83E, 0xDF3BD83E,
				0xDF00D83E, 0xDF1FD83E, 0xDF10D83E, 0xDF2ED83E, 0xDF08D83E, 0xDF27D83E, 0xDF17D83E, 0xDF36D83E, 0xDF04D83E, 0xDF23D83E, 0x258C, 0xDF32D83E, 0xDF0CD83E, 0xDF2AD83E, 0xDF1BD83E, 0xDF3AD83E,
				0xDF02D83E, 0xDF21D83E, 0xDF12D83E, 0xDF30D83E, 0xDF0AD83E, 0xDF28D83E, 0xDF19D83E, 0xDF38D83E, 0xDF06D83E, 0xDF25D83E, 0xDF15D83E, 0xDF34D83E, 0xDF0ED83E, 0xDF2CD83E, 0xDF1DD83E, 0x2588,
				0xA0, 0xDF1ED83E, 0xDF0FD83E, 0xDF2DD83E, 0xDF07D83E, 0xDF26D83E, 0xDF16D83E, 0xDF35D83E, 0xDF03D83E, 0xDF22D83E, 0xDF13D83E, 0xDF31D83E, 0xDF0BD83E, 0xDF29D83E, 0xDF1AD83E, 0xDF39D83E,
				0xDF01D83E, 0xDF20D83E, 0xDF11D83E, 0xDF2FD83E, 0xDF09D83E, 0x2590, 0xDF18D83E, 0xDF37D83E, 0xDF05D83E, 0xDF24D83E, 0xDF14D83E, 0xDF33D83E, 0xDF0DD83E, 0xDF2BD83E, 0xDF1CD83E, 0xDF3BD83E,
				0xDF00D83E, 0xDF1FD83E, 0xDF10D83E, 0xDF2ED83E, 0xDF08D83E, 0xDF27D83E, 0xDF17D83E, 0xDF36D83E, 0xDF04D83E, 0xDF23D83E, 0x258C, 0xDF32D83E, 0xDF0CD83E, 0xDF2AD83E, 0xDF1BD83E, 0xDF3AD83E,
				0xDF02D83E, 0xDF21D83E, 0xDF12D83E, 0xDF30D83E, 0xDF0AD83E, 0xDF28D83E, 0xDF19D83E, 0xDF38D83E, 0xDF06D83E, 0xDF25D83E, 0xDF15D83E, 0xDF34D83E, 0xDF0ED83E, 0xDF2CD83E, 0xDF1DD83E, 0x2588,
				0xA0, 0xDF1ED83E, 0xDF0FD83E, 0xDF2DD83E, 0xDF07D83E, 0xDF26D83E, 0xDF16D83E, 0xDF35D83E, 0xDF03D83E, 0xDF22D83E, 0xDF13D83E, 0xDF31D83E, 0xDF0BD83E, 0xDF29D83E, 0xDF1AD83E, 0xDF39D83E,
				0xDF01D83E, 0xDF20D83E, 0xDF11D83E, 0xDF2FD83E, 0xDF09D83E, 0x2590, 0xDF18D83E, 0xDF37D83E, 0xDF05D83E, 0xDF24D83E, 0xDF14D83E, 0xDF33D83E, 0xDF0DD83E, 0xDF2BD83E, 0xDF1CD83E, 0xDF3BD83E,
				0xDF00D83E, 0xDF1FD83E, 0xDF10D83E, 0xDF2ED83E, 0xDF08D83E, 0xDF27D83E, 0xDF17D83E, 0xDF36D83E, 0xDF04D83E, 0xDF23D83E, 0x258C, 0xDF32D83E, 0xDF0CD83E, 0xDF2AD83E, 0xDF1BD83E, 0xDF3AD83E,
				0xDF02D83E, 0xDF21D83E, 0xDF12D83E, 0xDF30D83E, 0xDF0AD83E, 0xDF28D83E, 0xDF19D83E, 0xDF38D83E, 0xDF06D83E, 0xDF25D83E, 0xDF15D83E, 0xDF34D83E, 0xDF0ED83E, 0xDF2CD83E, 0xDF1DD83E, 0x2588,
			};
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

	private static final class XTrs80CocoSg6VideoCharsetEncoder extends TableCharsetEncoder {
		private XTrs80CocoSg6VideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{-1}, 2);
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
			switch (input) {
			case 0xA0: return 0x80L;
			case 0x2588: return 0xBFL;
			case 0x258C: return 0xAAL;
			case 0x2590: return 0x95L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT1_DF00 = getOutput1_DF00();
		private static final char[] getOutput1_DF00() {
			return "\u00A0\u0090\u00B0\u0088\u00A8\u0098\u00B8\u0084\u00A4\u0094\u00B4\u008C\u00AC\u009C\u00BC\u0082\u00A2\u0092\u00B2\u008A\u009A\u00BA\u0086\u00A6\u0096\u00B6\u008E\u00AE\u009E\u00BE\u0081\u00A1\u0091\u00B1\u0089\u00A9\u0099\u00B9\u0085\u00A5\u00B5\u008D\u00AD\u009D\u00BD\u0083\u00A3\u0093\u00B3\u008B\u00AB\u009B\u00BB\u0087\u00A7\u0097\u00B7\u008F\u00AF\u009F".toCharArray();
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
