package com.kreative.charset.generated;

import com.kreative.charset.TableCharsetDecoder;
import com.kreative.charset.TableCharsetEncoder;
import java.nio.charset.Charset;

public class XIBM949Charset extends Charset {
	public XIBM949Charset() {
		super("x-IBM949", new String[]{});
	}

	public boolean contains(Charset cs) {
		return false;
	}

	public TableCharsetDecoder newDecoder() {
		return new XIBM949CharsetDecoder(this);
	}

	public TableCharsetEncoder newEncoder() {
		return new XIBM949CharsetEncoder(this);
	}

	private static final class XIBM949CharsetDecoder extends TableCharsetDecoder {
		private XIBM949CharsetDecoder(Charset cs) {
			super(cs, 1f, 1f, 2);
		}
		private int getNextState0(int input) {
			if (input >= 0x8F && input <= 0xAC) return input - 0x8F + 0x1;
			if (input >= 0xB0 && input <= 0xFE) return input - 0xB0 + 0x1F;
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
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7F) return input - 0x5D + 0x5D;
			switch (input) {
			case 0x5C: return 0x20A9L;
			case 0x80: return 0xA2L;
			case 0x81: return 0xACL;
			case 0x82: return 0x5CL;
			case 0x83: return 0x203EL;
			case 0x84: return 0xA6L;
			}
			return 0;
		}
		private long getOutput1(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE0BC;
			return 0;
		}
		private long getOutput2(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE11A;
			return 0;
		}
		private long getOutput3(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE178;
			return 0;
		}
		private long getOutput4(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE1D6;
			return 0;
		}
		private long getOutput5(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE234;
			return 0;
		}
		private long getOutput6(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE292;
			return 0;
		}
		private long getOutput7(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE2F0;
			return 0;
		}
		private long getOutput8(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE34E;
			return 0;
		}
		private long getOutput9(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE3AC;
			return 0;
		}
		private long getOutput10(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE40A;
			return 0;
		}
		private long getOutput11(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE468;
			return 0;
		}
		private long getOutput12(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON443[input - 0xA1];
			return 0;
		}
		private long getOutput13(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON444[input - 0xA1];
			return 0;
		}
		private long getOutput14(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON445[input - 0xA1];
			return 0;
		}
		private long getOutput15(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON446[input - 0xA1];
			return 0;
		}
		private long getOutput16(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON447[input - 0xA1];
			return 0;
		}
		private long getOutput17(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON448[input - 0xA1];
			return 0;
		}
		private long getOutput18(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON449[input - 0xA1];
			return 0;
		}
		private long getOutput19(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON450[input - 0xA1];
			return 0;
		}
		private long getOutput20(int input) {
			if (input >= 0xA1 && input <= 0xE5) return CommonSubtables.COMMON451[input - 0xA1];
			return 0;
		}
		private long getOutput21(int input) {
			if (input >= 0xA1 && input <= 0xDB) return input - 0xA1 + 0xFF01;
			if (input >= 0xDD && input <= 0xFD) return input - 0xDD + 0xFF3D;
			switch (input) {
			case 0xDC: return 0xFFE6L;
			case 0xFE: return 0xFFE3L;
			}
			return 0;
		}
		private long getOutput22(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0x3131;
			return 0;
		}
		private long getOutput23(int input) {
			if (input >= 0xC1 && input <= 0xD1) return input - 0xC1 + 0x391;
			if (input >= 0xA1 && input <= 0xB9) return CommonSubtables.COMMON276[input - 0xA1];
			if (input >= 0xE1 && input <= 0xF1) return input - 0xE1 + 0x3B1;
			switch (input) {
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
		private long getOutput24(int input) {
			if (input >= 0xA1 && input <= 0xE4) return CommonSubtables.COMMON277[input - 0xA1];
			return 0;
		}
		private long getOutput25(int input) {
			if (input >= 0xA1 && input <= 0xEF) return CommonSubtables.COMMON452[input - 0xA1];
			return 0;
		}
		private long getOutput26(int input) {
			if (input >= 0xB1 && input <= 0xCC) return input - 0xB1 + 0x3260;
			if (input >= 0xCD && input <= 0xE6) return input - 0xCD + 0x24D0;
			if (input >= 0xE7 && input <= 0xFE) return CommonSubtables.COMMON453[input - 0xE7];
			switch (input) {
			case 0xA1: return 0xC6L;
			case 0xA2: return 0xD0L;
			case 0xA3: return 0xAAL;
			case 0xA4: return 0x126L;
			case 0xA6: return 0x132L;
			case 0xA8: return 0x13FL;
			case 0xA9: return 0x141L;
			case 0xAA: return 0xD8L;
			case 0xAB: return 0x152L;
			case 0xAC: return 0xBAL;
			case 0xAD: return 0xDEL;
			case 0xAE: return 0x166L;
			case 0xAF: return 0x14AL;
			}
			return 0;
		}
		private long getOutput27(int input) {
			if (input >= 0xB1 && input <= 0xCC) return input - 0xB1 + 0x3200;
			if (input >= 0xA1 && input <= 0xB0) return CommonSubtables.COMMON454[input - 0xA1];
			if (input >= 0xCD && input <= 0xE6) return input - 0xCD + 0x249C;
			if (input >= 0xE7 && input <= 0xFE) return CommonSubtables.COMMON278[input - 0xE7];
			return 0;
		}
		private long getOutput28(int input) {
			if (input >= 0xA1 && input <= 0xF3) return input - 0xA1 + 0x3041;
			return 0;
		}
		private long getOutput29(int input) {
			if (input >= 0xA1 && input <= 0xF6) return input - 0xA1 + 0x30A1;
			return 0;
		}
		private long getOutput30(int input) {
			if (input >= 0xA8 && input <= 0xC1) return input - 0xA8 + 0x416;
			if (input >= 0xD8 && input <= 0xF1) return input - 0xD8 + 0x436;
			switch (input) {
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
		private long getOutput31(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON455[input - 0xA1];
			return 0;
		}
		private long getOutput32(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON456[input - 0xA1];
			return 0;
		}
		private long getOutput33(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON457[input - 0xA1];
			return 0;
		}
		private long getOutput34(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON458[input - 0xA1];
			return 0;
		}
		private long getOutput35(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON459[input - 0xA1];
			return 0;
		}
		private long getOutput36(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON460[input - 0xA1];
			return 0;
		}
		private long getOutput37(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON461[input - 0xA1];
			return 0;
		}
		private long getOutput38(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON462[input - 0xA1];
			return 0;
		}
		private long getOutput39(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON463[input - 0xA1];
			return 0;
		}
		private long getOutput40(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON464[input - 0xA1];
			return 0;
		}
		private long getOutput41(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON465[input - 0xA1];
			return 0;
		}
		private long getOutput42(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON466[input - 0xA1];
			return 0;
		}
		private long getOutput43(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON467[input - 0xA1];
			return 0;
		}
		private long getOutput44(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON468[input - 0xA1];
			return 0;
		}
		private long getOutput45(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON469[input - 0xA1];
			return 0;
		}
		private long getOutput46(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON470[input - 0xA1];
			return 0;
		}
		private long getOutput47(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON471[input - 0xA1];
			return 0;
		}
		private long getOutput48(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON472[input - 0xA1];
			return 0;
		}
		private long getOutput49(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON473[input - 0xA1];
			return 0;
		}
		private long getOutput50(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON474[input - 0xA1];
			return 0;
		}
		private long getOutput51(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON475[input - 0xA1];
			return 0;
		}
		private long getOutput52(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON476[input - 0xA1];
			return 0;
		}
		private long getOutput53(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON477[input - 0xA1];
			return 0;
		}
		private long getOutput54(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON478[input - 0xA1];
			return 0;
		}
		private long getOutput55(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON479[input - 0xA1];
			return 0;
		}
		private long getOutput56(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE000;
			return 0;
		}
		private long getOutput57(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON480[input - 0xA1];
			return 0;
		}
		private long getOutput58(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON481[input - 0xA1];
			return 0;
		}
		private long getOutput59(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON482[input - 0xA1];
			return 0;
		}
		private long getOutput60(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON483[input - 0xA1];
			return 0;
		}
		private long getOutput61(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON484[input - 0xA1];
			return 0;
		}
		private long getOutput62(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON485[input - 0xA1];
			return 0;
		}
		private long getOutput63(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON486[input - 0xA1];
			return 0;
		}
		private long getOutput64(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON487[input - 0xA1];
			return 0;
		}
		private long getOutput65(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON488[input - 0xA1];
			return 0;
		}
		private long getOutput66(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON489[input - 0xA1];
			return 0;
		}
		private long getOutput67(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON490[input - 0xA1];
			return 0;
		}
		private long getOutput68(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON491[input - 0xA1];
			return 0;
		}
		private long getOutput69(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON492[input - 0xA1];
			return 0;
		}
		private long getOutput70(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON493[input - 0xA1];
			return 0;
		}
		private long getOutput71(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON494[input - 0xA1];
			return 0;
		}
		private long getOutput72(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON495[input - 0xA1];
			return 0;
		}
		private long getOutput73(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON496[input - 0xA1];
			return 0;
		}
		private long getOutput74(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON497[input - 0xA1];
			return 0;
		}
		private long getOutput75(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON498[input - 0xA1];
			return 0;
		}
		private long getOutput76(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON499[input - 0xA1];
			return 0;
		}
		private long getOutput77(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON500[input - 0xA1];
			return 0;
		}
		private long getOutput78(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON501[input - 0xA1];
			return 0;
		}
		private long getOutput79(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON502[input - 0xA1];
			return 0;
		}
		private long getOutput80(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON503[input - 0xA1];
			return 0;
		}
		private long getOutput81(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON504[input - 0xA1];
			return 0;
		}
		private long getOutput82(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON505[input - 0xA1];
			return 0;
		}
		private long getOutput83(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON506[input - 0xA1];
			return 0;
		}
		private long getOutput84(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON507[input - 0xA1];
			return 0;
		}
		private long getOutput85(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON508[input - 0xA1];
			return 0;
		}
		private long getOutput86(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON509[input - 0xA1];
			return 0;
		}
		private long getOutput87(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON510[input - 0xA1];
			return 0;
		}
		private long getOutput88(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON511[input - 0xA1];
			return 0;
		}
		private long getOutput89(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON512[input - 0xA1];
			return 0;
		}
		private long getOutput90(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON513[input - 0xA1];
			return 0;
		}
		private long getOutput91(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON514[input - 0xA1];
			return 0;
		}
		private long getOutput92(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON515[input - 0xA1];
			return 0;
		}
		private long getOutput93(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON516[input - 0xA1];
			return 0;
		}
		private long getOutput94(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON517[input - 0xA1];
			return 0;
		}
		private long getOutput95(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON518[input - 0xA1];
			return 0;
		}
		private long getOutput96(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON519[input - 0xA1];
			return 0;
		}
		private long getOutput97(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON520[input - 0xA1];
			return 0;
		}
		private long getOutput98(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON521[input - 0xA1];
			return 0;
		}
		private long getOutput99(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON522[input - 0xA1];
			return 0;
		}
		private long getOutput100(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON523[input - 0xA1];
			return 0;
		}
		private long getOutput101(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON524[input - 0xA1];
			return 0;
		}
		private long getOutput102(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON525[input - 0xA1];
			return 0;
		}
		private long getOutput103(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON526[input - 0xA1];
			return 0;
		}
		private long getOutput104(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON527[input - 0xA1];
			return 0;
		}
		private long getOutput105(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON528[input - 0xA1];
			return 0;
		}
		private long getOutput106(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON529[input - 0xA1];
			return 0;
		}
		private long getOutput107(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON530[input - 0xA1];
			return 0;
		}
		private long getOutput108(int input) {
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON531[input - 0xA1];
			return 0;
		}
		private long getOutput109(int input) {
			if (input >= 0xA1 && input <= 0xFE) return input - 0xA1 + 0xE05E;
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
			default: return 0;
			}
		}
	}

	private static final class XIBM949CharsetEncoder extends TableCharsetEncoder {
		private XIBM949CharsetEncoder(Charset cs) {
			super(cs, 1.98701f, 2f, new byte[]{63}, 1);
		}
		protected int getNextState(int state, int input) {
			return 0;
		}
		private long getOutput0(int input) {
			if (input >= 0x0 && input <= 0x1F) return CommonSubtables.ENCODE_ASCII_C0[input - 0x0];
			if (input >= 0x20 && input <= 0x5B) return input - 0x20 + 0x20;
			if (input >= 0x5D && input <= 0x7F) return input - 0x5D + 0x5D;
			if (input >= 0xA1 && input <= 0xFE) return CommonSubtables.COMMON532[input - 0xA1];
			if (input >= 0x391 && input <= 0x3C9) return CommonSubtables.COMMON533[input - 0x391];
			if (input >= 0x401 && input <= 0x451) return CommonSubtables.COMMON534[input - 0x401];
			if (input >= 0x2153 && input <= 0x2179) return CommonSubtables.COMMON535[input - 0x2153];
			if (input >= 0x2200 && input <= 0x223D) return CommonSubtables.COMMON536[input - 0x2200];
			if (input >= 0x2460 && input <= 0x2482) return CommonSubtables.COMMON537[input - 0x2460];
			if (input >= 0x249C && input <= 0x24B5) return CommonSubtables.COMMON538[input - 0x249C];
			if (input >= 0x24D0 && input <= 0x24E9) return CommonSubtables.COMMON539[input - 0x24D0];
			if (input >= 0x2500 && input <= 0x254B) return CommonSubtables.COMMON540[input - 0x2500];
			if (input >= 0x2592 && input <= 0x25D1) return CommonSubtables.COMMON541[input - 0x2592];
			if (input >= 0x3000 && input <= 0x301C) return CommonSubtables.COMMON542[input - 0x3000];
			if (input >= 0x3041 && input <= 0x30FB) return CommonSubtables.COMMON543[input - 0x3041];
			if (input >= 0x3131 && input <= 0x318E) return CommonSubtables.COMMON544[input - 0x3131];
			if (input >= 0x3200 && input <= 0x321C) return CommonSubtables.COMMON545[input - 0x3200];
			if (input >= 0x3260 && input <= 0x327F) return CommonSubtables.COMMON546[input - 0x3260];
			if (input >= 0x3380 && input <= 0x33DD) return CommonSubtables.COMMON547[input - 0x3380];
			if (input >= 0x4E00 && input <= 0x4F11) return CommonSubtables.COMMON548[input - 0x4E00];
			if (input >= 0x4F2F && input <= 0x5099) return CommonSubtables.COMMON549[input - 0x4F2F];
			if (input >= 0x50AC && input <= 0x52AB) return CommonSubtables.COMMON550[input - 0x50AC];
			if (input >= 0x52BE && input <= 0x5451) return CommonSubtables.COMMON551[input - 0x52BE];
			if (input >= 0x557B && input <= 0x55AE) return CommonSubtables.COMMON552[input - 0x557B];
			if (input >= 0x56A5 && input <= 0x57A3) return CommonSubtables.COMMON553[input - 0x56A5];
			if (input >= 0x57C3 && input <= 0x580A) return CommonSubtables.COMMON554[input - 0x57C3];
			if (input >= 0x581E && input <= 0x58FD) return CommonSubtables.COMMON555[input - 0x581E];
			if (input >= 0x590F && input <= 0x5A66) return CommonSubtables.COMMON556[input - 0x590F];
			if (input >= 0x5B2A && input <= 0x5C79) return CommonSubtables.COMMON557[input - 0x5B2A];
			if (input >= 0x5C8C && input <= 0x5CC0) return CommonSubtables.COMMON558[input - 0x5C8C];
			if (input >= 0x5CD9 && input <= 0x5D29) return CommonSubtables.COMMON559[input - 0x5CD9];
			if (input >= 0x5D9D && input <= 0x6070) return CommonSubtables.COMMON560[input - 0x5D9D];
			if (input >= 0x6085 && input <= 0x61CB) return CommonSubtables.COMMON561[input - 0x6085];
			if (input >= 0x61E6 && input <= 0x6258) return CommonSubtables.COMMON562[input - 0x61E6];
			if (input >= 0x626E && input <= 0x6311) return CommonSubtables.COMMON563[input - 0x626E];
			if (input >= 0x6367 && input <= 0x63AC) return CommonSubtables.COMMON564[input - 0x6367];
			if (input >= 0x6458 && input <= 0x6504) return CommonSubtables.COMMON565[input - 0x6458];
			if (input >= 0x6518 && input <= 0x679D) return CommonSubtables.COMMON566[input - 0x6518];
			if (input >= 0x67AF && input <= 0x67FE) return CommonSubtables.COMMON567[input - 0x67AF];
			if (input >= 0x6812 && input <= 0x6854) return CommonSubtables.COMMON568[input - 0x6812];
			if (input >= 0x686D && input <= 0x6912) return CommonSubtables.COMMON569[input - 0x686D];
			if (input >= 0x6927 && input <= 0x6979) return CommonSubtables.COMMON570[input - 0x6927];
			if (input >= 0x6994 && input <= 0x69D3) return CommonSubtables.COMMON571[input - 0x6994];
			if (input >= 0x69E8 && input <= 0x6A23) return CommonSubtables.COMMON572[input - 0x69E8];
			if (input >= 0x6A35 && input <= 0x6A6B) return CommonSubtables.COMMON573[input - 0x6A35];
			if (input >= 0x6A80 && input <= 0x6ADF) return CommonSubtables.COMMON574[input - 0x6A80];
			if (input >= 0x6AF6 && input <= 0x6BEC) return CommonSubtables.COMMON575[input - 0x6AF6];
			if (input >= 0x6C05 && input <= 0x6CF3) return CommonSubtables.COMMON576[input - 0x6C05];
			if (input >= 0x6D0B && input <= 0x6D41) return CommonSubtables.COMMON577[input - 0x6D0B];
			if (input >= 0x6D59 && input <= 0x6D95) return CommonSubtables.COMMON578[input - 0x6D59];
			if (input >= 0x6DAF && input <= 0x6DFB) return CommonSubtables.COMMON579[input - 0x6DAF];
			if (input >= 0x6E17 && input <= 0x6E7A) return CommonSubtables.COMMON580[input - 0x6E17];
			if (input >= 0x6E90 && input <= 0x6ED5) return CommonSubtables.COMMON581[input - 0x6E90];
			if (input >= 0x6EEF && input <= 0x70DF) return CommonSubtables.COMMON582[input - 0x6EEF];
			if (input >= 0x70F1 && input <= 0x7281) return CommonSubtables.COMMON583[input - 0x70F1];
			if (input >= 0x7296 && input <= 0x7812) return CommonSubtables.COMMON584[input - 0x7296];
			if (input >= 0x7825 && input <= 0x7991) return CommonSubtables.COMMON585[input - 0x7825];
			if (input >= 0x79A6 && input <= 0x79E9) return CommonSubtables.COMMON586[input - 0x79A6];
			if (input >= 0x79FB && input <= 0x7BE9) return CommonSubtables.COMMON587[input - 0x79FB];
			if (input >= 0x7C5F && input <= 0x7E9C) return CommonSubtables.COMMON588[input - 0x7C5F];
			if (input >= 0x7F6A && input <= 0x8018) return CommonSubtables.COMMON589[input - 0x7F6A];
			if (input >= 0x802D && input <= 0x82BF) return CommonSubtables.COMMON590[input - 0x802D];
			if (input >= 0x82D1 && input <= 0x8352) return CommonSubtables.COMMON591[input - 0x82D1];
			if (input >= 0x83BD && input <= 0x840E) return CommonSubtables.COMMON592[input - 0x83BD];
			if (input >= 0x8429 && input <= 0x847A) return CommonSubtables.COMMON593[input - 0x8429];
			if (input >= 0x8490 && input <= 0x84DA) return CommonSubtables.COMMON594[input - 0x8490];
			if (input >= 0x8511 && input <= 0x861A) return CommonSubtables.COMMON595[input - 0x8511];
			if (input >= 0x863F && input <= 0x86AA) return CommonSubtables.COMMON596[input - 0x863F];
			if (input >= 0x86C6 && input <= 0x871C) return CommonSubtables.COMMON597[input - 0x86C6];
			if (input >= 0x8734 && input <= 0x878D) return CommonSubtables.COMMON598[input - 0x8734];
			if (input >= 0x87E0 && input <= 0x8944) return CommonSubtables.COMMON599[input - 0x87E0];
			if (input >= 0x895F && input <= 0x89C0) return CommonSubtables.COMMON600[input - 0x895F];
			if (input >= 0x89D2 && input <= 0x8B9A) return CommonSubtables.COMMON601[input - 0x89D2];
			if (input >= 0x8C37 && input <= 0x8D16) return CommonSubtables.COMMON602[input - 0x8C37];
			if (input >= 0x8D64 && input <= 0x8DF3) return CommonSubtables.COMMON603[input - 0x8D64];
			if (input >= 0x8E0A && input <= 0x8E91) return CommonSubtables.COMMON604[input - 0x8E0A];
			if (input >= 0x8EC0 && input <= 0x8F64) return CommonSubtables.COMMON605[input - 0x8EC0];
			if (input >= 0x8F9B && input <= 0x8FD4) return CommonSubtables.COMMON606[input - 0x8F9B];
			if (input >= 0x8FE6 && input <= 0x90CA) return CommonSubtables.COMMON607[input - 0x8FE6];
			if (input >= 0x9149 && input <= 0x91F5) return CommonSubtables.COMMON608[input - 0x9149];
			if (input >= 0x92E4 && input <= 0x932F) return CommonSubtables.COMMON609[input - 0x92E4];
			if (input >= 0x9348 && input <= 0x93B0) return CommonSubtables.COMMON610[input - 0x9348];
			if (input >= 0x9577 && input <= 0x95E5) return CommonSubtables.COMMON611[input - 0x9577];
			if (input >= 0x961C && input <= 0x97AD) return CommonSubtables.COMMON612[input - 0x961C];
			if (input >= 0x97F3 && input <= 0x9870) return CommonSubtables.COMMON613[input - 0x97F3];
			if (input >= 0x98DB && input <= 0x9928) return CommonSubtables.COMMON614[input - 0x98DB];
			if (input >= 0x9996 && input <= 0x9A19) return CommonSubtables.COMMON615[input - 0x9996];
			if (input >= 0x9A2B && input <= 0x9A6A) return CommonSubtables.COMMON616[input - 0x9A2B];
			if (input >= 0x9B18 && input <= 0x9B5A) return CommonSubtables.COMMON617[input - 0x9B18];
			if (input >= 0x9E75 && input <= 0x9F20) return CommonSubtables.COMMON618[input - 0x9E75];
			if (input >= 0xAC00 && input <= 0xAC5C) return CommonSubtables.COMMON619[input - 0xAC00];
			if (input >= 0xAC70 && input <= 0xADA4) return CommonSubtables.COMMON620[input - 0xAC70];
			if (input >= 0xADB7 && input <= 0xAE14) return CommonSubtables.COMMON621[input - 0xADB7];
			if (input >= 0xAE27 && input <= 0xAE8C) return CommonSubtables.COMMON622[input - 0xAE27];
			if (input >= 0xAEBC && input <= 0xAF10) return CommonSubtables.COMMON623[input - 0xAEBC];
			if (input >= 0xAF2C && input <= 0xAF9C) return CommonSubtables.COMMON624[input - 0xAF2C];
			if (input >= 0xAFB2 && input <= 0xB028) return CommonSubtables.COMMON625[input - 0xAFB2];
			if (input >= 0xB07C && input <= 0xB0EC) return CommonSubtables.COMMON626[input - 0xB07C];
			if (input >= 0xB108 && input <= 0xB1B0) return CommonSubtables.COMMON627[input - 0xB108];
			if (input >= 0xB1CC && input <= 0xB220) return CommonSubtables.COMMON628[input - 0xB1CC];
			if (input >= 0xB258 && input <= 0xB31C) return CommonSubtables.COMMON629[input - 0xB258];
			if (input >= 0xB354 && input <= 0xB3AC) return CommonSubtables.COMMON630[input - 0xB354];
			if (input >= 0xB3C4 && input <= 0xB3E8) return CommonSubtables.COMMON631[input - 0xB3C4];
			if (input >= 0xB49D && input <= 0xB4F8) return CommonSubtables.COMMON632[input - 0xB49D];
			if (input >= 0xB514 && input <= 0xB568) return CommonSubtables.COMMON633[input - 0xB514];
			if (input >= 0xB5A0 && input <= 0xB5D8) return CommonSubtables.COMMON634[input - 0xB5A0];
			if (input >= 0xB728 && input <= 0xB7D0) return CommonSubtables.COMMON635[input - 0xB728];
			if (input >= 0xB7EC && input <= 0xB894) return CommonSubtables.COMMON636[input - 0xB7EC];
			if (input >= 0xB8A8 && input <= 0xB904) return CommonSubtables.COMMON637[input - 0xB8A8];
			if (input >= 0xB93C && input <= 0xB990) return CommonSubtables.COMMON638[input - 0xB93C];
			if (input >= 0xB9AC && input <= 0xBA1C) return CommonSubtables.COMMON639[input - 0xB9AC];
			if (input >= 0xBA38 && input <= 0xBA8C) return CommonSubtables.COMMON640[input - 0xBA38];
			if (input >= 0xBAA8 && input <= 0xBAE0) return CommonSubtables.COMMON641[input - 0xBAA8];
			if (input >= 0xBAFC && input <= 0xBB6C) return CommonSubtables.COMMON642[input - 0xBAFC];
			if (input >= 0xBBF8 && input <= 0xBC68) return CommonSubtables.COMMON643[input - 0xBBF8];
			if (input >= 0xBC84 && input <= 0xBCDC) return CommonSubtables.COMMON644[input - 0xBC84];
			if (input >= 0xBD80 && input <= 0xBDB8) return CommonSubtables.COMMON645[input - 0xBD80];
			if (input >= 0xBDD4 && input <= 0xBE28) return CommonSubtables.COMMON646[input - 0xBDD4];
			if (input >= 0xBE44 && input <= 0xBEB4) return CommonSubtables.COMMON647[input - 0xBE44];
			if (input >= 0xBED0 && input <= 0xBF24) return CommonSubtables.COMMON648[input - 0xBED0];
			if (input >= 0xC090 && input <= 0xC234) return CommonSubtables.COMMON649[input - 0xC090];
			if (input >= 0xC248 && input <= 0xC2C0) return CommonSubtables.COMMON650[input - 0xC248];
			if (input >= 0xC2DC && input <= 0xC330) return CommonSubtables.COMMON651[input - 0xC2DC];
			if (input >= 0xC368 && input <= 0xC3A0) return CommonSubtables.COMMON652[input - 0xC368];
			if (input >= 0xC4E9 && input <= 0xC7EC) return CommonSubtables.COMMON653[input - 0xC4E9];
			if (input >= 0xC800 && input <= 0xC854) return CommonSubtables.COMMON654[input - 0xC800];
			if (input >= 0xC870 && input <= 0xC918) return CommonSubtables.COMMON655[input - 0xC870];
			if (input >= 0xC950 && input <= 0xC9A4) return CommonSubtables.COMMON656[input - 0xC950];
			if (input >= 0xC9C0 && input <= 0xCA30) return CommonSubtables.COMMON657[input - 0xC9C0];
			if (input >= 0xCC0C && input <= 0xCC7C) return CommonSubtables.COMMON658[input - 0xCC0C];
			if (input >= 0xCC98 && input <= 0xCD40) return CommonSubtables.COMMON659[input - 0xCC98];
			if (input >= 0xCD5C && input <= 0xCDB0) return CommonSubtables.COMMON660[input - 0xCD5C];
			if (input >= 0xCDE8 && input <= 0xCE3C) return CommonSubtables.COMMON661[input - 0xCDE8];
			if (input >= 0xCE58 && input <= 0xCEAD) return CommonSubtables.COMMON662[input - 0xCE58];
			if (input >= 0xCEE4 && input <= 0xCF38) return CommonSubtables.COMMON663[input - 0xCEE4];
			if (input >= 0xCF54 && input <= 0xCFC4) return CommonSubtables.COMMON664[input - 0xCF54];
			if (input >= 0xD02D && input <= 0xD088) return CommonSubtables.COMMON665[input - 0xD02D];
			if (input >= 0xD0A4 && input <= 0xD0F8) return CommonSubtables.COMMON666[input - 0xD0A4];
			if (input >= 0xD130 && input <= 0xD188) return CommonSubtables.COMMON667[input - 0xD130];
			if (input >= 0xD277 && input <= 0xD345) return CommonSubtables.COMMON668[input - 0xD277];
			if (input >= 0xD37C && input <= 0xD408) return CommonSubtables.COMMON669[input - 0xD37C];
			if (input >= 0xD45C && input <= 0xD494) return CommonSubtables.COMMON670[input - 0xD45C];
			if (input >= 0xD4CC && input <= 0xD524) return CommonSubtables.COMMON671[input - 0xD4CC];
			if (input >= 0xD53C && input <= 0xD590) return CommonSubtables.COMMON672[input - 0xD53C];
			if (input >= 0xD5C8 && input <= 0xD79D) return CommonSubtables.COMMON673[input - 0xD5C8];
			if (input >= 0xE000 && input <= 0xE4CA) return CommonSubtables.COMMON674[input - 0xE000];
			if (input >= 0xF843 && input <= 0xF86E) return CommonSubtables.COMMON675[input - 0xF843];
			if (input >= 0xF900 && input <= 0xFA0B) return CommonSubtables.COMMON676[input - 0xF900];
			if (input >= 0xFF01 && input <= 0xFF5D) return CommonSubtables.COMMON677[input - 0xFF01];
			switch (input) {
			case 0x5C: return 0x82L;
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
			case 0x1C2: return 0xA69AL;
			case 0x2BA: return 0xAB9AL;
			case 0x2C7: return 0xA7A2L;
			case 0x2D0: return 0xB0A2L;
			case 0x2D8: return 0xA8A2L;
			case 0x2D9: return 0xABA2L;
			case 0x2DA: return 0xAAA2L;
			case 0x2DB: return 0xADA2L;
			case 0x2DC: return 0xA6A2L;
			case 0x2DD: return 0xA9A2L;
			case 0x2010: return 0xA9A1L;
			case 0x2014: return 0xAAA1L;
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
			case 0x203E: return 0x83L;
			case 0x2074: return 0xF9A9L;
			case 0x207F: return 0xFAA9L;
			case 0x2081: return 0xFBA9L;
			case 0x2082: return 0xFCA9L;
			case 0x2083: return 0xFDA9L;
			case 0x2084: return 0xFEA9L;
			case 0x20A9: return 0x5CL;
			case 0x2103: return 0xC9A1L;
			case 0x2109: return 0xB5A2L;
			case 0x2113: return 0xA4A7L;
			case 0x2116: return 0xE0A2L;
			case 0x2121: return 0xE5A2L;
			case 0x2122: return 0xE2A2L;
			case 0x2126: return 0xD9A7L;
			case 0x212A: return 0xA99AL;
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
			case 0x2266: return 0xA79AL;
			case 0x2267: return 0xA89AL;
			case 0x226A: return 0xECA1L;
			case 0x226B: return 0xEDA1L;
			case 0x2282: return 0xF8A1L;
			case 0x2283: return 0xF9A1L;
			case 0x2286: return 0xF6A1L;
			case 0x2287: return 0xF7A1L;
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
			case 0x5484: return 0xE69AL;
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
			case 0x54FD: return 0xB39AL;
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
			case 0x566A: return 0xB29DL;
			case 0x566B: return 0xEDFDL;
			case 0x566C: return 0xFE9BL;
			case 0x5674: return 0xC4DDL;
			case 0x5686: return 0xF7FCL;
			case 0x5A7F: return 0xA19CL;
			case 0x5A92: return 0xDAD8L;
			case 0x5A93: return 0xA59EL;
			case 0x5A9A: return 0xACDAL;
			case 0x5A9B: return 0xB0EAL;
			case 0x5AA4: return 0xB8E3L;
			case 0x5ABC: return 0xDE9CL;
			case 0x5ABD: return 0xB59BL;
			case 0x5ABE: return 0xC79AL;
			case 0x5AC1: return 0xAACAL;
			case 0x5AC2: return 0xF9E1L;
			case 0x5AC4: return 0xB1EAL;
			case 0x5AC9: return 0xECF2L;
			case 0x5ACC: return 0xEEFAL;
			case 0x5AD7: return 0xC89AL;
			case 0x5AE1: return 0xD5EEL;
			case 0x5AE6: return 0xF4F9L;
			case 0x5AE9: return 0xECD2L;
			case 0x5B05: return 0xFBFBL;
			case 0x5B09: return 0xF0FDL;
			case 0x5B0B: return 0xBDE0L;
			case 0x5B0C: return 0xE3CEL;
			case 0x5B16: return 0xC6F8L;
			case 0x5D4B: return 0xAEDAL;
			case 0x5D4C: return 0xEECAL;
			case 0x5D50: return 0xB9D5L;
			case 0x5D52: return 0xC39CL;
			case 0x5D69: return 0xA1E3L;
			case 0x5D6C: return 0xE3E8L;
			case 0x5D6F: return 0xABF3L;
			case 0x5D82: return 0xFD9CL;
			case 0x5D87: return 0xA9CFL;
			case 0x5D8B: return 0xF7D3L;
			case 0x632B: return 0xA9F1L;
			case 0x632F: return 0xC9F2L;
			case 0x6339: return 0xF19CL;
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
			case 0x7C00: return 0xC69DL;
			case 0x7C07: return 0xEAF0L;
			case 0x7C12: return 0xC2F3L;
			case 0x7C1E: return 0xAFD3L;
			case 0x7C21: return 0xDBCAL;
			case 0x7C27: return 0xD7FCL;
			case 0x7C2A: return 0xD8EDL;
			case 0x7C2B: return 0xC7E1L;
			case 0x7C37: return 0xCA9DL;
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
			case 0x7F58: return 0xDB9BL;
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
			case 0x879F: return 0xADD9L;
			case 0x87A2: return 0xABFBL;
			case 0x87AD: return 0xB19BL;
			case 0x87B3: return 0xD9D3L;
			case 0x87BA: return 0xA2D5L;
			case 0x87C0: return 0xAF9CL;
			case 0x87C4: return 0xDEF6L;
			case 0x87C7: return 0xB69BL;
			case 0x8EAA: return 0xF5D7L;
			case 0x8EAB: return 0xF3E3L;
			case 0x8EAC: return 0xE5CFL;
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
			case 0x9214: return 0xD09DL;
			case 0x9217: return 0xCDEBL;
			case 0x921E: return 0xB7D0L;
			case 0x9234: return 0xC2D6L;
			case 0x923A: return 0xADE8L;
			case 0x923F: return 0xAFEFL;
			case 0x9240: return 0xA5CBL;
			case 0x9245: return 0xE9CBL;
			case 0x9249: return 0xE8FAL;
			case 0x924B: return 0xEF9DL;
			case 0x9257: return 0xC6CCL;
			case 0x925B: return 0xE7E6L;
			case 0x925E: return 0xC7EAL;
			case 0x9262: return 0xA4DBL;
			case 0x9264: return 0xC9CFL;
			case 0x9265: return 0xFCE2L;
			case 0x9266: return 0xFAEFL;
			case 0x9278: return 0xC49AL;
			case 0x927E: return 0xC09BL;
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
			case 0x93C3: return 0xECF0L;
			case 0x93D1: return 0xEBEEL;
			case 0x93DD: return 0xB89BL;
			case 0x93DE: return 0xCBE9L;
			case 0x93E1: return 0xF0CCL;
			case 0x93E4: return 0xAFD7L;
			case 0x93F6: return 0xA1F3L;
			case 0x9404: return 0xF5FCL;
			case 0x9418: return 0xA4F1L;
			case 0x9419: return 0xEC9AL;
			case 0x9425: return 0xD6E0L;
			case 0x942B: return 0xB2EFL;
			case 0x9435: return 0xD1F4L;
			case 0x9438: return 0xA1F7L;
			case 0x9444: return 0xD1F1L;
			case 0x944A: return 0xA19EL;
			case 0x9451: return 0xFCCAL;
			case 0x9452: return 0xFDCAL;
			case 0x945B: return 0xCECEL;
			case 0x9460: return 0xF89BL;
			case 0x9462: return 0xF69AL;
			case 0x947D: return 0xC8F3L;
			case 0x947F: return 0xBAF3L;
			case 0x97C3: return 0xE19AL;
			case 0x97C6: return 0xC7F4L;
			case 0x97CB: return 0xDFEAL;
			case 0x97D3: return 0xDBF9L;
			case 0x97DC: return 0xB7D4L;
			case 0x98A8: return 0xA6F9L;
			case 0x98AF: return 0xBDDFL;
			case 0x98B1: return 0xC7F7L;
			case 0x98B6: return 0xCC9AL;
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
			case 0x995C: return 0xD89CL;
			case 0x9AA8: return 0xE9CDL;
			case 0x9AB8: return 0xB5FAL;
			case 0x9ABC: return 0xB19AL;
			case 0x9AC0: return 0xEC9BL;
			case 0x9ACF: return 0xAA9BL;
			case 0x9AD1: return 0xD49DL;
			case 0x9AD3: return 0xD0E2L;
			case 0x9AD4: return 0xF7F4L;
			case 0x9AD8: return 0xD4CDL;
			case 0x9AE3: return 0xCA9BL;
			case 0x9AE5: return 0xA3E7L;
			case 0x9AEE: return 0xA5DBL;
			case 0x9AF4: return 0xE39BL;
			case 0x9B6F: return 0xDBD6L;
			case 0x9B74: return 0xCB9BL;
			case 0x9B8E: return 0xC6EFL;
			case 0x9B91: return 0xEAF8L;
			case 0x9B92: return 0xDF9BL;
			case 0x9B9F: return 0xD5E4L;
			case 0x9BAB: return 0xF7CEL;
			case 0x9BAE: return 0xD8E0L;
			case 0x9BC9: return 0xEFD7L;
			case 0x9BD6: return 0xEDF4L;
			case 0x9BDB: return 0xB89DL;
			case 0x9BE4: return 0xE6CDL;
			case 0x9BE8: return 0xF4CCL;
			case 0x9C0D: return 0xE3F5L;
			case 0x9C10: return 0xCAE4L;
			case 0x9C12: return 0xE1DCL;
			case 0x9C13: return 0xFD9BL;
			case 0x9C15: return 0xC8F9L;
			case 0x9C25: return 0xBFFCL;
			case 0x9C2D: return 0xD49AL;
			case 0x9C2E: return 0xE09CL;
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
			case 0x9D07: return 0xD59BL;
			case 0x9D08: return 0xC09CL;
			case 0x9D09: return 0xBCE4L;
			case 0x9D1B: return 0xC4EAL;
			case 0x9D26: return 0xECE4L;
			case 0x9D28: return 0xE5E4L;
			case 0x9D3B: return 0xF8FBL;
			case 0x9D44: return 0xE59DL;
			case 0x9D51: return 0xBBCCL;
			case 0x9D5D: return 0xBDE4L;
			case 0x9D60: return 0xDCCDL;
			case 0x9D61: return 0xF7D9L;
			case 0x9D6C: return 0xDFDDL;
			case 0x9D72: return 0xCEEDL;
			case 0x9D89: return 0xB79CL;
			case 0x9DA9: return 0xD0D9L;
			case 0x9DAF: return 0xA3E5L;
			case 0x9DB4: return 0xCDF9L;
			case 0x9DBB: return 0xFE9DL;
			case 0x9DC4: return 0xAECDL;
			case 0x9DD7: return 0xCECFL;
			case 0x9DF2: return 0xAFF6L;
			case 0x9DF3: return 0xF69DL;
			case 0x9DF8: return 0xD3FDL;
			case 0x9DF9: return 0xEDEBL;
			case 0x9DFA: return 0xDCD6L;
			case 0x9E1A: return 0xA4E5L;
			case 0x9E1B: return 0xC39AL;
			case 0x9E1E: return 0xB6D5L;
			case 0x9F3B: return 0xACDEL;
			case 0x9F4A: return 0xBAF0L;
			case 0x9F4B: return 0xB1EEL;
			case 0x9F4E: return 0xB2EEL;
			case 0x9F52: return 0xCDF6L;
			case 0x9F5F: return 0xD2EEL;
			case 0x9F61: return 0xC6D6L;
			case 0x9F66: return 0xF09CL;
			case 0x9F67: return 0xE5E0L;
			case 0x9F6A: return 0xBBF3L;
			case 0x9F6C: return 0xE1E5L;
			case 0x9F77: return 0xCBE4L;
			case 0x9F8D: return 0xA3D7L;
			case 0x9F90: return 0xC2DBL;
			case 0x9F95: return 0xFECAL;
			case 0x9F9C: return 0xCFCFL;
			case 0xAEA0: return 0xC29EL;
			case 0xB044: return 0xF4B2L;
			case 0xB045: return 0xF5B2L;
			case 0xB048: return 0xF6B2L;
			case 0xB04A: return 0xF7B2L;
			case 0xB04C: return 0xF8B2L;
			case 0xB04E: return 0xF9B2L;
			case 0xB053: return 0xFAB2L;
			case 0xB054: return 0xFBB2L;
			case 0xB055: return 0xFCB2L;
			case 0xB057: return 0xFDB2L;
			case 0xB059: return 0xFEB2L;
			case 0xB05D: return 0xA1B3L;
			case 0xB060: return 0xD09EL;
			case 0xB233: return 0xDD9EL;
			case 0xB234: return 0xB3B4L;
			case 0xB23C: return 0xB4B4L;
			case 0xB331: return 0xE29EL;
			case 0xB338: return 0xE39EL;
			case 0xB3FC: return 0xC5B5L;
			case 0xB400: return 0xE89EL;
			case 0xB40F: return 0xE99EL;
			case 0xB410: return 0xC6B5L;
			case 0xB418: return 0xC7B5L;
			case 0xB41C: return 0xC8B5L;
			case 0xB420: return 0xC9B5L;
			case 0xB428: return 0xCAB5L;
			case 0xB429: return 0xCBB5L;
			case 0xB42B: return 0xCCB5L;
			case 0xB42C: return 0xEA9EL;
			case 0xB434: return 0xCDB5L;
			case 0xB450: return 0xCEB5L;
			case 0xB451: return 0xCFB5L;
			case 0xB454: return 0xD0B5L;
			case 0xB457: return 0xEB9EL;
			case 0xB458: return 0xD1B5L;
			case 0xB460: return 0xD2B5L;
			case 0xB461: return 0xD3B5L;
			case 0xB463: return 0xD4B5L;
			case 0xB465: return 0xD5B5L;
			case 0xB46C: return 0xD6B5L;
			case 0xB47F: return 0xEC9EL;
			case 0xB480: return 0xD7B5L;
			case 0xB488: return 0xD8B5L;
			case 0xB584: return 0xF59EL;
			case 0xB5EC: return 0xC6B6L;
			case 0xB5F4: return 0xF69EL;
			case 0xB610: return 0xC7B6L;
			case 0xB611: return 0xC8B6L;
			case 0xB614: return 0xC9B6L;
			case 0xB618: return 0xCAB6L;
			case 0xB625: return 0xCBB6L;
			case 0xB62C: return 0xCCB6L;
			case 0xB634: return 0xCDB6L;
			case 0xB648: return 0xCEB6L;
			case 0xB664: return 0xCFB6L;
			case 0xB668: return 0xD0B6L;
			case 0xB680: return 0xF79EL;
			case 0xB69C: return 0xD1B6L;
			case 0xB69D: return 0xD2B6L;
			case 0xB6A0: return 0xD3B6L;
			case 0xB6A4: return 0xD4B6L;
			case 0xB6AB: return 0xD5B6L;
			case 0xB6AC: return 0xD6B6L;
			case 0xB6B1: return 0xD7B6L;
			case 0xB6B8: return 0xF89EL;
			case 0xB6D4: return 0xD8B6L;
			case 0xB6F0: return 0xD9B6L;
			case 0xB6F4: return 0xDAB6L;
			case 0xB6F8: return 0xDBB6L;
			case 0xB700: return 0xDCB6L;
			case 0xB701: return 0xDDB6L;
			case 0xB705: return 0xDEB6L;
			case 0xB70C: return 0xF99EL;
			case 0xB917: return 0xFE9EL;
			case 0xB918: return 0xF0B7L;
			case 0xB920: return 0xF1B7L;
			case 0xBB88: return 0xBFB9L;
			case 0xBB8C: return 0xC0B9L;
			case 0xBB90: return 0xC1B9L;
			case 0xBBA4: return 0xC2B9L;
			case 0xBBA8: return 0xC3B9L;
			case 0xBBAC: return 0xC4B9L;
			case 0xBBB4: return 0xC5B9L;
			case 0xBBB7: return 0xC6B9L;
			case 0xBBC0: return 0xC7B9L;
			case 0xBBC1: return 0xAB9FL;
			case 0xBBC4: return 0xC8B9L;
			case 0xBBC8: return 0xC9B9L;
			case 0xBBD0: return 0xCAB9L;
			case 0xBBD3: return 0xCBB9L;
			case 0xBBD5: return 0xAC9FL;
			case 0xBBDC: return 0xAD9FL;
			case 0xBBE0: return 0xAE9FL;
			case 0xBCF4: return 0xB8BAL;
			case 0xBCF5: return 0xB9BAL;
			case 0xBCF6: return 0xBABAL;
			case 0xBCF8: return 0xBBBAL;
			case 0xBCFC: return 0xBCBAL;
			case 0xBD04: return 0xBDBAL;
			case 0xBD05: return 0xBEBAL;
			case 0xBD07: return 0xBFBAL;
			case 0xBD09: return 0xC0BAL;
			case 0xBD10: return 0xC1BAL;
			case 0xBD14: return 0xC2BAL;
			case 0xBD23: return 0xBB9FL;
			case 0xBD24: return 0xC3BAL;
			case 0xBD2C: return 0xC4BAL;
			case 0xBD40: return 0xC5BAL;
			case 0xBD48: return 0xC6BAL;
			case 0xBD49: return 0xC7BAL;
			case 0xBD4C: return 0xC8BAL;
			case 0xBD50: return 0xC9BAL;
			case 0xBD58: return 0xCABAL;
			case 0xBD59: return 0xCBBAL;
			case 0xBD64: return 0xCCBAL;
			case 0xBD68: return 0xCDBAL;
			case 0xBF40: return 0xC7BBL;
			case 0xBF41: return 0xC8BBL;
			case 0xBF44: return 0xC9BBL;
			case 0xBF48: return 0xCABBL;
			case 0xBF50: return 0xCBBBL;
			case 0xBF51: return 0xCCBBL;
			case 0xBF55: return 0xCDBBL;
			case 0xBF5C: return 0xC99FL;
			case 0xBF78: return 0xCA9FL;
			case 0xBF94: return 0xCEBBL;
			case 0xBFB0: return 0xCFBBL;
			case 0xBFC0: return 0xCB9FL;
			case 0xBFC5: return 0xD0BBL;
			case 0xBFCC: return 0xD1BBL;
			case 0xBFCD: return 0xD2BBL;
			case 0xBFD0: return 0xD3BBL;
			case 0xBFD4: return 0xD4BBL;
			case 0xBFD5: return 0xCC9FL;
			case 0xBFDC: return 0xD5BBL;
			case 0xBFDD: return 0xCD9FL;
			case 0xBFDF: return 0xD6BBL;
			case 0xBFE1: return 0xD7BBL;
			case 0xBFE8: return 0xCE9FL;
			case 0xC004: return 0xCF9FL;
			case 0xC020: return 0xD09FL;
			case 0xC03C: return 0xD8BBL;
			case 0xC051: return 0xD9BBL;
			case 0xC058: return 0xDABBL;
			case 0xC059: return 0xD19FL;
			case 0xC05C: return 0xDBBBL;
			case 0xC060: return 0xDCBBL;
			case 0xC068: return 0xDDBBL;
			case 0xC069: return 0xDEBBL;
			case 0xC074: return 0xD29FL;
			case 0xC343: return 0xE79FL;
			case 0xC345: return 0xE0BDL;
			case 0xC34C: return 0xE89FL;
			case 0xC3BC: return 0xED9FL;
			case 0xC3C0: return 0xEDBDL;
			case 0xC3D8: return 0xEEBDL;
			case 0xC3D9: return 0xEFBDL;
			case 0xC3DC: return 0xF0BDL;
			case 0xC3DF: return 0xF1BDL;
			case 0xC3E0: return 0xF2BDL;
			case 0xC3E2: return 0xF3BDL;
			case 0xC3E8: return 0xF4BDL;
			case 0xC3E9: return 0xF5BDL;
			case 0xC3ED: return 0xF6BDL;
			case 0xC3F4: return 0xF7BDL;
			case 0xC3F5: return 0xF8BDL;
			case 0xC3F8: return 0xF9BDL;
			case 0xC3FC: return 0xEE9FL;
			case 0xC408: return 0xFABDL;
			case 0xC410: return 0xFBBDL;
			case 0xC424: return 0xFCBDL;
			case 0xC42C: return 0xFDBDL;
			case 0xC430: return 0xFEBDL;
			case 0xC434: return 0xA1BEL;
			case 0xC43C: return 0xA2BEL;
			case 0xC43D: return 0xA3BEL;
			case 0xC43F: return 0xEF9FL;
			case 0xC448: return 0xA4BEL;
			case 0xC464: return 0xA5BEL;
			case 0xC465: return 0xA6BEL;
			case 0xC468: return 0xA7BEL;
			case 0xC46C: return 0xA8BEL;
			case 0xC474: return 0xA9BEL;
			case 0xC475: return 0xAABEL;
			case 0xC477: return 0xF09FL;
			case 0xC479: return 0xABBEL;
			case 0xC480: return 0xACBEL;
			case 0xC493: return 0xF19FL;
			case 0xC494: return 0xADBEL;
			case 0xC49C: return 0xAEBEL;
			case 0xC4B8: return 0xAFBEL;
			case 0xC4BC: return 0xB0BEL;
			case 0xC4D3: return 0xF29FL;
			case 0xC4D4: return 0xF39FL;
			case 0xC92B: return 0xB7A0L;
			case 0xC92C: return 0xE1C1L;
			case 0xC934: return 0xE2C1L;
			case 0xCA4C: return 0xBCC2L;
			case 0xCA4D: return 0xBDC2L;
			case 0xCA50: return 0xBEC2L;
			case 0xCA54: return 0xBFC2L;
			case 0xCA57: return 0xBCA0L;
			case 0xCA5C: return 0xC0C2L;
			case 0xCA5D: return 0xC1C2L;
			case 0xCA5F: return 0xC2C2L;
			case 0xCA60: return 0xC3C2L;
			case 0xCA61: return 0xC4C2L;
			case 0xCA68: return 0xC5C2L;
			case 0xCA70: return 0xBDA0L;
			case 0xCA7D: return 0xC6C2L;
			case 0xCA84: return 0xC7C2L;
			case 0xCA97: return 0xBEA0L;
			case 0xCA98: return 0xC8C2L;
			case 0xCAA0: return 0xBFA0L;
			case 0xCABC: return 0xC9C2L;
			case 0xCABD: return 0xCAC2L;
			case 0xCAC0: return 0xCBC2L;
			case 0xCAC4: return 0xCCC2L;
			case 0xCACC: return 0xCDC2L;
			case 0xCACD: return 0xCEC2L;
			case 0xCACF: return 0xCFC2L;
			case 0xCAD1: return 0xD0C2L;
			case 0xCAD2: return 0xC0A0L;
			case 0xCAD3: return 0xD1C2L;
			case 0xCAD8: return 0xD2C2L;
			case 0xCAD9: return 0xD3C2L;
			case 0xCAE0: return 0xD4C2L;
			case 0xCAEC: return 0xD5C2L;
			case 0xCAF4: return 0xD6C2L;
			case 0xCB08: return 0xD7C2L;
			case 0xCB10: return 0xD8C2L;
			case 0xCB14: return 0xD9C2L;
			case 0xCB18: return 0xDAC2L;
			case 0xCB20: return 0xDBC2L;
			case 0xCB21: return 0xDCC2L;
			case 0xCB2C: return 0xC1A0L;
			case 0xCB41: return 0xDDC2L;
			case 0xCB48: return 0xDEC2L;
			case 0xCB49: return 0xDFC2L;
			case 0xCB4C: return 0xE0C2L;
			case 0xCB50: return 0xE1C2L;
			case 0xCB58: return 0xE2C2L;
			case 0xCB59: return 0xE3C2L;
			case 0xCB5D: return 0xE4C2L;
			case 0xCB64: return 0xE5C2L;
			case 0xCB78: return 0xE6C2L;
			case 0xCB79: return 0xE7C2L;
			case 0xCB80: return 0xC2A0L;
			case 0xCB9C: return 0xE8C2L;
			case 0xCBB8: return 0xE9C2L;
			case 0xCBD4: return 0xEAC2L;
			case 0xCBE4: return 0xEBC2L;
			case 0xCBE5: return 0xC3A0L;
			case 0xCBE7: return 0xECC2L;
			case 0xCBE9: return 0xEDC2L;
			case 0xCBF0: return 0xC4A0L;
			case 0xCDC3: return 0xCFA0L;
			case 0xCDC4: return 0xE8C3L;
			case 0xCDCC: return 0xE9C3L;
			case 0xCDD0: return 0xEAC3L;
			case 0xCEC1: return 0xBEC4L;
			case 0xCEC8: return 0xD4A0L;
			case 0xCFE0: return 0xEDC4L;
			case 0xCFE1: return 0xEEC4L;
			case 0xCFE4: return 0xEFC4L;
			case 0xCFE8: return 0xF0C4L;
			case 0xCFF0: return 0xF1C4L;
			case 0xCFF1: return 0xF2C4L;
			case 0xCFF3: return 0xF3C4L;
			case 0xCFF5: return 0xF4C4L;
			case 0xCFFC: return 0xF5C4L;
			case 0xD000: return 0xF6C4L;
			case 0xD004: return 0xF7C4L;
			case 0xD011: return 0xF8C4L;
			case 0xD018: return 0xF9C4L;
			case 0xD10D: return 0xCCC5L;
			case 0xD114: return 0xDDA0L;
			case 0xD1A0: return 0xE4C5L;
			case 0xD1A1: return 0xE5C5L;
			case 0xD1A4: return 0xE6C5L;
			case 0xD1A8: return 0xE7C5L;
			case 0xD1B0: return 0xE8C5L;
			case 0xD1B1: return 0xE9C5L;
			case 0xD1B3: return 0xEAC5L;
			case 0xD1B5: return 0xEBC5L;
			case 0xD1BA: return 0xECC5L;
			case 0xD1BC: return 0xEDC5L;
			case 0xD1C0: return 0xEEC5L;
			case 0xD1D8: return 0xEFC5L;
			case 0xD1F4: return 0xF0C5L;
			case 0xD1F8: return 0xF1C5L;
			case 0xD207: return 0xF2C5L;
			case 0xD209: return 0xF3C5L;
			case 0xD210: return 0xF4C5L;
			case 0xD22C: return 0xF5C5L;
			case 0xD22D: return 0xF6C5L;
			case 0xD230: return 0xF7C5L;
			case 0xD234: return 0xF8C5L;
			case 0xD23C: return 0xF9C5L;
			case 0xD23D: return 0xFAC5L;
			case 0xD23F: return 0xFBC5L;
			case 0xD241: return 0xFCC5L;
			case 0xD248: return 0xFDC5L;
			case 0xD25C: return 0xFEC5L;
			case 0xD264: return 0xA1C6L;
			case 0xD359: return 0xE6A0L;
			case 0xD360: return 0xE7A0L;
			case 0xD41D: return 0xA2C7L;
			case 0xD424: return 0xEBA0L;
			case 0xD440: return 0xA3C7L;
			case 0xD444: return 0xA4C7L;
			case 0xD4A9: return 0xB5C7L;
			case 0xD4B0: return 0xECA0L;
			case 0xD5A5: return 0xE2C7L;
			case 0xD5AC: return 0xF7A0L;
			case 0xFFE0: return 0xCBA1L;
			case 0xFFE1: return 0xCCA1L;
			case 0xFFE2: return 0xFEA1L;
			case 0xFFE3: return 0xFEA3L;
			case 0xFFE4: return 0xAA9AL;
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
