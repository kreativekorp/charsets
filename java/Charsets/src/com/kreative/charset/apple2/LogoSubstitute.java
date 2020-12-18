package com.kreative.charset.apple2;

public enum LogoSubstitute {
	TECHNICAL("-mod", 0x2325, 0x2318),
	LINUX_PUA("-linux", 0xF813, 0xF812),
	APPLE_PUA("", 0xF8FF, 0xF8FFF87F),
	EMOJI("-emoji", 0x1F34E, 0x1F34F);
	
	public final String suffix;
	public final int solidApple;
	public final int openApple;
	
	private LogoSubstitute(String suffix, int solidApple, int openApple) {
		this.suffix = suffix;
		this.solidApple = solidApple;
		this.openApple = openApple;
	}
}
