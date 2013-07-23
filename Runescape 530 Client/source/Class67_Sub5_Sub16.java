/* Class67_Sub5_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub16 extends Class67_Sub5
{
    public static int anInt4760;
    public static int anInt4761;
    public Class66 aClass66_4762;
    public static int anInt4763;
    public static Class137 aClass137_4764;
    public static int anInt4765;
    public boolean aBoolean4766;
    public static int anInt4767;
    public int anInt4768;
    public static RSString aRSString_4769
	= Class134.method1914("Konfig geladen)3", (byte) 16);
    public static int anInt4770;
    public float aFloat4771;
    public int[] anIntArray4772;
    public boolean aBoolean4773 = false;
    public boolean aBoolean4774;
    public static int anInt4775;
    public static int anInt4776 = -1;
    public int anInt4777;
    public static int anInt4778;
    public static RSString aRSString_4779;
    public static int anInt4780;
    public static RSString aRSString_4781;
    public static int anInt4782;
    public static boolean aBoolean4783;
    
    public boolean method982(Class9 arg0, byte arg1, Interface3 arg2) {
	try {
	    anInt4780++;
	    if (arg1 >= -34)
		method986(true, 97);
	    return aClass66_4762.method598(arg2, (byte) 115, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("qi.A("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static boolean method983(int arg0, int arg1) {
	int i = 96 % ((arg0 - 37) / 53);
	anInt4765++;
	if ((arg1 < 97 || arg1 > 122)
	    && ((arg1 ^ 0xffffffff) > -66 || (arg1 ^ 0xffffffff) < -91))
	    return false;
	return true;
    }
    
    public static void method984(int arg0) {
	aClass137_4764 = null;
	aRSString_4781 = null;
	aRSString_4779 = null;
	aRSString_4769 = null;
	if (arg0 != -22760)
	    aRSString_4781 = null;
    }
    
    public static void method985(Class67_Sub5 arg0, int arg1,
				 Class67_Sub5 arg2) {
	try {
	    if (arg1 != 1)
		anInt4782 = 37;
	    anInt4770++;
	    if (arg2.aClass67_Sub5_2867 != null)
		arg2.method821(24120);
	    arg2.aClass67_Sub5_2867 = arg0;
	    arg2.aClass67_Sub5_2861 = arg0.aClass67_Sub5_2861;
	    arg2.aClass67_Sub5_2867.aClass67_Sub5_2861 = arg2;
	    arg2.aClass67_Sub5_2861.aClass67_Sub5_2867 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("qi.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void finalize() throws Throwable {
	anInt4761++;
	super.finalize();
    }
    
    public void method986(boolean arg0, int arg1) {
	anInt4767++;
	if (arg0 == true && anIntArray4772 != null) {
	    if (anInt4768 != 0 || anInt4777 != 0) {
		if (Class67_Sub1_Sub18.anIntArray4107 == null
		    || ((Class67_Sub1_Sub18.anIntArray4107.length ^ 0xffffffff)
			> (anIntArray4772.length ^ 0xffffffff)))
		    Class67_Sub1_Sub18.anIntArray4107
			= new int[anIntArray4772.length];
		int i = anIntArray4772.length == 4096 ? 64 : 128;
		int i_0_ = anIntArray4772.length;
		int i_1_ = -1 + i;
		int i_2_ = anInt4777 * arg1;
		int i_3_ = i * (arg1 * anInt4768);
		int i_4_ = i_0_ - 1;
		for (int i_5_ = 0; (i_0_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff);
		     i_5_ += i) {
		    int i_6_ = i_3_ + i_5_ & i_4_;
		    for (int i_7_ = 0; (i ^ 0xffffffff) < (i_7_ ^ 0xffffffff);
			 i_7_++) {
			int i_8_ = i_5_ - -i_7_;
			int i_9_ = i_6_ - -(i_1_ & i_2_ + i_7_);
			Class67_Sub1_Sub18.anIntArray4107[i_8_]
			    = anIntArray4772[i_9_];
		    }
		}
		int[] is = anIntArray4772;
		anIntArray4772 = Class67_Sub1_Sub18.anIntArray4107;
		Class67_Sub1_Sub18.anIntArray4107 = is;
	    }
	}
    }
    
    public static void method987(byte arg0) {
	anInt4760++;
	int i = -38 / ((52 - arg0) / 56);
	Class96_Sub1.aClass136_3381.method1922(0);
    }
    
    public int[] method988(boolean arg0, byte arg1, Interface3 arg2,
			   Class9 arg3) {
	try {
	    anInt4775++;
	    if (!aClass66_4762.method598(arg2, (byte) 115, arg3))
		return null;
	    if (arg1 < 27)
		anInt4768 = -42;
	    int i = arg0 ? 64 : 128;
	    return aClass66_4762.method603(arg2, arg3, 71, aBoolean4766, i,
					   false, 1.0, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("qi.C(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public int[] method989(Class9 arg0, Interface3 arg1, int arg2, float arg3,
			   boolean arg4) {
	try {
	    anInt4763++;
	    if (anIntArray4772 == null || aFloat4771 != arg3) {
		if (!aClass66_4762.method598(arg1, (byte) 115, arg0))
		    return null;
		int i = arg4 ? 64 : 128;
		anIntArray4772
		    = aClass66_4762.method603(arg1, arg0, arg2 ^ ~0x781a,
					      aBoolean4766, i, true,
					      (double) arg3, i);
		aFloat4771 = arg3;
		if (aBoolean4774) {
		    int[] is = new int[i];
		    int[] is_10_ = new int[i];
		    int[] is_11_ = new int[i];
		    int[] is_12_ = new int[i * i];
		    int i_13_ = i;
		    int i_15_;
		    int i_14_ = i_15_ = i_13_;
		    int i_16_ = i;
		    int i_17_ = -1 + i_13_;
		    int i_18_ = i_16_ + -1;
		    int i_19_ = i_16_ * i_13_;
		    for (int i_20_ = 2; i_20_ >= 0; i_20_--) {
			for (int i_21_ = i_17_; i_21_ >= 0; i_21_--) {
			    int i_22_ = anIntArray4772[--i_15_];
			    is[i_21_] += (Class75.method1379(i_22_, 16751932)
					  >> 1657988944);
			    is_10_[i_21_] += (Class75.method1379(i_22_, 65307)
					      >> 2134278472);
			    is_11_[i_21_] += Class75.method1379(255, i_22_);
			}
			if (i_15_ == 0)
			    i_15_ = i_19_;
		    }
		    int i_23_ = i_19_;
		    for (int i_24_ = i_18_; i_24_ >= 0; i_24_--) {
			int i_25_ = 1;
			int i_26_ = 1;
			int i_28_;
			int i_29_;
			int i_27_ = i_28_ = i_29_ = 0;
			for (int i_30_ = 2; (i_30_ ^ 0xffffffff) <= -1;
			     i_30_--) {
			    i_25_--;
			    i_27_ += is[i_25_];
			    i_28_ += is_11_[i_25_];
			    i_29_ += is_10_[i_25_];
			    if (i_25_ == 0)
				i_25_ = i_13_;
			}
			for (int i_31_ = i_17_; i_31_ >= 0; i_31_--) {
			    int i_32_ = i_29_ / 9;
			    int i_33_ = i_28_ / 9;
			    int i_34_ = i_27_ / 9;
			    is_12_[--i_23_]
				= (Class67_Sub20.method1273
				   (Class67_Sub20.method1273((i_32_
							      << -1368686456),
							     (i_34_
							      << -403265424)),
				    i_33_));
			    i_26_--;
			    i_25_--;
			    i_27_ += -is[i_26_] + is[i_25_];
			    i_28_ += is_11_[i_25_] - is_11_[i_26_];
			    i_29_ += -is_10_[i_26_] + is_10_[i_25_];
			    if (i_25_ == 0)
				i_25_ = i_13_;
			    if ((i_26_ ^ 0xffffffff) == -1)
				i_26_ = i_13_;
			}
			for (int i_35_ = i_17_; i_35_ >= 0; i_35_--) {
			    int i_36_ = anIntArray4772[--i_14_];
			    int i_37_ = anIntArray4772[--i_15_];
			    is[i_35_]
				+= (-(Class75.method1379(16739253, i_36_)
				      >> -1199696)
				    + Class75.method1379(255,
							 i_37_ >> 380488272));
			    is_10_[i_35_]
				+= (Class75.method1379(i_37_ >> -838611928,
						       255)
				    - Class75.method1379(255,
							 i_36_ >> 294959432));
			    is_11_[i_35_]
				+= (-Class75.method1379(255, i_36_)
				    + Class75.method1379(i_37_, 255));
			}
			if (i_15_ == 0)
			    i_15_ = i_19_;
			if (i_14_ == 0)
			    i_14_ = i_19_;
		    }
		    anIntArray4772 = is_12_;
		}
	    }
	    if (arg2 != -30813)
		return null;
	    return anIntArray4772;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("qi.G("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public Class67_Sub5_Sub16(Stream arg0) {
	aClass66_4762 = new Class66(arg0);
	aBoolean4774 = (arg0.readByte((byte) -22) ^ 0xffffffff) == -2;
	aBoolean4766 = arg0.readByte((byte) -125) == 1;
	arg0.readByte((byte) -55);
	arg0.readByte((byte) 95);
	int i = 0x3 & arg0.readByte((byte) -40);
	anInt4777 = arg0.readByte2((byte) 1);
	anInt4768 = arg0.readByte2((byte) 1);
	arg0.readByte((byte) 93);
	arg0.readByte((byte) 79);
    }
    
    static {
	aClass137_4764 = new Class137(64);
	aRSString_4779 = Class134.method1914("Opened title screen", (byte) 94);
	aRSString_4781 = aRSString_4779;
	aBoolean4783 = false;
    }
}
