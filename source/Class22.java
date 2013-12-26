public class Class22
{
    public static int anInt526;
    public int[] playerEquipment;
    public static int anInt528;
    public static int anInt529;
    public static int anInt530;
    public static int anInt531;
    public static RSString aRSString_532
	= Class134.method1914("Continuer", (byte) 70);
    public static int anInt533;
    public int pAnims;
    public static int anInt535;
    public int anInt536;
    public static int anInt537;
    public boolean aBoolean538;
    public static int anInt539;
    public long aLong540;
    public static int anInt541;
    public static int anInt542;
    public static int anInt543;
    public static int anInt544;
    public long aLong545;
    public static int anInt546;
    public static int anInt547;
    public static int anInt548;
    public static int[] anIntArray549
	= { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1 };
    public int[][] anIntArrayArray550;
    public int[] playerColour;
    public static int anInt552;
    
    public static void method200(int arg0, boolean arg1) {
	if (arg1 == true) {
	    anInt544++;
	    Class137.aClass136_2508.method1920(arg0, 86);
	}
    }
    
    public Class131_Sub6 method201(int arg0, int arg1, Class41 arg2, int arg3,  boolean arg4, Class21[] arg5, int arg6,  int arg7, boolean arg8, Class41 arg9,  int arg10) {
	try {
	    anInt529++;
	    if ((anInt536 ^ 0xffffffff) != 0)
		return Class133.method1908(anInt536, -36).method570(arg5, arg3, arg2, arg6, arg1, arg7,(byte) -90, arg10, arg0, arg9);
	    int[] is = playerEquipment;
	    long l = aLong540;
	    if (arg2 != null && ((arg2.anInt883 ^ 0xffffffff) <= -1 || arg2.anInt866 >= 0)) {
		is = new int[12];
		for (int i = 0; i < 12; i++)
		    is[i] = playerEquipment[i];
		if (arg2.anInt883 >= 0) {
		    if ((arg2.anInt883 ^ 0xffffffff) != -65536) {
		    	is[5] = Class67_Sub20.method1273(1073741824, arg2.anInt883);
		    	l ^= (long) is[5] << 2011479584;
		    } else {
		    	l ^= ~0xffffffffL;
		    	is[5] = 0;
		    }
		}
		if ((arg2.anInt866 ^ 0xffffffff) <= -1) {
		    if ((arg2.anInt866 ^ 0xffffffff) == -65536) {
			l ^= 0xffffffffL;
			is[3] = 0;
		    } else {
			is[3] = Class67_Sub20.method1273(arg2.anInt866,  1073741824);
			l ^= (long) is[3];
		    }
		}
	    }
	    Class131_Sub6 class131_sub6
		= ((Class131_Sub6)
		   Class67_Sub1_Sub37.aClass136_4388.method1924(l, false));
	    if (class131_sub6 == null) {
		boolean bool = false;
		for (int i = 0; (i ^ 0xffffffff) > -13; i++) {
		    int i_0_ = is[i];
		    if ((i_0_ & 0x40000000 ^ 0xffffffff) == -1) {
			if ((~0x7fffffff & i_0_) != 0
			    && !Class58.method492(i_0_ & 0x3fffffff, 8629)
				    .method417(arg4))
			    bool = true;
		    } else if (!PacketParser.method1596
				    (0x3fffffff & i_0_, -28322)
				    .method1392(aBoolean538, 0))
			bool = true;
		}
		if (bool) {
		    if ((aLong545 ^ 0xffffffffffffffffL) != 0L)
			class131_sub6
			    = (Class131_Sub6) Class67_Sub1_Sub37
						  .aClass136_4388
						  .method1924(aLong545, false);
		    if (class131_sub6 == null)
			return null;
		}
		if (class131_sub6 == null) {
		    Class131_Sub2[] class131_sub2s = new Class131_Sub2[12];
		    for (int i = 0; i < 12; i++) {
			int i_1_ = is[i];
			if ((0x40000000 & i_1_ ^ 0xffffffff) == -1) {
			    if ((i_1_ & ~0x7fffffff) != 0) {
				Class131_Sub2 class131_sub2
				    = Class58.method492
					  (i_1_ & 0x3fffffff, 8629)
					  .method418(71);
				if (class131_sub2 != null)
				    class131_sub2s[i] = class131_sub2;
			    }
			} else {
			    Class131_Sub2 class131_sub2
				= PacketParser.method1596
				      (i_1_ & 0x3fffffff, -28322)
				      .method1382(false, aBoolean538);
			    if (class131_sub2 != null)
				class131_sub2s[i] = class131_sub2;
			}
		    }
		    Class87 class87 = null;
		    if (pAnims != -1)
			class87 = Class67_Sub5_Sub1.method824(false, pAnims);
		    if (class87 != null
			&& class87.anIntArrayArray1796 != null) {
			for (int i = 0; class87.anIntArrayArray1796.length > i;
			     i++) {
			    if (class87.anIntArrayArray1796[i] != null
				&& class131_sub2s[i] != null) {
				int i_2_ = class87.anIntArrayArray1796[i][0];
				int i_3_ = class87.anIntArrayArray1796[i][2];
				int i_4_ = class87.anIntArrayArray1796[i][3];
				int i_5_ = class87.anIntArrayArray1796[i][4];
				int i_6_ = class87.anIntArrayArray1796[i][1];
				int i_7_ = class87.anIntArrayArray1796[i][5];
				if (anIntArrayArray550 == null)
				    anIntArrayArray550
					= (new int
					   [class87.anIntArrayArray1796.length]
					   []);
				if (anIntArrayArray550[i] == null) {
				    int[] is_8_
					= anIntArrayArray550[i] = new int[15];
				    if ((i_4_ ^ 0xffffffff) == -1
					&& (i_5_ ^ 0xffffffff) == -1
					&& (i_7_ ^ 0xffffffff) == -1) {
					is_8_[12] = -i_2_;
					is_8_[0] = is_8_[4] = is_8_[8] = 32768;
					is_8_[14] = -i_3_;
					is_8_[13] = -i_6_;
				    } else {
					int i_9_ = (Class26.anIntArray612[i_5_]
						    >> 857097505);
					int i_10_
					    = (Class26.anIntArray617[i_4_]
					       >> -566015071);
					int i_11_
					    = (Class26.anIntArray612[i_4_]
					       >> 2086391681);
					int i_12_
					    = (Class26.anIntArray617[i_5_]
					       >> -1272332095);
					int i_13_
					    = (Class26.anIntArray617[i_7_]
					       >> 1112740417);
					int i_14_
					    = (Class26.anIntArray612[i_7_]
					       >> -1187774911);
					is_8_[2] = (i_11_ * i_12_ - -16384
						    >> 2100921935);
					is_8_[8] = (16384 + i_11_ * i_9_
						    >> 568078479);
					int i_15_ = (16384 + i_14_ * i_10_
						     >> -2081767313);
					is_8_[1]
					    = (16384 + -i_13_ * i_9_
					       + i_12_ * i_15_) >> -526164817;
					is_8_[7]
					    = (i_9_ * i_15_ + (-i_12_ * -i_13_
							       + 16384)
					       >> -574319633);
					is_8_[3] = (i_11_ * i_13_ - -16384
						    >> -1940330577);
					int i_16_ = (i_13_ * i_10_ + 16384
						     >> -1301273809);
					is_8_[6]
					    = (16384 + i_16_ * i_9_
					       + i_14_ * -i_12_) >> 1695635215;
					is_8_[5] = -i_10_;
					is_8_[4] = (i_14_ * i_11_ - -16384
						    >> -248317937);
					is_8_[14]
					    = (16384 + (-i_6_ * is_8_[5]
							+ (is_8_[2] * -i_2_
							   - -(is_8_[8]
							       * -i_3_)))
					       >> -1830589265);
					is_8_[13] = (is_8_[7] * -i_3_
						     + (-i_2_ * is_8_[1]
							+ is_8_[4] * -i_6_)
						     - -16384) >> 1651380143;
					is_8_[0]
					    = (i_9_ * i_14_ - -(i_16_ * i_12_)
					       + 16384) >> -30917425;
					is_8_[12]
					    = (-i_2_ * is_8_[0]
					       - (-(-i_6_ * is_8_[3])
						  + (-(-i_3_ * is_8_[6])
						     + -16384))) >> -98324913;
				    }
				    is_8_[11] = i_3_;
				    is_8_[10] = i_6_;
				    is_8_[9] = i_2_;
				}
				if (i_4_ != 0 || (i_5_ ^ 0xffffffff) != -1
				    || i_7_ != 0)
				    class131_sub2s[i].method1799(i_4_, i_5_,
								 i_7_);
				if (i_2_ != 0 || (i_6_ ^ 0xffffffff) != -1
				    || (i_3_ ^ 0xffffffff) != -1)
				    class131_sub2s[i].method1798(i_2_, i_6_,
								 i_3_);
			    }
			}
		    }
		    Class131_Sub2 class131_sub2
			= new Class131_Sub2(class131_sub2s,
					    class131_sub2s.length);
		    for (int i = 0; (i ^ 0xffffffff) > -6; i++) {
			if (playerColour[i]
			    < Class67_Sub5_Sub9.aShortArrayArray4600[i].length)
			    class131_sub2.method1796((Class115.aShortArray2183
						      [i]),
						     (Class67_Sub5_Sub9
						      .aShortArrayArray4600[i]
						      [playerColour[i]]));
			if (playerColour[i]
			    < Class62.aShortArrayArray1157[i].length)
			    class131_sub2.method1796((Class141.aShortArray2555
						      [i]),
						     (Class62
						      .aShortArrayArray1157[i]
						      [playerColour[i]]));
		    }
		    class131_sub6
			= class131_sub2.method1787(64, 850, -30, -50, -30);
		    if (arg8) {
			Class67_Sub1_Sub37.aClass136_4388
			    .method1926(l, class131_sub6, (byte) -71);
			aLong545 = l;
		    }
		}
	    }
	    boolean bool = false;
	    boolean bool_17_ = false;
	    boolean bool_18_ = false;
	    boolean bool_19_ = false;
	    int i = arg5 == null ? 0 : arg5.length;
	    for (int i_20_ = 0; (i ^ 0xffffffff) < (i_20_ ^ 0xffffffff);
		 i_20_++) {
		if (arg5[i_20_] != null) {
		    Class41 class41
			= Class120.method1666(arg5[i_20_].anInt516, -32);
		    if (class41.anIntArray855 != null) {
			bool_17_ = true;
			Class19.aClass41Array492[i_20_] = class41;
			int i_21_ = arg5[i_20_].anInt512;
			int i_22_ = arg5[i_20_].anInt525;
			int i_23_ = class41.anIntArray855[i_22_];
			Class144.aClass67_Sub5_Sub7Array2586[i_20_]
			    = Class96_Sub1.method1508(88,
						      i_23_ >>> -1438553648);
			i_23_ &= 0xffff;
			Class36.anIntArray788[i_20_] = i_23_;
			if (Class144.aClass67_Sub5_Sub7Array2586[i_20_]
			    != null) {
			    bool_18_ |= Class144
					    .aClass67_Sub5_Sub7Array2586[i_20_]
					    .method876(1, i_23_);
			    bool |= Class144.aClass67_Sub5_Sub7Array2586
					[i_20_].method878((byte) -38, i_23_);
			    bool_19_ |= class41.aBoolean885;
			}
			if ((class41.aBoolean877 || Class106.aBoolean2055)
			    && (i_21_ ^ 0xffffffff) != 0
			    && ((i_21_ ^ 0xffffffff)
				> (class41.anIntArray855.length
				   ^ 0xffffffff))) {
			    Class67_Sub12.anIntArray3027[i_20_]
				= class41.anIntArray880[i_22_];
			    Class67_Sub23.anIntArray3191[i_20_]
				= arg5[i_20_].anInt515;
			    int i_24_ = class41.anIntArray855[i_21_];
			    Class67_Sub1_Sub14.aClass67_Sub5_Sub7Array4045
				[i_20_]
				= Class96_Sub1
				      .method1508(115, i_24_ >>> 1085670480);
			    i_24_ &= 0xffff;
			    Class131_Sub7.anIntArray3767[i_20_] = i_24_;
			    if ((Class67_Sub1_Sub14.aClass67_Sub5_Sub7Array4045
				 [i_20_])
				!= null) {
				bool_18_ |= Class67_Sub1_Sub14
						.aClass67_Sub5_Sub7Array4045
						[i_20_].method876(1, i_24_);
				bool |= Class67_Sub1_Sub14
					    .aClass67_Sub5_Sub7Array4045[i_20_]
					    .method878((byte) 110, i_24_);
			    }
			} else {
			    Class67_Sub12.anIntArray3027[i_20_] = 0;
			    Class67_Sub23.anIntArray3191[i_20_] = 0;
			    Class67_Sub1_Sub14.aClass67_Sub5_Sub7Array4045
				[i_20_]
				= null;
			    Class131_Sub7.anIntArray3767[i_20_] = -1;
			}
		    }
		}
	    }
	    if (!bool_17_ && arg2 == null && arg9 == null)
		return class131_sub6;
	    int i_25_ = -1;
	    int i_26_ = 0;
	    int i_27_ = -1;
	    Class67_Sub5_Sub7 class67_sub5_sub7 = null;
	    Class67_Sub5_Sub7 class67_sub5_sub7_28_ = null;
	    if (arg4 != true)
		method207(-48, null);
	    if (arg2 != null) {
		i_25_ = arg2.anIntArray855[arg3];
		int i_29_ = i_25_ >>> -1524493008;
		class67_sub5_sub7 = Class96_Sub1.method1508(117, i_29_);
		i_25_ &= 0xffff;
		if (class67_sub5_sub7 != null) {
		    bool_18_ |= class67_sub5_sub7.method876(1, i_25_);
		    bool |= class67_sub5_sub7.method878((byte) -82, i_25_);
		    bool_19_ |= arg2.aBoolean885;
		}
		if ((arg2.aBoolean877 || Class106.aBoolean2055)
		    && (arg1 ^ 0xffffffff) != 0
		    && arg1 < arg2.anIntArray855.length) {
		    i_26_ = arg2.anIntArray880[arg3];
		    i_27_ = arg2.anIntArray855[arg1];
		    int i_30_ = i_27_ >>> 1994534384;
		    i_27_ &= 0xffff;
		    if (i_30_ == i_29_)
			class67_sub5_sub7_28_ = class67_sub5_sub7;
		    else
			class67_sub5_sub7_28_
			    = Class96_Sub1.method1508(120,
						      i_27_ >>> -436256528);
		    if (class67_sub5_sub7_28_ != null) {
			bool_18_ |= class67_sub5_sub7_28_.method876(1, i_27_);
			bool |= class67_sub5_sub7_28_.method878((byte) 113,
								i_27_);
		    }
		}
	    }
	    Class67_Sub5_Sub7 class67_sub5_sub7_31_ = null;
	    int i_32_ = 0;
	    int i_33_ = -1;
	    int i_34_ = -1;
	    Class67_Sub5_Sub7 class67_sub5_sub7_35_ = null;
	    if (arg9 != null) {
		i_33_ = arg9.anIntArray855[arg0];
		int i_36_ = i_33_ >>> 1788890608;
		i_33_ &= 0xffff;
		class67_sub5_sub7_31_ = Class96_Sub1.method1508(98, i_36_);
		if (class67_sub5_sub7_31_ != null) {
		    bool_18_ |= class67_sub5_sub7_31_.method876(1, i_33_);
		    bool |= class67_sub5_sub7_31_.method878((byte) -7, i_33_);
		    bool_19_ |= arg9.aBoolean885;
		}
		if ((arg9.aBoolean877 || Class106.aBoolean2055) && arg10 != -1
		    && arg10 < arg9.anIntArray855.length) {
		    i_32_ = arg9.anIntArray880[arg0];
		    i_34_ = arg9.anIntArray855[arg10];
		    int i_37_ = i_34_ >>> 875071856;
		    i_34_ &= 0xffff;
		    if ((i_36_ ^ 0xffffffff) == (i_37_ ^ 0xffffffff))
			class67_sub5_sub7_35_ = class67_sub5_sub7_31_;
		    else
			class67_sub5_sub7_35_
			    = Class96_Sub1.method1508(82,
						      i_34_ >>> 1307565808);
		    if (class67_sub5_sub7_35_ != null) {
			bool_18_ |= class67_sub5_sub7_35_.method876(1, i_34_);
			bool |= class67_sub5_sub7_35_.method878((byte) -120,
								i_34_);
		    }
		}
	    }
	    Class131_Sub6 class131_sub6_38_
		= class131_sub6.method1853(!bool, !bool_18_, !bool_19_);
	    int i_39_ = 0;
	    int i_40_ = 1;
	    for (/**/; (i ^ 0xffffffff) < (i_39_ ^ 0xffffffff); i_39_++) {
		if (Class144.aClass67_Sub5_Sub7Array2586[i_39_] != null)
		    class131_sub6_38_.method1851
			(Class144.aClass67_Sub5_Sub7Array2586[i_39_],
			 Class36.anIntArray788[i_39_],
			 Class67_Sub1_Sub14.aClass67_Sub5_Sub7Array4045[i_39_],
			 Class131_Sub7.anIntArray3767[i_39_],
			 Class67_Sub23.anIntArray3191[i_39_] - 1,
			 Class67_Sub12.anIntArray3027[i_39_], i_40_,
			 Class19.aClass41Array492[i_39_].aBoolean885,
			 anIntArrayArray550[i_39_]);
		i_40_ <<= 1;
	    }
	    if (class67_sub5_sub7 == null || class67_sub5_sub7_31_ == null) {
		if (class67_sub5_sub7 != null)
		    class131_sub6_38_.method1842(class67_sub5_sub7, i_25_,
						 class67_sub5_sub7_28_, i_27_,
						 -1 + arg7, i_26_,
						 arg2.aBoolean885);
		else if (class67_sub5_sub7_31_ != null)
		    class131_sub6_38_.method1842(class67_sub5_sub7_31_, i_33_,
						 class67_sub5_sub7_35_, i_34_,
						 -1 + arg6, i_32_,
						 arg9.aBoolean885);
	    } else
		class131_sub6_38_.method1850(class67_sub5_sub7, i_25_,
					     class67_sub5_sub7_28_, i_27_,
					     -1 + arg7, i_26_,
					     class67_sub5_sub7_31_, i_33_,
					     class67_sub5_sub7_35_, i_34_,
					     arg6 + -1, i_32_,
					     arg2.aBooleanArray875,
					     (arg9.aBoolean885
					      | arg2.aBoolean885));
	    for (int i_41_ = 0; (i ^ 0xffffffff) < (i_41_ ^ 0xffffffff);
		 i_41_++) {
		Class144.aClass67_Sub5_Sub7Array2586[i_41_] = null;
		Class67_Sub1_Sub14.aClass67_Sub5_Sub7Array4045[i_41_] = null;
		Class19.aClass41Array492[i_41_] = null;
	    }
	    return class131_sub6_38_;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("cl.K(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ',' + (arg5 != null ? "{...}" : "null") + ','
			+ arg6 + ',' + arg7 + ',' + arg8 + ','
			+ (arg9 != null ? "{...}" : "null") + ',' + arg10
			+ ')'));
	}
    }
    
    public void method202(int arg0, int arg1, int arg2) {
	if (arg0 != 8418)
	    aLong545 = -13L;
	int i = Class108.anIntArray2081[arg1];
	anInt541++;
	if ((playerEquipment[i] ^ 0xffffffff) != -1
	    && Class58.method492(arg2, 8629) != null) {
	    playerEquipment[i] = Class67_Sub20.method1273(arg2, -2147483648);
	    method208(1);
	}
    }
    
    public void method203(int arg0, int arg1, int arg2) {
	anInt539++;
	playerColour[arg1] = arg2;
	method208(arg0);
	if (arg0 != 1)
	    method209(null, -72, 118, -11, -106, -25);
    }
    
    public static void method204(int arg0) {
	anIntArray549 = null;
	if (arg0 == 17158)
	    aRSString_532 = null;
    }
    
    public void method205(boolean arg0, int[] colour, int animations, int[] equipment, int arg4, int arg5) {
	do {
	    try {
		anInt543++;
		if ((animations ^ 0xffffffff) != (pAnims ^ 0xffffffff)) {
		    anIntArrayArray550 = null;
		    pAnims = animations;
		}
		if (equipment == null) {
		    equipment = new int[12];
		    for (int i = 0; (i ^ 0xffffffff) > -9; i++) {
				for (int i_42_ = 0; ((Class131_Sub5.anInt3664 ^ 0xffffffff) < (i_42_ ^ 0xffffffff)); i_42_++) {
				    Class47 class47 = Class58.method492(i_42_, arg4 + 8638);
				    if (class47 != null && !class47.aBoolean955 && (((arg0 ? Class74.anIntArray1497[i] : Class102.anIntArray2004[i]) ^ 0xffffffff) == (class47.anInt973 ^ 0xffffffff))) {
				    	equipment[Class108.anIntArray2081[i]] = Class67_Sub20.method1273(-2147483648, i_42_);
					break;
				    }
				}
		    }
		}
		anInt536 = arg5;
		playerColour = colour;
		playerEquipment = equipment;
		aBoolean538 = arg0;
		method208(1);
		if (arg4 == -9)
		    break;
		method211(-91, -122, null, -55, -46);
	    } catch (RuntimeException runtimeexception) {
	    	throw Class67_Sub1_Sub21.method718(runtimeexception, ("cl.A(" + arg0 + ',' + (colour != null ? "{...}" : "null") + ',' + animations + ',' + (equipment != null ? "{...}" : "null")  + ',' + arg4 + ',' + arg5  + ')'));
	    }
	    break;
	} while (false);
    }
    
    public int method206(int arg0) {
	if (arg0 != 28544)
	    method201(27, -123, null, 118, false, null, 30, 1, false, null, 67);
	anInt552++;
	if ((anInt536 ^ 0xffffffff) == 0)
	    return ((playerEquipment[11] << -2032287995) + (playerColour[0] << -736828615) - -(playerColour[4] << -776139244) + ((playerEquipment[0] << -1295659409) - -(playerEquipment[8] << 1285818442)  + playerEquipment[1]));
	return (Class133.method1908(anInt536, arg0 ^ 0x6ffd).anInt1205 + 305419896);
    }
    
    public static boolean method207(int arg0, RSString arg1) {
	anInt547++;
	if (arg1 == null)
	    return false;
	for (int i = arg0; Class90.anInt1847 > i; i++) {
	    if (arg1.method526(93, Class126_Sub3.aRSStringArray3445[i]))
		return true;
	}
	return false;
    }
    
    public void method208(int arg0) {
	anInt533++;
	long l = aLong540;
	long[] ls = Class64.aLongArray1179;
	aLong540 = -1L;
	if (arg0 == 1) {
	    aLong540 = (aLong540 >>> 1310697032^ ls[(int) (((long) (pAnims >> 704518312) ^ aLong540) & 0xffL)]);
	    aLong540 = (ls[(int) ((aLong540 ^ (long) pAnims) & 0xffL)] ^ aLong540 >>> -581277752);
	    for (int i = 0; (i ^ 0xffffffff) > -13; i++) {
		aLong540 = (aLong540 >>> 2103173384 ^ ls[(int) (0xffL & ((long) (playerEquipment[i] >> 1062889336) ^ aLong540))]);
		aLong540 = (aLong540 >>> 1419113416 ^ ls[(int) (((long) (playerEquipment[i] >> 1531013264) ^ aLong540) & 0xffL)]);
		aLong540 = (aLong540 >>> -1089478520 ^ ls[(int) (((long) (playerEquipment[i] >> 1206603976) ^ aLong540) & 0xffL)]);
		aLong540 = (aLong540 >>> -1051363384 ^ ls[(int) (0xffL & (aLong540 ^ (long) playerEquipment[i]))]);
	    }
	    for (int i = 0; (i ^ 0xffffffff) > -6; i++)
		aLong540 = (aLong540 >>> 83659080 ^ ls[(int) (((long) playerColour[i] ^ aLong540) & 0xffL)]);
	    aLong540 = ls[(int) (0xffL & ((long) (!aBoolean538 ? 0 : 1) ^ aLong540))] ^ aLong540 >>> -942028472;
	    if (l != 0L && (aLong540 ^ 0xffffffffffffffffL) != (l ^ 0xffffffffffffffffL))
		Class67_Sub1_Sub37.aClass136_4388.method1919(l, (byte) 111);
	}
    }
    
    public static void method209(Class67_Sub10 arg0, int arg1, int arg2,
				 int arg3, int arg4, int arg5) {
	anInt546++;
	if ((arg0.anInt3008 ^ 0xffffffff) != 0
	    || arg0.anIntArray2985 != null) {
	    int i = 0;
	    if (arg1 > arg0.anInt2996)
		i += -arg0.anInt2996 + arg1;
	    else if (arg0.anInt2997 > arg1)
		i += -arg1 + arg0.anInt2997;
	    if ((arg0.anInt2999 ^ 0xffffffff) > (arg3 ^ 0xffffffff))
		i += -arg0.anInt2999 + arg3;
	    else if (arg3 < arg0.anInt3007)
		i += -arg3 + arg0.anInt3007;
	    if (arg0.anInt2995 == arg4
		|| (arg0.anInt2995 ^ 0xffffffff) > (i + -64 ^ 0xffffffff)
		|| Class27.anInt644 == 0 || arg5 != arg0.anInt3006) {
		if (arg0.aClass67_Sub11_Sub3_2994 != null) {
		    Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
			.method1133(arg0.aClass67_Sub11_Sub3_2994);
		    arg0.aClass67_Sub11_Sub3_2994 = null;
		}
		if (arg0.aClass67_Sub11_Sub3_3004 != null) {
		    Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
			.method1133(arg0.aClass67_Sub11_Sub3_3004);
		    arg0.aClass67_Sub11_Sub3_3004 = null;
		}
	    } else {
		i -= 64;
		if ((i ^ 0xffffffff) > -1)
		    i = 0;
		int i_43_ = (Class27.anInt644 * (-i + arg0.anInt2995)
			     / arg0.anInt2995);
		if (arg0.aClass67_Sub11_Sub3_2994 != null)
		    arg0.aClass67_Sub11_Sub3_2994.method1166(i_43_);
		else if (arg0.anInt3008 >= 0) {
		    Class135 class135
			= Class135.method1918(PacketParser.aClass9_2113,
					      arg0.anInt3008, 0);
		    if (class135 != null) {
			Class67_Sub13_Sub1 class67_sub13_sub1
			    = class135.method1916()
				  .method1222(Class10.aClass54_401);
			Class67_Sub11_Sub3 class67_sub11_sub3
			    = Class67_Sub11_Sub3.method1147(class67_sub13_sub1,
							    100, i_43_);
			class67_sub11_sub3.method1142(-1);
			Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
			    .method1132(class67_sub11_sub3);
			arg0.aClass67_Sub11_Sub3_2994 = class67_sub11_sub3;
		    }
		}
		if (arg0.aClass67_Sub11_Sub3_3004 != null) {
		    arg0.aClass67_Sub11_Sub3_3004.method1166(i_43_);
		    if (!arg0.aClass67_Sub11_Sub3_3004.method605((byte) -96))
			arg0.aClass67_Sub11_Sub3_3004 = null;
		} else if (arg0.anIntArray2985 != null
			   && ((arg0.anInt2988 -= arg2) ^ 0xffffffff) >= -1) {
		    int i_44_ = (int) (Math.random()
				       * (double) arg0.anIntArray2985.length);
		    Class135 class135
			= Class135.method1918(PacketParser.aClass9_2113,
					      arg0.anIntArray2985[i_44_], 0);
		    if (class135 != null) {
			Class67_Sub13_Sub1 class67_sub13_sub1
			    = class135.method1916()
				  .method1222(Class10.aClass54_401);
			Class67_Sub11_Sub3 class67_sub11_sub3
			    = Class67_Sub11_Sub3.method1147(class67_sub13_sub1,
							    100, i_43_);
			class67_sub11_sub3.method1142(0);
			Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
			    .method1132(class67_sub11_sub3);
			arg0.aClass67_Sub11_Sub3_3004 = class67_sub11_sub3;
			arg0.anInt2988
			    = ((int) (Math.random()
				      * (double) (arg0.anInt2990
						  + -arg0.anInt2989))
			       + arg0.anInt2989);
		    }
		}
	    }
	}
    }
    
    public Class131_Sub6 method210(Class41 arg0, int arg1, int arg2, int arg3,
				   int arg4, int arg5, byte arg6, int arg7) {
	long l = ((long) arg5
		  | ((long) (arg4 << 359610192) | (long) arg2 << -1082156448));
	Class131_Sub6 class131_sub6
	    = (Class131_Sub6) Class33_Sub2.aClass136_2775.method1924(l, false);
	anInt531++;
	if (arg6 > -102)
	    method205(false, null, 54, null, 63, 38);
	if (class131_sub6 == null) {
	    Class131_Sub2[] class131_sub2s = new Class131_Sub2[3];
	    int i = 0;
	    if (Class58.method492(arg5, 8629).method412((byte) -83)
		&& Class58.method492(arg4, 8629).method412((byte) -103)
		&& Class58.method492(arg2, 8629).method412((byte) -98)) {
		Class131_Sub2 class131_sub2
		    = Class58.method492(arg5, 8629).method411(9961);
		if (class131_sub2 != null)
		    class131_sub2s[i++] = class131_sub2;
		class131_sub2 = Class58.method492(arg4, 8629).method411(9961);
		if (class131_sub2 != null)
		    class131_sub2s[i++] = class131_sub2;
		class131_sub2 = Class58.method492(arg2, 8629).method411(9961);
		if (class131_sub2 != null)
		    class131_sub2s[i++] = class131_sub2;
		class131_sub2 = new Class131_Sub2(class131_sub2s, i);
		for (int i_45_ = 0; i_45_ < 5; i_45_++) {
		    if (playerColour[i_45_]
			< Class67_Sub5_Sub9.aShortArrayArray4600[i_45_].length)
			class131_sub2.method1796((Class115.aShortArray2183
						  [i_45_]),
						 (Class67_Sub5_Sub9
						  .aShortArrayArray4600[i_45_]
						  [playerColour[i_45_]]));
		    if ((Class62.aShortArrayArray1157[i_45_].length
			 ^ 0xffffffff)
			< (playerColour[i_45_] ^ 0xffffffff))
			class131_sub2.method1796((Class141.aShortArray2555
						  [i_45_]),
						 (Class62.aShortArrayArray1157
						  [i_45_]
						  [playerColour[i_45_]]));
		}
		class131_sub6
		    = class131_sub2.method1787(64, 768, -50, -10, -50);
		Class33_Sub2.aClass136_2775.method1926(l, class131_sub6,
						       (byte) -71);
	    } else
		return null;
	}
	if (arg0 != null)
	    class131_sub6
		= arg0.method358(arg3, arg7, class131_sub6, -20002, arg1);
	return class131_sub6;
    }
    
    public Class131_Sub6 method211(int arg0, int arg1, Class41 arg2, int arg3,
				   int arg4) {
	anInt542++;
	if (anInt536 != -1)
	    return Class133.method1908(anInt536, 123).method573(arg2, arg0, 82,
								arg3, arg1);
	Class131_Sub6 class131_sub6
	    = ((Class131_Sub6)
	       Class33_Sub2.aClass136_2775.method1924(aLong540, false));
	if (class131_sub6 == null) {
	    boolean bool = false;
	    for (int i = 0; i < 12; i++) {
		int i_46_ = playerEquipment[i];
		if ((0x40000000 & i_46_) != 0) {
		    if (!PacketParser.method1596(i_46_ & 0x3fffffff, -28322)
			     .method1395(-13617, aBoolean538))
			bool = true;
		} else if ((i_46_ & ~0x7fffffff) != 0
			   && !Class58.method492(i_46_ & 0x3fffffff, 8629)
				   .method412((byte) -85))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class131_Sub2[] class131_sub2s = new Class131_Sub2[12];
	    int i = 0;
	    for (int i_47_ = 0; (i_47_ ^ 0xffffffff) > -13; i_47_++) {
		int i_48_ = playerEquipment[i_47_];
		if ((i_48_ & 0x40000000 ^ 0xffffffff) != -1) {
		    Class131_Sub2 class131_sub2
			= PacketParser.method1596(i_48_ & 0x3fffffff, -28322)
			      .method1388(aBoolean538, 0);
		    if (class131_sub2 != null)
			class131_sub2s[i++] = class131_sub2;
		} else if ((~0x7fffffff & i_48_ ^ 0xffffffff) != -1) {
		    Class131_Sub2 class131_sub2
			= Class58.method492(0x3fffffff & i_48_, 8629)
			      .method411(9961);
		    if (class131_sub2 != null)
			class131_sub2s[i++] = class131_sub2;
		}
	    }
	    Class131_Sub2 class131_sub2 = new Class131_Sub2(class131_sub2s, i);
	    for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -6; i_49_++) {
		if ((playerColour[i_49_] ^ 0xffffffff)
		    > (Class67_Sub5_Sub9.aShortArrayArray4600[i_49_].length
		       ^ 0xffffffff))
		    class131_sub2.method1796(Class115.aShortArray2183[i_49_],
					     (Class67_Sub5_Sub9
					      .aShortArrayArray4600[i_49_]
					      [playerColour[i_49_]]));
		if (playerColour[i_49_]
		    < Class62.aShortArrayArray1157[i_49_].length)
		    class131_sub2.method1796(Class141.aShortArray2555[i_49_],
					     (Class62.aShortArrayArray1157
					      [i_49_][playerColour[i_49_]]));
	    }
	    class131_sub6 = class131_sub2.method1787(64, 768, -50, -10, -50);
	    Class33_Sub2.aClass136_2775.method1926(aLong540, class131_sub6,
						   (byte) -71);
	}
	int i = 54 % ((1 - arg4) / 39);
	if (arg2 != null)
	    class131_sub6
		= arg2.method358(arg3, arg0, class131_sub6, -20002, arg1);
	return class131_sub6;
    }
    
    public void method212(boolean arg0, byte arg1) {
	anInt528++;
	if (arg1 >= -3)
	    anIntArray549 = null;
	aBoolean538 = arg0;
	method208(1);
    }
}
