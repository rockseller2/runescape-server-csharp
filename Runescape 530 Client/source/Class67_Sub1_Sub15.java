/* Class67_Sub1_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class67_Sub1_Sub15 extends Class67_Sub1
{
    public int anInt4048 = 16;
    public static int anInt4049;
    public static int[] anIntArray4050 = new int[32];
    public static Class9 aClass9_4051;
    public int anInt4052 = 0;
    public static int[] anIntArray4053;
    public static int anInt4054;
    public int anInt4055;
    public static int anInt4056;
    public static RSString aRSString_4057
	= Class134.method1914(" GMT", (byte) 102);
    public int anInt4058 = 4096;
    public int anInt4059 = 0;
    public static int anInt4060;
    public static int anInt4061;
    public static int anInt4062;
    public static int anInt4063;
    public static int anInt4064;
    
    public Class67_Sub1_Sub15() {
	super(0, true);
	anInt4055 = 2000;
    }
    
    public static void method681(byte arg0) {
	anIntArray4053 = null;
	aRSString_4057 = null;
	anIntArray4050 = null;
	if (arg0 <= 89)
	    anIntArray4053 = null;
	aClass9_4051 = null;
    }
    
    public int[] method611(int arg0, byte arg1) {
	if (arg1 != 55)
	    method623(null, true, 94);
	anInt4060++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int i = anInt4058 >> -1990026239;
	    int[][] is_0_ = aClass144_2836.method1967((byte) 103);
	    Random random = new Random((long) anInt4059);
	    for (int i_1_ = 0; anInt4055 > i_1_; i_1_++) {
		int i_2_
		    = (anInt4058 <= 0 ? anInt4052
		       : (anInt4052
			  - (i + -Class67_Sub1_Sub37.method793(0, random,
							       anInt4058))));
		i_2_ = 0xff & i_2_ >> 1254422724;
		int i_3_
		    = Class67_Sub1_Sub37
			  .method793(118, random, Class67_Sub5_Sub7.anInt4569);
		int i_4_ = Class67_Sub1_Sub37.method793(125, random,
							(RuntimeException_Sub1
							 .anInt2618));
		int i_5_ = ((Class67_Sub3.anIntArray2845[i_2_] * anInt4048
			     >> -1392360468)
			    + i_3_);
		int i_6_ = i_5_ - i_3_;
		int i_7_
		    = ((Class51.anIntArray1040[i_2_] * anInt4048 >> 204922188)
		       + i_4_);
		int i_8_ = i_7_ + -i_4_;
		if (i_6_ != 0 || (i_8_ ^ 0xffffffff) != -1) {
		    if (i_8_ < 0)
			i_8_ = -i_8_;
		    if ((i_6_ ^ 0xffffffff) > -1)
			i_6_ = -i_6_;
		    boolean bool = (i_8_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
		    if (bool) {
			int i_9_ = i_5_;
			int i_10_ = i_3_;
			i_5_ = i_7_;
			i_7_ = i_9_;
			i_3_ = i_4_;
			i_4_ = i_10_;
		    }
		    if (i_5_ < i_3_) {
			int i_11_ = i_3_;
			i_3_ = i_5_;
			int i_12_ = i_4_;
			i_4_ = i_7_;
			i_7_ = i_12_;
			i_5_ = i_11_;
		    }
		    int i_13_ = i_4_;
		    int i_14_ = i_7_ - i_4_;
		    int i_15_ = i_5_ + -i_3_;
		    if ((i_14_ ^ 0xffffffff) > -1)
			i_14_ = -i_14_;
		    int i_16_ = 2048 / i_15_;
		    int i_17_ = -i_15_ / 2;
		    int i_18_
			= (i_7_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff) ? 1 : -1;
		    int i_19_
			= (1024
			   + -(Class67_Sub1_Sub37.method793(-69, random, 4096)
			       >> -66515934));
		    for (int i_20_ = i_3_;
			 (i_20_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_20_++) {
			i_17_ += i_14_;
			int i_21_ = i_20_ & Class76.anInt1581;
			int i_22_ = i_13_ & Class67_Sub1_Sub36.anInt4381;
			if ((i_17_ ^ 0xffffffff) < -1) {
			    i_17_ -= i_15_;
			    i_13_ -= -i_18_;
			}
			int i_23_ = i_19_ - -1024 - -(i_16_ * (-i_3_ + i_20_));
			if (bool)
			    is_0_[i_22_][i_21_] = i_23_;
			else
			    is_0_[i_21_][i_22_] = i_23_;
		    }
		}
	    }
	}
	return is;
    }
    
    public void method618(int arg0) {
	anInt4054++;
	Class67_Sub1_Sub7.method645(-124);
	int i = 47 / ((-60 - arg0) / 62);
    }
    
    public static void method682(int arg0) {
	Class67_Sub1_Sub25.aClass136_4224.method1922(0);
	anInt4049++;
	Class67_Sub5_Sub9.aClass136_4612.method1922(0);
	if (arg0 >= -1)
	    method682(45);
    }
    
    public static void method683(byte arg0, int arg1, int arg2, int arg3,
				 int arg4, boolean arg5) {
	anInt4061++;
	Class6.anInt151++;
	Class67_Sub9.method1112(3658);
	if (!arg5) {
	    Class123.method1699(arg0 + -34, true);
	    Class92.method1486(true, -14896);
	    Class123.method1699(121, false);
	}
	Class92.method1486(false, arg0 ^ ~0x3a59);
	if (!arg5)
	    Class104.method1560(arg0 + -32);
	Class86.method1455(1);
	if (Class22.anInt530 == 1) {
	    int i = Class67_Sub21.anInt3175;
	    int i_24_ = (Class67_Sub5_Sub4.anInt4504 - -Class55_Sub1.anInt2790
			 & 0x7ff);
	    if ((Class67_Sub5_Sub13.anInt4728 / 256 ^ 0xffffffff)
		< (i ^ 0xffffffff))
		i = Class67_Sub5_Sub13.anInt4728 / 256;
	    if (Class107.aBooleanArray2074[4]
		&& (i ^ 0xffffffff) > (Class44.anIntArray921[4] + 128
				       ^ 0xffffffff))
		i = Class44.anIntArray921[4] + 128;
	    Class57.method489((Class131_Sub5.method1826
			       (Canvas_Sub1.anInt59,
				Class122.aClass131_Sub7_Sub2_2309.anInt3733,
				Class122.aClass131_Sub7_Sub2_2309.anInt3726,
				(byte) 98)) + -50,
			      arg0 + -8, 600 + i * 3, i_24_,
			      Class67_Sub5_Sub13.anInt4714, i, arg1,
			      Class6.anInt153);
	}
	int i = Class114.anInt2160;
	int i_25_ = Class86.anInt1760;
	if (arg0 == 118) {
	    int i_26_ = Class129.anInt2395;
	    int i_27_ = Class67_Sub1_Sub2.anInt3839;
	    int i_28_ = Class67_Sub23.anInt3196;
	    for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -6; i_29_++) {
		if (Class107.aBooleanArray2074[i_29_]) {
		    int i_30_
			= (int) (Math.random() * (double) (1 + (Class82
								.anIntArray1664
								[i_29_]) * 2)
				 - (double) Class82.anIntArray1664[i_29_]
				 + (Math.sin((double) (Class83.anIntArray1673
						       [i_29_])
					     / 100.0
					     * (double) (Class18.anIntArray2732
							 [i_29_]))
				    * (double) Class44.anIntArray921[i_29_]));
		    if ((i_29_ ^ 0xffffffff) == -2)
			Class86.anInt1760 += i_30_;
		    if (i_29_ == 4) {
			Class67_Sub1_Sub2.anInt3839 += i_30_;
			if ((Class67_Sub1_Sub2.anInt3839 ^ 0xffffffff) > -129)
			    Class67_Sub1_Sub2.anInt3839 = 128;
			if ((Class67_Sub1_Sub2.anInt3839 ^ 0xffffffff) < -384)
			    Class67_Sub1_Sub2.anInt3839 = 383;
		    }
		    if ((i_29_ ^ 0xffffffff) == -1)
			Class114.anInt2160 += i_30_;
		    if (i_29_ == 3)
			Class67_Sub23.anInt3196
			    = Class67_Sub23.anInt3196 - -i_30_ & 0x7ff;
		    if (i_29_ == 2)
			Class129.anInt2395 += i_30_;
		}
	    }
	    Class126_Sub2.method1719(true);
	    Class121.method1685(arg4, arg3, arg4 - -arg2, arg3 + arg1);
	    Class26.method239();
	    if (!Class67_Sub9.aBoolean2980
		&& (arg4 ^ 0xffffffff) >= (Class136.anInt2486 ^ 0xffffffff)
		&& (Class136.anInt2486 ^ 0xffffffff) > (arg2 + arg4
							^ 0xffffffff)
		&& arg3 <= Class129.anInt2398
		&& arg3 + arg1 > Class129.anInt2398) {
		Class27.anInt641 = 0;
		int i_31_ = Class101.anInt1990;
		int i_32_ = Class67_Sub1_Sub34.anInt4336;
		PacketParser.anInt2107
		    = ((-i_31_ + i_32_) * (Class136.anInt2486 + -arg4) / arg2
		       + i_31_);
		int i_33_ = Applet_Sub1.anInt12;
		Class96.aBoolean1924 = true;
		int i_34_ = Class49.anInt1011;
		Class129.anInt2392
		    = i_33_ + ((-i_33_ + i_34_) * (-arg3 + Class129.anInt2398)
			       / arg1);
	    } else {
		Class96.aBoolean1924 = false;
		Class27.anInt641 = 0;
	    }
	    Class132.method1901(64);
	    byte i_35_ = ((OutputStream_Sub1.method59(0) ^ 0xffffffff) != -3
			  ? (byte) 1 : (byte) Class6.anInt151);
	    Class121.method1683(arg4, arg3, arg2, arg1, 0);
	    Class67_Sub5_Sub4_Sub2.method862
		(Class114.anInt2160, Class86.anInt1760, Class129.anInt2395,
		 Class67_Sub1_Sub2.anInt3839, Class67_Sub23.anInt3196,
		 ObjectDef.aByteArrayArrayArray3518,
		 Class67_Sub1_Sub23.anIntArray4180,
		 Class67_Sub5_Sub19.anIntArray4823,
		 Class67_Sub5_Sub6.anIntArray4545,
		 Class67_Sub5_Sub3.anIntArray4490,
		 OutputStream_Sub1.anIntArray93, 1 + Canvas_Sub1.anInt59,
		 i_35_,
		 Class122.aClass131_Sub7_Sub2_2309.anInt3733 >> 1322889863,
		 Class122.aClass131_Sub7_Sub2_2309.anInt3726 >> 1091803623);
	    Class132.method1901(arg0 + -54);
	    Class105.method1565();
	    Class137.method1927(arg3, 256, arg4, 256, arg2, arg1, 20);
	    Class9.method137(256, arg4, arg2, arg0 ^ ~0x76, arg1, 256, arg3);
	    ((Class75) Class26.anInterface3_623).method1378(RSString.anInt2642,
							    (byte) -33);
	    Class67_Sub1_Sub23.method728(arg2, arg1, arg4, arg3, arg0 ^ ~0x2f);
	    Class67_Sub1_Sub2.anInt3839 = i_27_;
	    Class86.anInt1760 = i_25_;
	    Class129.anInt2395 = i_26_;
	    Class114.anInt2160 = i;
	    Class67_Sub23.anInt3196 = i_28_;
	    if (Class64.aBoolean1221
		&& Class144.aClass40_2588.method346((byte) -105) == 0)
		Class64.aBoolean1221 = false;
	    if (Class64.aBoolean1221) {
		Class121.method1683(arg4, arg3, arg2, arg1, 0);
		Class67_Sub1_Sub35.method775(Class67_Sub22.aRSString_3182,
					     false, (byte) -48);
	    }
	    if (!arg5 && !Class64.aBoolean1221 && !Class67_Sub9.aBoolean2980
		&& (Class136.anInt2486 ^ 0xffffffff) <= (arg4 ^ 0xffffffff)
		&& arg4 + arg2 > Class136.anInt2486
		&& (arg3 ^ 0xffffffff) >= (Class129.anInt2398 ^ 0xffffffff)
		&& Class129.anInt2398 < arg1 + arg3)
		Class67_Sub5_Sub13.method959(arg3, Class136.anInt2486, -127,
					     arg2, arg1, Class129.anInt2398,
					     arg4);
	}
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 == true) {
	    int i = arg2;
	while_56_:
	    do {
	    while_55_:
		do {
		while_54_:
		    do {
			do {
			    if ((i ^ 0xffffffff) != -1) {
				if ((i ^ 0xffffffff) != -2) {
				    if ((i ^ 0xffffffff) != -3) {
					if ((i ^ 0xffffffff) != -4) {
					    if (i == 4)
						break while_55_;
					    break while_56_;
					}
				    } else
					break;
				    break while_54_;
				}
			    } else {
				anInt4059 = arg0.readByte((byte) 119);
				break while_56_;
			    }
			    anInt4055 = arg0.readUShort(-2386);
			    break while_56_;
			} while (false);
			anInt4048 = arg0.readByte((byte) 117);
			break while_56_;
		    } while (false);
		    anInt4052 = arg0.readUShort(-2386);
		    break while_56_;
		} while (false);
		anInt4058 = arg0.readUShort(-2386);
	    } while (false);
	    anInt4056++;
	}
    }
    
    static {
	anIntArray4053 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	int i = 2;
	for (int i_36_ = 0; i_36_ < 32; i_36_++) {
	    anIntArray4050[i_36_] = i + -1;
	    i += i;
	}
	anInt4062 = 0;
	anInt4063 = 0;
	anInt4064 = 2;
    }
}
