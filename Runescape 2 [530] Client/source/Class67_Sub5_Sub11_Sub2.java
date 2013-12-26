/* Class67_Sub5_Sub11_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub11_Sub2 extends Class67_Sub5_Sub11
{
    public static int anInt5138;
    public static Class9 aClass9_5139;
    public static int anInt5140;
    public static int anInt5141;
    public static int anInt5142 = -1;
    public Object anObject5143;
    public static RSString aRSString_5144
	= Class134.method1914("(Z", (byte) 111);
    public static int anInt5145;
    public static RSString aRSString_5146 = Class134.method1914(" ", (byte) 58);
    public static int anInt5147;
    public static int anInt5148;
    
    public static void method939(int arg0, int arg1, int arg2, int arg3,
				 int arg4, byte arg5) {
	Class85.aClass119Array1742[0].method1641(arg4, arg1);
	Class85.aClass119Array1742[1].method1641(arg4, -16 + arg0 + arg1);
	anInt5138++;
	int i = (-32 + arg0) * arg0 / arg3;
	if ((i ^ 0xffffffff) > -9)
	    i = 8;
	int i_0_ = arg2 * (-32 + (arg0 - i)) / (-arg0 + arg3);
	Class121.method1683(arg4, 16 + arg1, 16, -32 + arg0, Class4.anInt126);
	Class121.method1683(arg4, i_0_ + arg1 - -16, 16, i, Class88.anInt1817);
	Class121.method1692(arg4, 16 + (arg1 + i_0_), i,
			    Class67_Sub1_Sub16_Sub1.anInt5100);
	int i_1_ = -49 % ((49 - arg5) / 51);
	Class121.method1692(1 + arg4, i_0_ + (arg1 - -16), i,
			    Class67_Sub1_Sub16_Sub1.anInt5100);
	Class121.method1690(arg4, arg1 - -16 + i_0_, 16,
			    Class67_Sub1_Sub16_Sub1.anInt5100);
	Class121.method1690(arg4, i_0_ + arg1 + 17, 16,
			    Class67_Sub1_Sub16_Sub1.anInt5100);
	Class121.method1692(15 + arg4, i_0_ + arg1 - -16, i,
			    Class67_Sub28.anInt3328);
	Class121.method1692(14 + arg4, i_0_ + (arg1 + 17), -1 + i,
			    Class67_Sub28.anInt3328);
	Class121.method1690(arg4, arg1 - (-15 + -i_0_) + i, 16,
			    Class67_Sub28.anInt3328);
	Class121.method1690(1 + arg4, 14 + (arg1 - (-i_0_ - i)), 15,
			    Class67_Sub28.anInt3328);
    }
    
    public Object method935(boolean arg0) {
	anInt5140++;
	if (arg0 != true)
	    aRSString_5146 = null;
	return anObject5143;
    }
    
    public boolean method938(boolean arg0) {
	if (arg0 != true)
	    method938(false);
	anInt5148++;
	return false;
    }
    
    public Class67_Sub5_Sub11_Sub2(Object arg0) {
	anObject5143 = arg0;
    }
    
    public static int method940(RSString arg0, int arg1) {
	if (arg1 != -1)
	    method941((byte) 87);
	anInt5145++;
	if (Class68.aClass72_1369 == null
	    || (arg0.method531((byte) -123) ^ 0xffffffff) == -1)
	    return -1;
	for (int i = 0;
	     (i ^ 0xffffffff) > (Class68.aClass72_1369.anInt1439 ^ 0xffffffff);
	     i++) {
	    if (Class68.aClass72_1369.aRSStringArray1441[i].method508
		    (Class20.aRSString_511, true, Class6.aRSString_150)
		    .method529((byte) -28, arg0))
		return i;
	}
	return -1;
    }
    
    public static void method941(byte arg0) {
	aClass9_5139 = null;
	aRSString_5144 = null;
	aRSString_5146 = null;
	if (arg0 != 47)
	    aRSString_5144 = null;
    }
}
