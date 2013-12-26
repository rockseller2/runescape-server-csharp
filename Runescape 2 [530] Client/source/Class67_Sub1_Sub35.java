/* Class67_Sub1_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public class Class67_Sub1_Sub35 extends Class67_Sub1
{
    public static int[] anIntArray4338;
    public int anInt4339;
    public static int anInt4340 = 0;
    public static int anInt4341;
    public static RSString aRSString_4342;
    public static int anInt4343;
    public static int[] anIntArray4344;
    public static int anInt4345;
    public int[] anIntArray4346;
    public int anInt4347 = 10;
    public static int[] anIntArray4348;
    public static int anInt4349;
    public static int anInt4350;
    public int[] anIntArray4351;
    public static RSString aRSString_4352;
    public static int anInt4353;
    public static RSString aRSString_4354;
    public static int anInt4355;
    public int anInt4356;
    public static byte[][] aByteArrayArray4357;
    public static int anInt4358;
    public static int anInt4359;
    public static int anInt4360;
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt4343++;
	if (arg1 != true)
	    anIntArray4344 = null;
	int i = arg2;
    while_124_:
	do {
	    do {
		if (i != 0) {
		    if (i != 1) {
			if ((i ^ 0xffffffff) == -3)
			    break;
			break while_124_;
		    }
		} else {
		    anInt4347 = arg0.readByte((byte) 99);
		    return;
		}
		anInt4356 = arg0.readUShort(-2386);
		return;
	    } while (false);
	    anInt4339 = arg0.readByte((byte) 82);
	} while (false);
    }
    
    public static void method774(int arg0) {
	anInt4349++;
	int i = Class75.aByteArrayArray2704.length;
	if (arg0 != 63)
	    method781(11);
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    if (Class75.aByteArrayArray2704[i_0_] != null) {
		int i_1_ = -1;
		for (int i_2_ = 0; Class70_Sub1.anInt3374 > i_2_; i_2_++) {
		    if ((Class130.anIntArray2415[i_2_] ^ 0xffffffff)
			== (Class108.anIntArray2083[i_0_] ^ 0xffffffff)) {
			i_1_ = i_2_;
			break;
		    }
		}
		if (i_1_ == -1) {
		    Class130.anIntArray2415[Class70_Sub1.anInt3374]
			= Class108.anIntArray2083[i_0_];
		    i_1_ = Class70_Sub1.anInt3374++;
		}
		Stream Stream
		    = new Stream(Class75.aByteArrayArray2704[i_0_]);
		int i_3_ = 0;
		while ((Class75.aByteArrayArray2704[i_0_].length ^ 0xffffffff)
		       < (Stream.currentOffset ^ 0xffffffff)) {
		    if ((i_3_ ^ 0xffffffff) <= -512)
			break;
		    int i_4_ = i_1_ | i_3_++ << -114676730;
		    int i_5_ = Stream.readUShort(-2386);
		    int i_6_ = i_5_ >> -246814834;
		    int i_7_ = 0x3f & i_5_ >> -743656121;
		    int i_8_ = 0x3f & i_5_;
		    int i_9_
			= (i_7_
			   + 64 * (Class108.anIntArray2083[i_0_] >> -397218360)
			   + -Class58.baseX);
		    int i_10_
			= (i_8_ + 64 * (Class108.anIntArray2083[i_0_] & 0xff)
			   - Class137.baseY);
		    Class64 class64
			= Class133.method1908(Stream.readUShort(-2386),
					      107);
		    if (Class128.aClass131_Sub7_Sub1Array2386[i_4_] == null
			&& (class64.aByte1209 & 0x1) > 0
			&& i_6_ == Class116.anInt2197
			&& (i_9_ ^ 0xffffffff) <= -1
			&& i_9_ - -class64.anInt1211 < 104
			&& (i_10_ ^ 0xffffffff) <= -1
			&& (class64.anInt1211 + i_10_ ^ 0xffffffff) > -105) {
			Class128.aClass131_Sub7_Sub1Array2386[i_4_]
			    = new Class131_Sub7_Sub1();
			Class131_Sub7_Sub1 class131_sub7_sub1
			    = Class128.aClass131_Sub7_Sub1Array2386[i_4_];
			Class47.anIntArray965[Class37.anInt794++] = i_4_;
			class131_sub7_sub1.anInt3789
			    = Class67_Sub1_Sub9.anInt3952;
			class131_sub7_sub1.method1891((byte) -51, class64);
			class131_sub7_sub1.method1883(0, (class131_sub7_sub1
							  .aClass64_5047
							  .anInt1211));
			class131_sub7_sub1.anInt3721
			    = class131_sub7_sub1.anInt3740
			    = (Class118.anIntArray2235
			       [class131_sub7_sub1.aClass64_5047.aByte1219]);
			class131_sub7_sub1.anInt3691
			    = class131_sub7_sub1.aClass64_5047.anInt1191;
			class131_sub7_sub1.playerAnims
			    = class131_sub7_sub1.aClass64_5047.anInt1189;
			if ((class131_sub7_sub1.anInt3691 ^ 0xffffffff) == -1)
			    class131_sub7_sub1.anInt3740 = 0;
			class131_sub7_sub1.method1877
			    (class131_sub7_sub1.method1887((byte) -87), i_10_,
			     (byte) 29, i_9_, true);
		    }
		}
	    }
	}
    }
    
    public int[] method611(int arg0, byte arg1) {
	if (arg1 != 55)
	    anIntArray4346 = null;
	anInt4358++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int i = Class19.anIntArray490[arg0];
	    if ((anInt4339 ^ 0xffffffff) != -1) {
		for (int i_11_ = 0; ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
				     < (i_11_ ^ 0xffffffff)); i_11_++) {
		    int i_12_ = anIntArray4344[i_11_];
		    int i_13_ = 0;
		    int i_14_ = 0;
		    int i_15_ = anInt4339;
		while_125_:
		    do {
			do {
			    if (i_15_ != 1) {
				if (i_15_ != 2) {
				    if (i_15_ == 3)
					break;
				    break while_125_;
				}
			    } else {
				i_13_ = i_12_;
				break while_125_;
			    }
			    i_13_ = 2048 + (i_12_ + i + -4096 >> -279482495);
			    break while_125_;
			} while (false);
			i_13_ = 2048 + (i_12_ - i >> 34285473);
		    } while (false);
		    for (i_15_ = 0; anInt4347 > i_15_; i_15_++) {
			if (i_13_ >= anIntArray4351[i_15_]
			    && i_13_ < anIntArray4351[i_15_ + 1]) {
			    if (i_13_ < anIntArray4346[i_15_])
				i_14_ = 4096;
			    break;
			}
		    }
		    is[i_11_] = i_14_;
		}
	    } else {
		int i_16_ = 0;
		for (int i_17_ = 0; i_17_ < anInt4347; i_17_++) {
		    if ((i ^ 0xffffffff) <= (anIntArray4351[i_17_]
					     ^ 0xffffffff)
			&& (i ^ 0xffffffff) > (anIntArray4351[i_17_ - -1]
					       ^ 0xffffffff)) {
			if ((i ^ 0xffffffff)
			    > (anIntArray4346[i_17_] ^ 0xffffffff))
			    i_16_ = 4096;
			break;
		    }
		}
		Class17.method184(is, 0, Class67_Sub5_Sub7.anInt4569, i_16_);
	    }
	}
	return is;
    }
    
    public Class67_Sub1_Sub35() {
	super(0, true);
	anInt4339 = 0;
	anInt4356 = 2048;
    }
    
    public static void method775(RSString arg0, boolean arg1, byte arg2) {
	anInt4360++;
	if (arg2 < -27) {
	    int i = 4;
	    int i_18_ = i + 6;
	    int i_19_ = 6 - -i;
	    int i_20_ = Class143.aClass67_Sub5_Sub10_2583.method904(arg0, 250);
	    int i_21_
		= Class143.aClass67_Sub5_Sub10_2583.method901(arg0, 250) * 13;
	    Class121.method1683(-i + i_18_, i_19_ - i, i_20_ + (i + i),
				i + (i + i_21_), 0);
	    Class121.method1681(-i + i_18_, i_19_ - i, i + i_20_ - -i,
				i + i + i_21_, 16777215);
	    Class143.aClass67_Sub5_Sub10_2583.method905(arg0, i_18_, i_19_,
							i_20_, i_21_, 16777215,
							-1, 1, 1, 0);
	    Class132.method1903(i + i + i_21_, -i + i_18_, i + i_20_ + i, 0,
				i_19_ + -i);
	    if (!arg1)
		Class67_Sub1_Sub29.method754(i_19_, i_21_, i_20_, -356, i_18_);
	    else {
		try {
		    Graphics graphics
			= Class67_Sub5_Sub12.aCanvas4698.getGraphics();
		    PacketParser.aClass99_2119.method1518(1000, 0, 0, graphics);
		} catch (Exception exception) {
		    Class67_Sub5_Sub12.aCanvas4698.repaint();
		}
	    }
	}
    }
    
    public static void method776(int arg0) {
	anInt4345++;
	for (int i = -1; i < Class67_Sub1_Sub4.anInt3855; i++) {
	    int i_22_;
	    if ((i ^ 0xffffffff) != 0)
		i_22_ = Class3.anIntArray120[i];
	    else
		i_22_ = 2047;
	    Class131_Sub7_Sub2 class131_sub7_sub2
		= Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_22_];
	    if (class131_sub7_sub2 != null)
		Class50.method435(-1,
				  class131_sub7_sub2.method1887((byte) -21),
				  class131_sub7_sub2);
	}
	if (arg0 != 10046)
	    method775(null, true, (byte) -68);
    }
    
    public static void method777(int arg0) {
	if (arg0 > -48)
	    method781(-55);
	anInt4353++;
	Class15.aClass136_451.method1921((byte) -112);
	Class67_Sub1_Sub7.aClass136_3901.method1921((byte) 65);
	Class19.aClass136_488.method1921((byte) 21);
    }
    
    public static Class126_Sub1 method778(Stream arg0, int arg1) {
	if (arg1 != 0)
	    return null;
	anInt4341++;
	return new Class126_Sub1(arg0.readShort2((byte) 72),
				 arg0.readShort2((byte) 77),
				 arg0.readShort2((byte) 96),
				 arg0.readShort2((byte) 120),
				 arg0.readThreeBytes(65280),
				 arg0.readThreeBytes(65280),
				 arg0.readByte((byte) 105));
    }
    
    public void method779(boolean arg0) {
	anIntArray4351 = new int[1 + anInt4347];
	anInt4359++;
	int i = 0;
	anIntArray4346 = new int[1 + anInt4347];
	int i_23_ = 4096 / anInt4347;
	int i_24_ = anInt4356 * i_23_ >> -454371092;
	for (int i_25_ = 0; anInt4347 > i_25_; i_25_++) {
	    anIntArray4351[i_25_] = i;
	    anIntArray4346[i_25_] = i + i_24_;
	    i += i_23_;
	}
	if (arg0 != true)
	    method780(null, -11, -107, 124, 84, 40);
	anIntArray4351[anInt4347] = 4096;
	anIntArray4346[anInt4347] = anIntArray4346[0] + 4096;
    }
    
    public static void method780(int[] arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg3][arg4][arg5];
	if (class67_sub24 != null) {
	    Class84 class84 = class67_sub24.aClass84_3227;
	    if (class84 != null) {
		int i = class84.anInt1703;
		if (i != 0) {
		    for (int i_26_ = 0; i_26_ < 4; i_26_++) {
			arg0[arg1] = i;
			arg0[arg1 + 1] = i;
			arg0[arg1 + 2] = i;
			arg0[arg1 + 3] = i;
			arg1 += arg2;
		    }
		}
	    } else {
		Class71 class71 = class67_sub24.aClass71_3219;
		if (class71 != null) {
		    int i = class71.anInt1422;
		    int i_27_ = class71.anInt1410;
		    int i_28_ = class71.anInt1421;
		    int i_29_ = class71.anInt1423;
		    int[] is = Class44.anIntArrayArray924[i];
		    int[] is_30_ = PacketParser.anIntArrayArray2117[i_27_];
		    int i_31_ = 0;
		    if (i_28_ != 0) {
			for (int i_32_ = 0; i_32_ < 4; i_32_++) {
			    arg0[arg1]
				= is[is_30_[i_31_++]] == 0 ? i_28_ : i_29_;
			    arg0[arg1 + 1]
				= is[is_30_[i_31_++]] == 0 ? i_28_ : i_29_;
			    arg0[arg1 + 2]
				= is[is_30_[i_31_++]] == 0 ? i_28_ : i_29_;
			    arg0[arg1 + 3]
				= is[is_30_[i_31_++]] == 0 ? i_28_ : i_29_;
			    arg1 += arg2;
			}
		    } else {
			for (int i_33_ = 0; i_33_ < 4; i_33_++) {
			    if (is[is_30_[i_31_++]] != 0)
				arg0[arg1] = i_29_;
			    if (is[is_30_[i_31_++]] != 0)
				arg0[arg1 + 1] = i_29_;
			    if (is[is_30_[i_31_++]] != 0)
				arg0[arg1 + 2] = i_29_;
			    if (is[is_30_[i_31_++]] != 0)
				arg0[arg1 + 3] = i_29_;
			    arg1 += arg2;
			}
		    }
		}
	    }
	}
    }
    
    public static void method781(int arg0) {
	aByteArrayArray4357 = null;
	anIntArray4338 = null;
	aRSString_4354 = null;
	if (arg0 != -8698)
	    method780(null, -10, 18, -7, -108, -22);
	aRSString_4342 = null;
	anIntArray4344 = null;
	aRSString_4352 = null;
	anIntArray4348 = null;
    }
    
    public void method618(int arg0) {
	anInt4350++;
	int i = 82 % ((-60 - arg0) / 62);
	method779(true);
    }
    
    static {
	anIntArray4338
	    = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };
	aRSString_4342
	    = Class134.method1914("Gestionnaire de saisie charg-B", (byte) 20);
	aRSString_4352 = Class134.method1914("hint_mapmarkers", (byte) 86);
	aRSString_4354 = Class134.method1914("Objet d(Wabonn-Bs", (byte) 63);
    }
}
