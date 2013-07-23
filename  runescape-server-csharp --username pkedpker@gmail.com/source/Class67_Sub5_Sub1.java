/* Class67_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub1 extends Class67_Sub5
{
    public static int anInt4449;
    public Class92 aClass92_4450;
    public static int anInt4451;
    public static RSString aRSString_4452;
    public static RSString aRSString_4453;
    public static int anInt4454;
    public static int anInt4455;
    public static int anInt4456;
    public static int lastPacketSize = 0;
    public static byte[][][] aByteArrayArrayArray4458;
    public static RSString aRSString_4459;
    public static int anInt4460;
    public static int anInt4461;
    public static int anInt4462;
    public static int anInt4463;
    public static RSString aRSString_4464;
    
    public void method823(Stream arg0, byte arg1, int arg2) {
	anInt4462++;
	if (arg2 == 249) {
	    int i = arg0.readByte((byte) -127);
	    if (aClass92_4450 == null) {
		int i_0_ = Class67_Sub1_Sub31.method765(118, i);
		aClass92_4450 = new Class92(i_0_);
	    }
	    for (int i_1_ = 0; (i ^ 0xffffffff) < (i_1_ ^ 0xffffffff);
		 i_1_++) {
		boolean bool = (arg0.readByte((byte) 88) ^ 0xffffffff) == -2;
		int i_2_ = arg0.readThreeBytes(65280);
		Class67 class67;
		if (bool)
		    class67 = new Class67_Sub29(arg0.readRSString(-1));
		else
		    class67 = new Class67_Sub19(arg0.readInt((byte) 125));
		aClass92_4450.method1488((byte) -89, class67, (long) i_2_);
	    }
	}
	if (arg1 > -36)
	    aRSString_4459 = null;
    }
    
    public static Class87 method824(boolean arg0, int arg1) {
	Class87 class87 = ((Class87) Class131_Sub4.aClass136_3639.method1924((long) arg1, arg0));
	anInt4449++;
	if (class87 != null)
	    return class87;
	byte[] is = Class67_Sub1_Sub27.aClass9_4242.method138(-809612665, arg1, 32);
	class87 = new Class87();
	if (is != null)
	    class87.method1463(new Stream(is), 0);
	class87.method1460((byte) -44);
	Class131_Sub4.aClass136_3639.method1926((long) arg1, class87,(byte) -71);
	return class87;
    }
    
    public void method825(int arg0, Stream arg1) {
	if (arg0 != -1)
	    aRSString_4452 = null;
	anInt4451++;
	for (;;) {
	    int i = arg1.readByte((byte) -121);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method823(arg1, (byte) -126, i);
	}
    }
    
    public int method826(int arg0, int arg1, int arg2) {
	anInt4456++;
	if (aClass92_4450 == null)
	    return arg1;
	if (arg0 != 0)
	    method823(null, (byte) -62, -42);
	Class67_Sub19 class67_sub19
	    = ((Class67_Sub19)
	       aClass92_4450.method1489((byte) -82, (long) arg2));
	if (class67_sub19 == null)
	    return arg1;
	return class67_sub19.anInt3149;
    }
    
    public static void method827(Class73 arg0, int arg1, byte arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	long l = 0L;
	if ((arg6 ^ 0xffffffff) == -1)
	    l = Class73.method1360(arg4, arg1, arg5);
	else if (arg6 != 1) {
	    if (arg6 != 2) {
		if ((arg6 ^ 0xffffffff) == -4)
		    l = Class27.method253(arg4, arg1, arg5);
	    } else
		l = Class63.method567(arg4, arg1, arg5);
	} else
	    l = Class50.method444(arg4, arg1, arg5);
	anInt4455++;
	if (arg2 != 36)
	    lastPacketSize = 36;
	boolean bool = false;
	boolean bool_3_ = false;
	int i = ((int) l & 0x333eca) >> -1942751788;
	int i_4_ = -1;
	i_4_ = (int) (l >>> 2086022688) & 0x7fffffff;
	Class65 class65 = Class73.method1359(11525, i_4_);
	int i_5_ = ((int) l & 0x7f451) >> -1645022034;
	if (class65.method582((byte) -95))
	    Class44.method393(arg4, arg5, -75, arg1, class65);
	if (l != 0L) {
	    if ((arg6 ^ 0xffffffff) == -1) {
		Class58 class58
		    = Class67_Sub1_Sub38.method802(arg4, arg1, arg5);
		if (class65.anInt1308 != 0)
		    arg0.method1353(arg5, arg2 + -37, arg1, i_5_, i,
				    class65.aBoolean1278);
	    } else if (arg6 == 1) {
		Class94 class94 = Login.method1422(arg4, arg1, arg5);
	    } else if (arg6 != 2) {
		if (arg6 == 3) {
		    Class104 class104
			= Class55_Sub2_Sub1.method471(arg4, arg1, arg5);
		    if (class65.anInt1308 == 1)
			arg0.method1365(arg5, -95, arg1);
		}
	    } else {
		Class36 class36 = Class33_Sub2.method301(arg4, arg1, arg5);
		if ((class65.anInt1308 ^ 0xffffffff) != -1
		    && (class65.anInt1297 + arg1 ^ 0xffffffff) > -105
		    && (arg5 - -class65.anInt1297 ^ 0xffffffff) > -105
		    && class65.anInt1264 + arg1 < 104
		    && (arg5 - -class65.anInt1264 ^ 0xffffffff) > -105)
		    arg0.method1366(class65.aBoolean1278, (byte) -61, arg5,
				    class65.anInt1297, arg1, class65.anInt1264,
				    i);
	    }
	}
    }
    
    public static void method828(byte arg0, int arg1, int arg2) {
	anInt4461++;
	Class70_Sub1.outStream.createFrame(arg0 ^ 0x5e, 132);	//ACTIONBUTTON3
	Class67_Sub1_Sub3.anInt3842++;
	Class70_Sub1.outStream.addInt1(arg2, 122);
	if (arg0 != 92)
	    aRSString_4464 = null;
	Class70_Sub1.outStream.addLEShort(arg1,
							arg0 ^ 0x5fe5f00c);
    }
    
    public RSString method829(byte arg0, int arg1, RSString arg2) {
	anInt4454++;
	if (aClass92_4450 == null)
	    return arg2;
	if (arg0 != -122)
	    method826(-128, -99, 7);
	Class67_Sub29 class67_sub29
	    = ((Class67_Sub29)
	       aClass92_4450.method1489((byte) -59, (long) arg1));
	if (class67_sub29 == null)
	    return arg2;
	return class67_sub29.musicName;
    }
    
    public static void method830(int arg0, int arg1, int arg2) {
	int i = -120 % ((60 - arg0) / 62);
	anInt4460++;
	if (Class67_Sub1_Sub29.anInt4259 != 0 && (arg1 ^ 0xffffffff) != 0) {
	    Class102.method1546(0, false, arg1, Stream.aClass9_2908,
				Class67_Sub1_Sub29.anInt4259, (byte) 99);
	    Class57.aBoolean1106 = true;
	}
    }
    
    public static void method831(int arg0) {
	aRSString_4452 = null;
	aByteArrayArrayArray4458 = null;
	aRSString_4464 = null;
	aRSString_4453 = null;
	if (arg0 > -86)
	    method830(104, 88, -36);
	aRSString_4459 = null;
    }
    
    static {
	aRSString_4452 = Class134.method1914(" x ", (byte) 114);
	aRSString_4464 = Class134.method1914("white:", (byte) 5);
	aRSString_4453 = aRSString_4464;
	anInt4463 = 0;
	aRSString_4459 = aRSString_4464;
    }
}
