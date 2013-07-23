public class Class25
{
    public int[] anIntArray584;
    public int anInt585;
    public int[] anIntArray586;
    public int[] anIntArray587;
    public int anInt588;
    public Class86[] aClass86Array589;
    public int[][] anIntArrayArray590;
    public static int anInt591;
    public int anInt592;
    public int[] anIntArray593;
    public int anInt594;
    public int[] anIntArray595;
    public Class86 aClass86_596;
    public int[] anIntArray597;
    public int[][] anIntArrayArray598;
    public static Class92 aClass92_599 = new Class92(16);
    public static int anInt600;
    public static int anInt601;
    public static Class50 aClass50_602;
    public static RSString aRSString_603
	= Class134.method1914("Nehmen", (byte) 48);
    public static RSString aRSString_604
	= Class134.method1914("underlay", (byte) 92);
    public static boolean aBoolean605;
    
    public static void method226(int arg0) {
	if ((Class54.anInt1080 ^ 0xffffffff) != 0)
	    RuntimeException_Sub1.method1972(4, Class54.anInt1080);
	for (int i = 0;
	     (Class67_Sub10.anInt3001 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    if (OutputStream_Sub1.aBooleanArray96[i])
		Class67_Sub5_Sub3.aBooleanArray4501[i] = true;
	    Class90.aBooleanArray1848[i]
		= OutputStream_Sub1.aBooleanArray96[i];
	    OutputStream_Sub1.aBooleanArray96[i] = false;
	}
	anInt600++;
	Class55.aClass7_1089 = null;
	Class65.anInt1292 = -1;
	Class67_Sub1_Sub37.anInt4399 = Class67_Sub1_Sub9.anInt3952;
	Class100.anInt1974 = -1;
	if ((Class54.anInt1080 ^ 0xffffffff) != 0) {
	    Class67_Sub10.anInt3001 = 0;
	    Class67_Sub5_Sub2.method835(1);
	}
	Class121.method1679();
	if (arg0 >= -30)
	    aClass92_599 = null;
	RSString.anInt2642 = 0;
    }
    
    public static Stream method227(int arg0) {
	anInt591++;
	Stream Stream = new Stream(34);
	Stream.addByte((byte) 4, 11);
	Stream.addByte((byte) 4, Class28.anInt667);
	Stream.addByte((byte) 4, !Class113.aBoolean2133 ? 0 : 1);
	Stream.addByte((byte) 4, Class100.aBoolean1977 ? 1 : 0);
	Stream.addByte((byte) 4, InputStream_Sub1.aBoolean77 ? 1 : 0);
	Stream.addByte((byte) 4,
				Class67_Sub5_Sub2.aBoolean4468 ? 1 : 0);
	Stream.addByte((byte) 4, !Class55_Sub3.aBoolean2808 ? 0 : 1);
	Stream.addByte((byte) 4, !Class6.aBoolean157 ? 0 : 1);
	Stream.addByte((byte) 4,
				!InputStream_Sub1.aBoolean78 ? 0 : 1);
	Stream.addByte((byte) 4,
				!Class67_Sub5_Sub9.aBoolean4614 ? 0 : 1);
	Stream.addByte((byte) 4, Class67_Sub25.anInt3253);
	if (arg0 != -6)
	    aBoolean605 = true;
	Stream.addByte((byte) 4, Class123.aBoolean2318 ? 1 : 0);
	Stream.addByte((byte) 4, !Class72.aBoolean1432 ? 0 : 1);
	Stream.addByte((byte) 4, !Class128.aBoolean2385 ? 0 : 1);
	Stream.addByte((byte) 4, Class75.anInt2716);
	Stream.addByte((byte) 4, !Class105.aBoolean2044 ? 0 : 1);
	Stream.addByte((byte) 4, Class67_Sub21.anInt3176);
	Stream.addByte((byte) 4, Class67_Sub1_Sub29.anInt4259);
	Stream.addByte((byte) 4, Class27.anInt644);
	Stream.addUShort(16711680, Class139.anInt2526);
	Stream.addUShort(arg0 ^ ~0xff0005,
				Class67_Sub11_Sub2.anInt4857);
	Stream.addByte((byte) 4, Class61_Sub1.method558());
	Stream.addInt(Class63.anInt1168, 127);
	Stream.addByte((byte) 4, Class2.anInt112);
	Stream.addByte((byte) 4, !Class67_Sub29.aBoolean3337 ? 0 : 1);
	Stream.addByte((byte) 4, !Class53.aBoolean1057 ? 0 : 1);
	Stream.addByte((byte) 4, Class95.anInt1909);
	Stream.addByte((byte) 4,
				!InputStream_Sub1.aBoolean71 ? 0 : 1);
	Stream.addByte((byte) 4,
				!Class67_Sub1_Sub38.aBoolean4431 ? 0 : 1);
	return Stream;
    }
    
    public void method228(byte[] arg0, int arg1) {
	anInt601++;
	Stream Stream
	    = new Stream(Class36.method317(arg0, false));
	int i = Stream.readByte((byte) -67);
	if ((i ^ 0xffffffff) != -6 && (i ^ 0xffffffff) != -7)
	    throw new RuntimeException();
	if (i < 6)
	    anInt594 = 0;
	else
	    anInt594 = Stream.readInt((byte) 125);
	int i_0_ = Stream.readByte((byte) 111);
	int i_1_ = 0;
	anInt592 = Stream.readUShort(-2386);
	anIntArray587 = new int[anInt592];
	int i_2_ = arg1;
	for (int i_3_ = 0; i_3_ < anInt592; i_3_++) {
	    anIntArray587[i_3_] = i_1_ += Stream.readUShort(-2386);
	    if (anIntArray587[i_3_] > i_2_)
		i_2_ = anIntArray587[i_3_];
	}
	anInt588 = i_2_ + 1;
	anIntArray595 = new int[anInt588];
	anIntArray593 = new int[anInt588];
	anIntArrayArray590 = new int[anInt588][];
	anIntArray597 = new int[anInt588];
	anIntArray584 = new int[anInt588];
	if (i_0_ != 0) {
	    anIntArray586 = new int[anInt588];
	    for (int i_4_ = 0; anInt588 > i_4_; i_4_++)
		anIntArray586[i_4_] = -1;
	    for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (anInt592 ^ 0xffffffff);
		 i_5_++)
		anIntArray586[anIntArray587[i_5_]]
		    = Stream.readInt((byte) 127);
	    aClass86_596 = new Class86(anIntArray586);
	}
	for (int i_6_ = 0; anInt592 > i_6_; i_6_++)
	    anIntArray597[anIntArray587[i_6_]]
		= Stream.readInt((byte) 127);
	for (int i_7_ = 0; (anInt592 ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
	     i_7_++)
	    anIntArray584[anIntArray587[i_7_]]
		= Stream.readInt((byte) 126);
	for (int i_8_ = 0; anInt592 > i_8_; i_8_++)
	    anIntArray595[anIntArray587[i_8_]]
		= Stream.readUShort(-2386);
	for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (anInt592 ^ 0xffffffff);
	     i_9_++) {
	    int i_10_ = anIntArray587[i_9_];
	    i_1_ = 0;
	    int i_11_ = -1;
	    int i_12_ = anIntArray595[i_10_];
	    anIntArrayArray590[i_10_] = new int[i_12_];
	    for (int i_13_ = 0; i_12_ > i_13_; i_13_++) {
		int i_14_ = (anIntArrayArray590[i_10_][i_13_] = i_1_
			     += Stream.readUShort(arg1 + -2385));
		if (i_14_ > i_11_)
		    i_11_ = i_14_;
	    }
	    anIntArray593[i_10_] = 1 + i_11_;
	    if ((i_12_ ^ 0xffffffff) == (i_11_ - -1 ^ 0xffffffff))
		anIntArrayArray590[i_10_] = null;
	}
	if (i_0_ != 0) {
	    aClass86Array589 = new Class86[i_2_ - -1];
	    anIntArrayArray598 = new int[i_2_ + 1][];
	    for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (anInt592 ^ 0xffffffff);
		 i_15_++) {
		int i_16_ = anIntArray587[i_15_];
		int i_17_ = anIntArray595[i_16_];
		anIntArrayArray598[i_16_] = new int[anIntArray593[i_16_]];
		for (int i_18_ = 0; i_18_ < anIntArray593[i_16_]; i_18_++)
		    anIntArrayArray598[i_16_][i_18_] = -1;
		for (int i_19_ = 0; i_17_ > i_19_; i_19_++) {
		    int i_20_;
		    if (anIntArrayArray590[i_16_] != null)
			i_20_ = anIntArrayArray590[i_16_][i_19_];
		    else
			i_20_ = i_19_;
		    anIntArrayArray598[i_16_][i_20_]
			= Stream.readInt((byte) 127);
		}
		aClass86Array589[i_16_]
		    = new Class86(anIntArrayArray598[i_16_]);
	    }
	}
    }
    
    public static void method229(int arg0) {
	aRSString_603 = null;
	if (arg0 < 73)
	    aRSString_603 = null;
	aRSString_604 = null;
	aClass50_602 = null;
	aClass92_599 = null;
    }
    
    public Class25(byte[] arg0, int arg1) {
	anInt585 = Class105.method1567(0, arg0, arg0.length);
	if (arg1 != anInt585)
	    throw new RuntimeException();
	method228(arg0, -1);
    }
    
    static {
	aClass50_602 = new Class50();
    }
}
