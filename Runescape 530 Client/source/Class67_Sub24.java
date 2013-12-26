/* Class67_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub24 extends Class67
{
    public static int anInt3212;
    public static Class50 aClass50_3213 = new Class50();
    public static int anInt3214;
    public int anInt3215;
    public Class104 aClass104_3216;
    public int anInt3217;
    public int anInt3218;
    public Class71 aClass71_3219;
    public Class88 aClass88_3220;
    public Class58 aClass58_3221;
    public int[] anIntArray3222;
    public boolean aBoolean3223;
    public Class94 aClass94_3224;
    public int anInt3225;
    public boolean aBoolean3226;
    public Class84 aClass84_3227;
    public int anInt3228;
    public Class36[] aClass36Array3229 = new Class36[5];
    public int anInt3230;
    public boolean aBoolean3231;
    public int anInt3232;
    public Class67_Sub24 aClass67_Sub24_3233;
    public static Class136 aClass136_3234 = new Class136(50);
    public int anInt3235;
    public int anInt3236 = 0;
    public static Class67_Sub5_Sub19 aClass67_Sub5_Sub19_3237;
    public static int anInt3238;
    public static RSString aRSString_3239;
    public int anInt3240;
    public static RSString aRSString_3241;
    public static RSString aRSString_3242
	= Class134.method1914("(Y<)4col>", (byte) 119);
    public static RSString aRSString_3243;
    public static RSString aRSString_3244;
    public static Class9 aClass9_3245;
    
    public Class67_Sub24(int arg0, int arg1, int arg2) {
	anIntArray3222 = new int[5];
	anInt3217 = arg2;
	anInt3218 = arg1;
	anInt3235 = anInt3232 = arg0;
    }
    
    public static void method1289(int arg0) {
	aRSString_3244 = null;
	aRSString_3243 = null;
	aClass50_3213 = null;
	aRSString_3239 = null;
	aRSString_3242 = null;
	aClass136_3234 = null;
	aClass9_3245 = null;
	aClass67_Sub5_Sub19_3237 = null;
	aRSString_3241 = null;
	if (arg0 != -21485)
	    aRSString_3244 = null;
    }
    
    public static Class9 method1290(boolean arg0, boolean arg1, int arg2,
				    boolean arg3, int arg4) {
	anInt3212++;
	Class20 class20 = null;
	if (arg4 != 6021)
	    return null;
	if (Class67_Sub10.aClass115_3009 != null)
	    class20 = new Class20(arg2, Class67_Sub10.aClass115_3009,
				  Class43.aClass115Array903[arg2], 1000000);
	Class82.aClass129_Sub1Array1666[arg2]
	    = Class67_Sub17.aClass142_3099.method1950(false, arg2,
						      (Class67_Sub1_Sub33
						       .aClass20_4314),
						      class20);
	if (arg1)
	    Class82.aClass129_Sub1Array1666[arg2].method1754((byte) -31);
	return new Class9(Class82.aClass129_Sub1Array1666[arg2], arg0, arg3);
    }
    
    public static void method1291(int arg0, int arg1) {
	anInt3214++;
	if ((arg0 ^ 0xffffffff) != 0 && PacketParser.aBooleanArray2102[arg0]) {
	    Class55_Sub3_Sub1.aClass9_3810.method128(arg0, (byte) -105);
	    if (Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0] != null) {
		boolean bool = true;
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0].length
			 ^ 0xffffffff));
		     i++) {
		    if (Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0][i]
			!= null) {
			if ((Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0][i]
			     .anInt227)
			    == 2)
			    bool = false;
			else
			    Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0][i]
				= null;
		    }
		}
		if (arg1 != -556)
		    method1290(false, false, -82, false, -128);
		if (bool)
		    Class67_Sub1_Sub5.aClass7ArrayArray3878[arg0] = null;
		PacketParser.aBooleanArray2102[arg0] = false;
	    }
	}
    }
    
    static {
	aRSString_3241 = Class134.method1914("Loaded fonts", (byte) 74);
	aRSString_3243
	    = (Class134.method1914
	       ("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3",
		(byte) 87));
	aRSString_3239 = aRSString_3243;
	aRSString_3244 = aRSString_3241;
    }
}
