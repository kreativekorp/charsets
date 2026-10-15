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
	private final int stackSize;
	
	protected TableCharsetDecoder(
		Charset cs, float avgcpb, float maxcpb,
		Map<Integer,Integer> stateTable,
		Map<Integer,Long> outputTable,
		int stackSize
	) {
		super(cs, avgcpb, maxcpb);
		this.stateTable = stateTable;
		this.outputTable = outputTable;
		this.stackSize = stackSize;
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
		int[] stack = new int[stackSize];
		while (in.hasRemaining()) {
			int ip = in.position();
			int sp = 0;
			int state = 0;
			int key = in.get() & 0xFF;
			while (stateTable.containsKey(key) && in.hasRemaining()) {
				stack[sp++] = key;
				state = stateTable.get(key);
				key = (state << 8) | (in.get() & 0xFF);
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
					return CoderResult.unmappableForLength(1);
				}
				key = stack[--sp];
			}
		}
		return CoderResult.UNDERFLOW;
	}
}
