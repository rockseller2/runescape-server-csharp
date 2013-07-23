/* Class55_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55_Sub2_Sub1 extends Class55_Sub2
{
    public static RSString aRSString_3794;
    public static int[] anIntArray3795 = new int[100];
    public static int anInt3796;
    public static short[] aShortArray3797;
    public static int[] anIntArray3798;
    public static int anInt3799;
    public static RSString aRSString_3800;
    public static RSString aRSString_3801;
    
    public static Class104 method471(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null)
	    return null;
	Class104 class104 = class67_sub24.aClass104_3216;
	class67_sub24.aClass104_3216 = null;
	return class104;
    }
    
    public static void method472(int arg0) {
	if (arg0 != -17116)
	    aRSString_3801 = null;
	anIntArray3795 = null;
	aRSString_3794 = null;
	aRSString_3800 = null;
	aShortArray3797 = null;
	aRSString_3801 = null;
	anIntArray3798 = null;
    }
    
    public static void method473(Class67_Sub6 arg0, int arg1) {
	long l = 0L;
	if ((arg0.anInt2877 ^ 0xffffffff) == -1)
	    l = Class73.method1360(arg0.anInt2871, arg0.anInt2874,
				   arg0.anInt2891);
	if ((arg0.anInt2877 ^ 0xffffffff) == -2)
	    l = Class50.method444(arg0.anInt2871, arg0.anInt2874,
				  arg0.anInt2891);
	int i = -1;
	if (arg0.anInt2877 == 2)
	    l = Class63.method567(arg0.anInt2871, arg0.anInt2874,
				  arg0.anInt2891);
	anInt3799++;
	int i_0_ = arg1;
	int i_1_ = 0;
	if ((arg0.anInt2877 ^ 0xffffffff) == -4)
	    l = Class27.method253(arg0.anInt2871, arg0.anInt2874,
				  arg0.anInt2891);
	if ((l ^ 0xffffffffffffffffL) != -1L) {
	    i = (int) (l >>> 298583264) & 0x7fffffff;
	    i_0_ = (0x392d10 & (int) l) >> 1776823156;
	    i_1_ = (int) l >> -1889658674 & 0x1f;
	}
	arg0.anInt2879 = i_0_;
	arg0.anInt2881 = i_1_;
	arg0.anInt2888 = i;
    }
    
    static {
	aRSString_3794 = Class134.method1914("gelb:", (byte) 99);
	aRSString_3800 = Class134.method1914(":", (byte) 81);
	aShortArray3797 = new short[256];
	aRSString_3801 = Class134.method1914(")1o", (byte) 61);
    }
}
