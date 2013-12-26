/* Class67_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub9 extends Class67
{
    public int anInt2967;
    public static int anInt2968;
    public static int anInt2969;
    public static int anInt2970;
    public static RSString aRSString_2971;
    public static RSString aRSString_2972
	= Class134.method1914("Loading world list data", (byte) 65);
    public static RSString aRSString_2973
	= Class134.method1914(":clanreq:", (byte) 125);
    public static RSString aRSString_2974;
    public int anInt2975;
    public static int anInt2976;
    public static RSString aRSString_2977;
    public int anInt2978;
    public int anInt2979;
    public static boolean aBoolean2980;
    public static int anInt2981;
    public static int[][] anIntArrayArray2982;
    public static int[] anIntArray2983;
    public static short[][] aShortArrayArray2984;
    
    public static void method1110(int arg0) {
	anIntArray2983 = null;
	if (arg0 > -66)
	    method1110(-32);
	aRSString_2973 = null;
	aRSString_2972 = null;
	anIntArrayArray2982 = null;
	aRSString_2977 = null;
	aShortArrayArray2984 = null;
	aRSString_2971 = null;
	aRSString_2974 = null;
    }
    
    public boolean method1111(int arg0, int arg1, int arg2) {
	anInt2981++;
	if (arg2 != 16777215)
	    method1112(-105);
	if (arg1 >= anInt2978 && anInt2975 >= arg1 && arg0 >= anInt2979
	    && (arg0 ^ 0xffffffff) >= (anInt2967 ^ 0xffffffff))
	    return true;
	return false;
    }
    
    public static void method1112(int arg0) {
	anInt2970++;
	for (int i = 0; i < 104; i++) {
	    for (int i_0_ = 0; i_0_ < 104; i_0_++)
		Class7.anIntArrayArray252[i][i_0_] = 0;
	}
	if (arg0 != 3658)
	    method1113(63, -28);
    }
    
    public static int method1113(int arg0, int arg1) {
	if (arg0 != 22255)
	    aRSString_2971 = null;
	anInt2976++;
	Class98 class98 = Class67_Sub29.method1312(arg0 + 9218, arg1);
	int i = class98.anInt1950;
	int i_1_ = class98.anInt1944;
	int i_2_ = class98.anInt1949;
	int i_3_ = Class67_Sub1_Sub15.anIntArray4050[-i_1_ + i_2_];
	return i_3_ & Class137.anIntArray2504[i] >> i_1_;
    }
    
    public Class67_Sub9(int arg0, int arg1, int arg2, int arg3) {
	anInt2967 = arg3;
	anInt2978 = arg0;
	anInt2975 = arg2;
	anInt2979 = arg1;
    }
    
    static {
	anInt2969 = 0;
	aBoolean2980 = false;
	aRSString_2971 = Class134.method1914("", (byte) 110);
	aRSString_2974 = aRSString_2972;
	anIntArrayArray2982 = new int[5][5000];
	aRSString_2977 = aRSString_2971;
	anIntArray2983 = new int[] { 16776960, 16711680, 65280, 65535,
				     16711935, 16777215 };
	aShortArrayArray2984
	    = (new short[][]
	       { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437,
		   2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472,
		   580, 784, 21966, 28950, -15697, -14002 },
		 { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466,
		   10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392,
		   10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835,
		   -15460, -14019 },
		 new short[0], new short[0], new short[0] });
    }
}
