/* Class67_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub19 extends Class67
{
    public static RSString aRSString_3144
	= Class134.method1914("Fallen lassen", (byte) 113);
    public static int anInt3145;
    public static int anInt3146 = -1;
    public static RSString aRSString_3147
	= Class134.method1914("p12_full", (byte) 14);
    public static int anInt3148;
    public int anInt3149;
    public static int anInt3150;
    public static int anInt3151;
    public static Class67_Sub5_Sub19_Sub1[] aClass67_Sub5_Sub19_Sub1Array3152;
    public static int anInt3153;
    public static boolean[] aBooleanArray3154 = new boolean[8];
    
    public static boolean method1262(int arg0, int arg1, int arg2, int arg3,
				     int arg4, int arg5, Class131 arg6,
				     int arg7, long arg8) {
	if (arg6 == null)
	    return true;
	int i = arg1 * 128 + 64 * arg4;
	int i_0_ = arg2 * 128 + 64 * arg5;
	return Class12.method151(arg0, arg1, arg2, arg4, arg5, i, i_0_, arg3,
				 arg6, arg7, false, arg8);
    }
    
    public static Class58 method1263(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null)
	    return null;
	return class67_sub24.aClass58_3221;
    }
    
    public static void method1264(byte arg0) {
	Class67_Sub1_Sub37.aClass136_4388.method1921((byte) -105);
	Class33_Sub2.aClass136_2775.method1921((byte) 58);
	int i = -62 / ((-50 - arg0) / 61);
	anInt3151++;
    }
    
    public static void method1265(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	Class67_Sub1_Sub11.method665(arg2 ^ 0xa, arg4,
				     Class67_Sub29.anIntArrayArray3338[arg0++],
				     arg5, arg1);
	anInt3150++;
	Class67_Sub1_Sub11.method665(2, arg4,
				     Class67_Sub29.anIntArrayArray3338[arg3--],
				     arg5, arg1);
	int i = arg0;
	if (arg2 != 8)
	    method1263(25, 69, -9);
	for (/**/; i <= arg3; i++) {
	    int[] is = Class67_Sub29.anIntArrayArray3338[i];
	    is[arg4] = is[arg5] = arg1;
	}
    }
    
    public static int method1266(int arg0, int arg1) {
	anInt3148++;
	if (arg0 != 24838)
	    method1263(-77, -103, -124);
	return arg1 & 0x7f;
    }
    
    public static void method1267(RSString arg0, int arg1, boolean arg2) {
	anInt3153++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg1, !arg2, 2);
	if (arg2 != true)
	    method1268((byte) -81);
	class67_sub5_sub3.method846(arg2);
	class67_sub5_sub3.aRSString_4497 = arg0;
    }
    
    public static void method1268(byte arg0) {
	aRSString_3144 = null;
	if (arg0 == -31) {
	    aRSString_3147 = null;
	    aBooleanArray3154 = null;
	    aClass67_Sub5_Sub19_Sub1Array3152 = null;
	}
    }
    
    public Class67_Sub19() {
	/* empty */
    }
    
    public Class67_Sub19(int arg0) {
	anInt3149 = arg0;
    }
}
