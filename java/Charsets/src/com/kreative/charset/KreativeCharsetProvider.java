package com.kreative.charset;

public class KreativeCharsetProvider extends AbstractCharsetProvider {
	public KreativeCharsetProvider() {
		super(
			new SuperLatinCharset(true),
			new SuperLatinCharset(false),
			new SuperMultinationalCharset(true),
			new SuperMultinationalCharset(false),
			new SuperRomanCharset(true),
			new SuperRomanCharset(false),
			new Super437Charset(true),
			new Super437Charset(false)
		);
	}
}
