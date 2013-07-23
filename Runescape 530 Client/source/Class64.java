/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class64
{
    public int anInt1173;
    public int anInt1174;
    public short[] aShortArray1175;
    public static int anInt1176;
    public static int anInt1177;
    public int anInt1178 = 128;
    public static long[] aLongArray1179 = new long[256];
    public static RSString aRSString_1180
	= Class134.method1914("scape main", (byte) 50);
    public int anInt1181;
    public static int anInt1182;
    public static int anInt1183;
    public short aShort1184;
    public static int anInt1185;
    public byte aByte1186 = -96;
    public int anInt1187;
    public static int anInt1188;
    public int anInt1189;
    public RSString npcName;
    public int anInt1191;
    public byte aByte1192;
    public int anInt1193;
    public static int anInt1194;
    public short[] aShortArray1195;
    public boolean aBoolean1196;
    public int anInt1197;
    public int anInt1198;
    public static int anInt1199;
    public int anInt1200;
    public int[][] anIntArrayArray1201;
    public int[] anIntArray1202;
    public int anInt1203;
    public RSString[] npcOptions;
    public int anInt1205;
    public int anInt1206;
    public static int anInt1207;
    public int[] anIntArray1208;
    public byte aByte1209;
    public short[] aShortArray1210;
    public int anInt1211;
    public static int anInt1212;
    public int anInt1213;
    public int anInt1214;
    public Class92 aClass92_1215;
    public short aShort1216;
    public static int anInt1217;
    public int anInt1218;
    public byte aByte1219;
    public int anInt1220;
    public static boolean aBoolean1221 = true;
    public int anInt1222;
    public int anInt1223;
    public static short aShort1224 = 256;
    public byte[] aByteArray1225;
    public short[] aShortArray1226;
    public int anInt1227;
    public static int anInt1228;
    public static int anInt1229;
    public int anInt1230;
    public boolean aBoolean1231;
    public boolean aBoolean1232;
    public int[][] anIntArrayArray1233;
    public boolean aBoolean1234;
    public boolean aBoolean1235;
    public int anInt1236;
    public int anInt1237;
    public int[] anIntArray1238;
    public static RSString aRSString_1239;
    
    public RSString method568(RSString arg0, int arg1, int arg2) {
	anInt1229++;
	if (aClass92_1215 == null)
	    return arg0;
	Class67_Sub29 class67_sub29
	    = ((Class67_Sub29)
	       aClass92_1215.method1489((byte) -26, (long) arg1));
	if (arg2 != 3)
	    anInt1220 = -118;
	if (class67_sub29 == null)
	    return arg0;
	return class67_sub29.musicName;
    }
    
    public static RSString method569(int arg0, byte arg1) {
	anInt1182++;
	if (arg1 < 87)
	    return null;
	if ((Class102.aRSStringArray1998[arg0].method531((byte) 119)
	     ^ 0xffffffff)
	    < -1)
	    return (Class67_Sub1_Sub27.method744
		    (new RSString[] { Class8.aRSStringArray340[arg0],
				     Class67_Sub1_Sub16_Sub1.aRSString_5096,
				     Class102.aRSStringArray1998[arg0] },
		     -100));
	return Class8.aRSStringArray340[arg0];
    }
    
    public Class131_Sub6 method570(Class21[] arg0, int arg1, Class41 arg2,
				   int arg3, int arg4, int arg5, byte arg6,
				   int arg7, int arg8, Class41 arg9) {
	try {
	    anInt1183++;
	    if (anIntArray1208 != null) {
		Class64 class64 = method578(-1);
		if (class64 == null)
		    return null;
		return class64.method570(arg0, arg1, arg2, arg3, arg4, arg5,
					 (byte) -86, arg7, arg8, arg9);
	    }
	    Class131_Sub6 class131_sub6
		= ((Class131_Sub6)
		   Class133.aClass136_2456.method1924((long) anInt1205,
						      false));
	    if (class131_sub6 == null) {
		boolean bool = false;
		for (int i = 0;
		     (i ^ 0xffffffff) > (anIntArray1238.length ^ 0xffffffff);
		     i++) {
		    if ((anIntArray1238[i] ^ 0xffffffff) != 0
			&& !Class67_Sub1_Sub19.aClass9_4136
				.method117(true, anIntArray1238[i], 0))
			bool = true;
		}
		if (bool)
		    return null;
		Class131_Sub2[] class131_sub2s
		    = new Class131_Sub2[anIntArray1238.length];
		for (int i = 0; anIntArray1238.length > i; i++) {
		    if (anIntArray1238[i] != -1) {
			class131_sub2s[i]
			    = Class131_Sub2.method1780((Class67_Sub1_Sub19
							.aClass9_4136),
						       anIntArray1238[i], 0);
			if (anIntArrayArray1201 != null
			    && anIntArrayArray1201[i] != null
			    && class131_sub2s[i] != null)
			    class131_sub2s[i].method1798
				(anIntArrayArray1201[i][0],
				 anIntArrayArray1201[i][1],
				 anIntArrayArray1201[i][2]);
		    }
		}
		Class87 class87 = null;
		if ((anInt1189 ^ 0xffffffff) != 0)
		    class87 = Class67_Sub5_Sub1.method824(false, anInt1189);
		if (class87 != null && class87.anIntArrayArray1796 != null) {
		    for (int i = 0; class87.anIntArrayArray1796.length > i;
			 i++) {
			if (class87.anIntArrayArray1796[i] != null
			    && i < class131_sub2s.length
			    && class131_sub2s[i] != null) {
			    int i_0_ = class87.anIntArrayArray1796[i][0];
			    int i_1_ = class87.anIntArrayArray1796[i][1];
			    int i_2_ = class87.anIntArrayArray1796[i][3];
			    int i_3_ = class87.anIntArrayArray1796[i][4];
			    int i_4_ = class87.anIntArrayArray1796[i][2];
			    int i_5_ = class87.anIntArrayArray1796[i][5];
			    if (anIntArrayArray1233 == null)
				anIntArrayArray1233
				    = (new int
				       [class87.anIntArrayArray1796.length][]);
			    if (anIntArrayArray1233[i] == null) {
				int[] is
				    = anIntArrayArray1233[i] = new int[15];
				if (i_2_ == 0 && i_3_ == 0
				    && (i_5_ ^ 0xffffffff) == -1) {
				    is[12] = -i_0_;
				    is[13] = -i_1_;
				    is[14] = -i_4_;
				    is[0] = is[4] = is[8] = 32768;
				} else {
				    int i_6_ = (Class26.anIntArray617[i_2_]
						>> 1947224321);
				    int i_7_ = (Class26.anIntArray612[i_2_]
						>> -122703711);
				    int i_8_ = (Class26.anIntArray612[i_3_]
						>> 959335137);
				    int i_9_ = (Class26.anIntArray617[i_3_]
						>> 950590273);
				    int i_10_ = (Class26.anIntArray617[i_5_]
						 >> 455404449);
				    int i_11_ = (Class26.anIntArray612[i_5_]
						 >> 1213004193);
				    is[5] = -i_6_;
				    is[8] = i_8_ * i_7_ - -16384 >> -547876529;
				    is[4] = 16384 + i_7_ * i_11_ >> 2039687119;
				    is[2] = i_7_ * i_9_ - -16384 >> 1090079407;
				    int i_12_
					= 16384 + i_6_ * i_11_ >> 183879183;
				    is[7] = (16384 + (-i_10_ * -i_9_
						      - -(i_8_ * i_12_))
					     >> -879396081);
				    is[14] = ((-i_1_ * is[5] + is[2] * -i_0_
					       + -i_4_ * is[8] + 16384)
					      >> 769237199);
				    is[1] = (i_8_ * -i_10_ - (-(i_12_ * i_9_)
							      - 16384)
					     >> 169062127);
				    is[13] = (16384 + (is[7] * -i_4_
						       + -i_0_ * is[1]
						       + is[4] * -i_1_)
					      >> -1382099697);
				    is[3]
					= i_10_ * i_7_ + 16384 >> -1761878033;
				    int i_13_
					= 16384 + i_10_ * i_6_ >> 1291708815;
				    is[0]
					= (i_9_ * i_13_ + i_8_ * i_11_ + 16384
					   >> 344332911);
				    is[6] = (16384 + (i_11_ * -i_9_
						      - -(i_13_ * i_8_))
					     >> -885707537);
				    is[12] = (16384 + (is[3] * -i_1_
						       + -i_0_ * is[0]
						       + is[6] * -i_4_)
					      >> 1249966511);
				}
				is[11] = i_4_;
				is[9] = i_0_;
				is[10] = i_1_;
			    }
			    if ((i_2_ ^ 0xffffffff) != -1 || i_3_ != 0
				|| i_5_ != 0)
				class131_sub2s[i].method1799(i_2_, i_3_, i_5_);
			    if ((i_0_ ^ 0xffffffff) != -1
				|| (i_1_ ^ 0xffffffff) != -1 || i_4_ != 0)
				class131_sub2s[i].method1798(i_0_, i_1_, i_4_);
			}
		    }
		}
		Class131_Sub2 class131_sub2;
		if (class131_sub2s.length != 1)
		    class131_sub2 = new Class131_Sub2(class131_sub2s,
						      class131_sub2s.length);
		else
		    class131_sub2 = class131_sub2s[0];
		if (aShortArray1195 != null) {
		    for (int i = 0; i < aShortArray1195.length; i++) {
			if (aByteArray1225 != null
			    && ((aByteArray1225.length ^ 0xffffffff)
				< (i ^ 0xffffffff)))
			    class131_sub2.method1796(aShortArray1195[i],
						     (Class67_Sub1_Sub16
						      .aShortArray4076
						      [0xff & (aByteArray1225
							       [i])]));
			else
			    class131_sub2.method1796(aShortArray1195[i],
						     aShortArray1175[i]);
		    }
		}
		if (aShortArray1226 != null) {
		    for (int i = 0; ((aShortArray1226.length ^ 0xffffffff)
				     < (i ^ 0xffffffff)); i++)
			class131_sub2.method1791(aShortArray1226[i],
						 aShortArray1210[i]);
		}
		class131_sub6 = class131_sub2.method1787(anInt1223 + 64,
							 850 - -anInt1187, -30,
							 -50, -30);
		Class133.aClass136_2456.method1926((long) anInt1205,
						   class131_sub6, (byte) -71);
	    }
	    boolean bool = false;
	    boolean bool_14_ = false;
	    boolean bool_15_ = false;
	    boolean bool_16_ = false;
	    int i = arg0 != null ? arg0.length : 0;
	    for (int i_17_ = 0; i > i_17_; i_17_++) {
		if (arg0[i_17_] != null) {
		    Class41 class41
			= Class120.method1666(arg0[i_17_].anInt516, -32);
		    if (class41.anIntArray855 != null) {
			Class116.aClass41Array2191[i_17_] = class41;
			bool = true;
			int i_18_ = arg0[i_17_].anInt525;
			int i_19_ = arg0[i_17_].anInt512;
			int i_20_ = class41.anIntArray855[i_18_];
			Class107.aClass67_Sub5_Sub7Array2072[i_17_]
			    = Class96_Sub1.method1508(92,
						      i_20_ >>> -261497104);
			i_20_ &= 0xffff;
			Class69.anIntArray1388[i_17_] = i_20_;
			if (Class107.aClass67_Sub5_Sub7Array2072[i_17_]
			    != null) {
			    bool_15_ |= Class107
					    .aClass67_Sub5_Sub7Array2072[i_17_]
					    .method876(1, i_20_);
			    bool_14_
				|= Class107.aClass67_Sub5_Sub7Array2072
				       [i_17_].method878((byte) -88, i_20_);
			    bool_16_ |= class41.aBoolean885;
			}
			if (!class41.aBoolean877 && !Class106.aBoolean2055
			    || (i_19_ ^ 0xffffffff) == 0
			    || ((class41.anIntArray855.length ^ 0xffffffff)
				>= (i_19_ ^ 0xffffffff))) {
			    Class120.anIntArray2289[i_17_] = 0;
			    Class67_Sub5_Sub13.anIntArray4722[i_17_] = 0;
			    Class67_Sub5_Sub14.aClass67_Sub5_Sub7Array4731
				[i_17_]
				= null;
			    Class67_Sub1_Sub6.anIntArray3887[i_17_] = -1;
			} else {
			    Class120.anIntArray2289[i_17_]
				= class41.anIntArray880[i_18_];
			    Class67_Sub5_Sub13.anIntArray4722[i_17_]
				= arg0[i_17_].anInt515;
			    int i_21_ = class41.anIntArray855[i_19_];
			    Class67_Sub5_Sub14.aClass67_Sub5_Sub7Array4731
				[i_17_]
				= Class96_Sub1.method1508(120,
							  i_21_ >>> 988086320);
			    i_21_ &= 0xffff;
			    Class67_Sub1_Sub6.anIntArray3887[i_17_] = i_21_;
			    if ((Class67_Sub5_Sub14.aClass67_Sub5_Sub7Array4731
				 [i_17_])
				!= null) {
				bool_15_ |= Class67_Sub5_Sub14
						.aClass67_Sub5_Sub7Array4731
						[i_17_].method876(1, i_21_);
				bool_14_
				    |= Class67_Sub5_Sub14
					   .aClass67_Sub5_Sub7Array4731[i_17_]
					   .method878((byte) -116, i_21_);
			    }
			}
		    }
		}
	    }
	    if (!bool && arg2 == null && arg9 == null) {
		Class131_Sub6 class131_sub6_22_
		    = class131_sub6.method1853(true, true, true);
		if (anInt1178 != 128 || (anInt1198 ^ 0xffffffff) != -129)
		    class131_sub6_22_.method1845(anInt1178, anInt1198,
						 anInt1178);
		return class131_sub6_22_;
	    }
	    int i_23_ = -1;
	    int i_24_ = -1;
	    Class67_Sub5_Sub7 class67_sub5_sub7 = null;
	    Class67_Sub5_Sub7 class67_sub5_sub7_25_ = null;
	    int i_26_ = 0;
	    if (arg6 > -85)
		aShort1224 = (short) 112;
	    if (arg2 != null) {
		i_23_ = arg2.anIntArray855[arg1];
		int i_27_ = i_23_ >>> -508003792;
		class67_sub5_sub7_25_ = Class96_Sub1.method1508(99, i_27_);
		i_23_ &= 0xffff;
		if (class67_sub5_sub7_25_ != null) {
		    bool_15_ |= class67_sub5_sub7_25_.method876(1, i_23_);
		    bool_14_
			|= class67_sub5_sub7_25_.method878((byte) -61, i_23_);
		    bool_16_ |= arg2.aBoolean885;
		}
		if ((arg2.aBoolean877 || Class106.aBoolean2055) && arg4 != -1
		    && arg2.anIntArray855.length > arg4) {
		    i_24_ = arg2.anIntArray855[arg4];
		    i_26_ = arg2.anIntArray880[arg1];
		    int i_28_ = i_24_ >>> -1721449296;
		    i_24_ &= 0xffff;
		    if ((i_27_ ^ 0xffffffff) != (i_28_ ^ 0xffffffff))
			class67_sub5_sub7
			    = Class96_Sub1.method1508(97,
						      i_24_ >>> -989140080);
		    else
			class67_sub5_sub7 = class67_sub5_sub7_25_;
		    if (class67_sub5_sub7 != null) {
			bool_15_ |= class67_sub5_sub7.method876(1, i_24_);
			bool_14_
			    |= class67_sub5_sub7.method878((byte) 81, i_24_);
		    }
		}
	    }
	    int i_29_ = -1;
	    int i_30_ = 0;
	    int i_31_ = -1;
	    Class67_Sub5_Sub7 class67_sub5_sub7_32_ = null;
	    Class67_Sub5_Sub7 class67_sub5_sub7_33_ = null;
	    if (arg9 != null) {
		i_29_ = arg9.anIntArray855[arg8];
		int i_34_ = i_29_ >>> -704998256;
		i_29_ &= 0xffff;
		class67_sub5_sub7_32_ = Class96_Sub1.method1508(98, i_34_);
		if (class67_sub5_sub7_32_ != null) {
		    bool_15_ |= class67_sub5_sub7_32_.method876(1, i_29_);
		    bool_14_
			|= class67_sub5_sub7_32_.method878((byte) -17, i_29_);
		    bool_16_ |= arg9.aBoolean885;
		}
		if ((arg9.aBoolean877 || Class106.aBoolean2055) && arg7 != -1
		    && arg9.anIntArray855.length > arg7) {
		    i_30_ = arg9.anIntArray880[arg8];
		    i_31_ = arg9.anIntArray855[arg7];
		    int i_35_ = i_31_ >>> -969294128;
		    i_31_ &= 0xffff;
		    if (i_35_ != i_34_)
			class67_sub5_sub7_33_
			    = Class96_Sub1.method1508(105,
						      i_31_ >>> -718883344);
		    else
			class67_sub5_sub7_33_ = class67_sub5_sub7_32_;
		    if (class67_sub5_sub7_33_ != null) {
			bool_15_ |= class67_sub5_sub7_33_.method876(1, i_31_);
			bool_14_ |= class67_sub5_sub7_33_.method878((byte) 127,
								    i_31_);
		    }
		}
	    }
	    Class131_Sub6 class131_sub6_36_
		= class131_sub6.method1853(!bool_14_, !bool_15_, !bool_16_);
	    int i_37_ = 0;
	    int i_38_ = 1;
	    for (/**/; (i ^ 0xffffffff) < (i_37_ ^ 0xffffffff); i_37_++) {
		if (Class107.aClass67_Sub5_Sub7Array2072[i_37_] != null)
		    class131_sub6_36_.method1851
			(Class107.aClass67_Sub5_Sub7Array2072[i_37_],
			 Class69.anIntArray1388[i_37_],
			 Class67_Sub5_Sub14.aClass67_Sub5_Sub7Array4731[i_37_],
			 Class67_Sub1_Sub6.anIntArray3887[i_37_],
			 Class67_Sub5_Sub13.anIntArray4722[i_37_] - 1,
			 Class120.anIntArray2289[i_37_], i_38_,
			 Class116.aClass41Array2191[i_37_].aBoolean885,
			 anIntArrayArray1233[i_37_]);
		i_38_ <<= 1;
	    }
	    if (class67_sub5_sub7_25_ != null && class67_sub5_sub7_32_ != null)
		class131_sub6_36_.method1850(class67_sub5_sub7_25_, i_23_,
					     class67_sub5_sub7, i_24_,
					     -1 + arg5, i_26_,
					     class67_sub5_sub7_32_, i_29_,
					     class67_sub5_sub7_33_, i_31_,
					     arg3 - 1, i_30_,
					     arg2.aBooleanArray875,
					     (arg2.aBoolean885
					      | arg9.aBoolean885));
	    else if (class67_sub5_sub7_25_ == null) {
		if (class67_sub5_sub7_32_ != null)
		    class131_sub6_36_.method1842(class67_sub5_sub7_32_, i_29_,
						 class67_sub5_sub7_33_, i_31_,
						 arg3 - 1, i_30_,
						 arg9.aBoolean885);
	    } else
		class131_sub6_36_.method1842(class67_sub5_sub7_25_, i_23_,
					     class67_sub5_sub7, i_24_,
					     -1 + arg5, i_26_,
					     arg2.aBoolean885);
	    for (int i_39_ = 0; i_39_ < i; i_39_++) {
		Class107.aClass67_Sub5_Sub7Array2072[i_39_] = null;
		Class67_Sub5_Sub14.aClass67_Sub5_Sub7Array4731[i_39_] = null;
		Class116.aClass41Array2191[i_39_] = null;
	    }
	    if (anInt1178 != 128 || anInt1198 != 128)
		class131_sub6_36_.method1845(anInt1178, anInt1198, anInt1178);
	    return class131_sub6_36_;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("ja.K(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ','
			+ (arg9 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public int method571(int arg0, int arg1, int arg2) {
	anInt1217++;
	if (arg2 != -1)
	    return -125;
	if (aClass92_1215 == null)
	    return arg1;
	Class67_Sub19 class67_sub19
	    = ((Class67_Sub19)
	       aClass92_1215.method1489((byte) -20, (long) arg0));
	if (class67_sub19 == null)
	    return arg1;
	return class67_sub19.anInt3149;
    }
    
    public void method572(Stream arg0, byte arg1) {
	for (;;) {
	    int i = arg0.readByte((byte) -52);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method581(i, arg0, (byte) 111);
	}
	int i = 99 / ((arg1 - 48) / 35);
	anInt1199++;
    }
    
    public Class131_Sub6 method573(Class41 arg0, int arg1, int arg2, int arg3,
				   int arg4) {
	anInt1228++;
	if (arg2 <= 73)
	    method578(-23);
	if (anIntArray1208 != null) {
	    Class64 class64 = method578(-1);
	    if (class64 == null)
		return null;
	    return class64.method573(arg0, arg1, 123, arg3, arg4);
	}
	if (anIntArray1202 == null)
	    return null;
	Class131_Sub6 class131_sub6
	    = ((Class131_Sub6)
	       Class131_Sub7_Sub2.aClass136_5073.method1924((long) anInt1205,
							    false));
	if (class131_sub6 == null) {
	    boolean bool = false;
	    for (int i = 0;
		 (i ^ 0xffffffff) > (anIntArray1202.length ^ 0xffffffff);
		 i++) {
		if (!Class67_Sub1_Sub19.aClass9_4136
			 .method117(true, anIntArray1202[i], 0))
		    bool = true;
	    }
	    if (bool)
		return null;
	    Class131_Sub2[] class131_sub2s
		= new Class131_Sub2[anIntArray1202.length];
	    for (int i = 0;
		 (i ^ 0xffffffff) > (anIntArray1202.length ^ 0xffffffff); i++)
		class131_sub2s[i]
		    = Class131_Sub2.method1780(Class67_Sub1_Sub19.aClass9_4136,
					       anIntArray1202[i], 0);
	    Class131_Sub2 class131_sub2;
	    if ((class131_sub2s.length ^ 0xffffffff) == -2)
		class131_sub2 = class131_sub2s[0];
	    else
		class131_sub2
		    = new Class131_Sub2(class131_sub2s, class131_sub2s.length);
	    if (aShortArray1195 != null) {
		for (int i = 0;
		     (aShortArray1195.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++) {
		    if (aByteArray1225 == null
			|| (i ^ 0xffffffff) <= (aByteArray1225.length
						^ 0xffffffff))
			class131_sub2.method1796(aShortArray1195[i],
						 aShortArray1175[i]);
		    else
			class131_sub2.method1796(aShortArray1195[i],
						 (Class67_Sub1_Sub16
						  .aShortArray4076
						  [aByteArray1225[i] & 0xff]));
		}
	    }
	    if (aShortArray1226 != null) {
		for (int i = 0; i < aShortArray1226.length; i++)
		    class131_sub2.method1791(aShortArray1226[i],
					     aShortArray1210[i]);
	    }
	    class131_sub6 = class131_sub2.method1787(64, 768, -50, -10, -50);
	    Class131_Sub7_Sub2.aClass136_5073
		.method1926((long) anInt1205, class131_sub6, (byte) -71);
	}
	if (arg0 != null)
	    class131_sub6
		= arg0.method358(arg3, arg1, class131_sub6, -20002, arg4);
	return class131_sub6;
    }
    
    public boolean method574(int arg0) {
	anInt1194++;
	if (anIntArray1208 == null)
	    return true;
	if (arg0 > -36)
	    return true;
	int i = -1;
	if ((anInt1203 ^ 0xffffffff) == 0) {
	    if ((anInt1206 ^ 0xffffffff) != 0)
		i = Class137.anIntArray2504[anInt1206];
	} else
	    i = Class67_Sub9.method1113(22255, anInt1203);
	if (i < 0 || i >= -1 + anIntArray1208.length
	    || anIntArray1208[i] == -1) {
	    int i_40_ = anIntArray1208[anIntArray1208.length - 1];
	    if ((i_40_ ^ 0xffffffff) == 0)
		return false;
	    return true;
	}
	return true;
    }
    
    public static boolean method575(byte arg0, int arg1, int arg2,
				    Class9 arg3) {
	anInt1212++;
	byte[] is = arg3.method138(-809612665, arg1, arg2);
	if (is == null)
	    return false;
	int i = 44 % ((arg0 - 24) / 40);
	Class98.method1511((byte) 55, is);
	return true;
    }
    
    public boolean method576(byte arg0) {
	anInt1185++;
	if (anIntArray1208 == null) {
	    if ((anInt1173 ^ 0xffffffff) == 0 && anInt1218 == -1
		&& (anInt1236 ^ 0xffffffff) == 0)
		return false;
	    return true;
	}
	if (arg0 <= 22)
	    return false;
	for (int i = 0;
	     (anIntArray1208.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    if (anIntArray1208[i] != -1) {
		Class64 class64 = Class133.method1908(anIntArray1208[i], 89);
		if ((class64.anInt1173 ^ 0xffffffff) != 0
		    || class64.anInt1218 != -1 || class64.anInt1236 != -1)
		    return true;
	    }
	}
	return false;
    }
    
    public void method577(byte arg0) {
	if (arg0 != 46)
	    aShortArray1226 = null;
	anInt1207++;
    }
    
    public Class64 method578(int arg0) {
	anInt1188++;
	int i = arg0;
	if ((anInt1203 ^ 0xffffffff) != 0)
	    i = Class67_Sub9.method1113(arg0 + 22256, anInt1203);
	else if (anInt1206 != -1)
	    i = Class137.anIntArray2504[anInt1206];
	if (i < 0
	    || (i ^ 0xffffffff) <= (-1 + anIntArray1208.length ^ 0xffffffff)
	    || (anIntArray1208[i] ^ 0xffffffff) == 0) {
	    int i_41_ = anIntArray1208[-1 + anIntArray1208.length];
	    if ((i_41_ ^ 0xffffffff) == 0)
		return null;
	    return Class133.method1908(i_41_, arg0 + -114);
	}
	return Class133.method1908(anIntArray1208[i], -6);
    }
    
    public static void method579(Stream arg0, int arg1) {
	anInt1176++;
	if ((arg0.buffer.length - arg0.currentOffset ^ 0xffffffff) <= -2) {
	    int i = arg0.readByte((byte) 100);
	    if (i >= 0 && i <= 11) {
		int i_42_;
		if (i != 11) {
		    if (i != 10) {
			if ((i ^ 0xffffffff) != -10) {
			    if ((i ^ 0xffffffff) != -9) {
				if (i == 7)
				    i_42_ = 29;
				else if ((i ^ 0xffffffff) == -7)
				    i_42_ = 28;
				else if (i != 5) {
				    if (i != 4) {
					if (i == 3)
					    i_42_ = 23;
					else if ((i ^ 0xffffffff) == -3)
					    i_42_ = 22;
					else if ((i ^ 0xffffffff) == -2)
					    i_42_ = 23;
					else
					    i_42_ = 19;
				    } else
					i_42_ = 24;
				} else
				    i_42_ = 28;
			    } else
				i_42_ = 30;
			} else
			    i_42_ = 31;
		    } else
			i_42_ = 32;
		} else
		    i_42_ = 33;
		if ((-arg0.currentOffset + arg0.buffer.length ^ 0xffffffff)
		    <= (i_42_ ^ 0xffffffff)) {
		    Class28.anInt667 = arg0.readByte((byte) -9);
		    if (Class28.anInt667 >= 1) {
			if ((Class28.anInt667 ^ 0xffffffff) < -5)
			    Class28.anInt667 = 4;
		    } else
			Class28.anInt667 = 1;
		    Class131_Sub7_Sub2.method1893((byte) -64,
						  (arg0.readByte((byte) 101)
						   ^ 0xffffffff) == -2);
		    Class100.aBoolean1977
			= (arg0.readByte((byte) 101) ^ 0xffffffff) == -2;
		    InputStream_Sub1.aBoolean77
			= (arg0.readByte((byte) -30) ^ 0xffffffff) == -2;
		    if (arg1 <= 24)
			aRSString_1180 = null;
		    Class67_Sub5_Sub2.aBoolean4468
			= arg0.readByte((byte) 102) == 1;
		    Class55_Sub3.aBoolean2808
			= arg0.readByte((byte) -112) == 1;
		    Class6.aBoolean157 = arg0.readByte((byte) -76) == 1;
		    InputStream_Sub1.aBoolean78
			= arg0.readByte((byte) -102) == 1;
		    Class67_Sub5_Sub9.aBoolean4614
			= (arg0.readByte((byte) 127) ^ 0xffffffff) == -2;
		    Class67_Sub25.anInt3253 = arg0.readByte((byte) -10);
		    if ((Class67_Sub25.anInt3253 ^ 0xffffffff) < -3)
			Class67_Sub25.anInt3253 = 2;
		    if (i >= 2)
			Class123.aBoolean2318
			    = (arg0.readByte((byte) 93) ^ 0xffffffff) == -2;
		    else {
			Class123.aBoolean2318
			    = arg0.readByte((byte) -38) == 1;
			arg0.readByte((byte) -107);
		    }
		    Class72.aBoolean1432 = arg0.readByte((byte) 98) == 1;
		    Class128.aBoolean2385 = arg0.readByte((byte) -10) == 1;
		    Class75.anInt2716 = arg0.readByte((byte) 81);
		    if (Class75.anInt2716 > 2)
			Class75.anInt2716 = 2;
		    Class74.anInt1485 = Class75.anInt2716;
		    Class105.aBoolean2044 = arg0.readByte((byte) -51) == 1;
		    Class67_Sub21.anInt3176 = arg0.readByte((byte) -87);
		    if ((Class67_Sub21.anInt3176 ^ 0xffffffff) < -128)
			Class67_Sub21.anInt3176 = 127;
		    Class67_Sub1_Sub29.anInt4259 = arg0.readByte((byte) 122);
		    Class27.anInt644 = arg0.readByte((byte) 120);
		    if ((Class27.anInt644 ^ 0xffffffff) < -128)
			Class27.anInt644 = 127;
		    if ((i ^ 0xffffffff) <= -2) {
			Class139.anInt2526 = arg0.readUShort(-2386);
			Class67_Sub11_Sub2.anInt4857 = arg0.readUShort(-2386);
		    }
		    if (i >= 3 && i < 6)
			arg0.readByte((byte) 97);
		    if (i >= 4) {
			int i_43_ = arg0.readByte((byte) -35);
			if ((Class122.anInt2307 ^ 0xffffffff) > -97)
			    i_43_ = 0;
			Class61_Sub1.method557(i_43_);
		    }
		    if ((i ^ 0xffffffff) <= -6)
			Class63.anInt1168 = arg0.readInt((byte) 126);
		    if (i >= 6)
			Class2.anInt112 = arg0.readByte((byte) 123);
		    if ((i ^ 0xffffffff) <= -8)
			Class67_Sub29.aBoolean3337
			    = arg0.readByte((byte) -127) == 1;
		    if (i >= 8)
			Class53.aBoolean1057
			    = arg0.readByte((byte) -14) == 1;
		    if ((i ^ 0xffffffff) <= -10)
			Class95.anInt1909 = arg0.readByte((byte) 80);
		    if ((i ^ 0xffffffff) <= -11)
			InputStream_Sub1.aBoolean71
			    = arg0.readByte((byte) -119) != 0;
		    if (i >= 11)
			Class67_Sub1_Sub38.aBoolean4431
			    = arg0.readByte((byte) -86) != 0;
		}
	    }
	}
    }
    
    public static void method580(byte arg0) {
	aLongArray1179 = null;
	aRSString_1180 = null;
	aRSString_1239 = null;
	int i = -14 % ((-32 - arg0) / 56);
    }
    
    public void method581(int arg0, Stream arg1, byte arg2) {
	if (arg0 != 1) {
	    if (arg0 != 2) {
		if ((arg0 ^ 0xffffffff) != -13) {
		    if ((arg0 ^ 0xffffffff) <= -31
			&& (arg0 ^ 0xffffffff) > -36) {
			npcOptions[arg0 - 30] = arg1.readRSString(-1);
			if (npcOptions[-30 + arg0].method526
			    (103, Class67_Sub1_Sub12.aRSString_4000))
			    npcOptions[-30 + arg0] = null;
		    } else if (arg0 != 40) {
			if (arg0 != 41) {
			    if (arg0 != 42) {
				if ((arg0 ^ 0xffffffff) != -61) {
				    if ((arg0 ^ 0xffffffff) != -94) {
					if ((arg0 ^ 0xffffffff) != -96) {
					    if ((arg0 ^ 0xffffffff) == -98)
						anInt1178
						    = arg1.readUShort(-2386);
					    else if (arg0 != 98) {
						if (arg0 == 99)
						    aBoolean1235 = true;
						else if (arg0 == 100)
						    anInt1223
							= (arg1.readByte2
							   ((byte) 1));
						else if (arg0 != 101) {
						    if ((arg0 ^ 0xffffffff)
							== -103)
							anInt1174
							    = (arg1.readUShort
							       (-2386));
						    else if ((arg0
							      ^ 0xffffffff)
							     == -104)
							anInt1191
							    = (arg1.readUShort
							       (-2386));
						    else if (((arg0
							       ^ 0xffffffff)
							      != -107)
							     && ((arg0
								  ^ 0xffffffff)
								 != -119)) {
							if ((arg0 ^ 0xffffffff)
							    != -108) {
							    if (arg0 == 109)
								aBoolean1196
								    = false;
							    else if (arg0
								     != 111) {
								if (arg0
								    == 113) {
								    aShort1184
									= (short) arg1.readUShort(-2386);
								    aShort1216
									= (short) arg1.readUShort(-2386);
								} else if (arg0
									   == 114) {
								    aByte1186
									= (arg1.readByte2
									   ((byte) 1));
								    aByte1192
									= (arg1.readByte2
									   ((byte) 1));
								} else if (arg0
									   != 115) {
								    if (arg0
									== 119)
									aByte1209
									    = arg1.readByte2((byte) 1);
								    else if ((arg0
									      ^ 0xffffffff)
									     != -122) {
									if (arg0
									    == 122)
									    anInt1230 = arg1.readUShort(-2386);
									else if ((arg0 ^ 0xffffffff) != -124) {
									    if (arg0 == 125)
										aByte1219 = arg1.readByte2((byte) 1);
									    else if (arg0 != 126) {
										if ((arg0 ^ 0xffffffff) != -128) {
										    if ((arg0 ^ 0xffffffff) == -129)
											arg1.readByte((byte) 119);
										    else if (arg0 != 134) {
											if ((arg0 ^ 0xffffffff) != -136) {
											    if ((arg0 ^ 0xffffffff) == -137) {
												anInt1222 = arg1.readByte((byte) 87);
												anInt1181 = arg1.readUShort(-2386);
											    } else if ((arg0 ^ 0xffffffff) != -138) {
												if (arg0 == 249) {
												    int i = arg1.readByte((byte) 105);
												    if (aClass92_1215 == null) {
													int i_44_ = Class67_Sub1_Sub31.method765(112, i);
													aClass92_1215 = new Class92(i_44_);
												    }
												    for (int i_45_ = 0; (i ^ 0xffffffff) < (i_45_ ^ 0xffffffff); i_45_++) {
													boolean bool = arg1.readByte((byte) 89) == 1;
													int i_46_ = arg1.readThreeBytes(65280);
													Class67 class67;
													if (!bool)
													    class67 = new Class67_Sub19(arg1.readInt((byte) 126));
													else
													    class67 = new Class67_Sub29(arg1.readRSString(-1));
													aClass92_1215.method1488((byte) -89, class67, (long) i_46_);
												    }
												}
											    } else
												anInt1227 = arg1.readUShort(-2386);
											} else {
											    anInt1214 = arg1.readByte((byte) -21);
											    anInt1220 = arg1.readUShort(-2386);
											}
										    } else {
											anInt1173 = arg1.readUShort(-2386);
											if (anInt1173 == 65535)
											    anInt1173 = -1;
											anInt1237 = arg1.readUShort(-2386);
											if ((anInt1237 ^ 0xffffffff) == -65536)
											    anInt1237 = -1;
											anInt1218 = arg1.readUShort(-2386);
											if ((anInt1218 ^ 0xffffffff) == -65536)
											    anInt1218 = -1;
											anInt1236 = arg1.readUShort(-2386);
											if (anInt1236 == 65535)
											    anInt1236 = -1;
											anInt1200 = arg1.readByte((byte) -24);
										    }
										} else
										    anInt1189 = arg1.readUShort(-2386);
									    } else
										anInt1193 = arg1.readUShort(-2386);
									} else
									    anInt1213 = arg1.readUShort(-2386);
								    } else {
									anIntArrayArray1201
									    = new int[anIntArray1238.length][];
									int i
									    = arg1.readByte((byte) -83);
									for (int i_47_ = 0;
									     (i
									      ^ 0xffffffff) < (i_47_ ^ 0xffffffff);
									     i_47_++) {
									    int i_48_ = arg1.readByte((byte) -84);
									    int[] is = anIntArrayArray1201[i_48_] = new int[3];
									    is[0] = arg1.readByte2((byte) 1);
									    is[1] = arg1.readByte2((byte) 1);
									    is[2] = arg1.readByte2((byte) 1);
									}
								    }
								} else {
								    arg1.readByte
									((byte) -15);
								    arg1.readByte
									((byte) -58);
								}
							    } else
								aBoolean1234
								    = false;
							} else
							    aBoolean1232
								= false;
						    } else {
							anInt1203
							    = (arg1.readUShort
							       (-2386));
							if (anInt1203 == 65535)
							    anInt1203 = -1;
							int i = -1;
							anInt1206
							    = (arg1.readUShort
							       (-2386));
							if ((anInt1206
							     ^ 0xffffffff)
							    == -65536)
							    anInt1206 = -1;
							if ((arg0 ^ 0xffffffff)
							    == -119) {
							    i = (arg1.readUShort
								 (-2386));
							    if ((i
								 ^ 0xffffffff)
								== -65536)
								i = -1;
							}
							int i_49_
							    = (arg1.readByte
							       ((byte) 81));
							anIntArray1208
							    = (new int
							       [i_49_ - -2]);
							for (int i_50_ = 0;
							     i_50_ <= i_49_;
							     i_50_++) {
							    anIntArray1208
								[i_50_]
								= (arg1.readUShort
								   (-2386));
							    if (((anIntArray1208
								  [i_50_])
								 ^ 0xffffffff)
								== -65536)
								anIntArray1208
								    [i_50_]
								    = -1;
							}
							anIntArray1208
							    [1 + i_49_]
							    = i;
						    }
						} else
						    anInt1187
							= 5 * (arg1.readByte2
							       ((byte) 1));
					    } else
						anInt1198
						    = arg1.readUShort(-2386);
					} else
					    anInt1197 = arg1.readUShort(-2386);
				    } else
					aBoolean1231 = false;
				} else {
				    int i = arg1.readByte((byte) 101);
				    anIntArray1202 = new int[i];
				    for (int i_51_ = 0; i_51_ < i; i_51_++)
					anIntArray1202[i_51_]
					    = arg1.readUShort(-2386);
				}
			    } else {
				int i = arg1.readByte((byte) 83);
				aByteArray1225 = new byte[i];
				for (int i_52_ = 0; i > i_52_; i_52_++)
				    aByteArray1225[i_52_]
					= arg1.readByte2((byte) 1);
			    }
			} else {
			    int i = arg1.readByte((byte) 105);
			    aShortArray1210 = new short[i];
			    aShortArray1226 = new short[i];
			    for (int i_53_ = 0; i_53_ < i; i_53_++) {
				aShortArray1226[i_53_]
				    = (short) arg1.readUShort(-2386);
				aShortArray1210[i_53_]
				    = (short) arg1.readUShort(-2386);
			    }
			}
		    } else {
			int i = arg1.readByte((byte) 114);
			aShortArray1195 = new short[i];
			aShortArray1175 = new short[i];
			for (int i_54_ = 0; i_54_ < i; i_54_++) {
			    aShortArray1195[i_54_]
				= (short) arg1.readUShort(-2386);
			    aShortArray1175[i_54_]
				= (short) arg1.readUShort(-2386);
			}
		    }
		} else
		    anInt1211 = arg1.readByte((byte) -48);
	    } else
		npcName = arg1.readRSString(-1);
	} else {
	    int i = arg1.readByte((byte) 80);
	    anIntArray1238 = new int[i];
	    for (int i_55_ = 0; (i ^ 0xffffffff) < (i_55_ ^ 0xffffffff);
		 i_55_++) {
		anIntArray1238[i_55_] = arg1.readUShort(-2386);
		if (anIntArray1238[i_55_] == 65535)
		    anIntArray1238[i_55_] = -1;
	    }
	}
	if (arg2 < 105)
	    method570(null, 103, null, -29, -10, 74, (byte) 8, 80, -41, null);
	anInt1177++;
    }
    
    public Class64() {
	anInt1181 = -1;
	anInt1197 = -1;
	anInt1191 = 32;
	aShort1184 = (short) 0;
	anInt1173 = -1;
	aBoolean1196 = true;
	anInt1193 = -1;
	anInt1189 = -1;
	anInt1200 = 0;
	anInt1198 = 128;
	aByte1192 = (byte) -16;
	npcName = Class67_Sub5_Sub15.aRSString_4748;
	anInt1213 = -1;
	anInt1187 = 0;
	anInt1206 = -1;
	npcOptions = new RSString[5];
	anInt1174 = -1;
	anInt1218 = -1;
	anInt1214 = -1;
	aByte1209 = (byte) 0;
	aShort1216 = (short) 0;
	aBoolean1232 = true;
	aBoolean1231 = true;
	anInt1211 = 1;
	anInt1220 = -1;
	anInt1203 = -1;
	aBoolean1234 = true;
	anInt1227 = -1;
	anInt1236 = -1;
	anInt1237 = -1;
	aByte1219 = (byte) 7;
	aBoolean1235 = false;
	anInt1230 = -1;
	anInt1223 = 0;
	anInt1222 = -1;
    }
    
    static {
	for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
	    long l = (long) i;
	    for (int i_56_ = 0; i_56_ < 8; i_56_++) {
		if ((0x1L & l) != 1L)
		    l >>>= 1;
		else
		    l = ~0x3693a86a2878f0bdL ^ l >>> -431452415;
	    }
	    aLongArray1179[i] = l;
	}
	aRSString_1239 = Class134.method1914("leuchten2:", (byte) 43);
    }
}
