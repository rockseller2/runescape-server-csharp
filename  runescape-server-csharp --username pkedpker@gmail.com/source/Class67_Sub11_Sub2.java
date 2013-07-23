/* Class67_Sub11_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub11_Sub2 extends Class67_Sub11
{
    public static int anInt4847;
    public static int anInt4848;
    public static int anInt4849;
    public Class50 aClass50_4850 = new Class50();
    public static int anInt4851;
    public static int anInt4852;
    public static int anInt4853;
    public static int anInt4854;
    public static int anInt4855;
    public static int anInt4856;
    public static int anInt4857;
    public static int anInt4858;
    public static int anInt4859;
    public static RSString aRSString_4860
	= Class134.method1914(")4p=", (byte) 108);
    public Class67_Sub11_Sub4 aClass67_Sub11_Sub4_4861;
    public static int anInt4862;
    public static Class9 aClass9_4863;
    public Class67_Sub11_Sub1 aClass67_Sub11_Sub1_4864
	= new Class67_Sub11_Sub1();
    public static int anInt4865;
    
    public void method1127(int[] arg0, int arg1, int arg2) {
	aClass67_Sub11_Sub1_4864.method1127(arg0, arg1, arg2);
	anInt4848++;
    while_5_:
	for (Class67_Sub26 class67_sub26
		 = (Class67_Sub26) aClass50_4850.method445(0);
	     class67_sub26 != null;
	     class67_sub26 = (Class67_Sub26) aClass50_4850.method432(0)) {
	    if (!aClass67_Sub11_Sub4_4861.method1200(-71, class67_sub26)) {
		int i = arg2;
		int i_0_ = arg1;
		while ((i ^ 0xffffffff)
		       < (class67_sub26.anInt3281 ^ 0xffffffff)) {
		    method1139(class67_sub26, i + i_0_,
			       class67_sub26.anInt3281, arg0, (byte) 105,
			       i_0_);
		    i -= class67_sub26.anInt3281;
		    i_0_ += class67_sub26.anInt3281;
		    if (aClass67_Sub11_Sub4_4861.method1208(arg0,
							    class67_sub26, i,
							    (byte) 120, i_0_))
			continue while_5_;
		}
		method1139(class67_sub26, i_0_ - -i, i, arg0, (byte) 117,
			   i_0_);
		class67_sub26.anInt3281 -= i;
	    }
	}
    }
    
    public int method1128() {
	anInt4855++;
	return 0;
    }
    
    public static void method1136(Class9 arg0, byte arg1) {
	anInt4851++;
	if (!Class75.aBoolean2723 && arg1 == -62) {
	    Class121.method1672();
	    Class6.aClass67_Sub5_Sub19_158
		= Class67_Sub5_Sub17.method995(Class37.anInt791, (byte) 113,
					       arg0);
	    int i = Class49.anInt1010;
	    int i_1_ = i * 956 / 503;
	    Class6.aClass67_Sub5_Sub19_158
		.method1004((-i_1_ + Class56.anInt1097) / 2, 0, i_1_, i);
	    Class3.aClass119_121
		= Class126.method1709(Class24.anInt578, arg0, 106);
	    Class3.aClass119_121.method1641(-(Class3.aClass119_121.anInt2252
					      / 2) + Class56.anInt1097 / 2,
					    18);
	    Class75.aBoolean2723 = true;
	}
    }
    
    public Class67_Sub11 method1124() {
	anInt4852++;
	Class67_Sub26 class67_sub26;
	do {
	    class67_sub26 = (Class67_Sub26) aClass50_4850.method432(0);
	    if (class67_sub26 == null)
		return null;
	} while (class67_sub26.aClass67_Sub11_Sub3_3267 == null);
	return class67_sub26.aClass67_Sub11_Sub3_3267;
    }
    
    public void method1137(int arg0, Class67_Sub26 arg1, int arg2) {
	if (arg2 != 19695)
	    aClass9_4863 = null;
	if ((aClass67_Sub11_Sub4_4861.anIntArray4927[arg1.anInt3282] & 0x4
	     ^ 0xffffffff) != -1
	    && arg1.anInt3276 < 0) {
	    int i = (aClass67_Sub11_Sub4_4861.anIntArray4897[arg1.anInt3282]
		     / Class89.anInt1833);
	    int i_2_ = (i + 1048575 + -arg1.anInt3261) / i;
	    arg1.anInt3261 = arg0 * i + arg1.anInt3261 & 0xfffff;
	    if ((i_2_ ^ 0xffffffff) >= (arg0 ^ 0xffffffff)) {
		if ((aClass67_Sub11_Sub4_4861.anIntArray4936[arg1.anInt3282]
		     ^ 0xffffffff)
		    != -1) {
		    arg1.aClass67_Sub11_Sub3_3267
			= (Class67_Sub11_Sub3.method1172
			   (arg1.aClass67_Sub13_Sub1_3289,
			    arg1.aClass67_Sub11_Sub3_3267.method1181(), 0,
			    arg1.aClass67_Sub11_Sub3_3267.method1179()));
		    aClass67_Sub11_Sub4_4861.method1197((arg1
							 .aClass67_Sub27_3279
							 .aShortArray3312
							 [arg1.anInt3286]) < 0,
							arg1, arg2 ^ ~0x4cef);
		} else
		    arg1.aClass67_Sub11_Sub3_3267
			= (Class67_Sub11_Sub3.method1172
			   (arg1.aClass67_Sub13_Sub1_3289,
			    arg1.aClass67_Sub11_Sub3_3267.method1181(),
			    arg1.aClass67_Sub11_Sub3_3267.method1170(),
			    arg1.aClass67_Sub11_Sub3_3267.method1179()));
		if (arg1.aClass67_Sub27_3279.aShortArray3312[arg1.anInt3286]
		    < 0)
		    arg1.aClass67_Sub11_Sub3_3267.method1142(-1);
		arg0 = arg1.anInt3261 / i;
	    }
	}
	arg1.aClass67_Sub11_Sub3_3267.method1123(arg0);
	anInt4847++;
    }
    
    public static void method1138(byte arg0) {
	aClass9_4863 = null;
	aRSString_4860 = null;
	if (arg0 > -102)
	    anInt4857 = 109;
    }
    
    public void method1123(int arg0) {
	anInt4859++;
	aClass67_Sub11_Sub1_4864.method1123(arg0);
    while_7_:
	for (Class67_Sub26 class67_sub26
		 = (Class67_Sub26) aClass50_4850.method445(0);
	     class67_sub26 != null;
	     class67_sub26 = (Class67_Sub26) aClass50_4850.method432(0)) {
	    if (!aClass67_Sub11_Sub4_4861.method1200(-15, class67_sub26)) {
		int i = arg0;
		while (i > class67_sub26.anInt3281) {
		    method1137(class67_sub26.anInt3281, class67_sub26, 19695);
		    i -= class67_sub26.anInt3281;
		    if (aClass67_Sub11_Sub4_4861
			    .method1208(null, class67_sub26, i, (byte) 9, 0))
			continue while_7_;
		}
		method1137(i, class67_sub26, 19695);
		class67_sub26.anInt3281 -= i;
	    }
	}
    }
    
    public void method1139(Class67_Sub26 arg0, int arg1, int arg2, int[] arg3,
			   byte arg4, int arg5) {
	try {
	    if (arg4 > 90) {
		anInt4858++;
		if ((0x4 & (aClass67_Sub11_Sub4_4861.anIntArray4927
			    [arg0.anInt3282])) != 0
		    && (arg0.anInt3276 ^ 0xffffffff) > -1) {
		    int i = ((aClass67_Sub11_Sub4_4861.anIntArray4897
			      [arg0.anInt3282])
			     / Class89.anInt1833);
		    for (;;) {
			int i_3_ = (-arg0.anInt3261 + 1048575 + i) / i;
			if ((arg2 ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
			    break;
			arg0.aClass67_Sub11_Sub3_3267.method1127(arg3, arg5,
								 i_3_);
			int i_4_ = Class89.anInt1833 / 100;
			int i_5_ = 262144 / i;
			arg5 += i_3_;
			arg2 -= i_3_;
			Class67_Sub11_Sub3 class67_sub11_sub3
			    = arg0.aClass67_Sub11_Sub3_3267;
			arg0.anInt3261 += -1048576 + i * i_3_;
			if (i_5_ < i_4_)
			    i_4_ = i_5_;
			if ((aClass67_Sub11_Sub4_4861.anIntArray4936
			     [arg0.anInt3282])
			    == 0)
			    arg0.aClass67_Sub11_Sub3_3267
				= (Class67_Sub11_Sub3.method1172
				   (arg0.aClass67_Sub13_Sub1_3289,
				    class67_sub11_sub3.method1181(),
				    class67_sub11_sub3.method1170(),
				    class67_sub11_sub3.method1179()));
			else {
			    arg0.aClass67_Sub11_Sub3_3267
				= (Class67_Sub11_Sub3.method1172
				   (arg0.aClass67_Sub13_Sub1_3289,
				    class67_sub11_sub3.method1181(), 0,
				    class67_sub11_sub3.method1179()));
			    aClass67_Sub11_Sub4_4861.method1197
				(((arg0.aClass67_Sub27_3279.aShortArray3312
				   [arg0.anInt3286])
				  ^ 0xffffffff) > -1,
				 arg0, -1);
			    arg0.aClass67_Sub11_Sub3_3267.method1153
				(i_4_, class67_sub11_sub3.method1170());
			}
			if ((arg0.aClass67_Sub27_3279.aShortArray3312
			     [arg0.anInt3286])
			    < 0)
			    arg0.aClass67_Sub11_Sub3_3267.method1142(-1);
			class67_sub11_sub3.method1148(i_4_);
			class67_sub11_sub3.method1127(arg3, arg5,
						      arg1 + -arg5);
			if (class67_sub11_sub3.method1169())
			    aClass67_Sub11_Sub1_4864
				.method1132(class67_sub11_sub3);
		    }
		    arg0.anInt3261 += arg2 * i;
		}
		arg0.aClass67_Sub11_Sub3_3267.method1127(arg3, arg5, arg2);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("ef.I("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ',' + arg4 + ',' + arg5
						+ ')'));
	}
    }
    
    public static void method1140(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	anInt4856++;
	int i = 0;
	int i_6_ = arg5 * arg5;
	int i_7_ = arg0 * arg0;
	int i_8_ = arg0;
	int i_9_ = i_7_ << 1124166849;
	int i_10_ = arg0 << -405664799;
	int i_11_ = i_9_ + i_6_ * (-i_10_ + 1);
	int i_12_ = i_6_ << -263957631;
	int i_13_ = i_7_ - (-1 + i_10_) * i_12_;
	int i_14_ = i_7_ << 894060322;
	int i_15_ = i_6_ << 1042695554;
	int i_16_ = ((i << -1463961087) - -3) * i_9_;
	if (arg4 >= -36)
	    method1141((byte) -56, null);
	int i_17_ = i_15_ * (-1 + i_8_);
	if ((Class55_Sub2.anInt2801 ^ 0xffffffff) >= (arg1 ^ 0xffffffff)
	    && OutputStream_Sub1.anInt87 >= arg1) {
	    int i_18_ = Class7.method97(arg5 + arg2, Class126_Sub1.anInt3423,
					Class139.anInt2533, 65535);
	    int i_19_ = Class7.method97(arg2 - arg5, Class126_Sub1.anInt3423,
					Class139.anInt2533, 65535);
	    Class67_Sub1_Sub11.method665(2, i_19_,
					 (Class67_Sub29.anIntArrayArray3338
					  [arg1]),
					 i_18_, arg3);
	}
	int i_20_ = i_12_ * (-3 + (i_8_ << -1213940671));
	int i_21_ = (i + 1) * i_14_;
	while ((i_8_ ^ 0xffffffff) < -1) {
	    if ((i_11_ ^ 0xffffffff) > -1) {
		while (i_11_ < 0) {
		    i++;
		    i_13_ += i_21_;
		    i_11_ += i_16_;
		    i_21_ += i_14_;
		    i_16_ += i_14_;
		}
	    }
	    if (i_13_ < 0) {
		i_11_ += i_16_;
		i_13_ += i_21_;
		i++;
		i_16_ += i_14_;
		i_21_ += i_14_;
	    }
	    i_8_--;
	    i_13_ += -i_20_;
	    i_20_ -= i_15_;
	    int i_22_ = i_8_ + arg1;
	    i_11_ += -i_17_;
	    int i_23_ = arg1 + -i_8_;
	    if ((Class55_Sub2.anInt2801 ^ 0xffffffff) >= (i_22_ ^ 0xffffffff)
		&& ((OutputStream_Sub1.anInt87 ^ 0xffffffff)
		    <= (i_23_ ^ 0xffffffff))) {
		int i_24_ = Class7.method97(i + arg2, Class126_Sub1.anInt3423,
					    Class139.anInt2533, 65535);
		int i_25_ = Class7.method97(-i + arg2, Class126_Sub1.anInt3423,
					    Class139.anInt2533, 65535);
		if ((Class55_Sub2.anInt2801 ^ 0xffffffff)
		    >= (i_23_ ^ 0xffffffff))
		    Class67_Sub1_Sub11.method665(2, i_25_,
						 (Class67_Sub29
						  .anIntArrayArray3338[i_23_]),
						 i_24_, arg3);
		if ((i_22_ ^ 0xffffffff)
		    >= (OutputStream_Sub1.anInt87 ^ 0xffffffff))
		    Class67_Sub1_Sub11.method665(2, i_25_,
						 (Class67_Sub29
						  .anIntArrayArray3338[i_22_]),
						 i_24_, arg3);
	    }
	    i_17_ -= i_15_;
	}
    }
    
    public static void method1141(byte arg0, String arg1) {
	anInt4865++;
	if (arg0 != 79)
	    anInt4857 = 77;
	System.out.println
	    ("Bad " + arg1
	     + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
	System.exit(1);
    }
    
    public Class67_Sub11 method1122() {
	anInt4854++;
	Class67_Sub26 class67_sub26
	    = (Class67_Sub26) aClass50_4850.method445(0);
	if (class67_sub26 == null)
	    return null;
	if (class67_sub26.aClass67_Sub11_Sub3_3267 != null)
	    return class67_sub26.aClass67_Sub11_Sub3_3267;
	return method1124();
    }
    
    public Class67_Sub11_Sub2(Class67_Sub11_Sub4 arg0) {
	aClass67_Sub11_Sub4_4861 = arg0;
    }
    
    static {
	anInt4857 = 0;
	anInt4862 = 0;
    }
}
