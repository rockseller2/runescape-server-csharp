public class Class16 implements Runnable
{
    public static int anInt464;
    public static RSString aRSString_465
	= Class134.method1914("Interfaces charg-Bes", (byte) 27);
    public static int anInt466;
    public static int anInt467;
    public static int anInt468;
    public static int anInt469;
    public static Class7 aClass7_470;
    public static int anInt471;
    public static int anInt472;
    public static int anInt473;
    public static int anInt474;
    public static SignLink aSignLink_475;
    public static int anInt476;
    public static int anInt477;
    public Class120 aClass120_478 = new Class120();
    public boolean aBoolean479 = false;
    public Thread aThread480;
    public static RSString aRSString_481;
    public int anInt482 = 0;
    
    public void method171(boolean arg0) {
	anInt474++;
	if (arg0 == false) {
	    aBoolean479 = true;
	    synchronized (aClass120_478) {
		aClass120_478.notifyAll();
	    }
	    try {
		aThread480.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    aThread480 = null;
	}
    }
    
    public static void method172(int arg0, Class119_Sub1 arg1) {
	if (arg0 <= -26) {
	    for (int i = 0; (i ^ 0xffffffff) > (Class109.anIntArray2090.length
						^ 0xffffffff); i++)
		Class109.anIntArray2090[i] = 0;
	    anInt472++;
	    int i = 256;
	    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -5001; i_0_++) {
		int i_1_ = (int) (128.0 * Math.random() * (double) i);
		Class109.anIntArray2090[i_1_] = (int) (284.0 * Math.random());
	    }
	    for (int i_2_ = 0; i_2_ < 20; i_2_++) {
		for (int i_3_ = 1; i - 1 > i_3_; i_3_++) {
		    for (int i_4_ = 1; (i_4_ ^ 0xffffffff) > -128; i_4_++) {
			int i_5_ = (i_3_ << -2139526937) + i_4_;
			Class43.anIntArray897[i_5_]
			    = ((Class109.anIntArray2090[i_5_ + 1]
				+ (Class109.anIntArray2090[-1 + i_5_]
				   - -Class109.anIntArray2090[i_5_ - 128]
				   - -Class109.anIntArray2090[i_5_ - -128]))
			       / 4);
		    }
		}
		int[] is = Class109.anIntArray2090;
		Class109.anIntArray2090 = Class43.anIntArray897;
		Class43.anIntArray897 = is;
	    }
	    if (arg1 != null) {
		int i_6_ = 0;
		for (int i_7_ = 0; arg1.anInt2254 > i_7_; i_7_++) {
		    for (int i_8_ = 0;
			 (arg1.anInt2252 ^ 0xffffffff) < (i_8_ ^ 0xffffffff);
			 i_8_++) {
			if (arg1.aByteArray3410[i_6_++] != 0) {
			    int i_9_ = arg1.anInt2242 + i_8_ - -16;
			    int i_10_ = arg1.anInt2250 + (16 + i_7_);
			    int i_11_ = (i_10_ << -2048051609) + i_9_;
			    Class109.anIntArray2090[i_11_] = 0;
			}
		    }
		}
	    }
	}
    }
    
    public Class67_Sub5_Sub4_Sub2 method173(int arg0, int arg1, Class20 arg2) {
	anInt476++;
	Class67_Sub5_Sub4_Sub2 class67_sub5_sub4_sub2
	    = new Class67_Sub5_Sub4_Sub2();
	class67_sub5_sub4_sub2.anInt5126 = arg0;
	synchronized (aClass120_478) {
	    for (Class67_Sub5_Sub4_Sub2 class67_sub5_sub4_sub2_12_
		     = (Class67_Sub5_Sub4_Sub2) aClass120_478.method1656(104);
		 class67_sub5_sub4_sub2_12_ != null;
		 class67_sub5_sub4_sub2_12_
		     = ((Class67_Sub5_Sub4_Sub2)
			aClass120_478.method1668(true))) {
		if (class67_sub5_sub4_sub2_12_.aLong2863 == (long) arg1
		    && arg2 == class67_sub5_sub4_sub2_12_.aClass20_5129
		    && class67_sub5_sub4_sub2_12_.anInt5126 == 2) {
		    class67_sub5_sub4_sub2.aBoolean4506 = false;
		    class67_sub5_sub4_sub2.aByteArray5133
			= class67_sub5_sub4_sub2_12_.aByteArray5133;
		    return class67_sub5_sub4_sub2;
		}
	    }
	}
	class67_sub5_sub4_sub2.aByteArray5133 = arg2.method196(65280, arg1);
	class67_sub5_sub4_sub2.aBoolean4507 = true;
	class67_sub5_sub4_sub2.aBoolean4506 = false;
	return class67_sub5_sub4_sub2;
    }
    
    public static int method174(int arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6) {
	anInt473++;
	if ((arg4 & 0x1 ^ 0xffffffff) == -2) {
	    int i = arg5;
	    arg5 = arg3;
	    arg3 = i;
	}
	arg6 &= 0x3;
	if (arg0 != 0)
	    method174(57, 26, 94, -3, 122, 91, 45);
	if ((arg6 ^ 0xffffffff) == -1)
	    return arg2;
	if ((arg6 ^ 0xffffffff) == -2)
	    return arg1;
	if (arg6 == 2)
	    return 1 + (-arg5 + (-arg2 + 7));
	return 7 + -arg1 + (1 + -arg3);
    }
    
    public static void method175(int arg0) {
	aClass7_470 = null;
	aRSString_481 = null;
	if (arg0 != 1)
	    aSignLink_475 = null;
	aRSString_465 = null;
	aSignLink_475 = null;
    }
    
    public Class67_Sub5_Sub4_Sub2 method176(Class20 arg0, int arg1, int arg2) {
	anInt471++;
	Class67_Sub5_Sub4_Sub2 class67_sub5_sub4_sub2
	    = new Class67_Sub5_Sub4_Sub2();
	class67_sub5_sub4_sub2.aClass20_5129 = arg0;
	class67_sub5_sub4_sub2.aBoolean4507 = false;
	if (arg2 != 17427)
	    aRSString_481 = null;
	class67_sub5_sub4_sub2.aLong2863 = (long) arg1;
	class67_sub5_sub4_sub2.anInt5126 = 3;
	method177(arg2 ^ ~0x2186, class67_sub5_sub4_sub2);
	return class67_sub5_sub4_sub2;
    }
    
    public void method177(int arg0, Class67_Sub5_Sub4_Sub2 arg1) {
	synchronized (aClass120_478) {
	    aClass120_478.method1663(arg1, -225);
	    if (arg0 != -26006)
		return;
	    anInt482++;
	    aClass120_478.notifyAll();
	}
	anInt467++;
    }
    
    public void run() {
	anInt469++;
	while (!aBoolean479) {
	    Class67_Sub5_Sub4_Sub2 class67_sub5_sub4_sub2;
	    synchronized (aClass120_478) {
		class67_sub5_sub4_sub2
		    = ((Class67_Sub5_Sub4_Sub2)
		       aClass120_478.method1657((byte) -112));
		if (class67_sub5_sub4_sub2 != null)
		    anInt482--;
		else {
		    try {
			aClass120_478.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if ((class67_sub5_sub4_sub2.anInt5126 ^ 0xffffffff) == -3)
		    class67_sub5_sub4_sub2.aClass20_5129.method193
			(class67_sub5_sub4_sub2.aByteArray5133.length,
			 (int) class67_sub5_sub4_sub2.aLong2863,
			 class67_sub5_sub4_sub2.aByteArray5133, (byte) 57);
		else if (class67_sub5_sub4_sub2.anInt5126 == 3)
		    class67_sub5_sub4_sub2.aByteArray5133
			= (class67_sub5_sub4_sub2.aClass20_5129.method196
			   (65280, (int) class67_sub5_sub4_sub2.aLong2863));
	    } catch (Exception exception) {
		Class104.method1563(exception, null, 1);
	    }
	    class67_sub5_sub4_sub2.aBoolean4506 = false;
	}
    }
    
    public Class67_Sub5_Sub4_Sub2 method178(int arg0, Class20 arg1, int arg2,
					    byte[] arg3) {
	try {
	    anInt468++;
	    Class67_Sub5_Sub4_Sub2 class67_sub5_sub4_sub2
		= new Class67_Sub5_Sub4_Sub2();
	    if (arg2 != -2127)
		return null;
	    class67_sub5_sub4_sub2.aBoolean4507 = false;
	    class67_sub5_sub4_sub2.aClass20_5129 = arg1;
	    class67_sub5_sub4_sub2.aLong2863 = (long) arg0;
	    class67_sub5_sub4_sub2.anInt5126 = 2;
	    class67_sub5_sub4_sub2.aByteArray5133 = arg3;
	    method177(-26006, class67_sub5_sub4_sub2);
	    return class67_sub5_sub4_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ca.E(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class16() {
	Class31 class31 = Class124.aSignLink_2335.method404(2, this, 5);
	while ((class31.anInt706 ^ 0xffffffff) == -1)
	    Class67_Sub1_Sub23.method726(-122, 10L);
	if (class31.anInt706 == 2)
	    throw new RuntimeException();
	aThread480 = (Thread) class31.anObject705;
    }
    
    static {
	anInt464 = 0;
	aClass7_470 = null;
	aRSString_481
	    = Class134.method1914("Chargement des sprites )2 ", (byte) 84);
    }
}
