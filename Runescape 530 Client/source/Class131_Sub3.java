public class Class131_Sub3 extends Class131
{
    public double aDouble3590;
    public Class61_Sub1 aClass61_Sub1_3591;
    public static RSString aRSString_3592
	= Class134.method1914("details", (byte) 2);
    public static int anInt3593;
    public int anInt3594;
    public int anInt3595;
    public static int anInt3596;
    public int anInt3597;
    public int anInt3598;
    public int anInt3599;
    public int anInt3600;
    public int anInt3601;
    public double aDouble3602;
    public static int anInt3603;
    public static int anInt3604;
    public boolean aBoolean3605 = false;
    public static int anInt3606;
    public static int anInt3607;
    public static RSString aRSString_3608
	= Class134.method1914("Connexion au serveur de mise -9 jour en cours",
			      (byte) 41);
    public static int anInt3609;
    public int anInt3610 = 0;
    public static int anInt3611;
    public double aDouble3612;
    public static int anInt3613;
    public static Class117 aClass117_3614;
    public int anInt3615;
    public int anInt3616;
    public double aDouble3617;
    public int anInt3618;
    public int anInt3619 = -32768;
    public double aDouble3620;
    public Class41 aClass41_3621;
    public static int anInt3622;
    public double aDouble3623;
    public static RSString aRSString_3624;
    public int anInt3625;
    public int anInt3626;
    public int anInt3627;
    public static int anInt3628;
    public static int anInt3629;
    public static int anInt3630 = -1;
    public int anInt3631;
    public int anInt3632;
    public double aDouble3633;
    public double aDouble3634;
    
    public void method1764(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8, int arg9,
			   Class61_Sub1 arg10) {
	Class131_Sub6 class131_sub6 = method1812(2047);
	anInt3622++;
	if (class131_sub6 != null) {
	    class131_sub6.method1764(arg0, arg1, arg2, arg3, arg4, arg5, arg6,
				     arg7, arg8, arg9, aClass61_Sub1_3591);
	    anInt3619 = class131_sub6.method1769();
	}
    }
    
    public static boolean method1806(Class9 arg0, int arg1, int arg2) {
	int i = -106 / ((arg2 - -43) / 44);
	byte[] is = arg0.method123(arg1, 126);
	anInt3613++;
	if (is == null)
	    return false;
	Class98.method1511((byte) 50, is);
	return true;
    }
    
    public void method1807(byte arg0, int arg1) {
	aBoolean3605 = true;
	aDouble3620 += (double) arg1 * aDouble3634;
	if ((anInt3594 ^ 0xffffffff) == 0)
	    aDouble3617 += (double) arg1 * aDouble3612;
	else {
	    aDouble3617
		+= ((double) arg1 * aDouble3612
		    + (double) arg1 * (0.5 * aDouble3623) * (double) arg1);
	    aDouble3612 += (double) arg1 * aDouble3623;
	}
	anInt3596++;
	aDouble3602 += (double) arg1 * aDouble3590;
	if (arg0 != 28)
	    method1812(47);
	anInt3595 = 0x7ff & 1024 + (int) (Math.atan2(aDouble3634, aDouble3590)
					  * 325.949);
	anInt3618
	    = 0x7ff & (int) (325.949 * Math.atan2(aDouble3612, aDouble3633));
	if (aClass41_3621 != null) {
	    anInt3616 += arg1;
	    while (anInt3616 > aClass41_3621.anIntArray880[anInt3610]) {
		anInt3616 -= aClass41_3621.anIntArray880[anInt3610];
		anInt3610++;
		if ((aClass41_3621.anIntArray855.length ^ 0xffffffff)
		    >= (anInt3610 ^ 0xffffffff)) {
		    anInt3610 -= aClass41_3621.anInt881;
		    if (anInt3610 < 0
			|| ((anInt3610 ^ 0xffffffff)
			    <= (aClass41_3621.anIntArray855.length
				^ 0xffffffff)))
			anInt3610 = 0;
		}
		anInt3632 = 1 + anInt3610;
		if (aClass41_3621.anIntArray855.length <= anInt3632) {
		    anInt3632 -= aClass41_3621.anInt881;
		    if ((anInt3632 ^ 0xffffffff) > -1
			|| ((aClass41_3621.anIntArray855.length ^ 0xffffffff)
			    >= (anInt3632 ^ 0xffffffff)))
			anInt3632 = -1;
		}
	    }
	}
    }
    
    public static void method1808(byte arg0) {
	aRSString_3624 = null;
	if (arg0 <= -34) {
	    aClass117_3614 = null;
	    aRSString_3592 = null;
	    aRSString_3608 = null;
	}
    }
    
    public static Class67_Sub5_Sub6 method1809(Stream arg0, byte arg1) {
	anInt3607++;
	Class67_Sub5_Sub6 class67_sub5_sub6
	    = new Class67_Sub5_Sub6(arg0.readRSString(-1), arg0.readRSString(-1),
				    arg0.readUShort(-2386),
				    arg0.readUShort(-2386),
				    arg0.readInt((byte) 125),
				    arg0.readByte((byte) 82) == 1,
				    arg0.readByte((byte) 103));
	int i = arg0.readByte((byte) -78);
	for (int i_0_ = 0; i > i_0_; i_0_++)
	    class67_sub5_sub6.aClass50_4554.method436
		(new Class67_Sub9(arg0.readUShort(-2386),
				  arg0.readUShort(-2386),
				  arg0.readUShort(-2386),
				  arg0.readUShort(-2386)),
		 false);
	if (arg1 >= -79)
	    method1806(null, -33, 94);
	class67_sub5_sub6.method867(0);
	return class67_sub5_sub6;
    }
    
    public static void method1810(int arg0, byte arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	anInt3604++;
	int i = arg5 + arg2;
	int i_1_ = -arg2 + arg4;
	int i_2_ = arg3 + arg2;
	int i_3_ = arg0 - arg2;
	for (int i_4_ = arg5; (i ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
	    Class67_Sub1_Sub11.method665(2, arg3,
					 (Class67_Sub29.anIntArrayArray3338
					  [i_4_]),
					 arg0, arg6);
	for (int i_5_ = arg4; (i_5_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff);
	     i_5_--)
	    Class67_Sub1_Sub11.method665(2, arg3,
					 (Class67_Sub29.anIntArrayArray3338
					  [i_5_]),
					 arg0, arg6);
	if (arg1 != -62)
	    method1806(null, 52, 23);
	for (int i_6_ = i; i_1_ >= i_6_; i_6_++) {
	    int[] is = Class67_Sub29.anIntArrayArray3338[i_6_];
	    Class67_Sub1_Sub11.method665(arg1 ^ ~0x3f, arg3, is, i_2_, arg6);
	    Class67_Sub1_Sub11.method665(2, i_3_, is, arg0, arg6);
	}
    }
    
    public void method1811(byte arg0, int arg1, int arg2, int arg3, int arg4) {
	anInt3629++;
	if (!aBoolean3605) {
	    double d = (double) (arg3 - anInt3631);
	    double d_7_ = (double) (arg1 + -anInt3597);
	    double d_8_ = Math.sqrt(d_7_ * d_7_ + d * d);
	    aDouble3617 = (double) anInt3600;
	    aDouble3602 = (double) anInt3598 * d / d_8_ + (double) anInt3631;
	    aDouble3620
		= (double) anInt3597 + d_7_ * (double) anInt3598 / d_8_;
	}
	double d = (double) (-arg4 + (1 + anInt3601));
	aDouble3634 = ((double) arg1 - aDouble3620) / d;
	aDouble3590 = ((double) arg3 - aDouble3602) / d;
	aDouble3633
	    = Math.sqrt(aDouble3590 * aDouble3590 + aDouble3634 * aDouble3634);
	if (anInt3594 != -1) {
	    if (!aBoolean3605)
		aDouble3612
		    = -aDouble3633 * Math.tan((double) anInt3594 * 0.02454369);
	    aDouble3623 = (((double) arg2 - aDouble3617 - aDouble3612 * d)
			   * 2.0 / (d * d));
	} else
	    aDouble3612 = ((double) arg2 - aDouble3617) / d;
	if (arg0 > -77)
	    anInt3598 = 19;
    }
    
    public void method1771(int arg0, int arg1, int arg2, int arg3, int arg4) {
	anInt3609++;
    }
    
    public Class131_Sub6 method1812(int arg0) {
	anInt3628++;
	Class81 class81 = Class67_Sub1.method622(-17177, anInt3615);
	Class131_Sub6 class131_sub6
	    = class81.method1428(anInt3632, (byte) -67, anInt3616, anInt3610);
	if (arg0 != 2047)
	    aClass61_Sub1_3591 = null;
	if (class131_sub6 == null)
	    return null;
	class131_sub6.method1847(anInt3618);
	return class131_sub6;
    }
    
    public int method1769() {
	anInt3593++;
	return anInt3619;
    }
    
    public static Class67_Sub5_Sub1 method1813(int arg0, int arg1) {
	anInt3611++;
	Class67_Sub5_Sub1 class67_sub5_sub1
	    = ((Class67_Sub5_Sub1)
	       Class67_Sub5_Sub16.aClass137_4764.method1930(261775,
							    (long) arg1));
	if (class67_sub5_sub1 != null)
	    return class67_sub5_sub1;
	byte[] is = Class11.aClass9_410.method138(-809612665, arg1, 26);
	class67_sub5_sub1 = new Class67_Sub5_Sub1();
	int i = 14 / ((arg0 - -6) / 62);
	if (is != null)
	    class67_sub5_sub1.method825(-1, new Stream(is));
	Class67_Sub5_Sub16.aClass137_4764.method1932((long) arg1, 0,
						     class67_sub5_sub1);
	return class67_sub5_sub1;
    }
    
    public Class131_Sub3(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8, int arg9,
			 int arg10) {
	anInt3616 = 0;
	anInt3632 = -1;
	anInt3598 = arg8;
	anInt3626 = arg5;
	anInt3597 = arg2;
	anInt3631 = arg3;
	aBoolean3605 = false;
	anInt3627 = arg1;
	anInt3615 = arg0;
	anInt3601 = arg6;
	anInt3600 = arg4;
	anInt3599 = arg9;
	anInt3625 = arg10;
	anInt3594 = arg7;
	int i = Class67_Sub1.method622(-17177, anInt3615).anInt1639;
	if (i == -1)
	    aClass41_3621 = null;
	else
	    aClass41_3621 = Class120.method1666(i, -32);
    }
    
    static {
	anInt3603 = 0;
	aRSString_3624 = Class134.method1914("sch-Utteln:", (byte) 108);
    }
}
