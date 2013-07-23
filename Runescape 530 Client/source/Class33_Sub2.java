public class Class33_Sub2 extends Class33
{
    public long aLong2764;
    public static int anInt2765;
    public static int anInt2766;
    public int anInt2767;
    public static int anInt2768;
    public long[] aLongArray2769 = new long[10];
    public static int anInt2770;
    public int anInt2771;
    public int anInt2772;
    public static int anInt2773;
    public static int anInt2774 = 0;
    public static Class136 aClass136_2775 = new Class136(5);
    public int anInt2776;
    public static boolean[] aBooleanArray2777;
    public static Class136 aClass136_2778 = new Class136(100);
    public static int anInt2779 = 0;
    public static int mapFlag;
    public static int itemId;
    public static RSString aRSString_2782
	= Class134.method1914("leuchten3:", (byte) 70);
    public static int anInt2783 = -1;
    public static int anInt2784;
    
    public static void method298(int arg0) {
	if (arg0 != 64)
	    method299(-2, -32);
	anInt2766++;
	Class131_Sub4.aClass136_3639.method1922(arg0 + -64);
    }
    
    public static int method299(int arg0, int arg1) {
	anInt2768++;
	if (arg1 != -26)
	    method298(110);
	return arg0 >>> 635497160;
    }
    
    public static void method300(byte arg0) {
	aClass136_2775 = null;
	aRSString_2782 = null;
	if (arg0 <= -98) {
	    aBooleanArray2777 = null;
	    aClass136_2778 = null;
	}
    }
    
    public void method295(byte arg0) {
	for (int i = 0; (i ^ 0xffffffff) > -11; i++)
	    aLongArray2769[i] = 0L;
	int i = -84 / ((-79 - arg0) / 44);
	anInt2773++;
    }
    
    public static Class36 method301(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null)
	    return null;
	for (int i = 0; i < class67_sub24.anInt3215; i++) {
	    Class36 class36 = class67_sub24.aClass36Array3229[i];
	    if ((class36.aLong785 >> 29 & 0x3L) == 2L
		&& class36.anInt765 == arg1 && class36.anInt777 == arg2) {
		Class67_Sub1_Sub2.method633(class36);
		return class36;
	    }
	}
	return null;
    }
    
    public static void method302(Stream arg0, int arg1) {
	anInt2770++;
	if (arg1 == -1276586906) {
	    while (arg0.currentOffset < arg0.buffer.length) {
		boolean bool = false;
		int i = 0;
		int i_0_ = 0;
		if ((arg0.readByte((byte) 93) ^ 0xffffffff) == -2) {
		    i_0_ = arg0.readByte((byte) -34);
		    i = arg0.readByte((byte) 115);
		    bool = true;
		}
		int i_1_ = arg0.readByte((byte) -54);
		int i_2_ = arg0.readByte((byte) 111);
		int i_3_ = 64 * i_1_ - Class100.anInt1968;
		int i_4_ = -1 + (Class131_Sub5.anInt3656 - i_2_ * 64
				 + Class67_Sub1_Sub21.anInt4159);
		if (i_3_ < 0 || -63 + i_4_ < 0
		    || Class67_Sub1_Sub13.anInt4031 <= 63 + i_3_
		    || i_4_ >= Class131_Sub5.anInt3656) {
		    for (int i_5_ = 0; (!bool ? 4096 : 64) > i_5_; i_5_++) {
			byte i_6_ = arg0.readByte2((byte) 1);
			if ((i_6_ ^ 0xffffffff) != -1)
			    arg0.currentOffset++;
		    }
		} else {
		    int i_7_ = i_4_ >> 1711575494;
		    int i_8_ = i_3_ >> -376006906;
		    for (int i_9_ = 0; i_9_ < 64; i_9_++) {
			for (int i_10_ = 0; i_10_ < 64; i_10_++) {
			    if (!bool
				|| ((i_9_ ^ 0xffffffff) <= (i_0_ * 8
							    ^ 0xffffffff)
				    && ((8 * i_0_ - -8 ^ 0xffffffff)
					< (i_9_ ^ 0xffffffff))
				    && (i_10_ ^ 0xffffffff) <= (i * 8
								^ 0xffffffff)
				    && i_10_ < i * 8 - -8)) {
				byte i_11_ = arg0.readByte2((byte) 1);
				if (i_11_ != 0) {
				    if ((Class67_Sub5_Sub1
					 .aByteArrayArrayArray4458[i_8_][i_7_])
					== null)
					Class67_Sub5_Sub1
					    .aByteArrayArrayArray4458[i_8_]
					    [i_7_]
					    = new byte[4096];
				    Class67_Sub5_Sub1
					.aByteArrayArrayArray4458[i_8_][i_7_]
					[i_9_ + (-i_10_ + 63 << -1781564634)]
					= i_11_;
				    byte i_12_ = arg0.readByte2((byte) 1);
				    if ((Class87.aByteArrayArrayArray1783[i_8_]
					 [i_7_])
					== null)
					Class87.aByteArrayArrayArray1783
					    [i_8_][i_7_]
					    = new byte[4096];
				    Class87.aByteArrayArrayArray1783[i_8_]
					[i_7_]
					[(-i_10_ + 63 << -1276586906) + i_9_]
					= i_12_;
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public int method297(byte arg0, int arg1, int arg2) {
	if (arg0 <= 57)
	    anInt2771 = 121;
	int i = anInt2767;
	anInt2767 = 300;
	int i_13_ = anInt2776;
	anInt2776 = 1;
	aLong2764 = Class39.method337(19644);
	if (aLongArray2769[anInt2772] != 0L) {
	    if ((aLongArray2769[anInt2772] ^ 0xffffffffffffffffL)
		> (aLong2764 ^ 0xffffffffffffffffL))
		anInt2767 = (int) ((long) (2560 * arg2)
				   / (aLong2764 + -aLongArray2769[anInt2772]));
	} else {
	    anInt2776 = i_13_;
	    anInt2767 = i;
	}
	if ((anInt2767 ^ 0xffffffff) > -26)
	    anInt2767 = 25;
	if ((anInt2767 ^ 0xffffffff) < -257) {
	    anInt2767 = 256;
	    anInt2776
		= (int) ((long) arg2
			 - (-aLongArray2769[anInt2772] + aLong2764) / 10L);
	}
	anInt2765++;
	if ((anInt2776 ^ 0xffffffff) < (arg2 ^ 0xffffffff))
	    anInt2776 = arg2;
	aLongArray2769[anInt2772] = aLong2764;
	anInt2772 = (anInt2772 + 1) % 10;
	if (anInt2776 > 1) {
	    for (int i_14_ = 0; i_14_ < 10; i_14_++) {
		if (aLongArray2769[i_14_] != 0L)
		    aLongArray2769[i_14_]
			= (long) anInt2776 + aLongArray2769[i_14_];
	    }
	}
	if (anInt2776 < arg1)
	    anInt2776 = arg1;
	Class67_Sub1_Sub23.method726(-114, (long) anInt2776);
	int i_15_ = 0;
	while ((anInt2771 ^ 0xffffffff) > -257) {
	    anInt2771 += anInt2767;
	    i_15_++;
	}
	anInt2771 &= 0xff;
	return i_15_;
    }
    
    public Class33_Sub2() {
	anInt2767 = 256;
	anInt2771 = 0;
	anInt2776 = 1;
	aLong2764 = Class39.method337(19644);
	for (int i = 0; i < 10; i++)
	    aLongArray2769[i] = aLong2764;
    }
    
    static {
	mapFlag = 0;
    }
}
