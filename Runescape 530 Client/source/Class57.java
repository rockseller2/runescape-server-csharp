/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class57
{
    public static int anInt1103;
    public static int anInt1104;
    public static RSString aRSString_1105;
    public static boolean aBoolean1106 = false;
    public static Class9 aClass9_1107;
    public static Class136 aClass136_1108;
    public static RSString aRSString_1109 = Class134.method1914("l", (byte) 65);
    public static int anInt1110;
    public static int anInt1111;
    public static Sprites aSprite_1112;
    
    public static void method488(int arg0) {
	aClass136_1108 = null;
	if (arg0 != 2)
	    aClass136_1108 = null;
	aSprite_1112 = null;
	aClass9_1107 = null;
	aRSString_1109 = null;
	aRSString_1105 = null;
    }
    
    public static void method489(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	anInt1104++;
	int i = 0;
	int i_0_ = 0;
	int i_1_ = 0x7ff & -arg3 + 2048;
	int i_2_ = arg2;
	int i_3_ = 0x7ff & -arg5 + 2048;
	if (i_3_ != 0) {
	    int i_4_ = Class26.anIntArray612[i_3_];
	    int i_5_ = Class26.anIntArray617[i_3_];
	    i = i_5_ * -i_2_ >> -893134320;
	    i_2_ = i_2_ * i_4_ >> -140703888;
	}
	if (i_1_ != 0) {
	    int i_6_ = Class26.anIntArray617[i_1_];
	    int i_7_ = Class26.anIntArray612[i_1_];
	    i_0_ = i_6_ * i_2_ >> -938446448;
	    i_2_ = i_2_ * i_7_ >> -509025168;
	}
	if (arg1 < 7)
	    aRSString_1109 = null;
	Class86.anInt1760 = arg0 + -i;
	Class67_Sub23.anInt3196 = arg3;
	Class114.anInt2160 = arg4 + -i_0_;
	Class129.anInt2395 = arg7 - i_2_;
	Class67_Sub1_Sub2.anInt3839 = arg5;
    }
    
    public static boolean method490
	(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	anInt1103++;
	if (arg4 != -6)
	    method490(54, -18, 60, -124, (byte) -12, true, 79, 73, 86, 110, 17,
		      105);
	if (Class122.aClass131_Sub7_Sub2_2309.method1887((byte) -50) != 2) {
	    if ((Class122.aClass131_Sub7_Sub2_2309.method1887((byte) -120)
		 ^ 0xffffffff)
		< -3)
		return Class67_Sub27.method1304(arg1, arg11, arg5, arg9, arg3,
						Class122
						    .aClass131_Sub7_Sub2_2309
						    .method1887((byte) -24),
						arg7, arg8, arg10, arg0, arg2,
						arg6, (byte) 123);
	} else
	    return Class78.method1411(arg5, arg8, arg4 + -5, arg9, arg2, arg0,
				      arg11, arg1, arg6, arg3, arg10, arg7);
	return Class87.method1464(arg10, arg3, arg1, arg7, arg0, arg5, arg8,
				  arg6, arg2, (byte) 4, arg11, arg9);
    }
    
    static {
	aRSString_1105
	    = Class134.method1914("Memory after cleanup=", (byte) 13);
	aClass136_1108 = new Class136(64);
    }
}
