/* Class67_Sub1_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub19 extends Class67_Sub1
{
    public static int anInt4126;
    public static int anInt4127;
    public static Class50 aClass50_4128 = new Class50();
    public int anInt4129;
    public static int anInt4130;
    public static int anInt4131;
    public static int anInt4132;
    public int anInt4133 = 4096;
    public static int anInt4134;
    public static RSString aRSString_4135
	= Class134.method1914("Null", (byte) 55);
    public static Class9 aClass9_4136;
    public static RSString aRSString_4137;
    public static int anInt4138;
    public static int anInt4139 = -1;
    public static int anInt4140;
    public static int anInt4141;
    public static int anInt4142;
    
    public static RSString method706(int arg0, byte arg1) {
	anInt4130++;
	if ((arg0 ^ 0xffffffff) >= -1 || (arg0 ^ 0xffffffff) < -256)
	    throw new IllegalArgumentException();
	int i = -110 / ((-29 - arg1) / 61);
	RSString RSString = new RSString();
	RSString.anInt2629 = 1;
	RSString.aByteArray2653 = new byte[1];
	RSString.aByteArray2653[0] = (byte) arg0;
	return RSString;
    }
    
    public static void method707(boolean arg0, byte arg1, RSString arg2) {
	if (arg0) {
	    try {
		Class68.anApplet_Sub1_1360.getAppletContext().showDocument
		    (arg2.method512(Class68.anApplet_Sub1_1360.getCodeBase(),
				    (byte) 117),
		     "_blank");
	    } catch (Exception exception) {
		/* empty */
	    }
	} else {
	    try {
		Class68.anApplet_Sub1_1360.getAppletContext().showDocument
		    (arg2.method512(Class68.anApplet_Sub1_1360.getCodeBase(),
				    (byte) 117),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	anInt4140++;
	if (arg1 < 72)
	    method706(67, (byte) -128);
    }
    
    public static void method708(int arg0, int arg1) {
	anInt4142++;
	int i = 256;
	if (i < arg0)
	    arg0 = i;
	if ((arg0 ^ 0xffffffff) < -11)
	    arg0 = 10;
	Class67_Sub5_Sub9.anInt4610 += 128 * arg0;
	if (Class109.anIntArray2090.length < Class67_Sub5_Sub9.anInt4610) {
	    int i_0_ = (int) (12.0 * Math.random());
	    Class67_Sub5_Sub9.anInt4610 -= Class109.anIntArray2090.length;
	    Class16.method172(-69, Class62.aClass119_Sub1Array1148[i_0_]);
	}
	int i_1_ = arg0 * 128;
	int i_2_ = 0;
	int i_3_ = (-arg0 + i) * 128;
	for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
	    int i_5_
		= (Class34.anIntArray746[i_1_ + i_2_]
		   + -(arg0 * (Class109.anIntArray2090
			       [(-1 + Class109.anIntArray2090.length
				 & Class67_Sub5_Sub9.anInt4610 + i_2_)]) / 6));
	    if (i_5_ < 0)
		i_5_ = 0;
	    Class34.anIntArray746[i_2_++] = i_5_;
	}
	for (int i_6_ = -arg0 + i; (i_6_ ^ 0xffffffff) > (i ^ 0xffffffff);
	     i_6_++) {
	    int i_7_ = i_6_ * 128;
	    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -129; i_8_++) {
		int i_9_ = (int) (100.0 * Math.random());
		if ((i_9_ ^ 0xffffffff) > -51 && (i_8_ ^ 0xffffffff) < -11
		    && i_8_ < 118)
		    Class34.anIntArray746[i_7_ + i_8_] = 255;
		else
		    Class34.anIntArray746[i_7_ + i_8_] = 0;
	    }
	}
	if (arg1 != 12)
	    method707(true, (byte) -21, null);
	for (int i_10_ = 0; i + -arg0 > i_10_; i_10_++)
	    Class37.anIntArray803[i_10_] = Class37.anIntArray803[i_10_ + arg0];
	for (int i_11_ = i - arg0; (i_11_ ^ 0xffffffff) > (i ^ 0xffffffff);
	     i_11_++) {
	    Class37.anIntArray803[i_11_]
		= (int) (Math.sin((double) Class70.anInt1398 / 14.0) * 16.0
			 + Math.sin((double) Class70.anInt1398 / 15.0) * 14.0
			 + Math.sin((double) Class70.anInt1398 / 16.0) * 12.0);
	    Class70.anInt1398++;
	}
	int i_12_ = ((Class67_Sub1_Sub9.anInt3952 & 0x1) + arg0) / 2;
	Class68.anInt1371 += arg0;
	if (i_12_ > 0) {
	    for (int i_13_ = 0;
		 (i_13_ ^ 0xffffffff) > (Class68.anInt1371 ^ 0xffffffff);
		 i_13_++) {
		int i_14_ = 2 + (int) (Math.random() * 124.0);
		int i_15_ = 128 + (int) (Math.random() * 128.0);
		Class34.anIntArray746[i_14_ - -(i_15_ << 1538006919)] = 192;
	    }
	    Class68.anInt1371 = 0;
	    for (int i_16_ = 0; i_16_ < i; i_16_++) {
		int i_17_ = 0;
		int i_18_ = i_16_ * 128;
		for (int i_19_ = -i_12_; i_19_ < 128; i_19_++) {
		    if ((i_19_ + i_12_ ^ 0xffffffff) > -129)
			i_17_ += Class34.anIntArray746[i_12_ + i_18_ + i_19_];
		    if (-i_12_ - (1 - i_19_) >= 0)
			i_17_ -= Class34.anIntArray746[i_19_ + i_18_ + (-i_12_
									- 1)];
		    if ((i_19_ ^ 0xffffffff) <= -1)
			Class67_Sub23.anIntArray3210[i_19_ + i_18_]
			    = i_17_ / (1 + 2 * i_12_);
		}
	    }
	    for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -129; i_20_++) {
		int i_21_ = 0;
		for (int i_22_ = -i_12_;
		     (i_22_ ^ 0xffffffff) > (i ^ 0xffffffff); i_22_++) {
		    int i_23_ = 128 * i_22_;
		    if ((i_12_ + i_22_ ^ 0xffffffff) > (i ^ 0xffffffff))
			i_21_ += (Class67_Sub23.anIntArray3210
				  [i_23_ + i_20_ - -(128 * i_12_)]);
		    if (-i_12_ + (-1 + i_22_) >= 0)
			i_21_ -= (Class67_Sub23.anIntArray3210
				  [-128 + -(i_12_ * 128) + (i_23_ + i_20_)]);
		    if ((i_22_ ^ 0xffffffff) <= -1)
			Class34.anIntArray746[i_20_ - -i_23_]
			    = i_21_ / (1 + 2 * i_12_);
		}
	    }
	}
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	if (arg0 != true)
	    method709(77);
	anInt4127++;
	int[][] is = aClass103_2830.method1551(arg1, 127);
	if (aClass103_2830.aBoolean2030) {
	    int[][] is_24_ = this.method609(arg1, false, 0);
	    int[] is_25_ = is_24_[0];
	    int[] is_26_ = is_24_[1];
	    int[] is_27_ = is_24_[2];
	    int[] is_28_ = is[0];
	    int[] is_29_ = is[1];
	    int[] is_30_ = is[2];
	    for (int i = 0; i < Class67_Sub5_Sub7.anInt4569; i++) {
		int i_31_ = is_25_[i];
		int i_32_ = is_26_[i];
		int i_33_ = is_27_[i];
		if (anInt4129 <= i_31_) {
		    if ((anInt4133 ^ 0xffffffff) > (i_31_ ^ 0xffffffff))
			is_28_[i] = anInt4133;
		    else
			is_28_[i] = i_31_;
		} else
		    is_28_[i] = anInt4129;
		if ((i_32_ ^ 0xffffffff) <= (anInt4129 ^ 0xffffffff)) {
		    if ((anInt4133 ^ 0xffffffff) <= (i_32_ ^ 0xffffffff))
			is_29_[i] = i_32_;
		    else
			is_29_[i] = anInt4133;
		} else
		    is_29_[i] = anInt4129;
		if (i_33_ < anInt4129)
		    is_30_[i] = anInt4129;
		else if (i_33_ <= anInt4133)
		    is_30_[i] = i_33_;
		else
		    is_30_[i] = anInt4133;
	    }
	}
	return is;
    }
    
    public static int method709(int arg0) {
	anInt4131++;
	Login.anInt1621 = 0;
	if (arg0 < 70)
	    return 47;
	return Class27.method254(90);
    }
    
    public Class67_Sub1_Sub19() {
	super(1, false);
	anInt4129 = 0;
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4132++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int[] is_34_ = this.method613(0, arg0, false);
	    for (int i = 0; Class67_Sub5_Sub7.anInt4569 > i; i++) {
		int i_35_ = is_34_[i];
		if ((anInt4129 ^ 0xffffffff) < (i_35_ ^ 0xffffffff))
		    is[i] = anInt4129;
		else if (i_35_ > anInt4133)
		    is[i] = anInt4133;
		else
		    is[i] = i_35_;
	    }
	}
	if (arg1 != 55)
	    anInt4129 = 51;
	return is;
    }
    
    public static void method710(int arg0, int arg1, byte arg2) {
	anInt4134++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg1, false, 1);
	int i = -73 % ((arg2 - -43) / 54);
	class67_sub5_sub3.method846(true);
	class67_sub5_sub3.anInt4491 = arg0;
    }
    
    public static void method711(int arg0) {
	aRSString_4137 = null;
	aRSString_4135 = null;
	aClass50_4128 = null;
	if (arg0 != 0)
	    anInt4141 = -116;
	aClass9_4136 = null;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	int i = arg2;
    while_171_:
	do {
	    do {
		if ((i ^ 0xffffffff) != -1) {
		    if ((i ^ 0xffffffff) != -2) {
			if (i == 2)
			    break;
			break while_171_;
		    }
		} else {
		    anInt4129 = arg0.readUShort(-2386);
		    break while_171_;
		}
		anInt4133 = arg0.readUShort(-2386);
		break while_171_;
	    } while (false);
	    aBoolean2839 = arg0.readByte((byte) 92) == 1;
	} while (false);
	if (arg1 != true)
	    aClass9_4136 = null;
	anInt4126++;
    }
    
    static {
	aRSString_4137 = Class134.method1914("Lade Sprites )2 ", (byte) 37);
    }
}
