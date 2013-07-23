/* Class67_Sub5_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class67_Sub5_Sub11 extends Class67_Sub5
{
    public static Class136 aClass136_4669;
    public static int anInt4670;
    public static RSString aRSString_4671
	= Class134.method1914("Cabbage", (byte) 102);
    public static int anInt4672;
    public static int anInt4673;
    public static int anInt4674;
    public static byte[][] aByteArrayArray4675;
    public static RSString aRSString_4676;
    public static RSString aRSString_4677;
    public static int[] anIntArray4678;
    public static int anInt4679;
    
    public static void method932(int arg0, RSString arg1) {
	anInt4672++;
	if (Class69.aClass67_Sub25Array1380 != null) {
	    int i = 0;
	    long l = arg1.method501((byte) -16);
	    if ((l ^ 0xffffffffffffffffL) != -1L) {
		for (/**/; i < Class69.aClass67_Sub25Array1380.length; i++) {
		    if ((Class69.aClass67_Sub25Array1380[i].aLong1344
			 ^ 0xffffffffffffffffL)
			== (l ^ 0xffffffffffffffffL))
			break;
		}
		if (Class69.aClass67_Sub25Array1380.length > i
		    && Class69.aClass67_Sub25Array1380[i] != null) {
		    Class70_Sub1.outStream.createFrame(2, 162);	//CLAN_KICK
		    Class70_Sub1.outStream.writeLong
			(2, Class69.aClass67_Sub25Array1380[i].aLong1344);
		    if (arg0 < 79)
			aByteArrayArray4675 = null;
		    Class55.anInt1086++;
		}
	    }
	}
    }
    
    public static void method933(int arg0, int arg1, int arg2) {
	for (int i = 0; i < Class67_Sub1_Sub13.anInt4024; i++) {
	    for (int i_0_ = 0; i_0_ < Class67_Sub27.anInt3301; i_0_++) {
		for (int i_1_ = 0; i_1_ < Class67_Sub5_Sub16.anInt4782;
		     i_1_++) {
		    Class67_Sub24 class67_sub24
			= (Class76.aClass67_Sub24ArrayArrayArray1578[i][i_0_]
			   [i_1_]);
		    if (class67_sub24 != null) {
			Class58 class58 = class67_sub24.aClass58_3221;
			if (class58 != null
			    && class58.aClass131_1121.method1768()) {
			    Class131_Sub7_Sub2.method1894((class58
							   .aClass131_1121),
							  i, i_0_, i_1_, 1, 1);
			    if (class58.aClass131_1115 != null
				&& class58.aClass131_1115.method1768()) {
				Class131_Sub7_Sub2.method1894
				    (class58.aClass131_1115, i, i_0_, i_1_, 1,
				     1);
				class58.aClass131_1121.method1763
				    (class58.aClass131_1115, 0, 0, 0, false);
				class58.aClass131_1115
				    = class58.aClass131_1115
					  .method1765(arg0, arg1, arg2);
			    }
			    class58.aClass131_1121
				= class58.aClass131_1121.method1765(arg0, arg1,
								    arg2);
			}
			for (int i_2_ = 0; i_2_ < class67_sub24.anInt3215;
			     i_2_++) {
			    Class36 class36
				= class67_sub24.aClass36Array3229[i_2_];
			    if (class36 != null
				&& class36.aClass131_790.method1768()) {
				Class131_Sub7_Sub2.method1894
				    (class36.aClass131_790, i, i_0_, i_1_,
				     class36.anInt778 - class36.anInt765 + 1,
				     class36.anInt789 - class36.anInt777 + 1);
				class36.aClass131_790
				    = class36.aClass131_790
					  .method1765(arg0, arg1, arg2);
			    }
			}
			Class104 class104 = class67_sub24.aClass104_3216;
			if (class104 != null
			    && class104.aClass131_2034.method1768()) {
			    Class106.method1569(class104.aClass131_2034, i,
						i_0_, i_1_);
			    class104.aClass131_2034
				= class104.aClass131_2034
				      .method1765(arg0, arg1, arg2);
			}
		    }
		}
	    }
	}
    }
    
    public static void method934(int arg0, Class67_Sub5_Sub10 arg1,
				 boolean arg2) {
	if (arg2) {
	    int i = Class49.anInt1010;
	    int i_3_ = 956 * i / 503;
	    Class6.aClass67_Sub5_Sub19_158
		.method1004((Class56.anInt1097 + -i_3_) / 2, 0, i_3_, i);
	    Class3.aClass119_121.method1641(-(Class3.aClass119_121.anInt2252
					      / 2) + Class56.anInt1097 / 2,
					    18);
	}
	anInt4673++;
	arg1.method908(Class85.aRSString_1726, Class56.anInt1097 / 2,
		       Class49.anInt1010 / 2 + -26, 16777215, arg0);
	int i = Class49.anInt1010 / 2 - 18;
	Class121.method1681(Class56.anInt1097 / 2 - 152, i, 304, 34, 9179409);
	Class121.method1681(-151 + Class56.anInt1097 / 2, 1 + i, 302, 32, 0);
	Class121.method1683(-150 + Class56.anInt1097 / 2, i - -2,
			    Class67_Sub5_Sub5.anInt4517 * 3, 30, 9179409);
	Class121.method1683(-150 + (Class56.anInt1097 / 2
				    + Class67_Sub5_Sub5.anInt4517 * 3),
			    i + 2, -(3 * Class67_Sub5_Sub5.anInt4517) + 300,
			    30, 0);
	arg1.method908(Class67_Sub9.aRSString_2977, Class56.anInt1097 / 2,
		       4 + Class49.anInt1010 / 2, 16777215, -1);
    }
    
    public abstract Object method935(boolean bool);
    
    public static void method936(int arg0) {
	try {
	    if (arg0 != 0)
		aByteArrayArray4675 = null;
	    aByteArrayArray4675 = null;
	    anIntArray4678 = null;
	    aRSString_4671 = null;
	    aRSString_4676 = null;
	    aClass136_4669 = null;
	    aRSString_4677 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "mk.E(" + arg0 + ')');
	}
    }
    
    public static void method937(boolean arg0) {
	try {
	    if (arg0 != false)
		method932(109, null);
	    Class67_Sub1_Sub35.aByteArrayArray4357 = null;
	    Class67_Sub23.anIntArray3201 = null;
	    Class55_Sub3.anIntArray2810 = null;
	    Class73.anIntArray1462 = null;
	    Class67_Sub5_Sub4.anIntArray4510 = null;
	    anInt4670++;
	    Class67_Sub6.anIntArray2870 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       "mk.F(" + arg0 + ')');
	}
    }
    
    public abstract boolean method938(boolean bool);
    
    static {
	aClass136_4669 = new Class136(64);
	aRSString_4677 = Class134.method1914("b12_full", (byte) 46);
	anInt4679 = 0;
	aRSString_4676 = Class134.method1914(")3", (byte) 4);
    }
}
