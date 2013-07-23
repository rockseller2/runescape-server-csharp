/* Class67_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub10 extends Class67
{
    public int[] anIntArray2985;
    public static int anInt2986;
    public static Class50 aClass50_2987;
    public int anInt2988;
    public int anInt2989;
    public int anInt2990;
    public static int anInt2991;
    public Class65 aClass65_2992;
    public boolean aBoolean2993;
    public Class67_Sub11_Sub3 aClass67_Sub11_Sub3_2994;
    public int anInt2995;
    public int anInt2996;
    public int anInt2997;
    public static int anInt2998;
    public int anInt2999;
    public static int anInt3000;
    public static int anInt3001 = 0;
    public static int anInt3002;
    public Class131_Sub7_Sub1 aClass131_Sub7_Sub1_3003;
    public Class67_Sub11_Sub3 aClass67_Sub11_Sub3_3004;
    public int anInt3005 = 0;
    public int anInt3006;
    public int anInt3007;
    public int anInt3008;
    public static Class115 aClass115_3009;
    public static int anInt3010;
    public static int[] anIntArray3011 = new int[100];
    public static int anInt3012 = 1;
    public Class131_Sub7_Sub2 aClass131_Sub7_Sub2_3013;
    public static int anInt3014;
    public static Class136 aClass136_3015;
    public static Class9 aClass9_3016;
    public static int anInt3017;
    public static Class9 aClass9_3018;
    public static short[] aShortArray3019;
    public static int anInt3020;
    public static RSString aRSString_3021;
    
    public static void method1114(Class131_Sub7_Sub1 arg0, int[] arg1,
				  int arg2, int[] arg3, int[] arg4) {
	try {
	    for (int i = arg2; i < arg4.length; i++) {
		int i_0_ = arg4[i];
		int i_1_ = arg3[i];
		int i_2_ = arg1[i];
		for (int i_3_ = 0;
		     ((i_1_ ^ 0xffffffff) != -1
		      && arg0.aClass21Array3749.length > i_3_);
		     i_3_++) {
		    if ((i_1_ & 0x1 ^ 0xffffffff) != -1) {
			if ((i_0_ ^ 0xffffffff) != 0) {
			    Class41 class41 = Class120.method1666(i_0_, -32);
			    Class21 class21 = arg0.aClass21Array3749[i_3_];
			    int i_4_ = class41.anInt850;
			    if (class21 != null) {
				if (class21.anInt516 == i_0_) {
				    if ((i_4_ ^ 0xffffffff) != -1) {
					if (i_4_ == 1) {
					    class21.anInt525 = 0;
					    class21.anInt517 = i_2_;
					    class21.anInt512 = 1;
					    class21.anInt521 = 0;
					    class21.anInt515 = 0;
					    OutputStream_Sub1.method58
						(class41, arg0.anInt3726, -112,
						 arg0.anInt3733, false, 0);
					} else if (i_4_ == 2)
					    class21.anInt521 = 0;
				    } else
					class21
					    = arg0.aClass21Array3749[i_3_]
					    = null;
				} else if ((class41.anInt856 ^ 0xffffffff)
					   <= ((Class120.method1666
						(class21.anInt516, -32)
						.anInt856)
					       ^ 0xffffffff))
				    class21 = arg0.aClass21Array3749[i_3_]
					= null;
			    }
			    if (class21 == null) {
				class21 = arg0.aClass21Array3749[i_3_]
				    = new Class21();
				class21.anInt512 = 1;
				class21.anInt516 = i_0_;
				class21.anInt517 = i_2_;
				class21.anInt515 = 0;
				class21.anInt525 = 0;
				class21.anInt521 = 0;
				OutputStream_Sub1.method58(class41,
							   arg0.anInt3726,
							   arg2 ^ ~0x71,
							   arg0.anInt3733,
							   false, 0);
			    }
			} else
			    arg0.aClass21Array3749[i_3_] = null;
		    }
		    i_1_ >>>= 1;
		}
	    }
	    anInt2986++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("ik.H(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static int method1115(int arg0, byte[] arg1, int arg2, int arg3) {
	int i = -1;
	if (arg3 >= -127)
	    aClass9_3018 = null;
	anInt3010++;
	for (int i_5_ = arg0; arg2 > i_5_; i_5_++)
	    i = (i >>> -1669512696
		 ^ Class1.anIntArray102[(arg1[i_5_] ^ i) & 0xff]);
	i ^= 0xffffffff;
	return i;
    }
    
    public static void method1116(boolean arg0, boolean arg1) {
	Class108.method1573(arg0, Class49.anInt1010, (byte) 91,
			    Class56.anInt1097, Class54.anInt1080);
	if (arg1 != false)
	    method1114(null, null, -93, null, null);
	anInt3000++;
    }
    
    public void method1117(int arg0) {
	anInt3002++;
	int i = anInt3008;
	if (aClass65_2992 == null) {
	    if (aClass131_Sub7_Sub1_3003 == null) {
		if (aClass131_Sub7_Sub2_3013 != null) {
		    anInt3008
			= Class24.method220(98, aClass131_Sub7_Sub2_3013);
		    anInt2995 = aClass131_Sub7_Sub2_3013.lastByte * 128;
		}
	    } else {
		int i_6_
		    = Class67_Sub1_Sub27.method745((byte) 94,
						   aClass131_Sub7_Sub1_3003);
		if ((i ^ 0xffffffff) != (i_6_ ^ 0xffffffff)) {
		    anInt3008 = i_6_;
		    Class64 class64 = aClass131_Sub7_Sub1_3003.aClass64_5047;
		    if (class64.anIntArray1208 != null)
			class64 = class64.method578(-1);
		    if (class64 == null)
			anInt2995 = 0;
		    else
			anInt2995 = class64.anInt1200 * 128;
		}
	    }
	} else {
	    Class65 class65 = aClass65_2992.method590((byte) -84);
	    if (class65 == null) {
		anInt2989 = 0;
		anInt2990 = 0;
		anInt3008 = -1;
		anInt2995 = 0;
		anIntArray2985 = null;
	    } else {
		anInt2995 = class65.anInt1307 * 128;
		anInt3008 = class65.anInt1270;
		anIntArray2985 = class65.anIntArray1304;
		anInt2989 = class65.anInt1242;
		anInt2990 = class65.anInt1300;
	    }
	}
	if (anInt3008 != i && aClass67_Sub11_Sub3_2994 != null) {
	    Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
		.method1133(aClass67_Sub11_Sub3_2994);
	    aClass67_Sub11_Sub3_2994 = null;
	}
	int i_7_ = -117 % ((-75 - arg0) / 32);
    }
    
    public static Class67_Sub5_Sub10_Sub1 method1118(int arg0, int arg1) {
	if (arg0 != -1328)
	    method1118(-6, 114);
	anInt2991++;
	Class67_Sub5_Sub10_Sub1 class67_sub5_sub10_sub1
	    = ((Class67_Sub5_Sub10_Sub1)
	       Class44.aClass136_923.method1924((long) arg1, false));
	if (class67_sub5_sub10_sub1 != null)
	    return class67_sub5_sub10_sub1;
	byte[] is = Class94.aClass9_1895.method138(-809612665, 0, arg1);
	class67_sub5_sub10_sub1 = new Class67_Sub5_Sub10_Sub1(is);
	class67_sub5_sub10_sub1.method902(Class5.aClass119Array143, null);
	Class44.aClass136_923.method1926((long) arg1, class67_sub5_sub10_sub1,
					 (byte) -71);
	return class67_sub5_sub10_sub1;
    }
    
    public static void method1119(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, byte arg7,
				  int arg8) {
	anInt2998++;
	for (int i = 0;
	     (Class68.aClass72_1369.anInt1439 ^ 0xffffffff) < (i ^ 0xffffffff);
	     i++) {
	    if (Class68.aClass72_1369.method1348(71, i)) {
		int i_8_ = (Class131_Sub5.anInt3656
			    - (1 - (-Class68.aClass72_1369.aShortArray1443[i]
				    - -Class67_Sub1_Sub21.anInt4159)));
		int i_9_
		    = (-arg2 + i_8_) * (-arg8 + arg4) / (arg5 + -arg2) + arg8;
		int i_10_ = (-Class100.anInt1968
			     + Class68.aClass72_1369.aShortArray1444[i]);
		int i_11_ = 16777215;
		int i_12_ = arg0 - -((i_10_ - arg1) * (arg3 - arg0)
				     / (-arg1 + arg6));
		int i_13_ = Class68.aClass72_1369.method1345(i, (byte) 13);
		Sprites sprites = null;
		if ((i_13_ ^ 0xffffffff) == -1) {
		    if ((double) Class54.aFloat1075 == 3.0)
			sprites = Class67_Sub16.aSprite_3093;
		    if ((double) Class54.aFloat1075 == 4.0)
			sprites = Class131_Sub4.aSprite_3650;
		    if ((double) Class54.aFloat1075 == 6.0)
			sprites = Class55_Sub2.aSprite_2799;
		    if ((double) Class54.aFloat1075 >= 8.0)
			sprites = Class108.aSprite_2076;
		}
		if (i_13_ == 1) {
		    if ((double) Class54.aFloat1075 == 3.0)
			sprites = Class55_Sub2.aSprite_2799;
		    if ((double) Class54.aFloat1075 == 4.0)
			sprites = Class108.aSprite_2076;
		    if ((double) Class54.aFloat1075 == 6.0)
			sprites = Class67_Sub1_Sub23.aSprite_4186;
		    if ((double) Class54.aFloat1075 >= 8.0)
			sprites = Class67_Sub26.aSprite_3290;
		}
		if ((i_13_ ^ 0xffffffff) == -3) {
		    if ((double) Class54.aFloat1075 == 3.0)
			sprites = Class67_Sub1_Sub23.aSprite_4186;
		    i_11_ = 16755200;
		    if ((double) Class54.aFloat1075 == 4.0)
			sprites = Class67_Sub26.aSprite_3290;
		    if ((double) Class54.aFloat1075 == 6.0)
			sprites = Class131_Sub5.aSprite_3686;
		    if ((double) Class54.aFloat1075 >= 8.0)
			sprites = Class57.aSprite_1112;
		}
		if ((Class68.aClass72_1369.anIntArray1433[i] ^ 0xffffffff)
		    != 0)
		    i_11_ = Class68.aClass72_1369.anIntArray1433[i];
		if (sprites != null) {
		    int i_14_ = (Class84.aClass67_Sub5_Sub10_1692.method911
				 (Class68.aClass72_1369.aRSStringArray1441[i],
				  null, Class115.aRSStringArray2189));
		    i_9_ -= sprites.method330() * (-1 + i_14_) / 2;
		    i_9_ += sprites.method334() / 2;
		    for (int i_15_ = 0;
			 (i_14_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff);
			 i_15_++) {
			RSString RSString = Class115.aRSStringArray2189[i_15_];
			if (i_15_ < -1 + i_14_)
			    RSString.method542(-64,
					      (-4
					       + RSString
						     .method531((byte) -106)));
			sprites.method328(RSString, i_12_, i_9_, i_11_, true);
			i_9_ += sprites.method330();
		    }
		}
	    }
	}
	int i = 12 / ((-63 - arg7) / 42);
    }
    
    public static void method1120(int arg0, Class7 arg1) {
	anInt3014++;
	Class7 class7 = Class67_Sub1_Sub38.method803(arg1, (byte) 72);
	int i;
	int i_16_;
	if (class7 == null) {
	    i_16_ = Class49.anInt1010;
	    i = Class56.anInt1097;
	} else {
	    i = class7.anInt189;
	    i_16_ = class7.anInt194;
	}
	Class67_Sub1_Sub16_Sub1.method696(arg1, i, false, i_16_, 2);
	if (arg0 != 0)
	    method1115(49, null, 45, -111);
	Class67_Sub5_Sub6.method872(arg1, (byte) -76, i, i_16_);
    }
    
    public static void method1121(int arg0) {
	if (arg0 == -6580) {
	    aClass136_3015 = null;
	    aRSString_3021 = null;
	    aShortArray3019 = null;
	    aClass50_2987 = null;
	    aClass115_3009 = null;
	    aClass9_3018 = null;
	    anIntArray3011 = null;
	    aClass9_3016 = null;
	}
    }
    
    static {
	aClass50_2987 = new Class50();
	aShortArray3019 = new short[] { 6798, 8741, 25238, 4626, 4550 };
	aClass136_3015 = new Class136(64);
	anInt3020 = 0;
	aRSString_3021 = Class134.method1914("<col=00ff80>", (byte) 83);
    }
}
