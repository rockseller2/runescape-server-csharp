/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class71
{
    public int anInt1410;
    public int[] anIntArray1411;
    public int[] anIntArray1412;
    public int[] anIntArray1413;
    public int[] anIntArray1414;
    public static int[] anIntArray1415 = new int[6];
    public int[] anIntArray1416;
    public boolean aBoolean1417 = true;
    public static int[][] anIntArrayArray1418
	= { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 },
	    { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 },
	    { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 },
	    { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 },
	    { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 },
	    { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 },
	    { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 },
	    { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 },
	    { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4,
	      2, 3 },
	    { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4,
	      2, 3 },
	    { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1,
	      2, 5 } };
    public int[] anIntArray1419;
    public int[] anIntArray1420;
    public int anInt1421;
    public int anInt1422;
    public int anInt1423;
    public int[] anIntArray1424;
    public int[] anIntArray1425;
    public static int[] anIntArray1426 = new int[6];
    public static int[] anIntArray1427;
    public int[] anIntArray1428;
    public static int[][] anIntArrayArray1429
	= { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 },
	    { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 },
	    { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 },
	    { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 },
	    { 1, 3, 5, 7, 13, 14 } };
    public static int[] anIntArray1430;
    public static int[] anIntArray1431;
    
    public Class71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
		   int arg6, int arg7, int arg8, int arg9, int arg10,
		   int arg11, int arg12, int arg13, int arg14, int arg15,
		   int arg16, int arg17, int arg18) {
	if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8)
	    aBoolean1417 = false;
	anInt1422 = arg0;
	anInt1410 = arg1;
	anInt1421 = arg17;
	anInt1423 = arg18;
	int i = 128;
	int i_0_ = i / 2;
	int i_1_ = i / 4;
	int i_2_ = i * 3 / 4;
	int[] is = anIntArrayArray1429[arg0];
	int i_3_ = is.length;
	anIntArray1413 = new int[i_3_];
	anIntArray1412 = new int[i_3_];
	anIntArray1428 = new int[i_3_];
	int[] is_4_ = new int[i_3_];
	int[] is_5_ = new int[i_3_];
	int i_6_ = arg3 * i;
	int i_7_ = arg4 * i;
	for (int i_8_ = 0; i_8_ < i_3_; i_8_++) {
	    int i_9_ = is[i_8_];
	    if ((i_9_ & 0x1) == 0 && i_9_ <= 8)
		i_9_ = (i_9_ - arg1 - arg1 - 1 & 0x7) + 1;
	    if (i_9_ > 8 && i_9_ <= 12)
		i_9_ = (i_9_ - 9 - arg1 & 0x3) + 9;
	    if (i_9_ > 12 && i_9_ <= 16)
		i_9_ = (i_9_ - 13 - arg1 & 0x3) + 13;
	    int i_10_;
	    int i_11_;
	    int i_12_;
	    int i_13_;
	    int i_14_;
	    if (i_9_ == 1) {
		i_10_ = i_6_;
		i_11_ = i_7_;
		i_12_ = arg5;
		i_13_ = arg9;
		i_14_ = arg13;
	    } else if (i_9_ == 2) {
		i_10_ = i_6_ + i_0_;
		i_11_ = i_7_;
		i_12_ = arg5 + arg6 >> 1;
		i_13_ = arg9 + arg10 >> 1;
		i_14_ = arg13 + arg14 >> 1;
	    } else if (i_9_ == 3) {
		i_10_ = i_6_ + i;
		i_11_ = i_7_;
		i_12_ = arg6;
		i_13_ = arg10;
		i_14_ = arg14;
	    } else if (i_9_ == 4) {
		i_10_ = i_6_ + i;
		i_11_ = i_7_ + i_0_;
		i_12_ = arg6 + arg7 >> 1;
		i_13_ = arg10 + arg11 >> 1;
		i_14_ = arg14 + arg15 >> 1;
	    } else if (i_9_ == 5) {
		i_10_ = i_6_ + i;
		i_11_ = i_7_ + i;
		i_12_ = arg7;
		i_13_ = arg11;
		i_14_ = arg15;
	    } else if (i_9_ == 6) {
		i_10_ = i_6_ + i_0_;
		i_11_ = i_7_ + i;
		i_12_ = arg7 + arg8 >> 1;
		i_13_ = arg11 + arg12 >> 1;
		i_14_ = arg15 + arg16 >> 1;
	    } else if (i_9_ == 7) {
		i_10_ = i_6_;
		i_11_ = i_7_ + i;
		i_12_ = arg8;
		i_13_ = arg12;
		i_14_ = arg16;
	    } else if (i_9_ == 8) {
		i_10_ = i_6_;
		i_11_ = i_7_ + i_0_;
		i_12_ = arg8 + arg5 >> 1;
		i_13_ = arg12 + arg9 >> 1;
		i_14_ = arg16 + arg13 >> 1;
	    } else if (i_9_ == 9) {
		i_10_ = i_6_ + i_0_;
		i_11_ = i_7_ + i_1_;
		i_12_ = arg5 + arg6 >> 1;
		i_13_ = arg9 + arg10 >> 1;
		i_14_ = arg13 + arg14 >> 1;
	    } else if (i_9_ == 10) {
		i_10_ = i_6_ + i_2_;
		i_11_ = i_7_ + i_0_;
		i_12_ = arg6 + arg7 >> 1;
		i_13_ = arg10 + arg11 >> 1;
		i_14_ = arg14 + arg15 >> 1;
	    } else if (i_9_ == 11) {
		i_10_ = i_6_ + i_0_;
		i_11_ = i_7_ + i_2_;
		i_12_ = arg7 + arg8 >> 1;
		i_13_ = arg11 + arg12 >> 1;
		i_14_ = arg15 + arg16 >> 1;
	    } else if (i_9_ == 12) {
		i_10_ = i_6_ + i_1_;
		i_11_ = i_7_ + i_0_;
		i_12_ = arg8 + arg5 >> 1;
		i_13_ = arg12 + arg9 >> 1;
		i_14_ = arg16 + arg13 >> 1;
	    } else if (i_9_ == 13) {
		i_10_ = i_6_ + i_1_;
		i_11_ = i_7_ + i_1_;
		i_12_ = arg5;
		i_13_ = arg9;
		i_14_ = arg13;
	    } else if (i_9_ == 14) {
		i_10_ = i_6_ + i_2_;
		i_11_ = i_7_ + i_1_;
		i_12_ = arg6;
		i_13_ = arg10;
		i_14_ = arg14;
	    } else if (i_9_ == 15) {
		i_10_ = i_6_ + i_2_;
		i_11_ = i_7_ + i_2_;
		i_12_ = arg7;
		i_13_ = arg11;
		i_14_ = arg15;
	    } else {
		i_10_ = i_6_ + i_1_;
		i_11_ = i_7_ + i_2_;
		i_12_ = arg8;
		i_13_ = arg12;
		i_14_ = arg16;
	    }
	    anIntArray1413[i_8_] = i_10_;
	    anIntArray1412[i_8_] = i_12_;
	    anIntArray1428[i_8_] = i_11_;
	    is_4_[i_8_] = i_13_;
	    is_5_[i_8_] = i_14_;
	}
	int[] is_15_ = anIntArrayArray1418[arg0];
	int i_16_ = is_15_.length / 4;
	anIntArray1424 = new int[i_16_];
	anIntArray1411 = new int[i_16_];
	anIntArray1419 = new int[i_16_];
	anIntArray1414 = new int[i_16_];
	anIntArray1416 = new int[i_16_];
	anIntArray1425 = new int[i_16_];
	if (arg2 != -1)
	    anIntArray1420 = new int[i_16_];
	int i_17_ = 0;
	for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
	    int i_19_ = is_15_[i_17_];
	    int i_20_ = is_15_[i_17_ + 1];
	    int i_21_ = is_15_[i_17_ + 2];
	    int i_22_ = is_15_[i_17_ + 3];
	    i_17_ += 4;
	    if (i_20_ < 4)
		i_20_ = i_20_ - arg1 & 0x3;
	    if (i_21_ < 4)
		i_21_ = i_21_ - arg1 & 0x3;
	    if (i_22_ < 4)
		i_22_ = i_22_ - arg1 & 0x3;
	    anIntArray1424[i_18_] = i_20_;
	    anIntArray1411[i_18_] = i_21_;
	    anIntArray1419[i_18_] = i_22_;
	    if (i_19_ == 0) {
		anIntArray1414[i_18_] = is_4_[i_20_];
		anIntArray1416[i_18_] = is_4_[i_21_];
		anIntArray1425[i_18_] = is_4_[i_22_];
		if (anIntArray1420 != null)
		    anIntArray1420[i_18_] = -1;
	    } else {
		anIntArray1414[i_18_] = is_5_[i_20_];
		anIntArray1416[i_18_] = is_5_[i_21_];
		anIntArray1425[i_18_] = is_5_[i_22_];
		if (anIntArray1420 != null)
		    anIntArray1420[i_18_] = arg2;
	    }
	}
	int i_23_ = arg5;
	int i_24_ = arg6;
	if (arg6 < i_23_)
	    i_23_ = arg6;
	if (arg6 > i_24_)
	    i_24_ = arg6;
	if (arg7 < i_23_)
	    i_23_ = arg7;
	if (arg7 > i_24_)
	    i_24_ = arg7;
	if (arg8 < i_23_)
	    i_23_ = arg8;
	if (arg8 > i_24_)
	    i_24_ = arg8;
	i_23_ /= 14;
	i_24_ /= 14;
    }
    
    public static void method1343() {
	anIntArray1431 = null;
	anIntArray1415 = null;
	anIntArray1430 = null;
	anIntArray1426 = null;
	anIntArray1427 = null;
	anIntArrayArray1429 = null;
	anIntArrayArray1418 = null;
    }
    
    static {
	anIntArray1427 = new int[6];
	anIntArray1430 = new int[6];
	anIntArray1431 = new int[6];
    }
}
