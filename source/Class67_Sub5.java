/* Class67_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5 extends Class67
{
    public static Class115 aClass115_2858;
    public static int anInt2859;
    public static int anInt2860;
    public Class67_Sub5 aClass67_Sub5_2861;
    public static int anInt2862 = 0;
    public long aLong2863;
    public static RSString aRSString_2864 = Class134.method1914("ul", (byte) 55);
    public static Class78 aClass78_2865;
    public static int anInt2866;
    public Class67_Sub5 aClass67_Sub5_2867;
    
    public static void method820(int arg0) {
	aClass78_2865 = null;
	aRSString_2864 = null;
	aClass115_2858 = null;
	int i = 86 / ((arg0 - 77) / 32);
    }
    
    public void method821(int arg0) {
	if (arg0 != 24120)
	    aRSString_2864 = null;
	anInt2866++;
	if (aClass67_Sub5_2867 != null) {
	    aClass67_Sub5_2867.aClass67_Sub5_2861 = aClass67_Sub5_2861;
	    aClass67_Sub5_2861.aClass67_Sub5_2867 = aClass67_Sub5_2867;
	    aClass67_Sub5_2861 = null;
	    aClass67_Sub5_2867 = null;
	}
    }
    
    public static int method822(int arg0, int arg1, byte arg2) {
	anInt2859++;
	if (arg2 < 110)
	    anInt2862 = -104;
	int i = 1;
	for (/**/; arg1 > 1; arg1 >>= 1) {
	    if ((0x1 & arg1 ^ 0xffffffff) != -1)
		i *= arg0;
	    arg0 *= arg0;
	}
	if (arg1 == 1)
	    return i * arg0;
	return i;
    }
}
