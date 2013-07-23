/* Class67_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub27 extends Class67
{
    public Class130[] aClass130Array3294;
    public static int anInt3295;
    public static RSString aRSString_3296
	= Class134.method1914("(U(Y", (byte) 55);
    public byte[] aByteArray3297;
    public static RSString aRSString_3298;
    public static int anInt3299 = 0;
    public int[] anIntArray3300;
    public static int anInt3301;
    public static int anInt3302;
    public static int anInt3303 = -1;
    public byte[] aByteArray3304;
    public static int[] anIntArray3305 = new int[1000];
    public static int anInt3306;
    public Class67_Sub13_Sub1[] aClass67_Sub13_Sub1Array3307;
    public byte[] aByteArray3308;
    public static RSString aRSString_3309;
    public int anInt3310;
    public static RSString aRSString_3311;
    public short[] aShortArray3312;
    public static int anInt3313;
    public static RSString aRSString_3314;
    
    public boolean method1301(Class83 arg0, int[] arg1, byte arg2,
			      byte[] arg3) {
	try {
	    int i = 8 / ((arg2 - -62) / 38);
	    anInt3313++;
	    boolean bool = true;
	    int i_0_ = 0;
	    Class67_Sub13_Sub1 class67_sub13_sub1 = null;
	    for (int i_1_ = 0; i_1_ < 128; i_1_++) {
		if (arg3 == null || arg3[i_1_] != 0) {
		    int i_2_ = anIntArray3300[i_1_];
		    if (i_2_ != 0) {
			if ((i_2_ ^ 0xffffffff) != (i_0_ ^ 0xffffffff)) {
			    i_0_ = i_2_;
			    i_2_--;
			    if ((0x1 & i_2_) == 0)
				class67_sub13_sub1
				    = arg0.method1435(i_2_ >> 497181250, arg1,
						      1);
			    else
				class67_sub13_sub1
				    = arg0.method1443(i_2_ >> 2141521922, 93,
						      arg1);
			    if (class67_sub13_sub1 == null)
				bool = false;
			}
			if (class67_sub13_sub1 != null) {
			    aClass67_Sub13_Sub1Array3307[i_1_]
				= class67_sub13_sub1;
			    anIntArray3300[i_1_] = 0;
			}
		    }
		}
	    }
	    return bool;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("tg.C(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public void method1302(int arg0) {
	anInt3306++;
	anIntArray3300 = null;
	if (arg0 != -1)
	    aByteArray3308 = null;
    }
    
    public static void method1303(boolean arg0) {
	if (arg0 != false)
	    aRSString_3298 = null;
	anIntArray3305 = null;
	aRSString_3296 = null;
	aRSString_3309 = null;
	aRSString_3298 = null;
	aRSString_3311 = null;
	aRSString_3314 = null;
    }
    
    public Class67_Sub27() {
	/* empty */
    }
    
    public Class67_Sub27(byte[] arg0) {
	aByteArray3308 = new byte[128];
	aShortArray3312 = new short[128];
	aClass67_Sub13_Sub1Array3307 = new Class67_Sub13_Sub1[128];
	aClass130Array3294 = new Class130[128];
	int i = 0;
	anIntArray3300 = new int[128];
	aByteArray3297 = new byte[128];
	aByteArray3304 = new byte[128];
	Stream Stream;
	for (Stream = new Stream(arg0);
	     Stream.buffer[i + Stream.currentOffset] != 0;
	     i++) {
	    /* empty */
	}
	byte[] is = new byte[i];
	for (int i_3_ = 0; i_3_ < i; i_3_++)
	    is[i_3_] = Stream.readByte2((byte) 1);
	Stream.currentOffset++;
	int i_4_ = Stream.currentOffset;
	i++;
	int i_5_ = 0;
	for (Stream.currentOffset += i;
	     Stream.buffer[Stream.currentOffset + i_5_] != 0;
	     i_5_++) {
	    /* empty */
	}
	byte[] is_6_ = new byte[i_5_];
	for (int i_7_ = 0; i_5_ > i_7_; i_7_++)
	    is_6_[i_7_] = Stream.readByte2((byte) 1);
	Stream.currentOffset++;
	int i_8_ = Stream.currentOffset;
	i_5_++;
	Stream.currentOffset += i_5_;
	int i_9_;
	for (i_9_ = 0;
	     ((Stream.buffer[i_9_ + Stream.currentOffset]
	       ^ 0xffffffff)
	      != -1);
	     i_9_++) {
	    /* empty */
	}
	byte[] is_10_ = new byte[i_9_];
	for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff);
	     i_11_++)
	    is_10_[i_11_] = Stream.readByte2((byte) 1);
	i_9_++;
	Stream.currentOffset++;
	byte[] is_12_ = new byte[i_9_];
	int i_13_;
	if (i_9_ <= 1)
	    i_13_ = i_9_;
	else {
	    i_13_ = 2;
	    is_12_[1] = (byte) 1;
	    int i_14_ = 1;
	    for (int i_15_ = 2; i_15_ < i_9_; i_15_++) {
		int i_16_ = Stream.readByte((byte) 110);
		if (i_16_ == 0)
		    i_14_ = i_13_++;
		else {
		    if (i_16_ <= i_14_)
			i_16_--;
		    i_14_ = i_16_;
		}
		is_12_[i_15_] = (byte) i_14_;
	    }
	}
	Class130[] class130s = new Class130[i_13_];
	for (int i_17_ = 0; i_17_ < class130s.length; i_17_++) {
	    Class130 class130 = class130s[i_17_] = new Class130();
	    int i_18_ = Stream.readByte((byte) 111);
	    if (i_18_ > 0)
		class130.aByteArray2410 = new byte[i_18_ * 2];
	    i_18_ = Stream.readByte((byte) -115);
	    if ((i_18_ ^ 0xffffffff) < -1) {
		class130.aByteArray2423 = new byte[2 * i_18_ + 2];
		class130.aByteArray2423[1] = (byte) 64;
	    }
	}
	int i_19_ = Stream.readByte((byte) -14);
	byte[] is_20_
	    = (i_19_ ^ 0xffffffff) >= -1 ? null : new byte[i_19_ * 2];
	i_19_ = Stream.readByte((byte) -42);
	int i_21_;
	for (i_21_ = 0;
	     ((Stream.buffer[i_21_ + Stream.currentOffset]
	       ^ 0xffffffff)
	      != -1);
	     i_21_++) {
	    /* empty */
	}
	byte[] is_22_
	    = (i_19_ ^ 0xffffffff) >= -1 ? null : new byte[i_19_ * 2];
	byte[] is_23_ = new byte[i_21_];
	for (int i_24_ = 0; i_21_ > i_24_; i_24_++)
	    is_23_[i_24_] = Stream.readByte2((byte) 1);
	Stream.currentOffset++;
	i_21_++;
	int i_25_ = 0;
	for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > -129; i_26_++) {
	    i_25_ += Stream.readByte((byte) -117);
	    aShortArray3312[i_26_] = (short) i_25_;
	}
	i_25_ = 0;
	for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > -129; i_27_++) {
	    i_25_ += Stream.readByte((byte) -9);
	    aShortArray3312[i_27_] += i_25_ << 477104424;
	}
	int i_28_ = 0;
	int i_29_ = 0;
	int i_30_ = 0;
	for (int i_31_ = 0; i_31_ < 128; i_31_++) {
	    if (i_28_ == 0) {
		if ((is_23_.length ^ 0xffffffff) >= (i_30_ ^ 0xffffffff))
		    i_28_ = -1;
		else
		    i_28_ = is_23_[i_30_++];
		i_29_ = Stream.method1061((byte) -29);
	    }
	    aShortArray3312[i_31_]
		+= Class75.method1379(2, -1 + i_29_) << 873198798;
	    i_28_--;
	    anIntArray3300[i_31_] = i_29_;
	}
	i_28_ = 0;
	int i_32_ = 0;
	i_30_ = 0;
	for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > -129; i_33_++) {
	    if ((anIntArray3300[i_33_] ^ 0xffffffff) != -1) {
		if ((i_28_ ^ 0xffffffff) == -1) {
		    if (i_30_ >= is.length)
			i_28_ = -1;
		    else
			i_28_ = is[i_30_++];
		    i_32_ = Stream.buffer[i_4_++] - 1;
		}
		aByteArray3304[i_33_] = (byte) i_32_;
		i_28_--;
	    }
	}
	i_28_ = 0;
	int i_34_ = 0;
	i_30_ = 0;
	for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > -129; i_35_++) {
	    if ((anIntArray3300[i_35_] ^ 0xffffffff) != -1) {
		if (i_28_ == 0) {
		    i_34_ = (16 + Stream.buffer[i_8_++]
			     << -1300981214);
		    if ((is_6_.length ^ 0xffffffff) < (i_30_ ^ 0xffffffff))
			i_28_ = is_6_[i_30_++];
		    else
			i_28_ = -1;
		}
		i_28_--;
		aByteArray3308[i_35_] = (byte) i_34_;
	    }
	}
	Class130 class130 = null;
	i_28_ = 0;
	i_30_ = 0;
	for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > -129; i_36_++) {
	    if (anIntArray3300[i_36_] != 0) {
		if (i_28_ == 0) {
		    class130 = class130s[is_12_[i_30_]];
		    if (i_30_ >= is_10_.length)
			i_28_ = -1;
		    else
			i_28_ = is_10_[i_30_++];
		}
		i_28_--;
		aClass130Array3294[i_36_] = class130;
	    }
	}
	i_28_ = 0;
	int i_37_ = 0;
	i_30_ = 0;
	for (int i_38_ = 0; i_38_ < 128; i_38_++) {
	    if ((i_28_ ^ 0xffffffff) == -1) {
		if ((i_30_ ^ 0xffffffff) > (is_23_.length ^ 0xffffffff))
		    i_28_ = is_23_[i_30_++];
		else
		    i_28_ = -1;
		if (anIntArray3300[i_38_] > 0)
		    i_37_ = 1 + Stream.readByte((byte) -96);
	    }
	    i_28_--;
	    aByteArray3297[i_38_] = (byte) i_37_;
	}
	anInt3310 = 1 + Stream.readByte((byte) -67);
	for (int i_39_ = 0; (i_13_ ^ 0xffffffff) < (i_39_ ^ 0xffffffff);
	     i_39_++) {
	    Class130 class130_40_ = class130s[i_39_];
	    if (class130_40_.aByteArray2410 != null) {
		for (int i_41_ = 1; class130_40_.aByteArray2410.length > i_41_;
		     i_41_ += 2)
		    class130_40_.aByteArray2410[i_41_]
			= Stream.readByte2((byte) 1);
	    }
	    if (class130_40_.aByteArray2423 != null) {
		for (int i_42_ = 3;
		     i_42_ < class130_40_.aByteArray2423.length - 2;
		     i_42_ += 2)
		    class130_40_.aByteArray2423[i_42_]
			= Stream.readByte2((byte) 1);
	    }
	}
	if (is_20_ != null) {
	    for (int i_43_ = 1; is_20_.length > i_43_; i_43_ += 2)
		is_20_[i_43_] = Stream.readByte2((byte) 1);
	}
	if (is_22_ != null) {
	    for (int i_44_ = 1;
		 (i_44_ ^ 0xffffffff) > (is_22_.length ^ 0xffffffff);
		 i_44_ += 2)
		is_22_[i_44_] = Stream.readByte2((byte) 1);
	}
	for (int i_45_ = 0; i_45_ < i_13_; i_45_++) {
	    Class130 class130_46_ = class130s[i_45_];
	    if (class130_46_.aByteArray2423 != null) {
		i_25_ = 0;
		for (int i_47_ = 2;
		     ((class130_46_.aByteArray2423.length ^ 0xffffffff)
		      < (i_47_ ^ 0xffffffff));
		     i_47_ += 2) {
		    i_25_ = 1 + i_25_ + Stream.readByte((byte) -73);
		    class130_46_.aByteArray2423[i_47_] = (byte) i_25_;
		}
	    }
	}
	for (int i_48_ = 0; i_13_ > i_48_; i_48_++) {
	    Class130 class130_49_ = class130s[i_48_];
	    if (class130_49_.aByteArray2410 != null) {
		i_25_ = 0;
		for (int i_50_ = 2;
		     ((i_50_ ^ 0xffffffff)
		      > (class130_49_.aByteArray2410.length ^ 0xffffffff));
		     i_50_ += 2) {
		    i_25_ = Stream.readByte((byte) 117) + (i_25_ + 1);
		    class130_49_.aByteArray2410[i_50_] = (byte) i_25_;
		}
	    }
	}
	if (is_20_ != null) {
	    i_25_ = Stream.readByte((byte) 126);
	    is_20_[0] = (byte) i_25_;
	    for (int i_51_ = 2; i_51_ < is_20_.length; i_51_ += 2) {
		i_25_ = 1 + (i_25_ + Stream.readByte((byte) -21));
		is_20_[i_51_] = (byte) i_25_;
	    }
	    int i_52_ = is_20_[1];
	    int i_53_ = is_20_[0];
	    for (int i_54_ = 0; (i_53_ ^ 0xffffffff) < (i_54_ ^ 0xffffffff);
		 i_54_++)
		aByteArray3297[i_54_]
		    = (byte) (aByteArray3297[i_54_] * i_52_ - -32
			      >> -925368474);
	    int i_55_ = 2;
	    while ((i_55_ ^ 0xffffffff) > (is_20_.length ^ 0xffffffff)) {
		int i_56_ = is_20_[i_55_];
		int i_57_ = (i_56_ - i_53_) / 2 + i_52_ * (i_56_ - i_53_);
		int i_58_ = is_20_[1 + i_55_];
		for (int i_59_ = i_53_;
		     (i_56_ ^ 0xffffffff) < (i_59_ ^ 0xffffffff); i_59_++) {
		    int i_60_
			= Class43.method379((byte) -97, i_57_, i_56_ - i_53_);
		    aByteArray3297[i_59_]
			= (byte) (aByteArray3297[i_59_] * i_60_ + 32
				  >> -153596570);
		    i_57_ += -i_52_ + i_58_;
		}
		i_55_ += 2;
		i_53_ = i_56_;
		i_52_ = i_58_;
	    }
	    for (int i_61_ = i_53_; i_61_ < 128; i_61_++)
		aByteArray3297[i_61_]
		    = (byte) (i_52_ * aByteArray3297[i_61_] + 32
			      >> -484689754);
	    Object object = null;
	}
	if (is_22_ != null) {
	    i_25_ = Stream.readByte((byte) 122);
	    is_22_[0] = (byte) i_25_;
	    for (int i_62_ = 2; is_22_.length > i_62_; i_62_ += 2) {
		i_25_ += 1 + Stream.readByte((byte) -60);
		is_22_[i_62_] = (byte) i_25_;
	    }
	    int i_63_ = is_22_[0];
	    int i_64_ = is_22_[1] << 149303265;
	    for (int i_65_ = 0; (i_63_ ^ 0xffffffff) < (i_65_ ^ 0xffffffff);
		 i_65_++) {
		int i_66_ = i_64_ + (0xff & aByteArray3308[i_65_]);
		if (i_66_ < 0)
		    i_66_ = 0;
		if ((i_66_ ^ 0xffffffff) < -129)
		    i_66_ = 128;
		aByteArray3308[i_65_] = (byte) i_66_;
	    }
	    int i_67_ = 2;
	    while ((is_22_.length ^ 0xffffffff) < (i_67_ ^ 0xffffffff)) {
		int i_68_ = is_22_[i_67_];
		int i_69_ = is_22_[i_67_ - -1] << -2014404031;
		int i_70_ = (i_68_ - i_63_) / 2 + (i_68_ - i_63_) * i_64_;
		for (int i_71_ = i_63_;
		     (i_68_ ^ 0xffffffff) < (i_71_ ^ 0xffffffff); i_71_++) {
		    int i_72_
			= Class43.method379((byte) -97, i_70_, i_68_ - i_63_);
		    int i_73_ = i_72_ + (aByteArray3308[i_71_] & 0xff);
		    i_70_ += i_69_ + -i_64_;
		    if (i_73_ < 0)
			i_73_ = 0;
		    if (i_73_ > 128)
			i_73_ = 128;
		    aByteArray3308[i_71_] = (byte) i_73_;
		}
		i_67_ += 2;
		i_64_ = i_69_;
		i_63_ = i_68_;
	    }
	    Object object = null;
	    for (int i_74_ = i_63_; i_74_ < 128; i_74_++) {
		int i_75_ = (0xff & aByteArray3308[i_74_]) + i_64_;
		if (i_75_ < 0)
		    i_75_ = 0;
		if ((i_75_ ^ 0xffffffff) < -129)
		    i_75_ = 128;
		aByteArray3308[i_74_] = (byte) i_75_;
	    }
	}
	for (int i_76_ = 0; (i_13_ ^ 0xffffffff) < (i_76_ ^ 0xffffffff);
	     i_76_++)
	    class130s[i_76_].anInt2407 = Stream.readByte((byte) -85);
	for (int i_77_ = 0; i_13_ > i_77_; i_77_++) {
	    Class130 class130_78_ = class130s[i_77_];
	    if (class130_78_.aByteArray2410 != null)
		class130_78_.anInt2403 = Stream.readByte((byte) 111);
	    if (class130_78_.aByteArray2423 != null)
		class130_78_.anInt2417 = Stream.readByte((byte) -70);
	    if (class130_78_.anInt2407 > 0)
		class130_78_.anInt2413 = Stream.readByte((byte) -64);
	}
	for (int i_79_ = 0; i_79_ < i_13_; i_79_++)
	    class130s[i_79_].anInt2405 = Stream.readByte((byte) 98);
	for (int i_80_ = 0; (i_13_ ^ 0xffffffff) < (i_80_ ^ 0xffffffff);
	     i_80_++) {
	    Class130 class130_81_ = class130s[i_80_];
	    if ((class130_81_.anInt2405 ^ 0xffffffff) < -1)
		class130_81_.anInt2406 = Stream.readByte((byte) -55);
	}
	for (int i_82_ = 0; (i_13_ ^ 0xffffffff) < (i_82_ ^ 0xffffffff);
	     i_82_++) {
	    Class130 class130_83_ = class130s[i_82_];
	    if (class130_83_.anInt2406 > 0)
		class130_83_.anInt2411 = Stream.readByte((byte) 112);
	}
    }
    
    public static boolean method1304(int arg0, int arg1, boolean arg2,
				     int arg3, int arg4, int arg5, int arg6,
				     int arg7, int arg8, int arg9, int arg10,
				     int arg11, byte arg12) {
	anInt3302++;
	for (int i = 0; i < 104; i++) {
	    for (int i_84_ = 0; i_84_ < 104; i_84_++) {
		Class67_Sub5_Sub12.anIntArrayArray4694[i][i_84_] = 0;
		Class67_Sub22.anIntArrayArray3183[i][i_84_] = 99999999;
	    }
	}
	Class67_Sub5_Sub12.anIntArrayArray4694[arg1][arg7] = 99;
	Class67_Sub22.anIntArrayArray3183[arg1][arg7] = 0;
	int i = -27 / ((82 - arg12) / 37);
	int i_85_ = arg1;
	int i_86_ = arg7;
	int i_87_ = 0;
	Class90.anIntArray1849[i_87_] = arg1;
	Class126.anIntArray2345[i_87_++] = arg7;
	int i_88_ = 0;
	int[][] is = (Class53.aClass73Array1059[Canvas_Sub1.anInt59]
		      .anIntArrayArray1453);
	boolean bool = false;
    while_16_:
	while ((i_87_ ^ 0xffffffff) != (i_88_ ^ 0xffffffff)) {
	    i_86_ = Class126.anIntArray2345[i_88_];
	    i_85_ = Class90.anIntArray1849[i_88_];
	    i_88_ = 1 + i_88_ & 0xfff;
	    if ((i_85_ ^ 0xffffffff) == (arg10 ^ 0xffffffff)
		&& (arg0 ^ 0xffffffff) == (i_86_ ^ 0xffffffff)) {
		bool = true;
		break;
	    }
	    if (arg3 != 0) {
		if ((arg3 ^ 0xffffffff) <= -6 && arg3 != 10
		    || !(Class53.aClass73Array1059[Canvas_Sub1.anInt59]
			     .method1361
			 (arg3 + -1, i_85_, arg5, arg10, -125, i_86_, arg0,
			  arg11))) {
		    if (arg3 < 10 && (Class53.aClass73Array1059
					  [Canvas_Sub1.anInt59].method1368
				      (arg10, arg5, -1 + arg3, (byte) 80, arg0,
				       arg11, i_85_, i_86_))) {
			bool = true;
			break;
		    }
		} else {
		    bool = true;
		    break;
		}
	    }
	    if (arg9 != 0 && arg4 != 0
		&& (Class53.aClass73Array1059[Canvas_Sub1.anInt59].method1370
		    (i_85_, arg10, arg0, arg4, arg6, arg9, 25417, arg5,
		     i_86_))) {
		bool = true;
		break;
	    }
	    int i_89_ = Class67_Sub22.anIntArrayArray3183[i_85_][i_86_] - -1;
	while_9_:
	    do {
		if ((i_85_ ^ 0xffffffff) < -1
		    && (Class67_Sub5_Sub12.anIntArrayArray4694[i_85_ - 1]
			[i_86_]) == 0
		    && (is[-1 + i_85_][i_86_] & 0x12c010e ^ 0xffffffff) == -1
		    && (is[i_85_ + -1][arg5 + i_86_ - 1] & 0x12c0138) == 0) {
		    for (int i_90_ = 1; i_90_ < -1 + arg5; i_90_++) {
			if ((is[i_85_ - 1][i_86_ - -i_90_] & 0x12c013e
			     ^ 0xffffffff)
			    != -1)
			    break while_9_;
		    }
		    Class90.anIntArray1849[i_87_] = i_85_ - 1;
		    Class126.anIntArray2345[i_87_] = i_86_;
		    i_87_ = 0xfff & 1 + i_87_;
		    Class67_Sub5_Sub12.anIntArrayArray4694[i_85_ - 1][i_86_]
			= 2;
		    Class67_Sub22.anIntArrayArray3183[-1 + i_85_][i_86_]
			= i_89_;
		}
	    } while (false);
	while_10_:
	    do {
		if (i_85_ < 102
		    && ((Class67_Sub5_Sub12.anIntArrayArray4694[i_85_ - -1]
			 [i_86_])
			^ 0xffffffff) == -1
		    && (is[arg5 + i_85_][i_86_] & 0x12c0183 ^ 0xffffffff) == -1
		    && ((is[i_85_ - -arg5][-1 + i_86_ - -arg5] & 0x12c01e0)
			== 0)) {
		    for (int i_91_ = 1;
			 (-1 + arg5 ^ 0xffffffff) < (i_91_ ^ 0xffffffff);
			 i_91_++) {
			if ((is[arg5 + i_85_][i_86_ + i_91_] & 0x12c01e3) != 0)
			    break while_10_;
		    }
		    Class90.anIntArray1849[i_87_] = i_85_ + 1;
		    Class126.anIntArray2345[i_87_] = i_86_;
		    Class67_Sub5_Sub12.anIntArrayArray4694[i_85_ + 1][i_86_]
			= 8;
		    Class67_Sub22.anIntArrayArray3183[1 + i_85_][i_86_]
			= i_89_;
		    i_87_ = 1 + i_87_ & 0xfff;
		}
	    } while (false);
	while_11_:
	    do {
		if (i_86_ > 0
		    && (Class67_Sub5_Sub12.anIntArrayArray4694[i_85_]
			[i_86_ + -1]) == 0
		    && (is[i_85_][-1 + i_86_] & 0x12c010e ^ 0xffffffff) == -1
		    && ((0x12c0183 & is[-1 + (arg5 + i_85_)][i_86_ + -1])
			== 0)) {
		    for (int i_92_ = 1; i_92_ < -1 + arg5; i_92_++) {
			if ((0x12c018f & is[i_85_ - -i_92_][-1 + i_86_]) != 0)
			    break while_11_;
		    }
		    Class90.anIntArray1849[i_87_] = i_85_;
		    Class126.anIntArray2345[i_87_] = i_86_ + -1;
		    Class67_Sub5_Sub12.anIntArrayArray4694[i_85_][-1 + i_86_]
			= 1;
		    i_87_ = 1 + i_87_ & 0xfff;
		    Class67_Sub22.anIntArrayArray3183[i_85_][i_86_ - 1]
			= i_89_;
		}
	    } while (false);
	while_12_:
	    do {
		if ((i_86_ ^ 0xffffffff) > -103
		    && (Class67_Sub5_Sub12.anIntArrayArray4694[i_85_]
			[1 + i_86_]) == 0
		    && (is[i_85_][arg5 + i_86_] & 0x12c0138) == 0
		    && ((is[i_85_ + arg5 + -1][i_86_ + arg5] & 0x12c01e0)
			== 0)) {
		    for (int i_93_ = 1;
			 (-1 + arg5 ^ 0xffffffff) < (i_93_ ^ 0xffffffff);
			 i_93_++) {
			if ((0x12c01f8 & is[i_85_ - -i_93_][i_86_ + arg5]
			     ^ 0xffffffff)
			    != -1)
			    break while_12_;
		    }
		    Class90.anIntArray1849[i_87_] = i_85_;
		    Class126.anIntArray2345[i_87_] = 1 + i_86_;
		    i_87_ = 0xfff & i_87_ - -1;
		    Class67_Sub5_Sub12.anIntArrayArray4694[i_85_][i_86_ + 1]
			= 4;
		    Class67_Sub22.anIntArrayArray3183[i_85_][i_86_ + 1]
			= i_89_;
		}
	    } while (false);
	while_13_:
	    do {
		if ((i_85_ ^ 0xffffffff) < -1 && i_86_ > 0
		    && (Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i_85_]
			[i_86_ - 1]) == 0
		    && (0x12c0138 & is[-1 + i_85_][-2 + (i_86_ + arg5)]) == 0
		    && ((is[-1 + i_85_][-1 + i_86_] & 0x12c010e ^ 0xffffffff)
			== -1)
		    && (0x12c0183 & is[-1 + (arg5 + i_85_) + -1][-1 + i_86_]
			^ 0xffffffff) == -1) {
		    for (int i_94_ = 1; -1 + arg5 > i_94_; i_94_++) {
			if ((0x12c013e & is[i_85_ + -1][i_94_ + -1 + i_86_]
			     ^ 0xffffffff) != -1
			    || (0x12c018f & is[i_94_ + (i_85_ - 1)][i_86_ + -1]
				^ 0xffffffff) != -1)
			    break while_13_;
		    }
		    Class90.anIntArray1849[i_87_] = -1 + i_85_;
		    Class126.anIntArray2345[i_87_] = -1 + i_86_;
		    i_87_ = 0xfff & i_87_ + 1;
		    Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i_85_][(i_86_
									+ -1)]
			= 3;
		    Class67_Sub22.anIntArrayArray3183[-1 + i_85_][-1 + i_86_]
			= i_89_;
		}
	    } while (false);
	while_14_:
	    do {
		if (i_85_ < 102 && (i_86_ ^ 0xffffffff) < -1
		    && ((Class67_Sub5_Sub12.anIntArrayArray4694[i_85_ + 1]
			 [i_86_ + -1])
			^ 0xffffffff) == -1
		    && (0x12c010e & is[i_85_ + 1][-1 + i_86_]) == 0
		    && (is[i_85_ + arg5][i_86_ - 1] & 0x12c0183) == 0
		    && (0x12c01e0 & is[arg5 + i_85_][-1 + (-1 + i_86_ + arg5)]
			^ 0xffffffff) == -1) {
		    for (int i_95_ = 1;
			 (i_95_ ^ 0xffffffff) > (arg5 + -1 ^ 0xffffffff);
			 i_95_++) {
			if ((is[i_85_ + arg5][-1 + i_86_ - -i_95_] & 0x12c01e3
			     ^ 0xffffffff) != -1
			    || (0x12c018f & is[i_85_ + 1 + i_95_][i_86_ - 1]
				^ 0xffffffff) != -1)
			    break while_14_;
		    }
		    Class90.anIntArray1849[i_87_] = 1 + i_85_;
		    Class126.anIntArray2345[i_87_] = i_86_ - 1;
		    Class67_Sub5_Sub12.anIntArrayArray4694[i_85_ - -1][(i_86_
									+ -1)]
			= 9;
		    i_87_ = i_87_ - -1 & 0xfff;
		    Class67_Sub22.anIntArrayArray3183[i_85_ - -1][-1 + i_86_]
			= i_89_;
		}
	    } while (false);
	while_15_:
	    do {
		if ((i_85_ ^ 0xffffffff) < -1 && (i_86_ ^ 0xffffffff) > -103
		    && ((Class67_Sub5_Sub12.anIntArrayArray4694[i_85_ - 1]
			 [i_86_ - -1])
			^ 0xffffffff) == -1
		    && ((is[-1 + i_85_][1 + i_86_] & 0x12c010e ^ 0xffffffff)
			== -1)
		    && ((0x12c0138 & is[-1 + i_85_][arg5 + i_86_] ^ 0xffffffff)
			== -1)
		    && (0x12c01e0 & is[i_85_][i_86_ + arg5]) == 0) {
		    for (int i_96_ = 1;
			 (i_96_ ^ 0xffffffff) > (-1 + arg5 ^ 0xffffffff);
			 i_96_++) {
			if (((is[-1 + i_85_][i_96_ + 1 + i_86_] & 0x12c013e)
			     != 0)
			    || (is[i_96_ + -1 + i_85_][i_86_ - -arg5]
				& 0x12c01f8) != 0)
			    break while_15_;
		    }
		    Class90.anIntArray1849[i_87_] = -1 + i_85_;
		    Class126.anIntArray2345[i_87_] = i_86_ + 1;
		    Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i_85_][(i_86_
									+ 1)]
			= 6;
		    i_87_ = i_87_ - -1 & 0xfff;
		    Class67_Sub22.anIntArrayArray3183[-1 + i_85_][i_86_ - -1]
			= i_89_;
		}
	    } while (false);
	    if ((i_85_ ^ 0xffffffff) > -103 && i_86_ < 102
		&& ((Class67_Sub5_Sub12.anIntArrayArray4694[i_85_ - -1]
		     [1 + i_86_])
		    ^ 0xffffffff) == -1
		&& (0x12c0138 & is[1 + i_85_][arg5 + i_86_]) == 0
		&& ((0x12c01e0 & is[arg5 + i_85_][i_86_ + arg5] ^ 0xffffffff)
		    == -1)
		&& (0x12c0183 & is[arg5 + i_85_][1 + i_86_]) == 0) {
		for (int i_97_ = 1;
		     (i_97_ ^ 0xffffffff) > (arg5 + -1 ^ 0xffffffff);
		     i_97_++) {
		    if (((is[i_97_ + (i_85_ + 1)][i_86_ + arg5] & 0x12c01f8)
			 != 0)
			|| (is[arg5 + i_85_][i_86_ + 1 - -i_97_] & 0x12c01e3
			    ^ 0xffffffff) != -1)
			continue while_16_;
		}
		Class90.anIntArray1849[i_87_] = i_85_ + 1;
		Class126.anIntArray2345[i_87_] = i_86_ + 1;
		Class67_Sub5_Sub12.anIntArrayArray4694[1 + i_85_][1 + i_86_]
		    = 12;
		Class67_Sub22.anIntArrayArray3183[1 + i_85_][i_86_ - -1]
		    = i_89_;
		i_87_ = 0xfff & i_87_ - -1;
	    }
	}
	Class10.anInt396 = 0;
	if (!bool) {
	    if (!arg2)
		return false;
	    int i_98_ = 1000;
	    int i_99_ = 100;
	    int i_100_ = 10;
	    for (int i_101_ = arg10 + -i_100_; i_100_ + arg10 >= i_101_;
		 i_101_++) {
		for (int i_102_ = arg0 - i_100_;
		     (i_102_ ^ 0xffffffff) >= (arg0 - -i_100_ ^ 0xffffffff);
		     i_102_++) {
		    if (i_101_ >= 0 && i_102_ >= 0 && i_101_ < 104
			&& (i_102_ ^ 0xffffffff) > -105
			&& (Class67_Sub22.anIntArrayArray3183[i_101_][i_102_]
			    < 100)) {
			int i_103_ = 0;
			if ((i_101_ ^ 0xffffffff) <= (arg10 ^ 0xffffffff)) {
			    if ((i_101_ ^ 0xffffffff)
				< (arg9 + arg10 + -1 ^ 0xffffffff))
				i_103_ = -arg10 + (-arg9 - -1) + i_101_;
			} else
			    i_103_ = arg10 - i_101_;
			int i_104_ = 0;
			if ((arg0 ^ 0xffffffff) >= (i_102_ ^ 0xffffffff)) {
			    if ((i_102_ ^ 0xffffffff)
				< (-1 + arg0 - -arg4 ^ 0xffffffff))
				i_104_ = i_102_ + (-arg0 + -arg4 - -1);
			} else
			    i_104_ = -i_102_ + arg0;
			int i_105_ = i_104_ * i_104_ + i_103_ * i_103_;
			if (i_98_ > i_105_
			    || ((i_98_ ^ 0xffffffff) == (i_105_ ^ 0xffffffff)
				&& i_99_ > (Class67_Sub22.anIntArrayArray3183
					    [i_101_][i_102_]))) {
			    i_99_ = (Class67_Sub22.anIntArrayArray3183[i_101_]
				     [i_102_]);
			    i_85_ = i_101_;
			    i_98_ = i_105_;
			    i_86_ = i_102_;
			}
		    }
		}
	    }
	    if ((i_98_ ^ 0xffffffff) == -1001)
		return false;
	    if ((arg1 ^ 0xffffffff) == (i_85_ ^ 0xffffffff)
		&& (arg7 ^ 0xffffffff) == (i_86_ ^ 0xffffffff))
		return false;
	    Class10.anInt396 = 1;
	}
	i_88_ = 0;
	Class90.anIntArray1849[i_88_] = i_85_;
	Class126.anIntArray2345[i_88_++] = i_86_;
	int i_107_;
	int i_106_
	    = i_107_ = Class67_Sub5_Sub12.anIntArrayArray4694[i_85_][i_86_];
	while ((arg1 ^ 0xffffffff) != (i_85_ ^ 0xffffffff) || i_86_ != arg7) {
	    if (i_106_ != i_107_) {
		Class90.anIntArray1849[i_88_] = i_85_;
		Class126.anIntArray2345[i_88_++] = i_86_;
		i_107_ = i_106_;
	    }
	    if ((0x2 & i_106_) != 0)
		i_85_++;
	    else if ((i_106_ & 0x8) != 0)
		i_85_--;
	    if ((i_106_ & 0x1 ^ 0xffffffff) != -1)
		i_86_++;
	    else if ((i_106_ & 0x4) != 0)
		i_86_--;
	    i_106_ = Class67_Sub5_Sub12.anIntArrayArray4694[i_85_][i_86_];
	}
	if ((i_88_ ^ 0xffffffff) < -1) {
	    Class144.method1964(i_88_, -3, arg8);
	    return true;
	}
	if ((arg8 ^ 0xffffffff) == -2)
	    return false;
	return true;
    }
    
    static {
	aRSString_3298 = Class134.method1914("S-Blectionner", (byte) 88);
	aRSString_3309 = Class134.method1914("level: ", (byte) 90);
	anInt3295 = 0;
	aRSString_3311 = aRSString_3309;
	aRSString_3314 = Class134.method1914("rot:", (byte) 83);
    }
}
