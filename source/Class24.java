public class Class24
{
    public int anInt571;
    public static int anInt572;
    public static int anInt573;
    public static boolean aBoolean574;
    public static int anInt575;
    public static int anInt576;
    public static RSString aRSString_577;
    public static int anInt578 = -1;
    public static int anInt579;
    public boolean aBoolean580 = false;
    public static int anInt581;
    public int anInt582;
    public static int anInt583;
    
    public static void method219(byte arg0) {
	aRSString_577 = null;
	if (arg0 < 6)
	    method220(-31, null);
    }
    
    public static int method220(int arg0, Class131_Sub7_Sub2 arg1) {
	anInt583++;
	int i = arg1.anInt5080;
	Class87 class87 = arg1.method1880((byte) -124);
	if (class87.anInt1797 != arg1.anInt3720) {
	    if ((arg1.anInt3720 ^ 0xffffffff) != (class87.anInt1812
						  ^ 0xffffffff)
		&& class87.anInt1795 != arg1.anInt3720
		&& class87.anInt1782 != arg1.anInt3720
		&& (arg1.anInt3720 ^ 0xffffffff) != (class87.anInt1806
						     ^ 0xffffffff)) {
		if ((arg1.anInt3720 ^ 0xffffffff) == (class87.anInt1790
						      ^ 0xffffffff)
		    || (class87.anInt1793 ^ 0xffffffff) == (arg1.anInt3720
							    ^ 0xffffffff)
		    || (class87.anInt1789 ^ 0xffffffff) == (arg1.anInt3720
							    ^ 0xffffffff)
		    || (arg1.anInt3720 ^ 0xffffffff) == (class87.anInt1769
							 ^ 0xffffffff))
		    i = arg1.anInt5062;
	    } else
		i = arg1.anInt5071;
	} else
	    i = arg1.anInt5087;
	if (arg0 <= 88)
	    return -100;
	return i;
    }
    
    public static void method221(int arg0, Class65 arg1, int arg2, int arg3,
				 Class131_Sub7_Sub2 arg4, int arg5,
				 Class131_Sub7_Sub1 arg6, int arg7) {
	try {
	    anInt572++;
	    Class67_Sub10 class67_sub10 = new Class67_Sub10();
	    class67_sub10.anInt3007 = 128 * arg0;
	    class67_sub10.anInt3006 = arg3;
	    class67_sub10.anInt2997 = arg2 * arg5;
	    if (arg1 != null) {
		class67_sub10.anInt2990 = arg1.anInt1300;
		class67_sub10.anInt3008 = arg1.anInt1270;
		class67_sub10.aClass65_2992 = arg1;
		class67_sub10.anInt2989 = arg1.anInt1242;
		class67_sub10.anIntArray2985 = arg1.anIntArray1304;
		int i = arg1.anInt1297;
		class67_sub10.anInt2995 = arg1.anInt1307 * 128;
		int i_0_ = arg1.anInt1264;
		if (arg7 == 1 || (arg7 ^ 0xffffffff) == -4) {
		    i = arg1.anInt1264;
		    i_0_ = arg1.anInt1297;
		}
		class67_sub10.anInt2996 = (arg5 + i) * 128;
		class67_sub10.anInt2999 = 128 * (arg0 + i_0_);
		if (arg1.anIntArray1244 != null) {
		    class67_sub10.aBoolean2993 = true;
		    class67_sub10.method1117(-120);
		}
		if (class67_sub10.anIntArray2985 != null)
		    class67_sub10.anInt2988
			= (class67_sub10.anInt2989
			   + (int) (Math.random()
				    * (double) (-class67_sub10.anInt2989
						+ class67_sub10.anInt2990)));
		Class92.aClass50_1868.method436(class67_sub10, false);
	    } else if (arg6 == null) {
		if (arg4 != null) {
		    class67_sub10.aClass131_Sub7_Sub2_3013 = arg4;
		    class67_sub10.anInt2996
			= 128 * (arg4.method1887((byte) -36) + arg5);
		    class67_sub10.anInt2999
			= (arg4.method1887((byte) -85) + arg0) * 128;
		    class67_sub10.anInt3008 = method220(94, arg4);
		    class67_sub10.anInt2995 = 128 * arg4.lastByte;
		    Class67_Sub12.aClass92_3036.method1488
			((byte) -89, class67_sub10,
			 arg4.playerName.method501((byte) -16));
		}
	    } else {
		class67_sub10.aClass131_Sub7_Sub1_3003 = arg6;
		Class64 class64 = arg6.aClass64_5047;
		if (class64.anIntArray1208 != null) {
		    class67_sub10.aBoolean2993 = true;
		    class64 = class64.method578(-1);
		}
		if (class64 != null) {
		    class67_sub10.anInt2996 = 128 * (class64.anInt1211 + arg5);
		    class67_sub10.anInt2999 = (class64.anInt1211 + arg0) * 128;
		    class67_sub10.anInt3008
			= Class67_Sub1_Sub27.method745((byte) 125, arg6);
		    class67_sub10.anInt2995 = 128 * class64.anInt1200;
		}
		Class67_Sub10.aClass50_2987.method436(class67_sub10, false);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("da.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ','
						+ (arg6 != null ? "{...}"
						   : "null")
						+ ',' + arg7 + ')'));
	}
    }
    
    public void method222(Stream arg0, byte arg1, int arg2) {
	for (;;) {
	    int i = arg0.readByte((byte) 93);
	    if (i == 0)
		break;
	    method225(arg1 + -29339, arg2, arg0, i);
	}
	anInt581++;
	if (arg1 != -99)
	    method225(98, 102, null, 64);
    }
    
    public Class119_Sub1 method223(int arg0, byte arg1) {
	anInt576++;
	if (arg1 >= -50)
	    anInt571 = 87;
	Class119_Sub1 class119_sub1
	    = ((Class119_Sub1)
	       Class67_Sub5_Sub11.aClass136_4669
		   .method1924((long) (anInt582 | arg0 << 1623909104), false));
	if (class119_sub1 != null)
	    return class119_sub1;
	Class89.aClass9_1832.method132(anInt582, true);
	class119_sub1
	    = Class67_Sub5_Sub4_Sub2.method859(anInt582, Class89.aClass9_1832,
					       0, 3576);
	if (class119_sub1 != null) {
	    class119_sub1.method1655(Class33_Sub2.anInt2784, Class57.anInt1110,
				     Class67_Sub5_Sub14.anInt4735);
	    class119_sub1.anInt2243 = class119_sub1.anInt2254;
	    class119_sub1.anInt2255 = class119_sub1.anInt2252;
	    for (int i = 0; i < arg0; i++)
		class119_sub1.method1652();
	    Class67_Sub5_Sub11.aClass136_4669.method1926
		((long) (anInt582 | arg0 << 1885977872), class119_sub1,
		 (byte) -71);
	}
	return class119_sub1;
    }
    
    public static void doNpcUpdate(byte arg0) {
	Class126_Sub2.anInt3439 = 0;
	Class55_Sub3.anInt2807 = 0;
	anInt573++;
	Class131_Sub7.method1879((byte) 88);
	Class96.method1507(-18961);
	Class140.method1942(-124);
	int i = -121 / ((53 - arg0) / 44);
	for (int i_1_ = 0; Class55_Sub3.anInt2807 > i_1_; i_1_++) {
	    int i_2_ = Class67_Sub1_Sub2.anIntArray3830[i_1_];
	    if ((Class128.aClass131_Sub7_Sub1Array2386[i_2_].anInt3789 ^ 0xffffffff) != (Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff)) {
		if (Class128.aClass131_Sub7_Sub1Array2386[i_2_].aClass64_5047.method576((byte) 82))
		    Class118.method1638(15, (Class128.aClass131_Sub7_Sub1Array2386[i_2_]));
		Class128.aClass131_Sub7_Sub1Array2386[i_2_].method1891((byte) -51, null);
		Class128.aClass131_Sub7_Sub1Array2386[i_2_] = null;
	    }
	}
	if ((Class67_Sub5_Sub1.lastPacketSize ^ 0xffffffff) != (Class54.aPacketStream_1069.currentOffset ^ 0xffffffff))
	    throw new RuntimeException("gnp1 pos:"
				       + (Class54.aPacketStream_1069
					  .currentOffset)
				       + " psize:"
				       + Class67_Sub5_Sub1.lastPacketSize);
	for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class37.anInt794 ^ 0xffffffff); i_3_++) {
	    if ((Class128.aClass131_Sub7_Sub1Array2386
		 [Class47.anIntArray965[i_3_]])
		== null)
		throw new RuntimeException("gnp2 pos:" + i_3_ + " size:"
					   + Class37.anInt794);
	}
    }
    
    public void method225(int arg0, int arg1, Stream arg2, int arg3) {
	if (arg0 != -29438)
	    aRSString_577 = null;
	anInt579++;
	if ((arg3 ^ 0xffffffff) == -2)
	    anInt582 = arg2.readUShort(-2386);
	else if (arg3 != 2) {
	    if ((arg3 ^ 0xffffffff) == -4)
		aBoolean580 = true;
	    else if ((arg3 ^ 0xffffffff) == -5)
		anInt582 = -1;
	} else
	    anInt571 = arg2.readThreeBytes(65280);
    }
    
    static {
	aRSString_577
	    = (Class134.method1914
	       ("Verbindung zum Update)2Server hergestellt)3", (byte) 94));
	aBoolean574 = false;
    }
}
