/* Class67_Sub1_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub26 extends Class67_Sub1
{
    public static int anInt4228;
    public int anInt4229 = 4096;
    public static RSString aRSString_4230;
    public static int anInt4231;
    public static Class67_Sub15 aClass67_Sub15_4232;
    public static int anInt4233;
    public static int anInt4234;
    public static RSString aRSString_4235
	= Class134.method1914("Created gameworld", (byte) 52);
    public static short aShort4236;
    
    public static void method740(int arg0, double arg1) {
	if (Class67_Sub30.aDouble3361 != arg1) {
	    for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
		int i_0_ = (int) (Math.pow((double) i / 255.0, arg1) * 255.0);
		Class75.anIntArray2713[i] = i_0_ > 255 ? 255 : i_0_;
	    }
	    Class67_Sub30.aDouble3361 = arg1;
	}
	if (arg0 != 0)
	    aRSString_4230 = null;
	anInt4231++;
    }
    
    public static void method741(int arg0) {
	if (arg0 != 255)
	    method740(-40, 1.1815376649816978);
	aRSString_4235 = null;
	aRSString_4230 = null;
	aClass67_Sub15_4232 = null;
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4234++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607)
	    Class17.method184(is, 0, Class67_Sub5_Sub7.anInt4569, anInt4229);
	if (arg1 != 55)
	    method742(-20, null, false);
	return is;
    }
    
    public static void method742(int arg0, Class7[] arg1, boolean arg2) {
	if (arg2 == false) {
	    for (int i = 0; i < arg1.length; i++) {
		Class7 class7 = arg1[i];
		if (class7 != null) {
		    if (class7.anInt227 == 0) {
			if (class7.aClass7Array228 != null)
			    method742(arg0, class7.aClass7Array228, arg2);
			Class67_Sub22 class67_sub22
			    = ((Class67_Sub22)
			       (Class67_Sub1_Sub33.aClass92_4325.method1489
				((byte) -86, (long) class7.anInt301)));
			if (class67_sub22 != null)
			    Class67_Sub1_Sub3.method634((byte) 9,
							(class67_sub22
							 .anInt3185),
							arg0);
		    }
		    if (arg0 == 0 && class7.anObjectArray308 != null) {
			Class67_Sub30 class67_sub30 = new Class67_Sub30();
			class67_sub30.anObjectArray3356
			    = class7.anObjectArray308;
			class67_sub30.aClass7_3352 = class7;
			Class81.method1429(class67_sub30, 90);
		    }
		    if ((arg0 ^ 0xffffffff) == -2
			&& class7.anObjectArray265 != null) {
			if (class7.anInt266 >= 0) {
			    Class7 class7_1_
				= Class3.method69((byte) 110, class7.anInt301);
			    if (class7_1_ == null
				|| class7_1_.aClass7Array228 == null
				|| ((class7_1_.aClass7Array228.length
				     ^ 0xffffffff)
				    >= (class7.anInt266 ^ 0xffffffff))
				|| (class7_1_.aClass7Array228[class7.anInt266]
				    != class7))
				continue;
			}
			Class67_Sub30 class67_sub30 = new Class67_Sub30();
			class67_sub30.anObjectArray3356
			    = class7.anObjectArray265;
			class67_sub30.aClass7_3352 = class7;
			Class81.method1429(class67_sub30, 63);
		    }
		}
	    }
	    anInt4233++;
	}
    }
    
    public Class67_Sub1_Sub26(int arg0) {
	super(0, true);
	anInt4229 = arg0;
    }
    
    public Class67_Sub1_Sub26() {
	this(4096);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	if (arg1 == true) {
	    int i = arg2;
	    if (i == 0)
		anInt4229 = (arg0.readByte((byte) -109) << 1682530956) / 255;
	    anInt4228++;
	}
    }
    
    static {
	aRSString_4230 = aRSString_4235;
	aClass67_Sub15_4232 = new Class67_Sub15(0, 0);
	aShort4236 = (short) 32767;
    }
}
