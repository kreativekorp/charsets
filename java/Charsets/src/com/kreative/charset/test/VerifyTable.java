package com.kreative.charset.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyTable {
	private static final Pattern BYTES_TO_CHARS = Pattern.compile("^0x(([0-9A-F]{2})+)\\s+U((\\+[0-9A-F]+)+)$");
	private static final Pattern CHARS_TO_BYTES = Pattern.compile("^U((\\+[0-9A-F]+)+)\\s+0x(([0-9A-F]{2})+)$");
	private static final String ERROR = "\u001B[1;31mERROR:\u001B[0m";
	private static final String OK = "\u001B[1;32mOK\u001B[0m";
	
	private static final Comparator<File> FILE_CMP = new Comparator<File>() {
		public int compare(File a, File b) {
			return a.getName().compareToIgnoreCase(b.getName());
		}
	};
	
	private static byte[] hexToBytes(String hex) {
		byte[] b = new byte[hex.length() / 2];
		for (int i = 0; i < hex.length(); i += 2) {
			String bs = hex.substring(i, i+2);
			int bi = Integer.parseInt(bs, 16);
			b[i / 2] = (byte)bi;
		}
		return b;
	}
	
	private static String hexToChars(String hex) {
		StringBuffer s = new StringBuffer();
		for (String cs : hex.split("[+]")) {
			int ci = Integer.parseInt(cs, 16);
			s.append(Character.toChars(ci));
		}
		return s.toString();
	}
	
	private static void verifyLines(ArrayList<String> lines, String charset) throws UnsupportedEncodingException {
		HashMap<String,String> bytesToChars = new HashMap<String,String>();
		HashMap<String,String> charsToBytes = new HashMap<String,String>();
		boolean ok = true;
		for (String line : lines) {
			line = line.split("#")[0].trim();
			if (line.length() == 0) continue;
			Matcher bm = BYTES_TO_CHARS.matcher(line);
			if (bm.matches()) {
				if (bytesToChars.containsKey(bm.group(1))) {
					System.out.println("  " + ERROR + " Duplicate mapping for byte sequence 0x" + bm.group(1));
					ok = false;
				} else {
					bytesToChars.put(bm.group(1), bm.group(3));
					String expected = hexToChars(bm.group(3).substring(1));
					String actual = new String(hexToBytes(bm.group(1)), charset);
					if (!actual.equals(expected)) {
						System.out.println("  " + ERROR + " Decode failed for byte sequence 0x" + bm.group(1));
						ok = false;
					}
				}
				continue;
			}
			Matcher cm = CHARS_TO_BYTES.matcher(line);
			if (cm.matches()) {
				if (charsToBytes.containsKey(cm.group(1))) {
					System.out.println("  " + ERROR + " Duplicate mapping for character sequence U" + cm.group(1));
					ok = false;
				} else {
					charsToBytes.put(cm.group(1), cm.group(3));
					byte[] expected = hexToBytes(cm.group(3));
					byte[] actual = hexToChars(cm.group(1).substring(1)).getBytes(charset);
					if (!Arrays.equals(actual, expected)) {
						System.out.println("  " + ERROR + " Encode failed for character sequence U" + cm.group(1));
						ok = false;
					}
				}
				continue;
			}
			System.out.println("  " + ERROR + " Syntax error in line: " + line);
			ok = false;
		}
		if (bytesToChars.isEmpty()) {
			System.out.println("  " + ERROR + " No byte sequences mapped to any character sequences");
			ok = false;
		}
		if (charsToBytes.isEmpty()) {
			System.out.println("  " + ERROR + " No character sequences mapped to any byte sequences");
			ok = false;
		}
		if (ok) {
			System.out.println("  " + OK + " " + bytesToChars.size() + " " + charsToBytes.size());
		}
	}
	
	private static void verifyFile(File file, String charset) throws FileNotFoundException {
		ArrayList<String> lines = new ArrayList<String>();
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) lines.add(scan.nextLine());
		scan.close();
		if (lines.size() == 1 && lines.get(0).startsWith("./") && lines.get(0).endsWith(".txt")) {
			System.out.println("  -> " + lines.get(0));
			verifyFile(new File(file.getParentFile(), lines.get(0).substring(2)), charset);
		} else try {
			verifyLines(lines, charset);
		} catch (UnsupportedEncodingException e) {
			System.out.println("  " + ERROR + " Unsupported encoding: " + charset);
		}
	}
	
	private static void verify(File file) {
		if (file.isDirectory()) {
			File[] children = file.listFiles();
			Arrays.sort(children, FILE_CMP);
			for (File child : children) {
				if (child.getName().startsWith(".") || child.getName().endsWith("\r")) continue;
				if (child.isDirectory() || child.getName().endsWith(".txt")) verify(child);
			}
		} else try {
			System.out.println(file.getName());
			verifyFile(file, file.getName().substring(0, file.getName().length() - 4));
		} catch (FileNotFoundException e) {
			System.out.println("  " + ERROR + " File does not exist: " + file.getName());
		}
	}
	
	public static void main(String[] args) {
		for (String arg : args) {
			verify(new File(arg));
		}
	}
}
