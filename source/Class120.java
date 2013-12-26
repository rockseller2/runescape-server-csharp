import java.awt.Frame;

public class Class120
{
    public static int anInt2265;
    public static int anInt2266;
    public static int anInt2267;
    public static byte[][] aByteArrayArray2268;
    public static RSString aRSString_2269;
    public static int anInt2270;
    public static int anInt2271;
    public static Frame aFrame2272;
    public static RSString aRSString_2273
	= Class134.method1914("<col=c0ff00>", (byte) 74);
    public static int anInt2274;
    public static int anInt2275;
    public static int anInt2276;
    public static int anInt2277;
    public static int anInt2278;
    public static Class87 aClass87_2279;
    public static int anInt2280;
    public static int anInt2281;
    public static int anInt2282;
    public static int anInt2283;
    public static byte[][][] aByteArrayArrayArray2284;
    public static int anInt2285;
    public static int anInt2286;
    public static int[][][] anIntArrayArrayArray2287;
    public Class67_Sub5 aClass67_Sub5_2288 = new Class67_Sub5();
    public static int[] anIntArray2289;
    public static RSString aRSString_2290;
    public static RSString aRSString_2291;
    public static RSString aRSString_2292;
    public Class67_Sub5 aClass67_Sub5_2293;
    
    public Class67_Sub5 method1656(int arg0) {
	anInt2278++;
	Class67_Sub5 class67_sub5 = aClass67_Sub5_2288.aClass67_Sub5_2861;
	if (aClass67_Sub5_2288 == class67_sub5) {
	    aClass67_Sub5_2293 = null;
	    return null;
	}
	if (arg0 != 104)
	    return null;
	aClass67_Sub5_2293 = class67_sub5.aClass67_Sub5_2861;
	return class67_sub5;
    }
    
    public Class67_Sub5 method1657(byte arg0) {
	int i = -32 / ((arg0 - -61) / 49);
	anInt2265++;
	Class67_Sub5 class67_sub5 = aClass67_Sub5_2288.aClass67_Sub5_2861;
	if (class67_sub5 == aClass67_Sub5_2288)
	    return null;
	class67_sub5.method821(24120);
	return class67_sub5;
    }
    
    public int method1658(int arg0) {
	if (arg0 != -19462)
	    method1662(-122);
	anInt2285++;
	int i = 0;
	for (Class67_Sub5 class67_sub5 = aClass67_Sub5_2288.aClass67_Sub5_2861;
	     class67_sub5 != aClass67_Sub5_2288;
	     class67_sub5 = class67_sub5.aClass67_Sub5_2861)
	    i++;
	return i;
    }
    
