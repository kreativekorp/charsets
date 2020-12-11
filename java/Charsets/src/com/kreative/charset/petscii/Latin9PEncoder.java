package com.kreative.charset.petscii;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class Latin9PEncoder extends CharsetEncoder {
	protected Latin9PEncoder(Charset cs) {
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
			if (ch < 0x20) return unmappable(in, ch);
			else if (ch < 0x7F) out.put((byte)ch);
			else if (ch < 0xA0) return unmappable(in, ch);
			else if (ch >= 0xC0 && ch <= 0xFF) out.put((byte)ch);
			else switch (ch) {
			case 0x00A0:  out.put((byte)0x20); break;
			case 0x00A1:  out.put((byte)0xA1); break;
			case 0x00A2:  out.put((byte)0xA2); break;
			case 0x00A3:  out.put((byte)0xA3); break;
			case 0x00A5:  out.put((byte)0xA5); break;
			case 0x00A7:  out.put((byte)0xA7); break;
			case 0x00A9:  out.put((byte)0xA9); break;
			case 0x00AA:  out.put((byte)0xAA); break;
			case 0x00AB:  out.put((byte)0xAB); break;
			case 0x00AC:  out.put((byte)0xAC); break;
			case 0x00AD:  out.put((byte)0x2D); break;
			case 0x00AE:  out.put((byte)0xAE); break;
			case 0x00AF:  out.put((byte)0xAF); break;
			case 0x00B0:  out.put((byte)0xB0); break;
			case 0x00B1:  out.put((byte)0xB1); break;
			case 0x00B2:  out.put((byte)0xB2); break;
			case 0x00B3:  out.put((byte)0xB3); break;
			case 0x00B5:  out.put((byte)0xB5); break;
			case 0x00B6:  out.put((byte)0xB6); break;
			case 0x00B7:  out.put((byte)0xB7); break;
			case 0x00B9:  out.put((byte)0xB9); break;
			case 0x00BA:  out.put((byte)0xBA); break;
			case 0x00BB:  out.put((byte)0xBB); break;
			case 0x00BF:  out.put((byte)0xBF); break;
			case 0x0152:  out.put((byte)0xBC); break;
			case 0x0153:  out.put((byte)0xBD); break;
			case 0x0160:  out.put((byte)0xA6); break;
			case 0x0161:  out.put((byte)0xA8); break;
			case 0x0178:  out.put((byte)0xBE); break;
			case 0x017D:  out.put((byte)0xB4); break;
			case 0x017E:  out.put((byte)0xB8); break;
			case 0x03C0:  out.put((byte)0x9E); break;
			case 0x2022:  out.put((byte)0x91); break;
			case 0x20AC:  out.put((byte)0xA4); break;
			case 0x2190:  out.put((byte)0x04); break;
			case 0x2191:  out.put((byte)0x03); break;
			case 0x2500:  out.put((byte)0x80); break;
			case 0x2502:  out.put((byte)0x9D); break;
			case 0x250C:  out.put((byte)0x10); break;
			case 0x2510:  out.put((byte)0x0E); break;
			case 0x2514:  out.put((byte)0x0D); break;
			case 0x2518:  out.put((byte)0x1D); break;
			case 0x251C:  out.put((byte)0x0B); break;
			case 0x2524:  out.put((byte)0x13); break;
			case 0x252C:  out.put((byte)0x12); break;
			case 0x2534:  out.put((byte)0x11); break;
			case 0x253C:  out.put((byte)0x9B); break;
			case 0x256D:  out.put((byte)0x95); break;
			case 0x256E:  out.put((byte)0x89); break;
			case 0x256F:  out.put((byte)0x8B); break;
			case 0x2570:  out.put((byte)0x8A); break;
			case 0x2571:  out.put((byte)0x8E); break;
			case 0x2572:  out.put((byte)0x8D); break;
			case 0x2573:  out.put((byte)0x96); break;
			case 0x2581:  out.put((byte)0x5F); break;
			case 0x2582:  out.put((byte)0x0F); break;
			case 0x2583:  out.put((byte)0x19); break;
			case 0x2584:  out.put((byte)0x02); break;
			case 0x258C:  out.put((byte)0x01); break;
			case 0x258D:  out.put((byte)0x15); break;
			case 0x258E:  out.put((byte)0x14); break;
			case 0x258F:  out.put((byte)0x05); break;
			case 0x2592:  out.put((byte)0x06); break;
			case 0x2594:  out.put((byte)0xAF); break;
			case 0x2595:  out.put((byte)0x07); break;
			case 0x2596:  out.put((byte)0x1B); break;
			case 0x2597:  out.put((byte)0x0C); break;
			case 0x2598:  out.put((byte)0x1E); break;
			case 0x259A:  out.put((byte)0x1F); break;
			case 0x259D:  out.put((byte)0x1C); break;
			case 0x25CB:  out.put((byte)0x97); break;
			case 0x25CF:  out.put((byte)0x91); break;
			case 0x25E4:  out.put((byte)0x09); break;
			case 0x25E5:  out.put((byte)0x9F); break;
			case 0x25E6:  out.put((byte)0x97); break;
			case 0x2660:  out.put((byte)0x81); break;
			case 0x2663:  out.put((byte)0x98); break;
			case 0x2665:  out.put((byte)0x93); break;
			case 0x2666:  out.put((byte)0x9A); break;
			case 0x2713:  out.put((byte)0xAD); break;
			case 0x1FB70: out.put((byte)0x94); break;
			case 0x1FB71: out.put((byte)0x87); break;
			case 0x1FB72: out.put((byte)0x82); break;
			case 0x1FB73: out.put((byte)0x9D); break;
			case 0x1FB74: out.put((byte)0x88); break;
			case 0x1FB75: out.put((byte)0x99); break;
			case 0x1FB76: out.put((byte)0x85); break;
			case 0x1FB77: out.put((byte)0x84); break;
			case 0x1FB78: out.put((byte)0x83); break;
			case 0x1FB79: out.put((byte)0x80); break;
			case 0x1FB7A: out.put((byte)0x86); break;
			case 0x1FB7B: out.put((byte)0x92); break;
			case 0x1FB7C: out.put((byte)0x8C); break;
			case 0x1FB7D: out.put((byte)0x8F); break;
			case 0x1FB7E: out.put((byte)0x90); break;
			case 0x1FB7F: out.put((byte)0x1A); break;
			case 0x1FB82: out.put((byte)0x17); break;
			case 0x1FB83: out.put((byte)0x18); break;
			case 0x1FB87: out.put((byte)0x0A); break;
			case 0x1FB88: out.put((byte)0x16); break;
			case 0x1FB8C: out.put((byte)0x9C); break;
			case 0x1FB8F: out.put((byte)0x08); break;
			case 0x1FB95: out.put((byte)0x7F); break;
			case 0x1FB96: out.put((byte)0x7F); break;
			case 0x1FB98: out.put((byte)0xA0); break;
			case 0x1FB99: out.put((byte)0x00); break;
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
