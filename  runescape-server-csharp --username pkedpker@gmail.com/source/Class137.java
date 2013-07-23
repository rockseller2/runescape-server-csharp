public class Class137
{
    public static int anInt2501;
    public static int anInt2502;
    public static int anInt2503;
    public static int[] anIntArray2504 = new int[2500];
    public Class67_Sub5 aClass67_Sub5_2505 = new Class67_Sub5();
    public static int anInt2506;
    public static int anInt2507;
    public static Class136 aClass136_2508 = new Class136(64);
    public static int anInt2509;
    public Class92 aClass92_2510;
    public static int anInt2511;
    public Class120 aClass120_2512 = new Class120();
    public int anInt2513;
    public int anInt2514;
    public static short[] aShortArray2515;
    public static RSString aRSString_2516;
    public static RSString aRSString_2517;
    public static RSString aRSString_2518
	= Class134.method1914("Verbindung mit Update)2Server)3)3)3",
			      (byte) 74);
    public static int anInt2519;
    public static int baseY;
    public static int anInt2521;
    public static RSString aRSString_2522;
    public static RSString aRSString_2523;
    
    public static void method1927(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	anInt2507++;
	Class63.anInt1171 = 0;
	for (int i = -1; i < Class67_Sub1_Sub4.anInt3855 - -Class37.anInt794;
	     i++) {
	    Class131_Sub7 class131_sub7;
	    if (i == -1)
		class131_sub7 = Class122.aClass131_Sub7_Sub2_2309;
	    else if ((i ^ 0xffffffff)
		     <= (Class67_Sub1_Sub4.anInt3855 ^ 0xffffffff))
		class131_sub7 = (Class128.aClass131_Sub7_Sub1Array2386
				 [(Class47.anIntArray965
				   [i - Class67_Sub1_Sub4.anInt3855])]);
	    else
		class131_sub7
		    = (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
		       [Class3.anIntArray120[i]]);
	    if (class131_sub7 != null && class131_sub7.method1878((byte) 62)) {
		if (class131_sub7 instanceof Class131_Sub7_Sub1) {
		    Class64 class64
			= ((Class131_Sub7_Sub1) class131_sub7).aClass64_5047;
		    if (class64.anIntArray1208 != null)
			class64 = class64.method578(-1);
		    if (class64 == null)
			continue;
		}
		if ((i ^ 0xffffffff)
		    <= (Class67_Sub1_Sub4.anInt3855 ^ 0xffffffff)) {
		    Class64 class64
			= ((Class131_Sub7_Sub1) class131_sub7).aClass64_5047;
		    if (class64.anIntArray1208 != null)
			class64 = class64.method578(arg6 ^ ~0x14);
		    if ((class64.anInt1174 ^ 0xffffffff) <= -1
			&& (Class102.aClass67_Sub5_Sub19Array2006.length
			    ^ 0xffffffff) < (class64.anInt1174 ^ 0xffffffff)) {
			int i_0_;
			if (class64.anInt1213 == -1)
			    i_0_ = class131_sub7.method1876((byte) 125) + 15;
			else
			    i_0_ = 15 + class64.anInt1213;
			Class67_Sub1_Sub36.method786(arg5 >> 719152001,
						     (byte) 45,
						     arg4 >> -1995541663, arg3,
						     arg1, i_0_,
						     class131_sub7);
			if (Class69.anInt1383 > -1)
			    Class102.aClass67_Sub5_Sub19Array2006
				[class64.anInt1174].method1006
				(arg2 - -Class69.anInt1383 + -12,
				 -30 + (Class67_Sub27.anInt3303 + arg0));
		    }
		    Class74[] class74s = Class136.aClass74Array2499;
		    for (int i_1_ = 0; class74s.length > i_1_; i_1_++) {
			Class74 class74 = class74s[i_1_];
			if (class74 != null && class74.anInt1491 == 1
			    && (((Class47.anIntArray965
				  [-Class67_Sub1_Sub4.anInt3855 + i])
				 ^ 0xffffffff)
				== (class74.anInt1482 ^ 0xffffffff))
			    && Class67_Sub1_Sub9.anInt3952 % 20 < 10) {
			    int i_2_;
			    if (class64.anInt1213 == -1)
				i_2_ = (class131_sub7.method1876((byte) 116)
					+ 15);
			    else
				i_2_ = class64.anInt1213 - -15;
			    Class67_Sub1_Sub36.method786(arg5 >> -1825861119,
							 (byte) 45,
							 arg4 >> 1660448321,
							 arg3, arg1, i_2_,
							 class131_sub7);
			    if (Class69.anInt1383 > -1)
				Class139.aClass67_Sub5_Sub19Array2524
				    [class74.anInt1496].method1006
				    (-12 + Class69.anInt1383 + arg2,
				     -28 + (Class67_Sub27.anInt3303 + arg0));
			}
		    }
		} else {
		    int i_3_ = 30;
		    Class131_Sub7_Sub2 class131_sub7_sub2
			= (Class131_Sub7_Sub2) class131_sub7;
		    if (class131_sub7_sub2.prayerIcon != -1
			|| class131_sub7_sub2.skullIcon != -1) {
			Class67_Sub1_Sub36.method786
			    (arg5 >> 1167558785, (byte) 45, arg4 >> -821563679,
			     arg3, arg1,
			     15 + class131_sub7.method1876((byte) 127),
			     class131_sub7);
			if ((Class69.anInt1383 ^ 0xffffffff) < 0) {
			    if (class131_sub7_sub2.prayerIcon != -1) {
				Class95.aClass67_Sub5_Sub19Array1902
				    [class131_sub7_sub2.prayerIcon].method1006
				    (-12 + Class69.anInt1383 + arg2,
				     arg0 + (Class67_Sub27.anInt3303 - i_3_));
				i_3_ += 25;
			    }
			    if (class131_sub7_sub2.skullIcon != -1) {
				Class102.aClass67_Sub5_Sub19Array2006
				    [class131_sub7_sub2.skullIcon].method1006
				    (-12 + arg2 + Class69.anInt1383,
				     -i_3_ + (arg0
					      - -Class67_Sub27.anInt3303));
				i_3_ += 25;
			    }
			}
		    }
		    if ((i ^ 0xffffffff) <= -1) {
			Class74[] class74s = Class136.aClass74Array2499;
			for (int i_4_ = 0; class74s.length > i_4_; i_4_++) {
			    Class74 class74 = class74s[i_4_];
			    if (class74 != null && class74.anInt1491 == 10
				&& ((class74.anInt1482 ^ 0xffffffff)
				    == (Class3.anIntArray120[i]
					^ 0xffffffff))) {
				Class67_Sub1_Sub36.method786
				    (arg5 >> -133433215, (byte) 45,
				     arg4 >> -1797829023, arg3, arg1,
				     class131_sub7.method1876((byte) 115) + 15,
				     class131_sub7);
				if ((Class69.anInt1383 ^ 0xffffffff) < 0)
				    Class139.aClass67_Sub5_Sub19Array2524
					[class74.anInt1496].method1006
					(arg2 + (Class69.anInt1383 + -12),
					 -i_3_ + (arg0
						  + Class67_Sub27.anInt3303));
			    }
			}
		    }
		}
		if (class131_sub7.aRSString_3723 != null
		    && (i >= Class67_Sub1_Sub4.anInt3855
			|| (Class119.anInt2245 ^ 0xffffffff) == -1
			|| Class119.anInt2245 == 3
			|| ((Class119.anInt2245 ^ 0xffffffff) == -2
			    && Class103.method1552(true, (((Class131_Sub7_Sub2)
							   class131_sub7)
							  .playerName))))) {
		    Class67_Sub1_Sub36.method786(arg5 >> -459841119, (byte) 45,
						 arg4 >> -1806986079, arg3,
						 arg1,
						 class131_sub7
						     .method1876((byte) 104),
						 class131_sub7);
		    if ((Class69.anInt1383 ^ 0xffffffff) < 0
			&& ((Class67_Sub5_Sub5.anInt4526 ^ 0xffffffff)
			    < (Class63.anInt1171 ^ 0xffffffff))) {
			Class67_Sub5_Sub5.anIntArray4530[Class63.anInt1171]
			    = Class130.aClass67_Sub5_Sub10_2404
				  .method913(class131_sub7.aRSString_3723) / 2;
			Class67_Sub5_Sub5.anIntArray4529[Class63.anInt1171]
			    = Class130.aClass67_Sub5_Sub10_2404.anInt4623;
			Class67_Sub5_Sub5.anIntArray4527[Class63.anInt1171]
			    = Class69.anInt1383;
			Class67_Sub5_Sub5.anIntArray4525[Class63.anInt1171]
			    = Class67_Sub27.anInt3303;
			Class67_Sub5_Sub5.anIntArray4531[Class63.anInt1171]
			    = class131_sub7.anInt3746;
			Class67_Sub5_Sub5.anIntArray4533[Class63.anInt1171]
			    = class131_sub7.anInt3754;
			Class67_Sub5_Sub5.anIntArray4528[Class63.anInt1171]
			    = class131_sub7.anInt3773;
			Class67_Sub5_Sub5.aRSStringArray4532[Class63.anInt1171]
			    = class131_sub7.aRSString_3723;
			Class63.anInt1171++;
		    }
		}
		if (Class67_Sub1_Sub9.anInt3952 < class131_sub7.anInt3695) {
		    Class67_Sub5_Sub19 class67_sub5_sub19
			= Class126_Sub1.aClass67_Sub5_Sub19Array3422[0];
		    Class67_Sub5_Sub19 class67_sub5_sub19_5_
			= Class126_Sub1.aClass67_Sub5_Sub19Array3422[1];
		    int i_6_;
		    if (class131_sub7 instanceof Class131_Sub7_Sub1) {
			Class131_Sub7_Sub1 class131_sub7_sub1
			    = (Class131_Sub7_Sub1) class131_sub7;
			Class67_Sub5_Sub19[] class67_sub5_sub19s
			    = ((Class67_Sub5_Sub19[])
			       (Class144.aClass136_2599.method1924
				((long) (class131_sub7_sub1.aClass64_5047
					 .anInt1230),
				 false)));
			if (class67_sub5_sub19s == null) {
			    class67_sub5_sub19s
				= (Class67_Sub1_Sub17.method699
				   (class131_sub7_sub1.aClass64_5047.anInt1230,
				    Class51.aClass9_1044, 2048, 0));
			    if (class67_sub5_sub19s != null)
				Class144.aClass136_2599.method1926
				    ((long) (class131_sub7_sub1.aClass64_5047
					     .anInt1230),
				     class67_sub5_sub19s, (byte) -71);
			}
			Class64 class64 = class131_sub7_sub1.aClass64_5047;
			if (class67_sub5_sub19s != null
			    && class67_sub5_sub19s.length == 2) {
			    class67_sub5_sub19_5_ = class67_sub5_sub19s[1];
			    class67_sub5_sub19 = class67_sub5_sub19s[0];
			}
			if (class64.anInt1213 != -1)
			    i_6_ = class64.anInt1213;
			else
			    i_6_ = class131_sub7.method1876((byte) 100);
		    } else
			i_6_ = class131_sub7.method1876((byte) 126);
		    Class67_Sub1_Sub36.method786(arg5 >> -2083402207,
						 (byte) 45, arg4 >> -983905247,
						 arg3, arg1,
						 (class67_sub5_sub19.anInt4812
						  + (10 + i_6_)),
						 class131_sub7);
		    if ((Class69.anInt1383 ^ 0xffffffff) < 0) {
			int i_7_ = Class67_Sub27.anInt3303 + (arg0 - 3);
			int i_8_
			    = (-(class67_sub5_sub19.anInt4813 >> -1543487903)
			       + Class69.anInt1383 + arg2);
			class67_sub5_sub19.method1006(i_8_, i_7_);
			int i_9_ = class67_sub5_sub19.anInt4812;
			int i_10_ = (class67_sub5_sub19.anInt4813
				     * class131_sub7.anInt3761 / 255);
			Class121.method1673(i_8_, i_7_, i_10_ + i_8_,
					    i_9_ + i_7_);
			class67_sub5_sub19_5_.method1006(i_8_, i_7_);
			Class121.method1685(arg2, arg0, arg4 + arg2,
					    arg0 + arg5);
		    }
		}
		for (int i_11_ = 0; i_11_ < 4; i_11_++) {
		    if (class131_sub7.anIntArray3697[i_11_]
			> Class67_Sub1_Sub9.anInt3952) {
			int i_12_;
			if (class131_sub7 instanceof Class131_Sub7_Sub1) {
			    Class131_Sub7_Sub1 class131_sub7_sub1
				= (Class131_Sub7_Sub1) class131_sub7;
			    Class64 class64 = class131_sub7_sub1.aClass64_5047;
			    if ((class64.anInt1213 ^ 0xffffffff) == 0)
				i_12_
				    = class131_sub7.method1876((byte) 100) / 2;
			    else
				i_12_ = class64.anInt1213 / 2;
			} else
			    i_12_ = class131_sub7.method1876((byte) 104) / 2;
			Class67_Sub1_Sub36.method786(arg5 >> -17016095,
						     (byte) 45,
						     arg4 >> -41957983, arg3,
						     arg1, i_12_,
						     class131_sub7);
			if ((Class69.anInt1383 ^ 0xffffffff) < 0) {
			    if (i_11_ == 1)
				Class67_Sub27.anInt3303 -= 20;
			    if (i_11_ == 2) {
				Class69.anInt1383 -= 15;
				Class67_Sub27.anInt3303 -= 10;
			    }
			    if (i_11_ == 3) {
				Class69.anInt1383 += 15;
				Class67_Sub27.anInt3303 -= 10;
			    }
			    Class67_Sub5_Sub12.aClass67_Sub5_Sub19Array4681
				[class131_sub7.anIntArray3763[i_11_]]
				.method1006
				(arg2 - (-Class69.anInt1383 + 12),
				 -12 + arg0 - -Class67_Sub27.anInt3303);
			    Class84.aClass67_Sub5_Sub10_1692.method908
				(InputStream_Sub1.method47((class131_sub7
							    .anIntArray3774
							    [i_11_]),
							   true),
				 -1 + (Class69.anInt1383 + arg2),
				 arg0 - (-Class67_Sub27.anInt3303 - 3),
				 16777215, 0);
			}
		    }
		}
	    }
	}
	int i = 0;
	if (arg6 == 20) {
	    for (/**/; Class63.anInt1171 > i; i++) {
		int i_13_ = Class67_Sub5_Sub5.anIntArray4527[i];
		int i_14_ = Class67_Sub5_Sub5.anIntArray4525[i];
		int i_15_ = Class67_Sub5_Sub5.anIntArray4530[i];
		int i_16_ = Class67_Sub5_Sub5.anIntArray4529[i];
		boolean bool = true;
		while (bool) {
		    bool = false;
		    for (int i_17_ = 0; i > i_17_; i_17_++) {
			if (((Class67_Sub5_Sub5.anIntArray4525[i_17_]
			      - Class67_Sub5_Sub5.anIntArray4529[i_17_])
			     < 2 + i_14_)
			    && ((i_14_ + -i_16_ ^ 0xffffffff)
				> (2 + Class67_Sub5_Sub5.anIntArray4525[i_17_]
				   ^ 0xffffffff))
			    && (-i_15_ + i_13_
				< (Class67_Sub5_Sub5.anIntArray4527[i_17_]
				   + Class67_Sub5_Sub5.anIntArray4530[i_17_]))
			    && ((-Class67_Sub5_Sub5.anIntArray4530[i_17_]
				 + Class67_Sub5_Sub5.anIntArray4527[i_17_])
				^ 0xffffffff) > (i_15_ + i_13_ ^ 0xffffffff)
			    && ((Class67_Sub5_Sub5.anIntArray4525[i_17_]
				 + -Class67_Sub5_Sub5.anIntArray4529[i_17_])
				< i_14_)) {
			    i_14_
				= (Class67_Sub5_Sub5.anIntArray4525[i_17_]
				   + -Class67_Sub5_Sub5.anIntArray4529[i_17_]);
			    bool = true;
			}
		    }
		}
		Class69.anInt1383 = Class67_Sub5_Sub5.anIntArray4527[i];
		Class67_Sub27.anInt3303
		    = Class67_Sub5_Sub5.anIntArray4525[i] = i_14_;
		RSString RSString = Class67_Sub5_Sub5.aRSStringArray4532[i];
		if ((Class63.anInt1170 ^ 0xffffffff) == -1) {
		    int i_18_ = 16776960;
		    if (Class67_Sub5_Sub5.anIntArray4531[i] < 6)
			i_18_ = (Class67_Sub9.anIntArray2983
				 [Class67_Sub5_Sub5.anIntArray4531[i]]);
		    if ((Class67_Sub5_Sub5.anIntArray4531[i] ^ 0xffffffff)
			== -7)
			i_18_ = ((Class6.anInt151 % 20 ^ 0xffffffff) > -11
				 ? 16711680 : 16776960);
		    if (Class67_Sub5_Sub5.anIntArray4531[i] == 7)
			i_18_ = Class6.anInt151 % 20 < 10 ? 255 : 65535;
		    if (Class67_Sub5_Sub5.anIntArray4531[i] == 8)
			i_18_ = Class6.anInt151 % 20 < 10 ? 45056 : 8454016;
		    if (Class67_Sub5_Sub5.anIntArray4531[i] == 9) {
			int i_19_ = -Class67_Sub5_Sub5.anIntArray4528[i] + 150;
			if (i_19_ < 50)
			    i_18_ = 1280 * i_19_ + 16711680;
			else if (i_19_ < 100)
			    i_18_ = 16776960 - (-50 + i_19_) * 327680;
			else if ((i_19_ ^ 0xffffffff) > -151)
			    i_18_ = 65280 - -(i_19_ * 5) + -500;
		    }
		    if (Class67_Sub5_Sub5.anIntArray4531[i] == 10) {
			int i_20_ = 150 + -Class67_Sub5_Sub5.anIntArray4528[i];
			if ((i_20_ ^ 0xffffffff) <= -51) {
			    if (i_20_ >= 100) {
				if ((i_20_ ^ 0xffffffff) > -151)
				    i_18_ = (255
					     - (-(327680 * i_20_) - -32768000)
					     - (i_20_ + -100) * 5);
			    } else
				i_18_ = 16711935 + -(327680 * (i_20_ - 50));
			} else
			    i_18_ = 5 * i_20_ + 16711680;
		    }
		    if (Class67_Sub5_Sub5.anIntArray4531[i] == 11) {
			int i_21_ = 150 - Class67_Sub5_Sub5.anIntArray4528[i];
			if ((i_21_ ^ 0xffffffff) > -51)
			    i_18_ = 16777215 - 327685 * i_21_;
			else if ((i_21_ ^ 0xffffffff) <= -101) {
			    if (i_21_ < 150)
				i_18_ = 16777215 - i_21_ * 327680 + 32768000;
			} else
			    i_18_ = 65280 + (i_21_ + -50) * 327685;
		    }
		    if ((Class67_Sub5_Sub5.anIntArray4533[i] ^ 0xffffffff)
			== -1)
			Class130.aClass67_Sub5_Sub10_2404.method908
			    (RSString, Class69.anInt1383 + arg2,
			     arg0 - -Class67_Sub27.anInt3303, i_18_, 0);
		    if ((Class67_Sub5_Sub5.anIntArray4533[i] ^ 0xffffffff)
			== -2)
			Class130.aClass67_Sub5_Sub10_2404.method912
			    (RSString, arg2 - -Class69.anInt1383,
			     arg0 + Class67_Sub27.anInt3303, i_18_, 0,
			     Class6.anInt151);
		    if ((Class67_Sub5_Sub5.anIntArray4533[i] ^ 0xffffffff)
			== -3)
			Class130.aClass67_Sub5_Sub10_2404.method907
			    (RSString, Class69.anInt1383 + arg2,
			     Class67_Sub27.anInt3303 + arg0, i_18_, 0,
			     Class6.anInt151);
		    if ((Class67_Sub5_Sub5.anIntArray4533[i] ^ 0xffffffff)
			== -4)
			Class130.aClass67_Sub5_Sub10_2404.method910
			    (RSString, Class69.anInt1383 + arg2,
			     Class67_Sub27.anInt3303 + arg0, i_18_, 0,
			     Class6.anInt151,
			     -Class67_Sub5_Sub5.anIntArray4528[i] + 150);
		    if ((Class67_Sub5_Sub5.anIntArray4533[i] ^ 0xffffffff)
			== -5) {
			int i_22_
			    = ((150 - Class67_Sub5_Sub5.anIntArray4528[i])
			       * (Class130.aClass67_Sub5_Sub10_2404
				      .method913(RSString)
				  + 100)
			       / 150);
			Class121.method1673(-50 + arg2 + Class69.anInt1383,
					    arg0,
					    arg2 + (Class69.anInt1383 - -50),
					    arg0 + arg5);
			Class130.aClass67_Sub5_Sub10_2404.method920
			    (RSString,
			     arg2 + Class69.anInt1383 - (-50 - -i_22_),
			     arg0 + Class67_Sub27.anInt3303, i_18_, 0);
			Class121.method1685(arg2, arg0, arg2 + arg4,
					    arg0 - -arg5);
		    }
		    if ((Class67_Sub5_Sub5.anIntArray4533[i] ^ 0xffffffff)
			== -6) {
			int i_23_ = 150 - Class67_Sub5_Sub5.anIntArray4528[i];
			Class121.method1673
			    (arg2,
			     (arg0 - -Class67_Sub27.anInt3303
			      - Class130.aClass67_Sub5_Sub10_2404.anInt4623
			      + -1),
			     arg4 + arg2, arg0 - -Class67_Sub27.anInt3303 + 5);
			int i_24_ = 0;
			if ((i_23_ ^ 0xffffffff) > -26)
			    i_24_ = i_23_ - 25;
			else if ((i_23_ ^ 0xffffffff) < -126)
			    i_24_ = i_23_ - 125;
			Class130.aClass67_Sub5_Sub10_2404.method908
			    (RSString, arg2 + Class69.anInt1383,
			     Class67_Sub27.anInt3303 + (arg0 + i_24_), i_18_,
			     0);
			Class121.method1685(arg2, arg0, arg2 + arg4,
					    arg0 + arg5);
		    }
		} else
		    Class130.aClass67_Sub5_Sub10_2404.method908
			(RSString, arg2 - -Class69.anInt1383,
			 arg0 + Class67_Sub27.anInt3303, 16776960, 0);
	    }
	}
    }
    
    public static void method1928(boolean arg0) {
	if (arg0 == false) {
	    aRSString_2517 = null;
	    aRSString_2516 = null;
	    anIntArray2504 = null;
	    aRSString_2522 = null;
	    aRSString_2518 = null;
	    aShortArray2515 = null;
	    aRSString_2523 = null;
	    aClass136_2508 = null;
	}
    }
    
    public Class67 method1929(byte arg0) {
	int i = -33 % ((-22 - arg0) / 38);
	anInt2502++;
	return aClass92_2510.method1480(11);
    }
    
    public Class67_Sub5 method1930(int arg0, long arg1) {
	try {
	    anInt2503++;
	    Class67_Sub5 class67_sub5
		= (Class67_Sub5) aClass92_2510.method1489((byte) -73, arg1);
	    if (arg0 != 261775)
		method1930(-117, 85L);
	    if (class67_sub5 != null)
		aClass120_2512.method1663(class67_sub5, -225);
	    return class67_sub5;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("vj.H(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public Class67 method1931(int arg0) {
	if (arg0 != 3)
	    return null;
	anInt2509++;
	return aClass92_2510.method1483((byte) 24);
    }
    
    public void method1932(long arg0, int arg1, Class67_Sub5 arg2) {
	try {
	    anInt2511++;
	    if (anInt2514 == arg1) {
		Class67_Sub5 class67_sub5
		    = aClass120_2512.method1657((byte) -123);
		class67_sub5.method606((byte) -118);
		class67_sub5.method821(arg1 + 24120);
		if (class67_sub5 == aClass67_Sub5_2505) {
		    class67_sub5 = aClass120_2512.method1657((byte) 12);
		    class67_sub5.method606((byte) -118);
		    class67_sub5.method821(24120);
		}
	    } else
		anInt2514--;
	    aClass92_2510.method1488((byte) -89, arg2, arg0);
	    aClass120_2512.method1663(arg2, arg1 + -225);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("vj.E(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static int method1933(int arg0, byte arg1) {
	anInt2506++;
	int i = -87 / ((-76 - arg1) / 42);
	return (arg0 & 0x3fe8f) >> 1880298027;
    }
    
    public void method1934(int arg0) {
	aClass120_2512.method1665((byte) -109);
	anInt2501++;
	aClass92_2510.method1478(true);
	if (arg0 != 20)
	    aRSString_2523 = null;
	aClass67_Sub5_2505 = new Class67_Sub5();
	anInt2514 = anInt2513;
    }
    
    public Class137(int arg0) {
	anInt2514 = arg0;
	int i;
	for (i = 1; (arg0 ^ 0xffffffff) < (i + i ^ 0xffffffff); i += i) {
	    /* empty */
	}
	anInt2513 = arg0;
	aClass92_2510 = new Class92(i);
    }
    
    static {
	aShortArray2515 = new short[] { 33, 8, 51, 9, 31, 40, 34, 17 };
	aRSString_2517 = Class134.method1914("clignotant2:", (byte) 3);
	anInt2521 = 0;
	aRSString_2523 = Class134.method1914("slide:", (byte) 65);
	aRSString_2516 = aRSString_2523;
	aRSString_2522 = aRSString_2523;
    }
}
