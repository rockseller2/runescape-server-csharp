/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class9
{
    public static int anInt351;
    public static int anInt352;
    public static int anInt353;
    public static int anInt354;
    public boolean aBoolean355;
    public static int anInt356;
    public static int anInt357;
    public static int anInt358;
    public static int anInt359;
    public static int anInt360;
    public static int anInt361;
    public static Class9 aClass9_362;
    public static int anInt363;
    public static int anInt364;
    public static int anInt365;
    public static int anInt366;
    public static short[] aShortArray367;
    public static int anInt368;
    public static RSString aRSString_369 = null;
    public Class129 aClass129_370;
    public static int anInt371;
    public static int anInt372;
    public Object[] anObjectArray373;
    public Class25 aClass25_374 = null;
    public static int anInt375;
    public static Class83 aClass83_376;
    public static Class7 aClass7_377;
    public static int anInt378;
    public static int anInt379;
    public static int anInt380;
    public static int anInt381;
    public static int anInt382;
    public static int anInt383;
    public static int anInt384;
    public static int anInt385;
    public static int anInt386;
    public static int anInt387;
    public static int anInt388;
    public boolean aBoolean389;
    public Object[][] anObjectArrayArray390;
    public static int anInt391;
    public static int anInt392;
    public static Class119_Sub1 aClass119_Sub1_393;
    public static int anInt394;
    public static int anInt395;
    
    public static void method104(int arg0) {
	aClass9_362 = null;
	aRSString_369 = null;
	aClass119_Sub1_393 = null;
	aClass83_376 = null;
	if (arg0 >= -21)
	    method106(111, -55, 78, -103);
	aClass7_377 = null;
	aShortArray367 = null;
    }
    
    public boolean method105(int arg0, RSString arg1) {
	if (arg0 != 256)
	    method135(-87, -120);
	anInt378++;
	if (!method112((byte) 10))
	    return false;
	arg1 = arg1.method496(8238);
	int i
	    = aClass25_374.aClass86_596.method1457(-128,
						   arg1.method511((byte) 31));
	return method134((byte) 109, i);
    }
    
    public static void method106(int arg0, int arg1, int arg2, int arg3) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 != null) {
	    Class94 class94 = class67_sub24.aClass94_3224;
	    if (class94 != null) {
		class94.anInt1893 = class94.anInt1893 * arg3 / 16;
		class94.anInt1897 = class94.anInt1897 * arg3 / 16;
	    }
	}
    }
    
    public int method107(int arg0) {
	if (arg0 != 21296)
	    aRSString_369 = null;
	anInt384++;
	if (!method112((byte) 10))
	    return -1;
	return aClass25_374.anIntArray593.length;
    }
    
    public boolean method108(RSString arg0, int arg1) {
	anInt368++;
	if (!method112((byte) 10))
	    return false;
	arg0 = arg0.method496(8238);
	int i
	    = aClass25_374.aClass86_596.method1457(-124,
						   arg0.method511((byte) 31));
	if (arg1 > i)
	    return false;
	return true;
    }
    
    public void method109(RSString arg0, byte arg1) {
	anInt359++;
	if (method112((byte) 10)) {
	    arg0 = arg0.method496(8238);
	    if (arg1 >= -117)
		method128(38, (byte) -84);
	    int i = aClass25_374.aClass86_596
			.method1457(-125, arg0.method511((byte) 31));
	    method127((byte) 58, i);
	}
    }
    
    public void method110(byte arg0, boolean arg1, boolean arg2) {
	anInt392++;
	int i = 58 % ((arg0 - 28) / 47);
	if (method112((byte) 10)) {
	    if (arg1) {
		aClass25_374.aClass86Array589 = null;
		aClass25_374.anIntArrayArray598 = null;
	    }
	    if (arg2) {
		aClass25_374.aClass86_596 = null;
		aClass25_374.anIntArray586 = null;
	    }
	}
    }
    
    public int method111(int arg0, boolean arg1) {
	if (arg1 != true)
	    aRSString_369 = null;
	anInt351++;
	if (!method133(arg0, false))
	    return 0;
	if (anObjectArray373[arg0] != null)
	    return 100;
	return aClass129_370.method1740(arg0, 0);
    }
    
    public boolean method112(byte arg0) {
	anInt379++;
	if (arg0 != 10)
	    aClass7_377 = null;
	if (aClass25_374 == null) {
	    aClass25_374 = aClass129_370.method1739(255);
	    if (aClass25_374 == null)
		return false;
	    anObjectArrayArray390 = new Object[aClass25_374.anInt588][];
	    anObjectArray373 = new Object[aClass25_374.anInt588];
	}
	return true;
    }
    
    public int method113(RSString arg0, int arg1) {
	anInt371++;
	if (!method112((byte) 10))
	    return 0;
	arg0 = arg0.method496(8238);
	if (arg1 != -19579)
	    return 47;
	int i
	    = aClass25_374.aClass86_596.method1457(arg1 ^ 0x4c01,
						   arg0.method511((byte) 31));
	return method111(i, true);
    }
    
    public boolean method114(int[] arg0, int arg1, int arg2) {
	anInt356++;
	if (!method133(arg2, false))
	    return false;
	if (anObjectArray373[arg2] == null)
	    return false;
	int i = aClass25_374.anIntArray595[arg2];
	int[] is = aClass25_374.anIntArrayArray590[arg2];
	if (anObjectArrayArray390[arg2] == null)
	    anObjectArrayArray390[arg2]
		= new Object[aClass25_374.anIntArray593[arg2]];
	Object[] objects = anObjectArrayArray390[arg2];
	boolean bool = true;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    int i_1_;
	    if (is != null)
		i_1_ = is[i_0_];
	    else
		i_1_ = i_0_;
	    if (objects[i_1_] == null) {
		bool = false;
		break;
	    }
	}
	if (bool)
	    return true;
	byte[] is_2_;
	if (arg0 == null || (arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0))
	    is_2_ = Class126_Sub1.method1713(false, anObjectArray373[arg2], (byte) -100);
	else {
	    is_2_ = Class126_Sub1.method1713(true, anObjectArray373[arg2], (byte) -102);
	    Stream Stream = new Stream(is_2_);
	    Stream.XTEADecrypt(-125, arg0, 5, Stream.buffer.length);
	}
	if (arg1 < 33)
	    aClass83_376 = null;
	byte[] is_3_;
	try {
	    is_3_ = Class36.method317(is_2_, false);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("T3 - " + (arg0 != null) + "," + arg2 + ","
			+ is_2_.length + ","
			+ Class105.method1567(0, is_2_, is_2_.length) + ","
			+ Class105.method1567(0, is_2_, -2 + is_2_.length)
			+ "," + aClass25_374.anIntArray597[arg2] + ","
			+ aClass25_374.anInt585));
	}
	if (aBoolean355)
	    anObjectArray373[arg2] = null;
	if ((i ^ 0xffffffff) >= -2) {
	    int i_4_;
	    if (is == null)
		i_4_ = 0;
	    else
		i_4_ = is[0];
	    if (!aBoolean389)
		objects[i_4_] = Class129_Sub1.method1753(is_3_, 136, false);
	    else
		objects[i_4_] = is_3_;
	} else {
	    int i_5_ = is_3_.length;
	    int i_6_ = 0xff & is_3_[--i_5_];
	    i_5_ -= 4 * (i * i_6_);
	    int[] is_7_ = new int[i];
	    Stream Stream = new Stream(is_3_);
	    Stream.currentOffset = i_5_;
	    for (int i_8_ = 0; i_6_ > i_8_; i_8_++) {
		int i_9_ = 0;
		for (int i_10_ = 0; i > i_10_; i_10_++) {
		    i_9_ += Stream.readInt((byte) 125);
		    is_7_[i_10_] += i_9_;
		}
	    }
	    byte[][] is_11_ = new byte[i][];
	    for (int i_12_ = 0; i_12_ < i; i_12_++) {
		is_11_[i_12_] = new byte[is_7_[i_12_]];
		is_7_[i_12_] = 0;
	    }
	    Stream.currentOffset = i_5_;
	    int i_13_ = 0;
	    for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff);
		 i_14_++) {
		int i_15_ = 0;
		for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_16_++) {
		    i_15_ += Stream.readInt((byte) 126);
		    Class17.method185(is_3_, i_13_, is_11_[i_16_],
				      is_7_[i_16_], i_15_);
		    i_13_ += i_15_;
		    is_7_[i_16_] += i_15_;
		}
	    }
	    for (int i_17_ = 0; i > i_17_; i_17_++) {
		int i_18_;
		if (is != null)
		    i_18_ = is[i_17_];
		else
		    i_18_ = i_17_;
		if (aBoolean389)
		    objects[i_18_] = is_11_[i_17_];
		else
		    objects[i_18_]
			= Class129_Sub1.method1753(is_11_[i_17_], 136, false);
	    }
	}
	return true;
    }
    
    public byte[] method115(byte arg0, int arg1, int[] arg2, int arg3) {
	anInt372++;
	if (!method120(arg1, (byte) -57, arg3))
	    return null;
	if (anObjectArrayArray390[arg3] == null
	    || anObjectArrayArray390[arg3][arg1] == null) {
	    boolean bool = method114(arg2, 114, arg3);
	    if (!bool) {
		method130(-114, arg3);
		bool = method114(arg2, 72, arg3);
		if (!bool)
		    return null;
	    }
	}
	byte[] is = Class126_Sub1.method1713(false,
					     anObjectArrayArray390[arg3][arg1],
					     (byte) -121);
	if (aBoolean389) {
	    anObjectArrayArray390[arg3][arg1] = null;
	    if (aClass25_374.anIntArray593[arg3] == 1)
		anObjectArrayArray390[arg3] = null;
	}
	if (arg0 < 74)
	    return null;
	return is;
    }
    
    public byte[] method116(int arg0, RSString arg1, RSString arg2) {
	try {
	    anInt354++;
	    if (!method112((byte) 10))
		return null;
	    arg2 = arg2.method496(8238);
	    arg1 = arg1.method496(8238);
	    int i = aClass25_374.aClass86_596
			.method1457(-126, arg2.method511((byte) 31));
	    if (!method133(i, false))
		return null;
	    int i_19_ = aClass25_374.aClass86Array589[i]
			    .method1457(-125, arg1.method511((byte) 31));
	    if (arg0 <= 116)
		aClass119_Sub1_393 = null;
	    return method138(-809612665, i_19_, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("al.S(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public boolean method117(boolean arg0, int arg1, int arg2) {
	anInt352++;
	if (!method120(arg2, (byte) -57, arg1))
	    return false;
	if (anObjectArrayArray390[arg1] != null
	    && anObjectArrayArray390[arg1][arg2] != null)
	    return true;
	if (arg0 != true)
	    method126((byte) 40, null);
	if (anObjectArray373[arg1] != null)
	    return true;
	method130(-116, arg1);
	if (anObjectArray373[arg1] != null)
	    return true;
	return false;
    }
    
    public void method118(byte arg0) {
	if (arg0 != -86)
	    method133(-48, true);
	if (anObjectArrayArray390 != null) {
	    for (int i = 0; ((anObjectArrayArray390.length ^ 0xffffffff)
			     < (i ^ 0xffffffff)); i++)
		anObjectArrayArray390[i] = null;
	}
	anInt381++;
    }
    
    public static void method119(int arg0, Class73[] arg1, boolean arg2) {
	anInt353++;
	if (!arg2) {
	    for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
		for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -105; i_20_++) {
		    for (int i_21_ = 0; i_21_ < 104; i_21_++) {
			if (((Class120.aByteArrayArrayArray2284[i][i_20_]
			      [i_21_]) & 0x1
			     ^ 0xffffffff)
			    == -2) {
			    int i_22_ = i;
			    if (((Class120.aByteArrayArrayArray2284[1][i_20_]
				  [i_21_])
				 & 0x2)
				== 2)
				i_22_--;
			    if (i_22_ >= 0)
				arg1[i_22_].method1358(i_21_, i_20_, -26742);
			}
		    }
		}
	    }
	    Class67_Sub1_Sub13.anInt4025 += -2 + (int) (Math.random() * 5.0);
	    Class119.anInt2261 += (int) (Math.random() * 5.0) - 2;
	    if (Class119.anInt2261 < -16)
		Class119.anInt2261 = -16;
	    if (Class119.anInt2261 > 16)
		Class119.anInt2261 = 16;
	    if ((Class67_Sub1_Sub13.anInt4025 ^ 0xffffffff) > 7)
		Class67_Sub1_Sub13.anInt4025 = -8;
	    if (Class67_Sub1_Sub13.anInt4025 > 8)
		Class67_Sub1_Sub13.anInt4025 = 8;
	}
	int i;
	if (!arg2)
	    i = 4;
	else
	    i = 1;
	int i_23_ = Class67_Sub1_Sub13.anInt4025 >> -1675542014 << 2131762058;
	int[][] is = new int[104][104];
	int i_24_ = Class119.anInt2261 >> -661066591;
	int[][] is_25_ = new int[104][104];
	for (int i_26_ = 0; i > i_26_; i_26_++) {
	    byte[][] is_27_ = Class73.aByteArrayArrayArray1480[i_26_];
	    int i_28_ = (int) Math.sqrt(5100.0);
	    int i_29_ = 768 * i_28_ >> 767726472;
	    for (int i_30_ = 1; (i_30_ ^ 0xffffffff) > -104; i_30_++) {
		for (int i_31_ = 1; i_31_ < 103; i_31_++) {
		    int i_32_ = (-(Class136.anIntArrayArrayArray2496[i_26_]
				   [i_31_ - 1][i_30_])
				 + (Class136.anIntArrayArrayArray2496[i_26_]
				    [1 + i_31_][i_30_]));
		    int i_33_ = 74;
		    int i_34_ = ((Class136.anIntArrayArrayArray2496[i_26_]
				  [i_31_][i_30_ - -1])
				 - (Class136.anIntArrayArrayArray2496[i_26_]
				    [i_31_][i_30_ + -1]));
		    int i_35_
			= (int) Math.sqrt((double) (65536
						    + (i_32_ * i_32_
						       + i_34_ * i_34_)));
		    int i_36_ = -65536 / i_35_;
		    int i_37_ = (i_32_ << -878099768) / i_35_;
		    int i_38_ = (i_34_ << 2119186152) / i_35_;
		    i_33_ += ((-50 * i_37_ - -(i_36_ * -10) + -50 * i_38_)
			      / i_29_);
		    int i_39_
			= ((is_27_[i_31_][i_30_] >> 161936001)
			   + (is_27_[i_31_][i_30_ - 1] >> -97690686)
			   + (is_27_[i_31_ + -1][i_30_] >> 818602722)
			   - (-(is_27_[1 + i_31_][i_30_] >> -978732573)
			      - (is_27_[i_31_][1 + i_30_] >> 383605027)));
		    is_25_[i_31_][i_30_] = -i_39_ + i_33_;
		}
	    }
	    for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > -105; i_40_++) {
		Class67_Sub26.anIntArray3292[i_40_] = 0;
		Class67_Sub5_Sub18.anIntArray4805[i_40_] = 0;
		Class67_Sub1_Sub37.anIntArray4384[i_40_] = 0;
		Class81.anIntArray1656[i_40_] = 0;
		Class67_Sub15.anIntArray3077[i_40_] = 0;
	    }
	    for (int i_41_ = -5; i_41_ < 104; i_41_++) {
		for (int i_42_ = 0; i_42_ < 104; i_42_++) {
		    int i_43_ = 5 + i_41_;
		    if ((i_43_ ^ 0xffffffff) > -105) {
			int i_44_ = 0xff & (Class67_Sub1_Sub24
					    .aByteArrayArrayArray4199[i_26_]
					    [i_43_][i_42_]);
			if ((i_44_ ^ 0xffffffff) < -1) {
			    Class113 class113
				= Class62.method563((byte) 39, i_44_ - 1);
			    Class67_Sub26.anIntArray3292[i_42_]
				+= class113.anInt2126;
			    Class67_Sub5_Sub18.anIntArray4805[i_42_]
				+= class113.anInt2125;
			    Class67_Sub1_Sub37.anIntArray4384[i_42_]
				+= class113.anInt2136;
			    Class81.anIntArray1656[i_42_]
				+= class113.anInt2134;
			    Class67_Sub15.anIntArray3077[i_42_]++;
			}
		    }
		    int i_45_ = i_41_ - 5;
		    if (i_45_ >= 0) {
			int i_46_ = 0xff & (Class67_Sub1_Sub24
					    .aByteArrayArrayArray4199[i_26_]
					    [i_45_][i_42_]);
			if (i_46_ > 0) {
			    Class113 class113
				= Class62.method563((byte) 39, i_46_ - 1);
			    Class67_Sub26.anIntArray3292[i_42_]
				-= class113.anInt2126;
			    Class67_Sub5_Sub18.anIntArray4805[i_42_]
				-= class113.anInt2125;
			    Class67_Sub1_Sub37.anIntArray4384[i_42_]
				-= class113.anInt2136;
			    Class81.anIntArray1656[i_42_]
				-= class113.anInt2134;
			    Class67_Sub15.anIntArray3077[i_42_]--;
			}
		    }
		}
		if ((i_41_ ^ 0xffffffff) <= -1) {
		    int i_47_ = 0;
		    int i_48_ = 0;
		    int i_49_ = 0;
		    int i_50_ = 0;
		    int i_51_ = 0;
		    for (int i_52_ = -5; (i_52_ ^ 0xffffffff) > -105;
			 i_52_++) {
			int i_53_ = 5 + i_52_;
			int i_54_ = -5 + i_52_;
			if ((i_53_ ^ 0xffffffff) > -105) {
			    i_47_ += Class67_Sub26.anIntArray3292[i_53_];
			    i_50_ += Class67_Sub5_Sub18.anIntArray4805[i_53_];
			    i_51_ += Class67_Sub15.anIntArray3077[i_53_];
			    i_48_ += Class81.anIntArray1656[i_53_];
			    i_49_ += Class67_Sub1_Sub37.anIntArray4384[i_53_];
			}
			if (i_54_ >= 0) {
			    i_50_ -= Class67_Sub5_Sub18.anIntArray4805[i_54_];
			    i_49_ -= Class67_Sub1_Sub37.anIntArray4384[i_54_];
			    i_47_ -= Class67_Sub26.anIntArray3292[i_54_];
			    i_51_ -= Class67_Sub15.anIntArray3077[i_54_];
			    i_48_ -= Class81.anIntArray1656[i_54_];
			}
			if (i_52_ >= 0 && i_51_ > 0)
			    is[i_41_][i_52_]
				= Class67_Sub17.method1246(i_47_ * 256 / i_48_,
							   i_49_ / i_51_,
							   -31863,
							   i_50_ / i_51_);
		    }
		}
	    }
	    for (int i_55_ = 1; i_55_ < 103; i_55_++) {
		for (int i_56_ = 1; i_56_ < 103; i_56_++) {
		    if (arg2 || Class32.method288(true)
			|| (0x2 & (Class120.aByteArrayArrayArray2284[0][i_55_]
				   [i_56_])
			    ^ 0xffffffff) != -1
			|| ((0x10 & (Class120.aByteArrayArrayArray2284[i_26_]
				     [i_55_][i_56_])
			     ^ 0xffffffff) == -1
			    && (Class36.method318(false, i_55_, i_26_, i_56_)
				== Class116.anInt2197))) {
			if ((i_26_ ^ 0xffffffff)
			    > (Class67_Sub1_Sub12.anInt4005 ^ 0xffffffff))
			    Class67_Sub1_Sub12.anInt4005 = i_26_;
			int i_57_ = 0xff & (Class70.aByteArrayArrayArray1403
					    [i_26_][i_55_][i_56_]);
			int i_58_ = 0xff & (Class67_Sub1_Sub24
					    .aByteArrayArrayArray4199[i_26_]
					    [i_55_][i_56_]);
			if ((i_58_ ^ 0xffffffff) < -1 || i_57_ > 0) {
			    int i_59_ = (Class136.anIntArrayArrayArray2496
					 [i_26_][i_55_][i_56_]);
			    int i_60_ = (Class136.anIntArrayArrayArray2496
					 [i_26_][1 + i_55_][i_56_]);
			    int i_61_ = (Class136.anIntArrayArrayArray2496
					 [i_26_][i_55_][1 + i_56_]);
			    int i_62_ = (Class136.anIntArrayArrayArray2496
					 [i_26_][1 + i_55_][1 + i_56_]);
			    if (i_26_ > 0) {
				boolean bool = true;
				if (i_58_ == 0 && (Class67_Sub1_Sub10
						   .aByteArrayArrayArray3983
						   [i_26_][i_55_][i_56_]) != 0)
				    bool = false;
				if (i_57_ > 0
				    && !(Class69.method1325(i_57_ + -1, -127)
					 .aBoolean2525))
				    bool = false;
				if (bool
				    && (i_59_ ^ 0xffffffff) == (i_60_
								^ 0xffffffff)
				    && (i_62_ ^ 0xffffffff) == (i_59_
								^ 0xffffffff)
				    && (i_59_ ^ 0xffffffff) == (i_61_
								^ 0xffffffff))
				    Class67_Sub1_Sub31
					.anIntArrayArrayArray4295[i_26_][i_55_]
					[i_56_]
					= (Class67_Sub20.method1273
					   ((Class67_Sub1_Sub31
					     .anIntArrayArrayArray4295[i_26_]
					     [i_55_][i_56_]),
					    4));
			    }
			    int i_63_;
			    int i_64_;
			    if ((i_58_ ^ 0xffffffff) < -1) {
				i_64_ = is[i_55_][i_56_];
				int i_65_ = (i_64_ & 0x7f) - -i_24_;
				if (i_65_ < 0)
				    i_65_ = 0;
				else if ((i_65_ ^ 0xffffffff) < -128)
				    i_65_ = 127;
				int i_66_
				    = ((0x380 & i_64_)
				       + (0xfc00 & i_64_ - -i_23_) - -i_65_);
				i_63_
				    = (Class26.anIntArray620
				       [Class67_Sub1_Sub24.method733(false, 96,
								     i_66_)]);
			    } else {
				i_63_ = 0;
				i_64_ = -1;
			    }
			    int i_67_ = is_25_[i_55_][i_56_];
			    int i_68_ = is_25_[1 + i_55_][i_56_];
			    int i_69_ = is_25_[1 + i_55_][i_56_ - -1];
			    int i_70_ = is_25_[i_55_][i_56_ + 1];
			    if ((i_57_ ^ 0xffffffff) != -1) {
				int i_71_ = ((Class67_Sub1_Sub10
					      .aByteArrayArrayArray3983[i_26_]
					      [i_55_][i_56_])
					     - -1);
				byte i_72_ = (Class67_Sub5_Sub8
					      .aByteArrayArrayArray4571[i_26_]
					      [i_55_][i_56_]);
				Class139 class139
				    = Class69.method1325(i_57_ + -1, -127);
				int i_73_ = class139.anInt2535;
				if (i_73_ >= 0 && !Class26.anInterface3_623
						       .method8(0, i_73_))
				    i_73_ = -1;
				int i_74_;
				int i_75_;
				if ((i_73_ ^ 0xffffffff) > -1) {
				    if ((class139.anInt2531 ^ 0xffffffff)
					== 0) {
					i_74_ = 0;
					i_75_ = -2;
				    } else {
					i_75_ = class139.anInt2531;
					int i_76_ = i_24_ + (0x7f & i_75_);
					if ((i_76_ ^ 0xffffffff) <= -1) {
					    if (i_76_ > 127)
						i_76_ = 127;
					} else
					    i_76_ = 0;
					int i_77_
					    = (i_76_ + (i_23_ + i_75_ & 0xfc00)
					       - -(0x380 & i_75_));
					i_74_ = (Class26.anIntArray620
						 [(Class67_Sub16.method1240
						   (-24637, i_77_, 96))]);
				    }
				} else {
				    i_74_ = (Class26.anIntArray620
					     [(Class67_Sub16.method1240
					       (-24637,
						(Class26.anInterface3_623
						     .method12
						 ((byte) -118, i_73_)),
						96))]);
				    i_75_ = -1;
				}
				if (class139.anInt2537 >= 0) {
				    int i_78_ = class139.anInt2537;
				    int i_79_ = i_24_ + (i_78_ & 0x7f);
				    if (i_79_ < 0)
					i_79_ = 0;
				    else if ((i_79_ ^ 0xffffffff) < -128)
					i_79_ = 127;
				    int i_80_ = ((0xfc00 & i_23_ + i_78_)
						 + ((i_78_ & 0x380) + i_79_));
				    i_74_ = (Class26.anIntArray620
					     [Class67_Sub16.method1240(-24637,
								       i_80_,
								       96)]);
				}
				Class133.method1909
				    (i_26_, i_55_, i_56_, i_71_, i_72_, i_73_,
				     i_59_, i_60_, i_62_, i_61_,
				     Class67_Sub1_Sub24.method733(false, i_67_,
								  i_64_),
				     Class67_Sub1_Sub24.method733(false, i_68_,
								  i_64_),
				     Class67_Sub1_Sub24.method733(false, i_69_,
								  i_64_),
				     Class67_Sub1_Sub24.method733(false, i_70_,
								  i_64_),
				     Class67_Sub16.method1240(-24637, i_75_,
							      i_67_),
				     Class67_Sub16.method1240(-24637, i_75_,
							      i_68_),
				     Class67_Sub16.method1240(-24637, i_75_,
							      i_69_),
				     Class67_Sub16.method1240(-24637, i_75_,
							      i_70_),
				     i_63_, i_74_);
			    } else
				Class133.method1909
				    (i_26_, i_55_, i_56_, 0, 0, -1, i_59_,
				     i_60_, i_62_, i_61_,
				     Class67_Sub1_Sub24.method733(false, i_67_,
								  i_64_),
				     Class67_Sub1_Sub24.method733(false, i_68_,
								  i_64_),
				     Class67_Sub1_Sub24.method733(false, i_69_,
								  i_64_),
				     Class67_Sub1_Sub24.method733(false, i_70_,
								  i_64_),
				     0, 0, 0, 0, i_63_, 0);
			}
		    }
		}
	    }
	    Class67_Sub1_Sub24.aByteArrayArrayArray4199[i_26_] = null;
	    Class70.aByteArrayArrayArray1403[i_26_] = null;
	    Class67_Sub1_Sub10.aByteArrayArrayArray3983[i_26_] = null;
	    Class67_Sub5_Sub8.aByteArrayArrayArray4571[i_26_] = null;
	    Class73.aByteArrayArrayArray1480[i_26_] = null;
	}
	Class67_Sub5_Sub11.method933(-50, -10, -50);
	if (!arg2) {
	    for (int i_81_ = 0; (i_81_ ^ 0xffffffff) > -105; i_81_++) {
		for (int i_82_ = 0; (i_82_ ^ 0xffffffff) > -105; i_82_++) {
		    if ((0x2
			 & Class120.aByteArrayArrayArray2284[1][i_81_][i_82_])
			== 2)
			Class44.method390(i_81_, i_82_);
		}
	    }
	    for (int i_83_ = 0; (i_83_ ^ 0xffffffff) > -5; i_83_++) {
		for (int i_84_ = 0; i_84_ <= 104; i_84_++) {
		    for (int i_85_ = 0; (i_85_ ^ 0xffffffff) >= -105;
			 i_85_++) {
			if (((Class67_Sub1_Sub31.anIntArrayArrayArray4295
			      [i_83_][i_85_][i_84_])
			     & 0x1)
			    != 0) {
			    int i_86_ = i_84_;
			    int i_87_;
			    for (i_87_ = i_84_; (i_87_ ^ 0xffffffff) < -1;
				 i_87_--) {
				if ((0x1 & (Class67_Sub1_Sub31
					    .anIntArrayArrayArray4295[i_83_]
					    [i_85_][-1 + i_87_])
				     ^ 0xffffffff)
				    == -1)
				    break;
			    }
			    for (/**/;
				 (i_86_ < 104
				  && (0x1 & (Class67_Sub1_Sub31
					     .anIntArrayArrayArray4295[i_83_]
					     [i_85_][1 + i_86_])) != 0);
				 i_86_++) {
				/* empty */
			    }
			    int i_88_ = i_83_;
			    int i_89_ = i_83_;
			while_139_:
			    for (/**/; (i_88_ ^ 0xffffffff) < -1; i_88_--) {
				for (int i_90_ = i_87_; i_86_ >= i_90_;
				     i_90_++) {
				    if (((Class67_Sub1_Sub31
					  .anIntArrayArrayArray4295[-1 + i_88_]
					  [i_85_][i_90_]) & 0x1
					 ^ 0xffffffff)
					== -1)
					break while_139_;
				}
			    }
			while_140_:
			    for (/**/; (i_89_ ^ 0xffffffff) > -4; i_89_++) {
				for (int i_91_ = i_87_;
				     ((i_86_ ^ 0xffffffff)
				      <= (i_91_ ^ 0xffffffff));
				     i_91_++) {
				    if ((0x1 & (Class67_Sub1_Sub31
						.anIntArrayArrayArray4295
						[i_89_ - -1][i_85_][i_91_])
					 ^ 0xffffffff)
					== -1)
					break while_140_;
				}
			    }
			    int i_92_ = ((-i_87_ + (i_86_ + 1))
					 * (i_89_ - (-1 - -i_88_)));
			    if ((i_92_ ^ 0xffffffff) <= -9) {
				int i_93_ = 240;
				int i_94_ = -i_93_ + (Class136
						      .anIntArrayArrayArray2496
						      [i_89_][i_85_][i_87_]);
				int i_95_ = (Class136.anIntArrayArrayArray2496
					     [i_88_][i_85_][i_87_]);
				Class98.method1512(1, i_85_ * 128, i_85_ * 128,
						   128 * i_87_,
						   128 * i_86_ + 128, i_94_,
						   i_95_);
				for (int i_96_ = i_88_;
				     ((i_89_ ^ 0xffffffff)
				      <= (i_96_ ^ 0xffffffff));
				     i_96_++) {
				    for (int i_97_ = i_87_;
					 ((i_97_ ^ 0xffffffff)
					  >= (i_86_ ^ 0xffffffff));
					 i_97_++)
					Class67_Sub1_Sub31
					    .anIntArrayArrayArray4295[i_96_]
					    [i_85_][i_97_]
					    = (Class75.method1379
					       ((Class67_Sub1_Sub31
						 .anIntArrayArrayArray4295
						 [i_96_][i_85_][i_97_]),
						-2));
				}
			    }
			}
			if (((Class67_Sub1_Sub31.anIntArrayArrayArray4295
			      [i_83_][i_85_][i_84_])
			     & 0x2)
			    != 0) {
			    int i_98_ = i_85_;
			    int i_99_ = i_85_;
			    for (/**/;
				 (i_98_ > 0
				  && (0x2 & (Class67_Sub1_Sub31
					     .anIntArrayArrayArray4295[i_83_]
					     [-1 + i_98_][i_84_])) != 0);
				 i_98_--) {
				/* empty */
			    }
			    int i_100_ = i_83_;
			    for (/**/; (i_99_ < 104
					&& (0x2 & (Class67_Sub1_Sub31
						   .anIntArrayArrayArray4295
						   [i_83_][i_99_ + 1][i_84_])
					    ^ 0xffffffff) != -1); i_99_++) {
				/* empty */
			    }
			    int i_101_;
			while_141_:
			    for (i_101_ = i_83_; (i_101_ ^ 0xffffffff) < -1;
				 i_101_--) {
				for (int i_102_ = i_98_;
				     ((i_102_ ^ 0xffffffff)
				      >= (i_99_ ^ 0xffffffff));
				     i_102_++) {
				    if (((Class67_Sub1_Sub31
					  .anIntArrayArrayArray4295
					  [-1 + i_101_][i_102_][i_84_])
					 & 0x2)
					== 0)
					break while_141_;
				}
			    }
			while_142_:
			    for (/**/; i_100_ < 3; i_100_++) {
				for (int i_103_ = i_98_; i_103_ <= i_99_;
				     i_103_++) {
				    if ((0x2 & (Class67_Sub1_Sub31
						.anIntArrayArrayArray4295
						[1 + i_100_][i_103_][i_84_]))
					== 0)
					break while_142_;
				}
			    }
			    int i_104_ = ((1 + (-i_98_ + i_99_))
					  * (1 + (i_100_ - i_101_)));
			    if ((i_104_ ^ 0xffffffff) <= -9) {
				int i_105_ = 240;
				int i_106_ = (Class136.anIntArrayArrayArray2496
					      [i_101_][i_98_][i_84_]);
				int i_107_
				    = (-i_105_
				       + (Class136.anIntArrayArrayArray2496
					  [i_100_][i_98_][i_84_]));
				Class98.method1512(2, i_98_ * 128,
						   128 + i_99_ * 128,
						   i_84_ * 128, i_84_ * 128,
						   i_107_, i_106_);
				for (int i_108_ = i_101_;
				     ((i_100_ ^ 0xffffffff)
				      <= (i_108_ ^ 0xffffffff));
				     i_108_++) {
				    for (int i_109_ = i_98_;
					 ((i_99_ ^ 0xffffffff)
					  <= (i_109_ ^ 0xffffffff));
					 i_109_++)
					Class67_Sub1_Sub31
					    .anIntArrayArrayArray4295[i_108_]
					    [i_109_][i_84_]
					    = (Class75.method1379
					       ((Class67_Sub1_Sub31
						 .anIntArrayArrayArray4295
						 [i_108_][i_109_][i_84_]),
						-3));
				}
			    }
			}
			if ((0x4 & (Class67_Sub1_Sub31.anIntArrayArrayArray4295
				    [i_83_][i_85_][i_84_])
			     ^ 0xffffffff)
			    != -1) {
			    int i_110_ = i_85_;
			    int i_111_ = i_85_;
			    int i_112_;
			    for (i_112_ = i_84_;
				 ((i_112_ ^ 0xffffffff) < -1
				  && ((Class67_Sub1_Sub31
				       .anIntArrayArrayArray4295[i_83_][i_85_]
				       [-1 + i_112_]) & 0x4
				      ^ 0xffffffff) != -1);
				 i_112_--) {
				/* empty */
			    }
			    int i_113_;
			    for (i_113_ = i_84_; i_113_ < 104; i_113_++) {
				if (((Class67_Sub1_Sub31
				      .anIntArrayArrayArray4295[i_83_][i_85_]
				      [1 + i_113_])
				     & 0x4)
				    == 0)
				    break;
			    }
			while_143_:
			    for (/**/; i_110_ > 0; i_110_--) {
				for (int i_114_ = i_112_; i_114_ <= i_113_;
				     i_114_++) {
				    if ((0x4 & (Class67_Sub1_Sub31
						.anIntArrayArrayArray4295
						[i_83_][-1 + i_110_][i_114_])
					 ^ 0xffffffff)
					== -1)
					break while_143_;
				}
			    }
			while_144_:
			    for (/**/; i_111_ < 104; i_111_++) {
				for (int i_115_ = i_112_;
				     ((i_113_ ^ 0xffffffff)
				      <= (i_115_ ^ 0xffffffff));
				     i_115_++) {
				    if (((Class67_Sub1_Sub31
					  .anIntArrayArrayArray4295[i_83_]
					  [1 + i_111_][i_115_]) & 0x4
					 ^ 0xffffffff)
					== -1)
					break while_144_;
				}
			    }
			    if ((-i_110_ + (i_111_ + 1)) * (1 + (-i_112_
								 + i_113_))
				>= 4) {
				int i_116_ = (Class136.anIntArrayArrayArray2496
					      [i_83_][i_110_][i_112_]);
				Class98.method1512(4, i_110_ * 128,
						   128 + i_111_ * 128,
						   128 * i_112_,
						   128 * i_113_ - -128, i_116_,
						   i_116_);
				for (int i_117_ = i_110_; i_111_ >= i_117_;
				     i_117_++) {
				    for (int i_118_ = i_112_; i_118_ <= i_113_;
					 i_118_++)
					Class67_Sub1_Sub31
					    .anIntArrayArrayArray4295[i_83_]
					    [i_117_][i_118_]
					    = (Class75.method1379
					       ((Class67_Sub1_Sub31
						 .anIntArrayArrayArray4295
						 [i_83_][i_117_][i_118_]),
						-5));
				}
			    }
			}
		    }
		}
	    }
	}
	if (arg0 != 128)
	    method104(98);
    }
    
    public boolean method120(int arg0, byte arg1, int arg2) {
	if (arg1 != -57)
	    method138(15, 49, 92);
	anInt383++;
	if (!method112((byte) 10))
	    return false;
	if ((arg2 ^ 0xffffffff) > -1 || arg0 < 0
	    || arg2 >= aClass25_374.anIntArray593.length
	    || (arg0 ^ 0xffffffff) <= (aClass25_374.anIntArray593[arg2]
				       ^ 0xffffffff)) {
	    if (!Class67_Sub5_Sub19.aBoolean4820)
		return false;
	    throw new IllegalArgumentException(String.valueOf(arg2) + ","
					       + arg0);
	}
	return true;
    }
    
    public boolean method121(RSString arg0, int arg1, RSString arg2) {
	try {
	    anInt394++;
	    if (!method112((byte) 10))
		return false;
	    arg2 = arg2.method496(8238);
	    arg0 = arg0.method496(8238);
	    int i = aClass25_374.aClass86_596
			.method1457(-125, arg2.method511((byte) 31));
	    if (arg1 != 25653)
		method116(23, null, null);
	    if (!method133(i, false))
		return false;
	    int i_119_ = aClass25_374.aClass86Array589[i]
			     .method1457(-126, arg0.method511((byte) 31));
	    return method117(true, i, i_119_);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("al.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method122(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	if ((arg3 ^ 0xffffffff) >= (arg1 ^ 0xffffffff))
	    Class67_Sub1_Sub11.method665(arg2 + -28373, arg3,
					 (Class67_Sub29.anIntArrayArray3338
					  [arg0]),
					 arg1, arg4);
	else
	    Class67_Sub1_Sub11.method665(arg2 ^ 0x6ed5, arg1,
					 (Class67_Sub29.anIntArrayArray3338
					  [arg0]),
					 arg3, arg4);
	anInt395++;
	if (arg2 != 28375)
	    method137(79, 94, 75, 68, -46, -111, 57);
    }
    
    public byte[] method123(int arg0, int arg1) {
	anInt366++;
	if (!method112((byte) 10))
	    return null;
	if ((aClass25_374.anIntArray593.length ^ 0xffffffff) == -2)
	    return method138(-809612665, arg0, 0);
	if (!method133(arg0, false))
	    return null;
	if (aClass25_374.anIntArray593[arg0] == 1)
	    return method138(-809612665, 0, arg0);
	int i = -36 % ((arg1 - 82) / 42);
	throw new RuntimeException();
    }
    
    public int method124(byte arg0) {
	anInt375++;
	if (!method112((byte) 10))
	    throw new IllegalStateException("");
	int i = -98 / ((arg0 - 75) / 33);
	return aClass25_374.anInt585;
    }
    
    public boolean method125(int arg0) {
	anInt380++;
	if (arg0 != -2)
	    return true;
	if (!method112((byte) 10))
	    return false;
	boolean bool = true;
	for (int i = 0; i < aClass25_374.anIntArray587.length; i++) {
	    int i_120_ = aClass25_374.anIntArray587[i];
	    if (anObjectArray373[i_120_] == null) {
		method130(-112, i_120_);
		if (anObjectArray373[i_120_] == null)
		    bool = false;
	    }
	}
	return bool;
    }
    
    public int method126(byte arg0, RSString arg1) {
	anInt391++;
	if (!method112((byte) 10))
	    return -1;
	arg1 = arg1.method496(8238);
	int i
	    = aClass25_374.aClass86_596.method1457(-125,
						   arg1.method511((byte) 31));
	if (!method133(i, false))
	    return -1;
	int i_121_ = 103 % ((-51 - arg0) / 63);
	return i;
    }
    
    public void method127(byte arg0, int arg1) {
	aClass129_370.method1738(arg0 ^ 0x52fc, arg1);
	if (arg0 != 58)
	    method122(-23, -100, -37, 111, 74);
	anInt361++;
    }
    
    public void method128(int arg0, byte arg1) {
	anInt365++;
	if (arg1 >= -92)
	    aClass83_376 = null;
	if (method133(arg0, false)) {
	    if (anObjectArrayArray390 != null)
		anObjectArrayArray390[arg0] = null;
	}
    }
    
    public int method129(int arg0) {
	anInt363++;
	if (!method112((byte) 10))
	    return 0;
	int i = 0;
	int i_122_ = 0;
	for (int i_123_ = 0;
	     (anObjectArray373.length ^ 0xffffffff) < (i_123_ ^ 0xffffffff);
	     i_123_++) {
	    if (aClass25_374.anIntArray595[i_123_] > 0) {
		i += method111(i_123_, true);
		i_122_ += 100;
	    }
	}
	if (i_122_ == arg0)
	    return 100;
	int i_124_ = 100 * i / i_122_;
	return i_124_;
    }
    
    public void method130(int arg0, int arg1) {
	if (arg0 <= -107) {
	    if (!aBoolean355)
		anObjectArray373[arg1]
		    = Class129_Sub1.method1753(aClass129_370.method1737(0,
									arg1),
					       136, false);
	    else
		anObjectArray373[arg1] = aClass129_370.method1737(0, arg1);
	    anInt386++;
	}
    }
    
    public int[] method131(int arg0, byte arg1) {
	anInt387++;
	if (!method133(arg0, false))
	    return null;
	int i = 72 / ((-40 - arg1) / 53);
	int[] is = aClass25_374.anIntArrayArray590[arg0];
	if (is == null) {
	    is = new int[aClass25_374.anIntArray595[arg0]];
	    for (int i_125_ = 0;
		 (i_125_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_125_++)
		is[i_125_] = i_125_;
	}
	return is;
    }
    
    public boolean method132(int arg0, boolean arg1) {
	anInt385++;
	if (!method112((byte) 10))
	    return false;
	if (aClass25_374.anIntArray593.length == 1)
	    return method117(arg1, 0, arg0);
	if (arg1 != true)
	    method113(null, -9);
	if (!method133(arg0, false))
	    return false;
	if ((aClass25_374.anIntArray593[arg0] ^ 0xffffffff) == -2)
	    return method117(true, arg0, 0);
	throw new RuntimeException();
    }
    
    public boolean method133(int arg0, boolean arg1) {
	if (arg1 != false)
	    method127((byte) -17, 21);
	anInt360++;
	if (!method112((byte) 10))
	    return false;
	if ((arg0 ^ 0xffffffff) > -1
	    || (arg0 ^ 0xffffffff) <= (aClass25_374.anIntArray593.length
				       ^ 0xffffffff)
	    || (aClass25_374.anIntArray593[arg0] ^ 0xffffffff) == -1) {
	    if (!Class67_Sub5_Sub19.aBoolean4820)
		return false;
	    throw new IllegalArgumentException(Integer.toString(arg0));
	}
	return true;
    }
    
    public boolean method134(byte arg0, int arg1) {
	anInt358++;
	if (arg0 != 109)
	    return true;
	if (!method133(arg1, false))
	    return false;
	if (anObjectArray373[arg1] != null)
	    return true;
	method130(-122, arg1);
	if (anObjectArray373[arg1] != null)
	    return true;
	return false;
    }
    
    public int method135(int arg0, int arg1) {
	int i = -50 % ((-35 - arg1) / 36);
	anInt388++;
	if (!method133(arg0, false))
	    return 0;
	return aClass25_374.anIntArray593[arg0];
    }
    
    public byte[] method136(int arg0, int arg1, byte arg2) {
	int i = 111 % ((arg2 - 52) / 42);
	anInt364++;
	if (!method120(arg1, (byte) -57, arg0))
	    return null;
	if (anObjectArrayArray390[arg0] == null
	    || anObjectArrayArray390[arg0][arg1] == null) {
	    boolean bool = method114(null, 95, arg0);
	    if (!bool) {
		method130(-118, arg0);
		bool = method114(null, 48, arg0);
		if (!bool)
		    return null;
	    }
	}
	byte[] is = Class126_Sub1.method1713(false,
					     anObjectArrayArray390[arg0][arg1],
					     (byte) -99);
	return is;
    }
    
    public static void method137(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	anInt382++;
	if (arg3 == -1) {
	    Class74[] class74s = Class136.aClass74Array2499;
	    for (int i = 0; (class74s.length ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		Class74 class74 = class74s[i];
		if (class74 != null && class74.anInt1491 == 2) {
		    Class7.method88(arg0, arg4 >> 1949061569, false,
				    (class74.anInt1486 + -Class137.baseY
				     << 1123173991) + class74.anInt1494,
				    arg5, 2 * class74.anInt1499,
				    arg2 >> 2091216449,
				    (class74.anInt1490 + -Class58.baseX
				     << -809612665) - -class74.anInt1492);
		    if (Class69.anInt1383 > -1
			&& Class67_Sub1_Sub9.anInt3952 % 20 < 10)
			Class139.aClass67_Sub5_Sub19Array2524
			    [class74.anInt1496].method1006
			    (-12 + Class69.anInt1383 + arg1,
			     -28 + (Class67_Sub27.anInt3303 + arg6));
		}
	    }
	}
    }
    
    public byte[] method138(int arg0, int arg1, int arg2) {
	anInt357++;
	if (arg0 != -809612665)
	    return null;
	return method115((byte) 88, arg1, null, arg2);
    }
    
    public Class9(Class129 arg0, boolean arg1, boolean arg2) {
	aClass129_370 = arg0;
	aBoolean355 = arg1;
	aBoolean389 = arg2;
    }
    
    static {
	aShortArray367 = new short[256];
	aClass119_Sub1_393 = null;
    }
}
