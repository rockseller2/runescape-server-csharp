public class Class132
{
    public static int anInt2434;
    public static int anInt2435;
    public static RSString aRSString_2436
	= Class134.method1914("Liste des mises -9 jour charg-Be", (byte) 69);
    public static int anInt2437;
    public static int anInt2438;
    public static Class136 aClass136_2439;
    public static int anInt2440;
    public static int anInt2441;
    public static RSString aRSString_2442 = Class134.method1914("", (byte) 69);
    public static boolean aBoolean2443;
    public static int anInt2444;
    public static boolean lowMememoryMode;
    
    public static void method1900(byte arg0) {
	anInt2440++;
	int i = 64 + 128 * Class67_Sub26.anInt3291;
	int i_0_ = 128 * Class67_Sub1_Sub20.anInt4148 - -64;
	int i_1_ = (Class131_Sub5.method1826(Canvas_Sub1.anInt59, i_0_, i,
					     (byte) 101)
		    - Class129.anInt2397);
	if (Class55_Sub1.anInt2791 >= 100) {
	    Class129.anInt2395 = 64 + 128 * Class67_Sub26.anInt3291;
	    Class114.anInt2160 = 128 * Class67_Sub1_Sub20.anInt4148 - -64;
	    Class86.anInt1760
		= (Class131_Sub5.method1826(Canvas_Sub1.anInt59,
					    Class114.anInt2160,
					    Class129.anInt2395, (byte) 127)
		   + -Class129.anInt2397);
	} else {
	    if (i > Class129.anInt2395) {
		Class129.anInt2395
		    += Class99.anInt1956 + (Class55_Sub1.anInt2791
					    * (-Class129.anInt2395 + i)
					    / 1000);
		if ((Class129.anInt2395 ^ 0xffffffff) < (i ^ 0xffffffff))
		    Class129.anInt2395 = i;
	    }
	    if ((Class86.anInt1760 ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
		Class86.anInt1760
		    += ((i_1_ - Class86.anInt1760) * Class55_Sub1.anInt2791
			/ 1000) + Class99.anInt1956;
		if (Class86.anInt1760 > i_1_)
		    Class86.anInt1760 = i_1_;
	    }
	    if ((Class114.anInt2160 ^ 0xffffffff) > (i_0_ ^ 0xffffffff)) {
		Class114.anInt2160
		    += Class99.anInt1956 + (Class55_Sub1.anInt2791
					    * (i_0_ + -Class114.anInt2160)
					    / 1000);
		if (i_0_ < Class114.anInt2160)
		    Class114.anInt2160 = i_0_;
	    }
	    if (i_1_ < Class86.anInt1760) {
		Class86.anInt1760
		    -= (Class55_Sub1.anInt2791 * (Class86.anInt1760 + -i_1_)
			/ 1000) + Class99.anInt1956;
		if (i_1_ > Class86.anInt1760)
		    Class86.anInt1760 = i_1_;
	    }
	    if (Class114.anInt2160 > i_0_) {
		Class114.anInt2160
		    -= (Class55_Sub1.anInt2791 * (Class114.anInt2160 + -i_0_)
			/ 1000) + Class99.anInt1956;
		if (Class114.anInt2160 < i_0_)
		    Class114.anInt2160 = i_0_;
	    }
	    if ((Class129.anInt2395 ^ 0xffffffff) < (i ^ 0xffffffff)) {
		Class129.anInt2395
		    -= Class99.anInt1956 + ((-i + Class129.anInt2395)
					    * Class55_Sub1.anInt2791 / 1000);
		if ((Class129.anInt2395 ^ 0xffffffff) > (i ^ 0xffffffff))
		    Class129.anInt2395 = i;
	    }
	}
	i_0_ = Class67_Sub5_Sub19.anInt4828 * 128 + 64;
	i = 64 + 128 * Class106.anInt2056;
	i_1_ = Class131_Sub5.method1826(Canvas_Sub1.anInt59, i_0_, i,
					(byte) -39) + -Class114.anInt2151;
	int i_2_ = i + -Class129.anInt2395;
	int i_3_ = -Class114.anInt2160 + i_0_;
	int i_4_ = -Class86.anInt1760 + i_1_;
	int i_5_ = (int) Math.sqrt((double) (i_2_ * i_2_ + i_3_ * i_3_));
	int i_6_ = 0x7ff & (int) (Math.atan2((double) i_4_, (double) i_5_)
				  * 325.949);
	if (arg0 != 127)
	    aRSString_2436 = null;
	int i_7_ = ((int) (-325.949 * Math.atan2((double) i_3_, (double) i_2_))
		    & 0x7ff);
	if ((i_6_ ^ 0xffffffff) > -129)
	    i_6_ = 128;
	int i_8_ = i_7_ - Class67_Sub23.anInt3196;
	if ((i_6_ ^ 0xffffffff) < -384)
	    i_6_ = 383;
	if (i_8_ > 1024)
	    i_8_ -= 2048;
	if (i_8_ < -1024)
	    i_8_ += 2048;
	if ((i_6_ ^ 0xffffffff) < (Class67_Sub1_Sub2.anInt3839 ^ 0xffffffff)) {
	    Class67_Sub1_Sub2.anInt3839
		+= (Class129_Sub1.anInt3480
		    + (Applet_Sub1.anInt5
		       * (i_6_ + -Class67_Sub1_Sub2.anInt3839) / 1000));
	    if (i_6_ < Class67_Sub1_Sub2.anInt3839)
		Class67_Sub1_Sub2.anInt3839 = i_6_;
	}
	if ((i_6_ ^ 0xffffffff) > (Class67_Sub1_Sub2.anInt3839 ^ 0xffffffff)) {
	    Class67_Sub1_Sub2.anInt3839
		-= ((-i_6_ + Class67_Sub1_Sub2.anInt3839) * Applet_Sub1.anInt5
		    / 1000) + Class129_Sub1.anInt3480;
	    if ((i_6_ ^ 0xffffffff)
		< (Class67_Sub1_Sub2.anInt3839 ^ 0xffffffff))
		Class67_Sub1_Sub2.anInt3839 = i_6_;
	}
	if (i_8_ > 0) {
	    Class67_Sub23.anInt3196
		+= Applet_Sub1.anInt5 * i_8_ / 1000 + Class129_Sub1.anInt3480;
	    Class67_Sub23.anInt3196 &= 0x7ff;
	}
	if (i_8_ < 0) {
	    Class67_Sub23.anInt3196
		-= Class129_Sub1.anInt3480 - -(Applet_Sub1.anInt5 * -i_8_
					       / 1000);
	    Class67_Sub23.anInt3196 &= 0x7ff;
	}
	int i_9_ = i_7_ + -Class67_Sub23.anInt3196;
	if (i_9_ > 1024)
	    i_9_ -= 2048;
	if (i_9_ < -1024)
	    i_9_ += 2048;
	if ((i_9_ ^ 0xffffffff) > -1 && (i_8_ ^ 0xffffffff) < -1
	    || i_9_ > 0 && i_8_ < 0)
	    Class67_Sub23.anInt3196 = i_7_;
    }
    
    public static void method1901(int arg0) {
	anInt2435++;
	if (Class78.aClass28_1606 != null)
	    Class78.aClass28_1606.method268(false);
	if (Class67_Sub5_Sub9.aClass28_4616 != null)
	    Class67_Sub5_Sub9.aClass28_4616.method268(false);
	if (arg0 != 64)
	    aClass136_2439 = null;
    }
    
    public static void method1902(byte arg0) {
	aRSString_2436 = null;
	aRSString_2442 = null;
	aClass136_2439 = null;
	if (arg0 != -51)
	    aBoolean2443 = false;
    }
    
    public static void method1903(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	for (int i = arg3;
	     (Class67_Sub10.anInt3001 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    if (arg1 < (Class50.anIntArray1020[i]
			+ Class67_Sub1_Sub17.anIntArray4102[i])
		&& ((arg1 + arg2 ^ 0xffffffff)
		    < (Class67_Sub1_Sub17.anIntArray4102[i] ^ 0xffffffff))
		&& arg4 < (Class67_Sub1_Sub25.anIntArray4223[i]
			   + Class67_Sub10.anIntArray3011[i])
		&& ((arg4 - -arg0 ^ 0xffffffff)
		    < (Class67_Sub1_Sub25.anIntArray4223[i] ^ 0xffffffff)))
		OutputStream_Sub1.aBooleanArray96[i] = true;
	}
	anInt2438++;
    }
    
    public static void method1904(boolean arg0, int arg1, int arg2, int arg3) {
	if (arg0 != true)
	    aClass136_2439 = null;
	if ((Class67_Sub21.anInt3176 ^ 0xffffffff) != -1
	    && (arg1 ^ 0xffffffff) != -1 && Class5.anInt144 < 50
	    && arg3 != -1) {
	    Class67_Sub6.anIntArray2887[Class5.anInt144] = arg3;
	    Class67_Sub1_Sub32.anIntArray4299[Class5.anInt144] = arg1;
	    Class126.anIntArray2361[Class5.anInt144] = arg2;
	    Class103.aClass135Array2022[Class5.anInt144] = null;
	    Class50.anIntArray1016[Class5.anInt144] = 0;
	    Class5.anInt144++;
	}
	anInt2441++;
    }
    
    public static void method1905(byte arg0, RSString arg1) {
	anInt2434++;
	Class67_Sub5_Sub6 class67_sub5_sub6
	    = (Class67_Sub5_Sub6) Class10.aClass50_399.method445(0);
	if (arg0 > -28)
	    aBoolean2443 = true;
	for (/**/; class67_sub5_sub6 != null;
	     class67_sub5_sub6
		 = (Class67_Sub5_Sub6) Class10.aClass50_399.method432(0)) {
	    if (class67_sub5_sub6.aRSString_4553.method519((byte) -85, arg1)) {
		Class114.aClass67_Sub5_Sub6_2155 = class67_sub5_sub6;
		break;
	    }
	}
    }
    
    static {
	aClass136_2439 = new Class136(50);
	anInt2444 = 0;
	aBoolean2443 = false;
	lowMememoryMode = false;
    }
}
