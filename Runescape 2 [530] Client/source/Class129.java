public abstract class Class129
{
    public static Class16 aClass16_2389;
    public static int anInt2390;
    public static RSString aRSString_2391
	= Class134.method1914("Connected to update server", (byte) 11);
    public static int anInt2392;
    public static RSString aRSString_2393
	= Class134.method1914("Attaquer", (byte) 31);
    public static int anInt2394;
    public static int anInt2395;
    public static RSString aRSString_2396;
    public static int anInt2397;
    public static int anInt2398;
    public static RSString aRSString_2399;
    public static int anInt2400;
    public static int anInt2401;
    public static RSString aRSString_2402;
    
    public static void method1736(int arg0) {
	anInt2390++;
	for (int i = 0; i < 5; i++)
	    Class107.aBooleanArray2074[i] = false;
	Applet_Sub1.anInt5 = 0;
	Class22.anInt530 = 1;
	Class67_Sub1_Sub23.anInt4182 = -1;
	Class129_Sub1.anInt3480 = 0;
	Class86.anInt1768 = arg0;
    }
    
    public abstract byte[] method1737(int i, int i_0_);
    
    public abstract void method1738(int i, int i_1_);
    
    public abstract Class25 method1739(int i);
    
    public abstract int method1740(int i, int i_2_);
    
    public static void method1741(int arg0) {
	try {
	    aRSString_2393 = null;
	    if (arg0 != 1)
		aRSString_2399 = null;
	    aClass16_2389 = null;
	    aRSString_2399 = null;
	    aRSString_2396 = null;
	    aRSString_2391 = null;
	    aRSString_2402 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "ud.C(" + arg0 + ')');
	}
    }
    
    public static Class67_Sub5_Sub19 method1742(byte arg0) {
	try {
	    anInt2400++;
	    int i = (Class55_Sub3.anIntArray2810[0]
		     * Class67_Sub5_Sub4.anIntArray4510[0]);
	    byte[] is = Class67_Sub1_Sub35.aByteArrayArray4357[0];
	    int[] is_3_ = new int[i];
	    for (int i_4_ = 0; (i ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++)
		is_3_[i_4_]
		    = Class73.anIntArray1462[Class75.method1379(255,
								is[i_4_])];
	    if (arg0 != 57)
		method1742((byte) 106);
	    Class67_Sub5_Sub19_Sub1 class67_sub5_sub19_sub1
		= new Class67_Sub5_Sub19_Sub1(Class3.anInt119,
					      Class80.anInt1628,
					      Class67_Sub23.anIntArray3201[0],
					      Class67_Sub6.anIntArray2870[0],
					      Class55_Sub3.anIntArray2810[0],
					      (Class67_Sub5_Sub4.anIntArray4510
					       [0]),
					      is_3_);
	    Class67_Sub5_Sub11.method937(false);
	    return class67_sub5_sub19_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "ud.D(" + arg0 + ')');
	}
    }
    
    public static void method1743(byte arg0, Class131_Sub7 arg1) {
	do {
	    try {
		anInt2394++;
		arg1.aBoolean3699 = false;
		if ((arg1.anInt3720 ^ 0xffffffff) != 0) {
		    Class41 class41 = Class120.method1666(arg1.anInt3720, -32);
		    if (class41 == null || class41.anIntArray855 == null)
			arg1.anInt3720 = -1;
		    else {
			arg1.anInt3717++;
			if (arg1.anInt3758 < class41.anIntArray855.length
			    && ((arg1.anInt3717 ^ 0xffffffff)
				< (class41.anIntArray880[arg1.anInt3758]
				   ^ 0xffffffff))) {
			    arg1.anInt3758++;
			    arg1.anInt3717 = 1;
			    arg1.anInt3722++;
			    OutputStream_Sub1.method58
				(class41, arg1.anInt3726, -115, arg1.anInt3733,
				 arg1 == Class122.aClass131_Sub7_Sub2_2309,
				 arg1.anInt3758);
			}
			if ((class41.anIntArray855.length ^ 0xffffffff)
			    >= (arg1.anInt3758 ^ 0xffffffff)) {
			    arg1.anInt3758 = 0;
			    arg1.anInt3717 = 0;
			    OutputStream_Sub1.method58
				(class41, arg1.anInt3726, -109, arg1.anInt3733,
				 Class122.aClass131_Sub7_Sub2_2309 == arg1,
				 arg1.anInt3758);
			}
			arg1.anInt3722 = 1 + arg1.anInt3758;
			if ((arg1.anInt3722 ^ 0xffffffff)
			    <= (class41.anIntArray855.length ^ 0xffffffff))
			    arg1.anInt3722 = 0;
		    }
		}
		if (arg1.anInt3739 != -1
		    && Class67_Sub1_Sub9.anInt3952 >= arg1.anInt3701) {
		    int i = (Class67_Sub1.method622(-17177, arg1.anInt3739)
			     .anInt1639);
		    if ((i ^ 0xffffffff) != 0) {
			Class41 class41 = Class120.method1666(i, arg0 ^ ~0x63);
			if (class41 == null || class41.anIntArray855 == null)
			    arg1.anInt3739 = -1;
			else {
			    if ((arg1.anInt3745 ^ 0xffffffff) > -1) {
				arg1.anInt3745 = 0;
				OutputStream_Sub1.method58
				    (class41, arg1.anInt3726, -126,
				     arg1.anInt3733,
				     arg1 == Class122.aClass131_Sub7_Sub2_2309,
				     0);
			    }
			    arg1.anInt3712++;
			    if (((arg1.anInt3745 ^ 0xffffffff)
				 > (class41.anIntArray855.length ^ 0xffffffff))
				&& ((arg1.anInt3712 ^ 0xffffffff)
				    < (class41.anIntArray880[arg1.anInt3745]
				       ^ 0xffffffff))) {
				arg1.anInt3712 = 1;
				arg1.anInt3745++;
				OutputStream_Sub1.method58
				    (class41, arg1.anInt3726, -126,
				     arg1.anInt3733,
				     Class122.aClass131_Sub7_Sub2_2309 == arg1,
				     arg1.anInt3745);
			    }
			    if ((class41.anIntArray855.length ^ 0xffffffff)
				>= (arg1.anInt3745 ^ 0xffffffff))
				arg1.anInt3739 = -1;
			    arg1.anInt3780 = 1 + arg1.anInt3745;
			    if ((arg1.anInt3780 ^ 0xffffffff)
				<= (class41.anIntArray855.length ^ 0xffffffff))
				arg1.anInt3780 = -1;
			}
		    } else
			arg1.anInt3739 = -1;
		}
		if (arg1.anInt3735 != -1 && arg1.anInt3792 <= 1) {
		    Class41 class41 = Class120.method1666(arg1.anInt3735, -32);
		    if (class41.anInt863 == 1
			&& (arg1.anInt3727 ^ 0xffffffff) < -1
			&& Class67_Sub1_Sub9.anInt3952 >= arg1.anInt3714
			&& ((arg1.anInt3734 ^ 0xffffffff)
			    > (Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff))) {
			arg1.anInt3792 = 1;
			break;
		    }
		}
		if ((arg1.anInt3735 ^ 0xffffffff) != 0
		    && (arg1.anInt3792 ^ 0xffffffff) == -1) {
		    Class41 class41 = Class120.method1666(arg1.anInt3735, -32);
		    if (class41 != null && class41.anIntArray855 != null) {
			arg1.anInt3741++;
			if (class41.anIntArray855.length > arg1.anInt3783
			    && ((class41.anIntArray880[arg1.anInt3783]
				 ^ 0xffffffff)
				> (arg1.anInt3741 ^ 0xffffffff))) {
			    arg1.anInt3741 = 1;
			    arg1.anInt3783++;
			    OutputStream_Sub1.method58
				(class41, arg1.anInt3726, -122, arg1.anInt3733,
				 arg1 == Class122.aClass131_Sub7_Sub2_2309,
				 arg1.anInt3783);
			}
			if (arg1.anInt3783 >= class41.anIntArray855.length) {
			    arg1.anInt3783 -= class41.anInt881;
			    arg1.anInt3791++;
			    if ((class41.anInt849 ^ 0xffffffff)
				< (arg1.anInt3791 ^ 0xffffffff)) {
				if (arg1.anInt3783 >= 0
				    && (arg1.anInt3783
					< class41.anIntArray855.length))
				    OutputStream_Sub1.method58
					(class41, arg1.anInt3726, -114,
					 arg1.anInt3733,
					 arg1 == (Class122
						  .aClass131_Sub7_Sub2_2309),
					 arg1.anInt3783);
				else
				    arg1.anInt3735 = -1;
			    } else
				arg1.anInt3735 = -1;
			}
			arg1.anInt3704 = arg1.anInt3783 + 1;
			if (class41.anIntArray855.length <= arg1.anInt3704) {
			    arg1.anInt3704 -= class41.anInt881;
			    if (class41.anInt849 <= 1 + arg1.anInt3791)
				arg1.anInt3704 = -1;
			    else if ((arg1.anInt3704 ^ 0xffffffff) > -1
				     || ((arg1.anInt3704 ^ 0xffffffff)
					 <= (class41.anIntArray855.length
					     ^ 0xffffffff)))
				arg1.anInt3704 = -1;
			}
			arg1.aBoolean3699 = class41.aBoolean879;
		    } else
			arg1.anInt3735 = -1;
		}
		if ((arg1.anInt3792 ^ 0xffffffff) < -1)
		    arg1.anInt3792--;
		for (int i = 0; ((arg1.aClass21Array3749.length ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++) {
		    Class21 class21 = arg1.aClass21Array3749[i];
		    if (class21 != null) {
			if ((class21.anInt517 ^ 0xffffffff) < -1)
			    class21.anInt517--;
			else {
			    Class41 class41
				= Class120.method1666(class21.anInt516, -32);
			    if (class41 == null
				|| class41.anIntArray855 == null)
				arg1.aClass21Array3749[i] = null;
			    else {
				class21.anInt515++;
				if (((class21.anInt525 ^ 0xffffffff)
				     > (class41.anIntArray855.length
					^ 0xffffffff))
				    && (((class41.anIntArray880
					  [class21.anInt525])
					 ^ 0xffffffff)
					> (class21.anInt515 ^ 0xffffffff))) {
				    class21.anInt515 = 1;
				    class21.anInt525++;
				    OutputStream_Sub1.method58
					(class41, arg1.anInt3726, arg0 + -243,
					 arg1.anInt3733,
					 (Class122.aClass131_Sub7_Sub2_2309
					  == arg1),
					 class21.anInt525);
				}
				if ((class41.anIntArray855.length ^ 0xffffffff)
				    >= (class21.anInt525 ^ 0xffffffff)) {
				    class21.anInt525 -= class41.anInt881;
				    class21.anInt521++;
				    if ((class21.anInt521 ^ 0xffffffff)
					<= (class41.anInt849 ^ 0xffffffff))
					arg1.aClass21Array3749[i] = null;
				    else if (class21.anInt525 >= 0
					     && (class21.anInt525
						 < (class41
						    .anIntArray855).length))
					OutputStream_Sub1.method58
					    (class41, arg1.anInt3726,
					     arg0 ^ ~0x2, arg1.anInt3733,
					     (Class122.aClass131_Sub7_Sub2_2309
					      == arg1),
					     class21.anInt525);
				    else
					arg1.aClass21Array3749[i] = null;
				}
				class21.anInt512 = 1 + class21.anInt525;
				if ((class41.anIntArray855.length ^ 0xffffffff)
				    >= (class21.anInt512 ^ 0xffffffff)) {
				    class21.anInt512 -= class41.anInt881;
				    if ((class41.anInt849 ^ 0xffffffff)
					< (class21.anInt521 + 1
					   ^ 0xffffffff)) {
					if (class21.anInt512 < 0
					    || ((class21.anInt512 ^ 0xffffffff)
						<= ((class41
						     .anIntArray855).length
						    ^ 0xffffffff)))
					    class21.anInt512 = -1;
				    } else
					class21.anInt512 = -1;
				}
			    }
			}
		    }
		}
		if (arg0 == 124)
		    break;
		method1743((byte) 67, null);
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   ("ud.B(" + arg0 + ','
						    + (arg1 != null ? "{...}"
						       : "null")
						    + ')'));
	    }
	    break;
	} while (false);
    }
    
    static {
	anInt2392 = 0;
	aRSString_2396 = aRSString_2391;
	aRSString_2402 = Class134.method1914("<col=ffffff>", (byte) 83);
	aRSString_2399
	    = (Class134.method1914
	       ("Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3",
		(byte) 121));
    }
}
