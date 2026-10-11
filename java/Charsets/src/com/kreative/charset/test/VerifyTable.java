package com.kreative.charset.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyTable {
	private static final Pattern BYTES_TO_CHARS = Pattern.compile("^0x(([0-9A-F]{2})+)\\s+U((\\+[0-9A-F]+)+)$");
	private static final Pattern CHARS_TO_BYTES = Pattern.compile("^U((\\+[0-9A-F]+)+)\\s+0x(([0-9A-F]{2})+)$");
	private static final String ERROR = "\u001B[1;31mERROR:\u001B[0m";
	private static final String OK = "\u001B[1;32mOK\u001B[0m";
	private static final String ALL_OK = "\u001B[1;32mALL OK\u001B[0m";
	
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
	
	private static boolean verifyLines(ArrayList<String> lines, String charset) throws UnsupportedEncodingException {
		TreeMap<String,String> bytesToChars = new TreeMap<String,String>();
		TreeMap<String,String> charsToBytes = new TreeMap<String,String>();
		TreeSet<Integer> puaChars = new TreeSet<Integer>();
		boolean ok = true;
		for (String line : lines) {
			line = line.split("#")[0].trim();
			if (line.length() == 0) continue;
			Matcher bm = BYTES_TO_CHARS.matcher(line);
			if (bm.matches()) {
				for (String cps : bm.group(3).substring(1).split("[+]")) {
					int cp = Integer.parseInt(cps, 16);
					if (cp >= 0xD800 && cp <= 0xDFFF) {
						System.out.println("  " + ERROR + " Use of UTF-16 surrogate in character sequence U" + bm.group(3));
						ok = false;
					}
					if ((cp >= 0xE000 && cp <= 0xF8FF) || cp >= 0xF0000) {
						puaChars.add(cp);
					}
				}
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
				for (String cps : cm.group(1).substring(1).split("[+]")) {
					int cp = Integer.parseInt(cps, 16);
					if (cp >= 0xD800 && cp <= 0xDFFF) {
						System.out.println("  " + ERROR + " Use of UTF-16 surrogate in character sequence U" + cm.group(1));
						ok = false;
					}
					if ((cp >= 0xE000 && cp <= 0xF8FF) || cp >= 0xF0000) {
						puaChars.add(cp);
					}
				}
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
		for (String cbs : charsToBytes.values()) {
			String ccs = bytesToChars.get(cbs);
			String rbs = charsToBytes.get(ccs);
			if (!cbs.equals(rbs)) {
				System.out.println("  " + ERROR + " Failed to roundtrip 0x" + cbs + "; returned as 0x" + ((rbs != null) ? rbs : "<null>"));
				ok = false;
			}
		}
		for (String ccs : bytesToChars.values()) {
			String cbs = charsToBytes.get(ccs);
			String rcs = bytesToChars.get(cbs);
			if (!ccs.equals(rcs)) {
				System.out.println("  " + ERROR + " Failed to roundtrip U" + ccs + "; returned as U" + ((rcs != null) ? rcs : "+<null>"));
				ok = false;
			}
		}
		if (!puaChars.isEmpty()) {
			StringBuffer sb = new StringBuffer("  PUA");
			for (int cp : puaChars) {
				String h = Integer.toHexString(cp).toUpperCase();
				while (h.length() < 4) h = "0" + h;
				sb.append(" " + h);
			}
			System.out.println(sb.toString());
		}
		if (ok) {
			System.out.println("  " + OK + " " + bytesToChars.size() + " " + charsToBytes.size());
		}
		return ok;
	}
	
	private static boolean verifyFile(File file, String charset) throws FileNotFoundException {
		ArrayList<String> lines = new ArrayList<String>();
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) lines.add(scan.nextLine());
		scan.close();
		if (lines.size() == 1 && lines.get(0).startsWith("./") && lines.get(0).endsWith(".txt")) {
			System.out.println("  -> " + lines.get(0));
			return verifyFile(new File(file.getParentFile(), lines.get(0).substring(2)), charset);
		} else try {
			return verifyLines(lines, charset);
		} catch (UnsupportedEncodingException e) {
			System.out.println("  " + ERROR + " Unsupported encoding: " + charset);
			return false;
		}
	}
	
	private static boolean verify(File file) {
		if (file.isDirectory()) {
			boolean ok = true;
			File[] children = file.listFiles();
			Arrays.sort(children, FILE_CMP);
			for (File child : children) {
				if (child.getName().startsWith(".") || child.getName().endsWith("\r")) continue;
				if (child.isDirectory() || child.getName().endsWith(".txt")) {
					if (!verify(child)) {
						ok = false;
					}
				}
			}
			return ok;
		} else try {
			System.out.println(file.getName());
			return verifyFile(file, file.getName().substring(0, file.getName().length() - 4));
		} catch (FileNotFoundException e) {
			System.out.println("  " + ERROR + " File does not exist: " + file.getName());
			return false;
		}
	}
	
	public static void main(String[] args) {
		boolean ok = true;
		for (String arg : args) {
			if (!verify(new File(arg))) {
				ok = false;
			}
		}
		if (ok) System.out.println(ALL_OK);
	}
}
