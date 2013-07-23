/* Class67_Sub5_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class67_Sub5_Sub6 extends Class67_Sub5
{
    public static int anInt4534;
    public static int[] anIntArray4535;
    public static Class7 aClass7_4536;
    public static int anInt4537;
    public static int anInt4538;
    public int anInt4539 = 0;
    public static RSString aRSString_4540;
    public int anInt4541;
    public int anInt4542;
    public int anInt4543 = -1;
    public static int anInt4544;
    public static int[] anIntArray4545 = new int[2];
    public static Class67_Sub5_Sub19 aClass67_Sub5_Sub19_4546;
    public static Class67_Sub5_Sub19[] aClass67_Sub5_Sub19Array4547;
    public static int anInt4548;
    public static RSString aRSString_4549;
    public int anInt4550;
    public int anInt4551;
    public RSString aRSString_4552;
    public RSString aRSString_4553;
    public Class50 aClass50_4554;
    public static int anInt4555;
    public int anInt4556;
    public static Class33 aClass33_4557;
    public static int anInt4558;
    public boolean aBoolean4559;
    public int anInt4560;
    
    public void method867(int arg0) {
	anInt4537++;
	anInt4539 = 0;
	anInt4560 = arg0;
	anInt4556 = 12800;
	anInt4542 = 12800;
	for (Class67_Sub9 class67_sub9
		 = (Class67_Sub9) aClass50_4554.method445(0);
	     class67_sub9 != null;
	     class67_sub9 = (Class67_Sub9) aClass50_4554.method432(0)) {
	    if ((anInt4539 ^ 0xffffffff)
		> (class67_sub9.anInt2975 ^ 0xffffffff))
		anInt4539 = class67_sub9.anInt2975;
	    if ((class67_sub9.anInt2979 ^ 0xffffffff)
		> (anInt4556 ^ 0xffffffff))
		anInt4556 = class67_sub9.anInt2979;
	    if (anInt4560 < class67_sub9.anInt2967)
		anInt4560 = class67_sub9.anInt2967;
	    if (anInt4542 > class67_sub9.anInt2978)
		anInt4542 = class67_sub9.anInt2978;
	}
    }
    
    public static void method868(int arg0) {
	aClass7_4536 = null;
	aRSString_4540 = null;
	anIntArray4535 = null;
	if (arg0 != 17882)
	    anInt4534 = 35;
	anIntArray4545 = null;
	aClass67_Sub5_Sub19_4546 = null;
	aClass67_Sub5_Sub19Array4547 = null;
	aRSString_4549 = null;
	aClass33_4557 = null;
    }
    
    public boolean method869(int arg0, int arg1, boolean arg2) {
	anInt4555++;
	if (arg2 != false)
	    return false;
	if (anInt4542 > arg1 || arg1 > anInt4539
	    || (arg0 ^ 0xffffffff) > (anInt4556 ^ 0xffffffff)
	    || anInt4560 < arg0)
	    return false;
	for (Class67_Sub9 class67_sub9
		 = (Class67_Sub9) aClass50_4554.method445(0);
	     class67_sub9 != null;
	     class67_sub9 = (Class67_Sub9) aClass50_4554.method432(0)) {
	    if (class67_sub9.method1111(arg0, arg1, 16777215))
		return true;
	}
	return false;
    }
    
    public static void method870(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9) {
	anInt4544++;
	if ((arg9 ^ 0xffffffff) == (arg7 ^ 0xffffffff) && arg1 == arg4
	    && (arg2 ^ 0xffffffff) == (arg0 ^ 0xffffffff) && arg8 == arg3)
	    Class34.method305(arg2, arg5, -30374, arg4, arg8, arg9);
	else {
	    int i = arg9;
	    int i_0_ = arg4;
	    int i_1_ = arg9 * 3;
	    int i_2_ = arg1 * 3;
	    int i_3_ = 3 * arg4;
	    int i_4_ = 3 * arg7;
	    int i_5_ = 3 * arg3;
	    int i_6_ = i_2_ + arg8 + (-i_5_ + -arg4);
	    int i_7_ = 3 * arg0;
	    int i_8_ = -arg9 + i_4_ + (-i_7_ + arg2);
	    int i_9_ = -i_1_ + i_4_;
	    int i_10_ = i_3_ + (i_5_ - i_2_ - i_2_);
	    int i_11_ = i_2_ + -i_3_;
	    int i_12_ = i_1_ + -i_4_ + i_7_ + -i_4_;
	    for (int i_13_ = 128; i_13_ <= 4096; i_13_ += 128) {
		int i_14_ = i_13_ * i_13_ >> 1768790380;
		int i_15_ = i_13_ * i_14_ >> -1390369812;
		int i_16_ = i_6_ * i_15_;
		int i_17_ = i_8_ * i_15_;
		int i_18_ = i_14_ * i_12_;
		int i_19_ = i_14_ * i_10_;
		int i_20_ = i_9_ * i_13_;
		int i_21_ = i_11_ * i_13_;
		int i_22_ = arg4 - -(i_19_ + i_16_ - -i_21_ >> 1611376140);
		int i_23_ = arg9 - -(i_17_ - -i_18_ + i_20_ >> 98957868);
		Class34.method305(i_23_, arg5, -30374, i_0_, i_22_, i);
		i = i_23_;
		i_0_ = i_22_;
	    }
	}
	if (arg6 != 3)
	    anIntArray4545 = null;
    }
    
    public static void method871(Class67_Sub30 arg0, int arg1, int arg2) {
	Object[] objects = arg0.anObjectArray3356;
	anInt4538++;
	int i = ((Integer) objects[0]).intValue();
	Class67_Sub5_Sub9 class67_sub5_sub9
	    = Class63.method565(i, arg1 + 22256);
	if (class67_sub5_sub9 != null) {
	    Class100.anInt1969 = 0;
	    int i_24_ = 0;
	    int i_25_ = 0;
	    int i_26_ = -1;
	    int[] is = class67_sub5_sub9.anIntArray4601;
	    int i_27_ = -1;
	    int[] is_28_ = class67_sub5_sub9.anIntArray4603;
	    try {
		Class67_Sub16.aRSStringArray3083
		    = new RSString[class67_sub5_sub9.anInt4606];
		Class67_Sub5_Sub11.anIntArray4678
		    = new int[class67_sub5_sub9.anInt4602];
		int i_29_ = 0;
		if (arg1 != -22368)
		    method871(null, 64, -17);
		int i_30_ = 0;
		for (int i_31_ = 1; i_31_ < objects.length; i_31_++) {
		    if (!(objects[i_31_] instanceof Integer)) {
			if (objects[i_31_] instanceof RSString) {
			    RSString RSString = (RSString) objects[i_31_];
			    if (RSString.method519((byte) -109,
						  Class82.aRSString_1662))
				RSString = arg0.aRSString_3349;
			    Class67_Sub16.aRSStringArray3083[i_30_++] = RSString;
			}
		    } else {
			int i_32_ = ((Integer) objects[i_31_]).intValue();
			if ((i_32_ ^ 0xffffffff) == 2147483646)
			    i_32_ = arg0.anInt3353;
			if ((i_32_ ^ 0xffffffff) == 2147483645)
			    i_32_ = arg0.anInt3360;
			if (i_32_ == -2147483645)
			    i_32_ = (arg0.aClass7_3352 == null ? -1
				     : arg0.aClass7_3352.anInt301);
			if ((i_32_ ^ 0xffffffff) == 2147483643)
			    i_32_ = arg0.anInt3348;
			if ((i_32_ ^ 0xffffffff) == 2147483642)
			    i_32_ = (arg0.aClass7_3352 == null ? -1
				     : arg0.aClass7_3352.anInt266);
			if ((i_32_ ^ 0xffffffff) == 2147483641)
			    i_32_ = (arg0.aClass7_3351 != null
				     ? arg0.aClass7_3351.anInt301 : -1);
			if (i_32_ == -2147483641)
			    i_32_ = (arg0.aClass7_3351 == null ? -1
				     : arg0.aClass7_3351.anInt266);
			if (i_32_ == -2147483640)
			    i_32_ = arg0.anInt3347;
			if ((i_32_ ^ 0xffffffff) == 2147483638)
			    i_32_ = arg0.anInt3354;
			Class67_Sub5_Sub11.anIntArray4678[i_29_++] = i_32_;
		    }
		}
		int i_33_ = 0;
		for (;;) {
		    if (++i_33_ > arg2)
			throw new RuntimeException("slow");
		    i_27_ = is[++i_26_];
		    if ((i_27_ ^ 0xffffffff) > -101) {
			if (i_27_ == 0) {
			    Class67_Sub27.anIntArray3305[i_24_++]
				= is_28_[i_26_];
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -2) {
			    int i_34_ = is_28_[i_26_];
			    Class67_Sub27.anIntArray3305[i_24_++]
				= Class137.anIntArray2504[i_34_];
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -3) {
			    int i_35_ = is_28_[i_26_];
			    Class4.method75(36, i_35_,
					    (Class67_Sub27.anIntArray3305
					     [--i_24_]));
			    continue;
			}
			if (i_27_ == 3) {
			    RuntimeException_Sub1.aRSStringArray2623[i_25_++]
				= class67_sub5_sub9.aRSStringArray4599[i_26_];
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -7) {
			    i_26_ += is_28_[i_26_];
			    continue;
			}
			if (i_27_ == 7) {
			    i_24_ -= 2;
			    if ((Class67_Sub27.anIntArray3305[i_24_ + 1]
				 ^ 0xffffffff)
				!= (Class67_Sub27.anIntArray3305[i_24_]
				    ^ 0xffffffff))
				i_26_ += is_28_[i_26_];
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -9) {
			    i_24_ -= 2;
			    if ((Class67_Sub27.anIntArray3305[i_24_]
				 ^ 0xffffffff)
				== (Class67_Sub27.anIntArray3305[1 + i_24_]
				    ^ 0xffffffff))
				i_26_ += is_28_[i_26_];
			    continue;
			}
			if (i_27_ == 9) {
			    i_24_ -= 2;
			    if (Class67_Sub27.anIntArray3305[i_24_]
				< Class67_Sub27.anIntArray3305[1 + i_24_])
				i_26_ += is_28_[i_26_];
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -11) {
			    i_24_ -= 2;
			    if ((Class67_Sub27.anIntArray3305[i_24_ - -1]
				 ^ 0xffffffff)
				> (Class67_Sub27.anIntArray3305[i_24_]
				   ^ 0xffffffff))
				i_26_ += is_28_[i_26_];
			    continue;
			}
			if (i_27_ == 21) {
			    if (Class100.anInt1969 != 0) {
				Class106 class106 = (Class72.aClass106Array1447
						     [--Class100.anInt1969]);
				class67_sub5_sub9
				    = class106.aClass67_Sub5_Sub9_2057;
				Class67_Sub16.aRSStringArray3083
				    = class106.aRSStringArray2060;
				is_28_ = class67_sub5_sub9.anIntArray4603;
				i_26_ = class106.anInt2062;
				Class67_Sub5_Sub11.anIntArray4678
				    = class106.anIntArray2064;
				is = class67_sub5_sub9.anIntArray4601;
				continue;
			    }
			    break;
			}
			if ((i_27_ ^ 0xffffffff) == -26) {
			    int i_36_ = is_28_[i_26_];
			    Class67_Sub27.anIntArray3305[i_24_++]
				= Class67_Sub9.method1113(22255, i_36_);
			    continue;
			}
			if (i_27_ == 27) {
			    int i_37_ = is_28_[i_26_];
			    Class117.method1630(i_37_, arg1 + 22368,
						(Class67_Sub27.anIntArray3305
						 [--i_24_]));
			    continue;
			}
			if (i_27_ == 31) {
			    i_24_ -= 2;
			    if ((Class67_Sub27.anIntArray3305[i_24_]
				 ^ 0xffffffff)
				>= (Class67_Sub27.anIntArray3305[i_24_ + 1]
				    ^ 0xffffffff))
				i_26_ += is_28_[i_26_];
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -33) {
			    i_24_ -= 2;
			    if (Class67_Sub27.anIntArray3305[i_24_]
				>= Class67_Sub27.anIntArray3305[1 + i_24_])
				i_26_ += is_28_[i_26_];
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -34) {
			    Class67_Sub27.anIntArray3305[i_24_++]
				= (Class67_Sub5_Sub11.anIntArray4678
				   [is_28_[i_26_]]);
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -35) {
			    Class67_Sub5_Sub11.anIntArray4678[is_28_[i_26_]]
				= Class67_Sub27.anIntArray3305[--i_24_];
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -36) {
			    RuntimeException_Sub1.aRSStringArray2623[i_25_++]
				= (Class67_Sub16.aRSStringArray3083
				   [is_28_[i_26_]]);
			    continue;
			}
			if (i_27_ == 36) {
			    Class67_Sub16.aRSStringArray3083[is_28_[i_26_]]
				= (RuntimeException_Sub1.aRSStringArray2623
				   [--i_25_]);
			    continue;
			}
			if (i_27_ == 37) {
			    int i_38_ = is_28_[i_26_];
			    i_25_ -= i_38_;
			    RSString RSString
				= Class131.method1767(i_38_,
						      (RuntimeException_Sub1
						       .aRSStringArray2623),
						      i_25_, (byte) -67);
			    RuntimeException_Sub1.aRSStringArray2623[i_25_++]
				= RSString;
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -39) {
			    i_24_--;
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -40) {
			    i_25_--;
			    continue;
			}
			if (i_27_ == 40) {
			    int i_39_ = is_28_[i_26_];
			    Class67_Sub5_Sub9 class67_sub5_sub9_40_
				= Class63.method565(i_39_, -116);
			    int[] is_41_
				= new int[class67_sub5_sub9_40_.anInt4602];
			    RSString[] RSStrings
				= new RSString[class67_sub5_sub9_40_.anInt4606];
			    for (int i_42_ = 0;
				 i_42_ < class67_sub5_sub9_40_.anInt4608;
				 i_42_++)
				is_41_[i_42_]
				    = (Class67_Sub27.anIntArray3305
				       [(-class67_sub5_sub9_40_.anInt4608
					 + i_24_ + i_42_)]);
			    for (int i_43_ = 0;
				 i_43_ < class67_sub5_sub9_40_.anInt4615;
				 i_43_++)
				RSStrings[i_43_]
				    = (RuntimeException_Sub1.aRSStringArray2623
				       [(-class67_sub5_sub9_40_.anInt4615
					 + (i_25_ - -i_43_))]);
			    i_25_ -= class67_sub5_sub9_40_.anInt4615;
			    i_24_ -= class67_sub5_sub9_40_.anInt4608;
			    Class106 class106 = new Class106();
			    class106.aClass67_Sub5_Sub9_2057
				= class67_sub5_sub9;
			    class106.anInt2062 = i_26_;
			    class106.aRSStringArray2060
				= Class67_Sub16.aRSStringArray3083;
			    class106.anIntArray2064
				= Class67_Sub5_Sub11.anIntArray4678;
			    if (Class100.anInt1969
				>= Class72.aClass106Array1447.length)
				throw new RuntimeException();
			    i_26_ = -1;
			    class67_sub5_sub9 = class67_sub5_sub9_40_;
			    Class72.aClass106Array1447[Class100.anInt1969++]
				= class106;
			    Class67_Sub5_Sub11.anIntArray4678 = is_41_;
			    Class67_Sub16.aRSStringArray3083 = RSStrings;
			    is = class67_sub5_sub9.anIntArray4601;
			    is_28_ = class67_sub5_sub9.anIntArray4603;
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -43) {
			    Class67_Sub27.anIntArray3305[i_24_++]
				= (Class67_Sub1_Sub21.anIntArray4164
				   [is_28_[i_26_]]);
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -44) {
			    int i_44_ = is_28_[i_26_];
			    Class67_Sub1_Sub21.anIntArray4164[i_44_]
				= Class67_Sub27.anIntArray3305[--i_24_];
			    Class67_Sub1_Sub18.method705(i_44_, 7931);
			    continue;
			}
			if (i_27_ == 44) {
			    int i_45_ = is_28_[i_26_] >> -468138768;
			    int i_46_ = is_28_[i_26_] & 0xffff;
			    int i_47_ = Class67_Sub27.anIntArray3305[--i_24_];
			    if ((i_47_ ^ 0xffffffff) > -1 || i_47_ > 5000)
				throw new RuntimeException();
			    int i_48_ = -1;
			    Class67_Sub5_Sub7.anIntArray4567[i_45_] = i_47_;
			    if ((i_46_ ^ 0xffffffff) == -106)
				i_48_ = 0;
			    for (int i_49_ = 0; i_47_ > i_49_; i_49_++)
				Class67_Sub9.anIntArrayArray2982[i_45_][i_49_]
				    = i_48_;
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -46) {
			    int i_50_ = is_28_[i_26_];
			    int i_51_ = Class67_Sub27.anIntArray3305[--i_24_];
			    if ((i_51_ ^ 0xffffffff) > -1
				|| (Class67_Sub5_Sub7.anIntArray4567[i_50_]
				    ^ 0xffffffff) >= (i_51_ ^ 0xffffffff))
				throw new RuntimeException();
			    Class67_Sub27.anIntArray3305[i_24_++]
				= (Class67_Sub9.anIntArrayArray2982[i_50_]
				   [i_51_]);
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -47) {
			    i_24_ -= 2;
			    int i_52_ = is_28_[i_26_];
			    int i_53_ = Class67_Sub27.anIntArray3305[i_24_];
			    if ((i_53_ ^ 0xffffffff) > -1
				|| (Class67_Sub5_Sub7.anIntArray4567[i_52_]
				    ^ 0xffffffff) >= (i_53_ ^ 0xffffffff))
				throw new RuntimeException();
			    Class67_Sub9.anIntArrayArray2982[i_52_][i_53_]
				= Class67_Sub27.anIntArray3305[1 + i_24_];
			    continue;
			}
			if (i_27_ == 47) {
			    RSString RSString
				= Class85.aRSStringArray1705[is_28_[i_26_]];
			    if (RSString == null)
				RSString
				    = Class67_Sub1_Sub16_Sub1.aRSString_5102;
			    RuntimeException_Sub1.aRSStringArray2623[i_25_++]
				= RSString;
			    continue;
			}
			if ((i_27_ ^ 0xffffffff) == -49) {
			    int i_54_ = is_28_[i_26_];
			    Class85.aRSStringArray1705[i_54_]
				= (RuntimeException_Sub1.aRSStringArray2623
				   [--i_25_]);
			    InputStream_Sub1.method50(i_54_, 63);
			    continue;
			}
			if (i_27_ == 51) {
			    Class92 class92
				= (class67_sub5_sub9.aClass92Array4611
				   [is_28_[i_26_]]);
			    Class67_Sub19 class67_sub19
				= ((Class67_Sub19)
				   class92.method1489((byte) -102,
						      (long) (Class67_Sub27
							      .anIntArray3305
							      [--i_24_])));
			    if (class67_sub19 != null)
				i_26_ += class67_sub19.anInt3149;
			    continue;
			}
		    }
		    boolean bool;
		    if ((is_28_[i_26_] ^ 0xffffffff) != -2)
			bool = false;
		    else
			bool = true;
		while_44_:
		    do {
			if (i_27_ < 300) {
			    if (i_27_ == 100) {
				i_24_ -= 3;
				int i_55_
				    = Class67_Sub27.anIntArray3305[i_24_];
				int i_56_
				    = Class67_Sub27.anIntArray3305[i_24_ - -1];
				int i_57_
				    = Class67_Sub27.anIntArray3305[i_24_ - -2];
				if ((i_56_ ^ 0xffffffff) == -1)
				    throw new RuntimeException();
				Class7 class7
				    = Class3.method69((byte) 110, i_55_);
				if (class7.aClass7Array228 == null)
				    class7.aClass7Array228
					= new Class7[i_57_ - -1];
				if ((class7.aClass7Array228.length
				     ^ 0xffffffff)
				    >= (i_57_ ^ 0xffffffff)) {
				    Class7[] class7s = new Class7[i_57_ - -1];
				    for (int i_58_ = 0;
					 ((i_58_ ^ 0xffffffff)
					  > (class7.aClass7Array228.length
					     ^ 0xffffffff));
					 i_58_++)
					class7s[i_58_]
					    = class7.aClass7Array228[i_58_];
				    class7.aClass7Array228 = class7s;
				}
				if (i_57_ > 0
				    && (class7.aClass7Array228[-1 + i_57_]
					== null))
				    throw new RuntimeException("Gap at:"
							       + (-1 + i_57_));
				Class7 class7_59_ = new Class7();
				class7_59_.aBoolean185 = true;
				class7_59_.anInt266 = i_57_;
				class7_59_.anInt227 = i_56_;
				class7_59_.anInt174 = class7_59_.anInt301
				    = class7.anInt301;
				class7.aClass7Array228[i_57_] = class7_59_;
				if (bool)
				    Class6.aClass7_156 = class7_59_;
				else
				    Class9.aClass7_377 = class7_59_;
				Class37.method326(class7, arg1 + 22485);
				break;
			    }
			    if (i_27_ == 101) {
				Class7 class7 = (!bool ? Class9.aClass7_377
						 : Class6.aClass7_156);
				if (class7.anInt266 == -1) {
				    if (!bool)
					throw new RuntimeException
						  ("Tried to cc_delete static active-component!");
				    throw new RuntimeException
					      ("Tried to .cc_delete static .active-component!");
				}
				Class7 class7_60_
				    = Class3.method69((byte) 110,
						      class7.anInt301);
				class7_60_.aClass7Array228[class7.anInt266]
				    = null;
				Class37.method326(class7_60_, 88);
				break;
			    }
			    if (i_27_ == 102) {
				Class7 class7
				    = Class3.method69((byte) 110,
						      (Class67_Sub27
						       .anIntArray3305
						       [--i_24_]));
				class7.aClass7Array228 = null;
				Class37.method326(class7, 103);
				break;
			    }
			    if ((i_27_ ^ 0xffffffff) == -201) {
				i_24_ -= 2;
				int i_61_
				    = Class67_Sub27.anIntArray3305[i_24_];
				int i_62_
				    = Class67_Sub27.anIntArray3305[1 + i_24_];
				Class7 class7
				    = Class67_Sub5_Sub14
					  .method972(i_62_, 18062, i_61_);
				if (class7 != null
				    && (i_62_ ^ 0xffffffff) != 0) {
				    Class67_Sub27.anIntArray3305[i_24_++] = 1;
				    if (!bool)
					Class9.aClass7_377 = class7;
				    else
					Class6.aClass7_156 = class7;
				} else
				    Class67_Sub27.anIntArray3305[i_24_++] = 0;
				break;
			    }
			    if (i_27_ == 201) {
				int i_63_
				    = Class67_Sub27.anIntArray3305[--i_24_];
				Class7 class7
				    = Class3.method69((byte) 110, i_63_);
				if (class7 != null) {
				    Class67_Sub27.anIntArray3305[i_24_++] = 1;
				    if (!bool)
					Class9.aClass7_377 = class7;
				    else
					Class6.aClass7_156 = class7;
				} else
				    Class67_Sub27.anIntArray3305[i_24_++] = 0;
				break;
			    }
			} else if ((i_27_ ^ 0xffffffff) <= -501) {
			    if (((i_27_ ^ 0xffffffff) <= -1001
				 && (i_27_ ^ 0xffffffff) > -1101)
				|| i_27_ >= 2000 && i_27_ < 2100) {
				Class7 class7;
				if (i_27_ < 2000)
				    class7 = (!bool ? Class9.aClass7_377
					      : Class6.aClass7_156);
				else {
				    i_27_ -= 1000;
				    class7 = Class3.method69((byte) 110,
							     (Class67_Sub27
							      .anIntArray3305
							      [--i_24_]));
				}
				if (i_27_ == 1000) {
				    i_24_ -= 4;
				    class7.anInt292
					= Class67_Sub27.anIntArray3305[i_24_];
				    class7.anInt295
					= (Class67_Sub27.anIntArray3305
					   [i_24_ - -1]);
				    int i_64_ = (Class67_Sub27.anIntArray3305
						 [i_24_ - -3]);
				    int i_65_ = (Class67_Sub27.anIntArray3305
						 [2 + i_24_]);
				    if (i_64_ < 0)
					i_64_ = 0;
				    else if ((i_64_ ^ 0xffffffff) < -6)
					i_64_ = 5;
				    class7.aByte173 = (byte) i_64_;
				    if ((i_65_ ^ 0xffffffff) <= -1) {
					if (i_65_ > 5)
					    i_65_ = 5;
				    } else
					i_65_ = 0;
				    class7.aByte233 = (byte) i_65_;
				    Class37.method326(class7, arg1 + 22453);
				    Class67_Sub10.method1120(0, class7);
				    if ((class7.anInt266 ^ 0xffffffff) == 0)
					Class67_Sub5_Sub15.method978
					    ((byte) -113, class7.anInt301);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1002) {
				    i_24_ -= 4;
				    class7.anInt193
					= Class67_Sub27.anIntArray3305[i_24_];
				    class7.anInt199
					= (Class67_Sub27.anIntArray3305
					   [1 + i_24_]);
				    class7.anInt240 = 0;
				    class7.anInt211 = 0;
				    int i_66_ = (Class67_Sub27.anIntArray3305
						 [3 + i_24_]);
				    int i_67_ = (Class67_Sub27.anIntArray3305
						 [2 + i_24_]);
				    if (i_66_ >= 0) {
					if (i_66_ > 4)
					    i_66_ = 4;
				    } else
					i_66_ = 0;
				    class7.aByte168 = (byte) i_66_;
				    if ((i_67_ ^ 0xffffffff) <= -1) {
					if (i_67_ > 4)
					    i_67_ = 4;
				    } else
					i_67_ = 0;
				    class7.aByte210 = (byte) i_67_;
				    Class37.method326(class7, 100);
				    Class67_Sub10.method1120(0, class7);
				    if (class7.anInt227 == 0)
					Class67_Sub17.method1247(false, class7,
								 80);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1004) {
				    boolean bool_68_
					= ((Class67_Sub27.anIntArray3305
					    [--i_24_])
					   == 1);
				    if (class7.aBoolean313 == !bool_68_) {
					class7.aBoolean313 = bool_68_;
					Class37.method326(class7,
							  arg1 + 22477);
				    }
				    if ((class7.anInt266 ^ 0xffffffff) == 0)
					Class4.method76(class7.anInt301,
							arg1 + 22490);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1005) {
				    i_24_ -= 2;
				    class7.anInt215
					= Class67_Sub27.anIntArray3305[i_24_];
				    class7.anInt261
					= (Class67_Sub27.anIntArray3305
					   [i_24_ + 1]);
				    Class37.method326(class7, 86);
				    Class67_Sub10.method1120(arg1 + 22368,
							     class7);
				    if ((class7.anInt227 ^ 0xffffffff) == -1)
					Class67_Sub17.method1247(false, class7,
								 69);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1006) {
				    class7.aBoolean324
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]) == 1;
				    break;
				}
			    } else if ((i_27_ < 1100
					|| (i_27_ ^ 0xffffffff) <= -1201)
				       && ((i_27_ ^ 0xffffffff) > -2101
					   || (i_27_ ^ 0xffffffff) <= -2201)) {
				if ((i_27_ < 1200
				     || (i_27_ ^ 0xffffffff) <= -1301)
				    && (i_27_ < 2200 || i_27_ >= 2300)) {
				    if (((i_27_ ^ 0xffffffff) > -1301
					 || i_27_ >= 1400)
					&& ((i_27_ ^ 0xffffffff) > -2301
					    || ((i_27_ ^ 0xffffffff)
						<= -2401))) {
					if (((i_27_ ^ 0xffffffff) > -1401
					     || i_27_ >= 1500)
					    && (i_27_ < 2400
						|| ((i_27_ ^ 0xffffffff)
						    <= -2501))) {
					    if (i_27_ >= 1600) {
						if (i_27_ >= 1700) {
						    if ((i_27_ ^ 0xffffffff)
							> -1801) {
							Class7 class7
							    = (bool
							       ? (Class6
								  .aClass7_156)
							       : (Class9
								  .aClass7_377));
							if (i_27_ == 1700) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt289);
							    break;
							}
							if (i_27_ == 1701) {
							    if (((class7
								  .anInt289)
								 ^ 0xffffffff)
								!= 0)
								Class67_Sub27
								    .anIntArray3305
								    [i_24_++]
								    = (class7
								       .anInt288);
							    else
								Class67_Sub27
								    .anIntArray3305
								    [i_24_++]
								    = 0;
							    break;
							}
							if ((i_27_
							     ^ 0xffffffff)
							    == -1703) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt266);
							    break;
							}
						    } else if ((i_27_
								^ 0xffffffff)
							       > -1901) {
							Class7 class7
							    = (!bool
							       ? (Class9
								  .aClass7_377)
							       : (Class6
								  .aClass7_156));
							if (i_27_ == 1800) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (client
								       .method31
								       (class7)
								       .method1225
								   (arg1
								    + 22367));
							    break;
							}
							if (i_27_ == 1801) {
							    int i_69_
								= (Class67_Sub27
								   .anIntArray3305
								   [--i_24_]);
							    i_69_--;
							    if (((class7
								  .aRSStringArray315)
								 != null)
								&& ((class7
								     .aRSStringArray315).length
								    > i_69_)
								&& ((class7
								     .aRSStringArray315
								     [i_69_])
								    != null))
								RuntimeException_Sub1
								    .aRSStringArray2623
								    [i_25_++]
								    = (class7
								       .aRSStringArray315
								       [i_69_]);
							    else
								RuntimeException_Sub1
								    .aRSStringArray2623
								    [i_25_++]
								    = (Class132
								       .aRSString_2442);
							    break;
							}
							if ((i_27_
							     ^ 0xffffffff)
							    == -1803) {
							    if ((class7
								 .aRSString_178)
								!= null)
								RuntimeException_Sub1
								    .aRSStringArray2623
								    [i_25_++]
								    = (class7
								       .aRSString_178);
							    else
								RuntimeException_Sub1
								    .aRSStringArray2623
								    [i_25_++]
								    = (Class132
								       .aRSString_2442);
							    break;
							}
						    } else if ((i_27_
								^ 0xffffffff)
							       > -2601) {
							Class7 class7
							    = (Class3.method69
							       ((byte) 110,
								(Class67_Sub27
								 .anIntArray3305
								 [--i_24_])));
							if (i_27_ == 2500) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt221);
							    break;
							}
							if (i_27_ == 2501) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt251);
							    break;
							}
							if ((i_27_
							     ^ 0xffffffff)
							    == -2503) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt189);
							    break;
							}
							if (i_27_ == 2503) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt194);
							    break;
							}
							if (i_27_ == 2504) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= ((class7
								    .aBoolean313)
								   ? 1 : 0);
							    break;
							}
							if (i_27_ == 2505) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt174);
							    break;
							}
						    } else if (i_27_ >= 2700) {
							if ((i_27_
							     ^ 0xffffffff)
							    > -2801) {
							    if ((i_27_
								 ^ 0xffffffff)
								== -2701) {
								Class7 class7
								    = (Class3
									   .method69
								       ((byte) 110,
									(Class67_Sub27
									 .anIntArray3305
									 [--i_24_])));
								Class67_Sub27
								    .anIntArray3305
								    [i_24_++]
								    = (class7
								       .anInt289);
								break;
							    }
							    if (i_27_
								== 2701) {
								Class7 class7
								    = (Class3
									   .method69
								       ((byte) 110,
									(Class67_Sub27
									 .anIntArray3305
									 [--i_24_])));
								if ((class7
								     .anInt289)
								    == -1)
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= 0;
								else
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (class7
									   .anInt288);
								break;
							    }
							    if (i_27_
								== 2702) {
								int i_70_
								    = (Class67_Sub27
								       .anIntArray3305
								       [--i_24_]);
								Class67_Sub22 class67_sub22
								    = ((Class67_Sub22)
								       (Class67_Sub1_Sub33
									    .aClass92_4325
									    .method1489
									((byte) -126,
									 (long) i_70_)));
								if (class67_sub22
								    != null)
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= 1;
								else
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= 0;
								break;
							    }
							    if (i_27_
								== 2703) {
								Class7 class7
								    = (Class3
									   .method69
								       ((byte) 110,
									(Class67_Sub27
									 .anIntArray3305
									 [--i_24_])));
								if ((class7
								     .aClass7Array228)
								    == null)
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= 0;
								else {
								    int i_71_
									= (class7
									   .aClass7Array228).length;
								    for (int i_72_
									     = 0;
									 (i_72_
									  < class7.aClass7Array228.length);
									 i_72_++) {
									if ((class7
									     .aClass7Array228
									     [i_72_])
									    == null) {
									    i_71_ = i_72_;
									    break;
									}
								    }
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= i_71_;
								}
								break;
							    }
							    if (i_27_ == 2704
								|| ((i_27_
								     ^ 0xffffffff)
								    == -2706)) {
								i_24_ -= 2;
								int i_73_
								    = (Class67_Sub27
								       .anIntArray3305
								       [1 + i_24_]);
								int i_74_
								    = (Class67_Sub27
								       .anIntArray3305
								       [i_24_]);
								Class67_Sub22 class67_sub22
								    = ((Class67_Sub22)
								       (Class67_Sub1_Sub33
									    .aClass92_4325
									    .method1489
									((byte) -121,
									 (long) i_74_)));
								if ((class67_sub22
								     == null)
								    || ((class67_sub22
									 .anInt3185)
									!= i_73_))
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= 0;
								else
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= 1;
								break;
							    }
							} else if ((i_27_
								    ^ 0xffffffff)
								   <= -2901) {
							    if ((i_27_
								 ^ 0xffffffff)
								> -3201) {
								if (i_27_
								    == 3100) {
								    RSString RSString
									= (RuntimeException_Sub1
									   .aRSStringArray2623
									   [--i_25_]);
								    Class87
									.method1465
									(true,
									 RSString,
									 (Class132
									  .aRSString_2442),
									 0);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3102) {
								    i_24_ -= 2;
								    Class114
									.method1607
									(-109,
									 (Class67_Sub27
									  .anIntArray3305
									  [i_24_]),
									 (Class67_Sub27
									  .anIntArray3305
									  [1 + i_24_]),
									 (Class122
									  .aClass131_Sub7_Sub2_2309));
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3104) {
								    Class1
									.method62
									((byte) 10);
								    break;
								}
								if (i_27_
								    == 3104) {
								    Class67_Sub5_Sub4_Sub1
									.anInt5103++;
								    RSString RSString
									= (RuntimeException_Sub1
									   .aRSStringArray2623
									   [--i_25_]);
								    int i_75_
									= 0;
								    if (RSString
									    .method517
									((byte) 74))
									i_75_
									    = RSString.method530((byte) -89);
								    Class70_Sub1
									.outStream
									.createFrame
									((arg1
									  ^ ~0x575d),
									 23);	//ENTER_AMOUNT
								    Class70_Sub1
									.outStream
									.addInt
									(i_75_,
									 (arg1
									  + 22490));
								    break;
								}
								if (i_27_
								    == 3105) {
								    Class22
									.anInt537++;
								    RSString RSString
									= (RuntimeException_Sub1
									   .aRSStringArray2623
									   [--i_25_]);
								    Class70_Sub1
									.outStream
									.createFrame
									(2,
									 244);	//ENTER_TEXT
								    Class70_Sub1
									.outStream
									.writeLong
									(2,
									 (RSString
									      .method501
									  ((byte) -16)));
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3107) {
								    RSString RSString
									= (RuntimeException_Sub1
									   .aRSStringArray2623
									   [--i_25_]);
								    Class70_Sub1
									.outStream
									.createFrame
									(2,
									 65);
								    Class70_Sub1
									.outStream
									.addByte
									((byte) 4,
									 1 + RSString.method531((byte) -122));
								    Class87
									.anInt1776++;
								    Class70_Sub1
									.outStream
									.writeRSString
									(RSString,
									 (byte) 0);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3108) {
								    RSString RSString
									= (RuntimeException_Sub1
									   .aRSStringArray2623
									   [--i_25_]);
								    int i_76_
									= (Class67_Sub27
									   .anIntArray3305
									   [--i_24_]);
								    Class67_Sub1_Sub36
									.method788
									(RSString,
									 i_76_,
									 -534);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3109) {
								    i_24_ -= 3;
								    int i_77_
									= (Class67_Sub27
									   .anIntArray3305
									   [i_24_]);
								    int i_78_
									= (Class67_Sub27
									   .anIntArray3305
									   [(i_24_
									     - -1)]);
								    int i_79_
									= (Class67_Sub27
									   .anIntArray3305
									   [(i_24_
									     - -2)]);
								    Class7 class7
									= (Class3.method69
									   ((byte) 110,
									    i_79_));
								    client
									.method41
									(i_77_,
									 (byte) 61,
									 class7,
									 i_78_);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3110) {
								    i_24_ -= 2;
								    int i_80_
									= (Class67_Sub27
									   .anIntArray3305
									   [i_24_]);
								    int i_81_
									= (Class67_Sub27
									   .anIntArray3305
									   [(i_24_
									     - -1)]);
								    Class7 class7
									= (!bool
									   ? Class9.aClass7_377
									   : Class6.aClass7_156);
								    client
									.method41
									(i_80_,
									 (byte) 61,
									 class7,
									 i_81_);
								    break;
								}
								if (i_27_
								    == 3110) {
								    Class55_Sub3
									.anInt2812++;
								    int i_82_
									= (Class67_Sub27
									   .anIntArray3305
									   [--i_24_]);
								    Class70_Sub1
									.outStream
									.createFrame
									((arg1
									  ^ ~0x575d),
									 111);	//GE_SEARCH
								    Class70_Sub1.outStream.addUShort((arg1 ^ ~0xff575f), i_82_);
								    break;
								}
							    } else if ((i_27_
									^ 0xffffffff)
								       > -3301) {
								if (i_27_
								    == 3200) {
								    i_24_ -= 3;
								    Class132
									.method1904
									(true,
									 (Class67_Sub27
									  .anIntArray3305
									  [1 + i_24_]),
									 (Class67_Sub27
									  .anIntArray3305
									  [(i_24_
									    - -2)]),
									 (Class67_Sub27
									  .anIntArray3305
									  [i_24_]));
								    break;
								}
								if (i_27_
								    == 3201) {
								    Class98
									.method1516
									((byte) -91,
									 (Class67_Sub27
									  .anIntArray3305
									  [--i_24_]));
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3203) {
								    i_24_ -= 2;
								    Class67_Sub5_Sub1
									.method830
									((arg1
									  ^ ~0x5723),
									 (Class67_Sub27
									  .anIntArray3305
									  [i_24_]),
									 (Class67_Sub27
									  .anIntArray3305
									  [1 + i_24_]));
								    break;
								}
							    } else if ((i_27_
									^ 0xffffffff)
								       <= -3401) {
								if (i_27_
								    >= 3500) {
								    if (i_27_
									>= 3700) {
									if ((i_27_
									     ^ 0xffffffff)
									    > -4001) {
									    if ((i_27_ ^ 0xffffffff) == -3904) {
										int i_83_ = Class67_Sub27.anIntArray3305[--i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = Class108.aClass34Array2082[i_83_].method308(-122);
										break;
									    }
									    if (i_27_ == 3904) {
										int i_84_ = Class67_Sub27.anIntArray3305[--i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = Class108.aClass34Array2082[i_84_].anInt750;
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -3906) {
										int i_85_ = Class67_Sub27.anIntArray3305[--i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = Class108.aClass34Array2082[i_85_].anInt740;
										break;
									    }
									    if (i_27_ == 3906) {
										int i_86_ = Class67_Sub27.anIntArray3305[--i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = Class108.aClass34Array2082[i_86_].anInt742;
										break;
									    }
									    if (i_27_ == 3907) {
										int i_87_ = Class67_Sub27.anIntArray3305[--i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = Class108.aClass34Array2082[i_87_].anInt753;
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -3909) {
										int i_88_ = Class67_Sub27.anIntArray3305[--i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = Class108.aClass34Array2082[i_88_].anInt736;
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -3911) {
										int i_89_ = Class67_Sub27.anIntArray3305[--i_24_];
										int i_90_ = Class108.aClass34Array2082[i_89_].method304((byte) -118);
										Class67_Sub27.anIntArray3305[i_24_++] = i_90_ != 0 ? 0 : 1;
										break;
									    }
									    if (i_27_ == 3911) {
										int i_91_ = Class67_Sub27.anIntArray3305[--i_24_];
										int i_92_ = Class108.aClass34Array2082[i_91_].method304((byte) -71);
										Class67_Sub27.anIntArray3305[i_24_++] = (i_92_ ^ 0xffffffff) != -3 ? 0 : 1;
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -3913) {
										int i_93_ = Class67_Sub27.anIntArray3305[--i_24_];
										int i_94_ = Class108.aClass34Array2082[i_93_].method304((byte) -116);
										Class67_Sub27.anIntArray3305[i_24_++] = (i_94_ ^ 0xffffffff) != -6 ? 0 : 1;
										break;
									    }
									    if (i_27_ == 3913) {
										int i_95_ = Class67_Sub27.anIntArray3305[--i_24_];
										int i_96_ = Class108.aClass34Array2082[i_95_].method304((byte) -108);
										Class67_Sub27.anIntArray3305[i_24_++] = i_96_ != 1 ? 0 : 1;
										break;
									    }
									} else if ((i_27_ ^ 0xffffffff) <= -4101) {
									    if (i_27_ < 4200) {
										if ((i_27_ ^ 0xffffffff) == -4101) {
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    int i_97_ = Class67_Sub27.anIntArray3305[--i_24_];
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class67_Sub1_Sub27.method744(new RSString[] { RSString, InputStream_Sub1.method47(i_97_, true) }, Class92.method1479(arg1, 22317));
										    break;
										}
										if (i_27_ == 4101) {
										    i_25_ -= 2;
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[i_25_];
										    RSString RSString_98_ = RuntimeException_Sub1.aRSStringArray2623[1 + i_25_];
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class67_Sub1_Sub27.method744(new RSString[] { RSString, RSString_98_ }, -101);
										    break;
										}
										if (i_27_ == 4102) {
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    int i_99_ = Class67_Sub27.anIntArray3305[--i_24_];
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class67_Sub1_Sub27.method744(new RSString[] { RSString, Class3.method68(i_99_, true, true) }, -115);
										    break;
										}
										if (i_27_ == 4103) {
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString.method496(arg1 + 30606);
										    break;
										}
										if (i_27_ == 4104) {
										    int i_100_ = Class67_Sub27.anIntArray3305[--i_24_];
										    long l = 86400000L * (11745L + (long) i_100_);
										    Class67_Sub20.aCalendar3157.setTime(new Date(l));
										    int i_101_ = Class67_Sub20.aCalendar3157.get(5);
										    int i_102_ = Class67_Sub20.aCalendar3157.get(2);
										    int i_103_ = Class67_Sub20.aCalendar3157.get(1);
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class67_Sub1_Sub27.method744(new RSString[] { InputStream_Sub1.method47(i_101_, true), Class81.aRSString_1644, Class126.aRSStringArray2350[i_102_], Class81.aRSString_1644, InputStream_Sub1.method47(i_103_, true) }, -128);
										    break;
										}
										if (i_27_ == 4105) {
										    i_25_ -= 2;
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[i_25_ - -1];
										    RSString RSString_104_ = RuntimeException_Sub1.aRSStringArray2623[i_25_];
										    if (Class122.aClass131_Sub7_Sub2_2309.aClass22_5065 == null || !Class122.aClass131_Sub7_Sub2_2309.aClass22_5065.aBoolean538)
											RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString_104_;
										    else
											RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString;
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4107) {
										    int i_105_ = Class67_Sub27.anIntArray3305[--i_24_];
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = InputStream_Sub1.method47(i_105_, true);
										    break;
										}
										if (i_27_ == 4107) {
										    i_25_ -= 2;
										    Class67_Sub27.anIntArray3305[i_24_++] = RuntimeException_Sub1.aRSStringArray2623[i_25_].method534(RuntimeException_Sub1.aRSStringArray2623[1 + i_25_], (byte) -16);
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4109) {
										    i_24_ -= 2;
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    int i_106_ = Class67_Sub27.anIntArray3305[i_24_];
										    int i_107_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
										    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub10.method1118(arg1 + 21040, i_107_).method901(RSString, i_106_);
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4110) {
										    i_24_ -= 2;
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    int i_108_ = Class67_Sub27.anIntArray3305[1 + i_24_];
										    int i_109_ = Class67_Sub27.anIntArray3305[i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub10.method1118(-1328, i_108_).method904(RSString, i_109_);
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4111) {
										    i_25_ -= 2;
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[i_25_];
										    RSString RSString_110_ = RuntimeException_Sub1.aRSStringArray2623[1 + i_25_];
										    if (Class67_Sub27.anIntArray3305[--i_24_] != 1)
											RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString_110_;
										    else
											RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString;
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4112) {
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class67_Sub5_Sub10.method925(RSString);
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4113) {
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    int i_111_ = Class67_Sub27.anIntArray3305[--i_24_];
										    if ((i_111_ ^ 0xffffffff) == 0)
											throw new RuntimeException("null char");
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString.method521(i_111_, -35);
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4114) {
										    int i_112_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = !Class85.method1452(i_112_, true) ? 0 : 1;
										    break;
										}
										if (i_27_ == 4114) {
										    int i_113_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub16_Sub1.method694(i_113_, 5) ? 1 : 0;
										    break;
										}
										if (i_27_ == 4115) {
										    int i_114_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = !Class67_Sub5_Sub16.method983(-117, i_114_) ? 0 : 1;
										    break;
										}
										if (i_27_ == 4116) {
										    int i_115_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = !Class128.method1734(i_115_, (byte) -105) ? 0 : 1;
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4118) {
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    if (RSString == null)
											Class67_Sub27.anIntArray3305[i_24_++] = 0;
										    else
											Class67_Sub27.anIntArray3305[i_24_++] = RSString.method531((byte) -126);
										    break;
										}
										if (i_27_ == 4118) {
										    i_24_ -= 2;
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    int i_116_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
										    int i_117_ = Class67_Sub27.anIntArray3305[i_24_];
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString.method502(i_117_, -5975, i_116_);
										    break;
										}
										if (i_27_ == 4119) {
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    RSString RSString_118_ = Class10.method139((byte) -93, RSString.method531((byte) 121));
										    boolean bool_119_ = false;
										    for (int i_120_ = 0; (RSString.method531((byte) -120) ^ 0xffffffff) < (i_120_ ^ 0xffffffff); i_120_++) {
											int i_121_ = RSString.method499(i_120_, -3);
											if ((i_121_ ^ 0xffffffff) == -61)
											    bool_119_ = true;
											else if ((i_121_ ^ 0xffffffff) != -63) {
											    if (!bool_119_)
												RSString_118_.method538(arg1 + 22304, i_121_);
											} else
											    bool_119_ = false;
										    }
										    RSString_118_.method520((byte) -96);
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString_118_;
										    break;
										}
										if (i_27_ == 4120) {
										    i_24_ -= 2;
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    int i_122_ = Class67_Sub27.anIntArray3305[1 + i_24_];
										    int i_123_ = Class67_Sub27.anIntArray3305[i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = RSString.method528(true, i_123_, i_122_);
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4122) {
										    i_25_ -= 2;
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[i_25_];
										    int i_124_ = Class67_Sub27.anIntArray3305[--i_24_];
										    RSString RSString_125_ = RuntimeException_Sub1.aRSStringArray2623[i_25_ + 1];
										    Class67_Sub27.anIntArray3305[i_24_++] = RSString.method533(RSString_125_, 9274, i_124_);
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4123) {
										    int i_126_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub1.method627(i_126_, 102);
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4124) {
										    int i_127_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = Class120.method1667(i_127_, (byte) -125);
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4125) {
										    boolean bool_128_ = Class67_Sub27.anIntArray3305[--i_24_] != 0;
										    int i_129_ = Class67_Sub27.anIntArray3305[--i_24_];
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class67_Sub28.method1309((long) i_129_, Class131_Sub3.anInt3603, 0, (byte) 118, bool_128_);
										    break;
										}
									    } else if (i_27_ >= 4300) {
										if (i_27_ < 4400) {
										    if ((i_27_ ^ 0xffffffff) == -4301) {
											i_24_ -= 2;
											int i_130_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
											int i_131_ = Class67_Sub27.anIntArray3305[i_24_];
											Class67_Sub5_Sub17 class67_sub5_sub17 = Class8.method103(-110, i_130_);
											if (!class67_sub5_sub17.method990(-13492))
											    Class67_Sub27.anIntArray3305[i_24_++] = Class133.method1908(i_131_, 86).method571(i_130_, class67_sub5_sub17.anInt4785, Class92.method1479(arg1, 22367));
											else
											    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class133.method1908(i_131_, -6).method568(class67_sub5_sub17.aRSString_4794, i_130_, 3);
											break;
										    }
										} else if ((i_27_ ^ 0xffffffff) <= -4501) {
										    if (i_27_ < 4600) {
											if ((i_27_ ^ 0xffffffff) == -4501) {
											    i_24_ -= 2;
											    int i_132_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_133_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
											    Class67_Sub5_Sub17 class67_sub5_sub17 = Class8.method103(-87, i_133_);
											    if (class67_sub5_sub17.method990(arg1 ^ 0x63ec))
												RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class131_Sub3.method1813(arg1 + 22477, i_132_).method829((byte) -122, i_133_, class67_sub5_sub17.aRSString_4794);
											    else
												Class67_Sub27.anIntArray3305[i_24_++] = Class131_Sub3.method1813(60, i_132_).method826(Class92.method1479(arg1, -22368), class67_sub5_sub17.anInt4785, i_133_);
											    break;
											}
										    } else if (i_27_ < 5100) {
											if (i_27_ == 5000) {
											    Class67_Sub27.anIntArray3305[i_24_++] = Class119.anInt2245;
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5002) {
											    Class98.anInt1943++;
											    i_24_ -= 3;
											    Class119.anInt2245 = Class67_Sub27.anIntArray3305[i_24_];
											    Class67_Sub1_Sub18.anInt4125 = Class67_Sub27.anIntArray3305[i_24_ - -1];
											    Class67_Sub1_Sub29.anInt4267 = Class67_Sub27.anIntArray3305[2 + i_24_];
											    Class70_Sub1.outStream.createFrame(2, 157);	//PRIVACY_SETTINGS
											    Class70_Sub1.outStream.addByte((byte) 4, Class119.anInt2245);
											    Class70_Sub1.outStream.addByte((byte) 4, Class67_Sub1_Sub18.anInt4125);
											    Class70_Sub1.outStream.addByte((byte) 4, Class67_Sub1_Sub29.anInt4267);
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5003) {
											    i_24_ -= 2;
											    Class33.anInt734++;
											    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
											    int i_134_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_135_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
											    Class70_Sub1.outStream.createFrame(2, 99);
											    Class70_Sub1.outStream.writeLong(2, RSString.method501((byte) -16));
											    Class70_Sub1.outStream.addByte((byte) 4, i_134_ - 1);
											    Class70_Sub1.outStream.addByte((byte) 4, i_135_);
											    break;
											}
											if (i_27_ == 5003) {
											    int i_136_ = Class67_Sub27.anIntArray3305[--i_24_];
											    RSString RSString = null;
											    if (i_136_ < 100)
												RSString = Class67_Sub28.aRSStringArray3315[i_136_];
											    if (RSString == null)
												RSString = Class132.aRSString_2442;
											    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString;
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5005) {
											    int i_137_ = Class67_Sub27.anIntArray3305[--i_24_];
											    int i_138_ = -1;
											    if ((i_137_ ^ 0xffffffff) > -101 && Class67_Sub28.aRSStringArray3315[i_137_] != null)
												i_138_ = Class55_Sub2_Sub1.anIntArray3795[i_137_];
											    Class67_Sub27.anIntArray3305[i_24_++] = i_138_;
											    break;
											}
											if (i_27_ == 5005) {
											    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub18.anInt4125;
											    break;
											}
											if (i_27_ == 5008) {
											    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
											    if (RSString.method540(Class47.aRSString_953, arg1 ^ 0x5727))
												Class131_Sub4.method1815(RSString, 12);
											    else if (Class67_Sub17.anInt3107 != 0 || (!Class78.aBoolean1602 || Class23.aBoolean560) && !Class67_Sub5_Sub16.aBoolean4783) {
												Class76.anInt1580++;
												RSString RSString_139_ = RSString.method496(8238);
												int i_140_ = 0;
												int i_141_ = 0;
												if (RSString_139_.method540(Class96_Sub1.aRSString_3378, -121)) {
												    i_141_ = 0;
												    RSString = RSString.method503((byte) 34, Class96_Sub1.aRSString_3378.method531((byte) -104));
												} else if (!RSString_139_.method540(Applet_Sub1.aRSString_11, -108)) {
												    if (!RSString_139_.method540(Class67_Sub1_Sub8.aRSString_3928, 63)) {
													if (RSString_139_.method540(Class67_Sub1_Sub16.aRSString_4074, -78)) {
													    i_141_ = 3;
													    RSString = RSString.method503((byte) 34, Class67_Sub1_Sub16.aRSString_4074.method531((byte) 44));
													} else if (RSString_139_.method540(Class27.aRSString_633, 36)) {
													    i_141_ = 4;
													    RSString = RSString.method503((byte) 34, Class27.aRSString_633.method531((byte) -113));
													} else if (RSString_139_.method540(Class67_Sub5_Sub1.aRSString_4453, 103)) {
													    RSString = RSString.method503((byte) 34, Class67_Sub5_Sub1.aRSString_4453.method531((byte) -114));
													    i_141_ = 5;
													} else if (!RSString_139_.method540(Class139.aRSString_2539, -70)) {
													    if (!RSString_139_.method540(PacketParser.aRSString_2110, 113)) {
														if (RSString_139_.method540(Class81.aRSString_1654, 30)) {
														    i_141_ = 8;
														    RSString = RSString.method503((byte) 34, Class81.aRSString_1654.method531((byte) -113));
														} else if (!RSString_139_.method540(Class87.aRSString_1808, -63)) {
														    if (!RSString_139_.method540(Class30.aRSString_697, -94)) {
															if (!RSString_139_.method540(Class103.aRSString_2014, -122)) {
															    if ((Class131_Sub3.anInt3603 ^ 0xffffffff) != -1) {
																if (RSString_139_.method540(Class96_Sub1.aRSString_3379, arg1 + 22299)) {
																    RSString = RSString.method503((byte) 34, Class96_Sub1.aRSString_3379.method531((byte) 115));
																    i_141_ = 0;
																} else if (RSString_139_.method540(Applet_Sub1.aRSString_20, -73)) {
																    i_141_ = 1;
																    RSString = RSString.method503((byte) 34, Applet_Sub1.aRSString_20.method531((byte) 14));
																} else if (RSString_139_.method540(Class67_Sub1_Sub8.aRSString_3927, arg1 ^ ~0x5743)) {
																    i_141_ = 2;
																    RSString = RSString.method503((byte) 34, Class67_Sub1_Sub8.aRSString_3927.method531((byte) -111));
																} else if (RSString_139_.method540(Class67_Sub1_Sub16.aRSString_4082, arg1 + 22457)) {
																    RSString = RSString.method503((byte) 34, Class67_Sub1_Sub16.aRSString_4082.method531((byte) -124));
																    i_141_ = 3;
																} else if (!RSString_139_.method540(Class27.aRSString_631, -89)) {
																    if (!RSString_139_.method540(Class67_Sub5_Sub1.aRSString_4459, -92)) {
																	if (!RSString_139_.method540(Class139.aRSString_2532, 33)) {
																	    if (RSString_139_.method540(PacketParser.aRSString_2111, arg1 + 22266)) {
																		i_141_ = 7;
																		RSString = RSString.method503((byte) 34, PacketParser.aRSString_2111.method531((byte) 15));
																	    } else if (!RSString_139_.method540(Class81.aRSString_1651, 35)) {
																		if (!RSString_139_.method540(Class87.aRSString_1803, -102)) {
																		    if (!RSString_139_.method540(Class30.aRSString_701, 21)) {
																			if (RSString_139_.method540(Class103.aRSString_2020, -56)) {
																			    RSString = RSString.method503((byte) 34, Class103.aRSString_2020.method531((byte) -128));
																			    i_141_ = 11;
																			}
																		    } else {
																			i_141_ = 10;
																			RSString = RSString.method503((byte) 34, Class30.aRSString_701.method531((byte) -106));
																		    }
																		} else {
																		    i_141_ = 9;
																		    RSString = RSString.method503((byte) 34, Class87.aRSString_1803.method531((byte) 38));
																		}
																	    } else {
																		RSString = RSString.method503((byte) 34, Class81.aRSString_1651.method531((byte) -114));
																		i_141_ = 8;
																	    }
																	} else {
																	    RSString = RSString.method503((byte) 34, Class139.aRSString_2532.method531((byte) -115));
																	    i_141_ = 6;
																	}
																    } else {
																	RSString = RSString.method503((byte) 34, Class67_Sub5_Sub1.aRSString_4459.method531((byte) 53));
																	i_141_ = 5;
																    }
																} else {
																    RSString = RSString.method503((byte) 34, Class27.aRSString_631.method531((byte) -126));
																    i_141_ = 4;
																}
															    }
															} else {
															    RSString = RSString.method503((byte) 34, Class103.aRSString_2014.method531((byte) -128));
															    i_141_ = 11;
															}
														    } else {
															i_141_ = 10;
															RSString = RSString.method503((byte) 34, Class30.aRSString_697.method531((byte) 20));
														    }
														} else {
														    i_141_ = 9;
														    RSString = RSString.method503((byte) 34, Class87.aRSString_1808.method531((byte) -112));
														}
													    } else {
														i_141_ = 7;
														RSString = RSString.method503((byte) 34, PacketParser.aRSString_2110.method531((byte) 75));
													    }
													} else {
													    RSString = RSString.method503((byte) 34, Class139.aRSString_2539.method531((byte) -118));
													    i_141_ = 6;
													}
												    } else {
													i_141_ = 2;
													RSString = RSString.method503((byte) 34, Class67_Sub1_Sub8.aRSString_3928.method531((byte) 44));
												    }
												} else {
												    i_141_ = 1;
												    RSString = RSString.method503((byte) 34, Applet_Sub1.aRSString_11.method531((byte) 70));
												}
												RSString_139_ = RSString.method496(8238);
												if (RSString_139_.method540(Class67_Sub14.aRSString_3049, 53)) {
												    RSString = RSString.method503((byte) 34, Class67_Sub14.aRSString_3049.method531((byte) -18));
												    i_140_ = 1;
												} else if (!RSString_139_.method540(Class67_Sub1_Sub3.aRSString_3847, -108)) {
												    if (!RSString_139_.method540(Class67_Sub1_Sub32.aRSString_4312, arg1 ^ 0x5717)) {
													if (RSString_139_.method540(Class119.aRSString_2256, 91)) {
													    i_140_ = 4;
													    RSString = RSString.method503((byte) 34, Class119.aRSString_2256.method531((byte) -119));
													} else if (!RSString_139_.method540(Class137.aRSString_2522, -92)) {
													    if (Class131_Sub3.anInt3603 != 0) {
														if (!RSString_139_.method540(Class67_Sub14.aRSString_3062, 26)) {
														    if (RSString_139_.method540(Class67_Sub1_Sub3.aRSString_3849, 117)) {
															i_140_ = 2;
															RSString = RSString.method503((byte) 34, Class67_Sub1_Sub3.aRSString_3849.method531((byte) -109));
														    } else if (RSString_139_.method540(Class67_Sub1_Sub32.aRSString_4298, -56)) {
															RSString = RSString.method503((byte) 34, Class67_Sub1_Sub32.aRSString_4298.method531((byte) 103));
															i_140_ = 3;
														    } else if (!RSString_139_.method540(Class119.aRSString_2244, arg1 + 22427)) {
															if (RSString_139_.method540(Class137.aRSString_2516, arg1 + 22412)) {
															    RSString = RSString.method503((byte) 34, Class137.aRSString_2516.method531((byte) -126));
															    i_140_ = 5;
															}
														    } else {
															RSString = RSString.method503((byte) 34, Class119.aRSString_2244.method531((byte) 83));
															i_140_ = 4;
														    }
														} else {
														    RSString = RSString.method503((byte) 34, Class67_Sub14.aRSString_3062.method531((byte) 41));
														    i_140_ = 1;
														}
													    }
													} else {
													    i_140_ = 5;
													    RSString = RSString.method503((byte) 34, Class137.aRSString_2522.method531((byte) -128));
													}
												    } else {
													RSString = RSString.method503((byte) 34, Class67_Sub1_Sub32.aRSString_4312.method531((byte) 59));
													i_140_ = 3;
												    }
												} else {
												    RSString = RSString.method503((byte) 34, Class67_Sub1_Sub3.aRSString_3847.method531((byte) -104));
												    i_140_ = 2;
												}
												Class70_Sub1.outStream.createFrame(2, 237);	//PUBLIC chat
												Class70_Sub1.outStream.addByte((byte) 4, 0);
												int i_142_ = Class70_Sub1.outStream.currentOffset;
												Class70_Sub1.outStream.addByte((byte) 4, i_141_);
												Class70_Sub1.outStream.addByte((byte) 4, i_140_);
												Class67_Sub1_Sub8.method653(arg1 + 22265, RSString, Class70_Sub1.outStream);
												Class70_Sub1.outStream.method1079(arg1 ^ ~0x5723, Class70_Sub1.outStream.currentOffset - i_142_);
											    }
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5010) {
											    i_25_ -= 2;
											    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[i_25_];
											    RSString RSString_143_ = RuntimeException_Sub1.aRSStringArray2623[i_25_ - -1];
											    if (Class67_Sub17.anInt3107 != 0 || (!Class78.aBoolean1602 || Class23.aBoolean560) && !Class67_Sub5_Sub16.aBoolean4783) {
												Class70_Sub1.outStream.createFrame(2, 201);	//SEND_PM
												Class126_Sub3.anInt3452++;
												Class70_Sub1.outStream.addByte((byte) 4, 0);
												int i_144_ = Class70_Sub1.outStream.currentOffset;
												Class70_Sub1.outStream.writeLong(2, RSString.method501((byte) -16));
												Class67_Sub1_Sub8.method653(-64, RSString_143_, Class70_Sub1.outStream);
												Class70_Sub1.outStream.method1079(127, -i_144_ + Class70_Sub1.outStream.currentOffset);
											    }
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5011) {
											    int i_145_ = Class67_Sub27.anIntArray3305[--i_24_];
											    RSString RSString = null;
											    if (i_145_ < 100)
												RSString = Class67_Sub5_Sub9.aRSStringArray4617[i_145_];
											    if (RSString == null)
												RSString = Class132.aRSString_2442;
											    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString;
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5012) {
											    RSString RSString = null;
											    int i_146_ = Class67_Sub27.anIntArray3305[--i_24_];
											    if (i_146_ < 100)
												RSString = Class84.aRSStringArray1700[i_146_];
											    if (RSString == null)
												RSString = Class132.aRSString_2442;
											    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString;
											    break;
											}
											if (i_27_ == 5012) {
											    int i_147_ = Class67_Sub27.anIntArray3305[--i_24_];
											    int i_148_ = -1;
											    if ((i_147_ ^ 0xffffffff) > -101)
												i_148_ = Class68.anIntArray1375[i_147_];
											    Class67_Sub27.anIntArray3305[i_24_++] = i_148_;
											    break;
											}
											if (i_27_ == 5015) {
											    RSString RSString;
											    if (Class122.aClass131_Sub7_Sub2_2309 == null || Class122.aClass131_Sub7_Sub2_2309.playerName == null)
												RSString = Class67_Sub5_Sub5.aRSString_4520;
											    else
												RSString = Class122.aClass131_Sub7_Sub2_2309.method1898(-14756);
											    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString;
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5017) {
											    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub29.anInt4267;
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5018) {
											    Class67_Sub27.anIntArray3305[i_24_++] = Class136.anInt2492;
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5051) {
											    int i_149_ = Class67_Sub27.anIntArray3305[--i_24_];
											    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class67_Sub1_Sub10.method661((byte) 116, i_149_).aRSString_4727;
											    break;
											}
											if (i_27_ == 5051) {
											    int i_150_ = Class67_Sub27.anIntArray3305[--i_24_];
											    Class67_Sub5_Sub13 class67_sub5_sub13 = Class67_Sub1_Sub10.method661((byte) -79, i_150_);
											    if (class67_sub5_sub13.anIntArray4721 == null)
												Class67_Sub27.anIntArray3305[i_24_++] = 0;
											    else
												Class67_Sub27.anIntArray3305[i_24_++] = class67_sub5_sub13.anIntArray4721.length;
											    break;
											}
											if (i_27_ == 5052) {
											    i_24_ -= 2;
											    int i_151_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_152_ = Class67_Sub27.anIntArray3305[1 + i_24_];
											    Class67_Sub5_Sub13 class67_sub5_sub13 = Class67_Sub1_Sub10.method661((byte) 112, i_151_);
											    int i_153_ = class67_sub5_sub13.anIntArray4721[i_152_];
											    Class67_Sub27.anIntArray3305[i_24_++] = i_153_;
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5054) {
											    int i_154_ = Class67_Sub27.anIntArray3305[--i_24_];
											    Class67_Sub5_Sub13 class67_sub5_sub13 = Class67_Sub1_Sub10.method661((byte) 118, i_154_);
											    if (class67_sub5_sub13.anIntArray4724 == null)
												Class67_Sub27.anIntArray3305[i_24_++] = 0;
											    else
												Class67_Sub27.anIntArray3305[i_24_++] = class67_sub5_sub13.anIntArray4724.length;
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5055) {
											    i_24_ -= 2;
											    int i_155_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_156_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
											    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub10.method661((byte) -84, i_155_).anIntArray4724[i_156_];
											    break;
											}
											if (i_27_ == 5055) {
											    int i_157_ = Class67_Sub27.anIntArray3305[--i_24_];
											    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class11.method143(i_157_, -32769).method948(false);
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5057) {
											    int i_158_ = Class67_Sub27.anIntArray3305[--i_24_];
											    Class67_Sub5_Sub12 class67_sub5_sub12 = Class11.method143(i_158_, -32769);
											    if (class67_sub5_sub12.anIntArray4689 != null)
												Class67_Sub27.anIntArray3305[i_24_++] = class67_sub5_sub12.anIntArray4689.length;
											    else
												Class67_Sub27.anIntArray3305[i_24_++] = 0;
											    break;
											}
											if (i_27_ == 5057) {
											    i_24_ -= 2;
											    int i_159_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
											    int i_160_ = Class67_Sub27.anIntArray3305[i_24_];
											    Class67_Sub27.anIntArray3305[i_24_++] = Class11.method143(i_160_, Class92.method1479(arg1, 55135)).anIntArray4689[i_159_];
											    break;
											}
											if (i_27_ == 5058) {
											    Class13.aClass23_432 = new Class23();
											    Class13.aClass23_432.anInt559 = Class67_Sub27.anIntArray3305[--i_24_];
											    Class13.aClass23_432.aClass67_Sub5_Sub12_567 = Class11.method143(Class13.aClass23_432.anInt559, -32769);
											    Class13.aClass23_432.anIntArray563 = new int[Class13.aClass23_432.aClass67_Sub5_Sub12_567.method946(arg1 ^ ~0x5709)];
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5060) {
											    Class70_Sub1.outStream.createFrame(2, 167);
											    Class67_Sub1_Sub20.anInt4146++;
											    Class70_Sub1.outStream.addByte((byte) 4, 0);
											    int i_161_ = Class70_Sub1.outStream.currentOffset;
											    Class70_Sub1.outStream.addByte((byte) 4, 0);
											    Class70_Sub1.outStream.addUShort(16711680, Class13.aClass23_432.anInt559);
											    Class13.aClass23_432.aClass67_Sub5_Sub12_567.method942(arg1 ^ 0x395b, Class70_Sub1.outStream, Class13.aClass23_432.anIntArray563);
											    Class70_Sub1.outStream.method1079(arg1 ^ ~0x5720, -i_161_ + Class70_Sub1.outStream.currentOffset);
											    break;
											}
											if (i_27_ == 5060) {
											    Class55_Sub2.anInt2798++;
											    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
											    Class70_Sub1.outStream.createFrame(2, 178);
											    Class70_Sub1.outStream.addByte((byte) 4, 0);
											    int i_162_ = Class70_Sub1.outStream.currentOffset;
											    Class70_Sub1.outStream.writeLong(2, RSString.method501((byte) -16));
											    Class70_Sub1.outStream.addUShort(arg1 + 16734048, Class13.aClass23_432.anInt559);
											    Class13.aClass23_432.aClass67_Sub5_Sub12_567.method942(-28165, Class70_Sub1.outStream, Class13.aClass23_432.anIntArray563);
											    Class70_Sub1.outStream.method1079(123, Class70_Sub1.outStream.currentOffset - i_162_);
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5062) {
											    Class70_Sub1.outStream.createFrame(2, 167);
											    Class70_Sub1.outStream.addByte((byte) 4, 0);
											    int i_163_ = Class70_Sub1.outStream.currentOffset;
											    Class67_Sub1_Sub20.anInt4146++;
											    Class70_Sub1.outStream.addByte((byte) 4, 1);
											    Class70_Sub1.outStream.addUShort(16711680, Class13.aClass23_432.anInt559);
											    Class13.aClass23_432.aClass67_Sub5_Sub12_567.method942(-28165, Class70_Sub1.outStream, Class13.aClass23_432.anIntArray563);
											    Class70_Sub1.outStream.method1079(122, -i_163_ + Class70_Sub1.outStream.currentOffset);
											    break;
											}
											if (i_27_ == 5062) {
											    i_24_ -= 2;
											    int i_164_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_165_ = Class67_Sub27.anIntArray3305[1 + i_24_];
											    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub10.method661((byte) 11, i_164_).anIntArray4715[i_165_];
											    break;
											}
											if (i_27_ == 5063) {
											    i_24_ -= 2;
											    int i_166_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
											    int i_167_ = Class67_Sub27.anIntArray3305[i_24_];
											    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub10.method661((byte) 121, i_167_).anIntArray4713[i_166_];
											    break;
											}
											if (i_27_ == 5064) {
											    i_24_ -= 2;
											    int i_168_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_169_ = Class67_Sub27.anIntArray3305[1 + i_24_];
											    if ((i_169_ ^ 0xffffffff) == 0)
												Class67_Sub27.anIntArray3305[i_24_++] = -1;
											    else
												Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub10.method661((byte) 97, i_168_).method961(64, i_169_);
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5066) {
											    i_24_ -= 2;
											    int i_170_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_171_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
											    if ((i_171_ ^ 0xffffffff) == 0)
												Class67_Sub27.anIntArray3305[i_24_++] = -1;
											    else
												Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub10.method661((byte) 115, i_170_).method963(i_171_, -64);
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5067) {
											    int i_172_ = Class67_Sub27.anIntArray3305[--i_24_];
											    Class67_Sub27.anIntArray3305[i_24_++] = Class11.method143(i_172_, Class92.method1479(arg1, 55135)).method946(92);
											    break;
											}
											if (i_27_ == 5067) {
											    i_24_ -= 2;
											    int i_173_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_174_ = Class67_Sub27.anIntArray3305[1 + i_24_];
											    int i_175_ = Class11.method143(i_173_, arg1 + -10401).method949(i_174_, arg1 + 51171);
											    Class67_Sub27.anIntArray3305[i_24_++] = i_175_;
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5069) {
											    i_24_ -= 2;
											    int i_176_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_177_ = Class67_Sub27.anIntArray3305[1 + i_24_];
											    Class13.aClass23_432.anIntArray563[i_176_] = i_177_;
											    break;
											}
											if (i_27_ == 5069) {
											    i_24_ -= 2;
											    int i_178_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_179_ = Class67_Sub27.anIntArray3305[1 + i_24_];
											    Class13.aClass23_432.anIntArray563[i_178_] = i_179_;
											    break;
											}
											if (i_27_ == 5070) {
											    i_24_ -= 3;
											    int i_180_ = Class67_Sub27.anIntArray3305[i_24_];
											    int i_181_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
											    int i_182_ = Class67_Sub27.anIntArray3305[2 + i_24_];
											    Class67_Sub5_Sub12 class67_sub5_sub12 = Class11.method143(i_180_, -32769);
											    if (class67_sub5_sub12.method949(i_181_, 28803) != 0)
												throw new RuntimeException("bad command");
											    Class67_Sub27.anIntArray3305[i_24_++] = class67_sub5_sub12.method952(i_182_, false, i_181_);
											    break;
											}
											if (i_27_ == 5071) {
											    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
											    boolean bool_183_ = Class67_Sub27.anIntArray3305[--i_24_] == 1;
											    Class67_Sub1_Sub37.method795((byte) 76, RSString, bool_183_);
											    Class67_Sub27.anIntArray3305[i_24_++] = Class53.anInt1067;
											    break;
											}
											if (i_27_ == 5072) {
											    if (Class67_Sub1_Sub23.aShortArray4184 == null || (Class129_Sub1.anInt3484 ^ 0xffffffff) <= (Class53.anInt1067 ^ 0xffffffff))
												Class67_Sub27.anIntArray3305[i_24_++] = -1;
											    else
												Class67_Sub27.anIntArray3305[i_24_++] = Class75.method1379(65535, Class67_Sub1_Sub23.aShortArray4184[Class129_Sub1.anInt3484++]);
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5074) {
											    Class129_Sub1.anInt3484 = 0;
											    break;
											}
										    } else if (i_27_ >= 5200) {
											if ((i_27_ ^ 0xffffffff) > -5301) {
											    if ((i_27_ ^ 0xffffffff) == -5201) {
												Class67_Sub5_Sub15.method981(Class67_Sub27.anIntArray3305[--i_24_], true);
												break;
											    }
											    if (i_27_ == 5201) {
												Class67_Sub27.anIntArray3305[i_24_++] = Class55_Sub1.method464(arg1 + 22473);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5203) {
												Class21.method198((byte) 95, Class67_Sub27.anIntArray3305[--i_24_]);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5204) {
												Class67_Sub21.method1276(RuntimeException_Sub1.aRSStringArray2623[--i_25_], (byte) 77);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5205) {
												RuntimeException_Sub1.aRSStringArray2623[i_25_ - 1] = Class67_Sub26.method1297(RuntimeException_Sub1.aRSStringArray2623[-1 + i_25_], -1);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5206) {
												Class47.method419(-1, RuntimeException_Sub1.aRSStringArray2623[--i_25_]);
												break;
											    }
											    if (i_27_ == 5206) {
												int i_184_ = Class67_Sub27.anIntArray3305[--i_24_];
												Class67_Sub5_Sub6 class67_sub5_sub6 = Class91.method1475(19451, (0xfffee0d & i_184_) >> 2101680046, 0x3fff & i_184_);
												if (class67_sub5_sub6 == null)
												    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
												else
												    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class67_sub5_sub6.aRSString_4553;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5208) {
												Class67_Sub5_Sub6 class67_sub5_sub6 = Class131.method1762(-23, RuntimeException_Sub1.aRSStringArray2623[--i_25_]);
												if (class67_sub5_sub6 == null || class67_sub5_sub6.aRSString_4552 == null)
												    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
												else
												    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class67_sub5_sub6.aRSString_4552;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5209) {
												Class67_Sub27.anIntArray3305[i_24_++] = Class134.anInt2467;
												Class67_Sub27.anIntArray3305[i_24_++] = Class132.anInt2437;
												break;
											    }
											    if (i_27_ == 5209) {
												Class67_Sub27.anIntArray3305[i_24_++] = Class100.anInt1968 + Class67_Sub3.anInt2853;
												Class67_Sub27.anIntArray3305[i_24_++] = -Class118.anInt2231 + Class131_Sub5.anInt3656 + (-1 + Class67_Sub1_Sub21.anInt4159);
												break;
											    }
											    if (i_27_ == 5210) {
												Class67_Sub5_Sub6 class67_sub5_sub6 = Class67_Sub1_Sub13.method672(23410);
												if (class67_sub5_sub6 == null) {
												    Class67_Sub27.anIntArray3305[i_24_++] = 0;
												    Class67_Sub27.anIntArray3305[i_24_++] = 0;
												} else {
												    Class67_Sub27.anIntArray3305[i_24_++] = class67_sub5_sub6.anInt4550 * 64;
												    Class67_Sub27.anIntArray3305[i_24_++] = class67_sub5_sub6.anInt4551 * 64;
												}
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5212) {
												Class67_Sub5_Sub6 class67_sub5_sub6 = Class67_Sub1_Sub13.method672(23410);
												if (class67_sub5_sub6 == null) {
												    Class67_Sub27.anIntArray3305[i_24_++] = 0;
												    Class67_Sub27.anIntArray3305[i_24_++] = 0;
												} else {
												    Class67_Sub27.anIntArray3305[i_24_++] = class67_sub5_sub6.anInt4539 + -class67_sub5_sub6.anInt4542;
												    Class67_Sub27.anIntArray3305[i_24_++] = class67_sub5_sub6.anInt4560 - class67_sub5_sub6.anInt4556;
												}
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5213) {
												int i_185_ = Class67_Sub1_Sub19.method709(arg1 + 22465);
												int i_186_ = 0;
												RSString RSString;
												if ((i_185_ ^ 0xffffffff) != 0) {
												    RSString = Class68.aClass72_1369.aRSStringArray1441[i_185_];
												    i_186_ = Class68.aClass72_1369.method1345(i_185_, (byte) 49);
												} else
												    RSString = Class132.aRSString_2442;
												RSString = RSString.method508(Class12.aRSString_421, true, Class67_Sub1_Sub39.aRSString_4447);
												RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString;
												Class67_Sub27.anIntArray3305[i_24_++] = i_186_;
												break;
											    }
											    if (i_27_ == 5213) {
												int i_187_ = Class27.method254(112);
												int i_188_ = 0;
												RSString RSString;
												if ((i_187_ ^ 0xffffffff) != 0) {
												    RSString = Class68.aClass72_1369.aRSStringArray1441[i_187_];
												    i_188_ = Class68.aClass72_1369.method1345(i_187_, (byte) 84);
												} else
												    RSString = Class132.aRSString_2442;
												RSString = RSString.method508(Class12.aRSString_421, true, Class67_Sub1_Sub39.aRSString_4447);
												RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString;
												Class67_Sub27.anIntArray3305[i_24_++] = i_188_;
												break;
											    }
											    if (i_27_ == 5214) {
												int i_189_ = Class67_Sub27.anIntArray3305[--i_24_];
												Class67_Sub1_Sub32.method767(arg1 + 16966, i_189_ & 0x3fff, (i_189_ & 0xfffeca7) >> -1524330642);
												break;
											    }
											    if (i_27_ == 5215) {
												int i_190_ = Class67_Sub27.anIntArray3305[--i_24_];
												RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
												Class120 class120 = Class108.method1575(i_190_ & 0x3fff, (0xffff318 & i_190_) >> -169002930, -29055);
												boolean bool_191_ = false;
												for (Class67_Sub5_Sub6 class67_sub5_sub6 = (Class67_Sub5_Sub6) class120.method1656(104); class67_sub5_sub6 != null; class67_sub5_sub6 = (Class67_Sub5_Sub6) class120.method1668(true)) {
												    if (class67_sub5_sub6.aRSString_4553.method526(-114, RSString)) {
													bool_191_ = true;
													break;
												    }
												}
												if (bool_191_)
												    Class67_Sub27.anIntArray3305[i_24_++] = 1;
												else
												    Class67_Sub27.anIntArray3305[i_24_++] = 0;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5217) {
												int i_192_ = Class67_Sub27.anIntArray3305[--i_24_];
												Class123.method1697(i_192_, (byte) -126);
												break;
											    }
											    if (i_27_ == 5217) {
												int i_193_ = Class67_Sub27.anIntArray3305[--i_24_];
												if (Class19.method190(false, i_193_))
												    Class67_Sub27.anIntArray3305[i_24_++] = 1;
												else
												    Class67_Sub27.anIntArray3305[i_24_++] = 0;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5219) {
												Class67_Sub5_Sub6 class67_sub5_sub6 = Class67_Sub1_Sub13.method672(arg1 ^ ~0xc2d);
												if (class67_sub5_sub6 != null)
												    Class67_Sub27.anIntArray3305[i_24_++] = class67_sub5_sub6.anInt4541;
												else
												    Class67_Sub27.anIntArray3305[i_24_++] = -1;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5220) {
												Class67_Sub5_Sub2.method840(125, RuntimeException_Sub1.aRSStringArray2623[--i_25_]);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5221) {
												Class67_Sub27.anIntArray3305[i_24_++] = Class115.anInt2185 == 100 ? 1 : 0;
												break;
											    }
											} else if ((i_27_ ^ 0xffffffff) > -5401) {
											    if (i_27_ == 5300) {
												i_24_ -= 2;
												Class67_Sub27.anIntArray3305[i_24_++] = 0;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5302)
												break;
											    if (i_27_ == 5302) {
												Class67_Sub27.anIntArray3305[i_24_++] = 0;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5304) {
												i_24_--;
												Class67_Sub27.anIntArray3305[i_24_++] = 0;
												Class67_Sub27.anIntArray3305[i_24_++] = 0;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5306) {
												int i_194_ = -1;
												Class67_Sub27.anIntArray3305[i_24_++] = i_194_;
												break;
											    }
											    if (i_27_ == 5306) {
												Class67_Sub27.anIntArray3305[i_24_++] = Class78.method1413(arg1 + 22459);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5308) {
												int i_195_ = Class67_Sub27.anIntArray3305[--i_24_];
												if (i_195_ < 0 || (i_195_ ^ 0xffffffff) < -3)
												    i_195_ = 0;
												Class67_Sub28.method1305(-1, true, i_195_, false, -1);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5309) {
												Class67_Sub27.anIntArray3305[i_24_++] = Class2.anInt112;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5310) {
												int i_196_ = Class67_Sub27.anIntArray3305[--i_24_];
												if (i_196_ < 0 || (i_196_ ^ 0xffffffff) < -3)
												    i_196_ = 0;
												Class2.anInt112 = i_196_;
												Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												break;
											    }
											} else if (i_27_ < 5500) {
											    if (i_27_ == 5400) {
												Class96.anInt1918++;
												i_25_ -= 2;
												RSString RSString = RuntimeException_Sub1.aRSStringArray2623[i_25_];
												RSString RSString_197_ = RuntimeException_Sub1.aRSStringArray2623[i_25_ + 1];
												int i_198_ = Class67_Sub27.anIntArray3305[--i_24_];
												Class70_Sub1.outStream.createFrame(2, 117);
												Class70_Sub1.outStream.addByte((byte) 4, Class80.method1423(18241, RSString) - (-Class80.method1423(18241, RSString_197_) + -1));
												Class70_Sub1.outStream.writeRSString(RSString, (byte) 0);
												Class70_Sub1.outStream.writeRSString(RSString_197_, (byte) 0);
												Class70_Sub1.outStream.addByte((byte) 4, i_198_);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5402) {
												i_24_ -= 2;
												Class109.aShortArray2092[Class67_Sub27.anIntArray3305[i_24_]] = (short) Class67_Sub5_Sub8.method881((byte) -117, Class67_Sub27.anIntArray3305[i_24_ + 1]);
												Class14.method158(-90);
												Class67_Sub5_Sub16.method987((byte) -101);
												Class126_Sub2.method1716(false);
												Class67_Sub5_Sub2.method839(-121);
												Class67_Sub5_Sub14.method968(-70);
												break;
											    }
											    if (i_27_ == 5405) {
												i_24_ -= 2;
												int i_199_ = Class67_Sub27.anIntArray3305[1 + i_24_];
												int i_200_ = Class67_Sub27.anIntArray3305[i_24_];
												if ((i_200_ ^ 0xffffffff) <= -1 && i_200_ < 2)
												    Class75.anIntArrayArrayArray2701[i_200_] = new int[i_199_ << 2125761185][4];
												break;
											    }
											    if (i_27_ == 5406) {
												i_24_ -= 7;
												int i_201_ = Class67_Sub27.anIntArray3305[i_24_];
												int i_202_ = Class67_Sub27.anIntArray3305[i_24_ - -2];
												int i_203_ = Class67_Sub27.anIntArray3305[i_24_ + 1] << 106910881;
												int i_204_ = Class67_Sub27.anIntArray3305[3 + i_24_];
												int i_205_ = Class67_Sub27.anIntArray3305[4 + i_24_];
												int i_206_ = Class67_Sub27.anIntArray3305[i_24_ - -5];
												int i_207_ = Class67_Sub27.anIntArray3305[i_24_ - -6];
												if ((i_201_ ^ 0xffffffff) <= -1 && (i_201_ ^ 0xffffffff) > -3 && Class75.anIntArrayArrayArray2701[i_201_] != null && i_203_ >= 0 && i_203_ < Class75.anIntArrayArrayArray2701[i_201_].length) {
												    Class75.anIntArrayArrayArray2701[i_201_][i_203_] = new int[] { 128 * Class75.method1379(i_202_ >> -1774094546, 16383), i_204_, Class75.method1379(i_202_, 16383) * 128, i_207_ };
												    Class75.anIntArrayArrayArray2701[i_201_][1 + i_203_] = new int[] { 128 * (Class75.method1379(i_205_, 268420521) >> 489181742), i_206_, Class75.method1379(16383, i_205_) * 128 };
												}
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5408) {
												int i_208_ = Class75.anIntArrayArrayArray2701[Class67_Sub27.anIntArray3305[--i_24_]].length >> 705226689;
												Class67_Sub27.anIntArray3305[i_24_++] = i_208_;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5412) {
												if (Class120.aFrame2272 == null)
												    Class67_Sub1_Sub19.method707(false, (byte) 76, Class67_Sub5_Sub3.method841(arg1 ^ 0x7457));
												else
												    System.exit(0);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5420) {
												RSString RSString = Class132.aRSString_2442;
												if (Class27.aClass31_628 != null) {
												    RSString = Class67_Sub5_Sub4_Sub2.method860(Class27.aClass31_628.anInt707, true);
												    try {
													if (Class27.aClass31_628.anObject705 != null) {
													    byte[] is_209_ = ((String) Class27.aClass31_628.anObject705).getBytes("ISO-8859-1");
													    RSString = Class34.method303(is_209_, 0, is_209_.length, arg1 ^ ~0x575f);
													}
												    } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
													/* empty */
												    }
												}
												RuntimeException_Sub1.aRSStringArray2623[i_25_++] = RSString;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5421) {
												Class67_Sub27.anIntArray3305[i_24_++] = SignLink.anInt931 != 3 ? 0 : 1;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5422) {
												RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
												boolean bool_210_ = (Class67_Sub27.anIntArray3305[--i_24_] ^ 0xffffffff) == -2;
												RSString RSString_211_ = Class67_Sub1_Sub27.method744(new RSString[] { Class67_Sub5_Sub3.method841(-8969), RSString }, -108);
												if (Class120.aFrame2272 == null && (!bool_210_ || SignLink.anInt931 == 3 || !SignLink.aString937.startsWith("win") || Class67_Sub1_Sub37.aBoolean4406))
												    Class67_Sub1_Sub19.method707(bool_210_, (byte) 89, RSString_211_);
												else {
												    client.aRSString_2750 = RSString_211_;
												    Class67_Sub1_Sub16_Sub1.aBoolean5095 = bool_210_;
												    Class67_Sub5_Sub2.aClass31_4475 = Class124.aSignLink_2335.method405(new String(RSString_211_.method518(false), "ISO-8859-1"), (byte) -102);
												}
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5423) {
												i_25_ -= 2;
												RSString RSString = RuntimeException_Sub1.aRSStringArray2623[i_25_ - -1];
												RSString RSString_212_ = RuntimeException_Sub1.aRSStringArray2623[i_25_];
												int i_213_ = Class67_Sub27.anIntArray3305[--i_24_];
												if (RSString_212_.method531((byte) 62) > 0) {
												    if (Class65.aRSStringArray1279 == null)
													Class65.aRSStringArray1279 = new RSString[Class20.anIntArray510[Class69.anInt1381]];
												    Class65.aRSStringArray1279[i_213_] = RSString_212_;
												}
												if ((RSString.method531((byte) -19) ^ 0xffffffff) < -1) {
												    if (Class67_Sub1_Sub9.aRSStringArray3943 == null)
													Class67_Sub1_Sub9.aRSStringArray3943 = new RSString[Class20.anIntArray510[Class69.anInt1381]];
												    Class67_Sub1_Sub9.aRSStringArray3943[i_213_] = RSString;
												}
												break;
											    }
											    if (i_27_ == 5423) {
												RuntimeException_Sub1.aRSStringArray2623[--i_25_].method535(0);
												break;
											    }
											    if (i_27_ == 5424) {
												i_24_ -= 11;
												Class82.anInt1668 = Class67_Sub27.anIntArray3305[i_24_];
												Class23.anInt568 = Class67_Sub27.anIntArray3305[i_24_ - -1];
												Class55_Sub3.anInt2811 = Class67_Sub27.anIntArray3305[i_24_ - -2];
												Class12.anInt424 = Class67_Sub27.anIntArray3305[i_24_ - -3];
												Class14.anInt448 = Class67_Sub27.anIntArray3305[4 + i_24_];
												Canvas_Sub1.anInt58 = Class67_Sub27.anIntArray3305[i_24_ - -5];
												Class67_Sub5_Sub4_Sub1.anInt5117 = Class67_Sub27.anIntArray3305[6 + i_24_];
												Class67_Sub1_Sub17.anInt4092 = Class67_Sub27.anIntArray3305[i_24_ + 7];
												Class67_Sub1_Sub2.anInt3838 = Class67_Sub27.anIntArray3305[8 + i_24_];
												Class67_Sub5_Sub16.anInt4778 = Class67_Sub27.anIntArray3305[i_24_ + 9];
												Class15.anInt457 = Class67_Sub27.anIntArray3305[i_24_ - -10];
												Class51.aClass9_1044.method132(Class14.anInt448, true);
												Class51.aClass9_1044.method132(Canvas_Sub1.anInt58, true);
												Class51.aClass9_1044.method132(Class67_Sub5_Sub4_Sub1.anInt5117, true);
												Class51.aClass9_1044.method132(Class67_Sub1_Sub17.anInt4092, true);
												Class51.aClass9_1044.method132(Class67_Sub1_Sub2.anInt3838, true);
												Class36.aBoolean771 = true;
												break;
											    }
											    if (i_27_ == 5425) {
												Class67_Sub5_Sub17.method996(false);
												Class36.aBoolean771 = false;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5427) {
												Class131_Sub4.anInt3645 = Class67_Sub27.anIntArray3305[--i_24_];
												break;
											    }
											    if (i_27_ == 5427) {
												i_24_ -= 2;
												Class33_Sub2.anInt2783 = Class67_Sub27.anIntArray3305[i_24_];
												Class85.anInt1746 = Class67_Sub27.anIntArray3305[i_24_ + 1];
												break;
											    }
											} else if ((i_27_ ^ 0xffffffff) <= -5601) {
											    if (i_27_ < 5700) {
												if ((i_27_ ^ 0xffffffff) == -5601) {
												    i_25_ -= 2;
												    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[i_25_];
												    RSString RSString_214_ = RuntimeException_Sub1.aRSStringArray2623[1 + i_25_];
												    int i_215_ = Class67_Sub27.anIntArray3305[--i_24_];
												    if (Class67_Sub5_Sub18.anInt4804 == 10) {
													if ((Class67_Sub5_Sub12.anInt4695 ^ 0xffffffff) == -1 && (Class67_Sub1_Sub21.loginStep ^ 0xffffffff) == -1 && Class67_Sub26.anInt3277 == 0 && (Class140.anInt2549 ^ 0xffffffff) == -1)
													    Class67_Sub5_Sub8.method891(RSString, RSString_214_, i_215_, 0);
												    }
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -5602) {
												    Class142.method1958(arg1 ^ ~0x576f);
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -5603) {
												    if ((Class67_Sub1_Sub21.loginStep ^ 0xffffffff) == -1)
													Class28.anInt652 = -2;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -5604) {
												    i_24_ -= 4;
												    if (Class67_Sub5_Sub18.anInt4804 == 10) {
													if ((Class67_Sub5_Sub12.anInt4695 ^ 0xffffffff) == -1 && (Class67_Sub1_Sub21.loginStep ^ 0xffffffff) == -1 && (Class67_Sub26.anInt3277 ^ 0xffffffff) == -1 && Class140.anInt2549 == 0)
													    Class142.method1951(Class67_Sub27.anIntArray3305[1 + i_24_], Class67_Sub27.anIntArray3305[i_24_ + 3], Class67_Sub27.anIntArray3305[2 + i_24_], Class67_Sub27.anIntArray3305[i_24_], 9);
												    }
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -5605) {
												    i_25_--;
												    if (Class67_Sub5_Sub18.anInt4804 == 10) {
													if (Class67_Sub5_Sub12.anInt4695 == 0 && (Class67_Sub1_Sub21.loginStep ^ 0xffffffff) == -1 && Class67_Sub26.anInt3277 == 0 && Class140.anInt2549 == 0)
													    Class67_Sub1_Sub9.method655(RuntimeException_Sub1.aRSStringArray2623[i_25_].method501((byte) -16), -121);
												    }
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -5606) {
												    i_24_ -= 4;
												    i_25_ -= 2;
												    if ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -11) {
													if (Class67_Sub5_Sub12.anInt4695 == 0 && Class67_Sub1_Sub21.loginStep == 0 && (Class67_Sub26.anInt3277 ^ 0xffffffff) == -1 && Class140.anInt2549 == 0)
													    Class85.method1451(RuntimeException_Sub1.aRSStringArray2623[i_25_].method501((byte) -16), Class67_Sub27.anIntArray3305[i_24_ - -3], Class67_Sub27.anIntArray3305[2 + i_24_], Class67_Sub27.anIntArray3305[i_24_], RuntimeException_Sub1.aRSStringArray2623[i_25_ - -1], Class67_Sub27.anIntArray3305[i_24_ - -1], 118);
												    }
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -5607) {
												    if (Class67_Sub26.anInt3277 == 0)
													Class91.anInt1857 = -2;
												    break;
												}
												if (i_27_ == 5607) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class28.anInt652;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -5609) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class126_Sub2.anInt3438;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -5610) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class91.anInt1857;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -5611) {
												    for (int i_216_ = 0; (i_216_ ^ 0xffffffff) > -6; i_216_++)
													RuntimeException_Sub1.aRSStringArray2623[i_25_++] = (Class67_Sub1_Sub8.aRSStringArray3924.length ^ 0xffffffff) >= (i_216_ ^ 0xffffffff) ? Class132.aRSString_2442 : Class67_Sub1_Sub8.aRSStringArray3924[i_216_].method500(0);
												    Class67_Sub1_Sub8.aRSStringArray3924 = null;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -5612) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class76.anInt1548;
												    break;
												}
											    } else if ((i_27_ ^ 0xffffffff) > -6101) {
												if (i_27_ == 6001) {
												    int i_217_ = Class67_Sub27.anIntArray3305[--i_24_];
												    if (i_217_ < 1)
													i_217_ = 1;
												    if ((i_217_ ^ 0xffffffff) < -5)
													i_217_ = 4;
												    Class28.anInt667 = i_217_;
												    if ((Class28.anInt667 ^ 0xffffffff) == -2)
													Class26.method230(0.9F);
												    if (Class28.anInt667 == 2)
													Class26.method230(0.8F);
												    if (Class28.anInt667 == 3)
													Class26.method230(0.7F);
												    if (Class28.anInt667 == 4)
													Class26.method230(0.6F);
												    Class67_Sub5_Sub16.method987((byte) -75);
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6003) {
												    Class131_Sub7_Sub2.method1893((byte) -35, Class67_Sub27.anIntArray3305[--i_24_] == 1);
												    Class73.method1356(82);
												    Class122.method1695(-31);
												    Class55_Sub2.method470(512);
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6004) {
												    Class100.aBoolean1977 = (Class67_Sub27.anIntArray3305[--i_24_] ^ 0xffffffff) == -2;
												    Class55_Sub2.method470(512);
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if (i_27_ == 6005) {
												    InputStream_Sub1.aBoolean77 = Class67_Sub27.anIntArray3305[--i_24_] == 1;
												    Class122.method1695(-31);
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if (i_27_ == 6006) {
												    Class67_Sub5_Sub2.aBoolean4468 = Class67_Sub27.anIntArray3305[--i_24_] == 1;
												    ((Class75) Class26.anInterface3_623).method1375(arg1 + 22283, !Class67_Sub5_Sub2.aBoolean4468);
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if (i_27_ == 6007) {
												    Class55_Sub3.aBoolean2808 = (Class67_Sub27.anIntArray3305[--i_24_] ^ 0xffffffff) == -2;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6009) {
												    Class6.aBoolean157 = (Class67_Sub27.anIntArray3305[--i_24_] ^ 0xffffffff) == -2;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6010) {
												    InputStream_Sub1.aBoolean78 = Class67_Sub27.anIntArray3305[--i_24_] == 1;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if (i_27_ == 6010) {
												    Class67_Sub5_Sub9.aBoolean4614 = Class67_Sub27.anIntArray3305[--i_24_] == 1;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if (i_27_ == 6011) {
												    int i_218_ = Class67_Sub27.anIntArray3305[--i_24_];
												    if ((i_218_ ^ 0xffffffff) > -1 || (i_218_ ^ 0xffffffff) < -3)
													i_218_ = 0;
												    Class67_Sub25.anInt3253 = i_218_;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if (i_27_ == 6012) {
												    Class123.aBoolean2318 = Class67_Sub27.anIntArray3305[--i_24_] == 1;
												    if (Class28.anInt667 == 1)
													Class26.method230(0.9F);
												    if (Class28.anInt667 == 2)
													Class26.method230(0.8F);
												    if ((Class28.anInt667 ^ 0xffffffff) == -4)
													Class26.method230(0.7F);
												    if ((Class28.anInt667 ^ 0xffffffff) == -5)
													Class26.method230(0.6F);
												    Class122.method1695(-31);
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if (i_27_ == 6014) {
												    Class72.aBoolean1432 = (Class67_Sub27.anIntArray3305[--i_24_] ^ 0xffffffff) == -2;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if (i_27_ == 6015) {
												    Class128.aBoolean2385 = (Class67_Sub27.anIntArray3305[--i_24_] ^ 0xffffffff) == -2;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if (i_27_ == 6016) {
												    int i_219_ = Class67_Sub27.anIntArray3305[--i_24_];
												    if (i_219_ < 0 || i_219_ > 2)
													i_219_ = 0;
												    Class74.anInt1485 = i_219_;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6018) {
												    Class105.aBoolean2044 = (Class67_Sub27.anIntArray3305[--i_24_] ^ 0xffffffff) == -2;
												    Class109.method1579(1);
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6019) {
												    int i_220_ = Class67_Sub27.anIntArray3305[--i_24_];
												    if (i_220_ < 0)
													i_220_ = 0;
												    if (i_220_ > 127)
													i_220_ = 127;
												    Class67_Sub21.anInt3176 = i_220_;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6020) {
												    int i_221_ = Class67_Sub27.anIntArray3305[--i_24_];
												    if ((i_221_ ^ 0xffffffff) > -1)
													i_221_ = 0;
												    if ((i_221_ ^ 0xffffffff) < -256)
													i_221_ = 255;
												    if ((i_221_ ^ 0xffffffff) != (Class67_Sub1_Sub29.anInt4259 ^ 0xffffffff)) {
													if (Class67_Sub1_Sub29.anInt4259 != 0 || (Class27.anInt637 ^ 0xffffffff) == 0) {
													    if (i_221_ != 0)
														Class67_Sub1_Sub22.method724(i_221_, 120);
													    else {
														Class83.method1439((byte) -67);
														Class57.aBoolean1106 = false;
													    }
													} else {
													    Class102.method1546(0, false, Class27.anInt637, Class9.aClass9_362, i_221_, (byte) -103);
													    Class57.aBoolean1106 = false;
													}
													Class67_Sub1_Sub29.anInt4259 = i_221_;
												    }
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6021) {
												    int i_222_ = Class67_Sub27.anIntArray3305[--i_24_];
												    if (i_222_ < 0)
													i_222_ = 0;
												    if ((i_222_ ^ 0xffffffff) < -128)
													i_222_ = 127;
												    Class27.anInt644 = i_222_;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    break;
												}
												if (i_27_ == 6021) {
												    Class74.aBoolean1495 = Class67_Sub27.anIntArray3305[--i_24_] == 1;
												    Class55_Sub2.method470(512);
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6024) {
												    int i_223_ = Class67_Sub27.anIntArray3305[--i_24_];
												    if ((i_223_ ^ 0xffffffff) > -1)
													i_223_ = 0;
												    boolean bool_224_ = false;
												    if ((i_223_ ^ 0xffffffff) < -3)
													i_223_ = 2;
												    if (Class122.anInt2307 < 96) {
													i_223_ = 0;
													bool_224_ = true;
												    }
												    Class61_Sub1.method557(i_223_);
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    Class67_Sub5_Sub4_Sub2.aBoolean5132 = false;
												    Class67_Sub27.anIntArray3305[i_24_++] = bool_224_ ? 0 : 1;
												    break;
												}
												if (i_27_ == 6024) {
												    int i_225_ = Class67_Sub27.anIntArray3305[--i_24_];
												    if (i_225_ < 0 || i_225_ > 2)
													i_225_ = 0;
												    Class75.anInt2716 = i_225_;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6029) {
												    Class67_Sub1_Sub38.aBoolean4431 = Class67_Sub27.anIntArray3305[--i_24_] != 0;
												    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
												    break;
												}
											    } else if ((i_27_ ^ 0xffffffff) <= -6201) {
												if (i_27_ < 6300) {
												    if (i_27_ == 6200) {
													i_24_ -= 2;
													Class64.aShort1224 = (short) Class67_Sub27.anIntArray3305[i_24_];
													if (Class64.aShort1224 <= 0)
													    Class64.aShort1224 = (short) 256;
													Class67_Sub5_Sub8.aShort4577 = (short) Class67_Sub27.anIntArray3305[1 + i_24_];
													if ((Class67_Sub5_Sub8.aShort4577 ^ 0xffffffff) >= -1)
													    Class67_Sub5_Sub8.aShort4577 = (short) 205;
													break;
												    }
												    if (i_27_ == 6201) {
													i_24_ -= 2;
													Class67_Sub1_Sub10.aShort3977 = (short) Class67_Sub27.anIntArray3305[i_24_];
													if (Class67_Sub1_Sub10.aShort3977 <= 0)
													    Class67_Sub1_Sub10.aShort3977 = (short) 256;
													Class55_Sub1.aShort2789 = (short) Class67_Sub27.anIntArray3305[i_24_ - -1];
													if ((Class55_Sub1.aShort2789 ^ 0xffffffff) >= -1)
													    Class55_Sub1.aShort2789 = (short) 320;
													break;
												    }
												    if ((i_27_ ^ 0xffffffff) == -6203) {
													i_24_ -= 4;
													Class4.aShort131 = (short) Class67_Sub27.anIntArray3305[i_24_];
													if (Class4.aShort131 <= 0)
													    Class4.aShort131 = (short) 1;
													Class67_Sub1_Sub26.aShort4236 = (short) Class67_Sub27.anIntArray3305[i_24_ - -1];
													if (Class67_Sub1_Sub26.aShort4236 <= 0)
													    Class67_Sub1_Sub26.aShort4236 = (short) 32767;
													else if (Class67_Sub1_Sub26.aShort4236 < Class4.aShort131)
													    Class67_Sub1_Sub26.aShort4236 = Class4.aShort131;
													Class67_Sub1_Sub21.aShort4157 = (short) Class67_Sub27.anIntArray3305[i_24_ + 2];
													if ((Class67_Sub1_Sub21.aShort4157 ^ 0xffffffff) >= -1)
													    Class67_Sub1_Sub21.aShort4157 = (short) 1;
													Class4.aShort123 = (short) Class67_Sub27.anIntArray3305[3 + i_24_];
													if (Class4.aShort123 <= 0)
													    Class4.aShort123 = (short) 32767;
													else if (Class67_Sub1_Sub21.aShort4157 > Class4.aShort123)
													    Class4.aShort123 = Class67_Sub1_Sub21.aShort4157;
													break;
												    }
												    if ((i_27_ ^ 0xffffffff) == -6204) {
													Class14.method162(0, 0, 64, Class13.aClass7_436.anInt194, false, Class13.aClass7_436.anInt189);
													Class67_Sub27.anIntArray3305[i_24_++] = Class114.anInt2156;
													Class67_Sub27.anIntArray3305[i_24_++] = Class116.anInt2196;
													break;
												    }
												    if ((i_27_ ^ 0xffffffff) == -6205) {
													Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub10.aShort3977;
													Class67_Sub27.anIntArray3305[i_24_++] = Class55_Sub1.aShort2789;
													break;
												    }
												    if (i_27_ == 6205) {
													Class67_Sub27.anIntArray3305[i_24_++] = Class64.aShort1224;
													Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub5_Sub8.aShort4577;
													break;
												    }
												} else if (i_27_ < 6400) {
												    if (i_27_ == 6300) {
													Class67_Sub27.anIntArray3305[i_24_++] = (int) (Class39.method337(19644) / 60000L);
													break;
												    }
												    if ((i_27_ ^ 0xffffffff) == -6302) {
													Class67_Sub27.anIntArray3305[i_24_++] = -11745 + (int) (Class39.method337(19644) / 86400000L);
													break;
												    }
												    if ((i_27_ ^ 0xffffffff) == -6303) {
													i_24_ -= 3;
													int i_226_ = Class67_Sub27.anIntArray3305[1 + i_24_];
													int i_227_ = Class67_Sub27.anIntArray3305[i_24_];
													int i_228_ = Class67_Sub27.anIntArray3305[2 + i_24_];
													Class67_Sub20.aCalendar3157.clear();
													Class67_Sub20.aCalendar3157.set(11, 12);
													Class67_Sub20.aCalendar3157.set(i_228_, i_226_, i_227_);
													Class67_Sub27.anIntArray3305[i_24_++] = -11745 + (int) (Class67_Sub20.aCalendar3157.getTime().getTime() / 86400000L);
													break;
												    }
												    if (i_27_ == 6303) {
													Class67_Sub20.aCalendar3157.clear();
													Class67_Sub20.aCalendar3157.setTime(new Date(Class39.method337(19644)));
													Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub20.aCalendar3157.get(1);
													break;
												    }
												    if (i_27_ == 6304) {
													int i_229_ = Class67_Sub27.anIntArray3305[--i_24_];
													boolean bool_230_ = true;
													if ((i_229_ ^ 0xffffffff) <= -1) {
													    if ((i_229_ ^ 0xffffffff) <= -1583) {
														if ((i_229_ % 4 ^ 0xffffffff) == -1) {
														    if ((i_229_ % 100 ^ 0xffffffff) == -1) {
															if ((i_229_ % 400 ^ 0xffffffff) != -1)
															    bool_230_ = false;
														    } else
															bool_230_ = true;
														} else
														    bool_230_ = false;
													    } else
														bool_230_ = (i_229_ % 4 ^ 0xffffffff) == -1;
													} else
													    bool_230_ = ((i_229_ - -1) % 4 ^ 0xffffffff) == -1;
													Class67_Sub27.anIntArray3305[i_24_++] = !bool_230_ ? 0 : 1;
													break;
												    }
												} else if (i_27_ >= 6500) {
												    if ((i_27_ ^ 0xffffffff) <= -6601) {
													if ((i_27_ ^ 0xffffffff) > -6701) {
													    if ((i_27_ ^ 0xffffffff) != -6601) {
														if ((i_27_ ^ 0xffffffff) == -6602) {
														    Class67_Sub27.anIntArray3305[i_24_++] = Class53.aBoolean1057 ? 1 : 0;
														    break;
														}
													    } else {
														Class53.aBoolean1057 = Class67_Sub27.anIntArray3305[--i_24_] == 1;
														Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
														break;
													    }
													}
												    } else {
													if (i_27_ == 6500) {
													    if ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) != -11 || (Class67_Sub5_Sub12.anInt4695 ^ 0xffffffff) != -1 || Class67_Sub1_Sub21.loginStep != 0 || (Class67_Sub26.anInt3277 ^ 0xffffffff) != -1)
														Class67_Sub27.anIntArray3305[i_24_++] = 1;
													    else
														Class67_Sub27.anIntArray3305[i_24_++] = Class65.method596(-1) == -1 ? 0 : 1;
													    break;
													}
													if ((i_27_ ^ 0xffffffff) == -6502) {
													    Class70_Sub1 class70_sub1 = Class67_Sub1_Sub31.method761((byte) 96);
													    if (class70_sub1 != null) {
														Class67_Sub27.anIntArray3305[i_24_++] = class70_sub1.anInt3365;
														Class67_Sub27.anIntArray3305[i_24_++] = class70_sub1.anInt1408;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class70_sub1.aRSString_3367;
														Class95 class95 = class70_sub1.method1338(2047);
														Class67_Sub27.anIntArray3305[i_24_++] = class95.anInt1903;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class95.aRSString_1911;
														Class67_Sub27.anIntArray3305[i_24_++] = class70_sub1.anInt1407;
													    } else {
														Class67_Sub27.anIntArray3305[i_24_++] = -1;
														Class67_Sub27.anIntArray3305[i_24_++] = 0;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
														Class67_Sub27.anIntArray3305[i_24_++] = 0;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
														Class67_Sub27.anIntArray3305[i_24_++] = 0;
													    }
													    break;
													}
													if ((i_27_ ^ 0xffffffff) == -6503) {
													    Class70_Sub1 class70_sub1 = Class15.method165(-68);
													    if (class70_sub1 == null) {
														Class67_Sub27.anIntArray3305[i_24_++] = -1;
														Class67_Sub27.anIntArray3305[i_24_++] = 0;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
														Class67_Sub27.anIntArray3305[i_24_++] = 0;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
														Class67_Sub27.anIntArray3305[i_24_++] = 0;
													    } else {
														Class67_Sub27.anIntArray3305[i_24_++] = class70_sub1.anInt3365;
														Class67_Sub27.anIntArray3305[i_24_++] = class70_sub1.anInt1408;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class70_sub1.aRSString_3367;
														Class95 class95 = class70_sub1.method1338(arg1 ^ ~0x50a0);
														Class67_Sub27.anIntArray3305[i_24_++] = class95.anInt1903;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class95.aRSString_1911;
														Class67_Sub27.anIntArray3305[i_24_++] = class70_sub1.anInt1407;
													    }
													    break;
													}
													if ((i_27_ ^ 0xffffffff) == -6504) {
													    int i_231_ = Class67_Sub27.anIntArray3305[--i_24_];
													    if (Class67_Sub5_Sub18.anInt4804 == 10 && (Class67_Sub5_Sub12.anInt4695 ^ 0xffffffff) == -1 && (Class67_Sub1_Sub21.loginStep ^ 0xffffffff) == -1 && Class67_Sub26.anInt3277 == 0)
														Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub5_Sub4_Sub1.method855(i_231_, 32) ? 1 : 0;
													    else
														Class67_Sub27.anIntArray3305[i_24_++] = 0;
													    break;
													}
													if ((i_27_ ^ 0xffffffff) == -6505) {
													    Class63.anInt1168 = Class67_Sub27.anIntArray3305[--i_24_];
													    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
													    break;
													}
													if (i_27_ == 6505) {
													    Class67_Sub27.anIntArray3305[i_24_++] = Class63.anInt1168;
													    break;
													}
													if ((i_27_ ^ 0xffffffff) == -6507) {
													    int i_232_ = Class67_Sub27.anIntArray3305[--i_24_];
													    Class70_Sub1 class70_sub1 = Class61.method552(i_232_, -63);
													    if (class70_sub1 != null) {
														Class67_Sub27.anIntArray3305[i_24_++] = class70_sub1.anInt1408;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class70_sub1.aRSString_3367;
														Class95 class95 = class70_sub1.method1338(2047);
														Class67_Sub27.anIntArray3305[i_24_++] = class95.anInt1903;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class95.aRSString_1911;
														Class67_Sub27.anIntArray3305[i_24_++] = class70_sub1.anInt1407;
													    } else {
														Class67_Sub27.anIntArray3305[i_24_++] = -1;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
														Class67_Sub27.anIntArray3305[i_24_++] = 0;
														RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
														Class67_Sub27.anIntArray3305[i_24_++] = 0;
													    }
													    break;
													}
													if ((i_27_ ^ 0xffffffff) == -6508) {
													    i_24_ -= 4;
													    int i_233_ = Class67_Sub27.anIntArray3305[i_24_];
													    int i_234_ = Class67_Sub27.anIntArray3305[2 + i_24_];
													    boolean bool_235_ = Class67_Sub27.anIntArray3305[3 + i_24_] == 1;
													    boolean bool_236_ = Class67_Sub27.anIntArray3305[i_24_ - -1] == 1;
													    Class117.method1633(bool_235_, (byte) -113, i_233_, i_234_, bool_236_);
													    break;
													}
												    }
												} else {
												    if (i_27_ == 6405) {
													Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub5_Sub12.method954((byte) 34) ? 1 : 0;
													break;
												    }
												    if ((i_27_ ^ 0xffffffff) == -6407) {
													Class67_Sub27.anIntArray3305[i_24_++] = !Class23.method217((byte) -83) ? 0 : 1;
													break;
												    }
												}
											    } else {
												if (i_27_ == 6101) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class28.anInt667;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6103) {
												    Class67_Sub27.anIntArray3305[i_24_++] = !Class32.method288(true) ? 0 : 1;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6104) {
												    Class67_Sub27.anIntArray3305[i_24_++] = !Class100.aBoolean1977 ? 0 : 1;
												    break;
												}
												if (i_27_ == 6105) {
												    Class67_Sub27.anIntArray3305[i_24_++] = InputStream_Sub1.aBoolean77 ? 1 : 0;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6107) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub5_Sub2.aBoolean4468 ? 1 : 0;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6108) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class55_Sub3.aBoolean2808 ? 1 : 0;
												    break;
												}
												if (i_27_ == 6108) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class6.aBoolean157 ? 1 : 0;
												    break;
												}
												if (i_27_ == 6109) {
												    Class67_Sub27.anIntArray3305[i_24_++] = InputStream_Sub1.aBoolean78 ? 1 : 0;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6111) {
												    Class67_Sub27.anIntArray3305[i_24_++] = !Class67_Sub5_Sub9.aBoolean4614 ? 0 : 1;
												    break;
												}
												if (i_27_ == 6111) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub25.anInt3253;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6113) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class123.aBoolean2318 ? 1 : 0;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6115) {
												    Class67_Sub27.anIntArray3305[i_24_++] = !Class72.aBoolean1432 ? 0 : 1;
												    break;
												}
												if (i_27_ == 6115) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class128.aBoolean2385 ? 1 : 0;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6117) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class74.anInt1485;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6118) {
												    Class67_Sub27.anIntArray3305[i_24_++] = !Class105.aBoolean2044 ? 0 : 1;
												    break;
												}
												if (i_27_ == 6118) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub21.anInt3176;
												    break;
												}
												if (i_27_ == 6119) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub29.anInt4259;
												    break;
												}
												if (i_27_ == 6120) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class27.anInt644;
												    break;
												}
												if (i_27_ == 6121) {
												    Class67_Sub27.anIntArray3305[i_24_++] = 0;
												    break;
												}
												if ((i_27_ ^ 0xffffffff) == -6124) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class61_Sub1.method558();
												    break;
												}
												if (i_27_ == 6124) {
												    Class67_Sub27.anIntArray3305[i_24_++] = Class75.anInt2716;
												    break;
												}
												if (i_27_ == 6128) {
												    Class67_Sub27.anIntArray3305[i_24_++] = !Class67_Sub1_Sub38.aBoolean4431 ? 0 : 1;
												    break;
												}
											    }
											} else {
											    if (i_27_ == 5500) {
												i_24_ -= 4;
												int i_237_ = Class67_Sub27.anIntArray3305[i_24_];
												int i_238_ = Class67_Sub27.anIntArray3305[i_24_ + 2];
												int i_239_ = Class67_Sub27.anIntArray3305[1 + i_24_];
												int i_240_ = Class67_Sub27.anIntArray3305[3 + i_24_];
												Class70.method1334(i_240_, (0x3fff & i_237_ >> 1273195118) + -Class58.baseX, i_239_, i_238_, -126, -Class137.baseY + (i_237_ & 0x3fff), false);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5502) {
												i_24_ -= 4;
												int i_241_ = Class67_Sub27.anIntArray3305[i_24_];
												int i_242_ = Class67_Sub27.anIntArray3305[1 + i_24_];
												int i_243_ = Class67_Sub27.anIntArray3305[2 + i_24_];
												int i_244_ = Class67_Sub27.anIntArray3305[3 + i_24_];
												Class14.method159(i_243_, i_242_, -Class58.baseX + (0x3fff & i_241_ >> 1596070990), i_244_, -Class137.baseY + (i_241_ & 0x3fff), 2047);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5503) {
												i_24_ -= 6;
												int i_245_ = Class67_Sub27.anIntArray3305[i_24_];
												if ((i_245_ ^ 0xffffffff) <= -3)
												    throw new RuntimeException();
												Class67_Sub1_Sub23.anInt4182 = i_245_;
												int i_246_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
												if ((Class75.anIntArrayArrayArray2701[Class67_Sub1_Sub23.anInt4182].length >> 537835489 ^ 0xffffffff) >= (i_246_ + 1 ^ 0xffffffff))
												    throw new RuntimeException();
												Class99_Sub1.anInt3403 = i_246_;
												Class117.anInt2204 = 0;
												Class67_Sub5_Sub5.anInt4514 = Class67_Sub27.anIntArray3305[i_24_ + 2];
												Class87.anInt1773 = Class67_Sub27.anIntArray3305[i_24_ - -3];
												int i_247_ = Class67_Sub27.anIntArray3305[i_24_ - -4];
												if (i_247_ >= 2)
												    throw new RuntimeException();
												Class86.anInt1768 = i_247_;
												int i_248_ = Class67_Sub27.anIntArray3305[5 + i_24_];
												if ((Class75.anIntArrayArrayArray2701[Class86.anInt1768].length >> -1563856255 ^ 0xffffffff) >= (i_248_ - -1 ^ 0xffffffff))
												    throw new RuntimeException();
												Class22.anInt530 = 3;
												Class67_Sub1_Sub28.anInt4258 = i_248_;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5504) {
												Class129.method1736(-1);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5505) {
												i_24_ -= 2;
												Class67_Sub21.anInt3175 = Class67_Sub27.anIntArray3305[i_24_];
												Class67_Sub5_Sub4.anInt4504 = Class67_Sub27.anIntArray3305[i_24_ + 1];
												if ((Class22.anInt530 ^ 0xffffffff) == -3) {
												    Class67_Sub1_Sub2.anInt3839 = Class67_Sub21.anInt3175;
												    Class67_Sub23.anInt3196 = Class67_Sub5_Sub4.anInt4504;
												}
												Class103.method1559(0);
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5506) {
												Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub21.anInt3175;
												break;
											    }
											    if ((i_27_ ^ 0xffffffff) == -5507) {
												Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub5_Sub4.anInt4504;
												break;
											    }
											}
										    } else {
											if ((i_27_ ^ 0xffffffff) == -5101) {
											    if (Class131_Sub7.aBooleanArray3698[86])
												Class67_Sub27.anIntArray3305[i_24_++] = 1;
											    else
												Class67_Sub27.anIntArray3305[i_24_++] = 0;
											    break;
											}
											if (i_27_ == 5101) {
											    if (Class131_Sub7.aBooleanArray3698[82])
												Class67_Sub27.anIntArray3305[i_24_++] = 1;
											    else
												Class67_Sub27.anIntArray3305[i_24_++] = 0;
											    break;
											}
											if ((i_27_ ^ 0xffffffff) == -5103) {
											    if (Class131_Sub7.aBooleanArray3698[81])
												Class67_Sub27.anIntArray3305[i_24_++] = 1;
											    else
												Class67_Sub27.anIntArray3305[i_24_++] = 0;
											    break;
											}
										    }
										} else if ((i_27_ ^ 0xffffffff) == -4401) {
										    i_24_ -= 2;
										    int i_249_ = Class67_Sub27.anIntArray3305[i_24_];
										    int i_250_ = Class67_Sub27.anIntArray3305[1 + i_24_];
										    Class67_Sub5_Sub17 class67_sub5_sub17 = Class8.method103(-118, i_250_);
										    if (class67_sub5_sub17.method990(-13492))
											RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class73.method1359(11525, i_249_).method595((byte) -96, class67_sub5_sub17.aRSString_4794, i_250_);
										    else
											Class67_Sub27.anIntArray3305[i_24_++] = Class73.method1359(11525, i_249_).method592(false, class67_sub5_sub17.anInt4785, i_250_);
										    break;
										}
									    } else {
										if (i_27_ == 4200) {
										    int i_251_ = Class67_Sub27.anIntArray3305[--i_24_];
										    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = PacketParser.method1596(i_251_, arg1 + -5954).itemName;
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4202) {
										    i_24_ -= 2;
										    int i_252_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
										    int i_253_ = Class67_Sub27.anIntArray3305[i_24_];
										    Class76 class76 = PacketParser.method1596(i_253_, -28322);
										    if ((i_252_ ^ 0xffffffff) > -2 || i_252_ > 5 || class76.aRSStringArray1528[-1 + i_252_] == null)
											RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
										    else
											RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class76.aRSStringArray1528[-1 + i_252_];
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4203) {
										    i_24_ -= 2;
										    int i_254_ = Class67_Sub27.anIntArray3305[i_24_];
										    int i_255_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
										    Class76 class76 = PacketParser.method1596(i_254_, -28322);
										    if ((i_255_ ^ 0xffffffff) <= -2 && (i_255_ ^ 0xffffffff) >= -6 && class76.itemActions[-1 + i_255_] != null)
											RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class76.itemActions[i_255_ + -1];
										    else
											RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
										    break;
										}
										if (i_27_ == 4203) {
										    int i_256_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = PacketParser.method1596(i_256_, -28322).anInt1507;
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4205) {
										    int i_257_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = PacketParser.method1596(i_257_, -28322).anInt1559 != 1 ? 0 : 1;
										    break;
										}
										if (i_27_ == 4205) {
										    int i_258_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class76 class76 = PacketParser.method1596(i_258_, -28322);
										    if ((class76.anInt1521 ^ 0xffffffff) != 0 || (class76.anInt1511 ^ 0xffffffff) > -1)
											Class67_Sub27.anIntArray3305[i_24_++] = i_258_;
										    else
											Class67_Sub27.anIntArray3305[i_24_++] = class76.anInt1511;
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4207) {
										    int i_259_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class76 class76 = PacketParser.method1596(i_259_, -28322);
										    if (class76.anInt1521 < 0 || class76.anInt1511 < 0)
											Class67_Sub27.anIntArray3305[i_24_++] = i_259_;
										    else
											Class67_Sub27.anIntArray3305[i_24_++] = class76.anInt1511;
										    break;
										}
										if (i_27_ == 4207) {
										    int i_260_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class67_Sub27.anIntArray3305[i_24_++] = PacketParser.method1596(i_260_, -28322).aBoolean1505 ? 1 : 0;
										    break;
										}
										if (i_27_ == 4208) {
										    i_24_ -= 2;
										    int i_261_ = Class67_Sub27.anIntArray3305[1 + i_24_];
										    int i_262_ = Class67_Sub27.anIntArray3305[i_24_];
										    Class67_Sub5_Sub17 class67_sub5_sub17 = Class8.method103(-84, i_261_);
										    if (class67_sub5_sub17.method990(-13492))
											RuntimeException_Sub1.aRSStringArray2623[i_25_++] = PacketParser.method1596(i_262_, arg1 + -5954).method1401(i_261_, class67_sub5_sub17.aRSString_4794, arg1 + 31462);
										    else
											Class67_Sub27.anIntArray3305[i_24_++] = PacketParser.method1596(i_262_, -28322).method1390(class67_sub5_sub17.anInt4785, i_261_, (byte) -123);
										    break;
										}
										if ((i_27_ ^ 0xffffffff) == -4211) {
										    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
										    int i_263_ = Class67_Sub27.anIntArray3305[--i_24_];
										    Class100.method1534(RSString, i_263_ == 1, 21105);
										    Class67_Sub27.anIntArray3305[i_24_++] = Class53.anInt1067;
										    break;
										}
										if (i_27_ == 4211) {
										    if (Class67_Sub1_Sub23.aShortArray4184 != null && (Class129_Sub1.anInt3484 ^ 0xffffffff) > (Class53.anInt1067 ^ 0xffffffff))
											Class67_Sub27.anIntArray3305[i_24_++] = Class75.method1379(Class67_Sub1_Sub23.aShortArray4184[Class129_Sub1.anInt3484++], 65535);
										    else
											Class67_Sub27.anIntArray3305[i_24_++] = -1;
										    break;
										}
										if (i_27_ == 4212) {
										    Class129_Sub1.anInt3484 = 0;
										    break;
										}
									    }
									} else {
									    if (i_27_ == 4000) {
										i_24_ -= 2;
										int i_264_ = Class67_Sub27.anIntArray3305[i_24_];
										int i_265_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
										Class67_Sub27.anIntArray3305[i_24_++] = i_265_ + i_264_;
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -4002) {
										i_24_ -= 2;
										int i_266_ = Class67_Sub27.anIntArray3305[i_24_];
										int i_267_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
										Class67_Sub27.anIntArray3305[i_24_++] = i_266_ - i_267_;
										break;
									    }
									    if (i_27_ == 4002) {
										i_24_ -= 2;
										int i_268_ = Class67_Sub27.anIntArray3305[1 + i_24_];
										int i_269_ = Class67_Sub27.anIntArray3305[i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = i_269_ * i_268_;
										break;
									    }
									    if (i_27_ == 4003) {
										i_24_ -= 2;
										int i_270_ = Class67_Sub27.anIntArray3305[i_24_];
										int i_271_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
										Class67_Sub27.anIntArray3305[i_24_++] = i_270_ / i_271_;
										break;
									    }
									    if (i_27_ == 4004) {
										int i_272_ = Class67_Sub27.anIntArray3305[--i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = (int) ((double) i_272_ * Math.random());
										break;
									    }
									    if (i_27_ == 4005) {
										int i_273_ = Class67_Sub27.anIntArray3305[--i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = (int) ((double) (i_273_ + 1) * Math.random());
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -4007) {
										i_24_ -= 5;
										int i_274_ = Class67_Sub27.anIntArray3305[i_24_];
										int i_275_ = Class67_Sub27.anIntArray3305[1 + i_24_];
										int i_276_ = Class67_Sub27.anIntArray3305[i_24_ - -2];
										int i_277_ = Class67_Sub27.anIntArray3305[3 + i_24_];
										int i_278_ = Class67_Sub27.anIntArray3305[i_24_ - -4];
										Class67_Sub27.anIntArray3305[i_24_++] = i_274_ + (i_278_ - i_276_) * (-i_274_ + i_275_) / (i_277_ + -i_276_);
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -4008) {
										i_24_ -= 2;
										long l = (long) Class67_Sub27.anIntArray3305[i_24_];
										long l_279_ = (long) Class67_Sub27.anIntArray3305[i_24_ - -1];
										Class67_Sub27.anIntArray3305[i_24_++] = (int) (l + l * l_279_ / 100L);
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -4009) {
										i_24_ -= 2;
										int i_280_ = Class67_Sub27.anIntArray3305[i_24_];
										int i_281_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
										Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub20.method1273(i_280_, 1 << i_281_);
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -4010) {
										i_24_ -= 2;
										int i_282_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
										int i_283_ = Class67_Sub27.anIntArray3305[i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = Class75.method1379(-1 - (1 << i_282_), i_283_);
										break;
									    }
									    if (i_27_ == 4010) {
										i_24_ -= 2;
										int i_284_ = Class67_Sub27.anIntArray3305[i_24_];
										int i_285_ = Class67_Sub27.anIntArray3305[1 + i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = Class75.method1379(1 << i_285_, i_284_) != 0 ? 1 : 0;
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -4012) {
										i_24_ -= 2;
										int i_286_ = Class67_Sub27.anIntArray3305[i_24_];
										int i_287_ = Class67_Sub27.anIntArray3305[1 + i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = i_286_ % i_287_;
										break;
									    }
									    if (i_27_ == 4012) {
										i_24_ -= 2;
										int i_288_ = Class67_Sub27.anIntArray3305[1 + i_24_];
										int i_289_ = Class67_Sub27.anIntArray3305[i_24_];
										if ((i_289_ ^ 0xffffffff) == -1)
										    Class67_Sub27.anIntArray3305[i_24_++] = 0;
										else
										    Class67_Sub27.anIntArray3305[i_24_++] = (int) Math.pow((double) i_289_, (double) i_288_);
										break;
									    }
									    if (i_27_ == 4013) {
										i_24_ -= 2;
										int i_290_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
										int i_291_ = Class67_Sub27.anIntArray3305[i_24_];
										if (i_291_ == 0)
										    Class67_Sub27.anIntArray3305[i_24_++] = 0;
										else if (i_290_ != 0)
										    Class67_Sub27.anIntArray3305[i_24_++] = (int) Math.pow((double) i_291_, 1.0 / (double) i_290_);
										else
										    Class67_Sub27.anIntArray3305[i_24_++] = 2147483647;
										break;
									    }
									    if (i_27_ == 4014) {
										i_24_ -= 2;
										int i_292_ = Class67_Sub27.anIntArray3305[i_24_];
										int i_293_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
										Class67_Sub27.anIntArray3305[i_24_++] = Class75.method1379(i_292_, i_293_);
										break;
									    }
									    if (i_27_ == 4015) {
										i_24_ -= 2;
										int i_294_ = Class67_Sub27.anIntArray3305[i_24_];
										int i_295_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
										Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub20.method1273(i_294_, i_295_);
										break;
									    }
									    if (i_27_ == 4016) {
										i_24_ -= 2;
										int i_296_ = Class67_Sub27.anIntArray3305[i_24_];
										int i_297_ = Class67_Sub27.anIntArray3305[i_24_ + 1];
										Class67_Sub27.anIntArray3305[i_24_++] = (i_296_ ^ 0xffffffff) > (i_297_ ^ 0xffffffff) ? i_296_ : i_297_;
										break;
									    }
									    if (i_27_ == 4017) {
										i_24_ -= 2;
										int i_298_ = Class67_Sub27.anIntArray3305[i_24_ - -1];
										int i_299_ = Class67_Sub27.anIntArray3305[i_24_];
										Class67_Sub27.anIntArray3305[i_24_++] = (i_298_ ^ 0xffffffff) > (i_299_ ^ 0xffffffff) ? i_299_ : i_298_;
										break;
									    }
									    if ((i_27_ ^ 0xffffffff) == -4019) {
										i_24_ -= 3;
										long l = (long) Class67_Sub27.anIntArray3305[i_24_];
										long l_300_ = (long) Class67_Sub27.anIntArray3305[1 + i_24_];
										long l_301_ = (long) Class67_Sub27.anIntArray3305[i_24_ - -2];
										Class67_Sub27.anIntArray3305[i_24_++] = (int) (l_301_ * l / l_300_);
										break;
									    }
									}
								    } else {
									if ((i_27_
									     ^ 0xffffffff)
									    == -3601) {
									    if (Class67_Sub5.anInt2862 == 0)
										Class67_Sub27.anIntArray3305[i_24_++] = -2;
									    else if (Class67_Sub5.anInt2862 == 1)
										Class67_Sub27.anIntArray3305[i_24_++] = -1;
									    else
										Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub5_Sub17.anInt4795;
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3602) {
									    int i_302_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if ((Class67_Sub5.anInt2862 ^ 0xffffffff) != -3 || (i_302_ ^ 0xffffffff) <= (Class67_Sub5_Sub17.anInt4795 ^ 0xffffffff))
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
									    else
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class99_Sub1.aRSStringArray3384[i_302_];
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3603) {
									    int i_303_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if (Class67_Sub5.anInt2862 != 2 || (i_303_ ^ 0xffffffff) <= (Class67_Sub5_Sub17.anInt4795 ^ 0xffffffff))
										Class67_Sub27.anIntArray3305[i_24_++] = 0;
									    else
										Class67_Sub27.anIntArray3305[i_24_++] = Class67.anIntArray1335[i_303_];
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3604) {
									    int i_304_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if ((Class67_Sub5.anInt2862 ^ 0xffffffff) == -3 && (Class67_Sub5_Sub17.anInt4795 ^ 0xffffffff) < (i_304_ ^ 0xffffffff))
										Class67_Sub27.anIntArray3305[i_24_++] = OutputStream_Sub1.anIntArray88[i_304_];
									    else
										Class67_Sub27.anIntArray3305[i_24_++] = 0;
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3605) {
									    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									    int i_305_ = Class67_Sub27.anIntArray3305[--i_24_];
									    Class49.method426(RSString, (byte) -107, i_305_);
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3606) {
									    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									    Class67_Sub1_Sub20.method713(118, RSString.method501((byte) -16));
									    break;
									}
									if (i_27_
									    == 3606) {
									    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									    Class96.method1505(-124, RSString.method501((byte) -16));
									    break;
									}
									if (i_27_
									    == 3607) {
									    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									    Class67_Sub8.method1109(RSString.method501((byte) -16), 0);
									    break;
									}
									if (i_27_
									    == 3608) {
									    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									    Class69.method1326(0, RSString.method501((byte) -16));
									    break;
									}
									if (i_27_
									    == 3609) {
									    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									    if (RSString.method540(Class105.aRSString_2048, arg1 ^ 0x571c) || RSString.method540(Class82.aRSString_1659, arg1 ^ 0x5722))
										RSString = RSString.method503((byte) 34, 7);
									    Class67_Sub27.anIntArray3305[i_24_++] = !Class103.method1552(true, RSString) ? 0 : 1;
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3611) {
									    int i_306_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if ((Class67_Sub5.anInt2862 ^ 0xffffffff) == -3 && Class67_Sub5_Sub17.anInt4795 > i_306_)
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class67_Sub1_Sub16_Sub1.aRSStringArray5092[i_306_];
									    else
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3612) {
									    if (Class67_Sub1_Sub3.aRSString_3844 == null)
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
									    else
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class67_Sub1_Sub3.aRSString_3844.method500(arg1 + 22368);
									    break;
									}
									if (i_27_
									    == 3612) {
									    if (Class67_Sub1_Sub3.aRSString_3844 == null)
										Class67_Sub27.anIntArray3305[i_24_++] = 0;
									    else
										Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub32.anInt4296;
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3614) {
									    int i_307_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if (Class67_Sub1_Sub3.aRSString_3844 != null && (Class67_Sub1_Sub32.anInt4296 ^ 0xffffffff) < (i_307_ ^ 0xffffffff))
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class69.aClass67_Sub25Array1380[i_307_].aRSString_3249.method500(0);
									    else
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3615) {
									    int i_308_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if (Class67_Sub1_Sub3.aRSString_3844 == null || (Class67_Sub1_Sub32.anInt4296 ^ 0xffffffff) >= (i_308_ ^ 0xffffffff))
										Class67_Sub27.anIntArray3305[i_24_++] = 0;
									    else
										Class67_Sub27.anIntArray3305[i_24_++] = Class69.aClass67_Sub25Array1380[i_308_].anInt3255;
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3616) {
									    int i_309_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if (Class67_Sub1_Sub3.aRSString_3844 != null && Class67_Sub1_Sub32.anInt4296 > i_309_)
										Class67_Sub27.anIntArray3305[i_24_++] = Class69.aClass67_Sub25Array1380[i_309_].aByte3247;
									    else
										Class67_Sub27.anIntArray3305[i_24_++] = 0;
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3617) {
									    Class67_Sub27.anIntArray3305[i_24_++] = Class88.aByte1821;
									    break;
									}
									if (i_27_
									    == 3617) {
									    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									    Class67_Sub5_Sub11.method932(119, RSString);
									    break;
									}
									if (i_27_
									    == 3618) {
									    Class67_Sub27.anIntArray3305[i_24_++] = Class136.aByte2497;
									    break;
									}
									if ((i_27_
									     ^ 0xffffffff)
									    == -3620) {
									    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									    Class81.method1431(RSString.method501((byte) -16), 117);
									    break;
									}
									if (i_27_
									    == 3620) {
									    Class92.method1481((byte) 104);
									    break;
									}
									if (i_27_
									    == 3621) {
									    if (Class67_Sub5.anInt2862 == 0)
										Class67_Sub27.anIntArray3305[i_24_++] = -1;
									    else
										Class67_Sub27.anIntArray3305[i_24_++] = Class90.anInt1847;
									    break;
									}
									if (i_27_
									    == 3622) {
									    int i_310_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if ((Class67_Sub5.anInt2862 ^ 0xffffffff) != -1 && (i_310_ ^ 0xffffffff) > (Class90.anInt1847 ^ 0xffffffff))
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class67_Sub17.method1250((byte) -72, Class103.aLongArray2025[i_310_]).method500(0);
									    else
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
									    break;
									}
									if (i_27_
									    == 3623) {
									    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									    if (RSString.method540(Class105.aRSString_2048, 113) || RSString.method540(Class82.aRSString_1659, arg1 + 22472))
										RSString = RSString.method503((byte) 34, 7);
									    Class67_Sub27.anIntArray3305[i_24_++] = !Class22.method207(0, RSString) ? 0 : 1;
									    break;
									}
									if (i_27_
									    == 3624) {
									    int i_311_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if (Class69.aClass67_Sub25Array1380 != null && (i_311_ ^ 0xffffffff) > (Class67_Sub1_Sub32.anInt4296 ^ 0xffffffff) && Class69.aClass67_Sub25Array1380[i_311_].aRSString_3249.method526(82, Class122.aClass131_Sub7_Sub2_2309.playerName))
										Class67_Sub27.anIntArray3305[i_24_++] = 1;
									    else
										Class67_Sub27.anIntArray3305[i_24_++] = 0;
									    break;
									}
									if (i_27_
									    == 3625) {
									    if (Class55.aRSString_1090 == null)
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
									    else
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class55.aRSString_1090.method500(0);
									    break;
									}
									if (i_27_
									    == 3626) {
									    int i_312_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if (Class67_Sub1_Sub3.aRSString_3844 == null || i_312_ >= Class67_Sub1_Sub32.anInt4296)
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class132.aRSString_2442;
									    else
										RuntimeException_Sub1.aRSStringArray2623[i_25_++] = Class69.aClass67_Sub25Array1380[i_312_].aRSString_3252;
									    break;
									}
									if (i_27_
									    == 3627) {
									    int i_313_ = Class67_Sub27.anIntArray3305[--i_24_];
									    if (Class67_Sub5.anInt2862 == 2 && i_313_ >= 0 && (Class67_Sub5_Sub17.anInt4795 ^ 0xffffffff) < (i_313_ ^ 0xffffffff))
										Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub5_Sub9.aBooleanArray4609[i_313_] ? 1 : 0;
									    else
										Class67_Sub27.anIntArray3305[i_24_++] = 0;
									    break;
									}
									if (i_27_
									    == 3628) {
									    RSString RSString = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									    if (RSString.method540(Class105.aRSString_2048, 42) || RSString.method540(Class82.aRSString_1659, 116))
										RSString = RSString.method503((byte) 34, 7);
									    Class67_Sub27.anIntArray3305[i_24_++] = Class67_Sub1_Sub2.method631(RSString, (byte) 109);
									    break;
									}
									if (i_27_
									    == 3629) {
									    Class67_Sub27.anIntArray3305[i_24_++] = Class24.anInt575;
									    break;
									}
								    }
								} else {
								    if ((i_27_
									 ^ 0xffffffff)
									== -3401) {
									i_24_ -= 2;
									int i_314_
									    = Class67_Sub27.anIntArray3305[i_24_];
									int i_315_
									    = Class67_Sub27.anIntArray3305[i_24_ - -1];
									Class67_Sub5_Sub8 class67_sub5_sub8
									    = Class126_Sub4.method1723(i_314_, (byte) -113);
									RuntimeException_Sub1
									    .aRSStringArray2623
									    [i_25_++]
									    = class67_sub5_sub8.method892(30, i_315_);
									break;
								    }
								    if ((i_27_
									 ^ 0xffffffff)
									== -3409) {
									i_24_ -= 4;
									int i_316_
									    = Class67_Sub27.anIntArray3305[i_24_];
									int i_317_
									    = Class67_Sub27.anIntArray3305[1 + i_24_];
									int i_318_
									    = Class67_Sub27.anIntArray3305[i_24_ - -2];
									int i_319_
									    = Class67_Sub27.anIntArray3305[3 + i_24_];
									Class67_Sub5_Sub8 class67_sub5_sub8
									    = Class126_Sub4.method1723(i_318_, (byte) -126);
									if ((class67_sub5_sub8.anInt4587
									     ^ 0xffffffff) != (i_316_ ^ 0xffffffff)
									    || class67_sub5_sub8.anInt4595 != i_317_)
									    throw new RuntimeException("C3408-1");
									if (i_317_
									    == 115)
									    RuntimeException_Sub1.aRSStringArray2623[i_25_++] = class67_sub5_sub8.method892(arg1 + 22420, i_319_);
									else
									    Class67_Sub27.anIntArray3305[i_24_++] = class67_sub5_sub8.method888(i_319_, 107);
									break;
								    }
								    if (i_27_
									== 3409) {
									i_24_ -= 3;
									int i_320_
									    = Class67_Sub27.anIntArray3305[1 + i_24_];
									int i_321_
									    = Class67_Sub27.anIntArray3305[i_24_];
									int i_322_
									    = Class67_Sub27.anIntArray3305[i_24_ + 2];
									if ((i_320_
									     ^ 0xffffffff)
									    == 0)
									    throw new RuntimeException("C3409-2");
									Class67_Sub5_Sub8 class67_sub5_sub8
									    = Class126_Sub4.method1723(i_320_, (byte) -119);
									if (i_321_
									    != class67_sub5_sub8.anInt4595)
									    throw new RuntimeException("C3409-1");
									Class67_Sub27
									    .anIntArray3305
									    [i_24_++]
									    = !class67_sub5_sub8.method895(arg1 + 22367, i_322_) ? 0 : 1;
									break;
								    }
								    if ((i_27_
									 ^ 0xffffffff)
									== -3411) {
									int i_323_
									    = Class67_Sub27.anIntArray3305[--i_24_];
									RSString RSString
									    = RuntimeException_Sub1.aRSStringArray2623[--i_25_];
									if (i_323_
									    == -1)
									    throw new RuntimeException("C3410-2");
									Class67_Sub5_Sub8 class67_sub5_sub8
									    = Class126_Sub4.method1723(i_323_, (byte) -125);
									if (class67_sub5_sub8.anInt4595
									    != 115)
									    throw new RuntimeException("C3410-1");
									Class67_Sub27
									    .anIntArray3305
									    [i_24_++]
									    = class67_sub5_sub8.method883(true, RSString) ? 1 : 0;
									break;
								    }
								    if ((i_27_
									 ^ 0xffffffff)
									== -3412) {
									int i_324_
									    = Class67_Sub27.anIntArray3305[--i_24_];
									Class67_Sub5_Sub8 class67_sub5_sub8
									    = Class126_Sub4.method1723(i_324_, (byte) -124);
									Class67_Sub27
									    .anIntArray3305
									    [i_24_++]
									    = class67_sub5_sub8.aClass92_4590.method1487((byte) -107);
									break;
								    }
								}
							    } else {
								if (i_27_
								    == 3300) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class67_Sub1_Sub9
									   .anInt3952);
								    break;
								}
								if (i_27_
								    == 3301) {
								    i_24_ -= 2;
								    int i_325_
									= (Class67_Sub27
									   .anIntArray3305
									   [i_24_]);
								    int i_326_
									= (Class67_Sub27
									   .anIntArray3305
									   [(i_24_
									     + 1)]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (RSString.method545
									   (i_325_,
									    -104,
									    i_326_));
								    break;
								}
								if (i_27_
								    == 3302) {
								    i_24_ -= 2;
								    int i_327_
									= (Class67_Sub27
									   .anIntArray3305
									   [i_24_]);
								    int i_328_
									= (Class67_Sub27
									   .anIntArray3305
									   [1 + i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class144.method1965
									   (i_327_,
									    i_328_,
									    (byte) -114));
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3304) {
								    i_24_ -= 2;
								    int i_329_
									= (Class67_Sub27
									   .anIntArray3305
									   [i_24_]);
								    int i_330_
									= (Class67_Sub27
									   .anIntArray3305
									   [1 + i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class67_Sub20.method1270
									   ((Class92.method1479
									     (arg1,
									      -22368)),
									    i_329_,
									    i_330_));
								    break;
								}
								if (i_27_
								    == 3304) {
								    int i_331_
									= (Class67_Sub27
									   .anIntArray3305
									   [--i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class85.method1454
									   ((byte) 69,
									    i_331_)
									   .anInt4738);
								    break;
								}
								if (i_27_
								    == 3305) {
								    int i_332_
									= (Class67_Sub27
									   .anIntArray3305
									   [--i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class30
									   .anIntArray700
									   [i_332_]);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3307) {
								    int i_333_
									= (Class67_Sub27
									   .anIntArray3305
									   [--i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class139
									   .anIntArray2538
									   [i_333_]);
								    break;
								}
								if (i_27_
								    == 3307) {
								    int i_334_
									= (Class67_Sub27
									   .anIntArray3305
									   [--i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class83
									   .anIntArray1682
									   [i_334_]);
								    break;
								}
								if (i_27_
								    == 3308) {
								    int i_335_
									= (Canvas_Sub1
									   .anInt59);
								    int i_336_
									= ((Class58
									    .baseX)
									   + (Class122.aClass131_Sub7_Sub2_2309.anInt3733
									      >> -1312037625));
								    int i_337_
									= ((Class137
									    .baseY)
									   + (Class122.aClass131_Sub7_Sub2_2309.anInt3726
									      >> -1422241785));
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (i_337_
									   + ((i_335_
									       << -652614660)
									      - -(i_336_ << -1917004498)));
								    break;
								}
								if (i_27_
								    == 3309) {
								    int i_338_
									= (Class67_Sub27
									   .anIntArray3305
									   [--i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= ((Class75.method1379
									    (i_338_,
									     268433487))
									   >> -1922630450);
								    break;
								}
								if (i_27_
								    == 3310) {
								    int i_339_
									= (Class67_Sub27
									   .anIntArray3305
									   [--i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (i_339_
									   >> 1280893084);
								    break;
								}
								if (i_27_
								    == 3311) {
								    int i_340_
									= (Class67_Sub27
									   .anIntArray3305
									   [--i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class75.method1379
									   (i_340_,
									    16383));
								    break;
								}
								if (i_27_
								    == 3312) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (!Class70.aBoolean1393
									   ? 0
									   : 1);
								    break;
								}
								if (i_27_
								    == 3313) {
								    i_24_ -= 2;
								    int i_341_
									= (32768
									   + Class67_Sub27.anIntArray3305[i_24_]);
								    int i_342_
									= (Class67_Sub27
									   .anIntArray3305
									   [(i_24_
									     + 1)]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (RSString.method545
									   (i_341_,
									    -94,
									    i_342_));
								    break;
								}
								if (i_27_
								    == 3314) {
								    i_24_ -= 2;
								    int i_343_
									= (32768
									   + Class67_Sub27.anIntArray3305[i_24_]);
								    int i_344_
									= (Class67_Sub27
									   .anIntArray3305
									   [1 + i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class144.method1965
									   (i_343_,
									    i_344_,
									    (byte) -89));
								    break;
								}
								if (i_27_
								    == 3315) {
								    i_24_ -= 2;
								    int i_345_
									= ((Class67_Sub27
									    .anIntArray3305
									    [i_24_])
									   - -32768);
								    int i_346_
									= (Class67_Sub27
									   .anIntArray3305
									   [(i_24_
									     + 1)]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class67_Sub20.method1270
									   ((Class92.method1479
									     (arg1,
									      -22368)),
									    i_345_,
									    i_346_));
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3317) {
								    if ((Class67_Sub17
									 .anInt3107)
									>= 2)
									Class67_Sub27
									    .anIntArray3305
									    [i_24_++]
									    = Class67_Sub17.anInt3107;
								    else
									Class67_Sub27
									    .anIntArray3305
									    [i_24_++]
									    = 0;
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3318) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class144
									   .anInt2596);
								    break;
								}
								if (i_27_
								    == 3318) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class67_Sub23
									   .anInt3202);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3322) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class67_Sub9
									   .anInt2969);
								    break;
								}
								if (i_27_
								    == 3322) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class132
									   .anInt2444);
								    break;
								}
								if (i_27_
								    == 3323) {
								    if (((Class67_Sub27
									  .anInt3295)
									 < 5)
									|| (Class67_Sub27.anInt3295
									    > 9))
									Class67_Sub27
									    .anIntArray3305
									    [i_24_++]
									    = 0;
								    else
									Class67_Sub27
									    .anIntArray3305
									    [i_24_++]
									    = 1;
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3325) {
								    if ((((Class67_Sub27
									   .anInt3295)
									  ^ 0xffffffff)
									 > -6)
									|| ((Class67_Sub27.anInt3295
									     ^ 0xffffffff)
									    < -10))
									Class67_Sub27
									    .anIntArray3305
									    [i_24_++]
									    = 0;
								    else
									Class67_Sub27
									    .anIntArray3305
									    [i_24_++]
									    = Class67_Sub27.anInt3295;
								    break;
								}
								if (i_27_
								    == 3325) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= ((Class24
									    .aBoolean574)
									   ? 1
									   : 0);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3327) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class122
									   .aClass131_Sub7_Sub2_2309
									   .combatLevel);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3328) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (!(Class122
									     .aClass131_Sub7_Sub2_2309
									     .aClass22_5065
									     .aBoolean538)
									   ? 0
									   : 1);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3329) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= ((Class78.aBoolean1602
									    && !Class23.aBoolean560)
									   ? 1
									   : 0);
								    break;
								}
								if (i_27_
								    == 3329) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (!Class67_Sub5_Sub16.aBoolean4783
									   ? 0
									   : 1);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3331) {
								    int i_347_
									= (Class67_Sub27
									   .anIntArray3305
									   [--i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class140.method1944
									   (i_347_,
									    -123));
								    break;
								}
								if (i_27_
								    == 3331) {
								    i_24_ -= 2;
								    int i_348_
									= (Class67_Sub27
									   .anIntArray3305
									   [i_24_]);
								    int i_349_
									= (Class67_Sub27
									   .anIntArray3305
									   [1 + i_24_]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class14.method160
									   (i_349_,
									    (byte) 11,
									    i_348_,
									    false));
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3333) {
								    i_24_ -= 2;
								    int i_350_
									= (Class67_Sub27
									   .anIntArray3305
									   [i_24_]);
								    int i_351_
									= (Class67_Sub27
									   .anIntArray3305
									   [(i_24_
									     - -1)]);
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class14.method160
									   (i_351_,
									    (byte) 11,
									    i_350_,
									    true));
								    break;
								}
								if (i_27_
								    == 3333) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class67_Sub1_Sub5
									   .anInt3880);
								    break;
								}
								if ((i_27_
								     ^ 0xffffffff)
								    == -3336) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class131_Sub3
									   .anInt3603);
								    break;
								}
								if (i_27_
								    == 3336) {
								    i_24_ -= 4;
								    int i_352_
									= (Class67_Sub27
									   .anIntArray3305
									   [(i_24_
									     + 1)]);
								    int i_353_
									= (Class67_Sub27
									   .anIntArray3305
									   [i_24_]);
								    i_353_
									+= (i_352_
									    << -1601224882);
								    int i_354_
									= (Class67_Sub27
									   .anIntArray3305
									   [2 + i_24_]);
								    i_353_
									+= (i_354_
									    << -1447722692);
								    int i_355_
									= (Class67_Sub27
									   .anIntArray3305
									   [(i_24_
									     - -3)]);
								    i_353_
									+= i_355_;
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= i_353_;
								    break;
								}
								if (i_27_
								    == 3337) {
								    Class67_Sub27
									.anIntArray3305
									[i_24_++]
									= (Class67_Sub5_Sub3
									   .anInt4489);
								    break;
								}
							    }
							} else {
							    Class7 class7
								= (Class3
								       .method69
								   ((byte) 110,
								    (Class67_Sub27
								     .anIntArray3305
								     [--i_24_])));
							    if ((i_27_
								 ^ 0xffffffff)
								== -2801) {
								Class67_Sub27
								    .anIntArray3305
								    [i_24_++]
								    = (client
									   .method31
									   (class7)
									   .method1225
								       (-1));
								break;
							    }
							    if ((i_27_
								 ^ 0xffffffff)
								== -2802) {
								int i_356_
								    = (Class67_Sub27
								       .anIntArray3305
								       [--i_24_]);
								i_356_--;
								if (((class7
								      .aRSStringArray315)
								     == null)
								    || (i_356_
									>= (class7
									    .aRSStringArray315).length)
								    || ((class7
									 .aRSStringArray315
									 [i_356_])
									== null))
								    RuntimeException_Sub1
									.aRSStringArray2623
									[i_25_++]
									= (Class132
									   .aRSString_2442);
								else
								    RuntimeException_Sub1
									.aRSStringArray2623
									[i_25_++]
									= (class7
									   .aRSStringArray315
									   [i_356_]);
								break;
							    }
							    if ((i_27_
								 ^ 0xffffffff)
								== -2803) {
								if ((class7
								     .aRSString_178)
								    != null)
								    RuntimeException_Sub1
									.aRSStringArray2623
									[i_25_++]
									= (class7
									   .aRSString_178);
								else
								    RuntimeException_Sub1
									.aRSStringArray2623
									[i_25_++]
									= (Class132
									   .aRSString_2442);
								break;
							    }
							}
						    } else {
							Class7 class7
							    = (Class3.method69
							       ((byte) 110,
								(Class67_Sub27
								 .anIntArray3305
								 [--i_24_])));
							if ((i_27_
							     ^ 0xffffffff)
							    == -2601) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt272);
							    break;
							}
							if (i_27_ == 2601) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt291);
							    break;
							}
							if (i_27_ == 2602) {
							    RuntimeException_Sub1
								.aRSStringArray2623
								[i_25_++]
								= (class7
								   .aRSString_219);
							    break;
							}
							if (i_27_ == 2603) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt328);
							    break;
							}
							if (i_27_ == 2604) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt222);
							    break;
							}
							if (i_27_ == 2605) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt338);
							    break;
							}
							if (i_27_ == 2606) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt330);
							    break;
							}
							if (i_27_ == 2607) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt325);
							    break;
							}
							if ((i_27_
							     ^ 0xffffffff)
							    == -2609) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt164);
							    break;
							}
							if ((i_27_
							     ^ 0xffffffff)
							    == -2610) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt205);
							    break;
							}
							if (i_27_ == 2610) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt216);
							    break;
							}
							if (i_27_ == 2611) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt220);
							    break;
							}
							if (i_27_ == 2612) {
							    Class67_Sub27
								.anIntArray3305
								[i_24_++]
								= (class7
								   .anInt225);
							    break;
							}
						    }
						} else {
						    Class7 class7
							= (!bool
							   ? Class9.aClass7_377
							   : (Class6
							      .aClass7_156));
						    if (i_27_ == 1600) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt272;
							break;
						    }
						    if (i_27_ == 1601) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt291;
							break;
						    }
						    if ((i_27_ ^ 0xffffffff)
							== -1603) {
							RuntimeException_Sub1
							    .aRSStringArray2623
							    [i_25_++]
							    = (class7
							       .aRSString_219);
							break;
						    }
						    if ((i_27_ ^ 0xffffffff)
							== -1604) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt328;
							break;
						    }
						    if (i_27_ == 1604) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt222;
							break;
						    }
						    if ((i_27_ ^ 0xffffffff)
							== -1606) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt338;
							break;
						    }
						    if (i_27_ == 1606) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt330;
							break;
						    }
						    if (i_27_ == 1607) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt325;
							break;
						    }
						    if (i_27_ == 1608) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt164;
							break;
						    }
						    if ((i_27_ ^ 0xffffffff)
							== -1610) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt205;
							break;
						    }
						    if (i_27_ == 1610) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt216;
							break;
						    }
						    if ((i_27_ ^ 0xffffffff)
							== -1612) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt220;
							break;
						    }
						    if ((i_27_ ^ 0xffffffff)
							== -1613) {
							Class67_Sub27
							    .anIntArray3305
							    [i_24_++]
							    = class7.anInt225;
							break;
						    }
						}
					    } else {
						Class7 class7
						    = (!bool
						       ? Class9.aClass7_377
						       : Class6.aClass7_156);
						if ((i_27_ ^ 0xffffffff)
						    == -1501) {
						    Class67_Sub27
							.anIntArray3305
							[i_24_++]
							= class7.anInt221;
						    break;
						}
						if (i_27_ == 1501) {
						    Class67_Sub27
							.anIntArray3305
							[i_24_++]
							= class7.anInt251;
						    break;
						}
						if ((i_27_ ^ 0xffffffff)
						    == -1503) {
						    Class67_Sub27
							.anIntArray3305
							[i_24_++]
							= class7.anInt189;
						    break;
						}
						if (i_27_ == 1503) {
						    Class67_Sub27
							.anIntArray3305
							[i_24_++]
							= class7.anInt194;
						    break;
						}
						if ((i_27_ ^ 0xffffffff)
						    == -1505) {
						    Class67_Sub27
							.anIntArray3305
							[i_24_++]
							= (class7.aBoolean313
							   ? 1 : 0);
						    break;
						}
						if (i_27_ == 1505) {
						    Class67_Sub27
							.anIntArray3305
							[i_24_++]
							= class7.anInt174;
						    break;
						}
					    }
					} else {
					    Class7 class7;
					    if (i_27_ >= 2000) {
						i_27_ -= 1000;
						class7 = (Class3.method69
							  ((byte) 110,
							   (Class67_Sub27
							    .anIntArray3305
							    [--i_24_])));
					    } else
						class7
						    = (bool
						       ? Class6.aClass7_156
						       : Class9.aClass7_377);
					    RSString RSString
						= (RuntimeException_Sub1
						   .aRSStringArray2623
						   [--i_25_]);
					    int[] is_357_ = null;
					    if ((RSString.method531((byte) 67)
						 > 0)
						&& ((RSString.method499
						     (-1 + (RSString.method531
							    ((byte) 27)),
						      -6))
						    ^ 0xffffffff) == -90) {
						int i_358_ = (Class67_Sub27
							      .anIntArray3305
							      [--i_24_]);
						if ((i_358_ ^ 0xffffffff)
						    < -1) {
						    is_357_ = new int[i_358_];
						    while (i_358_-- > 0)
							is_357_[i_358_]
							    = (Class67_Sub27
							       .anIntArray3305
							       [--i_24_]);
						}
						RSString
						    = (RSString.method502
						       (0, -5975,
							-1 + (RSString.method531
							      ((byte) -128))));
					    }
					    Object[] objects_359_
						= (new Object
						   [1 + (RSString.method531
							 ((byte) -112))]);
					    for (int i_360_
						     = objects_359_.length - 1;
						 i_360_ >= 1; i_360_--) {
						if ((RSString.method499
						     (i_360_ - 1,
						      arg1 ^ 0x5760))
						    == 115)
						    objects_359_[i_360_]
							= (RuntimeException_Sub1
							   .aRSStringArray2623
							   [--i_25_]);
						else
						    objects_359_[i_360_]
							= (new Integer
							   (Class67_Sub27
							    .anIntArray3305
							    [--i_24_]));
					    }
					    int i_361_
						= (Class67_Sub27.anIntArray3305
						   [--i_24_]);
					    if ((i_361_ ^ 0xffffffff) != 0)
						objects_359_[0]
						    = new Integer(i_361_);
					    else
						objects_359_ = null;
					    if ((i_27_ ^ 0xffffffff)
						!= -1401) {
						if (i_27_ == 1401)
						    class7.anObjectArray209
							= objects_359_;
						else if ((i_27_ ^ 0xffffffff)
							 != -1403) {
						    if (i_27_ == 1403)
							class7.anObjectArray310
							    = objects_359_;
						    else if ((i_27_
							      ^ 0xffffffff)
							     == -1405)
							class7.anObjectArray208
							    = objects_359_;
						    else if ((i_27_
							      ^ 0xffffffff)
							     == -1406)
							class7.anObjectArray317
							    = objects_359_;
						    else if ((i_27_
							      ^ 0xffffffff)
							     == -1407)
							class7.anObjectArray336
							    = objects_359_;
						    else if (i_27_ == 1407) {
							class7.anIntArray163
							    = is_357_;
							class7.anObjectArray302
							    = objects_359_;
						    } else if (i_27_ == 1408)
							class7.anObjectArray196
							    = objects_359_;
						    else if (i_27_ != 1409) {
							if (i_27_ == 1410)
							    class7
								.anObjectArray171
								= objects_359_;
							else if ((i_27_
								  ^ 0xffffffff)
								 == -1412)
							    class7
								.anObjectArray280
								= objects_359_;
							else if ((i_27_
								  ^ 0xffffffff)
								 != -1413) {
							    if ((i_27_
								 ^ 0xffffffff)
								!= -1415) {
								if (i_27_
								    == 1415) {
								    class7
									.anIntArray255
									= is_357_;
								    class7
									.anObjectArray212
									= objects_359_;
								} else if (i_27_
									   != 1416) {
								    if (i_27_
									== 1417)
									class7
									    .anObjectArray306
									    = objects_359_;
								    else if (i_27_
									     == 1418)
									class7
									    .anObjectArray176
									    = objects_359_;
								    else if (i_27_
									     != 1419) {
									if ((i_27_
									     ^ 0xffffffff)
									    != -1421) {
									    if (i_27_ == 1421)
										class7.anObjectArray331 = objects_359_;
									    else if (i_27_ == 1422)
										class7.anObjectArray323 = objects_359_;
									    else if ((i_27_ ^ 0xffffffff) == -1424)
										class7.anObjectArray308 = objects_359_;
									    else if ((i_27_ ^ 0xffffffff) != -1425) {
										if ((i_27_ ^ 0xffffffff) != -1426) {
										    if ((i_27_ ^ 0xffffffff) != -1427) {
											if ((i_27_ ^ 0xffffffff) != -1428) {
											    if (i_27_ == 1428) {
												class7.anObjectArray268 = objects_359_;
												class7.anIntArray207 = is_357_;
											    } else if (i_27_ == 1429) {
												class7.anObjectArray281 = objects_359_;
												class7.anIntArray283 = is_357_;
											    }
											} else
											    class7.anObjectArray273 = objects_359_;
										    } else
											class7.anObjectArray226 = objects_359_;
										} else
										    class7.anObjectArray197 = objects_359_;
									    } else
										class7.anObjectArray265 = objects_359_;
									} else
									    class7.anObjectArray181 = objects_359_;
								    } else
									class7
									    .anObjectArray184
									    = objects_359_;
								} else
								    class7
									.anObjectArray244
									= objects_359_;
							    } else {
								class7
								    .anObjectArray316
								    = objects_359_;
								class7
								    .anIntArray256
								    = is_357_;
							    }
							} else
							    class7
								.anObjectArray254
								= objects_359_;
						    } else
							class7.anObjectArray200
							    = objects_359_;
						} else
						    class7.anObjectArray167
							= objects_359_;
					    } else
						class7.anObjectArray297
						    = objects_359_;
					    class7.aBoolean169 = true;
					    break;
					}
				    } else {
					Class7 class7;
					if ((i_27_ ^ 0xffffffff) > -2001)
					    class7 = (bool ? Class6.aClass7_156
						      : Class9.aClass7_377);
					else {
					    i_27_ -= 1000;
					    class7 = (Class3.method69
						      ((byte) 110,
						       (Class67_Sub27
							.anIntArray3305
							[--i_24_])));
					}
					if ((i_27_ ^ 0xffffffff) == -1301) {
					    int i_362_
						= ((Class67_Sub27
						    .anIntArray3305[--i_24_])
						   + -1);
					    if (i_362_ < 0 || i_362_ > 9)
						i_25_--;
					    else
						class7.method84
						    ((RuntimeException_Sub1
						      .aRSStringArray2623
						      [--i_25_]),
						     i_362_, (byte) 121);
					    break;
					}
					if ((i_27_ ^ 0xffffffff) == -1302) {
					    i_24_ -= 2;
					    int i_363_
						= (Class67_Sub27.anIntArray3305
						   [i_24_ + 1]);
					    int i_364_
						= (Class67_Sub27.anIntArray3305
						   [i_24_]);
					    class7.aClass7_319
						= (Class67_Sub5_Sub14.method972
						   (i_363_, 18062, i_364_));
					    break;
					}
					if ((i_27_ ^ 0xffffffff) == -1303) {
					    class7.aBoolean290
						= ((Class67_Sub27
						    .anIntArray3305[--i_24_])
						   ^ 0xffffffff) == -2;
					    break;
					}
					if ((i_27_ ^ 0xffffffff) == -1304) {
					    class7.anInt267
						= (Class67_Sub27.anIntArray3305
						   [--i_24_]);
					    break;
					}
					if ((i_27_ ^ 0xffffffff) == -1305) {
					    class7.anInt263
						= (Class67_Sub27.anIntArray3305
						   [--i_24_]);
					    break;
					}
					if (i_27_ == 1305) {
					    class7.aRSString_178
						= (RuntimeException_Sub1
						   .aRSStringArray2623
						   [--i_25_]);
					    break;
					}
					if (i_27_ == 1306) {
					    class7.aRSString_191
						= (RuntimeException_Sub1
						   .aRSStringArray2623
						   [--i_25_]);
					    break;
					}
					if ((i_27_ ^ 0xffffffff) == -1308) {
					    class7.aRSStringArray315 = null;
					    break;
					}
					if (i_27_ == 1308) {
					    class7.anInt332
						= (Class67_Sub27.anIntArray3305
						   [--i_24_]);
					    class7.anInt235
						= (Class67_Sub27.anIntArray3305
						   [--i_24_]);
					    break;
					}
					if ((i_27_ ^ 0xffffffff) == -1310) {
					    int i_365_
						= (Class67_Sub27.anIntArray3305
						   [--i_24_]);
					    int i_366_
						= (Class67_Sub27.anIntArray3305
						   [--i_24_]);
					    if (i_366_ >= 1
						&& ((i_366_ ^ 0xffffffff)
						    >= -11))
						class7.method91(i_366_ - 1,
								121, i_365_);
					    break;
					}
				    }
				} else {
				    Class7 class7;
				    if ((i_27_ ^ 0xffffffff) <= -2001) {
					i_27_ -= 1000;
					class7
					    = Class3.method69((byte) 110,
							      (Class67_Sub27
							       .anIntArray3305
							       [--i_24_]));
				    } else
					class7 = (bool ? Class6.aClass7_156
						  : Class9.aClass7_377);
				    Class37.method326(class7, 77);
				    if ((i_27_ ^ 0xffffffff) == -1201
					|| (i_27_ ^ 0xffffffff) == -1206) {
					i_24_ -= 2;
					int i_367_ = (Class67_Sub27
						      .anIntArray3305[i_24_]);
					int i_368_
					    = (Class67_Sub27.anIntArray3305
					       [1 + i_24_]);
					if (class7.anInt266 == -1) {
					    Class67_Sub21.method1275
						(0, class7.anInt301);
					    Class49.method425(8,
							      class7.anInt301);
					    Class67_Sub1_Sub31.method766
						(2174, class7.anInt301);
					}
					if ((i_367_ ^ 0xffffffff) == 0) {
					    class7.anInt289 = -1;
					    class7.anInt183 = -1;
					    class7.anInt329 = 1;
					} else {
					    class7.anInt288 = i_368_;
					    class7.anInt289 = i_367_;
					    Class76 class76
						= PacketParser.method1596(i_367_,
								      -28322);
					    class7.anInt164
						= class76.anInt1541;
					    class7.anInt330
						= class76.anInt1545;
					    class7.anInt220
						= class76.anInt1516;
					    class7.anInt216
						= class76.anInt1520;
					    class7.anInt325
						= class76.anInt1512;
					    class7.anInt338
						= class76.anInt1557;
					    if (i_27_ == 1205)
						class7.aBoolean165 = false;
					    else
						class7.aBoolean165 = true;
					    if (class7.anInt240 > 0)
						class7.anInt338
						    = (32 * class7.anInt338
						       / class7.anInt240);
					    else if (class7.anInt193 > 0)
						class7.anInt338
						    = (class7.anInt338 * 32
						       / class7.anInt193);
					}
					break;
				    }
				    if (i_27_ == 1201) {
					class7.anInt329 = 2;
					class7.anInt183
					    = (Class67_Sub27.anIntArray3305
					       [--i_24_]);
					if ((class7.anInt266 ^ 0xffffffff)
					    == 0)
					    Class67_Sub25.method1292
						(class7.anInt301, true);
					break;
				    }
				    if ((i_27_ ^ 0xffffffff) == -1203) {
					class7.anInt329 = 3;
					class7.anInt183
					    = Class122
						  .aClass131_Sub7_Sub2_2309
						  .aClass22_5065
						  .method206(arg1 ^ ~0x38df);
					if ((class7.anInt266 ^ 0xffffffff)
					    == 0)
					    Class67_Sub25.method1292
						(class7.anInt301, true);
					break;
				    }
				    if ((i_27_ ^ 0xffffffff) == -1204) {
					class7.anInt329 = 6;
					class7.anInt183
					    = (Class67_Sub27.anIntArray3305
					       [--i_24_]);
					if ((class7.anInt266 ^ 0xffffffff)
					    == 0)
					    Class67_Sub25.method1292
						(class7.anInt301, true);
					break;
				    }
				    if (i_27_ == 1204) {
					class7.anInt329 = 5;
					class7.anInt183
					    = (Class67_Sub27.anIntArray3305
					       [--i_24_]);
					if ((class7.anInt266 ^ 0xffffffff)
					    == 0)
					    Class67_Sub25.method1292
						(class7.anInt301, true);
					break;
				    }
				}
			    } else {
				Class7 class7;
				if ((i_27_ ^ 0xffffffff) <= -2001) {
				    class7 = Class3.method69((byte) 110,
							     (Class67_Sub27
							      .anIntArray3305
							      [--i_24_]));
				    i_27_ -= 1000;
				} else
				    class7 = (!bool ? Class9.aClass7_377
					      : Class6.aClass7_156);
				if (i_27_ == 1100) {
				    i_24_ -= 2;
				    class7.anInt272
					= Class67_Sub27.anIntArray3305[i_24_];
				    if (class7.anInt328 + -class7.anInt189
					< class7.anInt272)
					class7.anInt272 = (class7.anInt328
							   - class7.anInt189);
				    if ((class7.anInt272 ^ 0xffffffff) > -1)
					class7.anInt272 = 0;
				    class7.anInt291
					= (Class67_Sub27.anIntArray3305
					   [i_24_ - -1]);
				    if ((class7.anInt291 ^ 0xffffffff)
					< (class7.anInt222 + -class7.anInt194
					   ^ 0xffffffff))
					class7.anInt291 = (class7.anInt222
							   - class7.anInt194);
				    if (class7.anInt291 < 0)
					class7.anInt291 = 0;
				    Class37.method326(class7, arg1 + 22490);
				    if (class7.anInt266 == -1)
					Class111.method1593(arg1 ^ ~0x5724,
							    class7.anInt301);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1102) {
				    class7.anInt279
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]);
				    Class37.method326(class7, 118);
				    if (class7.anInt266 == -1)
					Class52.method449((byte) -128,
							  class7.anInt301);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1103) {
				    class7.aBoolean300
					= ((Class67_Sub27.anIntArray3305
					    [--i_24_])
					   ^ 0xffffffff) == -2;
				    Class37.method326(class7, 94);
				    break;
				}
				if (i_27_ == 1103) {
				    class7.anInt205
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]);
				    Class37.method326(class7, 85);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1105) {
				    class7.anInt311
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]);
				    Class37.method326(class7, 97);
				    break;
				}
				if (i_27_ == 1105) {
				    class7.anInt225
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]);
				    Class37.method326(class7, arg1 ^ ~0x5707);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1107) {
				    class7.anInt187
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]);
				    Class37.method326(class7, 117);
				    break;
				}
				if (i_27_ == 1107) {
				    class7.aBoolean177
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]) == 1;
				    Class37.method326(class7, 126);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1109) {
				    class7.anInt329 = 1;
				    class7.anInt183
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]);
				    Class37.method326(class7, 115);
				    if ((class7.anInt266 ^ 0xffffffff) == 0)
					Class67_Sub25
					    .method1292(class7.anInt301, true);
				    break;
				}
				if (i_27_ == 1109) {
				    i_24_ -= 6;
				    class7.anInt216
					= Class67_Sub27.anIntArray3305[i_24_];
				    class7.anInt220
					= (Class67_Sub27.anIntArray3305
					   [i_24_ - -1]);
				    class7.anInt330
					= (Class67_Sub27.anIntArray3305
					   [i_24_ - -2]);
				    class7.anInt164
					= (Class67_Sub27.anIntArray3305
					   [3 + i_24_]);
				    class7.anInt325
					= (Class67_Sub27.anIntArray3305
					   [i_24_ + 4]);
				    class7.anInt338
					= (Class67_Sub27.anIntArray3305
					   [5 + i_24_]);
				    Class37.method326(class7, arg1 ^ ~0x572c);
				    if (class7.anInt266 == -1) {
					Class49.method425(8, class7.anInt301);
					Class67_Sub1_Sub31
					    .method766(2174, class7.anInt301);
				    }
				    break;
				}
				if (i_27_ == 1110) {
				    int i_369_ = (Class67_Sub27.anIntArray3305
						  [--i_24_]);
				    if ((class7.anInt274 ^ 0xffffffff)
					!= (i_369_ ^ 0xffffffff)) {
					class7.anInt274 = i_369_;
					class7.anInt257 = 0;
					class7.anInt298 = 0;
					class7.anInt203 = 1;
					Class37.method326(class7, 127);
				    }
				    if ((class7.anInt266 ^ 0xffffffff) == 0)
					Class90.method1473(class7.anInt301,
							   (byte) 114);
				    break;
				}
				if (i_27_ == 1111) {
				    class7.aBoolean299
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]) == 1;
				    Class37.method326(class7, arg1 ^ ~0x5726);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1113) {
				    RSString RSString
					= (RuntimeException_Sub1
					   .aRSStringArray2623[--i_25_]);
				    if (!RSString.method519((byte) -83,
							   (class7
							    .aRSString_219))) {
					class7.aRSString_219 = RSString;
					Class37.method326(class7, 119);
				    }
				    if ((class7.anInt266 ^ 0xffffffff) == 0)
					Class19.method189(class7.anInt301,
							  true);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1114) {
				    class7.anInt277
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]);
				    Class37.method326(class7, arg1 ^ ~0x5734);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1115) {
				    i_24_ -= 3;
				    class7.anInt214
					= Class67_Sub27.anIntArray3305[i_24_];
				    class7.anInt248
					= (Class67_Sub27.anIntArray3305
					   [i_24_ + 1]);
				    class7.anInt198
					= (Class67_Sub27.anIntArray3305
					   [2 + i_24_]);
				    Class37.method326(class7, 87);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1116) {
				    class7.aBoolean278
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]) == 1;
				    Class37.method326(class7, 84);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1117) {
				    class7.anInt284
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]);
				    Class37.method326(class7, 111);
				    break;
				}
				if (i_27_ == 1117) {
				    class7.anInt294
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]);
				    Class37.method326(class7, 88);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1119) {
				    class7.aBoolean249
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]) == 1;
				    Class37.method326(class7, 125);
				    break;
				}
				if ((i_27_ ^ 0xffffffff) == -1120) {
				    class7.aBoolean218
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]) == 1;
				    Class37.method326(class7, arg1 + 22463);
				    break;
				}
				if (i_27_ == 1120) {
				    i_24_ -= 2;
				    class7.anInt328
					= Class67_Sub27.anIntArray3305[i_24_];
				    class7.anInt222
					= (Class67_Sub27.anIntArray3305
					   [1 + i_24_]);
				    Class37.method326(class7, 95);
				    if (class7.anInt227 == 0)
					Class67_Sub17.method1247(false, class7,
								 120);
				    break;
				}
				if (i_27_ == 1121) {
				    Class37.method326(class7, arg1 + 22457);
				    i_24_ -= 2;
				    break;
				}
				if (i_27_ == 1122) {
				    class7.aBoolean262
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]) == 1;
				    Class37.method326(class7, 100);
				    break;
				}
				if (i_27_ == 1123) {
				    class7.anInt338
					= (Class67_Sub27.anIntArray3305
					   [--i_24_]);
				    Class37.method326(class7, 112);
				    if (class7.anInt266 == -1)
					Class49.method425(arg1 + 22376,
							  class7.anInt301);
				    break;
				}
			    }
			} else {
			    if ((i_27_ ^ 0xffffffff) == -404) {
				i_24_ -= 2;
				int i_370_
				    = Class67_Sub27.anIntArray3305[1 + i_24_];
				int i_371_
				    = Class67_Sub27.anIntArray3305[i_24_];
				for (int i_372_ = 0;
				     Class102.anIntArray2004.length > i_372_;
				     i_372_++) {
				    if ((i_371_ ^ 0xffffffff)
					== (Class102.anIntArray2004[i_372_]
					    ^ 0xffffffff)) {
					Class122.aClass131_Sub7_Sub2_2309
					    .aClass22_5065
					    .method202(8418, i_372_, i_370_);
					break while_44_;
				    }
				}
				for (int i_373_ = 0;
				     i_373_ < Class74.anIntArray1497.length;
				     i_373_++) {
				    if (Class74.anIntArray1497[i_373_]
					== i_371_) {
					Class122.aClass131_Sub7_Sub2_2309
					    .aClass22_5065.method202
					    (arg1 ^ ~0x77bd, i_373_, i_370_);
					break;
				    }
				}
				break;
			    }
			    if ((i_27_ ^ 0xffffffff) == -405) {
				i_24_ -= 2;
				int i_374_
				    = Class67_Sub27.anIntArray3305[i_24_ - -1];
				int i_375_
				    = Class67_Sub27.anIntArray3305[i_24_];
				Class122.aClass131_Sub7_Sub2_2309
				    .aClass22_5065
				    .method203(1, i_375_, i_374_);
				break;
			    }
			    if (i_27_ == 410) {
				boolean bool_376_
				    = ((Class67_Sub27.anIntArray3305[--i_24_]
					^ 0xffffffff)
				       != -1);
				Class122.aClass131_Sub7_Sub2_2309
				    .aClass22_5065
				    .method212(bool_376_, (byte) -10);
				break;
			    }
			}
			throw new IllegalStateException();
		    } while (false);
		}
	    } catch (Exception exception) {
		if (class67_sub5_sub9.aRSString_4607 != null) {
		    RSString RSString = Class10.method139((byte) -111, 30);
		    RSString.method544
			(-63, Class67_Sub5_Sub17.aRSString_4787)
			.method544(-63, class67_sub5_sub9.aRSString_4607);
		    for (int i_377_ = -1 + Class100.anInt1969;
			 (i_377_ ^ 0xffffffff) <= -1; i_377_--)
			RSString.method544
			    (arg1 + 22305, Class67_Sub1_Sub22.aRSString_4170)
			    .method544
			    (-63, (Class72.aClass106Array1447[i_377_]
				   .aClass67_Sub5_Sub9_2057.aRSString_4607));
		    if (i_27_ == 40) {
			int i_378_ = is_28_[i_26_];
			RSString.method544(-63, Class126_Sub3.aRSString_3444)
			    .method544
			    (-63, InputStream_Sub1.method47(i_378_, true));
		    }
		    if (Class23.anInt555 != 0)
			Class87.method1465(true,
					   (Class67_Sub1_Sub27.method744
					    ((new RSString[]
					      { (Class67_Sub1_Sub24
						 .aRSString_4209),
						(class67_sub5_sub9
						 .aRSString_4607) }),
					     arg1 + 22243)),
					   Class132.aRSString_2442, 0);
		    Class104.method1563(exception,
					("CS2 - scr:"
					 + class67_sub5_sub9.aLong1344 + " op:"
					 + i_27_
					 + new String(RSString
							  .method518(false))),
					arg1 + 22369);
		} else {
		    if ((Class23.anInt555 ^ 0xffffffff) != -1)
			Class87.method1465(true, Class13.aRSString_429,
					   Class132.aRSString_2442, 0);
		    Class104.method1563(exception,
					("CS2 - scr:"
					 + class67_sub5_sub9.aLong1344 + " op:"
					 + i_27_),
					1);
		}
	    }
	}
    }
    
    public static void method872(Class7 arg0, byte arg1, int arg2, int arg3) {
	if (arg1 >= -63)
	    anInt4534 = 52;
	if (arg0.aByte233 == 0)
	    arg0.anInt221 = arg0.anInt292;
	else if (arg0.aByte233 != 1) {
	    if (arg0.aByte233 == 2)
		arg0.anInt221 = arg2 - arg0.anInt189 - arg0.anInt292;
	    else if (arg0.aByte233 != 3) {
		if ((arg0.aByte233 ^ 0xffffffff) != -5)
		    arg0.anInt221 = (-(arg0.anInt292 * arg2 >> -199921906)
				     + arg2 - arg0.anInt189);
		else
		    arg0.anInt221
			= (-arg0.anInt189 + arg2) / 2 - -(arg0.anInt292 * arg2
							  >> -226289010);
	    } else
		arg0.anInt221 = arg2 * arg0.anInt292 >> 1671689710;
	} else
	    arg0.anInt221 = arg0.anInt292 + (arg2 + -arg0.anInt189) / 2;
	if ((arg0.aByte173 ^ 0xffffffff) != -1) {
	    if ((arg0.aByte173 ^ 0xffffffff) == -2)
		arg0.anInt251 = arg0.anInt295 + (-arg0.anInt194 + arg3) / 2;
	    else if ((arg0.aByte173 ^ 0xffffffff) != -3) {
		if (arg0.aByte173 != 3) {
		    if ((arg0.aByte173 ^ 0xffffffff) == -5)
			arg0.anInt251 = ((arg0.anInt295 * arg3 >> 2134930478)
					 + (-arg0.anInt194 + arg3) / 2);
		    else
			arg0.anInt251
			    = arg3 + (-arg0.anInt194
				      - (arg3 * arg0.anInt295 >> 1334034670));
		} else
		    arg0.anInt251 = arg3 * arg0.anInt295 >> -1071486674;
	    } else
		arg0.anInt251 = arg3 - (arg0.anInt194 - -arg0.anInt295);
	} else
	    arg0.anInt251 = arg0.anInt295;
	if (Class128.aBoolean2377
	    && (client.method31(arg0).anInt3060 != 0 || arg0.anInt227 == 0)) {
	    if ((arg0.anInt251 ^ 0xffffffff) <= -1) {
		if ((arg0.anInt251 + arg0.anInt194 ^ 0xffffffff)
		    < (arg3 ^ 0xffffffff))
		    arg0.anInt251 = arg3 - arg0.anInt194;
	    } else
		arg0.anInt251 = 0;
	    if (arg0.anInt221 >= 0) {
		if (arg0.anInt221 + arg0.anInt189 > arg2)
		    arg0.anInt221 = arg2 + -arg0.anInt189;
	    } else
		arg0.anInt221 = 0;
	}
	anInt4548++;
    }
    
    public Class67_Sub5_Sub6(RSString arg0, RSString arg1, int arg2, int arg3,
			     int arg4, boolean arg5, int arg6) {
	anInt4541 = -1;
	anInt4542 = 12800;
	anInt4556 = 12800;
	aBoolean4559 = true;
	anInt4560 = 0;
	try {
	    aBoolean4559 = arg5;
	    anInt4543 = arg4;
	    anInt4551 = arg3;
	    aRSString_4552 = arg1;
	    aRSString_4553 = arg0;
	    anInt4550 = arg2;
	    anInt4541 = arg6;
	    if (anInt4541 == 255)
		anInt4541 = 0;
	    aClass50_4554 = new Class50();
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("gh.<init>(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')'));
	}
    }
    
    static {
	anIntArray4535 = new int[] { 1, 2, 4, 8 };
	anInt4534 = 0;
	aRSString_4549 = Class134.method1914("blaugr-Un:", (byte) 13);
	aRSString_4540 = Class134.method1914("", (byte) 117);
	anInt4558 = -1;
    }
}
