/* Class67_Sub1_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub22 extends Class67_Sub1
{
    public static int anInt4169;
    public static RSString aRSString_4170;
    public static int anInt4171;
    public static int anInt4172 = 0;
    public static int anInt4173;
    public static int anInt4174;
    public static int anInt4175;
    public static int anInt4176;
    public static int anInt4177;
    public static long[] aLongArray4178;
    public static int anInt4179;
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 == true) {
	    if (arg2 == 0)
		aBoolean2839 = arg0.readByte((byte) 82) == 1;
	    anInt4169++;
	}
    }
    
    public int[] method611(int arg0, byte arg1) {
	if (arg1 != 55)
	    method611(-117, (byte) 84);
	anInt4173++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int[] is_0_ = this.method613(0, arg0, false);
	    for (int i = 0; i < Class67_Sub5_Sub7.anInt4569; i++)
		is[i] = 4096 + -is_0_[i];
	}
	return is;
    }
    
    public static int method720(int arg0) {
	anInt4179++;
	if (arg0 < 15)
	    aLongArray4178 = null;
	return Class67_Sub1_Sub12.anInt4014;
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	int[][] is = aClass103_2830.method1551(arg1, 118);
	if (aClass103_2830.aBoolean2030) {
	    int[][] is_1_ = this.method609(arg1, !arg0, 0);
	    int[] is_2_ = is_1_[0];
	    int[] is_3_ = is_1_[1];
	    int[] is_4_ = is_1_[2];
	    int[] is_5_ = is[0];
	    int[] is_6_ = is[1];
	    int[] is_7_ = is[2];
	    for (int i = 0;
		 (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		is_5_[i] = 4096 - is_2_[i];
		is_6_[i] = -is_3_[i] + 4096;
		is_7_[i] = -is_4_[i] + 4096;
	    }
	}
	if (arg0 != true)
	    aLongArray4178 = null;
	anInt4176++;
	return is;
    }
    
    public static void method721(int arg0) {
	anInt4171++;
	Class67_Sub1_Sub37.aClass136_4388.method1922(arg0 + 19933);
	Class33_Sub2.aClass136_2775.method1922(arg0 ^ arg0);
    }
    
    public static void method722(int arg0) {
	aRSString_4170 = null;
	if (arg0 < 122)
	    method722(-123);
	aLongArray4178 = null;
    }
    
    public Class67_Sub1_Sub22() {
	super(1, false);
    }
    
    public static void method723(boolean arg0, byte arg1) {
	Class67_Sub23.anIntArrayArrayArray3211 = null;
	if (arg0 && Class114.aClass67_Sub5_Sub6_2155 != null)
	    Class102.aRSString_1997
		= Class114.aClass67_Sub5_Sub6_2155.aRSString_4553;
	else
	    Class102.aRSString_1997 = null;
	Class67_Sub5_Sub1.aByteArrayArrayArray4458 = null;
	Class114.aClass67_Sub5_Sub6_2155 = null;
	anInt4177++;
	Class49.aByteArrayArrayArray1005 = null;
	Class120.anIntArrayArrayArray2287 = null;
	Class87.aByteArrayArrayArray1783 = null;
	Class67_Sub1_Sub16_Sub1.anIntArray5098 = null;
	Class115.anInt2185 = 0;
	Class6.anIntArrayArrayArray148 = null;
	Class53.aByteArrayArrayArray1062 = null;
	Class67_Sub1_Sub9.aByteArrayArrayArray3956 = null;
	Class86.aClass7_1759 = null;
	Class67_Sub25.aClass50_3251.method437((byte) 127);
	Class33.anInt732 = -1;
	Class55_Sub2.aSprite_2799 = null;
	Class131_Sub4.aSprite_3650 = null;
	Class67_Sub16.aSprite_3093 = null;
	Class68.aClass72_1369 = null;
	Class67_Sub5_Sub16.anInt4776 = -1;
	Class67_Sub26.aSprite_3290 = null;
	Class108.aSprite_2076 = null;
	Class57.aSprite_1112 = null;
	Class67_Sub5_Sub6.aClass67_Sub5_Sub19_4546 = null;
	Class131_Sub5.aSprite_3686 = null;
	int i = 38 % ((59 - arg1) / 46);
	Class67_Sub1_Sub23.aSprite_4186 = null;
    }
    
    public static void method724(int arg0, int arg1) {
	anInt4175++;
	if (arg1 < 103)
	    aLongArray4178 = null;
	if ((Class67_Sub11_Sub4.anInt4888 ^ 0xffffffff) != -1)
	    Class57.anInt1111 = arg0;
	else
	    Class136.aClass67_Sub11_Sub4_2485.method1199(arg0, 122);
    }
    
    public static void method725(Class9 arg0, int arg1) {
	anInt4174++;
	if (arg1 == -26442)
	    Class142.anInt2570
		= arg0.method126((byte) -119, Class41.aRSString_884);
    }
    
    static {
	aRSString_4170 = Class134.method1914("(U0a )2 via: ", (byte) 96);
	aLongArray4178 = new long[1000];
    }
}
