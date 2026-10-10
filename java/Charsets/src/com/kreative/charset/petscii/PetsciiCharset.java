package com.kreative.charset.petscii;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class PetsciiCharset extends Charset {
	private static final String name(PetsciiPlatform platform, boolean alt, boolean video) {
		StringBuffer sb = new StringBuffer("x-petscii");
		switch (platform) {
		case PET: sb.append("77"); break;
		case VIC: sb.append("80"); break;
		case C64: sb.append("82"); break;
		}
		if (alt) sb.append("-alt");
		if (video) sb.append("-video");
		return sb.toString();
	}
	
	private static final String[] aliases(PetsciiPlatform platform, boolean alt, boolean video) {
		if (platform == PetsciiPlatform.C64) {
			StringBuffer sb = new StringBuffer("x-petscii");
			if (alt) sb.append("-alt");
			if (video) sb.append("-video");
			return new String[]{sb.toString()};
		} else {
			return new String[]{};
		}
	}
	
	private final PetsciiPlatform platform;
	private final boolean alt;
	private final boolean video;
	
	public PetsciiCharset(PetsciiPlatform platform, boolean alt, boolean video) {
		super(name(platform, alt, video), aliases(platform, alt, video));
		this.platform = platform;
		this.alt = alt;
		this.video = video;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return false;
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new PetsciiDecoder(this, platform, alt, video);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new PetsciiEncoder(this, platform, alt, video);
	}
}
