/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98
{
    public static int anInt1941;
    public static RSString aRSString_1942
	= Class134.method1914("Kampfstufe: ", (byte) 28);
    public static int anInt1943;
    public int anInt1944;
    public static int anInt1945;
    public static int anInt1946;
    public static RSString aRSString_1947
	= Class134.method1914("showVideoAd", (byte) 66);
    public static int anInt1948;
    public int anInt1949;
    public int anInt1950;
    public static int anInt1951;
    public static RSString aRSString_1952
	= Class134.method1914("Textures charg-Bes", (byte) 109);
    public static int anInt1953;
    
    public static void method1511(byte arg0, byte[] arg1) {
	anInt1951++;
	Stream Stream = new Stream(arg1);
	Stream.currentOffset = arg1.length - 2;
	Class67_Sub15.anInt3067 = Stream.readUShort(-2386);
	Class67_Sub3.aBooleanArray2847 = new boolean[Class67_Sub15.anInt3067];
	Class67_Sub6.anIntArray2870 = new int[Class67_Sub15.anInt3067];
	Class55_Sub3.anIntArray2810 = new int[Class67_Sub15.anInt3067];
	Class120.aByteArrayArray2268 = new byte[Class67_Sub15.anInt3067][];
	Class67_Sub1_Sub35.aByteArrayArray4357
	    = new byte[Class67_Sub15.anInt3067][];
	Class67_Sub5_Sub4.anIntArray4510 = new int[Class67_Sub15.anInt3067];
	Class67_Sub23.anIntArray3201 = new int[Class67_Sub15.anInt3067];
	Stream.currentOffset
	    = -(Class67_Sub15.anInt3067 * 8) + arg1.length - 7;
	Class3.anInt119 = Stream.readUShort(-2386);
	Class80.anInt1628 = Stream.readUShort(-2386);
	int i = (Stream.readByte((byte) 92) & 0xff) - -1;
	for (int i_0_ = 0;
	     (Class67_Sub15.anInt3067 ^ 0xffffffff) < (i_0_ ^ 0xffffffff);
	     i_0_++)
	    Class67_Sub23.anIntArray3201[i_0_]
		= Stream.readUShort(-2386);
	for (int i_1_ = 0; Class67_Sub15.anInt3067 > i_1_; i_1_++)
	    Class67_Sub6.anIntArray2870[i_1_] = Stream.readUShort(-2386);
	for (int i_2_ = 0; Class67_Sub15.anInt3067 > i_2_; i_2_++)
	    Class55_Sub3.anIntArray2810[i_2_] = Stream.readUShort(-2386);
	for (int i_3_ = 0; i_3_ < Class67_Sub15.anInt3067; i_3_++)
	    Class67_Sub5_Sub4.anIntArray4510[i_3_]
		= Stream.readUShort(-2386);
	Stream.currentOffset = 3 + -(i * 3) + (-(8 * Class67_Sub15.anInt3067)
						 + (arg1.length + -7));
	Class73.anIntArray1462 = new int[i];
	for (int i_4_ = 1; i_4_ < i; i_4_++) {
	    Class73.anIntArray1462[i_4_] = Stream.readThreeBytes(65280);
	    if (Class73.anIntArray1462[i_4_] == 0)
		Class73.anIntArray1462[i_4_] = 1;
	}
	Stream.currentOffset = 0;
	for (int i_5_ = 0; Class67_Sub15.anInt3067 > i_5_; i_5_++) {
	    int i_6_ = Class55_Sub3.anIntArray2810[i_5_];
	    int i_7_ = Class67_Sub5_Sub4.anIntArray4510[i_5_];
	    int i_8_ = i_7_ * i_6_;
	    byte[] is = new byte[i_8_];
	    Class67_Sub1_Sub35.aByteArrayArray4357[i_5_] = is;
	    byte[] is_9_ = new byte[i_8_];
	    Class120.aByteArrayArray2268[i_5_] = is_9_;
	    int i_10_ = Stream.readByte((byte) -41);
	    boolean bool = false;
	    if ((i_10_ & 0x1) == 0) {
		for (int i_11_ = 0; i_11_ < i_8_; i_11_++)
		    is[i_11_] = Stream.readByte2((byte) 1);
		if ((0x2 & i_10_ ^ 0xffffffff) != -1) {
		    for (int i_12_ = 0;
			 (i_8_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
			byte i_13_
			    = is_9_[i_12_] = Stream.readByte2((byte) 1);
			bool = bool | i_13_ != -1;
		    }
		}
	    } else {
		for (int i_14_ = 0; i_14_ < i_6_; i_14_++) {
		    for (int i_15_ = 0; i_7_ > i_15_; i_15_++)
			is[i_14_ + i_6_ * i_15_]
			    = Stream.readByte2((byte) 1);
		}
		if ((0x2 & i_10_) != 0) {
		    for (int i_16_ = 0; i_6_ > i_16_; i_16_++) {
			for (int i_17_ = 0;
			     (i_17_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff);
			     i_17_++) {
			    byte i_18_ = (is_9_[i_16_ - -(i_6_ * i_17_)]
					  = Stream.readByte2((byte) 1));
			    bool = bool | i_18_ != -1;
			}
		    }
		}
	    }
	    Class67_Sub3.aBooleanArray2847[i_5_] = bool;
	}
	if (arg0 < 25)
	    aRSString_1952 = null;
    }
    
    public static void method1512(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	Class68 class68 = new Class68();
	class68.anInt1362 = arg1 / 128;
	class68.anInt1357 = arg2 / 128;
	class68.anInt1376 = arg3 / 128;
	class68.anInt1363 = arg4 / 128;
	class68.anInt1353 = arg0;
	class68.anInt1352 = arg1;
	class68.anInt1356 = arg2;
	class68.anInt1358 = arg3;
	class68.anInt1364 = arg4;
	class68.anInt1350 = arg5;
	class68.anInt1370 = arg6;
	Class83.aClass68Array1672[Class129_Sub1.anInt3501++] = class68;
    }
    
    public void method1513(Stream arg0, int arg1) {
	for (;;) {
	    int i = arg0.readByte((byte) -32);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method1517(arg0, (byte) 107, i);
	}
	if (arg1 != 16609)
	    method1512(102, -96, 125, 4, 109, -67, 68);
	anInt1953++;
    }
    
    public static void method1514(Stream arg0, int arg1) {
	anInt1946++;
	int i = Class20.anInt506 >> -1670535678 << 1965920906;
	int i_19_ = Class67_Sub20.anInt3155 >> -511049151;
	byte[][] is
	    = new byte[Class67_Sub1_Sub13.anInt4031][Class131_Sub5.anInt3656];
	while (arg0.currentOffset < arg0.buffer.length) {
	    boolean bool = false;
	    int i_20_ = 0;
	    int i_21_ = 0;
	    if (arg0.readByte((byte) 112) == 1) {
		bool = true;
		i_21_ = arg0.readByte((byte) 102);
		i_20_ = arg0.readByte((byte) -97);
	    }
	    int i_22_ = arg0.readByte((byte) 126);
	    int i_23_ = arg0.readByte((byte) -8);
	    int i_24_
		= (Class131_Sub5.anInt3656
		   + (-1 + -(64 * i_23_) + Class67_Sub1_Sub21.anInt4159));
	    int i_25_ = i_22_ * 64 - Class100.anInt1968;
	    if (i_25_ < 0 || (-63 + i_24_ ^ 0xffffffff) > -1
		|| ((Class67_Sub1_Sub13.anInt4031 ^ 0xffffffff)
		    >= (63 + i_25_ ^ 0xffffffff))
		|| Class131_Sub5.anInt3656 <= i_24_) {
		if (bool)
		    arg0.currentOffset += 64;
		else
		    arg0.currentOffset += 4096;
	    } else {
		for (int i_26_ = 0; i_26_ < 64; i_26_++) {
		    byte[] is_27_ = is[i_25_ + i_26_];
		    for (int i_28_ = 0; i_28_ < 64; i_28_++) {
			if (!bool || (i_26_ >= 8 * i_21_
				      && ((8 + i_21_ * 8 ^ 0xffffffff)
					  < (i_26_ ^ 0xffffffff))
				      && i_28_ >= 8 * i_20_
				      && i_28_ < 8 + i_20_ * 8))
			    is_27_[-i_28_ + i_24_] = arg0.readByte2((byte) 1);
		    }
		}
	    }
	}
	int i_29_ = Class67_Sub1_Sub13.anInt4031;
	int i_30_ = Class131_Sub5.anInt3656;
	int[] is_31_ = new int[i_30_];
	int[] is_32_ = new int[i_30_];
	int[] is_33_ = new int[i_30_];
	if (arg1 != 63)
	    aRSString_1952 = null;
	int[] is_34_ = new int[i_30_];
	int[] is_35_ = new int[i_30_];
	for (int i_36_ = -5; (i_29_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff);
	     i_36_++) {
	    for (int i_37_ = 0; i_30_ > i_37_; i_37_++) {
		int i_38_ = 5 + i_36_;
		if ((i_38_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff)) {
		    int i_39_ = 0xff & is[i_38_][i_37_];
		    if ((i_39_ ^ 0xffffffff) < -1) {
			Class113 class113
			    = Class62.method563((byte) 39, i_39_ - 1);
			is_31_[i_37_] += class113.anInt2126;
			is_33_[i_37_] += class113.anInt2125;
			is_32_[i_37_] += class113.anInt2136;
			is_34_[i_37_] += class113.anInt2134;
			is_35_[i_37_]++;
		    }
		}
		int i_40_ = i_36_ + -5;
		if (i_40_ >= 0) {
		    int i_41_ = 0xff & is[i_40_][i_37_];
		    if ((i_41_ ^ 0xffffffff) < -1) {
			Class113 class113
			    = Class62.method563((byte) 39, i_41_ + -1);
			is_31_[i_37_] -= class113.anInt2126;
			is_33_[i_37_] -= class113.anInt2125;
			is_32_[i_37_] -= class113.anInt2136;
			is_34_[i_37_] -= class113.anInt2134;
			is_35_[i_37_]--;
		    }
		}
	    }
	    if (i_36_ >= 0) {
		int[][] is_42_
		    = Class120.anIntArrayArrayArray2287[i_36_ >> -2004576154];
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = 0;
		int i_46_ = 0;
		int i_47_ = 0;
		for (int i_48_ = -5;
		     (i_30_ ^ 0xffffffff) < (i_48_ ^ 0xffffffff); i_48_++) {
		    int i_49_ = 5 + i_48_;
		    if (i_49_ < i_30_) {
			i_44_ += is_33_[i_49_];
			i_43_ += is_31_[i_49_];
			i_45_ += is_32_[i_49_];
			i_46_ += is_34_[i_49_];
			i_47_ += is_35_[i_49_];
		    }
		    int i_50_ = -5 + i_48_;
		    if ((i_50_ ^ 0xffffffff) <= -1) {
			i_43_ -= is_31_[i_50_];
			i_45_ -= is_32_[i_50_];
			i_47_ -= is_35_[i_50_];
			i_46_ -= is_34_[i_50_];
			i_44_ -= is_33_[i_50_];
		    }
		    if ((i_48_ ^ 0xffffffff) <= -1 && i_47_ > 0) {
			int[] is_51_ = is_42_[i_48_ >> -1137867290];
			int i_52_
			    = (i_46_ != 0
			       ? Class67_Sub17.method1246(i_43_ * 256 / i_46_,
							  i_45_ / i_47_,
							  -31863,
							  i_44_ / i_47_)
			       : 0);
			if (is[i_36_][i_48_] != 0) {
			    if (is_51_ == null)
				is_51_ = is_42_[i_48_ >> -1866155130]
				    = new int[4096];
			    int i_53_ = (i_52_ & 0x7f) + i_19_;
			    if ((i_53_ ^ 0xffffffff) > -1)
				i_53_ = 0;
			    else if (i_53_ > 127)
				i_53_ = 127;
			    int i_54_ = ((i + i_52_ & 0xfc00)
					 - (-(0x380 & i_52_) - i_53_));
			    is_51_[((Class75.method1379(i_48_, 63)
				     << 1835350758)
				    + Class75.method1379(63, i_36_))]
				= (Class26.anIntArray620
				   [Class67_Sub1_Sub24.method733(false, 96,
								 i_54_)]);
			} else if (is_51_ != null)
			    is_51_[(Class75.method1379(63, i_36_)
				    + Class75.method1379(4032,
							 i_48_ << 1640728038))]
				= 0;
		    }
		}
	    }
	}
    }
    
    public static void method1515(int arg0) {
	aRSString_1947 = null;
	if (arg0 >= -117)
	    method1515(28);
	aRSString_1952 = null;
	aRSString_1942 = null;
    }
    
    public static void method1516(byte arg0, int arg1) {
	anInt1945++;
	if (arg1 != -1 || Class57.aBoolean1106) {
	    if ((arg1 ^ 0xffffffff) != 0
		&& (Class27.anInt637 != arg1 || !Class89.method1468(0))
		&& Class67_Sub1_Sub29.anInt4259 != 0 && !Class57.aBoolean1106)
		Class49.method428(Class67_Sub1_Sub29.anInt4259, 2,
				  Class9.aClass9_362, false, 12672, arg1, 0);
	} else
	    Class83.method1439((byte) 117);
	if (arg0 > -67)
	    aRSString_1947 = null;
	Class27.anInt637 = arg1;
    }
    
    public void method1517(Stream arg0, byte arg1, int arg2) {
	if (arg1 != 107)
	    anInt1950 = -122;
	anInt1941++;
	if (arg2 == 1) {
	    anInt1950 = arg0.readUShort(-2386);
	    anInt1944 = arg0.readByte((byte) 109);
	    anInt1949 = arg0.readByte((byte) -9);
	}
    }
}
