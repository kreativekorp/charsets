package com.kreative.charset.petscii;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class Petscii8Encoder extends CharsetEncoder {
	protected Petscii8Encoder(Charset cs) {
		super(cs, 1, 1);
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
			if (ch <= 0xA0) out.put((byte)ch);
			else switch (ch) {
			case 0x00A0:  out.put((byte)0xA0); break;
			case 0x00A1:  out.put((byte)0xE1); break;
			case 0x00A2:  out.put((byte)0xE2); break;
			case 0x00A3:  out.put((byte)0xE3); break;
			case 0x00A5:  out.put((byte)0xE5); break;
			case 0x00A7:  out.put((byte)0xE7); break;
			case 0x00A9:  out.put((byte)0xF3); break;
			case 0x00AB:  out.put((byte)0xEB); break;
			case 0x00AC:  out.put((byte)0xFC); break;
			case 0x00AE:  out.put((byte)0xF2); break;
			case 0x00B0:  out.put((byte)0xF0); break;
			case 0x00B1:  out.put((byte)0xF1); break;
			case 0x00B5:  out.put((byte)0xF5); break;
			case 0x00B6:  out.put((byte)0xF6); break;
			case 0x00B7:  out.put((byte)0xF7); break;
			case 0x00BB:  out.put((byte)0xFB); break;
			case 0x00BF:  out.put((byte)0xF9); break;
			case 0x00D7:  out.put((byte)0xF4); break;
			case 0x00F7:  out.put((byte)0xF8); break;
			case 0x03C0:  out.put((byte)0xDE); break;
			case 0x2022:  out.put((byte)0xE6); break;
			case 0x20AC:  out.put((byte)0xE4); break;
			case 0x2190:  out.put((byte)0xEC); break;
			case 0x2191:  out.put((byte)0xED); break;
			case 0x2192:  out.put((byte)0xEE); break;
			case 0x2193:  out.put((byte)0xEF); break;
			case 0x2500:  out.put((byte)0xC0); break;
			case 0x2502:  out.put((byte)0xDD); break;
			case 0x250C:  out.put((byte)0xB0); break;
			case 0x2510:  out.put((byte)0xAE); break;
			case 0x2514:  out.put((byte)0xAD); break;
			case 0x2518:  out.put((byte)0xBD); break;
			case 0x251C:  out.put((byte)0xAB); break;
			case 0x2524:  out.put((byte)0xB3); break;
			case 0x252C:  out.put((byte)0xB2); break;
			case 0x2534:  out.put((byte)0xB1); break;
			case 0x253C:  out.put((byte)0xDB); break;
			case 0x256D:  out.put((byte)0xD5); break;
			case 0x256E:  out.put((byte)0xC9); break;
			case 0x256F:  out.put((byte)0xCB); break;
			case 0x2570:  out.put((byte)0xCA); break;
			case 0x2571:  out.put((byte)0xCE); break;
			case 0x2572:  out.put((byte)0xCD); break;
			case 0x2573:  out.put((byte)0xD6); break;
			case 0x2581:  out.put((byte)0xA4); break;
			case 0x2582:  out.put((byte)0xAF); break;
			case 0x2583:  out.put((byte)0xB9); break;
			case 0x2584:  out.put((byte)0xA2); break;
			case 0x258C:  out.put((byte)0xA1); break;
			case 0x258D:  out.put((byte)0xB5); break;
			case 0x258E:  out.put((byte)0xB4); break;
			case 0x258F:  out.put((byte)0xA5); break;
			case 0x2592:  out.put((byte)0xA6); break;
			case 0x2594:  out.put((byte)0xA3); break;
			case 0x2595:  out.put((byte)0xA7); break;
			case 0x2596:  out.put((byte)0xBB); break;
			case 0x2597:  out.put((byte)0xAC); break;
			case 0x2598:  out.put((byte)0xBE); break;
			case 0x259A:  out.put((byte)0xBF); break;
			case 0x259D:  out.put((byte)0xBC); break;
			case 0x25CB:  out.put((byte)0xD7); break;
			case 0x25CF:  out.put((byte)0xD1); break;
			case 0x25E4:  out.put((byte)0xA9); break;
			case 0x25E5:  out.put((byte)0xDF); break;
			case 0x25E6:  out.put((byte)0xEA); break;
			case 0x2660:  out.put((byte)0xC1); break;
			case 0x2663:  out.put((byte)0xD8); break;
			case 0x2665:  out.put((byte)0xD3); break;
			case 0x2666:  out.put((byte)0xDA); break;
			case 0x2713:  out.put((byte)0xFA); break;
			case 0x1FB70: out.put((byte)0xD4); break;
			case 0x1FB71: out.put((byte)0xC7); break;
			case 0x1FB72: out.put((byte)0xC2); break;
			case 0x1FB73: out.put((byte)0xFD); break;
			case 0x1FB74: out.put((byte)0xC8); break;
			case 0x1FB75: out.put((byte)0xD9); break;
			case 0x1FB76: out.put((byte)0xC5); break;
			case 0x1FB77: out.put((byte)0xC4); break;
			case 0x1FB78: out.put((byte)0xC3); break;
			case 0x1FB79: out.put((byte)0xE0); break;
			case 0x1FB7A: out.put((byte)0xC6); break;
			case 0x1FB7B: out.put((byte)0xD2); break;
			case 0x1FB7C: out.put((byte)0xCC); break;
			case 0x1FB7D: out.put((byte)0xCF); break;
			case 0x1FB7E: out.put((byte)0xD0); break;
			case 0x1FB7F: out.put((byte)0xBA); break;
			case 0x1FB82: out.put((byte)0xB7); break;
			case 0x1FB83: out.put((byte)0xB8); break;
			case 0x1FB87: out.put((byte)0xAA); break;
			case 0x1FB88: out.put((byte)0xB6); break;
			case 0x1FB8C: out.put((byte)0xDC); break;
			case 0x1FB8F: out.put((byte)0xA8); break;
			case 0x1FB95: out.put((byte)0xE8); break;
			case 0x1FB96: out.put((byte)0xFE); break;
			case 0x1FB98: out.put((byte)0xFF); break;
			case 0x1FB99: out.put((byte)0xE9); break;
			default: return unmappable(in, ch);
			}
		}
		return CoderResult.UNDERFLOW;
	}
	
	private CoderResult unmappable(CharBuffer in, int ch) {
		int i = Character.charCount(ch);
		in.position(in.position() - i);
		return CoderResult.unmappableForLength(i);
	}
}
