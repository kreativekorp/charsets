package com.kreative.charset.test;

import java.nio.charset.Charset;

public class ListCharsets {
	public static void main(String[] args) {
		for (Charset cs : Charset.availableCharsets().values()) {
			System.out.println(cs.displayName());
		}
	}
}
