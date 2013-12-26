/* Class67_Sub5_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67_Sub5_Sub4_Sub2 extends Class67_Sub5_Sub4
{
    public static RSString aRSString_5122;
    public static RSString aRSString_5123 = Class134.method1914("_", (byte) 121);
    public static int anInt5124;
    public static int anInt5125;
    public int anInt5126;
    public static int anInt5127;
    public static int anInt5128;
    public Class20 aClass20_5129;
    public static int anInt5130;
    public static RSString aRSString_5131;
    public static boolean aBoolean5132;
    public byte[] aByteArray5133;
    public static int anInt5134;
    public static boolean aBoolean5135;
    
    public byte[] method853(int arg0) {
	anInt5125++;
	if (aBoolean4506)
	    throw new RuntimeException();
	if (arg0 != 0)
	    method859(69, null, 123, -64);
	return aByteArray5133;
    }
    
    public static void method858(int arg0, int arg1, int arg2, int arg3,
				 byte arg4, int arg5) {
	int i = Class7.method97(arg1, OutputStream_Sub1.anInt87,
				Class55_Sub2.anInt2801, arg4 + 65472);
	int i_0_ = Class7.method97(arg3, OutputStream_Sub1.anInt87,
				   Class55_Sub2.anInt2801, 65535);
	if (arg4 != 63)
	    aRSString_5123 = null;
	int i_1_ = Class7.method97(arg0, Class126_Sub1.anInt3423,
				   Class139.anInt2533, arg4 ^ 0xffc0);
	anInt5127++;
	int i_2_ = Class7.method97(arg2, Class126_Sub1.anInt3423,
				   Class139.anInt2533, arg4 + 65472);
	for (int i_3_ = i; (i_3_ ^ 0xffffffff) >= (i_0_ ^ 0xffffffff); i_3_++)
	    Class67_Sub1_Sub11.method665(2, i_1_,
					 (Class67_Sub29.anIntArrayArray3338
					  [i_3_]),
					 i_2_, arg5);
    }
    
    public int method849(byte arg0) {
	anInt5134++;
	if (arg0 != -52)
	    aClass20_5129 = null;
	if (aBoolean4506)
	    return 0;
	return 100;
    }
    
    public static Class119_Sub1 method859(int arg0, Class9 arg1, int arg2,
					  int arg3) {
	anInt5130++;
	if (!Class64.method575((byte) -72, arg2, arg0, arg1))
	    return null;
	if (arg3 != 3576)
	    aRSString_5123 = null;
	return Class133.method1907(0);
    }
    
    public static RSString method860(int arg0, boolean arg1) {
	if (arg1 != true)
	    method862(16, 114, 91, 99, 86, null, null, null, null, null, null,
		      2, (byte) -75, -109, -30);
	anInt5124++;
	return (Class67_Sub1_Sub27.method744
		((new RSString[]
		  { InputStream_Sub1.method47(0xff & arg0 >> 1300321944, true),
		    Class67_Sub1_Sub12.aRSString_3997,
		    InputStream_Sub1.method47(arg0 >> -688973008 & 0xff, true),
		    Class67_Sub1_Sub12.aRSString_3997,
		    InputStream_Sub1.method47(arg0 >> 1172582248 & 0xff, true),
		    Class67_Sub1_Sub12.aRSString_3997,
		    InputStream_Sub1.method47(0xff & arg0, arg1) }),
		 -112));
    }
    
    public static void method861(int arg0) {
	aRSString_5122 = null;
	if (arg0 >= -24)
	    aRSString_5123 = null;
	aRSString_5123 = null;
	aRSString_5131 = null;
    }
    
    public static void method862
	(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5,
	 int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10,
	 int arg11, byte arg12, int arg13, int arg14) {
	if (arg0 < 0)
	    arg0 = 0;
	else if (arg0 >= Class67_Sub27.anInt3301 * 128)
	    arg0 = Class67_Sub27.anInt3301 * 128 - 1;
	if (arg2 < 0)
	    arg2 = 0;
	else if (arg2 >= Class67_Sub5_Sub16.anInt4782 * 128)
	    arg2 = Class67_Sub5_Sub16.anInt4782 * 128 - 1;
	Class120.anInt2274 = Class26.anIntArray617[arg3];
	Class106.anInt2054 = Class26.anIntArray612[arg3];
	Class139.anInt2530 = Class26.anIntArray617[arg4];
	Class102.anInt2007 = Class26.anIntArray612[arg4];
	Class67_Sub16.anInt3080 = arg0;
	Class34.anInt747 = arg1;
	PacketParser.anInt2120 = arg2;
	Class67_Sub1_Sub9.anInt3941 = arg0 / 128;
	Class67_Sub1_Sub7.anInt3905 = arg2 / 128;
	Class55_Sub2.anInt2806
	    = Class67_Sub1_Sub9.anInt3941 - Class67_Sub1.anInt2822;
	if (Class55_Sub2.anInt2806 < 0)
	    Class55_Sub2.anInt2806 = 0;
	Class67_Sub5_Sub13.anInt4711
	    = Class67_Sub1_Sub7.anInt3905 - Class67_Sub1.anInt2822;
	if (Class67_Sub5_Sub13.anInt4711 < 0)
	    Class67_Sub5_Sub13.anInt4711 = 0;
	Class80.anInt1627
	    = Class67_Sub1_Sub9.anInt3941 + Class67_Sub1.anInt2822;
	if (Class80.anInt1627 > Class67_Sub27.anInt3301)
	    Class80.anInt1627 = Class67_Sub27.anInt3301;
	Class69.anInt1389
	    = Class67_Sub1_Sub7.anInt3905 + Class67_Sub1.anInt2822;
	if (Class69.anInt1389 > Class67_Sub5_Sub16.anInt4782)
	    Class69.anInt1389 = Class67_Sub5_Sub16.anInt4782;
	int i = 3500;
	for (int i_4_ = 0;
	     i_4_ < Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822 + 2;
	     i_4_++) {
	    for (int i_5_ = 0;
		 i_5_ < Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822 + 2;
		 i_5_++) {
		int i_6_ = ((i_4_ - Class67_Sub1.anInt2822 << 7)
			    - (Class67_Sub16.anInt3080 & 0x7f));
		int i_7_ = ((i_5_ - Class67_Sub1.anInt2822 << 7)
			    - (PacketParser.anInt2120 & 0x7f));
		int i_8_ = (Class67_Sub1_Sub9.anInt3941
			    - Class67_Sub1.anInt2822 + i_4_);
		int i_9_ = (Class67_Sub1_Sub7.anInt3905
			    - Class67_Sub1.anInt2822 + i_5_);
		if (i_8_ >= 0 && i_9_ >= 0 && i_8_ < Class67_Sub27.anInt3301
		    && i_9_ < Class67_Sub5_Sub16.anInt4782) {
		    int i_10_;
		    if (Class67_Sub1_Sub17.anIntArrayArrayArray4096 != null)
			i_10_ = (Class67_Sub1_Sub17.anIntArrayArrayArray4096[0]
				 [i_8_][i_9_]) - Class34.anInt747 + 128;
		    else
			i_10_ = (InputStream_Sub1.anIntArrayArrayArray75[0]
				 [i_8_][i_9_]) - Class34.anInt747 + 128;
		    int i_11_ = ((InputStream_Sub1.anIntArrayArrayArray75[3]
				  [i_8_][i_9_])
				 - Class34.anInt747 - 1000);
		    client.aBooleanArrayArray2739[i_4_][i_5_]
			= Class105.method1568(i_6_, i_11_, i_10_, i_7_, i);
		} else
		    client.aBooleanArrayArray2739[i_4_][i_5_] = false;
	    }
	}
	for (int i_12_ = 0;
	     i_12_ < Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822 + 1;
	     i_12_++) {
	    for (int i_13_ = 0;
		 i_13_ < Class67_Sub1.anInt2822 + Class67_Sub1.anInt2822 + 1;
		 i_13_++)
		Class124.aBooleanArrayArray2332[i_12_][i_13_]
		    = (client.aBooleanArrayArray2739[i_12_][i_13_]
		       || client.aBooleanArrayArray2739[i_12_ + 1][i_13_]
		       || client.aBooleanArrayArray2739[i_12_][i_13_ + 1]
		       || client.aBooleanArrayArray2739[i_12_ + 1][i_13_ + 1]);
	}
	Class55_Sub2_Sub1.anIntArray3798 = arg6;
	Class67_Sub5_Sub7.anIntArray4564 = arg7;
	Class41.anIntArray857 = arg8;
	Class7.anIntArray259 = arg9;
	Class113.anIntArray2137 = arg10;
	Class73.method1369();
	if (Class67_Sub1_Sub34.aClass67_Sub24ArrayArrayArray4334 != null) {
	    Class140.method1945(true);
	    Class3.method72(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
	    Class140.method1945(false);
	}
	Class3.method72(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
    
    public static void method863(byte arg0) {
	anInt5128++;
	if (arg0 != 46)
	    method859(97, null, 31, -24);
	Class44.aClass136_909.method1922(0);
	Class67_Sub24.aClass136_3234.method1922(arg0 + -46);
	Class96_Sub1.aClass136_3381.method1922(0);
    }
    
    static {
	aRSString_5122 = Class134.method1914("::tele ", (byte) 124);
	aRSString_5131
	    = Class134.method1914("Regarder dans cette direction", (byte) 28);
	aBoolean5132 = true;
	aBoolean5135 = false;
    }
}
