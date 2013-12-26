/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class108
{
    public static int anInt2075 = 0;
    public static Sprites aSprite_2076;
    public static int anInt2077;
    public static int anInt2078;
    public static int anInt2079;
    public static byte[] aByteArray2080
	= { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109,
	    110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122,
	    48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
    public static int[] anIntArray2081 = { 8, 11, 4, 6, 9, 7, 10, 0 };
    public static Class34[] aClass34Array2082;
    public static int[] anIntArray2083;
    public static RSString aRSString_2084
	= Class134.method1914(" <col=00ff80>", (byte) 42);
    
    public static void method1573(boolean arg0, int arg1, byte arg2, int arg3,
				  int arg4) {
	anInt2079++;
	if (arg2 != 91)
	    method1573(false, 85, (byte) -100, 94, 27);
	if (Class67_Sub5_Sub15.method977(arg4, false))
	    Class67_Sub5_Sub7.method873(arg3, arg1, -1, (byte) 100,
					(Class67_Sub1_Sub5
					 .aClass7ArrayArray3878[arg4]),
					arg0);
    }
    
    public static void method1574(byte arg0) {
	aClass34Array2082 = null;
	aByteArray2080 = null;
	aRSString_2084 = null;
	aSprite_2076 = null;
	anIntArray2083 = null;
	anIntArray2081 = null;
	if (arg0 != 106)
	    method1573(true, -11, (byte) -58, -2, -67);
    }
    
    public static Class120 method1575(int arg0, int arg1, int arg2) {
	anInt2078++;
	Class120 class120 = new Class120();
	if (arg2 != -29055)
	    anIntArray2081 = null;
	for (Class67_Sub5_Sub6 class67_sub5_sub6
		 = (Class67_Sub5_Sub6) Class10.aClass50_399.method445(0);
	     class67_sub5_sub6 != null;
	     class67_sub5_sub6
		 = (Class67_Sub5_Sub6) Class10.aClass50_399.method432(0)) {
	    if (class67_sub5_sub6.aBoolean4559
		&& class67_sub5_sub6.method869(arg0, arg1, false))
		class120.method1663(class67_sub5_sub6, -225);
	}
	return class120;
    }
    
    public abstract void method1576(byte i, byte[] is);
    
    public abstract byte[] method1577(byte i);
    
    static {
	aClass34Array2082 = new Class34[6];
    }
}
