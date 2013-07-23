/* Class67_Sub5_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class67_Sub5_Sub4 extends Class67_Sub5
{
    public static RSString aRSString_4503;
    public static int anInt4504 = 0;
    public static RSString aRSString_4505;
    public volatile boolean aBoolean4506 = true;
    public boolean aBoolean4507;
    public static int anInt4508;
    public static int anInt4509;
    public static int[] anIntArray4510;
    public boolean aBoolean4511;
    public static int anInt4512;
    public static int anInt4513;
    
    public abstract int method849(byte i);
    
    public static void method850(int arg0) {
	try {
	    if (arg0 > 29)
		anInt4508++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "df.D(" + arg0 + ')');
	}
    }
    
    public static void method851(int arg0) {
	try {
	    aRSString_4505 = null;
	    if (arg0 != 21482)
		anInt4504 = -21;
	    anIntArray4510 = null;
	    aRSString_4503 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "df.C(" + arg0 + ')');
	}
    }
    
    public static Class67_Sub5_Sub19_Sub1 method852(byte arg0) {
	try {
	    anInt4513++;
	    byte[] is = Class67_Sub1_Sub35.aByteArrayArray4357[0];
	    int i = Class55_Sub3.anIntArray2810[0] * anIntArray4510[0];
	    int[] is_0_ = new int[i];
	    if (arg0 < 9)
		anIntArray4510 = null;
	    for (int i_1_ = 0; i > i_1_; i_1_++)
		is_0_[i_1_]
		    = Class73.anIntArray1462[Class75.method1379(255,
								is[i_1_])];
	    Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1
		= new Class67_Sub5_Sub19_Sub1(Class3.anInt119,
					      Class80.anInt1628,
					      Class67_Sub23.anIntArray3201[0],
					      Class67_Sub6.anIntArray2870[0],
					      Class55_Sub3.anIntArray2810[0],
					      anIntArray4510[0], is_0_);
	    Class67_Sub5_Sub11.method937(false);
	    return class67_sub5_sub19_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "df.A(" + arg0 + ')');
	}
    }
    
    public abstract byte[] method853(int i);
    
    static {
	aRSString_4503 = Class134.method1914("(R", (byte) 71);
	anInt4512 = 0;
	aRSString_4505
	    = Class134.method1914(" est d-Bj-9 dans votre liste noire)3",
				  (byte) 118);
    }
}
