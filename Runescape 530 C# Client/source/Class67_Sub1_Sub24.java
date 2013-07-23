/* Class67_Sub1_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub24 extends Class67_Sub1
{
    public static int anInt4191 = 0;
    public static int anInt4192;
    public int anInt4193;
    public int anInt4194;
    public static int anInt4195;
    public static int anInt4196;
    public static RSString aRSString_4197;
    public int anInt4198;
    public static byte[][][] aByteArrayArrayArray4199;
    public static int anInt4200;
    public int anInt4201;
    public int anInt4202;
    public int anInt4203 = 0;
    public int anInt4204;
    public int anInt4205;
    public static int anInt4206;
    public int anInt4207;
    public static RSString aRSString_4208;
    public static RSString aRSString_4209
	= Class134.method1914("Clientscript error in: ", (byte) 24);
    public static int anInt4210;
    public static int anInt4211;
    public static int anInt4212;
    public static int anInt4213;
    public static RSString aRSString_4214
	= Class134.method1914("M-Bmoire en cours d(Wattribution", (byte) 11);
    public static RSString aRSString_4215;
    
    public static int method730(int arg0, byte arg1, int arg2) {
	if ((arg0 ^ 0xffffffff) > (arg2 ^ 0xffffffff)) {
	    int i = arg0;
	    arg0 = arg2;
	    arg2 = i;
	}
	anInt4212++;
	if (arg1 != -97)
	    aRSString_4197 = null;
	int i;
	for (/**/; (arg2 ^ 0xffffffff) != -1; arg2 = i) {
	    i = arg0 % arg2;
	    arg0 = arg2;
	}
	return arg0;
    }
    
    public Class67_Sub1_Sub24() {
	super(1, false);
	anInt4202 = 0;
	anInt4204 = 0;
    }
    
    public void method731(int arg0, int arg1, int arg2, int arg3) {
	anInt4206++;
	int i = arg1 > arg3 ? arg1 : arg3;
	int i_0_ = arg3 > arg1 ? arg1 : arg3;
	i = (arg0 ^ 0xffffffff) < (i ^ 0xffffffff) ? arg0 : i;
	i_0_ = arg0 >= i_0_ ? i_0_ : arg0;
	int i_1_ = i - i_0_;
	anInt4207 = (i + i_0_) / 2;
	if (anInt4207 > arg2 && anInt4207 < 4096)
	    anInt4205
		= (i_1_ << -603207380) / (anInt4207 <= 2048 ? anInt4207 * 2
					  : -(anInt4207 * 2) + 8192);
	else
	    anInt4205 = 0;
	if (i_1_ > 0) {
	    int i_2_ = (i - arg3 << -841851700) / i_1_;
	    int i_3_ = (-arg1 + i << -1686436948) / i_1_;
	    int i_4_ = (-arg0 + i << -569567700) / i_1_;
	    if (arg1 != i) {
		if ((arg3 ^ 0xffffffff) != (i ^ 0xffffffff))
		    anInt4193 = i_0_ != arg1 ? -i_3_ + 20480 : i_2_ + 12288;
		else
		    anInt4193 = ((arg0 ^ 0xffffffff) != (i_0_ ^ 0xffffffff)
				 ? 12288 + -i_4_ : i_3_ + 4096);
	    } else
		anInt4193 = arg3 == i_0_ ? 20480 - -i_4_ : 4096 + -i_2_;
	    anInt4193 /= 6;
	} else
	    anInt4193 = 0;
    }
    
    public static void method732(int arg0) {
	aRSString_4214 = null;
	aRSString_4209 = null;
	aByteArrayArrayArray4199 = null;
	aRSString_4215 = null;
	aRSString_4208 = null;
	if (arg0 == 0)
	    aRSString_4197 = null;
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	int[][] is = aClass103_2830.method1551(arg1, 112);
	anInt4195++;
	if (arg0 != true)
	    return null;
	if (aClass103_2830.aBoolean2030) {
	    int[][] is_5_ = this.method609(arg1, !arg0, 0);
	    int[] is_6_ = is_5_[1];
	    int[] is_7_ = is_5_[0];
	    int[] is_8_ = is[0];
	    int[] is_9_ = is[2];
	    int[] is_10_ = is[1];
	    int[] is_11_ = is_5_[2];
	    for (int i = 0; i < Class67_Sub5_Sub7.anInt4569; i++) {
		method731(is_11_[i], is_7_[i], 0, is_6_[i]);
		anInt4207 += anInt4203;
		if ((anInt4207 ^ 0xffffffff) > -1)
		    anInt4207 = 0;
		anInt4193 += anInt4204;
		if (anInt4207 > 4096)
		    anInt4207 = 4096;
		anInt4205 += anInt4202;
		if (anInt4205 < 0)
		    anInt4205 = 0;
		for (/**/; anInt4193 < 0; anInt4193 += 4096) {
		    /* empty */
		}
		for (/**/; (anInt4193 ^ 0xffffffff) < -4097;
		     anInt4193 -= 4096) {
		    /* empty */
		}
		if ((anInt4205 ^ 0xffffffff) < -4097)
		    anInt4205 = 4096;
		method735(anInt4205, -28837, anInt4193, anInt4207);
		is_8_[i] = anInt4198;
		is_10_[i] = anInt4194;
		is_9_[i] = anInt4201;
	    }
	}
	return is;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt4211++;
	if (arg1 == true) {
	    int i = arg2;
	while_145_:
	    do {
		do {
		    if (i != 0) {
			if ((i ^ 0xffffffff) != -2) {
			    if ((i ^ 0xffffffff) == -3)
				break;
			    break while_145_;
			}
		    } else {
			anInt4204 = arg0.readShort2((byte) 109);
			return;
		    }
		    anInt4202 = (arg0.readByte2((byte) 1) << 99888012) / 100;
		    return;
		} while (false);
		anInt4203 = (arg0.readByte2((byte) 1) << 382779276) / 100;
	    } while (false);
	}
    }
    
    public static int method733(boolean arg0, int arg1, int arg2) {
	anInt4196++;
	if ((arg2 ^ 0xffffffff) == 0)
	    return 12345678;
	if (arg0 != false)
	    method730(31, (byte) -2, 121);
	arg1 = (0x7f & arg2) * arg1 >> -1066467865;
	if ((arg1 ^ 0xffffffff) <= -3) {
	    if ((arg1 ^ 0xffffffff) < -127)
		arg1 = 126;
	} else
	    arg1 = 2;
	return arg1 + (0xff80 & arg2);
    }
    
    public static void method734(short[] arg0, int arg1, RSString[] arg2) {
	try {
	    InputStream_Sub1.method52(arg2, arg0, 0, true, -1 + arg2.length);
	    if (arg1 == -4097)
		anInt4210++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("qe.J("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method735(int arg0, int arg1, int arg2, int arg3) {
	anInt4192++;
	int i = ((arg3 ^ 0xffffffff) >= -2049
		 ? arg3 * (arg0 + 4096) >> 1238451692
		 : -(arg3 * arg0 >> 1949070156) + (arg0 + arg3));
    while_149_:
	do {
	    if ((i ^ 0xffffffff) < -1) {
		int i_12_ = arg3 + arg3 + -i;
		int i_13_ = (-i_12_ + i << -789833908) / i;
		arg2 *= 6;
		int i_14_ = arg2 >> -1056200340;
		int i_15_ = i;
		i_15_ = i_15_ * i_13_ >> 1158093036;
		int i_16_ = -(i_14_ << -967065012) + arg2;
		i_15_ = i_15_ * i_16_ >> -587536948;
		int i_17_ = -i_15_ + i;
		int i_18_ = i_12_ - -i_15_;
		int i_19_ = i_14_;
	    while_148_:
		do {
		while_147_:
		    do {
		    while_146_:
			do {
			    do {
				if ((i_19_ ^ 0xffffffff) != -1) {
				    if ((i_19_ ^ 0xffffffff) != -2) {
					if (i_19_ != 2) {
					    if ((i_19_ ^ 0xffffffff) != -4) {
						if (i_19_ != 4) {
						    if ((i_19_ ^ 0xffffffff)
							!= -6)
							break while_149_;
						} else
						    break while_147_;
						break while_148_;
					    }
					} else
					    break;
					break while_146_;
				    }
				} else {
				    anInt4194 = i_18_;
				    anInt4198 = i;
				    anInt4201 = i_12_;
				    break while_149_;
				}
				anInt4198 = i_17_;
				anInt4194 = i;
				anInt4201 = i_12_;
				break while_149_;
			    } while (false);
			    anInt4201 = i_18_;
			    anInt4198 = i_12_;
			    anInt4194 = i;
			    break while_149_;
			} while (false);
			anInt4198 = i_12_;
			anInt4194 = i_17_;
			anInt4201 = i;
			break while_149_;
		    } while (false);
		    anInt4201 = i;
		    anInt4194 = i_12_;
		    anInt4198 = i_18_;
		    break while_149_;
		} while (false);
		anInt4198 = i;
		anInt4194 = i_12_;
		anInt4201 = i_17_;
	    } else
		anInt4198 = anInt4194 = anInt4201 = arg3;
	} while (false);
	if (arg1 != -28837)
	    aRSString_4209 = null;
    }
    
    static {
	aRSString_4208 = Class134.method1914(":duelstake:", (byte) 42);
	aRSString_4215 = Class134.method1914("showingVideoAd", (byte) 12);
	aRSString_4197 = Class134.method1914(")0", (byte) 49);
    }
}
