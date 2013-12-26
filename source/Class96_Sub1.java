/* Class96_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub1 extends Class96
{
    public static int anInt3377;
    public static RSString aRSString_3378;
    public static RSString aRSString_3379;
    public static int anInt3380;
    public static Class136 aClass136_3381;
    public static RSString aRSString_3382
	= Class134.method1914("yellow:", (byte) 112);
    
    public static Class67_Sub5_Sub7 method1508(int arg0, int arg1) {
	if (arg0 < 81)
	    return null;
	Class67_Sub5_Sub7 class67_sub5_sub7
	    = ((Class67_Sub5_Sub7)
	       Class33_Sub2.aClass136_2778.method1924((long) arg1, false));
	anInt3380++;
	if (class67_sub5_sub7 != null)
	    return class67_sub5_sub7;
	class67_sub5_sub7
	    = Class13.method156(Class133.aClass9_2449, false,
				Class67_Sub11_Sub2.aClass9_4863, -128, arg1);
	if (class67_sub5_sub7 != null)
	    Class33_Sub2.aClass136_2778
		.method1926((long) arg1, class67_sub5_sub7, (byte) -71);
	return class67_sub5_sub7;
    }
    
    public static void method1509(int arg0) {
	if (arg0 != 100)
	    method1509(-6);
	aRSString_3379 = null;
	aClass136_3381 = null;
	aRSString_3382 = null;
	aRSString_3378 = null;
    }
    
    static {
	aRSString_3379 = aRSString_3382;
	aRSString_3378 = aRSString_3382;
	aClass136_3381 = new Class136(100);
    }
}
