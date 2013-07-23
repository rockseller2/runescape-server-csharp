/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class105
{
    public static RSString aRSString_2043;
    public static boolean aBoolean2044 = true;
    public static Class115 aClass115_2045;
    public static RSString aRSString_2046
	= Class134.method1914("Lade Texturen )2 ", (byte) 6);
    public static int anInt2047;
    public static RSString aRSString_2048
	= Class134.method1914("<img=0>", (byte) 26);
    public static int anInt2049;
    public Class67_Sub5[] aClass67_Sub5Array2050;
    public static int anInt2051;
    public static int anInt2052;
    public static RSString aRSString_2053
	= (Class134.method1914
	   ("You can(Wt add yourself to your own ignore list)3", (byte) 14));
    
    public static void method1564(byte arg0) {
	aRSString_2043 = null;
	aRSString_2053 = null;
	if (arg0 < 51)
	    aRSString_2053 = null;
	aRSString_2048 = null;
	aRSString_2046 = null;
	aClass115_2045 = null;
    }
    
    public static void method1565() {
	for (int i = 0; i < Canvas_Sub1.anInt62; i++) {
	    Class36 class36 = Class67_Sub1_Sub16_Sub1.aClass36Array5099[i];
	    Class67_Sub1_Sub2.method633(class36);
	    Class67_Sub1_Sub16_Sub1.aClass36Array5099[i] = null;
	}
	Canvas_Sub1.anInt62 = 0;
    }
    
    public static int method1566(int arg0, boolean arg1) {
	if (arg1 != true)
	    aBoolean2044 = true;
	anInt2051++;
	return arg0 & 0xff;
    }
    
    public static int method1567(int arg0, byte[] arg1, int arg2) {
	if (arg0 != 0)
	    method1566(85, false);
	anInt2047++;
	return Class67_Sub10.method1115(0, arg1, arg2, -128);
    }
    
    public Class105(int arg0) {
	aClass67_Sub5Array2050 = new Class67_Sub5[arg0];
	for (int i = 0; i < arg0; i++) {
	    Class67_Sub5 class67_sub5
		= aClass67_Sub5Array2050[i] = new Class67_Sub5();
	    class67_sub5.aClass67_Sub5_2861 = class67_sub5;
	    class67_sub5.aClass67_Sub5_2867 = class67_sub5;
	}
    }
    
    public static boolean method1568(int arg0, int arg1, int arg2, int arg3,
				     int arg4) {
	int i = arg3 * Class139.anInt2530 + arg0 * Class102.anInt2007 >> 16;
	int i_0_ = arg3 * Class102.anInt2007 - arg0 * Class139.anInt2530 >> 16;
	int i_1_ = arg1 * Class120.anInt2274 + i_0_ * Class106.anInt2054 >> 16;
	int i_2_ = arg1 * Class106.anInt2054 - i_0_ * Class120.anInt2274 >> 16;
	if (i_1_ < 1)
	    i_1_ = 1;
	int i_3_ = (i << 9) / i_1_;
	int i_4_ = (i_2_ << 9) / i_1_;
	int i_5_ = arg2 * Class120.anInt2274 + i_0_ * Class106.anInt2054 >> 16;
	int i_6_ = arg2 * Class106.anInt2054 - i_0_ * Class120.anInt2274 >> 16;
	if (i_5_ < 1)
	    i_5_ = 1;
	int i_7_ = (i << 9) / i_5_;
	int i_8_ = (i_6_ << 9) / i_5_;
	if (i_1_ < 50 && i_5_ < 50)
	    return false;
	if (i_1_ > arg4 && i_5_ > arg4)
	    return false;
	if (i_3_ < Class101.anInt1990 && i_7_ < Class101.anInt1990)
	    return false;
	if (i_3_ > Class67_Sub1_Sub34.anInt4336
	    && i_7_ > Class67_Sub1_Sub34.anInt4336)
	    return false;
	if (i_4_ < Applet_Sub1.anInt12 && i_8_ < Applet_Sub1.anInt12)
	    return false;
	if (i_4_ > Class49.anInt1011 && i_8_ > Class49.anInt1011)
	    return false;
	return true;
    }
    
    static {
	aRSString_2043 = aRSString_2053;
    }
}
