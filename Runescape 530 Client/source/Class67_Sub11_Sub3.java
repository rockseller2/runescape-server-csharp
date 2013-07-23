/* Class67_Sub11_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub11_Sub3 extends Class67_Sub11
{
    public int anInt4866;
    public int anInt4867;
    public int anInt4868;
    public boolean aBoolean4869;
    public int anInt4870;
    public int anInt4871;
    public int anInt4872;
    public int anInt4873;
    public int anInt4874;
    public int anInt4875;
    public int anInt4876;
    public int anInt4877;
    public int anInt4878;
    public int anInt4879;
    public int anInt4880;
    
    public synchronized void method1142(int arg0) {
	anInt4875 = arg0;
    }
    
    public synchronized void method1143(int arg0) {
	int i
	    = (((Class67_Sub13_Sub1) aClass67_Sub13_3023).aByteArray4956.length
	       << 8);
	if (arg0 < -1)
	    arg0 = -1;
	if (arg0 > i)
	    arg0 = i;
	anInt4880 = arg0;
    }
    
    public static int method1144(int arg0, int arg1) {
	if (arg1 < 0)
	    return -arg0;
	return (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4)
		      + 0.5);
    }
    
    public boolean method1145() {
	if (anInt4880 >= 0
	    && anInt4880 < (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
			    .aByteArray4956).length << 8)
	    return false;
	return true;
    }
    
    public synchronized void method1127(int[] arg0, int arg1, int arg2) {
	if (anInt4874 == 0 && anInt4872 == 0)
	    method1123(arg2);
	else {
	    Class67_Sub13_Sub1 class67_sub13_sub1
		= (Class67_Sub13_Sub1) aClass67_Sub13_3023;
	    int i = anInt4868 << 8;
	    int i_0_ = anInt4870 << 8;
	    int i_1_ = class67_sub13_sub1.aByteArray4956.length << 8;
	    int i_2_ = i_0_ - i;
	    if (i_2_ <= 0)
		anInt4875 = 0;
	    int i_3_ = arg1;
	    arg2 += arg1;
	    if (anInt4880 < 0) {
		if (anInt4873 > 0)
		    anInt4880 = 0;
		else {
		    method1164();
		    this.method606((byte) -118);
		    return;
		}
	    }
	    if (anInt4880 >= i_1_) {
		if (anInt4873 < 0)
		    anInt4880 = i_1_ - 1;
		else {
		    method1164();
		    this.method606((byte) -118);
		    return;
		}
	    }
	    if (anInt4875 < 0) {
		if (aBoolean4869) {
		    if (anInt4873 < 0) {
			i_3_ = method1176(arg0, i_3_, i, arg2,
					  (class67_sub13_sub1.aByteArray4956
					   [anInt4868]));
			if (anInt4880 >= i)
			    return;
			anInt4880 = i + i - 1 - anInt4880;
			anInt4873 = -anInt4873;
		    }
		    for (;;) {
			i_3_ = method1175(arg0, i_3_, i_0_, arg2,
					  (class67_sub13_sub1.aByteArray4956
					   [anInt4870 - 1]));
			if (anInt4880 < i_0_)
			    break;
			anInt4880 = i_0_ + i_0_ - 1 - anInt4880;
			anInt4873 = -anInt4873;
			i_3_ = method1176(arg0, i_3_, i, arg2,
					  (class67_sub13_sub1.aByteArray4956
					   [anInt4868]));
			if (anInt4880 >= i)
			    break;
			anInt4880 = i + i - 1 - anInt4880;
			anInt4873 = -anInt4873;
		    }
		} else if (anInt4873 < 0) {
		    for (;;) {
			i_3_ = method1176(arg0, i_3_, i, arg2,
					  (class67_sub13_sub1.aByteArray4956
					   [anInt4870 - 1]));
			if (anInt4880 >= i)
			    break;
			anInt4880 = i_0_ - 1 - (i_0_ - 1 - anInt4880) % i_2_;
		    }
		} else {
		    for (;;) {
			i_3_ = method1175(arg0, i_3_, i_0_, arg2,
					  (class67_sub13_sub1.aByteArray4956
					   [anInt4868]));
			if (anInt4880 < i_0_)
			    break;
			anInt4880 = i + (anInt4880 - i) % i_2_;
		    }
		}
	    } else {
		do {
		    if (anInt4875 > 0) {
			if (aBoolean4869) {
			    if (anInt4873 < 0) {
				i_3_
				    = method1176(arg0, i_3_, i, arg2,
						 (class67_sub13_sub1
						  .aByteArray4956[anInt4868]));
				if (anInt4880 >= i)
				    return;
				anInt4880 = i + i - 1 - anInt4880;
				anInt4873 = -anInt4873;
				if (--anInt4875 == 0)
				    break;
			    }
			    do {
				i_3_ = method1175(arg0, i_3_, i_0_, arg2,
						  (class67_sub13_sub1
						   .aByteArray4956
						   [anInt4870 - 1]));
				if (anInt4880 < i_0_)
				    return;
				anInt4880 = i_0_ + i_0_ - 1 - anInt4880;
				anInt4873 = -anInt4873;
				if (--anInt4875 == 0)
				    break;
				i_3_
				    = method1176(arg0, i_3_, i, arg2,
						 (class67_sub13_sub1
						  .aByteArray4956[anInt4868]));
				if (anInt4880 >= i)
				    return;
				anInt4880 = i + i - 1 - anInt4880;
				anInt4873 = -anInt4873;
			    } while (--anInt4875 != 0);
			} else if (anInt4873 < 0) {
			    for (;;) {
				i_3_ = method1176(arg0, i_3_, i, arg2,
						  (class67_sub13_sub1
						   .aByteArray4956
						   [anInt4870 - 1]));
				if (anInt4880 >= i)
				    return;
				int i_4_ = (i_0_ - 1 - anInt4880) / i_2_;
				if (i_4_ >= anInt4875) {
				    anInt4880 += i_2_ * anInt4875;
				    anInt4875 = 0;
				    break;
				}
				anInt4880 += i_2_ * i_4_;
				anInt4875 -= i_4_;
			    }
			} else {
			    for (;;) {
				i_3_
				    = method1175(arg0, i_3_, i_0_, arg2,
						 (class67_sub13_sub1
						  .aByteArray4956[anInt4868]));
				if (anInt4880 < i_0_)
				    return;
				int i_5_ = (anInt4880 - i) / i_2_;
				if (i_5_ >= anInt4875) {
				    anInt4880 -= i_2_ * anInt4875;
				    anInt4875 = 0;
				    break;
				}
				anInt4880 -= i_2_ * i_5_;
				anInt4875 -= i_5_;
			    }
			}
		    }
		} while (false);
		if (anInt4873 < 0) {
		    method1176(arg0, i_3_, 0, arg2, 0);
		    if (anInt4880 < 0) {
			anInt4880 = -1;
			method1164();
			this.method606((byte) -118);
		    }
		} else {
		    method1175(arg0, i_3_, i_1_, arg2, 0);
		    if (anInt4880 >= i_1_) {
			anInt4880 = i_1_;
			method1164();
			this.method606((byte) -118);
		    }
		}
	    }
	}
    }
    
    public static int method1146(byte[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 Class67_Sub11_Sub3 arg8) {
	arg2 >>= 8;
	arg7 >>= 8;
	arg4 <<= 2;
	if ((arg5 = arg3 + arg7 - arg2) > arg6)
	    arg5 = arg6;
	arg5 -= 3;
	while (arg3 < arg5) {
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	}
	arg5 += 3;
	while (arg3 < arg5)
	    arg1[arg3++] += arg0[arg2++] * arg4;
	arg8.anInt4880 = arg2 << 8;
	return arg3;
    }
    
    public static Class67_Sub11_Sub3 method1147(Class67_Sub13_Sub1 arg0,
						int arg1, int arg2) {
	if (arg0.aByteArray4956 == null || arg0.aByteArray4956.length == 0)
	    return null;
	return new Class67_Sub11_Sub3(arg0,
				      (int) ((long) arg0.anInt4958 * 256L
					     * (long) arg1
					     / (long) (100
						       * Class89.anInt1833)),
				      arg2 << 6);
    }
    
    public synchronized void method1148(int arg0) {
	if (arg0 == 0) {
	    method1155(0);
	    this.method606((byte) -118);
	} else if (anInt4876 == 0 && anInt4879 == 0) {
	    anInt4872 = 0;
	    anInt4874 = 0;
	    anInt4867 = 0;
	    this.method606((byte) -118);
	} else {
	    int i = -anInt4867;
	    if (anInt4867 > i)
		i = anInt4867;
	    if (-anInt4876 > i)
		i = -anInt4876;
	    if (anInt4876 > i)
		i = anInt4876;
	    if (-anInt4879 > i)
		i = -anInt4879;
	    if (anInt4879 > i)
		i = anInt4879;
	    if (arg0 > i)
		arg0 = i;
	    anInt4872 = arg0;
	    anInt4874 = -2147483648;
	    anInt4878 = -anInt4867 / arg0;
	    anInt4877 = -anInt4876 / arg0;
	    anInt4866 = -anInt4879 / arg0;
	}
    }
    
    public static int method1149(int arg0, int arg1) {
	if (arg1 < 0)
	    return arg0;
	return (int) (((double) arg0
		       * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4))
		      + 0.5);
    }
    
    public boolean method1150() {
	int i = anInt4874;
	int i_6_;
	int i_7_;
	if (i == -2147483648)
	    i = i_6_ = i_7_ = 0;
	else {
	    i_6_ = method1149(i, anInt4871);
	    i_7_ = method1144(i, anInt4871);
	}
	if (anInt4867 != i || anInt4876 != i_6_ || anInt4879 != i_7_) {
	    if (anInt4867 < i) {
		anInt4878 = 1;
		anInt4872 = i - anInt4867;
	    } else if (anInt4867 > i) {
		anInt4878 = -1;
		anInt4872 = anInt4867 - i;
	    } else
		anInt4878 = 0;
	    if (anInt4876 < i_6_) {
		anInt4877 = 1;
		if (anInt4872 == 0 || anInt4872 > i_6_ - anInt4876)
		    anInt4872 = i_6_ - anInt4876;
	    } else if (anInt4876 > i_6_) {
		anInt4877 = -1;
		if (anInt4872 == 0 || anInt4872 > anInt4876 - i_6_)
		    anInt4872 = anInt4876 - i_6_;
	    } else
		anInt4877 = 0;
	    if (anInt4879 < i_7_) {
		anInt4866 = 1;
		if (anInt4872 == 0 || anInt4872 > i_7_ - anInt4879)
		    anInt4872 = i_7_ - anInt4879;
	    } else if (anInt4879 > i_7_) {
		anInt4866 = -1;
		if (anInt4872 == 0 || anInt4872 > anInt4879 - i_7_)
		    anInt4872 = anInt4879 - i_7_;
	    } else
		anInt4866 = 0;
	    return false;
	}
	if (anInt4874 == -2147483648) {
	    anInt4874 = 0;
	    anInt4867 = anInt4876 = anInt4879 = 0;
	    this.method606((byte) -118);
	    return true;
	}
	method1156();
	return false;
    }
    
    public static int method1151(byte[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 Class67_Sub11_Sub3 arg8) {
	arg2 >>= 8;
	arg7 >>= 8;
	arg4 <<= 2;
	if ((arg5 = arg3 + arg2 - (arg7 - 1)) > arg6)
	    arg5 = arg6;
	arg5 -= 3;
	while (arg3 < arg5) {
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	}
	arg5 += 3;
	while (arg3 < arg5)
	    arg1[arg3++] += arg0[arg2--] * arg4;
	arg8.anInt4880 = arg2 << 8;
	return arg3;
    }
    
    public static int method1152
	(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, Class67_Sub11_Sub3 arg10) {
	arg3 >>= 8;
	arg9 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	if ((arg7 = arg4 + arg3 - (arg9 - 1)) > arg8)
	    arg7 = arg8;
	arg4 <<= 1;
	arg7 <<= 1;
	arg7 -= 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg7 += 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg10.anInt4880 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public Class67_Sub11 method1124() {
	return null;
    }
    
    public synchronized void method1153(int arg0, int arg1) {
	method1157(arg0, arg1, method1179());
    }
    
    public Class67_Sub11 method1122() {
	return null;
    }
    
    public static int method1154(byte[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, Class67_Sub11_Sub3 arg9) {
	arg2 >>= 8;
	arg8 >>= 8;
	arg4 <<= 2;
	arg5 <<= 2;
	if ((arg6 = arg3 + arg8 - arg2) > arg7)
	    arg6 = arg7;
	arg9.anInt4876 += arg9.anInt4877 * (arg6 - arg3);
	arg9.anInt4879 += arg9.anInt4866 * (arg6 - arg3);
	arg6 -= 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	}
	arg6 += 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	}
	arg9.anInt4867 = arg4 >> 2;
	arg9.anInt4880 = arg2 << 8;
	return arg3;
    }
    
    public synchronized void method1155(int arg0) {
	method1180(arg0, method1179());
    }
    
    public void method1156() {
	anInt4867 = anInt4874;
	anInt4876 = method1149(anInt4874, anInt4871);
	anInt4879 = method1144(anInt4874, anInt4871);
    }
    
    public synchronized void method1157(int arg0, int arg1, int arg2) {
	if (arg0 == 0)
	    method1180(arg1, arg2);
	else {
	    int i = method1149(arg1, arg2);
	    int i_8_ = method1144(arg1, arg2);
	    if (anInt4876 == i && anInt4879 == i_8_)
		anInt4872 = 0;
	    else {
		int i_9_ = arg1 - anInt4867;
		if (anInt4867 - arg1 > i_9_)
		    i_9_ = anInt4867 - arg1;
		if (i - anInt4876 > i_9_)
		    i_9_ = i - anInt4876;
		if (anInt4876 - i > i_9_)
		    i_9_ = anInt4876 - i;
		if (i_8_ - anInt4879 > i_9_)
		    i_9_ = i_8_ - anInt4879;
		if (anInt4879 - i_8_ > i_9_)
		    i_9_ = anInt4879 - i_8_;
		if (arg0 > i_9_)
		    arg0 = i_9_;
		anInt4872 = arg0;
		anInt4874 = arg1;
		anInt4871 = arg2;
		anInt4878 = (arg1 - anInt4867) / arg0;
		anInt4877 = (i - anInt4876) / arg0;
		anInt4866 = (i_8_ - anInt4879) / arg0;
	    }
	}
    }
    
    public static int method1158
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class67_Sub11_Sub3 arg11, int arg12, int arg13) {
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	arg5 <<= 1;
	arg8 <<= 1;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	arg8 <<= 1;
	arg1 = arg13;
	while (arg5 < arg8) {
	    arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	arg11.anInt4880 = arg4;
	return arg5 >> 1;
    }
    
    public static int method1159(int arg0, byte[] arg1, int[] arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11,
				 Class67_Sub11_Sub3 arg12) {
	arg3 >>= 8;
	arg11 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	arg7 <<= 2;
	arg8 <<= 2;
	if ((arg9 = arg4 + arg3 - (arg11 - 1)) > arg10)
	    arg9 = arg10;
	arg12.anInt4867 += arg12.anInt4878 * (arg9 - arg4);
	arg4 <<= 1;
	arg9 <<= 1;
	arg9 -= 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg9 += 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg12.anInt4876 = arg5 >> 2;
	arg12.anInt4879 = arg6 >> 2;
	arg12.anInt4880 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public static int method1160
	(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, Class67_Sub11_Sub3 arg10) {
	arg3 >>= 8;
	arg9 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	if ((arg7 = arg4 + arg9 - arg3) > arg8)
	    arg7 = arg8;
	arg4 <<= 1;
	arg7 <<= 1;
	arg7 -= 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg7 += 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg10.anInt4880 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public static int method1161
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11,
	 int arg12, Class67_Sub11_Sub3 arg13, int arg14, int arg15) {
	arg13.anInt4867 -= arg13.anInt4878 * arg5;
	if (arg14 == 0
	    || (arg10 = arg5 + (arg12 - arg4 + arg14 - 257) / arg14) > arg11)
	    arg10 = arg11;
	arg5 <<= 1;
	arg10 <<= 1;
	while (arg5 < arg10) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	if (arg14 == 0
	    || ((arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14)
		> arg11))
	    arg10 = arg11;
	arg10 <<= 1;
	arg1 = arg15;
	while (arg5 < arg10) {
	    arg0 = arg2[arg4 >> 8];
	    arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	arg5 >>= 1;
	arg13.anInt4867 += arg13.anInt4878 * arg5;
	arg13.anInt4876 = arg6;
	arg13.anInt4879 = arg7;
	arg13.anInt4880 = arg4;
	return arg5;
    }
    
    public static int method1162(int arg0, byte[] arg1, int[] arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11,
				 Class67_Sub11_Sub3 arg12) {
	arg3 >>= 8;
	arg11 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	arg7 <<= 2;
	arg8 <<= 2;
	if ((arg9 = arg4 + arg11 - arg3) > arg10)
	    arg9 = arg10;
	arg12.anInt4867 += arg12.anInt4878 * (arg9 - arg4);
	arg4 <<= 1;
	arg9 <<= 1;
	arg9 -= 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg9 += 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg12.anInt4876 = arg5 >> 2;
	arg12.anInt4879 = arg6 >> 2;
	arg12.anInt4880 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public synchronized void method1163(int arg0) {
	if (anInt4873 < 0)
	    anInt4873 = -arg0;
	else
	    anInt4873 = arg0;
    }
    
    public void method1164() {
	if (anInt4872 != 0) {
	    if (anInt4874 == -2147483648)
		anInt4874 = 0;
	    anInt4872 = 0;
	    method1156();
	}
    }
    
    public static int method1165
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11,
	 int arg12, Class67_Sub11_Sub3 arg13, int arg14, int arg15) {
	arg13.anInt4867 -= arg13.anInt4878 * arg5;
	if (arg14 == 0
	    || (arg10 = arg5 + (arg12 + 256 - arg4 + arg14) / arg14) > arg11)
	    arg10 = arg11;
	arg5 <<= 1;
	arg10 <<= 1;
	while (arg5 < arg10) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	if (arg14 == 0
	    || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11)
	    arg10 = arg11;
	arg10 <<= 1;
	arg1 = arg15;
	while (arg5 < arg10) {
	    arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	arg5 >>= 1;
	arg13.anInt4867 += arg13.anInt4878 * arg5;
	arg13.anInt4876 = arg6;
	arg13.anInt4879 = arg7;
	arg13.anInt4880 = arg4;
	return arg5;
    }
    
    public synchronized void method1123(int arg0) {
	if (anInt4872 > 0) {
	    if (arg0 >= anInt4872) {
		if (anInt4874 == -2147483648) {
		    anInt4874 = 0;
		    anInt4867 = anInt4876 = anInt4879 = 0;
		    this.method606((byte) -118);
		    arg0 = anInt4872;
		}
		anInt4872 = 0;
		method1156();
	    } else {
		anInt4867 += anInt4878 * arg0;
		anInt4876 += anInt4877 * arg0;
		anInt4879 += anInt4866 * arg0;
		anInt4872 -= arg0;
	    }
	}
	Class67_Sub13_Sub1 class67_sub13_sub1
	    = (Class67_Sub13_Sub1) aClass67_Sub13_3023;
	int i = anInt4868 << 8;
	int i_10_ = anInt4870 << 8;
	int i_11_ = class67_sub13_sub1.aByteArray4956.length << 8;
	int i_12_ = i_10_ - i;
	if (i_12_ <= 0)
	    anInt4875 = 0;
	if (anInt4880 < 0) {
	    if (anInt4873 > 0)
		anInt4880 = 0;
	    else {
		method1164();
		this.method606((byte) -118);
		return;
	    }
	}
	if (anInt4880 >= i_11_) {
	    if (anInt4873 < 0)
		anInt4880 = i_11_ - 1;
	    else {
		method1164();
		this.method606((byte) -118);
		return;
	    }
	}
	anInt4880 += anInt4873 * arg0;
	if (anInt4875 < 0) {
	    if (aBoolean4869) {
		if (anInt4873 < 0) {
		    if (anInt4880 >= i)
			return;
		    anInt4880 = i + i - 1 - anInt4880;
		    anInt4873 = -anInt4873;
		}
		while (anInt4880 >= i_10_) {
		    anInt4880 = i_10_ + i_10_ - 1 - anInt4880;
		    anInt4873 = -anInt4873;
		    if (anInt4880 >= i)
			break;
		    anInt4880 = i + i - 1 - anInt4880;
		    anInt4873 = -anInt4873;
		}
	    } else if (anInt4873 < 0) {
		if (anInt4880 < i)
		    anInt4880 = i_10_ - 1 - (i_10_ - 1 - anInt4880) % i_12_;
	    } else if (anInt4880 >= i_10_)
		anInt4880 = i + (anInt4880 - i) % i_12_;
	} else {
	    do {
		if (anInt4875 > 0) {
		    if (aBoolean4869) {
			if (anInt4873 < 0) {
			    if (anInt4880 >= i)
				return;
			    anInt4880 = i + i - 1 - anInt4880;
			    anInt4873 = -anInt4873;
			    if (--anInt4875 == 0)
				break;
			}
			do {
			    if (anInt4880 < i_10_)
				return;
			    anInt4880 = i_10_ + i_10_ - 1 - anInt4880;
			    anInt4873 = -anInt4873;
			    if (--anInt4875 == 0)
				break;
			    if (anInt4880 >= i)
				return;
			    anInt4880 = i + i - 1 - anInt4880;
			    anInt4873 = -anInt4873;
			} while (--anInt4875 != 0);
		    } else if (anInt4873 < 0) {
			if (anInt4880 >= i)
			    return;
			int i_13_ = (i_10_ - 1 - anInt4880) / i_12_;
			if (i_13_ >= anInt4875) {
			    anInt4880 += i_12_ * anInt4875;
			    anInt4875 = 0;
			} else {
			    anInt4880 += i_12_ * i_13_;
			    anInt4875 -= i_13_;
			    return;
			}
		    } else {
			if (anInt4880 < i_10_)
			    return;
			int i_14_ = (anInt4880 - i) / i_12_;
			if (i_14_ >= anInt4875) {
			    anInt4880 -= i_12_ * anInt4875;
			    anInt4875 = 0;
			} else {
			    anInt4880 -= i_12_ * i_14_;
			    anInt4875 -= i_14_;
			    return;
			}
		    }
		}
	    } while (false);
	    if (anInt4873 < 0) {
		if (anInt4880 < 0) {
		    anInt4880 = -1;
		    method1164();
		    this.method606((byte) -118);
		}
	    } else if (anInt4880 >= i_11_) {
		anInt4880 = i_11_;
		method1164();
		this.method606((byte) -118);
	    }
	}
    }
    
    public synchronized void method1166(int arg0) {
	method1180(arg0 << 6, method1179());
    }
    
    public static int method1167(byte[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, Class67_Sub11_Sub3 arg9) {
	arg2 >>= 8;
	arg8 >>= 8;
	arg4 <<= 2;
	arg5 <<= 2;
	if ((arg6 = arg3 + arg2 - (arg8 - 1)) > arg7)
	    arg6 = arg7;
	arg9.anInt4876 += arg9.anInt4877 * (arg6 - arg3);
	arg9.anInt4879 += arg9.anInt4866 * (arg6 - arg3);
	arg6 -= 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	}
	arg6 += 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	}
	arg9.anInt4867 = arg4 >> 2;
	arg9.anInt4880 = arg2 << 8;
	return arg3;
    }
    
    public static int method1168
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class67_Sub11_Sub3 arg11, int arg12, int arg13) {
	arg11.anInt4876 -= arg11.anInt4877 * arg5;
	arg11.anInt4879 -= arg11.anInt4866 * arg5;
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff)) * arg6
		    >> 6);
	    arg6 += arg7;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	arg0 = arg13;
	arg1 = arg12;
	while (arg5 < arg8) {
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg6 += arg7;
	    arg4 += arg1;
	}
	arg11.anInt4876 += arg11.anInt4877 * arg5;
	arg11.anInt4879 += arg11.anInt4866 * arg5;
	arg11.anInt4867 = arg6;
	arg11.anInt4880 = arg4;
	return arg5;
    }
    
    public boolean method1169() {
	if (anInt4872 == 0)
	    return false;
	return true;
    }
    
    public synchronized int method1170() {
	if (anInt4874 == -2147483648)
	    return 0;
	return anInt4874;
    }
    
    public static int method1171
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class67_Sub11_Sub3 arg11, int arg12, int arg13) {
	arg11.anInt4876 -= arg11.anInt4877 * arg5;
	arg11.anInt4879 -= arg11.anInt4866 * arg5;
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9)
	    arg8 = arg9;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg6 += arg7;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12 - 1) / arg12) > arg9)
	    arg8 = arg9;
	arg1 = arg13;
	while (arg5 < arg8) {
	    arg0 = arg2[arg4 >> 8];
	    arg3[arg5++]
		+= ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff)) * arg6 >> 6;
	    arg6 += arg7;
	    arg4 += arg12;
	}
	arg11.anInt4876 += arg11.anInt4877 * arg5;
	arg11.anInt4879 += arg11.anInt4866 * arg5;
	arg11.anInt4867 = arg6;
	arg11.anInt4880 = arg4;
	return arg5;
    }
    
    public static Class67_Sub11_Sub3 method1172(Class67_Sub13_Sub1 arg0,
						int arg1, int arg2, int arg3) {
	if (arg0.aByteArray4956 == null || arg0.aByteArray4956.length == 0)
	    return null;
	return new Class67_Sub11_Sub3(arg0, arg1, arg2, arg3);
    }
    
    public static int method1173
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class67_Sub11_Sub3 arg11, int arg12, int arg13) {
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9)
	    arg8 = arg9;
	arg5 <<= 1;
	arg8 <<= 1;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || ((arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12)
		> arg9))
	    arg8 = arg9;
	arg8 <<= 1;
	arg1 = arg13;
	while (arg5 < arg8) {
	    arg0 = arg2[arg4 >> 8];
	    arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	arg11.anInt4880 = arg4;
	return arg5 >> 1;
    }
    
    public static int method1174(int arg0, int arg1, byte[] arg2, int[] arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, Class67_Sub11_Sub3 arg10,
				 int arg11, int arg12) {
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 - arg4 + arg11 - 257) / arg11) > arg8)
	    arg7 = arg8;
	while (arg5 < arg7) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg4 += arg11;
	}
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 - arg4 + arg11 - 1) / arg11) > arg8)
	    arg7 = arg8;
	arg1 = arg12;
	while (arg5 < arg7) {
	    arg0 = arg2[arg4 >> 8];
	    arg3[arg5++]
		+= ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff)) * arg6 >> 6;
	    arg4 += arg11;
	}
	arg10.anInt4880 = arg4;
	return arg5;
    }
    
    public int method1175(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
	while (anInt4872 > 0) {
	    int i = arg1 + anInt4872;
	    if (i > arg3)
		i = arg3;
	    anInt4872 += arg1;
	    if (anInt4873 == 256 && (anInt4880 & 0xff) == 0) {
		if (Class25.aBoolean605)
		    arg1 = method1162(0,
				      ((Class67_Sub13_Sub1)
				       aClass67_Sub13_3023).aByteArray4956,
				      arg0, anInt4880, arg1, anInt4876,
				      anInt4879, anInt4877, anInt4866, 0, i,
				      arg2, this);
		else
		    arg1 = method1154(((Class67_Sub13_Sub1)
				       aClass67_Sub13_3023).aByteArray4956,
				      arg0, anInt4880, arg1, anInt4867,
				      anInt4878, 0, i, arg2, this);
	    } else if (Class25.aBoolean605)
		arg1 = method1161(0, 0,
				  (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
				   .aByteArray4956),
				  arg0, anInt4880, arg1, anInt4876, anInt4879,
				  anInt4877, anInt4866, 0, i, arg2, this,
				  anInt4873, arg4);
	    else
		arg1 = method1171(0, 0,
				  (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
				   .aByteArray4956),
				  arg0, anInt4880, arg1, anInt4867, anInt4878,
				  0, i, arg2, this, anInt4873, arg4);
	    anInt4872 -= arg1;
	    if (anInt4872 != 0)
		return arg1;
	    if (method1150())
		return arg3;
	}
	if (anInt4873 == 256 && (anInt4880 & 0xff) == 0) {
	    if (Class25.aBoolean605)
		return method1160(0,
				  (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
				   .aByteArray4956),
				  arg0, anInt4880, arg1, anInt4876, anInt4879,
				  0, arg3, arg2, this);
	    return method1146((((Class67_Sub13_Sub1) aClass67_Sub13_3023)
			       .aByteArray4956),
			      arg0, anInt4880, arg1, anInt4867, 0, arg3, arg2,
			      this);
	}
	if (Class25.aBoolean605)
	    return method1173(0, 0,
			      (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
			       .aByteArray4956),
			      arg0, anInt4880, arg1, anInt4876, anInt4879, 0,
			      arg3, arg2, this, anInt4873, arg4);
	return method1174(0, 0,
			  (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
			   .aByteArray4956),
			  arg0, anInt4880, arg1, anInt4867, 0, arg3, arg2,
			  this, anInt4873, arg4);
    }
    
    public int method1176(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
	while (anInt4872 > 0) {
	    int i = arg1 + anInt4872;
	    if (i > arg3)
		i = arg3;
	    anInt4872 += arg1;
	    if (anInt4873 == -256 && (anInt4880 & 0xff) == 0) {
		if (Class25.aBoolean605)
		    arg1 = method1159(0,
				      ((Class67_Sub13_Sub1)
				       aClass67_Sub13_3023).aByteArray4956,
				      arg0, anInt4880, arg1, anInt4876,
				      anInt4879, anInt4877, anInt4866, 0, i,
				      arg2, this);
		else
		    arg1 = method1167(((Class67_Sub13_Sub1)
				       aClass67_Sub13_3023).aByteArray4956,
				      arg0, anInt4880, arg1, anInt4867,
				      anInt4878, 0, i, arg2, this);
	    } else if (Class25.aBoolean605)
		arg1 = method1165(0, 0,
				  (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
				   .aByteArray4956),
				  arg0, anInt4880, arg1, anInt4876, anInt4879,
				  anInt4877, anInt4866, 0, i, arg2, this,
				  anInt4873, arg4);
	    else
		arg1 = method1168(0, 0,
				  (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
				   .aByteArray4956),
				  arg0, anInt4880, arg1, anInt4867, anInt4878,
				  0, i, arg2, this, anInt4873, arg4);
	    anInt4872 -= arg1;
	    if (anInt4872 != 0)
		return arg1;
	    if (method1150())
		return arg3;
	}
	if (anInt4873 == -256 && (anInt4880 & 0xff) == 0) {
	    if (Class25.aBoolean605)
		return method1152(0,
				  (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
				   .aByteArray4956),
				  arg0, anInt4880, arg1, anInt4876, anInt4879,
				  0, arg3, arg2, this);
	    return method1151((((Class67_Sub13_Sub1) aClass67_Sub13_3023)
			       .aByteArray4956),
			      arg0, anInt4880, arg1, anInt4867, 0, arg3, arg2,
			      this);
	}
	if (Class25.aBoolean605)
	    return method1158(0, 0,
			      (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
			       .aByteArray4956),
			      arg0, anInt4880, arg1, anInt4876, anInt4879, 0,
			      arg3, arg2, this, anInt4873, arg4);
	return method1178(0, 0,
			  (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
			   .aByteArray4956),
			  arg0, anInt4880, arg1, anInt4867, 0, arg3, arg2,
			  this, anInt4873, arg4);
    }
    
    public synchronized void method1177(boolean arg0) {
	anInt4873 = (anInt4873 ^ anInt4873 >> 31) + (anInt4873 >>> 31);
	if (arg0)
	    anInt4873 = -anInt4873;
    }
    
    public static int method1178(int arg0, int arg1, byte[] arg2, int[] arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, Class67_Sub11_Sub3 arg10,
				 int arg11, int arg12) {
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 + 256 - arg4 + arg11) / arg11) > arg8)
	    arg7 = arg8;
	while (arg5 < arg7) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff)) * arg6
		    >> 6);
	    arg4 += arg11;
	}
	if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11) / arg11) > arg8)
	    arg7 = arg8;
	arg0 = arg12;
	arg1 = arg11;
	while (arg5 < arg7) {
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg4 += arg1;
	}
	arg10.anInt4880 = arg4;
	return arg5;
    }
    
    public int method1128() {
	if (anInt4874 == 0 && anInt4872 == 0)
	    return 0;
	return 1;
    }
    
    public Class67_Sub11_Sub3(Class67_Sub13_Sub1 arg0, int arg1, int arg2) {
	aClass67_Sub13_3023 = arg0;
	anInt4868 = arg0.anInt4957;
	anInt4870 = arg0.anInt4960;
	aBoolean4869 = arg0.aBoolean4959;
	anInt4873 = arg1;
	anInt4874 = arg2;
	anInt4871 = 8192;
	anInt4880 = 0;
	method1156();
    }
    
    public int method1126() {
	int i = anInt4867 * 3 >> 6;
	i = (i ^ i >> 31) + (i >>> 31);
	if (anInt4875 == 0)
	    i -= i * anInt4880 / ((((Class67_Sub13_Sub1) aClass67_Sub13_3023)
				   .aByteArray4956).length
				  << 8);
	else if (anInt4875 >= 0)
	    i -= i * anInt4868 / (((Class67_Sub13_Sub1) aClass67_Sub13_3023)
				  .aByteArray4956).length;
	if (i > 255)
	    return 255;
	return i;
    }
    
    public synchronized int method1179() {
	if (anInt4871 < 0)
	    return -1;
	return anInt4871;
    }
    
    public synchronized void method1180(int arg0, int arg1) {
	anInt4874 = arg0;
	anInt4871 = arg1;
	anInt4872 = 0;
	method1156();
    }
    
    public Class67_Sub11_Sub3(Class67_Sub13_Sub1 arg0, int arg1, int arg2,
			      int arg3) {
	aClass67_Sub13_3023 = arg0;
	anInt4868 = arg0.anInt4957;
	anInt4870 = arg0.anInt4960;
	aBoolean4869 = arg0.aBoolean4959;
	anInt4873 = arg1;
	anInt4874 = arg2;
	anInt4871 = arg3;
	anInt4880 = 0;
	method1156();
    }
    
    public synchronized int method1181() {
	if (anInt4873 < 0)
	    return -anInt4873;
	return anInt4873;
    }
}
