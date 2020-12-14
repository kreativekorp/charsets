package com.kreative.charset.test;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public class DecoderTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		if (args.length != 1) {
			System.err.println("Must specify one argument which is encoding name.");
		} else try {
			Charset cs = Charset.forName(args[0]);
			PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true);
			for (int i = 0; i < 256; i++) {
				String s = new String(new byte[]{(byte)i}, cs);
				out.print(isCtrl(s) ? "." : s);
				if ((i & 0xF) == 0xF) out.println();
			}
		} catch (IllegalCharsetNameException e) {
			System.err.println("There is no encoding named " + args[0] + ".");
		} catch (UnsupportedCharsetException e) {
			System.err.println("There is no encoding named " + args[0] + ".");
		}
	}
	
	private static boolean isCtrl(String s) {
		for (char ch : s.toCharArray()) {
			if (ch < 0x20 || (ch >= 0x80 && ch < 0xA0)) {
				return true;
			}
		}
		return false;
	}
}
