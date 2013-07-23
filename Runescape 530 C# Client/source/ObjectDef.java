/* ObjectDef - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjectDef extends Class131
{
    public static int anInt3517;
    public static byte[][][] aByteArrayArrayArray3518;
    public static RSString aRSString_3519 = Class134.method1914("M", (byte) 60);
    public int anInt3520;
    public int anInt3521;
    public static RSString aRSString_3522
	= Class134.method1914("cookiehost", (byte) 46);
    public int anInt3523;
    public int anInt3524;
    public static int anInt3525;
    public int anInt3526 = -32768;
    public int anInt3527;
    public int anInt3528;
    public int anInt3529 = 0;
    public Class61_Sub1 aClass61_Sub1_3530;
    public boolean aBoolean3531;
    public int anInt3532;
    public Class41 aClass41_3533;
    public static int anInt3534;
    public static int anInt3535;
    public int anInt3536;
    public static int anInt3537;
    public static int anInt3538;
    
    public void method1771(int arg0, int arg1, int arg2, int arg3, int arg4) {
	anInt3535++;
    }
    
    public static void method1772(boolean arg0, boolean arg1) {
	Class67_Sub5_Sub15.aBoolean4754 = arg1;
	if (Class67_Sub5_Sub15.aBoolean4754) { //fightCaveMapData
	    int i = Class54.aPacketStream_1069.readLEShortA((byte) -88);	//getLocalX
	    int i_0_ = Class54.aPacketStream_1069.readLEShortA((byte) -88);	//getRegionX
	    int i_1_ = Class54.aPacketStream_1069.readByteS(128);			//getZ
	    int i_2_ = Class54.aPacketStream_1069.readLEShortA((byte) -88);	//getLocalY
	    Class54.aPacketStream_1069.initBitAccess(111);
	    for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -5; i_3_++) {
		for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -14; i_4_++) {
		    for (int i_5_ = 0; i_5_ < 13; i_5_++) {
			int i_6_ = Class54.aPacketStream_1069
				       .readBits((byte) 9, 1);
			if (i_6_ != 1)
			    Class5.anIntArrayArrayArray136[i_3_][i_4_][i_5_]
				= -1;
			else
			    Class5.anIntArrayArrayArray136[i_3_][i_4_][i_5_]
				= Class54.aPacketStream_1069
				      .readBits((byte) 9, 26);
		    }
		}
	    }
	    Class54.aPacketStream_1069.finishBitAcess(0);
	    int i_7_ = ((Class67_Sub5_Sub1.lastPacketSize
			 + -Class54.aPacketStream_1069.currentOffset)
			/ 16);
	    Class68.anIntArrayArray1372 = new int[i_7_][4];
	    for (int i_8_ = 0; i_7_ > i_8_; i_8_++) {
		for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5; i_9_++)
		    Class68.anIntArrayArray1372[i_8_][i_9_]
			= Class54.aPacketStream_1069
			      .readInt2((byte) 77);	//mapData x 4 times.
	    }
	    int i_10_ = Class54.aPacketStream_1069.readUShort(-2386);	//getRegionY
	    Applet_Sub1.anIntArray35 = new int[i_7_];
	    Class75.aByteArrayArray2704 = null;
	    Class108.anIntArray2083 = new int[i_7_];
	    Class67_Sub5_Sub11.aByteArrayArray4675 = new byte[i_7_][];
	    Class67_Sub5_Sub4_Sub1.anIntArray5114 = new int[i_7_];
	    Class4.anIntArray124 = null;
	    Class67_Sub1_Sub9.anIntArray3958 = new int[i_7_];
	    Class67_Sub1_Sub18.anIntArray4116 = new int[i_7_];
	    Class67_Sub16.aByteArrayArray3087 = new byte[i_7_][];
	    i_7_ = 0;
	    for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -5; i_11_++) {
		for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -14; i_12_++) {
		    for (int i_13_ = 0; i_13_ < 13; i_13_++) {
			int i_14_ = (Class5.anIntArrayArrayArray136[i_11_]
				     [i_12_][i_13_]);
			if ((i_14_ ^ 0xffffffff) != 0) {
			    int i_15_ = (i_14_ & 0xffcca8) >> -120655634;
			    int i_16_ = (i_14_ & 0x3ffe) >> 475678883;
			    int i_17_ = i_16_ / 8 + (i_15_ / 8 << 1828405800);
			    for (int i_18_ = 0;
				 (i_18_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff);
				 i_18_++) {
				if (i_17_ == Class108.anIntArray2083[i_18_]) {
				    i_17_ = -1;
				    break;
				}
			    }
			    if ((i_17_ ^ 0xffffffff) != 0) {
				Class108.anIntArray2083[i_7_] = i_17_;
				int i_19_ = (0xffdf & i_17_) >> 1898845864;
				int i_20_ = 0xff & i_17_;
				Class67_Sub5_Sub4_Sub1.anIntArray5114[i_7_]
				    = (Class111.aClass9_2097.method126
				       ((byte) 12,
					(Class67_Sub1_Sub27.method744
					 ((new RSString[]
					   { Canvas_Sub1.aRSString_61,
					     InputStream_Sub1.method47(i_19_,
								       true),
					     (Class67_Sub5_Sub4_Sub2
					      .aRSString_5123),
					     InputStream_Sub1
						 .method47(i_20_, arg0) }),
					  -109))));
				Class67_Sub1_Sub9.anIntArray3958[i_7_]
				    = (Class111.aClass9_2097.method126
				       ((byte) -121,
					(Class67_Sub1_Sub27.method744
					 ((new RSString[]
					   { Class57.aRSString_1109,
					     InputStream_Sub1.method47(i_19_,
								       true),
					     (Class67_Sub5_Sub4_Sub2
					      .aRSString_5123),
					     InputStream_Sub1
						 .method47(i_20_, arg0) }),
					  -98))));
				Class67_Sub1_Sub18.anIntArray4116[i_7_]
				    = (Class111.aClass9_2097.method126
				       ((byte) -122,
					(Class67_Sub1_Sub27.method744
					 ((new RSString[]
					   { RSString.aRSString_2663,
					     InputStream_Sub1.method47(i_19_,
								       arg0),
					     (Class67_Sub5_Sub4_Sub2
					      .aRSString_5123),
					     InputStream_Sub1
						 .method47(i_20_, true) }),
					  -95))));
				Applet_Sub1.anIntArray35[i_7_]
				    = (Class111.aClass9_2097.method126
				       ((byte) 86,
					(Class67_Sub1_Sub27.method744
					 ((new RSString[]
					   { Class67_Sub5.aRSString_2864,
					     InputStream_Sub1.method47(i_19_,
								       true),
					     (Class67_Sub5_Sub4_Sub2
					      .aRSString_5123),
					     InputStream_Sub1
						 .method47(i_20_, true) }),
					  -128))));
				i_7_++;
			    }
			}
		    }
		}
	    }
	    Class15.method168(i_1_, i_10_, i, 0, i_0_, i_2_, false);
	} else {
	    int i = Class54.aPacketStream_1069.readShortA((byte) 22); //getLocalX()
	    int i_21_ = ((-Class54.aPacketStream_1069.currentOffset
			  + Class67_Sub5_Sub1.lastPacketSize)
			 / 16);
	    Class68.anIntArrayArray1372 = new int[i_21_][4];
	    for (int i_22_ = 0; i_21_ > i_22_; i_22_++) {
		for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -5; i_23_++)
		    Class68.anIntArrayArray1372[i_22_][i_23_]
			= Class54.aPacketStream_1069
			      .readInt2((byte) 86); //mapData readInt2 x 4 times
	    }
	    int i_24_ = Class54.aPacketStream_1069.readByteS(128); //region Height / getZ()
	    int i_25_ = Class54.aPacketStream_1069.readUShort(-2386); //getRegionX()
	    int i_26_ = Class54.aPacketStream_1069.readShortA((byte) 22); //getRegionY
	    int i_27_ = Class54.aPacketStream_1069.readShortA((byte) 22); //getLocalY
	    Class67_Sub5_Sub4_Sub1.anIntArray5114 = new int[i_21_];
	    Class67_Sub1_Sub9.anIntArray3958 = new int[i_21_];
	    Class75.aByteArrayArray2704 = null;
	    Class67_Sub5_Sub11.aByteArrayArray4675 = new byte[i_21_][];
	    Class67_Sub1_Sub18.anIntArray4116 = new int[i_21_];
	    Class67_Sub16.aByteArrayArray3087 = new byte[i_21_][];
	    Class4.anIntArray124 = null;
	    boolean bool = false;
	    Applet_Sub1.anIntArray35 = new int[i_21_];
	    Class108.anIntArray2083 = new int[i_21_];
	    if (((i_25_ / 8 ^ 0xffffffff) == -49 || i_25_ / 8 == 49)
		&& i_26_ / 8 == 48)
		bool = true;
	    i_21_ = 0;
	    if (i_25_ / 8 == 48 && (i_26_ / 8 ^ 0xffffffff) == -149)
		bool = true;
	    for (int i_28_ = (i_25_ + -6) / 8; i_28_ <= (i_25_ + 6) / 8;
		 i_28_++) {
		for (int i_29_ = (i_26_ - 6) / 8;
		     ((i_26_ + 6) / 8 ^ 0xffffffff) <= (i_29_ ^ 0xffffffff);
		     i_29_++) {
		    int i_30_ = i_29_ + (i_28_ << -1994948696);
		    if (bool
			&& ((i_29_ ^ 0xffffffff) == -50 || i_29_ == 149
			    || i_29_ == 147 || (i_28_ ^ 0xffffffff) == -51
			    || (i_28_ ^ 0xffffffff) == -50 && i_29_ == 47)) {
			Class108.anIntArray2083[i_21_] = i_30_;
			Class67_Sub5_Sub4_Sub1.anIntArray5114[i_21_] = -1;
			Class67_Sub1_Sub9.anIntArray3958[i_21_] = -1;
			Class67_Sub1_Sub18.anIntArray4116[i_21_] = -1;
			Applet_Sub1.anIntArray35[i_21_] = -1;
		    } else {
			Class108.anIntArray2083[i_21_] = i_30_;
			Class67_Sub5_Sub4_Sub1.anIntArray5114[i_21_]
			    = (Class111.aClass9_2097.method126
			       ((byte) -114,
				(Class67_Sub1_Sub27.method744
				 ((new RSString[]
				   { Canvas_Sub1.aRSString_61,
				     InputStream_Sub1.method47(i_28_, true),
				     Class67_Sub5_Sub4_Sub2.aRSString_5123,
				     InputStream_Sub1.method47(i_29_, arg0) }),
				  -111))));
			Class67_Sub1_Sub9.anIntArray3958[i_21_]
			    = (Class111.aClass9_2097.method126
			       ((byte) -118,
				(Class67_Sub1_Sub27.method744
				 ((new RSString[]
				   { Class57.aRSString_1109,
				     InputStream_Sub1.method47(i_28_, true),
				     Class67_Sub5_Sub4_Sub2.aRSString_5123,
				     InputStream_Sub1.method47(i_29_, arg0) }),
				  -118))));
			Class67_Sub1_Sub18.anIntArray4116[i_21_]
			    = (Class111.aClass9_2097.method126
			       ((byte) 113,
				(Class67_Sub1_Sub27.method744
				 ((new RSString[]
				   { RSString.aRSString_2663,
				     InputStream_Sub1.method47(i_28_, true),
				     Class67_Sub5_Sub4_Sub2.aRSString_5123,
				     InputStream_Sub1.method47(i_29_, true) }),
				  -122))));
			Applet_Sub1.anIntArray35[i_21_]
			    = (Class111.aClass9_2097.method126
			       ((byte) -118,
				(Class67_Sub1_Sub27.method744
				 ((new RSString[]
				   { Class67_Sub5.aRSString_2864,
				     InputStream_Sub1.method47(i_28_, arg0),
				     Class67_Sub5_Sub4_Sub2.aRSString_5123,
				     InputStream_Sub1.method47(i_29_, true) }),
				  -92))));
		    }
		    i_21_++;
		}
	    }
	    Class15.method168(i_24_, i_26_, i, 0, i_25_, i_27_, false);
	}
	anInt3517++;
	if (arg0 != true)
	    method1772(false, false);
    }
    
    public Class131_Sub6 method1773(byte arg0) {
	anInt3525++;
	int i = 56 % ((10 - arg0) / 32);
	Class81 class81 = Class67_Sub1.method622(-17177, anInt3523);
	Class131_Sub6 class131_sub6;
	if (aBoolean3531)
	    class131_sub6 = class81.method1428(-1, (byte) -44, 0, -1);
	else
	    class131_sub6 = class81.method1428(anInt3524, (byte) -47,
					       anInt3529, anInt3527);
	if (class131_sub6 == null)
	    return null;
	return class131_sub6;
    }
    
    public void method1764(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8, int arg9,
			   Class61_Sub1 arg10) {
	anInt3537++;
	Class131_Sub6 class131_sub6 = method1773((byte) -25);
	if (class131_sub6 != null) {
	    class131_sub6.method1764(arg0, arg1, arg2, arg3, arg4, arg5, arg6,
				     arg7, arg8, arg9, aClass61_Sub1_3530);
	    anInt3526 = class131_sub6.method1769();
	}
    }
    
    public static void method1774(int arg0) {
	aRSString_3522 = null;
	aByteArrayArrayArray3518 = null;
	if (arg0 == -1)
	    aRSString_3519 = null;
    }
    
    public void method1775(int arg0, int arg1) {
	anInt3534++;
	if (!aBoolean3531) {
	    if (arg1 > -114)
		method1771(-27, -59, 127, -96, -99);
	    anInt3529 += arg0;
	    while (aClass41_3533.anIntArray880[anInt3527] < anInt3529) {
		anInt3529 -= aClass41_3533.anIntArray880[anInt3527];
		anInt3527++;
		if ((anInt3527 ^ 0xffffffff)
		    <= (aClass41_3533.anIntArray855.length ^ 0xffffffff)) {
		    aBoolean3531 = true;
		    break;
		}
	    }
	}
    }
    
    public int method1769() {
	anInt3538++;
	return anInt3526;
    }
    
    public ObjectDef(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6) {
	anInt3524 = -1;
	aBoolean3531 = false;
	anInt3527 = 0;
	anInt3536 = arg2;
	anInt3528 = arg3;
	anInt3520 = arg1;
	anInt3523 = arg0;
	anInt3521 = arg4;
	anInt3532 = arg5 + arg6;
	int i = Class67_Sub1.method622(-17177, anInt3523).anInt1639;
	if (i != -1) {
	    aBoolean3531 = false;
	    aClass41_3533 = Class120.method1666(i, -32);
	} else
	    aBoolean3531 = true;
    }
}
