package com.kreative.charset.sharpscii;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import com.kreative.charset.AbstractCharsetProvider;

public class SharpsciiCharsetProvider extends AbstractCharsetProvider {
	public SharpsciiCharsetProvider() {
		super(
			// Japanese Interchange
			new SharpsciiCharset(SharpsciiVariant.MZ80K_JP, false, false),
			new SharpsciiCharset(SharpsciiVariant.MZ80A_JP, false, false),
			new SharpsciiCharset(SharpsciiVariant.MZ700_JP, false, false,
				"x-sharpscii-jp",
				"x-sharpscii-mz700-jp",
				"x-sharpscii-mz1500-jp"),
			new SharpsciiCharset(SharpsciiVariant.MZ700_JP, true, false,
				"x-sharpscii-jp-alt",
				"x-sharpscii-mz700-jp-alt",
				"x-sharpscii-mz1500-jp-alt"),
			new SharpsciiCharset(SharpsciiVariant.MZ800_JP, false, false),
			new SharpsciiCharset(SharpsciiVariant.MZ800_JP, true, false),
			// European Interchange
			new SharpsciiCharset(SharpsciiVariant.MZ80K_EU, false, false),
			new SharpsciiCharset(SharpsciiVariant.MZ80A_EU, false, false),
			new SharpsciiCharset(SharpsciiVariant.MZ700_EU, false, false,
				"x-sharpscii-eu",
				"x-sharpscii-mz700-eu",
				"x-sharpscii-mz800-eu"),
			// Japanese Video
			new SharpsciiCharset(SharpsciiVariant.MZ700_JP, false, true,
				"x-sharpscii-jp-video",
				"x-sharpscii-mz80k-jp-video",
				"x-sharpscii-mz80a-jp-video",
				"x-sharpscii-mz700-jp-video",
				"x-sharpscii-mz800-jp-video",
				"x-sharpscii-mz1500-jp-video"),
			new SharpsciiCharset(SharpsciiVariant.MZ700_JP, true, true,
				"x-sharpscii-jp-alt-video",
				"x-sharpscii-mz700-jp-alt-video",
				"x-sharpscii-mz800-jp-alt-video",
				"x-sharpscii-mz1500-jp-alt-video"),
			// European Video
			new SharpsciiCharset(SharpsciiVariant.MZ80K_EU, false, true),
			new SharpsciiCharset(SharpsciiVariant.MZ80A_EU, false, true),
			new SharpsciiCharset(SharpsciiVariant.MZ700_EU, false, true,
				"x-sharpscii-eu-video",
				"x-sharpscii-mz700-eu-video",
				"x-sharpscii-mz800-eu-video"),
			new SharpsciiCharset(SharpsciiVariant.MZ700_EU, true, true,
				"x-sharpscii-eu-alt-video",
				"x-sharpscii-mz700-eu-alt-video",
				"x-sharpscii-mz800-eu-alt-video")
		);
	}
	
	public void dump(File tables) throws IOException {
		for (Charset cs : charsets) {
			File table = new File(tables, cs.name() + ".txt");
			FileOutputStream fos = new FileOutputStream(table);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			PrintWriter pw = new PrintWriter(osw, true);
			((SharpsciiCharset)cs).dump(pw);
			pw.flush();
			pw.close();
			for (String alias : cs.aliases()) {
				table = new File(tables, alias + ".txt");
				fos = new FileOutputStream(table);
				osw = new OutputStreamWriter(fos, "UTF-8");
				pw = new PrintWriter(osw, true);
				pw.print("./" + cs.name() + ".txt");
				pw.flush();
				pw.close();
			}
		}
	}
}
