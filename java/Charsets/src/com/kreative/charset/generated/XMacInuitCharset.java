package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XMacInuitCharset extends Charset {
	public XMacInuitCharset() {
		super("x-MacInuit", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XMacInuitCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XMacInuitCharsetEncoder(this);
	}

	private static final class XMacInuitCharsetDecoder extends TableCharsetDecoder {
		private XMacInuitCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_80 = getOutput0_80();
		private static final char[] getOutput0_80() {
			return "\u1403\u1404\u1405\u1406\u140A\u140B\u1431\u1432\u1433\u1434\u1438\u1439\u1449\u144E\u144F\u1450\u1451\u1455\u1456\u1466\u146D\u146E\u146F\u1470\u1472\u1473\u1483\u148B\u148C\u148D\u148E\u1490\u1491\u00B0\u14A1\u14A5\u14A6\u2022\u00B6\u14A7\u00AE\u00A9\u2122\u14A8\u14AA\u14AB\u14BB\u14C2\u14C3\u14C4\u14C5\u14C7\u14C8\u14D0\u14EF\u14F0\u14F1\u14F2\u14F4\u14F5\u1505\u14D5\u14D6\u14D7\u14D8\u14DA\u14DB\u14EA\u1528\u1529\u152A\u152B\u152D\u2026\u00A0\u152E\u153E\u1555\u1556\u1557\u2013\u2014\u201C\u201D\u2018\u2019\u1558\u1559\u155A\u155D\u1546\u1547\u1548\u1549\u154B\u154C\u1550\u157F\u1580\u1581\u1582\u1583\u1584\u1585\u158F\u1590\u1591\u1592\u1593\u1594\u1595\u1671\u1672\u1673\u1674\u1675\u1676\u1596\u15A0\u15A1\u15A2\u15A3\u15A4\u15A5\u15A6\u157C\u0141\u0142".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x80 && input <= 0xFF) return GETOUTPUT0_80[input - 0x80];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}

	private static final class XMacInuitCharsetEncoder extends TableCharsetEncoder {
		private XMacInuitCharsetEncoder(Charset cs) {
			super(cs, 1f, 1f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_1431 = getOutput0_1431();
		private static final char[] getOutput0_1431() {
			return "\u0086\u0087\u0088\u0089\u0000\u0000\u0000\u008A\u008B\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u008C\u0000\u0000\u0000\u0000\u008D\u008E\u008F\u0090\u0000\u0000\u0000\u0091\u0092\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0093\u0000\u0000\u0000\u0000\u0000\u0000\u0094\u0095\u0096\u0097\u0000\u0098\u0099\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u009B\u009C\u009D\u009E\u0000\u009F\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00A2\u0000\u0000\u0000\u00A3\u00A4\u00A7\u00AB\u0000\u00AC\u00AD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00AE\u0000\u0000\u0000\u0000\u0000\u0000\u00AF\u00B0\u00B1\u00B2\u0000\u00B3\u00B4\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00B5\u0000\u0000\u0000\u0000\u00BD\u00BE\u00BF\u00C0\u0000\u00C1\u00C2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00C3\u0000\u0000\u0000\u0000\u00B6\u00B7\u00B8\u00B9\u0000\u00BA\u00BB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00BC".toCharArray();
		}
		private static final char[] GETOUTPUT0_1528 = getOutput0_1528();
		private static final char[] getOutput0_1528() {
			return "\u00C4\u00C5\u00C6\u00C7\u0000\u00C8\u00CB\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00CC\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00DA\u00DB\u00DC\u00DD\u0000\u00DE\u00DF\u0000\u0000\u0000\u00E0\u0000\u0000\u0000\u0000\u00CD\u00CE\u00CF\u00D6\u00D7\u00D8\u0000\u0000\u00D9".toCharArray();
		}
		private static final char[] GETOUTPUT0_157C = getOutput0_157C();
		private static final char[] getOutput0_157C() {
			return "\u00FD\u0000\u0000\u00E1\u00E2\u00E3\u00E4\u00E5\u00E6\u00E7\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00E8\u00E9\u00EA\u00EB\u00EC\u00ED\u00EE\u00F5\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00F6\u00F7\u00F8\u00F9\u00FA\u00FB\u00FC".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0x1431 && input <= 0x1505) return GETOUTPUT0_1431[input - 0x1431];
			if (input >= 0x1528 && input <= 0x155D) return GETOUTPUT0_1528[input - 0x1528];
			if (input >= 0x157C && input <= 0x15A6) return GETOUTPUT0_157C[input - 0x157C];
			switch (input) {
			case 0xA0: return 0xCAL;
			case 0xA9: return 0xA9L;
			case 0xAE: return 0xA8L;
			case 0xB0: return 0xA1L;
			case 0xB6: return 0xA6L;
			case 0x141: return 0xFEL;
			case 0x142: return 0xFF01L;
			case 0x1403: return 0x80L;
			case 0x1404: return 0x81L;
			case 0x1405: return 0x82L;
			case 0x1406: return 0x83L;
			case 0x140A: return 0x84L;
			case 0x140B: return 0x85L;
			case 0x1671: return 0xEFL;
			case 0x1672: return 0xF0L;
			case 0x1673: return 0xF1L;
			case 0x1674: return 0xF2L;
			case 0x1675: return 0xF3L;
			case 0x1676: return 0xF4L;
			case 0x2013: return 0xD0L;
			case 0x2014: return 0xD1L;
			case 0x2018: return 0xD4L;
			case 0x2019: return 0xD5L;
			case 0x201C: return 0xD2L;
			case 0x201D: return 0xD3L;
			case 0x2022: return 0xA5L;
			case 0x2026: return 0xC9L;
			case 0x2122: return 0xAAL;
			}
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			default: return 0;
			}
		}
	}
}
