/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_Sub1 extends OutputStream
{
    public static int anInt84;
    public static Class9 aClass9_85;
    public static int anInt86;
    public static int anInt87 = 100;
    public static int[] anIntArray88;
    public static int anInt89;
    public static Class137 aClass137_90;
    public static int anInt91;
    public static int anInt92;
    public static int[] anIntArray93;
    public static RSString aRSString_94
	= Class134.method1914("Connect-B au serveur de mise -9 jour",
			      (byte) 4);
    public static int anInt95;
    public static boolean[] aBooleanArray96 = new boolean[100];
    
    public static void method55(int arg0, int arg1, int arg2, Class7 arg3) {
	anInt84++;
	if (arg2 != -1)
	    method57((byte) -36);
	if (arg3.anInt166 == 1) {
	    Class120.method1664((byte) 125, Class67_Sub5_Sub5.aRSString_4523,
				(short) 46, arg3.aRSString_270, 0,
				arg3.anInt301, 0L, -1);
	    Class96.anInt1917++;
	}
	if ((arg3.anInt166 ^ 0xffffffff) == -3
	    && !Class67_Sub20.aBoolean3156) {
	    RSString RSString = Class55_Sub1.method466(320, arg3);
	    if (RSString != null) {
		Class67_Sub1_Sub18.anInt4122++;
		Class120.method1664
		    ((byte) 120,
		     Class67_Sub1_Sub27.method744((new RSString[]
						   { (Class67_Sub1_Sub18
						      .aRSString_4108),
						     arg3.aRSString_258 }),
						  arg2 + -123),
		     (short) 6, RSString, -1, arg3.anInt301, 0L, -1);
	    }
	}
	if (arg3.anInt166 == 3) {
	    Class120.method1664((byte) 122, Class67_Sub5_Sub5.aRSString_4523,
				(short) 3, Class67_Sub5_Sub3.aRSString_4498, 0,
				arg3.anInt301, 0L, -1);
	    Class120.anInt2286++;
	}
	if (arg3.anInt166 == 4) {
	    Class67_Sub1_Sub36.anInt4374++;
	    Class120.method1664((byte) 119, Class67_Sub5_Sub5.aRSString_4523,
				(short) 13, arg3.aRSString_270, 0,
				arg3.anInt301, 0L, -1);
	}
	if ((arg3.anInt166 ^ 0xffffffff) == -6) {
	    Class61.anInt1143++;
	    Class120.method1664((byte) 118, Class67_Sub5_Sub5.aRSString_4523,
				(short) 10, arg3.aRSString_270, 0,
				arg3.anInt301, 0L, -1);
	}
	if ((arg3.anInt166 ^ 0xffffffff) == -7
	    && Class16.aClass7_470 == null) {
	    Class120.method1664((byte) 124, Class67_Sub5_Sub5.aRSString_4523,
				(short) 38, arg3.aRSString_270, -1,
				arg3.anInt301, 0L, -1);
	    Class131.anInt2426++;
	}
	if (arg3.anInt227 == 2) {
	    int i = 0;
	    for (int i_0_ = 0;
		 (i_0_ ^ 0xffffffff) > (arg3.anInt199 ^ 0xffffffff); i_0_++) {
		for (int i_1_ = 0; i_1_ < arg3.anInt193; i_1_++) {
		    int i_2_ = i_1_ * (arg3.anInt326 + 32);
		    int i_3_ = i_0_ * (32 - -arg3.anInt213);
		    if ((i ^ 0xffffffff) > -21) {
			i_2_ += arg3.anIntArray237[i];
			i_3_ += arg3.anIntArray245[i];
		    }
		    if ((i_2_ ^ 0xffffffff) >= (arg1 ^ 0xffffffff)
			&& arg0 >= i_3_ && i_2_ - -32 > arg1
			&& (32 + i_3_ ^ 0xffffffff) < (arg0 ^ 0xffffffff)) {
			Class55.aClass7_1089 = arg3;
			Class101.anInt1989 = i;
			if ((arg3.anIntArray264[i] ^ 0xffffffff) < -1) {
			    Class67_Sub14 class67_sub14
				= client.method31(arg3);
			    Class76 class76
				= PacketParser.method1596((arg3.anIntArray264[i]
						       + -1),
						      -28322);
			    if (Login.anInt1612 != 1
				|| !class67_sub14.method1230(3867171)) {
				if (!Class67_Sub20.aBoolean3156
				    || !class67_sub14
					    .method1230(arg2 + 3867172)) {
				    Class55_Sub3_Sub1.anInt3803++;
				    RSString[] RSStrings
					= class76.itemActions;
				    if (Class76.aBoolean1515)
					RSStrings
					    = Class49.method424(RSStrings, 0);
				    if (class67_sub14.method1230(3867171)) {
					for (int i_4_ = 4;
					     (i_4_ ^ 0xffffffff) <= -4;
					     i_4_--) {
					    if (RSStrings != null
						&& RSStrings[i_4_] != null) {
						short i_5_;
						if (i_4_ == 3)
						    i_5_ = (short) 26;
						else
						    i_5_ = (short) 23;
						Class120.method1664
						    ((byte) 126,
						     (Class67_Sub1_Sub27
							  .method744
						      ((new RSString[]
							{ Class43.aRSString_906,
							  (class76
							   .itemName) }),
						       -114)),
						     i_5_, RSStrings[i_4_], i,
						     arg3.anInt301,
						     (long) class76.anInt1534,
						     -1);
						Class10.anInt397++;
					    }
					}
				    }
				    if (class67_sub14.method1226(3867171)) {
					Class120.method1664
					    ((byte) 118,
					     (Class67_Sub1_Sub27.method744
					      ((new RSString[]
						{ Class43.aRSString_906,
						  class76.itemName }),
					       arg2 ^ 0x5b)),
					     (short) 12, Login.aRSString_1615,
					     i, arg3.anInt301,
					     (long) class76.anInt1534,
					     Class33_Sub2.anInt2783);
					Class67_Sub1_Sub36.anInt4363++;
				    }
				    if (class67_sub14.method1230(3867171)
					&& RSStrings != null) {
					for (int i_6_ = 2;
					     (i_6_ ^ 0xffffffff) <= -1;
					     i_6_--) {
					    if (RSStrings[i_6_] != null) {
						Class128.anInt2378++;
						short i_7_ = 0;
						if ((i_6_ ^ 0xffffffff) == -1)
						    i_7_ = (short) 30;
						if ((i_6_ ^ 0xffffffff) == -2)
						    i_7_ = (short) 18;
						if ((i_6_ ^ 0xffffffff) == -3)
						    i_7_ = (short) 44;
						Class120.method1664
						    ((byte) 117,
						     (Class67_Sub1_Sub27
							  .method744
						      ((new RSString[]
							{ Class43.aRSString_906,
							  (class76
							   .itemName) }),
						       -97)),
						     i_7_, RSStrings[i_6_], i,
						     arg3.anInt301,
						     (long) class76.anInt1534,
						     -1);
					    }
					}
				    }
				    RSStrings = arg3.aRSStringArray170;
				    if (Class76.aBoolean1515)
					RSStrings = Class49.method424(RSStrings,
								     arg2 + 1);
				    if (RSStrings != null) {
					for (int i_8_ = 4; i_8_ >= 0; i_8_--) {
					    if (RSStrings[i_8_] != null) {
						Class58.anInt1119++;
						short i_9_ = 0;
						if ((i_8_ ^ 0xffffffff) == -1)
						    i_9_ = (short) 42;
						if (i_8_ == 1)
						    i_9_ = (short) 50;
						if ((i_8_ ^ 0xffffffff) == -3)
						    i_9_ = (short) 37;
						if ((i_8_ ^ 0xffffffff) == -4)
						    i_9_ = (short) 1;
						if (i_8_ == 4)
						    i_9_ = (short) 2;
						Class120.method1664
						    ((byte) 115,
						     (Class67_Sub1_Sub27
							  .method744
						      ((new RSString[]
							{ Class43.aRSString_906,
							  (class76
							   .itemName) }),
						       -124)),
						     i_9_, RSStrings[i_8_], i,
						     arg3.anInt301,
						     (long) class76.anInt1534,
						     -1);
					    }
					}
				    }
				    Class120.method1664
					((byte) 126,
					 (Class67_Sub1_Sub27.method744
					  ((new RSString[]
					    { Class43.aRSString_906,
					      class76.itemName }),
					   arg2 + -111)),
					 (short) 1005, Class72.aRSString_1442,
					 i, arg3.anInt301,
					 (long) class76.anInt1534,
					 Class85.anInt1746);
				} else {
				    Class67_Sub5_Sub17 class67_sub5_sub17
					= (((Class99.anInt1954 ^ 0xffffffff)
					    == 0)
					   ? null
					   : Class8.method103(-107,
							      (Class99
							       .anInt1954)));
				    if (((Class67_Sub5_Sub14.anInt4733 & 0x10)
					 != 0)
					&& (class67_sub5_sub17 == null
					    || (((class76.method1390
						  ((class67_sub5_sub17
						    .anInt4785),
						   Class99.anInt1954,
						   (byte) -123))
						 ^ 0xffffffff)
						!= ((class67_sub5_sub17
						     .anInt4785)
						    ^ 0xffffffff)))) {
					Class19.anInt494++;
					Class120.method1664
					    ((byte) 120,
					     (Class67_Sub1_Sub27.method744
					      ((new RSString[]
						{ Class9.aRSString_369,
						  Class134.aRSString_2474,
						  class76.itemName }),
					       arg2 ^ 0x6c)),
					     (short) 15,
					     Class67_Sub26.aRSString_3288, i,
					     arg3.anInt301,
					     (long) class76.anInt1534,
					     Class67_Sub5_Sub3.anInt4487);
				    }
				}
			    } else if (((Class67_Sub1_Sub31.anInt4289
					 ^ 0xffffffff)
					!= (arg3.anInt301 ^ 0xffffffff))
				       || ((Class102.slotIndex ^ 0xffffffff)
					   != (i ^ 0xffffffff))) {
				Class30.anInt699++;
				Class120.method1664
				    ((byte) 123,
				     (Class67_Sub1_Sub27.method744
				      ((new RSString[]
					{ Class67_Sub1_Sub6.aRSString_3895,
					  Class134.aRSString_2474,
					  class76.itemName }),
				       arg2 + -110)),
				     (short) 39, Login.aRSString_1615, i,
				     arg3.anInt301, (long) class76.anInt1534,
				     -1);
			    }
			}
		    }
		    i++;
		}
	    }
	}
	if (arg3.aBoolean185) {
	    if (!Class67_Sub20.aBoolean3156) {
		for (int i = 9; (i ^ 0xffffffff) <= -6; i--) {
		    RSString RSString = PacketParser.method1599(i, 0, arg3);
		    if (RSString != null) {
			Class120.method1664((byte) 124, arg3.aRSString_178,
					    (short) 1001, RSString,
					    arg3.anInt266, arg3.anInt301,
					    (long) (i + 1),
					    Class21.method197((byte) -121,
							      arg3, i));
			Class67_Sub5_Sub11_Sub2.anInt5147++;
		    }
		}
		RSString RSString = Class55_Sub1.method466(320, arg3);
		if (RSString != null) {
		    Class67_Sub1_Sub18.anInt4122++;
		    Class120.method1664((byte) 121, arg3.aRSString_178,
					(short) 6, RSString, arg3.anInt266,
					arg3.anInt301, 0L, -1);
		}
		for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
		    RSString RSString_10_ = PacketParser.method1599(i, 0, arg3);
		    if (RSString_10_ != null) {
			Class120.method1664((byte) 115, arg3.aRSString_178,
					    (short) 59, RSString_10_,
					    arg3.anInt266, arg3.anInt301,
					    (long) (i - -1),
					    Class21.method197((byte) -98, arg3,
							      i));
			Class67_Sub5_Sub11_Sub2.anInt5147++;
		    }
		}
		if (client.method31(arg3).method1232((byte) -103)) {
		    Class120.method1664((byte) 110,
					Class67_Sub5_Sub5.aRSString_4523,
					(short) 38, Class34.aRSString_744,
					arg3.anInt266, arg3.anInt301, 0L, -1);
		    Class131.anInt2426++;
		}
	    } else if (client.method31(arg3).method1231(arg2 ^ ~0x3280)
		       && (0x20 & Class67_Sub5_Sub14.anInt4733) != 0) {
		Class120.method1664
		    ((byte) 122,
		     Class67_Sub1_Sub27.method744((new RSString[]
						   { Class9.aRSString_369,
						     (Class67_Sub1_Sub5
						      .aRSString_3865),
						     arg3.aRSString_178 }),
						  -108),
		     (short) 22, Class67_Sub26.aRSString_3288, arg3.anInt266,
		     arg3.anInt301, 0L, Class67_Sub5_Sub3.anInt4487);
		Class67_Sub1_Sub17.anInt4101++;
	    }
	}
    }
    
    public static void method56(Class131_Sub7_Sub2 arg0, boolean arg1) {
	anInt92++;
	Class67_Sub10 class67_sub10
	    = ((Class67_Sub10)
	       (Class67_Sub12.aClass92_3036.method1489
		((byte) -14, arg0.playerName.method501((byte) -16))));
	if (arg1 == false) {
	    if (class67_sub10 != null)
		class67_sub10.method1117(-121);
	    else
		Class24.method221(arg0.smallY[0], null, 128,
				  Canvas_Sub1.anInt59, arg0,
				  arg0.smallX[0], null, 0);
	}
    }
    
    public static void method57(byte arg0) {
	int i
	    = Class122.aClass131_Sub7_Sub2_2309.anInt3733 - -client.anInt2745;
	anInt95++;
	int i_11_ = (Class122.aClass131_Sub7_Sub2_2309.anInt3726
		     + Class126_Sub1.anInt3417);
	if ((-i + Class67_Sub5_Sub13.anInt4714 ^ 0xffffffff) > 499
	    || (Class67_Sub5_Sub13.anInt4714 - i ^ 0xffffffff) < -501
	    || (-i_11_ + Class6.anInt153 ^ 0xffffffff) > 499
	    || -i_11_ + Class6.anInt153 > 500) {
	    Class6.anInt153 = i_11_;
	    Class67_Sub5_Sub13.anInt4714 = i;
	}
	if ((Class6.anInt153 ^ 0xffffffff) != (i_11_ ^ 0xffffffff))
	    Class6.anInt153 += (-Class6.anInt153 + i_11_) / 16;
	if (Class67_Sub5_Sub13.anInt4714 != i)
	    Class67_Sub5_Sub13.anInt4714
		+= (i - Class67_Sub5_Sub13.anInt4714) / 16;
	if (arg0 >= 109) {
	    if (Class53.aBoolean1057) {
		for (int i_12_ = 0; i_12_ < Class67_Sub20.anInt3168; i_12_++) {
		    int i_13_ = Class67_Sub1_Sub28.anIntArray4255[i_12_];
		    if (i_13_ == 98)
			Class67_Sub21.anInt3175
			    = 47 + Class67_Sub21.anInt3175 & ~0xf;
		    else if ((i_13_ ^ 0xffffffff) == -100)
			Class67_Sub21.anInt3175
			    = Class67_Sub21.anInt3175 + -17 & ~0xf;
		    else if ((i_13_ ^ 0xffffffff) == -97)
			Class67_Sub5_Sub4.anInt4504
			    = Class67_Sub5_Sub4.anInt4504 + -65 & ~0x7f;
		    else if ((i_13_ ^ 0xffffffff) == -98)
			Class67_Sub5_Sub4.anInt4504
			    = ~0x7f & Class67_Sub5_Sub4.anInt4504 - -191;
		}
	    } else {
		if (Class131_Sub7.aBooleanArray3698[96])
		    Class67_Sub20.anInt3165
			+= (-24 + -Class67_Sub20.anInt3165) / 2;
		else if (!Class131_Sub7.aBooleanArray3698[97])
		    Class67_Sub20.anInt3165 /= 2;
		else
		    Class67_Sub20.anInt3165
			+= (-Class67_Sub20.anInt3165 + 24) / 2;
		if (!Class131_Sub7.aBooleanArray3698[98]) {
		    if (!Class131_Sub7.aBooleanArray3698[99])
			Class19.anInt483 /= 2;
		    else
			Class19.anInt483 += (-12 - Class19.anInt483) / 2;
		} else
		    Class19.anInt483 += (12 + -Class19.anInt483) / 2;
		Class67_Sub5_Sub4.anInt4504 += Class67_Sub20.anInt3165 / 2;
		Class67_Sub21.anInt3175 += Class19.anInt483 / 2;
	    }
	    Class103.method1559(0);
	}
    }
    
    public void write(int arg0) throws IOException {
	anInt86++;
	throw new IOException();
    }
    
    public static void method58(Class41 arg0, int arg1, int arg2, int arg3,
				boolean arg4, int arg5) {
	anInt89++;
	if ((Class5.anInt144 ^ 0xffffffff) > -51) {
	    if (arg2 >= -104)
		anIntArray93 = null;
	    if (arg0.anIntArrayArray882 != null
		&& ((arg0.anIntArrayArray882.length ^ 0xffffffff)
		    < (arg5 ^ 0xffffffff))
		&& arg0.anIntArrayArray882[arg5] != null) {
		int i = arg0.anIntArrayArray882[arg5][0];
		int i_14_ = i >> 938257640;
		int i_15_ = i & 0x1f;
		if (arg0.anIntArrayArray882[arg5].length > 1) {
		    int i_16_ = (int) (Math.random()
				       * (double) (arg0.anIntArrayArray882
						   [arg5]).length);
		    if ((i_16_ ^ 0xffffffff) < -1)
			i_14_ = arg0.anIntArrayArray882[arg5][i_16_];
		}
		int i_17_ = i >> 1241276677 & 0x7;
		if (i_15_ == 0) {
		    if (arg4)
			Class132.method1904(true, i_17_, 0, i_14_);
		} else if (Class27.anInt644 != 0) {
		    int i_18_ = (arg1 - 64) / 128;
		    int i_19_ = (-64 + arg3) / 128;
		    Class67_Sub6.anIntArray2887[Class5.anInt144] = i_14_;
		    Class67_Sub1_Sub32.anIntArray4299[Class5.anInt144] = i_17_;
		    Class126.anIntArray2361[Class5.anInt144] = 0;
		    Class103.aClass135Array2022[Class5.anInt144] = null;
		    Class50.anIntArray1016[Class5.anInt144]
			= i_15_ + ((i_19_ << 1184373968)
				   + (i_18_ << 1318914024));
		    Class5.anInt144++;
		}
	    }
	}
    }
    
    public static int method59(int arg0) {
	anInt91++;
	if (Class74.aBoolean1495)
	    return 0;
	if (arg0 != 0)
	    return 64;
	if (!Class32.method288(true))
	    return 1;
	if (Class100.aBoolean1977)
	    return 2;
	return 1;
    }
    
    public static void method60(byte arg0) {
	if (arg0 != 62)
	    aRSString_94 = null;
	anIntArray88 = null;
	aRSString_94 = null;
	aClass9_85 = null;
	aBooleanArray96 = null;
	anIntArray93 = null;
	aClass137_90 = null;
    }
    
    static {
	anIntArray88 = new int[200];
	anIntArray93 = new int[2];
	aClass137_90 = new Class137(128);
    }
}
