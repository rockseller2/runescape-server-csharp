/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class51
{
    public static int anInt1036;
    public static int anInt1037;
    public static int anInt1038;
    public static RSString aRSString_1039
	= Class134.method1914("; version=1; path=)4; domain=", (byte) 8);
    public static int[] anIntArray1040;
    public static Class9 aClass9_1041;
    public static int anInt1042;
    public static int anInt1043;
    public static Class9 aClass9_1044;
    
    public static void method446(byte arg0) {
	if (arg0 != 56)
	    aClass9_1041 = null;
	aClass9_1041 = null;
	aClass9_1044 = null;
	anIntArray1040 = null;
	aRSString_1039 = null;
    }
    
    public static void method447(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	anInt1043++;
	int i = Class7.method97(arg2, OutputStream_Sub1.anInt87,
				Class55_Sub2.anInt2801, 65535);
	int i_0_ = Class7.method97(arg6, OutputStream_Sub1.anInt87,
				   Class55_Sub2.anInt2801, 65535);
	int i_1_ = Class7.method97(arg0, Class126_Sub1.anInt3423,
				   Class139.anInt2533, arg1 ^ 0xdd9a);
	int i_2_ = Class7.method97(arg5, Class126_Sub1.anInt3423,
				   Class139.anInt2533, 65535);
	int i_3_ = Class7.method97(arg2 - -arg3, OutputStream_Sub1.anInt87,
				   Class55_Sub2.anInt2801, 65535);
	int i_4_ = Class7.method97(arg6 - arg3, OutputStream_Sub1.anInt87,
				   Class55_Sub2.anInt2801, 65535);
	for (int i_5_ = i; i_3_ > i_5_; i_5_++)
	    Class67_Sub1_Sub11.method665(2, i_1_,
					 (Class67_Sub29.anIntArrayArray3338
					  [i_5_]),
					 i_2_, arg4);
	for (int i_6_ = i_0_; (i_4_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff);
	     i_6_--)
	    Class67_Sub1_Sub11.method665(arg1 + -8803, i_1_,
					 (Class67_Sub29.anIntArrayArray3338
					  [i_6_]),
					 i_2_, arg4);
	if (arg1 != 8805)
	    method448(-104, null);
	int i_7_ = Class7.method97(arg0 + arg3, Class126_Sub1.anInt3423,
				   Class139.anInt2533, arg1 ^ 0xdd9a);
	int i_8_ = Class7.method97(-arg3 + arg5, Class126_Sub1.anInt3423,
				   Class139.anInt2533, 65535);
	for (int i_9_ = i_3_; i_4_ >= i_9_; i_9_++) {
	    int[] is = Class67_Sub29.anIntArrayArray3338[i_9_];
	    Class67_Sub1_Sub11.method665(2, i_1_, is, i_7_, arg4);
	    Class67_Sub1_Sub11.method665(2, i_8_, is, i_2_, arg4);
	}
    }
    
    public static void method448(int arg0, Class9 arg1) {
	anInt1037++;
	Class4.aClass9_129 = arg1;
	if (arg0 != -17017)
	    anInt1036 = -115;
    }
}
