public class Class129_Sub1 extends Class129
{
    public Class92 aClass92_3474;
    public static int anInt3475;
    public static int anInt3476;
    public static int anInt3477;
    public Class40 aClass40_3478;
    public int anInt3479;
    public static int anInt3480;
    public static RSString aRSString_3481
	= Class134.method1914("huffman", (byte) 16);
    public static int anInt3482;
    public int anInt3483 = 0;
    public static int anInt3484;
    public static int anInt3485;
    public Class16 aClass16_3486;
    public byte[] aByteArray3487;
    public static int anInt3488;
    public static int anInt3489;
    public static int anInt3490;
    public Class20 aClass20_3491;
    public Class25 aClass25_3492;
    public static int anInt3493;
    public static int anInt3494;
    public static int anInt3495;
    public Class67_Sub5_Sub4 aClass67_Sub5_Sub4_3496;
    public static int anInt3497;
    public static RSString aRSString_3498;
    public static int anInt3499;
    public static RSString aRSString_3500 = Class134.method1914("", (byte) 23);
    public static int anInt3501;
    public Class20 aClass20_3502;
    public int anInt3503;
    public static int anInt3504;
    public static int anInt3505;
    public static int pingTick;
    public static int anInt3507;
    public int anInt3508;
    public static int anInt3509;
    public int anInt3510;
    public boolean aBoolean3511;
    public Class50 aClass50_3512;
    public Class50 aClass50_3513;
    public boolean aBoolean3514;
    public long aLong3515;
    public boolean aBoolean3516;
    
