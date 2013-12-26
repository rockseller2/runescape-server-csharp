/* Class67_Sub1_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class67_Sub1_Sub37 extends Class67_Sub1
{
    public static int anInt4383;
    public static int[] anIntArray4384;
    public static int anInt4385;
    public boolean aBoolean4386 = true;
    public static int anInt4387;
    public static Class136 aClass136_4388;
    public static int anInt4389;
    public static RSString aRSString_4390
	= Class134.method1914("Drop", (byte) 94);
    public short[] aShortArray4391;
    public int anInt4392 = 4;
    public static RSString aRSString_4393;
    public byte[] aByteArray4394;
    public int anInt4395 = 0;
    public static int anInt4396;
    public static RSString aRSString_4397;
    public int anInt4398 = 4;
    public static int anInt4399 = -2;
    public short[] aShortArray4400;
    public static int anInt4401;
    public static int anInt4402 = 0;
    public static int anInt4403;
    public static int anInt4404;
    public static int anInt4405;
    public static boolean aBoolean4406;
    public static int anInt4407;
    public static int anInt4408;
    public int anInt4409;
    public int anInt4410;
    public static int anInt4411;
    public static RSString aRSString_4412;
    public static int anInt4413;
    public static int anInt4414;
    
    public static void method790(int arg0, int arg1, int arg2) {
	if (Class67_Sub5_Sub7.anInt4569 != arg1) {
	    Class67_Sub1_Sub35.anIntArray4344 = new int[arg1];
	    for (int i = 0; i < arg1; i++)
		Class67_Sub1_Sub35.anIntArray4344[i]
		    = (i << -912629716) / arg1;
	    Class63.anInt1164 = arg1 == 64 ? 2048 : 4096;
	    Class67_Sub5_Sub7.anInt4569 = arg1;
	    Class76.anInt1581 = -1 + arg1;
	}
	if ((RuntimeException_Sub1.anInt2618 ^ 0xffffffff)
	    != (arg2 ^ 0xffffffff)) {
	    if ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
		!= (arg2 ^ 0xffffffff)) {
		Class19.anIntArray490 = new int[arg2];
		for (int i = 0; arg2 > i; i++)
		    Class19.anIntArray490[i] = (i << 252055980) / arg2;
	    } else
		Class19.anIntArray490 = Class67_Sub1_Sub35.anIntArray4344;
	    Class67_Sub1_Sub36.anInt4381 = arg2 + -1;
	    RuntimeException_Sub1.anInt2618 = arg2;
	}
	int i = 77 / ((arg0 - 35) / 59);
	anInt4396++;
    }
    
    public int method791(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6) {
	anInt4407++;
	int i = arg6 - 4096;
	if (arg3 < 61)
	    method792((byte) 102, null);
	int i_0_ = arg5 >> 401066636;
	arg5 &= 0xfff;
	int i_1_ = i_0_ - -1;
	if ((i_1_ ^ 0xffffffff) <= (arg1 ^ 0xffffffff))
	    i_1_ = 0;
	i_1_ &= 0xff;
	i_0_ &= 0xff;
	int i_2_ = 0x3 & aByteArray4394[arg4 + i_0_];
	int i_3_ = -4096 + arg5;
	int i_4_;
	if ((i_2_ ^ 0xffffffff) < -2)
	    i_4_ = (i_2_ ^ 0xffffffff) != -3 ? -arg6 + -arg5 : arg5 + -arg6;
	else
	    i_4_ = i_2_ != 0 ? arg6 + -arg5 : arg6 + arg5;
	i_2_ = aByteArray4394[arg4 + i_1_] & 0x3;
	int i_5_;
	if (i_2_ > 1)
	    i_5_ = (i_2_ ^ 0xffffffff) == -3 ? i_3_ + -arg6 : -i_3_ + -arg6;
	else
	    i_5_ = (i_2_ ^ 0xffffffff) == -1 ? arg6 + i_3_ : -i_3_ + arg6;
	i_2_ = aByteArray4394[arg2 + i_0_] & 0x3;
	int i_6_ = Class67_Sub1_Sub14.anIntArray4043[arg5];
	int i_7_ = i_4_ - -((i_5_ + -i_4_) * i_6_ >> -1797011956);
	if (i_2_ <= 1)
	    i_4_ = i_2_ != 0 ? i - arg5 : arg5 - -i;
	else
	    i_4_ = i_2_ != 2 ? -arg5 + -i : arg5 - i;
	i_2_ = 0x3 & aByteArray4394[i_1_ - -arg2];
	if (i_2_ > 1)
	    i_5_ = (i_2_ ^ 0xffffffff) == -3 ? -i + i_3_ : -i_3_ - i;
	else
	    i_5_ = i_2_ == 0 ? i_3_ + i : -i_3_ + i;
	int i_8_ = i_4_ - -((-i_4_ + i_5_) * i_6_ >> 1056033548);
	return i_7_ - -((-i_7_ + i_8_) * arg0 >> 160100588);
    }
    
    public void method618(int arg0) {
	aByteArray4394 = Class67_Sub30.method1318(anInt4395, (byte) 108);
	method796((byte) -92);
	anInt4387++;
	int i = anInt4392 - 1;
	int i_9_ = -42 % ((-60 - arg0) / 62);
	for (/**/; i >= 1; i--) {
	    short i_10_ = aShortArray4391[i];
	    if ((i_10_ ^ 0xffffffff) < -9 || (i_10_ ^ 0xffffffff) > 7)
		break;
	    anInt4392--;
	}
    }
    
    public static void method792(byte arg0, Class131_Sub7 arg1) {
	Class87 class87 = arg1.method1880((byte) -40);
	if (arg0 <= 7)
	    method799(-125, null, 60);
	anInt4389++;
	arg1.anInt3720 = class87.anInt1797;
	if ((arg1.anInt3713 ^ 0xffffffff) != -1) {
	    if ((arg1.anInt3735 ^ 0xffffffff) != 0 && arg1.anInt3792 == 0) {
		Class41 class41 = Class120.method1666(arg1.anInt3735, -32);
		if ((arg1.anInt3727 ^ 0xffffffff) < -1
		    && class41.anInt863 == 0) {
		    arg1.anInt3787++;
		    return;
		}
		if ((arg1.anInt3727 ^ 0xffffffff) >= -1
		    && (class41.anInt859 ^ 0xffffffff) == -1) {
		    arg1.anInt3787++;
		    return;
		}
	    }
	    int i = arg1.anInt3726;
	    int i_11_ = arg1.anInt3733;
	    int i_12_ = (128 * arg1.smallX[-1 + arg1.anInt3713]
			 - -(arg1.method1887((byte) -105) * 64));
	    int i_13_ = (arg1.smallY[-1 + arg1.anInt3713] * 128
			 - -(64 * arg1.method1887((byte) -70)));
	    if (i_12_ + -i_11_ > 256 || -i_11_ + i_12_ < -256
		|| (-i + i_13_ ^ 0xffffffff) < -257
		|| (i_13_ - i ^ 0xffffffff) > 255) {
		arg1.anInt3733 = i_12_;
		arg1.anInt3726 = i_13_;
	    } else {
		if ((i_12_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff)) {
		    if (i_13_ <= i) {
			if ((i ^ 0xffffffff) < (i_13_ ^ 0xffffffff))
			    arg1.anInt3721 = 1792;
			else
			    arg1.anInt3721 = 1536;
		    } else
			arg1.anInt3721 = 1280;
		} else if (i_12_ < i_11_) {
		    if (i_13_ > i)
			arg1.anInt3721 = 768;
		    else if (i_13_ >= i)
			arg1.anInt3721 = 512;
		    else
			arg1.anInt3721 = 256;
		} else if ((i ^ 0xffffffff) > (i_13_ ^ 0xffffffff))
		    arg1.anInt3721 = 1024;
		else if ((i ^ 0xffffffff) < (i_13_ ^ 0xffffffff))
		    arg1.anInt3721 = 0;
		int i_14_ = class87.anInt1777;
		int i_15_ = 4;
		boolean bool = true;
		int i_16_ = -arg1.anInt3740 + arg1.anInt3721 & 0x7ff;
		if (i_16_ > 1024)
		    i_16_ -= 2048;
		if (i_16_ >= -256 && i_16_ <= 256)
		    i_14_ = class87.anInt1794;
		else if ((i_16_ ^ 0xffffffff) <= -257
			 && (i_16_ ^ 0xffffffff) > -769)
		    i_14_ = class87.anInt1781;
		else if ((i_16_ ^ 0xffffffff) <= 767 && i_16_ <= -256)
		    i_14_ = class87.anInt1779;
		int i_17_ = 1;
		if ((i_14_ ^ 0xffffffff) == 0)
		    i_14_ = class87.anInt1794;
		arg1.anInt3720 = i_14_;
		if (arg1 instanceof Class131_Sub7_Sub1)
		    bool = (((Class131_Sub7_Sub1) arg1).aClass64_5047
			    .aBoolean1196);
		if (bool) {
		    if ((arg1.anInt3721 ^ 0xffffffff) != (arg1.anInt3740
							  ^ 0xffffffff)
			&& (arg1.anInt3785 ^ 0xffffffff) == 0
			&& arg1.anInt3691 != 0)
			i_15_ = 2;
		    if ((arg1.anInt3713 ^ 0xffffffff) < -3)
			i_15_ = 6;
		    if (arg1.anInt3713 > 3)
			i_15_ = 8;
		    if (arg1.anInt3787 > 0 && arg1.anInt3713 > 1) {
			arg1.anInt3787--;
			i_15_ = 8;
		    }
		} else {
		    if (arg1.anInt3713 > 1)
			i_15_ = 6;
		    if ((arg1.anInt3713 ^ 0xffffffff) < -3)
			i_15_ = 8;
		    if ((arg1.anInt3787 ^ 0xffffffff) < -1
			&& arg1.anInt3713 > 1) {
			i_15_ = 8;
			arg1.anInt3787--;
		    }
		}
		if (arg1.aByteArray3711[arg1.anInt3713 - 1] != 2) {
		    if ((arg1.aByteArray3711[-1 + arg1.anInt3713] ^ 0xffffffff)
			== -1) {
			i_17_ = 0;
			i_15_ >>= 1;
		    }
		} else {
		    i_17_ = 2;
		    i_15_ <<= 1;
		}
		if (i_15_ >= 8 && class87.anInt1812 != -1) {
		    if ((class87.anInt1777 ^ 0xffffffff) == (arg1.anInt3720
							     ^ 0xffffffff)
			&& class87.anInt1795 != -1)
			arg1.anInt3720 = class87.anInt1795;
		    else if (arg1.anInt3720 != class87.anInt1779
			     || class87.anInt1806 == -1) {
			if (arg1.anInt3720 == class87.anInt1781
			    && class87.anInt1782 != -1)
			    arg1.anInt3720 = class87.anInt1782;
			else
			    arg1.anInt3720 = class87.anInt1812;
		    } else
			arg1.anInt3720 = class87.anInt1806;
		} else if (class87.anInt1790 != -1 && i_17_ == 0) {
		    if (arg1.anInt3720 == class87.anInt1777
			&& class87.anInt1793 != -1)
			arg1.anInt3720 = class87.anInt1793;
		    else if (((arg1.anInt3720 ^ 0xffffffff)
			      != (class87.anInt1779 ^ 0xffffffff))
			     || (class87.anInt1769 ^ 0xffffffff) == 0) {
			if ((class87.anInt1781 ^ 0xffffffff) == (arg1.anInt3720
								 ^ 0xffffffff)
			    && (class87.anInt1789 ^ 0xffffffff) != 0)
			    arg1.anInt3720 = class87.anInt1789;
			else
			    arg1.anInt3720 = class87.anInt1790;
		    } else
			arg1.anInt3720 = class87.anInt1769;
		}
		if (class87.anInt1788 != -1) {
		    i_15_ <<= 7;
		    if ((arg1.anInt3713 ^ 0xffffffff) == -2) {
			int i_18_
			    = (((arg1.anInt3726 ^ 0xffffffff) < (i_13_
								 ^ 0xffffffff)
				? -i_13_ + arg1.anInt3726
				: -arg1.anInt3726 + i_13_)
			       << -334295449);
			int i_19_
			    = (arg1.anInt3733 > i_12_ ? arg1.anInt3733 + -i_12_
			       : i_12_ + -arg1.anInt3733) << 1786429607;
			int i_20_ = arg1.anInt3757 * arg1.anInt3757;
			int i_21_
			    = ((i_19_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff)
			       ? i_19_ : i_18_);
			int i_22_ = i_21_ * (class87.anInt1788 * 2);
			if (i_22_ >= i_20_) {
			    if ((i_20_ / 2 ^ 0xffffffff)
				< (i_21_ ^ 0xffffffff)) {
				arg1.anInt3757 -= class87.anInt1788;
				if (arg1.anInt3757 < 0)
				    arg1.anInt3757 = 0;
			    } else if ((arg1.anInt3757 ^ 0xffffffff)
				       > (i_15_ ^ 0xffffffff)) {
				arg1.anInt3757 += class87.anInt1788;
				if ((i_15_ ^ 0xffffffff)
				    > (arg1.anInt3757 ^ 0xffffffff))
				    arg1.anInt3757 = i_15_;
			    }
			} else
			    arg1.anInt3757 /= 2;
		    } else if (arg1.anInt3757 < i_15_) {
			arg1.anInt3757 += class87.anInt1788;
			if (arg1.anInt3757 > i_15_)
			    arg1.anInt3757 = i_15_;
		    } else if ((arg1.anInt3757 ^ 0xffffffff) < -1) {
			arg1.anInt3757 -= class87.anInt1788;
			if ((arg1.anInt3757 ^ 0xffffffff) > -1)
			    arg1.anInt3757 = 0;
		    }
		    i_15_ = arg1.anInt3757 >> 2026454599;
		    if ((i_15_ ^ 0xffffffff) > -2)
			i_15_ = 1;
		}
		if (i_13_ > i) {
		    arg1.anInt3726 += i_15_;
		    if ((i_13_ ^ 0xffffffff) > (arg1.anInt3726 ^ 0xffffffff))
			arg1.anInt3726 = i_13_;
		} else if ((i ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
		    arg1.anInt3726 -= i_15_;
		    if (i_13_ > arg1.anInt3726)
			arg1.anInt3726 = i_13_;
		}
		if (i_11_ >= i_12_) {
		    if ((i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff)) {
			arg1.anInt3733 -= i_15_;
			if ((arg1.anInt3733 ^ 0xffffffff)
			    > (i_12_ ^ 0xffffffff))
			    arg1.anInt3733 = i_12_;
		    }
		} else {
		    arg1.anInt3733 += i_15_;
		    if ((arg1.anInt3733 ^ 0xffffffff) < (i_12_ ^ 0xffffffff))
			arg1.anInt3733 = i_12_;
		}
		if ((arg1.anInt3733 ^ 0xffffffff) == (i_12_ ^ 0xffffffff)
		    && (i_13_ ^ 0xffffffff) == (arg1.anInt3726 ^ 0xffffffff)) {
		    if ((arg1.anInt3727 ^ 0xffffffff) < -1)
			arg1.anInt3727--;
		    arg1.anInt3713--;
		}
	    }
	} else
	    arg1.anInt3787 = 0;
    }
    
    public static int method793(int arg0, Random arg1, int arg2) {
	anInt4404++;
	if ((arg2 ^ 0xffffffff) >= -1)
	    throw new IllegalArgumentException();
	if (Class33.method293(50, arg2))
	    return (int) ((long) arg2 * (0xffffffffL & (long) arg1.nextInt())
			  >> -973369760);
	int i = 37 % ((arg0 - 59) / 52);
	int i_23_ = -2147483648 + -(int) (4294967296L % (long) arg2);
	int i_24_;
	do
	    i_24_ = arg1.nextInt();
	while (i_23_ <= i_24_);
	return Class67_Sub5_Sub9.method897((byte) 108, i_24_, arg2);
    }
    
    public static void method794(Class131_Sub7 arg0, boolean arg1) {
	int i = -Class67_Sub1_Sub9.anInt3952 + arg0.anInt3714;
	anInt4411++;
	if (arg1 == true) {
	    int i_25_
		= 128 * arg0.anInt3781 - -(arg0.method1887((byte) -101) * 64);
	    int i_26_
		= arg0.anInt3766 * 128 + 64 * arg0.method1887((byte) -88);
	    arg0.anInt3787 = 0;
	    arg0.anInt3726 += (i_26_ - arg0.anInt3726) / i;
	    arg0.anInt3733 += (i_25_ + -arg0.anInt3733) / i;
	    if (arg0.anInt3765 == 0)
		arg0.anInt3721 = 1024;
	    if (arg0.anInt3765 == 1)
		arg0.anInt3721 = 1536;
	    if ((arg0.anInt3765 ^ 0xffffffff) == -3)
		arg0.anInt3721 = 0;
	    if (arg0.anInt3765 == 3)
		arg0.anInt3721 = 512;
	}
    }
    
    public static void method795(byte arg0, RSString arg1, boolean arg2) {
	anInt4403++;
	int i = 0;
	short[] is = new short[16];
	arg1 = arg1.method496(arg0 ^ 0x2062);
	int i_27_ = !arg2 ? 0 : 32768;
	int i_28_ = i_27_ + (arg2 ? Class101.anInt1984
			     : Class67_Sub1_Sub4.anInt3863);
	for (int i_29_ = i_27_; i_28_ > i_29_; i_29_++) {
	    Class67_Sub5_Sub12 class67_sub5_sub12
		= Class11.method143(i_29_, arg0 ^ ~0x804c);
	    if (class67_sub5_sub12.aBoolean4688
		&& (class67_sub5_sub12.method948(false).method496
			(arg0 ^ 0x2062).method514((byte) -128, arg1)
		    ^ 0xffffffff) != 0) {
		if ((i ^ 0xffffffff) <= -51) {
		    Class67_Sub1_Sub23.aShortArray4184 = null;
		    Class53.anInt1067 = -1;
		    return;
		}
		if ((i ^ 0xffffffff) <= (is.length ^ 0xffffffff)) {
		    short[] is_30_ = new short[2 * is.length];
		    for (int i_31_ = 0;
			 (i ^ 0xffffffff) < (i_31_ ^ 0xffffffff); i_31_++)
			is_30_[i_31_] = is[i_31_];
		    is = is_30_;
		}
		is[i++] = (short) i_29_;
	    }
	}
	Class53.anInt1067 = i;
	if (arg0 == 76) {
	    Class67_Sub1_Sub23.aShortArray4184 = is;
	    Class129_Sub1.anInt3484 = 0;
	    RSString[] RSStrings = new RSString[Class53.anInt1067];
	    for (int i_32_ = 0; i_32_ < Class53.anInt1067; i_32_++)
		RSStrings[i_32_]
		    = Class11.method143(is[i_32_], -32769).method948(false);
	    Class67_Sub1_Sub24.method734(Class67_Sub1_Sub23.aShortArray4184,
					 -4097, RSStrings);
	}
    }
    
    public void method796(byte arg0) {
	if ((anInt4409 ^ 0xffffffff) < -1) {
	    aShortArray4400 = new short[anInt4392];
	    aShortArray4391 = new short[anInt4392];
	    for (int i = 0; (i ^ 0xffffffff) > (anInt4392 ^ 0xffffffff); i++) {
		aShortArray4391[i]
		    = (short) (int) (Math.pow((double) ((float) anInt4409
							/ 4096.0F),
					      (double) i)
				     * 4096.0);
		aShortArray4400[i] = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (aShortArray4391 != null
		   && anInt4392 == aShortArray4391.length) {
	    aShortArray4400 = new short[anInt4392];
	    for (int i = 0; anInt4392 > i; i++)
		aShortArray4400[i] = (short) (int) Math.pow(2.0, (double) i);
	}
	anInt4408++;
	int i = 123 % ((-14 - arg0) / 53);
    }
    
    public static void method797(boolean arg0) {
	if (arg0 != true)
	    method798(55, true);
	aRSString_4393 = null;
	aRSString_4412 = null;
	aRSString_4390 = null;
	aClass136_4388 = null;
	aRSString_4397 = null;
	anIntArray4384 = null;
    }
    
    public Class67_Sub1_Sub37() {
	super(0, true);
	aByteArray4394 = new byte[512];
	anInt4410 = 4;
	anInt4409 = 1638;
    }
    
    public static void method798(int arg0, boolean arg1) {
	anInt4401++;
	Class134.anInt2476--;
	if (arg0 != Class134.anInt2476) {
	    Class17.method179(Class8.aRSStringArray340, 1 + arg0,
			      Class8.aRSStringArray340, arg0,
			      -arg0 + Class134.anInt2476);
	    Class17.method179(Class102.aRSStringArray1998, 1 + arg0,
			      Class102.aRSStringArray1998, arg0,
			      -arg0 + Class134.anInt2476);
	    Class17.method181(Class55_Sub2.anIntArray2802, 1 + arg0,
			      Class55_Sub2.anIntArray2802, arg0,
			      -arg0 + Class134.anInt2476);
	    if (arg1 == false) {
		Class17.method183(Applet_Sub1.aShortArray21, 1 + arg0,
				  Applet_Sub1.aShortArray21, arg0,
				  Class134.anInt2476 - arg0);
		Class17.method182(Class115.aLongArray2188, arg0 + 1,
				  Class115.aLongArray2188, arg0,
				  Class134.anInt2476 + -arg0);
		Class17.method181(Class88.anIntArray1822, arg0 + 1,
				  Class88.anIntArray1822, arg0,
				  -arg0 + Class134.anInt2476);
		Class17.method181(Class131_Sub5.anIntArray3667, arg0 - -1,
				  Class131_Sub5.anIntArray3667, arg0,
				  -arg0 + Class134.anInt2476);
	    }
	}
    }
    
    public static Class67_Sub27 method799(int arg0, Class9 arg1, int arg2) {
	anInt4414++;
	byte[] is = arg1.method123(arg0, 127);
	if (is == null)
	    return null;
	if (arg2 != -3)
	    method798(41, false);
	return new Class67_Sub27(is);
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4383++;
	if (arg1 != 55)
	    aShortArray4391 = null;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607)
	    method800(768, is, arg0);
	return is;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	int i = arg2;
    while_137_:
	do {
	while_136_:
	    do {
	    while_135_:
		do {
		while_134_:
		    do {
		    while_133_:
			do {
			    do {
				if (i != 0) {
				    if (i != 1) {
					if (i != 2) {
					    if (i != 3) {
						if (i != 4) {
						    if (i != 5) {
							if ((i ^ 0xffffffff)
							    == -7)
							    break while_136_;
							break while_137_;
						    }
						} else
						    break while_134_;
						break while_135_;
					    }
					} else
					    break;
					break while_133_;
				    }
				} else {
				    aBoolean4386 = (arg0.readByte((byte) -10)
						    ^ 0xffffffff) == -2;
				    break while_137_;
				}
				anInt4392 = arg0.readByte((byte) -61);
				break while_137_;
			    } while (false);
			    anInt4409 = arg0.readShort2((byte) 104);
			    if (anInt4409 < 0) {
				aShortArray4391 = new short[anInt4392];
				for (i = 0; anInt4392 > i; i++)
				    aShortArray4391[i]
					= (short) arg0.readShort2((byte) 79);
			    }
			    break while_137_;
			} while (false);
			anInt4398 = anInt4410 = arg0.readByte((byte) 105);
			break while_137_;
		    } while (false);
		    anInt4395 = arg0.readByte((byte) 86);
		    break while_137_;
		} while (false);
		anInt4398 = arg0.readByte((byte) -27);
		break while_137_;
	    } while (false);
	    anInt4410 = arg0.readByte((byte) -126);
	} while (false);
	anInt4405++;
	if (arg1 != true)
	    anInt4395 = -35;
    }
    
    public void method800(int arg0, int[] arg1, int arg2) {
	anInt4385++;
	int i = Class19.anIntArray490[arg2] * anInt4410;
	if (arg0 == 768) {
	    if (anInt4392 != 1) {
		int i_33_ = aShortArray4391[0];
		if ((i_33_ ^ 0xffffffff) < -9 || (i_33_ ^ 0xffffffff) > 7) {
		    int i_34_ = aShortArray4400[0] << -2118464724;
		    int i_35_ = i_34_ * anInt4398 >> 1608472236;
		    int i_36_ = i * i_34_ >> 45566412;
		    int i_37_ = i_36_ >> 1058915244;
		    int i_38_ = i_34_ * anInt4410 >> 1799104460;
		    i_36_ &= 0xfff;
		    int i_39_ = 0xff & aByteArray4394[i_37_ & 0xff];
		    int i_40_ = i_37_ - -1;
		    int i_41_ = Class67_Sub1_Sub14.anIntArray4043[i_36_];
		    if ((i_40_ ^ 0xffffffff) <= (i_38_ ^ 0xffffffff))
			i_40_ = 0;
		    int i_42_ = aByteArray4394[i_40_ & 0xff] & 0xff;
		    for (int i_43_ = 0; Class67_Sub5_Sub7.anInt4569 > i_43_;
			 i_43_++) {
			int i_44_ = (Class67_Sub1_Sub35.anIntArray4344[i_43_]
				     * anInt4398);
			int i_45_
			    = method791(i_41_, i_35_, i_42_, 78, i_39_,
					i_34_ * i_44_ >> -17692148, i_36_);
			arg1[i_43_] = i_45_ * i_33_ >> 1020019180;
		    }
		}
		for (int i_46_ = 1;
		     (i_46_ ^ 0xffffffff) > (anInt4392 ^ 0xffffffff);
		     i_46_++) {
		    i_33_ = aShortArray4391[i_46_];
		    if ((i_33_ ^ 0xffffffff) < -9 || i_33_ < -8) {
			int i_47_ = aShortArray4400[i_46_] << -1655468212;
			int i_48_ = i_47_ * anInt4398 >> -1488299380;
			int i_49_ = i_47_ * i >> -597643060;
			int i_50_ = i_47_ * anInt4410 >> 1717809740;
			int i_51_ = i_49_ >> -549949652;
			i_49_ &= 0xfff;
			int i_52_ = aByteArray4394[0xff & i_51_] & 0xff;
			int i_53_ = i_51_ + 1;
			if (i_53_ >= i_50_)
			    i_53_ = 0;
			int i_54_ = Class67_Sub1_Sub14.anIntArray4043[i_49_];
			int i_55_ = aByteArray4394[i_53_ & 0xff] & 0xff;
			if (aBoolean4386 && anInt4392 - 1 == i_46_) {
			    for (int i_56_ = 0;
				 i_56_ < Class67_Sub5_Sub7.anInt4569;
				 i_56_++) {
				int i_57_
				    = (Class67_Sub1_Sub35.anIntArray4344[i_56_]
				       * anInt4398);
				int i_58_
				    = method791(i_54_, i_48_, i_55_,
						arg0 ^ 0x364, i_52_,
						i_47_ * i_57_ >> 534322508,
						i_49_);
				i_58_ = arg1[i_56_] + (i_33_ * i_58_
						       >> -1871305492);
				arg1[i_56_] = 2048 + (i_58_ >> 548121729);
			    }
			} else {
			    for (int i_59_ = 0;
				 Class67_Sub5_Sub7.anInt4569 > i_59_;
				 i_59_++) {
				int i_60_
				    = (Class67_Sub1_Sub35.anIntArray4344[i_59_]
				       * anInt4398);
				int i_61_
				    = method791(i_54_, i_48_, i_55_, 103,
						i_52_,
						i_47_ * i_60_ >> -877491412,
						i_49_);
				arg1[i_59_] += i_61_ * i_33_ >> 1525568620;
			    }
			}
		    }
		}
	    } else {
		int i_62_ = aShortArray4391[0];
		int i_63_ = aShortArray4400[0] << 1489242124;
		int i_64_ = anInt4410 * i_63_ >> -1053294772;
		int i_65_ = anInt4398 * i_63_ >> 1192150380;
		int i_66_ = i_63_ * i >> -1767078964;
		int i_67_ = i_66_ >> -185757908;
		int i_68_ = i_67_ + 1;
		int i_69_ = 0xff & aByteArray4394[i_67_ & 0xff];
		if ((i_68_ ^ 0xffffffff) <= (i_64_ ^ 0xffffffff))
		    i_68_ = 0;
		i_66_ &= 0xfff;
		int i_70_ = Class67_Sub1_Sub14.anIntArray4043[i_66_];
		int i_71_ = aByteArray4394[0xff & i_68_] & 0xff;
		if (!aBoolean4386) {
		    for (int i_72_ = 0; Class67_Sub5_Sub7.anInt4569 > i_72_;
			 i_72_++) {
			int i_73_ = (Class67_Sub1_Sub35.anIntArray4344[i_72_]
				     * anInt4398);
			int i_74_
			    = method791(i_70_, i_65_, i_71_, 83, i_69_,
					i_73_ * i_63_ >> -651614132, i_66_);
			arg1[i_72_] = i_62_ * i_74_ >> -1628227220;
		    }
		} else {
		    for (int i_75_ = 0; Class67_Sub5_Sub7.anInt4569 > i_75_;
			 i_75_++) {
			int i_76_ = (Class67_Sub1_Sub35.anIntArray4344[i_75_]
				     * anInt4398);
			int i_77_
			    = method791(i_70_, i_65_, i_71_, 92, i_69_,
					i_76_ * i_63_ >> -2047211348, i_66_);
			i_77_ = i_62_ * i_77_ >> 1709538604;
			arg1[i_75_] = 2048 + (i_77_ >> 1385955649);
		    }
		}
	    }
	}
    }
    
    static {
	aRSString_4397 = aRSString_4390;
	aRSString_4412 = Class134.method1914("Loaded update list", (byte) 29);
	aRSString_4393 = aRSString_4412;
	aBoolean4406 = false;
	aClass136_4388 = new Class136(260);
    }
}
