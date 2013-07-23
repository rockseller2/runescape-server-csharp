/* Class67_Sub5_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub19_Sub1 extends Class67_Sub5_Sub19
{
    public int[] anIntArray5149;
    
    public void method1006(int arg0, int arg1) {
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
	    method1015(Class121.anIntArray2300, anIntArray5149, 0, i_0_, i,
		       i_2_, i_1_, i_3_, i_4_);
    }
    
    public static void method1009(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9, int arg10, int arg11,
				  int arg12) {
	int i = 256 - arg12;
	int i_8_ = arg3;
	for (int i_9_ = -arg8; i_9_ < 0; i_9_++) {
	    int i_10_ = (arg4 >> 16) * arg11;
	    for (int i_11_ = -arg7; i_11_ < 0; i_11_++) {
		arg2 = arg1[(arg3 >> 16) + i_10_];
		if (arg2 != 0) {
		    int i_12_ = arg0[arg5];
		    arg0[arg5++]
			= (((arg2 & 0xff00ff) * arg12 + (i_12_ & 0xff00ff) * i
			    & ~0xff00ff)
			   + ((arg2 & 0xff00) * arg12 + (i_12_ & 0xff00) * i
			      & 0xff0000)) >> 8;
		} else
		    arg5++;
		arg3 += arg9;
	    }
	    arg4 += arg10;
	    arg3 = i_8_;
	    arg5 += arg6;
	}
    }
    
    public int[] method1010() {
	int[] is = new int[anInt4825 * anInt4815];
	for (int i = 0; i < anInt4812; i++) {
	    int i_13_ = i * anInt4813;
	    int i_14_ = anInt4817 + (i + anInt4814) * anInt4825;
	    for (int i_15_ = 0; i_15_ < anInt4813; i_15_++) {
		int i_16_ = anIntArray5149[i_13_++];
		is[i_14_++] = i_16_ != 0 ? ~0xffffff | i_16_ : 0;
	    }
	}
	return is;
    }
    
    public void method1005(int arg0, int arg1) {
	arg0 += anInt4825 - anInt4813 - anInt4817;
	arg1 += anInt4814;
	int i = arg0 + arg1 * Class121.anInt2296;
	int i_17_ = anInt4813 - 1;
	int i_18_ = anInt4812;
	int i_19_ = anInt4813;
	int i_20_ = Class121.anInt2296 - i_19_;
	int i_21_ = i_19_ + i_19_;
	if (arg1 < Class121.anInt2295) {
	    int i_22_ = Class121.anInt2295 - arg1;
	    i_18_ -= i_22_;
	    arg1 = Class121.anInt2295;
	    i_17_ += i_22_ * i_19_;
	    i += i_22_ * Class121.anInt2296;
	}
	if (arg1 + i_18_ > Class121.anInt2297)
	    i_18_ -= arg1 + i_18_ - Class121.anInt2297;
	if (arg0 < Class121.anInt2298) {
	    int i_23_ = Class121.anInt2298 - arg0;
	    i_19_ -= i_23_;
	    arg0 = Class121.anInt2298;
	    i_17_ -= i_23_;
	    i += i_23_;
	    i_21_ -= i_23_;
	    i_20_ += i_23_;
	}
	if (arg0 + i_19_ > Class121.anInt2301) {
	    int i_24_ = arg0 + i_19_ - Class121.anInt2301;
	    i_19_ -= i_24_;
	    i_21_ -= i_24_;
	    i_20_ += i_24_;
	}
	if (i_19_ > 0 && i_18_ > 0)
	    method1027(Class121.anIntArray2300, anIntArray5149, 0, i_17_, i,
		       i_19_, i_18_, i_20_, i_21_);
    }
    
    public static void method1011(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	for (int i = -arg5; i < 0; i++) {
	    int i_25_ = arg3 + arg4 - 3;
	    while (arg3 < i_25_) {
		arg0[arg3++] = arg1[arg2++];
		arg0[arg3++] = arg1[arg2++];
		arg0[arg3++] = arg1[arg2++];
		arg0[arg3++] = arg1[arg2++];
	    }
	    i_25_ += 3;
	    while (arg3 < i_25_)
		arg0[arg3++] = arg1[arg2++];
	    arg3 += arg6;
	    arg2 += arg7;
	}
    }
    
    public void method1012() {
	Class121.method1684(anIntArray5149, anInt4813, anInt4812);
    }
    
    public void method1013() {
	if (anInt4813 != anInt4825 || anInt4812 != anInt4815) {
	    int[] is = new int[anInt4825 * anInt4815];
	    for (int i = 0; i < anInt4812; i++) {
		for (int i_26_ = 0; i_26_ < anInt4813; i_26_++)
		    is[(i + anInt4814) * anInt4825 + (i_26_ + anInt4817)]
			= anIntArray5149[i * anInt4813 + i_26_];
	    }
	    anIntArray5149 = is;
	    anInt4813 = anInt4825;
	    anInt4812 = anInt4815;
	    anInt4817 = 0;
	    anInt4814 = 0;
	}
    }
    
    public void method1014(int arg0) {
	if (anInt4813 != anInt4825 || anInt4812 != anInt4815) {
	    int i = arg0;
	    if (i > anInt4817)
		i = anInt4817;
	    int i_27_ = arg0;
	    if (i_27_ + anInt4817 + anInt4813 > anInt4825)
		i_27_ = anInt4825 - anInt4817 - anInt4813;
	    int i_28_ = arg0;
	    if (i_28_ > anInt4814)
		i_28_ = anInt4814;
	    int i_29_ = arg0;
	    if (i_29_ + anInt4814 + anInt4812 > anInt4815)
		i_29_ = anInt4815 - anInt4814 - anInt4812;
	    int i_30_ = anInt4813 + i + i_27_;
	    int i_31_ = anInt4812 + i_28_ + i_29_;
	    int[] is = new int[i_30_ * i_31_];
	    for (int i_32_ = 0; i_32_ < anInt4812; i_32_++) {
		for (int i_33_ = 0; i_33_ < anInt4813; i_33_++)
		    is[(i_32_ + i_28_) * i_30_ + (i_33_ + i)]
			= anIntArray5149[i_32_ * anInt4813 + i_33_];
	    }
	    anIntArray5149 = is;
	    anInt4813 = i_30_;
	    anInt4812 = i_31_;
	    anInt4817 -= i;
	    anInt4814 -= i_28_;
	}
    }
    
    public static void method1015(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_34_ = -arg6; i_34_ < 0; i_34_++) {
	    for (int i_35_ = i; i_35_ < 0; i_35_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_36_ = arg5; i_36_ < 0; i_36_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method1016(int arg0) {
	int[] is = new int[anInt4813 * anInt4812];
	int i = 0;
	for (int i_37_ = 0; i_37_ < anInt4812; i_37_++) {
	    for (int i_38_ = 0; i_38_ < anInt4813; i_38_++) {
		int i_39_ = anIntArray5149[i];
		if (i_39_ == 0) {
		    if (i_38_ > 0 && anIntArray5149[i - 1] != 0)
			i_39_ = arg0;
		    else if (i_37_ > 0 && anIntArray5149[i - anInt4813] != 0)
			i_39_ = arg0;
		    else if (i_38_ < anInt4813 - 1
			     && anIntArray5149[i + 1] != 0)
			i_39_ = arg0;
		    else if (i_37_ < anInt4812 - 1
			     && anIntArray5149[i + anInt4813] != 0)
			i_39_ = arg0;
		}
		is[i++] = i_39_;
	    }
	}
	anIntArray5149 = is;
    }
    
    public void method1017(int arg0) {
	for (int i = anInt4812 - 1; i > 0; i--) {
	    int i_40_ = i * anInt4813;
	    for (int i_41_ = anInt4813 - 1; i_41_ > 0; i_41_--) {
		if (anIntArray5149[i_41_ + i_40_] == 0
		    && anIntArray5149[i_41_ + i_40_ - 1 - anInt4813] != 0)
		    anIntArray5149[i_41_ + i_40_] = arg0;
	    }
	}
    }
    
    public static void method1018(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9) {
	int i = 256 - arg9;
	for (int i_42_ = -arg6; i_42_ < 0; i_42_++) {
	    for (int i_43_ = -arg5; i_43_ < 0; i_43_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0) {
		    int i_44_ = arg0[arg4];
		    arg0[arg4++]
			= (((arg2 & 0xff00ff) * arg9 + (i_44_ & 0xff00ff) * i
			    & ~0xff00ff)
			   + ((arg2 & 0xff00) * arg9 + (i_44_ & 0xff00) * i
			      & 0xff0000)) >> 8;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method1019() {
	int[] is = new int[anInt4813 * anInt4812];
	int i = 0;
	for (int i_45_ = anInt4812 - 1; i_45_ >= 0; i_45_--) {
	    for (int i_46_ = 0; i_46_ < anInt4813; i_46_++)
		is[i++] = anIntArray5149[i_46_ + i_45_ * anInt4813];
	}
	anIntArray5149 = is;
	anInt4814 = anInt4815 - anInt4812 - anInt4814;
    }
    
    public void method1003(int arg0, int arg1) {
	arg0 += anInt4817;
	arg1 += anInt4814;
	int i = arg0 + arg1 * Class121.anInt2296;
	int i_47_ = 0;
	int i_48_ = anInt4812;
	int i_49_ = anInt4813;
	int i_50_ = Class121.anInt2296 - i_49_;
	int i_51_ = 0;
	if (arg1 < Class121.anInt2295) {
	    int i_52_ = Class121.anInt2295 - arg1;
	    i_48_ -= i_52_;
	    arg1 = Class121.anInt2295;
	    i_47_ += i_52_ * i_49_;
	    i += i_52_ * Class121.anInt2296;
	}
	if (arg1 + i_48_ > Class121.anInt2297)
	    i_48_ -= arg1 + i_48_ - Class121.anInt2297;
	if (arg0 < Class121.anInt2298) {
	    int i_53_ = Class121.anInt2298 - arg0;
	    i_49_ -= i_53_;
	    arg0 = Class121.anInt2298;
	    i_47_ += i_53_;
	    i += i_53_;
	    i_51_ += i_53_;
	    i_50_ += i_53_;
	}
	if (arg0 + i_49_ > Class121.anInt2301) {
	    int i_54_ = arg0 + i_49_ - Class121.anInt2301;
	    i_49_ -= i_54_;
	    i_51_ += i_54_;
	    i_50_ += i_54_;
	}
	if (i_49_ > 0 && i_48_ > 0)
	    method1011(Class121.anIntArray2300, anIntArray5149, i_47_, i,
		       i_49_, i_48_, i_50_, i_51_);
    }
    
    public void method1020(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, double arg6, int arg7) {
	try {
	    int i = -arg2 / 2;
	    int i_55_ = -arg3 / 2;
	    int i_56_ = (int) (Math.sin(arg6) * 65536.0);
	    int i_57_ = (int) (Math.cos(arg6) * 65536.0);
	    i_56_ = i_56_ * arg7 >> 8;
	    i_57_ = i_57_ * arg7 >> 8;
	    int i_58_ = (arg4 << 16) + (i_55_ * i_56_ + i * i_57_);
	    int i_59_ = (arg5 << 16) + (i_55_ * i_57_ - i * i_56_);
	    int i_60_ = arg0 + arg1 * Class121.anInt2296;
	    for (arg1 = 0; arg1 < arg3; arg1++) {
		int i_61_ = i_60_;
		int i_62_ = i_58_;
		int i_63_ = i_59_;
		for (arg0 = -arg2; arg0 < 0; arg0++) {
		    int i_64_ = (anIntArray5149
				 [(i_62_ >> 16) + (i_63_ >> 16) * anInt4813]);
		    if (i_64_ != 0)
			Class121.anIntArray2300[i_61_++] = i_64_;
		    else
			i_61_++;
		    i_62_ += i_57_;
		    i_63_ -= i_56_;
		}
		i_58_ += i_56_;
		i_59_ += i_57_;
		i_60_ += Class121.anInt2296;
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static void method1021(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9, int arg10, int arg11) {
	int i = arg3;
	for (int i_65_ = -arg8; i_65_ < 0; i_65_++) {
	    int i_66_ = (arg4 >> 16) * arg11;
	    for (int i_67_ = -arg7; i_67_ < 0; i_67_++) {
		arg2 = arg1[(arg3 >> 16) + i_66_];
		if (arg2 != 0)
		    arg0[arg5++] = arg2;
		else
		    arg5++;
		arg3 += arg9;
	    }
	    arg4 += arg10;
	    arg3 = i;
	    arg5 += arg6;
	}
    }
    
    public void method1022(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, int[] arg8,
			   int[] arg9) {
	try {
	    int i = -arg2 / 2;
	    int i_68_ = -arg3 / 2;
	    int i_69_ = (int) (Math.sin((double) arg6 / 326.11) * 65536.0);
	    int i_70_ = (int) (Math.cos((double) arg6 / 326.11) * 65536.0);
	    i_69_ = i_69_ * arg7 >> 8;
	    i_70_ = i_70_ * arg7 >> 8;
	    int i_71_ = (arg4 << 16) + (i_68_ * i_69_ + i * i_70_);
	    int i_72_ = (arg5 << 16) + (i_68_ * i_70_ - i * i_69_);
	    int i_73_ = arg0 + arg1 * Class121.anInt2296;
	    for (arg1 = 0; arg1 < arg3; arg1++) {
		int i_74_ = arg8[arg1];
		int i_75_ = i_73_ + i_74_;
		int i_76_ = i_71_ + i_70_ * i_74_;
		int i_77_ = i_72_ - i_69_ * i_74_;
		for (arg0 = -arg9[arg1]; arg0 < 0; arg0++) {
		    int i_78_ = (anIntArray5149
				 [(i_76_ >> 16) + (i_77_ >> 16) * anInt4813]);
		    if (i_78_ != 0)
			Class121.anIntArray2300[i_75_++] = i_78_;
		    else
			i_75_++;
		    i_76_ += i_70_;
		    i_77_ -= i_69_;
		}
		i_71_ += i_69_;
		i_72_ += i_70_;
		i_73_ += Class121.anInt2296;
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method1004(int arg0, int arg1, int arg2, int arg3) {
	if (arg2 > 0 && arg3 > 0) {
	    int i = anInt4813;
	    int i_79_ = anInt4812;
	    int i_80_ = 0;
	    int i_81_ = 0;
	    int i_82_ = anInt4825;
	    int i_83_ = anInt4815;
	    int i_84_ = (i_82_ << 16) / arg2;
	    int i_85_ = (i_83_ << 16) / arg3;
	    if (anInt4817 > 0) {
		int i_86_ = ((anInt4817 << 16) + i_84_ - 1) / i_84_;
		arg0 += i_86_;
		i_80_ += i_86_ * i_84_ - (anInt4817 << 16);
	    }
	    if (anInt4814 > 0) {
		int i_87_ = ((anInt4814 << 16) + i_85_ - 1) / i_85_;
		arg1 += i_87_;
		i_81_ += i_87_ * i_85_ - (anInt4814 << 16);
	    }
	    if (i < i_82_)
		arg2 = ((i << 16) - i_80_ + i_84_ - 1) / i_84_;
	    if (i_79_ < i_83_)
		arg3 = ((i_79_ << 16) - i_81_ + i_85_ - 1) / i_85_;
	    int i_88_ = arg0 + arg1 * Class121.anInt2296;
	    int i_89_ = Class121.anInt2296 - arg2;
	    if (arg1 + arg3 > Class121.anInt2297)
		arg3 -= arg1 + arg3 - Class121.anInt2297;
	    if (arg1 < Class121.anInt2295) {
		int i_90_ = Class121.anInt2295 - arg1;
		arg3 -= i_90_;
		i_88_ += i_90_ * Class121.anInt2296;
		i_81_ += i_85_ * i_90_;
	    }
	    if (arg0 + arg2 > Class121.anInt2301) {
		int i_91_ = arg0 + arg2 - Class121.anInt2301;
		arg2 -= i_91_;
		i_89_ += i_91_;
	    }
	    if (arg0 < Class121.anInt2298) {
		int i_92_ = Class121.anInt2298 - arg0;
		arg2 -= i_92_;
		i_88_ += i_92_;
		i_80_ += i_84_ * i_92_;
		i_89_ += i_92_;
	    }
	    method1021(Class121.anIntArray2300, anIntArray5149, 0, i_80_,
		       i_81_, i_88_, i_89_, arg2, arg3, i_84_, i_85_, i);
	}
    }
    
    public void method1023(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anIntArray5149.length; i++) {
	    int i_93_ = anIntArray5149[i];
	    if (i_93_ != 0) {
		int i_94_ = i_93_ >> 16 & 0xff;
		i_94_ += arg0;
		if (i_94_ < 1)
		    i_94_ = 1;
		else if (i_94_ > 255)
		    i_94_ = 255;
		int i_95_ = i_93_ >> 8 & 0xff;
		i_95_ += arg1;
		if (i_95_ < 1)
		    i_95_ = 1;
		else if (i_95_ > 255)
		    i_95_ = 255;
		int i_96_ = i_93_ & 0xff;
		i_96_ += arg2;
		if (i_96_ < 1)
		    i_96_ = 1;
		else if (i_96_ > 255)
		    i_96_ = 255;
		anIntArray5149[i] = (i_94_ << 16) + (i_95_ << 8) + i_96_;
	    }
	}
    }
    
    public void method1024() {
	int[] is = new int[anInt4813 * anInt4812];
	int i = 0;
	for (int i_97_ = 0; i_97_ < anInt4812; i_97_++) {
	    for (int i_98_ = anInt4813 - 1; i_98_ >= 0; i_98_--)
		is[i++] = anIntArray5149[i_98_ + i_97_ * anInt4813];
	}
	anIntArray5149 = is;
	anInt4817 = anInt4825 - anInt4813 - anInt4817;
    }
    
    public void method1007(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (arg2 > 0 && arg3 > 0) {
	    int i = anInt4813;
	    int i_99_ = anInt4812;
	    int i_100_ = 0;
	    int i_101_ = 0;
	    int i_102_ = anInt4825;
	    int i_103_ = anInt4815;
	    int i_104_ = (i_102_ << 16) / arg2;
	    int i_105_ = (i_103_ << 16) / arg3;
	    if (anInt4817 > 0) {
		int i_106_ = ((anInt4817 << 16) + i_104_ - 1) / i_104_;
		arg0 += i_106_;
		i_100_ += i_106_ * i_104_ - (anInt4817 << 16);
	    }
	    if (anInt4814 > 0) {
		int i_107_ = ((anInt4814 << 16) + i_105_ - 1) / i_105_;
		arg1 += i_107_;
		i_101_ += i_107_ * i_105_ - (anInt4814 << 16);
	    }
	    if (i < i_102_)
		arg2 = ((i << 16) - i_100_ + i_104_ - 1) / i_104_;
	    if (i_99_ < i_103_)
		arg3 = ((i_99_ << 16) - i_101_ + i_105_ - 1) / i_105_;
	    int i_108_ = arg0 + arg1 * Class121.anInt2296;
	    int i_109_ = Class121.anInt2296 - arg2;
	    if (arg1 + arg3 > Class121.anInt2297)
		arg3 -= arg1 + arg3 - Class121.anInt2297;
	    if (arg1 < Class121.anInt2295) {
		int i_110_ = Class121.anInt2295 - arg1;
		arg3 -= i_110_;
		i_108_ += i_110_ * Class121.anInt2296;
		i_101_ += i_105_ * i_110_;
	    }
	    if (arg0 + arg2 > Class121.anInt2301) {
		int i_111_ = arg0 + arg2 - Class121.anInt2301;
		arg2 -= i_111_;
		i_109_ += i_111_;
	    }
	    if (arg0 < Class121.anInt2298) {
		int i_112_ = Class121.anInt2298 - arg0;
		arg2 -= i_112_;
		i_108_ += i_112_;
		i_100_ += i_104_ * i_112_;
		i_109_ += i_112_;
	    }
	    method1009(Class121.anIntArray2300, anIntArray5149, 0, i_100_,
		       i_101_, i_108_, i_109_, arg2, arg3, i_104_, i_105_, i,
		       arg4);
	}
    }
    
    public void method1025(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, int[] arg8,
			   int[] arg9) {
	try {
	    int i = -arg2 / 2;
	    int i_113_ = -arg3 / 2;
	    int i_114_ = (int) (Math.sin((double) arg6 / 326.11) * 65536.0);
	    int i_115_ = (int) (Math.cos((double) arg6 / 326.11) * 65536.0);
	    i_114_ = i_114_ * arg7 >> 8;
	    i_115_ = i_115_ * arg7 >> 8;
	    int i_116_ = (arg4 << 16) + (i_113_ * i_114_ + i * i_115_);
	    int i_117_ = (arg5 << 16) + (i_113_ * i_115_ - i * i_114_);
	    int i_118_ = arg0 + arg1 * Class121.anInt2296;
	    for (arg1 = 0; arg1 < arg3; arg1++) {
		int i_119_ = arg8[arg1];
		int i_120_ = i_118_ + i_119_;
		int i_121_ = i_116_ + i_115_ * i_119_;
		int i_122_ = i_117_ - i_114_ * i_119_;
		for (arg0 = -arg9[arg1]; arg0 < 0; arg0++) {
		    Class121.anIntArray2300[i_120_++]
			= (anIntArray5149
			   [(i_121_ >> 16) + (i_122_ >> 16) * anInt4813]);
		    i_121_ += i_115_;
		    i_122_ -= i_114_;
		}
		i_116_ += i_114_;
		i_117_ += i_115_;
		i_118_ += Class121.anInt2296;
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method1000(int arg0, int arg1, int arg2) {
	arg0 += anInt4817;
	arg1 += anInt4814;
	int i = arg0 + arg1 * Class121.anInt2296;
	int i_123_ = 0;
	int i_124_ = anInt4812;
	int i_125_ = anInt4813;
	int i_126_ = Class121.anInt2296 - i_125_;
	int i_127_ = 0;
	if (arg1 < Class121.anInt2295) {
	    int i_128_ = Class121.anInt2295 - arg1;
	    i_124_ -= i_128_;
	    arg1 = Class121.anInt2295;
	    i_123_ += i_128_ * i_125_;
	    i += i_128_ * Class121.anInt2296;
	}
	if (arg1 + i_124_ > Class121.anInt2297)
	    i_124_ -= arg1 + i_124_ - Class121.anInt2297;
	if (arg0 < Class121.anInt2298) {
	    int i_129_ = Class121.anInt2298 - arg0;
	    i_125_ -= i_129_;
	    arg0 = Class121.anInt2298;
	    i_123_ += i_129_;
	    i += i_129_;
	    i_127_ += i_129_;
	    i_126_ += i_129_;
	}
	if (arg0 + i_125_ > Class121.anInt2301) {
	    int i_130_ = arg0 + i_125_ - Class121.anInt2301;
	    i_125_ -= i_130_;
	    i_127_ += i_130_;
	    i_126_ += i_130_;
	}
	if (i_125_ > 0 && i_124_ > 0)
	    method1018(Class121.anIntArray2300, anIntArray5149, 0, i_123_, i,
		       i_125_, i_124_, i_126_, i_127_, arg2);
    }
    
    public Class67_Sub5_Sub19_Sub1(int arg0, int arg1, int arg2, int arg3,
				   int arg4, int arg5, int[] arg6) {
	anInt4825 = arg0;
	anInt4815 = arg1;
	anInt4817 = arg2;
	anInt4814 = arg3;
	anInt4813 = arg4;
	anInt4812 = arg5;
	anIntArray5149 = arg6;
    }
    
    public void method1026(int arg0, int arg1, int[] arg2, int[] arg3) {
	if (Class121.anInt2297 - Class121.anInt2295 != arg2.length)
	    throw new IllegalStateException();
	arg0 += anInt4817;
	arg1 += anInt4814;
	int i = 0;
	int i_131_ = anInt4812;
	int i_132_ = anInt4813;
	int i_133_ = Class121.anInt2296 - i_132_;
	int i_134_ = 0;
	int i_135_ = arg0 + arg1 * Class121.anInt2296;
	if (arg1 < Class121.anInt2295) {
	    int i_136_ = Class121.anInt2295 - arg1;
	    i_131_ -= i_136_;
	    arg1 = Class121.anInt2295;
	    i += i_136_ * i_132_;
	    i_135_ += i_136_ * Class121.anInt2296;
	}
	if (arg1 + i_131_ > Class121.anInt2297)
	    i_131_ -= arg1 + i_131_ - Class121.anInt2297;
	if (arg0 < Class121.anInt2298) {
	    int i_137_ = Class121.anInt2298 - arg0;
	    i_132_ -= i_137_;
	    arg0 = Class121.anInt2298;
	    i += i_137_;
	    i_135_ += i_137_;
	    i_134_ += i_137_;
	    i_133_ += i_137_;
	}
	if (arg0 + i_132_ > Class121.anInt2301) {
	    int i_138_ = arg0 + i_132_ - Class121.anInt2301;
	    i_132_ -= i_138_;
	    i_134_ += i_138_;
	    i_133_ += i_138_;
	}
	if (i_132_ > 0 && i_131_ > 0) {
	    int i_139_ = arg0 - Class121.anInt2298;
	    int i_140_ = arg1 - Class121.anInt2295;
	    for (int i_141_ = i_140_; i_141_ < i_140_ + i_131_; i_141_++) {
		int i_142_ = arg2[i_141_];
		int i_143_ = arg3[i_141_];
		int i_144_ = i_132_;
		if (i_139_ > i_142_) {
		    int i_145_ = i_139_ - i_142_;
		    if (i_145_ >= i_143_) {
			i += i_132_ + i_134_;
			i_135_ += i_132_ + i_133_;
			continue;
		    }
		    i_143_ -= i_145_;
		} else {
		    int i_146_ = i_142_ - i_139_;
		    if (i_146_ >= i_132_) {
			i += i_132_ + i_134_;
			i_135_ += i_132_ + i_133_;
			continue;
		    }
		    i += i_146_;
		    i_144_ -= i_146_;
		    i_135_ += i_146_;
		}
		int i_147_ = 0;
		if (i_144_ < i_143_)
		    i_143_ = i_144_;
		else
		    i_147_ = i_144_ - i_143_;
		for (int i_148_ = -i_143_; i_148_ < 0; i_148_++) {
		    int i_149_ = anIntArray5149[i++];
		    if (i_149_ != 0)
			Class121.anIntArray2300[i_135_++] = i_149_;
		    else
			i_135_++;
		}
		i += i_147_ + i_134_;
		i_135_ += i_147_ + i_133_;
	    }
	}
    }
    
    public Class67_Sub5_Sub19_Sub1(int arg0, int arg1) {
	anIntArray5149 = new int[arg0 * arg1];
	anInt4813 = anInt4825 = arg0;
	anInt4812 = anInt4815 = arg1;
	anInt4817 = anInt4814 = 0;
    }
    
    public static void method1027(int[] arg0, int[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_150_ = -arg6; i_150_ < 0; i_150_++) {
	    for (int i_151_ = i; i_151_ < 0; i_151_++) {
		arg2 = arg1[arg3--];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3--];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3--];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3--];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_152_ = arg5; i_152_ < 0; i_152_++) {
		arg2 = arg1[arg3--];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method1002(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5) {
	if (arg5 != 0) {
	    arg0 -= anInt4817 << 4;
	    arg1 -= anInt4814 << 4;
	    double d = (double) (arg4 & 0xffff) * 9.587379924285257E-5;
	    int i = (int) Math.floor(Math.sin(d) * (double) arg5 + 0.5);
	    int i_153_ = (int) Math.floor(Math.cos(d) * (double) arg5 + 0.5);
	    int i_154_ = -arg0 * i_153_ + -arg1 * i;
	    int i_155_ = arg0 * i + -arg1 * i_153_;
	    int i_156_ = ((anInt4813 << 4) - arg0) * i_153_ + -arg1 * i;
	    int i_157_ = -((anInt4813 << 4) - arg0) * i + -arg1 * i_153_;
	    int i_158_ = -arg0 * i_153_ + ((anInt4812 << 4) - arg1) * i;
	    int i_159_ = arg0 * i + ((anInt4812 << 4) - arg1) * i_153_;
	    int i_160_ = (((anInt4813 << 4) - arg0) * i_153_
			  + ((anInt4812 << 4) - arg1) * i);
	    int i_161_ = (-((anInt4813 << 4) - arg0) * i
			  + ((anInt4812 << 4) - arg1) * i_153_);
	    int i_162_;
	    int i_163_;
	    if (i_154_ < i_156_) {
		i_162_ = i_154_;
		i_163_ = i_156_;
	    } else {
		i_162_ = i_156_;
		i_163_ = i_154_;
	    }
	    if (i_158_ < i_162_)
		i_162_ = i_158_;
	    if (i_160_ < i_162_)
		i_162_ = i_160_;
	    if (i_158_ > i_163_)
		i_163_ = i_158_;
	    if (i_160_ > i_163_)
		i_163_ = i_160_;
	    int i_164_;
	    int i_165_;
	    if (i_155_ < i_157_) {
		i_164_ = i_155_;
		i_165_ = i_157_;
	    } else {
		i_164_ = i_157_;
		i_165_ = i_155_;
	    }
	    if (i_159_ < i_164_)
		i_164_ = i_159_;
	    if (i_161_ < i_164_)
		i_164_ = i_161_;
	    if (i_159_ > i_165_)
		i_165_ = i_159_;
	    if (i_161_ > i_165_)
		i_165_ = i_161_;
	    i_162_ >>= 12;
	    i_163_ = i_163_ + 4095 >> 12;
	    i_164_ >>= 12;
	    i_165_ = i_165_ + 4095 >> 12;
	    i_162_ += arg2;
	    i_163_ += arg2;
	    i_164_ += arg3;
	    i_165_ += arg3;
	    i_162_ >>= 4;
	    i_163_ = i_163_ + 15 >> 4;
	    i_164_ >>= 4;
	    i_165_ = i_165_ + 15 >> 4;
	    if (i_162_ < Class121.anInt2298)
		i_162_ = Class121.anInt2298;
	    if (i_163_ > Class121.anInt2301)
		i_163_ = Class121.anInt2301;
	    if (i_164_ < Class121.anInt2295)
		i_164_ = Class121.anInt2295;
	    if (i_165_ > Class121.anInt2297)
		i_165_ = Class121.anInt2297;
	    i_163_ = i_162_ - i_163_;
	    if (i_163_ < 0) {
		i_165_ = i_164_ - i_165_;
		if (i_165_ < 0) {
		    int i_166_ = i_164_ * Class121.anInt2296 + i_162_;
		    double d_167_ = 1.6777216E7 / (double) arg5;
		    int i_168_ = (int) Math.floor(Math.sin(d) * d_167_ + 0.5);
		    int i_169_ = (int) Math.floor(Math.cos(d) * d_167_ + 0.5);
		    int i_170_ = (i_162_ << 4) + 8 - arg2;
		    int i_171_ = (i_164_ << 4) + 8 - arg3;
		    int i_172_ = (arg0 << 8) - (i_171_ * i_168_ >> 4);
		    int i_173_ = (arg1 << 8) + (i_171_ * i_169_ >> 4);
		    if (i_169_ == 0) {
			if (i_168_ == 0) {
			    int i_174_ = i_165_;
			    while (i_174_ < 0) {
				int i_175_ = i_166_;
				int i_176_ = i_172_;
				int i_177_ = i_173_;
				int i_178_ = i_163_;
				if (i_176_ >= 0 && i_177_ >= 0
				    && i_176_ - (anInt4813 << 12) < 0
				    && i_177_ - (anInt4812 << 12) < 0) {
				    for (/**/; i_178_ < 0; i_178_++) {
					int i_179_
					    = (anIntArray5149
					       [((i_177_ >> 12) * anInt4813
						 + (i_176_ >> 12))]);
					if (i_179_ != 0)
					    Class121.anIntArray2300[i_175_++]
						= i_179_;
					else
					    i_175_++;
				    }
				}
				i_174_++;
				i_166_ += Class121.anInt2296;
			    }
			} else if (i_168_ < 0) {
			    int i_180_ = i_165_;
			    while (i_180_ < 0) {
				int i_181_ = i_166_;
				int i_182_ = i_172_;
				int i_183_ = i_173_ + (i_170_ * i_168_ >> 4);
				int i_184_ = i_163_;
				if (i_182_ >= 0
				    && i_182_ - (anInt4813 << 12) < 0) {
				    int i_185_;
				    if ((i_185_ = i_183_ - (anInt4812 << 12))
					>= 0) {
					i_185_ = (i_168_ - i_185_) / i_168_;
					i_184_ += i_185_;
					i_183_ += i_168_ * i_185_;
					i_181_ += i_185_;
				    }
				    if ((i_185_ = (i_183_ - i_168_) / i_168_)
					> i_184_)
					i_184_ = i_185_;
				    for (/**/; i_184_ < 0; i_184_++) {
					int i_186_
					    = (anIntArray5149
					       [((i_183_ >> 12) * anInt4813
						 + (i_182_ >> 12))]);
					if (i_186_ != 0)
					    Class121.anIntArray2300[i_181_++]
						= i_186_;
					else
					    i_181_++;
					i_183_ += i_168_;
				    }
				}
				i_180_++;
				i_172_ -= i_168_;
				i_166_ += Class121.anInt2296;
			    }
			} else {
			    int i_187_ = i_165_;
			    while (i_187_ < 0) {
				int i_188_ = i_166_;
				int i_189_ = i_172_;
				int i_190_ = i_173_ + (i_170_ * i_168_ >> 4);
				int i_191_ = i_163_;
				if (i_189_ >= 0
				    && i_189_ - (anInt4813 << 12) < 0) {
				    if (i_190_ < 0) {
					int i_192_
					    = (i_168_ - 1 - i_190_) / i_168_;
					i_191_ += i_192_;
					i_190_ += i_168_ * i_192_;
					i_188_ += i_192_;
				    }
				    int i_193_;
				    if ((i_193_
					 = (1 + i_190_ - (anInt4812 << 12)
					    - i_168_) / i_168_)
					> i_191_)
					i_191_ = i_193_;
				    for (/**/; i_191_ < 0; i_191_++) {
					int i_194_
					    = (anIntArray5149
					       [((i_190_ >> 12) * anInt4813
						 + (i_189_ >> 12))]);
					if (i_194_ != 0)
					    Class121.anIntArray2300[i_188_++]
						= i_194_;
					else
					    i_188_++;
					i_190_ += i_168_;
				    }
				}
				i_187_++;
				i_172_ -= i_168_;
				i_166_ += Class121.anInt2296;
			    }
			}
		    } else if (i_169_ < 0) {
			if (i_168_ == 0) {
			    int i_195_ = i_165_;
			    while (i_195_ < 0) {
				int i_196_ = i_166_;
				int i_197_ = i_172_ + (i_170_ * i_169_ >> 4);
				int i_198_ = i_173_;
				int i_199_ = i_163_;
				if (i_198_ >= 0
				    && i_198_ - (anInt4812 << 12) < 0) {
				    int i_200_;
				    if ((i_200_ = i_197_ - (anInt4813 << 12))
					>= 0) {
					i_200_ = (i_169_ - i_200_) / i_169_;
					i_199_ += i_200_;
					i_197_ += i_169_ * i_200_;
					i_196_ += i_200_;
				    }
				    if ((i_200_ = (i_197_ - i_169_) / i_169_)
					> i_199_)
					i_199_ = i_200_;
				    for (/**/; i_199_ < 0; i_199_++) {
					int i_201_
					    = (anIntArray5149
					       [((i_198_ >> 12) * anInt4813
						 + (i_197_ >> 12))]);
					if (i_201_ != 0)
					    Class121.anIntArray2300[i_196_++]
						= i_201_;
					else
					    i_196_++;
					i_197_ += i_169_;
				    }
				}
				i_195_++;
				i_173_ += i_169_;
				i_166_ += Class121.anInt2296;
			    }
			} else if (i_168_ < 0) {
			    int i_202_ = i_165_;
			    while (i_202_ < 0) {
				int i_203_ = i_166_;
				int i_204_ = i_172_ + (i_170_ * i_169_ >> 4);
				int i_205_ = i_173_ + (i_170_ * i_168_ >> 4);
				int i_206_ = i_163_;
				int i_207_;
				if ((i_207_ = i_204_ - (anInt4813 << 12))
				    >= 0) {
				    i_207_ = (i_169_ - i_207_) / i_169_;
				    i_206_ += i_207_;
				    i_204_ += i_169_ * i_207_;
				    i_205_ += i_168_ * i_207_;
				    i_203_ += i_207_;
				}
				if ((i_207_ = (i_204_ - i_169_) / i_169_)
				    > i_206_)
				    i_206_ = i_207_;
				if ((i_207_ = i_205_ - (anInt4812 << 12))
				    >= 0) {
				    i_207_ = (i_168_ - i_207_) / i_168_;
				    i_206_ += i_207_;
				    i_204_ += i_169_ * i_207_;
				    i_205_ += i_168_ * i_207_;
				    i_203_ += i_207_;
				}
				if ((i_207_ = (i_205_ - i_168_) / i_168_)
				    > i_206_)
				    i_206_ = i_207_;
				for (/**/; i_206_ < 0; i_206_++) {
				    int i_208_ = (anIntArray5149
						  [((i_205_ >> 12) * anInt4813
						    + (i_204_ >> 12))]);
				    if (i_208_ != 0)
					Class121.anIntArray2300[i_203_++]
					    = i_208_;
				    else
					i_203_++;
				    i_204_ += i_169_;
				    i_205_ += i_168_;
				}
				i_202_++;
				i_172_ -= i_168_;
				i_173_ += i_169_;
				i_166_ += Class121.anInt2296;
			    }
			} else {
			    int i_209_ = i_165_;
			    while (i_209_ < 0) {
				int i_210_ = i_166_;
				int i_211_ = i_172_ + (i_170_ * i_169_ >> 4);
				int i_212_ = i_173_ + (i_170_ * i_168_ >> 4);
				int i_213_ = i_163_;
				int i_214_;
				if ((i_214_ = i_211_ - (anInt4813 << 12))
				    >= 0) {
				    i_214_ = (i_169_ - i_214_) / i_169_;
				    i_213_ += i_214_;
				    i_211_ += i_169_ * i_214_;
				    i_212_ += i_168_ * i_214_;
				    i_210_ += i_214_;
				}
				if ((i_214_ = (i_211_ - i_169_) / i_169_)
				    > i_213_)
				    i_213_ = i_214_;
				if (i_212_ < 0) {
				    i_214_ = (i_168_ - 1 - i_212_) / i_168_;
				    i_213_ += i_214_;
				    i_211_ += i_169_ * i_214_;
				    i_212_ += i_168_ * i_214_;
				    i_210_ += i_214_;
				}
				if ((i_214_ = (1 + i_212_ - (anInt4812 << 12)
					       - i_168_) / i_168_)
				    > i_213_)
				    i_213_ = i_214_;
				for (/**/; i_213_ < 0; i_213_++) {
				    int i_215_ = (anIntArray5149
						  [((i_212_ >> 12) * anInt4813
						    + (i_211_ >> 12))]);
				    if (i_215_ != 0)
					Class121.anIntArray2300[i_210_++]
					    = i_215_;
				    else
					i_210_++;
				    i_211_ += i_169_;
				    i_212_ += i_168_;
				}
				i_209_++;
				i_172_ -= i_168_;
				i_173_ += i_169_;
				i_166_ += Class121.anInt2296;
			    }
			}
		    } else if (i_168_ == 0) {
			int i_216_ = i_165_;
			while (i_216_ < 0) {
			    int i_217_ = i_166_;
			    int i_218_ = i_172_ + (i_170_ * i_169_ >> 4);
			    int i_219_ = i_173_;
			    int i_220_ = i_163_;
			    if (i_219_ >= 0
				&& i_219_ - (anInt4812 << 12) < 0) {
				if (i_218_ < 0) {
				    int i_221_
					= (i_169_ - 1 - i_218_) / i_169_;
				    i_220_ += i_221_;
				    i_218_ += i_169_ * i_221_;
				    i_217_ += i_221_;
				}
				int i_222_;
				if ((i_222_ = (1 + i_218_ - (anInt4813 << 12)
					       - i_169_) / i_169_)
				    > i_220_)
				    i_220_ = i_222_;
				for (/**/; i_220_ < 0; i_220_++) {
				    int i_223_ = (anIntArray5149
						  [((i_219_ >> 12) * anInt4813
						    + (i_218_ >> 12))]);
				    if (i_223_ != 0)
					Class121.anIntArray2300[i_217_++]
					    = i_223_;
				    else
					i_217_++;
				    i_218_ += i_169_;
				}
			    }
			    i_216_++;
			    i_173_ += i_169_;
			    i_166_ += Class121.anInt2296;
			}
		    } else if (i_168_ < 0) {
			int i_224_ = i_165_;
			while (i_224_ < 0) {
			    int i_225_ = i_166_;
			    int i_226_ = i_172_ + (i_170_ * i_169_ >> 4);
			    int i_227_ = i_173_ + (i_170_ * i_168_ >> 4);
			    int i_228_ = i_163_;
			    if (i_226_ < 0) {
				int i_229_ = (i_169_ - 1 - i_226_) / i_169_;
				i_228_ += i_229_;
				i_226_ += i_169_ * i_229_;
				i_227_ += i_168_ * i_229_;
				i_225_ += i_229_;
			    }
			    int i_230_;
			    if ((i_230_ = (1 + i_226_ - (anInt4813 << 12)
					   - i_169_) / i_169_)
				> i_228_)
				i_228_ = i_230_;
			    if ((i_230_ = i_227_ - (anInt4812 << 12)) >= 0) {
				i_230_ = (i_168_ - i_230_) / i_168_;
				i_228_ += i_230_;
				i_226_ += i_169_ * i_230_;
				i_227_ += i_168_ * i_230_;
				i_225_ += i_230_;
			    }
			    if ((i_230_ = (i_227_ - i_168_) / i_168_) > i_228_)
				i_228_ = i_230_;
			    for (/**/; i_228_ < 0; i_228_++) {
				int i_231_
				    = (anIntArray5149
				       [(i_227_ >> 12) * anInt4813 + (i_226_
								      >> 12)]);
				if (i_231_ != 0)
				    Class121.anIntArray2300[i_225_++] = i_231_;
				else
				    i_225_++;
				i_226_ += i_169_;
				i_227_ += i_168_;
			    }
			    i_224_++;
			    i_172_ -= i_168_;
			    i_173_ += i_169_;
			    i_166_ += Class121.anInt2296;
			}
		    } else {
			int i_232_ = i_165_;
			while (i_232_ < 0) {
			    int i_233_ = i_166_;
			    int i_234_ = i_172_ + (i_170_ * i_169_ >> 4);
			    int i_235_ = i_173_ + (i_170_ * i_168_ >> 4);
			    int i_236_ = i_163_;
			    if (i_234_ < 0) {
				int i_237_ = (i_169_ - 1 - i_234_) / i_169_;
				i_236_ += i_237_;
				i_234_ += i_169_ * i_237_;
				i_235_ += i_168_ * i_237_;
				i_233_ += i_237_;
			    }
			    int i_238_;
			    if ((i_238_ = (1 + i_234_ - (anInt4813 << 12)
					   - i_169_) / i_169_)
				> i_236_)
				i_236_ = i_238_;
			    if (i_235_ < 0) {
				i_238_ = (i_168_ - 1 - i_235_) / i_168_;
				i_236_ += i_238_;
				i_234_ += i_169_ * i_238_;
				i_235_ += i_168_ * i_238_;
				i_233_ += i_238_;
			    }
			    if ((i_238_ = (1 + i_235_ - (anInt4812 << 12)
					   - i_168_) / i_168_)
				> i_236_)
				i_236_ = i_238_;
			    for (/**/; i_236_ < 0; i_236_++) {
				int i_239_
				    = (anIntArray5149
				       [(i_235_ >> 12) * anInt4813 + (i_234_
								      >> 12)]);
				if (i_239_ != 0)
				    Class121.anIntArray2300[i_233_++] = i_239_;
				else
				    i_233_++;
				i_234_ += i_169_;
				i_235_ += i_168_;
			    }
			    i_232_++;
			    i_172_ -= i_168_;
			    i_173_ += i_169_;
			    i_166_ += Class121.anInt2296;
			}
		    }
		}
	    }
	}
    }
}
