public class Class139
{
    public static Class67_Sub5_Sub19[] aClass67_Sub5_Sub19Array2524;
    public boolean aBoolean2525;
    public static int anInt2526 = 0;
    public static int anInt2527;
    public static int anInt2528;
    public static RSString aRSString_2529
	= Class134.method1914("flash1:", (byte) 45);
    public static int anInt2530;
    public int anInt2531;
    public static RSString aRSString_2532 = aRSString_2529;
    public static int anInt2533 = 0;
    public static int anInt2534;
    public int anInt2535 = -1;
    public static int anInt2536;
    public int anInt2537;
    public static int[] anIntArray2538 = new int[25];
    public static RSString aRSString_2539;
    public static RSString aRSString_2540
	= Class134.method1914(",Mcran)2titre ouvert", (byte) 75);
    public static int anInt2541;
    public static RSString aRSString_2542;
    
    public static void method1937(boolean arg0) {
	aRSString_2542 = null;
	anIntArray2538 = null;
	if (arg0 != true)
	    aRSString_2532 = null;
	aClass67_Sub5_Sub19Array2524 = null;
	aRSString_2539 = null;
	aRSString_2532 = null;
	aRSString_2540 = null;
	aRSString_2529 = null;
    }
    
    public void method1938(Stream arg0, byte arg1, int arg2) {
	for (;;) {
	    int i = arg0.readByte((byte) -32);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method1940(arg2, arg0, i, (byte) 66);
	}
	anInt2527++;
	int i = -37 / ((arg1 - -57) / 52);
    }
    
    public static void method1939(int arg0, Class9 arg1) {
	anInt2528++;
	if (arg0 < 43)
	    method1937(false);
	Class130.aClass9_2421 = arg1;
    }
    
    public void method1940(int arg0, Stream arg1, int arg2, byte arg3) {
	anInt2536++;
	if ((arg2 ^ 0xffffffff) == -2)
	    anInt2531 = Class36.method316(arg3 + -193, arg1.readThreeBytes(65280));
	else if (arg2 != 2) {
	    if (arg2 != 3) {
		if ((arg2 ^ 0xffffffff) != -6) {
		    if ((arg2 ^ 0xffffffff) != -8) {
			if ((arg2 ^ 0xffffffff) != -9) {
			    if ((arg2 ^ 0xffffffff) != -10) {
				if (arg2 != 10) {
				    if (arg2 != 11) {
					if (arg2 != 12) {
					    if ((arg2 ^ 0xffffffff) == -14)
						arg1.readThreeBytes(65280);
					    else if ((arg2 ^ 0xffffffff)
						     == -15)
						arg1.readByte((byte) -55);
					}
				    } else
					arg1.readByte((byte) 120);
				}
			    } else
				arg1.readUShort(arg3 ^ ~0x913);
			} else
			    Class67_Sub1_Sub37.anInt4402 = arg0;
		    } else
			anInt2537
			    = Class36.method316(-110,
						arg1.readThreeBytes(arg3
								^ 0xff42));
		} else
		    aBoolean2525 = false;
	    } else {
		anInt2535 = arg1.readUShort(-2386);
		if (anInt2535 == 65535)
		    anInt2535 = -1;
	    }
	} else
	    anInt2535 = arg1.readByte((byte) 81);
	if (arg3 != 66)
	    method1937(true);
    }
    
    public Class139() {
	anInt2531 = 0;
	anInt2537 = -1;
	aBoolean2525 = true;
    }
    
    public static void method1941(Class7 arg0, int arg1,
				  Class67_Sub5_Sub19 arg2, boolean arg3,
				  int arg4, int arg5, int arg6) {
	try {
	    anInt2541++;
	    if (arg2 != null) {
		int i = 0x7ff & Class5.anInt137 + Class67_Sub5_Sub4.anInt4504;
		int i_0_ = arg6 * arg6 + arg4 * arg4;
		int i_1_
		    = Math.max(arg0.anInt189 / 2, arg0.anInt194 / 2) - -10;
		if ((i_1_ * i_1_ ^ 0xffffffff) <= (i_0_ ^ 0xffffffff)) {
		    int i_2_ = Class26.anIntArray617[i];
		    if (arg3 == true) {
			int i_3_ = Class26.anIntArray612[i];
			i_2_ = 256 * i_2_ / (256
					     + Class67_Sub1_Sub15.anInt4063);
			i_3_ = i_3_ * 256 / (Class67_Sub1_Sub15.anInt4063
					     - -256);
			int i_4_ = i_3_ * arg4 + i_2_ * arg6 >> 1993304848;
			int i_5_ = arg6 * i_3_ - arg4 * i_2_ >> 36943184;
			((Class67_Sub5_Sub19_Sub1) arg2).method1026
			    (arg1 + (arg0.anInt189 / 2 + i_4_
				     - arg2.anInt4825 / 2),
			     (-i_5_ + arg0.anInt194 / 2 + arg5
			      - arg2.anInt4815 / 2),
			     arg0.anIntArray179, arg0.anIntArray337);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("wa.E("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ',' + arg4 + ','
						+ arg5 + ',' + arg6 + ')'));
	}
    }
    
    static {
	aRSString_2539 = aRSString_2529;
	aRSString_2542 = Class134.method1914("(U3", (byte) 91);
    }
}
