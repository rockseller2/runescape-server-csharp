public class Class27
{
    public static int anInt624 = 0;
    public static RSString aRSString_625;
    public int[] anIntArray626;
    public int[] anIntArray627;
    public static Class31 aClass31_628;
    public static RSString aRSString_629;
    public byte[] aByteArray630;
    public static RSString aRSString_631;
    public static Class67_Sub5_Sub19 aClass67_Sub5_Sub19_632;
    public static RSString aRSString_633;
    public static int anInt634;
    public static Class9 aClass9_635;
    public static int anInt636;
    public static int anInt637 = -1;
    public static int anInt638;
    public static RSString aRSString_639;
    public static RSString aRSString_640
	= Class134.method1914("Impossible de trouver ", (byte) 51);
    public static int anInt641 = 0;
    public static int anInt642;
    public static int anInt643;
    public static int anInt644;
    
    public int method251(int arg0, int arg1, byte[] arg2, int arg3,
			 byte[] arg4, int arg5) {
	try {
	    if (arg5 > -115)
		method254(-82);
	    arg1 += arg0;
	    anInt642++;
	    int i = 0;
	    int i_0_ = arg3 << 1395298339;
	    for (/**/; (arg0 ^ 0xffffffff) > (arg1 ^ 0xffffffff); arg0++) {
		int i_1_ = 0xff & arg4[arg0];
		int i_2_ = aByteArray630[i_1_];
		int i_3_ = anIntArray626[i_1_];
		if (i_2_ == 0)
		    throw new RuntimeException("No codeword for data value "
					       + i_1_);
		int i_4_ = 0x7 & i_0_;
		int i_5_ = i_0_ >> 1011774787;
		int i_6_ = (i_2_ + (i_4_ - 1) >> 1678525667) + i_5_;
		i &= -i_4_ >> 2047085535;
		i_0_ += i_2_;
		i_4_ += 24;
		arg2[i_5_]
		    = (byte) (i = Class67_Sub20.method1273(i, i_3_ >>> i_4_));
		if ((i_6_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
		    i_4_ -= 8;
		    i_5_++;
		    arg2[i_5_] = (byte) (i = i_3_ >>> i_4_);
		    if (i_6_ > i_5_) {
			i_5_++;
			i_4_ -= 8;
			arg2[i_5_] = (byte) (i = i_3_ >>> i_4_);
			if (i_6_ > i_5_) {
			    i_4_ -= 8;
			    i_5_++;
			    arg2[i_5_] = (byte) (i = i_3_ >>> i_4_);
			    if ((i_5_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
				i_4_ -= 8;
				i_5_++;
				arg2[i_5_] = (byte) (i = i_3_ << -i_4_);
			    }
			}
		    }
		}
	    }
	    return (i_0_ + 7 >> -2058412413) + -arg3;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("dd.E(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ')'));
	}
    }
    
    public static void method252(int arg0) {
	Class131_Sub5.aClass136_3666.method1921((byte) -106);
	if (arg0 != 1)
	    aRSString_639 = null;
	anInt634++;
    }
    
    public Class27(byte[] arg0) {
	int i = arg0.length;
	anIntArray627 = new int[8];
	int[] is = new int[33];
	int i_7_ = 0;
	anIntArray626 = new int[i];
	aByteArray630 = arg0;
	for (int i_8_ = 0; i > i_8_; i_8_++) {
	    int i_9_ = arg0[i_8_];
	    if (i_9_ != 0) {
		int i_10_ = 1 << 32 - i_9_;
		int i_11_ = is[i_9_];
		anIntArray626[i_8_] = i_11_;
		int i_12_;
		if ((i_10_ & i_11_) == 0) {
		    i_12_ = i_11_ | i_10_;
		    for (int i_13_ = -1 + i_9_; (i_13_ ^ 0xffffffff) <= -2;
			 i_13_--) {
			int i_14_ = is[i_13_];
			if (i_14_ != i_11_)
			    break;
			int i_15_ = 1 << -i_13_ + 32;
			if ((i_14_ & i_15_) == 0)
			    is[i_13_] = Class67_Sub20.method1273(i_15_, i_14_);
			else {
			    is[i_13_] = is[i_13_ - 1];
			    break;
			}
		    }
		} else
		    i_12_ = is[-1 + i_9_];
		is[i_9_] = i_12_;
		for (int i_16_ = i_9_ - -1; i_16_ <= 32; i_16_++) {
		    if (i_11_ == is[i_16_])
			is[i_16_] = i_12_;
		}
		int i_17_ = 0;
		for (int i_18_ = 0; (i_9_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff);
		     i_18_++) {
		    int i_19_ = -2147483648 >>> i_18_;
		    if ((i_19_ & i_11_) == 0)
			i_17_++;
		    else {
			if ((anIntArray627[i_17_] ^ 0xffffffff) == -1)
			    anIntArray627[i_17_] = i_7_;
			i_17_ = anIntArray627[i_17_];
		    }
		    i_19_ >>>= 1;
		    if ((anIntArray627.length ^ 0xffffffff)
			>= (i_17_ ^ 0xffffffff)) {
			int[] is_20_ = new int[anIntArray627.length * 2];
			for (int i_21_ = 0;
			     ((anIntArray627.length ^ 0xffffffff)
			      < (i_21_ ^ 0xffffffff));
			     i_21_++)
			    is_20_[i_21_] = anIntArray627[i_21_];
			anIntArray627 = is_20_;
		    }
		}
		anIntArray627[i_17_] = i_8_ ^ 0xffffffff;
		if ((i_17_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff))
		    i_7_ = i_17_ + 1;
	    }
	}
    }
    
    public static long method253(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null || class67_sub24.aClass104_3216 == null)
	    return 0L;
	return class67_sub24.aClass104_3216.aLong2035;
    }
    
    public static int method254(int arg0) {
	anInt636++;
	if (Class68.aClass72_1369 == null)
	    return -1;
	for (/**/; ((Class68.aClass72_1369.anInt1439 ^ 0xffffffff)
		    < (Login.anInt1621 ^ 0xffffffff)); Login.anInt1621++) {
	    if (Class68.aClass72_1369.method1347(Login.anInt1621, true))
		return Login.anInt1621++;
	}
	int i = 116 % ((arg0 - -2) / 41);
	return -1;
    }
    
    public int method255(byte[] arg0, byte arg1, byte[] arg2, int arg3,
			 int arg4, int arg5) {
	try {
	    anInt638++;
	    if (arg4 == 0)
		return 0;
	    arg4 += arg5;
	    int i = 0;
	    int i_22_ = arg3;
	    for (;;) {
		byte i_23_ = arg0[i_22_];
		if ((i_23_ ^ 0xffffffff) <= -1)
		    i++;
		else
		    i = anIntArray627[i];
		int i_24_;
		if ((i_24_ = anIntArray627[i]) < 0) {
		    arg2[arg5++] = (byte) (i_24_ ^ 0xffffffff);
		    if ((arg4 ^ 0xffffffff) >= (arg5 ^ 0xffffffff))
			break;
		    i = 0;
		}
		if ((i_23_ & 0x40) != 0)
		    i = anIntArray627[i];
		else
		    i++;
		if (((i_24_ = anIntArray627[i]) ^ 0xffffffff) > -1) {
		    arg2[arg5++] = (byte) (i_24_ ^ 0xffffffff);
		    if (arg5 >= arg4)
			break;
		    i = 0;
		}
		if ((i_23_ & 0x20) == 0)
		    i++;
		else
		    i = anIntArray627[i];
		if (((i_24_ = anIntArray627[i]) ^ 0xffffffff) > -1) {
		    arg2[arg5++] = (byte) (i_24_ ^ 0xffffffff);
		    if ((arg5 ^ 0xffffffff) <= (arg4 ^ 0xffffffff))
			break;
		    i = 0;
		}
		if ((0x10 & i_23_) == 0)
		    i++;
		else
		    i = anIntArray627[i];
		if ((i_24_ = anIntArray627[i]) < 0) {
		    arg2[arg5++] = (byte) (i_24_ ^ 0xffffffff);
		    if ((arg4 ^ 0xffffffff) >= (arg5 ^ 0xffffffff))
			break;
		    i = 0;
		}
		if ((i_23_ & 0x8) == 0)
		    i++;
		else
		    i = anIntArray627[i];
		if ((i_24_ = anIntArray627[i]) < 0) {
		    arg2[arg5++] = (byte) (i_24_ ^ 0xffffffff);
		    if ((arg5 ^ 0xffffffff) <= (arg4 ^ 0xffffffff))
			break;
		    i = 0;
		}
		if ((i_23_ & 0x4) == 0)
		    i++;
		else
		    i = anIntArray627[i];
		if ((i_24_ = anIntArray627[i]) < 0) {
		    arg2[arg5++] = (byte) (i_24_ ^ 0xffffffff);
		    if (arg4 <= arg5)
			break;
		    i = 0;
		}
		if ((i_23_ & 0x2) == 0)
		    i++;
		else
		    i = anIntArray627[i];
		if ((i_24_ = anIntArray627[i]) < 0) {
		    arg2[arg5++] = (byte) (i_24_ ^ 0xffffffff);
		    if ((arg4 ^ 0xffffffff) >= (arg5 ^ 0xffffffff))
			break;
		    i = 0;
		}
		if ((i_23_ & 0x1) == 0)
		    i++;
		else
		    i = anIntArray627[i];
		if ((i_24_ = anIntArray627[i]) < 0) {
		    arg2[arg5++] = (byte) (i_24_ ^ 0xffffffff);
		    if (arg5 >= arg4)
			break;
		    i = 0;
		}
		i_22_++;
	    }
	    if (arg1 != -19)
		aRSString_631 = null;
	    return i_22_ + (1 + -arg3);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("dd.G("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ',' + arg4 + ','
						+ arg5 + ')'));
	}
    }
    
    public static void method256(byte arg0) {
	aRSString_629 = null;
	aRSString_625 = null;
	aRSString_640 = null;
	aClass67_Sub5_Sub19_632 = null;
	aClass31_628 = null;
	aRSString_633 = null;
	aClass9_635 = null;
	int i = 99 % ((arg0 - 4) / 39);
	aRSString_631 = null;
	aRSString_639 = null;
    }
    
    public static void method257(int arg0, int arg1, int arg2, int arg3,
				 byte arg4, int arg5, int arg6, int arg7) {
	anInt643++;
	int i = -21 / ((arg4 - 38) / 54);
	if (Class67_Sub5_Sub15.method977(arg5, false))
	    client.method32(Class67_Sub1_Sub5.aClass7ArrayArray3878[arg5], -1,
			    arg6, arg7, arg2, arg0, arg3, arg1);
    }
    
    static {
	aRSString_629 = Class134.method1914("Cancel", (byte) 111);
	aRSString_639 = Class134.method1914("purple:", (byte) 81);
	aRSString_633 = aRSString_639;
	aRSString_631 = aRSString_639;
	anInt644 = 127;
	aRSString_625 = aRSString_629;
    }
}
