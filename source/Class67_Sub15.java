/* Class67_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub15 extends Class67
{
    public static int anInt3067;
    public static int anInt3068;
    public int anInt3069;
    public static int anInt3070;
    public int anInt3071;
    public static long aLong3072 = 0L;
    public static int anInt3073;
    public static int anInt3074;
    public static Interface4 anInterface4_3075;
    public static int anInt3076;
    public static int[] anIntArray3077;
    public static int anInt3078;
    public static int anInt3079;
    
    public static void method1237(int arg0) {
	anInterface4_3075 = null;
	if (arg0 != 26675)
	    method1238(-64, false, -91);
	anIntArray3077 = null;
    }
    
    public static int method1238(int arg0, boolean arg1, int arg2) {
	anInt3068++;
	if (arg1 != true)
	    method1239(null, -125, 44);
	int i = (Class134.method1910(arg0 - 1, -1, arg2 - 1)
		 + (Class134.method1910(-1 + arg0, -1, 1 + arg2)
		    - -Class134.method1910(arg0 + 1, -1, arg2 + -1)
		    + Class134.method1910(arg0 - -1, -1, arg2 + 1)));
	int i_0_ = (Class134.method1910(arg0, -1, -1 + arg2)
		    + (Class134.method1910(arg0, -1, arg2 + 1)
		       - -Class134.method1910(arg0 + -1, -1, arg2))
		    + Class134.method1910(1 + arg0, -1, arg2));
	int i_1_ = Class134.method1910(arg0, -1, arg2);
	return i_1_ / 4 + i / 16 - -(i_0_ / 8);
    }
    
    public static Class119_Sub1[] method1239(Class9 arg0, int arg1, int arg2) {
	if (arg1 > -96)
	    aLong3072 = 44L;
	anInt3073++;
	if (!Class131_Sub3.method1806(arg0, arg2, -116))
	    return null;
	return Class67_Sub1_Sub36.method782(74);
    }
    
    public Class67_Sub15(int arg0, int arg1) {
	anInt3069 = arg1;
	anInt3071 = arg0;
    }
    
    static {
	anInt3070 = 0;
	anInterface4_3075 = null;
	anInt3074 = 0;
	anInt3079 = 0;
    }
}
