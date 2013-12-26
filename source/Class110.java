/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class110
{
    public static Class85 aClass85_2093 = new Class85();
    
    public static void method1582() {
	aClass85_2093 = null;
    }
    
    public static void method1583(Class85 arg0) {
	byte i = arg0.aByte1720;
	int i_0_ = arg0.anInt1706;
	int i_1_ = arg0.anInt1713;
	int i_2_ = arg0.anInt1733;
	int[] is = Class62.anIntArray1151;
	int i_3_ = arg0.anInt1707;
	byte[] is_4_ = arg0.aByteArray1729;
	int i_5_ = arg0.anInt1749;
	int i_6_ = arg0.anInt1719;
	int i_7_ = i_6_;
	int i_8_ = arg0.anInt1717 + 1;
    while_32_:
	for (;;) {
	    if (i_0_ > 0) {
		for (;;) {
		    if (i_6_ == 0)
			break while_32_;
		    if (i_0_ == 1)
			break;
		    is_4_[i_5_] = i;
		    i_0_--;
		    i_5_++;
		    i_6_--;
		}
		if (i_6_ == 0) {
		    i_0_ = 1;
		    break;
		}
		is_4_[i_5_] = i;
		i_5_++;
		i_6_--;
	    }
	    boolean bool = true;
	    while (bool) {
		bool = false;
		if (i_1_ == i_8_) {
		    i_0_ = 0;
		    break while_32_;
		}
		i = (byte) i_2_;
		i_3_ = is[i_3_];
		int i_9_ = (byte) (i_3_ & 0xff);
		i_3_ >>= 8;
		i_1_++;
		if (i_9_ != i_2_) {
		    i_2_ = i_9_;
		    if (i_6_ == 0) {
			i_0_ = 1;
			break while_32_;
		    }
		    is_4_[i_5_] = i;
		    i_5_++;
		    i_6_--;
		    bool = true;
		} else if (i_1_ == i_8_) {
		    if (i_6_ == 0) {
			i_0_ = 1;
			break while_32_;
		    }
		    is_4_[i_5_] = i;
		    i_5_++;
		    i_6_--;
		    bool = true;
		}
	    }
	    i_0_ = 2;
	    i_3_ = is[i_3_];
	    int i_10_ = (byte) (i_3_ & 0xff);
	    i_3_ >>= 8;
	    if (++i_1_ != i_8_) {
		if (i_10_ != i_2_)
		    i_2_ = i_10_;
		else {
		    i_0_ = 3;
		    i_3_ = is[i_3_];
		    i_10_ = (byte) (i_3_ & 0xff);
		    i_3_ >>= 8;
		    if (++i_1_ != i_8_) {
			if (i_10_ != i_2_)
			    i_2_ = i_10_;
			else {
			    i_3_ = is[i_3_];
			    i_10_ = (byte) (i_3_ & 0xff);
			    i_3_ >>= 8;
			    i_1_++;
			    i_0_ = (i_10_ & 0xff) + 4;
			    i_3_ = is[i_3_];
			    i_2_ = (byte) (i_3_ & 0xff);
			    i_3_ >>= 8;
			    i_1_++;
			}
		    }
		}
	    }
	}
	int i_11_ = arg0.anInt1739;
	arg0.anInt1739 += i_7_ - i_6_;
	arg0.aByte1720 = i;
	arg0.anInt1706 = i_0_;
	arg0.anInt1713 = i_1_;
	arg0.anInt1733 = i_2_;
	Class62.anIntArray1151 = is;
	arg0.anInt1707 = i_3_;
	arg0.aByteArray1729 = is_4_;
	arg0.anInt1749 = i_5_;
	arg0.anInt1719 = i_6_;
    }
    
    public static int method1584(int arg0, Class85 arg1) {
	int i;
	for (;;) {
	    if (arg1.anInt1730 >= arg0) {
		int i_12_ = (arg1.anInt1743 >> arg1.anInt1730 - arg0
			     & (1 << arg0) - 1);
		arg1.anInt1730 -= arg0;
		i = i_12_;
		break;
	    }
	    arg1.anInt1743 = (arg1.anInt1743 << 8
			      | arg1.aByteArray1722[arg1.anInt1735] & 0xff);
	    arg1.anInt1730 += 8;
	    arg1.anInt1735++;
	    arg1.anInt1745++;
	}
	return i;
    }
    
    public static byte method1585(Class85 arg0) {
	return (byte) method1584(8, arg0);
    }
    
    public static int method1586(byte[] arg0, int arg1, byte[] arg2, int arg3,
				 int arg4) {
	synchronized (aClass85_2093) {
	    aClass85_2093.aByteArray1722 = arg2;
	    aClass85_2093.anInt1735 = arg4;
	    aClass85_2093.aByteArray1729 = arg0;
	    aClass85_2093.anInt1749 = 0;
	    aClass85_2093.anInt1719 = arg1;
	    aClass85_2093.anInt1730 = 0;
	    aClass85_2093.anInt1743 = 0;
	    aClass85_2093.anInt1745 = 0;
	    aClass85_2093.anInt1739 = 0;
	    method1587(aClass85_2093);
	    arg1 -= aClass85_2093.anInt1719;
	    aClass85_2093.aByteArray1722 = null;
	    aClass85_2093.aByteArray1729 = null;
	    return arg1;
	}
    }
    
    public static void method1587(Class85 arg0) {
	boolean bool = false;
	boolean bool_13_ = false;
	boolean bool_14_ = false;
	boolean bool_15_ = false;
	boolean bool_16_ = false;
	boolean bool_17_ = false;
	boolean bool_18_ = false;
	boolean bool_19_ = false;
	boolean bool_20_ = false;
	boolean bool_21_ = false;
	boolean bool_22_ = false;
	boolean bool_23_ = false;
	boolean bool_24_ = false;
	boolean bool_25_ = false;
	boolean bool_26_ = false;
	boolean bool_27_ = false;
	boolean bool_28_ = false;
	boolean bool_29_ = false;
	int i = 0;
	int[] is = null;
	int[] is_30_ = null;
	int[] is_31_ = null;
	arg0.anInt1736 = 1;
	if (Class62.anIntArray1151 == null)
	    Class62.anIntArray1151 = new int[arg0.anInt1736 * 100000];
	boolean bool_32_ = true;
	while (bool_32_) {
	    byte i_33_ = method1585(arg0);
	    if (i_33_ == 23)
		break;
	    i_33_ = method1585(arg0);
	    i_33_ = method1585(arg0);
	    i_33_ = method1585(arg0);
	    i_33_ = method1585(arg0);
	    i_33_ = method1585(arg0);
	    i_33_ = method1585(arg0);
	    i_33_ = method1585(arg0);
	    i_33_ = method1585(arg0);
	    i_33_ = method1585(arg0);
	    i_33_ = method1590(arg0);
	    arg0.anInt1747 = 0;
	    int i_34_ = method1585(arg0);
	    arg0.anInt1747 = arg0.anInt1747 << 8 | i_34_ & 0xff;
	    i_34_ = method1585(arg0);
	    arg0.anInt1747 = arg0.anInt1747 << 8 | i_34_ & 0xff;
	    i_34_ = method1585(arg0);
	    arg0.anInt1747 = arg0.anInt1747 << 8 | i_34_ & 0xff;
	    for (int i_35_ = 0; i_35_ < 16; i_35_++) {
		i_33_ = method1590(arg0);
		if (i_33_ == 1)
		    arg0.aBooleanArray1714[i_35_] = true;
		else
		    arg0.aBooleanArray1714[i_35_] = false;
	    }
	    for (int i_36_ = 0; i_36_ < 256; i_36_++)
		arg0.aBooleanArray1721[i_36_] = false;
	    for (int i_37_ = 0; i_37_ < 16; i_37_++) {
		if (arg0.aBooleanArray1714[i_37_]) {
		    for (int i_38_ = 0; i_38_ < 16; i_38_++) {
			i_33_ = method1590(arg0);
			if (i_33_ == 1)
			    arg0.aBooleanArray1721[i_37_ * 16 + i_38_] = true;
		    }
		}
	    }
	    method1588(arg0);
	    int i_39_ = arg0.anInt1740 + 2;
	    int i_40_ = method1584(3, arg0);
	    int i_41_ = method1584(15, arg0);
	    for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
		int i_43_ = 0;
		for (;;) {
		    i_33_ = method1590(arg0);
		    if (i_33_ == 0)
			break;
		    i_43_++;
		}
		arg0.aByteArray1734[i_42_] = (byte) i_43_;
	    }
	    byte[] is_44_ = new byte[6];
	    for (byte i_45_ = 0; i_45_ < i_40_; i_45_++)
		is_44_[i_45_] = i_45_;
	    for (int i_46_ = 0; i_46_ < i_41_; i_46_++) {
		byte i_47_ = arg0.aByteArray1734[i_46_];
		byte i_48_ = is_44_[i_47_];
		for (/**/; i_47_ > 0; i_47_--)
		    is_44_[i_47_] = is_44_[i_47_ - 1];
		is_44_[0] = i_48_;
		arg0.aByteArray1724[i_46_] = i_48_;
	    }
	    for (int i_49_ = 0; i_49_ < i_40_; i_49_++) {
		int i_50_ = method1584(5, arg0);
		for (int i_51_ = 0; i_51_ < i_39_; i_51_++) {
		    for (;;) {
			i_33_ = method1590(arg0);
			if (i_33_ == 0)
			    break;
			i_33_ = method1590(arg0);
			if (i_33_ == 0)
			    i_50_++;
			else
			    i_50_--;
		    }
		    arg0.aByteArrayArray1710[i_49_][i_51_] = (byte) i_50_;
		}
	    }
	    for (int i_52_ = 0; i_52_ < i_40_; i_52_++) {
		int i_53_ = 32;
		byte i_54_ = 0;
		for (int i_55_ = 0; i_55_ < i_39_; i_55_++) {
		    if (arg0.aByteArrayArray1710[i_52_][i_55_] > i_54_)
			i_54_ = arg0.aByteArrayArray1710[i_52_][i_55_];
		    if (arg0.aByteArrayArray1710[i_52_][i_55_] < i_53_)
			i_53_ = arg0.aByteArrayArray1710[i_52_][i_55_];
		}
		method1589(arg0.anIntArrayArray1709[i_52_],
			   arg0.anIntArrayArray1718[i_52_],
			   arg0.anIntArrayArray1732[i_52_],
			   arg0.aByteArrayArray1710[i_52_], i_53_, i_54_,
			   i_39_);
		arg0.anIntArray1712[i_52_] = i_53_;
	    }
	    int i_56_ = arg0.anInt1740 + 1;
	    int i_57_ = -1;
	    int i_58_ = 0;
	    for (int i_59_ = 0; i_59_ <= 255; i_59_++)
		arg0.anIntArray1716[i_59_] = 0;
	    int i_60_ = 4095;
	    for (int i_61_ = 15; i_61_ >= 0; i_61_--) {
		for (int i_62_ = 15; i_62_ >= 0; i_62_--) {
		    arg0.aByteArray1737[i_60_] = (byte) (i_61_ * 16 + i_62_);
		    i_60_--;
		}
		arg0.anIntArray1731[i_61_] = i_60_ + 1;
	    }
	    int i_63_ = 0;
	    if (i_58_ == 0) {
		i_57_++;
		i_58_ = 50;
		byte i_64_ = arg0.aByteArray1724[i_57_];
		i = arg0.anIntArray1712[i_64_];
		is = arg0.anIntArrayArray1709[i_64_];
		is_31_ = arg0.anIntArrayArray1732[i_64_];
		is_30_ = arg0.anIntArrayArray1718[i_64_];
	    }
	    i_58_--;
	    int i_65_ = i;
	    int i_66_;
	    int i_67_;
	    for (i_67_ = method1584(i_65_, arg0); i_67_ > is[i_65_];
		 i_67_ = i_67_ << 1 | i_66_) {
		i_65_++;
		i_66_ = method1590(arg0);
	    }
	    int i_68_ = is_31_[i_67_ - is_30_[i_65_]];
	    while (i_68_ != i_56_) {
		if (i_68_ == 0 || i_68_ == 1) {
		    int i_69_ = -1;
		    int i_70_ = 1;
		    do {
			if (i_68_ == 0)
			    i_69_ += i_70_;
			else if (i_68_ == 1)
			    i_69_ += 2 * i_70_;
			i_70_ *= 2;
			if (i_58_ == 0) {
			    i_57_++;
			    i_58_ = 50;
			    byte i_71_ = arg0.aByteArray1724[i_57_];
			    i = arg0.anIntArray1712[i_71_];
			    is = arg0.anIntArrayArray1709[i_71_];
			    is_31_ = arg0.anIntArrayArray1732[i_71_];
			    is_30_ = arg0.anIntArrayArray1718[i_71_];
			}
			i_58_--;
			i_65_ = i;
			for (i_67_ = method1584(i_65_, arg0);
			     i_67_ > is[i_65_]; i_67_ = i_67_ << 1 | i_66_) {
			    i_65_++;
			    i_66_ = method1590(arg0);
			}
			i_68_ = is_31_[i_67_ - is_30_[i_65_]];
		    } while (i_68_ == 0 || i_68_ == 1);
		    i_69_++;
		    i_34_ = (arg0.aByteArray1708
			     [(arg0.aByteArray1737[arg0.anIntArray1731[0]]
			       & 0xff)]);
		    arg0.anIntArray1716[i_34_ & 0xff] += i_69_;
		    for (/**/; i_69_ > 0; i_69_--) {
			Class62.anIntArray1151[i_63_] = i_34_ & 0xff;
			i_63_++;
		    }
		} else {
		    int i_72_ = i_68_ - 1;
		    if (i_72_ < 16) {
			int i_73_ = arg0.anIntArray1731[0];
			i_33_ = arg0.aByteArray1737[i_73_ + i_72_];
			for (/**/; i_72_ > 3; i_72_ -= 4) {
			    int i_74_ = i_73_ + i_72_;
			    arg0.aByteArray1737[i_74_]
				= arg0.aByteArray1737[i_74_ - 1];
			    arg0.aByteArray1737[i_74_ - 1]
				= arg0.aByteArray1737[i_74_ - 2];
			    arg0.aByteArray1737[i_74_ - 2]
				= arg0.aByteArray1737[i_74_ - 3];
			    arg0.aByteArray1737[i_74_ - 3]
				= arg0.aByteArray1737[i_74_ - 4];
			}
			for (/**/; i_72_ > 0; i_72_--)
			    arg0.aByteArray1737[i_73_ + i_72_]
				= arg0.aByteArray1737[i_73_ + i_72_ - 1];
			arg0.aByteArray1737[i_73_] = i_33_;
		    } else {
			int i_75_ = i_72_ / 16;
			int i_76_ = i_72_ % 16;
			int i_77_ = arg0.anIntArray1731[i_75_] + i_76_;
			i_33_ = arg0.aByteArray1737[i_77_];
			for (/**/; i_77_ > arg0.anIntArray1731[i_75_]; i_77_--)
			    arg0.aByteArray1737[i_77_]
				= arg0.aByteArray1737[i_77_ - 1];
			arg0.anIntArray1731[i_75_]++;
			for (/**/; i_75_ > 0; i_75_--) {
			    arg0.anIntArray1731[i_75_]--;
			    arg0.aByteArray1737[arg0.anIntArray1731[i_75_]]
				= (arg0.aByteArray1737
				   [arg0.anIntArray1731[i_75_ - 1] + 16 - 1]);
			}
			arg0.anIntArray1731[0]--;
			arg0.aByteArray1737[arg0.anIntArray1731[0]] = i_33_;
			if (arg0.anIntArray1731[0] == 0) {
			    int i_78_ = 4095;
			    for (int i_79_ = 15; i_79_ >= 0; i_79_--) {
				for (int i_80_ = 15; i_80_ >= 0; i_80_--) {
				    arg0.aByteArray1737[i_78_]
					= (arg0.aByteArray1737
					   [(arg0.anIntArray1731[i_79_]
					     + i_80_)]);
				    i_78_--;
				}
				arg0.anIntArray1731[i_79_] = i_78_ + 1;
			    }
			}
		    }
		    arg0.anIntArray1716[(arg0.aByteArray1708[i_33_ & 0xff]
					 & 0xff)]++;
		    Class62.anIntArray1151[i_63_]
			= arg0.aByteArray1708[i_33_ & 0xff] & 0xff;
		    i_63_++;
		    if (i_58_ == 0) {
			i_57_++;
			i_58_ = 50;
			byte i_81_ = arg0.aByteArray1724[i_57_];
			i = arg0.anIntArray1712[i_81_];
			is = arg0.anIntArrayArray1709[i_81_];
			is_31_ = arg0.anIntArrayArray1732[i_81_];
			is_30_ = arg0.anIntArrayArray1718[i_81_];
		    }
		    i_58_--;
		    i_65_ = i;
		    for (i_67_ = method1584(i_65_, arg0); i_67_ > is[i_65_];
			 i_67_ = i_67_ << 1 | i_66_) {
			i_65_++;
			i_66_ = method1590(arg0);
		    }
		    i_68_ = is_31_[i_67_ - is_30_[i_65_]];
		}
	    }
	    arg0.anInt1706 = 0;
	    arg0.aByte1720 = (byte) 0;
	    arg0.anIntArray1738[0] = 0;
	    for (int i_82_ = 1; i_82_ <= 256; i_82_++)
		arg0.anIntArray1738[i_82_] = arg0.anIntArray1716[i_82_ - 1];
	    for (int i_83_ = 1; i_83_ <= 256; i_83_++)
		arg0.anIntArray1738[i_83_] += arg0.anIntArray1738[i_83_ - 1];
	    for (int i_84_ = 0; i_84_ < i_63_; i_84_++) {
		i_34_ = (byte) (Class62.anIntArray1151[i_84_] & 0xff);
		Class62.anIntArray1151[arg0.anIntArray1738[i_34_ & 0xff]]
		    |= i_84_ << 8;
		arg0.anIntArray1738[i_34_ & 0xff]++;
	    }
	    arg0.anInt1707 = Class62.anIntArray1151[arg0.anInt1747] >> 8;
	    arg0.anInt1713 = 0;
	    arg0.anInt1707 = Class62.anIntArray1151[arg0.anInt1707];
	    arg0.anInt1733 = (byte) (arg0.anInt1707 & 0xff);
	    arg0.anInt1707 >>= 8;
	    arg0.anInt1713++;
	    arg0.anInt1717 = i_63_;
	    method1583(arg0);
	    if (arg0.anInt1713 == arg0.anInt1717 + 1 && arg0.anInt1706 == 0)
		bool_32_ = true;
	    else
		bool_32_ = false;
	}
    }
    
    public static void method1588(Class85 arg0) {
	arg0.anInt1740 = 0;
	for (int i = 0; i < 256; i++) {
	    if (arg0.aBooleanArray1721[i]) {
		arg0.aByteArray1708[arg0.anInt1740] = (byte) i;
		arg0.anInt1740++;
	    }
	}
    }
    
    public static void method1589(int[] arg0, int[] arg1, int[] arg2,
				  byte[] arg3, int arg4, int arg5, int arg6) {
	int i = 0;
	for (int i_85_ = arg4; i_85_ <= arg5; i_85_++) {
	    for (int i_86_ = 0; i_86_ < arg6; i_86_++) {
		if (arg3[i_86_] == i_85_) {
		    arg2[i] = i_86_;
		    i++;
		}
	    }
	}
	for (int i_87_ = 0; i_87_ < 23; i_87_++)
	    arg1[i_87_] = 0;
	for (int i_88_ = 0; i_88_ < arg6; i_88_++)
	    arg1[arg3[i_88_] + 1]++;
	for (int i_89_ = 1; i_89_ < 23; i_89_++)
	    arg1[i_89_] += arg1[i_89_ - 1];
	for (int i_90_ = 0; i_90_ < 23; i_90_++)
	    arg0[i_90_] = 0;
	int i_91_ = 0;
	for (int i_92_ = arg4; i_92_ <= arg5; i_92_++) {
	    i_91_ += arg1[i_92_ + 1] - arg1[i_92_];
	    arg0[i_92_] = i_91_ - 1;
	    i_91_ <<= 1;
	}
	for (int i_93_ = arg4 + 1; i_93_ <= arg5; i_93_++)
	    arg1[i_93_] = (arg0[i_93_ - 1] + 1 << 1) - arg1[i_93_];
    }
    
    public static byte method1590(Class85 arg0) {
	return (byte) method1584(1, arg0);
    }
}
