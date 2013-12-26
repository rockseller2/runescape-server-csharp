/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class54
{
    public static int anInt1068;
    public static PacketStream aPacketStream_1069;
    public static int anInt1070;
    public int[][] anIntArrayArray1071;
    public static int anInt1072;
    public int anInt1073;
    public static int anInt1074;
    public static float aFloat1075;
    public static int[] anIntArray1076 = new int[128];
    public static int anInt1077;
    public int anInt1078;
    public static int anInt1079;
    public static int anInt1080;
    public static int anInt1081;
    public static boolean aBoolean1082;
    public static RSString aRSString_1083;
    
    public static void method455(Class7 arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	anInt1074++;
	int i = arg1 * arg1 + arg2 * arg2;
	if (i <= 360000) {
	    int i_0_ = Math.min(arg0.anInt189 / 2, arg0.anInt194 / 2);
	    if (i_0_ * i_0_ >= i)
		Class139.method1941(arg0, arg4,
				    Class19.aClass67_Sub5_Sub19Array487[arg5],
				    true, arg1, arg3, arg2);
	    else {
		i_0_ -= 10;
		int i_1_
		    = Class67_Sub5_Sub4.anInt4504 - -Class5.anInt137 & 0x7ff;
		int i_2_ = Class26.anIntArray612[i_1_];
		i_2_ = 256 * i_2_ / (256 + Class67_Sub1_Sub15.anInt4063);
		int i_3_ = Class26.anIntArray617[i_1_];
		i_3_ = i_3_ * 256 / (Class67_Sub1_Sub15.anInt4063 + 256);
		int i_4_ = -(i_3_ * arg1) + i_2_ * arg2 >> 342823696;
		int i_5_ = i_3_ * arg2 + i_2_ * arg1 >> -478201328;
		double d = Math.atan2((double) i_5_, (double) i_4_);
		int i_6_ = (int) (Math.sin(d) * (double) i_0_);
		int i_7_ = (int) ((double) i_0_ * Math.cos(d));
		((Class67_Sub5_Sub19_Sub1)
		 Class67_Sub1_Sub7.aClass67_Sub5_Sub19Array3911[arg5])
		    .method1020
		    (-10 + (i_6_ + arg0.anInt189 / 2 + arg4),
		     -10 + (-i_7_ + arg3) - -(arg0.anInt194 / 2), 20, 20, 15,
		     15, d, 256);
	    }
	    if (arg6 != 20)
		method458(true);
	}
    }
    
    public int method456(int arg0, byte arg1) {
	if (anIntArrayArray1071 != null)
	    arg0 = 6 + (int) ((long) anInt1078 * (long) arg0
			      / (long) anInt1073);
	anInt1068++;
	if (arg1 <= 21)
	    aRSString_1083 = null;
	return arg0;
    }
    
    public int method457(byte arg0, int arg1) {
	anInt1077++;
	if (arg0 != -81)
	    return -99;
	if (anIntArrayArray1071 != null)
	    arg1 = (int) ((long) arg1 * (long) anInt1078 / (long) anInt1073);
	return arg1;
    }
    
    public static void method458(boolean arg0) {
	anInt1079++;
	if (arg0 != true)
	    aBoolean1082 = false;
	Class137.aClass136_2508.method1921((byte) 63);
    }
    
    public byte[] method459(byte[] arg0, boolean arg1) {
	if (arg1 != false)
	    method458(false);
	if (anIntArrayArray1071 != null) {
	    int i = 14 + (int) ((long) arg0.length * (long) anInt1078
				/ (long) anInt1073);
	    int[] is = new int[i];
	    int i_8_ = 0;
	    int i_9_ = 0;
	    for (int i_10_ = 0;
		 (arg0.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
		int i_11_ = arg0[i_10_];
		int[] is_12_ = anIntArrayArray1071[i_9_];
		for (int i_13_ = 0; i_13_ < 14; i_13_++)
		    is[i_13_ + i_8_] += i_11_ * is_12_[i_13_];
		i_9_ += anInt1078;
		int i_14_ = i_9_ / anInt1073;
		i_8_ += i_14_;
		i_9_ -= i_14_ * anInt1073;
	    }
	    arg0 = new byte[i];
	    for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_15_++) {
		int i_16_ = is[i_15_] - -32768 >> 406164144;
		if (i_16_ >= -128) {
		    if (i_16_ <= 127)
			arg0[i_15_] = (byte) i_16_;
		    else
			arg0[i_15_] = (byte) 127;
		} else
		    arg0[i_15_] = (byte) -128;
	    }
	}
	anInt1070++;
	return arg0;
    }
    
    public Class54(int arg0, int arg1) {
	if (arg0 != arg1) {
	    int i = Class67_Sub1_Sub24.method730(arg0, (byte) -97, arg1);
	    arg0 /= i;
	    arg1 /= i;
	    anInt1073 = arg0;
	    anInt1078 = arg1;
	    anIntArrayArray1071 = new int[arg0][14];
	    for (int i_17_ = 0; arg0 > i_17_; i_17_++) {
		int[] is = anIntArrayArray1071[i_17_];
		double d = (double) arg1 / (double) arg0;
		double d_18_ = (double) i_17_ / (double) arg0 + 6.0;
		int i_19_ = (int) Math.floor(1.0 + (-7.0 + d_18_));
		if ((i_19_ ^ 0xffffffff) > -1)
		    i_19_ = 0;
		int i_20_ = (int) Math.ceil(d_18_ + 7.0);
		if ((i_20_ ^ 0xffffffff) < -15)
		    i_20_ = 14;
		for (/**/; (i_20_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff);
		     i_19_++) {
		    double d_21_
			= (-d_18_ + (double) i_19_) * 3.141592653589793;
		    double d_22_ = d;
		    if (d_21_ < -1.0E-4 || d_21_ > 1.0E-4)
			d_22_ *= Math.sin(d_21_) / d_21_;
		    d_22_ *= 0.54 + Math.cos((-d_18_ + (double) i_19_)
					     * 0.2243994752564138) * 0.46;
		    is[i_19_] = (int) Math.floor(0.5 + d_22_ * 65536.0);
		}
	    }
	}
    }
    
    public static void method460(int arg0) {
	anIntArray1076 = null;
	aRSString_1083 = null;
	if (arg0 == 0)
	    aPacketStream_1069 = null;
    }
    
    static {
	aPacketStream_1069 = new PacketStream(5000);
	aBoolean1082 = false;
	aRSString_1083 = Class134.method1914("<col=00ffff>", (byte) 88);
	anInt1080 = -1;
    }
}
