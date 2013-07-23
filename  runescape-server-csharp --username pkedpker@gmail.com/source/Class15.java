import java.awt.Component;

public class Class15
{
    public static int anInt450;
    public static Class136 aClass136_451 = new Class136(200);
    public static int anInt452;
    public static int anInt453;
    public static int anInt454;
    public static int anInt455;
    public static RSString aRSString_456 = Class134.method1914(")1", (byte) 104);
    public static int anInt457;
    public static int anInt458;
    public static RSString aRSString_459
	= Class134.method1914("Select", (byte) 89);
    public static int anInt460;
    public static int anInt461;
    public static int anInt462;
    public static RSString aRSString_463 = aRSString_459;
    
    public static void method164(int arg0) {
	aRSString_456 = null;
	aClass136_451 = null;
	aRSString_459 = null;
	if (arg0 <= 3)
	    method164(104);
	aRSString_463 = null;
    }
    
    public static Class70_Sub1 method165(int arg0) {
	anInt455++;
	if ((Class73.aClass70_Sub1Array1474.length ^ 0xffffffff)
	    < (Class67_Sub5_Sub18.anInt4811 ^ 0xffffffff))
	    return (Class73.aClass70_Sub1Array1474
		    [Class67_Sub5_Sub18.anInt4811++]);
	if (arg0 > -59)
	    aRSString_459 = null;
	return null;
    }
    
