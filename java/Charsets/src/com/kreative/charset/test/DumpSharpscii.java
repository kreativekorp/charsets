package com.kreative.charset.test;

import java.io.File;
import java.io.IOException;
import com.kreative.charset.sharpscii.SharpsciiCharsetProvider;

public class DumpSharpscii {
	public static void main(String[] args) {
		for (String arg : args) {
			try { new SharpsciiCharsetProvider().dump(new File(arg)); }
			catch (IOException e) { e.printStackTrace(); }
		}
	}
}
