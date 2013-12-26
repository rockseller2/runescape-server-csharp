/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1
{
    public static int anInt97;
    public static Class9 aClass9_98;
    public static int anInt99;
    public static int anInt100;
    public static int anInt101;
    public static int[] anIntArray102 = new int[256];
    public static int anInt103;
    public static int anInt104;
    
    public static boolean method61(boolean arg0) {
	anInt104++;
	try {
	    if (arg0 != false)
		aClass9_98 = null;
	    if (Class67_Sub11_Sub4.anInt4888 == 2) {
		if (Class106.aClass67_Sub4_2066 == null) {
		    Class106.aClass67_Sub4_2066
			= Class67_Sub4.method817((Class67_Sub1_Sub18
						  .aClass9_4111),
						 Class95.anInt1908,
						 Class19.anInt489);
		    if (Class106.aClass67_Sub4_2066 == null)
			return false;
		}
		if (Class9.aClass83_376 == null)
		    Class9.aClass83_376
			= new Class83(Class67_Sub1_Sub1.aClass9_3822,
				      RuntimeException_Sub1.aClass9_2622);
		if (Class136.aClass67_Sub11_Sub4_2485.method1209
		    (Class9.aClass83_376, 9, 22050, Class114.aClass9_2148,
		     Class106.aClass67_Sub4_2066)) {
		    Class136.aClass67_Sub11_Sub4_2485.method1184((byte) -109);
		    Class136.aClass67_Sub11_Sub4_2485
			.method1199(Class57.anInt1111, 52);
		    Class136.aClass67_Sub11_Sub4_2485.method1201
			(124, Class106.aClass67_Sub4_2066,
			 Class86.aBoolean1753);
		    Class67_Sub11_Sub4.anInt4888 = 0;
		    Class67_Sub1_Sub18.aClass9_4111 = null;
		    Class106.aClass67_Sub4_2066 = null;
		    Class9.aClass83_376 = null;
		    return true;
		}
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	    Class136.aClass67_Sub11_Sub4_2485.method1188(-118);
	    Class9.aClass83_376 = null;
	    Class67_Sub11_Sub4.anInt4888 = 0;
	    Class106.aClass67_Sub4_2066 = null;
	    Class67_Sub1_Sub18.aClass9_4111 = null;
	}
	return false;
    }
    
    public static void method62(byte arg0) {
	Class67_Sub1_Sub4.anInt3860++;
	Class70_Sub1.outStream.createFrame(2, 184); //CLOSE
	anInt99++;
	for (Class67_Sub22 class67_sub22
		 = ((Class67_Sub22)
		    Class67_Sub1_Sub33.aClass92_4325.method1483((byte) 33));
	     class67_sub22 != null;
	     class67_sub22 = (Class67_Sub22) Class67_Sub1_Sub33
						 .aClass92_4325
						 .method1480(11)) {
	    if ((class67_sub22.anInt3180 ^ 0xffffffff) == -1)
		Class67_Sub20.method1274(class67_sub22, true, 15361);
	}
	if (arg0 == 10) {
	    if (Class16.aClass7_470 != null) {
		Class37.method326(Class16.aClass7_470, 103);
		Class16.aClass7_470 = null;
	    }
	}
    }
    
    public static void method63(int arg0) {
	if (arg0 != 1)
	    anInt101 = 28;
	anIntArray102 = null;
	aClass9_98 = null;
    }
    
    public static void method64(int arg0, byte arg1, int arg2, int arg3,
				int arg4, int arg5) {
	anInt103++;
	int i = arg0 + -arg4;
	int i_0_ = arg3 - arg5;
	if (i_0_ != 0) {
	    if (i == 0) {
		Class9.method122(arg4, arg3, 28375, arg5, arg2);
		return;
	    }
	} else {
	    if (i != 0)
		Class67_Sub16.method1242(arg0, arg4, arg1 + -59, arg5, arg2);
	    return;
	}
	if (i_0_ < 0)
	    i_0_ = -i_0_;
	if (i < 0)
	    i = -i;
	boolean bool = i_0_ < i;
	if (bool) {
	    int i_1_ = arg5;
	    arg5 = arg4;
	    arg4 = i_1_;
	    int i_2_ = arg3;
	    arg3 = arg0;
	    arg0 = i_2_;
	}
	if (arg3 < arg5) {
	    int i_3_ = arg4;
	    int i_4_ = arg5;
	    arg5 = arg3;
	    arg3 = i_4_;
	    arg4 = arg0;
	    arg0 = i_3_;
	}
	if (arg1 == 67) {
	    int i_5_ = arg0 - arg4;
	    int i_6_ = arg4;
	    if (i_5_ < 0)
		i_5_ = -i_5_;
	    int i_7_ = -arg5 + arg3;
	    int i_8_ = -(i_7_ >> -1748833343);
	    int i_9_ = arg4 < arg0 ? 1 : -1;
	    if (bool) {
		for (int i_10_ = arg5; i_10_ <= arg3; i_10_++) {
		    Class67_Sub29.anIntArrayArray3338[i_10_][i_6_] = arg2;
		    i_8_ += i_5_;
		    if ((i_8_ ^ 0xffffffff) < -1) {
			i_8_ -= i_7_;
			i_6_ += i_9_;
		    }
		}
	    } else {
		for (int i_11_ = arg5;
		     (i_11_ ^ 0xffffffff) >= (arg3 ^ 0xffffffff); i_11_++) {
		    Class67_Sub29.anIntArrayArray3338[i_6_][i_11_] = arg2;
		    i_8_ += i_5_;
		    if ((i_8_ ^ 0xffffffff) < -1) {
			i_8_ -= i_7_;
			i_6_ += i_9_;
		    }
		}
	    }
	}
    }
    
    public static void method65(int arg0, int[] arg1, int arg2, int arg3,
				int[] arg4) {
	do {
	    try {
		if (arg0 == 1) {
		    anInt97++;
		    if (arg2 <= arg3)
			break;
		    int i = (arg3 - -arg2) / 2;
		    int i_12_ = arg3;
		    int i_13_ = arg1[i];
		    arg1[i] = arg1[arg2];
		    arg1[arg2] = i_13_;
		    int i_14_ = arg4[i];
		    arg4[i] = arg4[arg2];
		    arg4[arg2] = i_14_;
		    for (int i_15_ = arg3;
			 (arg2 ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
			if ((arg1[i_15_] ^ 0xffffffff)
			    < ((0x1 & i_15_) + i_13_ ^ 0xffffffff)) {
			    int i_16_ = arg1[i_15_];
			    arg1[i_15_] = arg1[i_12_];
			    arg1[i_12_] = i_16_;
			    int i_17_ = arg4[i_15_];
			    arg4[i_15_] = arg4[i_12_];
			    arg4[i_12_++] = i_17_;
			}
		    }
		    arg1[arg2] = arg1[i_12_];
		    arg1[i_12_] = i_13_;
		    arg4[arg2] = arg4[i_12_];
		    arg4[i_12_] = i_14_;
		    method65(1, arg1, i_12_ - 1, arg3, arg4);
		    method65(arg0, arg1, arg2, 1 + i_12_, arg4);
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class67_Sub1_Sub21.method718(runtimeexception,
						   ("a.B(" + arg0 + ','
						    + (arg1 != null ? "{...}"
						       : "null")
						    + ',' + arg2 + ',' + arg3
						    + ','
						    + (arg4 != null ? "{...}"
						       : "null")
						    + ')'));
	    }
	    break;
	} while (false);
    }
    
    static {
	for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
	    int i_18_ = i;
	    for (int i_19_ = 0; i_19_ < 8; i_19_++) {
		if ((0x1 & i_18_) == 1)
		    i_18_ = i_18_ >>> 2048219009 ^ ~0x12477cdf;
		else
		    i_18_ >>>= 1;
	    }
	    anIntArray102[i] = i_18_;
	}
    }
}
