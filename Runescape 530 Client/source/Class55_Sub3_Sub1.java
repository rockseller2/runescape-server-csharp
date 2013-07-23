/* Class55_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55_Sub3_Sub1 extends Class55_Sub3
{
    public static int anInt3802;
    public static int anInt3803;
    public static int anInt3804;
    public static int anInt3805;
    public static int anInt3806;
    public static RSString aRSString_3807
	= Class67_Sub1_Sub19.method706(160, (byte) 120);
    public static int anInt3808;
    public static RSString aRSString_3809;
    public static Class9 aClass9_3810;
    public static Class9 aClass9_3811;
    public static RSString aRSString_3812
	= Class134.method1914("Take", (byte) 103);
    public static int anInt3813;
    public static RSString aRSString_3814;
    
    public static void method477(Class9 arg0, Class9 arg1, byte arg2) {
	try {
	    Class89.aClass9_1832 = arg0;
	    int i = -10 + (int) (21.0 * Math.random());
	    anInt3804++;
	    Class90.aClass9_1846 = arg1;
	    Class90.aClass9_1846.method135(34, arg2 ^ 0x8);
	    int i_0_ = -20 + (int) (41.0 * Math.random());
	    if (arg2 != -103)
		aClass9_3811 = null;
	    Class57.anInt1110 = i + i_0_;
	    int i_1_ = -10 + (int) (Math.random() * 21.0);
	    Class67_Sub5_Sub14.anInt4735 = i_1_ - -i_0_;
	    int i_2_ = (int) (21.0 * Math.random()) + -10;
	    Class33_Sub2.anInt2784 = i_0_ + i_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("kh.I("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method478(int arg0, int arg1, int arg2, int arg3,
				 byte arg4) {
	Class55_Sub2.anInt2801 = arg1;
	if (arg4 != -52)
	    aClass9_3810 = null;
	Class139.anInt2533 = arg2;
	Class126_Sub1.anInt3423 = arg0;
	OutputStream_Sub1.anInt87 = arg3;
	anInt3802++;
    }
    
    public static void method479(int arg0, long arg1) {
	try {
	    if (arg0 >= 57) {
		anInt3808++;
		try {
		    Thread.sleep(arg1);
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("kh.J(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method480(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	anInt3805++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg1, false, 8);
	class67_sub5_sub3.method846(true);
	class67_sub5_sub3.anInt4495 = arg4;
	class67_sub5_sub3.anInt4500 = arg3;
	class67_sub5_sub3.anInt4491 = arg2;
	int i = 85 % ((arg0 - 72) / 50);
    }
    
    public static void method481(int arg0) {
	aClass9_3810 = null;
	aClass9_3811 = null;
	aRSString_3814 = null;
	aRSString_3807 = null;
	if (arg0 != 21)
	    aClass9_3811 = null;
	aRSString_3809 = null;
	aRSString_3812 = null;
    }
    
    static {
	aRSString_3809 = aRSString_3812;
	aRSString_3814 = Class134.method1914("Abbrechen", (byte) 97);
	anInt3813 = -1;
    }
}
