/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class6
{
    public static int[][][] anIntArrayArrayArray148;
    public static int anInt149;
    public static RSString aRSString_150 = Class134.method1914(" ", (byte) 18);
    public static int anInt151 = 0;
    public static int anInt152;
    public static int anInt153;
    public static Class133 aClass133_154 = new Class133();
    public static int anInt155;
    public static Class7 aClass7_156;
    public static boolean aBoolean157 = true;
    public static Class67_Sub5_Sub19 aClass67_Sub5_Sub19_158;
    public static RSString aRSString_159;
    public static RSString aRSString_160
	= Class134.method1914(")4a=", (byte) 94);
    
    public static void method79(int arg0, int arg1) {
	anInt155++;
	if (arg1 != 0)
	    aClass133_154 = null;
	Class67_Sub10.aClass136_3015.method1920(arg0, arg1 + 119);
    }
    
    public static Class131_Sub6 method80(int arg0, int arg1, int arg2,
					 int arg3, Class131_Sub6 arg4,
					 int arg5, int arg6) {
	long l = (long) arg3;
	anInt149++;
	Class131_Sub6 class131_sub6
	    = (Class131_Sub6) Class122.aClass136_2303.method1924(l, false);
	if (class131_sub6 == null) {
	    Class131_Sub2 class131_sub2
		= Class131_Sub2.method1780(Class114.aClass9_2158, arg3, 0);
	    if (class131_sub2 == null)
		return null;
	    class131_sub6 = class131_sub2.method1787(64, 768, -50, -10, -50);
	    Class122.aClass136_2303.method1926(l, class131_sub6, (byte) -71);
	}
	int i = arg4.method1831();
	int i_0_ = arg4.method1830();
	int i_1_ = arg4.method1846();
	int i_2_ = arg4.method1852();
	class131_sub6 = class131_sub6.method1833(true, true, true);
	if (arg0 != 0)
	    class131_sub6.method1855(arg0);
	int i_3_ = 34 % ((arg2 - -50) / 37);
	Class131_Sub6_Sub1 class131_sub6_sub1
	    = (Class131_Sub6_Sub1) class131_sub6;
	if (((arg5 ^ 0xffffffff)
	     != (Class131_Sub5.method1826(Canvas_Sub1.anInt59, arg6 - -i,
					  i_1_ + arg1, (byte) 99)
		 ^ 0xffffffff))
	    || ((arg5 ^ 0xffffffff)
		!= (Class131_Sub5.method1826(Canvas_Sub1.anInt59, i_0_ + arg6,
					     i_2_ + arg1, (byte) -76)
		    ^ 0xffffffff))) {
	    for (int i_4_ = 0; class131_sub6_sub1.anInt4980 > i_4_; i_4_++)
		class131_sub6_sub1.anIntArray4967[i_4_]
		    += -arg5 + Class131_Sub5.method1826(Canvas_Sub1.anInt59,
							(class131_sub6_sub1
							 .anIntArray4997
							 [i_4_]) + arg6,
							(class131_sub6_sub1
							 .anIntArray4972
							 [i_4_]) - -arg1,
							(byte) 94);
	    class131_sub6_sub1.aBoolean4987 = false;
	}
	return class131_sub6;
    }
    
    public static void method81(byte arg0) {
	anInt152++;
	Class67_Sub1_Sub34.aClass136_4331.method1922(0);
	int i = -27 / ((-19 - arg0) / 61);
    }
    
    public static void method82(int arg0) {
	aRSString_160 = null;
	aClass7_156 = null;
	aRSString_150 = null;
	if (arg0 != -11725)
	    method80(-97, -31, -105, -60, null, 45, 39);
	aClass67_Sub5_Sub19_158 = null;
	aRSString_159 = null;
	anIntArrayArrayArray148 = null;
	aClass133_154 = null;
    }
    
    static {
	aRSString_159 = Class134.method1914("Benutzen", (byte) 96);
    }
}
