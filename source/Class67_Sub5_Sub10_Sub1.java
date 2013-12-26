/* Class67_Sub5_Sub10_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub10_Sub1 extends Class67_Sub5_Sub10
{
    public byte[][] aByteArrayArray5136;
    
    public static void method929(int[] arg0, byte[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9) {
	arg2 = ((arg2 & 0xff00ff) * arg9 & ~0xff00ff) + ((arg2 & 0xff00) * arg9
							 & 0xff0000) >> 8;
	arg9 = 256 - arg9;
	for (int i = -arg6; i < 0; i++) {
	    for (int i_0_ = -arg5; i_0_ < 0; i_0_++) {
		if (arg1[arg3++] != 0) {
		    int i_1_ = arg0[arg4];
		    arg0[arg4++] = ((((i_1_ & 0xff00ff) * arg9 & ~0xff00ff)
				     + ((i_1_ & 0xff00) * arg9 & 0xff0000))
				    >> 8) + arg2;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public static void method930(int[] arg0, byte[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_2_ = -arg6; i_2_ < 0; i_2_++) {
	    for (int i_3_ = i; i_3_ < 0; i_3_++) {
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_4_ = arg5; i_4_ < 0; i_4_++) {
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public Class67_Sub5_Sub10_Sub1(byte[] arg0, int[] arg1, int[] arg2,
				   int[] arg3, int[] arg4, byte[][] arg5) {
	super(arg0, arg1, arg2, arg3, arg4);
	aByteArrayArray5136 = new byte[256][];
	aByteArrayArray5136 = arg5;
    }
    
    public void method903(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, boolean arg7) {
	int i = arg1 + arg2 * Class121.anInt2296;
	int i_5_ = Class121.anInt2296 - arg3;
	int i_6_ = 0;
	int i_7_ = 0;
	if (arg2 < Class121.anInt2295) {
	    int i_8_ = Class121.anInt2295 - arg2;
	    arg4 -= i_8_;
	    arg2 = Class121.anInt2295;
	    i_7_ += i_8_ * arg3;
	    i += i_8_ * Class121.anInt2296;
	}
	if (arg2 + arg4 > Class121.anInt2297)
	    arg4 -= arg2 + arg4 - Class121.anInt2297;
	if (arg1 < Class121.anInt2298) {
	    int i_9_ = Class121.anInt2298 - arg1;
	    arg3 -= i_9_;
	    arg1 = Class121.anInt2298;
	    i_7_ += i_9_;
	    i += i_9_;
	    i_6_ += i_9_;
	    i_5_ += i_9_;
	}
	if (arg1 + arg3 > Class121.anInt2301) {
	    int i_10_ = arg1 + arg3 - Class121.anInt2301;
	    arg3 -= i_10_;
	    i_6_ += i_10_;
	    i_5_ += i_10_;
	}
	if (arg3 > 0 && arg4 > 0)
	    method929(Class121.anIntArray2300, aByteArrayArray5136[arg0], arg5,
		      i_7_, i, arg3, arg4, i_5_, i_6_, arg6);
    }
    
    public void method924(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, boolean arg6) {
	int i = arg1 + arg2 * Class121.anInt2296;
	int i_11_ = Class121.anInt2296 - arg3;
	int i_12_ = 0;
	int i_13_ = 0;
	if (arg2 < Class121.anInt2295) {
	    int i_14_ = Class121.anInt2295 - arg2;
	    arg4 -= i_14_;
	    arg2 = Class121.anInt2295;
	    i_13_ += i_14_ * arg3;
	    i += i_14_ * Class121.anInt2296;
	}
	if (arg2 + arg4 > Class121.anInt2297)
	    arg4 -= arg2 + arg4 - Class121.anInt2297;
	if (arg1 < Class121.anInt2298) {
	    int i_15_ = Class121.anInt2298 - arg1;
	    arg3 -= i_15_;
	    arg1 = Class121.anInt2298;
	    i_13_ += i_15_;
	    i += i_15_;
	    i_12_ += i_15_;
	    i_11_ += i_15_;
	}
	if (arg1 + arg3 > Class121.anInt2301) {
	    int i_16_ = arg1 + arg3 - Class121.anInt2301;
	    arg3 -= i_16_;
	    i_12_ += i_16_;
	    i_11_ += i_16_;
	}
	if (arg3 > 0 && arg4 > 0) {
	    if (Class121.anIntArray2299 != null)
		method931(Class121.anIntArray2300, aByteArrayArray5136[arg0],
			  arg1, arg2, arg3, arg4, arg5, i_13_, i, i_11_, i_12_,
			  Class121.anIntArray2299, Class121.anIntArray2294);
	    else
		method930(Class121.anIntArray2300, aByteArrayArray5136[arg0],
			  arg5, i_13_, i, arg3, arg4, i_11_, i_12_);
	}
    }
    
    public static void method931(int[] arg0, byte[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int[] arg11,
				 int[] arg12) {
	int i = arg2 - Class121.anInt2298;
	int i_17_ = arg3 - Class121.anInt2295;
	for (int i_18_ = i_17_; i_18_ < i_17_ + arg5; i_18_++) {
	    int i_19_ = arg11[i_18_];
	    int i_20_ = arg12[i_18_];
	    int i_21_ = arg4;
	    if (i > i_19_) {
		int i_22_ = i - i_19_;
		if (i_22_ >= i_20_) {
		    arg7 += arg4 + arg10;
		    arg8 += arg4 + arg9;
		    continue;
		}
		i_20_ -= i_22_;
	    } else {
		int i_23_ = i_19_ - i;
		if (i_23_ >= arg4) {
		    arg7 += arg4 + arg10;
		    arg8 += arg4 + arg9;
		    continue;
		}
		arg7 += i_23_;
		i_21_ -= i_23_;
		arg8 += i_23_;
	    }
	    int i_24_ = 0;
	    if (i_21_ < i_20_)
		i_20_ = i_21_;
	    else
		i_24_ = i_21_ - i_20_;
	    for (int i_25_ = -i_20_; i_25_ < 0; i_25_++) {
		if (arg1[arg7++] != 0)
		    Class121.anIntArray2300[arg8++] = arg6;
		else
		    arg8++;
	    }
	    arg7 += i_24_ + arg10;
	    arg8 += i_24_ + arg9;
	}
    }
    
    public Class67_Sub5_Sub10_Sub1(byte[] arg0) {
	super(arg0);
	aByteArrayArray5136 = new byte[256][];
    }
}
