/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class86
{
    public static int anInt1752;
    public static boolean aBoolean1753;
    public static int anInt1754;
    public static Class92 aClass92_1755 = new Class92(32);
    public static Class27 aClass27_1756;
    public int[] anIntArray1757;
    public static int anInt1758;
    public static Class7 aClass7_1759;
    public static int anInt1760;
    public static int anInt1761;
    public static Class9 aClass9_1762;
    public static int anInt1763;
    public static Class117 aClass117_1764;
    public static RSString aRSString_1765
	= Class134.method1914("Number of player models in cache:", (byte) 10);
    public static RSString aRSString_1766 = Class134.method1914("k", (byte) 46);
    public static int anInt1767 = 1;
    public static int anInt1768;
    
    public static void method1455(int arg0) {
	anInt1752++;
	if (arg0 != 1)
	    method1458(-33, (byte) -112);
	for (Class67_Sub5_Sub15 class67_sub5_sub15
		 = (Class67_Sub5_Sub15) Class102.aClass50_2000.method445(0);
	     class67_sub5_sub15 != null;
	     class67_sub5_sub15
		 = (Class67_Sub5_Sub15) Class102.aClass50_2000.method432(0)) {
	    ObjectDef class131_sub1
		= class67_sub5_sub15.aObjectDef_4752;
	    if ((Canvas_Sub1.anInt59 ^ 0xffffffff) == (class131_sub1.anInt3520
						       ^ 0xffffffff)
		&& !class131_sub1.aBoolean3531) {
		if (Class67_Sub1_Sub9.anInt3952 >= class131_sub1.anInt3532) {
		    class131_sub1.method1775(RSString.anInt2642, -121);
		    if (!class131_sub1.aBoolean3531)
			Class131_Sub7.method1885(class131_sub1.anInt3520,
						 class131_sub1.anInt3536,
						 class131_sub1.anInt3528,
						 class131_sub1.anInt3521, 60,
						 class131_sub1, 0, -1L, false);
		    else
			class67_sub5_sub15.method606((byte) -118);
		}
	    } else
		class67_sub5_sub15.method606((byte) -118);
	}
    }
    
    public static void method1456(byte arg0) {
	if (arg0 == -1) {
	    aClass7_1759 = null;
	    aClass92_1755 = null;
	    aClass117_1764 = null;
	    aRSString_1766 = null;
	    aRSString_1765 = null;
	    aClass9_1762 = null;
	    aClass27_1756 = null;
	}
    }
    
    public int method1457(int arg0, int arg1) {
	if (arg0 > -122)
	    method1456((byte) -106);
	anInt1754++;
	int i = -1 + (anIntArray1757.length >> -1951984607);
	int i_0_ = arg1 & i;
	for (;;) {
	    int i_1_ = anIntArray1757[i_0_ + i_0_ + 1];
	    if ((i_1_ ^ 0xffffffff) == 0)
		return -1;
	    if ((anIntArray1757[i_0_ - -i_0_] ^ 0xffffffff)
		== (arg1 ^ 0xffffffff))
		return i_1_;
	    i_0_ = i & i_0_ + 1;
	}
    }
    
    public static void method1458(int arg0, byte arg1) {
	anInt1758++;
	Class122.aClass136_2303.method1920(arg0, 127);
	if (arg1 <= 21)
	    anInt1768 = -83;
    }
    
    public Class86(int[] arg0) {
	int i;
	for (i = 1; (arg0.length >> -1778886239) + arg0.length >= i; i <<= 1) {
	    /* empty */
	}
	anIntArray1757 = new int[i + i];
	for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i + i ^ 0xffffffff); i_2_++)
	    anIntArray1757[i_2_] = -1;
	for (int i_3_ = 0; arg0.length > i_3_; i_3_++) {
	    int i_4_;
	    for (i_4_ = arg0[i_3_] & -1 + i;
		 anIntArray1757[1 + (i_4_ + i_4_)] != -1;
		 i_4_ = i + -1 & i_4_ + 1) {
		/* empty */
	    }
	    anIntArray1757[i_4_ - -i_4_] = arg0[i_3_];
	    anIntArray1757[i_4_ + i_4_ + 1] = i_3_;
	}
    }
    
    static {
	anInt1763 = 0;
	anInt1768 = -1;
    }
}
