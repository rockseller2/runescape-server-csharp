/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

public class InputStream_Sub1 extends InputStream
{
    public static int anInt69;
    public static int anInt70;
    public static boolean aBoolean71;
    public static int[] anIntArray72 = { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    public static int anInt73;
    public static int anInt74;
    public static int[][][] anIntArrayArrayArray75;
    public static int anInt76;
    public static boolean aBoolean77;
    public static boolean aBoolean78;
    public static RSString aRSString_79;
    public static int anInt80;
    public static int anInt81;
    public static int anInt82;
    public static int anInt83;
    
    public static RSString method47(int arg0, boolean arg1) {
	if (arg1 != true)
	    return null;
	anInt80++;
	return Class44.method385(false, 0, arg0, 10);
    }
    
    public static void method48(int arg0) {
	aRSString_79 = null;
	if (arg0 != 0)
	    method47(-53, true);
	anIntArray72 = null;
	anIntArrayArrayArray75 = null;
    }
    
    public static void method49(int arg0) {
	anInt74++;
	if (arg0 != -22028)
	    method50(106, -37);
	for (int i = 0; i < Class126_Sub2.anInt3439; i++) {
	    int i_0_ = Class61.anIntArray1142[i];
	    Class131_Sub7_Sub2 class131_sub7_sub2
		= Class67_Sub5_Sub18.aClass131_Sub7_Sub2Array4810[i_0_];
	    int i_1_ = Class54.aPacketStream_1069.readByte((byte) -115);
	    if ((0x10 & i_1_) != 0)
		i_1_ += (Class54.aPacketStream_1069.readByte((byte) -70)
			 << 1897009384);
	    Class126_Sub2.playerUpdateMasks(i_0_, class131_sub7_sub2, arg0 + 21910,
				     i_1_);
	}
    }
    
    public int read() {
	Class67_Sub1_Sub23.method726(-113, 30000L);
	anInt76++;
	return -1;
    }
    
    public static void method50(int arg0, int arg1) {
	int i = 41 / ((26 - arg1) / 34);
	anInt83++;
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg0, false, 2);
	class67_sub5_sub3.method844(0);
    }
    
