public class Class131_Sub7_Sub1 extends Class131_Sub7
{
    public static RSString[] aRSStringArray5043 = new RSString[8];
    public static int anInt5044;
    public static int anInt5045;
    public static int anInt5046;
    public Class64 aClass64_5047;
    public static RSString aRSString_5048
	= Class134.method1914("Untersuchen", (byte) 22);
    public static int anInt5049;
    public static int anInt5050;
    public static int anInt5051;
    public static int anInt5052;
    public static int anInt5053;
    public static int anInt5054;
    public static int anInt5055;
    public static boolean aBoolean5056 = false;
    public static int anInt5057;
    
    public void finalize() {
	anInt5052++;
    }
    
    public static Class88 method1888(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null)
	    return null;
	Class88 class88 = class67_sub24.aClass88_3220;
	class67_sub24.aClass88_3220 = null;
	return class88;
    }
    
    public int method1769() {
	anInt5057++;
	return anInt3776;
    }
    
    public int getPlayerAnims(int arg0) {
	anInt5055++;
	if (arg0 != 0)
	    method1890(true);
	if ((Class69.anInt1381 ^ 0xffffffff) != -1 && aClass64_5047.anIntArray1208 != null) {
	    Class64 class64 = aClass64_5047.method578(-1);
	    if (class64 != null && (class64.anInt1189 ^ 0xffffffff) != 0)
		return class64.anInt1189;
	}
	return playerAnims;
    }
    
    public static void method1889(int arg0, int arg1, int arg2, byte arg3,
				  int arg4, int arg5) {
	anInt5050++;
	if (arg3 >= 122) {
	    for (int i = arg2; i <= arg4 + arg2; i++) {
		for (int i_0_ = arg0;
		     (arg0 - -arg1 ^ 0xffffffff) <= (i_0_ ^ 0xffffffff);
		     i_0_++) {
		    if ((i_0_ ^ 0xffffffff) <= -1 && (i_0_ ^ 0xffffffff) > -105
			&& (i ^ 0xffffffff) <= -1 && i < 104)
			Class73.aByteArrayArrayArray1480[arg5][i_0_][i]
			    = (byte) 127;
		}
	    }
	    for (int i = arg2; i < arg4 + arg2; i++) {
		for (int i_1_ = arg0; i_1_ < arg1 + arg0; i_1_++) {
		    if (i_1_ >= 0 && i_1_ < 104 && (i ^ 0xffffffff) <= -1
			&& i < 104)
			Class136.anIntArrayArrayArray2496[arg5][i_1_][i]
			    = ((arg5 ^ 0xffffffff) < -1
			       ? (Class136.anIntArrayArrayArray2496[arg5 + -1]
				  [i_1_][i])
			       : 0);
		}
	    }
	    if ((arg0 ^ 0xffffffff) < -1 && (arg0 ^ 0xffffffff) > -105) {
		for (int i = arg2 + 1;
		     (i ^ 0xffffffff) > (arg2 - -arg4 ^ 0xffffffff); i++) {
		    if ((i ^ 0xffffffff) <= -1 && i < 104)
			Class136.anIntArrayArrayArray2496[arg5][arg0][i]
			    = (Class136.anIntArrayArrayArray2496[arg5]
			       [arg0 + -1][i]);
		}
	    }
	    if ((arg2 ^ 0xffffffff) < -1 && (arg2 ^ 0xffffffff) > -105) {
		for (int i = 1 + arg0; arg1 + arg0 > i; i++) {
		    if ((i ^ 0xffffffff) <= -1 && (i ^ 0xffffffff) > -105)
			Class136.anIntArrayArrayArray2496[arg5][i][arg2]
			    = (Class136.anIntArrayArrayArray2496[arg5][i]
			       [arg2 + -1]);
		}
	    }
	    if ((arg0 ^ 0xffffffff) <= -1 && arg2 >= 0 && arg0 < 104
		&& arg2 < 104) {
		if (arg5 == 0) {
		    if ((arg0 ^ 0xffffffff) >= -1
			|| ((Class136.anIntArrayArrayArray2496[arg5][-1 + arg0]
			     [arg2])
			    ^ 0xffffffff) == -1) {
			if (arg2 <= 0 || ((Class136.anIntArrayArrayArray2496
					   [arg5][arg0][arg2 - 1])
					  ^ 0xffffffff) == -1) {
			    if (arg0 > 0 && arg2 > 0
				&& (Class136.anIntArrayArrayArray2496[arg5]
				    [arg0 - 1][-1 + arg2]) != 0)
				Class136.anIntArrayArrayArray2496[arg5]
				    [arg0][arg2]
				    = (Class136.anIntArrayArrayArray2496[arg5]
				       [-1 + arg0][-1 + arg2]);
			} else
			    Class136.anIntArrayArrayArray2496[arg5][arg0][arg2]
				= (Class136.anIntArrayArrayArray2496[arg5]
				   [arg0][-1 + arg2]);
		    } else
			Class136.anIntArrayArrayArray2496[arg5][arg0][arg2]
			    = (Class136.anIntArrayArrayArray2496[arg5]
			       [arg0 + -1][arg2]);
		} else if ((arg0 ^ 0xffffffff) >= -1
			   || (((Class136.anIntArrayArrayArray2496[arg5]
				 [arg0 + -1][arg2])
				^ 0xffffffff)
			       == ((Class136.anIntArrayArrayArray2496[arg5 - 1]
				    [-1 + arg0][arg2])
				   ^ 0xffffffff))) {
		    if ((arg2 ^ 0xffffffff) >= -1
			|| ((Class136.anIntArrayArrayArray2496[arg5 - 1][arg0]
			     [-1 + arg2])
			    == (Class136.anIntArrayArrayArray2496[arg5][arg0]
				[-1 + arg2]))) {
			if ((arg0 ^ 0xffffffff) < -1 && arg2 > 0
			    && ((Class136.anIntArrayArrayArray2496[arg5]
				 [arg0 - 1][-1 + arg2])
				!= (Class136.anIntArrayArrayArray2496[arg5 - 1]
				    [arg0 + -1][-1 + arg2])))
			    Class136.anIntArrayArrayArray2496[arg5][arg0][arg2]
				= (Class136.anIntArrayArrayArray2496[arg5]
				   [-1 + arg0][-1 + arg2]);
		    } else
			Class136.anIntArrayArrayArray2496[arg5][arg0][arg2]
			    = (Class136.anIntArrayArrayArray2496[arg5][arg0]
			       [arg2 + -1]);
		} else
		    Class136.anIntArrayArrayArray2496[arg5][arg0][arg2]
			= (Class136.anIntArrayArrayArray2496[arg5][arg0 - 1]
			   [arg2]);
	    }
	}
    }
    
    public static void method1890(boolean arg0) {
	aRSString_5048 = null;
	if (arg0 != true)
	    aRSString_5048 = null;
	aRSStringArray5043 = null;
    }
    
    public void method1764(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8, int arg9,
			   Class61_Sub1 arg10) {
	anInt5045++;
	if (aClass64_5047 != null) {
	    Class41 class41 = (anInt3735 != -1 && anInt3792 == 0
			       ? Class120.method1666(anInt3735, -32) : null);
	    Class41 class41_2_
		= (((anInt3720 ^ 0xffffffff) == 0
		    || ((anInt3720 ^ 0xffffffff)
			== (this.method1880((byte) -87).anInt1797
			    ^ 0xffffffff)) && class41 != null)
		   ? null : Class120.method1666(anInt3720, -32));
	    Class131_Sub6 class131_sub6
		= aClass64_5047.method570(aClass21Array3749, anInt3783,
					  class41, anInt3717, anInt3704,
					  anInt3741, (byte) -105, anInt3722,
					  anInt3758, class41_2_);
	    if (class131_sub6 != null) {
		anInt3776 = class131_sub6.method1769();
		Class64 class64 = aClass64_5047;
		if (class64.anIntArray1208 != null)
		    class64 = class64.method578(-1);
		if (Class67_Sub5_Sub9.aBoolean4614 && class64.aBoolean1234) {
		    Class131_Sub6 class131_sub6_3_
			= (Class72.method1346
			   (anInt3726, aClass64_5047.anInt1211, class131_sub6,
			    aClass64_5047.aByte1192, aClass64_5047.aShort1184,
			    true, aClass64_5047.aShort1216,
			    class41_2_ == null ? class41 : class41_2_,
			    anInt3733, aBoolean3699, arg0,
			    aClass64_5047.aByte1186,
			    class41_2_ != null ? anInt3758 : anInt3783,
			    anInt3715));
		    class131_sub6_3_.method1764(0, arg1, arg2, arg3, arg4,
						arg5, arg6, arg7, -1L, arg9,
						aClass61_Sub1_3732);
		}
		Class131_Sub6 class131_sub6_4_ = null;
		this.method1884((byte) 123, class131_sub6);
		this.method1873(arg0, class131_sub6, true);
		if ((anInt3739 ^ 0xffffffff) != 0
		    && (anInt3745 ^ 0xffffffff) != 0) {
		    Class81 class81
			= Class67_Sub1.method622(-17177, anInt3739);
		    class131_sub6_4_
			= class81.method1428(anInt3780, (byte) -50, anInt3712,
					     anInt3745);
		    if (class131_sub6_4_ != null) {
			class131_sub6_4_.method1837(0, -anInt3760, 0);
			if (class81.aBoolean1634) {
			    if (Class124.anInt2324 != 0)
				class131_sub6_4_
				    .method1847(Class124.anInt2324);
			    if (Class131.anInt2425 != 0)
				class131_sub6_4_
				    .method1836(Class131.anInt2425);
			    if ((Class102.anInt2005 ^ 0xffffffff) != -1)
				class131_sub6_4_
				    .method1837(0, Class102.anInt2005, 0);
			}
		    }
		}
		if (class131_sub6_4_ != null)
		    class131_sub6 = ((Class131_Sub6_Sub1) class131_sub6)
					.method1857(class131_sub6_4_);
		if ((aClass64_5047.anInt1211 ^ 0xffffffff) == -2)
		    class131_sub6.aBoolean3690 = true;
		class131_sub6.method1764(arg0, arg1, arg2, arg3, arg4, arg5,
					 arg6, arg7, arg8, arg9,
					 aClass61_Sub1_3732);
	    }
	}
    }
    
    public void method1891(byte arg0, Class64 arg1) {
	anInt5044++;
	aClass64_5047 = arg1;
	if (arg0 != -51)
	    method1771(-58, 68, 22, 12, -50);
	if (aClass61_Sub1_3732 != null)
	    aClass61_Sub1_3732.method559();
    }
    
    public void method1771(int arg0, int arg1, int arg2, int arg3, int arg4) {
	anInt5054++;
	if (aClass64_5047 != null) {
	    /* empty */
	}
    }
    
    public static void method1892(int arg0, int arg1, int arg2, int arg3,
				  boolean arg4) {
	if (arg4 != false)
	    aRSString_5048 = null;
	int i = 0;
	Class67_Sub1_Sub11.method665(2, arg1 + -arg2,
				     Class67_Sub29.anIntArrayArray3338[arg0],
				     arg2 + arg1, arg3);
	anInt5049++;
	int i_5_ = arg2;
	int i_6_ = -arg2;
	int i_7_ = -1;
	while ((i ^ 0xffffffff) > (i_5_ ^ 0xffffffff)) {
	    i++;
	    i_7_ += 2;
	    i_6_ += i_7_;
	    if ((i_6_ ^ 0xffffffff) <= -1) {
		i_5_--;
		i_6_ -= i_5_ << 1886495489;
		int[] is = Class67_Sub29.anIntArrayArray3338[i_5_ + arg0];
		int[] is_8_ = Class67_Sub29.anIntArrayArray3338[arg0 + -i_5_];
		int i_9_ = -i + arg1;
		int i_10_ = i + arg1;
		Class67_Sub1_Sub11.method665(2, i_9_, is, i_10_, arg3);
		Class67_Sub1_Sub11.method665(2, i_9_, is_8_, i_10_, arg3);
	    }
	    int i_11_ = arg1 - -i_5_;
	    int[] is = Class67_Sub29.anIntArrayArray3338[i + arg0];
	    int i_12_ = arg1 - i_5_;
	    int[] is_13_ = Class67_Sub29.anIntArrayArray3338[arg0 - i];
	    Class67_Sub1_Sub11.method665(2, i_12_, is, i_11_, arg3);
	    Class67_Sub1_Sub11.method665(2, i_12_, is_13_, i_11_, arg3);
	}
    }
    
    public boolean method1878(byte arg0) {
	if (arg0 != 62)
	    aRSStringArray5043 = null;
	anInt5046++;
	if (aClass64_5047 == null)
	    return false;
	return true;
    }
}
