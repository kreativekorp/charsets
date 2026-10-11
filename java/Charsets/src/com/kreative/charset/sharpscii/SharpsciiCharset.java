package com.kreative.charset.sharpscii;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SharpsciiCharset extends Charset {
	private static final String name(SharpsciiVariant variant, boolean alt, boolean video) {
		StringBuffer sb = new StringBuffer("x-sharpscii-");
		sb.append(variant.name().replace('_','-').toLowerCase());
		if (alt) sb.append("-alt");
		if (video) sb.append("-video");
		return sb.toString();
	}
	
	private final SharpsciiVariant variant;
	private final boolean alt;
	private final boolean video;
	
	public SharpsciiCharset(SharpsciiVariant variant, boolean alt, boolean video) {
		super(name(variant, alt, video), new String[]{});
		this.variant = variant;
		this.alt = alt;
		this.video = video;
	}
	
	public SharpsciiCharset(SharpsciiVariant variant, boolean alt, boolean video, String name, String... aliases) {
		super(name, aliases);
		this.variant = variant;
		this.alt = alt;
		this.video = video;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return false;
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new SharpsciiDecoder(this, variant, alt, video);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new SharpsciiEncoder(this, variant, alt, video);
	}
	
	public void dump(PrintWriter out) {
		StringBuffer name = new StringBuffer("SharpSCII");
		boolean first = true;
		for (String mz : Arrays.asList("mz80k","mz80a","mz700","mz800","mz1500")) {
			if (this.name().contains(mz)) {
				name.append(first ? ' ' : '/');
				name.append("MZ-");
				name.append(mz.substring(2).toUpperCase());
				first = false;
				continue;
			}
			for (String alias : aliases()) {
				if (alias.contains(mz)) {
					name.append(first ? ' ' : '/');
					name.append("MZ-");
					name.append(mz.substring(2).toUpperCase());
					first = false;
					break;
				}
			}
		}
		if (this.name().contains("-jp")) name.append(" Japanese");
		if (this.name().contains("-eu")) name.append(" European");
		if (!video) name.append(" Interchange");
		if (video) name.append(" Video");
		name.append(" Character Set");
		out.println("# Name: " + name.toString());
		out.println("# Date: " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		out.println("# Auth: Rebecca Bettencourt");
		out.println(); new SharpsciiDecoder(this, variant, alt, video).dump(out);
		out.println(); new SharpsciiEncoder(this, variant, alt, video).dump(out);
	}
}
