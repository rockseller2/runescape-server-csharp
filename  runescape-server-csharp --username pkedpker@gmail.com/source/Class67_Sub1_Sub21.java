/* Class67_Sub1_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub21 extends Class67_Sub1
{
    public static short aShort4157 = 1;
    public static int loginStep;
    public static int anInt4159;
    public static int anInt4160;
    public static int anInt4161;
    public static int anInt4162;
    public static int anInt4163;
    public static int[] anIntArray4164 = new int[2000];
    public static int anInt4165;
    public int anInt4166 = 585;
    public static int anInt4167;
    public static RSString aRSString_4168;
    
    public int[] method611(int arg0, byte arg1) {
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int i = Class19.anIntArray490[arg0];
	    for (int i_0_ = 0; ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
				< (i_0_ ^ 0xffffffff)); i_0_++) {
		int i_1_ = Class67_Sub1_Sub35.anIntArray4344[i_0_];
		if (anInt4166 < i_1_
		    && (i_1_ ^ 0xffffffff) > (4096 - anInt4166 ^ 0xffffffff)
		    && -anInt4166 + 2048 < i && i < anInt4166 + 2048) {
		    int i_2_ = 2048 - i_1_;
		    i_2_ = i_2_ >= 0 ? i_2_ : -i_2_;
		    i_2_ <<= 12;
		    i_2_ /= -anInt4166 + 2048;
		    is[i_0_] = 4096 - i_2_;
		} else if (i_1_ > -anInt4166 + 2048
			   && ((2048 + anInt4166 ^ 0xffffffff)
			       < (i_1_ ^ 0xffffffff))) {
		    int i_3_ = -2048 + i;
		    i_3_ = i_3_ < 0 ? -i_3_ : i_3_;
		    i_3_ -= anInt4166;
		    i_3_ <<= 12;
		    is[i_0_] = i_3_ / (2048 + -anInt4166);
		} else if ((i ^ 0xffffffff) > (anInt4166 ^ 0xffffffff)
			   || ((-anInt4166 + 4096 ^ 0xffffffff)
			       > (i ^ 0xffffffff))) {
		    int i_4_ = i_1_ - 2048;
		    i_4_ = i_4_ < 0 ? -i_4_ : i_4_;
		    i_4_ -= anInt4166;
		    i_4_ <<= 12;
		    is[i_0_] = i_4_ / (-anInt4166 + 2048);
		} else if ((anInt4166 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)
			   || (i_1_ ^ 0xffffffff) < (-anInt4166 + 4096
						     ^ 0xffffffff)) {
		    int i_5_ = 2048 + -i;
		    i_5_ = (i_5_ ^ 0xffffffff) <= -1 ? i_5_ : -i_5_;
		    i_5_ <<= 12;
		    i_5_ /= 2048 + -anInt4166;
		    is[i_0_] = -i_5_ + 4096;
		} else
		    is[i_0_] = 0;
	    }
	}
	anInt4161++;
	if (arg1 != 55)
	    aShort4157 = (short) 32;
	return is;
    }
    
    public static void method716(Class9 arg0, int arg1) {
	anInt4160++;
	Class62.aClass119_Sub1Array1148
	    = Class67_Sub15.method1239(arg0, -110, Class142.anInt2570);
	Class67_Sub26.anIntArray3273 = new int[256];
	for (int i = arg1; (i ^ 0xffffffff) > -4; i++) {
	    int i_6_ = ((0xff0000 & Class67_Sub1_Sub28.anIntArray4251[i - -1])
			>> -592566320);
	    float f
		= (float) ((Class67_Sub1_Sub28.anIntArray4251[i] & 0xff0000)
			   >> -1197004688);
	    float f_7_ = ((float) i_6_ - f) / 64.0F;
	    float f_8_
		= (float) ((0xff00 & Class67_Sub1_Sub28.anIntArray4251[i])
			   >> 1742815400);
	    int i_9_ = ((Class67_Sub1_Sub28.anIntArray4251[i + 1] & 0xff00)
			>> 1117480872);
	    float f_10_ = ((float) i_9_ - f_8_) / 64.0F;
	    float f_11_
		= (float) (0xff & Class67_Sub1_Sub28.anIntArray4251[i]);
	    int i_12_ = 0xff & Class67_Sub1_Sub28.anIntArray4251[i + 1];
	    float f_13_ = (-f_11_ + (float) i_12_) / 64.0F;
	    for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -65; i_14_++) {
		Class67_Sub26.anIntArray3273[i_14_ + i * 64]
		    = (Class67_Sub20.method1273
		       ((int) f_11_,
			Class67_Sub20.method1273((int) f_8_ << -396507160,
						 (int) f << 1120534832)));
		f_8_ += f_10_;
		f_11_ += f_13_;
		f += f_7_;
	    }
	}
	for (int i = 192; (i ^ 0xffffffff) > -256; i++)
	    Class67_Sub26.anIntArray3273[i]
		= Class67_Sub1_Sub28.anIntArray4251[3];
	Class109.anIntArray2090 = new int[32768];
	Class43.anIntArray897 = new int[32768];
	Class16.method172(-48, null);
	Class67_Sub23.anIntArray3210 = new int[32768];
	Class34.anIntArray746 = new int[32768];
	Class130.aClass67_Sub5_Sub19_Sub1_2409
	    = new Class67_Sub5_Sub19_Sub1(128, 254);
    }
    
    public static void method717(int arg0) {
	aRSString_4168 = null;
	if (arg0 != 2823)
	    loginStep = -99;
	anIntArray4164 = null;
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	anInt4163++;
	if (arg1 != true)
	    method716(null, -62);
	int i = arg2;
	if ((i ^ 0xffffffff) == -1)
	    anInt4166 = arg0.readUShort(-2386);
    }
    
    public Class67_Sub1_Sub21() {
	super(0, true);
    }
    
    public static RuntimeException_Sub1 method718(Throwable arg0,
						  String arg1) {
	anInt4167++;
	RuntimeException_Sub1 runtimeexception_sub1;
	if (!(arg0 instanceof RuntimeException_Sub1))
	    runtimeexception_sub1 = new RuntimeException_Sub1(arg0, arg1);
	else {
	    runtimeexception_sub1 = (RuntimeException_Sub1) arg0;
	    runtimeexception_sub1.aString2624 += ' ' + (String) arg1;
	}
	return runtimeexception_sub1;
    }
    
    public static void method719(byte arg0) {
	anInt4162++;
	for (Class67_Sub6 class67_sub6 = (Class67_Sub6) Class67_Sub1_Sub39
							    .aClass50_4441
							    .method445(0);
	     class67_sub6 != null;
	     class67_sub6 = ((Class67_Sub6)
			     Class67_Sub1_Sub39.aClass50_4441.method432(0))) {
	    if ((class67_sub6.anInt2869 ^ 0xffffffff) < -1)
		class67_sub6.anInt2869--;
	    if ((class67_sub6.anInt2869 ^ 0xffffffff) != -1) {
		if ((class67_sub6.anInt2883 ^ 0xffffffff) < -1)
		    class67_sub6.anInt2883--;
		if ((class67_sub6.anInt2883 ^ 0xffffffff) == -1
		    && class67_sub6.anInt2874 >= 1
		    && (class67_sub6.anInt2891 ^ 0xffffffff) <= -2
		    && (class67_sub6.anInt2874 ^ 0xffffffff) >= -103
		    && (class67_sub6.anInt2891 ^ 0xffffffff) >= -103
		    && ((class67_sub6.anInt2889 ^ 0xffffffff) > -1
			|| Class12.method150(class67_sub6.anInt2889, 67,
					     class67_sub6.anInt2880))) {
		    Class67_Sub1_Sub20.method715(class67_sub6.anInt2880,
						 class67_sub6.anInt2871,
						 class67_sub6.anInt2889,
						 (byte) -26,
						 class67_sub6.anInt2877,
						 class67_sub6.anInt2874,
						 class67_sub6.anInt2892,
						 class67_sub6.anInt2891);
		    class67_sub6.anInt2883 = -1;
		    if (((class67_sub6.anInt2889 ^ 0xffffffff)
			 == (class67_sub6.anInt2888 ^ 0xffffffff))
			&& class67_sub6.anInt2888 == -1)
			class67_sub6.method606((byte) -118);
		    else if (((class67_sub6.anInt2888 ^ 0xffffffff)
			      == (class67_sub6.anInt2889 ^ 0xffffffff))
			     && (class67_sub6.anInt2892
				 == class67_sub6.anInt2879)
			     && (class67_sub6.anInt2880
				 == class67_sub6.anInt2881))
			class67_sub6.method606((byte) -118);
		}
	    } else if ((class67_sub6.anInt2888 ^ 0xffffffff) > -1
		       || Class12.method150(class67_sub6.anInt2888, 69,
					    class67_sub6.anInt2881)) {
		Class67_Sub1_Sub20.method715(class67_sub6.anInt2881,
					     class67_sub6.anInt2871,
					     class67_sub6.anInt2888,
					     (byte) -44,
					     class67_sub6.anInt2877,
					     class67_sub6.anInt2874,
					     class67_sub6.anInt2879,
					     class67_sub6.anInt2891);
		class67_sub6.method606((byte) -118);
	    }
	}
	if (arg0 >= -102)
	    aRSString_4168 = null;
    }
    
    static {
	loginStep = 0;
	aRSString_4168
	    = Class134.method1914("Update)2Liste geladen)3", (byte) 30);
	anInt4165 = 0;
    }
}
