/* Class67_Sub1_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub1_Sub32 extends Class67_Sub1
{
    public static int anInt4296;
    public static Class9 aClass9_4297;
    public static RSString aRSString_4298;
    public static int[] anIntArray4299;
    public static RSString aRSString_4300;
    public static RSString aRSString_4301
	= Class134.method1914("Wordpack geladen)3", (byte) 69);
    public int anInt4302 = 4096;
    public static int anInt4303;
    public static RSString aRSString_4304;
    public static int anInt4305;
    public static RSString aRSString_4306;
    public static short[] aShortArray4307;
    public static int anInt4308;
    public static int anInt4309;
    public int anInt4310 = 0;
    public static int anInt4311;
    public static RSString aRSString_4312;
    
    public static void method767(int arg0, int arg1, int arg2) {
	anInt4305++;
	Class33.anInt732 = -Class100.anInt1968 + arg2;
	int i
	    = Class33.anInt732 + -(int) ((float) Class86.aClass7_1759.anInt189
					 / Class54.aFloat1075);
	Class67_Sub5_Sub16.anInt4776 = (-1 + (Class131_Sub5.anInt3656 - arg1)
					- -Class67_Sub1_Sub21.anInt4159);
	int i_0_ = (-(int) ((float) Class86.aClass7_1759.anInt194
			    / Class54.aFloat1075)
		    + Class67_Sub5_Sub16.anInt4776);
	int i_1_
	    = Class33.anInt732 - -(int) ((float) Class86.aClass7_1759.anInt189
					 / Class54.aFloat1075);
	if (i < 0)
	    Class33.anInt732 = (int) ((float) Class86.aClass7_1759.anInt189
				      / Class54.aFloat1075);
	if ((Class67_Sub1_Sub13.anInt4031 ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
	    Class33.anInt732
		= -(int) ((float) Class86.aClass7_1759.anInt189
			  / Class54.aFloat1075) + Class67_Sub1_Sub13.anInt4031;
	int i_2_ = ((int) ((float) Class86.aClass7_1759.anInt194
			   / Class54.aFloat1075)
		    + Class67_Sub5_Sub16.anInt4776);
	if (arg0 != -5402)
	    aRSString_4306 = null;
	if (i_0_ < 0)
	    Class67_Sub5_Sub16.anInt4776
		= (int) ((float) Class86.aClass7_1759.anInt194
			 / Class54.aFloat1075);
	if (i_2_ > Class131_Sub5.anInt3656)
	    Class67_Sub5_Sub16.anInt4776
		= (Class131_Sub5.anInt3656
		   - (int) ((float) Class86.aClass7_1759.anInt194
			    / Class54.aFloat1075));
    }
    
    public static void method768(int arg0) {
	aRSString_4298 = null;
	aRSString_4312 = null;
	aClass9_4297 = null;
	aShortArray4307 = null;
	aRSString_4306 = null;
	anIntArray4299 = null;
	if (arg0 != 1030194214)
	    aRSString_4304 = null;
	aRSString_4300 = null;
	aRSString_4301 = null;
	aRSString_4304 = null;
    }
    
    public int[] method611(int arg0, byte arg1) {
	anInt4309++;
	int[] is = aClass144_2836.method1961(arg0, true);
	if (aClass144_2836.aBoolean2607) {
	    int[] is_3_ = this.method613(0, arg0, false);
	    for (int i = 0;
		 (Class67_Sub5_Sub7.anInt4569 ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		int i_4_ = is_3_[i];
		is[i]
		    = anInt4310 <= i_4_ && ((anInt4302 ^ 0xffffffff)
					    <= (i_4_ ^ 0xffffffff)) ? 4096 : 0;
	    }
	}
	if (arg1 != 55)
	    method611(-59, (byte) -15);
	return is;
    }
    
    public static void method769(int arg0, int arg1, int arg2, int arg3) {
	anInt4311++;
	RSString RSString
	    = (Class67_Sub1_Sub27.method744
	       ((new RSString[]
		 { Class67_Sub5_Sub4_Sub2.aRSString_5122,
		   InputStream_Sub1.method47(arg2, true),
		   Class67_Sub6.aRSString_2882,
		   InputStream_Sub1.method47(arg0 >> 2074796454, true),
		   Class67_Sub6.aRSString_2882,
		   InputStream_Sub1.method47(arg1 >> 1030194214, true),
		   Class67_Sub6.aRSString_2882,
		   InputStream_Sub1.method47(0x3f & arg0, true),
		   Class67_Sub6.aRSString_2882,
		   InputStream_Sub1.method47(arg1 & 0x3f, true) }),
		-103));
	if (arg3 != 2074796454)
	    method769(83, 60, 67, -4);
	RSString.method535(0);
	Class131_Sub4.method1815(RSString, 12);
    }
    
    public Class67_Sub1_Sub32() {
	super(1, true);
    }
    
    public void method623(Stream arg0, boolean arg1, int arg2) {
	int i = arg2;
	do {
	    if (i != 0) {
		if ((i ^ 0xffffffff) != -2)
		    break;
	    } else {
		anInt4310 = arg0.readUShort(-2386);
		break;
	    }
	    anInt4302 = arg0.readUShort(-2386);
	} while (false);
	if (arg1 != true)
	    anInt4302 = 9;
	anInt4308++;
    }
    
    static {
	anIntArray4299 = new int[50];
	aShortArray4307 = new short[] { 960, 957, -21568, -21571, 22464 };
	aRSString_4304 = Class134.method1914("shake:", (byte) 30);
	aRSString_4300 = Class134.method1914("hitmarks", (byte) 28);
	aRSString_4306
	    = Class134.method1914("Lade Liste der Welten", (byte) 69);
	aRSString_4298 = aRSString_4304;
	aRSString_4312 = aRSString_4304;
    }
}
