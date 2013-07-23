/* Class67_Sub1_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub39 extends Class67_Sub1
{
    public int anInt4436;
    public static RSString aRSString_4437
	= Class134.method1914("Starte 3D)2Softwarebibliothek)3", (byte) 91);
    public static int anInt4438;
    public static int anInt4439;
    public static int anInt4440;
    public static Class50 aClass50_4441 = new Class50();
    public static int anInt4442;
    public static int anInt4443;
    public int anInt4444 = 1;
    public static int anInt4445;
    public static Class9 aClass9_4446;
    public static RSString aRSString_4447 = Class134.method1914(" ", (byte) 96);
    public static int anInt4448;
    
    public static void method808(int arg0) {
	aClass9_4446 = null;
	aRSString_4437 = null;
	aClass50_4441 = null;
	if (arg0 == 0)
	    aRSString_4447 = null;
    }
    
    public static int method809(RSString arg0, byte arg1) {
	anInt4439++;
	if (Class68.aClass72_1369 == null || arg0.method531((byte) -105) == 0)
	    return -1;
	if (arg1 < 85)
	    return -22;
	for (int i = 0;
	     (i ^ 0xffffffff) > (Class68.aClass72_1369.anInt1439 ^ 0xffffffff);
	     i++) {
	    if (Class68.aClass72_1369.aRSStringArray1441[i].method508
		    (Class20.aRSString_511, true, Class6.aRSString_150)
		    .method519((byte) -109, arg0))
		return i;
	}
	return -1;
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	int[][] is = aClass103_2830.method1551(arg1, 82);
	if (arg0 != true)
	    anInt4436 = 21;
	anInt4442++;
	if (aClass103_2830.aBoolean2030) {
	    int i = 1 + (anInt4436 - -anInt4436);
	    int i_0_ = 65536 / i;
	    int i_1_ = anInt4444 + (anInt4444 - -1);
	    int i_2_ = 65536 / i_1_;
	    int[][][] is_3_ = new int[i][][];
	    for (int i_4_ = arg1 - anInt4436; i_4_ <= anInt4436 + arg1;
		 i_4_++) {
		int[][] is_5_
		    = this.method609(i_4_ & Class67_Sub1_Sub36.anInt4381,
				     false, 0);
		int[][] is_6_ = new int[3][Class67_Sub5_Sub7.anInt4569];
		int i_7_ = 0;
		int i_8_ = 0;
		int i_9_ = 0;
		int[] is_10_ = is_5_[1];
		int[] is_11_ = is_5_[0];
		int[] is_12_ = is_5_[2];
		for (int i_13_ = -anInt4444;
		     (i_13_ ^ 0xffffffff) >= (anInt4444 ^ 0xffffffff);
		     i_13_++) {
		    int i_14_ = Class76.anInt1581 & i_13_;
		    i_8_ += is_11_[i_14_];
		    i_7_ += is_10_[i_14_];
		    i_9_ += is_12_[i_14_];
		}
		int[] is_15_ = is_6_[0];
		int[] is_16_ = is_6_[2];
		int[] is_17_ = is_6_[1];
		int i_18_ = 0;
		while ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
		       < (i_18_ ^ 0xffffffff)) {
		    is_15_[i_18_] = i_8_ * i_2_ >> -1591764240;
		    is_17_[i_18_] = i_7_ * i_2_ >> -645914576;
		    is_16_[i_18_] = i_2_ * i_9_ >> -1999715984;
		    int i_19_ = -anInt4444 + i_18_ & Class76.anInt1581;
		    i_7_ -= is_10_[i_19_];
		    i_8_ -= is_11_[i_19_];
		    i_18_++;
		    i_9_ -= is_12_[i_19_];
		    i_19_ = i_18_ - -anInt4444 & Class76.anInt1581;
		    i_9_ += is_12_[i_19_];
		    i_7_ += is_10_[i_19_];
		    i_8_ += is_11_[i_19_];
		}
		is_3_[-arg1 + (i_4_ + anInt4436)] = is_6_;
	    }
	    int[] is_20_ = is[0];
	    int[] is_21_ = is[1];
	    int[] is_22_ = is[2];
	    for (int i_23_ = 0; ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
				 < (i_23_ ^ 0xffffffff)); i_23_++) {
		int i_24_ = 0;
		int i_25_ = 0;
		int i_26_ = 0;
		for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_27_++) {
		    int[][] is_28_ = is_3_[i_27_];
		    i_26_ += is_28_[2][i_23_];
		    i_24_ += is_28_[0][i_23_];
		    i_25_ += is_28_[1][i_23_];
		}
		is_20_[i_23_] = i_0_ * i_24_ >> 1827792016;
		is_21_[i_23_] = i_25_ * i_0_ >> 1699375472;
		is_22_[i_23_] = i_0_ * i_26_ >> 998066992;
	    }
	}
	return is;
    }
    
    public static int method810(boolean arg0) {
	if (arg0 != true)
	    method809(null, (byte) -115);
	anInt4448++;
	return 15;
    }
    
    public static void method811(int arg0) {
	if (arg0 != 17819)
	    method811(2);
	for (Class67_Sub10 class67_sub10
		 = (Class67_Sub10) Class92.aClass50_1868.method445(0);
	     class67_sub10 != null;
	     class67_sub10
		 = (Class67_Sub10) Class92.aClass50_1868.method432(0)) {
	    if (class67_sub10.aBoolean2993)
		class67_sub10.method1117(arg0 ^ ~0x45e8);
	}
	anInt4445++;
	for (Class67_Sub10 class67_sub10
		 = (Class67_Sub10) Class67_Sub10.aClass50_2987.method445(0);
	     class67_sub10 != null;
	     class67_sub10
		 = (Class67_Sub10) Class67_Sub10.aClass50_2987.method432(0)) {
	    if (class67_sub10.aBoolean2993)
		class67_sub10.method1117(93);
	}
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4443++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int i = anInt4436 + anInt4436 + 1;
	    int i_29_ = 65536 / i;
	    int i_30_ = anInt4444 - -anInt4444 - -1;
	    int i_31_ = 65536 / i_30_;
	    int[][] is_32_ = new int[i][];
	    for (int i_33_ = arg0 - anInt4436; i_33_ <= arg0 + anInt4436;
		 i_33_++) {
		int i_34_ = 0;
		int[] is_35_
		    = this.method613(0, Class67_Sub1_Sub36.anInt4381 & i_33_,
				     false);
		for (int i_36_ = -anInt4444;
		     (i_36_ ^ 0xffffffff) >= (anInt4444 ^ 0xffffffff); i_36_++)
		    i_34_ += is_35_[Class76.anInt1581 & i_36_];
		int[] is_37_ = new int[Class67_Sub5_Sub7.anInt4569];
		int i_38_ = 0;
		while (i_38_ < Class67_Sub5_Sub7.anInt4569) {
		    is_37_[i_38_] = i_34_ * i_31_ >> -1029628208;
		    i_34_ -= is_35_[Class76.anInt1581 & i_38_ - anInt4444];
		    i_38_++;
		    i_34_ += is_35_[anInt4444 + i_38_ & Class76.anInt1581];
		}
		is_32_[i_33_ - (-anInt4436 - -arg0)] = is_37_;
	    }
	    for (int i_39_ = 0; Class67_Sub5_Sub7.anInt4569 > i_39_; i_39_++) {
		int i_40_ = 0;
		for (int i_41_ = 0; i > i_41_; i_41_++)
		    i_40_ += is_32_[i_41_][i_39_];
		is[i_39_] = i_40_ * i_29_ >> -571914736;
	    }
	}
	if (arg1 != 55)
	    aRSString_4447 = null;
	return is;
    }
    
    public static void method812(byte arg0) {
	int i = Class49.anInt1007;
	int i_42_ = Class53.anInt1066;
	anInt4440++;
	int i_43_ = Class67_Sub16.anInt3084;
	int i_44_ = client.anInt2733;
	if (Class67_Sub1_Sub20.aClass67_Sub5_Sub19_4147 == null
	    || Class67_Sub3.aClass67_Sub5_Sub19_2855 == null) {
	    if (Class51.aClass9_1044.method132(Class14.anInt448, true)
		&& Class51.aClass9_1044.method132(Canvas_Sub1.anInt58, true)) {
		Class67_Sub1_Sub20.aClass67_Sub5_Sub19_4147
		    = Class55_Sub1.method468(0, Class51.aClass9_1044, false,
					     Class14.anInt448);
		Class67_Sub3.aClass67_Sub5_Sub19_2855
		    = Class55_Sub1.method468(0, Class51.aClass9_1044, false,
					     Canvas_Sub1.anInt58);
	    } else
		Class121.method1686(i, i_42_, i_43_, 20, Class82.anInt1668,
				    256 - Class23.anInt568);
	}
	if (arg0 != -18)
	    aClass50_4441 = null;
	if (Class67_Sub1_Sub20.aClass67_Sub5_Sub19_4147 != null
	    && Class67_Sub3.aClass67_Sub5_Sub19_2855 != null) {
	    int i_45_
		= (i_43_
		   / Class67_Sub1_Sub20.aClass67_Sub5_Sub19_4147.anInt4813);
	    for (int i_46_ = 0; (i_45_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff);
		 i_46_++)
		Class67_Sub1_Sub20.aClass67_Sub5_Sub19_4147.method1006
		    (i + i_46_ * (Class67_Sub1_Sub20.aClass67_Sub5_Sub19_4147
				  .anInt4813),
		     i_42_);
	    Class67_Sub3.aClass67_Sub5_Sub19_2855.method1006(i, i_42_);
	    Class67_Sub3.aClass67_Sub5_Sub19_2855.method1005
		(i + i_43_ + -Class67_Sub3.aClass67_Sub5_Sub19_2855.anInt4813,
		 i_42_);
	}
	Class130.aClass67_Sub5_Sub10_2404.method920(Class119.aRSString_2257,
						    i + 3, 14 + i_42_,
						    (Class67_Sub5_Sub16
						     .anInt4778),
						    -1);
	Class121.method1686(i, 20 + i_42_, i_43_, i_44_ - 20,
			    Class82.anInt1668, -Class23.anInt568 + 256);
	int i_47_ = Class67_Sub5_Sub17.anInt4786;
	int i_48_ = Class67_Sub1_Sub22.anInt4172;
	for (int i_49_ = 0; i_49_ < Class134.anInt2476; i_49_++) {
	    int i_50_
		= i_42_ - (-35 - 15 * (Class134.anInt2476 + -1 + -i_49_));
	    if (i < i_47_ && (i_47_ ^ 0xffffffff) > (i_43_ + i ^ 0xffffffff)
		&& -13 + i_50_ < i_48_ && 3 + i_50_ > i_48_)
		Class121.method1686(i, -13 + i_50_, i_43_, 16,
				    Class55_Sub3.anInt2811,
				    -Class12.anInt424 + 256);
	}
	if ((Class67_Sub1_Sub28.aClass67_Sub5_Sub19_4249 == null
	     || Class67_Sub24.aClass67_Sub5_Sub19_3237 == null
	     || Class27.aClass67_Sub5_Sub19_632 == null)
	    && Class51.aClass9_1044.method132(Class67_Sub5_Sub4_Sub1.anInt5117,
					      true)
	    && Class51.aClass9_1044.method132(Class67_Sub1_Sub17.anInt4092,
					      true)
	    && Class51.aClass9_1044.method132(Class67_Sub1_Sub2.anInt3838,
					      true)) {
	    Class67_Sub1_Sub28.aClass67_Sub5_Sub19_4249
		= Class55_Sub1.method468(0, Class51.aClass9_1044, false,
					 Class67_Sub5_Sub4_Sub1.anInt5117);
	    Class67_Sub24.aClass67_Sub5_Sub19_3237
		= Class55_Sub1.method468(0, Class51.aClass9_1044, false,
					 Class67_Sub1_Sub17.anInt4092);
	    Class27.aClass67_Sub5_Sub19_632
		= Class55_Sub1.method468(0, Class51.aClass9_1044, false,
					 Class67_Sub1_Sub2.anInt3838);
	}
	if (Class67_Sub1_Sub28.aClass67_Sub5_Sub19_4249 != null
	    && Class67_Sub24.aClass67_Sub5_Sub19_3237 != null
	    && Class27.aClass67_Sub5_Sub19_632 != null) {
	    int i_51_
		= (i_43_
		   / Class67_Sub1_Sub28.aClass67_Sub5_Sub19_4249.anInt4813);
	    for (int i_52_ = 0; i_51_ > i_52_; i_52_++)
		Class67_Sub1_Sub28.aClass67_Sub5_Sub19_4249.method1006
		    ((Class67_Sub1_Sub28.aClass67_Sub5_Sub19_4249.anInt4813
		      * i_52_) + i,
		     (-Class67_Sub1_Sub28.aClass67_Sub5_Sub19_4249.anInt4812
		      + (i_42_ - -i_44_)));
	    int i_53_ = ((-20 + i_44_)
			 / Class67_Sub24.aClass67_Sub5_Sub19_3237.anInt4812);
	    for (int i_54_ = 0; i_53_ > i_54_; i_54_++) {
		Class67_Sub24.aClass67_Sub5_Sub19_3237.method1006
		    (i, 20 + (i_42_ + (Class67_Sub24.aClass67_Sub5_Sub19_3237
				       .anInt4812) * i_54_));
		Class67_Sub24.aClass67_Sub5_Sub19_3237.method1005
		    ((i_43_ + i
		      + -Class67_Sub24.aClass67_Sub5_Sub19_3237.anInt4813),
		     20 + i_42_ + i_54_ * (Class67_Sub24
					   .aClass67_Sub5_Sub19_3237
					   .anInt4812));
	    }
	    Class27.aClass67_Sub5_Sub19_632.method1006
		(i,
		 i_42_ - -i_44_ + -Class27.aClass67_Sub5_Sub19_632.anInt4812);
	    Class27.aClass67_Sub5_Sub19_632.method1005
		(-Class27.aClass67_Sub5_Sub19_632.anInt4813 + (i_43_ + i),
		 -Class27.aClass67_Sub5_Sub19_632.anInt4812 + i_44_ + i_42_);
	}
	for (int i_55_ = 0;
	     (Class134.anInt2476 ^ 0xffffffff) < (i_55_ ^ 0xffffffff);
	     i_55_++) {
	    int i_56_ = (-i_55_ + Class134.anInt2476 - 1) * 15 + i_42_ + 35;
	    int i_57_ = Class67_Sub5_Sub16.anInt4778;
	    if (i_47_ > i && (i_43_ + i ^ 0xffffffff) < (i_47_ ^ 0xffffffff)
		&& i_48_ > -13 + i_56_ && 3 + i_56_ > i_48_)
		i_57_ = Class15.anInt457;
	    Class130.aClass67_Sub5_Sub10_2404.method920
		(Class64.method569(i_55_, (byte) 112), 3 + i, i_56_, i_57_, 0);
	}
	Class67_Sub1_Sub29.method754(Class53.anInt1066, client.anInt2733,
				     Class67_Sub16.anInt3084, arg0 + -338,
				     Class49.anInt1007);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt4438++;
	int i = arg2;
    while_138_:
	do {
	    do {
		if ((i ^ 0xffffffff) != -1) {
		    if (i != 1) {
			if ((i ^ 0xffffffff) == -3)
			    break;
			break while_138_;
		    }
		} else {
		    anInt4444 = arg0.readByte((byte) 121);
		    break while_138_;
		}
		anInt4436 = arg0.readByte((byte) -48);
		break while_138_;
	    } while (false);
	    aBoolean2839 = (arg0.readByte((byte) -118) ^ 0xffffffff) == -2;
	} while (false);
	if (arg1 != true)
	    method611(-64, (byte) -34);
    }
    
    public Class67_Sub1_Sub39() {
	super(1, false);
	anInt4436 = 1;
    }
}
