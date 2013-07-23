/* Class67_Sub1_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub10 extends Class67_Sub1
{
    public static int anInt3961;
    public static int anInt3962;
    public int anInt3963;
    public static int anInt3964;
    public int anInt3965;
    public static int anInt3966;
    public static RSString aRSString_3967;
    public static RSString aRSString_3968
	= Class134.method1914("Loaded wordpack", (byte) 7);
    public static int anInt3969;
    public static RSString aRSString_3970;
    public static int anInt3971;
    public static RSString aRSString_3972;
    public int anInt3973;
    public int anInt3974;
    public int anInt3975;
    public int anInt3976 = 12288;
    public static short aShort3977 = 256;
    public int anInt3978;
    public static int anInt3979;
    public static int anInt3980;
    public static RSString aRSString_3981;
    public static int anInt3982;
    public static byte[][][] aByteArrayArrayArray3983;
    
    public static void method658(int arg0, byte arg1) {
	Class57.anInt1111 = 0;
	Class67_Sub1_Sub18.aClass9_4111 = null;
	Class95.anInt1908 = -1;
	Class19.anInt489 = -1;
	anInt3982++;
	Class86.aBoolean1753 = false;
	Class67_Sub11_Sub4.anInt4888 = 1;
	Class67_Sub24.anInt3238 = arg0;
	int i = 52 / ((arg1 - -18) / 54);
    }
    
    public void method618(int arg0) {
	int i = 84 % ((arg0 - -60) / 62);
	Class67_Sub1_Sub7.method645(-106);
	anInt3969++;
    }
    
    public boolean method659(int arg0, int arg1, int arg2) {
	anInt3979++;
	int i = (-arg2 + arg1) * anInt3976 >> -824336564;
	int i_0_ = Class67_Sub3.anIntArray2845[i * arg0 >> 1770036204 & 0xff];
	i_0_ = (i_0_ << 1464124652) / anInt3976;
	i_0_ = (i_0_ << -1161460084) / anInt3963;
	i_0_ = i_0_ * anInt3965 >> 134414252;
	if (i_0_ <= arg2 - -arg1
	    || (arg1 + arg2 ^ 0xffffffff) >= (-i_0_ ^ 0xffffffff))
	    return false;
	return true;
    }
    
    public static void method660(int arg0) {
	anInt3980++;
	if (arg0 != -1)
	    method663(-1);
	Class18.aClass136_2730.method1921((byte) 37);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 != true)
	    method663(47);
	int i = arg2;
    while_53_:
	do {
	while_52_:
	    do {
	    while_51_:
		do {
		while_50_:
		    do {
		    while_49_:
			do {
			    do {
				if ((i ^ 0xffffffff) != -1) {
				    if ((i ^ 0xffffffff) != -2) {
					if ((i ^ 0xffffffff) != -3) {
					    if (i != 3) {
						if (i != 4) {
						    if (i != 5) {
							if ((i ^ 0xffffffff)
							    == -7)
							    break while_52_;
							break while_53_;
						    }
						} else
						    break while_50_;
						break while_51_;
					    }
					} else
					    break;
					break while_49_;
				    }
				} else {
				    anInt3973 = arg0.readUShort(-2386);
				    break while_53_;
				}
				anInt3975 = arg0.readUShort(-2386);
				break while_53_;
			    } while (false);
			    anInt3978 = arg0.readUShort(-2386);
			    break while_53_;
			} while (false);
			anInt3974 = arg0.readUShort(-2386);
			break while_53_;
		    } while (false);
		    anInt3976 = arg0.readUShort(-2386);
		    break while_53_;
		} while (false);
		anInt3965 = arg0.readUShort(-2386);
		break while_53_;
	    } while (false);
	    anInt3963 = arg0.readUShort(-2386);
	} while (false);
	anInt3964++;
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt3966++;
	if (arg1 != 55)
	    method662(-11, -50, -27);
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int i = Class19.anIntArray490[arg0] + -2048;
	    for (int i_1_ = 0;
		 ((i_1_ ^ 0xffffffff)
		  > (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff));
		 i_1_++) {
		int i_2_ = -2048 + Class67_Sub1_Sub35.anIntArray4344[i_1_];
		int i_3_ = anInt3975 + i;
		int i_4_ = anInt3978 + i_2_;
		i_3_ = i_3_ < -2048 ? 4096 + i_3_ : i_3_;
		int i_5_ = anInt3973 + i_2_;
		i_5_ = i_5_ >= -2048 ? i_5_ : 4096 + i_5_;
		i_4_ = i_4_ >= -2048 ? i_4_ : i_4_ - -4096;
		int i_6_ = anInt3974 + i;
		i_5_ = (i_5_ ^ 0xffffffff) >= -2049 ? i_5_ : -4096 + i_5_;
		i_4_ = (i_4_ ^ 0xffffffff) >= -2049 ? i_4_ : -4096 + i_4_;
		i_3_ = i_3_ > 2048 ? i_3_ - 4096 : i_3_;
		i_6_ = (i_6_ ^ 0xffffffff) <= 2047 ? i_6_ : 4096 + i_6_;
		i_6_ = i_6_ <= 2048 ? i_6_ : -4096 + i_6_;
		is[i_1_]
		    = (method659(255, i_3_, i_5_) || method662(0, i_6_, i_4_)
		       ? 4096 : 0);
	    }
	}
	return is;
    }
    
    public static Class67_Sub5_Sub13 method661(byte arg0, int arg1) {
	int i = 49 % ((60 - arg0) / 34);
	anInt3961++;
	Class67_Sub5_Sub13 class67_sub5_sub13
	    = ((Class67_Sub5_Sub13)
	       Class67_Sub1_Sub28.aClass137_4252.method1930(261775,
							    (long) arg1));
	if (class67_sub5_sub13 != null)
	    return class67_sub5_sub13;
	byte[] is;
	if ((arg1 ^ 0xffffffff) > -32769)
	    is = Class67_Sub1_Sub17.aClass9_4091.method138(-809612665, arg1,
							   0);
	else
	    is = Class67_Sub1_Sub8.aClass9_3923.method138(-809612665,
							  arg1 & 0x7fff, 0);
	class67_sub5_sub13 = new Class67_Sub5_Sub13();
	if (is != null)
	    class67_sub5_sub13.method962(71, new Stream(is));
	if ((arg1 ^ 0xffffffff) <= -32769)
	    class67_sub5_sub13.method956(-24414);
	Class67_Sub1_Sub28.aClass137_4252.method1932((long) arg1, 0,
						     class67_sub5_sub13);
	return class67_sub5_sub13;
    }
    
    public boolean method662(int arg0, int arg1, int arg2) {
	int i = anInt3976 * (arg1 - -arg2) >> -910585076;
	int i_7_
	    = Class67_Sub3.anIntArray2845[(0xff96b & 255 * i) >> 260386796];
	i_7_ = (i_7_ << 1810993676) / anInt3976;
	anInt3962++;
	i_7_ = (i_7_ << -591953012) / anInt3963;
	if (arg0 != 0)
	    return false;
	i_7_ = anInt3965 * i_7_ >> 979577036;
	if (-arg2 + arg1 >= i_7_ || -arg2 + arg1 <= -i_7_)
	    return false;
	return true;
    }
    
    public static void method663(int arg0) {
	if (arg0 != 9000)
	    method660(61);
	aByteArrayArrayArray3983 = null;
	aRSString_3981 = null;
	aRSString_3970 = null;
	aRSString_3972 = null;
	aRSString_3968 = null;
	aRSString_3967 = null;
    }
    
    public Class67_Sub1_Sub10() {
	super(0, true);
	anInt3963 = 8192;
	anInt3975 = 0;
	anInt3973 = 2048;
	anInt3978 = 0;
	anInt3965 = 4096;
	anInt3974 = 2048;
    }
    
    static {
	aRSString_3972 = Class134.method1914(":assist:", (byte) 21);
	aRSString_3970 = aRSString_3968;
	aRSString_3967
	    = Class134.method1914("Zugewiesener Speicher)3", (byte) 15);
	aRSString_3981 = Class134.method1914("Hierhin drehen", (byte) 29);
    }
}
