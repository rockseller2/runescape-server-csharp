/* Class55_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55_Sub2 extends Class55
{
    public static RSString aRSString_2797;
    public static int anInt2798;
    public static Sprites aSprite_2799;
    public static int anInt2800;
    public static int anInt2801;
    public static int[] anIntArray2802 = new int[500];
    public static int anInt2803;
    public static RSString aRSString_2804;
    public static int anInt2805;
    public static int anInt2806;
    
    public static void method469(int arg0) {
	aRSString_2797 = null;
	anIntArray2802 = null;
	if (arg0 == 0) {
	    aRSString_2804 = null;
	    aSprite_2799 = null;
	}
    }
    
    public static void method470(int arg0) {
	int i = OutputStream_Sub1.method59(0);
	if (arg0 != 512)
	    aRSString_2797 = null;
	anInt2803++;
	if ((i ^ 0xffffffff) == -1) {
	    ObjectDef.aByteArrayArrayArray3518 = null;
	    Class23.method213((byte) -39, 0);
	} else if ((i ^ 0xffffffff) == -2) {
	    Class11.method146(60, (byte) 0);
	    Class23.method213((byte) -39, 512);
	    Class67_Sub1_Sub27.method746(73);
	} else {
	    Class11.method146(72, (byte) (0xff & Class6.anInt151 + -4));
	    Class23.method213((byte) -39, 2);
	}
    }
    
    static {
	anInt2801 = 0;
	aRSString_2804
	    = (Class134.method1914
	       ("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q",
		(byte) 126));
	anInt2800 = 0;
	aRSString_2797 = Class134.method1914(" (X", (byte) 27);
	anInt2805 = 0;
    }
}
