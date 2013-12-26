/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class43
{
    public static int[] anIntArray897;
    public static Class22 aClass22_898;
    public static int anInt899;
    public static int anInt900;
    public static int anInt901;
    public static Class9 aClass9_902;
    public static Class115[] aClass115Array903 = new Class115[28];
    public static int anInt904;
    public static int anInt905;
    public static RSString aRSString_906
	= Class134.method1914("<col=ff9040>", (byte) 95);
    public static Class31 aClass31_907;
    
    public static int method379(byte arg0, int arg1, int arg2) {
	if (arg0 != -97)
	    aClass22_898 = null;
	int i = arg1 >>> -1236843969;
	anInt905++;
	return (arg1 + i) / arg2 + -i;
    }
    
    public static void method380(byte arg0) {
	aClass31_907 = null;
	aRSString_906 = null;
	aClass9_902 = null;
	int i = 125 % ((arg0 - 2) / 59);
	aClass115Array903 = null;
	anIntArray897 = null;
	aClass22_898 = null;
    }
    
    public static int method381(int arg0, int arg1) {
	if (arg1 != 127)
	    method382(-103);
	anInt900++;
	return 0x7f & arg0;
    }
    
    public static void method382(int arg0) {
	if (arg0 > -98)
	    aRSString_906 = null;
	Class18.aClass136_2730.method1922(0);
	anInt901++;
    }
    
    public static void method383(int arg0) {
	int i = Class130.aClass67_Sub5_Sub10_2404
		    .method913(Class119.aRSString_2257);
	anInt904++;
	if (arg0 <= -13) {
	    for (int i_0_ = 0; i_0_ < Class134.anInt2476; i_0_++) {
		int i_1_ = Class130.aClass67_Sub5_Sub10_2404
			       .method913(Class64.method569(i_0_, (byte) 124));
		if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
		    i = i_1_;
	    }
	    i += 8;
	    int i_2_ = Class129.anInt2398;
	    int i_3_ = Class136.anInt2486 + -(i / 2);
	    int i_4_ = 15 * Class134.anInt2476 + 21;
	    if ((Class56.anInt1097 ^ 0xffffffff) > (i_3_ + i ^ 0xffffffff))
		i_3_ = -i + Class56.anInt1097;
	    if (i_4_ + i_2_ > Class49.anInt1010)
		i_2_ = Class49.anInt1010 + -i_4_;
	    if (i_3_ < 0)
		i_3_ = 0;
	    if (i_2_ < 0)
		i_2_ = 0;
	    if ((Class104.anInt2041 ^ 0xffffffff) == -2) {
		if (((Class136.anInt2486 ^ 0xffffffff)
		     == (RuntimeException_Sub1.anInt2621 ^ 0xffffffff))
		    && Class129.anInt2398 == Class67_Sub11_Sub2.anInt4862) {
		    Class49.anInt1007 = i_3_;
		    Class53.anInt1066 = i_2_;
		    Class67_Sub16.anInt3084 = i;
		    Class104.anInt2041 = 0;
		    client.anInt2733
			= Class134.anInt2476 * 15 - -(Class36.aBoolean771 ? 26
						      : 22);
		    Class67_Sub9.aBoolean2980 = true;
		}
	    } else if ((Class115.anInt2186 ^ 0xffffffff) != (Class136.anInt2486
							     ^ 0xffffffff)
		       || ((Class129.anInt2398 ^ 0xffffffff)
			   != (Class101.anInt1985 ^ 0xffffffff))) {
		Class67_Sub11_Sub2.anInt4862 = Class101.anInt1985;
		Class104.anInt2041 = 1;
		RuntimeException_Sub1.anInt2621 = Class115.anInt2186;
	    } else {
		client.anInt2733 = ((Class36.aBoolean771 ? 26 : 22)
				    + Class134.anInt2476 * 15);
		Class67_Sub16.anInt3084 = i;
		Class53.anInt1066 = i_2_;
		Class49.anInt1007 = i_3_;
		Class67_Sub9.aBoolean2980 = true;
		Class104.anInt2041 = 0;
	    }
	}
    }
    
    public static void method384(boolean arg0) {
	Class44.aClass136_909.method1921((byte) -127);
	anInt899++;
	if (arg0 == true) {
	    Class67_Sub24.aClass136_3234.method1921((byte) 126);
	    Class96_Sub1.aClass136_3381.method1921((byte) 35);
	}
    }
    
    static {
	aClass22_898 = new Class22();
    }
}
