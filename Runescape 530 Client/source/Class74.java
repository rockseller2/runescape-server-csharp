/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class74
{
    public int anInt1482;
    public static int anInt1483;
    public static RSString aRSString_1484
	= Class134.method1914("floorshadows", (byte) 21);
    public static int anInt1485;
    public int anInt1486;
    public static RSString aRSString_1487;
    public static RSString aRSString_1488;
    public int anInt1489 = -1;
    public int anInt1490;
    public int anInt1491;
    public int anInt1492;
    public static int anInt1493;
    public int anInt1494;
    public static boolean aBoolean1495 = false;
    public int anInt1496;
    public static int[] anIntArray1497;
    public static int anInt1498;
    public int anInt1499;
    
    public static void method1373(int arg0) {
	anInt1483++;
	if ((Class67_Sub1_Sub23.anInt4182 ^ 0xffffffff) != 0
	    && (Class86.anInt1768 ^ 0xffffffff) != 0) {
	    int i = (Class67_Sub5_Sub5.anInt4514
		     - -(Class117.anInt2204 * (-Class67_Sub5_Sub5.anInt4514
					       + Class87.anInt1773)
			 >> 201640272));
	    Class117.anInt2204 += i;
	    if (Class117.anInt2204 >= 65535) {
		if (Class107.aBoolean2071)
		    Class125.aBoolean2336 = false;
		else
		    Class125.aBoolean2336 = true;
		Class117.anInt2204 = 65535;
		Class107.aBoolean2071 = true;
	    } else {
		Class107.aBoolean2071 = false;
		Class125.aBoolean2336 = false;
	    }
	    float f = (float) Class117.anInt2204 / 65535.0F;
	    int i_0_ = 2 * Class99_Sub1.anInt3403;
	    float[] fs = new float[3];
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -4; i_1_++) {
		int i_2_ = ((Class75.anIntArrayArrayArray2701
			     [Class67_Sub1_Sub23.anInt4182][i_0_][i_1_])
			    * 3);
		int i_3_ = ((Class75.anIntArrayArrayArray2701
			     [Class67_Sub1_Sub23.anInt4182][1 + i_0_][i_1_])
			    * 3);
		int i_4_
		    = 3 * (-(Class75.anIntArrayArrayArray2701
			     [Class67_Sub1_Sub23.anInt4182][i_0_ + 3][i_1_])
			   - (-(Class75.anIntArrayArrayArray2701
				[Class67_Sub1_Sub23.anInt4182][2 + i_0_][i_1_])
			      - (Class75.anIntArrayArrayArray2701
				 [Class67_Sub1_Sub23.anInt4182][2 + i_0_]
				 [i_1_])));
		int i_5_ = -i_2_ + i_3_;
		int i_6_ = -(2 * i_3_) + i_2_ + i_4_;
		int i_7_ = (Class75.anIntArrayArrayArray2701
			    [Class67_Sub1_Sub23.anInt4182][i_0_][i_1_]);
		int i_8_
		    = -i_7_ + ((Class75.anIntArrayArrayArray2701
				[Class67_Sub1_Sub23.anInt4182][2 + i_0_][i_1_])
			       + i_3_ + -i_4_);
		fs[i_1_] = (f * ((float) i_5_
				 + f * ((float) i_6_ + (float) i_8_ * f))
			    + (float) i_7_);
	    }
	    Class114.anInt2160 = (int) fs[0] - Class58.baseX * 128;
	    Class86.anInt1760 = (int) fs[1] * -1;
	    Class129.anInt2395 = -(Class137.baseY * 128) + (int) fs[2];
	    float[] fs_9_ = new float[3];
	    int i_10_ = 2 * Class67_Sub1_Sub28.anInt4258;
	    for (int i_11_ = 0; i_11_ < 3; i_11_++) {
		int i_12_ = ((Class75.anIntArrayArrayArray2701
			      [Class86.anInt1768][i_10_][i_11_])
			     * 3);
		int i_13_ = ((Class75.anIntArrayArrayArray2701
			      [Class86.anInt1768][1 + i_10_][i_11_])
			     * 3);
		int i_14_
		    = 3 * ((Class75.anIntArrayArrayArray2701[Class86.anInt1768]
			    [2 + i_10_][i_11_])
			   + (-(Class75.anIntArrayArrayArray2701
				[Class86.anInt1768][i_10_ + 3][i_11_])
			      + (Class75.anIntArrayArrayArray2701
				 [Class86.anInt1768][2 + i_10_][i_11_])));
		int i_15_ = (Class75.anIntArrayArrayArray2701
			     [Class86.anInt1768][i_10_][i_11_]);
		int i_16_ = i_13_ - i_12_;
		int i_17_ = i_12_ - (2 * i_13_ - i_14_);
		int i_18_ = ((Class75.anIntArrayArrayArray2701
			      [Class86.anInt1768][i_10_ - -2][i_11_])
			     + (-i_15_ + i_13_ - i_14_));
		fs_9_[i_11_] = ((f * (float) i_18_ + (float) i_17_) * f
				+ (float) i_16_) * f + (float) i_15_;
	    }
	    float f_19_ = -fs[0] + fs_9_[0];
	    float f_20_ = -1.0F * (-fs[1] + fs_9_[arg0]);
	    float f_21_ = -fs[2] + fs_9_[2];
	    double d = Math.sqrt((double) (f_19_ * f_19_ + f_21_ * f_21_));
	    Class106.aFloat2063 = (float) Math.atan2((double) f_20_, d);
	    Class126_Sub4.aFloat3456
		= -(float) Math.atan2((double) f_19_, (double) f_21_);
	    Class67_Sub1_Sub2.anInt3839
		= 0x7ff & (int) (325.949 * (double) Class106.aFloat2063);
	    Class67_Sub23.anInt3196
		= (int) (325.949 * (double) Class126_Sub4.aFloat3456) & 0x7ff;
	}
    }
    
    public static void method1374(boolean arg0) {
	aRSString_1488 = null;
	aRSString_1487 = null;
	aRSString_1484 = null;
	anIntArray1497 = null;
	if (arg0 != false)
	    anInt1485 = -105;
    }
    
    static {
	anInt1493 = 0;
	anIntArray1497 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
	aRSString_1488 = Class134.method1914("Allocating memory", (byte) 60);
	anInt1485 = 0;
	aRSString_1487 = aRSString_1488;
	anInt1498 = 0;
    }
}
