/* Class67_Sub1_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub27 extends Class67_Sub1
{
    public static int anInt4237;
    public static boolean aBoolean4238 = false;
    public static int anInt4239;
    public static int anInt4240;
    public int anInt4241;
    public static Class9 aClass9_4242;
    public int anInt4243;
    public static int anInt4244;
    public int anInt4245 = 4096;
    public static int anInt4246;
    public static int anInt4247;
    public static Class9 aClass9_4248;
    
    public Class67_Sub1_Sub27() {
	super(1, false);
	anInt4243 = 4096;
	anInt4241 = 4096;
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	anInt4246++;
	if (arg0 != true)
	    method623(null, false, -100);
	int[][] is = aClass103_2830.method1551(arg1, 50);
	if (aClass103_2830.aBoolean2030) {
	    int[][] is_0_ = this.method609(arg1, false, 0);
	    int[] is_1_ = is_0_[0];
	    int[] is_2_ = is_0_[2];
	    int[] is_3_ = is[1];
	    int[] is_4_ = is[2];
	    int[] is_5_ = is[0];
	    int[] is_6_ = is_0_[1];
	    for (int i = 0; Class67_Sub5_Sub7.anInt4569 > i; i++) {
		int i_7_ = is_1_[i];
		int i_8_ = is_2_[i];
		int i_9_ = is_6_[i];
		if (i_7_ == i_8_
		    && (i_9_ ^ 0xffffffff) == (i_8_ ^ 0xffffffff)) {
		    is_5_[i] = i_7_ * anInt4243 >> -34753172;
		    is_3_[i] = anInt4241 * i_8_ >> -2042068692;
		    is_4_[i] = i_9_ * anInt4245 >> 1321954092;
		} else {
		    is_5_[i] = anInt4243;
		    is_3_[i] = anInt4241;
		    is_4_[i] = anInt4245;
		}
	    }
	}
	return is;
    }
    
    public static void method743(int arg0) {
	aClass9_4242 = null;
	aClass9_4248 = null;
	if (arg0 != 7288)
	    method745((byte) 10, null);
    }
    
    public static RSString method744(RSString[] arg0, int arg1) {
	anInt4237++;
	if ((arg0.length ^ 0xffffffff) > -3)
	    throw new IllegalArgumentException();
	if (arg1 > -90)
	    return null;
	return Class131.method1767(arg0.length, arg0, 0, (byte) -67);
    }
    
    public static int method745(byte arg0, Class131_Sub7_Sub1 arg1) {
	anInt4239++;
	Class64 class64 = arg1.aClass64_5047;
	if (class64.anIntArray1208 != null) {
	    class64 = class64.method578(-1);
	    if (class64 == null)
		return -1;
	}
	int i = class64.anInt1218;
	if (arg0 < 72)
	    aClass9_4242 = null;
	Class87 class87 = arg1.method1880((byte) -97);
	if (arg1.anInt3720 != class87.anInt1797) {
	    if ((arg1.anInt3720 ^ 0xffffffff) == (class87.anInt1812
						  ^ 0xffffffff)
		|| class87.anInt1795 == arg1.anInt3720
		|| arg1.anInt3720 == class87.anInt1782
		|| class87.anInt1806 == arg1.anInt3720)
		i = class64.anInt1236;
	    else if (arg1.anInt3720 == class87.anInt1790
		     || class87.anInt1793 == arg1.anInt3720
		     || (arg1.anInt3720 ^ 0xffffffff) == (class87.anInt1789
							  ^ 0xffffffff)
		     || arg1.anInt3720 == class87.anInt1769)
		i = class64.anInt1237;
	} else
	    i = class64.anInt1173;
	return i;
    }
    
    public static void method746(int arg0) {
	anInt4240++;
	int i = 0;
	for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -105; i_10_++) {
	    for (int i_11_ = 0; i_11_ < 104; i_11_++) {
		if (Class67_Sub5_Sub5.method865
		    (true, i_11_, (byte) 79, i,
		     Class76.aClass67_Sub24ArrayArrayArray1578, i_10_))
		    i++;
		if ((i ^ 0xffffffff) <= -513)
		    return;
	    }
	}
	if (arg0 < 62)
	    aBoolean4238 = false;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 == true) {
	    int i = arg2;
	while_150_:
	    do {
		do {
		    if ((i ^ 0xffffffff) != -1) {
			if ((i ^ 0xffffffff) != -2) {
			    if (i == 2)
				break;
			    break while_150_;
			}
		    } else {
			anInt4243 = arg0.readUShort(-2386);
			break while_150_;
		    }
		    anInt4241 = arg0.readUShort(-2386);
		    break while_150_;
		} while (false);
		anInt4245 = arg0.readUShort(-2386);
	    } while (false);
	    anInt4244++;
	}
    }
}
