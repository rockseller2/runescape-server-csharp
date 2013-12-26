/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class109
{
    public static int anInt2085;
    public static int anInt2086 = 0;
    public static int anInt2087;
    public static int anInt2088;
    public static RSString aRSString_2089
	= Class134.method1914("hint_headicons", (byte) 28);
    public static int[] anIntArray2090;
    public static int anInt2091;
    public static short[] aShortArray2092;
    
    public static void method1578(Class9 arg0, Class9 arg1, byte arg2) {
	try {
	    if (arg2 != -6)
		method1580(108, -86, -105, -124, -1);
	    Class67_Sub1_Sub17.aClass9_4091 = arg0;
	    anInt2085++;
	    Class67_Sub1_Sub8.aClass9_3923 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class67_Sub1_Sub21.method718(runtimeexception,
					       ("rc.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1579(int arg0) {
	anInt2087++;
	if (Class67_Sub5_Sub9.aClass28_4616 != null)
	    Class67_Sub5_Sub9.aClass28_4616.method270(arg0 ^ 0x63);
	if (Class78.aClass28_1606 != null)
	    Class78.aClass28_1606.method270(80);
	Class85.method1450(2, arg0 ^ 0x47, Class105.aBoolean2044, 22050);
	Class67_Sub5_Sub9.aClass28_4616
	    = Class67_Sub5_Sub8.method886(22050, Class124.aSignLink_2335, 0,
					  -9634,
					  Class67_Sub5_Sub12.aCanvas4698);
	Class67_Sub5_Sub9.aClass28_4616
	    .method259(126, Class67_Sub23.aClass67_Sub11_Sub4_3205);
	Class78.aClass28_1606
	    = Class67_Sub5_Sub8.method886(2048, Class124.aSignLink_2335, arg0,
					  -9634,
					  Class67_Sub5_Sub12.aCanvas4698);
	Class78.aClass28_1606
	    .method259(arg0 + 11, Class67_Sub1_Sub20.aClass67_Sub11_Sub1_4145);
    }
    
    public static void method1580(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	Class67_Sub8 class67_sub8
	    = ((Class67_Sub8)
	       Class86.aClass92_1755.method1489((byte) -15, (long) arg1));
	anInt2088++;
	if (class67_sub8 == null) {
	    class67_sub8 = new Class67_Sub8();
	    Class86.aClass92_1755.method1488((byte) -89, class67_sub8,
					     (long) arg1);
	}
	int i = 48 % ((-5 - arg2) / 47);
	if (arg4 >= class67_sub8.anIntArray2965.length) {
	    int[] is = new int[1 + arg4];
	    int[] is_0_ = new int[1 + arg4];
	    for (int i_1_ = 0; i_1_ < class67_sub8.anIntArray2965.length;
		 i_1_++) {
		is[i_1_] = class67_sub8.anIntArray2965[i_1_];
		is_0_[i_1_] = class67_sub8.anIntArray2961[i_1_];
	    }
	    for (int i_2_ = class67_sub8.anIntArray2965.length;
		 (i_2_ ^ 0xffffffff) > (arg4 ^ 0xffffffff); i_2_++) {
		is[i_2_] = -1;
		is_0_[i_2_] = 0;
	    }
	    class67_sub8.anIntArray2961 = is_0_;
	    class67_sub8.anIntArray2965 = is;
	}
	class67_sub8.anIntArray2965[arg4] = arg0;
	class67_sub8.anIntArray2961[arg4] = arg3;
    }
    
    public static void method1581(int arg0) {
	anIntArray2090 = null;
	aShortArray2092 = null;
	if (arg0 != 22050)
	    aShortArray2092 = null;
	aRSString_2089 = null;
    }
}
