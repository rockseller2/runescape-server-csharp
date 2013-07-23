/* Class67_Sub5_Sub19_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub19_Sub1_Sub1 extends Class67_Sub5_Sub19_Sub1
{
    public void method1000(int arg0, int arg1, int arg2) {
	arg0 += anInt4817;
	arg1 += anInt4814;
	int i = arg0 + arg1 * Class121.anInt2296;
	int i_0_ = 0;
	int i_1_ = anInt4812;
	int i_2_ = anInt4813;
	int i_3_ = Class121.anInt2296 - i_2_;
	int i_4_ = 0;
	if (arg1 < Class121.anInt2295) {
	    int i_5_ = Class121.anInt2295 - arg1;
	    i_1_ -= i_5_;
	    arg1 = Class121.anInt2295;
	    i_0_ += i_5_ * i_2_;
	    i += i_5_ * Class121.anInt2296;
	}
	if (arg1 + i_1_ > Class121.anInt2297)
	    i_1_ -= arg1 + i_1_ - Class121.anInt2297;
	if (arg0 < Class121.anInt2298) {
	    int i_6_ = Class121.anInt2298 - arg0;
	    i_2_ -= i_6_;
	    arg0 = Class121.anInt2298;
	    i_0_ += i_6_;
	    i += i_6_;
	    i_4_ += i_6_;
	    i_3_ += i_6_;
	}
	if (arg0 + i_2_ > Class121.anInt2301) {
	    int i_7_ = arg0 + i_2_ - Class121.anInt2301;
	    i_2_ -= i_7_;
	    i_4_ += i_7_;
	    i_3_ += i_7_;
	}
	if (i_2_ > 0 && i_1_ > 0)
	    method1031(Class121.anIntArray2300, anIntArray5149, 0, i_0_, i,
		       i_2_, i_1_, i_3_, i_4_, arg2);
    }
    
    public Class67_Sub5_Sub19_Sub1_Sub1(int arg0, int arg1, int arg2, int arg3,
					int arg4, int arg5, int[] arg6) {
	super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
    
    public static void method1028(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8) {
	int i = -arg5;
	for (int i_8_ = -arg6; i_8_ < 0; i_8_++) {
	    for (int i_9_ = i; i_9_ < 0; i_9_++) {
		arg2 = arg1[arg3--];
		int i_10_ = arg2 >>> 24;
		if (i_10_ != 0) {
		    int i_11_ = 256 - i_10_;
		    int i_12_ = arg0[arg4];
		    arg0[arg4++] = ((((arg2 & 0xff00ff) * i_10_
				      + (i_12_ & 0xff00ff) * i_11_)
				     & ~0xff00ff)
				    + (((arg2 & 0xff00) * i_10_
					+ (i_12_ & 0xff00) * i_11_)
				       & 0xff0000)) >>> 8;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method1006(int arg0, int arg1) {
	arg0 += anInt4817;
	arg1 += anInt4814;
	int i = arg0 + arg1 * Class121.anInt2296;
	int i_13_ = 0;
	int i_14_ = anInt4812;
	int i_15_ = anInt4813;
	int i_16_ = Class121.anInt2296 - i_15_;
	int i_17_ = 0;
	if (arg1 < Class121.anInt2295) {
	    int i_18_ = Class121.anInt2295 - arg1;
	    i_14_ -= i_18_;
	    arg1 = Class121.anInt2295;
	    i_13_ += i_18_ * i_15_;
	    i += i_18_ * Class121.anInt2296;
	}
	if (arg1 + i_14_ > Class121.anInt2297)
	    i_14_ -= arg1 + i_14_ - Class121.anInt2297;
	if (arg0 < Class121.anInt2298) {
	    int i_19_ = Class121.anInt2298 - arg0;
	    i_15_ -= i_19_;
	    arg0 = Class121.anInt2298;
	    i_13_ += i_19_;
	    i += i_19_;
	    i_17_ += i_19_;
	    i_16_ += i_19_;
	}
	if (arg0 + i_15_ > Class121.anInt2301) {
	    int i_20_ = arg0 + i_15_ - Class121.anInt2301;
	    i_15_ -= i_20_;
	    i_17_ += i_20_;
	    i_16_ += i_20_;
	}
	if (i_15_ > 0 && i_14_ > 0)
	    method1032(Class121.anIntArray2300, anIntArray5149, 0, i_13_, i,
		       i_15_, i_14_, i_16_, i_17_);
    }
    
    public void method1005(int arg0, int arg1) {
	arg0 += anInt4825 - anInt4813 - anInt4817;
	arg1 += anInt4814;
	int i = arg0 + arg1 * Class121.anInt2296;
	int i_21_ = anInt4813 - 1;
	int i_22_ = anInt4812;
	int i_23_ = anInt4813;
	int i_24_ = Class121.anInt2296 - i_23_;
	int i_25_ = i_23_ + i_23_;
	if (arg1 < Class121.anInt2295) {
	    int i_26_ = Class121.anInt2295 - arg1;
	    i_22_ -= i_26_;
	    arg1 = Class121.anInt2295;
	    i_21_ += i_26_ * i_23_;
	    i += i_26_ * Class121.anInt2296;
	}
	if (arg1 + i_22_ > Class121.anInt2297)
	    i_22_ -= arg1 + i_22_ - Class121.anInt2297;
	if (arg0 < Class121.anInt2298) {
	    int i_27_ = Class121.anInt2298 - arg0;
	    i_23_ -= i_27_;
	    arg0 = Class121.anInt2298;
	    i_21_ -= i_27_;
	    i += i_27_;
	    i_25_ -= i_27_;
	    i_24_ += i_27_;
	}
	if (arg0 + i_23_ > Class121.anInt2301) {
	    int i_28_ = arg0 + i_23_ - Class121.anInt2301;
	    i_23_ -= i_28_;
	    i_25_ -= i_28_;
	    i_24_ += i_28_;
	}
	if (i_23_ > 0 && i_22_ > 0)
	    method1028(Class121.anIntArray2300, anIntArray5149, 0, i_21_, i,
		       i_23_, i_22_, i_24_, i_25_);
    }
    
    public static void method1029(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9, int arg10, int arg11,
				  int arg12) {
	int i = arg3;
	for (int i_29_ = -arg8; i_29_ < 0; i_29_++) {
	    int i_30_ = (arg4 >> 16) * arg11;
	    for (int i_31_ = -arg7; i_31_ < 0; i_31_++) {
		int i_32_ = arg1[(arg3 >> 16) + i_30_];
		int i_33_ = arg0[arg5];
		int i_34_ = (i_32_ >>> 24) * arg12 >> 8;
		int i_35_ = 256 - i_34_;
		arg0[arg5++]
		    = (((i_32_ & 0xff00ff) * i_34_ + (i_33_ & 0xff00ff) * i_35_
			& ~0xff00ff)
		       + ((i_32_ & 0xff00) * i_34_ + (i_33_ & 0xff00) * i_35_
			  & 0xff0000)) >>> 8;
		arg3 += arg9;
	    }
	    arg4 += arg10;
	    arg3 = i;
	    arg5 += arg6;
	}
    }
    
    public static void method1030(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9, int arg10, int arg11) {
	int i = arg3;
	for (int i_36_ = -arg8; i_36_ < 0; i_36_++) {
	    int i_37_ = (arg4 >> 16) * arg11;
	    for (int i_38_ = -arg7; i_38_ < 0; i_38_++) {
		arg2 = arg1[(arg3 >> 16) + i_37_];
		int i_39_ = arg2 >>> 24;
		if (i_39_ != 0) {
		    int i_40_ = 256 - i_39_;
		    int i_41_ = arg0[arg5];
		    arg0[arg5++] = ((((arg2 & 0xff00ff) * i_39_
				      + (i_41_ & 0xff00ff) * i_40_)
				     & ~0xff00ff)
				    + (((arg2 & 0xff00) * i_39_
					+ (i_41_ & 0xff00) * i_40_)
				       & 0xff0000)) >>> 8;
		} else
		    arg5++;
		arg3 += arg9;
	    }
	    arg4 += arg10;
	    arg3 = i;
	    arg5 += arg6;
	}
    }
    
    public void method1004(int arg0, int arg1, int arg2, int arg3) {
	if (arg2 > 0 && arg3 > 0) {
	    int i = anInt4813;
	    int i_42_ = anInt4812;
	    int i_43_ = 0;
	    int i_44_ = 0;
	    int i_45_ = anInt4825;
	    int i_46_ = anInt4815;
	    int i_47_ = (i_45_ << 16) / arg2;
	    int i_48_ = (i_46_ << 16) / arg3;
	    if (anInt4817 > 0) {
		int i_49_ = ((anInt4817 << 16) + i_47_ - 1) / i_47_;
		arg0 += i_49_;
		i_43_ += i_49_ * i_47_ - (anInt4817 << 16);
	    }
	    if (anInt4814 > 0) {
		int i_50_ = ((anInt4814 << 16) + i_48_ - 1) / i_48_;
		arg1 += i_50_;
		i_44_ += i_50_ * i_48_ - (anInt4814 << 16);
	    }
	    if (i < i_45_)
		arg2 = ((i << 16) - i_43_ + i_47_ - 1) / i_47_;
	    if (i_42_ < i_46_)
		arg3 = ((i_42_ << 16) - i_44_ + i_48_ - 1) / i_48_;
	    int i_51_ = arg0 + arg1 * Class121.anInt2296;
	    int i_52_ = Class121.anInt2296 - arg2;
	    if (arg1 + arg3 > Class121.anInt2297)
		arg3 -= arg1 + arg3 - Class121.anInt2297;
	    if (arg1 < Class121.anInt2295) {
		int i_53_ = Class121.anInt2295 - arg1;
		arg3 -= i_53_;
		i_51_ += i_53_ * Class121.anInt2296;
		i_44_ += i_48_ * i_53_;
	    }
	    if (arg0 + arg2 > Class121.anInt2301) {
		int i_54_ = arg0 + arg2 - Class121.anInt2301;
		arg2 -= i_54_;
		i_52_ += i_54_;
	    }
	    if (arg0 < Class121.anInt2298) {
		int i_55_ = Class121.anInt2298 - arg0;
		arg2 -= i_55_;
		i_51_ += i_55_;
		i_43_ += i_47_ * i_55_;
		i_52_ += i_55_;
	    }
	    method1030(Class121.anIntArray2300, anIntArray5149, 0, i_43_,
		       i_44_, i_51_, i_52_, arg2, arg3, i_47_, i_48_, i);
	}
    }
    
    public void method1022(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, int[] arg8,
			   int[] arg9) {
	try {
	    int i = -arg2 / 2;
	    int i_56_ = -arg3 / 2;
	    int i_57_ = (int) (Math.sin((double) arg6 / 326.11) * 65536.0);
	    int i_58_ = (int) (Math.cos((double) arg6 / 326.11) * 65536.0);
	    i_57_ = i_57_ * arg7 >> 8;
	    i_58_ = i_58_ * arg7 >> 8;
	    int i_59_ = (arg4 << 16) + (i_56_ * i_57_ + i * i_58_);
	    int i_60_ = (arg5 << 16) + (i_56_ * i_58_ - i * i_57_);
	    int i_61_ = arg0 + arg1 * Class121.anInt2296;
	    for (arg1 = 0; arg1 < arg3; arg1++) {
		int i_62_ = arg8[arg1];
		int i_63_ = i_61_ + i_62_;
		int i_64_ = i_59_ + i_58_ * i_62_;
		int i_65_ = i_60_ - i_57_ * i_62_;
		for (arg0 = -arg9[arg1]; arg0 < 0; arg0++) {
		    int i_66_ = (anIntArray5149
				 [(i_64_ >> 16) + (i_65_ >> 16) * anInt4813]);
		    int i_67_ = Class121.anIntArray2300[i_63_];
		    int i_68_ = i_66_ >>> 24;
		    int i_69_ = 256 - i_68_;
		    Class121.anIntArray2300[i_63_++]
			= ((((i_66_ & 0xff00ff) * i_68_
			     + (i_67_ & 0xff00ff) * i_69_)
			    & ~0xff00ff)
			   + (((i_66_ & 0xff00) * i_68_
			       + (i_67_ & 0xff00) * i_69_)
			      & 0xff0000)) >>> 8;
		    i_64_ += i_58_;
		    i_65_ -= i_57_;
		}
		i_59_ += i_57_;
		i_60_ += i_58_;
		i_61_ += Class121.anInt2296;
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method1003(int arg0, int arg1) {
	arg0 += anInt4817;
	arg1 += anInt4814;
	int i = arg0 + arg1 * Class121.anInt2296;
	int i_70_ = 0;
	int i_71_ = anInt4812;
	int i_72_ = anInt4813;
	int i_73_ = Class121.anInt2296 - i_72_;
	int i_74_ = 0;
	if (arg1 < Class121.anInt2295) {
	    int i_75_ = Class121.anInt2295 - arg1;
	    i_71_ -= i_75_;
	    arg1 = Class121.anInt2295;
	    i_70_ += i_75_ * i_72_;
	    i += i_75_ * Class121.anInt2296;
	}
	if (arg1 + i_71_ > Class121.anInt2297)
	    i_71_ -= arg1 + i_71_ - Class121.anInt2297;
	if (arg0 < Class121.anInt2298) {
	    int i_76_ = Class121.anInt2298 - arg0;
	    i_72_ -= i_76_;
	    arg0 = Class121.anInt2298;
	    i_70_ += i_76_;
	    i += i_76_;
	    i_74_ += i_76_;
	    i_73_ += i_76_;
	}
	if (arg0 + i_72_ > Class121.anInt2301) {
	    int i_77_ = arg0 + i_72_ - Class121.anInt2301;
	    i_72_ -= i_77_;
	    i_74_ += i_77_;
	    i_73_ += i_77_;
	}
	if (i_72_ > 0 && i_71_ > 0)
	    method1032(Class121.anIntArray2300, anIntArray5149, 0, i_70_, i,
		       i_72_, i_71_, i_73_, i_74_);
    }
    
    public void method1020(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, double arg6, int arg7) {
	try {
	    int i = -arg2 / 2;
	    int i_78_ = -arg3 / 2;
	    int i_79_ = (int) (Math.sin(arg6) * 65536.0);
	    int i_80_ = (int) (Math.cos(arg6) * 65536.0);
	    i_79_ = i_79_ * arg7 >> 8;
	    i_80_ = i_80_ * arg7 >> 8;
	    int i_81_ = (arg4 << 16) + (i_78_ * i_79_ + i * i_80_);
	    int i_82_ = (arg5 << 16) + (i_78_ * i_80_ - i * i_79_);
	    int i_83_ = arg0 + arg1 * Class121.anInt2296;
	    for (arg1 = 0; arg1 < arg3; arg1++) {
		int i_84_ = i_83_;
		int i_85_ = i_81_;
		int i_86_ = i_82_;
		for (arg0 = -arg2; arg0 < 0; arg0++) {
		    int i_87_ = (anIntArray5149
				 [(i_85_ >> 16) + (i_86_ >> 16) * anInt4813]);
		    int i_88_ = Class121.anIntArray2300[i_84_];
		    int i_89_ = i_87_ >>> 24;
		    int i_90_ = 256 - i_89_;
		    Class121.anIntArray2300[i_84_++]
			= ((((i_87_ & 0xff00ff) * i_89_
			     + (i_88_ & 0xff00ff) * i_90_)
			    & ~0xff00ff)
			   + (((i_87_ & 0xff00) * i_89_
			       + (i_88_ & 0xff00) * i_90_)
			      & 0xff0000)) >>> 8;
		    i_85_ += i_80_;
		    i_86_ -= i_79_;
		}
		i_81_ += i_79_;
		i_82_ += i_80_;
		i_83_ += Class121.anInt2296;
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method1002(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	if (arg5 != 0) {
	    arg0 -= anInt4817 << 4;
	    arg1 -= anInt4814 << 4;
	    double d = (double) (arg4 & 0xffff) * 9.587379924285257E-5;
	    int i = (int) Math.floor(Math.sin(d) * (double) arg5 + 0.5);
	    int i_91_ = (int) Math.floor(Math.cos(d) * (double) arg5 + 0.5);
	    int i_92_ = -arg0 * i_91_ + -arg1 * i;
	    int i_93_ = arg0 * i + -arg1 * i_91_;
	    int i_94_ = ((anInt4813 << 4) - arg0) * i_91_ + -arg1 * i;
	    int i_95_ = -((anInt4813 << 4) - arg0) * i + -arg1 * i_91_;
	    int i_96_ = -arg0 * i_91_ + ((anInt4812 << 4) - arg1) * i;
	    int i_97_ = arg0 * i + ((anInt4812 << 4) - arg1) * i_91_;
	    int i_98_ = (((anInt4813 << 4) - arg0) * i_91_
			 + ((anInt4812 << 4) - arg1) * i);
	    int i_99_ = (-((anInt4813 << 4) - arg0) * i
			 + ((anInt4812 << 4) - arg1) * i_91_);
	    int i_100_;
	    int i_101_;
	    if (i_92_ < i_94_) {
		i_100_ = i_92_;
		i_101_ = i_94_;
	    } else {
		i_100_ = i_94_;
		i_101_ = i_92_;
	    }
	    if (i_96_ < i_100_)
		i_100_ = i_96_;
	    if (i_98_ < i_100_)
		i_100_ = i_98_;
	    if (i_96_ > i_101_)
		i_101_ = i_96_;
	    if (i_98_ > i_101_)
		i_101_ = i_98_;
	    int i_102_;
	    int i_103_;
	    if (i_93_ < i_95_) {
		i_102_ = i_93_;
		i_103_ = i_95_;
	    } else {
		i_102_ = i_95_;
		i_103_ = i_93_;
	    }
	    if (i_97_ < i_102_)
		i_102_ = i_97_;
	    if (i_99_ < i_102_)
		i_102_ = i_99_;
	    if (i_97_ > i_103_)
		i_103_ = i_97_;
	    if (i_99_ > i_103_)
		i_103_ = i_99_;
	    i_100_ >>= 12;
	    i_101_ = i_101_ + 4095 >> 12;
	    i_102_ >>= 12;
	    i_103_ = i_103_ + 4095 >> 12;
	    i_100_ += arg2;
	    i_101_ += arg2;
	    i_102_ += arg3;
	    i_103_ += arg3;
	    i_100_ >>= 4;
	    i_101_ = i_101_ + 15 >> 4;
	    i_102_ >>= 4;
	    i_103_ = i_103_ + 15 >> 4;
	    if (i_100_ < Class121.anInt2298)
		i_100_ = Class121.anInt2298;
	    if (i_101_ > Class121.anInt2301)
		i_101_ = Class121.anInt2301;
	    if (i_102_ < Class121.anInt2295)
		i_102_ = Class121.anInt2295;
	    if (i_103_ > Class121.anInt2297)
		i_103_ = Class121.anInt2297;
	    i_101_ = i_100_ - i_101_;
	    if (i_101_ < 0) {
		i_103_ = i_102_ - i_103_;
		if (i_103_ < 0) {
		    int i_104_ = i_102_ * Class121.anInt2296 + i_100_;
		    double d_105_ = 1.6777216E7 / (double) arg5;
		    int i_106_ = (int) Math.floor(Math.sin(d) * d_105_ + 0.5);
		    int i_107_ = (int) Math.floor(Math.cos(d) * d_105_ + 0.5);
		    int i_108_ = (i_100_ << 4) + 8 - arg2;
		    int i_109_ = (i_102_ << 4) + 8 - arg3;
		    int i_110_ = (arg0 << 8) - (i_109_ * i_106_ >> 4);
		    int i_111_ = (arg1 << 8) + (i_109_ * i_107_ >> 4);
		    if (i_107_ == 0) {
			if (i_106_ == 0) {
			    int i_112_ = i_103_;
			    while (i_112_ < 0) {
				int i_113_ = i_104_;
				int i_114_ = i_110_;
				int i_115_ = i_111_;
				int i_116_ = i_101_;
				if (i_114_ >= 0 && i_115_ >= 0
				    && i_114_ - (anInt4813 << 12) < 0
				    && i_115_ - (anInt4812 << 12) < 0) {
				    for (/**/; i_116_ < 0; i_116_++) {
					int i_117_
					    = (anIntArray5149
					       [((i_115_ >> 12) * anInt4813
						 + (i_114_ >> 12))]);
					int i_118_
					    = Class121.anIntArray2300[i_113_];
					int i_119_ = i_117_ >>> 24;
					int i_120_ = 256 - i_119_;
					Class121.anIntArray2300[i_113_++]
					    = ((((i_117_ & 0xff00ff) * i_119_
						 + ((i_118_ & 0xff00ff)
						    * i_120_))
						& ~0xff00ff)
					       + (((i_117_ & 0xff00) * i_119_
						   + ((i_118_ & 0xff00)
						      * i_120_))
						  & 0xff0000)) >>> 8;
				    }
				}
				i_112_++;
				i_104_ += Class121.anInt2296;
			    }
			} else if (i_106_ < 0) {
			    int i_121_ = i_103_;
			    while (i_121_ < 0) {
				int i_122_ = i_104_;
				int i_123_ = i_110_;
				int i_124_ = i_111_ + (i_108_ * i_106_ >> 4);
				int i_125_ = i_101_;
				if (i_123_ >= 0
				    && i_123_ - (anInt4813 << 12) < 0) {
				    int i_126_;
				    if ((i_126_ = i_124_ - (anInt4812 << 12))
					>= 0) {
					i_126_ = (i_106_ - i_126_) / i_106_;
					i_125_ += i_126_;
					i_124_ += i_106_ * i_126_;
					i_122_ += i_126_;
				    }
				    if ((i_126_ = (i_124_ - i_106_) / i_106_)
					> i_125_)
					i_125_ = i_126_;
				    for (/**/; i_125_ < 0; i_125_++) {
					int i_127_
					    = (anIntArray5149
					       [((i_124_ >> 12) * anInt4813
						 + (i_123_ >> 12))]);
					int i_128_
					    = Class121.anIntArray2300[i_122_];
					int i_129_ = i_127_ >>> 24;
					int i_130_ = 256 - i_129_;
					Class121.anIntArray2300[i_122_++]
					    = ((((i_127_ & 0xff00ff) * i_129_
						 + ((i_128_ & 0xff00ff)
						    * i_130_))
						& ~0xff00ff)
					       + (((i_127_ & 0xff00) * i_129_
						   + ((i_128_ & 0xff00)
						      * i_130_))
						  & 0xff0000)) >>> 8;
					i_124_ += i_106_;
				    }
				}
				i_121_++;
				i_110_ -= i_106_;
				i_104_ += Class121.anInt2296;
			    }
			} else {
			    int i_131_ = i_103_;
			    while (i_131_ < 0) {
				int i_132_ = i_104_;
				int i_133_ = i_110_;
				int i_134_ = i_111_ + (i_108_ * i_106_ >> 4);
				int i_135_ = i_101_;
				if (i_133_ >= 0
				    && i_133_ - (anInt4813 << 12) < 0) {
				    if (i_134_ < 0) {
					int i_136_
					    = (i_106_ - 1 - i_134_) / i_106_;
					i_135_ += i_136_;
					i_134_ += i_106_ * i_136_;
					i_132_ += i_136_;
				    }
				    int i_137_;
				    if ((i_137_
					 = (1 + i_134_ - (anInt4812 << 12)
					    - i_106_) / i_106_)
					> i_135_)
					i_135_ = i_137_;
				    for (/**/; i_135_ < 0; i_135_++) {
					int i_138_
					    = (anIntArray5149
					       [((i_134_ >> 12) * anInt4813
						 + (i_133_ >> 12))]);
					int i_139_
					    = Class121.anIntArray2300[i_132_];
					int i_140_ = i_138_ >>> 24;
					int i_141_ = 256 - i_140_;
					Class121.anIntArray2300[i_132_++]
					    = ((((i_138_ & 0xff00ff) * i_140_
						 + ((i_139_ & 0xff00ff)
						    * i_141_))
						& ~0xff00ff)
					       + (((i_138_ & 0xff00) * i_140_
						   + ((i_139_ & 0xff00)
						      * i_141_))
						  & 0xff0000)) >>> 8;
					i_134_ += i_106_;
				    }
				}
				i_131_++;
				i_110_ -= i_106_;
				i_104_ += Class121.anInt2296;
			    }
			}
		    } else if (i_107_ < 0) {
			if (i_106_ == 0) {
			    int i_142_ = i_103_;
			    while (i_142_ < 0) {
				int i_143_ = i_104_;
				int i_144_ = i_110_ + (i_108_ * i_107_ >> 4);
				int i_145_ = i_111_;
				int i_146_ = i_101_;
				if (i_145_ >= 0
				    && i_145_ - (anInt4812 << 12) < 0) {
				    int i_147_;
				    if ((i_147_ = i_144_ - (anInt4813 << 12))
					>= 0) {
					i_147_ = (i_107_ - i_147_) / i_107_;
					i_146_ += i_147_;
					i_144_ += i_107_ * i_147_;
					i_143_ += i_147_;
				    }
				    if ((i_147_ = (i_144_ - i_107_) / i_107_)
					> i_146_)
					i_146_ = i_147_;
				    for (/**/; i_146_ < 0; i_146_++) {
					int i_148_
					    = (anIntArray5149
					       [((i_145_ >> 12) * anInt4813
						 + (i_144_ >> 12))]);
					int i_149_
					    = Class121.anIntArray2300[i_143_];
					int i_150_ = i_148_ >>> 24;
					int i_151_ = 256 - i_150_;
					Class121.anIntArray2300[i_143_++]
					    = ((((i_148_ & 0xff00ff) * i_150_
						 + ((i_149_ & 0xff00ff)
						    * i_151_))
						& ~0xff00ff)
					       + (((i_148_ & 0xff00) * i_150_
						   + ((i_149_ & 0xff00)
						      * i_151_))
						  & 0xff0000)) >>> 8;
					i_144_ += i_107_;
				    }
				}
				i_142_++;
				i_111_ += i_107_;
				i_104_ += Class121.anInt2296;
			    }
			} else if (i_106_ < 0) {
			    int i_152_ = i_103_;
			    while (i_152_ < 0) {
				int i_153_ = i_104_;
				int i_154_ = i_110_ + (i_108_ * i_107_ >> 4);
				int i_155_ = i_111_ + (i_108_ * i_106_ >> 4);
				int i_156_ = i_101_;
				int i_157_;
				if ((i_157_ = i_154_ - (anInt4813 << 12))
				    >= 0) {
				    i_157_ = (i_107_ - i_157_) / i_107_;
				    i_156_ += i_157_;
				    i_154_ += i_107_ * i_157_;
				    i_155_ += i_106_ * i_157_;
				    i_153_ += i_157_;
				}
				if ((i_157_ = (i_154_ - i_107_) / i_107_)
				    > i_156_)
				    i_156_ = i_157_;
				if ((i_157_ = i_155_ - (anInt4812 << 12))
				    >= 0) {
				    i_157_ = (i_106_ - i_157_) / i_106_;
				    i_156_ += i_157_;
				    i_154_ += i_107_ * i_157_;
				    i_155_ += i_106_ * i_157_;
				    i_153_ += i_157_;
				}
				if ((i_157_ = (i_155_ - i_106_) / i_106_)
				    > i_156_)
				    i_156_ = i_157_;
				for (/**/; i_156_ < 0; i_156_++) {
				    int i_158_ = (anIntArray5149
						  [((i_155_ >> 12) * anInt4813
						    + (i_154_ >> 12))]);
				    int i_159_
					= Class121.anIntArray2300[i_153_];
				    int i_160_ = i_158_ >>> 24;
				    int i_161_ = 256 - i_160_;
				    Class121.anIntArray2300[i_153_++]
					= ((((i_158_ & 0xff00ff) * i_160_
					     + (i_159_ & 0xff00ff) * i_161_)
					    & ~0xff00ff)
					   + (((i_158_ & 0xff00) * i_160_
					       + (i_159_ & 0xff00) * i_161_)
					      & 0xff0000)) >>> 8;
				    i_154_ += i_107_;
				    i_155_ += i_106_;
				}
				i_152_++;
				i_110_ -= i_106_;
				i_111_ += i_107_;
				i_104_ += Class121.anInt2296;
			    }
			} else {
			    int i_162_ = i_103_;
			    while (i_162_ < 0) {
				int i_163_ = i_104_;
				int i_164_ = i_110_ + (i_108_ * i_107_ >> 4);
				int i_165_ = i_111_ + (i_108_ * i_106_ >> 4);
				int i_166_ = i_101_;
				int i_167_;
				if ((i_167_ = i_164_ - (anInt4813 << 12))
				    >= 0) {
				    i_167_ = (i_107_ - i_167_) / i_107_;
				    i_166_ += i_167_;
				    i_164_ += i_107_ * i_167_;
				    i_165_ += i_106_ * i_167_;
				    i_163_ += i_167_;
				}
				if ((i_167_ = (i_164_ - i_107_) / i_107_)
				    > i_166_)
				    i_166_ = i_167_;
				if (i_165_ < 0) {
				    i_167_ = (i_106_ - 1 - i_165_) / i_106_;
				    i_166_ += i_167_;
				    i_164_ += i_107_ * i_167_;
				    i_165_ += i_106_ * i_167_;
				    i_163_ += i_167_;
				}
				if ((i_167_ = (1 + i_165_ - (anInt4812 << 12)
					       - i_106_) / i_106_)
				    > i_166_)
				    i_166_ = i_167_;
				for (/**/; i_166_ < 0; i_166_++) {
				    int i_168_ = (anIntArray5149
						  [((i_165_ >> 12) * anInt4813
						    + (i_164_ >> 12))]);
				    int i_169_
					= Class121.anIntArray2300[i_163_];
				    int i_170_ = i_168_ >>> 24;
				    int i_171_ = 256 - i_170_;
				    Class121.anIntArray2300[i_163_++]
					= ((((i_168_ & 0xff00ff) * i_170_
					     + (i_169_ & 0xff00ff) * i_171_)
					    & ~0xff00ff)
					   + (((i_168_ & 0xff00) * i_170_
					       + (i_169_ & 0xff00) * i_171_)
					      & 0xff0000)) >>> 8;
				    i_164_ += i_107_;
				    i_165_ += i_106_;
				}
				i_162_++;
				i_110_ -= i_106_;
				i_111_ += i_107_;
				i_104_ += Class121.anInt2296;
			    }
			}
		    } else if (i_106_ == 0) {
			int i_172_ = i_103_;
			while (i_172_ < 0) {
			    int i_173_ = i_104_;
			    int i_174_ = i_110_ + (i_108_ * i_107_ >> 4);
			    int i_175_ = i_111_;
			    int i_176_ = i_101_;
			    if (i_175_ >= 0
				&& i_175_ - (anInt4812 << 12) < 0) {
				if (i_174_ < 0) {
				    int i_177_
					= (i_107_ - 1 - i_174_) / i_107_;
				    i_176_ += i_177_;
				    i_174_ += i_107_ * i_177_;
				    i_173_ += i_177_;
				}
				int i_178_;
				if ((i_178_ = (1 + i_174_ - (anInt4813 << 12)
					       - i_107_) / i_107_)
				    > i_176_)
				    i_176_ = i_178_;
				for (/**/; i_176_ < 0; i_176_++) {
				    int i_179_ = (anIntArray5149
						  [((i_175_ >> 12) * anInt4813
						    + (i_174_ >> 12))]);
				    int i_180_
					= Class121.anIntArray2300[i_173_];
				    int i_181_ = i_179_ >>> 24;
				    int i_182_ = 256 - i_181_;
				    Class121.anIntArray2300[i_173_++]
					= ((((i_179_ & 0xff00ff) * i_181_
					     + (i_180_ & 0xff00ff) * i_182_)
					    & ~0xff00ff)
					   + (((i_179_ & 0xff00) * i_181_
					       + (i_180_ & 0xff00) * i_182_)
					      & 0xff0000)) >>> 8;
				    i_174_ += i_107_;
				}
			    }
			    i_172_++;
			    i_111_ += i_107_;
			    i_104_ += Class121.anInt2296;
			}
		    } else if (i_106_ < 0) {
			int i_183_ = i_103_;
			while (i_183_ < 0) {
			    int i_184_ = i_104_;
			    int i_185_ = i_110_ + (i_108_ * i_107_ >> 4);
			    int i_186_ = i_111_ + (i_108_ * i_106_ >> 4);
			    int i_187_ = i_101_;
			    if (i_185_ < 0) {
				int i_188_ = (i_107_ - 1 - i_185_) / i_107_;
				i_187_ += i_188_;
				i_185_ += i_107_ * i_188_;
				i_186_ += i_106_ * i_188_;
				i_184_ += i_188_;
			    }
			    int i_189_;
			    if ((i_189_ = (1 + i_185_ - (anInt4813 << 12)
					   - i_107_) / i_107_)
				> i_187_)
				i_187_ = i_189_;
			    if ((i_189_ = i_186_ - (anInt4812 << 12)) >= 0) {
				i_189_ = (i_106_ - i_189_) / i_106_;
				i_187_ += i_189_;
				i_185_ += i_107_ * i_189_;
				i_186_ += i_106_ * i_189_;
				i_184_ += i_189_;
			    }
			    if ((i_189_ = (i_186_ - i_106_) / i_106_) > i_187_)
				i_187_ = i_189_;
			    for (/**/; i_187_ < 0; i_187_++) {
				int i_190_
				    = (anIntArray5149
				       [(i_186_ >> 12) * anInt4813 + (i_185_
								      >> 12)]);
				int i_191_ = Class121.anIntArray2300[i_184_];
				int i_192_ = i_190_ >>> 24;
				int i_193_ = 256 - i_192_;
				Class121.anIntArray2300[i_184_++]
				    = ((((i_190_ & 0xff00ff) * i_192_
					 + (i_191_ & 0xff00ff) * i_193_)
					& ~0xff00ff)
				       + (((i_190_ & 0xff00) * i_192_
					   + (i_191_ & 0xff00) * i_193_)
					  & 0xff0000)) >>> 8;
				i_185_ += i_107_;
				i_186_ += i_106_;
			    }
			    i_183_++;
			    i_110_ -= i_106_;
			    i_111_ += i_107_;
			    i_104_ += Class121.anInt2296;
			}
		    } else {
			int i_194_ = i_103_;
			while (i_194_ < 0) {
			    int i_195_ = i_104_;
			    int i_196_ = i_110_ + (i_108_ * i_107_ >> 4);
			    int i_197_ = i_111_ + (i_108_ * i_106_ >> 4);
			    int i_198_ = i_101_;
			    if (i_196_ < 0) {
				int i_199_ = (i_107_ - 1 - i_196_) / i_107_;
				i_198_ += i_199_;
				i_196_ += i_107_ * i_199_;
				i_197_ += i_106_ * i_199_;
				i_195_ += i_199_;
			    }
			    int i_200_;
			    if ((i_200_ = (1 + i_196_ - (anInt4813 << 12)
					   - i_107_) / i_107_)
				> i_198_)
				i_198_ = i_200_;
			    if (i_197_ < 0) {
				i_200_ = (i_106_ - 1 - i_197_) / i_106_;
				i_198_ += i_200_;
				i_196_ += i_107_ * i_200_;
				i_197_ += i_106_ * i_200_;
				i_195_ += i_200_;
			    }
			    if ((i_200_ = (1 + i_197_ - (anInt4812 << 12)
					   - i_106_) / i_106_)
				> i_198_)
				i_198_ = i_200_;
			    for (/**/; i_198_ < 0; i_198_++) {
				int i_201_
				    = (anIntArray5149
				       [(i_197_ >> 12) * anInt4813 + (i_196_
								      >> 12)]);
				int i_202_ = Class121.anIntArray2300[i_195_];
				int i_203_ = i_201_ >>> 24;
				int i_204_ = 256 - i_203_;
				Class121.anIntArray2300[i_195_++]
				    = ((((i_201_ & 0xff00ff) * i_203_
					 + (i_202_ & 0xff00ff) * i_204_)
					& ~0xff00ff)
				       + (((i_201_ & 0xff00) * i_203_
					   + (i_202_ & 0xff00) * i_204_)
					  & 0xff0000)) >>> 8;
				i_196_ += i_107_;
				i_197_ += i_106_;
			    }
			    i_194_++;
			    i_110_ -= i_106_;
			    i_111_ += i_107_;
			    i_104_ += Class121.anInt2296;
			}
		    }
		}
	    }
	}
    }
    
    public void method1025(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, int[] arg8,
			   int[] arg9) {
	try {
	    int i = -arg2 / 2;
	    int i_205_ = -arg3 / 2;
	    int i_206_ = (int) (Math.sin((double) arg6 / 326.11) * 65536.0);
	    int i_207_ = (int) (Math.cos((double) arg6 / 326.11) * 65536.0);
	    i_206_ = i_206_ * arg7 >> 8;
	    i_207_ = i_207_ * arg7 >> 8;
	    int i_208_ = (arg4 << 16) + (i_205_ * i_206_ + i * i_207_);
	    int i_209_ = (arg5 << 16) + (i_205_ * i_207_ - i * i_206_);
	    int i_210_ = arg0 + arg1 * Class121.anInt2296;
	    for (arg1 = 0; arg1 < arg3; arg1++) {
		int i_211_ = arg8[arg1];
		int i_212_ = i_210_ + i_211_;
		int i_213_ = i_208_ + i_207_ * i_211_;
		int i_214_ = i_209_ - i_206_ * i_211_;
		for (arg0 = -arg9[arg1]; arg0 < 0; arg0++) {
		    int i_215_
			= (anIntArray5149
			   [(i_213_ >> 16) + (i_214_ >> 16) * anInt4813]);
		    int i_216_ = Class121.anIntArray2300[i_212_];
		    int i_217_ = i_215_ >>> 24;
		    int i_218_ = 256 - i_217_;
		    Class121.anIntArray2300[i_212_++]
			= ((((i_215_ & 0xff00ff) * i_217_
			     + (i_216_ & 0xff00ff) * i_218_)
			    & ~0xff00ff)
			   + (((i_215_ & 0xff00) * i_217_
			       + (i_216_ & 0xff00) * i_218_)
			      & 0xff0000)) >>> 8;
		    i_213_ += i_207_;
		    i_214_ -= i_206_;
		}
		i_208_ += i_206_;
		i_209_ += i_207_;
		i_210_ += Class121.anInt2296;
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method1007(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (arg2 > 0 && arg3 > 0) {
	    int i = anInt4813;
	    int i_219_ = anInt4812;
	    int i_220_ = 0;
	    int i_221_ = 0;
	    int i_222_ = anInt4825;
	    int i_223_ = anInt4815;
	    int i_224_ = (i_222_ << 16) / arg2;
	    int i_225_ = (i_223_ << 16) / arg3;
	    if (anInt4817 > 0) {
		int i_226_ = ((anInt4817 << 16) + i_224_ - 1) / i_224_;
		arg0 += i_226_;
		i_220_ += i_226_ * i_224_ - (anInt4817 << 16);
	    }
	    if (anInt4814 > 0) {
		int i_227_ = ((anInt4814 << 16) + i_225_ - 1) / i_225_;
		arg1 += i_227_;
		i_221_ += i_227_ * i_225_ - (anInt4814 << 16);
	    }
	    if (i < i_222_)
		arg2 = ((i << 16) - i_220_ + i_224_ - 1) / i_224_;
	    if (i_219_ < i_223_)
		arg3 = ((i_219_ << 16) - i_221_ + i_225_ - 1) / i_225_;
	    int i_228_ = arg0 + arg1 * Class121.anInt2296;
	    int i_229_ = Class121.anInt2296 - arg2;
	    if (arg1 + arg3 > Class121.anInt2297)
		arg3 -= arg1 + arg3 - Class121.anInt2297;
	    if (arg1 < Class121.anInt2295) {
		int i_230_ = Class121.anInt2295 - arg1;
		arg3 -= i_230_;
		i_228_ += i_230_ * Class121.anInt2296;
		i_221_ += i_225_ * i_230_;
	    }
	    if (arg0 + arg2 > Class121.anInt2301) {
		int i_231_ = arg0 + arg2 - Class121.anInt2301;
		arg2 -= i_231_;
		i_229_ += i_231_;
	    }
	    if (arg0 < Class121.anInt2298) {
		int i_232_ = Class121.anInt2298 - arg0;
		arg2 -= i_232_;
		i_228_ += i_232_;
		i_220_ += i_224_ * i_232_;
		i_229_ += i_232_;
	    }
	    method1029(Class121.anIntArray2300, anIntArray5149, 0, i_220_,
		       i_221_, i_228_, i_229_, arg2, arg3, i_224_, i_225_, i,
		       arg4);
	}
    }
    
    public static void method1031(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9) {
	for (int i = -arg6; i < 0; i++) {
	    for (int i_233_ = -arg5; i_233_ < 0; i_233_++) {
		int i_234_ = (arg1[arg3] >>> 24) * arg9 >> 8;
		int i_235_ = 256 - i_234_;
		int i_236_ = arg1[arg3++];
		int i_237_ = arg0[arg4];
		arg0[arg4++] = ((((i_236_ & 0xff00ff) * i_234_
				  + (i_237_ & 0xff00ff) * i_235_)
				 & ~0xff00ff)
				+ (((i_236_ & 0xff00) * i_234_
				    + (i_237_ & 0xff00) * i_235_)
				   & 0xff0000)) >>> 8;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public static void method1032(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8) {
	int i = -arg5;
	for (int i_238_ = -arg6; i_238_ < 0; i_238_++) {
	    for (int i_239_ = i; i_239_ < 0; i_239_++) {
		arg2 = arg1[arg3++];
		int i_240_ = arg2 >>> 24;
		if (i_240_ != 0) {
		    int i_241_ = 256 - i_240_;
		    int i_242_ = arg0[arg4];
		    arg0[arg4++] = ((((arg2 & 0xff00ff) * i_240_
				      + (i_242_ & 0xff00ff) * i_241_)
				     & ~0xff00ff)
				    + (((arg2 & 0xff00) * i_240_
					+ (i_242_ & 0xff00) * i_241_)
				       & 0xff0000)) >>> 8;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
}
