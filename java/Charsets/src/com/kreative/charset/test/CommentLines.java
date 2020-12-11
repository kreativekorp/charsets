package com.kreative.charset.test;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommentLines {
	private static final Pattern HEX_PATTERN = Pattern.compile("[0-9A-Fa-f]{2,}");
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true);
		Scanner sc = new Scanner(System.in, "UTF-8");
		while (sc.hasNextLine()) {
			String line = sc.nextLine().trim();
			if (line.length() == 0) continue;
			Matcher m = HEX_PATTERN.matcher(line);
			if (!m.find()) continue;
			out.print("// ");
			do { out.print(Character.toChars(Integer.parseInt(m.group(), 16))); }
			while (m.find());
			out.println();
		}
		sc.close();
	}
}
