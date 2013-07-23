/* Class67_Sub1_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub8 extends Class67_Sub1
{
    public static RSString aRSString_3914
	= Class134.method1914("green:", (byte) 42);
    public static int anInt3915;
    public static Interface3 anInterface3_3916;
    public static int anInt3917;
    public static int anInt3918;
    public static int anInt3919;
    public static int anInt3920;
    public static short[] aShortArray3921
	= { -4160, -4163, -8256, -8259, 22461 };
    public static int anInt3922;
    public static Class9 aClass9_3923;
    public static RSString[] aRSStringArray3924;
    public static int anInt3925;
    public static Class9 aClass9_3926;
    public static RSString aRSString_3927 = aRSString_3914;
    public static RSString aRSString_3928 = aRSString_3914;
    public Class126[] aClass126Array3929;
    
    public int[] method611(int arg0, byte arg1) {
	anInt3920++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (arg1 != 55)
	    aClass9_3923 = null;
	if (aClass144_2836.aBoolean2607)
	    method651(aClass144_2836.method1967((byte) 66), arg1 + -55);
	return is;
    }
    
    public void method651(int[][] arg0, int arg1) {
	anInt3915++;
	int i = Class67_Sub5_Sub7.anInt4569;
	int i_0_ = RuntimeException_Sub1.anInt2618;
	Class67_Sub23.method1282(arg1 ^ ~0x2, arg0);
	Class55_Sub3_Sub1.method478(Class76.anInt1581, 0, arg1,
				    Class67_Sub1_Sub36.anInt4381, (byte) -52);
	if (aClass126Array3929 != null) {
	    for (int i_1_ = 0; i_1_ < aClass126Array3929.length; i_1_++) {
		Class126 class126 = aClass126Array3929[i_1_];
		int i_2_ = class126.anInt2358;
		int i_3_ = class126.anInt2351;
		if (i_2_ < 0) {
		    if (i_3_ >= 0)
			class126.method1712((byte) -41, i, i_0_);
		} else if (i_3_ < 0)
		    class126.method1708((byte) -36, i, i_0_);
		else
		    class126.method1710(i_0_, i, (byte) -67);
	    }
	}
    }
    
    public static void method652(int arg0) {
	anInt3917++;
	boolean bool = true;
	Class102.method1549(false, 121);
	Canvas_Sub1.anInt57 = 0;
	for (int i = 0; i < Class67_Sub5_Sub11.aByteArrayArray4675.length;
	     i++) {
	    if ((Class67_Sub5_Sub4_Sub1.anIntArray5114[i] ^ 0xffffffff) != 0
		&& Class67_Sub5_Sub11.aByteArrayArray4675[i] == null) {
		Class67_Sub5_Sub11.aByteArrayArray4675[i]
		    = Class111.aClass9_2097.method138(-809612665, 0,
						      (Class67_Sub5_Sub4_Sub1
						       .anIntArray5114[i]));
		if (Class67_Sub5_Sub11.aByteArrayArray4675[i] == null) {
		    Canvas_Sub1.anInt57++;
		    bool = false;
		}
	    }
	    if (Class67_Sub1_Sub9.anIntArray3958[i] != -1
		&& Class67_Sub16.aByteArrayArray3087[i] == null) {
		Class67_Sub16.aByteArrayArray3087[i]
		    = Class111.aClass9_2097.method115((byte) 79, 0,
						      (Class68
						       .anIntArrayArray1372
						       [i]),
						      (Class67_Sub1_Sub9
						       .anIntArray3958[i]));
		if (Class67_Sub16.aByteArrayArray3087[i] == null) {
		    bool = false;
		    Canvas_Sub1.anInt57++;
		}
	    }
	    if (Class4.anIntArray124 != null
		&& Class75.aByteArrayArray2704[i] == null
		&& Class4.anIntArray124[i] != -1) {
		Class75.aByteArrayArray2704[i]
		    = Class111.aClass9_2097.method115((byte) 116, 0,
						      (Class68
						       .anIntArrayArray1372
						       [i]),
						      Class4.anIntArray124[i]);
		if (Class75.aByteArrayArray2704[i] == null) {
		    bool = false;
		    Canvas_Sub1.anInt57++;
		}
	    }
	}
	if (Class131.aClass72_2428 == null) {
	    if (Class55_Sub3.aClass67_Sub5_Sub6_2809 != null
		&& (Class2.aClass9_108.method108
		    (Class67_Sub1_Sub27.method744((new RSString[]
						   { (Class55_Sub3
						      .aClass67_Sub5_Sub6_2809
						      .aRSString_4553),
						     Class14.aRSString_449 }),
						  -116),
		     arg0 ^ ~0x76f9))) {
		if (Class2.aClass9_108.method105
		    (256,
		     Class67_Sub1_Sub27.method744((new RSString[]
						   { (Class55_Sub3
						      .aClass67_Sub5_Sub6_2809
						      .aRSString_4553),
						     Class14.aRSString_449 }),
						  -109)))
		    Class131.aClass72_2428
			= Class61.method555(arg0 ^ ~0x4666,
					    (Class67_Sub1_Sub27.method744
					     ((new RSString[]
					       { (Class55_Sub3
						  .aClass67_Sub5_Sub6_2809
						  .aRSString_4553),
						 Class14.aRSString_449 }),
					      -128)),
					    Class2.aClass9_108);
		else {
		    Canvas_Sub1.anInt57++;
		    bool = false;
		}
	    } else
		Class131.aClass72_2428 = new Class72(0);
	}
	if (!bool)
	    Class12.anInt420 = 1;
	else {
	    Class67_Sub21.anInt3174 = 0;
	    bool = true;
	    for (int i = 0;
		 ((Class67_Sub5_Sub11.aByteArrayArray4675.length ^ 0xffffffff)
		  < (i ^ 0xffffffff));
		 i++) {
		byte[] is = Class67_Sub16.aByteArrayArray3087[i];
		if (is != null) {
		    int i_4_ = (64 * (Class108.anIntArray2083[i] & 0xff)
				+ -Class137.baseY);
		    int i_5_
			= (-Class58.baseX
			   + 64 * (Class108.anIntArray2083[i] >> -1441776280));
		    if (Class67_Sub5_Sub15.aBoolean4754) {
			i_4_ = 10;
			i_5_ = 10;
		    }
		    bool &= Class83.method1442(i_5_, is, 6685, i_4_);
		}
	    }
	    if (!bool)
		Class12.anInt420 = 2;
	    else {
		if (arg0 != -30458)
		    aClass9_3926 = null;
		if ((Class12.anInt420 ^ 0xffffffff) != -1)
		    Class67_Sub1_Sub35.method775
			(Class67_Sub1_Sub27.method744((new RSString[]
						       { (Class67_Sub22
							  .aRSString_3182),
							 (Class67_Sub1_Sub36
							  .aRSString_4370) }),
						      arg0 ^ 0x7682),
			 true, (byte) -60);
		boolean bool_6_ = false;
		Class132.method1901(64);
		Class67_Sub1.method619(-18131);
		Class129_Sub1.method1757(4, 104, 104, 25, bool_6_);
		for (int i = 0; i < 4; i++)
		    Class53.aClass73Array1059[i].method1357(arg0 ^ ~0x76d0);
		for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
		    for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -105; i_7_++) {
			for (int i_8_ = 0; i_8_ < 104; i_8_++)
			    Class120.aByteArrayArrayArray2284[i][i_7_][i_8_]
				= (byte) 0;
		    }
		}
		Class99.method1521(false, 24077);
		Class132.method1901(arg0 ^ ~0x76b9);
		System.gc();
		Class102.method1549(true, 97);
		Class7.method89(false, arg0 + 30336);
		if (!Class67_Sub5_Sub15.aBoolean4754) {
		    RuntimeException_Sub1.method1970((byte) -7, false);
		    Class102.method1549(true, -126);
		    Class28.method271(true, false);
		    if (Class75.aByteArrayArray2704 != null)
			Class67_Sub1_Sub35.method774(63);
		}
		if (Class67_Sub5_Sub15.aBoolean4754) {
		    Class143.method1960(false, 99);
		    Class102.method1549(true, 99);
		    Class55_Sub3.method476((byte) -50, false);
		}
		Class67_Sub1.method619(-18131);
		Class102.method1549(true, arg0 ^ ~0x76a4);
		Class9.method119(128, Class53.aClass73Array1059, false);
		Class102.method1549(true, -125);
		int i = Class67_Sub1_Sub12.anInt4005;
		if (i > Canvas_Sub1.anInt59)
		    i = Canvas_Sub1.anInt59;
		if (i < -1 + Canvas_Sub1.anInt59)
		    i = -1 + Canvas_Sub1.anInt59;
		if (!Class32.method288(true))
		    Class19.method187(Class67_Sub1_Sub12.anInt4005);
		else
		    Class19.method187(0);
		Class67_Sub16.method1245(8428);
		for (int i_9_ = 0; i_9_ < 104; i_9_++) {
		    for (int i_10_ = 0; i_10_ < 104; i_10_++)
			Class67_Sub11_Sub4.method1191(72, i_10_, i_9_);
		}
		Class55_Sub2.method470(512);
		Class132.method1901(64);
		Class67_Sub14.method1223(true);
		Class67_Sub1.method619(-18131);
		if (Class120.aFrame2272 != null
		    && Class41.aClass117_867 != null
		    && Class67_Sub5_Sub18.anInt4804 == 25) {
		    Class70_Sub1.outStream.createFrame(2, 20);
		    Class70_Sub1.outStream.addInt(1057001181,
								    126);
		    Class65.anInt1272++;
		}
		if (!Class67_Sub5_Sub15.aBoolean4754) {
		    int i_11_ = (-6 + Class67_Sub1_Sub11.anInt3992) / 8;
		    int i_12_ = (Class67_Sub1_Sub11.anInt3992 - -6) / 8;
		    int i_13_ = (-6 + Canvas_Sub1.anInt64) / 8;
		    int i_14_ = (Canvas_Sub1.anInt64 - -6) / 8;
		    for (int i_15_ = -1 + i_11_; 1 + i_12_ >= i_15_; i_15_++) {
			for (int i_16_ = i_13_ + -1; i_14_ - -1 >= i_16_;
			     i_16_++) {
			    if (i_15_ < i_11_ || i_15_ > i_12_
				|| (i_16_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff)
				|| (i_14_ ^ 0xffffffff) > (i_16_
							   ^ 0xffffffff)) {
				Class111.aClass9_2097.method109
				    ((Class67_Sub1_Sub27.method744
				      ((new RSString[]
					{ Canvas_Sub1.aRSString_61,
					  InputStream_Sub1.method47(i_15_,
								    true),
					  Class67_Sub5_Sub4_Sub2.aRSString_5123,
					  InputStream_Sub1.method47(i_16_,
								    true) }),
				       -113)),
				     (byte) -123);
				Class111.aClass9_2097.method109
				    ((Class67_Sub1_Sub27.method744
				      ((new RSString[]
					{ Class57.aRSString_1109,
					  InputStream_Sub1.method47(i_15_,
								    true),
					  Class67_Sub5_Sub4_Sub2.aRSString_5123,
					  InputStream_Sub1.method47(i_16_,
								    true) }),
				       arg0 + 30352)),
				     (byte) -128);
			    }
			}
		    }
		}
		if (Class67_Sub5_Sub18.anInt4804 == 28)
		    Class40.method348(-11461, 10);
		else {
		    Class40.method348(-11461, 30);
		    if (Class41.aClass117_867 != null)
			Class70_Sub1.outStream.createFrame(2, 110);	//REIGON_LOADING
		}
		RuntimeException_Sub1.method1973(0);
		Class132.method1901(64);
		Class37.method325(arg0 ^ ~0x1b85);
	    }
	}
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt3918++;
	if (arg1 != true)
	    method611(-7, (byte) -106);
	if ((arg2 ^ 0xffffffff) != -1) {
	    if ((arg2 ^ 0xffffffff) == -2)
		aBoolean2839 = (arg0.readByte((byte) 90) ^ 0xffffffff) == -2;
	} else {
	    aClass126Array3929 = new Class126[arg0.readByte((byte) 118)];
	    int i = 0;
	while_35_:
	    for (/**/;
		 (aClass126Array3929.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		int i_17_ = arg0.readByte((byte) 108);
		int i_18_ = i_17_;
	    while_33_:
		do {
		    do {
			if ((i_18_ ^ 0xffffffff) != -1) {
			    if (i_18_ != 1) {
				if (i_18_ != 2) {
				    if ((i_18_ ^ 0xffffffff) != -4)
					continue while_35_;
				} else
				    break;
				break while_33_;
			    }
			} else {
			    aClass126Array3929[i]
				= Class65.method597(arg0, false);
			    continue while_35_;
			}
			aClass126Array3929[i] = Class8.method101(64, arg0);
			continue while_35_;
		    } while (false);
		    aClass126Array3929[i]
			= Class67_Sub1_Sub35.method778(arg0, 0);
		    continue while_35_;
		} while (false);
		aClass126Array3929[i]
		    = Class67_Sub1.method616(arg0, (byte) -121);
	    }
	}
    }
    
    public static int method653(int arg0, RSString arg1, Stream arg2) {
	try {
	    if (arg0 >= -60)
		method654(-7);
	    anInt3919++;
	    int i = arg2.currentOffset;
	    byte[] is = arg1.method518(false);
	    arg2.method1066((byte) 63, is.length);
	    arg2.currentOffset
		+= Class86.aClass27_1756.method251(0, is.length,
						   arg2.buffer,
						   arg2.currentOffset, is, -121);
	    return arg2.currentOffset - i;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("gj.C(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method654(int arg0) {
	aClass9_3923 = null;
	aShortArray3921 = null;
	aRSStringArray3924 = null;
	aRSString_3928 = null;
	aClass9_3926 = null;
	aRSString_3914 = null;
	if (arg0 != 32154)
	    aShortArray3921 = null;
	anInterface3_3916 = null;
	aRSString_3927 = null;
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	anInt3922++;
	int[][] is = aClass103_2830.method1551(arg1, 77);
	if (aClass103_2830.aBoolean2030) {
	    int i = RuntimeException_Sub1.anInt2618;
	    int i_19_ = Class67_Sub5_Sub7.anInt4569;
	    int[][][] is_20_ = aClass103_2830.method1555((byte) -18);
	    int[][] is_21_ = new int[i][i_19_];
	    method651(is_21_, 0);
	    for (int i_22_ = 0;
		 ((i_22_ ^ 0xffffffff)
		  > (RuntimeException_Sub1.anInt2618 ^ 0xffffffff));
		 i_22_++) {
		int[] is_23_ = is_21_[i_22_];
		int[][] is_24_ = is_20_[i_22_];
		int[] is_25_ = is_24_[0];
		int[] is_26_ = is_24_[1];
		int[] is_27_ = is_24_[2];
		for (int i_28_ = 0; ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
				     < (i_28_ ^ 0xffffffff)); i_28_++) {
		    int i_29_ = is_23_[i_28_];
		    is_27_[i_28_]
			= Class75.method1379(4080, i_29_ << 1514654020);
		    is_26_[i_28_]
			= Class75.method1379(i_29_ >> -654700220, 4080);
		    is_25_[i_28_]
			= Class75.method1379(16711680, i_29_) >> -1719861364;
		}
	    }
	}
	if (arg0 != true)
	    method611(68, (byte) -56);
	return is;
    }
    
    public Class67_Sub1_Sub8() {
	super(0, true);
    }
}
