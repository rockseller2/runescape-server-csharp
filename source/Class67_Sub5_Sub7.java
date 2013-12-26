/* Class67_Sub5_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub7 extends Class67_Sub5
{
    public static int anInt4561;
    public static int anInt4562 = 20;
    public static int anInt4563;
    public static int[] anIntArray4564;
    public Class97[] aClass97Array4565;
    public static int anInt4566;
    public static int[] anIntArray4567 = new int[5];
    public static int anInt4568;
    public static int anInt4569;
    public static int anInt4570;
    
    public static void method873(int arg0, int arg1, int arg2, byte arg3,
				 Class7[] arg4, boolean arg5) {
	anInt4561++;
	if (arg3 != 100)
	    method875((byte) -112);
	for (int i = 0; (i ^ 0xffffffff) > (arg4.length ^ 0xffffffff); i++) {
	    Class7 class7 = arg4[i];
	    if (class7 != null && arg2 == class7.anInt174) {
		Class67_Sub1_Sub16_Sub1.method696(class7, arg0, arg5, arg1, 2);
		Class67_Sub5_Sub6.method872(class7, (byte) -116, arg0, arg1);
		if (-class7.anInt189 + class7.anInt328 < class7.anInt272)
		    class7.anInt272 = -class7.anInt189 + class7.anInt328;
		if ((class7.anInt291 ^ 0xffffffff)
		    < (class7.anInt222 - class7.anInt194 ^ 0xffffffff))
		    class7.anInt291 = -class7.anInt194 + class7.anInt222;
		if ((class7.anInt291 ^ 0xffffffff) > -1)
		    class7.anInt291 = 0;
		if (class7.anInt272 < 0)
		    class7.anInt272 = 0;
		if (class7.anInt227 == 0)
		    Class67_Sub17.method1247(arg5, class7, 68);
	    }
	}
    }
    
    public static void method874(Class9 arg0, Class9 arg1, int arg2,
				 Class9 arg3) {
	try {
	    anInt4568++;
	    int i = 127 % ((arg2 - -67) / 38);
	    Class133.aClass9_2449 = arg1;
	    Class67_Sub11_Sub2.aClass9_4863 = arg3;
	    Class5.aClass9_141 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718
		      (runtimeexception,
		       ("hf.A(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public static void method875(byte arg0) {
	if (arg0 >= -84)
	    anIntArray4567 = null;
	anIntArray4564 = null;
	anIntArray4567 = null;
    }
    
    public boolean method876(int arg0, int arg1) {
	if (arg0 != 1)
	    anInt4562 = -45;
	anInt4566++;
	return aClass97Array4565[arg1].aBoolean1937;
    }
    
    public static void method877(byte arg0, int arg1, int arg2) {
	Class67_Sub5_Sub3 class67_sub5_sub3
	    = Class103.method1558(arg2, false, 12);
	class67_sub5_sub3.method846(true);
	class67_sub5_sub3.anInt4491 = arg1;
	int i = 127 / ((-14 - arg0) / 63);
	anInt4563++;
    }
    
    public boolean method878(byte arg0, int arg1) {
	anInt4570++;
	int i = -96 / ((arg0 - 45) / 34);
	return aClass97Array4565[arg1].aBoolean1930;
    }
    
    public Class67_Sub5_Sub7(Class9 arg0, Class9 arg1, int arg2,
			     boolean arg3) {
	try {
	    Class50 class50 = new Class50();
	    int i = arg0.method135(arg2, -100);
	    aClass97Array4565 = new Class97[i];
	    int[] is = arg0.method131(arg2, (byte) 77);
	    for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
		byte[] is_1_ = arg0.method138(-809612665, is[i_0_], arg2);
		Class67_Sub20 class67_sub20 = null;
		int i_2_ = (0xff & is_1_[0]) << -1256674200 | 0xff & is_1_[1];
		for (Class67_Sub20 class67_sub20_3_
			 = (Class67_Sub20) class50.method445(0);
		     class67_sub20_3_ != null;
		     class67_sub20_3_ = (Class67_Sub20) class50.method432(0)) {
		    if ((class67_sub20_3_.anInt3166 ^ 0xffffffff)
			== (i_2_ ^ 0xffffffff)) {
			class67_sub20 = class67_sub20_3_;
			break;
		    }
		}
		if (class67_sub20 == null) {
		    byte[] is_4_;
		    if (!arg3)
			is_4_ = arg1.method136(i_2_, 0, (byte) 101);
		    else
			is_4_ = arg1.method136(0, i_2_, (byte) -39);
		    class67_sub20 = new Class67_Sub20(i_2_, is_4_);
		    class50.method436(class67_sub20, false);
		}
		aClass97Array4565[is[i_0_]]
		    = new Class97(is_1_, class67_sub20);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("hf.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
}
