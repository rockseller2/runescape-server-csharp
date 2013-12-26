/* Class67_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub18 extends Class67
{
    public static float[] aFloatArray3110;
    public int anInt3111;
    public static Class59[] aClass59Array3112;
    public boolean aBoolean3113;
    public static float[] aFloatArray3114;
    public int anInt3115;
    public int anInt3116;
    public int anInt3117;
    public static Class29[] aClass29Array3118;
    public boolean aBoolean3119;
    public int anInt3120;
    public static int[] anIntArray3121;
    public static int anInt3122;
    public static float[] aFloatArray3123;
    public static int anInt3124;
    public float[] aFloatArray3125;
    public static boolean[] aBooleanArray3126;
    public static Class77[] aClass77Array3127;
    public static boolean aBoolean3128 = false;
    public static float[] aFloatArray3129;
    public static int anInt3130;
    public byte[][] aByteArrayArray3131;
    public static float[] aFloatArray3132;
    public static int[] anIntArray3133;
    public static int anInt3134;
    public static int[] anIntArray3135;
    public int anInt3136;
    public static byte[] aByteArray3137;
    public static float[] aFloatArray3138;
    public int anInt3139;
    public byte[] aByteArray3140;
    public static float[] aFloatArray3141;
    public static Class46[] aClass46Array3142;
    public int anInt3143;
    
    public static void method1251() {
	aByteArray3137 = null;
	aClass29Array3118 = null;
	aClass77Array3127 = null;
	aClass59Array3112 = null;
	aClass46Array3142 = null;
	aBooleanArray3126 = null;
	anIntArray3135 = null;
	aFloatArray3132 = null;
	aFloatArray3129 = null;
	aFloatArray3110 = null;
	aFloatArray3141 = null;
	aFloatArray3123 = null;
	aFloatArray3138 = null;
	aFloatArray3114 = null;
	anIntArray3133 = null;
	anIntArray3121 = null;
    }
    
    public static int method1252() {
	int i = aByteArray3137[anInt3124] >> anInt3130 & 0x1;
	anInt3130++;
	anInt3124 += anInt3130 >> 3;
	anInt3130 &= 0x7;
	return i;
    }
    
    public void method1253(byte[] arg0) {
	Stream Stream = new Stream(arg0);
	anInt3117 = Stream.readInt((byte) 126);
	anInt3136 = Stream.readInt((byte) 125);
	anInt3116 = Stream.readInt((byte) 125);
	anInt3120 = Stream.readInt((byte) 126);
	if (anInt3120 < 0) {
	    anInt3120 = anInt3120 ^ 0xffffffff;
	    aBoolean3113 = true;
	}
	int i = Stream.readInt((byte) 126);
	aByteArrayArray3131 = new byte[i][];
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    int i_1_ = 0;
	    int i_2_;
	    do {
		i_2_ = Stream.readByte((byte) -44);
		i_1_ += i_2_;
	    } while (i_2_ >= 255);
	    byte[] is = new byte[i_1_];
	    Stream.readBytes(i_1_, 0, -2, is);
	    aByteArrayArray3131[i_0_] = is;
	}
    }
    
    public Class67_Sub13_Sub1 method1254(int[] arg0) {
	if (arg0 != null && arg0[0] <= 0)
	    return null;
	if (aByteArray3140 == null) {
	    anInt3111 = 0;
	    aFloatArray3125 = new float[anInt3122];
	    aByteArray3140 = new byte[anInt3136];
	    anInt3139 = 0;
	    anInt3143 = 0;
	}
	for (/**/; anInt3143 < aByteArrayArray3131.length; anInt3143++) {
	    if (arg0 != null && arg0[0] <= 0)
		return null;
	    float[] fs = method1260(anInt3143);
	    if (fs != null) {
		int i = anInt3139;
		int i_3_ = fs.length;
		if (i_3_ > anInt3136 - i)
		    i_3_ = anInt3136 - i;
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
		    int i_5_ = (int) (128.0F + fs[i_4_] * 128.0F);
		    if ((i_5_ & ~0xff) != 0)
			i_5_ = (i_5_ ^ 0xffffffff) >> 31;
		    aByteArray3140[i++] = (byte) (i_5_ - 128);
		}
		if (arg0 != null)
		    arg0[0] -= i - anInt3139;
		anInt3139 = i;
	    }
	}
	aFloatArray3125 = null;
	byte[] is = aByteArray3140;
	aByteArray3140 = null;
	return new Class67_Sub13_Sub1(anInt3117, is, anInt3116, anInt3120,
				      aBoolean3113);
    }
    
    public static void method1255(byte[] arg0) {
	method1257(arg0, 0);
	anInt3134 = 1 << method1259(4);
	anInt3122 = 1 << method1259(4);
	aFloatArray3132 = new float[anInt3122];
	for (int i = 0; i < 2; i++) {
	    int i_6_ = i != 0 ? anInt3122 : anInt3134;
	    int i_7_ = i_6_ >> 1;
	    int i_8_ = i_6_ >> 2;
	    int i_9_ = i_6_ >> 3;
	    float[] fs = new float[i_7_];
	    for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
		fs[2 * i_10_]
		    = (float) Math.cos((double) (4 * i_10_) * 3.141592653589793
				       / (double) i_6_);
		fs[2 * i_10_ + 1]
		    = -(float) Math.sin((double) (4 * i_10_)
					* 3.141592653589793 / (double) i_6_);
	    }
	    float[] fs_11_ = new float[i_7_];
	    for (int i_12_ = 0; i_12_ < i_8_; i_12_++) {
		fs_11_[2 * i_12_] = (float) Math.cos((double) (2 * i_12_ + 1)
						     * 3.141592653589793
						     / (double) (2 * i_6_));
		fs_11_[2 * i_12_ + 1]
		    = (float) Math.sin((double) (2 * i_12_ + 1)
				       * 3.141592653589793
				       / (double) (2 * i_6_));
	    }
	    float[] fs_13_ = new float[i_8_];
	    for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
		fs_13_[2 * i_14_]
		    = (float) Math.cos((double) (4 * i_14_ + 2)
				       * 3.141592653589793 / (double) i_6_);
		fs_13_[2 * i_14_ + 1]
		    = -(float) Math.sin((double) (4 * i_14_ + 2)
					* 3.141592653589793 / (double) i_6_);
	    }
	    int[] is = new int[i_9_];
	    int i_15_ = Class76.method1400((byte) -22, i_9_ - 1);
	    for (int i_16_ = 0; i_16_ < i_9_; i_16_++)
		is[i_16_] = Class14.method161(120, i_16_, i_15_);
	    if (i != 0) {
		aFloatArray3123 = fs;
		aFloatArray3138 = fs_11_;
		aFloatArray3114 = fs_13_;
		anIntArray3121 = is;
	    } else {
		aFloatArray3129 = fs;
		aFloatArray3110 = fs_11_;
		aFloatArray3141 = fs_13_;
		anIntArray3133 = is;
	    }
	}
	int i = method1259(8) + 1;
	aClass29Array3118 = new Class29[i];
	for (int i_17_ = 0; i_17_ < i; i_17_++)
	    aClass29Array3118[i_17_] = new Class29();
	int i_18_ = method1259(6) + 1;
	for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
	    method1259(16);
	int i_20_ = method1259(6) + 1;
	aClass77Array3127 = new Class77[i_20_];
	for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
	    aClass77Array3127[i_21_] = new Class77();
	int i_22_ = method1259(6) + 1;
	aClass59Array3112 = new Class59[i_22_];
	for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
	    aClass59Array3112[i_23_] = new Class59();
	int i_24_ = method1259(6) + 1;
	aClass46Array3142 = new Class46[i_24_];
	for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
	    aClass46Array3142[i_25_] = new Class46();
	int i_26_ = method1259(6) + 1;
	aBooleanArray3126 = new boolean[i_26_];
	anIntArray3135 = new int[i_26_];
	for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
	    aBooleanArray3126[i_27_] = method1252() != 0;
	    method1259(16);
	    method1259(16);
	    anIntArray3135[i_27_] = method1259(8);
	}
    }
    
    public static boolean method1256(Class9 arg0) {
	if (!aBoolean3128) {
	    byte[] is = arg0.method138(-809612665, 0, 0);
	    if (is == null)
		return false;
	    method1255(is);
	    aBoolean3128 = true;
	}
	return true;
    }
    
    public static void method1257(byte[] arg0, int arg1) {
	aByteArray3137 = arg0;
	anInt3124 = arg1;
	anInt3130 = 0;
    }
    
    public static Class67_Sub18 method1258(Class9 arg0, int arg1, int arg2) {
	if (!method1256(arg0)) {
	    arg0.method117(true, arg1, arg2);
	    return null;
	}
	byte[] is = arg0.method138(-809612665, arg2, arg1);
	if (is == null)
	    return null;
	return new Class67_Sub18(is);
    }
    
    public static int method1259(int arg0) {
	int i = 0;
	int i_28_ = 0;
	int i_29_;
	for (/**/; arg0 >= 8 - anInt3130; arg0 -= i_29_) {
	    i_29_ = 8 - anInt3130;
	    int i_30_ = (1 << i_29_) - 1;
	    i += (aByteArray3137[anInt3124] >> anInt3130 & i_30_) << i_28_;
	    anInt3130 = 0;
	    anInt3124++;
	    i_28_ += i_29_;
	}
	if (arg0 > 0) {
	    i_29_ = (1 << arg0) - 1;
	    i += (aByteArray3137[anInt3124] >> anInt3130 & i_29_) << i_28_;
	    anInt3130 += arg0;
	}
	return i;
    }
    
    public float[] method1260(int arg0) {
	method1257(aByteArrayArray3131[arg0], 0);
	method1252();
	int i = method1259(Class76.method1400((byte) -22,
					      anIntArray3135.length - 1));
	boolean bool = aBooleanArray3126[i];
	int i_31_ = bool ? anInt3122 : anInt3134;
	boolean bool_32_ = false;
	boolean bool_33_ = false;
	if (bool) {
	    bool_32_ = method1252() != 0;
	    bool_33_ = method1252() != 0;
	}
	int i_34_ = i_31_ >> 1;
	int i_35_;
	int i_36_;
	int i_37_;
	if (bool && !bool_32_) {
	    i_35_ = (i_31_ >> 2) - (anInt3134 >> 2);
	    i_36_ = (i_31_ >> 2) + (anInt3134 >> 2);
	    i_37_ = anInt3134 >> 1;
	} else {
	    i_35_ = 0;
	    i_36_ = i_34_;
	    i_37_ = i_31_ >> 1;
	}
	int i_38_;
	int i_39_;
	int i_40_;
	if (bool && !bool_33_) {
	    i_38_ = i_31_ - (i_31_ >> 2) - (anInt3134 >> 2);
	    i_39_ = i_31_ - (i_31_ >> 2) + (anInt3134 >> 2);
	    i_40_ = anInt3134 >> 1;
	} else {
	    i_38_ = i_34_;
	    i_39_ = i_31_;
	    i_40_ = i_31_ >> 1;
	}
	Class46 class46 = aClass46Array3142[anIntArray3135[i]];
	int i_41_ = class46.anInt949;
	int i_42_ = class46.anIntArray948[i_41_];
	boolean bool_43_ = !aClass77Array3127[i_42_].method1403();
	boolean bool_44_ = bool_43_;
	for (int i_45_ = 0; i_45_ < class46.anInt951; i_45_++) {
	    Class59 class59 = aClass59Array3112[class46.anIntArray950[i_45_]];
	    float[] fs = aFloatArray3132;
	    class59.method493(fs, i_31_ >> 1, bool_44_);
	}
	if (!bool_43_) {
	    int i_46_ = class46.anInt949;
	    int i_47_ = class46.anIntArray948[i_46_];
	    aClass77Array3127[i_47_].method1407(aFloatArray3132, i_31_ >> 1);
	}
	if (bool_43_) {
	    for (int i_48_ = i_31_ >> 1; i_48_ < i_31_; i_48_++)
		aFloatArray3132[i_48_] = 0.0F;
	} else {
	    int i_49_ = i_31_ >> 1;
	    int i_50_ = i_31_ >> 2;
	    int i_51_ = i_31_ >> 3;
	    float[] fs = aFloatArray3132;
	    for (int i_52_ = 0; i_52_ < i_49_; i_52_++)
		fs[i_52_] *= 0.5F;
	    for (int i_53_ = i_49_; i_53_ < i_31_; i_53_++)
		fs[i_53_] = -fs[i_31_ - i_53_ - 1];
	    float[] fs_54_ = bool ? aFloatArray3123 : aFloatArray3129;
	    float[] fs_55_ = bool ? aFloatArray3138 : aFloatArray3110;
	    float[] fs_56_ = bool ? aFloatArray3114 : aFloatArray3141;
	    int[] is = bool ? anIntArray3121 : anIntArray3133;
	    for (int i_57_ = 0; i_57_ < i_50_; i_57_++) {
		float f = fs[4 * i_57_] - fs[i_31_ - 4 * i_57_ - 1];
		float f_58_ = fs[4 * i_57_ + 2] - fs[i_31_ - 4 * i_57_ - 3];
		float f_59_ = fs_54_[2 * i_57_];
		float f_60_ = fs_54_[2 * i_57_ + 1];
		fs[i_31_ - 4 * i_57_ - 1] = f * f_59_ - f_58_ * f_60_;
		fs[i_31_ - 4 * i_57_ - 3] = f * f_60_ + f_58_ * f_59_;
	    }
	    for (int i_61_ = 0; i_61_ < i_51_; i_61_++) {
		float f = fs[i_49_ + 3 + 4 * i_61_];
		float f_62_ = fs[i_49_ + 1 + 4 * i_61_];
		float f_63_ = fs[4 * i_61_ + 3];
		float f_64_ = fs[4 * i_61_ + 1];
		fs[i_49_ + 3 + 4 * i_61_] = f + f_63_;
		fs[i_49_ + 1 + 4 * i_61_] = f_62_ + f_64_;
		float f_65_ = fs_54_[i_49_ - 4 - 4 * i_61_];
		float f_66_ = fs_54_[i_49_ - 3 - 4 * i_61_];
		fs[4 * i_61_ + 3]
		    = (f - f_63_) * f_65_ - (f_62_ - f_64_) * f_66_;
		fs[4 * i_61_ + 1]
		    = (f_62_ - f_64_) * f_65_ + (f - f_63_) * f_66_;
	    }
	    int i_67_ = Class76.method1400((byte) -22, i_31_ - 1);
	    for (int i_68_ = 0; i_68_ < i_67_ - 3; i_68_++) {
		int i_69_ = i_31_ >> i_68_ + 2;
		int i_70_ = 8 << i_68_;
		for (int i_71_ = 0; i_71_ < 2 << i_68_; i_71_++) {
		    int i_72_ = i_31_ - i_69_ * 2 * i_71_;
		    int i_73_ = i_31_ - i_69_ * (2 * i_71_ + 1);
		    for (int i_74_ = 0; i_74_ < i_31_ >> i_68_ + 4; i_74_++) {
			int i_75_ = 4 * i_74_;
			float f = fs[i_72_ - 1 - i_75_];
			float f_76_ = fs[i_72_ - 3 - i_75_];
			float f_77_ = fs[i_73_ - 1 - i_75_];
			float f_78_ = fs[i_73_ - 3 - i_75_];
			fs[i_72_ - 1 - i_75_] = f + f_77_;
			fs[i_72_ - 3 - i_75_] = f_76_ + f_78_;
			float f_79_ = fs_54_[i_74_ * i_70_];
			float f_80_ = fs_54_[i_74_ * i_70_ + 1];
			fs[i_73_ - 1 - i_75_]
			    = (f - f_77_) * f_79_ - (f_76_ - f_78_) * f_80_;
			fs[i_73_ - 3 - i_75_]
			    = (f_76_ - f_78_) * f_79_ + (f - f_77_) * f_80_;
		    }
		}
	    }
	    for (int i_81_ = 1; i_81_ < i_51_ - 1; i_81_++) {
		int i_82_ = is[i_81_];
		if (i_81_ < i_82_) {
		    int i_83_ = 8 * i_81_;
		    int i_84_ = 8 * i_82_;
		    float f = fs[i_83_ + 1];
		    fs[i_83_ + 1] = fs[i_84_ + 1];
		    fs[i_84_ + 1] = f;
		    f = fs[i_83_ + 3];
		    fs[i_83_ + 3] = fs[i_84_ + 3];
		    fs[i_84_ + 3] = f;
		    f = fs[i_83_ + 5];
		    fs[i_83_ + 5] = fs[i_84_ + 5];
		    fs[i_84_ + 5] = f;
		    f = fs[i_83_ + 7];
		    fs[i_83_ + 7] = fs[i_84_ + 7];
		    fs[i_84_ + 7] = f;
		}
	    }
	    for (int i_85_ = 0; i_85_ < i_49_; i_85_++)
		fs[i_85_] = fs[2 * i_85_ + 1];
	    for (int i_86_ = 0; i_86_ < i_51_; i_86_++) {
		fs[i_31_ - 1 - 2 * i_86_] = fs[4 * i_86_];
		fs[i_31_ - 2 - 2 * i_86_] = fs[4 * i_86_ + 1];
		fs[i_31_ - i_50_ - 1 - 2 * i_86_] = fs[4 * i_86_ + 2];
		fs[i_31_ - i_50_ - 2 - 2 * i_86_] = fs[4 * i_86_ + 3];
	    }
	    for (int i_87_ = 0; i_87_ < i_51_; i_87_++) {
		float f = fs_56_[2 * i_87_];
		float f_88_ = fs_56_[2 * i_87_ + 1];
		float f_89_ = fs[i_49_ + 2 * i_87_];
		float f_90_ = fs[i_49_ + 2 * i_87_ + 1];
		float f_91_ = fs[i_31_ - 2 - 2 * i_87_];
		float f_92_ = fs[i_31_ - 1 - 2 * i_87_];
		float f_93_ = f_88_ * (f_89_ - f_91_) + f * (f_90_ + f_92_);
		fs[i_49_ + 2 * i_87_] = (f_89_ + f_91_ + f_93_) * 0.5F;
		fs[i_31_ - 2 - 2 * i_87_] = (f_89_ + f_91_ - f_93_) * 0.5F;
		f_93_ = f_88_ * (f_90_ + f_92_) - f * (f_89_ - f_91_);
		fs[i_49_ + 2 * i_87_ + 1] = (f_90_ - f_92_ + f_93_) * 0.5F;
		fs[i_31_ - 1 - 2 * i_87_] = (-f_90_ + f_92_ + f_93_) * 0.5F;
	    }
	    for (int i_94_ = 0; i_94_ < i_50_; i_94_++) {
		fs[i_94_]
		    = (fs[2 * i_94_ + i_49_] * fs_55_[2 * i_94_]
		       + fs[2 * i_94_ + 1 + i_49_] * fs_55_[2 * i_94_ + 1]);
		fs[i_49_ - 1 - i_94_]
		    = (fs[2 * i_94_ + i_49_] * fs_55_[2 * i_94_ + 1]
		       - fs[2 * i_94_ + 1 + i_49_] * fs_55_[2 * i_94_]);
	    }
	    for (int i_95_ = 0; i_95_ < i_50_; i_95_++)
		fs[i_31_ - i_50_ + i_95_] = -fs[i_95_];
	    for (int i_96_ = 0; i_96_ < i_50_; i_96_++)
		fs[i_96_] = fs[i_50_ + i_96_];
	    for (int i_97_ = 0; i_97_ < i_50_; i_97_++)
		fs[i_50_ + i_97_] = -fs[i_50_ - i_97_ - 1];
	    for (int i_98_ = 0; i_98_ < i_50_; i_98_++)
		fs[i_49_ + i_98_] = fs[i_31_ - i_98_ - 1];
	    for (int i_99_ = i_35_; i_99_ < i_36_; i_99_++) {
		float f = (float) Math.sin(((double) (i_99_ - i_35_) + 0.5)
					   / (double) i_37_ * 0.5
					   * 3.141592653589793);
		aFloatArray3132[i_99_]
		    *= (float) Math.sin(1.5707963267948966 * (double) f
					* (double) f);
	    }
	    for (int i_100_ = i_38_; i_100_ < i_39_; i_100_++) {
		float f = (float) Math.sin((((double) (i_100_ - i_38_) + 0.5)
					    / (double) i_40_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		aFloatArray3132[i_100_]
		    *= (float) Math.sin(1.5707963267948966 * (double) f
					* (double) f);
	    }
	}
	float[] fs = null;
	if (anInt3111 > 0) {
	    int i_101_ = anInt3111 + i_31_ >> 2;
	    fs = new float[i_101_];
	    if (!aBoolean3119) {
		for (int i_102_ = 0; i_102_ < anInt3115; i_102_++) {
		    int i_103_ = (anInt3111 >> 1) + i_102_;
		    fs[i_102_] += aFloatArray3125[i_103_];
		}
	    }
	    if (!bool_43_) {
		for (int i_104_ = i_35_; i_104_ < i_31_ >> 1; i_104_++) {
		    int i_105_ = fs.length - (i_31_ >> 1) + i_104_;
		    fs[i_105_] += aFloatArray3132[i_104_];
		}
	    }
	}
	float[] fs_106_ = aFloatArray3125;
	aFloatArray3125 = aFloatArray3132;
	aFloatArray3132 = fs_106_;
	anInt3111 = i_31_;
	anInt3115 = i_39_ - (i_31_ >> 1);
	aBoolean3119 = bool_43_;
	return fs;
    }
    
    public static float method1261(int arg0) {
	int i = arg0 & 0x1fffff;
	int i_107_ = arg0 & ~0x7fffffff;
	int i_108_ = (arg0 & 0x7fe00000) >> 21;
	if (i_107_ != 0)
	    i = -i;
	return (float) ((double) i * Math.pow(2.0, (double) (i_108_ - 788)));
    }
    
    public Class67_Sub18(byte[] arg0) {
	method1253(arg0);
    }
}
