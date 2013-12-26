/* Class67_Sub1_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub11 extends Class67_Sub1
{
    public static RSString aRSString_3984
	= Class134.method1914("::fpson", (byte) 98);
    public static int anInt3985;
    public static RSString aRSString_3986
	= Class134.method1914("<col=ff3000>", (byte) 63);
    public static int anInt3987;
    public static int anInt3988;
    public static int anInt3989;
    public static int anInt3990 = 0;
    public static int anInt3991;
    public static int anInt3992;
    
    public Class67_Sub1_Sub11() {
	super(1, true);
    }
    
    public static void method664(Class9 arg0, byte arg1) {
	Class67_Sub10.aClass9_3016 = arg0;
	anInt3985++;
	Class67_Sub5_Sub2.anInt4473
	    = Class67_Sub10.aClass9_3016.method135(4, 102);
	int i = 113 / ((arg1 - -7) / 44);
    }
    
    public int[] method611(int arg0, byte arg1) {
	int[] is = aClass144_2836.method1961(arg0, true);
	if (arg1 != 55)
	    aRSString_3986 = null;
	anInt3987++;
	if (aClass144_2836.aBoolean2607) {
	    int[][] is_0_ = this.method609(arg0, false, 0);
	    int[] is_1_ = is_0_[0];
	    int[] is_2_ = is_0_[1];
	    int[] is_3_ = is_0_[2];
	    for (int i = 0; i < Class67_Sub5_Sub7.anInt4569; i++)
		is[i] = (is_3_[i] + (is_1_[i] + is_2_[i])) / 3;
	}
	return is;
    }
    
    public static void method665(int arg0, int arg1, int[] arg2, int arg3,
				 int arg4) {
	int i = -7 + --arg3;
	arg1--;
	anInt3989++;
	while (arg1 < i) {
	    arg2[++arg1] = arg4;
	    arg2[++arg1] = arg4;
	    arg2[++arg1] = arg4;
	    arg2[++arg1] = arg4;
	    arg2[++arg1] = arg4;
	    arg2[++arg1] = arg4;
	    arg2[++arg1] = arg4;
	    arg2[++arg1] = arg4;
	}
	while (arg3 > arg1)
	    arg2[++arg1] = arg4;
	if (arg0 != 2)
	    method666(-86);
    }
    
    public static void method666(int arg0) {
	Class67_Sub22 class67_sub22
	    = ((Class67_Sub22)
	       Class67_Sub1_Sub33.aClass92_4325.method1483((byte) 29));
	if (arg0 != 1)
	    aRSString_3984 = null;
	for (/**/; class67_sub22 != null;
	     class67_sub22 = (Class67_Sub22) Class67_Sub1_Sub33
						 .aClass92_4325
						 .method1480(11)) {
	    int i = class67_sub22.anInt3185;
	    if (Class67_Sub5_Sub15.method977(i, false)) {
		boolean bool = true;
		Class7[] class7s = Class67_Sub1_Sub5.aClass7ArrayArray3878[i];
		for (int i_4_ = 0;
		     (class7s.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
		     i_4_++) {
		    if (class7s[i_4_] != null) {
			bool = class7s[i_4_].aBoolean185;
			break;
		    }
		}
		if (!bool) {
		    int i_5_ = (int) class67_sub22.aLong1344;
		    Class7 class7 = Class3.method69((byte) 110, i_5_);
		    if (class7 != null)
			Class37.method326(class7, 88);
		}
	    }
	}
	anInt3988++;
    }
    
    public static void method667(int arg0) {
	aRSString_3986 = null;
	aRSString_3984 = null;
	if (arg0 < 41)
	    method664(null, (byte) 99);
    }
}
