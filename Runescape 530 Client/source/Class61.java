/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61
{
    public static int anInt1133;
    public static int anInt1134;
    public static int[] anIntArray1135 = new int[32];
    public static int anInt1136;
    public static int[] anIntArray1137;
    public static int anInt1138;
    public static int anInt1139;
    public static int anInt1140;
    public static Class136 aClass136_1141;
    public static int[] anIntArray1142 = new int[2048];
    public static int anInt1143;
    public static int anInt1144;
    public static int anInt1145;
    public static RSString aRSString_1146;
    public static RSString aRSString_1147;
    
    public static void method548(int arg0) {
	if (arg0 > 110) {
	    aClass136_1141 = null;
	    aRSString_1146 = null;
	    anIntArray1135 = null;
	    anIntArray1137 = null;
	    anIntArray1142 = null;
	    aRSString_1147 = null;
	}
    }
    
    public static RSString method549(int arg0, int arg1) {
	anInt1139++;
	if ((arg1 ^ 0xffffffff) > -100001)
	    return Class67_Sub1_Sub27.method744((new RSString[]
						 { Class67_Sub23.aRSString_3207,
						   InputStream_Sub1
						       .method47(arg1, true),
						   Class114.aRSString_2159 }),
						-125);
	int i = -22 / ((arg0 - 34) / 55);
	if (arg1 < 10000000)
	    return (Class67_Sub1_Sub27.method744
		    ((new RSString[]
		      { Class129.aRSString_2402,
			InputStream_Sub1.method47(arg1 / 1000, true),
			Class67_Sub3.aRSString_2854, Class114.aRSString_2159 }),
		     -96));
	return (Class67_Sub1_Sub27.method744
		((new RSString[]
		  { Class67_Sub10.aRSString_3021,
		    InputStream_Sub1.method47(arg1 / 1000000, true),
		    Class67_Sub28.aRSString_3322, Class114.aRSString_2159 }),
		 -94));
    }
    
    public static void method550(int arg0, Class7 arg1, int arg2, byte arg3) {
	anInt1140++;
	if ((Class134.anInt2476 >= 2 || Login.anInt1612 != 0
	     || Class67_Sub20.aBoolean3156)
	    && arg3 > 106) {
	    RSString RSString = Class111.method1594(2);
	    if (arg1 != null) {
		Class67_Sub5_Sub10 class67_sub5_sub10
		    = arg1.method100(Class5.aClass119Array143, (byte) 97);
		if (class67_sub5_sub10 == null)
		    class67_sub5_sub10 = Class130.aClass67_Sub5_Sub10_2404;
		class67_sub5_sub10.method919(RSString, arg0, arg2,
					     arg1.anInt189, arg1.anInt194,
					     arg1.anInt279, arg1.anInt294,
					     arg1.anInt214, arg1.anInt248,
					     Class14.aRandom446,
					     Class67_Sub5.anInt2860,
					     Class37.anIntArray797);
		Class132.method1903(Class37.anIntArray797[3],
				    Class37.anIntArray797[0],
				    Class37.anIntArray797[2], 0,
				    Class37.anIntArray797[1]);
	    } else {
		int i = (Class130.aClass67_Sub5_Sub10_2404.method914
			 (RSString, 4 + arg0, 15 + arg2, 16777215, 0,
			  Class14.aRandom446, Class67_Sub5.anInt2860));
		Class132.method1903(15, arg0 + 4,
				    i + Class130.aClass67_Sub5_Sub10_2404
					    .method913(RSString),
				    0, arg2);
	    }
	}
    }
    
    public static void method551(int arg0, int arg1, int arg2, Class7 arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	if (Class7.aBoolean231)
	    Class67_Sub1_Sub7.anInt3913 = 32;
	else
	    Class67_Sub1_Sub7.anInt3913 = 0;
	anInt1138++;
	Class7.aBoolean231 = false;
	int i = 103 % ((56 - arg2) / 47);
	if (Class16.anInt464 != 0) {
	    if ((arg6 ^ 0xffffffff) >= (arg5 ^ 0xffffffff) && 16 + arg6 > arg5
		&& (arg0 ^ 0xffffffff) <= (arg4 ^ 0xffffffff)
		&& 16 + arg4 > arg0) {
		arg3.anInt291 -= 4;
		Class37.method326(arg3, 110);
	    } else if ((arg5 ^ 0xffffffff) <= (arg6 ^ 0xffffffff)
		       && (16 + arg6 ^ 0xffffffff) < (arg5 ^ 0xffffffff)
		       && (arg4 + (arg7 - 16) ^ 0xffffffff) >= (arg0
								^ 0xffffffff)
		       && arg7 + arg4 > arg0) {
		arg3.anInt291 += 4;
		Class37.method326(arg3, 113);
	    } else if (arg5 >= arg6 + -Class67_Sub1_Sub7.anInt3913
		       && 16 + arg6 + Class67_Sub1_Sub7.anInt3913 > arg5
		       && (arg0 ^ 0xffffffff) <= (arg4 + 16 ^ 0xffffffff)
		       && arg0 < arg7 + arg4 - 16) {
		int i_0_ = arg7 * (-32 + arg7) / arg1;
		if (i_0_ < 8)
		    i_0_ = 8;
		int i_1_ = -32 + arg7 - i_0_;
		int i_2_ = -(i_0_ / 2) + (-16 + -arg4 + arg0);
		arg3.anInt291 = (arg1 - arg7) * i_2_ / i_1_;
		Class37.method326(arg3, 122);
		Class7.aBoolean231 = true;
	    }
	}
	if (Class74.anInt1493 != 0) {
	    int i_3_ = arg3.anInt189;
	    if (-i_3_ + arg6 <= arg5 && arg4 <= arg0
		&& (arg5 ^ 0xffffffff) > (16 + arg6 ^ 0xffffffff)
		&& arg7 + arg4 >= arg0) {
		arg3.anInt291 += 45 * Class74.anInt1493;
		Class37.method326(arg3, 88);
	    }
	}
    }
    
    public static Class70_Sub1 method552(int arg0, int arg1) {
	if (arg1 > -10)
	    method553(30);
	anInt1133++;
	if (!Class67_Sub1_Sub27.aBoolean4238
	    || (arg0 ^ 0xffffffff) > (Class102.anInt2003 ^ 0xffffffff)
	    || Class28.anInt645 < arg0)
	    return null;
	return Class96.aClass70_Sub1Array1920[arg0 - Class102.anInt2003];
    }
    
    public static void method553(int arg0) {
	Class76.anInt1548 = -1;
	Class67_Sub1_Sub28.aBoolean4257 = false;
	anInt1136++;
	Class125.anInt2339 = 0;
	Class28.anInt652 = -3;
	Class67_Sub1_Sub18.anInt4113 = 0;
	Class67_Sub1_Sub21.loginStep = 1;
	Class126_Sub2.anInt3438 = arg0;
    }
    
    public static Class67_Sub5_Sub19_Sub1 method554(int arg0, int arg1,
						    Class9 arg2) {
	anInt1134++;
	int i = 123 % ((56 - arg0) / 57);
	if (!Class131_Sub3.method1806(arg2, arg1, 101))
	    return null;
	return Class67_Sub5_Sub4.method852((byte) 125);
    }
    
    public static Class72 method555(int arg0, RSString arg1, Class9 arg2) {
	try {
	    anInt1145++;
	    int i = arg2.method126((byte) 66, arg1);
	    if (i == -1)
		return new Class72(0);
	    int[] is = arg2.method131(i, (byte) -113);
	    if (arg0 != 12447)
		aRSString_1146 = null;
	    Class72 class72 = new Class72(is.length);
	    for (int i_4_ = 0; i_4_ < class72.anInt1439; i_4_++) {
		Stream Stream
		    = new Stream(arg2.method138(-809612665, is[i_4_],
						      i));
		class72.aRSStringArray1441[i_4_] = Stream.readRSString(-1);
		class72.aByteArray1437[i_4_]
		    = Stream.readByte2((byte) 1);
		class72.aShortArray1444[i_4_]
		    = (short) Stream.readUShort(-2386);
		class72.aShortArray1443[i_4_]
		    = (short) Stream.readUShort(-2386);
		class72.anIntArray1433[i_4_]
		    = Stream.readInt((byte) 126);
	    }
	    return class72;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ii.H(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method556(byte arg0, int arg1) {
	anInt1144++;
	if (arg1 != 0) {
	    if ((arg1 ^ 0xffffffff) == -2)
		Class23.method216((byte) -18);
	    else {
		if ((arg1 ^ 0xffffffff) != -3)
		    throw new RuntimeException();
		Class67_Sub1_Sub30.method755(114);
	    }
	} else
	    return;
	if (arg0 < 126)
	    method555(95, null, null);
    }
    
    static {
	anIntArray1137 = new int[] { -1, -1, 1, 1 };
	aClass136_1141 = new Class136(2);
	aRSString_1146
	    = Class134.method1914("Memory before cleanup=", (byte) 127);
	aRSString_1147
	    = Class134.method1914("Veuillez patienter)3)3)3", (byte) 96);
    }
}
