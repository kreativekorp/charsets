package com.kreative.charset.test;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class Decompile {
	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println("# Name: " + arg);
			System.out.println();
			try { decompile(Charset.forName(arg)); }
			catch (Exception e) { System.out.println("# " + e); }
			System.out.println();
		}
	}
	
	private static void decompile(Charset cs) {
		CharsetDecoder decoder = cs.newDecoder();
		decoder.onMalformedInput(CodingErrorAction.REPLACE);
		decoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
		decoder.replaceWith("\uFFFF");
		decompile(decoder, new byte[256], 0, new char[256]);
	}
	
	private static void decompile(CharsetDecoder decoder, byte[] in, int pos, char[] out) {
		for (int ch = 0; ch < 256; ch++) {
			in[pos] = (byte)ch;
			ByteBuffer inb = ByteBuffer.wrap(in, 0, pos+1);
			CharBuffer outb = CharBuffer.wrap(out);
			decoder.reset();
			decoder.decode(inb, outb, false);
			if (outb.position() > 0) {
				String s = new String(out, 0, outb.position());
				if (s.contains("\uFFFF")) continue;
				System.out.println("0x" + bytesToHex(in, 0, pos+1) + "\tU+" + charsToHex(s));
			} else if (pos+1 < in.length) {
				decompile(decoder, in, pos+1, out);
			} else {
				throw new InputTooLongException();
			}
		}
	}
	
	private static String bytesToHex(byte[] bytes, int off, int len) {
		StringBuffer s = new StringBuffer();
		for (int i = 0; i < len; i++) {
			int b = bytes[off + i] & 0xFF;
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
	
	private static class InputTooLongException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}
}
