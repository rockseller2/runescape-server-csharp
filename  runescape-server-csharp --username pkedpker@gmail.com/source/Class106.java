/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class106
{
    public static int anInt2054;
    public static boolean aBoolean2055 = false;
    public static int anInt2056;
    public Class67_Sub5_Sub9 aClass67_Sub5_Sub9_2057;
    public static RSString aRSString_2058
	= Class134.method1914("Lade Konfiguration )2 ", (byte) 124);
    public static boolean aBoolean2059 = false;
    public RSString[] aRSStringArray2060;
    public static int anInt2061;
    public int anInt2062 = -1;
    public static float aFloat2063;
    public int[] anIntArray2064;
    public static int anInt2065;
    public static Class67_Sub4 aClass67_Sub4_2066;
    
    public static void method1569(Class131 arg0, int arg1, int arg2,
				  int arg3) {
	if (arg2 < Class67_Sub27.anInt3301) {
	    Class67_Sub24 class67_sub24
		= (Class76.aClass67_Sub24ArrayArrayArray1578[arg1][arg2 + 1]
		   [arg3]);
	    if (class67_sub24 != null && class67_sub24.aClass104_3216 != null
		&& class67_sub24.aClass104_3216.aClass131_2034.method1768())
		arg0.method1763(class67_sub24.aClass104_3216.aClass131_2034,
				128, 0, 0, true);
	}
	if (arg3 < Class67_Sub27.anInt3301) {
	    Class67_Sub24 class67_sub24
		= (Class76.aClass67_Sub24ArrayArrayArray1578[arg1][arg2]
		   [arg3 + 1]);
	    if (class67_sub24 != null && class67_sub24.aClass104_3216 != null
		&& class67_sub24.aClass104_3216.aClass131_2034.method1768())
		arg0.method1763(class67_sub24.aClass104_3216.aClass131_2034, 0,
				0, 128, true);
	}
	if (arg2 < Class67_Sub27.anInt3301
	    && arg3 < Class67_Sub5_Sub16.anInt4782) {
	    Class67_Sub24 class67_sub24
		= (Class76.aClass67_Sub24ArrayArrayArray1578[arg1][arg2 + 1]
		   [arg3 + 1]);
	    if (class67_sub24 != null && class67_sub24.aClass104_3216 != null
		&& class67_sub24.aClass104_3216.aClass131_2034.method1768())
		arg0.method1763(class67_sub24.aClass104_3216.aClass131_2034,
				128, 0, 128, true);
	}
	if (arg2 < Class67_Sub27.anInt3301 && arg3 > 0) {
	    Class67_Sub24 class67_sub24
		= (Class76.aClass67_Sub24ArrayArrayArray1578[arg1][arg2 + 1]
		   [arg3 - 1]);
	    if (class67_sub24 != null && class67_sub24.aClass104_3216 != null
		&& class67_sub24.aClass104_3216.aClass131_2034.method1768())
		arg0.method1763(class67_sub24.aClass104_3216.aClass131_2034,
				128, 0, -128, true);
	}
    }
    
    public static void method1570(byte arg0) {
	aRSString_2058 = null;
	aClass67_Sub4_2066 = null;
	int i = -103 % ((arg0 - 31) / 49);
    }
    
    public static RSString method1571(int arg0, byte arg1) {
	anInt2061++;
	if ((arg0 ^ 0xffffffff) > -1000000000)
	    return InputStream_Sub1.method47(arg0, true);
	if (arg1 != 11)
	    return null;
	return Class67_Sub5_Sub11_Sub2.aRSString_5144;
    }
}
