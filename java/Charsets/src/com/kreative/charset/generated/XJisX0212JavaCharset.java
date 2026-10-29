package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XJisX0212JavaCharset extends Charset {
	public XJisX0212JavaCharset() {
		super("x-jis-x-0212-java", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XJisX0212JavaCharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XJisX0212JavaCharsetEncoder(this);
	}

	private static final class XJisX0212JavaCharsetDecoder extends TableCharsetDecoder {
		private XJisX0212JavaCharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0x30 && input <= 0x6D) return input - 0x30 + 0x7;
			switch (input) {
			case 0x22: return 0x1;
			case 0x26: return 0x2;
			case 0x27: return 0x3;
			case 0x29: return 0x4;
			case 0x2A: return 0x5;
			case 0x2B: return 0x6;
			}
			return 0;
		}
		protected int getNextState(int state, int input) {
			switch (state) {
			case 0: return getNextState0(input);
			default: return 0;
			}
		}
		private long getOutput1(int input) {
			switch (input) {
			case 0x2F: return 0x2D8L;
			case 0x30: return 0x2C7L;
			case 0x31: return 0xB8L;
			case 0x32: return 0x2D9L;
			case 0x33: return 0x2DDL;
			case 0x34: return 0xAFL;
			case 0x35: return 0x2DBL;
			case 0x36: return 0x2DAL;
			case 0x37: return 0xFF5EL;
			case 0x38: return 0x384L;
			case 0x39: return 0x385L;
			case 0x42: return 0xA1L;
			case 0x43: return 0xA6L;
			case 0x44: return 0xBFL;
			case 0x6B: return 0xBAL;
			case 0x6C: return 0xAAL;
			case 0x6D: return 0xA9L;
			case 0x6E: return 0xAEL;
			case 0x6F: return 0x2122L;
			case 0x70: return 0xA4L;
			case 0x71: return 0x2116L;
			}
			return 0;
		}
		private long getOutput2(int input) {
			if (input >= 0x61 && input <= 0x7C) return CommonSubtables.COMMON1297[input - 0x61];
			return 0;
		}
		private long getOutput3(int input) {
			switch (input) {
			case 0x42: return 0x402L;
			case 0x43: return 0x403L;
			case 0x44: return 0x404L;
			case 0x45: return 0x405L;
			case 0x46: return 0x406L;
			case 0x47: return 0x407L;
			case 0x48: return 0x408L;
			case 0x49: return 0x409L;
			case 0x4A: return 0x40AL;
			case 0x4B: return 0x40BL;
			case 0x4C: return 0x40CL;
			case 0x4D: return 0x40EL;
			case 0x4E: return 0x40FL;
			case 0x72: return 0x452L;
			case 0x73: return 0x453L;
			case 0x74: return 0x454L;
			case 0x75: return 0x455L;
			case 0x76: return 0x456L;
			case 0x77: return 0x457L;
			case 0x78: return 0x458L;
			case 0x79: return 0x459L;
			case 0x7A: return 0x45AL;
			case 0x7B: return 0x45BL;
			case 0x7C: return 0x45CL;
			case 0x7D: return 0x45EL;
			case 0x7E: return 0x45FL;
			}
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0x21 && input <= 0x50) return CommonSubtables.COMMON1298[input - 0x21];
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0x21 && input <= 0x77) return CommonSubtables.COMMON1299[input - 0x21];
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0x21 && input <= 0x77) return CommonSubtables.COMMON1300[input - 0x21];
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1301[input - 0x21];
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1302[input - 0x21];
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1303[input - 0x21];
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1304[input - 0x21];
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1305[input - 0x21];
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1306[input - 0x21];
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1307[input - 0x21];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1308[input - 0x21];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1309[input - 0x21];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1310[input - 0x21];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1311[input - 0x21];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1312[input - 0x21];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1313[input - 0x21];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1314[input - 0x21];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1315[input - 0x21];
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1316[input - 0x21];
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1317[input - 0x21];
			return 0;
		}
		private long getOutput24(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1318[input - 0x21];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1319[input - 0x21];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1320[input - 0x21];
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1321[input - 0x21];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1322[input - 0x21];
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1323[input - 0x21];
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1324[input - 0x21];
			return 0;
		}
		private long getOutput31(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1325[input - 0x21];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1326[input - 0x21];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1327[input - 0x21];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1328[input - 0x21];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1329[input - 0x21];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1330[input - 0x21];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1331[input - 0x21];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1332[input - 0x21];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1333[input - 0x21];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1334[input - 0x21];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1335[input - 0x21];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1336[input - 0x21];
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1337[input - 0x21];
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1338[input - 0x21];
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1339[input - 0x21];
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1340[input - 0x21];
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1341[input - 0x21];
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1342[input - 0x21];
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1343[input - 0x21];
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1344[input - 0x21];
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1345[input - 0x21];
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1346[input - 0x21];
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1347[input - 0x21];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1348[input - 0x21];
			return 0;
		}
		private long getOutput55(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1349[input - 0x21];
			return 0;
		}
		private long getOutput56(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1350[input - 0x21];
			return 0;
		}
		private long getOutput57(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1351[input - 0x21];
			return 0;
		}
		private long getOutput58(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1352[input - 0x21];
			return 0;
		}
		private long getOutput59(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1353[input - 0x21];
			return 0;
		}
		private long getOutput60(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1354[input - 0x21];
			return 0;
		}
		private long getOutput61(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1355[input - 0x21];
			return 0;
		}
		private long getOutput62(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1356[input - 0x21];
			return 0;
		}
		private long getOutput63(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1357[input - 0x21];
			return 0;
		}
		private long getOutput64(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1358[input - 0x21];
			return 0;
		}
		private long getOutput65(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1359[input - 0x21];
			return 0;
		}
		private long getOutput66(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1360[input - 0x21];
			return 0;
		}
		private long getOutput67(int input) {
			if (input >= 0x21 && input <= 0x7E) return CommonSubtables.COMMON1361[input - 0x21];
			return 0;
		}
		private long getOutput68(int input) {
			if (input >= 0x21 && input <= 0x63) return CommonSubtables.COMMON1362[input - 0x21];
			return 0;
		}
		protected long getOutput(int state, int input) {
			switch (state) {
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
			default: return 0;
			}
		}
	}

	private static final class XJisX0212JavaCharsetEncoder extends TableCharsetEncoder {
		private XJisX0212JavaCharsetEncoder(Charset cs) {
			super(cs, 2f, 2f, new byte[]{34,68}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0xA1 && input <= 0x17E) return CommonSubtables.COMMON1363[input - 0xA1];
			if (input >= 0x1CD && input <= 0x1DC) return CommonSubtables.COMMON1364[input - 0x1CD];
			if (input >= 0x4E02 && input <= 0x4E9D) return CommonSubtables.COMMON1365[input - 0x4E02];
			if (input >= 0x4EAF && input <= 0x4F19) return CommonSubtables.COMMON1366[input - 0x4EAF];
			if (input >= 0x4F2E && input <= 0x4F9F) return CommonSubtables.COMMON1367[input - 0x4F2E];
			if (input >= 0x4FB2 && input <= 0x5166) return CommonSubtables.COMMON1368[input - 0x4FB2];
			if (input >= 0x517E && input <= 0x54CE) return CommonSubtables.COMMON1369[input - 0x517E];
			if (input >= 0x54E0 && input <= 0x5515) return CommonSubtables.COMMON1370[input - 0x54E0];
			if (input >= 0x552A && input <= 0x5566) return CommonSubtables.COMMON1371[input - 0x552A];
			if (input >= 0x557F && input <= 0x5619) return CommonSubtables.COMMON1372[input - 0x557F];
			if (input >= 0x562C && input <= 0x58F3) return CommonSubtables.COMMON1373[input - 0x562C];
			if (input >= 0x5905 && input <= 0x5A30) return CommonSubtables.COMMON1374[input - 0x5905];
			if (input >= 0x5A44 && input <= 0x5B96) return CommonSubtables.COMMON1375[input - 0x5A44];
			if (input >= 0x5BA8 && input <= 0x5C36) return CommonSubtables.COMMON1376[input - 0x5BA8];
			if (input >= 0x5C59 && input <= 0x5E8E) return CommonSubtables.COMMON1377[input - 0x5C59];
			if (input >= 0x5EA2 && input <= 0x5EEB) return CommonSubtables.COMMON1378[input - 0x5EA2];
			if (input >= 0x5F02 && input <= 0x6149) return CommonSubtables.COMMON1379[input - 0x5F02];
			if (input >= 0x615E && input <= 0x61EF) return CommonSubtables.COMMON1380[input - 0x615E];
			if (input >= 0x6201 && input <= 0x6290) return CommonSubtables.COMMON1381[input - 0x6201];
			if (input >= 0x62A6 && input <= 0x679B) return CommonSubtables.COMMON1382[input - 0x62A6];
			if (input >= 0x67B0 && input <= 0x67F9) return CommonSubtables.COMMON1383[input - 0x67B0];
			if (input >= 0x6814 && input <= 0x6917) return CommonSubtables.COMMON1384[input - 0x6814];
			if (input >= 0x6931 && input <= 0x6B85) return CommonSubtables.COMMON1385[input - 0x6931];
			if (input >= 0x6B97 && input <= 0x6D3F) return CommonSubtables.COMMON1386[input - 0x6B97];
			if (input >= 0x6D57 && input <= 0x6D98) return CommonSubtables.COMMON1387[input - 0x6D57];
			if (input >= 0x6DAA && input <= 0x6E04) return CommonSubtables.COMMON1388[input - 0x6DAA];
			if (input >= 0x6E1E && input <= 0x6ECF) return CommonSubtables.COMMON1389[input - 0x6E1E];
			if (input >= 0x6EEB && input <= 0x6F3C) return CommonSubtables.COMMON1390[input - 0x6EEB];
			if (input >= 0x6F4F && input <= 0x70B7) return CommonSubtables.COMMON1391[input - 0x6F4F];
			if (input >= 0x70FA && input <= 0x71DC) return CommonSubtables.COMMON1392[input - 0x70FA];
			if (input >= 0x71F8 && input <= 0x7E9E) return CommonSubtables.COMMON1393[input - 0x71F8];
			if (input >= 0x7F3B && input <= 0x8044) return CommonSubtables.COMMON1394[input - 0x7F3B];
			if (input >= 0x8060 && input <= 0x8357) return CommonSubtables.COMMON1395[input - 0x8060];
			if (input >= 0x8370 && input <= 0x8419) return CommonSubtables.COMMON1396[input - 0x8370];
			if (input >= 0x842F && input <= 0x86E7) return CommonSubtables.COMMON1397[input - 0x842F];
			if (input >= 0x86FA && input <= 0x8880) return CommonSubtables.COMMON1398[input - 0x86FA];
			if (input >= 0x8898 && input <= 0x89BC) return CommonSubtables.COMMON1399[input - 0x8898];
			if (input >= 0x89D4 && input <= 0x8B9F) return CommonSubtables.COMMON1400[input - 0x89D4];
			if (input >= 0x8C38 && input <= 0x8CA4) return CommonSubtables.COMMON1401[input - 0x8C38];
			if (input >= 0x8CB9 && input <= 0x8D1B) return CommonSubtables.COMMON1402[input - 0x8CB9];
			if (input >= 0x8D65 && input <= 0x8F65) return CommonSubtables.COMMON1403[input - 0x8D65];
			if (input >= 0x8F9D && input <= 0x9484) return CommonSubtables.COMMON1404[input - 0x8F9D];
			if (input >= 0x9578 && input <= 0x95E6) return CommonSubtables.COMMON1405[input - 0x9578];
			if (input >= 0x961D && input <= 0x986C) return CommonSubtables.COMMON1406[input - 0x961D];
			if (input >= 0x98E1 && input <= 0x9960) return CommonSubtables.COMMON1407[input - 0x98E1];
			if (input >= 0x999B && input <= 0x9A5D) return CommonSubtables.COMMON1408[input - 0x999B];
			if (input >= 0x9AAA && input <= 0x9C7B) return CommonSubtables.COMMON1409[input - 0x9AAA];
			if (input >= 0x9CE6 && input <= 0x9E1D) return CommonSubtables.COMMON1410[input - 0x9CE6];
			if (input >= 0x9E7A && input <= 0x9F7D) return CommonSubtables.COMMON1411[input - 0x9E7A];
			switch (input) {
			case 0x1F5: return 0x392BL;
			case 0x2C7: return 0x3022L;
			case 0x2D8: return 0x2F22L;
			case 0x2D9: return 0x3222L;
			case 0x2DA: return 0x3622L;
			case 0x2DB: return 0x3522L;
			case 0x2DD: return 0x3322L;
			case 0x384: return 0x3822L;
			case 0x385: return 0x3922L;
			case 0x386: return 0x6126L;
			case 0x388: return 0x6226L;
			case 0x389: return 0x6326L;
			case 0x38A: return 0x6426L;
			case 0x38C: return 0x6726L;
			case 0x38E: return 0x6926L;
			case 0x38F: return 0x6C26L;
			case 0x390: return 0x7626L;
			case 0x3AA: return 0x6526L;
			case 0x3AB: return 0x6A26L;
			case 0x3AC: return 0x7126L;
			case 0x3AD: return 0x7226L;
			case 0x3AE: return 0x7326L;
			case 0x3AF: return 0x7426L;
			case 0x3B0: return 0x7B26L;
			case 0x3C2: return 0x7826L;
			case 0x3CA: return 0x7526L;
			case 0x3CB: return 0x7A26L;
			case 0x3CC: return 0x7726L;
			case 0x3CD: return 0x7926L;
			case 0x3CE: return 0x7C26L;
			case 0x402: return 0x4227L;
			case 0x403: return 0x4327L;
			case 0x404: return 0x4427L;
			case 0x405: return 0x4527L;
			case 0x406: return 0x4627L;
			case 0x407: return 0x4727L;
			case 0x408: return 0x4827L;
			case 0x409: return 0x4927L;
			case 0x40A: return 0x4A27L;
			case 0x40B: return 0x4B27L;
			case 0x40C: return 0x4C27L;
			case 0x40E: return 0x4D27L;
			case 0x40F: return 0x4E27L;
			case 0x452: return 0x7227L;
			case 0x453: return 0x7327L;
			case 0x454: return 0x7427L;
			case 0x455: return 0x7527L;
			case 0x456: return 0x7627L;
			case 0x457: return 0x7727L;
			case 0x458: return 0x7827L;
			case 0x459: return 0x7927L;
			case 0x45A: return 0x7A27L;
			case 0x45B: return 0x7B27L;
			case 0x45C: return 0x7C27L;
			case 0x45E: return 0x7D27L;
			case 0x45F: return 0x7E27L;
			case 0x2116: return 0x7122L;
			case 0x2122: return 0x6F22L;
			case 0x70CA: return 0x5849L;
			case 0x70D1: return 0x5949L;
			case 0x70D3: return 0x5A49L;
			case 0x70D4: return 0x5B49L;
			case 0x70D5: return 0x5C49L;
			case 0x70D6: return 0x5D49L;
			case 0x70D8: return 0x5E49L;
			case 0x70DC: return 0x5F49L;
			case 0x70E4: return 0x6049L;
			case 0x98AB: return 0x3A68L;
			case 0x98AD: return 0x3B68L;
			case 0x98AE: return 0x3C68L;
			case 0x98B0: return 0x3D68L;
			case 0x98B4: return 0x3E68L;
			case 0x98B7: return 0x3F68L;
			case 0x98B8: return 0x4068L;
			case 0x98BA: return 0x4168L;
			case 0x98BB: return 0x4268L;
			case 0x98BF: return 0x4368L;
			case 0x98C2: return 0x4468L;
			case 0x98C5: return 0x4568L;
			case 0x98C8: return 0x4668L;
			case 0x98CC: return 0x4768L;
			case 0x9F8F: return 0x586DL;
			case 0x9F90: return 0x596DL;
			case 0x9F91: return 0x5A6DL;
			case 0x9F92: return 0x5B6DL;
			case 0x9F94: return 0x5C6DL;
			case 0x9F96: return 0x5D6DL;
			case 0x9F97: return 0x5E6DL;
			case 0x9F9E: return 0x5F6DL;
			case 0x9FA1: return 0x606DL;
			case 0x9FA2: return 0x616DL;
			case 0x9FA3: return 0x626DL;
			case 0x9FA5: return 0x636DL;
			case 0xFF5E: return 0x3722L;
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
