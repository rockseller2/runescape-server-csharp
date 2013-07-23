public abstract class Class126
{
    public static RSString aRSString_2344
	= Class134.method1914("Jan", (byte) 85);
    public static int[] anIntArray2345;
    public static int anInt2346;
    public static RSString aRSString_2347;
    public static RSString aRSString_2348;
    public static RSString aRSString_2349;
    public static RSString[] aRSStringArray2350;
    public int anInt2351;
    public static RSString aRSString_2352
	= Class134.method1914("Choisir une option", (byte) 115);
    public static RSString aRSString_2353;
    public static int anInt2354;
    public int anInt2355;
    public static RSString aRSString_2356;
    public static RSString aRSString_2357;
    public int anInt2358;
    public static RSString aRSString_2359;
    public static int anInt2360;
    public static int[] anIntArray2361;
    public static RSString aRSString_2362;
    public static RSString aRSString_2363;
    public static RSString aRSString_2364;
    public static RSString aRSString_2365;
    public static RSString aRSString_2366;
    
    public abstract void method1708(byte i, int i_0_, int i_1_);
    
    public static Class119 method1709(int arg0, Class9 arg1, int arg2) {
	try {
	    if (arg2 <= 88)
		return null;
	    anInt2346++;
	    if (!Class131_Sub3.method1806(arg1, arg0, 104))
		return null;
	    return Class114.method1608((byte) 120);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("u.C(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public abstract void method1710(int i, int i_2_, byte i_3_);
    
    public Class126(int arg0, int arg1, int arg2) {
	try {
	    anInt2351 = arg1;
	    anInt2355 = arg2;
	    anInt2358 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("u.<init>(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1711(byte arg0) {
	try {
	    aRSString_2365 = null;
	    aRSString_2353 = null;
	    aRSStringArray2350 = null;
	    aRSString_2357 = null;
	    anIntArray2345 = null;
	    aRSString_2344 = null;
	    aRSString_2356 = null;
	    aRSString_2347 = null;
	    aRSString_2364 = null;
	    aRSString_2362 = null;
	    aRSString_2359 = null;
	    aRSString_2352 = null;
	    anIntArray2361 = null;
	    aRSString_2349 = null;
	    aRSString_2366 = null;
	    aRSString_2348 = null;
	    if (arg0 > -83)
		aRSString_2364 = null;
	    aRSString_2363 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "u.E(" + arg0 + ')');
	}
    }
    
    public abstract void method1712(byte i, int i_4_, int i_5_);
    
    static {
	anIntArray2345 = new int[4096];
	aRSString_2349 = Class134.method1914("Mem:", (byte) 18);
	aRSString_2357 = Class134.method1914("Jun", (byte) 75);
	aRSString_2356 = Class134.method1914("Sep", (byte) 13);
	aRSString_2347 = Class134.method1914("Nov", (byte) 48);
	aRSString_2359 = Class134.method1914("Jul", (byte) 126);
	anInt2360 = 0;
	aRSString_2362 = Class134.method1914("Mar", (byte) 95);
	anIntArray2361 = new int[50];
	aRSString_2363 = Class134.method1914("Aug", (byte) 72);
	aRSString_2348 = Class134.method1914("Dec", (byte) 63);
	aRSString_2364 = Class134.method1914("May", (byte) 98);
	aRSString_2353 = Class134.method1914("Apr", (byte) 103);
	aRSString_2366 = Class134.method1914("Feb", (byte) 21);
	aRSString_2365 = Class134.method1914("Oct", (byte) 51);
	aRSStringArray2350
	    = new RSString[] { aRSString_2344, aRSString_2366, aRSString_2362,
			      aRSString_2353, aRSString_2364, aRSString_2357,
			      aRSString_2359, aRSString_2363, aRSString_2356,
			      aRSString_2365, aRSString_2347, aRSString_2348 };
    }
}
