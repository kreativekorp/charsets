package com.kreative.charset.sinclair;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SinclairCharsetProvider extends CharsetProvider {
	private final List<Charset> charsets;
	
	public SinclairCharsetProvider() {
		charsets = new ArrayList<Charset>();
		charsets.add(new ZX8xCharset(false));
		charsets.add(new ZX8xCharset(true));
		for (ZXSpectrumVariant variant : ZXSpectrumVariant.values()) {
			charsets.add(new ZXSpectrumCharset(variant));
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
