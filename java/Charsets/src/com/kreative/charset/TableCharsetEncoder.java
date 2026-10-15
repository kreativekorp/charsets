package com.kreative.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Map;

public class TableCharsetEncoder extends CharsetEncoder {
	private final Map<Integer,Integer> stateTable;
	private final Map<Integer,Long> outputTable;
	private final int[] stack;
	private int sp, state;
	
	protected TableCharsetEncoder(
		Charset cs, float avgbpc, float maxbpc, byte[] rep,
		Map<Integer,Integer> stateTable,
		Map<Integer,Long> outputTable,
		int stackSize
	) {
		super(cs, avgbpc, maxbpc, rep);
		this.stateTable = stateTable;
		this.outputTable = outputTable;
		this.stack = new int[stackSize];
		this.sp = 0; this.state = 0;
	}
	
	@Override
	protected void implReset() {
		this.sp = 0;
		this.state = 0;
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
	
	@Override
	protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
		encodeLoop: while (in.hasRemaining()) {
			int ip = in.position();
			int key = (state << 16) | (in.get() & 0xFFFF);
			if (stateTable.containsKey(key)) {
				stack[sp++] = key;
				state = stateTable.get(key);
				continue encodeLoop;
			} else if (outputTable.containsKey(key)) {
				int op = out.position();
				if (write(out, outputTable.get(key))) {
					sp = 0; state = 0;
					continue encodeLoop;
				} else {
					out.position(op);
					in.position(ip);
					return CoderResult.OVERFLOW;
				}
			} else {
				int tp = sp;
				while (tp > 0) {
					key = stack[--tp];
					if (outputTable.containsKey(key)) {
						int op = out.position();
						if (write(out, outputTable.get(key))) {
							in.position(ip - sp + tp + 1);
							sp = 0; state = 0;
							continue encodeLoop;
						} else {
							out.position(op);
							in.position(ip);
							return CoderResult.OVERFLOW;
						}
					}
				}
				int len = sp + 1;
				in.position(ip - sp);
				sp = 0; state = 0;
				return CoderResult.unmappableForLength(len);
			}
		}
		return CoderResult.UNDERFLOW;
	}
	
	@Override
	protected CoderResult implFlush(ByteBuffer out) {
		int tp = sp;
		while (tp > 0) {
			int key = stack[--tp];
			if (outputTable.containsKey(key)) {
				int op = out.position();
				if (write(out, outputTable.get(key))) {
					int len = sp - tp - 1;
					if (len == 0) {
						sp = 0; state = 0;
						return CoderResult.UNDERFLOW;
					} else {
						char[] rem = new char[len];
						while (len > 0) rem[--len] = (char)stack[--sp];
						sp = 0; state = 0;
						CoderResult res = encodeLoop(CharBuffer.wrap(rem), out);
						if (res != CoderResult.UNDERFLOW) return res;
						return implFlush(out);
					}
				} else {
					out.position(op);
					return CoderResult.OVERFLOW;
				}
			}
		}
		int len = sp;
		sp = 0; state = 0;
		if (len == 0) return CoderResult.UNDERFLOW;
		return CoderResult.unmappableForLength(len);
	}
}
