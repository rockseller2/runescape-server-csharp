public class Class136
{
    public int anInt2480;
    public Class120 aClass120_2481 = new Class120();
    public static RSString aRSString_2482;
    public static int anInt2483;
    public static Class9 aClass9_2484;
    public static Class67_Sub11_Sub4 aClass67_Sub11_Sub4_2485;
    public static int anInt2486;
    public static int anInt2487;
    public static RSString aRSString_2488
	= Class134.method1914("Please wait)3)3)3", (byte) 114);
    public static int anInt2489;
    public static int anInt2490;
    public static RSString aRSString_2491;
    public static int anInt2492;
    public static int anInt2493;
    public Class92 aClass92_2494;
    public int anInt2495;
    public static int[][][] anIntArrayArrayArray2496;
    public static byte aByte2497;
    public static int anInt2498;
    public static Class74[] aClass74Array2499;
    public static int anInt2500;
    
    public void method1919(long arg0, byte arg1) {
	do {
	    try {
		int i = 39 / ((arg1 - 60) / 47);
		anInt2483++;
		Class67_Sub5_Sub11 class67_sub5_sub11
		    = ((Class67_Sub5_Sub11)
		       aClass92_2494.method1489((byte) -119, arg0));
		if (class67_sub5_sub11 == null)
		    break;
		class67_sub5_sub11.method606((byte) -118);
		class67_sub5_sub11.method821(24120);
		anInt2495++;
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   ("ve.G(" + arg0 + ',' + arg1
						    + ')'));
	    }
	    break;
	} while (false);
    }
    
    public void method1920(int arg0, int arg1) {
	if (arg1 <= 71)
	    method1925(false);
	if (Class115.aClass80_2178 != null) {
	    for (Class67_Sub5_Sub11 class67_sub5_sub11
		     = (Class67_Sub5_Sub11) aClass120_2481.method1656(104);
		 class67_sub5_sub11 != null;
		 class67_sub5_sub11
		     = (Class67_Sub5_Sub11) aClass120_2481.method1668(true)) {
		if (class67_sub5_sub11.method938(true)) {
		    if (class67_sub5_sub11.method935(true) == null) {
			class67_sub5_sub11.method606((byte) -118);
			class67_sub5_sub11.method821(24120);
			anInt2495++;
		    }
		} else if (++class67_sub5_sub11.aLong2863 > (long) arg0) {
		    Class67_Sub5_Sub11 class67_sub5_sub11_0_
			= Class115.aClass80_2178
			      .method1425((byte) 43, class67_sub5_sub11);
		    aClass92_2494.method1488((byte) -89, class67_sub5_sub11_0_,
					     class67_sub5_sub11.aLong1344);
		    Class67_Sub5_Sub16.method985(class67_sub5_sub11, 1,
						 class67_sub5_sub11_0_);
		    class67_sub5_sub11.method606((byte) -118);
		    class67_sub5_sub11.method821(24120);
		}
	    }
	}
	anInt2489++;
    }
    
    public void method1921(byte arg0) {
	for (Class67_Sub5_Sub11 class67_sub5_sub11
		 = (Class67_Sub5_Sub11) aClass120_2481.method1656(104);
	     class67_sub5_sub11 != null;
	     class67_sub5_sub11
		 = (Class67_Sub5_Sub11) aClass120_2481.method1668(true)) {
	    if (class67_sub5_sub11.method938(true)) {
		class67_sub5_sub11.method606((byte) -118);
		class67_sub5_sub11.method821(24120);
		anInt2495++;
	    }
	}
	int i = -40 / ((arg0 - -36) / 50);
	anInt2500++;
    }
    
    public void method1922(int arg0) {
	anInt2490++;
	aClass120_2481.method1665((byte) -121);
	if (arg0 != 0)
	    method1921((byte) 48);
	aClass92_2494.method1478(true);
	anInt2495 = anInt2480;
    }
    
    public int method1923(byte arg0) {
	anInt2493++;
	if (arg0 != -14)
	    method1920(110, 18);
	int i = 0;
	for (Class67_Sub5_Sub11 class67_sub5_sub11
		 = (Class67_Sub5_Sub11) aClass120_2481.method1656(104);
	     class67_sub5_sub11 != null;
	     class67_sub5_sub11
		 = (Class67_Sub5_Sub11) aClass120_2481.method1668(true)) {
	    if (!class67_sub5_sub11.method938(true))
		i++;
	}
	return i;
    }
    
    public Object method1924(long arg0, boolean arg1) {
	try {
	    Class67_Sub5_Sub11 class67_sub5_sub11
		= ((Class67_Sub5_Sub11)
		   aClass92_2494.method1489((byte) -68, arg0));
	    anInt2487++;
	    if (class67_sub5_sub11 == null)
		return null;
	    Object object = class67_sub5_sub11.method935(!arg1);
	    if (object == null) {
		class67_sub5_sub11.method606((byte) -118);
		class67_sub5_sub11.method821(24120);
		anInt2495++;
		return null;
	    }
	    if (!class67_sub5_sub11.method938(true)) {
		aClass120_2481.method1663(class67_sub5_sub11, -225);
		class67_sub5_sub11.aLong2863 = 0L;
	    } else {
		Class67_Sub5_Sub11_Sub2 class67_sub5_sub11_sub2
		    = new Class67_Sub5_Sub11_Sub2(object);
		aClass92_2494.method1488((byte) -89, class67_sub5_sub11_sub2,
					 class67_sub5_sub11.aLong1344);
		aClass120_2481.method1663(class67_sub5_sub11_sub2, -225);
		class67_sub5_sub11_sub2.aLong2863 = 0L;
		class67_sub5_sub11.method606((byte) -118);
		class67_sub5_sub11.method821(24120);
	    }
	    if (arg1 != false)
		aClass92_2494 = null;
	    return object;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ve.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1925(boolean arg0) {
	aClass67_Sub11_Sub4_2485 = null;
	if (arg0 == true) {
	    aClass9_2484 = null;
	    aRSString_2491 = null;
	    aClass74Array2499 = null;
	    aRSString_2488 = null;
	    anIntArrayArrayArray2496 = null;
	    aRSString_2482 = null;
	}
    }
    
    public void method1926(long arg0, Object arg1, byte arg2) {
	try {
	    if (arg2 != -71)
		method1922(-39);
	    anInt2498++;
	    method1919(arg0, (byte) -43);
	    if ((anInt2495 ^ 0xffffffff) != -1)
		anInt2495--;
	    else {
		Class67_Sub5_Sub11 class67_sub5_sub11
		    = ((Class67_Sub5_Sub11)
		       aClass120_2481.method1657((byte) 33));
		class67_sub5_sub11.method606((byte) -118);
		class67_sub5_sub11.method821(24120);
	    }
	    Class67_Sub5_Sub11_Sub2 class67_sub5_sub11_sub2
		= new Class67_Sub5_Sub11_Sub2(arg1);
	    aClass92_2494.method1488((byte) -89, class67_sub5_sub11_sub2,
				     arg0);
	    aClass120_2481.method1663(class67_sub5_sub11_sub2, -225);
	    class67_sub5_sub11_sub2.aLong2863 = 0L;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ve.H(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public Class136(int arg0) {
	anInt2495 = arg0;
	int i = 1;
	anInt2480 = arg0;
	for (/**/; arg0 > i - -i; i += i) {
	    /* empty */
	}
	aClass92_2494 = new Class92(i);
    }
    
    static {
	aRSString_2482 = Class134.method1914("Cach-B", (byte) 14);
	aRSString_2491 = aRSString_2488;
	anInt2492 = 0;
	aClass74Array2499 = new Class74[4];
    }
}
