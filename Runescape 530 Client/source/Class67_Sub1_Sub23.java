/* Class67_Sub1_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub23 extends Class67_Sub1
{
    public static int[] anIntArray4180 = new int[2];
    public static int anInt4181;
    public static int anInt4182 = -1;
    public static int anInt4183;
    public static short[] aShortArray4184;
    public static int anInt4185;
    public static Sprites aSprite_4186;
    public static int anInt4187;
    public static RSString aRSString_4188
	= Class134.method1914(")4a=", (byte) 97);
    public static int anInt4189;
    public static int anInt4190;
    
    public static void method726(int arg0, long arg1) {
	try {
	    anInt4185++;
	    if (arg1 > 0L && arg0 <= -104) {
		if (arg1 % 10L == 0L) {
		    Class55_Sub3_Sub1.method479(89, -1L + arg1);
		    Class55_Sub3_Sub1.method479(125, 1L);
		} else
		    Class55_Sub3_Sub1.method479(103, arg1);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("qa.C(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if ((arg2 ^ 0xffffffff) == -1)
	    aBoolean2839 = arg0.readByte((byte) 94) == 1;
	if (arg1 != true)
	    method727(-116);
	anInt4189++;
    }
    
    public static void method727(int arg0) {
	anIntArray4180 = null;
	aShortArray4184 = null;
	aRSString_4188 = null;
	aSprite_4186 = null;
	if (arg0 < 122)
	    method727(-44);
    }
    
    public static void method728(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	anInt4181++;
	int i = -39 / ((arg4 - -52) / 35);
	if ((Class67_Sub5_Sub4.anInt4512 ^ 0xffffffff) == -2)
	    Class30.aClass67_Sub5_Sub19Array704
		[Class55_Sub3.anInt2816 / 100]
		.method1006(Class116.anInt2190 + -8, Class75.anInt2726 - 8);
	if ((Class67_Sub5_Sub4.anInt4512 ^ 0xffffffff) == -3)
	    Class30.aClass67_Sub5_Sub19Array704
		[4 + Class55_Sub3.anInt2816 / 100]
		.method1006(-8 + Class116.anInt2190, Class75.anInt2726 - 8);
	Class84.method1445((byte) -20);
    }
    
    public int[] method611(int arg0, byte arg1) {
	if (arg1 != 55)
	    method611(-14, (byte) 16);
	anInt4183++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int[] is_0_ = this.method613(0, arg0, false);
	    int[] is_1_ = this.method613(1, arg0, false);
	    int[] is_2_ = this.method613(2, arg0, false);
	    for (int i = 0; i < Class67_Sub5_Sub7.anInt4569; i++) {
		int i_3_ = is_2_[i];
		if ((i_3_ ^ 0xffffffff) == -4097)
		    is[i] = is_0_[i];
		else if (i_3_ == 0)
		    is[i] = is_1_[i];
		else
		    is[i] = (is_0_[i] * i_3_ - -(is_1_[i] * (-i_3_ + 4096))
			     >> -439220020);
	    }
	}
	return is;
    }
    
    public Class67_Sub1_Sub23() {
	super(3, false);
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	int[][] is = aClass103_2830.method1551(arg1, 48);
	if (arg0 != true)
	    return null;
	if (aClass103_2830.aBoolean2030) {
	    int[] is_4_ = this.method613(2, arg1, false);
	    int[][] is_5_ = this.method609(arg1, false, 0);
	    int[][] is_6_ = this.method609(arg1, false, 1);
	    int[] is_7_ = is[0];
	    int[] is_8_ = is[1];
	    int[] is_9_ = is[2];
	    int[] is_10_ = is_5_[0];
	    int[] is_11_ = is_5_[1];
	    int[] is_12_ = is_5_[2];
	    int[] is_13_ = is_6_[0];
	    int[] is_14_ = is_6_[1];
	    int[] is_15_ = is_6_[2];
	    for (int i = 0; Class67_Sub5_Sub7.anInt4569 > i; i++) {
		int i_16_ = is_4_[i];
		if ((i_16_ ^ 0xffffffff) == -4097) {
		    is_7_[i] = is_10_[i];
		    is_8_[i] = is_11_[i];
		    is_9_[i] = is_12_[i];
		} else if ((i_16_ ^ 0xffffffff) == -1) {
		    is_7_[i] = is_13_[i];
		    is_8_[i] = is_14_[i];
		    is_9_[i] = is_15_[i];
		} else {
		    int i_17_ = -i_16_ + 4096;
		    is_7_[i]
			= i_17_ * is_13_[i] + is_10_[i] * i_16_ >> -1629087924;
		    is_8_[i]
			= i_17_ * is_14_[i] + i_16_ * is_11_[i] >> -733662900;
		    is_9_[i]
			= i_16_ * is_12_[i] + i_17_ * is_15_[i] >> -430085428;
		}
	    }
	}
	anInt4190++;
	return is;
    }
    
    public static Class36 method729(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null)
	    return null;
	for (int i = 0; i < class67_sub24.anInt3215; i++) {
	    Class36 class36 = class67_sub24.aClass36Array3229[i];
	    if ((class36.aLong785 >> 29 & 0x3L) == 2L
		&& class36.anInt765 == arg1 && class36.anInt777 == arg2)
		return class36;
	}
	return null;
    }
}
