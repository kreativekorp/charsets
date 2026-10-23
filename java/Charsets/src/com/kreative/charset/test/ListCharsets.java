package com.kreative.charset.test;

import java.nio.charset.Charset;
import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;

public class ListCharsets {
	public static void main(String[] args) {
		boolean showMine = true;
		boolean showOthers = true;
		for (String arg : args) {
			if (arg.equals("-a")) {
				showMine = true;
				showOthers = true;
			} else if (arg.equals("-b") || arg.equals("-j")) {
				showMine = false;
				showOthers = true;
			} else if (arg.equals("-c") || arg.equals("-k")) {
				showMine = true;
				showOthers = false;
			} else {
				System.err.println("Unknown option: " + arg);
				return;
			}
		}
		for (Charset cs : Charset.availableCharsets().values()) {
			boolean isMine = (
				cs.newDecoder() instanceof TableCharsetDecoder &&
				cs.newEncoder() instanceof TableCharsetEncoder
			);
			if (isMine ? showMine : showOthers) {
				System.out.println(cs.displayName());
			}
		}
	}
}
