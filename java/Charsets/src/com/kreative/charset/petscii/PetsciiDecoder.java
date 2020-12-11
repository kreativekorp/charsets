package com.kreative.charset.petscii;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class PetsciiDecoder extends CharsetDecoder {
	private static final int[] PETSCII_Q1 = {
		0x0040, 0x0041, 0x0042, 0x0043, 0x0044, 0x0045, 0x0046, 0x0047, // @ABCDEFG
		0x0048, 0x0049, 0x004A, 0x004B, 0x004C, 0x004D, 0x004E, 0x004F, // HIJKLMNO
		0x0050, 0x0051, 0x0052, 0x0053, 0x0054, 0x0055, 0x0056, 0x0057, // PQRSTUVW
		0x0058, 0x0059, 0x005A, 0x005B, 0x00A3, 0x005D, 0x2191, 0x2190, // XYZ[£]↑←
	};
	private static final int[] PETSCII_Q1A = {
		0x0040, 0x0061, 0x0062, 0x0063, 0x0064, 0x0065, 0x0066, 0x0067, // @abcdefg
		0x0068, 0x0069, 0x006A, 0x006B, 0x006C, 0x006D, 0x006E, 0x006F, // hijklmno
		0x0070, 0x0071, 0x0072, 0x0073, 0x0074, 0x0075, 0x0076, 0x0077, // pqrstuvw
		0x0078, 0x0079, 0x007A, 0x005B, 0x00A3, 0x005D, 0x2191, 0x2190, // xyz[£]↑←
	};
	private static final int[] PETSCII_Q2 = {
		0x00A0,  0x258C,  0x2584,  0x2594,  0x2581,  0x258F,  0x2592,  0x2595,  //  ▌▄▔▁▏▒▕
		0x1FB8F, 0x25E4,  0x1FB87, 0x251C,  0x2597,  0x2514,  0x2510,  0x2582,  // 🮏◤🮇├▗└┐▂
		0x250C,  0x2534,  0x252C,  0x2524,  0x258E,  0x258D,  0x1FB88, 0x1FB82, // ┌┴┬┤▎▍🮈🮂
		0x1FB83, 0x2583,  0x1FB7F, 0x2596,  0x259D,  0x2518,  0x2598,  0x259A,  // 🮃▃🭿▖▝┘▘▚
	};
	private static final int[] PETSCII_Q2A = {
		0x00A0,  0x258C,  0x2584,  0x2594,  0x2581,  0x258F,  0x2592,  0x2595,  //  ▌▄▔▁▏▒▕
		0x1FB8F, 0x1FB99, 0x1FB87, 0x251C,  0x2597,  0x2514,  0x2510,  0x2582,  // 🮏🮙🮇├▗└┐▂
		0x250C,  0x2534,  0x252C,  0x2524,  0x258E,  0x258D,  0x1FB88, 0x1FB82, // ┌┴┬┤▎▍🮈🮂
		0x1FB83, 0x2583,  0x2713,  0x2596,  0x259D,  0x2518,  0x2598,  0x259A,  // 🮃▃✓▖▝┘▘▚
	};
	private static final int[] PETSCII_Q3 = {
		0x2500,  0x2660,  0x1FB72, 0x1FB78, 0x1FB77, 0x1FB76, 0x1FB7A, 0x1FB71, // ─♠🭲🭸🭷🭶🭺🭱
		0x1FB74, 0x256E,  0x2570,  0x256F,  0x1FB7C, 0x2572,  0x2571,  0x1FB7D, // 🭴╮╰╯🭼╲╱🭽
		0x1FB7E, 0x25CF,  0x1FB7B, 0x2665,  0x1FB70, 0x256D,  0x2573,  0x25CB,  // 🭾●🭻♥🭰╭╳○
		0x2663,  0x1FB75, 0x2666,  0x253C,  0x1FB8C, 0x2502,  0x03C0,  0x25E5,  // ♣🭵♦┼🮌│π◥
	};
	private static final int[] PETSCII_Q3A = {
		0x2500,  0x0041,  0x0042,  0x0043,  0x0044,  0x0045,  0x0046,  0x0047,  // ─ABCDEFG
		0x0048,  0x0049,  0x004A,  0x004B,  0x004C,  0x004D,  0x004E,  0x004F,  // HIJKLMNO
		0x0050,  0x0051,  0x0052,  0x0053,  0x0054,  0x0055,  0x0056,  0x0057,  // PQRSTUVW
		0x0058,  0x0059,  0x005A,  0x253C,  0x1FB8C, 0x2502,  0x1FB96, 0x1FB98, // XYZ┼🮌│🮖🮘
	};
	
	private final boolean alt;
	private final boolean video;
	
	public PetsciiDecoder(Charset cs, boolean alt, boolean video) {
		super(cs, 1, 2);
		this.alt = alt;
		this.video = video;
	}
	
	@Override
	public CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
		while (in.hasRemaining()) {
			if (!out.hasRemaining()) return CoderResult.OVERFLOW;
			int b = in.get() & 0xFF;
			if (video) {
				switch (b & 0x60) {
				case 0x00: out.put(Character.toChars((alt ? PETSCII_Q1A : PETSCII_Q1)[b & 0x1F])); break;
				case 0x20: out.put((char)(b & 0x7F)); break;
				case 0x40: out.put(Character.toChars((alt ? PETSCII_Q3A : PETSCII_Q3)[b & 0x1F])); break;
				case 0x60: out.put(Character.toChars((alt ? PETSCII_Q2A : PETSCII_Q2)[b & 0x1F])); break;
				}
			} else {
				if (b == 0xFF) b = 0xDE;
				switch (b & 0xE0) {
				case 0x00: out.put((char)b); break;
				case 0x20: out.put((char)b); break;
				case 0x40: out.put(Character.toChars((alt ? PETSCII_Q1A : PETSCII_Q1)[b & 0x1F])); break;
				case 0x60: out.put(Character.toChars((alt ? PETSCII_Q3A : PETSCII_Q3)[b & 0x1F])); break;
				case 0x80: out.put((char)b); break;
				case 0xA0: out.put(Character.toChars((alt ? PETSCII_Q2A : PETSCII_Q2)[b & 0x1F])); break;
				case 0xC0: out.put(Character.toChars((alt ? PETSCII_Q3A : PETSCII_Q3)[b & 0x1F])); break;
				case 0xE0: out.put(Character.toChars((alt ? PETSCII_Q2A : PETSCII_Q2)[b & 0x1F])); break;
				}
			}
		}
		return CoderResult.UNDERFLOW;
	}
}
