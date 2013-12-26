import java.awt.Component;

public class Class28
{
    public static int anInt645;
    public static int anInt646;
    public static int anInt647;
    public static int anInt648;
    public long aLong649;
    public static int anInt650;
    public int[] anIntArray651;
    public static int anInt652 = -2;
    public static RSString aRSString_653;
    public static int anInt654;
    public static RSString aRSString_655
	= Class134.method1914("Loading fonts )2 ", (byte) 24);
    public static int anInt656;
    public static int anInt657;
    public static int anInt658;
    public static int anInt659;
    public static int anInt660;
    public int anInt661 = 32;
    public Class67_Sub11 aClass67_Sub11_662;
    public static int anInt663;
    public static int anInt664;
    public static int anInt665;
    public static Class36[] aClass36Array666;
    public static int anInt667;
    public static int anInt668;
    public static int anInt669;
    public static int anInt670;
    public static int anInt671;
    public static client aClient672;
    public static int anInt673;
    public long aLong674;
    public int anInt675;
    public int anInt676;
    public long aLong677;
    public boolean aBoolean678;
    public int anInt679;
    public int anInt680;
    public int anInt681;
    public Class67_Sub11[] aClass67_Sub11Array682;
    public int anInt683;
    public int anInt684;
    public Class67_Sub11[] aClass67_Sub11Array685;
    
    public void method258(int arg0) {
	anInt658++;
	aBoolean678 = true;
	if (arg0 != 0)
	    method270(-21);
    }
    
    public synchronized void method259(int arg0, Class67_Sub11 arg1) {
	anInt654++;
	int i = 115 / ((-56 - arg0) / 45);
	aClass67_Sub11_662 = arg1;
    }
    
    public void method260(int[] arg0, int arg1) {
	int i = arg1;
	if (Class25.aBoolean605)
	    i <<= 1;
	Class17.method180(arg0, 0, i);
	anInt679 -= arg1;
	if (aClass67_Sub11_662 != null && anInt679 <= 0) {
	    anInt679 += Class89.anInt1833 >> 4;
	    Class124.method1702(0, aClass67_Sub11_662);
	    method267(-128, aClass67_Sub11_662.method1126(),
		      aClass67_Sub11_662);
	    int i_0_ = 0;
	    int i_1_ = 255;
	    int i_2_ = 7;
	while_8_:
	    while (i_1_ != 0) {
		int i_3_;
		int i_4_;
		if (i_2_ < 0) {
		    i_3_ = i_2_ & 0x3;
		    i_4_ = -(i_2_ >> 2);
		} else {
		    i_3_ = i_2_;
		    i_4_ = 0;
		}
		for (int i_5_ = i_1_ >>> i_3_ & 0x11111111; i_5_ != 0;
		     i_5_ >>>= 4) {
		    if ((i_5_ & 0x1) != 0) {
			i_1_ &= 1 << i_3_ ^ 0xffffffff;
			Class67_Sub11 class67_sub11 = null;
			Class67_Sub11 class67_sub11_6_
			    = aClass67_Sub11Array685[i_3_];
			while (class67_sub11_6_ != null) {
			    Class67_Sub13 class67_sub13
				= class67_sub11_6_.aClass67_Sub13_3023;
			    if (class67_sub13 != null
				&& class67_sub13.anInt3045 > i_4_) {
				i_1_ |= 1 << i_3_;
				class67_sub11 = class67_sub11_6_;
				class67_sub11_6_
				    = class67_sub11_6_.aClass67_Sub11_3024;
			    } else {
				class67_sub11_6_.aBoolean3022 = true;
				int i_7_ = class67_sub11_6_.method1128();
				i_0_ += i_7_;
				if (class67_sub13 != null)
				    class67_sub13.anInt3045 += i_7_;
				if (i_0_ >= anInt661)
				    break while_8_;
				Class67_Sub11 class67_sub11_8_
				    = class67_sub11_6_.method1122();
				if (class67_sub11_8_ != null) {
				    int i_9_ = class67_sub11_6_.anInt3025;
				    for (/**/; class67_sub11_8_ != null;
					 class67_sub11_8_
					     = class67_sub11_6_.method1124())
					method267(-82,
						  (i_9_ * class67_sub11_8_
							      .method1126()
						   >> 8),
						  class67_sub11_8_);
				}
				Class67_Sub11 class67_sub11_10_
				    = class67_sub11_6_.aClass67_Sub11_3024;
				class67_sub11_6_.aClass67_Sub11_3024 = null;
				if (class67_sub11 == null)
				    aClass67_Sub11Array685[i_3_]
					= class67_sub11_10_;
				else
				    class67_sub11.aClass67_Sub11_3024
					= class67_sub11_10_;
				if (class67_sub11_10_ == null)
				    aClass67_Sub11Array682[i_3_]
					= class67_sub11;
				class67_sub11_6_ = class67_sub11_10_;
			    }
			}
		    }
		    i_3_ += 4;
		    i_4_++;
		}
		i_2_--;
	    }
	    for (int i_11_ = 0; i_11_ < 8; i_11_++) {
		Class67_Sub11 class67_sub11 = aClass67_Sub11Array685[i_11_];
		aClass67_Sub11Array685[i_11_]
		    = aClass67_Sub11Array682[i_11_] = null;
		Class67_Sub11 class67_sub11_12_;
		for (/**/; class67_sub11 != null;
		     class67_sub11 = class67_sub11_12_) {
		    class67_sub11_12_ = class67_sub11.aClass67_Sub11_3024;
		    class67_sub11.aClass67_Sub11_3024 = null;
		}
	    }
	}
	if (anInt679 < 0)
	    anInt679 = 0;
	if (aClass67_Sub11_662 != null)
	    aClass67_Sub11_662.method1127(arg0, 0, arg1);
	aLong649 = Class39.method337(19644);
    }
    
