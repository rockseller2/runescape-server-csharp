/* Class67_Sub5_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class67_Sub5_Sub19 extends Class67_Sub5
{
    public int anInt4812;
    public int anInt4813;
    public int anInt4814;
    public int anInt4815;
    public static int anInt4816;
    public int anInt4817;
    public static int[] anIntArray4818 = new int[99];
    public static RSString aRSString_4819;
    public static boolean aBoolean4820;
    public static RSString aRSString_4821;
    public static int anInt4822;
    public static int[] anIntArray4823;
    public static RSString aRSString_4824;
    public int anInt4825;
    public static volatile long aLong4826;
    public static RSString aRSString_4827;
    public static int anInt4828;
    public static RSString aRSString_4829;
    
    public abstract void method1000(int i, int i_0_, int i_1_);
    
    public static void method1001(byte arg0) {
	try {
	    aRSString_4827 = null;
	    anIntArray4823 = null;
	    aRSString_4824 = null;
	    anIntArray4818 = null;
	    aRSString_4829 = null;
	    aRSString_4821 = null;
	    if (arg0 == 127)
		aRSString_4819 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "vc.EA(" + arg0 + ')');
	}
    }
    
    public abstract void method1002(int i, int i_2_, int i_3_, int i_4_,
				    int i_5_, int i_6_);
    
    public abstract void method1003(int i, int i_7_);
    
    public abstract void method1004(int i, int i_8_, int i_9_, int i_10_);
    
    public abstract void method1005(int i, int i_11_);
    
    public abstract void method1006(int i, int i_12_);
    
    public abstract void method1007(int i, int i_13_, int i_14_, int i_15_,
				    int i_16_);
    
    public void method1008(int arg0, int arg1, boolean arg2, int arg3,
			   int arg4) {
	try {
	    anInt4816++;
	    if (arg2 != true)
		anInt4817 = -92;
	    int i = anInt4825 << -1705887709;
	    arg3 = (0xf & i) + (arg3 << 733438596);
	    int i_17_ = anInt4815 << 1822771107;
	    arg1 = (arg1 << -831459004) - -(i_17_ & 0xf);
	    method1002(i, i_17_, arg3, arg1, arg0, arg4);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("vc.DA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    static {
	int i = 0;
	for (int i_18_ = 0; i_18_ < 99; i_18_++) {
	    int i_19_ = i_18_ + 1;
	    int i_20_ = (int) (Math.pow(2.0, (double) i_19_ / 7.0) * 300.0
			       + (double) i_19_);
	    i += i_20_;
	    anIntArray4818[i_18_] = i / 4;
	}
	aBoolean4820 = false;
	anIntArray4823 = new int[2];
	aRSString_4819 = Class134.method1914("Loaded title screen", (byte) 67);
	aLong4826 = 0L;
	aRSString_4829 = Class134.method1914("Members object", (byte) 68);
	aRSString_4824 = aRSString_4819;
	aRSString_4827 = Class134.method1914("<)4col> x", (byte) 112);
	aRSString_4821 = aRSString_4829;
    }
}
