public class Class29
{
    public float[][] aFloatArrayArray686;
    public int[] anIntArray687;
    public int anInt688;
    public int anInt689;
    public int[] anIntArray690;
    public int[] anIntArray691;
    
    public static int method278(int arg0, int arg1) {
	int i;
	for (i = (int) Math.pow((double) arg0, 1.0 / (double) arg1) + 1;
	     Class67_Sub5.method822(i, arg1, (byte) 113) > arg0; i--) {
	    /* empty */
	}
	return i;
    }
    
    public float[] method279() {
	return aFloatArrayArray686[method281()];
    }
    
    public void method280() {
	int[] is = new int[anInt688];
	int[] is_0_ = new int[33];
	for (int i = 0; i < anInt688; i++) {
	    int i_1_ = anIntArray687[i];
	    if (i_1_ != 0) {
		int i_2_ = 1 << 32 - i_1_;
		int i_3_ = is_0_[i_1_];
		is[i] = i_3_;
		int i_4_;
		if ((i_3_ & i_2_) != 0)
		    i_4_ = is_0_[i_1_ - 1];
		else {
		    i_4_ = i_3_ | i_2_;
		    for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
			int i_6_ = is_0_[i_5_];
			if (i_6_ != i_3_)
			    break;
			int i_7_ = 1 << 32 - i_5_;
			if ((i_6_ & i_7_) != 0) {
			    is_0_[i_5_] = is_0_[i_5_ - 1];
			    break;
			}
			is_0_[i_5_] = i_6_ | i_7_;
		    }
		}
		is_0_[i_1_] = i_4_;
		for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
		    int i_9_ = is_0_[i_8_];
		    if (i_9_ == i_3_)
			is_0_[i_8_] = i_4_;
		}
	    }
	}
	anIntArray691 = new int[8];
	int i = 0;
	for (int i_10_ = 0; i_10_ < anInt688; i_10_++) {
	    int i_11_ = anIntArray687[i_10_];
	    if (i_11_ != 0) {
		int i_12_ = is[i_10_];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
		    int i_15_ = -2147483648 >>> i_14_;
		    if ((i_12_ & i_15_) != 0) {
			if (anIntArray691[i_13_] == 0)
			    anIntArray691[i_13_] = i;
			i_13_ = anIntArray691[i_13_];
		    } else
			i_13_++;
		    if (i_13_ >= anIntArray691.length) {
			int[] is_16_ = new int[anIntArray691.length * 2];
			for (int i_17_ = 0; i_17_ < anIntArray691.length;
			     i_17_++)
			    is_16_[i_17_] = anIntArray691[i_17_];
			anIntArray691 = is_16_;
		    }
		    i_15_ >>>= 1;
		}
		anIntArray691[i_13_] = i_10_ ^ 0xffffffff;
		if (i_13_ >= i)
		    i = i_13_ + 1;
	    }
	}
    }
    
    public int method281() {
	int i;
	for (i = 0; anIntArray691[i] >= 0;
	     i = Class67_Sub18.method1252() != 0 ? anIntArray691[i] : i + 1) {
	    /* empty */
	}
	return anIntArray691[i] ^ 0xffffffff;
    }
    
    public Class29() {
	Class67_Sub18.method1259(24);
	anInt689 = Class67_Sub18.method1259(16);
	anInt688 = Class67_Sub18.method1259(24);
	anIntArray687 = new int[anInt688];
	boolean bool = Class67_Sub18.method1252() != 0;
	if (bool) {
	    int i = 0;
	    int i_18_ = Class67_Sub18.method1259(5) + 1;
	    while (i < anInt688) {
		int i_19_
		    = Class67_Sub18.method1259(Class76.method1400((byte) -22,
								  (anInt688
								   - i)));
		for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
		    anIntArray687[i++] = i_18_;
		i_18_++;
	    }
	} else {
	    boolean bool_21_ = Class67_Sub18.method1252() != 0;
	    for (int i = 0; i < anInt688; i++) {
		if (bool_21_ && Class67_Sub18.method1252() == 0)
		    anIntArray687[i] = 0;
		else
		    anIntArray687[i] = Class67_Sub18.method1259(5) + 1;
	    }
	}
	method280();
	int i = Class67_Sub18.method1259(4);
	if (i > 0) {
	    float f = Class67_Sub18.method1261(Class67_Sub18.method1259(32));
	    float f_22_
		= Class67_Sub18.method1261(Class67_Sub18.method1259(32));
	    int i_23_ = Class67_Sub18.method1259(4) + 1;
	    boolean bool_24_ = Class67_Sub18.method1252() != 0;
	    int i_25_;
	    if (i == 1)
		i_25_ = method278(anInt688, anInt689);
	    else
		i_25_ = anInt688 * anInt689;
	    anIntArray690 = new int[i_25_];
	    for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
		anIntArray690[i_26_] = Class67_Sub18.method1259(i_23_);
	    aFloatArrayArray686 = new float[anInt688][anInt689];
	    if (i == 1) {
		for (int i_27_ = 0; i_27_ < anInt688; i_27_++) {
		    float f_28_ = 0.0F;
		    int i_29_ = 1;
		    for (int i_30_ = 0; i_30_ < anInt689; i_30_++) {
			int i_31_ = i_27_ / i_29_ % i_25_;
			float f_32_
			    = (float) anIntArray690[i_31_] * f_22_ + f + f_28_;
			aFloatArrayArray686[i_27_][i_30_] = f_32_;
			if (bool_24_)
			    f_28_ = f_32_;
			i_29_ *= i_25_;
		    }
		}
	    } else {
		for (int i_33_ = 0; i_33_ < anInt688; i_33_++) {
		    float f_34_ = 0.0F;
		    int i_35_ = i_33_ * anInt689;
		    for (int i_36_ = 0; i_36_ < anInt689; i_36_++) {
			float f_37_
			    = (float) anIntArray690[i_35_] * f_22_ + f + f_34_;
			aFloatArrayArray686[i_33_][i_36_] = f_37_;
			if (bool_24_)
			    f_34_ = f_37_;
			i_35_++;
		    }
		}
	    }
	}
    }
}
