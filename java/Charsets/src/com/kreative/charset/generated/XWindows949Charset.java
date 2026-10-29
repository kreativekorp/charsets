package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XWindows949Charset extends Charset {
	public XWindows949Charset() {
		super("x-windows-949", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XWindows949CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XWindows949CharsetEncoder(this);
	}

	private static final class XWindows949CharsetDecoder extends TableCharsetDecoder {
		private XWindows949CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0x81 && input <= 0xC8) return input - 0x81 + 0x1;
			if (input >= 0xCA && input <= 0xFD) return input - 0xCA + 0x49;
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.DECODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0x86 && input <= 0x98) return input - 0x86 + 0xAC5D;
			if (input >= 0x41 && input <= 0x85) return CommonSubtables.COMMON1572[input - 0x41];
			if (input >= 0x99 && input <= 0xFE) return CommonSubtables.COMMON1573[input - 0x99];
			return 0;
		}
		private long getOutput2(int input) {
			if (input >= 0xB7 && input <= 0xC8) return input - 0xB7 + 0xADA5;
			if (input >= 0x41 && input <= 0xB6) return CommonSubtables.COMMON1574[input - 0x41];
			if (input >= 0xEC && input <= 0xFE) return input - 0xEC + 0xADE5;
			if (input >= 0xC9 && input <= 0xEB) return CommonSubtables.COMMON1575[input - 0xC9];
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0x61 && input <= 0x73) return input - 0x61 + 0xAE1D;
			if (input >= 0x41 && input <= 0x5A) return CommonSubtables.COMMON1576[input - 0x41];
			if (input >= 0xB3 && input <= 0xE1) return input - 0xB3 + 0xAE8D;
			if (input >= 0x74 && input <= 0xB2) return CommonSubtables.COMMON1577[input - 0x74];
			if (input >= 0xE2 && input <= 0xFE) return CommonSubtables.COMMON1578[input - 0xE2];
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0x68 && input <= 0x7A) return input - 0x68 + 0xAF11;
			if (input >= 0x41 && input <= 0x67) return CommonSubtables.COMMON1579[input - 0x41];
			if (input >= 0xB1 && input <= 0xC3) return input - 0xB1 + 0xAF66;
			if (input >= 0x81 && input <= 0xB0) return CommonSubtables.COMMON1580[input - 0x81];
			if (input >= 0xE0 && input <= 0xFA) return input - 0xE0 + 0xAF9D;
			if (input >= 0xC4 && input <= 0xDF) return CommonSubtables.COMMON1581[input - 0xC4];
			switch (input) {
			case 0xFB: return 0xAFBAL;
			case 0xFC: return 0xAFBBL;
			case 0xFD: return 0xAFBDL;
			case 0xFE: return 0xAFBEL;
			}
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0x9F && input <= 0xB9) return input - 0x9F + 0xB029;
			if (input >= 0x41 && input <= 0x9E) return CommonSubtables.COMMON1582[input - 0x41];
			if (input >= 0xC8 && input <= 0xE5) return input - 0xC8 + 0xB05E;
			if (input >= 0xE6 && input <= 0xFE) return CommonSubtables.COMMON1583[input - 0xE6];
			switch (input) {
			case 0xBA: return 0xB046L;
			case 0xBB: return 0xB047L;
			case 0xBC: return 0xB049L;
			case 0xBD: return 0xB04BL;
			case 0xBE: return 0xB04DL;
			case 0xBF: return 0xB04FL;
			case 0xC0: return 0xB050L;
			case 0xC1: return 0xB051L;
			case 0xC2: return 0xB052L;
			case 0xC3: return 0xB056L;
			case 0xC4: return 0xB058L;
			case 0xC5: return 0xB05AL;
			case 0xC6: return 0xB05BL;
			case 0xC7: return 0xB05CL;
			}
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0x81 && input <= 0x97) return input - 0x81 + 0xB0F1;
			if (input >= 0x41 && input <= 0x7A) return CommonSubtables.COMMON1584[input - 0x41];
			if (input >= 0xD0 && input <= 0xE6) return input - 0xD0 + 0xB161;
			if (input >= 0x98 && input <= 0xCF) return CommonSubtables.COMMON1585[input - 0x98];
			if (input >= 0xE7 && input <= 0xFE) return CommonSubtables.COMMON1586[input - 0xE7];
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0x4B && input <= 0x5A) return input - 0x4B + 0xB1A9;
			if (input >= 0x61 && input <= 0x73) return input - 0x61 + 0xB1B9;
			if (input >= 0xB8 && input <= 0xCA) return input - 0xB8 + 0xB221;
			if (input >= 0x74 && input <= 0xB7) return CommonSubtables.COMMON1587[input - 0x74];
			if (input >= 0xD2 && input <= 0xEC) return input - 0xD2 + 0xB23D;
			if (input >= 0xED && input <= 0xFE) return CommonSubtables.COMMON1588[input - 0xED];
			switch (input) {
			case 0x41: return 0xB19EL;
			case 0x42: return 0xB19FL;
			case 0x43: return 0xB1A0L;
			case 0x44: return 0xB1A1L;
			case 0x45: return 0xB1A2L;
			case 0x46: return 0xB1A3L;
			case 0x47: return 0xB1A4L;
			case 0x48: return 0xB1A5L;
			case 0x49: return 0xB1A6L;
			case 0x4A: return 0xB1A7L;
			case 0xCB: return 0xB235L;
			case 0xCC: return 0xB236L;
			case 0xCD: return 0xB237L;
			case 0xCE: return 0xB238L;
			case 0xCF: return 0xB239L;
			case 0xD0: return 0xB23AL;
			case 0xD1: return 0xB23BL;
			}
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0x81 && input <= 0x90) return input - 0x81 + 0xB2B8;
			if (input >= 0x41 && input <= 0x7A) return CommonSubtables.COMMON1589[input - 0x41];
			if (input >= 0xC0 && input <= 0xF6) return input - 0xC0 + 0xB31D;
			if (input >= 0x91 && input <= 0xBF) return CommonSubtables.COMMON1590[input - 0x91];
			switch (input) {
			case 0xF7: return 0xB357L;
			case 0xF8: return 0xB359L;
			case 0xF9: return 0xB35AL;
			case 0xFA: return 0xB35DL;
			case 0xFB: return 0xB360L;
			case 0xFC: return 0xB361L;
			case 0xFD: return 0xB362L;
			case 0xFE: return 0xB363L;
			}
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0x81 && input <= 0x96) return input - 0x81 + 0xB3AE;
			if (input >= 0x41 && input <= 0x7A) return CommonSubtables.COMMON1591[input - 0x41];
			if (input >= 0xAC && input <= 0xBE) return input - 0xAC + 0xB3E9;
			if (input >= 0x97 && input <= 0xAB) return CommonSubtables.COMMON1592[input - 0x97];
			if (input >= 0xBF && input <= 0xD1) return input - 0xBF + 0xB3FD;
			if (input >= 0xEF && input <= 0xFE) return input - 0xEF + 0xB435;
			if (input >= 0xD2 && input <= 0xEE) return CommonSubtables.COMMON1593[input - 0xD2];
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0x66 && input <= 0x78) return input - 0x66 + 0xB46D;
			if (input >= 0x41 && input <= 0x65) return CommonSubtables.COMMON1594[input - 0x41];
			if (input >= 0x86 && input <= 0x99) return input - 0x86 + 0xB489;
			if (input >= 0xDF && input <= 0xF9) return input - 0xDF + 0xB4F9;
			if (input >= 0x9A && input <= 0xDE) return CommonSubtables.COMMON1595[input - 0x9A];
			switch (input) {
			case 0x79: return 0xB481L;
			case 0x7A: return 0xB482L;
			case 0x81: return 0xB483L;
			case 0x82: return 0xB484L;
			case 0x83: return 0xB485L;
			case 0x84: return 0xB486L;
			case 0x85: return 0xB487L;
			case 0xFA: return 0xB516L;
			case 0xFB: return 0xB517L;
			case 0xFC: return 0xB519L;
			case 0xFD: return 0xB51AL;
			case 0xFE: return 0xB51DL;
			}
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0x81 && input <= 0xB5) return input - 0x81 + 0xB56B;
			if (input >= 0x41 && input <= 0x7A) return CommonSubtables.COMMON1596[input - 0x41];
			if (input >= 0xD9 && input <= 0xEB) return input - 0xD9 + 0xB5D9;
			if (input >= 0xB6 && input <= 0xD8) return CommonSubtables.COMMON1597[input - 0xB6];
			if (input >= 0xEC && input <= 0xFE) return input - 0xEC + 0xB5ED;
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0x41 && input <= 0x50) return input - 0x41 + 0xB600;
			if (input >= 0x8E && input <= 0xA8) return input - 0x8E + 0xB649;
			if (input >= 0x51 && input <= 0x8D) return CommonSubtables.COMMON1598[input - 0x51];
			if (input >= 0xAC && input <= 0xDE) return input - 0xAC + 0xB669;
			if (input >= 0xEE && input <= 0xFE) return input - 0xEE + 0xB6B2;
			switch (input) {
			case 0xA9: return 0xB665L;
			case 0xAA: return 0xB666L;
			case 0xAB: return 0xB667L;
			case 0xDF: return 0xB69EL;
			case 0xE0: return 0xB69FL;
			case 0xE1: return 0xB6A1L;
			case 0xE2: return 0xB6A2L;
			case 0xE3: return 0xB6A3L;
			case 0xE4: return 0xB6A5L;
			case 0xE5: return 0xB6A6L;
			case 0xE6: return 0xB6A7L;
			case 0xE7: return 0xB6A8L;
			case 0xE8: return 0xB6A9L;
			case 0xE9: return 0xB6AAL;
			case 0xEA: return 0xB6ADL;
			case 0xEB: return 0xB6AEL;
			case 0xEC: return 0xB6AFL;
			case 0xED: return 0xB6B0L;
			}
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0x41 && input <= 0x51) return input - 0x41 + 0xB6C3;
			if (input >= 0x61 && input <= 0x72) return input - 0x61 + 0xB6DE;
			if (input >= 0x89 && input <= 0xAA) return input - 0x89 + 0xB706;
			if (input >= 0x73 && input <= 0x88) return CommonSubtables.COMMON1599[input - 0x73];
			if (input >= 0xAB && input <= 0xFE) return CommonSubtables.COMMON1600[input - 0xAB];
			switch (input) {
			case 0x52: return 0xB6D5L;
			case 0x53: return 0xB6D6L;
			case 0x54: return 0xB6D7L;
			case 0x55: return 0xB6D8L;
			case 0x56: return 0xB6D9L;
			case 0x57: return 0xB6DAL;
			case 0x58: return 0xB6DBL;
			case 0x59: return 0xB6DCL;
			case 0x5A: return 0xB6DDL;
			}
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0x67 && input <= 0x7A) return input - 0x67 + 0xB7CA;
			if (input >= 0x41 && input <= 0x66) return CommonSubtables.COMMON1601[input - 0x41];
			if (input >= 0x81 && input <= 0xFE) return CommonSubtables.COMMON1602[input - 0x81];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0x49 && input <= 0x5A) return input - 0x49 + 0xB88E;
			if (input >= 0xB5 && input <= 0xC7) return input - 0xB5 + 0xB905;
			if (input >= 0x61 && input <= 0xB4) return CommonSubtables.COMMON1603[input - 0x61];
			if (input >= 0xCF && input <= 0xE9) return input - 0xCF + 0xB921;
			if (input >= 0xEA && input <= 0xFE) return CommonSubtables.COMMON1604[input - 0xEA];
			switch (input) {
			case 0x41: return 0xB885L;
			case 0x42: return 0xB886L;
			case 0x43: return 0xB887L;
			case 0x44: return 0xB888L;
			case 0x45: return 0xB889L;
			case 0x46: return 0xB88AL;
			case 0x47: return 0xB88BL;
			case 0x48: return 0xB88CL;
			case 0xC8: return 0xB919L;
			case 0xC9: return 0xB91AL;
			case 0xCA: return 0xB91BL;
			case 0xCB: return 0xB91CL;
			case 0xCC: return 0xB91DL;
			case 0xCD: return 0xB91EL;
			case 0xCE: return 0xB91FL;
			}
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0x6B && input <= 0x7A) return input - 0x6B + 0xB98F;
			if (input >= 0x41 && input <= 0x6A) return CommonSubtables.COMMON1605[input - 0x41];
			if (input >= 0xD3 && input <= 0xF4) return input - 0xD3 + 0xBA16;
			if (input >= 0x81 && input <= 0xD2) return CommonSubtables.COMMON1606[input - 0x81];
			switch (input) {
			case 0xF5: return 0xBA3AL;
			case 0xF6: return 0xBA3BL;
			case 0xF7: return 0xBA3DL;
			case 0xF8: return 0xBA3EL;
			case 0xF9: return 0xBA3FL;
			case 0xFA: return 0xBA41L;
			case 0xFB: return 0xBA43L;
			case 0xFC: return 0xBA44L;
			case 0xFD: return 0xBA45L;
			case 0xFE: return 0xBA46L;
			}
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0x81 && input <= 0x95) return input - 0x81 + 0xBA93;
			if (input >= 0x41 && input <= 0x7A) return CommonSubtables.COMMON1607[input - 0x41];
			if (input >= 0xBA && input <= 0xDB) return input - 0xBA + 0xBADA;
			if (input >= 0x96 && input <= 0xB9) return CommonSubtables.COMMON1608[input - 0x96];
			if (input >= 0xDC && input <= 0xFE) return CommonSubtables.COMMON1609[input - 0xDC];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0x81 && input <= 0x96) return input - 0x81 + 0xBB72;
			if (input >= 0x41 && input <= 0x7A) return CommonSubtables.COMMON1610[input - 0x41];
			if (input >= 0x9D && input <= 0xAF) return input - 0x9D + 0xBB91;
			if (input >= 0xD6 && input <= 0xF9) return input - 0xD6 + 0xBBD4;
			if (input >= 0xB0 && input <= 0xD5) return CommonSubtables.COMMON1611[input - 0xB0];
			switch (input) {
			case 0x97: return 0xBB89L;
			case 0x98: return 0xBB8AL;
			case 0x99: return 0xBB8BL;
			case 0x9A: return 0xBB8DL;
			case 0x9B: return 0xBB8EL;
			case 0x9C: return 0xBB8FL;
			case 0xFA: return 0xBBFAL;
			case 0xFB: return 0xBBFBL;
			case 0xFC: return 0xBBFDL;
			case 0xFD: return 0xBBFEL;
			case 0xFE: return 0xBC01L;
			}
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0x84 && input <= 0xA9) return input - 0x84 + 0xBC5E;
			if (input >= 0x41 && input <= 0x83) return CommonSubtables.COMMON1612[input - 0x41];
			if (input >= 0xE3 && input <= 0xF9) return input - 0xE3 + 0xBCDD;
			if (input >= 0xAA && input <= 0xE2) return CommonSubtables.COMMON1613[input - 0xAA];
			switch (input) {
			case 0xFA: return 0xBCF7L;
			case 0xFB: return 0xBCF9L;
			case 0xFC: return 0xBCFAL;
			case 0xFD: return 0xBCFBL;
			case 0xFE: return 0xBCFDL;
			}
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0xA7 && input <= 0xBD) return input - 0xA7 + 0xBD69;
			if (input >= 0x41 && input <= 0xA6) return CommonSubtables.COMMON1614[input - 0x41];
			if (input >= 0xE6 && input <= 0xFE) return input - 0xE6 + 0xBDB9;
			if (input >= 0xBE && input <= 0xE5) return CommonSubtables.COMMON1615[input - 0xBE];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0x89 && input <= 0xAC) return input - 0x89 + 0xBE20;
			if (input >= 0x41 && input <= 0x88) return CommonSubtables.COMMON1616[input - 0x41];
			if (input >= 0xAD && input <= 0xFE) return CommonSubtables.COMMON1617[input - 0xAD];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0x41 && input <= 0x58) return input - 0x41 + 0xBEB8;
			if (input >= 0xA1 && input <= 0xC2) return input - 0xA1 + 0xBF1E;
			if (input >= 0x59 && input <= 0xA0) return CommonSubtables.COMMON1618[input - 0x59];
			if (input >= 0xD2 && input <= 0xFE) return input - 0xD2 + 0xBF56;
			switch (input) {
			case 0xC3: return 0xBF42L;
			case 0xC4: return 0xBF43L;
			case 0xC5: return 0xBF45L;
			case 0xC6: return 0xBF46L;
			case 0xC7: return 0xBF47L;
			case 0xC8: return 0xBF49L;
			case 0xC9: return 0xBF4AL;
			case 0xCA: return 0xBF4BL;
			case 0xCB: return 0xBF4CL;
			case 0xCC: return 0xBF4DL;
			case 0xCD: return 0xBF4EL;
			case 0xCE: return 0xBF4FL;
			case 0xCF: return 0xBF52L;
			case 0xD0: return 0xBF53L;
			case 0xD1: return 0xBF54L;
			}
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0x41 && input <= 0x51) return input - 0x41 + 0xBF83;
			if (input >= 0x61 && input <= 0x72) return input - 0x61 + 0xBF9E;
			if (input >= 0xA2 && input <= 0xFB) return input - 0xA2 + 0xBFE2;
			if (input >= 0x73 && input <= 0xA1) return CommonSubtables.COMMON1619[input - 0x73];
			switch (input) {
			case 0x52: return 0xBF95L;
			case 0x53: return 0xBF96L;
			case 0x54: return 0xBF97L;
			case 0x55: return 0xBF98L;
			case 0x56: return 0xBF99L;
			case 0x57: return 0xBF9AL;
			case 0x58: return 0xBF9BL;
			case 0x59: return 0xBF9CL;
			case 0x5A: return 0xBF9DL;
			case 0xFC: return 0xC03DL;
			case 0xFD: return 0xC03EL;
			case 0xFE: return 0xC03FL;
			}
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0x41 && input <= 0x51) return input - 0x41 + 0xC040;
			if (input >= 0x6B && input <= 0x7A) return input - 0x6B + 0xC06A;
			if (input >= 0x52 && input <= 0x6A) return CommonSubtables.COMMON1620[input - 0x52];
			if (input >= 0x81 && input <= 0x96) return input - 0x81 + 0xC07A;
			if (input >= 0x97 && input <= 0xFE) return CommonSubtables.COMMON1621[input - 0x97];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1622[input - 0x41];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0x4A && input <= 0x5A) return input - 0x4A + 0xC235;
			if (input >= 0xBD && input <= 0xDE) return input - 0xBD + 0xC2BA;
			if (input >= 0x61 && input <= 0xBC) return CommonSubtables.COMMON1623[input - 0x61];
			if (input >= 0xDF && input <= 0xFE) return CommonSubtables.COMMON1624[input - 0xDF];
			switch (input) {
			case 0x41: return 0xC224L;
			case 0x42: return 0xC225L;
			case 0x43: return 0xC226L;
			case 0x44: return 0xC227L;
			case 0x45: return 0xC22AL;
			case 0x46: return 0xC22CL;
			case 0x47: return 0xC22EL;
			case 0x48: return 0xC230L;
			case 0x49: return 0xC233L;
			}
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0x61 && input <= 0x72) return input - 0x61 + 0xC333;
			if (input >= 0x41 && input <= 0x5A) return CommonSubtables.COMMON1625[input - 0x41];
			if (input >= 0x81 && input <= 0x9A) return input - 0x81 + 0xC34E;
			if (input >= 0xB4 && input <= 0xE6) return input - 0xB4 + 0xC38D;
			if (input >= 0x9B && input <= 0xB3) return CommonSubtables.COMMON1626[input - 0x9B];
			if (input >= 0xE7 && input <= 0xFD) return input - 0xE7 + 0xC3C1;
			switch (input) {
			case 0x73: return 0xC346L;
			case 0x74: return 0xC347L;
			case 0x75: return 0xC348L;
			case 0x76: return 0xC349L;
			case 0x77: return 0xC34AL;
			case 0x78: return 0xC34BL;
			case 0x79: return 0xC34CL;
			case 0x7A: return 0xC34DL;
			case 0xFE: return 0xC3DAL;
			}
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0xA8 && input <= 0xC2) return input - 0xA8 + 0xC449;
			if (input >= 0x41 && input <= 0xA7) return CommonSubtables.COMMON1627[input - 0x41];
			if (input >= 0xD8 && input <= 0xEA) return input - 0xD8 + 0xC481;
			if (input >= 0xC3 && input <= 0xD7) return CommonSubtables.COMMON1628[input - 0xC3];
			if (input >= 0xEB && input <= 0xFE) return CommonSubtables.COMMON1629[input - 0xEB];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0xC4C6;
			if (input >= 0x41 && input <= 0x5A) return CommonSubtables.COMMON1630[input - 0x41];
			if (input >= 0x81 && input <= 0xFE) return CommonSubtables.COMMON1631[input - 0x81];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1632[input - 0x41];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1633[input - 0x41];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0xC1 && input <= 0xDB) return input - 0xC1 + 0xC855;
			if (input >= 0x41 && input <= 0xC0) return CommonSubtables.COMMON1634[input - 0x41];
			if (input >= 0xDC && input <= 0xFE) return CommonSubtables.COMMON1635[input - 0xDC];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0x44 && input <= 0x56) return input - 0x44 + 0xC8A9;
			if (input >= 0x57 && input <= 0xFE) return CommonSubtables.COMMON1636[input - 0x57];
			switch (input) {
			case 0x41: return 0xC8A5L;
			case 0x42: return 0xC8A6L;
			case 0x43: return 0xC8A7L;
			}
			return 0;
		}
		private static final char[] GETOUTPUT34_81 = getOutput34_81();
		private static final char[] getOutput34_81() {
			return "\uC948\uC949\uC94A\uC94B\uC94C\uC94D\uC94E\uC94F\uC952\uC953\uC955\uC956\uC957\uC959\uC95A\uC95B\uC95C\uC95D\uC95E\uC95F\uC962\uC964\uC965\uC966\uC967\uC968\uC969\uC96A\uC96B\uC96D\uC96E\uC96F\u21D2\u21D4\u2200\u2203\u00B4\uFF5E\u02C7\u02D8\u02DD\u02DA\u02D9\u00B8\u02DB\u00A1\u00BF\u02D0\u222E\u2211\u220F\u00A4\u2109\u2030\u25C1\u25C0\u25B7\u25B6\u2664\u2660\u2661\u2665\u2667\u2663\u2299\u25C8\u25A3\u25D0\u25D1\u2592\u25A4\u25A5\u25A8\u25A7\u25A6\u25A9\u2668\u260F\u260E\u261C\u261E\u00B6\u2020\u2021\u2195\u2197\u2199\u2196\u2198\u266D\u2669\u266A\u266C\u327F\u321C\u2116\u33C7\u2122\u33C2\u33D8\u2121\u20AC\u00AE".toCharArray();
		}
		private long getOutput34(int input) {
			if (input >= 0x48 && input <= 0x5A) return input - 0x48 + 0xC919;
			if (input >= 0x68 && input <= 0x7A) return input - 0x68 + 0xC935;
			if (input >= 0x81 && input <= 0xE7) return GETOUTPUT34_81[input - 0x81];
			switch (input) {
			case 0x41: return 0xC910L;
			case 0x42: return 0xC912L;
			case 0x43: return 0xC913L;
			case 0x44: return 0xC914L;
			case 0x45: return 0xC915L;
			case 0x46: return 0xC916L;
			case 0x47: return 0xC917L;
			case 0x61: return 0xC92DL;
			case 0x62: return 0xC92EL;
			case 0x63: return 0xC92FL;
			case 0x64: return 0xC930L;
			case 0x65: return 0xC931L;
			case 0x66: return 0xC932L;
			case 0x67: return 0xC933L;
			}
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0x6A && input <= 0x7A) return input - 0x6A + 0xC99E;
			if (input >= 0x41 && input <= 0x69) return CommonSubtables.COMMON1637[input - 0x41];
			if (input >= 0x81 && input <= 0x91) return input - 0x81 + 0xC9AF;
			if (input >= 0xA1 && input <= 0xDB) return input - 0xA1 + 0xFF01;
			if (input >= 0xDD && input <= 0xFD) return input - 0xDD + 0xFF3D;
			switch (input) {
			case 0x92: return 0xC9C2L;
			case 0x93: return 0xC9C3L;
			case 0x94: return 0xC9C5L;
			case 0x95: return 0xC9C6L;
			case 0x96: return 0xC9C9L;
			case 0x97: return 0xC9CBL;
			case 0x98: return 0xC9CCL;
			case 0x99: return 0xC9CDL;
			case 0x9A: return 0xC9CEL;
			case 0x9B: return 0xC9CFL;
			case 0x9C: return 0xC9D2L;
			case 0x9D: return 0xC9D4L;
			case 0x9E: return 0xC9D7L;
			case 0x9F: return 0xC9D8L;
			case 0xA0: return 0xC9DBL;
			case 0xDC: return 0xFFE6L;
			case 0xFE: return 0xFFE3L;
			}
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0x84 && input <= 0xA0) return input - 0x84 + 0xCA2A;
			if (input >= 0x41 && input <= 0x83) return CommonSubtables.COMMON1638[input - 0x41];
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0x3131;
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0x61 && input <= 0x72) return input - 0x61 + 0xCA6B;
			if (input >= 0x41 && input <= 0x5A) return CommonSubtables.COMMON1639[input - 0x41];
			if (input >= 0x81 && input <= 0x91) return input - 0x81 + 0xCA87;
			if (input >= 0xC1 && input <= 0xD1) return input - 0xC1 + 0x391;
			if (input >= 0x92 && input <= 0xB9) return CommonSubtables.COMMON1640[input - 0x92];
			if (input >= 0xE1 && input <= 0xF1) return input - 0xE1 + 0x3B1;
			switch (input) {
			case 0x73: return 0xCA7EL;
			case 0x74: return 0xCA7FL;
			case 0x75: return 0xCA80L;
			case 0x76: return 0xCA81L;
			case 0x77: return 0xCA82L;
			case 0x78: return 0xCA83L;
			case 0x79: return 0xCA85L;
			case 0x7A: return 0xCA86L;
			case 0xD2: return 0x3A3L;
			case 0xD3: return 0x3A4L;
			case 0xD4: return 0x3A5L;
			case 0xD5: return 0x3A6L;
			case 0xD6: return 0x3A7L;
			case 0xD7: return 0x3A8L;
			case 0xD8: return 0x3A9L;
			case 0xF2: return 0x3C3L;
			case 0xF3: return 0x3C4L;
			case 0xF4: return 0x3C5L;
			case 0xF5: return 0x3C6L;
			case 0xF6: return 0x3C7L;
			case 0xF7: return 0x3C8L;
			case 0xF8: return 0x3C9L;
			}
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0x41 && input <= 0x54) return input - 0x41 + 0xCAA8;
			if (input >= 0x8C && input <= 0x9E) return input - 0x8C + 0xCAF5;
			if (input >= 0x55 && input <= 0x8B) return CommonSubtables.COMMON1641[input - 0x55];
			if (input >= 0x9F && input <= 0xE4) return CommonSubtables.COMMON1642[input - 0x9F];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0x61 && input <= 0x77) return input - 0x61 + 0xCB2A;
			if (input >= 0x41 && input <= 0x5A) return CommonSubtables.COMMON1643[input - 0x41];
			if (input >= 0x78 && input <= 0xEF) return CommonSubtables.COMMON1644[input - 0x78];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0x61 && input <= 0x73) return input - 0x61 + 0xCB89;
			if (input >= 0x41 && input <= 0x5A) return CommonSubtables.COMMON1645[input - 0x41];
			if (input >= 0x81 && input <= 0x94) return input - 0x81 + 0xCBA4;
			if (input >= 0xB1 && input <= 0xCC) return input - 0xB1 + 0x3260;
			if (input >= 0x95 && input <= 0xAF) return CommonSubtables.COMMON1646[input - 0x95];
			if (input >= 0xCD && input <= 0xE6) return input - 0xCD + 0x24D0;
			if (input >= 0xE7 && input <= 0xFE) return CommonSubtables.COMMON453[input - 0xE7];
			switch (input) {
			case 0x74: return 0xCB9DL;
			case 0x75: return 0xCB9EL;
			case 0x76: return 0xCB9FL;
			case 0x77: return 0xCBA0L;
			case 0x78: return 0xCBA1L;
			case 0x79: return 0xCBA2L;
			case 0x7A: return 0xCBA3L;
			}
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0x68 && input <= 0x7A) return input - 0x68 + 0xCBEA;
			if (input >= 0x41 && input <= 0x67) return CommonSubtables.COMMON1647[input - 0x41];
			if (input >= 0xB1 && input <= 0xCC) return input - 0xB1 + 0x3200;
			if (input >= 0x81 && input <= 0xB0) return CommonSubtables.COMMON1648[input - 0x81];
			if (input >= 0xCD && input <= 0xE6) return input - 0xCD + 0x249C;
			if (input >= 0xE7 && input <= 0xFE) return CommonSubtables.COMMON278[input - 0xE7];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0x83 && input <= 0xA0) return input - 0x83 + 0xCC76;
			if (input >= 0x41 && input <= 0x82) return CommonSubtables.COMMON1649[input - 0x41];
			if (input >= 0xA1 && input <= 0xF3) return input - 0xA1 + 0x3041;
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0xA1 && input <= 0xF6) return input - 0xA1 + 0x30A1;
			if (input >= 0x41 && input <= 0xA0) return CommonSubtables.COMMON1650[input - 0x41];
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0x81 && input <= 0x9D) return input - 0x81 + 0xCD3F;
			if (input >= 0x41 && input <= 0x7A) return CommonSubtables.COMMON1651[input - 0x41];
			if (input >= 0xA8 && input <= 0xC1) return input - 0xA8 + 0x416;
			if (input >= 0xD8 && input <= 0xF1) return input - 0xD8 + 0x436;
			switch (input) {
			case 0x9E: return 0xCD5DL;
			case 0x9F: return 0xCD5EL;
			case 0xA0: return 0xCD5FL;
			case 0xA1: return 0x410L;
			case 0xA2: return 0x411L;
			case 0xA3: return 0x412L;
			case 0xA4: return 0x413L;
			case 0xA5: return 0x414L;
			case 0xA6: return 0x415L;
			case 0xA7: return 0x401L;
			case 0xD1: return 0x430L;
			case 0xD2: return 0x431L;
			case 0xD3: return 0x432L;
			case 0xD4: return 0x433L;
			case 0xD5: return 0x434L;
			case 0xD6: return 0x435L;
			case 0xD7: return 0x451L;
			}
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0x8D && input <= 0x9F) return input - 0x8D + 0xCDB1;
			if (input >= 0x41 && input <= 0x8C) return CommonSubtables.COMMON1652[input - 0x41];
			switch (input) {
			case 0xA0: return 0xCDC5L;
			}
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0x4A && input <= 0x5A) return input - 0x4A + 0xCDD1;
			if (input >= 0x61 && input <= 0xA0) return CommonSubtables.COMMON1653[input - 0x61];
			switch (input) {
			case 0x41: return 0xCDC6L;
			case 0x42: return 0xCDC7L;
			case 0x43: return 0xCDC8L;
			case 0x44: return 0xCDC9L;
			case 0x45: return 0xCDCAL;
			case 0x46: return 0xCDCBL;
			case 0x47: return 0xCDCDL;
			case 0x48: return 0xCDCEL;
			case 0x49: return 0xCDCFL;
			}
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0x47 && input <= 0x5A) return input - 0x47 + 0xCE36;
			if (input >= 0x61 && input <= 0xA0) return CommonSubtables.COMMON1654[input - 0x61];
			switch (input) {
			case 0x41: return 0xCE2CL;
			case 0x42: return 0xCE2DL;
			case 0x43: return 0xCE2EL;
			case 0x44: return 0xCE2FL;
			case 0x45: return 0xCE32L;
			case 0x46: return 0xCE34L;
			}
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0x67 && input <= 0x7A) return input - 0x67 + 0xCEC2;
			if (input >= 0x41 && input <= 0x66) return CommonSubtables.COMMON1655[input - 0x41];
			if (input >= 0x81 && input <= 0xFE) return CommonSubtables.COMMON1656[input - 0x81];
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1657[input - 0x41];
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0x61 && input <= 0x73) return input - 0x61 + 0xCF8E;
			if (input >= 0x41 && input <= 0x5A) return CommonSubtables.COMMON1658[input - 0x41];
			if (input >= 0x87 && input <= 0x99) return input - 0x87 + 0xCFB1;
			if (input >= 0x9A && input <= 0xFE) return CommonSubtables.COMMON1659[input - 0x9A];
			switch (input) {
			case 0x74: return 0xCFA2L;
			case 0x75: return 0xCFA3L;
			case 0x76: return 0xCFA4L;
			case 0x77: return 0xCFA5L;
			case 0x78: return 0xCFA6L;
			case 0x79: return 0xCFA7L;
			case 0x7A: return 0xCFA9L;
			case 0x81: return 0xCFAAL;
			case 0x82: return 0xCFABL;
			case 0x83: return 0xCFACL;
			case 0x84: return 0xCFADL;
			case 0x85: return 0xCFAEL;
			case 0x86: return 0xCFAFL;
			}
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0x41 && input <= 0x54) return input - 0x41 + 0xCFCC;
			if (input >= 0x8D && input <= 0xA0) return input - 0x8D + 0xD019;
			if (input >= 0x55 && input <= 0x8C) return CommonSubtables.COMMON1660[input - 0x55];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON458[input - 0xA1];
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0x8E && input <= 0xA0) return input - 0x8E + 0xD082;
			if (input >= 0x41 && input <= 0x8D) return CommonSubtables.COMMON1661[input - 0x41];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON459[input - 0xA1];
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1662[input - 0x41];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0x49 && input <= 0x5A) return input - 0x49 + 0xD10E;
			if (input >= 0x61 && input <= 0x70) return input - 0x61 + 0xD120;
			if (input >= 0x71 && input <= 0xFE) return CommonSubtables.COMMON1663[input - 0x71];
			switch (input) {
			case 0x41: return 0xD105L;
			case 0x42: return 0xD106L;
			case 0x43: return 0xD107L;
			case 0x44: return 0xD108L;
			case 0x45: return 0xD109L;
			case 0x46: return 0xD10AL;
			case 0x47: return 0xD10BL;
			case 0x48: return 0xD10CL;
			}
			return 0;
		}
		private long getOutput55(int input) {
			if (input >= 0x61 && input <= 0x75) return input - 0x61 + 0xD18B;
			if (input >= 0x41 && input <= 0x5A) return CommonSubtables.COMMON1664[input - 0x41];
			if (input >= 0x76 && input <= 0xFE) return CommonSubtables.COMMON1665[input - 0x76];
			return 0;
		}
		private long getOutput56(int input) {
			if (input >= 0x49 && input <= 0x5A) return input - 0x49 + 0xD1D9;
			if (input >= 0x88 && input <= 0xA0) return input - 0x88 + 0xD211;
			if (input >= 0x61 && input <= 0x87) return CommonSubtables.COMMON1666[input - 0x61];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON463[input - 0xA1];
			switch (input) {
			case 0x41: return 0xD1D0L;
			case 0x42: return 0xD1D1L;
			case 0x43: return 0xD1D2L;
			case 0x44: return 0xD1D3L;
			case 0x45: return 0xD1D4L;
			case 0x46: return 0xD1D5L;
			case 0x47: return 0xD1D6L;
			case 0x48: return 0xD1D7L;
			}
			return 0;
		}
		private long getOutput57(int input) {
			if (input >= 0x81 && input <= 0x97) return input - 0x81 + 0xD269;
			if (input >= 0x41 && input <= 0x7A) return CommonSubtables.COMMON1667[input - 0x41];
			if (input >= 0x98 && input <= 0xFE) return CommonSubtables.COMMON1668[input - 0x98];
			return 0;
		}
		private long getOutput58(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1669[input - 0x41];
			return 0;
		}
		private long getOutput59(int input) {
			if (input >= 0x81 && input <= 0xA0) return input - 0x81 + 0xD34A;
			if (input >= 0x41 && input <= 0x7A) return CommonSubtables.COMMON1670[input - 0x41];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON466[input - 0xA1];
			return 0;
		}
		private long getOutput60(int input) {
			if (input >= 0x41 && input <= 0x52) return input - 0x41 + 0xD36A;
			if (input >= 0x53 && input <= 0xFE) return CommonSubtables.COMMON1671[input - 0x53];
			return 0;
		}
		private long getOutput61(int input) {
			if (input >= 0x87 && input <= 0xA0) return input - 0x87 + 0xD41E;
			if (input >= 0x41 && input <= 0x86) return CommonSubtables.COMMON1672[input - 0x41];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON468[input - 0xA1];
			return 0;
		}
		private long getOutput62(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1673[input - 0x41];
			return 0;
		}
		private long getOutput63(int input) {
			if (input >= 0x61 && input <= 0x73) return input - 0x61 + 0xD4B9;
			if (input >= 0x41 && input <= 0x5A) return CommonSubtables.COMMON1674[input - 0x41];
			if (input >= 0x74 && input <= 0xFE) return CommonSubtables.COMMON1675[input - 0x74];
			return 0;
		}
		private long getOutput64(int input) {
			if (input >= 0x61 && input <= 0x7A) return input - 0x61 + 0xD51E;
			if (input >= 0x41 && input <= 0x5A) return CommonSubtables.COMMON1676[input - 0x41];
			if (input >= 0x81 && input <= 0xFE) return CommonSubtables.COMMON1677[input - 0x81];
			return 0;
		}
		private long getOutput65(int input) {
			if (input >= 0x65 && input <= 0x78) return input - 0x65 + 0xD591;
			if (input >= 0x41 && input <= 0x64) return CommonSubtables.COMMON1678[input - 0x41];
			if (input >= 0x81 && input <= 0xA0) return input - 0x81 + 0xD5A8;
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON472[input - 0xA1];
			switch (input) {
			case 0x79: return 0xD5A6L;
			case 0x7A: return 0xD5A7L;
			}
			return 0;
		}
		private long getOutput66(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1679[input - 0x41];
			return 0;
		}
		private long getOutput67(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1680[input - 0x41];
			return 0;
		}
		private long getOutput68(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1681[input - 0x41];
			return 0;
		}
		private long getOutput69(int input) {
			if (input >= 0x41 && input <= 0xFE) return CommonSubtables.COMMON1682[input - 0x41];
			return 0;
		}
		private long getOutput70(int input) {
			if (input >= 0x41 && input <= 0x52) return CommonSubtables.COMMON1683[input - 0x41];
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON477[input - 0xA1];
			return 0;
		}
		private long getOutput71(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON478[input - 0xA1];
			return 0;
		}
		private long getOutput72(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON479[input - 0xA1];
			return 0;
		}
		private long getOutput73(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON480[input - 0xA1];
			return 0;
		}
		private long getOutput74(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON481[input - 0xA1];
			return 0;
		}
		private long getOutput75(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON482[input - 0xA1];
			return 0;
		}
		private long getOutput76(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON483[input - 0xA1];
			return 0;
		}
		private long getOutput77(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON484[input - 0xA1];
			return 0;
		}
		private long getOutput78(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON485[input - 0xA1];
			return 0;
		}
		private long getOutput79(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON486[input - 0xA1];
			return 0;
		}
		private long getOutput80(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON487[input - 0xA1];
			return 0;
		}
		private long getOutput81(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON488[input - 0xA1];
			return 0;
		}
		private long getOutput82(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON489[input - 0xA1];
			return 0;
		}
		private long getOutput83(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON490[input - 0xA1];
			return 0;
		}
		private long getOutput84(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON491[input - 0xA1];
			return 0;
		}
		private long getOutput85(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON492[input - 0xA1];
			return 0;
		}
		private long getOutput86(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON493[input - 0xA1];
			return 0;
		}
		private long getOutput87(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON494[input - 0xA1];
			return 0;
		}
		private long getOutput88(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON495[input - 0xA1];
			return 0;
		}
		private long getOutput89(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON496[input - 0xA1];
			return 0;
		}
		private long getOutput90(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON497[input - 0xA1];
			return 0;
		}
		private long getOutput91(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON498[input - 0xA1];
			return 0;
		}
		private long getOutput92(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON499[input - 0xA1];
			return 0;
		}
		private long getOutput93(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON500[input - 0xA1];
			return 0;
		}
		private long getOutput94(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON501[input - 0xA1];
			return 0;
		}
		private long getOutput95(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON502[input - 0xA1];
			return 0;
		}
		private long getOutput96(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON503[input - 0xA1];
			return 0;
		}
		private long getOutput97(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON504[input - 0xA1];
			return 0;
		}
		private long getOutput98(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON505[input - 0xA1];
			return 0;
		}
		private long getOutput99(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON506[input - 0xA1];
			return 0;
		}
		private long getOutput100(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON507[input - 0xA1];
			return 0;
		}
		private long getOutput101(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON508[input - 0xA1];
			return 0;
		}
		private long getOutput102(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON509[input - 0xA1];
			return 0;
		}
		private long getOutput103(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON510[input - 0xA1];
			return 0;
		}
		private long getOutput104(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON511[input - 0xA1];
			return 0;
		}
		private long getOutput105(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON512[input - 0xA1];
			return 0;
		}
		private long getOutput106(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON513[input - 0xA1];
			return 0;
		}
		private long getOutput107(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON514[input - 0xA1];
			return 0;
		}
		private long getOutput108(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON515[input - 0xA1];
			return 0;
		}
		private long getOutput109(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON516[input - 0xA1];
			return 0;
		}
		private long getOutput110(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON517[input - 0xA1];
			return 0;
		}
		private long getOutput111(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON518[input - 0xA1];
			return 0;
		}
		private long getOutput112(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON519[input - 0xA1];
			return 0;
		}
		private long getOutput113(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON520[input - 0xA1];
			return 0;
		}
		private long getOutput114(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON521[input - 0xA1];
			return 0;
		}
		private long getOutput115(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON522[input - 0xA1];
			return 0;
		}
		private long getOutput116(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON523[input - 0xA1];
			return 0;
		}
		private long getOutput117(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON524[input - 0xA1];
			return 0;
		}
		private long getOutput118(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON525[input - 0xA1];
			return 0;
		}
		private long getOutput119(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON526[input - 0xA1];
			return 0;
		}
		private long getOutput120(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON527[input - 0xA1];
			return 0;
		}
		private long getOutput121(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON528[input - 0xA1];
			return 0;
		}
		private long getOutput122(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON529[input - 0xA1];
			return 0;
		}
		private long getOutput123(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON530[input - 0xA1];
			return 0;
		}
		private long getOutput124(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON531[input - 0xA1];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
			case 0: return getOutput0(input);
			case 1: return getOutput1(input);
			case 2: return getOutput2(input);
			case 3: return getOutput3(input);
			case 4: return getOutput4(input);
			case 5: return getOutput5(input);
			case 6: return getOutput6(input);
			case 7: return getOutput7(input);
			case 8: return getOutput8(input);
			case 9: return getOutput9(input);
			case 10: return getOutput10(input);
			case 11: return getOutput11(input);
			case 12: return getOutput12(input);
			case 13: return getOutput13(input);
			case 14: return getOutput14(input);
			case 15: return getOutput15(input);
			case 16: return getOutput16(input);
			case 17: return getOutput17(input);
			case 18: return getOutput18(input);
			case 19: return getOutput19(input);
			case 20: return getOutput20(input);
			case 21: return getOutput21(input);
			case 22: return getOutput22(input);
			case 23: return getOutput23(input);
			case 24: return getOutput24(input);
			case 25: return getOutput25(input);
			case 26: return getOutput26(input);
			case 27: return getOutput27(input);
			case 28: return getOutput28(input);
			case 29: return getOutput29(input);
			case 30: return getOutput30(input);
			case 31: return getOutput31(input);
			case 32: return getOutput32(input);
			case 33: return getOutput33(input);
			case 34: return getOutput34(input);
			case 35: return getOutput35(input);
			case 36: return getOutput36(input);
			case 37: return getOutput37(input);
			case 38: return getOutput38(input);
			case 39: return getOutput39(input);
			case 40: return getOutput40(input);
			case 41: return getOutput41(input);
			case 42: return getOutput42(input);
			case 43: return getOutput43(input);
			case 44: return getOutput44(input);
			case 45: return getOutput45(input);
			case 46: return getOutput46(input);
			case 47: return getOutput47(input);
			case 48: return getOutput48(input);
			case 49: return getOutput49(input);
			case 50: return getOutput50(input);
			case 51: return getOutput51(input);
			case 52: return getOutput52(input);
			case 53: return getOutput53(input);
			case 54: return getOutput54(input);
			case 55: return getOutput55(input);
			case 56: return getOutput56(input);
			case 57: return getOutput57(input);
			case 58: return getOutput58(input);
			case 59: return getOutput59(input);
			case 60: return getOutput60(input);
			case 61: return getOutput61(input);
			case 62: return getOutput62(input);
			case 63: return getOutput63(input);
			case 64: return getOutput64(input);
			case 65: return getOutput65(input);
			case 66: return getOutput66(input);
			case 67: return getOutput67(input);
			case 68: return getOutput68(input);
			case 69: return getOutput69(input);
			case 70: return getOutput70(input);
			case 71: return getOutput71(input);
			case 72: return getOutput72(input);
			case 73: return getOutput73(input);
			case 74: return getOutput74(input);
			case 75: return getOutput75(input);
			case 76: return getOutput76(input);
			case 77: return getOutput77(input);
			case 78: return getOutput78(input);
			case 79: return getOutput79(input);
			case 80: return getOutput80(input);
			case 81: return getOutput81(input);
			case 82: return getOutput82(input);
			case 83: return getOutput83(input);
			case 84: return getOutput84(input);
			case 85: return getOutput85(input);
			case 86: return getOutput86(input);
			case 87: return getOutput87(input);
			case 88: return getOutput88(input);
			case 89: return getOutput89(input);
			case 90: return getOutput90(input);
			case 91: return getOutput91(input);
			case 92: return getOutput92(input);
			case 93: return getOutput93(input);
			case 94: return getOutput94(input);
			case 95: return getOutput95(input);
			case 96: return getOutput96(input);
			case 97: return getOutput97(input);
			case 98: return getOutput98(input);
			case 99: return getOutput99(input);
			case 100: return getOutput100(input);
			case 101: return getOutput101(input);
			case 102: return getOutput102(input);
			case 103: return getOutput103(input);
			case 104: return getOutput104(input);
			case 105: return getOutput105(input);
			case 106: return getOutput106(input);
			case 107: return getOutput107(input);
			case 108: return getOutput108(input);
			case 109: return getOutput109(input);
			case 110: return getOutput110(input);
			case 111: return getOutput111(input);
			case 112: return getOutput112(input);
			case 113: return getOutput113(input);
			case 114: return getOutput114(input);
			case 115: return getOutput115(input);
			case 116: return getOutput116(input);
			case 117: return getOutput117(input);
			case 118: return getOutput118(input);
			case 119: return getOutput119(input);
			case 120: return getOutput120(input);
			case 121: return getOutput121(input);
			case 122: return getOutput122(input);
			case 123: return getOutput123(input);
			case 124: return getOutput124(input);
			default: return 0;
			}
		}
	}

	private static final class XWindows949CharsetEncoder extends TableCharsetEncoder {
		private XWindows949CharsetEncoder(Charset cs) {
			super(cs, 1.99255f, 2f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private static final char[] GETOUTPUT0_A1 = getOutput0_A1();
		private static final char[] getOutput0_A1() {
			return "\uAEA2\u0000\u0000\uB4A2\u0000\u0000\uD7A1\uA7A1\u0000\uA3A8\u0000\u0000\uA9A1\uE7A2\u0000\uC6A1\uBEA1\uF7A9\uF8A9\uA5A2\u0000\uD2A2\uA4A1\uACA2\uF6A9\uACA8\u0000\uF9A8\uF6A8\uFAA8\uAFA2\u0000\u0000\u0000\u0000\u0000\u0000\uA1A8\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA2A8\u0000\u0000\u0000\u0000\u0000\u0000\uBFA1\uAAA8\u0000\u0000\u0000\u0000\u0000\uADA8\uACA9\u0000\u0000\u0000\u0000\u0000\u0000\uA1A9\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uA3A9\u0000\u0000\u0000\u0000\u0000\u0000\uC0A1\uAAA9\u0000\u0000\u0000\u0000\u0000\uADA9".toCharArray();
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x7F) return input - 0x20 + 0x20;
			if (input >= 0xA1 && input <= 0xFE) return GETOUTPUT0_A1[input - 0xA1];
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON533[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON534[input - 0x401];
			if (input >= 0x2153 && input <= 0x2179) return CommonSubtables.COMMON535[input - 0x2153];
			if (input >= 0x2200 && input <= 0x223D) return CommonSubtables.COMMON988[input - 0x2200];
			if (input >= 0x2460 && input <= 0x2482) return CommonSubtables.COMMON537[input - 0x2460];
			if (input >= 0x249C && input <= 0x24B5) return CommonSubtables.COMMON538[input - 0x249C];
			if (input >= 0x24D0 && input <= 0x24E9) return CommonSubtables.COMMON539[input - 0x24D0];
			if (input >= 0x2500 && input <= 0x254B) return CommonSubtables.COMMON540[input - 0x2500];
			if (input >= 0x2592 && input <= 0x25D1) return CommonSubtables.COMMON989[input - 0x2592];
			if (input >= 0x3000 && input <= 0x3015) return CommonSubtables.COMMON1684[input - 0x3000];
			if (input >= 0x3041 && input <= 0x30F6) return CommonSubtables.COMMON1685[input - 0x3041];
			if (input >= 0x3131 && input <= 0x318E) return CommonSubtables.COMMON544[input - 0x3131];
			if (input >= 0x3200 && input <= 0x321C) return CommonSubtables.COMMON545[input - 0x3200];
			if (input >= 0x3260 && input <= 0x327F) return CommonSubtables.COMMON546[input - 0x3260];
			if (input >= 0x3380 && input <= 0x33DD) return CommonSubtables.COMMON547[input - 0x3380];
			if (input >= 0x4E00 && input <= 0x4F11) return CommonSubtables.COMMON990[input - 0x4E00];
			if (input >= 0x4F2F && input <= 0x5099) return CommonSubtables.COMMON991[input - 0x4F2F];
			if (input >= 0x50AC && input <= 0x52AB) return CommonSubtables.COMMON992[input - 0x50AC];
			if (input >= 0x52BE && input <= 0x5451) return CommonSubtables.COMMON993[input - 0x52BE];
			if (input >= 0x557C && input <= 0x55AE) return CommonSubtables.COMMON994[input - 0x557C];
			if (input >= 0x56A5 && input <= 0x57A3) return CommonSubtables.COMMON995[input - 0x56A5];
			if (input >= 0x57C3 && input <= 0x580A) return CommonSubtables.COMMON996[input - 0x57C3];
			if (input >= 0x581E && input <= 0x58FD) return CommonSubtables.COMMON997[input - 0x581E];
			if (input >= 0x590F && input <= 0x5A66) return CommonSubtables.COMMON998[input - 0x590F];
			if (input >= 0x5B40 && input <= 0x5C79) return CommonSubtables.COMMON999[input - 0x5B40];
			if (input >= 0x5CD9 && input <= 0x5D29) return CommonSubtables.COMMON1000[input - 0x5CD9];
			if (input >= 0x5D9D && input <= 0x602F) return CommonSubtables.COMMON1001[input - 0x5D9D];
			if (input >= 0x6041 && input <= 0x6070) return CommonSubtables.COMMON1002[input - 0x6041];
			if (input >= 0x6085 && input <= 0x61CB) return CommonSubtables.COMMON1003[input - 0x6085];
			if (input >= 0x61E6 && input <= 0x6258) return CommonSubtables.COMMON1004[input - 0x61E6];
			if (input >= 0x626E && input <= 0x6311) return CommonSubtables.COMMON1005[input - 0x626E];
			if (input >= 0x6367 && input <= 0x63AA) return CommonSubtables.COMMON1006[input - 0x6367];
			if (input >= 0x6458 && input <= 0x6504) return CommonSubtables.COMMON1007[input - 0x6458];
			if (input >= 0x6518 && input <= 0x679D) return CommonSubtables.COMMON1008[input - 0x6518];
			if (input >= 0x67AF && input <= 0x67FE) return CommonSubtables.COMMON1009[input - 0x67AF];
			if (input >= 0x6812 && input <= 0x6854) return CommonSubtables.COMMON1010[input - 0x6812];
			if (input >= 0x686D && input <= 0x6912) return CommonSubtables.COMMON1011[input - 0x686D];
			if (input >= 0x6927 && input <= 0x6979) return CommonSubtables.COMMON1188[input - 0x6927];
			if (input >= 0x6A80 && input <= 0x6ADB) return CommonSubtables.COMMON1012[input - 0x6A80];
			if (input >= 0x6AF6 && input <= 0x6BEC) return CommonSubtables.COMMON1013[input - 0x6AF6];
			if (input >= 0x6C08 && input <= 0x6CF3) return CommonSubtables.COMMON1014[input - 0x6C08];
			if (input >= 0x6D0B && input <= 0x6D41) return CommonSubtables.COMMON577[input - 0x6D0B];
			if (input >= 0x6D59 && input <= 0x6D95) return CommonSubtables.COMMON578[input - 0x6D59];
			if (input >= 0x6DAF && input <= 0x6DFB) return CommonSubtables.COMMON1015[input - 0x6DAF];
			if (input >= 0x6E17 && input <= 0x6E7A) return CommonSubtables.COMMON580[input - 0x6E17];
			if (input >= 0x6E90 && input <= 0x6ED4) return CommonSubtables.COMMON1016[input - 0x6E90];
			if (input >= 0x6EEF && input <= 0x70DF) return CommonSubtables.COMMON1017[input - 0x6EEF];
			if (input >= 0x70F1 && input <= 0x7281) return CommonSubtables.COMMON1018[input - 0x70F1];
			if (input >= 0x72A2 && input <= 0x7626) return CommonSubtables.COMMON1019[input - 0x72A2];
			if (input >= 0x763B && input <= 0x7693) return CommonSubtables.COMMON1020[input - 0x763B];
			if (input >= 0x76AE && input <= 0x770B) return CommonSubtables.COMMON1021[input - 0x76AE];
			if (input >= 0x771E && input <= 0x77BF) return CommonSubtables.COMMON1022[input - 0x771E];
			if (input >= 0x7825 && input <= 0x78D0) return CommonSubtables.COMMON1023[input - 0x7825];
			if (input >= 0x792A && input <= 0x7991) return CommonSubtables.COMMON1024[input - 0x792A];
			if (input >= 0x79A6 && input <= 0x79E9) return CommonSubtables.COMMON1025[input - 0x79A6];
			if (input >= 0x79FB && input <= 0x7BE9) return CommonSubtables.COMMON1026[input - 0x79FB];
			if (input >= 0x7C60 && input <= 0x7CE7) return CommonSubtables.COMMON1027[input - 0x7C60];
			if (input >= 0x7CFB && input <= 0x7E9C) return CommonSubtables.COMMON1028[input - 0x7CFB];
			if (input >= 0x7F6A && input <= 0x8018) return CommonSubtables.COMMON1029[input - 0x7F6A];
			if (input >= 0x802D && input <= 0x8247) return CommonSubtables.COMMON1030[input - 0x802D];
			if (input >= 0x8259 && input <= 0x82BF) return CommonSubtables.COMMON1031[input - 0x8259];
			if (input >= 0x82D1 && input <= 0x8352) return CommonSubtables.COMMON1032[input - 0x82D1];
			if (input >= 0x83BD && input <= 0x840E) return CommonSubtables.COMMON1033[input - 0x83BD];
			if (input >= 0x8429 && input <= 0x847A) return CommonSubtables.COMMON1034[input - 0x8429];
			if (input >= 0x8490 && input <= 0x84DA) return CommonSubtables.COMMON1035[input - 0x8490];
			if (input >= 0x8511 && input <= 0x856D) return CommonSubtables.COMMON1036[input - 0x8511];
			if (input >= 0x8584 && input <= 0x861A) return CommonSubtables.COMMON1037[input - 0x8584];
			if (input >= 0x86C7 && input <= 0x871C) return CommonSubtables.COMMON1038[input - 0x86C7];
			if (input >= 0x881F && input <= 0x8944) return CommonSubtables.COMMON1039[input - 0x881F];
			if (input >= 0x895F && input <= 0x89C0) return CommonSubtables.COMMON1040[input - 0x895F];
			if (input >= 0x89D2 && input <= 0x8A3B) return CommonSubtables.COMMON1041[input - 0x89D2];
			if (input >= 0x8A50 && input <= 0x8B9A) return CommonSubtables.COMMON1042[input - 0x8A50];
			if (input >= 0x8C37 && input <= 0x8D16) return CommonSubtables.COMMON1043[input - 0x8C37];
			if (input >= 0x8D64 && input <= 0x8DF3) return CommonSubtables.COMMON1044[input - 0x8D64];
			if (input >= 0x8E0A && input <= 0x8E60) return CommonSubtables.COMMON1045[input - 0x8E0A];
			if (input >= 0x8EC0 && input <= 0x8F62) return CommonSubtables.COMMON1046[input - 0x8EC0];
			if (input >= 0x8FE6 && input <= 0x90CA) return CommonSubtables.COMMON1047[input - 0x8FE6];
			if (input >= 0x9149 && input <= 0x91F5) return CommonSubtables.COMMON1048[input - 0x9149];
			if (input >= 0x92E4 && input <= 0x932F) return CommonSubtables.COMMON609[input - 0x92E4];
			if (input >= 0x9577 && input <= 0x95E2) return CommonSubtables.COMMON1049[input - 0x9577];
			if (input >= 0x961C && input <= 0x97AD) return CommonSubtables.COMMON1050[input - 0x961C];
			if (input >= 0x97F3 && input <= 0x9818) return CommonSubtables.COMMON1051[input - 0x97F3];
			if (input >= 0x982D && input <= 0x986F) return CommonSubtables.COMMON1052[input - 0x982D];
			if (input >= 0x98DB && input <= 0x9928) return CommonSubtables.COMMON614[input - 0x98DB];
			if (input >= 0x9996 && input <= 0x9A19) return CommonSubtables.COMMON1053[input - 0x9996];
			if (input >= 0x9A2B && input <= 0x9A6A) return CommonSubtables.COMMON616[input - 0x9A2B];
			if (input >= 0x9E92 && input <= 0x9EF4) return CommonSubtables.COMMON1054[input - 0x9E92];
			if (input >= 0xAC00 && input <= 0xBBFF) return CommonSubtables.COMMON1686[input - 0xAC00];
			if (input >= 0xBC00 && input <= 0xCBFF) return CommonSubtables.COMMON1687[input - 0xBC00];
			if (input >= 0xCC00 && input <= 0xD7A3) return CommonSubtables.COMMON1688[input - 0xCC00];
			if (input >= 0xF900 && input <= 0xFA0B) return CommonSubtables.COMMON676[input - 0xF900];
			if (input >= 0xFF01 && input <= 0xFF5E) return CommonSubtables.COMMON1101[input - 0xFF01];
			switch (input) {
			case 0x111: return 0xA2A9L;
			case 0x126: return 0xA4A8L;
			case 0x127: return 0xA4A9L;
			case 0x131: return 0xA5A9L;
			case 0x132: return 0xA6A8L;
			case 0x133: return 0xA6A9L;
			case 0x138: return 0xA7A9L;
			case 0x13F: return 0xA8A8L;
			case 0x140: return 0xA8A9L;
			case 0x141: return 0xA9A8L;
			case 0x142: return 0xA9A9L;
			case 0x149: return 0xB0A9L;
			case 0x14A: return 0xAFA8L;
			case 0x14B: return 0xAFA9L;
			case 0x152: return 0xABA8L;
			case 0x153: return 0xABA9L;
			case 0x166: return 0xAEA8L;
			case 0x167: return 0xAEA9L;
			case 0x2C7: return 0xA7A2L;
			case 0x2D0: return 0xB0A2L;
			case 0x2D8: return 0xA8A2L;
			case 0x2D9: return 0xABA2L;
			case 0x2DA: return 0xAAA2L;
			case 0x2DB: return 0xADA2L;
			case 0x2DD: return 0xA9A2L;
			case 0x2015: return 0xAAA1L;
			case 0x2018: return 0xAEA1L;
			case 0x2019: return 0xAFA1L;
			case 0x201C: return 0xB0A1L;
			case 0x201D: return 0xB1A1L;
			case 0x2020: return 0xD3A2L;
			case 0x2021: return 0xD4A2L;
			case 0x2025: return 0xA5A1L;
			case 0x2026: return 0xA6A1L;
			case 0x2030: return 0xB6A2L;
			case 0x2032: return 0xC7A1L;
			case 0x2033: return 0xC8A1L;
			case 0x203B: return 0xD8A1L;
			case 0x2074: return 0xF9A9L;
			case 0x207F: return 0xFAA9L;
			case 0x2081: return 0xFBA9L;
			case 0x2082: return 0xFCA9L;
			case 0x2083: return 0xFDA9L;
			case 0x2084: return 0xFEA9L;
			case 0x20AC: return 0xE6A2L;
			case 0x2103: return 0xC9A1L;
			case 0x2109: return 0xB5A2L;
			case 0x2113: return 0xA4A7L;
			case 0x2116: return 0xE0A2L;
			case 0x2121: return 0xE5A2L;
			case 0x2122: return 0xE2A2L;
			case 0x2126: return 0xD9A7L;
			case 0x212B: return 0xCAA1L;
			case 0x2190: return 0xE7A1L;
			case 0x2191: return 0xE8A1L;
			case 0x2192: return 0xE6A1L;
			case 0x2193: return 0xE9A1L;
			case 0x2194: return 0xEAA1L;
			case 0x2195: return 0xD5A2L;
			case 0x2196: return 0xD8A2L;
			case 0x2197: return 0xD6A2L;
			case 0x2198: return 0xD9A2L;
			case 0x2199: return 0xD7A2L;
			case 0x21D2: return 0xA1A2L;
			case 0x21D4: return 0xA2A2L;
			case 0x2252: return 0xD6A1L;
			case 0x2260: return 0xC1A1L;
			case 0x2261: return 0xD5A1L;
			case 0x2264: return 0xC2A1L;
			case 0x2265: return 0xC3A1L;
			case 0x226A: return 0xECA1L;
			case 0x226B: return 0xEDA1L;
			case 0x2282: return 0xF8A1L;
			case 0x2283: return 0xF9A1L;
			case 0x2286: return 0xF6A1L;
			case 0x2287: return 0xF7A1L;
			case 0x2299: return 0xC1A2L;
			case 0x22A5: return 0xD1A1L;
			case 0x2312: return 0xD2A1L;
			case 0x2605: return 0xDAA1L;
			case 0x2606: return 0xD9A1L;
			case 0x260E: return 0xCFA2L;
			case 0x260F: return 0xCEA2L;
			case 0x261C: return 0xD0A2L;
			case 0x261E: return 0xD1A2L;
			case 0x2640: return 0xCFA1L;
			case 0x2642: return 0xCEA1L;
			case 0x2660: return 0xBCA2L;
			case 0x2661: return 0xBDA2L;
			case 0x2663: return 0xC0A2L;
			case 0x2664: return 0xBBA2L;
			case 0x2665: return 0xBEA2L;
			case 0x2667: return 0xBFA2L;
			case 0x2668: return 0xCDA2L;
			case 0x2669: return 0xDBA2L;
			case 0x266A: return 0xDCA2L;
			case 0x266C: return 0xDDA2L;
			case 0x266D: return 0xDAA2L;
			case 0x5468: return 0xB2F1L;
			case 0x546A: return 0xB1F1L;
			case 0x5471: return 0xB2CDL;
			case 0x5473: return 0xABDAL;
			case 0x5475: return 0xA7CAL;
			case 0x547B: return 0xE2E3L;
			case 0x547C: return 0xBCFBL;
			case 0x547D: return 0xA4D9L;
			case 0x5480: return 0xBAEEL;
			case 0x5486: return 0xD3F8L;
			case 0x548C: return 0xFAFBL;
			case 0x548E: return 0xA4CFL;
			case 0x5490: return 0xFBDCL;
			case 0x54A4: return 0xE3F6L;
			case 0x54A8: return 0xAAEDL;
			case 0x54AB: return 0xA1F2L;
			case 0x54AC: return 0xE1CEL;
			case 0x54B3: return 0xA6FAL;
			case 0x54B8: return 0xE0F9L;
			case 0x54BD: return 0xD6ECL;
			case 0x54C0: return 0xEEE4L;
			case 0x54C1: return 0xA1F9L;
			case 0x54C4: return 0xEFFBL;
			case 0x54C8: return 0xEBF9L;
			case 0x54C9: return 0xA3EEL;
			case 0x54E1: return 0xACEAL;
			case 0x54E5: return 0xA8CAL;
			case 0x54E8: return 0xFAF4L;
			case 0x54ED: return 0xD6CDL;
			case 0x54EE: return 0xF6FCL;
			case 0x54F2: return 0xC9F4L;
			case 0x54FA: return 0xD4F8L;
			case 0x5504: return 0xA6F8L;
			case 0x5506: return 0xCADEL;
			case 0x5507: return 0xC6F2L;
			case 0x550E: return 0xDAD7L;
			case 0x5510: return 0xD0D3L;
			case 0x551C: return 0xC5D8L;
			case 0x552F: return 0xE6EAL;
			case 0x5531: return 0xDDF3L;
			case 0x5535: return 0xDAE4L;
			case 0x553E: return 0xE4F6L;
			case 0x5544: return 0xF2F6L;
			case 0x5546: return 0xC2DFL;
			case 0x554F: return 0xFDD9L;
			case 0x5553: return 0xF6CCL;
			case 0x5556: return 0xBAD3L;
			case 0x555E: return 0xAFE4L;
			case 0x5563: return 0xE1F9L;
			case 0x55C5: return 0xABFDL;
			case 0x55C7: return 0xE0DFL;
			case 0x55D4: return 0xC7F2L;
			case 0x55DA: return 0xF0E7L;
			case 0x55DC: return 0xEED0L;
			case 0x55DF: return 0xAAF3L;
			case 0x55E3: return 0xCBDEL;
			case 0x55E4: return 0xB8F6L;
			case 0x55FD: return 0xF5E1L;
			case 0x55FE: return 0xB3F1L;
			case 0x5606: return 0xA3F7L;
			case 0x5609: return 0xA9CAL;
			case 0x5614: return 0xA5CFL;
			case 0x5617: return 0xC4DFL;
			case 0x562F: return 0xB0E1L;
			case 0x5632: return 0xBFF0L;
			case 0x5634: return 0xA4F6L;
			case 0x5636: return 0xB6E3L;
			case 0x5653: return 0xC6FAL;
			case 0x5668: return 0xEFD0L;
			case 0x566B: return 0xEDFDL;
			case 0x5674: return 0xC4DDL;
			case 0x5686: return 0xF7FCL;
			case 0x5A92: return 0xDAD8L;
			case 0x5A9A: return 0xACDAL;
			case 0x5A9B: return 0xB0EAL;
			case 0x5AA4: return 0xB8E3L;
			case 0x5AC1: return 0xAACAL;
			case 0x5AC2: return 0xF9E1L;
			case 0x5AC4: return 0xB1EAL;
			case 0x5AC9: return 0xECF2L;
			case 0x5ACC: return 0xEEFAL;
			case 0x5AE1: return 0xD5EEL;
			case 0x5AE6: return 0xF4F9L;
			case 0x5AE9: return 0xECD2L;
			case 0x5B05: return 0xFBFBL;
			case 0x5B09: return 0xF0FDL;
			case 0x5B0B: return 0xBDE0L;
			case 0x5B0C: return 0xE3CEL;
			case 0x5B16: return 0xC6F8L;
			case 0x5B2A: return 0xAEDEL;
			case 0x5C90: return 0xF7D0L;
			case 0x5C91: return 0xD4EDL;
			case 0x5CA1: return 0xAACBL;
			case 0x5CA9: return 0xDBE4L;
			case 0x5CAB: return 0xFBE1L;
			case 0x5CAC: return 0xA2CBL;
			case 0x5CB1: return 0xE0D3L;
			case 0x5CB3: return 0xBFE4L;
			case 0x5CB5: return 0xC0FBL;
			case 0x5CB7: return 0xBEDAL;
			case 0x5CB8: return 0xCDE4L;
			case 0x5CBA: return 0xB9D6L;
			case 0x5CBE: return 0xC0EFL;
			case 0x5CC0: return 0xFCE1L;
			case 0x5D4B: return 0xAEDAL;
			case 0x5D4C: return 0xEECAL;
			case 0x5D50: return 0xB9D5L;
			case 0x5D69: return 0xA1E3L;
			case 0x5D6C: return 0xE3E8L;
			case 0x5D6F: return 0xABF3L;
			case 0x5D87: return 0xA9CFL;
			case 0x5D8B: return 0xF7D3L;
			case 0x632B: return 0xA9F1L;
			case 0x632F: return 0xC9F2L;
			case 0x633A: return 0xD8EFL;
			case 0x633B: return 0xC9E6L;
			case 0x633D: return 0xB8D8L;
			case 0x633E: return 0xF3FAL;
			case 0x6349: return 0xB5F3L;
			case 0x634C: return 0xA4F8L;
			case 0x634F: return 0xF3D1L;
			case 0x6350: return 0xC8E6L;
			case 0x6355: return 0xDAF8L;
			case 0x63C0: return 0xD1CAL;
			case 0x63C4: return 0xF1EAL;
			case 0x63C6: return 0xA6D0L;
			case 0x63CF: return 0xDAD9L;
			case 0x63D0: return 0xABF0L;
			case 0x63D6: return 0xE7EBL;
			case 0x63DA: return 0xC0E5L;
			case 0x63DB: return 0xB5FCL;
			case 0x63E1: return 0xC4E4L;
			case 0x63ED: return 0xA9CCL;
			case 0x63EE: return 0xC6FDL;
			case 0x63F4: return 0xB5EAL;
			case 0x63F6: return 0xAAE5L;
			case 0x63F7: return 0xBADFL;
			case 0x640D: return 0xDFE1L;
			case 0x640F: return 0xD1DAL;
			case 0x6414: return 0xB8E1L;
			case 0x6416: return 0xF4E8L;
			case 0x6417: return 0xFDD3L;
			case 0x641C: return 0xA4E2L;
			case 0x6422: return 0xCAF2L;
			case 0x642C: return 0xE6DAL;
			case 0x642D: return 0xB3F7L;
			case 0x643A: return 0xCDFDL;
			case 0x643E: return 0xB6F3L;
			case 0x6995: return 0xBEE9L;
			case 0x699B: return 0xCEF2L;
			case 0x699C: return 0xB4DBL;
			case 0x69A5: return 0xCEFCL;
			case 0x69A7: return 0xEEDDL;
			case 0x69AE: return 0xB4E7L;
			case 0x69B4: return 0xB4D7L;
			case 0x69BB: return 0xB4F7L;
			case 0x69C1: return 0xBECDL;
			case 0x69C3: return 0xE9DAL;
			case 0x69CB: return 0xB0CFL;
			case 0x69CC: return 0xD9F7L;
			case 0x69CD: return 0xE6F3L;
			case 0x69D0: return 0xD9CEL;
			case 0x69E8: return 0xAACEL;
			case 0x69EA: return 0xC8CBL;
			case 0x69FB: return 0xA7D0L;
			case 0x69FD: return 0xCBF0L;
			case 0x69FF: return 0xC7D0L;
			case 0x6A02: return 0xC5E4L;
			case 0x6A0A: return 0xE0DBL;
			case 0x6A11: return 0xDAD5L;
			case 0x6A13: return 0xA7D7L;
			case 0x6A17: return 0xC0EEL;
			case 0x6A19: return 0xF6F8L;
			case 0x6A1E: return 0xD2F5L;
			case 0x6A1F: return 0xE9EDL;
			case 0x6A21: return 0xBCD9L;
			case 0x6A23: return 0xC6E5L;
			case 0x6A35: return 0xA3F5L;
			case 0x6A38: return 0xD4DAL;
			case 0x6A39: return 0xA7E2L;
			case 0x6A3A: return 0xFCFBL;
			case 0x6A3D: return 0xDCF1L;
			case 0x6A44: return 0xF4CAL;
			case 0x6A48: return 0xFAE8L;
			case 0x6A4B: return 0xE9CEL;
			case 0x6A52: return 0xF8E9L;
			case 0x6A53: return 0xE5E2L;
			case 0x6A58: return 0xB9D0L;
			case 0x6A59: return 0xF2D4L;
			case 0x6A5F: return 0xA6D1L;
			case 0x6A61: return 0xCEDFL;
			case 0x6A6B: return 0xF4FCL;
			case 0x77D7: return 0xB8F5L;
			case 0x77DB: return 0xC3D9L;
			case 0x77DC: return 0xE8D0L;
			case 0x77E2: return 0xC5E3L;
			case 0x77E3: return 0xF8EBL;
			case 0x77E5: return 0xB1F2L;
			case 0x77E9: return 0xBBCFL;
			case 0x77ED: return 0xADD3L;
			case 0x77EE: return 0xE1E8L;
			case 0x77EF: return 0xECCEL;
			case 0x77F3: return 0xB4E0L;
			case 0x7802: return 0xE3DEL;
			case 0x7812: return 0xF7DDL;
			case 0x78E8: return 0xA8D8L;
			case 0x78EC: return 0xE4CCL;
			case 0x78EF: return 0xB4D1L;
			case 0x78F5: return 0xD8CAL;
			case 0x78FB: return 0xF2DAL;
			case 0x7901: return 0xA7F5L;
			case 0x790E: return 0xA8F5L;
			case 0x7916: return 0xA6E6L;
			case 0x7C07: return 0xEAF0L;
			case 0x7C12: return 0xC2F3L;
			case 0x7C1E: return 0xAFD3L;
			case 0x7C21: return 0xDBCAL;
			case 0x7C27: return 0xD7FCL;
			case 0x7C2A: return 0xD8EDL;
			case 0x7C2B: return 0xC7E1L;
			case 0x7C3D: return 0xD8F4L;
			case 0x7C3E: return 0xB3D6L;
			case 0x7C3F: return 0xADDDL;
			case 0x7C43: return 0xBED5L;
			case 0x7C4C: return 0xC3F1L;
			case 0x7C4D: return 0xDFEEL;
			case 0x7F36: return 0xAEDDL;
			case 0x7F38: return 0xFCF9L;
			case 0x7F3A: return 0xC0CCL;
			case 0x7F4C: return 0xA2E5L;
			case 0x7F50: return 0xB8CEL;
			case 0x7F54: return 0xD2D8L;
			case 0x7F55: return 0xD6F9L;
			case 0x8373: return 0xE5D4L;
			case 0x8377: return 0xC3F9L;
			case 0x837B: return 0xE2EEL;
			case 0x8389: return 0xE9D7L;
			case 0x838A: return 0xF6EDL;
			case 0x838E: return 0xEDDEL;
			case 0x8396: return 0xECCCL;
			case 0x8398: return 0xEEE3L;
			case 0x839E: return 0xD4E8L;
			case 0x83A2: return 0xF8FAL;
			case 0x83A9: return 0xB4DDL;
			case 0x83AA: return 0xB5E4L;
			case 0x83AB: return 0xB0D8L;
			case 0x84EC: return 0xEFDCL;
			case 0x84EE: return 0xA5D6L;
			case 0x84F4: return 0xF1E2L;
			case 0x84FC: return 0xFED6L;
			case 0x862D: return 0xB5D5L;
			case 0x863F: return 0xA1D5L;
			case 0x864E: return 0xDBFBL;
			case 0x8650: return 0xCBF9L;
			case 0x8654: return 0xF3CBL;
			case 0x8655: return 0xA5F4L;
			case 0x865B: return 0xC8FAL;
			case 0x865C: return 0xD7D6L;
			case 0x865E: return 0xE5E9L;
			case 0x865F: return 0xDCFBL;
			case 0x8667: return 0xD0FDL;
			case 0x8679: return 0xF6FBL;
			case 0x868A: return 0xA5DAL;
			case 0x868C: return 0xBDDBL;
			case 0x8693: return 0xE2ECL;
			case 0x86A3: return 0xF7CDL;
			case 0x86A4: return 0xDEF0L;
			case 0x86A9: return 0xC9F6L;
			case 0x874E: return 0xE9CAL;
			case 0x8755: return 0xDAE3L;
			case 0x8757: return 0xD9FCL;
			case 0x875F: return 0xDAEAL;
			case 0x8766: return 0xC4F9L;
			case 0x8768: return 0xA4E3L;
			case 0x8774: return 0xDDFBL;
			case 0x8776: return 0xCAEFL;
			case 0x8778: return 0xC4E8L;
			case 0x8782: return 0xCCD5L;
			case 0x878D: return 0xD7EBL;
			case 0x879F: return 0xADD9L;
			case 0x87A2: return 0xABFBL;
			case 0x87B3: return 0xD9D3L;
			case 0x87BA: return 0xA2D5L;
			case 0x87C4: return 0xDEF6L;
			case 0x87E0: return 0xF6DAL;
			case 0x87EC: return 0xD1E0L;
			case 0x87EF: return 0xA8E9L;
			case 0x87F2: return 0xF9F5L;
			case 0x87F9: return 0xAFFAL;
			case 0x87FB: return 0xFCEBL;
			case 0x87FE: return 0xEAE0L;
			case 0x8805: return 0xB2E3L;
			case 0x8E74: return 0xEDF5L;
			case 0x8E76: return 0xF3CFL;
			case 0x8E81: return 0xE2F0L;
			case 0x8E87: return 0xCEEEL;
			case 0x8E8A: return 0xCCF1L;
			case 0x8E8D: return 0xB8E5L;
			case 0x8EAA: return 0xF5D7L;
			case 0x8EAB: return 0xF3E3L;
			case 0x8EAC: return 0xE5CFL;
			case 0x8F9B: return 0xF4E3L;
			case 0x8F9C: return 0xD0CDL;
			case 0x8FA3: return 0xB8D5L;
			case 0x8FA6: return 0xFDF7L;
			case 0x8FA8: return 0xA9DCL;
			case 0x8FAD: return 0xF6DEL;
			case 0x8FAF: return 0xAADCL;
			case 0x8FB0: return 0xE3F2L;
			case 0x8FB1: return 0xB4E9L;
			case 0x8FB2: return 0xDCD2L;
			case 0x8FC2: return 0xE6E9L;
			case 0x8FC5: return 0xF6E3L;
			case 0x8FCE: return 0xCAE7L;
			case 0x8FD1: return 0xCED0L;
			case 0x8FD4: return 0xF7DAL;
			case 0x90DE: return 0xCDD5L;
			case 0x90E1: return 0xDBCFL;
			case 0x90E8: return 0xBBDDL;
			case 0x90ED: return 0xACCEL;
			case 0x90F5: return 0xE8E9L;
			case 0x90FD: return 0xB4D4L;
			case 0x9102: return 0xC7E4L;
			case 0x9112: return 0xDBF5L;
			case 0x9115: return 0xC1FAL;
			case 0x9119: return 0xA9DEL;
			case 0x9127: return 0xF8D4L;
			case 0x912D: return 0xF7EFL;
			case 0x9132: return 0xB3D3L;
			case 0x920D: return 0xEFD4L;
			case 0x9210: return 0xA2CCL;
			case 0x9211: return 0xFEF7L;
			case 0x9212: return 0xBCDFL;
			case 0x9217: return 0xCDEBL;
			case 0x921E: return 0xB7D0L;
			case 0x9234: return 0xC2D6L;
			case 0x923A: return 0xADE8L;
			case 0x923F: return 0xAFEFL;
			case 0x9240: return 0xA5CBL;
			case 0x9245: return 0xE9CBL;
			case 0x9249: return 0xE8FAL;
			case 0x9257: return 0xC6CCL;
			case 0x925B: return 0xE7E6L;
			case 0x925E: return 0xC7EAL;
			case 0x9262: return 0xA4DBL;
			case 0x9264: return 0xC9CFL;
			case 0x9265: return 0xFCE2L;
			case 0x9266: return 0xFAEFL;
			case 0x9280: return 0xDEEBL;
			case 0x9283: return 0xC8F5L;
			case 0x9285: return 0xDED4L;
			case 0x9291: return 0xD5E0L;
			case 0x9293: return 0xB0EFL;
			case 0x9296: return 0xC7E2L;
			case 0x9298: return 0xAFD9L;
			case 0x929C: return 0xE7F9L;
			case 0x92B3: return 0xE5E7L;
			case 0x92B6: return 0xCACFL;
			case 0x92B7: return 0xD1E1L;
			case 0x92B9: return 0xC8E2L;
			case 0x92CC: return 0xFBEFL;
			case 0x92CF: return 0xF9FAL;
			case 0x92D2: return 0xF2DCL;
			case 0x9348: return 0xCCE7L;
			case 0x934A: return 0xA8D6L;
			case 0x934B: return 0xA7CEL;
			case 0x934D: return 0xB5D4L;
			case 0x9354: return 0xC8E4L;
			case 0x935B: return 0xB4D3L;
			case 0x936E: return 0xB9EBL;
			case 0x9375: return 0xF5CBL;
			case 0x937C: return 0xDDF6L;
			case 0x937E: return 0xA3F1L;
			case 0x938C: return 0xC7CCL;
			case 0x9394: return 0xCAE9L;
			case 0x9396: return 0xF0E1L;
			case 0x939A: return 0xE0F5L;
			case 0x93A3: return 0xAFFBL;
			case 0x93A7: return 0xD1CBL;
			case 0x93AC: return 0xE0FBL;
			case 0x93AD: return 0xE5F2L;
			case 0x93B0: return 0xF0ECL;
			case 0x93C3: return 0xECF0L;
			case 0x93D1: return 0xEBEEL;
			case 0x93DE: return 0xCBE9L;
			case 0x93E1: return 0xF0CCL;
			case 0x93E4: return 0xAFD7L;
			case 0x93F6: return 0xA1F3L;
			case 0x9404: return 0xF5FCL;
			case 0x9418: return 0xA4F1L;
			case 0x9425: return 0xD6E0L;
			case 0x942B: return 0xB2EFL;
			case 0x9435: return 0xD1F4L;
			case 0x9438: return 0xA1F7L;
			case 0x9444: return 0xD1F1L;
			case 0x9451: return 0xFCCAL;
			case 0x9452: return 0xFDCAL;
			case 0x945B: return 0xCECEL;
			case 0x947D: return 0xC8F3L;
			case 0x947F: return 0xBAF3L;
			case 0x97C6: return 0xC7F4L;
			case 0x97CB: return 0xDFEAL;
			case 0x97D3: return 0xDBF9L;
			case 0x97DC: return 0xB7D4L;
			case 0x98A8: return 0xA6F9L;
			case 0x98AF: return 0xBDDFL;
			case 0x98B1: return 0xC7F7L;
			case 0x98C4: return 0xFDF8L;
			case 0x98C7: return 0xFCF8L;
			case 0x9945: return 0xC3D8L;
			case 0x9949: return 0xCFD0L;
			case 0x994B: return 0xFACFL;
			case 0x994C: return 0xCAF3L;
			case 0x994D: return 0xD7E0L;
			case 0x9951: return 0xC7D1L;
			case 0x9952: return 0xAEE9L;
			case 0x9954: return 0xBDE8L;
			case 0x9957: return 0xC4FAL;
			case 0x9AA8: return 0xE9CDL;
			case 0x9AB8: return 0xB5FAL;
			case 0x9AD3: return 0xD0E2L;
			case 0x9AD4: return 0xF7F4L;
			case 0x9AD8: return 0xD4CDL;
			case 0x9AE5: return 0xA3E7L;
			case 0x9AEE: return 0xA5DBL;
			case 0x9B1A: return 0xD1E2L;
			case 0x9B27: return 0xA2D7L;
			case 0x9B2A: return 0xE3F7L;
			case 0x9B31: return 0xA6EAL;
			case 0x9B3C: return 0xA1D0L;
			case 0x9B41: return 0xDACEL;
			case 0x9B42: return 0xEBFBL;
			case 0x9B43: return 0xA6DBL;
			case 0x9B44: return 0xDEDBL;
			case 0x9B45: return 0xE5D8L;
			case 0x9B4F: return 0xE0EAL;
			case 0x9B54: return 0xAAD8L;
			case 0x9B5A: return 0xE0E5L;
			case 0x9B6F: return 0xDBD6L;
			case 0x9B8E: return 0xC6EFL;
			case 0x9B91: return 0xEAF8L;
			case 0x9B9F: return 0xD5E4L;
			case 0x9BAB: return 0xF7CEL;
			case 0x9BAE: return 0xD8E0L;
			case 0x9BC9: return 0xEFD7L;
			case 0x9BD6: return 0xEDF4L;
			case 0x9BE4: return 0xE6CDL;
			case 0x9BE8: return 0xF4CCL;
			case 0x9C0D: return 0xE3F5L;
			case 0x9C10: return 0xCAE4L;
			case 0x9C12: return 0xE1DCL;
			case 0x9C15: return 0xC8F9L;
			case 0x9C25: return 0xBFFCL;
			case 0x9C32: return 0xA7E8L;
			case 0x9C3B: return 0xC4D8L;
			case 0x9C47: return 0xBECBL;
			case 0x9C49: return 0xAEDCL;
			case 0x9C57: return 0xF7D7L;
			case 0x9CE5: return 0xE8F0L;
			case 0x9CE7: return 0xC0DDL;
			case 0x9CE9: return 0xCDCFL;
			case 0x9CF3: return 0xF3DCL;
			case 0x9CF4: return 0xB0D9L;
			case 0x9CF6: return 0xE9E6L;
			case 0x9D09: return 0xBCE4L;
			case 0x9D1B: return 0xC4EAL;
			case 0x9D26: return 0xECE4L;
			case 0x9D28: return 0xE5E4L;
			case 0x9D3B: return 0xF8FBL;
			case 0x9D51: return 0xBBCCL;
			case 0x9D5D: return 0xBDE4L;
			case 0x9D60: return 0xDCCDL;
			case 0x9D61: return 0xF7D9L;
			case 0x9D6C: return 0xDFDDL;
			case 0x9D72: return 0xCEEDL;
			case 0x9DA9: return 0xD0D9L;
			case 0x9DAF: return 0xA3E5L;
			case 0x9DB4: return 0xCDF9L;
			case 0x9DC4: return 0xAECDL;
			case 0x9DD7: return 0xCECFL;
			case 0x9DF2: return 0xAFF6L;
			case 0x9DF8: return 0xD3FDL;
			case 0x9DF9: return 0xEDEBL;
			case 0x9DFA: return 0xDCD6L;
			case 0x9E1A: return 0xA4E5L;
			case 0x9E1E: return 0xB6D5L;
			case 0x9E75: return 0xDDD6L;
			case 0x9E79: return 0xE9F9L;
			case 0x9E7D: return 0xA4E7L;
			case 0x9E7F: return 0xE3D6L;
			case 0x9F07: return 0xA8E8L;
			case 0x9F08: return 0xAFDCL;
			case 0x9F0E: return 0xA3F0L;
			case 0x9F13: return 0xD5CDL;
			case 0x9F20: return 0xA9E0L;
			case 0x9F3B: return 0xACDEL;
			case 0x9F4A: return 0xBAF0L;
			case 0x9F4B: return 0xB1EEL;
			case 0x9F4E: return 0xB2EEL;
			case 0x9F52: return 0xCDF6L;
			case 0x9F5F: return 0xD2EEL;
			case 0x9F61: return 0xC6D6L;
			case 0x9F67: return 0xE5E0L;
			case 0x9F6A: return 0xBBF3L;
			case 0x9F6C: return 0xE1E5L;
			case 0x9F77: return 0xCBE4L;
			case 0x9F8D: return 0xA3D7L;
			case 0x9F90: return 0xC2DBL;
			case 0x9F95: return 0xFECAL;
			case 0x9F9C: return 0xCFCFL;
			case 0xFFE0: return 0xCBA1L;
			case 0xFFE1: return 0xCCA1L;
			case 0xFFE2: return 0xFEA1L;
			case 0xFFE3: return 0xFEA3L;
			case 0xFFE5: return 0xCDA1L;
			case 0xFFE6: return 0xDCA3L;
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
