package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XEcma1Gb2Charset extends Charset {
	public XEcma1Gb2Charset() {
		super("x-ecma1-gb2", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XEcma1Gb2CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XEcma1Gb2CharsetEncoder(this);
	}

	private static final class XEcma1Gb2CharsetDecoder extends TableCharsetDecoder {
		private XEcma1Gb2CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x8 && input <= 0x1E) return input - 0x8 + 0x28;
			if (input >= 0x21 && input <= 0x3B) return input - 0x21 + 0x41;
			switch (input) {
			case 0x0: return 0x20L;
			case 0x1: return 0x9L;
			case 0x2: return 0xAL;
			case 0x3: return 0xBL;
			case 0x4: return 0xCL;
			case 0x5: return 0xDL;
			case 0x6: return 0xEL;
			case 0x7: return 0xFL;
			case 0x1F: return 0x27L;
			case 0x20: return 0xFFFEL;
			case 0x3C: return 0xA3L;
			case 0x3D: return 0x5DL;
			case 0x3E: return 0x1BL;
			case 0x3F: return 0x7FL;
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

	private static final class XEcma1Gb2CharsetEncoder extends TableCharsetEncoder {
		private XEcma1Gb2CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{0}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x28 && input <= 0x3E) return input - 0x28 + 0x8;
			if (input >= 0x41 && input <= 0x5B) return input - 0x41 + 0x21;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x21;
			switch (input) {
			case 0x0: return 0x20L;
			case 0x9: return 0x101L;
			case 0xA: return 0x201L;
			case 0xB: return 0x301L;
			case 0xC: return 0x401L;
			case 0xD: return 0x501L;
			case 0xE: return 0x601L;
			case 0xF: return 0x701L;
			case 0x1B: return 0x3EL;
			case 0x20: return 0x1L;
			case 0x27: return 0x1FL;
			case 0x5D: return 0x3DL;
			case 0x7F: return 0x3FL;
			case 0xA3: return 0x3CL;
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
