/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class113
{
    public static RSString aRSString_2122
	= Class134.method1914("::breakcon", (byte) 31);
    public static RSString aRSString_2123;
    public static RSString aRSString_2124;
    public int anInt2125;
    public int anInt2126;
    public static RSString aRSString_2127;
    public static RSString aRSString_2128;
    public static RSString aRSString_2129
	= Class134.method1914("headicons_prayer", (byte) 84);
    public static int anInt2130;
    public static int anInt2131;
    public static RSString[] aRSStringArray2132;
    public static boolean aBoolean2133;
    public int anInt2134;
    public static RSString aRSString_2135;
    public int anInt2136;
    public static int[] anIntArray2137;
    public int anInt2138;
    public int anInt2139 = 0;
    public static int anInt2140;
    public static long[] aLongArray2141;
    public static RSString aRSString_2142;
    public static int anInt2143;
    public static RSString aRSString_2144;
    public static boolean aBoolean2145;
    public static RSString aRSString_2146;
    public static int anInt2147;
    
    public void method1601(int arg0, byte arg1) {
	anInt2143++;
	double d = (double) (0xff & arg0 >> 1669023888) / 256.0;
	double d_0_ = (double) ((0xff4d & arg0) >> 1213113416) / 256.0;
	double d_1_ = (double) (0xff & arg0) / 256.0;
	double d_2_ = d;
	double d_3_ = d;
	if (d_0_ > d_2_)
	    d_2_ = d_0_;
	if (d_3_ > d_0_)
	    d_3_ = d_0_;
	double d_4_ = 0.0;
	if (d_2_ < d_1_)
	    d_2_ = d_1_;
	double d_5_ = 0.0;
	if (d_3_ > d_1_)
	    d_3_ = d_1_;
	double d_6_ = (d_2_ + d_3_) / 2.0;
	anInt2136 = (int) (256.0 * d_6_);
	int i = -66 / ((30 - arg1) / 49);
	if (anInt2136 >= 0) {
	    if (anInt2136 > 255)
		anInt2136 = 255;
	} else
	    anInt2136 = 0;
	if (d_2_ != d_3_) {
	    if (d_6_ < 0.5)
		d_5_ = (-d_3_ + d_2_) / (d_3_ + d_2_);
	    if (d_2_ == d)
		d_4_ = (d_0_ - d_1_) / (d_2_ - d_3_);
	    else if (d_2_ != d_0_) {
		if (d_2_ == d_1_)
		    d_4_ = (d - d_0_) / (-d_3_ + d_2_) + 4.0;
	    } else
		d_4_ = (-d + d_1_) / (d_2_ - d_3_) + 2.0;
	    if (d_6_ >= 0.5)
		d_5_ = (-d_3_ + d_2_) / (-d_3_ + (-d_2_ + 2.0));
	}
	anInt2125 = (int) (d_5_ * 256.0);
	d_4_ /= 6.0;
	if ((anInt2125 ^ 0xffffffff) > -1)
	    anInt2125 = 0;
	else if ((anInt2125 ^ 0xffffffff) < -256)
	    anInt2125 = 255;
	if (!(d_6_ > 0.5))
	    anInt2134 = (int) (d_6_ * d_5_ * 512.0);
	else
	    anInt2134 = (int) (512.0 * ((1.0 - d_6_) * d_5_));
	if ((anInt2134 ^ 0xffffffff) > -2)
	    anInt2134 = 1;
	anInt2126 = (int) ((double) anInt2134 * d_4_);
    }
    
    public static void method1602(int arg0, int arg1) {
	if (arg1 >= 73) {
	    for (Class67 class67 = Class67_Sub5_Sub4_Sub1.aClass92_5113
				       .method1483((byte) 25);
		 class67 != null;
		 class67
		     = Class67_Sub5_Sub4_Sub1.aClass92_5113.method1480(11)) {
		if (((long) arg0 ^ 0xffffffffffffffffL)
		    == (0xffffL & class67.aLong1344 >> -366845968
			^ 0xffffffffffffffffL))
		    class67.method606((byte) -118);
	    }
	    anInt2130++;
	}
    }
    
    public void method1603(int arg0, int arg1, Stream arg2, int arg3) {
	if (arg1 != 1) {
	    if (arg1 != 2) {
		if ((arg1 ^ 0xffffffff) == -4)
		    arg2.readUShort(-2386);
	    } else {
		anInt2138 = arg2.readUShort(-2386);
		if ((anInt2138 ^ 0xffffffff) == -65536)
		    anInt2138 = -1;
	    }
	} else {
	    anInt2139 = arg2.readThreeBytes(65280);
	    method1601(anInt2139, (byte) -72);
	}
	anInt2147++;
	if (arg3 < 109)
	    aRSString_2123 = null;
    }
    
    public static void method1604(byte arg0) {
	aRSString_2146 = null;
	aRSString_2122 = null;
	aRSString_2127 = null;
	aRSString_2128 = null;
	aLongArray2141 = null;
	aRSString_2123 = null;
	aRSString_2124 = null;
	aRSStringArray2132 = null;
	if (arg0 > -112)
	    method1602(-10, 108);
	aRSString_2135 = null;
	anIntArray2137 = null;
	aRSString_2142 = null;
	aRSString_2144 = null;
	aRSString_2129 = null;
    }
    
    public Class113() {
	anInt2138 = -1;
    }
    
    public void method1605(byte arg0, Stream arg1, int arg2) {
	int i = 92 / ((arg0 - 63) / 46);
	for (;;) {
	    int i_7_ = arg1.readByte((byte) -47);
	    if ((i_7_ ^ 0xffffffff) == -1)
		break;
	    method1603(arg2, i_7_, arg1, 120);
	}
	anInt2131++;
    }
    
    static {
	aRSString_2128 = Class134.method1914("Sat", (byte) 4);
	aRSString_2124 = Class134.method1914("Thu", (byte) 88);
	aRSString_2142 = Class134.method1914("Fri", (byte) 88);
	aLongArray2141 = new long[100];
	aBoolean2145 = true;
	aRSString_2127 = Class134.method1914("Wed", (byte) 126);
	aRSString_2144 = Class134.method1914("Tue", (byte) 120);
	aRSString_2135 = Class134.method1914("Sun", (byte) 28);
	aBoolean2133 = true;
	aRSString_2146 = Class134.method1914("Mon", (byte) 100);
	aRSStringArray2132
	    = new RSString[] { aRSString_2135, aRSString_2146, aRSString_2144,
			      aRSString_2127, aRSString_2124, aRSString_2142,
			      aRSString_2128 };
	aRSString_2123
	    = Class134.method1914("Gegenstand f-Ur Mitglieder", (byte) 83);
	anInt2140 = 0;
    }
}
