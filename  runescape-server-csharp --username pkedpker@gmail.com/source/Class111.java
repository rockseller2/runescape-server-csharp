/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class111
{
    public static int anInt2094;
    public static int anInt2095;
    public static RSString aRSString_2096
	= Class134.method1914("::setparticles", (byte) 19);
    public static Class9 aClass9_2097;
    public static int anInt2098;
    public static int anInt2099;
    public static RSString aRSString_2100
	= Class134.method1914("Forced tweening ENABLED(Q", (byte) 24);
    
    public static boolean method1591(int arg0, byte arg1) {
	anInt2094++;
	if (arg1 != -53)
	    return true;
	if ((arg0 ^ 0xffffffff) > -1)
	    return false;
	int i = Applet_Sub1.aShortArray21[arg0];
	if ((i ^ 0xffffffff) <= -2001)
	    i -= 2000;
	if ((i ^ 0xffffffff) == -1002)
	    return true;
	return false;
    }
    
    public static void method1592(int arg0, byte arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	anInt2098++;
	Class7 class7
	    = Class67_Sub5_Sub14.method972(arg2, arg1 ^ ~0x46bf, arg4);
	if (class7 != null && class7.anObjectArray244 != null) {
	    Class67_Sub30 class67_sub30 = new Class67_Sub30();
	    class67_sub30.anObjectArray3356 = class7.anObjectArray244;
	    class67_sub30.aClass7_3352 = class7;
	    Class81.method1429(class67_sub30, 70);
	}
	Class99.anInt1954 = arg5;
	if (arg1 == -50) {
	    Class67_Sub5_Sub6.anInt4558 = arg2;
	    Class67_Sub1_Sub24.anInt4200 = arg4;
	    Class67_Sub5_Sub14.anInt4733 = arg6;
	    Class67_Sub5_Sub3.anInt4487 = arg3;
	    Class67_Sub20.aBoolean3156 = true;
	    Class2.anInt109 = arg0;
	    Class37.method326(class7, 103);
	}
    }
    
    public static void method1593(int arg0, int arg1) {
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg1, false, 12);
	anInt2095++;
	class67_sub5_sub3.method844(0);
	int i = -85 % ((arg0 - 42) / 58);
    }
    
    public static RSString method1594(int arg0) {
	if (arg0 != 2)
	    return null;
	RSString RSString;
	if (Login.anInt1612 == 1 && (Class134.anInt2476 ^ 0xffffffff) > -3)
	    RSString = (Class67_Sub1_Sub27.method744
		       (new RSString[] { Login.aRSString_1615,
					Class67_Sub1_Sub16_Sub1.aRSString_5096,
					Class67_Sub1_Sub6.aRSString_3895,
					Class67_Sub26.aRSString_3293 },
			-95));
	else if (Class67_Sub20.aBoolean3156 && Class134.anInt2476 < 2)
	    RSString
		= Class67_Sub1_Sub27.method744((new RSString[]
						{ Class67_Sub26.aRSString_3288,
						  (Class67_Sub1_Sub16_Sub1
						   .aRSString_5096),
						  Class9.aRSString_369,
						  (Class67_Sub26
						   .aRSString_3293) }),
					       -103);
	else if (Class131_Sub7_Sub2.aBoolean5068
		 && Class131_Sub7.aBooleanArray3698[81]
		 && Class134.anInt2476 > 2)
	    RSString = Class64.method569(-2 + Class134.anInt2476, (byte) 116);
	else
	    RSString = Class64.method569(Class134.anInt2476 + -1, (byte) 126);
	if ((Class134.anInt2476 ^ 0xffffffff) < -3)
	    RSString = (Class67_Sub1_Sub27.method744
		       ((new RSString[]
			 { RSString, Class90.aRSString_1850,
			   InputStream_Sub1.method47(Class134.anInt2476 + -2,
						     true),
			   Class4.aRSString_130 }),
			-128));
	anInt2099++;
	return RSString;
    }
    
    public static void method1595(int arg0) {
	if (arg0 != -7072)
	    aClass9_2097 = null;
	aRSString_2096 = null;
	aRSString_2100 = null;
	aClass9_2097 = null;
    }
}