    public static void method51(int arg0, Class7[] arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				boolean arg8, int arg9) {
	anInt82++;
	Class121.method1685(arg9, arg4, arg6, arg3);
	Class26.method239();
	for (int i = 0; arg1.length > i; i++) {
	    Class7 class7 = arg1[i];
	    if (class7 != null
		&& ((class7.anInt174 ^ 0xffffffff) == (arg2 ^ 0xffffffff)
		    || (arg2 == -1412584499
			&& class7 == Class67_Sub5_Sub12.aClass7_4699))) {
		int i_2_;
		if (arg5 == -1) {
		    Class67_Sub1_Sub17.anIntArray4102[Class67_Sub10.anInt3001]
			= arg7 + class7.anInt221;
		    Class67_Sub1_Sub25.anIntArray4223[Class67_Sub10.anInt3001]
			= arg0 + class7.anInt251;
		    Class50.anIntArray1020[Class67_Sub10.anInt3001]
			= class7.anInt189;
		    Class67_Sub10.anIntArray3011[Class67_Sub10.anInt3001]
			= class7.anInt194;
		    i_2_ = Class67_Sub10.anInt3001++;
		} else
		    i_2_ = arg5;
		class7.anInt234 = i_2_;
		class7.anInt204 = Class67_Sub1_Sub9.anInt3952;
		if (!class7.aBoolean185 || !client.method33(class7)) {
		    if (class7.anInt287 > 0)
			Class67_Sub29.method1314(12449, class7);
		    int i_3_ = arg7 + class7.anInt221;
		    int i_4_ = class7.anInt205;
		    int i_5_ = class7.anInt251 - -arg0;
		    if (Class128.aBoolean2377
			&& (client.method31(class7).anInt3060 != 0
			    || class7.anInt227 == 0)
			&& i_4_ > 127)
			i_4_ = 127;
		    if (Class67_Sub5_Sub12.aClass7_4699 == class7) {
			if ((arg2 ^ 0xffffffff) != 1412584498
			    && !class7.aBoolean290) {
			    Class67_Sub1_Sub7.anInt3912 = arg7;
			    Class68.aClass7Array1366 = arg1;
			    Class84.anInt1704 = arg0;
			    continue;
			}
			if (!class7.aBoolean290)
			    i_4_ = 128;
			if (Class37.aBoolean798
			    && Class131_Sub7_Sub1.aBoolean5056) {
			    int i_6_ = Class67_Sub5_Sub17.anInt4786;
			    i_6_ -= Class67_Sub3.anInt2852;
			    if (Class67_Sub19.anInt3146 > i_6_)
				i_6_ = Class67_Sub19.anInt3146;
			    if ((Class67_Sub19.anInt3146
				 + Class67_Sub1_Sub34.aClass7_4337.anInt189)
				< class7.anInt189 + i_6_)
				i_6_ = (-class7.anInt189
					+ ((Class67_Sub1_Sub34.aClass7_4337
					    .anInt189)
					   + Class67_Sub19.anInt3146));
			    i_3_ = i_6_;
			    int i_7_ = Class67_Sub1_Sub22.anInt4172;
			    i_7_ -= Class67_Sub3.anInt2844;
			    if ((Class95.anInt1906 ^ 0xffffffff)
				< (i_7_ ^ 0xffffffff))
				i_7_ = Class95.anInt1906;
			    if (((Class67_Sub1_Sub34.aClass7_4337.anInt194
				  + Class95.anInt1906)
				 ^ 0xffffffff)
				> (i_7_ - -class7.anInt194 ^ 0xffffffff))
				i_7_
				    = (Class67_Sub1_Sub34.aClass7_4337.anInt194
				       + (Class95.anInt1906
					  + -class7.anInt194));
			    i_5_ = i_7_;
			}
		    }
		    int i_8_;
		    int i_9_;
		    int i_10_;
		    int i_11_;
		    if ((class7.anInt227 ^ 0xffffffff) == -3) {
			i_8_ = arg4;
			i_11_ = arg3;
			i_10_ = arg6;
			i_9_ = arg9;
		    } else {
			i_8_ = ((arg4 ^ 0xffffffff) > (i_5_ ^ 0xffffffff)
				? i_5_ : arg4);
			i_9_ = arg9 >= i_3_ ? arg9 : i_3_;
			int i_12_ = i_5_ - -class7.anInt194;
			int i_13_ = class7.anInt189 + i_3_;
			if (class7.anInt227 == 9) {
			    i_13_++;
			    i_12_++;
			}
			i_10_ = arg6 > i_13_ ? i_13_ : arg6;
			i_11_ = ((arg3 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)
				 ? i_12_ : arg3);
		    }
		    if (!class7.aBoolean185
			|| ((i_9_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)
			    && (i_11_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff))) {
			if ((class7.anInt287 ^ 0xffffffff) != -1) {
			    if ((class7.anInt287 ^ 0xffffffff) == -1338) {
				Class100.anInt1974 = i_3_;
				Class13.aClass7_436 = class7;
				Class65.anInt1292 = i_5_;
				Class67_Sub1_Sub15.method683((byte) 118,
							     class7.anInt194,
							     class7.anInt189,
							     i_5_, i_3_,
							     ((class7.anInt287
							       ^ 0xffffffff)
							      == -1404));
				Class121.method1685(arg9, arg4, arg6, arg3);
				continue;
			    }
			    if (class7.anInt287 == 1338) {
				if (class7.method87(22710)) {
				    Class67_Sub5_Sub4_Sub1.method854(i_3_,
								     class7,
								     i_2_, 32,
								     i_5_);
				    Class121.method1685(arg9, arg4, arg6,
							arg3);
				    if ((Class67_Sub1_Sub13.anInt4019 == 0
					 || (Class67_Sub1_Sub13.anInt4019
					     ^ 0xffffffff) == -4)
					&& !Class67_Sub9.aBoolean2980
					&& i_9_ <= Class136.anInt2486
					&& ((Class129.anInt2398 ^ 0xffffffff)
					    <= (i_8_ ^ 0xffffffff))
					&& Class136.anInt2486 < i_10_
					&& ((i_11_ ^ 0xffffffff)
					    < (Class129.anInt2398
					       ^ 0xffffffff))) {
					int i_14_ = -i_5_ + Class129.anInt2398;
					int i_15_ = -i_3_ + Class136.anInt2486;
					int i_16_
					    = class7.anIntArray179[i_14_];
					if (i_16_ <= i_15_
					    && ((i_15_ ^ 0xffffffff)
						>= (i_16_ + (class7
							     .anIntArray337
							     [i_14_])
						    ^ 0xffffffff))) {
					    i_14_ -= class7.anInt194 / 2;
					    int i_17_
						= 0x7ff & ((Class67_Sub5_Sub4
							    .anInt4504)
							   + Class5.anInt137);
					    i_15_ -= class7.anInt189 / 2;
					    int i_18_
						= Class26.anIntArray612[i_17_];
					    int i_19_
						= Class26.anIntArray617[i_17_];
					    i_19_ = ((256 + (Class67_Sub1_Sub15
							     .anInt4063))
						     * i_19_) >> 1728692072;
					    i_18_ = (((Class67_Sub1_Sub15
						       .anInt4063)
						      - -256) * i_18_
						     >> 1204128360);
					    int i_20_ = ((i_18_ * i_15_
							  + i_14_ * i_19_)
							 >> -210355477);
					    int i_21_ = ((-(i_15_ * i_19_)
							  + i_14_ * i_18_)
							 >> 1571183563);
					    int i_22_
						= ((i_20_
						    + (Class122
						       .aClass131_Sub7_Sub2_2309
						       .anInt3733))
						   >> 384970055);
					    int i_23_
						= ((Class122
						    .aClass131_Sub7_Sub2_2309
						    .anInt3726) - i_21_
						   >> -995944313);
					    if (!Class67_Sub20.aBoolean3156
						|| ((Class67_Sub5_Sub14
						     .anInt4733) & 0x40
						    ^ 0xffffffff) == -1) {
						if (Class69.anInt1381 == 1)
						    Class120.method1664
							((byte) 118,
							 (Class67_Sub5_Sub5
							  .aRSString_4523),
							 (short) 5,
							 (Class119
							  .aRSString_2253),
							 i_22_, i_23_, 1L, -1);
						Class120.method1664
						    ((byte) 109,
						     (Class67_Sub5_Sub5
						      .aRSString_4523),
						     (short) 57,
						     (Class67_Sub1_Sub17
						      .aRSString_4104),
						     i_22_, i_23_, 1L, -1);
					    } else {
						Class7 class7_24_
						    = (Class67_Sub5_Sub14
							   .method972
						       ((Class67_Sub5_Sub6
							 .anInt4558),
							18062,
							(Class67_Sub1_Sub24
							 .anInt4200)));
						if (class7_24_ == null)
						    Class76.method1398(5197);
						else
						    Class120.method1664
							((byte) 122,
							 (Class67_Sub26
							  .aRSString_3293),
							 (short) 41,
							 (Class67_Sub26
							  .aRSString_3288),
							 i_22_, i_23_, 1L,
							 (Class67_Sub5_Sub3
							  .anInt4487));
					    }
					}
				    }
				}
				continue;
			    }
			    if (class7.anInt287 == 1339) {
				if (class7.method87(22710)) {
				    Class73.method1364(i_2_, class7, 3, i_3_,
						       i_5_);
				    Class121.method1685(arg9, arg4, arg6,
							arg3);
				}
				continue;
			    }
			    if (class7.anInt287 == 1400) {
				Canvas_Sub1.method44(i_5_, 2, i_3_,
						     class7.anInt194,
						     class7.anInt189);
				OutputStream_Sub1.aBooleanArray96[i_2_] = true;
				Class67_Sub5_Sub3.aBooleanArray4501[i_2_]
				    = true;
				Class121.method1685(arg9, arg4, arg6, arg3);
				continue;
			    }
			    if (class7.anInt287 == 1401) {
				Class96.method1503(i_3_, (byte) 20, i_5_,
						   class7.anInt194,
						   class7.anInt189);
				OutputStream_Sub1.aBooleanArray96[i_2_] = true;
				Class67_Sub5_Sub3.aBooleanArray4501[i_2_]
				    = true;
				Class121.method1685(arg9, arg4, arg6, arg3);
				continue;
			    }
			    if ((class7.anInt287 ^ 0xffffffff) == -1403) {
				Class134.method1912(i_3_, 122, i_5_);
				OutputStream_Sub1.aBooleanArray96[i_2_] = true;
				Class67_Sub5_Sub3.aBooleanArray4501[i_2_]
				    = true;
				continue;
			    }
			    if ((class7.anInt287 ^ 0xffffffff) == -1406) {
				if (Class68.aBoolean1378) {
				    int i_25_ = i_3_ + class7.anInt189;
				    int i_26_ = 15 + i_5_;
				    Class143.aClass67_Sub5_Sub10_2583.method923
					((Class67_Sub1_Sub27.method744
					  ((new RSString[]
					    { Class8.aRSString_346,
					      method47(Class27.anInt624,
						       true) }),
					   -126)),
					 i_25_, i_26_, 16776960, -1);
				    Runtime runtime = Runtime.getRuntime();
				    int i_27_ = 0;
				    int i_28_
					= (int) ((runtime.totalMemory()
						  + -runtime.freeMemory())
						 / 1024L);
				    int i_29_ = 0;
				    i_26_ += 15;
				    int i_30_ = 16776960;
				    if ((i_28_ ^ 0xffffffff) < -65537)
					i_30_ = 16711680;
				    int i_31_ = 0;
				    Class143.aClass67_Sub5_Sub10_2583.method923
					((Class67_Sub1_Sub27.method744
					  ((new RSString[]
					    { Class44.aRSString_908,
					      method47(i_28_, true),
					      Class86.aRSString_1766 }),
					   -107)),
					 i_25_, i_26_, i_30_, -1);
				    i_26_ += 15;
				    for (int i_32_ = 0; i_32_ < 28; i_32_++) {
					i_27_
					    += Class82
						   .aClass129_Sub1Array1666
						   [i_32_]
						   .method1745((byte) 64);
					i_29_
					    += Class82
						   .aClass129_Sub1Array1666
						   [i_32_].method1747(arg8);
					i_31_
					    += Class82
						   .aClass129_Sub1Array1666
						   [i_32_].method1748(123);
				    }
				    i_30_ = 16776960;
				    int i_33_ = 10000 * i_29_ / i_27_;
				    int i_34_ = 100 * i_31_ / i_27_;
				    RSString RSString
					= (Class67_Sub1_Sub27.method744
					   ((new RSString[]
					     { Stream.aRSString_2931,
					       (Class67_Sub28.method1309
						((long) i_33_, 0, 2, (byte) 98,
						 true)),
					       Class67_Sub25.aRSString_3250,
					       method47(i_34_, true),
					       Class67_Sub27.aRSString_3296 }),
					    -95));
				    Class84.aClass67_Sub5_Sub10_1692.method923
					(RSString, i_25_, i_26_, i_30_, -1);
				    OutputStream_Sub1.aBooleanArray96[i_2_]
					= true;
				    Class67_Sub5_Sub3.aBooleanArray4501[i_2_]
					= true;
				    i_26_ += 12;
				}
				continue;
			    }
			    if (class7.anInt287 == 1406) {
				Class67_Sub5_Sub4_Sub1.anInt5116 = i_3_;
				Class81.anInt1653 = i_5_;
				Class67_Sub1_Sub18.aClass7_4114 = class7;
				continue;
			    }
			}
			if (!Class67_Sub9.aBoolean2980) {
			    if ((class7.anInt227 ^ 0xffffffff) == -1
				&& class7.aBoolean324
				&& ((Class136.anInt2486 ^ 0xffffffff)
				    <= (i_9_ ^ 0xffffffff))
				&& (i_8_ ^ 0xffffffff) >= (Class129.anInt2398
							   ^ 0xffffffff)
				&& i_10_ > Class136.anInt2486
				&& (i_11_ ^ 0xffffffff) < (Class129.anInt2398
							   ^ 0xffffffff)
				&& !Class128.aBoolean2377) {
				Class55_Sub2.anIntArray2802[0]
				    = Class2.anInt109;
				Applet_Sub1.aShortArray21[0] = (short) 1002;
				Class134.anInt2476 = 1;
				Class8.aRSStringArray340[0]
				    = Class27.aRSString_625;
				Class102.aRSStringArray1998[0]
				    = Class67_Sub5_Sub5.aRSString_4523;
			    }
			    if (i_9_ <= Class136.anInt2486
				&& ((Class129.anInt2398 ^ 0xffffffff)
				    <= (i_8_ ^ 0xffffffff))
				&& (i_10_ ^ 0xffffffff) < (Class136.anInt2486
							   ^ 0xffffffff)
				&& (i_11_ ^ 0xffffffff) < (Class129.anInt2398
							   ^ 0xffffffff))
				OutputStream_Sub1.method55
				    (-i_5_ + Class129.anInt2398,
				     -i_3_ + Class136.anInt2486, -1, class7);
			}
			if ((class7.anInt227 ^ 0xffffffff) == -1) {
			    if (!class7.aBoolean185 && client.method33(class7)
				&& Class30.aClass7_698 != class7)
				continue;
			    if (!class7.aBoolean185) {
				if (class7.anInt291
				    > -class7.anInt194 + class7.anInt222)
				    class7.anInt291
					= class7.anInt222 - class7.anInt194;
				if (class7.anInt291 < 0)
				    class7.anInt291 = 0;
			    }
			    method51(-class7.anInt291 + i_5_, arg1,
				     class7.anInt301, i_11_, i_8_, i_2_, i_10_,
				     i_3_ + -class7.anInt272, arg8, i_9_);
			    if (class7.aClass7Array228 != null)
				method51(i_5_ + -class7.anInt291,
					 class7.aClass7Array228,
					 class7.anInt301, i_11_, i_8_, i_2_,
					 i_10_, -class7.anInt272 + i_3_, true,
					 i_9_);
			    Class67_Sub22 class67_sub22
				= ((Class67_Sub22)
				   (Class67_Sub1_Sub33.aClass92_4325.method1489
				    ((byte) -15, (long) class7.anInt301)));
			    if (class67_sub22 != null) {
				if (class67_sub22.anInt3180 == 0
				    && !Class67_Sub9.aBoolean2980
				    && ((Class136.anInt2486 ^ 0xffffffff)
					<= (i_9_ ^ 0xffffffff))
				    && ((Class129.anInt2398 ^ 0xffffffff)
					<= (i_8_ ^ 0xffffffff))
				    && ((i_10_ ^ 0xffffffff)
					< (Class136.anInt2486 ^ 0xffffffff))
				    && Class129.anInt2398 < i_11_
				    && !Class128.aBoolean2377) {
				    Class134.anInt2476 = 1;
				    Applet_Sub1.aShortArray21[0]
					= (short) 1002;
				    Class55_Sub2.anIntArray2802[0]
					= Class2.anInt109;
				    Class8.aRSStringArray340[0]
					= Class27.aRSString_625;
				    Class102.aRSStringArray1998[0]
					= Class67_Sub5_Sub5.aRSString_4523;
				}
				Class37.method319(i_11_, i_5_, i_8_, i_10_,
						  i_9_, i_2_, i_3_,
						  class67_sub22.anInt3185,
						  22562);
			    }
			    Class121.method1685(arg9, arg4, arg6, arg3);
			    Class26.method239();
			}
			if (Class90.aBooleanArray1848[i_2_]
			    || (Class131_Sub5.anInt3689 ^ 0xffffffff) < -2) {
			    if (class7.anInt227 == 0 && !class7.aBoolean185
				&& class7.anInt194 < class7.anInt222)
				Class67_Sub5_Sub11_Sub2.method939
				    (class7.anInt194, i_5_, class7.anInt291,
				     class7.anInt222, i_3_ + class7.anInt189,
				     (byte) 122);
			    if ((class7.anInt227 ^ 0xffffffff) != -2) {
				if ((class7.anInt227 ^ 0xffffffff) == -3) {
				    int i_35_ = 0;
				    for (int i_36_ = 0;
					 class7.anInt199 > i_36_; i_36_++) {
					for (int i_37_ = 0;
					     ((i_37_ ^ 0xffffffff)
					      > (class7.anInt193
						 ^ 0xffffffff));
					     i_37_++) {
					    int i_38_
						= (i_3_
						   - -((class7.anInt326 + 32)
						       * i_37_));
					    int i_39_ = ((32 + class7.anInt213)
							 * i_36_) + i_5_;
					    if ((i_35_ ^ 0xffffffff) > -21) {
						i_38_ += (class7.anIntArray237
							  [i_35_]);
						i_39_ += (class7.anIntArray245
							  [i_35_]);
					    }
					    if ((class7.anIntArray264[i_35_]
						 ^ 0xffffffff)
						>= -1) {
						if ((class7.anIntArray224
						     != null)
						    && ((i_35_ ^ 0xffffffff)
							> -21)) {
						    Class67_Sub5_Sub19 class67_sub5_sub19
							= (class7.method92
							   (true, i_35_));
						    if (class67_sub5_sub19
							== null) {
							if (Class114
							    .aBoolean2162)
							    Class37.method326
								(class7, 78);
						    } else
							class67_sub5_sub19
							    .method1006
							    (i_38_, i_39_);
						}
					    } else {
						boolean bool = false;
						boolean bool_40_ = false;
						int i_41_
						    = (-1
						       + (class7.anIntArray264
							  [i_35_]));
						if ((((arg9 ^ 0xffffffff)
						      > (i_38_ - -32
							 ^ 0xffffffff))
						     && i_38_ < arg6
						     && arg4 < 32 + i_39_
						     && i_39_ < arg3)
						    || ((class7
							 == (Class36
							     .aClass7_769))
							&& (i_35_
							    == (Class137
								.anInt2521)))) {
						    Class67_Sub5_Sub19 class67_sub5_sub19;
						    if (Login.anInt1612 == 1
							&& (i_35_
							    == (Class102
								.slotIndex))
							&& (class7.anInt301
							    == (Class67_Sub1_Sub31
								.anInt4289)))
							class67_sub5_sub19
							    = (Class68
								   .method1320
							       (i_41_, 2,
								(class7
								 .aBoolean165),
								(class7
								 .anIntArray253
								 [i_35_]),
								(byte) -65,
								0));
						    else
							class67_sub5_sub19
							    = (Class68
								   .method1320
							       (i_41_, 1,
								(class7
								 .aBoolean165),
								(class7
								 .anIntArray253
								 [i_35_]),
								(byte) 73,
								3153952));
						    if (Class26.aBoolean613)
							OutputStream_Sub1
							    .aBooleanArray96
							    [i_2_]
							    = true;
						    if (class67_sub5_sub19
							== null)
							Class37.method326
							    (class7, 117);
						    else if ((class7
							      != (Class36
								  .aClass7_769))
							     || ((i_35_
								  ^ 0xffffffff)
								 != ((Class137
								      .anInt2521)
								     ^ 0xffffffff))) {
							if ((class7
							     != (Class67_Sub5_Sub9
								 .aClass7_4604))
							    || (i_35_
								!= (Class67_Sub1_Sub13
								    .anInt4017)))
							    class67_sub5_sub19
								.method1006
								(i_38_, i_39_);
							else
							    class67_sub5_sub19
								.method1000
								(i_38_, i_39_,
								 128);
						    } else {
							int i_42_
							    = (-(Class67_Sub1_Sub2
								 .anInt3834)
							       + (Class67_Sub1_Sub22
								  .anInt4172));
							if ((i_42_
							     ^ 0xffffffff) > -6
							    && i_42_ > -5)
							    i_42_ = 0;
							int i_43_
							    = (-(Class33_Sub2
								 .anInt2779)
							       + (Class67_Sub5_Sub17
								  .anInt4786));
							if (i_43_ < 5
							    && ((i_43_
								 ^ 0xffffffff)
								< 4))
							    i_43_ = 0;
							if ((Class40.anInt815
							     ^ 0xffffffff)
							    > -6) {
							    i_43_ = 0;
							    i_42_ = 0;
							}
							class67_sub5_sub19
							    .method1000
							    (i_38_ - -i_43_,
							     i_39_ - -i_42_,
							     128);
							if ((arg2 ^ 0xffffffff)
							    != 0) {
							    Class7 class7_44_
								= (arg1
								   [(0xffff
								     & arg2)]);
							    int i_45_
								= (Class121
								   .anInt2295);
							    int i_46_
								= (Class121
								   .anInt2297);
							    if ((i_39_ + i_42_
								 < i_45_)
								&& ((class7_44_
								     .anInt291)
								    > 0)) {
								int i_47_
								    = ((RSString
									.anInt2642)
								       * (-i_39_
									  + (i_45_
									     - i_42_))
								       / 3);
								if ((i_47_
								     ^ 0xffffffff)
								    < (((RSString
									 .anInt2642)
									* 10)
								       ^ 0xffffffff))
								    i_47_
									= (10
									   * RSString.anInt2642);
								if ((i_47_
								     ^ 0xffffffff)
								    < ((class7_44_
									.anInt291)
								       ^ 0xffffffff))
								    i_47_
									= (class7_44_
									   .anInt291);
								Class67_Sub1_Sub2
								    .anInt3834
								    += i_47_;
								class7_44_
								    .anInt291
								    -= i_47_;
								Class37
								    .method326
								    (class7_44_,
								     105);
							    }
							    if (((32 + i_42_
								  + i_39_)
								 > i_46_)
								&& ((class7_44_
								     .anInt291)
								    < ((class7_44_
									.anInt222)
								       + -(class7_44_
									   .anInt194)))) {
								int i_48_
								    = ((i_42_
									+ (i_39_
									   + 32
									   - i_46_))
								       * (RSString
									  .anInt2642)
								       / 3);
								if ((((RSString
								       .anInt2642)
								      * 10)
								     ^ 0xffffffff)
								    > (i_48_
								       ^ 0xffffffff))
								    i_48_
									= ((RSString
									    .anInt2642)
									   * 10);
								if (((-(class7_44_
									.anInt291)
								      + (-(class7_44_
									   .anInt194)
									 + (class7_44_
									    .anInt222)))
								     ^ 0xffffffff)
								    > (i_48_
								       ^ 0xffffffff))
								    i_48_
									= ((class7_44_
									    .anInt222)
									   - (class7_44_.anInt194
									      + class7_44_.anInt291));
								class7_44_
								    .anInt291
								    += i_48_;
								Class67_Sub1_Sub2
								    .anInt3834
								    -= i_48_;
								Class37
								    .method326
								    (class7_44_,
								     102);
							    }
							}
						    }
						}
					    }
					    i_35_++;
					}
				    }
				} else if ((class7.anInt227 ^ 0xffffffff)
					   == -4) {
				    int i_49_;
				    if (!Class33.method291(class7,
							   (byte) -70)) {
					i_49_ = class7.anInt279;
					if (Class30.aClass7_698 == class7
					    && class7.anInt188 != 0)
					    i_49_ = class7.anInt188;
				    } else {
					i_49_ = class7.anInt195;
					if (Class30.aClass7_698 == class7
					    && ((class7.anInt327 ^ 0xffffffff)
						!= -1))
					    i_49_ = class7.anInt327;
				    }
				    if (i_4_ != 0) {
					if (class7.aBoolean300)
					    Class121.method1686
						(i_3_, i_5_, class7.anInt189,
						 class7.anInt194, i_49_,
						 256 - (0xff & i_4_));
					else
					    Class121.method1689
						(i_3_, i_5_, class7.anInt189,
						 class7.anInt194, i_49_,
						 256 - (i_4_ & 0xff));
				    } else if (!class7.aBoolean300)
					Class121.method1681(i_3_, i_5_,
							    class7.anInt189,
							    class7.anInt194,
							    i_49_);
				    else
					Class121.method1683(i_3_, i_5_,
							    class7.anInt189,
							    class7.anInt194,
							    i_49_);
				} else if (class7.anInt227 == 4) {
				    Class67_Sub5_Sub10 class67_sub5_sub10
					= (class7.method100
					   (Class5.aClass119Array143,
					    (byte) 109));
				    if (class67_sub5_sub10 == null) {
					if (Class114.aBoolean2162)
					    Class37.method326(class7, 75);
				    } else {
					RSString RSString = class7.aRSString_219;
					int i_50_;
					if (!Class33.method291(class7,
							       (byte) 125)) {
					    i_50_ = class7.anInt279;
					    if (Class30.aClass7_698 == class7
						&& class7.anInt188 != 0)
						i_50_ = class7.anInt188;
					} else {
					    i_50_ = class7.anInt195;
					    if (class7 == Class30.aClass7_698
						&& class7.anInt327 != 0)
						i_50_ = class7.anInt327;
					    if (class7.aRSString_172
						    .method531((byte) 126)
						> 0)
						RSString = class7.aRSString_172;
					}
					if (class7.aBoolean185
					    && ((class7.anInt289 ^ 0xffffffff)
						!= 0)) {
					    Class76 class76
						= (PacketParser.method1596
						   (class7.anInt289, -28322));
					    RSString = class76.itemName;
					    if (RSString == null)
						RSString
						    = Class63.aRSString_1169;
					    if (((class76.anInt1559
						  ^ 0xffffffff) == -2
						 || (class7.anInt288
						     ^ 0xffffffff) != -2)
						&& class7.anInt288 != -1)
						RSString
						    = (Class67_Sub1_Sub27
							   .method744
						       ((new RSString[]
							 { (Class43
							    .aRSString_906),
							   RSString,
							   (Class67_Sub5_Sub19
							    .aRSString_4827),
							   (Class67_Sub1_Sub7
								.method647
							    (class7.anInt288,
							     112)) }),
							-122));
					}
					if (Class16.aClass7_470 == class7) {
					    i_50_ = class7.anInt279;
					    RSString = Class136.aRSString_2491;
					}
					if (!class7.aBoolean185)
					    RSString
						= client.method35(RSString,
								  class7,
								  (byte) -43);
					class67_sub5_sub10.method905
					    (RSString, i_3_, i_5_,
					     class7.anInt189, class7.anInt194,
					     i_50_,
					     !class7.aBoolean278 ? -1 : 0,
					     class7.anInt214, class7.anInt248,
					     class7.anInt198);
				    }
				} else if ((class7.anInt227 ^ 0xffffffff)
					   == -6) {
				    if (class7.aBoolean185) {
					Class67_Sub5_Sub19 class67_sub5_sub19;
					if ((class7.anInt289 ^ 0xffffffff)
					    == 0)
					    class67_sub5_sub19
						= class7.method94(false, -72);
					else
					    class67_sub5_sub19
						= (Class68.method1320
						   (class7.anInt289,
						    class7.anInt284,
						    class7.aBoolean165,
						    class7.anInt288, (byte) 69,
						    class7.anInt294));
					if (class67_sub5_sub19 != null) {
					    int i_51_
						= class67_sub5_sub19.anInt4815;
					    int i_52_
						= class67_sub5_sub19.anInt4825;
					    if (!class7.aBoolean177) {
						int i_53_
						    = (4096 * class7.anInt189
						       / i_52_);
						if ((class7.anInt187
						     ^ 0xffffffff)
						    != -1)
						    class67_sub5_sub19
							.method1008
							(class7.anInt187,
							 (i_5_
							  - -(class7.anInt194
							      / 2)),
							 arg8,
							 (class7.anInt189 / 2
							  + i_3_),
							 i_53_);
						else if ((i_4_ ^ 0xffffffff)
							 == -1) {
						    if (((i_52_ ^ 0xffffffff)
							 != (class7.anInt189
							     ^ 0xffffffff))
							|| (class7.anInt194
							    != i_51_))
							class67_sub5_sub19
							    .method1004
							    (i_3_, i_5_,
							     class7.anInt189,
							     class7.anInt194);
						    else
							class67_sub5_sub19
							    .method1006
							    (i_3_, i_5_);
						} else
						    class67_sub5_sub19
							.method1007
							(i_3_, i_5_,
							 class7.anInt189,
							 class7.anInt194,
							 -(0xff & i_4_) + 256);
					    } else {
						int i_54_
						    = ((i_52_
							- (1
							   - class7.anInt189))
						       / i_52_);
						int i_55_
						    = ((i_51_ + -1
							+ class7.anInt194)
						       / i_51_);
						Class121.method1673
						    (i_3_, i_5_,
						     class7.anInt189 + i_3_,
						     i_5_ + class7.anInt194);
						for (int i_56_ = 0;
						     ((i_56_ ^ 0xffffffff)
						      > (i_54_ ^ 0xffffffff));
						     i_56_++) {
						    for (int i_57_ = 0;
							 ((i_55_ ^ 0xffffffff)
							  < (i_57_
							     ^ 0xffffffff));
							 i_57_++) {
							if ((class7.anInt187
							     ^ 0xffffffff)
							    == -1) {
							    if ((i_4_
								 ^ 0xffffffff)
								== -1)
								class67_sub5_sub19
								    .method1006
								    ((i_3_
								      + (i_56_
									 * i_52_)),
								     ((i_57_
								       * i_51_)
								      + i_5_));
							    else
								class67_sub5_sub19
								    .method1000
								    (((i_56_
								       * i_52_)
								      + i_3_),
								     (i_5_
								      - -(i_51_
									  * i_57_)),
								     (-(i_4_
									& 0xff)
								      + 256));
							} else
							    class67_sub5_sub19
								.method1008
								((class7
								  .anInt187),
								 (i_5_
								  + ((i_51_
								      * i_57_)
								     + (i_51_
									/ 2))),
								 true,
								 (i_52_ / 2
								  + ((i_56_
								      * i_52_)
								     + i_3_)),
								 4096);
						    }
						}
						Class121.method1685(arg9, arg4,
								    arg6,
								    arg3);
					    }
					} else if (Class114.aBoolean2162)
					    Class37.method326(class7, 112);
				    } else {
					Class67_Sub5_Sub19 class67_sub5_sub19
					    = (class7.method94
					       (Class33.method291(class7,
								  (byte) -117),
						-62));
					if (class67_sub5_sub19 == null) {
					    if (Class114.aBoolean2162)
						Class37.method326(class7, 96);
					} else
					    class67_sub5_sub19
						.method1006(i_3_, i_5_);
				    }
				} else if ((class7.anInt227 ^ 0xffffffff)
					   == -7) {
				    boolean bool
					= Class33.method291(class7,
							    (byte) -17);
				    Class131_Sub6 class131_sub6 = null;
				    int i_58_;
				    if (bool)
					i_58_ = class7.anInt333;
				    else
					i_58_ = class7.anInt274;
				    int i_59_ = 0;
				    if ((class7.anInt289 ^ 0xffffffff) == 0) {
					if ((class7.anInt329 ^ 0xffffffff)
					    == -6) {
					    if ((class7.anInt183 ^ 0xffffffff)
						!= 0) {
						int i_60_
						    = 0x7ff & class7.anInt183;
						if ((Class67_Sub17.anInt3102
						     ^ 0xffffffff)
						    == (i_60_ ^ 0xffffffff))
						    i_60_ = 2047;
						Class131_Sub7_Sub2 class131_sub7_sub2
						    = (Class67_Sub5_Sub18
						       .aClass131_Sub7_Sub2Array4810
						       [i_60_]);
						Class41 class41
						    = (i_58_ == -1 ? null
						       : (Class120.method1666
							  (i_58_, -32)));
						if (class131_sub7_sub2 != null
						    && (((int) (class131_sub7_sub2
								    .playerName
								    .method501
								((byte) -16))
							 << -1971317717)
							== (~0x7ff
							    & (class7
							       .anInt183))))
						    class131_sub6
							= (class131_sub7_sub2
							       .aClass22_5065
							       .method201
							   (0, -1, class41,
							    class7.anInt257,
							    arg8, null, 0, 0,
							    true, null, -1));
					    } else
						class131_sub6
						    = (Class43.aClass22_898
							   .method201
						       (-1, -1, null, -1, true,
							null, 0, 0, true, null,
							-1));
					} else if ((i_58_ ^ 0xffffffff) == 0) {
					    class131_sub6
						= (class7.method90
						   ((Class122
						     .aClass131_Sub7_Sub2_2309
						     .aClass22_5065),
						    -1, -1, bool, 0, false,
						    null));
					    if (class131_sub6 == null
						&& Class114.aBoolean2162)
						Class37.method326(class7, 84);
					} else {
					    Class41 class41
						= Class120.method1666(i_58_,
								      -32);
					    class131_sub6
						= (class7.method90
						   ((Class122
						     .aClass131_Sub7_Sub2_2309
						     .aClass22_5065),
						    class7.anInt203,
						    class7.anInt257, bool,
						    class7.anInt298, false,
						    class41));
					    if (class131_sub6 == null
						&& Class114.aBoolean2162)
						Class37.method326(class7, 105);
					}
				    } else {
					Class76 class76
					    = PacketParser.method1596((class7
								   .anInt289),
								  -28322);
					if (class76 != null) {
					    class76 = (class76.method1385
						       (class7.anInt288, -1));
					    Class41 class41
						= ((i_58_ ^ 0xffffffff) != 0
						   ? Class120.method1666(i_58_,
									 -32)
						   : null);
					    class131_sub6
						= (class76.method1397
						   (class41, class7.anInt257,
						    -93, 1, class7.anInt298,
						    class7.anInt203));
					    if (class131_sub6 != null)
						i_59_ = -class131_sub6
							     .method1769() / 2;
					    else
						Class37.method326(class7, 97);
					}
				    }
				    if (class131_sub6 != null) {
					int i_61_;
					if ((class7.anInt211 ^ 0xffffffff)
					    < -1)
					    i_61_ = ((class7.anInt194
						      << 1070326312)
						     / class7.anInt211);
					else
					    i_61_ = 256;
					int i_62_;
					if ((class7.anInt240 ^ 0xffffffff)
					    >= -1)
					    i_62_ = 256;
					else
					    i_62_ = ((class7.anInt189
						      << 697525480)
						     / class7.anInt240);
					int i_63_
					    = ((i_62_ * class7.anInt229
						>> -1152797784)
					       + (i_3_
						  - -(class7.anInt189 / 2)));
					int i_64_
					    = ((class7.anInt312 * i_61_
						>> 1551617192)
					       + (i_5_ + class7.anInt194 / 2));
					Class26.method250(i_63_, i_64_);
					int i_65_ = (((Class26.anIntArray617
						       [class7.anInt330])
						      * class7.anInt338)
						     >> -1508199792);
					int i_66_ = (((Class26.anIntArray612
						       [class7.anInt330])
						      * class7.anInt338)
						     >> 1083720304);
					if (!class7.aBoolean185)
					    class131_sub6.method1841
						(0, class7.anInt164, 0,
						 class7.anInt330, 0, i_65_,
						 i_66_, -1L);
					else if (class7.aBoolean299)
					    ((Class131_Sub6_Sub1)
					     class131_sub6)
						.method1866
						(0, class7.anInt164,
						 class7.anInt325,
						 class7.anInt330,
						 class7.anInt216,
						 class7.anInt220 + (i_59_
								    + i_65_),
						 i_66_ + class7.anInt220,
						 class7.anInt338);
					else
					    class131_sub6.method1841
						(0, class7.anInt164,
						 class7.anInt325,
						 class7.anInt330,
						 class7.anInt216,
						 (i_59_ + i_65_
						  - -class7.anInt220),
						 class7.anInt220 + i_66_, -1L);
					Class26.method231();
				    }
				} else {
				    if (class7.anInt227 == 7) {
					Class67_Sub5_Sub10 class67_sub5_sub10
					    = (class7.method100
					       (Class5.aClass119Array143,
						(byte) 57));
					if (class67_sub5_sub10 == null) {
					    if (Class114.aBoolean2162)
						Class37.method326(class7, 124);
					    continue;
					}
					int i_67_ = 0;
					for (int i_68_ = 0;
					     i_68_ < class7.anInt199;
					     i_68_++) {
					    for (int i_69_ = 0;
						 class7.anInt193 > i_69_;
						 i_69_++) {
						if (((class7.anIntArray264
						      [i_67_])
						     ^ 0xffffffff)
						    < -1) {
						    Class76 class76
							= (PacketParser.method1596
							   ((class7
							     .anIntArray264
							     [i_67_]) - 1,
							    -28322));
						    RSString RSString;
						    if (class76.anInt1559 != 1
							&& (class7
							    .anIntArray253
							    [i_67_]) == 1)
							RSString
							    = (Class67_Sub1_Sub27
								   .method744
							       ((new RSString[]
								 { (Class43
								    .aRSString_906),
								   (class76
								    .itemName),
								   (Class67_Sub28
								    .aRSString_3323) }),
								-99));
						    else
							RSString
							    = (Class67_Sub1_Sub27
								   .method744
							       ((new RSString[]
								 { (Class43
								    .aRSString_906),
								   (class76
								    .itemName),
								   (Class67_Sub5_Sub19
								    .aRSString_4827),
								   (Class67_Sub1_Sub7
									.method647
								    ((class7
								      .anIntArray253
								      [i_67_]),
								     108)) }),
								-120));
						    int i_70_
							= (i_3_
							   + (class7.anInt326
							      + 115) * i_69_);
						    int i_71_
							= (((12
							     + class7.anInt213)
							    * i_68_)
							   + i_5_);
						    if (class7.anInt214 != 0) {
							if (class7.anInt214
							    == 1)
							    class67_sub5_sub10
								.method908
								(RSString,
								 i_70_ + 57,
								 i_71_,
								 (class7
								  .anInt279),
								 ((class7
								   .aBoolean278)
								  ? 0 : -1));
							else
							    class67_sub5_sub10
								.method923
								(RSString,
								 i_70_ + 114,
								 i_71_,
								 (class7
								  .anInt279),
								 (!(class7
								    .aBoolean278)
								  ? -1 : 0));
						    } else
							class67_sub5_sub10
							    .method920
							    (RSString, i_70_,
							     i_71_,
							     class7.anInt279,
							     ((class7
							       .aBoolean278)
							      ? 0 : -1));
						}
						i_67_++;
					    }
					}
				    }
				    if ((class7.anInt227 ^ 0xffffffff) == -9
					&& (class7
					    == Class67_Sub5_Sub6.aClass7_4536)
					&& ((Class67.anInt1342 ^ 0xffffffff)
					    == (Class67_Sub5_Sub6.anInt4534
						^ 0xffffffff))) {
					int i_72_ = 0;
					int i_73_ = 0;
					RSString RSString = class7.aRSString_219;
					Class67_Sub5_Sub10 class67_sub5_sub10
					    = (Class143
					       .aClass67_Sub5_Sub10_2583);
					RSString
					    = client.method35(RSString, class7,
							      (byte) -40);
					while (RSString.method531((byte) -114)
					       > 0) {
					    int i_74_
						= (RSString.method514
						   ((byte) -128,
						    Login.aRSString_1618));
					    RSString RSString_75_;
					    if (i_74_ == -1) {
						RSString_75_ = RSString;
						RSString = (Class67_Sub5_Sub5
							   .aRSString_4523);
					    } else {
						RSString_75_
						    = RSString.method502(0,
									-5975,
									i_74_);
						RSString
						    = (RSString.method503
						       ((byte) 34, 4 + i_74_));
					    }
					    int i_76_
						= class67_sub5_sub10
						      .method913(RSString_75_);
					    if (i_72_ < i_76_)
						i_72_ = i_76_;
					    i_73_ += 1 + (class67_sub5_sub10
							  .anInt4623);
					}
					i_73_ += 7;
					i_72_ += 6;
					int i_77_
					    = i_5_ + class7.anInt194 - -5;
					if (i_77_ + i_73_ > arg3)
					    i_77_ = -i_73_ + arg3;
					int i_78_
					    = -5 + (i_3_ + (class7.anInt189
							    + -i_72_));
					if (5 + i_3_ > i_78_)
					    i_78_ = 5 + i_3_;
					if (i_78_ - -i_72_ > arg6)
					    i_78_ = arg6 - i_72_;
					Class121.method1683(i_78_, i_77_,
							    i_72_, i_73_,
							    16777120);
					Class121.method1681(i_78_, i_77_,
							    i_72_, i_73_, 0);
					RSString = class7.aRSString_219;
					int i_79_
					    = 2 + i_77_ - -(class67_sub5_sub10
							    .anInt4623);
					RSString
					    = client.method35(RSString, class7,
							      (byte) -84);
					while (RSString.method531((byte) 110)
					       > 0) {
					    int i_80_
						= (RSString.method514
						   ((byte) -128,
						    Login.aRSString_1618));
					    RSString RSString_81_;
					    if ((i_80_ ^ 0xffffffff) != 0) {
						RSString_81_
						    = RSString.method502(0,
									-5975,
									i_80_);
						RSString
						    = (RSString.method503
						       ((byte) 34, 4 + i_80_));
					    } else {
						RSString_81_ = RSString;
						RSString = (Class67_Sub5_Sub5
							   .aRSString_4523);
					    }
					    class67_sub5_sub10.method920
						(RSString_81_, 3 + i_78_, i_79_,
						 0, -1);
					    i_79_ += 1 + (class67_sub5_sub10
							  .anInt4623);
					}
				    }
				    if ((class7.anInt227 ^ 0xffffffff)
					== -10) {
					int i_82_;
					int i_83_;
					int i_84_;
					int i_85_;
					if (!class7.aBoolean305) {
					    i_84_ = i_5_ - -class7.anInt194;
					    i_85_ = i_3_;
					    i_83_ = i_5_;
					    i_82_ = i_3_ + class7.anInt189;
					} else {
					    i_82_ = i_3_ + class7.anInt189;
					    i_83_ = i_5_ - -class7.anInt194;
					    i_84_ = i_5_;
					    i_85_ = i_3_;
					}
					if (class7.anInt311 == 1)
					    Class121.method1691(i_85_, i_83_,
								i_82_, i_84_,
								(class7
								 .anInt279));
					else
					    Class121.method1682(i_85_, i_83_,
								i_82_, i_84_,
								(class7
								 .anInt279),
								(class7
								 .anInt311));
				    }
				}
			    }
			}
		    }
		}
	    }
	}
	if (arg8 != true)
	    method47(-88, false);
    }
    
