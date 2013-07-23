/* Class67_Sub1_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub16_Sub1 extends Class67_Sub1_Sub16
{
    public static RSString aRSString_5089 = Class134.method1914(" ", (byte) 40);
    public static int anInt5090;
    public static int anInt5091;
    public static RSString[] aRSStringArray5092 = new RSString[200];
    public static int anInt5093;
    public static int anInt5094;
    public static boolean aBoolean5095;
    public static RSString aRSString_5096 = aRSString_5089;
    public static int anInt5097;
    public static int[] anIntArray5098;
    public static Class36[] aClass36Array5099;
    public static int anInt5100 = 7759444;
    public static int[] anIntArray5101;
    public static RSString aRSString_5102
	= Class134.method1914("null", (byte) 64);
    
    public static void method692(int arg0) {
	aRSString_5089 = null;
	if (arg0 == 115) {
	    anIntArray5098 = null;
	    aRSStringArray5092 = null;
	    aClass36Array5099 = null;
	    aRSString_5096 = null;
	    anIntArray5101 = null;
	    aRSString_5102 = null;
	}
    }
    
    public static int method693(int arg0, int arg1) {
	anInt5094++;
	if (arg1 != 23614)
	    aBoolean5095 = false;
	return arg0 >>> -1106214809;
    }
    
    public static boolean method694(int arg0, int arg1) {
	anInt5090++;
	if ((arg0 ^ 0xffffffff) <= -98 && (arg0 ^ 0xffffffff) >= -123)
	    return true;
	if (arg0 >= 65 && (arg0 ^ 0xffffffff) >= -91)
	    return true;
	if ((arg0 ^ 0xffffffff) <= -49 && (arg0 ^ 0xffffffff) >= -58)
	    return true;
	if (arg1 != 5)
	    anIntArray5098 = null;
	return false;
    }
    
    public static boolean method695(int arg0, int arg1, int arg2, int arg3,
				    Class131 arg4, int arg5, long arg6,
				    int arg7, int arg8, int arg9, int arg10) {
	if (arg4 == null)
	    return true;
	return Class12.method151(arg0, arg7, arg8, arg9 - arg7 + 1,
				 arg10 - arg8 + 1, arg1, arg2, arg3, arg4,
				 arg5, true, arg6);
    }
    
    public int[][] method624(boolean arg0, int arg1) {
	if (arg0 != true)
	    return null;
	int[][] is = aClass103_2830.method1551(arg1, 73);
	if (aClass103_2830.aBoolean2030 && this.method687(-21347)) {
	    int[] is_0_ = is[0];
	    int[] is_1_ = is[1];
	    int[] is_2_ = is[2];
	    int i = anInt4065 * (arg1 % anInt4065);
	    for (int i_3_ = 0; ((Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff)
				< (i_3_ ^ 0xffffffff)); i_3_++) {
		int i_4_ = anIntArray4089[i - -(i_3_ % anInt4088)];
		is_2_[i_3_] = Class75.method1379(i_4_ << -1014291004, 4080);
		is_1_[i_3_] = Class75.method1379(i_4_, 65280) >> -1424685180;
		is_0_[i_3_] = Class75.method1379(4080, i_4_ >> 1795152556);
	    }
	}
	anInt5091++;
	return is;
    }
    
    public static void method696(Class7 arg0, int arg1, boolean arg2, int arg3,
				 int arg4) {
	int i = arg0.anInt189;
	int i_5_ = arg0.anInt194;
	if (arg0.aByte168 != 0) {
	    if (arg0.aByte168 != 1) {
		if (arg0.aByte168 != 2) {
		    if ((arg0.aByte168 ^ 0xffffffff) == -4) {
			if ((arg0.anInt227 ^ 0xffffffff) == -3)
			    arg0.anInt194
				= 32 * arg0.anInt199 - -((-1 + arg0.anInt199)
							 * arg0.anInt213);
			else if (arg0.anInt227 == 7)
			    arg0.anInt194
				= (arg0.anInt199 * 12
				   - -(arg0.anInt213 * (arg0.anInt199 - 1)));
		    }
		} else
		    arg0.anInt194 = arg0.anInt199 * arg3 >> 1019397902;
	    } else
		arg0.anInt194 = -arg0.anInt199 + arg3;
	} else
	    arg0.anInt194 = arg0.anInt199;
	if ((arg0.aByte210 ^ 0xffffffff) == -1)
	    arg0.anInt189 = arg0.anInt193;
	else if (arg0.aByte210 != 1) {
	    if (arg0.aByte210 == 2)
		arg0.anInt189 = arg0.anInt193 * arg1 >> -1965671954;
	    else if (arg0.aByte210 == 3) {
		if (arg0.anInt227 != 2) {
		    if ((arg0.anInt227 ^ 0xffffffff) == -8)
			arg0.anInt189
			    = arg0.anInt193 * 115 - -(arg0.anInt326
						      * (-1 + arg0.anInt193));
		} else
		    arg0.anInt189 = (32 * arg0.anInt193
				     + (arg0.anInt193 - 1) * arg0.anInt326);
	    }
	} else
	    arg0.anInt189 = -arg0.anInt193 + arg1;
	if (arg0.aByte210 == 4)
	    arg0.anInt189 = arg0.anInt215 * arg0.anInt194 / arg0.anInt261;
	if ((arg0.aByte168 ^ 0xffffffff) == -5)
	    arg0.anInt194 = arg0.anInt261 * arg0.anInt189 / arg0.anInt215;
	if (Class128.aBoolean2377 && (client.method31(arg0).anInt3060 != 0
				      || (arg0.anInt227 ^ 0xffffffff) == -1)) {
	    if ((arg0.anInt194 ^ 0xffffffff) > -6
		&& (arg0.anInt189 ^ 0xffffffff) > -6) {
		arg0.anInt194 = 5;
		arg0.anInt189 = 5;
	    } else {
		if (arg0.anInt194 <= 0)
		    arg0.anInt194 = 5;
		if (arg0.anInt189 <= 0)
		    arg0.anInt189 = 5;
	    }
	}
	if (arg4 != 2)
	    method694(-94, -72);
	anInt5097++;
	if ((arg0.anInt287 ^ 0xffffffff) == -1338)
	    Class13.aClass7_436 = arg0;
	if (arg2 && arg0.anObjectArray273 != null
	    && (i != arg0.anInt189
		|| (arg0.anInt194 ^ 0xffffffff) != (i_5_ ^ 0xffffffff))) {
	    Class67_Sub30 class67_sub30 = new Class67_Sub30();
	    class67_sub30.aClass7_3352 = arg0;
	    class67_sub30.anObjectArray3356 = arg0.anObjectArray273;
	    Class67_Sub17.aClass50_3094.method436(class67_sub30, false);
	}
    }
    
    static {
	anIntArray5101 = new int[32];
	anInt5093 = 0;
    }
}
