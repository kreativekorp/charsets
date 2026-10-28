package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XAnsiX341963Charset extends Charset {
	public XAnsiX341963Charset() {
		super("x-ansi-x34-1963", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XAnsiX341963CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XAnsiX341963CharsetEncoder(this);
	}

	private static final class XAnsiX341963CharsetDecoder extends TableCharsetDecoder {
		private XAnsiX341963CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x7 && input <= 0x17) return input - 0x7 + 0x7;
			if (input >= 0x1C && input <= 0x5D) return input - 0x1C + 0x1C;
			switch (input) {
			case 0x0: return 0xFFFEL;
			case 0x1: return 0x1L;
			case 0x2: return 0x2L;
			case 0x3: return 0x3L;
			case 0x4: return 0x4L;
			case 0x5: return 0x5L;
			case 0x6: return 0x99L;
			case 0x18: return 0x80L;
			case 0x19: return 0x81L;
			case 0x1A: return 0x91L;
			case 0x1B: return 0x92L;
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x2190L;
			case 0x7C: return 0x6L;
			case 0x7E: return 0x1BL;
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

	private static final class XAnsiX341963CharsetEncoder extends TableCharsetEncoder {
		private XAnsiX341963CharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x8 && input <= 0x17) return input - 0x8 + 0x8;
			if (input >= 0x1C && input <= 0x5D) return input - 0x1C + 0x1C;
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0x41;
			switch (input) {
			case 0x0: return 0x1L;
			case 0x1: return 0x101L;
			case 0x2: return 0x201L;
			case 0x3: return 0x301L;
			case 0x4: return 0x401L;
			case 0x5: return 0x501L;
			case 0x6: return 0x7CL;
			case 0x7: return 0x701L;
			case 0x1B: return 0x7EL;
			case 0x7F: return 0x7FL;
			case 0x80: return 0x18L;
			case 0x81: return 0x19L;
			case 0x91: return 0x1AL;
			case 0x92: return 0x1BL;
			case 0x99: return 0x601L;
			case 0x2190: return 0x5FL;
			case 0x2191: return 0x5EL;
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
