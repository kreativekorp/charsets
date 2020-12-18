package com.kreative.charset.apple2;

import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetDecoder;

public class AppleIIDecoder extends AbstractCharsetDecoder {
	private static final int[] MOUSETEXT_IIE = {
		0xF813,  0xF812,  0x1FBB0, 0x231B,  0x2713,  0x1FBB1, 0x1FBB2, 0x1FBB3, // 🮰⌛✓🮱🮲🮳
		0x2190,  0x2026,  0x2193,  0x2191,  0x2594,  0x21B2,  0x2589,  0x1FBB5, // ←…↓↑▔↲▉🮵
		0x1FBB6, 0x1FBB7, 0x1FBB8, 0x2500,  0x1FB7C, 0x2192,  0x2592,  0x1FB90, // 🮶🮷🮸─🭼→▒🮐
		0x1FBB9, 0x1FBBA, 0x2595,  0x25C6,  0x1FB80, 0x1FBBB, 0x1FBBC, 0x258F,  // 🮹🮺▕◆🮀🮻🮼▏
	};
	private static final int[] MOUSETEXT_IIGS = {
		0xF813,  0xF812,  0x1FBB0, 0x231B,  0x2713,  0x1FBB1, 0x1FBB4, 0x1FB81, // 🮰⌛✓🮱🮴🮁
		0x2190,  0x2026,  0x2193,  0x2191,  0x2594,  0x21B2,  0x2589,  0x1FBB5, // ←…↓↑▔↲▉🮵
		0x1FBB6, 0x1FBB7, 0x1FBB8, 0x2500,  0x1FB7C, 0x2192,  0x2592,  0x1FB90, // 🮶🮷🮸─🭼→▒🮐
		0x1FBB9, 0x1FBBA, 0x2595,  0x25C6,  0x1FB80, 0x1FBBB, 0x1FBBC, 0x258F,  // 🮹🮺▕◆🮀🮻🮼▏
	};
	
	private final boolean enhanced;
	private final boolean iigs;
	private final LogoSubstitute logo;
	
	public AppleIIDecoder(Charset cs, boolean enhanced, boolean iigs, LogoSubstitute logo) {
		super(cs);
		this.enhanced = enhanced;
		this.iigs = iigs;
		this.logo = logo;
	}
	
	@Override
	protected int decode(int b) {
		switch (b & 0xE0) {
		case 0x00: return b | 0x40;
		case 0x20: return b;
		case 0x40: return (!enhanced) ? b :
		                  (b == 0x40) ? logo.solidApple :
		                  (b == 0x41) ? logo.openApple :
		                  (iigs ? MOUSETEXT_IIGS : MOUSETEXT_IIE)[b & 0x1F];
		case 0x60: return enhanced ? b : (b & 0x3F);
		default:   return b & 0x7F;
		}
	}
}
