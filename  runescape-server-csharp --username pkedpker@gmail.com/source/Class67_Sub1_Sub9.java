/* Class67_Sub1_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class67_Sub1_Sub9 extends Class67_Sub1
{
    public int[] anIntArray3930;
    public static RSString aRSString_3931 = Class134.method1914("OK", (byte) 33);
    public static int anInt3932;
    public static int anInt3933;
    public static Class136 aClass136_3934;
    public int anInt3935;
    public int anInt3936 = 81;
    public int[][] anIntArrayArray3937;
    public int[][] anIntArrayArray3938;
    public int anInt3939;
    public int anInt3940;
    public static int anInt3941;
    public static RSString aRSString_3942;
    public static RSString[] aRSStringArray3943;
    public static RSString aRSString_3944
	= Class134.method1914("Moteur son pr-Bpar-B", (byte) 74);
    public int anInt3945 = 409;
    public int anInt3946;
    public static RSString aRSString_3947;
    public int anInt3948;
    public int anInt3949;
    public static int anInt3950;
    public static RSString aRSString_3951
	= Class134.method1914("Lade Wordpack )2 ", (byte) 36);
    public static int anInt3952;
    public int anInt3953;
    public static int anInt3954;
    public static int anInt3955;
    public static byte[][][] aByteArrayArrayArray3956;
    public int anInt3957;
    public static int[] anIntArray3958;
    public int anInt3959;
    public static int anInt3960;
    
    public static void method655(long arg0, int arg1) {
	try {
	    Class70_Sub1.outStream.currentOffset = 0;
	    anInt3950++;
	    Class70_Sub1.outStream.addByte((byte) 4, 186);
	    Class70_Sub1.outStream.writeLong(2, arg0);
	    Class67_Sub1_Sub6.anInt3886 = 0;
	    Class67_Sub26.anInt3277 = 1;
	    int i = 85 % ((-43 - arg1) / 54);
	    Class33_Sub2.anInt2774 = 0;
	    Class91.anInt1857 = -3;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("hh.D(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public Class67_Sub1_Sub9() {
	super(0, true);
	anInt3940 = 1024;
	anInt3939 = 204;
	anInt3953 = 8;
	anInt3946 = 4;
	anInt3957 = 1024;
	anInt3959 = 0;
    }
    
    public void method618(int arg0) {
	int i = -48 / ((arg0 - -60) / 62);
	method656((byte) 117);
	anInt3954++;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 == true) {
	    anInt3932++;
	    int i = arg2;
	while_41_:
	    do {
	    while_40_:
		do {
		while_39_:
		    do {
		    while_38_:
			do {
			while_37_:
			    do {
			    while_36_:
				do {
				    do {
					if ((i ^ 0xffffffff) != -1) {
					    if ((i ^ 0xffffffff) != -2) {
						if ((i ^ 0xffffffff) != -3) {
						    if ((i ^ 0xffffffff)
							!= -4) {
							if (i != 4) {
							    if ((i
								 ^ 0xffffffff)
								!= -6) {
								if ((i
								     ^ 0xffffffff)
								    != -7) {
								    if (i != 7)
									break while_41_;
								} else
								    break while_39_;
								break while_40_;
							    }
							} else
							    break while_37_;
							break while_38_;
						    }
						} else
						    break;
						break while_36_;
					    }
					} else {
					    anInt3946
						= arg0.readByte((byte) 101);
					    return;
					}
					anInt3953
					    = arg0.readByte((byte) -112);
					return;
				    } while (false);
				    anInt3945 = arg0.readUShort(-2386);
				    return;
				} while (false);
				anInt3939 = arg0.readUShort(-2386);
				return;
			    } while (false);
			    anInt3957 = arg0.readUShort(-2386);
			    return;
			} while (false);
			anInt3959 = arg0.readUShort(-2386);
			return;
		    } while (false);
		    anInt3936 = arg0.readUShort(-2386);
		    return;
		} while (false);
		anInt3940 = arg0.readUShort(-2386);
	    } while (false);
	}
    }
    
    public void method656(byte arg0) {
	anInt3955++;
	Random random = new Random((long) anInt3953);
	anIntArrayArray3937 = new int[anInt3953][anInt3946];
	anInt3949 = 4096 / anInt3953;
	anIntArray3930 = new int[anInt3953 - -1];
	anIntArray3930[0] = 0;
	int i = anInt3949 / 2;
	anInt3935 = anInt3936 / 2;
	anIntArrayArray3938 = new int[anInt3953][anInt3946 + 1];
	anInt3948 = 4096 / anInt3946;
	int i_0_ = anInt3948 / 2;
	int i_1_ = 0;
	if (arg0 != 117)
	    method656((byte) -51);
	for (/**/; (i_1_ ^ 0xffffffff) > (anInt3953 ^ 0xffffffff); i_1_++) {
	    if ((i_1_ ^ 0xffffffff) < -1) {
		int i_2_ = anInt3949;
		int i_3_
		    = ((Class67_Sub1_Sub37.method793(arg0 + -122, random, 4096)
			- 2048) * anInt3939
		       >> 164921100);
		i_2_ += i_3_ * i >> 819397228;
		anIntArray3930[i_1_] = anIntArray3930[i_1_ - 1] + i_2_;
	    }
	    anIntArrayArray3938[i_1_][0] = 0;
	    for (int i_4_ = 0; (anInt3946 ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
		 i_4_++) {
		if (i_4_ > 0) {
		    int i_5_ = anInt3948;
		    int i_6_
			= (((-2048
			     + Class67_Sub1_Sub37.method793(127, random, 4096))
			    * anInt3945)
			   >> -520809812);
		    i_5_ += i_0_ * i_6_ >> 1024761644;
		    anIntArrayArray3938[i_1_][i_4_]
			= anIntArrayArray3938[i_1_][-1 + i_4_] - -i_5_;
		}
		anIntArrayArray3937[i_1_][i_4_]
		    = ((anInt3940 ^ 0xffffffff) < -1
		       ? 4096 + -Class67_Sub1_Sub37.method793(115, random,
							      anInt3940)
		       : 4096);
	    }
	    anIntArrayArray3938[i_1_][anInt3946] = 4096;
	}
	anIntArray3930[anInt3953] = 4096;
    }
    
    public static void method657(int arg0) {
	int i = 126 % ((arg0 - -89) / 37);
	anIntArray3958 = null;
	aRSString_3942 = null;
	aRSString_3951 = null;
	aRSStringArray3943 = null;
	aRSString_3947 = null;
	aByteArrayArrayArray3956 = null;
	aRSString_3944 = null;
	aClass136_3934 = null;
	aRSString_3931 = null;
    }
    
    public int[] method611(int arg0, byte arg1) {
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int i = 0;
	    int i_7_;
	    for (i_7_ = anInt3959 + Class19.anIntArray490[arg0]; i_7_ < 0;
		 i_7_ += 4096) {
		/* empty */
	    }
	    for (/**/; i_7_ > 4096; i_7_ -= 4096) {
		/* empty */
	    }
	    for (/**/; anInt3953 > i; i++) {
		if ((i_7_ ^ 0xffffffff) > (anIntArray3930[i] ^ 0xffffffff))
		    break;
	    }
	    int i_8_ = i + -1;
	    boolean bool = (0x1 & i) == 0;
	    int i_9_ = anIntArray3930[i + -1];
	    int i_10_ = anIntArray3930[i];
	    if (anInt3935 + i_9_ >= i_7_
		|| (i_10_ - anInt3935 ^ 0xffffffff) >= (i_7_ ^ 0xffffffff))
		Class17.method184(is, 0, Class67_Sub5_Sub7.anInt4569, 0);
	    else {
		for (int i_11_ = 0; i_11_ < Class67_Sub5_Sub7.anInt4569;
		     i_11_++) {
		    int i_12_ = bool ? anInt3957 : -anInt3957;
		    int i_13_;
		    for (i_13_ = (Class67_Sub1_Sub35.anIntArray4344[i_11_]
				  + (anInt3948 * i_12_ >> -1264699540));
			 i_13_ < 0; i_13_ += 4096) {
			/* empty */
		    }
		    for (/**/; i_13_ > 4096; i_13_ -= 4096) {
			/* empty */
		    }
		    int i_14_;
		    for (i_14_ = 0; anInt3946 > i_14_; i_14_++) {
			if (anIntArrayArray3938[i_8_][i_14_] > i_13_)
			    break;
		    }
		    int i_15_ = anIntArrayArray3938[i_8_][i_14_];
		    int i_16_ = i_14_ + -1;
		    int i_17_ = anIntArrayArray3938[i_8_][i_16_];
		    if (i_13_ <= i_17_ + anInt3935
			|| i_15_ - anInt3935 <= i_13_)
			is[i_11_] = 0;
		    else
			is[i_11_] = anIntArrayArray3937[i_8_][i_16_];
		}
	    }
	}
	anInt3933++;
	if (arg1 != 55)
	    return null;
	return is;
    }
    
    static {
	aRSString_3947
	    = Class134.method1914("Forced tweening disabled)3", (byte) 20);
	anInt3952 = 0;
	aRSString_3942
	    = Class134.method1914("Suche nach Updates )2 ", (byte) 69);
	aClass136_3934 = new Class136(64);
    }
}
