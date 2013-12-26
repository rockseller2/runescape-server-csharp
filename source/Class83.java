/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class83
{
    public static int anInt1670;
    public Class9 aClass9_1671;
    public static Class68[] aClass68Array1672;
    public static int[] anIntArray1673 = new int[5];
    public static int anInt1674;
    public static int anInt1675;
    public static Class9 aClass9_1676;
    public Class9 aClass9_1677;
    public Class92 aClass92_1678 = new Class92(256);
    public static Class131_Sub2[] aClass131_Sub2Array1679
	= new Class131_Sub2[4];
    public static int anInt1680;
    public static Stream aStream_1681;
    public static int[] anIntArray1682 = new int[25];
    public static int anInt1683;
    public static int anInt1684;
    public static int anInt1685;
    public static int anInt1686;
    public static Class67_Sub5_Sub19[] aClass67_Sub5_Sub19Array1687;
    public static RSString aRSString_1688
	= Class134.method1914("Ladevorgang )2 bitte warten Sie)3", (byte) 95);
    public Class92 aClass92_1689 = new Class92(256);
    public static int anInt1690;
    
    public Class67_Sub13_Sub1 method1435(int arg0, int[] arg1, int arg2) {
	anInt1675++;
	if (aClass9_1677.method107(arg2 ^ 0x5331) == arg2)
	    return method1438(arg1, 0, arg0, (byte) 110);
	if (aClass9_1677.method135(arg0, -95) == 1)
	    return method1438(arg1, arg0, 0, (byte) 76);
	throw new RuntimeException();
    }
    
    public static void method1436(int arg0, byte arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	anInt1690++;
	if (OutputStream_Sub1.anInt87 >= arg3
	    && (Class55_Sub2.anInt2801 ^ 0xffffffff) >= (arg4 ^ 0xffffffff)) {
	    boolean bool;
	    if ((Class139.anInt2533 ^ 0xffffffff) >= (arg2 ^ 0xffffffff)) {
		if (arg2 > Class126_Sub1.anInt3423) {
		    arg2 = Class126_Sub1.anInt3423;
		    bool = false;
		} else
		    bool = true;
	    } else {
		arg2 = Class139.anInt2533;
		bool = false;
	    }
	    boolean bool_0_;
	    if (arg0 >= Class139.anInt2533) {
		if ((arg0 ^ 0xffffffff)
		    >= (Class126_Sub1.anInt3423 ^ 0xffffffff))
		    bool_0_ = true;
		else {
		    bool_0_ = false;
		    arg0 = Class126_Sub1.anInt3423;
		}
	    } else {
		arg0 = Class139.anInt2533;
		bool_0_ = false;
	    }
	    if ((arg3 ^ 0xffffffff) <= (Class55_Sub2.anInt2801 ^ 0xffffffff))
		Class67_Sub1_Sub11.method665(2, arg2,
					     (Class67_Sub29.anIntArrayArray3338
					      [arg3++]),
					     arg0, arg5);
	    else
		arg3 = Class55_Sub2.anInt2801;
	    if (arg4 <= OutputStream_Sub1.anInt87)
		Class67_Sub1_Sub11.method665(2, arg2,
					     (Class67_Sub29.anIntArrayArray3338
					      [arg4--]),
					     arg0, arg5);
	    else
		arg4 = OutputStream_Sub1.anInt87;
	    if (!bool || !bool_0_) {
		if (bool) {
		    for (int i = arg3; i <= arg4; i++)
			Class67_Sub29.anIntArrayArray3338[i][arg2] = arg5;
		} else if (bool_0_) {
		    for (int i = arg3; i <= arg4; i++)
			Class67_Sub29.anIntArrayArray3338[i][arg0] = arg5;
		}
	    } else {
		for (int i = arg3; arg4 >= i; i++) {
		    int[] is = Class67_Sub29.anIntArrayArray3338[i];
		    is[arg2] = is[arg0] = arg5;
		}
	    }
	}
	if (arg1 != -113)
	    aRSString_1688 = null;
    }
    
    public static Class67_Sub1 method1437(Stream arg0, int arg1) {
	anInt1685++;
	if (arg1 != 2790)
	    return null;
	arg0.readByte((byte) 98);
	int i = arg0.readByte((byte) -6);
	Class67_Sub1 class67_sub1
	    = Class67_Sub1_Sub16.method689(arg1 ^ ~0xa96, i);
	class67_sub1.anInt2838 = arg0.readByte((byte) -48);
	int i_1_ = arg0.readByte((byte) -113);
	for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
	    int i_3_ = arg0.readByte((byte) 79);
	    class67_sub1.method623(arg0, true, i_3_);
	}
	class67_sub1.method618(-122);
	return class67_sub1;
    }
    
    public Class67_Sub13_Sub1 method1438(int[] arg0, int arg1, int arg2,
					 byte arg3) {
	int i = 120 % ((32 - arg3) / 33);
	anInt1670++;
	int i_4_ = (arg1 >>> 1207855020 | 0xfff1 & arg1 << 1563644292) ^ arg2;
	i_4_ |= arg1 << -1813028080;
	long l = (long) i_4_;
	Class67_Sub13_Sub1 class67_sub13_sub1
	    = (Class67_Sub13_Sub1) aClass92_1689.method1489((byte) -75, l);
	if (class67_sub13_sub1 != null)
	    return class67_sub13_sub1;
	if (arg0 != null && arg0[0] <= 0)
	    return null;
	Class135 class135 = Class135.method1918(aClass9_1677, arg1, arg2);
	if (class135 == null)
	    return null;
	class67_sub13_sub1 = class135.method1916();
	aClass92_1689.method1488((byte) -89, class67_sub13_sub1, l);
	if (arg0 != null)
	    arg0[0] -= class67_sub13_sub1.aByteArray4956.length;
	return class67_sub13_sub1;
    }
    
    public static void method1439(byte arg0) {
	Class136.aClass67_Sub11_Sub4_2485.method1188(-123);
	anInt1686++;
	Class67_Sub11_Sub4.anInt4888 = 1;
	int i = 76 % ((arg0 - 7) / 51);
	Class67_Sub1_Sub18.aClass9_4111 = null;
    }
    
    public static void method1440(int arg0, int arg1) {
	Class67_Sub1_Sub25.aClass136_4224.method1920(arg1, 84);
	Class67_Sub5_Sub9.aClass136_4612.method1920(arg1, 106);
	anInt1674++;
	if (arg0 != 29469)
	    aClass9_1676 = null;
    }
    
    public Class67_Sub13_Sub1 method1441(int arg0, byte arg1, int[] arg2,
					 int arg3) {
	if (arg1 != 39)
	    aClass9_1676 = null;
	int i = arg3 ^ (arg0 << 560115236 & 0xfff7 | arg0 >>> -1374283412);
	i |= arg0 << -619193168;
	long l = 0x100000000L ^ (long) i;
	anInt1680++;
	Class67_Sub13_Sub1 class67_sub13_sub1
	    = (Class67_Sub13_Sub1) aClass92_1689.method1489((byte) -53, l);
	if (class67_sub13_sub1 != null)
	    return class67_sub13_sub1;
	if (arg2 != null && arg2[0] <= 0)
	    return null;
	Class67_Sub18 class67_sub18
	    = (Class67_Sub18) aClass92_1678.method1489((byte) -104, l);
	if (class67_sub18 == null) {
	    class67_sub18 = Class67_Sub18.method1258(aClass9_1671, arg0, arg3);
	    if (class67_sub18 == null)
		return null;
	    aClass92_1678.method1488((byte) -89, class67_sub18, l);
	}
	class67_sub13_sub1 = class67_sub18.method1254(arg2);
	if (class67_sub13_sub1 == null)
	    return null;
	class67_sub18.method606((byte) -118);
	aClass92_1689.method1488((byte) -89, class67_sub13_sub1, l);
	return class67_sub13_sub1;
    }
    
    public static boolean method1442(int arg0, byte[] arg1, int arg2,
				     int arg3) {
	if (arg2 != 6685)
	    aClass67_Sub5_Sub19Array1687 = null;
	boolean bool = true;
	anInt1683++;
	int i = -1;
	Stream Stream = new Stream(arg1);
	for (;;) {
	    int i_5_ = Stream.method1082((byte) -73);
	    if ((i_5_ ^ 0xffffffff) == -1)
		break;
	    int i_6_ = 0;
	    boolean bool_7_ = false;
	    i += i_5_;
	    for (;;) {
		if (bool_7_) {
		    int i_8_ = Stream.method1070(arg2 + -6783);
		    if ((i_8_ ^ 0xffffffff) == -1)
			break;
		    Stream.readByte((byte) -73);
		} else {
		    int i_9_ = Stream.method1070(-69);
		    if ((i_9_ ^ 0xffffffff) == -1)
			break;
		    i_6_ += -1 + i_9_;
		    int i_10_ = 0x3f & i_6_;
		    int i_11_ = (i_6_ & 0xfdc) >> 439462022;
		    int i_12_
			= Stream.readByte((byte) 100) >> 251229154;
		    int i_13_ = i_11_ + arg0;
		    int i_14_ = arg3 + i_10_;
		    if (i_13_ > 0 && (i_14_ ^ 0xffffffff) < -1 && i_13_ < 103
			&& i_14_ < 103) {
			Class65 class65 = Class73.method1359(11525, i);
			if (i_12_ != 22 || InputStream_Sub1.aBoolean77
			    || class65.anInt1283 != 0
			    || (class65.anInt1308 ^ 0xffffffff) == -2
			    || class65.aBoolean1256) {
			    bool_7_ = true;
			    if (!class65.method588((byte) -20)) {
				Class67_Sub21.anInt3174++;
				bool = false;
			    }
			}
		    }
		}
	    }
	}
	return bool;
    }
    
    public Class67_Sub13_Sub1 method1443(int arg0, int arg1, int[] arg2) {
	anInt1684++;
	if ((aClass9_1671.method107(21296) ^ 0xffffffff) == -2)
	    return method1441(0, (byte) 39, arg2, arg0);
	if (aClass9_1671.method135(arg0, 19) == 1)
	    return method1441(arg0, (byte) 39, arg2, 0);
	if (arg1 <= 8)
	    method1436(-9, (byte) 9, 65, -105, -15, 32);
	throw new RuntimeException();
    }
    
    public static void method1444(byte arg0) {
	aRSString_1688 = null;
	if (arg0 != -38)
	    method1439((byte) -102);
	aClass68Array1672 = null;
	anIntArray1682 = null;
	anIntArray1673 = null;
	aStream_1681 = null;
	aClass131_Sub2Array1679 = null;
	aClass9_1676 = null;
	aClass67_Sub5_Sub19Array1687 = null;
    }
    
    public Class83(Class9 arg0, Class9 arg1) {
	try {
	    aClass9_1677 = arg0;
	    aClass9_1671 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ll.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aStream_1681 = new Stream(new byte[5000]);
    }
}
