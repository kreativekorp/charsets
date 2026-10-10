package com.kreative.charset.petscii;

import com.kreative.charset.AbstractCharsetProvider;

public class PetsciiCharsetProvider extends AbstractCharsetProvider {
	public PetsciiCharsetProvider() {
		super(
			new PetsciiCharset(PetsciiPlatform.PET, false, false),
			new PetsciiCharset(PetsciiPlatform.PET, true, false),
			new PetsciiCharset(PetsciiPlatform.PET, false, true),
			new PetsciiCharset(PetsciiPlatform.PET, true, true),
			new PetsciiCharset(PetsciiPlatform.VIC, false, false),
			new PetsciiCharset(PetsciiPlatform.VIC, true, false),
			new PetsciiCharset(PetsciiPlatform.VIC, false, true),
			new PetsciiCharset(PetsciiPlatform.VIC, true, true),
			new PetsciiCharset(PetsciiPlatform.C64, false, false),
			new PetsciiCharset(PetsciiPlatform.C64, true, false),
			new PetsciiCharset(PetsciiPlatform.C64, false, true),
			new PetsciiCharset(PetsciiPlatform.C64, true, true),
			new Petscii8Charset(),
			new Latin9PCharset()
		);
	}
}
