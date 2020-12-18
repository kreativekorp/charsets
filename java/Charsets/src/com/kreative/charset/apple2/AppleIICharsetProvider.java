package com.kreative.charset.apple2;

import com.kreative.charset.AbstractCharsetProvider;

public class AppleIICharsetProvider extends AbstractCharsetProvider {
	public AppleIICharsetProvider() {
		charsets.add(new AppleIICharset(false, false, LogoSubstitute.APPLE_PUA));
		for (LogoSubstitute logo : LogoSubstitute.values()) {
			charsets.add(new AppleIICharset(true, false, logo));
			charsets.add(new AppleIICharset(true, true, logo));
		}
	}
}
