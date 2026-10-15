package com.kreative.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.util.Map;

public class TableCharsetDecoder extends CharsetDecoder {
	private final Map<Integer,Integer> stateTable;
	private final Map<Integer,Long> outputTable;
	private final int[] stack;
	private int sp, state;
	
	protected TableCharsetDecoder(
		Charset cs, float avgcpb, float maxcpb,
		Map<Integer,Integer> stateTable,
		Map<Integer,Long> outputTable,
		int stackSize
	) {
		super(cs, avgcpb, maxcpb);
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
	
	@Override
	protected CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
		decodeLoop: while (in.hasRemaining()) {
			int ip = in.position();
			int key = (state << 8) | (in.get() & 0xFF);
			if (stateTable.containsKey(key)) {
				stack[sp++] = key;
				state = stateTable.get(key);
				continue decodeLoop;
			} else if (outputTable.containsKey(key)) {
				int op = out.position();
				if (write(out, outputTable.get(key))) {
					sp = 0; state = 0;
					continue decodeLoop;
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
							continue decodeLoop;
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
	protected CoderResult implFlush(CharBuffer out) {
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
						byte[] rem = new byte[len];
						while (len > 0) rem[--len] = (byte)stack[--sp];
						sp = 0; state = 0;
						CoderResult res = decodeLoop(ByteBuffer.wrap(rem), out);
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
