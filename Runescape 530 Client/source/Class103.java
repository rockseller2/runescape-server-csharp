/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class103
{
    public int[][][] anIntArrayArrayArray2008;
    public int anInt2009 = 0;
    public static int anInt2010;
    public static int anInt2011;
    public int anInt2012;
    public Class50 aClass50_2013;
    public static RSString aRSString_2014;
    public int anInt2015;
    public static RSString aRSString_2016;
    public Class67_Sub3[] aClass67_Sub3Array2017;
    public static int anInt2018;
    public static int anInt2019;
    public static RSString aRSString_2020;
    public int anInt2021 = -1;
    public static Class135[] aClass135Array2022;
    public static int anInt2023;
    public static int anInt2024;
    public static long[] aLongArray2025 = new long[100];
    public static int anInt2026;
    public static int anInt2027;
    public static int anInt2028;
    public static int anInt2029;
    public boolean aBoolean2030;
    
    public int[][] method1551(int arg0, int arg1) {
	anInt2019++;
	if (arg1 < 22)
	    method1556(88, (byte) -122, 35, 33, -121, -35, -70, -69);
	if ((anInt2012 ^ 0xffffffff) == (anInt2015 ^ 0xffffffff)) {
	    aBoolean2030 = aClass67_Sub3Array2017[arg0] == null;
	    aClass67_Sub3Array2017[arg0] = Class80.aClass67_Sub3_1624;
	    return anIntArrayArrayArray2008[arg0];
	}
	if (anInt2012 != 1) {
	    Class67_Sub3 class67_sub3 = aClass67_Sub3Array2017[arg0];
	    if (class67_sub3 == null) {
		aBoolean2030 = true;
		if ((anInt2009 ^ 0xffffffff) <= (anInt2012 ^ 0xffffffff)) {
		    Class67_Sub3 class67_sub3_0_
			= (Class67_Sub3) aClass50_2013.method433((byte) 83);
		    class67_sub3
			= new Class67_Sub3(arg0, class67_sub3_0_.anInt2846);
		    aClass67_Sub3Array2017[class67_sub3_0_.anInt2842] = null;
		    class67_sub3_0_.method606((byte) -118);
		} else {
		    class67_sub3 = new Class67_Sub3(arg0, anInt2009);
		    anInt2009++;
		}
		aClass67_Sub3Array2017[arg0] = class67_sub3;
	    } else
		aBoolean2030 = false;
	    aClass50_2013.method441(class67_sub3, (byte) -113);
	    return anIntArrayArrayArray2008[class67_sub3.anInt2846];
	}
	aBoolean2030 = (arg0 ^ 0xffffffff) != (anInt2021 ^ 0xffffffff);
	anInt2021 = arg0;
	return anIntArrayArrayArray2008[0];
    }
    
    public static boolean method1552(boolean arg0, RSString arg1) {
	anInt2028++;
	if (arg1 == null)
	    return false;
	for (int i = 0;
	     (i ^ 0xffffffff) > (Class67_Sub5_Sub17.anInt4795 ^ 0xffffffff);
	     i++) {
	    if (arg1.method526(78, Class99_Sub1.aRSStringArray3384[i]))
		return true;
	}
	if (arg0 != true)
	    method1554((byte) -98, null, null, null, null);
	if (arg1.method526(95,
			   Class122.aClass131_Sub7_Sub2_2309.playerName))
	    return true;
	return false;
    }
    
    public static void method1553(int arg0) {
	aLongArray2025 = null;
	aRSString_2016 = null;
	aRSString_2020 = null;
	aClass135Array2022 = null;
	if (arg0 < -87)
	    aRSString_2014 = null;
    }
    
    public static void method1554(byte arg0, int[] arg1, int[] arg2,
				  Class131_Sub7_Sub2 arg3, int[] arg4) {
	try {
	    int i = 0;
	    int i_1_ = -58 % ((arg0 - -11) / 62);
	    for (/**/; i < arg1.length; i++) {
		int i_2_ = arg1[i];
		int i_3_ = arg2[i];
		int i_4_ = arg4[i];
		for (int i_5_ = 0;
		     ((i_4_ ^ 0xffffffff) != -1
		      && ((arg3.aClass21Array3749.length ^ 0xffffffff)
			  < (i_5_ ^ 0xffffffff)));
		     i_5_++) {
		    if ((0x1 & i_4_ ^ 0xffffffff) != -1) {
			if ((i_2_ ^ 0xffffffff) != 0) {
			    Class41 class41 = Class120.method1666(i_2_, -32);
			    int i_6_ = class41.anInt850;
			    Class21 class21 = arg3.aClass21Array3749[i_5_];
			    if (class21 != null) {
				if (i_2_ != class21.anInt516) {
				    if (class41.anInt856
					>= (Class120.method1666
					    (class21.anInt516, -32).anInt856))
					class21
					    = arg3.aClass21Array3749[i_5_]
					    = null;
				} else if (i_6_ == 0)
				    class21 = arg3.aClass21Array3749[i_5_]
					= null;
				else if ((i_6_ ^ 0xffffffff) == -2) {
				    class21.anInt517 = i_3_;
				    class21.anInt512 = 1;
				    class21.anInt525 = 0;
				    class21.anInt521 = 0;
				    class21.anInt515 = 0;
				    OutputStream_Sub1.method58
					(class41, arg3.anInt3726, -106,
					 arg3.anInt3733,
					 (Class122.aClass131_Sub7_Sub2_2309
					  == arg3),
					 0);
				} else if (i_6_ == 2)
				    class21.anInt521 = 0;
			    }
			    if (class21 == null) {
				class21 = arg3.aClass21Array3749[i_5_]
				    = new Class21();
				class21.anInt512 = 1;
				class21.anInt515 = 0;
				class21.anInt521 = 0;
				class21.anInt516 = i_2_;
				class21.anInt525 = 0;
				class21.anInt517 = i_3_;
				OutputStream_Sub1.method58
				    (class41, arg3.anInt3726, -127,
				     arg3.anInt3733,
				     Class122.aClass131_Sub7_Sub2_2309 == arg3,
				     0);
			    }
			} else
			    arg3.aClass21Array3749[i_5_] = null;
		    }
		    i_4_ >>>= 1;
		}
	    }
	    anInt2018++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("pi.E(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public int[][][] method1555(byte arg0) {
	anInt2010++;
	if (arg0 != -18)
	    method1557((byte) 7);
	if ((anInt2015 ^ 0xffffffff) != (anInt2012 ^ 0xffffffff))
	    throw new RuntimeException("Can only retrieve a full image cache");
	for (int i = 0; anInt2012 > i; i++)
	    aClass67_Sub3Array2017[i] = Class80.aClass67_Sub3_1624;
	return anIntArrayArrayArray2008;
    }
    
    public static void method1556(int arg0, byte arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	anInt2011++;
	int i = Class7.method97(arg5, OutputStream_Sub1.anInt87,
				Class55_Sub2.anInt2801, 65535);
	int i_7_ = Class7.method97(arg3, OutputStream_Sub1.anInt87,
				   Class55_Sub2.anInt2801, 65535);
	int i_8_ = Class7.method97(arg6, Class126_Sub1.anInt3423,
				   Class139.anInt2533, 65535);
	int i_9_ = Class7.method97(arg0, Class126_Sub1.anInt3423,
				   Class139.anInt2533, arg1 + 65636);
	if (arg1 == -101) {
	    int i_10_ = Class7.method97(arg4 + arg5, OutputStream_Sub1.anInt87,
					Class55_Sub2.anInt2801, 65535);
	    int i_11_ = Class7.method97(arg3 - arg4, OutputStream_Sub1.anInt87,
					Class55_Sub2.anInt2801, 65535);
	    for (int i_12_ = i; (i_10_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff);
		 i_12_++)
		Class67_Sub1_Sub11.method665(arg1 ^ ~0x66, i_8_,
					     (Class67_Sub29.anIntArrayArray3338
					      [i_12_]),
					     i_9_, arg2);
	    for (int i_13_ = i_7_; (i_13_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff);
		 i_13_--)
		Class67_Sub1_Sub11.method665(2, i_8_,
					     (Class67_Sub29.anIntArrayArray3338
					      [i_13_]),
					     i_9_, arg2);
	    int i_14_ = Class7.method97(arg4 + arg6, Class126_Sub1.anInt3423,
					Class139.anInt2533, 65535);
	    int i_15_ = Class7.method97(arg0 - arg4, Class126_Sub1.anInt3423,
					Class139.anInt2533, 65535);
	    for (int i_16_ = i_10_; i_16_ <= i_11_; i_16_++) {
		int[] is = Class67_Sub29.anIntArrayArray3338[i_16_];
		Class67_Sub1_Sub11.method665(2, i_8_, is, i_14_, arg2);
		Class67_Sub1_Sub11.method665(2, i_14_, is, i_15_, arg7);
		Class67_Sub1_Sub11.method665(2, i_15_, is, i_9_, arg2);
	    }
	}
    }
    
    public void method1557(byte arg0) {
	anInt2029++;
	int i = 63 / ((-21 - arg0) / 33);
	for (int i_17_ = 0; i_17_ < anInt2012; i_17_++) {
	    anIntArrayArrayArray2008[i_17_][0] = null;
	    anIntArrayArrayArray2008[i_17_][1] = null;
	    anIntArrayArrayArray2008[i_17_][2] = null;
	    anIntArrayArrayArray2008[i_17_] = null;
	}
	aClass67_Sub3Array2017 = null;
	anIntArrayArrayArray2008 = null;
	aClass50_2013.method437((byte) 127);
	aClass50_2013 = null;
    }
    
    public static Class67_Sub5_Sub3 method1558(int arg0, boolean arg1,
					       int arg2) {
	anInt2027++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = ((Class67_Sub5_Sub3)
	       Class66.aClass92_1321.method1489((byte) -64,
						((long) arg0
						 | ((long) arg2
						    << -158774240))));
	if (arg1 != false)
	    return null;
	if (class67_sub5_sub3 == null) {
	    class67_sub5_sub3 = new Class67_Sub5_Sub3(arg2, arg0);
	    Class66.aClass92_1321.method1488((byte) -89, class67_sub5_sub3,
					     class67_sub5_sub3.aLong1344);
	}
	return class67_sub5_sub3;
    }
    
    public static void method1559(int arg0) {
	Class67_Sub5_Sub4.anInt4504 &= 0x7ff;
	int i = Class6.anInt153 >> -1119991193;
	if (Class67_Sub21.anInt3175 < 128)
	    Class67_Sub21.anInt3175 = 128;
	anInt2024++;
	int i_18_ = arg0;
	if (Class67_Sub21.anInt3175 > 383)
	    Class67_Sub21.anInt3175 = 383;
	int i_19_ = Class67_Sub5_Sub13.anInt4714 >> 1056950727;
	int i_20_ = Class131_Sub5.method1826(Canvas_Sub1.anInt59,
					     Class67_Sub5_Sub13.anInt4714,
					     Class6.anInt153, (byte) 90);
	if ((i_19_ ^ 0xffffffff) < -4 && (i ^ 0xffffffff) < -4
	    && (i_19_ ^ 0xffffffff) > -101 && (i ^ 0xffffffff) > -101) {
	    for (int i_21_ = i_19_ + -4;
		 (4 + i_19_ ^ 0xffffffff) <= (i_21_ ^ 0xffffffff); i_21_++) {
		for (int i_22_ = i + -4; i_22_ <= 4 + i; i_22_++) {
		    int i_23_ = Canvas_Sub1.anInt59;
		    if (i_23_ < 3
			&& ((Class120.aByteArrayArrayArray2284[1][i_21_][i_22_]
			     & 0x2)
			    ^ 0xffffffff) == -3)
			i_23_++;
		    int i_24_ = i_20_ + (8 * (0xff & (Class134
						      .aByteArrayArrayArray2464
						      [i_23_][i_21_][i_22_]))
					 + -(Class136.anIntArrayArrayArray2496
					     [i_23_][i_21_][i_22_]));
		    if (i_18_ < i_24_)
			i_18_ = i_24_;
		}
	    }
	}
	int i_25_ = i_18_ * 192;
	if ((i_25_ ^ 0xffffffff) < -98049)
	    i_25_ = 98048;
	if (i_25_ < 32768)
	    i_25_ = 32768;
	if ((Class67_Sub5_Sub13.anInt4728 ^ 0xffffffff)
	    <= (i_25_ ^ 0xffffffff)) {
	    if (Class67_Sub5_Sub13.anInt4728 > i_25_)
		Class67_Sub5_Sub13.anInt4728
		    += (-Class67_Sub5_Sub13.anInt4728 + i_25_) / 80;
	} else
	    Class67_Sub5_Sub13.anInt4728
		+= (i_25_ - Class67_Sub5_Sub13.anInt4728) / 24;
    }
    
    public Class103(int arg0, int arg1, int arg2) {
	aClass50_2013 = new Class50();
	aBoolean2030 = false;
	anInt2012 = arg0;
	anIntArrayArrayArray2008 = new int[anInt2012][3][arg2];
	anInt2015 = arg1;
	aClass67_Sub3Array2017 = new Class67_Sub3[anInt2015];
    }
    
    static {
	anInt2023 = 0;
	aClass135Array2022 = new Class135[50];
	aRSString_2016 = Class134.method1914("glow3:", (byte) 111);
	aRSString_2014 = aRSString_2016;
	aRSString_2020 = aRSString_2016;
    }
}
