/* Class67_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class67_Sub6 extends Class67
{
    public static int anInt2868;
    public int anInt2869 = -1;
    public static int[] anIntArray2870;
    public int anInt2871;
    public static Class67_Sub5_Sub19 aClass67_Sub5_Sub19_2872;
    public static int anInt2873;
    public int anInt2874;
    public static RSString aRSString_2875
	= Class134.method1914("ondulation:", (byte) 85);
    public static RSString aRSString_2876;
    public int anInt2877;
    public static int anInt2878;
    public int anInt2879;
    public int anInt2880;
    public int anInt2881;
    public static RSString aRSString_2882
	= Class134.method1914(")1", (byte) 123);
    public int anInt2883 = 0;
    public static CRC32 aCRC32_2884;
    public static int anInt2885;
    public static RSString aRSString_2886;
    public static int[] anIntArray2887;
    public int anInt2888;
    public int anInt2889;
    public static RSString aRSString_2890;
    public int anInt2891;
    public int anInt2892;
    public static RSString aRSString_2893;
    
    public static void method1033(boolean arg0, int arg1) {
	anInt2878++;
	Class67_Sub8.aClass136_2964.method1920(arg1, 76);
	if (arg0 == true) {
	    Class82.aClass136_1661.method1920(arg1, 99);
	    Class67_Sub1_Sub34.aClass136_4332.method1920(arg1, 89);
	    Class132.aClass136_2439.method1920(arg1, 91);
	}
    }
    
    public static RSString method1034(int arg0, byte arg1, long arg2,
				     int[] arg3) {
	try {
	    if (arg1 >= -104)
		aRSString_2876 = null;
	    anInt2885++;
	    if (Class67_Sub15.anInterface4_3075 != null) {
		RSString RSString = Class67_Sub15.anInterface4_3075
				      .method14((byte) -75, arg2, arg0, arg3);
		if (RSString != null)
		    return RSString;
	    }
	    return Class102.method1548(-1, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ff.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1035(int arg0) {
	aRSString_2886 = null;
	if (arg0 <= 91)
	    method1034(103, (byte) 86, 71L, null);
	aRSString_2890 = null;
	aRSString_2875 = null;
	aRSString_2893 = null;
	anIntArray2887 = null;
	anIntArray2870 = null;
	aRSString_2882 = null;
	aRSString_2876 = null;
	aCRC32_2884 = null;
	aClass67_Sub5_Sub19_2872 = null;
    }
    
    static {
	anInt2868 = 0;
	aRSString_2876 = Class134.method1914(")3runescape)3com)4l=", (byte) 42);
	aRSString_2886 = Class134.method1914("Walk here", (byte) 95);
	aRSString_2890 = Class134.method1914("Okay", (byte) 43);
	anIntArray2887 = new int[50];
	aRSString_2893 = aRSString_2886;
	aCRC32_2884 = new CRC32();
    }
}
