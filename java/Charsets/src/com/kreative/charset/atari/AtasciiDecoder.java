package com.kreative.charset.atari;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class AtasciiDecoder extends CharsetDecoder {
	private static final int[] ATASCII_VIDEO_LOW = {
		0x2665,  0x251C,  0x23B9,  0x2518,  0x2524,  0x2510,  0x2571,  0x2572,  // ♥├⎹┘┤┐╱╲
		0x25E2,  0x2597,  0x25E3,  0x259D,  0x2598,  0x23BA,  0x23BD,  0x2596,  // ◢▗◣▝▘⎺⎽▖
		0x2663,  0x250C,  0x2500,  0x253C,  0x25CF,  0x2584,  0x23B8,  0x252C,  // ♣┌─┼●▄⎸┬
		0x2534,  0x258C,  0x2514,  0x241B,  0x2191,  0x2193,  0x2190,  0x2192,  // ┴▌└␛↑↓←→
	};
	private static final int[] ATASCII_VIDEO_HIGH = {
		0x2666,  0x0061,  0x0062,  0x0063,  0x0064,  0x0065,  0x0066,  0x0067,  // ♦abcdefg
		0x0068,  0x0069,  0x006A,  0x006B,  0x006C,  0x006D,  0x006E,  0x006F,  // hijklmno
		0x0070,  0x0071,  0x0072,  0x0073,  0x0074,  0x0075,  0x0076,  0x0077,  // pqrstuvw
		0x0078,  0x0079,  0x007A,  0x2660,  0x2502,  0x1F8B0, 0x25C0,  0x25B6,  // xyz♠│🢰◀▶
	};
	
	private final boolean video;
	
	public AtasciiDecoder(Charset cs, boolean video) {
		super(cs, 1, 2);
		this.video = video;
	}
	
	@Override
	public CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
		while (in.hasRemaining()) {
			if (!out.hasRemaining()) return CoderResult.OVERFLOW;
			int b = in.get() & 0xFF;
			switch (b & 0x60) {
			case 0x00:
				if (video || (b & 0x7F) < 0x1B) {
					out.put(Character.toChars(ATASCII_VIDEO_LOW[b & 0x1F]));
				} else switch (b) {
					case 0x1B: out.put((char)0x1B); break; // escape
					case 0x1C: out.put((char)0x1C); break; // cursor up
					case 0x1D: out.put((char)0x1D); break; // cursor down
					case 0x1E: out.put((char)0x1E); break; // cursor left
					case 0x1F: out.put((char)0x1F); break; // cursor right
					case 0x9B: out.put((char)0x0A); break; // end of line
					case 0x9C: out.put((char)0x9C); break; // delete line
					case 0x9D: out.put((char)0x9D); break; // insert line
					case 0x9E: out.put((char)0x9E); break; // clear tab stop
					case 0x9F: out.put((char)0x9F); break; // set tab stop
				}
				break;
			case 0x20: case 0x40:
				out.put((char)(b & 0x7F));
				break;
			case 0x60:
				if (video || (b & 0x7F) < 0x7D) {
					out.put(Character.toChars(ATASCII_VIDEO_HIGH[b & 0x1F]));
				} else switch (b) {
					case 0x7D: out.put((char)0x0C); break; // clear screen
					case 0x7E: out.put((char)0x08); break; // backspace
					case 0x7F: out.put((char)0x09); break; // tab
					case 0xFD: out.put((char)0x07); break; // bell
					case 0xFE: out.put((char)0x88); break; // delete character
					case 0xFF: out.put((char)0x89); break; // insert character
				}
				break;
			}
		}
		return CoderResult.UNDERFLOW;
	}
}
