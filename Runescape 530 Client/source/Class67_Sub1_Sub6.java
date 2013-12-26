/* Class67_Sub1_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub6 extends Class67_Sub1
{
    public int anInt3883 = 2048;
    public static int anInt3884;
    public static int anInt3885;
    public static int anInt3886 = 0;
    public static int[] anIntArray3887 = new int[14];
    public static int anInt3888;
    public int anInt3889;
    public static int anInt3890;
    public static int anInt3891;
    public int anInt3892 = 1024;
    public static int anInt3893;
    public static int anInt3894;
    public static RSString aRSString_3895 = null;
    
    public int[][] method624(boolean arg0, int arg1) {
	int[][] is = aClass103_2830.method1551(arg1, 127);
	if (arg0 != true)
	    method624(false, -28);
	if (aClass103_2830.aBoolean2030) {
	    int[][] is_0_ = this.method609(arg1, false, 0);
	    int[] is_1_ = is_0_[0];
	    int[] is_2_ = is_0_[1];
	    int[] is_3_ = is_0_[2];
	    int[] is_4_ = is[0];
	    int[] is_5_ = is[1];
	    int[] is_6_ = is[2];
	    for (int i = 0; i < Class67_Sub5_Sub7.anInt4569; i++) {
		is_4_[i] = (is_1_[i] * anInt3883 >> -919849556) + anInt3892;
		is_5_[i] = (anInt3883 * is_2_[i] >> 2104623212) + anInt3892;
		is_6_[i] = (anInt3883 * is_3_[i] >> 735947724) + anInt3892;
	    }
	}
	anInt3885++;
	return is;
    }
    
    public static void method642(int arg0) {
	anInt3893++;
	if (arg0 >= -64)
	    method642(99);
	Class67_Sub1_Sub9.aClass136_3934.method1921((byte) 47);
    }
    
    public static void method643(int arg0) {
	anIntArray3887 = null;
	if (arg0 <= 124)
	    method643(-11);
	aRSString_3895 = null;
    }
    
    public static void method644(boolean arg0) {
	anInt3890++;
	if (Class36.aClass7_769 == null
	    && Class67_Sub5_Sub12.aClass7_4699 == null) {
	    int i = Class100.anInt1975;
	    if (arg0 != false)
		method643(-87);
	    if (Class67_Sub9.aBoolean2980) {
		if ((i ^ 0xffffffff) != -2) {
		    int i_7_ = Class67_Sub5_Sub17.anInt4786;
		    int i_8_ = Class67_Sub1_Sub22.anInt4172;
		    if ((i_7_ ^ 0xffffffff) > (-10 + Class49.anInt1007
					       ^ 0xffffffff)
			|| (10 + (Class67_Sub16.anInt3084 + Class49.anInt1007)
			    < i_7_)
			|| Class53.anInt1066 + -10 > i_8_
			|| (client.anInt2733 + Class53.anInt1066 + 10
			    ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
			Class67_Sub9.aBoolean2980 = false;
			Class132.method1903(client.anInt2733,
					    Class49.anInt1007,
					    Class67_Sub16.anInt3084, 0,
					    Class53.anInt1066);
		    }
		}
		if ((i ^ 0xffffffff) == -2) {
		    int i_9_ = Class49.anInt1007;
		    int i_10_ = Class53.anInt1066;
		    int i_11_ = Class67_Sub16.anInt3084;
		    int i_12_ = Class115.anInt2186;
		    int i_13_ = Class101.anInt1985;
		    int i_14_ = -1;
		    for (int i_15_ = 0;
			 ((i_15_ ^ 0xffffffff)
			  > (Class134.anInt2476 ^ 0xffffffff));
			 i_15_++) {
			int i_16_;
			if (!Class36.aBoolean771)
			    i_16_ = (15 * (Class134.anInt2476 + (-1 + -i_15_))
				     + (i_10_ + 31));
			else
			    i_16_ = ((-i_15_ + Class134.anInt2476 - 1) * 15
				     + i_10_ - -35);
			if ((i_9_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff)
			    && i_12_ < i_9_ + i_11_
			    && (i_13_ ^ 0xffffffff) < (i_16_ + -13
						       ^ 0xffffffff)
			    && (i_13_ ^ 0xffffffff) > (3 + i_16_ ^ 0xffffffff))
			    i_14_ = i_15_;
		    }
		    if ((i_14_ ^ 0xffffffff) != 0)
			Class67_Sub1_Sub2.method630(2, i_14_);
		    Class67_Sub9.aBoolean2980 = false;
		    Class132.method1903(client.anInt2733, Class49.anInt1007,
					Class67_Sub16.anInt3084, 0,
					Class53.anInt1066);
		}
	    } else {
		if ((i ^ 0xffffffff) == -2 && Class134.anInt2476 > 0) {
		    short i_17_
			= Applet_Sub1.aShortArray21[Class134.anInt2476 + -1];
		    if ((i_17_ ^ 0xffffffff) == -43 || i_17_ == 50
			|| i_17_ == 37 || (i_17_ ^ 0xffffffff) == -2
			|| (i_17_ ^ 0xffffffff) == -3
			|| (i_17_ ^ 0xffffffff) == -31
			|| (i_17_ ^ 0xffffffff) == -19
			|| (i_17_ ^ 0xffffffff) == -45
			|| (i_17_ ^ 0xffffffff) == -27
			|| (i_17_ ^ 0xffffffff) == -24 || i_17_ == 12
			|| i_17_ == 1005) {
			int i_18_ = (Class131_Sub5.anIntArray3667
				     [Class134.anInt2476 + -1]);
			int i_19_
			    = Class88.anIntArray1822[-1 + Class134.anInt2476];
			Class7 class7 = Class3.method69((byte) 110, i_18_);
			Class67_Sub14 class67_sub14 = client.method31(class7);
			if (class67_sub14.method1227(-23)
			    || class67_sub14.method1234((byte) -88)) {
			    Class40.anInt815 = 0;
			    Class122.aBoolean2305 = false;
			    if (Class36.aClass7_769 != null)
				Class37.method326(Class36.aClass7_769, 96);
			    Class36.aClass7_769
				= Class3.method69((byte) 110, i_18_);
			    Class137.anInt2521 = i_19_;
			    Class33_Sub2.anInt2779 = Class115.anInt2186;
			    Class67_Sub1_Sub2.anInt3834 = Class101.anInt1985;
			    Class37.method326(Class36.aClass7_769, 127);
			    return;
			}
		    }
		}
		if ((i ^ 0xffffffff) == -2
		    && ((Class23.anInt569 == 1
			 && (Class134.anInt2476 ^ 0xffffffff) < -3)
			|| Class111.method1591(Class134.anInt2476 - 1,
					       (byte) -53)))
		    i = 2;
		if (i == 2 && (Class134.anInt2476 ^ 0xffffffff) < -1
		    || Class104.anInt2041 == 1)
		    Class43.method383(-116);
		if (i == 1 && (Class134.anInt2476 ^ 0xffffffff) < -1
		    || Class104.anInt2041 == 2)
		    Class67_Sub23.method1288(117);
	    }
	}
    }
    
    public void method618(int arg0) {
	anInt3883 = anInt3889 - anInt3892;
	anInt3894++;
	int i = -88 % ((-60 - arg0) / 62);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt3891++;
	if (arg1 == true) {
	    int i = arg2;
	while_25_:
	    do {
		do {
		    if (i != 0) {
			if ((i ^ 0xffffffff) != -2) {
			    if ((i ^ 0xffffffff) == -3)
				break;
			    break while_25_;
			}
		    } else {
			anInt3892 = arg0.readUShort(-2386);
			return;
		    }
		    anInt3889 = arg0.readUShort(-2386);
		    return;
		} while (false);
		aBoolean2839 = arg0.readByte((byte) 105) == 1;
	    } while (false);
	}
    }
    
    public int[] method611(int arg0, byte arg1) {
	if (arg1 != 55)
	    anInt3883 = 104;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int[] is_20_ = this.method613(0, arg0, false);
	    for (int i = 0; Class67_Sub5_Sub7.anInt4569 > i; i++)
		is[i] = (anInt3883 * is_20_[i] >> -1076768276) + anInt3892;
	}
	anInt3888++;
	return is;
    }
    
    public Class67_Sub1_Sub6() {
	super(1, false);
	anInt3889 = 3072;
    }
}
