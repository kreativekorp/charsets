package com.kreative.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public abstract class TableCharsetDecoder extends CharsetDecoder {
	private final int maxin;
	
	protected TableCharsetDecoder(Charset cs, float avgcpb, float maxcpb, int maxin) {
		super(cs, avgcpb, maxcpb);
		this.maxin = maxin;
	}
	
	private static final boolean write(CharBuffer out, long output) {
		for (;;) {
			char ch = (char)output;
			if (ch == (char)0x0000) return true;
			if (ch == (char)0xFFFF) return true;
			if (!out.hasRemaining()) return false;
			if (ch == (char)0xFFFE) ch = (char)0x0000;
			out.put(ch); output >>= 16;
		}
	}
	
	protected abstract int getNextState(int state, int input);
	protected abstract long getOutput(int state, int input);
	
	@Override
	protected CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
		int[] stack = new int[maxin << 1];
		while (in.hasRemaining()) {
			int ip = in.position();
			int sp = 0;
			int state = 0;
			int input = in.get() & 0xFF;
			int nextState = getNextState(state, input);
			while (nextState != 0 && in.hasRemaining()) {
				stack[sp++] = state;
				stack[sp++] = input;
				state = nextState;
				input = in.get() & 0xFF;
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
					return CoderResult.unmappableForLength(1);
				}
				input = stack[--sp];
				state = stack[--sp];
			}
		}
		return CoderResult.UNDERFLOW;
	}
}
