/* Class67_Sub5_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub5 extends Class67_Sub5
{
    public static int anInt4514 = 0;
    public static Class136 aClass136_4515;
    public static int anInt4516;
    public static int anInt4517;
    public byte[] aByteArray4518;
    public static RSString aRSString_4519;
    public static RSString aRSString_4520;
    public static int anInt4521;
    public static long aLong4522;
    public static RSString aRSString_4523 = Class134.method1914("", (byte) 19);
    public static int anInt4524;
    public static int[] anIntArray4525;
    public static int anInt4526;
    public static int[] anIntArray4527;
    public static int[] anIntArray4528;
    public static int[] anIntArray4529;
    public static int[] anIntArray4530;
    public static int[] anIntArray4531;
    public static RSString[] aRSStringArray4532;
    public static int[] anIntArray4533;
    
    public static void method864(int arg0) {
	anInt4521++;
	if (arg0 < -44)
	    Class8.aClass136_343.method1922(0);
    }
    
    public static boolean method865(boolean arg0, int arg1, byte arg2,
				    int arg3, Class67_Sub24[][][] arg4,
				    int arg5) {
	anInt4516++;
	byte i = !arg0 ? (byte) (0xff & Class6.anInt151) : (byte) 1;
	if ((i ^ 0xffffffff) == ((ObjectDef.aByteArrayArrayArray3518
				  [Canvas_Sub1.anInt59][arg5][arg1])
				 ^ 0xffffffff))
	    return false;
	if ((0x4 & (Class120.aByteArrayArrayArray2284[Canvas_Sub1.anInt59]
		    [arg5][arg1])
	     ^ 0xffffffff)
	    == -1)
	    return false;
	if (arg2 != 79)
	    method865(false, -63, (byte) -104, -11, null, 83);
	int i_0_ = 0;
	int i_1_ = 0;
	Class90.anIntArray1849[i_0_] = arg5;
	Class126.anIntArray2345[i_0_++] = arg1;
	ObjectDef.aByteArrayArrayArray3518[Canvas_Sub1.anInt59][arg5][arg1]
	    = i;
	while (i_1_ != i_0_) {
	    int i_2_ = Class90.anIntArray1849[i_1_] & 0xffff;
	    int i_3_ = (0xff5289 & Class90.anIntArray1849[i_1_]) >> 1578130416;
	    int i_4_ = 0xff & Class90.anIntArray1849[i_1_] >> -1974513928;
	    int i_5_
		= (Class126.anIntArray2345[i_1_] & 0xff3613) >> 1068852560;
	    boolean bool = false;
	    boolean bool_6_ = false;
	    int i_7_ = Class126.anIntArray2345[i_1_] & 0xffff;
	    if (((Class120.aByteArrayArrayArray2284[Canvas_Sub1.anInt59][i_2_]
		  [i_7_])
		 & 0x4)
		== 0)
		bool_6_ = true;
	    i_1_ = i_1_ + 1 & 0xfff;
	while_43_:
	    for (int i_8_ = 1 + Canvas_Sub1.anInt59; i_8_ <= 3; i_8_++) {
		if ((0x8 & Class120.aByteArrayArrayArray2284[i_8_][i_2_][i_7_])
		    == 0) {
		    if (bool_6_ && arg4[i_8_][i_2_][i_7_] != null) {
			if (arg4[i_8_][i_2_][i_7_].aClass58_3221 != null) {
			    int i_9_ = Class131_Sub7.method1870(i_3_, -13520);
			    if (i_9_ == (arg4[i_8_][i_2_][i_7_].aClass58_3221
					 .anInt1123)
				|| ((arg4[i_8_][i_2_][i_7_].aClass58_3221
				     .anInt1122)
				    ^ 0xffffffff) == (i_9_ ^ 0xffffffff))
				continue;
			    if (i_4_ != 0) {
				int i_10_
				    = Class131_Sub7.method1870(i_4_, -13520);
				if ((arg4[i_8_][i_2_][i_7_].aClass58_3221
				     .anInt1123) == i_10_
				    || i_10_ == (arg4[i_8_][i_2_][i_7_]
						 .aClass58_3221.anInt1122))
				    continue;
			    }
			    if (i_5_ != 0) {
				int i_11_
				    = Class131_Sub7.method1870(i_5_, -13520);
				if (i_11_ == (arg4[i_8_][i_2_][i_7_]
					      .aClass58_3221.anInt1123)
				    || i_11_ == (arg4[i_8_][i_2_][i_7_]
						 .aClass58_3221.anInt1122))
				    continue;
			    }
			}
			if (arg4[i_8_][i_2_][i_7_].aClass36Array3229 != null) {
			    for (int i_12_ = 0;
				 i_12_ < arg4[i_8_][i_2_][i_7_].anInt3215;
				 i_12_++) {
				int i_13_ = (int) ((arg4[i_8_][i_2_][i_7_]
						    .aClass36Array3229[i_12_]
						    .aLong785) >> 2143831182
						   & 0x3fL);
				if (i_13_ == 21)
				    i_13_ = 19;
				int i_14_ = (int) ((arg4[i_8_][i_2_][i_7_]
						    .aClass36Array3229[i_12_]
						    .aLong785) >> 1875059732
						   & 0x3L);
				int i_15_ = i_13_ | i_14_ << -1124001306;
				if (i_15_ == i_3_
				    || ((i_4_ ^ 0xffffffff) != -1
					&& i_15_ == i_4_)
				    || ((i_5_ ^ 0xffffffff) != -1
					&& i_5_ == i_15_))
				    continue while_43_;
			    }
			}
		    }
		    bool = true;
		    Class67_Sub24 class67_sub24 = arg4[i_8_][i_2_][i_7_];
		    if (class67_sub24 != null && class67_sub24.anInt3215 > 0) {
			for (int i_16_ = 0; i_16_ < class67_sub24.anInt3215;
			     i_16_++) {
			    Class36 class36
				= class67_sub24.aClass36Array3229[i_16_];
			    if (((class36.anInt778 ^ 0xffffffff)
				 != (class36.anInt765 ^ 0xffffffff))
				|| ((class36.anInt777 ^ 0xffffffff)
				    != (class36.anInt789 ^ 0xffffffff))) {
				for (int i_17_ = class36.anInt765;
				     ((i_17_ ^ 0xffffffff)
				      >= (class36.anInt778 ^ 0xffffffff));
				     i_17_++) {
				    for (int i_18_ = class36.anInt777;
					 i_18_ <= class36.anInt789; i_18_++)
					ObjectDef
					    .aByteArrayArrayArray3518[i_8_]
					    [i_17_][i_18_]
					    = i;
				}
			    }
			}
		    }
		    ObjectDef.aByteArrayArrayArray3518[i_8_][i_2_][i_7_]
			= i;
		}
	    }
	    if (bool) {
		if (Class67_Sub1_Sub23.anIntArray4180[arg3]
		    < (Class136.anIntArrayArrayArray2496
		       [1 + Canvas_Sub1.anInt59][i_2_][i_7_]))
		    Class67_Sub1_Sub23.anIntArray4180[arg3]
			= (Class136.anIntArrayArrayArray2496
			   [1 + Canvas_Sub1.anInt59][i_2_][i_7_]);
		int i_19_ = i_7_ << 127468135;
		int i_20_ = i_2_ << 2006244167;
		if ((Class67_Sub5_Sub19.anIntArray4823[arg3] ^ 0xffffffff)
		    < (i_20_ ^ 0xffffffff))
		    Class67_Sub5_Sub19.anIntArray4823[arg3] = i_20_;
		else if ((Class67_Sub5_Sub6.anIntArray4545[arg3] ^ 0xffffffff)
			 > (i_20_ ^ 0xffffffff))
		    Class67_Sub5_Sub6.anIntArray4545[arg3] = i_20_;
		if (OutputStream_Sub1.anIntArray93[arg3] <= i_19_) {
		    if ((Class67_Sub5_Sub3.anIntArray4490[arg3] ^ 0xffffffff)
			> (i_19_ ^ 0xffffffff))
			Class67_Sub5_Sub3.anIntArray4490[arg3] = i_19_;
		} else
		    OutputStream_Sub1.anIntArray93[arg3] = i_19_;
	    }
	    if (!bool_6_) {
		if (i_2_ >= 1
		    && (ObjectDef.aByteArrayArrayArray3518
			[Canvas_Sub1.anInt59][i_2_ - 1][i_7_]) != i) {
		    Class90.anIntArray1849[i_0_]
			= (Class67_Sub20.method1273
			   (-754974720,
			    Class67_Sub20.method1273(i_2_ - 1, 1179648)));
		    Class126.anIntArray2345[i_0_]
			= Class67_Sub20.method1273(1245184, i_7_);
		    i_0_ = 0xfff & 1 + i_0_;
		    ObjectDef.aByteArrayArrayArray3518
			[Canvas_Sub1.anInt59][i_2_ + -1][i_7_]
			= i;
		}
		if (++i_7_ < 104) {
		    if ((i_2_ + -1 ^ 0xffffffff) <= -1
			&& i != (ObjectDef.aByteArrayArrayArray3518
				 [Canvas_Sub1.anInt59][-1 + i_2_][i_7_])
			&& ((Class120.aByteArrayArrayArray2284
			     [Canvas_Sub1.anInt59][i_2_][i_7_])
			    & 0x4) == 0
			&& (0x4 & (Class120.aByteArrayArrayArray2284
				   [Canvas_Sub1.anInt59][i_2_ + -1]
				   [-1 + i_7_])) == 0) {
			Class90.anIntArray1849[i_0_]
			    = (Class67_Sub20.method1273
			       (1375731712,
				Class67_Sub20.method1273(1179648, i_2_ - 1)));
			Class126.anIntArray2345[i_0_]
			    = Class67_Sub20.method1273(i_7_, 1245184);
			i_0_ = i_0_ - -1 & 0xfff;
			ObjectDef.aByteArrayArrayArray3518
			    [Canvas_Sub1.anInt59][i_2_ + -1][i_7_]
			    = i;
		    }
		    if (((ObjectDef.aByteArrayArrayArray3518
			  [Canvas_Sub1.anInt59][i_2_][i_7_])
			 ^ 0xffffffff)
			!= (i ^ 0xffffffff)) {
			Class90.anIntArray1849[i_0_]
			    = (Class67_Sub20.method1273
			       (Class67_Sub20.method1273(i_2_, 5373952),
				318767104));
			Class126.anIntArray2345[i_0_]
			    = Class67_Sub20.method1273(i_7_, 5439488);
			ObjectDef.aByteArrayArrayArray3518
			    [Canvas_Sub1.anInt59][i_2_][i_7_]
			    = i;
			i_0_ = 1 + i_0_ & 0xfff;
		    }
		    if (i_2_ - -1 < 104
			&& i != (ObjectDef.aByteArrayArrayArray3518
				 [Canvas_Sub1.anInt59][1 + i_2_][i_7_])
			&& ((Class120.aByteArrayArrayArray2284
			     [Canvas_Sub1.anInt59][i_2_][i_7_])
			    & 0x4) == 0
			&& (0x4 & (Class120.aByteArrayArrayArray2284
				   [Canvas_Sub1.anInt59][i_2_ - -1][i_7_ + -1])
			    ^ 0xffffffff) == -1) {
			Class90.anIntArray1849[i_0_]
			    = (Class67_Sub20.method1273
			       (-1845493760,
				Class67_Sub20.method1273(5373952, 1 + i_2_)));
			Class126.anIntArray2345[i_0_]
			    = Class67_Sub20.method1273(i_7_, 5439488);
			ObjectDef.aByteArrayArrayArray3518
			    [Canvas_Sub1.anInt59][i_2_ - -1][i_7_]
			    = i;
			i_0_ = 0xfff & i_0_ - -1;
		    }
		}
		i_7_--;
		if ((i_2_ - -1 ^ 0xffffffff) > -105
		    && ((ObjectDef.aByteArrayArrayArray3518
			 [Canvas_Sub1.anInt59][1 + i_2_][i_7_])
			^ 0xffffffff) != (i ^ 0xffffffff)) {
		    Class90.anIntArray1849[i_0_]
			= (Class67_Sub20.method1273
			   (Class67_Sub20.method1273(9568256, i_2_ + 1),
			    1392508928));
		    Class126.anIntArray2345[i_0_]
			= Class67_Sub20.method1273(i_7_, 9633792);
		    i_0_ = 0xfff & 1 + i_0_;
		    ObjectDef.aByteArrayArrayArray3518
			[Canvas_Sub1.anInt59][i_2_ + 1][i_7_]
			= i;
		}
		if ((--i_7_ ^ 0xffffffff) <= -1) {
		    if ((i_2_ - 1 ^ 0xffffffff) <= -1
			&& ((i ^ 0xffffffff)
			    != ((ObjectDef.aByteArrayArrayArray3518
				 [Canvas_Sub1.anInt59][-1 + i_2_][i_7_])
				^ 0xffffffff))
			&& ((Class120.aByteArrayArrayArray2284
			     [Canvas_Sub1.anInt59][i_2_][i_7_]) & 0x4
			    ^ 0xffffffff) == -1
			&& ((Class120.aByteArrayArrayArray2284
			     [Canvas_Sub1.anInt59][-1 + i_2_][i_7_ + 1])
			    & 0x4) == 0) {
			Class90.anIntArray1849[i_0_]
			    = (Class67_Sub20.method1273
			       (Class67_Sub20.method1273(i_2_ + -1, 13762560),
				301989888));
			Class126.anIntArray2345[i_0_]
			    = Class67_Sub20.method1273(13828096, i_7_);
			ObjectDef.aByteArrayArrayArray3518
			    [Canvas_Sub1.anInt59][-1 + i_2_][i_7_]
			    = i;
			i_0_ = i_0_ - -1 & 0xfff;
		    }
		    if (((ObjectDef.aByteArrayArrayArray3518
			  [Canvas_Sub1.anInt59][i_2_][i_7_])
			 ^ 0xffffffff)
			!= (i ^ 0xffffffff)) {
			Class90.anIntArray1849[i_0_]
			    = (Class67_Sub20.method1273
			       (-1828716544,
				Class67_Sub20.method1273(13762560, i_2_)));
			Class126.anIntArray2345[i_0_]
			    = Class67_Sub20.method1273(13828096, i_7_);
			ObjectDef.aByteArrayArrayArray3518
			    [Canvas_Sub1.anInt59][i_2_][i_7_]
			    = i;
			i_0_ = 1 + i_0_ & 0xfff;
		    }
		    if (1 + i_2_ < 104
			&& ((i ^ 0xffffffff)
			    != ((ObjectDef.aByteArrayArrayArray3518
				 [Canvas_Sub1.anInt59][1 + i_2_][i_7_])
				^ 0xffffffff))
			&& ((Class120.aByteArrayArrayArray2284
			     [Canvas_Sub1.anInt59][i_2_][i_7_]) & 0x4
			    ^ 0xffffffff) == -1
			&& ((Class120.aByteArrayArrayArray2284
			     [Canvas_Sub1.anInt59][i_2_ + 1][i_7_ + 1]) & 0x4
			    ^ 0xffffffff) == -1) {
			Class90.anIntArray1849[i_0_]
			    = (Class67_Sub20.method1273
			       (Class67_Sub20.method1273(i_2_ - -1, 9568256),
				-771751936));
			Class126.anIntArray2345[i_0_]
			    = Class67_Sub20.method1273(i_7_, 9633792);
			ObjectDef.aByteArrayArrayArray3518
			    [Canvas_Sub1.anInt59][1 + i_2_][i_7_]
			    = i;
			i_0_ = 0xfff & 1 + i_0_;
		    }
		}
	    }
	}
	if ((Class67_Sub1_Sub23.anIntArray4180[arg3] ^ 0xffffffff) != 999999) {
	    Class67_Sub1_Sub23.anIntArray4180[arg3] += 10;
	    Class67_Sub5_Sub19.anIntArray4823[arg3] -= 50;
	    Class67_Sub5_Sub6.anIntArray4545[arg3] += 50;
	    Class67_Sub5_Sub3.anIntArray4490[arg3] += 50;
	    OutputStream_Sub1.anIntArray93[arg3] -= 50;
	}
	return true;
    }
    
    public Class67_Sub5_Sub5(byte[] arg0) {
	aByteArray4518 = arg0;
    }
    
    public static void method866(boolean arg0) {
	anIntArray4533 = null;
	aRSString_4523 = null;
	anIntArray4531 = null;
	if (arg0 != false)
	    anIntArray4533 = null;
	anIntArray4529 = null;
	anIntArray4528 = null;
	aClass136_4515 = null;
	aRSStringArray4532 = null;
	aRSString_4520 = null;
	anIntArray4530 = null;
	anIntArray4527 = null;
	anIntArray4525 = null;
	aRSString_4519 = null;
    }
    
    static {
	aLong4522 = 0L;
	aRSString_4520 = aRSString_4523;
	aRSString_4519 = aRSString_4523;
	anInt4517 = 10;
	aClass136_4515 = new Class136(64);
	anInt4526 = 50;
	anIntArray4529 = new int[anInt4526];
	anIntArray4528 = new int[anInt4526];
	anIntArray4527 = new int[anInt4526];
	anIntArray4531 = new int[anInt4526];
	anIntArray4525 = new int[anInt4526];
	aRSStringArray4532 = new RSString[anInt4526];
	anIntArray4533 = new int[anInt4526];
	anIntArray4530 = new int[anInt4526];
    }
}
