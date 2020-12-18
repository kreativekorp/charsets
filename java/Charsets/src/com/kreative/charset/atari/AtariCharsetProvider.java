package com.kreative.charset.atari;

import com.kreative.charset.AbstractCharsetProvider;

public class AtariCharsetProvider extends AbstractCharsetProvider {
	public AtariCharsetProvider() {
		super(
			new AtasciiCharset(false, false),
			new AtasciiCharset(false, true),
			new AtasciiCharset(true, false),
			new AtasciiCharset(true, true),
			new AtariSTCharset(false),
			new AtariSTCharset(true)
		);
	}
}
