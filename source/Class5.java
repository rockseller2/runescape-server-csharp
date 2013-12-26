/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class5 implements Runnable
{
    public static int anInt133;
    public static int anInt134;
    public static RSString aRSString_135;
    public static int[][][] anIntArrayArrayArray136 = new int[4][13][13];
    public static int anInt137;
    public static int anInt138;
    public Object anObject139;
    public boolean aBoolean140 = true;
    public static Class9 aClass9_141;
    public static byte[] aByteArray142;
    public static Class119[] aClass119Array143;
    public static int anInt144;
    public int[] anIntArray145;
    public int anInt146;
    public int[] anIntArray147;
    
    public static void method78(int arg0) {
	aRSString_135 = null;
	aClass9_141 = null;
	anIntArrayArrayArray136 = null;
	aClass119Array143 = null;
	if (arg0 != 4)
	    anInt138 = -56;
	aByteArray142 = null;
    }
    
    public void run() {
	anInt134++;
	while (aBoolean140) {
	    synchronized (anObject139) {
		if ((anInt146 ^ 0xffffffff) > -501) {
		    anIntArray147[anInt146] = Class67_Sub5_Sub17.anInt4786;
		    anIntArray145[anInt146] = Class67_Sub1_Sub22.anInt4172;
		    anInt146++;
		}
	    }
	    Class67_Sub1_Sub23.method726(-128, 50L);
	}
    }
    
    public Class5() {
	anObject139 = new Object();
	anIntArray147 = new int[500];
	anIntArray145 = new int[500];
	anInt146 = 0;
    }
    
    static {
	aRSString_135 = Class134.method1914("::rebuild", (byte) 89);
	anInt137 = 0;
	anInt144 = 0;
    }
}
