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
			byte[] buf = new byte[16];
			for (int i = 0; i < 256; i++) {
				buf[i & 0xF] = (byte)i;
				if ((i & 0xF) == 0xF) {
					String s = new String(buf, cs);
					s = s.replaceAll("[\u0000-\u001F\u007F-\u009F]", ".");
					out.println(s);
				}
			}
		} catch (IllegalCharsetNameException e) {
			System.err.println("There is no encoding named " + args[0] + ".");
		} catch (UnsupportedCharsetException e) {
			System.err.println("There is no encoding named " + args[0] + ".");
		}
	}
}
