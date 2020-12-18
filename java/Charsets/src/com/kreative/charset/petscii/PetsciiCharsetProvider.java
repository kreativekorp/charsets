package com.kreative.charset.petscii;

import com.kreative.charset.AbstractCharsetProvider;

public class PetsciiCharsetProvider extends AbstractCharsetProvider {
	public PetsciiCharsetProvider() {
		super(
			new PetsciiCharset(false, false),
			new PetsciiCharset(true, false),
			new PetsciiCharset(false, true),
			new PetsciiCharset(true, true),
			new Petscii8Charset(),
			new Latin9PCharset()
		);
	}
}
