package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XTrs80CocoT1VideoCharset extends Charset {
	public XTrs80CocoT1VideoCharset() {
		super("x-trs80-coco-t1-video", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XTrs80CocoT1VideoCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XTrs80CocoT1VideoCharsetEncoder(this);
	}

	private static final class XTrs80CocoT1VideoCharsetDecoder extends TableCharsetDecoder {
		private XTrs80CocoT1VideoCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x1 && input <= 0x1E) return input - 0x1 + 0x61;
			if (input >= 0x20 && input <= 0x5D) return input - 0x20 + 0x20;
			if (input >= 0x60 && input <= 0x7F) return input - 0x60 + 0x20;
			if (input >= 0x80 && input <= 0xFF) return CommonSubtables.COMMON1750[input - 0x80];
			switch (input) {
			case 0x0: return 0x5EL;
			case 0x1F: return 0x5FL;
			case 0x5E: return 0x2191L;
			case 0x5F: return 0x2190L;
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

	private static final class XTrs80CocoT1VideoCharsetEncoder extends TableCharsetEncoder {
		private XTrs80CocoT1VideoCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{127}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x20 && input <= 0x3F) return input - 0x20 + 0x60;
			if (input >= 0x40 && input <= 0x5D) return input - 0x40 + 0x40;
			if (input >= 0x68 && input <= 0x7E) return input - 0x68 + 0x8;
			switch (input) {
			case 0x5E: return 0x1L;
			case 0x5F: return 0x1FL;
			case 0x61: return 0x101L;
			case 0x62: return 0x201L;
			case 0x63: return 0x301L;
			case 0x64: return 0x401L;
			case 0x65: return 0x501L;
			case 0x66: return 0x601L;
			case 0x67: return 0x701L;
			case 0xA0: return 0x80L;
			case 0x2190: return 0x5FL;
			case 0x2191: return 0x5EL;
			case 0x2580: return 0x8CL;
			case 0x2584: return 0x83L;
			case 0x2588: return 0x8FL;
			case 0x258C: return 0x8AL;
			case 0x2590: return 0x85L;
			case 0x2596: return 0x82L;
			case 0x2597: return 0x81L;
			case 0x2598: return 0x88L;
			case 0x2599: return 0x8BL;
			case 0x259A: return 0x89L;
			case 0x259B: return 0x8EL;
			case 0x259C: return 0x8DL;
			case 0x259D: return 0x84L;
			case 0x259E: return 0x86L;
			case 0x259F: return 0x87L;
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
