public abstract class Class140
{
    public static RSString aRSString_2543
	= Class134.method1914("Loading)3)3)3", (byte) 21);
    public static volatile boolean aBoolean2544;
    public static int anInt2545;
    public static int anInt2546;
    public static PacketStream aPacketStream_2547;
    public static RSString aRSString_2548 = aRSString_2543;
    public static int anInt2549 = 0;
    public static int anInt2550;
    public static Class9 aClass9_2551;
    public static int anInt2552;
    public static RSString aRSString_2553;
    
    public static void method1942(int arg0) {
	for (int i = 0; Class126_Sub2.anInt3439 > i; i++) {
	    int i_0_ = Class61.anIntArray1142[i];
	    Class131_Sub7_Sub1 class131_sub7_sub1
		= Class128.aClass131_Sub7_Sub1Array2386[i_0_];
	    int i_1_ = Class54.aPacketStream_1069.readByte((byte) 98);
	    if ((i_1_ & 0x8 ^ 0xffffffff) != -1)
		i_1_ += (Class54.aPacketStream_1069.readByte((byte) -19)
			 << -1666777848);
	    if ((0x40 & i_1_) != 0) {
		int i_2_
		    = Class54.aPacketStream_1069.readByte((byte) -85);
		int i_3_
		    = Class54.aPacketStream_1069.readByteC((byte) -80);
		class131_sub7_sub1
		    .method1881(i_2_, Class67_Sub1_Sub9.anInt3952, 26, i_3_);
		class131_sub7_sub1.anInt3695
		    = 300 + Class67_Sub1_Sub9.anInt3952;
		class131_sub7_sub1.anInt3761
		    = Class54.aPacketStream_1069.readByteS(128);
	    }
	    if ((0x2 & i_1_) != 0) {
		int i_4_
		    = Class54.aPacketStream_1069.readByteC((byte) -80);
		int i_5_ = Class54.aPacketStream_1069.readByteS(128);
		class131_sub7_sub1
		    .method1881(i_4_, Class67_Sub1_Sub9.anInt3952, 68, i_5_);
	    }
	    if ((i_1_ & 0x10 ^ 0xffffffff) != -1) {
		int i_6_ = Class54.aPacketStream_1069.readUShort(-2386);
		if (i_6_ == 65535)
		    i_6_ = -1;
		int i_7_
		    = Class54.aPacketStream_1069.readByte((byte) -127);
		Class67_Sub5_Sub9.method900(i_7_, i_6_, (byte) -66,
					    class131_sub7_sub1);
	    }
	    if ((i_1_ & 0x4 ^ 0xffffffff) != -1) {
		class131_sub7_sub1.anInt3785
		    = Class54.aPacketStream_1069.readShortA((byte) 22);
		if ((class131_sub7_sub1.anInt3785 ^ 0xffffffff) == -65536)
		    class131_sub7_sub1.anInt3785 = -1;
	    }
	    if ((i_1_ & 0x80) != 0) {
		boolean bool = true;
		int i_8_
		    = Class54.aPacketStream_1069.readShortA((byte) 22);
		int i_9_ = Class54.aPacketStream_1069.readLEInt(4);
		if ((i_8_ ^ 0xffffffff) == -65536)
		    i_8_ = -1;
		if ((i_8_ ^ 0xffffffff) != 0
		    && (class131_sub7_sub1.anInt3739 ^ 0xffffffff) != 0
		    && ((Class120.method1666
			 (Class67_Sub1.method622(-17177, i_8_).anInt1639, -32)
			 .anInt856)
			< (Class120.method1666
			   ((Class67_Sub1.method622
			     (-17177, class131_sub7_sub1.anInt3739).anInt1639),
			    -32)
			   .anInt856)))
		    bool = false;
		if (bool) {
		    class131_sub7_sub1.anInt3739 = i_8_;
		    class131_sub7_sub1.anInt3745 = 0;
		    class131_sub7_sub1.anInt3712 = 0;
		    class131_sub7_sub1.anInt3780 = 1;
		    class131_sub7_sub1.anInt3701
			= Class67_Sub1_Sub9.anInt3952 - -(i_9_ & 0xffff);
		    class131_sub7_sub1.anInt3760 = i_9_ >> 2071455568;
		    if ((class131_sub7_sub1.anInt3701 ^ 0xffffffff)
			< (Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff))
			class131_sub7_sub1.anInt3745 = -1;
		    if (class131_sub7_sub1.anInt3739 != -1
			&& ((Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff)
			    == (class131_sub7_sub1.anInt3701 ^ 0xffffffff))) {
			int i_10_ = (Class67_Sub1.method622
				     (-17177, class131_sub7_sub1.anInt3739)
				     .anInt1639);
			if (i_10_ != -1) {
			    Class41 class41 = Class120.method1666(i_10_, -32);
			    if (class41 != null
				&& class41.anIntArray855 != null)
				OutputStream_Sub1.method58
				    (class41, class131_sub7_sub1.anInt3726,
				     -110, class131_sub7_sub1.anInt3733, false,
				     0);
			}
		    }
		}
	    }
	    if ((0x1 & i_1_) != 0) {
		if (class131_sub7_sub1.aClass64_5047.method576((byte) 31))
		    Class118.method1638(58, class131_sub7_sub1);
		class131_sub7_sub1.method1891
		    ((byte) -51,
		     Class133.method1908(Class54.aPacketStream_1069
					     .readLEShort2((byte) -111),
					 -128));
		class131_sub7_sub1
		    .method1883(0, class131_sub7_sub1.aClass64_5047.anInt1211);
		class131_sub7_sub1.playerAnims
		    = class131_sub7_sub1.aClass64_5047.anInt1189;
		if (class131_sub7_sub1.aClass64_5047.method576((byte) 26))
		    Class24.method221(class131_sub7_sub1.smallY[0],
				      null, 128, Canvas_Sub1.anInt59, null,
				      class131_sub7_sub1.smallX[0],
				      class131_sub7_sub1, 0);
	    }
	    if ((0x20 & i_1_ ^ 0xffffffff) != -1) {
		class131_sub7_sub1.aRSString_3723
		    = Class54.aPacketStream_1069.readRSString(-1);
		class131_sub7_sub1.anInt3773 = 100;
	    }
	    if ((i_1_ & 0x100) != 0) {
		int i_11_
		    = Class54.aPacketStream_1069.readByteC((byte) -80);
		int[] is = new int[i_11_];
		int[] is_12_ = new int[i_11_];
		int[] is_13_ = new int[i_11_];
		for (int i_14_ = 0;
		     (i_11_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
		    int i_15_ = Class54.aPacketStream_1069
				    .readLEShort2((byte) -91);
		    if (i_15_ == 65535)
			i_15_ = -1;
		    is[i_14_] = i_15_;
		    is_12_[i_14_]
			= Class54.aPacketStream_1069.readByteS(128);
		    is_13_[i_14_]
			= Class54.aPacketStream_1069.readUShort(-2386);
		}
		Class67_Sub10.method1114(class131_sub7_sub1, is_12_, 0, is_13_,
					 is);
	    }
	    if ((i_1_ & 0x200 ^ 0xffffffff) != -1) {
		class131_sub7_sub1.anInt3778
		    = Class54.aPacketStream_1069.readShortA((byte) 22);
		class131_sub7_sub1.anInt3738
		    = Class54.aPacketStream_1069.readUShort(-2386);
	    }
	}
	anInt2550++;
	if (arg0 >= -122)
	    aPacketStream_2547 = null;
    }
    
    public static void method1943(byte arg0) {
	Class57.aClass136_1108.method1922(0);
	anInt2545++;
	Class67_Sub5_Sub11.aClass136_4669.method1922(0);
	int i = -42 % ((-54 - arg0) / 49);
    }
    
    public static int method1944(int arg0, int arg1) {
	anInt2552++;
	if ((arg0 ^ 0xffffffff) > -1)
	    return 0;
	Class67_Sub8 class67_sub8
	    = ((Class67_Sub8)
	       Class86.aClass92_1755.method1489((byte) -26, (long) arg0));
	if (class67_sub8 == null)
	    return Class85.method1454((byte) 69, arg0).anInt4738;
	int i = 0;
	int i_16_ = 0;
	if (arg1 >= -43)
	    method1943((byte) -100);
	for (/**/; i_16_ < class67_sub8.anIntArray2965.length; i_16_++) {
	    if ((class67_sub8.anIntArray2965[i_16_] ^ 0xffffffff) == 0)
		i++;
	}
	i += (Class85.method1454((byte) 69, arg0).anInt4738
	      - class67_sub8.anIntArray2965.length);
	return i;
    }
    
    public static void method1945(boolean arg0) {
	if (arg0) {
	    Class76.aClass67_Sub24ArrayArrayArray1578
		= Class67_Sub1_Sub34.aClass67_Sub24ArrayArrayArray4334;
	    Class136.anIntArrayArrayArray2496
		= Class67_Sub1_Sub17.anIntArrayArrayArray4096;
	} else {
	    Class76.aClass67_Sub24ArrayArrayArray1578
		= Class126_Sub3.aClass67_Sub24ArrayArrayArray3453;
	    Class136.anIntArrayArrayArray2496
		= InputStream_Sub1.anIntArrayArrayArray75;
	}
	Class67_Sub1_Sub13.anInt4024
	    = Class76.aClass67_Sub24ArrayArrayArray1578.length;
    }
    
    public static void method1946(byte arg0) {
	aClass9_2551 = null;
	aRSString_2543 = null;
	aPacketStream_2547 = null;
	aRSString_2548 = null;
	aRSString_2553 = null;
	if (arg0 != -127)
	    method1946((byte) -45);
    }
    
    static {
	aBoolean2544 = false;
	aRSString_2553 = Class134.method1914("Monde de jeu cr-B-B", (byte) 31);
	aPacketStream_2547 = new PacketStream(5000);
    }
}
