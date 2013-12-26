public class Class127
{
    public static int[][] anIntArrayArray2367 = new int[2][8];
    public static int anInt2368;
    public int[][][] anIntArrayArrayArray2369;
    public static float aFloat2370;
    public int[][][] anIntArrayArrayArray2371 = new int[2][2][4];
    public int[] anIntArray2372;
    public static float[][] aFloatArrayArray2373 = new float[2][8];
    public int[] anIntArray2374;
    
    public int method1725(int arg0, float arg1) {
	if (arg0 == 0) {
	    float f
		= ((float) anIntArray2372[0]
		   + (float) (anIntArray2372[1] - anIntArray2372[0]) * arg1);
	    f *= 0.0030517578F;
	    aFloat2370 = (float) Math.pow(0.1, (double) (f / 20.0F));
	    anInt2368 = (int) (aFloat2370 * 65536.0F);
	}
	if (anIntArray2374[arg0] == 0)
	    return 0;
	float f = method1727(arg0, 0, arg1);
	aFloatArrayArray2373[arg0][0]
	    = -2.0F * f * (float) Math.cos((double) method1730(arg0, 0, arg1));
	aFloatArrayArray2373[arg0][1] = f * f;
	for (int i = 1; i < anIntArray2374[arg0]; i++) {
	    f = method1727(arg0, i, arg1);
	    float f_0_
		= (-2.0F * f
		   * (float) Math.cos((double) method1730(arg0, i, arg1)));
	    float f_1_ = f * f;
	    aFloatArrayArray2373[arg0][i * 2 + 1]
		= aFloatArrayArray2373[arg0][i * 2 - 1] * f_1_;
	    aFloatArrayArray2373[arg0][i * 2]
		= (aFloatArrayArray2373[arg0][i * 2 - 1] * f_0_
		   + aFloatArrayArray2373[arg0][i * 2 - 2] * f_1_);
	    for (int i_2_ = i * 2 - 1; i_2_ >= 2; i_2_--)
		aFloatArrayArray2373[arg0][i_2_]
		    += (aFloatArrayArray2373[arg0][i_2_ - 1] * f_0_
			+ aFloatArrayArray2373[arg0][i_2_ - 2] * f_1_);
	    aFloatArrayArray2373[arg0][1]
		+= aFloatArrayArray2373[arg0][0] * f_0_ + f_1_;
	    aFloatArrayArray2373[arg0][0] += f_0_;
	}
	if (arg0 == 0) {
	    for (int i = 0; i < anIntArray2374[0] * 2; i++)
		aFloatArrayArray2373[0][i] *= aFloat2370;
	}
	for (int i = 0; i < anIntArray2374[arg0] * 2; i++)
	    anIntArrayArray2367[arg0][i]
		= (int) (aFloatArrayArray2373[arg0][i] * 65536.0F);
	return anIntArray2374[arg0] * 2;
    }
    
    public void method1726(Stream arg0, Class35 arg1) {
	int i = arg0.readByte((byte) -21);
	anIntArray2374[0] = i >> 4;
	anIntArray2374[1] = i & 0xf;
	if (i != 0) {
	    anIntArray2372[0] = arg0.readUShort(-2386);
	    anIntArray2372[1] = arg0.readUShort(-2386);
	    int i_3_ = arg0.readByte((byte) -61);
	    for (int i_4_ = 0; i_4_ < 2; i_4_++) {
		for (int i_5_ = 0; i_5_ < anIntArray2374[i_4_]; i_5_++) {
		    anIntArrayArrayArray2371[i_4_][0][i_5_]
			= arg0.readUShort(-2386);
		    anIntArrayArrayArray2369[i_4_][0][i_5_]
			= arg0.readUShort(-2386);
		}
	    }
	    for (int i_6_ = 0; i_6_ < 2; i_6_++) {
		for (int i_7_ = 0; i_7_ < anIntArray2374[i_6_]; i_7_++) {
		    if ((i_3_ & 1 << i_6_ * 4 << i_7_) != 0) {
			anIntArrayArrayArray2371[i_6_][1][i_7_]
			    = arg0.readUShort(-2386);
			anIntArrayArrayArray2369[i_6_][1][i_7_]
			    = arg0.readUShort(-2386);
		    } else {
			anIntArrayArrayArray2371[i_6_][1][i_7_]
			    = anIntArrayArrayArray2371[i_6_][0][i_7_];
			anIntArrayArrayArray2369[i_6_][1][i_7_]
			    = anIntArrayArrayArray2369[i_6_][0][i_7_];
		    }
		}
	    }
	    if (i_3_ != 0 || anIntArray2372[1] != anIntArray2372[0])
		arg1.method312(arg0);
	} else
	    anIntArray2372[0] = anIntArray2372[1] = 0;
    }
    
    public float method1727(int arg0, int arg1, float arg2) {
	float f
	    = ((float) anIntArrayArrayArray2369[arg0][0][arg1]
	       + arg2 * (float) (anIntArrayArrayArray2369[arg0][1][arg1]
				 - anIntArrayArrayArray2369[arg0][0][arg1]));
	f *= 0.0015258789F;
	return 1.0F - (float) Math.pow(10.0, (double) (-f / 20.0F));
    }
    
    public static float method1728(float arg0) {
	float f = 32.703197F * (float) Math.pow(2.0, (double) arg0);
	return f * 3.1415927F / 11025.0F;
    }
    
    public static void method1729() {
	aFloatArrayArray2373 = null;
	anIntArrayArray2367 = null;
    }
    
    public float method1730(int arg0, int arg1, float arg2) {
	float f
	    = ((float) anIntArrayArrayArray2371[arg0][0][arg1]
	       + arg2 * (float) (anIntArrayArrayArray2371[arg0][1][arg1]
				 - anIntArrayArrayArray2371[arg0][0][arg1]));
	f *= 1.2207031E-4F;
	return method1728(f);
    }
    
    public Class127() {
	anIntArrayArrayArray2369 = new int[2][2][4];
	anIntArray2372 = new int[2];
	anIntArray2374 = new int[2];
    }
}