    public static void method52(RSString[] arg0, short[] arg1, int arg2,
				boolean arg3, int arg4) {
	try {
	    if (arg3 != true)
		method52(null, null, -18, true, 126);
	    if (arg4 > arg2) {
		int i = (arg4 + arg2) / 2;
		int i_86_ = arg2;
		RSString RSString = arg0[i];
		arg0[i] = arg0[arg4];
		arg0[arg4] = RSString;
		short i_87_ = arg1[i];
		arg1[i] = arg1[arg4];
		arg1[arg4] = i_87_;
		for (int i_88_ = arg2; arg4 > i_88_; i_88_++) {
		    if (RSString == null
			|| (arg0[i_88_] != null
			    && (arg0[i_88_].method537(19, RSString)
				^ 0xffffffff) > (i_88_ & 0x1 ^ 0xffffffff))) {
			RSString RSString_89_ = arg0[i_88_];
			arg0[i_88_] = arg0[i_86_];
			arg0[i_86_] = RSString_89_;
			short i_90_ = arg1[i_88_];
			arg1[i_88_] = arg1[i_86_];
			arg1[i_86_++] = i_90_;
		    }
		}
		arg0[arg4] = arg0[i_86_];
		arg0[i_86_] = RSString;
		arg1[arg4] = arg1[i_86_];
		arg1[i_86_] = i_87_;
		method52(arg0, arg1, arg2, true, -1 + i_86_);
		method52(arg0, arg1, i_86_ - -1, true, arg4);
	    }
	    anInt70++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("lf.G("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public static void method53(byte arg0) {
	anInt69++;
	int i = 0;
	int[] is = new int[Class67_Sub1_Sub29.anInt4270];
	for (int i_91_ = 0; ((Class67_Sub1_Sub29.anInt4270 ^ 0xffffffff)
			     < (i_91_ ^ 0xffffffff)); i_91_++) {
	    Class76 class76 = PacketParser.method1596(i_91_, -28322);
	    if (class76.anInt1582 >= 0
		|| (class76.anInt1567 ^ 0xffffffff) <= -1)
		is[i++] = i_91_;
	}
	Class125.anIntArray2340 = new int[i];
	if (arg0 < -64) {
	    for (int i_92_ = 0; i_92_ < i; i_92_++)
		Class125.anIntArray2340[i_92_] = is[i_92_];
	}
    }
    
    public static void method54(int arg0) {
	if (arg0 <= 55)
	    anIntArrayArrayArray75 = null;
	anInt81++;
	Class137.aClass136_2508.method1922(0);
    }
    
    static {
	aBoolean71 = false;
	aRSString_79 = Class134.method1914("ondulation2:", (byte) 75);
	aBoolean78 = true;
	aBoolean77 = true;
    }
}
