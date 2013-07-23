/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67
{
    public static int anInt1334;
    public static int[] anIntArray1335 = new int[200];
    public static RSString aRSString_1336
	= Class134.method1914("Loaded textures", (byte) 109);
    public static RSString aRSString_1337;
    public static RSString aRSString_1338;
    public static RSString aRSString_1339
	= Class134.method1914("Shift)2click disabled)3", (byte) 78);
    public Class67 aClass67_1340;
    public static RSString aRSString_1341
	= Class134.method1914("Loaded config", (byte) 121);
    public static int anInt1342;
    public static RSString aRSString_1343;
    public long aLong1344;
    public static RSString aRSString_1345;
    public static int anInt1346;
    public static int anInt1347;
    public static Class9 aClass9_1348;
    public Class67 aClass67_1349;
    
    public boolean method605(byte arg0) {
	anInt1346++;
	if (arg0 >= -82)
	    method608(true);
	if (aClass67_1349 == null)
	    return false;
	return true;
    }
    
    public void method606(byte arg0) {
	anInt1347++;
	if (aClass67_1349 != null) {
	    aClass67_1349.aClass67_1340 = aClass67_1340;
	    aClass67_1340.aClass67_1349 = aClass67_1349;
	    if (arg0 == -118) {
		aClass67_1349 = null;
		aClass67_1340 = null;
	    }
	}
    }
    
    public static void method607(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 byte arg8) {
	anInt1334++;
	int i = -arg5 + arg2;
	if (arg8 >= -47)
	    aRSString_1337 = null;
	int i_0_ = -arg1 + arg4;
	int i_1_ = (-arg7 + arg0 << -813357168) / i;
	int i_2_ = (arg3 + -arg6 << -493611472) / i_0_;
	Class131_Sub7.method1875(arg2, i_2_, arg1, arg7, 16777215, arg5, 0,
				 arg6, arg4, i_1_, 0);
    }
    
    public static void method608(boolean arg0) {
	aRSString_1338 = null;
	aRSString_1336 = null;
	aRSString_1339 = null;
	aRSString_1345 = null;
	if (arg0 != true)
	    method607(127, 80, -84, -83, 12, -128, -117, -29, (byte) -118);
	anIntArray1335 = null;
	aRSString_1337 = null;
	aClass9_1348 = null;
	aRSString_1343 = null;
	aRSString_1341 = null;
    }
    
    static {
	aRSString_1337 = Class134.method1914("Started 3d Library", (byte) 12);
	anInt1342 = 50;
	aRSString_1345 = aRSString_1337;
	aRSString_1343 = aRSString_1341;
	aRSString_1338 = aRSString_1336;
    }
}
