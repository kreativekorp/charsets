package com.kreative.charset.petscii;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PetsciiCharsetProvider extends CharsetProvider {
	private final List<Charset> charsets;
	
	public PetsciiCharsetProvider() {
		charsets = Arrays.asList(
			new PetsciiCharset(false, false),
			new PetsciiCharset(true, false),
			new PetsciiCharset(false, true),
			new PetsciiCharset(true, true),
			new Petscii8Charset(),
			new Latin9PCharset()
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
