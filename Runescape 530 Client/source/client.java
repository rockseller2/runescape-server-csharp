/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.awt.Insets;
import java.net.Socket;
import java.util.GregorianCalendar;

public class client extends Applet_Sub1
{
    public static int anInt2733;
    public static boolean aBoolean2734 = false;
    public static int anInt2735;
    public static int anInt2736;
    public static int anInt2737;
    public static int anInt2738;
    public static boolean[][] aBooleanArrayArray2739;
    public static int anInt2740;
    public static int anInt2741;
    public static RSString aRSString_2742;
    public static RSString aRSString_2743
	= Class134.method1914("wishes to trade with you)3", (byte) 112);
    public static int anInt2744;
    public static int anInt2745 = 0;
    public static int anInt2746;
    public static int anInt2747;
    public static int anInt2748;
    public static int anInt2749;
    public static RSString aRSString_2750;
    public static int anInt2751;
    public static int anInt2752;
    public static int anInt2753;
    public static int anInt2754;
    
    public void method23(int arg0) {
	anInt2741++;
	if (Class40.aClass5_829 != null)
	    Class40.aClass5_829.aBoolean140 = false;
	Class40.aClass5_829 = null;
	if (Class41.aClass117_867 != null) {
	    Class41.aClass117_867.method1632((byte) 125);
	    Class41.aClass117_867 = null;
	}
	Class34.method309(arg0 ^ 0xffffffff, Class67_Sub5_Sub12.aCanvas4698);
	Class73.method1355(Class67_Sub5_Sub12.aCanvas4698, 0);
	if (Class82.aLogin_1669 != null)
	    Class82.aLogin_1669.method1420((byte) 52,
					     Class67_Sub5_Sub12.aCanvas4698);
	Class37.method321(arg0 ^ 0x34ec);
	Class40.method342(arg0);
	Class82.aLogin_1669 = null;
	if (Class67_Sub5_Sub9.aClass28_4616 != null)
	    Class67_Sub5_Sub9.aClass28_4616.method270(arg0 + 123);
	if (Class78.aClass28_1606 != null)
	    Class78.aClass28_1606.method270(86);
	Class144.aClass40_2588.method352(true);
	Class129.aClass16_2389.method171(false);
	do {
	    try {
		if (Class67_Sub10.aClass115_3009 != null)
		    Class67_Sub10.aClass115_3009.method1617(-2275);
		if (Class43.aClass115Array903 != null) {
		    for (int i = 0; i < Class43.aClass115Array903.length;
			 i++) {
			if (Class43.aClass115Array903[i] != null)
			    Class43.aClass115Array903[i].method1617(-2275);
		    }
		}
		if (Class105.aClass115_2045 != null)
		    Class105.aClass115_2045.method1617(arg0 ^ ~0x8e2);
		if (Class67_Sub5.aClass115_2858 == null)
		    break;
		Class67_Sub5.aClass115_2858.method1617(-2275);
	    } catch (java.io.IOException ioexception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    public static Class67_Sub14 method31(Class7 arg0) {
	Class67_Sub14 class67_sub14
	    = ((Class67_Sub14)
	       (Class67_Sub5_Sub4_Sub1.aClass92_5113.method1489
		((byte) -43,
		 ((long) arg0.anInt301 << 32) + (long) arg0.anInt266)));
	if (class67_sub14 != null)
	    return class67_sub14;
	return arg0.aClass67_Sub14_309;
    }
    
    public static void method32(Class7[] arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7) {
	for (int i = 0; i < arg0.length; i++) {
	    Class7 class7 = arg0[i];
	    if (class7 != null && class7.anInt174 == arg1
		&& (!class7.aBoolean185 || class7.anInt227 == 0
		    || class7.aBoolean169 || method31(class7).anInt3060 != 0
		    || class7 == Class67_Sub1_Sub34.aClass7_4337
		    || class7.anInt287 == 1338)
		&& (!class7.aBoolean185 || !method33(class7))) {
		int i_0_ = class7.anInt221 + arg6;
		int i_1_ = class7.anInt251 + arg7;
		int i_2_;
		int i_3_;
		int i_4_;
		int i_5_;
		if (class7.anInt227 == 2) {
		    i_2_ = arg2;
		    i_3_ = arg3;
		    i_4_ = arg4;
		    i_5_ = arg5;
		} else {
		    int i_6_ = i_0_ + class7.anInt189;
		    int i_7_ = i_1_ + class7.anInt194;
		    if (class7.anInt227 == 9) {
			i_6_++;
			i_7_++;
		    }
		    i_2_ = i_0_ > arg2 ? i_0_ : arg2;
		    i_3_ = i_1_ > arg3 ? i_1_ : arg3;
		    i_4_ = i_6_ < arg4 ? i_6_ : arg4;
		    i_5_ = i_7_ < arg5 ? i_7_ : arg5;
		}
		if (class7 == Class67_Sub5_Sub12.aClass7_4699) {
		    Class141.aBoolean2557 = true;
		    Class118.anInt2232 = i_0_;
		    Class55_Sub3_Sub1.anInt3813 = i_1_;
		}
		if (!class7.aBoolean185 || i_2_ < i_4_ && i_3_ < i_5_) {
		    if (class7.anInt227 == 0) {
			if (!class7.aBoolean185 && method33(class7)
			    && Class30.aClass7_698 != class7)
			    continue;
			if (class7.aBoolean324
			    && Class67_Sub5_Sub17.anInt4786 >= i_2_
			    && Class67_Sub1_Sub22.anInt4172 >= i_3_
			    && Class67_Sub5_Sub17.anInt4786 < i_4_
			    && Class67_Sub1_Sub22.anInt4172 < i_5_) {
			    for (Class67_Sub30 class67_sub30
				     = (Class67_Sub30) Class67_Sub17
							   .aClass50_3094
							   .method445(0);
				 class67_sub30 != null;
				 class67_sub30
				     = (Class67_Sub30) Class67_Sub17
							   .aClass50_3094
							   .method432(0)) {
				if (class67_sub30.aBoolean3345) {
				    class67_sub30.method606((byte) -118);
				    class67_sub30.aClass7_3352.aBoolean314
					= false;
				}
			    }
			    if (Class51.anInt1036 == 0) {
				Class67_Sub5_Sub12.aClass7_4699 = null;
				Class67_Sub1_Sub34.aClass7_4337 = null;
			    }
			    Class116.anInt2194 = 0;
			}
		    }
		    if (class7.aBoolean185) {
			boolean bool;
			if (Class67_Sub5_Sub17.anInt4786 >= i_2_
			    && Class67_Sub1_Sub22.anInt4172 >= i_3_
			    && Class67_Sub5_Sub17.anInt4786 < i_4_
			    && Class67_Sub1_Sub22.anInt4172 < i_5_)
			    bool = true;
			else
			    bool = false;
			boolean bool_8_ = false;
			if (Class16.anInt464 == 1 && bool)
			    bool_8_ = true;
			boolean bool_9_ = false;
			if (Class100.anInt1975 == 1
			    && Class115.anInt2186 >= i_2_
			    && Class101.anInt1985 >= i_3_
			    && Class115.anInt2186 < i_4_
			    && Class101.anInt1985 < i_5_)
			    bool_9_ = true;
			if (class7.aByteArray307 != null) {
			    for (int i_10_ = 0;
				 i_10_ < class7.aByteArray307.length;
				 i_10_++) {
				if (!Class131_Sub7.aBooleanArray3698
				     [class7.aByteArray307[i_10_]]) {
				    if (class7.anIntArray186 != null)
					class7.anIntArray186[i_10_] = 0;
				} else if (class7.anIntArray186 == null
					   || (Class67_Sub1_Sub9.anInt3952
					       >= (class7.anIntArray186
						   [i_10_]))) {
				    byte i_11_ = class7.aByteArray320[i_10_];
				    if (i_11_ == 0
					|| (((i_11_ & 0x2) == 0
					     || (Class131_Sub7
						 .aBooleanArray3698[86]))
					    && ((i_11_ & 0x1) == 0
						|| (Class131_Sub7
						    .aBooleanArray3698[82]))
					    && ((i_11_ & 0x4) == 0
						|| (Class131_Sub7
						    .aBooleanArray3698
						    [81])))) {
					Class67_Sub1_Sub2.method632
					    (Class67_Sub5_Sub5.aRSString_4523,
					     10, -1, class7.anInt301,
					     i_10_ + 1);
					int i_12_
					    = class7.anIntArray247[i_10_];
					if (class7.anIntArray186 == null)
					    class7.anIntArray186
						= (new int
						   [(class7
						     .aByteArray307).length]);
					if (i_12_ != 0)
					    class7.anIntArray186[i_10_]
						= (Class67_Sub1_Sub9.anInt3952
						   + i_12_);
					else
					    class7.anIntArray186[i_10_]
						= 2147483647;
				    }
				}
			    }
			}
			if (bool_9_)
			    method41(Class115.anInt2186 - i_0_, (byte) 61,
				     class7, Class101.anInt1985 - i_1_);
			if (Class67_Sub5_Sub12.aClass7_4699 != null
			    && Class67_Sub5_Sub12.aClass7_4699 != class7
			    && bool && method31(class7).method1235(0))
			    Class67_Sub5_Sub9.aClass7_4620 = class7;
			if (class7 == Class67_Sub1_Sub34.aClass7_4337) {
			    Class131_Sub7_Sub1.aBoolean5056 = true;
			    Class67_Sub19.anInt3146 = i_0_;
			    Class95.anInt1906 = i_1_;
			}
			if (class7.aBoolean169 || class7.anInt287 != 0) {
			    if (bool && Class74.anInt1493 != 0
				&& class7.anObjectArray306 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aBoolean3345 = true;
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anInt3360 = Class74.anInt1493;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray306;
				Class67_Sub17.aClass50_3094
				    .method436(class67_sub30, false);
			    }
			    if (Class67_Sub5_Sub12.aClass7_4699 != null
				|| Class36.aClass7_769 != null
				|| Class67_Sub9.aBoolean2980
				|| (class7.anInt287 != 1400
				    && Class116.anInt2194 > 0)) {
				bool_9_ = false;
				bool_8_ = false;
				bool = false;
			    }
			    if (class7.anInt287 != 0) {
				if (class7.anInt287 == 1337) {
				    Class13.aClass7_436 = class7;
				    Class37.method326(class7, 94);
				    continue;
				}
				if (class7.anInt287 == 1338) {
				    if (bool_9_) {
					Class1.anInt101
					    = Class115.anInt2186 - i_0_;
					Class16.anInt477
					    = Class101.anInt1985 - i_1_;
				    }
				    continue;
				}
				if (class7.anInt287 == 1400) {
				    Class86.aClass7_1759 = class7;
				    if (bool_9_) {
					if (Class131_Sub7.aBooleanArray3698[82]
					    && Class67_Sub17.anInt3107 > 0) {
					    int i_13_
						= (int) ((double) ((Class115
								    .anInt2186)
								   - i_0_
								   - ((class7
								       .anInt189)
								      / 2))
							 * 2.0
							 / (double) (Class54
								     .aFloat1075));
					    int i_14_
						= (int) ((double) ((Class101
								    .anInt1985)
								   - i_1_
								   - ((class7
								       .anInt194)
								      / 2))
							 * 2.0
							 / (double) (Class54
								     .aFloat1075));
					    int i_15_ = (Class67_Sub3.anInt2853
							 + i_13_);
					    int i_16_
						= Class118.anInt2231 + i_14_;
					    int i_17_
						= i_15_ + Class100.anInt1968;
					    int i_18_
						= (Class131_Sub5.anInt3656 - 1
						   - i_16_
						   + (Class67_Sub1_Sub21
						      .anInt4159));
					    Class67_Sub1_Sub32.method769
						(i_17_, i_18_, 0, 2074796454);
					    Class1.method62((byte) 10);
					} else {
					    Class116.anInt2194 = 1;
					    Class67_Sub3.anInt2852
						= Class67_Sub5_Sub17.anInt4786;
					    Class67_Sub3.anInt2844
						= Class67_Sub1_Sub22.anInt4172;
					}
				    } else if (bool_8_
					       && Class116.anInt2194 > 0) {
					if (Class116.anInt2194 == 1
					    && ((Class67_Sub3.anInt2852
						 != (Class67_Sub5_Sub17
						     .anInt4786))
						|| (Class67_Sub3.anInt2844
						    != (Class67_Sub1_Sub22
							.anInt4172)))) {
					    Class67_Sub29.anInt3329
						= Class67_Sub3.anInt2853;
					    Class67_Sub1_Sub19.anInt4141
						= Class118.anInt2231;
					    Class116.anInt2194 = 2;
					}
					if (Class116.anInt2194 == 2) {
					    Class67_Sub1_Sub16.method686
						((Class67_Sub29.anInt3329
						  + (int) ((double) ((Class67_Sub3
								      .anInt2852)
								     - (Class67_Sub5_Sub17
									.anInt4786))
							   * 2.0
							   / (double) (Class131
								       .aFloat2430))),
						 -1);
					    Class131_Sub4.method1814
						((byte) 123,
						 (Class67_Sub1_Sub19.anInt4141
						  + (int) ((double) ((Class67_Sub3
								      .anInt2844)
								     - (Class67_Sub1_Sub22
									.anInt4172))
							   * 2.0
							   / (double) (Class131
								       .aFloat2430))));
					}
				    } else
					Class116.anInt2194 = 0;
				    continue;
				}
				if (class7.anInt287 == 1401) {
				    if (bool_8_)
					Class67_Sub5_Sub8.method889
					    (class7.anInt189,
					     (Class67_Sub1_Sub22.anInt4172
					      - i_1_),
					     (Class67_Sub5_Sub17.anInt4786
					      - i_0_),
					     (byte) -91, class7.anInt194);
				    continue;
				}
				if (class7.anInt287 == 1402) {
				    Class37.method326(class7, 114);
				    continue;
				}
			    }
			    if (!class7.aBoolean296 && bool_9_) {
				class7.aBoolean296 = true;
				if (class7.anObjectArray297 != null) {
				    Class67_Sub30 class67_sub30
					= new Class67_Sub30();
				    class67_sub30.aBoolean3345 = true;
				    class67_sub30.aClass7_3352 = class7;
				    class67_sub30.anInt3353
					= Class115.anInt2186 - i_0_;
				    class67_sub30.anInt3360
					= Class101.anInt1985 - i_1_;
				    class67_sub30.anObjectArray3356
					= class7.anObjectArray297;
				    Class67_Sub17.aClass50_3094
					.method436(class67_sub30, false);
				}
			    }
			    if (class7.aBoolean296 && bool_8_
				&& class7.anObjectArray280 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aBoolean3345 = true;
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anInt3353
				    = Class67_Sub5_Sub17.anInt4786 - i_0_;
				class67_sub30.anInt3360
				    = Class67_Sub1_Sub22.anInt4172 - i_1_;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray280;
				Class67_Sub17.aClass50_3094
				    .method436(class67_sub30, false);
			    }
			    if (class7.aBoolean296 && !bool_8_) {
				class7.aBoolean296 = false;
				if (class7.anObjectArray167 != null) {
				    Class67_Sub30 class67_sub30
					= new Class67_Sub30();
				    class67_sub30.aBoolean3345 = true;
				    class67_sub30.aClass7_3352 = class7;
				    class67_sub30.anInt3353
					= Class67_Sub5_Sub17.anInt4786 - i_0_;
				    class67_sub30.anInt3360
					= Class67_Sub1_Sub22.anInt4172 - i_1_;
				    class67_sub30.anObjectArray3356
					= class7.anObjectArray167;
				    Class67_Sub24.aClass50_3213
					.method436(class67_sub30, false);
				}
			    }
			    if (bool_8_ && class7.anObjectArray209 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aBoolean3345 = true;
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anInt3353
				    = Class67_Sub5_Sub17.anInt4786 - i_0_;
				class67_sub30.anInt3360
				    = Class67_Sub1_Sub22.anInt4172 - i_1_;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray209;
				Class67_Sub17.aClass50_3094
				    .method436(class67_sub30, false);
			    }
			    if (!class7.aBoolean314 && bool) {
				class7.aBoolean314 = true;
				if (class7.anObjectArray310 != null) {
				    Class67_Sub30 class67_sub30
					= new Class67_Sub30();
				    class67_sub30.aBoolean3345 = true;
				    class67_sub30.aClass7_3352 = class7;
				    class67_sub30.anInt3353
					= Class67_Sub5_Sub17.anInt4786 - i_0_;
				    class67_sub30.anInt3360
					= Class67_Sub1_Sub22.anInt4172 - i_1_;
				    class67_sub30.anObjectArray3356
					= class7.anObjectArray310;
				    Class67_Sub17.aClass50_3094
					.method436(class67_sub30, false);
				}
			    }
			    if (class7.aBoolean314 && bool
				&& class7.anObjectArray254 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aBoolean3345 = true;
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anInt3353
				    = Class67_Sub5_Sub17.anInt4786 - i_0_;
				class67_sub30.anInt3360
				    = Class67_Sub1_Sub22.anInt4172 - i_1_;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray254;
				Class67_Sub17.aClass50_3094
				    .method436(class67_sub30, false);
			    }
			    if (class7.aBoolean314 && !bool) {
				class7.aBoolean314 = false;
				if (class7.anObjectArray208 != null) {
				    Class67_Sub30 class67_sub30
					= new Class67_Sub30();
				    class67_sub30.aBoolean3345 = true;
				    class67_sub30.aClass7_3352 = class7;
				    class67_sub30.anInt3353
					= Class67_Sub5_Sub17.anInt4786 - i_0_;
				    class67_sub30.anInt3360
					= Class67_Sub1_Sub22.anInt4172 - i_1_;
				    class67_sub30.anObjectArray3356
					= class7.anObjectArray208;
				    Class67_Sub24.aClass50_3213
					.method436(class67_sub30, false);
				}
			    }
			    if (class7.anObjectArray196 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray196;
				Class25.aClass50_602.method436(class67_sub30,
							       false);
			    }
			    if (class7.anObjectArray268 != null
				&& Class67_Sub15.anInt3070 > class7.anInt335) {
				if (class7.anIntArray207 == null
				    || (Class67_Sub15.anInt3070
					- class7.anInt335) > 32) {
				    Class67_Sub30 class67_sub30
					= new Class67_Sub30();
				    class67_sub30.aClass7_3352 = class7;
				    class67_sub30.anObjectArray3356
					= class7.anObjectArray268;
				    Class67_Sub17.aClass50_3094
					.method436(class67_sub30, false);
				} else {
				while_18_:
				    for (int i_19_ = class7.anInt335;
					 i_19_ < Class67_Sub15.anInt3070;
					 i_19_++) {
					int i_20_ = (Class33.anIntArray727
						     [i_19_ & 0x1f]);
					for (int i_21_ = 0;
					     (i_21_
					      < class7.anIntArray207.length);
					     i_21_++) {
					    if (class7.anIntArray207[i_21_]
						== i_20_) {
						Class67_Sub30 class67_sub30
						    = new Class67_Sub30();
						class67_sub30.aClass7_3352
						    = class7;
						class67_sub30.anObjectArray3356
						    = class7.anObjectArray268;
						Class67_Sub17.aClass50_3094
						    .method436
						    (class67_sub30, false);
						break while_18_;
					    }
					}
				    }
				}
				class7.anInt335 = Class67_Sub15.anInt3070;
			    }
			    if (class7.anObjectArray281 != null
				&& Class128.anInt2383 > class7.anInt175) {
				if (class7.anIntArray283 == null
				    || (Class128.anInt2383 - class7.anInt175
					> 32)) {
				    Class67_Sub30 class67_sub30
					= new Class67_Sub30();
				    class67_sub30.aClass7_3352 = class7;
				    class67_sub30.anObjectArray3356
					= class7.anObjectArray281;
				    Class67_Sub17.aClass50_3094
					.method436(class67_sub30, false);
				} else {
				while_19_:
				    for (int i_22_ = class7.anInt175;
					 i_22_ < Class128.anInt2383; i_22_++) {
					int i_23_ = (PacketParser.anIntArray2115
						     [i_22_ & 0x1f]);
					for (int i_24_ = 0;
					     (i_24_
					      < class7.anIntArray283.length);
					     i_24_++) {
					    if (class7.anIntArray283[i_24_]
						== i_23_) {
						Class67_Sub30 class67_sub30
						    = new Class67_Sub30();
						class67_sub30.aClass7_3352
						    = class7;
						class67_sub30.anObjectArray3356
						    = class7.anObjectArray281;
						Class67_Sub17.aClass50_3094
						    .method436
						    (class67_sub30, false);
						break while_19_;
					    }
					}
				    }
				}
				class7.anInt175 = Class128.anInt2383;
			    }
			    if (class7.anObjectArray302 != null
				&& (Class67_Sub5_Sub15.anInt4749
				    > class7.anInt162)) {
				if (class7.anIntArray163 == null
				    || (Class67_Sub5_Sub15.anInt4749
					- class7.anInt162) > 32) {
				    Class67_Sub30 class67_sub30
					= new Class67_Sub30();
				    class67_sub30.aClass7_3352 = class7;
				    class67_sub30.anObjectArray3356
					= class7.anObjectArray302;
				    Class67_Sub17.aClass50_3094
					.method436(class67_sub30, false);
				} else {
				while_20_:
				    for (int i_25_ = class7.anInt162;
					 i_25_ < Class67_Sub5_Sub15.anInt4749;
					 i_25_++) {
					int i_26_ = (Class61.anIntArray1135
						     [i_25_ & 0x1f]);
					for (int i_27_ = 0;
					     (i_27_
					      < class7.anIntArray163.length);
					     i_27_++) {
					    if (class7.anIntArray163[i_27_]
						== i_26_) {
						Class67_Sub30 class67_sub30
						    = new Class67_Sub30();
						class67_sub30.aClass7_3352
						    = class7;
						class67_sub30.anObjectArray3356
						    = class7.anObjectArray302;
						Class67_Sub17.aClass50_3094
						    .method436
						    (class67_sub30, false);
						break while_20_;
					    }
					}
				    }
				}
				class7.anInt162 = Class67_Sub5_Sub15.anInt4749;
			    }
			    if (class7.anObjectArray316 != null
				&& (Class67_Sub5_Sub2.anInt4472
				    > class7.anInt334)) {
				if (class7.anIntArray256 == null
				    || (Class67_Sub5_Sub2.anInt4472
					- class7.anInt334) > 32) {
				    Class67_Sub30 class67_sub30
					= new Class67_Sub30();
				    class67_sub30.aClass7_3352 = class7;
				    class67_sub30.anObjectArray3356
					= class7.anObjectArray316;
				    Class67_Sub17.aClass50_3094
					.method436(class67_sub30, false);
				} else {
				while_21_:
				    for (int i_28_ = class7.anInt334;
					 i_28_ < Class67_Sub5_Sub2.anInt4472;
					 i_28_++) {
					int i_29_
					    = (Class67_Sub1_Sub16_Sub1
					       .anIntArray5101[i_28_ & 0x1f]);
					for (int i_30_ = 0;
					     (i_30_
					      < class7.anIntArray256.length);
					     i_30_++) {
					    if (class7.anIntArray256[i_30_]
						== i_29_) {
						Class67_Sub30 class67_sub30
						    = new Class67_Sub30();
						class67_sub30.aClass7_3352
						    = class7;
						class67_sub30.anObjectArray3356
						    = class7.anObjectArray316;
						Class67_Sub17.aClass50_3094
						    .method436
						    (class67_sub30, false);
						break while_21_;
					    }
					}
				    }
				}
				class7.anInt334 = Class67_Sub5_Sub2.anInt4472;
			    }
			    if (class7.anObjectArray212 != null
				&& (Class67_Sub1_Sub21.anInt4165
				    > class7.anInt304)) {
				if (class7.anIntArray255 == null
				    || (Class67_Sub1_Sub21.anInt4165
					- class7.anInt304) > 32) {
				    Class67_Sub30 class67_sub30
					= new Class67_Sub30();
				    class67_sub30.aClass7_3352 = class7;
				    class67_sub30.anObjectArray3356
					= class7.anObjectArray212;
				    Class67_Sub17.aClass50_3094
					.method436(class67_sub30, false);
				} else {
				while_22_:
				    for (int i_31_ = class7.anInt304;
					 i_31_ < Class67_Sub1_Sub21.anInt4165;
					 i_31_++) {
					int i_32_ = (Class78.anIntArray1599
						     [i_31_ & 0x1f]);
					for (int i_33_ = 0;
					     (i_33_
					      < class7.anIntArray255.length);
					     i_33_++) {
					    if (class7.anIntArray255[i_33_]
						== i_32_) {
						Class67_Sub30 class67_sub30
						    = new Class67_Sub30();
						class67_sub30.aClass7_3352
						    = class7;
						class67_sub30.anObjectArray3356
						    = class7.anObjectArray212;
						Class67_Sub17.aClass50_3094
						    .method436
						    (class67_sub30, false);
						break while_22_;
					    }
					}
				    }
				}
				class7.anInt304 = Class67_Sub1_Sub21.anInt4165;
			    }
			    if (Class116.anInt2192 > class7.anInt303
				&& class7.anObjectArray176 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray176;
				Class67_Sub17.aClass50_3094
				    .method436(class67_sub30, false);
			    }
			    if (Class128.anInt2376 > class7.anInt303
				&& class7.anObjectArray181 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray181;
				Class67_Sub17.aClass50_3094
				    .method436(class67_sub30, false);
			    }
			    if (Class67_Sub1_Sub24.anInt4191 > class7.anInt303
				&& class7.anObjectArray331 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray331;
				Class67_Sub17.aClass50_3094
				    .method436(class67_sub30, false);
			    }
			    if (Class103.anInt2023 > class7.anInt303
				&& class7.anObjectArray197 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray197;
				Class67_Sub17.aClass50_3094
				    .method436(class67_sub30, false);
			    }
			    if (Class86.anInt1763 > class7.anInt303
				&& class7.anObjectArray323 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray323;
				Class67_Sub17.aClass50_3094
				    .method436(class67_sub30, false);
			    }
			    class7.anInt303 = Class11.anInt409;
			    if (class7.anObjectArray184 != null) {
				for (int i_34_ = 0;
				     i_34_ < Class67_Sub20.anInt3168;
				     i_34_++) {
				    Class67_Sub30 class67_sub30
					= new Class67_Sub30();
				    class67_sub30.aClass7_3352 = class7;
				    class67_sub30.anInt3347
					= (Class67_Sub1_Sub28.anIntArray4255
					   [i_34_]);
				    class67_sub30.anInt3354
					= Class54.anIntArray1076[i_34_];
				    class67_sub30.anObjectArray3356
					= class7.anObjectArray184;
				    Class67_Sub17.aClass50_3094
					.method436(class67_sub30, false);
				}
			    }
			    if (Class125.aBoolean2336
				&& class7.anObjectArray226 != null) {
				Class67_Sub30 class67_sub30
				    = new Class67_Sub30();
				class67_sub30.aClass7_3352 = class7;
				class67_sub30.anObjectArray3356
				    = class7.anObjectArray226;
				Class67_Sub17.aClass50_3094
				    .method436(class67_sub30, false);
			    }
			}
		    }
		    if (!class7.aBoolean185
			&& Class67_Sub5_Sub12.aClass7_4699 == null
			&& Class36.aClass7_769 == null
			&& !Class67_Sub9.aBoolean2980) {
			if ((class7.anInt246 >= 0 || class7.anInt188 != 0)
			    && Class67_Sub5_Sub17.anInt4786 >= i_2_
			    && Class67_Sub1_Sub22.anInt4172 >= i_3_
			    && Class67_Sub5_Sub17.anInt4786 < i_4_
			    && Class67_Sub1_Sub22.anInt4172 < i_5_) {
			    if (class7.anInt246 >= 0)
				Class30.aClass7_698 = arg0[class7.anInt246];
			    else
				Class30.aClass7_698 = class7;
			}
			if (class7.anInt227 == 8
			    && Class67_Sub5_Sub17.anInt4786 >= i_2_
			    && Class67_Sub1_Sub22.anInt4172 >= i_3_
			    && Class67_Sub5_Sub17.anInt4786 < i_4_
			    && Class67_Sub1_Sub22.anInt4172 < i_5_)
			    Class67_Sub5_Sub6.aClass7_4536 = class7;
			if (class7.anInt222 > class7.anInt194)
			    Class61.method551(Class67_Sub1_Sub22.anInt4172,
					      class7.anInt222, -83, class7,
					      i_1_,
					      Class67_Sub5_Sub17.anInt4786,
					      i_0_ + class7.anInt189,
					      class7.anInt194);
		    }
		    if (class7.anInt227 == 0) {
			method32(arg0, class7.anInt301, i_2_, i_3_, i_4_, i_5_,
				 i_0_ - class7.anInt272,
				 i_1_ - class7.anInt291);
			if (class7.aClass7Array228 != null)
			    method32(class7.aClass7Array228, class7.anInt301,
				     i_2_, i_3_, i_4_, i_5_,
				     i_0_ - class7.anInt272,
				     i_1_ - class7.anInt291);
			Class67_Sub22 class67_sub22
			    = ((Class67_Sub22)
			       (Class67_Sub1_Sub33.aClass92_4325.method1489
				((byte) -27, (long) class7.anInt301)));
			if (class67_sub22 != null)
			    Class27.method257(i_5_, i_1_, i_4_, i_0_,
					      (byte) -40,
					      class67_sub22.anInt3185, i_2_,
					      i_3_);
		    }
		}
	    }
	}
    }
    
    public void method18(byte arg0) {
	if (arg0 >= -95)
	    init();
	anInt2753++;
	Class41.method359(-103);
	Class129.aClass16_2389 = new Class16();
	Class144.aClass40_2588 = new Class40();
	if (Class100.anInt1972 != 0)
	    Class99.aByteArrayArray1960 = new byte[50][];
	Class66.method604(-100, Class124.aSignLink_2335);
	if (Class23.anInt555 == 0) {
	    Class67_Sub5_Sub13.connectServerIP = this.getCodeBase().getHost();
	    Class123.anInt2319 = 43594;
	    Class13.anInt431 = 443;
	} else if (Class23.anInt555 != 1) {
	    if (Class23.anInt555 == 2) {
		Class123.anInt2319 = Class67_Sub10.anInt3012 + 40000;
		Class67_Sub5_Sub13.connectServerIP = "127.0.0.1";
		Class13.anInt431 = Class67_Sub10.anInt3012 + 50000;
	    }
	} else {
	    Class67_Sub5_Sub13.connectServerIP = this.getCodeBase().getHost();
	    Class13.anInt431 = Class67_Sub10.anInt3012 + 50000;
	    Class123.anInt2319 = 40000 - -Class67_Sub10.anInt3012;
	}
	Class5.anInt138 = Class123.anInt2319;
	Class67_Sub1_Sub29.aString4265 = Class67_Sub5_Sub13.connectServerIP;
	if ((Class69.anInt1381 ^ 0xffffffff) == -2) {
	    Class141.aShortArray2555 = Class67_Sub1_Sub8.aShortArray3921;
	    Class131_Sub7_Sub2.aBoolean5068 = true;
	    Class62.aShortArrayArray1157 = Class50.aShortArrayArray1026;
	    Class115.aShortArray2183 = Class67_Sub1_Sub32.aShortArray4307;
	    Class67_Sub5_Sub9.aShortArrayArray4600
		= Class50.aShortArrayArray1013;
	} else {
	    Class62.aShortArrayArray1157 = Class67_Sub9.aShortArrayArray2984;
	    Class115.aShortArray2183 = Class67_Sub10.aShortArray3019;
	    Class141.aShortArray2555 = Class80.aShortArray1626;
	    Class67_Sub5_Sub9.aShortArrayArray4600
		= Class104.aShortArrayArray2033;
	}
	Class2.anInt105 = Class13.anInt431;
	Class7.anInt241 = Class123.anInt2319;
	Class109.aShortArray2092 = Class55_Sub2_Sub1.aShortArray3797
	    = Class67_Sub1_Sub16.aShortArray4076 = Class9.aShortArray367
	    = new short[256];
	if (SignLink.anInt931 == 3 && (Class23.anInt555 ^ 0xffffffff) != -3)
	    Class67_Sub23.anInt3202 = Class67_Sub10.anInt3012;
	Class67_Sub9.anInt2968 = Class7.anInt241;
	Class47.method416(12506);
	Class67_Sub5_Sub14.method973((byte) 112,
				     Class67_Sub5_Sub12.aCanvas4698);
	Class67_Sub5_Sub13.method958(0, Class67_Sub5_Sub12.aCanvas4698);
	Class82.aLogin_1669 = Class141.method1947(-110);
	if (Class82.aLogin_1669 != null)
	    Class82.aLogin_1669.method1417(false,
					     Class67_Sub5_Sub12.aCanvas4698);
	Class67_Sub1_Sub19.anInt4138 = SignLink.anInt931;
	try {
	    if (Class124.aSignLink_2335.aClass93_945 != null) {
		Class67_Sub10.aClass115_3009
		    = new Class115(Class124.aSignLink_2335.aClass93_945, 5200,
				   0);
		for (int i = 0; i < 28; i++)
		    Class43.aClass115Array903[i]
			= new Class115((Class124.aSignLink_2335.aClass93Array927
					[i]),
				       6000, 0);
		Class105.aClass115_2045
		    = new Class115(Class124.aSignLink_2335.aClass93_938, 6000,
				   0);
		Class67_Sub1_Sub33.aClass20_4314
		    = new Class20(255, Class67_Sub10.aClass115_3009,
				  Class105.aClass115_2045, 500000);
		Class67_Sub5.aClass115_2858
		    = new Class115(Class124.aSignLink_2335.aClass93_933, 24, 0);
		Class124.aSignLink_2335.aClass93Array927 = null;
		Class124.aSignLink_2335.aClass93_938 = null;
		Class124.aSignLink_2335.aClass93_933 = null;
		Class124.aSignLink_2335.aClass93_945 = null;
	    }
	} catch (java.io.IOException ioexception) {
	    Class67_Sub10.aClass115_3009 = null;
	    Class67_Sub5.aClass115_2858 = null;
	    Class105.aClass115_2045 = null;
	    Class67_Sub1_Sub33.aClass20_4314 = null;
	}
	if (Class23.anInt555 != 0)
	    Class68.aBoolean1378 = true;
	Class125.aRSString_2343 = Class85.aRSString_1726;
    }
    
    public static boolean method33(Class7 arg0) {
	if (Class128.aBoolean2377) {
	    if (method31(arg0).anInt3060 != 0)
		return false;
	    if (arg0.anInt227 == 0)
		return false;
	}
	return arg0.aBoolean313;
    }
    
    public static void main(String[] arg0) {
	try {
	    int i = -1;
	    if (arg0.length != 4)
		Class67_Sub11_Sub2.method1141((byte) 79, "argument count");
	    Class67_Sub10.anInt3012 = Integer.parseInt(arg0[0]);
	    Class23.anInt555 = 2;
	    if (arg0[1].equals("live"))
		Class100.anInt1972 = 0;
	    else if (!arg0[1].equals("rc")) {
		if (!arg0[1].equals("wip"))
		    Class67_Sub11_Sub2.method1141((byte) 79, "modewhat");
		else
		    Class100.anInt1972 = 2;
	    } else
		Class100.anInt1972 = 1;
	    Class132.lowMememoryMode = false;
	    try {
		byte[] is = arg0[2].getBytes("ISO-8859-1");
		i = Class47.method413(0,
				      Class34.method303(is, 0, is.length, 0));
	    } catch (Exception exception) {
		/* empty */
	    }
	    if ((i ^ 0xffffffff) == 0) {
		if (!arg0[2].equals("english")) {
		    if (!arg0[2].equals("german"))
			Class67_Sub11_Sub2.method1141((byte) 79, "language");
		    else
			Class131_Sub3.anInt3603 = 1;
		} else
		    Class131_Sub3.anInt3603 = 0;
	    } else
		Class131_Sub3.anInt3603 = i;
	    Class61.method556((byte) 127, Class131_Sub3.anInt3603);
	    Class67_Sub16.aBoolean3089 = false;
	    aBoolean2734 = false;
	    if (arg0[3].equals("game0"))
		Class69.anInt1381 = 0;
	    else if (!arg0[3].equals("game1"))
		Class67_Sub11_Sub2.method1141((byte) 79, "game");
	    else
		Class69.anInt1381 = 1;
	    Class67_Sub1_Sub37.aBoolean4406 = false;
	    Class67_Sub5_Sub3.anInt4489 = 0;
	    Class24.anInt575 = 0;
	    Class101.aRSString_1991 = Class67_Sub5_Sub5.aRSString_4523;
	    client var_client = new client();
	    Class28.aClient672 = var_client;
	    var_client.method26(1024, Class100.anInt1972 + 32, 28, 530,
				"runescape", 768, false, -11014);
	    Class120.aFrame2272.setLocation(40, 40);
	} catch (Exception exception) {
	    Class104.method1563(exception, null, 1);
	}
	anInt2740++;
    }
    
    public void init() {
	anInt2738++;
	if (this.method30(8)) {
	    Class67_Sub10.anInt3012
		= Integer.parseInt(this.getParameter("worldid"));
	    Class23.anInt555
		= Integer.parseInt(this.getParameter("modewhere"));
	    if (Class23.anInt555 < 0 || (Class23.anInt555 ^ 0xffffffff) < -2)
		Class23.anInt555 = 0;
	    Class100.anInt1972
		= Integer.parseInt(this.getParameter("modewhat"));
	    if ((Class100.anInt1972 ^ 0xffffffff) > -1
		|| (Class100.anInt1972 ^ 0xffffffff) < -3)
		Class100.anInt1972 = 0;
	    String string = this.getParameter("advertsuppressed");
	    if (string != null && string.equals("1"))
		Class132.lowMememoryMode = true;
	    else
		Class132.lowMememoryMode = false;
	    try {
		Class131_Sub3.anInt3603
		    = Integer.parseInt(this.getParameter("lang"));
	    } catch (Exception exception) {
		Class131_Sub3.anInt3603 = 0;
	    }
	    Class61.method556((byte) 127, Class131_Sub3.anInt3603);
	    String string_35_ = this.getParameter("objecttag");
	    if (string_35_ == null || !string_35_.equals("1"))
		Class67_Sub16.aBoolean3089 = false;
	    else
		Class67_Sub16.aBoolean3089 = true;
	    String string_36_ = this.getParameter("js");
	    if (string_36_ != null && string_36_.equals("1"))
		aBoolean2734 = true;
	    else
		aBoolean2734 = false;
	    String string_37_ = this.getParameter("game");
	    if (string_37_ != null && string_37_.equals("1"))
		Class69.anInt1381 = 1;
	    else
		Class69.anInt1381 = 0;
	    try {
		Class67_Sub5_Sub3.anInt4489
		    = Integer.parseInt(this.getParameter("affid"));
	    } catch (Exception exception) {
		Class67_Sub5_Sub3.anInt4489 = 0;
	    }
	    Class101.aRSString_1991
		= Class67_Sub1_Sub30.aRSString_4275.method523(this, 31365);
	    if (Class101.aRSString_1991 == null)
		Class101.aRSString_1991 = Class67_Sub5_Sub5.aRSString_4523;
	    String string_38_ = this.getParameter("country");
	    if (string_38_ != null) {
		try {
		    Class24.anInt575 = Integer.parseInt(string_38_);
		} catch (Exception exception) {
		    Class24.anInt575 = 0;
		}
	    }
	    String string_39_ = this.getParameter("haveie6");
	    if (string_39_ == null || !string_39_.equals("1"))
		Class67_Sub1_Sub37.aBoolean4406 = false;
	    else
		Class67_Sub1_Sub37.aBoolean4406 = true;
	    Class28.aClient672 = this;
	    this.method19(-126, 765, Class100.anInt1972 + 32, 530, 503);
	}
    }
    
    public void method24(int arg0) {
	if (arg0 == 0) {
	    anInt2735++;
	    if (Class67_Sub5_Sub18.anInt4804 != 1000) {
		boolean bool = Class1.method61(false);
		if (bool && Class57.aBoolean1106
		    && Class67_Sub5_Sub9.aClass28_4616 != null)
		    Class67_Sub5_Sub9.aClass28_4616.method265(-7755);
		if (((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -31
		     || Class67_Sub5_Sub18.anInt4804 == 10)
		    && (Class140.aBoolean2544
			|| ((Class95.aLong1900 ^ 0xffffffffffffffffL) != -1L
			    && Class95.aLong1900 < Class39.method337(19644))))
		    Class67_Sub28.method1305(Class67_Sub11_Sub2.anInt4857,
					     true,
					     Class78.method1413(arg0 + 90),
					     Class140.aBoolean2544,
					     Class139.anInt2526);
		if (Class7.aFrame223 == null) {
		    java.awt.Container container;
		    if (Class7.aFrame223 != null)
			container = Class7.aFrame223;
		    else if (Class120.aFrame2272 != null)
			container = Class120.aFrame2272;
		    else
			container = Class124.aSignLink_2335.anApplet940;
		    int i = container.getSize().width;
		    int i_40_ = container.getSize().height;
		    if (container == Class120.aFrame2272) {
			Insets insets = Class120.aFrame2272.getInsets();
			i_40_ -= insets.bottom + insets.top;
			i -= insets.right + insets.left;
		    }
		    if (((Class67_Sub1_Sub37.anInt4413 ^ 0xffffffff)
			 != (i ^ 0xffffffff))
			|| (i_40_ ^ 0xffffffff) != (Class99.anInt1963
						    ^ 0xffffffff)) {
			if (SignLink.aString937.startsWith("mac")) {
			    Class99.anInt1963 = i_40_;
			    Class67_Sub1_Sub37.anInt4413 = i;
			} else
			    Class41.method359(arg0 ^ ~0x53);
			Class95.aLong1900 = 500L + Class39.method337(19644);
		    }
		}
		boolean bool_41_ = false;
		if (Class56.aBoolean1098) {
		    bool_41_ = true;
		    Class56.aBoolean1098 = false;
		}
		if (bool_41_)
		    Class13.method152(57);
		if ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -1)
		    Class67_Sub26.method1298(Class67_Sub5_Sub5.anInt4517,
					     bool_41_,
					     Class67_Sub9.aRSString_2977,
					     (byte) 75, null);
		else if ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) != -6) {
		    if ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) != -11) {
			if (Class67_Sub5_Sub18.anInt4804 != 25
			    && Class67_Sub5_Sub18.anInt4804 != 28) {
			    if (Class67_Sub5_Sub18.anInt4804 != 30) {
				if (Class67_Sub5_Sub18.anInt4804 == 40)
				    Class67_Sub1_Sub35.method775
					((Class67_Sub1_Sub27.method744
					  ((new RSString[]
					    { Class67_Sub5_Sub2.aRSString_4469,
					      Login.aRSString_1618,
					      Class78.aRSString_1608 }),
					   -114)),
					 false, (byte) -68);
			    } else
				Class67_Sub1_Sub7.method648((byte) 120);
			} else if (Class12.anInt420 == 1) {
			    if (Class123.anInt2315 < Canvas_Sub1.anInt57)
				Class123.anInt2315 = Canvas_Sub1.anInt57;
			    int i = (50
				     * (-Canvas_Sub1.anInt57
					+ Class123.anInt2315)
				     / Class123.anInt2315);
			    Class67_Sub1_Sub35.method775
				((Class67_Sub1_Sub27.method744
				  ((new RSString[]
				    { Class67_Sub22.aRSString_3182,
				      Class67_Sub1_Sub31.aRSString_4287,
				      InputStream_Sub1.method47(i, true),
				      Class67_Sub27.aRSString_3296 }),
				   -102)),
				 false, (byte) -63);
			} else if ((Class12.anInt420 ^ 0xffffffff) != -3)
			    Class67_Sub1_Sub35.method775((Class67_Sub22
							  .aRSString_3182),
							 false, (byte) -81);
			else {
			    if ((Class86.anInt1767 ^ 0xffffffff)
				> (Class67_Sub21.anInt3174 ^ 0xffffffff))
				Class86.anInt1767 = Class67_Sub21.anInt3174;
			    int i = ((50
				      * (Class86.anInt1767
					 + -Class67_Sub21.anInt3174)
				      / Class86.anInt1767)
				     + 50);
			    Class67_Sub1_Sub35.method775
				((Class67_Sub1_Sub27.method744
				  ((new RSString[]
				    { Class67_Sub22.aRSString_3182,
				      Class67_Sub1_Sub31.aRSString_4287,
				      InputStream_Sub1.method47(i, true),
				      Class67_Sub27.aRSString_3296 }),
				   arg0 ^ ~0x78)),
				 false, (byte) -44);
			}
		    } else
			Class25.method226(arg0 ^ ~0x35);
		} else
		    Class67_Sub5_Sub11.method934(-1,
						 (Class130
						  .aClass67_Sub5_Sub10_2404),
						 false);
		if (((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) != -31
		     && Class67_Sub5_Sub18.anInt4804 != 10)
		    || Class131_Sub5.anInt3689 != 0 || bool_41_) {
		    if ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) != -1) {
			try {
			    Graphics graphics
				= Class67_Sub5_Sub12.aCanvas4698.getGraphics();
			    PacketParser.aClass99_2119.method1518(1000, 0, 0,
							      graphics);
			    for (int i = 0;
				 ((i ^ 0xffffffff)
				  > (Class67_Sub10.anInt3001 ^ 0xffffffff));
				 i++)
				Class67_Sub5_Sub3.aBooleanArray4501[i] = false;
			} catch (Exception exception) {
			    Class67_Sub5_Sub12.aCanvas4698.repaint();
			}
		    }
		} else {
		    try {
			Graphics graphics
			    = Class67_Sub5_Sub12.aCanvas4698.getGraphics();
			for (int i = 0; Class67_Sub10.anInt3001 > i; i++) {
			    if (Class67_Sub5_Sub3.aBooleanArray4501[i]) {
				PacketParser.aClass99_2119.method1522
				    ((byte) -6,
				     Class67_Sub10.anIntArray3011[i],
				     Class50.anIntArray1020[i],
				     Class67_Sub1_Sub17.anIntArray4102[i],
				     Class67_Sub1_Sub25.anIntArray4223[i],
				     graphics);
				Class67_Sub5_Sub3.aBooleanArray4501[i] = false;
			    }
			}
		    } catch (Exception exception) {
			Class67_Sub5_Sub12.aCanvas4698.repaint();
		    }
		}
		if (Class106.aBoolean2059)
		    Class34.method306(false);
		if (Class67_Sub29.aBoolean3337
		    && (Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -11
		    && Class54.anInt1080 != -1) {
		    Class67_Sub29.aBoolean3337 = false;
		    Class67_Sub5_Sub2.method837(Class124.aSignLink_2335,
						(byte) 88);
		}
	    }
	}
    }
    
    public void method34(boolean arg0) {
	anInt2737++;
	if ((Class67_Sub5_Sub17.anInt4796 ^ 0xffffffff) > (Class144.aClass40_2588.anInt845 ^ 0xffffffff)) {
	    Class129_Sub1.anInt3509 = 50 * (-1 + Class144.aClass40_2588.anInt845) * 5;
	    if (Class67_Sub9.anInt2968 == Class5.anInt138)
		Class67_Sub9.anInt2968 = Class2.anInt105;
	    else
		Class67_Sub9.anInt2968 = Class5.anInt138;
	    if ((Class129_Sub1.anInt3509 ^ 0xffffffff) < -3001)
		Class129_Sub1.anInt3509 = 3000;
	    if ((Class144.aClass40_2588.anInt845 ^ 0xffffffff) <= -3
		&& (Class144.aClass40_2588.anInt844 ^ 0xffffffff) == -7) {
		this.method16(31439, "js5connect_outofdate");
		Class67_Sub5_Sub18.anInt4804 = 1000;
		return;
	    }
	    if (Class144.aClass40_2588.anInt845 >= 4
		&& Class144.aClass40_2588.anInt844 == -1) {
		this.method16(31439, "js5crc");
		Class67_Sub5_Sub18.anInt4804 = 1000;
		return;
	    }
	    if ((Class144.aClass40_2588.anInt845 ^ 0xffffffff) <= -5
		&& ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -1
		    || (Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) == -6)) {
		if ((Class144.aClass40_2588.anInt844 ^ 0xffffffff) != -8
		    && (Class144.aClass40_2588.anInt844 ^ 0xffffffff) != -10) {
		    if (Class144.aClass40_2588.anInt844 <= 0)
			this.method16(31439, "js5io");
		    else
			this.method16(31439, "js5connect");
		} else
		    this.method16(31439, "js5connect_full");
		Class67_Sub5_Sub18.anInt4804 = 1000;
		return;
	    }
	}
	if (arg0 == false) {
	    Class67_Sub5_Sub17.anInt4796 = Class144.aClass40_2588.anInt845;
	    if (Class129_Sub1.anInt3509 > 0)
		Class129_Sub1.anInt3509--;
	    else {
		do {
		    try {
			if (Class67_Sub1_Sub12.anInt3999 == 0) {
			    Class122.aClass31_2308
				= (Class124.aSignLink_2335.method403
				   (Class67_Sub9.anInt2968, false,
				    Class67_Sub1_Sub29.aString4265));
			    Class67_Sub1_Sub12.anInt3999++;
			}
			if (Class67_Sub1_Sub12.anInt3999 == 1) {
			    if ((Class122.aClass31_2308.anInt706 ^ 0xffffffff)
				== -3) {
				method37(-102, 1000);
				break;
			    }
			    if (Class122.aClass31_2308.anInt706 == 1)
				Class67_Sub1_Sub12.anInt3999++;
			}
			if (Class67_Sub1_Sub12.anInt3999 == 2) {
			    Class131_Sub3.aClass117_3614
				= new Class117((Socket) (Class122.aClass31_2308
							 .anObject705),
					       Class124.aSignLink_2335);
			    Stream Stream = new Stream(5);
			    Stream.addByte((byte) 4, 15);
			    Stream.addInt(530, 125);
			    Class131_Sub3.aClass117_3614.queueBytesToSend
				(0, Stream.buffer, 5, (byte) 88);
			    Class67_Sub1_Sub12.anInt3999++;
			    Class52.aLong1047 = Class39.method337(19644);
			}
			if ((Class67_Sub1_Sub12.anInt3999 ^ 0xffffffff)
			    == -4) {
			    if (((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff)
				 != -1)
				&& Class67_Sub5_Sub18.anInt4804 != 5
				&& (Class131_Sub3.aClass117_3614.method1626(1)
				    <= 0)) {
				if (((-Class52.aLong1047
				      + Class39.method337(19644))
				     ^ 0xffffffffffffffffL)
				    < -30001L) {
				    method37(-112, 1001);
				    break;
				}
			    } else {
				int i = Class131_Sub3.aClass117_3614
					    .method1631(17506);
				if (i != 0) {
				    method37(-103, i);
				    break;
				}
				Class67_Sub1_Sub12.anInt3999++;
			    }
			}
			if (Class67_Sub1_Sub12.anInt3999 != 4)
			    break;
			boolean bool = ((Class67_Sub5_Sub18.anInt4804
					 ^ 0xffffffff) == -6
					|| (Class67_Sub5_Sub18.anInt4804
					    ^ 0xffffffff) == -11
					|| (Class67_Sub5_Sub18.anInt4804
					    ^ 0xffffffff) == -29);
			Class144.aClass40_2588.method344(!bool, (byte) 119,
							 (Class131_Sub3
							  .aClass117_3614));
			Class131_Sub3.aClass117_3614 = null;
			Class122.aClass31_2308 = null;
			Class67_Sub1_Sub12.anInt3999 = 0;
		    } catch (java.io.IOException ioexception) {
			method37(-111, 1002);
			break;
		    }
		    break;
		} while (false);
	    }
	}
    }
    
    public static RSString method35(RSString arg0, Class7 arg1, byte arg2) {
	try {
	    if (arg2 > 0)
		method38(null);
	    if ((arg0.method514((byte) -128, Class85.aRSString_1728)
		 ^ 0xffffffff)
		!= 0) {
		for (;;) {
		    int i = arg0.method514((byte) -128, Class81.aRSString_1658);
		    if (i == -1)
			break;
		    arg0
			= (Class67_Sub1_Sub27.method744
			   (new RSString[] { arg0.method502(0, -5975, i),
					    (Class106.method1571
					     (Class89.method1471(arg1, 0,
								 (byte) -37),
					      (byte) 11)),
					    arg0.method503((byte) 34, i + 2) },
			    -125));
		}
		for (;;) {
		    int i = arg0.method514((byte) -128,
					   Class70_Sub1.aRSString_3373);
		    if (i == -1)
			break;
		    arg0
			= (Class67_Sub1_Sub27.method744
			   (new RSString[] { arg0.method502(0, -5975, i),
					    (Class106.method1571
					     (Class89.method1471(arg1, 1,
								 (byte) -57),
					      (byte) 11)),
					    arg0.method503((byte) 34, 2 + i) },
			    -102));
		}
		for (;;) {
		    int i
			= arg0.method514((byte) -128, Class139.aRSString_2542);
		    if (i == -1)
			break;
		    arg0
			= (Class67_Sub1_Sub27.method744
			   (new RSString[] { arg0.method502(0, -5975, i),
					    (Class106.method1571
					     (Class89.method1471(arg1, 2,
								 (byte) -97),
					      (byte) 11)),
					    arg0.method503((byte) 34, 2 + i) },
			    -103));
		}
		for (;;) {
		    int i = arg0.method514((byte) -128, Class92.aRSString_1876);
		    if (i == -1)
			break;
		    arg0
			= (Class67_Sub1_Sub27.method744
			   (new RSString[] { arg0.method502(0, -5975, i),
					    (Class106.method1571
					     (Class89.method1471(arg1, 3,
								 (byte) 78),
					      (byte) 11)),
					    arg0.method503((byte) 34, i + 2) },
			    -104));
		}
		for (;;) {
		    int i = arg0.method514((byte) -128,
					   Class67_Sub5_Sub8.aRSString_4576);
		    if (i == -1)
			break;
		    arg0
			= (Class67_Sub1_Sub27.method744
			   (new RSString[] { arg0.method502(0, -5975, i),
					    (Class106.method1571
					     (Class89.method1471(arg1, 4,
								 (byte) 106),
					      (byte) 11)),
					    arg0.method503((byte) 34, 2 + i) },
			    -100));
		}
		for (;;) {
		    int i = arg0.method514((byte) -128,
					   Class99_Sub1.aRSString_3391);
		    if (i == -1)
			break;
		    RSString RSString = Class67_Sub5_Sub5.aRSString_4523;
		    if (Class27.aClass31_628 != null) {
			RSString
			    = Class67_Sub5_Sub4_Sub2.method860((Class27
								.aClass31_628
								.anInt707),
							       true);
			try {
			    if (Class27.aClass31_628.anObject705 != null) {
				byte[] is = ((String)
					     Class27.aClass31_628.anObject705)
						.getBytes("ISO-8859-1");
				RSString
				    = Class34.method303(is, 0, is.length, 0);
			    }
			} catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
			    /* empty */
			}
		    }
		    arg0
			= (Class67_Sub1_Sub27.method744
			   (new RSString[] { arg0.method502(0, -5975, i),
					    RSString,
					    arg0.method503((byte) 34, 4 + i) },
			    -125));
		}
	    }
	    anInt2746++;
	    return arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("client.W("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method36(byte arg0) {
	aRSString_2750 = null;
	aRSString_2742 = null;
	aBooleanArrayArray2739 = null;
	aRSString_2743 = null;
	if (arg0 > -82)
	    main(null);
    }
    
    public void method37(int arg0, int arg1) {
	Class144.aClass40_2588.anInt845++;
	Class131_Sub3.aClass117_3614 = null;
	Class122.aClass31_2308 = null;
	if (arg0 <= -101) {
	    Class144.aClass40_2588.anInt844 = arg1;
	    anInt2751++;
	    Class67_Sub1_Sub12.anInt3999 = 0;
	}
    }
    
    public void method21(boolean arg0) {
	method36((byte) -120);
	RSString.method513(125);
	Class96.method1502(0);
	Class67_Sub5_Sub6.method868(17882);
	Class72.method1350(false);
	anInt2752++;
	Applet_Sub1.method22(95);
	Class33.method296(0);
	Class99.method1523(1000);
	Class5.method78(4);
	Class74.method1374(false);
	Stream.method1063(8);
	Class117.method1635(-82);
	Class40.method340(-120);
	Class16.method175(1);
	Class142.method1956(5430);
	Class129_Sub1.method1746(-25377);
	Class9.method104(-67);
	Class115.method1621((byte) -113);
	Class20.method195((byte) 14);
	Class136.method1925(true);
	Class131_Sub7_Sub1.method1890(arg0);
	PacketStream.method1101((byte) -127);
	Class73.method1367((byte) -40);
	Class7.method85((byte) -69);
	Class131_Sub7_Sub2.method1895((byte) -99);
	Class50.method439(30551);
	Class67_Sub5_Sub19.method1001((byte) 127);
	Class92.method1485(1);
	Login.method1418(-32768);
	Class67_Sub25.method1293(2);
	Class34.method307(-95);
	Class28.method274(7);
	Class54.method460(0);
	Class22.method204(17158);
	Class41.method355(0);
	Class131_Sub7.method1872((byte) 17);
	Class67_Sub24.method1289(-21485);
	Class65.method587(-66);
	Class67_Sub6.method1035(112);
	Class64.method580((byte) 85);
	Class67_Sub22.method1279(true);
	Class67_Sub14.method1224(4);
	Class67.method608(arg0);
	Class120.method1669(-127);
	Class62.method560((byte) 87);
	Class141.method1948((byte) 52);
	Class67_Sub5_Sub7.method875((byte) -93);
	Class21.method199(126);
	Class4.method74((byte) -15);
	Class51.method446((byte) 56);
	Class118.method1639(1560117857);
	Class61.method548(119);
	Class90.method1472(124);
	Class105.method1564((byte) 62);
	RuntimeException_Sub1.method1971(true);
	Class6.method82(-11725);
	Class124.method1704(108);
	Class67_Sub5_Sub4_Sub2.method861(-67);
	Class67_Sub5_Sub4_Sub1.method856(45);
	Class132.method1902((byte) -51);
	Class107.method1572((byte) -126);
	Class13.method153(-109);
	Class131_Sub2.method1795();
	Class143.method1959((byte) 9);
	Class76.method1384(255);
	Class131_Sub6_Sub1.method1862();
	Class134.method1911(true);
	Class133.method1906(-63);
	Class37.method323((byte) -87);
	Class83.method1444((byte) -38);
	Class78.method1412(-1);
	Class122.method1694((byte) 101);
	Class119.method1640(0);
	Class67_Sub5_Sub10.method918();
	PacketParser.method1598(-96);
	Class67_Sub26.method1294(-74);
	Class42.method366();
	Class67_Sub11_Sub2.method1138((byte) -119);
	Class67_Sub27.method1303(false);
	Class96_Sub1.method1509(100);
	Sprites.method335();
	Class129.method1741(1);
	Class25.method229(113);
	Class67_Sub5_Sub4.method851(21482);
	Class8.method102(0);
	Class121.method1670();
	Class82.method1433(-118);
	Class14.method163(-8);
	Class67_Sub5_Sub17.method994(false);
	Class67_Sub5.method820(-84);
	Class137.method1928(false);
	Class139.method1937(true);
	Class125.method1706(-8677);
	Class113.method1604((byte) -124);
	Class47.method415((byte) 115);
	Class67_Sub5_Sub1.method831(-120);
	Class57.method488(2);
	Class91.method1474(1);
	Class87.method1461((byte) 103);
	Class81.method1430((byte) -127);
	Class98.method1515(-121);
	Class11.method145(0);
	Class67_Sub5_Sub14.method970(1389);
	Class67_Sub5_Sub8.method893(40);
	Class67_Sub5_Sub12.method943(110);
	Class18.method186((byte) 42);
	Class67_Sub5_Sub13.method966((byte) -3);
	Class116.method1623(0);
	Class32.method285((byte) -105);
	Class24.method219((byte) 52);
	Class75.method1380(!arg0);
	Class67_Sub5_Sub16.method984(-22760);
	Class26.method237();
	Class27.method256((byte) -121);
	Class1.method63(1);
	Class53.method454(26513);
	Class56.method485((byte) -71);
	Class70_Sub1.method1339(69);
	Class95.method1500(true);
	Class123.method1696(true);
	Class106.method1570((byte) -113);
	Class23.method215(111);
	Class67_Sub30.method1319(512);
	Class131.method1766((byte) -128);
	Class36.method315(1023);
	Class68.method1321(25180);
	Class58.method491(false);
	Class94.method1498(32);
	Class104.method1562(11146);
	Class88.method1466((byte) -36);
	Class84.method1447((byte) -112);
	Class71.method1343();
	Class67_Sub20.method1271((byte) 108);
	Class15.method164(127);
	Class128.method1731(true);
	Class97.method1510();
	Class102.method1550(-6127);
	Class111.method1595(-7072);
	Class109.method1581(22050);
	Class67_Sub28.method1307((byte) 49);
	Class67_Sub5_Sub3.method847((byte) -23);
	Class67_Sub8.method1108((byte) -75);
	Class67_Sub10.method1121(-6580);
	Class3.method70(105);
	Class67_Sub5_Sub9.method896(-1);
	Class48.method420();
	Class12.method149(1);
	Class10.method140(25548);
	Class2.method67(-1);
	Class131_Sub3.method1808((byte) -48);
	ObjectDef.method1774(-1);
	Class49.method427((byte) 86);
	Class131_Sub4.method1821(0);
	Class67_Sub12.method1220(false);
	Class131_Sub5.method1825(97);
	Class114.method1610(-8317);
	Class101.method1544(!arg0);
	Class67_Sub29.method1313(-59);
	Class100.method1539(true);
	Class67_Sub19.method1268((byte) -31);
	Class67_Sub9.method1110(-93);
	Canvas_Sub1.method43(-31978);
	Class63.method566(-25229);
	Class33_Sub2.method300((byte) -117);
	Class99_Sub1.method1530((byte) 58);
	Class52.method450(false);
	Class44.method392((byte) 111);
	Class86.method1456((byte) -1);
	Class108.method1574((byte) 106);
	Class110.method1582();
	Class85.method1449(73);
	Class67_Sub5_Sub11.method936(0);
	Class67_Sub5_Sub11_Sub2.method941((byte) 47);
	Class80.method1424((byte) -81);
	Class67_Sub16.method1241(113);
	Class130.method1760(0);
	Class28_Sub1.method276();
	Class127.method1729();
	Class19.method192((byte) 113);
	Class30.method283((byte) 84);
	Class67_Sub18.method1251();
	Class77.method1405();
	Class67_Sub1_Sub37.method797(true);
	Class43.method380((byte) 69);
	Class67_Sub1.method621(29749);
	Class140.method1946((byte) -127);
	Class103.method1553(-107);
	Class144.method1966(-30);
	Class67_Sub21.method1277(-114);
	Class66.method599(-2955);
	Class70.method1331((byte) -125);
	Class89.method1470(67);
	Class67_Sub23.method1284((byte) 26);
	Class69.method1324(!arg0);
	Class67_Sub1_Sub26.method741(255);
	Class67_Sub1_Sub7.method650((byte) -111);
	Class67_Sub1_Sub28.method747((byte) -54);
	Class67_Sub1_Sub3.method635(-1);
	Class67_Sub1_Sub9.method657(-126);
	Class67_Sub1_Sub39.method808(0);
	Class67_Sub1_Sub19.method711(0);
	Class67_Sub1_Sub20.method712(-114);
	Class67_Sub1_Sub14.method680(false);
	Class67_Sub1_Sub2.method629(0);
	Class67_Sub1_Sub18.method700((byte) 121);
	Class67_Sub1_Sub27.method743(7288);
	Class67_Sub1_Sub17.method698(-96);
	Class67_Sub1_Sub30.method758((byte) 14);
	Class67_Sub1_Sub21.method717(2823);
	Class67_Sub1_Sub12.method668((byte) -111);
	Class67_Sub1_Sub36.method785((byte) 125);
	Class67_Sub1_Sub24.method732(0);
	Class67_Sub1_Sub16_Sub1.method692(115);
	Class67_Sub1_Sub16.method688(8);
	Class67_Sub1_Sub29.method753(-2);
	Class67_Sub1_Sub13.method675(true);
	Class67_Sub1_Sub23.method727(124);
	Class67_Sub1_Sub22.method722(123);
	Class67_Sub1_Sub31.method764(0);
	Class67_Sub1_Sub11.method667(113);
	Class67_Sub1_Sub33.method771(-128);
	Class67_Sub1_Sub32.method768(1030194214);
	Class67_Sub1_Sub35.method781(-8698);
	Class67_Sub1_Sub38.method801(2);
	Class67_Sub1_Sub8.method654(32154);
	Class67_Sub1_Sub6.method643(127);
	Class67_Sub1_Sub4.method637(-10744);
	Class67_Sub1_Sub1.method626(1489062284);
	Class67_Sub1_Sub34.method772(2048);
	Class67_Sub1_Sub25.method738(true);
	Class67_Sub1_Sub5.method639(-1);
	Class67_Sub1_Sub10.method663(9000);
	Class67_Sub1_Sub15.method681((byte) 118);
	Class55_Sub2.method469(0);
	Class55.method461(906);
	Class55_Sub2_Sub1.method472(-17116);
	Class55_Sub1.method467(126);
	Class55_Sub3_Sub1.method481(21);
	Class55_Sub3.method475((byte) -123);
	Class67_Sub5_Sub2.method834((byte) 75);
	Class67_Sub5_Sub18.method999(105);
	Class67_Sub5_Sub15.method976(-1);
	Class67_Sub17.method1249(0);
	InputStream_Sub1.method48(0);
	OutputStream_Sub1.method60((byte) 62);
	Class67_Sub5_Sub5.method866(false);
	Class67_Sub3.method816(31926);
	Class67_Sub15.method1237(26675);
	Class126.method1711((byte) -100);
	Class126_Sub3.method1720(!arg0);
	Class126_Sub2.method1718(-122);
	Class126_Sub1.method1714(-111);
	Class126_Sub4.method1724((byte) -101);
    }
    
    public void method17(int arg0) {
	anInt2748++;
	if (Class67_Sub5_Sub18.anInt4804 != 1000) {
	    Class67_Sub1_Sub9.anInt3952++;
	    if ((Class67_Sub1_Sub9.anInt3952 % 1000 ^ 0xffffffff) == -2) {
		GregorianCalendar gregoriancalendar = new GregorianCalendar();
		Class67_Sub5.anInt2860 = (gregoriancalendar.get(11) * 600
					  - (-(10 * gregoriancalendar.get(12))
					     - gregoriancalendar.get(13) / 6));
		Class14.aRandom446.setSeed((long) Class67_Sub5.anInt2860);
	    }
	    method42(3524);
	    if (Class67_Sub17.aClass142_3099 != null)
		Class67_Sub17.aClass142_3099.method1953(true);
	    Class67_Sub1_Sub29.method752(10359);
	    Class132.method1901(64);
	    Class67_Sub11_Sub4.method1185(true);
	    Class144.method1963((byte) 106);
	    if (Class82.aLogin_1669 != null) {
		int i = Class82.aLogin_1669.method1414((byte) -56);
		Class74.anInt1493 = i;
	    }
	    if (arg0 < 58)
		main(null);
	    if ((Class67_Sub5_Sub18.anInt4804 ^ 0xffffffff) != -1) {
		if (Class67_Sub5_Sub18.anInt4804 != 5) {
		    if (Class67_Sub5_Sub18.anInt4804 == 25
			|| Class67_Sub5_Sub18.anInt4804 == 28)
			Class67_Sub1_Sub8.method652(-30458);
		} else {
		    method39((byte) 76);
		    Class37.method325(28028);
		}
	    } else {
		method39((byte) 110);
		Class37.method325(28028);
	    }
	    if (Class67_Sub5_Sub18.anInt4804 != 10) {
		if (Class67_Sub5_Sub18.anInt4804 == 30)
		    Class67_Sub26.method1296(118);
		else if (Class67_Sub5_Sub18.anInt4804 == 40) {
		    Login.method1416(-28426);
		    if ((Class28.anInt652 ^ 0xffffffff) != 2) {
			if (Class28.anInt652 == 15)
			    Class55.method462(true);
			else if ((Class28.anInt652 ^ 0xffffffff) != -3)
			    Class131_Sub4.method1819(106);
		    }
		}
	    } else {
		method40((byte) 94);
		Class56.method483(-1439);
		Class131_Sub4.method1818(125);
		Login.method1416(-28426);
	    }
	}
    }
    
    public static Class7 method38(Class7 arg0) {
	int i = method31(arg0).method1228(-30954);
	if (i == 0)
	    return null;
	for (int i_42_ = 0; i_42_ < i; i_42_++) {
	    arg0 = Class3.method69((byte) 110, arg0.anInt174);
	    if (arg0 == null)
		return null;
	}
	return arg0;
    }
    
    public void method39(byte arg0) {
	if (!Class67_Sub29.aBoolean3337) {
	    while (RSString.method546(false)) {
		if (Class87.anInt1800 == 115 || Class87.anInt1800 == 83)
		    Class67_Sub29.aBoolean3337 = true;
	    }
	}
	anInt2736++;
	if ((Class13.anInt426 ^ 0xffffffff) == -1) {
	    Runtime runtime = Runtime.getRuntime();
	    int i = (int) ((runtime.totalMemory() - runtime.freeMemory())
			   / 1024L);
	    long l = Class39.method337(19644);
	    if (Class67_Sub1_Sub14.aLong4039 == 0L)
		Class67_Sub1_Sub14.aLong4039 = l;
	    if ((i ^ 0xffffffff) < -16385
		&& ((-Class67_Sub1_Sub14.aLong4039 + l ^ 0xffffffffffffffffL)
		    > -5001L)) {
		if ((l - Class67_Sub12.aLong3043 ^ 0xffffffffffffffffL)
		    < -1001L) {
		    System.gc();
		    Class67_Sub12.aLong3043 = l;
		}
		Class67_Sub9.aRSString_2977 = Class74.aRSString_1487;
		Class67_Sub5_Sub5.anInt4517 = 5;
	    } else {
		Class67_Sub9.aRSString_2977 = Class67_Sub5_Sub13.aRSString_4707;
		Class67_Sub5_Sub5.anInt4517 = 5;
		Class13.anInt426 = 10;
	    }
	} else if ((Class13.anInt426 ^ 0xffffffff) == -11) {
	    for (int i = 0; (i ^ 0xffffffff) > -5; i++)
		Class53.aClass73Array1059[i] = new Class73(104, 104);
	    Class67_Sub5_Sub5.anInt4517 = 10;
	    Class67_Sub9.aRSString_2977 = Class67_Sub1_Sub26.aRSString_4230;
	    Class13.anInt426 = 30;
	} else if ((Class13.anInt426 ^ 0xffffffff) == -31) {
	    if (Class67_Sub17.aClass142_3099 == null)
		Class67_Sub17.aClass142_3099
		    = new Class142(Class144.aClass40_2588,
				   Class129.aClass16_2389);
	    if (!Class67_Sub17.aClass142_3099.method1955(-5)) {
		Class67_Sub5_Sub5.anInt4517 = 12;
		Class67_Sub9.aRSString_2977 = Class58.aRSString_1116;
	    } else {
		Class67_Sub1_Sub32.aClass9_4297
		    = Class67_Sub24.method1290(false, true, 0, true, 6021);
		Class12.aClass9_418
		    = Class67_Sub24.method1290(false, true, 1, true, 6021);
		OutputStream_Sub1.aClass9_85
		    = Class67_Sub24.method1290(true, true, 2, false, 6021);
		Class27.aClass9_635
		    = Class67_Sub24.method1290(false, true, 3, true, 6021);
		PacketParser.aClass9_2113
		    = Class67_Sub24.method1290(false, true, 4, true, 6021);
		Class111.aClass9_2097
		    = Class67_Sub24.method1290(true, true, 5, true, 6021);
		Class9.aClass9_362
		    = Class67_Sub24.method1290(true, false, 6, true, 6021);
		Class114.aClass9_2158
		    = Class67_Sub24.method1290(false, true, 7, true, 6021);
		Class51.aClass9_1044
		    = Class67_Sub24.method1290(false, true, 8, true, 6021);
		Class52.aClass9_1046
		    = Class67_Sub24.method1290(false, true, 9, true, 6021);
		Class41.aClass9_878
		    = Class67_Sub24.method1290(false, true, 10, true, 6021);
		Stream.aClass9_2908
		    = Class67_Sub24.method1290(false, true, 11, true, 6021);
		Class126_Sub2.aClass9_3429
		    = Class67_Sub24.method1290(false, true, 12, true, 6021);
		Class94.aClass9_1895
		    = Class67_Sub24.method1290(false, true, 13, true, 6021);
		Class43.aClass9_902
		    = Class67_Sub24.method1290(false, false, 14, true, 6021);
		Class67_Sub1_Sub8.aClass9_3926
		    = Class67_Sub24.method1290(false, true, 15, true, 6021);
		Class67_Sub1_Sub5.aClass9_3881
		    = Class67_Sub24.method1290(false, true, 16, true, 6021);
		Class13.aClass9_427
		    = Class67_Sub24.method1290(false, true, 17, true, 6021);
		Class136.aClass9_2484
		    = Class67_Sub24.method1290(false, true, 18, true, 6021);
		Class67_Sub20.aClass9_3158
		    = Class67_Sub24.method1290(false, true, 19, true, 6021);
		Class131_Sub5.aClass9_3663
		    = Class67_Sub24.method1290(false, true, 20, true, 6021);
		Class67_Sub5_Sub11_Sub2.aClass9_5139
		    = Class67_Sub24.method1290(false, true, 21, true, 6021);
		Class69.aClass9_1384
		    = Class67_Sub24.method1290(false, true, 22, true, 6021);
		Class2.aClass9_108
		    = Class67_Sub24.method1290(true, true, 23, true, 6021);
		Class55_Sub3_Sub1.aClass9_3811
		    = Class67_Sub24.method1290(false, true, 24, true, 6021);
		Class67_Sub30.aClass9_3344
		    = Class67_Sub24.method1290(false, true, 25, true, 6021);
		Class67_Sub1_Sub39.aClass9_4446
		    = Class67_Sub24.method1290(true, true, 26, true, 6021);
		Class83.aClass9_1676
		    = Class67_Sub24.method1290(false, true, 27, true, 6021);
		Class13.anInt426 = 40;
		Class67_Sub9.aRSString_2977 = Class129.aRSString_2396;
		Class67_Sub5_Sub5.anInt4517 = 15;
	    }
	} else if (Class13.anInt426 == 40) {
	    int i = 0;
	    for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > -29; i_43_++)
		i += (Class82.aClass129_Sub1Array1666[i_43_].method1755(0)
		      * Class22.anIntArray549[i_43_] / 100);
	    if (i != 100) {
		if (i != 0)
		    Class67_Sub9.aRSString_2977
			= (Class67_Sub1_Sub27.method744
			   (new RSString[] { Class67_Sub1_Sub4.aRSString_3864,
					    InputStream_Sub1.method47(i, true),
					    Class85.aRSString_1728 },
			    -127));
		Class67_Sub5_Sub5.anInt4517 = 20;
	    } else {
		Class67_Sub5_Sub5.anInt4517 = 20;
		Class67_Sub9.aRSString_2977 = Class67_Sub1_Sub37.aRSString_4393;
		Class78.method1410(Class51.aClass9_1044, 52);
		RuntimeException_Sub1.method1969(81, Class51.aClass9_1044);
		Class67_Sub1_Sub22.method725(Class51.aClass9_1044, -26442);
		Class13.anInt426 = 45;
	    }
	} else if (Class13.anInt426 == 45) {
	    Class85.method1450(2, 126, Class105.aBoolean2044, 22050);
	    Class67_Sub23.aClass67_Sub11_Sub4_3205 = new Class67_Sub11_Sub4();
	    Class67_Sub23.aClass67_Sub11_Sub4_3205.method1217(128, 9, 86);
	    Class67_Sub5_Sub9.aClass28_4616
		= Class67_Sub5_Sub8.method886(22050, Class124.aSignLink_2335, 0,
					      -9634,
					      Class67_Sub5_Sub12.aCanvas4698);
	    Class67_Sub5_Sub9.aClass28_4616
		.method259(-121, Class67_Sub23.aClass67_Sub11_Sub4_3205);
	    Class67_Sub5_Sub12.method947((Class67_Sub23
					  .aClass67_Sub11_Sub4_3205),
					 Class43.aClass9_902, false,
					 Class67_Sub1_Sub8.aClass9_3926,
					 PacketParser.aClass9_2113);
	    Class78.aClass28_1606
		= Class67_Sub5_Sub8.method886(2048, Class124.aSignLink_2335, 1,
					      -9634,
					      Class67_Sub5_Sub12.aCanvas4698);
	    Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145
		= new Class67_Sub11_Sub1();
	    Class78.aClass28_1606
		.method259(104, Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145);
	    Class10.aClass54_401 = new Class54(22050, Class89.anInt1833);
	    Class56.anInt1101
		= Class9.aClass9_362.method126((byte) 125,
					       Class64.aRSString_1180);
	    Class67_Sub5_Sub5.anInt4517 = 30;
	    Class67_Sub9.aRSString_2977 = Login.aRSString_1619;
	    Class13.anInt426 = 50;
	} else if ((Class13.anInt426 ^ 0xffffffff) == -51) {
	    int i = Class67_Sub1_Sub17.method697(Class51.aClass9_1044,
						 Class94.aClass9_1895, -119);
	    int i_44_ = Class52.method451((byte) -50);
	    if (i_44_ > i) {
		Class67_Sub9.aRSString_2977
		    = (Class67_Sub1_Sub27.method744
		       ((new RSString[]
			 { Class28.aRSString_653,
			   InputStream_Sub1.method47(100 * i / i_44_, true),
			   Class85.aRSString_1728 }),
			-94));
		Class67_Sub5_Sub5.anInt4517 = 35;
	    } else {
		Class67_Sub5_Sub5.anInt4517 = 35;
		Class13.anInt426 = 60;
		Class67_Sub9.aRSString_2977 = Class67_Sub24.aRSString_3244;
	    }
	} else if ((Class13.anInt426 ^ 0xffffffff) == -61) {
	    int i = Class69.method1323(Class51.aClass9_1044, 123);
	    int i_45_ = Class67_Sub5_Sub15.method975(100);
	    if ((i ^ 0xffffffff) > (i_45_ ^ 0xffffffff)) {
		Class67_Sub9.aRSString_2977
		    = (Class67_Sub1_Sub27.method744
		       ((new RSString[]
			 { Class53.aRSString_1063,
			   InputStream_Sub1.method47(i * 100 / i_45_, true),
			   Class85.aRSString_1728 }),
			-113));
		Class67_Sub5_Sub5.anInt4517 = 40;
	    } else {
		Class67_Sub9.aRSString_2977 = Class67_Sub5_Sub19.aRSString_4824;
		Class13.anInt426 = 65;
		Class67_Sub5_Sub5.anInt4517 = 40;
	    }
	} else if (Class13.anInt426 == 65) {
	    Class119.method1646((byte) 114, Class51.aClass9_1044,
				Class94.aClass9_1895);
	    Class67_Sub9.aRSString_2977 = Class67_Sub5_Sub16.aRSString_4781;
	    Class67_Sub5_Sub5.anInt4517 = 45;
	    Class40.method348(-11461, 5);
	    Class13.anInt426 = 70;
	} else if (Class13.anInt426 == 70) {
	    OutputStream_Sub1.aClass9_85.method125(-2);
	    int i = 0;
	    i += OutputStream_Sub1.aClass9_85.method129(0);
	    Class67_Sub1_Sub5.aClass9_3881.method125(-2);
	    i += Class67_Sub1_Sub5.aClass9_3881.method129(0);
	    Class13.aClass9_427.method125(-2);
	    i += Class13.aClass9_427.method129(0);
	    Class136.aClass9_2484.method125(-2);
	    i += Class136.aClass9_2484.method129(0);
	    Class67_Sub20.aClass9_3158.method125(-2);
	    i += Class67_Sub20.aClass9_3158.method129(0);
	    Class131_Sub5.aClass9_3663.method125(-2);
	    i += Class131_Sub5.aClass9_3663.method129(0);
	    Class67_Sub5_Sub11_Sub2.aClass9_5139.method125(-2);
	    i += Class67_Sub5_Sub11_Sub2.aClass9_5139.method129(0);
	    Class69.aClass9_1384.method125(-2);
	    i += Class69.aClass9_1384.method129(0);
	    Class55_Sub3_Sub1.aClass9_3811.method125(-2);
	    i += Class55_Sub3_Sub1.aClass9_3811.method129(0);
	    Class67_Sub30.aClass9_3344.method125(-2);
	    i += Class67_Sub30.aClass9_3344.method129(0);
	    Class83.aClass9_1676.method125(-2);
	    i += Class83.aClass9_1676.method129(0);
	    if ((i ^ 0xffffffff) > -1101) {
		Class67_Sub9.aRSString_2977
		    = (Class67_Sub1_Sub27.method744
		       (new RSString[] { Class92.aRSString_1878,
					InputStream_Sub1.method47(i / 11,
								  true),
					Class85.aRSString_1728 },
			-115));
		Class67_Sub5_Sub5.anInt4517 = 50;
	    } else {
		Class139.method1939(48, OutputStream_Sub1.aClass9_85);
		Class67_Sub1_Sub11.method664(OutputStream_Sub1.aClass9_85,
					     (byte) -110);
		Class67_Sub5_Sub15.method979(OutputStream_Sub1.aClass9_85,
					     -51);
		RSString.method498(OutputStream_Sub1.aClass9_85, (byte) 69,
				  Class114.aClass9_2158);
		Class116.method1624(Class114.aClass9_2158, (byte) 58,
				    Class67_Sub1_Sub5.aClass9_3881, true);
		Class67_Sub23.method1285(-2, Class136.aClass9_2484,
					 Class114.aClass9_2158);
		Class15.method166(Class67_Sub20.aClass9_3158, -128, true,
				  PacketParser.aClass67_Sub5_Sub10_Sub1_2108,
				  Class114.aClass9_2158);
		Class89.method1467(0, OutputStream_Sub1.aClass9_85);
		Class67_Sub5_Sub7.method874(Class131_Sub5.aClass9_3663,
					    Class12.aClass9_418, -124,
					    Class67_Sub1_Sub32.aClass9_4297);
		Class95.method1499(49, OutputStream_Sub1.aClass9_85);
		Class94.method1497(Class114.aClass9_2158,
				   Class67_Sub5_Sub11_Sub2.aClass9_5139, true);
		Class67_Sub17.method1248(415013098, Class69.aClass9_1384);
		Class125.method1705(OutputStream_Sub1.aClass9_85, (byte) -20);
		Class67_Sub30.method1315(Class94.aClass9_1895,
					 Class51.aClass9_1044, true,
					 Class114.aClass9_2158,
					 Class27.aClass9_635);
		Class67_Sub14.method1236(102, OutputStream_Sub1.aClass9_85);
		Class51.method448(-17017, Class13.aClass9_427);
		Class12.method148(Class67_Sub30.aClass9_3344, new Class18(), 1,
				  Class55_Sub3_Sub1.aClass9_3811);
		Class109.method1578(Class55_Sub3_Sub1.aClass9_3811,
				    Class67_Sub30.aClass9_3344, (byte) -6);
		Class49.method430(OutputStream_Sub1.aClass9_85, false);
		Class13.method155(-33, OutputStream_Sub1.aClass9_85,
				  Class51.aClass9_1044);
		Class55_Sub3_Sub1.method477(Class51.aClass9_1044,
					    OutputStream_Sub1.aClass9_85,
					    (byte) -103);
		Class67_Sub9.aRSString_2977 = Class67.aRSString_1343;
		Class67_Sub5_Sub5.anInt4517 = 50;
		InputStream_Sub1.method53((byte) -91);
		Class13.anInt426 = 80;
	    }
	} else if (Class13.anInt426 == 80) {
	    int i = Class70.method1330(Class51.aClass9_1044, false);
	    int i_46_ = Class67_Sub1_Sub39.method810(true);
	    if (i_46_ > i) {
		Class67_Sub9.aRSString_2977
		    = (Class67_Sub1_Sub27.method744
		       ((new RSString[]
			 { Class91.aRSString_1856,
			   InputStream_Sub1.method47(100 * i / i_46_, true),
			   Class85.aRSString_1728 }),
			-124));
		Class67_Sub5_Sub5.anInt4517 = 60;
	    } else {
		Class130.method1761(Class51.aClass9_1044, -7058);
		Class67_Sub5_Sub5.anInt4517 = 60;
		Class13.anInt426 = 90;
		Class67_Sub9.aRSString_2977 = Class126_Sub4.aRSString_3472;
	    }
	} else if (Class13.anInt426 == 90) {
	    if (!Class67_Sub1_Sub39.aClass9_4446.method125(-2)) {
		Class67_Sub9.aRSString_2977
		    = (Class67_Sub1_Sub27.method744
		       ((new RSString[]
			 { Class53.aRSString_1064,
			   InputStream_Sub1.method47(Class67_Sub1_Sub39
							 .aClass9_4446
							 .method129(0),
						     true),
			   Class85.aRSString_1728 }),
			-118));
		Class67_Sub5_Sub5.anInt4517 = 70;
	    } else {
		Class75 class75 = new Class75(Class52.aClass9_1046,
					      Class67_Sub1_Sub39.aClass9_4446,
					      Class51.aClass9_1044, 20,
					      !Class67_Sub5_Sub2.aBoolean4468);
		Class26.method242(class75);
		if (Class28.anInt667 == 1)
		    Class26.method230(0.9F);
		if (Class28.anInt667 == 2)
		    Class26.method230(0.8F);
		if ((Class28.anInt667 ^ 0xffffffff) == -4)
		    Class26.method230(0.7F);
		if (Class28.anInt667 == 4)
		    Class26.method230(0.6F);
		Class67_Sub9.aRSString_2977 = Class67.aRSString_1338;
		Class13.anInt426 = 100;
		Class67_Sub5_Sub5.anInt4517 = 70;
	    }
	} else if (Class13.anInt426 == 100) {
	    if (Class99_Sub1.method1528(Class51.aClass9_1044, 14))
		Class13.anInt426 = 110;
	} else if ((Class13.anInt426 ^ 0xffffffff) == -111) {
	    Class40.aClass5_829 = new Class5();
	    Class124.aSignLink_2335.method404(2, Class40.aClass5_829, 10);
	    Class67_Sub9.aRSString_2977 = Class75.aRSString_2695;
	    Class13.anInt426 = 120;
	    Class67_Sub5_Sub5.anInt4517 = 75;
	} else if ((Class13.anInt426 ^ 0xffffffff) == -121) {
	    if (!Class41.aClass9_878.method121(Class67_Sub5_Sub5.aRSString_4523,
					       25653,
					       Class129_Sub1.aRSString_3481)) {
		Class67_Sub9.aRSString_2977
		    = Class67_Sub1_Sub27.method744((new RSString[]
						    { (Stream
						       .aRSString_2901),
						      Class7.aRSString_321 }),
						   -106);
		Class67_Sub5_Sub5.anInt4517 = 80;
	    } else {
		Class27 class27
		    = new Class27(Class41.aClass9_878.method116
				  (118, Class67_Sub5_Sub5.aRSString_4523,
				   Class129_Sub1.aRSString_3481));
		Class72.method1349(class27, 122);
		Class67_Sub5_Sub5.anInt4517 = 80;
		Class67_Sub9.aRSString_2977 = Class67_Sub1_Sub10.aRSString_3970;
		Class13.anInt426 = 130;
	    }
	} else if (Class13.anInt426 == 130) {
	    if (!Class27.aClass9_635.method125(-2)) {
		Class67_Sub9.aRSString_2977
		    = (Class67_Sub1_Sub27.method744
		       ((new RSString[]
			 { Class131_Sub5.aRSString_3654,
			   InputStream_Sub1.method47(Class27.aClass9_635
							 .method129(0) * 3 / 4,
						     true),
			   Class85.aRSString_1728 }),
			-104));
		Class67_Sub5_Sub5.anInt4517 = 85;
	    } else if (!Class126_Sub2.aClass9_3429.method125(-2)) {
		Class67_Sub9.aRSString_2977
		    = (Class67_Sub1_Sub27.method744
		       ((new RSString[]
			 { Class131_Sub5.aRSString_3654,
			   InputStream_Sub1.method47((Class126_Sub2
							  .aClass9_3429
							  .method129(0) / 10
						      + 75),
						     true),
			   Class85.aRSString_1728 }),
			-105));
		Class67_Sub5_Sub5.anInt4517 = 85;
	    } else if (!Class94.aClass9_1895.method125(-2)) {
		Class67_Sub9.aRSString_2977
		    = (Class67_Sub1_Sub27.method744
		       ((new RSString[]
			 { Class131_Sub5.aRSString_3654,
			   InputStream_Sub1.method47((Class94.aClass9_1895
							  .method129(0) / 20
						      + 85),
						     true),
			   Class85.aRSString_1728 }),
			-92));
		Class67_Sub5_Sub5.anInt4517 = 85;
	    } else if (!Class2.aClass9_108
			    .method105(256, Class99_Sub1.aRSString_3401)) {
		Class67_Sub9.aRSString_2977
		    = (Class67_Sub1_Sub27.method744
		       ((new RSString[]
			 { Class131_Sub5.aRSString_3654,
			   (InputStream_Sub1.method47
			    (Class2.aClass9_108.method113((Class99_Sub1
							   .aRSString_3401),
							  -19579) / 10 + 90,
			     true)),
			   Class85.aRSString_1728 }),
			-93));
		Class67_Sub5_Sub5.anInt4517 = 85;
	    } else {
		Class129_Sub1.method1744(120,
					 (Class134
					  .aClass67_Sub5_Sub19_Sub1Array2465),
					 Class2.aClass9_108);
		Class67_Sub5_Sub5.anInt4517 = 95;
		Class13.anInt426 = 135;
		Class67_Sub9.aRSString_2977 = Class89.aRSString_1838;
	    }
	} else {
	    if (arg0 < 46)
		aBooleanArrayArray2739 = null;
	    if (Class13.anInt426 == 135) {
		int i = Class65.method596(-1);
		if ((i ^ 0xffffffff) == 0) {
		    Class67_Sub5_Sub5.anInt4517 = 95;
		    Class67_Sub9.aRSString_2977 = Class67_Sub9.aRSString_2974;
		} else if ((i ^ 0xffffffff) == -8 || (i ^ 0xffffffff) == -10) {
		    this.method16(31439, "worldlistfull");
		    Class40.method348(-11461, 1000);
		} else if (!Class67_Sub1_Sub27.aBoolean4238) {
		    this.method16(31439, "worldlistio_" + i);
		    Class40.method348(-11461, 1000);
		} else {
		    Class13.anInt426 = 140;
		    Class67_Sub9.aRSString_2977 = Class123.aRSString_2314;
		    Class67_Sub5_Sub5.anInt4517 = 96;
		}
	    } else if ((Class13.anInt426 ^ 0xffffffff) == -141) {
		Canvas_Sub1.anInt67
		    = Class27.aClass9_635.method126((byte) 99,
						    (Class67_Sub1_Sub34
						     .aRSString_4333));
		Class111.aClass9_2097.method110((byte) 95, true, false);
		Class9.aClass9_362.method110((byte) -85, true, true);
		Class51.aClass9_1044.method110((byte) 86, true, true);
		Class94.aClass9_1895.method110((byte) 127, true, true);
		Class41.aClass9_878.method110((byte) 105, true, true);
		Class27.aClass9_635.method110((byte) 115, true, true);
		Class67_Sub5_Sub5.anInt4517 = 97;
		Class13.anInt426 = 150;
		Class67_Sub9.aRSString_2977 = Class131_Sub5.aRSString_3657;
		Class106.aBoolean2059 = true;
	    } else if ((Class13.anInt426 ^ 0xffffffff) == -151) {
		if (Class67_Sub29.aBoolean3337) {
		    Class95.anInt1909 = 0;
		    Class75.anInt2716 = 0;
		    Class74.anInt1485 = 0;
		    Class2.anInt112 = 0;
		}
		Class67_Sub29.aBoolean3337 = true;
		Class67_Sub5_Sub2.method837(Class124.aSignLink_2335, (byte) 88);
		Class67_Sub28.method1305(-1, true, Class2.anInt112, false, -1);
		Class67_Sub9.aRSString_2977 = Class67.aRSString_1345;
		Class67_Sub5_Sub5.anInt4517 = 100;
		Class13.anInt426 = 160;
	    } else if ((Class13.anInt426 ^ 0xffffffff) == -161)
		Class134.method1913(8, true);
	}
    }
    
    public void method40(byte arg0) {
	Class67_Sub20.anInt3168 = 0;
	anInt2744++;
	for (/**/;
	     (RSString.method546(false)
	      && (Class67_Sub20.anInt3168 ^ 0xffffffff) > -129);
	     Class67_Sub20.anInt3168++) {
	    Class67_Sub1_Sub28.anIntArray4255[Class67_Sub20.anInt3168]
		= Class41.anInt873;
	    Class54.anIntArray1076[Class67_Sub20.anInt3168]
		= Class87.anInt1800;
	}
	RSString.anInt2642++;
	if (arg0 == 94) {
	    if ((Class54.anInt1080 ^ 0xffffffff) != 0)
		Class27.method257(Class49.anInt1010, 0, Class56.anInt1097, 0,
				  (byte) -24, Class54.anInt1080, 0, 0);
	    Class11.anInt409++;
	    Class67_Sub11_Sub4.method1183((byte) -81);
	    for (;;) {
		Class67_Sub30 class67_sub30
		    = (Class67_Sub30) Class25.aClass50_602.method442(true);
		if (class67_sub30 == null)
		    break;
		Class7 class7 = class67_sub30.aClass7_3352;
		if (class7.anInt266 >= 0) {
		    Class7 class7_47_
			= Class3.method69((byte) 110, class7.anInt174);
		    if (class7_47_ == null
			|| class7_47_.aClass7Array228 == null
			|| ((class7.anInt266 ^ 0xffffffff)
			    <= (class7_47_.aClass7Array228.length
				^ 0xffffffff))
			|| (class7_47_.aClass7Array228[class7.anInt266]
			    != class7))
			continue;
		}
		Class81.method1429(class67_sub30, arg0 ^ 0x19);
	    }
	    for (;;) {
		Class67_Sub30 class67_sub30
		    = ((Class67_Sub30)
		       Class67_Sub24.aClass50_3213.method442(true));
		if (class67_sub30 == null)
		    break;
		Class7 class7 = class67_sub30.aClass7_3352;
		if ((class7.anInt266 ^ 0xffffffff) <= -1) {
		    Class7 class7_48_
			= Class3.method69((byte) 110, class7.anInt174);
		    if (class7_48_ == null
			|| class7_48_.aClass7Array228 == null
			|| class7.anInt266 >= class7_48_.aClass7Array228.length
			|| (class7_48_.aClass7Array228[class7.anInt266]
			    != class7))
			continue;
		}
		Class81.method1429(class67_sub30, 125);
	    }
	    for (;;) {
		Class67_Sub30 class67_sub30
		    = ((Class67_Sub30)
		       Class67_Sub17.aClass50_3094.method442(true));
		if (class67_sub30 == null)
		    break;
		Class7 class7 = class67_sub30.aClass7_3352;
		if (class7.anInt266 >= 0) {
		    Class7 class7_49_
			= Class3.method69((byte) 110, class7.anInt174);
		    if (class7_49_ == null
			|| class7_49_.aClass7Array228 == null
			|| ((class7_49_.aClass7Array228.length ^ 0xffffffff)
			    >= (class7.anInt266 ^ 0xffffffff))
			|| (class7_49_.aClass7Array228[class7.anInt266]
			    != class7))
			continue;
		}
		Class81.method1429(class67_sub30, 93);
	    }
	    if (Class67_Sub5_Sub12.aClass7_4699 != null)
		Class49.method429((byte) -124);
	    if (Class67_Sub5_Sub2.aClass31_4475 != null
		&& Class67_Sub5_Sub2.aClass31_4475.anInt706 == 1) {
		if (Class67_Sub5_Sub2.aClass31_4475.anObject705 != null)
		    Class67_Sub1_Sub19.method707((Class67_Sub1_Sub16_Sub1
						  .aBoolean5095),
						 (byte) 117, aRSString_2750);
		Class67_Sub5_Sub2.aClass31_4475 = null;
		aRSString_2750 = null;
		Class67_Sub1_Sub16_Sub1.aBoolean5095 = false;
	    }
	    if (Class67_Sub1_Sub9.anInt3952 % 1500 == 0)
		Class120.method1662(arg0 + -94);
	}
    }
    
    public static void method41(int arg0, byte arg1, Class7 arg2, int arg3) {
	anInt2749++;
	if (Class67_Sub5_Sub12.aClass7_4699 == null
	    && !Class67_Sub9.aBoolean2980
	    && (arg2 != null
		&& Class67_Sub1_Sub29.method751(arg2, arg1 ^ 0xc2) != null)) {
	    Class67_Sub5_Sub12.aClass7_4699 = arg2;
	    Class67_Sub1_Sub34.aClass7_4337
		= Class67_Sub1_Sub29.method751(arg2, arg1 + 194);
	    Class67_Sub3.anInt2844 = arg3;
	    Class37.aBoolean798 = false;
	    Class51.anInt1036 = 0;
	    Class67_Sub3.anInt2852 = arg0;
	    if (arg1 != 61)
		main(null);
	}
    }
    
    public void method42(int arg0) {
	boolean bool = Class144.aClass40_2588.method353(arg0 ^ arg0);
	anInt2747++;
	if (!bool)
	    method34(false);
    }
    
    static {
	aRSString_2742 = aRSString_2743;
    }
}
