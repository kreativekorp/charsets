package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAdobeDingbatsCharset extends Charset {
	public XAdobeDingbatsCharset() {
		super("x-adobe-dingbats", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAdobeDingbatsCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAdobeDingbatsCharsetEncoder(this);
	}

	private static final class XAdobeDingbatsCharsetDecoder extends TableCharsetDecoder {
		private XAdobeDingbatsCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x2C && input <= 0x47) return input - 0x2C + 0x270C;
			if (input >= 0x49 && input <= 0x6B) return input - 0x49 + 0x2729;
			if (input >= 0x6C && input <= 0x8D) return CommonSubtables.COMMON1134[input - 0x6C];
			if (input >= 0xB6 && input <= 0xD4) return input - 0xB6 + 0x2776;
			if (input >= 0xA1 && input <= 0xB5) return CommonSubtables.COMMON1135[input - 0xA1];
			if (input >= 0xD8 && input <= 0xEF) return input - 0xD8 + 0x2798;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x21: return 0x2701L;
			case 0x22: return 0x2702L;
			case 0x23: return 0x2703L;
			case 0x24: return 0x2704L;
			case 0x25: return 0x260EL;
			case 0x26: return 0x2706L;
			case 0x27: return 0x2707L;
			case 0x28: return 0x2708L;
			case 0x29: return 0x2709L;
			case 0x2A: return 0x261BL;
			case 0x2B: return 0x261EL;
			case 0x48: return 0x2605L;
			case 0xD5: return 0x2192L;
			case 0xD6: return 0x2194L;
			case 0xD7: return 0x2195L;
			case 0xF1: return 0x27B1L;
			case 0xF2: return 0x27B2L;
			case 0xF3: return 0x27B3L;
			case 0xF4: return 0x27B4L;
			case 0xF5: return 0x27B5L;
			case 0xF6: return 0x27B6L;
			case 0xF7: return 0x27B7L;
			case 0xF8: return 0x27B8L;
			case 0xF9: return 0x27B9L;
			case 0xFA: return 0x27BAL;
			case 0xFB: return 0x27BBL;
			case 0xFC: return 0x27BCL;
			case 0xFD: return 0x27BDL;
			case 0xFE: return 0x27BEL;
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

	private static final class XAdobeDingbatsCharsetEncoder extends TableCharsetEncoder {
		private XAdobeDingbatsCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{81}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x270C && input <= 0x2727) return input - 0x270C + 0x2C;
			if (input >= 0x2729 && input <= 0x274B) return input - 0x2729 + 0x49;
			if (input >= 0x2776 && input <= 0x2794) return input - 0x2776 + 0xB6;
			if (input >= 0x274D && input <= 0x2767) return CommonSubtables.COMMON1136[input - 0x274D];
			if (input >= 0x2798 && input <= 0x27AF) return input - 0x2798 + 0xD8;
			switch (input) {
			case 0x20: return 0x20L;
			case 0x7F: return 0x7FL;
			case 0x2192: return 0xD5L;
			case 0x2194: return 0xD6L;
			case 0x2195: return 0xD7L;
			case 0x2460: return 0xACL;
			case 0x2461: return 0xADL;
			case 0x2462: return 0xAEL;
			case 0x2463: return 0xAFL;
			case 0x2464: return 0xB0L;
			case 0x2465: return 0xB1L;
			case 0x2466: return 0xB2L;
			case 0x2467: return 0xB3L;
			case 0x2468: return 0xB4L;
			case 0x2469: return 0xB5L;
			case 0x25A0: return 0x6EL;
			case 0x25B2: return 0x73L;
			case 0x25BC: return 0x74L;
			case 0x25C6: return 0x75L;
			case 0x25CF: return 0x6CL;
			case 0x25D7: return 0x77L;
			case 0x2605: return 0x48L;
			case 0x260E: return 0x25L;
			case 0x261B: return 0x2AL;
			case 0x261E: return 0x2BL;
			case 0x2660: return 0xABL;
			case 0x2663: return 0xA8L;
			case 0x2665: return 0xAAL;
			case 0x2666: return 0xA9L;
			case 0x2701: return 0x21L;
			case 0x2702: return 0x22L;
			case 0x2703: return 0x23L;
			case 0x2704: return 0x24L;
			case 0x2706: return 0x26L;
			case 0x2707: return 0x27L;
			case 0x2708: return 0x28L;
			case 0x2709: return 0x29L;
			case 0x27B1: return 0xF1L;
			case 0x27B2: return 0xF2L;
			case 0x27B3: return 0xF3L;
			case 0x27B4: return 0xF4L;
			case 0x27B5: return 0xF5L;
			case 0x27B6: return 0xF6L;
			case 0x27B7: return 0xF7L;
			case 0x27B8: return 0xF8L;
			case 0x27B9: return 0xF9L;
			case 0x27BA: return 0xFAL;
			case 0x27BB: return 0xFBL;
			case 0x27BC: return 0xFCL;
			case 0x27BD: return 0xFDL;
			case 0x27BE: return 0xFEL;
			case 0xF8D7: return 0x80L;
			case 0xF8D8: return 0x81L;
			case 0xF8D9: return 0x82L;
			case 0xF8DA: return 0x83L;
			case 0xF8DB: return 0x84L;
			case 0xF8DC: return 0x85L;
			case 0xF8DD: return 0x86L;
			case 0xF8DE: return 0x87L;
			case 0xF8DF: return 0x88L;
			case 0xF8E0: return 0x89L;
			case 0xF8E1: return 0x8AL;
			case 0xF8E2: return 0x8BL;
			case 0xF8E3: return 0x8CL;
			case 0xF8E4: return 0x8DL;
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
