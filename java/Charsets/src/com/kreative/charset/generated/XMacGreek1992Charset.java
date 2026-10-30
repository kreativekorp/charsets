package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacGreek1992Charset extends Charset {
	public XMacGreek1992Charset() {
		super("x-MacGreek-1992", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacGreek1992CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacGreek1992CharsetEncoder(this);
	}

	private static final class XMacGreek1992CharsetDecoder extends TableCharsetDecoder {
		private XMacGreek1992CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u00C4\u00B9\u00B2\u00C9\u00B3\u00D6\u00DC\u0385\u00E0\u00E2\u00E4\u0384\u00A8\u00E7\u00E9\u00E8\u00EA\u00EB\u00A3\u2122\u00EE\u00EF\u2022\u00BD\u2030\u00F4\u00F6\u00A6\u00AD\u00F9\u00FB\u00FC\u2020\u0393\u0394\u0398\u039B\u039E\u03A0\u00DF\u00AE\u00A9\u03A3\u03AA\u00A7\u2260\u00B0\u0387\u0391\u00B1\u2264\u2265\u00A5\u0392\u0395\u0396\u0397\u0399\u039A\u039C\u03A6\u03AB\u03A8\u03A9\u03AC\u039D\u00AC\u039F\u03A1\u2248\u03A4\u00AB\u00BB\u2026\u00A0\u03A5\u03A7\u0386\u0388\u0153\u2013\u2015\u201C\u201D\u2018\u2019\u00F7\u0389\u038A\u038C\u038E\u03AD\u03AE\u03AF\u03CC\u038F\u03CD\u03B1\u03B2\u03C8\u03B4\u03B5\u03C6\u03B3\u03B7\u03B9\u03BE\u03BA\u03BB\u03BC\u03BD\u03BF\u03C0\u03CE\u03C1\u03C3\u03C4\u03B8\u03C9\u03C2\u03C7\u03C5\u03B6\u03CA\u03CB\u0390\u03B0".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFE) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMacGreek1992CharsetEncoder extends TableCharsetEncoder {
		private XMacGreek1992CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA0 && input <= 0xFC) return CommonSubtables.COMMON1141[input - 0xA0];
			if (input >= 0x384 && input <= 0x3CE) return CommonSubtables.COMMON1142[input - 0x384];
			switch (input) {
			case 0x153: return 0xCFL;
			case 0x2013: return 0xD0L;
			case 0x2015: return 0xD1L;
			case 0x2018: return 0xD4L;
			case 0x2019: return 0xD5L;
			case 0x201C: return 0xD2L;
			case 0x201D: return 0xD3L;
			case 0x2020: return 0xA0L;
			case 0x2022: return 0x96L;
			case 0x2026: return 0xC9L;
			case 0x2030: return 0x98L;
			case 0x2122: return 0x93L;
			case 0x2248: return 0xC5L;
			case 0x2260: return 0xADL;
			case 0x2264: return 0xB2L;
			case 0x2265: return 0xB3L;
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
