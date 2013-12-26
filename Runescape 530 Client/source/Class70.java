/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class70
{
    public static int anInt1391;
    public static int anInt1392;
    public static boolean aBoolean1393;
    public static int anInt1394;
    public static int anInt1395;
    public static int anInt1396;
    public static int anInt1397;
    public static int anInt1398;
    public static int anInt1399;
    public int anInt1400;
    public static int anInt1401 = 500;
    public static int anInt1402;
    public static byte[][][] aByteArrayArrayArray1403;
    public static int anInt1404;
    public static RSString aRSString_1405;
    public static int anInt1406;
    public int anInt1407;
    public int anInt1408;
    public static int anInt1409;
    
    public boolean method1327(int arg0) {
	int i = 107 % ((65 - arg0) / 59);
	anInt1394++;
	if ((anInt1408 & 0x4) == 0)
	    return false;
	return true;
    }
    
    public boolean method1328(byte arg0) {
	if (arg0 >= -89)
	    return false;
	anInt1395++;
	if ((anInt1408 & 0x8) == 0)
	    return false;
	return true;
    }
    
    public boolean method1329(boolean arg0) {
	if (arg0 != false)
	    return false;
	anInt1391++;
	if ((0x1 & anInt1408) == 0)
	    return false;
	return true;
    }
    
    public static int method1330(Class9 arg0, boolean arg1) {
	anInt1409++;
	int i = 0;
	if (arg0.method132(Class67_Sub12.anInt3041, true))
	    i++;
	if (arg0.method132(Class67_Sub11_Sub2.anInt4849, !arg1))
	    i++;
	if (arg0.method132(Class15.anInt460, true))
	    i++;
	if (arg0.method132(Class30.anInt703, true))
	    i++;
	if (arg0.method132(Class137.anInt2519, true))
	    i++;
	if (arg0.method132(Class62.anInt1162, true))
	    i++;
	if (arg0.method132(Class67_Sub14.anInt3064, !arg1))
	    i++;
	if (arg1 != false)
	    return -54;
	if (arg0.method132(Class67_Sub1_Sub24.anInt4213, !arg1))
	    i++;
	if (arg0.method132(Class40.anInt819, !arg1))
	    i++;
	if (arg0.method132(Class126_Sub1.anInt3419, !arg1))
	    i++;
	if (arg0.method132(Class105.anInt2052, !arg1))
	    i++;
	if (arg0.method132(Class67_Sub10.anInt3017, true))
	    i++;
	if (arg0.method132(Class89.anInt1829, true))
	    i++;
	if (arg0.method132(Class67_Sub17.anInt3106, true))
	    i++;
	if (arg0.method132(Class124.anInt2334, true))
	    i++;
	return i;
    }
    
    public static void method1331(byte arg0) {
	aRSString_1405 = null;
	if (arg0 != -125)
	    method1330(null, true);
	aByteArrayArrayArray1403 = null;
    }
    
    public static void method1332(int arg0) {
	anInt1397++;
	if (arg0 != 100)
	    method1330(null, false);
	Class67_Sub10.aClass136_3015.method1922(0);
    }
    
    public static int method1333(boolean arg0, Class70_Sub1 arg1, int arg2,
				 boolean arg3, int arg4, Class70_Sub1 arg5,
				 byte arg6) {
	try {
	    int i = Class41.method356((byte) -88, arg5, arg0, arg4, arg1);
	    anInt1402++;
	    if (i != 0) {
		if (!arg0)
		    return i;
		return -i;
	    }
	    if (arg6 > -3)
		return 94;
	    if (arg2 == -1)
		return 0;
	    int i_0_ = Class41.method356((byte) -88, arg5, arg3, arg2, arg1);
	    if (!arg3)
		return i_0_;
	    return -i_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ka.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ','
						+ (arg5 != null ? "{...}"
						   : "null")
						+ ',' + arg6 + ')'));
	}
    }
    
    public static void method1334(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, boolean arg6) {
	anInt1396++;
	Class67_Sub1_Sub20.anInt4148 = arg1;
	Class67_Sub26.anInt3291 = arg5;
	Class99.anInt1956 = arg3;
	if (arg4 > -55)
	    anInt1404 = -27;
	Class129.anInt2397 = arg2;
	Class55_Sub1.anInt2791 = arg0;
	if (arg6 && Class55_Sub1.anInt2791 >= 100) {
	    Class129.anInt2395 = Class67_Sub26.anInt3291 * 128 + 64;
	    Class114.anInt2160 = 64 + 128 * Class67_Sub1_Sub20.anInt4148;
	    Class86.anInt1760
		= (Class131_Sub5.method1826(Canvas_Sub1.anInt59,
					    Class114.anInt2160,
					    Class129.anInt2395, (byte) 111)
		   - Class129.anInt2397);
	}
	Class22.anInt530 = 2;
    }
    
    public boolean method1335(boolean arg0) {
	if (arg0 != true)
	    aRSString_1405 = null;
	anInt1392++;
	if ((anInt1408 & 0x2 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    static {
	aBoolean1393 = false;
	anInt1404 = 0;
	anInt1398 = 0;
	aRSString_1405
	    = (Class134.method1914
	       ("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) 44));
    }
}
