/* Class67_Sub1_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub17 extends Class67_Sub1
{
    public static Class9 aClass9_4091;
    public static int anInt4092;
    public static int anInt4093;
    public int anInt4094 = 0;
    public static RSString aRSString_4095;
    public static int[][][] anIntArrayArrayArray4096;
    public int anInt4097 = 1;
    public static int anInt4098;
    public static RSString aRSString_4099
	= Class134.method1914(":clan:", (byte) 112);
    public static int anInt4100;
    public static int anInt4101;
    public static int[] anIntArray4102;
    public static int anInt4103;
    public static RSString aRSString_4104;
    public static int anInt4105;
    public int anInt4106 = 0;
    
    public void method618(int arg0) {
	anInt4103++;
	int i = -9 / ((-60 - arg0) / 62);
	Class67_Sub1_Sub7.method645(-126);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt4105++;
	int i = arg2;
    while_95_:
	do {
	    do {
		if (i != 0) {
		    if ((i ^ 0xffffffff) != -2) {
			if (i == 3)
			    break;
			break while_95_;
		    }
		} else {
		    anInt4106 = arg0.readByte((byte) -48);
		    break while_95_;
		}
		anInt4094 = arg0.readByte((byte) 116);
		break while_95_;
	    } while (false);
	    anInt4097 = arg0.readByte((byte) 103);
	} while (false);
	if (arg1 != true)
	    anIntArrayArrayArray4096 = null;
    }
    
    public static int method697(Class9 arg0, Class9 arg1, int arg2) {
	try {
	    anInt4100++;
	    int i = 0;
	    if (arg0.method132(Class67_Sub5_Sub3.anInt4492, true))
		i++;
	    if (arg0.method132(Class67_Sub1_Sub36.anInt4367, true))
		i++;
	    if (arg0.method132(Class15.anInt458, true))
		i++;
	    if (arg1.method132(Class67_Sub5_Sub3.anInt4492, true))
		i++;
	    if (arg1.method132(Class67_Sub1_Sub36.anInt4367, true))
		i++;
	    if (arg1.method132(Class15.anInt458, true))
		i++;
	    if (arg2 >= -106)
		aClass9_4091 = null;
	    return i;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("nh.A("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public Class67_Sub1_Sub17() {
	super(0, true);
    }
    
    public static void method698(int arg0) {
	anIntArrayArrayArray4096 = null;
	aRSString_4095 = null;
	int i = -111 % ((58 - arg0) / 62);
	aClass9_4091 = null;
	aRSString_4104 = null;
	aRSString_4099 = null;
	anIntArray4102 = null;
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4098++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (arg1 != 55)
	    aClass9_4091 = null;
	if (aClass144_2836.aBoolean2607) {
	    int i = Class19.anIntArray490[arg0];
	    int i_0_ = i - 2048 >> -176182495;
	    for (int i_1_ = 0; Class67_Sub5_Sub7.anInt4569 > i_1_; i_1_++) {
		int i_2_ = Class67_Sub1_Sub35.anIntArray4344[i_1_];
		int i_3_ = -2048 + i_2_ >> -1346923775;
		int i_4_;
		if (anInt4106 != 0) {
		    int i_5_ = i_0_ * i_0_ + i_3_ * i_3_ >> 377337292;
		    i_4_ = (int) (Math.sqrt((double) ((float) i_5_ / 4096.0F))
				  * 4096.0);
		    i_4_ = (int) ((double) (i_4_ * anInt4097)
				  * 3.141592653589793);
		} else
		    i_4_ = anInt4097 * (-i + i_2_);
		i_4_ -= ~0xfff & i_4_;
		if (anInt4094 != 0) {
		    if (anInt4094 == 2) {
			i_4_ -= 2048;
			if (i_4_ < 0)
			    i_4_ = -i_4_;
			i_4_ = 2048 - i_4_ << 666794817;
		    }
		} else
		    i_4_ = (4096 + (Class51.anIntArray1040
				    [(i_4_ & 0xff2) >> -1046515708])
			    >> 344832257);
		is[i_1_] = i_4_;
	    }
	}
	return is;
    }
    
    public static Class67_Sub5_Sub19[] method699(int arg0, Class9 arg1,
						 int arg2, int arg3) {
	anInt4093++;
	if (!Class64.method575((byte) -77, arg3, arg0, arg1))
	    return null;
	if (arg2 != 2048)
	    return null;
	return Applet_Sub1.method15((byte) -10);
    }
    
    static {
	aRSString_4095 = Class134.method1914("Titelbild geladen)3", (byte) 124);
	anIntArray4102 = new int[100];
    }
}
