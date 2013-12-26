public class Class4
{
    public static int anInt122;
    public static short aShort123 = 32767;
    public static int[] anIntArray124;
    public static int anInt125;
    public static int anInt126 = 2301979;
    public static RSString aRSString_127
	= Class134.method1914(" more options", (byte) 81);
    public static int anInt128;
    public static Class9 aClass9_129;
    public static RSString aRSString_130;
    public static short aShort131 = 1;
    public static Class67_Sub5_Sub10_Sub1 aClass67_Sub5_Sub10_Sub1_132;
    
    public static void method74(byte arg0) {
	if (arg0 < -9) {
	    aClass67_Sub5_Sub10_Sub1_132 = null;
	    aRSString_130 = null;
	    anIntArray124 = null;
	    aClass9_129 = null;
	    aRSString_127 = null;
	}
    }
    
    public static void method75(int arg0, int arg1, int arg2) {
	anInt128++;
	Class137.anIntArray2504[arg1] = arg2;
	if (arg0 < 22)
	    aShort131 = (short) 22;
	Class67_Sub28 class67_sub28
	    = ((Class67_Sub28)
	       Class25.aClass92_599.method1489((byte) -27, (long) arg1));
	if (class67_sub28 != null)
	    class67_sub28.aLong3326 = Class39.method337(19644) - -500L;
	else {
	    class67_sub28
		= new Class67_Sub28(Class39.method337(19644) - -500L);
	    Class25.aClass92_599.method1488((byte) -89, class67_sub28,
					    (long) arg1);
	}
    }
    
    public static void method76(int arg0, int arg1) {
	anInt122++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg0, false, 7);
	if (arg1 >= 78)
	    class67_sub5_sub3.method844(0);
    }
    
    public static void method77(int arg0, int arg1, int arg2, int arg3,
				Class131 arg4, Class131 arg5, int arg6,
				int arg7, long arg8) {
	if (arg4 != null || arg5 != null) {
	    Class58 class58 = new Class58();
	    class58.aLong1118 = arg8;
	    class58.anInt1120 = arg1 * 128 + 64;
	    class58.anInt1125 = arg2 * 128 + 64;
	    class58.anInt1124 = arg3;
	    class58.aClass131_1121 = arg4;
	    class58.aClass131_1115 = arg5;
	    class58.anInt1123 = arg6;
	    class58.anInt1122 = arg7;
	    for (int i = arg0; i >= 0; i--) {
		if (Class76.aClass67_Sub24ArrayArrayArray1578[i][arg1][arg2]
		    == null)
		    Class76.aClass67_Sub24ArrayArrayArray1578[i][arg1][arg2]
			= new Class67_Sub24(i, arg1, arg2);
	    }
	    Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2]
		.aClass58_3221
		= class58;
	}
    }
    
    static {
	aRSString_130 = aRSString_127;
    }
}
