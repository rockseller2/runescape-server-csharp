public class Class144
{
    public static int anInt2585;
    public static Class67_Sub5_Sub7[] aClass67_Sub5_Sub7Array2586;
    public int anInt2587 = 0;
    public static Class40 aClass40_2588;
    public static int anInt2589;
    public int anInt2590 = -1;
    public int anInt2591;
    public static int anInt2592;
    public static int anInt2593;
    public static int anInt2594;
    public static int anInt2595;
    public static int anInt2596 = 0;
    public Class67_Sub15[] aClass67_Sub15Array2597;
    public static RSString aRSString_2598
	= Class134.method1914("blinken1:", (byte) 105);
    public static Class136 aClass136_2599;
    public Class50 aClass50_2600 = new Class50();
    public int anInt2601;
    public static byte[][] aByteArrayArray2602;
    public static Class14 aClass14_2603;
    public static RSString aRSString_2604;
    public static RSString aRSString_2605;
    public int[][] anIntArrayArray2606;
    public boolean aBoolean2607 = false;
    
    public int[] method1961(int arg0, boolean arg1) {
	anInt2589++;
	if (arg1 != true)
	    aClass50_2600 = null;
	if (anInt2591 == anInt2601) {
	    aBoolean2607 = aClass67_Sub15Array2597[arg0] == null;
	    aClass67_Sub15Array2597[arg0]
		= Class67_Sub1_Sub26.aClass67_Sub15_4232;
	    return anIntArrayArray2606[arg0];
	}
	if (anInt2601 != 1) {
	    Class67_Sub15 class67_sub15 = aClass67_Sub15Array2597[arg0];
	    if (class67_sub15 != null)
		aBoolean2607 = false;
	    else {
		aBoolean2607 = true;
		if (anInt2587 < anInt2601) {
		    class67_sub15 = new Class67_Sub15(arg0, anInt2587);
		    anInt2587++;
		} else {
		    Class67_Sub15 class67_sub15_0_
			= (Class67_Sub15) aClass50_2600.method433((byte) -114);
		    class67_sub15
			= new Class67_Sub15(arg0, class67_sub15_0_.anInt3069);
		    aClass67_Sub15Array2597[class67_sub15_0_.anInt3071] = null;
		    class67_sub15_0_.method606((byte) -118);
		}
		aClass67_Sub15Array2597[arg0] = class67_sub15;
	    }
	    aClass50_2600.method441(class67_sub15, (byte) -128);
	    return anIntArrayArray2606[class67_sub15.anInt3069];
	}
	aBoolean2607 = (arg0 ^ 0xffffffff) != (anInt2590 ^ 0xffffffff);
	anInt2590 = arg0;
	return anIntArrayArray2606[0];
    }
    
    public void method1962(int arg0) {
	for (int i = arg0; i < anInt2601; i++)
	    anIntArrayArray2606[i] = null;
	anInt2585++;
	aClass67_Sub15Array2597 = null;
	anIntArrayArray2606 = null;
	aClass50_2600.method437((byte) 126);
	aClass50_2600 = null;
    }
    
    public static void method1963(byte arg0) {
	synchronized (Class6.aClass133_154) {
	    int i = 48 / ((-29 - arg0) / 33);
	    Class16.anInt464 = Class87.anInt1813;
	    Class67_Sub5_Sub17.anInt4786 = Class67_Sub1_Sub25.anInt4218;
	    Class67_Sub1_Sub22.anInt4172 = Class52.anInt1048;
	    Class67_Sub1_Sub12.anInt4014++;
	    Class100.anInt1975 = Class131_Sub7.anInt3768;
	    Class115.anInt2186 = Class67_Sub1_Sub12.anInt4006;
	    Class101.anInt1985 = Class14.anInt447;
	    Class67_Sub15.aLong3072 = Class125.aLong2342;
	    Class131_Sub7.anInt3768 = 0;
	}
	anInt2592++;
    }
    
    public static void method1964(int arg0, int arg1, int arg2) {
	anInt2595++;
	int i = arg0;
	arg0--;
	int firstY = Class126.anIntArray2345[arg0];
	if ((i ^ 0xffffffff) < -26)
	    i = 25;
	int firstX = Class90.anIntArray1849[arg0];
	if ((arg2 ^ 0xffffffff) == -1) {
	    Class133.anInt2459++;
	    Class70_Sub1.outStream.createFrame(2, 215);	//WALK_1
	    Class70_Sub1.outStream.addByte((byte) 4, i + i - -3);
	}
	if (arg2 == 1) {
	    Class67_Sub5_Sub11.anInt4674++;
	    Class70_Sub1.outStream.createFrame(2, 39); //WALK_2
	    Class70_Sub1.outStream.addByte((byte) 4, 14 + i + (i + 3));
	}
	if ((arg2 ^ 0xffffffff) == arg1) {
	    Class65.anInt1255++;
	    Class70_Sub1.outStream.createFrame(2, 77); //WALK_3
	    Class70_Sub1.outStream.addByte((byte) 4, i + i + 3);
	}
	Class70_Sub1.outStream.addByteA(-27699, Class131_Sub7.aBooleanArray3698[82] ? 1 : 0); // running
	Class70_Sub1.outStream.addUShort(16711680, Class58.baseX + firstX); // firstX
	Class70_Sub1.outStream.addShortA(Class137.baseY + firstY, arg1 ^ 0x2fa1); // firstY
	Class33_Sub2.mapFlag = Class90.anIntArray1849[0];
	Class67_Sub1_Sub11.anInt3990 = Class126.anIntArray2345[0];
	for (int i_3_ = 1; (i ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
	    arg0--;
	    Class70_Sub1.outStream.addByteA(-27699, -firstX + Class90.anIntArray1849[arg0]); // stepsX
	    Class70_Sub1.outStream.addByteS(Class126.anIntArray2345[arg0] + -firstY, (byte) 124); // stepsY
	}
    }
    
    public static int method1965(int arg0, int arg1, byte arg2) {
	anInt2594++;
	if (arg2 >= -81)
	    return 118;
	Class67_Sub8 class67_sub8
	    = ((Class67_Sub8)
	       Class86.aClass92_1755.method1489((byte) -88, (long) arg0));
	if (class67_sub8 == null)
	    return 0;
	if ((arg1 ^ 0xffffffff) > -1
	    || arg1 >= class67_sub8.anIntArray2961.length)
	    return 0;
	return class67_sub8.anIntArray2961[arg1];
    }
    
    public static void method1966(int arg0) {
	aClass67_Sub5_Sub7Array2586 = null;
	aClass14_2603 = null;
	aRSString_2605 = null;
	aRSString_2604 = null;
	aByteArrayArray2602 = null;
	aClass136_2599 = null;
	aRSString_2598 = null;
	aClass40_2588 = null;
	int i = 107 % ((34 - arg0) / 61);
    }
    
    public int[][] method1967(byte arg0) {
	anInt2593++;
	if (arg0 < 33)
	    anInt2601 = 95;
	if ((anInt2591 ^ 0xffffffff) != (anInt2601 ^ 0xffffffff))
	    throw new RuntimeException("Can only retrieve a full image cache");
	for (int i = 0; (anInt2601 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
	    aClass67_Sub15Array2597[i]
		= Class67_Sub1_Sub26.aClass67_Sub15_4232;
	return anIntArrayArray2606;
    }
    
    public static boolean method1968(int arg0, int arg1, int arg2, int arg3) {
	if (!Class13.method154(arg0, arg1, arg2))
	    return false;
	int i = arg1 << 7;
	int i_4_ = arg2 << 7;
	int i_5_ = Class136.anIntArrayArrayArray2496[arg0][arg1][arg2] - 1;
	int i_6_ = i_5_ - 120;
	int i_7_ = i_5_ - 230;
	int i_8_ = i_5_ - 238;
	if (arg3 < 16) {
	    if (arg3 == 1) {
		if (i > Class67_Sub16.anInt3080) {
		    if (!Class124.method1701(i, i_5_, i_4_))
			return false;
		    if (!Class124.method1701(i, i_5_, i_4_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class124.method1701(i, i_6_, i_4_))
			return false;
		    if (!Class124.method1701(i, i_6_, i_4_ + 128))
			return false;
		}
		if (!Class124.method1701(i, i_7_, i_4_))
		    return false;
		if (!Class124.method1701(i, i_7_, i_4_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 2) {
		if (i_4_ < PacketParser.anInt2120) {
		    if (!Class124.method1701(i, i_5_, i_4_ + 128))
			return false;
		    if (!Class124.method1701(i + 128, i_5_, i_4_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class124.method1701(i, i_6_, i_4_ + 128))
			return false;
		    if (!Class124.method1701(i + 128, i_6_, i_4_ + 128))
			return false;
		}
		if (!Class124.method1701(i, i_7_, i_4_ + 128))
		    return false;
		if (!Class124.method1701(i + 128, i_7_, i_4_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 4) {
		if (i < Class67_Sub16.anInt3080) {
		    if (!Class124.method1701(i + 128, i_5_, i_4_))
			return false;
		    if (!Class124.method1701(i + 128, i_5_, i_4_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class124.method1701(i + 128, i_6_, i_4_))
			return false;
		    if (!Class124.method1701(i + 128, i_6_, i_4_ + 128))
			return false;
		}
		if (!Class124.method1701(i + 128, i_7_, i_4_))
		    return false;
		if (!Class124.method1701(i + 128, i_7_, i_4_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 8) {
		if (i_4_ > PacketParser.anInt2120) {
		    if (!Class124.method1701(i, i_5_, i_4_))
			return false;
		    if (!Class124.method1701(i + 128, i_5_, i_4_))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class124.method1701(i, i_6_, i_4_))
			return false;
		    if (!Class124.method1701(i + 128, i_6_, i_4_))
			return false;
		}
		if (!Class124.method1701(i, i_7_, i_4_))
		    return false;
		if (!Class124.method1701(i + 128, i_7_, i_4_))
		    return false;
		return true;
	    }
	}
	if (!Class124.method1701(i + 64, i_8_, i_4_ + 64))
	    return false;
	if (arg3 == 16) {
	    if (!Class124.method1701(i, i_7_, i_4_ + 128))
		return false;
	    return true;
	}
	if (arg3 == 32) {
	    if (!Class124.method1701(i + 128, i_7_, i_4_ + 128))
		return false;
	    return true;
	}
	if (arg3 == 64) {
	    if (!Class124.method1701(i + 128, i_7_, i_4_))
		return false;
	    return true;
	}
	if (arg3 == 128) {
	    if (!Class124.method1701(i, i_7_, i_4_))
		return false;
	    return true;
	}
	return true;
    }
    
    public Class144(int arg0, int arg1, int arg2) {
	anInt2601 = arg0;
	anIntArrayArray2606 = new int[anInt2601][arg2];
	anInt2591 = arg1;
	aClass67_Sub15Array2597 = new Class67_Sub15[anInt2591];
    }
    
    static {
	aClass67_Sub5_Sub7Array2586 = new Class67_Sub5_Sub7[14];
	aByteArrayArray2602 = new byte[250][];
	aClass136_2599 = new Class136(4);
	aClass14_2603 = new Class14();
	aRSString_2604
	    = (Class134.method1914
	       ("Your ignore list is full)3 Max of 100 users)3", (byte) 86));
	aRSString_2605 = aRSString_2604;
    }
}
