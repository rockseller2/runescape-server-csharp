/* Class67_Sub1_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub13 extends Class67_Sub1
{
    public static RSString aRSString_4016;
    public static int anInt4017;
    public int anInt4018;
    public static int anInt4019;
    public static int[] anIntArray4020 = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
    public static int anInt4021;
    public static int anInt4022;
    public static int anInt4023;
    public static int anInt4024;
    public static int anInt4025;
    public static int anInt4026;
    public int anInt4027 = 4;
    public static int anInt4028;
    public static int anInt4029;
    public static int anInt4030;
    public static int anInt4031;
    public static RSString aRSString_4032;
    public static int anInt4033;
    
    public static Class67_Sub5_Sub6 method672(int arg0) {
	anInt4033++;
	if (arg0 != 23410)
	    anInt4031 = -70;
	return Class114.aClass67_Sub5_Sub6_2155;
    }
    
    public static void method673(int arg0) {
	anInt4021++;
	Class67_Sub1_Sub5.aClass7ArrayArray3878
	    = new Class7[Class55_Sub3_Sub1.aClass9_3810.method107(21296)][];
	PacketParser.aBooleanArray2102
	    = new boolean[Class55_Sub3_Sub1.aClass9_3810.method107(21296)];
	if (arg0 != 12860)
	    method672(-108);
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4023++;
	if (arg1 != 55)
	    aRSString_4016 = null;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int i = Class67_Sub5_Sub7.anInt4569 / anInt4018;
	    int i_0_ = RuntimeException_Sub1.anInt2618 / anInt4027;
	    int[] is_1_;
	    if (i_0_ > 0) {
		int i_2_ = arg0 % i_0_;
		is_1_
		    = this.method613(0, (i_2_ * RuntimeException_Sub1.anInt2618
					 / i_0_), false);
	    } else
		is_1_ = this.method613(0, 0, false);
	    for (int i_3_ = 0; ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
				< (i_3_ ^ 0xffffffff)); i_3_++) {
		if (i <= 0)
		    is[i_3_] = is_1_[0];
		else {
		    int i_4_ = i_3_ % i;
		    is[i_3_] = is_1_[i_4_ * Class67_Sub5_Sub7.anInt4569 / i];
		}
	    }
	}
	return is;
    }
    
    public static void method674(byte arg0) {
	anInt4030++;
	Class57.aClass136_1108.method1921((byte) 63);
	Class67_Sub5_Sub11.aClass136_4669.method1921((byte) -96);
	if (arg0 < 85)
	    method672(-118);
    }
    
    public Class67_Sub1_Sub13() {
	super(1, false);
	anInt4018 = 4;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	int i = arg2;
	do {
	    if ((i ^ 0xffffffff) != -1) {
		if (i != 1)
		    break;
	    } else {
		anInt4018 = arg0.readByte((byte) -116);
		break;
	    }
	    anInt4027 = arg0.readByte((byte) -25);
	} while (false);
	anInt4022++;
	if (arg1 != true)
	    method673(-49);
    }
    
    public static void method675(boolean arg0) {
	aRSString_4016 = null;
	anIntArray4020 = null;
	if (arg0 == true)
	    aRSString_4032 = null;
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	anInt4029++;
	int[][] is = aClass103_2830.method1551(arg1, 68);
	if (arg0 != true)
	    return null;
	if (aClass103_2830.aBoolean2030) {
	    int i = Class67_Sub5_Sub7.anInt4569 / anInt4018;
	    int i_5_ = RuntimeException_Sub1.anInt2618 / anInt4027;
	    int[][] is_6_;
	    if (i_5_ > 0) {
		int i_7_ = arg1 % i_5_;
		is_6_ = this.method609((RuntimeException_Sub1.anInt2618 * i_7_
					/ i_5_),
				       !arg0, 0);
	    } else
		is_6_ = this.method609(0, false, 0);
	    int[] is_8_ = is_6_[0];
	    int[] is_9_ = is_6_[1];
	    int[] is_10_ = is_6_[2];
	    int[] is_11_ = is[0];
	    int[] is_12_ = is[1];
	    int[] is_13_ = is[2];
	    for (int i_14_ = 0;
		 ((i_14_ ^ 0xffffffff)
		  > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff));
		 i_14_++) {
		int i_15_;
		if ((i ^ 0xffffffff) < -1) {
		    int i_16_ = i_14_ % i;
		    i_15_ = Class67_Sub5_Sub7.anInt4569 * i_16_ / i;
		} else
		    i_15_ = 0;
		is_11_[i_14_] = is_8_[i_15_];
		is_12_[i_14_] = is_9_[i_15_];
		is_13_[i_14_] = is_10_[i_15_];
	    }
	}
	return is;
    }
    
    public static int method676(int arg0, int arg1) {
	anInt4028++;
	arg1 = (0x55555555 & arg1) - -(arg1 >>> -840824127 & 0x55555555);
	arg1 = ((~0x33333332 & arg1) >>> -961136766) + (arg1 & 0x33333333);
	arg1 = arg1 + (arg1 >>> -1058004732) & 0xf0f0f0f;
	arg1 += arg1 >>> 748974504;
	arg1 += arg1 >>> 1358631952;
	if (arg0 != 0)
	    aRSString_4016 = null;
	return arg1 & 0xff;
    }
    
    static {
	aRSString_4016 = Class134.method1914("::shiftclick", (byte) 80);
	anInt4025 = -8 + (int) (Math.random() * 17.0);
	anInt4017 = 0;
	anInt4019 = 0;
	aRSString_4032 = Class134.method1914("1", (byte) 112);
    }
}
