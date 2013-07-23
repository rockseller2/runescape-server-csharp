/* Class67_Sub1_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub31 extends Class67_Sub1
{
    public static int[] anIntArray4279;
    public static int anInt4280;
    public static int anInt4281;
    public static RSString aRSString_4282;
    public static int anInt4283;
    public static int anInt4284;
    public static int anInt4285;
    public static int anInt4286;
    public static RSString aRSString_4287
	= Class134.method1914("<br>(X", (byte) 53);
    public static int anInt4288;
    public static int anInt4289;
    public static int anInt4290;
    public static int anInt4291;
    public static int anInt4292;
    public static int anInt4293;
    public static int anInt4294;
    public static int[][][] anIntArrayArrayArray4295;
    
    public static Class67_Sub22 method759(int arg0, int arg1, int arg2,
					  byte arg3) {
	anInt4294++;
	Class67_Sub22 class67_sub22 = new Class67_Sub22();
	class67_sub22.anInt3180 = arg0;
	class67_sub22.anInt3185 = arg1;
	if (arg3 < 78)
	    return null;
	Class67_Sub1_Sub33.aClass92_4325.method1488((byte) -89, class67_sub22,
						    (long) arg2);
	Class11.method141(arg1, 0);
	Class7 class7 = Class3.method69((byte) 110, arg2);
	if (class7 != null)
	    Class37.method326(class7, 90);
	if (Class16.aClass7_470 != null) {
	    Class37.method326(Class16.aClass7_470, 123);
	    Class16.aClass7_470 = null;
	}
	int i = Class134.anInt2476;
	for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (i ^ 0xffffffff); i_0_++) {
	    if (Class67_Sub1_Sub20.method714(29050,
					     Applet_Sub1.aShortArray21[i_0_]))
		Class67_Sub1_Sub37.method798(i_0_, false);
	}
	if ((Class134.anInt2476 ^ 0xffffffff) != -2) {
	    Class132.method1903(client.anInt2733, Class49.anInt1007,
				Class67_Sub16.anInt3084, 0, Class53.anInt1066);
	    int i_1_ = Class130.aClass67_Sub5_Sub10_2404
			   .method913(Class119.aRSString_2257);
	    for (int i_2_ = 0;
		 (Class134.anInt2476 ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		 i_2_++) {
		int i_3_ = Class130.aClass67_Sub5_Sub10_2404
			       .method913(Class64.method569(i_2_, (byte) 116));
		if (i_1_ < i_3_)
		    i_1_ = i_3_;
	    }
	    Class67_Sub16.anInt3084 = 8 + i_1_;
	    client.anInt2733
		= Class134.anInt2476 * 15 + (Class36.aBoolean771 ? 26 : 22);
	} else {
	    Class67_Sub9.aBoolean2980 = false;
	    Class132.method1903(client.anInt2733, Class49.anInt1007,
				Class67_Sub16.anInt3084, 0, Class53.anInt1066);
	}
	if (class7 != null)
	    Class67_Sub17.method1247(false, class7, 111);
	Stream.method1059(arg1, (byte) -89);
	if ((Class54.anInt1080 ^ 0xffffffff) != 0)
	    Class67_Sub1_Sub3.method634((byte) 89, Class54.anInt1080, 1);
	return class67_sub22;
    }
    
    public void method760(int arg0, int arg1, byte arg2) {
	anInt4283++;
	int i = Class67_Sub1_Sub35.anIntArray4344[arg0];
	int i_4_ = Class19.anIntArray490[arg1];
	if (arg2 >= -82)
	    anInt4289 = -102;
	float f = (float) Math.atan2((double) (i + -2048),
				     (double) (-2048 + i_4_));
	if (!((double) f >= -3.141592653589793)
	    || !((double) f <= -2.356194490192345)) {
	    if (!((double) f <= -1.5707963267948966)
		|| !((double) f >= -2.356194490192345)) {
		if ((double) f <= -0.7853981633974483
		    && (double) f >= -1.5707963267948966) {
		    Class67_Sub10.anInt3020 = arg0;
		    Class67_Sub1_Sub15.anInt4062
			= Class67_Sub5_Sub7.anInt4569 - arg1;
		} else if (!(f <= 0.0F)
			   || !((double) f >= -0.7853981633974483)) {
		    if (f >= 0.0F && (double) f <= 0.7853981633974483) {
			Class67_Sub1_Sub15.anInt4062
			    = Class67_Sub5_Sub7.anInt4569 - arg0;
			Class67_Sub10.anInt3020
			    = RuntimeException_Sub1.anInt2618 - arg1;
		    } else if (!((double) f >= 0.7853981633974483)
			       || !((double) f <= 1.5707963267948966)) {
			if (!((double) f >= 1.5707963267948966)
			    || !((double) f <= 2.356194490192345)) {
			    if ((double) f >= 2.356194490192345
				&& (double) f <= 3.141592653589793) {
				Class67_Sub1_Sub15.anInt4062
				    = Class67_Sub5_Sub7.anInt4569 + -arg0;
				Class67_Sub10.anInt3020 = arg1;
			    }
			} else {
			    Class67_Sub1_Sub15.anInt4062 = arg1;
			    Class67_Sub10.anInt3020
				= RuntimeException_Sub1.anInt2618 + -arg0;
			}
		    } else {
			Class67_Sub1_Sub15.anInt4062
			    = -arg1 + Class67_Sub5_Sub7.anInt4569;
			Class67_Sub10.anInt3020
			    = RuntimeException_Sub1.anInt2618 + -arg0;
		    }
		} else {
		    Class67_Sub10.anInt3020
			= -arg1 + RuntimeException_Sub1.anInt2618;
		    Class67_Sub1_Sub15.anInt4062 = arg0;
		}
	    } else {
		Class67_Sub1_Sub15.anInt4062 = arg1;
		Class67_Sub10.anInt3020 = arg0;
	    }
	} else {
	    Class67_Sub1_Sub15.anInt4062 = arg0;
	    Class67_Sub10.anInt3020 = arg1;
	}
	Class67_Sub1_Sub15.anInt4062 &= Class76.anInt1581;
	Class67_Sub10.anInt3020 &= Class67_Sub1_Sub36.anInt4381;
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	int[][] is = aClass103_2830.method1551(arg1, 98);
	anInt4286++;
	if (aClass103_2830.aBoolean2030) {
	    int[] is_5_ = is[0];
	    int[] is_6_ = is[2];
	    int[] is_7_ = is[1];
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff);
		 i++) {
		method760(i, arg1, (byte) -117);
		int[][] is_8_
		    = this.method609(Class67_Sub10.anInt3020, false, 0);
		is_5_[i] = is_8_[0][Class67_Sub1_Sub15.anInt4062];
		is_7_[i] = is_8_[1][Class67_Sub1_Sub15.anInt4062];
		is_6_[i] = is_8_[2][Class67_Sub1_Sub15.anInt4062];
	    }
	}
	if (arg0 != true)
	    method764(16);
	return is;
    }
    
    public static Class70_Sub1 method761(byte arg0) {
	if (arg0 <= 12)
	    aRSString_4282 = null;
	Class67_Sub5_Sub18.anInt4811 = 0;
	anInt4285++;
	return Class15.method165(-73);
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4284++;
	if (arg1 != 55)
	    aRSString_4287 = null;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    for (int i = 0; i < Class67_Sub5_Sub7.anInt4569; i++) {
		method760(i, arg0, (byte) -83);
		int[] is_9_
		    = this.method613(0, Class67_Sub10.anInt3020, false);
		is[i] = is_9_[Class67_Sub1_Sub15.anInt4062];
	    }
	}
	return is;
    }
    
    public static void method762(int arg0) {
	Class67_Sub1_Sub7.aClass136_3908.method1921((byte) -100);
	Class133.aClass136_2456.method1921((byte) 76);
	anInt4290++;
	Class131_Sub7_Sub2.aClass136_5073.method1921((byte) 60);
	if (arg0 != -15068)
	    method762(57);
    }
    
    public static void method763(int arg0) {
	anInt4291++;
	boolean bool = false;
	int i = -63 % ((25 - arg0) / 40);
	while (!bool) {
	    bool = true;
	    for (int i_10_ = 0;
		 (Class134.anInt2476 + -1 ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
		 i_10_++) {
		if ((Applet_Sub1.aShortArray21[i_10_] ^ 0xffffffff) > -1001
		    && Applet_Sub1.aShortArray21[i_10_ + 1] > 1000) {
		    bool = false;
		    RSString RSString = Class102.aRSStringArray1998[i_10_];
		    Class102.aRSStringArray1998[i_10_]
			= Class102.aRSStringArray1998[i_10_ + 1];
		    Class102.aRSStringArray1998[1 + i_10_] = RSString;
		    RSString RSString_11_ = Class8.aRSStringArray340[i_10_];
		    Class8.aRSStringArray340[i_10_]
			= Class8.aRSStringArray340[1 + i_10_];
		    Class8.aRSStringArray340[i_10_ + 1] = RSString_11_;
		    int i_12_ = Class88.anIntArray1822[i_10_];
		    Class88.anIntArray1822[i_10_]
			= Class88.anIntArray1822[i_10_ + 1];
		    Class88.anIntArray1822[i_10_ - -1] = i_12_;
		    i_12_ = Class131_Sub5.anIntArray3667[i_10_];
		    Class131_Sub5.anIntArray3667[i_10_]
			= Class131_Sub5.anIntArray3667[1 + i_10_];
		    Class131_Sub5.anIntArray3667[i_10_ - -1] = i_12_;
		    i_12_ = Class55_Sub2.anIntArray2802[i_10_];
		    Class55_Sub2.anIntArray2802[i_10_]
			= Class55_Sub2.anIntArray2802[1 + i_10_];
		    Class55_Sub2.anIntArray2802[i_10_ - -1] = i_12_;
		    short i_13_ = Applet_Sub1.aShortArray21[i_10_];
		    Applet_Sub1.aShortArray21[i_10_]
			= Applet_Sub1.aShortArray21[i_10_ - -1];
		    Applet_Sub1.aShortArray21[i_10_ - -1] = i_13_;
		    long l = Class115.aLongArray2188[i_10_];
		    Class115.aLongArray2188[i_10_]
			= Class115.aLongArray2188[1 + i_10_];
		    Class115.aLongArray2188[1 + i_10_] = l;
		}
	    }
	}
    }
    
    public static void method764(int arg0) {
	anIntArrayArrayArray4295 = null;
	if (arg0 != 0)
	    anIntArrayArrayArray4295 = null;
	anIntArray4279 = null;
	aRSString_4287 = null;
	aRSString_4282 = null;
    }
    
    public static int method765(int arg0, int arg1) {
	anInt4288++;
	arg1 = --arg1 | arg1 >>> 1352814817;
	arg1 |= arg1 >>> 620486914;
	arg1 |= arg1 >>> -102419772;
	if (arg0 < 109)
	    aRSString_4287 = null;
	arg1 |= arg1 >>> 1096884008;
	arg1 |= arg1 >>> -1262119600;
	return arg1 + 1;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if ((arg2 ^ 0xffffffff) == -1)
	    aBoolean2839 = arg0.readByte((byte) 83) == 1;
	if (arg1 != true)
	    method762(-11);
	anInt4280++;
    }
    
    public static void method766(int arg0, int arg1) {
	anInt4281++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg1, false, 10);
	if (arg0 != 2174)
	    method766(116, -50);
	class67_sub5_sub3.method844(0);
    }
    
    public Class67_Sub1_Sub31() {
	super(1, false);
    }
    
    static {
	anIntArray4279 = new int[128];
	aRSString_4282 = Class134.method1914(" )2> <col=ffffff>", (byte) 126);
    }
}
