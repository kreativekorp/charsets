package com.kreative.charset;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;

public class TableCharset extends Charset {
	// Decoder Data
	private final float avgcpb;
	private final float maxcpb;
	private final HashMap<Integer,Integer> dst;
	private final HashMap<Integer,Long> dot;
	private final int dstn;
	private final int[] dstk;
	private final int[] dstv;
	private final int dotn;
	private final int[] dotk;
	private final long[] dotv;
	private final int dss;
	// Encoder Data
	private final float avgbpc;
	private final float maxbpc;
	private final byte[] erep;
	private final HashMap<Integer,Integer> est;
	private final HashMap<Integer,Long> eot;
	private final int estn;
	private final int[] estk;
	private final int[] estv;
	private final int eotn;
	private final int[] eotk;
	private final long[] eotv;
	private final int ess;
	
	protected TableCharset(
		float avgcpb, float maxcpb,
		int dstn, int[] dstk, int[] dstv,
		int dotn, int[] dotk, long[] dotv, int dss,
		float avgbpc, float maxbpc, byte[] erep,
		int estn, int[] estk, int[] estv,
		int eotn, int[] eotk, long[] eotv, int ess,
		String name, String... aliases
	) {
		super(name, aliases);
		// Decoder Data
		this.avgcpb = avgcpb;
		this.maxcpb = maxcpb;
		this.dst = new HashMap<Integer,Integer>(dstn);
		this.dot = new HashMap<Integer,Long>(dotn);
		this.dstn = dstn;
		this.dstk = dstk;
		this.dstv = dstv;
		this.dotn = dotn;
		this.dotk = dotk;
		this.dotv = dotv;
		this.dss = dss;
		// Encoder Data
		this.avgbpc = avgbpc;
		this.maxbpc = maxbpc;
		this.erep = erep;
		this.est = new HashMap<Integer,Integer>(estn);
		this.eot = new HashMap<Integer,Long>(eotn);
		this.estn = estn;
		this.estk = estk;
		this.estv = estv;
		this.eotn = eotn;
		this.eotk = eotk;
		this.eotv = eotv;
		this.ess = ess;
	}
	
	@Override
	public boolean contains(Charset cs) {
		return false;
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		if (dst.isEmpty()) for (int i = 0; i < dstn; i++) dst.put(dstk[i], dstv[i]);
		if (dot.isEmpty()) for (int i = 0; i < dotn; i++) dot.put(dotk[i], dotv[i]);
		return new TableCharsetDecoder(this, avgcpb, maxcpb, dst, dot, dss);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		if (est.isEmpty()) for (int i = 0; i < estn; i++) est.put(estk[i], estv[i]);
		if (eot.isEmpty()) for (int i = 0; i < eotn; i++) eot.put(eotk[i], eotv[i]);
		return new TableCharsetEncoder(this, avgbpc, maxbpc, erep, est, eot, ess);
	}
}
