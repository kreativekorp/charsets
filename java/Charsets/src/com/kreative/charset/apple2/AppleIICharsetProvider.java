package com.kreative.charset.apple2;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppleIICharsetProvider extends CharsetProvider {
	private final List<Charset> charsets;
	
	public AppleIICharsetProvider() {
		charsets = new ArrayList<Charset>();
		charsets.add(new AppleIICharset(false, false, LogoSubstitute.APPLE_PUA));
		for (LogoSubstitute logo : LogoSubstitute.values()) {
			charsets.add(new AppleIICharset(true, false, logo));
			charsets.add(new AppleIICharset(true, true, logo));
		}
	}
	
	@Override
	public Charset charsetForName(String name) {
		for (Charset charset : charsets) {
			if (charset.name().equalsIgnoreCase(name)) {
				return charset;
			}
			for (String alias : charset.aliases()) {
				if (alias.equalsIgnoreCase(name)) {
					return charset;
				}
			}
		}
		return null;
	}
	
	@Override
	public Iterator<Charset> charsets() {
		return charsets.iterator();
	}
}
