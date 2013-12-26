/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95
{
    public static long aLong1900;
    public static RSString aRSString_1901
	= Class134.method1914("Connexion perdue)3", (byte) 89);
    public static Class67_Sub5_Sub19[] aClass67_Sub5_Sub19Array1902;
    public int anInt1903;
    public static RSString aRSString_1904;
    public static int anInt1905;
    public static int anInt1906 = -1;
    public static int anInt1907;
    public static int anInt1908;
    public static int anInt1909;
    public static RSString aRSString_1910;
    public RSString aRSString_1911;
    
    public static void method1499(int arg0, Class9 arg1) {
	anInt1905++;
	Class67_Sub1_Sub27.aClass9_4242 = arg1;
	int i = -4 / ((-11 - arg0) / 53);
    }
    
    public static void method1500(boolean arg0) {
	aRSString_1904 = null;
	aClass67_Sub5_Sub19Array1902 = null;
	aRSString_1910 = null;
	aRSString_1901 = null;
	if (arg0 != true)
	    method1501(18, 50, null);
    }
    
    public static RSString method1501(int arg0, int arg1, Stream arg2) {
	anInt1907++;
	try {
	    int i = arg2.method1070(-119);
	    if ((i ^ 0xffffffff) < (arg0 ^ 0xffffffff))
		i = arg0;
	    byte[] is = new byte[i];
	    arg2.currentOffset
		+= Class86.aClass27_1756.method255(arg2.buffer,
						   (byte) -19, is,
						   arg2.currentOffset, i, 0);
	    RSString RSString = Class34.method303(is, arg1, i, 0);
	    return RSString;
	} catch (Exception exception) {
	    return Class67_Sub5_Sub11.aRSString_4671;
	}
    }
    
    static {
	aRSString_1904 = Class134.method1914("<img=1>", (byte) 60);
	aLong1900 = 0L;
	aRSString_1910 = Class134.method1914(" loggt sich aus)3", (byte) 6);
	anInt1909 = 0;
    }
}
