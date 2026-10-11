package com.kreative.charset.sharpscii;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetDecoder;
import com.kreative.charset.unidata.NameResolver;

public class SharpsciiDecoder extends AbstractCharsetDecoder {
	private final int[] acdisp;
	private final int[] disp;
	private final boolean video;
	
	public SharpsciiDecoder(Charset cs, SharpsciiVariant variant, boolean alt, boolean video) {
		super(cs);
		this.acdisp = variant.acdisp();
		this.disp = alt ? variant.dispAlt() : variant.dispPri();
		this.video = video;
	}
	
	@Override
	protected int decode(int b) {
		if (video) return disp[b];
		if (b < 0x20) return b;
		return disp[acdisp[b]];
	}
	
	public void dump(PrintWriter out) {
		NameResolver names = new NameResolver();
		for (int i = 0; i < 0x100; i++) {
			String a = Integer.toHexString(i).toUpperCase();
			String b = Integer.toHexString(decode(i)).toUpperCase();
			while (a.length() < 2) a = "0" + a;
			while (b.length() < 4) b = "0" + b;
			String line = "0x" + a + "\tU+" + b;
			String name = names.getName(decode(i));
			if (name != null) line += "\t# " + name;
			out.println(line);
		}
	}
}
