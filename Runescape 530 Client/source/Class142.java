public class Class142
{
    public static int anInt2562;
    public static int anInt2563;
    public static int anInt2564;
    public static int anInt2565;
    public static int anInt2566;
    public static int anInt2567;
    public static int anInt2568;
    public Class16 aClass16_2569;
    public static int anInt2570;
    public Class129_Sub1[] aClass129_Sub1Array2571;
    public static int anInt2572;
    public Class67_Sub5_Sub4_Sub1 aClass67_Sub5_Sub4_Sub1_2573;
    public static RSString aRSString_2574
	= (Class134.method1914
	   ("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3",
	    (byte) 66));
    public Stream aStream_2575;
    public Class40 aClass40_2576;
    
    public Class129_Sub1 method1950(boolean arg0, int arg1, Class20 arg2,
				    Class20 arg3) {
	try {
	    anInt2566++;
	    if (arg0 != false)
		method1955(-107);
	    return method1957(arg2, arg3, 8, arg1, true);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("wi.E(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1951(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	anInt2564++;
	Class70_Sub1.outStream.currentOffset = 0;
	Class70_Sub1.outStream.addByte((byte) 4, 147);
	Class70_Sub1.outStream.addByte((byte) 4, arg3);
	Class70_Sub1.outStream.addByte((byte) 4, arg0);
	Class70_Sub1.outStream.addUShort(16711680, arg2);
	Class70_Sub1.outStream.addUShort(arg4 ^ 0xff0009, arg1);
	Class33_Sub2.anInt2774 = 0;
	Class91.anInt1857 = -3;
	Class67_Sub26.anInt3277 = 1;
	Class67_Sub1_Sub6.anInt3886 = 0;
	if (arg4 != 9)
	    aRSString_2574 = null;
    }
    
    public static void method1952(int arg0, int arg1) {
	anInt2563++;
	Class67_Sub1_Sub11.method666(1);
	if (arg1 >= -27)
	    anInt2570 = -24;
	Class67_Sub1_Sub39.method811(17819);
	int i = Class99_Sub1.method1525(arg0, 16).anInt408;
	if ((i ^ 0xffffffff) != -1) {
	    int i_0_ = Class137.anIntArray2504[arg0];
	    if (i == 6)
		Class63.anInt1170 = i_0_;
	    if ((i ^ 0xffffffff) == -6)
		Class23.anInt569 = i_0_;
	    if (i == 9)
		Class67_Sub6.anInt2868 = i_0_;
	}
    }
    
    public void method1953(boolean arg0) {
	anInt2567++;
	if (aClass129_Sub1Array2571 != null) {
	    if (arg0 != true)
		method1957(null, null, 47, 80, false);
	    for (int i = 0; i < aClass129_Sub1Array2571.length; i++) {
		if (aClass129_Sub1Array2571[i] != null)
		    aClass129_Sub1Array2571[i].method1756((byte) 71);
	    }
	    for (int i = 0; aClass129_Sub1Array2571.length > i; i++) {
		if (aClass129_Sub1Array2571[i] != null)
		    aClass129_Sub1Array2571[i].method1751(29373);
	    }
	}
    }
    
    public static void method1954(int arg0) {
	Class141.aFontMetrics2554 = null;
	anInt2568++;
	Class21.anImage519 = null;
	if (arg0 != 255)
	    method1958(-11);
	Class143.aFont2582 = null;
    }
    
    public boolean method1955(int arg0) {
	anInt2562++;
	if (aStream_2575 != null)
	    return true;
	if (aClass67_Sub5_Sub4_Sub1_2573 == null) {
	    if (aClass40_2576.method345((byte) 51))
		return false;
	    aClass67_Sub5_Sub4_Sub1_2573
		= aClass40_2576.method349((byte) 0, 255, 255, (byte) -84,
					  true);
	}
	if (aClass67_Sub5_Sub4_Sub1_2573.aBoolean4506)
	    return false;
	aStream_2575 = new Stream(aClass67_Sub5_Sub4_Sub1_2573
						  .method853(arg0 ^ arg0));
	aClass129_Sub1Array2571
	    = (new Class129_Sub1
	       [(aStream_2575.buffer.length + -5) / 8]);
	return true;
    }
    
    public static void method1956(int arg0) {
	if (arg0 != 5430)
	    anInt2570 = 12;
	aRSString_2574 = null;
    }
    
    public Class129_Sub1 method1957(Class20 arg0, Class20 arg1, int arg2,
				    int arg3, boolean arg4) {
	try {
	    anInt2565++;
	    if (aStream_2575 == null)
		throw new RuntimeException();
	    aStream_2575.currentOffset = 5 + arg3 * arg2;
	    if ((aStream_2575.buffer.length ^ 0xffffffff)
		>= (aStream_2575.currentOffset ^ 0xffffffff))
		throw new RuntimeException();
	    if (aClass129_Sub1Array2571[arg3] != null)
		return aClass129_Sub1Array2571[arg3];
	    int i = aStream_2575.readInt((byte) 127);
	    int i_1_ = aStream_2575.readInt((byte) 126);
	    Class129_Sub1 class129_sub1
		= new Class129_Sub1(arg3, arg1, arg0, aClass40_2576,
				    aClass16_2569, i, i_1_, arg4);
	    aClass129_Sub1Array2571[arg3] = class129_sub1;
	    return class129_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("wi.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public static void method1958(int arg0) {
	anInt2572++;
	if (Class67_Sub1_Sub21.loginStep == 5) {
	    Class67_Sub1_Sub21.loginStep = 6;
	    int i = 103 % ((arg0 - -44) / 56);
	}
    }
    
    public Class142(Class40 arg0, Class16 arg1) {
	do {
	    try {
		aClass16_2569 = arg1;
		aClass40_2576 = arg0;
		if (aClass40_2576.method345((byte) 102))
		    break;
		aClass67_Sub5_Sub4_Sub1_2573
		    = aClass40_2576.method349((byte) 0, 255, 255, (byte) -27,
					      true);
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   ("wi.<init>("
						    + (arg0 != null ? "{...}"
						       : "null")
						    + ','
						    + (arg1 != null ? "{...}"
						       : "null")
						    + ')'));
	    }
	    break;
	} while (false);
    }
}
