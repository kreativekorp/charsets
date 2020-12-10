package com.kreative.charset.test;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Scanner;

public class EncoderTest {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Must specify one argument which is encoding name.");
		} else try {
			Charset cs = Charset.forName(args[0]);
			Scanner sc = new Scanner(System.in, "UTF-8");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				line = unescape(line);
				byte[] bytes = line.getBytes(cs);
				printBytes(bytes);
			}
			sc.close();
		} catch (IllegalCharsetNameException e) {
			System.err.println("There is no encoding named " + args[0] + ".");
		} catch (UnsupportedCharsetException e) {
			System.err.println("There is no encoding named " + args[0] + ".");
		}
	}
	
	private static String unescape(String s) {
		char[] in = s.toCharArray();
		StringBuffer out = new StringBuffer();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == '\\' && i+1 < in.length) {
				switch (in[++i]) {
				case '0': out.append((char)0); continue;
				case 'a': out.append((char)7); continue;
				case 'b': out.append((char)8); continue;
				case 't': out.append((char)9); continue;
				case 'n': out.append((char)10); continue;
				case 'v': out.append((char)11); continue;
				case 'f': out.append((char)12); continue;
				case 'r': out.append((char)13); continue;
				case 'o': out.append((char)14); continue;
				case 'i': out.append((char)15); continue;
				case 'z': out.append((char)26); continue;
				case 'e': out.append((char)27); continue;
				case 'd': out.append((char)127); continue;
				case 'x':
					if (i+1 < in.length) {
						int x = 0;
						for (int j = 0; j < 2; j++) {
							if (i+1 < in.length) {
								x = (x << 4) | Character.digit(in[++i], 16);
							}
						}
						out.append((char)x);
						continue;
					}
					break;
				case 'u':
					if (i+1 < in.length) {
						int u = 0;
						for (int j = 0; j < 4; j++) {
							if (i+1 < in.length) {
								u = (u << 4) | Character.digit(in[++i], 16);
							}
						}
						out.append((char)u);
						continue;
					}
					break;
				case 'U':
					if (i+1 < in.length) {
						int u = 0;
						for (int j = 0; j < 6; j++) {
							if (i+1 < in.length) {
								u = (u << 4) | Character.digit(in[++i], 16);
							}
						}
						if (u < 0 || u > 0x10FFFF) u = 0x10FFFF;
						out.append(Character.toChars(u));
						continue;
					}
					break;
				}
			}
			out.append(in[i]);
		}
		return out.toString();
	}
	
	private static void printBytes(byte[] bytes) {
		if (bytes.length > 0) {
			for (byte b : bytes) {
				String h = Integer.toHexString(b & 0xFF).toUpperCase();
				while (h.length() < 2) h = "0" + h;
				System.out.print(h + " ");
			}
			System.out.print("| ");
			for (byte b : bytes) {
				char c = (char)(b & 0xFF);
				if (c < 0x20 || c >= 0x7F) c = '.';
				System.out.print(c);
			}
		}
		System.out.println();
	}
}
