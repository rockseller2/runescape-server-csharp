import java.awt.FontMetrics;

public class Class141
{
    public static FontMetrics aFontMetrics2554;
    public static short[] aShortArray2555;
    public static int anInt2556;
    public static boolean aBoolean2557;
    public static byte[][] aByteArrayArray2558 = new byte[1000][];
    public static int anInt2559;
    public static boolean aBoolean2560;
    public static RSString aRSString_2561;
    
    public static Login method1947(int arg0) {
	if (arg0 >= -73)
	    return null;
	anInt2559++;
	try {
	    return (Login) Class.forName("Login_Sub1").newInstance();
	} catch (Throwable throwable) {
	    return null;
	}
    }
    
    public static void method1948(byte arg0) {
	if (arg0 >= 22) {
	    aRSString_2561 = null;
	    aFontMetrics2554 = null;
	    aShortArray2555 = null;
	    aByteArrayArray2558 = null;
	}
    }
    
    public static void method1949(int arg0, boolean arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	anInt2556++;
	int i = arg6 + arg4;
	int i_0_ = -arg6 + arg2;
	int i_1_ = arg0 + -arg6;
	for (int i_2_ = arg4; i > i_2_; i_2_++)
	    Class67_Sub1_Sub11.method665(2, arg7,
					 (Class67_Sub29.anIntArrayArray3338
					  [i_2_]),
					 arg0, arg3);
	int i_3_ = arg7 + arg6;
	int i_4_ = arg2;
	if (arg1 != true)
	    aShortArray2555 = null;
	for (/**/; (i_4_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_4_--)
	    Class67_Sub1_Sub11.method665(2, arg7,
					 (Class67_Sub29.anIntArrayArray3338
					  [i_4_]),
					 arg0, arg3);
	for (int i_5_ = i; (i_0_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff);
	     i_5_++) {
	    int[] is = Class67_Sub29.anIntArrayArray3338[i_5_];
	    Class67_Sub1_Sub11.method665(2, arg7, is, i_3_, arg3);
	    Class67_Sub1_Sub11.method665(2, i_3_, is, i_1_, arg5);
	    Class67_Sub1_Sub11.method665(2, i_1_, is, arg0, arg3);
	}
    }
    
    static {
	aBoolean2557 = false;
	aRSString_2561 = Class134.method1914("welle:", (byte) 12);
    }
}