    public static void method1659(int arg0, int arg1, int arg2, int arg3,
				  int arg4, boolean arg5, int arg6) {
	anInt2276++;
	int i = arg2;
	int i_0_ = 0;
	int i_1_ = arg2 + -arg3;
	Class67_Sub1_Sub4.method638(arg2, false);
	int i_2_ = -1;
	if ((i_1_ ^ 0xffffffff) > -1)
	    i_1_ = 0;
	int i_3_ = -arg2;
	int i_4_ = i_1_;
	int i_5_ = -i_1_;
	int i_6_ = -1;
	int[] is = Class67_Sub29.anIntArrayArray3338[arg6];
	if (arg5 != true)
	    method1664((byte) -25, null, (short) -16, null, 126, -3, 110L, 36);
	int i_7_ = -i_1_ + arg1;
	int i_8_ = arg1 + i_1_;
	Class67_Sub1_Sub11.method665(2, -arg2 + arg1, is, i_7_, arg0);
	Class67_Sub1_Sub11.method665(2, i_7_, is, i_8_, arg4);
	Class67_Sub1_Sub11.method665(2, i_8_, is, arg1 + arg2, arg0);
	while ((i_0_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
	    i_6_ += 2;
	    i_2_ += 2;
	    i_5_ += i_2_;
	    i_3_ += i_6_;
	    if ((i_5_ ^ 0xffffffff) <= -1 && i_4_ >= 1) {
		Class67_Sub1_Sub35.anIntArray4348[i_4_] = i_0_;
		i_4_--;
		i_5_ -= i_4_ << 1177533153;
	    }
	    i_0_++;
	    if (i_3_ >= 0) {
		i--;
		if ((i_1_ ^ 0xffffffff) >= (i ^ 0xffffffff)) {
		    int[] is_9_ = Class67_Sub29.anIntArrayArray3338[i + arg6];
		    int[] is_10_
			= Class67_Sub29.anIntArrayArray3338[-i + arg6];
		    int i_11_ = i_0_ + arg1;
		    int i_12_ = arg1 - i_0_;
		    Class67_Sub1_Sub11.method665(2, i_12_, is_9_, i_11_, arg0);
		    Class67_Sub1_Sub11.method665(2, i_12_, is_10_, i_11_,
						 arg0);
		} else {
		    int[] is_13_
			= Class67_Sub29.anIntArrayArray3338[arg6 - -i];
		    int i_14_ = arg1 + i_0_;
		    int i_15_ = arg1 + -i_0_;
		    int i_16_ = Class67_Sub1_Sub35.anIntArray4348[i];
		    int i_17_ = arg1 - i_16_;
		    int[] is_18_
			= Class67_Sub29.anIntArrayArray3338[arg6 + -i];
		    int i_19_ = arg1 + i_16_;
		    Class67_Sub1_Sub11.method665(2, i_15_, is_13_, i_17_,
						 arg0);
		    Class67_Sub1_Sub11.method665(2, i_17_, is_13_, i_19_,
						 arg4);
		    Class67_Sub1_Sub11.method665(2, i_19_, is_13_, i_14_,
						 arg0);
		    Class67_Sub1_Sub11.method665(2, i_15_, is_18_, i_17_,
						 arg0);
		    Class67_Sub1_Sub11.method665(2, i_17_, is_18_, i_19_,
						 arg4);
		    Class67_Sub1_Sub11.method665(2, i_19_, is_18_, i_14_,
						 arg0);
		}
		i_3_ -= i << 1473045409;
	    }
	    int[] is_20_ = Class67_Sub29.anIntArrayArray3338[i_0_ + arg6];
	    int[] is_21_ = Class67_Sub29.anIntArrayArray3338[-i_0_ + arg6];
	    int i_22_ = arg1 + i;
	    int i_23_ = -i + arg1;
	    if ((i_1_ ^ 0xffffffff) >= (i_0_ ^ 0xffffffff)) {
		Class67_Sub1_Sub11.method665(2, i_23_, is_20_, i_22_, arg0);
		Class67_Sub1_Sub11.method665(2, i_23_, is_21_, i_22_, arg0);
	    } else {
		int i_24_ = (i_0_ <= i_4_ ? i_4_
			     : Class67_Sub1_Sub35.anIntArray4348[i_0_]);
		int i_25_ = arg1 + i_24_;
		int i_26_ = -i_24_ + arg1;
		Class67_Sub1_Sub11.method665(2, i_23_, is_20_, i_26_, arg0);
		Class67_Sub1_Sub11.method665(2, i_26_, is_20_, i_25_, arg4);
		Class67_Sub1_Sub11.method665(2, i_25_, is_20_, i_22_, arg0);
		Class67_Sub1_Sub11.method665(2, i_23_, is_21_, i_26_, arg0);
		Class67_Sub1_Sub11.method665(2, i_26_, is_21_, i_25_, arg4);
		Class67_Sub1_Sub11.method665(2, i_25_, is_21_, i_22_, arg0);
	    }
	}
    }
    
    public static int method1660(int arg0, int arg1) {
	anInt2266++;
	if (arg0 != -12457)
	    return -55;
	return 0xff & arg1;
    }
    
    public static void method1661(int arg0, int arg1, int arg2, byte arg3,
				  int arg4, int arg5) {
	anInt2281++;
	if (arg3 != 8)
	    aClass87_2279 = null;
	if ((arg0 ^ 0xffffffff) <= (Class139.anInt2533 ^ 0xffffffff)
	    && (arg4 ^ 0xffffffff) >= (Class126_Sub1.anInt3423 ^ 0xffffffff)
	    && (arg2 ^ 0xffffffff) <= (Class55_Sub2.anInt2801 ^ 0xffffffff)
	    && (OutputStream_Sub1.anInt87 ^ 0xffffffff) <= (arg1 ^ 0xffffffff))
	    Class68.method1322(arg4, arg2, (byte) 92, arg5, arg1, arg0);
	else
	    Class67_Sub5_Sub4_Sub2.method858(arg0, arg2, arg4, arg1, (byte) 63,
					     arg5);
    }
    
    public static void method1662(int arg0) {
	anInt2275++;
	if (!Class132.lowMememoryMode && Class23.anInt555 != 2) {
	    try {
		Class21.aRSString_523.method505(Class28.aClient672, (byte) 55);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    if (arg0 != 0)
		method1662(89);
	}
    }
    
    public void method1663(Class67_Sub5 arg0, int arg1) {
	if (arg0.aClass67_Sub5_2867 != null)
	    arg0.method821(24120);
	arg0.aClass67_Sub5_2861 = aClass67_Sub5_2288;
	arg0.aClass67_Sub5_2867 = aClass67_Sub5_2288.aClass67_Sub5_2867;
	if (arg1 != -225)
	    aFrame2272 = null;
	arg0.aClass67_Sub5_2867.aClass67_Sub5_2861 = arg0;
	anInt2267++;
	arg0.aClass67_Sub5_2861.aClass67_Sub5_2867 = arg0;
    }
    
    public static void method1664(byte arg0, RSString arg1, short arg2,
				  RSString arg3, int arg4, int arg5, long arg6,
				  int arg7) {
	do {
	    try {
		anInt2283++;
		if (arg0 < 108)
		    anInt2274 = 15;
		if (!Class67_Sub9.aBoolean2980) {
		    if ((Class134.anInt2476 ^ 0xffffffff) <= -501)
			break;
		    Class8.aRSStringArray340[Class134.anInt2476] = arg3;
		    Class102.aRSStringArray1998[Class134.anInt2476] = arg1;
		    Class55_Sub2.anIntArray2802[Class134.anInt2476]
			= arg7 != -1 ? arg7 : Class2.anInt109;
		    Applet_Sub1.aShortArray21[Class134.anInt2476] = arg2;
		    Class115.aLongArray2188[Class134.anInt2476] = arg6;
		    Class88.anIntArray1822[Class134.anInt2476] = arg4;
		    Class131_Sub5.anIntArray3667[Class134.anInt2476] = arg5;
		    Class134.anInt2476++;
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   ("tb.K(" + arg0 + ','
						    + (arg1 != null ? "{...}"
						       : "null")
						    + ',' + arg2 + ','
						    + (arg3 != null ? "{...}"
						       : "null")
						    + ',' + arg4 + ',' + arg5
						    + ',' + arg6 + ',' + arg7
						    + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void method1665(byte arg0) {
	if (arg0 <= -34) {
	    anInt2270++;
	    for (;;) {
		Class67_Sub5 class67_sub5
		    = aClass67_Sub5_2288.aClass67_Sub5_2861;
		if (aClass67_Sub5_2288 == class67_sub5)
		    break;
		class67_sub5.method821(24120);
	    }
	    aClass67_Sub5_2293 = null;
	}
    }
    
    public static Class41 method1666(int arg0, int arg1) {
	anInt2271++;
	Class41 class41 = (Class41) Class67_Sub5_Sub5.aClass136_4515
					.method1924((long) arg0, false);
	if (class41 != null)
	    return class41;
	byte[] is = (Class5.aClass9_141.method138
		     (arg1 + -809612633,
		      Class67_Sub19.method1266(arg1 ^ ~0x6119, arg0),
		      Class67_Sub1.method614(arg0, 1393598983)));
	class41 = new Class41();
	class41.anInt854 = arg0;
	if (is != null)
	    class41.method361((byte) 124, new Stream(is));
	class41.method357(107);
	if (arg1 != -32)
	    aRSString_2291 = null;
	Class67_Sub5_Sub5.aClass136_4515.method1926((long) arg0, class41,
						    (byte) -71);
	return class41;
    }
    
    public static int method1667(int arg0, byte arg1) {
	if (arg1 >= -116)
	    method1667(94, (byte) 112);
	anInt2277++;
	if ((arg0 ^ 0xffffffff) <= -98 && (arg0 ^ 0xffffffff) >= -123
	    || ((arg0 ^ 0xffffffff) <= -225 && (arg0 ^ 0xffffffff) >= -255
		&& arg0 != 247))
	    return -32 + arg0;
	if (arg0 == 255)
	    return 159;
	if ((arg0 ^ 0xffffffff) == -157)
	    return 140;
	return arg0;
    }
    
    public Class67_Sub5 method1668(boolean arg0) {
	anInt2282++;
	Class67_Sub5 class67_sub5 = aClass67_Sub5_2293;
	if (aClass67_Sub5_2288 == class67_sub5) {
	    aClass67_Sub5_2293 = null;
	    return null;
	}
	if (arg0 != true)
	    method1660(46, 36);
	aClass67_Sub5_2293 = class67_sub5.aClass67_Sub5_2861;
	return class67_sub5;
    }
    
    public static void method1669(int arg0) {
	aByteArrayArrayArray2284 = null;
	aFrame2272 = null;
	aByteArrayArray2268 = null;
	aRSString_2269 = null;
	aRSString_2290 = null;
	anIntArray2289 = null;
	anIntArrayArrayArray2287 = null;
	aRSString_2273 = null;
	aRSString_2292 = null;
	int i = 107 / ((1 - arg0) / 57);
	aRSString_2291 = null;
	aClass87_2279 = null;
    }
    
    public Class120() {
	aClass67_Sub5_2288.aClass67_Sub5_2861 = aClass67_Sub5_2288;
	aClass67_Sub5_2288.aClass67_Sub5_2867 = aClass67_Sub5_2288;
    }
    
    static {
	aRSString_2269 = Class134.method1914("scrollen:", (byte) 124);
	aByteArrayArrayArray2284 = new byte[4][104][104];
	aClass87_2279 = new Class87();
	anIntArray2289 = new int[14];
	aRSString_2291 = Class134.method1914("(Y", (byte) 28);
	aRSString_2292 = Class134.method1914("overlay", (byte) 27);
	aRSString_2290
	    = Class134.method1914(" s(West d-Bconnect-B)3", (byte) 116);
    }
}
