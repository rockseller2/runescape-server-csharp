/* Class67_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Class67_Sub26 extends Class67
{
    public static int anInt3256;
    public int anInt3257;
    public int anInt3258;
    public static int anInt3259;
    public int anInt3260;
    public int anInt3261;
    public static int anInt3262;
    public int anInt3263;
    public int anInt3264;
    public static Class137 aClass137_3265;
    public int anInt3266;
    public Class67_Sub11_Sub3 aClass67_Sub11_Sub3_3267;
    public static int anInt3268;
    public static RSString aRSString_3269;
    public int anInt3270;
    public int anInt3271;
    public static int anInt3272;
    public static int[] anIntArray3273;
    public static int anInt3274;
    public int anInt3275;
    public int anInt3276;
    public static int anInt3277 = 0;
    public static int anInt3278;
    public Class67_Sub27 aClass67_Sub27_3279;
    public static int anInt3280;
    public int anInt3281;
    public int anInt3282;
    public int anInt3283;
    public int anInt3284;
    public int anInt3285;
    public int anInt3286;
    public Class130 aClass130_3287;
    public static RSString aRSString_3288;
    public Class67_Sub13_Sub1 aClass67_Sub13_Sub1_3289;
    public static Sprites aSprite_3290;
    public static int anInt3291;
    public static int[] anIntArray3292;
    public static RSString aRSString_3293;
    
    public static void method1294(int arg0) {
	anIntArray3273 = null;
	aRSString_3293 = null;
	aRSString_3288 = null;
	anIntArray3292 = null;
	if (arg0 < -55) {
	    aSprite_3290 = null;
	    aRSString_3269 = null;
	    aClass137_3265 = null;
	}
    }
    
    public static void method1295(int arg0) {
	if ((Class67_Sub3.anInt2853 ^ 0xffffffff) > -1) {
	    Class67_Sub3.anInt2853 = 0;
	    Class33.anInt732 = -1;
	    Class67_Sub5_Sub16.anInt4776 = -1;
	}
	if (Class67_Sub3.anInt2853 > Class67_Sub1_Sub13.anInt4031) {
	    Class33.anInt732 = -1;
	    Class67_Sub5_Sub16.anInt4776 = -1;
	    Class67_Sub3.anInt2853 = Class67_Sub1_Sub13.anInt4031;
	}
	if ((Class118.anInt2231 ^ 0xffffffff) > -1) {
	    Class33.anInt732 = -1;
	    Class118.anInt2231 = 0;
	    Class67_Sub5_Sub16.anInt4776 = -1;
	}
	if (Class131_Sub5.anInt3656 < Class118.anInt2231) {
	    Class118.anInt2231 = Class131_Sub5.anInt3656;
	    Class33.anInt732 = -1;
	    Class67_Sub5_Sub16.anInt4776 = -1;
	}
	if (arg0 == 98)
	    anInt3256++;
    }
    
    public static void method1296(int arg0) {
	if ((Class55_Sub2.anInt2800 ^ 0xffffffff) < -1)
	    Class55_Sub2.anInt2800--;
	if (Class144.anInt2596 > 1) {
	    Class144.anInt2596--;
	    Class86.anInt1763 = Class11.anInt409;
	}
	anInt3272++;
	if (Class67_Sub1_Sub28.aBoolean4257) {
	    Class67_Sub1_Sub28.aBoolean4257 = false;
	    Class119.method1645(-118);
	} else {
	    for (int i = 0; (i ^ 0xffffffff) > -101; i++) {
		if (!Class33.method294(-66))
		    break;
	    }
	    if (Class67_Sub5_Sub18.anInt4804 == 30) {
		Class67_Sub5_Sub8.method879(163,
					    (Class70_Sub1
					     .outStream),
					    true);
		if (arg0 > 93) {
		    synchronized (Class40.aClass5_829.anObject139) {
			if (!Class124.aBoolean2330)
			    Class40.aClass5_829.anInt146 = 0;
			else if ((Class100.anInt1975 ^ 0xffffffff) != -1
				 || (Class40.aClass5_829.anInt146
				     ^ 0xffffffff) <= -41) {
			    Class67_Sub15.anInt3076++;
			    Class70_Sub1.outStream
				.createFrame(2, 123);
			    Class70_Sub1.outStream
				.addByte((byte) 4, 0);
			    int i = (Class70_Sub1.outStream
				     .currentOffset);
			    int i_0_ = 0;
			    for (int i_1_ = 0; ((i_1_ ^ 0xffffffff)
						> (Class40.aClass5_829.anInt146
						   ^ 0xffffffff)); i_1_++) {
				if (-i + (Class70_Sub1.outStream
					  .currentOffset)
				    >= 240)
				    break;
				i_0_++;
				int i_2_
				    = Class40.aClass5_829.anIntArray145[i_1_];
				if (i_2_ < 0)
				    i_2_ = 0;
				else if (i_2_ > 65534)
				    i_2_ = 65534;
				int i_3_
				    = Class40.aClass5_829.anIntArray147[i_1_];
				boolean bool = false;
				if ((i_3_ ^ 0xffffffff) > -1)
				    i_3_ = 0;
				else if (i_3_ > 65534)
				    i_3_ = 65534;
				if ((Class40.aClass5_829.anIntArray145[i_1_]
				     == -1)
				    && (Class40.aClass5_829.anIntArray147[i_1_]
					^ 0xffffffff) == 0) {
				    i_2_ = -1;
				    i_3_ = -1;
				    bool = true;
				}
				if (((Class117.anInt2201 ^ 0xffffffff)
				     == (i_3_ ^ 0xffffffff))
				    && Class67_Sub5_Sub11.anInt4679 == i_2_) {
				    if ((Class67_Sub16.anInt3085 ^ 0xffffffff)
					> -2048)
					Class67_Sub16.anInt3085++;
				} else {
				    int i_4_ = -Class117.anInt2201 + i_3_;
				    int i_5_
					= i_2_ + -Class67_Sub5_Sub11.anInt4679;
				    Class67_Sub5_Sub11.anInt4679 = i_2_;
				    Class117.anInt2201 = i_3_;
				    if (Class67_Sub16.anInt3085 < 8
					&& i_4_ >= -32 && i_4_ <= 31
					&& (i_5_ ^ 0xffffffff) <= 31
					&& i_5_ <= 31) {
					i_4_ += 32;
					i_5_ += 32;
					Class70_Sub1
					    .outStream.addUShort(16711680,
					     (i_5_ + (i_4_ << 892949734)
					      + (Class67_Sub16.anInt3085
						 << 599214284)));
					Class67_Sub16.anInt3085 = 0;
				    } else if (Class67_Sub16.anInt3085 < 32
					       && (i_4_ ^ 0xffffffff) <= 127
					       && i_4_ <= 127
					       && (i_5_ ^ 0xffffffff) <= 127
					       && ((i_5_ ^ 0xffffffff)
						   >= -128)) {
					i_4_ += 128;
					i_5_ += 128;
					Class70_Sub1
					    .outStream.addByte
					    ((byte) 4,
					     128 + Class67_Sub16.anInt3085);
					Class70_Sub1
					    .outStream.addUShort(16711680,
					     (i_4_ << -86278712) - -i_5_);
					Class67_Sub16.anInt3085 = 0;
				    } else if (Class67_Sub16.anInt3085 < 32) {
					Class70_Sub1
					    .outStream.addByte
					    ((byte) 4,
					     Class67_Sub16.anInt3085 + 192);
					if (!bool)
					    Class70_Sub1
						.outStream
						.addInt
						(i_2_ << 1665901168 | i_3_,
						 118);
					else
					    Class70_Sub1
						.outStream
						.addInt(-2147483648, 125);
					Class67_Sub16.anInt3085 = 0;
				    } else {
					Class70_Sub1
					    .outStream.addUShort(16711680,
					     Class67_Sub16.anInt3085 + 57344);
					if (bool)
					    Class70_Sub1
						.outStream
						.addInt(-2147483648, 127);
					else
					    Class70_Sub1
						.outStream
						.addInt
						(i_2_ << 899321200 | i_3_,
						 118);
					Class67_Sub16.anInt3085 = 0;
				    }
				}
			    }
			    Class70_Sub1.outStream.method1079
				(127,
				 -i + (Class70_Sub1.outStream
				       .currentOffset));
			    if ((Class40.aClass5_829.anInt146 ^ 0xffffffff)
				< (i_0_ ^ 0xffffffff)) {
				Class40.aClass5_829.anInt146 -= i_0_;
				for (int i_6_ = 0;
				     Class40.aClass5_829.anInt146 > i_6_;
				     i_6_++) {
				    Class40.aClass5_829.anIntArray147[i_6_]
					= (Class40.aClass5_829.anIntArray147
					   [i_0_ + i_6_]);
				    Class40.aClass5_829.anIntArray145[i_6_]
					= (Class40.aClass5_829.anIntArray145
					   [i_6_ - -i_0_]);
				}
			    } else
				Class40.aClass5_829.anInt146 = 0;
			}
		    }
		    if (Class100.anInt1975 != 0) {
			Class5.anInt133++;
			long l = ((-Class34.aLong738 + Class67_Sub15.aLong3072)
				  / 50L);
			if (l > 32767L)
			    l = 32767L;
			int i = Class115.anInt2186;
			Class34.aLong738 = Class67_Sub15.aLong3072;
			if (i < 0)
			    i = 0;
			else if ((i ^ 0xffffffff) < -65536)
			    i = 65535;
			int i_7_ = Class101.anInt1985;
			int i_8_ = 0;
			if ((i_7_ ^ 0xffffffff) <= -1) {
			    if (i_7_ > 65535)
				i_7_ = 65535;
			} else
			    i_7_ = 0;
			int i_9_ = (int) l;
			if (Class100.anInt1975 == 2)
			    i_8_ = 1;
			Class70_Sub1.outStream.createFrame(2, 75);	//CLICK_MOUSE
			Class70_Sub1.outStream.addLEShortA
			    ((byte) -125, i_9_ | i_8_ << -391754801);
			Class70_Sub1.outStream
			    .addInt2(i | i_7_ << -1787845392, -116);
		    }
		    if ((Class21.anInt514 ^ 0xffffffff) < -1)
			Class21.anInt514--;
		    if (!Class53.aBoolean1057) {
			if (Class131_Sub7.aBooleanArray3698[96]
			    || Class131_Sub7.aBooleanArray3698[97]
			    || Class131_Sub7.aBooleanArray3698[98]
			    || Class131_Sub7.aBooleanArray3698[99])
			    Class124.aBoolean2331 = true;
		    } else {
			for (int i = 0;
			     ((i ^ 0xffffffff)
			      > (Class67_Sub20.anInt3168 ^ 0xffffffff));
			     i++) {
			    int i_10_ = Class67_Sub1_Sub28.anIntArray4255[i];
			    if (i_10_ == 98 || (i_10_ ^ 0xffffffff) == -100
				|| i_10_ == 96
				|| (i_10_ ^ 0xffffffff) == -98) {
				Class124.aBoolean2331 = true;
				break;
			    }
			}
		    }
		    if (Class124.aBoolean2331
			&& (Class21.anInt514 ^ 0xffffffff) >= -1) {
			Class67_Sub5_Sub19.anInt4822++;
			Class21.anInt514 = 20;
			Class124.aBoolean2331 = false;
			Class70_Sub1.outStream.createFrame(2, 21);	//MOVE_CAMERA
			Class70_Sub1.outStream
			    .addShortA(Class67_Sub21.anInt3175, -12196);
			Class70_Sub1.outStream.addLEShort
			    (Class67_Sub5_Sub4.anInt4504, 1608904784);
		    }
		    if (Class141.aBoolean2560 == true
			&& Class113.aBoolean2145 != true) {
			Class67_Sub1_Sub10.anInt3971++;
			Class113.aBoolean2145 = true;
			Class70_Sub1.outStream.createFrame(2, 22);	//FOCUS
			Class70_Sub1.outStream.addByte((byte) 4, 1);
		    }
		    if (!Class141.aBoolean2560 == true
			&& Class113.aBoolean2145 == true) {
			Class113.aBoolean2145 = false;
			Class67_Sub1_Sub10.anInt3971++;
			Class70_Sub1.outStream.createFrame(2, 22);	//FOCUS
			Class70_Sub1.outStream.addByte((byte) 4, 0);
		    }
		    if (!Class67_Sub5_Sub4_Sub2.aBoolean5132) {
			Class70_Sub1.outStream.createFrame(2, 98);	//SOUND_SETTINGS
			Class90.anInt1842++;
			Class70_Sub1.outStream
			    .addInt(Class33.method290(104), 122);
			Class67_Sub5_Sub4_Sub2.aBoolean5132 = true;
		    }
		    Class56.method486(0);
		    if (Class67_Sub5_Sub18.anInt4804 == 30) {
			Class67_Sub1_Sub21.method719((byte) -118);
			Class118.method1637((byte) -24);
			Class67_Sub1_Sub3.method636(128);
			Class55_Sub2.anInt2805++;
			if ((Class55_Sub2.anInt2805 ^ 0xffffffff) < -751)
			    Class119.method1645(-57);
			else {
			    Class67_Sub1_Sub35.method776(10046);
			    Class75.method1381(false);
			    Class101.method1540(false);
			    if (Class86.aClass7_1759 != null)
				Class70_Sub1.method1341(true);
			    for (int i = Class126_Sub4.method1721(-31374,
								  true);
				 i != -1;
				 i = Class126_Sub4.method1721(-31374, false)) {
				Class142.method1952(i, -107);
				Class61.anIntArray1135
				    [Class75.method1379(31, Class67_Sub5_Sub15
								.anInt4749++)]
				    = i;
			    }
			    for (Class67_Sub5_Sub3 class67_sub5_sub3
				     = Class67_Sub29.method1311(-124);
				 class67_sub5_sub3 != null;
				 class67_sub5_sub3
				     = Class67_Sub29.method1311(-111)) {
				int i = class67_sub5_sub3.method842(55);
				int i_11_ = class67_sub5_sub3.method843((byte) 126);
				if ((i ^ 0xffffffff) != -2) {
				    if (i == 2) {
					Class85.aRSStringArray1705[i_11_] = class67_sub5_sub3.aRSString_4497;
					PacketParser.anIntArray2115[(Class75.method1379(31, Class128.anInt2383++))] = i_11_;
				    } else if ((i ^ 0xffffffff) == -4) {
					Class7 class7
					    = Class3.method69((byte) 110,
							      i_11_);
					if (!class67_sub5_sub3
						 .aRSString_4497.method519
					     ((byte) -103,
					      class7.aRSString_219)) {
					    class7.aRSString_219
						= (class67_sub5_sub3
						   .aRSString_4497);
					    Class37.method326(class7, 110);
					}
				    } else if ((i ^ 0xffffffff) != -5) {
					if ((i ^ 0xffffffff) == -6) {
					    Class7 class7
						= Class3.method69((byte) 110,
								  i_11_);
					    if ((class67_sub5_sub3.anInt4491
						 != class7.anInt274)
						|| (class67_sub5_sub3.anInt4491
						    == -1)) {
						class7.anInt274
						    = (class67_sub5_sub3
						       .anInt4491);
						class7.anInt203 = 1;
						class7.anInt298 = 0;
						class7.anInt257 = 0;
						Class37.method326(class7, 111);
					    }
					} else if (i == 6) {
					    int i_12_
						= class67_sub5_sub3.anInt4491;
					    int i_13_
						= i_12_ >> 558734538 & 0x1f;
					    int i_14_ = i_12_ & 0x1f;
					    int i_15_
						= (i_12_ & 0x3ee) >> 518554757;
					    Class7 class7
						= Class3.method69((byte) 110,
								  i_11_);
					    int i_16_
						= ((i_14_ << -971175805)
						   + ((i_13_ << -959848365)
						      - -(i_15_
							  << -237964469)));
					    if ((i_16_ ^ 0xffffffff)
						!= (class7.anInt279
						    ^ 0xffffffff)) {
						class7.anInt279 = i_16_;
						Class37.method326(class7, 77);
					    }
					} else if (i != 7) {
					    if ((i ^ 0xffffffff) != -9) {
						if (i != 9) {
						    if ((i ^ 0xffffffff)
							== -11) {
							Class7 class7
							    = (Class3.method69
							       ((byte) 110,
								i_11_));
							if (((class7.anInt216
							      ^ 0xffffffff)
							     != ((class67_sub5_sub3
								  .anInt4491)
								 ^ 0xffffffff))
							    || (((class7
								  .anInt220)
								 ^ 0xffffffff)
								!= ((class67_sub5_sub3
								     .anInt4500)
								    ^ 0xffffffff))
							    || ((class67_sub5_sub3
								 .anInt4495)
								!= (class7
								    .anInt325))) {
							    class7.anInt216
								= (class67_sub5_sub3
								   .anInt4491);
							    class7.anInt220
								= (class67_sub5_sub3
								   .anInt4500);
							    class7.anInt325
								= (class67_sub5_sub3
								   .anInt4495);
							    Class37.method326
								(class7, 87);
							}
						    } else if (i == 11) {
							Class7 class7
							    = (Class3.method69
							       ((byte) 110,
								i_11_));
							class7.anInt251
							    = class7.anInt295
							    = (class67_sub5_sub3
							       .anInt4500);
							class7.anInt221
							    = class7.anInt292
							    = (class67_sub5_sub3
							       .anInt4491);
							class7.aByte233
							    = (byte) 0;
							class7.aByte173
							    = (byte) 0;
							Class37.method326
							    (class7, 126);
						    } else if ((i ^ 0xffffffff)
							       != -13) {
							if (i == 13) {
							    Class7 class7
								= (Class3
								       .method69
								   ((byte) 110,
								    i_11_));
							    class7.anInt202
								= (class67_sub5_sub3
								   .anInt4491);
							}
						    } else {
							Class7 class7
							    = (Class3.method69
							       ((byte) 110,
								i_11_));
							int i_17_
							    = (class67_sub5_sub3
							       .anInt4491);
							if (class7 != null
							    && (((class7
								  .anInt227)
								 ^ 0xffffffff)
								== -1)) {
							    if (i_17_
								> ((class7
								    .anInt222)
								   + -(class7
								       .anInt194)))
								i_17_
								    = (-(class7
									 .anInt194)
								       + (class7
									  .anInt222));
							    if ((i_17_
								 ^ 0xffffffff)
								> -1)
								i_17_ = 0;
							    if ((i_17_
								 ^ 0xffffffff)
								!= ((class7
								     .anInt291)
								    ^ 0xffffffff)) {
								class7.anInt291
								    = i_17_;
								Class37
								    .method326
								    (class7,
								     123);
							    }
							}
						    }
						} else {
						    Class7 class7
							= (Class3.method69
							   ((byte) 110,
							    i_11_));
						    if (((class7.anInt289
							  ^ 0xffffffff)
							 != ((class67_sub5_sub3
							      .anInt4491)
							     ^ 0xffffffff))
							|| (class7.anInt288
							    != (class67_sub5_sub3
								.anInt4500))) {
							class7.anInt289
							    = (class67_sub5_sub3
							       .anInt4491);
							class7.anInt288
							    = (class67_sub5_sub3
							       .anInt4500);
							Class37.method326
							    (class7, 98);
						    }
						}
					    } else {
						Class7 class7
						    = (Class3.method69
						       ((byte) 110, i_11_));
						if ((((class67_sub5_sub3
						       .anInt4491)
						      ^ 0xffffffff)
						     != (class7.anInt330
							 ^ 0xffffffff))
						    || ((class67_sub5_sub3
							 .anInt4500)
							!= class7.anInt164)
						    || (class7.anInt338
							!= (class67_sub5_sub3
							    .anInt4495))) {
						    class7.anInt164
							= (class67_sub5_sub3
							   .anInt4500);
						    class7.anInt330
							= (class67_sub5_sub3
							   .anInt4491);
						    class7.anInt338
							= (class67_sub5_sub3
							   .anInt4495);
						    if (class7.anInt289
							!= -1) {
							if ((class7.anInt240
							     ^ 0xffffffff)
							    < -1)
							    class7.anInt338
								= ((class7
								    .anInt338)
								   * 32
								   / (class7
								      .anInt240));
							else if (((class7
								   .anInt193)
								  ^ 0xffffffff)
								 < -1)
							    class7.anInt338
								= (32
								   * (class7
								      .anInt338)
								   / (class7
								      .anInt193));
						    }
						    Class37.method326(class7,
								      116);
						}
					    }
					} else {
					    Class7 class7
						= Class3.method69((byte) 110,
								  i_11_);
					    boolean bool
						= ((class67_sub5_sub3.anInt4491
						    ^ 0xffffffff)
						   == -2);
					    if (class7.aBoolean313 != bool) {
						class7.aBoolean313 = bool;
						Class37.method326(class7, 78);
					    }
					}
				    } else {
					Class7 class7
					    = Class3.method69((byte) 110,
							      i_11_);
					int i_18_
					    = class67_sub5_sub3.anInt4491;
					int i_19_
					    = class67_sub5_sub3.anInt4500;
					int i_20_
					    = class67_sub5_sub3.anInt4495;
					if (((class7.anInt329 ^ 0xffffffff)
					     != (i_18_ ^ 0xffffffff))
					    || i_19_ != class7.anInt183
					    || ((class7.anInt275 ^ 0xffffffff)
						!= (i_20_ ^ 0xffffffff))) {
					    class7.anInt275 = i_20_;
					    class7.anInt329 = i_18_;
					    class7.anInt183 = i_19_;
					    Class37.method326(class7, 91);
					}
				    }
				} else {
				    Class67_Sub1_Sub21.anIntArray4164[i_11_]
					= class67_sub5_sub3.anInt4491;
				    Class33.anIntArray727
					[Class75.method1379(31,
							    Class67_Sub15
								.anInt3070++)]
					= i_11_;
				}
			    }
			    if (Class67_Sub5_Sub4.anInt4512 != 0) {
				Class55_Sub3.anInt2816 += 20;
				if ((Class55_Sub3.anInt2816 ^ 0xffffffff)
				    <= -401)
				    Class67_Sub5_Sub4.anInt4512 = 0;
			    }
			    RSString.anInt2642++;
			    if (Class67_Sub5_Sub9.aClass7_4604 != null) {
				Class126.anInt2360++;
				if ((Class126.anInt2360 ^ 0xffffffff) <= -16) {
				    Class37.method326((Class67_Sub5_Sub9
						       .aClass7_4604),
						      123);
				    Class67_Sub5_Sub9.aClass7_4604 = null;
				}
			    }
			    if (Class36.aClass7_769 != null) {
				Class37.method326(Class36.aClass7_769, 83);
				if (((Class67_Sub5_Sub17.anInt4786
				      ^ 0xffffffff)
				     < (Class33_Sub2.anInt2779 - -5
					^ 0xffffffff))
				    || (Class33_Sub2.anInt2779 + -5
					> Class67_Sub5_Sub17.anInt4786)
				    || (Class67_Sub1_Sub22.anInt4172
					> 5 + Class67_Sub1_Sub2.anInt3834)
				    || (-5 + Class67_Sub1_Sub2.anInt3834
					> Class67_Sub1_Sub22.anInt4172))
				    Class122.aBoolean2305 = true;
				Class40.anInt815++;
				if ((Class16.anInt464 ^ 0xffffffff) == -1) {
				    if (Class122.aBoolean2305
					&& Class40.anInt815 >= 5) {
					if ((Class36.aClass7_769
					     == Class55.aClass7_1089)
					    && (Class101.anInt1989
						!= Class137.anInt2521)) {
					    Class96.anInt1916++;
					    Class7 class7
						= Class36.aClass7_769;
					    int i = 0;
					    if (Class67_Sub6.anInt2868 == 1
						&& class7.anInt287 == 206)
						i = 1;
					    if (((class7.anIntArray264
						  [Class101.anInt1989])
						 ^ 0xffffffff)
						>= -1)
						i = 0;
					    if (client.method31(class7)
						    .method1234((byte) 65)) {
						int i_21_ = Class137.anInt2521;
						int i_22_ = Class101.anInt1989;
						class7.anIntArray264[i_22_]
						    = (class7.anIntArray264
						       [i_21_]);
						class7.anIntArray253[i_22_]
						    = (class7.anIntArray253
						       [i_21_]);
						class7.anIntArray264[i_21_]
						    = -1;
						class7.anIntArray253[i_21_]
						    = 0;
					    } else if (i == 1) {
						int i_23_ = Class137.anInt2521;
						int i_24_ = Class101.anInt1989;
						while (i_23_ != i_24_) {
						    if ((i_24_ ^ 0xffffffff)
							> (i_23_
							   ^ 0xffffffff)) {
							class7.method95(124,
									(i_23_
									 - 1),
									i_23_);
							i_23_--;
						    } else if (i_24_ > i_23_) {
							class7.method95
							    (119, 1 + i_23_,
							     i_23_);
							i_23_++;
						    }
						}
					    } else
						class7.method95(124, (Class101.anInt1989), (Class137.anInt2521));
					    Class70_Sub1.outStream.createFrame(2, 231);	//INV_SWAP_SLOT
					    Class70_Sub1.outStream.addUShort(16711680, Class137.anInt2521);
					    Class70_Sub1.outStream.addLEInt((byte) -115, Class36.aClass7_769.anInt301);
					    Class70_Sub1.outStream.addShortA(Class101.anInt1989, -12196);
					    Class70_Sub1.outStream.addByteS(i, (byte) 120);
					}
				    } else if (((Class23.anInt569
						 ^ 0xffffffff) != -2
						&& !(Class111.method1591
						     (Class134.anInt2476 + -1,
						      (byte) -53)))
					       || Class134.anInt2476 <= 2) {
					if ((Class134.anInt2476 ^ 0xffffffff)
					    < -1)
					    Class67_Sub23.method1288(122);
				    } else
					Class43.method383(-36);
				    Class126.anInt2360 = 10;
				    Class36.aClass7_769 = null;
				    Class100.anInt1975 = 0;
				}
			    }
			    Class141.aBoolean2557 = false;
			    Class131_Sub7_Sub1.aBoolean5056 = false;
			    Class7 class7 = Class30.aClass7_698;
			    Class30.aClass7_698 = null;
			    Class7 class7_25_ = Class67_Sub5_Sub6.aClass7_4536;
			    Class67_Sub5_Sub9.aClass7_4620 = null;
			    Class67_Sub5_Sub6.aClass7_4536 = null;
			    for (Class67_Sub20.anInt3168 = 0;
				 (RSString.method546(false)
				  && Class67_Sub20.anInt3168 < 128);
				 Class67_Sub20.anInt3168++) {
				Class67_Sub1_Sub28.anIntArray4255
				    [Class67_Sub20.anInt3168]
				    = Class41.anInt873;
				Class54.anIntArray1076[Class67_Sub20.anInt3168]
				    = Class87.anInt1800;
			    }
			    Class86.aClass7_1759 = null;
			    if ((Class54.anInt1080 ^ 0xffffffff) != 0)
				Class27.method257(Class49.anInt1010, 0,
						  Class56.anInt1097, 0,
						  (byte) 120,
						  Class54.anInt1080, 0, 0);
			    Class11.anInt409++;
			    for (;;) {
				Class67_Sub30 class67_sub30
				    = ((Class67_Sub30)
				       Class25.aClass50_602.method442(true));
				if (class67_sub30 == null)
				    break;
				Class7 class7_26_ = class67_sub30.aClass7_3352;
				if ((class7_26_.anInt266 ^ 0xffffffff) <= -1) {
				    Class7 class7_27_
					= Class3.method69((byte) 110,
							  class7_26_.anInt174);
				    if (class7_27_ == null
					|| class7_27_.aClass7Array228 == null
					|| ((class7_27_.aClass7Array228.length
					     ^ 0xffffffff)
					    >= (class7_26_.anInt266
						^ 0xffffffff))
					|| (class7_26_
					    != (class7_27_.aClass7Array228
						[class7_26_.anInt266])))
					continue;
				}
				Class81.method1429(class67_sub30, 60);
			    }
			    for (;;) {
				Class67_Sub30 class67_sub30
				    = ((Class67_Sub30)
				       Class67_Sub24.aClass50_3213
					   .method442(true));
				if (class67_sub30 == null)
				    break;
				Class7 class7_28_ = class67_sub30.aClass7_3352;
				if ((class7_28_.anInt266 ^ 0xffffffff) <= -1) {
				    Class7 class7_29_
					= Class3.method69((byte) 110,
							  class7_28_.anInt174);
				    if (class7_29_ == null
					|| class7_29_.aClass7Array228 == null
					|| (class7_29_.aClass7Array228.length
					    <= class7_28_.anInt266)
					|| (class7_28_
					    != (class7_29_.aClass7Array228
						[class7_28_.anInt266])))
					continue;
				}
				Class81.method1429(class67_sub30, -60);
			    }
			    for (;;) {
				Class67_Sub30 class67_sub30
				    = ((Class67_Sub30)
				       Class67_Sub17.aClass50_3094
					   .method442(true));
				if (class67_sub30 == null)
				    break;
				Class7 class7_30_ = class67_sub30.aClass7_3352;
				if ((class7_30_.anInt266 ^ 0xffffffff) <= -1) {
				    Class7 class7_31_
					= Class3.method69((byte) 110,
							  class7_30_.anInt174);
				    if (class7_31_ == null
					|| class7_31_.aClass7Array228 == null
					|| (class7_30_.anInt266
					    >= (class7_31_
						.aClass7Array228).length)
					|| (class7_30_
					    != (class7_31_.aClass7Array228
						[class7_30_.anInt266])))
					continue;
				}
				Class81.method1429(class67_sub30, -124);
			    }
			    if (Class86.aClass7_1759 == null)
				Class116.anInt2194 = 0;
			    if (Class67_Sub5_Sub12.aClass7_4699 != null)
				Class49.method429((byte) -125);
			    if (Class67_Sub17.anInt3107 > 0
				&& Class131_Sub7.aBooleanArray3698[82]
				&& Class131_Sub7.aBooleanArray3698[81]
				&& (Class74.anInt1493 ^ 0xffffffff) != -1) {
				int i
				    = -Class74.anInt1493 + Canvas_Sub1.anInt59;
				if ((i ^ 0xffffffff) <= -1) {
				    if (i > 3)
					i = 3;
				} else
				    i = 0;
				Class67_Sub1_Sub32.method769
				    ((Class58.baseX
				      - -(Class122.aClass131_Sub7_Sub2_2309
					  .smallX[0])),
				     (Class122.aClass131_Sub7_Sub2_2309
				      .smallY[0]) + Class137.baseY,
				     i, 2074796454);
			    }
			    if (Class67_Sub17.anInt3107 > 0
				&& Class131_Sub7.aBooleanArray3698[82]
				&& Class131_Sub7.aBooleanArray3698[81]) {
				if ((Class119.anInt2260 ^ 0xffffffff) != 0)
				    Class67_Sub1_Sub32.method769
					((Class58.baseX
					  + Class119.anInt2260),
					 (Class137.baseY
					  + Class131_Sub3.anInt3630),
					 Canvas_Sub1.anInt59, 2074796454);
				Class67_Sub1_Sub36.anInt4366
				    = Class80.anInt1622 = 0;
			    } else if (Class67_Sub1_Sub36.anInt4366 != 2) {
				if (Class80.anInt1622 != 2) {
				    if (Class119.anInt2260 != -1
					&& (Class67_Sub1_Sub36.anInt4366
					    ^ 0xffffffff) == -1
					&& Class80.anInt1622 == 0) {
					boolean bool
					    = (Class57.method490
					       (0, Class131_Sub3.anInt3630,
						Class119.anInt2260, 0,
						(byte) -6, true, 0, 0,
						(Class122
						 .aClass131_Sub7_Sub2_2309
						 .smallY[0]),
						0, 0,
						(Class122
						 .aClass131_Sub7_Sub2_2309
						 .smallX[0])));
					if (bool) {
					    Class75.anInt2726
						= Class101.anInt1985;
					    Class116.anInt2190
						= Class115.anInt2186;
					    Class67_Sub5_Sub4.anInt4512 = 1;
					    Class55_Sub3.anInt2816 = 0;
					}
				    }
				} else {
				    if ((Class119.anInt2260 ^ 0xffffffff)
					!= 0) {
					Class131_Sub3.anInt3606++;
					Class70_Sub1
					    .outStream
					    .createFrame(2, 179);
					Class70_Sub1
					    .outStream.addUShort(16711680, (Class131_Sub3.anInt3630
							+ Class137.baseY));
					Class70_Sub1
					    .outStream.addUShort(16711680,
					     (Class58.baseX
					      - -Class119.anInt2260));
					Class55_Sub3.anInt2816 = 0;
					Class75.anInt2726 = Class101.anInt1985;
					Class67_Sub5_Sub4.anInt4512 = 1;
					Class116.anInt2190
					    = Class115.anInt2186;
				    }
				    Class80.anInt1622 = 0;
				}
			    } else {
				if ((Class119.anInt2260 ^ 0xffffffff) != 0) {
				    Class67_Sub17.anInt3109++;
				    Class70_Sub1.outStream
					.createFrame(2, 131);
				    Class70_Sub1.outStream
					.addInt2
					(Class67_Sub1_Sub24.anInt4200, -91);
				    Class70_Sub1.outStream
					.addShortA
					((Class58.baseX
					  - -Class119.anInt2260),
					 -12196);
				    Class70_Sub1.outStream
					.addLEShortA
					((byte) 60,
					 Class67_Sub5_Sub6.anInt4558);
				    Class70_Sub1.outStream
					.addShortA
					((Class137.baseY
					  + Class131_Sub3.anInt3630),
					 -12196);
				    Class67_Sub5_Sub4.anInt4512 = 1;
				    Class55_Sub3.anInt2816 = 0;
				    Class116.anInt2190 = Class115.anInt2186;
				    Class75.anInt2726 = Class101.anInt1985;
				}
				Class67_Sub1_Sub36.anInt4366 = 0;
			    }
			    Class119.anInt2260 = -1;
			    Class67_Sub1_Sub6.method644(false);
			    if (Class30.aClass7_698 != class7) {
				if (class7 != null)
				    Class37.method326(class7, 79);
				if (Class30.aClass7_698 != null)
				    Class37.method326(Class30.aClass7_698,
						      126);
			    }
			    if (class7_25_ != Class67_Sub5_Sub6.aClass7_4536
				&& ((Class67_Sub5_Sub6.anInt4534 ^ 0xffffffff)
				    == (Class67.anInt1342 ^ 0xffffffff))) {
				if (class7_25_ != null)
				    Class37.method326(class7_25_, 108);
				if (Class67_Sub5_Sub6.aClass7_4536 != null)
				    Class37.method326((Class67_Sub5_Sub6
						       .aClass7_4536),
						      82);
			    }
			    if (Class67_Sub5_Sub6.aClass7_4536 == null) {
				if (Class67_Sub5_Sub6.anInt4534 > 0)
				    Class67_Sub5_Sub6.anInt4534--;
			    } else if (Class67_Sub5_Sub6.anInt4534
				       < Class67.anInt1342) {
				Class67_Sub5_Sub6.anInt4534++;
				if ((Class67_Sub5_Sub6.anInt4534 ^ 0xffffffff)
				    == (Class67.anInt1342 ^ 0xffffffff))
				    Class37.method326((Class67_Sub5_Sub6
						       .aClass7_4536),
						      76);
			    }
			    if ((Class22.anInt530 ^ 0xffffffff) == -2)
				OutputStream_Sub1.method57((byte) 110);
			    else if ((Class22.anInt530 ^ 0xffffffff) == -3)
				Class132.method1900((byte) 127);
			    else
				Class74.method1373(1);
			    for (int i = 0; (i ^ 0xffffffff) > -6; i++)
				Class18.anIntArray2732[i]++;
			    int i = Class67_Sub1_Sub22.method720(23);
			    int i_32_ = Class67_Sub3.method815(0);
			    if ((i ^ 0xffffffff) < -15001
				&& (i_32_ ^ 0xffffffff) < -15001) {
				Class55_Sub2.anInt2800 = 250;
				Class67_Sub5_Sub18.method998(14500, 119);
				Class67_Sub29.anInt3339++;
				Class70_Sub1.outStream
				    .createFrame(2, 245);	//IDLE
			    }
			    if (Class67_Sub5_Sub2.aClass31_4475 != null
				&& (Class67_Sub5_Sub2.aClass31_4475.anInt706
				    == 1)) {
				if (Class67_Sub5_Sub2.aClass31_4475.anObject705
				    != null)
				    Class67_Sub1_Sub19.method707
					(Class67_Sub1_Sub16_Sub1.aBoolean5095,
					 (byte) 85, client.aRSString_2750);
				Class67_Sub5_Sub2.aClass31_4475 = null;
				Class67_Sub1_Sub16_Sub1.aBoolean5095 = false;
				client.aRSString_2750 = null;
			    }
			    Class74.anInt1498++;
			    Class67_Sub1_Sub34.anInt4328++;
			    Class129_Sub1.pingTick++;
			    if (Class74.anInt1498 > 500) {
				int i_33_ = (int) (Math.random() * 8.0);
				if ((0x2 & i_33_ ^ 0xffffffff) == -3)
				    Class126_Sub1.anInt3417
					+= Class81.anInt1655;
				Class74.anInt1498 = 0;
				if ((i_33_ & 0x1) == 1)
				    client.anInt2745
					+= Class67_Sub1_Sub15.anInt4064;
				if ((0x4 & i_33_) == 4)
				    Class55_Sub1.anInt2790
					+= Class67_Sub22.anInt3187;
			    }
			    if ((client.anInt2745 ^ 0xffffffff) > 49)
				Class67_Sub1_Sub15.anInt4064 = 2;
			    if (client.anInt2745 > 50)
				Class67_Sub1_Sub15.anInt4064 = -2;
			    if (Class67_Sub1_Sub34.anInt4328 > 500) {
				int i_34_ = (int) (8.0 * Math.random());
				if ((i_34_ & 0x1 ^ 0xffffffff) == -2)
				    Class5.anInt137 += Class50.anInt1035;
				Class67_Sub1_Sub34.anInt4328 = 0;
				if ((i_34_ & 0x2) == 2)
				    Class67_Sub1_Sub15.anInt4063
					+= Class67_Sub1_Sub33.anInt4316;
			    }
			    if (Class55_Sub1.anInt2790 < -40)
				Class67_Sub22.anInt3187 = 1;
			    if ((Class5.anInt137 ^ 0xffffffff) > 59)
				Class50.anInt1035 = 2;
			    if (Class55_Sub1.anInt2790 > 40)
				Class67_Sub22.anInt3187 = -1;
			    if ((Class67_Sub1_Sub15.anInt4063 ^ 0xffffffff)
				> 19)
				Class67_Sub1_Sub33.anInt4316 = 1;
			    if ((Class126_Sub1.anInt3417 ^ 0xffffffff) > 54)
				Class81.anInt1655 = 2;
			    if ((Class126_Sub1.anInt3417 ^ 0xffffffff) < -56)
				Class81.anInt1655 = -2;
			    if ((Class67_Sub1_Sub15.anInt4063 ^ 0xffffffff)
				< -11)
				Class67_Sub1_Sub33.anInt4316 = -1;
			    if ((Class5.anInt137 ^ 0xffffffff) < -61)
				Class50.anInt1035 = -2;
			    if ((Class129_Sub1.pingTick ^ 0xffffffff) < -51) {
				Class70_Sub1.outStream.createFrame(2, 93);	//PING
				Class88.pingsSent++;
			    }
			    if (Class67_Sub5_Sub4_Sub2.aBoolean5135) {
				Class7.method96(128);
				Class67_Sub5_Sub4_Sub2.aBoolean5135 = false;
			    }
			    do {
				try {
				    if (Class41.aClass117_867 == null || (Class70_Sub1.outStream.currentOffset) <= 0)
					break;
				    Class41.aClass117_867.queueBytesToSend(0, (Class70_Sub1.outStream.buffer), (Class70_Sub1.outStream.currentOffset), (byte) 127);
				    Class70_Sub1.outStream.currentOffset = 0;
				    Class129_Sub1.pingTick = 0;
				} catch (java.io.IOException ioexception) {
				    Class119.method1645(-115);
				    break;
				}
				break;
			    } while (false);
			}
		    }
		}
	    }
	}
    }
    
    public static RSString method1297(RSString arg0, int arg1) {
	anInt3274++;
	int i = Class67_Sub5_Sub11_Sub2.method940(arg0, arg1);
	if (i == -1)
	    return Class36.aRSString_781;
	return Class68.aClass72_1369.aRSStringArray1441[i]
		   .method508(Class20.aRSString_511, true, Class6.aRSString_150);
    }
    
    public static void method1298(int arg0, boolean arg1, RSString arg2,
				  byte arg3, Color arg4) {
	try {
	    try {
		Graphics graphics
		    = Class67_Sub5_Sub12.aCanvas4698.getGraphics();
		if (Class143.aFont2582 == null) {
		    Class143.aFont2582 = new Font("Helvetica", 1, 13);
		    Class141.aFontMetrics2554
			= Class67_Sub5_Sub12.aCanvas4698
			      .getFontMetrics(Class143.aFont2582);
		}
		if (arg1) {
		    graphics.setColor(Color.black);
		    graphics.fillRect(0, 0, Class56.anInt1097,
				      Class49.anInt1010);
		}
		if (arg4 == null)
		    arg4 = new Color(140, 17, 17);
		try {
		    if (Class21.anImage519 == null)
			Class21.anImage519
			    = Class67_Sub5_Sub12.aCanvas4698.createImage(304,
									 34);
		    if (arg3 != 75)
			anIntArray3273 = null;
		    Graphics graphics_35_ = Class21.anImage519.getGraphics();
		    graphics_35_.setColor(arg4);
		    graphics_35_.drawRect(0, 0, 303, 33);
		    graphics_35_.fillRect(2, 2, 3 * arg0, 30);
		    graphics_35_.setColor(Color.black);
		    graphics_35_.drawRect(1, 1, 301, 31);
		    graphics_35_.fillRect(3 * arg0 + 2, 2, 300 + -(3 * arg0),
					  30);
		    graphics_35_.setFont(Class143.aFont2582);
		    graphics_35_.setColor(Color.white);
		    arg2.method539(125,
				   ((304 - arg2.method497((byte) 122,
							  (Class141
							   .aFontMetrics2554)))
				    / 2),
				   graphics_35_, 22);
		    graphics.drawImage(Class21.anImage519,
				       Class56.anInt1097 / 2 - 152,
				       -18 + Class49.anInt1010 / 2, null);
		} catch (Exception exception) {
		    int i = -152 + Class56.anInt1097 / 2;
		    int i_36_ = -18 + Class49.anInt1010 / 2;
		    graphics.setColor(arg4);
		    graphics.drawRect(i, i_36_, 303, 33);
		    graphics.fillRect(i - -2, i_36_ + 2, 3 * arg0, 30);
		    graphics.setColor(Color.black);
		    graphics.drawRect(i - -1, i_36_ - -1, 301, 31);
		    graphics.fillRect(arg0 * 3 + 2 + i, i_36_ + 2,
				      300 + -(3 * arg0), 30);
		    graphics.setFont(Class143.aFont2582);
		    graphics.setColor(Color.white);
		    arg2.method539(100,
				   i + ((304
					 - arg2.method497((byte) 108,
							  (Class141
							   .aFontMetrics2554)))
					/ 2),
				   graphics, i_36_ + 22);
		}
		if (Class125.aRSString_2343 != null) {
		    graphics.setFont(Class143.aFont2582);
		    graphics.setColor(Color.white);
		    Class125.aRSString_2343.method539
			(89,
			 (Class56.anInt1097 / 2
			  - (Class125.aRSString_2343.method497
			     ((byte) -127, Class141.aFontMetrics2554)) / 2),
			 graphics, -26 + Class49.anInt1010 / 2);
		}
	    } catch (Exception exception) {
		Class67_Sub5_Sub12.aCanvas4698.repaint();
	    }
	    anInt3259++;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("t.B(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method1299(byte arg0) {
	aClass67_Sub13_Sub1_3289 = null;
	aClass67_Sub27_3279 = null;
	aClass67_Sub11_Sub3_3267 = null;
	aClass130_3287 = null;
	if (arg0 <= 110)
	    anInt3285 = -72;
	anInt3280++;
    }
    
    public static void method1300(int arg0, byte arg1, int arg2, int arg3,
				  int arg4) {
	if ((arg2 ^ 0xffffffff) <= (Class55_Sub2.anInt2801 ^ 0xffffffff)
	    && (OutputStream_Sub1.anInt87 ^ 0xffffffff) <= (arg2
							    ^ 0xffffffff)) {
	    arg3 = Class7.method97(arg3, Class126_Sub1.anInt3423,
				   Class139.anInt2533, 65535);
	    arg4 = Class7.method97(arg4, Class126_Sub1.anInt3423,
				   Class139.anInt2533, arg1 + 65433);
	    Class9.method122(arg2, arg4, 28375, arg3, arg0);
	}
	anInt3268++;
	if (arg1 != 102)
	    method1298(-113, true, null, (byte) -28, null);
    }
    
    static {
	aRSString_3269 = Class134.method1914("glissement:", (byte) 74);
	aRSString_3288 = null;
	aClass137_3265 = new Class137(128);
	aRSString_3293 = Class134.method1914(" )2>", (byte) 75);
    }
}
