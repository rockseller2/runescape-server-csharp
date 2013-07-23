/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class8
{
    public static RSString[] aRSStringArray340 = new RSString[500];
    public static int anInt341;
    public static int anInt342;
    public static Class136 aClass136_343 = new Class136(64);
    public static RSString aRSString_344
	= Class134.method1914("jaune:", (byte) 12);
    public static int[] anIntArray345 = new int[128];
    public static RSString aRSString_346;
    public static RSString aRSString_347 = Class134.method1914("", (byte) 66);
    public static int anInt348;
    public static int anInt349;
    public static int anInt350;
    
    public static Class126_Sub2 method101(int arg0, Stream arg1) {
	if (arg0 != 64)
	    method102(-95);
	anInt342++;
	return new Class126_Sub2(arg1.readShort2((byte) 98),
				 arg1.readShort2((byte) 124),
				 arg1.readShort2((byte) 126),
				 arg1.readShort2((byte) 72),
				 arg1.readShort2((byte) 100),
				 arg1.readShort2((byte) 78),
				 arg1.readShort2((byte) 69),
				 arg1.readShort2((byte) 90),
				 arg1.readThreeBytes(65280),
				 arg1.readByte((byte) -126));
    }
    
    public static void method102(int arg0) {
	aRSString_344 = null;
	aRSString_346 = null;
	aClass136_343 = null;
	aRSString_347 = null;
	anIntArray345 = null;
	if (arg0 != 0)
	    method103(-15, -92);
	aRSStringArray340 = null;
    }
    
    public static Class67_Sub5_Sub17 method103(int arg0, int arg1) {
	if (arg0 > -83)
	    return null;
	Class67_Sub5_Sub17 class67_sub5_sub17
	    = ((Class67_Sub5_Sub17)
	       Class87.aClass137_1771.method1930(261775, (long) arg1));
	anInt341++;
	if (class67_sub5_sub17 != null)
	    return class67_sub5_sub17;
	byte[] is = Class130.aClass9_2421.method138(-809612665, arg1, 11);
	class67_sub5_sub17 = new Class67_Sub5_Sub17();
	if (is != null)
	    class67_sub5_sub17.method991(4572, new Stream(is));
	Class87.aClass137_1771.method1932((long) arg1, 0, class67_sub5_sub17);
	return class67_sub5_sub17;
    }
    
    static {
	aRSString_346 = Class134.method1914("Fps:", (byte) 21);
	anInt348 = 1;
	anInt349 = 0;
    }
}
