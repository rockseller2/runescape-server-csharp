public abstract class Class131_Sub6 extends Class131
{
    public boolean aBoolean3690 = false;
    
    public abstract void method1828(int i, int[] is, int i_0_, int i_1_,
				    int i_2_, boolean bool);
    
    public abstract void method1829();
    
    public abstract int method1830();
    
    public abstract int method1831();
    
    public abstract void method1764
	(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
	 int i_9_, long l, int i_10_, Class61_Sub1 class61_sub1);
    
    public abstract boolean method1832();
    
    public abstract Class131_Sub6 method1833(boolean bool, boolean bool_11_,
					     boolean bool_12_);
    
    public void method1834(int[][] arg0, int arg1, int arg2, int arg3,
			   int arg4, int arg5) {
	boolean bool = false;
	boolean bool_13_ = false;
	boolean bool_14_ = false;
	int i = -arg4 / 2;
	int i_15_ = -arg5 / 2;
	int i_16_ = method1849(arg0, arg1 + i, arg3 + i_15_);
	int i_17_ = arg4 / 2;
	int i_18_ = -arg5 / 2;
	int i_19_ = method1849(arg0, arg1 + i_17_, arg3 + i_18_);
	int i_20_ = -arg4 / 2;
	int i_21_ = arg5 / 2;
	int i_22_ = method1849(arg0, arg1 + i_20_, arg3 + i_21_);
	int i_23_ = arg4 / 2;
	int i_24_ = arg5 / 2;
	int i_25_ = method1849(arg0, arg1 + i_23_, arg3 + i_24_);
	int i_26_ = i_16_ < i_19_ ? i_16_ : i_19_;
	int i_27_ = i_22_ < i_25_ ? i_22_ : i_25_;
	int i_28_ = i_19_ < i_25_ ? i_19_ : i_25_;
	int i_29_ = i_16_ < i_22_ ? i_16_ : i_22_;
	if (arg5 != 0) {
	    int i_30_
		= ((int) (Math.atan2((double) (i_26_ - i_27_), (double) arg5)
			  * 325.95)
		   & 0x7ff);
	    if (i_30_ != 0)
		method1847(i_30_);
	}
	if (arg4 != 0) {
	    int i_31_
		= ((int) (Math.atan2((double) (i_29_ - i_28_), (double) arg4)
			  * 325.95)
		   & 0x7ff);
	    if (i_31_ != 0)
		method1836(i_31_);
	}
	int i_32_ = i_16_ + i_25_;
	if (i_19_ + i_22_ < i_32_)
	    i_32_ = i_19_ + i_22_;
	i_32_ = (i_32_ >> 1) - arg2;
	if (i_32_ != 0)
	    method1837(0, i_32_, 0);
    }
    
    public abstract void method1835(int i, int[] is, int i_33_, int i_34_,
				    int i_35_, boolean bool, int i_36_,
				    int[] is_37_);
    
    public void method1771(int i, int i_38_, int i_39_, int i_40_, int i_41_) {
	/* empty */
    }
    
    public abstract void method1836(int i);
    
    public abstract void method1837(int i, int i_42_, int i_43_);
    
    public abstract int method1838();
    
    public abstract void method1839();
    
    public void method1840(Class67_Sub20 arg0, Class97 arg1, Class97 arg2,
			   int arg3, int arg4, boolean[] arg5, boolean arg6,
			   boolean arg7, int arg8, int[] arg9) {
	if (arg2 == null || arg3 == 0) {
	    for (int i = 0; i < arg1.anInt1926; i++) {
		short i_44_ = arg1.aShortArray1933[i];
		if (arg5 == null || arg5[i_44_] == arg6
		    || arg0.anIntArray3169[i_44_] == 0) {
		    short i_45_ = arg1.aShortArray1929[i];
		    if (i_45_ != -1) {
			int i_46_ = arg8 & arg0.anIntArray3161[i_45_];
			if (i_46_ != 65535)
			    method1835(0, arg0.anIntArrayArray3160[i_45_], 0,
				       0, 0, arg7, i_46_, arg9);
			else
			    method1828(0, arg0.anIntArrayArray3160[i_45_], 0,
				       0, 0, arg7);
		    }
		    int i_47_ = arg8 & arg0.anIntArray3161[i_44_];
		    if (i_47_ != 65535)
			method1835(arg0.anIntArray3169[i_44_],
				   arg0.anIntArrayArray3160[i_44_],
				   arg1.aShortArray1932[i],
				   arg1.aShortArray1934[i],
				   arg1.aShortArray1940[i], arg7, i_47_, arg9);
		    else
			method1828(arg0.anIntArray3169[i_44_],
				   arg0.anIntArrayArray3160[i_44_],
				   arg1.aShortArray1932[i],
				   arg1.aShortArray1934[i],
				   arg1.aShortArray1940[i], arg7);
		}
	    }
	} else {
	    int i = 0;
	    int i_48_ = 0;
	    for (int i_49_ = 0; i_49_ < arg0.anInt3163; i_49_++) {
		boolean bool = false;
		if (i < arg1.anInt1926 && arg1.aShortArray1933[i] == i_49_)
		    bool = true;
		boolean bool_50_ = false;
		if (i_48_ < arg2.anInt1926
		    && arg2.aShortArray1933[i_48_] == i_49_)
		    bool_50_ = true;
		if (bool || bool_50_) {
		    if (arg5 != null && arg5[i_49_] != arg6
			&& arg0.anIntArray3169[i_49_] != 0) {
			if (bool)
			    i++;
			if (bool_50_)
			    i_48_++;
		    } else {
			int i_51_ = 0;
			int i_52_ = arg0.anIntArray3169[i_49_];
			if (i_52_ == 3)
			    i_51_ = 128;
			int i_53_;
			int i_54_;
			int i_55_;
			short i_56_;
			byte i_57_;
			if (bool) {
			    i_53_ = arg1.aShortArray1932[i];
			    i_54_ = arg1.aShortArray1934[i];
			    i_55_ = arg1.aShortArray1940[i];
			    i_56_ = arg1.aShortArray1929[i];
			    i_57_ = arg1.aByteArray1938[i];
			    i++;
			} else {
			    i_53_ = i_51_;
			    i_54_ = i_51_;
			    i_55_ = i_51_;
			    i_56_ = (short) -1;
			    i_57_ = (byte) 0;
			}
			int i_58_;
			int i_59_;
			int i_60_;
			short i_61_;
			byte i_62_;
			if (bool_50_) {
			    i_58_ = arg2.aShortArray1932[i_48_];
			    i_59_ = arg2.aShortArray1934[i_48_];
			    i_60_ = arg2.aShortArray1940[i_48_];
			    i_61_ = arg2.aShortArray1929[i_48_];
			    i_62_ = arg2.aByteArray1938[i_48_];
			    i_48_++;
			} else {
			    i_58_ = i_51_;
			    i_59_ = i_51_;
			    i_60_ = i_51_;
			    i_61_ = (short) -1;
			    i_62_ = (byte) 0;
			}
			int i_63_;
			int i_64_;
			int i_65_;
			if ((i_57_ & 0x2) != 0 || (i_62_ & 0x1) != 0) {
			    i_63_ = i_53_;
			    i_64_ = i_54_;
			    i_65_ = i_55_;
			} else if (i_52_ == 2) {
			    int i_66_ = i_58_ - i_53_ & 0x7ff;
			    int i_67_ = i_59_ - i_54_ & 0x7ff;
			    int i_68_ = i_60_ - i_55_ & 0x7ff;
			    if (i_66_ >= 1024)
				i_66_ -= 2048;
			    if (i_67_ >= 1024)
				i_67_ -= 2048;
			    if (i_68_ >= 1024)
				i_68_ -= 2048;
			    i_63_ = i_53_ + i_66_ * arg3 / arg4 & 0x7ff;
			    i_64_ = i_54_ + i_67_ * arg3 / arg4 & 0x7ff;
			    i_65_ = i_55_ + i_68_ * arg3 / arg4 & 0x7ff;
			} else if (i_52_ == 7) {
			    int i_69_ = i_58_ - i_53_ & 0x3f;
			    if (i_69_ >= 32)
				i_69_ -= 64;
			    i_63_ = i_53_ + i_69_ * arg3 / arg4 & 0x3f;
			    i_64_ = i_54_ + (i_59_ - i_54_) * arg3 / arg4;
			    i_65_ = i_55_ + (i_60_ - i_55_) * arg3 / arg4;
			} else {
			    i_63_ = i_53_ + (i_58_ - i_53_) * arg3 / arg4;
			    i_64_ = i_54_ + (i_59_ - i_54_) * arg3 / arg4;
			    i_65_ = i_55_ + (i_60_ - i_55_) * arg3 / arg4;
			}
			if (i_56_ != -1) {
			    int i_70_ = arg8 & arg0.anIntArray3161[i_56_];
			    if (i_70_ != 65535)
				method1835(0, arg0.anIntArrayArray3160[i_56_],
					   0, 0, 0, arg7, i_70_, arg9);
			    else
				method1828(0, arg0.anIntArrayArray3160[i_56_],
					   0, 0, 0, arg7);
			} else if (i_61_ != -1) {
			    int i_71_ = arg8 & arg0.anIntArray3161[i_61_];
			    if (i_71_ != 65535)
				method1835(0, arg0.anIntArrayArray3160[i_61_],
					   0, 0, 0, arg7, i_71_, arg9);
			    else
				method1828(0, arg0.anIntArrayArray3160[i_61_],
					   0, 0, 0, arg7);
			}
			int i_72_ = arg8 & arg0.anIntArray3161[i_49_];
			if (i_72_ != 65535)
			    method1835(i_52_, arg0.anIntArrayArray3160[i_49_],
				       i_63_, i_64_, i_65_, arg7, i_72_, arg9);
			else
			    method1828(i_52_, arg0.anIntArrayArray3160[i_49_],
				       i_63_, i_64_, i_65_, arg7);
		    }
		}
	    }
	}
    }
    
    public abstract void method1841(int i, int i_73_, int i_74_, int i_75_,
				    int i_76_, int i_77_, int i_78_, long l);
    
    public abstract int method1769();
    
    public void method1842(Class67_Sub5_Sub7 arg0, int arg1,
			   Class67_Sub5_Sub7 arg2, int arg3, int arg4,
			   int arg5, boolean arg6) {
	if (arg1 != -1 && method1832()) {
	    Class97 class97 = arg0.aClass97Array4565[arg1];
	    Class67_Sub20 class67_sub20 = class97.aClass67_Sub20_1936;
	    Class97 class97_79_ = null;
	    if (arg2 != null) {
		class97_79_ = arg2.aClass97Array4565[arg3];
		if (class97_79_.aClass67_Sub20_1936 != class67_sub20)
		    class97_79_ = null;
	    }
	    method1840(class67_sub20, class97, class97_79_, arg4, arg5, null,
		       false, arg6, 65535, null);
	    method1843();
	}
    }
    
    public abstract void method1843();
    
    public abstract void method1844(int i, int i_80_, int i_81_, int i_82_);
    
    public abstract void method1845(int i, int i_83_, int i_84_);
    
    public abstract int method1846();
    
    public abstract void method1847(int i);
    
    public abstract void method1848();
    
    public static int method1849(int[][] arg0, int arg1, int arg2) {
	int i = arg1 >> 7;
	int i_85_ = arg2 >> 7;
	if (i < 0 || i_85_ < 0 || i >= arg0.length || i_85_ >= arg0[0].length)
	    return 0;
	int i_86_ = arg1 & 0x7f;
	int i_87_ = arg2 & 0x7f;
	int i_88_
	    = arg0[i][i_85_] * (128 - i_86_) + arg0[i + 1][i_85_] * i_86_ >> 7;
	int i_89_ = ((arg0[i][i_85_ + 1] * (128 - i_86_)
		      + arg0[i + 1][i_85_ + 1] * i_86_)
		     >> 7);
	return i_88_ * (128 - i_87_) + i_89_ * i_87_ >> 7;
    }
    
    public void method1850(Class67_Sub5_Sub7 arg0, int arg1,
			   Class67_Sub5_Sub7 arg2, int arg3, int arg4,
			   int arg5, Class67_Sub5_Sub7 arg6, int arg7,
			   Class67_Sub5_Sub7 arg8, int arg9, int arg10,
			   int arg11, boolean[] arg12, boolean arg13) {
	if (arg1 != -1) {
	    if (arg12 == null || arg7 == -1)
		method1842(arg0, arg1, arg2, arg3, arg4, arg5, arg13);
	    else if (method1832()) {
		Class97 class97 = arg0.aClass97Array4565[arg1];
		Class67_Sub20 class67_sub20 = class97.aClass67_Sub20_1936;
		Class97 class97_90_ = null;
		if (arg2 != null) {
		    class97_90_ = arg2.aClass97Array4565[arg3];
		    if (class97_90_.aClass67_Sub20_1936 != class67_sub20)
			class97_90_ = null;
		}
		Class97 class97_91_ = arg6.aClass97Array4565[arg7];
		Class97 class97_92_ = null;
		if (arg8 != null) {
		    class97_92_ = arg8.aClass97Array4565[arg9];
		    if (class97_92_.aClass67_Sub20_1936 != class67_sub20)
			class97_92_ = null;
		}
		method1840(class67_sub20, class97, class97_90_, arg4, arg5,
			   arg12, false, arg13, 65535, null);
		method1828(0, new int[0], 0, 0, 0, arg13);
		method1840(class67_sub20, class97_91_, class97_92_, arg10,
			   arg11, arg12, true, arg13, 65535, null);
		method1843();
	    }
	}
    }
    
    public void method1851(Class67_Sub5_Sub7 arg0, int arg1,
			   Class67_Sub5_Sub7 arg2, int arg3, int arg4,
			   int arg5, int arg6, boolean arg7, int[] arg8) {
	if (arg1 != -1 && method1832()) {
	    Class97 class97 = arg0.aClass97Array4565[arg1];
	    Class67_Sub20 class67_sub20 = class97.aClass67_Sub20_1936;
	    Class97 class97_93_ = null;
	    if (arg2 != null) {
		class97_93_ = arg2.aClass97Array4565[arg3];
		if (class97_93_.aClass67_Sub20_1936 != class67_sub20)
		    class97_93_ = null;
	    }
	    method1840(class67_sub20, class97, class97_93_, arg4, arg5, null,
		       false, arg7, arg6, arg8);
	    method1843();
	}
    }
    
    public abstract int method1852();
    
    public abstract Class131_Sub6 method1853(boolean bool, boolean bool_94_,
					     boolean bool_95_);
    
    public void method1854(Class67_Sub5_Sub7 arg0, int arg1) {
	if (arg1 != -1 && method1832()) {
	    Class97 class97 = arg0.aClass97Array4565[arg1];
	    Class67_Sub20 class67_sub20 = class97.aClass67_Sub20_1936;
	    for (int i = 0; i < class97.anInt1926; i++) {
		short i_96_ = class97.aShortArray1933[i];
		if (class67_sub20.aBooleanArray3172[i_96_]) {
		    if (class97.aShortArray1929[i] != -1)
			method1844(0, 0, 0, 0);
		    method1844(class67_sub20.anIntArray3169[i_96_],
			       class97.aShortArray1932[i],
			       class97.aShortArray1934[i],
			       class97.aShortArray1940[i]);
		}
	    }
	    method1843();
	}
    }
    
    public abstract void method1855(int i);
    
    public abstract Class131_Sub6 method1856(boolean bool, boolean bool_97_,
					     boolean bool_98_);
}
