/* Class67_Sub5_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub9 extends Class67_Sub5
{
    public static int anInt4598;
    public RSString[] aRSStringArray4599;
    public static short[][] aShortArrayArray4600;
    public int[] anIntArray4601;
    public int anInt4602;
    public int[] anIntArray4603;
    public static Class7 aClass7_4604;
    public static int anInt4605;
    public int anInt4606;
    public RSString aRSString_4607;
    public int anInt4608;
    public static boolean[] aBooleanArray4609 = new boolean[200];
    public static int anInt4610;
    public Class92[] aClass92Array4611;
    public static Class136 aClass136_4612;
    public static int anInt4613;
    public static boolean aBoolean4614;
    public int anInt4615;
    public static Class28 aClass28_4616;
    public static RSString[] aRSStringArray4617 = new RSString[100];
    public static int anInt4618;
    public static RSString aRSString_4619;
    public static Class7 aClass7_4620;
    
    public static void method896(int arg0) {
	aRSStringArray4617 = null;
	aBooleanArray4609 = null;
	if (arg0 != -1)
	    aClass136_4612 = null;
	aClass7_4620 = null;
	aRSString_4619 = null;
	aClass7_4604 = null;
	aClass28_4616 = null;
	aShortArrayArray4600 = null;
	aClass136_4612 = null;
    }
    
    public static int method897(byte arg0, int arg1, int arg2) {
	anInt4605++;
	if (arg0 != 108)
	    return 111;
	int i = arg1 >> -1821099969 & arg2 + -1;
	return i + (arg1 - -(arg1 >>> -1668596065)) % arg2;
    }
    
    public static void method898(int arg0) {
	anInt4613++;
	if (arg0 > 53)
	    Class67_Sub1_Sub9.aClass136_3934.method1922(0);
    }
    
    public static void method899(int arg0, int arg1) {
	Class57.aClass136_1108.method1920(arg0, 101);
	int i = 115 / ((26 - arg1) / 58);
	anInt4598++;
	Class67_Sub5_Sub11.aClass136_4669.method1920(arg0, 108);
    }
    
    public static void method900(int arg0, int arg1, byte arg2,
				 Class131_Sub7_Sub1 arg3) {
	if (arg1 == arg3.anInt3735 && (arg1 ^ 0xffffffff) != 0) {
	    Class41 class41 = Class120.method1666(arg1, arg2 ^ 0x5e);
	    int i = class41.anInt850;
	    if ((i ^ 0xffffffff) == -2) {
		arg3.anInt3792 = arg0;
		arg3.anInt3783 = 0;
		arg3.anInt3704 = 1;
		arg3.anInt3741 = 0;
		arg3.anInt3791 = 0;
		OutputStream_Sub1.method58(class41, arg3.anInt3726, -118,
					   arg3.anInt3733, false,
					   arg3.anInt3783);
	    }
	    if (i == 2)
		arg3.anInt3791 = 0;
	} else if (arg1 == -1 || arg3.anInt3735 == -1
		   || (Class120.method1666(arg1, -32).anInt856
		       >= Class120.method1666(arg3.anInt3735, -32).anInt856)) {
	    arg3.anInt3783 = 0;
	    arg3.anInt3741 = 0;
	    arg3.anInt3791 = 0;
	    arg3.anInt3735 = arg1;
	    arg3.anInt3704 = 1;
	    arg3.anInt3727 = arg3.anInt3713;
	    arg3.anInt3792 = arg0;
	    if (arg3.anInt3735 != -1)
		OutputStream_Sub1.method58(Class120.method1666(arg3.anInt3735,
							       -32),
					   arg3.anInt3726, arg2 ^ 0x3a,
					   arg3.anInt3733, false,
					   arg3.anInt3783);
	}
	if (arg2 != -66)
	    method896(-124);
	anInt4618++;
    }
    
    static {
	anInt4610 = 0;
	aBoolean4614 = true;
	aClass136_4612 = new Class136(30);
	aClass7_4620 = null;
	aRSString_4619
	    = Class134.method1914(" de votre liste d(Wamis)3", (byte) 99);
    }
}
