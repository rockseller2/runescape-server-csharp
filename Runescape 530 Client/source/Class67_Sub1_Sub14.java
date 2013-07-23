/* Class67_Sub1_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub14 extends Class67_Sub1
{
    public int[] anIntArray4034;
    public int[] anIntArray4035;
    public short[] aShortArray4036 = new short[257];
    public int anInt4037 = 0;
    public static int anInt4038;
    public static long aLong4039 = 0L;
    public static int anInt4040;
    public static int anInt4041;
    public static int anInt4042;
    public static int[] anIntArray4043;
    public static int anInt4044;
    public static Class67_Sub5_Sub7[] aClass67_Sub5_Sub7Array4045
	= new Class67_Sub5_Sub7[14];
    public static int anInt4046;
    public int[][] anIntArrayArray4047;
    
    public int[] method611(int arg0, byte arg1) {
	if (arg1 != 55)
	    method680(true);
	anInt4038++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int[] is_0_ = this.method613(0, arg0, false);
	    for (int i = 0; i < Class67_Sub5_Sub7.anInt4569; i++) {
		int i_1_ = is_0_[i] >> -1135956732;
		if ((i_1_ ^ 0xffffffff) > -1)
		    i_1_ = 0;
		if ((i_1_ ^ 0xffffffff) < -257)
		    i_1_ = 256;
		is[i] = aShortArray4036[i_1_];
	    }
	}
	return is;
    }
    
    public void method618(int arg0) {
	anInt4046++;
	int i = -94 % ((-60 - arg0) / 62);
	if (anIntArrayArray4047 == null)
	    anIntArrayArray4047 = new int[][] { new int[2], { 4096, 4096 } };
	if (anIntArrayArray4047.length < 2)
	    throw new RuntimeException
		      ("Curve operation requires at least two markers");
	if (anInt4037 == 2)
	    method677(-91);
	Class67_Sub1_Sub7.method645(-84);
	method679(17142);
    }
    
    public void method677(int arg0) {
	int[] is = anIntArrayArray4047[0];
	anInt4042++;
	int[] is_2_ = anIntArrayArray4047[1];
	if (arg0 <= -42) {
	    int[] is_3_ = anIntArrayArray4047[anIntArrayArray4047.length + -1];
	    int[] is_4_ = anIntArrayArray4047[-2 + anIntArrayArray4047.length];
	    anIntArray4034 = new int[] { is[0] + (is[0] + -is_2_[0]),
					 is[1] + (is[1] - is_2_[1]) };
	    anIntArray4035 = new int[] { is_4_[0] + is_4_[0] - is_3_[0],
					 -is_3_[1] + (is_4_[1] + is_4_[1]) };
	}
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if ((arg2 ^ 0xffffffff) == -1) {
	    anInt4037 = arg0.readByte((byte) -104);
	    anIntArrayArray4047 = new int[arg0.readByte((byte) -78)][2];
	    for (int i = 0;
		 (i ^ 0xffffffff) > (anIntArrayArray4047.length ^ 0xffffffff);
		 i++) {
		anIntArrayArray4047[i][0] = arg0.readUShort(-2386);
		anIntArrayArray4047[i][1] = arg0.readUShort(-2386);
	    }
	}
	anInt4044++;
	if (arg1 != true)
	    aShortArray4036 = null;
    }
    
    public int[] method678(int arg0, int arg1) {
	anInt4041++;
	if (arg0 >= -8)
	    anInt4037 = -21;
	if (arg1 < 0)
	    return anIntArray4034;
	if (arg1 >= anIntArrayArray4047.length)
	    return anIntArray4035;
	return anIntArrayArray4047[arg1];
    }
    
    public Class67_Sub1_Sub14() {
	super(1, true);
    }
    
    public void method679(int arg0) {
	if (arg0 == 17142) {
	    int i = anInt4037;
	while_114_:
	    do {
		do {
		    if (i != 2) {
			if ((i ^ 0xffffffff) != -2)
			    break;
		    } else {
			for (i = 0; (i ^ 0xffffffff) > -258; i++) {
			    int i_5_ = i << 856163108;
			    int i_6_;
			    for (i_6_ = 1; ((i_6_ ^ 0xffffffff)
					    > (-1 + anIntArrayArray4047.length
					       ^ 0xffffffff)); i_6_++) {
				if (anIntArrayArray4047[i_6_][0] > i_5_)
				    break;
			    }
			    int[] is = anIntArrayArray4047[i_6_ + -1];
			    int[] is_7_ = anIntArrayArray4047[i_6_];
			    int i_8_ = method678(-122, -2 + i_6_)[1];
			    int i_9_ = is[1];
			    int i_10_ = is_7_[1];
			    int i_11_ = method678(-105, 1 + i_6_)[1];
			    int i_12_ = ((i_5_ - is[0] << -818425716)
					 / (-is[0] + is_7_[0]));
			    int i_13_ = i_12_ * i_12_ >> -1392404436;
			    int i_14_ = i_11_ - (i_10_ + i_8_) + i_9_;
			    int i_15_ = -i_14_ + (i_8_ - i_9_);
			    int i_16_ = -i_8_ + i_10_;
			    int i_17_ = i_9_;
			    int i_18_ = ((i_12_ * i_14_ >> -544088756) * i_13_
					 >> -1127113172);
			    int i_19_ = i_15_ * i_13_ >> 1410165708;
			    int i_20_ = i_12_ * i_16_ >> -557924884;
			    int i_21_ = i_20_ + i_19_ + (i_18_ + i_17_);
			    if ((i_21_ ^ 0xffffffff) >= 32767)
				i_21_ = -32767;
			    if ((i_21_ ^ 0xffffffff) <= -32769)
				i_21_ = 32767;
			    aShortArray4036[i] = (short) i_21_;
			}
			break while_114_;
		    }
		    for (i = 0; i < 257; i++) {
			int i_22_ = i << 1723900164;
			int i_23_;
			for (i_23_ = 1;
			     i_23_ < -1 + anIntArrayArray4047.length;
			     i_23_++) {
			    if ((i_22_ ^ 0xffffffff)
				> (anIntArrayArray4047[i_23_][0] ^ 0xffffffff))
				break;
			}
			int[] is = anIntArrayArray4047[i_23_];
			int[] is_24_ = anIntArrayArray4047[-1 + i_23_];
			int i_25_ = ((i_22_ - is_24_[0] << 1575747916)
				     / (-is_24_[0] + is[0]));
			int i_26_ = (-(Class67_Sub3.anIntArray2845
				       [i_25_ >> -36327419 & 0xff]) + 4096
				     >> -1979328735);
			int i_27_ = 4096 + -i_26_;
			int i_28_
			    = is[1] * i_26_ + i_27_ * is_24_[1] >> 91595340;
			if ((i_28_ ^ 0xffffffff) >= 32767)
			    i_28_ = -32767;
			if ((i_28_ ^ 0xffffffff) <= -32769)
			    i_28_ = 32767;
			aShortArray4036[i] = (short) i_28_;
		    }
		    break while_114_;
		} while (false);
		for (i = 0; i < 257; i++) {
		    int i_29_ = i << -1737300828;
		    int i_30_;
		    for (i_30_ = 1; -1 + anIntArrayArray4047.length > i_30_;
			 i_30_++) {
			if (i_29_ < anIntArrayArray4047[i_30_][0])
			    break;
		    }
		    int[] is = anIntArrayArray4047[-1 + i_30_];
		    int[] is_31_ = anIntArrayArray4047[i_30_];
		    int i_32_
			= (i_29_ - is[0] << 1683573772) / (-is[0] + is_31_[0]);
		    int i_33_ = 4096 - i_32_;
		    int i_34_
			= is_31_[1] * i_32_ + i_33_ * is[1] >> -964246388;
		    if ((i_34_ ^ 0xffffffff) >= 32767)
			i_34_ = -32767;
		    if ((i_34_ ^ 0xffffffff) <= -32769)
			i_34_ = 32767;
		    aShortArray4036[i] = (short) i_34_;
		}
	    } while (false);
	    anInt4040++;
	}
    }
    
    public static void method680(boolean arg0) {
	if (arg0 != false)
	    method680(false);
	anIntArray4043 = null;
	aClass67_Sub5_Sub7Array4045 = null;
    }
    
    static {
	anIntArray4043 = new int[4096];
	for (int i = 0; (i ^ 0xffffffff) > -4097; i++)
	    anIntArray4043[i] = Class131_Sub4.method1816(i, (byte) -4);
    }
}
