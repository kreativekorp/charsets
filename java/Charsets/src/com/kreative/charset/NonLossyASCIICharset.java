package com.kreative.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

// Implements the "Non-Lossy ASCII" encoding from NeXTSTEP and Mac OS X.
public class NonLossyASCIICharset extends Charset {
	public NonLossyASCIICharset() {
		super("x-us-ascii-non-lossy", new String[]{});
	}
	
	public boolean contains(Charset cs) {
		return true;
	}
	
	public CharsetDecoder newDecoder() {
		return new NonLossyASCIICharsetDecoder(this);
	}
	
	public CharsetEncoder newEncoder() {
		return new NonLossyASCIICharsetEncoder(this);
	}
	
	private static final class NonLossyASCIICharsetDecoder extends CharsetDecoder {
		private static final Object readDigits(ByteBuffer in, int count, int radix, int prefixLen) {
			int value = 0;
			for (int i = 0; i < count; i++) {
				if (!in.hasRemaining()) return CoderResult.UNDERFLOW;
				int digit = Character.digit(in.get(), radix);
				if (digit < 0) return CoderResult.malformedForLength(prefixLen + i);
				value = value * radix + digit;
			}
			return value;
		}
		private static final boolean write(CharBuffer out, int... output) {
			for (int c : output) {
				if (!out.hasRemaining()) return false;
				out.put((char)c);
			}
			return true;
		}
		private NonLossyASCIICharsetDecoder(Charset cs) {
			super(cs, 1, 1);
		}
		protected CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
			while (in.hasRemaining()) {
				int ip = in.position();
				byte b = in.get();
				if (b == (byte)'\\') {
					if (in.hasRemaining()) {
						byte e = in.get();
						if (e == (byte)'\\') {
							int op = out.position();
							if (write(out, '\\')) continue;
							out.position(op);
							in.position(ip);
							return CoderResult.OVERFLOW;
						} else if (e == (byte)'u' || e == (byte)'U') {
							Object r = readDigits(in, 4, 16, 2);
							if (r instanceof CoderResult) {
								in.position(ip);
								return (CoderResult)r;
							}
							int c = (Integer)r;
							if (c >= 0xD800 && c <= 0xDBFF) {
								if (in.hasRemaining()) {
									byte b2 = in.get();
									if (b2 == (byte)'\\') {
										if (in.hasRemaining()) {
											byte e2 = in.get();
											if (e2 == (byte)'u' || e2 == (byte)'U') {
												Object r2 = readDigits(in, 4, 16, 8);
												if (r2 instanceof CoderResult) {
													in.position(ip);
													return (CoderResult)r;
												}
												int c2 = (Integer)r2;
												if (c2 >= 0xDC00 && c2 <= 0xDFFF) {
													int op = out.position();
													if (write(out, c, c2)) continue;
													out.position(op);
													in.position(ip);
													return CoderResult.OVERFLOW;
												}
											}
											in.position(ip);
											return CoderResult.malformedForLength(6);
										}
										in.position(ip);
										return CoderResult.UNDERFLOW;
									}
									in.position(ip);
									return CoderResult.malformedForLength(6);
								}
								in.position(ip);
								return CoderResult.UNDERFLOW;
							} else if (c >= 0xDC00 && c <= 0xDFFF) {
								in.position(ip);
								return CoderResult.malformedForLength(6);
							} else {
								int op = out.position();
								if (write(out, c)) continue;
								out.position(op);
								in.position(ip);
								return CoderResult.OVERFLOW;
							}
						} else if (e >= (byte)'0' && e <= (byte)'3') {
							Object r = readDigits(in, 2, 8, 2);
							if (r instanceof CoderResult) {
								in.position(ip);
								return (CoderResult)r;
							}
							int c = ((e & 7) << 6) | (Integer)r;
							int op = out.position();
							if (write(out, c)) continue;
							out.position(op);
							in.position(ip);
							return CoderResult.OVERFLOW;
						}
						in.position(ip);
						return CoderResult.malformedForLength(2);
					}
					in.position(ip);
					return CoderResult.UNDERFLOW;
				} else if (b < 0) {
					in.position(ip);
					return CoderResult.malformedForLength(1);
				} else {
					int op = out.position();
					if (write(out, b)) continue;
					out.position(op);
					in.position(ip);
					return CoderResult.OVERFLOW;
				}
			}
			return CoderResult.UNDERFLOW;
		}
	}
	
	private static final class NonLossyASCIICharsetEncoder extends CharsetEncoder {
		private static final char[] ALPHABET = "0123456789abcdef".toCharArray();
		private static final boolean write(ByteBuffer out, int... output) {
			for (int b : output) {
				if (!out.hasRemaining()) return false;
				out.put((byte)b);
			}
			return true;
		}
		private static final boolean writeOct(ByteBuffer out, int output) {
			return write(
				out, '\\',
				ALPHABET[(output >> 6) & 3],
				ALPHABET[(output >> 3) & 7],
				ALPHABET[(output >> 0) & 7]
			);
		}
		private static final boolean writeHex(ByteBuffer out, int output) {
			return write(
				out, '\\', 'u',
				ALPHABET[(output >> 12) & 15],
				ALPHABET[(output >>  8) & 15],
				ALPHABET[(output >>  4) & 15],
				ALPHABET[(output >>  0) & 15]
			);
		}
		private NonLossyASCIICharsetEncoder(Charset cs) {
			super(cs, 6, 6, new byte[]{'\\','u','f','f','f','d'});
		}
		protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
			while (in.hasRemaining()) {
				int ip = in.position();
				char ch = in.get();
				if (ch == '\\') {
					int op = out.position();
					if (write(out, '\\', '\\')) continue;
					out.position(op);
					in.position(ip);
					return CoderResult.OVERFLOW;
				} else if (ch <= 0x7F) {
					int op = out.position();
					if (write(out, ch)) continue;
					out.position(op);
					in.position(ip);
					return CoderResult.OVERFLOW;
				} else if (ch <= 0xFF) {
					int op = out.position();
					if (writeOct(out, ch)) continue;
					out.position(op);
					in.position(ip);
					return CoderResult.OVERFLOW;
				} else if (Character.isHighSurrogate(ch)) {
					if (in.hasRemaining()) {
						char cl = in.get();
						if (Character.isLowSurrogate(cl)) {
							int op = out.position();
							if (writeHex(out, ch) && writeHex(out, cl)) continue;
							out.position(op);
							in.position(ip);
							return CoderResult.OVERFLOW;
						}
						in.position(ip);
						return CoderResult.malformedForLength(1);
					}
					in.position(ip);
					return CoderResult.UNDERFLOW;
				} else if (Character.isLowSurrogate(ch)) {
					in.position(ip);
					return CoderResult.malformedForLength(1);
				} else {
					int op = out.position();
					if (writeHex(out, ch)) continue;
					out.position(op);
					in.position(ip);
					return CoderResult.OVERFLOW;
				}
			}
			return CoderResult.UNDERFLOW;
		}
	}
}
