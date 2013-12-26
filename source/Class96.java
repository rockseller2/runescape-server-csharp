/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96
{
    public static int anInt1912;
    public static RSString aRSString_1913;
    public static int[] anIntArray1914 = new int[2500];
    public static Class95[] aClass95Array1915;
    public static int anInt1916;
    public static int anInt1917;
    public static int anInt1918;
    public static int anInt1919;
    public static Class70_Sub1[] aClass70_Sub1Array1920;
    public static int anInt1921;
    public static int anInt1922;
    public static int anInt1923;
    public static boolean aBoolean1924 = false;
    
    public static void method1502(int arg0) {
	aRSString_1913 = null;
	aClass70_Sub1Array1920 = null;
	aClass95Array1915 = null;
	anIntArray1914 = null;
	if (arg0 != 0)
	    method1505(45, 24L);
    }
    
    public static void method1503(int arg0, byte arg1, int arg2, int arg3,
				  int arg4) {
	Class121.method1685(arg0, arg2, arg0 - -arg4, arg2 + arg3);
	Class121.method1683(arg0, arg2, arg4, arg3, 0);
	anInt1922++;
	if ((Class115.anInt2185 ^ 0xffffffff) <= -101) {
	    if (Class67_Sub5_Sub6.aClass67_Sub5_Sub19_4546 == null
		|| ((arg4 ^ 0xffffffff)
		    != (Class67_Sub5_Sub6.aClass67_Sub5_Sub19_4546.anInt4813
			^ 0xffffffff))
		|| (arg3
		    != Class67_Sub5_Sub6.aClass67_Sub5_Sub19_4546.anInt4812)) {
		Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1
		    = new Class67_Sub5_Sub19_Sub1(arg4, arg3);
		Class121.method1684(class67_sub5_sub19_sub1.anIntArray5149,
				    arg4, arg3);
		Class67.method607(arg4, 0, Class67_Sub1_Sub13.anInt4031, arg3,
				  Class131_Sub5.anInt3656, 0, 0, 0,
				  (byte) -70);
		Class67_Sub5_Sub6.aClass67_Sub5_Sub19_4546
		    = class67_sub5_sub19_sub1;
		PacketParser.aClass99_2119.method1524(arg1 + -20);
	    }
	    Class67_Sub5_Sub6.aClass67_Sub5_Sub19_4546.method1003(arg0, arg2);
	    int i = Class22.anInt548 * arg3 / Class131_Sub5.anInt3656 + arg2;
	    if (arg1 == 20) {
		int i_0_
		    = arg4 * Class134.anInt2467 / Class67_Sub1_Sub13.anInt4031;
		int i_1_ = arg0 - -(arg4 * Class109.anInt2091
				    / Class67_Sub1_Sub13.anInt4031);
		int i_2_ = arg3 * Class132.anInt2437 / Class131_Sub5.anInt3656;
		int i_3_ = 16711680;
		if (Class69.anInt1381 == 1)
		    i_3_ = 16777215;
		Class121.method1686(i_1_, i, i_0_, i_2_, i_3_, 128);
		Class121.method1681(i_1_, i, i_0_, i_2_, i_3_);
		if ((Class67_Sub1_Sub9.anInt3960 ^ 0xffffffff) < -1) {
		    int i_4_;
		    if (Class54.anInt1081 > 10)
			i_4_ = -(25 * Class54.anInt1081) + 500;
		    else
			i_4_ = Class54.anInt1081 * 25;
		    for (Class67_Sub17 class67_sub17
			     = ((Class67_Sub17)
				Class67_Sub25.aClass50_3251.method445(0));
			 class67_sub17 != null;
			 class67_sub17
			     = ((Class67_Sub17)
				Class67_Sub25.aClass50_3251.method432(0))) {
			if ((Class62.anInt1159 ^ 0xffffffff)
			    == (class67_sub17.anInt3096 ^ 0xffffffff)) {
			    int i_5_ = arg0 + (arg4 * class67_sub17.anInt3108
					       / Class67_Sub1_Sub13.anInt4031);
			    int i_6_ = arg2 - -(class67_sub17.anInt3103 * arg3
						/ Class131_Sub5.anInt3656);
			    Class121.method1686(-2 + i_5_, i_6_ + -2, 4, 4,
						16776960, i_4_);
			}
		    }
		}
	    }
	}
    }
    
    public static Class67_Sub5_Sub19[] method1504(byte arg0) {
	anInt1921++;
	Class67_Sub5_Sub19[] class67_sub5_sub19s
	    = new Class67_Sub5_Sub19[Class67_Sub15.anInt3067];
	if (arg0 != -62)
	    return null;
	for (int i = 0;
	     (Class67_Sub15.anInt3067 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    int i_7_ = (Class67_Sub5_Sub4.anIntArray4510[i]
			* Class55_Sub3.anIntArray2810[i]);
	    byte[] is = Class67_Sub1_Sub35.aByteArrayArray4357[i];
	    int[] is_8_ = new int[i_7_];
	    for (int i_9_ = 0; i_7_ > i_9_; i_9_++)
		is_8_[i_9_]
		    = Class73.anIntArray1462[Class75.method1379(255,
								is[i_9_])];
	    class67_sub5_sub19s[i]
		= new Class67_Sub5_Sub19_Sub1(Class3.anInt119,
					      Class80.anInt1628,
					      Class67_Sub23.anIntArray3201[i],
					      Class67_Sub6.anIntArray2870[i],
					      Class55_Sub3.anIntArray2810[i],
					      (Class67_Sub5_Sub4.anIntArray4510
					       [i]),
					      is_8_);
	}
	Class67_Sub5_Sub11.method937(false);
	return class67_sub5_sub19s;
    }
    
    public static void method1505(int arg0, long arg1) {
	try {
	    anInt1919++;
	    if ((arg1 ^ 0xffffffffffffffffL) != -1L && arg0 <= -89) {
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (Class67_Sub5_Sub17.anInt4795 ^ 0xffffffff));
		     i++) {
		    if ((Class66.aLongArray1330[i] ^ 0xffffffffffffffffL)
			== (arg1 ^ 0xffffffffffffffffL)) {
			Class18.anInt2729++;
			Class67_Sub5_Sub17.anInt4795--;
			for (int i_10_ = i;
			     i_10_ < Class67_Sub5_Sub17.anInt4795; i_10_++) {
			    Class99_Sub1.aRSStringArray3384[i_10_]
				= Class99_Sub1.aRSStringArray3384[1 + i_10_];
			    Class67.anIntArray1335[i_10_]
				= Class67.anIntArray1335[1 + i_10_];
			    Class67_Sub1_Sub16_Sub1.aRSStringArray5092[i_10_]
				= (Class67_Sub1_Sub16_Sub1.aRSStringArray5092
				   [1 + i_10_]);
			    Class66.aLongArray1330[i_10_]
				= Class66.aLongArray1330[i_10_ - -1];
			    OutputStream_Sub1.anIntArray88[i_10_]
				= OutputStream_Sub1.anIntArray88[1 + i_10_];
			    Class67_Sub5_Sub9.aBooleanArray4609[i_10_]
				= (Class67_Sub5_Sub9.aBooleanArray4609
				   [i_10_ - -1]);
			}
			Class128.anInt2376 = Class11.anInt409;
			Class70_Sub1.outStream.createFrame(2, 57);	//DELETE_FRIEND
			Class70_Sub1.outStream.writeLong(2, arg1);
			break;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("oc.G(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1506(byte arg0, Stream arg1) {
	int i = -43 % ((arg0 - 45) / 62);
	anInt1923++;
	while (arg1.buffer.length > arg1.currentOffset) {
	    boolean bool = false;
	    int i_11_ = 0;
	    int i_12_ = 0;
	    if ((arg1.readByte((byte) 78) ^ 0xffffffff) == -2) {
		i_12_ = arg1.readByte((byte) 94);
		bool = true;
		i_11_ = arg1.readByte((byte) -67);
	    }
	    int i_13_ = arg1.readByte((byte) -112);
	    int i_14_ = arg1.readByte((byte) 90);
	    int i_15_ = 64 * i_13_ + -Class100.anInt1968;
	    int i_16_ = -(i_14_ * 64) + (Class67_Sub1_Sub21.anInt4159
					 + Class131_Sub5.anInt3656 - 1);
	    if (i_15_ < 0 || i_16_ + -63 < 0
		|| (i_15_ + 63 ^ 0xffffffff) <= (Class67_Sub1_Sub13.anInt4031
						 ^ 0xffffffff)
		|| (Class131_Sub5.anInt3656 ^ 0xffffffff) >= (i_16_
							      ^ 0xffffffff)) {
		for (int i_17_ = 0; i_17_ < (bool ? 64 : 4096); i_17_++) {
		    byte i_18_ = arg1.readByte2((byte) 1);
		    if ((i_18_ ^ 0xffffffff) != -1)
			arg1.currentOffset++;
		}
	    } else {
		int i_19_ = i_15_ >> 344240966;
		int i_20_ = i_16_ >> 1609622822;
		for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -65; i_21_++) {
		    for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -65; i_22_++) {
			if (!bool
			    || (i_12_ * 8 <= i_21_ && i_21_ < 8 + 8 * i_12_
				&& (i_22_ ^ 0xffffffff) <= (i_11_ * 8
							    ^ 0xffffffff)
				&& i_11_ * 8 - -8 > i_22_)) {
			    byte i_23_ = arg1.readByte2((byte) 1);
			    if (i_23_ != 0) {
				if ((Class53.aByteArrayArrayArray1062[i_19_]
				     [i_20_])
				    == null)
				    Class53.aByteArrayArrayArray1062[i_19_]
					[i_20_]
					= new byte[4096];
				Class53.aByteArrayArrayArray1062[i_19_]
				    [i_20_]
				    [(-i_22_ + 63 << -1463396570) - -i_21_]
				    = i_23_;
				byte i_24_ = arg1.readByte2((byte) 1);
				if ((Class49.aByteArrayArrayArray1005[i_19_]
				     [i_20_])
				    == null)
				    Class49.aByteArrayArrayArray1005[i_19_]
					[i_20_]
					= new byte[4096];
				Class49.aByteArrayArrayArray1005[i_19_]
				    [i_20_]
				    [(-i_22_ + 63 << -649014074) - -i_21_]
				    = i_24_;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method1507(int arg0) {
	while ((Class54.aPacketStream_1069
		    .method1104(Class67_Sub5_Sub1.lastPacketSize, 113)
		^ 0xffffffff)
	       <= -28) {
	    int i = Class54.aPacketStream_1069.readBits((byte) 9, 15); //npc Index
	    if ((i ^ 0xffffffff) == -32768)
		break;
	    boolean bool = false;
	    if (Class128.aClass131_Sub7_Sub1Array2386[i] == null) {
		bool = true;
		Class128.aClass131_Sub7_Sub1Array2386[i] = new Class131_Sub7_Sub1(); 				//new Npc();
	    }
	    Class131_Sub7_Sub1 class131_sub7_sub1
		= Class128.aClass131_Sub7_Sub1Array2386[i];
	    Class47.anIntArray965[Class37.anInt794++] = i;		//npcIndices [ npcCount ++] = i
	    class131_sub7_sub1.anInt3789 = Class67_Sub1_Sub9.anInt3952;
	    if (class131_sub7_sub1.aClass64_5047 != null
		&& class131_sub7_sub1.aClass64_5047.method576((byte) 34))
		Class118.method1638(-121, class131_sub7_sub1);
	    int i_25_
		= Class54.aPacketStream_1069.readBits((byte) 9, 1);
	    int i_26_
		= (Class118.anIntArray2235
		   [Class54.aPacketStream_1069.readBits((byte) 9, 3)]);
	    if (bool)
		class131_sub7_sub1.anInt3721 = class131_sub7_sub1.anInt3740
		    = i_26_;
	    int i_27_
		= Class54.aPacketStream_1069.readBits((byte) 9, 1);
	    if ((i_27_ ^ 0xffffffff) == -2)
		Class61.anIntArray1142[Class126_Sub2.anInt3439++] = i;
	    int i_28_
		= Class54.aPacketStream_1069.readBits((byte) 9, 5);
	    class131_sub7_sub1.method1891((byte) -51, Class133.method1908(Class54.aPacketStream_1069.readBits((byte) 9, 14),  arg0 ^ 0x4a6f));		//EntityDefintions.forId(readBits(14);	

	    int i_29_
		= Class54.aPacketStream_1069.readBits((byte) 9, 5);
	    if (i_28_ > 15)
		i_28_ -= 32;
	    if ((i_29_ ^ 0xffffffff) < -16)
		i_29_ -= 32;
	    class131_sub7_sub1
		.method1883(0, class131_sub7_sub1.aClass64_5047.anInt1211);
	    class131_sub7_sub1.anInt3691
		= class131_sub7_sub1.aClass64_5047.anInt1191;
	    class131_sub7_sub1.playerAnims
		= class131_sub7_sub1.aClass64_5047.anInt1189;
	    if ((class131_sub7_sub1.anInt3691 ^ 0xffffffff) == -1)
		class131_sub7_sub1.anInt3740 = 0;
	    class131_sub7_sub1.method1877
		(class131_sub7_sub1.method1887((byte) -77),
		 i_28_ + Class122.aClass131_Sub7_Sub2_2309.smallY[0],
		 (byte) 4,
		 Class122.aClass131_Sub7_Sub2_2309.smallX[0] - -i_29_,
		 (i_25_ ^ 0xffffffff) == -2);
	    if (class131_sub7_sub1.aClass64_5047.method576((byte) 48))
		Class24.method221(class131_sub7_sub1.smallY[0], null,
				  128, Canvas_Sub1.anInt59, null,
				  class131_sub7_sub1.smallX[0],
				  class131_sub7_sub1, 0);
	}
	Class54.aPacketStream_1069.finishBitAcess(0);
	if (arg0 != -18961)
	    anIntArray1914 = null;
	anInt1912++;
    }
    
    static {
	aRSString_1913 = Class134.method1914(")4j", (byte) 8);
    }
}
