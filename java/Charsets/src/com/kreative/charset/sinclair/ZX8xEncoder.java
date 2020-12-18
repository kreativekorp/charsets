package com.kreative.charset.sinclair;

import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetEncoder;

public class ZX8xEncoder extends AbstractCharsetEncoder {
	private final boolean zx81;
	
	protected ZX8xEncoder(Charset cs, boolean zx81) {
		super(cs, 1);
		this.zx81 = zx81;
		this.replaceWith(new byte[]{0x0F});
	}
	
	@Override
	protected int encode(int ch) {
		switch (ch) {
        case 0x0020:  return 0x00; // SPACE
        case 0x0022:  return (zx81 ? 0x0B : 0x01); // QUOTATION MARK
        case 0x0024:  return 0x0D; // DOLLAR SIGN
        case 0x0028:  return 0x10; // LEFT PARENTHESIS
        case 0x0029:  return 0x11; // RIGHT PARENTHESIS
        case 0x002A:  return (zx81 ? 0x17 : 0x14); // ASTERISK
        case 0x002B:  return (zx81 ? 0x15 : 0x13); // PLUS SIGN
        case 0x002C:  return 0x1A; // COMMA
        case 0x002D:  return (zx81 ? 0x16 : 0x12); // HYPHEN-MINUS
        case 0x002E:  return 0x1B; // FULL STOP
        case 0x002F:  return (zx81 ? 0x18 : 0x15); // SOLIDUS
        case 0x0030:  return 0x1C; // DIGIT ZERO
        case 0x0031:  return 0x1D; // DIGIT ONE
        case 0x0032:  return 0x1E; // DIGIT TWO
        case 0x0033:  return 0x1F; // DIGIT THREE
        case 0x0034:  return 0x20; // DIGIT FOUR
        case 0x0035:  return 0x21; // DIGIT FIVE
        case 0x0036:  return 0x22; // DIGIT SIX
        case 0x0037:  return 0x23; // DIGIT SEVEN
        case 0x0038:  return 0x24; // DIGIT EIGHT
        case 0x0039:  return 0x25; // DIGIT NINE
        case 0x003A:  return 0x0E; // COLON
        case 0x003B:  return 0x19; // SEMICOLON
        case 0x003C:  return (zx81 ? 0x13 : 0x18); // LESS-THAN SIGN
        case 0x003D:  return (zx81 ? 0x14 : 0x16); // EQUALS SIGN
        case 0x003E:  return (zx81 ? 0x12 : 0x17); // GREATER-THAN SIGN
        case 0x003F:  return 0x0F; // QUESTION MARK
        case 0x0041:  return 0x26; // LATIN CAPITAL LETTER A
        case 0x0042:  return 0x27; // LATIN CAPITAL LETTER B
        case 0x0043:  return 0x28; // LATIN CAPITAL LETTER C
        case 0x0044:  return 0x29; // LATIN CAPITAL LETTER D
        case 0x0045:  return 0x2A; // LATIN CAPITAL LETTER E
        case 0x0046:  return 0x2B; // LATIN CAPITAL LETTER F
        case 0x0047:  return 0x2C; // LATIN CAPITAL LETTER G
        case 0x0048:  return 0x2D; // LATIN CAPITAL LETTER H
        case 0x0049:  return 0x2E; // LATIN CAPITAL LETTER I
        case 0x004A:  return 0x2F; // LATIN CAPITAL LETTER J
        case 0x004B:  return 0x30; // LATIN CAPITAL LETTER K
        case 0x004C:  return 0x31; // LATIN CAPITAL LETTER L
        case 0x004D:  return 0x32; // LATIN CAPITAL LETTER M
        case 0x004E:  return 0x33; // LATIN CAPITAL LETTER N
        case 0x004F:  return 0x34; // LATIN CAPITAL LETTER O
        case 0x0050:  return 0x35; // LATIN CAPITAL LETTER P
        case 0x0051:  return 0x36; // LATIN CAPITAL LETTER Q
        case 0x0052:  return 0x37; // LATIN CAPITAL LETTER R
        case 0x0053:  return 0x38; // LATIN CAPITAL LETTER S
        case 0x0054:  return 0x39; // LATIN CAPITAL LETTER T
        case 0x0055:  return 0x3A; // LATIN CAPITAL LETTER U
        case 0x0056:  return 0x3B; // LATIN CAPITAL LETTER V
        case 0x0057:  return 0x3C; // LATIN CAPITAL LETTER W
        case 0x0058:  return 0x3D; // LATIN CAPITAL LETTER X
        case 0x0059:  return 0x3E; // LATIN CAPITAL LETTER Y
        case 0x005A:  return 0x3F; // LATIN CAPITAL LETTER Z
        case 0x0061:  return 0x26; // LATIN SMALL LETTER A
        case 0x0062:  return 0x27; // LATIN SMALL LETTER B
        case 0x0063:  return 0x28; // LATIN SMALL LETTER C
        case 0x0064:  return 0x29; // LATIN SMALL LETTER D
        case 0x0065:  return 0x2A; // LATIN SMALL LETTER E
        case 0x0066:  return 0x2B; // LATIN SMALL LETTER F
        case 0x0067:  return 0x2C; // LATIN SMALL LETTER G
        case 0x0068:  return 0x2D; // LATIN SMALL LETTER H
        case 0x0069:  return 0x2E; // LATIN SMALL LETTER I
        case 0x006A:  return 0x2F; // LATIN SMALL LETTER J
        case 0x006B:  return 0x30; // LATIN SMALL LETTER K
        case 0x006C:  return 0x31; // LATIN SMALL LETTER L
        case 0x006D:  return 0x32; // LATIN SMALL LETTER M
        case 0x006E:  return 0x33; // LATIN SMALL LETTER N
        case 0x006F:  return 0x34; // LATIN SMALL LETTER O
        case 0x0070:  return 0x35; // LATIN SMALL LETTER P
        case 0x0071:  return 0x36; // LATIN SMALL LETTER Q
        case 0x0072:  return 0x37; // LATIN SMALL LETTER R
        case 0x0073:  return 0x38; // LATIN SMALL LETTER S
        case 0x0074:  return 0x39; // LATIN SMALL LETTER T
        case 0x0075:  return 0x3A; // LATIN SMALL LETTER U
        case 0x0076:  return 0x3B; // LATIN SMALL LETTER V
        case 0x0077:  return 0x3C; // LATIN SMALL LETTER W
        case 0x0078:  return 0x3D; // LATIN SMALL LETTER X
        case 0x0079:  return 0x3E; // LATIN SMALL LETTER Y
        case 0x007A:  return 0x3F; // LATIN SMALL LETTER Z
        case 0x00A0:  return 0x00; // NO-BREAK SPACE
        case 0x00A3:  return 0x0C; // POUND SIGN
        case 0x2580:  return (zx81 ? 0x03 : 0x83); // UPPER HALF BLOCK
        case 0x2584:  return (zx81 ? 0x83 : 0x03); // LOWER HALF BLOCK
        case 0x2588:  return 0x80; // FULL BLOCK
        case 0x258C:  return (zx81 ? 0x05 : 0x02); // LEFT HALF BLOCK
        case 0x2590:  return (zx81 ? 0x85 : 0x82); // RIGHT HALF BLOCK
        case 0x2592:  return (zx81 ? 0x08 : 0x09); // MEDIUM SHADE
        case 0x2596:  return (zx81 ? 0x04 : 0x06); // QUADRANT LOWER LEFT
        case 0x2597:  return (zx81 ? 0x87 : 0x07); // QUADRANT LOWER RIGHT
        case 0x2598:  return (zx81 ? 0x01 : 0x04); // QUADRANT UPPER LEFT
        case 0x2599:  return (zx81 ? 0x82 : 0x85); // QUADRANT UPPER LEFT AND LOWER LEFT AND LOWER RIGHT
        case 0x259A:  return (zx81 ? 0x86 : 0x88); // QUADRANT UPPER LEFT AND LOWER RIGHT
        case 0x259B:  return (zx81 ? 0x07 : 0x87); // QUADRANT UPPER LEFT AND UPPER RIGHT AND LOWER LEFT
        case 0x259C:  return (zx81 ? 0x84 : 0x86); // QUADRANT UPPER LEFT AND UPPER RIGHT AND LOWER RIGHT
        case 0x259D:  return (zx81 ? 0x02 : 0x05); // QUADRANT UPPER RIGHT
        case 0x259E:  return (zx81 ? 0x06 : 0x08); // QUADRANT UPPER RIGHT AND LOWER LEFT
        case 0x259F:  return (zx81 ? 0x81 : 0x84); // QUADRANT UPPER RIGHT AND LOWER LEFT AND LOWER RIGHT
        case 0x1FB8E: return (zx81 ? 0x0A : 0x0B); // UPPER HALF MEDIUM SHADE
        case 0x1FB8F: return (zx81 ? 0x09 : 0x0A); // LOWER HALF MEDIUM SHADE
        case 0x1FB90: return (zx81 ? 0x88 : 0x89); // INVERSE MEDIUM SHADE
        case 0x1FB91: return (zx81 ? 0x89 : 0x8A); // UPPER HALF BLOCK AND LOWER HALF INVERSE MEDIUM SHADE
        case 0x1FB92: return (zx81 ? 0x8A : 0x8B); // UPPER HALF INVERSE MEDIUM SHADE AND LOWER HALF BLOCK
        default: return UNMAPPABLE;
		}
	}
}
