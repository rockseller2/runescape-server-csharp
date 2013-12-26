public class Class126_Sub2 extends Class126
{
    public static int anInt3425;
    public int anInt3426;
    public int anInt3427;
    public static int anInt3428;
    public static Class9 aClass9_3429;
    public int anInt3430;
    public int anInt3431;
    public int anInt3432;
    public int anInt3433;
    public int anInt3434;
    public static int anInt3435;
    public static int anInt3436;
    public static int anInt3437;
    public static int anInt3438 = 0;
    public static int anInt3439 = 0;
    public static int anInt3440;
    public int anInt3441;
    public static int anInt3442;
    public static int[][][] anIntArrayArrayArray3443;
    
    public void method1708(byte arg0, int arg1, int arg2) {
	anInt3437++;
	if (arg0 != -36)
	    method1708((byte) 19, -95, 115);
    }
    
    public static void playerUpdateMasks(int arg0, Class131_Sub7_Sub2 arg1, int arg2,
				  int arg3) {
	anInt3440++;
	if ((0x80 & arg3) != 0) {
	    int i = Class54.aPacketStream_1069.readLEShort2((byte) -71);
	    boolean bool = (0x8000 & i) != 0;
	    int i_0_ = Class54.aPacketStream_1069.readByte((byte) 102);
	    int i_1_ = Class54.aPacketStream_1069.readByte((byte) 91);
	    int i_2_ = Class54.aPacketStream_1069.currentOffset;
	    if (arg1.playerName != null && arg1.aClass22_5065 != null) {
		long l = arg1.playerName.method501((byte) -16);
		boolean bool_3_ = false;
		if (i_0_ <= 1) {
		    if (!bool && (Class78.aBoolean1602 && !Class23.aBoolean560
				  || Class67_Sub5_Sub16.aBoolean4783))
			bool_3_ = true;
		    else {
			for (int i_4_ = 0;
			     ((i_4_ ^ 0xffffffff)
			      > (Class90.anInt1847 ^ 0xffffffff));
			     i_4_++) {
			    if (Class103.aLongArray2025[i_4_] == l) {
				bool_3_ = true;
				break;
			    }
			}
		    }
		}
		if (!bool_3_ && (Class117.anInt2224 ^ 0xffffffff) == -1) {
		    int i_5_ = -1;
		    Class83.aStream_1681.currentOffset = 0;
		    Class54.aPacketStream_1069.method1077
			(i_1_, 0, Class83.aStream_1681.buffer,
			 (byte) -90);
		    Class83.aStream_1681.currentOffset = 0;
		    RSString RSString;
		    if (bool) {
			i &= 0x7fff;
			Class23 class23
			    = Class128.method1735(1,
						  Class83.aStream_1681);
			i_5_ = class23.anInt559;
			RSString
			    = class23.aClass67_Sub5_Sub12_567
				  .method951(59, Class83.aStream_1681);
		    } else
			RSString = (Class67_Sub5_Sub10.method925
				   (Class50.method434
					(Class83.aStream_1681, 112)
					.method524((byte) 127)));
		    arg1.aRSString_3723 = RSString.method515(32);
		    arg1.anInt3754 = i & 0xff;
		    arg1.anInt3773 = 150;
		    arg1.anInt3746 = i >> -1180959672;
		    if ((i_0_ ^ 0xffffffff) == -3)
			Class66.method600(i_5_, RSString, null, !bool ? 1 : 17,
					  -1,
					  (Class67_Sub1_Sub27.method744
					   ((new RSString[]
					     { Class95.aRSString_1904,
					       arg1.method1898(-14756) }),
					    -128)));
		    else if ((i_0_ ^ 0xffffffff) == -2)
			Class66.method600(i_5_, RSString, null, bool ? 17 : 1,
					  -1,
					  (Class67_Sub1_Sub27.method744
					   ((new RSString[]
					     { Class67_Sub25.aRSString_3254,
					       arg1.method1898(-14756) }),
					    -98)));
		    else
			Class66.method600(i_5_, RSString, null, !bool ? 2 : 17,
					  -1, arg1.method1898(-14756));
		}
	    }
	    Class54.aPacketStream_1069.currentOffset = i_2_ - -i_1_;
	}
	if ((0x1 & arg3) != 0) {	//appendHitUpdate
	    int i = Class54.aPacketStream_1069.method1070(-64);	//getHitDamage1
	    int i_6_ = Class54.aPacketStream_1069.readByteA((byte) 120); //getHitType1
	    arg1.method1881(i, Class67_Sub1_Sub9.anInt3952, 49, i_6_);
	    arg1.anInt3695 = 300 + Class67_Sub1_Sub9.anInt3952;
	    arg1.anInt3761 = Class54.aPacketStream_1069.readByteS(128); //ratio
	}
	if ((0x8 & arg3) != 0) {	//appendAnimationUpdate
	    int i = Class54.aPacketStream_1069.readUShort(-2386);
	    if (i == 65535)
		i = -1;
	    int i_7_ = Class54.aPacketStream_1069.readByte((byte) -90);
	    Class114.method1607(-94, i, i_7_, arg1);
	}
	if ((arg3 & 0x4) != 0) { // apearance / appendAppearanceUpdate
	    int i = Class54.aPacketStream_1069.readByteA((byte) 97);
	    byte[] is = new byte[i];
	    Stream Stream = new Stream(is);
	    Class54.aPacketStream_1069.readBytes(i, 0, -2, is);
	    Class23.aStreamArray556[arg0] = Stream;
	    arg1.appendPlayerAppearance(Stream, 28);
	}
	if ((arg3 & 0x2) != 0) {	//appendFaceEntityUpdate
	    arg1.anInt3785
		= Class54.aPacketStream_1069.readShortA((byte) 22);
	    if ((arg1.anInt3785 ^ 0xffffffff) == -65536) //if(arg1.anInt3785 == 65535)
		arg1.anInt3785 = -1;
	}
	if ((0x400 & arg3) != 0) {	//appendForceMovement
	    arg1.anInt3781
		= Class54.aPacketStream_1069.readByteC((byte) -80);
	    arg1.anInt3766
		= Class54.aPacketStream_1069.readByte((byte) 95);
	    arg1.anInt3696
		= Class54.aPacketStream_1069.readByteA((byte) 99);
	    arg1.anInt3718
		= Class54.aPacketStream_1069.readByte((byte) 101);
	    arg1.anInt3714
		= (Class54.aPacketStream_1069.readLEShort2((byte) -82)
		   + Class67_Sub1_Sub9.anInt3952);
	    arg1.anInt3734
		= (Class54.aPacketStream_1069.readLEShort2((byte) 114)
		   + Class67_Sub1_Sub9.anInt3952);
	    arg1.anInt3765
		= Class54.aPacketStream_1069.readByteC((byte) -80);
	    arg1.anInt3727 = 0;
	    arg1.anInt3713 = 1;
	}
	if ((0x20 & arg3 ^ 0xffffffff) != -1) {	//appendForceTextUpdate
	    arg1.aRSString_3723
		= Class54.aPacketStream_1069.readRSString(-1);
	    if ((arg1.aRSString_3723.method499(0, 127) ^ 0xffffffff) != -127) {
		if (Class122.aClass131_Sub7_Sub2_2309 == arg1)
		    Class87.method1465(true, arg1.aRSString_3723,
				       arg1.method1898(-14756), 2);
	    } else {
		arg1.aRSString_3723
		    = arg1.aRSString_3723.method503((byte) 34, 1);
		Class87.method1465(true, arg1.aRSString_3723,
				   arg1.method1898(-14756), 2);
	    }
	    arg1.anInt3746 = 0;
	    arg1.anInt3773 = 150;
	    arg1.anInt3754 = 0;
	}
	if (arg2 >= -80)
	    playerUpdateMasks(2, null, -110, -98);
	if ((arg3 & 0x200 ^ 0xffffffff) != -1) {
	    int i = Class54.aPacketStream_1069.method1070(-114);
	    int i_8_ = Class54.aPacketStream_1069.readByteS(128);
	    arg1.method1881(i, Class67_Sub1_Sub9.anInt3952, 98, i_8_);
	}
	if ((0x800 & arg3) != 0) {
	    int i = Class54.aPacketStream_1069.readByteC((byte) -80);
	    int[] is = new int[i];
	    int[] is_9_ = new int[i];
	    int[] is_10_ = new int[i];
	    for (int i_11_ = 0; i > i_11_; i_11_++) {
		int i_12_
		    = Class54.aPacketStream_1069.readLEShort2((byte) -46);
		if (i_12_ == 65535)
		    i_12_ = -1;
		is[i_11_] = i_12_;
		is_10_[i_11_]
		    = Class54.aPacketStream_1069.readByteA((byte) 93);
		is_9_[i_11_]
		    = Class54.aPacketStream_1069.readUShort(-2386);
	    }
	    Class103.method1554((byte) -79, is, is_10_, arg1, is_9_);
	}
	if ((0x100 & arg3) != 0) {	//appendGraphicsUpdate
	    int i = Class54.aPacketStream_1069.readLEShort2((byte) -112);
	    if (i == 65535)
		i = -1;
	    boolean bool = true;
	    int i_13_ = Class54.aPacketStream_1069.readInt2((byte) 91);
	    if ((i ^ 0xffffffff) != 0 && (arg1.anInt3739 ^ 0xffffffff) != 0
		&& (((Class120.method1666
		      (Class67_Sub1.method622(-17177, i).anInt1639, -32)
		      .anInt856)
		     ^ 0xffffffff)
		    > (Class120.method1666((Class67_Sub1.method622
					    (-17177, arg1.anInt3739)
					    .anInt1639),
					   -32).anInt856
		       ^ 0xffffffff)))
		bool = false;
	    if (bool) {
		arg1.anInt3760 = i_13_ >> -832379088;
		arg1.anInt3780 = 1;
		arg1.anInt3701
		    = Class67_Sub1_Sub9.anInt3952 + (0xffff & i_13_);
		arg1.anInt3739 = i;
		arg1.anInt3745 = 0;
		if ((arg1.anInt3701 ^ 0xffffffff)
		    < (Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff))
		    arg1.anInt3745 = -1;
		arg1.anInt3712 = 0;
		if (arg1.anInt3739 != -1
		    && ((Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff)
			== (arg1.anInt3701 ^ 0xffffffff))) {
		    int i_14_ = (Class67_Sub1.method622(-17177, arg1.anInt3739)
				 .anInt1639);
		    if (i_14_ != -1) {
			Class41 class41 = Class120.method1666(i_14_, -32);
			if (class41 != null && class41.anIntArray855 != null)
			    OutputStream_Sub1.method58
				(class41, arg1.anInt3726, -124, arg1.anInt3733,
				 Class122.aClass131_Sub7_Sub2_2309 == arg1, 0);
		    }
		}
	    }
	}
	if ((0x40 & arg3) != 0) {	//appendFaceLocationUpdate
	    arg1.anInt3778 = Class54.aPacketStream_1069.readUShort(-2386);
	    arg1.anInt3738 = Class54.aPacketStream_1069.readLEShortA((byte) -88);
	}
    }
    
    public static void method1716(boolean arg0) {
	if (arg0 != false)
	    method1719(false);
	Class133.aClass136_2456.method1922(0);
	anInt3428++;
    }
    
    public void method1710(int arg0, int arg1, byte arg2) {
	anInt3442++;
	if (arg2 != -67)
	    method1712((byte) -50, -107, -67);
    }
    
    public static Class32 method1717(boolean arg0, int arg1) {
	Class32 class32 = (Class32) Class67_Sub1_Sub25.aClass136_4226
					.method1924((long) arg1, !arg0);
	anInt3435++;
	if (class32 != null)
	    return class32;
	byte[] is = Class73.aClass9_1468.method138(-809612665, arg1, 33);
	class32 = new Class32();
	if (is != null)
	    class32.method287(2, arg1, new Stream(is));
	if (arg0 != true)
	    method1718(-122);
	Class67_Sub1_Sub25.aClass136_4226.method1926((long) arg1, class32,
						     (byte) -71);
	return class32;
    }
    
    public static void method1718(int arg0) {
	if (arg0 <= -106) {
	    anIntArrayArrayArray3443 = null;
	    aClass9_3429 = null;
	}
    }
    
    public static void method1719(boolean arg0) {
	anInt3425++;
	if ((OutputStream_Sub1.method59(0) ^ 0xffffffff) == -3) {
	    byte i = (byte) (Class6.anInt151 + -4 & 0xff);
	    if (arg0 != true)
		aClass9_3429 = null;
	    int i_15_ = Class6.anInt151 % 104;
	    for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -5; i_16_++) {
		for (int i_17_ = 0; i_17_ < 104; i_17_++)
		    ObjectDef.aByteArrayArrayArray3518[i_16_][i_15_][i_17_]
			= i;
	    }
	    if ((Canvas_Sub1.anInt59 ^ 0xffffffff) != -4) {
		for (int i_18_ = 0; i_18_ < 2; i_18_++) {
		    Class67_Sub1_Sub23.anIntArray4180[i_18_] = -1000000;
		    Class67_Sub5_Sub19.anIntArray4823[i_18_] = 1000000;
		    Class67_Sub5_Sub6.anIntArray4545[i_18_] = 0;
		    OutputStream_Sub1.anIntArray93[i_18_] = 1000000;
		    Class67_Sub5_Sub3.anIntArray4490[i_18_] = 0;
		}
		if (Class22.anInt530 != 1) {
		    int i_19_ = Class131_Sub5.method1826(Canvas_Sub1.anInt59,
							 Class114.anInt2160,
							 Class129.anInt2395,
							 (byte) 119);
		    if ((i_19_ - Class86.anInt1760 ^ 0xffffffff) > -801
			&& ((Class120.aByteArrayArrayArray2284
			     [Canvas_Sub1.anInt59]
			     [Class114.anInt2160 >> -1793302777]
			     [Class129.anInt2395 >> 1768328839])
			    & 0x4) != 0)
			Class67_Sub5_Sub5.method865
			    (false, Class129.anInt2395 >> -364631289,
			     (byte) 79, 1,
			     Class76.aClass67_Sub24ArrayArrayArray1578,
			     Class114.anInt2160 >> -1075567225);
		} else {
		    if (((Class120.aByteArrayArrayArray2284
			  [Canvas_Sub1.anInt59]
			  [(Class122.aClass131_Sub7_Sub2_2309.anInt3733
			    >> -637222681)]
			  [(Class122.aClass131_Sub7_Sub2_2309.anInt3726
			    >> 1028976327)])
			 & 0x4)
			!= 0)
			Class67_Sub5_Sub5.method865
			    (false,
			     (Class122.aClass131_Sub7_Sub2_2309.anInt3726
			      >> 708440903),
			     (byte) 79, 0,
			     Class76.aClass67_Sub24ArrayArrayArray1578,
			     (Class122.aClass131_Sub7_Sub2_2309.anInt3733
			      >> 1337103847));
		    if (Class67_Sub1_Sub2.anInt3839 < 310) {
			int i_20_ = Class114.anInt2160 >> -1402132729;
			int i_21_ = Class129.anInt2395 >> -1891335929;
			int i_22_
			    = (Class122.aClass131_Sub7_Sub2_2309.anInt3733
			       >> -474946937);
			int i_23_
			    = (Class122.aClass131_Sub7_Sub2_2309.anInt3726
			       >> -1794548345);
			int i_24_;
			if ((i_22_ ^ 0xffffffff) >= (i_20_ ^ 0xffffffff))
			    i_24_ = i_20_ + -i_22_;
			else
			    i_24_ = -i_20_ + i_22_;
			int i_25_;
			if (i_23_ <= i_21_)
			    i_25_ = -i_23_ + i_21_;
			else
			    i_25_ = i_23_ + -i_21_;
			if (i_24_ <= i_25_) {
			    int i_26_ = 65536 * i_24_ / i_25_;
			    int i_27_ = 32768;
			    while ((i_21_ ^ 0xffffffff)
				   != (i_23_ ^ 0xffffffff)) {
				if ((i_23_ ^ 0xffffffff)
				    < (i_21_ ^ 0xffffffff))
				    i_21_++;
				else if ((i_21_ ^ 0xffffffff)
					 < (i_23_ ^ 0xffffffff))
				    i_21_--;
				if (((Class120.aByteArrayArrayArray2284
				      [Canvas_Sub1.anInt59][i_20_][i_21_])
				     & 0x4)
				    != 0) {
				    Class67_Sub5_Sub5.method865
					(false, i_21_, (byte) 79, 1,
					 (Class76
					  .aClass67_Sub24ArrayArrayArray1578),
					 i_20_);
				    break;
				}
				i_27_ += i_26_;
				if (i_27_ >= 65536) {
				    i_27_ -= 65536;
				    if ((i_22_ ^ 0xffffffff)
					< (i_20_ ^ 0xffffffff))
					i_20_++;
				    else if ((i_20_ ^ 0xffffffff)
					     < (i_22_ ^ 0xffffffff))
					i_20_--;
				    if ((((Class120.aByteArrayArrayArray2284
					   [Canvas_Sub1.anInt59][i_20_][i_21_])
					  & 0x4)
					 ^ 0xffffffff)
					!= -1) {
					Class67_Sub5_Sub5.method865
					    (false, i_21_, (byte) 79, 1,
					     (Class76
					      .aClass67_Sub24ArrayArrayArray1578),
					     i_20_);
					break;
				    }
				}
			    }
			} else {
			    int i_28_ = i_25_ * 65536 / i_24_;
			    int i_29_ = 32768;
			    while ((i_22_ ^ 0xffffffff)
				   != (i_20_ ^ 0xffffffff)) {
				if (i_20_ >= i_22_) {
				    if ((i_20_ ^ 0xffffffff)
					< (i_22_ ^ 0xffffffff))
					i_20_--;
				} else
				    i_20_++;
				if ((((Class120.aByteArrayArrayArray2284
				       [Canvas_Sub1.anInt59][i_20_][i_21_])
				      & 0x4)
				     ^ 0xffffffff)
				    != -1) {
				    Class67_Sub5_Sub5.method865
					(false, i_21_, (byte) 79, 1,
					 (Class76
					  .aClass67_Sub24ArrayArrayArray1578),
					 i_20_);
				    break;
				}
				i_29_ += i_28_;
				if (i_29_ >= 65536) {
				    if (i_21_ >= i_23_) {
					if (i_23_ < i_21_)
					    i_21_--;
				    } else
					i_21_++;
				    i_29_ -= 65536;
				    if ((0x4
					 & (Class120.aByteArrayArrayArray2284
					    [Canvas_Sub1.anInt59][i_20_]
					    [i_21_]))
					!= 0) {
					Class67_Sub5_Sub5.method865
					    (false, i_21_, (byte) 79, 1,
					     (Class76
					      .aClass67_Sub24ArrayArrayArray1578),
					     i_20_);
					break;
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method1712(byte arg0, int arg1, int arg2) {
	if (arg0 <= -39) {
	    anInt3436++;
	    int i = arg2 * anInt3431 >> -907825364;
	    int i_30_ = anInt3433 * arg1 >> 676129612;
	    int i_31_ = arg2 * anInt3432 >> -1535359860;
	    int i_32_ = arg1 * anInt3427 >> -447120276;
	    int i_33_ = anInt3434 * arg2 >> 1022779724;
	    int i_34_ = arg1 * anInt3426 >> -302061556;
	    int i_35_ = anInt3430 * arg1 >> -865295924;
	    int i_36_ = anInt3441 * arg2 >> -644635924;
	    Class119.method1643(i_31_, i_30_, i_34_, anInt2351, i_36_, i_33_,
				i_35_, i, (byte) 123, i_32_);
	}
    }
    
    public Class126_Sub2(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8, int arg9) {
	super(-1, arg8, arg9);
	anInt3430 = arg2;
	anInt3441 = arg7;
	anInt3433 = arg0;
	anInt3426 = arg6;
	anInt3432 = arg3;
	anInt3431 = arg1;
	anInt3427 = arg4;
	anInt3434 = arg5;
    }
}
