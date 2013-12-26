/* Class67_Sub1_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class67_Sub1_Sub12 extends Class67_Sub1
{
    public int anInt3993;
    public int anInt3994 = 5;
    public short[] aShortArray3995;
    public static byte[] aByteArray3996;
    public static RSString aRSString_3997 = Class134.method1914(")3", (byte) 75);
    public static int anInt3998;
    public static int anInt3999;
    public static RSString aRSString_4000;
    public static int anInt4001;
    public int anInt4002;
    public static int anInt4003;
    public byte[] aByteArray4004;
    public static int anInt4005 = 99;
    public static volatile int anInt4006;
    public static int[] anIntArray4007;
    public static RSString aRSString_4008;
    public static int anInt4009;
    public int anInt4010;
    public int anInt4011;
    public int anInt4012;
    public static int anInt4013;
    public static volatile int anInt4014;
    public static RSString aRSString_4015;
    
    public static void method668(byte arg0) {
	if (arg0 == -111) {
	    aByteArray3996 = null;
	    aRSString_3997 = null;
	    aRSString_4000 = null;
	    aRSString_4008 = null;
	    anIntArray4007 = null;
	    aRSString_4015 = null;
	}
    }
    
    public static boolean method669(int arg0, int arg1, int arg2, long arg3) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null)
	    return false;
	if (class67_sub24.aClass58_3221 != null
	    && class67_sub24.aClass58_3221.aLong1118 == arg3)
	    return true;
	if (class67_sub24.aClass94_3224 != null
	    && class67_sub24.aClass94_3224.aLong1886 == arg3)
	    return true;
	if (class67_sub24.aClass104_3216 != null
	    && class67_sub24.aClass104_3216.aLong2035 == arg3)
	    return true;
	for (int i = 0; i < class67_sub24.anInt3215; i++) {
	    if (class67_sub24.aClass36Array3229[i].aLong785 == arg3)
		return true;
	}
	return false;
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4003++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (arg1 != 55)
	    method671(27, -67, 56, -12, (byte) -96);
	if (aClass144_2836.aBoolean2607) {
	    int i = 2048 + Class19.anIntArray490[arg0] * anInt4002;
	    int i_0_ = i >> -203674452;
	    int i_1_ = 1 + i_0_;
	    int i_2_ = 0;
	while_108_:
	    for (/**/; (i_2_ ^ 0xffffffff) > (Class67_Sub5_Sub7.anInt4569
					      ^ 0xffffffff); i_2_++) {
		Class67_Sub5_Sub2.anInt4478 = Class13.anInt433
		    = Class126.anInt2354 = Class67_Sub12.anInt3042
		    = 2147483647;
		int i_3_ = (anInt3994 * Class67_Sub1_Sub35.anIntArray4344[i_2_]
			    + 2048);
		int i_4_ = i_3_ >> -1427828;
		int i_5_ = 1 + i_4_;
		for (int i_6_ = i_0_ - 1;
		     (i_6_ ^ 0xffffffff) >= (i_1_ ^ 0xffffffff); i_6_++) {
		    int i_7_ = 0xff & aByteArray4004[(((anInt4002 ^ 0xffffffff)
						       >= (i_6_ ^ 0xffffffff))
						      ? -anInt4002 + i_6_
						      : i_6_) & 0xff];
		    for (int i_8_ = i_4_ + -1;
			 (i_5_ ^ 0xffffffff) <= (i_8_ ^ 0xffffffff); i_8_++) {
			int i_9_
			    = 2 * (0xff
				   & aByteArray4004[(anInt3994 <= i_8_
						     ? i_8_ - anInt3994
						     : i_8_) + i_7_ & 0xff]);
			int i_10_ = (i_3_ - aShortArray3995[i_9_++]
				     + -(i_8_ << 1054858476));
			int i_11_ = (-aShortArray3995[i_9_]
				     - ((i_6_ << -1743577588) - i));
			int i_12_ = anInt4012;
			int i_13_;
		    while_104_:
			do {
			while_103_:
			    do {
			    while_102_:
				do {
				while_101_:
				    do {
					do {
					    if (i_12_ != 1) {
						if (i_12_ != 3) {
						    if (i_12_ != 4) {
							if (i_12_ != 5) {
							    if (i_12_ == 2)
								break while_102_;
							    break while_103_;
							}
						    } else
							break;
						    break while_101_;
						}
					    } else {
						i_13_ = ((i_10_ * i_10_
							  - -(i_11_ * i_11_))
							 >> 1369802476);
						break while_104_;
					    }
					    i_10_ = i_10_ < 0 ? -i_10_ : i_10_;
					    i_11_ = ((i_11_ ^ 0xffffffff) <= -1
						     ? i_11_ : -i_11_);
					    i_13_ = (((i_10_ ^ 0xffffffff)
						      < (i_11_ ^ 0xffffffff))
						     ? i_10_ : i_11_);
					    break while_104_;
					} while (false);
					i_10_
					    = (int) (4096.0
						     * (Math.sqrt
							((double) ((float) ((i_10_
									     ^ 0xffffffff) <= -1
									    ? i_10_
									    : -i_10_)
								   / 4096.0F))));
					i_11_
					    = (int) (4096.0
						     * (Math.sqrt
							((double) ((float) ((i_11_
									     ^ 0xffffffff) > -1
									    ? -i_11_
									    : i_11_)
								   / 4096.0F))));
					i_13_ = i_11_ + i_10_;
					i_13_ = i_13_ * i_13_ >> -1516393396;
					break while_104_;
				    } while (false);
				    i_10_ *= i_10_;
				    i_11_ *= i_11_;
				    i_13_
					= (int) ((Math.sqrt
						  (Math.sqrt
						   ((double) ((float) (i_11_
								       + i_10_)
							      / 1.6777216E7F))))
						 * 4096.0);
				    break while_104_;
				} while (false);
				i_13_ = ((i_10_ < 0 ? -i_10_ : i_10_)
					 + ((i_11_ ^ 0xffffffff) <= -1 ? i_11_
					    : -i_11_));
				break while_104_;
			    } while (false);
			    i_13_
				= (int) ((Math.sqrt
					  ((double) ((float) (i_11_ * i_11_
							      + i_10_ * i_10_)
						     / 1.6777216E7F)))
					 * 4096.0);
			} while (false);
			if (Class67_Sub5_Sub2.anInt4478 > i_13_) {
			    Class67_Sub12.anInt3042 = Class126.anInt2354;
			    Class126.anInt2354 = Class13.anInt433;
			    Class13.anInt433 = Class67_Sub5_Sub2.anInt4478;
			    Class67_Sub5_Sub2.anInt4478 = i_13_;
			} else if (Class13.anInt433 <= i_13_) {
			    if (Class126.anInt2354 <= i_13_) {
				if (i_13_ < Class67_Sub12.anInt3042)
				    Class67_Sub12.anInt3042 = i_13_;
			    } else {
				Class67_Sub12.anInt3042 = Class126.anInt2354;
				Class126.anInt2354 = i_13_;
			    }
			} else {
			    Class67_Sub12.anInt3042 = Class126.anInt2354;
			    Class126.anInt2354 = Class13.anInt433;
			    Class13.anInt433 = i_13_;
			}
		    }
		}
		int i_14_ = anInt4011;
	    while_106_:
		do {
		while_105_:
		    do {
			do {
			    if ((i_14_ ^ 0xffffffff) != -1) {
				if ((i_14_ ^ 0xffffffff) != -2) {
				    if (i_14_ != 3) {
					if ((i_14_ ^ 0xffffffff) != -5) {
					    if (i_14_ == 2)
						break while_106_;
					    continue while_108_;
					}
				    } else
					break;
				    break while_105_;
				}
			    } else {
				is[i_2_] = Class67_Sub5_Sub2.anInt4478;
				continue while_108_;
			    }
			    is[i_2_] = Class13.anInt433;
			    continue while_108_;
			} while (false);
			is[i_2_] = Class126.anInt2354;
			continue while_108_;
		    } while (false);
		    is[i_2_] = Class67_Sub12.anInt3042;
		    continue while_108_;
		} while (false);
		is[i_2_] = -Class67_Sub5_Sub2.anInt4478 + Class13.anInt433;
	    }
	}
	return is;
    }
    
    public void method618(int arg0) {
	int i = 35 % ((arg0 - -60) / 62);
	anInt4013++;
	aByteArray4004 = Class67_Sub30.method1318(anInt4010, (byte) 109);
	method670((byte) 114);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 != true)
	    anInt3999 = 120;
	int i = arg2;
    while_113_:
	do {
	while_112_:
	    do {
	    while_111_:
		do {
		while_110_:
		    do {
		    while_109_:
			do {
			    do {
				if (i != 0) {
				    if ((i ^ 0xffffffff) != -2) {
					if ((i ^ 0xffffffff) != -3) {
					    if ((i ^ 0xffffffff) != -4) {
						if ((i ^ 0xffffffff) != -5) {
						    if ((i ^ 0xffffffff)
							!= -6) {
							if (i == 6)
							    break while_112_;
							break while_113_;
						    }
						} else
						    break while_110_;
						break while_111_;
					    }
					} else
					    break;
					break while_109_;
				    }
				} else {
				    anInt3994 = anInt4002
					= arg0.readByte((byte) 102);
				    break while_113_;
				}
				anInt4010 = arg0.readByte((byte) -32);
				break while_113_;
			    } while (false);
			    anInt3993 = arg0.readUShort(-2386);
			    break while_113_;
			} while (false);
			anInt4011 = arg0.readByte((byte) 96);
			break while_113_;
		    } while (false);
		    anInt4012 = arg0.readByte((byte) -111);
		    break while_113_;
		} while (false);
		anInt3994 = arg0.readByte((byte) -114);
		break while_113_;
	    } while (false);
	    anInt4002 = arg0.readByte((byte) -68);
	} while (false);
	anInt3998++;
    }
    
    public void method670(byte arg0) {
	if (arg0 > 106) {
	    anInt4001++;
	    Random random = new Random((long) anInt4010);
	    aShortArray3995 = new short[512];
	    if (anInt3993 > 0) {
		for (int i = 0; (i ^ 0xffffffff) > -513; i++)
		    aShortArray3995[i]
			= (short) Class67_Sub1_Sub37.method793(120, random,
							       anInt3993);
	    }
	}
    }
    
    public static int method671(int arg0, int arg1, int arg2, int arg3,
				byte arg4) {
	if (arg4 <= 110)
	    method669(-16, -65, -5, -41L);
	int i
	    = -Class26.anIntArray612[1024 * arg3 / arg0] + 65536 >> -482505407;
	anInt4009++;
	return (arg2 * (65536 - i) >> 1958176720) + (arg1 * i >> -441627376);
    }
    
    public Class67_Sub1_Sub12() {
	super(0, true);
	anInt3993 = 2048;
	aShortArray3995 = new short[512];
	anInt4002 = 5;
	anInt4010 = 0;
	anInt4011 = 2;
	anInt4012 = 1;
	aByteArray4004 = new byte[512];
    }
    
    static {
	anInt3999 = 0;
	anIntArray4007
	    = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047,
			  4095, 8191, 16383, 32767, 65535, 131071, 262143,
			  524287, 1048575, 2097151, 4194303, 8388607, 16777215,
			  33554431, 67108863, 134217727, 268435455, 536870911,
			  1073741823, 2147483647, -1 };
	aRSString_4008 = Class134.method1914("Hidden", (byte) 93);
	aRSString_4000 = aRSString_4008;
	anInt4014 = 0;
	anInt4006 = 0;
	int i = 0;
	aByteArray3996 = new byte[32896];
	for (int i_15_ = 0; i_15_ < 256; i_15_++) {
	    for (int i_16_ = 0; i_16_ <= i_15_; i_16_++)
		aByteArray3996[i++]
		    = (byte) (int) (255.0
				    / Math.sqrt((double) ((float) (65535
								   + (i_16_
								      * i_16_)
								   + (i_15_
								      * i_15_))
							  / 65535.0F)));
	}
	aRSString_4015 = Class134.method1914("cross", (byte) 19);
    }
}
