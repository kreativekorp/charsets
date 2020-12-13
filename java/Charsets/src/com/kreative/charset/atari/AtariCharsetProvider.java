package com.kreative.charset.atari;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AtariCharsetProvider extends CharsetProvider {
	private final List<Charset> charsets;
	
	public AtariCharsetProvider() {
		charsets = Arrays.asList(
			new AtasciiCharset(false),
			new AtasciiCharset(true),
			new AtariSTCharset(false),
			new AtariSTCharset(true)
		);
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
