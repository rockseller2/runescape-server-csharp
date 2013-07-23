/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class91
{
    public static int anInt1853;
    public static byte[][] aByteArrayArray1854 = new byte[50][];
    public static RSString aRSString_1855;
    public static RSString aRSString_1856;
    public static int anInt1857 = -2;
    public static int anInt1858;
    
    public static void method1474(int arg0) {
	aRSString_1856 = null;
	aRSString_1855 = null;
	aByteArrayArray1854 = null;
	if (arg0 != 1)
	    method1474(-73);
    }
    
    public static Class67_Sub5_Sub6 method1475(int arg0, int arg1, int arg2) {
	anInt1858++;
	if (arg0 != 19451)
	    aByteArrayArray1854 = null;
	for (Class67_Sub5_Sub6 class67_sub5_sub6
		 = (Class67_Sub5_Sub6) Class10.aClass50_399.method445(0);
	     class67_sub5_sub6 != null;
	     class67_sub5_sub6
		 = (Class67_Sub5_Sub6) Class10.aClass50_399.method432(0)) {
	    if (class67_sub5_sub6.aBoolean4559
		&& class67_sub5_sub6.method869(arg2, arg1, false))
		return class67_sub5_sub6;
	}
	return null;
    }
    
    public static void method1476(int arg0, int arg1) {
	anInt1853++;
	if (arg1 == -11770) {
	    Class15.aClass136_451.method1920(arg0, arg1 + 11854);
	    Class67_Sub1_Sub7.aClass136_3901.method1920(arg0, 76);
	    Class19.aClass136_488.method1920(arg0, 114);
	}
    }
    
    static {
	aRSString_1855 = Class134.method1914("Loading sprites )2 ", (byte) 11);
	aRSString_1856 = aRSString_1855;
    }
}
