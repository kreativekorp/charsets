package com.kreative.charset.apple2;

public enum LogoSubstitute {
	TECHNICAL {
		@Override public char[] solidApple() { return new char[]{ 0x2325 }; }
		@Override public char[] openApple() { return new char[]{ 0x2318 }; }
	},
	LINUX_PUA {
		@Override public char[] solidApple() { return new char[]{ 0xF813 }; }
		@Override public char[] openApple() { return new char[]{ 0xF812 }; }
	},
	APPLE_PUA {
		@Override public char[] solidApple() { return new char[]{ 0xF8FF }; }
		@Override public char[] openApple() { return new char[]{ 0xF8FF, 0xF87F }; }
	},
	EMOJI {
		@Override public char[] solidApple() { return Character.toChars(0x1F34E); }
		@Override public char[] openApple() { return Character.toChars(0x1F34F); }
	};
	
	public abstract char[] solidApple();
	public abstract char[] openApple();
}
