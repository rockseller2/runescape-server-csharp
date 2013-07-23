/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class58
{
    public static RSString aRSString_1113
	= Class134.method1914("Connecting to update server", (byte) 23);
    public static int anInt1114;
    public Class131 aClass131_1115;
    public static RSString aRSString_1116 = aRSString_1113;
    public static int baseX;
    public long aLong1118 = 0L;
    public static int anInt1119;
    public int anInt1120;
    public Class131 aClass131_1121;
    public int anInt1122;
    public int anInt1123;
    public int anInt1124;
    public int anInt1125;
    
    public static void method491(boolean arg0) {
	if (arg0 != false)
	    baseX = -16;
	aRSString_1116 = null;
	aRSString_1113 = null;
    }
    
    public static Class47 method492(int arg0, int arg1) {
	anInt1114++;
	Class47 class47 = (Class47) Class67_Sub1_Sub9.aClass136_3934
					.method1924((long) arg0, false);
	if (class47 != null)
	    return class47;
	if (arg1 != 8629)
	    return null;
	byte[] is = Class67_Sub24.aClass9_3245.method138(-809612665, arg0, 3);
	class47 = new Class47();
	if (is != null)
	    class47.method414((byte) -60, new Stream(is));
	Class67_Sub1_Sub9.aClass136_3934.method1926((long) arg0, class47,
						    (byte) -71);
	return class47;
    }
}
