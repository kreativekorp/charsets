package com.kreative.charset.petscii;

import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetDecoder;

public class Petscii8Decoder extends AbstractCharsetDecoder {
	private static final int[] PETSCII8_HIGH = {
		// PETSCII A0-BF in Uppercase Mode
		0x00A0,  // NO-BREAK SPACE
		0x258C,  // LEFT HALF BLOCK
		0x2584,  // LOWER HALF BLOCK
		0x2594,  // UPPER ONE EIGHTH BLOCK
		0x2581,  // LOWER ONE EIGHTH BLOCK
		0x258F,  // LEFT ONE EIGHTH BLOCK
		0x2592,  // MEDIUM SHADE
		0x2595,  // RIGHT ONE EIGHTH BLOCK
		0x1FB8F, // LOWER HALF MEDIUM SHADE
		0x25E4,  // BLACK UPPER LEFT TRIANGLE
		0x1FB87, // RIGHT ONE QUARTER BLOCK
		0x251C,  // BOX DRAWINGS LIGHT VERTICAL AND RIGHT
		0x2597,  // QUADRANT LOWER RIGHT
		0x2514,  // BOX DRAWINGS LIGHT UP AND RIGHT
		0x2510,  // BOX DRAWINGS LIGHT DOWN AND LEFT
		0x2582,  // LOWER ONE QUARTER BLOCK
		0x250C,  // BOX DRAWINGS LIGHT DOWN AND RIGHT
		0x2534,  // BOX DRAWINGS LIGHT UP AND HORIZONTAL
		0x252C,  // BOX DRAWINGS LIGHT DOWN AND HORIZONTAL
		0x2524,  // BOX DRAWINGS LIGHT VERTICAL AND LEFT
		0x258E,  // LEFT ONE QUARTER BLOCK
		0x258D,  // LEFT THREE EIGHTHS BLOCK
		0x1FB88, // RIGHT THREE EIGHTHS BLOCK
		0x1FB82, // UPPER ONE QUARTER BLOCK
		0x1FB83, // UPPER THREE EIGHTHS BLOCK
		0x2583,  // LOWER THREE EIGHTHS BLOCK
		0x1FB7F, // RIGHT AND LOWER ONE EIGHTH BLOCK
		0x2596,  // QUADRANT LOWER LEFT
		0x259D,  // QUADRANT UPPER RIGHT
		0x2518,  // BOX DRAWINGS LIGHT UP AND LEFT
		0x2598,  // QUADRANT UPPER LEFT
		0x259A,  // QUADRANT UPPER LEFT AND LOWER RIGHT
		// PETSCII C0-DF in Uppercase Mode
		0x2500,  // BOX DRAWINGS LIGHT HORIZONTAL
		0x2660,  // BLACK SPADE SUIT
		0x1FB72, // VERTICAL ONE EIGHTH BLOCK-4
		0x1FB78, // HORIZONTAL ONE EIGHTH BLOCK-4
		0x1FB77, // HORIZONTAL ONE EIGHTH BLOCK-3
		0x1FB76, // HORIZONTAL ONE EIGHTH BLOCK-2
		0x1FB7A, // HORIZONTAL ONE EIGHTH BLOCK-6
		0x1FB71, // VERTICAL ONE EIGHTH BLOCK-3
		0x1FB74, // VERTICAL ONE EIGHTH BLOCK-6
		0x256E,  // BOX DRAWINGS LIGHT ARC DOWN AND LEFT
		0x2570,  // BOX DRAWINGS LIGHT ARC UP AND RIGHT
		0x256F,  // BOX DRAWINGS LIGHT ARC UP AND LEFT
		0x1FB7C, // LEFT AND LOWER ONE EIGHTH BLOCK
		0x2572,  // BOX DRAWINGS LIGHT DIAGONAL UPPER LEFT TO LOWER RIGHT
		0x2571,  // BOX DRAWINGS LIGHT DIAGONAL UPPER RIGHT TO LOWER LEFT
		0x1FB7D, // LEFT AND UPPER ONE EIGHTH BLOCK
		0x1FB7E, // RIGHT AND UPPER ONE EIGHTH BLOCK
		0x25CF,  // BLACK CIRCLE
		0x1FB7B, // HORIZONTAL ONE EIGHTH BLOCK-7
		0x2665,  // BLACK HEART SUIT
		0x1FB70, // VERTICAL ONE EIGHTH BLOCK-2
		0x256D,  // BOX DRAWINGS LIGHT ARC DOWN AND RIGHT
		0x2573,  // BOX DRAWINGS LIGHT DIAGONAL CROSS
		0x25CB,  // WHITE CIRCLE
		0x2663,  // BLACK CLUB SUIT
		0x1FB75, // VERTICAL ONE EIGHTH BLOCK-7
		0x2666,  // BLACK DIAMOND SUIT
		0x253C,  // BOX DRAWINGS LIGHT VERTICAL AND HORIZONTAL
		0x1FB8C, // LEFT HALF MEDIUM SHADE
		0x2502,  // BOX DRAWINGS LIGHT VERTICAL
		0x03C0,  // GREEK SMALL LETTER PI
		0x25E5,  // BLACK UPPER RIGHT TRIANGLE
		// Miscellaneous
		// Picked from PETSCII in Lowercase Mode, Teletext G2 Latin, and ISO Latin-9
		0x1FB79, // HORIZONTAL ONE EIGHTH BLOCK-5     (0xC0 in PETSCII; disunified from box drawing character)
		0x00A1,  // INVERTED EXCLAMATION MARK         (0xA1 in Teletext G2 Latin and ISO Latin-9)
		0x00A2,  // CENT SIGN                         (0xA2 in Teletext G2 Latin and ISO Latin-9)
		0x00A3,  // POUND SIGN                        (0xA3 in Teletext G2 Latin and ISO Latin-9)
		0x20AC,  // EURO SIGN                         (0xA4 in ISO Latin-9)
		0x00A5,  // YEN SIGN                          (0xA5 in Teletext G2 Latin and ISO Latin-9)
		0x2022,  // BULLET                            (0xD1 in PETSCII; disunified from BLACK CIRCLE; relocated to avoid collision)
		0x00A7,  // SECTION SIGN                      (0xA7 in Teletext G2 Latin and ISO Latin-9)
		0x1FB95, // CHECKER BOARD FILL                (0xDE in PETSCII lowercase mode on the Commodore PET and VIC-20; relocated to avoid collision)
		0x1FB99, // UPPER RIGHT TO LOWER LEFT FILL    (0xA9 in PETSCII lowercase mode)
		0x25E6,  // WHITE BULLET                      (0xD7 in PETSCII; disunified from WHITE CIRCLE; relocated to avoid collision)
		0x00AB,  // LEFT-POINTING DOUBLE ANGLE QUOTE  (0xAB in Teletext G2 Latin and ISO Latin-9)
		0x2190,  // LEFTWARDS ARROW                   (0xAC in Teletext G2 Latin)
		0x2191,  // UPWARDS ARROW                     (0xAD in Teletext G2 Latin)
		0x2192,  // RIGHTWARDS ARROW                  (0xAE in Teletext G2 Latin)
		0x2193,  // DOWNWARDS ARROW                   (0xAF in Teletext G2 Latin)
		0x00B0,  // DEGREE SIGN                       (0xB0 in Teletext G2 Latin and ISO Latin-9)
		0x00B1,  // PLUS-MINUS SIGN                   (0xB1 in Teletext G2 Latin and ISO Latin-9)
		0x00AE,  // REGISTERED SIGN                   (0xD2 in Teletext G2 Latin)
		0x00A9,  // COPYRIGHT SIGN                    (0xD3 in Teletext G2 Latin)
		0x00D7,  // MULTIPLICATION SIGN               (0xB4 in Teletext G2 Latin)
		0x00B5,  // MICRO SIGN                        (0xB5 in Teletext G2 Latin and ISO Latin-9)
		0x00B6,  // PILCROW SIGN                      (0xB6 in Teletext G2 Latin and ISO Latin-9)
		0x00B7,  // MIDDLE DOT                        (0xB7 in Teletext G2 Latin and ISO Latin-9)
		0x00F7,  // DIVISION SIGN                     (0xB8 in Teletext G2 Latin)
		0x00BF,  // INVERTED QUESTION MARK            (0xBF in Teletext G2 Latin and ISO Latin-9; relocated to avoid collision)
		0x2713,  // CHECK MARK                        (0xBA in PETSCII lowercase mode)
		0x00BB,  // RIGHT-POINTING DOUBLE ANGLE QUOTE (0xBB in Teletext G2 Latin and ISO Latin-9)
		0x00AC,  // NOT SIGN                          (0xAC in ISO Latin-9; relocated to avoid collision)
		0x1FB73, // VERTICAL ONE EIGHTH BLOCK-5       (0xDD in PETSCII; disunified from box drawing character)
		0x1FB96, // INVERSE CHECKER BOARD FILL        (0xDE in PETSCII lowercase mode on the Commodore 64 and 128)
		0x1FB98, // UPPER LEFT TO LOWER RIGHT FILL    (0xDF in PETSCII lowercase mode)
	};
	
	public Petscii8Decoder(Charset cs) {
		super(cs);
	}
	
	@Override
	protected int decode(int b) {
		return (b <= 0xA0) ? b : PETSCII8_HIGH[b - 0xA0];
	}
}