    public static void method1744(int arg0, Class67_Sub5_Sub19_Sub1[] arg1,
				  Class9 arg2) {
	try {
	    anInt3490++;
	    Class67_Sub8.aClass9_2966 = arg2;
	    Class67_Sub19.aClass67_Sub5_Sub19_Sub1Array3152 = arg1;
	    Class33_Sub2.aBooleanArray2777
		= (new boolean
		   [Class67_Sub19.aClass67_Sub5_Sub19_Sub1Array3152.length]);
	    Class10.aClass50_399.method437((byte) 126);
	    int i = Class67_Sub8.aClass9_2966
			.method126((byte) 49, Class131_Sub3.aRSString_3592);
	    int[] is = Class67_Sub8.aClass9_2966.method131(i, (byte) -123);
	    int i_0_ = 0;
	    if (arg0 > 102) {
		for (/**/; (is.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff);
		     i_0_++)
		    Class10.aClass50_399.method436
			((Class131_Sub3.method1809
			  (new Stream(Class67_Sub8.aClass9_2966.method138
					    (-809612665, is[i_0_], i)),
			   (byte) -114)),
			 false);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("mc.S(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public int method1745(byte arg0) {
	if (arg0 != 64)
	    return -82;
	anInt3489++;
	if (aClass25_3492 == null)
	    return 0;
	return aClass25_3492.anInt592;
    }
    
    public static void method1746(int arg0) {
	if (arg0 == -25377) {
	    aRSString_3500 = null;
	    aRSString_3498 = null;
	    aRSString_3481 = null;
	}
    }
    
    public int method1747(boolean arg0) {
	if (arg0 != true)
	    method1757(-125, -80, -72, -25, false);
	anInt3507++;
	return anInt3483;
    }
    
    public int method1748(int arg0) {
	anInt3495++;
	if (aClass25_3492 == null)
	    return 0;
	if (arg0 <= 109)
	    return 122;
	if (!aBoolean3511)
	    return aClass25_3492.anInt592;
	Class67 class67 = aClass50_3512.method445(0);
	if (class67 == null)
	    return 0;
	return (int) class67.aLong1344;
    }
    
    public byte[] method1737(int arg0, int arg1) {
	anInt3493++;
	Class67_Sub5_Sub4 class67_sub5_sub4 = method1749(arg0, arg1, -122);
	if (class67_sub5_sub4 == null)
	    return null;
	byte[] is = class67_sub5_sub4.method853(0);
	class67_sub5_sub4.method606((byte) -118);
	return is;
    }
    
    public void method1738(int arg0, int arg1) {
	anInt3499++;
	if (aClass20_3502 != null) {
	    Class67 class67 = aClass50_3513.method445(0);
	    if (arg0 != 21190)
		method1755(-67);
	    for (/**/; class67 != null; class67 = aClass50_3513.method432(0)) {
		if (((long) arg1 ^ 0xffffffffffffffffL)
		    == (class67.aLong1344 ^ 0xffffffffffffffffL))
		    return;
	    }
	    Class67 class67_1_ = new Class67();
	    class67_1_.aLong1344 = (long) arg1;
	    aClass50_3513.method436(class67_1_, false);
	}
    }
    
    public Class67_Sub5_Sub4 method1749(int arg0, int arg1, int arg2) {
	anInt3505++;
	Class67_Sub5_Sub4 class67_sub5_sub4
	    = ((Class67_Sub5_Sub4)
	       aClass92_3474.method1489((byte) -124, (long) arg1));
	if (class67_sub5_sub4 != null && arg0 == 0
	    && !class67_sub5_sub4.aBoolean4507
	    && class67_sub5_sub4.aBoolean4506) {
	    class67_sub5_sub4.method606((byte) -118);
	    class67_sub5_sub4 = null;
	}
	if (arg2 >= -117)
	    return null;
	if (class67_sub5_sub4 == null) {
	    if (arg0 != 0) {
		if (arg0 != 1) {
		    if ((arg0 ^ 0xffffffff) == -3) {
			if (aClass20_3502 == null)
			    throw new RuntimeException();
			if (aByteArray3487[arg1] != -1)
			    throw new RuntimeException();
			if (!aClass40_3478.method347(31))
			    class67_sub5_sub4
				= aClass40_3478.method349((byte) 2, arg1,
							  anInt3503,
							  (byte) -79, false);
			else
			    return null;
		    } else
			throw new RuntimeException();
		} else {
		    if (aClass20_3502 == null)
			throw new RuntimeException();
		    class67_sub5_sub4
			= aClass16_3486.method176(aClass20_3502, arg1, 17427);
		}
	    } else if (aClass20_3502 != null && aByteArray3487[arg1] != -1)
		class67_sub5_sub4
		    = aClass16_3486.method173(1, arg1, aClass20_3502);
	    else {
		if (aClass40_3478.method345((byte) 63))
		    return null;
		class67_sub5_sub4
		    = aClass40_3478.method349((byte) 2, arg1, anInt3503,
					      (byte) -100, true);
	    }
	    aClass92_3474.method1488((byte) -89, class67_sub5_sub4,
				     (long) arg1);
	}
	if (class67_sub5_sub4.aBoolean4506)
	    return null;
	byte[] is = class67_sub5_sub4.method853(0);
	if (class67_sub5_sub4 instanceof Class67_Sub5_Sub4_Sub2) {
	    try {
		if (is == null || (is.length ^ 0xffffffff) >= -3)
		    throw new RuntimeException();
		Class67_Sub6.aCRC32_2884.reset();
		Class67_Sub6.aCRC32_2884.update(is, 0, -2 + is.length);
		int i = (int) Class67_Sub6.aCRC32_2884.getValue();
		if (i != aClass25_3492.anIntArray597[arg1])
		    throw new RuntimeException();
		int i_2_ = ((is[-1 + is.length] & 0xff)
			    + (is[is.length + -2] << -753033240 & 0xff00));
		if ((0xffff & aClass25_3492.anIntArray584[arg1]) != i_2_)
		    throw new RuntimeException();
		if ((aByteArray3487[arg1] ^ 0xffffffff) != -2) {
		    anInt3483++;
		    aByteArray3487[arg1] = (byte) 1;
		}
		if (!class67_sub5_sub4.aBoolean4507)
		    class67_sub5_sub4.method606((byte) -118);
		return class67_sub5_sub4;
	    } catch (Exception exception) {
		aByteArray3487[arg1] = (byte) -1;
		class67_sub5_sub4.method606((byte) -118);
		if (class67_sub5_sub4.aBoolean4507
		    && !aClass40_3478.method345((byte) 75)) {
		    Class67_Sub5_Sub4_Sub1 class67_sub5_sub4_sub1
			= aClass40_3478.method349((byte) 2, arg1, anInt3503,
						  (byte) -107, true);
		    aClass92_3474.method1488((byte) -89,
					     class67_sub5_sub4_sub1,
					     (long) arg1);
		}
		return null;
	    }
	}
	try {
	    if (is == null || (is.length ^ 0xffffffff) >= -3)
		throw new RuntimeException();
	    Class67_Sub6.aCRC32_2884.reset();
	    Class67_Sub6.aCRC32_2884.update(is, 0, is.length + -2);
	    int i = (int) Class67_Sub6.aCRC32_2884.getValue();
	    if ((i ^ 0xffffffff)
		!= (aClass25_3492.anIntArray597[arg1] ^ 0xffffffff))
		throw new RuntimeException();
	    aClass40_3478.anInt845 = 0;
	    aClass40_3478.anInt844 = 0;
	} catch (RuntimeException runtimeexception) {
	    aClass40_3478.method351((byte) -101);
	    class67_sub5_sub4.method606((byte) -118);
	    if (class67_sub5_sub4.aBoolean4507
		&& !aClass40_3478.method345((byte) 69)) {
		Class67_Sub5_Sub4_Sub1 class67_sub5_sub4_sub1
		    = aClass40_3478.method349((byte) 2, arg1, anInt3503,
					      (byte) -71, true);
		aClass92_3474.method1488((byte) -89, class67_sub5_sub4_sub1,
					 (long) arg1);
	    }
	    return null;
	}
	is[-2 + is.length]
	    = (byte) (aClass25_3492.anIntArray584[arg1] >>> 1683583560);
	is[-1 + is.length] = (byte) aClass25_3492.anIntArray584[arg1];
	if (aClass20_3502 != null) {
	    aClass16_3486.method178(arg1, aClass20_3502, -2127, is);
	    if ((aByteArray3487[arg1] ^ 0xffffffff) != -2) {
		anInt3483++;
		aByteArray3487[arg1] = (byte) 1;
	    }
	}
	if (!class67_sub5_sub4.aBoolean4507)
	    class67_sub5_sub4.method606((byte) -118);
	return class67_sub5_sub4;
    }
    
    public static void method1750(int arg0) {
	Class122.aClass136_2303.method1922(0);
	anInt3497++;
	if (arg0 != -2)
	    method1750(51);
    }
    
    public void method1751(int arg0) {
	anInt3482++;
	if (aClass50_3512 != null) {
	    if (method1739(255) == null)
		return;
	    if (aBoolean3511) {
		boolean bool = true;
		for (Class67 class67 = aClass50_3512.method445(0);
		     class67 != null; class67 = aClass50_3512.method432(0)) {
		    int i = (int) class67.aLong1344;
		    if ((aByteArray3487[i] ^ 0xffffffff) == -1)
			method1749(1, i, arg0 ^ ~0x72cb);
		    if ((aByteArray3487[i] ^ 0xffffffff) == -1)
			bool = false;
		    else
			class67.method606((byte) -118);
		}
		while ((anInt3510 ^ 0xffffffff)
		       > (aClass25_3492.anIntArray595.length ^ 0xffffffff)) {
		    if ((aClass25_3492.anIntArray595[anInt3510] ^ 0xffffffff)
			== -1)
			anInt3510++;
		    else {
			if ((aClass16_3486.anInt482 ^ 0xffffffff) <= -251) {
			    bool = false;
			    break;
			}
			if (aByteArray3487[anInt3510] == 0)
			    method1749(1, anInt3510, -121);
			if (aByteArray3487[anInt3510] == 0) {
			    Class67 class67 = new Class67();
			    class67.aLong1344 = (long) anInt3510;
			    bool = false;
			    aClass50_3512.method436(class67, false);
			}
			anInt3510++;
		    }
		}
		if (bool) {
		    anInt3510 = 0;
		    aBoolean3511 = false;
		}
	    } else if (aBoolean3514) {
		boolean bool = true;
		for (Class67 class67 = aClass50_3512.method445(0);
		     class67 != null; class67 = aClass50_3512.method432(0)) {
		    int i = (int) class67.aLong1344;
		    if ((aByteArray3487[i] ^ 0xffffffff) != -2)
			method1749(2, i, -122);
		    if ((aByteArray3487[i] ^ 0xffffffff) == -2)
			class67.method606((byte) -118);
		    else
			bool = false;
		}
		while (aClass25_3492.anIntArray595.length > anInt3510) {
		    if ((aClass25_3492.anIntArray595[anInt3510] ^ 0xffffffff)
			== -1)
			anInt3510++;
		    else {
			if (aClass40_3478.method347(26)) {
			    bool = false;
			    break;
			}
			if ((aByteArray3487[anInt3510] ^ 0xffffffff) != -2)
			    method1749(2, anInt3510, -118);
			if ((aByteArray3487[anInt3510] ^ 0xffffffff) != -2) {
			    bool = false;
			    Class67 class67 = new Class67();
			    class67.aLong1344 = (long) anInt3510;
			    aClass50_3512.method436(class67, false);
			}
			anInt3510++;
		    }
		}
		if (bool) {
		    aBoolean3514 = false;
		    anInt3510 = 0;
		}
	    } else
		aClass50_3512 = null;
	}
	if (aBoolean3516
	    && (aLong3515 ^ 0xffffffffffffffffL) >= (Class39.method337(19644)
						     ^ 0xffffffffffffffffL)) {
	    for (Class67_Sub5_Sub4 class67_sub5_sub4
		     = (Class67_Sub5_Sub4) aClass92_3474.method1483((byte) 56);
		 class67_sub5_sub4 != null;
		 class67_sub5_sub4
		     = (Class67_Sub5_Sub4) aClass92_3474.method1480(11)) {
		if (!class67_sub5_sub4.aBoolean4506) {
		    if (class67_sub5_sub4.aBoolean4511) {
			if (!class67_sub5_sub4.aBoolean4507)
			    throw new RuntimeException();
			class67_sub5_sub4.method606((byte) -118);
		    } else
			class67_sub5_sub4.aBoolean4511 = true;
		}
	    }
	    aLong3515 = 1000L + Class39.method337(19644);
	}
	if (arg0 != 29373)
	    method1757(-15, -76, -69, -6, false);
    }
    
    public static void method1752(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	if ((-arg4 + arg1 ^ 0xffffffff) > (Class139.anInt2533 ^ 0xffffffff)
	    || (Class126_Sub1.anInt3423 ^ 0xffffffff) > (arg1 - -arg4
							 ^ 0xffffffff)
	    || Class55_Sub2.anInt2801 > -arg4 + arg5
	    || (OutputStream_Sub1.anInt87 ^ 0xffffffff) > (arg4 + arg5
							   ^ 0xffffffff))
	    Class67_Sub28.method1308(arg2, arg3, 20, arg4, arg1, arg6, arg5);
	else
	    Class120.method1659(arg3, arg1, arg4, arg2, arg6, true, arg5);
	anInt3485++;
	if (arg0 != 1)
	    anInt3484 = -23;
    }
    
    public int method1740(int arg0, int arg1) {
	anInt3494++;
	Class67_Sub5_Sub4 class67_sub5_sub4
	    = ((Class67_Sub5_Sub4)
	       aClass92_3474.method1489((byte) -25, (long) arg0));
	if (class67_sub5_sub4 != null)
	    return class67_sub5_sub4.method849((byte) -52);
	if (arg1 != 0)
	    aClass20_3491 = null;
	return 0;
    }
    
    public static Object method1753(byte[] arg0, int arg1, boolean arg2) {
	anInt3477++;
	if (arg0 == null)
	    return null;
	if (arg1 < arg0.length && !Class67_Sub5_Sub14.aBoolean4746) {
	    try {
		Class108 class108
		    = (Class108) Class.forName("Class108_Sub1").newInstance();
		class108.method1576((byte) 60, arg0);
		return class108;
	    } catch (Throwable throwable) {
		Class67_Sub5_Sub14.aBoolean4746 = true;
	    }
	}
	if (arg2)
	    return Class55_Sub1.method465(arg0, arg1 + -136);
	return arg0;
    }
    
    public void method1754(byte arg0) {
	anInt3488++;
	if (arg0 > -7)
	    method1738(99, 8);
	if (aClass20_3502 != null) {
	    aBoolean3514 = true;
	    if (aClass50_3512 == null)
		aClass50_3512 = new Class50();
	}
    }
    
    public int method1755(int arg0) {
	anInt3476++;
	if (arg0 != 0)
	    aClass20_3491 = null;
	if (method1739(255) == null) {
	    if (aClass67_Sub5_Sub4_3496 == null)
		return 0;
	    return aClass67_Sub5_Sub4_3496.method849((byte) -52);
	}
	return 100;
    }
    
    public void method1756(byte arg0) {
	anInt3504++;
	if (aClass50_3512 != null && method1739(255) != null) {
	    if (arg0 <= 43)
		method1740(126, -66);
	    for (Class67 class67 = aClass50_3513.method445(0); class67 != null;
		 class67 = aClass50_3513.method432(0)) {
		int i = (int) class67.aLong1344;
		if (i < 0
		    || (aClass25_3492.anInt588 ^ 0xffffffff) >= (i
								 ^ 0xffffffff)
		    || aClass25_3492.anIntArray595[i] == 0)
		    class67.method606((byte) -118);
		else {
		    if ((aByteArray3487[i] ^ 0xffffffff) == -1)
			method1749(1, i, -128);
		    if ((aByteArray3487[i] ^ 0xffffffff) == 0)
			method1749(2, i, -120);
		    if (aByteArray3487[i] == 1)
			class67.method606((byte) -118);
		}
	    }
	}
    }
    
    public Class25 method1739(int arg0) {
	anInt3475++;
	if (aClass25_3492 != null)
	    return aClass25_3492;
	if (aClass67_Sub5_Sub4_3496 == null) {
	    if (aClass40_3478.method345((byte) 76))
		return null;
	    aClass67_Sub5_Sub4_3496
		= aClass40_3478.method349((byte) 0, anInt3503, 255, (byte) -44,
					  true);
	}
	if (aClass67_Sub5_Sub4_3496.aBoolean4506)
	    return null;
	if (arg0 != 255)
	    method1750(-127);
	byte[] is = aClass67_Sub5_Sub4_3496.method853(0);
	do {
	    if (aClass67_Sub5_Sub4_3496 instanceof Class67_Sub5_Sub4_Sub2) {
		try {
		    if (is == null)
			throw new RuntimeException();
		    aClass25_3492 = new Class25(is, anInt3479);
		    if (aClass25_3492.anInt594 != anInt3508)
			throw new RuntimeException();
		    break;
		} catch (RuntimeException runtimeexception) {
		    aClass25_3492 = null;
		    if (aClass40_3478.method345((byte) 121))
			aClass67_Sub5_Sub4_3496 = null;
		    else
			aClass67_Sub5_Sub4_3496
			    = aClass40_3478.method349((byte) 0, anInt3503, 255,
						      (byte) -50, true);
		    return null;
		}
	    }
	    try {
		if (is == null)
		    throw new RuntimeException();
		aClass25_3492 = new Class25(is, anInt3479);
	    } catch (RuntimeException runtimeexception) {
		aClass40_3478.method351((byte) -119);
		aClass25_3492 = null;
		if (aClass40_3478.method345((byte) 81))
		    aClass67_Sub5_Sub4_3496 = null;
		else
		    aClass67_Sub5_Sub4_3496
			= aClass40_3478.method349((byte) 0, anInt3503, 255,
						  (byte) -63, true);
		return null;
	    }
	    if (aClass20_3491 != null)
		aClass16_3486.method178(anInt3503, aClass20_3491, -2127, is);
	} while (false);
	aClass67_Sub5_Sub4_3496 = null;
	if (aClass20_3502 != null) {
	    aByteArray3487 = new byte[aClass25_3492.anInt588];
	    anInt3483 = 0;
	}
	return aClass25_3492;
    }
    
    public static void method1757(int arg0, int arg1, int arg2, int arg3,
				  boolean arg4) {
	Class67_Sub27.anInt3301 = arg1;
	Class67_Sub5_Sub16.anInt4782 = arg2;
	Class67_Sub1.anInt2822 = arg3;
	Class126_Sub3.aClass67_Sub24ArrayArrayArray3453
	    = (new Class67_Sub24[arg0][Class67_Sub27.anInt3301]
	       [Class67_Sub5_Sub16.anInt4782]);
	InputStream_Sub1.anIntArrayArrayArray75
	    = (new int[arg0][Class67_Sub27.anInt3301 + 1]
	       [Class67_Sub5_Sub16.anInt4782 + 1]);
	if (arg4) {
	    Class67_Sub1_Sub34.aClass67_Sub24ArrayArrayArray4334
		= (new Class67_Sub24[1][Class67_Sub27.anInt3301]
		   [Class67_Sub5_Sub16.anInt4782]);
	    Class73.anIntArrayArray1464 = (new int[Class67_Sub27.anInt3301]
					   [Class67_Sub5_Sub16.anInt4782]);
	    Class67_Sub1_Sub17.anIntArrayArrayArray4096
		= (new int[1][Class67_Sub27.anInt3301 + 1]
		   [Class67_Sub5_Sub16.anInt4782 + 1]);
	} else {
	    Class67_Sub1_Sub34.aClass67_Sub24ArrayArrayArray4334 = null;
	    Class73.anIntArrayArray1464 = null;
	    Class67_Sub1_Sub17.anIntArrayArrayArray4096 = null;
	}
	Class140.method1945(false);
	Class83.aClass68Array1672 = new Class68[500];
	anInt3501 = 0;
	Class130.aClass68Array2424 = new Class68[500];
	Class113.anInt2140 = 0;
	Class126_Sub2.anIntArrayArrayArray3443
	    = (new int[arg0][Class67_Sub27.anInt3301 + 1]
	       [Class67_Sub5_Sub16.anInt4782 + 1]);
	Class67_Sub1_Sub16_Sub1.aClass36Array5099 = new Class36[5000];
	Canvas_Sub1.anInt62 = 0;
	Class28.aClass36Array666 = new Class36[100];
	Class124.aBooleanArrayArray2332
	    = (new boolean[Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822 + 1]
	       [Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822 + 1]);
	client.aBooleanArrayArray2739
	    = (new boolean[Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822 + 2]
	       [Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822 + 2]);
	Class134.aByteArrayArrayArray2464
	    = (new byte[arg0][Class67_Sub27.anInt3301]
	       [Class67_Sub5_Sub16.anInt4782]);
    }
    
    public Class129_Sub1(int arg0, Class20 arg1, Class20 arg2, Class40 arg3,
			 Class16 arg4, int arg5, int arg6, boolean arg7) {
	aClass92_3474 = new Class92(16);
	anInt3510 = 0;
	aClass50_3513 = new Class50();
	aLong3515 = 0L;
	do {
	    try {
		aClass20_3502 = arg1;
		anInt3503 = arg0;
		if (aClass20_3502 != null) {
		    aBoolean3511 = true;
		    aClass50_3512 = new Class50();
		} else
		    aBoolean3511 = false;
		aClass20_3491 = arg2;
		aClass16_3486 = arg4;
		anInt3479 = arg5;
		aBoolean3516 = arg7;
		anInt3508 = arg6;
		aClass40_3478 = arg3;
		if (aClass20_3491 == null)
		    break;
		aClass67_Sub5_Sub4_3496
		    = aClass16_3486.method173(1, anInt3503, aClass20_3491);
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718
			  (runtimeexception,
			   ("mc.<init>(" + arg0 + ','
			    + (arg1 != null ? "{...}" : "null") + ','
			    + (arg2 != null ? "{...}" : "null") + ','
			    + (arg3 != null ? "{...}" : "null") + ','
			    + (arg4 != null ? "{...}" : "null") + ',' + arg5
			    + ',' + arg6 + ',' + arg7 + ')'));
	    }
	    break;
	} while (false);
    }
    
    static {
	aRSString_3498 = Class134.method1914(":", (byte) 92);
	pingTick = 0;
	anInt3509 = 0;
    }
}
