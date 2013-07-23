/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class114
{
    public static Class9 aClass9_2148;
    public static int anInt2149;
    public static int anInt2150;
    public static int anInt2151;
    public static int anInt2152;
    public static int anInt2153;
    public static int anInt2154;
    public static Class67_Sub5_Sub6 aClass67_Sub5_Sub6_2155;
    public static int anInt2156;
    public static RSString aRSString_2157
	= Class134.method1914(")4p=", (byte) 37);
    public static Class9 aClass9_2158;
    public static RSString aRSString_2159
	= Class134.method1914("<)4col>", (byte) 107);
    public static int anInt2160;
    public static RSString aRSString_2161
	= Class134.method1914("Sprites geladen)3", (byte) 8);
    public static boolean aBoolean2162;
    
    public static void method1606(byte arg0) {
	anInt2150++;
	if (Class75.aBoolean2723) {
	    Class3.aClass119_121 = null;
	    Class6.aClass67_Sub5_Sub19_158 = null;
	    Class75.aBoolean2723 = false;
	    if (arg0 >= -31)
		method1610(-81);
	}
    }
    
    public static void method1607(int arg0, int arg1, int arg2,
				  Class131_Sub7_Sub2 arg3) {
	if (arg0 <= -13) {
	    if ((arg1 ^ 0xffffffff) == (arg3.anInt3735 ^ 0xffffffff)
		&& arg1 != -1) {
		Class41 class41 = Class120.method1666(arg1, -32);
		int i = class41.anInt850;
		if ((i ^ 0xffffffff) == -2) {
		    arg3.anInt3791 = 0;
		    arg3.anInt3783 = 0;
		    arg3.anInt3704 = 1;
		    arg3.anInt3792 = arg2;
		    arg3.anInt3741 = 0;
		    OutputStream_Sub1.method58(class41, arg3.anInt3726, -109,
					       arg3.anInt3733,
					       ((Class122
						 .aClass131_Sub7_Sub2_2309)
						== arg3),
					       arg3.anInt3783);
		}
		if ((i ^ 0xffffffff) == -3)
		    arg3.anInt3791 = 0;
	    } else if (arg1 == -1 || arg3.anInt3735 == -1
		       || (Class120.method1666(arg1, -32).anInt856
			   >= (Class120.method1666(arg3.anInt3735, -32)
			       .anInt856))) {
		arg3.anInt3791 = 0;
		arg3.anInt3741 = 0;
		arg3.anInt3792 = arg2;
		arg3.anInt3704 = 1;
		arg3.anInt3727 = arg3.anInt3713;
		arg3.anInt3735 = arg1;
		arg3.anInt3783 = 0;
		if (arg3.anInt3735 != -1)
		    OutputStream_Sub1.method58
			(Class120.method1666(arg3.anInt3735, -32),
			 arg3.anInt3726, -108, arg3.anInt3733,
			 arg3 == Class122.aClass131_Sub7_Sub2_2309,
			 arg3.anInt3783);
	    }
	    anInt2153++;
	}
    }
    
    public static Class119 method1608(byte arg0) {
	anInt2154++;
	Class119_Sub1 class119_sub1
	    = new Class119_Sub1(Class3.anInt119, Class80.anInt1628,
				Class67_Sub23.anIntArray3201[0],
				Class67_Sub6.anIntArray2870[0],
				Class55_Sub3.anIntArray2810[0],
				Class67_Sub5_Sub4.anIntArray4510[0],
				Class67_Sub1_Sub35.aByteArrayArray4357[0],
				Class73.anIntArray1462);
	Class67_Sub5_Sub11.method937(false);
	if (arg0 <= 118)
	    anInt2151 = -77;
	return class119_sub1;
    }
    
    public static void method1609(byte arg0, Class131_Sub7 arg1) {
	if (arg0 != 32)
	    method1607(-59, 122, -80, null);
	anInt2152++;
	if ((Class67_Sub1_Sub9.anInt3952 ^ 0xffffffff) == (arg1.anInt3734
							   ^ 0xffffffff)
	    || (arg1.anInt3735 ^ 0xffffffff) == 0 || arg1.anInt3792 != 0
	    || ((arg1.anInt3741 + 1 ^ 0xffffffff)
		< ((Class120.method1666(arg1.anInt3735, -32).anIntArray880
		    [arg1.anInt3783])
		   ^ 0xffffffff))) {
	    int i = -arg1.anInt3714 + Class67_Sub1_Sub9.anInt3952;
	    int i_0_ = -arg1.anInt3714 + arg1.anInt3734;
	    int i_1_
		= arg1.anInt3781 * 128 - -(64 * arg1.method1887((byte) -49));
	    int i_2_ = 128 * arg1.anInt3766 + arg1.method1887((byte) -34) * 64;
	    int i_3_
		= arg1.anInt3696 * 128 - -(arg1.method1887((byte) -70) * 64);
	    int i_4_ = arg1.anInt3718 * 128 + 64 * arg1.method1887((byte) -40);
	    arg1.anInt3733 = (i_1_ * (i_0_ - i) + i * i_3_) / i_0_;
	    arg1.anInt3726 = ((-i + i_0_) * i_2_ - -(i * i_4_)) / i_0_;
	}
	arg1.anInt3787 = 0;
	if (arg1.anInt3765 == 0)
	    arg1.anInt3721 = 1024;
	if (arg1.anInt3765 == 1)
	    arg1.anInt3721 = 1536;
	if ((arg1.anInt3765 ^ 0xffffffff) == -3)
	    arg1.anInt3721 = 0;
	if ((arg1.anInt3765 ^ 0xffffffff) == -4)
	    arg1.anInt3721 = 512;
	arg1.anInt3740 = arg1.anInt3721;
    }
    
    public static void method1610(int arg0) {
	aRSString_2157 = null;
	aClass9_2148 = null;
	aRSString_2159 = null;
	aClass67_Sub5_Sub6_2155 = null;
	aRSString_2161 = null;
	if (arg0 != -8317)
	    method1608((byte) -86);
	aClass9_2158 = null;
    }
    
    static {
	anInt2156 = 0;
	aBoolean2162 = false;
    }
}
