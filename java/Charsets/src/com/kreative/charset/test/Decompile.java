package com.kreative.charset.test;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class Decompile {
	public static void main(String[] args) {
		for (String arg : args) {
			try { decompile(Charset.forName(arg)); }
			catch (Exception e) { System.out.println("# " + e); }
			System.out.println();
		}
	}
	
	private static void decompile(Charset cs) {
		System.out.println("# Name: " + cs.displayName());
		System.out.println();
		try {
			CharsetDecoder decoder = cs.newDecoder();
			decoder.onMalformedInput(CodingErrorAction.REPORT);
			decoder.onUnmappableCharacter(CodingErrorAction.REPORT);
			decompile(decoder, new byte[256], 0, new char[256]);
		} catch (Exception e) {
			System.out.println("# " + e);
		}
		System.out.println();
		try {
			CharsetEncoder encoder = cs.newEncoder();
			encoder.onMalformedInput(CodingErrorAction.REPORT);
			encoder.onUnmappableCharacter(CodingErrorAction.REPORT);
			decompile(encoder, new char[256], 0, new byte[256]);
		} catch (Exception e) {
			System.out.println("# " + e);
		}
	}
	
	private static void decompile(CharsetDecoder decoder, byte[] in, int pos, char[] out) {
		for (int ch = 0; ch < 256; ch++) {
			in[pos] = (byte)ch;
			ByteBuffer inb = ByteBuffer.wrap(in, 0, pos+1);
			CharBuffer outb = CharBuffer.wrap(out);
			decoder.reset();
			CoderResult res = decoder.decode(inb, outb, false);
			if (res == CoderResult.UNDERFLOW) {
				if (outb.position() > 0) {
					String h = bytesToHex(in, 0, pos+1);
					String u = charsToHex(new String(out, 0, outb.position()));
					System.out.println("0x" + h + "\tU+" + u);
				} else if (pos+1 < in.length) {
					decompile(decoder, in, pos+1, out);
				} else {
					throw new InputTooLongException();
				}
			}
		}
	}
	
	private static void decompile(CharsetEncoder encoder, char[] in, int pos, byte[] out) {
		for (int ch = 0; ch < 65536; ch++) {
			in[pos] = (char)ch;
			CharBuffer inb = CharBuffer.wrap(in, 0, pos+1);
			ByteBuffer outb = ByteBuffer.wrap(out);
			encoder.reset();
			CoderResult res = encoder.encode(inb, outb, false);
			if (res == CoderResult.UNDERFLOW) {
				if (outb.position() > 0) {
					String u = charsToHex(new String(in, 0, pos+1));
					String h = bytesToHex(out, 0, outb.position());
					System.out.println("U+" + u + "\t0x" + h);
				} else if (pos+1 < in.length) {
					decompile(encoder, in, pos+1, out);
				} else {
					throw new InputTooLongException();
				}
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
