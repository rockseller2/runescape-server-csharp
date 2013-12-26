/* Class67_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class67_Sub30 extends Class67
{
    public static int anInt3340;
    public static int anInt3341;
    public static int anInt3342;
    public static RSString aRSString_3343;
    public static Class9 aClass9_3344;
    public boolean aBoolean3345;
    public static RSString aRSString_3346;
    public int anInt3347;
    public int anInt3348;
    public RSString aRSString_3349;
    public static RSString aRSString_3350
	= Class134.method1914("rating: ", (byte) 59);
    public Class7 aClass7_3351;
    public Class7 aClass7_3352;
    public int anInt3353;
    public int anInt3354;
    public static RSString aRSString_3355
	= Class134.method1914("d-Broulement:", (byte) 86);
    public Object[] anObjectArray3356;
    public static RSString aRSString_3357
	= Class134.method1914("Atteindre", (byte) 92);
    public static int anInt3358;
    public static int anInt3359;
    public int anInt3360;
    public static double aDouble3361;
    
    public static void method1315(Class9 arg0, Class9 arg1, boolean arg2,
				  Class9 arg3, Class9 arg4) {
	try {
	    Class51.aClass9_1041 = arg1;
	    if (arg2 != true)
		method1318(82, (byte) -2);
	    anInt3358++;
	    Class67_Sub1_Sub15.aClass9_4051 = arg3;
	    Class131_Sub7_Sub2.aClass9_5063 = arg0;
	    Class55_Sub3_Sub1.aClass9_3810 = arg4;
	    Class67_Sub1_Sub5.aClass7ArrayArray3878
		= (new Class7[Class55_Sub3_Sub1.aClass9_3810.method107(21296)]
		   []);
	    PacketParser.aBooleanArray2102
		= new boolean[Class55_Sub3_Sub1.aClass9_3810.method107(21296)];
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("wf.C(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method1316(int arg0, int arg1, byte arg2, int arg3,
				  int arg4) {
	if ((-arg4 + arg1 ^ 0xffffffff) > (Class139.anInt2533 ^ 0xffffffff)
	    || arg1 + arg4 > Class126_Sub1.anInt3423
	    || (Class55_Sub2.anInt2801 ^ 0xffffffff) < (arg3 + -arg4
							^ 0xffffffff)
	    || (arg3 - -arg4 ^ 0xffffffff) < (OutputStream_Sub1.anInt87
					      ^ 0xffffffff))
	    Class67_Sub5_Sub2.method838((byte) 85, arg3, arg4, arg1, arg0);
	else
	    Class131_Sub7_Sub1.method1892(arg3, arg1, arg4, arg0, false);
	int i = 39 / ((arg2 - 29) / 35);
	anInt3341++;
    }
    
    public static void method1317(boolean arg0) {
	anInt3342++;
	Class66.aClass92_1321.method1478(arg0);
	Class11.aClass120_415.method1665((byte) -105);
	Class90.aClass120_1843.method1665((byte) -114);
    }
    
    public static byte[] method1318(int arg0, byte arg1) {
	int i = -45 / ((18 - arg1) / 44);
	anInt3340++;
	Class67_Sub5_Sub5 class67_sub5_sub5
	    = ((Class67_Sub5_Sub5)
	       Class134.aClass137_2466.method1930(261775, (long) arg0));
	if (class67_sub5_sub5 == null) {
	    byte[] is = new byte[512];
	    Random random = new Random((long) arg0);
	    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -256; i_0_++)
		is[i_0_] = (byte) i_0_;
	    for (int i_1_ = 0; i_1_ < 255; i_1_++) {
		int i_2_ = -i_1_ + 255;
		int i_3_ = Class67_Sub1_Sub37.method793(123, random, i_2_);
		byte i_4_ = is[i_3_];
		is[i_3_] = is[i_2_];
		is[i_2_] = is[511 + -i_1_] = i_4_;
	    }
	    class67_sub5_sub5 = new Class67_Sub5_Sub5(is);
	    Class134.aClass137_2466.method1932((long) arg0, 0,
					       class67_sub5_sub5);
	}
	return class67_sub5_sub5.aByteArray4518;
    }
    
    public static void method1319(int arg0) {
	aRSString_3355 = null;
	aRSString_3343 = null;
	aRSString_3357 = null;
	aClass9_3344 = null;
	if (arg0 != 512)
	    aDouble3361 = -1.0492849692996364;
	aRSString_3350 = null;
	aRSString_3346 = null;
    }
    
    static {
	aRSString_3346 = aRSString_3350;
	aRSString_3343 = Class134.method1914("null", (byte) 85);
	aDouble3361 = -1.0;
    }
}
