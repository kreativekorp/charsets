package com.kreative.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public abstract class TableCharsetEncoder extends CharsetEncoder {
	private final int maxin;
	
	protected TableCharsetEncoder(Charset cs, float avgbpc, float maxbpc, byte[] rep, int maxin) {
		super(cs, avgbpc, maxbpc, rep);
		this.maxin = maxin;
	}
	
	private static final boolean write(ByteBuffer out, long output) {
		byte b = (byte)output;
		if (b > 0 && b < 8) {
			for (;;) {
				if (!out.hasRemaining()) return false;
				output >>= 8; out.put((byte)output);
				b--; if (b == 0) return true;
			}
		} else {
			for (;;) {
				if (b == (byte)0x00) return true;
				if (b == (byte)0xFF) return true;
				if (!out.hasRemaining()) return false;
				out.put(b); output >>= 8;
				b = (byte)output;
			}
		}
	}
	
	protected abstract int getNextState(int state, int input);
	protected abstract long getOutput(int state, int input);
	
	@Override
	protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
		int[] stack = new int[maxin << 1];
		while (in.hasRemaining()) {
			int ip = in.position();
			int sp = 0;
			int state = 0;
			int input = in.get() & 0xFFFF;
			int nextState = getNextState(state, input);
			while (nextState != 0 && in.hasRemaining()) {
				stack[sp++] = state;
				stack[sp++] = input;
				state = nextState;
				input = in.get() & 0xFFFF;
				nextState = getNextState(state, input);
			}
			for (;;) {
				long output = getOutput(state, input);
				if (output != 0) {
					int op = out.position();
					if (write(out, output)) {
						in.position(ip + (sp >> 1) + 1);
						break;
					}
					out.position(op);
					in.position(ip);
					return CoderResult.OVERFLOW;
				}
				if (sp == 0) {
					in.position(ip);
					if (Character.isHighSurrogate(in.get())) {
						if (in.hasRemaining()) {
							if (Character.isLowSurrogate(in.get())) {
								in.position(ip);
								return CoderResult.unmappableForLength(2);
							}
						}
					}
					in.position(ip);
					return CoderResult.unmappableForLength(1);
				}
				input = stack[--sp];
				state = stack[--sp];
			}
		}
		return CoderResult.UNDERFLOW;
	}
}
