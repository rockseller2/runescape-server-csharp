public class Class121
{
    public static int[] anIntArray2294;
    public static int anInt2295 = 0;
    public static int anInt2296;
    public static int anInt2297;
    public static int anInt2298 = 0;
    public static int[] anIntArray2299;
    public static int[] anIntArray2300;
    public static int anInt2301;
    public static int anInt2302;
    
    public static void method1670() {
	anIntArray2300 = null;
	anIntArray2299 = null;
	anIntArray2294 = null;
    }
    
    public static void method1671(int arg0, int arg1, int arg2, int[] arg3,
				  int[] arg4) {
	int i = arg0 + arg1 * anInt2296;
	for (arg1 = 0; arg1 < arg3.length; arg1++) {
	    int i_0_ = i + arg3[arg1];
	    for (arg0 = -arg4[arg1]; arg0 < 0; arg0++)
		anIntArray2300[i_0_++] = arg2;
	    i += anInt2296;
	}
    }
    
    public static void method1672() {
	int i = 0;
	int i_1_ = anInt2296 * anInt2302 - 7;
	while (i < i_1_) {
	    anIntArray2300[i++] = 0;
	    anIntArray2300[i++] = 0;
	    anIntArray2300[i++] = 0;
	    anIntArray2300[i++] = 0;
	    anIntArray2300[i++] = 0;
	    anIntArray2300[i++] = 0;
	    anIntArray2300[i++] = 0;
	    anIntArray2300[i++] = 0;
	}
	i_1_ += 7;
	while (i < i_1_)
	    anIntArray2300[i++] = 0;
    }
    
    public static void method1673(int arg0, int arg1, int arg2, int arg3) {
	if (anInt2298 < arg0)
	    anInt2298 = arg0;
	if (anInt2295 < arg1)
	    anInt2295 = arg1;
	if (anInt2301 > arg2)
	    anInt2301 = arg2;
	if (anInt2297 > arg3)
	    anInt2297 = arg3;
	method1693();
    }
    
    public static void method1674(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	if (arg4 != 0) {
	    if (arg4 == 256)
		method1688(arg0, arg1, arg2, arg3);
	    else {
		if (arg2 < 0)
		    arg2 = -arg2;
		int i = 256 - arg4;
		int i_2_ = (arg3 >> 16 & 0xff) * arg4;
		int i_3_ = (arg3 >> 8 & 0xff) * arg4;
		int i_4_ = (arg3 & 0xff) * arg4;
		int i_5_ = arg1 - arg2;
		if (i_5_ < anInt2295)
		    i_5_ = anInt2295;
		int i_6_ = arg1 + arg2 + 1;
		if (i_6_ > anInt2297)
		    i_6_ = anInt2297;
		int i_7_ = i_5_;
		int i_8_ = arg2 * arg2;
		int i_9_ = 0;
		int i_10_ = arg1 - i_7_;
		int i_11_ = i_10_ * i_10_;
		int i_12_ = i_11_ - i_10_;
		if (arg1 > i_6_)
		    arg1 = i_6_;
		while (i_7_ < arg1) {
		    for (/**/; i_12_ <= i_8_ || i_11_ <= i_8_;
			 i_12_ += i_9_++ + i_9_)
			i_11_ += i_9_ + i_9_;
		    int i_13_ = arg0 - i_9_ + 1;
		    if (i_13_ < anInt2298)
			i_13_ = anInt2298;
		    int i_14_ = arg0 + i_9_;
		    if (i_14_ > anInt2301)
			i_14_ = anInt2301;
		    int i_15_ = i_13_ + i_7_ * anInt2296;
		    for (int i_16_ = i_13_; i_16_ < i_14_; i_16_++) {
			int i_17_ = (anIntArray2300[i_15_] >> 16 & 0xff) * i;
			int i_18_ = (anIntArray2300[i_15_] >> 8 & 0xff) * i;
			int i_19_ = (anIntArray2300[i_15_] & 0xff) * i;
			int i_20_ = ((i_2_ + i_17_ >> 8 << 16)
				     + (i_3_ + i_18_ >> 8 << 8)
				     + (i_4_ + i_19_ >> 8));
			anIntArray2300[i_15_++] = i_20_;
		    }
		    i_7_++;
		    i_11_ -= i_10_-- + i_10_;
		    i_12_ -= i_10_ + i_10_;
		}
		i_9_ = arg2;
		i_10_ = -i_10_;
		i_12_ = i_10_ * i_10_ + i_8_;
		i_11_ = i_12_ - i_9_;
		i_12_ -= i_10_;
		while (i_7_ < i_6_) {
		    for (/**/; i_12_ > i_8_ && i_11_ > i_8_;
			 i_11_ -= i_9_ + i_9_)
			i_12_ -= i_9_-- + i_9_;
		    int i_21_ = arg0 - i_9_;
		    if (i_21_ < anInt2298)
			i_21_ = anInt2298;
		    int i_22_ = arg0 + i_9_;
		    if (i_22_ > anInt2301 - 1)
			i_22_ = anInt2301 - 1;
		    int i_23_ = i_21_ + i_7_ * anInt2296;
		    for (int i_24_ = i_21_; i_24_ <= i_22_; i_24_++) {
			int i_25_ = (anIntArray2300[i_23_] >> 16 & 0xff) * i;
			int i_26_ = (anIntArray2300[i_23_] >> 8 & 0xff) * i;
			int i_27_ = (anIntArray2300[i_23_] & 0xff) * i;
			int i_28_ = ((i_2_ + i_25_ >> 8 << 16)
				     + (i_3_ + i_26_ >> 8 << 8)
				     + (i_4_ + i_27_ >> 8));
			anIntArray2300[i_23_++] = i_28_;
		    }
		    i_7_++;
		    i_12_ += i_10_ + i_10_;
		    i_11_ += i_10_++ + i_10_;
		}
	    }
	}
    }
    
    public static void method1675(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	if (arg1 >= anInt2295 && arg1 < anInt2297) {
	    if (arg0 < anInt2298) {
		arg2 -= anInt2298 - arg0;
		arg0 = anInt2298;
	    }
	    if (arg0 + arg2 > anInt2301)
		arg2 = anInt2301 - arg0;
	    int i = 256 - arg4;
	    int i_29_ = (arg3 >> 16 & 0xff) * arg4;
	    int i_30_ = (arg3 >> 8 & 0xff) * arg4;
	    int i_31_ = (arg3 & 0xff) * arg4;
	    int i_32_ = arg0 + arg1 * anInt2296;
	    for (int i_33_ = 0; i_33_ < arg2; i_33_++) {
		int i_34_ = (anIntArray2300[i_32_] >> 16 & 0xff) * i;
		int i_35_ = (anIntArray2300[i_32_] >> 8 & 0xff) * i;
		int i_36_ = (anIntArray2300[i_32_] & 0xff) * i;
		int i_37_
		    = ((i_29_ + i_34_ >> 8 << 16) + (i_30_ + i_35_ >> 8 << 8)
		       + (i_31_ + i_36_ >> 8));
		anIntArray2300[i_32_++] = i_37_;
	    }
	}
    }
    
    public static void method1676(int arg0, int arg1, int arg2) {
	if (arg0 >= anInt2298 && arg1 >= anInt2295 && arg0 < anInt2301
	    && arg1 < anInt2297)
	    anIntArray2300[arg0 + arg1 * anInt2296] = arg2;
    }
    
    public static void method1677(int[] arg0) {
	anInt2298 = arg0[0];
	anInt2295 = arg0[1];
	anInt2301 = arg0[2];
	anInt2297 = arg0[3];
	method1693();
    }
    
    public static void method1678(int[] arg0, int[] arg1) {
	if (arg0.length != anInt2297 - anInt2295
	    || arg1.length != anInt2297 - anInt2295)
	    throw new IllegalArgumentException();
	anIntArray2299 = arg0;
	anIntArray2294 = arg1;
    }
    
    public static void method1679() {
	anInt2298 = 0;
	anInt2295 = 0;
	anInt2301 = anInt2296;
	anInt2297 = anInt2302;
	method1693();
    }
    
    public static void method1680(int[] arg0) {
	arg0[0] = anInt2298;
	arg0[1] = anInt2295;
	arg0[2] = anInt2301;
	arg0[3] = anInt2297;
    }
    
    public static void method1681(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	method1690(arg0, arg1, arg2, arg4);
	method1690(arg0, arg1 + arg3 - 1, arg2, arg4);
	method1692(arg0, arg1, arg3, arg4);
	method1692(arg0 + arg2 - 1, arg1, arg3, arg4);
    }
    
    public static void method1682(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	int i = arg2 - arg0;
	int i_38_ = arg3 - arg1;
	int i_39_ = i >= 0 ? i : -i;
	int i_40_ = i_38_ >= 0 ? i_38_ : -i_38_;
	int i_41_ = i_39_;
	if (i_41_ < i_40_)
	    i_41_ = i_40_;
	if (i_41_ != 0) {
	    int i_42_ = (i << 16) / i_41_;
	    int i_43_ = (i_38_ << 16) / i_41_;
	    if (i_43_ <= i_42_)
		i_42_ = -i_42_;
	    else
		i_43_ = -i_43_;
	    int i_44_ = arg5 * i_43_ >> 17;
	    int i_45_ = arg5 * i_43_ + 1 >> 17;
	    int i_46_ = arg5 * i_42_ >> 17;
	    int i_47_ = arg5 * i_42_ + 1 >> 17;
	    arg0 -= Class26.method246();
	    arg1 -= Class26.method238();
	    int i_48_ = arg0 + i_44_;
	    int i_49_ = arg0 - i_45_;
	    int i_50_ = arg0 + i - i_45_;
	    int i_51_ = arg0 + i + i_44_;
	    int i_52_ = arg1 + i_46_;
	    int i_53_ = arg1 - i_47_;
	    int i_54_ = arg1 + i_38_ - i_47_;
	    int i_55_ = arg1 + i_38_ + i_46_;
	    Class26.method247(i_48_, i_49_, i_50_);
	    Class26.method249(i_52_, i_53_, i_54_, i_48_, i_49_, i_50_, arg4);
	    Class26.method247(i_48_, i_50_, i_51_);
	    Class26.method249(i_52_, i_54_, i_55_, i_48_, i_50_, i_51_, arg4);
	}
    }
    
    public static void method1683(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	if (arg0 < anInt2298) {
	    arg2 -= anInt2298 - arg0;
	    arg0 = anInt2298;
	}
	if (arg1 < anInt2295) {
	    arg3 -= anInt2295 - arg1;
	    arg1 = anInt2295;
	}
	if (arg0 + arg2 > anInt2301)
	    arg2 = anInt2301 - arg0;
	if (arg1 + arg3 > anInt2297)
	    arg3 = anInt2297 - arg1;
	int i = anInt2296 - arg2;
	int i_56_ = arg0 + arg1 * anInt2296;
	for (int i_57_ = -arg3; i_57_ < 0; i_57_++) {
	    for (int i_58_ = -arg2; i_58_ < 0; i_58_++)
		anIntArray2300[i_56_++] = arg4;
	    i_56_ += i;
	}
    }
    
    public static void method1684(int[] arg0, int arg1, int arg2) {
	anIntArray2300 = arg0;
	anInt2296 = arg1;
	anInt2302 = arg2;
	method1685(0, 0, arg1, arg2);
    }
    
    public static void method1685(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 < 0)
	    arg0 = 0;
	if (arg1 < 0)
	    arg1 = 0;
	if (arg2 > anInt2296)
	    arg2 = anInt2296;
	if (arg3 > anInt2302)
	    arg3 = anInt2302;
	anInt2298 = arg0;
	anInt2295 = arg1;
	anInt2301 = arg2;
	anInt2297 = arg3;
	method1693();
    }
    
    public static void method1686(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	if (arg0 < anInt2298) {
	    arg2 -= anInt2298 - arg0;
	    arg0 = anInt2298;
	}
	if (arg1 < anInt2295) {
	    arg3 -= anInt2295 - arg1;
	    arg1 = anInt2295;
	}
	if (arg0 + arg2 > anInt2301)
	    arg2 = anInt2301 - arg0;
	if (arg1 + arg3 > anInt2297)
	    arg3 = anInt2297 - arg1;
	arg4 = (((arg4 & 0xff00ff) * arg5 >> 8 & 0xff00ff)
		+ ((arg4 & 0xff00) * arg5 >> 8 & 0xff00));
	int i = 256 - arg5;
	int i_59_ = anInt2296 - arg2;
	int i_60_ = arg0 + arg1 * anInt2296;
	for (int i_61_ = 0; i_61_ < arg3; i_61_++) {
	    for (int i_62_ = -arg2; i_62_ < 0; i_62_++) {
		int i_63_ = anIntArray2300[i_60_];
		i_63_ = (((i_63_ & 0xff00ff) * i >> 8 & 0xff00ff)
			 + ((i_63_ & 0xff00) * i >> 8 & 0xff00));
		anIntArray2300[i_60_++] = arg4 + i_63_;
	    }
	    i_60_ += i_59_;
	}
    }
    
    public static void method1687(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	if (arg0 >= anInt2298 && arg0 < anInt2301) {
	    if (arg1 < anInt2295) {
		arg2 -= anInt2295 - arg1;
		arg1 = anInt2295;
	    }
	    if (arg1 + arg2 > anInt2297)
		arg2 = anInt2297 - arg1;
	    int i = 256 - arg4;
	    int i_64_ = (arg3 >> 16 & 0xff) * arg4;
	    int i_65_ = (arg3 >> 8 & 0xff) * arg4;
	    int i_66_ = (arg3 & 0xff) * arg4;
	    int i_67_ = arg0 + arg1 * anInt2296;
	    for (int i_68_ = 0; i_68_ < arg2; i_68_++) {
		int i_69_ = (anIntArray2300[i_67_] >> 16 & 0xff) * i;
		int i_70_ = (anIntArray2300[i_67_] >> 8 & 0xff) * i;
		int i_71_ = (anIntArray2300[i_67_] & 0xff) * i;
		int i_72_
		    = ((i_64_ + i_69_ >> 8 << 16) + (i_65_ + i_70_ >> 8 << 8)
		       + (i_66_ + i_71_ >> 8));
		anIntArray2300[i_67_] = i_72_;
		i_67_ += anInt2296;
	    }
	}
    }
    
    public static void method1688(int arg0, int arg1, int arg2, int arg3) {
	if (arg2 == 0)
	    method1676(arg0, arg1, arg3);
	else {
	    if (arg2 < 0)
		arg2 = -arg2;
	    int i = arg1 - arg2;
	    if (i < anInt2295)
		i = anInt2295;
	    int i_73_ = arg1 + arg2 + 1;
	    if (i_73_ > anInt2297)
		i_73_ = anInt2297;
	    int i_74_ = i;
	    int i_75_ = arg2 * arg2;
	    int i_76_ = 0;
	    int i_77_ = arg1 - i_74_;
	    int i_78_ = i_77_ * i_77_;
	    int i_79_ = i_78_ - i_77_;
	    if (arg1 > i_73_)
		arg1 = i_73_;
	    while (i_74_ < arg1) {
		for (/**/; i_79_ <= i_75_ || i_78_ <= i_75_;
		     i_79_ += i_76_++ + i_76_)
		    i_78_ += i_76_ + i_76_;
		int i_80_ = arg0 - i_76_ + 1;
		if (i_80_ < anInt2298)
		    i_80_ = anInt2298;
		int i_81_ = arg0 + i_76_;
		if (i_81_ > anInt2301)
		    i_81_ = anInt2301;
		int i_82_ = i_80_ + i_74_ * anInt2296;
		for (int i_83_ = i_80_; i_83_ < i_81_; i_83_++)
		    anIntArray2300[i_82_++] = arg3;
		i_74_++;
		i_78_ -= i_77_-- + i_77_;
		i_79_ -= i_77_ + i_77_;
	    }
	    i_76_ = arg2;
	    i_77_ = i_74_ - arg1;
	    i_79_ = i_77_ * i_77_ + i_75_;
	    i_78_ = i_79_ - i_76_;
	    i_79_ -= i_77_;
	    while (i_74_ < i_73_) {
		for (/**/; i_79_ > i_75_ && i_78_ > i_75_;
		     i_78_ -= i_76_ + i_76_)
		    i_79_ -= i_76_-- + i_76_;
		int i_84_ = arg0 - i_76_;
		if (i_84_ < anInt2298)
		    i_84_ = anInt2298;
		int i_85_ = arg0 + i_76_;
		if (i_85_ > anInt2301 - 1)
		    i_85_ = anInt2301 - 1;
		int i_86_ = i_84_ + i_74_ * anInt2296;
		for (int i_87_ = i_84_; i_87_ <= i_85_; i_87_++)
		    anIntArray2300[i_86_++] = arg3;
		i_74_++;
		i_79_ += i_77_ + i_77_;
		i_78_ += i_77_++ + i_77_;
	    }
	}
    }
    
    public static void method1689(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	method1675(arg0, arg1, arg2, arg4, arg5);
	method1675(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
	if (arg3 >= 3) {
	    method1687(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
	    method1687(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}
    }
    
    public static void method1690(int arg0, int arg1, int arg2, int arg3) {
	if (arg1 >= anInt2295 && arg1 < anInt2297) {
	    if (arg0 < anInt2298) {
		arg2 -= anInt2298 - arg0;
		arg0 = anInt2298;
	    }
	    if (arg0 + arg2 > anInt2301)
		arg2 = anInt2301 - arg0;
	    int i = arg0 + arg1 * anInt2296;
	    for (int i_88_ = 0; i_88_ < arg2; i_88_++)
		anIntArray2300[i + i_88_] = arg3;
	}
    }
    
    public static void method1691(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	arg2 -= arg0;
	arg3 -= arg1;
	if (arg3 == 0) {
	    if (arg2 >= 0)
		method1690(arg0, arg1, arg2 + 1, arg4);
	    else
		method1690(arg0 + arg2, arg1, -arg2 + 1, arg4);
	} else if (arg2 == 0) {
	    if (arg3 >= 0)
		method1692(arg0, arg1, arg3 + 1, arg4);
	    else
		method1692(arg0, arg1 + arg3, -arg3 + 1, arg4);
	} else {
	    if (arg2 + arg3 < 0) {
		arg0 += arg2;
		arg2 = -arg2;
		arg1 += arg3;
		arg3 = -arg3;
	    }
	    if (arg2 > arg3) {
		arg1 <<= 16;
		arg1 += 32768;
		arg3 <<= 16;
		int i = (int) Math.floor((double) arg3 / (double) arg2 + 0.5);
		arg2 += arg0;
		if (arg0 < anInt2298) {
		    arg1 += i * (anInt2298 - arg0);
		    arg0 = anInt2298;
		}
		if (arg2 >= anInt2301)
		    arg2 = anInt2301 - 1;
		for (/**/; arg0 <= arg2; arg0++) {
		    int i_89_ = arg1 >> 16;
		    if (i_89_ >= anInt2295 && i_89_ < anInt2297)
			anIntArray2300[arg0 + i_89_ * anInt2296] = arg4;
		    arg1 += i;
		}
	    } else {
		arg0 <<= 16;
		arg0 += 32768;
		arg2 <<= 16;
		int i = (int) Math.floor((double) arg2 / (double) arg3 + 0.5);
		arg3 += arg1;
		if (arg1 < anInt2295) {
		    arg0 += i * (anInt2295 - arg1);
		    arg1 = anInt2295;
		}
		if (arg3 >= anInt2297)
		    arg3 = anInt2297 - 1;
		for (/**/; arg1 <= arg3; arg1++) {
		    int i_90_ = arg0 >> 16;
		    if (i_90_ >= anInt2298 && i_90_ < anInt2301)
			anIntArray2300[i_90_ + arg1 * anInt2296] = arg4;
		    arg0 += i;
		}
	    }
	}
    }
    
    public static void method1692(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 >= anInt2298 && arg0 < anInt2301) {
	    if (arg1 < anInt2295) {
		arg2 -= anInt2295 - arg1;
		arg1 = anInt2295;
	    }
	    if (arg1 + arg2 > anInt2297)
		arg2 = anInt2297 - arg1;
	    int i = arg0 + arg1 * anInt2296;
	    for (int i_91_ = 0; i_91_ < arg2; i_91_++)
		anIntArray2300[i + i_91_ * anInt2296] = arg3;
	}
    }
    
    public static void method1693() {
	anIntArray2299 = null;
	anIntArray2294 = null;
    }
    
    static {
	anInt2297 = 0;
	anInt2301 = 0;
    }
}
