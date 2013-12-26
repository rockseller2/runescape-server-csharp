/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class78 implements Runnable
{
    public SignLink aSignLink_1596;
    public static int[] anIntArray1597;
    public static int anInt1598;
    public static int[] anIntArray1599 = new int[32];
    public static int anInt1600;
    public volatile boolean aBoolean1601;
    public static boolean aBoolean1602 = false;
    public static int anInt1603;
    public static int anInt1604;
    public volatile boolean aBoolean1605;
    public static Class28 aClass28_1606;
    public volatile Class28[] aClass28Array1607 = new Class28[2];
    public static RSString aRSString_1608;
    public static RSString aRSString_1609;
    
    public void run() {
	aBoolean1601 = true;
	try {
	    while (!aBoolean1605) {
		for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
		    Class28 class28 = aClass28Array1607[i];
		    if (class28 != null)
			class28.method268(false);
		}
		Class67_Sub1_Sub23.method726(-108, 10L);
		Class67_Sub23.method1287(-3, null, aSignLink_1596);
	    }
	} catch (Exception exception) {
	    Class104.method1563(exception, null, 1);
	} finally {
	    aBoolean1601 = false;
	}
	anInt1600++;
    }
    
    public static void method1410(Class9 arg0, int arg1) {
	Class67_Sub5_Sub3.anInt4492
	    = arg0.method126((byte) 106, Class55_Sub1.aRSString_2792);
	anInt1598++;
	Class67_Sub1_Sub36.anInt4367
	    = arg0.method126((byte) 70, Class67_Sub19.aRSString_3147);
	Class15.anInt458
	    = arg0.method126((byte) -116, Class67_Sub5_Sub11.aRSString_4677);
	Class67_Sub12.anInt3041
	    = arg0.method126((byte) -120, Class67_Sub1_Sub28.aRSString_4256);
	if (arg1 >= 25) {
	    Class67_Sub11_Sub2.anInt4849
		= arg0.method126((byte) 13, Class67_Sub1_Sub32.aRSString_4300);
	    Class15.anInt460
		= arg0.method126((byte) -119, Class55_Sub1.aRSString_2788);
	    Class30.anInt703
		= arg0.method126((byte) -114, Class67_Sub1_Sub5.aRSString_3872);
	    Class137.anInt2519
		= arg0.method126((byte) -123, Class113.aRSString_2129);
	    Class62.anInt1162
		= arg0.method126((byte) 72, Class109.aRSString_2089);
	    Class67_Sub14.anInt3064
		= arg0.method126((byte) -122,
				 Class67_Sub1_Sub35.aRSString_4352);
	    Class67_Sub1_Sub24.anInt4213
		= arg0.method126((byte) -120, Class85.aRSString_1715);
	    Class40.anInt819
		= arg0.method126((byte) 126, Class67_Sub1_Sub12.aRSString_4015);
	    Class126_Sub1.anInt3419
		= arg0.method126((byte) -127, Class30.aRSString_694);
	    Class105.anInt2052
		= arg0.method126((byte) 126, Class67_Sub1.aRSString_2835);
	    Class67_Sub10.anInt3017
		= arg0.method126((byte) -121,
				 Class67_Sub5_Sub17.aRSString_4793);
	    Class89.anInt1829
		= arg0.method126((byte) 50, Class74.aRSString_1484);
	    Class67_Sub17.anInt3106
		= arg0.method126((byte) -123, Class37.aRSString_804);
	    Class124.anInt2334
		= arg0.method126((byte) 94, PacketStream.aRSString_4836);
	}
    }
    
    public static boolean method1411
	(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	anInt1604++;
	for (int i = 0; i < 104; i++) {
	    for (int i_0_ = 0; i_0_ < 104; i_0_++) {
		Class67_Sub5_Sub12.anIntArrayArray4694[i][i_0_] = 0;
		Class67_Sub22.anIntArrayArray3183[i][i_0_] = 99999999;
	    }
	}
	Class67_Sub5_Sub12.anIntArrayArray4694[arg6][arg1] = 99;
	int i = arg6;
	Class67_Sub22.anIntArrayArray3183[arg6][arg1] = 0;
	int i_1_ = arg1;
	int i_2_ = 0;
	Class90.anIntArray1849[i_2_] = arg6;
	Class126.anIntArray2345[i_2_++] = arg1;
	int i_3_ = 0;
	boolean bool = false;
	int[][] is = (Class53.aClass73Array1059[Canvas_Sub1.anInt59]
		      .anIntArrayArray1453);
	while (i_3_ != i_2_) {
	    i = Class90.anIntArray1849[i_3_];
	    i_1_ = Class126.anIntArray2345[i_3_];
	    i_3_ = 0xfff & 1 + i_3_;
	    if (arg4 == i && i_1_ == arg7) {
		bool = true;
		break;
	    }
	    if (arg3 != 0) {
		if (((arg3 ^ 0xffffffff) > -6 || arg3 == 10)
		    && (Class53.aClass73Array1059[Canvas_Sub1.anInt59]
			    .method1361
			(arg3 + -1, i, 2, arg4, -101, i_1_, arg7, arg8))) {
		    bool = true;
		    break;
		}
		if ((arg3 ^ 0xffffffff) > -11
		    && (Class53.aClass73Array1059[Canvas_Sub1.anInt59]
			    .method1368
			(arg4, 2, -1 + arg3, (byte) -107, arg7, arg8, i,
			 i_1_))) {
		    bool = true;
		    break;
		}
	    }
	    if ((arg5 ^ 0xffffffff) != -1 && arg9 != 0
		&& (Class53.aClass73Array1059[Canvas_Sub1.anInt59].method1370
		    (i, arg4, arg7, arg9, arg11, arg5, arg2 + 25428, 2,
		     i_1_))) {
		bool = true;
		break;
	    }
	    int i_4_ = 1 + Class67_Sub22.anIntArrayArray3183[i][i_1_];
	    if (i > 0
		&& Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i][i_1_] == 0
		&& (0x12c010e & is[i + -1][i_1_]) == 0
		&& (is[-1 + i][1 + i_1_] & 0x12c0138) == 0) {
		Class90.anIntArray1849[i_2_] = -1 + i;
		Class126.anIntArray2345[i_2_] = i_1_;
		Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i][i_1_] = 2;
		i_2_ = 0xfff & i_2_ - -1;
		Class67_Sub22.anIntArrayArray3183[i - 1][i_1_] = i_4_;
	    }
	    if (i < 102
		&& Class67_Sub5_Sub12.anIntArrayArray4694[1 + i][i_1_] == 0
		&& (0x12c0183 & is[2 + i][i_1_] ^ 0xffffffff) == -1
		&& (0x12c01e0 & is[2 + i][1 + i_1_]) == 0) {
		Class90.anIntArray1849[i_2_] = i - -1;
		Class126.anIntArray2345[i_2_] = i_1_;
		Class67_Sub5_Sub12.anIntArrayArray4694[1 + i][i_1_] = 8;
		Class67_Sub22.anIntArrayArray3183[1 + i][i_1_] = i_4_;
		i_2_ = 1 + i_2_ & 0xfff;
	    }
	    if ((i_1_ ^ 0xffffffff) < -1
		&& Class67_Sub5_Sub12.anIntArrayArray4694[i][-1 + i_1_] == 0
		&& (is[i][-1 + i_1_] & 0x12c010e ^ 0xffffffff) == -1
		&& (0x12c0183 & is[i + 1][-1 + i_1_] ^ 0xffffffff) == -1) {
		Class90.anIntArray1849[i_2_] = i;
		Class126.anIntArray2345[i_2_] = i_1_ + -1;
		Class67_Sub5_Sub12.anIntArrayArray4694[i][i_1_ + -1] = 1;
		Class67_Sub22.anIntArrayArray3183[i][i_1_ + -1] = i_4_;
		i_2_ = 0xfff & i_2_ + 1;
	    }
	    if (i_1_ < 102
		&& (Class67_Sub5_Sub12.anIntArrayArray4694[i][i_1_ + 1]
		    ^ 0xffffffff) == -1
		&& (0x12c0138 & is[i][2 + i_1_]) == 0
		&& (is[i - -1][i_1_ + 2] & 0x12c01e0) == 0) {
		Class90.anIntArray1849[i_2_] = i;
		Class126.anIntArray2345[i_2_] = i_1_ + 1;
		Class67_Sub5_Sub12.anIntArrayArray4694[i][1 + i_1_] = 4;
		i_2_ = 1 + i_2_ & 0xfff;
		Class67_Sub22.anIntArrayArray3183[i][i_1_ - -1] = i_4_;
	    }
	    if (i > 0 && i_1_ > 0
		&& (Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i][-1 + i_1_]
		    == 0)
		&& (0x12c0138 & is[-1 + i][i_1_] ^ 0xffffffff) == -1
		&& (is[i - 1][-1 + i_1_] & 0x12c010e) == 0
		&& (0x12c0183 & is[i][-1 + i_1_] ^ 0xffffffff) == -1) {
		Class90.anIntArray1849[i_2_] = i + -1;
		Class126.anIntArray2345[i_2_] = i_1_ + -1;
		i_2_ = i_2_ + 1 & 0xfff;
		Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i][-1 + i_1_] = 3;
		Class67_Sub22.anIntArrayArray3183[i - 1][-1 + i_1_] = i_4_;
	    }
	    if (i < 102 && (i_1_ ^ 0xffffffff) < -1
		&& (Class67_Sub5_Sub12.anIntArrayArray4694[i - -1][i_1_ - 1]
		    ^ 0xffffffff) == -1
		&& (is[i + 1][-1 + i_1_] & 0x12c010e ^ 0xffffffff) == -1
		&& (is[i - -2][-1 + i_1_] & 0x12c0183) == 0
		&& (is[i - -2][i_1_] & 0x12c01e0 ^ 0xffffffff) == -1) {
		Class90.anIntArray1849[i_2_] = 1 + i;
		Class126.anIntArray2345[i_2_] = i_1_ - 1;
		Class67_Sub5_Sub12.anIntArrayArray4694[1 + i][i_1_ - 1] = 9;
		i_2_ = 0xfff & 1 + i_2_;
		Class67_Sub22.anIntArrayArray3183[1 + i][-1 + i_1_] = i_4_;
	    }
	    if ((i ^ 0xffffffff) < -1 && (i_1_ ^ 0xffffffff) > -103
		&& (Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i][i_1_ + 1]
		    == 0)
		&& (is[i - 1][i_1_ + 1] & 0x12c010e ^ 0xffffffff) == -1
		&& (is[-1 + i][i_1_ - -2] & 0x12c0138) == 0
		&& (is[i][i_1_ + 2] & 0x12c01e0 ^ 0xffffffff) == -1) {
		Class90.anIntArray1849[i_2_] = -1 + i;
		Class126.anIntArray2345[i_2_] = i_1_ - -1;
		i_2_ = 0xfff & 1 + i_2_;
		Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i][1 + i_1_] = 6;
		Class67_Sub22.anIntArrayArray3183[-1 + i][1 + i_1_] = i_4_;
	    }
	    if ((i ^ 0xffffffff) > -103 && (i_1_ ^ 0xffffffff) > -103
		&& (Class67_Sub5_Sub12.anIntArrayArray4694[i + 1][i_1_ - -1]
		    == 0)
		&& (0x12c0138 & is[i - -1][2 + i_1_]) == 0
		&& (0x12c01e0 & is[i - -2][i_1_ - -2]) == 0
		&& (0x12c0183 & is[i + 2][i_1_ - -1]) == 0) {
		Class90.anIntArray1849[i_2_] = i - -1;
		Class126.anIntArray2345[i_2_] = 1 + i_1_;
		i_2_ = 0xfff & i_2_ + 1;
		Class67_Sub5_Sub12.anIntArrayArray4694[i - -1][i_1_ + 1] = 12;
		Class67_Sub22.anIntArrayArray3183[i - -1][i_1_ + 1] = i_4_;
	    }
	}
	Class10.anInt396 = 0;
	if (!bool) {
	    if (!arg0)
		return false;
	    int i_5_ = 100;
	    int i_6_ = 1000;
	    int i_7_ = 10;
	    for (int i_8_ = arg4 + -i_7_; i_8_ <= i_7_ + arg4; i_8_++) {
		for (int i_9_ = arg7 + -i_7_; i_9_ <= i_7_ + arg7; i_9_++) {
		    if ((i_8_ ^ 0xffffffff) <= -1 && i_9_ >= 0
			&& (i_8_ ^ 0xffffffff) > -105 && i_9_ < 104
			&& (Class67_Sub22.anIntArrayArray3183[i_8_][i_9_]
			    ^ 0xffffffff) > -101) {
			int i_10_ = 0;
			if (arg4 > i_8_)
			    i_10_ = arg4 + -i_8_;
			else if (i_8_ > arg4 + (arg5 + -1))
			    i_10_ = i_8_ - arg4 - arg5 + 1;
			int i_11_ = 0;
			if (arg7 > i_9_)
			    i_11_ = -i_9_ + arg7;
			else if (i_9_ > arg7 - (-arg9 - -1))
			    i_11_ = 1 - arg9 - (arg7 - i_9_);
			int i_12_ = i_11_ * i_11_ + i_10_ * i_10_;
			if ((i_12_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)
			    || i_12_ == i_6_ && i_5_ > (Class67_Sub22
							.anIntArrayArray3183
							[i_8_][i_9_])) {
			    i = i_8_;
			    i_6_ = i_12_;
			    i_1_ = i_9_;
			    i_5_ = (Class67_Sub22.anIntArrayArray3183[i_8_]
				    [i_9_]);
			}
		    }
		}
	    }
	    if ((i_6_ ^ 0xffffffff) == -1001)
		return false;
	    if ((i ^ 0xffffffff) == (arg6 ^ 0xffffffff) && arg1 == i_1_)
		return false;
	    Class10.anInt396 = 1;
	}
	i_3_ = 0;
	if (arg2 != -11)
	    return false;
	Class90.anIntArray1849[i_3_] = i;
	Class126.anIntArray2345[i_3_++] = i_1_;
	int i_14_;
	int i_13_ = i_14_ = Class67_Sub5_Sub12.anIntArrayArray4694[i][i_1_];
	while (i != arg6 || arg1 != i_1_) {
	    if (i_14_ != i_13_) {
		Class90.anIntArray1849[i_3_] = i;
		i_14_ = i_13_;
		Class126.anIntArray2345[i_3_++] = i_1_;
	    }
	    if ((i_13_ & 0x2 ^ 0xffffffff) == -1) {
		if ((0x8 & i_13_) != 0)
		    i--;
	    } else
		i++;
	    if ((0x1 & i_13_ ^ 0xffffffff) == -1) {
		if ((i_13_ & 0x4 ^ 0xffffffff) != -1)
		    i_1_--;
	    } else
		i_1_++;
	    i_13_ = Class67_Sub5_Sub12.anIntArrayArray4694[i][i_1_];
	}
	if (i_3_ > 0) {
	    Class144.method1964(i_3_, arg2 ^ 0x8, arg10);
	    return true;
	}
	if (arg10 == 1)
	    return false;
	return true;
    }
    
    public static void method1412(int arg0) {
	aRSString_1609 = null;
	if (arg0 != -1)
	    anIntArray1597 = null;
	aClass28_1606 = null;
	aRSString_1608 = null;
	anIntArray1597 = null;
	anIntArray1599 = null;
    }
    
    public static int method1413(int arg0) {
	anInt1603++;
	if (arg0 <= 44)
	    method1412(113);
	return 0;
    }
    
    public Class78() {
	aBoolean1605 = false;
	aBoolean1601 = false;
    }
    
    static {
	anIntArray1597 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	aRSString_1609
	    = Class134.method1914("Please wait )2 attempting to reestablish)3",
				  (byte) 42);
	aRSString_1608 = aRSString_1609;
    }
}
