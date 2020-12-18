package com.kreative.charset;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractCharsetProvider extends CharsetProvider {
	protected final List<Charset> charsets;
	
	protected AbstractCharsetProvider() {
		this.charsets = new ArrayList<Charset>();
	}
	
	protected AbstractCharsetProvider(Charset... charsets) {
		this.charsets = Arrays.asList(charsets);
	}
	
	@Override
	public final Charset charsetForName(String name) {
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
	public final Iterator<Charset> charsets() {
		return charsets.iterator();
	}
}
