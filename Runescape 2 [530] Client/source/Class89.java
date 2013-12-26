/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class89
{
    public static int anInt1829;
    public static int anInt1830;
    public static int[] anIntArray1831
	= { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
    public static Class9 aClass9_1832;
    public static int anInt1833;
    public static int anInt1834;
    public static int anInt1835;
    public static RSString aRSString_1836;
    public static RSString[] aRSStringArray1837 = null;
    public static RSString aRSString_1838;
    public static int anInt1839;
    
    public static void method1467(int arg0, Class9 arg1) {
	Class11.aClass9_410 = arg1;
	if (arg0 != 0)
	    method1470(95);
	anInt1835++;
    }
    
    public static boolean method1468(int arg0) {
	anInt1839++;
	if (arg0 != Class67_Sub11_Sub4.anInt4888)
	    return true;
	return Class136.aClass67_Sub11_Sub4_2485.method1205((byte) 92);
    }
    
    public static void method1469(int arg0, int arg1, byte arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8) {
	int i = -arg1 + arg6;
	if (arg2 == 97) {
	    int i_0_ = arg4 - arg5;
	    int i_1_ = (-arg8 + arg3 << 1204844976) / i;
	    int i_2_ = (arg7 + -arg0 << 1878247632) / i_0_;
	    anInt1834++;
	    Class33.method292(i_2_, 30079, 0, arg5, arg6, arg8, arg1, 0, arg4,
			      i_1_, arg0);
	}
    }
    
    public static void method1470(int arg0) {
	aRSStringArray1837 = null;
	aRSString_1838 = null;
	aRSString_1836 = null;
	if (arg0 > 44) {
	    anIntArray1831 = null;
	    aClass9_1832 = null;
	}
    }
    
    public static int method1471(Class7 arg0, int arg1, byte arg2) {
	anInt1830++;
	if (arg0.anIntArrayArray260 == null
	    || arg1 >= arg0.anIntArrayArray260.length)
	    return -2;
	int i = -110 / ((29 - arg2) / 46);
	try {
	    int i_3_ = 0;
	    int[] is = arg0.anIntArrayArray260[arg1];
	    int i_4_ = 0;
	    int i_5_ = 0;
	    for (;;) {
		int i_6_ = is[i_3_++];
		int i_7_ = 0;
		int i_8_ = 0;
		if (i_6_ == 0)
		    return i_5_;
		if ((i_6_ ^ 0xffffffff) == -16)
		    i_8_ = 1;
		if ((i_6_ ^ 0xffffffff) == -2)
		    i_7_ = Class30.anIntArray700[is[i_3_++]];
		if (i_6_ == 16)
		    i_8_ = 2;
		if ((i_6_ ^ 0xffffffff) == -18)
		    i_8_ = 3;
		if ((i_6_ ^ 0xffffffff) == -3)
		    i_7_ = Class139.anIntArray2538[is[i_3_++]];
		if (i_6_ == 3)
		    i_7_ = Class83.anIntArray1682[is[i_3_++]];
		if (i_6_ == 4) {
		    int i_9_ = is[i_3_++] << -1699379184;
		    i_9_ += is[i_3_++];
		    Class7 class7 = Class3.method69((byte) 110, i_9_);
		    int i_10_ = is[i_3_++];
		    if (i_10_ != -1
			&& (!PacketParser.method1596(i_10_, -28322).aBoolean1505
			    || Class70.aBoolean1393)) {
			for (int i_11_ = 0;
			     class7.anIntArray264.length > i_11_; i_11_++) {
			    if (class7.anIntArray264[i_11_] == i_10_ - -1)
				i_7_ += class7.anIntArray253[i_11_];
			}
		    }
		}
		if ((i_6_ ^ 0xffffffff) == -6)
		    i_7_ = Class137.anIntArray2504[is[i_3_++]];
		if ((i_6_ ^ 0xffffffff) == -7)
		    i_7_ = (Class67_Sub5_Sub19.anIntArray4818
			    [Class139.anIntArray2538[is[i_3_++]] - 1]);
		if ((i_6_ ^ 0xffffffff) == -8)
		    i_7_ = Class137.anIntArray2504[is[i_3_++]] * 100 / 46875;
		if ((i_6_ ^ 0xffffffff) == -9)
		    i_7_ = Class122.aClass131_Sub7_Sub2_2309.combatLevel;
		if ((i_6_ ^ 0xffffffff) == -10) {
		    for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -26; i_12_++) {
			if (Class126_Sub4.aBooleanArray3465[i_12_])
			    i_7_ += Class139.anIntArray2538[i_12_];
		    }
		}
		if ((i_6_ ^ 0xffffffff) == -11) {
		    int i_13_ = is[i_3_++] << 612904272;
		    i_13_ += is[i_3_++];
		    Class7 class7 = Class3.method69((byte) 110, i_13_);
		    int i_14_ = is[i_3_++];
		    if ((i_14_ ^ 0xffffffff) != 0
			&& (!PacketParser.method1596(i_14_, -28322).aBoolean1505
			    || Class70.aBoolean1393)) {
			for (int i_15_ = 0;
			     ((i_15_ ^ 0xffffffff)
			      > (class7.anIntArray264.length ^ 0xffffffff));
			     i_15_++) {
			    if (class7.anIntArray264[i_15_] == i_14_ + 1) {
				i_7_ = 999999999;
				break;
			    }
			}
		    }
		}
		if (i_6_ == 11)
		    i_7_ = Class67_Sub9.anInt2969;
		if (i_6_ == 12)
		    i_7_ = Class132.anInt2444;
		if (i_6_ == 13) {
		    int i_16_ = Class137.anIntArray2504[is[i_3_++]];
		    int i_17_ = is[i_3_++];
		    i_7_ = (1 << i_17_ & i_16_) == 0 ? 0 : 1;
		}
		if ((i_6_ ^ 0xffffffff) == -15) {
		    int i_18_ = is[i_3_++];
		    i_7_ = Class67_Sub9.method1113(22255, i_18_);
		}
		if ((i_6_ ^ 0xffffffff) == -19)
		    i_7_ = (Class58.baseX
			    + (Class122.aClass131_Sub7_Sub2_2309.anInt3733
			       >> -78911737));
		if (i_6_ == 19)
		    i_7_ = (Class122.aClass131_Sub7_Sub2_2309.anInt3726
			    >> 1489501799) - -Class137.baseY;
		if ((i_6_ ^ 0xffffffff) == -21)
		    i_7_ = is[i_3_++];
		if (i_8_ != 0)
		    i_4_ = i_8_;
		else {
		    if (i_4_ == 0)
			i_5_ += i_7_;
		    if ((i_4_ ^ 0xffffffff) == -2)
			i_5_ -= i_7_;
		    if (i_4_ == 2 && i_7_ != 0)
			i_5_ /= i_7_;
		    if ((i_4_ ^ 0xffffffff) == -4)
			i_5_ *= i_7_;
		    i_4_ = 0;
		}
	    }
	} catch (Exception exception) {
	    return -1;
	}
    }
    
    static {
	aRSString_1836 = Class134.method1914("Loaded interfaces", (byte) 19);
	aRSString_1838 = aRSString_1836;
    }
}
