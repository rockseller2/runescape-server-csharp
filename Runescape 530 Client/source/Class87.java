/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class87
{
    public int anInt1769;
    public int anInt1770 = -1;
    public static Class137 aClass137_1771;
    public int anInt1772;
    public static int anInt1773 = 0;
    public int anInt1774;
    public static int anInt1775;
    public static int anInt1776;
    public int anInt1777;
    public int anInt1778;
    public int anInt1779;
    public int anInt1780;
    public int anInt1781;
    public int anInt1782;
    public static byte[][][] aByteArrayArrayArray1783;
    public static int anInt1784;
    public static int anInt1785;
    public static int anInt1786;
    public int anInt1787;
    public int anInt1788;
    public int anInt1789;
    public int anInt1790;
    public int anInt1791;
    public int anInt1792;
    public int anInt1793;
    public int anInt1794;
    public int anInt1795;
    public int[][] anIntArrayArray1796;
    public int anInt1797;
    public static int anInt1798;
    public int anInt1799;
    public static int anInt1800;
    public static int anInt1801;
    public static BigInteger aBigInteger1802;
    public static RSString aRSString_1803;
    public int anInt1804;
    public static RSString aRSString_1805;
    public int anInt1806;
    public static RSString aRSString_1807;
    public static RSString aRSString_1808;
    public int anInt1809;
    public int anInt1810;
    public static RSString aRSString_1811;
    public int anInt1812;
    public static volatile int anInt1813;
    public static int anInt1814;
    
    public void method1459(Stream arg0, int arg1, int arg2) {
	if (arg1 == -19962) {
	    anInt1798++;
	    if ((arg2 ^ 0xffffffff) == -2) {
		anInt1797 = arg0.readUShort(-2386);
		anInt1794 = arg0.readUShort(-2386);
		if ((anInt1797 ^ 0xffffffff) == -65536)
		    anInt1797 = -1;
		if (anInt1794 == 65535)
		    anInt1794 = -1;
	    } else if (arg2 != 2) {
		if ((arg2 ^ 0xffffffff) == -4)
		    anInt1793 = arg0.readUShort(-2386);
		else if ((arg2 ^ 0xffffffff) != -5) {
		    if ((arg2 ^ 0xffffffff) == -6)
			anInt1789 = arg0.readUShort(-2386);
		    else if (arg2 == 6)
			anInt1812 = arg0.readUShort(-2386);
		    else if (arg2 != 7) {
			if ((arg2 ^ 0xffffffff) == -9)
			    anInt1806 = arg0.readUShort(-2386);
			else if (arg2 == 9)
			    anInt1782 = arg0.readUShort(arg1 + 17576);
			else if ((arg2 ^ 0xffffffff) != -27) {
			    if (arg2 == 27) {
				if (anIntArrayArray1796 == null)
				    anIntArrayArray1796 = new int[12][];
				int i = arg0.readByte((byte) 85);
				anIntArrayArray1796[i] = new int[6];
				for (int i_0_ = 0; i_0_ < 6; i_0_++)
				    anIntArrayArray1796[i][i_0_]
					= arg0.readShort2((byte) 76);
			    } else if (arg2 == 29)
				anInt1804 = arg0.readByte((byte) -59);
			    else if (arg2 == 30)
				anInt1774 = arg0.readUShort(-2386);
			    else if ((arg2 ^ 0xffffffff) != -32) {
				if (arg2 == 32)
				    anInt1772 = arg0.readUShort(-2386);
				else if (arg2 == 33)
				    anInt1780 = arg0.readShort2((byte) 105);
				else if (arg2 == 34)
				    anInt1809 = arg0.readByte((byte) -117);
				else if (arg2 != 35) {
				    if ((arg2 ^ 0xffffffff) != -37) {
					if ((arg2 ^ 0xffffffff) != -38) {
					    if (arg2 != 38) {
						if ((arg2 ^ 0xffffffff) == -40)
						    anInt1770
							= (arg0.readUShort
							   (-2386));
						else if (arg2 != 40) {
						    if ((arg2 ^ 0xffffffff)
							!= -42) {
							if (arg2 != 42) {
							    if (arg2 != 43) {
								if ((arg2
								     ^ 0xffffffff)
								    != -45) {
								    if (arg2
									== 45)
									arg0.readUShort
									    (-2386);
								} else
								    arg0.readUShort
									(-2386);
							    } else
								arg0.readUShort
								    (-2386);
							} else
							    anInt1781
								= (arg0.readUShort
								   (-2386));
						    } else
							anInt1779
							    = (arg0.readUShort
							       (arg1 + 17576));
						} else
						    anInt1777
							= (arg0.readUShort
							   (-2386));
					    } else
						anInt1810
						    = arg0.readUShort(-2386);
					} else
					    anInt1788
						= arg0.readByte((byte) 112);
				    } else
					anInt1792 = arg0.readShort2((byte) 69);
				} else
				    anInt1787 = arg0.readUShort(-2386);
			    } else
				anInt1799 = arg0.readByte((byte) -50);
			} else {
			    anInt1791
				= (short) (arg0.readByte((byte) -67) * 4);
			    anInt1778
				= (short) (4 * arg0.readByte((byte) -78));
			}
		    } else
			anInt1795 = arg0.readUShort(-2386);
		} else
		    anInt1769 = arg0.readUShort(-2386);
	    } else
		anInt1790 = arg0.readUShort(-2386);
	}
    }
    
    public void method1460(byte arg0) {
	anInt1786++;
	if (arg0 != -44)
	    anInt1812 = -102;
    }
    
    public static void method1461(byte arg0) {
	aRSString_1803 = null;
	if (arg0 <= 79)
	    anInt1800 = -92;
	aBigInteger1802 = null;
	aRSString_1811 = null;
	aRSString_1808 = null;
	aRSString_1805 = null;
	aRSString_1807 = null;
	aByteArrayArrayArray1783 = null;
	aClass137_1771 = null;
    }
    
    public static int method1462(int arg0, byte arg1) {
	anInt1775++;
	int i = -111 / ((1 - arg1) / 59);
	return 0xff & arg0;
    }
    
    public void method1463(Stream arg0, int arg1) {
	for (;;) {
	    int i = arg0.readByte((byte) 102);
	    if (i == 0)
		break;
	    method1459(arg0, -19962, i);
	}
	anInt1785++;
	if (arg1 != 0)
	    aClass137_1771 = null;
    }
    
    public static boolean method1464
	(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5,
	 int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
	anInt1784++;
	for (int i = 0; i < 104; i++) {
	    for (int i_1_ = 0; i_1_ < 104; i_1_++) {
		Class67_Sub5_Sub12.anIntArrayArray4694[i][i_1_] = 0;
		Class67_Sub22.anIntArrayArray3183[i][i_1_] = 99999999;
	    }
	}
	Class67_Sub5_Sub12.anIntArrayArray4694[arg10][arg6] = 99;
	Class67_Sub22.anIntArrayArray3183[arg10][arg6] = 0;
	int i = arg10;
	int i_2_ = arg6;
	int i_3_ = 0;
	int i_4_ = 0;
	boolean bool = false;
	Class90.anIntArray1849[i_3_] = arg10;
	Class126.anIntArray2345[i_3_++] = arg6;
	int[][] is = (Class53.aClass73Array1059[Canvas_Sub1.anInt59]
		      .anIntArrayArray1453);
	while (i_3_ != i_4_) {
	    i_2_ = Class126.anIntArray2345[i_4_];
	    i = Class90.anIntArray1849[i_4_];
	    i_4_ = 0xfff & i_4_ + 1;
	    if (arg8 == i && arg2 == i_2_) {
		bool = true;
		break;
	    }
	    if ((arg11 ^ 0xffffffff) != -1) {
		if ((arg11 ^ 0xffffffff) <= -6 && (arg11 ^ 0xffffffff) != -11
		    || !(Class53.aClass73Array1059[Canvas_Sub1.anInt59]
			     .method1361
			 (-1 + arg11, i, 1, arg8, -112, i_2_, arg2, arg7))) {
		    if (arg11 < 10 && (Class53.aClass73Array1059
					   [Canvas_Sub1.anInt59].method1368
				       (arg8, 1, arg11 - 1, (byte) 124, arg2,
					arg7, i, i_2_))) {
			bool = true;
			break;
		    }
		} else {
		    bool = true;
		    break;
		}
	    }
	    if ((arg4 ^ 0xffffffff) != -1 && arg1 != 0
		&& (Class53.aClass73Array1059[Canvas_Sub1.anInt59].method1370
		    (i, arg8, arg2, arg1, arg3, arg4, 25417, 1, i_2_))) {
		bool = true;
		break;
	    }
	    int i_5_ = Class67_Sub22.anIntArrayArray3183[i][i_2_] - -1;
	    if ((i ^ 0xffffffff) < -1
		&& (Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i][i_2_]
		    ^ 0xffffffff) == -1
		&& (is[-1 + i][i_2_] & 0x12c0108) == 0) {
		Class90.anIntArray1849[i_3_] = -1 + i;
		Class126.anIntArray2345[i_3_] = i_2_;
		Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i][i_2_] = 2;
		Class67_Sub22.anIntArrayArray3183[i - 1][i_2_] = i_5_;
		i_3_ = 0xfff & 1 + i_3_;
	    }
	    if ((i ^ 0xffffffff) > -104
		&& Class67_Sub5_Sub12.anIntArrayArray4694[i - -1][i_2_] == 0
		&& (0x12c0180 & is[i - -1][i_2_]) == 0) {
		Class90.anIntArray1849[i_3_] = 1 + i;
		Class126.anIntArray2345[i_3_] = i_2_;
		i_3_ = i_3_ - -1 & 0xfff;
		Class67_Sub5_Sub12.anIntArrayArray4694[i + 1][i_2_] = 8;
		Class67_Sub22.anIntArrayArray3183[1 + i][i_2_] = i_5_;
	    }
	    if (i_2_ > 0
		&& (Class67_Sub5_Sub12.anIntArrayArray4694[i][-1 + i_2_]
		    ^ 0xffffffff) == -1
		&& (0x12c0102 & is[i][i_2_ - 1]) == 0) {
		Class90.anIntArray1849[i_3_] = i;
		Class126.anIntArray2345[i_3_] = i_2_ - 1;
		i_3_ = 0xfff & 1 + i_3_;
		Class67_Sub5_Sub12.anIntArrayArray4694[i][-1 + i_2_] = 1;
		Class67_Sub22.anIntArrayArray3183[i][i_2_ + -1] = i_5_;
	    }
	    if (i_2_ < 103
		&& Class67_Sub5_Sub12.anIntArrayArray4694[i][1 + i_2_] == 0
		&& (is[i][1 + i_2_] & 0x12c0120 ^ 0xffffffff) == -1) {
		Class90.anIntArray1849[i_3_] = i;
		Class126.anIntArray2345[i_3_] = i_2_ + 1;
		Class67_Sub5_Sub12.anIntArrayArray4694[i][1 + i_2_] = 4;
		Class67_Sub22.anIntArrayArray3183[i][1 + i_2_] = i_5_;
		i_3_ = 0xfff & 1 + i_3_;
	    }
	    if ((i ^ 0xffffffff) < -1 && (i_2_ ^ 0xffffffff) < -1
		&& (Class67_Sub5_Sub12.anIntArrayArray4694[i + -1][i_2_ - 1]
		    ^ 0xffffffff) == -1
		&& (0x12c010e & is[i - 1][i_2_ + -1]) == 0
		&& (0x12c0108 & is[i - 1][i_2_] ^ 0xffffffff) == -1
		&& (0x12c0102 & is[i][i_2_ + -1] ^ 0xffffffff) == -1) {
		Class90.anIntArray1849[i_3_] = -1 + i;
		Class126.anIntArray2345[i_3_] = i_2_ + -1;
		Class67_Sub5_Sub12.anIntArrayArray4694[i - 1][i_2_ + -1] = 3;
		i_3_ = 0xfff & 1 + i_3_;
		Class67_Sub22.anIntArrayArray3183[i + -1][i_2_ + -1] = i_5_;
	    }
	    if (i < 103 && i_2_ > 0
		&& (Class67_Sub5_Sub12.anIntArrayArray4694[i - -1][-1 + i_2_]
		    == 0)
		&& (0x12c0183 & is[i + 1][i_2_ + -1]) == 0
		&& (is[i + 1][i_2_] & 0x12c0180) == 0
		&& (is[i][-1 + i_2_] & 0x12c0102 ^ 0xffffffff) == -1) {
		Class90.anIntArray1849[i_3_] = i + 1;
		Class126.anIntArray2345[i_3_] = i_2_ - 1;
		Class67_Sub5_Sub12.anIntArrayArray4694[i + 1][i_2_ - 1] = 9;
		Class67_Sub22.anIntArrayArray3183[i + 1][-1 + i_2_] = i_5_;
		i_3_ = 1 + i_3_ & 0xfff;
	    }
	    if (i > 0 && i_2_ < 103
		&& (Class67_Sub5_Sub12.anIntArrayArray4694[i + -1][i_2_ + 1]
		    == 0)
		&& (0x12c0138 & is[-1 + i][1 + i_2_]) == 0
		&& (0x12c0108 & is[-1 + i][i_2_] ^ 0xffffffff) == -1
		&& (0x12c0120 & is[i][1 + i_2_]) == 0) {
		Class90.anIntArray1849[i_3_] = i + -1;
		Class126.anIntArray2345[i_3_] = i_2_ - -1;
		i_3_ = 0xfff & i_3_ - -1;
		Class67_Sub5_Sub12.anIntArrayArray4694[-1 + i][1 + i_2_] = 6;
		Class67_Sub22.anIntArrayArray3183[-1 + i][1 + i_2_] = i_5_;
	    }
	    if (i < 103 && i_2_ < 103
		&& Class67_Sub5_Sub12.anIntArrayArray4694[i + 1][1 + i_2_] == 0
		&& (0x12c01e0 & is[1 + i][1 + i_2_] ^ 0xffffffff) == -1
		&& (is[i - -1][i_2_] & 0x12c0180 ^ 0xffffffff) == -1
		&& (is[i][i_2_ - -1] & 0x12c0120 ^ 0xffffffff) == -1) {
		Class90.anIntArray1849[i_3_] = 1 + i;
		Class126.anIntArray2345[i_3_] = i_2_ + 1;
		i_3_ = 0xfff & i_3_ + 1;
		Class67_Sub5_Sub12.anIntArrayArray4694[1 + i][1 + i_2_] = 12;
		Class67_Sub22.anIntArrayArray3183[i - -1][1 + i_2_] = i_5_;
	    }
	}
	Class10.anInt396 = 0;
	if (!bool) {
	    if (!arg5)
		return false;
	    int i_6_ = 100;
	    int i_7_ = 1000;
	    int i_8_ = 10;
	    for (int i_9_ = -i_8_ + arg8; arg8 - -i_8_ >= i_9_; i_9_++) {
		for (int i_10_ = arg2 - i_8_; i_8_ + arg2 >= i_10_; i_10_++) {
		    if (i_9_ >= 0 && i_10_ >= 0 && (i_9_ ^ 0xffffffff) > -105
			&& i_10_ < 104
			&& (Class67_Sub22.anIntArrayArray3183[i_9_][i_10_]
			    ^ 0xffffffff) > -101) {
			int i_11_ = 0;
			if (arg8 > i_9_)
			    i_11_ = -i_9_ + arg8;
			else if ((-1 + (arg8 - -arg4) ^ 0xffffffff)
				 > (i_9_ ^ 0xffffffff))
			    i_11_ = -arg4 + -arg8 - -1 + i_9_;
			int i_12_ = 0;
			if (arg2 > i_10_)
			    i_12_ = -i_10_ + arg2;
			else if ((arg1 + arg2 + -1 ^ 0xffffffff)
				 > (i_10_ ^ 0xffffffff))
			    i_12_ = 1 + -arg1 + (-arg2 + i_10_);
			int i_13_ = i_12_ * i_12_ + i_11_ * i_11_;
			if (i_13_ < i_7_
			    || ((i_7_ ^ 0xffffffff) == (i_13_ ^ 0xffffffff)
				&& ((Class67_Sub22.anIntArrayArray3183[i_9_]
				     [i_10_])
				    ^ 0xffffffff) > (i_6_ ^ 0xffffffff))) {
			    i = i_9_;
			    i_7_ = i_13_;
			    i_2_ = i_10_;
			    i_6_ = (Class67_Sub22.anIntArrayArray3183[i_9_]
				    [i_10_]);
			}
		    }
		}
	    }
	    if ((i_7_ ^ 0xffffffff) == -1001)
		return false;
	    if ((i ^ 0xffffffff) == (arg10 ^ 0xffffffff)
		&& (arg6 ^ 0xffffffff) == (i_2_ ^ 0xffffffff))
		return false;
	    Class10.anInt396 = 1;
	}
	i_4_ = 0;
	if (arg9 != 4)
	    anInt1800 = -86;
	Class90.anIntArray1849[i_4_] = i;
	Class126.anIntArray2345[i_4_++] = i_2_;
	int i_15_;
	int i_14_ = i_15_ = Class67_Sub5_Sub12.anIntArrayArray4694[i][i_2_];
	while ((i ^ 0xffffffff) != (arg10 ^ 0xffffffff) || i_2_ != arg6) {
	    if ((i_14_ ^ 0xffffffff) != (i_15_ ^ 0xffffffff)) {
		i_15_ = i_14_;
		Class90.anIntArray1849[i_4_] = i;
		Class126.anIntArray2345[i_4_++] = i_2_;
	    }
	    if ((i_14_ & 0x2 ^ 0xffffffff) == -1) {
		if ((i_14_ & 0x8) != 0)
		    i--;
	    } else
		i++;
	    if ((i_14_ & 0x1 ^ 0xffffffff) != -1)
		i_2_++;
	    else if ((0x4 & i_14_) != 0)
		i_2_--;
	    i_14_ = Class67_Sub5_Sub12.anIntArrayArray4694[i][i_2_];
	}
	if ((i_4_ ^ 0xffffffff) < -1) {
	    Class144.method1964(i_4_, -3, arg0);
	    return true;
	}
	if (arg0 == 1)
	    return false;
	return true;
    }
    
    public static void method1465(boolean arg0, RSString arg1, RSString arg2,
				  int arg3) {
	try {
	    if (arg0 == true) {
		Class66.method600(-1, arg1, null, arg3, -1, arg2);
		anInt1801++;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("mg.F(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	}
    }
    
    public Class87() {
	anInt1769 = -1;
	anInt1778 = 0;
	anInt1780 = 0;
	anInt1772 = 0;
	anInt1781 = -1;
	anInt1788 = -1;
	anInt1774 = 0;
	anInt1789 = -1;
	anInt1787 = 0;
	anInt1782 = -1;
	anInt1777 = -1;
	anInt1797 = -1;
	anInt1799 = 0;
	anInt1793 = -1;
	anInt1790 = -1;
	anInt1792 = 0;
	anInt1806 = -1;
	anInt1794 = -1;
	anInt1779 = -1;
	anInt1810 = -1;
	anInt1809 = 0;
	anInt1795 = -1;
	anInt1804 = 0;
	anInt1791 = 0;
	anInt1812 = -1;
    }
    
    static {
	aClass137_1771 = new Class137(64);
	aRSString_1807
	    = (Class134.method1914
	       ("Veuillez patienter )2 tentative de r-Btablissement)3",
		(byte) 62));
	aRSString_1805 = Class134.method1914("glow1:", (byte) 37);
	aRSString_1803 = aRSString_1805;
	aRSString_1811 = Class134.method1914("Annuler", (byte) 87);
	aRSString_1808 = aRSString_1805;
	aBigInteger1802
	    = (new BigInteger
	       ("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789"));
	anInt1813 = 0;
    }
}
