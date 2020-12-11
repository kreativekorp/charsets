package com.kreative.charset.petscii;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class PetsciiEncoder extends CharsetEncoder {
	private final boolean alt;
	private final boolean video;
	
	protected PetsciiEncoder(Charset cs, boolean alt, boolean video) {
		super(cs, 1, 1);
		this.alt = alt;
		this.video = video;
	}
	
	protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
		while (in.hasRemaining()) {
			if (!out.hasRemaining()) return CoderResult.OVERFLOW;
			int ch = in.get() & 0xFFFF;
			if (Character.isHighSurrogate((char)ch)) {
				if (in.hasRemaining()) {
					int cl = in.get() & 0xFFFF;
					if (Character.isLowSurrogate((char)cl)) {
						ch = Character.toCodePoint((char)ch, (char)cl);
					} else {
						in.position(in.position() - 2);
						return CoderResult.unmappableForLength(1);
					}
				} else {
					in.position(in.position() - 1);
					return CoderResult.UNDERFLOW;
				}
			}
			int b = alt ? encodeCharAlt(ch) : encodeChar(ch);
			if (b < 0) return unmappable(in, ch);
			if (video) {
				switch (b & 0xE0) {
				case 0x00: return unmappable(in, ch);
				case 0x20: b ^= 0x00; break;
				case 0x40: b ^= 0x40; break;
				case 0x60: b ^= 0x20; break;
				case 0x80: return unmappable(in, ch);
				case 0xA0: b ^= 0xC0; break;
				case 0xC0: b ^= 0x80; break;
				case 0xE0: b ^= 0x80; break;
				}
			}
			out.put((byte)b);
		}
		return CoderResult.UNDERFLOW;
	}
	
	private int encodeChar(int ch) {
		if (ch <= 0x5D) return ch;
		if (ch >= 0x61 && ch <= 0x7A) return ch ^ 0x20;
		if (ch >= 0x80 && ch <= 0xA0) return ch;
		switch (ch) {
        case 0x00A0:  return 0xA0;
        case 0x00A3:  return 0x5C;
        case 0x03C0:  return 0xDE;
        case 0x2022:  return 0xD1;
        case 0x2190:  return 0x5F;
        case 0x2191:  return 0x5E;
        case 0x2500:  return 0xC0;
        case 0x2502:  return 0xDD;
        case 0x250C:  return 0xB0;
        case 0x2510:  return 0xAE;
        case 0x2514:  return 0xAD;
        case 0x2518:  return 0xBD;
        case 0x251C:  return 0xAB;
        case 0x2524:  return 0xB3;
        case 0x252C:  return 0xB2;
        case 0x2534:  return 0xB1;
        case 0x253C:  return 0xDB;
        case 0x256D:  return 0xD5;
        case 0x256E:  return 0xC9;
        case 0x256F:  return 0xCB;
        case 0x2570:  return 0xCA;
        case 0x2571:  return 0xCE;
        case 0x2572:  return 0xCD;
        case 0x2573:  return 0xD6;
        case 0x2581:  return 0xA4;
        case 0x2582:  return 0xAF;
        case 0x2583:  return 0xB9;
        case 0x2584:  return 0xA2;
        case 0x258C:  return 0xA1;
        case 0x258D:  return 0xB5;
        case 0x258E:  return 0xB4;
        case 0x258F:  return 0xA5;
        case 0x2592:  return 0xA6;
        case 0x2594:  return 0xA3;
        case 0x2595:  return 0xA7;
        case 0x2596:  return 0xBB;
        case 0x2597:  return 0xAC;
        case 0x2598:  return 0xBE;
        case 0x259A:  return 0xBF;
        case 0x259D:  return 0xBC;
        case 0x25CB:  return 0xD7;
        case 0x25CF:  return 0xD1;
        case 0x25E4:  return 0xA9;
        case 0x25E5:  return 0xDF;
        case 0x25E6:  return 0xD7;
        case 0x2660:  return 0xC1;
        case 0x2663:  return 0xD8;
        case 0x2665:  return 0xD3;
        case 0x2666:  return 0xDA;
        case 0x1FB70: return 0xD4;
        case 0x1FB71: return 0xC7;
        case 0x1FB72: return 0xC2;
        case 0x1FB73: return 0xDD;
        case 0x1FB74: return 0xC8;
        case 0x1FB75: return 0xD9;
        case 0x1FB76: return 0xC5;
        case 0x1FB77: return 0xC4;
        case 0x1FB78: return 0xC3;
        case 0x1FB79: return 0xC0;
        case 0x1FB7A: return 0xC6;
        case 0x1FB7B: return 0xD2;
        case 0x1FB7C: return 0xCC;
        case 0x1FB7D: return 0xCF;
        case 0x1FB7E: return 0xD0;
        case 0x1FB7F: return 0xBA;
        case 0x1FB82: return 0xB7;
        case 0x1FB83: return 0xB8;
        case 0x1FB87: return 0xAA;
        case 0x1FB88: return 0xB6;
        case 0x1FB8C: return 0xDC;
        case 0x1FB8F: return 0xA8;
		default: return -1;
		}
	}
	
	private int encodeCharAlt(int ch) {
		if (ch <= 0x40) return ch;
		if (ch <= 0x5D) return ch ^ 0x80;
		if (ch >= 0x61 && ch <= 0x7A) return ch ^ 0x20;
		if (ch >= 0x80 && ch <= 0xA0) return ch;
		switch (ch) {
        case 0x00A0:  return 0xA0;
        case 0x00A3:  return 0x5C;
        case 0x2190:  return 0x5F;
        case 0x2191:  return 0x5E;
        case 0x2500:  return 0xC0;
        case 0x2502:  return 0xDD;
        case 0x250C:  return 0xB0;
        case 0x2510:  return 0xAE;
        case 0x2514:  return 0xAD;
        case 0x2518:  return 0xBD;
        case 0x251C:  return 0xAB;
        case 0x2524:  return 0xB3;
        case 0x252C:  return 0xB2;
        case 0x2534:  return 0xB1;
        case 0x253C:  return 0xDB;
        case 0x2581:  return 0xA4;
        case 0x2582:  return 0xAF;
        case 0x2583:  return 0xB9;
        case 0x2584:  return 0xA2;
        case 0x258C:  return 0xA1;
        case 0x258D:  return 0xB5;
        case 0x258E:  return 0xB4;
        case 0x258F:  return 0xA5;
        case 0x2592:  return 0xA6;
        case 0x2594:  return 0xA3;
        case 0x2595:  return 0xA7;
        case 0x2596:  return 0xBB;
        case 0x2597:  return 0xAC;
        case 0x2598:  return 0xBE;
        case 0x259A:  return 0xBF;
        case 0x259D:  return 0xBC;
        case 0x2713:  return 0xBA;
        case 0x1FB73: return 0xDD;
        case 0x1FB79: return 0xC0;
        case 0x1FB82: return 0xB7;
        case 0x1FB83: return 0xB8;
        case 0x1FB87: return 0xAA;
        case 0x1FB88: return 0xB6;
        case 0x1FB8C: return 0xDC;
        case 0x1FB8F: return 0xA8;
        case 0x1FB95: return 0xDE;
        case 0x1FB96: return 0xDE;
        case 0x1FB98: return 0xDF;
        case 0x1FB99: return 0xA9;
		default: return -1;
		}
	}
	
	private CoderResult unmappable(CharBuffer in, int ch) {
		int i = Character.charCount(ch);
		in.position(in.position() - i);
		return CoderResult.unmappableForLength(i);
	}
}
