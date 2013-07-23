public class Class126_Sub4 extends Class126
{
    public static float aFloat3456;
    public int anInt3457;
    public static int anInt3458;
    public static int anInt3459;
    public static int anInt3460;
    public int anInt3461;
    public static int anInt3462;
    public static int anInt3463;
    public static Class50 aClass50_3464;
    public static boolean[] aBooleanArray3465
	= { true, true, true, true, true, true, true, true, true, true, true,
	    true, true, true, true, true, true, true, true, true, true, true,
	    true, true, false };
    public int anInt3466;
    public static int anInt3467;
    public int anInt3468;
    public static int anInt3469;
    public static RSString aRSString_3470
	= Class134.method1914(")1a2)1m", (byte) 81);
    public static RSString aRSString_3471;
    public static RSString aRSString_3472;
    public static int anInt3473;
    
    public void method1710(int arg0, int arg1, byte arg2) {
	int i = arg1 * anInt3468 >> -1133211668;
	anInt3469++;
	int i_0_ = anInt3466 * arg1 >> 921768108;
	int i_1_ = arg0 * anInt3457 >> -1932654356;
	if (arg2 != -67)
	    aBooleanArray3465 = null;
	int i_2_ = anInt3461 * arg0 >> 277916460;
	Class56.method487(i, i_2_, i_1_, -123, anInt2351, anInt2355, anInt2358,
			  i_0_);
    }
    
    public static int method1721(int arg0, boolean arg1) {
	anInt3462++;
	long l = Class39.method337(arg0 ^ ~0x3631);
	if (arg0 != -31374)
	    aRSString_3470 = null;
	for (Class67_Sub28 class67_sub28
		 = (!arg1 ? (Class67_Sub28) Class25.aClass92_599.method1480(11)
		    : ((Class67_Sub28)
		       Class25.aClass92_599.method1483((byte) 67)));
	     class67_sub28 != null;
	     class67_sub28
		 = (Class67_Sub28) Class25.aClass92_599.method1480(11)) {
	    if ((l ^ 0xffffffffffffffffL)
		< (0x3fffffffffffffffL & class67_sub28.aLong3326
		   ^ 0xffffffffffffffffL)) {
		if ((0x4000000000000000L & class67_sub28.aLong3326
		     ^ 0xffffffffffffffffL)
		    != -1L) {
		    int i = (int) class67_sub28.aLong1344;
		    Class137.anIntArray2504[i] = Class96.anIntArray1914[i];
		    class67_sub28.method606((byte) -118);
		    return i;
		}
		class67_sub28.method606((byte) -118);
	    }
	}
	return -1;
    }
    
    public void method1708(byte arg0, int arg1, int arg2) {
	anInt3463++;
	int i = anInt3468 * arg1 >> 257891948;
	if (arg0 != -36)
	    aRSString_3471 = null;
	int i_3_ = arg2 * anInt3457 >> -1625638228;
	int i_4_ = anInt3466 * arg1 >> -2108042452;
	int i_5_ = anInt3461 * arg2 >> 1698844652;
	Class67_Sub20.method1269(i_5_, i_3_, i, false, anInt2358, i_4_);
    }
    
    public static void method1722(boolean arg0, Class131_Sub7_Sub2 arg1) {
	if (arg0 == false) {
	    anInt3467++;
	    Class67_Sub10 class67_sub10 = ((Class67_Sub10)(Class67_Sub12.aClass92_3036.method1489((byte) -95, arg1.playerName.method501((byte) -16))));
	    if (class67_sub10 != null) {
		if (class67_sub10.aClass67_Sub11_Sub3_2994 != null) {
		    Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145.method1133(class67_sub10.aClass67_Sub11_Sub3_2994);
		    class67_sub10.aClass67_Sub11_Sub3_2994 = null;
		}
		class67_sub10.method606((byte) -118);
	    }
	}
    }
    
    public Class126_Sub4(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6) {
	super(arg4, arg5, arg6);
	anInt3461 = arg3;
	anInt3468 = arg0;
	anInt3457 = arg1;
	anInt3466 = arg2;
    }
    
    public static Class67_Sub5_Sub8 method1723(int arg0, byte arg1) {
	Class67_Sub5_Sub8 class67_sub5_sub8
	    = ((Class67_Sub5_Sub8)
	       Class67_Sub26.aClass137_3265.method1930(261775, (long) arg0));
	anInt3473++;
	if (class67_sub5_sub8 != null)
	    return class67_sub5_sub8;
	byte[] is
	    = Class4.aClass9_129.method138(-809612665,
					   Class66.method601(arg0, 86),
					   Class67_Sub5_Sub12.method953(-1,
									arg0));
	class67_sub5_sub8 = new Class67_Sub5_Sub8();
	if (arg1 > -111)
	    return null;
	if (is != null)
	    class67_sub5_sub8.method885(new Stream(is), 82);
	Class67_Sub26.aClass137_3265.method1932((long) arg0, 0,
						class67_sub5_sub8);
	return class67_sub5_sub8;
    }
    
    public void method1712(byte arg0, int arg1, int arg2) {
	if (arg0 <= -39)
	    anInt3458++;
    }
    
    public static void method1724(byte arg0) {
	aRSString_3471 = null;
	aRSString_3472 = null;
	aRSString_3470 = null;
	aClass50_3464 = null;
	if (arg0 >= -87)
	    method1724((byte) 121);
	aBooleanArray3465 = null;
    }
    
    static {
	aClass50_3464 = new Class50();
	aRSString_3471 = Class134.method1914("Loaded sprites", (byte) 67);
	aRSString_3472 = aRSString_3471;
    }
}
