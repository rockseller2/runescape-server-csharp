/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class94
{
    public long aLong1886 = 0L;
    public int anInt1887;
    public static Class9 aClass9_1888;
    public int anInt1889;
    public int anInt1890;
    public static int anInt1891;
    public int anInt1892;
    public int anInt1893;
    public Class131 aClass131_1894;
    public static Class9 aClass9_1895;
    public Class131 aClass131_1896;
    public int anInt1897;
    public int anInt1898;
    public static int[] anIntArray1899 = { 16, 32, 64, 128 };
    
    public static int method1496(int arg0, int arg1) {
	arg1 = arg1 * (arg0 & 0x7f) >> 7;
	if (arg1 < 2)
	    arg1 = 2;
	else if (arg1 > 126)
	    arg1 = 126;
	return (arg0 & 0xff80) + arg1;
    }
    
    public static void method1497(Class9 arg0, Class9 arg1, boolean arg2) {
	try {
	    Class36.aClass9_774 = arg0;
	    if (arg2 != true)
		method1496(23, 82);
	    anInt1891++;
	    Class131_Sub4.aClass9_3644 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("nf.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1498(int arg0) {
	aClass9_1895 = null;
	if (arg0 != 32)
	    method1497(null, null, false);
	anIntArray1899 = null;
	aClass9_1888 = null;
    }
}
