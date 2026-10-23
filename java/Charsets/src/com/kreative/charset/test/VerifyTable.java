package com.kreative.charset.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyTable {
	private static final Pattern CODE_POINT = Pattern.compile("\\bU\\+(([1-9A-F]|10)?[0-9A-F]{4})\\b");
	private static final Pattern BYTES_TO_CHARS = Pattern.compile("^0x(([0-9A-F]{2})+)\\s+U((\\+([1-9A-F]|10)?[0-9A-F]{4})+)$");
	private static final Pattern CHARS_TO_BYTES = Pattern.compile("^U((\\+([1-9A-F]|10)?[0-9A-F]{4})+)\\s+0x(([0-9A-F]{2})+)$");
	private static final String ERROR = "\u001B[1;31mERROR:\u001B[0m";
	private static final String WARN = "\u001B[1;33mWARN:\u001B[0m";
	private static final String OK = "\u001B[1;32mOK\u001B[0m";
	private static final String ALL_OK = "\u001B[1;32mALL OK\u001B[0m";
	
	private static final Comparator<File> FILE_CMP = new Comparator<File>() {
		public int compare(File a, File b) {
			return a.getName().compareToIgnoreCase(b.getName());
		}
	};
	
	private static ArrayList<Integer> extractEmoji(String s) {
		ArrayList<Integer> emoji = new ArrayList<Integer>();
		int i = 0; int n = s.length();
		while (i < n) {
			int cp = s.codePointAt(i);
			i += Character.charCount(cp);
			if (EmojiData.EMOJI_WITH_VARIATION_SEQUENCES.contains(cp) && i < n) {
				if (s.charAt(i) == EmojiData.EMOJI_STYLE) {
					emoji.add(cp);
					continue;
				}
				if (s.charAt(i) == EmojiData.TEXT_STYLE) {
					continue;
				}
			}
			if (EmojiData.EMOJI_PRESENTATION.contains(cp)) {
				emoji.add(cp);
			}
		}
		return emoji;
	}
	
	private static String emojiToText(int cp) {
		Integer tcp = EmojiData.EMOJI_TO_TEXT_VARIANT.get(cp);
		if (tcp != null) return String.valueOf(Character.toChars(tcp));
		boolean wvs = EmojiData.EMOJI_WITH_VARIATION_SEQUENCES.contains(cp);
		if (wvs) return String.valueOf(Character.toChars(cp)) + EmojiData.TEXT_STYLE;
		return null;
	}
	
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
	
	private static String bytesToHex(byte[] bytes) {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			if (i != 0) s.append(" ");
			int b = bytes[i] & 0xFF;
			String h = Integer.toHexString(b);
			if (h.length() < 2) s.append("0");
			s.append(h.toUpperCase());
		}
		return s.toString();
	}
	
	private static String charsToHex(String chars) {
		StringBuffer s = new StringBuffer();
		int i = 0; int n = chars.length();
		while (i < n) {
			if (i != 0) s.append("+");
			int ch = chars.codePointAt(i);
			String h = Integer.toHexString(ch);
			while (h.length() < 4) h = "0" + h;
			s.append(h.toUpperCase());
			i += Character.charCount(ch);
		}
		return s.toString();
	}
	
	private static boolean verifyLines(ArrayList<String> lines, String charset, boolean roundTrip) {
		TreeSet<Integer> allowedEmoji = new TreeSet<Integer>();
		TreeMap<String,String> bytesToChars = new TreeMap<String,String>();
		TreeMap<String,String> charsToBytes = new TreeMap<String,String>();
		TreeSet<Integer> puaChars = new TreeSet<Integer>();
		boolean ok = true;
		for (String line : lines) {
			int o = line.indexOf('#');
			String comment = (o < 0) ? "" : line.substring(o + 1).trim();
			line = (o < 0) ? line.trim() : line.substring(0, o).trim();
			if (comment.startsWith("Allow-Emoji:")) {
				Matcher m = CODE_POINT.matcher(comment);
				while (m.find()) allowedEmoji.add(Integer.parseInt(m.group(1), 16));
			}
			if (line.length() == 0) continue;
			Matcher bm = BYTES_TO_CHARS.matcher(line);
			if (bm.matches()) {
				if (roundTrip) {
					for (int emoji : extractEmoji(hexToChars(bm.group(3).substring(1)))) {
						if (allowedEmoji.contains(emoji)) continue;
						String h = Integer.toHexString(emoji).toUpperCase();
						while (h.length() < 4) h = "0" + h;
						String text = emojiToText(emoji);
						if (text == null) {
							System.out.println("  " + WARN + " Mapping 0x" + bm.group(1) + " -> U" + bm.group(3) + " contains emoji U+" + h);
						} else {
							System.out.println("  " + WARN + " Mapping 0x" + bm.group(1) + " -> U" + bm.group(3) + " contains emoji U+" + h + "; suggested replacement: U+" + charsToHex(text));
						}
					}
				}
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
					try {
						String expected = hexToChars(bm.group(3).substring(1));
						String actual = new String(hexToBytes(bm.group(1)), charset);
						if (!actual.equals(expected)) {
							System.out.println("  " + ERROR + " Decode failed for byte sequence 0x" + bm.group(1));
							System.out.println("  * Got: " + charsToHex(actual) + " * Want: " + charsToHex(expected));
							ok = false;
						}
					} catch (Throwable t) {
						System.out.println("  " + ERROR + " Decode failed for byte sequence 0x" + bm.group(1));
						System.out.println("  * " + t);
						ok = false;
					}
				}
				continue;
			}
			Matcher cm = CHARS_TO_BYTES.matcher(line);
			if (cm.matches()) {
				for (String cps : cm.group(1).substring(1).split("[+]")) {
					int cp = Integer.parseInt(cps, 16);
					if (roundTrip && cp >= 0xD800 && cp <= 0xDFFF) {
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
					charsToBytes.put(cm.group(1), cm.group(4));
					try {
						byte[] expected = hexToBytes(cm.group(4));
						byte[] actual = hexToChars(cm.group(1).substring(1)).getBytes(charset);
						if (!Arrays.equals(actual, expected)) {
							System.out.println("  " + ERROR + " Encode failed for character sequence U" + cm.group(1));
							System.out.println("  * Got: " + bytesToHex(actual) + " * Want: " + bytesToHex(expected));
							ok = false;
						}
					} catch (Throwable t) {
						System.out.println("  " + ERROR + " Encode failed for character sequence U" + cm.group(1));
						System.out.println("  * " + t);
						ok = false;
					}
				}
				continue;
			}
			System.out.println("  " + ERROR + " Syntax error in line: " + line);
			ok = false;
		}
		if (roundTrip) {
			if (bytesToChars.isEmpty()) {
				System.out.println("  " + ERROR + " No byte sequences mapped to any character sequences");
				ok = false;
			}
			if (charsToBytes.isEmpty()) {
				System.out.println("  " + ERROR + " No character sequences mapped to any byte sequences");
				ok = false;
			}
			for (String cbs : charsToBytes.values()) {
				String ccs = (cbs == null) ? null : bytesToChars.get(cbs);
				String rbs = (ccs == null) ? null : charsToBytes.get(ccs);
				if (!cbs.equals(rbs)) {
					cbs = (cbs == null) ? "unmapped" : ("0x" + cbs);
					rbs = (rbs == null) ? "unmapped" : ("0x" + rbs);
					System.out.println("  " + ERROR + " Failed to roundtrip " + cbs + "; returned as " + rbs);
					ok = false;
				}
			}
			for (String ccs : bytesToChars.values()) {
				String cbs = (ccs == null) ? null : charsToBytes.get(ccs);
				String rcs = (cbs == null) ? null : bytesToChars.get(cbs);
				if (!ccs.equals(rcs)) {
					ccs = (ccs == null) ? "unmapped" : ("U" + ccs);
					rcs = (rcs == null) ? "unmapped" : ("U" + rcs);
					System.out.println("  " + ERROR + " Failed to roundtrip " + ccs + "; returned as " + rcs);
					ok = false;
				}
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
	
	private static boolean verifyFile(File file, String charset, boolean roundTrip) throws FileNotFoundException {
		ArrayList<String> lines = new ArrayList<String>();
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) lines.add(scan.nextLine());
		scan.close();
		if (lines.size() == 1 && lines.get(0).startsWith("./") && lines.get(0).endsWith(".txt")) {
			System.out.println("  -> " + lines.get(0));
			return verifyFile(new File(file.getParentFile(), lines.get(0).substring(2)), charset, roundTrip);
		} else {
			return verifyLines(lines, charset, roundTrip);
		}
	}
	
	private static boolean verify(File file, String charset, boolean roundTrip) {
		if (file.isDirectory()) {
			boolean ok = true;
			File[] children = file.listFiles();
			Arrays.sort(children, FILE_CMP);
			for (File child : children) {
				if (child.getName().startsWith(".") || child.getName().endsWith("\r")) continue;
				if (child.isDirectory() || child.getName().endsWith(".txt")) {
					if (!verify(child, charset, roundTrip)) {
						ok = false;
					}
				}
			}
			return ok;
		} else try {
			String name = file.getName();
			System.out.println(name);
			if (charset == null) {
				charset = name.endsWith(".txt") ? name.substring(0, name.length() - 4) : name;
			}
			return verifyFile(file, charset, roundTrip);
		} catch (FileNotFoundException e) {
			System.out.println("  " + ERROR + " File does not exist: " + file.getName());
			return false;
		}
	}
	
	public static void main(String[] args) {
		boolean parseOpts = true;
		String charset = null;
		boolean roundTrip = true;
		boolean ok = true;
		int argi = 0;
		while (argi < args.length) {
			String arg = args[argi++];
			if (parseOpts && arg.startsWith("-")) {
				if (arg.equals("--")) {
					parseOpts = false;
				} else if (arg.equals("-c") && argi < args.length) {
					charset = args[argi++];
				} else if (arg.equals("-C")) {
					charset = null;
				} else if (arg.equals("-t")) {
					roundTrip = false;
				} else if (arg.equals("-T")) {
					roundTrip = true;
				} else {
					System.out.println(ERROR + " Unknown option: " + arg);
					ok = false;
				}
			} else if (!verify(new File(arg), charset, roundTrip)) {
				ok = false;
			}
		}
		if (ok) System.out.println(ALL_OK);
	}
}
