public class Class26
{
    public static boolean aBoolean606;
    public static int anInt607;
    public static int[] anIntArray608 = new int[512];
    public static int[] anIntArray609;
    public static int anInt610;
    public static int anInt611;
    public static int[] anIntArray612;
    public static boolean aBoolean613;
    public static float aFloat614;
    public static boolean aBoolean615;
    public static int[] anIntArray616;
    public static int[] anIntArray617;
    public static boolean aBoolean618;
    public static boolean aBoolean619;
    public static int[] anIntArray620;
    public static int anInt621;
    public static int anInt622;
    public static Interface3 anInterface3_623;
    
    public static void method230(float arg0) {
	method243(arg0);
	method245(0, 512);
    }
    
    public static void method231() {
	anInt611 = anInt621 / 2;
	anInt607 = anInt622 / 2;
	Class101.anInt1990 = -anInt611;
	Class67_Sub1_Sub34.anInt4336 = anInt621 - anInt611;
	Applet_Sub1.anInt12 = -anInt607;
	Class49.anInt1011 = anInt622 - anInt607;
    }
    
    public static void method232(int[] arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	if (aBoolean615) {
	    if (arg5 > anInt621)
		arg5 = anInt621;
	    if (arg4 < 0)
		arg4 = 0;
	}
	if (arg4 < arg5) {
	    arg1 += arg4;
	    arg6 += arg7 * arg4;
	    if (aBoolean606) {
		arg3 = arg5 - arg4 >> 2;
		arg7 <<= 2;
		if (anInt610 == 0) {
		    if (arg3 > 0) {
			do {
			    arg2 = anIntArray620[arg6 >> 8];
			    arg6 += arg7;
			    arg0[arg1++] = arg2;
			    arg0[arg1++] = arg2;
			    arg0[arg1++] = arg2;
			    arg0[arg1++] = arg2;
			} while (--arg3 > 0);
		    }
		    arg3 = arg5 - arg4 & 0x3;
		    if (arg3 > 0) {
			arg2 = anIntArray620[arg6 >> 8];
			do
			    arg0[arg1++] = arg2;
			while (--arg3 > 0);
		    }
		} else {
		    int i = anInt610;
		    int i_0_ = 256 - anInt610;
		    if (arg3 > 0) {
			do {
			    arg2 = anIntArray620[arg6 >> 8];
			    arg6 += arg7;
			    arg2 = (((arg2 & 0xff00ff) * i_0_ >> 8 & 0xff00ff)
				    + ((arg2 & 0xff00) * i_0_ >> 8 & 0xff00));
			    int i_1_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_1_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_1_ & 0xff00) * i >> 8 & 0xff00));
			    i_1_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_1_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_1_ & 0xff00) * i >> 8 & 0xff00));
			    i_1_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_1_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_1_ & 0xff00) * i >> 8 & 0xff00));
			    i_1_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_1_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_1_ & 0xff00) * i >> 8 & 0xff00));
			} while (--arg3 > 0);
		    }
		    arg3 = arg5 - arg4 & 0x3;
		    if (arg3 > 0) {
			arg2 = anIntArray620[arg6 >> 8];
			arg2 = (((arg2 & 0xff00ff) * i_0_ >> 8 & 0xff00ff)
				+ ((arg2 & 0xff00) * i_0_ >> 8 & 0xff00));
			do {
			    int i_2_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_2_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_2_ & 0xff00) * i >> 8 & 0xff00));
			} while (--arg3 > 0);
		    }
		}
	    } else {
		arg3 = arg5 - arg4;
		if (anInt610 == 0) {
		    do {
			arg0[arg1++] = anIntArray620[arg6 >> 8];
			arg6 += arg7;
		    } while (--arg3 > 0);
		} else {
		    int i = anInt610;
		    int i_3_ = 256 - anInt610;
		    do {
			arg2 = anIntArray620[arg6 >> 8];
			arg6 += arg7;
			arg2 = (((arg2 & 0xff00ff) * i_3_ >> 8 & 0xff00ff)
				+ ((arg2 & 0xff00) * i_3_ >> 8 & 0xff00));
			int i_4_ = arg0[arg1];
			arg0[arg1++]
			    = (arg2 + ((i_4_ & 0xff00ff) * i >> 8 & 0xff00ff)
			       + ((i_4_ & 0xff00) * i >> 8 & 0xff00));
		    } while (--arg3 > 0);
		}
	    }
	}
    }
    
    public static void method233(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11,
				 int arg12, int arg13, int arg14) {
	if (aBoolean615) {
	    if (arg6 > anInt621)
		arg6 = anInt621;
	    if (arg5 < 0)
		arg5 = 0;
	}
	if (arg5 < arg6) {
	    arg4 += arg5;
	    arg7 += arg8 * arg5;
	    int i = arg6 - arg5;
	    do {
		if (aBoolean618) {
		    int i_5_ = arg5 - anInt611;
		    arg9 += arg12 * i_5_;
		    arg10 += arg13 * i_5_;
		    arg11 += arg14 * i_5_;
		    int i_6_ = arg11 >> 12;
		    int i_7_;
		    int i_8_;
		    if (i_6_ != 0) {
			i_7_ = arg9 / i_6_;
			i_8_ = arg10 / i_6_;
		    } else {
			i_7_ = 0;
			i_8_ = 0;
		    }
		    arg9 += arg12 * i;
		    arg10 += arg13 * i;
		    arg11 += arg14 * i;
		    i_6_ = arg11 >> 12;
		    int i_9_;
		    int i_10_;
		    if (i_6_ != 0) {
			i_9_ = arg9 / i_6_;
			i_10_ = arg10 / i_6_;
		    } else {
			i_9_ = 0;
			i_10_ = 0;
		    }
		    arg2 = (i_7_ << 20) + i_8_;
		    int i_11_ = ((i_9_ - i_7_) / i << 20) + (i_10_ - i_8_) / i;
		    i >>= 3;
		    arg8 <<= 3;
		    int i_12_ = arg7 >> 8;
		    if (aBoolean619) {
			if (i > 0) {
			    do {
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_12_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_12_ & 0xff0000))
				       >> 8);
				arg2 += i_11_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_12_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_12_ & 0xff0000))
				       >> 8);
				arg2 += i_11_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_12_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_12_ & 0xff0000))
				       >> 8);
				arg2 += i_11_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_12_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_12_ & 0xff0000))
				       >> 8);
				arg2 += i_11_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_12_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_12_ & 0xff0000))
				       >> 8);
				arg2 += i_11_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_12_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_12_ & 0xff0000))
				       >> 8);
				arg2 += i_11_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_12_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_12_ & 0xff0000))
				       >> 8);
				arg2 += i_11_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_12_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_12_ & 0xff0000))
				       >> 8);
				arg2 += i_11_;
				arg7 += arg8;
				i_12_ = arg7 >> 8;
			    } while (--i > 0);
			}
			i = arg6 - arg5 & 0x7;
			if (i > 0) {
			    do {
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_12_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_12_ & 0xff0000))
				       >> 8);
				arg2 += i_11_;
			    } while (--i > 0);
			}
		    } else {
			if (i > 0) {
			    do {
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_12_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_12_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_11_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_12_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_12_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_11_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_12_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_12_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_11_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_12_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_12_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_11_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_12_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_12_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_11_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_12_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_12_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_11_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_12_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_12_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_11_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_12_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_12_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_11_;
				arg7 += arg8;
				i_12_ = arg7 >> 8;
			    } while (--i > 0);
			}
			i = arg6 - arg5 & 0x7;
			if (i <= 0)
			    break;
			do {
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_12_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_12_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_11_;
			} while (--i > 0);
		    }
		    break;
		}
		int i_13_ = arg5 - anInt611;
		arg9 += arg12 * i_13_;
		arg10 += arg13 * i_13_;
		arg11 += arg14 * i_13_;
		int i_14_ = arg11 >> 14;
		int i_15_;
		int i_16_;
		if (i_14_ != 0) {
		    i_15_ = arg9 / i_14_;
		    i_16_ = arg10 / i_14_;
		} else {
		    i_15_ = 0;
		    i_16_ = 0;
		}
		arg9 += arg12 * i;
		arg10 += arg13 * i;
		arg11 += arg14 * i;
		i_14_ = arg11 >> 14;
		int i_17_;
		int i_18_;
		if (i_14_ != 0) {
		    i_17_ = arg9 / i_14_;
		    i_18_ = arg10 / i_14_;
		} else {
		    i_17_ = 0;
		    i_18_ = 0;
		}
		arg2 = (i_15_ << 18) + i_16_;
		int i_19_ = ((i_17_ - i_15_) / i << 18) + (i_18_ - i_16_) / i;
		i >>= 3;
		arg8 <<= 3;
		int i_20_ = arg7 >> 8;
		if (aBoolean619) {
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_20_ & 0xff0000))
				   >> 8);
			    arg2 += i_19_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_20_ & 0xff0000))
				   >> 8);
			    arg2 += i_19_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_20_ & 0xff0000))
				   >> 8);
			    arg2 += i_19_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_20_ & 0xff0000))
				   >> 8);
			    arg2 += i_19_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_20_ & 0xff0000))
				   >> 8);
			    arg2 += i_19_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_20_ & 0xff0000))
				   >> 8);
			    arg2 += i_19_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_20_ & 0xff0000))
				   >> 8);
			    arg2 += i_19_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_20_ & 0xff0000))
				   >> 8);
			    arg2 += i_19_;
			    arg7 += arg8;
			    i_20_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_20_ & 0xff0000))
				   >> 8);
			    arg2 += i_19_;
			} while (--i > 0);
			break;
		    }
		} else {
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_20_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_19_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_20_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_19_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_20_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_19_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_20_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_19_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_20_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_19_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_20_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_19_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_20_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_19_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_20_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_19_;
			    arg7 += arg8;
			    i_20_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_20_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_20_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_19_;
			} while (--i > 0);
		    }
		}
	    } while (false);
	}
    }
    
    public static void method234
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, int arg8, int arg9, int arg10, int arg11, int arg12,
	 int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
	int[] is = anInterface3_623.method11(arg18, aFloat614, 15964);
	if (is == null) {
	    int i = anInterface3_623.method12((byte) -120, arg18);
	    method244(arg0, arg1, arg2, arg3, arg4, arg5, method240(i, arg6),
		      method240(i, arg7), method240(i, arg8));
	} else {
	    aBoolean618 = anInterface3_623.method7(arg18, 0);
	    aBoolean619 = anInterface3_623.method13(0, arg18);
	    int i = arg4 - arg3;
	    int i_21_ = arg1 - arg0;
	    int i_22_ = arg5 - arg3;
	    int i_23_ = arg2 - arg0;
	    int i_24_ = arg7 - arg6;
	    int i_25_ = arg8 - arg6;
	    int i_26_ = 0;
	    if (arg1 != arg0)
		i_26_ = (arg4 - arg3 << 16) / (arg1 - arg0);
	    int i_27_ = 0;
	    if (arg2 != arg1)
		i_27_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	    int i_28_ = 0;
	    if (arg2 != arg0)
		i_28_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	    int i_29_ = i * i_23_ - i_22_ * i_21_;
	    if (i_29_ != 0) {
		int i_30_ = (i_24_ * i_23_ - i_25_ * i_21_ << 9) / i_29_;
		int i_31_ = (i_25_ * i - i_24_ * i_22_ << 9) / i_29_;
		arg10 = arg9 - arg10;
		arg13 = arg12 - arg13;
		arg16 = arg15 - arg16;
		arg11 -= arg9;
		arg14 -= arg12;
		arg17 -= arg15;
		int i_32_ = arg11 * arg12 - arg14 * arg9 << 14;
		int i_33_ = arg14 * arg15 - arg17 * arg12 << 5;
		int i_34_ = arg17 * arg9 - arg11 * arg15 << 5;
		int i_35_ = arg10 * arg12 - arg13 * arg9 << 14;
		int i_36_ = arg13 * arg15 - arg16 * arg12 << 5;
		int i_37_ = arg16 * arg9 - arg10 * arg15 << 5;
		int i_38_ = arg13 * arg11 - arg10 * arg14 << 14;
		int i_39_ = arg16 * arg14 - arg13 * arg17 << 5;
		int i_40_ = arg10 * arg17 - arg16 * arg11 << 5;
		if (arg0 <= arg1 && arg0 <= arg2) {
		    if (arg0 < anInt622) {
			if (arg1 > anInt622)
			    arg1 = anInt622;
			if (arg2 > anInt622)
			    arg2 = anInt622;
			arg6 = (arg6 << 9) - i_30_ * arg3 + i_30_;
			if (arg1 < arg2) {
			    arg5 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg5 -= i_28_ * arg0;
				arg3 -= i_26_ * arg0;
				arg6 -= i_31_ * arg0;
				arg0 = 0;
			    }
			    arg4 <<= 16;
			    if (arg1 < 0) {
				arg4 -= i_27_ * arg1;
				arg1 = 0;
			    }
			    int i_41_ = arg0 - anInt607;
			    i_32_ += i_34_ * i_41_;
			    i_35_ += i_37_ * i_41_;
			    i_38_ += i_40_ * i_41_;
			    if (arg0 != arg1 && i_28_ < i_26_
				|| arg0 == arg1 && i_28_ > i_27_) {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray609[arg0];
				while (--arg1 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg0, arg5 >> 16, arg3 >> 16,
					      arg6, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg5 += i_28_;
				    arg3 += i_26_;
				    arg6 += i_31_;
				    arg0 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
				while (--arg2 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg0, arg5 >> 16, arg4 >> 16,
					      arg6, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg5 += i_28_;
				    arg4 += i_27_;
				    arg6 += i_31_;
				    arg0 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
			    } else {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray609[arg0];
				while (--arg1 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg0, arg3 >> 16, arg5 >> 16,
					      arg6, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg5 += i_28_;
				    arg3 += i_26_;
				    arg6 += i_31_;
				    arg0 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
				while (--arg2 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg0, arg4 >> 16, arg5 >> 16,
					      arg6, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg5 += i_28_;
				    arg4 += i_27_;
				    arg6 += i_31_;
				    arg0 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
			    }
			} else {
			    arg4 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg4 -= i_28_ * arg0;
				arg3 -= i_26_ * arg0;
				arg6 -= i_31_ * arg0;
				arg0 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_27_ * arg2;
				arg2 = 0;
			    }
			    int i_42_ = arg0 - anInt607;
			    i_32_ += i_34_ * i_42_;
			    i_35_ += i_37_ * i_42_;
			    i_38_ += i_40_ * i_42_;
			    if (arg0 != arg2 && i_28_ < i_26_
				|| arg0 == arg2 && i_27_ > i_26_) {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray609[arg0];
				while (--arg2 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg0, arg4 >> 16, arg3 >> 16,
					      arg6, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg4 += i_28_;
				    arg3 += i_26_;
				    arg6 += i_31_;
				    arg0 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
				while (--arg1 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg0, arg5 >> 16, arg3 >> 16,
					      arg6, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg5 += i_27_;
				    arg3 += i_26_;
				    arg6 += i_31_;
				    arg0 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
			    } else {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray609[arg0];
				while (--arg2 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg0, arg3 >> 16, arg4 >> 16,
					      arg6, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg4 += i_28_;
				    arg3 += i_26_;
				    arg6 += i_31_;
				    arg0 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
				while (--arg1 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg0, arg3 >> 16, arg5 >> 16,
					      arg6, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg5 += i_27_;
				    arg3 += i_26_;
				    arg6 += i_31_;
				    arg0 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
			    }
			}
		    }
		} else if (arg1 <= arg2) {
		    if (arg1 < anInt622) {
			if (arg2 > anInt622)
			    arg2 = anInt622;
			if (arg0 > anInt622)
			    arg0 = anInt622;
			arg7 = (arg7 << 9) - i_30_ * arg4 + i_30_;
			if (arg2 < arg0) {
			    arg3 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg3 -= i_26_ * arg1;
				arg4 -= i_27_ * arg1;
				arg7 -= i_31_ * arg1;
				arg1 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_28_ * arg2;
				arg2 = 0;
			    }
			    int i_43_ = arg1 - anInt607;
			    i_32_ += i_34_ * i_43_;
			    i_35_ += i_37_ * i_43_;
			    i_38_ += i_40_ * i_43_;
			    if (arg1 != arg2 && i_26_ < i_27_
				|| arg1 == arg2 && i_26_ > i_28_) {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray609[arg1];
				while (--arg2 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg1, arg3 >> 16, arg4 >> 16,
					      arg7, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg3 += i_26_;
				    arg4 += i_27_;
				    arg7 += i_31_;
				    arg1 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
				while (--arg0 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg1, arg3 >> 16, arg5 >> 16,
					      arg7, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg3 += i_26_;
				    arg5 += i_28_;
				    arg7 += i_31_;
				    arg1 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
			    } else {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray609[arg1];
				while (--arg2 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg1, arg4 >> 16, arg3 >> 16,
					      arg7, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg3 += i_26_;
				    arg4 += i_27_;
				    arg7 += i_31_;
				    arg1 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
				while (--arg0 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg1, arg5 >> 16, arg3 >> 16,
					      arg7, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg3 += i_26_;
				    arg5 += i_28_;
				    arg7 += i_31_;
				    arg1 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
			    }
			} else {
			    arg5 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg5 -= i_26_ * arg1;
				arg4 -= i_27_ * arg1;
				arg7 -= i_31_ * arg1;
				arg1 = 0;
			    }
			    arg3 <<= 16;
			    if (arg0 < 0) {
				arg3 -= i_28_ * arg0;
				arg0 = 0;
			    }
			    int i_44_ = arg1 - anInt607;
			    i_32_ += i_34_ * i_44_;
			    i_35_ += i_37_ * i_44_;
			    i_38_ += i_40_ * i_44_;
			    if (i_26_ < i_27_) {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray609[arg1];
				while (--arg0 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg1, arg5 >> 16, arg4 >> 16,
					      arg7, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg5 += i_26_;
				    arg4 += i_27_;
				    arg7 += i_31_;
				    arg1 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
				while (--arg2 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg1, arg3 >> 16, arg4 >> 16,
					      arg7, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg3 += i_28_;
				    arg4 += i_27_;
				    arg7 += i_31_;
				    arg1 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
			    } else {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray609[arg1];
				while (--arg0 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg1, arg4 >> 16, arg5 >> 16,
					      arg7, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg5 += i_26_;
				    arg4 += i_27_;
				    arg7 += i_31_;
				    arg1 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
				while (--arg2 >= 0) {
				    method233(Class121.anIntArray2300, is, 0,
					      0, arg1, arg4 >> 16, arg3 >> 16,
					      arg7, i_30_, i_32_, i_35_, i_38_,
					      i_33_, i_36_, i_39_);
				    arg3 += i_28_;
				    arg4 += i_27_;
				    arg7 += i_31_;
				    arg1 += Class121.anInt2296;
				    i_32_ += i_34_;
				    i_35_ += i_37_;
				    i_38_ += i_40_;
				}
			    }
			}
		    }
		} else if (arg2 < anInt622) {
		    if (arg0 > anInt622)
			arg0 = anInt622;
		    if (arg1 > anInt622)
			arg1 = anInt622;
		    arg8 = (arg8 << 9) - i_30_ * arg5 + i_30_;
		    if (arg0 < arg1) {
			arg4 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg4 -= i_27_ * arg2;
			    arg5 -= i_28_ * arg2;
			    arg8 -= i_31_ * arg2;
			    arg2 = 0;
			}
			arg3 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_26_ * arg0;
			    arg0 = 0;
			}
			int i_45_ = arg2 - anInt607;
			i_32_ += i_34_ * i_45_;
			i_35_ += i_37_ * i_45_;
			i_38_ += i_40_ * i_45_;
			if (i_27_ < i_28_) {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray609[arg2];
			    while (--arg0 >= 0) {
				method233(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg4 >> 16, arg5 >> 16, arg8,
					  i_30_, i_32_, i_35_, i_38_, i_33_,
					  i_36_, i_39_);
				arg4 += i_27_;
				arg5 += i_28_;
				arg8 += i_31_;
				arg2 += Class121.anInt2296;
				i_32_ += i_34_;
				i_35_ += i_37_;
				i_38_ += i_40_;
			    }
			    while (--arg1 >= 0) {
				method233(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg4 >> 16, arg3 >> 16, arg8,
					  i_30_, i_32_, i_35_, i_38_, i_33_,
					  i_36_, i_39_);
				arg4 += i_27_;
				arg3 += i_26_;
				arg8 += i_31_;
				arg2 += Class121.anInt2296;
				i_32_ += i_34_;
				i_35_ += i_37_;
				i_38_ += i_40_;
			    }
			} else {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray609[arg2];
			    while (--arg0 >= 0) {
				method233(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg5 >> 16, arg4 >> 16, arg8,
					  i_30_, i_32_, i_35_, i_38_, i_33_,
					  i_36_, i_39_);
				arg4 += i_27_;
				arg5 += i_28_;
				arg8 += i_31_;
				arg2 += Class121.anInt2296;
				i_32_ += i_34_;
				i_35_ += i_37_;
				i_38_ += i_40_;
			    }
			    while (--arg1 >= 0) {
				method233(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg3 >> 16, arg4 >> 16, arg8,
					  i_30_, i_32_, i_35_, i_38_, i_33_,
					  i_36_, i_39_);
				arg4 += i_27_;
				arg3 += i_26_;
				arg8 += i_31_;
				arg2 += Class121.anInt2296;
				i_32_ += i_34_;
				i_35_ += i_37_;
				i_38_ += i_40_;
			    }
			}
		    } else {
			arg3 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg3 -= i_27_ * arg2;
			    arg5 -= i_28_ * arg2;
			    arg8 -= i_31_ * arg2;
			    arg2 = 0;
			}
			arg4 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_26_ * arg1;
			    arg1 = 0;
			}
			int i_46_ = arg2 - anInt607;
			i_32_ += i_34_ * i_46_;
			i_35_ += i_37_ * i_46_;
			i_38_ += i_40_ * i_46_;
			if (i_27_ < i_28_) {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray609[arg2];
			    while (--arg1 >= 0) {
				method233(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg3 >> 16, arg5 >> 16, arg8,
					  i_30_, i_32_, i_35_, i_38_, i_33_,
					  i_36_, i_39_);
				arg3 += i_27_;
				arg5 += i_28_;
				arg8 += i_31_;
				arg2 += Class121.anInt2296;
				i_32_ += i_34_;
				i_35_ += i_37_;
				i_38_ += i_40_;
			    }
			    while (--arg0 >= 0) {
				method233(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg4 >> 16, arg5 >> 16, arg8,
					  i_30_, i_32_, i_35_, i_38_, i_33_,
					  i_36_, i_39_);
				arg4 += i_26_;
				arg5 += i_28_;
				arg8 += i_31_;
				arg2 += Class121.anInt2296;
				i_32_ += i_34_;
				i_35_ += i_37_;
				i_38_ += i_40_;
			    }
			} else {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray609[arg2];
			    while (--arg1 >= 0) {
				method233(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg5 >> 16, arg3 >> 16, arg8,
					  i_30_, i_32_, i_35_, i_38_, i_33_,
					  i_36_, i_39_);
				arg3 += i_27_;
				arg5 += i_28_;
				arg8 += i_31_;
				arg2 += Class121.anInt2296;
				i_32_ += i_34_;
				i_35_ += i_37_;
				i_38_ += i_40_;
			    }
			    while (--arg0 >= 0) {
				method233(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg5 >> 16, arg4 >> 16, arg8,
					  i_30_, i_32_, i_35_, i_38_, i_33_,
					  i_36_, i_39_);
				arg4 += i_26_;
				arg5 += i_28_;
				arg8 += i_31_;
				arg2 += Class121.anInt2296;
				i_32_ += i_34_;
				i_35_ += i_37_;
				i_38_ += i_40_;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method235(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11,
				 int arg12, int arg13, int arg14) {
	if (aBoolean615) {
	    if (arg6 > anInt621)
		arg6 = anInt621;
	    if (arg5 < 0)
		arg5 = 0;
	}
	if (arg5 < arg6) {
	    arg4 += arg5;
	    arg7 += arg8 * arg5;
	    int i = arg6 - arg5;
	    do {
		if (aBoolean618) {
		    int i_47_ = arg5 - anInt611;
		    arg9 += (arg12 >> 3) * i_47_;
		    arg10 += (arg13 >> 3) * i_47_;
		    arg11 += (arg14 >> 3) * i_47_;
		    int i_48_ = arg11 >> 12;
		    int i_49_;
		    int i_50_;
		    if (i_48_ != 0) {
			i_49_ = arg9 / i_48_;
			i_50_ = arg10 / i_48_;
		    } else {
			i_49_ = 0;
			i_50_ = 0;
		    }
		    arg9 += arg12;
		    arg10 += arg13;
		    arg11 += arg14;
		    i_48_ = arg11 >> 12;
		    int i_51_;
		    int i_52_;
		    if (i_48_ != 0) {
			i_51_ = arg9 / i_48_;
			i_52_ = arg10 / i_48_;
		    } else {
			i_51_ = 0;
			i_52_ = 0;
		    }
		    arg2 = (i_49_ << 20) + i_50_;
		    int i_53_
			= (i_51_ - i_49_ >> 3 << 20) + (i_52_ - i_50_ >> 3);
		    i >>= 3;
		    arg8 <<= 3;
		    int i_54_ = arg7 >> 8;
		    if (aBoolean619) {
			if (i > 0) {
			    do {
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_54_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_54_ & 0xff0000))
				       >> 8);
				arg2 += i_53_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_54_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_54_ & 0xff0000))
				       >> 8);
				arg2 += i_53_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_54_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_54_ & 0xff0000))
				       >> 8);
				arg2 += i_53_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_54_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_54_ & 0xff0000))
				       >> 8);
				arg2 += i_53_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_54_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_54_ & 0xff0000))
				       >> 8);
				arg2 += i_53_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_54_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_54_ & 0xff0000))
				       >> 8);
				arg2 += i_53_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_54_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_54_ & 0xff0000))
				       >> 8);
				arg2 += i_53_;
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_54_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_54_ & 0xff0000))
				       >> 8);
				arg2 += i_53_;
				i_49_ = i_51_;
				i_50_ = i_52_;
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				i_48_ = arg11 >> 12;
				if (i_48_ != 0) {
				    i_51_ = arg9 / i_48_;
				    i_52_ = arg10 / i_48_;
				} else {
				    i_51_ = 0;
				    i_52_ = 0;
				}
				arg2 = (i_49_ << 20) + i_50_;
				i_53_ = ((i_51_ - i_49_ >> 3 << 20)
					 + (i_52_ - i_50_ >> 3));
				arg7 += arg8;
				i_54_ = arg7 >> 8;
			    } while (--i > 0);
			}
			i = arg6 - arg5 & 0x7;
			if (i > 0) {
			    do {
				arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
				arg0[arg4++]
				    = ((((arg3 & 0xff00ff) * i_54_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_54_ & 0xff0000))
				       >> 8);
				arg2 += i_53_;
			    } while (--i > 0);
			}
		    } else {
			if (i > 0) {
			    do {
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_54_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_54_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_53_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_54_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_54_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_53_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_54_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_54_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_53_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_54_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_54_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_53_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_54_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_54_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_53_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_54_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_54_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_53_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_54_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_54_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_53_;
				if ((arg3
				     = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				    != 0)
				    arg0[arg4] = (((arg3 & 0xff00ff) * i_54_
						   & ~0xff00ff)
						  + ((arg3 & 0xff00) * i_54_
						     & 0xff0000)) >> 8;
				arg4++;
				arg2 += i_53_;
				i_49_ = i_51_;
				i_50_ = i_52_;
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				i_48_ = arg11 >> 12;
				if (i_48_ != 0) {
				    i_51_ = arg9 / i_48_;
				    i_52_ = arg10 / i_48_;
				} else {
				    i_51_ = 0;
				    i_52_ = 0;
				}
				arg2 = (i_49_ << 20) + i_50_;
				i_53_ = ((i_51_ - i_49_ >> 3 << 20)
					 + (i_52_ - i_50_ >> 3));
				arg7 += arg8;
				i_54_ = arg7 >> 8;
			    } while (--i > 0);
			}
			i = arg6 - arg5 & 0x7;
			if (i <= 0)
			    break;
			do {
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_54_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_54_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_53_;
			} while (--i > 0);
		    }
		    break;
		}
		int i_55_ = arg5 - anInt611;
		arg9 += (arg12 >> 3) * i_55_;
		arg10 += (arg13 >> 3) * i_55_;
		arg11 += (arg14 >> 3) * i_55_;
		int i_56_ = arg11 >> 14;
		int i_57_;
		int i_58_;
		if (i_56_ != 0) {
		    i_57_ = arg9 / i_56_;
		    i_58_ = arg10 / i_56_;
		} else {
		    i_57_ = 0;
		    i_58_ = 0;
		}
		arg9 += arg12;
		arg10 += arg13;
		arg11 += arg14;
		i_56_ = arg11 >> 14;
		int i_59_;
		int i_60_;
		if (i_56_ != 0) {
		    i_59_ = arg9 / i_56_;
		    i_60_ = arg10 / i_56_;
		} else {
		    i_59_ = 0;
		    i_60_ = 0;
		}
		arg2 = (i_57_ << 18) + i_58_;
		int i_61_ = (i_59_ - i_57_ >> 3 << 18) + (i_60_ - i_58_ >> 3);
		i >>= 3;
		arg8 <<= 3;
		int i_62_ = arg7 >> 8;
		if (aBoolean619) {
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_62_ & 0xff0000))
				   >> 8);
			    arg2 += i_61_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_62_ & 0xff0000))
				   >> 8);
			    arg2 += i_61_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_62_ & 0xff0000))
				   >> 8);
			    arg2 += i_61_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_62_ & 0xff0000))
				   >> 8);
			    arg2 += i_61_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_62_ & 0xff0000))
				   >> 8);
			    arg2 += i_61_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_62_ & 0xff0000))
				   >> 8);
			    arg2 += i_61_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_62_ & 0xff0000))
				   >> 8);
			    arg2 += i_61_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_62_ & 0xff0000))
				   >> 8);
			    arg2 += i_61_;
			    i_57_ = i_59_;
			    i_58_ = i_60_;
			    arg9 += arg12;
			    arg10 += arg13;
			    arg11 += arg14;
			    i_56_ = arg11 >> 14;
			    if (i_56_ != 0) {
				i_59_ = arg9 / i_56_;
				i_60_ = arg10 / i_56_;
			    } else {
				i_59_ = 0;
				i_60_ = 0;
			    }
			    arg2 = (i_57_ << 18) + i_58_;
			    i_61_ = (i_59_ - i_57_ >> 3 << 18) + (i_60_ - i_58_
								  >> 3);
			    arg7 += arg8;
			    i_62_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_62_ & 0xff0000))
				   >> 8);
			    arg2 += i_61_;
			} while (--i > 0);
			break;
		    }
		} else {
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_62_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_61_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_62_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_61_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_62_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_61_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_62_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_61_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_62_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_61_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_62_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_61_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_62_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_61_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_62_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_61_;
			    i_57_ = i_59_;
			    i_58_ = i_60_;
			    arg9 += arg12;
			    arg10 += arg13;
			    arg11 += arg14;
			    i_56_ = arg11 >> 14;
			    if (i_56_ != 0) {
				i_59_ = arg9 / i_56_;
				i_60_ = arg10 / i_56_;
			    } else {
				i_59_ = 0;
				i_60_ = 0;
			    }
			    arg2 = (i_57_ << 18) + i_58_;
			    i_61_ = (i_59_ - i_57_ >> 3 << 18) + (i_60_ - i_58_
								  >> 3);
			    arg7 += arg8;
			    i_62_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_62_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_62_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_61_;
			} while (--i > 0);
		    }
		}
	    } while (false);
	}
    }
    
    public static void method236(int[] arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	if (aBoolean615) {
	    if (arg5 > anInt621)
		arg5 = anInt621;
	    if (arg4 < 0)
		arg4 = 0;
	}
	if (arg4 < arg5) {
	    arg1 += arg4;
	    arg3 = arg5 - arg4 >> 2;
	    if (anInt610 == 0) {
		while (--arg3 >= 0) {
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		}
		arg3 = arg5 - arg4 & 0x3;
		while (--arg3 >= 0)
		    arg0[arg1++] = arg2;
	    } else if (anInt610 == 254) {
		while (--arg3 >= 0) {
		    arg0[arg1++] = arg0[arg1];
		    arg0[arg1++] = arg0[arg1];
		    arg0[arg1++] = arg0[arg1];
		    arg0[arg1++] = arg0[arg1];
		}
		arg3 = arg5 - arg4 & 0x3;
		while (--arg3 >= 0)
		    arg0[arg1++] = arg0[arg1];
	    } else {
		int i = anInt610;
		int i_63_ = 256 - anInt610;
		arg2 = (((arg2 & 0xff00ff) * i_63_ >> 8 & 0xff00ff)
			+ ((arg2 & 0xff00) * i_63_ >> 8 & 0xff00));
		while (--arg3 >= 0) {
		    int i_64_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_64_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_64_ & 0xff00) * i >> 8 & 0xff00));
		    i_64_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_64_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_64_ & 0xff00) * i >> 8 & 0xff00));
		    i_64_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_64_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_64_ & 0xff00) * i >> 8 & 0xff00));
		    i_64_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_64_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_64_ & 0xff00) * i >> 8 & 0xff00));
		}
		arg3 = arg5 - arg4 & 0x3;
		while (--arg3 >= 0) {
		    int i_65_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_65_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_65_ & 0xff00) * i >> 8 & 0xff00));
		}
	    }
	}
    }
    
    public static void method237() {
	anIntArray609 = null;
	anIntArray620 = null;
	anInterface3_623 = null;
	anIntArray608 = null;
	anIntArray616 = null;
	anIntArray617 = null;
	anIntArray612 = null;
    }
    
    public static int method238() {
	return anIntArray609[0] / Class121.anInt2296;
    }
    
    public static void method239() {
	method248(Class121.anInt2298, Class121.anInt2295, Class121.anInt2301,
		  Class121.anInt2297);
    }
    
    public static int method240(int arg0, int arg1) {
	arg1 = arg1 * (arg0 & 0x7f) >> 7;
	if (arg1 < 2)
	    arg1 = 2;
	else if (arg1 > 126)
	    arg1 = 126;
	return (arg0 & 0xff80) + arg1;
    }
    
    public static void method241
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, int arg8, int arg9, int arg10, int arg11, int arg12,
	 int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
	int[] is = anInterface3_623.method11(arg18, aFloat614, 15964);
	if (is == null || anInt610 > 10) {
	    int i = anInterface3_623.method12((byte) -121, arg18);
	    aBoolean613 = true;
	    method244(arg0, arg1, arg2, arg3, arg4, arg5, method240(i, arg6),
		      method240(i, arg7), method240(i, arg8));
	} else {
	    aBoolean618 = anInterface3_623.method7(arg18, 0);
	    aBoolean619 = anInterface3_623.method13(0, arg18);
	    int i = arg4 - arg3;
	    int i_66_ = arg1 - arg0;
	    int i_67_ = arg5 - arg3;
	    int i_68_ = arg2 - arg0;
	    int i_69_ = arg7 - arg6;
	    int i_70_ = arg8 - arg6;
	    int i_71_ = 0;
	    if (arg1 != arg0)
		i_71_ = (arg4 - arg3 << 16) / (arg1 - arg0);
	    int i_72_ = 0;
	    if (arg2 != arg1)
		i_72_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	    int i_73_ = 0;
	    if (arg2 != arg0)
		i_73_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	    int i_74_ = i * i_68_ - i_67_ * i_66_;
	    if (i_74_ != 0) {
		int i_75_ = (i_69_ * i_68_ - i_70_ * i_66_ << 9) / i_74_;
		int i_76_ = (i_70_ * i - i_69_ * i_67_ << 9) / i_74_;
		arg10 = arg9 - arg10;
		arg13 = arg12 - arg13;
		arg16 = arg15 - arg16;
		arg11 -= arg9;
		arg14 -= arg12;
		arg17 -= arg15;
		int i_77_ = arg11 * arg12 - arg14 * arg9 << 14;
		int i_78_ = arg14 * arg15 - arg17 * arg12 << 8;
		int i_79_ = arg17 * arg9 - arg11 * arg15 << 5;
		int i_80_ = arg10 * arg12 - arg13 * arg9 << 14;
		int i_81_ = arg13 * arg15 - arg16 * arg12 << 8;
		int i_82_ = arg16 * arg9 - arg10 * arg15 << 5;
		int i_83_ = arg13 * arg11 - arg10 * arg14 << 14;
		int i_84_ = arg16 * arg14 - arg13 * arg17 << 8;
		int i_85_ = arg10 * arg17 - arg16 * arg11 << 5;
		if (arg0 <= arg1 && arg0 <= arg2) {
		    if (arg0 < anInt622) {
			if (arg1 > anInt622)
			    arg1 = anInt622;
			if (arg2 > anInt622)
			    arg2 = anInt622;
			arg6 = (arg6 << 9) - i_75_ * arg3 + i_75_;
			if (arg1 < arg2) {
			    arg5 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg5 -= i_73_ * arg0;
				arg3 -= i_71_ * arg0;
				arg6 -= i_76_ * arg0;
				arg0 = 0;
			    }
			    arg4 <<= 16;
			    if (arg1 < 0) {
				arg4 -= i_72_ * arg1;
				arg1 = 0;
			    }
			    int i_86_ = arg0 - anInt607;
			    i_77_ += i_79_ * i_86_;
			    i_80_ += i_82_ * i_86_;
			    i_83_ += i_85_ * i_86_;
			    if (arg0 != arg1 && i_73_ < i_71_
				|| arg0 == arg1 && i_73_ > i_72_) {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray609[arg0];
				while (--arg1 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg0, arg5 >> 16, arg3 >> 16,
					      arg6, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg5 += i_73_;
				    arg3 += i_71_;
				    arg6 += i_76_;
				    arg0 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
				while (--arg2 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg0, arg5 >> 16, arg4 >> 16,
					      arg6, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg5 += i_73_;
				    arg4 += i_72_;
				    arg6 += i_76_;
				    arg0 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
			    } else {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray609[arg0];
				while (--arg1 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg0, arg3 >> 16, arg5 >> 16,
					      arg6, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg5 += i_73_;
				    arg3 += i_71_;
				    arg6 += i_76_;
				    arg0 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
				while (--arg2 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg0, arg4 >> 16, arg5 >> 16,
					      arg6, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg5 += i_73_;
				    arg4 += i_72_;
				    arg6 += i_76_;
				    arg0 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
			    }
			} else {
			    arg4 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg4 -= i_73_ * arg0;
				arg3 -= i_71_ * arg0;
				arg6 -= i_76_ * arg0;
				arg0 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_72_ * arg2;
				arg2 = 0;
			    }
			    int i_87_ = arg0 - anInt607;
			    i_77_ += i_79_ * i_87_;
			    i_80_ += i_82_ * i_87_;
			    i_83_ += i_85_ * i_87_;
			    if (arg0 != arg2 && i_73_ < i_71_
				|| arg0 == arg2 && i_72_ > i_71_) {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray609[arg0];
				while (--arg2 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg0, arg4 >> 16, arg3 >> 16,
					      arg6, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg4 += i_73_;
				    arg3 += i_71_;
				    arg6 += i_76_;
				    arg0 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
				while (--arg1 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg0, arg5 >> 16, arg3 >> 16,
					      arg6, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg5 += i_72_;
				    arg3 += i_71_;
				    arg6 += i_76_;
				    arg0 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
			    } else {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray609[arg0];
				while (--arg2 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg0, arg3 >> 16, arg4 >> 16,
					      arg6, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg4 += i_73_;
				    arg3 += i_71_;
				    arg6 += i_76_;
				    arg0 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
				while (--arg1 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg0, arg3 >> 16, arg5 >> 16,
					      arg6, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg5 += i_72_;
				    arg3 += i_71_;
				    arg6 += i_76_;
				    arg0 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
			    }
			}
		    }
		} else if (arg1 <= arg2) {
		    if (arg1 < anInt622) {
			if (arg2 > anInt622)
			    arg2 = anInt622;
			if (arg0 > anInt622)
			    arg0 = anInt622;
			arg7 = (arg7 << 9) - i_75_ * arg4 + i_75_;
			if (arg2 < arg0) {
			    arg3 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg3 -= i_71_ * arg1;
				arg4 -= i_72_ * arg1;
				arg7 -= i_76_ * arg1;
				arg1 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_73_ * arg2;
				arg2 = 0;
			    }
			    int i_88_ = arg1 - anInt607;
			    i_77_ += i_79_ * i_88_;
			    i_80_ += i_82_ * i_88_;
			    i_83_ += i_85_ * i_88_;
			    if (arg1 != arg2 && i_71_ < i_72_
				|| arg1 == arg2 && i_71_ > i_73_) {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray609[arg1];
				while (--arg2 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg1, arg3 >> 16, arg4 >> 16,
					      arg7, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg3 += i_71_;
				    arg4 += i_72_;
				    arg7 += i_76_;
				    arg1 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
				while (--arg0 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg1, arg3 >> 16, arg5 >> 16,
					      arg7, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg3 += i_71_;
				    arg5 += i_73_;
				    arg7 += i_76_;
				    arg1 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
			    } else {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray609[arg1];
				while (--arg2 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg1, arg4 >> 16, arg3 >> 16,
					      arg7, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg3 += i_71_;
				    arg4 += i_72_;
				    arg7 += i_76_;
				    arg1 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
				while (--arg0 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg1, arg5 >> 16, arg3 >> 16,
					      arg7, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg3 += i_71_;
				    arg5 += i_73_;
				    arg7 += i_76_;
				    arg1 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
			    }
			} else {
			    arg5 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg5 -= i_71_ * arg1;
				arg4 -= i_72_ * arg1;
				arg7 -= i_76_ * arg1;
				arg1 = 0;
			    }
			    arg3 <<= 16;
			    if (arg0 < 0) {
				arg3 -= i_73_ * arg0;
				arg0 = 0;
			    }
			    int i_89_ = arg1 - anInt607;
			    i_77_ += i_79_ * i_89_;
			    i_80_ += i_82_ * i_89_;
			    i_83_ += i_85_ * i_89_;
			    if (i_71_ < i_72_) {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray609[arg1];
				while (--arg0 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg1, arg5 >> 16, arg4 >> 16,
					      arg7, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg5 += i_71_;
				    arg4 += i_72_;
				    arg7 += i_76_;
				    arg1 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
				while (--arg2 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg1, arg3 >> 16, arg4 >> 16,
					      arg7, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg3 += i_73_;
				    arg4 += i_72_;
				    arg7 += i_76_;
				    arg1 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
			    } else {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray609[arg1];
				while (--arg0 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg1, arg4 >> 16, arg5 >> 16,
					      arg7, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg5 += i_71_;
				    arg4 += i_72_;
				    arg7 += i_76_;
				    arg1 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
				while (--arg2 >= 0) {
				    method235(Class121.anIntArray2300, is, 0,
					      0, arg1, arg4 >> 16, arg3 >> 16,
					      arg7, i_75_, i_77_, i_80_, i_83_,
					      i_78_, i_81_, i_84_);
				    arg3 += i_73_;
				    arg4 += i_72_;
				    arg7 += i_76_;
				    arg1 += Class121.anInt2296;
				    i_77_ += i_79_;
				    i_80_ += i_82_;
				    i_83_ += i_85_;
				}
			    }
			}
		    }
		} else if (arg2 < anInt622) {
		    if (arg0 > anInt622)
			arg0 = anInt622;
		    if (arg1 > anInt622)
			arg1 = anInt622;
		    arg8 = (arg8 << 9) - i_75_ * arg5 + i_75_;
		    if (arg0 < arg1) {
			arg4 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg4 -= i_72_ * arg2;
			    arg5 -= i_73_ * arg2;
			    arg8 -= i_76_ * arg2;
			    arg2 = 0;
			}
			arg3 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_71_ * arg0;
			    arg0 = 0;
			}
			int i_90_ = arg2 - anInt607;
			i_77_ += i_79_ * i_90_;
			i_80_ += i_82_ * i_90_;
			i_83_ += i_85_ * i_90_;
			if (i_72_ < i_73_) {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray609[arg2];
			    while (--arg0 >= 0) {
				method235(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg4 >> 16, arg5 >> 16, arg8,
					  i_75_, i_77_, i_80_, i_83_, i_78_,
					  i_81_, i_84_);
				arg4 += i_72_;
				arg5 += i_73_;
				arg8 += i_76_;
				arg2 += Class121.anInt2296;
				i_77_ += i_79_;
				i_80_ += i_82_;
				i_83_ += i_85_;
			    }
			    while (--arg1 >= 0) {
				method235(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg4 >> 16, arg3 >> 16, arg8,
					  i_75_, i_77_, i_80_, i_83_, i_78_,
					  i_81_, i_84_);
				arg4 += i_72_;
				arg3 += i_71_;
				arg8 += i_76_;
				arg2 += Class121.anInt2296;
				i_77_ += i_79_;
				i_80_ += i_82_;
				i_83_ += i_85_;
			    }
			} else {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray609[arg2];
			    while (--arg0 >= 0) {
				method235(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg5 >> 16, arg4 >> 16, arg8,
					  i_75_, i_77_, i_80_, i_83_, i_78_,
					  i_81_, i_84_);
				arg4 += i_72_;
				arg5 += i_73_;
				arg8 += i_76_;
				arg2 += Class121.anInt2296;
				i_77_ += i_79_;
				i_80_ += i_82_;
				i_83_ += i_85_;
			    }
			    while (--arg1 >= 0) {
				method235(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg3 >> 16, arg4 >> 16, arg8,
					  i_75_, i_77_, i_80_, i_83_, i_78_,
					  i_81_, i_84_);
				arg4 += i_72_;
				arg3 += i_71_;
				arg8 += i_76_;
				arg2 += Class121.anInt2296;
				i_77_ += i_79_;
				i_80_ += i_82_;
				i_83_ += i_85_;
			    }
			}
		    } else {
			arg3 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg3 -= i_72_ * arg2;
			    arg5 -= i_73_ * arg2;
			    arg8 -= i_76_ * arg2;
			    arg2 = 0;
			}
			arg4 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_71_ * arg1;
			    arg1 = 0;
			}
			int i_91_ = arg2 - anInt607;
			i_77_ += i_79_ * i_91_;
			i_80_ += i_82_ * i_91_;
			i_83_ += i_85_ * i_91_;
			if (i_72_ < i_73_) {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray609[arg2];
			    while (--arg1 >= 0) {
				method235(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg3 >> 16, arg5 >> 16, arg8,
					  i_75_, i_77_, i_80_, i_83_, i_78_,
					  i_81_, i_84_);
				arg3 += i_72_;
				arg5 += i_73_;
				arg8 += i_76_;
				arg2 += Class121.anInt2296;
				i_77_ += i_79_;
				i_80_ += i_82_;
				i_83_ += i_85_;
			    }
			    while (--arg0 >= 0) {
				method235(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg4 >> 16, arg5 >> 16, arg8,
					  i_75_, i_77_, i_80_, i_83_, i_78_,
					  i_81_, i_84_);
				arg4 += i_71_;
				arg5 += i_73_;
				arg8 += i_76_;
				arg2 += Class121.anInt2296;
				i_77_ += i_79_;
				i_80_ += i_82_;
				i_83_ += i_85_;
			    }
			} else {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray609[arg2];
			    while (--arg1 >= 0) {
				method235(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg5 >> 16, arg3 >> 16, arg8,
					  i_75_, i_77_, i_80_, i_83_, i_78_,
					  i_81_, i_84_);
				arg3 += i_72_;
				arg5 += i_73_;
				arg8 += i_76_;
				arg2 += Class121.anInt2296;
				i_77_ += i_79_;
				i_80_ += i_82_;
				i_83_ += i_85_;
			    }
			    while (--arg0 >= 0) {
				method235(Class121.anIntArray2300, is, 0, 0,
					  arg2, arg5 >> 16, arg4 >> 16, arg8,
					  i_75_, i_77_, i_80_, i_83_, i_78_,
					  i_81_, i_84_);
				arg4 += i_71_;
				arg5 += i_73_;
				arg8 += i_76_;
				arg2 += Class121.anInt2296;
				i_77_ += i_79_;
				i_80_ += i_82_;
				i_83_ += i_85_;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method242(Interface3 arg0) {
	anInterface3_623 = arg0;
    }
    
    public static void method243(float arg0) {
	aFloat614 = arg0;
	aFloat614 += Math.random() * 0.03 - 0.015;
    }
    
    public static void method244(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	int i = arg4 - arg3;
	int i_92_ = arg1 - arg0;
	int i_93_ = arg5 - arg3;
	int i_94_ = arg2 - arg0;
	int i_95_ = arg7 - arg6;
	int i_96_ = arg8 - arg6;
	int i_97_;
	if (arg2 != arg1)
	    i_97_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	else
	    i_97_ = 0;
	int i_98_;
	if (arg1 != arg0)
	    i_98_ = (i << 16) / i_92_;
	else
	    i_98_ = 0;
	int i_99_;
	if (arg2 != arg0)
	    i_99_ = (i_93_ << 16) / i_94_;
	else
	    i_99_ = 0;
	int i_100_ = i * i_94_ - i_93_ * i_92_;
	if (i_100_ != 0) {
	    int i_101_ = (i_95_ * i_94_ - i_96_ * i_92_ << 8) / i_100_;
	    int i_102_ = (i_96_ * i - i_95_ * i_93_ << 8) / i_100_;
	    if (arg0 <= arg1 && arg0 <= arg2) {
		if (arg0 < anInt622) {
		    if (arg1 > anInt622)
			arg1 = anInt622;
		    if (arg2 > anInt622)
			arg2 = anInt622;
		    arg6 = (arg6 << 8) - i_101_ * arg3 + i_101_;
		    if (arg1 < arg2) {
			arg5 = arg3 <<= 16;
			if (arg0 < 0) {
			    arg5 -= i_99_ * arg0;
			    arg3 -= i_98_ * arg0;
			    arg6 -= i_102_ * arg0;
			    arg0 = 0;
			}
			arg4 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_97_ * arg1;
			    arg1 = 0;
			}
			if (arg0 != arg1 && i_99_ < i_98_
			    || arg0 == arg1 && i_99_ > i_97_) {
			    arg2 -= arg1;
			    arg1 -= arg0;
			    arg0 = anIntArray609[arg0];
			    while (--arg1 >= 0) {
				method232(Class121.anIntArray2300, arg0, 0, 0,
					  arg5 >> 16, arg3 >> 16, arg6,
					  i_101_);
				arg5 += i_99_;
				arg3 += i_98_;
				arg6 += i_102_;
				arg0 += Class121.anInt2296;
			    }
			    while (--arg2 >= 0) {
				method232(Class121.anIntArray2300, arg0, 0, 0,
					  arg5 >> 16, arg4 >> 16, arg6,
					  i_101_);
				arg5 += i_99_;
				arg4 += i_97_;
				arg6 += i_102_;
				arg0 += Class121.anInt2296;
			    }
			} else {
			    arg2 -= arg1;
			    arg1 -= arg0;
			    arg0 = anIntArray609[arg0];
			    while (--arg1 >= 0) {
				method232(Class121.anIntArray2300, arg0, 0, 0,
					  arg3 >> 16, arg5 >> 16, arg6,
					  i_101_);
				arg5 += i_99_;
				arg3 += i_98_;
				arg6 += i_102_;
				arg0 += Class121.anInt2296;
			    }
			    while (--arg2 >= 0) {
				method232(Class121.anIntArray2300, arg0, 0, 0,
					  arg4 >> 16, arg5 >> 16, arg6,
					  i_101_);
				arg5 += i_99_;
				arg4 += i_97_;
				arg6 += i_102_;
				arg0 += Class121.anInt2296;
			    }
			}
		    } else {
			arg4 = arg3 <<= 16;
			if (arg0 < 0) {
			    arg4 -= i_99_ * arg0;
			    arg3 -= i_98_ * arg0;
			    arg6 -= i_102_ * arg0;
			    arg0 = 0;
			}
			arg5 <<= 16;
			if (arg2 < 0) {
			    arg5 -= i_97_ * arg2;
			    arg2 = 0;
			}
			if (arg0 != arg2 && i_99_ < i_98_
			    || arg0 == arg2 && i_97_ > i_98_) {
			    arg1 -= arg2;
			    arg2 -= arg0;
			    arg0 = anIntArray609[arg0];
			    while (--arg2 >= 0) {
				method232(Class121.anIntArray2300, arg0, 0, 0,
					  arg4 >> 16, arg3 >> 16, arg6,
					  i_101_);
				arg4 += i_99_;
				arg3 += i_98_;
				arg6 += i_102_;
				arg0 += Class121.anInt2296;
			    }
			    while (--arg1 >= 0) {
				method232(Class121.anIntArray2300, arg0, 0, 0,
					  arg5 >> 16, arg3 >> 16, arg6,
					  i_101_);
				arg5 += i_97_;
				arg3 += i_98_;
				arg6 += i_102_;
				arg0 += Class121.anInt2296;
			    }
			} else {
			    arg1 -= arg2;
			    arg2 -= arg0;
			    arg0 = anIntArray609[arg0];
			    while (--arg2 >= 0) {
				method232(Class121.anIntArray2300, arg0, 0, 0,
					  arg3 >> 16, arg4 >> 16, arg6,
					  i_101_);
				arg4 += i_99_;
				arg3 += i_98_;
				arg6 += i_102_;
				arg0 += Class121.anInt2296;
			    }
			    while (--arg1 >= 0) {
				method232(Class121.anIntArray2300, arg0, 0, 0,
					  arg3 >> 16, arg5 >> 16, arg6,
					  i_101_);
				arg5 += i_97_;
				arg3 += i_98_;
				arg6 += i_102_;
				arg0 += Class121.anInt2296;
			    }
			}
		    }
		}
	    } else if (arg1 <= arg2) {
		if (arg1 < anInt622) {
		    if (arg2 > anInt622)
			arg2 = anInt622;
		    if (arg0 > anInt622)
			arg0 = anInt622;
		    arg7 = (arg7 << 8) - i_101_ * arg4 + i_101_;
		    if (arg2 < arg0) {
			arg3 = arg4 <<= 16;
			if (arg1 < 0) {
			    arg3 -= i_98_ * arg1;
			    arg4 -= i_97_ * arg1;
			    arg7 -= i_102_ * arg1;
			    arg1 = 0;
			}
			arg5 <<= 16;
			if (arg2 < 0) {
			    arg5 -= i_99_ * arg2;
			    arg2 = 0;
			}
			if (arg1 != arg2 && i_98_ < i_97_
			    || arg1 == arg2 && i_98_ > i_99_) {
			    arg0 -= arg2;
			    arg2 -= arg1;
			    arg1 = anIntArray609[arg1];
			    while (--arg2 >= 0) {
				method232(Class121.anIntArray2300, arg1, 0, 0,
					  arg3 >> 16, arg4 >> 16, arg7,
					  i_101_);
				arg3 += i_98_;
				arg4 += i_97_;
				arg7 += i_102_;
				arg1 += Class121.anInt2296;
			    }
			    while (--arg0 >= 0) {
				method232(Class121.anIntArray2300, arg1, 0, 0,
					  arg3 >> 16, arg5 >> 16, arg7,
					  i_101_);
				arg3 += i_98_;
				arg5 += i_99_;
				arg7 += i_102_;
				arg1 += Class121.anInt2296;
			    }
			} else {
			    arg0 -= arg2;
			    arg2 -= arg1;
			    arg1 = anIntArray609[arg1];
			    while (--arg2 >= 0) {
				method232(Class121.anIntArray2300, arg1, 0, 0,
					  arg4 >> 16, arg3 >> 16, arg7,
					  i_101_);
				arg3 += i_98_;
				arg4 += i_97_;
				arg7 += i_102_;
				arg1 += Class121.anInt2296;
			    }
			    while (--arg0 >= 0) {
				method232(Class121.anIntArray2300, arg1, 0, 0,
					  arg5 >> 16, arg3 >> 16, arg7,
					  i_101_);
				arg3 += i_98_;
				arg5 += i_99_;
				arg7 += i_102_;
				arg1 += Class121.anInt2296;
			    }
			}
		    } else {
			arg5 = arg4 <<= 16;
			if (arg1 < 0) {
			    arg5 -= i_98_ * arg1;
			    arg4 -= i_97_ * arg1;
			    arg7 -= i_102_ * arg1;
			    arg1 = 0;
			}
			arg3 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_99_ * arg0;
			    arg0 = 0;
			}
			if (i_98_ < i_97_) {
			    arg2 -= arg0;
			    arg0 -= arg1;
			    arg1 = anIntArray609[arg1];
			    while (--arg0 >= 0) {
				method232(Class121.anIntArray2300, arg1, 0, 0,
					  arg5 >> 16, arg4 >> 16, arg7,
					  i_101_);
				arg5 += i_98_;
				arg4 += i_97_;
				arg7 += i_102_;
				arg1 += Class121.anInt2296;
			    }
			    while (--arg2 >= 0) {
				method232(Class121.anIntArray2300, arg1, 0, 0,
					  arg3 >> 16, arg4 >> 16, arg7,
					  i_101_);
				arg3 += i_99_;
				arg4 += i_97_;
				arg7 += i_102_;
				arg1 += Class121.anInt2296;
			    }
			} else {
			    arg2 -= arg0;
			    arg0 -= arg1;
			    arg1 = anIntArray609[arg1];
			    while (--arg0 >= 0) {
				method232(Class121.anIntArray2300, arg1, 0, 0,
					  arg4 >> 16, arg5 >> 16, arg7,
					  i_101_);
				arg5 += i_98_;
				arg4 += i_97_;
				arg7 += i_102_;
				arg1 += Class121.anInt2296;
			    }
			    while (--arg2 >= 0) {
				method232(Class121.anIntArray2300, arg1, 0, 0,
					  arg4 >> 16, arg3 >> 16, arg7,
					  i_101_);
				arg3 += i_99_;
				arg4 += i_97_;
				arg7 += i_102_;
				arg1 += Class121.anInt2296;
			    }
			}
		    }
		}
	    } else if (arg2 < anInt622) {
		if (arg0 > anInt622)
		    arg0 = anInt622;
		if (arg1 > anInt622)
		    arg1 = anInt622;
		arg8 = (arg8 << 8) - i_101_ * arg5 + i_101_;
		if (arg0 < arg1) {
		    arg4 = arg5 <<= 16;
		    if (arg2 < 0) {
			arg4 -= i_97_ * arg2;
			arg5 -= i_99_ * arg2;
			arg8 -= i_102_ * arg2;
			arg2 = 0;
		    }
		    arg3 <<= 16;
		    if (arg0 < 0) {
			arg3 -= i_98_ * arg0;
			arg0 = 0;
		    }
		    if (i_97_ < i_99_) {
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray609[arg2];
			while (--arg0 >= 0) {
			    method232(Class121.anIntArray2300, arg2, 0, 0,
				      arg4 >> 16, arg5 >> 16, arg8, i_101_);
			    arg4 += i_97_;
			    arg5 += i_99_;
			    arg8 += i_102_;
			    arg2 += Class121.anInt2296;
			}
			while (--arg1 >= 0) {
			    method232(Class121.anIntArray2300, arg2, 0, 0,
				      arg4 >> 16, arg3 >> 16, arg8, i_101_);
			    arg4 += i_97_;
			    arg3 += i_98_;
			    arg8 += i_102_;
			    arg2 += Class121.anInt2296;
			}
		    } else {
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray609[arg2];
			while (--arg0 >= 0) {
			    method232(Class121.anIntArray2300, arg2, 0, 0,
				      arg5 >> 16, arg4 >> 16, arg8, i_101_);
			    arg4 += i_97_;
			    arg5 += i_99_;
			    arg8 += i_102_;
			    arg2 += Class121.anInt2296;
			}
			while (--arg1 >= 0) {
			    method232(Class121.anIntArray2300, arg2, 0, 0,
				      arg3 >> 16, arg4 >> 16, arg8, i_101_);
			    arg4 += i_97_;
			    arg3 += i_98_;
			    arg8 += i_102_;
			    arg2 += Class121.anInt2296;
			}
		    }
		} else {
		    arg3 = arg5 <<= 16;
		    if (arg2 < 0) {
			arg3 -= i_97_ * arg2;
			arg5 -= i_99_ * arg2;
			arg8 -= i_102_ * arg2;
			arg2 = 0;
		    }
		    arg4 <<= 16;
		    if (arg1 < 0) {
			arg4 -= i_98_ * arg1;
			arg1 = 0;
		    }
		    if (i_97_ < i_99_) {
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray609[arg2];
			while (--arg1 >= 0) {
			    method232(Class121.anIntArray2300, arg2, 0, 0,
				      arg3 >> 16, arg5 >> 16, arg8, i_101_);
			    arg3 += i_97_;
			    arg5 += i_99_;
			    arg8 += i_102_;
			    arg2 += Class121.anInt2296;
			}
			while (--arg0 >= 0) {
			    method232(Class121.anIntArray2300, arg2, 0, 0,
				      arg4 >> 16, arg5 >> 16, arg8, i_101_);
			    arg4 += i_98_;
			    arg5 += i_99_;
			    arg8 += i_102_;
			    arg2 += Class121.anInt2296;
			}
		    } else {
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray609[arg2];
			while (--arg1 >= 0) {
			    method232(Class121.anIntArray2300, arg2, 0, 0,
				      arg5 >> 16, arg3 >> 16, arg8, i_101_);
			    arg3 += i_97_;
			    arg5 += i_99_;
			    arg8 += i_102_;
			    arg2 += Class121.anInt2296;
			}
			while (--arg0 >= 0) {
			    method232(Class121.anIntArray2300, arg2, 0, 0,
				      arg5 >> 16, arg4 >> 16, arg8, i_101_);
			    arg4 += i_98_;
			    arg5 += i_99_;
			    arg8 += i_102_;
			    arg2 += Class121.anInt2296;
			}
		    }
		}
	    }
	}
    }
    
    public static void method245(int arg0, int arg1) {
	int i = arg0 * 128;
	for (int i_103_ = arg0; i_103_ < arg1; i_103_++) {
	    double d = (double) (i_103_ >> 3) / 64.0 + 0.0078125;
	    double d_104_ = (double) (i_103_ & 0x7) / 8.0 + 0.0625;
	    for (int i_105_ = 0; i_105_ < 128; i_105_++) {
		double d_106_ = (double) i_105_ / 128.0;
		double d_107_ = d_106_;
		double d_108_ = d_106_;
		double d_109_ = d_106_;
		if (d_104_ != 0.0) {
		    double d_110_;
		    if (d_106_ < 0.5)
			d_110_ = d_106_ * (1.0 + d_104_);
		    else
			d_110_ = d_106_ + d_104_ - d_106_ * d_104_;
		    double d_111_ = 2.0 * d_106_ - d_110_;
		    double d_112_ = d + 0.3333333333333333;
		    if (d_112_ > 1.0)
			d_112_--;
		    double d_113_ = d;
		    double d_114_ = d - 0.3333333333333333;
		    if (d_114_ < 0.0)
			d_114_++;
		    if (6.0 * d_112_ < 1.0)
			d_107_ = d_111_ + (d_110_ - d_111_) * 6.0 * d_112_;
		    else if (2.0 * d_112_ < 1.0)
			d_107_ = d_110_;
		    else if (3.0 * d_112_ < 2.0)
			d_107_
			    = d_111_ + ((d_110_ - d_111_)
					* (0.6666666666666666 - d_112_) * 6.0);
		    else
			d_107_ = d_111_;
		    if (6.0 * d_113_ < 1.0)
			d_108_ = d_111_ + (d_110_ - d_111_) * 6.0 * d_113_;
		    else if (2.0 * d_113_ < 1.0)
			d_108_ = d_110_;
		    else if (3.0 * d_113_ < 2.0)
			d_108_
			    = d_111_ + ((d_110_ - d_111_)
					* (0.6666666666666666 - d_113_) * 6.0);
		    else
			d_108_ = d_111_;
		    if (6.0 * d_114_ < 1.0)
			d_109_ = d_111_ + (d_110_ - d_111_) * 6.0 * d_114_;
		    else if (2.0 * d_114_ < 1.0)
			d_109_ = d_110_;
		    else if (3.0 * d_114_ < 2.0)
			d_109_
			    = d_111_ + ((d_110_ - d_111_)
					* (0.6666666666666666 - d_114_) * 6.0);
		    else
			d_109_ = d_111_;
		}
		d_107_ = Math.pow(d_107_, (double) aFloat614);
		d_108_ = Math.pow(d_108_, (double) aFloat614);
		d_109_ = Math.pow(d_109_, (double) aFloat614);
		int i_115_ = (int) (d_107_ * 256.0);
		int i_116_ = (int) (d_108_ * 256.0);
		int i_117_ = (int) (d_109_ * 256.0);
		int i_118_ = (i_115_ << 16) + (i_116_ << 8) + i_117_;
		if (i_118_ == 0)
		    i_118_ = 1;
		anIntArray620[i++] = i_118_;
	    }
	}
    }
    
    public static int method246() {
	return anIntArray609[0] % Class121.anInt2296;
    }
    
    public static void method247(int arg0, int arg1, int arg2) {
	aBoolean615 = (arg0 < 0 || arg0 > anInt621 || arg1 < 0
		       || arg1 > anInt621 || arg2 < 0 || arg2 > anInt621);
    }
    
    public static void method248(int arg0, int arg1, int arg2, int arg3) {
	anInt621 = arg2 - arg0;
	anInt622 = arg3 - arg1;
	method231();
	if (anIntArray609.length < anInt622)
	    anIntArray609
		= new int[Class67_Sub1_Sub31.method765(122, anInt622)];
	int i = arg1 * Class121.anInt2296 + arg0;
	for (int i_119_ = 0; i_119_ < anInt622; i_119_++) {
	    anIntArray609[i_119_] = i;
	    i += Class121.anInt2296;
	}
    }
    
    public static void method249(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	int i = 0;
	if (arg1 != arg0)
	    i = (arg4 - arg3 << 16) / (arg1 - arg0);
	int i_120_ = 0;
	if (arg2 != arg1)
	    i_120_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	int i_121_ = 0;
	if (arg2 != arg0)
	    i_121_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	if (arg0 <= arg1 && arg0 <= arg2) {
	    if (arg0 < anInt622) {
		if (arg1 > anInt622)
		    arg1 = anInt622;
		if (arg2 > anInt622)
		    arg2 = anInt622;
		if (arg1 < arg2) {
		    arg5 = arg3 <<= 16;
		    if (arg0 < 0) {
			arg5 -= i_121_ * arg0;
			arg3 -= i * arg0;
			arg0 = 0;
		    }
		    arg4 <<= 16;
		    if (arg1 < 0) {
			arg4 -= i_120_ * arg1;
			arg1 = 0;
		    }
		    if (arg0 != arg1 && i_121_ < i
			|| arg0 == arg1 && i_121_ > i_120_) {
			arg2 -= arg1;
			arg1 -= arg0;
			arg0 = anIntArray609[arg0];
			while (--arg1 >= 0) {
			    method236(Class121.anIntArray2300, arg0, arg6, 0,
				      arg5 >> 16, arg3 >> 16);
			    arg5 += i_121_;
			    arg3 += i;
			    arg0 += Class121.anInt2296;
			}
			while (--arg2 >= 0) {
			    method236(Class121.anIntArray2300, arg0, arg6, 0,
				      arg5 >> 16, arg4 >> 16);
			    arg5 += i_121_;
			    arg4 += i_120_;
			    arg0 += Class121.anInt2296;
			}
		    } else {
			arg2 -= arg1;
			arg1 -= arg0;
			arg0 = anIntArray609[arg0];
			while (--arg1 >= 0) {
			    method236(Class121.anIntArray2300, arg0, arg6, 0,
				      arg3 >> 16, arg5 >> 16);
			    arg5 += i_121_;
			    arg3 += i;
			    arg0 += Class121.anInt2296;
			}
			while (--arg2 >= 0) {
			    method236(Class121.anIntArray2300, arg0, arg6, 0,
				      arg4 >> 16, arg5 >> 16);
			    arg5 += i_121_;
			    arg4 += i_120_;
			    arg0 += Class121.anInt2296;
			}
		    }
		} else {
		    arg4 = arg3 <<= 16;
		    if (arg0 < 0) {
			arg4 -= i_121_ * arg0;
			arg3 -= i * arg0;
			arg0 = 0;
		    }
		    arg5 <<= 16;
		    if (arg2 < 0) {
			arg5 -= i_120_ * arg2;
			arg2 = 0;
		    }
		    if (arg0 != arg2 && i_121_ < i
			|| arg0 == arg2 && i_120_ > i) {
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray609[arg0];
			while (--arg2 >= 0) {
			    method236(Class121.anIntArray2300, arg0, arg6, 0,
				      arg4 >> 16, arg3 >> 16);
			    arg4 += i_121_;
			    arg3 += i;
			    arg0 += Class121.anInt2296;
			}
			while (--arg1 >= 0) {
			    method236(Class121.anIntArray2300, arg0, arg6, 0,
				      arg5 >> 16, arg3 >> 16);
			    arg5 += i_120_;
			    arg3 += i;
			    arg0 += Class121.anInt2296;
			}
		    } else {
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray609[arg0];
			while (--arg2 >= 0) {
			    method236(Class121.anIntArray2300, arg0, arg6, 0,
				      arg3 >> 16, arg4 >> 16);
			    arg4 += i_121_;
			    arg3 += i;
			    arg0 += Class121.anInt2296;
			}
			while (--arg1 >= 0) {
			    method236(Class121.anIntArray2300, arg0, arg6, 0,
				      arg3 >> 16, arg5 >> 16);
			    arg5 += i_120_;
			    arg3 += i;
			    arg0 += Class121.anInt2296;
			}
		    }
		}
	    }
	} else if (arg1 <= arg2) {
	    if (arg1 < anInt622) {
		if (arg2 > anInt622)
		    arg2 = anInt622;
		if (arg0 > anInt622)
		    arg0 = anInt622;
		if (arg2 < arg0) {
		    arg3 = arg4 <<= 16;
		    if (arg1 < 0) {
			arg3 -= i * arg1;
			arg4 -= i_120_ * arg1;
			arg1 = 0;
		    }
		    arg5 <<= 16;
		    if (arg2 < 0) {
			arg5 -= i_121_ * arg2;
			arg2 = 0;
		    }
		    if (arg1 != arg2 && i < i_120_
			|| arg1 == arg2 && i > i_121_) {
			arg0 -= arg2;
			arg2 -= arg1;
			arg1 = anIntArray609[arg1];
			while (--arg2 >= 0) {
			    method236(Class121.anIntArray2300, arg1, arg6, 0,
				      arg3 >> 16, arg4 >> 16);
			    arg3 += i;
			    arg4 += i_120_;
			    arg1 += Class121.anInt2296;
			}
			while (--arg0 >= 0) {
			    method236(Class121.anIntArray2300, arg1, arg6, 0,
				      arg3 >> 16, arg5 >> 16);
			    arg3 += i;
			    arg5 += i_121_;
			    arg1 += Class121.anInt2296;
			}
		    } else {
			arg0 -= arg2;
			arg2 -= arg1;
			arg1 = anIntArray609[arg1];
			while (--arg2 >= 0) {
			    method236(Class121.anIntArray2300, arg1, arg6, 0,
				      arg4 >> 16, arg3 >> 16);
			    arg3 += i;
			    arg4 += i_120_;
			    arg1 += Class121.anInt2296;
			}
			while (--arg0 >= 0) {
			    method236(Class121.anIntArray2300, arg1, arg6, 0,
				      arg5 >> 16, arg3 >> 16);
			    arg3 += i;
			    arg5 += i_121_;
			    arg1 += Class121.anInt2296;
			}
		    }
		} else {
		    arg5 = arg4 <<= 16;
		    if (arg1 < 0) {
			arg5 -= i * arg1;
			arg4 -= i_120_ * arg1;
			arg1 = 0;
		    }
		    arg3 <<= 16;
		    if (arg0 < 0) {
			arg3 -= i_121_ * arg0;
			arg0 = 0;
		    }
		    if (i < i_120_) {
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray609[arg1];
			while (--arg0 >= 0) {
			    method236(Class121.anIntArray2300, arg1, arg6, 0,
				      arg5 >> 16, arg4 >> 16);
			    arg5 += i;
			    arg4 += i_120_;
			    arg1 += Class121.anInt2296;
			}
			while (--arg2 >= 0) {
			    method236(Class121.anIntArray2300, arg1, arg6, 0,
				      arg3 >> 16, arg4 >> 16);
			    arg3 += i_121_;
			    arg4 += i_120_;
			    arg1 += Class121.anInt2296;
			}
		    } else {
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray609[arg1];
			while (--arg0 >= 0) {
			    method236(Class121.anIntArray2300, arg1, arg6, 0,
				      arg4 >> 16, arg5 >> 16);
			    arg5 += i;
			    arg4 += i_120_;
			    arg1 += Class121.anInt2296;
			}
			while (--arg2 >= 0) {
			    method236(Class121.anIntArray2300, arg1, arg6, 0,
				      arg4 >> 16, arg3 >> 16);
			    arg3 += i_121_;
			    arg4 += i_120_;
			    arg1 += Class121.anInt2296;
			}
		    }
		}
	    }
	} else if (arg2 < anInt622) {
	    if (arg0 > anInt622)
		arg0 = anInt622;
	    if (arg1 > anInt622)
		arg1 = anInt622;
	    if (arg0 < arg1) {
		arg4 = arg5 <<= 16;
		if (arg2 < 0) {
		    arg4 -= i_120_ * arg2;
		    arg5 -= i_121_ * arg2;
		    arg2 = 0;
		}
		arg3 <<= 16;
		if (arg0 < 0) {
		    arg3 -= i * arg0;
		    arg0 = 0;
		}
		if (i_120_ < i_121_) {
		    arg1 -= arg0;
		    arg0 -= arg2;
		    arg2 = anIntArray609[arg2];
		    while (--arg0 >= 0) {
			method236(Class121.anIntArray2300, arg2, arg6, 0,
				  arg4 >> 16, arg5 >> 16);
			arg4 += i_120_;
			arg5 += i_121_;
			arg2 += Class121.anInt2296;
		    }
		    while (--arg1 >= 0) {
			method236(Class121.anIntArray2300, arg2, arg6, 0,
				  arg4 >> 16, arg3 >> 16);
			arg4 += i_120_;
			arg3 += i;
			arg2 += Class121.anInt2296;
		    }
		} else {
		    arg1 -= arg0;
		    arg0 -= arg2;
		    arg2 = anIntArray609[arg2];
		    while (--arg0 >= 0) {
			method236(Class121.anIntArray2300, arg2, arg6, 0,
				  arg5 >> 16, arg4 >> 16);
			arg4 += i_120_;
			arg5 += i_121_;
			arg2 += Class121.anInt2296;
		    }
		    while (--arg1 >= 0) {
			method236(Class121.anIntArray2300, arg2, arg6, 0,
				  arg3 >> 16, arg4 >> 16);
			arg4 += i_120_;
			arg3 += i;
			arg2 += Class121.anInt2296;
		    }
		}
	    } else {
		arg3 = arg5 <<= 16;
		if (arg2 < 0) {
		    arg3 -= i_120_ * arg2;
		    arg5 -= i_121_ * arg2;
		    arg2 = 0;
		}
		arg4 <<= 16;
		if (arg1 < 0) {
		    arg4 -= i * arg1;
		    arg1 = 0;
		}
		if (i_120_ < i_121_) {
		    arg0 -= arg1;
		    arg1 -= arg2;
		    arg2 = anIntArray609[arg2];
		    while (--arg1 >= 0) {
			method236(Class121.anIntArray2300, arg2, arg6, 0,
				  arg3 >> 16, arg5 >> 16);
			arg3 += i_120_;
			arg5 += i_121_;
			arg2 += Class121.anInt2296;
		    }
		    while (--arg0 >= 0) {
			method236(Class121.anIntArray2300, arg2, arg6, 0,
				  arg4 >> 16, arg5 >> 16);
			arg4 += i;
			arg5 += i_121_;
			arg2 += Class121.anInt2296;
		    }
		} else {
		    arg0 -= arg1;
		    arg1 -= arg2;
		    arg2 = anIntArray609[arg2];
		    while (--arg1 >= 0) {
			method236(Class121.anIntArray2300, arg2, arg6, 0,
				  arg5 >> 16, arg3 >> 16);
			arg3 += i_120_;
			arg5 += i_121_;
			arg2 += Class121.anInt2296;
		    }
		    while (--arg0 >= 0) {
			method236(Class121.anIntArray2300, arg2, arg6, 0,
				  arg5 >> 16, arg4 >> 16);
			arg4 += i;
			arg5 += i_121_;
			arg2 += Class121.anInt2296;
		    }
		}
	    }
	}
    }
    
    public static void method250(int arg0, int arg1) {
	int i = anIntArray609[0];
	int i_122_ = i / Class121.anInt2296;
	int i_123_ = i - i_122_ * Class121.anInt2296;
	anInt611 = arg0 - i_123_;
	anInt607 = arg1 - i_122_;
	Class101.anInt1990 = -anInt611;
	Class67_Sub1_Sub34.anInt4336 = anInt621 - anInt611;
	Applet_Sub1.anInt12 = -anInt607;
	Class49.anInt1011 = anInt622 - anInt607;
    }
    
    static {
	aBoolean606 = true;
	aBoolean613 = false;
	anIntArray612 = new int[2048];
	anIntArray616 = new int[2048];
	aBoolean618 = false;
	aBoolean619 = false;
	anIntArray617 = new int[2048];
	anIntArray609 = new int[1024];
	anInt610 = 0;
	anIntArray620 = new int[65536];
	aFloat614 = 1.0F;
	aBoolean615 = false;
	for (int i = 1; i < 512; i++)
	    anIntArray608[i] = 32768 / i;
	for (int i = 1; i < 2048; i++)
	    anIntArray616[i] = 65536 / i;
	for (int i = 0; i < 2048; i++) {
	    anIntArray617[i]
		= (int) (65536.0 * Math.sin((double) i * 0.0030679615));
	    anIntArray612[i]
		= (int) (65536.0 * Math.cos((double) i * 0.0030679615));
	}
    }
}
