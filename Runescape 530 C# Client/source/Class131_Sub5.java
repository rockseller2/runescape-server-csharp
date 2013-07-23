public class Class131_Sub5 extends Class131
{
    public int anInt3653;
    public static RSString aRSString_3654;
    public static int anInt3655;
    public static int anInt3656;
    public static RSString aRSString_3657;
    public int anInt3658;
    public static int anInt3659;
    public int anInt3660;
    public static int anInt3661;
    public int anInt3662;
    public static Class9 aClass9_3663;
    public static int anInt3664;
    public static RSString aRSString_3665;
    public static Class136 aClass136_3666;
    public static int[] anIntArray3667;
    public int anInt3668;
    public static int anInt3669;
    public int anInt3670;
    public int anInt3671;
    public static RSString aRSString_3672
	= Class134.method1914("Starting 3d Library", (byte) 93);
    public int anInt3673 = -32768;
    public static int anInt3674;
    public Class41 aClass41_3675;
    public int anInt3676;
    public static int anInt3677;
    public int anInt3678;
    public static int anInt3679;
    public Class61_Sub1 aClass61_Sub1_3680;
    public int anInt3681;
    public Class119_Sub1 aClass119_Sub1_3682;
    public static int anInt3683;
    public int anInt3684 = -1;
    public boolean aBoolean3685 = false;
    public static Sprites aSprite_3686;
    public int anInt3687;
    public static int anInt3688;
    public static int anInt3689;
    
    public void method1822(byte arg0, int arg1, int arg2) {
	if (aClass41_3675 != null) {
	    int i = -anInt3676 + Class67_Sub1_Sub9.anInt3952;
	    if ((i ^ 0xffffffff) < -101
		&& (aClass41_3675.anInt881 ^ 0xffffffff) < -1) {
		int i_0_;
		for (i_0_ = (aClass41_3675.anIntArray855.length
			     + -aClass41_3675.anInt881);
		     (anInt3678 < i_0_
		      && i > aClass41_3675.anIntArray880[anInt3678]);
		     anInt3678++)
		    i -= aClass41_3675.anIntArray880[anInt3678];
		if (anInt3678 >= i_0_) {
		    int i_1_ = 0;
		    for (int i_2_ = i_0_;
			 ((aClass41_3675.anIntArray855.length ^ 0xffffffff)
			  < (i_2_ ^ 0xffffffff));
			 i_2_++)
			i_1_ += aClass41_3675.anIntArray880[i_2_];
		    i %= i_1_;
		}
		anInt3671 = 1 + anInt3678;
		if ((anInt3671 ^ 0xffffffff)
		    <= (aClass41_3675.anIntArray855.length ^ 0xffffffff)) {
		    anInt3671 -= aClass41_3675.anInt881;
		    if ((anInt3671 ^ 0xffffffff) > -1
			|| anInt3671 >= aClass41_3675.anIntArray855.length)
			anInt3671 = -1;
		}
	    }
	    while ((i ^ 0xffffffff)
		   < (aClass41_3675.anIntArray880[anInt3678] ^ 0xffffffff)) {
		OutputStream_Sub1.method58(aClass41_3675, arg2, -107, arg1,
					   false, anInt3678);
		i -= aClass41_3675.anIntArray880[anInt3678];
		anInt3678++;
		if (aClass41_3675.anIntArray855.length <= anInt3678) {
		    anInt3678 -= aClass41_3675.anInt881;
		    if ((anInt3678 ^ 0xffffffff) > -1
			|| ((aClass41_3675.anIntArray855.length ^ 0xffffffff)
			    >= (anInt3678 ^ 0xffffffff))) {
			aClass41_3675 = null;
			break;
		    }
		}
		anInt3671 = 1 + anInt3678;
		if (aClass41_3675.anIntArray855.length <= anInt3671) {
		    anInt3671 -= aClass41_3675.anInt881;
		    if (anInt3671 < 0
			|| ((aClass41_3675.anIntArray855.length ^ 0xffffffff)
			    >= (anInt3671 ^ 0xffffffff)))
			anInt3671 = -1;
		}
	    }
	    anInt3687 = i;
	    anInt3676 = -i + Class67_Sub1_Sub9.anInt3952;
	}
	if (arg0 < 124)
	    anIntArray3667 = null;
	anInt3674++;
    }
    
    public static Class67_Sub5_Sub19 method1823(Class9 arg0, int arg1,
						int arg2, int arg3) {
	anInt3669++;
	if (!Class64.method575((byte) -86, arg3, arg2, arg0))
	    return null;
	if (arg1 != -13886)
	    aRSString_3672 = null;
	return Class129.method1742((byte) 57);
    }
    
    public Class131 method1824(byte arg0) {
	if (arg0 != 35)
	    method1822((byte) 9, -40, -1);
	anInt3655++;
	return method1827(false, 0);
    }
    
    public int method1769() {
	anInt3659++;
	return anInt3673;
    }
    
    public static void method1825(int arg0) {
	aRSString_3672 = null;
	aRSString_3657 = null;
	anIntArray3667 = null;
	aRSString_3665 = null;
	aClass9_3663 = null;
	aClass136_3666 = null;
	if (arg0 <= 48)
	    method1826(-38, 126, 105, (byte) 89);
	aRSString_3654 = null;
	aSprite_3686 = null;
    }
    
    public void finalize() {
	anInt3677++;
    }
    
    public static int method1826(int arg0, int arg1, int arg2, byte arg3) {
	anInt3661++;
	if (Class136.anIntArrayArrayArray2496 == null)
	    return 0;
	int i = arg1 >> 441124455;
	int i_3_ = arg2 >> -1145267353;
	if ((i ^ 0xffffffff) > -1 || (i_3_ ^ 0xffffffff) > -1 || i > 103
	    || (i_3_ ^ 0xffffffff) < -104)
	    return 0;
	int i_4_ = arg0;
	if (i_4_ < 3
	    && (Class120.aByteArrayArrayArray2284[1][i][i_3_] & 0x2) == 2)
	    i_4_++;
	int i_5_ = -3 / ((49 - arg3) / 38);
	int i_6_ = 0x7f & arg1;
	int i_7_ = 0x7f & arg2;
	int i_8_
	    = ((Class136.anIntArrayArrayArray2496[i_4_][i][i_3_] * (128 - i_6_)
		+ Class136.anIntArrayArrayArray2496[i_4_][i + 1][i_3_] * i_6_)
	       >> 783310951);
	int i_9_
	    = (i_6_ * Class136.anIntArrayArrayArray2496[i_4_][1 + i][i_3_ - -1]
	       + (-i_6_ + 128) * (Class136.anIntArrayArrayArray2496[i_4_][i]
				  [1 + i_3_])) >> 1423501607;
	return i_8_ * (-i_7_ + 128) - -(i_7_ * i_9_) >> -1995541529;
    }
    
    public void method1764(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8, int arg9,
			   Class61_Sub1 arg10) {
	anInt3679++;
	Class131 class131 = method1824((byte) 35);
	if (class131 != null)
	    class131.method1764(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
				arg8, arg9, aClass61_Sub1_3680);
    }
    
    public Class131 method1827(boolean arg0, int arg1) {
	anInt3683++;
	boolean bool = (InputStream_Sub1.anIntArrayArrayArray75
			!= Class136.anIntArrayArrayArray2496);
	Class65 class65 = Class73.method1359(11525, anInt3681);
	int i = class65.anInt1273;
	if (class65.anIntArray1244 != null)
	    class65 = class65.method590((byte) -84);
	if (class65 != null) {
	    if (Class69.anInt1381 != 0 && aBoolean3685
		&& (aClass41_3675 == null
		    || (aClass41_3675 != null
			&& ((class65.anInt1273 ^ 0xffffffff)
			    != (aClass41_3675.anInt854 ^ 0xffffffff))))) {
		int i_10_ = class65.anInt1273;
		if ((class65.anInt1273 ^ 0xffffffff) == 0)
		    i_10_ = i;
		if ((i_10_ ^ 0xffffffff) != 0)
		    aClass41_3675 = Class120.method1666(i_10_, -32);
		else
		    aClass41_3675 = null;
		if (aClass41_3675 != null) {
		    if (class65.aBoolean1276
			&& (aClass41_3675.anInt881 ^ 0xffffffff) != 0) {
			anInt3678 = (int) (Math.random()
					   * (double) (aClass41_3675
						       .anIntArray855).length);
			anInt3676
			    -= (int) (Math.random()
				      * (double) (aClass41_3675.anIntArray880
						  [anInt3678]));
		    } else {
			anInt3678 = 0;
			anInt3676 = -1 + Class67_Sub1_Sub9.anInt3952;
		    }
		}
	    }
	} else
	    return null;
	int i_11_ = 0x3 & anInt3662;
	int i_12_;
	int i_13_;
	if (i_11_ == 1 || (i_11_ ^ 0xffffffff) == -4) {
	    i_12_ = class65.anInt1297;
	    i_13_ = class65.anInt1264;
	} else {
	    i_12_ = class65.anInt1264;
	    i_13_ = class65.anInt1297;
	}
	int i_14_ = anInt3670 - -(i_13_ >> -2028419231);
	int i_15_ = (1 + i_13_ >> -990410175) + anInt3670;
	int i_16_ = anInt3668 - -(i_12_ >> 1973404033);
	if (arg1 != 0)
	    anInt3684 = 120;
	int i_17_ = anInt3668 - -(i_12_ - -1 >> 929673249);
	method1822((byte) 125, 128 * i_14_, i_16_ * 128);
	boolean bool_18_
	    = (!bool && class65.aBoolean1299
	       && ((anInt3660 ^ 0xffffffff) != (class65.lastLoadedObjectId ^ 0xffffffff)
		   || ((anInt3678 != anInt3684
			|| (aClass41_3675 != null
			    && (aClass41_3675.aBoolean858
				|| Class106.aBoolean2055)
			    && (anInt3678 ^ 0xffffffff) != (anInt3671
							    ^ 0xffffffff)))
		       && (Class67_Sub25.anInt3253 ^ 0xffffffff) <= -3)));
	if (arg0 && !bool_18_)
	    return null;
	int[][] is = Class136.anIntArrayArrayArray2496[anInt3653];
	int i_19_ = ((is[i_14_][i_16_] + is[i_15_][i_16_] - -is[i_14_][i_17_]
		      - -is[i_15_][i_17_])
		     >> -1723018430);
	int i_20_ = (anInt3670 << 954589063) - -(i_13_ << -1628780218);
	int i_21_ = (anInt3668 << -224504345) - -(i_12_ << -1528929818);
	int[][] is_22_ = null;
	boolean bool_23_ = aClass119_Sub1_3682 == null;
	if (bool)
	    is_22_ = InputStream_Sub1.anIntArrayArrayArray75[0];
	else if ((anInt3653 ^ 0xffffffff) > -4)
	    is_22_ = Class136.anIntArrayArrayArray2496[anInt3653 + 1];
	Class143 class143;
	if (aClass41_3675 != null)
	    class143
		= class65.method591(i_19_, anInt3658, anInt3671, anInt3687,
				    i_21_, i_20_, is, anInt3662, bool_18_,
				    anInt3678, (byte) 9,
				    (bool_23_ ? Class9.aClass119_Sub1_393
				     : aClass119_Sub1_3682),
				    is_22_, aClass41_3675);
	else
	    class143 = class65.method584(is_22_, anInt3658, anInt3662, i_19_,
					 false, (byte) -73, is,
					 (!bool_23_ ? aClass119_Sub1_3682
					  : Class9.aClass119_Sub1_393),
					 i_21_, i_20_, bool_18_);
	if (class143 == null)
	    return null;
	return class143.aClass131_2581;
    }
    
    public void method1771(int arg0, int arg1, int arg2, int arg3, int arg4) {
	anInt3688++;
	method1822((byte) 127, arg3, arg4);
    }
    
    public Class131_Sub5(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, boolean arg7, Class131 arg8) {
	anInt3660 = -1;
	aClass119_Sub1_3682 = null;
	anInt3662 = arg2;
	anInt3653 = arg3;
	anInt3670 = arg4;
	anInt3668 = arg5;
	anInt3658 = arg1;
	anInt3681 = arg0;
	if (arg6 != -1) {
	    aClass41_3675 = Class120.method1666(arg6, -32);
	    anInt3678 = 0;
	    if (aClass41_3675.anIntArray855.length <= 1)
		anInt3671 = 0;
	    else
		anInt3671 = 1;
	    anInt3687 = 1;
	    anInt3676 = -1 + Class67_Sub1_Sub9.anInt3952;
	    if (aClass41_3675.anInt850 == 0 && arg8 != null
		&& arg8 instanceof Class131_Sub5) {
		Class131_Sub5 class131_sub5 = (Class131_Sub5) arg8;
		if (aClass41_3675 == class131_sub5.aClass41_3675) {
		    anInt3671 = class131_sub5.anInt3671;
		    anInt3676 = class131_sub5.anInt3676;
		    anInt3678 = class131_sub5.anInt3678;
		    anInt3687 = class131_sub5.anInt3687;
		    return;
		}
	    }
	    if (arg7 && (aClass41_3675.anInt881 ^ 0xffffffff) != 0) {
		anInt3678
		    = (int) (Math.random()
			     * (double) aClass41_3675.anIntArray855.length);
		anInt3671 = 1 + anInt3678;
		if (anInt3671 >= aClass41_3675.anIntArray855.length) {
		    anInt3671 -= aClass41_3675.anInt881;
		    if ((anInt3671 ^ 0xffffffff) > -1
			|| ((anInt3671 ^ 0xffffffff)
			    <= (aClass41_3675.anIntArray855.length
				^ 0xffffffff)))
			anInt3671 = -1;
		}
		anInt3687 = (int) (Math.random()
				   * (double) (aClass41_3675.anIntArray880
					       [anInt3678])) + 1;
		anInt3676 = Class67_Sub1_Sub9.anInt3952 - anInt3687;
	    }
	}
	if (arg8 == null) {
	    Class65 class65 = Class73.method1359(11525, anInt3681);
	    if (class65.anIntArray1244 != null)
		aBoolean3685 = true;
	}
    }
    
    static {
	aRSString_3657 = aRSString_3672;
	aRSString_3665
	    = Class134.method1914("Loading interfaces )2 ", (byte) 52);
	anIntArray3667 = new int[500];
	anInt3689 = 0;
	aRSString_3654 = aRSString_3665;
	aClass136_3666 = new Class136(32);
    }
}
