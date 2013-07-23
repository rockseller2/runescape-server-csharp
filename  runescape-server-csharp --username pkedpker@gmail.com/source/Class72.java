/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class72
{
    public static boolean aBoolean1432;
    public int[] anIntArray1433;
    public static int anInt1434;
    public static RSString aRSString_1435
	= Class134.method1914("Examine", (byte) 59);
    public static int anInt1436;
    public byte[] aByteArray1437;
    public static int anInt1438;
    public int anInt1439;
    public static long aLong1440;
    public RSString[] aRSStringArray1441;
    public static RSString aRSString_1442;
    public short[] aShortArray1443;
    public short[] aShortArray1444;
    public static int anInt1445;
    public static int anInt1446;
    public static Class106[] aClass106Array1447;
    public static int anInt1448;
    public static RSString aRSString_1449;
    
    public boolean method1344(int arg0, byte arg1) {
	int i = -9 / ((70 - arg1) / 50);
	anInt1448++;
	if ((aByteArray1437[arg0] & 0x4 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    public int method1345(int arg0, byte arg1) {
	anInt1434++;
	if (arg1 <= 5)
	    return 68;
	return 0x3 & aByteArray1437[arg0];
    }
    
    public static Class131_Sub6 method1346
	(int arg0, int arg1, Class131_Sub6 arg2, int arg3, int arg4,
	 boolean arg5, int arg6, Class41 arg7, int arg8, boolean arg9,
	 int arg10, int arg11, int arg12, int arg13) {
	try {
	    anInt1438++;
	    long l
		= (((long) arg6 << -2054498576) + ((long) arg4 << -1113743904)
		   + (long) ((arg3 << -1836200) + arg1
			     + (arg11 << -1522649520)));
	    Class131_Sub6 class131_sub6
		= ((Class131_Sub6)
		   Class131_Sub5.aClass136_3666.method1924(l, !arg5));
	    if (class131_sub6 == null) {
		int i;
		if ((arg1 ^ 0xffffffff) == -2)
		    i = 9;
		else if (arg1 == 2)
		    i = 12;
		else if ((arg1 ^ 0xffffffff) == -4)
		    i = 15;
		else if (arg1 == 4)
		    i = 18;
		else
		    i = 21;
		int[] is = { 64, 96, 128 };
		int i_0_ = 3;
		int[][] is_1_ = new int[i_0_][i];
		Class131_Sub2 class131_sub2
		    = new Class131_Sub2(1 - -(i_0_ * i), -i + 2 * i * i_0_, 0);
		int i_2_ = class131_sub2.method1803(0, 0, 0);
		for (int i_3_ = 0; i_0_ > i_3_; i_3_++) {
		    int i_4_ = is[i_3_];
		    int i_5_ = is[i_3_];
		    for (int i_6_ = 0; i_6_ < i; i_6_++) {
			int i_7_ = (i_6_ << -683804917) / i;
			int i_8_ = (arg8 + Class26.anIntArray617[i_7_] * i_4_
				    >> 41417424);
			int i_9_ = (i_5_ * Class26.anIntArray612[i_7_] + arg0
				    >> -945226960);
			is_1_[i_3_][i_6_]
			    = class131_sub2.method1803(i_8_, 0, i_9_);
		    }
		}
		for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff);
		     i_10_++) {
		    int i_11_ = (128 + i_10_ * 256) / i_0_;
		    int i_12_ = 256 + -i_11_;
		    byte i_13_
			= (byte) (arg3 * i_11_ + i_12_ * arg11 >> -1470017816);
		    short i_14_
			= (short) (((0x38000 & (i_11_ * (0x380 & arg6)
						+ i_12_ * (arg4 & 0x380)))
				    + ((i_12_ * (arg4 & 0xfc00)
					+ i_11_ * (arg6 & 0xfc00))
				       & 0xfc0000)
				    + (((0x7f & arg6) * i_11_
					+ (0x7f & arg4) * i_12_)
				       & 0x7f00))
				   >> -527663512);
		    for (int i_15_ = 0;
			 (i ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
			if ((i_10_ ^ 0xffffffff) == -1)
			    class131_sub2.method1777(i_2_,
						     is_1_[0][(i_15_ + 1) % i],
						     is_1_[0][i_15_], (byte) 1,
						     i_14_, i_13_);
			else {
			    class131_sub2.method1777(is_1_[i_10_ + -1][i_15_],
						     (is_1_[-1 + i_10_]
						      [(i_15_ + 1) % i]),
						     (is_1_[i_10_]
						      [(1 + i_15_) % i]),
						     (byte) 1, i_14_, i_13_);
			    class131_sub2.method1777(is_1_[-1 + i_10_][i_15_],
						     (is_1_[i_10_]
						      [(1 + i_15_) % i]),
						     is_1_[i_10_][i_15_],
						     (byte) 1, i_14_, i_13_);
			}
		    }
		}
		class131_sub6
		    = class131_sub2.method1787(64, 768, -50, -10, -50);
		Class131_Sub5.aClass136_3666.method1926(l, class131_sub6,
							(byte) -71);
	    }
	    int i = -1 + arg1 * 64;
	    int i_16_ = -i;
	    int i_17_ = -i;
	    int i_18_ = i;
	    int i_19_ = i;
	    if (arg9) {
		if (arg10 > 1152 && arg10 < 1920)
		    i_19_ += 128;
		if (arg10 > 1664 || arg10 < 384)
		    i_16_ -= 128;
		if (arg10 > 640 && (arg10 ^ 0xffffffff) > -1409)
		    i_18_ += 128;
		if (arg10 > 128 && (arg10 ^ 0xffffffff) > -897)
		    i_17_ -= 128;
	    }
	    if (arg5 != true)
		return null;
	    int i_20_ = arg2.method1831();
	    if ((i_20_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff))
		i_20_ = i_17_;
	    int i_21_ = arg2.method1830();
	    int i_22_ = arg2.method1846();
	    int i_23_ = arg2.method1852();
	    if ((i_22_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff))
		i_22_ = i_16_;
	    Class67_Sub5_Sub7 class67_sub5_sub7 = null;
	    if ((i_23_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
		i_23_ = i_18_;
	    if ((i_19_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff))
		i_21_ = i_19_;
	    if (arg7 != null) {
		arg12 = arg7.anIntArray855[arg12];
		class67_sub5_sub7
		    = Class96_Sub1.method1508(98, arg12 >> -1689517232);
		arg12 &= 0xffff;
	    }
	    if (class67_sub5_sub7 == null) {
		class131_sub6 = class131_sub6.method1833(true, true, true);
		class131_sub6.method1845((-i_20_ + i_21_) / 2, 128,
					 (i_23_ - i_22_) / 2);
		class131_sub6.method1837((i_21_ + i_20_) / 2, 0,
					 (i_23_ + i_22_) / 2);
	    } else {
		class131_sub6
		    = (class131_sub6.method1833
		       (!class67_sub5_sub7.method878((byte) -49, arg12),
			!class67_sub5_sub7.method876(1, arg12), true));
		class131_sub6.method1845((-i_20_ + i_21_) / 2, 128,
					 (i_23_ + -i_22_) / 2);
		class131_sub6.method1837((i_20_ + i_21_) / 2, 0,
					 (i_22_ - -i_23_) / 2);
		class131_sub6.method1854(class67_sub5_sub7, arg12);
	    }
	    if ((arg10 ^ 0xffffffff) != -1)
		class131_sub6.method1855(arg10);
	    Class131_Sub6_Sub1 class131_sub6_sub1
		= (Class131_Sub6_Sub1) class131_sub6;
	    if (Class131_Sub5.method1826(Canvas_Sub1.anInt59, arg8 + i_20_,
					 i_22_ + arg0, (byte) 107) != arg13
		|| arg13 != Class131_Sub5.method1826(Canvas_Sub1.anInt59,
						     arg8 - -i_21_,
						     i_23_ + arg0,
						     (byte) 98)) {
		for (int i_24_ = 0;
		     ((class131_sub6_sub1.anInt4980 ^ 0xffffffff)
		      < (i_24_ ^ 0xffffffff));
		     i_24_++)
		    class131_sub6_sub1.anIntArray4967[i_24_]
			+= Class131_Sub5.method1826(Canvas_Sub1.anInt59,
						    arg8 + (class131_sub6_sub1
							    .anIntArray4997
							    [i_24_]),
						    arg0 + (class131_sub6_sub1
							    .anIntArray4972
							    [i_24_]),
						    (byte) -90) - arg13;
		class131_sub6_sub1.aBoolean4987 = false;
	    }
	    return class131_sub6;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("kc.D(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ',' + arg4 + ','
						+ arg5 + ',' + arg6 + ','
						+ (arg7 != null ? "{...}"
						   : "null")
						+ ',' + arg8 + ',' + arg9 + ','
						+ arg10 + ',' + arg11 + ','
						+ arg12 + ',' + arg13 + ')'));
	}
    }
    
    public boolean method1347(int arg0, boolean arg1) {
	anInt1445++;
	if (arg1 != true)
	    aRSStringArray1441 = null;
	if ((aByteArray1437[arg0] & 0x10 ^ 0xffffffff) != -1)
	    return false;
	return true;
    }
    
    public boolean method1348(int arg0, int arg1) {
	anInt1436++;
	int i = -63 % ((4 - arg0) / 54);
	if ((aByteArray1437[arg1] & 0x8) == 0)
	    return false;
	return true;
    }
    
    public static void method1349(Class27 arg0, int arg1) {
	if (arg1 >= 119) {
	    anInt1446++;
	    Class86.aClass27_1756 = arg0;
	}
    }
    
    public static void method1350(boolean arg0) {
	if (arg0 != false)
	    aRSString_1435 = null;
	aClass106Array1447 = null;
	aRSString_1442 = null;
	aRSString_1449 = null;
	aRSString_1435 = null;
    }
    
    public Class72(int arg0) {
	anInt1439 = arg0;
	aRSStringArray1441 = new RSString[anInt1439];
	aShortArray1443 = new short[anInt1439];
	anIntArray1433 = new int[anInt1439];
	aByteArray1437 = new byte[anInt1439];
	aShortArray1444 = new short[anInt1439];
    }
    
    static {
	aBoolean1432 = true;
	aRSString_1442 = aRSString_1435;
	aClass106Array1447 = new Class106[50];
	aLong1440 = 0L;
	aRSString_1449 = Class134.method1914("; Max)2Age=", (byte) 124);
    }
}
