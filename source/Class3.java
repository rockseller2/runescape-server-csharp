public class Class3
{
    public static Class50 aClass50_113 = new Class50();
    public static int anInt114;
    public static int anInt115;
    public static int anInt116;
    public static RSString aRSString_117
	= Class134.method1914("titlebg", (byte) 6);
    public static int anInt118;
    public static int anInt119;
    public static int[] anIntArray120 = new int[2048];
    public static Class119 aClass119_121;
    
    public static RSString method68(int arg0, boolean arg1, boolean arg2) {
	if (arg2 != true)
	    return null;
	anInt118++;
	return Class44.method385(arg1, 0, arg0, 10);
    }
    
    public static Class7 method69(byte arg0, int arg1) {
	if (arg0 != 110)
	    method72(33, 71, 15, null, -72, (byte) -22, 118, 1);
	anInt114++;
	int i = arg1 >> 2035762864; //>> 16..
	int i_0_ = 0xffff & arg1;
	if (Class67_Sub1_Sub5.aClass7ArrayArray3878[i] == null
	    || Class67_Sub1_Sub5.aClass7ArrayArray3878[i][i_0_] == null) {
	    boolean bool = Class67_Sub5_Sub15.method977(i, false);
	    if (!bool)
		return null;
	}
	return Class67_Sub1_Sub5.aClass7ArrayArray3878[i][i_0_];
    }
    
    public static void method70(int arg0) {
	aClass119_121 = null;
	anIntArray120 = null;
	aRSString_117 = null;
	aClass50_113 = null;
	if (arg0 <= 33)
	    anIntArray120 = null;
    }
    
    public static void method71(int arg0, byte arg1) {
	Class44.aClass136_909.method1920(arg0, 124);
	anInt116++;
	Class67_Sub24.aClass136_3234.method1920(arg0, 107);
	Class96_Sub1.aClass136_3381.method1920(arg0, 86);
	if (arg1 >= -15)
	    aClass119_121 = null;
    }
    
    public static void method72(int arg0, int arg1, int arg2, byte[][][] arg3,
				int arg4, byte arg5, int arg6, int arg7) {
	Class67_Sub1_Sub16.anInt4087++;
	Class67_Sub5_Sub1.anInt4463 = 0;
	int i = arg6 - 16;
	int i_1_ = arg6 + 16;
	int i_2_ = arg7 - 16;
	int i_3_ = arg7 + 16;
	for (int i_4_ = Class67_Sub14.anInt3047;
	     i_4_ < Class67_Sub1_Sub13.anInt4024; i_4_++) {
	    Class67_Sub24[][] class67_sub24s
		= Class76.aClass67_Sub24ArrayArrayArray1578[i_4_];
	    for (int i_5_ = Class55_Sub2.anInt2806; i_5_ < Class80.anInt1627;
		 i_5_++) {
		for (int i_6_ = Class67_Sub5_Sub13.anInt4711;
		     i_6_ < Class69.anInt1389; i_6_++) {
		    Class67_Sub24 class67_sub24 = class67_sub24s[i_5_][i_6_];
		    if (class67_sub24 != null) {
			if (!(Class124.aBooleanArrayArray2332
			      [(i_5_ - Class67_Sub1_Sub9.anInt3941
				+ Class67_Sub1.anInt2822)]
			      [(i_6_ - Class67_Sub1_Sub7.anInt3905
				+ Class67_Sub1.anInt2822)])
			    || (arg3 != null && i_4_ >= arg4
				&& arg3[i_4_][i_5_][i_6_] == arg5)) {
			    class67_sub24.aBoolean3223 = false;
			    class67_sub24.aBoolean3231 = false;
			    class67_sub24.anInt3225 = 0;
			    if (i_5_ >= i && i_5_ <= i_1_ && i_6_ >= i_2_
				&& i_6_ <= i_3_) {
				if (class67_sub24.aClass58_3221 != null) {
				    Class58 class58
					= class67_sub24.aClass58_3221;
				    class58.aClass131_1121.method1771
					(0, i_4_, class58.anInt1124,
					 class58.anInt1120, class58.anInt1125);
				    if (class58.aClass131_1115 != null)
					class58.aClass131_1115.method1771
					    (0, i_4_, class58.anInt1124,
					     class58.anInt1120,
					     class58.anInt1125);
				}
				if (class67_sub24.aClass94_3224 != null) {
				    Class94 class94
					= class67_sub24.aClass94_3224;
				    class94.aClass131_1894.method1771
					(class94.anInt1892, i_4_,
					 class94.anInt1890, class94.anInt1889,
					 class94.anInt1887);
				    if (class94.aClass131_1896 != null)
					class94.aClass131_1896.method1771
					    (class94.anInt1892, i_4_,
					     class94.anInt1890,
					     class94.anInt1889,
					     class94.anInt1887);
				}
				if (class67_sub24.aClass104_3216 != null) {
				    Class104 class104
					= class67_sub24.aClass104_3216;
				    class104.aClass131_2034.method1771
					(0, i_4_, class104.anInt2042,
					 class104.anInt2037,
					 class104.anInt2031);
				}
				if (class67_sub24.aClass36Array3229 != null) {
				    for (int i_7_ = 0;
					 i_7_ < class67_sub24.anInt3215;
					 i_7_++) {
					Class36 class36
					    = (class67_sub24.aClass36Array3229
					       [i_7_]);
					class36.aClass131_790.method1771
					    (class36.anInt770, i_4_,
					     class36.anInt784,
					     class36.anInt767,
					     class36.anInt783);
				    }
				}
			    }
			} else {
			    class67_sub24.aBoolean3223 = true;
			    class67_sub24.aBoolean3231 = true;
			    if (class67_sub24.anInt3215 > 0)
				class67_sub24.aBoolean3226 = true;
			    else
				class67_sub24.aBoolean3226 = false;
			    Class67_Sub5_Sub1.anInt4463++;
			}
		    }
		}
	    }
	}
	boolean bool = (Class136.anIntArrayArrayArray2496
			== Class67_Sub1_Sub17.anIntArrayArrayArray4096);
	for (int i_8_ = Class67_Sub14.anInt3047;
	     i_8_ < Class67_Sub1_Sub13.anInt4024; i_8_++) {
	    Class67_Sub24[][] class67_sub24s
		= Class76.aClass67_Sub24ArrayArrayArray1578[i_8_];
	    for (int i_9_ = -Class67_Sub1.anInt2822; i_9_ <= 0; i_9_++) {
		int i_10_ = Class67_Sub1_Sub9.anInt3941 + i_9_;
		int i_11_ = Class67_Sub1_Sub9.anInt3941 - i_9_;
		if (i_10_ >= Class55_Sub2.anInt2806
		    || i_11_ < Class80.anInt1627) {
		    for (int i_12_ = -Class67_Sub1.anInt2822; i_12_ <= 0;
			 i_12_++) {
			int i_13_ = Class67_Sub1_Sub7.anInt3905 + i_12_;
			int i_14_ = Class67_Sub1_Sub7.anInt3905 - i_12_;
			if (i_10_ >= Class55_Sub2.anInt2806) {
			    if (i_13_ >= Class67_Sub5_Sub13.anInt4711) {
				Class67_Sub24 class67_sub24
				    = class67_sub24s[i_10_][i_13_];
				if (class67_sub24 != null
				    && class67_sub24.aBoolean3223)
				    Applet_Sub1.method20(class67_sub24, true);
			    }
			    if (i_14_ < Class69.anInt1389) {
				Class67_Sub24 class67_sub24
				    = class67_sub24s[i_10_][i_14_];
				if (class67_sub24 != null
				    && class67_sub24.aBoolean3223)
				    Applet_Sub1.method20(class67_sub24, true);
			    }
			}
			if (i_11_ < Class80.anInt1627) {
			    if (i_13_ >= Class67_Sub5_Sub13.anInt4711) {
				Class67_Sub24 class67_sub24
				    = class67_sub24s[i_11_][i_13_];
				if (class67_sub24 != null
				    && class67_sub24.aBoolean3223)
				    Applet_Sub1.method20(class67_sub24, true);
			    }
			    if (i_14_ < Class69.anInt1389) {
				Class67_Sub24 class67_sub24
				    = class67_sub24s[i_11_][i_14_];
				if (class67_sub24 != null
				    && class67_sub24.aBoolean3223)
				    Applet_Sub1.method20(class67_sub24, true);
			    }
			}
			if (Class67_Sub5_Sub1.anInt4463 == 0) {
			    if (!bool)
				Class67_Sub1_Sub20.aBoolean4144 = false;
			    return;
			}
		    }
		}
	    }
	}
	for (int i_15_ = Class67_Sub14.anInt3047;
	     i_15_ < Class67_Sub1_Sub13.anInt4024; i_15_++) {
	    Class67_Sub24[][] class67_sub24s
		= Class76.aClass67_Sub24ArrayArrayArray1578[i_15_];
	    for (int i_16_ = -Class67_Sub1.anInt2822; i_16_ <= 0; i_16_++) {
		int i_17_ = Class67_Sub1_Sub9.anInt3941 + i_16_;
		int i_18_ = Class67_Sub1_Sub9.anInt3941 - i_16_;
		if (i_17_ >= Class55_Sub2.anInt2806
		    || i_18_ < Class80.anInt1627) {
		    for (int i_19_ = -Class67_Sub1.anInt2822; i_19_ <= 0;
			 i_19_++) {
			int i_20_ = Class67_Sub1_Sub7.anInt3905 + i_19_;
			int i_21_ = Class67_Sub1_Sub7.anInt3905 - i_19_;
			if (i_17_ >= Class55_Sub2.anInt2806) {
			    if (i_20_ >= Class67_Sub5_Sub13.anInt4711) {
				Class67_Sub24 class67_sub24
				    = class67_sub24s[i_17_][i_20_];
				if (class67_sub24 != null
				    && class67_sub24.aBoolean3223)
				    Applet_Sub1.method20(class67_sub24, false);
			    }
			    if (i_21_ < Class69.anInt1389) {
				Class67_Sub24 class67_sub24
				    = class67_sub24s[i_17_][i_21_];
				if (class67_sub24 != null
				    && class67_sub24.aBoolean3223)
				    Applet_Sub1.method20(class67_sub24, false);
			    }
			}
			if (i_18_ < Class80.anInt1627) {
			    if (i_20_ >= Class67_Sub5_Sub13.anInt4711) {
				Class67_Sub24 class67_sub24
				    = class67_sub24s[i_18_][i_20_];
				if (class67_sub24 != null
				    && class67_sub24.aBoolean3223)
				    Applet_Sub1.method20(class67_sub24, false);
			    }
			    if (i_21_ < Class69.anInt1389) {
				Class67_Sub24 class67_sub24
				    = class67_sub24s[i_18_][i_21_];
				if (class67_sub24 != null
				    && class67_sub24.aBoolean3223)
				    Applet_Sub1.method20(class67_sub24, false);
			    }
			}
			if (Class67_Sub5_Sub1.anInt4463 == 0) {
			    if (!bool)
				Class67_Sub1_Sub20.aBoolean4144 = false;
			    return;
			}
		    }
		}
	    }
	}
	Class67_Sub1_Sub20.aBoolean4144 = false;
    }
    
    public static void method73(int arg0, int arg1) {
	Class67_Sub1_Sub9.aClass136_3934.method1920(arg0, 95);
	anInt115++;
	if (arg1 != 0)
	    aRSString_117 = null;
    }
}
