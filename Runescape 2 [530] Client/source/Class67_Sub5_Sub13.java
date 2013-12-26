/* Class67_Sub5_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class67_Sub5_Sub13 extends Class67_Sub5
{
    public static RSString aRSString_4707;
    public static RSString aRSString_4708 = Class134.method1914("M", (byte) 103);
    public static int anInt4709;
    public static int anInt4710;
    public static int anInt4711;
    public static RSString aRSString_4712;
    public int[] anIntArray4713;
    public static int anInt4714;
    public int[] anIntArray4715;
    public static int anInt4716;
    public static RSString aRSString_4717
	= Class134.method1914("rouge:", (byte) 102);
    public static int anInt4718;
    public static int anInt4719;
    public static RSString aRSString_4720;
    public int[] anIntArray4721;
    public static int[] anIntArray4722;
    public static int anInt4723;
    public int[] anIntArray4724;
    public static String connectServerIP;
    public static int anInt4726;
    public RSString aRSString_4727;
    public static int anInt4728 = 0;
    public static int anInt4729;
    public static int anInt4730;
    
    public void method956(int arg0) {
	if (anIntArray4724 != null) {
	    for (int i = 0;
		 (anIntArray4724.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		anIntArray4724[i]
		    = Class67_Sub20.method1273(anIntArray4724[i], 32768);
	}
	if (arg0 == -24414) {
	    if (anIntArray4721 != null) {
		for (int i = 0;
		     (anIntArray4721.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++)
		    anIntArray4721[i]
			= Class67_Sub20.method1273(anIntArray4721[i], 32768);
	    }
	    anInt4726++;
	}
    }
    
    public static void method957(int arg0) {
	Class131_Sub5.aClass136_3666.method1922(0);
	if (arg0 != -1)
	    method959(-5, 122, -25, -77, 81, -51, -9);
	anInt4730++;
    }
    
    public static void method958(int arg0, Component arg1) {
	if (arg0 != 0)
	    method959(84, 11, -28, 36, -1, -18, 12);
	arg1.addMouseListener(Class6.aClass133_154);
	arg1.addMouseMotionListener(Class6.aClass133_154);
	arg1.addFocusListener(Class6.aClass133_154);
	anInt4729++;
    }
    
    public static void method959(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	if (Login.anInt1612 == 0) {
	    int i = Class101.anInt1990;
	    int i_0_ = Applet_Sub1.anInt12;
	    int i_1_ = Class67_Sub1_Sub34.anInt4336;
	    int i_2_ = Class49.anInt1011;
	    int i_3_ = (-i_0_ + i_2_) * (-arg0 + arg5) / arg4 - -i_0_;
	    int i_4_ = (-i + i_1_) * (-arg6 + arg1) / arg3 - -i;
	    if (Class67_Sub20.aBoolean3156
		&& (0x40 & Class67_Sub5_Sub14.anInt4733 ^ 0xffffffff) != -1) {
		Class7 class7
		    = Class67_Sub5_Sub14.method972(Class67_Sub5_Sub6.anInt4558,
						   18062,
						   (Class67_Sub1_Sub24
						    .anInt4200));
		if (class7 != null)
		    Class120.method1664((byte) 109,
					Class67_Sub26.aRSString_3293,
					(short) 41,
					Class67_Sub26.aRSString_3288, i_4_,
					i_3_, 0L, Class67_Sub5_Sub3.anInt4487);
		else
		    Class76.method1398(5197);
	    } else {
		Class67_Sub1_Sub16.anInt4078++;
		if (Class69.anInt1381 == 1)
		    Class120.method1664((byte) 114,
					Class67_Sub5_Sub5.aRSString_4523,
					(short) 5, Class119.aRSString_2253,
					i_4_, i_3_, 0L, -1);
		Class120.method1664((byte) 118,
				    Class67_Sub5_Sub5.aRSString_4523,
				    (short) 57,
				    Class67_Sub1_Sub17.aRSString_4104, i_4_,
				    i_3_, 0L, -1);
	    }
	}
	anInt4723++;
	long l = -1L;
	if (arg2 > -112)
	    anInt4711 = 2;
	for (int i = 0; i < Class27.anInt641; i++) {
	    long l_5_ = Class67_Sub1_Sub22.aLongArray4178[i];
	    int i_6_ = 0x7f & (int) l_5_;
	    int i_7_ = (0x3f87 & (int) l_5_) >> 2094032487;
	    int i_8_ = (int) l_5_ >> 410367709 & 0x3;
	    int i_9_ = (int) (l_5_ >>> -2047340256) & 0x7fffffff;
	    if ((l ^ 0xffffffffffffffffL) != (l_5_ ^ 0xffffffffffffffffL)) {
		l = l_5_;
		if (i_8_ == 2
		    && Class67_Sub1_Sub12.method669(Canvas_Sub1.anInt59, i_6_,
						    i_7_, l_5_)) {
		    Class65 class65 = Class73.method1359(11525, i_9_);
		    if (class65.anIntArray1244 != null)
			class65 = class65.method590((byte) -84);
		    if (class65 == null)
			continue;
		    if ((Login.anInt1612 ^ 0xffffffff) == -2) {
			Class120.method1664((byte) 118,
					    (Class67_Sub1_Sub27.method744
					     ((new RSString[]
					       { (Class67_Sub1_Sub6
						  .aRSString_3895),
						 Class23.aRSString_565,
						 class65.aRSString_1257 }),
					      -110)),
					    (short) 48, Login.aRSString_1615,
					    i_6_, i_7_, l_5_,
					    Class33_Sub2.anInt2783);
			Class41.anInt870++;
		    } else if (Class67_Sub20.aBoolean3156) {
			Class67_Sub5_Sub17 class67_sub5_sub17
			    = ((Class99.anInt1954 ^ 0xffffffff) == 0 ? null
			       : Class8.method103(-96, Class99.anInt1954));
			if (((Class67_Sub5_Sub14.anInt4733 & 0x4 ^ 0xffffffff)
			     != -1)
			    && (class67_sub5_sub17 == null
				|| (class65.method592(false,
						      (class67_sub5_sub17
						       .anInt4785),
						      Class99.anInt1954)
				    != class67_sub5_sub17.anInt4785))) {
			    Class8.anInt350++;
			    Class120.method1664((byte) 122,
						(Class67_Sub1_Sub27.method744
						 ((new RSString[]
						   { Class9.aRSString_369,
						     Class23.aRSString_565,
						     class65.aRSString_1257 }),
						  -96)),
						(short) 28,
						Class67_Sub26.aRSString_3288,
						i_6_, i_7_, l_5_,
						Class67_Sub5_Sub3.anInt4487);
			}
		    } else {
			Class67_Sub5_Sub18.anInt4806++;
			RSString[] RSStrings = class65.aRSStringArray1302;
			if (Class76.aBoolean1515)
			    RSStrings = Class49.method424(RSStrings, 0);
			if (RSStrings != null) {
			    for (int i_10_ = 4; i_10_ >= 0; i_10_--) {
				if (RSStrings[i_10_] != null) {
				    Class1.anInt100++;
				    short i_11_ = 0;
				    if ((i_10_ ^ 0xffffffff) == -1)
					i_11_ = (short) 20;
				    int i_12_ = -1;
				    if ((i_10_ ^ 0xffffffff)
					== (class65.anInt1290 ^ 0xffffffff))
					i_12_ = class65.anInt1260;
				    if ((i_10_ ^ 0xffffffff) == -2)
					i_11_ = (short) 11;
				    if (i_10_ == 2)
					i_11_ = (short) 58;
				    if (i_10_ == 3)
					i_11_ = (short) 45;
				    if (i_10_ == 4)
					i_11_ = (short) 1003;
				    if ((class65.anInt1296 ^ 0xffffffff)
					== (i_10_ ^ 0xffffffff))
					i_12_ = class65.anInt1247;
				    Class120.method1664
					((byte) 123,
					 (Class67_Sub1_Sub27.method744
					  ((new RSString[]
					    { Class54.aRSString_1083,
					      class65.aRSString_1257 }),
					   -95)),
					 i_11_, RSStrings[i_10_], i_6_, i_7_,
					 l_5_, i_12_);
				}
			    }
			}
			Class120.method1664((byte) 123,
					    (Class67_Sub1_Sub27.method744
					     ((new RSString[]
					       { Class54.aRSString_1083,
						 class65.aRSString_1257 }),
					      -91)),
					    (short) 1004,
					    Class72.aRSString_1442, i_6_, i_7_,
					    (long) class65.lastLoadedObjectId,
					    Class85.anInt1746);
		    }
		}
		if ((i_8_ ^ 0xffffffff) == -2) {
		    Class131_Sub7_Sub1 class131_sub7_sub1
			= Class128.aClass131_Sub7_Sub1Array2386[i_9_];
		    if ((((0x1 & class131_sub7_sub1.aClass64_5047.anInt1211)
			  == 0)
			 && (0x7f & class131_sub7_sub1.anInt3733) == 0
			 && (0x7f & class131_sub7_sub1.anInt3726) == 0)
			|| ((0x1 & class131_sub7_sub1.aClass64_5047.anInt1211
			     ^ 0xffffffff) == -2
			    && (class131_sub7_sub1.anInt3733 & 0x7f) == 64
			    && (class131_sub7_sub1.anInt3726 & 0x7f) == 64)) {
			int i_13_ = (class131_sub7_sub1.anInt3726 + 64
				     + -(64 * (class131_sub7_sub1.aClass64_5047
					       .anInt1211)));
			int i_14_ = (-(64 * (-1 + (class131_sub7_sub1
						   .aClass64_5047.anInt1211)))
				     + class131_sub7_sub1.anInt3733);
			for (int i_15_ = 0; i_15_ < Class37.anInt794;
			     i_15_++) {
			    Class131_Sub7_Sub1 class131_sub7_sub1_16_
				= (Class128.aClass131_Sub7_Sub1Array2386
				   [Class47.anIntArray965[i_15_]]);
			    int i_17_ = (class131_sub7_sub1_16_.anInt3733
					 - 64 * (class131_sub7_sub1_16_
						 .aClass64_5047.anInt1211)
					 - -64);
			    int i_18_
				= (class131_sub7_sub1_16_.anInt3726
				   - (-64 + 64 * (class131_sub7_sub1_16_
						  .aClass64_5047.anInt1211)));
			    if (class131_sub7_sub1_16_ != null
				&& class131_sub7_sub1 != class131_sub7_sub1_16_
				&& (i_17_ ^ 0xffffffff) <= (i_14_ ^ 0xffffffff)
				&& ((class131_sub7_sub1_16_.aClass64_5047
				     .anInt1211)
				    <= (-(i_17_ + -i_14_ >> 1717031)
					+ (class131_sub7_sub1.aClass64_5047
					   .anInt1211)))
				&& (i_18_ ^ 0xffffffff) <= (i_13_ ^ 0xffffffff)
				&& ((class131_sub7_sub1_16_.aClass64_5047
				     .anInt1211)
				    <= ((class131_sub7_sub1.aClass64_5047
					 .anInt1211)
					- (-i_13_ + i_18_ >> 339050791))))
				Class15.method170(i_6_, i_7_, (byte) -115,
						  Class47.anIntArray965[i_15_],
						  (class131_sub7_sub1_16_
						   .aClass64_5047));
			}
			for (int i_19_ = 0;
			     i_19_ < Class67_Sub1_Sub4.anInt3855; i_19_++) {
			    Class131_Sub7_Sub2 class131_sub7_sub2
				= (Class67_Sub5_Sub18
				   .aClass131_Sub7_Sub2Array4810
				   [Class3.anIntArray120[i_19_]]);
			    int i_20_
				= (class131_sub7_sub2.anInt3733
				   - (-64 + class131_sub7_sub2
						.method1887((byte) -66) * 64));
			    int i_21_
				= (class131_sub7_sub2.anInt3726
				   - (-1 + class131_sub7_sub2
					       .method1887((byte) -38)) * 64);
			    if (class131_sub7_sub2 != null
				&& (i_20_ ^ 0xffffffff) <= (i_14_ ^ 0xffffffff)
				&& ((class131_sub7_sub2.method1887((byte) -117)
				     ^ 0xffffffff)
				    >= ((-(i_20_ - i_14_ >> 1706395399)
					 + (class131_sub7_sub1.aClass64_5047
					    .anInt1211))
					^ 0xffffffff))
				&& i_21_ >= i_13_
				&& ((class131_sub7_sub2.method1887((byte) -49)
				     ^ 0xffffffff)
				    >= ((-(i_21_ + -i_13_ >> 1009721703)
					 + (class131_sub7_sub1.aClass64_5047
					    .anInt1211))
					^ 0xffffffff)))
				Class28.method264(i_7_, i_6_, 10455,
						  Class3.anIntArray120[i_19_],
						  class131_sub7_sub2);
			}
		    }
		    Class15.method170(i_6_, i_7_, (byte) -118, i_9_,
				      class131_sub7_sub1.aClass64_5047);
		}
		if ((i_8_ ^ 0xffffffff) == -1) {
		    Class131_Sub7_Sub2 class131_sub7_sub2
			= (Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810
			   [i_9_]);
		    if (((0x7f & class131_sub7_sub2.anInt3733 ^ 0xffffffff)
			 == -65)
			&& (class131_sub7_sub2.anInt3726 & 0x7f) == 64) {
			int i_22_
			    = (class131_sub7_sub2.anInt3733
			       - (-64
				  + (class131_sub7_sub2.method1887((byte) -63)
				     * 64)));
			int i_23_ = (class131_sub7_sub2.anInt3726
				     + -((-1 + class131_sub7_sub2
						   .method1887((byte) -85))
					 * 64));
			for (int i_24_ = 0;
			     ((i_24_ ^ 0xffffffff)
			      > (Class37.anInt794 ^ 0xffffffff));
			     i_24_++) {
			    Class131_Sub7_Sub1 class131_sub7_sub1
				= (Class128.aClass131_Sub7_Sub1Array2386
				   [Class47.anIntArray965[i_24_]]);
			    int i_25_ = (-((-1 + (class131_sub7_sub1
						  .aClass64_5047.anInt1211))
					   * 64)
					 + class131_sub7_sub1.anInt3733);
			    int i_26_ = (-((-1 + (class131_sub7_sub1
						  .aClass64_5047.anInt1211))
					   * 64)
					 + class131_sub7_sub1.anInt3726);
			    if (class131_sub7_sub1 != null
				&& (i_22_ ^ 0xffffffff) >= (i_25_ ^ 0xffffffff)
				&& (class131_sub7_sub1.aClass64_5047.anInt1211
				    <= (-(i_25_ - i_22_ >> -1985161401)
					+ class131_sub7_sub2
					      .method1887((byte) -88)))
				&& i_23_ <= i_26_
				&& (class131_sub7_sub1.aClass64_5047.anInt1211
				    <= (-(i_26_ + -i_23_ >> 149912839)
					+ class131_sub7_sub2
					      .method1887((byte) -30))))
				Class15.method170(i_6_, i_7_, (byte) -115,
						  Class47.anIntArray965[i_24_],
						  (class131_sub7_sub1
						   .aClass64_5047));
			}
			for (int i_27_ = 0;
			     ((Class67_Sub1_Sub4.anInt3855 ^ 0xffffffff)
			      < (i_27_ ^ 0xffffffff));
			     i_27_++) {
			    Class131_Sub7_Sub2 class131_sub7_sub2_28_
				= (Class67_Sub5_Sub18
				   .aClass131_Sub7_Sub2Array4810
				   [Class3.anIntArray120[i_27_]]);
			    int i_29_ = (class131_sub7_sub2_28_.anInt3733
					 - class131_sub7_sub2_28_
					       .method1887((byte) -98) * 64
					 + 64);
			    int i_30_ = (class131_sub7_sub2_28_.anInt3726 + 64
					 + -(class131_sub7_sub2_28_
						 .method1887((byte) -21)
					     * 64));
			    if (class131_sub7_sub2_28_ != null
				&& class131_sub7_sub2_28_ != class131_sub7_sub2
				&& (i_22_ ^ 0xffffffff) >= (i_29_ ^ 0xffffffff)
				&& (class131_sub7_sub2_28_
					.method1887((byte) -104)
				    <= (class131_sub7_sub2
					    .method1887((byte) -81)
					+ -(i_29_ - i_22_ >> -563334137)))
				&& (i_30_ ^ 0xffffffff) <= (i_23_ ^ 0xffffffff)
				&& (class131_sub7_sub2_28_
					.method1887((byte) -127)
				    <= (class131_sub7_sub2
					    .method1887((byte) -23)
					- (-i_23_ + i_30_ >> 1517112167))))
				Class28.method264(i_7_, i_6_, 10455,
						  Class3.anIntArray120[i_27_],
						  class131_sub7_sub2_28_);
			}
		    }
		    Class28.method264(i_7_, i_6_, 10455, i_9_,
				      class131_sub7_sub2);
		}
		if ((i_8_ ^ 0xffffffff) == -4) {
		    Class50 class50
			= (Class67_Sub5_Sub2.aClass50ArrayArrayArray4471
			   [Canvas_Sub1.anInt59][i_6_][i_7_]);
		    if (class50 != null) {
			for (Class67_Sub5_Sub2 class67_sub5_sub2
				 = ((Class67_Sub5_Sub2)
				    class50.method433((byte) -84));
			     class67_sub5_sub2 != null;
			     class67_sub5_sub2 = ((Class67_Sub5_Sub2)
						  class50.method443(-114))) {
			    int i_31_ = (class67_sub5_sub2.aClass131_Sub4_4482
					 .anInt3638);
			    Class76 class76
				= PacketParser.method1596(i_31_, -28322);
			    if ((Login.anInt1612 ^ 0xffffffff) == -2) {
				Class120.method1664
				    ((byte) 116,
				     (Class67_Sub1_Sub27.method744
				      ((new RSString[]
					{ Class67_Sub1_Sub6.aRSString_3895,
					  Class134.aRSString_2474,
					  class76.itemName }),
				       -127)),
				     (short) 36, Login.aRSString_1615, i_6_,
				     i_7_, (long) i_31_,
				     Class33_Sub2.anInt2783);
				Class139.anInt2534++;
			    } else if (Class67_Sub20.aBoolean3156) {
				Class67_Sub5_Sub17 class67_sub5_sub17
				    = (Class99.anInt1954 == -1 ? null
				       : Class8.method103(-86,
							  Class99.anInt1954));
				if ((Class67_Sub5_Sub14.anInt4733 & 0x1
				     ^ 0xffffffff) != -1
				    && (class67_sub5_sub17 == null
					|| (((class76.method1390
					      (class67_sub5_sub17.anInt4785,
					       Class99.anInt1954, (byte) -123))
					     ^ 0xffffffff)
					    != (class67_sub5_sub17.anInt4785
						^ 0xffffffff)))) {
				    Class120.method1664
					((byte) 124,
					 (Class67_Sub1_Sub27.method744
					  ((new RSString[]
					    { Class9.aRSString_369,
					      Class134.aRSString_2474,
					      class76.itemName }),
					   -124)),
					 (short) 24,
					 Class67_Sub26.aRSString_3288, i_6_,
					 i_7_, (long) i_31_,
					 Class67_Sub5_Sub3.anInt4487);
				    Class67_Sub1_Sub31.anInt4293++;
				}
			    } else {
				RSString[] RSStrings = class76.aRSStringArray1528;
				if (Class76.aBoolean1515)
				    RSStrings = Class49.method424(RSStrings, 0);
				for (int i_32_ = 4; (i_32_ ^ 0xffffffff) <= -1;
				     i_32_--) {
				    if (RSStrings != null
					&& RSStrings[i_32_] != null) {
					Class118.anInt2238++;
					short i_33_ = 0;
					if (i_32_ == 0)
					    i_33_ = (short) 21;
					if ((i_32_ ^ 0xffffffff) == -2)
					    i_33_ = (short) 25;
					int i_34_ = -1;
					if ((i_32_ ^ 0xffffffff)
					    == (class76.anInt1509
						^ 0xffffffff))
					    i_34_ = class76.anInt1503;
					if (i_32_ == 2)
					    i_33_ = (short) 7;
					if ((i_32_ ^ 0xffffffff)
					    == (class76.anInt1556
						^ 0xffffffff))
					    i_34_ = class76.anInt1554;
					if (i_32_ == 3)
					    i_33_ = (short) 35;
					if ((i_32_ ^ 0xffffffff) == -5)
					    i_33_ = (short) 43;
					Class120.method1664
					    ((byte) 125,
					     (Class67_Sub1_Sub27.method744
					      ((new RSString[]
						{ Class43.aRSString_906,
						  class76.itemName }),
					       -99)),
					     i_33_, RSStrings[i_32_], i_6_,
					     i_7_, (long) i_31_, i_34_);
				    }
				}
				Class67_Sub5_Sub5.anInt4524++;
				Class120.method1664
				    ((byte) 109,
				     (Class67_Sub1_Sub27.method744
				      (new RSString[] { Class43.aRSString_906,
						       class76.itemName },
				       -118)),
				     (short) 1006, Class72.aRSString_1442, i_6_,
				     i_7_, (long) i_31_, Class85.anInt1746);
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method960(Class67 arg0, Class67 arg1, int arg2) {
	do {
	    try {
		if (arg0.aClass67_1349 != null)
		    arg0.method606((byte) -118);
		arg0.aClass67_1349 = arg1.aClass67_1349;
		anInt4719++;
		arg0.aClass67_1340 = arg1;
		arg0.aClass67_1349.aClass67_1340 = arg0;
		arg0.aClass67_1340.aClass67_1349 = arg0;
		if (arg2 == 27578)
		    break;
		aRSString_4707 = null;
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   ("pg.C("
						    + (arg0 != null ? "{...}"
						       : "null")
						    + ','
						    + (arg1 != null ? "{...}"
						       : "null")
						    + ',' + arg2 + ')'));
	    }
	    break;
	} while (false);
    }
    
    public int method961(int arg0, int arg1) {
	anInt4718++;
	if (anIntArray4721 == null)
	    return -1;
	if (arg0 != 64)
	    return -63;
	for (int i = 0;
	     (anIntArray4721.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
	    if (arg1 == anIntArray4715[i])
		return anIntArray4721[i];
	}
	return -1;
    }
    
    public void method962(int arg0, Stream arg1) {
	if (arg0 < 37)
	    anInt4714 = -11;
	for (;;) {
	    int i = arg1.readByte((byte) -36);
	    if (i == 0)
		break;
	    method965(arg1, i, true);
	}
	anInt4716++;
    }
    
    public int method963(int arg0, int arg1) {
	anInt4709++;
	if (anIntArray4724 == null)
	    return -1;
	for (int i = 0; i < anIntArray4724.length; i++) {
	    if ((anIntArray4713[i] ^ 0xffffffff) == (arg0 ^ 0xffffffff))
		return anIntArray4724[i];
	}
	if (arg1 != -64)
	    return -65;
	return -1;
    }
    
    public static Class104 method964(int arg0, int arg1, int arg2) {
	Class67_Sub24 class67_sub24
	    = Class76.aClass67_Sub24ArrayArrayArray1578[arg0][arg1][arg2];
	if (class67_sub24 == null || class67_sub24.aClass104_3216 == null)
	    return null;
	return class67_sub24.aClass104_3216;
    }
    
    public void method965(Stream arg0, int arg1, boolean arg2) {
	if (arg1 == 1)
	    aRSString_4727 = arg0.readRSString(-1);
	else if ((arg1 ^ 0xffffffff) != -3) {
	    if (arg1 == 3) {
		int i = arg0.readByte((byte) -100);
		anIntArray4724 = new int[i];
		anIntArray4713 = new int[i];
		for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_35_++) {
		    anIntArray4724[i_35_] = arg0.readUShort(-2386);
		    anIntArray4713[i_35_]
			= Class2.method66(arg0.readByte2((byte) 1), 255);
		}
	    }
	} else {
	    int i = arg0.readByte((byte) -127);
	    anIntArray4715 = new int[i];
	    anIntArray4721 = new int[i];
	    for (int i_36_ = 0; i > i_36_; i_36_++) {
		anIntArray4721[i_36_] = arg0.readUShort(-2386);
		anIntArray4715[i_36_]
		    = Class2.method66(arg0.readByte2((byte) 1), 255);
	    }
	}
	if (arg2 == true)
	    anInt4710++;
    }
    
    public static void method966(byte arg0) {
	if (arg0 == -3) {
	    anIntArray4722 = null;
	    aRSString_4720 = null;
	    aRSString_4717 = null;
	    aRSString_4708 = null;
	    aRSString_4712 = null;
	    connectServerIP = null;
	    aRSString_4707 = null;
	}
    }
    
    static {
	anIntArray4722 = new int[14];
	aRSString_4712 = Class134.method1914("Allocated memory", (byte) 28);
	aRSString_4707 = aRSString_4712;
	aRSString_4720 = Class134.method1914("::noclip", (byte) 22);
    }
}
