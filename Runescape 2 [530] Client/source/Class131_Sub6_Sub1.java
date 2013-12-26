public class Class131_Sub6_Sub1 extends Class131_Sub6
{
    public static Class131_Sub6_Sub1 aClass131_Sub6_Sub1_4961
	= new Class131_Sub6_Sub1();
    public int[] anIntArray4962;
    public boolean aBoolean4963;
    public int[] anIntArray4964;
    public short aShort4965;
    public short aShort4966;
    public int[] anIntArray4967;
    public int[] anIntArray4968;
    public short aShort4969;
    public short[] aShortArray4970;
    public short[] aShortArray4971;
    public int[] anIntArray4972;
    public short aShort4973;
    public byte[] aByteArray4974;
    public int anInt4975;
    public int[] anIntArray4976;
    public byte aByte4977;
    public short aShort4978;
    public short aShort4979;
    public int anInt4980;
    public short[] aShortArray4981;
    public int anInt4982 = 0;
    public short[] aShortArray4983;
    public int[] anIntArray4984;
    public byte[] aByteArray4985;
    public int[] anIntArray4986;
    public boolean aBoolean4987;
    public int[] anIntArray4988;
    public int[] anIntArray4989;
    public int[] anIntArray4990;
    public static int[] anIntArray4991;
    public static short[] aShortArray4992 = new short[1];
    public short aShort4993;
    public byte[] aByteArray4994;
    public short aShort4995;
    public static byte[] aByteArray4996;
    public int[] anIntArray4997;
    public static Class131_Sub6_Sub1 aClass131_Sub6_Sub1_4998;
    public static int[] anIntArray4999;
    public static int[] anIntArray5000;
    public int[][] anIntArrayArray5001;
    public int[][] anIntArrayArray5002;
    public static int[] anIntArray5003;
    public static int[] anIntArray5004;
    public static Class131_Sub6_Sub1 aClass131_Sub6_Sub1_5005;
    public static byte[] aByteArray5006;
    public static short[] aShortArray5007;
    public static int[] anIntArray5008;
    public static int[] anIntArray5009;
    public static byte[] aByteArray5010;
    public static int[] anIntArray5011;
    public static int[] anIntArray5012;
    public static int[] anIntArray5013;
    public static int[][] anIntArrayArray5014;
    public static int anInt5015;
    public static int[] anIntArray5016;
    public static int anInt5017;
    public static boolean[] aBooleanArray5018;
    public static int[] anIntArray5019;
    public static int[] anIntArray5020;
    public static int[] anIntArray5021;
    public static int[] anIntArray5022;
    public static int[][] anIntArrayArray5023;
    public static int[][] anIntArrayArray5024;
    public static int[] anIntArray5025;
    public static int anInt5026;
    public static boolean[] aBooleanArray5027;
    public static int[] anIntArray5028;
    public static int[] anIntArray5029;
    public static int[] anIntArray5030;
    public static int[] anIntArray5031;
    public static int[] anIntArray5032;
    public static int[] anIntArray5033;
    public static int[] anIntArray5034;
    public static boolean aBoolean5035;
    public static int[] anIntArray5036;
    public static boolean aBoolean5037;
    public static int[] anIntArray5038;
    public static int anInt5039;
    public static short[] aShortArray5040;
    public static int[] anIntArray5041;
    public static int[] anIntArray5042;
    
    public void method1837(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt4980; i++) {
	    anIntArray4997[i] += arg0;
	    anIntArray4967[i] += arg1;
	    anIntArray4972[i] += arg2;
	}
	aBoolean4987 = false;
    }
    
    public Class131_Sub6 method1857(Class131_Sub6 arg0) {
	return new Class131_Sub6_Sub1((new Class131_Sub6_Sub1[]
				       { this, (Class131_Sub6_Sub1) arg0 }),
				      2);
    }
    
    public int method1846() {
	if (!aBoolean4987)
	    method1863();
	return aShort4995;
    }
    
    public boolean method1832() {
	if (anIntArrayArray5001 == null)
	    return false;
	anInt5017 = 0;
	anInt5039 = 0;
	anInt5026 = 0;
	return true;
    }
    
    public static int method1858(int arg0) {
	if (arg0 < 2)
	    arg0 = 2;
	else if (arg0 > 126)
	    arg0 = 126;
	return arg0;
    }
    
    public Class131_Sub6_Sub1 method1859(int arg0, int arg1, int[][] arg2,
					 int[][] arg3, int arg4, int arg5,
					 int arg6, boolean arg7) {
	if (!aBoolean4987)
	    method1863();
	int i = arg4 + aShort4993;
	int i_0_ = arg4 + aShort4978;
	int i_1_ = arg6 + aShort4995;
	int i_2_ = arg6 + aShort4965;
	if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5)
	    && (i < 0 || i_0_ + 128 >> 7 >= arg2.length || i_1_ < 0
		|| i_2_ + 128 >> 7 >= arg2[0].length))
	    return this;
	if (arg0 == 4 || arg0 == 5) {
	    if (arg3 == null)
		return this;
	    if (i < 0 || i_0_ + 128 >> 7 >= arg3.length || i_1_ < 0
		|| i_2_ + 128 >> 7 >= arg3[0].length)
		return this;
	} else {
	    i >>= 7;
	    i_0_ = i_0_ + 127 >> 7;
	    i_1_ >>= 7;
	    i_2_ = i_2_ + 127 >> 7;
	    if (arg2[i][i_1_] == arg5 && arg2[i_0_][i_1_] == arg5
		&& arg2[i][i_2_] == arg5 && arg2[i_0_][i_2_] == arg5)
		return this;
	}
	Class131_Sub6_Sub1 class131_sub6_sub1;
	if (arg7) {
	    class131_sub6_sub1 = new Class131_Sub6_Sub1();
	    class131_sub6_sub1.anInt4980 = anInt4980;
	    class131_sub6_sub1.anInt4975 = anInt4975;
	    class131_sub6_sub1.anInt4982 = anInt4982;
	    class131_sub6_sub1.anIntArray4968 = anIntArray4968;
	    class131_sub6_sub1.anIntArray4990 = anIntArray4990;
	    class131_sub6_sub1.anIntArray4986 = anIntArray4986;
	    class131_sub6_sub1.anIntArray4962 = anIntArray4962;
	    class131_sub6_sub1.anIntArray4989 = anIntArray4989;
	    class131_sub6_sub1.anIntArray4988 = anIntArray4988;
	    class131_sub6_sub1.aByteArray4985 = aByteArray4985;
	    class131_sub6_sub1.aByteArray4974 = aByteArray4974;
	    class131_sub6_sub1.aShortArray4981 = aShortArray4981;
	    class131_sub6_sub1.aShortArray4970 = aShortArray4970;
	    class131_sub6_sub1.aByteArray4994 = aByteArray4994;
	    class131_sub6_sub1.aByte4977 = aByte4977;
	    class131_sub6_sub1.anIntArray4976 = anIntArray4976;
	    class131_sub6_sub1.anIntArray4964 = anIntArray4964;
	    class131_sub6_sub1.anIntArray4984 = anIntArray4984;
	    class131_sub6_sub1.anIntArrayArray5001 = anIntArrayArray5001;
	    class131_sub6_sub1.anIntArrayArray5002 = anIntArrayArray5002;
	    class131_sub6_sub1.aShortArray4983 = aShortArray4983;
	    class131_sub6_sub1.aShortArray4971 = aShortArray4971;
	    class131_sub6_sub1.aBoolean3690 = aBoolean3690;
	    if (arg0 == 3) {
		class131_sub6_sub1.anIntArray4997
		    = Class67_Sub20.method1272(anIntArray4997, false);
		class131_sub6_sub1.anIntArray4967
		    = Class67_Sub20.method1272(anIntArray4967, false);
		class131_sub6_sub1.anIntArray4972
		    = Class67_Sub20.method1272(anIntArray4972, false);
	    } else {
		class131_sub6_sub1.anIntArray4997 = anIntArray4997;
		class131_sub6_sub1.anIntArray4967
		    = new int[class131_sub6_sub1.anInt4980];
		class131_sub6_sub1.anIntArray4972 = anIntArray4972;
	    }
	} else
	    class131_sub6_sub1 = this;
	if (arg0 == 1) {
	    for (int i_3_ = 0; i_3_ < class131_sub6_sub1.anInt4980; i_3_++) {
		int i_4_ = anIntArray4997[i_3_] + arg4;
		int i_5_ = anIntArray4972[i_3_] + arg6;
		int i_6_ = i_4_ & 0x7f;
		int i_7_ = i_5_ & 0x7f;
		int i_8_ = i_4_ >> 7;
		int i_9_ = i_5_ >> 7;
		int i_10_ = ((arg2[i_8_][i_9_] * (128 - i_6_)
			      + arg2[i_8_ + 1][i_9_] * i_6_)
			     >> 7);
		int i_11_ = ((arg2[i_8_][i_9_ + 1] * (128 - i_6_)
			      + arg2[i_8_ + 1][i_9_ + 1] * i_6_)
			     >> 7);
		int i_12_ = i_10_ * (128 - i_7_) + i_11_ * i_7_ >> 7;
		class131_sub6_sub1.anIntArray4967[i_3_]
		    = anIntArray4967[i_3_] + i_12_ - arg5;
	    }
	} else if (arg0 == 2) {
	    for (int i_13_ = 0; i_13_ < class131_sub6_sub1.anInt4980;
		 i_13_++) {
		int i_14_ = (anIntArray4967[i_13_] << 16) / aShort4966;
		if (i_14_ < arg1) {
		    int i_15_ = anIntArray4997[i_13_] + arg4;
		    int i_16_ = anIntArray4972[i_13_] + arg6;
		    int i_17_ = i_15_ & 0x7f;
		    int i_18_ = i_16_ & 0x7f;
		    int i_19_ = i_15_ >> 7;
		    int i_20_ = i_16_ >> 7;
		    int i_21_ = ((arg2[i_19_][i_20_] * (128 - i_17_)
				  + arg2[i_19_ + 1][i_20_] * i_17_)
				 >> 7);
		    int i_22_ = ((arg2[i_19_][i_20_ + 1] * (128 - i_17_)
				  + arg2[i_19_ + 1][i_20_ + 1] * i_17_)
				 >> 7);
		    int i_23_ = i_21_ * (128 - i_18_) + i_22_ * i_18_ >> 7;
		    class131_sub6_sub1.anIntArray4967[i_13_]
			= (anIntArray4967[i_13_]
			   + (i_23_ - arg5) * (arg1 - i_14_) / arg1);
		} else
		    class131_sub6_sub1.anIntArray4967[i_13_]
			= anIntArray4967[i_13_];
	    }
	} else if (arg0 == 3) {
	    int i_24_ = (arg1 & 0xff) * 4;
	    int i_25_ = (arg1 >> 8 & 0xff) * 4;
	    class131_sub6_sub1.method1834(arg2, arg4, arg5, arg6, i_24_,
					  i_25_);
	} else if (arg0 == 4) {
	    int i_26_ = aShort4973 - aShort4966;
	    for (int i_27_ = 0; i_27_ < anInt4980; i_27_++) {
		int i_28_ = anIntArray4997[i_27_] + arg4;
		int i_29_ = anIntArray4972[i_27_] + arg6;
		int i_30_ = i_28_ & 0x7f;
		int i_31_ = i_29_ & 0x7f;
		int i_32_ = i_28_ >> 7;
		int i_33_ = i_29_ >> 7;
		int i_34_ = ((arg3[i_32_][i_33_] * (128 - i_30_)
			      + arg3[i_32_ + 1][i_33_] * i_30_)
			     >> 7);
		int i_35_ = ((arg3[i_32_][i_33_ + 1] * (128 - i_30_)
			      + arg3[i_32_ + 1][i_33_ + 1] * i_30_)
			     >> 7);
		int i_36_ = i_34_ * (128 - i_31_) + i_35_ * i_31_ >> 7;
		class131_sub6_sub1.anIntArray4967[i_27_]
		    = anIntArray4967[i_27_] + (i_36_ - arg5) + i_26_;
	    }
	} else if (arg0 == 5) {
	    int i_37_ = aShort4973 - aShort4966;
	    for (int i_38_ = 0; i_38_ < anInt4980; i_38_++) {
		int i_39_ = anIntArray4997[i_38_] + arg4;
		int i_40_ = anIntArray4972[i_38_] + arg6;
		int i_41_ = i_39_ & 0x7f;
		int i_42_ = i_40_ & 0x7f;
		int i_43_ = i_39_ >> 7;
		int i_44_ = i_40_ >> 7;
		int i_45_ = ((arg2[i_43_][i_44_] * (128 - i_41_)
			      + arg2[i_43_ + 1][i_44_] * i_41_)
			     >> 7);
		int i_46_ = ((arg2[i_43_][i_44_ + 1] * (128 - i_41_)
			      + arg2[i_43_ + 1][i_44_ + 1] * i_41_)
			     >> 7);
		int i_47_ = i_45_ * (128 - i_42_) + i_46_ * i_42_ >> 7;
		i_45_ = (arg3[i_43_][i_44_] * (128 - i_41_)
			 + arg3[i_43_ + 1][i_44_] * i_41_) >> 7;
		i_46_ = (arg3[i_43_][i_44_ + 1] * (128 - i_41_)
			 + arg3[i_43_ + 1][i_44_ + 1] * i_41_) >> 7;
		int i_48_ = i_45_ * (128 - i_42_) + i_46_ * i_42_ >> 7;
		int i_49_ = i_47_ - i_48_;
		class131_sub6_sub1.anIntArray4967[i_38_]
		    = (((anIntArray4967[i_38_] << 8) / i_37_ * i_49_ >> 8)
		       - (arg5 - i_47_));
	    }
	}
	class131_sub6_sub1.aBoolean4987 = false;
	return class131_sub6_sub1;
    }
    
    public void method1844(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 == 0) {
	    int i = 0;
	    anInt5017 = 0;
	    anInt5039 = 0;
	    anInt5026 = 0;
	    for (int i_50_ = 0; i_50_ < anInt4980; i_50_++) {
		anInt5017 += anIntArray4997[i_50_];
		anInt5039 += anIntArray4967[i_50_];
		anInt5026 += anIntArray4972[i_50_];
		i++;
	    }
	    if (i > 0) {
		anInt5017 = anInt5017 / i + arg1;
		anInt5039 = anInt5039 / i + arg2;
		anInt5026 = anInt5026 / i + arg3;
	    } else {
		anInt5017 = arg1;
		anInt5039 = arg2;
		anInt5026 = arg3;
	    }
	} else if (arg0 == 1) {
	    for (int i = 0; i < anInt4980; i++) {
		anIntArray4997[i] += arg1;
		anIntArray4967[i] += arg2;
		anIntArray4972[i] += arg3;
	    }
	} else if (arg0 == 2) {
	    for (int i = 0; i < anInt4980; i++) {
		anIntArray4997[i] -= anInt5017;
		anIntArray4967[i] -= anInt5039;
		anIntArray4972[i] -= anInt5026;
		if (arg3 != 0) {
		    int i_51_ = Class26.anIntArray617[arg3];
		    int i_52_ = Class26.anIntArray612[arg3];
		    int i_53_ = ((anIntArray4967[i] * i_51_
				  + anIntArray4997[i] * i_52_ + 32767)
				 >> 16);
		    anIntArray4967[i]
			= (anIntArray4967[i] * i_52_
			   - anIntArray4997[i] * i_51_ + 32767) >> 16;
		    anIntArray4997[i] = i_53_;
		}
		if (arg1 != 0) {
		    int i_54_ = Class26.anIntArray617[arg1];
		    int i_55_ = Class26.anIntArray612[arg1];
		    int i_56_ = ((anIntArray4967[i] * i_55_
				  - anIntArray4972[i] * i_54_ + 32767)
				 >> 16);
		    anIntArray4972[i]
			= (anIntArray4967[i] * i_54_
			   + anIntArray4972[i] * i_55_ + 32767) >> 16;
		    anIntArray4967[i] = i_56_;
		}
		if (arg2 != 0) {
		    int i_57_ = Class26.anIntArray617[arg2];
		    int i_58_ = Class26.anIntArray612[arg2];
		    int i_59_ = ((anIntArray4972[i] * i_57_
				  + anIntArray4997[i] * i_58_ + 32767)
				 >> 16);
		    anIntArray4972[i]
			= (anIntArray4972[i] * i_58_
			   - anIntArray4997[i] * i_57_ + 32767) >> 16;
		    anIntArray4997[i] = i_59_;
		}
		anIntArray4997[i] += anInt5017;
		anIntArray4967[i] += anInt5039;
		anIntArray4972[i] += anInt5026;
	    }
	} else if (arg0 == 3) {
	    for (int i = 0; i < anInt4980; i++) {
		anIntArray4997[i] -= anInt5017;
		anIntArray4967[i] -= anInt5039;
		anIntArray4972[i] -= anInt5026;
		anIntArray4997[i] = anIntArray4997[i] * arg1 / 128;
		anIntArray4967[i] = anIntArray4967[i] * arg2 / 128;
		anIntArray4972[i] = anIntArray4972[i] * arg3 / 128;
		anIntArray4997[i] += anInt5017;
		anIntArray4967[i] += anInt5039;
		anIntArray4972[i] += anInt5026;
	    }
	} else if (arg0 == 5) {
	    for (int i = 0; i < anInt4975; i++) {
		int i_60_ = (aByteArray4994[i] & 0xff) + arg1 * 8;
		if (i_60_ < 0)
		    i_60_ = 0;
		else if (i_60_ > 255)
		    i_60_ = 255;
		aByteArray4994[i] = (byte) i_60_;
	    }
	} else if (arg0 == 7) {
	    for (int i = 0; i < anInt4975; i++) {
		int i_61_ = aShortArray4970[i] & 0xffff;
		int i_62_ = i_61_ >> 10 & 0x3f;
		int i_63_ = i_61_ >> 7 & 0x7;
		int i_64_ = i_61_ & 0x7f;
		i_62_ = i_62_ + arg1 & 0x3f;
		i_63_ += arg2;
		if (i_63_ < 0)
		    i_63_ = 0;
		else if (i_63_ > 7)
		    i_63_ = 7;
		i_64_ += arg3;
		if (i_64_ < 0)
		    i_64_ = 0;
		else if (i_64_ > 127)
		    i_64_ = 127;
		aShortArray4970[i]
		    = (short) (i_62_ << 10 | i_63_ << 7 | i_64_);
	    }
	    aBoolean4963 = true;
	}
    }
    
    public int method1769() {
	if (!aBoolean4987)
	    method1863();
	return aShort4966;
    }
    
    public void method1836(int arg0) {
	int i = Class26.anIntArray617[arg0];
	int i_65_ = Class26.anIntArray612[arg0];
	for (int i_66_ = 0; i_66_ < anInt4980; i_66_++) {
	    int i_67_
		= (anIntArray4967[i_66_] * i + anIntArray4997[i_66_] * i_65_
		   >> 16);
	    anIntArray4967[i_66_]
		= (anIntArray4967[i_66_] * i_65_ - anIntArray4997[i_66_] * i
		   >> 16);
	    anIntArray4997[i_66_] = i_67_;
	}
	aBoolean4987 = false;
    }
    
    public boolean method1860(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7) {
	if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
	    return false;
	if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
	    return false;
	if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
	    return false;
	if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
	    return false;
	return true;
    }
    
    public void method1855(int arg0) {
	int i = Class26.anIntArray617[arg0];
	int i_68_ = Class26.anIntArray612[arg0];
	for (int i_69_ = 0; i_69_ < anInt4980; i_69_++) {
	    int i_70_
		= (anIntArray4972[i_69_] * i + anIntArray4997[i_69_] * i_68_
		   >> 16);
	    anIntArray4972[i_69_]
		= (anIntArray4972[i_69_] * i_68_ - anIntArray4997[i_69_] * i
		   >> 16);
	    anIntArray4997[i_69_] = i_70_;
	}
	aBoolean4987 = false;
    }
    
    public void method1829() {
	for (int i = 0; i < anInt4980; i++) {
	    anIntArray4997[i] = -anIntArray4997[i];
	    anIntArray4972[i] = -anIntArray4972[i];
	}
	aBoolean4987 = false;
    }
    
    public void method1861(boolean arg0, boolean arg1, long arg2, int arg3,
			   int arg4, Class61_Sub1 arg5) {
	if (arg4 < 1600) {
	    int i = 0;
	    int i_71_ = 0;
	    if (!aBoolean5035) {
		for (int i_72_ = 0; i_72_ < 1600; i_72_++)
		    anIntArray5011[i_72_] = 0;
		for (int i_73_ = 0; i_73_ < 32; i_73_++)
		    anIntArray5013[i_73_] = 0;
		anInt5015 = 0;
	    }
	    for (int i_74_ = 0; i_74_ < anInt4975; i_74_++) {
		if (anIntArray4988[i_74_] != -2) {
		    int i_75_ = anIntArray4968[i_74_];
		    int i_76_ = anIntArray4990[i_74_];
		    int i_77_ = anIntArray4986[i_74_];
		    int i_78_ = anIntArray5038[i_75_];
		    int i_79_ = anIntArray5038[i_76_];
		    int i_80_ = anIntArray5038[i_77_];
		    if (arg0 && (i_78_ == -5000 || i_79_ == -5000
				 || i_80_ == -5000)) {
			int i_81_ = anIntArray5034[i_75_];
			int i_82_ = anIntArray5034[i_76_];
			int i_83_ = anIntArray5034[i_77_];
			int i_84_ = anIntArray5020[i_75_];
			int i_85_ = anIntArray5020[i_76_];
			int i_86_ = anIntArray5020[i_77_];
			int i_87_ = anIntArray5041[i_75_];
			int i_88_ = anIntArray5041[i_76_];
			int i_89_ = anIntArray5041[i_77_];
			i_81_ -= i_82_;
			i_83_ -= i_82_;
			i_84_ -= i_85_;
			i_86_ -= i_85_;
			i_87_ -= i_88_;
			i_89_ -= i_88_;
			int i_90_ = i_84_ * i_89_ - i_87_ * i_86_;
			int i_91_ = i_87_ * i_83_ - i_81_ * i_89_;
			int i_92_ = i_81_ * i_86_ - i_84_ * i_83_;
			if (i_82_ * i_90_ + i_85_ * i_91_ + i_88_ * i_92_
			    > 0) {
			    aBooleanArray5027[i_74_] = true;
			    if (aBoolean5035) {
				anIntArray5009[i]
				    = (anIntArray5030[i_75_]
				       + anIntArray5030[i_76_]
				       + anIntArray5030[i_77_]) / 3;
				anIntArray5021[i++] = i_74_;
			    } else {
				int i_93_ = ((anIntArray5030[i_75_]
					      + anIntArray5030[i_76_]
					      + anIntArray5030[i_77_]) / 3
					     + arg3);
				if (anIntArray5011[i_93_] < 64)
				    anIntArrayArray5014[i_93_]
					[anIntArray5011[i_93_]++]
					= i_74_;
				else {
				    int i_94_ = anIntArray5011[i_93_];
				    if (i_94_ == 64) {
					if (anInt5015 == 512)
					    continue;
					anIntArray5011[i_93_] = i_94_
					    = 65 + anInt5015++;
				    }
				    i_94_ -= 65;
				    anIntArrayArray5023[i_94_]
					[anIntArray5013[i_94_]++]
					= i_74_;
				}
			    }
			}
		    } else {
			if (arg1 && method1860((PacketParser.anInt2107
						+ Class26.anInt611),
					       (Class129.anInt2392
						+ Class26.anInt607),
					       anIntArray5031[i_75_],
					       anIntArray5031[i_76_],
					       anIntArray5031[i_77_], i_78_,
					       i_79_, i_80_)) {
			    Class67_Sub1_Sub22.aLongArray4178
				[Class27.anInt641++]
				= arg2;
			    arg1 = false;
			}
			if (((i_78_ - i_79_) * (anIntArray5031[i_77_]
						- anIntArray5031[i_76_])
			     - ((anIntArray5031[i_75_] - anIntArray5031[i_76_])
				* (i_80_ - i_79_)))
			    > 0) {
			    aBooleanArray5027[i_74_] = false;
			    if (i_78_ < 0 || i_79_ < 0 || i_80_ < 0
				|| i_78_ > Class26.anInt621
				|| i_79_ > Class26.anInt621
				|| i_80_ > Class26.anInt621)
				aBooleanArray5018[i_74_] = true;
			    else
				aBooleanArray5018[i_74_] = false;
			    if (aBoolean5035) {
				anIntArray5009[i]
				    = (anIntArray5030[i_75_]
				       + anIntArray5030[i_76_]
				       + anIntArray5030[i_77_]) / 3;
				anIntArray5021[i++] = i_74_;
			    } else {
				int i_95_ = ((anIntArray5030[i_75_]
					      + anIntArray5030[i_76_]
					      + anIntArray5030[i_77_]) / 3
					     + arg3);
				if (anIntArray5011[i_95_] < 64)
				    anIntArrayArray5014[i_95_]
					[anIntArray5011[i_95_]++]
					= i_74_;
				else {
				    int i_96_ = anIntArray5011[i_95_];
				    if (i_96_ == 64) {
					if (anInt5015 == 512)
					    continue;
					anIntArray5011[i_95_] = i_96_
					    = 65 + anInt5015++;
				    }
				    i_96_ -= 65;
				    anIntArrayArray5023[i_96_]
					[anIntArray5013[i_96_]++]
					= i_74_;
				}
			    }
			}
		    }
		}
	    }
	    if (aBoolean5035) {
		Class1.method65(1, anIntArray5009, i - 1, 0, anIntArray5021);
		if (aByteArray4985 == null) {
		    for (int i_97_ = 0; i_97_ < i; i_97_++)
			method1867(anIntArray5021[i_97_]);
		    return;
		}
		for (int i_98_ = 0; i_98_ < 12; i_98_++) {
		    anIntArray5016[i_98_] = 0;
		    anIntArray5036[i_98_] = 0;
		}
		for (int i_99_ = 0; i_99_ < i; i_99_++) {
		    int i_100_ = anIntArray5021[i_99_];
		    int i_101_ = anIntArray5009[i_99_];
		    byte i_102_ = aByteArray4985[i_100_];
		    int i_103_ = anIntArray5016[i_102_]++;
		    anIntArrayArray5024[i_102_][i_103_] = i_100_;
		    if (i_102_ < 10)
			anIntArray5036[i_102_] += i_101_;
		    else if (i_102_ == 10)
			anIntArray5022[i_103_] = i_101_;
		    else
			anIntArray5025[i_103_] = i_101_;
		}
	    } else {
		if (aByteArray4985 == null) {
		    for (int i_104_ = arg4 - 1; i_104_ >= 0; i_104_--) {
			int i_105_ = anIntArray5011[i_104_];
			if (i_105_ > 0) {
			    int i_106_ = i_105_ > 64 ? 64 : i_105_;
			    int[] is = anIntArrayArray5014[i_104_];
			    for (int i_107_ = 0; i_107_ < i_106_; i_107_++) {
				int i_108_ = is[i_107_];
				if (i_108_ < 65536)
				    method1867(is[i_107_]);
			    }
			}
			if (i_105_ > 64) {
			    int i_109_ = anIntArray5011[i_104_] - 64 - 1;
			    int[] is = anIntArrayArray5023[i_109_];
			    for (int i_110_ = 0;
				 i_110_ < anIntArray5013[i_109_]; i_110_++) {
				int i_111_ = is[i_110_];
				if (i_111_ < 65536)
				    method1867(is[i_110_]);
			    }
			}
		    }
		    return;
		}
		for (int i_112_ = 0; i_112_ < 12; i_112_++) {
		    anIntArray5016[i_112_] = 0;
		    anIntArray5036[i_112_] = 0;
		}
		for (int i_113_ = arg4 - 1; i_113_ >= 0; i_113_--) {
		    int i_114_ = anIntArray5011[i_113_];
		    if (i_114_ > 0) {
			int i_115_;
			if (i_114_ > 64)
			    i_115_ = 64;
			else
			    i_115_ = i_114_;
			int[] is = anIntArrayArray5014[i_113_];
			for (int i_116_ = 0; i_116_ < i_115_; i_116_++) {
			    int i_117_ = is[i_116_];
			    if (i_117_ < 65536) {
				byte i_118_ = aByteArray4985[i_117_];
				int i_119_ = anIntArray5016[i_118_]++;
				anIntArrayArray5024[i_118_][i_119_] = i_117_;
				if (i_118_ < 10)
				    anIntArray5036[i_118_] += i_113_;
				else if (i_118_ == 10)
				    anIntArray5022[i_119_] = i_113_;
				else
				    anIntArray5025[i_119_] = i_113_;
			    } else
				anIntArray5029[i_71_++] = (i_117_ >> 16) - 1;
			}
		    }
		    if (i_114_ > 64) {
			int i_120_ = anIntArray5011[i_113_] - 64 - 1;
			int[] is = anIntArrayArray5023[i_120_];
			for (int i_121_ = 0; i_121_ < anIntArray5013[i_120_];
			     i_121_++) {
			    int i_122_ = is[i_121_];
			    if (i_122_ < 65536) {
				byte i_123_ = aByteArray4985[i_122_];
				int i_124_ = anIntArray5016[i_123_]++;
				anIntArrayArray5024[i_123_][i_124_] = i_122_;
				if (i_123_ < 10)
				    anIntArray5036[i_123_] += i_113_;
				else if (i_123_ == 10)
				    anIntArray5022[i_124_] = i_113_;
				else
				    anIntArray5025[i_124_] = i_113_;
			    } else
				anIntArray5029[i_71_++] = (i_122_ >> 16) - 1;
			}
		    }
		}
	    }
	    int i_125_ = 0;
	    if (anIntArray5016[1] > 0 || anIntArray5016[2] > 0)
		i_125_ = ((anIntArray5036[1] + anIntArray5036[2])
			  / (anIntArray5016[1] + anIntArray5016[2]));
	    int i_126_ = 0;
	    if (anIntArray5016[3] > 0 || anIntArray5016[4] > 0)
		i_126_ = ((anIntArray5036[3] + anIntArray5036[4])
			  / (anIntArray5016[3] + anIntArray5016[4]));
	    int i_127_ = 0;
	    if (anIntArray5016[6] > 0 || anIntArray5016[8] > 0)
		i_127_ = ((anIntArray5036[6] + anIntArray5036[8])
			  / (anIntArray5016[6] + anIntArray5016[8]));
	    int i_128_ = 0;
	    int i_129_ = anIntArray5016[10];
	    int[] is = anIntArrayArray5024[10];
	    int[] is_130_ = anIntArray5022;
	    if (i_128_ == i_129_) {
		i_128_ = 0;
		i_129_ = anIntArray5016[11];
		is = anIntArrayArray5024[11];
		is_130_ = anIntArray5025;
	    }
	    int i_131_;
	    if (i_128_ < i_129_)
		i_131_ = is_130_[i_128_];
	    else
		i_131_ = -1000;
	    for (int i_132_ = 0; i_132_ < 10; i_132_++) {
		while (i_132_ == 0) {
		    if (i_131_ <= i_125_)
			break;
		    method1867(is[i_128_++]);
		    if (i_128_ == i_129_ && is != anIntArrayArray5024[11]) {
			i_128_ = 0;
			i_129_ = anIntArray5016[11];
			is = anIntArrayArray5024[11];
			is_130_ = anIntArray5025;
		    }
		    if (i_128_ < i_129_)
			i_131_ = is_130_[i_128_];
		    else
			i_131_ = -1000;
		}
		while (i_132_ == 3) {
		    if (i_131_ <= i_126_)
			break;
		    method1867(is[i_128_++]);
		    if (i_128_ == i_129_ && is != anIntArrayArray5024[11]) {
			i_128_ = 0;
			i_129_ = anIntArray5016[11];
			is = anIntArrayArray5024[11];
			is_130_ = anIntArray5025;
		    }
		    if (i_128_ < i_129_)
			i_131_ = is_130_[i_128_];
		    else
			i_131_ = -1000;
		}
		while (i_132_ == 5 && i_131_ > i_127_) {
		    method1867(is[i_128_++]);
		    if (i_128_ == i_129_ && is != anIntArrayArray5024[11]) {
			i_128_ = 0;
			i_129_ = anIntArray5016[11];
			is = anIntArrayArray5024[11];
			is_130_ = anIntArray5025;
		    }
		    if (i_128_ < i_129_)
			i_131_ = is_130_[i_128_];
		    else
			i_131_ = -1000;
		}
		int i_133_ = anIntArray5016[i_132_];
		int[] is_134_ = anIntArrayArray5024[i_132_];
		for (int i_135_ = 0; i_135_ < i_133_; i_135_++)
		    method1867(is_134_[i_135_]);
	    }
	    while (i_131_ != -1000) {
		method1867(is[i_128_++]);
		if (i_128_ == i_129_ && is != anIntArrayArray5024[11]) {
		    i_128_ = 0;
		    is = anIntArrayArray5024[11];
		    i_129_ = anIntArray5016[11];
		    is_130_ = anIntArray5025;
		}
		if (i_128_ < i_129_)
		    i_131_ = is_130_[i_128_];
		else
		    i_131_ = -1000;
	    }
	}
    }
    
    public static void method1862() {
	aClass131_Sub6_Sub1_4961 = null;
	aByteArray4996 = null;
	aShortArray4992 = null;
	anIntArray4991 = null;
	anIntArray5000 = null;
	anIntArray4999 = null;
	aClass131_Sub6_Sub1_4998 = null;
	aByteArray5006 = null;
	aShortArray5007 = null;
	anIntArray5004 = null;
	anIntArray5003 = null;
	anIntArray5008 = null;
	aClass131_Sub6_Sub1_5005 = null;
	aByteArray5010 = null;
	aShortArray5040 = null;
	anIntArray5042 = null;
	anIntArray5012 = null;
	anIntArray5028 = null;
	aBooleanArray5018 = null;
	aBooleanArray5027 = null;
	anIntArray5038 = null;
	anIntArray5031 = null;
	anIntArray5030 = null;
	anIntArray5029 = null;
	anIntArray5034 = null;
	anIntArray5020 = null;
	anIntArray5041 = null;
	anIntArray5011 = null;
	anIntArrayArray5014 = null;
	anIntArray5013 = null;
	anIntArrayArray5023 = null;
	anIntArray5009 = null;
	anIntArray5021 = null;
	anIntArray5016 = null;
	anIntArrayArray5024 = null;
	anIntArray5022 = null;
	anIntArray5025 = null;
	anIntArray5036 = null;
	anIntArray5032 = null;
	anIntArray5033 = null;
	anIntArray5019 = null;
    }
    
    public void method1848() {
	for (int i = 0; i < anInt4980; i++) {
	    int i_136_ = anIntArray4972[i];
	    anIntArray4972[i] = anIntArray4997[i];
	    anIntArray4997[i] = -i_136_;
	}
	aBoolean4987 = false;
    }
    
    public void method1863() {
	int i = 32767;
	int i_137_ = 32767;
	int i_138_ = 32767;
	int i_139_ = -32768;
	int i_140_ = -32768;
	int i_141_ = -32768;
	int i_142_ = 0;
	int i_143_ = 0;
	for (int i_144_ = 0; i_144_ < anInt4980; i_144_++) {
	    int i_145_ = anIntArray4997[i_144_];
	    int i_146_ = anIntArray4967[i_144_];
	    int i_147_ = anIntArray4972[i_144_];
	    if (i_145_ < i)
		i = i_145_;
	    if (i_145_ > i_139_)
		i_139_ = i_145_;
	    if (i_146_ < i_137_)
		i_137_ = i_146_;
	    if (i_146_ > i_140_)
		i_140_ = i_146_;
	    if (i_147_ < i_138_)
		i_138_ = i_147_;
	    if (i_147_ > i_141_)
		i_141_ = i_147_;
	    int i_148_ = i_145_ * i_145_ + i_147_ * i_147_;
	    if (i_148_ > i_142_)
		i_142_ = i_148_;
	    i_148_ += i_146_ * i_146_;
	    if (i_148_ > i_143_)
		i_143_ = i_148_;
	}
	aShort4993 = (short) i;
	aShort4978 = (short) i_139_;
	aShort4966 = (short) i_137_;
	aShort4973 = (short) i_140_;
	aShort4995 = (short) i_138_;
	aShort4965 = (short) i_141_;
	aShort4979 = (short) (int) (Math.sqrt((double) i_142_) + 0.99);
	aShort4969 = (short) (int) (Math.sqrt((double) i_143_) + 0.99);
	aBoolean4987 = true;
    }
    
    public Class131_Sub6 method1864
	(boolean arg0, boolean arg1, Class131_Sub6_Sub1 arg2, byte[] arg3,
	 short[] arg4, int[] arg5, int[] arg6, int[] arg7) {
	arg2.anInt4980 = anInt4980;
	arg2.anInt4975 = anInt4975;
	arg2.anInt4982 = anInt4982;
	if (arg2.anIntArray4997 == null
	    || arg2.anIntArray4997.length < anInt4980) {
	    arg2.anIntArray4997 = new int[anInt4980 + 100];
	    arg2.anIntArray4967 = new int[anInt4980 + 100];
	    arg2.anIntArray4972 = new int[anInt4980 + 100];
	}
	for (int i = 0; i < anInt4980; i++) {
	    arg2.anIntArray4997[i] = anIntArray4997[i];
	    arg2.anIntArray4967[i] = anIntArray4967[i];
	    arg2.anIntArray4972[i] = anIntArray4972[i];
	}
	if (arg0)
	    arg2.aByteArray4994 = aByteArray4994;
	else {
	    arg2.aByteArray4994 = arg3;
	    if (aByteArray4994 == null) {
		for (int i = 0; i < anInt4975; i++)
		    arg2.aByteArray4994[i] = (byte) 0;
	    } else {
		for (int i = 0; i < anInt4975; i++)
		    arg2.aByteArray4994[i] = aByteArray4994[i];
	    }
	}
	if (arg1) {
	    arg2.aShortArray4970 = aShortArray4970;
	    arg2.anIntArray4962 = anIntArray4962;
	    arg2.anIntArray4989 = anIntArray4989;
	    arg2.anIntArray4988 = anIntArray4988;
	} else {
	    arg2.aShortArray4970 = arg4;
	    arg2.anIntArray4962 = arg5;
	    arg2.anIntArray4989 = arg6;
	    arg2.anIntArray4988 = arg7;
	    for (int i = 0; i < anInt4975; i++) {
		arg2.aShortArray4970[i] = aShortArray4970[i];
		arg2.anIntArray4962[i] = anIntArray4962[i];
		arg2.anIntArray4989[i] = anIntArray4989[i];
		arg2.anIntArray4988[i] = anIntArray4988[i];
	    }
	}
	arg2.anIntArray4968 = anIntArray4968;
	arg2.anIntArray4990 = anIntArray4990;
	arg2.anIntArray4986 = anIntArray4986;
	arg2.aByteArray4985 = aByteArray4985;
	arg2.aByteArray4974 = aByteArray4974;
	arg2.aShortArray4981 = aShortArray4981;
	arg2.aByte4977 = aByte4977;
	arg2.anIntArray4976 = anIntArray4976;
	arg2.anIntArray4964 = anIntArray4964;
	arg2.anIntArray4984 = anIntArray4984;
	arg2.anIntArrayArray5001 = anIntArrayArray5001;
	arg2.anIntArrayArray5002 = anIntArrayArray5002;
	arg2.aShortArray4983 = aShortArray4983;
	arg2.aShortArray4971 = aShortArray4971;
	arg2.aBoolean3690 = aBoolean3690;
	arg2.aBoolean4987 = false;
	return arg2;
    }
    
    public void method1865(int arg0) {
	int i = Class26.anInt611;
	int i_149_ = Class26.anInt607;
	int i_150_ = 0;
	int i_151_ = anIntArray4968[arg0];
	int i_152_ = anIntArray4990[arg0];
	int i_153_ = anIntArray4986[arg0];
	int i_154_ = anIntArray5041[i_151_];
	int i_155_ = anIntArray5041[i_152_];
	int i_156_ = anIntArray5041[i_153_];
	if (aByteArray4994 == null)
	    Class26.anInt610 = 0;
	else
	    Class26.anInt610 = aByteArray4994[arg0] & 0xff;
	if (i_154_ >= 50) {
	    anIntArray5032[i_150_] = anIntArray5038[i_151_];
	    anIntArray5033[i_150_] = anIntArray5031[i_151_];
	    anIntArray5019[i_150_++] = anIntArray4962[arg0] & 0xffff;
	} else {
	    int i_157_ = anIntArray5034[i_151_];
	    int i_158_ = anIntArray5020[i_151_];
	    int i_159_ = anIntArray4962[arg0] & 0xffff;
	    if (i_156_ >= 50) {
		int i_160_
		    = (50 - i_154_) * Class26.anIntArray616[i_156_ - i_154_];
		anIntArray5032[i_150_]
		    = i + (i_157_ + ((anIntArray5034[i_153_] - i_157_) * i_160_
				     >> 16)
			   << 9) / 50;
		anIntArray5033[i_150_]
		    = (i_149_
		       + (i_158_ + ((anIntArray5020[i_153_] - i_158_) * i_160_
				    >> 16)
			  << 9) / 50);
		anIntArray5019[i_150_++]
		    = (i_159_
		       + (((anIntArray4988[arg0] & 0xffff) - i_159_) * i_160_
			  >> 16));
	    }
	    if (i_155_ >= 50) {
		int i_161_
		    = (50 - i_154_) * Class26.anIntArray616[i_155_ - i_154_];
		anIntArray5032[i_150_]
		    = i + (i_157_ + ((anIntArray5034[i_152_] - i_157_) * i_161_
				     >> 16)
			   << 9) / 50;
		anIntArray5033[i_150_]
		    = (i_149_
		       + (i_158_ + ((anIntArray5020[i_152_] - i_158_) * i_161_
				    >> 16)
			  << 9) / 50);
		anIntArray5019[i_150_++]
		    = (i_159_
		       + (((anIntArray4989[arg0] & 0xffff) - i_159_) * i_161_
			  >> 16));
	    }
	}
	if (i_155_ >= 50) {
	    anIntArray5032[i_150_] = anIntArray5038[i_152_];
	    anIntArray5033[i_150_] = anIntArray5031[i_152_];
	    anIntArray5019[i_150_++] = anIntArray4989[arg0] & 0xffff;
	} else {
	    int i_162_ = anIntArray5034[i_152_];
	    int i_163_ = anIntArray5020[i_152_];
	    int i_164_ = anIntArray4989[arg0] & 0xffff;
	    if (i_154_ >= 50) {
		int i_165_
		    = (50 - i_155_) * Class26.anIntArray616[i_154_ - i_155_];
		anIntArray5032[i_150_]
		    = i + (i_162_ + ((anIntArray5034[i_151_] - i_162_) * i_165_
				     >> 16)
			   << 9) / 50;
		anIntArray5033[i_150_]
		    = (i_149_
		       + (i_163_ + ((anIntArray5020[i_151_] - i_163_) * i_165_
				    >> 16)
			  << 9) / 50);
		anIntArray5019[i_150_++]
		    = (i_164_
		       + (((anIntArray4962[arg0] & 0xffff) - i_164_) * i_165_
			  >> 16));
	    }
	    if (i_156_ >= 50) {
		int i_166_
		    = (50 - i_155_) * Class26.anIntArray616[i_156_ - i_155_];
		anIntArray5032[i_150_]
		    = i + (i_162_ + ((anIntArray5034[i_153_] - i_162_) * i_166_
				     >> 16)
			   << 9) / 50;
		anIntArray5033[i_150_]
		    = (i_149_
		       + (i_163_ + ((anIntArray5020[i_153_] - i_163_) * i_166_
				    >> 16)
			  << 9) / 50);
		anIntArray5019[i_150_++]
		    = (i_164_
		       + (((anIntArray4988[arg0] & 0xffff) - i_164_) * i_166_
			  >> 16));
	    }
	}
	if (i_156_ >= 50) {
	    anIntArray5032[i_150_] = anIntArray5038[i_153_];
	    anIntArray5033[i_150_] = anIntArray5031[i_153_];
	    anIntArray5019[i_150_++] = anIntArray4988[arg0] & 0xffff;
	} else {
	    int i_167_ = anIntArray5034[i_153_];
	    int i_168_ = anIntArray5020[i_153_];
	    int i_169_ = anIntArray4988[arg0] & 0xffff;
	    if (i_155_ >= 50) {
		int i_170_
		    = (50 - i_156_) * Class26.anIntArray616[i_155_ - i_156_];
		anIntArray5032[i_150_]
		    = i + (i_167_ + ((anIntArray5034[i_152_] - i_167_) * i_170_
				     >> 16)
			   << 9) / 50;
		anIntArray5033[i_150_]
		    = (i_149_
		       + (i_168_ + ((anIntArray5020[i_152_] - i_168_) * i_170_
				    >> 16)
			  << 9) / 50);
		anIntArray5019[i_150_++]
		    = (i_169_
		       + (((anIntArray4989[arg0] & 0xffff) - i_169_) * i_170_
			  >> 16));
	    }
	    if (i_154_ >= 50) {
		int i_171_
		    = (50 - i_156_) * Class26.anIntArray616[i_154_ - i_156_];
		anIntArray5032[i_150_]
		    = i + (i_167_ + ((anIntArray5034[i_151_] - i_167_) * i_171_
				     >> 16)
			   << 9) / 50;
		anIntArray5033[i_150_]
		    = (i_149_
		       + (i_168_ + ((anIntArray5020[i_151_] - i_168_) * i_171_
				    >> 16)
			  << 9) / 50);
		anIntArray5019[i_150_++]
		    = (i_169_
		       + (((anIntArray4962[arg0] & 0xffff) - i_169_) * i_171_
			  >> 16));
	    }
	}
	int i_172_ = anIntArray5032[0];
	int i_173_ = anIntArray5032[1];
	int i_174_ = anIntArray5032[2];
	int i_175_ = anIntArray5033[0];
	int i_176_ = anIntArray5033[1];
	int i_177_ = anIntArray5033[2];
	Class26.aBoolean615 = false;
	if (i_150_ == 3) {
	    if (i_172_ < 0 || i_173_ < 0 || i_174_ < 0
		|| i_172_ > Class26.anInt621 || i_173_ > Class26.anInt621
		|| i_174_ > Class26.anInt621)
		Class26.aBoolean615 = true;
	    if (aShortArray4981 == null || aShortArray4981[arg0] == -1) {
		if (anIntArray4988[arg0] == -1)
		    Class26.method249(i_175_, i_176_, i_177_, i_172_, i_173_,
				      i_174_,
				      (Class26.anIntArray620
				       [anIntArray4962[arg0] & 0xffff]));
		else
		    Class26.method244(i_175_, i_176_, i_177_, i_172_, i_173_,
				      i_174_, anIntArray5019[0],
				      anIntArray5019[1], anIntArray5019[2]);
	    } else {
		int i_178_;
		int i_179_;
		int i_180_;
		if (aByteArray4974 != null && aByteArray4974[arg0] != -1) {
		    int i_181_ = aByteArray4974[arg0] & 0xff;
		    i_178_ = anIntArray4976[i_181_];
		    i_179_ = anIntArray4964[i_181_];
		    i_180_ = anIntArray4984[i_181_];
		} else {
		    i_178_ = i_151_;
		    i_179_ = i_152_;
		    i_180_ = i_153_;
		}
		if (anIntArray4988[arg0] == -1)
		    Class26.method241
			(i_175_, i_176_, i_177_, i_172_, i_173_, i_174_,
			 anIntArray4962[arg0], anIntArray4962[arg0],
			 anIntArray4962[arg0], anIntArray5034[i_178_],
			 anIntArray5034[i_179_], anIntArray5034[i_180_],
			 anIntArray5020[i_178_], anIntArray5020[i_179_],
			 anIntArray5020[i_180_], anIntArray5041[i_178_],
			 anIntArray5041[i_179_], anIntArray5041[i_180_],
			 aShortArray4981[arg0]);
		else
		    Class26.method241(i_175_, i_176_, i_177_, i_172_, i_173_,
				      i_174_, anIntArray5019[0],
				      anIntArray5019[1], anIntArray5019[2],
				      anIntArray5034[i_178_],
				      anIntArray5034[i_179_],
				      anIntArray5034[i_180_],
				      anIntArray5020[i_178_],
				      anIntArray5020[i_179_],
				      anIntArray5020[i_180_],
				      anIntArray5041[i_178_],
				      anIntArray5041[i_179_],
				      anIntArray5041[i_180_],
				      aShortArray4981[arg0]);
	    }
	}
	if (i_150_ == 4) {
	    if (i_172_ < 0 || i_173_ < 0 || i_174_ < 0
		|| i_172_ > Class26.anInt621 || i_173_ > Class26.anInt621
		|| i_174_ > Class26.anInt621 || anIntArray5032[3] < 0
		|| anIntArray5032[3] > Class26.anInt621)
		Class26.aBoolean615 = true;
	    if (aShortArray4981 == null || aShortArray4981[arg0] == -1) {
		if (anIntArray4988[arg0] == -1) {
		    int i_182_
			= Class26.anIntArray620[anIntArray4962[arg0] & 0xffff];
		    Class26.method249(i_175_, i_176_, i_177_, i_172_, i_173_,
				      i_174_, i_182_);
		    Class26.method249(i_175_, i_177_, anIntArray5033[3],
				      i_172_, i_174_, anIntArray5032[3],
				      i_182_);
		} else {
		    Class26.method244(i_175_, i_176_, i_177_, i_172_, i_173_,
				      i_174_, anIntArray5019[0],
				      anIntArray5019[1], anIntArray5019[2]);
		    Class26.method244(i_175_, i_177_, anIntArray5033[3],
				      i_172_, i_174_, anIntArray5032[3],
				      anIntArray5019[0], anIntArray5019[2],
				      anIntArray5019[3]);
		}
	    } else {
		int i_183_;
		int i_184_;
		int i_185_;
		if (aByteArray4974 != null && aByteArray4974[arg0] != -1) {
		    int i_186_ = aByteArray4974[arg0] & 0xff;
		    i_183_ = anIntArray4976[i_186_];
		    i_184_ = anIntArray4964[i_186_];
		    i_185_ = anIntArray4984[i_186_];
		} else {
		    i_183_ = i_151_;
		    i_184_ = i_152_;
		    i_185_ = i_153_;
		}
		short i_187_ = aShortArray4981[arg0];
		if (anIntArray4988[arg0] == -1) {
		    Class26.method241(i_175_, i_176_, i_177_, i_172_, i_173_,
				      i_174_, anIntArray4962[arg0],
				      anIntArray4962[arg0],
				      anIntArray4962[arg0],
				      anIntArray5034[i_183_],
				      anIntArray5034[i_184_],
				      anIntArray5034[i_185_],
				      anIntArray5020[i_183_],
				      anIntArray5020[i_184_],
				      anIntArray5020[i_185_],
				      anIntArray5041[i_183_],
				      anIntArray5041[i_184_],
				      anIntArray5041[i_185_], i_187_);
		    Class26.method241
			(i_175_, i_177_, anIntArray5033[3], i_172_, i_174_,
			 anIntArray5032[3], anIntArray4962[arg0],
			 anIntArray4962[arg0], anIntArray4962[arg0],
			 anIntArray5034[i_183_], anIntArray5034[i_184_],
			 anIntArray5034[i_185_], anIntArray5020[i_183_],
			 anIntArray5020[i_184_], anIntArray5020[i_185_],
			 anIntArray5041[i_183_], anIntArray5041[i_184_],
			 anIntArray5041[i_185_], i_187_);
		} else {
		    Class26.method241(i_175_, i_176_, i_177_, i_172_, i_173_,
				      i_174_, anIntArray5019[0],
				      anIntArray5019[1], anIntArray5019[2],
				      anIntArray5034[i_183_],
				      anIntArray5034[i_184_],
				      anIntArray5034[i_185_],
				      anIntArray5020[i_183_],
				      anIntArray5020[i_184_],
				      anIntArray5020[i_185_],
				      anIntArray5041[i_183_],
				      anIntArray5041[i_184_],
				      anIntArray5041[i_185_], i_187_);
		    Class26.method241(i_175_, i_177_, anIntArray5033[3],
				      i_172_, i_174_, anIntArray5032[3],
				      anIntArray5019[0], anIntArray5019[2],
				      anIntArray5019[3],
				      anIntArray5034[i_183_],
				      anIntArray5034[i_184_],
				      anIntArray5034[i_185_],
				      anIntArray5020[i_183_],
				      anIntArray5020[i_184_],
				      anIntArray5020[i_185_],
				      anIntArray5041[i_183_],
				      anIntArray5041[i_184_],
				      anIntArray5041[i_185_], i_187_);
		}
	    }
	}
    }
    
    public Class131_Sub6 method1856(boolean arg0, boolean arg1, boolean arg2) {
	if (!arg0 && aByteArray5010.length < anInt4975)
	    aByteArray5010 = new byte[anInt4975 + 100];
	if (!arg1 && aShortArray5040.length < anInt4975) {
	    anIntArray5042 = new int[anInt4975 + 100];
	    anIntArray5012 = new int[anInt4975 + 100];
	    anIntArray5028 = new int[anInt4975 + 100];
	    aShortArray5040 = new short[anInt4975 + 100];
	}
	return method1864(arg0, arg1, aClass131_Sub6_Sub1_5005, aByteArray5010,
			  aShortArray5040, anIntArray5042, anIntArray5012,
			  anIntArray5028);
    }
    
    public void method1866(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7) {
	try {
	    if (!aBoolean4987)
		method1863();
	    int i = Class26.anInt611;
	    int i_188_ = Class26.anInt607;
	    int i_189_ = Class26.anIntArray617[arg0];
	    int i_190_ = Class26.anIntArray612[arg0];
	    int i_191_ = Class26.anIntArray617[arg1];
	    int i_192_ = Class26.anIntArray612[arg1];
	    int i_193_ = Class26.anIntArray617[arg2];
	    int i_194_ = Class26.anIntArray612[arg2];
	    int i_195_ = Class26.anIntArray617[arg3];
	    int i_196_ = Class26.anIntArray612[arg3];
	    int i_197_ = arg5 * i_195_ + arg6 * i_196_ >> 16;
	    for (int i_198_ = 0; i_198_ < anInt4980; i_198_++) {
		int i_199_ = anIntArray4997[i_198_];
		int i_200_ = anIntArray4967[i_198_];
		int i_201_ = anIntArray4972[i_198_];
		if (arg2 != 0) {
		    int i_202_ = i_200_ * i_193_ + i_199_ * i_194_ >> 16;
		    i_200_ = i_200_ * i_194_ - i_199_ * i_193_ >> 16;
		    i_199_ = i_202_;
		}
		if (arg0 != 0) {
		    int i_203_ = i_200_ * i_190_ - i_201_ * i_189_ >> 16;
		    i_201_ = i_200_ * i_189_ + i_201_ * i_190_ >> 16;
		    i_200_ = i_203_;
		}
		if (arg1 != 0) {
		    int i_204_ = i_201_ * i_191_ + i_199_ * i_192_ >> 16;
		    i_201_ = i_201_ * i_192_ - i_199_ * i_191_ >> 16;
		    i_199_ = i_204_;
		}
		i_199_ += arg4;
		i_200_ += arg5;
		i_201_ += arg6;
		int i_205_ = i_200_ * i_196_ - i_201_ * i_195_ >> 16;
		i_201_ = i_200_ * i_195_ + i_201_ * i_196_ >> 16;
		i_200_ = i_205_;
		anIntArray5030[i_198_] = i_201_ - i_197_;
		anIntArray5038[i_198_] = i + (i_199_ << 9) / arg7;
		anIntArray5031[i_198_] = i_188_ + (i_200_ << 9) / arg7;
		if (anInt4982 > 0) {
		    anIntArray5034[i_198_] = i_199_;
		    anIntArray5020[i_198_] = i_200_;
		    anIntArray5041[i_198_] = i_201_;
		}
	    }
	    method1861(false, false, 0L, aShort4969, aShort4969 << 1, null);
	} catch (RuntimeException runtimeexception) {
	    /* empty */
	}
    }
    
    public void method1845(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt4980; i++) {
	    anIntArray4997[i] = anIntArray4997[i] * arg0 / 128;
	    anIntArray4967[i] = anIntArray4967[i] * arg1 / 128;
	    anIntArray4972[i] = anIntArray4972[i] * arg2 / 128;
	}
	aBoolean4987 = false;
    }
    
    public Class131_Sub6 method1853(boolean arg0, boolean arg1, boolean arg2) {
	if (!arg0 && aByteArray4996.length < anInt4975)
	    aByteArray4996 = new byte[anInt4975 + 100];
	if (!arg1 && aShortArray4992.length < anInt4975) {
	    anIntArray4991 = new int[anInt4975 + 100];
	    anIntArray5000 = new int[anInt4975 + 100];
	    anIntArray4999 = new int[anInt4975 + 100];
	    aShortArray4992 = new short[anInt4975 + 100];
	}
	return method1864(arg0, arg1, aClass131_Sub6_Sub1_4961, aByteArray4996,
			  aShortArray4992, anIntArray4991, anIntArray5000,
			  anIntArray4999);
    }
    
    public void method1835(int arg0, int[] arg1, int arg2, int arg3, int arg4,
			   boolean arg5, int arg6, int[] arg7) {
	int i = arg1.length;
	if (arg0 == 0) {
	    int i_206_ = 0;
	    anInt5017 = 0;
	    anInt5039 = 0;
	    anInt5026 = 0;
	    for (int i_207_ = 0; i_207_ < i; i_207_++) {
		int i_208_ = arg1[i_207_];
		if (i_208_ < anIntArrayArray5001.length) {
		    int[] is = anIntArrayArray5001[i_208_];
		    for (int i_209_ = 0; i_209_ < is.length; i_209_++) {
			int i_210_ = is[i_209_];
			if (aShortArray4983 == null
			    || (arg6 & aShortArray4983[i_210_]) != 0) {
			    anInt5017 += anIntArray4997[i_210_];
			    anInt5039 += anIntArray4967[i_210_];
			    anInt5026 += anIntArray4972[i_210_];
			    i_206_++;
			}
		    }
		}
	    }
	    if (i_206_ > 0) {
		anInt5017 = anInt5017 / i_206_ + arg2;
		anInt5039 = anInt5039 / i_206_ + arg3;
		anInt5026 = anInt5026 / i_206_ + arg4;
		aBoolean5037 = true;
	    } else {
		anInt5017 = arg2;
		anInt5039 = arg3;
		anInt5026 = arg4;
	    }
	} else if (arg0 == 1) {
	    if (arg7 != null) {
		int i_211_
		    = (arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384
		       >> 15);
		int i_212_
		    = (arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384
		       >> 15);
		int i_213_
		    = (arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384
		       >> 15);
		arg2 = i_211_;
		arg3 = i_212_;
		arg4 = i_213_;
	    }
	    for (int i_214_ = 0; i_214_ < i; i_214_++) {
		int i_215_ = arg1[i_214_];
		if (i_215_ < anIntArrayArray5001.length) {
		    int[] is = anIntArrayArray5001[i_215_];
		    for (int i_216_ = 0; i_216_ < is.length; i_216_++) {
			int i_217_ = is[i_216_];
			if (aShortArray4983 == null
			    || (arg6 & aShortArray4983[i_217_]) != 0) {
			    anIntArray4997[i_217_] += arg2;
			    anIntArray4967[i_217_] += arg3;
			    anIntArray4972[i_217_] += arg4;
			}
		    }
		}
	    }
	} else if (arg0 == 2) {
	    if (arg7 != null) {
		int i_218_ = arg7[9];
		int i_219_ = arg7[10];
		int i_220_ = arg7[11];
		int i_221_ = arg7[12];
		int i_222_ = arg7[13];
		int i_223_ = arg7[14];
		if (aBoolean5037) {
		    int i_224_ = ((arg7[0] * anInt5017 + arg7[3] * anInt5039
				   + arg7[6] * anInt5026 + 16384)
				  >> 15);
		    int i_225_ = ((arg7[1] * anInt5017 + arg7[4] * anInt5039
				   + arg7[7] * anInt5026 + 16384)
				  >> 15);
		    int i_226_ = ((arg7[2] * anInt5017 + arg7[5] * anInt5039
				   + arg7[8] * anInt5026 + 16384)
				  >> 15);
		    i_224_ += i_221_;
		    i_225_ += i_222_;
		    i_226_ += i_223_;
		    anInt5017 = i_224_;
		    anInt5039 = i_225_;
		    anInt5026 = i_226_;
		    aBoolean5037 = false;
		}
		int[] is = new int[9];
		int i_227_ = Class26.anIntArray612[arg2] >> 1;
		int i_228_ = Class26.anIntArray617[arg2] >> 1;
		int i_229_ = Class26.anIntArray612[arg3] >> 1;
		int i_230_ = Class26.anIntArray617[arg3] >> 1;
		int i_231_ = Class26.anIntArray612[arg4] >> 1;
		int i_232_ = Class26.anIntArray617[arg4] >> 1;
		int i_233_ = i_228_ * i_231_ + 16384 >> 15;
		int i_234_ = i_228_ * i_232_ + 16384 >> 15;
		is[0] = i_229_ * i_231_ + i_230_ * i_234_ + 16384 >> 15;
		is[1] = -i_229_ * i_232_ + i_230_ * i_233_ + 16384 >> 15;
		is[2] = i_230_ * i_227_ + 16384 >> 15;
		is[3] = i_227_ * i_232_ + 16384 >> 15;
		is[4] = i_227_ * i_231_ + 16384 >> 15;
		is[5] = -i_228_;
		is[6] = -i_230_ * i_231_ + i_229_ * i_234_ + 16384 >> 15;
		is[7] = i_230_ * i_232_ + i_229_ * i_233_ + 16384 >> 15;
		is[8] = i_229_ * i_227_ + 16384 >> 15;
		int i_235_ = ((is[0] * -anInt5017 + is[1] * -anInt5039
			       + is[2] * -anInt5026 + 16384)
			      >> 15);
		int i_236_ = ((is[3] * -anInt5017 + is[4] * -anInt5039
			       + is[5] * -anInt5026 + 16384)
			      >> 15);
		int i_237_ = ((is[6] * -anInt5017 + is[7] * -anInt5039
			       + is[8] * -anInt5026 + 16384)
			      >> 15);
		int i_238_ = i_235_ + anInt5017;
		int i_239_ = i_236_ + anInt5039;
		int i_240_ = i_237_ + anInt5026;
		int[] is_241_ = new int[9];
		for (int i_242_ = 0; i_242_ < 3; i_242_++) {
		    for (int i_243_ = 0; i_243_ < 3; i_243_++) {
			int i_244_ = 0;
			for (int i_245_ = 0; i_245_ < 3; i_245_++)
			    i_244_ += (is[i_242_ * 3 + i_245_]
				       * arg7[i_243_ * 3 + i_245_]);
			is_241_[i_242_ * 3 + i_243_] = i_244_ + 16384 >> 15;
		    }
		}
		int i_246_
		    = (is[0] * i_221_ + is[1] * i_222_ + is[2] * i_223_ + 16384
		       >> 15);
		int i_247_
		    = (is[3] * i_221_ + is[4] * i_222_ + is[5] * i_223_ + 16384
		       >> 15);
		int i_248_
		    = (is[6] * i_221_ + is[7] * i_222_ + is[8] * i_223_ + 16384
		       >> 15);
		i_246_ += i_238_;
		i_247_ += i_239_;
		i_248_ += i_240_;
		int[] is_249_ = new int[9];
		for (int i_250_ = 0; i_250_ < 3; i_250_++) {
		    for (int i_251_ = 0; i_251_ < 3; i_251_++) {
			int i_252_ = 0;
			for (int i_253_ = 0; i_253_ < 3; i_253_++)
			    i_252_ += (arg7[i_250_ * 3 + i_253_]
				       * is_241_[i_251_ + i_253_ * 3]);
			is_249_[i_250_ * 3 + i_251_] = i_252_ + 16384 >> 15;
		    }
		}
		int i_254_ = ((arg7[0] * i_246_ + arg7[1] * i_247_
			       + arg7[2] * i_248_ + 16384)
			      >> 15);
		int i_255_ = ((arg7[3] * i_246_ + arg7[4] * i_247_
			       + arg7[5] * i_248_ + 16384)
			      >> 15);
		int i_256_ = ((arg7[6] * i_246_ + arg7[7] * i_247_
			       + arg7[8] * i_248_ + 16384)
			      >> 15);
		i_254_ += i_218_;
		i_255_ += i_219_;
		i_256_ += i_220_;
		for (int i_257_ = 0; i_257_ < i; i_257_++) {
		    int i_258_ = arg1[i_257_];
		    if (i_258_ < anIntArrayArray5001.length) {
			int[] is_259_ = anIntArrayArray5001[i_258_];
			for (int i_260_ = 0; i_260_ < is_259_.length;
			     i_260_++) {
			    int i_261_ = is_259_[i_260_];
			    if (aShortArray4983 == null
				|| (arg6 & aShortArray4983[i_261_]) != 0) {
				int i_262_
				    = ((is_249_[0] * anIntArray4997[i_261_]
					+ is_249_[1] * anIntArray4967[i_261_]
					+ is_249_[2] * anIntArray4972[i_261_]
					+ 16384)
				       >> 15);
				int i_263_
				    = ((is_249_[3] * anIntArray4997[i_261_]
					+ is_249_[4] * anIntArray4967[i_261_]
					+ is_249_[5] * anIntArray4972[i_261_]
					+ 16384)
				       >> 15);
				int i_264_
				    = ((is_249_[6] * anIntArray4997[i_261_]
					+ is_249_[7] * anIntArray4967[i_261_]
					+ is_249_[8] * anIntArray4972[i_261_]
					+ 16384)
				       >> 15);
				i_262_ += i_254_;
				i_263_ += i_255_;
				i_264_ += i_256_;
				anIntArray4997[i_261_] = i_262_;
				anIntArray4967[i_261_] = i_263_;
				anIntArray4972[i_261_] = i_264_;
			    }
			}
		    }
		}
	    } else {
		for (int i_265_ = 0; i_265_ < i; i_265_++) {
		    int i_266_ = arg1[i_265_];
		    if (i_266_ < anIntArrayArray5001.length) {
			int[] is = anIntArrayArray5001[i_266_];
			for (int i_267_ = 0; i_267_ < is.length; i_267_++) {
			    int i_268_ = is[i_267_];
			    if (aShortArray4983 == null
				|| (arg6 & aShortArray4983[i_268_]) != 0) {
				anIntArray4997[i_268_] -= anInt5017;
				anIntArray4967[i_268_] -= anInt5039;
				anIntArray4972[i_268_] -= anInt5026;
				if (arg4 != 0) {
				    int i_269_ = Class26.anIntArray617[arg4];
				    int i_270_ = Class26.anIntArray612[arg4];
				    int i_271_
					= ((anIntArray4967[i_268_] * i_269_
					    + anIntArray4997[i_268_] * i_270_
					    + 32767)
					   >> 16);
				    anIntArray4967[i_268_]
					= (anIntArray4967[i_268_] * i_270_
					   - anIntArray4997[i_268_] * i_269_
					   + 32767) >> 16;
				    anIntArray4997[i_268_] = i_271_;
				}
				if (arg2 != 0) {
				    int i_272_ = Class26.anIntArray617[arg2];
				    int i_273_ = Class26.anIntArray612[arg2];
				    int i_274_
					= ((anIntArray4967[i_268_] * i_273_
					    - anIntArray4972[i_268_] * i_272_
					    + 32767)
					   >> 16);
				    anIntArray4972[i_268_]
					= (anIntArray4967[i_268_] * i_272_
					   + anIntArray4972[i_268_] * i_273_
					   + 32767) >> 16;
				    anIntArray4967[i_268_] = i_274_;
				}
				if (arg3 != 0) {
				    int i_275_ = Class26.anIntArray617[arg3];
				    int i_276_ = Class26.anIntArray612[arg3];
				    int i_277_
					= ((anIntArray4972[i_268_] * i_275_
					    + anIntArray4997[i_268_] * i_276_
					    + 32767)
					   >> 16);
				    anIntArray4972[i_268_]
					= (anIntArray4972[i_268_] * i_276_
					   - anIntArray4997[i_268_] * i_275_
					   + 32767) >> 16;
				    anIntArray4997[i_268_] = i_277_;
				}
				anIntArray4997[i_268_] += anInt5017;
				anIntArray4967[i_268_] += anInt5039;
				anIntArray4972[i_268_] += anInt5026;
			    }
			}
		    }
		}
	    }
	} else if (arg0 == 3) {
	    if (arg7 != null) {
		int i_278_ = arg7[9];
		int i_279_ = arg7[10];
		int i_280_ = arg7[11];
		int i_281_ = arg7[12];
		int i_282_ = arg7[13];
		int i_283_ = arg7[14];
		if (aBoolean5037) {
		    int i_284_ = ((arg7[0] * anInt5017 + arg7[3] * anInt5039
				   + arg7[6] * anInt5026 + 16384)
				  >> 15);
		    int i_285_ = ((arg7[1] * anInt5017 + arg7[4] * anInt5039
				   + arg7[7] * anInt5026 + 16384)
				  >> 15);
		    int i_286_ = ((arg7[2] * anInt5017 + arg7[5] * anInt5039
				   + arg7[8] * anInt5026 + 16384)
				  >> 15);
		    i_284_ += i_281_;
		    i_285_ += i_282_;
		    i_286_ += i_283_;
		    anInt5017 = i_284_;
		    anInt5039 = i_285_;
		    anInt5026 = i_286_;
		    aBoolean5037 = false;
		}
		int i_287_ = arg2 << 15 >> 7;
		int i_288_ = arg3 << 15 >> 7;
		int i_289_ = arg4 << 15 >> 7;
		int i_290_ = i_287_ * -anInt5017 + 16384 >> 15;
		int i_291_ = i_288_ * -anInt5039 + 16384 >> 15;
		int i_292_ = i_289_ * -anInt5026 + 16384 >> 15;
		int i_293_ = i_290_ + anInt5017;
		int i_294_ = i_291_ + anInt5039;
		int i_295_ = i_292_ + anInt5026;
		int[] is = new int[9];
		is[0] = i_287_ * arg7[0] + 16384 >> 15;
		is[1] = i_287_ * arg7[3] + 16384 >> 15;
		is[2] = i_287_ * arg7[6] + 16384 >> 15;
		is[3] = i_288_ * arg7[1] + 16384 >> 15;
		is[4] = i_288_ * arg7[4] + 16384 >> 15;
		is[5] = i_288_ * arg7[7] + 16384 >> 15;
		is[6] = i_289_ * arg7[2] + 16384 >> 15;
		is[7] = i_289_ * arg7[5] + 16384 >> 15;
		is[8] = i_289_ * arg7[8] + 16384 >> 15;
		int i_296_ = i_287_ * i_281_ + 16384 >> 15;
		int i_297_ = i_288_ * i_282_ + 16384 >> 15;
		int i_298_ = i_289_ * i_283_ + 16384 >> 15;
		i_296_ += i_293_;
		i_297_ += i_294_;
		i_298_ += i_295_;
		int[] is_299_ = new int[9];
		for (int i_300_ = 0; i_300_ < 3; i_300_++) {
		    for (int i_301_ = 0; i_301_ < 3; i_301_++) {
			int i_302_ = 0;
			for (int i_303_ = 0; i_303_ < 3; i_303_++)
			    i_302_ += (arg7[i_300_ * 3 + i_303_]
				       * is[i_301_ + i_303_ * 3]);
			is_299_[i_300_ * 3 + i_301_] = i_302_ + 16384 >> 15;
		    }
		}
		int i_304_ = ((arg7[0] * i_296_ + arg7[1] * i_297_
			       + arg7[2] * i_298_ + 16384)
			      >> 15);
		int i_305_ = ((arg7[3] * i_296_ + arg7[4] * i_297_
			       + arg7[5] * i_298_ + 16384)
			      >> 15);
		int i_306_ = ((arg7[6] * i_296_ + arg7[7] * i_297_
			       + arg7[8] * i_298_ + 16384)
			      >> 15);
		i_304_ += i_278_;
		i_305_ += i_279_;
		i_306_ += i_280_;
		for (int i_307_ = 0; i_307_ < i; i_307_++) {
		    int i_308_ = arg1[i_307_];
		    if (i_308_ < anIntArrayArray5001.length) {
			int[] is_309_ = anIntArrayArray5001[i_308_];
			for (int i_310_ = 0; i_310_ < is_309_.length;
			     i_310_++) {
			    int i_311_ = is_309_[i_310_];
			    if (aShortArray4983 == null
				|| (arg6 & aShortArray4983[i_311_]) != 0) {
				int i_312_
				    = ((is_299_[0] * anIntArray4997[i_311_]
					+ is_299_[1] * anIntArray4967[i_311_]
					+ is_299_[2] * anIntArray4972[i_311_]
					+ 16384)
				       >> 15);
				int i_313_
				    = ((is_299_[3] * anIntArray4997[i_311_]
					+ is_299_[4] * anIntArray4967[i_311_]
					+ is_299_[5] * anIntArray4972[i_311_]
					+ 16384)
				       >> 15);
				int i_314_
				    = ((is_299_[6] * anIntArray4997[i_311_]
					+ is_299_[7] * anIntArray4967[i_311_]
					+ is_299_[8] * anIntArray4972[i_311_]
					+ 16384)
				       >> 15);
				i_312_ += i_304_;
				i_313_ += i_305_;
				i_314_ += i_306_;
				anIntArray4997[i_311_] = i_312_;
				anIntArray4967[i_311_] = i_313_;
				anIntArray4972[i_311_] = i_314_;
			    }
			}
		    }
		}
	    } else {
		for (int i_315_ = 0; i_315_ < i; i_315_++) {
		    int i_316_ = arg1[i_315_];
		    if (i_316_ < anIntArrayArray5001.length) {
			int[] is = anIntArrayArray5001[i_316_];
			for (int i_317_ = 0; i_317_ < is.length; i_317_++) {
			    int i_318_ = is[i_317_];
			    if (aShortArray4983 == null
				|| (arg6 & aShortArray4983[i_318_]) != 0) {
				anIntArray4997[i_318_] -= anInt5017;
				anIntArray4967[i_318_] -= anInt5039;
				anIntArray4972[i_318_] -= anInt5026;
				anIntArray4997[i_318_]
				    = anIntArray4997[i_318_] * arg2 / 128;
				anIntArray4967[i_318_]
				    = anIntArray4967[i_318_] * arg3 / 128;
				anIntArray4972[i_318_]
				    = anIntArray4972[i_318_] * arg4 / 128;
				anIntArray4997[i_318_] += anInt5017;
				anIntArray4967[i_318_] += anInt5039;
				anIntArray4972[i_318_] += anInt5026;
			    }
			}
		    }
		}
	    }
	} else if (arg0 == 5) {
	    if (anIntArrayArray5002 != null && aByteArray4994 != null) {
		for (int i_319_ = 0; i_319_ < i; i_319_++) {
		    int i_320_ = arg1[i_319_];
		    if (i_320_ < anIntArrayArray5002.length) {
			int[] is = anIntArrayArray5002[i_320_];
			for (int i_321_ = 0; i_321_ < is.length; i_321_++) {
			    int i_322_ = is[i_321_];
			    if (aShortArray4971 == null
				|| (arg6 & aShortArray4971[i_322_]) != 0) {
				int i_323_ = ((aByteArray4994[i_322_] & 0xff)
					      + arg2 * 8);
				if (i_323_ < 0)
				    i_323_ = 0;
				else if (i_323_ > 255)
				    i_323_ = 255;
				aByteArray4994[i_322_] = (byte) i_323_;
			    }
			}
		    }
		}
	    }
	} else if (arg0 == 7 && anIntArrayArray5002 != null) {
	    for (int i_324_ = 0; i_324_ < i; i_324_++) {
		int i_325_ = arg1[i_324_];
		if (i_325_ < anIntArrayArray5002.length) {
		    int[] is = anIntArrayArray5002[i_325_];
		    for (int i_326_ = 0; i_326_ < is.length; i_326_++) {
			int i_327_ = is[i_326_];
			if (aShortArray4971 == null
			    || (arg6 & aShortArray4971[i_327_]) != 0) {
			    int i_328_ = aShortArray4970[i_327_] & 0xffff;
			    int i_329_ = i_328_ >> 10 & 0x3f;
			    int i_330_ = i_328_ >> 7 & 0x7;
			    int i_331_ = i_328_ & 0x7f;
			    i_329_ = i_329_ + arg2 & 0x3f;
			    i_330_ += arg3;
			    if (i_330_ < 0)
				i_330_ = 0;
			    else if (i_330_ > 7)
				i_330_ = 7;
			    i_331_ += arg4;
			    if (i_331_ < 0)
				i_331_ = 0;
			    else if (i_331_ > 127)
				i_331_ = 127;
			    aShortArray4970[i_327_]
				= (short) (i_329_ << 10 | i_330_ << 7
					   | i_331_);
			}
		    }
		    aBoolean4963 = true;
		}
	    }
	}
    }
    
    public Class131_Sub6 method1833(boolean arg0, boolean arg1, boolean arg2) {
	if (!arg0 && aByteArray5006.length < anInt4975)
	    aByteArray5006 = new byte[anInt4975 + 100];
	if (!arg1 && aShortArray5007.length < anInt4975) {
	    anIntArray5004 = new int[anInt4975 + 100];
	    anIntArray5003 = new int[anInt4975 + 100];
	    anIntArray5008 = new int[anInt4975 + 100];
	    aShortArray5007 = new short[anInt4975 + 100];
	}
	return method1864(arg0, arg1, aClass131_Sub6_Sub1_4998, aByteArray5006,
			  aShortArray5007, anIntArray5004, anIntArray5003,
			  anIntArray5008);
    }
    
    public int method1838() {
	if (!aBoolean4987)
	    method1863();
	return aShort4979;
    }
    
    public int method1852() {
	if (!aBoolean4987)
	    method1863();
	return aShort4965;
    }
    
    public void method1843() {
	if (aBoolean4963) {
	    method1869();
	    aBoolean4963 = false;
	}
	aBoolean4987 = false;
    }
    
    public int method1830() {
	if (!aBoolean4987)
	    method1863();
	return aShort4978;
    }
    
    public int method1831() {
	if (!aBoolean4987)
	    method1863();
	return aShort4993;
    }
    
    public void method1828(int arg0, int[] arg1, int arg2, int arg3, int arg4,
			   boolean arg5) {
	int i = arg1.length;
	if (arg0 == 0) {
	    int i_332_ = 0;
	    anInt5017 = 0;
	    anInt5039 = 0;
	    anInt5026 = 0;
	    for (int i_333_ = 0; i_333_ < i; i_333_++) {
		int i_334_ = arg1[i_333_];
		if (i_334_ < anIntArrayArray5001.length) {
		    int[] is = anIntArrayArray5001[i_334_];
		    for (int i_335_ = 0; i_335_ < is.length; i_335_++) {
			int i_336_ = is[i_335_];
			anInt5017 += anIntArray4997[i_336_];
			anInt5039 += anIntArray4967[i_336_];
			anInt5026 += anIntArray4972[i_336_];
			i_332_++;
		    }
		}
	    }
	    if (i_332_ > 0) {
		anInt5017 = anInt5017 / i_332_ + arg2;
		anInt5039 = anInt5039 / i_332_ + arg3;
		anInt5026 = anInt5026 / i_332_ + arg4;
	    } else {
		anInt5017 = arg2;
		anInt5039 = arg3;
		anInt5026 = arg4;
	    }
	} else if (arg0 == 1) {
	    for (int i_337_ = 0; i_337_ < i; i_337_++) {
		int i_338_ = arg1[i_337_];
		if (i_338_ < anIntArrayArray5001.length) {
		    int[] is = anIntArrayArray5001[i_338_];
		    for (int i_339_ = 0; i_339_ < is.length; i_339_++) {
			int i_340_ = is[i_339_];
			anIntArray4997[i_340_] += arg2;
			anIntArray4967[i_340_] += arg3;
			anIntArray4972[i_340_] += arg4;
		    }
		}
	    }
	} else if (arg0 == 2) {
	    for (int i_341_ = 0; i_341_ < i; i_341_++) {
		int i_342_ = arg1[i_341_];
		if (i_342_ < anIntArrayArray5001.length) {
		    int[] is = anIntArrayArray5001[i_342_];
		    for (int i_343_ = 0; i_343_ < is.length; i_343_++) {
			int i_344_ = is[i_343_];
			anIntArray4997[i_344_] -= anInt5017;
			anIntArray4967[i_344_] -= anInt5039;
			anIntArray4972[i_344_] -= anInt5026;
			if (arg4 != 0) {
			    int i_345_ = Class26.anIntArray617[arg4];
			    int i_346_ = Class26.anIntArray612[arg4];
			    int i_347_
				= ((anIntArray4967[i_344_] * i_345_
				    + anIntArray4997[i_344_] * i_346_ + 32767)
				   >> 16);
			    anIntArray4967[i_344_]
				= ((anIntArray4967[i_344_] * i_346_
				    - anIntArray4997[i_344_] * i_345_ + 32767)
				   >> 16);
			    anIntArray4997[i_344_] = i_347_;
			}
			if (arg2 != 0) {
			    int i_348_ = Class26.anIntArray617[arg2];
			    int i_349_ = Class26.anIntArray612[arg2];
			    int i_350_
				= ((anIntArray4967[i_344_] * i_349_
				    - anIntArray4972[i_344_] * i_348_ + 32767)
				   >> 16);
			    anIntArray4972[i_344_]
				= ((anIntArray4967[i_344_] * i_348_
				    + anIntArray4972[i_344_] * i_349_ + 32767)
				   >> 16);
			    anIntArray4967[i_344_] = i_350_;
			}
			if (arg3 != 0) {
			    int i_351_ = Class26.anIntArray617[arg3];
			    int i_352_ = Class26.anIntArray612[arg3];
			    int i_353_
				= ((anIntArray4972[i_344_] * i_351_
				    + anIntArray4997[i_344_] * i_352_ + 32767)
				   >> 16);
			    anIntArray4972[i_344_]
				= ((anIntArray4972[i_344_] * i_352_
				    - anIntArray4997[i_344_] * i_351_ + 32767)
				   >> 16);
			    anIntArray4997[i_344_] = i_353_;
			}
			anIntArray4997[i_344_] += anInt5017;
			anIntArray4967[i_344_] += anInt5039;
			anIntArray4972[i_344_] += anInt5026;
		    }
		}
	    }
	} else if (arg0 == 3) {
	    for (int i_354_ = 0; i_354_ < i; i_354_++) {
		int i_355_ = arg1[i_354_];
		if (i_355_ < anIntArrayArray5001.length) {
		    int[] is = anIntArrayArray5001[i_355_];
		    for (int i_356_ = 0; i_356_ < is.length; i_356_++) {
			int i_357_ = is[i_356_];
			anIntArray4997[i_357_] -= anInt5017;
			anIntArray4967[i_357_] -= anInt5039;
			anIntArray4972[i_357_] -= anInt5026;
			anIntArray4997[i_357_]
			    = anIntArray4997[i_357_] * arg2 / 128;
			anIntArray4967[i_357_]
			    = anIntArray4967[i_357_] * arg3 / 128;
			anIntArray4972[i_357_]
			    = anIntArray4972[i_357_] * arg4 / 128;
			anIntArray4997[i_357_] += anInt5017;
			anIntArray4967[i_357_] += anInt5039;
			anIntArray4972[i_357_] += anInt5026;
		    }
		}
	    }
	} else if (arg0 == 5) {
	    if (anIntArrayArray5002 != null && aByteArray4994 != null) {
		for (int i_358_ = 0; i_358_ < i; i_358_++) {
		    int i_359_ = arg1[i_358_];
		    if (i_359_ < anIntArrayArray5002.length) {
			int[] is = anIntArrayArray5002[i_359_];
			for (int i_360_ = 0; i_360_ < is.length; i_360_++) {
			    int i_361_ = is[i_360_];
			    int i_362_
				= (aByteArray4994[i_361_] & 0xff) + arg2 * 8;
			    if (i_362_ < 0)
				i_362_ = 0;
			    else if (i_362_ > 255)
				i_362_ = 255;
			    aByteArray4994[i_361_] = (byte) i_362_;
			}
		    }
		}
	    }
	} else if (arg0 == 7 && anIntArrayArray5002 != null) {
	    for (int i_363_ = 0; i_363_ < i; i_363_++) {
		int i_364_ = arg1[i_363_];
		if (i_364_ < anIntArrayArray5002.length) {
		    int[] is = anIntArrayArray5002[i_364_];
		    for (int i_365_ = 0; i_365_ < is.length; i_365_++) {
			int i_366_ = is[i_365_];
			int i_367_ = aShortArray4970[i_366_] & 0xffff;
			int i_368_ = i_367_ >> 10 & 0x3f;
			int i_369_ = i_367_ >> 7 & 0x7;
			int i_370_ = i_367_ & 0x7f;
			i_368_ = i_368_ + arg2 & 0x3f;
			i_369_ += arg3;
			if (i_369_ < 0)
			    i_369_ = 0;
			else if (i_369_ > 7)
			    i_369_ = 7;
			i_370_ += arg4;
			if (i_370_ < 0)
			    i_370_ = 0;
			else if (i_370_ > 127)
			    i_370_ = 127;
			aShortArray4970[i_366_]
			    = (short) (i_368_ << 10 | i_369_ << 7 | i_370_);
		    }
		    aBoolean4963 = true;
		}
	    }
	}
    }
    
    public void method1867(int arg0) {
	if (aBooleanArray5027[arg0])
	    method1865(arg0);
	else {
	    int i = anIntArray4968[arg0];
	    int i_371_ = anIntArray4990[arg0];
	    int i_372_ = anIntArray4986[arg0];
	    Class26.aBoolean615 = aBooleanArray5018[arg0];
	    if (aByteArray4994 == null)
		Class26.anInt610 = 0;
	    else
		Class26.anInt610 = aByteArray4994[arg0] & 0xff;
	    if (aShortArray4981 == null || aShortArray4981[arg0] == -1) {
		if (anIntArray4988[arg0] == -1)
		    Class26.method249(anIntArray5031[i],
				      anIntArray5031[i_371_],
				      anIntArray5031[i_372_],
				      anIntArray5038[i],
				      anIntArray5038[i_371_],
				      anIntArray5038[i_372_],
				      (Class26.anIntArray620
				       [anIntArray4962[arg0] & 0xffff]));
		else
		    Class26.method244(anIntArray5031[i],
				      anIntArray5031[i_371_],
				      anIntArray5031[i_372_],
				      anIntArray5038[i],
				      anIntArray5038[i_371_],
				      anIntArray5038[i_372_],
				      anIntArray4962[arg0] & 0xffff,
				      anIntArray4989[arg0] & 0xffff,
				      anIntArray4988[arg0] & 0xffff);
	    } else {
		int i_373_;
		int i_374_;
		int i_375_;
		if (aByteArray4974 != null && aByteArray4974[arg0] != -1) {
		    int i_376_ = aByteArray4974[arg0] & 0xff;
		    i_373_ = anIntArray4976[i_376_];
		    i_374_ = anIntArray4964[i_376_];
		    i_375_ = anIntArray4984[i_376_];
		} else {
		    i_373_ = i;
		    i_374_ = i_371_;
		    i_375_ = i_372_;
		}
		if (anIntArray4988[arg0] == -1)
		    Class26.method241
			(anIntArray5031[i], anIntArray5031[i_371_],
			 anIntArray5031[i_372_], anIntArray5038[i],
			 anIntArray5038[i_371_], anIntArray5038[i_372_],
			 anIntArray4962[arg0], anIntArray4962[arg0],
			 anIntArray4962[arg0], anIntArray5034[i_373_],
			 anIntArray5034[i_374_], anIntArray5034[i_375_],
			 anIntArray5020[i_373_], anIntArray5020[i_374_],
			 anIntArray5020[i_375_], anIntArray5041[i_373_],
			 anIntArray5041[i_374_], anIntArray5041[i_375_],
			 aShortArray4981[arg0]);
		else
		    Class26.method241
			(anIntArray5031[i], anIntArray5031[i_371_],
			 anIntArray5031[i_372_], anIntArray5038[i],
			 anIntArray5038[i_371_], anIntArray5038[i_372_],
			 anIntArray4962[arg0], anIntArray4989[arg0],
			 anIntArray4988[arg0], anIntArray5034[i_373_],
			 anIntArray5034[i_374_], anIntArray5034[i_375_],
			 anIntArray5020[i_373_], anIntArray5020[i_374_],
			 anIntArray5020[i_375_], anIntArray5041[i_373_],
			 anIntArray5041[i_374_], anIntArray5041[i_375_],
			 aShortArray4981[arg0]);
	    }
	}
    }
    
    public static int method1868(int arg0, int arg1) {
	arg1 = arg1 * (arg0 & 0x7f) >> 7;
	if (arg1 < 2)
	    arg1 = 2;
	else if (arg1 > 126)
	    arg1 = 126;
	return (arg0 & 0xff80) + arg1;
    }
    
    public void method1764(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8, int arg9,
			   Class61_Sub1 arg10) {
	if (!aBoolean4987)
	    method1863();
	int i = arg7 * arg4 - arg5 * arg3 >> 16;
	int i_377_ = arg6 * arg1 + i * arg2 >> 16;
	int i_378_ = i_377_ + (aShort4979 * arg2 + aShort4973 * arg1 >> 16);
	int i_379_ = i_377_ + (-aShort4979 * arg2 + aShort4966 * arg1 >> 16);
	if (i_378_ > 50 && i_379_ < 3500) {
	    int i_380_ = arg7 * arg3 + arg5 * arg4 >> 16;
	    int i_381_ = i_380_ + aShort4979 << 9;
	    if (i_381_ / i_378_ > Class101.anInt1990) {
		int i_382_ = i_380_ - aShort4979 << 9;
		if (i_382_ / i_378_ < Class67_Sub1_Sub34.anInt4336) {
		    int i_383_ = arg6 * arg2 - i * arg1 >> 16;
		    int i_384_
			= (i_383_ + (aShort4979 * arg1 + aShort4973 * arg2
				     >> 16)
			   << 9);
		    if (i_384_ / i_378_ > Applet_Sub1.anInt12) {
			int i_385_
			    = (i_383_ + (-aShort4979 * arg1 + aShort4966 * arg2
					 >> 16)
			       << 9);
			if (i_385_ / i_378_ < Class49.anInt1011) {
			    boolean bool = false;
			    boolean bool_386_ = i_379_ <= 50;
			    boolean bool_387_ = bool_386_ || anInt4982 > 0;
			    int i_388_ = Class26.anInt611;
			    int i_389_ = Class26.anInt607;
			    int i_390_ = 0;
			    int i_391_ = 0;
			    if (arg0 != 0) {
				i_390_ = Class26.anIntArray617[arg0];
				i_391_ = Class26.anIntArray612[arg0];
			    }
			    boolean bool_392_ = false;
			    if (arg8 > 0L && Class96.aBoolean1924
				&& i_379_ > 0) {
				int i_393_;
				int i_394_;
				if (i_380_ > 0) {
				    i_393_ = i_382_ / i_378_;
				    i_394_ = i_381_ / i_379_;
				} else {
				    i_393_ = i_382_ / i_379_;
				    i_394_ = i_381_ / i_378_;
				}
				int i_395_;
				int i_396_;
				if (i_383_ > 0) {
				    i_395_ = i_385_ / i_378_;
				    i_396_ = i_384_ / i_379_;
				} else {
				    i_395_ = i_385_ / i_379_;
				    i_396_ = i_384_ / i_378_;
				}
				if (PacketParser.anInt2107 >= i_393_
				    && PacketParser.anInt2107 <= i_394_
				    && Class129.anInt2392 >= i_395_
				    && Class129.anInt2392 <= i_396_) {
				    i_393_ = 999999;
				    i_394_ = -999999;
				    i_395_ = 999999;
				    i_396_ = -999999;
				    int[] is = { aShort4993, aShort4978,
						  aShort4993, aShort4978,
						  aShort4993, aShort4978,
						  aShort4993, aShort4978 };
				    int[] is_397_
					= { aShort4995, aShort4995,
					     aShort4965, aShort4965,
					     aShort4995, aShort4995,
					     aShort4965, aShort4965 };
				    int[] is_398_
					= { aShort4966, aShort4966,
					     aShort4966, aShort4966,
					     aShort4973, aShort4973,
					     aShort4973, aShort4973 };
				    for (int i_399_ = 0; i_399_ < 8;
					 i_399_++) {
					int i_400_ = is[i_399_];
					int i_401_ = is_398_[i_399_];
					int i_402_ = is_397_[i_399_];
					if (arg0 != 0) {
					    int i_403_ = ((i_402_ * i_390_
							   + i_400_ * i_391_)
							  >> 16);
					    i_402_ = (i_402_ * i_391_
						      - i_400_ * i_390_) >> 16;
					    i_400_ = i_403_;
					}
					i_400_ += arg5;
					i_401_ += arg6;
					i_402_ += arg7;
					int i_404_
					    = (i_402_ * arg3 + i_400_ * arg4
					       >> 16);
					i_402_ = (i_402_ * arg4 - i_400_ * arg3
						  >> 16);
					i_400_ = i_404_;
					i_404_ = (i_401_ * arg2 - i_402_ * arg1
						  >> 16);
					i_402_ = (i_401_ * arg1 + i_402_ * arg2
						  >> 16);
					i_401_ = i_404_;
					if (i_402_ > 0) {
					    int i_405_
						= (i_400_ << 9) / i_402_;
					    int i_406_
						= (i_401_ << 9) / i_402_;
					    if (i_405_ < i_393_)
						i_393_ = i_405_;
					    if (i_405_ > i_394_)
						i_394_ = i_405_;
					    if (i_406_ < i_395_)
						i_395_ = i_406_;
					    if (i_406_ > i_396_)
						i_396_ = i_406_;
					}
				    }
				    if (PacketParser.anInt2107 >= i_393_
					&& PacketParser.anInt2107 <= i_394_
					&& Class129.anInt2392 >= i_395_
					&& Class129.anInt2392 <= i_396_) {
					if (aBoolean3690)
					    Class67_Sub1_Sub22
						.aLongArray4178
						[Class27.anInt641++]
						= arg8;
					else
					    bool_392_ = true;
				    }
				}
			    }
			    for (int i_407_ = 0; i_407_ < anInt4980;
				 i_407_++) {
				int i_408_ = anIntArray4997[i_407_];
				int i_409_ = anIntArray4967[i_407_];
				int i_410_ = anIntArray4972[i_407_];
				if (arg0 != 0) {
				    int i_411_
					= (i_410_ * i_390_ + i_408_ * i_391_
					   >> 16);
				    i_410_ = (i_410_ * i_391_ - i_408_ * i_390_
					      >> 16);
				    i_408_ = i_411_;
				}
				i_408_ += arg5;
				i_409_ += arg6;
				i_410_ += arg7;
				int i_412_
				    = i_410_ * arg3 + i_408_ * arg4 >> 16;
				i_410_ = i_410_ * arg4 - i_408_ * arg3 >> 16;
				i_408_ = i_412_;
				i_412_ = i_409_ * arg2 - i_410_ * arg1 >> 16;
				i_410_ = i_409_ * arg1 + i_410_ * arg2 >> 16;
				i_409_ = i_412_;
				anIntArray5030[i_407_] = i_410_ - i_377_;
				if (i_410_ >= 50) {
				    anIntArray5038[i_407_]
					= i_388_ + (i_408_ << 9) / i_410_;
				    anIntArray5031[i_407_]
					= i_389_ + (i_409_ << 9) / i_410_;
				} else {
				    anIntArray5038[i_407_] = -5000;
				    bool = true;
				}
				if (bool_387_) {
				    anIntArray5034[i_407_] = i_408_;
				    anIntArray5020[i_407_] = i_409_;
				    anIntArray5041[i_407_] = i_410_;
				}
			    }
			    try {
				method1861(bool, bool_392_, arg8,
					   i_377_ - i_379_,
					   i_378_ - i_379_ + 2, arg10);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method1839() {
	for (int i = 0; i < anInt4980; i++) {
	    int i_413_ = anIntArray4997[i];
	    anIntArray4997[i] = anIntArray4972[i];
	    anIntArray4972[i] = -i_413_;
	}
	aBoolean4987 = false;
    }
    
    public void method1847(int arg0) {
	int i = Class26.anIntArray617[arg0];
	int i_414_ = Class26.anIntArray612[arg0];
	for (int i_415_ = 0; i_415_ < anInt4980; i_415_++) {
	    int i_416_
		= (anIntArray4967[i_415_] * i_414_ - anIntArray4972[i_415_] * i
		   >> 16);
	    anIntArray4972[i_415_]
		= (anIntArray4967[i_415_] * i + anIntArray4972[i_415_] * i_414_
		   >> 16);
	    anIntArray4967[i_415_] = i_416_;
	}
	aBoolean4987 = false;
    }
    
    public void method1841(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, long arg7) {
	try {
	    if (!aBoolean4987)
		method1863();
	    int i = Class26.anInt611;
	    int i_417_ = Class26.anInt607;
	    int i_418_ = Class26.anIntArray617[arg0];
	    int i_419_ = Class26.anIntArray612[arg0];
	    int i_420_ = Class26.anIntArray617[arg1];
	    int i_421_ = Class26.anIntArray612[arg1];
	    int i_422_ = Class26.anIntArray617[arg2];
	    int i_423_ = Class26.anIntArray612[arg2];
	    int i_424_ = Class26.anIntArray617[arg3];
	    int i_425_ = Class26.anIntArray612[arg3];
	    int i_426_ = arg5 * i_424_ + arg6 * i_425_ >> 16;
	    for (int i_427_ = 0; i_427_ < anInt4980; i_427_++) {
		int i_428_ = anIntArray4997[i_427_];
		int i_429_ = anIntArray4967[i_427_];
		int i_430_ = anIntArray4972[i_427_];
		if (arg2 != 0) {
		    int i_431_ = i_429_ * i_422_ + i_428_ * i_423_ >> 16;
		    i_429_ = i_429_ * i_423_ - i_428_ * i_422_ >> 16;
		    i_428_ = i_431_;
		}
		if (arg0 != 0) {
		    int i_432_ = i_429_ * i_419_ - i_430_ * i_418_ >> 16;
		    i_430_ = i_429_ * i_418_ + i_430_ * i_419_ >> 16;
		    i_429_ = i_432_;
		}
		if (arg1 != 0) {
		    int i_433_ = i_430_ * i_420_ + i_428_ * i_421_ >> 16;
		    i_430_ = i_430_ * i_421_ - i_428_ * i_420_ >> 16;
		    i_428_ = i_433_;
		}
		i_428_ += arg4;
		i_429_ += arg5;
		i_430_ += arg6;
		int i_434_ = i_429_ * i_425_ - i_430_ * i_424_ >> 16;
		i_430_ = i_429_ * i_424_ + i_430_ * i_425_ >> 16;
		i_429_ = i_434_;
		anIntArray5030[i_427_] = i_430_ - i_426_;
		anIntArray5038[i_427_] = i + (i_428_ << 9) / i_430_;
		anIntArray5031[i_427_] = i_417_ + (i_429_ << 9) / i_430_;
		if (anInt4982 > 0) {
		    anIntArray5034[i_427_] = i_428_;
		    anIntArray5020[i_427_] = i_429_;
		    anIntArray5041[i_427_] = i_430_;
		}
	    }
	    method1861(false, arg7 >= 0L, arg7, aShort4969, aShort4969 << 1,
		       null);
	} catch (RuntimeException runtimeexception) {
	    /* empty */
	}
    }
    
    public void method1869() {
	for (int i = 0; i < anInt4975; i++) {
	    short i_435_
		= aShortArray4981 != null ? aShortArray4981[i] : (short) -1;
	    if (i_435_ == -1) {
		int i_436_ = aShortArray4970[i] & 0xffff;
		if (anIntArray4988[i] == -1) {
		    int i_437_ = anIntArray4962[i] & ~0x1ffff;
		    anIntArray4962[i]
			= i_437_ | method1868(i_436_, i_437_ >> 17);
		} else if (anIntArray4988[i] != -2) {
		    int i_438_ = anIntArray4962[i] & ~0x1ffff;
		    anIntArray4962[i]
			= i_438_ | method1868(i_436_, i_438_ >> 17);
		    i_438_ = anIntArray4989[i] & ~0x1ffff;
		    anIntArray4989[i]
			= i_438_ | method1868(i_436_, i_438_ >> 17);
		    i_438_ = anIntArray4988[i] & ~0x1ffff;
		    anIntArray4988[i]
			= i_438_ | method1868(i_436_, i_438_ >> 17);
		}
	    }
	}
    }
    
    public Class131_Sub6_Sub1() {
	anInt4980 = 0;
	aByte4977 = (byte) 0;
	anInt4975 = 0;
	aBoolean4963 = false;
	aBoolean4987 = false;
    }
    
    public Class131_Sub6_Sub1(Class131_Sub2 arg0, int arg1, int arg2, int arg3,
			      int arg4, int arg5) {
	anInt4980 = 0;
	aByte4977 = (byte) 0;
	anInt4975 = 0;
	aBoolean4963 = false;
	aBoolean4987 = false;
	arg0.method1782();
	arg0.method1801();
	anInt4980 = arg0.anInt3548;
	anIntArray4997 = arg0.anIntArray3542;
	anIntArray4967 = arg0.anIntArray3541;
	anIntArray4972 = arg0.anIntArray3575;
	anInt4975 = arg0.anInt3554;
	anIntArray4968 = arg0.anIntArray3558;
	anIntArray4990 = arg0.anIntArray3569;
	anIntArray4986 = arg0.anIntArray3564;
	aByteArray4985 = arg0.aByteArray3585;
	aByteArray4994 = arg0.aByteArray3551;
	aByte4977 = arg0.aByte3587;
	aShortArray4970 = arg0.aShortArray3545;
	anIntArrayArray5001 = arg0.anIntArrayArray3568;
	anIntArrayArray5002 = arg0.anIntArrayArray3588;
	aShortArray4971 = arg0.aShortArray3553;
	aShortArray4983 = arg0.aShortArray3539;
	int i = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4
					  + arg5 * arg5));
	int i_439_ = arg2 * i >> 8;
	anIntArray4962 = new int[anInt4975];
	anIntArray4989 = new int[anInt4975];
	anIntArray4988 = new int[anInt4975];
	if (arg0.aShortArray3563 != null) {
	    aShortArray4981 = new short[anInt4975];
	    for (int i_440_ = 0; i_440_ < anInt4975; i_440_++) {
		short i_441_ = arg0.aShortArray3563[i_440_];
		if (i_441_ != -1
		    && Class26.anInterface3_623.method8(0, i_441_))
		    aShortArray4981[i_440_] = i_441_;
		else
		    aShortArray4981[i_440_] = (short) -1;
	    }
	} else
	    aShortArray4981 = null;
	if (arg0.anInt3573 > 0 && arg0.aByteArray3567 != null) {
	    int[] is = new int[arg0.anInt3573];
	    for (int i_442_ = 0; i_442_ < anInt4975; i_442_++) {
		if (arg0.aByteArray3567[i_442_] != -1)
		    is[arg0.aByteArray3567[i_442_] & 0xff]++;
	    }
	    anInt4982 = 0;
	    for (int i_443_ = 0; i_443_ < arg0.anInt3573; i_443_++) {
		if (is[i_443_] > 0 && arg0.aByteArray3560[i_443_] == 0)
		    anInt4982++;
	    }
	    anIntArray4976 = new int[anInt4982];
	    anIntArray4964 = new int[anInt4982];
	    anIntArray4984 = new int[anInt4982];
	    int i_444_ = 0;
	    for (int i_445_ = 0; i_445_ < arg0.anInt3573; i_445_++) {
		if (is[i_445_] > 0 && arg0.aByteArray3560[i_445_] == 0) {
		    anIntArray4976[i_444_]
			= arg0.aShortArray3547[i_445_] & 0xffff;
		    anIntArray4964[i_444_]
			= arg0.aShortArray3561[i_445_] & 0xffff;
		    anIntArray4984[i_444_]
			= arg0.aShortArray3557[i_445_] & 0xffff;
		    is[i_445_] = i_444_++;
		} else
		    is[i_445_] = -1;
	    }
	    aByteArray4974 = new byte[anInt4975];
	    for (int i_446_ = 0; i_446_ < anInt4975; i_446_++) {
		if (arg0.aByteArray3567[i_446_] != -1) {
		    aByteArray4974[i_446_]
			= (byte) is[arg0.aByteArray3567[i_446_] & 0xff];
		    if (aByteArray4974[i_446_] == -1
			&& aShortArray4981 != null)
			aShortArray4981[i_446_] = (short) -1;
		} else
		    aByteArray4974[i_446_] = (byte) -1;
	    }
	}
	for (int i_447_ = 0; i_447_ < anInt4975; i_447_++) {
	    byte i_448_;
	    if (arg0.aByteArray3576 == null)
		i_448_ = (byte) 0;
	    else
		i_448_ = arg0.aByteArray3576[i_447_];
	    byte i_449_;
	    if (arg0.aByteArray3551 == null)
		i_449_ = (byte) 0;
	    else
		i_449_ = arg0.aByteArray3551[i_447_];
	    short i_450_;
	    if (aShortArray4981 == null)
		i_450_ = (short) -1;
	    else
		i_450_ = aShortArray4981[i_447_];
	    if (i_449_ == -2)
		i_448_ = (byte) 3;
	    if (i_449_ == -1)
		i_448_ = (byte) 2;
	    if (i_450_ == -1) {
		if (i_448_ == 0) {
		    int i_451_ = arg0.aShortArray3545[i_447_] & 0xffff;
		    Class44 class44;
		    if (arg0.aClass44Array3589 != null
			&& (arg0.aClass44Array3589[anIntArray4968[i_447_]]
			    != null))
			class44
			    = arg0.aClass44Array3589[anIntArray4968[i_447_]];
		    else
			class44
			    = arg0.aClass44Array3565[anIntArray4968[i_447_]];
		    int i_452_ = (arg1 + ((arg3 * class44.anInt915
					   + arg4 * class44.anInt920
					   + arg5 * class44.anInt911)
					  / (i_439_ * class44.anInt922))
				  << 17);
		    anIntArray4962[i_447_]
			= i_452_ | method1868(i_451_, i_452_ >> 17);
		    if (arg0.aClass44Array3589 != null
			&& (arg0.aClass44Array3589[anIntArray4990[i_447_]]
			    != null))
			class44
			    = arg0.aClass44Array3589[anIntArray4990[i_447_]];
		    else
			class44
			    = arg0.aClass44Array3565[anIntArray4990[i_447_]];
		    i_452_ = arg1 + ((arg3 * class44.anInt915
				      + arg4 * class44.anInt920
				      + arg5 * class44.anInt911)
				     / (i_439_ * class44.anInt922)) << 17;
		    anIntArray4989[i_447_]
			= i_452_ | method1868(i_451_, i_452_ >> 17);
		    if (arg0.aClass44Array3589 != null
			&& (arg0.aClass44Array3589[anIntArray4986[i_447_]]
			    != null))
			class44
			    = arg0.aClass44Array3589[anIntArray4986[i_447_]];
		    else
			class44
			    = arg0.aClass44Array3565[anIntArray4986[i_447_]];
		    i_452_ = arg1 + ((arg3 * class44.anInt915
				      + arg4 * class44.anInt920
				      + arg5 * class44.anInt911)
				     / (i_439_ * class44.anInt922)) << 17;
		    anIntArray4988[i_447_]
			= i_452_ | method1868(i_451_, i_452_ >> 17);
		} else if (i_448_ == 1) {
		    Class52 class52 = arg0.aClass52Array3550[i_447_];
		    int i_453_ = (arg1 + ((arg3 * class52.anInt1054
					   + arg4 * class52.anInt1056
					   + arg5 * class52.anInt1052)
					  / (i_439_ + i_439_ / 2))
				  << 17);
		    anIntArray4962[i_447_]
			= (i_453_
			   | method1868(arg0.aShortArray3545[i_447_] & 0xffff,
					i_453_ >> 17));
		    anIntArray4988[i_447_] = -1;
		} else if (i_448_ == 3) {
		    anIntArray4962[i_447_] = 128;
		    anIntArray4988[i_447_] = -1;
		} else
		    anIntArray4988[i_447_] = -2;
	    } else if (i_448_ == 0) {
		Class44 class44;
		if (arg0.aClass44Array3589 != null
		    && arg0.aClass44Array3589[anIntArray4968[i_447_]] != null)
		    class44 = arg0.aClass44Array3589[anIntArray4968[i_447_]];
		else
		    class44 = arg0.aClass44Array3565[anIntArray4968[i_447_]];
		int i_454_ = arg1 + ((arg3 * class44.anInt915
				      + arg4 * class44.anInt920
				      + arg5 * class44.anInt911)
				     / (i_439_ * class44.anInt922));
		anIntArray4962[i_447_] = method1858(i_454_);
		if (arg0.aClass44Array3589 != null
		    && arg0.aClass44Array3589[anIntArray4990[i_447_]] != null)
		    class44 = arg0.aClass44Array3589[anIntArray4990[i_447_]];
		else
		    class44 = arg0.aClass44Array3565[anIntArray4990[i_447_]];
		i_454_ = arg1 + ((arg3 * class44.anInt915
				  + arg4 * class44.anInt920
				  + arg5 * class44.anInt911)
				 / (i_439_ * class44.anInt922));
		anIntArray4989[i_447_] = method1858(i_454_);
		if (arg0.aClass44Array3589 != null
		    && arg0.aClass44Array3589[anIntArray4986[i_447_]] != null)
		    class44 = arg0.aClass44Array3589[anIntArray4986[i_447_]];
		else
		    class44 = arg0.aClass44Array3565[anIntArray4986[i_447_]];
		i_454_ = arg1 + ((arg3 * class44.anInt915
				  + arg4 * class44.anInt920
				  + arg5 * class44.anInt911)
				 / (i_439_ * class44.anInt922));
		anIntArray4988[i_447_] = method1858(i_454_);
	    } else if (i_448_ == 1) {
		Class52 class52 = arg0.aClass52Array3550[i_447_];
		int i_455_
		    = (arg1
		       + (arg3 * class52.anInt1054 + arg4 * class52.anInt1056
			  + arg5 * class52.anInt1052) / (i_439_ + i_439_ / 2));
		anIntArray4962[i_447_] = method1858(i_455_);
		anIntArray4988[i_447_] = -1;
	    } else
		anIntArray4988[i_447_] = -2;
	}
    }
    
    public Class131_Sub6_Sub1(Class131_Sub6_Sub1[] arg0, int arg1) {
	anInt4980 = 0;
	aByte4977 = (byte) 0;
	anInt4975 = 0;
	aBoolean4963 = false;
	aBoolean4987 = false;
	boolean bool = false;
	boolean bool_456_ = false;
	boolean bool_457_ = false;
	boolean bool_458_ = false;
	anInt4980 = 0;
	anInt4975 = 0;
	anInt4982 = 0;
	boolean bool_459_ = false;
	boolean bool_460_ = false;
	aByte4977 = (byte) -1;
	for (int i = 0; i < arg1; i++) {
	    Class131_Sub6_Sub1 class131_sub6_sub1 = arg0[i];
	    if (class131_sub6_sub1 != null) {
		anInt4980 += class131_sub6_sub1.anInt4980;
		anInt4975 += class131_sub6_sub1.anInt4975;
		anInt4982 += class131_sub6_sub1.anInt4982;
		if (class131_sub6_sub1.aByteArray4985 != null)
		    bool = true;
		else {
		    if (aByte4977 == -1)
			aByte4977 = class131_sub6_sub1.aByte4977;
		    if (aByte4977 != class131_sub6_sub1.aByte4977)
			bool = true;
		}
		bool_456_
		    = bool_456_ | class131_sub6_sub1.aByteArray4994 != null;
		bool_457_
		    = bool_457_ | class131_sub6_sub1.aShortArray4981 != null;
		bool_458_
		    = bool_458_ | class131_sub6_sub1.aByteArray4974 != null;
	    }
	}
	anIntArray4997 = new int[anInt4980];
	anIntArray4967 = new int[anInt4980];
	anIntArray4972 = new int[anInt4980];
	anIntArray4968 = new int[anInt4975];
	anIntArray4990 = new int[anInt4975];
	anIntArray4986 = new int[anInt4975];
	anIntArray4962 = new int[anInt4975];
	anIntArray4989 = new int[anInt4975];
	anIntArray4988 = new int[anInt4975];
	if (bool)
	    aByteArray4985 = new byte[anInt4975];
	if (bool_456_)
	    aByteArray4994 = new byte[anInt4975];
	if (bool_457_)
	    aShortArray4981 = new short[anInt4975];
	if (bool_458_)
	    aByteArray4974 = new byte[anInt4975];
	if (anInt4982 > 0) {
	    anIntArray4976 = new int[anInt4982];
	    anIntArray4964 = new int[anInt4982];
	    anIntArray4984 = new int[anInt4982];
	}
	aShortArray4970 = new short[anInt4975];
	anInt4980 = 0;
	anInt4975 = 0;
	anInt4982 = 0;
	bool_460_ = false;
	bool_459_ = false;
	for (int i = 0; i < arg1; i++) {
	    Class131_Sub6_Sub1 class131_sub6_sub1 = arg0[i];
	    if (class131_sub6_sub1 != null) {
		for (int i_461_ = 0; i_461_ < class131_sub6_sub1.anInt4975;
		     i_461_++) {
		    anIntArray4968[anInt4975]
			= (class131_sub6_sub1.anIntArray4968[i_461_]
			   + anInt4980);
		    anIntArray4990[anInt4975]
			= (class131_sub6_sub1.anIntArray4990[i_461_]
			   + anInt4980);
		    anIntArray4986[anInt4975]
			= (class131_sub6_sub1.anIntArray4986[i_461_]
			   + anInt4980);
		    anIntArray4962[anInt4975]
			= class131_sub6_sub1.anIntArray4962[i_461_];
		    anIntArray4989[anInt4975]
			= class131_sub6_sub1.anIntArray4989[i_461_];
		    anIntArray4988[anInt4975]
			= class131_sub6_sub1.anIntArray4988[i_461_];
		    aShortArray4970[anInt4975]
			= class131_sub6_sub1.aShortArray4970[i_461_];
		    if (bool) {
			if (class131_sub6_sub1.aByteArray4985 != null)
			    aByteArray4985[anInt4975]
				= class131_sub6_sub1.aByteArray4985[i_461_];
			else
			    aByteArray4985[anInt4975]
				= class131_sub6_sub1.aByte4977;
		    }
		    if (bool_456_ && class131_sub6_sub1.aByteArray4994 != null)
			aByteArray4994[anInt4975]
			    = class131_sub6_sub1.aByteArray4994[i_461_];
		    if (bool_457_) {
			if (class131_sub6_sub1.aShortArray4981 != null)
			    aShortArray4981[anInt4975]
				= class131_sub6_sub1.aShortArray4981[i_461_];
			else
			    aShortArray4981[anInt4975] = (short) -1;
		    }
		    if (bool_458_) {
			if (class131_sub6_sub1.aByteArray4974 != null
			    && class131_sub6_sub1.aByteArray4974[i_461_] != -1)
			    aByteArray4974[anInt4975]
				= (byte) ((class131_sub6_sub1.aByteArray4974
					   [i_461_])
					  + anInt4982);
			else
			    aByteArray4974[anInt4975] = (byte) -1;
		    }
		    anInt4975++;
		}
		for (int i_462_ = 0; i_462_ < class131_sub6_sub1.anInt4982;
		     i_462_++) {
		    anIntArray4976[anInt4982]
			= (class131_sub6_sub1.anIntArray4976[i_462_]
			   + anInt4980);
		    anIntArray4964[anInt4982]
			= (class131_sub6_sub1.anIntArray4964[i_462_]
			   + anInt4980);
		    anIntArray4984[anInt4982]
			= (class131_sub6_sub1.anIntArray4984[i_462_]
			   + anInt4980);
		    anInt4982++;
		}
		for (int i_463_ = 0; i_463_ < class131_sub6_sub1.anInt4980;
		     i_463_++) {
		    anIntArray4997[anInt4980]
			= class131_sub6_sub1.anIntArray4997[i_463_];
		    anIntArray4967[anInt4980]
			= class131_sub6_sub1.anIntArray4967[i_463_];
		    anIntArray4972[anInt4980]
			= class131_sub6_sub1.anIntArray4972[i_463_];
		    anInt4980++;
		}
	    }
	}
    }
    
    static {
	anIntArray4991 = new int[1];
	anIntArray4999 = new int[1];
	anIntArray5000 = new int[1];
	aByteArray4996 = new byte[1];
	aClass131_Sub6_Sub1_4998 = new Class131_Sub6_Sub1();
	anIntArray5003 = new int[1];
	anIntArray5004 = new int[1];
	aShortArray5007 = new short[1];
	aByteArray5006 = new byte[1];
	anIntArray5008 = new int[1];
	aClass131_Sub6_Sub1_5005 = new Class131_Sub6_Sub1();
	aByteArray5010 = new byte[1];
	anIntArray5012 = new int[1];
	aBooleanArray5018 = new boolean[4096];
	anIntArray5022 = new int[4096];
	anInt5015 = 0;
	aBooleanArray5027 = new boolean[4096];
	anIntArray5020 = new int[4096];
	anIntArray5030 = new int[4096];
	anIntArray5025 = new int[4096];
	anIntArrayArray5024 = new int[12][4096];
	anIntArray5029 = new int[8192];
	anIntArray5034 = new int[4096];
	aBoolean5035 = false;
	anIntArray5036 = new int[12];
	aBoolean5037 = false;
	aShortArray5040 = new short[1];
	anIntArray5028 = new int[1];
	anIntArray5032 = new int[10];
	if (aBoolean5035) {
	    anIntArray5009 = new int[4096];
	    anIntArray5021 = new int[4096];
	} else {
	    anIntArray5011 = new int[1600];
	    anIntArrayArray5014 = new int[1600][64];
	    anIntArray5013 = new int[32];
	    anIntArrayArray5023 = new int[32][512];
	}
	anIntArray5016 = new int[12];
	anIntArray5019 = new int[10];
	anIntArray5033 = new int[10];
	anIntArray5041 = new int[4096];
	anIntArray5038 = new int[4096];
	anIntArray5031 = new int[4096];
	anIntArray5042 = new int[1];
    }
}
