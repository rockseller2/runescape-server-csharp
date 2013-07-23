public class Class131_Sub2 extends Class131
{
    public short[] aShortArray3539;
    public short aShort3540;
    public int[] anIntArray3541;
    public int[] anIntArray3542;
    public byte[] aByteArray3543;
    public int[] anIntArray3544;
    public short[] aShortArray3545;
    public short aShort3546;
    public short[] aShortArray3547;
    public int anInt3548;
    public short aShort3549;
    public Class52[] aClass52Array3550;
    public byte[] aByteArray3551;
    public short aShort3552;
    public short[] aShortArray3553;
    public int anInt3554 = 0;
    public short aShort3555;
    public short[] aShortArray3556;
    public short[] aShortArray3557;
    public int[] anIntArray3558;
    public static int[] anIntArray3559;
    public byte[] aByteArray3560;
    public short[] aShortArray3561;
    public static int[] anIntArray3562 = new int[10000];
    public short[] aShortArray3563;
    public int[] anIntArray3564;
    public Class44[] aClass44Array3565;
    public int[] anIntArray3566;
    public byte[] aByteArray3567;
    public int[][] anIntArrayArray3568;
    public int[] anIntArray3569;
    public short aShort3570;
    public byte[] aByteArray3571;
    public boolean aBoolean3572;
    public int anInt3573;
    public short[] aShortArray3574;
    public int[] anIntArray3575;
    public byte[] aByteArray3576;
    public static int anInt3577 = 0;
    public short aShort3578;
    public short aShort3579;
    public static int[] anIntArray3580 = new int[10000];
    public byte[] aByteArray3581;
    public byte[] aByteArray3582;
    public byte[] aByteArray3583;
    public static int[] anIntArray3584;
    public byte[] aByteArray3585;
    public short[] aShortArray3586;
    public byte aByte3587;
    public int[][] anIntArrayArray3588;
    public Class44[] aClass44Array3589;
    
    public void method1776(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt3548; i++) {
	    anIntArray3542[i] = anIntArray3542[i] * arg0 / 128;
	    anIntArray3541[i] = anIntArray3541[i] * arg1 / 128;
	    anIntArray3575[i] = anIntArray3575[i] * arg2 / 128;
	}
	method1790();
    }
    
    public int method1777(int arg0, int arg1, int arg2, byte arg3, short arg4,
			  byte arg5) {
	anIntArray3558[anInt3554] = arg0;
	anIntArray3569[anInt3554] = arg1;
	anIntArray3564[anInt3554] = arg2;
	aByteArray3576[anInt3554] = arg3;
	aByteArray3567[anInt3554] = (byte) -1;
	aShortArray3545[anInt3554] = arg4;
	aShortArray3563[anInt3554] = (short) -1;
	aByteArray3551[anInt3554] = arg5;
	return anInt3554++;
    }
    
    public void method1778() {
	for (int i = 0; i < anInt3548; i++) {
	    int i_0_ = anIntArray3542[i];
	    anIntArray3542[i] = anIntArray3575[i];
	    anIntArray3575[i] = -i_0_;
	}
	method1790();
    }
    
    public Class131_Sub2 method1779(int arg0, int arg1, int[][] arg2,
				    int[][] arg3, int arg4, int arg5, int arg6,
				    boolean arg7, boolean arg8) {
	method1794();
	int i = arg4 + aShort3570;
	int i_1_ = arg4 + aShort3540;
	int i_2_ = arg6 + aShort3555;
	int i_3_ = arg6 + aShort3552;
	if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5)
	    && (i < 0 || i_1_ + 128 >> 7 >= arg2.length || i_2_ < 0
		|| i_3_ + 128 >> 7 >= arg2[0].length))
	    return this;
	if (arg0 == 4 || arg0 == 5) {
	    if (arg3 == null)
		return this;
	    if (i < 0 || i_1_ + 128 >> 7 >= arg3.length || i_2_ < 0
		|| i_3_ + 128 >> 7 >= arg3[0].length)
		return this;
	} else {
	    i >>= 7;
	    i_1_ = i_1_ + 127 >> 7;
	    i_2_ >>= 7;
	    i_3_ = i_3_ + 127 >> 7;
	    if (arg2[i][i_2_] == arg5 && arg2[i_1_][i_2_] == arg5
		&& arg2[i][i_3_] == arg5 && arg2[i_1_][i_3_] == arg5)
		return this;
	}
	Class131_Sub2 class131_sub2;
	if (arg7) {
	    class131_sub2 = new Class131_Sub2();
	    class131_sub2.anInt3548 = anInt3548;
	    class131_sub2.anInt3554 = anInt3554;
	    class131_sub2.anInt3573 = anInt3573;
	    class131_sub2.anIntArray3558 = anIntArray3558;
	    class131_sub2.anIntArray3569 = anIntArray3569;
	    class131_sub2.anIntArray3564 = anIntArray3564;
	    class131_sub2.aByteArray3576 = aByteArray3576;
	    class131_sub2.aByteArray3585 = aByteArray3585;
	    class131_sub2.aByteArray3551 = aByteArray3551;
	    class131_sub2.aByteArray3567 = aByteArray3567;
	    class131_sub2.aShortArray3545 = aShortArray3545;
	    class131_sub2.aShortArray3563 = aShortArray3563;
	    class131_sub2.aByte3587 = aByte3587;
	    class131_sub2.aByteArray3560 = aByteArray3560;
	    class131_sub2.aShortArray3547 = aShortArray3547;
	    class131_sub2.aShortArray3561 = aShortArray3561;
	    class131_sub2.aShortArray3557 = aShortArray3557;
	    class131_sub2.aShortArray3586 = aShortArray3586;
	    class131_sub2.aShortArray3574 = aShortArray3574;
	    class131_sub2.aShortArray3556 = aShortArray3556;
	    class131_sub2.aByteArray3543 = aByteArray3543;
	    class131_sub2.aByteArray3583 = aByteArray3583;
	    class131_sub2.aByteArray3582 = aByteArray3582;
	    class131_sub2.aByteArray3581 = aByteArray3581;
	    class131_sub2.aByteArray3571 = aByteArray3571;
	    class131_sub2.anIntArray3544 = anIntArray3544;
	    class131_sub2.anIntArray3566 = anIntArray3566;
	    class131_sub2.anIntArrayArray3568 = anIntArrayArray3568;
	    class131_sub2.anIntArrayArray3588 = anIntArrayArray3588;
	    class131_sub2.aShort3549 = aShort3549;
	    class131_sub2.aShort3546 = aShort3546;
	    class131_sub2.aClass44Array3565 = aClass44Array3565;
	    class131_sub2.aClass52Array3550 = aClass52Array3550;
	    class131_sub2.aClass44Array3589 = aClass44Array3589;
	    if (arg0 == 3) {
		class131_sub2.anIntArray3542
		    = Class67_Sub20.method1272(anIntArray3542, false);
		class131_sub2.anIntArray3541
		    = Class67_Sub20.method1272(anIntArray3541, false);
		class131_sub2.anIntArray3575
		    = Class67_Sub20.method1272(anIntArray3575, false);
	    } else {
		class131_sub2.anIntArray3542 = anIntArray3542;
		class131_sub2.anIntArray3541
		    = new int[class131_sub2.anInt3548];
		class131_sub2.anIntArray3575 = anIntArray3575;
	    }
	} else
	    class131_sub2 = this;
	if (arg0 == 1) {
	    for (int i_4_ = 0; i_4_ < class131_sub2.anInt3548; i_4_++) {
		int i_5_ = anIntArray3542[i_4_] + arg4;
		int i_6_ = anIntArray3575[i_4_] + arg6;
		int i_7_ = i_5_ & 0x7f;
		int i_8_ = i_6_ & 0x7f;
		int i_9_ = i_5_ >> 7;
		int i_10_ = i_6_ >> 7;
		int i_11_ = ((arg2[i_9_][i_10_] * (128 - i_7_)
			      + arg2[i_9_ + 1][i_10_] * i_7_)
			     >> 7);
		int i_12_ = ((arg2[i_9_][i_10_ + 1] * (128 - i_7_)
			      + arg2[i_9_ + 1][i_10_ + 1] * i_7_)
			     >> 7);
		int i_13_ = i_11_ * (128 - i_8_) + i_12_ * i_8_ >> 7;
		class131_sub2.anIntArray3541[i_4_]
		    = anIntArray3541[i_4_] + i_13_ - arg5;
	    }
	} else if (arg0 == 2) {
	    for (int i_14_ = 0; i_14_ < class131_sub2.anInt3548; i_14_++) {
		int i_15_ = (anIntArray3541[i_14_] << 16) / aShort3579;
		if (i_15_ < arg1) {
		    int i_16_ = anIntArray3542[i_14_] + arg4;
		    int i_17_ = anIntArray3575[i_14_] + arg6;
		    int i_18_ = i_16_ & 0x7f;
		    int i_19_ = i_17_ & 0x7f;
		    int i_20_ = i_16_ >> 7;
		    int i_21_ = i_17_ >> 7;
		    int i_22_ = ((arg2[i_20_][i_21_] * (128 - i_18_)
				  + arg2[i_20_ + 1][i_21_] * i_18_)
				 >> 7);
		    int i_23_ = ((arg2[i_20_][i_21_ + 1] * (128 - i_18_)
				  + arg2[i_20_ + 1][i_21_ + 1] * i_18_)
				 >> 7);
		    int i_24_ = i_22_ * (128 - i_19_) + i_23_ * i_19_ >> 7;
		    class131_sub2.anIntArray3541[i_14_]
			= (anIntArray3541[i_14_]
			   + (i_24_ - arg5) * (arg1 - i_15_) / arg1);
		} else
		    class131_sub2.anIntArray3541[i_14_]
			= anIntArray3541[i_14_];
	    }
	} else if (arg0 == 3) {
	    int i_25_ = (arg1 & 0xff) * 4;
	    int i_26_ = (arg1 >> 8 & 0xff) * 4;
	    method1784(arg2, arg4, arg5, arg6, i_25_, i_26_);
	} else if (arg0 == 4) {
	    int i_27_ = aShort3578 - aShort3579;
	    for (int i_28_ = 0; i_28_ < anInt3548; i_28_++) {
		int i_29_ = anIntArray3542[i_28_] + arg4;
		int i_30_ = anIntArray3575[i_28_] + arg6;
		int i_31_ = i_29_ & 0x7f;
		int i_32_ = i_30_ & 0x7f;
		int i_33_ = i_29_ >> 7;
		int i_34_ = i_30_ >> 7;
		int i_35_ = ((arg3[i_33_][i_34_] * (128 - i_31_)
			      + arg3[i_33_ + 1][i_34_] * i_31_)
			     >> 7);
		int i_36_ = ((arg3[i_33_][i_34_ + 1] * (128 - i_31_)
			      + arg3[i_33_ + 1][i_34_ + 1] * i_31_)
			     >> 7);
		int i_37_ = i_35_ * (128 - i_32_) + i_36_ * i_32_ >> 7;
		class131_sub2.anIntArray3541[i_28_]
		    = anIntArray3541[i_28_] + (i_37_ - arg5) + i_27_;
	    }
	} else if (arg0 == 5) {
	    int i_38_ = aShort3578 - aShort3579;
	    for (int i_39_ = 0; i_39_ < anInt3548; i_39_++) {
		int i_40_ = anIntArray3542[i_39_] + arg4;
		int i_41_ = anIntArray3575[i_39_] + arg6;
		int i_42_ = i_40_ & 0x7f;
		int i_43_ = i_41_ & 0x7f;
		int i_44_ = i_40_ >> 7;
		int i_45_ = i_41_ >> 7;
		int i_46_ = ((arg2[i_44_][i_45_] * (128 - i_42_)
			      + arg2[i_44_ + 1][i_45_] * i_42_)
			     >> 7);
		int i_47_ = ((arg2[i_44_][i_45_ + 1] * (128 - i_42_)
			      + arg2[i_44_ + 1][i_45_ + 1] * i_42_)
			     >> 7);
		int i_48_ = i_46_ * (128 - i_43_) + i_47_ * i_43_ >> 7;
		i_46_ = (arg3[i_44_][i_45_] * (128 - i_42_)
			 + arg3[i_44_ + 1][i_45_] * i_42_) >> 7;
		i_47_ = (arg3[i_44_][i_45_ + 1] * (128 - i_42_)
			 + arg3[i_44_ + 1][i_45_ + 1] * i_42_) >> 7;
		int i_49_ = i_46_ * (128 - i_43_) + i_47_ * i_43_ >> 7;
		int i_50_ = i_48_ - i_49_;
		class131_sub2.anIntArray3541[i_39_]
		    = (((anIntArray3541[i_39_] << 8) / i_38_ * i_50_ >> 8)
		       - (arg5 - i_48_));
	    }
	}
	if (arg8)
	    class131_sub2.method1790();
	else
	    aBoolean3572 = false;
	return class131_sub2;
    }
    
    public void method1771(int i, int i_51_, int i_52_, int i_53_, int i_54_) {
	/* empty */
    }
    
    public Class131 method1765(int arg0, int arg1, int arg2) {
	return method1787(aShort3549, aShort3546, arg0, arg1, arg2);
    }
    
    public static Class131_Sub2 method1780(Class9 arg0, int arg1, int arg2) {
	byte[] is = arg0.method138(-809612665, arg2, arg1);
	if (is == null)
	    return null;
	return new Class131_Sub2(is);
    }
    
    public int method1769() {
	if (!aBoolean3572)
	    method1794();
	return aShort3579;
    }
    
    public void method1781() {
	for (int i = 0; i < anInt3548; i++)
	    anIntArray3575[i] = -anIntArray3575[i];
	for (int i = 0; i < anInt3554; i++) {
	    int i_55_ = anIntArray3558[i];
	    anIntArray3558[i] = anIntArray3564[i];
	    anIntArray3564[i] = i_55_;
	}
	method1790();
    }
    
    public void method1782() {
	if (aClass44Array3565 == null) {
	    aClass44Array3565 = new Class44[anInt3548];
	    for (int i = 0; i < anInt3548; i++)
		aClass44Array3565[i] = new Class44();
	    for (int i = 0; i < anInt3554; i++) {
		int i_56_ = anIntArray3558[i];
		int i_57_ = anIntArray3569[i];
		int i_58_ = anIntArray3564[i];
		int i_59_ = anIntArray3542[i_57_] - anIntArray3542[i_56_];
		int i_60_ = anIntArray3541[i_57_] - anIntArray3541[i_56_];
		int i_61_ = anIntArray3575[i_57_] - anIntArray3575[i_56_];
		int i_62_ = anIntArray3542[i_58_] - anIntArray3542[i_56_];
		int i_63_ = anIntArray3541[i_58_] - anIntArray3541[i_56_];
		int i_64_ = anIntArray3575[i_58_] - anIntArray3575[i_56_];
		int i_65_ = i_60_ * i_64_ - i_63_ * i_61_;
		int i_66_ = i_61_ * i_62_ - i_64_ * i_59_;
		int i_67_;
		for (i_67_ = i_59_ * i_63_ - i_62_ * i_60_;
		     (i_65_ > 8192 || i_66_ > 8192 || i_67_ > 8192
		      || i_65_ < -8192 || i_66_ < -8192 || i_67_ < -8192);
		     i_67_ >>= 1) {
		    i_65_ >>= 1;
		    i_66_ >>= 1;
		}
		int i_68_
		    = (int) Math.sqrt((double) (i_65_ * i_65_ + i_66_ * i_66_
						+ i_67_ * i_67_));
		if (i_68_ <= 0)
		    i_68_ = 1;
		i_65_ = i_65_ * 256 / i_68_;
		i_66_ = i_66_ * 256 / i_68_;
		i_67_ = i_67_ * 256 / i_68_;
		byte i_69_;
		if (aByteArray3576 == null)
		    i_69_ = (byte) 0;
		else
		    i_69_ = aByteArray3576[i];
		if (i_69_ == 0) {
		    Class44 class44 = aClass44Array3565[i_56_];
		    class44.anInt915 += i_65_;
		    class44.anInt920 += i_66_;
		    class44.anInt911 += i_67_;
		    class44.anInt922++;
		    class44 = aClass44Array3565[i_57_];
		    class44.anInt915 += i_65_;
		    class44.anInt920 += i_66_;
		    class44.anInt911 += i_67_;
		    class44.anInt922++;
		    class44 = aClass44Array3565[i_58_];
		    class44.anInt915 += i_65_;
		    class44.anInt920 += i_66_;
		    class44.anInt911 += i_67_;
		    class44.anInt922++;
		} else if (i_69_ == 1) {
		    if (aClass52Array3550 == null)
			aClass52Array3550 = new Class52[anInt3554];
		    Class52 class52 = aClass52Array3550[i] = new Class52();
		    class52.anInt1054 = i_65_;
		    class52.anInt1056 = i_66_;
		    class52.anInt1052 = i_67_;
		}
	    }
	}
    }
    
    public static int method1783(int[][] arg0, int arg1, int arg2) {
	int i = arg1 >> 7;
	int i_70_ = arg2 >> 7;
	if (i < 0 || i_70_ < 0 || i >= arg0.length || i_70_ >= arg0[0].length)
	    return 0;
	int i_71_ = arg1 & 0x7f;
	int i_72_ = arg2 & 0x7f;
	int i_73_
	    = arg0[i][i_70_] * (128 - i_71_) + arg0[i + 1][i_70_] * i_71_ >> 7;
	int i_74_ = ((arg0[i][i_70_ + 1] * (128 - i_71_)
		      + arg0[i + 1][i_70_ + 1] * i_71_)
		     >> 7);
	return i_73_ * (128 - i_72_) + i_74_ * i_72_ >> 7;
    }
    
    public void method1763(Class131 arg0, int arg1, int arg2, int arg3,
			   boolean arg4) {
	Class131_Sub2 class131_sub2 = (Class131_Sub2) arg0;
	class131_sub2.method1794();
	class131_sub2.method1782();
	anInt3577++;
	int i = 0;
	int[] is = class131_sub2.anIntArray3542;
	int i_75_ = class131_sub2.anInt3548;
	for (int i_76_ = 0; i_76_ < anInt3548; i_76_++) {
	    Class44 class44 = aClass44Array3565[i_76_];
	    if (class44.anInt922 != 0) {
		int i_77_ = anIntArray3541[i_76_] - arg2;
		if (i_77_ >= class131_sub2.aShort3579
		    && i_77_ <= class131_sub2.aShort3578) {
		    int i_78_ = anIntArray3542[i_76_] - arg1;
		    if (i_78_ >= class131_sub2.aShort3570
			&& i_78_ <= class131_sub2.aShort3540) {
			int i_79_ = anIntArray3575[i_76_] - arg3;
			if (i_79_ >= class131_sub2.aShort3555
			    && i_79_ <= class131_sub2.aShort3552) {
			    for (int i_80_ = 0; i_80_ < i_75_; i_80_++) {
				Class44 class44_81_
				    = class131_sub2.aClass44Array3565[i_80_];
				if (i_78_ == is[i_80_]
				    && (i_79_
					== class131_sub2.anIntArray3575[i_80_])
				    && (i_77_
					== class131_sub2.anIntArray3541[i_80_])
				    && class44_81_.anInt922 != 0) {
				    if (aClass44Array3589 == null)
					aClass44Array3589
					    = new Class44[anInt3548];
				    if (class131_sub2.aClass44Array3589
					== null)
					class131_sub2.aClass44Array3589
					    = new Class44[i_75_];
				    Class44 class44_82_
					= aClass44Array3589[i_76_];
				    if (class44_82_ == null)
					class44_82_
					    = aClass44Array3589[i_76_]
					    = new Class44(class44);
				    Class44 class44_83_
					= (class131_sub2.aClass44Array3589
					   [i_80_]);
				    if (class44_83_ == null)
					class44_83_
					    = class131_sub2
						  .aClass44Array3589[i_80_]
					    = new Class44(class44_81_);
				    class44_82_.anInt915
					+= class44_81_.anInt915;
				    class44_82_.anInt920
					+= class44_81_.anInt920;
				    class44_82_.anInt911
					+= class44_81_.anInt911;
				    class44_82_.anInt922
					+= class44_81_.anInt922;
				    class44_83_.anInt915 += class44.anInt915;
				    class44_83_.anInt920 += class44.anInt920;
				    class44_83_.anInt911 += class44.anInt911;
				    class44_83_.anInt922 += class44.anInt922;
				    i++;
				    anIntArray3562[i_76_] = anInt3577;
				    anIntArray3580[i_80_] = anInt3577;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i >= 3 && arg4) {
	    for (int i_84_ = 0; i_84_ < anInt3554; i_84_++) {
		if (anIntArray3562[anIntArray3558[i_84_]] == anInt3577
		    && anIntArray3562[anIntArray3569[i_84_]] == anInt3577
		    && anIntArray3562[anIntArray3564[i_84_]] == anInt3577) {
		    if (aByteArray3576 == null)
			aByteArray3576 = new byte[anInt3554];
		    aByteArray3576[i_84_] = (byte) 2;
		}
	    }
	    for (int i_85_ = 0; i_85_ < class131_sub2.anInt3554; i_85_++) {
		if ((anIntArray3580[class131_sub2.anIntArray3558[i_85_]]
		     == anInt3577)
		    && (anIntArray3580[class131_sub2.anIntArray3569[i_85_]]
			== anInt3577)
		    && (anIntArray3580[class131_sub2.anIntArray3564[i_85_]]
			== anInt3577)) {
		    if (class131_sub2.aByteArray3576 == null)
			class131_sub2.aByteArray3576
			    = new byte[class131_sub2.anInt3554];
		    class131_sub2.aByteArray3576[i_85_] = (byte) 2;
		}
	    }
	}
    }
    
    public void method1784(int[][] arg0, int arg1, int arg2, int arg3,
			   int arg4, int arg5) {
	boolean bool = false;
	boolean bool_86_ = false;
	boolean bool_87_ = false;
	int i = -arg4 / 2;
	int i_88_ = -arg5 / 2;
	int i_89_ = method1783(arg0, arg1 + i, arg3 + i_88_);
	int i_90_ = arg4 / 2;
	int i_91_ = -arg5 / 2;
	int i_92_ = method1783(arg0, arg1 + i_90_, arg3 + i_91_);
	int i_93_ = -arg4 / 2;
	int i_94_ = arg5 / 2;
	int i_95_ = method1783(arg0, arg1 + i_93_, arg3 + i_94_);
	int i_96_ = arg4 / 2;
	int i_97_ = arg5 / 2;
	int i_98_ = method1783(arg0, arg1 + i_96_, arg3 + i_97_);
	int i_99_ = i_89_ < i_92_ ? i_89_ : i_92_;
	int i_100_ = i_95_ < i_98_ ? i_95_ : i_98_;
	int i_101_ = i_92_ < i_98_ ? i_92_ : i_98_;
	int i_102_ = i_89_ < i_95_ ? i_89_ : i_95_;
	if (arg5 != 0) {
	    int i_103_
		= ((int) (Math.atan2((double) (i_99_ - i_100_), (double) arg5)
			  * 325.95)
		   & 0x7ff);
	    if (i_103_ != 0)
		method1802(i_103_);
	}
	if (arg4 != 0) {
	    int i_104_
		= ((int) (Math.atan2((double) (i_102_ - i_101_), (double) arg4)
			  * 325.95)
		   & 0x7ff);
	    if (i_104_ != 0)
		method1805(i_104_);
	}
	int i_105_ = i_89_ + i_98_;
	if (i_92_ + i_95_ < i_105_)
	    i_105_ = i_92_ + i_95_;
	i_105_ = (i_105_ >> 1) - arg2;
	if (i_105_ != 0)
	    method1798(0, i_105_, 0);
    }
    
    public void method1785() {
	for (int i = 0; i < anInt3548; i++) {
	    anIntArray3542[i] = -anIntArray3542[i];
	    anIntArray3575[i] = -anIntArray3575[i];
	}
	method1790();
    }
    
    public Class131_Sub2 method1786() {
	Class131_Sub2 class131_sub2 = new Class131_Sub2();
	if (aByteArray3576 != null) {
	    class131_sub2.aByteArray3576 = new byte[anInt3554];
	    for (int i = 0; i < anInt3554; i++)
		class131_sub2.aByteArray3576[i] = aByteArray3576[i];
	}
	class131_sub2.anInt3548 = anInt3548;
	class131_sub2.anInt3554 = anInt3554;
	class131_sub2.anInt3573 = anInt3573;
	class131_sub2.anIntArray3542 = anIntArray3542;
	class131_sub2.anIntArray3541 = anIntArray3541;
	class131_sub2.anIntArray3575 = anIntArray3575;
	class131_sub2.anIntArray3558 = anIntArray3558;
	class131_sub2.anIntArray3569 = anIntArray3569;
	class131_sub2.anIntArray3564 = anIntArray3564;
	class131_sub2.aByteArray3585 = aByteArray3585;
	class131_sub2.aByteArray3551 = aByteArray3551;
	class131_sub2.aByteArray3567 = aByteArray3567;
	class131_sub2.aShortArray3545 = aShortArray3545;
	class131_sub2.aShortArray3563 = aShortArray3563;
	class131_sub2.aByte3587 = aByte3587;
	class131_sub2.aByteArray3560 = aByteArray3560;
	class131_sub2.aShortArray3547 = aShortArray3547;
	class131_sub2.aShortArray3561 = aShortArray3561;
	class131_sub2.aShortArray3557 = aShortArray3557;
	class131_sub2.aShortArray3586 = aShortArray3586;
	class131_sub2.aShortArray3574 = aShortArray3574;
	class131_sub2.aShortArray3556 = aShortArray3556;
	class131_sub2.aByteArray3543 = aByteArray3543;
	class131_sub2.aByteArray3583 = aByteArray3583;
	class131_sub2.aByteArray3582 = aByteArray3582;
	class131_sub2.aByteArray3581 = aByteArray3581;
	class131_sub2.aByteArray3571 = aByteArray3571;
	class131_sub2.anIntArray3544 = anIntArray3544;
	class131_sub2.anIntArray3566 = anIntArray3566;
	class131_sub2.anIntArrayArray3568 = anIntArrayArray3568;
	class131_sub2.anIntArrayArray3588 = anIntArrayArray3588;
	class131_sub2.aClass44Array3565 = aClass44Array3565;
	class131_sub2.aClass52Array3550 = aClass52Array3550;
	class131_sub2.aShort3549 = aShort3549;
	class131_sub2.aShort3546 = aShort3546;
	return class131_sub2;
    }
    
    public Class131_Sub6 method1787(int arg0, int arg1, int arg2, int arg3,
				    int arg4) {
	return new Class131_Sub6_Sub1(this, arg0, arg1, arg2, arg3, arg4);
    }
    
    public void method1788() {
	anIntArray3544 = null;
	anIntArray3566 = null;
	anIntArrayArray3568 = null;
	anIntArrayArray3588 = null;
    }
    
    public boolean method1768() {
	return true;
    }
    
    public void method1789() {
	for (int i = 0; i < anInt3548; i++) {
	    int i_106_ = anIntArray3575[i];
	    anIntArray3575[i] = anIntArray3542[i];
	    anIntArray3542[i] = -i_106_;
	}
	method1790();
    }
    
    public void method1790() {
	aClass44Array3565 = null;
	aClass44Array3589 = null;
	aClass52Array3550 = null;
	aBoolean3572 = false;
    }
    
    public void method1791(short arg0, short arg1) {
	if (aShortArray3563 != null) {
	    for (int i = 0; i < anInt3554; i++) {
		if (aShortArray3563[i] == arg0)
		    aShortArray3563[i] = arg1;
	    }
	}
    }
    
    public void method1792(int arg0) {
	int i = anIntArray3584[arg0];
	int i_107_ = anIntArray3559[arg0];
	for (int i_108_ = 0; i_108_ < anInt3548; i_108_++) {
	    int i_109_
		= (anIntArray3575[i_108_] * i + anIntArray3542[i_108_] * i_107_
		   >> 16);
	    anIntArray3575[i_108_]
		= (anIntArray3575[i_108_] * i_107_ - anIntArray3542[i_108_] * i
		   >> 16);
	    anIntArray3542[i_108_] = i_109_;
	}
	method1790();
    }
    
    public void method1793(byte[] arg0) {
	boolean bool = false;
	boolean bool_110_ = false;
	Stream Stream = new Stream(arg0);
	Stream Stream_111_ = new Stream(arg0);
	Stream Stream_112_ = new Stream(arg0);
	Stream Stream_113_ = new Stream(arg0);
	Stream Stream_114_ = new Stream(arg0);
	Stream.currentOffset = arg0.length - 18;
	int i = Stream.readUShort(-2386);
	int i_115_ = Stream.readUShort(-2386);
	int i_116_ = Stream.readByte((byte) -32);
	int i_117_ = Stream.readByte((byte) 78);
	int i_118_ = Stream.readByte((byte) 124);
	int i_119_ = Stream.readByte((byte) 122);
	int i_120_ = Stream.readByte((byte) 123);
	int i_121_ = Stream.readByte((byte) 107);
	int i_122_ = Stream.readUShort(-2386);
	int i_123_ = Stream.readUShort(-2386);
	int i_124_ = Stream.readUShort(-2386);
	int i_125_ = Stream.readUShort(-2386);
	int i_126_ = 0;
	int i_127_ = i_126_;
	i_126_ += i;
	int i_128_ = i_126_;
	i_126_ += i_115_;
	int i_129_ = i_126_;
	if (i_118_ == 255)
	    i_126_ += i_115_;
	int i_130_ = i_126_;
	if (i_120_ == 1)
	    i_126_ += i_115_;
	int i_131_ = i_126_;
	if (i_117_ == 1)
	    i_126_ += i_115_;
	int i_132_ = i_126_;
	if (i_121_ == 1)
	    i_126_ += i;
	int i_133_ = i_126_;
	if (i_119_ == 1)
	    i_126_ += i_115_;
	int i_134_ = i_126_;
	i_126_ += i_125_;
	int i_135_ = i_126_;
	i_126_ += i_115_ * 2;
	int i_136_ = i_126_;
	i_126_ += i_116_ * 6;
	int i_137_ = i_126_;
	i_126_ += i_122_;
	int i_138_ = i_126_;
	i_126_ += i_123_;
	int i_139_ = i_126_;
	i_126_ += i_124_;
	anInt3548 = i;
	anInt3554 = i_115_;
	anInt3573 = i_116_;
	anIntArray3542 = new int[i];
	anIntArray3541 = new int[i];
	anIntArray3575 = new int[i];
	anIntArray3558 = new int[i_115_];
	anIntArray3569 = new int[i_115_];
	anIntArray3564 = new int[i_115_];
	if (i_116_ > 0) {
	    aByteArray3560 = new byte[i_116_];
	    aShortArray3547 = new short[i_116_];
	    aShortArray3561 = new short[i_116_];
	    aShortArray3557 = new short[i_116_];
	}
	if (i_121_ == 1)
	    anIntArray3544 = new int[i];
	if (i_117_ == 1) {
	    aByteArray3576 = new byte[i_115_];
	    aByteArray3567 = new byte[i_115_];
	    aShortArray3563 = new short[i_115_];
	}
	if (i_118_ == 255)
	    aByteArray3585 = new byte[i_115_];
	else
	    aByte3587 = (byte) i_118_;
	if (i_119_ == 1)
	    aByteArray3551 = new byte[i_115_];
	if (i_120_ == 1)
	    anIntArray3566 = new int[i_115_];
	aShortArray3545 = new short[i_115_];
	Stream.currentOffset = i_127_;
	Stream_111_.currentOffset = i_137_;
	Stream_112_.currentOffset = i_138_;
	Stream_113_.currentOffset = i_139_;
	Stream_114_.currentOffset = i_132_;
	int i_140_ = 0;
	int i_141_ = 0;
	int i_142_ = 0;
	for (int i_143_ = 0; i_143_ < i; i_143_++) {
	    int i_144_ = Stream.readByte((byte) 92);
	    int i_145_ = 0;
	    if ((i_144_ & 0x1) != 0)
		i_145_ = Stream_111_.method1044(-15839);
	    int i_146_ = 0;
	    if ((i_144_ & 0x2) != 0)
		i_146_ = Stream_112_.method1044(-15839);
	    int i_147_ = 0;
	    if ((i_144_ & 0x4) != 0)
		i_147_ = Stream_113_.method1044(-15839);
	    anIntArray3542[i_143_] = i_140_ + i_145_;
	    anIntArray3541[i_143_] = i_141_ + i_146_;
	    anIntArray3575[i_143_] = i_142_ + i_147_;
	    i_140_ = anIntArray3542[i_143_];
	    i_141_ = anIntArray3541[i_143_];
	    i_142_ = anIntArray3575[i_143_];
	    if (i_121_ == 1)
		anIntArray3544[i_143_]
		    = Stream_114_.readByte((byte) -58);
	}
	Stream.currentOffset = i_135_;
	Stream_111_.currentOffset = i_131_;
	Stream_112_.currentOffset = i_129_;
	Stream_113_.currentOffset = i_133_;
	Stream_114_.currentOffset = i_130_;
	for (int i_148_ = 0; i_148_ < i_115_; i_148_++) {
	    aShortArray3545[i_148_] = (short) Stream.readUShort(-2386);
	    if (i_117_ == 1) {
		int i_149_ = Stream_111_.readByte((byte) 105);
		if ((i_149_ & 0x1) == 1) {
		    aByteArray3576[i_148_] = (byte) 1;
		    bool = true;
		} else
		    aByteArray3576[i_148_] = (byte) 0;
		if ((i_149_ & 0x2) == 2) {
		    aByteArray3567[i_148_] = (byte) (i_149_ >> 2);
		    aShortArray3563[i_148_] = aShortArray3545[i_148_];
		    aShortArray3545[i_148_] = (short) 127;
		    if (aShortArray3563[i_148_] != -1)
			bool_110_ = true;
		} else {
		    aByteArray3567[i_148_] = (byte) -1;
		    aShortArray3563[i_148_] = (short) -1;
		}
	    }
	    if (i_118_ == 255)
		aByteArray3585[i_148_]
		    = Stream_112_.readByte2((byte) 1);
	    if (i_119_ == 1)
		aByteArray3551[i_148_]
		    = Stream_113_.readByte2((byte) 1);
	    if (i_120_ == 1)
		anIntArray3566[i_148_]
		    = Stream_114_.readByte((byte) -15);
	}
	Stream.currentOffset = i_134_;
	Stream_111_.currentOffset = i_128_;
	int i_150_ = 0;
	int i_151_ = 0;
	int i_152_ = 0;
	int i_153_ = 0;
	for (int i_154_ = 0; i_154_ < i_115_; i_154_++) {
	    int i_155_ = Stream_111_.readByte((byte) 88);
	    if (i_155_ == 1) {
		i_150_ = Stream.method1044(-15839) + i_153_;
		i_153_ = i_150_;
		i_151_ = Stream.method1044(-15839) + i_153_;
		i_153_ = i_151_;
		i_152_ = Stream.method1044(-15839) + i_153_;
		i_153_ = i_152_;
		anIntArray3558[i_154_] = i_150_;
		anIntArray3569[i_154_] = i_151_;
		anIntArray3564[i_154_] = i_152_;
	    }
	    if (i_155_ == 2) {
		i_151_ = i_152_;
		i_152_ = Stream.method1044(-15839) + i_153_;
		i_153_ = i_152_;
		anIntArray3558[i_154_] = i_150_;
		anIntArray3569[i_154_] = i_151_;
		anIntArray3564[i_154_] = i_152_;
	    }
	    if (i_155_ == 3) {
		i_150_ = i_152_;
		i_152_ = Stream.method1044(-15839) + i_153_;
		i_153_ = i_152_;
		anIntArray3558[i_154_] = i_150_;
		anIntArray3569[i_154_] = i_151_;
		anIntArray3564[i_154_] = i_152_;
	    }
	    if (i_155_ == 4) {
		int i_156_ = i_150_;
		i_150_ = i_151_;
		i_151_ = i_156_;
		i_152_ = Stream.method1044(-15839) + i_153_;
		i_153_ = i_152_;
		anIntArray3558[i_154_] = i_150_;
		anIntArray3569[i_154_] = i_151_;
		anIntArray3564[i_154_] = i_152_;
	    }
	}
	Stream.currentOffset = i_136_;
	for (int i_157_ = 0; i_157_ < i_116_; i_157_++) {
	    aByteArray3560[i_157_] = (byte) 0;
	    aShortArray3547[i_157_] = (short) Stream.readUShort(-2386);
	    aShortArray3561[i_157_] = (short) Stream.readUShort(-2386);
	    aShortArray3557[i_157_] = (short) Stream.readUShort(-2386);
	}
	if (aByteArray3567 != null) {
	    boolean bool_158_ = false;
	    for (int i_159_ = 0; i_159_ < i_115_; i_159_++) {
		int i_160_ = aByteArray3567[i_159_] & 0xff;
		if (i_160_ != 255) {
		    if (((aShortArray3547[i_160_] & 0xffff)
			 == anIntArray3558[i_159_])
			&& ((aShortArray3561[i_160_] & 0xffff)
			    == anIntArray3569[i_159_])
			&& ((aShortArray3557[i_160_] & 0xffff)
			    == anIntArray3564[i_159_]))
			aByteArray3567[i_159_] = (byte) -1;
		    else
			bool_158_ = true;
		}
	    }
	    if (!bool_158_)
		aByteArray3567 = null;
	}
	if (!bool_110_)
	    aShortArray3563 = null;
	if (!bool)
	    aByteArray3576 = null;
    }
    
    public void method1794() {
	if (!aBoolean3572) {
	    aBoolean3572 = true;
	    int i = 32767;
	    int i_161_ = 32767;
	    int i_162_ = 32767;
	    int i_163_ = -32768;
	    int i_164_ = -32768;
	    int i_165_ = -32768;
	    for (int i_166_ = 0; i_166_ < anInt3548; i_166_++) {
		int i_167_ = anIntArray3542[i_166_];
		int i_168_ = anIntArray3541[i_166_];
		int i_169_ = anIntArray3575[i_166_];
		if (i_167_ < i)
		    i = i_167_;
		if (i_167_ > i_163_)
		    i_163_ = i_167_;
		if (i_168_ < i_161_)
		    i_161_ = i_168_;
		if (i_168_ > i_164_)
		    i_164_ = i_168_;
		if (i_169_ < i_162_)
		    i_162_ = i_169_;
		if (i_169_ > i_165_)
		    i_165_ = i_169_;
	    }
	    aShort3570 = (short) i;
	    aShort3540 = (short) i_163_;
	    aShort3579 = (short) i_161_;
	    aShort3578 = (short) i_164_;
	    aShort3555 = (short) i_162_;
	    aShort3552 = (short) i_165_;
	}
    }
    
    public static void method1795() {
	anIntArray3562 = null;
	anIntArray3580 = null;
	anIntArray3584 = null;
	anIntArray3559 = null;
    }
    
    public void method1796(short arg0, short arg1) {
	for (int i = 0; i < anInt3554; i++) {
	    if (aShortArray3545[i] == arg0)
		aShortArray3545[i] = arg1;
	}
    }
    
    public int method1797(Class131_Sub2 arg0, int arg1, short arg2) {
	int i = arg0.anIntArray3542[arg1];
	int i_170_ = arg0.anIntArray3541[arg1];
	int i_171_ = arg0.anIntArray3575[arg1];
	for (int i_172_ = 0; i_172_ < anInt3548; i_172_++) {
	    if (i == anIntArray3542[i_172_] && i_170_ == anIntArray3541[i_172_]
		&& i_171_ == anIntArray3575[i_172_]) {
		aShortArray3539[i_172_] |= arg2;
		return i_172_;
	    }
	}
	anIntArray3542[anInt3548] = i;
	anIntArray3541[anInt3548] = i_170_;
	anIntArray3575[anInt3548] = i_171_;
	aShortArray3539[anInt3548] = arg2;
	if (arg0.anIntArray3544 != null)
	    anIntArray3544[anInt3548] = arg0.anIntArray3544[arg1];
	return anInt3548++;
    }
    
    public void method1798(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt3548; i++) {
	    anIntArray3542[i] += arg0;
	    anIntArray3541[i] += arg1;
	    anIntArray3575[i] += arg2;
	}
	method1790();
    }
    
    public void method1799(int arg0, int arg1, int arg2) {
	if (arg2 != 0) {
	    int i = anIntArray3584[arg2];
	    int i_173_ = anIntArray3559[arg2];
	    for (int i_174_ = 0; i_174_ < anInt3548; i_174_++) {
		int i_175_ = ((anIntArray3541[i_174_] * i
			       + anIntArray3542[i_174_] * i_173_)
			      >> 16);
		anIntArray3541[i_174_] = (anIntArray3541[i_174_] * i_173_
					  - anIntArray3542[i_174_] * i) >> 16;
		anIntArray3542[i_174_] = i_175_;
	    }
	}
	if (arg0 != 0) {
	    int i = anIntArray3584[arg0];
	    int i_176_ = anIntArray3559[arg0];
	    for (int i_177_ = 0; i_177_ < anInt3548; i_177_++) {
		int i_178_ = ((anIntArray3541[i_177_] * i_176_
			       - anIntArray3575[i_177_] * i)
			      >> 16);
		anIntArray3575[i_177_]
		    = (anIntArray3541[i_177_] * i
		       + anIntArray3575[i_177_] * i_176_) >> 16;
		anIntArray3541[i_177_] = i_178_;
	    }
	}
	if (arg1 != 0) {
	    int i = anIntArray3584[arg1];
	    int i_179_ = anIntArray3559[arg1];
	    for (int i_180_ = 0; i_180_ < anInt3548; i_180_++) {
		int i_181_ = ((anIntArray3575[i_180_] * i
			       + anIntArray3542[i_180_] * i_179_)
			      >> 16);
		anIntArray3575[i_180_] = (anIntArray3575[i_180_] * i_179_
					  - anIntArray3542[i_180_] * i) >> 16;
		anIntArray3542[i_180_] = i_181_;
	    }
	}
    }
    
    public Class131_Sub6_Sub1 method1800(int arg0, int arg1, int arg2,
					 int arg3, int arg4) {
	return new Class131_Sub6_Sub1(this, arg0, arg1, arg2, arg3, arg4);
    }
    
    public void method1801() {
	if (anIntArray3544 != null) {
	    int[] is = new int[256];
	    int i = 0;
	    for (int i_182_ = 0; i_182_ < anInt3548; i_182_++) {
		int i_183_ = anIntArray3544[i_182_];
		is[i_183_]++;
		if (i_183_ > i)
		    i = i_183_;
	    }
	    anIntArrayArray3568 = new int[i + 1][];
	    for (int i_184_ = 0; i_184_ <= i; i_184_++) {
		anIntArrayArray3568[i_184_] = new int[is[i_184_]];
		is[i_184_] = 0;
	    }
	    for (int i_185_ = 0; i_185_ < anInt3548; i_185_++) {
		int i_186_ = anIntArray3544[i_185_];
		anIntArrayArray3568[i_186_][is[i_186_]++] = i_185_;
	    }
	    anIntArray3544 = null;
	}
	if (anIntArray3566 != null) {
	    int[] is = new int[256];
	    int i = 0;
	    for (int i_187_ = 0; i_187_ < anInt3554; i_187_++) {
		int i_188_ = anIntArray3566[i_187_];
		is[i_188_]++;
		if (i_188_ > i)
		    i = i_188_;
	    }
	    anIntArrayArray3588 = new int[i + 1][];
	    for (int i_189_ = 0; i_189_ <= i; i_189_++) {
		anIntArrayArray3588[i_189_] = new int[is[i_189_]];
		is[i_189_] = 0;
	    }
	    for (int i_190_ = 0; i_190_ < anInt3554; i_190_++) {
		int i_191_ = anIntArray3566[i_190_];
		anIntArrayArray3588[i_191_][is[i_191_]++] = i_190_;
	    }
	    anIntArray3566 = null;
	}
    }
    
    public void method1802(int arg0) {
	int i = anIntArray3584[arg0];
	int i_192_ = anIntArray3559[arg0];
	for (int i_193_ = 0; i_193_ < anInt3548; i_193_++) {
	    int i_194_
		= (anIntArray3541[i_193_] * i_192_ - anIntArray3575[i_193_] * i
		   >> 16);
	    anIntArray3575[i_193_]
		= (anIntArray3541[i_193_] * i + anIntArray3575[i_193_] * i_192_
		   >> 16);
	    anIntArray3541[i_193_] = i_194_;
	}
	method1790();
    }
    
    public void method1764(int i, int i_195_, int i_196_, int i_197_,
			   int i_198_, int i_199_, int i_200_, int i_201_,
			   long l, int i_202_, Class61_Sub1 class61_sub1) {
	/* empty */
    }
    
    public int method1803(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt3548; i++) {
	    if (anIntArray3542[i] == arg0 && anIntArray3541[i] == arg1
		&& anIntArray3575[i] == arg2)
		return i;
	}
	anIntArray3542[anInt3548] = arg0;
	anIntArray3541[anInt3548] = arg1;
	anIntArray3575[anInt3548] = arg2;
	return anInt3548++;
    }
    
    public void method1804(byte[] arg0) {
	Stream Stream = new Stream(arg0);
	Stream Stream_203_ = new Stream(arg0);
	Stream Stream_204_ = new Stream(arg0);
	Stream Stream_205_ = new Stream(arg0);
	Stream Stream_206_ = new Stream(arg0);
	Stream Stream_207_ = new Stream(arg0);
	Stream Stream_208_ = new Stream(arg0);
	Stream.currentOffset = arg0.length - 23;
	int i = Stream.readUShort(-2386);
	int i_209_ = Stream.readUShort(-2386);
	int i_210_ = Stream.readByte((byte) 105);
	int i_211_ = Stream.readByte((byte) 112);
	boolean bool = (i_211_ & 0x1) == 1;
	boolean bool_212_ = (i_211_ & 0x2) == 2;
	int i_213_ = Stream.readByte((byte) -99);
	int i_214_ = Stream.readByte((byte) -95);
	int i_215_ = Stream.readByte((byte) -68);
	int i_216_ = Stream.readByte((byte) -18);
	int i_217_ = Stream.readByte((byte) 104);
	int i_218_ = Stream.readUShort(-2386);
	int i_219_ = Stream.readUShort(-2386);
	int i_220_ = Stream.readUShort(-2386);
	int i_221_ = Stream.readUShort(-2386);
	int i_222_ = Stream.readUShort(-2386);
	int i_223_ = 0;
	int i_224_ = 0;
	int i_225_ = 0;
	if (i_210_ > 0) {
	    aByteArray3560 = new byte[i_210_];
	    Stream.currentOffset = 0;
	    for (int i_226_ = 0; i_226_ < i_210_; i_226_++) {
		byte i_227_ = (aByteArray3560[i_226_]
			       = Stream.readByte2((byte) 1));
		if (i_227_ == 0)
		    i_223_++;
		if (i_227_ >= 1 && i_227_ <= 3)
		    i_224_++;
		if (i_227_ == 2)
		    i_225_++;
	    }
	}
	int i_228_ = i_210_;
	int i_229_ = i_228_;
	i_228_ += i;
	int i_230_ = i_228_;
	if (bool)
	    i_228_ += i_209_;
	int i_231_ = i_228_;
	i_228_ += i_209_;
	int i_232_ = i_228_;
	if (i_213_ == 255)
	    i_228_ += i_209_;
	int i_233_ = i_228_;
	if (i_215_ == 1)
	    i_228_ += i_209_;
	int i_234_ = i_228_;
	if (i_217_ == 1)
	    i_228_ += i;
	int i_235_ = i_228_;
	if (i_214_ == 1)
	    i_228_ += i_209_;
	int i_236_ = i_228_;
	i_228_ += i_221_;
	int i_237_ = i_228_;
	if (i_216_ == 1)
	    i_228_ += i_209_ * 2;
	int i_238_ = i_228_;
	i_228_ += i_222_;
	int i_239_ = i_228_;
	i_228_ += i_209_ * 2;
	int i_240_ = i_228_;
	i_228_ += i_218_;
	int i_241_ = i_228_;
	i_228_ += i_219_;
	int i_242_ = i_228_;
	i_228_ += i_220_;
	int i_243_ = i_228_;
	i_228_ += i_223_ * 6;
	int i_244_ = i_228_;
	i_228_ += i_224_ * 6;
	int i_245_ = i_228_;
	i_228_ += i_224_ * 6;
	int i_246_ = i_228_;
	i_228_ += i_224_;
	int i_247_ = i_228_;
	i_228_ += i_224_;
	int i_248_ = i_228_;
	i_228_ += i_224_ + i_225_ * 2;
	int i_249_ = i_228_;
	anInt3548 = i;
	anInt3554 = i_209_;
	anInt3573 = i_210_;
	anIntArray3542 = new int[i];
	anIntArray3541 = new int[i];
	anIntArray3575 = new int[i];
	anIntArray3558 = new int[i_209_];
	anIntArray3569 = new int[i_209_];
	anIntArray3564 = new int[i_209_];
	if (i_217_ == 1)
	    anIntArray3544 = new int[i];
	if (bool)
	    aByteArray3576 = new byte[i_209_];
	if (i_213_ == 255)
	    aByteArray3585 = new byte[i_209_];
	else
	    aByte3587 = (byte) i_213_;
	if (i_214_ == 1)
	    aByteArray3551 = new byte[i_209_];
	if (i_215_ == 1)
	    anIntArray3566 = new int[i_209_];
	if (i_216_ == 1)
	    aShortArray3563 = new short[i_209_];
	if (i_216_ == 1 && i_210_ > 0)
	    aByteArray3567 = new byte[i_209_];
	aShortArray3545 = new short[i_209_];
	if (i_210_ > 0) {
	    aShortArray3547 = new short[i_210_];
	    aShortArray3561 = new short[i_210_];
	    aShortArray3557 = new short[i_210_];
	    if (i_224_ > 0) {
		aShortArray3586 = new short[i_224_];
		aShortArray3574 = new short[i_224_];
		aShortArray3556 = new short[i_224_];
		aByteArray3543 = new byte[i_224_];
		aByteArray3583 = new byte[i_224_];
		aByteArray3582 = new byte[i_224_];
	    }
	    if (i_225_ > 0) {
		aByteArray3581 = new byte[i_225_];
		aByteArray3571 = new byte[i_225_];
	    }
	}
	Stream.currentOffset = i_229_;
	Stream_203_.currentOffset = i_240_;
	Stream_204_.currentOffset = i_241_;
	Stream_205_.currentOffset = i_242_;
	Stream_206_.currentOffset = i_234_;
	int i_250_ = 0;
	int i_251_ = 0;
	int i_252_ = 0;
	for (int i_253_ = 0; i_253_ < i; i_253_++) {
	    int i_254_ = Stream.readByte((byte) 79);
	    int i_255_ = 0;
	    if ((i_254_ & 0x1) != 0)
		i_255_ = Stream_203_.method1044(-15839);
	    int i_256_ = 0;
	    if ((i_254_ & 0x2) != 0)
		i_256_ = Stream_204_.method1044(-15839);
	    int i_257_ = 0;
	    if ((i_254_ & 0x4) != 0)
		i_257_ = Stream_205_.method1044(-15839);
	    anIntArray3542[i_253_] = i_250_ + i_255_;
	    anIntArray3541[i_253_] = i_251_ + i_256_;
	    anIntArray3575[i_253_] = i_252_ + i_257_;
	    i_250_ = anIntArray3542[i_253_];
	    i_251_ = anIntArray3541[i_253_];
	    i_252_ = anIntArray3575[i_253_];
	    if (i_217_ == 1)
		anIntArray3544[i_253_]
		    = Stream_206_.readByte((byte) -25);
	}
	Stream.currentOffset = i_239_;
	Stream_203_.currentOffset = i_230_;
	Stream_204_.currentOffset = i_232_;
	Stream_205_.currentOffset = i_235_;
	Stream_206_.currentOffset = i_233_;
	Stream_207_.currentOffset = i_237_;
	Stream_208_.currentOffset = i_238_;
	for (int i_258_ = 0; i_258_ < i_209_; i_258_++) {
	    aShortArray3545[i_258_] = (short) Stream.readUShort(-2386);
	    if (bool)
		aByteArray3576[i_258_]
		    = Stream_203_.readByte2((byte) 1);
	    if (i_213_ == 255)
		aByteArray3585[i_258_]
		    = Stream_204_.readByte2((byte) 1);
	    if (i_214_ == 1)
		aByteArray3551[i_258_]
		    = Stream_205_.readByte2((byte) 1);
	    if (i_215_ == 1)
		anIntArray3566[i_258_]
		    = Stream_206_.readByte((byte) -90);
	    if (i_216_ == 1)
		aShortArray3563[i_258_]
		    = (short) (Stream_207_.readUShort(-2386) - 1);
	    if (aByteArray3567 != null) {
		if (aShortArray3563[i_258_] != -1)
		    aByteArray3567[i_258_]
			= (byte) (Stream_208_.readByte((byte) 98) - 1);
		else
		    aByteArray3567[i_258_] = (byte) -1;
	    }
	}
	Stream.currentOffset = i_236_;
	Stream_203_.currentOffset = i_231_;
	int i_259_ = 0;
	int i_260_ = 0;
	int i_261_ = 0;
	int i_262_ = 0;
	for (int i_263_ = 0; i_263_ < i_209_; i_263_++) {
	    int i_264_ = Stream_203_.readByte((byte) -26);
	    if (i_264_ == 1) {
		i_259_ = Stream.method1044(-15839) + i_262_;
		i_262_ = i_259_;
		i_260_ = Stream.method1044(-15839) + i_262_;
		i_262_ = i_260_;
		i_261_ = Stream.method1044(-15839) + i_262_;
		i_262_ = i_261_;
		anIntArray3558[i_263_] = i_259_;
		anIntArray3569[i_263_] = i_260_;
		anIntArray3564[i_263_] = i_261_;
	    }
	    if (i_264_ == 2) {
		i_260_ = i_261_;
		i_261_ = Stream.method1044(-15839) + i_262_;
		i_262_ = i_261_;
		anIntArray3558[i_263_] = i_259_;
		anIntArray3569[i_263_] = i_260_;
		anIntArray3564[i_263_] = i_261_;
	    }
	    if (i_264_ == 3) {
		i_259_ = i_261_;
		i_261_ = Stream.method1044(-15839) + i_262_;
		i_262_ = i_261_;
		anIntArray3558[i_263_] = i_259_;
		anIntArray3569[i_263_] = i_260_;
		anIntArray3564[i_263_] = i_261_;
	    }
	    if (i_264_ == 4) {
		int i_265_ = i_259_;
		i_259_ = i_260_;
		i_260_ = i_265_;
		i_261_ = Stream.method1044(-15839) + i_262_;
		i_262_ = i_261_;
		anIntArray3558[i_263_] = i_259_;
		anIntArray3569[i_263_] = i_260_;
		anIntArray3564[i_263_] = i_261_;
	    }
	}
	Stream.currentOffset = i_243_;
	Stream_203_.currentOffset = i_244_;
	Stream_204_.currentOffset = i_245_;
	Stream_205_.currentOffset = i_246_;
	Stream_206_.currentOffset = i_247_;
	Stream_207_.currentOffset = i_248_;
	for (int i_266_ = 0; i_266_ < i_210_; i_266_++) {
	    int i_267_ = aByteArray3560[i_266_] & 0xff;
	    if (i_267_ == 0) {
		aShortArray3547[i_266_]
		    = (short) Stream.readUShort(-2386);
		aShortArray3561[i_266_]
		    = (short) Stream.readUShort(-2386);
		aShortArray3557[i_266_]
		    = (short) Stream.readUShort(-2386);
	    }
	    if (i_267_ == 1) {
		aShortArray3547[i_266_]
		    = (short) Stream_203_.readUShort(-2386);
		aShortArray3561[i_266_]
		    = (short) Stream_203_.readUShort(-2386);
		aShortArray3557[i_266_]
		    = (short) Stream_203_.readUShort(-2386);
		aShortArray3586[i_266_]
		    = (short) Stream_204_.readUShort(-2386);
		aShortArray3574[i_266_]
		    = (short) Stream_204_.readUShort(-2386);
		aShortArray3556[i_266_]
		    = (short) Stream_204_.readUShort(-2386);
		aByteArray3543[i_266_]
		    = Stream_205_.readByte2((byte) 1);
		aByteArray3583[i_266_]
		    = Stream_206_.readByte2((byte) 1);
		aByteArray3582[i_266_]
		    = Stream_207_.readByte2((byte) 1);
	    }
	    if (i_267_ == 2) {
		aShortArray3547[i_266_]
		    = (short) Stream_203_.readUShort(-2386);
		aShortArray3561[i_266_]
		    = (short) Stream_203_.readUShort(-2386);
		aShortArray3557[i_266_]
		    = (short) Stream_203_.readUShort(-2386);
		aShortArray3586[i_266_]
		    = (short) Stream_204_.readUShort(-2386);
		aShortArray3574[i_266_]
		    = (short) Stream_204_.readUShort(-2386);
		aShortArray3556[i_266_]
		    = (short) Stream_204_.readUShort(-2386);
		aByteArray3543[i_266_]
		    = Stream_205_.readByte2((byte) 1);
		aByteArray3583[i_266_]
		    = Stream_206_.readByte2((byte) 1);
		aByteArray3582[i_266_]
		    = Stream_207_.readByte2((byte) 1);
		aByteArray3581[i_266_]
		    = Stream_207_.readByte2((byte) 1);
		aByteArray3571[i_266_]
		    = Stream_207_.readByte2((byte) 1);
	    }
	    if (i_267_ == 3) {
		aShortArray3547[i_266_]
		    = (short) Stream_203_.readUShort(-2386);
		aShortArray3561[i_266_]
		    = (short) Stream_203_.readUShort(-2386);
		aShortArray3557[i_266_]
		    = (short) Stream_203_.readUShort(-2386);
		aShortArray3586[i_266_]
		    = (short) Stream_204_.readUShort(-2386);
		aShortArray3574[i_266_]
		    = (short) Stream_204_.readUShort(-2386);
		aShortArray3556[i_266_]
		    = (short) Stream_204_.readUShort(-2386);
		aByteArray3543[i_266_]
		    = Stream_205_.readByte2((byte) 1);
		aByteArray3583[i_266_]
		    = Stream_206_.readByte2((byte) 1);
		aByteArray3582[i_266_]
		    = Stream_207_.readByte2((byte) 1);
	    }
	}
	if (bool_212_) {
	    Stream.currentOffset = i_249_;
	    int i_268_ = Stream.readByte((byte) 84);
	    if (i_268_ > 0)
		Stream.currentOffset += 4 * i_268_;
	    int i_269_ = Stream.readByte((byte) -52);
	    if (i_269_ > 0)
		Stream.currentOffset += 4 * i_269_;
	}
    }
    
    public void method1805(int arg0) {
	int i = anIntArray3584[arg0];
	int i_270_ = anIntArray3559[arg0];
	for (int i_271_ = 0; i_271_ < anInt3548; i_271_++) {
	    int i_272_
		= (anIntArray3541[i_271_] * i + anIntArray3542[i_271_] * i_270_
		   >> 16);
	    anIntArray3541[i_271_]
		= (anIntArray3541[i_271_] * i_270_ - anIntArray3542[i_271_] * i
		   >> 16);
	    anIntArray3542[i_271_] = i_272_;
	}
	method1790();
    }
    
    public Class131_Sub2() {
	anInt3548 = 0;
	aBoolean3572 = false;
	aByte3587 = (byte) 0;
    }
    
    public Class131_Sub2(byte[] arg0) {
	anInt3548 = 0;
	aBoolean3572 = false;
	aByte3587 = (byte) 0;
	if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1)
	    method1804(arg0);
	else
	    method1793(arg0);
    }
    
    public Class131_Sub2(int arg0, int arg1, int arg2) {
	anInt3548 = 0;
	aBoolean3572 = false;
	aByte3587 = (byte) 0;
	anIntArray3542 = new int[arg0];
	anIntArray3541 = new int[arg0];
	anIntArray3575 = new int[arg0];
	anIntArray3544 = new int[arg0];
	anIntArray3558 = new int[arg1];
	anIntArray3569 = new int[arg1];
	anIntArray3564 = new int[arg1];
	aByteArray3576 = new byte[arg1];
	aByteArray3585 = new byte[arg1];
	aByteArray3551 = new byte[arg1];
	aShortArray3545 = new short[arg1];
	aShortArray3563 = new short[arg1];
	aByteArray3567 = new byte[arg1];
	anIntArray3566 = new int[arg1];
	if (arg2 > 0) {
	    aByteArray3560 = new byte[arg2];
	    aShortArray3547 = new short[arg2];
	    aShortArray3561 = new short[arg2];
	    aShortArray3557 = new short[arg2];
	    aShortArray3586 = new short[arg2];
	    aShortArray3574 = new short[arg2];
	    aShortArray3556 = new short[arg2];
	    aByteArray3543 = new byte[arg2];
	    aByteArray3583 = new byte[arg2];
	    aByteArray3582 = new byte[arg2];
	    aByteArray3581 = new byte[arg2];
	    aByteArray3571 = new byte[arg2];
	}
    }
    
    public Class131_Sub2(Class131_Sub2[] arg0, int arg1) {
	anInt3548 = 0;
	aBoolean3572 = false;
	aByte3587 = (byte) 0;
	boolean bool = false;
	boolean bool_273_ = false;
	boolean bool_274_ = false;
	boolean bool_275_ = false;
	boolean bool_276_ = false;
	boolean bool_277_ = false;
	anInt3548 = 0;
	anInt3554 = 0;
	anInt3573 = 0;
	boolean bool_278_ = false;
	boolean bool_279_ = false;
	aByte3587 = (byte) -1;
	for (int i = 0; i < arg1; i++) {
	    Class131_Sub2 class131_sub2 = arg0[i];
	    if (class131_sub2 != null) {
		anInt3548 += class131_sub2.anInt3548;
		anInt3554 += class131_sub2.anInt3554;
		anInt3573 += class131_sub2.anInt3573;
		if (class131_sub2.aByteArray3585 != null)
		    bool_273_ = true;
		else {
		    if (aByte3587 == -1)
			aByte3587 = class131_sub2.aByte3587;
		    if (aByte3587 != class131_sub2.aByte3587)
			bool_273_ = true;
		}
		bool = bool | class131_sub2.aByteArray3576 != null;
		bool_274_ = bool_274_ | class131_sub2.aByteArray3551 != null;
		bool_275_ = bool_275_ | class131_sub2.anIntArray3566 != null;
		bool_276_ = bool_276_ | class131_sub2.aShortArray3563 != null;
		bool_277_ = bool_277_ | class131_sub2.aByteArray3567 != null;
	    }
	}
	anIntArray3542 = new int[anInt3548];
	anIntArray3541 = new int[anInt3548];
	anIntArray3575 = new int[anInt3548];
	anIntArray3544 = new int[anInt3548];
	aShortArray3539 = new short[anInt3548];
	anIntArray3558 = new int[anInt3554];
	anIntArray3569 = new int[anInt3554];
	anIntArray3564 = new int[anInt3554];
	if (bool)
	    aByteArray3576 = new byte[anInt3554];
	if (bool_273_)
	    aByteArray3585 = new byte[anInt3554];
	if (bool_274_)
	    aByteArray3551 = new byte[anInt3554];
	if (bool_275_)
	    anIntArray3566 = new int[anInt3554];
	if (bool_276_)
	    aShortArray3563 = new short[anInt3554];
	if (bool_277_)
	    aByteArray3567 = new byte[anInt3554];
	aShortArray3545 = new short[anInt3554];
	aShortArray3553 = new short[anInt3554];
	if (anInt3573 > 0) {
	    aByteArray3560 = new byte[anInt3573];
	    aShortArray3547 = new short[anInt3573];
	    aShortArray3561 = new short[anInt3573];
	    aShortArray3557 = new short[anInt3573];
	    aShortArray3586 = new short[anInt3573];
	    aShortArray3574 = new short[anInt3573];
	    aShortArray3556 = new short[anInt3573];
	    aByteArray3543 = new byte[anInt3573];
	    aByteArray3583 = new byte[anInt3573];
	    aByteArray3582 = new byte[anInt3573];
	    aByteArray3581 = new byte[anInt3573];
	    aByteArray3571 = new byte[anInt3573];
	}
	anInt3548 = 0;
	anInt3554 = 0;
	anInt3573 = 0;
	bool_278_ = false;
	bool_279_ = false;
	for (int i = 0; i < arg1; i++) {
	    short i_280_ = (short) (1 << i);
	    Class131_Sub2 class131_sub2 = arg0[i];
	    if (class131_sub2 != null) {
		for (int i_281_ = 0; i_281_ < class131_sub2.anInt3554;
		     i_281_++) {
		    if (bool && class131_sub2.aByteArray3576 != null)
			aByteArray3576[anInt3554]
			    = class131_sub2.aByteArray3576[i_281_];
		    if (bool_273_) {
			if (class131_sub2.aByteArray3585 != null)
			    aByteArray3585[anInt3554]
				= class131_sub2.aByteArray3585[i_281_];
			else
			    aByteArray3585[anInt3554]
				= class131_sub2.aByte3587;
		    }
		    if (bool_274_ && class131_sub2.aByteArray3551 != null)
			aByteArray3551[anInt3554]
			    = class131_sub2.aByteArray3551[i_281_];
		    if (bool_275_ && class131_sub2.anIntArray3566 != null)
			anIntArray3566[anInt3554]
			    = class131_sub2.anIntArray3566[i_281_];
		    if (bool_276_) {
			if (class131_sub2.aShortArray3563 != null)
			    aShortArray3563[anInt3554]
				= class131_sub2.aShortArray3563[i_281_];
			else
			    aShortArray3563[anInt3554] = (short) -1;
		    }
		    if (bool_277_) {
			if (class131_sub2.aByteArray3567 != null
			    && class131_sub2.aByteArray3567[i_281_] != -1)
			    aByteArray3567[anInt3554]
				= (byte) (class131_sub2.aByteArray3567[i_281_]
					  + anInt3573);
			else
			    aByteArray3567[anInt3554] = (byte) -1;
		    }
		    aShortArray3545[anInt3554]
			= class131_sub2.aShortArray3545[i_281_];
		    aShortArray3553[anInt3554] = i_280_;
		    anIntArray3558[anInt3554]
			= method1797(class131_sub2,
				     class131_sub2.anIntArray3558[i_281_],
				     i_280_);
		    anIntArray3569[anInt3554]
			= method1797(class131_sub2,
				     class131_sub2.anIntArray3569[i_281_],
				     i_280_);
		    anIntArray3564[anInt3554]
			= method1797(class131_sub2,
				     class131_sub2.anIntArray3564[i_281_],
				     i_280_);
		    anInt3554++;
		}
		for (int i_282_ = 0; i_282_ < class131_sub2.anInt3573;
		     i_282_++) {
		    byte i_283_ = (aByteArray3560[anInt3573]
				   = class131_sub2.aByteArray3560[i_282_]);
		    if (i_283_ == 0) {
			aShortArray3547[anInt3573]
			    = (short) method1797(class131_sub2,
						 (class131_sub2.aShortArray3547
						  [i_282_]),
						 i_280_);
			aShortArray3561[anInt3573]
			    = (short) method1797(class131_sub2,
						 (class131_sub2.aShortArray3561
						  [i_282_]),
						 i_280_);
			aShortArray3557[anInt3573]
			    = (short) method1797(class131_sub2,
						 (class131_sub2.aShortArray3557
						  [i_282_]),
						 i_280_);
		    }
		    if (i_283_ >= 1 && i_283_ <= 3) {
			aShortArray3547[anInt3573]
			    = class131_sub2.aShortArray3547[i_282_];
			aShortArray3561[anInt3573]
			    = class131_sub2.aShortArray3561[i_282_];
			aShortArray3557[anInt3573]
			    = class131_sub2.aShortArray3557[i_282_];
			aShortArray3586[anInt3573]
			    = class131_sub2.aShortArray3586[i_282_];
			aShortArray3574[anInt3573]
			    = class131_sub2.aShortArray3574[i_282_];
			aShortArray3556[anInt3573]
			    = class131_sub2.aShortArray3556[i_282_];
			aByteArray3543[anInt3573]
			    = class131_sub2.aByteArray3543[i_282_];
			aByteArray3583[anInt3573]
			    = class131_sub2.aByteArray3583[i_282_];
			aByteArray3582[anInt3573]
			    = class131_sub2.aByteArray3582[i_282_];
		    }
		    if (i_283_ == 2) {
			aByteArray3581[anInt3573]
			    = class131_sub2.aByteArray3581[i_282_];
			aByteArray3571[anInt3573]
			    = class131_sub2.aByteArray3571[i_282_];
		    }
		    anInt3573++;
		}
	    }
	}
    }
    
    public Class131_Sub2(Class131_Sub2 arg0, boolean arg1, boolean arg2,
			 boolean arg3, boolean arg4) {
	anInt3548 = 0;
	aBoolean3572 = false;
	aByte3587 = (byte) 0;
	anInt3548 = arg0.anInt3548;
	anInt3554 = arg0.anInt3554;
	anInt3573 = arg0.anInt3573;
	if (arg1) {
	    anIntArray3542 = arg0.anIntArray3542;
	    anIntArray3541 = arg0.anIntArray3541;
	    anIntArray3575 = arg0.anIntArray3575;
	} else {
	    anIntArray3542 = new int[anInt3548];
	    anIntArray3541 = new int[anInt3548];
	    anIntArray3575 = new int[anInt3548];
	    for (int i = 0; i < anInt3548; i++) {
		anIntArray3542[i] = arg0.anIntArray3542[i];
		anIntArray3541[i] = arg0.anIntArray3541[i];
		anIntArray3575[i] = arg0.anIntArray3575[i];
	    }
	}
	if (arg2)
	    aShortArray3545 = arg0.aShortArray3545;
	else {
	    aShortArray3545 = new short[anInt3554];
	    for (int i = 0; i < anInt3554; i++)
		aShortArray3545[i] = arg0.aShortArray3545[i];
	}
	if (arg3 || arg0.aShortArray3563 == null)
	    aShortArray3563 = arg0.aShortArray3563;
	else {
	    aShortArray3563 = new short[anInt3554];
	    for (int i = 0; i < anInt3554; i++)
		aShortArray3563[i] = arg0.aShortArray3563[i];
	}
	if (arg4)
	    aByteArray3551 = arg0.aByteArray3551;
	else {
	    aByteArray3551 = new byte[anInt3554];
	    if (arg0.aByteArray3551 == null) {
		for (int i = 0; i < anInt3554; i++)
		    aByteArray3551[i] = (byte) 0;
	    } else {
		for (int i = 0; i < anInt3554; i++)
		    aByteArray3551[i] = arg0.aByteArray3551[i];
	    }
	}
	anIntArray3558 = arg0.anIntArray3558;
	anIntArray3569 = arg0.anIntArray3569;
	anIntArray3564 = arg0.anIntArray3564;
	aByteArray3576 = arg0.aByteArray3576;
	aByteArray3585 = arg0.aByteArray3585;
	aByteArray3567 = arg0.aByteArray3567;
	aByte3587 = arg0.aByte3587;
	aByteArray3560 = arg0.aByteArray3560;
	aShortArray3547 = arg0.aShortArray3547;
	aShortArray3561 = arg0.aShortArray3561;
	aShortArray3557 = arg0.aShortArray3557;
	aShortArray3586 = arg0.aShortArray3586;
	aShortArray3574 = arg0.aShortArray3574;
	aShortArray3556 = arg0.aShortArray3556;
	aByteArray3543 = arg0.aByteArray3543;
	aByteArray3583 = arg0.aByteArray3583;
	aByteArray3582 = arg0.aByteArray3582;
	aByteArray3581 = arg0.aByteArray3581;
	aByteArray3571 = arg0.aByteArray3571;
	anIntArray3544 = arg0.anIntArray3544;
	anIntArray3566 = arg0.anIntArray3566;
	anIntArrayArray3568 = arg0.anIntArrayArray3568;
	anIntArrayArray3588 = arg0.anIntArrayArray3588;
	aClass44Array3565 = arg0.aClass44Array3565;
	aClass52Array3550 = arg0.aClass52Array3550;
	aClass44Array3589 = arg0.aClass44Array3589;
	aShort3549 = arg0.aShort3549;
	aShort3546 = arg0.aShort3546;
    }
    
    static {
	anIntArray3559 = Class26.anIntArray612;
	anIntArray3584 = Class26.anIntArray617;
    }
}
