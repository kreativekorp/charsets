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
	private final int stackSize;
	
	protected TableCharsetEncoder(
		Charset cs, float avgbpc, float maxbpc, byte[] rep,
		Map<Integer,Integer> stateTable,
		Map<Integer,Long> outputTable,
		int stackSize
	) {
		super(cs, avgbpc, maxbpc, rep);
		this.stateTable = stateTable;
		this.outputTable = outputTable;
		this.stackSize = stackSize;
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
		int[] stack = new int[stackSize];
		while (in.hasRemaining()) {
			int ip = in.position();
			int sp = 0;
			int state = 0;
			int key = in.get() & 0xFFFF;
			while (stateTable.containsKey(key) && in.hasRemaining()) {
				stack[sp++] = key;
				state = stateTable.get(key);
				key = (state << 16) | (in.get() & 0xFFFF);
			}
			for (;;) {
				if (outputTable.containsKey(key)) {
					int op = out.position();
					if (write(out, outputTable.get(key))) {
						in.position(ip + sp + 1);
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
				key = stack[--sp];
			}
		}
		return CoderResult.UNDERFLOW;
	}
}
