/* Class67_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub28 extends Class67
{
    public static RSString[] aRSStringArray3315;
    public static RSString aRSString_3316;
    public static RSString aRSString_3317 = Class134.method1914("M", (byte) 97);
    public static int anInt3318;
    public static int anInt3319;
    public static int anInt3320;
    public static int anInt3321;
    public static RSString aRSString_3322;
    public static RSString aRSString_3323;
    public static int anInt3324;
    public static RSString aRSString_3325;
    public long aLong3326;
    public static RSString aRSString_3327;
    public static int anInt3328;
    
    public static void method1305(int arg0, boolean arg1, int arg2,
				  boolean arg3, int arg4) {
	Class95.aLong1900 = 0L;
	anInt3319++;
	int i = Class78.method1413(107);
	if (arg2 == 3 || i == 3)
	    arg3 = true;
	if (SignLink.aString937.startsWith("mac") && arg2 > 0)
	    arg3 = true;
	boolean bool = false;
	if ((arg2 ^ 0xffffffff) < -1 != (i ^ 0xffffffff) < -1)
	    bool = true;
	if (arg3 && arg2 > 0)
	    bool = true;
	if (arg1 == true)
	    Class67_Sub8.method1107(arg2, 34, arg0, i, bool, arg3, arg4);
    }
    
    public static void method1306(int arg0, boolean arg1) {
	Class67_Sub1_Sub7.aClass136_3908.method1920(arg0, 103);
	Class133.aClass136_2456.method1920(arg0, 80);
	if (arg1 == false) {
	    Class131_Sub7_Sub2.aClass136_5073.method1920(arg0, 106);
	    anInt3320++;
	}
    }
    
    public static void method1307(byte arg0) {
	if (arg0 >= 11) {
	    aRSString_3325 = null;
	    aRSString_3323 = null;
	    aRSString_3322 = null;
	    aRSString_3316 = null;
	    aRSString_3317 = null;
	    aRSString_3327 = null;
	    aRSStringArray3315 = null;
	}
    }
    
    public static void method1308(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	Class67_Sub1_Sub4.method638(arg3, false);
	anInt3324++;
	int i = 0;
	if (arg2 < 1)
	    anInt3328 = -78;
	int i_0_ = arg3 - arg0;
	int i_1_ = -arg3;
	int i_2_ = arg3;
	if ((i_0_ ^ 0xffffffff) > -1)
	    i_0_ = 0;
	int i_3_ = i_0_;
	int i_4_ = -i_0_;
	if ((arg6 ^ 0xffffffff) <= (Class55_Sub2.anInt2801 ^ 0xffffffff)
	    && (OutputStream_Sub1.anInt87 ^ 0xffffffff) <= (arg6
							    ^ 0xffffffff)) {
	    int[] is = Class67_Sub29.anIntArrayArray3338[arg6];
	    int i_5_ = Class7.method97(-arg3 + arg4, Class126_Sub1.anInt3423,
				       Class139.anInt2533, 65535);
	    int i_6_ = Class7.method97(arg3 + arg4, Class126_Sub1.anInt3423,
				       Class139.anInt2533, 65535);
	    int i_7_ = Class7.method97(arg4 - i_0_, Class126_Sub1.anInt3423,
				       Class139.anInt2533, 65535);
	    int i_8_ = Class7.method97(arg4 - -i_0_, Class126_Sub1.anInt3423,
				       Class139.anInt2533, 65535);
	    Class67_Sub1_Sub11.method665(2, i_5_, is, i_7_, arg1);
	    Class67_Sub1_Sub11.method665(2, i_7_, is, i_8_, arg5);
	    Class67_Sub1_Sub11.method665(2, i_8_, is, i_6_, arg1);
	}
	int i_9_ = -1;
	int i_10_ = -1;
	while ((i_2_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
	    i_10_ += 2;
	    i_9_ += 2;
	    i_1_ += i_9_;
	    i_4_ += i_10_;
	    if (i_4_ >= 0 && (i_3_ ^ 0xffffffff) <= -2) {
		i_3_--;
		Class67_Sub1_Sub35.anIntArray4348[i_3_] = i;
		i_4_ -= i_3_ << -2115326463;
	    }
	    i++;
	    if (i_1_ >= 0) {
		int i_11_ = --i_2_ + arg6;
		i_1_ -= i_2_ << 682323361;
		int i_12_ = i_2_ + arg6;
		if (i_12_ >= Class55_Sub2.anInt2801
		    && OutputStream_Sub1.anInt87 >= i_11_) {
		    if (i_2_ < i_0_) {
			int i_13_ = Class67_Sub1_Sub35.anIntArray4348[i_2_];
			int i_14_ = Class7.method97(arg4 - -i,
						    Class126_Sub1.anInt3423,
						    Class139.anInt2533, 65535);
			int i_15_ = Class7.method97(arg4 - i,
						    Class126_Sub1.anInt3423,
						    Class139.anInt2533, 65535);
			int i_16_ = Class7.method97(arg4 - -i_13_,
						    Class126_Sub1.anInt3423,
						    Class139.anInt2533, 65535);
			int i_17_ = Class7.method97(-i_13_ + arg4,
						    Class126_Sub1.anInt3423,
						    Class139.anInt2533, 65535);
			if (i_12_ <= OutputStream_Sub1.anInt87) {
			    int[] is
				= Class67_Sub29.anIntArrayArray3338[i_12_];
			    Class67_Sub1_Sub11.method665(2, i_15_, is, i_17_,
							 arg1);
			    Class67_Sub1_Sub11.method665(2, i_17_, is, i_16_,
							 arg5);
			    Class67_Sub1_Sub11.method665(2, i_16_, is, i_14_,
							 arg1);
			}
			if (i_11_ >= Class55_Sub2.anInt2801) {
			    int[] is
				= Class67_Sub29.anIntArrayArray3338[i_11_];
			    Class67_Sub1_Sub11.method665(2, i_15_, is, i_17_,
							 arg1);
			    Class67_Sub1_Sub11.method665(2, i_17_, is, i_16_,
							 arg5);
			    Class67_Sub1_Sub11.method665(2, i_16_, is, i_14_,
							 arg1);
			}
		    } else {
			int i_18_ = Class7.method97(arg4 - -i,
						    Class126_Sub1.anInt3423,
						    Class139.anInt2533, 65535);
			int i_19_ = Class7.method97(arg4 - i,
						    Class126_Sub1.anInt3423,
						    Class139.anInt2533, 65535);
			if (OutputStream_Sub1.anInt87 >= i_12_)
			    Class67_Sub1_Sub11.method665(2, i_19_,
							 (Class67_Sub29
							  .anIntArrayArray3338
							  [i_12_]),
							 i_18_, arg1);
			if (Class55_Sub2.anInt2801 <= i_11_)
			    Class67_Sub1_Sub11.method665(2, i_19_,
							 (Class67_Sub29
							  .anIntArrayArray3338
							  [i_11_]),
							 i_18_, arg1);
		    }
		}
	    }
	    int i_20_ = arg6 - i;
	    int i_21_ = arg6 + i;
	    if ((i_21_ ^ 0xffffffff) <= (Class55_Sub2.anInt2801 ^ 0xffffffff)
		&& OutputStream_Sub1.anInt87 >= i_20_) {
		int i_22_ = arg4 + i_2_;
		int i_23_ = arg4 + -i_2_;
		if (Class139.anInt2533 <= i_22_
		    && (i_23_ ^ 0xffffffff) >= (Class126_Sub1.anInt3423
						^ 0xffffffff)) {
		    i_22_ = Class7.method97(i_22_, Class126_Sub1.anInt3423,
					    Class139.anInt2533, 65535);
		    i_23_ = Class7.method97(i_23_, Class126_Sub1.anInt3423,
					    Class139.anInt2533, 65535);
		    if (i_0_ > i) {
			int i_24_ = (i <= i_3_ ? i_3_
				     : Class67_Sub1_Sub35.anIntArray4348[i]);
			int i_25_ = Class7.method97(i_24_ + arg4,
						    Class126_Sub1.anInt3423,
						    Class139.anInt2533, 65535);
			int i_26_ = Class7.method97(arg4 + -i_24_,
						    Class126_Sub1.anInt3423,
						    Class139.anInt2533, 65535);
			if ((i_21_ ^ 0xffffffff)
			    >= (OutputStream_Sub1.anInt87 ^ 0xffffffff)) {
			    int[] is
				= Class67_Sub29.anIntArrayArray3338[i_21_];
			    Class67_Sub1_Sub11.method665(2, i_23_, is, i_26_,
							 arg1);
			    Class67_Sub1_Sub11.method665(2, i_26_, is, i_25_,
							 arg5);
			    Class67_Sub1_Sub11.method665(2, i_25_, is, i_22_,
							 arg1);
			}
			if (Class55_Sub2.anInt2801 <= i_20_) {
			    int[] is
				= Class67_Sub29.anIntArrayArray3338[i_20_];
			    Class67_Sub1_Sub11.method665(2, i_23_, is, i_26_,
							 arg1);
			    Class67_Sub1_Sub11.method665(2, i_26_, is, i_25_,
							 arg5);
			    Class67_Sub1_Sub11.method665(2, i_25_, is, i_22_,
							 arg1);
			}
		    } else {
			if ((i_21_ ^ 0xffffffff)
			    >= (OutputStream_Sub1.anInt87 ^ 0xffffffff))
			    Class67_Sub1_Sub11.method665(2, i_23_,
							 (Class67_Sub29
							  .anIntArrayArray3338
							  [i_21_]),
							 i_22_, arg1);
			if ((i_20_ ^ 0xffffffff)
			    <= (Class55_Sub2.anInt2801 ^ 0xffffffff))
			    Class67_Sub1_Sub11.method665(2, i_23_,
							 (Class67_Sub29
							  .anIntArrayArray3338
							  [i_20_]),
							 i_22_, arg1);
		    }
		}
	    }
	}
    }
    
    public Class67_Sub28() {
	/* empty */
    }
    
    public Class67_Sub28(long arg0) {
	try {
	    aLong3326 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "ui.<init>(" + arg0 + ')');
	}
    }
    
    public static RSString method1309(long arg0, int arg1, int arg2, byte arg3,
				     boolean arg4) {
	try {
	    RSString RSString = Class10.method139((byte) -108, 0);
	    if ((arg0 ^ 0xffffffffffffffffL) > -1L) {
		arg0 = -arg0;
		RSString.method544(-63, Class67_Sub1_Sub16.aRSString_4079);
	    }
	    RSString RSString_27_ = Class67_Sub5_Sub11.aRSString_4676;
	    RSString RSString_28_ = Class15.aRSString_456;
	    anInt3318++;
	    if ((arg1 ^ 0xffffffff) == -2) {
		RSString_28_ = Class67_Sub5_Sub11.aRSString_4676;
		RSString_27_ = Class15.aRSString_456;
	    }
	    if (arg3 <= 91)
		aRSString_3322 = null;
	    if (arg1 == 2) {
		RSString_27_ = Class15.aRSString_456;
		RSString_28_ = Class55_Sub3_Sub1.aRSString_3807;
	    }
	    if (arg1 == 3) {
		RSString_28_ = Class67_Sub5_Sub11.aRSString_4676;
		RSString_27_ = Class15.aRSString_456;
	    }
	    RSString RSString_29_ = Class10.method139((byte) -97, 0);
	    for (int i = 0; i < arg2; i++) {
		RSString_29_.method544(-63,
				      InputStream_Sub1
					  .method47((int) (arg0 % 10L), true));
		arg0 /= 10L;
	    }
	    int i = 0;
	    RSString RSString_30_;
	    if (arg0 == 0L)
		RSString_30_ = Class67_Sub5_Sub8.aRSString_4579;
	    else {
		RSString RSString_31_ = Class10.method139((byte) -104, 0);
		RSString_30_ = RSString_31_;
		while (arg0 > 0L) {
		    if (arg4 && i != 0 && i % 3 == 0)
			RSString_31_.method544(-63, RSString_28_);
		    RSString_31_.method544
			(-63,
			 InputStream_Sub1.method47((int) (arg0 % 10L), true));
		    arg0 /= 10L;
		    i++;
		}
	    }
	    if ((RSString_29_.method531((byte) -124) ^ 0xffffffff) < -1)
		RSString_29_.method544(-63, RSString_27_);
	    return (Class67_Sub1_Sub27.method744
		    (new RSString[] { RSString, RSString_30_.method495((byte) 92),
				     RSString_29_.method495((byte) 92) },
		     -124));
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ui.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public static int method1310(int arg0, int arg1, boolean arg2, int arg3) {
	anInt3321++;
	int i = arg0 + -1 & arg1;
	int i_32_ = arg1 / arg0;
	int i_33_ = arg3 / arg0;
	int i_34_ = -1 + arg0 & arg3;
	int i_35_ = Class67_Sub15.method1238(i_33_, true, i_32_);
	int i_36_ = Class67_Sub15.method1238(i_33_, true, i_32_ - -1);
	int i_37_ = Class67_Sub15.method1238(1 + i_33_, arg2, i_32_);
	int i_38_ = Class67_Sub15.method1238(i_33_ + 1, arg2, i_32_ + 1);
	int i_39_
	    = Class67_Sub1_Sub12.method671(arg0, i_36_, i_35_, i, (byte) 120);
	int i_40_
	    = Class67_Sub1_Sub12.method671(arg0, i_38_, i_37_, i, (byte) 117);
	return Class67_Sub1_Sub12.method671(arg0, i_40_, i_39_, i_34_,
					    (byte) 116);
    }
    
    static {
	aRSStringArray3315 = new RSString[100];
	aRSString_3316 = Class134.method1914("brillant3:", (byte) 27);
	aRSString_3323 = Class134.method1914("<)4col>", (byte) 116);
	aRSString_3322 = aRSString_3317;
	aRSString_3327 = aRSString_3317;
	aRSString_3325 = Class134.method1914("classement ", (byte) 63);
	anInt3328 = 3353893;
    }
}