    public void method261(int arg0, int arg1) {
	anInt647++;
	if (arg0 > -104)
	    aLong649 = -15L;
	anInt679 -= arg1;
	if ((anInt679 ^ 0xffffffff) > -1)
	    anInt679 = 0;
	if (aClass67_Sub11_662 != null)
	    aClass67_Sub11_662.method1123(arg1);
    }
    
    public int method262() throws Exception {
	anInt650++;
	return anInt675;
    }
    
    public void method263() throws Exception {
	anInt648++;
    }
    
    public static void method264(int arg0, int arg1, int arg2, int arg3,
				 Class131_Sub7_Sub2 arg4) {
	anInt665++;
	if (arg4 != Class122.aClass131_Sub7_Sub2_2309
	    && Class134.anInt2476 < 400) {
	    RSString RSString;
	    if ((arg4.anInt5067 ^ 0xffffffff) == -1) {
		boolean bool = true;
		if (((Class122.aClass131_Sub7_Sub2_2309.anInt5075 ^ 0xffffffff)
		     != 0)
		    && arg4.anInt5075 != -1) {
		    int i = ((Class122.aClass131_Sub7_Sub2_2309.combatLevel
			      > arg4.combatLevel)
			     ? Class122.aClass131_Sub7_Sub2_2309.combatLevel
			     : arg4.combatLevel);
		    int i_13_
			= ((arg4.anInt5075
			    > Class122.aClass131_Sub7_Sub2_2309.anInt5075)
			   ? Class122.aClass131_Sub7_Sub2_2309.anInt5075
			   : arg4.anInt5075);
		    int i_14_ = i_13_ + (10 * i / 100 + 5);
		    int i_15_
			= (-arg4.combatLevel
			   + Class122.aClass131_Sub7_Sub2_2309.combatLevel);
		    if ((i_15_ ^ 0xffffffff) > -1)
			i_15_ = -i_15_;
		    if (i_14_ < i_15_)
			bool = false;
		}
		RSString RSString_16_ = ((Class69.anInt1381 ^ 0xffffffff) == -2
				       ? Class67_Sub30.aRSString_3346
				       : Class67_Sub27.aRSString_3311);
		if (arg4.combatLevel < arg4.anInt5066)
		    RSString
			= (Class67_Sub1_Sub27.method744
			   ((new RSString[]
			     { arg4.method1898(-14756),
			       bool ? (Class67_Sub1_Sub25.method736
				       ((Class122.aClass131_Sub7_Sub2_2309
					 .combatLevel),
					arg4.combatLevel,
					4162)) : Class128.aRSString_2381,
			       Class55_Sub2.aRSString_2797, RSString_16_,
			       InputStream_Sub1.method47(arg4.combatLevel, true),
			       Class67_Sub1_Sub24.aRSString_4197,
			       InputStream_Sub1.method47((-arg4.combatLevel
							  + arg4.anInt5066),
							 true),
			       Class120.aRSString_2291 }),
			    arg2 ^ ~0x288a));
		else
		    RSString
			= (Class67_Sub1_Sub27.method744
			   ((new RSString[]
			     { arg4.method1898(arg2 + -25211),
			       bool ? (Class67_Sub1_Sub25.method736
				       ((Class122.aClass131_Sub7_Sub2_2309
					 .combatLevel),
					arg4.combatLevel,
					4162)) : Class128.aRSString_2381,
			       Class55_Sub2.aRSString_2797, RSString_16_,
			       InputStream_Sub1.method47(arg4.combatLevel, true),
			       Class120.aRSString_2291 }),
			    arg2 + -10580));
	    } else
		RSString
		    = (Class67_Sub1_Sub27.method744
		       ((new RSString[]
			 { arg4.method1898(-14756), Class55_Sub2.aRSString_2797,
			   Class99_Sub1.aRSString_3387,
			   InputStream_Sub1.method47(arg4.anInt5067, true),
			   Class120.aRSString_2291 }),
			-96));
	    if (Login.anInt1612 == 1) {
		Class105.anInt2049++;
		Class120.method1664((byte) 118,
				    (Class67_Sub1_Sub27.method744
				     ((new RSString[]
				       { Class67_Sub1_Sub6.aRSString_3895,
					 Class67_Sub1_Sub31.aRSString_4282,
					 RSString }),
				      arg2 ^ ~0x28bb)),
				    (short) 47, Login.aRSString_1615, arg1,
				    arg0, (long) arg3, Class33_Sub2.anInt2783);
	    } else if (!Class67_Sub20.aBoolean3156) {
		for (int i = 7; i >= 0; i--) {
		    if (Class131_Sub7_Sub1.aRSStringArray5043[i] != null) {
			Class67_Sub5_Sub4.anInt4509++;
			short i_17_ = 0;
			if (Class69.anInt1381 == 0
			    && (Class131_Sub7_Sub1.aRSStringArray5043[i]
				    .method526
				(arg2 + -10507,
				 Class67_Sub5_Sub4_Sub1.aRSString_5121))) {
			    if (Class122.aClass131_Sub7_Sub2_2309.combatLevel
				< arg4.combatLevel)
				i_17_ = (short) 2000;
			    if ((Class122.aClass131_Sub7_Sub2_2309.playerTeam
				 != 0)
				&& arg4.playerTeam != 0) {
				if (arg4.playerTeam
				    == (Class122.aClass131_Sub7_Sub2_2309
					.playerTeam))
				    i_17_ = (short) 2000;
				else
				    i_17_ = (short) 0;
			    }
			} else if (Class67_Sub19.aBooleanArray3154[i])
			    i_17_ = (short) 2000;
			boolean bool = false;
			short i_18_ = Class137.aShortArray2515[i];
			i_18_ += i_17_;
			Class120.method1664
			    ((byte) 109,
			     Class67_Sub1_Sub27.method744((new RSString[]
							   { (Class128
							      .aRSString_2381),
							     RSString }),
							  arg2 ^ ~0x28b4),
			     i_18_, Class131_Sub7_Sub1.aRSStringArray5043[i],
			     arg1, arg0, (long) arg3,
			     Class67_Sub1_Sub16.anIntArray4086[i]);
		    }
		}
	    } else if ((0x8 & Class67_Sub5_Sub14.anInt4733) != 0) {
		Class120.method1664
		    ((byte) 126,
		     Class67_Sub1_Sub27.method744((new RSString[]
						   { Class9.aRSString_369,
						     (Class67_Sub1_Sub31
						      .aRSString_4282),
						     RSString }),
						  arg2 ^ ~0x28a6),
		     (short) 16, Class67_Sub26.aRSString_3288, arg1, arg0,
		     (long) arg3, Class67_Sub5_Sub3.anInt4487);
		Class63.anInt1172++;
	    }
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class134.anInt2476 ^ 0xffffffff); i++) {
		if ((Applet_Sub1.aShortArray21[i] ^ 0xffffffff) == -58) {
		    Class102.aRSStringArray1998[i]
			= Class67_Sub1_Sub27.method744((new RSString[]
							{ (Class128
							   .aRSString_2381),
							  RSString }),
						       -105);
		    break;
		}
	    }
	    if (arg2 != 10455)
		method266(-8, 16, -93, -8, -53);
	}
    }
    
    public synchronized void method265(int arg0) {
	aBoolean678 = true;
	try {
	    method263();
	} catch (Exception exception) {
	    method275();
	    aLong674 = Class39.method337(19644) + 2000L;
	}
	if (arg0 == -7755)
	    anInt671++;
    }
    
    public static void method266(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	anInt657++;
	if (arg3 != 100)
	    method271(true, false);
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg4, false, 4);
	class67_sub5_sub3.method846(true);
	class67_sub5_sub3.anInt4491 = arg0;
	class67_sub5_sub3.anInt4500 = arg1;
	class67_sub5_sub3.anInt4495 = arg2;
    }
    
    public void method267(int arg0, int arg1, Class67_Sub11 arg2) {
	if (arg0 >= -14)
	    aLong649 = 115L;
	int i = arg1 >> 1223877605;
	anInt646++;
	Class67_Sub11 class67_sub11 = aClass67_Sub11Array682[i];
	if (class67_sub11 == null)
	    aClass67_Sub11Array685[i] = arg2;
	else
	    class67_sub11.aClass67_Sub11_3024 = arg2;
	aClass67_Sub11Array682[i] = arg2;
	arg2.anInt3025 = arg1;
    }
    
    public synchronized void method268(boolean arg0) {
	anInt663++;
	if (anIntArray651 != null) {
	    long l = Class39.method337(19644);
	    try {
		if (arg0 != false)
		    method258(-64);
		if ((aLong674 ^ 0xffffffffffffffffL) != -1L) {
		    if (l < aLong674)
			return;
		    method269(anInt675);
		    aBoolean678 = true;
		    aLong674 = 0L;
		}
		int i = method262();
		if (-i + anInt680 > anInt676)
		    anInt676 = -i + anInt680;
		int i_19_ = anInt683 - -anInt681;
		if (i_19_ + 256 > 16384)
		    i_19_ = 16128;
		if ((256 + i_19_ ^ 0xffffffff) < (anInt675 ^ 0xffffffff)) {
		    i = 0;
		    anInt675 += 1024;
		    if (anInt675 > 16384)
			anInt675 = 16384;
		    method275();
		    method269(anInt675);
		    aBoolean678 = true;
		    if ((i_19_ - -256 ^ 0xffffffff)
			< (anInt675 ^ 0xffffffff)) {
			i_19_ = -256 + anInt675;
			anInt681 = i_19_ - anInt683;
		    }
		}
		while ((i_19_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
		    method260(anIntArray651, 256);
		    i += 256;
		    method273();
		}
		if (l > aLong677) {
		    if (!aBoolean678) {
			if ((anInt676 ^ 0xffffffff) == -1
			    && (anInt684 ^ 0xffffffff) == -1) {
			    method275();
			    aLong674 = 2000L + l;
			    return;
			}
			anInt681 = Math.min(anInt684, anInt676);
			anInt684 = anInt676;
		    } else
			aBoolean678 = false;
		    aLong677 = 2000L + l;
		    anInt676 = 0;
		}
		anInt680 = i;
	    } catch (Exception exception) {
		method275();
		aLong674 = l + 2000L;
	    }
	    try {
		if ((aLong649 - -500000L ^ 0xffffffffffffffffL)
		    > (l ^ 0xffffffffffffffffL))
		    l = aLong649;
		for (/**/; 5000L + aLong649 < l;
		     aLong649 += (long) (256000 / Class89.anInt1833))
		    method261(-125, 256);
	    } catch (Exception exception) {
		aLong649 = l;
	    }
	}
    }
    
    public void method269(int arg0) throws Exception {
	anInt659++;
    }
    
    public synchronized void method270(int arg0) {
	if (arg0 <= 76)
	    method264(-64, -81, -17, 110, null);
	anInt668++;
	if (Class67_Sub5.aClass78_2865 != null) {
	    boolean bool = true;
	    for (int i = 0; i < 2; i++) {
		if (Class67_Sub5.aClass78_2865.aClass28Array1607[i] == this)
		    Class67_Sub5.aClass78_2865.aClass28Array1607[i] = null;
		if (Class67_Sub5.aClass78_2865.aClass28Array1607[i] != null)
		    bool = false;
	    }
	    if (bool) {
		Class67_Sub5.aClass78_2865.aBoolean1605 = true;
		while (Class67_Sub5.aClass78_2865.aBoolean1601)
		    Class67_Sub1_Sub23.method726(-127, 50L);
		Class67_Sub5.aClass78_2865 = null;
	    }
	}
	method275();
	anIntArray651 = null;
    }
    
    public static void method271(boolean arg0, boolean arg1) {
	anInt660++;
	if (arg0 == true) {
	    byte[][] is = Class67_Sub16.aByteArrayArray3087;
	    int i = Class67_Sub5_Sub11.aByteArrayArray4675.length;
	    for (int i_20_ = 0; i > i_20_; i_20_++) {
		byte[] is_21_ = is[i_20_];
		if (is_21_ != null) {
		    int i_22_
			= (64 * (Class108.anIntArray2083[i_20_] >> -1616374424)
			   + -Class58.baseX);
		    int i_23_
			= (-Class137.baseY
			   + (Class108.anIntArray2083[i_20_] & 0xff) * 64);
		    Class132.method1901(64);
		    Class56.method482((byte) -120, i_22_,
				      Class53.aClass73Array1059, is_21_, i_23_,
				      arg1);
		}
	    }
	}
    }
    
    public void method272(Component arg0) throws Exception {
	anInt656++;
    }
    
    public void method273() throws Exception {
	anInt669++;
    }
    
    public static void method274(int arg0) {
	aClass36Array666 = null;
	if (arg0 == 7) {
	    aRSString_653 = null;
	    aClient672 = null;
	    aRSString_655 = null;
	}
    }
    
    public void method275() {
	anInt670++;
    }
    
    public Class28() {
	aLong649 = Class39.method337(19644);
	aLong674 = 0L;
	aBoolean678 = true;
	anInt680 = 0;
	aClass67_Sub11Array682 = new Class67_Sub11[8];
	anInt684 = 0;
	aLong677 = 0L;
	anInt679 = 0;
	anInt676 = 0;
	aClass67_Sub11Array685 = new Class67_Sub11[8];
    }
    
    static {
	aRSString_653 = aRSString_655;
	anInt667 = 3;
    }
}
