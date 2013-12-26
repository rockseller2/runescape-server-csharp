/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82
{
    public static RSString aRSString_1659;
    public static int anInt1660;
    public static Class136 aClass136_1661;
    public static RSString aRSString_1662
	= Class134.method1914("event_opbase", (byte) 26);
    public static int anInt1663;
    public static int[] anIntArray1664;
    public static RSString aRSString_1665;
    public static Class129_Sub1[] aClass129_Sub1Array1666;
    public static int[] anIntArray1667;
    public static int anInt1668;
    public static Login aLogin_1669;
    
    public static void method1432(SignLink arg0, Stream arg1, int arg2,
				  int arg3) {
	try {
	    anInt1663++;
	    Class67_Sub23 class67_sub23 = new Class67_Sub23();
	    class67_sub23.anInt3206 = arg1.readByte((byte) 104);
	    class67_sub23.anInt3204 = arg1.readInt((byte) 125);
	    class67_sub23.aClass31Array3192
		= new Class31[class67_sub23.anInt3206];
	    class67_sub23.aByteArrayArrayArray3197
		= new byte[class67_sub23.anInt3206][][];
	    class67_sub23.aClass31Array3198
		= new Class31[class67_sub23.anInt3206];
	    class67_sub23.anIntArray3193 = new int[class67_sub23.anInt3206];
	    class67_sub23.anIntArray3199 = new int[class67_sub23.anInt3206];
	    if (arg3 != 896)
		method1434(-113, -69, -114);
	    class67_sub23.anIntArray3194 = new int[class67_sub23.anInt3206];
	    for (int i = 0; i < class67_sub23.anInt3206; i++) {
		try {
		    int i_0_ = arg1.readByte((byte) 127);
		    if ((i_0_ ^ 0xffffffff) == -1 || i_0_ == 1
			|| (i_0_ ^ 0xffffffff) == -3) {
			String string
			    = new String(arg1.readRSString(arg3 ^ ~0x380)
					     .method518(false));
			int i_1_ = 0;
			String string_2_
			    = new String(arg1.readRSString(-1).method518(false));
			if ((i_0_ ^ 0xffffffff) == -2)
			    i_1_ = arg1.readInt((byte) 127);
			class67_sub23.anIntArray3199[i] = i_0_;
			class67_sub23.anIntArray3193[i] = i_1_;
			class67_sub23.aClass31Array3198[i]
			    = arg0.method401(Class67_Sub1_Sub1
						 .method625(10990, string),
					     string_2_, -26556);
		    } else if ((i_0_ ^ 0xffffffff) == -4
			       || (i_0_ ^ 0xffffffff) == -5) {
			String string
			    = new String(arg1.readRSString(-1).method518(false));
			String string_3_
			    = new String(arg1.readRSString(-1).method518(false));
			int i_4_ = arg1.readByte((byte) -89);
			String[] strings = new String[i_4_];
			for (int i_5_ = 0;
			     (i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_5_++)
			    strings[i_5_] = new String(arg1.readRSString(-1)
							   .method518(false));
			byte[][] is = new byte[i_4_][];
			if ((i_0_ ^ 0xffffffff) == -4) {
			    for (int i_6_ = 0; i_4_ > i_6_; i_6_++) {
				int i_7_ = arg1.readInt((byte) 126);
				is[i_6_] = new byte[i_7_];
				arg1.readBytes(i_7_, 0, -2, is[i_6_]);
			    }
			}
			class67_sub23.anIntArray3199[i] = i_0_;
			Class[] var_classes = new Class[i_4_];
			for (int i_8_ = 0;
			     (i_4_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++)
			    var_classes[i_8_]
				= Class67_Sub1_Sub1.method625(arg3 + 10094,
							      strings[i_8_]);
			class67_sub23.aClass31Array3192[i]
			    = arg0.method397(var_classes, -21828, string_3_,
					     (Class67_Sub1_Sub1.method625
					      (Class92.method1479(arg3, 10606),
					       string)));
			class67_sub23.aByteArrayArrayArray3197[i] = is;
		    }
		} catch (ClassNotFoundException classnotfoundexception) {
		    class67_sub23.anIntArray3194[i] = -1;
		} catch (SecurityException securityexception) {
		    class67_sub23.anIntArray3194[i] = -2;
		} catch (NullPointerException nullpointerexception) {
		    class67_sub23.anIntArray3194[i] = -3;
		} catch (Exception exception) {
		    class67_sub23.anIntArray3194[i] = -4;
		} catch (Throwable throwable) {
		    class67_sub23.anIntArray3194[i] = -5;
		}
	    }
	    Class30.aClass50_692.method436(class67_sub23, false);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("lj.C("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    public static void method1433(int arg0) {
	if (arg0 > -84)
	    anIntArray1667 = null;
	anIntArray1667 = null;
	aRSString_1665 = null;
	aClass136_1661 = null;
	aRSString_1659 = null;
	aRSString_1662 = null;
	aLogin_1669 = null;
	aClass129_Sub1Array1666 = null;
	anIntArray1664 = null;
    }
    
    public static void method1434(int arg0, int arg1, int arg2) {
	anInt1660++;
	if (arg2 > 116) {
	    for (int i = 0; Class67_Sub5_Sub2.anInt4473 > i; i++) {
		Class139 class139 = Class69.method1325(i, 8);
		if (class139 != null) {
		    int i_9_ = class139.anInt2535;
		    if ((i_9_ ^ 0xffffffff) <= -1
			&& !Class26.anInterface3_623.method8(0, i_9_))
			i_9_ = -1;
		    int i_10_;
		    if (class139.anInt2537 >= 0) {
			int i_11_ = class139.anInt2537;
			int i_12_ = (0x7f & i_11_) - -arg1;
			if ((i_12_ ^ 0xffffffff) <= -1) {
			    if ((i_12_ ^ 0xffffffff) < -128)
				i_12_ = 127;
			} else
			    i_12_ = 0;
			int i_13_ = ((arg0 + i_11_ & 0xfc00) - -(i_11_ & 0x380)
				     + i_12_);
			i_10_
			    = (Class26.anIntArray620
			       [Class67_Sub16.method1240(-24637, i_13_, 96)]);
		    } else if (i_9_ >= 0)
			i_10_ = (Class26.anIntArray620
				 [(Class67_Sub16.method1240
				   (-24637,
				    Class26.anInterface3_623
					.method12((byte) -124, i_9_),
				    96))]);
		    else if ((class139.anInt2531 ^ 0xffffffff) == 0)
			i_10_ = -1;
		    else {
			int i_14_ = class139.anInt2531;
			int i_15_ = arg1 + (0x7f & i_14_);
			if (i_15_ < 0)
			    i_15_ = 0;
			else if ((i_15_ ^ 0xffffffff) < -128)
			    i_15_ = 127;
			int i_16_ = ((i_14_ - -arg0 & 0xfc00) + (0x380 & i_14_)
				     + i_15_);
			i_10_
			    = (Class26.anIntArray620
			       [Class67_Sub16.method1240(-24637, i_16_, 96)]);
		    }
		    Class67_Sub1_Sub16_Sub1.anIntArray5098[i + 1] = i_10_;
		}
	    }
	}
    }
    
    static {
	aRSString_1659 = Class134.method1914("<img=1>", (byte) 46);
	anIntArray1664 = new int[5];
	aClass136_1661 = new Class136(500);
	aClass129_Sub1Array1666 = new Class129_Sub1[28];
	aRSString_1665 = Class134.method1914("<col=ff7000>", (byte) 64);
	anIntArray1667 = new int[] { 1, -1, -1, 1 };
    }
}
