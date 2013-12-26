/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class66
{
    public int[] anIntArray1318;
    public static int anInt1319;
    public Class67_Sub1[] aClass67_Sub1Array1320;
    public static Class92 aClass92_1321 = new Class92(16);
    public static int anInt1322;
    public Class67_Sub1 aClass67_Sub1_1323;
    public static int anInt1324;
    public Class67_Sub1 aClass67_Sub1_1325;
    public static int anInt1326 = 0;
    public static RSString aRSString_1327;
    public static RSString aRSString_1328
	= Class134.method1914(" is already on your friend list)3", (byte) 24);
    public static int anInt1329;
    public static long[] aLongArray1330 = new long[200];
    public static int anInt1331;
    public static int anInt1332;
    public int[] anIntArray1333;
    
    public boolean method598(Interface3 arg0, byte arg1, Class9 arg2) {
	try {
	    anInt1322++;
	    if ((Class55.anInt1084 ^ 0xffffffff) >= -1) {
		for (int i = 0; i < anIntArray1333.length; i++) {
		    if (!arg2.method132(anIntArray1333[i], true))
			return false;
		}
	    } else {
		for (int i = 0;
		     (anIntArray1333.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++) {
		    if (!arg2.method117(true, Class55.anInt1084,
					anIntArray1333[i]))
			return false;
		}
	    }
	    for (int i = 0; i < anIntArray1318.length; i++) {
		if (!arg0.method10(anIntArray1318[i], (byte) -95))
		    return false;
	    }
	    if (arg1 != 115)
		aRSString_1328 = null;
	    return true;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("jd.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method599(int arg0) {
	aRSString_1327 = null;
	if (arg0 != -2955)
	    aClass92_1321 = null;
	aRSString_1328 = null;
	aLongArray1330 = null;
	aClass92_1321 = null;
    }
    
    public static void method600(int arg0, RSString arg1, RSString arg2,
				 int arg3, int arg4, RSString arg5) {
	try {
	    if (arg4 == -1) {
		anInt1319++;
		for (int i = 99; (i ^ 0xffffffff) < -1; i--) {
		    Class55_Sub2_Sub1.anIntArray3795[i]
			= Class55_Sub2_Sub1.anIntArray3795[i + -1];
		    Class67_Sub5_Sub9.aRSStringArray4617[i]
			= Class67_Sub5_Sub9.aRSStringArray4617[i + -1];
		    Class67_Sub28.aRSStringArray3315[i]
			= Class67_Sub28.aRSStringArray3315[-1 + i];
		    Class84.aRSStringArray1700[i]
			= Class84.aRSStringArray1700[i - 1];
		    Class68.anIntArray1375[i] = Class68.anIntArray1375[-1 + i];
		}
		Class67_Sub5_Sub9.aRSStringArray4617[0] = arg5;
		Class136.anInt2492++;
		Class55_Sub2_Sub1.anIntArray3795[0] = arg3;
		Class68.anIntArray1375[0] = arg0;
		Class116.anInt2192 = Class11.anInt409;
		Class67_Sub28.aRSStringArray3315[0] = arg1;
		Class84.aRSStringArray1700[0] = arg2;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("jd.C(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ',' + arg4 + ','
						+ (arg5 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static int method601(int arg0, int arg1) {
	if (arg1 <= 10)
	    method599(-6);
	anInt1329++;
	return 0xff & arg0;
    }
    
    public static void method602(boolean arg0, int arg1) {
	Class67_Sub8 class67_sub8
	    = ((Class67_Sub8)
	       Class86.aClass92_1755.method1489((byte) -33, (long) arg1));
	anInt1332++;
	if (class67_sub8 != null) {
	    int i = 0;
	    if (arg0 != false)
		method602(true, 29);
	    for (/**/; i < class67_sub8.anIntArray2965.length; i++) {
		class67_sub8.anIntArray2965[i] = -1;
		class67_sub8.anIntArray2961[i] = 0;
	    }
	}
    }
    
    public int[] method603(Interface3 arg0, Class9 arg1, int arg2,
			   boolean arg3, int arg4, boolean arg5, double arg6,
			   int arg7) {
	try {
	    anInt1331++;
	    Class67_Sub1_Sub26.method740(0, arg6);
	    Class67_Sub1_Sub8.anInterface3_3916 = arg0;
	    Class67.aClass9_1348 = arg1;
	    Class67_Sub1_Sub37.method790(119, arg4, arg7);
	    for (int i = 0; (i ^ 0xffffffff) > (aClass67_Sub1Array1320.length
						^ 0xffffffff); i++)
		aClass67_Sub1Array1320[i].method612((byte) -117, arg4, arg7);
	    int[] is = new int[arg7 * arg4];
	    int i;
	    int i_0_;
	    int i_1_;
	    if (!arg5) {
		i_0_ = 1;
		i = arg4;
		i_1_ = 0;
	    } else {
		i = -1;
		i_0_ = -1;
		i_1_ = -1 + arg4;
	    }
	    int i_2_ = 0;
	    for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (arg7 ^ 0xffffffff);
		 i_3_++) {
		if (arg3)
		    i_2_ = i_3_;
		int[] is_4_;
		int[] is_5_;
		int[] is_6_;
		if (!aClass67_Sub1_1323.aBoolean2839) {
		    int[][] is_7_ = aClass67_Sub1_1323.method624(true, i_3_);
		    is_5_ = is_7_[0];
		    is_6_ = is_7_[1];
		    is_4_ = is_7_[2];
		} else {
		    int[] is_8_
			= aClass67_Sub1_1323.method611(i_3_, (byte) 55);
		    is_4_ = is_8_;
		    is_5_ = is_8_;
		    is_6_ = is_8_;
		}
		for (int i_9_ = i_1_; i_9_ != i; i_9_ += i_0_) {
		    int i_10_ = is_5_[i_9_] >> -1627426492;
		    if (i_10_ > 255)
			i_10_ = 255;
		    if (i_10_ < 0)
			i_10_ = 0;
		    int i_11_ = is_4_[i_9_] >> 1882486212;
		    if ((i_11_ ^ 0xffffffff) < -256)
			i_11_ = 255;
		    int i_12_ = is_6_[i_9_] >> -607358172;
		    i_10_ = Class75.anIntArray2713[i_10_];
		    if (i_12_ > 255)
			i_12_ = 255;
		    if (i_11_ < 0)
			i_11_ = 0;
		    i_11_ = Class75.anIntArray2713[i_11_];
		    if (i_12_ < 0)
			i_12_ = 0;
		    i_12_ = Class75.anIntArray2713[i_12_];
		    is[i_2_++] = i_11_ + ((i_12_ << -508490872)
					  + (i_10_ << 1826701776));
		    if (arg3)
			i_2_ += -1 + arg4;
		}
	    }
	    if (arg2 < 58)
		method601(-46, -64);
	    for (int i_13_ = 0;
		 ((i_13_ ^ 0xffffffff)
		  > (aClass67_Sub1Array1320.length ^ 0xffffffff));
		 i_13_++)
		aClass67_Sub1Array1320[i_13_].method617((byte) 107);
	    return is;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("jd.G("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
	}
    }
    
    public static void method604(int arg0, SignLink arg1) {
	Class28.anInt667 = 3;
	anInt1324++;
	Class131_Sub7_Sub2.method1893((byte) -87, true);
	int i = 37 % ((arg0 - -37) / 35);
	Class100.aBoolean1977 = true;
	Class128.aBoolean2385 = true;
	Class67_Sub11_Sub2.anInt4857 = 0;
	Class74.anInt1485 = 0;
	Class72.aBoolean1432 = true;
	Class105.aBoolean2044 = true;
	Class67_Sub5_Sub9.aBoolean4614 = true;
	Class67_Sub21.anInt3176 = 127;
	Class6.aBoolean157 = true;
	Class67_Sub25.anInt3253 = 2;
	Class67_Sub5_Sub2.aBoolean4468 = true;
	Class139.anInt2526 = 0;
	Class93 class93 = null;
	Class67_Sub1_Sub29.anInt4259 = 255;
	InputStream_Sub1.aBoolean78 = true;
	InputStream_Sub1.aBoolean77 = true;
	Class27.anInt644 = 127;
	Class123.aBoolean2318 = true;
	Class75.anInt2716 = 0;
	Class55_Sub3.aBoolean2808 = true;
	if ((Class122.anInt2307 ^ 0xffffffff) > -97)
	    Class61_Sub1.method557(0);
	else
	    Class61_Sub1.method557(2);
	InputStream_Sub1.aBoolean71 = false;
	Class2.anInt112 = 0;
	Class95.anInt1909 = 0;
	Class67_Sub1_Sub38.aBoolean4431 = true;
	Class53.aBoolean1057 = false;
	Class67_Sub29.aBoolean3337 = false;
	Class63.anInt1168 = 0;
	try {
	    Class31 class31 = arg1.method396("runescape", true);
	    while (class31.anInt706 == 0)
		Class67_Sub1_Sub23.method726(-126, 1L);
	    if ((class31.anInt706 ^ 0xffffffff) == -2) {
		class93 = (Class93) class31.anObject705;
		byte[] is = new byte[(int) class93.method1494(0)];
		int i_14_;
		for (int i_15_ = 0;
		     (is.length ^ 0xffffffff) < (i_15_ ^ 0xffffffff);
		     i_15_ += i_14_) {
		    i_14_
			= class93.method1490(is.length - i_15_, is, i_15_, -1);
		    if (i_14_ == -1)
			throw new IOException("EOF");
		}
		Class64.method579(new Stream(is), 93);
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	do {
	    try {
		if (class93 == null)
		    break;
		class93.method1491(-1);
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    public Class66() {
	anIntArray1318 = new int[0];
	anIntArray1333 = new int[0];
	aClass67_Sub1_1323 = new Class67_Sub1_Sub26();
	aClass67_Sub1_1323.anInt2838 = 1;
	aClass67_Sub1_1325 = new Class67_Sub1_Sub26();
	aClass67_Sub1Array1320
	    = new Class67_Sub1[] { aClass67_Sub1_1323, aClass67_Sub1_1325 };
	aClass67_Sub1_1325.anInt2838 = 1;
    }
    
    public Class66(Stream arg0) {
	int i = 0;
	int i_16_ = arg0.readByte((byte) 93);
	int[][] is = new int[i_16_][];
	int i_17_ = 0;
	aClass67_Sub1Array1320 = new Class67_Sub1[i_16_];
	for (int i_18_ = 0; i_16_ > i_18_; i_18_++) {
	    Class67_Sub1 class67_sub1 = Class83.method1437(arg0, 2790);
	    if ((class67_sub1.method615((byte) -116) ^ 0xffffffff) <= -1)
		i++;
	    if ((class67_sub1.method610(-1) ^ 0xffffffff) <= -1)
		i_17_++;
	    int i_19_ = class67_sub1.aClass67_Sub1Array2827.length;
	    is[i_18_] = new int[i_19_];
	    for (int i_20_ = 0; (i_19_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff);
		 i_20_++)
		is[i_18_][i_20_] = arg0.readByte((byte) -69);
	    aClass67_Sub1Array1320[i_18_] = class67_sub1;
	}
	anIntArray1318 = new int[i_17_];
	anIntArray1333 = new int[i];
	i_17_ = 0;
	i = 0;
	for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff);
	     i_21_++) {
	    Class67_Sub1 class67_sub1 = aClass67_Sub1Array1320[i_21_];
	    int i_22_ = class67_sub1.aClass67_Sub1Array2827.length;
	    for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff);
		 i_23_++)
		class67_sub1.aClass67_Sub1Array2827[i_23_]
		    = aClass67_Sub1Array1320[is[i_21_][i_23_]];
	    int i_24_ = class67_sub1.method615((byte) -98);
	    int i_25_ = class67_sub1.method610(-1);
	    if ((i_24_ ^ 0xffffffff) < -1)
		anIntArray1333[i++] = i_24_;
	    if (i_25_ > 0)
		anIntArray1318[i_17_++] = i_25_;
	    is[i_21_] = null;
	}
	aClass67_Sub1_1323
	    = aClass67_Sub1Array1320[arg0.readByte((byte) -92)];
	aClass67_Sub1_1325
	    = aClass67_Sub1Array1320[arg0.readByte((byte) 92)];
	Object object = null;
    }
    
    static {
	aRSString_1327 = aRSString_1328;
    }
}