    public static void method166(Class9 arg0, int arg1, boolean arg2,
				 Class67_Sub5_Sub10_Sub1 arg3, Class9 arg4) {
	try {
	    Class11.aBoolean406 = arg2;
	    anInt453++;
	    Class140.aClass9_2551 = arg0;
	    Class94.aClass9_1888 = arg4;
	    int i = -1 + Class140.aClass9_2551.method107(21296);
	    Class67_Sub1_Sub29.anInt4270
		= 256 * i - -Class140.aClass9_2551.method135(i, 108);
	    Class89.aRSStringArray1837
		= new RSString[] { null, null, null, null,
				  Class67_Sub1_Sub37.aRSString_4397 };
	    Class4.aClass67_Sub5_Sub10_Sub1_132 = arg3;
	    if (arg1 >= -92)
		aClass136_451 = null;
	    Class116.aRSStringArray2198
		= new RSString[] { null, null, Class55_Sub3_Sub1.aRSString_3809,
				  null, null };
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("bj.E(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static Class99 method167(int arg0, int arg1, Component arg2,
				    int arg3) {
	anInt462++;
	if (arg0 >= -56)
	    return null;
	try {
	    Class var_class = Class.forName("Class99_Sub2");
	    Class99 class99 = (Class99) var_class.newInstance();
	    class99.method1520(arg1, arg3, arg2, (byte) -34);
	    return class99;
	} catch (Throwable throwable) {
	    Class99_Sub1 class99_sub1 = new Class99_Sub1();
	    class99_sub1.method1520(arg1, arg3, arg2, (byte) -83);
	    return class99_sub1;
	}
    }
    
    public static void method168(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, boolean arg6) {
	anInt450++;
	if (Class67_Sub1_Sub11.anInt3992 != arg4
	    || (Canvas_Sub1.anInt64 ^ 0xffffffff) != (arg1 ^ 0xffffffff)
	    || ((Class116.anInt2197 ^ 0xffffffff) != (arg0 ^ 0xffffffff)
		&& !Class32.method288(true))) {
	    Class67_Sub1_Sub11.anInt3992 = arg4;
	    Canvas_Sub1.anInt64 = arg1;
	    Class116.anInt2197 = arg0;
	    if (Class32.method288(true))
		Class116.anInt2197 = 0;
	    if (!arg6)
		Class40.method348(-11461, 25);
	    else
		Class40.method348(-11461, 28);
	    Class67_Sub1_Sub35.method775(Class67_Sub22.aRSString_3182, true,
					 (byte) -55);
	    int i = Class137.baseY;
	    int i_0_ = Class58.baseX;
	    Class58.baseX = 8 * (arg4 - 6);
	    Class137.baseY = (-6 + arg1) * 8;
	    Class55_Sub3.aClass67_Sub5_Sub6_2809
		= Class91.method1475(arg3 ^ 0x4bfb,
				     8 * Class67_Sub1_Sub11.anInt3992,
				     8 * Canvas_Sub1.anInt64);
	    Class131.aClass72_2428 = null;
	    int i_1_ = Class137.baseY - i;
	    int i_2_ = Class58.baseX + -i_0_;
	    i = Class137.baseY;
	    i_0_ = Class58.baseX;
	    if (arg6) {
		Class37.anInt794 = 0;
		for (int i_3_ = 0; i_3_ < 32768; i_3_++) {
		    Class131_Sub7_Sub1 class131_sub7_sub1
			= Class128.aClass131_Sub7_Sub1Array2386[i_3_];
		    if (class131_sub7_sub1 != null) {
			class131_sub7_sub1.anInt3726 -= 128 * i_1_;
			class131_sub7_sub1.anInt3733 -= i_2_ * 128;
			if (class131_sub7_sub1.anInt3733 >= 0
			    && class131_sub7_sub1.anInt3733 <= 13184
			    && class131_sub7_sub1.anInt3726 >= 0
			    && ((class131_sub7_sub1.anInt3726 ^ 0xffffffff)
				>= -13185)) {
			    for (int i_4_ = 0; i_4_ < 10; i_4_++) {
				class131_sub7_sub1.smallX[i_4_]
				    -= i_2_;
				class131_sub7_sub1.smallY[i_4_]
				    -= i_1_;
			    }
			    Class47.anIntArray965[Class37.anInt794++] = i_3_;
			} else {
			    Class128.aClass131_Sub7_Sub1Array2386[i_3_]
				.method1891((byte) -51, null);
			    Class128.aClass131_Sub7_Sub1Array2386[i_3_] = null;
			}
		    }
		}
	    } else {
		for (int i_5_ = 0; i_5_ < 32768; i_5_++) {
		    Class131_Sub7_Sub1 class131_sub7_sub1
			= Class128.aClass131_Sub7_Sub1Array2386[i_5_];
		    if (class131_sub7_sub1 != null) {
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -11; i_6_++) {
			    class131_sub7_sub1.smallX[i_6_] -= i_2_;
			    class131_sub7_sub1.smallY[i_6_] -= i_1_;
			}
			class131_sub7_sub1.anInt3726 -= 128 * i_1_;
			class131_sub7_sub1.anInt3733 -= 128 * i_2_;
		    }
		}
	    }
	    for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -2049; i_7_++) {
		Class131_Sub7_Sub2 class131_sub7_sub2
		    = Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_7_];
		if (class131_sub7_sub2 != null) {
		    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -11; i_8_++) {
			class131_sub7_sub2.smallX[i_8_] -= i_2_;
			class131_sub7_sub2.smallY[i_8_] -= i_1_;
		    }
		    class131_sub7_sub2.anInt3726 -= i_1_ * 128;
		    class131_sub7_sub2.anInt3733 -= 128 * i_2_;
		}
	    }
	    Canvas_Sub1.anInt59 = arg0;
	    Class122.aClass131_Sub7_Sub2_2309.method1896(false, arg5, arg2,
							 14508);
	    int i_9_ = 0;
	    int i_10_ = 104;
	    int i_11_ = 1;
	    if (i_2_ < 0) {
		i_10_ = -1;
		i_9_ = 103;
		i_11_ = -1;
	    }
	    int i_12_ = 1;
	    int i_13_ = arg3;
	    int i_14_ = 104;
	    if ((i_1_ ^ 0xffffffff) > -1) {
		i_14_ = -1;
		i_13_ = 103;
		i_12_ = -1;
	    }
	    for (int i_15_ = i_9_; i_15_ != i_10_; i_15_ += i_11_) {
		for (int i_16_ = i_13_;
		     (i_16_ ^ 0xffffffff) != (i_14_ ^ 0xffffffff);
		     i_16_ += i_12_) {
		    int i_17_ = i_15_ + i_2_;
		    int i_18_ = i_1_ + i_16_;
		    for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -5; i_19_++) {
			if (i_17_ >= 0 && i_18_ >= 0 && i_17_ < 104
			    && i_18_ < 104)
			    Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
				[i_19_][i_15_][i_16_]
				= (Class67_Sub5_Sub2
				   .aClass50ArrayArrayArray4471[i_19_][i_17_]
				   [i_18_]);
			else
			    Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
				[i_19_][i_15_][i_16_]
				= null;
		    }
		}
	    }
	    for (Class67_Sub6 class67_sub6 = (Class67_Sub6) Class67_Sub1_Sub39
								.aClass50_4441
								.method445(0);
		 class67_sub6 != null;
		 class67_sub6 = (Class67_Sub6) Class67_Sub1_Sub39
						   .aClass50_4441
						   .method432(0)) {
		class67_sub6.anInt2891 -= i_1_;
		class67_sub6.anInt2874 -= i_2_;
		if ((class67_sub6.anInt2874 ^ 0xffffffff) > -1
		    || class67_sub6.anInt2891 < 0
		    || (class67_sub6.anInt2874 ^ 0xffffffff) <= -105
		    || class67_sub6.anInt2891 >= 104)
		    class67_sub6.method606((byte) -118);
	    }
	    Class5.anInt144 = 0;
	    Class50.anInt1021 = -1;
	    if (!arg6)
		Class22.anInt530 = 1;
	    else {
		Class67_Sub1_Sub20.anInt4148 -= i_2_;
		Class114.anInt2160 -= i_2_ * 128;
		Class106.anInt2056 -= i_1_;
		Class67_Sub5_Sub19.anInt4828 -= i_2_;
		Class67_Sub26.anInt3291 -= i_1_;
		Class129.anInt2395 -= 128 * i_1_;
	    }
	    if (Class33_Sub2.mapFlag != 0) {
		Class33_Sub2.mapFlag -= i_2_;
		Class67_Sub1_Sub11.anInt3990 -= i_1_;
	    }
	    Class102.aClass50_2000.method437((byte) 126);
	    Class20.aClass50_503.method437((byte) 126);
	}
    }
    
    public static void method169(byte arg0) {
	for (int i = 0;
	     (Class126_Sub1.anInt3413 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    Class11 class11 = Class99_Sub1.method1525(i, 16);
	    if (class11 != null && (class11.anInt408 ^ 0xffffffff) == -1) {
		Class96.anIntArray1914[i] = 0;
		Class137.anIntArray2504[i] = 0;
	    }
	}
	Class25.aClass92_599 = new Class92(16);
	anInt452++;
	if (arg0 < 28)
	    method166(null, 99, false, null, null);
    }
    
    public static void method170(int arg0, int arg1, byte arg2, int arg3,
				 Class64 arg4) {
	anInt454++;
	if (Class134.anInt2476 < 400) {
	    if (arg4.anIntArray1208 != null)
		arg4 = arg4.method578(-1);
	    if (arg4 != null && arg4.aBoolean1232) {
		if (arg2 > -104)
		    aRSString_456 = null;
		RSString RSString = arg4.npcName;
		if (arg4.anInt1197 != 0) {
		    RSString RSString_20_
			= (Class69.anInt1381 == 1 ? Class67_Sub30.aRSString_3346
			   : Class67_Sub27.aRSString_3311);
		    RSString
			= (Class67_Sub1_Sub27.method744
			   ((new RSString[]
			     { RSString,
			       (Class67_Sub1_Sub25.method736
				(Class122.aClass131_Sub7_Sub2_2309.combatLevel,
				 arg4.anInt1197, 4162)),
			       Class55_Sub2.aRSString_2797, RSString_20_,
			       InputStream_Sub1.method47(arg4.anInt1197, true),
			       Class120.aRSString_2291 }),
			    -127));
		}
		if ((Login.anInt1612 ^ 0xffffffff) != -2) {
		    if (!Class67_Sub20.aBoolean3156) {
			Class128.anInt2382++;
			RSString[] RSStrings = arg4.npcOptions;
			if (Class76.aBoolean1515)
			    RSStrings = Class49.method424(RSStrings, 0);
			if (RSStrings != null) {
			    for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
				if (RSStrings[i] != null
				    && (Class69.anInt1381 != 0
					|| !(RSStrings[i].method526
					     (-109, (Class67_Sub5_Sub4_Sub1
						     .aRSString_5121))))) {
				    Class103.anInt2026++;
				    short i_21_ = 0;
				    if ((i ^ 0xffffffff) == -1)
					i_21_ = (short) 49;
				    int i_22_ = -1;
				    if ((arg4.anInt1214 ^ 0xffffffff)
					== (i ^ 0xffffffff))
					i_22_ = arg4.anInt1220;
				    if (i == arg4.anInt1222)
					i_22_ = arg4.anInt1181;
				    if (i == 1)
					i_21_ = (short) 19;
				    if ((i ^ 0xffffffff) == -3)
					i_21_ = (short) 14;
				    if (i == 3)
					i_21_ = (short) 29;
				    if ((i ^ 0xffffffff) == -5)
					i_21_ = (short) 4;
				    Class120.method1664
					((byte) 112,
					 (Class67_Sub1_Sub27.method744
					  ((new RSString[]
					    { Class67_Sub5_Sub14.aRSString_4737,
					      RSString }),
					   -103)),
					 i_21_, RSStrings[i], arg0, arg1,
					 (long) arg3, i_22_);
				}
			    }
			}
			if (Class69.anInt1381 == 0 && RSStrings != null) {
			    for (int i = 4; i >= 0; i--) {
				if (RSStrings[i] != null
				    && (RSStrings[i].method526
					(-100, (Class67_Sub5_Sub4_Sub1
						.aRSString_5121)))) {
				    Class13.anInt425++;
				    short i_23_ = 0;
				    if (((Class122.aClass131_Sub7_Sub2_2309
					  .combatLevel)
					 ^ 0xffffffff)
					> (arg4.anInt1197 ^ 0xffffffff))
					i_23_ = (short) 2000;
				    short i_24_ = 0;
				    if ((i ^ 0xffffffff) == -1)
					i_24_ = (short) 49;
				    if (i == 1)
					i_24_ = (short) 19;
				    if (i == 2)
					i_24_ = (short) 14;
				    if ((i ^ 0xffffffff) == -4)
					i_24_ = (short) 29;
				    if (i == 4)
					i_24_ = (short) 4;
				    if (i_24_ != 0)
					i_24_ += i_23_;
				    Class120.method1664
					((byte) 118,
					 (Class67_Sub1_Sub27.method744
					  ((new RSString[]
					    { Class67_Sub5_Sub14.aRSString_4737,
					      RSString }),
					   -102)),
					 i_24_, RSStrings[i], arg0, arg1,
					 (long) arg3, arg4.anInt1227);
				}
			    }
			}
			Class120.method1664((byte) 116,
					    (Class67_Sub1_Sub27.method744
					     ((new RSString[]
					       { (Class67_Sub5_Sub14
						  .aRSString_4737),
						 RSString }),
					      -99)),
					    (short) 1007,
					    Class72.aRSString_1442, arg0, arg1,
					    (long) arg3, Class85.anInt1746);
		    } else {
			Class67_Sub5_Sub17 class67_sub5_sub17
			    = ((Class99.anInt1954 ^ 0xffffffff) != 0
			       ? Class8.method103(-90, Class99.anInt1954)
			       : null);
			if ((0x2 & Class67_Sub5_Sub14.anInt4733 ^ 0xffffffff)
			    != -1) {
			    if (class67_sub5_sub17 == null
				|| (arg4.method571(Class99.anInt1954,
						   (class67_sub5_sub17
						    .anInt4785),
						   -1)
				    != class67_sub5_sub17.anInt4785)) {
				Class120.method1664
				    ((byte) 127,
				     (Class67_Sub1_Sub27.method744
				      ((new RSString[]
					{ Class9.aRSString_369,
					  Class67_Sub1_Sub1.aRSString_3815,
					  RSString }),
				       -125)),
				     (short) 32, Class67_Sub26.aRSString_3288,
				     arg0, arg1, (long) arg3,
				     Class67_Sub5_Sub3.anInt4487);
				Class67_Sub1_Sub38.anInt4428++;
			    }
			}
		    }
		} else {
		    Class130.anInt2418++;
		    Class120.method1664((byte) 110,
					(Class67_Sub1_Sub27.method744
					 ((new RSString[]
					   { Class67_Sub1_Sub6.aRSString_3895,
					     Class67_Sub1_Sub1.aRSString_3815,
					     RSString }),
					  -97)),
					(short) 60, Login.aRSString_1615,
					arg0, arg1, (long) arg3,
					Class33_Sub2.anInt2783);
		}
	    }
	}
    }
}
