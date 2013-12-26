public class Class119_Sub1 extends Class119
{
    public byte[] aByteArray3410;
    public int[] anIntArray3411;
    
    public void method1647(int arg0, int arg1, int arg2, int arg3) {
	int i = anInt2252;
	int i_0_ = anInt2254;
	int i_1_ = 0;
	int i_2_ = 0;
	int i_3_ = anInt2255;
	int i_4_ = anInt2243;
	int i_5_ = (i_3_ << 16) / arg2;
	int i_6_ = (i_4_ << 16) / arg3;
	if (anInt2242 > 0) {
	    int i_7_ = ((anInt2242 << 16) + i_5_ - 1) / i_5_;
	    arg0 += i_7_;
	    i_1_ += i_7_ * i_5_ - (anInt2242 << 16);
	}
	if (anInt2250 > 0) {
	    int i_8_ = ((anInt2250 << 16) + i_6_ - 1) / i_6_;
	    arg1 += i_8_;
	    i_2_ += i_8_ * i_6_ - (anInt2250 << 16);
	}
	if (i < i_3_)
	    arg2 = ((i << 16) - i_1_ + i_5_ - 1) / i_5_;
	if (i_0_ < i_4_)
	    arg3 = ((i_0_ << 16) - i_2_ + i_6_ - 1) / i_6_;
	int i_9_ = arg0 + arg1 * Class121.anInt2296;
	int i_10_ = Class121.anInt2296 - arg2;
	if (arg1 + arg3 > Class121.anInt2297)
	    arg3 -= arg1 + arg3 - Class121.anInt2297;
	if (arg1 < Class121.anInt2295) {
	    int i_11_ = Class121.anInt2295 - arg1;
	    arg3 -= i_11_;
	    i_9_ += i_11_ * Class121.anInt2296;
	    i_2_ += i_6_ * i_11_;
	}
	if (arg0 + arg2 > Class121.anInt2301) {
	    int i_12_ = arg0 + arg2 - Class121.anInt2301;
	    arg2 -= i_12_;
	    i_10_ += i_12_;
	}
	if (arg0 < Class121.anInt2298) {
	    int i_13_ = Class121.anInt2298 - arg0;
	    arg2 -= i_13_;
	    i_9_ += i_13_;
	    i_1_ += i_5_ * i_13_;
	    i_10_ += i_13_;
	}
	method1653(Class121.anIntArray2300, aByteArray3410, anIntArray3411,
		   i_1_, i_2_, i_9_, i_10_, arg2, arg3, i_5_, i_6_, i);
    }
    
    public void method1648(int arg0, int arg1, int arg2, int arg3, int arg4) {
	int i = anInt2252;
	int i_14_ = anInt2254;
	int i_15_ = 0;
	int i_16_ = 0;
	int i_17_ = anInt2255;
	int i_18_ = anInt2243;
	int i_19_ = (i_17_ << 16) / arg2;
	int i_20_ = (i_18_ << 16) / arg3;
	if (anInt2242 > 0) {
	    int i_21_ = ((anInt2242 << 16) + i_19_ - 1) / i_19_;
	    arg0 += i_21_;
	    i_15_ += i_21_ * i_19_ - (anInt2242 << 16);
	}
	if (anInt2250 > 0) {
	    int i_22_ = ((anInt2250 << 16) + i_20_ - 1) / i_20_;
	    arg1 += i_22_;
	    i_16_ += i_22_ * i_20_ - (anInt2250 << 16);
	}
	if (i < i_17_)
	    arg2 = ((i << 16) - i_15_ + i_19_ - 1) / i_19_;
	if (i_14_ < i_18_)
	    arg3 = ((i_14_ << 16) - i_16_ + i_20_ - 1) / i_20_;
	int i_23_ = arg0 + arg1 * Class121.anInt2296;
	int i_24_ = Class121.anInt2296 - arg2;
	if (arg1 + arg3 > Class121.anInt2297)
	    arg3 -= arg1 + arg3 - Class121.anInt2297;
	if (arg1 < Class121.anInt2295) {
	    int i_25_ = Class121.anInt2295 - arg1;
	    arg3 -= i_25_;
	    i_23_ += i_25_ * Class121.anInt2296;
	    i_16_ += i_20_ * i_25_;
	}
	if (arg0 + arg2 > Class121.anInt2301) {
	    int i_26_ = arg0 + arg2 - Class121.anInt2301;
	    arg2 -= i_26_;
	    i_24_ += i_26_;
	}
	if (arg0 < Class121.anInt2298) {
	    int i_27_ = Class121.anInt2298 - arg0;
	    arg2 -= i_27_;
	    i_23_ += i_27_;
	    i_15_ += i_19_ * i_27_;
	    i_24_ += i_27_;
	}
	method1654(Class121.anIntArray2300, aByteArray3410, anIntArray3411,
		   i_15_, i_16_, i_23_, i_24_, arg2, arg3, i_19_, i_20_, i,
		   arg4);
    }
    
    public static void method1649(int[] arg0, byte[] arg1, int[] arg2,
				  int arg3, int arg4, int arg5, int arg6,
				  int arg7, int arg8, int arg9) {
	int i = -(arg6 >> 2);
	arg6 = -(arg6 & 0x3);
	for (int i_28_ = -arg7; i_28_ < 0; i_28_++) {
	    for (int i_29_ = i; i_29_ < 0; i_29_++) {
		arg3 = arg1[arg4++];
		if (arg3 != 0)
		    arg0[arg5++] = arg2[arg3 & 0xff];
		else
		    arg5++;
		arg3 = arg1[arg4++];
		if (arg3 != 0)
		    arg0[arg5++] = arg2[arg3 & 0xff];
		else
		    arg5++;
		arg3 = arg1[arg4++];
		if (arg3 != 0)
		    arg0[arg5++] = arg2[arg3 & 0xff];
		else
		    arg5++;
		arg3 = arg1[arg4++];
		if (arg3 != 0)
		    arg0[arg5++] = arg2[arg3 & 0xff];
		else
		    arg5++;
	    }
	    for (int i_30_ = arg6; i_30_ < 0; i_30_++) {
		arg3 = arg1[arg4++];
		if (arg3 != 0)
		    arg0[arg5++] = arg2[arg3 & 0xff];
		else
		    arg5++;
	    }
	    arg5 += arg8;
	    arg4 += arg9;
	}
    }
    
    public void method1641(int arg0, int arg1) {
	arg0 += anInt2242;
	arg1 += anInt2250;
	int i = arg0 + arg1 * Class121.anInt2296;
	int i_31_ = 0;
	int i_32_ = anInt2254;
	int i_33_ = anInt2252;
	int i_34_ = Class121.anInt2296 - i_33_;
	int i_35_ = 0;
	if (arg1 < Class121.anInt2295) {
	    int i_36_ = Class121.anInt2295 - arg1;
	    i_32_ -= i_36_;
	    arg1 = Class121.anInt2295;
	    i_31_ += i_36_ * i_33_;
	    i += i_36_ * Class121.anInt2296;
	}
	if (arg1 + i_32_ > Class121.anInt2297)
	    i_32_ -= arg1 + i_32_ - Class121.anInt2297;
	if (arg0 < Class121.anInt2298) {
	    int i_37_ = Class121.anInt2298 - arg0;
	    i_33_ -= i_37_;
	    arg0 = Class121.anInt2298;
	    i_31_ += i_37_;
	    i += i_37_;
	    i_35_ += i_37_;
	    i_34_ += i_37_;
	}
	if (arg0 + i_33_ > Class121.anInt2301) {
	    int i_38_ = arg0 + i_33_ - Class121.anInt2301;
	    i_33_ -= i_38_;
	    i_35_ += i_38_;
	    i_34_ += i_38_;
	}
	if (i_33_ > 0 && i_32_ > 0)
	    method1649(Class121.anIntArray2300, aByteArray3410, anIntArray3411,
		       0, i_31_, i, i_33_, i_32_, i_34_, i_35_);
    }
    
    public void method1650() {
	if (anInt2252 != anInt2255 || anInt2254 != anInt2243) {
	    byte[] is = new byte[anInt2255 * anInt2243];
	    int i = 0;
	    for (int i_39_ = 0; i_39_ < anInt2254; i_39_++) {
		for (int i_40_ = 0; i_40_ < anInt2252; i_40_++)
		    is[i_40_ + anInt2242 + (i_39_ + anInt2250) * anInt2255]
			= aByteArray3410[i++];
	    }
	    aByteArray3410 = is;
	    anInt2252 = anInt2255;
	    anInt2254 = anInt2243;
	    anInt2242 = 0;
	    anInt2250 = 0;
	}
    }
    
    public static void method1651(int[] arg0, byte[] arg1, int[] arg2,
				  int arg3, int arg4, int arg5, int arg6,
				  int arg7, int arg8, int arg9) {
	int i = 256 - arg9;
	for (int i_41_ = -arg6; i_41_ < 0; i_41_++) {
	    for (int i_42_ = -arg5; i_42_ < 0; i_42_++) {
		int i_43_ = arg1[arg3++];
		if (i_43_ != 0) {
		    i_43_ = arg2[i_43_ & 0xff];
		    int i_44_ = arg0[arg4];
		    arg0[arg4++]
			= (((i_43_ & 0xff00ff) * arg9 + (i_44_ & 0xff00ff) * i
			    & ~0xff00ff)
			   + ((i_43_ & 0xff00) * arg9 + (i_44_ & 0xff00) * i
			      & 0xff0000)) >> 8;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method1652() {
	byte[] is = new byte[anInt2252 * anInt2254];
	int i = 0;
	for (int i_45_ = 0; i_45_ < anInt2252; i_45_++) {
	    for (int i_46_ = anInt2254 - 1; i_46_ >= 0; i_46_--)
		is[i++] = aByteArray3410[i_45_ + i_46_ * anInt2252];
	}
	aByteArray3410 = is;
	int i_47_ = anInt2250;
	anInt2250 = anInt2242;
	anInt2242 = anInt2243 - anInt2254 - i_47_;
	i_47_ = anInt2254;
	anInt2254 = anInt2252;
	anInt2252 = i_47_;
	i_47_ = anInt2243;
	anInt2243 = anInt2255;
	anInt2255 = i_47_;
    }
    
    public static void method1653
	(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	int i = arg3;
	for (int i_48_ = -arg8; i_48_ < 0; i_48_++) {
	    int i_49_ = (arg4 >> 16) * arg11;
	    for (int i_50_ = -arg7; i_50_ < 0; i_50_++) {
		int i_51_ = arg1[(arg3 >> 16) + i_49_];
		if (i_51_ != 0)
		    arg0[arg5++] = arg2[i_51_ & 0xff];
		else
		    arg5++;
		arg3 += arg9;
	    }
	    arg4 += arg10;
	    arg3 = i;
	    arg5 += arg6;
	}
    }
    
    public static void method1654(int[] arg0, byte[] arg1, int[] arg2,
				  int arg3, int arg4, int arg5, int arg6,
				  int arg7, int arg8, int arg9, int arg10,
				  int arg11, int arg12) {
	int i = arg3;
	int i_52_ = arg12 >> 16 & 0xff;
	int i_53_ = arg12 >> 8 & 0xff;
	int i_54_ = arg12 & 0xff;
	for (int i_55_ = -arg8; i_55_ < 0; i_55_++) {
	    int i_56_ = (arg4 >> 16) * arg11;
	    for (int i_57_ = -arg7; i_57_ < 0; i_57_++) {
		int i_58_ = arg1[(arg3 >> 16) + i_56_];
		if (i_58_ != 0) {
		    i_58_ = arg2[i_58_ & 0xff];
		    int i_59_ = i_58_ >> 16 & 0xff;
		    int i_60_ = i_58_ >> 8 & 0xff;
		    int i_61_ = i_58_ & 0xff;
		    arg0[arg5++]
			= ((i_59_ * i_52_ >> 8 << 16)
			   + (i_60_ * i_53_ >> 8 << 8) + (i_61_ * i_54_ >> 8));
		} else
		    arg5++;
		arg3 += arg9;
	    }
	    arg4 += arg10;
	    arg3 = i;
	    arg5 += arg6;
	}
    }
    
    public Class119_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, byte[] arg6, int[] arg7) {
	anInt2255 = arg0;
	anInt2243 = arg1;
	anInt2242 = arg2;
	anInt2250 = arg3;
	anInt2252 = arg4;
	anInt2254 = arg5;
	aByteArray3410 = arg6;
	anIntArray3411 = arg7;
    }
    
    public void method1655(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anIntArray3411.length; i++) {
	    int i_62_ = anIntArray3411[i] >> 16 & 0xff;
	    i_62_ += arg0;
	    if (i_62_ < 0)
		i_62_ = 0;
	    else if (i_62_ > 255)
		i_62_ = 255;
	    int i_63_ = anIntArray3411[i] >> 8 & 0xff;
	    i_63_ += arg1;
	    if (i_63_ < 0)
		i_63_ = 0;
	    else if (i_63_ > 255)
		i_63_ = 255;
	    int i_64_ = anIntArray3411[i] & 0xff;
	    i_64_ += arg2;
	    if (i_64_ < 0)
		i_64_ = 0;
	    else if (i_64_ > 255)
		i_64_ = 255;
	    anIntArray3411[i] = (i_62_ << 16) + (i_63_ << 8) + i_64_;
	}
    }
    
    public void method1642(int arg0, int arg1, int arg2) {
	arg0 += anInt2242;
	arg1 += anInt2250;
	int i = arg0 + arg1 * Class121.anInt2296;
	int i_65_ = 0;
	int i_66_ = anInt2254;
	int i_67_ = anInt2252;
	int i_68_ = Class121.anInt2296 - i_67_;
	int i_69_ = 0;
	if (arg1 < Class121.anInt2295) {
	    int i_70_ = Class121.anInt2295 - arg1;
	    i_66_ -= i_70_;
	    arg1 = Class121.anInt2295;
	    i_65_ += i_70_ * i_67_;
	    i += i_70_ * Class121.anInt2296;
	}
	if (arg1 + i_66_ > Class121.anInt2297)
	    i_66_ -= arg1 + i_66_ - Class121.anInt2297;
	if (arg0 < Class121.anInt2298) {
	    int i_71_ = Class121.anInt2298 - arg0;
	    i_67_ -= i_71_;
	    arg0 = Class121.anInt2298;
	    i_65_ += i_71_;
	    i += i_71_;
	    i_69_ += i_71_;
	    i_68_ += i_71_;
	}
	if (arg0 + i_67_ > Class121.anInt2301) {
	    int i_72_ = arg0 + i_67_ - Class121.anInt2301;
	    i_67_ -= i_72_;
	    i_69_ += i_72_;
	    i_68_ += i_72_;
	}
	if (i_67_ > 0 && i_66_ > 0)
	    method1651(Class121.anIntArray2300, aByteArray3410, anIntArray3411,
		       i_65_, i, i_67_, i_66_, i_68_, i_69_, arg2);
    }
}
