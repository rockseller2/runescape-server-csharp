import java.awt.Image;

public class Class21
{
    public int anInt512;
    public static int anInt513;
    public static int anInt514 = 0;
    public int anInt515;
    public int anInt516;
    public int anInt517;
    public static int anInt518;
    public static Image anImage519;
    public static int anInt520;
    public int anInt521;
    public static RSString aRSString_522;
    public static RSString aRSString_523
	= Class134.method1914("tbrefresh", (byte) 118);
    public static int anInt524;
    public int anInt525;
    
    public static int method197(byte arg0, Class7 arg1, int arg2) {
	anInt520++;
	if (!client.method31(arg1).method1229((byte) -117, arg2)
	    && arg1.anObjectArray200 == null)
	    return -1;
	if (arg0 >= -47)
	    return -87;
	if (arg1.anIntArray182 != null && arg1.anIntArray182.length > arg2)
	    return arg1.anIntArray182[arg2];
	return -1;
    }
    
    public static void method198(byte arg0, int arg1) {
	Class54.anInt1081 = 20;
	if (arg0 <= 30)
	    method197((byte) -64, null, -18);
	Class67_Sub1_Sub9.anInt3960 = 3;
	anInt518++;
	Class62.anInt1159 = arg1;
    }
    
    public static void method199(int arg0) {
	aRSString_522 = null;
	aRSString_523 = null;
	anImage519 = null;
	if (arg0 <= 103)
	    method199(-127);
    }
    
    static {
	aRSString_522 = Class134.method1914("0", (byte) 53);
    }
}
