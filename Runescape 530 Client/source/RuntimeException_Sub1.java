/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RuntimeException_Sub1 extends RuntimeException
{
    public Throwable aThrowable2608;
    public static int anInt2609;
    public static int anInt2610;
    public static int anInt2611;
    public static int anInt2612;
    public static int anInt2613 = 0;
    public static int anInt2614;
    public static int anInt2615;
    public static int anInt2616;
    public static Class143 aClass143_2617;
    public static int anInt2618;
    public static RSString aRSString_2619;
    public static int anInt2620;
    public static int anInt2621 = 0;
    public static Class9 aClass9_2622;
    public static RSString[] aRSStringArray2623;
    public String aString2624;
    public static boolean aBoolean2625;
    public static int anInt2626;
    
    public static void method1969(int arg0, Class9 arg1) {
	if (arg0 >= 53) {
	    anInt2611++;
	    Class37.anInt791 = arg1.method126((byte) 103, Class3.aRSString_117);
	    Class24.anInt578 = arg1.method126((byte) 70, Class34.aRSString_739);
	}
    }
    
    public static void method1970(byte arg0, boolean arg1) {
	anInt2610++;
	int i = 63 / ((arg0 - 87) / 39);
	int i_0_ = 4;
	byte[][] is = Class67_Sub5_Sub11.aByteArrayArray4675;
	int i_1_ = is.length;
	for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
	    int i_3_ = (-Class58.baseX
			+ (Class108.anIntArray2083[i_2_] >> 233295656) * 64);
	    int i_4_ = (64 * (Class108.anIntArray2083[i_2_] & 0xff)
			- Class137.baseY);
	    byte[] is_5_ = is[i_2_];
	    if (is_5_ != null) {
		Class132.method1901(64);
		Class67_Sub1_Sub18.method702(i_4_, arg1,
					     8 * Canvas_Sub1.anInt64 - 48,
					     31375, i_3_, is_5_,
					     (Class67_Sub1_Sub11.anInt3992
					      + -6) * 8,
					     Class53.aClass73Array1059);
	    }
	}
	for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_6_++) {
	    int i_7_ = ((Class108.anIntArray2083[i_6_] >> 1450489704) * 64
			- Class58.baseX);
	    int i_8_ = (-Class137.baseY
			+ (0xff & Class108.anIntArray2083[i_6_]) * 64);
	    byte[] is_9_ = is[i_6_];
	    if (is_9_ == null && (Canvas_Sub1.anInt64 ^ 0xffffffff) > -801) {
		Class132.method1901(64);
		for (int i_10_ = 0; (i_0_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
		     i_10_++)
		    Class131_Sub7_Sub1.method1889(i_7_, 64, i_8_, (byte) 125,
						  64, i_10_);
	    }
	}
    }
    
    public static void method1971(boolean arg0) {
	aRSString_2619 = null;
	if (arg0 != true)
	    aClass143_2617 = null;
	aClass9_2622 = null;
	aClass143_2617 = null;
	aRSStringArray2623 = null;
    }
    
    public static void method1972(int arg0, int arg1) {
	anInt2620++;
	if (Class67_Sub5_Sub15.method977(arg1, false)) {
	    Class67_Sub1_Sub5.method641(-1, -1970,
					(Class67_Sub1_Sub5
					 .aClass7ArrayArray3878[arg1]));
	    if (arg0 != 4)
		anInt2618 = 101;
	}
    }
    
    public static void method1973(int arg0) {
	if (arg0 == 0) {
	    if (Class102.aRSString_1997 != null) {
		Class47.method419(-1, Class102.aRSString_1997);
		Class102.aRSString_1997 = null;
	    }
	    anInt2616++;
	}
    }
    
    public static int method1974(int arg0, int arg1, int arg2, int arg3) {
	anInt2615++;
	arg0 &= 0x3;
	if ((arg0 ^ 0xffffffff) == -1)
	    return arg3;
	if (arg0 == 1)
	    return arg2;
	if (arg0 == arg1)
	    return 7 + -arg3;
	return 7 - arg2;
    }
    
    public RuntimeException_Sub1(Throwable arg0, String arg1) {
	aString2624 = arg1;
	aThrowable2608 = arg0;
    }
    
    public static void method1975
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12) {
	if (arg8 == 6) {
	    anInt2612++;
	    Class67_Sub12 class67_sub12 = new Class67_Sub12();
	    class67_sub12.anInt3029 = arg2;
	    class67_sub12.anInt3030 = arg4;
	    class67_sub12.anInt3039 = arg1;
	    class67_sub12.anInt3035 = arg6;
	    class67_sub12.anInt3037 = arg0;
	    class67_sub12.anInt3040 = arg12;
	    class67_sub12.anInt3026 = arg7;
	    class67_sub12.anInt3031 = arg3;
	    class67_sub12.anInt3028 = arg10;
	    class67_sub12.anInt3038 = arg11;
	    class67_sub12.anInt3033 = arg9;
	    class67_sub12.anInt3034 = arg5;
	    Class67_Sub1_Sub19.aClass50_4128.method436(class67_sub12, false);
	}
    }
    
    static {
	aRSString_2619 = Class134.method1914(")2", (byte) 32);
	aClass143_2617 = new Class143();
	aRSStringArray2623 = new RSString[1000];
	aBoolean2625 = false;
	anInt2626 = 0;
    }
}
