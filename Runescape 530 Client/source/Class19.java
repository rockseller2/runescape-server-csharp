public class Class19
{
    public static int anInt483 = 0;
    public static RSString aRSString_484
	= Class134.method1914("clignotant3:", (byte) 20);
    public static int anInt485;
    public static RSString aRSString_486
	= Class134.method1914("leuchten1:", (byte) 16);
    public static Class67_Sub5_Sub19[] aClass67_Sub5_Sub19Array487;
    public static Class136 aClass136_488;
    public static int anInt489;
    public static int[] anIntArray490;
    public static RSString aRSString_491;
    public static Class41[] aClass41Array492 = new Class41[14];
    public static int anInt493;
    public static int anInt494;
    public static int[] anIntArray495;
    public static int anInt496;
    public static int[] anIntArray497;
    
    public static void method187(int arg0) {
	Class67_Sub14.anInt3047 = arg0;
	for (int i = 0; i < Class67_Sub27.anInt3301; i++) {
	    for (int i_0_ = 0; i_0_ < Class67_Sub5_Sub16.anInt4782; i_0_++) {
		if (Class76.aClass67_Sub24ArrayArrayArray1578[arg0][i][i_0_]
		    == null)
		    Class76.aClass67_Sub24ArrayArrayArray1578[arg0][i][i_0_]
			= new Class67_Sub24(arg0, i, i_0_);
	    }
	}
    }
    
    public static void method188(byte arg0, int arg1) {
	if (arg0 != 112)
	    anIntArray490 = null;
	anInt493++;
	Class131_Sub5.aClass136_3666.method1920(arg1, 114);
    }
    
    public static void method189(int arg0, boolean arg1) {
	if (arg1 != true)
	    method187(30);
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg0, false, 3);
	class67_sub5_sub3.method844(0);
	anInt485++;
    }
    
    public static boolean method190(boolean arg0, int arg1) {
	if (arg0 != false)
	    return true;
	anInt496++;
	if ((arg1 ^ 0xffffffff) > -1
	    || (arg1 ^ 0xffffffff) <= (Class33_Sub2.aBooleanArray2777.length
				       ^ 0xffffffff))
	    return false;
	return Class33_Sub2.aBooleanArray2777[arg1];
    }
    
    public static boolean method191(int arg0, int arg1, int arg2, int arg3) {
	if (!Class13.method154(arg0, arg1, arg2))
	    return false;
	int i = arg1 << 7;
	int i_1_ = arg2 << 7;
	if (Class124.method1701(i + 1, (Class136.anIntArrayArrayArray2496[arg0]
					[arg1][arg2]) + arg3, i_1_ + 1)
	    && Class124.method1701(i + 128 - 1,
				   (Class136.anIntArrayArrayArray2496[arg0]
				    [arg1 + 1][arg2]) + arg3,
				   i_1_ + 1)
	    && Class124.method1701(i + 128 - 1,
				   (Class136.anIntArrayArrayArray2496[arg0]
				    [arg1 + 1][arg2 + 1]) + arg3,
				   i_1_ + 128 - 1)
	    && Class124.method1701(i + 1,
				   (Class136.anIntArrayArrayArray2496[arg0]
				    [arg1][arg2 + 1]) + arg3,
				   i_1_ + 128 - 1))
	    return true;
	return false;
    }
    
    public static void method192(byte arg0) {
	aClass41Array492 = null;
	aRSString_486 = null;
	aClass67_Sub5_Sub19Array487 = null;
	anIntArray490 = null;
	if (arg0 <= 108)
	    anIntArray497 = null;
	anIntArray495 = null;
	aRSString_484 = null;
	aRSString_491 = null;
	anIntArray497 = null;
	aClass136_488 = null;
    }
    
    static {
	aRSString_491 = Class134.method1914("; Expires=", (byte) 29);
	anIntArray495
	    = (new int[]
	       { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1,
		 -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1,
		 -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1,
		 -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1,
		 -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39,
		 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65,
		 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225,
		 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7,
		 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
		 -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 });
	anIntArray497 = new int[] { 0, -1, 0, 1 };
	aClass136_488 = new Class136(20);
    }
}
