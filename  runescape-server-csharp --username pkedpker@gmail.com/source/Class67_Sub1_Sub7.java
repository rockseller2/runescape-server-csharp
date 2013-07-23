/* Class67_Sub1_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub7 extends Class67_Sub1
{
    public int anInt3896;
    public static int anInt3897;
    public static int anInt3898;
    public static int anInt3899;
    public static int anInt3900;
    public static Class136 aClass136_3901 = new Class136(50);
    public static int anInt3902;
    public int anInt3903;
    public int anInt3904;
    public static int anInt3905;
    public static int anInt3906;
    public static int anInt3907;
    public static Class136 aClass136_3908 = new Class136(64);
    public static Class9 aClass9_3909;
    public static RSString aRSString_3910 = Class134.method1914("zap", (byte) 8);
    public static Class67_Sub5_Sub19[] aClass67_Sub5_Sub19Array3911;
    public static int anInt3912;
    public static int anInt3913 = 0;
    
    public static void method645(int arg0) {
	if (Class51.anIntArray1040 == null
	    || Class67_Sub3.anIntArray2845 == null) {
	    Class51.anIntArray1040 = new int[256];
	    Class67_Sub3.anIntArray2845 = new int[256];
	    for (int i = 0; i < 256; i++) {
		double d = 6.283185307179586 * ((double) i / 255.0);
		Class51.anIntArray1040[i] = (int) (Math.sin(d) * 4096.0);
		Class67_Sub3.anIntArray2845[i] = (int) (4096.0 * Math.cos(d));
	    }
	}
	anInt3898++;
	if (arg0 > -77)
	    aClass136_3908 = null;
    }
    
    public static void method646(int arg0) {
	Class67_Sub1_Sub16.method685(arg0 ^ 0x12c1);
	Class54.method458(true);
	Class67_Sub1_Sub6.method642(-66);
	anInt3900++;
	Class100.method1533(1);
	Class67_Sub1_Sub31.method762(-15068);
	Class43.method384(true);
	Class123.method1698((byte) -75);
	PacketParser.method1600(8);
	Class67_Sub1_Sub10.method660(arg0);
	Class37.method322(arg0 + 2);
	Class67_Sub5_Sub15.method980((byte) -3);
	Class67_Sub1_Sub13.method674((byte) 121);
	Class101.method1543((byte) 124);
	Class131_Sub4.method1820(arg0);
	Class67_Sub19.method1264((byte) -115);
	Class67_Sub1_Sub35.method777(-81);
	Class76.method1393(-1);
	Class27.method252(1);
	Class144.aClass136_2599.method1921((byte) 110);
	Class44.aClass136_923.method1921((byte) 118);
    }
    
    public static RSString method647(int arg0, int arg1) {
	if (arg1 <= 97)
	    return null;
	anInt3897++;
	RSString RSString = InputStream_Sub1.method47(arg0, true);
	for (int i = -3 + RSString.method531((byte) -127);
	     (i ^ 0xffffffff) < -1; i -= 3)
	    RSString
		= Class67_Sub1_Sub27.method744((new RSString[]
						{ RSString.method502(0, -5975,
								    i),
						  Class67_Sub6.aRSString_2882,
						  RSString.method503((byte) 34,
								    i) }),
					       -111);
	if (RSString.method531((byte) -126) > 9)
	    return (Class67_Sub1_Sub27.method744
		    ((new RSString[]
		      { Class108.aRSString_2084,
			RSString.method502(0, -5975,
					  RSString.method531((byte) 119) - 8),
			Class67_Sub28.aRSString_3327,
			Class55_Sub2.aRSString_2797, RSString,
			Class67_Sub24.aRSString_3242 }),
		     -99));
	if ((RSString.method531((byte) -116) ^ 0xffffffff) < -7)
	    return (Class67_Sub1_Sub27.method744
		    ((new RSString[]
		      { Class67_Sub1_Sub16.aRSString_4085,
			RSString.method502(0, -5975,
					  -4 + RSString.method531((byte) 21)),
			Class67_Sub3.aRSString_2851, Class55_Sub2.aRSString_2797,
			RSString, Class67_Sub24.aRSString_3242 }),
		     -117));
	return Class67_Sub1_Sub27.method744((new RSString[]
					     { Class2.aRSString_106, RSString,
					       Class67_Sub28.aRSString_3323 }),
					    -124);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt3906++;
	int i = arg2;
	if (i == 0)
	    method649(arg0.readThreeBytes(65280), 111);
	if (arg1 != true)
	    method645(20);
    }
    
    public static void method648(byte arg0) {
	if (!Class67_Sub9.aBoolean2980) {
	    Applet_Sub1.aShortArray21[0] = (short) 1002;
	    Class134.anInt2476 = 1;
	    Class55_Sub2.anIntArray2802[0] = Class2.anInt109;
	    if (Class104.anInt2041 != 0) {
		Class136.anInt2486 = RuntimeException_Sub1.anInt2621;
		Class129.anInt2398 = Class67_Sub11_Sub2.anInt4862;
	    } else if ((Class100.anInt1975 ^ 0xffffffff) == -1) {
		Class129.anInt2398 = Class67_Sub1_Sub22.anInt4172;
		Class136.anInt2486 = Class67_Sub5_Sub17.anInt4786;
	    } else {
		Class129.anInt2398 = Class101.anInt1985;
		Class136.anInt2486 = Class115.anInt2186;
	    }
	    Class8.aRSStringArray340[0] = Class27.aRSString_625;
	    Class102.aRSStringArray1998[0] = Class67_Sub5_Sub5.aRSString_4523;
	}
	if (arg0 < 83)
	    method650((byte) 74);
	anInt3899++;
	if ((Class54.anInt1080 ^ 0xffffffff) != 0)
	    RuntimeException_Sub1.method1972(4, Class54.anInt1080);
	for (int i = 0;
	     (i ^ 0xffffffff) > (Class67_Sub10.anInt3001 ^ 0xffffffff); i++) {
	    if (OutputStream_Sub1.aBooleanArray96[i])
		Class67_Sub5_Sub3.aBooleanArray4501[i] = true;
	    Class90.aBooleanArray1848[i]
		= OutputStream_Sub1.aBooleanArray96[i];
	    OutputStream_Sub1.aBooleanArray96[i] = false;
	}
	Class67_Sub1_Sub37.anInt4399 = Class67_Sub1_Sub9.anInt3952;
	Class65.anInt1292 = -1;
	Class67_Sub1_Sub18.aClass7_4114 = null;
	Class100.anInt1974 = -1;
	Class55.aClass7_1089 = null;
	if (Class54.anInt1080 != -1) {
	    Class67_Sub10.anInt3001 = 0;
	    Class67_Sub5_Sub2.method835(1);
	}
	Class121.method1679();
	Class67_Sub1_Sub31.method763(-62);
	if (!Class67_Sub9.aBoolean2980) {
	    if (Class67_Sub1_Sub18.aClass7_4114 == null) {
		if ((Class100.anInt1974 ^ 0xffffffff) != 0)
		    Class61.method550(Class100.anInt1974, null,
				      Class65.anInt1292, (byte) 112);
	    } else
		Class61.method550(Class67_Sub5_Sub4_Sub1.anInt5116,
				  Class67_Sub1_Sub18.aClass7_4114,
				  Class81.anInt1653, (byte) 116);
	} else if (!Class36.aBoolean771)
	    Class100.method1538((byte) -2);
	else
	    Class67_Sub1_Sub39.method812((byte) -18);
	int i = Class67_Sub9.aBoolean2980 ? -1 : Class118.method1636(-2);
	if ((i ^ 0xffffffff) == 0)
	    i = Class131_Sub4.anInt3645;
	Class67_Sub1_Sub28.method748(i, true);
	if ((Class80.anInt1622 ^ 0xffffffff) == -2)
	    Class80.anInt1622 = 2;
	if (Class67_Sub1_Sub36.anInt4366 == 1)
	    Class67_Sub1_Sub36.anInt4366 = 2;
	if ((Class131_Sub5.anInt3689 ^ 0xffffffff) == -4) {
	    for (int i_0_ = 0; Class67_Sub10.anInt3001 > i_0_; i_0_++) {
		if (Class90.aBooleanArray1848[i_0_])
		    Class121.method1686((Class67_Sub1_Sub17.anIntArray4102
					 [i_0_]),
					(Class67_Sub1_Sub25.anIntArray4223
					 [i_0_]),
					Class50.anIntArray1020[i_0_],
					Class67_Sub10.anIntArray3011[i_0_],
					16711935, 128);
		else if (Class67_Sub5_Sub3.aBooleanArray4501[i_0_])
		    Class121.method1686((Class67_Sub1_Sub17.anIntArray4102
					 [i_0_]),
					(Class67_Sub1_Sub25.anIntArray4223
					 [i_0_]),
					Class50.anIntArray1020[i_0_],
					Class67_Sub10.anIntArray3011[i_0_],
					16711680, 128);
	    }
	}
	Class125.method1707((byte) 101, Canvas_Sub1.anInt59, RSString.anInt2642,
			    Class122.aClass131_Sub7_Sub2_2309.anInt3733,
			    Class122.aClass131_Sub7_Sub2_2309.anInt3726);
	RSString.anInt2642 = 0;
    }
    
    public Class67_Sub1_Sub7(int arg0) {
	super(0, false);
	method649(arg0, 94);
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	if (arg0 != true)
	    method650((byte) -113);
	int[][] is = aClass103_2830.method1551(arg1, 50);
	anInt3907++;
	if (aClass103_2830.aBoolean2030) {
	    int[] is_1_ = is[1];
	    int[] is_2_ = is[0];
	    int[] is_3_ = is[2];
	    for (int i = 0; i < Class67_Sub5_Sub7.anInt4569; i++) {
		is_2_[i] = anInt3904;
		is_1_[i] = anInt3896;
		is_3_[i] = anInt3903;
	    }
	}
	return is;
    }
    
    public void method649(int arg0, int arg1) {
	anInt3896 = (0xff00 & arg0) >> 2001110404;
	if (arg1 < 85)
	    method650((byte) -1);
	anInt3902++;
	anInt3903 = 0xff0 & arg0 << 1825838756;
	anInt3904 = 0xff0 & arg0 >> -1962177460;
    }
    
    public static void method650(byte arg0) {
	if (arg0 > -91)
	    method648((byte) -110);
	aClass136_3908 = null;
	aRSString_3910 = null;
	aClass136_3901 = null;
	aClass67_Sub5_Sub19Array3911 = null;
	aClass9_3909 = null;
    }
    
    public Class67_Sub1_Sub7() {
	this(0);
    }
}
