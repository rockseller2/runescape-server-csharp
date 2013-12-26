/* Class55_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55_Sub3 extends Class55
{
    public static int anInt2807;
    public static boolean aBoolean2808 = true;
    public static Class67_Sub5_Sub6 aClass67_Sub5_Sub6_2809;
    public static int[] anIntArray2810;
    public static int anInt2811;
    public static int anInt2812;
    public static int anInt2813;
    public static int anInt2814;
    public static int anInt2815;
    public static int anInt2816;
    
    public static void method474(byte arg0, int arg1, int arg2) {
	anInt2814++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg2, false, 5);
	class67_sub5_sub3.method846(true);
	if (arg0 == -119)
	    class67_sub5_sub3.anInt4491 = arg1;
    }
    
    public static void method475(byte arg0) {
	aClass67_Sub5_Sub6_2809 = null;
	if (arg0 <= -106)
	    anIntArray2810 = null;
    }
    
    public static void method476(byte arg0, boolean arg1) {
	anInt2813++;
	int i = -7 / ((arg0 - 10) / 42);
	byte[][] is = Class67_Sub16.aByteArrayArray3087;
	int i_0_ = 4;
	for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
	    Class132.method1901(64);
	    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -14; i_2_++) {
		for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -14; i_3_++) {
		    int i_4_
			= Class5.anIntArrayArrayArray136[i_1_][i_2_][i_3_];
		    if (i_4_ != -1) {
			int i_5_ = i_4_ >> 1501757208 & 0x3;
			if (!arg1 || i_5_ == 0) {
			    int i_6_ = (i_4_ & 0x7) >> 1499140097;
			    int i_7_ = (i_4_ & 0xfff648) >> 1527377326;
			    int i_8_ = i_4_ >> -277864285 & 0x7ff;
			    int i_9_ = i_8_ / 8 + (i_7_ / 8 << -717854424);
			    for (int i_10_ = 0;
				 ((i_10_ ^ 0xffffffff)
				  > (Class108.anIntArray2083.length
				     ^ 0xffffffff));
				 i_10_++) {
				if (i_9_ == Class108.anIntArray2083[i_10_]
				    && is[i_10_] != null) {
				    Class99_Sub1.method1529
					(i_2_ * 8, 8 * (i_7_ & 0x7),
					 Class53.aClass73Array1059,
					 (byte) -125, i_6_, i_5_, is[i_10_],
					 i_3_ * 8, arg1, i_1_,
					 8 * (i_8_ & 0x7));
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static {
	anInt2807 = 0;
	anInt2815 = 0;
	anInt2816 = 0;
    }
}
