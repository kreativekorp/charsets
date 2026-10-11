package com.kreative.charset.sharpscii;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import com.kreative.charset.AbstractCharsetEncoder;
import com.kreative.charset.unidata.NameResolver;

public class SharpsciiEncoder extends AbstractCharsetEncoder {
	private final HashMap<Integer,Integer> mapping;
	
	public SharpsciiEncoder(Charset cs, SharpsciiVariant variant, boolean alt, boolean video) {
		super(cs, 1);
		this.mapping = new HashMap<Integer,Integer>();
		int[] acdisp = variant.acdisp();
		int[] disp = alt ? variant.dispAlt() : variant.dispPri();
		for (int b = 0; b < 0x100; b++) {
			if (video) mapping.put(disp[b], b);
			else if (b < 0x20) mapping.put(b, b);
			else mapping.put(disp[acdisp[b]], b);
		}
		// If only one case of letters is mapped, map the other case to the same byte sequences.
		for (int u = 'A', l = 'a'; u <= 'Z' && l <= 'z'; u++, l++) {
			if (mapping.get(u) == null && mapping.get(l) != null) mapping.put(u, mapping.get(l));
			if (mapping.get(l) == null && mapping.get(u) != null) mapping.put(l, mapping.get(u));
		}
		// Map pairs of characters unified in PETSCII to the same byte sequences.
		for (int i : PETSCII_DISUNIFICATION_MAP) {
			Integer dst = mapping.get(i & 0x1FFFF);
			if (dst == null) continue;
			int src = (i >> 16) & 0xFFFE; // sic
			if (mapping.containsKey(src)) continue;
			mapping.put(src, dst);
		}
		// Map halfwidth and fullwidth forms to the same byte sequences as their decompositions.
		for (int i : HALFWIDTH_FULLWIDTH_MAP) {
			Integer dst = mapping.get(i & 0xFFFF);
			if (dst == null) continue;
			int src = (i >> 16) & 0xFFFF;
			if (mapping.containsKey(src)) continue;
			mapping.put(src, dst);
		}
	}
	
	@Override
	protected int encode(int ch) {
		Integer b = mapping.get(ch);
		return (b != null) ? b : UNMAPPABLE;
	}
	
	public void dump(PrintWriter out) {
		NameResolver names = new NameResolver();
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>(mapping);
		for (Map.Entry<Integer,Integer> e : map.entrySet()) {
			String a = Integer.toHexString(e.getKey()).toUpperCase();
			String b = Integer.toHexString(e.getValue()).toUpperCase();
			while (a.length() < 4) a = "0" + a;
			while (b.length() < 2) b = "0" + b;
			String line = "U+" + a + "\t0x" + b;
			String name = names.getName(e.getKey());
			if (name != null) line += "\t# " + name;
			out.println(line);
		}
	}
	
	private static final int[] PETSCII_DISUNIFICATION_MAP = {
		0x202225CF, 0x25E625CB, 0x2501FB79, 0x2503FB73
	};
	
	private static final int[] HALFWIDTH_FULLWIDTH_MAP = {
		0xFF010021,0xFF020022,0xFF030023,0xFF040024,0xFF050025,0xFF060026,0xFF070027,0xFF080028,
		0xFF090029,0xFF0A002A,0xFF0B002B,0xFF0C002C,0xFF0D002D,0xFF0E002E,0xFF0F002F,0xFF100030,
		0xFF110031,0xFF120032,0xFF130033,0xFF140034,0xFF150035,0xFF160036,0xFF170037,0xFF180038,
		0xFF190039,0xFF1A003A,0xFF1B003B,0xFF1C003C,0xFF1D003D,0xFF1E003E,0xFF1F003F,0xFF200040,
		0xFF210041,0xFF220042,0xFF230043,0xFF240044,0xFF250045,0xFF260046,0xFF270047,0xFF280048,
		0xFF290049,0xFF2A004A,0xFF2B004B,0xFF2C004C,0xFF2D004D,0xFF2E004E,0xFF2F004F,0xFF300050,
		0xFF310051,0xFF320052,0xFF330053,0xFF340054,0xFF350055,0xFF360056,0xFF370057,0xFF380058,
		0xFF390059,0xFF3A005A,0xFF3B005B,0xFF3C005C,0xFF3D005D,0xFF3E005E,0xFF3F005F,0xFF400060,
		0xFF410061,0xFF420062,0xFF430063,0xFF440064,0xFF450065,0xFF460066,0xFF470067,0xFF480068,
		0xFF490069,0xFF4A006A,0xFF4B006B,0xFF4C006C,0xFF4D006D,0xFF4E006E,0xFF4F006F,0xFF500070,
		0xFF510071,0xFF520072,0xFF530073,0xFF540074,0xFF550075,0xFF560076,0xFF570077,0xFF580078,
		0xFF590079,0xFF5A007A,0xFF5B007B,0xFF5C007C,0xFF5D007D,0xFF5E007E,0xFF5F2985,0xFF602986,
		0xFF613002,0xFF62300C,0xFF63300D,0xFF643001,0xFF6530FB,0xFF6630F2,0xFF6730A1,0xFF6830A3,
		0xFF6930A5,0xFF6A30A7,0xFF6B30A9,0xFF6C30E3,0xFF6D30E5,0xFF6E30E7,0xFF6F30C3,0xFF7030FC,
		0xFF7130A2,0xFF7230A4,0xFF7330A6,0xFF7430A8,0xFF7530AA,0xFF7630AB,0xFF7730AD,0xFF7830AF,
		0xFF7930B1,0xFF7A30B3,0xFF7B30B5,0xFF7C30B7,0xFF7D30B9,0xFF7E30BB,0xFF7F30BD,0xFF8030BF,
		0xFF8130C1,0xFF8230C4,0xFF8330C6,0xFF8430C8,0xFF8530CA,0xFF8630CB,0xFF8730CC,0xFF8830CD,
		0xFF8930CE,0xFF8A30CF,0xFF8B30D2,0xFF8C30D5,0xFF8D30D8,0xFF8E30DB,0xFF8F30DE,0xFF9030DF,
		0xFF9130E0,0xFF9230E1,0xFF9330E2,0xFF9430E4,0xFF9530E6,0xFF9630E8,0xFF9730E9,0xFF9830EA,
		0xFF9930EB,0xFF9A30EC,0xFF9B30ED,0xFF9C30EF,0xFF9D30F3,0xFF9E3099,0xFF9F309A,0xFFE000A2,
		0xFFE100A3,0xFFE200AC,0xFFE300AF,0xFFE400A6,0xFFE500A5,0xFFE620A9,0xFFE82502,0xFFE92190,
		0xFFEA2191,0xFFEB2192,0xFFEC2193,0xFFED25A0,0xFFEE25CB
	};
}
