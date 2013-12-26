/* Class67_Sub1_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class67_Sub1_Sub38 extends Class67_Sub1
{
    public static int anInt4415;
    public int anInt4416;
    public int anInt4417;
    public static int anInt4418;
    public int anInt4419;
    public static int anInt4420;
    public static RSString aRSString_4421
	= Class134.method1914("overlay2", (byte) 84);
    public int anInt4422;
    public static int anInt4423;
    public int anInt4424 = 409;
    public int anInt4425;
    public static int anInt4426;
    public int anInt4427;
    public static int anInt4428;
    public static int anInt4429;
    public static int anInt4430;
    public static boolean aBoolean4431 = true;
    public int anInt4432;
    public static int anInt4433;
    public int anInt4434;
    public int anInt4435;
    
    public static void method801(int arg0) {
	aRSString_4421 = null;
	if (arg0 != 2)
	    method804(62, 43, 120, null);
    }
    
    public static Class58 method802(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null)
	    return null;
	Class58 class58 = class67_sub24.aClass58_3221;
	class67_sub24.aClass58_3221 = null;
	return class58;
    }
    
    public static Class7 method803(Class7 arg0, byte arg1) {
	anInt4418++;
	if (arg0.anInt174 != -1)
	    return Class3.method69((byte) 110, arg0.anInt174);
	int i = arg0.anInt301 >>> -1610176816;
	Class101 class101 = new Class101(Class67_Sub1_Sub33.aClass92_4325);
	for (Class67_Sub22 class67_sub22
		 = (Class67_Sub22) class101.method1545(-1);
	     class67_sub22 != null;
	     class67_sub22 = (Class67_Sub22) class101.method1542(15035)) {
	    if (class67_sub22.anInt3185 == i)
		return Class3.method69((byte) 110,
				       (int) class67_sub22.aLong1344);
	}
	int i_0_ = -89 / ((arg1 - 16) / 35);
	return null;
    }
    
    public Class67_Sub1_Sub38() {
	super(0, true);
	anInt4422 = 1024;
	anInt4427 = 0;
	anInt4416 = 1024;
	anInt4419 = 0;
	anInt4425 = 2048;
	anInt4434 = 1024;
	anInt4432 = 819;
	anInt4435 = 1024;
    }
    
    public static Class119[] method804(int arg0, int arg1, int arg2,
				       Class9 arg3) {
	if (arg2 != -1006411924)
	    return null;
	anInt4430++;
	if (!Class64.method575((byte) -119, arg1, arg0, arg3))
	    return null;
	return Class67_Sub22.method1281(86);
    }
    
    public void method805(boolean arg0, int arg1, int arg2, int arg3, int arg4,
			  int[][] arg5, Random arg6) {
	try {
	    if (arg0 != true)
		anInt4417 = 92;
	    anInt4423++;
	    int i
		= (anInt4416 > 0
		   ? -Class67_Sub1_Sub37.method793(-12, arg6, anInt4416) + 4096
		   : 4096);
	    int i_1_ = anInt4422 * anInt4417 >> 1490855212;
	    int i_2_
		= (anInt4417
		   + -((i_1_ ^ 0xffffffff) < -1
		       ? Class67_Sub1_Sub37.method793(5, arg6, i_1_) : 0));
	    if ((arg2 ^ 0xffffffff)
		<= (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff))
		arg2 -= Class67_Sub5_Sub7.anInt4569;
	    if (i_2_ <= 0) {
		if ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
		    <= (arg2 - -arg3 ^ 0xffffffff)) {
		    for (int i_3_ = 0;
			 (i_3_ ^ 0xffffffff) > (arg4 ^ 0xffffffff); i_3_++)
			Class17.method184(arg5[arg1 - -i_3_], arg2, arg3, i);
		} else {
		    int i_4_ = Class67_Sub5_Sub7.anInt4569 - arg2;
		    for (int i_5_ = 0; arg4 > i_5_; i_5_++) {
			int[] is = arg5[arg1 + i_5_];
			Class17.method184(is, arg2, i_4_, i);
			Class17.method184(is, 0, arg3 + -i_4_, i);
		    }
		}
	    } else if ((arg4 ^ 0xffffffff) < -1 && (arg3 ^ 0xffffffff) < -1) {
		int i_6_ = arg3 / 2;
		int i_7_
		    = (i_6_ ^ 0xffffffff) <= (i_2_ ^ 0xffffffff) ? i_2_ : i_6_;
		int i_8_ = arg4 / 2;
		int i_9_ = i_2_ > i_8_ ? i_8_ : i_2_;
		int i_10_ = i_7_ + arg2;
		int i_11_ = -(2 * i_7_) + arg3;
		for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (arg4 ^ 0xffffffff);
		     i_12_++) {
		    int[] is = arg5[arg1 + i_12_];
		    if ((i_9_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff)) {
			int i_13_ = i * i_12_ / i_9_;
			if ((anInt4419 ^ 0xffffffff) == -1) {
			    for (int i_14_ = 0;
				 (i_7_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff);
				 i_14_++) {
				int i_15_ = i * i_14_ / i_7_;
				is[Class75.method1379(Class76.anInt1581,
						      arg2 + i_14_)]
				    = is[Class75.method1379(Class76.anInt1581,
							    -1 + (arg3 + arg2
								  - i_14_))]
				    = i_15_ * i_13_ >> -2016646132;
			    }
			} else {
			    for (int i_16_ = 0; i_7_ > i_16_; i_16_++) {
				int i_17_ = i_16_ * i / i_7_;
				is[Class75.method1379(Class76.anInt1581,
						      i_16_ + arg2)]
				    = is[Class75.method1379(Class76.anInt1581,
							    (arg3 + arg2
							     + (-i_16_ - 1)))]
				    = i_17_ < i_13_ ? i_17_ : i_13_;
			    }
			}
			if (i_11_ + i_10_ <= Class67_Sub5_Sub7.anInt4569)
			    Class17.method184(is, i_10_, i_11_, i_13_);
			else {
			    int i_18_ = -i_10_ + Class67_Sub5_Sub7.anInt4569;
			    Class17.method184(is, i_10_, i_18_, i_13_);
			    Class17.method184(is, 0, -i_18_ + i_11_, i_13_);
			}
		    } else {
			int i_19_ = -1 + (arg4 + -i_12_);
			if ((i_19_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff)) {
			    int i_20_ = i * i_19_ / i_9_;
			    if ((anInt4419 ^ 0xffffffff) != -1) {
				for (int i_21_ = 0;
				     ((i_7_ ^ 0xffffffff)
				      < (i_21_ ^ 0xffffffff));
				     i_21_++) {
				    int i_22_ = i_21_ * i / i_7_;
				    is[Class75.method1379(i_21_ + arg2,
							  Class76.anInt1581)]
					= is[Class75.method1379((-i_21_ + arg2
								 + (arg3 - 1)),
								(Class76
								 .anInt1581))]
					= i_20_ > i_22_ ? i_22_ : i_20_;
				}
			    } else {
				for (int i_23_ = 0; i_23_ < i_7_; i_23_++) {
				    int i_24_ = i_23_ * i / i_7_;
				    is[Class75.method1379(Class76.anInt1581,
							  arg2 + i_23_)]
					= is[Class75.method1379((Class76
								 .anInt1581),
								(-i_23_
								 + (arg2
								    - -arg3
								    - 1)))]
					= i_20_ * i_24_ >> -1006411924;
				}
			    }
			    if ((i_10_ - -i_11_ ^ 0xffffffff)
				>= (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff))
				Class17.method184(is, i_10_, i_11_, i_20_);
			    else {
				int i_25_
				    = Class67_Sub5_Sub7.anInt4569 + -i_10_;
				Class17.method184(is, i_10_, i_25_, i_20_);
				Class17.method184(is, 0, -i_25_ + i_11_,
						  i_20_);
			    }
			} else {
			    for (int i_26_ = 0; i_7_ > i_26_; i_26_++)
				is[Class75.method1379(Class76.anInt1581,
						      i_26_ + arg2)]
				    = is[Class75.method1379((-i_26_
							     + (arg2
								- (-arg3
								   - -1))),
							    Class76.anInt1581)]
				    = i * i_26_ / i_7_;
			    if (Class67_Sub5_Sub7.anInt4569 >= i_11_ + i_10_)
				Class17.method184(is, i_10_, i_11_, i);
			    else {
				int i_27_
				    = -i_10_ + Class67_Sub5_Sub7.anInt4569;
				Class17.method184(is, i_10_, i_27_, i);
				Class17.method184(is, 0, -i_27_ + i_11_, i);
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("wb.H(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
			+ ',' + arg4 + ',' + (arg5 != null ? "{...}" : "null")
			+ ',' + (arg6 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method806(int arg0) {
	anInt4433++;
	Class67_Sub1_Sub22.method723(false, (byte) -113);
	System.gc();
	Class40.method348(arg0 + -11486, arg0);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt4420++;
	int i = arg2;
    while_132_:
	do {
	while_131_:
	    do {
	    while_130_:
		do {
		while_129_:
		    do {
		    while_128_:
			do {
			while_127_:
			    do {
			    while_126_:
				do {
				    do {
					if ((i ^ 0xffffffff) != -1) {
					    if ((i ^ 0xffffffff) != -2) {
						if (i != 2) {
						    if (i != 3) {
							if (i != 4) {
							    if ((i
								 ^ 0xffffffff)
								!= -6) {
								if ((i
								     ^ 0xffffffff)
								    != -7) {
								    if ((i
									 ^ 0xffffffff)
									!= -8) {
									if ((i
									     ^ 0xffffffff)
									    == -9)
									    break while_131_;
									break while_132_;
								    }
								} else
								    break while_129_;
								break while_130_;
							    }
							} else
							    break while_127_;
							break while_128_;
						    }
						} else
						    break;
						break while_126_;
					    }
					} else {
					    anInt4427
						= arg0.readByte((byte) -49);
					    break while_132_;
					}
					anInt4434 = arg0.readUShort(-2386);
					break while_132_;
				    } while (false);
				    anInt4425 = arg0.readUShort(-2386);
				    break while_132_;
				} while (false);
				anInt4424 = arg0.readUShort(-2386);
				break while_132_;
			    } while (false);
			    anInt4432 = arg0.readUShort(-2386);
			    break while_132_;
			} while (false);
			anInt4435 = arg0.readUShort(-2386);
			break while_132_;
		    } while (false);
		    anInt4419 = arg0.readByte((byte) 104);
		    break while_132_;
		} while (false);
		anInt4422 = arg0.readUShort(-2386);
		break while_132_;
	    } while (false);
	    anInt4416 = arg0.readUShort(-2386);
	} while (false);
	if (arg1 != true)
	    method623(null, true, 22);
    }
    
    public void method618(int arg0) {
	int i = 123 % ((-60 - arg0) / 62);
	anInt4426++;
    }
    
    public static int method807(int arg0, byte arg1) {
	anInt4429++;
	if (arg1 != -80)
	    aRSString_4421 = null;
	return arg0 >>> -1029276854;
    }
    
    public int[] method611(int arg0, byte arg1) {
	int[] is = aClass144_2836.method1961(arg0, true);
	if (arg1 != 55)
	    anInt4416 = -18;
	anInt4415++;
	if (aClass144_2836.aBoolean2607) {
	    int i = 0;
	    int[][] is_28_ = aClass144_2836.method1967((byte) 70);
	    int i_29_ = 0;
	    int i_30_ = 0;
	    int i_31_ = 0;
	    boolean bool = true;
	    boolean bool_32_ = true;
	    int i_33_ = 0;
	    int i_34_ = 0;
	    int i_35_ = anInt4434 * Class67_Sub5_Sub7.anInt4569 >> -1789469108;
	    int i_36_ = 0;
	    int i_37_
		= RuntimeException_Sub1.anInt2618 * anInt4424 >> -1049856148;
	    int i_38_
		= RuntimeException_Sub1.anInt2618 * anInt4432 >> 1608689356;
	    int i_39_ = Class67_Sub5_Sub7.anInt4569 * anInt4425 >> -1567971508;
	    if (i_38_ <= 1)
		return is_28_[arg0];
	    anInt4417
		= anInt4435 * (Class67_Sub5_Sub7.anInt4569 / 8) >> 234755820;
	    int i_40_ = Class67_Sub5_Sub7.anInt4569 / i_35_ + 1;
	    int[][] is_41_ = new int[i_40_][3];
	    Random random = new Random((long) anInt4427);
	    int[][] is_42_ = new int[i_40_][3];
	    for (;;) {
		int i_43_
		    = (Class67_Sub1_Sub37.method793(115, random, i_39_ - i_35_)
		       + i_35_);
		int i_44_ = i_43_ + i_30_;
		int i_45_
		    = (Class67_Sub1_Sub37.method793(120, random, i_38_ - i_37_)
		       + i_37_);
		if (i_44_ > Class67_Sub5_Sub7.anInt4569) {
		    i_43_ = -i_30_ + Class67_Sub5_Sub7.anInt4569;
		    i_44_ = Class67_Sub5_Sub7.anInt4569;
		}
		int i_46_;
		if (bool_32_)
		    i_46_ = 0;
		else {
		    int i_47_ = i_31_;
		    int[] is_48_ = is_41_[i_31_];
		    i_46_ = is_48_[2];
		    int i_49_ = 0;
		    int i_50_ = i_44_ - -i;
		    if (i_50_ < 0)
			i_50_ += Class67_Sub5_Sub7.anInt4569;
		    if ((i_50_ ^ 0xffffffff)
			< (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff))
			i_50_ -= Class67_Sub5_Sub7.anInt4569;
		    for (;;) {
			int[] is_51_ = is_41_[i_47_];
			if ((i_50_ ^ 0xffffffff) <= (is_51_[0] ^ 0xffffffff)
			    && (is_51_[1] ^ 0xffffffff) <= (i_50_
							    ^ 0xffffffff))
			    break;
			i_49_++;
			if (++i_47_ >= i_33_)
			    i_47_ = 0;
		    }
		    if (i_47_ != i_31_) {
			int i_52_ = i + i_30_;
			if (i_52_ < 0)
			    i_52_ += Class67_Sub5_Sub7.anInt4569;
			if ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
			    > (i_52_ ^ 0xffffffff))
			    i_52_ -= Class67_Sub5_Sub7.anInt4569;
			for (int i_53_ = 1;
			     (i_53_ ^ 0xffffffff) >= (i_49_ ^ 0xffffffff);
			     i_53_++) {
			    int[] is_54_ = is_41_[(i_31_ + i_53_) % i_33_];
			    i_46_ = Math.max(i_46_, is_54_[2]);
			}
			for (int i_55_ = 0; i_49_ >= i_55_; i_55_++) {
			    int[] is_56_ = is_41_[(i_55_ + i_31_) % i_33_];
			    int i_57_ = is_56_[2];
			    if (i_46_ != i_57_) {
				int i_58_ = is_56_[1];
				int i_59_ = is_56_[0];
				int i_60_;
				int i_61_;
				if ((i_52_ ^ 0xffffffff)
				    <= (i_50_ ^ 0xffffffff)) {
				    if ((i_59_ ^ 0xffffffff) == -1) {
					i_60_ = 0;
					i_61_ = Math.min(i_50_, i_58_);
				    } else {
					i_60_ = Math.max(i_52_, i_59_);
					i_61_ = Class67_Sub5_Sub7.anInt4569;
				    }
				} else {
				    i_60_ = Math.max(i_52_, i_59_);
				    i_61_ = Math.min(i_50_, i_58_);
				}
				method805(true, i_57_, i_60_ + i_29_,
					  i_61_ - i_60_, i_46_ + -i_57_,
					  is_28_, random);
			    }
			}
		    }
		    i_31_ = i_47_;
		}
		if ((RuntimeException_Sub1.anInt2618 ^ 0xffffffff)
		    <= (i_46_ + i_45_ ^ 0xffffffff))
		    bool = false;
		else
		    i_45_ = RuntimeException_Sub1.anInt2618 + -i_46_;
		if (Class67_Sub5_Sub7.anInt4569 == i_44_) {
		    method805(true, i_46_, i_34_ + i_30_, i_43_, i_45_, is_28_,
			      random);
		    if (bool)
			break;
		    i_29_ = i_34_;
		    i_31_ = 0;
		    int[] is_62_ = is_42_[i_36_++];
		    i_33_ = i_36_;
		    is_62_[1] = i_44_;
		    is_62_[0] = i_30_;
		    i_36_ = 0;
		    int[][] is_63_ = is_41_;
		    bool = true;
		    is_62_[2] = i_45_ + i_46_;
		    bool_32_ = false;
		    is_41_ = is_42_;
		    is_42_ = is_63_;
		    i_34_ = Class67_Sub1_Sub37.method793(-118, random,
							 (Class67_Sub5_Sub7
							  .anInt4569));
		    i_30_ = 0;
		    i = i_34_ - i_29_;
		    int i_64_ = i;
		    if ((i_64_ ^ 0xffffffff) > -1)
			i_64_ += Class67_Sub5_Sub7.anInt4569;
		    if ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
			> (i_64_ ^ 0xffffffff))
			i_64_ -= Class67_Sub5_Sub7.anInt4569;
		    for (;;) {
			int[] is_65_ = is_41_[i_31_];
			if ((is_65_[0] ^ 0xffffffff) >= (i_64_ ^ 0xffffffff)
			    && i_64_ <= is_65_[1])
			    break;
			if (++i_31_ >= i_33_)
			    i_31_ = 0;
		    }
		} else {
		    int[] is_66_ = is_42_[i_36_++];
		    is_66_[2] = i_45_ + i_46_;
		    is_66_[0] = i_30_;
		    is_66_[1] = i_44_;
		    method805(true, i_46_, i_34_ + i_30_, i_43_, i_45_, is_28_,
			      random);
		    i_30_ = i_44_;
		}
	    }
	}
	return is;
    }
}
