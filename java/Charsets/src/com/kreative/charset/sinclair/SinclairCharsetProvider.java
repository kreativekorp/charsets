package com.kreative.charset.sinclair;

import com.kreative.charset.AbstractCharsetProvider;

public class SinclairCharsetProvider extends AbstractCharsetProvider {
	public SinclairCharsetProvider() {
		charsets.add(new ZX8xCharset(false));
		charsets.add(new ZX8xCharset(true));
		for (ZXSpectrumVariant variant : ZXSpectrumVariant.values()) {
			charsets.add(new ZXSpectrumCharset(variant));
		}
		charsets.add(new SinclairQLCharset(false));
		charsets.add(new SinclairQLCharset(true));
	}
}
