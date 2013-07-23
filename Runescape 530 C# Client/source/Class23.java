public class Class23
{
    public static RSString aRSString_553;
    public static int anInt554;
    public static int anInt555;
    public static Stream[] aStreamArray556
	= new Stream[2048];
    public static RSString aRSString_557
	= Class134.method1914(" de votre liste noire)3", (byte) 44);
    public static RSString aRSString_558;
    public int anInt559;
    public static boolean aBoolean560;
    public static RSString aRSString_561;
    public static int anInt562;
    public int[] anIntArray563;
    public static int anInt564;
    public static RSString aRSString_565;
    public static int anInt566;
    public Class67_Sub5_Sub12 aClass67_Sub5_Sub12_567;
    public static int anInt568;
    public static int anInt569;
    public static int anInt570;
    
    public static void method213(byte arg0, int arg1) {
	OutputStream_Sub1.anIntArray93 = new int[arg1];
	Class67_Sub5_Sub3.anIntArray4490 = new int[arg1];
	Class67_Sub5_Sub19.anIntArray4823 = new int[arg1];
	Class67_Sub5_Sub6.anIntArray4545 = new int[arg1];
	Class67_Sub1_Sub23.anIntArray4180 = new int[arg1];
	if (arg0 == -39)
	    anInt570++;
    }
    
    public static void method214(int arg0, int arg1, int arg2, int arg3,
				 Class131 arg4, long arg5, Class131 arg6,
				 Class131 arg7) {
	Class88 class88 = new Class88();
	class88.aClass131_1825 = arg4;
	class88.anInt1826 = arg1 * 128 + 64;
	class88.anInt1815 = arg2 * 128 + 64;
	class88.anInt1823 = arg3;
	class88.aLong1819 = arg5;
	class88.aClass131_1816 = arg6;
	class88.aClass131_1820 = arg7;
	int i = 0;
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 != null) {
	    for (int i_0_ = 0; i_0_ < class67_sub24.anInt3215; i_0_++) {
		Class36 class36 = class67_sub24.aClass36Array3229[i_0_];
		if ((class36.aLong785 & 0x400000L) == 4194304L) {
		    int i_1_ = class36.aClass131_790.method1769();
		    if (i_1_ != -32768 && i_1_ < i)
			i = i_1_;
		}
	    }
	}
	class88.anInt1818 = -i;
	if (Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2]
	    == null)
	    Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2]
		= new Class67_Sub24(arg0, arg1, arg2);
	Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2]
	    .aClass88_3220
	    = class88;
    }
    
    public static void method215(int arg0) {
	if (arg0 >= 54) {
	    aRSString_557 = null;
	    aStreamArray556 = null;
	    aRSString_561 = null;
	    aRSString_565 = null;
	    aRSString_553 = null;
	    aRSString_558 = null;
	}
    }
    
    public static void method216(byte arg0) {
	Class27.aRSString_631 = Class40.aRSString_831;
	Class67_Sub1_Sub4.aRSString_3864 = Class67_Sub1_Sub9.aRSString_3942;
	Class67_Sub5_Sub2.aRSString_4469 = Class67_Sub21.aRSString_3177;
	Class67.aRSString_1345 = PacketParser.aRSString_2106;
	Class67_Sub5_Sub13.aRSString_4707 = Class67_Sub1_Sub10.aRSString_3967;
	Class144.aRSString_2605 = Class99.aRSString_1959;
	Class119.aRSString_2257 = Class81.aRSString_1652;
	Class67_Sub5_Sub12.aRSString_4687 = Class65.aRSString_1295;
	Class67_Sub1_Sub26.aRSString_4230
	    = Class67_Sub5_Sub4_Sub1.aRSString_5118;
	Class27.aRSString_625 = Class55_Sub3_Sub1.aRSString_3814;
	Class91.aRSString_1856 = Class67_Sub1_Sub19.aRSString_4137;
	Class67_Sub5_Sub3.aRSString_4498 = Class67_Sub29.aRSString_3336;
	Class4.aRSString_130 = Class116.aRSString_2199;
	Class67_Sub5_Sub4_Sub1.aRSString_5121 = Class117.aRSString_2227;
	Class67_Sub5_Sub1.aRSString_4459 = PacketParser.aRSString_2105;
	Class129.aRSString_2396 = Class24.aRSString_577;
	Class131_Sub5.aRSString_3657 = Class67_Sub1_Sub39.aRSString_4437;
	Class123.aRSString_2314 = Class131_Sub4.aRSString_3651;
	Class53.aRSString_1064 = Class105.aRSString_2046;
	Class67_Sub27.aRSString_3311 = Class69.aRSString_1390;
	Class78.aRSString_1608 = Class75.aRSString_2710;
	Class67_Sub1_Sub8.aRSString_3927 = Class122.aRSString_2304;
	Class119.aRSString_2244 = Class120.aRSString_2269;
	Class131_Sub5.aRSString_3654 = Class99_Sub1.aRSString_3386;
	Class122.aRSString_2311 = Class76.aRSString_1529;
	Class139.aRSString_2532 = Class144.aRSString_2598;
	Class67_Sub1_Sub37.aRSString_4397 = Class67_Sub19.aRSString_3144;
	Class81.aRSString_1651 = Class117.aRSString_2223;
	Class92.aRSString_1878 = Class106.aRSString_2058;
	Class67_Sub1_Sub3.aRSString_3849 = Class67_Sub5_Sub2.aRSString_4483;
	Class67_Sub1_Sub12.aRSString_4000 = Applet_Sub1.aRSString_47;
	Class67_Sub24.aRSString_3244 = Class67_Sub20.aRSString_3171;
	Class67_Sub5_Sub16.aRSString_4781 = aRSString_553;
	Class67_Sub5_Sub14.aRSString_4740 = Class67_Sub1_Sub36.aRSString_4373;
	Stream.aRSString_2901 = Class67_Sub1_Sub9.aRSString_3951;
	Class99_Sub1.aRSString_3387 = Class67_Sub1_Sub20.aRSString_4153;
	Class67_Sub30.aRSString_3346 = Class98.aRSString_1942;
	Class56.aRSString_1095 = Class95.aRSString_1910;
	anInt566++;
	Class67_Sub24.aRSString_3239 = Class67_Sub5_Sub12.aRSString_4697;
	Class53.aRSString_1063 = Class67_Sub1_Sub18.aRSString_4124;
	Class66.aRSString_1327 = Class68.aRSString_1365;
	Class136.aRSString_2491 = Class67_Sub1_Sub25.aRSString_4225;
	Class67_Sub28.aRSString_3327 = ObjectDef.aRSString_3519;
	Class67_Sub1_Sub16_Sub1.aRSString_5096 = Class40.aRSString_824;
	Class67_Sub28.aRSString_3322 = ObjectDef.aRSString_3519;
	Class76.aRSString_1544 = Class50.aRSString_1023;
	Class72.aRSString_1442 = Class131_Sub7_Sub1.aRSString_5048;
	Class67_Sub3.aRSString_2854 = Class67_Sub3.aRSString_2843;
	Class67_Sub22.aRSString_3182 = Class83.aRSString_1688;
	Class92.aRSString_1866 = Class49.aRSString_1004;
	Login.aRSString_1619 = Class2.aRSString_111;
	Login.aRSString_1615 = Class6.aRSString_159;
	Class103.aRSString_2020 = Class33_Sub2.aRSString_2782;
	Class89.aRSString_1838 = Class84.aRSString_1691;
	Class67.aRSString_1338 = Class131_Sub7.aRSString_3736;
	Class67_Sub1_Sub16.aRSString_4082 = Class67_Sub5_Sub6.aRSString_4549;
	Class34.aRSString_744 = Class130.aRSString_2416;
	Class130.aRSString_2419 = Class67_Sub1_Sub30.aRSString_4274;
	Class28.aRSString_653 = Class20.aRSString_500;
	Class67_Sub1_Sub37.aRSString_4393 = Class67_Sub1_Sub21.aRSString_4168;
	Class67_Sub5_Sub19.aRSString_4821 = Class113.aRSString_2123;
	Class67_Sub14.aRSString_3062 = Class141.aRSString_2561;
	Class67_Sub1_Sub32.aRSString_4298 = Class131_Sub3.aRSString_3624;
	Class67_Sub5_Sub12.aRSString_4702 = Class65.aRSString_1295;
	Class74.aRSString_1487 = Class119.aRSString_2259;
	Class137.aRSString_2516 = Class67_Sub5_Sub17.aRSString_4789;
	if (arg0 != -18)
	    method213((byte) 98, -63);
	Class67_Sub3.aRSString_2851 = Class67_Sub3.aRSString_2843;
	Class96_Sub1.aRSString_3379 = Class55_Sub2_Sub1.aRSString_3794;
	Class140.aRSString_2548 = Class90.aRSString_1851;
	Class58.aRSString_1116 = Class137.aRSString_2518;
	Class126_Sub4.aRSString_3472 = Class114.aRSString_2161;
	Class119.aRSString_2253 = Class67_Sub1_Sub10.aRSString_3981;
	Class75.aRSString_2695 = Class128.aRSString_2388;
	PacketParser.aRSString_2111 = Class125.aRSString_2337;
	Class67_Sub6.aRSString_2893 = Class107.aRSString_2067;
	Class30.aRSString_701 = Class64.aRSString_1239;
	Class133.aRSString_2455 = Class33.aRSString_733;
	Class67_Sub9.aRSString_2974 = Class67_Sub1_Sub32.aRSString_4306;
	Class67_Sub1_Sub10.aRSString_3970 = Class67_Sub1_Sub32.aRSString_4301;
	Class67_Sub5_Sub14.aRSString_4747 = Class63.aRSString_1167;
	Class67.aRSString_1343 = Class67_Sub5_Sub16.aRSString_4769;
	client.aRSString_2742 = aRSString_561;
	Applet_Sub1.aRSString_20 = Class67_Sub27.aRSString_3314;
	Class15.aRSString_463 = Class118.aRSString_2234;
	Class87.aRSString_1803 = Class19.aRSString_486;
	Class55_Sub3_Sub1.aRSString_3809 = Class25.aRSString_603;
	Class67_Sub5_Sub19.aRSString_4824 = Class67_Sub1_Sub17.aRSString_4095;
	Class67_Sub1_Sub36.aRSString_4378 = Class67_Sub6.aRSString_2890;
	Class85.aRSString_1726 = Class70.aRSString_1405;
	Class105.aRSString_2043 = Class55_Sub2.aRSString_2804;
    }
    
    public static boolean method217(byte arg0) {
	int i = 78 / ((arg0 - 22) / 46);
	anInt554++;
	if (client.aBoolean2734) {
	    try {
		if (((Boolean)
		     Class67_Sub1_Sub24.aRSString_4215.method505((Class124
								 .aSignLink_2335
								 .anApplet940),
								(byte) 8))
			.booleanValue())
		    return false;
		return true;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	return true;
    }
    
    public static void method218(int arg0, int arg1) {
	if (arg1 == 0) {
	    anInt562++;
	    Class67_Sub1_Sub37.aClass136_4388.method1920(arg0, 111);
	    Class33_Sub2.aClass136_2775.method1920(arg0, arg1 + 79);
	}
    }
    
    static {
	aRSString_553 = Class134.method1914("Titelbild ge-Offnet)3", (byte) 38);
	aRSString_558 = Class134.method1914("Fps:", (byte) 80);
	anInt555 = 0;
	aBoolean560 = false;
	aRSString_565 = Class134.method1914(" )2> <col=00ffff>", (byte) 72);
	aRSString_561
	    = Class134.method1914("m-Ochte mit Ihnen handeln)3", (byte) 44);
	anInt569 = 0;
    }
}
